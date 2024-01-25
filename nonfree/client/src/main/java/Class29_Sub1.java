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

@OriginalClass("client!bd")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method891() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt957 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString8));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString8));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method890();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method475(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(115) IOException_Sub1 local115) {
				local84 = local115;
			} catch (@Pc(119) IOException local119) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method890();
	}

	@OriginalMember(owner = "client!bd", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString8 + ":" + this.anInt957 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString8 + ":" + this.anInt957 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			label54: {
				if (!local74.startsWith("HTTP/1.0 200") && !local74.startsWith("HTTP/1.1 200")) {
					if (!local74.startsWith("HTTP/1.0 407") && !local74.startsWith("HTTP/1.1 407")) {
						break label54;
					}
					@Pc(98) int local98 = 0;
					@Pc(100) String local100 = "proxy-authenticate: ";
					local74 = local71.readLine();
					while (local74 != null && local98 < 50) {
						if (local74.toLowerCase().startsWith(local100)) {
							local74 = local74.substring(local100.length()).trim();
							@Pc(125) int local125 = local74.indexOf(32);
							if (local125 != -1) {
								local74 = local74.substring(0, local125);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local98++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method475(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method890();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(32) String local32 = null;
			try {
				@Pc(35) Class local35 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(56) Method local56 = local35.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local56.setAccessible(true);
				@Pc(78) Object local78 = local56.invoke((Object) null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local78 != null) {
					@Pc(87) Method local87 = local35.getDeclaredMethod("supportsPreemptiveAuthorization");
					local87.setAccessible(true);
					if ((Boolean) local87.invoke(local78)) {
						@Pc(104) Method local104 = local35.getDeclaredMethod("getHeaderName");
						local104.setAccessible(true);
						@Pc(135) Method local135 = local35.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local135.setAccessible(true);
						@Pc(145) String local145 = (String) local104.invoke(local78);
						@Pc(173) String local173 = (String) local135.invoke(local78, new URL("https://" + this.aString8 + "/"), "https");
						local32 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local32);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(204) Socket local204 = new Socket(arg0);
			local204.connect(new InetSocketAddress(this.aString8, this.anInt957));
			return local204;
		} else {
			return null;
		}
	}
}
