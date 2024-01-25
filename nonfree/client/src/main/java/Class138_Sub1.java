import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class138_Sub1 extends Class138 implements Interface11 {

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	private int anInt4312;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!bt;I[BIZ)V")
	public Class138_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4312 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)I")
	@Override
	public int method4366() {
		return super.anInt5393;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	@Override
	protected void method4492() {
		super.aClass30_Sub1_34.method751(this);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)J")
	@Override
	public long method4364() {
		return 0L;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4363(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4490(arg0, arg1);
		this.anInt4312 = 5123;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
	@Override
	public int method4365() {
		return this.anInt4312;
	}
}
