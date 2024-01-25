import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!vda;")
	private final Class351 aClass351_1;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!pfa;")
	private final Class259 aClass259_1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class51_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass351_1 = new Class351(this.aSocket1.getInputStream(), arg1);
		this.aClass259_1 = new Class259(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3508();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3510(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass259_1.method6578(arg1, arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[BZ)I")
	@Override
	public int method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		return this.aClass351_1.method8156(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	@Override
	public void method3512() {
		this.aClass351_1.method8153();
		this.aClass259_1.method6579();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	@Override
	public void method3508() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass351_1.method8154();
		this.aClass259_1.method6582();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method3507(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass351_1.method8157(arg0);
	}
}
