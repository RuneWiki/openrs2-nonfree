import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_67 = new Class242("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public static int anInt5458 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method4192(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static130.aClass239_4 == Static427.aClass239_7 && Static189.anInt3643 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static107.aBoolean174 = true;
				Static267.method3631("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static107.aBoolean174 = false;
				Static267.method3631("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static331.anInt5817 = 0;
				Static130.anInt2598 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static308.aClass27_7.method734();
				Static267.method3631("Text coords cleared");
				return;
			}
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(80) Runtime local80;
			if (arg0.equalsIgnoreCase("gc")) {
				Static173.method2532();
				for (local71 = 0; local71 < 10; local71++) {
					System.gc();
				}
				local80 = Runtime.getRuntime();
				local89 = (int) ((local80.totalMemory() - local80.freeMemory()) / 1024L);
				Static267.method3631("mem=" + local89 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static173.method2532();
				for (local71 = 0; local71 < 10; local71++) {
					System.gc();
				}
				local80 = Runtime.getRuntime();
				local89 = (int) ((local80.totalMemory() - local80.freeMemory()) / 1024L);
				Static267.method3631("Memory before cleanup=" + local89 + "k");
				Static124.method1884();
				Static173.method2532();
				for (@Pc(148) int local148 = 0; local148 < 10; local148++) {
					System.gc();
				}
				local89 = (int) ((local80.totalMemory() - local80.freeMemory()) / 1024L);
				Static267.method3631("Memory after cleanup=" + local89 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static267.method3631("Number of player models in cache:" + Static316.method4644());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static267.method3631("Dropped client connection");
				if (Static73.anInt1749 == 30) {
					Static316.method4696();
				} else if (Static73.anInt1749 == 25) {
					Static174.aBoolean240 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static366.aClass125_3.method2602();
				Static267.method3631("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static366.aClass125_3.method2605();
				Static267.method3631("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static89.aClass114_3.method2352();
				Static223.aClass5_3.method115();
				Static366.aClass125_3.method2606();
				Static267.method3631("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static399.method5302();
				Static307.method5820();
				Static267.method3631("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static352.method4941(-1, -1, 1, false);
				if (Static144.method2104() == 1) {
					Static267.method3631("wm1 succeeded");
					return;
				}
				Static267.method3631("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static352.method4941(-1, -1, 2, false);
				if (Static144.method2104() != 2) {
					Static267.method3631("wm2 failed");
					return;
				}
				Static267.method3631("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static352.method4941(1024, 768, 3, false);
				if (Static144.method2104() == 3) {
					Static267.method3631("wm3 succeeded");
					return;
				}
				Static267.method3631("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static435.method5598(0);
				if (Static286.anInt5207 == 0) {
					Static267.method3631("Entered tk0");
					Static126.aClass67_Sub1_1.anInt5866 = 0;
					Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
					Static120.aBoolean189 = false;
					return;
				}
				Static267.method3631("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static435.method5598(1);
				if (Static286.anInt5207 == 1) {
					Static267.method3631("Entered tk1");
					Static126.aClass67_Sub1_1.anInt5866 = 1;
					Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
					Static120.aBoolean189 = false;
					return;
				}
				Static267.method3631("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static435.method5598(2);
				if (Static286.anInt5207 == 2) {
					Static267.method3631("Entered tk2");
					Static126.aClass67_Sub1_1.anInt5866 = 2;
					Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
					Static120.aBoolean189 = false;
					return;
				}
				Static267.method3631("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static435.method5598(3);
				if (Static286.anInt5207 == 3) {
					Static267.method3631("Entered tk3");
					return;
				}
				Static267.method3631("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static126.aClass67_Sub1_1.aBoolean404 = !Static126.aClass67_Sub1_1.aBoolean404;
				Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
				Static120.aBoolean189 = false;
				Static399.method5302();
				Static267.method3631("ot=" + Static126.aClass67_Sub1_1.aBoolean404);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static126.aClass67_Sub1_1.aBoolean397 = !Static126.aClass67_Sub1_1.aBoolean397;
				Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
				Static120.aBoolean189 = false;
				Static399.method5302();
				Static267.method3631("gb=" + Static126.aClass67_Sub1_1.aBoolean397);
				return;
			}
			@Pc(528) int local528;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static267.method3631("Invalid shadows value");
					return;
				}
				@Pc(518) String local518 = arg0.substring(8);
				local528 = Static30.method548(local518) ? Static297.method4115(local518) : -1;
				if (local528 >= 0 && local528 <= 2) {
					Static126.aClass67_Sub1_1.method4519(local528, Static286.anInt5207);
					Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
					Static120.aBoolean189 = false;
					Static399.method5302();
					Static267.method3631("shadows=" + local528);
					return;
				}
				Static267.method3631("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static126.aClass67_Sub1_1.aBoolean396 = !Static126.aClass67_Sub1_1.aBoolean396;
				Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
				Static120.aBoolean189 = false;
				Static88.method1487();
				Static399.method5302();
				Static267.method3631("textures=" + Static126.aClass67_Sub1_1.aBoolean396);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static267.method3631("Invalid buildarea value");
					return;
				}
				local71 = Static297.method4115(arg0.substring(6));
				if (local71 >= 0 && local71 <= Static236.method3282(Static346.anInt6291)) {
					Static126.aClass67_Sub1_1.anInt5854 = local71;
					Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
					Static120.aBoolean189 = false;
					Static267.method3631("maxbuildarea=" + Static126.aClass67_Sub1_1.anInt5854);
					return;
				}
				Static267.method3631("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static267.method3631("Invalid particles value");
					return;
				}
				Static324.method5215(Static297.method4115(arg0.substring(13)));
				Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
				Static120.aBoolean189 = false;
				Static267.method3631("particles=" + Static344.method4802());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static267.method3631("Invalid rect_debug value");
					return;
				}
				Static31.anInt724 = Static297.method4115(arg0.substring(10).trim());
				Static267.method3631("rect_debug=" + Static31.anInt724);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static197.aBoolean436 = true;
				Static267.method3631("qa_op_test=" + Static197.aBoolean436);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static187.aBoolean268 = !Static187.aBoolean268;
				Static267.method3631("clipcomponents=" + Static187.aBoolean268);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(763) boolean local763 = Static16.aClass30_11.method4666();
				if (!Static415.method5436(!local763)) {
					Static267.method3631("Failed to enable bloom");
					return;
				}
				if (local763) {
					Static267.method3631("Bloom disabled");
					return;
				}
				Static267.method3631("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static218.aBoolean291) {
					Static218.aBoolean291 = true;
					Static267.method3631("Forced tweening ENABLED!");
					return;
				}
				Static218.aBoolean291 = false;
				Static267.method3631("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static416.aBoolean477) {
					Static267.method3631("Shift-click ENABLED!");
					Static416.aBoolean477 = true;
					return;
				}
				Static267.method3631("Shift-click disabled.");
				Static416.aBoolean477 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static267.method3631("x:" + (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7) + " z:" + (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static267.method3631("Height: " + Static346.aClass146Array2[Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86].I(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static149.aClass166_105.method3686();
				Static149.aClass166_105.method3671();
				Static70.aClass212_6.method4937();
				Static236.aClass198_3.method4490();
				Static307.method5820();
				Static267.method3631("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static16.aClass30_11.method4643()) {
					Static267.method3631("Current toolkit doesn't support multiple cores");
					return;
				}
				local71 = Integer.parseInt(arg0.substring(3));
				if (local71 < 1) {
					local71 = 1;
				} else if (local71 > 4) {
					local71 = 4;
				}
				Static11.anInt379 = local71;
				Static16.aClass30_11.method4675(Static11.anInt379);
				Static16.aClass30_11.method4673(0);
				Static267.method3631("Render cores now: " + Static11.anInt379);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static267.method3631("I(s): " + Static220.aClass69_50.method1599() + "/" + Static220.aClass69_50.method1598());
				Static267.method3631("I(m): " + Static123.aClass69_69.method1599() + "/" + Static123.aClass69_69.method1598());
				Static267.method3631("O(s): " + Static390.aClass204_2.aClass183_1.method4108() + "/" + Static390.aClass204_2.aClass183_1.method4104());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static267.method3631("Pos: " + Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 + "," + ((Static254.anInt4614 >> 7) + Static381.anInt6688 >> 6) + "," + ((Static30.anInt696 >> 7) + Static285.anInt5187 >> 6) + "," + (Static381.anInt6688 + (Static254.anInt4614 >> 7) & 0x3F) + "," + ((Static30.anInt696 >> 7) + Static285.anInt5187 & 0x3F) + " Height: " + (Static222.method3109(Static254.anInt4614, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, Static30.anInt696) - Static292.anInt5287));
				Static267.method3631("Look: " + Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 + "," + (Static381.anInt6688 + Static420.anInt7596 >> 6) + "," + (Static396.anInt6813 + Static285.anInt5187 >> 6) + "," + (Static420.anInt7596 + Static381.anInt6688 & 0x3F) + "," + (Static285.anInt5187 + Static396.anInt6813 & 0x3F) + " Height: " + (Static222.method3109(Static420.anInt7596, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, Static396.anInt6813) - Static84.anInt1908));
				return;
			}
			if (arg0.equals("showocc")) {
				Static81.aBoolean126 = !Static81.aBoolean126;
				Static399.method5302();
				Static267.method3631("showocc=" + Static81.aBoolean126);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static286.aBoolean356 = !Static286.aBoolean356;
				Static399.method5302();
				Static267.method3631("forcewallocc=" + Static286.aBoolean356);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static149.aBoolean206 = !Static149.aBoolean206;
				Static16.aClass30_11.method4671(Static149.aBoolean206);
				Static447.method5738();
				Static267.method3631("showprofiling=" + Static149.aBoolean206);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static267.method3631("Java toolkit: " + Static167.method2479(Static89.aClass114_3));
				Static267.method3631("GL toolkit:   " + Static167.method2479(Static89.aClass114_3));
				Static267.method3631("SSE toolkit:  " + Static167.method2479(Static89.aClass114_3));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static258.aBoolean341 = !Static258.aBoolean341;
				Static267.method3631("nonpcs=" + Static258.aBoolean341);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static433.method5557();
				Static267.method3631("auto world selected");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static209.method2982(Static72.aClass36_38);
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				local71 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				local528 = arg0.indexOf(" ", 4);
				Static116.aClass4_Sub30_Sub1_1.method4849(arg0.substring(3, local528));
				Static75.method1364(arg0.substring(local528), Static116.aClass4_Sub30_Sub1_1);
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local71);
				return;
			}
			if (arg0.equals("heap")) {
				Static267.method3631("Heap: " + Static346.anInt6291 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static130.method1932();
				Static267.method3631("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local71 = 0; local71 < Static327.anIntArray505.length; local71++) {
					if (Static291.aBooleanArray18[local71]) {
						Static327.anIntArray505[local71] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static327.anIntArray505[local71] *= -1;
						}
					}
				}
				Static130.method1932();
				Static267.method3631("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static201.aBoolean441 = true;
				Static307.method5820();
				Static267.method3631("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static201.aBoolean441 = false;
				Static307.method5820();
				Static267.method3631("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static13.method325();
				Static267.method3631("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static267.method3631(Static102.method1610() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local71 = Integer.parseInt(arg0.substring(9));
				if (local71 >= 0 && local71 <= 4) {
					Static126.aClass67_Sub1_1.anInt5845 = local71;
				}
				Static267.method3631("cpuusage=" + Static126.aClass67_Sub1_1.anInt5845);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local71 = Integer.parseInt(arg0.substring(17));
				Static267.method3631("varpbit=" + Static155.aClass149_1.method3212(local71));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local71 = Integer.parseInt(arg0.substring(14));
				Static267.method3631("varp=" + Static155.aClass149_1.method3211(local71));
				return;
			}
			if (arg0.startsWith("csprofileclear")) {
				Static172.method2508();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static172.method2514();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static172.method2514();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local71 = Integer.parseInt(arg0.substring(8));
				Static16.aClass30_11.method4631(local71);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static267.method3631("Active streams: " + Static393.aClass4_Sub18_Sub1_1.method2793());
				return;
			}
			if (Static73.anInt1749 == 30) {
				Static209.method2982(Static339.aClass36_107);
				Static116.aClass4_Sub30_Sub1_1.method4871(arg0.length() + 2);
				Static116.aClass4_Sub30_Sub1_1.method4871(arg1 ? 1 : 0);
				Static116.aClass4_Sub30_Sub1_1.method4849(arg0);
			}
			if (arg0.startsWith("fps ") && Static427.aClass239_7 != Static130.aClass239_4) {
				Static95.method1550(Static297.method4115(arg0.substring(4)));
				return;
			}
			if (Static73.anInt1749 != 30) {
				Static267.method3631("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1624) Exception local1624) {
			Static267.method3631("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	public static void method4195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass6_Sub3_1 != null) {
			local7.aClass6_Sub3_1 = null;
		}
		if (local7.aClass6_Sub3_2 != null) {
			local7.aClass6_Sub3_2 = null;
		}
	}
}
