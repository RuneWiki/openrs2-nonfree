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

@OriginalClass("client!bo")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method649(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4645();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(31) String local31 = null;
			try {
				@Pc(34) Class local34 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(55) Method local55 = local34.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local55.setAccessible(true);
				@Pc(77) Object local77 = local55.invoke(null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local77 != null) {
					@Pc(87) Method local87 = local34.getDeclaredMethod("supportsPreemptiveAuthorization");
					local87.setAccessible(true);
					if ((Boolean) local87.invoke(local77)) {
						@Pc(104) Method local104 = local34.getDeclaredMethod("getHeaderName");
						local104.setAccessible(true);
						@Pc(135) Method local135 = local34.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local135.setAccessible(true);
						@Pc(145) String local145 = (String) local104.invoke(local77);
						@Pc(173) String local173 = (String) local135.invoke(local77, new URL("https://" + this.aString55 + "/"), "https");
						local31 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local31);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(204) Socket local204 = new Socket(arg0);
			local204.connect(new InetSocketAddress(this.aString55, this.anInt5659));
			return local204;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method4644() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt5659 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString55));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString55));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method4645();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		for (@Pc(82) int local82 = 0; local82 < local76.length; local82++) {
			@Pc(94) Object local94 = local76[local82];
			@Pc(97) Proxy local97 = (Proxy) local94;
			try {
				@Pc(102) Socket local102 = this.method649(local97);
				if (local102 != null) {
					return local102;
				}
			} catch (@Pc(109) IOException_Sub1 local109) {
				local78 = local109;
			} catch (@Pc(113) IOException local113) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method4645();
	}

	@OriginalMember(owner = "client!bo", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString55 + ":" + this.anInt5659 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString55 + ":" + this.anInt5659 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
}
