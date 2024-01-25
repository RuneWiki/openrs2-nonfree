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

@OriginalClass("client!bt")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method1103(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4073();
		}
		@Pc(17) SocketAddress local17 = arg0.address();
		if (!(local17 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local17;
		if (arg0.type() == Type.HTTP) {
			@Pc(31) String local31 = null;
			try {
				@Pc(34) Class local34 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(55) Method local55 = local34.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local55.setAccessible(true);
				@Pc(77) Object local77 = local55.invoke((Object) null, local25.getHostName(), Integer.valueOf(local25.getPort()));
				if (local77 != null) {
					@Pc(86) Method local86 = local34.getDeclaredMethod("supportsPreemptiveAuthorization");
					local86.setAccessible(true);
					if ((Boolean) local86.invoke(local77)) {
						@Pc(104) Method local104 = local34.getDeclaredMethod("getHeaderName");
						local104.setAccessible(true);
						@Pc(135) Method local135 = local34.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local135.setAccessible(true);
						@Pc(145) String local145 = (String) local104.invoke(local77);
						@Pc(173) String local173 = (String) local135.invoke(local77, new URL("https://" + this.aString61 + "/"), "https");
						local31 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local31);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(204) Socket local204 = new Socket(arg0);
			local204.connect(new InetSocketAddress(this.aString61, this.anInt4739));
			return local204;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method4072() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt4739 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString61));
			local69 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString61));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method4073();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(96) Object local96 = local82[local88];
			@Pc(99) Proxy local99 = (Proxy) local96;
			try {
				@Pc(104) Socket local104 = this.method1103(local99);
				if (local104 != null) {
					return local104;
				}
			} catch (@Pc(111) IOException_Sub1 local111) {
				local84 = local111;
			} catch (@Pc(115) IOException local115) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method4073();
	}

	@OriginalMember(owner = "client!bt", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString61 + ":" + this.anInt4739 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString61 + ":" + this.anInt4739 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
}
