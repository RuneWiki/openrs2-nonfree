import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
	public static int anInt8689;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "Lclient!wea;")
	public static Class357 aClass357_1;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_57 = new Class222(8);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILjava/lang/String;Z)V")
	public static void method7118(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static165.method2388("commands - This command");
				Static165.method2388("cls - Clear console");
				Static165.method2388("displayfps - Toggle FPS and other information");
				Static165.method2388("renderer - Print graphics renderer information");
				Static165.method2388("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static32.anInt511 = 0;
				Static156.anInt2829 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static57.aBoolean487 = !Static57.aBoolean487;
				if (!Static57.aBoolean487) {
					Static165.method2388("FPS off");
					return;
				}
				Static165.method2388("FPS on");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(65) Class162 local65 = Static16.aClass134_1.method6962();
				Static165.method2388("Vendor: " + local65.anInt4278);
				Static165.method2388("Name: " + local65.aString38);
				Static165.method2388("Version: " + local65.anInt4277);
				Static165.method2388("Device: " + local65.aString39);
				Static165.method2388("Driver Version: " + local65.aLong120);
				return;
			}
			if (arg1.equals("heap")) {
				Static165.method2388("Heap: " + Static117.anInt2297 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static165.method2388(Static568.aClass351_6.method7651(Static307.anInt5279));
			return;
		}
		if (Static357.aClass308_6 != Static199.aClass308_3 || Static267.anInt4711 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static165.method2388("FPS: " + Static163.anInt2947);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static419.aBoolean572 = !Static419.aBoolean572;
					if (!Static419.aBoolean572) {
						Static165.method2388("Occlsion now off!");
						return;
					}
					Static165.method2388("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static57.aBoolean487 = true;
					Static165.method2388("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static57.aBoolean487 = false;
					Static165.method2388("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static165.method2388("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(246) Throwable local246) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static500.aClass209_10.method4186();
					Static165.method2388("Text coords cleared");
					return;
				}
				@Pc(284) int local284;
				@Pc(266) int local266;
				@Pc(275) Runtime local275;
				if (arg1.equalsIgnoreCase("gc")) {
					Static156.method2271();
					for (local266 = 0; local266 < 10; local266++) {
						System.gc();
					}
					local275 = Runtime.getRuntime();
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static165.method2388("mem=" + local284 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static156.method2271();
					for (local266 = 0; local266 < 10; local266++) {
						System.gc();
					}
					local275 = Runtime.getRuntime();
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static165.method2388("Memory before cleanup=" + local284 + "k");
					Static580.method7776();
					Static156.method2271();
					for (@Pc(342) int local342 = 0; local342 < 10; local342++) {
						System.gc();
					}
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static165.method2388("Memory after cleanup=" + local284 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static165.method2388(Static32.method429() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static165.method2388("Dropped client connection");
					if (Static216.anInt4135 == 10) {
						Static590.method7839();
					} else if (Static216.anInt4135 == 11) {
						Static90.aBoolean154 = true;
						return;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static382.aClass227_2.method4534();
					Static165.method2388("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static396.aClass9_1.method131();
					Static165.method2388("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static396.aClass9_1.method137();
					Static165.method2388("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static362.aClass109_5.method2186();
					Static568.aClass149_2.method3279();
					Static396.aClass9_1.method134();
					Static165.method2388("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static334.method4655();
					Static376.method5050();
					Static165.method2388("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static1.aLong4 = Static413.method5668();
					Static3.aBoolean4 = true;
					Static334.method4655();
					Static376.method5050();
					Static165.method2388("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static198.method2994(1, -1, false, -1);
					if (Static195.method2980() != 1) {
						Static165.method2388("wm1 failed");
						return;
					}
					Static165.method2388("wm1 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static198.method2994(2, -1, false, -1);
					if (Static195.method2980() != 2) {
						Static165.method2388("wm2 failed");
						return;
					}
					Static165.method2388("wm2 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static198.method2994(3, 1024, false, 768);
					if (Static195.method2980() != 3) {
						Static165.method2388("wm3 failed");
						return;
					}
					Static165.method2388("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static523.method7235(0);
					if (Static113.anInt2222 != 0) {
						Static165.method2388("Failed to enter tk0");
						return;
					}
					Static165.method2388("Entered tk0");
					Static348.aClass1_Sub30_Sub1_1.anInt4881 = 0;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static523.method7235(1);
					if (Static113.anInt2222 == 1) {
						Static165.method2388("Entered tk1");
						Static348.aClass1_Sub30_Sub1_1.anInt4881 = 1;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
						return;
					}
					Static165.method2388("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static523.method7235(2);
					if (Static113.anInt2222 == 2) {
						Static165.method2388("Entered tk2");
						Static348.aClass1_Sub30_Sub1_1.anInt4881 = 2;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
						return;
					}
					Static165.method2388("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static523.method7235(3);
					if (Static113.anInt2222 != 3) {
						Static165.method2388("Failed to enter tk3");
						return;
					}
					Static165.method2388("Entered tk3");
					Static348.aClass1_Sub30_Sub1_1.anInt4881 = 3;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static523.method7235(5);
					if (Static113.anInt2222 == 5) {
						Static165.method2388("Entered tk5");
						Static348.aClass1_Sub30_Sub1_1.anInt4881 = 5;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
						return;
					}
					Static165.method2388("Failed to enter tk5");
					return;
				}
				if (arg1.equalsIgnoreCase("ot")) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean384 = !Static348.aClass1_Sub30_Sub1_1.aBoolean384;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					Static334.method4655();
					Static165.method2388("ot=" + Static348.aClass1_Sub30_Sub1_1.aBoolean384);
					return;
				}
				if (arg1.equalsIgnoreCase("gb")) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean381 = !Static348.aClass1_Sub30_Sub1_1.aBoolean381;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					Static334.method4655();
					Static165.method2388("gb=" + Static348.aClass1_Sub30_Sub1_1.aBoolean381);
					return;
				}
				@Pc(786) int local786;
				if (arg1.startsWith("shadows")) {
					if (arg1.length() < 8) {
						Static165.method2388("Invalid shadows value");
						return;
					}
					@Pc(776) String local776 = arg1.substring(8);
					local786 = Static368.method4957(local776) ? Static21.method7701(local776) : -1;
					if (local786 >= 0 && local786 <= 2) {
						Static348.aClass1_Sub30_Sub1_1.method3909(Static113.anInt2222, local786);
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
						Static334.method4655();
						Static165.method2388("shadows=" + local786);
						return;
					}
					Static165.method2388("Invalid shadows value");
					return;
				}
				if (arg1.startsWith("textures")) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean397 = !Static348.aClass1_Sub30_Sub1_1.aBoolean397;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					Static34.method7180();
					Static334.method4655();
					Static165.method2388("textures=" + Static348.aClass1_Sub30_Sub1_1.aBoolean397);
					return;
				}
				if (arg1.startsWith("lighting")) {
					Static348.aClass1_Sub30_Sub1_1.method3906(Static113.anInt2222, !Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222));
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					Static475.method6481();
					Static34.method7180();
					Static334.method4655();
					Static165.method2388("lighting=" + Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222));
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static165.method2388("Invalid buildarea value");
						return;
					}
					local266 = Static21.method7701(arg1.substring(6));
					if (local266 >= 0 && local266 <= Static497.method4932(Static117.anInt2297)) {
						Static348.aClass1_Sub30_Sub1_1.anInt4864 = local266;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
						Static165.method2388("maxbuildarea=" + Static348.aClass1_Sub30_Sub1_1.anInt4864);
						return;
					}
					Static165.method2388("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static165.method2388("Invalid rect_debug value");
						return;
					}
					Static305.anInt5270 = Static21.method7701(arg1.substring(10).trim());
					Static165.method2388("rect_debug=" + Static305.anInt5270);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static595.aBoolean755 = true;
					Static165.method2388("qa_op_test=" + Static595.aBoolean755);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static378.aBoolean493 = !Static378.aBoolean493;
					Static165.method2388("clipcomponents=" + Static378.aBoolean493);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1024) boolean local1024 = Static16.aClass134_1.method6917();
					if (Static157.method2278(!local1024)) {
						if (!local1024) {
							Static165.method2388("Bloom enabled");
							return;
						}
						Static165.method2388("Bloom disabled");
						return;
					}
					Static165.method2388("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static444.aBoolean410) {
						Static444.aBoolean410 = true;
						Static165.method2388("Forced tweening ENABLED!");
						return;
					}
					Static444.aBoolean410 = false;
					Static165.method2388("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (!Static197.aBoolean491) {
						Static165.method2388("Shift-click ENABLED!");
						Static197.aBoolean491 = true;
						return;
					}
					Static165.method2388("Shift-click disabled.");
					Static197.aBoolean491 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static165.method2388("x:" + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9) + " z:" + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static165.method2388("Height: " + Static199.aClass47Array1[Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123].method7545(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static463.aClass270_98.method5696();
					Static463.aClass270_98.method5690();
					Static521.aClass257_4.method5591();
					Static383.aClass273_3.method5841();
					Static376.method5050();
					Static165.method2388("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static16.aClass134_1.method6952()) {
						Static165.method2388("Current toolkit doesn't support multiple cores");
						return;
					}
					local266 = Integer.parseInt(arg1.substring(3));
					if (local266 < 1) {
						local266 = 1;
					} else if (local266 > 4) {
						local266 = 4;
					}
					Static537.anInt8995 = local266;
					Static334.method4655();
					Static165.method2388("Render cores now: " + Static537.anInt8995);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static165.method2388("I(s): " + Static577.aClass222_64.method4426() + "/" + Static577.aClass222_64.method4432());
					Static165.method2388("I(m): " + Static208.aClass222_25.method4426() + "/" + Static208.aClass222_25.method4432());
					Static165.method2388("O(s): " + Static175.aClass114_4.aClass250_1.method5280() + "/" + Static175.aClass114_4.aClass250_1.method5285());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static165.method2388("Pos: " + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 + "," + (Static541.anInt9058 + (Static405.anInt7085 >> 9) >> 6) + "," + ((Static59.anInt1132 >> 9) + Static116.anInt2289 >> 6) + "," + ((Static405.anInt7085 >> 9) + Static541.anInt9058 & 0x3F) + "," + (Static116.anInt2289 + (Static59.anInt1132 >> 9) & 0x3F) + " Height: " + (Static66.method1191(Static405.anInt7085, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static59.anInt1132) - Static295.anInt5077));
					Static165.method2388("Look: " + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 + "," + (Static541.anInt9058 + Static319.anInt5419 >> 6) + "," + (Static116.anInt2289 + Static273.anInt4793 >> 6) + "," + (Static319.anInt5419 + Static541.anInt9058 & 0x3F) + "," + (Static273.anInt4793 + Static116.anInt2289 & 0x3F) + " Height: " + (Static66.method1191(Static319.anInt5419, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static273.anInt4793) - Static432.anInt7579));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static236.aBoolean332 = !Static236.aBoolean332;
					Static16.aClass134_1.method6903(Static236.aBoolean332);
					Static38.method542();
					Static165.method2388("showprofiling=" + Static236.aBoolean332);
					return;
				}
				if (arg1.startsWith("performancetest")) {
					local266 = -1;
					local786 = 1000;
					if (arg1.length() > 15) {
						@Pc(1422) String[] local1422 = Static500.method7455(' ', arg1);
						try {
							if (local1422.length > 1) {
								local786 = Integer.parseInt(local1422[1]);
							}
						} catch (@Pc(1435) Throwable local1435) {
						}
						try {
							if (local1422.length > 2) {
								local266 = Integer.parseInt(local1422[2]);
							}
						} catch (@Pc(1448) Throwable local1448) {
						}
					}
					if (local266 == -1) {
						Static165.method2388("Java toolkit: " + Static286.method6607(local786, 0));
						Static165.method2388("SSE toolkit:  " + Static286.method6607(local786, 2));
						Static165.method2388("D3D toolkit:  " + Static286.method6607(local786, 3));
						Static165.method2388("GL toolkit:   " + Static286.method6607(local786, 1));
						Static165.method2388("GLX toolkit:  " + Static286.method6607(local786, 5));
						return;
					}
					Static165.method2388("Performance: " + Static286.method6607(local786, Static113.anInt2222));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static366.aBoolean479 = !Static366.aBoolean479;
					Static165.method2388("nonpcs=" + Static366.aBoolean479);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static488.method2263();
					Static165.method2388("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local266 = Integer.parseInt(arg1.substring(12));
					Static249.method3697(local266, Static166.method2391(local266).aString90);
					Static165.method2388("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static165.method2388("w: " + Static382.aClass227_2.anInt5547);
					return;
				}
				@Pc(1602) Class1_Sub11 local1602;
				if (arg1.startsWith("pc")) {
					local1602 = Static276.method3885(Static486.aClass70_85, Static481.aClass276_2);
					local1602.aClass1_Sub35_Sub2_1.method5777(0);
					local786 = local1602.aClass1_Sub35_Sub2_1.anInt7214;
					local284 = arg1.indexOf(" ", 4);
					local1602.aClass1_Sub35_Sub2_1.method5761(arg1.substring(3, local284));
					Static205.method7547(local1602.aClass1_Sub35_Sub2_1, arg1.substring(local284));
					local1602.aClass1_Sub35_Sub2_1.method5791(local1602.aClass1_Sub35_Sub2_1.anInt7214 - local786);
					Static48.method743(local1602);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static356.method4864();
					Static165.method2388("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local266 = 0; local266 < Static257.anIntArray365.length; local266++) {
						if (Static574.aBooleanArray27[local266]) {
							Static257.anIntArray365[local266] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static257.anIntArray365[local266] *= -1;
							}
						}
					}
					Static356.method4864();
					Static165.method2388("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static184.aBoolean243 = true;
					Static376.method5050();
					Static165.method2388("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static184.aBoolean243 = false;
					Static376.method5050();
					Static165.method2388("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static283.method3948();
					Static165.method2388("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static165.method2388(Static136.method2085() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local266 = Integer.parseInt(arg1.substring(17));
					Static165.method2388("varpbit=" + Static430.aClass321_1.method7083(local266));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local266 = Integer.parseInt(arg1.substring(14));
					Static165.method2388("varp=" + Static430.aClass321_1.method7084(local266));
					return;
				}
				if (arg1.startsWith("demologin")) {
					Static230.method3482(0, false);
					return;
				}
				if (arg1.startsWith("newdemologin")) {
					Static230.method3482(0, true);
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1820) String[] local1820 = Static500.method7455(' ', arg1.substring(12));
					if (local1820.length >= 2) {
						local786 = local1820.length > 2 ? Integer.parseInt(local1820[2]) : 0;
						Static490.method6644(local786, local1820[1], local1820[0]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static80.method1452();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static80.method1450();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static80.method1450();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local266 = Integer.parseInt(arg1.substring(8));
					Static16.aClass134_1.method6965(local266);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static165.method2388("Active streams: " + Static309.aClass1_Sub7_Sub1_2.method473());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static348.aClass1_Sub30_Sub1_1.method3927();
					Static165.method2388("Complete. Toolkit now: " + Static113.anInt2222);
					return;
				}
				if (arg1.equals("errormessage")) {
					Static165.method2388(Static399.aClient1.method1124());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static148.aString19.startsWith("win")) {
						Static208.method3289(new File("C:\\Temp\\heap.dump"));
					} else {
						Static208.method3289(new File("/tmp/heap.dump"));
					}
					Static165.method2388("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static165.method2388("Name: " + Static148.aString19);
					Static165.method2388("Arch: " + Static148.aString24);
					Static165.method2388("Ver: " + Static148.aString21);
					return;
				}
				if (arg1.equals("w2debug")) {
					Static217.aBoolean319 = !Static217.aBoolean319;
					Static334.method4655();
					Static165.method2388("Toggled!");
					return;
				}
				if (Static216.anInt4135 == 10) {
					local1602 = Static276.method3885(Static327.aClass70_58, Static481.aClass276_2);
					local1602.aClass1_Sub35_Sub2_1.method5777(arg1.length() + 3);
					local1602.aClass1_Sub35_Sub2_1.method5777(arg2 ? 1 : 0);
					local1602.aClass1_Sub35_Sub2_1.method5777(arg0 ? 1 : 0);
					local1602.aClass1_Sub35_Sub2_1.method5761(arg1);
					Static48.method743(local1602);
				}
				if (arg1.startsWith("fps ") && Static357.aClass308_6 != Static199.aClass308_3) {
					Static353.method4832(Static21.method7701(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2063) Exception local2063) {
				Static165.method2388(Static568.aClass351_6.method7651(Static307.anInt5279));
				return;
			}
		}
		if (Static216.anInt4135 != 10) {
			Static165.method2388(Static568.aClass351_7.method7651(Static307.anInt5279) + arg1);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Canvas;ILclient!fa;)Lclient!r;")
	public static Class134 method7121(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class134_Sub2(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)Z")
	public static boolean method7124(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
