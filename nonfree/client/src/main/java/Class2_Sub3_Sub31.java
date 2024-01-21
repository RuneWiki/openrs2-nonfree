import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
	private int anInt3680;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3684 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt3680 = arg1.method1698();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(28) int local28 = this.anInt3684 + this.anInt3684 + 1;
			@Pc(36) int local36 = this.anInt3680 + this.anInt3680 + 1;
			@Pc(39) int[][][] local39 = new int[local36][][];
			@Pc(63) int local63;
			@Pc(65) int local65;
			for (@Pc(45) int local45 = arg0 - this.anInt3680; local45 <= this.anInt3680 + arg0; local45++) {
				@Pc(55) int[][] local55 = this.method2900(Static1.anInt2959 & local45, 0);
				@Pc(59) int[][] local59 = new int[3][Static54.anInt1423];
				@Pc(61) int local61 = 0;
				local63 = 0;
				local65 = 0;
				@Pc(69) int[] local69 = local55[0];
				@Pc(73) int[] local73 = local55[1];
				@Pc(77) int[] local77 = local55[2];
				for (@Pc(81) int local81 = -this.anInt3684; local81 <= this.anInt3684; local81++) {
					@Pc(87) int local87 = Static73.anInt1916 & local81;
					local65 += local77[local87];
					local61 += local69[local87];
					local63 += local73[local87];
				}
				@Pc(114) int[] local114 = local59[0];
				@Pc(118) int[] local118 = local59[2];
				@Pc(122) int[] local122 = local59[1];
				@Pc(124) int local124 = 0;
				while (Static54.anInt1423 > local124) {
					local114[local124] = local61 / local28;
					local122[local124] = local63 / local28;
					local118[local124] = local65 / local28;
					@Pc(152) int local152 = local124 - this.anInt3684 & Static73.anInt1916;
					local124++;
					local65 -= local77[local152];
					local61 -= local69[local152];
					local63 -= local73[local152];
					@Pc(179) int local179 = local124 + this.anInt3684 & Static73.anInt1916;
					local63 += local73[local179];
					local61 += local69[local179];
					local65 += local77[local179];
				}
				local39[local45 + this.anInt3680 - arg0] = local59;
			}
			@Pc(225) int[] local225 = local16[0];
			@Pc(229) int[] local229 = local16[2];
			@Pc(233) int[] local233 = local16[1];
			for (local63 = 0; local63 < Static54.anInt1423; local63++) {
				local65 = 0;
				@Pc(241) int local241 = 0;
				@Pc(243) int local243 = 0;
				for (@Pc(245) int local245 = 0; local245 < local36; local245++) {
					@Pc(251) int[][] local251 = local39[local245];
					local241 += local251[2][local63];
					local243 += local251[1][local63];
					local65 += local251[0][local63];
				}
				local225[local63] = local65 / local36;
				local233[local63] = local243 / local36;
				local229[local63] = local241 / local36;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(23) int local23 = this.anInt3680 + this.anInt3680 + 1;
			@Pc(32) int local32 = this.anInt3684 + this.anInt3684 + 1;
			@Pc(35) int[][] local35 = new int[local23][];
			@Pc(55) int local55;
			for (@Pc(40) int local40 = arg0 - this.anInt3680; local40 <= arg0 + this.anInt3680; local40++) {
				@Pc(50) int[] local50 = this.method2901(0, Static1.anInt2959 & local40);
				@Pc(53) int[] local53 = new int[Static54.anInt1423];
				local55 = 0;
				for (@Pc(59) int local59 = -this.anInt3684; local59 <= this.anInt3684; local59++) {
					local55 += local50[Static73.anInt1916 & local59];
				}
				@Pc(76) int local76 = 0;
				while (local76 < Static54.anInt1423) {
					local53[local76] = local55 / local32;
					local55 -= local50[local76 - this.anInt3684 & Static73.anInt1916];
					local76++;
					local55 += local50[Static73.anInt1916 & this.anInt3684 + local76];
				}
				local35[this.anInt3680 + local40 - arg0] = local53;
			}
			for (@Pc(134) int local134 = 0; local134 < Static54.anInt1423; local134++) {
				@Pc(138) int local138 = 0;
				for (local55 = 0; local55 < local23; local55++) {
					local138 += local35[local55][local134];
				}
				local11[local134] = local138 / local23;
			}
		}
		return local11;
	}
}
