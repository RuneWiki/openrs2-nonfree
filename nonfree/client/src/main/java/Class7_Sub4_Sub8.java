import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class7_Sub4_Sub8 extends Class7_Sub4 {

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	private int anInt2235 = 1;

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
	private int anInt2238 = 1;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(30) int local30 = this.anInt2235 + this.anInt2235 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt2238 + this.anInt2238 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local30][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt2235; local55 <= this.anInt2235 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.method5638(local55 & Static153.anInt3263, 0);
				@Pc(69) int[][] local69 = new int[3][Static201.anInt4174];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt2238; local91 <= this.anInt2238; local91++) {
					@Pc(97) int local97 = local91 & Static110.anInt2508;
					local71 += local79[local97];
					local73 += local83[local97];
					local75 += local87[local97];
				}
				@Pc(124) int[] local124 = local69[0];
				@Pc(128) int[] local128 = local69[1];
				@Pc(132) int[] local132 = local69[2];
				@Pc(134) int local134 = 0;
				while (local134 < Static201.anInt4174) {
					local124[local134] = local46 * local71 >> 16;
					local128[local134] = local73 * local46 >> 16;
					local132[local134] = local75 * local46 >> 16;
					@Pc(168) int local168 = local134 - this.anInt2238 & Static110.anInt2508;
					local73 -= local83[local168];
					local134++;
					local75 -= local87[local168];
					local71 -= local79[local168];
					@Pc(194) int local194 = Static110.anInt2508 & this.anInt2238 + local134;
					local71 += local79[local194];
					local75 += local87[local194];
					local73 += local83[local194];
				}
				local49[local55 + this.anInt2235 - arg0] = local69;
			}
			@Pc(241) int[] local241 = local17[0];
			@Pc(245) int[] local245 = local17[1];
			@Pc(249) int[] local249 = local17[2];
			for (local73 = 0; local73 < Static201.anInt4174; local73++) {
				local75 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local30; local261++) {
					@Pc(267) int[][] local267 = local49[local261];
					local259 += local267[2][local73];
					local75 += local267[0][local73];
					local257 += local267[1][local73];
				}
				local241[local73] = local75 * local34 >> 16;
				local245[local73] = local34 * local257 >> 16;
				local249[local73] = local34 * local259 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2238 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt2235 = arg0.method2772();
		} else if (arg1 == 2) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(31) int local31 = this.anInt2235 + this.anInt2235 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt2238 + this.anInt2238 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt2235; local56 <= arg0 + this.anInt2235; local56++) {
				@Pc(66) int[] local66 = this.method5634(0, Static153.anInt3263 & local56);
				@Pc(69) int[] local69 = new int[Static201.anInt4174];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt2238; local75 <= this.anInt2238; local75++) {
					local71 += local66[local75 & Static110.anInt2508];
				}
				@Pc(96) int local96 = 0;
				while (Static201.anInt4174 > local96) {
					local69[local96] = local71 * local47 >> 16;
					local71 -= local66[local96 - this.anInt2238 & Static110.anInt2508];
					local96++;
					local71 += local66[Static110.anInt2508 & this.anInt2238 + local96];
				}
				local50[local56 + this.anInt2235 - arg0] = local69;
			}
			for (@Pc(157) int local157 = 0; local157 < Static201.anInt4174; local157++) {
				@Pc(161) int local161 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local161 += local50[local71][local157];
				}
				local11[local157] = local161 * local35 >> 16;
			}
		}
		return local11;
	}
}
