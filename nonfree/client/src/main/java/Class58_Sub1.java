import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "Lclient!du;")
	private final Class71 aClass71_1;

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "Lclient!da;")
	private final Class60 aClass60_1;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class58_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass71_1 = new Class71(this.aSocket1.getInputStream(), arg1);
		this.aClass60_1 = new Class60(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(III[B)I")
	@Override
	public int method4918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass71_1.method2090(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4910(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass60_1.method1401(arg0, arg1);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	@Override
	public void method4914() {
		this.aClass71_1.method2091();
		this.aClass60_1.method1399();
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method4916(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass71_1.method2085(arg0);
	}

	@OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4920();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	@Override
	public void method4920() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass71_1.method2086();
		this.aClass60_1.method1400();
	}
}
