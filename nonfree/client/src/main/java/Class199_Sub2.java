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

@OriginalClass("client!wf")
public final class Class199_Sub2 extends Class199 {

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	private Class199_Sub2() {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8877() throws IOException {
		@Pc(5) boolean local5 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local5) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(26) boolean local26 = this.anInt10292 == 443;
		@Pc(55) List local55;
		@Pc(84) List local84;
		try {
			local55 = this.aProxySelector1.select(new URI((local26 ? "https" : "http") + "://" + this.aString128));
			local84 = this.aProxySelector1.select(new URI((local26 ? "http" : "https") + "://" + this.aString128));
		} catch (@Pc(86) URISyntaxException local86) {
			return this.method8879();
		}
		local55.addAll(local84);
		@Pc(97) Object[] local97 = local55.toArray();
		@Pc(99) IOException_Sub1 local99 = null;
		for (@Pc(103) int local103 = 0; local103 < local97.length; local103++) {
			@Pc(115) Object local115 = local97[local103];
			@Pc(118) Proxy local118 = (Proxy) local115;
			try {
				@Pc(123) Socket local123 = this.method8881(local118);
				if (local123 != null) {
					return local123;
				}
			} catch (@Pc(131) IOException_Sub1 local131) {
				local99 = local131;
			} catch (@Pc(135) IOException local135) {
			}
		}
		if (local99 != null) {
			throw local99;
		}
		return this.method8879();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method8881(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8879();
		}
		@Pc(18) SocketAddress local18 = arg0.address();
		if (!(local18 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local18;
		if (arg0.type() == Type.HTTP) {
			@Pc(32) String local32 = null;
			try {
				@Pc(37) Class local37 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(63) Method local63 = local37.getDeclaredMethod("getProxyAuth", Static670.aClass24 == null ? (Static670.aClass24 = a("java.lang.String")) : Static670.aClass24, Integer.TYPE);
				local63.setAccessible(true);
				@Pc(85) Object local85 = local63.invoke((Object) null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local85 != null) {
					@Pc(97) Method local97 = local37.getDeclaredMethod("supportsPreemptiveAuthorization");
					local97.setAccessible(true);
					if ((Boolean) local97.invoke(local85)) {
						@Pc(116) Method local116 = local37.getDeclaredMethod("getHeaderName");
						local116.setAccessible(true);
						@Pc(155) Method local155 = local37.getDeclaredMethod("getHeaderValue", Static670.aClass25 == null ? (Static670.aClass25 = a("java.net.URL")) : Static670.aClass25, Static670.aClass24 == null ? (Static670.aClass24 = a("java.lang.String")) : Static670.aClass24);
						local155.setAccessible(true);
						@Pc(165) String local165 = (String) local116.invoke(local85);
						@Pc(197) String local197 = (String) local155.invoke(local85, new URL("https://" + this.aString128 + "/"), "https");
						local32 = local165 + ": " + local197;
					}
				}
			} catch (@Pc(212) Exception local212) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local32);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(229) Socket local229 = new Socket(arg0);
			local229.connect(new InetSocketAddress(this.aString128, this.anInt10292));
			return local229;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString128 + ":" + this.anInt10292 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString128 + ":" + this.anInt10292 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(87) BufferedReader local87 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(90) String local90 = local87.readLine();
		if (local90 != null) {
			if (local90.startsWith("HTTP/1.0 200") || local90.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local90.startsWith("HTTP/1.0 407") || local90.startsWith("HTTP/1.1 407")) {
				@Pc(129) int local129 = 0;
				local90 = local87.readLine();
				@Pc(136) String local136 = "proxy-authenticate: ";
				while (local90 != null && local129 < 50) {
					if (local90.toLowerCase().startsWith(local136)) {
						local90 = local90.substring(local136.length()).trim();
						@Pc(163) int local163 = local90.indexOf(32);
						if (local163 != -1) {
							local90 = local90.substring(0, local163);
						}
						throw new IOException_Sub1(local90);
					}
					local129++;
					local90 = local87.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local87.close();
		local5.close();
		return null;
	}
}
