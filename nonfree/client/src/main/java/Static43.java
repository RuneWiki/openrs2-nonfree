import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "[J")
	private static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!kd;")
	private static Class39 aClass39_587 = Static108.method1915("Message");

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_586 = aClass39_587;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!kd;")
	private static Class39 aClass39_588 = Static108.method1915("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_589 = aClass39_588;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "Lclient!kd;")
	public static Class39 aClass39_590 = Static108.method1915("Mem:");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method762() {
		anIntArray174 = null;
		aClass39_589 = null;
		aClass39_590 = null;
		aBooleanArray6 = null;
		aClass39_586 = null;
		anIntArrayArray8 = null;
		aLongArray2 = null;
		aClass39_588 = null;
		aClass39_587 = null;
		aLongArray1 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
	public static boolean method764() {
		if (Static29.aClass74_1 == null) {
			return false;
		}
		@Pc(139) int local139;
		try {
			@Pc(13) int local13 = Static29.aClass74_1.method2048();
			if (local13 == 0) {
				return false;
			}
			if (Static121.anInt2967 == -1) {
				local13--;
				Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, 1);
				Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
				Static121.anInt2967 = Static79.aClass1_Sub18_Sub1_3.method2201();
				Static72.anInt1801 = Static56.anIntArray214[Static121.anInt2967];
			}
			if (Static72.anInt1801 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, 1);
				Static72.anInt1801 = Static79.aClass1_Sub18_Sub1_3.aByteArray96[0] & 0xFF;
			}
			if (Static72.anInt1801 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, 2);
				local13 -= 2;
				Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
				Static72.anInt1801 = Static79.aClass1_Sub18_Sub1_3.method2156();
			}
			if (local13 < Static72.anInt1801) {
				return false;
			}
			Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
			Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, Static72.anInt1801);
			Static55.anInt1505 = Static20.anInt729;
			Static20.anInt729 = Static105.anInt2670;
			Static105.anInt2670 = Static121.anInt2967;
			Static122.anInt2981 = 0;
			@Pc(193) int local193;
			@Pc(135) int local135;
			@Pc(143) Class1_Sub1_Sub1 local143;
			@Pc(160) int local160;
			@Pc(197) int local197;
			@Pc(187) int local187;
			if (Static121.anInt2967 == 194) {
				Static35.aBoolean96 = true;
				local135 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local135 < 0) {
					local143 = null;
				} else {
					local143 = Static41.method2106(local135);
				}
				if (local135 < -70000) {
					local139 += 32768;
				}
				if (local143 != null) {
					for (local160 = 0; local160 < local143.anIntArray9.length; local160++) {
						local143.anIntArray9[local160] = 0;
						local143.anIntArray14[local160] = 0;
					}
				}
				Static76.method1309(local139);
				local160 = Static79.aClass1_Sub18_Sub1_3.method2156();
				for (local187 = 0; local187 < local160; local187++) {
					local193 = Static79.aClass1_Sub18_Sub1_3.method2156();
					local197 = Static79.aClass1_Sub18_Sub1_3.method2174();
					if (local197 == 255) {
						local197 = Static79.aClass1_Sub18_Sub1_3.method2185();
					}
					if (local143 != null && local143.anIntArray9.length > local187) {
						local143.anIntArray9[local187] = local193;
						local143.anIntArray14[local187] = local197;
					}
					Static16.method1793(local187, local197, local193 - 1, local139);
				}
				Static17.anInt579 = Static45.anInt1256;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 253) {
				Static17.anInt577 = Static79.aClass1_Sub18_Sub1_3.method2171();
				Static75.anInt1892 = Static79.aClass1_Sub18_Sub1_3.method2171();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 247) {
				Static114.anInt2845 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static24.anInt816 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static11.anInt495 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static66.aBoolean145 = true;
				Static113.aBoolean226 = true;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 93) {
				Static120.anInt3073 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static126.aBoolean247 = true;
				Static35.aBoolean96 = true;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 179) {
				Static79.aClass1_Sub18_Sub1_3.method2185();
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(324) Class39 local324;
			@Pc(328) int local328;
			if (Static121.anInt2967 == 185) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2174();
				local324 = Static79.aClass1_Sub18_Sub1_3.method2139();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2150();
				if (local328 >= 1 && local328 <= 5) {
					if (local324.method1158(Static16.aClass39_1218)) {
						local324 = null;
					}
					Static11.aClass39Array6[local328 - 1] = local324;
					Static101.aBooleanArray13[local328 - 1] = local135 == 0;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 47) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2146();
				if (local135 == 65535) {
					local135 = -1;
				}
				Static129.method2209(local135);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 63) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2145();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static49.method859(local135, local139);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 81) {
				for (local135 = 0; local135 < Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1.length; local135++) {
					if (Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local135] != null) {
						Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local135].anInt2526 = -1;
					}
				}
				for (local139 = 0; local139 < Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local139++) {
					if (Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local139] != null) {
						Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local139].anInt2526 = -1;
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 100) {
				Static89.method1477(true);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 220) {
				Static49.anInt1372 = Static79.aClass1_Sub18_Sub1_3.method2170() * 30;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 46) {
				Static129.anInt3161 = Static79.aClass1_Sub18_Sub1_3.method2174();
				Static121.anInt2967 = -1;
				if (Static129.anInt3161 == Static120.anInt3073) {
					if (Static129.anInt3161 == 3) {
						Static120.anInt3073 = 1;
					} else {
						Static120.anInt3073 = 3;
					}
					Static35.aBoolean96 = true;
				}
				return true;
			}
			if (Static121.anInt2967 == 148) {
				Static108.anInt2750 = Static72.anInt1801 / 8;
				for (local135 = 0; local135 < Static108.anInt2750; local135++) {
					Static88.aLongArray4[local135] = Static79.aClass1_Sub18_Sub1_3.method2182();
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 107) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2157();
				if (local135 != Static9.anInt2991) {
					Static49.method857(Static9.anInt2991);
					Static9.anInt2991 = local135;
				}
				Static113.aBoolean226 = true;
				Static128.method2207(Static9.anInt2991);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 210) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2158();
				@Pc(592) boolean local592 = Static79.aClass1_Sub18_Sub1_3.method2171() == 1;
				local143 = Static41.method2106(local135);
				local143.aBoolean8 = local592;
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(610) long local610;
			if (Static121.anInt2967 == 153) {
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				@Pc(617) Class39 local617 = Static42.method744(Static99.method1757(Static79.aClass1_Sub18_Sub1_3).method1168());
				Static66.method1189(Static75.method1290(local610).method1153(), local617, 6);
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(642) long local642;
			@Pc(655) long local655;
			if (Static121.anInt2967 == 72) {
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				local642 = Static79.aClass1_Sub18_Sub1_3.method2156();
				@Pc(647) long local647 = (long) Static79.aClass1_Sub18_Sub1_3.method2145();
				@Pc(649) boolean local649 = false;
				local655 = local647 + (local642 << 32);
				local197 = Static79.aClass1_Sub18_Sub1_3.method2169();
				for (@Pc(661) int local661 = 0; local661 < 100; local661++) {
					if (local655 == aLongArray2[local661]) {
						local649 = true;
						break;
					}
				}
				if (local197 <= 1) {
					for (@Pc(684) int local684 = 0; local684 < Static108.anInt2750; local684++) {
						if (local610 == Static88.aLongArray4[local684]) {
							local649 = true;
							break;
						}
					}
				}
				if (!local649 && Static30.anInt1002 == 0) {
					aLongArray2[Static37.anInt1116] = local655;
					Static37.anInt1116 = (Static37.anInt1116 + 1) % 100;
					@Pc(721) Class39 local721 = Static42.method744(Static99.method1757(Static79.aClass1_Sub18_Sub1_3).method1168());
					if (local197 == 2 || local197 == 3) {
						Static66.method1189(Static30.method601(new Class39[] { Static38.aClass39_534, Static75.method1290(local610).method1153() }), local721, 7);
					} else if (local197 == 1) {
						Static66.method1189(Static30.method601(new Class39[] { Static112.aClass39_1343, Static75.method1290(local610).method1153() }), local721, 7);
					} else {
						Static66.method1189(Static75.method1290(local610).method1153(), local721, 3);
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 186) {
				Static79.aClass1_Sub18_Sub1_3.method2170();
				Static79.aClass1_Sub18_Sub1_3.method2166();
				Static79.aClass1_Sub18_Sub1_3.method2174();
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(831) Class1_Sub1_Sub1 local831;
			if (Static121.anInt2967 == 9) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2141();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local831 = Static41.method2106(local328);
				Static121.anInt2967 = -1;
				local831.anInt58 = local135 + (local139 << 16);
				return true;
			}
			if (Static121.anInt2967 == 252) {
				for (local135 = 0; local135 < Static44.anIntArray175.length; local135++) {
					if (Static44.anIntArray175[local135] != Static50.anIntArray188[local135]) {
						Static44.anIntArray175[local135] = Static50.anIntArray188[local135];
						Static24.method454(local135);
						Static35.aBoolean96 = true;
					}
				}
				Static121.anInt2967 = -1;
				Static96.anInt2282 = Static45.anInt1256;
				return true;
			}
			if (Static121.anInt2967 == 213) {
				Static113.anInt2820 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static35.aBoolean96 = true;
				Static96.anInt2282 = Static45.anInt1256;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 108) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2166();
				local143 = Static41.method2106(local139);
				local143.anInt100 = 1;
				Static121.anInt2967 = -1;
				local143.anInt66 = local135;
				return true;
			}
			if (Static121.anInt2967 == 251) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2174();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2174();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2171();
				Static9.anInt2983 = local139 >> 1;
				Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1803(local328, local135, (local139 & 0x1) == 1);
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(969) Class1_Sub1_Sub1 local969;
			if (Static121.anInt2967 == 25) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2137();
				local969 = Static41.method2106(local135);
				for (local328 = 0; local328 < local969.anIntArray9.length; local328++) {
					local969.anIntArray9[local328] = -1;
					local969.anIntArray9[local328] = 0;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 238) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2146();
				@Pc(1006) byte local1006 = Static79.aClass1_Sub18_Sub1_3.method2178();
				Static50.anIntArray188[local135] = local1006;
				if (local1006 != Static44.anIntArray175[local135]) {
					Static44.anIntArray175[local135] = local1006;
					Static24.method454(local135);
					Static35.aBoolean96 = true;
					if (Static9.anInt2991 != -1) {
						Static113.aBoolean226 = true;
					}
				}
				Static96.anInt2282 = Static45.anInt1256;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 135) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2156();
				Static66.method1191(local135, local139, local328);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 34) {
				Static75.anInt1892 = Static79.aClass1_Sub18_Sub1_3.method2150();
				Static17.anInt577 = Static79.aClass1_Sub18_Sub1_3.method2174();
				while (Static72.anInt1801 > Static79.aClass1_Sub18_Sub1_3.anInt3078) {
					Static121.anInt2967 = Static79.aClass1_Sub18_Sub1_3.method2169();
					Static89.method1476();
				}
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(1141) int local1141;
			@Pc(1143) int local1143;
			@Pc(1121) long local1121;
			if (Static121.anInt2967 == 132) {
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				@Pc(1115) byte local1115 = Static79.aClass1_Sub18_Sub1_3.method2178();
				@Pc(1117) boolean local1117 = false;
				local1121 = Static79.aClass1_Sub18_Sub1_3.method2182();
				@Pc(1126) long local1126 = (long) Static79.aClass1_Sub18_Sub1_3.method2156();
				local655 = Static79.aClass1_Sub18_Sub1_3.method2145();
				@Pc(1137) long local1137 = local655 + (local1126 << 32);
				local1141 = Static79.aClass1_Sub18_Sub1_3.method2169();
				for (local1143 = 0; local1143 < 100; local1143++) {
					if (local1137 == aLongArray2[local1143]) {
						local1117 = true;
						break;
					}
				}
				if (local1141 <= 1) {
					for (@Pc(1168) int local1168 = 0; local1168 < Static108.anInt2750; local1168++) {
						if (Static88.aLongArray4[local1168] == local610) {
							local1117 = true;
							break;
						}
					}
				}
				if (!local1117 && Static30.anInt1002 == 0) {
					aLongArray2[Static37.anInt1116] = local1137;
					Static37.anInt1116 = (Static37.anInt1116 + 1) % 100;
					@Pc(1216) Class39 local1216 = Static42.method744(Static99.method1757(Static79.aClass1_Sub18_Sub1_3).method1168());
					@Pc(1245) Class39 local1245 = Static30.method601(new Class39[] { Static121.aClass39_1425, Static75.method1290(local1121), Static110.aClass39_1340, Static69.method1226(local1115), Static82.aClass39_987 });
					if (local1141 == 2 || local1141 == 3) {
						Static66.method1189(Static30.method601(new Class39[] { local1245, Static38.aClass39_534, Static75.method1290(local610).method1153() }), local1216, 7);
					} else if (local1141 == 1) {
						Static66.method1189(Static30.method601(new Class39[] { local1245, Static112.aClass39_1343, Static75.method1290(local610).method1153() }), local1216, 7);
					} else {
						Static66.method1189(Static30.method601(new Class39[] { local1245, Static75.method1290(local610).method1153() }), local1216, 3);
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(1474) int local1474;
			@Pc(1481) int local1481;
			if (Static121.anInt2967 == 240) {
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local160 = Static79.aClass1_Sub18_Sub1_3.method2169();
				@Pc(1355) Class39 local1355 = Static75.method1290(local610).method1153();
				for (local193 = 0; local193 < Static12.anInt502; local193++) {
					if (Static45.aLongArray3[local193] == local610) {
						if (Static14.anIntArray93[local193] != local328) {
							Static14.anIntArray93[local193] = local328;
							Static35.aBoolean96 = true;
							if (local328 > 0) {
								Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { local1355, Static121.aClass39_1423 }), 5);
							}
							if (local328 == 0) {
								Static66.method1189(Static8.aClass39_147, Static30.method601(new Class39[] { local1355, Static51.aClass39_668 }), 5);
							}
						}
						local1355 = null;
						Static88.anIntArray322[local193] = local160;
						break;
					}
				}
				if (local1355 != null && Static12.anInt502 < 200) {
					Static45.aLongArray3[Static12.anInt502] = local610;
					Static117.aClass39Array29[Static12.anInt502] = local1355;
					Static14.anIntArray93[Static12.anInt502] = local328;
					Static88.anIntArray322[Static12.anInt502] = local160;
					Static12.anInt502++;
					Static35.aBoolean96 = true;
					Static96.anInt2282 = Static45.anInt1256;
				}
				local1474 = Static12.anInt502;
				while (local1474 > 0) {
					local1474--;
					@Pc(1479) boolean local1479 = true;
					for (local1481 = 0; local1481 < local1474; local1481++) {
						if (Static14.anIntArray93[local1481] != Static98.anInt2390 && Static98.anInt2390 == Static14.anIntArray93[local1481 + 1] || Static14.anIntArray93[local1481] == 0 && Static14.anIntArray93[local1481 + 1] != 0) {
							local1141 = Static14.anIntArray93[local1481];
							Static14.anIntArray93[local1481] = Static14.anIntArray93[local1481 + 1];
							Static14.anIntArray93[local1481 + 1] = local1141;
							local1479 = false;
							@Pc(1533) Class39 local1533 = Static117.aClass39Array29[local1481];
							Static117.aClass39Array29[local1481] = Static117.aClass39Array29[local1481 + 1];
							Static117.aClass39Array29[local1481 + 1] = local1533;
							@Pc(1551) long local1551 = Static45.aLongArray3[local1481];
							Static45.aLongArray3[local1481] = Static45.aLongArray3[local1481 + 1];
							Static45.aLongArray3[local1481 + 1] = local1551;
							local1143 = Static88.anIntArray322[local1481];
							Static88.anIntArray322[local1481] = Static88.anIntArray322[local1481 + 1];
							Static88.anIntArray322[local1481 + 1] = local1143;
							Static35.aBoolean96 = true;
						}
					}
					if (local1479) {
						break;
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 225) {
				Static49.anInt1368 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 214) {
				Static29.method583(Static72.anInt1801, Static92.aClass79_2, Static79.aClass1_Sub18_Sub1_3);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 160) {
				if (Static120.anInt3073 == 12) {
					Static35.aBoolean96 = true;
				}
				Static4.anInt162 = Static79.aClass1_Sub18_Sub1_3.method2157();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 193) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2141();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2158();
				local143 = Static41.method2106(local139);
				local143.anInt100 = 2;
				local143.anInt66 = local135;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 202) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local160 = Static79.aClass1_Sub18_Sub1_3.method2169();
				aBooleanArray6[local135] = true;
				Static1.anIntArray13[local135] = local139;
				Static119.anIntArray462[local135] = local328;
				Static120.anIntArray478[local135] = local160;
				Static55.anIntArray213[local135] = 0;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 21) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2146();
				Static34.method639(local135);
				Static121.anInt2967 = -1;
				Static17.anInt579 = Static45.anInt1256;
				return true;
			}
			if (Static121.anInt2967 == 95) {
				Static25.method460();
				Static121.anInt2967 = -1;
				return false;
			}
			if (Static121.anInt2967 == 87) {
				Static48.anInt1316 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 11) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				if (local135 == 65535) {
					local135 = -1;
				}
				local139 = Static79.aClass1_Sub18_Sub1_3.method2174();
				if (local135 == Static23.anIntArray117[local139]) {
					Static107.method1886(Static23.anIntArray117[local139]);
				} else {
					Static49.method857(Static23.anIntArray117[local139]);
					Static23.anIntArray117[local139] = local135;
				}
				Static126.aBoolean247 = true;
				Static35.aBoolean96 = true;
				Static128.method2207(Static23.anIntArray117[local139]);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 188) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local969 = Static41.method2106(local135);
				local969.anInt100 = 3;
				local969.anInt66 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1.method862();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 242) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2158();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2158();
				if (local139 == 65535) {
					local139 = -1;
				}
				local1121 = ((long) local135 << 32) + (long) local139;
				@Pc(1870) Class1 local1870 = Static48.aClass70_3.method1961(local1121);
				if (local1870 != null) {
					local1870.method2128();
				}
				Static48.aClass70_3.method1955(new Class1_Sub11(local328), local1121);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 180) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2154();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2166();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2142();
				local831 = Static41.method2106(local139);
				local831.anInt81 = local135 + local831.anInt104;
				Static121.anInt2967 = -1;
				local831.anInt110 = local328 + local831.anInt115;
				return true;
			}
			if (Static121.anInt2967 == 20) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2158();
				Static119.aClass34_5 = Static92.aClass79_2.method2095(local135);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 196) {
				Static96.anInt2282 = Static45.anInt1256;
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				if (local610 == 0L) {
					Static11.aClass1_Sub12Array1 = null;
					Static47.anInt1304 = 0;
					Static121.anInt2967 = -1;
					Static79.aClass39_1227 = null;
					return true;
				}
				Static79.aClass39_1227 = Static75.method1290(local610);
				local328 = Static79.aClass1_Sub18_Sub1_3.method2169();
				if (local328 == 255) {
					Static121.anInt2967 = -1;
					return true;
				}
				Static47.anInt1304 = local328;
				@Pc(1991) Class1_Sub12[] local1991 = new Class1_Sub12[100];
				for (local187 = 0; local187 < Static47.anInt1304; local187++) {
					local1991[local187] = new Class1_Sub12();
					local1991[local187].aLong98 = Static79.aClass1_Sub18_Sub1_3.method2182();
					local1991[local187].aClass39_886 = Static75.method1290(local1991[local187].aLong98);
					local1991[local187].anInt1787 = Static79.aClass1_Sub18_Sub1_3.method2156();
				}
				local1474 = Static47.anInt1304;
				while (local1474 > 0) {
					local1474--;
					@Pc(2042) boolean local2042 = true;
					for (local1481 = 0; local1481 < local1474; local1481++) {
						if (local1991[local1481].aClass39_886.method1180(local1991[local1481 + 1].aClass39_886) > 0) {
							@Pc(2063) Class1_Sub12 local2063 = local1991[local1481];
							local1991[local1481] = local1991[local1481 + 1];
							local1991[local1481 + 1] = local2063;
							local2042 = false;
						}
					}
					if (local2042) {
						break;
					}
				}
				Static121.anInt2967 = -1;
				Static11.aClass1_Sub12Array1 = local1991;
				return true;
			}
			if (Static121.anInt2967 == 163) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local143 = Static41.method2106(local139);
				Static121.anInt2967 = -1;
				if (local143 != null && local143.anInt91 == 0) {
					if (local135 > local143.anInt99 - local143.anInt82) {
						local135 = local143.anInt99 - local143.anInt82;
					}
					if (local135 < 0) {
						local135 = 0;
					}
					local143.anInt95 = local135;
				}
				return true;
			}
			if (Static121.anInt2967 == 155) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2166();
				Static50.anIntArray188[local135] = local139;
				if (Static44.anIntArray175[local135] != local139) {
					Static44.anIntArray175[local135] = local139;
					Static24.method454(local135);
					if (Static9.anInt2991 != -1) {
						Static113.aBoolean226 = true;
					}
					Static35.aBoolean96 = true;
				}
				Static121.anInt2967 = -1;
				Static96.anInt2282 = Static45.anInt1256;
				return true;
			}
			if (Static121.anInt2967 == 67) {
				Static23.method448();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 59) {
				Static29.aBoolean86 = true;
				Static3.anInt148 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static53.anInt1467 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static62.anInt2929 = Static79.aClass1_Sub18_Sub1_3.method2156();
				Static81.anInt1992 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static58.anInt1565 = Static79.aClass1_Sub18_Sub1_3.method2169();
				if (Static58.anInt1565 >= 100) {
					Static28.anInt2564 = Static3.anInt148 * 128 + 64;
					Static62.anInt2932 = Static53.anInt1467 * 128 + 64;
					Static22.anInt763 = Static62.method2035(Static9.anInt2983, Static28.anInt2564, Static62.anInt2932) - Static62.anInt2929;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 82) {
				for (local135 = 0; local135 < Static22.anInt764; local135++) {
					@Pc(2274) Class1_Sub1_Sub10 local2274 = Static46.method1934(local135);
					if (local2274 != null && local2274.anInt1309 == 0) {
						Static50.anIntArray188[local135] = 0;
						Static44.anIntArray175[local135] = 0;
					}
				}
				Static96.anInt2282 = Static45.anInt1256;
				if (Static9.anInt2991 != -1) {
					Static113.aBoolean226 = true;
				}
				Static121.anInt2967 = -1;
				Static35.aBoolean96 = true;
				return true;
			}
			if (Static121.anInt2967 == 241) {
				Static76.anInt1913 = Static79.aClass1_Sub18_Sub1_3.method2146();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 55) {
				Static79.aClass1_Sub18_Sub1_3.method2156();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 172) {
				Static89.method1477(false);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 218) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2137();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2157();
				local143 = Static41.method2106(local135);
				Static121.anInt2967 = -1;
				if (local139 != local143.anInt76 || local139 == -1) {
					local143.anInt86 = 0;
					local143.anInt76 = local139;
					local143.anInt98 = 0;
				}
				return true;
			}
			if (Static121.anInt2967 == 54 || Static121.anInt2967 == 57 || Static121.anInt2967 == 199 || Static121.anInt2967 == 114 || Static121.anInt2967 == 27 || Static121.anInt2967 == 147 || Static121.anInt2967 == 24 || Static121.anInt2967 == 123 || Static121.anInt2967 == 136 || Static121.anInt2967 == 31 || Static121.anInt2967 == 190) {
				Static89.method1476();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 149) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local187 = local139 & 0x1F;
				local160 = local139 >> 5 & 0x1F;
				local328 = local139 >> 10 & 0x1F;
				@Pc(2467) Class1_Sub1_Sub1 local2467 = Static41.method2106(local135);
				Static121.anInt2967 = -1;
				local2467.anInt108 = (local187 << 3) + (local328 << 19) + (local160 << 11);
				return true;
			}
			if (Static121.anInt2967 == 16) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2156();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2146();
				Static99.method1766(local139);
				if (local135 != -1) {
					Static99.method1766(local135);
				}
				if (Static48.anInt1318 != -1) {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = -1;
				}
				if (Static91.anInt2131 != -1) {
					Static49.method857(Static91.anInt2131);
					Static91.anInt2131 = -1;
				}
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
				}
				if (local139 == Static72.anInt1798) {
					Static107.method1886(Static72.anInt1798);
				} else {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = local139;
					Static41.method2108(35);
				}
				if (local139 == Static16.anInt2474) {
					Static107.method1886(Static16.anInt2474);
				} else {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = local135;
				}
				Static2.anInt133 = 0;
				Static122.anInt2982 = -1;
				Static128.method2207(Static72.anInt1798);
				Static128.method2207(Static16.anInt2474);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 243) {
				Static121.anInt2967 = -1;
				Static35.anInt1069 = 0;
				return true;
			}
			if (Static121.anInt2967 == 84) {
				if (Static91.anInt2131 != -1) {
					Static49.method857(Static91.anInt2131);
					Static126.aBoolean247 = true;
					Static91.anInt2131 = -1;
					Static35.aBoolean96 = true;
				}
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static113.aBoolean226 = true;
					Static110.anInt2786 = -1;
				}
				if (Static72.anInt1798 != -1) {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = -1;
					Static41.method2108(30);
				}
				if (Static16.anInt2474 != -1) {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = -1;
				}
				if (Static48.anInt1318 != -1) {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = -1;
				}
				Static121.anInt2967 = -1;
				if (Static2.anInt133 != 0) {
					Static2.anInt133 = 0;
					Static113.aBoolean226 = true;
				}
				Static122.anInt2982 = -1;
				return true;
			}
			if (Static121.anInt2967 == 74) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2146();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2141();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2141();
				local160 = Static79.aClass1_Sub18_Sub1_3.method2185();
				@Pc(2678) Class1_Sub1_Sub1 local2678 = Static41.method2106(local160);
				local2678.anInt54 = local135;
				local2678.anInt88 = local328;
				Static121.anInt2967 = -1;
				local2678.anInt89 = local139;
				return true;
			}
			if (Static121.anInt2967 == 83) {
				Static35.aBoolean96 = true;
				local135 = Static79.aClass1_Sub18_Sub1_3.method2169();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2137();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2150();
				Static94.anIntArray339[local135] = local139;
				Static1.anIntArray10[local135] = local328;
				Static36.anIntArray156[local135] = 1;
				for (local160 = 0; local160 < 98; local160++) {
					if (Class1_Sub13.anIntArray265[local160] <= local139) {
						Static36.anIntArray156[local135] = local160 + 2;
					}
				}
				Static99.anInt2443 = Static45.anInt1256;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 106) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2141();
				Static99.method1766(local135);
				if (Static91.anInt2131 != -1) {
					Static49.method857(Static91.anInt2131);
					Static91.anInt2131 = -1;
					Static35.aBoolean96 = true;
					Static126.aBoolean247 = true;
				}
				if (Static72.anInt1798 != -1) {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = -1;
					Static41.method2108(30);
				}
				if (Static16.anInt2474 != -1) {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = -1;
				}
				if (Static48.anInt1318 != -1) {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = -1;
				}
				if (Static110.anInt2786 == local135) {
					Static107.method1886(Static110.anInt2786);
				} else {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = local135;
				}
				Static122.anInt2982 = -1;
				Static128.method2207(Static110.anInt2786);
				Static113.aBoolean226 = true;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 158) {
				Static29.aBoolean86 = true;
				Static100.anInt2551 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static4.anInt163 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static77.anInt1934 = Static79.aClass1_Sub18_Sub1_3.method2156();
				Static23.anInt801 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static110.anInt2792 = Static79.aClass1_Sub18_Sub1_3.method2169();
				if (Static110.anInt2792 >= 100) {
					local135 = Static100.anInt2551 * 128 + 64;
					local139 = Static4.anInt163 * 128 + 64;
					local328 = Static62.method2035(Static9.anInt2983, local135, local139) - Static77.anInt1934;
					local160 = local135 - Static28.anInt2564;
					local193 = local139 - Static62.anInt2932;
					local187 = local328 - Static22.anInt763;
					local197 = (int) Math.sqrt((double) (local160 * local160 + local193 * local193));
					Static104.anInt2640 = (int) (Math.atan2((double) local187, (double) local197) * 325.949D) & 0x7FF;
					Static38.anInt1156 = (int) (-325.949D * Math.atan2((double) local160, (double) local193)) & 0x7FF;
					if (Static104.anInt2640 < 128) {
						Static104.anInt2640 = 128;
					}
					if (Static104.anInt2640 > 383) {
						Static104.anInt2640 = 383;
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 207) {
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
				}
				Static8.aClass39_145 = Static8.aClass39_147;
				Static2.anInt133 = 2;
				Static121.anInt2967 = -1;
				Static113.aBoolean226 = true;
				Static90.aBoolean179 = false;
				return true;
			}
			if (Static121.anInt2967 == 211) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				if (local135 == 65535) {
					local135 = -1;
				}
				local139 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2158();
				local831 = Static41.method2106(local139);
				@Pc(2996) Class1_Sub1_Sub17 local2996;
				if (local831.aBoolean14) {
					local831.anInt97 = local135;
					local831.anInt47 = local328;
					local2996 = Static8.method224(local135);
					local831.anInt67 = local2996.anInt2737;
					local831.anInt89 = local2996.anInt2740;
					local831.anInt54 = local2996.anInt2721;
					local831.anInt114 = local2996.anInt2730;
					local831.anInt69 = local2996.anInt2744;
					local831.anInt88 = local2996.anInt2724;
					if (local831.anInt101 > 0) {
						local831.anInt88 = local831.anInt88 * 32 / local831.anInt101;
					}
					Static1.method50(local831);
				} else if (local135 == -1) {
					Static121.anInt2967 = -1;
					local831.anInt100 = 0;
					return true;
				} else {
					local2996 = Static8.method224(local135);
					local831.anInt100 = 4;
					local831.anInt88 = local2996.anInt2724 * 100 / local328;
					local831.anInt54 = local2996.anInt2721;
					local831.anInt66 = local135;
					local831.anInt89 = local2996.anInt2740;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 182) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2154();
				if (local135 >= 0) {
					Static99.method1766(local135);
				}
				if (local135 != Static1.anInt90) {
					Static49.method857(Static1.anInt90);
					Static1.anInt90 = local135;
				}
				Static128.method2207(Static1.anInt90);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 217) {
				Static58.anInt1564 = Static79.aClass1_Sub18_Sub1_3.method2169();
				if (Static58.anInt1564 == 1) {
					Static100.anInt2549 = Static79.aClass1_Sub18_Sub1_3.method2156();
				}
				if (Static58.anInt1564 >= 2 && Static58.anInt1564 <= 6) {
					if (Static58.anInt1564 == 2) {
						Static56.anInt1517 = 64;
						Static18.anInt630 = 64;
					}
					if (Static58.anInt1564 == 3) {
						Static18.anInt630 = 64;
						Static56.anInt1517 = 0;
					}
					if (Static58.anInt1564 == 4) {
						Static18.anInt630 = 64;
						Static56.anInt1517 = 128;
					}
					if (Static58.anInt1564 == 5) {
						Static18.anInt630 = 0;
						Static56.anInt1517 = 64;
					}
					if (Static58.anInt1564 == 6) {
						Static56.anInt1517 = 64;
						Static18.anInt630 = 128;
					}
					Static58.anInt1564 = 2;
					Static69.anInt1768 = Static79.aClass1_Sub18_Sub1_3.method2156();
					Static40.anInt1177 = Static79.aClass1_Sub18_Sub1_3.method2156();
					Static38.anInt1155 = Static79.aClass1_Sub18_Sub1_3.method2169();
				}
				if (Static58.anInt1564 == 10) {
					Static113.anInt2832 = Static79.aClass1_Sub18_Sub1_3.method2156();
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 239) {
				Static35.aBoolean96 = true;
				local135 = Static79.aClass1_Sub18_Sub1_3.method2185();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (local135 < -70000) {
					local139 += 32768;
				}
				if (local135 >= 0) {
					local143 = Static41.method2106(local135);
				} else {
					local143 = null;
				}
				while (Static79.aClass1_Sub18_Sub1_3.anInt3078 < Static72.anInt1801) {
					local160 = Static79.aClass1_Sub18_Sub1_3.method2175();
					local193 = 0;
					local187 = Static79.aClass1_Sub18_Sub1_3.method2156();
					if (local187 != 0) {
						local193 = Static79.aClass1_Sub18_Sub1_3.method2169();
						if (local193 == 255) {
							local193 = Static79.aClass1_Sub18_Sub1_3.method2185();
						}
					}
					if (local143 != null && local160 >= 0 && local143.anIntArray9.length > local160) {
						local143.anIntArray9[local160] = local187;
						local143.anIntArray14[local160] = local193;
					}
					Static16.method1793(local160, local193, local187 - 1, local139);
				}
				Static121.anInt2967 = -1;
				Static17.anInt579 = Static45.anInt1256;
				return true;
			}
			if (Static121.anInt2967 == 175) {
				Static8.aClass39_154 = Static79.aClass1_Sub18_Sub1_3.method2139();
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
				}
				Static8.aClass39_145 = Static8.aClass39_147;
				Static121.anInt2967 = -1;
				Static90.aBoolean179 = false;
				Static2.anInt133 = 4;
				Static113.aBoolean226 = true;
				return true;
			}
			if (Static121.anInt2967 == 166) {
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
				}
				Static90.aBoolean179 = false;
				Static113.aBoolean226 = true;
				Static2.anInt133 = 1;
				Static121.anInt2967 = -1;
				Static8.aClass39_145 = Static8.aClass39_147;
				return true;
			}
			if (Static121.anInt2967 == 141) {
				Static75.anInt1892 = Static79.aClass1_Sub18_Sub1_3.method2150();
				Static17.anInt577 = Static79.aClass1_Sub18_Sub1_3.method2150();
				for (local135 = Static75.anInt1892; local135 < Static75.anInt1892 + 8; local135++) {
					for (local139 = Static17.anInt577; local139 < Static17.anInt577 + 8; local139++) {
						if (Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local135][local139] != null) {
							Static100.aClass31ArrayArrayArray1[Static9.anInt2983][local135][local139] = null;
							Static33.method630(local135, local139);
						}
					}
				}
				for (@Pc(3414) Class1_Sub19 local3414 = (Class1_Sub19) Static96.aClass31_54.method1000(); local3414 != null; local3414 = (Class1_Sub19) Static96.aClass31_54.method1003()) {
					if (Static75.anInt1892 <= local3414.anInt2830 && local3414.anInt2830 < Static75.anInt1892 + 8 && Static17.anInt577 <= local3414.anInt2818 && local3414.anInt2818 < Static17.anInt577 + 8 && Static9.anInt2983 == local3414.anInt2827) {
						local3414.anInt2828 = 0;
					}
				}
				Static121.anInt2967 = -1;
				return true;
			}
			@Pc(3473) Class39 local3473;
			if (Static121.anInt2967 == 70) {
				local3473 = Static79.aClass1_Sub18_Sub1_3.method2139();
				@Pc(3480) Object[] local3480 = new Object[local3473.method1175() + 1];
				for (local328 = local3473.method1175() - 1; local328 >= 0; local328--) {
					if (local3473.method1167(local328) == 115) {
						local3480[local328 + 1] = Static79.aClass1_Sub18_Sub1_3.method2139();
					} else {
						local3480[local328 + 1] = Integer.valueOf(Static79.aClass1_Sub18_Sub1_3.method2185());
					}
				}
				local3480[0] = Integer.valueOf(Static79.aClass1_Sub18_Sub1_3.method2185());
				Static52.method962(local3480, 0, null, 0, null, 0);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 255) {
				Static19.method364();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 130) {
				if (Static120.anInt3073 == 12) {
					Static35.aBoolean96 = true;
				}
				Static82.anInt1995 = Static79.aClass1_Sub18_Sub1_3.method2169();
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 71) {
				local610 = Static79.aClass1_Sub18_Sub1_3.method2182();
				local328 = Static79.aClass1_Sub18_Sub1_3.method2156();
				Static79.aClass1_Sub18_Sub1_3.method2178();
				@Pc(3593) boolean local3593 = false;
				if ((local610 & Long.MIN_VALUE) != 0L) {
					local3593 = true;
				}
				if (local3593) {
					if (Static47.anInt1304 == 0) {
						Static121.anInt2967 = -1;
						return true;
					}
					local610 &= Long.MAX_VALUE;
					for (local187 = 0; Static47.anInt1304 > local187 && (local610 != Static11.aClass1_Sub12Array1[local187].aLong98 || Static11.aClass1_Sub12Array1[local187].anInt1787 != local328); local187++) {
					}
					if (Static47.anInt1304 > local187) {
						while (local187 < Static47.anInt1304 - 1) {
							Static11.aClass1_Sub12Array1[local187] = Static11.aClass1_Sub12Array1[local187 + 1];
							local187++;
						}
						Static11.aClass1_Sub12Array1[Static47.anInt1304] = null;
						Static47.anInt1304--;
					}
				} else if (Static47.anInt1304 < 100) {
					@Pc(3687) Class1_Sub12 local3687 = new Class1_Sub12();
					local3687.aLong98 = local610;
					local3687.aClass39_886 = Static75.method1290(local3687.aLong98);
					local3687.anInt1787 = local328;
					for (local193 = Static47.anInt1304 - 1; local193 >= 0; local193--) {
						local197 = Static11.aClass1_Sub12Array1[local193].aClass39_886.method1180(local3687.aClass39_886);
						System.out.println("co=" + local197);
						if (local197 == 0) {
							Static121.anInt2967 = -1;
							return true;
						}
						if (local197 < 0) {
							break;
						}
						Static11.aClass1_Sub12Array1[local193 + 1] = Static11.aClass1_Sub12Array1[local193];
					}
					Static11.aClass1_Sub12Array1[local193 + 1] = local3687;
					Static47.anInt1304++;
				} else {
					Static121.anInt2967 = -1;
					return true;
				}
				Static96.anInt2282 = Static45.anInt1256;
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 113) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2141();
				Static99.method1766(local135);
				if (Static91.anInt2131 != -1) {
					Static49.method857(Static91.anInt2131);
					Static35.aBoolean96 = true;
					Static126.aBoolean247 = true;
					Static91.anInt2131 = -1;
				}
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static113.aBoolean226 = true;
					Static110.anInt2786 = -1;
				}
				if (Static72.anInt1798 != -1) {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = -1;
					Static41.method2108(30);
				}
				if (Static16.anInt2474 != -1) {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = -1;
				}
				if (local135 == Static48.anInt1318) {
					Static107.method1886(Static48.anInt1318);
				} else {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = local135;
				}
				Static122.anInt2982 = -1;
				if (Static2.anInt133 != 0) {
					Static113.aBoolean226 = true;
					Static2.anInt133 = 0;
				}
				Static128.method2207(Static48.anInt1318);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 144) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				Static99.method1766(local135);
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
					Static113.aBoolean226 = true;
				}
				if (Static72.anInt1798 != -1) {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = -1;
					Static41.method2108(30);
				}
				if (Static16.anInt2474 != -1) {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = -1;
				}
				if (Static48.anInt1318 != -1) {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = -1;
				}
				if (Static91.anInt2131 == local135) {
					Static107.method1886(Static91.anInt2131);
				} else {
					Static49.method857(Static91.anInt2131);
					Static91.anInt2131 = local135;
				}
				Static126.aBoolean247 = true;
				Static122.anInt2982 = -1;
				Static35.aBoolean96 = true;
				if (Static2.anInt133 != 0) {
					Static113.aBoolean226 = true;
					Static2.anInt133 = 0;
				}
				Static128.method2207(Static91.anInt2131);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 162) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2158();
				local324 = Static79.aClass1_Sub18_Sub1_3.method2139();
				local143 = Static41.method2106(local135);
				local143.aClass39_30 = local324;
				if (Static23.anIntArray117[Static120.anInt3073] == local135 >> 16) {
					Static35.aBoolean96 = true;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 61) {
				Static29.aBoolean86 = false;
				for (local135 = 0; local135 < 5; local135++) {
					aBooleanArray6[local135] = false;
				}
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 30) {
				local135 = Static79.aClass1_Sub18_Sub1_3.method2170();
				local139 = Static79.aClass1_Sub18_Sub1_3.method2156();
				if (Static110.anInt2786 != -1) {
					Static49.method857(Static110.anInt2786);
					Static110.anInt2786 = -1;
					Static113.aBoolean226 = true;
				}
				if (Static72.anInt1798 != -1) {
					Static49.method857(Static72.anInt1798);
					Static72.anInt1798 = -1;
					Static41.method2108(30);
				}
				if (Static16.anInt2474 != -1) {
					Static49.method857(Static16.anInt2474);
					Static16.anInt2474 = -1;
				}
				if (Static48.anInt1318 == local135) {
					Static107.method1886(Static48.anInt1318);
				} else {
					Static49.method857(Static48.anInt1318);
					Static48.anInt1318 = local135;
				}
				if (Static91.anInt2131 == local139) {
					Static107.method1886(Static91.anInt2131);
				} else {
					Static49.method857(Static91.anInt2131);
					Static91.anInt2131 = local139;
				}
				Static122.anInt2982 = -1;
				Static126.aBoolean247 = true;
				if (Static2.anInt133 != 0) {
					Static2.anInt133 = 0;
					Static113.aBoolean226 = true;
				}
				Static35.aBoolean96 = true;
				Static128.method2207(Static48.anInt1318);
				Static128.method2207(Static91.anInt2131);
				Static121.anInt2967 = -1;
				return true;
			}
			if (Static121.anInt2967 == 18) {
				local3473 = Static79.aClass1_Sub18_Sub1_3.method2139();
				@Pc(4110) boolean local4110;
				if (local3473.method1170(Static88.aClass39_1059)) {
					local324 = local3473.method1173(local3473.method1166(Static44.aClass39_596), 0);
					local642 = local324.method1186();
					local4110 = false;
					for (local193 = 0; local193 < Static108.anInt2750; local193++) {
						if (Static88.aLongArray4[local193] == local642) {
							local4110 = true;
							break;
						}
					}
					if (!local4110 && Static30.anInt1002 == 0) {
						Static66.method1189(local324, Static94.aClass39_1143, 4);
					}
				} else if (local3473.method1170(Static73.aClass39_900)) {
					local324 = local3473.method1173(local3473.method1166(Static44.aClass39_596), 0);
					local642 = local324.method1186();
					local4110 = false;
					for (local193 = 0; local193 < Static108.anInt2750; local193++) {
						if (local642 == Static88.aLongArray4[local193]) {
							local4110 = true;
							break;
						}
					}
					if (!local4110 && Static30.anInt1002 == 0) {
						Static66.method1189(local324, Static12.aClass39_231, 8);
					}
				} else if (local3473.method1170(Static105.aClass39_1302)) {
					local324 = local3473.method1173(local3473.method1166(Static44.aClass39_596), 0);
					local642 = local324.method1186();
					local4110 = false;
					for (local193 = 0; local193 < Static108.anInt2750; local193++) {
						if (Static88.aLongArray4[local193] == local642) {
							local4110 = true;
							break;
						}
					}
					if (!local4110 && Static30.anInt1002 == 0) {
						@Pc(4264) Class39 local4264 = local3473.method1173(local3473.method1175() - 9, local3473.method1166(Static44.aClass39_596) + 1);
						Static66.method1189(local324, local4264, 8);
					}
				} else {
					Static66.method1189(Static8.aClass39_147, local3473, 0);
				}
				Static121.anInt2967 = -1;
				return true;
			}
			Static95.method2004("T1 - " + Static121.anInt2967 + "," + Static20.anInt729 + "," + Static55.anInt1505 + " - " + Static72.anInt1801, null);
			Static25.method460();
		} catch (@Pc(4299) IOException local4299) {
			Static67.method1198();
		} catch (@Pc(4303) Exception local4303) {
			@Pc(4343) String local4343 = "T2 - " + Static121.anInt2967 + "," + Static20.anInt729 + "," + Static55.anInt1505 + " - " + Static72.anInt1801 + "," + (Static71.anInt1795 + Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0]) + "," + (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0] + Static103.anInt2610) + " - ";
			for (local139 = 0; local139 < Static72.anInt1801 && local139 < 50; local139++) {
				local4343 = local4343 + Static79.aClass1_Sub18_Sub1_3.aByteArray96[local139] + ",";
			}
			Static95.method2004(local4343, local4303);
			Static25.method460();
		}
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!q;Ljava/awt/Component;I)V")
	public static void method766(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Component arg1) {
		if (Static50.aBoolean117) {
			return;
		}
		Static41.aClass1_Sub1_Sub4_Sub1_53 = Static101.method1816(Static91.aClass39_1079, arg0, Static77.aClass39_960);
		Static71.aClass1_Sub1_Sub4_Sub1_34 = Static101.method1816(Static91.aClass39_1079, arg0, Static32.aClass39_338);
		Static70.aClass1_Sub1_Sub4_Sub1_33 = Static101.method1816(Static91.aClass39_1079, arg0, Static76.aClass39_944);
		Static121.aClass1_Sub1_Sub4_Sub1_52 = Static101.method1816(Static91.aClass39_1079, arg0, Static59.aClass39_778);
		Static128.aClass1_Sub1_Sub4_Sub1_54 = Static101.method1816(Static91.aClass39_1079, arg0, Static30.aClass39_466);
		Static75.aClass1_Sub1_Sub4_Sub1_38 = Static101.method1816(Static91.aClass39_1079, arg0, Static118.aClass39_1411);
		Static81.aClass6_15 = Static64.method1143(arg1, 479, 96);
		Static71.aClass1_Sub1_Sub4_Sub1_34.method492(0, 0);
		Static116.aClass6_19 = Static64.method1143(arg1, 172, 156);
		Static15.method1510();
		Static70.aClass1_Sub1_Sub4_Sub1_33.method492(0, 0);
		Static121.aClass6_21 = Static64.method1143(arg1, 190, 261);
		Static41.aClass1_Sub1_Sub4_Sub1_53.method492(0, 0);
		Static79.aClass6_17 = Static64.method1143(arg1, 512, 334);
		Static15.method1510();
		Static89.aClass6_16 = Static64.method1143(arg1, 496, 50);
		Static128.aClass6_22 = Static64.method1143(arg1, 269, 37);
		Static81.aClass6_14 = Static64.method1143(arg1, 249, 45);
		@Pc(114) Class1_Sub1_Sub4_Sub4 local114 = Static67.method1204(arg0, Static91.aClass39_1079, Static77.aClass39_956);
		Static22.aClass6_6 = Static64.method1143(arg1, local114.anInt2156, local114.anInt2157);
		local114.method1520(0, 0);
		@Pc(132) Class1_Sub1_Sub4_Sub4 local132 = Static67.method1204(arg0, Static91.aClass39_1079, Static29.aClass39_448);
		Static25.aClass6_7 = Static64.method1143(arg1, local132.anInt2156, local132.anInt2157);
		local132.method1520(0, 0);
		@Pc(150) Class1_Sub1_Sub4_Sub4 local150 = Static67.method1204(arg0, Static91.aClass39_1079, Static77.aClass39_959);
		Static47.aClass6_11 = Static64.method1143(arg1, local150.anInt2156, local150.anInt2157);
		local150.method1520(0, 0);
		@Pc(168) Class1_Sub1_Sub4_Sub4 local168 = Static67.method1204(arg0, Static91.aClass39_1079, Static45.aClass39_606);
		Static21.aClass6_5 = Static64.method1143(arg1, local168.anInt2156, local168.anInt2157);
		local168.method1520(0, 0);
		@Pc(186) Class1_Sub1_Sub4_Sub4 local186 = Static67.method1204(arg0, Static91.aClass39_1079, Static88.aClass39_1057);
		Static44.aClass6_10 = Static64.method1143(arg1, local186.anInt2156, local186.anInt2157);
		local186.method1520(0, 0);
		@Pc(204) Class1_Sub1_Sub4_Sub4 local204 = Static67.method1204(arg0, Static91.aClass39_1079, Static79.aClass39_1221);
		Static51.aClass6_12 = Static64.method1143(arg1, local204.anInt2156, local204.anInt2157);
		local204.method1520(0, 0);
		@Pc(222) Class1_Sub1_Sub4_Sub4 local222 = Static67.method1204(arg0, Static91.aClass39_1079, Static92.aClass39_1106);
		Static33.aClass6_8 = Static64.method1143(arg1, local222.anInt2156, local222.anInt2157);
		local222.method1520(0, 0);
		@Pc(240) Class1_Sub1_Sub4_Sub4 local240 = Static67.method1204(arg0, Static91.aClass39_1079, Static39.aClass39_551);
		Static35.aClass6_9 = Static64.method1143(arg1, local240.anInt2156, local240.anInt2157);
		local240.method1520(0, 0);
		@Pc(258) Class1_Sub1_Sub4_Sub4 local258 = Static67.method1204(arg0, Static91.aClass39_1079, Static67.aClass39_854);
		Static118.aClass6_20 = Static64.method1143(arg1, local258.anInt2156, local258.anInt2157);
		local258.method1520(0, 0);
		Static21.aClass1_Sub1_Sub4_Sub1_14 = Static101.method1816(Static91.aClass39_1079, arg0, Static13.aClass39_282);
		Static99.aClass1_Sub1_Sub4_Sub1_45 = Static101.method1816(Static91.aClass39_1079, arg0, Static124.aClass39_1489);
		Static79.aClass1_Sub1_Sub4_Sub1_47 = Static101.method1816(Static91.aClass39_1079, arg0, Static124.aClass39_1497);
		Static72.aClass1_Sub1_Sub4_Sub1_35 = Static21.aClass1_Sub1_Sub4_Sub1_14.method493();
		Static72.aClass1_Sub1_Sub4_Sub1_35.method496();
		Static36.aClass1_Sub1_Sub4_Sub1_22 = Static99.aClass1_Sub1_Sub4_Sub1_45.method493();
		Static36.aClass1_Sub1_Sub4_Sub1_22.method496();
		Static51.aClass1_Sub1_Sub4_Sub1_28 = Static21.aClass1_Sub1_Sub4_Sub1_14.method493();
		Static51.aClass1_Sub1_Sub4_Sub1_28.method495();
		Static76.aClass1_Sub1_Sub4_Sub1_39 = Static99.aClass1_Sub1_Sub4_Sub1_45.method493();
		Static76.aClass1_Sub1_Sub4_Sub1_39.method495();
		Static35.aClass1_Sub1_Sub4_Sub1_21 = Static79.aClass1_Sub1_Sub4_Sub1_47.method493();
		Static35.aClass1_Sub1_Sub4_Sub1_21.method495();
		Static86.aClass1_Sub1_Sub4_Sub1_41 = Static21.aClass1_Sub1_Sub4_Sub1_14.method493();
		Static86.aClass1_Sub1_Sub4_Sub1_41.method496();
		Static86.aClass1_Sub1_Sub4_Sub1_41.method495();
		Static98.aClass1_Sub1_Sub4_Sub1_44 = Static99.aClass1_Sub1_Sub4_Sub1_45.method493();
		Static98.aClass1_Sub1_Sub4_Sub1_44.method496();
		Static98.aClass1_Sub1_Sub4_Sub1_44.method495();
		Static9.aClass1_Sub1_Sub4_Sub1Array12 = Static3.method72(arg0, Static52.aClass39_696, Static91.aClass39_1079);
		Static21.anIntArray108 = new int[33];
		Static20.anIntArray106 = new int[151];
		Static121.anIntArray463 = new int[151];
		Static97.anIntArray480 = new int[33];
		@Pc(351) int local351;
		@Pc(353) int local353;
		@Pc(355) int local355;
		for (@Pc(347) int local347 = 0; local347 < 33; local347++) {
			local351 = 999;
			local353 = 0;
			for (local355 = 0; local355 < 34; local355++) {
				if (Static70.aClass1_Sub1_Sub4_Sub1_33.aByteArray24[local347 * Static70.aClass1_Sub1_Sub4_Sub1_33.anInt869 + local355] == 0) {
					if (local351 == 999) {
						local351 = local355;
					}
				} else if (local351 != 999) {
					local353 = local355;
					break;
				}
			}
			Static21.anIntArray108[local347] = local351;
			Static97.anIntArray480[local347] = local353 - local351;
		}
		for (local351 = 5; local351 < 156; local351++) {
			local353 = 999;
			local355 = 0;
			for (@Pc(414) int local414 = 25; local414 < 172; local414++) {
				if (Static70.aClass1_Sub1_Sub4_Sub1_33.aByteArray24[local414 + local351 * Static70.aClass1_Sub1_Sub4_Sub1_33.anInt869] == 0 && (local414 > 34 || local351 > 34)) {
					if (local353 == 999) {
						local353 = local414;
					}
				} else if (local353 != 999) {
					local355 = local414;
					break;
				}
			}
			Static121.anIntArray463[local351 - 5] = local353 - 25;
			Static20.anIntArray106[local351 - 5] = local355 - local353;
		}
		Static50.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method767() {
		Static14.aClass33_7.method1034();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII[Lclient!a;I)Z")
	public static boolean method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class1_Sub1_Sub1[] arg7, @OriginalArg(9) int arg8) {
		Static15.method1513(arg8, arg1, arg6, arg2);
		@Pc(8) boolean local8 = true;
		for (@Pc(14) int local14 = 0; local14 < arg7.length; local14++) {
			@Pc(20) Class1_Sub1_Sub1 local20 = arg7[local14];
			if (local20 != null && (arg5 == local20.anInt102 || arg5 == -1412584499 && local20 == Static66.aClass1_Sub1_Sub1_3)) {
				if (local20.anInt93 > 0) {
					Static58.method1033(local20);
				}
				@Pc(50) int local50 = arg8 + local20.anInt81 - arg0;
				@Pc(53) int local53 = local20.anInt96;
				@Pc(62) int local62 = local20.anInt110 + arg1 - arg4;
				@Pc(92) int local92;
				@Pc(94) int local94;
				@Pc(125) int[] local125;
				@Pc(226) int local226;
				@Pc(217) int local217;
				@Pc(242) int local242;
				@Pc(236) int local236;
				if (Static66.aClass1_Sub1_Sub1_3 == local20) {
					if (arg5 != -1412584499 && !local20.aBoolean11) {
						Static102.anInt2581 = arg4 - arg1;
						Static75.anInt1893 = arg0 - arg8;
						Static50.aClass1_Sub1_Sub1Array2 = arg7;
						continue;
					}
					@Pc(88) Class1_Sub1_Sub1 local88 = Static13.method287(local20);
					if (local88 == null) {
						Static66.aClass1_Sub1_Sub1_3 = null;
					} else {
						local92 = Static29.anInt971;
						local94 = Static3.anInt150;
						if (Static1.anInt59 == 0) {
							local92 -= 4;
							local94 -= 4;
						}
						if (Static1.anInt59 == 1) {
							local94 -= 205;
							local92 -= 553;
						}
						if (Static1.anInt59 == 2) {
							local92 -= 17;
							local94 -= 357;
						}
						local92 -= Static25.anInt844;
						local94 -= Static17.anInt583;
						local125 = Static82.method1397(local88);
						if (local125[0] > local92) {
							local92 = local125[0];
						}
						@Pc(146) Class1_Sub1_Sub1 local146 = Static102.aClass1_Sub1_Sub1ArrayArray1[local20.anInt72 >> 16][local20.anInt102 & 0xFFFF];
						if (local94 < local125[1]) {
							local94 = local125[1];
						}
						if (local88.anInt82 + local125[1] < local94 - -local20.anInt82) {
							local94 = local88.anInt82 + local125[1] - local20.anInt82;
						}
						if (local20.anInt101 + local92 > local88.anInt101 + local125[0]) {
							local92 = local125[0] + local88.anInt101 - local20.anInt101;
						}
						@Pc(206) int[] local206 = Static82.method1397(local146);
						local217 = local94 + local146.anInt95 - local206[1];
						local226 = local92 + local146.anInt87 - local206[0];
						if (!local20.aBoolean11) {
							local53 = 128;
						}
						local236 = local217 - local20.anInt110;
						local242 = local226 - local20.anInt81;
						if (local242 <= local20.anInt68 && -local20.anInt68 <= local242 && local236 <= local20.anInt68 && local236 >= -local20.anInt68 && !Static90.aBoolean178) {
							local242 = 0;
							local236 = 0;
						} else if (local20.anInt65 >= Static13.anInt525 && !Static90.aBoolean178) {
							local236 = 0;
							local242 = 0;
						}
						local50 += local242;
						local62 += local236;
					}
				}
				if ((!local20.aBoolean14 || local50 <= Static15.anInt2155 && local62 <= Static15.anInt2150 && local50 + local20.anInt101 >= Static15.anInt2151 && local20.anInt82 + local62 >= Static15.anInt2153) && (!local20.aBoolean14 || !Static96.method1613(local20))) {
					if (local20.anInt91 == 0) {
						if (!local20.aBoolean14 && Static96.method1613(local20) && !Static81.method1388(arg3, local14)) {
							continue;
						}
						if (!local20.aBoolean14) {
							if (local20.anInt99 - local20.anInt82 < local20.anInt95) {
								local20.anInt95 = local20.anInt99 - local20.anInt82;
							}
							if (local20.anInt95 < 0) {
								local20.anInt95 = 0;
							}
						}
						local8 &= method772(local20.anInt87, local62, local20.anInt82 + local62, arg3, local20.anInt95, local20.anInt72, local20.anInt101 + local50, arg7, local50);
						if (local20.aClass1_Sub1_Sub1Array1 != null) {
							local8 &= method772(local20.anInt87, local62, local20.anInt82 + local62, arg3, local20.anInt95, local20.anInt72, local20.anInt101 + local50, local20.aClass1_Sub1_Sub1Array1, local50);
						}
						Static15.method1513(arg8, arg1, arg6, arg2);
						if (local20.anInt99 > local20.anInt82 && !local20.aBoolean14) {
							Static26.method525(local62, local20.anInt95, local20.anInt99, local20.anInt82, local50 + local20.anInt101);
						}
					}
					if (local20.anInt91 != 1) {
						@Pc(773) int local773;
						@Pc(484) int local484;
						@Pc(502) int local502;
						@Pc(511) int local511;
						@Pc(699) int local699;
						if (local20.anInt91 == 2) {
							local484 = 0;
							for (local92 = 0; local92 < local20.anInt82; local92++) {
								for (local94 = 0; local94 < local20.anInt101; local94++) {
									local502 = local50 + (local20.anInt80 + 32) * local94;
									local511 = local92 * (local20.anInt52 + 32) + local62;
									if (local484 < 20) {
										local502 += local20.anIntArray12[local484];
										local511 += local20.anIntArray11[local484];
									}
									if (local20.anIntArray9[local484] > 0) {
										local217 = local20.anIntArray9[local484] - 1;
										if (Static15.anInt2151 - 32 < local502 && Static15.anInt2155 > local502 && Static15.anInt2153 - 32 < local511 && local511 < Static15.anInt2150 || Static77.anInt1932 != 0 && Static57.anInt1549 == local484) {
											@Pc(636) Class1_Sub1_Sub4_Sub4 local636;
											if (Static89.anInt2107 == 1 && local484 == Static52.anInt1456 && local20.anInt72 == Static62.anInt2928) {
												local636 = Static117.method2031(local20.anIntArray14[local484], 2, 0, false, local217);
											} else {
												local636 = Static117.method2031(local20.anIntArray14[local484], 1, 3153952, false, local217);
											}
											if (local636 == null) {
												local8 = false;
											} else if (Static77.anInt1932 != 0 && Static57.anInt1549 == local484 && Static98.anInt2391 == local20.anInt72) {
												local699 = Static29.anInt971 - Static65.anInt1718;
												if (local699 < 5 && local699 > -5) {
													local699 = 0;
												}
												local226 = Static3.anInt150 - Static8.anInt426;
												if (local226 < 5 && local226 > -5) {
													local226 = 0;
												}
												if (Static32.anInt692 < 5) {
													local699 = 0;
													local226 = 0;
												}
												local636.method1534(local699 + local502, local511 - -local226, 128);
												if (arg5 != -1) {
													@Pc(750) Class1_Sub1_Sub1 local750 = arg7[arg5 & 0xFFFF];
													if (Static15.anInt2153 > local511 + local226 && local750.anInt95 > 0) {
														local773 = (Static15.anInt2153 - local226 - local511) * Static107.anInt2687 / 3;
														if (Static107.anInt2687 * 10 < local773) {
															local773 = Static107.anInt2687 * 10;
														}
														if (local773 > local750.anInt95) {
															local773 = local750.anInt95;
														}
														local750.anInt95 -= local773;
														Static8.anInt426 += local773;
													}
													if (local226 + local511 + 32 > Static15.anInt2150 && local750.anInt95 < local750.anInt99 - local750.anInt82) {
														local773 = (local226 + local511 + 32 - Static15.anInt2150) * Static107.anInt2687 / 3;
														if (Static107.anInt2687 * 10 < local773) {
															local773 = Static107.anInt2687 * 10;
														}
														if (local773 > local750.anInt99 - local750.anInt95 - local750.anInt82) {
															local773 = local750.anInt99 - local750.anInt95 - local750.anInt82;
														}
														local750.anInt95 += local773;
														Static8.anInt426 -= local773;
													}
												}
											} else if (Static91.anInt2127 != 0 && Static113.anInt2825 == local484 && local20.anInt72 == Static79.anInt2480) {
												local636.method1534(local502, local511, 128);
											} else {
												local636.method1539(local502, local511);
											}
										}
									} else if (local20.anIntArray16 != null && local484 < 20) {
										@Pc(547) Class1_Sub1_Sub4_Sub4 local547 = local20.method42(local484);
										if (local547 != null) {
											local547.method1539(local502, local511);
										} else if (Static63.aBoolean143) {
											local8 = false;
										}
									}
									local484++;
								}
							}
						} else if (local20.anInt91 == 3) {
							if (Static98.method1719(local20)) {
								local484 = local20.anInt48;
								if (Static81.method1388(arg3, local14) && local20.anInt83 != 0) {
									local484 = local20.anInt83;
								}
							} else {
								local484 = local20.anInt108;
								if (Static81.method1388(arg3, local14) && local20.anInt109 != 0) {
									local484 = local20.anInt109;
								}
							}
							if (local53 == 0) {
								if (local20.aBoolean10) {
									Static15.method1503(local50, local62, local20.anInt101, local20.anInt82, local484);
								} else {
									Static15.method1504(local50, local62, local20.anInt101, local20.anInt82, local484);
								}
							} else if (local20.aBoolean10) {
								Static15.method1516(local50, local62, local20.anInt101, local20.anInt82, local484, 256 - (local53 & 0xFF));
							} else {
								Static15.method1512(local50, local62, local20.anInt101, local20.anInt82, local484, 256 - (local53 & 0xFF));
							}
						} else {
							@Pc(1018) Class1_Sub1_Sub4_Sub3 local1018;
							if (local20.anInt91 == 4) {
								local1018 = local20.method48();
								if (local1018 != null) {
									@Pc(1029) Class39 local1029 = local20.aClass39_30;
									if (Static98.method1719(local20)) {
										local92 = local20.anInt48;
										if (Static81.method1388(arg3, local14) && local20.anInt83 != 0) {
											local92 = local20.anInt83;
										}
										if (local20.aClass39_38.method1175() > 0) {
											local1029 = local20.aClass39_38;
										}
									} else {
										local92 = local20.anInt108;
										if (Static81.method1388(arg3, local14) && local20.anInt109 != 0) {
											local92 = local20.anInt109;
										}
									}
									if (local20.aBoolean14 && local20.anInt97 != -1) {
										@Pc(1087) Class1_Sub1_Sub17 local1087 = Static8.method224(local20.anInt97);
										local1029 = local1087.aClass39_1321;
										if (local1029 == null) {
											local1029 = Static16.aClass39_1218;
										}
										if ((local1087.anInt2755 == 1 || local20.anInt47 != 1) && local20.anInt47 != -1) {
											local1029 = Static30.method601(new Class39[] { local1029, Static56.aClass39_743, Static31.method604(local20.anInt47) });
										}
									}
									if (Static122.anInt2982 == local20.anInt72 && Static49.anInt1370 == local20.anInt46) {
										local92 = local20.anInt108;
										local1029 = Static63.aClass39_808;
									}
									if (Static15.anInt2152 == 479) {
										if (local92 == 16776960) {
											local92 = 255;
										}
										if (local92 == 49152) {
											local92 = 16777215;
										}
									}
									local1029 = Static63.method1137(local1029, local20);
									local1018.method760(local1029, local50, local62, local20.anInt101, local20.anInt82, local92, local20.aBoolean13 ? 0 : -1, local20.anInt57, local20.anInt117, local20.anInt56);
								} else if (Static63.aBoolean143) {
									local8 = false;
								}
							} else {
								@Pc(1435) int local1435;
								if (local20.anInt91 == 5) {
									@Pc(1213) Class1_Sub1_Sub4_Sub4 local1213;
									if (local20.aBoolean14) {
										if (local20.anInt97 == -1) {
											local1213 = local20.method47(false);
										} else {
											local1213 = Static117.method2031(local20.anInt47, local20.anInt61, local20.anInt103, false, local20.anInt97);
										}
										if (local1213 != null) {
											local92 = local1213.anInt2158;
											local94 = local1213.anInt2161;
											if (local20.aBoolean17) {
												local125 = new int[4];
												Static15.method1515(local125);
												local511 = local50;
												if (local50 < local125[0]) {
													local511 = local125[0];
												}
												local699 = local62;
												if (local125[1] > local62) {
													local699 = local125[1];
												}
												local217 = local20.anInt82 + local62;
												local226 = local20.anInt101 + local50;
												if (local125[2] < local226) {
													local226 = local125[2];
												}
												if (local217 > local125[3]) {
													local217 = local125[3];
												}
												Static15.method1513(local511, local699, local226, local217);
												local242 = (local92 + local20.anInt101 - 1) / local92;
												local236 = (local94 + local20.anInt82 - 1) / local94;
												for (local773 = 0; local773 < local242; local773++) {
													for (local1435 = 0; local1435 < local236; local1435++) {
														if (local20.anInt112 != 0) {
															local1213.method1533(local50 + local773 * local92 + local92 / 2, local94 / 2 + local1435 * local94 + local62, local20.anInt112, 4096);
														} else if (local53 == 0) {
															local1213.method1539(local50 + local773 * local92, local1435 * local94 + local62);
														} else {
															local1213.method1534(local92 * local773 + local50, local62 + local1435 * local94, 256 - (local53 & 0xFF));
														}
													}
												}
												Static15.method1507(local125);
											} else {
												local502 = local20.anInt101 * 4096 / local92;
												if (local20.anInt112 != 0) {
													local1213.method1533(local20.anInt101 / 2 + local50, local20.anInt82 / 2 + local62, local20.anInt112, local502);
												} else if (local53 != 0) {
													local1213.method1530(local50, local62, local20.anInt101, local20.anInt82, 256 - (local53 & 0xFF));
												} else if (local92 == local20.anInt101 && local94 == local20.anInt82) {
													local1213.method1539(local50, local62);
												} else {
													local1213.method1544(local50, local62, local20.anInt101, local20.anInt82);
												}
											}
										} else if (Static63.aBoolean143) {
											local8 = false;
										}
									} else {
										local1213 = local20.method47(Static98.method1719(local20));
										if (local1213 != null) {
											local1213.method1539(local50, local62);
										} else if (Static63.aBoolean143) {
											local8 = false;
										}
									}
								} else {
									@Pc(1619) Class1_Sub1_Sub17 local1619;
									if (local20.anInt91 == 6) {
										@Pc(1531) boolean local1531 = Static98.method1719(local20);
										if (local1531) {
											local92 = local20.anInt118;
										} else {
											local92 = local20.anInt76;
										}
										@Pc(1543) Class1_Sub1_Sub2_Sub7 local1543 = null;
										local502 = 0;
										if (local20.anInt97 != -1) {
											local1619 = Static8.method224(local20.anInt97);
											if (local1619 != null) {
												local1619 = local1619.method1913(local20.anInt47);
												local1543 = local1619.method1916(1);
												if (local1543 == null) {
													local8 = false;
												} else {
													local1543.method1371();
													local502 = local1543.anInt2467 / 2;
												}
											}
										} else if (local20.anInt100 == 5) {
											if (local20.anInt66 == 0) {
												local1543 = Static112.aClass28_2.method866(-1, -1, null, null);
											} else {
												local1543 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1790();
											}
										} else if (local92 == -1) {
											local1543 = local20.method38(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1, local1531, -1, null);
											if (local1543 == null && Static63.aBoolean143) {
												local8 = false;
											}
										} else {
											@Pc(1581) Class1_Sub1_Sub7 local1581 = Static82.method1398(local92);
											local1543 = local20.method38(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass28_1, local1531, local20.anInt98, local1581);
											if (local1543 == null && Static63.aBoolean143) {
												local8 = false;
											}
										}
										Static27.method559(local20.anInt101 / 2 + local50, local20.anInt82 / 2 + local62);
										local511 = local20.anInt88 * Class1_Sub1_Sub4_Sub2.anIntArray138[local20.anInt54] >> 16;
										local699 = Class1_Sub1_Sub4_Sub2.anIntArray142[local20.anInt54] * local20.anInt88 >> 16;
										if (local1543 != null) {
											if (local20.aBoolean14) {
												local1543.method1371();
												if (local20.aBoolean18) {
													local1543.method1366(local20.anInt89, local20.anInt67, local20.anInt54, local20.anInt114, local20.anInt69 + local502 + local511, local20.anInt69 + local699, local20.anInt88);
												} else {
													local1543.method1378(local20.anInt89, local20.anInt67, local20.anInt54, local20.anInt114, local20.anInt69 + local511 + local502, local20.anInt69 + local699);
												}
											} else {
												local1543.method1378(local20.anInt89, 0, local20.anInt54, 0, local511, local699);
											}
										}
										Static27.method567();
									} else {
										if (local20.anInt91 == 7) {
											local1018 = local20.method48();
											if (local1018 == null) {
												if (Static63.aBoolean143) {
													local8 = false;
												}
												continue;
											}
											local92 = 0;
											for (local94 = 0; local94 < local20.anInt82; local94++) {
												for (local502 = 0; local502 < local20.anInt101; local502++) {
													if (local20.anIntArray9[local92] > 0) {
														local1619 = Static8.method224(local20.anIntArray9[local92] - 1);
														@Pc(1798) Class39 local1798 = local1619.aClass39_1321;
														if (local1798 == null) {
															local1798 = Static16.aClass39_1218;
														}
														if (local1619.anInt2755 == 1 || local20.anIntArray14[local92] != 1) {
															local1798 = Static30.method601(new Class39[] { local1798, Static56.aClass39_743, Static31.method604(local20.anIntArray14[local92]) });
														}
														local226 = (local20.anInt80 + 115) * local502 + local50;
														local217 = local94 * (local20.anInt52 + 12) + local62;
														if (local20.anInt57 == 0) {
															local1018.method753(local1798, local226, local217, local20.anInt108, local20.aBoolean13 ? 0 : -1);
														} else if (local20.anInt57 == 1) {
															local1018.method741(local1798, local226 + local20.anInt101 / 2, local217, local20.anInt108, local20.aBoolean13 ? 0 : -1);
														} else {
															local1018.method759(local1798, local226 + local20.anInt101 - 1, local217, local20.anInt108, local20.aBoolean13 ? 0 : -1);
														}
													}
													local92++;
												}
											}
										}
										if (local20.anInt91 == 8 && Static30.method598(local14, arg3) && Static26.anInt895 == Static16.anInt2472) {
											@Pc(1956) Class1_Sub1_Sub4_Sub3 local1956 = Static93.aClass1_Sub1_Sub4_Sub3_3;
											local484 = 0;
											local92 = 0;
											@Pc(1963) Class39 local1963 = local20.aClass39_30;
											local1963 = Static63.method1137(local1963, local20);
											@Pc(1985) Class39 local1985;
											while (local1963.method1175() > 0) {
												local699 = local1963.method1166(Static119.aClass39_1418);
												if (local699 == -1) {
													local1985 = local1963;
													local1963 = Static8.aClass39_147;
												} else {
													local1985 = local1963.method1173(local699, 0);
													local1963 = local1963.method1181(local699 + 4);
												}
												local226 = local1956.method755(local1985);
												local92 += local1956.anInt1203 + 1;
												if (local484 < local226) {
													local484 = local226;
												}
											}
											local484 += 6;
											local699 = local20.anInt101 + local50 - local484 - 5;
											local92 += 7;
											if (local699 < local50 + 5) {
												local699 = local50 + 5;
											}
											if (local484 + local699 > arg6) {
												local699 = arg6 - local484;
											}
											local226 = local20.anInt82 + local62 + 5;
											if (arg2 < local92 + local226) {
												local226 = arg2 - local92;
											}
											Static15.method1503(local699, local226, local484, local92, 16777120);
											Static15.method1504(local699, local226, local484, local92, 0);
											local217 = local1956.anInt1203 + local226 + 2;
											local1963 = local20.aClass39_30;
											local1963 = Static63.method1137(local1963, local20);
											while (local1963.method1175() > 0) {
												local242 = local1963.method1166(Static119.aClass39_1418);
												if (local242 == -1) {
													local1985 = local1963;
													local1963 = Static8.aClass39_147;
												} else {
													local1985 = local1963.method1173(local242, 0);
													local1963 = local1963.method1181(local242 + 4);
												}
												local1956.method753(local1985, local699 + 3, local217, 0, -1);
												local217 += local1956.anInt1203 + 1;
											}
										}
										if (local20.anInt91 == 9) {
											if (local20.anInt77 == 1) {
												Static15.method1514(local50, local62, local50 + local20.anInt101, local62 - -local20.anInt82, local20.anInt108);
											} else {
												local484 = local20.anInt101 >= 0 ? local20.anInt101 : -local20.anInt101;
												local92 = local20.anInt82 < 0 ? -local20.anInt82 : local20.anInt82;
												local94 = local484;
												if (local92 > local484) {
													local94 = local92;
												}
												if (local94 != 0) {
													local502 = (local20.anInt101 << 16) / local94;
													local511 = (local20.anInt82 << 16) / local94;
													if (local502 >= local511) {
														local502 = -local502;
													} else {
														local511 = -local511;
													}
													local699 = local20.anInt77 * local511 >> 17;
													local217 = local20.anInt77 * local502 >> 17;
													local226 = local20.anInt77 * local511 + 1 >> 17;
													local242 = local20.anInt77 * local502 + 1 >> 17;
													local236 = local50 + local699;
													local773 = local50 - local226;
													local1435 = local50 + local20.anInt101 - local226;
													@Pc(2306) int local2306 = local699 + local20.anInt101 + local50;
													@Pc(2310) int local2310 = local217 + local62;
													@Pc(2317) int local2317 = local62 + local20.anInt82 - local242;
													@Pc(2321) int local2321 = local62 - local242;
													@Pc(2328) int local2328 = local217 + local62 + local20.anInt82;
													Static27.method569(local236, local773, local1435);
													Static27.method571(local2310, local2321, local2317, local236, local773, local1435, local20.anInt108);
													Static27.method569(local236, local1435, local2306);
													Static27.method571(local2310, local2317, local2328, local236, local1435, local2306, local20.anInt108);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	public static int method776() {
		@Pc(7) int local7 = 3;
		if (Static104.anInt2640 < 310) {
			@Pc(23) int local23 = Static28.anInt2564 >> 7;
			@Pc(27) int local27 = Static62.anInt2932 >> 7;
			if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][local23][local27] & 0x4) != 0) {
				local7 = Static9.anInt2983;
			}
			@Pc(47) int local47 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7;
			@Pc(58) int local58;
			if (local23 < local47) {
				local58 = local47 - local23;
			} else {
				local58 = local23 - local47;
			}
			@Pc(69) int local69 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7;
			@Pc(77) int local77;
			if (local69 <= local27) {
				local77 = local27 - local69;
			} else {
				local77 = local69 - local27;
			}
			@Pc(97) int local97;
			@Pc(99) int local99;
			if (local77 >= local58) {
				local97 = local58 * 65536 / local77;
				local99 = 32768;
				while (local27 != local69) {
					local99 += local97;
					if (local27 < local69) {
						local27++;
					} else if (local69 < local27) {
						local27--;
					}
					if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][local23][local27] & 0x4) != 0) {
						local7 = Static9.anInt2983;
					}
					if (local99 >= 65536) {
						local99 -= 65536;
						if (local23 < local47) {
							local23++;
						} else if (local23 > local47) {
							local23--;
						}
						if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][local23][local27] & 0x4) != 0) {
							local7 = Static9.anInt2983;
						}
					}
				}
			} else {
				local99 = 32768;
				local97 = local77 * 65536 / local58;
				while (local47 != local23) {
					local99 += local97;
					if (local23 < local47) {
						local23++;
					} else if (local47 < local23) {
						local23--;
					}
					if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][local23][local27] & 0x4) != 0) {
						local7 = Static9.anInt2983;
					}
					if (local99 >= 65536) {
						local99 -= 65536;
						if (local69 > local27) {
							local27++;
						} else if (local69 < local27) {
							local27--;
						}
						if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][local23][local27] & 0x4) != 0) {
							local7 = Static9.anInt2983;
						}
					}
				}
			}
		}
		if ((Static51.aByteArrayArrayArray3[Static9.anInt2983][Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7][Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7] & 0x4) != 0) {
			local7 = Static9.anInt2983;
		}
		return local7;
	}
}
