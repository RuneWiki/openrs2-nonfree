import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt2845;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt2846;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[Lclient!ro;")
	public static Class175[] aClass175Array2;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!vf;")
	public static Class2_Sub42 aClass2_Sub42_2;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public static int anInt2847;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_98 = new Class221(5, 6);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	public static int method2574(@OriginalArg(0) int arg0) {
		@Pc(7) Class141 local7 = Static301.method5064(arg0);
		@Pc(10) int local10 = local7.anInt4854;
		@Pc(21) int local21 = local7.anInt4852;
		@Pc(24) int local24 = local7.anInt4853;
		@Pc(31) int local31 = Class149.anIntArray396[local24 - local21];
		return local31 & Static181.anIntArray308[local10] >> local21;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method2575(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static260.anInt5453 == 0 && Static291.anInt5264 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static311.aBoolean550 = true;
				Static35.method5764("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static311.aBoolean550 = false;
				Static35.method5764("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static250.anInt5225 = 0;
				Static128.anInt2757 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static8.aClass193_1.method5218();
				Static35.method5764("Text coords cleared");
				return;
			}
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(82) Runtime local82;
			if (arg1.equalsIgnoreCase("gc")) {
				Static360.method5744();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static35.method5764("mem=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static360.method5744();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static35.method5764("Memory before cleanup=" + local91 + "k");
				Static127.method2503();
				Static360.method5744();
				for (@Pc(149) int local149 = 0; local149 < 10; local149++) {
					System.gc();
				}
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static35.method5764("Memory after cleanup=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static35.method5764("Number of player models in cache:" + Static268.method4691());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static35.method5764("Dropped client connection");
				if (Static176.anInt3971 == 30) {
					Static36.method468();
				} else if (Static176.anInt3971 == 25) {
					Static107.aBoolean215 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static57.aClass79_1.method2111();
				Static35.method5764("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static57.aClass79_1.method2114();
				Static35.method5764("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static62.aClass179_2.method4888();
				Static129.aClass117_2.method3280();
				Static57.aClass79_1.method2107();
				Static35.method5764("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static140.method2718();
				Static81.method1661();
				Static35.method5764("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static84.method1692(-1, 1, -1, false);
				if (Static26.method3361() == 1) {
					Static35.method5764("wm1 succeeded");
					return;
				}
				Static35.method5764("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static84.method1692(-1, 2, -1, false);
				if (Static26.method3361() == 2) {
					Static35.method5764("wm2 succeeded");
					return;
				}
				Static35.method5764("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static84.method1692(768, 3, 1024, false);
				if (Static26.method3361() == 3) {
					Static35.method5764("wm3 succeeded");
					return;
				}
				Static35.method5764("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static212.method3988(0);
				if (Static114.anInt2421 != 0) {
					Static35.method5764("Failed to enter tk0");
					return;
				}
				Static35.method5764("Entered tk0");
				Static18.anInt304 = 0;
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static212.method3988(1);
				if (Static114.anInt2421 != 1) {
					Static35.method5764("Failed to enter tk1");
					return;
				}
				Static35.method5764("Entered tk1");
				Static18.anInt304 = 1;
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static212.method3988(2);
				if (Static114.anInt2421 != 2) {
					Static35.method5764("Failed to enter tk2");
					return;
				}
				Static35.method5764("Entered tk2");
				Static18.anInt304 = 2;
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static212.method3988(3);
				if (Static114.anInt2421 == 3) {
					Static35.method5764("Entered tk3");
					return;
				}
				Static35.method5764("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static219.aBoolean425 = !Static219.aBoolean425;
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				Static140.method2718();
				Static35.method5764("ot=" + Static219.aBoolean425);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static243.aBoolean451 = !Static243.aBoolean451;
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				Static140.method2718();
				Static35.method5764("gb=" + Static243.aBoolean451);
				return;
			}
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static35.method5764("Invalid shadows value");
					return;
				}
				@Pc(515) String local515 = arg1.substring(8);
				@Pc(525) int local525 = Static113.method2232(local515) ? Static16.method250(local515) : -1;
				if (local525 >= 0 && local525 <= 2) {
					Static222.anInt6836 = local525;
					Static167.method3337(Static62.aClass179_2);
					Static128.aBoolean263 = false;
					Static140.method2718();
					Static35.method5764("shadows=" + local525);
					return;
				}
				Static35.method5764("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static35.method5764("Invalid buildarea value");
					return;
				}
				local73 = Static16.method250(arg1.substring(6));
				if (local73 >= 0 && Static130.method2513(Static147.anInt3175) >= local73) {
					Static248.anInt5206 = local73;
					Static167.method3337(Static62.aClass179_2);
					Static128.aBoolean263 = false;
					Static35.method5764("maxbuildarea=" + Static248.anInt5206);
					return;
				}
				Static35.method5764("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static35.method5764("Invalid particles value");
					return;
				}
				Static24.method873(Static16.method250(arg1.substring(13)));
				Static167.method3337(Static62.aClass179_2);
				Static128.aBoolean263 = false;
				Static35.method5764("particles=" + Static292.method4861());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static35.method5764("Invalid rect_debug value");
					return;
				}
				Static218.anInt4843 = Static16.method250(arg1.substring(10).trim());
				Static35.method5764("rect_debug=" + Static218.anInt4843);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static334.aBoolean581 = true;
				Static35.method5764("qa_op_test=" + Static334.aBoolean581);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static197.aBoolean358 = !Static197.aBoolean358;
				Static35.method5764("clipcomponents=" + Static197.aBoolean358);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(725) boolean local725 = Static51.aClass37_1.method3719();
				if (!Static140.method2722(!local725)) {
					Static35.method5764("Failed to enable bloom");
					return;
				}
				if (!local725) {
					Static35.method5764("Bloom enabled");
					return;
				}
				Static35.method5764("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static263.aBoolean483) {
					Static263.aBoolean483 = true;
					Static35.method5764("Forced tweening ENABLED!");
					return;
				}
				Static263.aBoolean483 = false;
				Static35.method5764("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static231.aBoolean433) {
					Static35.method5764("Shift-click ENABLED!");
					Static231.aBoolean433 = true;
					return;
				}
				Static35.method5764("Shift-click disabled.");
				Static231.aBoolean433 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static35.method5764("x:" + (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7) + " z:" + (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static35.method5764("Height: " + Static9.aClass105Array1[Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77].method4453(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static338.aClass104_184.method2771();
				Static338.aClass104_184.method2751();
				Static355.method5675();
				Static81.method1661();
				Static35.method5764("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static51.aClass37_1.method3683()) {
					local73 = Integer.parseInt(arg1.substring(3));
					if (local73 < 1) {
						local73 = 1;
					} else if (local73 > 4) {
						local73 = 4;
					}
					Static323.anInt6326 = local73;
					Static51.aClass37_1.method3650(Static323.anInt6326);
					Static51.aClass37_1.method3678(0);
					Static35.method5764("Render cores now: " + Static323.anInt6326);
					return;
				}
				Static35.method5764("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static35.method5764("I(s): " + Static204.aClass107_25.method3016() + "/" + Static204.aClass107_25.method3010());
				Static35.method5764("I(m): " + Static354.aClass107_57.method3016() + "/" + Static354.aClass107_57.method3010());
				Static35.method5764("O(s): " + Static310.aClass184_2.aClass27_1.method437() + "/" + Static310.aClass184_2.aClass27_1.method424());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static35.method5764("Pos: " + Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 + "," + (Static150.anInt3453 + (Static166.anInt3804 >> 7) >> 6) + "," + (Static287.anInt5776 + (Static51.anInt879 >> 7) >> 6) + "," + (Static150.anInt3453 + (Static166.anInt3804 >> 7) & 0x3F) + "," + ((Static51.anInt879 >> 7) + Static287.anInt5776 & 0x3F) + " Height: " + (Static97.method1899(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, Static51.anInt879, Static166.anInt3804) - Static23.anInt356));
				Static35.method5764("Look: " + Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 + "," + (Static236.anInt929 + Static150.anInt3453 >> 6) + "," + (Static87.anInt1642 + Static287.anInt5776 >> 6) + "," + (Static150.anInt3453 + Static236.anInt929 & 0x3F) + "," + (Static87.anInt1642 + Static287.anInt5776 & 0x3F) + " Height: " + (Static97.method1899(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, Static87.anInt1642, Static236.anInt929) - Static234.anInt5027));
				return;
			}
			if (arg1.equals("showocc")) {
				Static363.aBoolean619 = !Static363.aBoolean619;
				Static140.method2718();
				Static35.method5764("showocc=" + Static363.aBoolean619);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static123.aBoolean256 = !Static123.aBoolean256;
				Static51.aClass37_1.method3725(Static123.aBoolean256);
				Static58.method1235();
				Static35.method5764("showprofiling=" + Static123.aBoolean256);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static286.aBoolean511 = !Static286.aBoolean511;
				Static35.method5764("nonpcs=" + Static286.aBoolean511);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static357.method5711();
				Static35.method5764("auto world selected");
				return;
			}
			if (arg1.equals("heap")) {
				Static35.method5764("Heap: " + Static147.anInt3175 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static191.method3581();
				Static35.method5764("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local73 = 0; local73 < Static20.anIntArray40.length; local73++) {
					if (Static18.aBooleanArray4[local73]) {
						Static20.anIntArray40[local73] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static20.anIntArray40[local73] *= -1;
						}
					}
				}
				Static191.method3581();
				Static35.method5764("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static296.aBoolean582 = true;
				Static81.method1661();
				Static35.method5764("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static296.aBoolean582 = false;
				Static81.method1661();
				Static35.method5764("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static51.method1022();
				Static35.method5764("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static35.method5764(Static47.method899() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local73 = Integer.parseInt(arg1.substring(9));
				if (local73 >= 0 && local73 <= 4) {
					Static168.anInt3821 = local73;
				}
				Static35.method5764("cpuusage=" + Static168.anInt3821);
				return;
			}
			if (Static176.anInt3971 == 30) {
				Static300.method5057(Static65.aClass157_93);
				Static197.aClass2_Sub12_Sub2_2.method3147(arg1.length() + 2);
				Static197.aClass2_Sub12_Sub2_2.method3147(arg0 ? 1 : 0);
				Static197.aClass2_Sub12_Sub2_2.method3156(arg1);
			}
			if (arg1.startsWith("fps ") && Static260.anInt5453 != 0) {
				Static215.method4074(Static16.method250(arg1.substring(4)));
				return;
			}
			if (Static176.anInt3971 != 30) {
				Static35.method5764("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1376) Exception local1376) {
			Static35.method5764("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZIZ)V")
	public static void method2576(@OriginalArg(3) boolean arg0) {
		Static308.anInt6110 = 2;
		Static226.aBoolean429 = arg0;
		Static36.anInt551 = 22050;
	}
}
