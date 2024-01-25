import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!tg;")
	public static Class215 aClass215_2;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt4232 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public static int anInt4236 = -1;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_10 = new Class213(6, 7);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
	public static void method3764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(42) String local42 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local42);
		Static39.method541(local42, true);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method3765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static300.method4909(arg1)) {
			Static34.method468(arg0, Static272.aClass3ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIIII)V")
	public static void method3767(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static45.aClass188ArrayArrayArray5 == null) {
			Static383.aClass48_9.method2509(arg3, arg1, arg4, -16777216, arg2);
		} else if (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >= 0 && Static89.anInt1891 * 128 > Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 && Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >= 0 && Static85.anInt1839 * 128 > Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798) {
			Static87.anInt1878++;
			if (Static182.aClass1_Sub2_Sub1_Sub1_1 != null && Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 + 64 - Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() * 64 >> 7 == Static391.anInt7123 && Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 + 64 - Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() * 64 >> 7 == Static280.anInt5248) {
				Static391.anInt7123 = -1;
				Static280.anInt5248 = -1;
				Static180.method3302();
			}
			Static187.method3434();
			if (!arg0) {
				Static234.method4209();
			}
			Static44.method599();
			Static285.method4706(true, arg4, arg1, arg3, arg2);
			@Pc(114) int local114 = Static246.anInt3042;
			@Pc(116) int local116 = Static274.anInt5133;
			@Pc(118) int local118 = Static93.anInt1980;
			@Pc(120) int local120 = Static340.anInt6282;
			@Pc(139) int local139;
			@Pc(178) int local178;
			if (Static198.anInt4108 == 1) {
				local139 = (int) Static323.aFloat71;
				if (local139 < Static119.anInt2636 >> 8) {
					local139 = Static119.anInt2636 >> 8;
				}
				if (Static159.aBooleanArray15[4] && local139 < Static354.anIntArray556[4] + 128) {
					local139 = Static354.anIntArray556[4] + 128;
				}
				local178 = (int) Static350.aFloat74 + Static347.anInt6374 & 0x3FFF;
				Static302.method4922(Static36.method2335(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798, Static241.anInt2711, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800) - 50, (local139 >> 3) * 3 + 600, Static74.anInt1635, local139, Static211.anInt4264, local178, local120);
			} else if (Static198.anInt4108 == 4) {
				local139 = (int) Static323.aFloat71;
				if (local139 < Static119.anInt2636 >> 8) {
					local139 = Static119.anInt2636 >> 8;
				}
				if (Static159.aBooleanArray15[4] && Static354.anIntArray556[4] + 128 > local139) {
					local139 = Static354.anIntArray556[4] + 128;
				}
				local178 = (int) Static350.aFloat74 & 0x3FFF;
				Static302.method4922(Static36.method2335(Static273.anInt5127, Static241.anInt2711, Static124.anInt4240) - 50, (local139 >> 3) * 3 + 600, Static74.anInt1635, local139, Static211.anInt4264, local178, local120);
			} else if (Static198.anInt4108 == 5) {
				Static158.method2792(local120);
			}
			local139 = Static145.anInt5345;
			local178 = Static266.anInt5034;
			@Pc(275) int local275 = Static27.anInt2842;
			@Pc(277) int local277 = Static237.anInt4684;
			@Pc(279) int local279 = Static29.anInt444;
			@Pc(322) int local322;
			for (@Pc(281) int local281 = 0; local281 < 5; local281++) {
				if (Static159.aBooleanArray15[local281]) {
					local322 = (int) (Math.random() * (double) (Static152.anIntArray385[local281] * 2 + 1) - (double) Static152.anIntArray385[local281] + Math.sin((double) Static7.anIntArray15[local281] / 100.0D * (double) Static45.anIntArray526[local281]) * (double) Static354.anIntArray556[local281]);
					if (local281 == 2) {
						Static27.anInt2842 += local322;
					}
					if (local281 == 0) {
						Static145.anInt5345 += local322;
					}
					if (local281 == 3) {
						Static29.anInt444 = local322 + Static29.anInt444 & 0x3FFF;
					}
					if (local281 == 1) {
						Static266.anInt5034 += local322;
					}
					if (local281 == 4) {
						Static237.anInt4684 += local322;
						if (Static237.anInt4684 < 1024) {
							Static237.anInt4684 = 1024;
						} else if (Static237.anInt4684 > 3072) {
							Static237.anInt4684 = 3072;
						}
					}
				}
			}
			if (Static145.anInt5345 < 0) {
				Static145.anInt5345 = 0;
			}
			if (Static27.anInt2842 < 0) {
				Static27.anInt2842 = 0;
			}
			if ((Static176.anInt3742 << 7) - 1 < Static145.anInt5345) {
				Static145.anInt5345 = (Static176.anInt3742 << 7) - 1;
			}
			if (Static27.anInt2842 > (Static285.anInt5263 << 7) - 1) {
				Static27.anInt2842 = (Static285.anInt5263 << 7) - 1;
			}
			Static388.method6092();
			Static147.method2659();
			Static383.aClass48_9.method2496(local116, local114, local118 + local116, local120 + local114);
			Static383.aClass48_9.method2503();
			local322 = Static226.anInt4567;
			if (Static251.aClass58_1 == null) {
				Static383.aClass48_9.method2512(local322);
			} else {
				Static251.aClass58_1.method1290(Static237.anInt4684, local120, Static284.anInt5625 << 3, local116, local118, Static383.aClass48_9, local322, Static29.anInt444, local114);
			}
			Static131.method2293();
			Static61.aClass21_4.method3704(Static145.anInt5345, Static266.anInt5034, Static27.anInt2842, -Static237.anInt4684 & 0x3FFF, -Static29.anInt444 & 0x3FFF, -Static11.anInt209 & 0x3FFF);
			Static383.aClass48_9.method2482(Static61.aClass21_4);
			Static383.aClass48_9.method2469(local118 / 2 + local116, local120 / 2 + local114, Static74.anInt1640 << 1, Static74.anInt1640 << 1);
			Static348.method5545(local118 / 2 + local116, Static74.anInt1640 << 1, local114 + local120 / 2, Static74.anInt1640 << 1);
			Static374.method5937(Static145.anInt5345, -Static29.anInt444 & 0x3FFF, Static27.anInt2842, Static266.anInt5034, -Static237.anInt4684 & 0x3FFF, -Static11.anInt209 & 0x3FFF);
			@Pc(547) byte local547 = Static339.method5448() == 2 ? (byte) Static87.anInt1878 : 1;
			Static195.method3552(Static383.aClass48_9, Static339.anInt6265, Static148.anInt3148, Static61.aClass21_4, Static145.anInt5345, Static266.anInt5034, Static27.anInt2842, Static116.aByteArrayArrayArray2, Static172.anIntArray273, Static67.anIntArray112, Static230.anIntArray383, Static17.anIntArray51, Static345.anIntArray541, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 + 1, local547, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7, !Static74.aBoolean127);
			Static131.method2293();
			if (Static121.anInt6774 == 30) {
				Static276.method6128(local118, local114, local116, local120);
				Static6.method64(local116, local120, local114, local118);
				Static22.method248(local120, local116, local118, local114);
				Static259.method4451(local116, local118, local120, local114);
			}
			Static342.method5479();
			Static29.anInt444 = local279;
			Static27.anInt2842 = local275;
			Static266.anInt5034 = local178;
			Static145.anInt5345 = local139;
			Static237.anInt4684 = local277;
			if (Static260.aBoolean370 && Static364.aClass222_3.method5521() == 0) {
				Static260.aBoolean370 = false;
			}
			if (Static260.aBoolean370) {
				Static383.aClass48_9.method2509(local120, local118, local114, -16777216, local116);
				Static88.method1497(false, Static31.aClass44_1, Static87.aClass62_60.method1389(Static200.anInt4144));
			}
		} else {
			Static383.aClass48_9.method2509(arg3, arg1, arg4, -16777216, arg2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZBZ)V")
	public static void method3768(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static81.anInt1750--;
			if (Static81.anInt1750 == 0) {
				Static261.anIntArray406 = null;
			}
		}
		Static281.anInt5258--;
		if (Static281.anInt5258 == 0) {
			Static65.anIntArray109 = null;
		}
	}
}
