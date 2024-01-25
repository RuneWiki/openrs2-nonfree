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

@OriginalClass("client!bea")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bea", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt7834 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt7834 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					local74 = local71.readLine();
					@Pc(103) String local103 = "proxy-authenticate: ";
					while (local74 != null && local98 < 50) {
						if (local74.toLowerCase().startsWith(local103)) {
							local74 = local74.substring(local103.length()).trim();
							@Pc(126) int local126 = local74.indexOf(32);
							if (local126 != -1) {
								local74 = local74.substring(0, local126);
							}
							throw new IOException_Sub1(local74);
						}
						local98++;
						local74 = local71.readLine();
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

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6500() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt7834 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString82));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString82));
		} catch (@Pc(66) URISyntaxException local66) {
			return this.method6498();
		}
		local42.addAll(local64);
		@Pc(77) Object[] local77 = local42.toArray();
		@Pc(87) IOException_Sub1 local87 = null;
		for (@Pc(91) int local91 = 0; local91 < local77.length; local91++) {
			@Pc(103) Object local103 = local77[local91];
			@Pc(106) Proxy local106 = (Proxy) local103;
			try {
				@Pc(111) Socket local111 = this.method885(local106);
				if (local111 != null) {
					return local111;
				}
			} catch (@Pc(117) IOException_Sub1 local117) {
				local87 = local117;
			} catch (@Pc(121) IOException local121) {
			}
		}
		if (local87 != null) {
			throw local87;
		}
		return this.method6498();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method885(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6498();
		}
		@Pc(17) SocketAddress local17 = arg0.address();
		if (!(local17 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local17;
		if (arg0.type() == Type.HTTP) {
			@Pc(53) String local53 = null;
			try {
				@Pc(56) Class local56 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(77) Method local77 = local56.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local77.setAccessible(true);
				@Pc(99) Object local99 = local77.invoke(null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local99 != null) {
					@Pc(108) Method local108 = local56.getDeclaredMethod("supportsPreemptiveAuthorization");
					local108.setAccessible(true);
					if ((Boolean) local108.invoke(local99)) {
						@Pc(126) Method local126 = local56.getDeclaredMethod("getHeaderName");
						local126.setAccessible(true);
						@Pc(157) Method local157 = local56.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local157.setAccessible(true);
						@Pc(167) String local167 = (String) local126.invoke(local99);
						@Pc(195) String local195 = (String) local157.invoke(local99, new URL("https://" + this.aString82 + "/"), "https");
						local53 = local167 + ": " + local195;
					}
				}
			} catch (@Pc(208) Exception local208) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local53);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(40) Socket local40 = new Socket(arg0);
			local40.connect(new InetSocketAddress(this.aString82, this.anInt7834));
			return local40;
		} else {
			return null;
		}
	}
}
