import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array5;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_10 = new Class154(48, -1);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lclient!wda;")
	public static final Interface24[] anInterface24Array1 = new Interface24[75];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)I")
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = Integer.MAX_VALUE & (local15 * local15 * 15731 + 789221) * local15 + 1376312589;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
	public static void method1101(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			label692: {
				if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
					if (!arg2.equalsIgnoreCase("cls")) {
						if (arg2.equalsIgnoreCase("displayfps")) {
							Static222.aBoolean232 = !Static222.aBoolean232;
							if (!Static222.aBoolean232) {
								Static144.method1990("FPS off");
								return;
							}
							Static144.method1990("FPS on");
							return;
						}
						if (arg2.equals("renderer")) {
							@Pc(70) Class267 local70 = Static417.aClass162_17.method6863();
							Static144.method1990("Vendor: " + local70.anInt6682);
							Static144.method1990("Name: " + local70.aString97);
							Static144.method1990("Version: " + local70.anInt6679);
							Static144.method1990("Device: " + local70.aString98);
							Static144.method1990("Driver Version: " + local70.aLong186);
							return;
						}
						if (arg2.equals("heap")) {
							Static144.method1990("Heap: " + Static326.anInt7462 + "MB");
							return;
						}
						break label692;
					}
					Static533.anInt8769 = 0;
					Static77.anInt1385 = 0;
					return;
				}
				Static144.method1990("commands - This command");
				Static144.method1990("cls - Clear console");
				Static144.method1990("displayfps - Toggle FPS and other information");
				Static144.method1990("renderer - Print graphics renderer information");
				Static144.method1990("heap - Print java memory information");
				return;
			}
		} catch (@Pc(138) Exception local138) {
			Static144.method1990(Static229.aClass159_4.method2776(Static261.anInt4297));
			return;
		}
		if (Static416.aClass232_7 != Static340.aClass232_14 || Static11.anInt294 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static144.method1990("FPS: " + Static112.anInt1993);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static431.aBoolean567 = !Static431.aBoolean567;
					if (!Static431.aBoolean567) {
						Static144.method1990("Occlsion now off!");
						return;
					}
					Static144.method1990("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static222.aBoolean232 = true;
					Static144.method1990("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static222.aBoolean232 = false;
					Static144.method1990("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static144.method1990("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(249) Throwable local249) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static71.aClass220_8.method4657();
					Static144.method1990("Text coords cleared");
					return;
				}
				@Pc(290) int local290;
				@Pc(269) int local269;
				@Pc(280) Runtime local280;
				if (arg2.equalsIgnoreCase("gc")) {
					Static567.method5987();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static144.method1990("mem=" + local290 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static567.method5987();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static144.method1990("Memory before cleanup=" + local290 + "k");
					Static426.method5673();
					Static567.method5987();
					for (@Pc(348) int local348 = 0; local348 < 10; local348++) {
						System.gc();
					}
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static144.method1990("Memory after cleanup=" + local290 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static144.method1990(Static45.method802() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static144.method1990("Dropped client connection");
					if (Static540.anInt8912 == 10) {
						Static454.method5907();
						return;
					}
					if (Static540.anInt8912 == 11) {
						Static559.aBoolean766 = true;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static489.aClass292_5.method5908();
					Static144.method1990("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static335.aClass249_2.method5221();
					Static144.method1990("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static335.aClass249_2.method5216();
					Static144.method1990("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static169.aClass99_2.method1790();
					Static529.aClass124_2.method2255();
					Static335.aClass249_2.method5229();
					Static144.method1990("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static378.method5265();
					Static429.method5683();
					Static144.method1990("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static143.aLong204 = Static362.method5133();
					Static593.aBoolean805 = true;
					Static378.method5265();
					Static429.method5683();
					Static144.method1990("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static51.method873(-1, false, -1, 1);
					if (Static480.method6206() == 1) {
						Static144.method1990("wm1 succeeded");
						return;
					}
					Static144.method1990("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static51.method873(-1, false, -1, 2);
					if (Static480.method6206() == 2) {
						Static144.method1990("wm2 succeeded");
						return;
					}
					Static144.method1990("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static51.method873(768, false, 1024, 3);
					if (Static480.method6206() != 3) {
						Static144.method1990("wm3 failed");
						return;
					}
					Static144.method1990("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static368.method6714(0);
					if (Static226.anInt3318 != 0) {
						Static144.method1990("Failed to enter tk0");
						return;
					}
					Static144.method1990("Entered tk0");
					Static257.aClass2_Sub35_Sub1_1.anInt7497 = 0;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static368.method6714(1);
					if (Static226.anInt3318 == 1) {
						Static144.method1990("Entered tk1");
						Static257.aClass2_Sub35_Sub1_1.anInt7497 = 1;
						Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
						Static237.aBoolean297 = false;
						return;
					}
					Static144.method1990("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static368.method6714(2);
					if (Static226.anInt3318 != 2) {
						Static144.method1990("Failed to enter tk2");
						return;
					}
					Static144.method1990("Entered tk2");
					Static257.aClass2_Sub35_Sub1_1.anInt7497 = 2;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static368.method6714(3);
					if (Static226.anInt3318 != 3) {
						Static144.method1990("Failed to enter tk3");
						return;
					}
					Static144.method1990("Entered tk3");
					Static257.aClass2_Sub35_Sub1_1.anInt7497 = 3;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static368.method6714(5);
					if (Static226.anInt3318 != 5) {
						Static144.method1990("Failed to enter tk5");
						return;
					}
					Static144.method1990("Entered tk5");
					Static257.aClass2_Sub35_Sub1_1.anInt7497 = 5;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("ot")) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean637 = !Static257.aClass2_Sub35_Sub1_1.aBoolean637;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					Static378.method5265();
					Static144.method1990("ot=" + Static257.aClass2_Sub35_Sub1_1.aBoolean637);
					return;
				}
				if (arg2.equalsIgnoreCase("gb")) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean629 = !Static257.aClass2_Sub35_Sub1_1.aBoolean629;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					Static378.method5265();
					Static144.method1990("gb=" + Static257.aClass2_Sub35_Sub1_1.aBoolean629);
					return;
				}
				@Pc(785) int local785;
				if (arg2.startsWith("shadows")) {
					if (arg2.length() < 8) {
						Static144.method1990("Invalid shadows value");
						return;
					}
					@Pc(775) String local775 = arg2.substring(8);
					local785 = Static531.method6990(local775) ? Static559.method7310(local775) : -1;
					if (local785 >= 0 && local785 <= 2) {
						Static257.aClass2_Sub35_Sub1_1.method6033(Static226.anInt3318, local785);
						Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
						Static237.aBoolean297 = false;
						Static378.method5265();
						Static144.method1990("shadows=" + local785);
						return;
					}
					Static144.method1990("Invalid shadows value");
					return;
				}
				if (arg2.startsWith("textures")) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean624 = !Static257.aClass2_Sub35_Sub1_1.aBoolean624;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					Static514.method6643();
					Static378.method5265();
					Static144.method1990("textures=" + Static257.aClass2_Sub35_Sub1_1.aBoolean624);
					return;
				}
				if (arg2.startsWith("lighting")) {
					Static257.aClass2_Sub35_Sub1_1.method6034(!Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318), Static226.anInt3318);
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					Static113.method1669();
					Static514.method6643();
					Static378.method5265();
					Static144.method1990("lighting=" + Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318));
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static144.method1990("Invalid buildarea value");
						return;
					}
					local269 = Static559.method7310(arg2.substring(6));
					if (local269 >= 0 && Static253.method3610(Static326.anInt7462) >= local269) {
						Static257.aClass2_Sub35_Sub1_1.anInt7496 = local269;
						Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
						Static237.aBoolean297 = false;
						Static144.method1990("maxbuildarea=" + Static257.aClass2_Sub35_Sub1_1.anInt7496);
						return;
					}
					Static144.method1990("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static144.method1990("Invalid rect_debug value");
						return;
					}
					Static527.anInt8456 = Static559.method7310(arg2.substring(10).trim());
					Static144.method1990("rect_debug=" + Static527.anInt8456);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static440.aBoolean582 = true;
					Static144.method1990("qa_op_test=" + Static440.aBoolean582);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static470.aBoolean648 = !Static470.aBoolean648;
					Static144.method1990("clipcomponents=" + Static470.aBoolean648);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1020) boolean local1020 = Static417.aClass162_17.method6880();
					if (!Static183.method2351(!local1020)) {
						Static144.method1990("Failed to enable bloom");
						return;
					}
					if (!local1020) {
						Static144.method1990("Bloom enabled");
						return;
					}
					Static144.method1990("Bloom disabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static269.aBoolean328) {
						Static269.aBoolean328 = false;
						Static144.method1990("Forced tweening disabled.");
						return;
					}
					Static269.aBoolean328 = true;
					Static144.method1990("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static418.aBoolean542) {
						Static144.method1990("Shift-click disabled.");
						Static418.aBoolean542 = false;
						return;
					}
					Static144.method1990("Shift-click ENABLED!");
					Static418.aBoolean542 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static144.method1990("x:" + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9) + " z:" + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static144.method1990("Height: " + Static114.aClass151Array1[Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128].method7676(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static241.aClass229_54.method4961();
					Static241.aClass229_54.method4965();
					Static369.aClass212_6.method4409();
					Static8.aClass360_1.method7574();
					Static429.method5683();
					Static144.method1990("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static417.aClass162_17.method6841()) {
						local269 = Integer.parseInt(arg2.substring(3));
						if (local269 < 1) {
							local269 = 1;
						} else if (local269 > 4) {
							local269 = 4;
						}
						Static340.anInt5888 = local269;
						Static378.method5265();
						Static144.method1990("Render cores now: " + Static340.anInt5888);
						return;
					}
					Static144.method1990("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static144.method1990("I(s): " + Static220.aClass21_37.method318() + "/" + Static220.aClass21_37.method322());
					Static144.method1990("I(m): " + Static504.aClass21_79.method318() + "/" + Static504.aClass21_79.method322());
					Static144.method1990("O(s): " + Static466.aClass130_2.aClass312_1.method6263() + "/" + Static466.aClass130_2.aClass312_1.method6271());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static144.method1990("Pos: " + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 + "," + ((Static285.anInt2206 >> 9) + Static485.anInt7725 >> 6) + "," + (Static310.anInt5129 + (Static469.anInt7519 >> 9) >> 6) + "," + (Static485.anInt7725 + (Static285.anInt2206 >> 9) & 0x3F) + "," + ((Static469.anInt7519 >> 9) + Static310.anInt5129 & 0x3F) + " Height: " + (Static24.method347(Static469.anInt7519, Static285.anInt2206, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) - Static151.anInt2436));
					Static144.method1990("Look: " + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128 + "," + (Static353.anInt6039 + Static485.anInt7725 >> 6) + "," + (Static18.anInt4107 + Static310.anInt5129 >> 6) + "," + (Static485.anInt7725 + Static353.anInt6039 & 0x3F) + "," + (Static310.anInt5129 + Static18.anInt4107 & 0x3F) + " Height: " + (Static24.method347(Static18.anInt4107, Static353.anInt6039, Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128) - Static212.anInt3068));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static249.aBoolean308 = !Static249.aBoolean308;
					Static417.aClass162_17.method6887(Static249.aBoolean308);
					Static82.method1250();
					Static144.method1990("showprofiling=" + Static249.aBoolean308);
					return;
				}
				@Pc(1422) String[] local1422;
				if (arg2.startsWith("performancetest")) {
					local269 = -1;
					local785 = 1000;
					if (arg2.length() > 15) {
						local1422 = Static439.method5762(arg2, ' ');
						try {
							if (local1422.length > 1) {
								local785 = Integer.parseInt(local1422[1]);
							}
						} catch (@Pc(1433) Throwable local1433) {
						}
						try {
							if (local1422.length > 2) {
								local269 = Integer.parseInt(local1422[2]);
							}
						} catch (@Pc(1444) Throwable local1444) {
						}
					}
					if (local269 != -1) {
						Static144.method1990("Performance: " + Static223.method2719(local785, Static226.anInt3318));
						return;
					}
					Static144.method1990("Java toolkit: " + Static223.method2719(local785, 0));
					Static144.method1990("SSE toolkit:  " + Static223.method2719(local785, 2));
					Static144.method1990("D3D toolkit:  " + Static223.method2719(local785, 3));
					Static144.method1990("GL toolkit:   " + Static223.method2719(local785, 1));
					Static144.method1990("GLX toolkit:  " + Static223.method2719(local785, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static481.aBoolean654 = !Static481.aBoolean654;
					Static144.method1990("nonpcs=" + Static481.aBoolean654);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static348.method5031();
					Static144.method1990("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local269 = Integer.parseInt(arg2.substring(12));
					Static80.method1230(Static51.method871(local269).aString24, local269);
					Static144.method1990("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static144.method1990("w: " + Static489.aClass292_5.anInt7261);
					return;
				}
				@Pc(1598) Class2_Sub34 local1598;
				if (arg2.startsWith("pc")) {
					local1598 = Static555.method7264(Static40.aClass154_6, Static551.aClass64_2);
					local1598.aClass2_Sub7_Sub2_2.method4459(0);
					local785 = local1598.aClass2_Sub7_Sub2_2.anInt5186;
					local290 = arg2.indexOf(" ", 4);
					local1598.aClass2_Sub7_Sub2_2.method4481(arg2.substring(3, local290));
					Static138.method1906(arg2.substring(local290), local1598.aClass2_Sub7_Sub2_2);
					local1598.aClass2_Sub7_Sub2_2.method4491(local1598.aClass2_Sub7_Sub2_2.anInt5186 - local785);
					Static100.method1508(local1598);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static25.method354();
					Static144.method1990("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local269 = 0; local269 < Static297.anIntArray342.length; local269++) {
						if (Static143.aBooleanArray26[local269]) {
							Static297.anIntArray342[local269] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static297.anIntArray342[local269] *= -1;
							}
						}
					}
					Static25.method354();
					Static144.method1990("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static458.aBoolean617 = true;
					Static429.method5683();
					Static144.method1990("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static458.aBoolean617 = false;
					Static429.method5683();
					Static144.method1990("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static507.method6604();
					Static144.method1990("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static144.method1990(Static410.method5541() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local269 = Integer.parseInt(arg2.substring(17));
					Static144.method1990("varpbit=" + Static426.aClass160_1.method2781(local269));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local269 = Integer.parseInt(arg2.substring(14));
					Static144.method1990("varp=" + Static426.aClass160_1.method2780(local269));
					return;
				}
				if (arg2.startsWith("demologin")) {
					Static204.method2537(0, false);
					return;
				}
				if (arg2.startsWith("newdemologin")) {
					Static204.method2537(0, true);
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1820) String[] local1820 = Static439.method5762(arg2.substring(12), ' ');
					if (local1820.length >= 2) {
						local785 = local1820.length > 2 ? Integer.parseInt(local1820[2]) : 0;
						Static270.method3744(local1820[1], local1820[0], local785);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static566.method7392();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static566.method7393();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static566.method7393();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local269 = Integer.parseInt(arg2.substring(8));
					Static417.aClass162_17.method6870(local269);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static144.method1990("Active streams: " + Static246.aClass2_Sub3_Sub4_2.method6711());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static257.aClass2_Sub35_Sub1_1.method6048();
					Static144.method1990("Complete. Toolkit now: " + Static226.anInt3318);
					return;
				}
				if (arg2.equals("errormessage")) {
					Static144.method1990(Static474.aClient1.method1140());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static132.aString29.startsWith("win")) {
						Static475.method4438(new File("C:\\Temp\\heap.dump"));
					} else {
						Static475.method4438(new File("/tmp/heap.dump"));
					}
					Static144.method1990("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static144.method1990("Name: " + Static132.aString29);
					Static144.method1990("Arch: " + Static132.aString25);
					Static144.method1990("Ver: " + Static132.aString30);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local269 = Integer.parseInt(arg2.substring(8, 9));
					Static295.anInt4973 = local269;
					Static378.method5265();
					Static144.method1990("Toggled!");
					return;
				}
				@Pc(2012) File local2012;
				if (arg2.startsWith("setoutput ")) {
					local2012 = new File(arg2.substring(10));
					if (local2012.exists()) {
						local2012 = new File(arg2.substring(10) + "." + Static362.method5133() + ".log");
						if (local2012.exists()) {
							Static144.method1990("file already exists!");
							return;
						}
					}
					if (Static144.aFileOutputStream1 != null) {
						Static144.aFileOutputStream1.close();
						Static144.aFileOutputStream1 = null;
					}
					try {
						Static144.aFileOutputStream1 = new FileOutputStream(local2012);
						return;
					} catch (@Pc(2054) FileNotFoundException local2054) {
						Static144.method1990("Could not create " + local2012.getName());
						return;
					} catch (@Pc(2066) SecurityException local2066) {
						Static144.method1990("Cannot write to " + local2012.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static144.aFileOutputStream1 != null) {
						Static144.aFileOutputStream1.close();
					}
					Static144.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2012 = new File(arg2.substring(10));
					if (!local2012.exists()) {
						Static144.method1990("No such file");
						return;
					}
					@Pc(2110) byte[] local2110 = Static474.method6142(local2012);
					if (local2110 == null) {
						Static144.method1990("Failed to read file");
						return;
					}
					local1422 = Static439.method5762(Static408.method2561(Static206.method2566(local2110), ""), '\n');
					Static443.method5796(local1422);
					return;
				}
				if (Static540.anInt8912 == 10) {
					local1598 = Static555.method7264(Static417.aClass154_126, Static551.aClass64_2);
					local1598.aClass2_Sub7_Sub2_2.method4459(arg2.length() + 3);
					local1598.aClass2_Sub7_Sub2_2.method4459(arg0 ? 1 : 0);
					local1598.aClass2_Sub7_Sub2_2.method4459(arg1 ? 1 : 0);
					local1598.aClass2_Sub7_Sub2_2.method4481(arg2);
					Static100.method1508(local1598);
				}
				if (arg2.startsWith("fps ") && Static340.aClass232_14 != Static416.aClass232_7) {
					Static475.method4441(Static559.method7310(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2195) Exception local2195) {
				Static144.method1990(Static229.aClass159_4.method2776(Static261.anInt4297));
				return;
			}
		}
		if (Static540.anInt8912 != 10) {
			Static144.method1990(Static229.aClass159_5.method2776(Static261.anInt4297) + arg2);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method1103(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 2);
		local8.method6229();
	}
}
