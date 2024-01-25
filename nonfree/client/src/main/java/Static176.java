import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "Lclient!js;")
	public static Class131 aClass131_3;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
	public static int anInt3414;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "[[[Lclient!ht;")
	public static Class113[][][] aClass113ArrayArrayArray3;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
	public static int anInt3420;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
	public static int anInt3421;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	public static int anInt3417 = -1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) (arg1 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub44 local20 = (Class2_Sub44) Static35.aClass240_39.method5439(local14);
		if (local20 == null) {
			local20 = new Class2_Sub44();
			Static35.aClass240_39.method5430(local14, local20);
		}
		if (local20.anIntArray499.length <= arg3) {
			@Pc(45) int[] local45 = new int[arg3 + 1];
			@Pc(50) int[] local50 = new int[arg3 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray499.length; local52++) {
				local45[local52] = local20.anIntArray499[local52];
				local50[local52] = local20.anIntArray498[local52];
			}
			for (@Pc(82) int local82 = local20.anIntArray499.length; local82 < arg3; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local20.anIntArray499 = local45;
			local20.anIntArray498 = local50;
		}
		local20.anIntArray499[arg3] = arg0;
		local20.anIntArray498[arg3] = arg2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2774(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static293.aClass269_10 == Static343.aClass269_11 && Static255.anInt4802 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static408.aBoolean598 = true;
				Static190.method3004("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static408.aBoolean598 = false;
				Static190.method3004("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static22.anInt467 = 0;
				Static372.anInt6682 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static316.aClass184_4.method4216();
				Static190.method3004("Text coords cleared");
				return;
			}
			@Pc(73) int local73;
			@Pc(92) int local92;
			@Pc(82) Runtime local82;
			if (arg0.equalsIgnoreCase("gc")) {
				Static387.method5352();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static190.method3004("mem=" + local92 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static387.method5352();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static190.method3004("Memory before cleanup=" + local92 + "k");
				Static252.method3872();
				Static387.method5352();
				for (@Pc(150) int local150 = 0; local150 < 10; local150++) {
					System.gc();
				}
				local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static190.method3004("Memory after cleanup=" + local92 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static190.method3004("Number of player models in cache:" + Static397.method5449());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static190.method3004("Dropped client connection");
				if (Static297.anInt5339 == 30) {
					Static83.method1461();
				} else if (Static297.anInt5339 == 25) {
					Static414.aBoolean377 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static239.aClass179_1.method4133();
				Static190.method3004("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static239.aClass179_1.method4141();
				Static190.method3004("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static303.aClass131_4.method3053();
				Static423.aClass199_11.method4487();
				Static239.aClass179_1.method4136();
				Static190.method3004("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static382.method5313();
				Static210.method3244();
				Static190.method3004("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static168.method2626(false, -1, -1, 1);
				if (Static405.method5498() == 1) {
					Static190.method3004("wm1 succeeded");
					return;
				}
				Static190.method3004("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static168.method2626(false, -1, -1, 2);
				if (Static405.method5498() != 2) {
					Static190.method3004("wm2 failed");
					return;
				}
				Static190.method3004("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static168.method2626(false, 768, 1024, 3);
				if (Static405.method5498() == 3) {
					Static190.method3004("wm3 succeeded");
					return;
				}
				Static190.method3004("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static102.method1621(0);
				if (Static281.anInt5126 == 0) {
					Static190.method3004("Entered tk0");
					Static399.aClass167_Sub1_1.anInt5553 = 0;
					Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
					Static45.aBoolean626 = false;
					return;
				}
				Static190.method3004("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static102.method1621(1);
				if (Static281.anInt5126 == 1) {
					Static190.method3004("Entered tk1");
					Static399.aClass167_Sub1_1.anInt5553 = 1;
					Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
					Static45.aBoolean626 = false;
					return;
				}
				Static190.method3004("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static102.method1621(2);
				if (Static281.anInt5126 != 2) {
					Static190.method3004("Failed to enter tk2");
					return;
				}
				Static190.method3004("Entered tk2");
				Static399.aClass167_Sub1_1.anInt5553 = 2;
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
				Static45.aBoolean626 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static102.method1621(3);
				if (Static281.anInt5126 == 3) {
					Static190.method3004("Entered tk3");
					return;
				}
				Static190.method3004("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static399.aClass167_Sub1_1.aBoolean483 = !Static399.aClass167_Sub1_1.aBoolean483;
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
				Static45.aBoolean626 = false;
				Static382.method5313();
				Static190.method3004("ot=" + Static399.aClass167_Sub1_1.aBoolean483);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static399.aClass167_Sub1_1.aBoolean482 = !Static399.aClass167_Sub1_1.aBoolean482;
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
				Static45.aBoolean626 = false;
				Static382.method5313();
				Static190.method3004("gb=" + Static399.aClass167_Sub1_1.aBoolean482);
				return;
			}
			@Pc(531) int local531;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static190.method3004("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = arg0.substring(8);
				local531 = Static413.method5615(local521) ? Static175.method2762(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					Static399.aClass167_Sub1_1.method4515(local531, Static281.anInt5126);
					Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
					Static45.aBoolean626 = false;
					Static382.method5313();
					Static190.method3004("shadows=" + local531);
					return;
				}
				Static190.method3004("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static399.aClass167_Sub1_1.aBoolean487 = !Static399.aClass167_Sub1_1.aBoolean487;
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
				Static45.aBoolean626 = false;
				Static196.method4361();
				Static382.method5313();
				Static190.method3004("textures=" + Static399.aClass167_Sub1_1.aBoolean487);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static190.method3004("Invalid buildarea value");
					return;
				}
				local73 = Static175.method2762(arg0.substring(6));
				if (local73 >= 0 && Static336.method4748(Static43.anInt1146) >= local73) {
					Static399.aClass167_Sub1_1.anInt5566 = local73;
					Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
					Static45.aBoolean626 = false;
					Static190.method3004("maxbuildarea=" + Static399.aClass167_Sub1_1.anInt5566);
					return;
				}
				Static190.method3004("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static190.method3004("Invalid particles value");
					return;
				}
				Static48.method940(Static175.method2762(arg0.substring(13)));
				Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
				Static45.aBoolean626 = false;
				Static190.method3004("particles=" + Static118.method1725());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static190.method3004("Invalid rect_debug value");
					return;
				}
				Static198.anInt3846 = Static175.method2762(arg0.substring(10).trim());
				Static190.method3004("rect_debug=" + Static198.anInt3846);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static345.aBoolean339 = true;
				Static190.method3004("qa_op_test=" + Static345.aBoolean339);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static124.aBoolean204 = !Static124.aBoolean204;
				Static190.method3004("clipcomponents=" + Static124.aBoolean204);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(766) boolean local766 = Static387.aClass26_9.method2267();
				if (!Static407.method5517(!local766)) {
					Static190.method3004("Failed to enable bloom");
					return;
				}
				if (local766) {
					Static190.method3004("Bloom disabled");
					return;
				}
				Static190.method3004("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static431.aBoolean640) {
					Static431.aBoolean640 = true;
					Static190.method3004("Forced tweening ENABLED!");
					return;
				}
				Static431.aBoolean640 = false;
				Static190.method3004("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static243.aBoolean380) {
					Static190.method3004("Shift-click disabled.");
					Static243.aBoolean380 = false;
					return;
				}
				Static190.method3004("Shift-click ENABLED!");
				Static243.aBoolean380 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static190.method3004("x:" + (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7) + " z:" + (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static190.method3004("Height: " + Static372.aClass106Array11[Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92].I(Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static351.aClass188_97.method4275();
				Static351.aClass188_97.method4293();
				Static325.aClass221_4.method5019();
				Static304.aClass173_4.method4021();
				Static210.method3244();
				Static190.method3004("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static387.aClass26_9.method2290()) {
					Static190.method3004("Current toolkit doesn't support multiple cores");
					return;
				}
				local73 = Integer.parseInt(arg0.substring(3));
				if (local73 < 1) {
					local73 = 1;
				} else if (local73 > 4) {
					local73 = 4;
				}
				Static178.anInt3434 = local73;
				Static387.aClass26_9.method2234(Static178.anInt3434);
				Static387.aClass26_9.method2256(0);
				Static190.method3004("Render cores now: " + Static178.anInt3434);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static190.method3004("I(s): " + Static147.aClass129_43.method3024() + "/" + Static147.aClass129_43.method3032());
				Static190.method3004("I(m): " + Static419.aClass129_73.method3024() + "/" + Static419.aClass129_73.method3032());
				Static190.method3004("O(s): " + Static350.aClass149_2.aClass140_1.method3263() + "/" + Static350.aClass149_2.aClass140_1.method3267());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static190.method3004("Pos: " + Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 + "," + ((Static225.anInt4310 >> 7) + Static173.anInt3340 >> 6) + "," + (Static379.anInt6721 + (Static293.anInt5621 >> 7) >> 6) + "," + (Static173.anInt3340 + (Static225.anInt4310 >> 7) & 0x3F) + "," + ((Static293.anInt5621 >> 7) + Static379.anInt6721 & 0x3F) + " Height: " + (Static66.method1200(Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92, Static225.anInt4310, Static293.anInt5621) - Static110.anInt2281));
				Static190.method3004("Look: " + Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 + "," + (Static164.anInt3205 + Static173.anInt3340 >> 6) + "," + (Static142.anInt2719 + Static379.anInt6721 >> 6) + "," + (Static173.anInt3340 + Static164.anInt3205 & 0x3F) + "," + (Static142.anInt2719 + Static379.anInt6721 & 0x3F) + " Height: " + (Static66.method1200(Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92, Static164.anInt3205, Static142.anInt2719) - Static268.anInt4956));
				return;
			}
			if (arg0.equals("showocc")) {
				Static337.aBoolean522 = !Static337.aBoolean522;
				Static382.method5313();
				Static190.method3004("showocc=" + Static337.aBoolean522);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static113.aBoolean195 = !Static113.aBoolean195;
				Static382.method5313();
				Static190.method3004("forcewallocc=" + Static113.aBoolean195);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static100.aBoolean651 = !Static100.aBoolean651;
				Static387.aClass26_9.method2248(Static100.aBoolean651);
				Static371.method5226();
				Static190.method3004("showprofiling=" + Static100.aBoolean651);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static190.method3004("Java toolkit: " + Static139.method2009(Static303.aClass131_4));
				Static190.method3004("GL toolkit:   " + Static139.method2009(Static303.aClass131_4));
				Static190.method3004("SSE toolkit:  " + Static139.method2009(Static303.aClass131_4));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static65.aBoolean667 = !Static65.aBoolean667;
				Static190.method3004("nonpcs=" + Static65.aBoolean667);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static426.method5767();
				Static190.method3004("auto world selected");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static448.method6059(Static304.aClass44_70);
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				local73 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				local531 = arg0.indexOf(" ", 4);
				Static98.aClass2_Sub20_Sub1_1.method3715(arg0.substring(3, local531));
				Static9.method191(arg0.substring(local531), Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local73);
				return;
			}
			if (arg0.equals("heap")) {
				Static190.method3004("Heap: " + Static43.anInt1146 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static211.method3261();
				Static190.method3004("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local73 = 0; local73 < Static299.anIntArray357.length; local73++) {
					if (Static381.aBooleanArray48[local73]) {
						Static299.anIntArray357[local73] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static299.anIntArray357[local73] *= -1;
						}
					}
				}
				Static211.method3261();
				Static190.method3004("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static137.aBoolean234 = true;
				Static210.method3244();
				Static190.method3004("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static137.aBoolean234 = false;
				Static210.method3244();
				Static190.method3004("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static238.method3614();
				Static190.method3004("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static190.method3004(Static49.method987() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local73 = Integer.parseInt(arg0.substring(9));
				if (local73 >= 0 && local73 <= 4) {
					Static399.aClass167_Sub1_1.anInt5563 = local73;
				}
				Static190.method3004("cpuusage=" + Static399.aClass167_Sub1_1.anInt5563);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local73 = Integer.parseInt(arg0.substring(17));
				Static190.method3004("varpbit=" + Static215.aClass225_1.method5146(local73));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local73 = Integer.parseInt(arg0.substring(14));
				Static190.method3004("varp=" + Static215.aClass225_1.method5145(local73));
				return;
			}
			if (arg0.startsWith("csprofileclear")) {
				Static290.method4229();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static290.method4223();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static290.method4223();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local73 = Integer.parseInt(arg0.substring(8));
				Static387.aClass26_9.method2270(local73);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static190.method3004("Active streams: " + Static360.aClass2_Sub18_Sub4_2.method4453());
				return;
			}
			if (Static297.anInt5339 == 30) {
				Static448.method6059(Static125.aClass44_33);
				Static98.aClass2_Sub20_Sub1_1.method3699(arg0.length() + 2);
				Static98.aClass2_Sub20_Sub1_1.method3699(arg1 ? 1 : 0);
				Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
			}
			if (arg0.startsWith("fps ") && Static343.aClass269_11 != Static293.aClass269_10) {
				Static190.method3002(Static175.method2762(arg0.substring(4)));
				return;
			}
			if (Static297.anInt5339 != 30) {
				Static190.method3004("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1628) Exception local1628) {
			Static190.method3004("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[[[Lclient!ht;)V")
	public static void method2776(@OriginalArg(1) Class113[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(21) Class113[][] local21 = arg0[local7];
			for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
				for (@Pc(27) int local27 = 0; local27 < local21[local23].length; local27++) {
					@Pc(35) Class113 local35 = local21[local23][local27];
					if (local35 != null) {
						if (local35.aClass4_Sub3_1 instanceof Interface9) {
							((Interface9) local35.aClass4_Sub3_1).method5899();
						}
						if (local35.aClass4_Sub1_2 instanceof Interface9) {
							((Interface9) local35.aClass4_Sub1_2).method5899();
						}
						if (local35.aClass4_Sub1_3 instanceof Interface9) {
							((Interface9) local35.aClass4_Sub1_3).method5899();
						}
						if (local35.aClass4_Sub4_2 instanceof Interface9) {
							((Interface9) local35.aClass4_Sub4_2).method5899();
						}
						if (local35.aClass4_Sub4_1 instanceof Interface9) {
							((Interface9) local35.aClass4_Sub4_1).method5899();
						}
						for (@Pc(85) Class134 local85 = local35.aClass134_1; local85 != null; local85 = local85.aClass134_2) {
							@Pc(90) Class4_Sub2 local90 = local85.aClass4_Sub2_1;
							if (local90 instanceof Interface9) {
								((Interface9) local90).method5899();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	public static void method2777() {
		@Pc(1) Class129 local1 = Static115.aClass129_58;
		synchronized (Static115.aClass129_58) {
			Static115.aClass129_58.method3028(5);
		}
		local1 = Static205.aClass129_33;
		synchronized (Static205.aClass129_33) {
			Static205.aClass129_33.method3028(5);
		}
	}
}
