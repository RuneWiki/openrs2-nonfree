import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class223_Sub1 extends Class223 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!ec;")
	private final Class82 aClass82_1;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!kv;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class223_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass82_1 = new Class82(this.aSocket2.getInputStream(), arg1);
		this.aClass181_1 = new Class181(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	@Override
	public void method5111() {
		this.aClass82_1.method2267();
		this.aClass181_1.method4422();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method5106(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass82_1.method2268(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5110(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass82_1.method2265(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	@Override
	public void method5105() {
		try {
			this.aSocket2.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass82_1.method2269();
		this.aClass181_1.method4421();
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5105();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5109(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aClass181_1.method4424(arg1, arg0);
	}
}
