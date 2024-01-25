import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
	private int anInt1315 = 1;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
	private int anInt1318 = 1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(28) int local28 = this.anInt1318 + this.anInt1318 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1315 + this.anInt1315 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt1318; local53 <= arg0 + this.anInt1318; local53++) {
				@Pc(63) int[][] local63 = this.method7700(Static171.anInt3020 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static279.anInt4906];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt1315; local89 <= this.anInt1315; local89++) {
					@Pc(95) int local95 = Static216.anInt4134 & local89;
					local71 += local81[local95];
					local69 += local77[local95];
					local73 += local85[local95];
				}
				@Pc(126) int[] local126 = local67[0];
				@Pc(130) int[] local130 = local67[1];
				@Pc(134) int[] local134 = local67[2];
				@Pc(136) int local136 = 0;
				while (Static279.anInt4906 > local136) {
					local126[local136] = local44 * local69 >> 16;
					local130[local136] = local44 * local71 >> 16;
					local134[local136] = local44 * local73 >> 16;
					@Pc(170) int local170 = local136 - this.anInt1315 & Static216.anInt4134;
					local73 -= local85[local170];
					local69 -= local77[local170];
					local136++;
					local71 -= local81[local170];
					@Pc(196) int local196 = Static216.anInt4134 & this.anInt1315 + local136;
					local69 += local77[local196];
					local71 += local81[local196];
					local73 += local85[local196];
				}
				local47[this.anInt1318 + local53 - arg0] = local67;
			}
			@Pc(243) int[] local243 = local16[0];
			@Pc(247) int[] local247 = local16[1];
			@Pc(251) int[] local251 = local16[2];
			for (local71 = 0; local71 < Static279.anInt4906; local71++) {
				local73 = 0;
				@Pc(259) int local259 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local28; local263++) {
					@Pc(269) int[][] local269 = local47[local263];
					local73 += local269[0][local71];
					local259 += local269[1][local71];
					local261 += local269[2][local71];
				}
				local243[local71] = local32 * local73 >> 16;
				local247[local71] = local259 * local32 >> 16;
				local251[local71] = local32 * local261 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(31) int local31 = this.anInt1318 + this.anInt1318 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt1315 + this.anInt1315 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local31][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt1318; local57 <= arg0 + this.anInt1318; local57++) {
				@Pc(67) int[] local67 = this.method7709(Static171.anInt3020 & local57, 0);
				@Pc(70) int[] local70 = new int[Static279.anInt4906];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt1315; local76 <= this.anInt1315; local76++) {
					local72 += local67[local76 & Static216.anInt4134];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static279.anInt4906) {
					local70[local93] = local72 * local48 >> 16;
					local72 -= local67[local93 - this.anInt1315 & Static216.anInt4134];
					local93++;
					local72 += local67[Static216.anInt4134 & local93 + this.anInt1315];
				}
				local51[this.anInt1318 + local57 - arg0] = local70;
			}
			for (@Pc(154) int local154 = 0; local154 < Static279.anInt4906; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < local31; local72++) {
					local158 += local51[local72][local154];
				}
				local11[local154] = local35 * local158 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1315 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt1318 = arg0.method5750();
		} else if (arg1 == 2) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}
}
