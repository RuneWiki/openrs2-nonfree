import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class4_Sub6_Sub19 extends Class4_Sub6 {

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	private int anInt3130 = 1;

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
	private int anInt3131 = 1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(29) int local29 = this.anInt3131 + this.anInt3131 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt3130 + this.anInt3130 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(83) int local83;
			@Pc(81) int local81;
			@Pc(85) int local85;
			for (@Pc(54) int local54 = arg0 - this.anInt3131; local54 <= arg0 + this.anInt3131; local54++) {
				@Pc(75) int[][] local75 = this.method4377(local54 & Static137.anInt2812, 0);
				@Pc(79) int[][] local79 = new int[3][Static2.anInt19];
				local81 = 0;
				local83 = 0;
				local85 = 0;
				@Pc(89) int[] local89 = local75[0];
				@Pc(93) int[] local93 = local75[1];
				@Pc(97) int[] local97 = local75[2];
				for (@Pc(101) int local101 = -this.anInt3130; local101 <= this.anInt3130; local101++) {
					@Pc(109) int local109 = local101 & Static168.anInt3337;
					local83 += local89[local109];
					local85 += local97[local109];
					local81 += local93[local109];
				}
				@Pc(134) int[] local134 = local79[2];
				@Pc(138) int[] local138 = local79[1];
				@Pc(142) int[] local142 = local79[0];
				@Pc(144) int local144 = 0;
				while (local144 < Static2.anInt19) {
					local142[local144] = local83 * local45 >> 16;
					local138[local144] = local81 * local45 >> 16;
					local134[local144] = local85 * local45 >> 16;
					@Pc(183) int local183 = local144 - this.anInt3130 & Static168.anInt3337;
					local83 -= local89[local183];
					local81 -= local93[local183];
					local144++;
					local85 -= local97[local183];
					@Pc(209) int local209 = Static168.anInt3337 & this.anInt3130 + local144;
					local83 += local89[local209];
					local85 += local97[local209];
					local81 += local93[local209];
				}
				local48[local54 + this.anInt3131 - arg0] = local79;
			}
			@Pc(246) int[] local246 = local16[0];
			@Pc(250) int[] local250 = local16[2];
			@Pc(254) int[] local254 = local16[1];
			for (local83 = 0; local83 < Static2.anInt19; local83++) {
				local81 = 0;
				local85 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local29; local267++) {
					@Pc(278) int[][] local278 = local48[local267];
					local265 += local278[2][local83];
					local81 += local278[0][local83];
					local85 += local278[1][local83];
				}
				local246[local83] = local81 * local33 >> 16;
				local254[local83] = local85 * local33 >> 16;
				local250[local83] = local265 * local33 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(28) int local28 = this.anInt3131 + this.anInt3131 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt3130 + this.anInt3130 + 1;
			@Pc(44) int[][] local44 = new int[local28][];
			@Pc(48) int local48 = 65536 / local41;
			@Pc(54) int local54;
			for (local54 = arg0 - this.anInt3131; local54 <= arg0 + this.anInt3131; local54++) {
				@Pc(68) int[] local68 = this.method4372(0, local54 & Static137.anInt2812);
				@Pc(71) int[] local71 = new int[Static2.anInt19];
				@Pc(73) int local73 = 0;
				@Pc(77) int local77;
				for (local77 = -this.anInt3130; local77 <= this.anInt3130; local77++) {
					local73 += local68[local77 & Static168.anInt3337];
				}
				local77 = 0;
				while (Static2.anInt19 > local77) {
					local71[local77] = local48 * local73 >> 16;
					local73 -= local68[local77 - this.anInt3130 & Static168.anInt3337];
					local77++;
					local73 += local68[Static168.anInt3337 & this.anInt3130 + local77];
				}
				local44[local54 + this.anInt3131 - arg0] = local71;
			}
			for (local54 = 0; local54 < Static2.anInt19; local54++) {
				@Pc(159) int local159 = 0;
				for (@Pc(161) int local161 = 0; local161 < local28; local161++) {
					local159 += local44[local161][local54];
				}
				local16[local54] = local159 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3130 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt3131 = arg0.method1874();
		} else if (arg1 == 2) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}
}
