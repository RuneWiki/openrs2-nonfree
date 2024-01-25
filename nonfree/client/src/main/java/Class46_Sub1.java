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

@OriginalClass("client!bs")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method6690() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt7975 == 443;
		@Pc(46) List local46;
		@Pc(68) List local68;
		try {
			local46 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString104));
			local68 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString104));
		} catch (@Pc(70) URISyntaxException local70) {
			return this.method6691();
		}
		local46.addAll(local68);
		@Pc(81) Object[] local81 = local46.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(95) Object local95 = local81[local87];
			@Pc(98) Proxy local98 = (Proxy) local95;
			try {
				@Pc(103) Socket local103 = this.method1396(local98);
				if (local103 != null) {
					return local103;
				}
			} catch (@Pc(111) IOException_Sub1 local111) {
				local83 = local111;
			} catch (@Pc(115) IOException local115) {
			}
		}
		if (local83 != null) {
			throw local83;
		}
		return this.method6691();
	}

	@OriginalMember(owner = "client!bs", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString104 + ":" + this.anInt7975 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString104 + ":" + this.anInt7975 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label55: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label55;
					}
					@Pc(99) int local99 = 0;
					@Pc(101) String local101 = "proxy-authenticate: ";
					for (local75 = local72.readLine(); local75 != null && local99 < 50; local75 = local72.readLine()) {
						if (local75.toLowerCase().startsWith(local101)) {
							local75 = local75.substring(local101.length()).trim();
							@Pc(127) int local127 = local75.indexOf(32);
							if (local127 != -1) {
								local75 = local75.substring(0, local127);
							}
							throw new IOException_Sub1(local75);
						}
						local99++;
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

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method1396(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6691();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(27) InetSocketAddress local27 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(53) String local53 = null;
			try {
				@Pc(56) Class local56 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(77) Method local77 = local56.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local77.setAccessible(true);
				@Pc(99) Object local99 = local77.invoke((Object) null, local27.getHostName(), Integer.valueOf(local27.getPort()));
				if (local99 != null) {
					@Pc(108) Method local108 = local56.getDeclaredMethod("supportsPreemptiveAuthorization");
					local108.setAccessible(true);
					if ((Boolean) local108.invoke(local99)) {
						@Pc(125) Method local125 = local56.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local56.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local99);
						@Pc(194) String local194 = (String) local156.invoke(local99, new URL("https://" + this.aString104 + "/"), "https");
						local53 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local27.getHostName(), local27.getPort(), local53);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(40) Socket local40 = new Socket(arg0);
			local40.connect(new InetSocketAddress(this.aString104, this.anInt7975));
			return local40;
		} else {
			return null;
		}
	}
}
