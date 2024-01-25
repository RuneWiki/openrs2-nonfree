import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "Lclient!pc;")
	public static Class188 aClass188_113;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
	public static int anInt6869;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public static int anInt6865 = 0;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_141 = new Class256("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	public static int anInt6867 = 0;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	public static int anInt6870 = 500;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static176.aClass113ArrayArrayArray3 == null) {
			Static387.aClass26_9.method2245(arg3, arg1, arg2, arg0, -16777216);
		} else if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >= 0 && Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 < Static81.anInt1950 * 128 && Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >= 0 && Static171.anInt3288 * 128 > Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111) {
			Static41.anInt1082++;
			if (Static231.aClass4_Sub2_Sub2_Sub1_2 != null && Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 - (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1) * 64 >> 7 == Static425.anInt5530 && Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 - (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1) * 64 >> 7 == Static176.anInt3417) {
				Static425.anInt5530 = -1;
				Static176.anInt3417 = -1;
				Static143.method5897();
			}
			Static329.method4702();
			if (!arg4) {
				Static78.method1382();
			}
			Static302.method3957();
			Static229.method3519(true, arg3, arg2, arg1, arg0);
			@Pc(109) int local109 = Static102.anInt2188;
			@Pc(111) int local111 = Static361.anInt6364;
			@Pc(113) int local113 = Static85.anInt3262;
			@Pc(115) int local115 = Static191.anInt3765;
			@Pc(123) int local123;
			@Pc(160) int local160;
			if (Static65.anInt7824 == 1) {
				local123 = (int) Static328.aFloat179;
				if (Static153.anInt2938 >> 8 > local123) {
					local123 = Static153.anInt2938 >> 8;
				}
				if (Static125.aBooleanArray17[4] && Static432.anIntArray503[4] + 128 > local123) {
					local123 = Static432.anIntArray503[4] + 128;
				}
				local160 = (int) Static203.aFloat130 + Static90.anInt2061 & 0x3FFF;
				Static405.method5499(local115, Static177.anInt3430, local160, local123, Static66.method1200(Static301.anInt5383, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111) - 50, (local123 >> 3) * 3 + 600 << 0, Static349.anInt6145);
			} else if (Static65.anInt7824 == 4) {
				local123 = (int) Static328.aFloat179;
				if (Static153.anInt2938 >> 8 > local123) {
					local123 = Static153.anInt2938 >> 8;
				}
				if (Static125.aBooleanArray17[4] && Static432.anIntArray503[4] + 128 > local123) {
					local123 = Static432.anIntArray503[4] + 128;
				}
				local160 = (int) Static203.aFloat130 & 0x3FFF;
				Static405.method5499(local115, Static177.anInt3430, local160, local123, Static66.method1200(Static301.anInt5383, Static422.anInt7372, Static352.anInt7237) - 50, (local123 >> 3) * 3 + 600 << 0, Static349.anInt6145);
			} else if (Static65.anInt7824 == 5) {
				Static447.method3800(local115);
			}
			local123 = Static225.anInt4310;
			local160 = Static110.anInt2281;
			@Pc(263) int local263 = Static293.anInt5621;
			@Pc(265) int local265 = Static293.anInt5622;
			@Pc(267) int local267 = Static258.anInt4308;
			@Pc(311) int local311;
			for (@Pc(269) int local269 = 0; local269 < 5; local269++) {
				if (Static125.aBooleanArray17[local269]) {
					local311 = (int) ((double) -Static12.anIntArray15[local269] + Math.random() * (double) (Static12.anIntArray15[local269] * 2 + 1) + Math.sin((double) Static38.anIntArray45[local269] * ((double) Static60.anIntArray82[local269] / 100.0D)) * (double) Static432.anIntArray503[local269]);
					if (local269 == 4) {
						Static293.anInt5622 += local311;
						if (Static293.anInt5622 < 1024) {
							Static293.anInt5622 = 1024;
						} else if (Static293.anInt5622 > 3072) {
							Static293.anInt5622 = 3072;
						}
					}
					if (local269 == 0) {
						Static225.anInt4310 += local311;
					}
					if (local269 == 3) {
						Static258.anInt4308 = Static258.anInt4308 + local311 & 0x3FFF;
					}
					if (local269 == 1) {
						Static110.anInt2281 += local311;
					}
					if (local269 == 2) {
						Static293.anInt5621 += local311;
					}
				}
			}
			if (Static225.anInt4310 < 0) {
				Static225.anInt4310 = 0;
			}
			if ((Static86.anInt2009 << 7) - 1 < Static225.anInt4310) {
				Static225.anInt4310 = (Static86.anInt2009 << 7) - 1;
			}
			if (Static293.anInt5621 < 0) {
				Static293.anInt5621 = 0;
			}
			if (Static293.anInt5621 > (Static360.anInt6340 << 7) - 1) {
				Static293.anInt5621 = (Static360.anInt6340 << 7) - 1;
			}
			Static56.method1118();
			Static136.method1991();
			Static387.aClass26_9.pa(local111, local113, local111 + local109, local115 + local113);
			Static387.aClass26_9.method2284();
			local311 = Static399.anInt6964;
			if (Static45.aClass243_4 == null) {
				Static387.aClass26_9.M(local311);
			} else {
				Static45.aClass243_4.method5475(local109, Static387.aClass26_9, Static47.anInt1254 << 3, local111, local113, Static258.anInt4308, local311, Static293.anInt5622, local115);
			}
			Static438.method5925();
			Static416.aClass102_5.Q(Static225.anInt4310, Static110.anInt2281, Static293.anInt5621, -Static293.anInt5622 & 0x3FFF, -Static258.anInt4308 & 0x3FFF, -Static436.anInt7610 & 0x3FFF);
			Static387.aClass26_9.m(Static416.aClass102_5);
			Static387.aClass26_9.GA(local111 + local109 / 2, local113 + local115 / 2, Static49.anInt1356 << 1, Static49.anInt1356 << 1);
			Static41.method776(local115 / 2 + local113, local109 / 2 + local111, Static49.anInt1356 << 1, Static49.anInt1356 << 1);
			Static415.method5638(-Static436.anInt7610 & 0x3FFF, Static293.anInt5621, Static225.anInt4310, Static110.anInt2281, -Static293.anInt5622 & 0x3FFF, -Static258.anInt4308 & 0x3FFF);
			@Pc(539) byte local539 = Static399.aClass167_Sub1_1.method4522(Static281.anInt5126) == 2 ? (byte) Static41.anInt1082 : 1;
			Static448.method6057(Static387.aClass26_9, Static164.anInt3206, Static178.anInt3434, Static416.aClass102_5, Static225.anInt4310, Static110.anInt2281, Static293.anInt5621, Static440.aByteArrayArrayArray17, Static255.anIntArray326, Static43.anIntArray49, Static277.anIntArray341, Static328.anIntArray378, Static209.anIntArray262, Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 + 1, local539, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7, !Static399.aClass167_Sub1_1.aBoolean489);
			Static438.method5925();
			if (Static297.anInt5339 == 30) {
				Static223.method3428(local115, local109, local111, local113);
				Static78.method1383(local113, local109, local111, local115);
				Static446.method6044(local115, local113, local111, local109);
				Static268.method4010(local111, local115, local113, local109);
			}
			Static140.method6013();
			Static225.anInt4310 = local123;
			Static110.anInt2281 = local160;
			Static293.anInt5621 = local263;
			Static258.anInt4308 = local267;
			Static293.anInt5622 = local265;
			if (Static434.aBoolean645 && Static239.aClass179_1.method4135() == 0) {
				Static434.aBoolean645 = false;
			}
			if (Static434.aBoolean645) {
				Static387.aClass26_9.method2245(local115, local111, local113, local109, -16777216);
				Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537), Static184.aClass56_2, false);
			}
		} else {
			Static387.aClass26_9.method2245(arg3, arg1, arg2, arg0, -16777216);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 >= Static331.anInt5894 && Static351.anInt6176 >= arg4 && arg2 >= Static331.anInt5894 && Static351.anInt6176 >= arg2 && Static331.anInt5894 <= arg0 && arg0 <= Static351.anInt6176 && arg3 >= Static331.anInt5894 && arg3 <= Static351.anInt6176 && Static75.anInt1858 <= arg8 && Static175.anInt3399 >= arg8 && Static75.anInt1858 <= arg7 && Static175.anInt3399 >= arg7 && arg5 >= Static75.anInt1858 && arg5 <= Static175.anInt3399 && Static75.anInt1858 <= arg1 && arg1 <= Static175.anInt3399) {
			Static39.method727(arg3, arg1, arg7, arg0, arg6, arg4, arg5, arg2, arg8);
		} else {
			Static340.method4787(arg5, arg3, arg4, arg8, arg2, arg6, arg1, arg0, arg7);
		}
	}
}
