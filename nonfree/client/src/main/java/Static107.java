import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1193 = Static2.method66("Examine");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1192 = aClass39_1193;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!qd;")
	public static Class54 aClass54_27 = new Class54(64);

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1195 = Static2.method66(" ");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1194 = aClass39_1195;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1197 = Static2.method66("Enter amount:");

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1196 = aClass39_1197;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1199 = Static2.method66("Unable to find ");

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1198 = aClass39_1199;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public static int anInt2653 = 128;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1201 = Static2.method66("Connection lost");

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1200 = aClass39_1201;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1203 = Static2.method66("flash1:");

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1202 = aClass39_1203;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1204 = Static2.method66("Okay");

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
	public static int[] anIntArray325 = new int[4000];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ld;BLclient!ta;)V")
	public static void method1860(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class36_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class34 local9 = Static41.aClass34_21;
		synchronized (Static41.aClass34_21) {
			for (@Pc(24) Class2_Sub9 local24 = (Class2_Sub9) Static41.aClass34_21.method872(); local24 != null; local24 = (Class2_Sub9) Static41.aClass34_21.method879()) {
				if (local24.aLong82 == (long) arg0 && arg1 == local24.aClass42_1 && local24.anInt1926 == 0) {
					local7 = local24.aByteArray17;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(74) byte[] local74 = arg1.method1157(arg0);
			arg2.method1787(arg1, local74, arg0, true);
		} else {
			arg2.method1787(arg1, local7, arg0, true);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public static void method1863() {
		aClass39_1194 = null;
		aClass39_1198 = null;
		aClass39_1199 = null;
		aClass39_1203 = null;
		aClass39_1196 = null;
		aClass39_1200 = null;
		aClass39_1195 = null;
		aClass39_1192 = null;
		anIntArray324 = null;
		aClass39_1202 = null;
		aClass54_27 = null;
		aClass39_1204 = null;
		aClass39_1201 = null;
		anIntArray325 = null;
		aClass39_1193 = null;
		aClass39_1197 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!ge;)V")
	public static void method1864(@OriginalArg(1) Class2_Sub1_Sub2_Sub3 arg0) {
		if (arg0.anInt2941 == Static64.anInt1889 || arg0.anInt2901 == -1 || arg0.anInt2937 != 0 || arg0.anInt2919 + 1 > Static69.method1439(arg0.anInt2901).anIntArray8[arg0.anInt2928]) {
			@Pc(35) int local35 = Static64.anInt1889 - arg0.anInt2900;
			@Pc(41) int local41 = arg0.anInt2941 - arg0.anInt2900;
			@Pc(51) int local51 = arg0.anInt2898 * 64 + arg0.anInt2926 * 128;
			@Pc(61) int local61 = arg0.anInt2898 * 64 + arg0.anInt2929 * 128;
			@Pc(71) int local71 = arg0.anInt2898 * 64 + arg0.anInt2917 * 128;
			arg0.anInt2896 = (local71 * (local41 - local35) + local61 * local35) / local41;
			@Pc(95) int local95 = arg0.anInt2918 * 128 + arg0.anInt2898 * 64;
			arg0.anInt2899 = (local35 * local95 + local51 * (local41 - local35)) / local41;
		}
		if (arg0.anInt2927 == 0) {
			arg0.anInt2887 = 1024;
		}
		if (arg0.anInt2927 == 1) {
			arg0.anInt2887 = 1536;
		}
		if (arg0.anInt2927 == 2) {
			arg0.anInt2887 = 0;
		}
		arg0.anInt2908 = 0;
		if (arg0.anInt2927 == 3) {
			arg0.anInt2887 = 512;
		}
		arg0.anInt2909 = arg0.anInt2887;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method1865(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static95.anIntArray313[arg0];
		@Pc(16) int local16 = Static60.anIntArray215[arg0];
		@Pc(20) int local20 = Static8.anIntArray27[arg0];
		@Pc(24) int local24 = Static21.anIntArray326[arg0];
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		if (Static97.anInt2646 != 0 && local24 != 1004) {
			Static97.anInt2646 = 0;
			Static31.aBoolean91 = true;
		}
		@Pc(48) Class2_Sub1_Sub2_Sub3_Sub2 local48;
		if (local24 == 13) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static41.anInt1189 = 2;
				Static53.anInt1469 = 0;
				Static57.anInt1654 = Static2.anInt91;
				Static105.anInt2801 = Static93.anInt2442;
				Static50.aClass2_Sub5_Sub1_2.method1302(123);
				Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			}
		}
		@Pc(115) int local115;
		@Pc(140) int local140;
		@Pc(110) Class39 local110;
		if (local24 == 54 || local24 == 17) {
			local110 = Static26.aClass39Array7[arg0];
			local115 = local110.method1100(Static79.aClass39_1261);
			if (local115 != -1) {
				local110 = local110.method1099(local115 + 5).method1103();
				@Pc(136) Class39 local136 = local110.method1089().method1120();
				@Pc(138) boolean local138 = false;
				for (local140 = 0; local140 < Static61.anInt1740; local140++) {
					@Pc(148) Class2_Sub1_Sub2_Sub3_Sub1 local148 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local140]];
					if (local148 != null && local148.aClass39_1182 != null && local148.aClass39_1182.method1106(local136)) {
						local138 = true;
						Static22.method440(0, 1, 0, local148.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local148.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
						if (local24 == 54) {
							Static50.aClass2_Sub5_Sub1_2.method1302(21);
							Static50.aClass2_Sub5_Sub1_2.method1268(Static7.anIntArray21[local140]);
						}
						if (local24 == 17) {
							Static50.aClass2_Sub5_Sub1_2.method1302(234);
							Static50.aClass2_Sub5_Sub1_2.method1295(Static7.anIntArray21[local140]);
						}
						break;
					}
				}
				if (!local138) {
					Static87.method1642(Static20.method431(new Class39[] { aClass39_1198, local136 }), 0, Static86.aClass39_1048);
				}
			}
		}
		if (local24 == 33) {
			Static42.method833(local20, local12, local16);
			Static50.aClass2_Sub5_Sub1_2.method1302(208);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static75.anInt454 + local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20 >> 14 & 0x7FFF);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static19.anInt575 + local12);
		}
		if (local24 == 36) {
			Static50.aClass2_Sub5_Sub1_2.method1302(107);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local12);
			Static38.anInt1151 = local16;
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			Static71.anInt2029 = 2;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		@Pc(340) Class2_Sub1_Sub6 local340;
		if (local24 == 48) {
			local340 = Static90.method1705(local16);
			@Pc(342) boolean local342 = true;
			if (local340.anInt722 > 0) {
				local342 = Static66.method1374(local340);
			}
			if (local342) {
				Static50.aClass2_Sub5_Sub1_2.method1302(32);
				Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			}
		}
		if (local24 == 23) {
			Static50.aClass2_Sub5_Sub1_2.method1302(218);
			Static50.aClass2_Sub5_Sub1_2.method1249(local12);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static87.anInt2318);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			Static50.aClass2_Sub5_Sub1_2.method1274(Static92.anInt2391);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static61.anInt1741);
			Static88.anInt1139 = local12;
			Static38.anInt1151 = local16;
			Static96.anInt2639 = 0;
			Static71.anInt2029 = 2;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			if (local16 >> 16 == Static99.anInt2696) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 55) {
			Static50.aClass2_Sub5_Sub1_2.method1302(32);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			local340 = Static90.method1705(local16);
			if (local340.anIntArrayArray7 != null && local340.anIntArrayArray7[0][0] == 5) {
				local115 = local340.anIntArrayArray7[0][1];
				if (local340.anIntArray76[0] != Static28.anIntArray89[local115]) {
					Static28.anIntArray89[local115] = local340.anIntArray76[0];
					Static28.method563(local115);
					Static97.aBoolean120 = true;
				}
			}
		}
		if (local24 == 19) {
			local340 = Static90.method1705(local16);
			Static87.anInt2324 = 1;
			Static16.anInt461 = 0;
			Static23.aClass39_304 = local340.aClass39_340;
			Static39.anInt1170 = local340.anInt710;
			Static97.aBoolean120 = true;
			Static85.anInt2294 = local16;
			Static41.aClass39_516 = Static20.method431(new Class39[] { Static42.aClass39_536, local340.aClass39_339, Static79.aClass39_1261 });
			if (Static39.anInt1170 == 16) {
				Static77.anInt2108 = 3;
				Static97.aBoolean120 = true;
				aBoolean121 = true;
			}
			return;
		}
		@Pc(576) long local576;
		if (local24 == 10) {
			local110 = Static26.aClass39Array7[arg0];
			local115 = local110.method1100(Static79.aClass39_1261);
			if (local115 != -1) {
				local576 = local110.method1099(local115 + 5).method1103().method1090();
				local140 = -1;
				for (@Pc(580) int local580 = 0; local580 < Static72.anInt2061; local580++) {
					if (Static1.aLongArray1[local580] == local576) {
						local140 = local580;
						break;
					}
				}
				if (local140 != -1 && Static45.anIntArray177[local140] > 0) {
					Static31.aBoolean91 = true;
					Static86.aClass39_1056 = Static86.aClass39_1048;
					Static50.anInt1402 = 3;
					Static7.aBoolean5 = true;
					Static97.anInt2646 = 0;
					Static100.aLong78 = Static1.aLongArray1[local140];
					Static86.aClass39_1052 = Static20.method431(new Class39[] { Static30.aClass39_388, Static75.aClass39Array4[local140] });
				}
			}
		}
		@Pc(652) Class2_Sub1_Sub2_Sub3_Sub1 local652;
		if (local24 == 5) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(72);
				Static50.aClass2_Sub5_Sub1_2.method1263(Static85.anInt2294);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		if (local24 == 46) {
			Static50.aClass2_Sub5_Sub1_2.method1302(62);
			Static50.aClass2_Sub5_Sub1_2.method1274(local16);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			Static71.anInt2029 = 2;
			Static88.anInt1139 = local12;
			Static38.anInt1151 = local16;
			Static96.anInt2639 = 0;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			if (local16 >> 16 == Static99.anInt2696) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 44) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static57.anInt1654 = Static2.anInt91;
				Static41.anInt1189 = 2;
				Static53.anInt1469 = 0;
				Static105.anInt2801 = Static93.anInt2442;
				Static50.aClass2_Sub5_Sub1_2.method1302(10);
				Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			}
		}
		if (local24 == 35) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static57.anInt1654 = Static2.anInt91;
				Static41.anInt1189 = 2;
				Static50.aClass2_Sub5_Sub1_2.method1302(195);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		@Pc(902) boolean local902;
		if (local24 == 43) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static41.anInt1189 = 2;
			Static105.anInt2801 = Static93.anInt2442;
			Static57.anInt1654 = Static2.anInt91;
			Static53.anInt1469 = 0;
			Static50.aClass2_Sub5_Sub1_2.method1302(42);
			Static50.aClass2_Sub5_Sub1_2.method1268(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			Static50.aClass2_Sub5_Sub1_2.method1249(local12 + Static19.anInt575);
		}
		if (local24 == 1001) {
			local340 = Static90.method1705(local16);
			if (local340 == null || local340.anIntArray78[local12] < 100000) {
				Static50.aClass2_Sub5_Sub1_2.method1302(232);
				Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			} else {
				Static87.method1642(Static20.method431(new Class39[] { Static31.method1267(local340.anIntArray78[local12]), Static5.aClass39_54, Static66.method1384(local20).aClass39_588 }), 0, Static86.aClass39_1048);
			}
			Static38.anInt1151 = local16;
			Static71.anInt2029 = 2;
			Static88.anInt1139 = local12;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			Static96.anInt2639 = 0;
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 14) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static105.anInt2801 = Static93.anInt2442;
			Static41.anInt1189 = 2;
			Static53.anInt1469 = 0;
			Static57.anInt1654 = Static2.anInt91;
			Static50.aClass2_Sub5_Sub1_2.method1302(159);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static19.anInt575 + local12);
			Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static75.anInt454 + local16);
		}
		if (local24 == 37) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static57.anInt1654 = Static2.anInt91;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static50.aClass2_Sub5_Sub1_2.method1302(204);
				Static50.aClass2_Sub5_Sub1_2.method1257(Static61.anInt1741);
				Static50.aClass2_Sub5_Sub1_2.method1296(Static92.anInt2391);
				Static50.aClass2_Sub5_Sub1_2.method1249(Static87.anInt2318);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		if (local24 == 7) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static41.anInt1189 = 2;
			Static53.anInt1469 = 0;
			Static57.anInt1654 = Static2.anInt91;
			Static105.anInt2801 = Static93.anInt2442;
			Static50.aClass2_Sub5_Sub1_2.method1302(77);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static75.anInt454 + local16);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static19.anInt575 + local12);
		}
		if (local24 == 45) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(22);
				Static50.aClass2_Sub5_Sub1_2.method1298(Static92.anInt2391);
				Static50.aClass2_Sub5_Sub1_2.method1249(Static61.anInt1741);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
				Static50.aClass2_Sub5_Sub1_2.method1257(Static87.anInt2318);
			}
		}
		if (local24 == 27) {
			Static50.aClass2_Sub5_Sub1_2.method1302(176);
			Static50.aClass2_Sub5_Sub1_2.method1296(local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1257(local12);
			Static96.anInt2639 = 0;
			Static71.anInt2029 = 2;
			Static88.anInt1139 = local12;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			if (local16 >> 16 == Static99.anInt2696) {
				Static71.anInt2029 = 3;
			}
			Static38.anInt1151 = local16;
		}
		if (local24 == 30 && Static42.method833(local20, local12, local16)) {
			Static50.aClass2_Sub5_Sub1_2.method1302(185);
			Static50.aClass2_Sub5_Sub1_2.method1263(Static92.anInt2391);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20 >> 14 & 0x7FFF);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12 + Static19.anInt575);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static61.anInt1741);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static87.anInt2318);
			Static50.aClass2_Sub5_Sub1_2.method1295(local16 + Static75.anInt454);
		}
		if (local24 == 16) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(146);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		if (local24 == 56) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static50.aClass2_Sub5_Sub1_2.method1302(234);
				Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			}
		}
		if (local24 == 52) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static105.anInt2801 = Static93.anInt2442;
				Static50.aClass2_Sub5_Sub1_2.method1302(200);
				Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			}
		}
		if (local24 == 1006) {
			Static105.anInt2801 = Static93.anInt2442;
			Static53.anInt1469 = 0;
			Static41.anInt1189 = 2;
			Static57.anInt1654 = Static2.anInt91;
			Static50.aClass2_Sub5_Sub1_2.method1302(23);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20 >> 14 & 0x7FFF);
		}
		if (local24 == 12) {
			Static22.method439(Static41.anInt1197);
			Static41.anInt1197 = -1;
			Static31.aBoolean91 = true;
		}
		if (local24 == 53) {
			Static16.anInt461 = 1;
			Static92.anInt2391 = local16;
			Static61.anInt1741 = local12;
			Static87.anInt2318 = local20;
			Static87.aClass39_1062 = Static20.method431(new Class39[] { Static51.aClass39_1126, Static66.method1384(local20).aClass39_588, Static79.aClass39_1261 });
			Static87.anInt2324 = 0;
			if (Static87.aClass39_1062 == null) {
				Static87.aClass39_1062 = Static64.aClass39_831;
			}
			Static97.aBoolean120 = true;
			return;
		}
		if (local24 == 8) {
			Static50.aClass2_Sub5_Sub1_2.method1302(96);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1296(local16);
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			Static38.anInt1151 = local16;
			Static71.anInt2029 = 2;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 1002) {
			Static105.anInt2801 = Static93.anInt2442;
			Static41.anInt1189 = 2;
			Static53.anInt1469 = 0;
			Static57.anInt1654 = Static2.anInt91;
			Static50.aClass2_Sub5_Sub1_2.method1302(232);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20);
		}
		if (local24 == 41) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static41.anInt1189 = 2;
				Static53.anInt1469 = 0;
				Static57.anInt1654 = Static2.anInt91;
				Static105.anInt2801 = Static93.anInt2442;
				Static50.aClass2_Sub5_Sub1_2.method1302(43);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		if (local24 == 42) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(252);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
				Static50.aClass2_Sub5_Sub1_2.method1274(Static85.anInt2294);
			}
		}
		if (local24 == 26) {
			local652 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local20];
			if (local652 != null) {
				Static22.method440(0, 1, 0, local652.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local652.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static53.anInt1469 = 0;
				Static57.anInt1654 = Static2.anInt91;
				Static105.anInt2801 = Static93.anInt2442;
				Static41.anInt1189 = 2;
				Static50.aClass2_Sub5_Sub1_2.method1302(21);
				Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			}
		}
		if (local24 == 28) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static57.anInt1654 = Static2.anInt91;
			Static41.anInt1189 = 2;
			Static105.anInt2801 = Static93.anInt2442;
			Static53.anInt1469 = 0;
			Static50.aClass2_Sub5_Sub1_2.method1302(91);
			Static50.aClass2_Sub5_Sub1_2.method1268(Static87.anInt2318);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static61.anInt1741);
			Static50.aClass2_Sub5_Sub1_2.method1274(Static92.anInt2391);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static19.anInt575 + local12);
			Static50.aClass2_Sub5_Sub1_2.method1257(local16 + Static75.anInt454);
		}
		if (local24 == 1003) {
			Static42.method833(local20, local12, local16);
			Static50.aClass2_Sub5_Sub1_2.method1302(255);
			Static50.aClass2_Sub5_Sub1_2.method1268(local12 + Static19.anInt575);
			Static50.aClass2_Sub5_Sub1_2.method1249(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20 >> 14 & 0x7FFF);
		}
		if (local24 == 31) {
			local110 = Static26.aClass39Array7[arg0];
			local115 = local110.method1100(Static79.aClass39_1261);
			if (local115 != -1) {
				if (Static78.anInt2159 == -1) {
					Static12.method257();
					if (Static19.anInt574 != -1) {
						Static86.aClass39_1050 = local110.method1099(local115 + 5).method1103();
						Static46.anInt1247 = Static78.anInt2159 = Static19.anInt574;
						Static67.aBoolean96 = false;
					}
				} else {
					Static87.method1642(Static31.aClass39_782, 0, Static86.aClass39_1048);
				}
			}
		}
		if (local24 == 15) {
			Static12.method257();
		}
		if (local24 == 11 && Static42.method833(local20, local12, local16)) {
			Static50.aClass2_Sub5_Sub1_2.method1302(75);
			Static50.aClass2_Sub5_Sub1_2.method1274(Static85.anInt2294);
			Static50.aClass2_Sub5_Sub1_2.method1268(local20 >> 14 & 0x7FFF);
			Static50.aClass2_Sub5_Sub1_2.method1268(local12 + Static19.anInt575);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static75.anInt454 + local16);
		}
		if (local24 == 51) {
			Static42.method833(local20, local12, local16);
			Static50.aClass2_Sub5_Sub1_2.method1302(158);
			Static50.aClass2_Sub5_Sub1_2.method1257(local12 + Static19.anInt575);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static75.anInt454 + local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20 >> 14 & 0x7FFF);
		}
		if (local24 == 2 || local24 == 4 || local24 == 32 || local24 == 9) {
			local110 = Static26.aClass39Array7[arg0];
			local115 = local110.method1100(Static79.aClass39_1261);
			if (local115 != -1) {
				local576 = local110.method1099(local115 + 5).method1103().method1090();
				if (local24 == 2) {
					Static72.method1485(local576);
				}
				if (local24 == 4) {
					Static60.method1135(local576);
				}
				if (local24 == 32) {
					Static69.method1438(local576);
				}
				if (local24 == 9) {
					Static63.method1335(local576);
				}
			}
		}
		if (local24 == 49) {
			Static50.aClass2_Sub5_Sub1_2.method1302(193);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			Static50.aClass2_Sub5_Sub1_2.method1274(local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local12);
			Static96.anInt2639 = 0;
			Static38.anInt1151 = local16;
			Static71.anInt2029 = 2;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			Static88.anInt1139 = local12;
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 50) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static57.anInt1654 = Static2.anInt91;
			Static105.anInt2801 = Static93.anInt2442;
			Static53.anInt1469 = 0;
			Static41.anInt1189 = 2;
			Static50.aClass2_Sub5_Sub1_2.method1302(112);
			Static50.aClass2_Sub5_Sub1_2.method1274(Static85.anInt2294);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static75.anInt454 + local16);
			Static50.aClass2_Sub5_Sub1_2.method1268(Static19.anInt575 + local12);
		}
		if (local24 == 1005) {
			Static41.anInt1189 = 2;
			Static53.anInt1469 = 0;
			Static57.anInt1654 = Static2.anInt91;
			Static105.anInt2801 = Static93.anInt2442;
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				@Pc(2431) Class2_Sub1_Sub8 local2431 = local48.aClass2_Sub1_Sub8_1;
				if (local2431.anIntArray190 != null) {
					local2431 = local2431.method941();
				}
				if (local2431 != null) {
					Static50.aClass2_Sub5_Sub1_2.method1302(132);
					Static50.aClass2_Sub5_Sub1_2.method1249(local2431.anInt1389);
				}
			}
		}
		if (local24 == 3 && !Static12.aBoolean14) {
			Static50.aClass2_Sub5_Sub1_2.method1302(101);
			Static12.aBoolean14 = true;
		}
		if (local24 == 39) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static41.anInt1189 = 2;
			Static53.anInt1469 = 0;
			Static57.anInt1654 = Static2.anInt91;
			Static105.anInt2801 = Static93.anInt2442;
			Static50.aClass2_Sub5_Sub1_2.method1302(239);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1295(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12 + Static19.anInt575);
		}
		if (local24 == 38) {
			Static50.aClass2_Sub5_Sub1_2.method1302(175);
			Static50.aClass2_Sub5_Sub1_2.method1263(local16);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static96.anInt2639 = 0;
			Static38.anInt1151 = local16;
			Static88.anInt1139 = local12;
			Static71.anInt2029 = 2;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 24) {
			Static50.aClass2_Sub5_Sub1_2.method1302(32);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			local340 = Static90.method1705(local16);
			if (local340.anIntArrayArray7 != null && local340.anIntArrayArray7[0][0] == 5) {
				local115 = local340.anIntArrayArray7[0][1];
				Static28.anIntArray89[local115] = 1 - Static28.anIntArray89[local115];
				Static28.method563(local115);
				Static97.aBoolean120 = true;
			}
		}
		if (local24 == 1) {
			local902 = Static22.method440(0, 0, 0, local16, 2, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (!local902) {
				Static22.method440(0, 1, 0, local16, 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local12, false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			}
			Static57.anInt1654 = Static2.anInt91;
			Static105.anInt2801 = Static93.anInt2442;
			Static53.anInt1469 = 0;
			Static41.anInt1189 = 2;
			Static50.aClass2_Sub5_Sub1_2.method1302(44);
			Static50.aClass2_Sub5_Sub1_2.method1257(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1257(Static19.anInt575 + local12);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20);
		}
		if (local24 == 40) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static105.anInt2801 = Static93.anInt2442;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(11);
				Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			}
		}
		if (local24 == 47) {
			Static42.method833(local20, local12, local16);
			Static50.aClass2_Sub5_Sub1_2.method1302(63);
			Static50.aClass2_Sub5_Sub1_2.method1295(Static19.anInt575 + local12);
			Static50.aClass2_Sub5_Sub1_2.method1257(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20 >> 14 & 0x7FFF);
		}
		if (local24 == 29) {
			Static50.aClass2_Sub5_Sub1_2.method1302(80);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			Static38.anInt1151 = local16;
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			Static71.anInt2029 = 2;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 21) {
			Static50.aClass2_Sub5_Sub1_2.method1302(160);
			Static50.aClass2_Sub5_Sub1_2.method1257(local20);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			Static38.anInt1151 = local16;
			Static71.anInt2029 = 2;
			if (Static78.anInt2159 == local16 >> 16) {
				Static71.anInt2029 = 1;
			}
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 34) {
			local48 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local20];
			if (local48 != null) {
				Static22.method440(0, 1, 0, local48.anIntArray367[0], 2, 1, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local48.anIntArray368[0], false, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
				Static105.anInt2801 = Static93.anInt2442;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 2;
				Static57.anInt1654 = Static2.anInt91;
				Static50.aClass2_Sub5_Sub1_2.method1302(209);
				Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			}
		}
		if (local24 == 25) {
			Static50.aClass2_Sub5_Sub1_2.method1302(45);
			Static50.aClass2_Sub5_Sub1_2.method1295(local20);
			Static50.aClass2_Sub5_Sub1_2.method1249(local12);
			Static50.aClass2_Sub5_Sub1_2.method1296(local16);
			Static88.anInt1139 = local12;
			Static38.anInt1151 = local16;
			Static71.anInt2029 = 2;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			Static96.anInt2639 = 0;
			if (local16 >> 16 == Static99.anInt2696) {
				Static71.anInt2029 = 3;
			}
		}
		if (local24 == 18) {
			Static42.method833(local20, local12, local16);
			Static50.aClass2_Sub5_Sub1_2.method1302(59);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static19.anInt575 + local12);
			Static50.aClass2_Sub5_Sub1_2.method1257(local16 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1268(local20 >> 14 & 0x7FFF);
		}
		if (local24 == 20) {
			if (Static22.aBoolean36) {
				Static77.aClass43_1.method1190(local12 - 4, local16 - 4);
			} else {
				Static77.aClass43_1.method1190(Static2.anInt91 - 4, Static93.anInt2442 + -4);
			}
		}
		if (local24 == 22) {
			Static50.aClass2_Sub5_Sub1_2.method1302(111);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1263(local16);
			Static50.aClass2_Sub5_Sub1_2.method1249(local20);
			Static50.aClass2_Sub5_Sub1_2.method1298(Static85.anInt2294);
			Static71.anInt2029 = 2;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			if (Static99.anInt2696 == local16 >> 16) {
				Static71.anInt2029 = 3;
			}
			Static38.anInt1151 = local16;
		}
		if (local24 == 6) {
			Static50.aClass2_Sub5_Sub1_2.method1302(53);
			Static50.aClass2_Sub5_Sub1_2.method1298(local16);
			Static50.aClass2_Sub5_Sub1_2.method1295(local12);
			Static50.aClass2_Sub5_Sub1_2.method1268(local20);
			Static96.anInt2639 = 0;
			Static88.anInt1139 = local12;
			Static71.anInt2029 = 2;
			Static38.anInt1151 = local16;
			if (local16 >> 16 == Static78.anInt2159) {
				Static71.anInt2029 = 1;
			}
			if (local16 >> 16 == Static99.anInt2696) {
				Static71.anInt2029 = 3;
			}
		}
		if (Static16.anInt461 != 0) {
			Static16.anInt461 = 0;
			Static97.aBoolean120 = true;
		}
		if (Static87.anInt2324 != 0) {
			Static87.anInt2324 = 0;
			Static97.aBoolean120 = true;
		}
	}
}
