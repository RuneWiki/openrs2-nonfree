import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub4_Sub18 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
	private int anInt3102;

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "I")
	private int anInt3108;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(19) int local19 = this.anInt3102 + this.anInt3102 + 1;
			@Pc(27) int local27 = this.anInt3108 + this.anInt3108 + 1;
			@Pc(30) int[][] local30 = new int[local19][];
			@Pc(51) int local51;
			for (@Pc(36) int local36 = arg0 - this.anInt3102; local36 <= arg0 + this.anInt3102; local36++) {
				@Pc(46) int[] local46 = this.method3215(Static125.anInt3628 & local36, 0);
				@Pc(49) int[] local49 = new int[Static73.anInt1888];
				local51 = 0;
				for (@Pc(55) int local55 = -this.anInt3108; local55 <= this.anInt3108; local55++) {
					local51 += local46[Static35.anInt672 & local55];
				}
				@Pc(76) int local76 = 0;
				while (Static73.anInt1888 > local76) {
					local49[local76] = local51 / local27;
					local51 -= local46[local76 - this.anInt3108 & Static35.anInt672];
					local76++;
					local51 += local46[this.anInt3108 + local76 & Static35.anInt672];
				}
				local30[local36 + this.anInt3102 - arg0] = local49;
			}
			for (@Pc(139) int local139 = 0; local139 < Static73.anInt1888; local139++) {
				@Pc(143) int local143 = 0;
				for (local51 = 0; local51 < local19; local51++) {
					local143 += local30[local51][local139];
				}
				local7[local139] = local143 / local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3108 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt3102 = arg0.method544();
		} else if (arg1 == 2) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(28) int local28 = this.anInt3102 + this.anInt3102 + 1;
			@Pc(36) int local36 = this.anInt3108 + this.anInt3108 + 1;
			@Pc(39) int[][][] local39 = new int[local28][][];
			@Pc(65) int local65;
			@Pc(63) int local63;
			for (@Pc(45) int local45 = arg0 - this.anInt3102; local45 <= arg0 + this.anInt3102; local45++) {
				@Pc(55) int[][] local55 = this.method3217(0, local45 & Static125.anInt3628);
				@Pc(59) int[][] local59 = new int[3][Static73.anInt1888];
				@Pc(61) int local61 = 0;
				local63 = 0;
				local65 = 0;
				@Pc(69) int[] local69 = local55[1];
				@Pc(73) int[] local73 = local55[0];
				@Pc(77) int[] local77 = local55[2];
				for (@Pc(81) int local81 = -this.anInt3108; local81 <= this.anInt3108; local81++) {
					@Pc(87) int local87 = Static35.anInt672 & local81;
					local63 += local77[local87];
					local65 += local69[local87];
					local61 += local73[local87];
				}
				@Pc(114) int[] local114 = local59[0];
				@Pc(118) int[] local118 = local59[1];
				@Pc(122) int[] local122 = local59[2];
				@Pc(124) int local124 = 0;
				while (Static73.anInt1888 > local124) {
					local114[local124] = local61 / local36;
					local118[local124] = local65 / local36;
					local122[local124] = local63 / local36;
					@Pc(151) int local151 = Static35.anInt672 & local124 - this.anInt3108;
					local61 -= local73[local151];
					local124++;
					local65 -= local69[local151];
					local63 -= local77[local151];
					@Pc(177) int local177 = Static35.anInt672 & this.anInt3108 + local124;
					local65 += local69[local177];
					local61 += local73[local177];
					local63 += local77[local177];
				}
				local39[this.anInt3102 + local45 - arg0] = local59;
			}
			@Pc(219) int[] local219 = local16[0];
			@Pc(223) int[] local223 = local16[1];
			@Pc(227) int[] local227 = local16[2];
			for (local65 = 0; local65 < Static73.anInt1888; local65++) {
				local63 = 0;
				@Pc(235) int local235 = 0;
				@Pc(237) int local237 = 0;
				for (@Pc(239) int local239 = 0; local239 < local28; local239++) {
					@Pc(245) int[][] local245 = local39[local239];
					local63 += local245[0][local65];
					local235 += local245[2][local65];
					local237 += local245[1][local65];
				}
				local219[local65] = local63 / local28;
				local223[local65] = local237 / local28;
				local227[local65] = local235 / local28;
			}
		}
		return local16;
	}
}
