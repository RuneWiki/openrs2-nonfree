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

@OriginalClass("client!ds")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	private Class80_Sub1() {
	}

	@OriginalMember(owner = "client!ds", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString75 + ":" + this.anInt4280 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString75 + ":" + this.anInt4280 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(86) BufferedReader local86 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(89) String local89 = local86.readLine();
		if (local89 != null) {
			label55: {
				if (!local89.startsWith("HTTP/1.0 200") && !local89.startsWith("HTTP/1.1 200")) {
					if (!local89.startsWith("HTTP/1.0 407") && !local89.startsWith("HTTP/1.1 407")) {
						break label55;
					}
					@Pc(128) int local128 = 0;
					local89 = local86.readLine();
					@Pc(135) String local135 = "proxy-authenticate: ";
					while (local89 != null && local128 < 50) {
						if (local89.toLowerCase().startsWith(local135)) {
							local89 = local89.substring(local135.length()).trim();
							@Pc(163) int local163 = local89.indexOf(32);
							if (local163 != -1) {
								local89 = local89.substring(0, local163);
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

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method2125(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method3529();
		}
		@Pc(18) SocketAddress local18 = arg0.address();
		if (!(local18 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local18;
		if (arg0.type() == Type.HTTP) {
			@Pc(56) String local56 = null;
			try {
				@Pc(61) Class local61 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(87) Method local87 = local61.getDeclaredMethod("getProxyAuth", Static126.aClass8 == null ? (Static126.aClass8 = a("java.lang.String")) : Static126.aClass8, Integer.TYPE);
				local87.setAccessible(true);
				@Pc(109) Object local109 = local87.invoke((Object) null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local109 != null) {
					@Pc(120) Method local120 = local61.getDeclaredMethod("supportsPreemptiveAuthorization");
					local120.setAccessible(true);
					if ((Boolean) local120.invoke(local109)) {
						@Pc(139) Method local139 = local61.getDeclaredMethod("getHeaderName");
						local139.setAccessible(true);
						@Pc(178) Method local178 = local61.getDeclaredMethod("getHeaderValue", Static126.aClass9 == null ? (Static126.aClass9 = a("java.net.URL")) : Static126.aClass9, Static126.aClass8 == null ? (Static126.aClass8 = a("java.lang.String")) : Static126.aClass8);
						local178.setAccessible(true);
						@Pc(188) String local188 = (String) local139.invoke(local109);
						@Pc(220) String local220 = (String) local178.invoke(local109, new URL("https://" + this.aString75 + "/"), "https");
						local56 = local188 + ": " + local220;
					}
				}
			} catch (@Pc(235) Exception local235) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local56);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(43) Socket local43 = new Socket(arg0);
			local43.connect(new InetSocketAddress(this.aString75, this.anInt4280));
			return local43;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Ljava/net/Socket;")
	@Override
	public Socket method3527() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(35) boolean local35 = this.anInt4280 == 443;
		@Pc(64) List local64;
		@Pc(93) List local93;
		try {
			local64 = this.aProxySelector1.select(new URI((local35 ? "https" : "http") + "://" + this.aString75));
			local93 = this.aProxySelector1.select(new URI((local35 ? "http" : "https") + "://" + this.aString75));
		} catch (@Pc(95) URISyntaxException local95) {
			return this.method3529();
		}
		local64.addAll(local93);
		@Pc(106) Object[] local106 = local64.toArray();
		@Pc(108) IOException_Sub1 local108 = null;
		for (@Pc(112) int local112 = 0; local112 < local106.length; local112++) {
			@Pc(124) Object local124 = local106[local112];
			@Pc(127) Proxy local127 = (Proxy) local124;
			try {
				@Pc(132) Socket local132 = this.method2125(local127);
				if (local132 != null) {
					return local132;
				}
			} catch (@Pc(139) IOException_Sub1 local139) {
				local108 = local139;
			} catch (@Pc(143) IOException local143) {
			}
		}
		if (local108 != null) {
			throw local108;
		}
		return this.method3529();
	}
}
