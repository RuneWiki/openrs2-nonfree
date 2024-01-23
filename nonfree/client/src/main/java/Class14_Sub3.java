import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
	private final int anInt2233;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	private final int anInt2229;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	private final int anInt2224;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	private final int anInt2230;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class14_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2233 = arg0;
		this.anInt2229 = arg1;
		this.anInt2224 = arg3;
		this.anInt2230 = arg2;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
	@Override
	public void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt2233 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt2230 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2229 >> 12;
		@Pc(36) int local36 = this.anInt2224 * arg0 >> 12;
		Static185.method3420(local29, local15, local36, super.anInt4055, local22);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2233 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt2229 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt2230 >> 12;
		@Pc(37) int local37 = this.anInt2224 * arg1 >> 12;
		Static104.method1792(local23, local30, local37, super.anInt4056, super.anInt4048, local10);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)V")
	@Override
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2229 >> 12;
		@Pc(17) int local17 = this.anInt2224 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2233 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt2230 * arg0 >> 12;
		Static102.method1742(local24, super.anInt4055, local39, super.anInt4056, super.anInt4048, local10, local17);
	}
}
