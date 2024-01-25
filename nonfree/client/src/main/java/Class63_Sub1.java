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

@OriginalClass("client!fn")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method8304() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt10282 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString111));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString111));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method8305();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(96) Object local96 = local82[local88];
			@Pc(99) Proxy local99 = (Proxy) local96;
			try {
				@Pc(104) Socket local104 = this.method3189(local99);
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
		return this.method8305();
	}

	@OriginalMember(owner = "client!fn", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString111 + ":" + this.anInt10282 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString111 + ":" + this.anInt10282 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(72) BufferedReader local72 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(75) String local75 = local72.readLine();
		if (local75 != null) {
			label55: {
				if (!local75.startsWith("HTTP/1.0 200") && !local75.startsWith("HTTP/1.1 200")) {
					if (!local75.startsWith("HTTP/1.0 407") && !local75.startsWith("HTTP/1.1 407")) {
						break label55;
					}
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
				return local5;
			}
		}
		local11.close();
		local72.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	private Socket method3189(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8305();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(19) InetSocketAddress local19 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(45) String local45 = null;
			try {
				@Pc(48) Class local48 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(69) Method local69 = local48.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local69.setAccessible(true);
				@Pc(91) Object local91 = local69.invoke(null, local19.getHostName(), Integer.valueOf(local19.getPort()));
				if (local91 != null) {
					@Pc(99) Method local99 = local48.getDeclaredMethod("supportsPreemptiveAuthorization");
					local99.setAccessible(true);
					if ((Boolean) local99.invoke(local91)) {
						@Pc(117) Method local117 = local48.getDeclaredMethod("getHeaderName");
						local117.setAccessible(true);
						@Pc(148) Method local148 = local48.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local148.setAccessible(true);
						@Pc(158) String local158 = (String) local117.invoke(local91);
						@Pc(186) String local186 = (String) local148.invoke(local91, new URL("https://" + this.aString111 + "/"), "https");
						local45 = local158 + ": " + local186;
					}
				}
			} catch (@Pc(199) Exception local199) {
			}
			return this.httpProxyConnect(local19.getHostName(), local19.getPort(), local45);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(32) Socket local32 = new Socket(arg0);
			local32.connect(new InetSocketAddress(this.aString111, this.anInt10282));
			return local32;
		} else {
			return null;
		}
	}
}
