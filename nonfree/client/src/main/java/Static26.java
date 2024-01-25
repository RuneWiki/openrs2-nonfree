import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!f;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static final int anInt546 = 1401;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt547 = 0;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method483(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static136.aClass166_3 == Static209.aClass166_6 && Static411.anInt6701 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static365.aBoolean510 = true;
				Static382.method4881("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static365.aBoolean510 = false;
				Static382.method4881("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static174.anInt2850 = 0;
				Static248.anInt4059 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static78.aClass227_4.method4835();
				Static382.method4881("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (arg1.equalsIgnoreCase("gc")) {
				Static273.method3487();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static382.method4881("mem=" + local96 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static273.method3487();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static382.method4881("Memory before cleanup=" + local96 + "k");
				Static295.method3873();
				Static273.method3487();
				for (@Pc(157) int local157 = 0; local157 < 10; local157++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static382.method4881("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static382.method4881("Number of player models in cache:" + Static167.method2263());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static382.method4881("Dropped client connection");
				if (Static98.anInt1721 == 30) {
					Static362.method4701();
					return;
				}
				if (Static98.anInt1721 == 25) {
					Static13.aBoolean25 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static316.aClass19_1.method408();
				Static382.method4881("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static316.aClass19_1.method411();
				Static382.method4881("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static41.aClass124_2.method2527();
				Static48.aClass3_2.method58();
				Static316.aClass19_1.method404();
				Static382.method4881("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static266.method2730();
				Static390.method4942();
				Static382.method4881("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static421.method5241(-1, false, 1, -1);
				if (Static330.method4209() != 1) {
					Static382.method4881("wm1 failed");
					return;
				}
				Static382.method4881("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static421.method5241(-1, false, 2, -1);
				if (Static330.method4209() == 2) {
					Static382.method4881("wm2 succeeded");
					return;
				}
				Static382.method4881("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static421.method5241(768, false, 3, 1024);
				if (Static330.method4209() != 3) {
					Static382.method4881("wm3 failed");
					return;
				}
				Static382.method4881("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static330.method4211(0);
				if (Static410.anInt6680 != 0) {
					Static382.method4881("Failed to enter tk0");
					return;
				}
				Static382.method4881("Entered tk0");
				Static336.aClass106_Sub1_1.anInt5680 = 0;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static330.method4211(1);
				if (Static410.anInt6680 != 1) {
					Static382.method4881("Failed to enter tk1");
					return;
				}
				Static382.method4881("Entered tk1");
				Static336.aClass106_Sub1_1.anInt5680 = 1;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static330.method4211(2);
				if (Static410.anInt6680 != 2) {
					Static382.method4881("Failed to enter tk2");
					return;
				}
				Static382.method4881("Entered tk2");
				Static336.aClass106_Sub1_1.anInt5680 = 2;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static330.method4211(3);
				if (Static410.anInt6680 != 3) {
					Static382.method4881("Failed to enter tk3");
					return;
				}
				Static382.method4881("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static336.aClass106_Sub1_1.aBoolean475 = !Static336.aClass106_Sub1_1.aBoolean475;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				Static266.method2730();
				Static382.method4881("ot=" + Static336.aClass106_Sub1_1.aBoolean475);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static336.aClass106_Sub1_1.aBoolean467 = !Static336.aClass106_Sub1_1.aBoolean467;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				Static266.method2730();
				Static382.method4881("gb=" + Static336.aClass106_Sub1_1.aBoolean467);
				return;
			}
			@Pc(551) int local551;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static382.method4881("Invalid shadows value");
					return;
				}
				@Pc(541) String local541 = arg1.substring(8);
				local551 = Static327.method4190(local541) ? Static237.method3118(local541) : -1;
				if (local551 >= 0 && local551 <= 2) {
					Static336.aClass106_Sub1_1.method4426(local551, Static410.anInt6680);
					Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
					Static253.aBoolean325 = false;
					Static266.method2730();
					Static382.method4881("shadows=" + local551);
					return;
				}
				Static382.method4881("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static336.aClass106_Sub1_1.aBoolean463 = !Static336.aClass106_Sub1_1.aBoolean463;
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				Static312.method4044();
				Static266.method2730();
				Static382.method4881("textures=" + Static336.aClass106_Sub1_1.aBoolean463);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static382.method4881("Invalid buildarea value");
					return;
				}
				local76 = Static237.method3118(arg1.substring(6));
				if (local76 >= 0 && Static203.method2772(Static144.anInt2437) >= local76) {
					Static336.aClass106_Sub1_1.anInt5684 = local76;
					Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
					Static253.aBoolean325 = false;
					Static382.method4881("maxbuildarea=" + Static336.aClass106_Sub1_1.anInt5684);
					return;
				}
				Static382.method4881("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static382.method4881("Invalid particles value");
					return;
				}
				Static154.method4419(Static237.method3118(arg1.substring(13)));
				Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
				Static253.aBoolean325 = false;
				Static382.method4881("particles=" + Static218.method4375());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static382.method4881("Invalid rect_debug value");
					return;
				}
				Static348.anInt5665 = Static237.method3118(arg1.substring(10).trim());
				Static382.method4881("rect_debug=" + Static348.anInt5665);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static419.aBoolean556 = true;
				Static382.method4881("qa_op_test=" + Static419.aBoolean556);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static69.aBoolean480 = !Static69.aBoolean480;
				Static382.method4881("clipcomponents=" + Static69.aBoolean480);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(787) boolean local787 = Static213.aClass128_22.method3536();
				if (!Static47.method712(!local787)) {
					Static382.method4881("Failed to enable bloom");
					return;
				}
				if (!local787) {
					Static382.method4881("Bloom enabled");
					return;
				}
				Static382.method4881("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static240.aBoolean304) {
					Static240.aBoolean304 = false;
					Static382.method4881("Forced tweening disabled.");
					return;
				}
				Static240.aBoolean304 = true;
				Static382.method4881("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static314.aBoolean419) {
					Static382.method4881("Shift-click disabled.");
					Static314.aBoolean419 = false;
					return;
				}
				Static382.method4881("Shift-click ENABLED!");
				Static314.aBoolean419 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static382.method4881("x:" + (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7) + " z:" + (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static382.method4881("Height: " + Static202.aClass163Array2[Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89].I(Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static169.aClass113_55.method2282();
				Static169.aClass113_55.method2256();
				Static346.aClass135_3.method2794();
				Static330.aClass101_3.method2108();
				Static390.method4942();
				Static382.method4881("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static213.aClass128_22.method3573()) {
					local76 = Integer.parseInt(arg1.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Static448.anInt6654 = local76;
					Static213.aClass128_22.method3550(Static448.anInt6654);
					Static213.aClass128_22.method3592(0);
					Static382.method4881("Render cores now: " + Static448.anInt6654);
					return;
				}
				Static382.method4881("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static382.method4881("I(s): " + Static149.aClass167_100.method3396() + "/" + Static149.aClass167_100.method3397());
				Static382.method4881("I(m): " + Static325.aClass167_75.method3396() + "/" + Static325.aClass167_75.method3397());
				Static382.method4881("O(s): " + Static227.aClass65_2.aClass4_1.method112() + "/" + Static227.aClass65_2.aClass4_1.method99());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static382.method4881("Pos: " + Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 + "," + (Static101.anInt6646 + (Static278.anInt4391 >> 7) >> 6) + "," + (Static278.anInt4392 + (Static8.anInt7337 >> 7) >> 6) + "," + ((Static278.anInt4391 >> 7) + Static101.anInt6646 & 0x3F) + "," + ((Static8.anInt7337 >> 7) + Static278.anInt4392 & 0x3F) + " Height: " + (Static183.method4175(Static8.anInt7337, Static278.anInt4391, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89) - Static5.anInt113));
				Static382.method4881("Look: " + Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 + "," + (Static101.anInt6646 + Static315.anInt5218 >> 6) + "," + (Static427.anInt7043 + Static278.anInt4392 >> 6) + "," + (Static101.anInt6646 + Static315.anInt5218 & 0x3F) + "," + (Static427.anInt7043 + Static278.anInt4392 & 0x3F) + " Height: " + (Static183.method4175(Static427.anInt7043, Static315.anInt5218, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89) - Static365.anInt6176));
				return;
			}
			if (arg1.equals("showocc")) {
				Static341.aBoolean450 = !Static341.aBoolean450;
				Static266.method2730();
				Static382.method4881("showocc=" + Static341.aBoolean450);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static57.aBoolean84 = !Static57.aBoolean84;
				Static266.method2730();
				Static382.method4881("forcewallocc=" + Static57.aBoolean84);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static273.aBoolean344 = !Static273.aBoolean344;
				Static213.aClass128_22.method3555(Static273.aBoolean344);
				Static454.method5609();
				Static382.method4881("showprofiling=" + Static273.aBoolean344);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static382.method4881("Java toolkit: " + Static339.method4303(Static41.aClass124_2));
				Static382.method4881("GL toolkit:   " + Static339.method4303(Static41.aClass124_2));
				Static382.method4881("SSE toolkit:  " + Static339.method4303(Static41.aClass124_2));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static171.aBoolean219 = !Static171.aBoolean219;
				Static382.method4881("nonpcs=" + Static171.aBoolean219);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static8.method5546();
				Static382.method4881("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static5.method94(Static363.aClass137_230);
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				local76 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				local551 = arg1.indexOf(" ", 4);
				Static75.aClass1_Sub11_Sub1_1.method4453(arg1.substring(3, local551));
				Static425.method5306(Static75.aClass1_Sub11_Sub1_1, arg1.substring(local551));
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local76);
				return;
			}
			if (arg1.equals("heap")) {
				Static382.method4881("Heap: " + Static144.anInt2437 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static329.method4206();
				Static382.method4881("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static156.anIntArray134.length; local76++) {
					if (Static389.aBooleanArray12[local76]) {
						Static156.anIntArray134[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static156.anIntArray134[local76] *= -1;
						}
					}
				}
				Static329.method4206();
				Static382.method4881("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static102.aBoolean133 = true;
				Static390.method4942();
				Static382.method4881("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static102.aBoolean133 = false;
				Static390.method4942();
				Static382.method4881("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static336.method4290();
				Static382.method4881("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static382.method4881(Static290.method3792() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local76 = Integer.parseInt(arg1.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					Static336.aClass106_Sub1_1.anInt5688 = local76;
				}
				Static382.method4881("cpuusage=" + Static336.aClass106_Sub1_1.anInt5688);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(arg1.substring(17));
				Static382.method4881("varpbit=" + Static364.aClass259_1.method5519(local76));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(arg1.substring(14));
				Static382.method4881("varp=" + Static364.aClass259_1.method5520(local76));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static267.method3412();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static267.method3400();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static267.method3400();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local76 = Integer.parseInt(arg1.substring(8));
				Static213.aClass128_22.method3606(local76);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static382.method4881("Active streams: " + Static155.aClass1_Sub9_Sub2_1.method1037());
				return;
			}
			if (Static98.anInt1721 == 30) {
				Static5.method94(Static215.aClass137_147);
				Static75.aClass1_Sub11_Sub1_1.method4445(arg1.length() + 2);
				Static75.aClass1_Sub11_Sub1_1.method4445(arg0 ? 1 : 0);
				Static75.aClass1_Sub11_Sub1_1.method4453(arg1);
			}
			if (arg1.startsWith("fps ") && Static136.aClass166_3 != Static209.aClass166_6) {
				Static127.method1752(Static237.method3118(arg1.substring(4)));
				return;
			}
			if (Static98.anInt1721 != 30) {
				Static382.method4881("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1669) Exception local1669) {
			Static382.method4881("Whoops, something went wrong.");
			return;
		}
	}
}
