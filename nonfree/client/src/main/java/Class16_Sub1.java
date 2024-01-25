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

@OriginalClass("client!hda")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6927() throws IOException {
		@Pc(11) boolean local11 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local11) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(28) boolean local28 = this.anInt8859 == 443;
		@Pc(50) List local50;
		@Pc(72) List local72;
		try {
			local50 = this.aProxySelector1.select(new URI((local28 ? "https" : "http") + "://" + this.aString236));
			local72 = this.aProxySelector1.select(new URI((local28 ? "http" : "https") + "://" + this.aString236));
		} catch (@Pc(74) URISyntaxException local74) {
			return this.method6926();
		}
		local50.addAll(local72);
		@Pc(85) Object[] local85 = local50.toArray();
		@Pc(87) IOException_Sub1 local87 = null;
		for (@Pc(91) int local91 = 0; local91 < local85.length; local91++) {
			@Pc(99) Object local99 = local85[local91];
			@Pc(102) Proxy local102 = (Proxy) local99;
			try {
				@Pc(107) Socket local107 = this.method3347(local102);
				if (local107 != null) {
					return local107;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local87 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local87 != null) {
			throw local87;
		}
		return this.method6926();
	}

	@OriginalMember(owner = "client!hda", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString236 + ":" + this.anInt8859 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString236 + ":" + this.anInt8859 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
				@Pc(102) String local102 = "proxy-authenticate: ";
				for (local75 = local72.readLine(); local75 != null && local100 < 50; local75 = local72.readLine()) {
					if (local75.toLowerCase().startsWith(local102)) {
						local75 = local75.substring(local102.length()).trim();
						@Pc(126) int local126 = local75.indexOf(32);
						if (local126 != -1) {
							local75 = local75.substring(0, local126);
						}
						throw new IOException_Sub1(local75);
					}
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

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method3347(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6926();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(20) InetSocketAddress local20 = (InetSocketAddress) local11;
		if (arg0.type() == Type.HTTP) {
			@Pc(47) String local47 = null;
			try {
				@Pc(50) Class local50 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(71) Method local71 = local50.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local71.setAccessible(true);
				@Pc(93) Object local93 = local71.invoke(null, local20.getHostName(), Integer.valueOf(local20.getPort()));
				if (local93 != null) {
					@Pc(101) Method local101 = local50.getDeclaredMethod("supportsPreemptiveAuthorization");
					local101.setAccessible(true);
					if ((Boolean) local101.invoke(local93)) {
						@Pc(118) Method local118 = local50.getDeclaredMethod("getHeaderName");
						local118.setAccessible(true);
						@Pc(149) Method local149 = local50.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local149.setAccessible(true);
						@Pc(159) String local159 = (String) local118.invoke(local93);
						@Pc(187) String local187 = (String) local149.invoke(local93, new URL("https://" + this.aString236 + "/"), "https");
						local47 = local159 + ": " + local187;
					}
				}
			} catch (@Pc(200) Exception local200) {
			}
			return this.httpProxyConnect(local20.getHostName(), local20.getPort(), local47);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(34) Socket local34 = new Socket(arg0);
			local34.connect(new InetSocketAddress(this.aString236, this.anInt8859));
			return local34;
		} else {
			return null;
		}
	}
}
