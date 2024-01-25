import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method6875() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(17) boolean local17 = this.anInt8644 == 443;
		@Pc(39) List local39;
		@Pc(61) List local61;
		try {
			local39 = this.aProxySelector1.select(new URI((local17 ? "https" : "http") + "://" + this.aString72));
			local61 = this.aProxySelector1.select(new URI((local17 ? "http" : "https") + "://" + this.aString72));
		} catch (@Pc(63) URISyntaxException local63) {
			return this.method6873();
		}
		local39.addAll(local61);
		@Pc(74) Object[] local74 = local39.toArray();
		@Pc(76) IOException_Sub1 local76 = null;
		for (@Pc(80) int local80 = 0; local80 < local74.length; local80++) {
			@Pc(92) Object local92 = local74[local80];
			@Pc(95) Proxy local95 = (Proxy) local92;
			try {
				@Pc(100) Socket local100 = this.method5275(local95);
				if (local100 != null) {
					return local100;
				}
			} catch (@Pc(108) IOException_Sub1 local108) {
				local76 = local108;
			} catch (@Pc(112) IOException local112) {
			}
		}
		if (local76 != null) {
			throw local76;
		}
		return this.method6873();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method5275(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method6873();
		}
		@Pc(16) SocketAddress local16 = arg0.address();
		if (!(local16 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local16;
		if (arg0.type() == Type.HTTP) {
			return this.httpProxyConnect(local24.getHostName(), local24.getPort());
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(37) Socket local37 = new Socket(arg0);
			local37.connect(new InetSocketAddress(this.aString72, this.anInt8644));
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		local11.write(("CONNECT " + this.aString72 + ":" + this.anInt8644 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		local11.flush();
		@Pc(43) BufferedReader local43 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(46) String local46 = local43.readLine();
		if (local46 != null) {
			if (local46.startsWith("HTTP/1.0 200") || local46.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local46.startsWith("HTTP/1.0 407") || local46.startsWith("HTTP/1.1 407")) {
				@Pc(72) int local72 = 0;
				local46 = local43.readLine();
				@Pc(77) String local77 = "Proxy-Authenticate: ";
				while (local46 != null && local72 < 50) {
					if (local46.startsWith(local77)) {
						local46 = local46.substring(local77.length()).trim();
						@Pc(98) int local98 = local46.indexOf(32);
						if (local98 != -1) {
							local46 = local46.substring(0, local98);
						}
						throw new IOException_Sub1(local46);
					}
					local72++;
					local46 = local43.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local43.close();
		local5.close();
		return null;
	}
}
