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

@OriginalClass("client!ij")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ij", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString50 + ":" + this.anInt5967 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString50 + ":" + this.anInt5967 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			if (local75.startsWith("HTTP/1.0 200") || local75.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local75.startsWith("HTTP/1.0 407") || local75.startsWith("HTTP/1.1 407")) {
				@Pc(100) int local100 = 0;
				local75 = local72.readLine();
				@Pc(105) String local105 = "proxy-authenticate: ";
				while (local75 != null && local100 < 50) {
					if (local75.toLowerCase().startsWith(local105)) {
						local75 = local75.substring(local105.length()).trim();
						@Pc(125) int local125 = local75.indexOf(32);
						if (local125 != -1) {
							local75 = local75.substring(0, local125);
						}
						throw new IOException_Sub1(local75);
					}
					local75 = local72.readLine();
					local100++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4964() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt5967 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString50));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString50));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method4961();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method3511(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(116) IOException_Sub1 local116) {
				local84 = local116;
			} catch (@Pc(120) IOException local120) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method4961();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method3511(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4961();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local10;
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
						@Pc(125) Method local125 = local56.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local56.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local99);
						@Pc(194) String local194 = (String) local156.invoke(local99, new URL("https://" + this.aString50 + "/"), "https");
						local53 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local53);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(40) Socket local40 = new Socket(arg0);
			local40.connect(new InetSocketAddress(this.aString50, this.anInt5967));
			return local40;
		} else {
			return null;
		}
	}
}
