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

@OriginalClass("client!mm")
public final class Class135_Sub2 extends Class135 {

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	private Class135_Sub2() {
	}

	@OriginalMember(owner = "client!mm", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt6756 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt6756 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(125) int local125 = 0;
					local89 = local86.readLine();
					@Pc(132) String local132 = "proxy-authenticate: ";
					while (local89 != null && local125 < 50) {
						if (local89.toLowerCase().startsWith(local132)) {
							local89 = local89.substring(local132.length()).trim();
							@Pc(161) int local161 = local89.indexOf(32);
							if (local161 != -1) {
								local89 = local89.substring(0, local161);
							}
							throw new IOException_Sub1(local89);
						}
						local125++;
						local89 = local86.readLine();
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

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method5894(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5889();
		}
		@Pc(12) SocketAddress local12 = arg0.address();
		if (!(local12 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(22) InetSocketAddress local22 = (InetSocketAddress) local12;
		if (arg0.type() == Type.HTTP) {
			@Pc(28) String local28 = null;
			try {
				@Pc(33) Class local33 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(59) Method local59 = local33.getDeclaredMethod("getProxyAuth", Static386.aClass36 == null ? (Static386.aClass36 = a("java.lang.String")) : Static386.aClass36, Integer.TYPE);
				local59.setAccessible(true);
				@Pc(81) Object local81 = local59.invoke((Object) null, local22.getHostName(), Integer.valueOf(local22.getPort()));
				if (local81 != null) {
					@Pc(93) Method local93 = local33.getDeclaredMethod("supportsPreemptiveAuthorization");
					local93.setAccessible(true);
					if ((Boolean) local93.invoke(local81)) {
						@Pc(114) Method local114 = local33.getDeclaredMethod("getHeaderName");
						local114.setAccessible(true);
						@Pc(153) Method local153 = local33.getDeclaredMethod("getHeaderValue", Static386.aClass37 == null ? (Static386.aClass37 = a("java.net.URL")) : Static386.aClass37, Static386.aClass36 == null ? (Static386.aClass36 = a("java.lang.String")) : Static386.aClass36);
						local153.setAccessible(true);
						@Pc(163) String local163 = (String) local114.invoke(local81);
						@Pc(195) String local195 = (String) local153.invoke(local81, new URL("https://" + this.aString82 + "/"), "https");
						local28 = local163 + ": " + local195;
					}
				}
			} catch (@Pc(210) Exception local210) {
			}
			return this.httpProxyConnect(local22.getHostName(), local22.getPort(), local28);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(227) Socket local227 = new Socket(arg0);
			local227.connect(new InetSocketAddress(this.aString82, this.anInt6756));
			return local227;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5890() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(36) boolean local36 = this.anInt6756 == 443;
		@Pc(65) List local65;
		@Pc(94) List local94;
		try {
			local65 = this.aProxySelector1.select(new URI((local36 ? "https" : "http") + "://" + this.aString82));
			local94 = this.aProxySelector1.select(new URI((local36 ? "http" : "https") + "://" + this.aString82));
		} catch (@Pc(96) URISyntaxException local96) {
			return this.method5889();
		}
		local65.addAll(local94);
		@Pc(107) Object[] local107 = local65.toArray();
		@Pc(109) IOException_Sub1 local109 = null;
		for (@Pc(113) int local113 = 0; local113 < local107.length; local113++) {
			@Pc(121) Object local121 = local107[local113];
			@Pc(124) Proxy local124 = (Proxy) local121;
			try {
				@Pc(129) Socket local129 = this.method5894(local124);
				if (local129 != null) {
					return local129;
				}
			} catch (@Pc(135) IOException_Sub1 local135) {
				local109 = local135;
			} catch (@Pc(139) IOException local139) {
			}
		}
		if (local109 != null) {
			throw local109;
		}
		return this.method5889();
	}
}
