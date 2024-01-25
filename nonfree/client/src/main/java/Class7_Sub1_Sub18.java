import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class7_Sub1_Sub18 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
	private final int[] anIntArray765;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "[I")
	private final int[] anIntArray767;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Lclient!nl;")
	private final Class7_Sub4 aClass7_Sub4_2;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "Lclient!nl;")
	private final Class7_Sub4 aClass7_Sub4_3;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "Lclient!nl;")
	private final Class7_Sub4 aClass7_Sub4_1;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "[Lclient!nl;")
	private final Class7_Sub4[] aClass7_Sub4Array36;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	private Class7_Sub1_Sub18() {
		this.anIntArray765 = new int[0];
		this.anIntArray767 = new int[0];
		this.aClass7_Sub4_2 = new Class7_Sub4_Sub31(0);
		this.aClass7_Sub4_2.anInt6627 = 1;
		this.aClass7_Sub4_3 = new Class7_Sub4_Sub31();
		this.aClass7_Sub4_3.anInt6627 = 1;
		this.aClass7_Sub4_1 = new Class7_Sub4_Sub31();
		this.aClass7_Sub4Array36 = new Class7_Sub4[] { this.aClass7_Sub4_3, this.aClass7_Sub4_1, this.aClass7_Sub4_2 };
		this.aClass7_Sub4_1.anInt6627 = 1;
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class7_Sub1_Sub18(@OriginalArg(0) Class7_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method2772();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass7_Sub4Array36 = new Class7_Sub4[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class7_Sub4 local26 = Static207.method3670(arg0);
			if (local26.method5637() >= 0) {
				local9++;
			}
			if (local26.method5629() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass7_Sub4Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method2772();
			}
			this.aClass7_Sub4Array36[local20] = local26;
		}
		this.anIntArray765 = new int[local9];
		this.anIntArray767 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class7_Sub4 local105 = this.aClass7_Sub4Array36[local98];
			local53 = local105.aClass7_Sub4Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass7_Sub4Array42[local111] = this.aClass7_Sub4Array36[local14[local98][local111]];
			}
			@Pc(133) int local133 = local105.method5637();
			@Pc(137) int local137 = local105.method5629();
			if (local133 > 0) {
				this.anIntArray765[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray767[local11++] = local137;
			}
			local14[local98] = null;
		}
		this.aClass7_Sub4_3 = this.aClass7_Sub4Array36[arg0.method2772()];
		this.aClass7_Sub4_1 = this.aClass7_Sub4Array36[arg0.method2772()];
		this.aClass7_Sub4_2 = this.aClass7_Sub4Array36[arg0.method2772()];
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!rk;BLclient!pg;Z)[F")
	public float[] method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class180 arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) boolean arg4) {
		Static102.anInterface6_2 = arg3;
		Static92.aClass180_28 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub4Array36.length; local11++) {
			this.aClass7_Sub4Array36[local11].method5632(arg1, arg0);
		}
		Static168.method3214(arg1, arg0);
		@Pc(38) float[] local38 = new float[arg0 * 4 * arg1];
		@Pc(40) int local40 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg1; local50++) {
			@Pc(74) int[] local74;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			if (this.aClass7_Sub4_3.aBoolean481) {
				@Pc(82) int[] local82 = this.aClass7_Sub4_3.method5628(local50);
				local74 = local82;
				local70 = local82;
				local66 = local82;
			} else {
				@Pc(62) int[][] local62 = this.aClass7_Sub4_3.method5631(local50);
				local66 = local62[1];
				local70 = local62[2];
				local74 = local62[0];
			}
			@Pc(100) int[] local100;
			if (this.aClass7_Sub4_1.aBoolean481) {
				local100 = this.aClass7_Sub4_1.method5628(local50);
			} else {
				local100 = this.aClass7_Sub4_1.method5631(local50)[0];
			}
			if (arg4) {
				local40 = local50 << 2;
			}
			@Pc(124) int[] local124;
			if (this.aClass7_Sub4_2.aBoolean481) {
				local124 = this.aClass7_Sub4_2.method5628(local50);
			} else {
				local124 = this.aClass7_Sub4_2.method5631(local50)[0];
			}
			for (@Pc(138) int local138 = arg0 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local100[local138] / 4096.0F;
				@Pc(160) float local160 = ((float) local124[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				local38[local40++] = (float) local74[local138] * local160;
				local38[local40++] = local160 * (float) local66[local138];
				local38[local40++] = (float) local70[local138] * local160;
				local38[local40++] = local147;
				if (arg4) {
					local40 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass7_Sub4Array36.length; local228++) {
			this.aClass7_Sub4Array36[local228].method5633();
		}
		return local38;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!pg;Lclient!rk;I)Z")
	public boolean method5128(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class180 arg1) {
		@Pc(12) int local12;
		if (Static255.anInt3696 <= 0) {
			for (local12 = 0; local12 < this.anIntArray765.length; local12++) {
				if (!arg1.method4562(this.anIntArray765[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray765.length; local12++) {
				if (!arg1.method4555(Static255.anInt3696, this.anIntArray765[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray767.length; local12++) {
			if (!arg0.method5615(this.anIntArray767[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIDILclient!pg;Lclient!rk;Z)[I")
	public int[] method5129(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) Class180 arg4, @OriginalArg(6) boolean arg5) {
		Static92.aClass180_28 = arg4;
		Static102.anInterface6_2 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub4Array36.length; local11++) {
			this.aClass7_Sub4Array36[local11].method5632(arg2, arg0);
		}
		Static128.method2630(arg1);
		Static168.method3214(arg2, arg0);
		@Pc(59) int[] local59 = new int[arg0 * arg2 * 4];
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
			@Pc(83) int[] local83;
			@Pc(79) int[] local79;
			@Pc(87) int[] local87;
			@Pc(95) int[] local95;
			if (this.aClass7_Sub4_3.aBoolean481) {
				local95 = this.aClass7_Sub4_3.method5628(local63);
				local87 = local95;
				local83 = local95;
				local79 = local95;
			} else {
				@Pc(75) int[][] local75 = this.aClass7_Sub4_3.method5631(local63);
				local79 = local75[1];
				local83 = local75[0];
				local87 = local75[2];
			}
			if (this.aClass7_Sub4_1.aBoolean481) {
				local95 = this.aClass7_Sub4_1.method5628(local63);
			} else {
				local95 = this.aClass7_Sub4_1.method5631(local63)[0];
			}
			if (arg5) {
				local61 = local63;
			}
			for (@Pc(129) int local129 = arg0 - 1; local129 >= 0; local129--) {
				@Pc(137) int local137 = local83[local129] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local79[local129] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				@Pc(171) int local171 = local87[local129] >> 4;
				if (local171 > 255) {
					local171 = 255;
				}
				local154 = Static317.anIntArray768[local154];
				local137 = Static317.anIntArray768[local137];
				if (local171 < 0) {
					local171 = 0;
				}
				local171 = Static317.anIntArray768[local171];
				@Pc(207) int local207;
				if (local137 == 0 && local154 == 0 && local171 == 0) {
					local207 = 0;
				} else {
					local207 = local95[local129] >> 4;
					if (local207 > 255) {
						local207 = 255;
					}
					if (local207 < 0) {
						local207 = 0;
					}
				}
				local59[local61++] = local171 + (local154 << 8) + (local207 << 24) + (local137 << 16);
				if (arg5) {
					local61 += arg0 - 1;
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.aClass7_Sub4Array36.length; local259++) {
			this.aClass7_Sub4Array36[local259].method5633();
		}
		return local59;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZDZLclient!rk;Lclient!pg;II)[I")
	public int[] method5135(@OriginalArg(1) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class180 arg3, @OriginalArg(5) Interface6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static102.anInterface6_2 = arg4;
		Static92.aClass180_28 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub4Array36.length; local11++) {
			this.aClass7_Sub4Array36[local11].method5632(arg6, arg5);
		}
		Static128.method2630(arg1);
		Static168.method3214(arg6, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg6];
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(45) byte local45;
		if (arg0) {
			local47 = -1;
			local45 = -1;
			local43 = arg5 - 1;
		} else {
			local43 = 0;
			local45 = 1;
			local47 = arg5;
		}
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < arg6; local68++) {
			if (arg2) {
				local66 = local68;
			}
			@Pc(90) int[] local90;
			@Pc(88) int[] local88;
			@Pc(86) int[] local86;
			if (this.aClass7_Sub4_3.aBoolean481) {
				@Pc(84) int[] local84 = this.aClass7_Sub4_3.method5628(local68);
				local86 = local84;
				local88 = local84;
				local90 = local84;
			} else {
				@Pc(98) int[][] local98 = this.aClass7_Sub4_3.method5631(local68);
				local88 = local98[1];
				local90 = local98[0];
				local86 = local98[2];
			}
			for (@Pc(112) int local112 = local43; local112 != local47; local112 += local45) {
				@Pc(120) int local120 = local90[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(140) int local140 = local88[local112] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(160) int local160 = local86[local112] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				if (local160 < 0) {
					local160 = 0;
				}
				local120 = Static317.anIntArray768[local120];
				local140 = Static317.anIntArray768[local140];
				local160 = Static317.anIntArray768[local160];
				@Pc(197) int local197 = local160 + (local120 << 16) + (local140 << 8);
				if (local197 != 0) {
					local197 |= 0xFF000000;
				}
				local39[local66++] = local197;
				if (arg2) {
					local66 += arg5 - 1;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass7_Sub4Array36.length; local237++) {
			this.aClass7_Sub4Array36[local237].method5633();
		}
		return local39;
	}
}
