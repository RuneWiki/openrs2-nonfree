import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class278_Sub1 extends Class278 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!lfa;")
	private final Class220 aClass220_1;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "Lclient!ap;")
	private final Class22 aClass22_1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class278_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass220_1 = new Class220(this.aSocket2.getInputStream(), arg1);
		this.aClass22_1 = new Class22(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6651();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III[B)V")
	@Override
	public void method6649(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass22_1.method327(arg0, arg1);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6653(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass220_1.method5228(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method6651() {
		try {
			this.aSocket2.close();
		} catch (@Pc(9) IOException local9) {
		}
		this.aClass220_1.method5226();
		this.aClass22_1.method329();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I[BIB)I")
	@Override
	public int method6650(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass220_1.method5225(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	@Override
	public void method6648() {
		this.aClass220_1.method5227();
		this.aClass22_1.method326();
	}
}
