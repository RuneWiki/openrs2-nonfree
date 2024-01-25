import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "Lclient!vf;")
	private final Class380 aClass380_1;

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "Lclient!bea;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class5_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass380_1 = new Class380(this.aSocket1.getInputStream(), arg1);
		this.aClass34_1 = new Class34(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method111(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass34_1.method583(arg1, arg0);
	}

	@OriginalMember(owner = "client!ada", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method108();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method106(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass380_1.method9171(arg0);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	@Override
	public void method107() {
		this.aClass380_1.method9175();
		this.aClass34_1.method582();
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
	@Override
	public void method108() {
		try {
			this.aSocket1.close();
		} catch (@Pc(11) IOException local11) {
		}
		this.aClass380_1.method9174();
		this.aClass34_1.method585();
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(II[BI)I")
	@Override
	public int method109(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass380_1.method9172(arg2, arg1, arg0);
	}
}
