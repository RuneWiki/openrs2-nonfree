import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_261 = Static161.method2971("Hier wechseln");

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_262 = Static161.method2971("Walk here");

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_263 = aClass13_262;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	public static int[] anIntArray100 = new int[50];

	@OriginalMember(owner = "client!c", name = "A", descriptor = "Lclient!dd;")
	public static Class13 aClass13_264 = Static161.method2971(" loggt sich ein)3");

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[Lclient!nf;")
	public static Class59[] aClass59Array1 = new Class59[5000];

	@OriginalMember(owner = "client!c", name = "H", descriptor = "I")
	public static int anInt726 = 1;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!dd;")
	public static Class13 aClass13_265 = Static161.method2971("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V")
	public static void method651(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static29.anIntArray115[arg0];
		@Pc(22) int local22 = Static147.aShortArray41[arg0];
		@Pc(26) int local26 = Static65.anIntArray199[arg0];
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(37) int local37 = (int) Static130.aLongArray6[arg0];
		@Pc(41) long local41 = Static130.aLongArray6[arg0];
		@Pc(50) Class20 local50;
		if (local22 == 58) {
			@Pc(46) boolean local46 = true;
			local50 = Static119.method2230(local26);
			if (local50.anInt1586 > 0) {
				local46 = Static48.method1223(local50);
			}
			if (local46) {
				Static1.aClass1_Sub8_Sub1_1.method1654(112);
				Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			}
		}
		if (local22 == 33) {
			Static109.method2126();
		}
		@Pc(101) boolean local101;
		if (local22 == 18) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static98.anInt3739 = 2;
			Static101.anInt2831 = 0;
			Static151.anInt4127 = Static122.anInt3191;
			Static119.anInt3146 = Static8.anInt293;
			Static1.aClass1_Sub8_Sub1_1.method1654(9);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static153.anInt3629 + local13);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1650(local37);
		}
		if (local22 == 4) {
			Static65.method1440(Static156.anInt3696, local13, local26);
		}
		if (local22 == 57 && Static104.method2058(local13, local41, local26)) {
			Static1.aClass1_Sub8_Sub1_1.method1654(116);
			Static1.aClass1_Sub8_Sub1_1.method1614(local26 + Static60.anInt1864);
			Static1.aClass1_Sub8_Sub1_1.method1650((int) (local41 >>> 32) & Integer.MAX_VALUE);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1606(Static140.anInt3474);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static156.anInt3693);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static129.anInt3267);
		}
		@Pc(223) Class1_Sub2_Sub2_Sub2_Sub2 local223;
		if (local22 == 20) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static98.anInt3739 = 2;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(226);
				Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			}
		}
		if (local22 == 5) {
			Static1.aClass1_Sub8_Sub1_1.method1654(121);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13);
			Static1.aClass1_Sub8_Sub1_1.method1640(local26);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 29) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(243);
				Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			}
		}
		if (local22 == 51) {
			Static1.aClass1_Sub8_Sub1_1.method1654(61);
			Static1.aClass1_Sub8_Sub1_1.method1621(local26);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			Static1.aClass1_Sub8_Sub1_1.method1629(local13);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 8) {
			Static1.aClass1_Sub8_Sub1_1.method1654(247);
			Static1.aClass1_Sub8_Sub1_1.method1650(local13);
			Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 38) {
			Static1.aClass1_Sub8_Sub1_1.method1654(68);
			Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			Static1.aClass1_Sub8_Sub1_1.method1629(local13);
			Static1.aClass1_Sub8_Sub1_1.method1606(local26);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 9) {
			Static1.aClass1_Sub8_Sub1_1.method1654(20);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			Static1.aClass1_Sub8_Sub1_1.method1629(local13);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 2 || local22 == 1007) {
			Static45.method1187(local37, local13, Static164.aClass13Array27[arg0], local26);
		}
		if (local22 == 34) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static98.anInt3739 = 2;
				Static119.anInt3146 = Static8.anInt293;
				Static151.anInt4127 = Static122.anInt3191;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(66);
				Static1.aClass1_Sub8_Sub1_1.method1614(Static156.anInt3693);
				Static1.aClass1_Sub8_Sub1_1.method1614(Static129.anInt3267);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
				Static1.aClass1_Sub8_Sub1_1.method1606(Static140.anInt3474);
			}
		}
		if (local22 == 49) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static101.anInt2831 = 0;
			Static151.anInt4127 = Static122.anInt3191;
			Static98.anInt3739 = 2;
			Static119.anInt3146 = Static8.anInt293;
			Static1.aClass1_Sub8_Sub1_1.method1654(155);
			Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			Static1.aClass1_Sub8_Sub1_1.method1650(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static60.anInt1864 + local26);
		}
		if (local22 == 11) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static151.anInt4127 = Static122.anInt3191;
			Static101.anInt2831 = 0;
			Static98.anInt3739 = 2;
			Static119.anInt3146 = Static8.anInt293;
			Static1.aClass1_Sub8_Sub1_1.method1654(252);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1650(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static129.anInt3267);
			Static1.aClass1_Sub8_Sub1_1.method1635(Static140.anInt3474);
			Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static156.anInt3693);
		}
		if (local22 == 1002) {
			Static101.anInt2831 = 0;
			Static98.anInt3739 = 2;
			Static151.anInt4127 = Static122.anInt3191;
			Static119.anInt3146 = Static8.anInt293;
			Static1.aClass1_Sub8_Sub1_1.method1654(176);
			Static1.aClass1_Sub8_Sub1_1.method1629(local37);
		}
		@Pc(770) Class1_Sub2_Sub2_Sub2_Sub1 local770;
		if (local22 == 45) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static101.anInt2831 = 0;
				Static98.anInt3739 = 2;
				Static119.anInt3146 = Static8.anInt293;
				Static1.aClass1_Sub8_Sub1_1.method1654(220);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			}
		}
		if (local22 == 15) {
			Static104.method2058(local13, local41, local26);
			Static1.aClass1_Sub8_Sub1_1.method1654(92);
			Static1.aClass1_Sub8_Sub1_1.method1629(Integer.MAX_VALUE & (int) (local41 >>> 32));
			Static1.aClass1_Sub8_Sub1_1.method1614(Static153.anInt3629 + local13);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static60.anInt1864 + local26);
		}
		if (local22 == 47) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(69);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			}
		}
		if (local22 == 32) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static101.anInt2831 = 0;
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(13);
				Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			}
		}
		if (local22 == 24) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static98.anInt3739 = 2;
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(196);
				Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			}
		}
		if (local22 == 48) {
			Static104.method2058(local13, local41, local26);
			Static1.aClass1_Sub8_Sub1_1.method1654(74);
			Static1.aClass1_Sub8_Sub1_1.method1632(Integer.MAX_VALUE & (int) (local41 >>> 32));
			Static1.aClass1_Sub8_Sub1_1.method1629(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1629(local26 + Static60.anInt1864);
		}
		if (local22 == 30 && Static89.aClass20_7 == null) {
			Static104.method2059(local26, local13);
			Static89.aClass20_7 = Static15.method628(local26, local13);
			Static125.method2300(Static89.aClass20_7);
		}
		if (local22 == 42) {
			Static1.aClass1_Sub8_Sub1_1.method1654(157);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			Static1.aClass1_Sub8_Sub1_1.method1650(local13);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 50) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static101.anInt2831 = 0;
				Static119.anInt3146 = Static8.anInt293;
				Static1.aClass1_Sub8_Sub1_1.method1654(118);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			}
		}
		if (local22 == 12) {
			Static1.aClass1_Sub8_Sub1_1.method1654(42);
			Static1.aClass1_Sub8_Sub1_1.method1614(local13);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static24.anInt870);
			Static1.aClass1_Sub8_Sub1_1.method1640(local26);
			Static1.aClass1_Sub8_Sub1_1.method1640(Static157.anInt3723);
		}
		if (local22 == 7) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static101.anInt2831 = 0;
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(249);
				Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			}
		}
		if (local22 == 13) {
			Static1.aClass1_Sub8_Sub1_1.method1654(111);
			Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13);
			Static1.aClass1_Sub8_Sub1_1.method1621(local26);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 28) {
			Static1.aClass1_Sub8_Sub1_1.method1654(142);
			Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			Static1.aClass1_Sub8_Sub1_1.method1606(local26);
			Static1.aClass1_Sub8_Sub1_1.method1650(local13);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 6) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static98.anInt3739 = 2;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(47);
				Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			}
		}
		if (local22 == 1006) {
			Static98.anInt3739 = 2;
			Static151.anInt4127 = Static122.anInt3191;
			Static119.anInt3146 = Static8.anInt293;
			Static101.anInt2831 = 0;
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				@Pc(1426) Class1_Sub2_Sub19 local1426 = local770.aClass1_Sub2_Sub19_1;
				if (local1426.anIntArray430 != null) {
					local1426 = local1426.method2798();
				}
				if (local1426 != null) {
					Static1.aClass1_Sub8_Sub1_1.method1654(59);
					Static1.aClass1_Sub8_Sub1_1.method1650(local1426.anInt3854);
				}
			}
		}
		if (local22 == 41) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static119.anInt3146 = Static8.anInt293;
			Static98.anInt3739 = 2;
			Static151.anInt4127 = Static122.anInt3191;
			Static101.anInt2831 = 0;
			Static1.aClass1_Sub8_Sub1_1.method1654(26);
			Static1.aClass1_Sub8_Sub1_1.method1635(Static157.anInt3723);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static24.anInt870);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
		}
		if (local22 == 16) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static119.anInt3146 = Static8.anInt293;
				Static151.anInt4127 = Static122.anInt3191;
				Static101.anInt2831 = 0;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(79);
				Static1.aClass1_Sub8_Sub1_1.method1629(local37);
				Static1.aClass1_Sub8_Sub1_1.method1629(Static24.anInt870);
				Static1.aClass1_Sub8_Sub1_1.method1635(Static157.anInt3723);
			}
		}
		if (local22 == 39) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(138);
				Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			}
		}
		if (local22 == 26) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(225);
				Static1.aClass1_Sub8_Sub1_1.method1650(local37);
			}
		}
		if (local22 == 14) {
			Static104.method2058(local13, local41, local26);
			Static1.aClass1_Sub8_Sub1_1.method1654(171);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1614(Integer.MAX_VALUE & (int) (local41 >>> 32));
			Static1.aClass1_Sub8_Sub1_1.method1629(local13 + Static153.anInt3629);
		}
		if (local22 == 19) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static101.anInt2831 = 0;
			Static119.anInt3146 = Static8.anInt293;
			Static151.anInt4127 = Static122.anInt3191;
			Static98.anInt3739 = 2;
			Static1.aClass1_Sub8_Sub1_1.method1654(136);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1614(Static153.anInt3629 + local13);
			Static1.aClass1_Sub8_Sub1_1.method1629(local37);
		}
		if (local22 == 10) {
			Static1.aClass1_Sub8_Sub1_1.method1654(32);
			Static1.aClass1_Sub8_Sub1_1.method1629(local13);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 36) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static119.anInt3146 = Static8.anInt293;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(34);
				Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			}
		}
		if (local22 == 43) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static101.anInt2831 = 0;
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static119.anInt3146 = Static8.anInt293;
				Static1.aClass1_Sub8_Sub1_1.method1654(140);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			}
		}
		if (local22 == 35) {
			Static104.method2058(local13, local41, local26);
			Static1.aClass1_Sub8_Sub1_1.method1654(40);
			Static1.aClass1_Sub8_Sub1_1.method1614(local26 + Static60.anInt1864);
			Static1.aClass1_Sub8_Sub1_1.method1650((int) (local41 >>> 32) & Integer.MAX_VALUE);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static153.anInt3629 + local13);
		}
		@Pc(2048) int local2048;
		if (local22 == 22) {
			Static1.aClass1_Sub8_Sub1_1.method1654(112);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			local50 = Static119.method2230(local26);
			if (local50.anIntArrayArray9 != null && local50.anIntArrayArray9[0][0] == 5) {
				local2048 = local50.anIntArrayArray9[0][1];
				if (Static103.anIntArray266[local2048] != local50.anIntArray169[0]) {
					Static103.anIntArray266[local2048] = local50.anIntArray169[0];
					Static145.method2572(local2048);
				}
			}
		}
		if (local22 == 37) {
			Static1.aClass1_Sub8_Sub1_1.method1654(112);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			local50 = Static119.method2230(local26);
			if (local50.anIntArrayArray9 != null && local50.anIntArrayArray9[0][0] == 5) {
				local2048 = local50.anIntArrayArray9[0][1];
				Static103.anIntArray266[local2048] = 1 - Static103.anIntArray266[local2048];
				Static145.method2572(local2048);
			}
		}
		if (local22 == 1005) {
			Static151.anInt4127 = Static122.anInt3191;
			Static119.anInt3146 = Static8.anInt293;
			Static98.anInt3739 = 2;
			Static101.anInt2831 = 0;
			Static1.aClass1_Sub8_Sub1_1.method1654(122);
			Static1.aClass1_Sub8_Sub1_1.method1614(local37);
		}
		if (local22 == 23) {
			local223 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local37];
			if (local223 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local223.anIntArray246[0], local223.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static119.anInt3146 = Static8.anInt293;
				Static151.anInt4127 = Static122.anInt3191;
				Static98.anInt3739 = 2;
				Static101.anInt2831 = 0;
				Static1.aClass1_Sub8_Sub1_1.method1654(90);
				Static1.aClass1_Sub8_Sub1_1.method1629(Static24.anInt870);
				Static1.aClass1_Sub8_Sub1_1.method1606(Static157.anInt3723);
				Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			}
		}
		if (local22 == 40 && Static104.method2058(local13, local41, local26)) {
			Static1.aClass1_Sub8_Sub1_1.method1654(187);
			Static1.aClass1_Sub8_Sub1_1.method1650((int) (local41 >>> 32) & Integer.MAX_VALUE);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static24.anInt870);
			Static1.aClass1_Sub8_Sub1_1.method1606(Static157.anInt3723);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static153.anInt3629 + local13);
		}
		if (local22 == 21) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static119.anInt3146 = Static8.anInt293;
			Static98.anInt3739 = 2;
			Static151.anInt4127 = Static122.anInt3191;
			Static101.anInt2831 = 0;
			Static1.aClass1_Sub8_Sub1_1.method1654(190);
			Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			Static1.aClass1_Sub8_Sub1_1.method1632(local26 + Static60.anInt1864);
			Static1.aClass1_Sub8_Sub1_1.method1632(Static153.anInt3629 + local13);
		}
		if (local22 == 31) {
			local50 = Static15.method628(local26, local13);
			if (local50 != null) {
				Static67.method1453();
				Static114.method2197(local26, Static54.method1315(Static53.method1292(local50)), local13);
				Static116.anInt3103 = 0;
				Static113.aClass13_1022 = method652(local50);
				if (Static113.aClass13_1022 == null) {
					Static113.aClass13_1022 = Static108.aClass13_977;
				}
				if (!local50.aBoolean118) {
					Static147.aClass13_1236 = Static57.method1349(new Class13[] { Static75.aClass13_724, local50.aClass13_542, Static103.aClass13_950 });
					return;
				}
				Static147.aClass13_1236 = Static57.method1349(new Class13[] { local50.aClass13_540, Static103.aClass13_950 });
			}
			return;
		}
		if (local22 == 17) {
			Static1.aClass1_Sub8_Sub1_1.method1654(83);
			Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			Static1.aClass1_Sub8_Sub1_1.method1635(local26);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static24.anInt870);
			Static1.aClass1_Sub8_Sub1_1.method1640(Static157.anInt3723);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 1004) {
			local50 = Static119.method2230(local26);
			if (local50 == null || local50.anIntArray163[local13] < 100000) {
				Static1.aClass1_Sub8_Sub1_1.method1654(122);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
			} else {
				Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { Static3.method75(local50.anIntArray163[local13]), Static82.aClass13_768, Static184.method2994(local37).aClass13_463 }), 0);
			}
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 1) {
			local770 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local37];
			if (local770 != null) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local770.anIntArray246[0], local770.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				Static119.anInt3146 = Static8.anInt293;
				Static151.anInt4127 = Static122.anInt3191;
				Static101.anInt2831 = 0;
				Static98.anInt3739 = 2;
				Static1.aClass1_Sub8_Sub1_1.method1654(128);
				Static1.aClass1_Sub8_Sub1_1.method1614(local37);
				Static1.aClass1_Sub8_Sub1_1.method1640(Static140.anInt3474);
				Static1.aClass1_Sub8_Sub1_1.method1629(Static156.anInt3693);
				Static1.aClass1_Sub8_Sub1_1.method1632(Static129.anInt3267);
			}
		}
		if (local22 == 1003) {
			Static104.method2058(local13, local41, local26);
			Static1.aClass1_Sub8_Sub1_1.method1654(248);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13 + Static153.anInt3629);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static60.anInt1864 + local26);
			Static1.aClass1_Sub8_Sub1_1.method1614(Integer.MAX_VALUE & (int) (local41 >>> 32));
		}
		if (local22 == 44) {
			Static1.aClass1_Sub8_Sub1_1.method1654(25);
			Static1.aClass1_Sub8_Sub1_1.method1621(local26);
			Static1.aClass1_Sub8_Sub1_1.method1632(local13);
			Static1.aClass1_Sub8_Sub1_1.method1629(local37);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 3) {
			Static1.aClass1_Sub8_Sub1_1.method1654(132);
			Static1.aClass1_Sub8_Sub1_1.method1629(local13);
			Static1.aClass1_Sub8_Sub1_1.method1629(Static129.anInt3267);
			Static1.aClass1_Sub8_Sub1_1.method1621(Static140.anInt3474);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static156.anInt3693);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			Static1.aClass1_Sub8_Sub1_1.method1640(local26);
			Static8.anInt289 = 0;
			Static46.aClass20_3 = Static119.method2230(local26);
			Static69.anInt1983 = local13;
		}
		if (local22 == 46) {
			local101 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
			if (!local101) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local13, local26, 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
			}
			Static119.anInt3146 = Static8.anInt293;
			Static101.anInt2831 = 0;
			Static98.anInt3739 = 2;
			Static151.anInt4127 = Static122.anInt3191;
			Static1.aClass1_Sub8_Sub1_1.method1654(80);
			Static1.aClass1_Sub8_Sub1_1.method1632(local37);
			Static1.aClass1_Sub8_Sub1_1.method1629(local26 + Static60.anInt1864);
			Static1.aClass1_Sub8_Sub1_1.method1650(Static153.anInt3629 + local13);
		}
		if (local22 != 25) {
			if (Static116.anInt3103 != 0) {
				Static116.anInt3103 = 0;
				Static125.method2300(Static119.method2230(Static140.anInt3474));
			}
			if (Static118.aBoolean233) {
				Static67.method1453();
			}
			if (Static46.aClass20_3 != null && Static8.anInt289 == 0) {
				Static125.method2300(Static46.aClass20_3);
			}
			return;
		}
		Static67.method1453();
		local50 = Static119.method2230(local26);
		Static116.anInt3103 = 1;
		Static129.anInt3267 = local37;
		Static156.anInt3693 = local13;
		Static140.anInt3474 = local26;
		Static125.method2300(local50);
		Static141.aClass13_1202 = Static57.method1349(new Class13[] { Static185.aClass13_1419, Static184.method2994(local37).aClass13_463, Static103.aClass13_950 });
		if (Static141.aClass13_1202 == null) {
			Static141.aClass13_1202 = Static4.aClass13_39;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!fd;)Lclient!dd;")
	public static Class13 method652(@OriginalArg(1) Class20 arg0) {
		if (Static54.method1315(Static53.method1292(arg0)) == 0) {
			return null;
		} else if (arg0.aClass13_548 == null || arg0.aClass13_548.method897().method904() == 0) {
			return Static184.aBoolean317 ? Static77.aClass13_730 : null;
		} else {
			return arg0.aClass13_548;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z")
	public static boolean method653(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method654() {
		Static119.aClass47_24.method1995();
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lclient!da;")
	public static Class1_Sub2_Sub5 method655() {
		if (Static8.aClass1_Sub2_Sub5_1 == null) {
			Static8.aClass1_Sub2_Sub5_1 = new Class1_Sub2_Sub5();
		}
		return Static8.aClass1_Sub2_Sub5_1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method656() {
		aClass13_263 = null;
		anIntArray100 = null;
		aClass13_261 = null;
		aClass59Array1 = null;
		aClass13_262 = null;
		aClass13_264 = null;
		aClass13_265 = null;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
	public static void method657() {
		Static27.aClass47_6.method1995();
	}
}
