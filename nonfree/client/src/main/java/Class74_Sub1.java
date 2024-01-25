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

@OriginalClass("client!dv")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method2200(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5052();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(52) String local52 = null;
			try {
				@Pc(55) Class local55 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(76) Method local76 = local55.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local76.setAccessible(true);
				@Pc(98) Object local98 = local76.invoke(null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local98 != null) {
					@Pc(107) Method local107 = local55.getDeclaredMethod("supportsPreemptiveAuthorization");
					local107.setAccessible(true);
					if ((Boolean) local107.invoke(local98)) {
						@Pc(125) Method local125 = local55.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local55.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local98);
						@Pc(194) String local194 = (String) local156.invoke(local98, new URL("https://" + this.aString58 + "/"), "https");
						local52 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local52);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(39) Socket local39 = new Socket(arg0);
			local39.connect(new InetSocketAddress(this.aString58, this.anInt5882));
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dv", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt5882 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt5882 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			if (local74.startsWith("HTTP/1.0 200") || local74.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local74.startsWith("HTTP/1.0 407") || local74.startsWith("HTTP/1.1 407")) {
				@Pc(99) int local99 = 0;
				@Pc(101) String local101 = "proxy-authenticate: ";
				local74 = local71.readLine();
				while (local74 != null && local99 < 50) {
					if (local74.toLowerCase().startsWith(local101)) {
						local74 = local74.substring(local101.length()).trim();
						@Pc(124) int local124 = local74.indexOf(32);
						if (local124 != -1) {
							local74 = local74.substring(0, local124);
						}
						throw new IOException_Sub1(local74);
					}
					local74 = local71.readLine();
					local99++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5053() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(17) boolean local17 = this.anInt5882 == 443;
		@Pc(39) List local39;
		@Pc(61) List local61;
		try {
			local39 = this.aProxySelector1.select(new URI((local17 ? "https" : "http") + "://" + this.aString58));
			local61 = this.aProxySelector1.select(new URI((local17 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(63) URISyntaxException local63) {
			return this.method5052();
		}
		local39.addAll(local61);
		@Pc(81) Object[] local81 = local39.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(99) Object local99 = local81[local87];
			@Pc(102) Proxy local102 = (Proxy) local99;
			try {
				@Pc(107) Socket local107 = this.method2200(local102);
				if (local107 != null) {
					return local107;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local83 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local83 != null) {
			throw local83;
		}
		return this.method5052();
	}
}
