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

@OriginalClass("client!qia")
public final class Class283_Sub1 extends Class283 {

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!qia", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString98 + ":" + this.anInt9730 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString98 + ":" + this.anInt9730 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(98) int local98 = 0;
					@Pc(100) String local100 = "proxy-authenticate: ";
					local74 = local71.readLine();
					while (local74 != null && local98 < 50) {
						if (local74.toLowerCase().startsWith(local100)) {
							local74 = local74.substring(local100.length()).trim();
							@Pc(126) int local126 = local74.indexOf(32);
							if (local126 != -1) {
								local74 = local74.substring(0, local126);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local98++;
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

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	private Socket method6870(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8265();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local16;
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
						@Pc(172) String local172 = (String) local134.invoke(local76, new URL("https://" + this.aString98 + "/"), "https");
						local30 = local144 + ": " + local172;
					}
				}
			} catch (@Pc(185) Exception local185) {
			}
			return this.httpProxyConnect(local24.getHostName(), local24.getPort(), local30);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(203) Socket local203 = new Socket(arg0);
			local203.connect(new InetSocketAddress(this.aString98, this.anInt9730));
			return local203;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8270() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt9730 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString98));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString98));
		} catch (@Pc(72) URISyntaxException local72) {
			return this.method8265();
		}
		local42.addAll(local64);
		@Pc(83) Object[] local83 = local42.toArray();
		@Pc(85) IOException_Sub1 local85 = null;
		for (@Pc(89) int local89 = 0; local89 < local83.length; local89++) {
			@Pc(97) Object local97 = local83[local89];
			@Pc(100) Proxy local100 = (Proxy) local97;
			try {
				@Pc(105) Socket local105 = this.method6870(local100);
				if (local105 != null) {
					return local105;
				}
			} catch (@Pc(112) IOException_Sub1 local112) {
				local85 = local112;
			} catch (@Pc(116) IOException local116) {
			}
		}
		if (local85 != null) {
			throw local85;
		}
		return this.method8265();
	}
}
