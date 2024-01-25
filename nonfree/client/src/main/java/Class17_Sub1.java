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

@OriginalClass("client!ak")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	private Class17_Sub1() {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method308(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5299();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(19) InetSocketAddress local19 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(47) String local47 = null;
			try {
				@Pc(52) Class local52 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(78) Method local78 = local52.getDeclaredMethod("getProxyAuth", Static20.aClass2 == null ? (Static20.aClass2 = a("java.lang.String")) : Static20.aClass2, Integer.TYPE);
				local78.setAccessible(true);
				@Pc(100) Object local100 = local78.invoke((Object) null, local19.getHostName(), Integer.valueOf(local19.getPort()));
				if (local100 != null) {
					@Pc(113) Method local113 = local52.getDeclaredMethod("supportsPreemptiveAuthorization");
					local113.setAccessible(true);
					if ((Boolean) local113.invoke(local100)) {
						@Pc(132) Method local132 = local52.getDeclaredMethod("getHeaderName");
						local132.setAccessible(true);
						@Pc(171) Method local171 = local52.getDeclaredMethod("getHeaderValue", Static20.aClass3 == null ? (Static20.aClass3 = a("java.net.URL")) : Static20.aClass3, Static20.aClass2 == null ? (Static20.aClass2 = a("java.lang.String")) : Static20.aClass2);
						local171.setAccessible(true);
						@Pc(181) String local181 = (String) local132.invoke(local100);
						@Pc(213) String local213 = (String) local171.invoke(local100, new URL("https://" + this.aString76 + "/"), "https");
						local47 = local181 + ": " + local213;
					}
				}
			} catch (@Pc(228) Exception local228) {
			}
			return this.httpProxyConnect(local19.getHostName(), local19.getPort(), local47);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(34) Socket local34 = new Socket(arg0);
			local34.connect(new InetSocketAddress(this.aString76, this.anInt6195));
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString76 + ":" + this.anInt6195 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString76 + ":" + this.anInt6195 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(87) BufferedReader local87 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(90) String local90 = local87.readLine();
		if (local90 != null) {
			label54: {
				if (!local90.startsWith("HTTP/1.0 200") && !local90.startsWith("HTTP/1.1 200")) {
					if (!local90.startsWith("HTTP/1.0 407") && !local90.startsWith("HTTP/1.1 407")) {
						break label54;
					}
					@Pc(128) int local128 = 0;
					local90 = local87.readLine();
					@Pc(135) String local135 = "proxy-authenticate: ";
					while (local90 != null && local128 < 50) {
						if (local90.toLowerCase().startsWith(local135)) {
							local90 = local90.substring(local135.length()).trim();
							@Pc(162) int local162 = local90.indexOf(32);
							if (local162 != -1) {
								local90 = local90.substring(0, local162);
							}
							throw new IOException_Sub1(local90);
						}
						local90 = local87.readLine();
						local128++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local87.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5296() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(36) boolean local36 = this.anInt6195 == 443;
		@Pc(65) List local65;
		@Pc(94) List local94;
		try {
			local65 = this.aProxySelector1.select(new URI((local36 ? "https" : "http") + "://" + this.aString76));
			local94 = this.aProxySelector1.select(new URI((local36 ? "http" : "https") + "://" + this.aString76));
		} catch (@Pc(96) URISyntaxException local96) {
			return this.method5299();
		}
		local65.addAll(local94);
		@Pc(107) Object[] local107 = local65.toArray();
		@Pc(109) IOException_Sub1 local109 = null;
		for (@Pc(113) int local113 = 0; local113 < local107.length; local113++) {
			@Pc(125) Object local125 = local107[local113];
			@Pc(128) Proxy local128 = (Proxy) local125;
			try {
				@Pc(133) Socket local133 = this.method308(local128);
				if (local133 != null) {
					return local133;
				}
			} catch (@Pc(142) IOException_Sub1 local142) {
				local109 = local142;
			} catch (@Pc(146) IOException local146) {
			}
		}
		if (local109 != null) {
			throw local109;
		}
		return this.method5299();
	}
}
