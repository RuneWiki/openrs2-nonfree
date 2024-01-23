import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private final int anInt2610;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	private final int anInt2613;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private final int anInt2614;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private final int anInt2619;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class28_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2610 = arg3;
		this.anInt2613 = arg2;
		this.anInt2614 = arg1;
		this.anInt2619 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	@Override
	public void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2614 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt2610 >> 12;
		@Pc(29) int local29 = this.anInt2619 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt2613 * arg0 >> 12;
		Static199.method3102(super.anInt4144, local22, local36, local29, super.anInt4140, super.anInt4139, local10);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt2619 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2613 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2610 >> 12;
		@Pc(42) int local42 = arg0 * this.anInt2614 >> 12;
		Static209.method3232(local17, super.anInt4139, local42, local6, local35);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
