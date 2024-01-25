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

@OriginalClass("client!gm")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!gm", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString66 + ":" + this.anInt5388 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString66 + ":" + this.anInt5388 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
						@Pc(127) int local127 = local75.indexOf(32);
						if (local127 != -1) {
							local75 = local75.substring(0, local127);
						}
						throw new IOException_Sub1(local75);
					}
					local100++;
					local75 = local72.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method4886() throws IOException {
		@Pc(9) boolean local9 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local9) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(23) boolean local23 = this.anInt5388 == 443;
		@Pc(45) List local45;
		@Pc(67) List local67;
		try {
			local45 = this.aProxySelector1.select(new URI((local23 ? "https" : "http") + "://" + this.aString66));
			local67 = this.aProxySelector1.select(new URI((local23 ? "http" : "https") + "://" + this.aString66));
		} catch (@Pc(69) URISyntaxException local69) {
			return this.method4885();
		}
		local45.addAll(local67);
		@Pc(80) Object[] local80 = local45.toArray();
		@Pc(82) IOException_Sub1 local82 = null;
		for (@Pc(86) int local86 = 0; local86 < local80.length; local86++) {
			@Pc(94) Object local94 = local80[local86];
			@Pc(97) Proxy local97 = (Proxy) local94;
			try {
				@Pc(104) Socket local104 = this.method3822(local97);
				if (local104 != null) {
					return local104;
				}
			} catch (@Pc(111) IOException_Sub1 local111) {
				local82 = local111;
			} catch (@Pc(115) IOException local115) {
			}
		}
		if (local82 != null) {
			throw local82;
		}
		return this.method4885();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method3822(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method4885();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			@Pc(30) String local30 = null;
			try {
				@Pc(33) Class local33 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(54) Method local54 = local33.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local54.setAccessible(true);
				@Pc(76) Object local76 = local54.invoke((Object) null, local24.getHostName(), Integer.valueOf(local24.getPort()));
				if (local76 != null) {
					@Pc(85) Method local85 = local33.getDeclaredMethod("supportsPreemptiveAuthorization");
					local85.setAccessible(true);
					if ((Boolean) local85.invoke(local76)) {
						@Pc(102) Method local102 = local33.getDeclaredMethod("getHeaderName");
						local102.setAccessible(true);
						@Pc(133) Method local133 = local33.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local133.setAccessible(true);
						@Pc(143) String local143 = (String) local102.invoke(local76);
						@Pc(171) String local171 = (String) local133.invoke(local76, new URL("https://" + this.aString66 + "/"), "https");
						local30 = local143 + ": " + local171;
					}
				}
			} catch (@Pc(184) Exception local184) {
			}
			return this.httpProxyConnect(local24.getHostName(), local24.getPort(), local30);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(201) Socket local201 = new Socket(arg0);
			local201.connect(new InetSocketAddress(this.aString66, this.anInt5388));
			return local201;
		} else {
			return null;
		}
	}
}
