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

@OriginalClass("client!nia")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!nia", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	private Socket method5722(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5719();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(30) String local30 = null;
			try {
				@Pc(33) Class local33 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(54) Method local54 = local33.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local54.setAccessible(true);
				@Pc(76) Object local76 = local54.invoke(null, local24.getHostName(), Integer.valueOf(local24.getPort()));
				if (local76 != null) {
					@Pc(85) Method local85 = local33.getDeclaredMethod("supportsPreemptiveAuthorization");
					local85.setAccessible(true);
					if ((Boolean) local85.invoke(local76)) {
						@Pc(103) Method local103 = local33.getDeclaredMethod("getHeaderName");
						local103.setAccessible(true);
						@Pc(134) Method local134 = local33.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local134.setAccessible(true);
						@Pc(144) String local144 = (String) local103.invoke(local76);
						@Pc(172) String local172 = (String) local134.invoke(local76, new URL("https://" + this.aString66 + "/"), "https");
						local30 = local144 + ": " + local172;
					}
				}
			} catch (@Pc(185) Exception local185) {
			}
			return this.httpProxyConnect(local24.getHostName(), local24.getPort(), local30);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(202) Socket local202 = new Socket(arg0);
			local202.connect(new InetSocketAddress(this.aString66, this.anInt6805));
			return local202;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nia", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString66 + ":" + this.anInt6805 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString66 + ":" + this.anInt6805 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label56: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label56;
					}
					@Pc(101) int local101 = 0;
					@Pc(103) String local103 = "proxy-authenticate: ";
					for (local75 = local72.readLine(); local75 != null && local101 < 50; local75 = local72.readLine()) {
						if (local75.toLowerCase().startsWith(local103)) {
							local75 = local75.substring(local103.length()).trim();
							@Pc(129) int local129 = local75.indexOf(32);
							if (local129 != -1) {
								local75 = local75.substring(0, local129);
							}
							throw new IOException_Sub1(local75);
						}
						local101++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5721() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(24) boolean local24 = this.anInt6805 == 443;
		@Pc(46) List local46;
		@Pc(68) List local68;
		try {
			local46 = this.aProxySelector1.select(new URI((local24 ? "https" : "http") + "://" + this.aString66));
			local68 = this.aProxySelector1.select(new URI((local24 ? "http" : "https") + "://" + this.aString66));
		} catch (@Pc(70) URISyntaxException local70) {
			return this.method5719();
		}
		local46.addAll(local68);
		@Pc(81) Object[] local81 = local46.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(95) Object local95 = local81[local87];
			@Pc(98) Proxy local98 = (Proxy) local95;
			try {
				@Pc(103) Socket local103 = this.method5722(local98);
				if (local103 != null) {
					return local103;
				}
			} catch (@Pc(110) IOException_Sub1 local110) {
				local83 = local110;
			} catch (@Pc(114) IOException local114) {
			}
		}
		if (local83 != null) {
			throw local83;
		}
		return this.method5719();
	}
}
