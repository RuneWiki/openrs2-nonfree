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

@OriginalClass("client!aba")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Ljava/net/ProxySelector;")
	private final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)Ljava/net/Socket;")
	@Override
	public Socket method172() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(20) boolean local20 = this.anInt110 == 443;
		@Pc(42) List local42;
		@Pc(64) List local64;
		try {
			local42 = this.aProxySelector1.select(new URI((local20 ? "https" : "http") + "://" + this.aString3));
			local64 = this.aProxySelector1.select(new URI((local20 ? "http" : "https") + "://" + this.aString3));
		} catch (@Pc(66) URISyntaxException local66) {
			return this.method171();
		}
		local42.addAll(local64);
		@Pc(77) Object[] local77 = local42.toArray();
		for (@Pc(88) int local88 = 0; local88 < local77.length; local88++) {
			@Pc(100) Object local100 = local77[local88];
			@Pc(103) Proxy local103 = (Proxy) local100;
			try {
				@Pc(108) Socket local108 = this.method175(local103);
				if (local108 != null) {
					return local108;
				}
			} catch (@Pc(115) IOException local115) {
			}
		}
		return this.method171();
	}

	@OriginalMember(owner = "client!aba", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
	private Socket httpProxyConnect(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		local11.write(("CONNECT " + this.aString3 + ":" + this.anInt110 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
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

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
	private Socket method175(@OriginalArg(1) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method171();
		}
		@Pc(17) SocketAddress local17 = arg0.address();
		if (!(local17 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(26) InetSocketAddress local26 = (InetSocketAddress) local17;
		if (arg0.type() == Type.HTTP) {
			return this.httpProxyConnect(local26.getHostName(), local26.getPort());
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(46) Socket local46 = new Socket(arg0);
			local46.connect(new InetSocketAddress(this.aString3, this.anInt110));
			return local46;
		} else {
			return null;
		}
	}
}
