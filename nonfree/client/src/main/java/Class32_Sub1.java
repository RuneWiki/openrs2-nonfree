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
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bca", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString89 + ":" + this.anInt9485 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString89 + ":" + this.anInt9485 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label57: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label57;
					}
					@Pc(100) int local100 = 0;
					@Pc(102) String local102 = "proxy-authenticate: ";
					local75 = local72.readLine();
					while (local75 != null && local100 < 50) {
						if (local75.toLowerCase().startsWith(local102)) {
							local75 = local75.substring(local102.length()).trim();
							@Pc(126) int local126 = local75.indexOf(32);
							if (local126 != -1) {
								local75 = local75.substring(0, local126);
							}
							throw new IOException_Sub1(local75);
						}
						local75 = local72.readLine();
						local100++;
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

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method7985() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(24) boolean local24 = this.anInt9485 == 443;
		@Pc(46) List local46;
		@Pc(68) List local68;
		try {
			local46 = this.aProxySelector1.select(new URI((local24 ? "https" : "http") + "://" + this.aString89));
			local68 = this.aProxySelector1.select(new URI((local24 ? "http" : "https") + "://" + this.aString89));
		} catch (@Pc(70) URISyntaxException local70) {
			return this.method7983();
		}
		local46.addAll(local68);
		@Pc(81) Object[] local81 = local46.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(95) Object local95 = local81[local87];
			@Pc(98) Proxy local98 = (Proxy) local95;
			try {
				@Pc(105) Socket local105 = this.method536(local98);
				if (local105 != null) {
					return local105;
				}
			} catch (@Pc(111) IOException_Sub1 local111) {
				local83 = local111;
			} catch (@Pc(115) IOException local115) {
			}
		}
		if (local83 != null) {
			throw local83;
		}
		return this.method7983();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method536(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method7983();
		}
		@Pc(19) SocketAddress local19 = arg0.address();
		if (!(local19 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(27) InetSocketAddress local27 = (InetSocketAddress) local19;
		if (arg0.type() == Type.HTTP) {
			@Pc(33) String local33 = null;
			try {
				@Pc(36) Class local36 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(57) Method local57 = local36.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local57.setAccessible(true);
				@Pc(79) Object local79 = local57.invoke((Object) null, local27.getHostName(), Integer.valueOf(local27.getPort()));
				if (local79 != null) {
					@Pc(88) Method local88 = local36.getDeclaredMethod("supportsPreemptiveAuthorization");
					local88.setAccessible(true);
					if ((Boolean) local88.invoke(local79)) {
						@Pc(106) Method local106 = local36.getDeclaredMethod("getHeaderName");
						local106.setAccessible(true);
						@Pc(137) Method local137 = local36.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local137.setAccessible(true);
						@Pc(147) String local147 = (String) local106.invoke(local79);
						@Pc(175) String local175 = (String) local137.invoke(local79, new URL("https://" + this.aString89 + "/"), "https");
						local33 = local147 + ": " + local175;
					}
				}
			} catch (@Pc(188) Exception local188) {
			}
			return this.httpProxyConnect(local27.getHostName(), local27.getPort(), local33);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(206) Socket local206 = new Socket(arg0);
			local206.connect(new InetSocketAddress(this.aString89, this.anInt9485));
			return local206;
		} else {
			return null;
		}
	}
}
