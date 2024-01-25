import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
	public static int anInt8368;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "[I")
	public static final int[] anIntArray539 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
	public static int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	public static int anInt8370 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!wp;ILclient!r;)V")
	public static void method6962(@OriginalArg(1) int arg0, @OriginalArg(2) Class361 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class45 arg3) {
		@Pc(10) Class81 local10 = arg1.method7897(arg3);
		if (local10 == null) {
			return;
		}
		arg3.da(arg2, arg0, arg2 + arg1.anInt9668, arg0 - -arg1.anInt9650);
		if (Static503.anInt8177 == 2 || Static503.anInt8177 == 5 || Static272.aClass14_16 == null) {
			arg3.FA(-16777216, local10, arg2, arg0);
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		@Pc(50) int local50;
		@Pc(63) int local63;
		if (Static379.anInt6482 == 4) {
			local56 = Static28.anInt516;
			local63 = 4096;
			local50 = (int) -Static43.aFloat20 & 0x3FFF;
			local53 = Static521.anInt8385;
		} else {
			local50 = (int) -Static43.aFloat20 + Static244.anInt4328 & 0x3FFF;
			local53 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
			local56 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
			local63 = 4096 - Static41.anInt765 * 16;
		}
		@Pc(90) int local90 = local56 / 128 + 48 + 208 - Static54.anInt1038 * 2;
		@Pc(107) int local107 = Static140.anInt3026 * 4 + 48 - local53 / 128 - (Static140.anInt3026 + -104) * 2;
		Static272.aClass14_16.method7674((float) arg1.anInt9668 / 2.0F + (float) arg2, (float) arg1.anInt9650 / 2.0F + (float) arg0, (float) local90, (float) local107, local63, local50 << 2, local10, arg2, arg0);
		@Pc(158) int local158;
		@Pc(168) int local168;
		@Pc(179) int local179;
		@Pc(189) int local189;
		for (@Pc(141) Class3_Sub17 local141 = (Class3_Sub17) Static294.aClass112_53.method3088(); local141 != null; local141 = (Class3_Sub17) Static294.aClass112_53.method3084()) {
			@Pc(146) int local146 = local141.anInt3217;
			local158 = (Static319.aClass355_2.anIntArray592[local146] >> 14 & 0x3FFF) - Static335.anInt5608;
			local168 = (Static319.aClass355_2.anIntArray592[local146] & 0x3FFF) - Static246.anInt4344;
			local179 = local158 * 4 + 2 - local56 / 128;
			local189 = local168 * 4 + 2 - local53 / 128;
			Static304.method4454(local10, arg0, local189, arg1, local179, arg2, arg3, Static319.aClass355_2.anIntArray593[local146]);
		}
		for (local158 = 0; local158 < Static171.anInt3413; local158++) {
			local168 = Static264.anIntArray252[local158] * 4 + 2 - local56 / 128;
			local179 = Static554.anIntArray577[local158] * 4 + 2 - local53 / 128;
			@Pc(248) Class280 local248 = Static478.aClass212_3.method4793(Static156.anIntArray155[local158]);
			if (local248.anIntArray457 != null) {
				local248 = local248.method6181(Static491.aClass318_1);
				if (local248 == null || local248.anInt7400 == -1) {
					continue;
				}
			}
			Static304.method4454(local10, arg0, local179, arg1, local168, arg2, arg3, local248.anInt7400);
		}
		@Pc(330) int local330;
		@Pc(340) int local340;
		for (@Pc(287) Class3_Sub31 local287 = (Class3_Sub31) Static211.aClass354_17.method7694(); local287 != null; local287 = (Class3_Sub31) Static211.aClass354_17.method7692()) {
			local179 = (int) (local287.aLong273 >> 28 & 0x3L);
			if (local179 == Static32.anInt609) {
				local189 = (int) (local287.aLong273 & 0x3FFFL) - Static335.anInt5608;
				@Pc(319) int local319 = (int) (local287.aLong273 >> 14 & 0x3FFFL) - Static246.anInt4344;
				local330 = local189 * 4 + 2 - local56 / 128;
				local340 = local319 * 4 + 2 - local53 / 128;
				Static212.method3418(local340, Static586.aClass14Array8[0], local10, arg2, arg1, local330, arg0);
			}
		}
		@Pc(426) int local426;
		for (local179 = 0; local179 < Static88.anInt1884; local179++) {
			@Pc(371) Class3_Sub34 local371 = (Class3_Sub34) Static213.aClass354_37.method7689((long) Static445.anIntArray470[local179]);
			if (local371 != null) {
				@Pc(376) Class41_Sub2_Sub1_Sub4_Sub1 local376 = local371.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				if (local376.method5653() && local376.aByte117 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
					@Pc(388) Class264 local388 = local376.aClass264_1;
					if (local388 != null && local388.anIntArray443 != null) {
						local388 = local388.method5994(Static491.aClass318_1);
					}
					if (local388 != null && local388.aBoolean533 && local388.aBoolean536) {
						local340 = local376.anInt9444 / 128 - local56 / 128;
						local426 = local376.anInt9442 / 128 - local53 / 128;
						if (local388.anInt7140 == -1) {
							Static212.method3418(local426, Static586.aClass14Array8[1], local10, arg2, arg1, local340, arg0);
						} else {
							Static304.method4454(local10, arg0, local426, arg1, local340, arg2, arg3, local388.anInt7140);
						}
					}
				}
			}
		}
		local189 = Static403.anInt6982;
		@Pc(463) int[] local463 = Static430.anIntArray447;
		@Pc(513) int local513;
		@Pc(517) int local517;
		@Pc(549) int local549;
		for (local330 = 0; local330 < local189; local330++) {
			@Pc(473) Class41_Sub2_Sub1_Sub4_Sub2 local473 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local463[local330]];
			if (local473 != null && local473.method7876() && !local473.aBoolean746 && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 != local473 && local473.aByte117 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
				local426 = local473.anInt9444 / 128 - local56 / 128;
				local513 = local473.anInt9442 / 128 - local53 / 128;
				@Pc(515) boolean local515 = false;
				for (local517 = 0; local517 < Static591.anInt9675; local517++) {
					if (local473.aString95.equals(Static22.aStringArray1[local517]) && Static438.anIntArray451[local517] != 0) {
						local515 = true;
						break;
					}
				}
				@Pc(547) boolean local547 = false;
				for (local549 = 0; local549 < Static507.anInt8256; local549++) {
					if (local473.aString95.equals(Static187.aClass103Array1[local549].aString16)) {
						local547 = true;
						break;
					}
				}
				@Pc(569) boolean local569 = false;
				if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9574 != 0 && local473.anInt9574 != 0 && local473.anInt9574 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9574) {
					local569 = true;
				}
				if (local473.aBoolean743) {
					Static212.method3418(local513, Static586.aClass14Array8[6], local10, arg2, arg1, local426, arg0);
				} else if (local515) {
					Static212.method3418(local513, Static586.aClass14Array8[3], local10, arg2, arg1, local426, arg0);
				} else if (local547) {
					Static212.method3418(local513, Static586.aClass14Array8[5], local10, arg2, arg1, local426, arg0);
				} else if (local569) {
					Static212.method3418(local513, Static586.aClass14Array8[4], local10, arg2, arg1, local426, arg0);
				} else {
					Static212.method3418(local513, Static586.aClass14Array8[2], local10, arg2, arg1, local426, arg0);
				}
			}
		}
		@Pc(669) Class205[] local669 = Static283.aClass205Array1;
		@Pc(754) int local754;
		for (local426 = 0; local426 < local669.length; local426++) {
			@Pc(677) Class205 local677 = local669[local426];
			if (local677 != null && local677.anInt5477 != 0 && Static506.anInt8251 % 20 < 10) {
				@Pc(717) int local717;
				if (local677.anInt5477 == 1) {
					@Pc(702) Class3_Sub34 local702 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local677.anInt5482);
					if (local702 != null) {
						@Pc(707) Class41_Sub2_Sub1_Sub4_Sub1 local707 = local702.aClass41_Sub2_Sub1_Sub4_Sub1_2;
						local717 = local707.anInt9444 / 128 - local56 / 128;
						local549 = local707.anInt9442 / 128 - local53 / 128;
						Static379.method5535(local677.anInt5471, local549, 360000L, arg2, local717, local10, arg0, arg1);
					}
				}
				if (local677.anInt5477 == 2) {
					local754 = local677.anInt5481 / 128 - local56 / 128;
					local517 = local677.anInt5474 / 128 - local53 / 128;
					@Pc(770) long local770 = (long) (local677.anInt5473 << 7);
					@Pc(774) long local774 = local770 * local770;
					Static379.method5535(local677.anInt5471, local517, local774, arg2, local754, local10, arg0, arg1);
				}
				if (local677.anInt5477 == 10 && local677.anInt5482 >= 0 && local677.anInt5482 < Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1.length) {
					@Pc(802) Class41_Sub2_Sub1_Sub4_Sub2 local802 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local677.anInt5482];
					if (local802 != null) {
						local517 = local802.anInt9444 / 128 - local56 / 128;
						local717 = local802.anInt9442 / 128 - local53 / 128;
						Static379.method5535(local677.anInt5471, local717, 360000L, arg2, local517, local10, arg0, arg1);
					}
				}
			}
		}
		if (Static379.anInt6482 == 4) {
			return;
		}
		if (Static551.anInt8768 != 0) {
			local513 = Static551.anInt8768 * 4 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() * 2 + 2 - local56 / 128 - 2;
			local754 = Static125.anInt2831 * 4 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.method7858() * 2 + 2 - local53 / 128 - 2;
			Static212.method3418(local754, Static32.aClass14Array6[Static542.aBoolean666 ? 1 : 0], local10, arg2, arg1, local513, arg0);
		}
		if (!Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aBoolean746) {
			arg3.method7425(3, arg1.anInt9668 / 2 + arg2 - 1, arg0 - -(arg1.anInt9650 / 2) + -1, -1, 3);
		}
	}
}
