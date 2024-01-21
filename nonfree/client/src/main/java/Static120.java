import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!ie;")
	public static Class35 aClass35_31;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_14;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 aClass1_Sub1_Sub2_Sub3_Sub1_6;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private static int anInt2859;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_1458 = Static9.method266("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_1469 = Static9.method266("");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_1459 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_1460 = Static9.method266("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1461 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1462 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_1463 = Static9.method266("<img=0>");

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_1464 = Static9.method266("va");

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
	public static int[] anIntArray354 = new int[1000];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1465 = Static9.method266("M");

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_1466 = Static9.method266(" <col=ffff00>");

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_1467 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1468 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!id;")
	public static Class34 aClass34_1470 = aClass34_1469;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_1471 = Static9.method266(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!id;")
	public static Class34 aClass34_1472 = Static9.method266("Art");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	private static void method1907() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(46) int local46;
		if (Static87.anInt2260 == 15) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local23 = Static128.anInt3002 + (local14 >> 4 & 0x7);
			local30 = anInt2859 + (local14 & 0x7);
			local34 = Static51.aClass1_Sub19_Sub1_4.method2076();
			local38 = Static51.aClass1_Sub19_Sub1_4.method2066();
			local42 = local38 >> 2;
			local46 = Static50.anIntArray153[local42];
			local50 = local38 & 0x3;
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				Static60.method1036(Static42.anInt1208, -1, local30, local34, local23, 0, local50, local46, local42);
			}
			return;
		}
		@Pc(140) int local140;
		@Pc(150) int local150;
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(192) int local192;
		if (Static87.anInt2260 == 76) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2053();
			local23 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local34 = local23 & 0x3;
			local30 = local23 >> 2;
			local38 = Static50.anIntArray153[local30];
			local42 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local50 = Static128.anInt3002 + (local42 >> 4 & 0x7);
			local46 = anInt2859 + (local42 & 0x7);
			if (local50 >= 0 && local46 >= 0 && local50 < 103 && local46 < 103) {
				local140 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local50][local46];
				local150 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local50 + 1][local46];
				local162 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local50 + 1][local46 + 1];
				local172 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local50][local46 + 1];
				if (local38 == 0) {
					@Pc(183) Class50 local183 = Static39.aClass44_1.method1146(Static42.anInt1208, local50, local46);
					if (local183 != null) {
						local192 = local183.anInt2078 >> 14 & 0x7FFF;
						if (local30 == 2) {
							local183.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub7(local192, 2, local34 + 4, local140, local150, local162, local172, local14, false, local183.aClass1_Sub1_Sub1_3);
							local183.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub7(local192, 2, local34 + 1 & 0x3, local140, local150, local162, local172, local14, false, local183.aClass1_Sub1_Sub1_4);
						} else {
							local183.aClass1_Sub1_Sub1_3 = new Class1_Sub1_Sub1_Sub7(local192, local30, local34, local140, local150, local162, local172, local14, false, local183.aClass1_Sub1_Sub1_3);
						}
					}
				}
				if (local38 == 1) {
					@Pc(262) Class29 local262 = Static39.aClass44_1.method1159(Static42.anInt1208, local50, local46);
					if (local262 != null) {
						local262.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub7(local262.anInt1464 >> 14 & 0x7FFF, 4, 0, local140, local150, local162, local172, local14, false, local262.aClass1_Sub1_Sub1_2);
					}
				}
				if (local38 == 2) {
					if (local30 == 11) {
						local30 = 10;
					}
					@Pc(303) Class26 local303 = Static39.aClass44_1.method1162(Static42.anInt1208, local50, local46);
					if (local303 != null) {
						local303.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub7(local303.anInt1087 >> 14 & 0x7FFF, local30, local34, local140, local150, local162, local172, local14, false, local303.aClass1_Sub1_Sub1_1);
					}
				}
				if (local38 == 3) {
					@Pc(337) Class56 local337 = Static39.aClass44_1.method1179(Static42.anInt1208, local50, local46);
					if (local337 != null) {
						local337.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub7(local337.anInt2279 >> 14 & 0x7FFF, 22, local34, local140, local150, local162, local172, local14, false, local337.aClass1_Sub1_Sub1_5);
					}
				}
			}
			return;
		}
		@Pc(416) Class1_Sub1_Sub1_Sub5 local416;
		if (Static87.anInt2260 == 25) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2093();
			local23 = Static51.aClass1_Sub19_Sub1_4.method2074();
			local30 = (local23 >> 4 & 0x7) + Static128.anInt3002;
			local34 = anInt2859 + (local23 & 0x7);
			local38 = Static51.aClass1_Sub19_Sub1_4.method2051();
			if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
				local416 = new Class1_Sub1_Sub1_Sub5();
				local416.anInt2205 = local14;
				local416.anInt2208 = local38;
				if (Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local30][local34] == null) {
					Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local30][local34] = new Class38();
				}
				Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local30][local34].method1046(local416);
				Static110.method1675(local30, local34);
			}
			return;
		}
		if (Static87.anInt2260 == 144) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local30 = (local14 & 0x7) + anInt2859;
			local23 = Static128.anInt3002 + (local14 >> 4 & 0x7);
			local34 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local38 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local42 = local38 >> 4 & 0xF;
			local46 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local50 = local38 & 0x7;
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				local140 = local42 + 1;
				if (local23 - local140 <= Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0] && Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0] <= local140 + local23 && Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0] >= local30 - local140 && local140 + local30 >= Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0] && Static66.anInt1753 != 0 && local50 > 0 && Static31.anInt924 < 50) {
					Static114.anIntArray345[Static31.anInt924] = local34;
					Static17.anIntArray66[Static31.anInt924] = local50;
					Static30.anIntArray90[Static31.anInt924] = local46;
					Static7.aClass72Array1[Static31.anInt924] = null;
					Static100.anIntArray316[Static31.anInt924] = (local23 << 16) + (local30 << 8) + local42;
					Static31.anInt924++;
				}
			}
		}
		if (Static87.anInt2260 == 164) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2066();
			local30 = anInt2859 + (local14 & 0x7);
			local23 = (local14 >> 4 & 0x7) + Static128.anInt3002;
			local34 = Static51.aClass1_Sub19_Sub1_4.method2076();
			local38 = Static51.aClass1_Sub19_Sub1_4.method2053();
			local42 = Static51.aClass1_Sub19_Sub1_4.method2051();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local42 != Static119.anInt2838) {
				@Pc(658) Class1_Sub1_Sub1_Sub5 local658 = new Class1_Sub1_Sub1_Sub5();
				local658.anInt2205 = local34;
				local658.anInt2208 = local38;
				if (Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30] == null) {
					Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30] = new Class38();
				}
				Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30].method1046(local658);
				Static110.method1675(local23, local30);
			}
		} else if (Static87.anInt2260 == 129) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local30 = anInt2859 + (local14 & 0x7);
			local23 = (local14 >> 4 & 0x7) + Static128.anInt3002;
			local34 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local38 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local42 = Static51.aClass1_Sub19_Sub1_4.method2051();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				local23 = local23 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(778) Class1_Sub1_Sub1_Sub6 local778 = new Class1_Sub1_Sub1_Sub6(local34, Static42.anInt1208, local23, local30, Static45.method1845(Static42.anInt1208, local30, local23) - local38, local42, Static73.anInt1947);
				Static95.aClass38_20.method1046(local778);
			}
		} else if (Static87.anInt2260 == 141) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local23 = Static128.anInt3002 + (local14 >> 4 & 0x7);
			local30 = anInt2859 + (local14 & 0x7);
			local34 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local38 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local42 = Static51.aClass1_Sub19_Sub1_4.method2051();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				@Pc(849) Class38 local849 = Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30];
				if (local849 != null) {
					for (@Pc(856) Class1_Sub1_Sub1_Sub5 local856 = (Class1_Sub1_Sub1_Sub5) local849.method1034(); local856 != null; local856 = (Class1_Sub1_Sub1_Sub5) local849.method1038()) {
						if (local856.anInt2208 == (local34 & 0x7FFF) && local38 == local856.anInt2205) {
							local856.anInt2205 = local42;
							break;
						}
					}
					Static110.method1675(local23, local30);
				}
			}
		} else if (Static87.anInt2260 == 41) {
			local14 = Static51.aClass1_Sub19_Sub1_4.method2066();
			local23 = (local14 >> 4 & 0x7) + Static128.anInt3002;
			local30 = (local14 & 0x7) + anInt2859;
			local34 = Static51.aClass1_Sub19_Sub1_4.method2051();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				@Pc(933) Class38 local933 = Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30];
				if (local933 != null) {
					for (local416 = (Class1_Sub1_Sub1_Sub5) local933.method1034(); local416 != null; local416 = (Class1_Sub1_Sub1_Sub5) local933.method1038()) {
						if ((local34 & 0x7FFF) == local416.anInt2208) {
							local416.method2039();
							break;
						}
					}
					if (local933.method1034() == null) {
						Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local23][local30] = null;
					}
					Static110.method1675(local23, local30);
				}
			}
		} else {
			@Pc(1046) int local1046;
			if (Static87.anInt2260 == 100) {
				local14 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local23 = (local14 >> 4 & 0x7) + Static128.anInt3002;
				local30 = (local14 & 0x7) + anInt2859;
				local34 = Static51.aClass1_Sub19_Sub1_4.method2086() + local23;
				local38 = local30 + Static51.aClass1_Sub19_Sub1_4.method2086();
				local42 = Static51.aClass1_Sub19_Sub1_4.method2064();
				local50 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local46 = Static51.aClass1_Sub19_Sub1_4.method2072() * 4;
				local140 = Static51.aClass1_Sub19_Sub1_4.method2072() * 4;
				local150 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local162 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local172 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local1046 = Static51.aClass1_Sub19_Sub1_4.method2072();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local50 != 65535) {
					local23 = local23 * 128 + 64;
					local34 = local34 * 128 + 64;
					local30 = local30 * 128 + 64;
					local38 = local38 * 128 + 64;
					@Pc(1123) Class1_Sub1_Sub1_Sub3 local1123 = new Class1_Sub1_Sub1_Sub3(local50, Static42.anInt1208, local23, local30, Static45.method1845(Static42.anInt1208, local30, local23) - local46, Static73.anInt1947 + local150, Static73.anInt1947 + local162, local172, local1046, local42, local140);
					local1123.method1290(local38, Static45.method1845(Static42.anInt1208, local38, local34) - local140, local150 + Static73.anInt1947, local34);
					Static24.aClass38_7.method1046(local1123);
				}
			} else if (Static87.anInt2260 == 239) {
				local14 = Static51.aClass1_Sub19_Sub1_4.method2092();
				local23 = local14 >> 2;
				local34 = Static50.anIntArray153[local23];
				local38 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local50 = (local38 & 0x7) + anInt2859;
				local42 = Static128.anInt3002 + (local38 >> 4 & 0x7);
				local30 = local14 & 0x3;
				if (local42 >= 0 && local50 >= 0 && local42 < 104 && local50 < 104) {
					Static60.method1036(Static42.anInt1208, -1, local50, -1, local42, 0, local30, local34, local23);
				}
			} else if (Static87.anInt2260 == 245) {
				local14 = Static51.aClass1_Sub19_Sub1_4.method2076();
				@Pc(1224) byte local1224 = Static51.aClass1_Sub19_Sub1_4.method2075();
				@Pc(1228) byte local1228 = Static51.aClass1_Sub19_Sub1_4.method2059();
				@Pc(1232) byte local1232 = Static51.aClass1_Sub19_Sub1_4.method2075();
				local38 = Static51.aClass1_Sub19_Sub1_4.method2093();
				local42 = Static51.aClass1_Sub19_Sub1_4.method2074();
				local50 = local42 >> 2;
				local46 = local42 & 0x3;
				local140 = Static50.anIntArray153[local50];
				local150 = Static51.aClass1_Sub19_Sub1_4.method2092();
				local162 = (local150 >> 4 & 0x7) + Static128.anInt3002;
				local172 = anInt2859 + (local150 & 0x7);
				local1046 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local192 = Static51.aClass1_Sub19_Sub1_4.method2051();
				@Pc(1284) byte local1284 = Static51.aClass1_Sub19_Sub1_4.method2059();
				@Pc(1295) Class1_Sub1_Sub1_Sub1_Sub1 local1295;
				if (Static119.anInt2838 == local192) {
					local1295 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else {
					local1295 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local192];
				}
				if (local1295 != null) {
					@Pc(1305) Class1_Sub1_Sub16 local1305 = Static28.method2008(local14);
					@Pc(1317) int local1317 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local162 + 1][local172 + 1];
					@Pc(1325) int local1325 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local162][local172];
					@Pc(1335) int local1335 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local162 + 1][local172];
					@Pc(1345) int local1345 = Static98.anIntArrayArrayArray4[Static42.anInt1208][local162][local172 + 1];
					@Pc(1355) Class1_Sub1_Sub1_Sub2 local1355 = local1305.method1957(local1317, local50, local1345, local1325, local1335, local46);
					if (local1355 != null) {
						@Pc(1366) byte local1366;
						if (local1224 < local1232) {
							local1366 = local1232;
							local1232 = local1224;
							local1224 = local1366;
						}
						Static60.method1036(Static42.anInt1208, local1046 + 1, local172, -1, local162, local38 + 1, 0, local140, 0);
						local1295.aClass1_Sub1_Sub1_Sub2_1 = local1355;
						local1295.anInt259 = local1046 + Static73.anInt1947;
						@Pc(1396) int local1396 = local1305.anInt2962;
						if (local1228 < local1284) {
							local1366 = local1284;
							local1284 = local1228;
							local1228 = local1366;
						}
						local1295.anInt261 = Static73.anInt1947 + local38;
						@Pc(1417) int local1417 = local1305.anInt2946;
						if (local46 == 1 || local46 == 3) {
							local1417 = local1305.anInt2962;
							local1396 = local1305.anInt2946;
						}
						local1295.anInt251 = local1417 * 64 + local172 * 128;
						local1295.anInt265 = local162 * 128 + local1396 * 64;
						local1295.anInt250 = Static45.method1845(Static42.anInt1208, local1295.anInt251, local1295.anInt265);
						local1295.anInt258 = local1232 + local162;
						local1295.anInt249 = local172 + local1284;
						local1295.anInt257 = local162 + local1224;
						local1295.anInt262 = local1228 + local172;
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1908() {
		aClass34_1463 = null;
		aClass34_1471 = null;
		aClass34_1458 = null;
		aClass34_1462 = null;
		aClass34_1459 = null;
		aClass34_1472 = null;
		aClass34_1470 = null;
		anIntArray354 = null;
		aClass34_1467 = null;
		aClass34_1468 = null;
		aClass34_1469 = null;
		aClass34_1466 = null;
		aClass34_1461 = null;
		aClass34_1460 = null;
		aClass1_Sub9_14 = null;
		aClass35_31 = null;
		aClass1_Sub1_Sub2_Sub3_Sub1_6 = null;
		aClass34_1464 = null;
		aClass34_1465 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public static int method1909(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!ae;BII)V")
	public static void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg1 * arg1 + arg3 * arg3;
		if (local15 <= 4225 || local15 >= 90000) {
			Static59.method1031(arg4, arg0, arg2, arg3, arg1);
			return;
		}
		@Pc(36) int local36 = Static132.anInt3154 + Static126.anInt2999 & 0x7FF;
		@Pc(40) int local40 = Class1_Sub1_Sub2_Sub4.anIntArray335[local36];
		@Pc(48) int local48 = local40 * 256 / (Static122.anInt2890 + 256);
		@Pc(52) int local52 = Class1_Sub1_Sub2_Sub4.anIntArray334[local36];
		@Pc(60) int local60 = local52 * 256 / (Static122.anInt2890 + 256);
		@Pc(71) int local71 = arg1 * local48 + local60 * arg3 >> 16;
		@Pc(81) int local81 = arg1 * local60 - local48 * arg3 >> 16;
		@Pc(87) double local87 = Math.atan2((double) local71, (double) local81);
		@Pc(93) int local93 = (int) (Math.sin(local87) * 63.0D);
		@Pc(99) int local99 = (int) (Math.cos(local87) * 57.0D);
		Static115.aClass1_Sub1_Sub2_Sub1_5.method196(local93 + arg0 + 94 + 4 - 10, arg4 + 83 - (local99 + 20), local87);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
	public static boolean method1911() {
		if (Static3.aClass51_1 == null) {
			return false;
		}
		@Pc(139) int local139;
		try {
			@Pc(15) int local15 = Static3.aClass51_1.method1367();
			if (local15 == 0) {
				return false;
			}
			if (Static87.anInt2260 == -1) {
				Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, 1, 0);
				local15--;
				Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
				Static87.anInt2260 = Static51.aClass1_Sub19_Sub1_4.method2100();
				Static81.anInt2134 = Static37.anIntArray111[Static87.anInt2260];
			}
			if (Static81.anInt2134 == -1) {
				if (local15 <= 0) {
					return false;
				}
				Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, 1, 0);
				local15--;
				Static81.anInt2134 = Static51.aClass1_Sub19_Sub1_4.aByteArray42[0] & 0xFF;
			}
			if (Static81.anInt2134 == -2) {
				if (local15 <= 1) {
					return false;
				}
				local15 -= 2;
				Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, 2, 0);
				Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
				Static81.anInt2134 = Static51.aClass1_Sub19_Sub1_4.method2051();
			}
			if (local15 < Static81.anInt2134) {
				return false;
			}
			Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
			Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, Static81.anInt2134, 0);
			Static38.anInt1129 = 0;
			Static71.anInt1879 = Static2.anInt273;
			Static2.anInt273 = Static32.anInt1445;
			Static32.anInt1445 = Static87.anInt2260;
			@Pc(129) int local129;
			if (Static87.anInt2260 == 233) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2051();
				Static9.anInt451 = local129;
				Static32.method907(local129);
				Static6.method228(Static9.anInt451);
				for (local139 = 0; local139 < 100; local139++) {
					Static12.aBooleanArray3[local139] = true;
				}
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(189) int local189;
			@Pc(185) long local185;
			@Pc(162) Class34 local162;
			@Pc(187) boolean local187;
			@Pc(181) Class34 local181;
			if (Static87.anInt2260 == 135) {
				local162 = Static51.aClass1_Sub19_Sub1_4.method2084();
				if (local162.method983(Static40.aClass34_541)) {
					local181 = local162.method962(local162.method981(Static100.aClass34_1251), 0);
					local185 = local181.method965();
					local187 = false;
					for (local189 = 0; local189 < Static114.anInt2736; local189++) {
						if (local185 == Static40.aLongArray3[local189]) {
							local187 = true;
							break;
						}
					}
					if (!local187 && Static97.anInt2495 == 0) {
						Static39.method685(local181, 4, Static85.aClass34_1121);
					}
				} else if (local162.method983(Static21.aClass34_367)) {
					local181 = local162.method962(local162.method981(Static100.aClass34_1251), 0);
					local185 = local181.method965();
					local187 = false;
					for (local189 = 0; local189 < Static114.anInt2736; local189++) {
						if (local185 == Static40.aLongArray3[local189]) {
							local187 = true;
							break;
						}
					}
					if (!local187 && Static97.anInt2495 == 0) {
						Static39.method685(local181, 8, Static116.aClass34_1424);
					}
				} else if (local162.method983(Static71.aClass34_901)) {
					local181 = local162.method962(local162.method981(Static100.aClass34_1251), 0);
					local187 = false;
					local185 = local181.method965();
					for (local189 = 0; local189 < Static114.anInt2736; local189++) {
						if (Static40.aLongArray3[local189] == local185) {
							local187 = true;
							break;
						}
					}
					if (!local187 && Static97.anInt2495 == 0) {
						@Pc(286) Class34 local286 = local162.method962(local162.method982() - 9, local162.method981(Static100.aClass34_1251) + 1);
						Static39.method685(local181, 8, local286);
					}
				} else if (local162.method983(Static73.aClass34_952)) {
					local181 = local162.method962(local162.method981(Static100.aClass34_1251), 0);
					local185 = local181.method965();
					local187 = false;
					for (local189 = 0; local189 < Static114.anInt2736; local189++) {
						if (local185 == Static40.aLongArray3[local189]) {
							local187 = true;
							break;
						}
					}
					if (!local187 && Static97.anInt2495 == 0) {
						Static39.method685(local181, 10, Static81.aClass34_1058);
					}
				} else {
					Static39.method685(Static81.aClass34_1058, 0, local162);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(423) Class1_Sub9 local423;
			if (Static87.anInt2260 == 149) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2042();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2093();
				local423 = Static113.method1814(local129);
				if (local423.anInt1040 != 1 || local139 != local423.anInt1027) {
					local423.anInt1040 = 1;
					local423.anInt1027 = local139;
					Static10.method277(local423);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 31) {
				for (local129 = 0; local129 < Static11.anInt494; local129++) {
					@Pc(459) Class1_Sub1_Sub4 local459 = Static100.method1666(local129);
					if (local459 != null && local459.anInt394 == 0) {
						Static84.anIntArray294[local129] = 0;
						Static39.anIntArray116[local129] = 0;
					}
				}
				Static118.method1875();
				Static5.anInt363 += 32;
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(528) int local528;
			@Pc(618) int local618;
			@Pc(502) long local502;
			@Pc(544) int local544;
			@Pc(611) int local611;
			if (Static87.anInt2260 == 219) {
				Static117.anInt696 = Static73.anInt1947;
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				if (local502 == 0L) {
					Static87.anInt2260 = -1;
					Static88.aClass1_Sub14Array1 = null;
					Static90.aClass34_1584 = null;
					Static30.anInt908 = 0;
					return true;
				}
				Static90.aClass34_1584 = Static77.method1358(local502);
				Static126.aByte10 = Static51.aClass1_Sub19_Sub1_4.method2086();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2072();
				if (local528 == 255) {
					Static87.anInt2260 = -1;
					return true;
				}
				Static30.anInt908 = local528;
				@Pc(542) Class1_Sub14[] local542 = new Class1_Sub14[100];
				for (local544 = 0; local544 < Static30.anInt908; local544++) {
					local542[local544] = new Class1_Sub14();
					local542[local544].aLong162 = Static51.aClass1_Sub19_Sub1_4.method2089();
					local542[local544].aClass34_831 = Static77.method1358(local542[local544].aLong162);
					local542[local544].anInt1769 = Static51.aClass1_Sub19_Sub1_4.method2051();
					local542[local544].aByte7 = Static51.aClass1_Sub19_Sub1_4.method2086();
					if (Static109.aLong161 == local542[local544].aLong162) {
						Static50.aByte4 = local542[local544].aByte7;
					}
				}
				local611 = Static30.anInt908;
				while (local611 > 0) {
					@Pc(615) boolean local615 = true;
					local611--;
					for (local618 = 0; local618 < local611; local618++) {
						if (local542[local618].aClass34_831.method967(local542[local618 + 1].aClass34_831) > 0) {
							local615 = false;
							@Pc(642) Class1_Sub14 local642 = local542[local618];
							local542[local618] = local542[local618 + 1];
							local542[local618 + 1] = local642;
						}
					}
					if (local615) {
						break;
					}
				}
				Static88.aClass1_Sub14Array1 = local542;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 13) {
				Static95.aBoolean129 = true;
				Static118.anInt2817 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static12.anInt546 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static65.anInt1734 = Static51.aClass1_Sub19_Sub1_4.method2051();
				Static12.anInt518 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static59.anInt1632 = Static51.aClass1_Sub19_Sub1_4.method2072();
				if (Static59.anInt1632 >= 100) {
					Static109.anInt3091 = Static12.anInt546 * 128 + 64;
					Static119.anInt2839 = Static118.anInt2817 * 128 + 64;
					Static88.anInt2285 = Static45.method1845(Static42.anInt1208, Static109.anInt3091, Static119.anInt2839) - Static65.anInt1734;
				}
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(757) long local757;
			@Pc(805) int local805;
			if (Static87.anInt2260 == 220) {
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				Static51.aClass1_Sub19_Sub1_4.method2086();
				local185 = Static51.aClass1_Sub19_Sub1_4.method2089();
				local757 = Static51.aClass1_Sub19_Sub1_4.method2051();
				@Pc(764) long local764 = (long) Static51.aClass1_Sub19_Sub1_4.method2048();
				local618 = Static51.aClass1_Sub19_Sub1_4.method2072();
				@Pc(770) boolean local770 = false;
				@Pc(776) long local776 = local764 + (local757 << 32);
				for (@Pc(778) int local778 = 0; local778 < 100; local778++) {
					if (local776 == Static44.aLongArray4[local778]) {
						local770 = true;
						break;
					}
				}
				if (local618 <= 1) {
					for (local805 = 0; local805 < Static114.anInt2736; local805++) {
						if (local502 == Static40.aLongArray3[local805]) {
							local770 = true;
							break;
						}
					}
				}
				if (!local770 && Static97.anInt2495 == 0) {
					Static44.aLongArray4[Static24.anInt817] = local776;
					Static24.anInt817 = (Static24.anInt817 + 1) % 100;
					@Pc(842) Class34 local842 = Static103.method856(Static69.method1191(Static51.aClass1_Sub19_Sub1_4).method979());
					if (local618 == 2 || local618 == 3) {
						Static2.method97(Static77.method1358(local185), local842, Static91.method1554(new Class34[] { Static3.aClass34_122, Static77.method1358(local502).method969() }), 9);
					} else if (local618 == 1) {
						Static2.method97(Static77.method1358(local185), local842, Static91.method1554(new Class34[] { Static114.aClass34_1378, Static77.method1358(local502).method969() }), 9);
					} else {
						Static2.method97(Static77.method1358(local185), local842, Static77.method1358(local502).method969(), 9);
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 101) {
				anInt2859 = Static51.aClass1_Sub19_Sub1_4.method2074();
				Static128.anInt3002 = Static51.aClass1_Sub19_Sub1_4.method2066();
				for (local129 = Static128.anInt3002; local129 < Static128.anInt3002 + 8; local129++) {
					for (local139 = anInt2859; local139 < anInt2859 + 8; local139++) {
						if (Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local129][local139] != null) {
							Static94.aClass38ArrayArrayArray1[Static42.anInt1208][local129][local139] = null;
							Static110.method1675(local129, local139);
						}
					}
				}
				for (@Pc(979) Class1_Sub3 local979 = (Class1_Sub3) Static48.aClass38_10.method1034(); local979 != null; local979 = (Class1_Sub3) Static48.aClass38_10.method1038()) {
					if (Static128.anInt3002 <= local979.anInt469 && Static128.anInt3002 + 8 > local979.anInt469 && anInt2859 <= local979.anInt484 && anInt2859 + 8 > local979.anInt484 && Static42.anInt1208 == local979.anInt483) {
						local979.anInt481 = 0;
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 195) {
				Static94.method1611();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 197) {
				Static118.method1875();
				Static112.anInt2683 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static70.anInt1849 = Static70.anInt1848;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 39) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2055();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local423 = Static113.method1814(local139);
				if (local129 != local423.anInt1014 || local129 == -1) {
					local423.anInt1014 = local129;
					local423.anInt1082 = 0;
					local423.anInt1052 = 0;
					Static10.method277(local423);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 177) {
				Static93.anInt2428 = Static51.aClass1_Sub19_Sub1_4.method2072();
				if (Static93.anInt2428 == 1) {
					Static67.anInt1766 = Static51.aClass1_Sub19_Sub1_4.method2051();
				}
				if (Static93.anInt2428 >= 2 && Static93.anInt2428 <= 6) {
					if (Static93.anInt2428 == 2) {
						Static87.anInt2261 = 64;
						Static128.anInt3014 = 64;
					}
					if (Static93.anInt2428 == 3) {
						Static87.anInt2261 = 64;
						Static128.anInt3014 = 0;
					}
					if (Static93.anInt2428 == 4) {
						Static87.anInt2261 = 64;
						Static128.anInt3014 = 128;
					}
					if (Static93.anInt2428 == 5) {
						Static128.anInt3014 = 64;
						Static87.anInt2261 = 0;
					}
					if (Static93.anInt2428 == 6) {
						Static87.anInt2261 = 128;
						Static128.anInt3014 = 64;
					}
					Static93.anInt2428 = 2;
					Static10.anInt486 = Static51.aClass1_Sub19_Sub1_4.method2051();
					Static126.anInt3000 = Static51.aClass1_Sub19_Sub1_4.method2051();
					Static6.anInt389 = Static51.aClass1_Sub19_Sub1_4.method2072();
				}
				if (Static93.anInt2428 == 10) {
					Static122.anInt2886 = Static51.aClass1_Sub19_Sub1_4.method2051();
				}
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(1216) int local1216;
			if (Static87.anInt2260 == 158) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2076();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2046();
				if (local129 == 65535) {
					local129 = -1;
				}
				local528 = Static51.aClass1_Sub19_Sub1_4.method2076();
				if (local528 == 65535) {
					local528 = -1;
				}
				local1216 = Static51.aClass1_Sub19_Sub1_4.method2046();
				for (local544 = local129; local544 <= local528; local544++) {
					@Pc(1228) long local1228 = (long) local544 + ((long) local139 << 32);
					@Pc(1233) Class1 local1233 = Static88.aClass48_10.method1340(local1228);
					if (local1233 != null) {
						local1233.method2039();
					}
					Static88.aClass48_10.method1336(local1228, new Class1_Sub12(local1216));
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 43) {
				anInt2859 = Static51.aClass1_Sub19_Sub1_4.method2074();
				Static128.anInt3002 = Static51.aClass1_Sub19_Sub1_4.method2074();
				while (Static51.aClass1_Sub19_Sub1_4.anInt3111 < Static81.anInt2134) {
					Static87.anInt2260 = Static51.aClass1_Sub19_Sub1_4.method2072();
					method1907();
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 254) {
				for (local129 = 0; local129 < Static39.anIntArray116.length; local129++) {
					if (Static84.anIntArray294[local129] != Static39.anIntArray116[local129]) {
						Static39.anIntArray116[local129] = Static84.anIntArray294[local129];
						Static64.method1108(local129);
						Static15.anIntArray57[Static5.anInt363++ & 0x1F] = local129;
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 11) {
				Static17.anInt644 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static87.anInt2260 = -1;
				Static38.anInt1125 = Static70.anInt1848;
				return true;
			}
			if (Static87.anInt2260 == 60) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local181 = Static51.aClass1_Sub19_Sub1_4.method2084();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2092();
				if (local129 >= 1 && local129 <= 8) {
					if (local181.method961(Static37.aClass34_510)) {
						local181 = null;
					}
					Static65.aClass34Array15[local129 - 1] = local181;
					Static40.aBooleanArray7[local129 - 1] = local528 == 0;
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 186) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2052();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2076();
				local528 = local139 >> 10 & 0x1F;
				local1216 = local139 >> 5 & 0x1F;
				local544 = local139 & 0x1F;
				@Pc(1436) Class1_Sub9 local1436 = Static113.method1814(local129);
				local189 = (local544 << 3) + (local1216 << 11) + (local528 << 19);
				if (local189 != local1436.anInt1034) {
					local1436.anInt1034 = local189;
					Static10.method277(local1436);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 30) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2052();
				local181 = Static51.aClass1_Sub19_Sub1_4.method2084();
				local423 = Static113.method1814(local129);
				if (!local181.method986(local423.aClass34_492)) {
					local423.aClass34_492 = local181;
					Static10.method277(local423);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(1520) Class1_Sub9 local1520;
			if (Static87.anInt2260 == 33) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2090();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2055();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2046();
				local1520 = Static113.method1814(local528);
				local189 = local1520.anInt1076 + local129;
				local544 = local1520.anInt1056 + local139;
				if (local544 != local1520.anInt1066 || local189 != local1520.anInt1085) {
					local1520.anInt1066 = local544;
					local1520.anInt1085 = local189;
					Static10.method277(local1520);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 70) {
				Static38.method679(false);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 147) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2053();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local423 = Static113.method1814(local139);
				if (local423 != null && local423.anInt1013 == 0) {
					if (local423.anInt1084 - local423.anInt1053 < local129) {
						local129 = local423.anInt1084 - local423.anInt1053;
					}
					if (local129 < 0) {
						local129 = 0;
					}
					if (local129 != local423.anInt1064) {
						local423.anInt1064 = local129;
						Static10.method277(local423);
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 29) {
				if (Static9.anInt451 != -1) {
					Static14.method348(Static9.anInt451, 0);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 16) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2046();
				@Pc(1663) Class1_Sub16 local1663 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local129);
				if (local1663 != null) {
					Static95.method1619(local1663, true);
				}
				if (Static105.aClass1_Sub9_13 != null) {
					Static10.method277(Static105.aClass1_Sub9_13);
					Static105.aClass1_Sub9_13 = null;
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 119) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2053();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2046();
				Static84.anIntArray294[local129] = local139;
				if (Static39.anIntArray116[local129] != local139) {
					Static39.anIntArray116[local129] = local139;
					Static64.method1108(local129);
				}
				Static15.anIntArray57[Static5.anInt363++ & 0x1F] = local129;
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(1736) Class1_Sub9 local1736;
			if (Static87.anInt2260 == 170) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2052();
				local1736 = Static113.method1814(local129);
				for (local528 = 0; local528 < local1736.anIntArray108.length; local528++) {
					local1736.anIntArray108[local528] = -1;
					local1736.anIntArray108[local528] = 0;
				}
				Static10.method277(local1736);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 126) {
				Static38.method679(true);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 151) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2051();
				@Pc(1788) byte local1788 = Static51.aClass1_Sub19_Sub1_4.method2057();
				Static84.anIntArray294[local129] = local1788;
				if (Static39.anIntArray116[local129] != local1788) {
					Static39.anIntArray116[local129] = local1788;
					Static64.method1108(local129);
				}
				Static15.anIntArray57[Static5.anInt363++ & 0x1F] = local129;
				Static87.anInt2260 = -1;
				return true;
			}
			@Pc(1957) int local1957;
			if (Static87.anInt2260 == 242) {
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2051();
				@Pc(1837) byte local1837 = Static51.aClass1_Sub19_Sub1_4.method2086();
				local187 = false;
				if ((Long.MIN_VALUE & local502) != 0L) {
					local187 = true;
				}
				if (local187) {
					if (Static30.anInt908 == 0) {
						Static87.anInt2260 = -1;
						return true;
					}
					local502 &= Long.MAX_VALUE;
					for (local189 = 0; Static30.anInt908 > local189 && (Static88.aClass1_Sub14Array1[local189].aLong162 != local502 || local528 != Static88.aClass1_Sub14Array1[local189].anInt1769); local189++) {
					}
					if (local189 < Static30.anInt908) {
						while (Static30.anInt908 - 1 > local189) {
							Static88.aClass1_Sub14Array1[local189] = Static88.aClass1_Sub14Array1[local189 + 1];
							local189++;
						}
						Static88.aClass1_Sub14Array1[Static30.anInt908] = null;
						Static30.anInt908--;
					}
				} else {
					@Pc(1938) Class1_Sub14 local1938 = new Class1_Sub14();
					local1938.aLong162 = local502;
					local1938.aClass34_831 = Static77.method1358(local1938.aLong162);
					local1938.aByte7 = local1837;
					local1938.anInt1769 = local528;
					for (local1957 = Static30.anInt908 - 1; local1957 >= 0; local1957--) {
						local611 = Static88.aClass1_Sub14Array1[local1957].aClass34_831.method967(local1938.aClass34_831);
						if (local611 == 0) {
							Static88.aClass1_Sub14Array1[local1957].anInt1769 = local528;
							Static88.aClass1_Sub14Array1[local1957].aByte7 = local1837;
							if (local502 == Static109.aLong161) {
								Static50.aByte4 = local1837;
							}
							Static117.anInt696 = Static73.anInt1947;
							Static87.anInt2260 = -1;
							return true;
						}
						if (local611 < 0) {
							break;
						}
					}
					if (Static30.anInt908 >= Static88.aClass1_Sub14Array1.length) {
						Static87.anInt2260 = -1;
						return true;
					}
					for (local611 = Static30.anInt908 - 1; local611 > local1957; local611--) {
						Static88.aClass1_Sub14Array1[local611 + 1] = Static88.aClass1_Sub14Array1[local611];
					}
					if (Static30.anInt908 == 0) {
						Static88.aClass1_Sub14Array1 = new Class1_Sub14[100];
					}
					Static88.aClass1_Sub14Array1[local1957 + 1] = local1938;
					if (Static109.aLong161 == local502) {
						Static50.aByte4 = local1837;
					}
					Static30.anInt908++;
				}
				Static87.anInt2260 = -1;
				Static117.anInt696 = Static73.anInt1947;
				return true;
			}
			if (Static87.anInt2260 == 169) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2042();
				local1736 = Static113.method1814(local129);
				local1736.anInt1040 = 3;
				local1736.anInt1027 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1.method357();
				Static10.method277(local1736);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 53) {
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local1216 = Static51.aClass1_Sub19_Sub1_4.method2072();
				@Pc(2114) Class34 local2114 = Static77.method1358(local502).method969();
				for (local189 = 0; local189 < Static90.anInt3112; local189++) {
					if (local502 == Static116.aLongArray6[local189]) {
						if (Static77.anIntArray242[local189] != local528) {
							Static77.anIntArray242[local189] = local528;
							if (local528 > 0) {
								Static39.method685(Static81.aClass34_1058, 5, Static91.method1554(new Class34[] { local2114, Static87.aClass34_1149 }));
							}
							if (local528 == 0) {
								Static39.method685(Static81.aClass34_1058, 5, Static91.method1554(new Class34[] { local2114, Static5.aClass34_174 }));
							}
						}
						Static15.anIntArray60[local189] = local1216;
						local2114 = null;
						break;
					}
				}
				if (local2114 != null && Static90.anInt3112 < 200) {
					Static116.aLongArray6[Static90.anInt3112] = local502;
					Static61.aClass34Array13[Static90.anInt3112] = local2114;
					Static77.anIntArray242[Static90.anInt3112] = local528;
					Static15.anIntArray60[Static90.anInt3112] = local1216;
					Static90.anInt3112++;
				}
				Static38.anInt1125 = Static70.anInt1848;
				local611 = Static90.anInt3112;
				while (local611 > 0) {
					local611--;
					@Pc(2230) boolean local2230 = true;
					for (local618 = 0; local618 < local611; local618++) {
						if (Static15.anInt614 != Static77.anIntArray242[local618] && Static77.anIntArray242[local618 + 1] == Static15.anInt614 || Static77.anIntArray242[local618] == 0 && Static77.anIntArray242[local618 + 1] != 0) {
							local2230 = false;
							@Pc(2266) int local2266 = Static77.anIntArray242[local618];
							Static77.anIntArray242[local618] = Static77.anIntArray242[local618 + 1];
							Static77.anIntArray242[local618 + 1] = local2266;
							@Pc(2284) Class34 local2284 = Static61.aClass34Array13[local618];
							Static61.aClass34Array13[local618] = Static61.aClass34Array13[local618 + 1];
							Static61.aClass34Array13[local618 + 1] = local2284;
							@Pc(2302) long local2302 = Static116.aLongArray6[local618];
							Static116.aLongArray6[local618] = Static116.aLongArray6[local618 + 1];
							Static116.aLongArray6[local618 + 1] = local2302;
							local805 = Static15.anIntArray60[local618];
							Static15.anIntArray60[local618] = Static15.anIntArray60[local618 + 1];
							Static15.anIntArray60[local618 + 1] = local805;
						}
					}
					if (local2230) {
						break;
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 155) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2042();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2076();
				local1520 = Static113.method1814(local129);
				local1520.anInt1043 = local139 + (local528 << 16);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 36) {
				Static118.method1875();
				local129 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2066();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2074();
				Static29.anIntArray88[local139] = local129;
				Static74.anIntArray229[local139] = local528;
				Static36.anIntArray107[local139] = 1;
				for (local1216 = 0; local1216 < 98; local1216++) {
					if (Class1_Sub1_Sub13.anIntArray343[local1216] <= local129) {
						Static36.anIntArray107[local139] = local1216 + 2;
					}
				}
				Static21.anIntArray76[Static93.anInt2430++ & 0x1F] = local139;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 209) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2042();
				Static34.aClass73_6 = Static100.aClass15_4.method489(local129);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 225) {
				Static118.method1875();
				Static60.anInt1639 = Static51.aClass1_Sub19_Sub1_4.method2064();
				Static70.anInt1849 = Static70.anInt1848;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 86) {
				@Pc(2498) boolean local2498 = Static51.aClass1_Sub19_Sub1_4.method2066() == 1;
				local139 = Static51.aClass1_Sub19_Sub1_4.method2042();
				local423 = Static113.method1814(local139);
				if (local423.aBoolean63 != local2498) {
					local423.aBoolean63 = local2498;
					Static10.method277(local423);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 104) {
				Static42.anInt1195 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 120) {
				Static128.anInt3002 = Static51.aClass1_Sub19_Sub1_4.method2066();
				anInt2859 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 58) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2053();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local1216 = Static51.aClass1_Sub19_Sub1_4.method2076();
				@Pc(2571) Class1_Sub9 local2571 = Static113.method1814(local528);
				if (local139 != local2571.anInt1022 || local2571.anInt1039 != local1216 || local129 != local2571.anInt1080) {
					local2571.anInt1022 = local139;
					local2571.anInt1039 = local1216;
					local2571.anInt1080 = local129;
					Static10.method277(local2571);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 210) {
				Static40.anInt1147 = Static51.aClass1_Sub19_Sub1_4.method2093() * 30;
				Static70.anInt1849 = Static70.anInt1848;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 95) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2093();
				Static130.method934(local129);
				Static132.anIntArray380[Static129.anInt3038++ & 0x1F] = local129 & 0x7FFF;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 110) {
				for (local129 = 0; local129 < Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local129++) {
					if (Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local129] != null) {
						Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local129].anInt1388 = -1;
					}
				}
				for (local139 = 0; local139 < Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local139++) {
					if (Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local139] != null) {
						Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local139].anInt1388 = -1;
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 50) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local1216 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static102.aBooleanArray17[local129] = true;
				Static3.anIntArray21[local129] = local139;
				Static116.anIntArray350[local129] = local528;
				Static128.anIntArray370[local129] = local1216;
				Static110.anIntArray318[local129] = 0;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 115) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2072();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2051();
				Static81.method1389(local139, local129, local528);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 132) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2053();
				if (local129 == 65535) {
					local129 = -1;
				}
				Static71.method1257(local129);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 224) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2048();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2093();
				if (local139 == 65535) {
					local139 = -1;
				}
				Static16.method383(local139, local129);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 23) {
				Static50.method917(Static81.anInt2134, Static100.aClass15_4, Static51.aClass1_Sub19_Sub1_4);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 55) {
				local129 = Static51.aClass1_Sub19_Sub1_4.anInt3111 + Static81.anInt2134;
				local139 = Static51.aClass1_Sub19_Sub1_4.method2051();
				if (local139 != Static9.anInt451) {
					Static9.anInt451 = local139;
					Static32.method907(Static9.anInt451);
					Static6.method228(Static9.anInt451);
					for (local528 = 0; local528 < 100; local528++) {
						Static12.aBooleanArray3[local528] = true;
					}
				}
				while (Static51.aClass1_Sub19_Sub1_4.anInt3111 < local129) {
					local528 = Static51.aClass1_Sub19_Sub1_4.method2046();
					local1216 = Static51.aClass1_Sub19_Sub1_4.method2051();
					local544 = Static51.aClass1_Sub19_Sub1_4.method2072();
					@Pc(2891) Class1_Sub16 local2891 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local528);
					if (local2891 != null && local2891.anInt1893 != local1216) {
						Static95.method1619(local2891, true);
						local2891 = null;
					}
					if (local2891 == null) {
						local2891 = Static123.method1938(local544, local528, local1216);
					}
					local2891.aBoolean100 = true;
				}
				for (@Pc(2929) Class1_Sub16 local2929 = (Class1_Sub16) Static35.aClass48_5.method1337(); local2929 != null; local2929 = (Class1_Sub16) Static35.aClass48_5.method1335()) {
					if (local2929.aBoolean100) {
						local2929.aBoolean100 = false;
					} else {
						Static95.method1619(local2929, true);
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 144 || Static87.anInt2260 == 141 || Static87.anInt2260 == 245 || Static87.anInt2260 == 164 || Static87.anInt2260 == 129 || Static87.anInt2260 == 100 || Static87.anInt2260 == 41 || Static87.anInt2260 == 25 || Static87.anInt2260 == 76 || Static87.anInt2260 == 239 || Static87.anInt2260 == 15) {
				method1907();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 200) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2046();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2051();
				if (local129 >= 0) {
					local423 = Static113.method1814(local129);
				} else {
					local423 = null;
				}
				if (local423 != null) {
					for (local1216 = 0; local1216 < local423.anIntArray108.length; local1216++) {
						local423.anIntArray108[local1216] = 0;
						local423.anIntArray104[local1216] = 0;
					}
				}
				if (local129 < -70000) {
					local139 += 32768;
				}
				Static122.method1923(local139);
				local1216 = Static51.aClass1_Sub19_Sub1_4.method2051();
				for (local544 = 0; local544 < local1216; local544++) {
					local189 = Static51.aClass1_Sub19_Sub1_4.method2093();
					local1957 = Static51.aClass1_Sub19_Sub1_4.method2074();
					if (local1957 == 255) {
						local1957 = Static51.aClass1_Sub19_Sub1_4.method2046();
					}
					if (local423 != null && local423.anIntArray108.length > local544) {
						local423.anIntArray108[local544] = local189;
						local423.anIntArray104[local544] = local1957;
					}
					Static113.method1816(local544, local139, local189 - 1, local1957);
				}
				if (local423 != null) {
					Static10.method277(local423);
				}
				Static118.method1875();
				Static132.anIntArray380[Static129.anInt3038++ & 0x1F] = local139 & 0x7FFF;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 218) {
				local162 = Static51.aClass1_Sub19_Sub1_4.method2084();
				@Pc(3161) Object[] local3161 = new Object[local162.method982() + 1];
				for (local528 = local162.method982() - 1; local528 >= 0; local528--) {
					if (local162.method953(local528) == 115) {
						local3161[local528 + 1] = Static51.aClass1_Sub19_Sub1_4.method2084();
					} else {
						local3161[local528 + 1] = Integer.valueOf(Static51.aClass1_Sub19_Sub1_4.method2046());
					}
				}
				local3161[0] = Integer.valueOf(Static51.aClass1_Sub19_Sub1_4.method2046());
				@Pc(3217) Class1_Sub5 local3217 = new Class1_Sub5();
				local3217.anObjectArray1 = local3161;
				Static56.method1567(local3217);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 40) {
				Static129.method2011();
				Static87.anInt2260 = -1;
				return false;
			}
			if (Static87.anInt2260 == 173) {
				Static95.aBoolean129 = true;
				Static124.anInt2985 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static48.anInt1458 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static95.anInt2446 = Static51.aClass1_Sub19_Sub1_4.method2051();
				Static130.anInt1511 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static54.anInt1515 = Static51.aClass1_Sub19_Sub1_4.method2072();
				if (Static54.anInt1515 >= 100) {
					local129 = Static124.anInt2985 * 128 + 64;
					local139 = Static48.anInt1458 * 128 + 64;
					local528 = Static45.method1845(Static42.anInt1208, local139, local129) - Static95.anInt2446;
					local1216 = local129 - Static119.anInt2839;
					local544 = local528 - Static88.anInt2285;
					local189 = local139 - Static109.anInt3091;
					local1957 = (int) Math.sqrt((double) (local189 * local189 + local1216 * local1216));
					Static58.anInt1617 = (int) (Math.atan2((double) local544, (double) local1957) * 325.949D) & 0x7FF;
					Static66.anInt1754 = (int) (-325.949D * Math.atan2((double) local1216, (double) local189)) & 0x7FF;
					if (Static58.anInt1617 < 128) {
						Static58.anInt1617 = 128;
					}
					if (Static58.anInt1617 > 383) {
						Static58.anInt1617 = 383;
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 240) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2046();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2053();
				local423 = Static113.method1814(local129);
				if (local423.anInt1040 != 2 || local423.anInt1027 != local139) {
					local423.anInt1027 = local139;
					local423.anInt1040 = 2;
					Static10.method277(local423);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 134) {
				Static95.aBoolean129 = false;
				for (local129 = 0; local129 < 5; local129++) {
					Static102.aBooleanArray17[local129] = false;
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 73) {
				Static132.method2098();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 133) {
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				@Pc(3438) Class34 local3438 = Static103.method856(Static69.method1191(Static51.aClass1_Sub19_Sub1_4).method979());
				Static39.method685(Static77.method1358(local502).method969(), 6, local3438);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 121) {
				Static114.anInt2736 = Static81.anInt2134 / 8;
				for (local129 = 0; local129 < Static114.anInt2736; local129++) {
					Static40.aLongArray3[local129] = Static51.aClass1_Sub19_Sub1_4.method2089();
				}
				Static38.anInt1125 = Static70.anInt1848;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 27) {
				Static87.anInt2260 = -1;
				Static44.anInt1248 = 0;
				return true;
			}
			if (Static87.anInt2260 == 102) {
				Static9.anInt457 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static51.anInt1482 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static5.anInt366 = Static51.aClass1_Sub19_Sub1_4.method2072();
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 9) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2046();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2051();
				if (local129 < -70000) {
					local139 += 32768;
				}
				if (local129 >= 0) {
					local423 = Static113.method1814(local129);
				} else {
					local423 = null;
				}
				while (Static81.anInt2134 > Static51.aClass1_Sub19_Sub1_4.anInt3111) {
					local1216 = Static51.aClass1_Sub19_Sub1_4.method2078();
					local544 = Static51.aClass1_Sub19_Sub1_4.method2051();
					local189 = 0;
					if (local544 != 0) {
						local189 = Static51.aClass1_Sub19_Sub1_4.method2072();
						if (local189 == 255) {
							local189 = Static51.aClass1_Sub19_Sub1_4.method2046();
						}
					}
					if (local423 != null && local1216 >= 0 && local1216 < local423.anIntArray108.length) {
						local423.anIntArray108[local1216] = local544;
						local423.anIntArray104[local1216] = local189;
					}
					Static113.method1816(local1216, local139, local544 - 1, local189);
				}
				if (local423 != null) {
					Static10.method277(local423);
				}
				Static118.method1875();
				Static132.anIntArray380[Static129.anInt3038++ & 0x1F] = local139 & 0x7FFF;
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 71) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2042();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2076();
				if (local139 == 65535) {
					local139 = -1;
				}
				local528 = Static51.aClass1_Sub19_Sub1_4.method2083();
				local1520 = Static113.method1814(local129);
				@Pc(3671) Class1_Sub1_Sub8 local3671;
				if (local1520.aBoolean57) {
					local1520.anInt1024 = local139;
					local1520.anInt1075 = local528;
					local3671 = Static74.method1334(local139);
					local1520.anInt1019 = local3671.anInt2035;
					local1520.anInt1086 = local3671.anInt2005;
					local1520.anInt1048 = local3671.anInt2036;
					local1520.anInt1039 = local3671.anInt2001;
					local1520.anInt1080 = local3671.anInt2010;
					if (local1520.anInt1067 > 0) {
						local1520.anInt1080 = local1520.anInt1080 * 32 / local1520.anInt1067;
					}
					local1520.anInt1022 = local3671.anInt2002;
					Static10.method277(local1520);
				} else if (local139 == -1) {
					Static87.anInt2260 = -1;
					local1520.anInt1040 = 0;
					return true;
				} else {
					local3671 = Static74.method1334(local139);
					local1520.anInt1039 = local3671.anInt2001;
					local1520.anInt1027 = local139;
					local1520.anInt1022 = local3671.anInt2002;
					local1520.anInt1040 = 4;
					local1520.anInt1080 = local3671.anInt2010 * 100 / local528;
					Static10.method277(local1520);
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 62) {
				@Pc(3763) boolean local3763 = false;
				local502 = Static51.aClass1_Sub19_Sub1_4.method2089();
				local185 = Static51.aClass1_Sub19_Sub1_4.method2051();
				local757 = Static51.aClass1_Sub19_Sub1_4.method2048();
				@Pc(3783) long local3783 = local757 + (local185 << 32);
				local1957 = Static51.aClass1_Sub19_Sub1_4.method2072();
				for (@Pc(3789) int local3789 = 0; local3789 < 100; local3789++) {
					if (local3783 == Static44.aLongArray4[local3789]) {
						local3763 = true;
						break;
					}
				}
				if (local1957 <= 1) {
					for (@Pc(3812) int local3812 = 0; local3812 < Static114.anInt2736; local3812++) {
						if (local502 == Static40.aLongArray3[local3812]) {
							local3763 = true;
							break;
						}
					}
				}
				if (!local3763 && Static97.anInt2495 == 0) {
					Static44.aLongArray4[Static24.anInt817] = local3783;
					Static24.anInt817 = (Static24.anInt817 + 1) % 100;
					@Pc(3852) Class34 local3852 = Static103.method856(Static69.method1191(Static51.aClass1_Sub19_Sub1_4).method979());
					if (local1957 == 2 || local1957 == 3) {
						Static39.method685(Static91.method1554(new Class34[] { Static3.aClass34_122, Static77.method1358(local502).method969() }), 7, local3852);
					} else if (local1957 == 1) {
						Static39.method685(Static91.method1554(new Class34[] { Static114.aClass34_1378, Static77.method1358(local502).method969() }), 7, local3852);
					} else {
						Static39.method685(Static77.method1358(local502).method969(), 3, local3852);
					}
				}
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 128) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2092();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2066();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2066();
				Static42.anInt1208 = local139 >> 1;
				Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.method903(local528, local129, (local139 & 0x1) == 1);
				Static87.anInt2260 = -1;
				return true;
			}
			if (Static87.anInt2260 == 78) {
				local129 = Static51.aClass1_Sub19_Sub1_4.method2092();
				local139 = Static51.aClass1_Sub19_Sub1_4.method2076();
				local528 = Static51.aClass1_Sub19_Sub1_4.method2042();
				@Pc(3982) Class1_Sub16 local3982 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local528);
				if (local3982 != null) {
					Static95.method1619(local3982, local3982.anInt1893 != local139);
				}
				Static123.method1938(local129, local528, local139);
				Static87.anInt2260 = -1;
				return true;
			}
			Static65.method1115("T1 - " + Static87.anInt2260 + "," + Static2.anInt273 + "," + Static71.anInt1879 + " - " + Static81.anInt2134, null);
			Static129.method2011();
		} catch (@Pc(4032) IOException local4032) {
			Static85.method1457();
		} catch (@Pc(4036) Exception local4036) {
			@Pc(4076) String local4076 = "T2 - " + Static87.anInt2260 + "," + Static2.anInt273 + "," + Static71.anInt1879 + " - " + Static81.anInt2134 + "," + (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0] + Static37.anInt1098) + "," + (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0] + Static121.anInt2871) + " - ";
			for (local139 = 0; local139 < Static81.anInt2134 && local139 < 50; local139++) {
				local4076 = local4076 + Static51.aClass1_Sub19_Sub1_4.aByteArray42[local139] + ",";
			}
			Static65.method1115(local4076, local4036);
			Static129.method2011();
		}
		return true;
	}
}
