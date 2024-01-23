import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
	private int anInt928 = 1;

	@OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
	private int anInt930 = 1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(32) int local32 = this.anInt928 + this.anInt928 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt930 + this.anInt930 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local44][][];
			@Pc(77) int local77;
			@Pc(79) int local79;
			@Pc(81) int local81;
			for (@Pc(57) int local57 = arg0 - this.anInt930; local57 <= this.anInt930 + arg0; local57++) {
				@Pc(71) int[][] local71 = this.method4575(0, Static167.anInt3492 & local57);
				@Pc(75) int[][] local75 = new int[3][Static299.anInt5670];
				local77 = 0;
				local79 = 0;
				local81 = 0;
				@Pc(85) int[] local85 = local71[0];
				@Pc(89) int[] local89 = local71[1];
				@Pc(93) int[] local93 = local71[2];
				for (@Pc(97) int local97 = -this.anInt928; local97 <= this.anInt928; local97++) {
					@Pc(109) int local109 = Static142.anInt2791 & local97;
					local79 += local89[local109];
					local77 += local85[local109];
					local81 += local93[local109];
				}
				@Pc(134) int[] local134 = local75[0];
				@Pc(138) int[] local138 = local75[1];
				@Pc(142) int[] local142 = local75[2];
				@Pc(144) int local144 = 0;
				while (Static299.anInt5670 > local144) {
					local134[local144] = local36 * local77 >> 16;
					local138[local144] = local79 * local36 >> 16;
					local142[local144] = local81 * local36 >> 16;
					@Pc(183) int local183 = local144 - this.anInt928 & Static142.anInt2791;
					local77 -= local85[local183];
					local79 -= local89[local183];
					local81 -= local93[local183];
					local144++;
					@Pc(209) int local209 = local144 + this.anInt928 & Static142.anInt2791;
					local79 += local89[local209];
					local77 += local85[local209];
					local81 += local93[local209];
				}
				local51[this.anInt930 + local57 - arg0] = local75;
			}
			@Pc(246) int[] local246 = local15[0];
			@Pc(250) int[] local250 = local15[1];
			@Pc(254) int[] local254 = local15[2];
			for (local77 = 0; local77 < Static299.anInt5670; local77++) {
				local79 = 0;
				@Pc(267) int local267 = 0;
				local81 = 0;
				for (@Pc(271) int local271 = 0; local271 < local44; local271++) {
					@Pc(282) int[][] local282 = local51[local271];
					local267 += local282[2][local77];
					local81 += local282[1][local77];
					local79 += local282[0][local77];
				}
				local246[local77] = local48 * local79 >> 16;
				local250[local77] = local48 * local81 >> 16;
				local254[local77] = local48 * local267 >> 16;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(32) int local32 = this.anInt930 + this.anInt930 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt928 + this.anInt928 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(56) int local56;
			for (local56 = arg0 - this.anInt930; local56 <= arg0 + this.anInt930; local56++) {
				@Pc(75) int[] local75 = this.method4570(local56 & Static167.anInt3492, 0);
				@Pc(77) int local77 = 0;
				@Pc(81) int local81;
				for (local81 = -this.anInt928; local81 <= this.anInt928; local81++) {
					local77 += local75[Static142.anInt2791 & local81];
				}
				@Pc(103) int[] local103 = new int[Static299.anInt5670];
				local81 = 0;
				while (local81 < Static299.anInt5670) {
					local103[local81] = local48 * local77 >> 16;
					local77 -= local75[local81 - this.anInt928 & Static142.anInt2791];
					local81++;
					local77 += local75[local81 + this.anInt928 & Static142.anInt2791];
				}
				local51[local56 + this.anInt930 - arg0] = local103;
			}
			for (local56 = 0; local56 < Static299.anInt5670; local56++) {
				@Pc(165) int local165 = 0;
				for (@Pc(167) int local167 = 0; local167 < local32; local167++) {
					local165 += local51[local167][local56];
				}
				local19[local56] = local36 * local165 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt928 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt930 = arg0.method2595();
		} else if (arg1 == 2) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}
}
