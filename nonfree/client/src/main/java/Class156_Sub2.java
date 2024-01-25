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

@OriginalClass("client!ip")
public final class Class156_Sub2 extends Class156 {

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ip", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString54 + ":" + this.anInt5335 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString54 + ":" + this.anInt5335 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			label55: {
				if (!local74.startsWith("HTTP/1.0 200") && !local74.startsWith("HTTP/1.1 200")) {
					if (!local74.startsWith("HTTP/1.0 407") && !local74.startsWith("HTTP/1.1 407")) {
						break label55;
					}
					@Pc(98) int local98 = 0;
					local74 = local71.readLine();
					@Pc(103) String local103 = "proxy-authenticate: ";
					while (local74 != null && local98 < 50) {
						if (local74.toLowerCase().startsWith(local103)) {
							local74 = local74.substring(local103.length()).trim();
							@Pc(125) int local125 = local74.indexOf(32);
							if (local125 != -1) {
								local74 = local74.substring(0, local125);
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

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4584() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt5335 == 443;
		@Pc(48) List local48;
		@Pc(70) List local70;
		try {
			local48 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString54));
			local70 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString54));
		} catch (@Pc(72) URISyntaxException local72) {
			return this.method4581();
		}
		local48.addAll(local70);
		@Pc(83) Object[] local83 = local48.toArray();
		@Pc(85) IOException_Sub1 local85 = null;
		for (@Pc(89) int local89 = 0; local89 < local83.length; local89++) {
			@Pc(97) Object local97 = local83[local89];
			@Pc(100) Proxy local100 = (Proxy) local97;
			try {
				@Pc(105) Socket local105 = this.method4586(local100);
				if (local105 != null) {
					return local105;
				}
			} catch (@Pc(111) IOException_Sub1 local111) {
				local85 = local111;
			} catch (@Pc(115) IOException local115) {
			}
		}
		if (local85 != null) {
			throw local85;
		}
		return this.method4581();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	private Socket method4586(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4581();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(51) String local51 = null;
			try {
				@Pc(54) Class local54 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(75) Method local75 = local54.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local75.setAccessible(true);
				@Pc(97) Object local97 = local75.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local97 != null) {
					@Pc(107) Method local107 = local54.getDeclaredMethod("supportsPreemptiveAuthorization");
					local107.setAccessible(true);
					if ((Boolean) local107.invoke(local97)) {
						@Pc(124) Method local124 = local54.getDeclaredMethod("getHeaderName");
						local124.setAccessible(true);
						@Pc(155) Method local155 = local54.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local155.setAccessible(true);
						@Pc(165) String local165 = (String) local124.invoke(local97);
						@Pc(193) String local193 = (String) local155.invoke(local97, new URL("https://" + this.aString54 + "/"), "https");
						local51 = local165 + ": " + local193;
					}
				}
			} catch (@Pc(206) Exception local206) {
			}
			return this.httpProxyConnect(local18.getHostName(), local18.getPort(), local51);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(38) Socket local38 = new Socket(arg0);
			local38.connect(new InetSocketAddress(this.aString54, this.anInt5335));
			return local38;
		} else {
			return null;
		}
	}
}
