import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "J")
	public static long aLong119 = -1L;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLjava/lang/String;ZB)V")
	public static void method4614(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static117.method2792("commands - This command");
				Static117.method2792("cls - Clear console");
				Static117.method2792("displayfps - Toggle FPS and other information");
				Static117.method2792("renderer - Print graphics renderer information");
				Static117.method2792("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static30.anInt576 = 0;
				Static558.anInt9506 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static264.aBoolean502 = !Static264.aBoolean502;
				if (!Static264.aBoolean502) {
					Static117.method2792("FPS off");
					return;
				}
				Static117.method2792("FPS on");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(69) Class248 local69 = Static47.aClass33_3.method6230();
				Static117.method2792("Vendor: " + local69.anInt7652);
				Static117.method2792("Name: " + local69.aString85);
				Static117.method2792("Version: " + local69.anInt7649);
				Static117.method2792("Device: " + local69.aString86);
				Static117.method2792("Driver Version: " + local69.aLong183);
				return;
			}
			if (arg1.equals("heap")) {
				Static117.method2792("Heap: " + Static6.anInt66 + "MB");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static117.method2792(Static287.aClass176_2.method4986(Static380.anInt7247));
			return;
		}
		if (Static85.aClass107_2 != Static624.aClass107_7 || Static106.anInt2660 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static117.method2792("FPS: " + Static83.anInt6968);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static20.aBoolean21 = !Static20.aBoolean21;
					if (Static20.aBoolean21) {
						Static117.method2792("Occlsion now on!");
						return;
					}
					Static117.method2792("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static264.aBoolean502 = true;
					Static117.method2792("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static264.aBoolean502 = false;
					Static117.method2792("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static117.method2792("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static2.aClass3_Sub23_1.anInt4394 + "Mb");
						return;
					} catch (@Pc(249) Throwable local249) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static159.aClass375_4.method8637();
					Static117.method2792("Text coords cleared");
					return;
				}
				@Pc(290) int local290;
				@Pc(271) int local271;
				@Pc(280) Runtime local280;
				if (arg1.equalsIgnoreCase("gc")) {
					Static471.method6999();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static117.method2792("mem=" + local290 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static471.method6999();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static117.method2792("Memory before cleanup=" + local290 + "k");
					Static398.method6368();
					Static471.method6999();
					for (@Pc(345) int local345 = 0; local345 < 10; local345++) {
						System.gc();
					}
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static117.method2792("Memory after cleanup=" + local290 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static117.method2792(Static94.method2466() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static117.method2792("Dropped client connection");
					if (Static581.anInt9720 == 10) {
						Static42.method787();
					} else if (Static581.anInt9720 == 11) {
						Static123.aBoolean245 = true;
						return;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static621.aClass278_5.method6940();
					Static117.method2792("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static262.aClass65_2.method2524();
					Static117.method2792("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static262.aClass65_2.method2528();
					Static117.method2792("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static379.aClass228_6.method5931();
					Static412.aClass51_25.method3512();
					Static262.aClass65_2.method2521();
					Static117.method2792("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static612.method8324();
					Static603.method8219();
					Static117.method2792("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static572.aLong253 = Static444.method6719();
					Static619.aBoolean862 = true;
					Static612.method8324();
					Static603.method8219();
					Static117.method2792("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static494.method7243(-1, 1, -1, false);
					if (Static626.method8490() == 1) {
						Static117.method2792("wm1 succeeded");
						return;
					}
					Static117.method2792("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static494.method7243(-1, 2, -1, false);
					if (Static626.method8490() == 2) {
						Static117.method2792("wm2 succeeded");
						return;
					}
					Static117.method2792("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static494.method7243(768, 3, 1024, false);
					if (Static626.method8490() != 3) {
						Static117.method2792("wm3 failed");
						return;
					}
					Static117.method2792("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static559.method7893(false, 0);
					if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 0) {
						Static117.method2792("Entered tk0");
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 0);
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					Static117.method2792("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static559.method7893(false, 1);
					if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 1) {
						Static117.method2792("Entered tk1");
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 1);
						Static152.method3314();
						Static355.aBoolean601 = false;
						return;
					}
					Static117.method2792("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static559.method7893(false, 2);
					if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 2) {
						Static117.method2792("Failed to enter tk2");
						return;
					}
					Static117.method2792("Entered tk2");
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 2);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static559.method7893(false, 3);
					if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 3) {
						Static117.method2792("Failed to enter tk3");
						return;
					}
					Static117.method2792("Entered tk3");
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 3);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static559.method7893(false, 5);
					if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 5) {
						Static117.method2792("Failed to enter tk5");
						return;
					}
					Static117.method2792("Entered tk5");
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 5);
					Static152.method3314();
					Static355.aBoolean601 = false;
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static117.method2792("Invalid buildarea value");
						return;
					}
					local271 = Static607.method8246(arg1.substring(6));
					if (local271 >= 0 && local271 <= Static207.method4079(Static6.anInt66)) {
						Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub29_1, local271);
						Static152.method3314();
						Static355.aBoolean601 = false;
						Static117.method2792("maxbuildarea=" + Static552.aClass3_Sub48_30.aClass23_Sub29_1.method8509());
						return;
					}
					Static117.method2792("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static117.method2792("Invalid rect_debug value");
						return;
					}
					Static94.anInt2529 = Static607.method8246(arg1.substring(10).trim());
					Static117.method2792("rect_debug=" + Static94.anInt2529);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static401.aBoolean650 = true;
					Static117.method2792("qa_op_test=" + Static401.aBoolean650);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static231.aBoolean458 = !Static231.aBoolean458;
					Static117.method2792("clipcomponents=" + Static231.aBoolean458);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(875) boolean local875 = Static47.aClass33_3.method6185();
					if (Static278.method6285(!local875)) {
						if (!local875) {
							Static117.method2792("Bloom enabled");
							return;
						}
						Static117.method2792("Bloom disabled");
						return;
					}
					Static117.method2792("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static433.aBoolean671) {
						Static433.aBoolean671 = true;
						Static117.method2792("Forced tweening ENABLED!");
						return;
					}
					Static433.aBoolean671 = false;
					Static117.method2792("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static109.aBoolean233) {
						Static117.method2792("Shift-click disabled.");
						Static109.aBoolean233 = false;
						return;
					}
					Static117.method2792("Shift-click ENABLED!");
					Static109.aBoolean233 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static117.method2792("x:" + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 >> 9) + " z:" + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static117.method2792("Height: " + Static500.aClass274Array2[Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128].method8041(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 >> 9, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static150.aClass181_34.method5043();
					Static150.aClass181_34.method5048();
					Static168.aClass204_3.method5449();
					Static34.aClass115_1.method3757();
					Static603.method8219();
					Static117.method2792("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static47.aClass33_3.method6155()) {
						local271 = Integer.parseInt(arg1.substring(3));
						if (local271 < 1) {
							local271 = 1;
						} else if (local271 > 4) {
							local271 = 4;
						}
						Static134.anInt3479 = local271;
						Static612.method8324();
						Static117.method2792("Render cores now: " + Static134.anInt3479);
						return;
					}
					Static117.method2792("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static117.method2792("I(s): " + Static443.aClass112_50.method3635() + "/" + Static443.aClass112_50.method3630());
					Static117.method2792("I(m): " + Static376.aClass112_42.method3635() + "/" + Static376.aClass112_42.method3630());
					Static117.method2792("O(s): " + Static367.aClass281_1.aClass295_1.method7265() + "/" + Static367.aClass281_1.aClass295_1.method7264());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static117.method2792("Pos: " + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 + "," + ((Static465.anInt8425 >> 9) + Static446.anInt8090 >> 6) + "," + ((Static289.anInt5908 >> 9) + Static124.anInt3150 >> 6) + "," + (Static446.anInt8090 + (Static465.anInt8425 >> 9) & 0x3F) + "," + (Static124.anInt3150 + (Static289.anInt5908 >> 9) & 0x3F) + " Height: " + (Static202.method3958(Static289.anInt5908, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, Static465.anInt8425) - Static641.anInt10516));
					Static117.method2792("Look: " + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 + "," + (Static446.anInt8090 + Static227.anInt5145 >> 6) + "," + (Static124.anInt3150 + Static184.anInt4365 >> 6) + "," + (Static227.anInt5145 + Static446.anInt8090 & 0x3F) + "," + (Static124.anInt3150 + Static184.anInt4365 & 0x3F) + " Height: " + (Static202.method3958(Static184.anInt4365, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, Static227.anInt5145) - Static552.anInt9439));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static197.aBoolean392 = !Static197.aBoolean392;
					Static47.aClass33_3.method6228(Static197.aBoolean392);
					Static93.method2465();
					Static117.method2792("showprofiling=" + Static197.aBoolean392);
					return;
				}
				@Pc(1283) String[] local1283;
				@Pc(1274) int local1274;
				if (arg1.startsWith("performancetest")) {
					local271 = -1;
					local1274 = 1000;
					if (arg1.length() > 15) {
						local1283 = Static107.method2685(' ', arg1);
						try {
							if (local1283.length > 1) {
								local1274 = Integer.parseInt(local1283[1]);
							}
						} catch (@Pc(1296) Throwable local1296) {
						}
						try {
							if (local1283.length > 2) {
								local271 = Integer.parseInt(local1283[2]);
							}
						} catch (@Pc(1307) Throwable local1307) {
						}
					}
					if (local271 != -1) {
						Static117.method2792("Performance: " + Static617.method8379(local271, local1274));
						return;
					}
					Static117.method2792("Java toolkit: " + Static617.method8379(0, local1274));
					Static117.method2792("SSE toolkit:  " + Static617.method8379(2, local1274));
					Static117.method2792("D3D toolkit:  " + Static617.method8379(3, local1274));
					Static117.method2792("GL toolkit:   " + Static617.method8379(1, local1274));
					Static117.method2792("GLX toolkit:  " + Static617.method8379(5, local1274));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static94.aBoolean204 = !Static94.aBoolean204;
					Static117.method2792("nonpcs=" + Static94.aBoolean204);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static389.method6145();
					Static117.method2792("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local271 = Integer.parseInt(arg1.substring(12));
					Static553.method7813(local271, Static643.method8649(local271).aString52);
					Static117.method2792("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static117.method2792("w: " + Static621.aClass278_5.anInt8394);
					return;
				}
				@Pc(1469) Class3_Sub26 local1469;
				if (arg1.startsWith("pc")) {
					local1469 = Static640.method8636(Static33.aClass344_11, Static403.aClass294_3);
					local1469.aClass3_Sub15_Sub1_3.method8448(0);
					local1274 = local1469.aClass3_Sub15_Sub1_3.anInt10282;
					local290 = arg1.indexOf(" ", 4);
					local1469.aClass3_Sub15_Sub1_3.method8417(arg1.substring(3, local290));
					Static158.method3377(arg1.substring(local290), local1469.aClass3_Sub15_Sub1_3);
					local1469.aClass3_Sub15_Sub1_3.method8433(local1469.aClass3_Sub15_Sub1_3.anInt10282 - local1274);
					Static472.method5189(local1469);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static176.method3582();
					Static117.method2792("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local271 = 0; local271 < Static477.anIntArray533.length; local271++) {
						if (Static158.aBooleanArray10[local271]) {
							Static477.anIntArray533[local271] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static477.anIntArray533[local271] *= -1;
							}
						}
					}
					Static176.method3582();
					Static117.method2792("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static539.aBoolean784 = true;
					Static603.method8219();
					Static117.method2792("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static539.aBoolean784 = false;
					Static603.method8219();
					Static117.method2792("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static598.method8184();
					Static117.method2792("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static117.method2792(Static473.method7011() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local271 = Integer.parseInt(arg1.substring(17));
					Static117.method2792("varpbit=" + Static514.aClass166_1.method4928(local271));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local271 = Integer.parseInt(arg1.substring(14));
					Static117.method2792("varp=" + Static514.aClass166_1.method4927(local271));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1682) String[] local1682 = Static107.method2685(' ', arg1.substring(12));
					if (local1682.length >= 2) {
						local1274 = local1682.length > 2 ? Integer.parseInt(local1682[2]) : 0;
						Static637.method8383(local1682[1], local1274, local1682[0]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static84.method2224();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static84.method2219();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static84.method2219();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local271 = Integer.parseInt(arg1.substring(8));
					Static47.aClass33_3.method6232(local271);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static117.method2792("Active streams: " + Static581.aClass3_Sub7_Sub3_2.method2211());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static592.method8102();
					Static117.method2792("Complete. Toolkit now: " + Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static117.method2792(Static321.aClient2.method1821());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static372.aString79.startsWith("win")) {
						Static312.method8547(new File("C:\\Temp\\heap.dump"));
					} else {
						Static312.method8547(new File("/tmp/heap.dump"));
					}
					Static117.method2792("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static117.method2792("Name: " + Static372.aString79);
					Static117.method2792("Arch: " + Static372.aString78);
					Static117.method2792("Ver: " + Static372.aString81);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local271 = Integer.parseInt(arg1.substring(8, 9));
					Static154.anInt3784 = local271;
					Static612.method8324();
					Static117.method2792("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local271 = arg1.indexOf(32);
					if (local271 < 0) {
						Static117.method2792("Syntax: ortho <n>");
						return;
					}
					local1274 = Static607.method8246(arg1.substring(local271 + 1));
					Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub10_1, local1274);
					Static152.method3314();
					Static355.aBoolean601 = false;
					Static424.method8061();
					if (Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567() == local1274) {
						Static117.method2792("Successfully changed ortho mode");
						return;
					}
					Static117.method2792("Failed to change ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static552.aClass3_Sub48_30.aClass23_Sub10_1.method3567() == 0) {
						Static117.method2792("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local271 = Static607.method8246(arg1.substring(arg1.indexOf(32) + 1));
					Static467.anInt8439 = local271;
					Static117.method2792("orthozoom=" + Static467.anInt8439);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local271 = Static607.method8246(arg1.substring(arg1.indexOf(32) + 1));
					Static135.anInt3501 = local271;
					Static547.anInt8015 = local271;
					Static117.method2792("ortho tile size=" + local271);
					Static424.method8061();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static506.aBoolean756 = !Static506.aBoolean756;
					Static117.method2792("ortho camera lock is " + (Static506.aBoolean756 ? "on" : "off"));
					return;
				}
				@Pc(2026) File local2026;
				if (arg1.startsWith("setoutput ")) {
					local2026 = new File(arg1.substring(10));
					if (local2026.exists()) {
						local2026 = new File(arg1.substring(10) + "." + Static444.method6719() + ".log");
						if (local2026.exists()) {
							Static117.method2792("file already exists!");
							return;
						}
					}
					if (Static67.aFileOutputStream1 != null) {
						Static67.aFileOutputStream1.close();
						Static67.aFileOutputStream1 = null;
					}
					try {
						Static67.aFileOutputStream1 = new FileOutputStream(local2026);
						return;
					} catch (@Pc(2070) FileNotFoundException local2070) {
						Static117.method2792("Could not create " + local2026.getName());
						return;
					} catch (@Pc(2084) SecurityException local2084) {
						Static117.method2792("Cannot write to " + local2026.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static67.aFileOutputStream1 != null) {
						Static67.aFileOutputStream1.close();
					}
					Static67.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2026 = new File(arg1.substring(10));
					if (!local2026.exists()) {
						Static117.method2792("No such file");
						return;
					}
					@Pc(2128) byte[] local2128 = Static553.method7811(local2026);
					if (local2128 == null) {
						Static117.method2792("Failed to read file");
						return;
					}
					local1283 = Static107.method2685('\n', Static582.method8046("", Static181.method3691(local2128)));
					Static497.method7262(local1283);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2163) short local2163 = (short) Static607.method8246(arg1.substring(5));
					if (local2163 > 0) {
						Static604.aShort118 = local2163;
					}
					return;
				}
				if (Static581.anInt9720 == 10) {
					local1469 = Static640.method8636(Static9.aClass344_2, Static403.aClass294_3);
					local1469.aClass3_Sub15_Sub1_3.method8448(arg1.length() + 3);
					local1469.aClass3_Sub15_Sub1_3.method8448(arg2 ? 1 : 0);
					local1469.aClass3_Sub15_Sub1_3.method8448(arg0 ? 1 : 0);
					local1469.aClass3_Sub15_Sub1_3.method8417(arg1);
					Static472.method5189(local1469);
				}
				if (arg1.startsWith("fps ") && Static624.aClass107_7 != Static85.aClass107_2) {
					Static113.method8286(Static607.method8246(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2235) Exception local2235) {
				Static117.method2792(Static287.aClass176_2.method4986(Static380.anInt7247));
				return;
			}
		}
		if (Static581.anInt9720 != 10) {
			Static117.method2792(Static287.aClass176_3.method4986(Static380.anInt7247) + arg1);
		}
	}
}
