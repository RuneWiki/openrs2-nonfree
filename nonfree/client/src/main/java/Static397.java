import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
	public static int anInt330;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!kn;")
	public static final Class6_Sub30 aClass6_Sub30_3 = new Class6_Sub30(0, 0);

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_13 = new Class332(20);

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
	public static int anInt328 = 0;

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_3 = new Class84("", 11);

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public static void method267() {
		Static373.aClass212_27.method5110();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!fca;Lclient!oa;III)V")
	public static void method268(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class16 local14 = arg0.method1976(arg1);
		if (local14 == null) {
			return;
		}
		arg1.ca(arg3, arg2, arg3 + arg0.anInt2340, arg2 + arg0.anInt2305);
		if (Static573.anInt9601 == 2 || Static573.anInt9601 == 5 || Static345.aClass4_19 == null) {
			arg1.L(-16777216, local14, arg3, arg2);
			return;
		}
		@Pc(54) int local54;
		@Pc(73) int local73;
		@Pc(63) int local63;
		@Pc(70) int local70;
		if (Static354.anInt6233 == 4) {
			local54 = Static135.anInt2370;
			local73 = Static224.anInt3801;
			local70 = 4096;
			local63 = (int) -Static399.aFloat167 & 0x3FFF;
		} else {
			local54 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
			local63 = (int) -Static399.aFloat167 + Static574.anInt6272 & 0x3FFF;
			local70 = 4096 - Static291.anInt4749 * 16;
			local73 = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
		}
		@Pc(99) int local99 = local54 / 128 + 48 - (Static301.anInt4912 - 104) * 2;
		@Pc(117) int local117 = Static473.anInt7969 * 4 + 48 - local73 / 128 - (Static473.anInt7969 + -104) * 2;
		Static345.aClass4_19.method6511((float) arg3 + (float) arg0.anInt2340 / 2.0F, (float) arg0.anInt2305 / 2.0F + (float) arg2, (float) local99, (float) local117, local70, local63 << 2, local14, arg3, arg2);
		@Pc(167) int local167;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(199) int local199;
		for (@Pc(151) Class6_Sub9 local151 = (Class6_Sub9) Static369.aClass275_133.method6366(); local151 != null; local151 = (Class6_Sub9) Static369.aClass275_133.method6364()) {
			@Pc(156) int local156 = local151.anInt1006;
			local167 = (Static517.aClass252_6.anIntArray566[local156] >> 14 & 0x3FFF) - Static218.anInt3718;
			local177 = (Static517.aClass252_6.anIntArray566[local156] & 0x3FFF) - Static167.anInt3048;
			local188 = local167 * 4 + 2 - local54 / 128;
			local199 = local177 * 4 + 2 - local73 / 128;
			Static565.method7741(local199, local14, arg0, arg1, Static517.aClass252_6.anIntArray567[local156], local188, arg3, arg2);
		}
		for (local167 = 0; local167 < Static348.anInt8718; local167++) {
			local177 = Static163.anIntArray328[local167] * 4 + 2 - local54 / 128;
			local188 = Static203.anIntArray394[local167] * 4 + 2 - local73 / 128;
			@Pc(256) Class313 local256 = Static260.aClass100_1.method2008(Static232.anIntArray418[local167]);
			if (local256.anIntArray650 != null) {
				local256 = local256.method6967(Static505.aClass30_1);
				if (local256 == null || local256.anInt8455 == -1) {
					continue;
				}
			}
			Static565.method7741(local188, local14, arg0, arg1, local256.anInt8455, local177, arg3, arg2);
		}
		@Pc(343) int local343;
		@Pc(354) int local354;
		for (@Pc(295) Class6_Sub32 local295 = (Class6_Sub32) Static303.aClass212_22.method5099(); local295 != null; local295 = (Class6_Sub32) Static303.aClass212_22.method5103()) {
			local188 = (int) (local295.aLong249 >> 28 & 0x3L);
			if (Static16.anInt312 == local188) {
				local199 = (int) (local295.aLong249 & 0x3FFFL) - Static218.anInt3718;
				@Pc(332) int local332 = (int) (local295.aLong249 >> 14 & 0x3FFFL) - Static167.anInt3048;
				local343 = local199 * 4 + 2 - local54 / 128;
				local354 = local332 * 4 + 2 - local73 / 128;
				Static518.method2902(local354, local343, arg3, arg2, local14, arg0, Static332.aClass4Array11[0]);
			}
		}
		@Pc(445) int local445;
		for (local188 = 0; local188 < Static516.anInt8936; local188++) {
			@Pc(387) Class6_Sub28 local387 = (Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local188]);
			if (local387 != null) {
				@Pc(392) Class29_Sub2_Sub1_Sub1 local392 = local387.aClass29_Sub2_Sub1_Sub1_2;
				if (local392.method1587() && local392.aByte103 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) {
					@Pc(408) Class257 local408 = local392.aClass257_1;
					if (local408 != null && local408.anIntArray571 != null) {
						local408 = local408.method5935(Static505.aClass30_1);
					}
					if (local408 != null && local408.aBoolean501 && local408.aBoolean504) {
						local354 = local392.anInt9222 / 128 - local54 / 128;
						local445 = local392.anInt9218 / 128 - local73 / 128;
						if (local408.anInt7147 == -1) {
							Static518.method2902(local445, local354, arg3, arg2, local14, arg0, Static332.aClass4Array11[1]);
						} else {
							Static565.method7741(local445, local14, arg0, arg1, local408.anInt7147, local354, arg3, arg2);
						}
					}
				}
			}
		}
		local199 = Static199.anInt3448;
		@Pc(484) int[] local484 = Static272.anIntArray443;
		@Pc(531) int local531;
		@Pc(535) int local535;
		@Pc(567) int local567;
		for (local343 = 0; local343 < local199; local343++) {
			@Pc(494) Class29_Sub2_Sub1_Sub2 local494 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local484[local343]];
			if (local494 != null && local494.method7016() && Static426.aClass29_Sub2_Sub1_Sub2_2 != local494 && local494.aByte103 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) {
				local445 = local494.anInt9222 / 128 - local54 / 128;
				local531 = local494.anInt9218 / 128 - local73 / 128;
				@Pc(533) boolean local533 = false;
				for (local535 = 0; local535 < Static300.anInt4872; local535++) {
					if (local494.aString108.equals(Static489.aStringArray30[local535]) && Static58.anIntArray63[local535] != 0) {
						local533 = true;
						break;
					}
				}
				@Pc(565) boolean local565 = false;
				for (local567 = 0; local567 < Static469.anInt7945; local567++) {
					if (local494.aString108.equals(Static296.aClass153Array3[local567].aString57)) {
						local565 = true;
						break;
					}
				}
				@Pc(591) boolean local591 = false;
				if (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8595 != 0 && local494.anInt8595 != 0 && local494.anInt8595 == Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8595) {
					local591 = true;
				}
				if (local494.aBoolean601) {
					Static518.method2902(local531, local445, arg3, arg2, local14, arg0, Static332.aClass4Array11[6]);
				} else if (local533) {
					Static518.method2902(local531, local445, arg3, arg2, local14, arg0, Static332.aClass4Array11[3]);
				} else if (local565) {
					Static518.method2902(local531, local445, arg3, arg2, local14, arg0, Static332.aClass4Array11[5]);
				} else if (local591) {
					Static518.method2902(local531, local445, arg3, arg2, local14, arg0, Static332.aClass4Array11[4]);
				} else {
					Static518.method2902(local531, local445, arg3, arg2, local14, arg0, Static332.aClass4Array11[2]);
				}
			}
		}
		@Pc(689) Class129[] local689 = Static34.aClass129Array4;
		@Pc(773) int local773;
		for (local445 = 0; local445 < local689.length; local445++) {
			@Pc(697) Class129 local697 = local689[local445];
			if (local697 != null && local697.anInt3170 != 0 && Static358.anInt6263 % 20 < 10) {
				@Pc(738) int local738;
				if (local697.anInt3170 == 1) {
					@Pc(724) Class6_Sub28 local724 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local697.anInt3177);
					if (local724 != null) {
						@Pc(729) Class29_Sub2_Sub1_Sub1 local729 = local724.aClass29_Sub2_Sub1_Sub1_2;
						local738 = local729.anInt9222 / 128 - local54 / 128;
						local567 = local729.anInt9218 / 128 - local73 / 128;
						Static251.method4152(local567, arg0, arg3, local14, local697.anInt3171, 360000L, local738, arg2);
					}
				}
				if (local697.anInt3170 == 2) {
					local773 = local697.anInt3169 / 128 - local54 / 128;
					local535 = local697.anInt3176 / 128 - local73 / 128;
					@Pc(789) long local789 = (long) (local697.anInt3173 << 7);
					@Pc(793) long local793 = local789 * local789;
					Static251.method4152(local535, arg0, arg3, local14, local697.anInt3171, local793, local773, arg2);
				}
				if (local697.anInt3170 == 10 && local697.anInt3177 >= 0 && Static346.aClass29_Sub2_Sub1_Sub2Array1.length > local697.anInt3177) {
					@Pc(823) Class29_Sub2_Sub1_Sub2 local823 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local697.anInt3177];
					if (local823 != null) {
						local535 = local823.anInt9222 / 128 - local54 / 128;
						local738 = local823.anInt9218 / 128 - local73 / 128;
						Static251.method4152(local738, arg0, arg3, local14, local697.anInt3171, 360000L, local535, arg2);
					}
				}
			}
		}
		if (Static354.anInt6233 == 4) {
			return;
		}
		if (Static334.anInt5975 != 0) {
			local531 = Static334.anInt5975 * 4 + Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() * 2 + 2 - local54 / 128 - 2;
			local773 = Static16.anInt311 * 4 + (Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() + -1) * 2 + 2 - local73 / 128;
			Static518.method2902(local773, local531, arg3, arg2, local14, arg0, Static153.aClass4Array4[Static190.aBoolean258 ? 1 : 0]);
		}
		arg1.method7109(arg2 + arg0.anInt2305 / 2 - 1, 3, 3, arg3 + arg0.anInt2340 / 2 - 1, -1);
	}
}
