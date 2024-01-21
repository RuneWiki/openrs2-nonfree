import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt390 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt383 = arg1.method1607();
		} else if (arg0 == 2) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(25) int local25 = this.anInt383 + this.anInt383 + 1;
			@Pc(34) int local34 = this.anInt390 + this.anInt390 + 1;
			@Pc(37) int[][][] local37 = new int[local25][][];
			@Pc(67) int local67;
			@Pc(65) int local65;
			for (@Pc(43) int local43 = arg0 - this.anInt383; local43 <= this.anInt383 + arg0; local43++) {
				@Pc(53) int[][] local53 = this.method3013(Static93.anInt2716 & local43, 0);
				@Pc(57) int[][] local57 = new int[3][Static65.anInt1933];
				@Pc(59) int local59 = 0;
				@Pc(63) int[] local63 = local53[0];
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local53[2];
				@Pc(75) int[] local75 = local53[1];
				for (@Pc(79) int local79 = -this.anInt390; local79 <= this.anInt390; local79++) {
					@Pc(85) int local85 = Static64.anInt1922 & local79;
					local65 += local71[local85];
					local67 += local75[local85];
					local59 += local63[local85];
				}
				@Pc(116) int[] local116 = local57[0];
				@Pc(120) int[] local120 = local57[2];
				@Pc(124) int[] local124 = local57[1];
				@Pc(126) int local126 = 0;
				while (Static65.anInt1933 > local126) {
					local116[local126] = local59 / local34;
					local124[local126] = local67 / local34;
					local120[local126] = local65 / local34;
					@Pc(154) int local154 = Static64.anInt1922 & local126 - this.anInt390;
					local65 -= local71[local154];
					local59 -= local63[local154];
					local126++;
					local67 -= local75[local154];
					@Pc(180) int local180 = this.anInt390 + local126 & Static64.anInt1922;
					local65 += local71[local180];
					local59 += local63[local180];
					local67 += local75[local180];
				}
				local37[local43 + this.anInt383 - arg0] = local57;
			}
			@Pc(227) int[] local227 = local13[1];
			@Pc(231) int[] local231 = local13[2];
			@Pc(235) int[] local235 = local13[0];
			for (local67 = 0; local67 < Static65.anInt1933; local67++) {
				local65 = 0;
				@Pc(243) int local243 = 0;
				@Pc(245) int local245 = 0;
				for (@Pc(247) int local247 = 0; local247 < local25; local247++) {
					@Pc(253) int[][] local253 = local37[local247];
					local245 += local253[2][local67];
					local243 += local253[1][local67];
					local65 += local253[0][local67];
				}
				local235[local67] = local65 / local25;
				local227[local67] = local243 / local25;
				local231[local67] = local245 / local25;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(28) int local28 = this.anInt383 + this.anInt383 + 1;
			@Pc(31) int[][] local31 = new int[local28][];
			@Pc(40) int local40 = this.anInt390 + this.anInt390 + 1;
			@Pc(61) int local61;
			for (@Pc(46) int local46 = arg0 - this.anInt383; local46 <= this.anInt383 + arg0; local46++) {
				@Pc(56) int[] local56 = this.method3012(0, local46 & Static93.anInt2716);
				@Pc(59) int[] local59 = new int[Static65.anInt1933];
				local61 = 0;
				for (@Pc(65) int local65 = -this.anInt390; local65 <= this.anInt390; local65++) {
					local61 += local56[local65 & Static64.anInt1922];
				}
				@Pc(86) int local86 = 0;
				while (Static65.anInt1933 > local86) {
					local59[local86] = local61 / local40;
					local61 -= local56[local86 - this.anInt390 & Static64.anInt1922];
					local86++;
					local61 += local56[Static64.anInt1922 & local86 + this.anInt390];
				}
				local31[this.anInt383 + local46 - arg0] = local59;
			}
			for (@Pc(144) int local144 = 0; local144 < Static65.anInt1933; local144++) {
				@Pc(148) int local148 = 0;
				for (local61 = 0; local61 < local28; local61++) {
					local148 += local31[local61][local144];
				}
				local11[local144] = local148 / local28;
			}
		}
		return local11;
	}
}
