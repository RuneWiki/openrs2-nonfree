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

@OriginalClass("client!eb")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method1506() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt1804 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString21));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString21));
		} catch (@Pc(66) URISyntaxException local66) {
			return this.method1505();
		}
		local42.addAll(local64);
		@Pc(77) Object[] local77 = local42.toArray();
		@Pc(79) IOException_Sub1 local79 = null;
		for (@Pc(83) int local83 = 0; local83 < local77.length; local83++) {
			@Pc(98) Object local98 = local77[local83];
			@Pc(101) Proxy local101 = (Proxy) local98;
			try {
				@Pc(106) Socket local106 = this.method1509(local101);
				if (local106 != null) {
					return local106;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local79 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local79 != null) {
			throw local79;
		}
		return this.method1505();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
	private Socket method1509(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method1505();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(51) String local51 = null;
			try {
				@Pc(54) Class local54 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(75) Method local75 = local54.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local75.setAccessible(true);
				@Pc(97) Object local97 = local75.invoke(null, local24.getHostName(), Integer.valueOf(local24.getPort()));
				if (local97 != null) {
					@Pc(106) Method local106 = local54.getDeclaredMethod("supportsPreemptiveAuthorization");
					local106.setAccessible(true);
					if ((Boolean) local106.invoke(local97)) {
						@Pc(124) Method local124 = local54.getDeclaredMethod("getHeaderName");
						local124.setAccessible(true);
						@Pc(155) Method local155 = local54.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local155.setAccessible(true);
						@Pc(165) String local165 = (String) local124.invoke(local97);
						@Pc(193) String local193 = (String) local155.invoke(local97, new URL("https://" + this.aString21 + "/"), "https");
						local51 = local165 + ": " + local193;
					}
				}
			} catch (@Pc(206) Exception local206) {
			}
			return this.httpProxyConnect(local24.getHostName(), local24.getPort(), local51);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(38) Socket local38 = new Socket(arg0);
			local38.connect(new InetSocketAddress(this.aString21, this.anInt1804));
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString21 + ":" + this.anInt1804 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString21 + ":" + this.anInt1804 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			label56: {
				if (!local74.startsWith("HTTP/1.0 200") && !local74.startsWith("HTTP/1.1 200")) {
					if (!local74.startsWith("HTTP/1.0 407") && !local74.startsWith("HTTP/1.1 407")) {
						break label56;
					}
					@Pc(100) int local100 = 0;
					@Pc(102) String local102 = "proxy-authenticate: ";
					for (local74 = local71.readLine(); local74 != null && local100 < 50; local74 = local71.readLine()) {
						if (local74.toLowerCase().startsWith(local102)) {
							local74 = local74.substring(local102.length()).trim();
							@Pc(129) int local129 = local74.indexOf(32);
							if (local129 != -1) {
								local74 = local74.substring(0, local129);
							}
							throw new IOException_Sub1(local74);
						}
						local100++;
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
