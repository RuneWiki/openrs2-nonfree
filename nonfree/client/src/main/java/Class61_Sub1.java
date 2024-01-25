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

@OriginalClass("client!dea")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6031() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt6843 == 443;
		@Pc(40) List local40;
		@Pc(62) List local62;
		try {
			local40 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString82));
			local62 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString82));
		} catch (@Pc(64) URISyntaxException local64) {
			return this.method6032();
		}
		local40.addAll(local62);
		@Pc(75) Object[] local75 = local40.toArray();
		@Pc(77) IOException_Sub1 local77 = null;
		for (@Pc(81) int local81 = 0; local81 < local75.length; local81++) {
			@Pc(93) Object local93 = local75[local81];
			@Pc(96) Proxy local96 = (Proxy) local93;
			try {
				@Pc(101) Socket local101 = this.method1814(local96);
				if (local101 != null) {
					return local101;
				}
			} catch (@Pc(109) IOException_Sub1 local109) {
				local77 = local109;
			} catch (@Pc(113) IOException local113) {
			}
		}
		if (local77 != null) {
			throw local77;
		}
		return this.method6032();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method1814(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6032();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(32) String local32 = null;
			try {
				@Pc(35) Class local35 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(56) Method local56 = local35.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local56.setAccessible(true);
				@Pc(78) Object local78 = local56.invoke((Object) null, local26.getHostName(), Integer.valueOf(local26.getPort()));
				if (local78 != null) {
					@Pc(86) Method local86 = local35.getDeclaredMethod("supportsPreemptiveAuthorization");
					local86.setAccessible(true);
					if ((Boolean) local86.invoke(local78)) {
						@Pc(104) Method local104 = local35.getDeclaredMethod("getHeaderName");
						local104.setAccessible(true);
						@Pc(135) Method local135 = local35.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local135.setAccessible(true);
						@Pc(145) String local145 = (String) local104.invoke(local78);
						@Pc(173) String local173 = (String) local135.invoke(local78, new URL("https://" + this.aString82 + "/"), "https");
						local32 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local32);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(204) Socket local204 = new Socket(arg0);
			local204.connect(new InetSocketAddress(this.aString82, this.anInt6843));
			return local204;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dea", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt6843 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString82 + ":" + this.anInt6843 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label54: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label54;
					}
					@Pc(99) int local99 = 0;
					@Pc(101) String local101 = "proxy-authenticate: ";
					local75 = local72.readLine();
					while (local75 != null && local99 < 50) {
						if (local75.toLowerCase().startsWith(local101)) {
							local75 = local75.substring(local101.length()).trim();
							@Pc(124) int local124 = local75.indexOf(32);
							if (local124 != -1) {
								local75 = local75.substring(0, local124);
							}
							throw new IOException_Sub1(local75);
						}
						local75 = local72.readLine();
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
}
