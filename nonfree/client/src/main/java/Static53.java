import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage5;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!oc;")
	public static Class56 aClass56_78;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!oc;")
	public static Class56 aClass56_79;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1235 = Static78.method1313("blaugr-Un:");

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1236 = Static78.method1313(")3");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1237 = Static78.method1313("Ignorieren");

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1238 = Static78.method1313("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
	public static int[] anIntArray429 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray26 = new int[104][104];

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1239 = Static78.method1313("level)2");

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1240 = null;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1241 = aClass25_1239;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1243 = Static78.method1313("Select");

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1242 = aClass25_1243;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	public static int anInt2569 = -1;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z")
	public static boolean method1779() {
		if (Static100.aClass77_5 == null) {
			return false;
		}
		@Pc(322) int local322;
		try {
			@Pc(13) int local13 = Static100.aClass77_5.method1902();
			if (local13 == 0) {
				return false;
			}
			if (Static38.anInt1078 == -1) {
				local13--;
				Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, 1);
				Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
				Static38.anInt1078 = Static35.aClass1_Sub5_Sub1_1.method689();
				Static110.anInt2558 = Static64.anIntArray277[Static38.anInt1078];
			}
			if (Static110.anInt2558 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, 1);
				Static110.anInt2558 = Static35.aClass1_Sub5_Sub1_1.aByteArray13[0] & 0xFF;
			}
			if (Static110.anInt2558 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, 2);
				Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
				Static110.anInt2558 = Static35.aClass1_Sub5_Sub1_1.method651();
			}
			if (Static110.anInt2558 > local13) {
				return false;
			}
			Static35.aClass1_Sub5_Sub1_1.anInt792 = 0;
			Static100.aClass77_5.method1905(0, Static35.aClass1_Sub5_Sub1_1.aByteArray13, Static110.anInt2558);
			Static39.anInt1101 = 0;
			Static76.anInt1593 = Static33.anInt911;
			Static33.anInt911 = Static18.anInt541;
			Static18.anInt541 = Static38.anInt1078;
			@Pc(130) int local130;
			@Pc(175) int local175;
			@Pc(126) long local126;
			@Pc(249) int local249;
			@Pc(186) int local186;
			if (Static38.anInt1078 == 126) {
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				local130 = Static35.aClass1_Sub5_Sub1_1.method651();
				Static35.aClass1_Sub5_Sub1_1.method643();
				@Pc(136) boolean local136 = false;
				if ((local126 & Long.MIN_VALUE) != 0L) {
					local136 = true;
				}
				if (local136) {
					if (Static42.anInt1134 == 0) {
						Static38.anInt1078 = -1;
						return true;
					}
					local126 &= Long.MAX_VALUE;
					for (local249 = 0; local249 < Static42.anInt1134 && (local126 != Static82.aClass1_Sub11Array1[local249].aLong184 || local130 != Static82.aClass1_Sub11Array1[local249].anInt1413); local249++) {
					}
					if (Static42.anInt1134 > local249) {
						while (local249 < Static42.anInt1134 - 1) {
							Static82.aClass1_Sub11Array1[local249] = Static82.aClass1_Sub11Array1[local249 + 1];
							local249++;
						}
						Static82.aClass1_Sub11Array1[Static42.anInt1134] = null;
						Static42.anInt1134--;
					}
				} else if (Static42.anInt1134 < 100) {
					@Pc(159) Class1_Sub11 local159 = new Class1_Sub11();
					local159.aLong184 = local126;
					local159.aClass25_646 = Static24.method575(local159.aLong184);
					local159.anInt1413 = local130;
					for (local175 = Static42.anInt1134 - 1; local175 >= 0; local175--) {
						local186 = Static82.aClass1_Sub11Array1[local175].aClass25_646.method779(local159.aClass25_646);
						System.out.println("co=" + local186);
						if (local186 == 0) {
							Static38.anInt1078 = -1;
							return true;
						}
						if (local186 < 0) {
							break;
						}
						Static82.aClass1_Sub11Array1[local175 + 1] = Static82.aClass1_Sub11Array1[local175];
					}
					Static82.aClass1_Sub11Array1[local175 + 1] = local159;
					Static42.anInt1134++;
				} else {
					Static38.anInt1078 = -1;
					return true;
				}
				Static38.anInt1078 = -1;
				Static62.anInt1392 = Static60.anInt1366;
				return true;
			}
			@Pc(346) int local346;
			@Pc(318) int local318;
			@Pc(338) Class1_Sub2_Sub14 local338;
			if (Static38.anInt1078 == 50) {
				Static90.aBoolean98 = true;
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local322 = Static35.aClass1_Sub5_Sub1_1.method651();
				if (local318 < -70000) {
					local322 += 32768;
				}
				if (local318 >= 0) {
					local338 = Static46.method968(local318);
				} else {
					local338 = null;
				}
				if (local338 != null) {
					for (local346 = 0; local346 < local338.anIntArray341.length; local346++) {
						local338.anIntArray341[local346] = 0;
						local338.anIntArray344[local346] = 0;
					}
				}
				Static48.method981(local322);
				local346 = Static35.aClass1_Sub5_Sub1_1.method651();
				for (local249 = 0; local249 < local346; local249++) {
					local175 = Static35.aClass1_Sub5_Sub1_1.method670();
					local186 = Static35.aClass1_Sub5_Sub1_1.method648();
					if (local186 == 255) {
						local186 = Static35.aClass1_Sub5_Sub1_1.method661();
					}
					if (local338 != null && local338.anIntArray341.length > local249) {
						local338.anIntArray341[local249] = local175;
						local338.anIntArray344[local249] = local186;
					}
					Static47.method978(local186, local322, local249, local175 - 1);
				}
				Static27.anInt743 = Static60.anInt1366;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 0) {
				for (local318 = 0; local318 < Static64.anInt1444; local318++) {
					@Pc(447) Class1_Sub2_Sub8 local447 = Static77.method1289(local318);
					if (local447 != null && local447.anInt938 == 0) {
						Static24.anIntArray148[local318] = 0;
						Static95.anIntArray385[local318] = 0;
					}
				}
				Static90.aBoolean98 = true;
				Static38.anInt1078 = -1;
				if (Static108.anInt2502 != -1) {
					Static110.aBoolean113 = true;
				}
				Static62.anInt1392 = Static60.anInt1366;
				return true;
			}
			if (Static38.anInt1078 == 14) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method671();
				local322 = Static35.aClass1_Sub5_Sub1_1.method672();
				local130 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static21.anInt596 = local130 >> 1;
				Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1973(local322, (local130 & 0x1) == 1, local318);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 231) {
				Static35.aClass1_Sub5_Sub1_1.method651();
				Static35.aClass1_Sub5_Sub1_1.method648();
				Static35.aClass1_Sub5_Sub1_1.method682();
				Static38.anInt1078 = -1;
				return true;
			}
			@Pc(565) long local565;
			@Pc(552) long local552;
			if (Static38.anInt1078 == 111) {
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				local552 = Static35.aClass1_Sub5_Sub1_1.method651();
				@Pc(557) long local557 = (long) Static35.aClass1_Sub5_Sub1_1.method660();
				@Pc(559) boolean local559 = false;
				local565 = local557 + (local552 << 32);
				local186 = Static35.aClass1_Sub5_Sub1_1.method672();
				for (@Pc(571) int local571 = 0; local571 < 100; local571++) {
					if (Static108.aLongArray5[local571] == local565) {
						local559 = true;
						break;
					}
				}
				if (local186 <= 1) {
					for (@Pc(598) int local598 = 0; local598 < Static49.anInt1230; local598++) {
						if (local126 == Static68.aLongArray3[local598]) {
							local559 = true;
							break;
						}
					}
				}
				if (!local559 && Static123.anInt2884 == 0) {
					Static108.aLongArray5[Static129.anInt2960] = local565;
					Static129.anInt2960 = (Static129.anInt2960 + 1) % 100;
					@Pc(646) Class25 local646 = Static72.method1188(Static99.method1652(Static35.aClass1_Sub5_Sub1_1).method775());
					if (local186 == 2 || local186 == 3) {
						Static25.method584(7, local646, Static116.method1859(new Class25[] { Static38.aClass25_448, Static24.method575(local126).method772() }));
					} else if (local186 == 1) {
						Static25.method584(7, local646, Static116.method1859(new Class25[] { Static77.aClass25_810, Static24.method575(local126).method772() }));
					} else {
						Static25.method584(3, local646, Static24.method575(local126).method772());
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 240) {
				Static84.aBoolean82 = true;
				Static47.anInt1204 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static76.anInt1594 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static26.anInt734 = Static35.aClass1_Sub5_Sub1_1.method651();
				Static74.anInt1536 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static6.anInt121 = Static35.aClass1_Sub5_Sub1_1.method672();
				if (Static6.anInt121 >= 100) {
					Static67.anInt1471 = Static76.anInt1594 * 128 + 64;
					Static75.anInt1566 = Static47.anInt1204 * 128 + 64;
					Static90.anInt2026 = Static129.method2048(Static67.anInt1471, Static21.anInt596, Static75.anInt1566) - Static26.anInt734;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 103) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method641();
				if (local318 >= 0) {
					Static77.method1294(local318);
				}
				if (Static2.anInt29 != local318) {
					Static101.method1677(Static2.anInt29);
					Static2.anInt29 = local318;
				}
				Static70.method1094(Static2.anInt29);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 65) {
				Static82.anInt1811 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static80.anInt1785 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static11.anInt279 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static18.aBoolean18 = true;
				Static110.aBoolean113 = true;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 5) {
				Static9.method234(Static110.anInt2558, Static71.aClass74_2, Static35.aClass1_Sub5_Sub1_1);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 162) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method642();
				local322 = Static35.aClass1_Sub5_Sub1_1.method657();
				Static24.anIntArray148[local318] = local322;
				if (Static95.anIntArray385[local318] != local322) {
					Static95.anIntArray385[local318] = local322;
					Static67.method1137(local318);
					if (Static108.anInt2502 != -1) {
						Static110.aBoolean113 = true;
					}
					Static90.aBoolean98 = true;
				}
				Static62.anInt1392 = Static60.anInt1366;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 254) {
				Static48.anInt1228 = Static35.aClass1_Sub5_Sub1_1.method648();
				if (Static48.anInt1228 == Static90.anInt2027) {
					if (Static48.anInt1228 == 3) {
						Static90.anInt2027 = 1;
					} else {
						Static90.anInt2027 = 3;
					}
					Static90.aBoolean98 = true;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			@Pc(936) Class1_Sub2_Sub14 local936;
			if (Static38.anInt1078 == 104) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method642();
				local322 = Static35.aClass1_Sub5_Sub1_1.method657();
				local130 = Static35.aClass1_Sub5_Sub1_1.method670();
				local936 = Static46.method968(local322);
				local936.anInt1948 = local318 + (local130 << 16);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 199) {
				for (local318 = 0; local318 < Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1.length; local318++) {
					if (Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local318] != null) {
						Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local318].anInt2810 = -1;
					}
				}
				for (local322 = 0; local322 < Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32.length; local322++) {
					if (Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local322] != null) {
						Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local322].anInt2810 = -1;
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 7) {
				Static90.aBoolean98 = true;
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local322 = Static35.aClass1_Sub5_Sub1_1.method651();
				if (local318 < 0) {
					local338 = null;
				} else {
					local338 = Static46.method968(local318);
				}
				if (local318 < -70000) {
					local322 += 32768;
				}
				while (Static35.aClass1_Sub5_Sub1_1.anInt792 < Static110.anInt2558) {
					local346 = Static35.aClass1_Sub5_Sub1_1.method674();
					local175 = 0;
					local249 = Static35.aClass1_Sub5_Sub1_1.method651();
					if (local249 != 0) {
						local175 = Static35.aClass1_Sub5_Sub1_1.method672();
						if (local175 == 255) {
							local175 = Static35.aClass1_Sub5_Sub1_1.method663();
						}
					}
					if (local338 != null && local346 >= 0 && local346 < local338.anIntArray341.length) {
						local338.anIntArray341[local346] = local249;
						local338.anIntArray344[local346] = local175;
					}
					Static47.method978(local175, local322, local346, local249 - 1);
				}
				Static27.anInt743 = Static60.anInt1366;
				Static38.anInt1078 = -1;
				return true;
			}
			@Pc(1105) Class25 local1105;
			if (Static38.anInt1078 == 145) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local1105 = Static35.aClass1_Sub5_Sub1_1.method654();
				local338 = Static46.method968(local318);
				local338.aClass25_941 = local1105;
				if (Static22.anIntArray162[Static90.anInt2027] == local318 >> 16) {
					Static90.aBoolean98 = true;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 1) {
				Static3.anInt59 = Static35.aClass1_Sub5_Sub1_1.method672();
				if (Static3.anInt59 == 1) {
					Static114.anInt2636 = Static35.aClass1_Sub5_Sub1_1.method651();
				}
				if (Static3.anInt59 >= 2 && Static3.anInt59 <= 6) {
					if (Static3.anInt59 == 2) {
						Static10.anInt267 = 64;
						Static110.anInt2552 = 64;
					}
					if (Static3.anInt59 == 3) {
						Static110.anInt2552 = 64;
						Static10.anInt267 = 0;
					}
					if (Static3.anInt59 == 4) {
						Static110.anInt2552 = 64;
						Static10.anInt267 = 128;
					}
					if (Static3.anInt59 == 5) {
						Static10.anInt267 = 64;
						Static110.anInt2552 = 0;
					}
					if (Static3.anInt59 == 6) {
						Static10.anInt267 = 64;
						Static110.anInt2552 = 128;
					}
					Static3.anInt59 = 2;
					Static92.anInt2075 = Static35.aClass1_Sub5_Sub1_1.method651();
					Static69.anInt1480 = Static35.aClass1_Sub5_Sub1_1.method651();
					Static120.anInt2845 = Static35.aClass1_Sub5_Sub1_1.method672();
				}
				if (Static3.anInt59 == 10) {
					Static65.anInt1452 = Static35.aClass1_Sub5_Sub1_1.method651();
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 117) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method668();
				if (local318 != Static108.anInt2502) {
					Static101.method1677(Static108.anInt2502);
					Static108.anInt2502 = local318;
				}
				Static110.aBoolean113 = true;
				Static70.method1094(Static108.anInt2502);
				Static38.anInt1078 = -1;
				return true;
			}
			@Pc(1260) Class25 local1260;
			if (Static38.anInt1078 == 188) {
				local1260 = Static35.aClass1_Sub5_Sub1_1.method654();
				@Pc(1290) boolean local1290;
				if (local1260.method776(Static102.aClass25_1118)) {
					local1105 = local1260.method781(0, local1260.method796(Static6.aClass25_55));
					local552 = local1105.method770();
					local1290 = false;
					for (local175 = 0; local175 < Static49.anInt1230; local175++) {
						if (Static68.aLongArray3[local175] == local552) {
							local1290 = true;
							break;
						}
					}
					if (!local1290 && Static123.anInt2884 == 0) {
						Static25.method584(4, Static5.aClass25_45, local1105);
					}
				} else if (local1260.method776(Static119.aClass25_1345)) {
					local1105 = local1260.method781(0, local1260.method796(Static6.aClass25_55));
					local552 = local1105.method770();
					local1290 = false;
					for (local175 = 0; local175 < Static49.anInt1230; local175++) {
						if (local552 == Static68.aLongArray3[local175]) {
							local1290 = true;
							break;
						}
					}
					if (!local1290 && Static123.anInt2884 == 0) {
						Static25.method584(8, Static100.aClass25_1096, local1105);
					}
				} else if (local1260.method776(Static96.aClass25_1376)) {
					local1105 = local1260.method781(0, local1260.method796(Static6.aClass25_55));
					local552 = local1105.method770();
					local1290 = false;
					for (local175 = 0; local175 < Static49.anInt1230; local175++) {
						if (Static68.aLongArray3[local175] == local552) {
							local1290 = true;
							break;
						}
					}
					if (!local1290 && Static123.anInt2884 == 0) {
						@Pc(1334) Class25 local1334 = local1260.method781(local1260.method796(Static6.aClass25_55) + 1, local1260.method762() + -9);
						Static25.method584(8, local1334, local1105);
					}
				} else {
					Static25.method584(0, local1260, Static92.aClass25_985);
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 62) {
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
				}
				Static110.aBoolean115 = false;
				Static38.anInt1078 = -1;
				Static92.aClass25_989 = Static92.aClass25_985;
				Static104.anInt2372 = 1;
				Static110.aBoolean113 = true;
				return true;
			}
			if (Static38.anInt1078 == 224) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method682();
				local322 = Static35.aClass1_Sub5_Sub1_1.method670();
				local338 = Static46.method968(local318);
				Static38.anInt1078 = -1;
				local338.anInt1930 = 2;
				local338.anInt1951 = local322;
				return true;
			}
			if (Static38.anInt1078 == 138) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method661();
				Static88.aClass50_4 = Static71.aClass74_2.method1814(local318);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 48) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local322 = Static35.aClass1_Sub5_Sub1_1.method670();
				local338 = Static46.method968(local318);
				if (local338 != null && local338.anInt1960 == 0) {
					if (local322 > local338.anInt1912 - local338.anInt1923) {
						local322 = local338.anInt1912 - local338.anInt1923;
					}
					if (local322 < 0) {
						local322 = 0;
					}
					local338.anInt1957 = local322;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 135) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method642();
				local322 = Static35.aClass1_Sub5_Sub1_1.method671();
				if (local318 == 65535) {
					local318 = -1;
				}
				if (local318 == Static22.anIntArray162[local322]) {
					Static45.method959(Static22.anIntArray162[local322]);
				} else {
					Static101.method1677(Static22.anIntArray162[local322]);
					Static22.anIntArray162[local322] = local318;
				}
				Static120.aBoolean126 = true;
				Static90.aBoolean98 = true;
				Static70.method1094(Static22.anIntArray162[local322]);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 129) {
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				@Pc(1639) Class25 local1639 = Static72.method1188(Static99.method1652(Static35.aClass1_Sub5_Sub1_1).method775());
				Static25.method584(6, local1639, Static24.method575(local126).method772());
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 149) {
				Static38.anInt1078 = -1;
				Static62.anInt1391 = 0;
				return true;
			}
			if (Static38.anInt1078 == 161) {
				Static49.anInt1230 = Static110.anInt2558 / 8;
				for (local318 = 0; local318 < Static49.anInt1230; local318++) {
					Static68.aLongArray3[local318] = Static35.aClass1_Sub5_Sub1_1.method669();
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 253) {
				if (Static33.anInt922 != -1) {
					Static101.method1677(Static33.anInt922);
					Static120.aBoolean126 = true;
					Static33.anInt922 = -1;
					Static90.aBoolean98 = true;
				}
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
					Static110.aBoolean113 = true;
				}
				if (Static67.anInt1470 != -1) {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = -1;
					Static99.method1645(30);
				}
				if (Static93.anInt2098 != -1) {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = -1;
				}
				if (Static108.anInt2497 != -1) {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = -1;
				}
				Static38.anInt1078 = -1;
				if (Static104.anInt2372 != 0) {
					Static104.anInt2372 = 0;
					Static110.aBoolean113 = true;
				}
				Static33.anInt917 = -1;
				return true;
			}
			@Pc(1789) int local1789;
			@Pc(1799) int local1799;
			@Pc(1780) long local1780;
			if (Static38.anInt1078 == 197) {
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				@Pc(1771) byte local1771 = Static35.aClass1_Sub5_Sub1_1.method643();
				@Pc(1775) long local1775 = Static35.aClass1_Sub5_Sub1_1.method669();
				local1780 = Static35.aClass1_Sub5_Sub1_1.method651();
				local565 = Static35.aClass1_Sub5_Sub1_1.method660();
				local1789 = Static35.aClass1_Sub5_Sub1_1.method672();
				@Pc(1791) boolean local1791 = false;
				@Pc(1797) long local1797 = local565 + (local1780 << 32);
				for (local1799 = 0; local1799 < 100; local1799++) {
					if (local1797 == Static108.aLongArray5[local1799]) {
						local1791 = true;
						break;
					}
				}
				if (local1789 <= 1) {
					for (@Pc(1822) int local1822 = 0; local1822 < Static49.anInt1230; local1822++) {
						if (Static68.aLongArray3[local1822] == local126) {
							local1791 = true;
							break;
						}
					}
				}
				if (!local1791 && Static123.anInt2884 == 0) {
					Static108.aLongArray5[Static129.anInt2960] = local1797;
					Static129.anInt2960 = (Static129.anInt2960 + 1) % 100;
					@Pc(1866) Class25 local1866 = Static72.method1188(Static99.method1652(Static35.aClass1_Sub5_Sub1_1).method775());
					@Pc(1895) Class25 local1895 = Static116.method1859(new Class25[] { Static95.aClass25_1035, Static24.method575(local1775), Static35.aClass25_413, Static74.method1214(local1771), Static14.aClass25_208 });
					if (local1789 == 2 || local1789 == 3) {
						Static25.method584(7, local1866, Static116.method1859(new Class25[] { local1895, Static38.aClass25_448, Static24.method575(local126).method772() }));
					} else if (local1789 == 1) {
						Static25.method584(7, local1866, Static116.method1859(new Class25[] { local1895, Static77.aClass25_810, Static24.method575(local126).method772() }));
					} else {
						Static25.method584(3, local1866, Static116.method1859(new Class25[] { local1895, Static24.method575(local126).method772() }));
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 248) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method677();
				local322 = Static35.aClass1_Sub5_Sub1_1.method657();
				local130 = local318 >> 10 & 0x1F;
				local346 = local318 >> 5 & 0x1F;
				local249 = local318 & 0x1F;
				@Pc(2017) Class1_Sub2_Sub14 local2017 = Static46.method968(local322);
				local2017.anInt1956 = (local249 << 3) + ((local130 << 19) + (local346 << 11));
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 225) {
				Static84.aBoolean82 = true;
				Static101.anInt2350 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static37.anInt1049 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static106.anInt2480 = Static35.aClass1_Sub5_Sub1_1.method651();
				Static47.anInt1205 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static64.anInt1445 = Static35.aClass1_Sub5_Sub1_1.method672();
				if (Static64.anInt1445 >= 100) {
					local318 = Static101.anInt2350 * 128 + 64;
					local322 = Static37.anInt1049 * 128 + 64;
					local130 = Static129.method2048(local322, Static21.anInt596, local318) - Static106.anInt2480;
					local175 = local322 - Static67.anInt1471;
					local249 = local130 - Static90.anInt2026;
					local346 = local318 - Static75.anInt1566;
					local186 = (int) Math.sqrt((double) (local346 * local346 + local175 * local175));
					Static35.anInt1003 = (int) (Math.atan2((double) local249, (double) local186) * 325.949D) & 0x7FF;
					Static106.anInt2477 = (int) (-325.949D * Math.atan2((double) local346, (double) local175)) & 0x7FF;
					if (Static35.anInt1003 < 128) {
						Static35.anInt1003 = 128;
					}
					if (Static35.anInt1003 > 383) {
						Static35.anInt1003 = 383;
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			@Pc(2242) int local2242;
			@Pc(2249) int local2249;
			if (Static38.anInt1078 == 134) {
				Static62.anInt1392 = Static60.anInt1366;
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				if (local126 == 0L) {
					Static38.anInt1078 = -1;
					Static82.aClass1_Sub11Array1 = null;
					Static22.aClass25_341 = null;
					Static42.anInt1134 = 0;
					return true;
				}
				Static22.aClass25_341 = Static24.method575(local126);
				local130 = Static35.aClass1_Sub5_Sub1_1.method672();
				if (local130 == 255) {
					Static38.anInt1078 = -1;
					return true;
				}
				Static42.anInt1134 = local130;
				@Pc(2196) Class1_Sub11[] local2196 = new Class1_Sub11[100];
				for (local249 = 0; local249 < Static42.anInt1134; local249++) {
					local2196[local249] = new Class1_Sub11();
					local2196[local249].aLong184 = Static35.aClass1_Sub5_Sub1_1.method669();
					local2196[local249].aClass25_646 = Static24.method575(local2196[local249].aLong184);
					local2196[local249].anInt1413 = Static35.aClass1_Sub5_Sub1_1.method651();
				}
				local2242 = Static42.anInt1134;
				while (local2242 > 0) {
					local2242--;
					@Pc(2247) boolean local2247 = true;
					for (local2249 = 0; local2249 < local2242; local2249++) {
						if (local2196[local2249].aClass25_646.method779(local2196[local2249 + 1].aClass25_646) > 0) {
							@Pc(2268) Class1_Sub11 local2268 = local2196[local2249];
							local2247 = false;
							local2196[local2249] = local2196[local2249 + 1];
							local2196[local2249 + 1] = local2268;
						}
					}
					if (local2247) {
						break;
					}
				}
				Static38.anInt1078 = -1;
				Static82.aClass1_Sub11Array1 = local2196;
				return true;
			}
			if (Static38.anInt1078 == 118) {
				Static90.aBoolean98 = true;
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local322 = Static35.aClass1_Sub5_Sub1_1.method671();
				local130 = Static35.aClass1_Sub5_Sub1_1.method671();
				Static120.anIntArray487[local130] = local318;
				Static15.anIntArray79[local130] = local322;
				Static50.anIntArray245[local130] = 1;
				for (local346 = 0; local346 < 98; local346++) {
					if (local318 >= Class68.anIntArray412[local346]) {
						Static50.anIntArray245[local130] = local346 + 2;
					}
				}
				Static37.anInt1048 = Static60.anInt1366;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 187) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method677();
				if (local318 == 65535) {
					local318 = -1;
				}
				Static74.method1215(local318);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 99) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method677();
				local322 = Static35.aClass1_Sub5_Sub1_1.method660();
				if (local318 == 65535) {
					local318 = -1;
				}
				Static5.method98(local322, local318);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 46) {
				Static35.aClass1_Sub5_Sub1_1.method670();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 109) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method651();
				if (local318 == 65535) {
					local318 = -1;
				}
				local322 = Static35.aClass1_Sub5_Sub1_1.method682();
				local130 = Static35.aClass1_Sub5_Sub1_1.method661();
				local346 = Static35.aClass1_Sub5_Sub1_1.method670();
				if (local346 == 65535) {
					local346 = -1;
				}
				for (local249 = local346; local249 <= local318; local249++) {
					local1780 = ((long) local130 << 32) + (long) local249;
					@Pc(2470) Class1 local2470 = Static125.aClass66_15.method1650(local1780);
					if (local2470 != null) {
						local2470.method2024();
					}
					Static125.aClass66_15.method1653(new Class1_Sub19(local322), local1780);
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 84) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method651();
				local322 = Static35.aClass1_Sub5_Sub1_1.method670();
				local130 = Static35.aClass1_Sub5_Sub1_1.method642();
				local346 = Static35.aClass1_Sub5_Sub1_1.method661();
				@Pc(2516) Class1_Sub2_Sub14 local2516 = Static46.method968(local346);
				local2516.anInt1902 = local318;
				local2516.anInt1962 = local130;
				Static38.anInt1078 = -1;
				local2516.anInt1924 = local322;
				return true;
			}
			if (Static38.anInt1078 == 11) {
				local1260 = Static35.aClass1_Sub5_Sub1_1.method654();
				@Pc(2545) Object[] local2545 = new Object[local1260.method762() + 1];
				for (local130 = local1260.method762() - 1; local130 >= 0; local130--) {
					if (local1260.method767(local130) == 115) {
						local2545[local130 + 1] = Static35.aClass1_Sub5_Sub1_1.method654();
					} else {
						local2545[local130 + 1] = Integer.valueOf(Static35.aClass1_Sub5_Sub1_1.method663());
					}
				}
				local2545[0] = Integer.valueOf(Static35.aClass1_Sub5_Sub1_1.method663());
				Static27.method600(null, local2545, null, 0, 0, 0);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 136) {
				if (Static90.anInt2027 == 12) {
					Static90.aBoolean98 = true;
				}
				Static47.anInt1209 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 60) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method670();
				Static77.method1294(local318);
				if (Static33.anInt922 != -1) {
					Static101.method1677(Static33.anInt922);
					Static33.anInt922 = -1;
					Static90.aBoolean98 = true;
					Static120.aBoolean126 = true;
				}
				if (Static67.anInt1470 != -1) {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = -1;
					Static99.method1645(30);
				}
				if (Static93.anInt2098 != -1) {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = -1;
				}
				if (Static108.anInt2497 != -1) {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = -1;
				}
				if (Static33.anInt916 == local318) {
					Static45.method959(Static33.anInt916);
				} else {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = local318;
				}
				Static33.anInt917 = -1;
				Static70.method1094(Static33.anInt916);
				Static110.aBoolean113 = true;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 227) {
				Static77.method1292(true);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 42) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method672();
				local322 = Static35.aClass1_Sub5_Sub1_1.method672();
				local130 = Static35.aClass1_Sub5_Sub1_1.method672();
				local346 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static78.aBooleanArray7[local318] = true;
				Static76.anIntArray297[local318] = local322;
				Static13.anIntArray65[local318] = local130;
				Static61.anIntArray265[local318] = local346;
				Static11.anIntArray46[local318] = 0;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 105) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method682();
				local322 = Static35.aClass1_Sub5_Sub1_1.method651();
				local338 = Static46.method968(local318);
				Static38.anInt1078 = -1;
				local338.anInt1930 = 1;
				local338.anInt1951 = local322;
				return true;
			}
			if (Static38.anInt1078 == 98) {
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
				}
				Static104.anInt2372 = 2;
				Static110.aBoolean113 = true;
				Static92.aClass25_989 = Static92.aClass25_985;
				Static38.anInt1078 = -1;
				Static110.aBoolean115 = false;
				return true;
			}
			if (Static38.anInt1078 == 127) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				local322 = Static35.aClass1_Sub5_Sub1_1.method641();
				local130 = Static35.aClass1_Sub5_Sub1_1.method665();
				local936 = Static46.method968(local318);
				local936.anInt1917 = local322 + local936.anInt1918;
				Static38.anInt1078 = -1;
				local936.anInt1959 = local130 + local936.anInt1936;
				return true;
			}
			if (Static38.anInt1078 == 233) {
				Static9.anInt244 = Static35.aClass1_Sub5_Sub1_1.method642();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 220) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method657();
				local322 = Static35.aClass1_Sub5_Sub1_1.method657();
				local130 = Static35.aClass1_Sub5_Sub1_1.method642();
				if (local130 == 65535) {
					local130 = -1;
				}
				local936 = Static46.method968(local322);
				@Pc(2897) Class1_Sub2_Sub16 local2897;
				if (local936.aBoolean90) {
					local936.anInt1903 = local318;
					local936.anInt1904 = local130;
					local2897 = Static33.method736(local130);
					local936.anInt1962 = local2897.anInt2136;
					local936.anInt1935 = local2897.anInt2161;
					local936.anInt1902 = local2897.anInt2151;
					local936.anInt1963 = local2897.anInt2150;
					if (local936.anInt1911 > 0) {
						local936.anInt1962 = local936.anInt1962 * 32 / local936.anInt1911;
					}
					local936.anInt1924 = local2897.anInt2113;
					local936.anInt1943 = local2897.anInt2126;
					Static32.method728(local936);
				} else if (local130 == -1) {
					Static38.anInt1078 = -1;
					local936.anInt1930 = 0;
					return true;
				} else {
					local2897 = Static33.method736(local130);
					local936.anInt1902 = local2897.anInt2151;
					local936.anInt1962 = local2897.anInt2136 * 100 / local318;
					local936.anInt1924 = local2897.anInt2113;
					local936.anInt1951 = local130;
					local936.anInt1930 = 4;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 3) {
				Static77.method1292(false);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 195) {
				Static50.anInt1233 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 58) {
				Static105.anInt2386 = Static35.aClass1_Sub5_Sub1_1.method677() * 30;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 214) {
				if (Static90.anInt2027 == 12) {
					Static90.aBoolean98 = true;
				}
				Static39.anInt1095 = Static35.aClass1_Sub5_Sub1_1.method668();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 190) {
				Static37.method858();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 32) {
				local1260 = Static35.aClass1_Sub5_Sub1_1.method654();
				local322 = Static35.aClass1_Sub5_Sub1_1.method630();
				local130 = Static35.aClass1_Sub5_Sub1_1.method648();
				if (local130 >= 1 && local130 <= 5) {
					if (local1260.method786(Static11.aClass25_147)) {
						local1260 = null;
					}
					Static50.aClass25Array6[local130 - 1] = local1260;
					Static127.aBooleanArray14[local130 - 1] = local322 == 0;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 219) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method651();
				@Pc(3114) byte local3114 = Static35.aClass1_Sub5_Sub1_1.method680();
				Static24.anIntArray148[local318] = local3114;
				if (local3114 != Static95.anIntArray385[local318]) {
					Static95.anIntArray385[local318] = local3114;
					Static67.method1137(local318);
					if (Static108.anInt2502 != -1) {
						Static110.aBoolean113 = true;
					}
					Static90.aBoolean98 = true;
				}
				Static62.anInt1392 = Static60.anInt1366;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 133) {
				Static95.anInt2170 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static122.anInt2923 = Static35.aClass1_Sub5_Sub1_1.method630();
				for (local318 = Static122.anInt2923; local318 < Static122.anInt2923 + 8; local318++) {
					for (local322 = Static95.anInt2170; local322 < Static95.anInt2170 + 8; local322++) {
						if (Static7.aClass2ArrayArrayArray1[Static21.anInt596][local318][local322] != null) {
							Static7.aClass2ArrayArrayArray1[Static21.anInt596][local318][local322] = null;
							Static8.method232(local322, local318);
						}
					}
				}
				for (@Pc(3208) Class1_Sub16 local3208 = (Class1_Sub16) Static38.aClass2_5.method22(); local3208 != null; local3208 = (Class1_Sub16) Static38.aClass2_5.method23()) {
					if (Static122.anInt2923 <= local3208.anInt2584 && Static122.anInt2923 + 8 > local3208.anInt2584 && Static95.anInt2170 <= local3208.anInt2579 && Static95.anInt2170 + 8 > local3208.anInt2579 && Static21.anInt596 == local3208.anInt2589) {
						local3208.anInt2585 = 0;
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 93) {
				Static68.method1143();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 194) {
				Static90.anInt2027 = Static35.aClass1_Sub5_Sub1_1.method671();
				Static90.aBoolean98 = true;
				Static120.aBoolean126 = true;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 247) {
				Static95.anInt2170 = Static35.aClass1_Sub5_Sub1_1.method630();
				Static122.anInt2923 = Static35.aClass1_Sub5_Sub1_1.method648();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 210) {
				for (local318 = 0; local318 < Static95.anIntArray385.length; local318++) {
					if (Static24.anIntArray148[local318] != Static95.anIntArray385[local318]) {
						Static95.anIntArray385[local318] = Static24.anIntArray148[local318];
						Static67.method1137(local318);
						Static90.aBoolean98 = true;
					}
				}
				Static38.anInt1078 = -1;
				Static62.anInt1392 = Static60.anInt1366;
				return true;
			}
			@Pc(3358) Class1_Sub2_Sub14 local3358;
			if (Static38.anInt1078 == 123) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method657();
				local3358 = Static46.method968(local318);
				for (local130 = 0; local130 < local3358.anIntArray341.length; local130++) {
					local3358.anIntArray341[local130] = -1;
					local3358.anIntArray341[local130] = 0;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 216) {
				Static35.aClass1_Sub5_Sub1_1.method663();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 79) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method663();
				@Pc(3409) boolean local3409 = Static35.aClass1_Sub5_Sub1_1.method671() == 1;
				local338 = Static46.method968(local318);
				local338.aBoolean89 = local3409;
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 137) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method642();
				local322 = Static35.aClass1_Sub5_Sub1_1.method670();
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static110.aBoolean113 = true;
					Static33.anInt916 = -1;
				}
				if (Static67.anInt1470 != -1) {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = -1;
					Static99.method1645(30);
				}
				if (Static93.anInt2098 != -1) {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = -1;
				}
				if (Static108.anInt2497 == local318) {
					Static45.method959(Static108.anInt2497);
				} else {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = local318;
				}
				if (local322 == Static33.anInt922) {
					Static45.method959(Static33.anInt922);
				} else {
					Static101.method1677(Static33.anInt922);
					Static33.anInt922 = local322;
				}
				Static120.aBoolean126 = true;
				Static90.aBoolean98 = true;
				Static33.anInt917 = -1;
				if (Static104.anInt2372 != 0) {
					Static104.anInt2372 = 0;
					Static110.aBoolean113 = true;
				}
				Static70.method1094(Static108.anInt2497);
				Static70.method1094(Static33.anInt922);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 245) {
				Static122.anInt2923 = Static35.aClass1_Sub5_Sub1_1.method671();
				Static95.anInt2170 = Static35.aClass1_Sub5_Sub1_1.method630();
				while (Static35.aClass1_Sub5_Sub1_1.anInt792 < Static110.anInt2558) {
					Static38.anInt1078 = Static35.aClass1_Sub5_Sub1_1.method672();
					Static16.method378();
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 218) {
				Static84.aBoolean82 = false;
				for (local318 = 0; local318 < 5; local318++) {
					Static78.aBooleanArray7[local318] = false;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 73) {
				Static61.anInt1383 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 119) {
				local126 = Static35.aClass1_Sub5_Sub1_1.method669();
				local130 = Static35.aClass1_Sub5_Sub1_1.method651();
				local346 = Static35.aClass1_Sub5_Sub1_1.method672();
				@Pc(3604) Class25 local3604 = Static24.method575(local126).method772();
				for (local175 = 0; local175 < Static80.anInt1786; local175++) {
					if (Static129.aLongArray6[local175] == local126) {
						if (Static47.anIntArray241[local175] != local130) {
							Static47.anIntArray241[local175] = local130;
							Static90.aBoolean98 = true;
							if (local130 > 0) {
								Static25.method584(5, Static116.method1859(new Class25[] { local3604, Static78.aClass25_820 }), Static92.aClass25_985);
							}
							if (local130 == 0) {
								Static25.method584(5, Static116.method1859(new Class25[] { local3604, Static15.aClass25_215 }), Static92.aClass25_985);
							}
						}
						Static3.anIntArray12[local175] = local346;
						local3604 = null;
						break;
					}
				}
				if (local3604 != null && Static80.anInt1786 < 200) {
					Static129.aLongArray6[Static80.anInt1786] = local126;
					Static118.aClass25Array22[Static80.anInt1786] = local3604;
					Static47.anIntArray241[Static80.anInt1786] = local130;
					Static3.anIntArray12[Static80.anInt1786] = local346;
					Static90.aBoolean98 = true;
					Static80.anInt1786++;
					Static62.anInt1392 = Static60.anInt1366;
				}
				local2242 = Static80.anInt1786;
				while (local2242 > 0) {
					@Pc(3723) boolean local3723 = true;
					local2242--;
					for (local2249 = 0; local2249 < local2242; local2249++) {
						if (Static47.anIntArray241[local2249] != Static48.anInt1226 && Static48.anInt1226 == Static47.anIntArray241[local2249 + 1] || Static47.anIntArray241[local2249] == 0 && Static47.anIntArray241[local2249 + 1] != 0) {
							local3723 = false;
							local1789 = Static47.anIntArray241[local2249];
							Static47.anIntArray241[local2249] = Static47.anIntArray241[local2249 + 1];
							Static47.anIntArray241[local2249 + 1] = local1789;
							@Pc(3782) Class25 local3782 = Static118.aClass25Array22[local2249];
							Static118.aClass25Array22[local2249] = Static118.aClass25Array22[local2249 + 1];
							Static118.aClass25Array22[local2249 + 1] = local3782;
							@Pc(3800) long local3800 = Static129.aLongArray6[local2249];
							Static129.aLongArray6[local2249] = Static129.aLongArray6[local2249 + 1];
							Static129.aLongArray6[local2249 + 1] = local3800;
							local1799 = Static3.anIntArray12[local2249];
							Static3.anIntArray12[local2249] = Static3.anIntArray12[local2249 + 1];
							Static3.anIntArray12[local2249 + 1] = local1799;
							Static90.aBoolean98 = true;
						}
					}
					if (local3723) {
						break;
					}
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 255 || Static38.anInt1078 == 223 || Static38.anInt1078 == 20 || Static38.anInt1078 == 202 || Static38.anInt1078 == 122 || Static38.anInt1078 == 180 || Static38.anInt1078 == 243 || Static38.anInt1078 == 113 || Static38.anInt1078 == 27 || Static38.anInt1078 == 22 || Static38.anInt1078 == 124) {
				Static16.method378();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 128) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method661();
				local3358 = Static46.method968(local318);
				local3358.anInt1930 = 3;
				local3358.anInt1951 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2.method1853();
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 159) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method670();
				local322 = Static35.aClass1_Sub5_Sub1_1.method670();
				Static77.method1294(local318);
				if (local322 != -1) {
					Static77.method1294(local322);
				}
				if (Static108.anInt2497 != -1) {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = -1;
				}
				if (Static33.anInt922 != -1) {
					Static101.method1677(Static33.anInt922);
					Static33.anInt922 = -1;
				}
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
				}
				if (Static67.anInt1470 == local318) {
					Static45.method959(Static67.anInt1470);
				} else {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = local318;
					Static99.method1645(35);
				}
				if (Static93.anInt2098 == local318) {
					Static45.method959(Static93.anInt2098);
				} else {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = local322;
				}
				Static33.anInt917 = -1;
				Static104.anInt2372 = 0;
				Static70.method1094(Static67.anInt1470);
				Static70.method1094(Static93.anInt2098);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 35) {
				Static62.method1092();
				Static38.anInt1078 = -1;
				return false;
			}
			if (Static38.anInt1078 == 152) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method677();
				Static77.method1294(local318);
				if (Static33.anInt922 != -1) {
					Static101.method1677(Static33.anInt922);
					Static120.aBoolean126 = true;
					Static33.anInt922 = -1;
					Static90.aBoolean98 = true;
				}
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
					Static110.aBoolean113 = true;
				}
				if (Static67.anInt1470 != -1) {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = -1;
					Static99.method1645(30);
				}
				if (Static93.anInt2098 != -1) {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = -1;
				}
				if (local318 == Static108.anInt2497) {
					Static45.method959(Static108.anInt2497);
				} else {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = local318;
				}
				if (Static104.anInt2372 != 0) {
					Static104.anInt2372 = 0;
					Static110.aBoolean113 = true;
				}
				Static33.anInt917 = -1;
				Static70.method1094(Static108.anInt2497);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 178) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method677();
				Static77.method1294(local318);
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static110.aBoolean113 = true;
					Static33.anInt916 = -1;
				}
				if (Static67.anInt1470 != -1) {
					Static101.method1677(Static67.anInt1470);
					Static67.anInt1470 = -1;
					Static99.method1645(30);
				}
				if (Static93.anInt2098 != -1) {
					Static101.method1677(Static93.anInt2098);
					Static93.anInt2098 = -1;
				}
				if (Static108.anInt2497 != -1) {
					Static101.method1677(Static108.anInt2497);
					Static108.anInt2497 = -1;
				}
				if (local318 == Static33.anInt922) {
					Static45.method959(Static33.anInt922);
				} else {
					Static101.method1677(Static33.anInt922);
					Static33.anInt922 = local318;
				}
				if (Static104.anInt2372 != 0) {
					Static104.anInt2372 = 0;
					Static110.aBoolean113 = true;
				}
				Static90.aBoolean98 = true;
				Static33.anInt917 = -1;
				Static120.aBoolean126 = true;
				Static70.method1094(Static33.anInt922);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 182) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method679();
				local322 = Static35.aClass1_Sub5_Sub1_1.method661();
				local338 = Static46.method968(local322);
				if (local318 != local338.anInt1946 || local318 == -1) {
					local338.anInt1940 = 0;
					local338.anInt1929 = 0;
					local338.anInt1946 = local318;
				}
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 15) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method651();
				local322 = Static35.aClass1_Sub5_Sub1_1.method672();
				local130 = Static35.aClass1_Sub5_Sub1_1.method651();
				Static25.method590(local318, local130, local322);
				Static38.anInt1078 = -1;
				return true;
			}
			if (Static38.anInt1078 == 25) {
				local318 = Static35.aClass1_Sub5_Sub1_1.method642();
				Static48.method979(local318);
				Static38.anInt1078 = -1;
				Static27.anInt743 = Static60.anInt1366;
				return true;
			}
			if (Static38.anInt1078 == 37) {
				Static50.anInt1235 = Static35.aClass1_Sub5_Sub1_1.method672();
				Static90.aBoolean98 = true;
				Static38.anInt1078 = -1;
				Static62.anInt1392 = Static60.anInt1366;
				return true;
			}
			if (Static38.anInt1078 == 70) {
				Static92.aClass25_987 = Static35.aClass1_Sub5_Sub1_1.method654();
				if (Static33.anInt916 != -1) {
					Static101.method1677(Static33.anInt916);
					Static33.anInt916 = -1;
				}
				Static38.anInt1078 = -1;
				Static110.aBoolean115 = false;
				Static92.aClass25_989 = Static92.aClass25_985;
				Static110.aBoolean113 = true;
				Static104.anInt2372 = 4;
				return true;
			}
			Static120.method1980("T1 - " + Static38.anInt1078 + "," + Static33.anInt911 + "," + Static76.anInt1593 + " - " + Static110.anInt2558, null);
			Static62.method1092();
		} catch (@Pc(4369) IOException local4369) {
			Static52.method1008();
		} catch (@Pc(4373) Exception local4373) {
			@Pc(4414) String local4414 = "T2 - " + Static38.anInt1078 + "," + Static33.anInt911 + "," + Static76.anInt1593 + " - " + Static110.anInt2558 + "," + (Static46.anInt1190 + Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0]) + "," + (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0] + Static47.anInt1211) + " - ";
			for (local322 = 0; local322 < Static110.anInt2558 && local322 < 50; local322++) {
				local4414 = local4414 + Static35.aClass1_Sub5_Sub1_1.aByteArray13[local322] + ",";
			}
			Static120.method1980(local4414, local4373);
			Static62.method1092();
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!mf;BIZBI)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(16) Class1_Sub2_Sub12 local16 = (Class1_Sub2_Sub12) Static75.aClass66_12.method1650(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static90.aClass66_13.method1650(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static37.aClass66_7.method1650(local10);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class1_Sub2_Sub12) Static70.aClass66_9.method1650(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub2_Sub12();
			local16.aClass56_Sub1_13 = arg1;
			local16.anInt1780 = arg5;
			local16.aByte4 = arg4;
			if (arg3) {
				Static75.aClass66_12.method1653(local16, local10);
				Static30.anInt823++;
			} else {
				Static127.aClass27_2.method896(local16);
				Static37.aClass66_7.method1653(local16, local10);
				Static60.anInt1364++;
			}
		} else if (arg3) {
			local16.method1964();
			Static75.aClass66_12.method1653(local16, local10);
			Static60.anInt1364--;
			Static30.anInt823++;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public static void method1781() {
		anIntArray429 = null;
		aClass25_1238 = null;
		aClass56_78 = null;
		anImage5 = null;
		aClass56_79 = null;
		aClass25_1241 = null;
		aClass25_1239 = null;
		anIntArray430 = null;
		aClass25_1240 = null;
		anIntArrayArray26 = null;
		aClass25_1242 = null;
		aClass25_1243 = null;
		aClass25_1235 = null;
		aClass25_1237 = null;
		aClass25_1236 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
	public static void method1782(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static110.method1775(arg0 - 1L);
			Static110.method1775(1L);
		} else {
			Static110.method1775(arg0);
		}
	}
}
