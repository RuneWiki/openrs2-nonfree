import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gh", name = "db", descriptor = "I")
	private int anInt1659 = 1;

	@OriginalMember(owner = "client!gh", name = "gb", descriptor = "I")
	private int anInt1662 = 1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(30) int local30 = this.anInt1659 + this.anInt1659 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(43) int local43 = this.anInt1662 + this.anInt1662 + 1;
			@Pc(46) int[][] local46 = new int[local30][];
			@Pc(50) int local50 = 65536 / local43;
			@Pc(73) int local73;
			for (@Pc(56) int local56 = arg0 - this.anInt1659; local56 <= this.anInt1659 + arg0; local56++) {
				@Pc(68) int[] local68 = this.method3514(local56 & Static92.anInt2170, 0);
				@Pc(71) int[] local71 = new int[Static105.anInt2391];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt1662; local77 <= this.anInt1662; local77++) {
					local73 += local68[Static32.anInt814 & local77];
				}
				@Pc(98) int local98 = 0;
				while (Static105.anInt2391 > local98) {
					local71[local98] = local73 * local50 >> 16;
					local73 -= local68[Static32.anInt814 & local98 - this.anInt1662];
					local98++;
					local73 += local68[local98 + this.anInt1662 & Static32.anInt814];
				}
				local46[local56 + this.anInt1659 - arg0] = local71;
			}
			for (@Pc(158) int local158 = 0; local158 < Static105.anInt2391; local158++) {
				@Pc(162) int local162 = 0;
				for (local73 = 0; local73 < local30; local73++) {
					local162 += local46[local73][local158];
				}
				local17[local158] = local34 * local162 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1662 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt1659 = arg0.method895();
		} else if (arg1 == 2) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(23) int local23 = this.anInt1659 + this.anInt1659 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(30) int[][][] local30 = new int[local23][][];
			@Pc(38) int local38 = this.anInt1662 + this.anInt1662 + 1;
			@Pc(42) int local42 = 65536 / local38;
			@Pc(71) int local71;
			@Pc(61) int local61;
			for (@Pc(47) int local47 = arg0 - this.anInt1659; local47 <= this.anInt1659 + arg0; local47++) {
				@Pc(51) int local51 = 0;
				@Pc(59) int[][] local59 = this.method3501(Static92.anInt2170 & local47, 0);
				local61 = 0;
				@Pc(65) int[][] local65 = new int[3][Static105.anInt2391];
				@Pc(69) int[] local69 = local59[0];
				local71 = 0;
				@Pc(75) int[] local75 = local59[1];
				@Pc(79) int[] local79 = local59[2];
				for (@Pc(83) int local83 = -this.anInt1662; local83 <= this.anInt1662; local83++) {
					@Pc(89) int local89 = Static32.anInt814 & local83;
					local71 += local75[local89];
					local51 += local69[local89];
					local61 += local79[local89];
				}
				@Pc(116) int[] local116 = local65[1];
				@Pc(120) int[] local120 = local65[0];
				@Pc(124) int[] local124 = local65[2];
				@Pc(126) int local126 = 0;
				while (Static105.anInt2391 > local126) {
					local120[local126] = local51 * local42 >> 16;
					local116[local126] = local71 * local42 >> 16;
					local124[local126] = local42 * local61 >> 16;
					@Pc(159) int local159 = Static32.anInt814 & local126 - this.anInt1662;
					local51 -= local69[local159];
					local126++;
					local61 -= local79[local159];
					local71 -= local75[local159];
					@Pc(185) int local185 = Static32.anInt814 & this.anInt1662 + local126;
					local61 += local79[local185];
					local51 += local69[local185];
					local71 += local75[local185];
				}
				local30[this.anInt1659 + local47 - arg0] = local65;
			}
			@Pc(230) int[] local230 = local7[0];
			@Pc(234) int[] local234 = local7[1];
			@Pc(238) int[] local238 = local7[2];
			for (local71 = 0; local71 < Static105.anInt2391; local71++) {
				local61 = 0;
				@Pc(246) int local246 = 0;
				@Pc(248) int local248 = 0;
				for (@Pc(250) int local250 = 0; local250 < local23; local250++) {
					@Pc(256) int[][] local256 = local30[local250];
					local61 += local256[0][local71];
					local248 += local256[2][local71];
					local246 += local256[1][local71];
				}
				local230[local71] = local61 * local27 >> 16;
				local234[local71] = local246 * local27 >> 16;
				local238[local71] = local27 * local248 >> 16;
			}
		}
		return local7;
	}
}
