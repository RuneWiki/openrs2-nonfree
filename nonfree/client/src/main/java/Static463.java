import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	public static int anInt7968 = -1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZIIII)V")
	public static void method6529(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static389.aClass346ArrayArrayArray2 == null) {
			Static307.aClass100_6.method6261(-16777216, arg3, arg1, arg4, arg2);
		} else if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >= 0 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 < Static188.anInt3850 * 512 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >= 0 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 < Static49.anInt1174 * 512) {
			Static485.anInt8225++;
			if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 != null && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 - (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() - 1) * 256 >> 9 == Static29.anInt761 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 - (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() - 1) * 256 >> 9 == Static526.anInt8657) {
				Static29.anInt761 = -1;
				Static526.anInt8657 = -1;
				Static203.method3300();
			}
			Static480.method6790();
			if (!arg0) {
				Static18.method322();
			}
			Static199.method3280();
			Static319.method4947(arg4, arg3, arg1, arg2, true);
			@Pc(124) int local124 = Static568.anInt9290;
			@Pc(131) int local131 = Static133.anInt2820;
			@Pc(133) int local133 = Static78.anInt9031;
			@Pc(135) int local135 = Static430.anInt7301;
			@Pc(143) int local143;
			@Pc(177) int local177;
			if (Static311.anInt5570 == 1) {
				local143 = (int) Static412.aFloat13;
				if (Static95.anInt2023 >> 8 > local143) {
					local143 = Static95.anInt2023 >> 8;
				}
				if (Static536.aBooleanArray39[4] && Static328.anIntArray425[4] + 128 > local143) {
					local143 = Static328.anIntArray425[4] + 128;
				}
				local177 = (int) Static447.aFloat233 + Static478.anInt8186 & 0x3FFF;
				Static133.method2289((local143 >> 3) * 3 + 600 << 2, Static264.anInt4870, local143, Static553.anInt9056, local177, local124, Static524.method7217(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761, Static566.anInt9278, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764) - 200);
			} else if (Static311.anInt5570 == 4) {
				local143 = (int) Static412.aFloat13;
				if (Static95.anInt2023 >> 8 > local143) {
					local143 = Static95.anInt2023 >> 8;
				}
				if (Static536.aBooleanArray39[4] && local143 < Static328.anIntArray425[4] + 128) {
					local143 = Static328.anIntArray425[4] + 128;
				}
				local177 = (int) Static447.aFloat233 & 0x3FFF;
				Static133.method2289((local143 >> 3) * 3 + 600 << 2, Static264.anInt4870, local143, Static553.anInt9056, local177, local124, Static524.method7217(Static156.anInt8481, Static566.anInt9278, Static433.anInt7318) - 200);
			} else if (Static311.anInt5570 == 5) {
				Static14.method291(local124);
			}
			local143 = Static90.anInt1932;
			local177 = Static548.anInt8906;
			@Pc(283) int local283 = Static7.anInt337;
			@Pc(285) int local285 = Static323.anInt6015;
			@Pc(287) int local287 = Static177.anInt3712;
			@Pc(331) int local331;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static536.aBooleanArray39[local289]) {
					local331 = (int) ((double) -Static467.anIntArray529[local289] + Math.random() * (double) (Static467.anIntArray529[local289] * 2 + 1) + Math.sin((double) Static541.anIntArray641[local289] / 100.0D * (double) Static182.anIntArray216[local289]) * (double) Static328.anIntArray425[local289]);
					if (local289 == 1) {
						Static548.anInt8906 += local331 << 2;
					}
					if (local289 == 3) {
						Static177.anInt3712 = local331 + Static177.anInt3712 & 0x3FFF;
					}
					if (local289 == 4) {
						Static323.anInt6015 += local331;
						if (Static323.anInt6015 < 1024) {
							Static323.anInt6015 = 1024;
						} else if (Static323.anInt6015 > 3072) {
							Static323.anInt6015 = 3072;
						}
					}
					if (local289 == 2) {
						Static7.anInt337 += local331 << 2;
					}
					if (local289 == 0) {
						Static90.anInt1932 += local331 << 2;
					}
				}
			}
			if (Static90.anInt1932 < 0) {
				Static90.anInt1932 = 0;
			}
			if ((Static496.anInt8369 << 9) - 1 < Static90.anInt1932) {
				Static90.anInt1932 = (Static496.anInt8369 << 9) - 1;
			}
			if (Static7.anInt337 < 0) {
				Static7.anInt337 = 0;
			}
			if (Static7.anInt337 > (Static357.anInt6390 << 9) - 1) {
				Static7.anInt337 = (Static357.anInt6390 << 9) - 1;
			}
			Static72.method1170();
			Static582.method7908();
			Static307.aClass100_6.da(local133, local131, local133 + local135, local131 + local124);
			Static307.aClass100_6.ya();
			local331 = Static534.anInt8750;
			if (Static459.aClass326_1 == null) {
				Static307.aClass100_6.ja(local331);
			} else {
				Static459.aClass326_1.method7198(local331, local133, local131, local124, Static177.anInt3712, local135, Static153.anInt3072 << 3, Static323.anInt6015, Static307.aClass100_6);
			}
			Static352.method5248();
			Static509.aClass68_7.na(Static90.anInt1932, Static548.anInt8906, Static7.anInt337, -Static323.anInt6015 & 0x3FFF, -Static177.anInt3712 & 0x3FFF, -Static443.anInt7768 & 0x3FFF);
			Static307.aClass100_6.method6217(Static509.aClass68_7);
			Static307.aClass100_6.la(local135 / 2 + local133, local124 / 2 + local131, Static157.anInt3157 << 1, Static157.anInt3157 << 1);
			Static494.method6897(local135 / 2 + local133, Static157.anInt3157 << 1, Static157.anInt3157 << 1, local131 + local124 / 2);
			Static158.method2597(Static90.anInt1932, -Static323.anInt6015 & 0x3FFF, Static548.anInt8906, Static7.anInt337, -Static443.anInt7768 & 0x3FFF, -Static177.anInt3712 & 0x3FFF);
			@Pc(560) byte local560 = Static72.aClass2_Sub12_Sub1_1.method1430(Static391.anInt6846) == 2 ? (byte) Static485.anInt8225 : 1;
			Static466.method6570(Static412.anInt575, Static90.anInt1932, Static548.anInt8906, Static7.anInt337, Static143.aByteArrayArrayArray50, Static381.anIntArray484, Static326.anIntArray423, Static204.anIntArray238, Static177.anIntArray207, Static323.anIntArray421, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 + 1, local560, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9, !Static72.aClass2_Sub12_Sub1_1.aBoolean157);
			Static352.method5248();
			if (Static201.anInt3963 == 10) {
				Static570.method5245(local131, local135, local124, local133);
				Static44.method726(local131, local133, local124, local135);
				Static516.method7140(local124, local135, local131, local133);
				Static50.method894(local135, local131, local124, local133);
			}
			Static301.method4541();
			Static177.anInt3712 = local287;
			Static548.anInt8906 = local177;
			Static7.anInt337 = local283;
			Static90.anInt1932 = local143;
			Static323.anInt6015 = local285;
			if (Static210.aBoolean327 && Static42.aClass327_1.method7235() == 0) {
				Static210.aBoolean327 = false;
			}
			if (Static210.aBoolean327) {
				Static307.aClass100_6.method6261(-16777216, local133, local131, local124, local135);
				Static458.method6493(Static307.aClass100_6, false, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264));
			}
		} else {
			Static307.aClass100_6.method6261(-16777216, arg3, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	public static void method6530(@OriginalArg(0) int arg0) {
		Static360.aLong173 = 1000000000L / (long) arg0;
	}
}
