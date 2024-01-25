import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public static int anInt9791 = 0;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "[S")
	public static short[] aShortArray145 = new short[256];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIII)I")
	public static int method8391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
	public static void method8395(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static410.method6501("commands - This command");
				Static410.method6501("cls - Clear console");
				Static410.method6501("displayfps - Toggle FPS and other information");
				Static410.method6501("renderer - Print graphics renderer information");
				Static410.method6501("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static451.anInt8003 = 0;
				Static243.anInt4523 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static106.aBoolean155 = !Static106.aBoolean155;
				if (Static106.aBoolean155) {
					Static410.method6501("FPS on");
					return;
				}
				Static410.method6501("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(71) Class103 local71 = Static323.aClass5_9.method7569();
				Static410.method6501("Vendor: " + local71.anInt2908);
				Static410.method6501("Name: " + local71.aString23);
				Static410.method6501("Version: " + local71.anInt2911);
				Static410.method6501("Device: " + local71.aString22);
				Static410.method6501("Driver Version: " + local71.aLong70);
				return;
			}
			if (arg1.equals("heap")) {
				Static410.method6501("Heap: " + Static131.anInt2701 + "MB");
				return;
			}
		} catch (@Pc(141) Exception local141) {
			Static410.method6501(Static59.aClass43_2.method1598(Static325.anInt6083));
			return;
		}
		if (Static2.aClass135_1 != Static42.aClass135_2 || Static302.anInt5364 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static410.method6501("FPS: " + Static295.anInt5199);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static500.aBoolean598 = !Static500.aBoolean598;
					if (!Static500.aBoolean598) {
						Static410.method6501("Occlsion now off!");
						return;
					}
					Static410.method6501("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static106.aBoolean155 = true;
					Static410.method6501("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static106.aBoolean155 = false;
					Static410.method6501("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static410.method6501("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(254) Throwable local254) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static543.aClass120_8.method2964();
					Static410.method6501("Text coords cleared");
					return;
				}
				@Pc(295) int local295;
				@Pc(276) int local276;
				@Pc(285) Runtime local285;
				if (arg1.equalsIgnoreCase("gc")) {
					Static173.method3039();
					for (local276 = 0; local276 < 10; local276++) {
						System.gc();
					}
					local285 = Runtime.getRuntime();
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static410.method6501("mem=" + local295 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static173.method3039();
					for (local276 = 0; local276 < 10; local276++) {
						System.gc();
					}
					local285 = Runtime.getRuntime();
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static410.method6501("Memory before cleanup=" + local295 + "k");
					Static414.method6551();
					Static173.method3039();
					for (@Pc(352) int local352 = 0; local352 < 10; local352++) {
						System.gc();
					}
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static410.method6501("Memory after cleanup=" + local295 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static410.method6501(Static408.method6493() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static410.method6501("Dropped client connection");
					if (Static485.anInt8420 == 10) {
						Static567.method8638();
						return;
					}
					if (Static485.anInt8420 == 11) {
						Static137.aBoolean215 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static4.aClass363_1.method8469();
					Static410.method6501("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static365.aClass248_1.method6455();
					Static410.method6501("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static365.aClass248_1.method6454();
					Static410.method6501("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static205.aClass138_2.method3574();
					Static413.aClass230_1.method6027();
					Static365.aClass248_1.method6462();
					Static410.method6501("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static73.method1756();
					Static628.method4779();
					Static410.method6501("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static452.aLong83 = Static374.method6036();
					Static51.aBoolean94 = true;
					Static73.method1756();
					Static628.method4779();
					Static410.method6501("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static398.method6435(-1, false, -1, 1);
					if (Static634.method8682() == 1) {
						Static410.method6501("wm1 succeeded");
						return;
					}
					Static410.method6501("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static398.method6435(-1, false, -1, 2);
					if (Static634.method8682() == 2) {
						Static410.method6501("wm2 succeeded");
						return;
					}
					Static410.method6501("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static398.method6435(1024, false, 768, 3);
					if (Static634.method8682() == 3) {
						Static410.method6501("wm3 succeeded");
						return;
					}
					Static410.method6501("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static441.method6865(false, 0);
					if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 0) {
						Static410.method6501("Failed to enter tk0");
						return;
					}
					Static410.method6501("Entered tk0");
					Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static441.method6865(false, 1);
					if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 1) {
						Static410.method6501("Entered tk1");
						Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					Static410.method6501("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static441.method6865(false, 2);
					if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 2) {
						Static410.method6501("Entered tk2");
						Static262.aClass3_Sub27_12.method3234(2, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					Static410.method6501("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static441.method6865(false, 3);
					if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 3) {
						Static410.method6501("Failed to enter tk3");
						return;
					}
					Static410.method6501("Entered tk3");
					Static262.aClass3_Sub27_12.method3234(3, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static441.method6865(false, 5);
					if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 5) {
						Static410.method6501("Failed to enter tk5");
						return;
					}
					Static410.method6501("Entered tk5");
					Static262.aClass3_Sub27_12.method3234(5, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static410.method6501("Invalid buildarea value");
						return;
					}
					local276 = Static134.method2553(arg1.substring(6));
					if (local276 >= 0 && Static41.method1345(Static131.anInt2701) >= local276) {
						Static262.aClass3_Sub27_12.method3234(local276, Static262.aClass3_Sub27_12.aClass21_Sub4_1);
						Static108.method2177();
						Static168.aBoolean272 = false;
						Static410.method6501("maxbuildarea=" + Static262.aClass3_Sub27_12.aClass21_Sub4_1.method1459());
						return;
					}
					Static410.method6501("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static410.method6501("Invalid rect_debug value");
						return;
					}
					Static277.anInt4996 = Static134.method2553(arg1.substring(10).trim());
					Static410.method6501("rect_debug=" + Static277.anInt4996);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static351.aBoolean491 = true;
					Static410.method6501("qa_op_test=" + Static351.aBoolean491);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static327.aBoolean434 = !Static327.aBoolean434;
					Static410.method6501("clipcomponents=" + Static327.aBoolean434);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(906) boolean local906 = Static323.aClass5_9.method7516();
					if (Static163.method2899(!local906)) {
						if (!local906) {
							Static410.method6501("Bloom enabled");
							return;
						}
						Static410.method6501("Bloom disabled");
						return;
					}
					Static410.method6501("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static583.aBoolean687) {
						Static583.aBoolean687 = true;
						Static410.method6501("Forced tweening ENABLED!");
						return;
					}
					Static583.aBoolean687 = false;
					Static410.method6501("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static585.aBoolean689) {
						Static410.method6501("Shift-click disabled.");
						Static585.aBoolean689 = false;
						return;
					}
					Static410.method6501("Shift-click ENABLED!");
					Static585.aBoolean689 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static410.method6501("x:" + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9) + " z:" + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static410.method6501("Height: " + Static364.aClass51Array3[Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123].method7835(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static474.aClass196_98.method5110();
					Static474.aClass196_98.method5091();
					Static9.aClass202_1.method5165();
					Static68.aClass335_2.method8124();
					Static628.method4779();
					Static410.method6501("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static323.aClass5_9.method7549()) {
						local276 = Integer.parseInt(arg1.substring(3));
						if (local276 < 1) {
							local276 = 1;
						} else if (local276 > 4) {
							local276 = 4;
						}
						Static302.anInt5362 = local276;
						Static73.method1756();
						Static410.method6501("Render cores now: " + Static302.anInt5362);
						return;
					}
					Static410.method6501("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static410.method6501("I(s): " + Static605.aClass102_62.method2676() + "/" + Static605.aClass102_62.method2673());
					Static410.method6501("I(m): " + Static174.aClass102_21.method2676() + "/" + Static174.aClass102_21.method2673());
					Static410.method6501("O(s): " + Static320.aClass53_2.aClass100_1.method2659() + "/" + Static320.aClass53_2.aClass100_1.method2661());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static410.method6501("Pos: " + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 + "," + (Static299.anInt5307 + (Static611.anInt9892 >> 9) >> 6) + "," + (Static171.anInt3340 + (Static20.anInt824 >> 9) >> 6) + "," + ((Static611.anInt9892 >> 9) + Static299.anInt5307 & 0x3F) + "," + ((Static20.anInt824 >> 9) + Static171.anInt3340 & 0x3F) + " Height: " + (Static192.method3263(Static20.anInt824, Static611.anInt9892, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) - Static557.anInt9304));
					Static410.method6501("Look: " + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 + "," + (Static299.anInt5307 + Static39.anInt1251 >> 6) + "," + (Static171.anInt3340 + Static337.anInt6315 >> 6) + "," + (Static299.anInt5307 + Static39.anInt1251 & 0x3F) + "," + (Static337.anInt6315 + Static171.anInt3340 & 0x3F) + " Height: " + (Static192.method3263(Static337.anInt6315, Static39.anInt1251, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123) - Static596.anInt9759));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static506.aBoolean620 = !Static506.aBoolean620;
					Static323.aClass5_9.method7492(Static506.aBoolean620);
					Static546.method7958();
					Static410.method6501("showprofiling=" + Static506.aBoolean620);
					return;
				}
				@Pc(1323) String[] local1323;
				@Pc(1314) int local1314;
				if (arg1.startsWith("performancetest")) {
					local276 = -1;
					local1314 = 1000;
					if (arg1.length() > 15) {
						local1323 = Static33.method1210(' ', arg1);
						try {
							if (local1323.length > 1) {
								local1314 = Integer.parseInt(local1323[1]);
							}
						} catch (@Pc(1334) Throwable local1334) {
						}
						try {
							if (local1323.length > 2) {
								local276 = Integer.parseInt(local1323[2]);
							}
						} catch (@Pc(1345) Throwable local1345) {
						}
					}
					if (local276 == -1) {
						Static410.method6501("Java toolkit: " + Static602.method8408(local1314, 0));
						Static410.method6501("SSE toolkit:  " + Static602.method8408(local1314, 2));
						Static410.method6501("D3D toolkit:  " + Static602.method8408(local1314, 3));
						Static410.method6501("GL toolkit:   " + Static602.method8408(local1314, 1));
						Static410.method6501("GLX toolkit:  " + Static602.method8408(local1314, 5));
						return;
					}
					Static410.method6501("Performance: " + Static602.method8408(local1314, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025()));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static68.aBoolean103 = !Static68.aBoolean103;
					Static410.method6501("nonpcs=" + Static68.aBoolean103);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static128.method2510();
					Static410.method6501("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local276 = Integer.parseInt(arg1.substring(12));
					Static404.method6472(local276, Static626.method8630(local276).aString29);
					Static410.method6501("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static410.method6501("w: " + Static4.aClass363_1.anInt9891);
					return;
				}
				@Pc(1503) Class3_Sub14 local1503;
				if (arg1.startsWith("pc")) {
					local1503 = Static139.method2308(Static572.aClass130_127, Static24.aClass233_1);
					local1503.aClass3_Sub3_Sub2_2.method4220(0);
					local1314 = local1503.aClass3_Sub3_Sub2_2.anInt4736;
					local295 = arg1.indexOf(" ", 4);
					local1503.aClass3_Sub3_Sub2_2.method4241(arg1.substring(3, local295));
					Static285.method4569(local1503.aClass3_Sub3_Sub2_2, arg1.substring(local295));
					local1503.aClass3_Sub3_Sub2_2.method4218(local1503.aClass3_Sub3_Sub2_2.anInt4736 - local1314);
					Static562.method8096(local1503);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static52.method1478();
					Static410.method6501("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local276 = 0; local276 < Static396.anIntArray394.length; local276++) {
						if (Static515.aBooleanArray24[local276]) {
							Static396.anIntArray394[local276] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static396.anIntArray394[local276] *= -1;
							}
						}
					}
					Static52.method1478();
					Static410.method6501("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static509.aBoolean627 = true;
					Static628.method4779();
					Static410.method6501("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static509.aBoolean627 = false;
					Static628.method4779();
					Static410.method6501("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static518.method7722();
					Static410.method6501("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static410.method6501(Static49.method1447() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local276 = Integer.parseInt(arg1.substring(17));
					Static410.method6501("varpbit=" + Static373.aClass150_1.method3821(local276));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local276 = Integer.parseInt(arg1.substring(14));
					Static410.method6501("varp=" + Static373.aClass150_1.method3820(local276));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1706) String[] local1706 = Static33.method1210(' ', arg1.substring(12));
					if (local1706.length >= 2) {
						local1314 = local1706.length <= 2 ? 0 : Integer.parseInt(local1706[2]);
						Static173.method3035(local1314, local1706[1], local1706[0]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static304.method4845();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static304.method4832();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static304.method4832();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local276 = Integer.parseInt(arg1.substring(8));
					Static323.aClass5_9.method7561(local276);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static410.method6501("Active streams: " + Static204.aClass3_Sub7_Sub1_1.method1623());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static480.method7176();
					Static410.method6501("Complete. Toolkit now: " + Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static410.method6501(Static116.aClient1.method1803());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static211.aString44.startsWith("win")) {
						Static367.method5977(new File("C:\\Temp\\heap.dump"));
					} else {
						Static367.method5977(new File("/tmp/heap.dump"));
					}
					Static410.method6501("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static410.method6501("Name: " + Static211.aString44);
					Static410.method6501("Arch: " + Static211.aString49);
					Static410.method6501("Ver: " + Static211.aString45);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local276 = Integer.parseInt(arg1.substring(8, 9));
					Static228.anInt4286 = local276;
					Static73.method1756();
					Static410.method6501("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local276 = arg1.indexOf(32);
					if (local276 < 0) {
						Static410.method6501("Syntax: ortho <n>");
						return;
					}
					local1314 = Static134.method2553(arg1.substring(local276 + 1));
					Static262.aClass3_Sub27_12.method3234(local1314, Static262.aClass3_Sub27_12.aClass21_Sub28_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					Static58.method1595();
					if (local1314 != Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504()) {
						Static410.method6501("Failed to change ortho mode");
						return;
					}
					Static410.method6501("Successfully changed ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504() == 0) {
						Static410.method6501("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local276 = Static134.method2553(arg1.substring(arg1.indexOf(32) + 1));
					Static401.anInt7424 = local276;
					Static410.method6501("orthozoom=" + Static401.anInt7424);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local276 = Static134.method2553(arg1.substring(arg1.indexOf(32) + 1));
					Static575.anInt9465 = local276;
					Static25.anInt7711 = local276;
					Static410.method6501("ortho tile size=" + local276);
					Static58.method1595();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static297.aBoolean346 = !Static297.aBoolean346;
					Static410.method6501("ortho camera lock is " + (Static297.aBoolean346 ? "on" : "off"));
					return;
				}
				@Pc(2048) File local2048;
				if (arg1.startsWith("setoutput ")) {
					local2048 = new File(arg1.substring(10));
					if (local2048.exists()) {
						local2048 = new File(arg1.substring(10) + "." + Static374.method6036() + ".log");
						if (local2048.exists()) {
							Static410.method6501("file already exists!");
							return;
						}
					}
					if (Static375.aFileOutputStream1 != null) {
						Static375.aFileOutputStream1.close();
						Static375.aFileOutputStream1 = null;
					}
					try {
						Static375.aFileOutputStream1 = new FileOutputStream(local2048);
						return;
					} catch (@Pc(2094) FileNotFoundException local2094) {
						Static410.method6501("Could not create " + local2048.getName());
						return;
					} catch (@Pc(2106) SecurityException local2106) {
						Static410.method6501("Cannot write to " + local2048.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static375.aFileOutputStream1 != null) {
						Static375.aFileOutputStream1.close();
					}
					Static375.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2048 = new File(arg1.substring(10));
					if (!local2048.exists()) {
						Static410.method6501("No such file");
						return;
					}
					@Pc(2152) byte[] local2152 = Static134.method2554(local2048);
					if (local2152 == null) {
						Static410.method6501("Failed to read file");
						return;
					}
					local1323 = Static33.method1210('\n', Static342.method5734(Static142.method7671(local2152), ""));
					Static68.method1700(local1323);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2183) short local2183 = (short) Static134.method2553(arg1.substring(5));
					if (local2183 > 0) {
						Static524.aShort114 = local2183;
					}
					return;
				}
				if (Static485.anInt8420 == 10) {
					local1503 = Static139.method2308(Static275.aClass130_81, Static24.aClass233_1);
					local1503.aClass3_Sub3_Sub2_2.method4220(arg1.length() + 3);
					local1503.aClass3_Sub3_Sub2_2.method4220(arg2 ? 1 : 0);
					local1503.aClass3_Sub3_Sub2_2.method4220(arg0 ? 1 : 0);
					local1503.aClass3_Sub3_Sub2_2.method4241(arg1);
					Static562.method8096(local1503);
				}
				if (arg1.startsWith("fps ") && Static2.aClass135_1 != Static42.aClass135_2) {
					Static266.method4393(Static134.method2553(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2253) Exception local2253) {
				Static410.method6501(Static59.aClass43_2.method1598(Static325.anInt6083));
				return;
			}
		}
		if (Static485.anInt8420 != 10) {
			Static410.method6501(Static59.aClass43_3.method1598(Static325.anInt6083) + arg1);
		}
	}
}
