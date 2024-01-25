import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
	public static int anInt1351;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lclient!fc;")
	public static Class71 aClass71_18;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_31 = new Class41(37, -1);

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
	public static void method1291() {
		for (@Pc(13) int local13 = 0; local13 < Static362.aClass251ArrayArray1.length; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static362.aClass251ArrayArray1[local13].length; local17++) {
				Static362.aClass251ArrayArray1[local13][local17] = Static125.aClass251_2;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method1292(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Static91.aClass143_12 == Static337.aClass143_27 && Static287.anInt5112 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static340.aBoolean454 = true;
				Static32.method5235("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static340.aBoolean454 = false;
				Static32.method5235("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static154.anInt2771 = 0;
				Static214.anInt3953 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static55.aClass56_2.method1255();
				Static32.method5235("Text coords cleared");
				return;
			}
			@Pc(67) int local67;
			@Pc(86) int local86;
			@Pc(76) Runtime local76;
			if (arg0.equalsIgnoreCase("gc")) {
				Static344.method5462();
				for (local67 = 0; local67 < 10; local67++) {
					System.gc();
				}
				local76 = Runtime.getRuntime();
				local86 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
				Static32.method5235("mem=" + local86 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static344.method5462();
				for (local67 = 0; local67 < 10; local67++) {
					System.gc();
				}
				local76 = Runtime.getRuntime();
				local86 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
				Static32.method5235("Memory before cleanup=" + local86 + "k");
				Static10.method377();
				Static344.method5462();
				for (@Pc(144) int local144 = 0; local144 < 10; local144++) {
					System.gc();
				}
				local86 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
				Static32.method5235("Memory after cleanup=" + local86 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static32.method5235("Number of player models in cache:" + Static246.method3929());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static32.method5235("Dropped client connection");
				if (Static344.anInt6327 == 30) {
					Static4.method188();
				} else if (Static344.anInt6327 == 25) {
					Static226.aBoolean325 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static93.aClass23_1.method642();
				Static32.method5235("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static93.aClass23_1.method640();
				Static32.method5235("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static92.aClass53_2.method1183();
				Static169.aClass124_3.method2715();
				Static93.aClass23_1.method641();
				Static32.method5235("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static385.method5708();
				Static383.method5696();
				Static32.method5235("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static295.method4662(-1, 1, false, -1);
				if (Static238.method3868() != 1) {
					Static32.method5235("wm1 failed");
					return;
				}
				Static32.method5235("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static295.method4662(-1, 2, false, -1);
				if (Static238.method3868() == 2) {
					Static32.method5235("wm2 succeeded");
					return;
				}
				Static32.method5235("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static295.method4662(768, 3, false, 1024);
				if (Static238.method3868() != 3) {
					Static32.method5235("wm3 failed");
					return;
				}
				Static32.method5235("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static200.method3348(0);
				if (Static123.anInt2363 == 0) {
					Static32.method5235("Entered tk0");
					Static193.anInt6668 = 0;
					Static30.method724(Static92.aClass53_2);
					Static218.aBoolean305 = false;
					return;
				}
				Static32.method5235("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static200.method3348(1);
				if (Static123.anInt2363 == 1) {
					Static32.method5235("Entered tk1");
					Static193.anInt6668 = 1;
					Static30.method724(Static92.aClass53_2);
					Static218.aBoolean305 = false;
					return;
				}
				Static32.method5235("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static200.method3348(2);
				if (Static123.anInt2363 != 2) {
					Static32.method5235("Failed to enter tk2");
					return;
				}
				Static32.method5235("Entered tk2");
				Static193.anInt6668 = 2;
				Static30.method724(Static92.aClass53_2);
				Static218.aBoolean305 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static200.method3348(3);
				if (Static123.anInt2363 != 3) {
					Static32.method5235("Failed to enter tk3");
					return;
				}
				Static32.method5235("Entered tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static158.aBoolean211 = !Static158.aBoolean211;
				Static30.method724(Static92.aClass53_2);
				Static218.aBoolean305 = false;
				Static385.method5708();
				Static32.method5235("ot=" + Static158.aBoolean211);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static265.aBoolean344 = !Static265.aBoolean344;
				Static30.method724(Static92.aClass53_2);
				Static218.aBoolean305 = false;
				Static385.method5708();
				Static32.method5235("gb=" + Static265.aBoolean344);
				return;
			}
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static32.method5235("Invalid shadows value");
					return;
				}
				@Pc(510) String local510 = arg0.substring(8);
				@Pc(520) int local520 = Static225.method3769(local510) ? Static319.method4935(local510) : -1;
				if (local520 >= 0 && local520 <= 2) {
					Static193.anInt6663 = local520;
					Static30.method724(Static92.aClass53_2);
					Static218.aBoolean305 = false;
					Static385.method5708();
					Static32.method5235("shadows=" + local520);
					return;
				}
				Static32.method5235("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static32.method5235("Invalid buildarea value");
					return;
				}
				local67 = Static319.method4935(arg0.substring(6));
				if (local67 >= 0 && local67 <= Static45.method2429(Static314.anInt5576)) {
					Static301.anInt5429 = local67;
					Static30.method724(Static92.aClass53_2);
					Static218.aBoolean305 = false;
					Static32.method5235("maxbuildarea=" + Static301.anInt5429);
					return;
				}
				Static32.method5235("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static32.method5235("Invalid particles value");
					return;
				}
				Static346.method5275(Static319.method4935(arg0.substring(13)));
				Static30.method724(Static92.aClass53_2);
				Static218.aBoolean305 = false;
				Static32.method5235("particles=" + Static142.method3057());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static32.method5235("Invalid rect_debug value");
					return;
				}
				Static102.anInt2004 = Static319.method4935(arg0.substring(10).trim());
				Static32.method5235("rect_debug=" + Static102.anInt2004);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static218.aBoolean304 = true;
				Static32.method5235("qa_op_test=" + Static218.aBoolean304);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static375.aBoolean327 = !Static375.aBoolean327;
				Static32.method5235("clipcomponents=" + Static375.aBoolean327);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(723) boolean local723 = Static304.aClass82_4.method4463();
				if (!Static171.method2806(!local723)) {
					Static32.method5235("Failed to enable bloom");
					return;
				}
				if (!local723) {
					Static32.method5235("Bloom enabled");
					return;
				}
				Static32.method5235("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static151.aBoolean203) {
					Static151.aBoolean203 = true;
					Static32.method5235("Forced tweening ENABLED!");
					return;
				}
				Static151.aBoolean203 = false;
				Static32.method5235("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static251.aBoolean337) {
					Static32.method5235("Shift-click ENABLED!");
					Static251.aBoolean337 = true;
					return;
				}
				Static32.method5235("Shift-click disabled.");
				Static251.aBoolean337 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static32.method5235("x:" + (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7) + " z:" + (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static32.method5235("Height: " + Static17.aClass33Array1[Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74].method4057(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static119.aClass71_25.method1559();
				Static119.aClass71_25.method1567();
				Static201.aClass181_6.method4323();
				Static240.aClass211_4.method5047();
				Static383.method5696();
				Static32.method5235("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static304.aClass82_4.method4488()) {
					local67 = Integer.parseInt(arg0.substring(3));
					if (local67 < 1) {
						local67 = 1;
					} else if (local67 > 4) {
						local67 = 4;
					}
					Static126.anInt2390 = local67;
					Static304.aClass82_4.method4496(Static126.anInt2390);
					Static304.aClass82_4.method4464(0);
					Static32.method5235("Render cores now: " + Static126.anInt2390);
					return;
				}
				Static32.method5235("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static32.method5235("I(s): " + Static136.aClass154_12.method3747() + "/" + Static136.aClass154_12.method3753());
				Static32.method5235("I(m): " + Static118.aClass154_11.method3747() + "/" + Static118.aClass154_11.method3753());
				Static32.method5235("O(s): " + Static106.aClass250_1.aClass92_1.method2240() + "/" + Static106.aClass250_1.aClass92_1.method2239());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static32.method5235("Pos: " + Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 + "," + (Static376.anInt6607 + (Static160.anInt2915 >> 7) >> 6) + "," + ((Static22.anInt547 >> 7) + Static133.anInt2474 >> 6) + "," + ((Static160.anInt2915 >> 7) + Static376.anInt6607 & 0x3F) + "," + ((Static22.anInt547 >> 7) + Static133.anInt2474 & 0x3F) + " Height: " + (Static18.method508(Static22.anInt547, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, Static160.anInt2915) - anInt1354));
				Static32.method5235("Look: " + Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 + "," + (Static276.anInt4908 + Static376.anInt6607 >> 6) + "," + (Static215.anInt3982 + Static133.anInt2474 >> 6) + "," + (Static276.anInt4908 + Static376.anInt6607 & 0x3F) + "," + (Static133.anInt2474 + Static215.anInt3982 & 0x3F) + " Height: " + (Static18.method508(Static215.anInt3982, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, Static276.anInt4908) - Static327.anInt5766));
				return;
			}
			if (arg0.equals("showocc")) {
				aBoolean114 = !aBoolean114;
				Static385.method5708();
				Static32.method5235("showocc=" + aBoolean114);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static111.aBoolean174 = !Static111.aBoolean174;
				Static304.aClass82_4.method4549(Static111.aBoolean174);
				Static35.method772();
				Static32.method5235("showprofiling=" + Static111.aBoolean174);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static264.aBoolean342 = !Static264.aBoolean342;
				Static32.method5235("nonpcs=" + Static264.aBoolean342);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static266.method4110();
				Static32.method5235("auto world selected");
				return;
			}
			if (arg0.equals("heap")) {
				Static32.method5235("Heap: " + Static314.anInt5576 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static367.method5541();
				Static32.method5235("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local67 = 0; local67 < Static61.anIntArray162.length; local67++) {
					if (Static267.aBooleanArray110[local67]) {
						Static61.anIntArray162[local67] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static61.anIntArray162[local67] *= -1;
						}
					}
				}
				Static367.method5541();
				Static32.method5235("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static274.aBoolean100 = true;
				Static383.method5696();
				Static32.method5235("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static274.aBoolean100 = false;
				Static383.method5696();
				Static32.method5235("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static382.method5683();
				Static32.method5235("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static32.method5235(Static221.method3731() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local67 = Integer.parseInt(arg0.substring(9));
				if (local67 >= 0 && local67 <= 4) {
					Static244.anInt1013 = local67;
				}
				Static32.method5235("cpuusage=" + Static244.anInt1013);
				return;
			}
			if (Static344.anInt6327 == 30) {
				Static19.method552(Static301.aClass41_163);
				Static39.aClass2_Sub13_Sub2_4.method4207(arg0.length() + 2);
				Static39.aClass2_Sub13_Sub2_4.method4207(arg1 ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
			}
			if (arg0.startsWith("fps ") && Static337.aClass143_27 != Static91.aClass143_12) {
				Static196.method3283(Static319.method4935(arg0.substring(4)));
				return;
			}
			if (Static344.anInt6327 != 30) {
				Static32.method5235("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1375) Exception local1375) {
			Static32.method5235("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public static void method1293(@OriginalArg(1) int arg0) {
		Static76.anInt1481 = -1;
		Static284.anInt5040 = arg0;
		Static203.anInt3731 = -1;
		Static149.method2528();
	}
}
