import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	private final int anInt3338;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	private final int anInt3330;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	private final int anInt3335;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
	private final int anInt3334;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIII)V")
	public Class63_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3338 = arg3;
		this.anInt3330 = arg1;
		this.anInt3335 = arg2;
		this.anInt3334 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
	@Override
	public void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3334 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3335 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt3330 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt3338 >> 12;
		Static118.method1612(super.anInt6683, local35, local24, local10, local17);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	@Override
	public void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt3334 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt3335 >> 12;
		@Pc(32) int local32 = this.anInt3330 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3338 >> 12;
		Static445.method5571(local25, local18, super.anInt6683, super.anInt6687, local39, local32, super.anInt6686);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
