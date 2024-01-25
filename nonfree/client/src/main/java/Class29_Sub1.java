import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!jea", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "Lclient!aaa;")
	private final Class2 aClass2_1;

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "Lclient!hw;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class29_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass2_1 = new Class2(this.aSocket1.getInputStream(), arg1);
		this.aClass143_1 = new Class143(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I[BII)I")
	@Override
	public int method4609(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass2_1.method21(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!jea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4606();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4608(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass2_1.method22(arg0);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
	@Override
	public void method4602() {
		this.aClass2_1.method20();
		this.aClass143_1.method3781();
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	@Override
	public void method4606() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass2_1.method19();
		this.aClass143_1.method3786();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4605(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass143_1.method3780(arg1, arg0);
	}
}
