import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "[I")
	public static int[] anIntArray138;

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "I")
	public static int anInt1150;

	@OriginalMember(owner = "client!ff", name = "ub", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Z")
	public static volatile boolean aBoolean35 = true;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "Lclient!qf;")
	private static Class60 aClass60_442 = Static59.method1195("Loading game screen )2 ");

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "[I")
	public static int[] anIntArray137 = new int[25];

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_443 = Static59.method1195("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_446 = Static59.method1195("You have only just left another world)3");

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_444 = aClass60_446;

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_445 = aClass60_442;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "Lclient!eb;")
	public static Class17 aClass17_17 = new Class17(30);

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
	public static int anInt1149 = 0;

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_447 = Static59.method1195("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!ff", name = "tb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_448 = Static59.method1195("red:");

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_449 = aClass60_448;

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_450 = aClass60_448;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!mf;I)I")
	public static int method751(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(14) Class3_Sub4 local14 = (Class3_Sub4) Static82.aClass82_9.method2305(((long) arg0.anInt2286 << 32) + ((long) arg0.anInt2283));
		return local14 == null ? arg0.anInt2274 : local14.anInt399;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	public static void method752() {
		aClass60_450 = null;
		aClass60_443 = null;
		aClass60_449 = null;
		aClass60_444 = null;
		aClass60_445 = null;
		aClass60_447 = null;
		aClass17_17 = null;
		aClass60_446 = null;
		anIntArray139 = null;
		anIntArray138 = null;
		anIntArray137 = null;
		aClass60_442 = null;
		aClass60_448 = null;
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)Z")
	public static boolean method753() {
		if (Static104.aClass47_3 == null) {
			return false;
		}
		@Pc(151) int local151;
		try {
			@Pc(13) int local13 = Static104.aClass47_3.method1557();
			if (local13 == 0) {
				return false;
			}
			if (Static21.anInt867 == -1) {
				Static104.aClass47_3.method1555(1, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
				local13--;
				Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
				Static21.anInt867 = Static79.aClass3_Sub12_Sub1_1.method1981();
				Static58.anInt1794 = Static29.anIntArray125[Static21.anInt867];
			}
			if (Static58.anInt1794 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static104.aClass47_3.method1555(1, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
				local13--;
				Static58.anInt1794 = Static79.aClass3_Sub12_Sub1_1.aByteArray77[0] & 0xFF;
			}
			if (Static58.anInt1794 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static104.aClass47_3.method1555(2, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
				Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
				local13 -= 2;
				Static58.anInt1794 = Static79.aClass3_Sub12_Sub1_1.method1963();
			}
			if (Static58.anInt1794 > local13) {
				return false;
			}
			Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
			Static104.aClass47_3.method1555(Static58.anInt1794, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
			Static31.anInt1105 = 0;
			Static115.anInt3204 = Static13.anInt404;
			Static13.anInt404 = Static67.anInt2121;
			Static67.anInt2121 = Static21.anInt867;
			@Pc(126) int local126;
			if (Static21.anInt867 == 251) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1963();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static29.method663(local126);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 117) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1923();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1940();
				if (local151 == 65535) {
					local151 = -1;
				}
				Static125.method2257(local126, local151);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(179) Class3_Sub15 local179;
			if (Static21.anInt867 == 155) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1964();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1933();
				local179 = Static86.method1067(local151);
				Static21.anInt867 = -1;
				if (local179.anInt2252 != local126 || local126 == -1) {
					local179.anInt2277 = 0;
					local179.anInt2252 = local126;
					local179.anInt2263 = 0;
				}
				return true;
			}
			if (Static21.anInt867 == 50) {
				Static101.method1988(Static35.aClass74_1, Static79.aClass3_Sub12_Sub1_1, Static58.anInt1794);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(225) Class3_Sub15 local225;
			if (Static21.anInt867 == 21) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1920();
				local225 = Static86.method1067(local126);
				local225.anInt2267 = 3;
				local225.anInt2279 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass50_1.method1642();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 136) {
				Static51.anInt1340 = Static79.aClass3_Sub12_Sub1_1.method1917();
				Static21.anInt867 = -1;
				Static118.aBoolean115 = true;
				Static45.aBoolean46 = true;
				return true;
			}
			if (Static21.anInt867 == 118) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1964();
				if (Static129.anInt3460 != local126) {
					Static119.method2149(Static129.anInt3460);
					Static129.anInt3460 = local126;
				}
				Static71.aBoolean49 = true;
				method756(Static129.anInt3460);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 179) {
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
				}
				Static21.anInt867 = -1;
				Static103.anInt2994 = 1;
				Static120.aClass60_1374 = Static120.aClass60_1369;
				Static71.aBoolean49 = true;
				Static56.aBoolean56 = false;
				return true;
			}
			if (Static21.anInt867 == 102) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1953();
				if (local126 == 65535) {
					local126 = -1;
				}
				local151 = Static79.aClass3_Sub12_Sub1_1.method1917();
				if (local126 == Static22.anIntArray87[local151]) {
					Static29.method667(Static22.anIntArray87[local151]);
				} else {
					Static119.method2149(Static22.anIntArray87[local151]);
					Static22.anIntArray87[local151] = local126;
				}
				Static45.aBoolean46 = true;
				Static118.aBoolean115 = true;
				method756(Static22.anIntArray87[local151]);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 197) {
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
				}
				Static103.anInt2994 = 2;
				Static56.aBoolean56 = false;
				Static120.aClass60_1374 = Static120.aClass60_1369;
				Static71.aBoolean49 = true;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 192) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1940();
				Static109.method2053(local126);
				if (Static119.anInt3242 != -1) {
					Static119.method2149(Static119.anInt3242);
					Static45.aBoolean46 = true;
					Static118.aBoolean115 = true;
					Static119.anInt3242 = -1;
				}
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static71.aBoolean49 = true;
					Static78.anInt2429 = -1;
				}
				if (Static114.anInt3185 != -1) {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = -1;
					Static50.method1075(30);
				}
				if (Static57.anInt3397 != -1) {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = -1;
				}
				if (Static79.anInt2467 == local126) {
					Static29.method667(Static79.anInt2467);
				} else {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = local126;
				}
				Static96.anInt2745 = -1;
				if (Static103.anInt2994 != 0) {
					Static71.aBoolean49 = true;
					Static103.anInt2994 = 0;
				}
				method756(Static79.anInt2467);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(482) long local482;
			if (Static21.anInt867 == 170) {
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				@Pc(489) Class60 local489 = Static37.method834(Static16.method484(Static79.aClass3_Sub12_Sub1_1).method1862());
				Static76.method1565(6, local489, Static97.method1821(local482).method1866());
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 201) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1969();
				if (local126 >= 0) {
					Static109.method2053(local126);
				}
				if (local126 != Static46.anInt1446) {
					Static119.method2149(Static46.anInt1446);
					Static46.anInt1446 = local126;
				}
				method756(Static46.anInt1446);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(556) int local556;
			@Pc(547) long local547;
			@Pc(562) long local562;
			if (Static21.anInt867 == 67) {
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				local547 = Static79.aClass3_Sub12_Sub1_1.method1963();
				@Pc(552) long local552 = (long) Static79.aClass3_Sub12_Sub1_1.method1923();
				local556 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local562 = local552 + (local547 << 32);
				@Pc(564) boolean local564 = false;
				for (@Pc(566) int local566 = 0; local566 < 100; local566++) {
					if (Static34.aLongArray1[local566] == local562) {
						local564 = true;
						break;
					}
				}
				if (local556 <= 1) {
					for (@Pc(595) int local595 = 0; local595 < Static107.anInt3035; local595++) {
						if (Static113.aLongArray5[local595] == local482) {
							local564 = true;
							break;
						}
					}
				}
				if (!local564 && Static127.anInt2664 == 0) {
					Static34.aLongArray1[Static49.anInt1598] = local562;
					Static49.anInt1598 = (Static49.anInt1598 + 1) % 100;
					@Pc(636) Class60 local636 = Static37.method834(Static16.method484(Static79.aClass3_Sub12_Sub1_1).method1862());
					if (local556 == 2 || local556 == 3) {
						Static76.method1565(7, local636, Static60.method1211(new Class60[] { Static103.aClass60_1258, Static97.method1821(local482).method1866() }));
					} else if (local556 == 1) {
						Static76.method1565(7, local636, Static60.method1211(new Class60[] { Static43.aClass60_624, Static97.method1821(local482).method1866() }));
					} else {
						Static76.method1565(3, local636, Static97.method1821(local482).method1866());
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 70) {
				Static51.anInt1366 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static118.aBoolean115 = true;
				Static21.anInt867 = -1;
				Static80.anInt2518 += 32;
				return true;
			}
			if (Static21.anInt867 == 35) {
				Static107.anInt3035 = Static58.anInt1794 / 8;
				for (local126 = 0; local126 < Static107.anInt3035; local126++) {
					Static113.aLongArray5[local126] = Static79.aClass3_Sub12_Sub1_1.method1952();
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 226) {
				Static102.anInt2967 = Static79.aClass3_Sub12_Sub1_1.method1925();
				Static14.anInt430 = Static79.aClass3_Sub12_Sub1_1.method1936();
				for (local126 = Static14.anInt430; local126 < Static14.anInt430 + 8; local126++) {
					for (local151 = Static102.anInt2967; local151 < Static102.anInt2967 + 8; local151++) {
						if (Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local126][local151] != null) {
							Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local126][local151] = null;
							Static54.method1139(local151, local126);
						}
					}
				}
				for (@Pc(818) Class3_Sub7 local818 = (Class3_Sub7) Static80.aClass5_18.method92(); local818 != null; local818 = (Class3_Sub7) Static80.aClass5_18.method90()) {
					if (Static14.anInt430 <= local818.anInt797 && Static14.anInt430 + 8 > local818.anInt797 && local818.anInt792 >= Static102.anInt2967 && Static102.anInt2967 + 8 > local818.anInt792 && local818.anInt795 == Static119.anInt3243) {
						local818.anInt799 = 0;
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 27) {
				Static104.method2020(true);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 255) {
				Static11.anInt345 = Static79.aClass3_Sub12_Sub1_1.method1955() * 30;
				Static78.anInt2431 = Static34.anInt1183;
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(928) int local928;
			@Pc(914) int local914;
			if (Static21.anInt867 == 181) {
				Static118.aBoolean115 = true;
				local126 = Static79.aClass3_Sub12_Sub1_1.method1962();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1938();
				Static3.anIntArray23[local151] = local914;
				Static68.anIntArray218[local151] = local126;
				anIntArray137[local151] = 1;
				for (local928 = 0; local928 < 98; local928++) {
					if (local914 >= Class3_Sub1_Sub1_Sub2.anIntArray25[local928]) {
						anIntArray137[local151] = local928 + 2;
					}
				}
				Static85.anIntArray271[Static113.anInt3158++ & 0x1F] = local151;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 247) {
				Static62.aBoolean66 = true;
				Static26.anInt980 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static95.anInt2716 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static42.anInt1407 = Static79.aClass3_Sub12_Sub1_1.method1963();
				Static53.anInt1747 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static114.anInt3196 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (Static114.anInt3196 >= 100) {
					Static71.anInt1493 = Static26.anInt980 * 128 + 64;
					Static98.anInt2824 = Static95.anInt2716 * 128 + 64;
					Static115.anInt3199 = Static66.method1353(Static71.anInt1493, Static119.anInt3243, Static98.anInt2824) - Static42.anInt1407;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 203) {
				Static3.anInt124 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 177) {
				Static120.aClass60_1375 = Static79.aClass3_Sub12_Sub1_1.method1943();
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
				}
				Static56.aBoolean56 = false;
				Static103.anInt2994 = 4;
				Static71.aBoolean49 = true;
				Static120.aClass60_1374 = Static120.aClass60_1369;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 200) {
				Static27.anInt997 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static57.anInt3392 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static61.anInt1942 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static85.aBoolean91 = true;
				Static71.aBoolean49 = true;
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1116) int local1116;
			@Pc(1126) long local1126;
			if (Static21.anInt867 == 24) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1950();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1955();
				if (local151 == 65535) {
					local151 = -1;
				}
				local914 = Static79.aClass3_Sub12_Sub1_1.method1950();
				local928 = Static79.aClass3_Sub12_Sub1_1.method1963();
				if (local928 == 65535) {
					local928 = -1;
				}
				for (local1116 = local928; local1116 <= local151; local1116++) {
					local1126 = (long) local1116 + ((long) local126 << 32);
					@Pc(1131) Class3 local1131 = Static82.aClass82_9.method2305(local1126);
					if (local1131 != null) {
						local1131.method2264();
					}
					Static82.aClass82_9.method2303(new Class3_Sub4(local914), local1126);
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 154) {
				for (local126 = 0; local126 < Static48.anInt1549; local126++) {
					@Pc(1167) Class3_Sub1_Sub13 local1167 = Static97.method1824(local126);
					if (local1167 != null && local1167.anInt2406 == 0) {
						Static70.anIntArray223[local126] = 0;
						Static18.anIntArray80[local126] = 0;
					}
				}
				Static118.aBoolean115 = true;
				Static80.anInt2518 += 32;
				if (Static129.anInt3460 != -1) {
					Static71.aBoolean49 = true;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 174) {
				Static79.aClass3_Sub12_Sub1_1.method1950();
				Static79.aClass3_Sub12_Sub1_1.method1936();
				Static79.aClass3_Sub12_Sub1_1.method1940();
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1230) Class60 local1230;
			if (Static21.anInt867 == 22) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1933();
				local1230 = Static79.aClass3_Sub12_Sub1_1.method1943();
				local179 = Static86.method1067(local126);
				local179.aClass60_969 = local1230;
				if (local126 >> 16 == Static22.anIntArray87[Static51.anInt1340]) {
					Static118.aBoolean115 = true;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 238) {
				Static64.anInt2045 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1291) Class3_Sub15 local1291;
			if (Static21.anInt867 == 225) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1938();
				if (local126 == 65535) {
					local126 = -1;
				}
				local914 = Static79.aClass3_Sub12_Sub1_1.method1938();
				local1291 = Static86.method1067(local151);
				@Pc(1309) Class3_Sub1_Sub11 local1309;
				if (local1291.aBoolean81) {
					local1291.anInt2254 = local126;
					local1291.anInt2253 = local914;
					local1309 = Static22.method568(local126);
					local1291.anInt2302 = local1309.anInt1868;
					local1291.anInt2300 = local1309.anInt1851;
					if (local1291.anInt2304 > 0) {
						local1291.anInt2300 = local1291.anInt2300 * 32 / local1291.anInt2304;
					}
					local1291.anInt2259 = local1309.anInt1862;
					local1291.anInt2295 = local1309.anInt1841;
					local1291.anInt2301 = local1309.anInt1877;
					local1291.anInt2255 = local1309.anInt1869;
					Static41.method941(local1291);
				} else if (local126 == -1) {
					Static21.anInt867 = -1;
					local1291.anInt2267 = 0;
					return true;
				} else {
					local1309 = Static22.method568(local126);
					local1291.anInt2259 = local1309.anInt1862;
					local1291.anInt2300 = local1309.anInt1851 * 100 / local914;
					local1291.anInt2302 = local1309.anInt1868;
					local1291.anInt2279 = local126;
					local1291.anInt2267 = 4;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 172) {
				for (local126 = 0; local126 < Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3.length; local126++) {
					if (Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local126] != null) {
						Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local126].anInt1538 = -1;
					}
				}
				for (local151 = 0; local151 < Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1.length; local151++) {
					if (Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local151] != null) {
						Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local151].anInt1538 = -1;
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 208) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1950();
				Static64.aClass7_5 = Static35.aClass74_1.method2128(local126);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1515) int local1515;
			if (Static21.anInt867 == 206) {
				Static62.aBoolean66 = true;
				Static53.anInt1737 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static112.anInt3117 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static29.anInt1008 = Static79.aClass3_Sub12_Sub1_1.method1963();
				Static64.anInt2046 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static22.anInt877 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (Static22.anInt877 >= 100) {
					local126 = Static53.anInt1737 * 128 + 64;
					local151 = Static112.anInt3117 * 128 + 64;
					local914 = Static66.method1353(local126, Static119.anInt3243, local151) - Static29.anInt1008;
					local928 = local126 - Static71.anInt1493;
					local1116 = local914 - Static115.anInt3199;
					local1515 = local151 - Static98.anInt2824;
					local556 = (int) Math.sqrt((double) (local1515 * local1515 + local928 * local928));
					Static63.anInt2908 = (int) (Math.atan2((double) local1116, (double) local556) * 325.949D) & 0x7FF;
					Static22.anInt871 = (int) (-325.949D * Math.atan2((double) local928, (double) local1515)) & 0x7FF;
					if (Static63.anInt2908 < 128) {
						Static63.anInt2908 = 128;
					}
					if (Static63.anInt2908 > 383) {
						Static63.anInt2908 = 383;
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 106) {
				Static68.anInt2142 = Static79.aClass3_Sub12_Sub1_1.method1953();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 17) {
				Static21.anInt867 = -1;
				Static77.anInt2428 = 0;
				return true;
			}
			if (Static21.anInt867 == 71) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1953();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1920();
				Static70.anIntArray223[local126] = local151;
				if (local151 != Static18.anIntArray80[local126]) {
					Static18.anIntArray80[local126] = local151;
					Static64.method1335(local126);
					Static118.aBoolean115 = true;
					if (Static129.anInt3460 != -1) {
						Static71.aBoolean49 = true;
					}
				}
				Static31.anIntArray131[Static80.anInt2518++ & 0x1F] = local126;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 254) {
				Static10.method312();
				Static21.anInt867 = -1;
				return false;
			}
			if (Static21.anInt867 == 188) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1940();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1920();
				local179 = Static86.method1067(local151);
				Static21.anInt867 = -1;
				local179.anInt2279 = local126;
				local179.anInt2267 = 2;
				return true;
			}
			if (Static21.anInt867 == 8) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1953();
				Static22.method566(local126);
				Static10.anIntArray49[Static75.anInt2407++ & 0x1F] = local126 & 0x7FFF;
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1710) Class60 local1710;
			if (Static21.anInt867 == 193) {
				local1710 = Static79.aClass3_Sub12_Sub1_1.method1943();
				@Pc(1717) Object[] local1717 = new Object[local1710.method1836() + 1];
				for (local914 = local1710.method1836() - 1; local914 >= 0; local914--) {
					if (local1710.method1832(local914) == 115) {
						local1717[local914 + 1] = Static79.aClass3_Sub12_Sub1_1.method1943();
					} else {
						local1717[local914 + 1] = Integer.valueOf(Static79.aClass3_Sub12_Sub1_1.method1920());
					}
				}
				local1717[0] = Integer.valueOf(Static79.aClass3_Sub12_Sub1_1.method1920());
				Static12.method335(local1717, null, 0, 0, null, 0);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 7) {
				for (local126 = 0; local126 < Static18.anIntArray80.length; local126++) {
					if (Static18.anIntArray80[local126] != Static70.anIntArray223[local126]) {
						Static18.anIntArray80[local126] = Static70.anIntArray223[local126];
						Static64.method1335(local126);
						Static118.aBoolean115 = true;
						Static31.anIntArray131[Static80.anInt2518++ & 0x1F] = local126;
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(1922) int local1922;
			@Pc(1929) int local1929;
			if (Static21.anInt867 == 162) {
				Static80.anInt2518 += 32;
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				if (local482 == 0L) {
					Static78.aClass3_Sub10Array1 = null;
					Static21.anInt867 = -1;
					Static50.anInt1624 = 0;
					Static80.aClass60_1065 = null;
					return true;
				}
				Static80.aClass60_1065 = Static97.method1821(local482);
				local914 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (local914 == 255) {
					Static21.anInt867 = -1;
					return true;
				}
				@Pc(1874) Class3_Sub10[] local1874 = new Class3_Sub10[100];
				Static50.anInt1624 = local914;
				for (local1116 = 0; local1116 < Static50.anInt1624; local1116++) {
					local1874[local1116] = new Class3_Sub10();
					local1874[local1116].aLong107 = Static79.aClass3_Sub12_Sub1_1.method1952();
					local1874[local1116].aClass60_475 = Static97.method1821(local1874[local1116].aLong107);
					local1874[local1116].anInt1214 = Static79.aClass3_Sub12_Sub1_1.method1963();
				}
				local1922 = Static50.anInt1624;
				while (local1922 > 0) {
					@Pc(1926) boolean local1926 = true;
					local1922--;
					for (local1929 = 0; local1929 < local1922; local1929++) {
						if (local1874[local1929].aClass60_475.method1844(local1874[local1929 + 1].aClass60_475) > 0) {
							@Pc(1951) Class3_Sub10 local1951 = local1874[local1929];
							local1926 = false;
							local1874[local1929] = local1874[local1929 + 1];
							local1874[local1929 + 1] = local1951;
						}
					}
					if (local1926) {
						break;
					}
				}
				Static21.anInt867 = -1;
				Static78.aClass3_Sub10Array1 = local1874;
				return true;
			}
			if (Static21.anInt867 == 189) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1953();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1920();
				local179 = Static86.method1067(local151);
				Static21.anInt867 = -1;
				if (local179 != null && local179.anInt2296 == 0) {
					if (local179.anInt2284 - local179.anInt2270 < local126) {
						local126 = local179.anInt2284 - local179.anInt2270;
					}
					if (local126 < 0) {
						local126 = 0;
					}
					local179.anInt2241 = local126;
				}
				return true;
			}
			if (Static21.anInt867 == 49) {
				Static104.method2020(false);
				Static21.anInt867 = -1;
				return true;
			}
			@Pc(2074) int local2074;
			@Pc(2084) int local2084;
			if (Static21.anInt867 == 81) {
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				@Pc(2056) byte local2056 = Static79.aClass3_Sub12_Sub1_1.method1958();
				@Pc(2060) long local2060 = Static79.aClass3_Sub12_Sub1_1.method1952();
				local1126 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local562 = Static79.aClass3_Sub12_Sub1_1.method1923();
				local2074 = Static79.aClass3_Sub12_Sub1_1.method1936();
				@Pc(2080) long local2080 = local562 + (local1126 << 32);
				@Pc(2082) boolean local2082 = false;
				for (local2084 = 0; local2084 < 100; local2084++) {
					if (Static34.aLongArray1[local2084] == local2080) {
						local2082 = true;
						break;
					}
				}
				if (local2074 <= 1) {
					for (@Pc(2107) int local2107 = 0; local2107 < Static107.anInt3035; local2107++) {
						if (Static113.aLongArray5[local2107] == local482) {
							local2082 = true;
							break;
						}
					}
				}
				if (!local2082 && Static127.anInt2664 == 0) {
					Static34.aLongArray1[Static49.anInt1598] = local2080;
					Static49.anInt1598 = (Static49.anInt1598 + 1) % 100;
					@Pc(2148) Class60 local2148 = Static37.method834(Static16.method484(Static79.aClass3_Sub12_Sub1_1).method1862());
					@Pc(2177) Class60 local2177 = Static60.method1211(new Class60[] { Static17.aClass60_278, Static97.method1821(local2060), Static89.aClass60_1144, Static65.method1341(local2056), Static84.aClass60_1116 });
					if (local2074 == 2 || local2074 == 3) {
						Static76.method1565(7, local2148, Static60.method1211(new Class60[] { local2177, Static103.aClass60_1258, Static97.method1821(local482).method1866() }));
					} else if (local2074 == 1) {
						Static76.method1565(7, local2148, Static60.method1211(new Class60[] { local2177, Static43.aClass60_624, Static97.method1821(local482).method1866() }));
					} else {
						Static76.method1565(3, local2148, Static60.method1211(new Class60[] { local2177, Static97.method1821(local482).method1866() }));
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 94) {
				if (Static51.anInt1340 == 12) {
					Static118.aBoolean115 = true;
				}
				Static17.anInt764 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static78.anInt2431 = Static34.anInt1183;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 32) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1962();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1962();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1925();
				Static119.anInt3243 = local126 >> 1;
				Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1015((local126 & 0x1) == 1, local151, local914);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 60) {
				Static111.anInt3098 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (Static111.anInt3098 == 1) {
					Static100.anInt2954 = Static79.aClass3_Sub12_Sub1_1.method1963();
				}
				if (Static111.anInt3098 >= 2 && Static111.anInt3098 <= 6) {
					if (Static111.anInt3098 == 2) {
						Static14.anInt434 = 64;
						Static4.anInt130 = 64;
					}
					if (Static111.anInt3098 == 3) {
						Static14.anInt434 = 64;
						Static4.anInt130 = 0;
					}
					if (Static111.anInt3098 == 4) {
						Static4.anInt130 = 128;
						Static14.anInt434 = 64;
					}
					if (Static111.anInt3098 == 5) {
						Static4.anInt130 = 64;
						Static14.anInt434 = 0;
					}
					if (Static111.anInt3098 == 6) {
						Static4.anInt130 = 64;
						Static14.anInt434 = 128;
					}
					Static111.anInt3098 = 2;
					Static109.anInt3095 = Static79.aClass3_Sub12_Sub1_1.method1963();
					Static120.anInt3296 = Static79.aClass3_Sub12_Sub1_1.method1963();
					Static6.anInt194 = Static79.aClass3_Sub12_Sub1_1.method1936();
				}
				if (Static111.anInt3098 == 10) {
					Static124.anInt3223 = Static79.aClass3_Sub12_Sub1_1.method1963();
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 252) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1969();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1964();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1950();
				local1291 = Static86.method1067(local914);
				local1291.anInt2291 = local126 + local1291.anInt2239;
				Static21.anInt867 = -1;
				local1291.anInt2243 = local1291.anInt2282 + local151;
				return true;
			}
			if (Static21.anInt867 == 244) {
				@Pc(2451) byte local2451 = Static79.aClass3_Sub12_Sub1_1.method1954();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1940();
				Static70.anIntArray223[local151] = local2451;
				if (local2451 != Static18.anIntArray80[local151]) {
					Static18.anIntArray80[local151] = local2451;
					Static64.method1335(local151);
					Static118.aBoolean115 = true;
					if (Static129.anInt3460 != -1) {
						Static71.aBoolean49 = true;
					}
				}
				Static31.anIntArray131[Static80.anInt2518++ & 0x1F] = local151;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 148) {
				@Pc(2510) boolean local2510 = Static79.aClass3_Sub12_Sub1_1.method1962() == 1;
				local151 = Static79.aClass3_Sub12_Sub1_1.method1938();
				local179 = Static86.method1067(local151);
				Static21.anInt867 = -1;
				local179.aBoolean84 = local2510;
				return true;
			}
			if (Static21.anInt867 == 141) {
				Static102.anInt2967 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static14.anInt430 = Static79.aClass3_Sub12_Sub1_1.method1925();
				while (Static58.anInt1794 > Static79.aClass3_Sub12_Sub1_1.anInt2886) {
					Static21.anInt867 = Static79.aClass3_Sub12_Sub1_1.method1936();
					Static22.method571();
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 2) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1955();
				Static109.method2053(local126);
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
					Static71.aBoolean49 = true;
				}
				if (Static114.anInt3185 != -1) {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = -1;
					Static50.method1075(30);
				}
				if (Static57.anInt3397 != -1) {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = -1;
				}
				if (Static79.anInt2467 != -1) {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = -1;
				}
				if (local126 == Static119.anInt3242) {
					Static29.method667(Static119.anInt3242);
				} else {
					Static119.method2149(Static119.anInt3242);
					Static119.anInt3242 = local126;
				}
				Static45.aBoolean46 = true;
				Static118.aBoolean115 = true;
				if (Static103.anInt2994 != 0) {
					Static103.anInt2994 = 0;
					Static71.aBoolean49 = true;
				}
				Static96.anInt2745 = -1;
				method756(Static119.anInt3242);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 224) {
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local928 = Static79.aClass3_Sub12_Sub1_1.method1936();
				@Pc(2665) Class60 local2665 = Static97.method1821(local482).method1866();
				for (local1515 = 0; local1515 < Static61.anInt1946; local1515++) {
					if (Static83.aLongArray4[local1515] == local482) {
						if (local914 != Static41.anIntArray159[local1515]) {
							Static41.anIntArray159[local1515] = local914;
							Static118.aBoolean115 = true;
							if (local914 > 0) {
								Static76.method1565(5, Static60.method1211(new Class60[] { local2665, Static76.aClass60_1025 }), Static120.aClass60_1369);
							}
							if (local914 == 0) {
								Static76.method1565(5, Static60.method1211(new Class60[] { local2665, Static72.aClass60_966 }), Static120.aClass60_1369);
							}
						}
						local2665 = null;
						Static26.anIntArray123[local1515] = local928;
						break;
					}
				}
				if (local2665 != null && Static61.anInt1946 < 200) {
					Static83.aLongArray4[Static61.anInt1946] = local482;
					Static54.aClass60Array6[Static61.anInt1946] = local2665;
					Static41.anIntArray159[Static61.anInt1946] = local914;
					Static26.anIntArray123[Static61.anInt1946] = local928;
					Static61.anInt1946++;
					Static118.aBoolean115 = true;
					Static80.anInt2518 += 32;
				}
				local1922 = Static61.anInt1946;
				while (local1922 > 0) {
					@Pc(2778) boolean local2778 = true;
					local1922--;
					for (local1929 = 0; local1929 < local1922; local1929++) {
						if (Static46.anInt1445 != Static41.anIntArray159[local1929] && Static41.anIntArray159[local1929 + 1] == Static46.anInt1445 || Static41.anIntArray159[local1929] == 0 && Static41.anIntArray159[local1929 + 1] != 0) {
							local2778 = false;
							local2074 = Static41.anIntArray159[local1929];
							Static41.anIntArray159[local1929] = Static41.anIntArray159[local1929 + 1];
							Static41.anIntArray159[local1929 + 1] = local2074;
							@Pc(2833) Class60 local2833 = Static54.aClass60Array6[local1929];
							Static54.aClass60Array6[local1929] = Static54.aClass60Array6[local1929 + 1];
							Static54.aClass60Array6[local1929 + 1] = local2833;
							@Pc(2851) long local2851 = Static83.aLongArray4[local1929];
							Static83.aLongArray4[local1929] = Static83.aLongArray4[local1929 + 1];
							Static83.aLongArray4[local1929 + 1] = local2851;
							local2084 = Static26.anIntArray123[local1929];
							Static26.anIntArray123[local1929] = Static26.anIntArray123[local1929 + 1];
							Static26.anIntArray123[local1929 + 1] = local2084;
							Static118.aBoolean115 = true;
						}
					}
					if (local2778) {
						break;
					}
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 125) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1940();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1933();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local1291 = Static86.method1067(local151);
				local1291.anInt2307 = (local914 << 16) + local126;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 151) {
				local1710 = Static79.aClass3_Sub12_Sub1_1.method1943();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1925();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (local914 >= 1 && local914 <= 5) {
					if (local1710.method1860(Static95.aClass60_1172)) {
						local1710 = null;
					}
					Static12.aClass60Array1[local914 - 1] = local1710;
					Static130.aBooleanArray72[local914 - 1] = local151 == 0;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 230) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1963();
				Static85.method1674(local126, local151, local914);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 131) {
				Static79.aClass3_Sub12_Sub1_1.method1920();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 69) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1938();
				local225 = Static86.method1067(local126);
				for (local914 = 0; local914 < local225.anIntArray235.length; local914++) {
					local225.anIntArray235[local914] = -1;
					local225.anIntArray235[local914] = 0;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 159) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1940();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1933();
				local914 = local126 >> 10 & 0x1F;
				local928 = local126 >> 5 & 0x1F;
				local1116 = local126 & 0x1F;
				@Pc(3100) Class3_Sub15 local3100 = Static86.method1067(local151);
				local3100.anInt2272 = (local914 << 19) + (local928 << 11) + (local1116 << 3);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 87 || Static21.anInt867 == 241 || Static21.anInt867 == 227 || Static21.anInt867 == 111 || Static21.anInt867 == 119 || Static21.anInt867 == 39 || Static21.anInt867 == 48 || Static21.anInt867 == 33 || Static21.anInt867 == 209 || Static21.anInt867 == 64 || Static21.anInt867 == 236) {
				Static22.method571();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 19) {
				Static79.aClass3_Sub12_Sub1_1.method1940();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 80) {
				Static32.anInt1115 = Static79.aClass3_Sub12_Sub1_1.method1925();
				Static21.anInt867 = -1;
				if (Static51.anInt1340 == Static32.anInt1115) {
					if (Static32.anInt1115 == 3) {
						Static51.anInt1340 = 1;
					} else {
						Static51.anInt1340 = 3;
					}
					Static118.aBoolean115 = true;
				}
				return true;
			}
			if (Static21.anInt867 == 97) {
				Static102.anInt2967 = Static79.aClass3_Sub12_Sub1_1.method1962();
				Static14.anInt430 = Static79.aClass3_Sub12_Sub1_1.method1917();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 76) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local928 = Static79.aClass3_Sub12_Sub1_1.method1936();
				Static57.aBooleanArray71[local126] = true;
				Static54.anIntArray196[local126] = local151;
				Static124.anIntArray344[local126] = local914;
				Static59.anIntArray204[local126] = local928;
				Static55.anIntArray197[local126] = 0;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 158) {
				local1710 = Static79.aClass3_Sub12_Sub1_1.method1943();
				@Pc(3304) boolean local3304;
				if (local1710.method1848(Static103.aClass60_1261)) {
					local3304 = false;
					local1230 = local1710.method1864(0, local1710.method1847(Static29.aClass60_389));
					local547 = local1230.method1863();
					for (local1515 = 0; local1515 < Static107.anInt3035; local1515++) {
						if (Static113.aLongArray5[local1515] == local547) {
							local3304 = true;
							break;
						}
					}
					if (!local3304 && Static127.anInt2664 == 0) {
						Static76.method1565(4, Static29.aClass60_387, local1230);
					}
				} else if (local1710.method1848(Static117.aClass60_1340)) {
					local1230 = local1710.method1864(0, local1710.method1847(Static29.aClass60_389));
					local547 = local1230.method1863();
					local3304 = false;
					for (local1515 = 0; local1515 < Static107.anInt3035; local1515++) {
						if (local547 == Static113.aLongArray5[local1515]) {
							local3304 = true;
							break;
						}
					}
					if (!local3304 && Static127.anInt2664 == 0) {
						Static76.method1565(8, Static85.aClass60_1130, local1230);
					}
				} else if (local1710.method1848(Static75.aClass60_1020)) {
					local1230 = local1710.method1864(0, local1710.method1847(Static29.aClass60_389));
					local3304 = false;
					local547 = local1230.method1863();
					for (local1515 = 0; local1515 < Static107.anInt3035; local1515++) {
						if (Static113.aLongArray5[local1515] == local547) {
							local3304 = true;
							break;
						}
					}
					if (!local3304 && Static127.anInt2664 == 0) {
						@Pc(3345) Class60 local3345 = local1710.method1864(local1710.method1847(Static29.aClass60_389) + 1, local1710.method1836() + -9);
						Static76.method1565(8, local3345, local1230);
					}
				} else {
					Static76.method1565(0, local1710, Static120.aClass60_1369);
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 250) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1950();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local914 = Static79.aClass3_Sub12_Sub1_1.method1953();
				local928 = Static79.aClass3_Sub12_Sub1_1.method1953();
				@Pc(3471) Class3_Sub15 local3471 = Static86.method1067(local126);
				local3471.anInt2259 = local928;
				local3471.anInt2302 = local151;
				Static21.anInt867 = -1;
				local3471.anInt2300 = local914;
				return true;
			}
			if (Static21.anInt867 == 79) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1955();
				Static109.method2053(local126);
				if (Static119.anInt3242 != -1) {
					Static119.method2149(Static119.anInt3242);
					Static45.aBoolean46 = true;
					Static119.anInt3242 = -1;
					Static118.aBoolean115 = true;
				}
				if (Static114.anInt3185 != -1) {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = -1;
					Static50.method1075(30);
				}
				if (Static57.anInt3397 != -1) {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = -1;
				}
				if (Static79.anInt2467 != -1) {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = -1;
				}
				if (local126 == Static78.anInt2429) {
					Static29.method667(Static78.anInt2429);
				} else {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = local126;
				}
				Static96.anInt2745 = -1;
				method756(Static78.anInt2429);
				Static71.aBoolean49 = true;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 42) {
				Static93.method1730();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 62) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1938();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local179 = Static86.method1067(local126);
				local179.anInt2279 = local151;
				Static21.anInt867 = -1;
				local179.anInt2267 = 1;
				return true;
			}
			if (Static21.anInt867 == 129) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1955();
				Static109.method2053(local151);
				if (local126 != -1) {
					Static109.method2053(local126);
				}
				if (Static79.anInt2467 != -1) {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = -1;
				}
				if (Static119.anInt3242 != -1) {
					Static119.method2149(Static119.anInt3242);
					Static119.anInt3242 = -1;
				}
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
				}
				if (Static114.anInt3185 == local151) {
					Static29.method667(Static114.anInt3185);
				} else {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = local151;
					Static50.method1075(35);
				}
				if (Static57.anInt3397 == local151) {
					Static29.method667(Static57.anInt3397);
				} else {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = local126;
				}
				Static96.anInt2745 = -1;
				Static103.anInt2994 = 0;
				method756(Static114.anInt3185);
				method756(Static57.anInt3397);
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 38) {
				Static118.aBoolean115 = true;
				local126 = Static79.aClass3_Sub12_Sub1_1.method1920();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1963();
				if (local126 >= 0) {
					local179 = Static86.method1067(local126);
				} else {
					local179 = null;
				}
				if (local126 < -70000) {
					local151 += 32768;
				}
				while (Static58.anInt1794 > Static79.aClass3_Sub12_Sub1_1.anInt2886) {
					local928 = Static79.aClass3_Sub12_Sub1_1.method1948();
					local1515 = 0;
					local1116 = Static79.aClass3_Sub12_Sub1_1.method1963();
					if (local1116 != 0) {
						local1515 = Static79.aClass3_Sub12_Sub1_1.method1936();
						if (local1515 == 255) {
							local1515 = Static79.aClass3_Sub12_Sub1_1.method1920();
						}
					}
					if (local179 != null && local928 >= 0 && local179.anIntArray235.length > local928) {
						local179.anIntArray235[local928] = local1116;
						local179.anIntArray230[local928] = local1515;
					}
					Static10.method308(local928, local151, local1116 - 1, local1515);
				}
				Static10.anIntArray49[Static75.anInt2407++ & 0x1F] = local151 & 0x7FFF;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 202) {
				Static62.aBoolean66 = false;
				for (local126 = 0; local126 < 5; local126++) {
					Static57.aBooleanArray71[local126] = false;
				}
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 93) {
				if (Static119.anInt3242 != -1) {
					Static119.method2149(Static119.anInt3242);
					Static118.aBoolean115 = true;
					Static119.anInt3242 = -1;
					Static45.aBoolean46 = true;
				}
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
					Static71.aBoolean49 = true;
				}
				if (Static114.anInt3185 != -1) {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = -1;
					Static50.method1075(30);
				}
				if (Static57.anInt3397 != -1) {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = -1;
				}
				if (Static79.anInt2467 != -1) {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = -1;
				}
				if (Static103.anInt2994 != 0) {
					Static71.aBoolean49 = true;
					Static103.anInt2994 = 0;
				}
				Static96.anInt2745 = -1;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 163) {
				local482 = Static79.aClass3_Sub12_Sub1_1.method1952();
				@Pc(3905) boolean local3905 = false;
				if ((local482 & Long.MIN_VALUE) != 0L) {
					local3905 = true;
				}
				local914 = Static79.aClass3_Sub12_Sub1_1.method1963();
				Static79.aClass3_Sub12_Sub1_1.method1958();
				if (local3905) {
					if (Static50.anInt1624 == 0) {
						Static21.anInt867 = -1;
						return true;
					}
					local482 &= Long.MAX_VALUE;
					for (local1116 = 0; local1116 < Static50.anInt1624 && (local482 != Static78.aClass3_Sub10Array1[local1116].aLong107 || local914 != Static78.aClass3_Sub10Array1[local1116].anInt1214); local1116++) {
					}
					if (local1116 < Static50.anInt1624) {
						while (Static50.anInt1624 - 1 > local1116) {
							Static78.aClass3_Sub10Array1[local1116] = Static78.aClass3_Sub10Array1[local1116 + 1];
							local1116++;
						}
						Static78.aClass3_Sub10Array1[Static50.anInt1624] = null;
						Static50.anInt1624--;
					}
				} else if (Static50.anInt1624 < 100) {
					@Pc(3934) Class3_Sub10 local3934 = new Class3_Sub10();
					local3934.aLong107 = local482;
					local3934.aClass60_475 = Static97.method1821(local3934.aLong107);
					local3934.anInt1214 = local914;
					for (local1515 = Static50.anInt1624 - 1; local1515 >= 0; local1515--) {
						local556 = Static78.aClass3_Sub10Array1[local1515].aClass60_475.method1844(local3934.aClass60_475);
						System.out.println("co=" + local556);
						if (local556 == 0) {
							Static21.anInt867 = -1;
							return true;
						}
						if (local556 < 0) {
							break;
						}
						Static78.aClass3_Sub10Array1[local1515 + 1] = Static78.aClass3_Sub10Array1[local1515];
					}
					Static78.aClass3_Sub10Array1[local1515 + 1] = local3934;
					Static50.anInt1624++;
				} else {
					Static21.anInt867 = -1;
					return true;
				}
				Static80.anInt2518 += 32;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 180) {
				if (Static51.anInt1340 == 12) {
					Static118.aBoolean115 = true;
				}
				Static130.anInt3476 = Static79.aClass3_Sub12_Sub1_1.method1969();
				Static78.anInt2431 = Static34.anInt1183;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 58) {
				Static76.method1559();
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 3) {
				Static118.aBoolean115 = true;
				local126 = Static79.aClass3_Sub12_Sub1_1.method1920();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1963();
				if (local126 < -70000) {
					local151 += 32768;
				}
				if (local126 < 0) {
					local179 = null;
				} else {
					local179 = Static86.method1067(local126);
				}
				if (local179 != null) {
					for (local928 = 0; local928 < local179.anIntArray235.length; local928++) {
						local179.anIntArray235[local928] = 0;
						local179.anIntArray230[local928] = 0;
					}
				}
				Static60.method1210(local151);
				local928 = Static79.aClass3_Sub12_Sub1_1.method1963();
				for (local1116 = 0; local1116 < local928; local1116++) {
					local1515 = Static79.aClass3_Sub12_Sub1_1.method1953();
					local556 = Static79.aClass3_Sub12_Sub1_1.method1925();
					if (local556 == 255) {
						local556 = Static79.aClass3_Sub12_Sub1_1.method1920();
					}
					if (local179 != null && local179.anIntArray235.length > local1116) {
						local179.anIntArray235[local1116] = local1515;
						local179.anIntArray230[local1116] = local556;
					}
					Static10.method308(local1116, local151, local1515 - 1, local556);
				}
				Static10.anIntArray49[Static75.anInt2407++ & 0x1F] = local151 & 0x7FFF;
				Static21.anInt867 = -1;
				return true;
			}
			if (Static21.anInt867 == 171) {
				local126 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local151 = Static79.aClass3_Sub12_Sub1_1.method1955();
				if (Static78.anInt2429 != -1) {
					Static119.method2149(Static78.anInt2429);
					Static78.anInt2429 = -1;
					Static71.aBoolean49 = true;
				}
				if (Static114.anInt3185 != -1) {
					Static119.method2149(Static114.anInt3185);
					Static114.anInt3185 = -1;
					Static50.method1075(30);
				}
				if (Static57.anInt3397 != -1) {
					Static119.method2149(Static57.anInt3397);
					Static57.anInt3397 = -1;
				}
				if (local126 == Static79.anInt2467) {
					Static29.method667(Static79.anInt2467);
				} else {
					Static119.method2149(Static79.anInt2467);
					Static79.anInt2467 = local126;
				}
				if (local151 == Static119.anInt3242) {
					Static29.method667(Static119.anInt3242);
				} else {
					Static119.method2149(Static119.anInt3242);
					Static119.anInt3242 = local151;
				}
				Static45.aBoolean46 = true;
				Static118.aBoolean115 = true;
				if (Static103.anInt2994 != 0) {
					Static71.aBoolean49 = true;
					Static103.anInt2994 = 0;
				}
				Static96.anInt2745 = -1;
				method756(Static79.anInt2467);
				method756(Static119.anInt3242);
				Static21.anInt867 = -1;
				return true;
			}
			Static87.method1031(null, "T1 - " + Static21.anInt867 + "," + Static13.anInt404 + "," + Static115.anInt3204 + " - " + Static58.anInt1794);
			Static10.method312();
		} catch (@Pc(4365) IOException local4365) {
			Static51.method921();
		} catch (@Pc(4369) Exception local4369) {
			@Pc(4411) String local4411 = "T2 - " + Static21.anInt867 + "," + Static13.anInt404 + "," + Static115.anInt3204 + " - " + Static58.anInt1794 + "," + (Static112.anInt3118 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0]) + "," + (Static13.anInt410 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]) + " - ";
			for (local151 = 0; local151 < Static58.anInt1794 && local151 < 50; local151++) {
				local4411 = local4411 + Static79.aClass3_Sub12_Sub1_1.aByteArray77[local151] + ",";
			}
			Static87.method1031(local4369, local4411);
			Static10.method312();
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BJ)V")
	public static void method754(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
	public static boolean method755(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
	private static void method756(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static21.method563(arg0)) {
			return;
		}
		@Pc(24) Class3_Sub15[] local24 = Static120.aClass3_Sub15ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class3_Sub15 local32 = local24[local26];
			if (local32.anObjectArray17 != null) {
				Static12.method335(local32.anObjectArray17, local32, 0, 0, null, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)I")
	public static int method758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
