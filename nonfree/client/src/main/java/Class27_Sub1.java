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

@OriginalClass("client!bca")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	private Class27_Sub1() {
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method516(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method1141();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(29) InetSocketAddress local29 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(35) String local35 = null;
			try {
				@Pc(40) Class local40 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(66) Method local66 = local40.getDeclaredMethod("getProxyAuth", Static31.aClass2 == null ? (Static31.aClass2 = a("java.lang.String")) : Static31.aClass2, Integer.TYPE);
				local66.setAccessible(true);
				@Pc(88) Object local88 = local66.invoke((Object) null, local29.getHostName(), Integer.valueOf(local29.getPort()));
				if (local88 != null) {
					@Pc(101) Method local101 = local40.getDeclaredMethod("supportsPreemptiveAuthorization");
					local101.setAccessible(true);
					if ((Boolean) local101.invoke(local88)) {
						@Pc(120) Method local120 = local40.getDeclaredMethod("getHeaderName");
						local120.setAccessible(true);
						@Pc(159) Method local159 = local40.getDeclaredMethod("getHeaderValue", Static31.aClass3 == null ? (Static31.aClass3 = a("java.net.URL")) : Static31.aClass3, Static31.aClass2 == null ? (Static31.aClass2 = a("java.lang.String")) : Static31.aClass2);
						local159.setAccessible(true);
						@Pc(169) String local169 = (String) local120.invoke(local88);
						@Pc(201) String local201 = (String) local159.invoke(local88, new URL("https://" + this.aString11 + "/"), "https");
						local35 = local169 + ": " + local201;
					}
				}
			} catch (@Pc(216) Exception local216) {
			}
			return this.httpProxyConnect(local29.getHostName(), local29.getPort(), local35);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(233) Socket local233 = new Socket(arg0);
			local233.connect(new InetSocketAddress(this.aString11, this.anInt1167));
			return local233;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bca", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString11 + ":" + this.anInt1167 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString11 + ":" + this.anInt1167 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(86) BufferedReader local86 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(89) String local89 = local86.readLine();
		if (local89 != null) {
			label53: {
				if (!local89.startsWith("HTTP/1.0 200") && !local89.startsWith("HTTP/1.1 200")) {
					if (!local89.startsWith("HTTP/1.0 407") && !local89.startsWith("HTTP/1.1 407")) {
						break label53;
					}
					@Pc(128) int local128 = 0;
					@Pc(132) String local132 = "proxy-authenticate: ";
					for (local89 = local86.readLine(); local89 != null && local128 < 50; local89 = local86.readLine()) {
						if (local89.toLowerCase().startsWith(local132)) {
							local89 = local89.substring(local132.length()).trim();
							@Pc(160) int local160 = local89.indexOf(32);
							if (local160 != -1) {
								local89 = local89.substring(0, local160);
							}
							throw new IOException_Sub1(local89);
						}
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

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method1140() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(28) boolean local28 = this.anInt1167 == 443;
		@Pc(57) List local57;
		@Pc(86) List local86;
		try {
			local57 = this.aProxySelector1.select(new URI((local28 ? "https" : "http") + "://" + this.aString11));
			local86 = this.aProxySelector1.select(new URI((local28 ? "http" : "https") + "://" + this.aString11));
		} catch (@Pc(88) URISyntaxException local88) {
			return this.method1141();
		}
		local57.addAll(local86);
		@Pc(99) Object[] local99 = local57.toArray();
		@Pc(101) IOException_Sub1 local101 = null;
		for (@Pc(105) int local105 = 0; local105 < local99.length; local105++) {
			@Pc(117) Object local117 = local99[local105];
			@Pc(120) Proxy local120 = (Proxy) local117;
			try {
				@Pc(125) Socket local125 = this.method516(local120);
				if (local125 != null) {
					return local125;
				}
			} catch (@Pc(132) IOException_Sub1 local132) {
				local101 = local132;
			} catch (@Pc(136) IOException local136) {
			}
		}
		if (local101 != null) {
			throw local101;
		}
		return this.method1141();
	}
}
