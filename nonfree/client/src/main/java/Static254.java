import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_107 = new Class25(86, 7);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/lang/String;ZZ)V")
	public static void method3553(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static112.aClass129_4 == Static429.aClass129_8 && Static81.anInt1300 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg0.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static441.aBoolean501 = true;
				Static338.method3179("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static441.aBoolean501 = false;
				Static338.method3179("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static338.method3179("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static275.anInt4981 = 0;
				Static142.anInt2604 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static383.aClass97_7.method2147();
				Static338.method3179("Text coords cleared");
				return;
			}
			@Pc(125) int local125;
			@Pc(106) int local106;
			@Pc(115) Runtime local115;
			if (arg0.equalsIgnoreCase("gc")) {
				Static85.method1310();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static338.method3179("mem=" + local125 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static85.method1310();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static338.method3179("Memory before cleanup=" + local125 + "k");
				Static278.method3970();
				Static85.method1310();
				for (@Pc(182) int local182 = 0; local182 < 10; local182++) {
					System.gc();
				}
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static338.method3179("Memory after cleanup=" + local125 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static338.method3179("Number of player models in cache:" + Static26.method437());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static338.method3179("Dropped client connection");
				if (Static433.anInt7309 == 9) {
					Static75.method1141();
				} else if (Static433.anInt7309 == 10) {
					Static149.aBoolean502 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static29.aClass249_1.method5695();
				Static338.method3179("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static29.aClass249_1.method5701();
				Static338.method3179("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static138.aClass194_2.method4392();
				Static339.aClass66_2.method1393();
				Static29.aClass249_1.method5696();
				Static338.method3179("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static61.method978();
				Static388.method5383();
				Static338.method3179("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static291.method4115(false, -1, -1, 1);
				if (Static235.method3217() == 1) {
					Static338.method3179("wm1 succeeded");
					return;
				}
				Static338.method3179("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static291.method4115(false, -1, -1, 2);
				if (Static235.method3217() != 2) {
					Static338.method3179("wm2 failed");
					return;
				}
				Static338.method3179("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static291.method4115(false, 768, 1024, 3);
				if (Static235.method3217() == 3) {
					Static338.method3179("wm3 succeeded");
					return;
				}
				Static338.method3179("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static357.method5001(0);
				if (Static404.anInt2752 != 0) {
					Static338.method3179("Failed to enter tk0");
					return;
				}
				Static338.method3179("Entered tk0");
				Static434.aClass165_Sub1_1.anInt4193 = 0;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static357.method5001(1);
				if (Static404.anInt2752 == 1) {
					Static338.method3179("Entered tk1");
					Static434.aClass165_Sub1_1.anInt4193 = 1;
					Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
					Static214.aBoolean244 = false;
					return;
				}
				Static338.method3179("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static357.method5001(2);
				if (Static404.anInt2752 != 2) {
					Static338.method3179("Failed to enter tk2");
					return;
				}
				Static338.method3179("Entered tk2");
				Static434.aClass165_Sub1_1.anInt4193 = 2;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static357.method5001(3);
				if (Static404.anInt2752 == 3) {
					Static338.method3179("Entered tk3");
					return;
				}
				Static338.method3179("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static434.aClass165_Sub1_1.aBoolean295 = !Static434.aClass165_Sub1_1.aBoolean295;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				Static61.method978();
				Static338.method3179("ot=" + Static434.aClass165_Sub1_1.aBoolean295);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static434.aClass165_Sub1_1.aBoolean301 = !Static434.aClass165_Sub1_1.aBoolean301;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				Static61.method978();
				Static338.method3179("gb=" + Static434.aClass165_Sub1_1.aBoolean301);
				return;
			}
			@Pc(574) int local574;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static338.method3179("Invalid shadows value");
					return;
				}
				@Pc(564) String local564 = arg0.substring(8);
				local574 = Static117.method1916(local564) ? Static389.method5412(local564) : -1;
				if (local574 >= 0 && local574 <= 2) {
					Static434.aClass165_Sub1_1.method3391(Static404.anInt2752, local574);
					Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
					Static214.aBoolean244 = false;
					Static61.method978();
					Static338.method3179("shadows=" + local574);
					return;
				}
				Static338.method3179("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static434.aClass165_Sub1_1.aBoolean297 = !Static434.aClass165_Sub1_1.aBoolean297;
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				Static465.method5995();
				Static61.method978();
				Static338.method3179("textures=" + Static434.aClass165_Sub1_1.aBoolean297);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static338.method3179("Invalid buildarea value");
					return;
				}
				local106 = Static389.method5412(arg0.substring(6));
				if (local106 >= 0 && local106 <= Static278.method3967(Static170.anInt3068)) {
					Static434.aClass165_Sub1_1.anInt4200 = local106;
					Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
					Static214.aBoolean244 = false;
					Static338.method3179("maxbuildarea=" + Static434.aClass165_Sub1_1.anInt4200);
					return;
				}
				Static338.method3179("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static338.method3179("Invalid particles value");
					return;
				}
				Static108.method1792(Static389.method5412(arg0.substring(13)));
				Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
				Static214.aBoolean244 = false;
				Static338.method3179("particles=" + Static109.method1801());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static338.method3179("Invalid rect_debug value");
					return;
				}
				Static407.anInt7039 = Static389.method5412(arg0.substring(10).trim());
				Static338.method3179("rect_debug=" + Static407.anInt7039);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static464.aBoolean176 = true;
				Static338.method3179("qa_op_test=" + Static464.aBoolean176);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static318.aBoolean402 = !Static318.aBoolean402;
				Static338.method3179("clipcomponents=" + Static318.aBoolean402);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(813) boolean local813 = Static257.aClass75_8.method5972();
				if (!Static172.method2532(!local813)) {
					Static338.method3179("Failed to enable bloom");
					return;
				}
				if (!local813) {
					Static338.method3179("Bloom enabled");
					return;
				}
				Static338.method3179("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static83.aBoolean76) {
					Static83.aBoolean76 = false;
					Static338.method3179("Forced tweening disabled.");
					return;
				}
				Static83.aBoolean76 = true;
				Static338.method3179("Forced tweening ENABLED!");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static111.aBoolean107) {
					Static338.method3179("Shift-click disabled.");
					Static111.aBoolean107 = false;
					return;
				}
				Static338.method3179("Shift-click ENABLED!");
				Static111.aBoolean107 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static338.method3179("x:" + (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7) + " z:" + (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static338.method3179("Height: " + Static241.aClass22Array3[Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101].ua(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static446.aClass171_101.method3651();
				Static446.aClass171_101.method3667();
				Static386.aClass230_7.method5254();
				Static54.aClass84_2.method1954();
				Static388.method5383();
				Static338.method3179("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static257.aClass75_8.method6003()) {
					local106 = Integer.parseInt(arg0.substring(3));
					if (local106 < 1) {
						local106 = 1;
					} else if (local106 > 4) {
						local106 = 4;
					}
					Static7.anInt112 = local106;
					Static257.aClass75_8.method5984(Static7.anInt112);
					Static257.aClass75_8.method5954(0);
					Static338.method3179("Render cores now: " + Static7.anInt112);
					return;
				}
				Static338.method3179("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static338.method3179("I(s): " + Static456.aClass188_59.method4163() + "/" + Static456.aClass188_59.method4167());
				Static338.method3179("I(m): " + Static54.aClass188_11.method4163() + "/" + Static54.aClass188_11.method4167());
				Static338.method3179("O(s): " + Static413.aClass271_2.aClass202_1.method4687() + "/" + Static413.aClass271_2.aClass202_1.method4684());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static338.method3179("Pos: " + Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 + "," + ((Static263.anInt4619 >> 7) + Static386.anInt7205 >> 6) + "," + (Static153.anInt2798 + (Static120.anInt2052 >> 7) >> 6) + "," + ((Static263.anInt4619 >> 7) + Static386.anInt7205 & 0x3F) + "," + ((Static120.anInt2052 >> 7) + Static153.anInt2798 & 0x3F) + " Height: " + (Static365.method3535(Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, Static263.anInt4619, Static120.anInt2052) - Static260.anInt4601));
				Static338.method3179("Look: " + Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 + "," + (Static101.anInt1574 + Static386.anInt7205 >> 6) + "," + (Static258.anInt4504 + Static153.anInt2798 >> 6) + "," + (Static101.anInt1574 + Static386.anInt7205 & 0x3F) + "," + (Static258.anInt4504 + Static153.anInt2798 & 0x3F) + " Height: " + (Static365.method3535(Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101, Static101.anInt1574, Static258.anInt4504) - Static129.anInt2190));
				return;
			}
			if (arg0.equals("showocc")) {
				Static117.aBoolean125 = !Static117.aBoolean125;
				Static61.method978();
				Static338.method3179("showocc=" + Static117.aBoolean125);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static117.aBoolean124 = !Static117.aBoolean124;
				Static61.method978();
				Static338.method3179("forcewallocc=" + Static117.aBoolean124);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static123.aBoolean129 = !Static123.aBoolean129;
				Static257.aClass75_8.method5966(Static123.aBoolean129);
				Static119.method1941();
				Static338.method3179("showprofiling=" + Static123.aBoolean129);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static338.method3179("Java toolkit: " + Static263.method3696(Static138.aClass194_2));
				Static338.method3179("GL toolkit:   " + Static263.method3696(Static138.aClass194_2));
				Static338.method3179("SSE toolkit:  " + Static263.method3696(Static138.aClass194_2));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static162.aBoolean185 = !Static162.aBoolean185;
				Static338.method3179("nonpcs=" + Static162.aBoolean185);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static92.method1400();
				Static338.method3179("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local106 = Integer.parseInt(arg0.substring(12));
				Static465.method5967(local106, Static262.method3690(local106).aString10);
				Static338.method3179("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static338.method3179("w: " + Static163.aClass263_3.anInt7387);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static164.method2403(Static288.aClass208_67);
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				local106 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
				local574 = arg0.indexOf(" ", 4);
				Static389.aClass2_Sub17_Sub1_2.method6151(arg0.substring(3, local574));
				Static349.method4922(Static389.aClass2_Sub17_Sub1_2, arg0.substring(local574));
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local106);
				return;
			}
			if (arg0.equals("heap")) {
				Static338.method3179("Heap: " + Static170.anInt3068 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static331.method4731();
				Static338.method3179("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static388.anIntArray542.length; local106++) {
					if (Static203.aBooleanArray15[local106]) {
						Static388.anIntArray542[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static388.anIntArray542[local106] *= -1;
						}
					}
				}
				Static331.method4731();
				Static338.method3179("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static433.aBoolean498 = true;
				Static388.method5383();
				Static338.method3179("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static433.aBoolean498 = false;
				Static388.method5383();
				Static338.method3179("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static262.method3688();
				Static338.method3179("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static338.method3179(Static135.method1391() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg0.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static434.aClass165_Sub1_1.anInt4214 = local106;
				}
				Static338.method3179("cpuusage=" + Static434.aClass165_Sub1_1.anInt4214);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg0.substring(17));
				Static338.method3179("varpbit=" + Static63.aClass120_2.method2526(local106));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg0.substring(14));
				Static338.method3179("varp=" + Static63.aClass120_2.method2525(local106));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static119.method1942(false, 0);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static119.method1942(true, 0);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1620) String[] local1620 = Static305.method172(arg0.substring(12), ' ');
				if (local1620.length >= 2) {
					local574 = local1620.length <= 2 ? 0 : Integer.parseInt(local1620[2]);
					Static444.method6032(local574, local1620[1], local1620[0]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static76.method1153();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static76.method1156();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static76.method1156();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local106 = Integer.parseInt(arg0.substring(8));
				Static257.aClass75_8.method5968(local106);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static338.method3179("Active streams: " + Static414.aClass2_Sub8_Sub1_2.method1038());
				return;
			}
			if (arg0.equals("errormessage")) {
				Static338.method3179(Static94.aClient2.method840());
				return;
			}
			if (Static433.anInt7309 == 9) {
				Static164.method2403(Static376.aClass208_90);
				Static389.aClass2_Sub17_Sub1_2.method6172(arg0.length() + 3);
				Static389.aClass2_Sub17_Sub1_2.method6172(arg2 ? 1 : 0);
				Static389.aClass2_Sub17_Sub1_2.method6172(arg1 ? 1 : 0);
				Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
			}
			if (arg0.startsWith("fps ") && Static429.aClass129_8 != Static112.aClass129_4) {
				Static129.method2038(Static389.method5412(arg0.substring(4)));
				return;
			}
			if (Static433.anInt7309 != 9) {
				Static338.method3179("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1777) Exception local1777) {
			Static338.method3179("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIILjava/lang/String;)V")
	public static void method3555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class93 local8 = Static34.method566(arg0, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray10 != null) {
			@Pc(18) Class2_Sub18 local18 = new Class2_Sub18();
			local18.aClass93_10 = local8;
			local18.aString29 = arg3;
			local18.anInt3062 = arg1;
			local18.anObjectArray33 = local8.anObjectArray10;
			Static76.method1143(local18);
		}
		if (Static433.anInt7309 != 9 || !Static53.method860(local8).method5898(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static164.method2403(Static86.aClass208_19);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 2) {
			Static164.method2403(Static382.aClass208_91);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 3) {
			Static164.method2403(Static80.aClass208_82);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 4) {
			Static164.method2403(Static157.aClass208_40);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 5) {
			Static164.method2403(Static322.aClass208_77);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 6) {
			Static164.method2403(Static375.aClass208_89);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 7) {
			Static164.method2403(Static207.aClass208_56);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 8) {
			Static164.method2403(Static141.aClass208_99);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 9) {
			Static164.method2403(Static132.aClass208_29);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
		if (arg1 == 10) {
			Static164.method2403(Static302.aClass208_72);
			Static57.method932(local8.anInt2488, arg2, arg0);
		}
	}
}
