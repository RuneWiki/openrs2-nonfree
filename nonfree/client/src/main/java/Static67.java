import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!oa;")
	public static Class9 aClass9_18;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!fe;")
	public static Class17 aClass17_81 = new Class17(64);

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	public static int anInt2202 = 0;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!lc;")
	public static Class31 aClass31_764 = Static56.method1206("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public static final int anInt2203 = 0;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_765 = Static56.method1206("mod_icons");

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	public static int anInt2204 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
	public static boolean method1354() {
		if (Static89.aClass35_4 == null) {
			return false;
		}
		@Pc(175) int local175;
		try {
			@Pc(13) int local13 = Static89.aClass35_4.method1350();
			if (local13 == 0) {
				return false;
			}
			if (Static76.anInt2256 == -1) {
				local13--;
				Static89.aClass35_4.method1352(1, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
				Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
				Static76.anInt2256 = Static3.aClass2_Sub6_Sub1_1.method686();
				Static87.anInt2339 = Static12.anIntArray76[Static76.anInt2256];
			}
			if (Static87.anInt2339 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static89.aClass35_4.method1352(1, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
				Static87.anInt2339 = Static3.aClass2_Sub6_Sub1_1.aByteArray11[0] & 0xFF;
			}
			if (Static87.anInt2339 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static89.aClass35_4.method1352(2, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
				Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
				local13 -= 2;
				Static87.anInt2339 = Static3.aClass2_Sub6_Sub1_1.method627();
			}
			if (Static87.anInt2339 > local13) {
				return false;
			}
			Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
			Static89.aClass35_4.method1352(Static87.anInt2339, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
			Static2.anInt105 = Static98.anInt1186;
			Static98.anInt1186 = Static69.anInt2217;
			Static69.anInt2217 = Static76.anInt2256;
			Static13.anInt571 = 0;
			if (Static76.anInt2256 == 216) {
				Static31.anInt1279 = Static3.aClass2_Sub6_Sub1_1.method671();
				Static76.anInt2256 = -1;
				Static58.aBoolean100 = true;
				Static92.aBoolean81 = true;
				return true;
			}
			@Pc(139) long local139;
			if (Static76.anInt2256 == 71) {
				local139 = Static3.aClass2_Sub6_Sub1_1.method674();
				@Pc(145) Class31 local145 = Static25.method755(Static3.aClass2_Sub6_Sub1_1).method1221();
				Static74.method1397(local145, 6, Static39.method1010(local139).method1196());
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(181) int local181;
			@Pc(171) int local171;
			@Pc(195) int local195;
			if (Static76.anInt2256 == 116) {
				Static92.aBoolean81 = true;
				local171 = Static3.aClass2_Sub6_Sub1_1.method671();
				local175 = Static3.aClass2_Sub6_Sub1_1.method641();
				local181 = Static3.aClass2_Sub6_Sub1_1.method656();
				Static91.anIntArray349[local181] = local175;
				Static85.anIntArray357[local181] = local171;
				Static48.anIntArray257[local181] = 1;
				for (local195 = 0; local195 < 98; local195++) {
					if (local175 >= Class1_Sub2.anIntArray243[local195]) {
						Static48.anIntArray257[local181] = local195 + 2;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 239) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method650();
				if (local171 >= 0) {
					Static60.method1287(local171);
				}
				if (Static45.anInt1603 != local171) {
					Static39.method1011(Static45.anInt1603);
					Static45.anInt1603 = local171;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 181) {
				Static27.anInt1161 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 197) {
				Static69.method1377();
				Static76.anInt2256 = -1;
				return false;
			}
			if (Static76.anInt2256 == 170) {
				Static91.method1541();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 108) {
				for (local171 = 0; local171 < Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3.length; local171++) {
					if (Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local171] != null) {
						Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local171].anInt2014 = -1;
					}
				}
				for (local175 = 0; local175 < Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1.length; local175++) {
					if (Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local175] != null) {
						Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local175].anInt2014 = -1;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 144) {
				Static45.anInt1607 = Static3.aClass2_Sub6_Sub1_1.method656();
				Static5.anInt155 = Static3.aClass2_Sub6_Sub1_1.method671();
				for (local171 = Static5.anInt155; local171 < Static5.anInt155 + 8; local171++) {
					for (local175 = Static45.anInt1607; local175 < Static45.anInt1607 + 8; local175++) {
						if (Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local171][local175] != null) {
							Static78.aClass36ArrayArrayArray1[Static58.anInt1945][local171][local175] = null;
							method1355(local175, local171);
						}
					}
				}
				for (@Pc(380) Class2_Sub3 local380 = (Class2_Sub3) Static62.aClass36_5.method1365(); local380 != null; local380 = (Class2_Sub3) Static62.aClass36_5.method1361()) {
					if (local380.anInt355 >= Static5.anInt155 && Static5.anInt155 + 8 > local380.anInt355 && Static45.anInt1607 <= local380.anInt363 && Static45.anInt1607 + 8 > local380.anInt363 && local380.anInt356 == Static58.anInt1945) {
						local380.anInt360 = 0;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 25) {
				if (Static54.anInt1802 != -1) {
					Static39.method1011(Static54.anInt1802);
					Static92.aBoolean81 = true;
					Static54.anInt1802 = -1;
					Static58.aBoolean100 = true;
				}
				if (Static47.anInt1736 != -1) {
					Static39.method1011(Static47.anInt1736);
					Static47.anInt1736 = -1;
					Static27.aBoolean65 = true;
				}
				if (Static16.anInt773 != -1) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = -1;
					Static75.method1404(30);
				}
				if (Static41.anInt1577 != -1) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = -1;
				}
				if (Static42.anInt1586 != -1) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = -1;
				}
				if (Static49.anInt2692 != 0) {
					Static27.aBoolean65 = true;
					Static49.anInt2692 = 0;
				}
				Static76.anInt2256 = -1;
				Static60.aBoolean104 = false;
				return true;
			}
			if (Static76.anInt2256 == 94) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method647();
				if (local171 != Static37.anInt1409) {
					Static39.method1011(Static37.anInt1409);
					Static37.anInt1409 = local171;
				}
				Static76.anInt2256 = -1;
				Static27.aBoolean65 = true;
				return true;
			}
			@Pc(546) Class2_Sub1_Sub2 local546;
			if (Static76.anInt2256 == 15) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method641();
				local175 = Static3.aClass2_Sub6_Sub1_1.method647();
				local181 = Static3.aClass2_Sub6_Sub1_1.method653();
				local546 = Static7.method187(local171);
				Static76.anInt2256 = -1;
				local546.anInt263 = local175 + local546.anInt244;
				local546.anInt267 = local546.anInt260 + local181;
				return true;
			}
			if (Static76.anInt2256 == 11) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method627();
				local175 = Static3.aClass2_Sub6_Sub1_1.method665();
				local181 = Static3.aClass2_Sub6_Sub1_1.method627();
				if (Static86.anInt2325 != 0 && local175 != 0 && Static100.anInt2712 < 50) {
					Static39.anIntArray232[Static100.anInt2712] = local171;
					Static59.anIntArray287[Static100.anInt2712] = local175;
					Static78.anIntArray321[Static100.anInt2712] = local181;
					Static34.aClass10Array1[Static100.anInt2712] = null;
					Static100.anInt2712++;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 120) {
				if (Static31.anInt1279 == 12) {
					Static92.aBoolean81 = true;
				}
				Static75.anInt2247 = Static3.aClass2_Sub6_Sub1_1.method657();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 224) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static60.method1287(local171);
				if (Static54.anInt1802 != -1) {
					Static39.method1011(Static54.anInt1802);
					Static58.aBoolean100 = true;
					Static92.aBoolean81 = true;
					Static54.anInt1802 = -1;
				}
				if (Static16.anInt773 != -1) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = -1;
					Static75.method1404(30);
				}
				if (Static41.anInt1577 != -1) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = -1;
				}
				if (Static42.anInt1586 != -1) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = -1;
				}
				if (Static47.anInt1736 != local171) {
					Static39.method1011(Static47.anInt1736);
					Static47.anInt1736 = local171;
				}
				Static60.aBoolean104 = false;
				Static27.aBoolean65 = true;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 195) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static60.method1287(local171);
				if (Static54.anInt1802 != -1) {
					Static39.method1011(Static54.anInt1802);
					Static92.aBoolean81 = true;
					Static54.anInt1802 = -1;
					Static58.aBoolean100 = true;
				}
				if (Static47.anInt1736 != -1) {
					Static39.method1011(Static47.anInt1736);
					Static47.anInt1736 = -1;
					Static27.aBoolean65 = true;
				}
				if (Static16.anInt773 != -1) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = -1;
					Static75.method1404(30);
				}
				if (Static41.anInt1577 != -1) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = -1;
				}
				if (Static42.anInt1586 != local171) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = local171;
				}
				Static76.anInt2256 = -1;
				Static60.aBoolean104 = false;
				if (Static49.anInt2692 != 0) {
					Static49.anInt2692 = 0;
					Static27.aBoolean65 = true;
				}
				return true;
			}
			@Pc(793) Class2_Sub1_Sub2 local793;
			if (Static76.anInt2256 == 84) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method641();
				local793 = Static7.method187(local171);
				local793.anInt252 = 3;
				local793.anInt271 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass4_3.method90();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 153) {
				Static100.anInt2726 = Static3.aClass2_Sub6_Sub1_1.method633();
				Static3.aClass2_Sub6_Sub1_1.method627();
				Static30.anInt1257 = Static3.aClass2_Sub6_Sub1_1.method632();
				Static96.anInt2605 = Static3.aClass2_Sub6_Sub1_1.method632();
				Static50.anInt475 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static23.anInt1025 = Static3.aClass2_Sub6_Sub1_1.method633();
				Static101.anInt2750 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static8.anInt305 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static3.aClass2_Sub6_Sub1_1.method633();
				Static40.anInt2026 = Static3.aClass2_Sub6_Sub1_1.method632();
				Static18.anInt803 = Static3.aClass2_Sub6_Sub1_1.method663();
				Static76.aClass59_5 = Static51.aClass51_2.method1470(Static18.anInt803);
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(883) Class31 local883;
			if (Static76.anInt2256 == 85) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method628();
				local883 = Static3.aClass2_Sub6_Sub1_1.method670();
				local181 = Static3.aClass2_Sub6_Sub1_1.method656();
				if (local181 >= 1 && local181 <= 5) {
					if (local883.method1210(Static106.aClass31_954)) {
						local883 = null;
					}
					Static93.aClass31Array15[local181 - 1] = local883;
					Static33.aBooleanArray29[local181 - 1] = local171 == 0;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(947) int local947;
			if (Static76.anInt2256 == 202) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method660();
				local175 = Static3.aClass2_Sub6_Sub1_1.method633();
				local181 = local175 >> 10 & 0x1F;
				@Pc(943) Class2_Sub1_Sub2 local943 = Static7.method187(local171);
				local947 = local175 & 0x1F;
				local195 = local175 >> 5 & 0x1F;
				local943.anInt276 = (local947 << 3) + (local195 << 11) + (local181 << 19);
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 38) {
				Static19.anInt851 = Static3.aClass2_Sub6_Sub1_1.method633() * 30;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 28) {
				Static60.anInt2058 = Static3.aClass2_Sub6_Sub1_1.method628();
				if (Static60.anInt2058 == Static31.anInt1279) {
					Static92.aBoolean81 = true;
					if (Static60.anInt2058 == 3) {
						Static31.anInt1279 = 1;
					} else {
						Static31.anInt1279 = 3;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 243) {
				for (local171 = 0; local171 < Static40.anInt2024; local171++) {
					@Pc(1027) Class2_Sub1_Sub9 local1027 = Static39.method1006(local171);
					if (local1027 != null && local1027.anInt1943 == 0) {
						Static106.anIntArray391[local171] = 0;
						Static8.anIntArray46[local171] = 0;
					}
				}
				Static76.anInt2256 = -1;
				Static92.aBoolean81 = true;
				if (Static37.anInt1409 != -1) {
					Static27.aBoolean65 = true;
				}
				return true;
			}
			@Pc(1078) Class2_Sub1_Sub2 local1078;
			if (Static76.anInt2256 == 36) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method632();
				local175 = Static3.aClass2_Sub6_Sub1_1.method663();
				local1078 = Static7.method187(local175);
				if (local1078 != null && local1078.anInt270 == 0) {
					if (local171 < 0) {
						local171 = 0;
					}
					if (local1078.anInt275 - local1078.anInt248 < local171) {
						local171 = local1078.anInt275 - local1078.anInt248;
					}
					local1078.anInt256 = local171;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 128) {
				Static92.aBoolean81 = true;
				local171 = Static3.aClass2_Sub6_Sub1_1.method629();
				local793 = Static7.method187(local171);
				local181 = Static3.aClass2_Sub6_Sub1_1.method627();
				for (local195 = 0; local195 < local181; local195++) {
					local947 = Static3.aClass2_Sub6_Sub1_1.method628();
					if (local947 == 255) {
						local947 = Static3.aClass2_Sub6_Sub1_1.method629();
					}
					local793.anIntArray40[local195] = Static3.aClass2_Sub6_Sub1_1.method633();
					local793.anIntArray43[local195] = local947;
				}
				for (local947 = local181; local947 < local793.anIntArray40.length; local947++) {
					local793.anIntArray40[local947] = 0;
					local793.anIntArray43[local947] = 0;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 24) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method633();
				local175 = Static3.aClass2_Sub6_Sub1_1.method632();
				local181 = Static3.aClass2_Sub6_Sub1_1.method663();
				local546 = Static7.method187(local181);
				Static76.anInt2256 = -1;
				local546.anInt235 = local175 + (local171 << 16);
				return true;
			}
			if (Static76.anInt2256 == 74) {
				if (Static31.anInt1279 == 12) {
					Static92.aBoolean81 = true;
				}
				Static103.anInt2769 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 121) {
				Static76.anInt2256 = -1;
				Static85.anInt2509 = 0;
				return true;
			}
			if (Static76.anInt2256 == 122) {
				Static56.method1207(false);
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 45) {
				Static92.aBoolean81 = true;
				local171 = Static3.aClass2_Sub6_Sub1_1.method629();
				local793 = Static7.method187(local171);
				while (Static3.aClass2_Sub6_Sub1_1.anInt952 < Static87.anInt2339) {
					local181 = Static3.aClass2_Sub6_Sub1_1.method646();
					local195 = Static3.aClass2_Sub6_Sub1_1.method627();
					local947 = Static3.aClass2_Sub6_Sub1_1.method665();
					if (local947 == 255) {
						local947 = Static3.aClass2_Sub6_Sub1_1.method629();
					}
					if (local181 >= 0 && local181 < local793.anIntArray40.length) {
						local793.anIntArray40[local181] = local195;
						local793.anIntArray43[local181] = local947;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 162) {
				Static95.aBoolean133 = true;
				Static105.anInt2782 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static90.anInt2413 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static53.anInt1795 = Static3.aClass2_Sub6_Sub1_1.method627();
				Static69.anInt2221 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static3.anInt124 = Static3.aClass2_Sub6_Sub1_1.method665();
				if (Static3.anInt124 >= 100) {
					Static91.anInt2484 = Static90.anInt2413 * 128 + 64;
					Static44.anInt1595 = Static105.anInt2782 * 128 + 64;
					Static57.anInt2682 = Static42.method1057(Static44.anInt1595, Static91.anInt2484, Static58.anInt1945) - Static53.anInt1795;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(1522) int local1522;
			if (Static76.anInt2256 == 155) {
				local139 = Static3.aClass2_Sub6_Sub1_1.method674();
				local181 = Static3.aClass2_Sub6_Sub1_1.method627();
				@Pc(1422) Class31 local1422 = Static39.method1010(local139).method1196();
				for (local947 = 0; local947 < Static34.anInt1312; local947++) {
					if (local139 == Static45.aLongArray4[local947]) {
						if (local181 != Static41.anIntArray246[local947]) {
							Static41.anIntArray246[local947] = local181;
							Static92.aBoolean81 = true;
							if (local181 > 0) {
								Static74.method1397(Static37.method974(new Class31[] { local1422, Static39.aClass31_535 }), 5, Static39.aClass31_531);
							}
							if (local181 == 0) {
								Static74.method1397(Static37.method974(new Class31[] { local1422, Static91.aClass31_860 }), 5, Static39.aClass31_531);
							}
						}
						local1422 = null;
						break;
					}
				}
				if (local1422 != null && Static34.anInt1312 < 200) {
					Static45.aLongArray4[Static34.anInt1312] = local139;
					Static51.aClass31Array7[Static34.anInt1312] = local1422;
					Static41.anIntArray246[Static34.anInt1312] = local181;
					Static34.anInt1312++;
					Static92.aBoolean81 = true;
				}
				@Pc(1516) boolean local1516 = false;
				while (!local1516) {
					local1516 = true;
					for (local1522 = 0; local1522 < Static34.anInt1312 - 1; local1522++) {
						if (Static2.anInt100 != Static41.anIntArray246[local1522] && Static41.anIntArray246[local1522 + 1] == Static2.anInt100 || Static41.anIntArray246[local1522] == 0 && Static41.anIntArray246[local1522 + 1] != 0) {
							local1516 = false;
							@Pc(1552) int local1552 = Static41.anIntArray246[local1522];
							Static41.anIntArray246[local1522] = Static41.anIntArray246[local1522 + 1];
							Static41.anIntArray246[local1522 + 1] = local1552;
							@Pc(1570) Class31 local1570 = Static51.aClass31Array7[local1522];
							Static51.aClass31Array7[local1522] = Static51.aClass31Array7[local1522 + 1];
							Static51.aClass31Array7[local1522 + 1] = local1570;
							@Pc(1588) long local1588 = Static45.aLongArray4[local1522];
							Static45.aLongArray4[local1522] = Static45.aLongArray4[local1522 + 1];
							Static45.aLongArray4[local1522 + 1] = local1588;
							Static92.aBoolean81 = true;
						}
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 157) {
				Static59.method1280(Static3.aClass2_Sub6_Sub1_1, Static51.aClass51_2, Static87.anInt2339);
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 142) {
				Static5.anInt155 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static45.anInt1607 = Static3.aClass2_Sub6_Sub1_1.method628();
				while (Static87.anInt2339 > Static3.aClass2_Sub6_Sub1_1.anInt952) {
					Static76.anInt2256 = Static3.aClass2_Sub6_Sub1_1.method665();
					Static99.method1688();
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 110) {
				Static11.method355();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 133) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method641();
				local175 = Static3.aClass2_Sub6_Sub1_1.method633();
				local1078 = Static7.method187(local171);
				local1078.anInt271 = local175;
				local1078.anInt252 = 1;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 32) {
				Static27.aBoolean65 = true;
				Static2.aBoolean8 = false;
				Static76.anInt2256 = -1;
				Static49.anInt2692 = 1;
				Static39.aClass31_538 = Static39.aClass31_531;
				return true;
			}
			if (Static76.anInt2256 == 58) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				local175 = Static3.aClass2_Sub6_Sub1_1.method632();
				local181 = Static3.aClass2_Sub6_Sub1_1.method641();
				local195 = Static3.aClass2_Sub6_Sub1_1.method632();
				@Pc(1743) Class2_Sub1_Sub2 local1743 = Static7.method187(local181);
				local1743.anInt273 = local195;
				local1743.anInt236 = local171;
				local1743.anInt249 = local175;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 249) {
				Static58.anInt1938 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 66) {
				Static8.anInt288 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(1794) long local1794;
			if (Static76.anInt2256 == 103) {
				local139 = Static3.aClass2_Sub6_Sub1_1.method674();
				local1794 = Static3.aClass2_Sub6_Sub1_1.method627();
				@Pc(1799) long local1799 = (long) Static3.aClass2_Sub6_Sub1_1.method639();
				local1522 = Static3.aClass2_Sub6_Sub1_1.method665();
				@Pc(1810) long local1810 = (local1794 << 32) + local1799;
				@Pc(1812) boolean local1812 = false;
				for (@Pc(1814) int local1814 = 0; local1814 < 100; local1814++) {
					if (local1810 == Static89.aLongArray5[local1814]) {
						local1812 = true;
						break;
					}
				}
				if (local1522 <= 1) {
					for (@Pc(1839) int local1839 = 0; local1839 < Static88.anInt2367; local1839++) {
						if (Static16.aLongArray2[local1839] == local139) {
							local1812 = true;
							break;
						}
					}
				}
				if (!local1812 && Static68.anInt2207 == 0) {
					Static89.aLongArray5[Static99.anInt2673] = local1810;
					Static99.anInt2673 = (Static99.anInt2673 + 1) % 100;
					@Pc(1888) Class31 local1888 = Static25.method755(Static3.aClass2_Sub6_Sub1_1).method1221();
					if (local1522 == 2 || local1522 == 3) {
						Static74.method1397(local1888, 7, Static37.method974(new Class31[] { Static7.aClass31_102, Static39.method1010(local139).method1196() }));
					} else if (local1522 == 1) {
						Static74.method1397(local1888, 7, Static37.method974(new Class31[] { Static38.aClass31_518, Static39.method1010(local139).method1196() }));
					} else {
						Static74.method1397(local1888, 3, Static39.method1010(local139).method1196());
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 241) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method663();
				local175 = Static3.aClass2_Sub6_Sub1_1.method633();
				local1078 = Static7.method187(local171);
				local1078.anInt271 = local175;
				local1078.anInt252 = 2;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 54) {
				Static88.anInt2367 = Static87.anInt2339 / 8;
				for (local171 = 0; local171 < Static88.anInt2367; local171++) {
					Static16.aLongArray2[local171] = Static3.aClass2_Sub6_Sub1_1.method674();
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 102) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				Static60.method1287(local171);
				if (Static47.anInt1736 != -1) {
					Static39.method1011(Static47.anInt1736);
					Static47.anInt1736 = -1;
					Static27.aBoolean65 = true;
				}
				if (Static16.anInt773 != -1) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = -1;
					Static75.method1404(30);
				}
				if (Static41.anInt1577 != -1) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = -1;
				}
				if (Static42.anInt1586 != -1) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = -1;
				}
				if (Static54.anInt1802 != local171) {
					Static39.method1011(Static54.anInt1802);
					Static54.anInt1802 = local171;
				}
				if (Static49.anInt2692 != 0) {
					Static27.aBoolean65 = true;
					Static49.anInt2692 = 0;
				}
				Static60.aBoolean104 = false;
				Static92.aBoolean81 = true;
				Static58.aBoolean100 = true;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 255) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method665();
				local175 = Static3.aClass2_Sub6_Sub1_1.method665();
				local181 = Static3.aClass2_Sub6_Sub1_1.method665();
				local195 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static44.aBooleanArray39[local171] = true;
				Static24.anIntArray116[local171] = local175;
				Static77.anIntArray319[local171] = local181;
				Static72.anIntArray168[local171] = local195;
				Static85.anIntArray356[local171] = 0;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 223) {
				Static45.anInt1607 = Static3.aClass2_Sub6_Sub1_1.method671();
				Static5.anInt155 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 250) {
				@Pc(2176) boolean local2176 = Static3.aClass2_Sub6_Sub1_1.method665() == 1;
				local175 = Static3.aClass2_Sub6_Sub1_1.method629();
				local1078 = Static7.method187(local175);
				Static76.anInt2256 = -1;
				local1078.aBoolean17 = local2176;
				return true;
			}
			if (Static76.anInt2256 == 136) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method629();
				local793 = Static7.method187(local171);
				for (local181 = 0; local181 < local793.anIntArray40.length; local181++) {
					local793.anIntArray40[local181] = -1;
					local793.anIntArray40[local181] = 0;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 194) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				@Pc(2239) byte local2239 = Static3.aClass2_Sub6_Sub1_1.method662();
				Static106.anIntArray391[local171] = local2239;
				if (Static8.anIntArray46[local171] != local2239) {
					Static8.anIntArray46[local171] = local2239;
					Static9.method205(local171);
					Static92.aBoolean81 = true;
					if (Static37.anInt1409 != -1) {
						Static27.aBoolean65 = true;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 26) {
				Static27.aBoolean65 = true;
				Static2.aBoolean8 = false;
				Static39.aClass31_538 = Static39.aClass31_531;
				Static49.anInt2692 = 2;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 97) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method627();
				local175 = Static3.aClass2_Sub6_Sub1_1.method632();
				if (Static47.anInt1736 != -1) {
					Static39.method1011(Static47.anInt1736);
					Static27.aBoolean65 = true;
					Static47.anInt1736 = -1;
				}
				if (Static16.anInt773 != -1) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = -1;
					Static75.method1404(30);
				}
				if (Static41.anInt1577 != -1) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = -1;
				}
				if (local175 != Static42.anInt1586) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = local175;
				}
				if (local171 != Static54.anInt1802) {
					Static39.method1011(Static54.anInt1802);
					Static54.anInt1802 = local171;
				}
				Static60.aBoolean104 = false;
				Static58.aBoolean100 = true;
				Static92.aBoolean81 = true;
				if (Static49.anInt2692 != 0) {
					Static27.aBoolean65 = true;
					Static49.anInt2692 = 0;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 126) {
				Static56.method1207(true);
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 70) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method632();
				if (local171 == 65535) {
					local171 = -1;
				}
				if (local171 == -1 && Static20.anInt1975 == 0) {
					Static79.method1434();
				} else if (local171 != -1 && Static74.anInt2232 != local171 && Static88.anInt2370 != 0 && Static20.anInt1975 == 0) {
					Static79.method1433(0, local171, Static88.anInt2370, Static21.aClass11_Sub1_7);
				}
				Static74.anInt2232 = local171;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 62) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method639();
				local175 = Static3.aClass2_Sub6_Sub1_1.method632();
				if (local175 == 65535) {
					local175 = -1;
				}
				if (Static88.anInt2370 != 0 && local175 != -1) {
					Static79.method1438(1, local175, Static27.aClass11_Sub1_8, Static88.anInt2370);
					Static20.anInt1975 = local171;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 163) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method667();
				local175 = Static3.aClass2_Sub6_Sub1_1.method633();
				Static60.method1287(local175);
				if (local171 != -1) {
					Static60.method1287(local171);
				}
				if (Static42.anInt1586 != -1) {
					Static39.method1011(Static42.anInt1586);
					Static42.anInt1586 = -1;
				}
				if (Static54.anInt1802 != -1) {
					Static39.method1011(Static54.anInt1802);
					Static54.anInt1802 = -1;
				}
				if (Static47.anInt1736 != -1) {
					Static39.method1011(Static47.anInt1736);
					Static47.anInt1736 = -1;
				}
				if (local175 != Static16.anInt773) {
					Static39.method1011(Static16.anInt773);
					Static16.anInt773 = local175;
					Static75.method1404(35);
				}
				if (Static41.anInt1577 != local175) {
					Static39.method1011(Static41.anInt1577);
					Static41.anInt1577 = local171;
				}
				Static49.anInt2692 = 0;
				Static76.anInt2256 = -1;
				Static60.aBoolean104 = false;
				return true;
			}
			if (Static76.anInt2256 == 118 || Static76.anInt2256 == 63 || Static76.anInt2256 == 21 || Static76.anInt2256 == 46 || Static76.anInt2256 == 135 || Static76.anInt2256 == 69 || Static76.anInt2256 == 221 || Static76.anInt2256 == 56 || Static76.anInt2256 == 129 || Static76.anInt2256 == 35 || Static76.anInt2256 == 244) {
				Static99.method1688();
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 213) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method641();
				local175 = Static3.aClass2_Sub6_Sub1_1.method653();
				local1078 = Static7.method187(local171);
				if (local1078.anInt243 != local175 || local175 == -1) {
					local1078.anInt243 = local175;
					local1078.anInt253 = 0;
					local1078.anInt264 = 0;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 17) {
				Static95.aBoolean133 = false;
				for (local171 = 0; local171 < 5; local171++) {
					Static44.aBooleanArray39[local171] = false;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 90) {
				Static62.anInt2116 = Static3.aClass2_Sub6_Sub1_1.method665();
				if (Static62.anInt2116 == 1) {
					Static61.anInt2099 = Static3.aClass2_Sub6_Sub1_1.method627();
				}
				if (Static62.anInt2116 >= 2 && Static62.anInt2116 <= 6) {
					if (Static62.anInt2116 == 2) {
						Static20.anInt1976 = 64;
						Static103.anInt2762 = 64;
					}
					if (Static62.anInt2116 == 3) {
						Static20.anInt1976 = 0;
						Static103.anInt2762 = 64;
					}
					if (Static62.anInt2116 == 4) {
						Static20.anInt1976 = 128;
						Static103.anInt2762 = 64;
					}
					if (Static62.anInt2116 == 5) {
						Static103.anInt2762 = 0;
						Static20.anInt1976 = 64;
					}
					if (Static62.anInt2116 == 6) {
						Static20.anInt1976 = 64;
						Static103.anInt2762 = 128;
					}
					Static62.anInt2116 = 2;
					Static65.anInt2167 = Static3.aClass2_Sub6_Sub1_1.method627();
					Static43.anInt1588 = Static3.aClass2_Sub6_Sub1_1.method627();
					Static31.anInt1272 = Static3.aClass2_Sub6_Sub1_1.method665();
				}
				if (Static62.anInt2116 == 10) {
					Static51.anInt1780 = Static3.aClass2_Sub6_Sub1_1.method627();
				}
				Static76.anInt2256 = -1;
				return true;
			}
			@Pc(2786) int local2786;
			@Pc(2764) Class31 local2764;
			if (Static76.anInt2256 == 3) {
				local2764 = Static3.aClass2_Sub6_Sub1_1.method670();
				@Pc(2784) boolean local2784;
				if (local2764.method1197(Static62.aClass31_740)) {
					local883 = local2764.method1213(local2764.method1209(Static7.aClass31_95), 0);
					local1794 = local883.method1201();
					local2784 = false;
					for (local2786 = 0; local2786 < Static88.anInt2367; local2786++) {
						if (local1794 == Static16.aLongArray2[local2786]) {
							local2784 = true;
							break;
						}
					}
					if (!local2784 && Static68.anInt2207 == 0) {
						Static74.method1397(Static46.aClass31_586, 4, local883);
					}
				} else if (local2764.method1197(Static59.aClass31_716)) {
					local883 = local2764.method1213(local2764.method1209(Static7.aClass31_95), 0);
					local2784 = false;
					local1794 = local883.method1201();
					for (local2786 = 0; local2786 < Static88.anInt2367; local2786++) {
						if (Static16.aLongArray2[local2786] == local1794) {
							local2784 = true;
							break;
						}
					}
					if (!local2784 && Static68.anInt2207 == 0) {
						Static74.method1397(Static51.aClass31_634, 8, local883);
					}
				} else if (local2764.method1197(Static3.aClass31_54)) {
					local883 = local2764.method1213(local2764.method1209(Static7.aClass31_95), 0);
					local1794 = local883.method1201();
					local2784 = false;
					for (local2786 = 0; local2786 < Static88.anInt2367; local2786++) {
						if (local1794 == Static16.aLongArray2[local2786]) {
							local2784 = true;
							break;
						}
					}
					if (!local2784 && Static68.anInt2207 == 0) {
						@Pc(2893) Class31 local2893 = local2764.method1213(local2764.method1223() - 9, local2764.method1209(Static7.aClass31_95) + 1);
						Static74.method1397(local2893, 8, local883);
					}
				} else {
					Static74.method1397(local2764, 0, Static39.aClass31_531);
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 232) {
				for (local171 = 0; local171 < Static8.anIntArray46.length; local171++) {
					if (Static106.anIntArray391[local171] != Static8.anIntArray46[local171]) {
						Static8.anIntArray46[local171] = Static106.anIntArray391[local171];
						Static9.method205(local171);
						Static92.aBoolean81 = true;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 252) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method628();
				local175 = Static3.aClass2_Sub6_Sub1_1.method633();
				if (local175 == 65535) {
					local175 = -1;
				}
				if (Static41.anIntArray245[local171] != local175) {
					Static39.method1011(Static41.anIntArray245[local171]);
					Static41.anIntArray245[local171] = local175;
				}
				Static76.anInt2256 = -1;
				Static58.aBoolean100 = true;
				Static92.aBoolean81 = true;
				return true;
			}
			if (Static76.anInt2256 == 80) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method629();
				local175 = Static3.aClass2_Sub6_Sub1_1.method627();
				Static106.anIntArray391[local175] = local171;
				if (Static8.anIntArray46[local175] != local171) {
					Static8.anIntArray46[local175] = local171;
					Static9.method205(local175);
					if (Static37.anInt1409 != -1) {
						Static27.aBoolean65 = true;
					}
					Static92.aBoolean81 = true;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 203) {
				Static16.anInt767 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static92.aBoolean81 = true;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 53) {
				local2764 = Static3.aClass2_Sub6_Sub1_1.method670();
				local175 = Static3.aClass2_Sub6_Sub1_1.method660();
				local1078 = Static7.method187(local175);
				local1078.aClass31_94 = local2764;
				if (Static41.anIntArray245[Static31.anInt1279] == local175 >> 16) {
					Static92.aBoolean81 = true;
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 180) {
				Static78.anInt2283 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static12.anInt527 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static92.anInt1560 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static27.aBoolean65 = true;
				Static74.aBoolean115 = true;
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 215) {
				Static95.aBoolean133 = true;
				Static25.anInt1097 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static58.anInt1941 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static48.anInt1746 = Static3.aClass2_Sub6_Sub1_1.method627();
				Static30.anInt1258 = Static3.aClass2_Sub6_Sub1_1.method665();
				Static8.anInt298 = Static3.aClass2_Sub6_Sub1_1.method665();
				if (Static8.anInt298 >= 100) {
					local171 = Static25.anInt1097 * 128 + 64;
					local175 = Static58.anInt1941 * 128 + 64;
					local181 = Static42.method1057(local171, local175, Static58.anInt1945) - Static48.anInt1746;
					local195 = local171 - Static44.anInt1595;
					local2786 = local175 - Static91.anInt2484;
					local947 = local181 - Static57.anInt2682;
					local1522 = (int) Math.sqrt((double) (local2786 * local2786 + local195 * local195));
					Static72.anInt1289 = (int) (Math.atan2((double) local947, (double) local1522) * 325.949D) & 0x7FF;
					Static18.anInt805 = (int) (-325.949D * Math.atan2((double) local195, (double) local2786)) & 0x7FF;
					if (Static72.anInt1289 < 128) {
						Static72.anInt1289 = 128;
					}
					if (Static72.anInt1289 > 383) {
						Static72.anInt1289 = 383;
					}
				}
				Static76.anInt2256 = -1;
				return true;
			}
			if (Static76.anInt2256 == 7) {
				local171 = Static3.aClass2_Sub6_Sub1_1.method660();
				local175 = Static3.aClass2_Sub6_Sub1_1.method632();
				local181 = Static3.aClass2_Sub6_Sub1_1.method632();
				local546 = Static7.method187(local171);
				if (local181 == 65535) {
					local546.anInt252 = 0;
					Static76.anInt2256 = -1;
					return true;
				}
				@Pc(3317) Class2_Sub1_Sub13 local3317 = Static7.method178(local181);
				local546.anInt249 = local3317.anInt2482 * 100 / local175;
				local546.anInt236 = local3317.anInt2478;
				Static76.anInt2256 = -1;
				local546.anInt252 = 4;
				local546.anInt273 = local3317.anInt2491;
				local546.anInt271 = local181;
				return true;
			}
			Static11.method358("T1 - " + Static76.anInt2256 + "," + Static98.anInt1186 + "," + Static2.anInt105 + " - " + Static87.anInt2339);
			Static69.method1377();
		} catch (@Pc(3368) IOException local3368) {
			Static101.method1731();
		} catch (@Pc(3372) Exception local3372) {
			@Pc(3412) String local3412 = "T2 - " + Static76.anInt2256 + "," + Static98.anInt1186 + "," + Static2.anInt105 + " - " + Static87.anInt2339 + "," + (Static25.anInt1103 + Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0]) + "," + (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0] + Static47.anInt1730) + " - ";
			for (local175 = 0; Static87.anInt2339 > local175 && local175 < 50; local175++) {
				local3412 = local3412 + Static3.aClass2_Sub6_Sub1_1.aByteArray11[local175] + ",";
			}
			Static57.method1692(local3412, local3372);
			Static69.method1377();
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method1355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class36 local11 = Static78.aClass36ArrayArrayArray1[Static58.anInt1945][arg1][arg0];
		if (local11 == null) {
			Static99.aClass64_1.method1804(Static58.anInt1945, arg1, arg0);
			return;
		}
		@Pc(24) Class2_Sub1_Sub4_Sub4 local24 = (Class2_Sub1_Sub4_Sub4) local11.method1365();
		@Pc(26) int local26 = -99999999;
		@Pc(28) Class2_Sub1_Sub4_Sub4 local28 = null;
		while (local24 != null) {
			@Pc(34) Class2_Sub1_Sub13 local34 = Static7.method178(local24.anInt1149);
			@Pc(37) int local37 = local34.anInt2462;
			if (local34.aBoolean128) {
				local37 *= local24.anInt1154 + 1;
			}
			if (local37 > local26) {
				local28 = local24;
				local26 = local37;
			}
			local24 = (Class2_Sub1_Sub4_Sub4) local11.method1361();
		}
		@Pc(71) Class2_Sub1_Sub4_Sub4 local71 = null;
		@Pc(73) Class2_Sub1_Sub4_Sub4 local73 = null;
		@Pc(81) int local81 = (arg0 << 7) + arg1 + 1610612736;
		local11.method1363(local28);
		for (local24 = (Class2_Sub1_Sub4_Sub4) local11.method1365(); local24 != null; local24 = (Class2_Sub1_Sub4_Sub4) local11.method1361()) {
			if (local28.anInt1149 != local24.anInt1149 && local71 == null) {
				local71 = local24;
			}
			if (local28.anInt1149 != local24.anInt1149 && local24.anInt1149 != local71.anInt1149 && local73 == null) {
				local73 = local24;
			}
		}
		Static99.aClass64_1.method1769(Static58.anInt1945, arg1, arg0, Static42.method1057(arg1 * 128 + 64, arg0 * 128 - -64, Static58.anInt1945), local28, local81, local71, local73);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1359() {
		aClass17_81 = null;
		anIntArray301 = null;
		aClass31_765 = null;
		aClass9_18 = null;
		aClass31_764 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
	public static boolean method1360() {
		@Pc(5) Class12 local5 = Static13.aClass12_1;
		synchronized (Static13.aClass12_1) {
			if (Static66.anInt2173 == Static38.anInt1429) {
				return false;
			} else {
				Static58.anInt1935 = Static16.anIntArray94[Static38.anInt1429];
				Static8.anInt291 = Static79.anIntArray324[Static38.anInt1429];
				Static38.anInt1429 = Static38.anInt1429 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	public static void method1364(@OriginalArg(0) int arg0) {
		Static41.anInt1579 += arg0;
		while (Static41.anInt1579 >= Static27.anInt1162) {
			Static41.anInt1579 -= Static27.anInt1162;
			Static21.anInt996 -= Static21.anInt996 >> 2;
		}
		Static21.anInt996 -= arg0 * 1000;
		if (Static21.anInt996 < 0) {
			Static21.anInt996 = 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public static void method1368() {
		Static18.method533(Static16.anInt773);
		if (Static41.anInt1577 != -1) {
			Static18.method533(Static41.anInt1577);
		}
		Static56.anInt1911 = 0;
		Static11.aClass9_6.method861();
		Static103.anIntArray390 = Static97.method1653(Static103.anIntArray390);
		Static81.method1647();
		Static4.method91(0, 0, -1, 765, 0, Static16.anInt773, 503, 0);
		if (Static41.anInt1577 != -1) {
			Static4.method91(0, 0, -1, 765, 0, Static41.anInt1577, 503, 0);
		}
		if (Static105.aBoolean154) {
			Static17.method530();
		} else {
			Static48.method1113();
			Static95.method1599();
		}
		Static11.aClass9_6.method863(Static18.aGraphics1, 0, 0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!bb;)Z")
	public static boolean method1369(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt278;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 >= 101) {
				local8 -= 101;
			} else {
				local8--;
			}
			Static17.method523(0, Static37.method974(new Class31[] { Static23.aClass31_325, Static51.aClass31Array7[local8] }), 6, 0, 0);
			Static17.method523(0, Static37.method974(new Class31[] { Static19.aClass31_285, Static51.aClass31Array7[local8] }), 54, 0, 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static17.method523(0, Static37.method974(new Class31[] { Static23.aClass31_325, arg0.aClass31_94 }), 4, 0, 0);
			return true;
		} else {
			return false;
		}
	}
}
