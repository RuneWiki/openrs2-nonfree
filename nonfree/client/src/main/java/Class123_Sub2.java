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

@OriginalClass("client!ofa")
public final class Class123_Sub2 extends Class123 {

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ofa", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString47 + ":" + this.anInt6491 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString47 + ":" + this.anInt6491 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label55: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label55;
					}
					@Pc(99) int local99 = 0;
					local75 = local72.readLine();
					@Pc(104) String local104 = "proxy-authenticate: ";
					while (local75 != null && local99 < 50) {
						if (local75.toLowerCase().startsWith(local104)) {
							local75 = local75.substring(local104.length()).trim();
							@Pc(126) int local126 = local75.indexOf(32);
							if (local126 != -1) {
								local75 = local75.substring(0, local126);
							}
							throw new IOException_Sub1(local75);
						}
						local75 = local72.readLine();
						local99++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
	private Socket method5545(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5544();
		}
		@Pc(15) SocketAddress local15 = arg0.address();
		if (!(local15 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(23) InetSocketAddress local23 = (InetSocketAddress) local15;
		if (arg0.type() == Type.HTTP) {
			@Pc(29) String local29 = null;
			try {
				@Pc(32) Class local32 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(53) Method local53 = local32.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local53.setAccessible(true);
				@Pc(75) Object local75 = local53.invoke(null, local23.getHostName(), Integer.valueOf(local23.getPort()));
				if (local75 != null) {
					@Pc(85) Method local85 = local32.getDeclaredMethod("supportsPreemptiveAuthorization");
					local85.setAccessible(true);
					if ((Boolean) local85.invoke(local75)) {
						@Pc(103) Method local103 = local32.getDeclaredMethod("getHeaderName");
						local103.setAccessible(true);
						@Pc(134) Method local134 = local32.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local134.setAccessible(true);
						@Pc(144) String local144 = (String) local103.invoke(local75);
						@Pc(172) String local172 = (String) local134.invoke(local75, new URL("https://" + this.aString47 + "/"), "https");
						local29 = local144 + ": " + local172;
					}
				}
			} catch (@Pc(185) Exception local185) {
			}
			return this.httpProxyConnect(local23.getHostName(), local23.getPort(), local29);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(202) Socket local202 = new Socket(arg0);
			local202.connect(new InetSocketAddress(this.aString47, this.anInt6491));
			return local202;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5541() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(24) boolean local24 = this.anInt6491 == 443;
		@Pc(46) List local46;
		@Pc(68) List local68;
		try {
			local46 = this.aProxySelector1.select(new URI((local24 ? "https" : "http") + "://" + this.aString47));
			local68 = this.aProxySelector1.select(new URI((local24 ? "http" : "https") + "://" + this.aString47));
		} catch (@Pc(70) URISyntaxException local70) {
			return this.method5544();
		}
		local46.addAll(local68);
		@Pc(81) Object[] local81 = local46.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(95) Object local95 = local81[local87];
			@Pc(98) Proxy local98 = (Proxy) local95;
			try {
				@Pc(103) Socket local103 = this.method5545(local98);
				if (local103 != null) {
					return local103;
				}
			} catch (@Pc(110) IOException_Sub1 local110) {
				local83 = local110;
			} catch (@Pc(114) IOException local114) {
			}
		}
		if (local83 != null) {
			throw local83;
		}
		return this.method5544();
	}
}
