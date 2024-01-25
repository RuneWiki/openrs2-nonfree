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

@OriginalClass("client!maa")
public final class Class219_Sub1 extends Class219 {

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!maa", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString142 + ":" + this.anInt9427 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString142 + ":" + this.anInt9427 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
				local75 = local72.readLine();
				@Pc(104) String local104 = "proxy-authenticate: ";
				while (local75 != null && local99 < 50) {
					if (local75.toLowerCase().startsWith(local104)) {
						local75 = local75.substring(local104.length()).trim();
						@Pc(126) int local126 = local75.indexOf(32);
						if (local126 != -1) {
							local75 = local75.substring(0, local126);
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

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method4652(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method7533();
		}
		@Pc(12) SocketAddress local12 = arg0.address();
		if (!(local12 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(21) InetSocketAddress local21 = (InetSocketAddress) local12;
		if (arg0.type() == Type.HTTP) {
			@Pc(33) String local33 = null;
			try {
				@Pc(36) Class local36 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(57) Method local57 = local36.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local57.setAccessible(true);
				@Pc(79) Object local79 = local57.invoke(null, local21.getHostName(), Integer.valueOf(local21.getPort()));
				if (local79 != null) {
					@Pc(88) Method local88 = local36.getDeclaredMethod("supportsPreemptiveAuthorization");
					local88.setAccessible(true);
					if ((Boolean) local88.invoke(local79)) {
						@Pc(105) Method local105 = local36.getDeclaredMethod("getHeaderName");
						local105.setAccessible(true);
						@Pc(136) Method local136 = local36.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local136.setAccessible(true);
						@Pc(146) String local146 = (String) local105.invoke(local79);
						@Pc(174) String local174 = (String) local136.invoke(local79, new URL("https://" + this.aString142 + "/"), "https");
						local33 = local146 + ": " + local174;
					}
				}
			} catch (@Pc(187) Exception local187) {
			}
			return this.httpProxyConnect(local21.getHostName(), local21.getPort(), local33);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(205) Socket local205 = new Socket(arg0);
			local205.connect(new InetSocketAddress(this.aString142, this.anInt9427));
			return local205;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7531() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt9427 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString142));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString142));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method7533();
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(86) IOException_Sub1 local86 = null;
		for (@Pc(90) int local90 = 0; local90 < local76.length; local90++) {
			@Pc(98) Object local98 = local76[local90];
			@Pc(101) Proxy local101 = (Proxy) local98;
			try {
				@Pc(106) Socket local106 = this.method4652(local101);
				if (local106 != null) {
					return local106;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local86 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local86 != null) {
			throw local86;
		}
		return this.method7533();
	}
}
