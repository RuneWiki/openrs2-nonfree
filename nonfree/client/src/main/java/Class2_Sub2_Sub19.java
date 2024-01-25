import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!im", name = "C", descriptor = "I")
	private int anInt3008 = 2048;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	private int anInt3012 = 1024;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "I")
	private int anInt3013 = 3072;

	static {
		new Class134("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int[] local28 = this.method5472(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static217.anInt3574; local30++) {
				local18[local30] = (local28[local30] * this.anInt3008 >> 12) + this.anInt3012;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3012 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt3013 = arg0.method3555();
		} else if (arg1 == 2) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.anInt3008 = this.anInt3013 - this.anInt3012;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(21) int[][] local21 = this.method5474(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static217.anInt3574; local47++) {
				local37[local47] = (local25[local47] * this.anInt3008 >> 12) + this.anInt3012;
				local41[local47] = this.anInt3012 + (this.anInt3008 * local29[local47] >> 12);
				local45[local47] = (this.anInt3008 * local33[local47] >> 12) + this.anInt3012;
			}
		}
		return local11;
	}
}
