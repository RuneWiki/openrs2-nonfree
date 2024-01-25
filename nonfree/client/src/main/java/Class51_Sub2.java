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

@OriginalClass("client!nu")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method5751() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(18) boolean local18 = this.anInt6831 == 443;
		@Pc(40) List local40;
		@Pc(62) List local62;
		try {
			local40 = this.aProxySelector1.select(new URI((local18 ? "https" : "http") + "://" + this.aString77));
			local62 = this.aProxySelector1.select(new URI((local18 ? "http" : "https") + "://" + this.aString77));
		} catch (@Pc(64) URISyntaxException local64) {
			return this.method5752();
		}
		local40.addAll(local62);
		@Pc(75) Object[] local75 = local40.toArray();
		for (@Pc(86) int local86 = 0; local86 < local75.length; local86++) {
			@Pc(94) Object local94 = local75[local86];
			@Pc(97) Proxy local97 = (Proxy) local94;
			try {
				@Pc(102) Socket local102 = this.method5754(local97);
				if (local102 != null) {
					return local102;
				}
			} catch (@Pc(108) IOException local108) {
			}
		}
		return this.method5752();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method5754(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method5752();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			return this.httpProxyConnect(local24.getHostName(), local24.getPort());
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(45) Socket local45 = new Socket(arg0);
			local45.connect(new InetSocketAddress(this.aString77, this.anInt6831));
			return local45;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		local11.write(("CONNECT " + this.aString77 + ":" + this.anInt6831 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		local11.flush();
		@Pc(43) BufferedReader local43 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(46) String local46 = local43.readLine();
		if (local46 != null && local46.startsWith("HTTP/1.0 200")) {
			return local5;
		} else {
			local11.close();
			local43.close();
			local5.close();
			return null;
		}
	}
}
