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

@OriginalClass("client!ga")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!ga", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString70 + ":" + this.anInt6641 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString70 + ":" + this.anInt6641 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
				local74 = local71.readLine();
				@Pc(102) String local102 = "proxy-authenticate: ";
				while (local74 != null && local97 < 50) {
					if (local74.toLowerCase().startsWith(local102)) {
						local74 = local74.substring(local102.length()).trim();
						@Pc(125) int local125 = local74.indexOf(32);
						if (local125 != -1) {
							local74 = local74.substring(0, local125);
						}
						throw new IOException_Sub1(local74);
					}
					local97++;
					local74 = local71.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method2988(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5707();
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
						@Pc(125) Method local125 = local56.getDeclaredMethod("getHeaderName");
						local125.setAccessible(true);
						@Pc(156) Method local156 = local56.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local156.setAccessible(true);
						@Pc(166) String local166 = (String) local125.invoke(local99);
						@Pc(194) String local194 = (String) local156.invoke(local99, new URL("https://" + this.aString70 + "/"), "https");
						local53 = local166 + ": " + local194;
					}
				}
			} catch (@Pc(207) Exception local207) {
			}
			return this.httpProxyConnect(local26.getHostName(), local26.getPort(), local53);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(40) Socket local40 = new Socket(arg0);
			local40.connect(new InetSocketAddress(this.aString70, this.anInt6641));
			return local40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method5705() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(17) boolean local17 = this.anInt6641 == 443;
		@Pc(39) List local39;
		@Pc(61) List local61;
		try {
			local39 = this.aProxySelector1.select(new URI((local17 ? "https" : "http") + "://" + this.aString70));
			local61 = this.aProxySelector1.select(new URI((local17 ? "http" : "https") + "://" + this.aString70));
		} catch (@Pc(63) URISyntaxException local63) {
			return this.method5707();
		}
		local39.addAll(local61);
		@Pc(74) Object[] local74 = local39.toArray();
		@Pc(76) IOException_Sub1 local76 = null;
		for (@Pc(86) int local86 = 0; local86 < local74.length; local86++) {
			@Pc(98) Object local98 = local74[local86];
			@Pc(101) Proxy local101 = (Proxy) local98;
			try {
				@Pc(106) Socket local106 = this.method2988(local101);
				if (local106 != null) {
					return local106;
				}
			} catch (@Pc(113) IOException_Sub1 local113) {
				local76 = local113;
			} catch (@Pc(117) IOException local117) {
			}
		}
		if (local76 != null) {
			throw local76;
		}
		return this.method5707();
	}
}
