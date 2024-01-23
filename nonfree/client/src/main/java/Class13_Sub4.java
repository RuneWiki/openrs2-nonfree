import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	private final int anInt3328;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private final int anInt3325;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	private final int anInt3327;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
	private final int anInt3331;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class13_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3328 = arg3;
		this.anInt3325 = arg0;
		this.anInt3327 = arg2;
		this.anInt3331 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
	@Override
	public void method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	@Override
	public void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3325 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3327 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt3331 >> 12;
		@Pc(36) int local36 = this.anInt3328 * arg1 >> 12;
		Static131.method2210(local17, local36, super.anInt3322, super.anInt3315, local10, super.anInt3316, local29);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
	@Override
	public void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3327 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt3331 * arg1 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt3328 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3325 >> 12;
		Static71.method1020(local28, super.anInt3315, local35, local21, local6);
	}
}
