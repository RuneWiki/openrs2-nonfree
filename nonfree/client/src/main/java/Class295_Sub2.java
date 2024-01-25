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

@OriginalClass("client!vk")
public final class Class295_Sub2 extends Class295 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7725() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt9401 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString96));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString96));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method7724();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		for (@Pc(82) int local82 = 0; local82 < local76.length; local82++) {
			@Pc(90) Object local90 = local76[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method7726(local93);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(105) IOException_Sub1 local105) {
				local78 = local105;
			} catch (@Pc(109) IOException local109) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method7724();
	}

	@OriginalMember(owner = "client!vk", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString96 + ":" + this.anInt9401 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString96 + ":" + this.anInt9401 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(98) String local98 = "proxy-authenticate: ";
					local74 = local71.readLine();
					while (local74 != null && local96 < 50) {
						if (local74.toLowerCase().startsWith(local98)) {
							local74 = local74.substring(local98.length()).trim();
							@Pc(123) int local123 = local74.indexOf(32);
							if (local123 != -1) {
								local74 = local74.substring(0, local123);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local96++;
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

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	private Socket method7726(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method7724();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local10;
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
						@Pc(193) String local193 = (String) local155.invoke(local97, new URL("https://" + this.aString96 + "/"), "https");
						local51 = local165 + ": " + local193;
					}
				}
			} catch (@Pc(206) Exception local206) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local51);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(38) Socket local38 = new Socket(arg0);
			local38.connect(new InetSocketAddress(this.aString96, this.anInt9401));
			return local38;
		} else {
			return null;
		}
	}
}
