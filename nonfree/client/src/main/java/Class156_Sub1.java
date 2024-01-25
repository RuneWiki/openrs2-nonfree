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

@OriginalClass("client!lga")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!lga", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString109 + ":" + this.anInt9748 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString109 + ":" + this.anInt9748 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			label53: {
				if (!local74.startsWith("HTTP/1.0 200") && !local74.startsWith("HTTP/1.1 200")) {
					if (!local74.startsWith("HTTP/1.0 407") && !local74.startsWith("HTTP/1.1 407")) {
						break label53;
					}
					@Pc(97) int local97 = 0;
					local74 = local71.readLine();
					@Pc(102) String local102 = "proxy-authenticate: ";
					while (local74 != null && local97 < 50) {
						if (local74.toLowerCase().startsWith(local102)) {
							local74 = local74.substring(local102.length()).trim();
							@Pc(126) int local126 = local74.indexOf(32);
							if (local126 != -1) {
								local74 = local74.substring(0, local126);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local97++;
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

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method4293(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8154();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(28) InetSocketAddress local28 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(55) String local55 = null;
			try {
				@Pc(58) Class local58 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(79) Method local79 = local58.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local79.setAccessible(true);
				@Pc(101) Object local101 = local79.invoke(null, local28.getHostName(), Integer.valueOf(local28.getPort()));
				if (local101 != null) {
					@Pc(109) Method local109 = local58.getDeclaredMethod("supportsPreemptiveAuthorization");
					local109.setAccessible(true);
					if ((Boolean) local109.invoke(local101)) {
						@Pc(127) Method local127 = local58.getDeclaredMethod("getHeaderName");
						local127.setAccessible(true);
						@Pc(158) Method local158 = local58.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local158.setAccessible(true);
						@Pc(168) String local168 = (String) local127.invoke(local101);
						@Pc(196) String local196 = (String) local158.invoke(local101, new URL("https://" + this.aString109 + "/"), "https");
						local55 = local168 + ": " + local196;
					}
				}
			} catch (@Pc(209) Exception local209) {
			}
			return this.httpProxyConnect(local28.getHostName(), local28.getPort(), local55);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(42) Socket local42 = new Socket(arg0);
			local42.connect(new InetSocketAddress(this.aString109, this.anInt9748));
			return local42;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8153() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt9748 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString109));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString109));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method8154();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method4293(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(115) IOException_Sub1 local115) {
				local84 = local115;
			} catch (@Pc(119) IOException local119) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method8154();
	}
}
