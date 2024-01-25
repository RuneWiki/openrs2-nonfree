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

@OriginalClass("client!oq")
public final class Class203_Sub1 extends Class203 {

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method6521(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8373();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(48) Method local48 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local48.setAccessible(true);
				@Pc(70) Object local70 = local48.invoke((Object) null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local70 != null) {
					@Pc(78) Method local78 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local78.setAccessible(true);
					if ((Boolean) local78.invoke(local70)) {
						@Pc(96) Method local96 = local27.getDeclaredMethod("getHeaderName");
						local96.setAccessible(true);
						@Pc(127) Method local127 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local127.setAccessible(true);
						@Pc(137) String local137 = (String) local96.invoke(local70);
						@Pc(165) String local165 = (String) local127.invoke(local70, new URL("https://" + this.aString112 + "/"), "https");
						local24 = local137 + ": " + local165;
					}
				}
			} catch (@Pc(178) Exception local178) {
			}
			return this.httpProxyConnect(local18.getHostName(), local18.getPort(), local24);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(195) Socket local195 = new Socket(arg0);
			local195.connect(new InetSocketAddress(this.aString112, this.anInt9926));
			return local195;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8374() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt9926 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString112));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString112));
		} catch (@Pc(66) URISyntaxException local66) {
			return this.method8373();
		}
		local42.addAll(local64);
		@Pc(77) Object[] local77 = local42.toArray();
		@Pc(79) IOException_Sub1 local79 = null;
		for (@Pc(89) int local89 = 0; local89 < local77.length; local89++) {
			@Pc(97) Object local97 = local77[local89];
			@Pc(100) Proxy local100 = (Proxy) local97;
			try {
				@Pc(107) Socket local107 = this.method6521(local100);
				if (local107 != null) {
					return local107;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local79 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local79 != null) {
			throw local79;
		}
		return this.method8373();
	}

	@OriginalMember(owner = "client!oq", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString112 + ":" + this.anInt9926 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString112 + ":" + this.anInt9926 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(97) int local97 = 0;
					@Pc(99) String local99 = "proxy-authenticate: ";
					local74 = local71.readLine();
					while (local74 != null && local97 < 50) {
						if (local74.toLowerCase().startsWith(local99)) {
							local74 = local74.substring(local99.length()).trim();
							@Pc(124) int local124 = local74.indexOf(32);
							if (local124 != -1) {
								local74 = local74.substring(0, local124);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local97++;
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
}
