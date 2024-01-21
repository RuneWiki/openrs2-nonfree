import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class54_Sub4 extends Class54 {

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
	private final int anInt3677;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	private final int anInt3682;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
	private final int anInt3690;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	private final int anInt3685;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	private final int anInt3688;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	private final int anInt3680;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	private final int anInt3676;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	private final int anInt3674;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class54_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3677 = arg1;
		this.anInt3682 = arg6;
		this.anInt3690 = arg3;
		this.anInt3685 = arg2;
		this.anInt3688 = arg0;
		this.anInt3680 = arg4;
		this.anInt3676 = arg5;
		this.anInt3674 = arg7;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
	@Override
	public void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	@Override
	public void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 * this.anInt3688 >> 12;
		@Pc(18) int local18 = arg1 * this.anInt3677 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3685 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt3690 >> 12;
		@Pc(43) int local43 = this.anInt3680 * arg0 >> 12;
		@Pc(50) int local50 = this.anInt3676 * arg1 >> 12;
		@Pc(57) int local57 = this.anInt3674 * arg1 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt3682 >> 12;
		Static108.method1728(local36, local50, local57, super.anInt3666, local11, local64, local18, local29, local43);
	}
}
