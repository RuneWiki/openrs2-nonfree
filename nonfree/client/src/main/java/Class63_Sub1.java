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

@OriginalClass("client!cj")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class63_Sub1() {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method1280(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8348();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(27) InetSocketAddress local27 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(33) String local33 = null;
			try {
				@Pc(38) Class local38 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(64) Method local64 = local38.getDeclaredMethod("getProxyAuth", Static86.aClass11 == null ? (Static86.aClass11 = a("java.lang.String")) : Static86.aClass11, Integer.TYPE);
				local64.setAccessible(true);
				@Pc(86) Object local86 = local64.invoke((Object) null, local27.getHostName(), Integer.valueOf(local27.getPort()));
				if (local86 != null) {
					@Pc(98) Method local98 = local38.getDeclaredMethod("supportsPreemptiveAuthorization");
					local98.setAccessible(true);
					if ((Boolean) local98.invoke(local86)) {
						@Pc(117) Method local117 = local38.getDeclaredMethod("getHeaderName");
						local117.setAccessible(true);
						@Pc(156) Method local156 = local38.getDeclaredMethod("getHeaderValue", Static86.aClass12 == null ? (Static86.aClass12 = a("java.net.URL")) : Static86.aClass12, Static86.aClass11 == null ? (Static86.aClass11 = a("java.lang.String")) : Static86.aClass11);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local117.invoke(local86);
						@Pc(198) String local198 = (String) local156.invoke(local86, new URL("https://" + this.aString105 + "/"), "https");
						local33 = local166 + ": " + local198;
					}
				}
			} catch (@Pc(213) Exception local213) {
			}
			return this.httpProxyConnect(local27.getHostName(), local27.getPort(), local33);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(230) Socket local230 = new Socket(arg0);
			local230.connect(new InetSocketAddress(this.aString105, this.anInt9464));
			return local230;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString105 + ":" + this.anInt9464 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString105 + ":" + this.anInt9464 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(86) BufferedReader local86 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(89) String local89 = local86.readLine();
		if (local89 != null) {
			label56: {
				if (!local89.startsWith("HTTP/1.0 200") && !local89.startsWith("HTTP/1.1 200")) {
					if (!local89.startsWith("HTTP/1.0 407") && !local89.startsWith("HTTP/1.1 407")) {
						break label56;
					}
					@Pc(128) int local128 = 0;
					@Pc(132) String local132 = "proxy-authenticate: ";
					local89 = local86.readLine();
					while (local89 != null && local128 < 50) {
						if (local89.toLowerCase().startsWith(local132)) {
							local89 = local89.substring(local132.length()).trim();
							@Pc(162) int local162 = local89.indexOf(32);
							if (local162 != -1) {
								local89 = local89.substring(0, local162);
							}
							throw new IOException_Sub1(local89);
						}
						local89 = local86.readLine();
						local128++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local86.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8346() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(26) boolean local26 = this.anInt9464 == 443;
		@Pc(55) List local55;
		@Pc(84) List local84;
		try {
			local55 = this.aProxySelector1.select(new URI((local26 ? "https" : "http") + "://" + this.aString105));
			local84 = this.aProxySelector1.select(new URI((local26 ? "http" : "https") + "://" + this.aString105));
		} catch (@Pc(94) URISyntaxException local94) {
			return this.method8348();
		}
		local55.addAll(local84);
		@Pc(105) Object[] local105 = local55.toArray();
		@Pc(107) IOException_Sub1 local107 = null;
		for (@Pc(111) int local111 = 0; local111 < local105.length; local111++) {
			@Pc(119) Object local119 = local105[local111];
			@Pc(122) Proxy local122 = (Proxy) local119;
			try {
				@Pc(127) Socket local127 = this.method1280(local122);
				if (local127 != null) {
					return local127;
				}
			} catch (@Pc(136) IOException_Sub1 local136) {
				local107 = local136;
			} catch (@Pc(140) IOException local140) {
			}
		}
		if (local107 != null) {
			throw local107;
		}
		return this.method8348();
	}
}
