import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "Lclient!hj;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_62 = new Class77(39, 4);

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public static int anInt6572 = 0;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[6][];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!be;)V")
	public static void method5494(@OriginalArg(1) Class30_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static409.anInt7683 == arg0.anInt4148 || arg0.anInt4138 == -1 || arg0.anInt4178 != 0) {
			local5 = true;
		} else {
			@Pc(22) Class64 local22 = Static47.aClass41_1.method911(arg0.anInt4138);
			if (local22.aBoolean139 || arg0.anInt4164 + 1 > local22.anIntArray184[arg0.anInt4142]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(53) int local53 = arg0.anInt4148 - arg0.anInt4141;
			@Pc(59) int local59 = Static409.anInt7683 - arg0.anInt4141;
			@Pc(70) int local70 = arg0.anInt4149 * 128 + arg0.method3591() * 64;
			@Pc(81) int local81 = arg0.anInt4163 * 128 + arg0.method3591() * 64;
			@Pc(92) int local92 = arg0.anInt4180 * 128 + arg0.method3591() * 64;
			@Pc(106) int local106 = arg0.anInt4162 * 128 + arg0.method3591() * 64;
			arg0.anInt9418 = (local59 * local92 + local70 * (local53 - local59)) / local53;
			arg0.anInt9416 = ((local53 - local59) * local81 + local59 * local106) / local53;
		}
		arg0.anInt4202 = 0;
		if (arg0.anInt4173 == 0) {
			arg0.method3594(false, 8192);
		}
		if (arg0.anInt4173 == 1) {
			arg0.method3594(false, 12288);
		}
		if (arg0.anInt4173 == 2) {
			arg0.method3594(false, 0);
		}
		if (arg0.anInt4173 == 3) {
			arg0.method3594(false, 4096);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method5495(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static171.aClass285_4 == Static79.aClass285_2 && Static59.anInt1442 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static191.aBoolean341 = true;
				Static479.method7197("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static191.aBoolean341 = false;
				Static479.method7197("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static479.method7197("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static118.anInt2734 = 0;
				Static380.anInt7651 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static259.aClass149_4.method3983();
				Static479.method7197("Text coords cleared");
				return;
			}
			@Pc(106) int local106;
			@Pc(126) int local126;
			@Pc(117) Runtime local117;
			if (arg1.equalsIgnoreCase("gc")) {
				Static350.method5483();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local117 = Runtime.getRuntime();
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static479.method7197("mem=" + local126 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static350.method5483();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local117 = Runtime.getRuntime();
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static479.method7197("Memory before cleanup=" + local126 + "k");
				Static143.method2852();
				Static350.method5483();
				for (@Pc(185) int local185 = 0; local185 < 10; local185++) {
					System.gc();
				}
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static479.method7197("Memory after cleanup=" + local126 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static479.method7197(Static249.method4283() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static479.method7197("Number of player models in cache:" + Static547.method8023());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static479.method7197("Dropped client connection");
				if (Static96.anInt2243 == 9) {
					Static83.method1857();
					return;
				}
				if (Static96.anInt2243 == 10) {
					Static491.aBoolean628 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static234.aClass86_2.method2309();
				Static479.method7197("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static234.aClass86_2.method2314();
				Static479.method7197("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static375.aClass71_3.method1985();
				Static491.aClass277_2.method7167();
				Static234.aClass86_2.method2318();
				Static479.method7197("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static345.method5434();
				Static38.method804();
				Static479.method7197("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static428.method6573(1, false, -1, -1);
				if (Static256.method4386() != 1) {
					Static479.method7197("wm1 failed");
					return;
				}
				Static479.method7197("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static428.method6573(2, false, -1, -1);
				if (Static256.method4386() == 2) {
					Static479.method7197("wm2 succeeded");
					return;
				}
				Static479.method7197("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static428.method6573(3, false, 768, 1024);
				if (Static256.method4386() == 3) {
					Static479.method7197("wm3 succeeded");
					return;
				}
				Static479.method7197("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static201.method3814(0);
				if (Static148.anInt6867 != 0) {
					Static479.method7197("Failed to enter tk0");
					return;
				}
				Static479.method7197("Entered tk0");
				Static208.aClass12_Sub10_Sub1_1.anInt2230 = 0;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static201.method3814(1);
				if (Static148.anInt6867 != 1) {
					Static479.method7197("Failed to enter tk1");
					return;
				}
				Static479.method7197("Entered tk1");
				Static208.aClass12_Sub10_Sub1_1.anInt2230 = 1;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static201.method3814(2);
				if (Static148.anInt6867 == 2) {
					Static479.method7197("Entered tk2");
					Static208.aClass12_Sub10_Sub1_1.anInt2230 = 2;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				Static479.method7197("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static201.method3814(3);
				if (Static148.anInt6867 != 3) {
					Static479.method7197("Failed to enter tk3");
					return;
				}
				Static479.method7197("Entered tk3");
				Static208.aClass12_Sub10_Sub1_1.anInt2230 = 3;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static201.method3814(4);
				if (Static148.anInt6867 == 4) {
					Static479.method7197("Entered tk4");
					Static208.aClass12_Sub10_Sub1_1.anInt2230 = 4;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				Static479.method7197("Failed to enter tk4");
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static201.method3814(5);
				if (Static148.anInt6867 == 5) {
					Static479.method7197("Entered tk5");
					Static208.aClass12_Sub10_Sub1_1.anInt2230 = 5;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				Static479.method7197("Failed to enter tk5");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static208.aClass12_Sub10_Sub1_1.aBoolean188 = !Static208.aClass12_Sub10_Sub1_1.aBoolean188;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				Static345.method5434();
				Static479.method7197("ot=" + Static208.aClass12_Sub10_Sub1_1.aBoolean188);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static208.aClass12_Sub10_Sub1_1.aBoolean186 = !Static208.aClass12_Sub10_Sub1_1.aBoolean186;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				Static345.method5434();
				Static479.method7197("gb=" + Static208.aClass12_Sub10_Sub1_1.aBoolean186);
				return;
			}
			@Pc(665) int local665;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static479.method7197("Invalid shadows value");
					return;
				}
				@Pc(655) String local655 = arg1.substring(8);
				local665 = Static261.method4417(local655) ? Static467.method7015(local655) : -1;
				if (local665 >= 0 && local665 <= 2) {
					Static208.aClass12_Sub10_Sub1_1.method2042(Static148.anInt6867, local665);
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					Static345.method5434();
					Static479.method7197("shadows=" + local665);
					return;
				}
				Static479.method7197("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static208.aClass12_Sub10_Sub1_1.aBoolean180 = !Static208.aClass12_Sub10_Sub1_1.aBoolean180;
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				Static261.method4418();
				Static345.method5434();
				Static479.method7197("textures=" + Static208.aClass12_Sub10_Sub1_1.aBoolean180);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static208.aClass12_Sub10_Sub1_1.method2044(!Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867), Static148.anInt6867);
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				Static299.method4822();
				Static261.method4418();
				Static345.method5434();
				Static479.method7197("lighting=" + Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static479.method7197("Invalid buildarea value");
					return;
				}
				local106 = Static467.method7015(arg1.substring(6));
				if (local106 >= 0 && local106 <= Static305.method4965(Static458.anInt8335)) {
					Static208.aClass12_Sub10_Sub1_1.anInt2235 = local106;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					Static479.method7197("maxbuildarea=" + Static208.aClass12_Sub10_Sub1_1.anInt2235);
					return;
				}
				Static479.method7197("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static479.method7197("Invalid particles value");
					return;
				}
				Static378.method6005(Static467.method7015(arg1.substring(13)));
				Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
				Static14.aBoolean9 = false;
				Static479.method7197("particles=" + Static395.method6206());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static479.method7197("Invalid rect_debug value");
					return;
				}
				Static98.anInt2275 = Static467.method7015(arg1.substring(10).trim());
				Static479.method7197("rect_debug=" + Static98.anInt2275);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static470.aBoolean610 = true;
				Static479.method7197("qa_op_test=" + Static470.aBoolean610);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static215.aBoolean371 = !Static215.aBoolean371;
				Static479.method7197("clipcomponents=" + Static215.aBoolean371);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(947) boolean local947 = Static243.aClass42_4.method5836();
				if (!Static218.method4005(!local947)) {
					Static479.method7197("Failed to enable bloom");
					return;
				}
				if (!local947) {
					Static479.method7197("Bloom enabled");
					return;
				}
				Static479.method7197("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static358.aBoolean490) {
					Static358.aBoolean490 = true;
					Static479.method7197("Forced tweening ENABLED!");
					return;
				}
				Static358.aBoolean490 = false;
				Static479.method7197("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static435.aBoolean553) {
					Static479.method7197("Shift-click disabled.");
					Static435.aBoolean553 = false;
					return;
				}
				Static479.method7197("Shift-click ENABLED!");
				Static435.aBoolean553 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static479.method7197("x:" + (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7) + " z:" + (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static479.method7197("Height: " + Static51.aClass215Array6[Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99].ba(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static440.aClass16_103.method417();
				Static440.aClass16_103.method385();
				Static149.aClass292_2.method7214();
				Static293.aClass93_8.method2481();
				Static38.method804();
				Static479.method7197("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static243.aClass42_4.method5808()) {
					local106 = Integer.parseInt(arg1.substring(3));
					if (local106 < 1) {
						local106 = 1;
					} else if (local106 > 4) {
						local106 = 4;
					}
					Static67.anInt1607 = local106;
					Static243.aClass42_4.method5797(Static67.anInt1607);
					Static243.aClass42_4.method5804(0);
					Static479.method7197("Render cores now: " + Static67.anInt1607);
					return;
				}
				Static479.method7197("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static479.method7197("I(s): " + Static203.aClass125_24.method3436() + "/" + Static203.aClass125_24.method3435());
				Static479.method7197("I(m): " + Static432.aClass125_59.method3436() + "/" + Static432.aClass125_59.method3435());
				Static479.method7197("O(s): " + Static150.aClass254_2.aClass170_1.method4282() + "/" + Static150.aClass254_2.aClass170_1.method4296());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static479.method7197("Pos: " + Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 + "," + (Static61.anInt1459 + (Static368.anInt6832 >> 7) >> 6) + "," + (Static203.anInt4534 + (Static6.anInt93 >> 7) >> 6) + "," + (Static61.anInt1459 + (Static368.anInt6832 >> 7) & 0x3F) + "," + (Static203.anInt4534 + (Static6.anInt93 >> 7) & 0x3F) + " Height: " + (Static443.method6717(Static368.anInt6832, Static6.anInt93, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) - Static62.anInt1472));
				Static479.method7197("Look: " + Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 + "," + (Static61.anInt1459 + Static405.anInt7612 >> 6) + "," + (Static241.anInt9538 + Static203.anInt4534 >> 6) + "," + (Static61.anInt1459 + Static405.anInt7612 & 0x3F) + "," + (Static241.anInt9538 + Static203.anInt4534 & 0x3F) + " Height: " + (Static443.method6717(Static405.anInt7612, Static241.anInt9538, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) - Static540.anInt9594));
				return;
			}
			if (arg1.equals("showocc")) {
				Static103.aBoolean198 = !Static103.aBoolean198;
				Static345.method5434();
				Static479.method7197("showocc=" + Static103.aBoolean198);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static197.aBoolean347 = !Static197.aBoolean347;
				Static345.method5434();
				Static479.method7197("forcewallocc=" + Static197.aBoolean347);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static193.aBoolean344 = !Static193.aBoolean344;
				Static243.aClass42_4.method5806(Static193.aBoolean344);
				Static133.method2767();
				Static479.method7197("showprofiling=" + Static193.aBoolean344);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local106 = -1;
				local665 = 1000;
				if (arg1.length() > 15) {
					@Pc(1411) String[] local1411 = Static434.method6610(arg1, ' ');
					try {
						if (local1411.length > 1) {
							local665 = Integer.parseInt(local1411[1]);
						}
					} catch (@Pc(1422) Throwable local1422) {
					}
					try {
						if (local1411.length > 2) {
							local106 = Integer.parseInt(local1411[2]);
						}
					} catch (@Pc(1433) Throwable local1433) {
					}
				}
				if (local106 == -1) {
					Static479.method7197("Java toolkit: " + Static292.method4741(0, local665));
					Static479.method7197("SSE toolkit:  " + Static292.method4741(2, local665));
					Static479.method7197("D3D toolkit:  " + Static292.method4741(3, local665));
					Static479.method7197("GL toolkit:   " + Static292.method4741(1, local665));
					return;
				}
				Static479.method7197("Performance: " + Static292.method4741(Static148.anInt6867, local665));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1509) Class179 local1509 = Static243.aClass42_4.method5828();
				Static479.method7197("Vendor: " + local1509.anInt5392);
				Static479.method7197("Name: " + local1509.aString58);
				Static479.method7197("Version: " + local1509.anInt5390);
				Static479.method7197("Device: " + local1509.aString57);
				Static479.method7197("Driver Version: " + local1509.aLong148);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static402.aBoolean542 = !Static402.aBoolean542;
				Static479.method7197("nonpcs=" + Static402.aBoolean542);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static343.method2524();
				Static479.method7197("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local106 = Integer.parseInt(arg1.substring(12));
				Static389.method6144(local106, Static212.method4973(local106).aString52);
				Static479.method7197("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static479.method7197("w: " + Static222.aClass247_1.anInt7426);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static332.method5312(Static523.aClass77_91);
				Static383.aClass12_Sub8_Sub2_1.method5214(0);
				local106 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
				local665 = arg1.indexOf(" ", 4);
				Static383.aClass12_Sub8_Sub2_1.method5180(arg1.substring(3, local665));
				Static306.method4983(arg1.substring(local665), Static383.aClass12_Sub8_Sub2_1);
				Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local106);
				return;
			}
			if (arg1.equals("heap")) {
				Static479.method7197("Heap: " + Static458.anInt8335 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static180.method3559();
				Static479.method7197("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static479.anIntArray646.length; local106++) {
					if (Static425.aBooleanArray44[local106]) {
						Static479.anIntArray646[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static479.anIntArray646[local106] *= -1;
						}
					}
				}
				Static180.method3559();
				Static479.method7197("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static385.aBoolean619 = true;
				Static38.method804();
				Static479.method7197("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static385.aBoolean619 = false;
				Static38.method804();
				Static479.method7197("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static514.method1479();
				Static479.method7197("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static479.method7197(Static187.method3648() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg1.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static208.aClass12_Sub10_Sub1_1.anInt2233 = local106;
				}
				Static479.method7197("cpuusage=" + Static208.aClass12_Sub10_Sub1_1.anInt2233);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg1.substring(17));
				Static479.method7197("varpbit=" + Static393.aClass31_1.method788(local106));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg1.substring(14));
				Static479.method7197("varp=" + Static393.aClass31_1.method787(local106));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static259.method4399(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static259.method4399(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1899) String[] local1899 = Static434.method6610(arg1.substring(12), ' ');
				if (local1899.length >= 2) {
					local665 = local1899.length <= 2 ? 0 : Integer.parseInt(local1899[2]);
					Static71.method1597(local665, local1899[0], local1899[1]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static312.method5026();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static312.method5024();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static312.method5024();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local106 = Integer.parseInt(arg1.substring(8));
				Static243.aClass42_4.method5815(local106);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static479.method7197("Active streams: " + Static328.aClass12_Sub13_Sub1_1.method2447());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static208.aClass12_Sub10_Sub1_1.method2058();
				Static479.method7197("Complete. Toolkit now: " + Static148.anInt6867);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static479.method7197(Static314.aClient1.method1510());
				return;
			}
			if (Static96.anInt2243 == 9) {
				Static332.method5312(Static390.aClass77_68);
				Static383.aClass12_Sub8_Sub2_1.method5214(arg1.length() + 3);
				Static383.aClass12_Sub8_Sub2_1.method5214(arg2 ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5214(arg0 ? 1 : 0);
				Static383.aClass12_Sub8_Sub2_1.method5180(arg1);
			}
			if (arg1.startsWith("fps ") && Static171.aClass285_4 != Static79.aClass285_2) {
				Static47.method888(Static467.method7015(arg1.substring(4)));
				return;
			}
			if (Static96.anInt2243 != 9) {
				Static479.method7197("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(2074) Exception local2074) {
			Static479.method7197("Whoops, something went wrong.");
		}
	}
}
