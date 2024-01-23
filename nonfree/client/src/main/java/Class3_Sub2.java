import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	private final int anInt2091;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
	private final int anInt2086;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private final int anInt2090;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2091 = arg1;
		this.anInt2086 = arg3;
		this.anInt2090 = arg2;
		this.anInt2084 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2084 >> 12;
		@Pc(21) int local21 = this.anInt2090 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt2086 >> 12;
		@Pc(35) int local35 = this.anInt2091 * arg1 >> 12;
		Static123.method2090(local35, super.anInt4875, local21, local28, local10, super.anInt4879);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt2090 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt2084 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt2091 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt2086 >> 12;
		Static36.method707(local15, local22, local29, local36, super.anInt4874);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	@Override
	public void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2084 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2090 >> 12;
		@Pc(29) int local29 = this.anInt2091 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt2086 >> 12;
		Static207.method3288(super.anInt4879, local36, local17, local29, super.anInt4874, local10, super.anInt4875);
	}
}
