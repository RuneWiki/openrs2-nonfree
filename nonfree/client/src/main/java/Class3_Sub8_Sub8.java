import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class3_Sub8_Sub8 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
	private int anInt4247 = 1;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	private int anInt4248 = 1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(28) int local28 = this.anInt4248 + this.anInt4248 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt4247 + this.anInt4247 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt4248; local53 <= this.anInt4248 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method8779(0, local53 & Static635.anInt10496);
				@Pc(67) int[][] local67 = new int[3][Static91.anInt1849];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt4247; local89 <= this.anInt4247; local89++) {
					@Pc(95) int local95 = local89 & Static348.anInt5973;
					local73 += local85[local95];
					local69 += local77[local95];
					local71 += local81[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (local132 < Static91.anInt1849) {
					local122[local132] = local69 * local44 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = local132 - this.anInt4247 & Static348.anInt5973;
					local71 -= local81[local166];
					local132++;
					local73 -= local85[local166];
					local69 -= local77[local166];
					@Pc(192) int local192 = this.anInt4247 + local132 & Static348.anInt5973;
					local73 += local85[local192];
					local69 += local77[local192];
					local71 += local81[local192];
				}
				local47[local53 + this.anInt4248 - arg0] = local67;
			}
			@Pc(239) int[] local239 = local11[0];
			@Pc(243) int[] local243 = local11[1];
			@Pc(247) int[] local247 = local11[2];
			for (local71 = 0; local71 < Static91.anInt1849; local71++) {
				local73 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local28; local259++) {
					@Pc(265) int[][] local265 = local47[local259];
					local257 += local265[2][local71];
					local73 += local265[0][local71];
					local255 += local265[1][local71];
				}
				local239[local71] = local73 * local32 >> 16;
				local243[local71] = local255 * local32 >> 16;
				local247[local71] = local32 * local257 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt4247 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt4248 = arg1.method7954();
		} else if (arg0 == 2) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(29) int local29 = this.anInt4248 + this.anInt4248 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt4247 + this.anInt4247 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt4248; local54 <= this.anInt4248 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method8776(local54 & Static635.anInt10496, 0);
				@Pc(67) int[] local67 = new int[Static91.anInt1849];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4247; local73 <= this.anInt4247; local73++) {
					local69 += local64[local73 & Static348.anInt5973];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static91.anInt1849) {
					local67[local94] = local45 * local69 >> 16;
					local69 -= local64[Static348.anInt5973 & local94 - this.anInt4247];
					local94++;
					local69 += local64[Static348.anInt5973 & local94 + this.anInt4247];
				}
				local48[this.anInt4248 + local54 - arg0] = local67;
			}
			for (@Pc(154) int local154 = 0; local154 < Static91.anInt1849; local154++) {
				@Pc(158) int local158 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local158 += local48[local69][local154];
				}
				local16[local154] = local33 * local158 >> 16;
			}
		}
		return local16;
	}
}
