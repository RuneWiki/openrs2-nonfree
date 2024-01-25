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

@OriginalClass("client!tu")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!tu", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString95 + ":" + this.anInt9255 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString95 + ":" + this.anInt9255 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
							@Pc(124) int local124 = local74.indexOf(32);
							if (local124 != -1) {
								local74 = local74.substring(0, local124);
							}
							throw new IOException_Sub1(local74);
						}
						local74 = local71.readLine();
						local98++;
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

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method7876(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method7875();
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
						@Pc(173) String local173 = (String) local135.invoke(local77, new URL("https://" + this.aString95 + "/"), "https");
						local31 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local31);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(203) Socket local203 = new Socket(arg0);
			local203.connect(new InetSocketAddress(this.aString95, this.anInt9255));
			return local203;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method7874() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(27) boolean local27 = this.anInt9255 == 443;
		@Pc(49) List local49;
		@Pc(71) List local71;
		try {
			local49 = this.aProxySelector1.select(new URI((local27 ? "https" : "http") + "://" + this.aString95));
			local71 = this.aProxySelector1.select(new URI((local27 ? "http" : "https") + "://" + this.aString95));
		} catch (@Pc(73) URISyntaxException local73) {
			return this.method7875();
		}
		local49.addAll(local71);
		@Pc(84) Object[] local84 = local49.toArray();
		@Pc(86) IOException_Sub1 local86 = null;
		for (@Pc(90) int local90 = 0; local90 < local84.length; local90++) {
			@Pc(102) Object local102 = local84[local90];
			@Pc(105) Proxy local105 = (Proxy) local102;
			try {
				@Pc(110) Socket local110 = this.method7876(local105);
				if (local110 != null) {
					return local110;
				}
			} catch (@Pc(116) IOException_Sub1 local116) {
				local86 = local116;
			} catch (@Pc(120) IOException local120) {
			}
		}
		if (local86 != null) {
			throw local86;
		}
		return this.method7875();
	}
}
