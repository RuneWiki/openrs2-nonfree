import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "Lclient!ah;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public static int anInt10144 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
	public static void method8579(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static67.method1187("commands - This command");
				Static67.method1187("cls - Clear console");
				Static67.method1187("displayfps - Toggle FPS and other information");
				Static67.method1187("renderer - Print graphics renderer information");
				Static67.method1187("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static567.anInt9420 = 0;
				Static22.anInt521 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static544.aBoolean667 = !Static544.aBoolean667;
				if (!Static544.aBoolean667) {
					Static67.method1187("FPS off");
					return;
				}
				Static67.method1187("FPS on");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(68) Class297 local68 = Static546.aClass132_13.method7439();
				Static67.method1187("Vendor: " + local68.anInt8434);
				Static67.method1187("Name: " + local68.aString114);
				Static67.method1187("Version: " + local68.anInt8435);
				Static67.method1187("Device: " + local68.aString115);
				Static67.method1187("Driver Version: " + local68.aLong251);
				return;
			}
			if (arg1.equals("heap")) {
				Static67.method1187("Heap: " + Static549.anInt9246 + "MB");
				return;
			}
		} catch (@Pc(136) Exception local136) {
			Static67.method1187(Static52.aClass41_2.method1007(Static616.anInt10077));
			return;
		}
		if (Static74.aClass104_2 != Static648.aClass104_9 || Static26.anInt609 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static67.method1187("FPS: " + Static490.anInt8338);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static267.aBoolean292 = !Static267.aBoolean292;
					if (!Static267.aBoolean292) {
						Static67.method1187("Occlsion now off!");
						return;
					}
					Static67.method1187("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static544.aBoolean667 = true;
					Static67.method1187("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static544.aBoolean667 = false;
					Static67.method1187("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static67.method1187("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static296.aClass6_Sub33_1.anInt4998 + "Mb");
						return;
					} catch (@Pc(244) Throwable local244) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static214.aClass43_7.method1089();
					Static67.method1187("Text coords cleared");
					return;
				}
				@Pc(283) int local283;
				@Pc(264) int local264;
				@Pc(273) Runtime local273;
				if (arg1.equalsIgnoreCase("gc")) {
					Static57.method1079();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local283 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static67.method1187("mem=" + local283 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static57.method1079();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local283 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static67.method1187("Memory before cleanup=" + local283 + "k");
					Static129.method1975();
					Static57.method1079();
					for (@Pc(340) int local340 = 0; local340 < 10; local340++) {
						System.gc();
					}
					local283 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static67.method1187("Memory after cleanup=" + local283 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static67.method1187(Static237.method3586() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static67.method1187("Dropped client connection");
					if (Static556.anInt9319 == 10) {
						Static339.method4970();
						return;
					}
					if (Static556.anInt9319 == 11) {
						Static84.aBoolean106 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static406.aClass354_3.method8303();
					Static67.method1187("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static424.aClass73_2.method1805();
					Static67.method1187("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static424.aClass73_2.method1804();
					Static67.method1187("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static569.aClass380_6.method8826();
					Static163.aClass170_1.method8768();
					Static424.aClass73_2.method1801();
					Static67.method1187("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static641.method8753();
					Static187.method2662();
					Static67.method1187("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static538.aLong66 = Static566.method7936();
					Static588.aBoolean689 = true;
					Static641.method8753();
					Static187.method2662();
					Static67.method1187("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static138.method2063(1, false, -1, -1);
					if (Static455.method6591() == 1) {
						Static67.method1187("wm1 succeeded");
						return;
					}
					Static67.method1187("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static138.method2063(2, false, -1, -1);
					if (Static455.method6591() == 2) {
						Static67.method1187("wm2 succeeded");
						return;
					}
					Static67.method1187("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static138.method2063(3, false, 768, 1024);
					if (Static455.method6591() != 3) {
						Static67.method1187("wm3 failed");
						return;
					}
					Static67.method1187("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static646.method8805(0, false);
					if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 0) {
						Static67.method1187("Entered tk0");
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 0);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					Static67.method1187("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static646.method8805(1, false);
					if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 1) {
						Static67.method1187("Entered tk1");
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 1);
						Static633.method8698();
						Static274.aBoolean301 = false;
						return;
					}
					Static67.method1187("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static646.method8805(2, false);
					if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 2) {
						Static67.method1187("Failed to enter tk2");
						return;
					}
					Static67.method1187("Entered tk2");
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 2);
					Static633.method8698();
					Static274.aBoolean301 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static646.method8805(3, false);
					if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 3) {
						Static67.method1187("Failed to enter tk3");
						return;
					}
					Static67.method1187("Entered tk3");
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 3);
					Static633.method8698();
					Static274.aBoolean301 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static646.method8805(5, false);
					if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 5) {
						Static67.method1187("Failed to enter tk5");
						return;
					}
					Static67.method1187("Entered tk5");
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 5);
					Static633.method8698();
					Static274.aBoolean301 = false;
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static67.method1187("Invalid buildarea value");
						return;
					}
					local264 = Static368.method5312(arg1.substring(6));
					if (local264 >= 0 && Static597.method8265(Static549.anInt9246) >= local264) {
						Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub23_1, local264);
						Static633.method8698();
						Static274.aBoolean301 = false;
						Static67.method1187("maxbuildarea=" + Static96.aClass6_Sub22_7.aClass29_Sub23_1.method7364());
						return;
					}
					Static67.method1187("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static67.method1187("Invalid rect_debug value");
						return;
					}
					Static49.anInt1033 = Static368.method5312(arg1.substring(10).trim());
					Static67.method1187("rect_debug=" + Static49.anInt1033);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static383.aBoolean423 = true;
					Static67.method1187("qa_op_test=" + Static383.aBoolean423);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static433.aBoolean498 = !Static433.aBoolean498;
					Static67.method1187("clipcomponents=" + Static433.aBoolean498);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(866) boolean local866 = Static546.aClass132_13.method7466();
					if (!Static119.method1849(!local866)) {
						Static67.method1187("Failed to enable bloom");
						return;
					}
					if (local866) {
						Static67.method1187("Bloom disabled");
						return;
					}
					Static67.method1187("Bloom enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static386.aBoolean433) {
						Static386.aBoolean433 = false;
						Static67.method1187("Forced tweening disabled.");
						return;
					}
					Static386.aBoolean433 = true;
					Static67.method1187("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (!Static71.aBoolean71) {
						Static67.method1187("Shift-click ENABLED!");
						Static71.aBoolean71 = true;
						return;
					}
					Static67.method1187("Shift-click disabled.");
					Static71.aBoolean71 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static67.method1187("x:" + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9) + " z:" + (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static67.method1187("Height: " + Static289.aClass12Array3[Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140].method7846(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 >> 9, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static624.aClass8_139.method249();
					Static624.aClass8_139.method257();
					Static340.aClass186_3.method4239();
					Static252.aClass280_1.method6910();
					Static187.method2662();
					Static67.method1187("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static546.aClass132_13.method7445()) {
						Static67.method1187("Current toolkit doesn't support multiple cores");
						return;
					}
					local264 = Integer.parseInt(arg1.substring(3));
					if (local264 < 1) {
						local264 = 1;
					} else if (local264 > 4) {
						local264 = 4;
					}
					Static606.anInt9846 = local264;
					Static641.method8753();
					Static67.method1187("Render cores now: " + Static606.anInt9846);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static67.method1187("I(s): " + Static340.aClass10_37.method368() + "/" + Static340.aClass10_37.method365());
					Static67.method1187("I(m): " + Static229.aClass10_18.method368() + "/" + Static229.aClass10_18.method365());
					Static67.method1187("O(s): " + Static340.aClass121_1.aClass223_1.method5299() + "/" + Static340.aClass121_1.aClass223_1.method5307());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static67.method1187("Pos: " + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 + "," + (Static534.anInt8753 + (Static23.anInt564 >> 9) >> 6) + "," + ((Static542.anInt9140 >> 9) + Static234.anInt4239 >> 6) + "," + (Static534.anInt8753 + (Static23.anInt564 >> 9) & 0x3F) + "," + ((Static542.anInt9140 >> 9) + Static234.anInt4239 & 0x3F) + " Height: " + (Static284.method4118(Static23.anInt564, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, Static542.anInt9140) - Static170.anInt2855));
					Static67.method1187("Look: " + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 + "," + (Static534.anInt8753 + Static250.anInt4333 >> 6) + "," + (Static234.anInt4239 + Static6.anInt223 >> 6) + "," + (Static250.anInt4333 + Static534.anInt8753 & 0x3F) + "," + (Static234.anInt4239 + Static6.anInt223 & 0x3F) + " Height: " + (Static284.method4118(Static250.anInt4333, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, Static6.anInt223) - Static282.anInt4836));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static268.aBoolean293 = !Static268.aBoolean293;
					Static546.aClass132_13.method7450(Static268.aBoolean293);
					Static44.method935();
					Static67.method1187("showprofiling=" + Static268.aBoolean293);
					return;
				}
				@Pc(1278) String[] local1278;
				@Pc(1267) int local1267;
				if (arg1.startsWith("performancetest")) {
					local264 = -1;
					local1267 = 1000;
					if (arg1.length() > 15) {
						local1278 = Static635.method8720(arg1, ' ');
						try {
							if (local1278.length > 1) {
								local1267 = Integer.parseInt(local1278[1]);
							}
						} catch (@Pc(1289) Throwable local1289) {
						}
						try {
							if (local1278.length > 2) {
								local264 = Integer.parseInt(local1278[2]);
							}
						} catch (@Pc(1300) Throwable local1300) {
						}
					}
					if (local264 != -1) {
						Static67.method1187("Performance: " + Static27.method6638(local1267, local264));
						return;
					}
					Static67.method1187("Java toolkit: " + Static27.method6638(local1267, 0));
					Static67.method1187("SSE toolkit:  " + Static27.method6638(local1267, 2));
					Static67.method1187("D3D toolkit:  " + Static27.method6638(local1267, 3));
					Static67.method1187("GL toolkit:   " + Static27.method6638(local1267, 1));
					Static67.method1187("GLX toolkit:  " + Static27.method6638(local1267, 5));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static462.aBoolean552 = !Static462.aBoolean552;
					Static67.method1187("nonpcs=" + Static462.aBoolean552);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static666.method9033();
					Static67.method1187("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local264 = Integer.parseInt(arg1.substring(12));
					Static627.method8634(Static203.method3046(local264).aString90, local264);
					Static67.method1187("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static67.method1187("w: " + Static406.aClass354_3.anInt9837);
					return;
				}
				@Pc(1455) Class6_Sub26 local1455;
				if (arg1.startsWith("pc")) {
					local1455 = Static268.method3981(Static377.aClass15_2, Static309.aClass289_42);
					local1455.aClass6_Sub23_Sub1_2.method8366(0);
					local1267 = local1455.aClass6_Sub23_Sub1_2.anInt9901;
					local283 = arg1.indexOf(" ", 4);
					local1455.aClass6_Sub23_Sub1_2.method8398(arg1.substring(3, local283));
					Static174.method2472(local1455.aClass6_Sub23_Sub1_2, arg1.substring(local283));
					local1455.aClass6_Sub23_Sub1_2.method8346(local1455.aClass6_Sub23_Sub1_2.anInt9901 - local1267);
					Static670.method9077(local1455);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static472.method6956();
					Static67.method1187("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local264 = 0; local264 < Static466.anIntArray529.length; local264++) {
						if (Static620.aBooleanArray33[local264]) {
							Static466.anIntArray529[local264] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static466.anIntArray529[local264] *= -1;
							}
						}
					}
					Static472.method6956();
					Static67.method1187("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static243.aBoolean270 = true;
					Static187.method2662();
					Static67.method1187("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static243.aBoolean270 = false;
					Static187.method2662();
					Static67.method1187("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static274.method4045();
					Static67.method1187("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static67.method1187(Static256.method3695() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local264 = Integer.parseInt(arg1.substring(17));
					Static67.method1187("varpbit=" + Static659.aClass363_3.method8556(local264));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local264 = Integer.parseInt(arg1.substring(14));
					Static67.method1187("varp=" + Static659.aClass363_3.method8557(local264));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1658) String[] local1658 = Static635.method8720(arg1.substring(12), ' ');
					if (local1658.length >= 2) {
						local1267 = local1658.length > 2 ? Integer.parseInt(local1658[2]) : 0;
						Static547.method7777(local1658[0], local1658[1], local1267);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static295.method4228();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static295.method4224();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static295.method4224();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local264 = Integer.parseInt(arg1.substring(8));
					Static546.aClass132_13.method7485(local264);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static67.method1187("Active streams: " + Static106.aClass6_Sub8_Sub3_2.method4255());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static337.method2274();
					Static67.method1187("Complete. Toolkit now: " + Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static67.method1187(Static563.aClient1.method1434());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static647.aString144.startsWith("win")) {
						Static667.method9046(new File("C:\\Temp\\heap.dump"));
					} else {
						Static667.method9046(new File("/tmp/heap.dump"));
					}
					Static67.method1187("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static67.method1187("Name: " + Static647.aString144);
					Static67.method1187("Arch: " + Static647.aString147);
					Static67.method1187("Ver: " + Static647.aString150);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local264 = Integer.parseInt(arg1.substring(8, 9));
					Static645.anInt10423 = local264;
					Static641.method8753();
					Static67.method1187("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local264 = arg1.indexOf(32);
					if (local264 < 0) {
						Static67.method1187("Syntax: ortho <n>");
						return;
					}
					local1267 = Static368.method5312(arg1.substring(local264 + 1));
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub14_1, local1267);
					Static633.method8698();
					Static274.aBoolean301 = false;
					Static49.method969();
					if (local1267 == Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231()) {
						Static67.method1187("Successfully changed ortho mode");
						return;
					}
					Static67.method1187("Failed to change ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static96.aClass6_Sub22_7.aClass29_Sub14_1.method5231() == 0) {
						Static67.method1187("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local264 = Static368.method5312(arg1.substring(arg1.indexOf(32) + 1));
					Static472.anInt8141 = local264;
					Static67.method1187("orthozoom=" + Static472.anInt8141);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local264 = Static368.method5312(arg1.substring(arg1.indexOf(32) + 1));
					Static347.anInt10657 = local264;
					Static114.anInt2056 = local264;
					Static67.method1187("ortho tile size=" + local264);
					Static49.method969();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static523.aBoolean613 = !Static523.aBoolean613;
					Static67.method1187("ortho camera lock is " + (Static523.aBoolean613 ? "on" : "off"));
					return;
				}
				@Pc(2004) File local2004;
				if (arg1.startsWith("setoutput ")) {
					local2004 = new File(arg1.substring(10));
					if (local2004.exists()) {
						local2004 = new File(arg1.substring(10) + "." + Static566.method7936() + ".log");
						if (local2004.exists()) {
							Static67.method1187("file already exists!");
							return;
						}
					}
					if (Static456.aFileOutputStream1 != null) {
						Static456.aFileOutputStream1.close();
						Static456.aFileOutputStream1 = null;
					}
					try {
						Static456.aFileOutputStream1 = new FileOutputStream(local2004);
						return;
					} catch (@Pc(2046) FileNotFoundException local2046) {
						Static67.method1187("Could not create " + local2004.getName());
						return;
					} catch (@Pc(2058) SecurityException local2058) {
						Static67.method1187("Cannot write to " + local2004.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static456.aFileOutputStream1 != null) {
						Static456.aFileOutputStream1.close();
					}
					Static456.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2004 = new File(arg1.substring(10));
					if (!local2004.exists()) {
						Static67.method1187("No such file");
						return;
					}
					@Pc(2102) byte[] local2102 = Static493.method7106(local2004);
					if (local2102 == null) {
						Static67.method1187("Failed to read file");
						return;
					}
					local1278 = Static635.method8720(Static424.method6291(Static155.method2194(local2102), ""), '\n');
					Static596.method8231(local1278);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2133) short local2133 = (short) Static368.method5312(arg1.substring(5));
					if (local2133 > 0) {
						Static76.aShort24 = local2133;
					}
					return;
				}
				if (Static556.anInt9319 == 10) {
					local1455 = Static268.method3981(Static377.aClass15_2, Static236.aClass289_59);
					local1455.aClass6_Sub23_Sub1_2.method8366(arg1.length() + 3);
					local1455.aClass6_Sub23_Sub1_2.method8366(arg2 ? 1 : 0);
					local1455.aClass6_Sub23_Sub1_2.method8366(arg0 ? 1 : 0);
					local1455.aClass6_Sub23_Sub1_2.method8398(arg1);
					Static670.method9077(local1455);
				}
				if (arg1.startsWith("fps ") && Static74.aClass104_2 != Static648.aClass104_9) {
					Static70.method1231(Static368.method5312(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2204) Exception local2204) {
				Static67.method1187(Static52.aClass41_2.method1007(Static616.anInt10077));
				return;
			}
		}
		if (Static556.anInt9319 != 10) {
			Static67.method1187(Static52.aClass41_3.method1007(Static616.anInt10077) + arg1);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!bi;B)V")
	public static void method8580(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.aClass2_Sub1_Sub1_Sub3_1 = null;
		if (Static97.anInt1786 < 20) {
			Static90.aClass43_3.method1084(arg0);
			Static97.anInt1786++;
		}
	}
}
