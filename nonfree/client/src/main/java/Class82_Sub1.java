import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class82_Sub1 extends Class82 implements Interface8 {

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	private int anInt1953;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!bl;I[BIZ)V")
	public Class82_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1953 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method4284(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4741(arg1, arg0);
		this.anInt1953 = 5123;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)J")
	@Override
	public long method4283() {
		return 0L;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)I")
	@Override
	public int method4285() {
		return super.anInt5625;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	@Override
	protected void method4743() {
		super.aClass28_Sub1_31.method655(this);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I")
	@Override
	public int method4286() {
		return this.anInt1953;
	}
}
