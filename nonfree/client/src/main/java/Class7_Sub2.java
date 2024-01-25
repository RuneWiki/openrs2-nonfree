import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	private final int anInt2553;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	private final int anInt2554;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	private final int anInt2556;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	private final int anInt2558;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIII)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2553 = arg1;
		this.anInt2554 = arg3;
		this.anInt2556 = arg0;
		this.anInt2558 = arg2;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
	@Override
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2556 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt2558 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt2553 >> 12;
		@Pc(35) int local35 = this.anInt2554 * arg1 >> 12;
		Static45.method6528(local28, local35, local21, local10, super.anInt5771);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
	@Override
	public void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2556 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2558 >> 12;
		@Pc(24) int local24 = this.anInt2553 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt2554 * arg0 >> 12;
		Static131.method2327(local10, local17, super.anInt5773, super.anInt5771, local24, super.anInt5772, local37);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	@Override
	public void method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt2556 >> 12;
		@Pc(23) int local23 = this.anInt2558 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt2553 >> 12;
		@Pc(37) int local37 = this.anInt2554 * arg0 >> 12;
		Static161.method2673(local23, super.anInt5773, super.anInt5772, local30, local37, local16);
	}
}
