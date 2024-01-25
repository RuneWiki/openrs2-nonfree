import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	static {
		new Class134("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		new Class134("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(27) int[] local27 = this.method5472(arg0, 0);
			@Pc(33) int[] local33 = this.method5472(arg0, 1);
			@Pc(39) int[] local39 = this.method5472(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static217.anInt3574; local41++) {
				@Pc(47) int local47 = local39[local41];
				if (local47 == 4096) {
					local11[local41] = local27[local41];
				} else if (local47 == 0) {
					local11[local41] = local33[local41];
				} else {
					local11[local41] = local27[local41] * local47 + local33[local41] * (4096 - local47) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(29) int[] local29 = this.method5472(arg0, 2);
			@Pc(37) int[][] local37 = this.method5474(0, arg0);
			@Pc(45) int[][] local45 = this.method5474(1, arg0);
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(61) int[] local61 = local37[0];
			@Pc(65) int[] local65 = local37[1];
			@Pc(69) int[] local69 = local37[2];
			@Pc(73) int[] local73 = local45[0];
			@Pc(77) int[] local77 = local45[1];
			@Pc(81) int[] local81 = local45[2];
			for (@Pc(83) int local83 = 0; local83 < Static217.anInt3574; local83++) {
				@Pc(89) int local89 = local29[local83];
				if (local89 == 4096) {
					local49[local83] = local61[local83];
					local53[local83] = local65[local83];
					local57[local83] = local69[local83];
				} else if (local89 == 0) {
					local49[local83] = local73[local83];
					local53[local83] = local77[local83];
					local57[local83] = local81[local83];
				} else {
					@Pc(119) int local119 = 4096 - local89;
					local49[local83] = local89 * local61[local83] + local119 * local73[local83] >> 12;
					local53[local83] = local65[local83] * local89 + local77[local83] * local119 >> 12;
					local57[local83] = local119 * local81[local83] + local89 * local69[local83] >> 12;
				}
			}
		}
		return local11;
	}
}
