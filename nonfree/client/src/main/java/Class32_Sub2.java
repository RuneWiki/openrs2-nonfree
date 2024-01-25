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

@OriginalClass("client!lo")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!lo", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString76 + ":" + this.anInt5576 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString76 + ":" + this.anInt5576 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			if (local74.startsWith("HTTP/1.0 200") || local74.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local74.startsWith("HTTP/1.0 407") || local74.startsWith("HTTP/1.1 407")) {
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
					local97++;
					local74 = local71.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
	private Socket method4821(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4820();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(52) String local52 = null;
			try {
				@Pc(55) Class local55 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(76) Method local76 = local55.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local76.setAccessible(true);
				@Pc(98) Object local98 = local76.invoke(null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local98 != null) {
					@Pc(108) Method local108 = local55.getDeclaredMethod("supportsPreemptiveAuthorization");
					local108.setAccessible(true);
					if ((Boolean) local108.invoke(local98)) {
						@Pc(125) Method local125 = local55.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local55.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local98);
						@Pc(194) String local194 = (String) local156.invoke(local98, new URL("https://" + this.aString76 + "/"), "https");
						local52 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local52);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(39) Socket local39 = new Socket(arg0);
			local39.connect(new InetSocketAddress(this.aString76, this.anInt5576));
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4818() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt5576 == 443;
		@Pc(40) List local40;
		@Pc(62) List local62;
		try {
			local40 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString76));
			local62 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString76));
		} catch (@Pc(64) URISyntaxException local64) {
			return this.method4820();
		}
		local40.addAll(local62);
		@Pc(75) Object[] local75 = local40.toArray();
		@Pc(77) IOException_Sub1 local77 = null;
		for (@Pc(81) int local81 = 0; local81 < local75.length; local81++) {
			@Pc(93) Object local93 = local75[local81];
			@Pc(96) Proxy local96 = (Proxy) local93;
			try {
				@Pc(101) Socket local101 = this.method4821(local96);
				if (local101 != null) {
					return local101;
				}
			} catch (@Pc(107) IOException_Sub1 local107) {
				local77 = local107;
			} catch (@Pc(111) IOException local111) {
			}
		}
		if (local77 != null) {
			throw local77;
		}
		return this.method4820();
	}
}
