import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class7_Sub3_Sub17 extends Class7_Sub3 {

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "[Lclient!eb;")
	private Class60[] aClass60Array1;

	static {
		new Class55("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([[IB)V")
	private void method2902(@OriginalArg(0) int[][] arg0) {
		@Pc(11) int local11 = Static58.anInt1052;
		@Pc(13) int local13 = Static383.anInt6175;
		Static373.method4785(arg0);
		Static205.method2955(Static25.anInt366, Static410.anInt6497);
		if (this.aClass60Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass60Array1.length; local29++) {
			@Pc(36) Class60 local36 = this.aClass60Array1[local29];
			@Pc(39) int local39 = local36.anInt4587;
			@Pc(42) int local42 = local36.anInt4585;
			if (local39 < 0) {
				if (local42 >= 0) {
					local36.method3643(local11, local13);
				}
			} else if (local42 >= 0) {
				local36.method3640(local13, local11);
			} else {
				local36.method3642(local13, local11);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.aClass60Array1 = new Class60[arg1.method3981()];
			for (@Pc(40) int local40 = 0; local40 < this.aClass60Array1.length; local40++) {
				@Pc(46) int local46 = arg1.method3981();
				if (local46 == 0) {
					this.aClass60Array1[local40] = Static28.method311(arg1);
				} else if (local46 == 1) {
					this.aClass60Array1[local40] = Static15.method169(arg1);
				} else if (local46 == 2) {
					this.aClass60Array1[local40] = Static214.method2091(arg1);
				} else if (local46 == 3) {
					this.aClass60Array1[local40] = Static366.method4712(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean490 = arg1.method3981() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			this.method2902(super.aClass113_41.method2457());
		}
		return local14;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(17) int local17 = Static58.anInt1052;
			@Pc(19) int local19 = Static383.anInt6175;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass235_41.method4859();
			this.method2902(local23);
			for (@Pc(34) int local34 = 0; local34 < Static383.anInt6175; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static58.anInt1052; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
