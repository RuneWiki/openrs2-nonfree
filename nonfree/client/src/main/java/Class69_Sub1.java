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

@OriginalClass("client!dl")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!dl", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		local11.write(("CONNECT " + this.aString66 + ":" + this.anInt4617 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
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

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method3986() throws IOException {
		@Pc(9) boolean local9 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local9) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(25) boolean local25 = this.anInt4617 == 443;
		@Pc(47) List local47;
		@Pc(69) List local69;
		try {
			local47 = this.aProxySelector1.select(new URI((local25 ? "https" : "http") + "://" + this.aString66));
			local69 = this.aProxySelector1.select(new URI((local25 ? "http" : "https") + "://" + this.aString66));
		} catch (@Pc(71) URISyntaxException local71) {
			return this.method3985();
		}
		local47.addAll(local69);
		@Pc(82) Object[] local82 = local47.toArray();
		for (@Pc(86) int local86 = 0; local86 < local82.length; local86++) {
			@Pc(94) Object local94 = local82[local86];
			@Pc(97) Proxy local97 = (Proxy) local94;
			try {
				@Pc(102) Socket local102 = this.method1442(local97);
				if (local102 != null) {
					return local102;
				}
			} catch (@Pc(108) IOException local108) {
			}
		}
		return this.method3985();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	private Socket method1442(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method3985();
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(24) InetSocketAddress local24 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			return this.httpProxyConnect(local24.getHostName(), local24.getPort());
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(44) Socket local44 = new Socket(arg0);
			local44.connect(new InetSocketAddress(this.aString66, this.anInt4617));
			return local44;
		} else {
			return null;
		}
	}
}
