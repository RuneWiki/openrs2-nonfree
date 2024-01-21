import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
	private int anInt1793;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
	private int anInt1796;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(29) int local29 = this.anInt1796 + this.anInt1796 + 1;
			@Pc(37) int local37 = this.anInt1793 + this.anInt1793 + 1;
			@Pc(40) int[][] local40 = new int[local29][];
			@Pc(60) int local60;
			for (@Pc(45) int local45 = arg0 - this.anInt1796; local45 <= arg0 + this.anInt1796; local45++) {
				@Pc(55) int[] local55 = this.method2796(0, Static180.anInt4192 & local45);
				@Pc(58) int[] local58 = new int[Static120.anInt2812];
				local60 = 0;
				for (@Pc(64) int local64 = -this.anInt1793; local64 <= this.anInt1793; local64++) {
					local60 += local55[Static49.anInt1370 & local64];
				}
				@Pc(81) int local81 = 0;
				while (local81 < Static120.anInt2812) {
					local58[local81] = local60 / local37;
					local60 -= local55[Static49.anInt1370 & local81 - this.anInt1793];
					local81++;
					local60 += local55[this.anInt1793 + local81 & Static49.anInt1370];
				}
				local40[this.anInt1796 + local45 - arg0] = local58;
			}
			for (@Pc(133) int local133 = 0; local133 < Static120.anInt2812; local133++) {
				@Pc(137) int local137 = 0;
				for (local60 = 0; local60 < local29; local60++) {
					local137 += local40[local60][local133];
				}
				local13[local133] = local137 / local29;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(28) int local28 = this.anInt1796 + this.anInt1796 + 1;
			@Pc(31) int[][][] local31 = new int[local28][][];
			@Pc(40) int local40 = this.anInt1793 + this.anInt1793 + 1;
			@Pc(63) int local63;
			@Pc(65) int local65;
			for (@Pc(45) int local45 = arg0 - this.anInt1796; local45 <= this.anInt1796 + arg0; local45++) {
				@Pc(55) int[][] local55 = this.method2794(0, Static180.anInt4192 & local45);
				@Pc(59) int[][] local59 = new int[3][Static120.anInt2812];
				@Pc(61) int local61 = 0;
				local63 = 0;
				local65 = 0;
				@Pc(69) int[] local69 = local55[1];
				@Pc(73) int[] local73 = local55[0];
				@Pc(77) int[] local77 = local55[2];
				for (@Pc(81) int local81 = -this.anInt1793; local81 <= this.anInt1793; local81++) {
					@Pc(87) int local87 = Static49.anInt1370 & local81;
					local65 += local77[local87];
					local63 += local69[local87];
					local61 += local73[local87];
				}
				@Pc(118) int[] local118 = local59[1];
				@Pc(122) int[] local122 = local59[2];
				@Pc(126) int[] local126 = local59[0];
				@Pc(128) int local128 = 0;
				while (Static120.anInt2812 > local128) {
					local126[local128] = local61 / local40;
					local118[local128] = local63 / local40;
					local122[local128] = local65 / local40;
					@Pc(156) int local156 = local128 - this.anInt1793 & Static49.anInt1370;
					local61 -= local73[local156];
					local65 -= local77[local156];
					local63 -= local69[local156];
					local128++;
					@Pc(183) int local183 = local128 + this.anInt1793 & Static49.anInt1370;
					local63 += local69[local183];
					local61 += local73[local183];
					local65 += local77[local183];
				}
				local31[this.anInt1796 + local45 - arg0] = local59;
			}
			@Pc(225) int[] local225 = local11[0];
			@Pc(229) int[] local229 = local11[2];
			@Pc(233) int[] local233 = local11[1];
			for (local63 = 0; local63 < Static120.anInt2812; local63++) {
				@Pc(239) int local239 = 0;
				local65 = 0;
				@Pc(243) int local243 = 0;
				for (@Pc(245) int local245 = 0; local245 < local28; local245++) {
					@Pc(251) int[][] local251 = local31[local245];
					local243 += local251[2][local63];
					local239 += local251[1][local63];
					local65 += local251[0][local63];
				}
				local225[local63] = local65 / local28;
				local233[local63] = local239 / local28;
				local229[local63] = local243 / local28;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1793 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt1796 = arg0.method1402();
		} else if (arg1 == 2) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}
}
