import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class5_Sub2_Sub25 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	private int anInt7696 = 4;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
	private int anInt7702 = 4;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(28) int local28 = Static597.anInt10025 / this.anInt7702;
			@Pc(33) int local33 = Static591.anInt9907 / this.anInt7696;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method9033(0, Static591.anInt9907 * local39 / local33);
			} else {
				local49 = this.method9033(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static597.anInt10025; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = local95 * Static597.anInt10025 / local28;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(26) int local26 = Static597.anInt10025 / this.anInt7702;
			@Pc(31) int local31 = Static591.anInt9907 / this.anInt7696;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local31 <= 0) {
				local42 = this.method9042(0, 0);
			} else {
				local48 = arg0 % local31;
				local42 = this.method9042(local48 * Static591.anInt9907 / local31, 0);
			}
			for (local48 = 0; local48 < Static597.anInt10025; local48++) {
				if (local26 > 0) {
					@Pc(68) int local68 = local48 % local26;
					local11[local48] = local42[Static597.anInt10025 * local68 / local26];
				} else {
					local11[local48] = local42[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7702 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt7696 = arg0.method5966();
		}
	}
}
