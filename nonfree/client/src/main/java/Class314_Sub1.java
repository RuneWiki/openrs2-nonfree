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

@OriginalClass("client!rja")
public final class Class314_Sub1 extends Class314 {

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V")
	private Class314_Sub1() {
	}

	@OriginalMember(owner = "client!rja", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString127 + ":" + this.anInt10665 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString127 + ":" + this.anInt10665 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(129) int local129 = 0;
					local90 = local87.readLine();
					@Pc(136) String local136 = "proxy-authenticate: ";
					while (local90 != null && local129 < 50) {
						if (local90.toLowerCase().startsWith(local136)) {
							local90 = local90.substring(local136.length()).trim();
							@Pc(164) int local164 = local90.indexOf(32);
							if (local164 != -1) {
								local90 = local90.substring(0, local164);
							}
							throw new IOException_Sub1(local90);
						}
						local129++;
						local90 = local87.readLine();
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

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method7347(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method9061();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(28) InetSocketAddress local28 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(58) String local58 = null;
			try {
				@Pc(63) Class local63 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(89) Method local89 = local63.getDeclaredMethod("getProxyAuth", Static564.aClass24 == null ? (Static564.aClass24 = a("java.lang.String")) : Static564.aClass24, Integer.TYPE);
				local89.setAccessible(true);
				@Pc(111) Object local111 = local89.invoke((Object) null, local28.getHostName(), Integer.valueOf(local28.getPort()));
				if (local111 != null) {
					@Pc(122) Method local122 = local63.getDeclaredMethod("supportsPreemptiveAuthorization");
					local122.setAccessible(true);
					if ((Boolean) local122.invoke(local111)) {
						@Pc(141) Method local141 = local63.getDeclaredMethod("getHeaderName");
						local141.setAccessible(true);
						@Pc(180) Method local180 = local63.getDeclaredMethod("getHeaderValue", Static564.aClass25 == null ? (Static564.aClass25 = a("java.net.URL")) : Static564.aClass25, Static564.aClass24 == null ? (Static564.aClass24 = a("java.lang.String")) : Static564.aClass24);
						local180.setAccessible(true);
						@Pc(190) String local190 = (String) local141.invoke(local111);
						@Pc(222) String local222 = (String) local180.invoke(local111, new URL("https://" + this.aString127 + "/"), "https");
						local58 = local190 + ": " + local222;
					}
				}
			} catch (@Pc(237) Exception local237) {
			}
			return this.httpProxyConnect(local28.getHostName(), local28.getPort(), local58);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(45) Socket local45 = new Socket(arg0);
			local45.connect(new InetSocketAddress(this.aString127, this.anInt10665));
			return local45;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method9059() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(28) boolean local28 = this.anInt10665 == 443;
		@Pc(57) List local57;
		@Pc(86) List local86;
		try {
			local57 = this.aProxySelector1.select(new URI((local28 ? "https" : "http") + "://" + this.aString127));
			local86 = this.aProxySelector1.select(new URI((local28 ? "http" : "https") + "://" + this.aString127));
		} catch (@Pc(88) URISyntaxException local88) {
			return this.method9061();
		}
		local57.addAll(local86);
		@Pc(99) Object[] local99 = local57.toArray();
		@Pc(101) IOException_Sub1 local101 = null;
		for (@Pc(105) int local105 = 0; local105 < local99.length; local105++) {
			@Pc(113) Object local113 = local99[local105];
			@Pc(116) Proxy local116 = (Proxy) local113;
			try {
				@Pc(121) Socket local121 = this.method7347(local116);
				if (local121 != null) {
					return local121;
				}
			} catch (@Pc(127) IOException_Sub1 local127) {
				local101 = local127;
			} catch (@Pc(131) IOException local131) {
			}
		}
		if (local101 != null) {
			throw local101;
		}
		return this.method9061();
	}
}
