import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class27_Sub3 extends Class27 {

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	private final int anInt3759;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	private final int anInt3757;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
	private final int anInt3755;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	private final int anInt3756;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	private final int anInt3762;

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
	private final int anInt3764;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	private final int anInt3753;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	private final int anInt3752;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class27_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3759 = arg6;
		this.anInt3757 = arg0;
		this.anInt3755 = arg4;
		this.anInt3756 = arg2;
		this.anInt3762 = arg7;
		this.anInt3764 = arg5;
		this.anInt3753 = arg1;
		this.anInt3752 = arg3;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
	@Override
	public void method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(III)V")
	@Override
	public void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt3757 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt3753 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt3756 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3752 >> 12;
		@Pc(42) int local42 = this.anInt3755 * arg1 >> 12;
		@Pc(49) int local49 = this.anInt3764 * arg0 >> 12;
		@Pc(56) int local56 = this.anInt3759 * arg1 >> 12;
		@Pc(63) int local63 = arg0 * this.anInt3762 >> 12;
		Static284.method4729(local35, local28, local21, super.anInt6257, local14, local49, local56, local42, local63);
	}
}
