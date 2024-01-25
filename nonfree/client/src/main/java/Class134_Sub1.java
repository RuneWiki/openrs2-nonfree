import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!ap;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!nda;")
	private final Class197 aClass197_1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class134_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass14_1 = new Class14(this.aSocket2.getInputStream(), arg1);
		this.aClass197_1 = new Class197(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method8117(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass197_1.method5463(arg1, arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	@Override
	public void method8116() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass14_1.method552();
		this.aClass197_1.method5467();
	}

	@OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8116();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method8118(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass14_1.method551(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([BIIZ)I")
	@Override
	public int method8123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass14_1.method548(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	@Override
	public void method8120() {
		this.aClass14_1.method554();
		this.aClass197_1.method5465();
	}
}
