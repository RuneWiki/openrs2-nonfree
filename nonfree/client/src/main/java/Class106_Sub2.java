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

@OriginalClass("client!qg")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method6798(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6795();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(52) String local52 = null;
			try {
				@Pc(55) Class local55 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(76) Method local76 = local55.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local76.setAccessible(true);
				@Pc(98) Object local98 = local76.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local98 != null) {
					@Pc(106) Method local106 = local55.getDeclaredMethod("supportsPreemptiveAuthorization");
					local106.setAccessible(true);
					if ((Boolean) local106.invoke(local98)) {
						@Pc(124) Method local124 = local55.getDeclaredMethod("getHeaderName");
						local124.setAccessible(true);
						@Pc(155) Method local155 = local55.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local155.setAccessible(true);
						@Pc(165) String local165 = (String) local124.invoke(local98);
						@Pc(193) String local193 = (String) local155.invoke(local98, new URL("https://" + this.aString95 + "/"), "https");
						local52 = local165 + ": " + local193;
					}
				}
			} catch (@Pc(206) Exception local206) {
			}
			return this.httpProxyConnect(local18.getHostName(), local18.getPort(), local52);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(39) Socket local39 = new Socket(arg0);
			local39.connect(new InetSocketAddress(this.aString95, this.anInt8264));
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString95 + ":" + this.anInt8264 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString95 + ":" + this.anInt8264 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			if (local75.startsWith("HTTP/1.0 200") || local75.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local75.startsWith("HTTP/1.0 407") || local75.startsWith("HTTP/1.1 407")) {
				@Pc(99) int local99 = 0;
				local75 = local72.readLine();
				@Pc(104) String local104 = "proxy-authenticate: ";
				while (local75 != null && local99 < 50) {
					if (local75.toLowerCase().startsWith(local104)) {
						local75 = local75.substring(local104.length()).trim();
						@Pc(128) int local128 = local75.indexOf(32);
						if (local128 != -1) {
							local75 = local75.substring(0, local128);
						}
						throw new IOException_Sub1(local75);
					}
					local99++;
					local75 = local72.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method6796() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt8264 == 443;
		@Pc(42) List local42;
		@Pc(70) List local70;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString95));
			local70 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString95));
		} catch (@Pc(72) URISyntaxException local72) {
			return this.method6795();
		}
		local42.addAll(local70);
		@Pc(83) Object[] local83 = local42.toArray();
		@Pc(85) IOException_Sub1 local85 = null;
		for (@Pc(89) int local89 = 0; local89 < local83.length; local89++) {
			@Pc(97) Object local97 = local83[local89];
			@Pc(100) Proxy local100 = (Proxy) local97;
			try {
				@Pc(105) Socket local105 = this.method6798(local100);
				if (local105 != null) {
					return local105;
				}
			} catch (@Pc(113) IOException_Sub1 local113) {
				local85 = local113;
			} catch (@Pc(117) IOException local117) {
			}
		}
		if (local85 != null) {
			throw local85;
		}
		return this.method6795();
	}
}
