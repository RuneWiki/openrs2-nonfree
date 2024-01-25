import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class2_Sub1 extends Class2 implements Interface11 {

	@OriginalMember(owner = "client!dha", name = "v", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!gia;I[BIZ)V")
	public Class2_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2263 = arg1;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I")
	@Override
	public int method2436() {
		return super.anInt10937;
	}

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)V")
	@Override
	protected void method9129() {
		super.aClass67_Sub2_43.method3277(this);
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)J")
	@Override
	public long method2435() {
		return 0L;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method2434(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method9134(arg0, arg1);
		this.anInt2263 = 5123;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)I")
	@Override
	public int method2433() {
		return this.anInt2263;
	}
}
