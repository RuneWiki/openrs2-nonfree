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

@OriginalClass("client!wt")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method8775(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8773();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(44) String local44 = null;
			try {
				@Pc(47) Class local47 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(68) Method local68 = local47.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local68.setAccessible(true);
				@Pc(90) Object local90 = local68.invoke((Object) null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local90 != null) {
					@Pc(98) Method local98 = local47.getDeclaredMethod("supportsPreemptiveAuthorization");
					local98.setAccessible(true);
					if ((Boolean) local98.invoke(local90)) {
						@Pc(116) Method local116 = local47.getDeclaredMethod("getHeaderName");
						local116.setAccessible(true);
						@Pc(147) Method local147 = local47.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local147.setAccessible(true);
						@Pc(157) String local157 = (String) local116.invoke(local90);
						@Pc(185) String local185 = (String) local147.invoke(local90, new URL("https://" + this.aString116 + "/"), "https");
						local44 = local157 + ": " + local185;
					}
				}
			} catch (@Pc(198) Exception local198) {
			}
			return this.httpProxyConnect(local18.getHostName(), local18.getPort(), local44);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(31) Socket local31 = new Socket(arg0);
			local31.connect(new InetSocketAddress(this.aString116, this.anInt10756));
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8770() throws IOException {
		@Pc(9) boolean local9 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local9) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt10756 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString116));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString116));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method8773();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method8775(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(115) IOException_Sub1 local115) {
				local84 = local115;
			} catch (@Pc(119) IOException local119) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method8773();
	}

	@OriginalMember(owner = "client!wt", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString116 + ":" + this.anInt10756 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString116 + ":" + this.anInt10756 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					for (local75 = local72.readLine(); local75 != null && local99 < 50; local75 = local72.readLine()) {
						if (local75.toLowerCase().startsWith(local101)) {
							local75 = local75.substring(local101.length()).trim();
							@Pc(124) int local124 = local75.indexOf(32);
							if (local124 != -1) {
								local75 = local75.substring(0, local124);
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
}
