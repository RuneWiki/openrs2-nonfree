import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class4_Sub4_Sub19 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	private int anInt3930 = 1;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
	private int anInt3931 = 1;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(30) int local30 = this.anInt3930 + this.anInt3930 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt3931 + this.anInt3931 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local30][];
			@Pc(72) int local72;
			for (@Pc(55) int local55 = arg0 - this.anInt3930; local55 <= this.anInt3930 + arg0; local55++) {
				@Pc(67) int[] local67 = this.method5386(0, Static59.anInt1278 & local55);
				@Pc(70) int[] local70 = new int[Static124.anInt3576];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt3931; local76 <= this.anInt3931; local76++) {
					local72 += local67[Static350.anInt6802 & local76];
				}
				@Pc(97) int local97 = 0;
				while (local97 < Static124.anInt3576) {
					local70[local97] = local72 * local46 >> 16;
					local72 -= local67[local97 - this.anInt3931 & Static350.anInt6802];
					local97++;
					local72 += local67[Static350.anInt6802 & this.anInt3931 + local97];
				}
				local49[local55 + this.anInt3930 - arg0] = local70;
			}
			for (@Pc(154) int local154 = 0; local154 < Static124.anInt3576; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < local30; local72++) {
					local158 += local49[local72][local154];
				}
				local11[local154] = local158 * local34 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3931 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt3930 = arg1.method2380();
		} else if (arg0 == 2) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(28) int local28 = this.anInt3930 + this.anInt3930 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3931 + this.anInt3931 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt3930; local53 <= this.anInt3930 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method5384(0, Static59.anInt1278 & local53);
				@Pc(67) int[][] local67 = new int[3][Static124.anInt3576];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt3931; local89 <= this.anInt3931; local89++) {
					@Pc(95) int local95 = Static350.anInt6802 & local89;
					local71 += local81[local95];
					local69 += local77[local95];
					local73 += local85[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static124.anInt3576 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local71 * local44 >> 16;
					local130[local132] = local73 * local44 >> 16;
					@Pc(165) int local165 = local132 - this.anInt3931 & Static350.anInt6802;
					local71 -= local81[local165];
					local73 -= local85[local165];
					local132++;
					local69 -= local77[local165];
					@Pc(191) int local191 = Static350.anInt6802 & this.anInt3931 + local132;
					local71 += local81[local191];
					local69 += local77[local191];
					local73 += local85[local191];
				}
				local47[local53 + this.anInt3930 - arg0] = local67;
			}
			@Pc(237) int[] local237 = local16[0];
			@Pc(241) int[] local241 = local16[1];
			@Pc(245) int[] local245 = local16[2];
			for (local71 = 0; local71 < Static124.anInt3576; local71++) {
				local73 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local28; local257++) {
					@Pc(263) int[][] local263 = local47[local257];
					local253 += local263[1][local71];
					local73 += local263[0][local71];
					local255 += local263[2][local71];
				}
				local237[local71] = local32 * local73 >> 16;
				local241[local71] = local32 * local253 >> 16;
				local245[local71] = local255 * local32 >> 16;
			}
		}
		return local16;
	}
}
