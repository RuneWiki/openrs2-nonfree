import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class240_Sub1 extends Class240 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!kea;")
	private final Class197 aClass197_1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!pu;")
	private final Class279 aClass279_1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class240_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass197_1 = new Class197(this.aSocket1.getInputStream(), arg1);
		this.aClass279_1 = new Class279(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III[B)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass279_1.method6856(arg1, arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method5659(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass197_1.method4071(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)I")
	@Override
	public int method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass197_1.method4069(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5658();
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	@Override
	public void method5658() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass197_1.method4074();
		this.aClass279_1.method6855();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	@Override
	public void method5657() {
		this.aClass197_1.method4072();
		this.aClass279_1.method6852();
	}
}
