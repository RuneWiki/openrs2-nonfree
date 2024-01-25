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

@OriginalClass("client!cba")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4072() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt4735 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString35));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString35));
		} catch (@Pc(66) URISyntaxException local66) {
			return this.method4071();
		}
		local42.addAll(local64);
		@Pc(77) Object[] local77 = local42.toArray();
		@Pc(79) IOException_Sub1 local79 = null;
		for (@Pc(89) int local89 = 0; local89 < local77.length; local89++) {
			@Pc(97) Object local97 = local77[local89];
			@Pc(100) Proxy local100 = (Proxy) local97;
			try {
				@Pc(105) Socket local105 = this.method1165(local100);
				if (local105 != null) {
					return local105;
				}
			} catch (@Pc(112) IOException_Sub1 local112) {
				local79 = local112;
			} catch (@Pc(116) IOException local116) {
			}
		}
		if (local79 != null) {
			throw local79;
		}
		return this.method4071();
	}

	@OriginalMember(owner = "client!cba", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString35 + ":" + this.anInt4735 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString35 + ":" + this.anInt4735 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(96) int local96 = 0;
					local74 = local71.readLine();
					@Pc(101) String local101 = "proxy-authenticate: ";
					while (local74 != null && local96 < 50) {
						if (local74.toLowerCase().startsWith(local101)) {
							local74 = local74.substring(local101.length()).trim();
							@Pc(122) int local122 = local74.indexOf(32);
							if (local122 != -1) {
								local74 = local74.substring(0, local122);
							}
							throw new IOException_Sub1(local74);
						}
						local96++;
						local74 = local71.readLine();
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

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
	private Socket method1165(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4071();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(51) String local51 = null;
			try {
				@Pc(54) Class local54 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(75) Method local75 = local54.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local75.setAccessible(true);
				@Pc(97) Object local97 = local75.invoke(null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local97 != null) {
					@Pc(106) Method local106 = local54.getDeclaredMethod("supportsPreemptiveAuthorization");
					local106.setAccessible(true);
					if ((Boolean) local106.invoke(local97)) {
						@Pc(124) Method local124 = local54.getDeclaredMethod("getHeaderName");
						local124.setAccessible(true);
						@Pc(155) Method local155 = local54.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local155.setAccessible(true);
						@Pc(165) String local165 = (String) local124.invoke(local97);
						@Pc(193) String local193 = (String) local155.invoke(local97, new URL("https://" + this.aString35 + "/"), "https");
						local51 = local165 + ": " + local193;
					}
				}
			} catch (@Pc(206) Exception local206) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local51);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(38) Socket local38 = new Socket(arg0);
			local38.connect(new InetSocketAddress(this.aString35, this.anInt4735));
			return local38;
		} else {
			return null;
		}
	}
}
