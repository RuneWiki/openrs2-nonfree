import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qs", name = "W", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_183 = new Class106("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!qs", name = "bb", descriptor = "I")
	public static int anInt5269 = 64;

	@OriginalMember(owner = "client!qs", name = "cb", descriptor = "Z")
	public static volatile boolean aBoolean400 = true;

	@OriginalMember(owner = "client!qs", name = "db", descriptor = "I")
	public static int anInt5270 = 1;

	@OriginalMember(owner = "client!qs", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString50 = "";

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(III)V")
	public static void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static280.method5009(Static11.aClass18_36);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg0);
		Static339.aClass1_Sub7_Sub2_4.method2158(arg1);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
	public static void method4839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class155 local28 = Static105.aClass155ArrayArrayArray3[local9][arg0][arg1] = Static105.aClass155ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte36--;
				for (@Pc(40) Class187 local40 = local28.aClass187_2; local40 != null; local40 = local40.aClass187_3) {
					@Pc(44) Class11_Sub2 local44 = local40.aClass11_Sub2_2;
					if (local44.aShort94 == arg0 && local44.aShort93 == arg1) {
						local44.aByte79--;
					}
				}
			}
		}
		if (Static105.aClass155ArrayArrayArray3[0][arg0][arg1] == null) {
			Static105.aClass155ArrayArrayArray3[0][arg0][arg1] = new Class155(0, arg0, arg1);
			Static105.aClass155ArrayArrayArray3[0][arg0][arg1].aByte41 = 1;
		}
		Static105.aClass155ArrayArrayArray3[0][arg0][arg1].aClass155_1 = local7;
		Static105.aClass155ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4842(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static195.anInt3950 == 0 && Static110.anInt2477 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static291.aBoolean428 = true;
				Static160.method3015("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static291.aBoolean428 = false;
				Static160.method3015("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static13.anInt332 = 0;
				Static24.anInt577 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static299.aClass195_8.method5297();
				Static160.method3015("Text coords cleared");
				return;
			}
			@Pc(77) int local77;
			@Pc(97) int local97;
			@Pc(88) Runtime local88;
			if (arg1.equalsIgnoreCase("gc")) {
				Static49.method1174();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local88 = Runtime.getRuntime();
				local97 = (int) ((local88.totalMemory() - local88.freeMemory()) / 1024L);
				Static160.method3015("mem=" + local97 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static49.method1174();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local88 = Runtime.getRuntime();
				local97 = (int) ((local88.totalMemory() - local88.freeMemory()) / 1024L);
				Static160.method3015("Memory before cleanup=" + local97 + "k");
				Static15.method342();
				Static49.method1174();
				for (@Pc(154) int local154 = 0; local154 < 10; local154++) {
					System.gc();
				}
				local97 = (int) ((local88.totalMemory() - local88.freeMemory()) / 1024L);
				Static160.method3015("Memory after cleanup=" + local97 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static160.method3015("Number of player models in cache:" + Static25.method1282());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static160.method3015("Dropped client connection");
				if (Static13.anInt334 == 30) {
					Static228.method4268();
				} else if (Static13.anInt334 == 25) {
					Static301.aBoolean434 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static280.aClass191_2.method5185();
				Static160.method3015("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static280.aClass191_2.method5190();
				Static160.method3015("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static227.aClass75_5.method2355();
				Static165.aClass76_2.method2378();
				Static280.aClass191_2.method5178();
				Static160.method3015("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static346.method5761();
				Static161.method3064();
				Static160.method3015("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static194.method3635(1, -1, -1, false);
				if (Static300.method5230() != 1) {
					Static160.method3015("wm1 failed");
					return;
				}
				Static160.method3015("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static194.method3635(2, -1, -1, false);
				if (Static300.method5230() == 2) {
					Static160.method3015("wm2 succeeded");
					return;
				}
				Static160.method3015("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static194.method3635(3, 1024, 768, false);
				if (Static300.method5230() != 3) {
					Static160.method3015("wm3 failed");
					return;
				}
				Static160.method3015("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static186.method3507(0);
				if (Static241.anInt4925 == 0) {
					Static160.method3015("Entered tk0");
					Static359.anInt6875 = 0;
					Static206.method4914(Static227.aClass75_5);
					Static307.aBoolean439 = false;
					return;
				}
				Static160.method3015("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static186.method3507(1);
				if (Static241.anInt4925 == 1) {
					Static160.method3015("Entered tk1");
					Static359.anInt6875 = 1;
					Static206.method4914(Static227.aClass75_5);
					Static307.aBoolean439 = false;
					return;
				}
				Static160.method3015("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static186.method3507(2);
				if (Static241.anInt4925 == 2) {
					Static160.method3015("Entered tk2");
					Static359.anInt6875 = 2;
					Static206.method4914(Static227.aClass75_5);
					Static307.aBoolean439 = false;
					return;
				}
				Static160.method3015("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static186.method3507(3);
				if (Static241.anInt4925 == 3) {
					Static160.method3015("Entered tk3");
					return;
				}
				Static160.method3015("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static239.aBoolean363 = !Static239.aBoolean363;
				Static206.method4914(Static227.aClass75_5);
				Static307.aBoolean439 = false;
				Static346.method5761();
				Static160.method3015("ot=" + Static239.aBoolean363);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static298.aBoolean483 = !Static298.aBoolean483;
				Static206.method4914(Static227.aClass75_5);
				Static307.aBoolean439 = false;
				Static346.method5761();
				Static160.method3015("gb=" + Static298.aBoolean483);
				return;
			}
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static160.method3015("Invalid shadows value");
					return;
				}
				@Pc(509) String local509 = arg1.substring(8);
				@Pc(519) int local519 = Static9.method296(local509) ? Static171.method3207(local509) : -1;
				if (local519 >= 0 && local519 <= 2) {
					Static218.anInt4352 = local519;
					Static206.method4914(Static227.aClass75_5);
					Static307.aBoolean439 = false;
					Static346.method5761();
					Static160.method3015("shadows=" + local519);
					return;
				}
				Static160.method3015("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static160.method3015("Invalid buildarea value");
					return;
				}
				local77 = Static171.method3207(arg1.substring(6));
				if (local77 >= 0 && Static20.method556(anInt5269) >= local77) {
					Static72.anInt1645 = local77;
					Static206.method4914(Static227.aClass75_5);
					Static307.aBoolean439 = false;
					Static160.method3015("maxbuildarea=" + Static72.anInt1645);
					return;
				}
				Static160.method3015("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static160.method3015("Invalid particles value");
					return;
				}
				Static5.method272(Static171.method3207(arg1.substring(13)));
				Static206.method4914(Static227.aClass75_5);
				Static307.aBoolean439 = false;
				Static160.method3015("particles=" + Static79.method1692());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static160.method3015("Invalid rect_debug value");
					return;
				}
				Static332.anInt6250 = Static171.method3207(arg1.substring(10).trim());
				Static160.method3015("rect_debug=" + Static332.anInt6250);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static339.aBoolean444 = true;
				Static160.method3015("qa_op_test=" + Static339.aBoolean444);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static259.aBoolean384 = !Static259.aBoolean384;
				Static160.method3015("clipcomponents=" + Static259.aBoolean384);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(715) boolean local715 = Static9.aClass63_1.method4657();
				if (!Static160.method3014(!local715)) {
					Static160.method3015("Failed to enable bloom");
					return;
				}
				if (local715) {
					Static160.method3015("Bloom disabled");
					return;
				}
				Static160.method3015("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static21.aBoolean29) {
					Static21.aBoolean29 = false;
					Static160.method3015("Forced tweening disabled.");
					return;
				}
				Static21.aBoolean29 = true;
				Static160.method3015("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static272.aBoolean405) {
					Static160.method3015("Shift-click disabled.");
					Static272.aBoolean405 = false;
					return;
				}
				Static160.method3015("Shift-click ENABLED!");
				Static272.aBoolean405 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static160.method3015("x:" + (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7) + " z:" + (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static160.method3015("Height: " + Static258.aClass36Array2[Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79].method4431(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static280.aClass30_83.method1149();
				Static280.aClass30_83.method1166();
				Static215.method3978();
				Static161.method3064();
				Static160.method3015("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static9.aClass63_1.method4567()) {
					Static160.method3015("Current toolkit doesn't support multiple cores");
					return;
				}
				local77 = Integer.parseInt(arg1.substring(3));
				if (local77 < 1) {
					local77 = 1;
				} else if (local77 > 4) {
					local77 = 4;
				}
				Static44.anInt1145 = local77;
				Static9.aClass63_1.method4576(Static44.anInt1145);
				Static9.aClass63_1.method4600(0);
				Static160.method3015("Render cores now: " + Static44.anInt1145);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static160.method3015("I(s): " + Static184.aClass21_104.method845() + "/" + Static184.aClass21_104.method849());
				Static160.method3015("I(m): " + Static324.aClass21_164.method845() + "/" + Static324.aClass21_164.method849());
				Static160.method3015("O(s): " + Static243.aClass220_2.aClass160_1.method4363() + "/" + Static243.aClass220_2.aClass160_1.method4358());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static160.method3015("Pos: " + Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 + "," + ((Static14.anInt4971 >> 7) + Static50.anInt1271 >> 6) + "," + ((Static260.anInt5192 >> 7) + Static299.anInt4036 >> 6) + "," + (Static50.anInt1271 + (Static14.anInt4971 >> 7) & 0x3F) + "," + (Static299.anInt4036 + (Static260.anInt5192 >> 7) & 0x3F) + " Height: " + (Static8.method288(Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, Static14.anInt4971, Static260.anInt5192) - Static294.anInt5665));
				Static160.method3015("Look: " + Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 + "," + (Static50.anInt1271 + Static144.anInt3083 >> 6) + "," + (Static299.anInt4036 + Static116.anInt2536 >> 6) + "," + (Static144.anInt3083 + Static50.anInt1271 & 0x3F) + "," + (Static116.anInt2536 + Static299.anInt4036 & 0x3F) + " Height: " + (Static8.method288(Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, Static144.anInt3083, Static116.anInt2536) - Static363.anInt6978));
				return;
			}
			if (arg1.equals("showocc")) {
				Static258.aBoolean75 = !Static258.aBoolean75;
				Static346.method5761();
				Static160.method3015("showocc=" + Static258.aBoolean75);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static134.aBoolean207 = !Static134.aBoolean207;
				Static9.aClass63_1.method4637(Static134.aBoolean207);
				Static112.method2383();
				Static160.method3015("showprofiling=" + Static134.aBoolean207);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static122.aBoolean98 = !Static122.aBoolean98;
				Static160.method3015("nonpcs=" + Static122.aBoolean98);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static12.method333();
				Static160.method3015("auto world selected");
				return;
			}
			if (arg1.equals("heap")) {
				Static160.method3015("Heap: " + anInt5269 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static344.method4471();
				Static160.method3015("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local77 = 0; local77 < Static7.anIntArray24.length; local77++) {
					if (Static237.aBooleanArray11[local77]) {
						Static7.anIntArray24[local77] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static7.anIntArray24[local77] *= -1;
						}
					}
				}
				Static344.method4471();
				Static160.method3015("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static264.aBoolean388 = true;
				Static161.method3064();
				Static160.method3015("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static264.aBoolean388 = false;
				Static161.method3064();
				Static160.method3015("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static96.method2069();
				Static160.method3015("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static160.method3015(Static306.method5299() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local77 = Integer.parseInt(arg1.substring(9));
				if (local77 >= 0 && local77 <= 4) {
					Static300.anInt5779 = local77;
				}
				Static160.method3015("cpuusage=" + Static300.anInt5779);
				return;
			}
			if (Static13.anInt334 == 30) {
				Static280.method5009(Static267.aClass18_177);
				Static339.aClass1_Sub7_Sub2_4.method2121(arg1.length() + 2);
				Static339.aClass1_Sub7_Sub2_4.method2121(arg0 ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2106(arg1);
			}
			if (arg1.startsWith("fps ") && Static195.anInt3950 != 0) {
				Static16.method446(Static171.method3207(arg1.substring(4)));
				return;
			}
			if (Static13.anInt334 != 30) {
				Static160.method3015("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1363) Exception local1363) {
			Static160.method3015("Whoops, something went wrong.");
			return;
		}
	}
}
