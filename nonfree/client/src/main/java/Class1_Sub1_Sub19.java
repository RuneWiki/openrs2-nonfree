import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	private int anInt3321 = 1;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt3323 = 1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(29) int local29 = this.anInt3321 + this.anInt3321 + 1;
			@Pc(38) int local38 = this.anInt3323 + this.anInt3323 + 1;
			@Pc(42) int local42 = 65536 / local29;
			@Pc(46) int local46 = 65536 / local38;
			@Pc(49) int[][][] local49 = new int[local29][][];
			@Pc(79) int local79;
			@Pc(85) int local85;
			@Pc(95) int local95;
			for (@Pc(55) int local55 = arg0 - this.anInt3321; local55 <= this.anInt3321 + arg0; local55++) {
				@Pc(73) int[][] local73 = this.method4715(local55 & Static279.anInt5616, 0);
				@Pc(77) int[][] local77 = new int[3][Static62.anInt1350];
				local79 = 0;
				@Pc(83) int[] local83 = local73[0];
				local85 = 0;
				@Pc(89) int[] local89 = local73[1];
				@Pc(93) int[] local93 = local73[2];
				local95 = 0;
				for (@Pc(99) int local99 = -this.anInt3323; local99 <= this.anInt3323; local99++) {
					@Pc(111) int local111 = local99 & Static302.anInt6003;
					local95 += local93[local111];
					local85 += local89[local111];
					local79 += local83[local111];
				}
				@Pc(136) int[] local136 = local77[0];
				@Pc(140) int[] local140 = local77[1];
				@Pc(144) int[] local144 = local77[2];
				@Pc(146) int local146 = 0;
				while (Static62.anInt1350 > local146) {
					local136[local146] = local79 * local46 >> 16;
					local140[local146] = local46 * local85 >> 16;
					local144[local146] = local95 * local46 >> 16;
					@Pc(181) int local181 = Static302.anInt6003 & local146 - this.anInt3323;
					local79 -= local83[local181];
					local95 -= local93[local181];
					local146++;
					local85 -= local89[local181];
					@Pc(208) int local208 = Static302.anInt6003 & local146 + this.anInt3323;
					local95 += local93[local208];
					local79 += local83[local208];
					local85 += local89[local208];
				}
				local49[local55 + this.anInt3321 - arg0] = local77;
			}
			@Pc(246) int[] local246 = local16[1];
			@Pc(250) int[] local250 = local16[0];
			@Pc(254) int[] local254 = local16[2];
			for (local79 = 0; local79 < Static62.anInt1350; local79++) {
				local85 = 0;
				local95 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local29; local267++) {
					@Pc(278) int[][] local278 = local49[local267];
					local265 += local278[2][local79];
					local95 += local278[1][local79];
					local85 += local278[0][local79];
				}
				local250[local79] = local42 * local85 >> 16;
				local246[local79] = local42 * local95 >> 16;
				local254[local79] = local265 * local42 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3323 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt3321 = arg0.method2199();
		} else if (arg1 == 2) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(33) int local33 = this.anInt3321 + this.anInt3321 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt3323 + this.anInt3323 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][] local52 = new int[local33][];
			@Pc(58) int local58;
			for (local58 = arg0 - this.anInt3321; local58 <= arg0 + this.anInt3321; local58++) {
				@Pc(73) int[] local73 = this.method4716(0, local58 & Static279.anInt5616);
				@Pc(76) int[] local76 = new int[Static62.anInt1350];
				@Pc(78) int local78 = 0;
				@Pc(82) int local82;
				for (local82 = -this.anInt3323; local82 <= this.anInt3323; local82++) {
					local78 += local73[local82 & Static302.anInt6003];
				}
				local82 = 0;
				while (Static62.anInt1350 > local82) {
					local76[local82] = local78 * local49 >> 16;
					local78 -= local73[local82 - this.anInt3323 & Static302.anInt6003];
					local82++;
					local78 += local73[this.anInt3323 + local82 & Static302.anInt6003];
				}
				local52[this.anInt3321 + local58 - arg0] = local76;
			}
			for (local58 = 0; local58 < Static62.anInt1350; local58++) {
				@Pc(164) int local164 = 0;
				for (@Pc(166) int local166 = 0; local166 < local33; local166++) {
					local164 += local52[local166][local58];
				}
				local9[local58] = local37 * local164 >> 16;
			}
		}
		return local9;
	}
}
