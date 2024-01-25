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

@OriginalClass("client!bc")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method822(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method8759();
		}
		@Pc(11) SocketAddress local11 = arg0.address();
		if (!(local11 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(25) InetSocketAddress local25 = (InetSocketAddress) local11;
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
						@Pc(173) String local173 = (String) local135.invoke(local77, new URL("https://" + this.aString142 + "/"), "https");
						local31 = local145 + ": " + local173;
					}
				}
			} catch (@Pc(186) Exception local186) {
			}
			return this.httpProxyConnect(local25.getHostName(), local25.getPort(), local31);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(203) Socket local203 = new Socket(arg0);
			local203.connect(new InetSocketAddress(this.aString142, this.anInt10371));
			return local203;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString142 + ":" + this.anInt10371 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString142 + ":" + this.anInt10371 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(71) BufferedReader local71 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(74) String local74 = local71.readLine();
		if (local74 != null) {
			if (local74.startsWith("HTTP/1.0 200") || local74.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local74.startsWith("HTTP/1.0 407") || local74.startsWith("HTTP/1.1 407")) {
				@Pc(99) int local99 = 0;
				@Pc(101) String local101 = "proxy-authenticate: ";
				local74 = local71.readLine();
				while (local74 != null && local99 < 50) {
					if (local74.toLowerCase().startsWith(local101)) {
						local74 = local74.substring(local101.length()).trim();
						@Pc(124) int local124 = local74.indexOf(32);
						if (local124 != -1) {
							local74 = local74.substring(0, local124);
						}
						throw new IOException_Sub1(local74);
					}
					local74 = local71.readLine();
					local99++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local71.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method8761() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt10371 == 443;
		@Pc(40) List local40;
		@Pc(62) List local62;
		try {
			local40 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString142));
			local62 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString142));
		} catch (@Pc(64) URISyntaxException local64) {
			return this.method8759();
		}
		local40.addAll(local62);
		@Pc(82) Object[] local82 = local40.toArray();
		@Pc(84) IOException_Sub1 local84 = null;
		for (@Pc(88) int local88 = 0; local88 < local82.length; local88++) {
			@Pc(100) Object local100 = local82[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method822(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(114) IOException_Sub1 local114) {
				local84 = local114;
			} catch (@Pc(118) IOException local118) {
			}
		}
		if (local84 != null) {
			throw local84;
		}
		return this.method8759();
	}
}
