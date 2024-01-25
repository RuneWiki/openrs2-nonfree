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

@OriginalClass("client!gaa")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!gaa", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString52 + ":" + this.anInt3113 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString52 + ":" + this.anInt3113 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			if (local74.startsWith("HTTP/1.0 200") || local74.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local74.startsWith("HTTP/1.0 407") || local74.startsWith("HTTP/1.1 407")) {
				@Pc(97) int local97 = 0;
				@Pc(99) String local99 = "proxy-authenticate: ";
				for (local74 = local71.readLine(); local74 != null && local97 < 50; local74 = local71.readLine()) {
					if (local74.toLowerCase().startsWith(local99)) {
						local74 = local74.substring(local99.length()).trim();
						@Pc(125) int local125 = local74.indexOf(32);
						if (local125 != -1) {
							local74 = local74.substring(0, local125);
						}
						throw new IOException_Sub1(local74);
					}
					local97++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method2659(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method2655();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(51) String local51 = null;
			try {
				@Pc(54) Class local54 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(75) Method local75 = local54.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local75.setAccessible(true);
				@Pc(97) Object local97 = local75.invoke((Object) null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local97 != null) {
					@Pc(106) Method local106 = local54.getDeclaredMethod("supportsPreemptiveAuthorization");
					local106.setAccessible(true);
					if ((Boolean) local106.invoke(local97)) {
						@Pc(123) Method local123 = local54.getDeclaredMethod("getHeaderName");
						local123.setAccessible(true);
						@Pc(154) Method local154 = local54.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local154.setAccessible(true);
						@Pc(164) String local164 = (String) local123.invoke(local97);
						@Pc(192) String local192 = (String) local154.invoke(local97, new URL("https://" + this.aString52 + "/"), "https");
						local51 = local164 + ": " + local192;
					}
				}
			} catch (@Pc(205) Exception local205) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local51);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(38) Socket local38 = new Socket(arg0);
			local38.connect(new InetSocketAddress(this.aString52, this.anInt3113));
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method2658() throws IOException {
		@Pc(10) boolean local10 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local10) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(24) boolean local24 = this.anInt3113 == 443;
		@Pc(46) List local46;
		@Pc(68) List local68;
		try {
			local46 = this.aProxySelector1.select(new URI((local24 ? "https" : "http") + "://" + this.aString52));
			local68 = this.aProxySelector1.select(new URI((local24 ? "http" : "https") + "://" + this.aString52));
		} catch (@Pc(70) URISyntaxException local70) {
			return this.method2655();
		}
		local46.addAll(local68);
		@Pc(81) Object[] local81 = local46.toArray();
		@Pc(83) IOException_Sub1 local83 = null;
		for (@Pc(87) int local87 = 0; local87 < local81.length; local87++) {
			@Pc(95) Object local95 = local81[local87];
			@Pc(98) Proxy local98 = (Proxy) local95;
			try {
				@Pc(103) Socket local103 = this.method2659(local98);
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
		return this.method2655();
	}
}
