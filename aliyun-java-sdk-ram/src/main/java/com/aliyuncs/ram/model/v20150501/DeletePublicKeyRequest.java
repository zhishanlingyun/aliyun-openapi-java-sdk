/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class DeletePublicKeyRequest extends RpcAcsRequest<DeletePublicKeyResponse> {
	
	public DeletePublicKeyRequest() {
		super("Ram", "2015-05-01", "DeletePublicKey", "ram");
		setProtocol(ProtocolType.HTTPS);
	}

	private String userPublicKeyId;

	private String userName;

	public String getUserPublicKeyId() {
		return this.userPublicKeyId;
	}

	public void setUserPublicKeyId(String userPublicKeyId) {
		this.userPublicKeyId = userPublicKeyId;
		if(userPublicKeyId != null){
			putQueryParameter("UserPublicKeyId", userPublicKeyId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<DeletePublicKeyResponse> getResponseClass() {
		return DeletePublicKeyResponse.class;
	}

}
