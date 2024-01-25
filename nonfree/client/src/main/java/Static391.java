import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_9 = new Class68(5, 3);

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public static final int anInt2192 = 1339;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!np;Lclient!wp;)V")
	public static void method1843(@OriginalArg(1) Class155 arg0, @OriginalArg(2) Interface10 arg1) {
		if (Static42.aClass3_Sub7_Sub16_2 == null) {
			return;
		}
		if (Static130.anInt2452 < 10) {
			if (!Static42.aClass20_13.method249(Static42.aClass3_Sub7_Sub16_2.aString66)) {
				Static130.anInt2452 = Static270.aClass20_92.method251(Static42.aClass3_Sub7_Sub16_2.aString66) / 10;
				return;
			}
			Static269.method4258();
			Static130.anInt2452 = 10;
		}
		if (Static130.anInt2452 == 10) {
			Static42.anInt542 = Static42.aClass3_Sub7_Sub16_2.anInt6361 >> 6 << 6;
			Static42.anInt534 = Static42.aClass3_Sub7_Sub16_2.anInt6367 >> 6 << 6;
			Static42.anInt536 = (Static42.aClass3_Sub7_Sub16_2.anInt6359 >> 6 << 6) + 64 - Static42.anInt542;
			Static42.anInt539 = (Static42.aClass3_Sub7_Sub16_2.anInt6360 >> 6 << 6) - (Static42.anInt534 - 64);
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static42.aClass3_Sub7_Sub16_2.method5629(local77, Static103.anInt2044 + (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7), (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7) + Static21.anInt265, Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73)) {
				local79 = local77[1] - Static42.anInt542;
				local81 = local77[2] - Static42.anInt534;
			}
			if (!Static264.aBoolean366 && local79 >= 0 && Static42.anInt536 > local79 && local81 >= 0 && local81 < Static42.anInt539) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static325.anInt5538 = local79;
				Static257.anInt4618 = local81;
			} else if (Static79.anInt1634 == -1 || Static152.anInt2776 == -1) {
				Static42.aClass3_Sub7_Sub16_2.method5622(Static42.aClass3_Sub7_Sub16_2.anInt6364 & 0x3FFF, local77, Static42.aClass3_Sub7_Sub16_2.anInt6364 >> 14 & 0x3FFF);
				Static257.anInt4618 = local77[2] - Static42.anInt534;
				Static325.anInt5538 = local77[1] - Static42.anInt542;
			} else {
				Static42.aClass3_Sub7_Sub16_2.method5622(Static152.anInt2776, local77, Static79.anInt1634);
				Static152.anInt2776 = -1;
				Static79.anInt1634 = -1;
				Static264.aBoolean366 = false;
				if (local77 != null) {
					Static325.anInt5538 = local77[1] - Static42.anInt542;
					Static257.anInt4618 = local77[2] - Static42.anInt534;
				}
			}
			if (Static42.aClass3_Sub7_Sub16_2.anInt6362 == 37) {
				Static42.aFloat4 = 3.0F;
				Static42.aFloat5 = 3.0F;
			} else if (Static42.aClass3_Sub7_Sub16_2.anInt6362 == 50) {
				Static42.aFloat4 = 4.0F;
				Static42.aFloat5 = 4.0F;
			} else if (Static42.aClass3_Sub7_Sub16_2.anInt6362 == 75) {
				Static42.aFloat4 = 6.0F;
				Static42.aFloat5 = 6.0F;
			} else if (Static42.aClass3_Sub7_Sub16_2.anInt6362 == 100) {
				Static42.aFloat4 = 8.0F;
				Static42.aFloat5 = 8.0F;
			} else if (Static42.aClass3_Sub7_Sub16_2.anInt6362 == 200) {
				Static42.aFloat4 = 16.0F;
				Static42.aFloat5 = 16.0F;
			} else {
				Static42.aFloat4 = 8.0F;
				Static42.aFloat5 = 8.0F;
			}
			Static42.anInt531 = (int) Static42.aFloat4 >> 1;
			Static42.aByteArrayArrayArray3 = Static221.method3685(Static42.anInt531);
			Static43.method691();
			Static42.method447();
			Static299.aClass138_37 = new Class138();
			Static42.anInt529 += (int) (Math.random() * 5.0D) - 2;
			if (Static42.anInt529 < -8) {
				Static42.anInt529 = -8;
			}
			Static42.anInt530 += (int) (Math.random() * 5.0D) - 2;
			if (Static42.anInt529 > 8) {
				Static42.anInt529 = 8;
			}
			if (Static42.anInt530 < -16) {
				Static42.anInt530 = -16;
			}
			if (Static42.anInt530 > 16) {
				Static42.anInt530 = 16;
			}
			Static42.method464(arg1, Static42.anInt529 >> 2 << 10, Static42.anInt530 >> 1);
			Static42.aClass195_2.method4497(1024, 256);
			Static42.aClass24_2.method313(256, 256);
			Static42.aClass217_2.method5006(4096);
			Static139.aClass163_1.method3740(256);
			Static130.anInt2452 = 20;
		} else if (Static130.anInt2452 == 20) {
			Static158.method2445(true);
			Static42.method457(arg0, Static42.anInt529, Static42.anInt530);
			Static130.anInt2452 = 60;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 60) {
			if (Static42.aClass20_13.method246(Static42.aClass3_Sub7_Sub16_2.aString66 + "_staticelements")) {
				if (!Static42.aClass20_13.method249(Static42.aClass3_Sub7_Sub16_2.aString66 + "_staticelements")) {
					return;
				}
				Static42.aClass169_2 = Static102.method1693(Static241.aBoolean330, Static42.aClass20_13, Static42.aClass3_Sub7_Sub16_2.aString66 + "_staticelements");
			} else {
				Static42.aClass169_2 = new Class169(0);
			}
			Static42.method455();
			Static130.anInt2452 = 70;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 70) {
			Static156.aClass111_6 = new Class111(arg0, 11, true, Static173.aCanvas2);
			Static130.anInt2452 = 73;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 73) {
			Static127.aClass111_5 = new Class111(arg0, 12, true, Static173.aCanvas2);
			Static130.anInt2452 = 76;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 76) {
			Static98.aClass111_2 = new Class111(arg0, 14, true, Static173.aCanvas2);
			Static130.anInt2452 = 79;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 79) {
			Static16.aClass111_1 = new Class111(arg0, 17, true, Static173.aCanvas2);
			Static130.anInt2452 = 82;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 82) {
			Static291.aClass111_8 = new Class111(arg0, 19, true, Static173.aCanvas2);
			Static130.anInt2452 = 85;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 85) {
			Static114.aClass111_4 = new Class111(arg0, 22, true, Static173.aCanvas2);
			Static130.anInt2452 = 88;
			Static158.method2445(true);
			Static194.method3071();
		} else if (Static130.anInt2452 == 88) {
			Static105.aClass111_3 = new Class111(arg0, 26, true, Static173.aCanvas2);
			Static130.anInt2452 = 91;
			Static158.method2445(true);
			Static194.method3071();
		} else {
			Static233.aClass111_7 = new Class111(arg0, 30, true, Static173.aCanvas2);
			Static130.anInt2452 = 100;
			Static158.method2445(true);
			Static194.method3071();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public static void method1846() {
		Static49.aClass138_39.method3046();
		for (@Pc(21) Class3_Sub4 local21 = (Class3_Sub4) Static47.aClass138_7.method3051(); local21 != null; local21 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			if (local21.anInt808 < 1000) {
				local21.method5700();
				Static49.aClass138_39.method3053(local21);
			}
		}
		Static49.aClass138_39.method3048(Static47.aClass138_7);
		@Pc(49) int local49 = -1;
		if (Static46.aClass3_Sub33_1 != null) {
			local49 = Static46.aClass3_Sub33_1.method5158();
		}
		if (!Static287.aBoolean397) {
			if (local49 == 0 && (Static346.anInt5849 == 1 && Static105.anInt2076 > 2 || Static167.method2524())) {
				local49 = 2;
			}
			if (local49 == 2 && Static105.anInt2076 > 0 && Static46.aClass3_Sub33_1 != null) {
				if (Static313.aClass62_18 == null && Static43.anInt778 == 0) {
					Static282.method4477(Static46.aClass3_Sub33_1.method5156(), Static46.aClass3_Sub33_1.method5157());
				} else {
					Static247.anInt4442 = 2;
				}
			}
			if (local49 == 0 && Static105.anInt2076 > 0) {
				Static146.method2298();
			}
			if (Static313.aClass62_18 == null && Static43.anInt778 == 0) {
				Static247.anInt4442 = 0;
				Static293.aClass3_Sub4_2 = null;
				return;
			}
			return;
		}
		@Pc(124) int local124;
		@Pc(128) int local128;
		if (local49 == -1) {
			local124 = Static200.aClass10_1.method5242();
			local128 = Static200.aClass10_1.method5240();
			if (Static96.anInt1932 - 10 > local124 || local124 > Static96.anInt1932 + Static392.anInt6472 + 10 || Static321.anInt3403 - 10 > local128 || Static321.anInt3403 + Static139.anInt2635 + 10 < local128) {
				Static287.aBoolean397 = false;
				Static203.method3170(Static321.anInt3403, Static96.anInt1932, Static392.anInt6472, Static139.anInt2635);
			}
		}
		if (local49 != 0) {
			return;
		}
		local124 = Static96.anInt1932;
		local128 = Static321.anInt3403;
		@Pc(177) int local177 = Static392.anInt6472;
		@Pc(181) int local181 = Static46.aClass3_Sub33_1.method5156();
		@Pc(185) int local185 = Static46.aClass3_Sub33_1.method5157();
		@Pc(187) int local187 = -1;
		@Pc(205) int local205;
		for (@Pc(189) int local189 = 0; local189 < Static105.anInt2076; local189++) {
			if (Static349.aBoolean449) {
				local205 = (Static105.anInt2076 - local189 - 1) * 16 + local128 + 33;
				if (local181 > local124 && local181 < local177 + local124 && local185 > local205 - 13 && local185 < local205 + 4) {
					local187 = local189;
				}
			} else {
				local205 = (Static105.anInt2076 - local189 - 1) * 16 + local128 + 31;
				if (local181 > local124 && local181 < local124 + local177 && local205 - 13 < local185 && local185 < local205 + 3) {
					local187 = local189;
				}
			}
		}
		if (local187 != -1) {
			local205 = 0;
			@Pc(301) Class130 local301 = new Class130(Static47.aClass138_7);
			for (@Pc(306) Class3_Sub4 local306 = (Class3_Sub4) local301.method2819(); local306 != null; local306 = (Class3_Sub4) local301.method2817()) {
				if (local205 == local187) {
					Static96.method1617(local306, local181, local185);
				}
				local205++;
			}
		}
		Static287.aBoolean397 = false;
		Static203.method3170(Static321.anInt3403, Static96.anInt1932, Static392.anInt6472, Static139.anInt2635);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Z")
	public static boolean method1848() {
		try {
			if (Static175.anInt3065 == 2) {
				if (Static244.aClass3_Sub35_2 == null) {
					Static244.aClass3_Sub35_2 = Static404.method4322(Static48.aClass20_16, Static113.anInt2187, Static317.anInt4554);
					if (Static244.aClass3_Sub35_2 == null) {
						return false;
					}
				}
				if (Static55.aClass231_1 == null) {
					Static55.aClass231_1 = new Class231(Static187.aClass20_46, Static134.aClass20_38);
				}
				if (Static69.aClass3_Sub8_Sub4_1.method2163(Static55.aClass231_1, Static244.aClass3_Sub35_2, Static282.aClass20_65)) {
					Static69.aClass3_Sub8_Sub4_1.method2158();
					Static69.aClass3_Sub8_Sub4_1.method2157(Static83.anInt1721);
					Static69.aClass3_Sub8_Sub4_1.method2142(Static244.aClass3_Sub35_2, Static249.aBoolean503);
					Static48.aClass20_16 = null;
					Static55.aClass231_1 = null;
					Static244.aClass3_Sub35_2 = null;
					Static175.anInt3065 = 0;
					return true;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static69.aClass3_Sub8_Sub4_1.method2147();
			Static55.aClass231_1 = null;
			Static48.aClass20_16 = null;
			Static175.anInt3065 = 0;
			Static244.aClass3_Sub35_2 = null;
		}
		return false;
	}
}
