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

@OriginalClass("client!vh")
public final class Class184_Sub2 extends Class184 {

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
	private Socket method8211(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8209();
		}
		@Pc(18) SocketAddress local18 = arg0.address();
		if (!(local18 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local18;
		if (arg0.type() == Type.HTTP) {
			@Pc(52) String local52 = null;
			try {
				@Pc(55) Class local55 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(76) Method local76 = local55.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local76.setAccessible(true);
				@Pc(98) Object local98 = local76.invoke(null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local98 != null) {
					@Pc(108) Method local108 = local55.getDeclaredMethod("supportsPreemptiveAuthorization");
					local108.setAccessible(true);
					if ((Boolean) local108.invoke(local98)) {
						@Pc(125) Method local125 = local55.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local55.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local98);
						@Pc(194) String local194 = (String) local156.invoke(local98, new URL("https://" + this.aString112 + "/"), "https");
						local52 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local52);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(39) Socket local39 = new Socket(arg0);
			local39.connect(new InetSocketAddress(this.aString112, this.anInt9996));
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString112 + ":" + this.anInt9996 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString112 + ":" + this.anInt9996 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			if (local75.startsWith("HTTP/1.0 200") || local75.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local75.startsWith("HTTP/1.0 407") || local75.startsWith("HTTP/1.1 407")) {
				@Pc(99) int local99 = 0;
				@Pc(101) String local101 = "proxy-authenticate: ";
				local75 = local72.readLine();
				while (local75 != null && local99 < 50) {
					if (local75.toLowerCase().startsWith(local101)) {
						local75 = local75.substring(local101.length()).trim();
						@Pc(127) int local127 = local75.indexOf(32);
						if (local127 != -1) {
							local75 = local75.substring(0, local127);
						}
						throw new IOException_Sub1(local75);
					}
					local75 = local72.readLine();
					local99++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8210() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt9996 == 443;
		@Pc(48) List local48;
		@Pc(70) List local70;
		try {
			local48 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString112));
			local70 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString112));
		} catch (@Pc(72) URISyntaxException local72) {
			return this.method8209();
		}
		local48.addAll(local70);
		@Pc(83) Object[] local83 = local48.toArray();
		@Pc(85) IOException_Sub1 local85 = null;
		for (@Pc(89) int local89 = 0; local89 < local83.length; local89++) {
			@Pc(101) Object local101 = local83[local89];
			@Pc(104) Proxy local104 = (Proxy) local101;
			try {
				@Pc(109) Socket local109 = this.method8211(local104);
				if (local109 != null) {
					return local109;
				}
			} catch (@Pc(115) IOException_Sub1 local115) {
				local85 = local115;
			} catch (@Pc(119) IOException local119) {
			}
		}
		if (local85 != null) {
			throw local85;
		}
		return this.method8209();
	}
}
