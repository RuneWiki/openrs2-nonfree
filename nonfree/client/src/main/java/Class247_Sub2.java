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

@OriginalClass("client!nn")
public final class Class247_Sub2 extends Class247 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5554() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt6263 == 443;
		@Pc(40) List local40;
		@Pc(69) List local69;
		try {
			local40 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString69));
			local69 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString69));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method5553();
		}
		local40.addAll(local69);
		@Pc(82) Object[] local82 = local40.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method5556(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local84 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method5553();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method5556(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5553();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(32) String local32 = null;
			try {
				@Pc(35) Class local35 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(56) Method local56 = local35.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local56.setAccessible(true);
				@Pc(78) Object local78 = local56.invoke(null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local78 != null) {
					@Pc(88) Method local88 = local35.getDeclaredMethod("supportsPreemptiveAuthorization");
					local88.setAccessible(true);
					if ((Boolean) local88.invoke(local78)) {
						@Pc(105) Method local105 = local35.getDeclaredMethod("getHeaderName");
						local105.setAccessible(true);
						@Pc(136) Method local136 = local35.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local136.setAccessible(true);
						@Pc(146) String local146 = (String) local105.invoke(local78);
						@Pc(174) String local174 = (String) local136.invoke(local78, new URL("https://" + this.aString69 + "/"), "https");
						local32 = local146 + ": " + local174;
					}
				}
			} catch (@Pc(187) Exception local187) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local32);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(205) Socket local205 = new Socket(arg0);
			local205.connect(new InetSocketAddress(this.aString69, this.anInt6263));
			return local205;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt6263 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString69 + ":" + this.anInt6263 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(99) String local99 = "proxy-authenticate: ";
					local74 = local71.readLine();
					while (local74 != null && local97 < 50) {
						if (local74.toLowerCase().startsWith(local99)) {
							local74 = local74.substring(local99.length()).trim();
							@Pc(123) int local123 = local74.indexOf(32);
							if (local123 != -1) {
								local74 = local74.substring(0, local123);
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
}
