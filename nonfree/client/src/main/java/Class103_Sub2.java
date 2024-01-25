import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class103_Sub2 extends Class103 implements Interface4 {

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt4431;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!bo;I[BIZ)V")
	public Class103_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt4431 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J")
	@Override
	public long method3584() {
		return 0L;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	@Override
	protected void method3579() {
		super.aClass26_Sub1_22.method702(this);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIII)V")
	@Override
	public void method3583(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method3580(arg0, arg1);
		this.anInt4431 = 5123;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	@Override
	public int method3582() {
		return super.anInt4426;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	@Override
	public int method3585() {
		return this.anInt4431;
	}
}
