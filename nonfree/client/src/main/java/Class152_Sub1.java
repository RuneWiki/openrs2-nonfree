import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class152_Sub1 extends Class152 {

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Lclient!em;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "Lclient!af;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class152_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass80_1 = new Class80(this.aSocket1.getInputStream(), arg1);
		this.aClass7_1 = new Class7(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3910(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass80_1.method2488(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([BBII)I")
	@Override
	public int method3909(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass80_1.method2489(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3908();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
	@Override
	public void method3908() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass80_1.method2490();
		this.aClass7_1.method125();
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	@Override
	public void method3913() {
		this.aClass80_1.method2487();
		this.aClass7_1.method124();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method3911(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass7_1.method123(arg1, arg0);
	}
}
