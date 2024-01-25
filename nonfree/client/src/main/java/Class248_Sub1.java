import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class248_Sub1 extends Class248 {

	@OriginalMember(owner = "client!oia", name = "e", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method6188(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method7789();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(30) String local30 = null;
			try {
				@Pc(33) Class local33 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(54) Method local54 = local33.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local54.setAccessible(true);
				@Pc(76) Object local76 = local54.invoke((Object) null, local24.getHostName(), Integer.valueOf(local24.getPort()));
				if (local76 != null) {
					@Pc(86) Method local86 = local33.getDeclaredMethod("supportsPreemptiveAuthorization");
					local86.setAccessible(true);
					if ((Boolean) local86.invoke(local76)) {
						@Pc(103) Method local103 = local33.getDeclaredMethod("getHeaderName");
						local103.setAccessible(true);
						@Pc(134) Method local134 = local33.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local134.setAccessible(true);
						@Pc(144) String local144 = (String) local103.invoke(local76);
						@Pc(172) String local172 = (String) local134.invoke(local76, new URL("https://" + this.aString105 + "/"), "https");
						local30 = local144 + ": " + local172;
					}
				}
			} catch (@Pc(185) Exception local185) {
			}
			return this.httpProxyConnect(local24.getHostName(), local24.getPort(), local30);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(202) Socket local202 = new Socket(arg0);
			local202.connect(new InetSocketAddress(this.aString105, this.anInt8927));
			return local202;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7790() throws IOException {
		@Pc(11) boolean local11 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local11) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(27) boolean local27 = this.anInt8927 == 443;
		@Pc(49) List local49;
		@Pc(71) List local71;
		try {
			local49 = this.aProxySelector1.select(new URI((local27 ? "https" : "http") + "://" + this.aString105));
			local71 = this.aProxySelector1.select(new URI((local27 ? "http" : "https") + "://" + this.aString105));
		} catch (@Pc(73) URISyntaxException local73) {
			return this.method7789();
		}
		local49.addAll(local71);
		@Pc(84) Object[] local84 = local49.toArray();
		@Pc(86) IOException_Sub1 local86 = null;
		for (@Pc(90) int local90 = 0; local90 < local84.length; local90++) {
			@Pc(102) Object local102 = local84[local90];
			@Pc(105) Proxy local105 = (Proxy) local102;
			try {
				@Pc(110) Socket local110 = this.method6188(local105);
				if (local110 != null) {
					return local110;
				}
			} catch (@Pc(117) IOException_Sub1 local117) {
				local86 = local117;
			} catch (@Pc(121) IOException local121) {
			}
		}
		if (local86 != null) {
			throw local86;
		}
		return this.method7789();
	}

	@OriginalMember(owner = "client!oia", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString105 + ":" + this.anInt8927 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString105 + ":" + this.anInt8927 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			label55: {
				if (!local74.startsWith("HTTP/1.0 200") && !local74.startsWith("HTTP/1.1 200")) {
					if (!local74.startsWith("HTTP/1.0 407") && !local74.startsWith("HTTP/1.1 407")) {
						break label55;
					}
					@Pc(99) int local99 = 0;
					local74 = local71.readLine();
					@Pc(104) String local104 = "proxy-authenticate: ";
					while (local74 != null && local99 < 50) {
						if (local74.toLowerCase().startsWith(local104)) {
							local74 = local74.substring(local104.length()).trim();
							@Pc(126) int local126 = local74.indexOf(32);
							if (local126 != -1) {
								local74 = local74.substring(0, local126);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local99++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}
}
