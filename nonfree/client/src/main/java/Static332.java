import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt5532;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[S")
	public static final short[] aShortArray71 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)S")
	public static short method4597(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 > 64 ? (127 - local24) * local20 >> 7 : local24 * local20 >> 7;
		@Pc(48) int local48 = local24 + local44;
		@Pc(59) int local59;
		if (local48 == 0) {
			local59 = local44 << 1;
		} else {
			local59 = (local44 << 8) / local48;
		}
		return (short) (local14 << 10 | local59 >> 4 << 7 | local48);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V")
	public static void method4598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static211.aFloat4 > Static211.aFloat3) {
			Static211.aFloat3 = (float) ((double) Static211.aFloat3 + (double) Static211.aFloat3 / 30.0D);
			if (Static211.aFloat3 > Static211.aFloat4) {
				Static211.aFloat3 = Static211.aFloat4;
			}
			Static368.method5132();
			Static211.anInt266 = (int) Static211.aFloat3 >> 1;
			Static211.aByteArrayArrayArray3 = Static184.method2900(Static211.anInt266);
		} else if (Static211.aFloat4 < Static211.aFloat3) {
			Static211.aFloat3 = (float) ((double) Static211.aFloat3 - (double) Static211.aFloat3 / 30.0D);
			if (Static211.aFloat3 < Static211.aFloat4) {
				Static211.aFloat3 = Static211.aFloat4;
			}
			Static368.method5132();
			Static211.anInt266 = (int) Static211.aFloat3 >> 1;
			Static211.aByteArrayArrayArray3 = Static184.method2900(Static211.anInt266);
		}
		if (Static82.anInt1486 != -1 && Static280.anInt4669 != -1) {
			@Pc(86) int local86 = Static82.anInt1486 - Static34.anInt3343;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(102) int local102 = Static280.anInt4669 - Static436.anInt7297;
			if (local102 < 2 || local102 > 2) {
				local102 /= 8;
			}
			Static34.anInt3343 -= -local86;
			Static436.anInt7297 += local102;
			if (local86 == 0 && local102 == 0) {
				Static82.anInt1486 = -1;
				Static280.anInt4669 = -1;
			}
			Static368.method5132();
		}
		if (Static110.anInt1953 <= 0) {
			Static235.anInt4023 = -1;
			Static130.anInt2354 = -1;
		} else {
			Static285.anInt5015--;
			if (Static285.anInt5015 == 0) {
				Static285.anInt5015 = 100;
				Static110.anInt1953--;
			}
		}
		if (!Static21.aBoolean515 || Static107.aClass193_23 == null) {
			return;
		}
		for (@Pc(171) Class3_Sub17 local171 = (Class3_Sub17) Static107.aClass193_23.method4519(); local171 != null; local171 = (Class3_Sub17) Static107.aClass193_23.method4525()) {
			@Pc(180) Class152 local180 = Static211.aClass45_2.method1255(local171.aClass3_Sub16_1.anInt1896);
			if (local171.method1798(arg0, arg1)) {
				if (local180.aStringArray28 != null) {
					if (local180.aStringArray28[4] != null) {
						Static359.method5021(false, 1011, 0, true, local180.aString50, -1, -1, local180.aStringArray28[4], (long) local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
					}
					if (local180.aStringArray28[3] != null) {
						Static359.method5021(false, 1008, 0, true, local180.aString50, -1, -1, local180.aStringArray28[3], (long) local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
					}
					if (local180.aStringArray28[2] != null) {
						Static359.method5021(false, 1001, 0, true, local180.aString50, -1, -1, local180.aStringArray28[2], (long) local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
					}
					if (local180.aStringArray28[1] != null) {
						Static359.method5021(false, 1004, 0, true, local180.aString50, -1, -1, local180.aStringArray28[1], (long) local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
					}
					if (local180.aStringArray28[0] != null) {
						Static359.method5021(false, 1010, 0, true, local180.aString50, -1, -1, local180.aStringArray28[0], (long) local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
					}
				}
				if (!local171.aClass3_Sub16_1.aBoolean115) {
					local171.aClass3_Sub16_1.aBoolean115 = true;
					Static219.method3210(Static27.aClass111_1, local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
				}
				if (local171.aClass3_Sub16_1.aBoolean115) {
					Static219.method3210(Static378.aClass111_10, local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
				}
			} else if (local171.aClass3_Sub16_1.aBoolean115) {
				local171.aClass3_Sub16_1.aBoolean115 = false;
				Static219.method3210(Static246.aClass111_4, local171.aClass3_Sub16_1.anInt1896, local180.anInt4347);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method4599(@OriginalArg(1) Class167 arg0) {
		@Pc(7) int local7 = Static368.anInt6234;
		@Pc(9) int local9 = Static348.anInt5871;
		@Pc(11) int local11 = Static100.anInt1814;
		@Pc(15) int local15 = Static242.anInt4125 - 3;
		if (Static210.aClass2_7 == null || Static155.aClass2_3 == null) {
			if (Static8.aClass250_2.method5813(Static258.anInt4312) && Static8.aClass250_2.method5813(Static242.anInt4136)) {
				Static210.aClass2_7 = arg0.method5993(Static467.method3619(Static8.aClass250_2, Static258.anInt4312, 0));
				@Pc(44) Class154 local44 = Static467.method3619(Static8.aClass250_2, Static242.anInt4136, 0);
				Static155.aClass2_3 = arg0.method5993(local44);
				local44.method3623();
				Static326.aClass2_12 = arg0.method5993(local44);
			} else {
				arg0.M(local7, local9, local11, 20, 255 - Static461.anInt7745 << 24 | Static58.anInt1118, 1);
			}
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (Static210.aClass2_7 != null && Static155.aClass2_3 != null) {
			local86 = (local11 - Static155.aClass2_3.TA() * 2) / Static210.aClass2_7.TA();
			for (local88 = 0; local88 < local86; local88++) {
				Static210.aClass2_7.method5829(local7 + Static155.aClass2_3.TA() + Static210.aClass2_7.TA() * local88, local9);
			}
			Static155.aClass2_3.method5829(local7, local9);
			Static326.aClass2_12.method5829(local7 + local11 - Static326.aClass2_12.TA(), local9);
		}
		Static266.aClass18_2.method5167(Static22.aClass174_14.method4208(Static300.anInt5192), Static460.anInt7717 | 0xFF000000, -1, local7 + 3, local9 - -14);
		arg0.M(local7, local9 + 20, local11, local15 - 20, -Static461.anInt7745 + 255 << 24 | Static58.anInt1118, 1);
		local86 = Static171.aClass50_1.method4993();
		local88 = Static171.aClass50_1.method4989();
		@Pc(171) int local171 = 0;
		@Pc(192) int local192;
		for (@Pc(176) Class3_Sub38 local176 = (Class3_Sub38) Static325.aClass193_54.method4519(); local176 != null; local176 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			local192 = local9 + (Static276.anInt4608 - (local171 + 1)) * 16 + 13 + 20;
			if (local7 < local86 && local7 + local11 > local86 && local88 > local192 - 13 && local192 + 4 > local88 && local176.aBoolean413) {
				arg0.M(local7, local192 - 12, local11, 16, 255 - Static402.anInt6657 << 24 | Static296.anInt5114, 1);
			}
			local171++;
		}
		if ((Static373.aClass2_15 == null || Static270.aClass2_8 == null || Static293.aClass2_10 == null) && Static8.aClass250_2.method5813(Static218.anInt7514) && Static8.aClass250_2.method5813(Static187.anInt3419) && Static8.aClass250_2.method5813(Static134.anInt2392)) {
			@Pc(265) Class154 local265 = Static467.method3619(Static8.aClass250_2, Static187.anInt3419, 0);
			Static270.aClass2_8 = arg0.method5993(local265);
			local265.method3623();
			Static364.aClass2_14 = arg0.method5993(local265);
			Static373.aClass2_15 = arg0.method5993(Static467.method3619(Static8.aClass250_2, Static218.anInt7514, 0));
			@Pc(290) Class154 local290 = Static467.method3619(Static8.aClass250_2, Static134.anInt2392, 0);
			Static293.aClass2_10 = arg0.method5993(local290);
			local290.method3623();
			Static153.aClass2_2 = arg0.method5993(local290);
		}
		@Pc(361) int local361;
		@Pc(321) int local321;
		if (Static373.aClass2_15 != null && Static270.aClass2_8 != null && Static293.aClass2_10 != null) {
			local192 = (local11 - Static293.aClass2_10.TA() * 2) / Static373.aClass2_15.TA();
			for (local321 = 0; local321 < local192; local321++) {
				Static373.aClass2_15.method5829(local7 + Static293.aClass2_10.TA() + local321 * Static373.aClass2_15.TA(), -Static373.aClass2_15.V() + local15 + local9);
			}
			local361 = (local15 - Static293.aClass2_10.V() - 20) / Static270.aClass2_8.V();
			for (@Pc(363) int local363 = 0; local363 < local361; local363++) {
				Static270.aClass2_8.method5829(local7, Static270.aClass2_8.V() * local363 + local9 + 20);
				Static364.aClass2_14.method5829(local11 + local7 - Static364.aClass2_14.TA(), local9 - -20 - -(Static270.aClass2_8.V() * local363));
			}
			Static293.aClass2_10.method5829(local7, local15 + local9 - Static293.aClass2_10.V());
			Static153.aClass2_2.method5829(local11 + local7 - Static293.aClass2_10.TA(), local9 - -local15 - Static293.aClass2_10.V());
		}
		local171 = 0;
		for (@Pc(435) Class3_Sub38 local435 = (Class3_Sub38) Static325.aClass193_54.method4519(); local435 != null; local435 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			local321 = local9 + (-local171 + -1 + Static276.anInt4608) * 16 + 33;
			local361 = Static460.anInt7717 | 0xFF000000;
			if (local7 < local86 && local7 + local11 > local86 && local321 - 13 < local88 && local88 < local321 + 4 && local435.aBoolean413) {
				local361 = Static376.anInt6361 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static56.method1096(local435.anInt5875)) {
				local492 = Static158.aClass272_1.method6283((int) local435.aLong199).anIntArray365;
			} else if (local435.anInt5869 != -1) {
				local492 = Static158.aClass272_1.method6283(local435.anInt5869).anIntArray365;
			} else if (Static419.method5747(local435.anInt5875)) {
				@Pc(525) Class3_Sub40 local525 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local435.aLong199);
				if (local525 != null) {
					@Pc(530) Class1_Sub2_Sub6_Sub1 local530 = local525.aClass1_Sub2_Sub6_Sub1_2;
					@Pc(533) Class158 local533 = local530.aClass158_1;
					if (local533.anIntArray294 != null) {
						local533 = local533.method3705(Static119.aClass47_1);
					}
					if (local533 != null) {
						local492 = local533.anIntArray295;
					}
				}
			} else if (Static396.method5462(local435.anInt5875)) {
				@Pc(569) Class31 local569;
				if (local435.anInt5875 == 1007) {
					local569 = Static9.aClass149_1.method3573((int) local435.aLong199);
				} else {
					local569 = Static9.aClass149_1.method3573((int) (local435.aLong199 >>> 32 & 0x7FFFFFFFL));
				}
				if (local569.anIntArray44 != null) {
					local569 = local569.method863(Static119.aClass47_1);
				}
				if (local569 != null) {
					local492 = local569.anIntArray43;
				}
			}
			@Pc(610) String local610 = Static413.method5691(local435);
			if (local492 != null) {
				local610 = local610 + Static270.method3761(local492);
			}
			Static266.aClass18_2.method5161(local321, local361, local7 + 3, Static306.aClass2Array15, local610, Static39.anIntArray31);
			local171++;
			if (local435.aBoolean412) {
				Static330.aClass2_13.method5829(Static251.aClass124_14.method3099(local610) + local7 + 5, local321 - 12);
			}
		}
		Static297.method4223(Static348.anInt5871, Static100.anInt1814, Static368.anInt6234, Static242.anInt4125);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!nj;BI)V")
	public static void method4600(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (Static207.aClass176_2 == null) {
			return;
		}
		try {
			Static207.aClass176_2.method4271(0L);
			Static207.aClass176_2.method4265(arg0.aByteArray88, 24, arg1);
		} catch (@Pc(18) Exception local18) {
		}
	}
}
