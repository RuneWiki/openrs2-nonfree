import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lclient!re;")
	public static Class304[] aClass304Array166;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public static int anInt10954;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public static int anInt10957;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLclient!mu;)V")
	public static void method9033(@OriginalArg(0) int arg0, @OriginalArg(2) Class239 arg1) {
		if (Static217.anInt10315 >= 50 || (arg1 == null || arg1.anIntArrayArray40 == null || arg1.anIntArrayArray40.length <= arg0 || arg1.anIntArrayArray40[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray40[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(53) int local53;
		if (arg1.anIntArrayArray40[arg0].length > 1) {
			local53 = (int) ((double) arg1.anIntArrayArray40[arg0].length * Math.random());
			if (local53 > 0) {
				local36 = arg1.anIntArrayArray40[arg0][local53];
			}
		}
		@Pc(68) int local68 = local32 >> 5 & 0x7;
		local53 = 256;
		if (arg1.anIntArray336 != null && arg1.anIntArray338 != null) {
			local53 = Static545.method6996(arg1.anIntArray338[arg0], arg1.anIntArray336[arg0]);
		}
		if (arg1.aBoolean448) {
			Static224.method3294(local53, local68, local36, 255, false, 0);
		} else {
			Static248.method4092(local36, 0, 255, local53, local68);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZBLjava/lang/String;)V")
	public static void method9035(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static85.method1345("commands - This command");
				Static85.method1345("cls - Clear console");
				Static85.method1345("displayfps - Toggle FPS and other information");
				Static85.method1345("renderer - Print graphics renderer information");
				Static85.method1345("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static76.anInt1484 = 0;
				Class14_Sub26.anInt9540 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static421.aBoolean485 = !Static421.aBoolean485;
				if (Static421.aBoolean485) {
					Static85.method1345("FPS on");
					return;
				}
				Static85.method1345("FPS off");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(65) Class72 local65 = Static119.aClass95_4.method8064();
				Static85.method1345("Vendor: " + local65.anInt1975);
				Static85.method1345("Name: " + local65.aString28);
				Static85.method1345("Version: " + local65.anInt1973);
				Static85.method1345("Device: " + local65.aString29);
				Static85.method1345("Driver Version: " + local65.aLong51);
				return;
			}
			if (arg2.equals("heap")) {
				Static85.method1345("Heap: " + Static525.anInt8303 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static85.method1345(Static114.aClass84_2.method1729(Static654.anInt10668));
			return;
		}
		if (Static256.aClass135_4 != Static228.aClass135_3 || Static512.anInt8070 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static85.method1345("FPS: " + Static451.anInt7260);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static355.aBoolean420 = !Static355.aBoolean420;
					if (Static355.aBoolean420) {
						Static85.method1345("Occlsion now on!");
						return;
					}
					Static85.method1345("Occlsion now off!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static421.aBoolean485 = true;
					Static85.method1345("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static421.aBoolean485 = false;
					Static85.method1345("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static85.method1345("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static395.aClass3_Sub28_1.anInt4590 + "Mb");
						return;
					} catch (@Pc(243) Throwable local243) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static111.aClass317_1.method6896();
					Static85.method1345("Text coords cleared");
					return;
				}
				@Pc(284) int local284;
				@Pc(263) int local263;
				@Pc(274) Runtime local274;
				if (arg2.equalsIgnoreCase("gc")) {
					Static379.method5355();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static85.method1345("mem=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static379.method5355();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static85.method1345("Memory before cleanup=" + local284 + "k");
					Static242.method5989();
					Static379.method5355();
					for (@Pc(342) int local342 = 0; local342 < 10; local342++) {
						System.gc();
					}
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static85.method1345("Memory after cleanup=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static85.method1345(Static76.method1304() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static85.method1345("Dropped client connection");
					if (Static221.anInt3831 == 10) {
						Static226.method3385();
						return;
					}
					if (Static221.anInt3831 == 11) {
						Static231.aBoolean352 = true;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static98.aClass275_2.method6084();
					Static85.method1345("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static512.aClass113_3.method2603();
					Static85.method1345("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static512.aClass113_3.method2589();
					Static85.method1345("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static566.aClass92_6.method1870();
					Static12.aClass26_1.method744();
					Static512.aClass113_3.method2599();
					Static85.method1345("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static364.method5249();
					Static443.method6041();
					Static85.method1345("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static524.aLong238 = Static15.method380();
					Static109.aBoolean159 = true;
					Static364.method5249();
					Static443.method6041();
					Static85.method1345("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static551.method7076(false, 1, -1, -1);
					if (Static241.method3664() == 1) {
						Static85.method1345("wm1 succeeded");
						return;
					}
					Static85.method1345("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static551.method7076(false, 2, -1, -1);
					if (Static241.method3664() == 2) {
						Static85.method1345("wm2 succeeded");
						return;
					}
					Static85.method1345("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static551.method7076(false, 3, 768, 1024);
					if (Static241.method3664() != 3) {
						Static85.method1345("wm3 failed");
						return;
					}
					Static85.method1345("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static168.method2665(false, 0);
					if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 0) {
						Static85.method1345("Entered tk0");
						Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					Static85.method1345("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static168.method2665(false, 1);
					if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 1) {
						Static85.method1345("Entered tk1");
						Static336.aClass3_Sub41_18.method6705(1, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					Static85.method1345("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static168.method2665(false, 2);
					if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 2) {
						Static85.method1345("Failed to enter tk2");
						return;
					}
					Static85.method1345("Entered tk2");
					Static336.aClass3_Sub41_18.method6705(2, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
					Static219.method3247();
					Static74.aBoolean102 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static168.method2665(false, 3);
					if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 3) {
						Static85.method1345("Failed to enter tk3");
						return;
					}
					Static85.method1345("Entered tk3");
					Static336.aClass3_Sub41_18.method6705(3, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
					Static219.method3247();
					Static74.aBoolean102 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static168.method2665(false, 5);
					if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 5) {
						Static85.method1345("Entered tk5");
						Static336.aClass3_Sub41_18.method6705(5, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						return;
					}
					Static85.method1345("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static85.method1345("Invalid buildarea value");
						return;
					}
					local263 = Static505.method6599(arg2.substring(6));
					if (local263 >= 0 && local263 <= Static676.method9003(Static525.anInt8303)) {
						Static336.aClass3_Sub41_18.method6705(local263, Static336.aClass3_Sub41_18.aClass14_Sub22_1);
						Static219.method3247();
						Static74.aBoolean102 = false;
						Static85.method1345("maxbuildarea=" + Static336.aClass3_Sub41_18.aClass14_Sub22_1.method6221());
						return;
					}
					Static85.method1345("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static85.method1345("Invalid rect_debug value");
						return;
					}
					Static594.anInt9604 = Static505.method6599(arg2.substring(10).trim());
					Static85.method1345("rect_debug=" + Static594.anInt9604);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static97.aBoolean153 = true;
					Static85.method1345("qa_op_test=" + Static97.aBoolean153);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static90.aBoolean150 = !Static90.aBoolean150;
					Static85.method1345("clipcomponents=" + Static90.aBoolean150);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(852) boolean local852 = Static119.aClass95_4.method8011();
					if (Static645.method8679(!local852)) {
						if (!local852) {
							Static85.method1345("Bloom enabled");
							return;
						}
						Static85.method1345("Bloom disabled");
						return;
					}
					Static85.method1345("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static378.aBoolean643) {
						Static378.aBoolean643 = false;
						Static85.method1345("Forced tweening disabled.");
						return;
					}
					Static378.aBoolean643 = true;
					Static85.method1345("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (!Static84.aBoolean109) {
						Static85.method1345("Shift-click ENABLED!");
						Static84.aBoolean109 = true;
						return;
					}
					Static85.method1345("Shift-click disabled.");
					Static84.aBoolean109 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static85.method1345("x:" + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9) + " z:" + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static85.method1345("Height: " + Static582.aClass35Array3[Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132].method7461(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static142.aClass362_32.method8357();
					Static142.aClass362_32.method8367();
					Static33.aClass208_11.method4943();
					Static61.aClass378_1.method8706();
					Static443.method6041();
					Static85.method1345("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (!Static119.aClass95_4.method8001()) {
						Static85.method1345("Current toolkit doesn't support multiple cores");
						return;
					}
					local263 = Integer.parseInt(arg2.substring(3));
					if (local263 < 1) {
						local263 = 1;
					} else if (local263 > 4) {
						local263 = 4;
					}
					Static339.anInt5831 = local263;
					Static364.method5249();
					Static85.method1345("Render cores now: " + Static339.anInt5831);
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static85.method1345("I(s): " + Static667.aClass295_72.method6465() + "/" + Static667.aClass295_72.method6472());
					Static85.method1345("I(m): " + Static145.aClass295_11.method6465() + "/" + Static145.aClass295_11.method6472());
					Static85.method1345("O(s): " + Static117.aClass197_2.aClass172_1.method4004() + "/" + Static117.aClass197_2.aClass172_1.method4008());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static85.method1345("Pos: " + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 + "," + ((Static370.anInt6266 >> 9) + Static534.anInt8358 >> 6) + "," + (Static402.anInt6661 + (Static564.anInt9117 >> 9) >> 6) + "," + (Static534.anInt8358 + (Static370.anInt6266 >> 9) & 0x3F) + "," + ((Static564.anInt9117 >> 9) + Static402.anInt6661 & 0x3F) + " Height: " + (Static662.method8831(Static564.anInt9117, Static370.anInt6266, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) - Static166.anInt3034));
					Static85.method1345("Look: " + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 + "," + (Static534.anInt8358 + Static93.anInt1931 >> 6) + "," + (Static76.anInt1481 + Static402.anInt6661 >> 6) + "," + (Static534.anInt8358 + Static93.anInt1931 & 0x3F) + "," + (Static402.anInt6661 + Static76.anInt1481 & 0x3F) + " Height: " + (Static662.method8831(Static76.anInt1481, Static93.anInt1931, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) - Static424.anInt6910));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static122.aBoolean166 = !Static122.aBoolean166;
					Static119.aClass95_4.method8022(Static122.aBoolean166);
					Static373.method5314();
					Static85.method1345("showprofiling=" + Static122.aBoolean166);
					return;
				}
				@Pc(1253) String[] local1253;
				@Pc(1242) int local1242;
				if (arg2.startsWith("performancetest")) {
					local263 = -1;
					local1242 = 1000;
					if (arg2.length() > 15) {
						local1253 = Static120.method1814(arg2, ' ');
						try {
							if (local1253.length > 1) {
								local1242 = Integer.parseInt(local1253[1]);
							}
						} catch (@Pc(1266) Throwable local1266) {
						}
						try {
							if (local1253.length > 2) {
								local263 = Integer.parseInt(local1253[2]);
							}
						} catch (@Pc(1277) Throwable local1277) {
						}
					}
					if (local263 == -1) {
						Static85.method1345("Java toolkit: " + Static434.method5948(local1242, 0));
						Static85.method1345("SSE toolkit:  " + Static434.method5948(local1242, 2));
						Static85.method1345("D3D toolkit:  " + Static434.method5948(local1242, 3));
						Static85.method1345("GL toolkit:   " + Static434.method5948(local1242, 1));
						Static85.method1345("GLX toolkit:  " + Static434.method5948(local1242, 5));
						return;
					}
					Static85.method1345("Performance: " + Static434.method5948(local1242, local263));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static331.aBoolean358 = !Static331.aBoolean358;
					Static85.method1345("nonpcs=" + Static331.aBoolean358);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static341.method4980();
					Static85.method1345("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local263 = Integer.parseInt(arg2.substring(12));
					Static16.method8272(Static429.method5921(local263).aString81, local263);
					Static85.method1345("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static85.method1345("w: " + Static98.aClass275_2.anInt7235);
					return;
				}
				@Pc(1430) Class3_Sub37 local1430;
				if (arg2.startsWith("pc")) {
					local1430 = Static90.method1509(Static285.aClass240_48, Static226.aClass144_2);
					local1430.aClass3_Sub4_Sub1_2.method7948(0);
					local1242 = local1430.aClass3_Sub4_Sub1_2.anInt9739;
					local284 = arg2.indexOf(" ", 4);
					local1430.aClass3_Sub4_Sub1_2.method7901(arg2.substring(3, local284));
					Static332.method4726(arg2.substring(local284), local1430.aClass3_Sub4_Sub1_2);
					local1430.aClass3_Sub4_Sub1_2.method7949(local1430.aClass3_Sub4_Sub1_2.anInt9739 - local1242);
					Static301.method2678(local1430);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static5.method85();
					Static85.method1345("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local263 = 0; local263 < Static484.anIntArray417.length; local263++) {
						if (Static373.aBooleanArray21[local263]) {
							Static484.anIntArray417[local263] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static484.anIntArray417[local263] *= -1;
							}
						}
					}
					Static5.method85();
					Static85.method1345("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static335.aBoolean360 = true;
					Static443.method6041();
					Static85.method1345("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static335.aBoolean360 = false;
					Static443.method6041();
					Static85.method1345("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static655.method8761();
					Static85.method1345("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static85.method1345(Static596.method5956() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local263 = Integer.parseInt(arg2.substring(17));
					Static85.method1345("varpbit=" + Static210.aClass262_1.method5777(local263));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local263 = Integer.parseInt(arg2.substring(14));
					Static85.method1345("varp=" + Static210.aClass262_1.method5776(local263));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1630) String[] local1630 = Static120.method1814(arg2.substring(12), ' ');
					if (local1630.length >= 2) {
						local1242 = local1630.length > 2 ? Integer.parseInt(local1630[2]) : 0;
						Static253.method3815(local1242, local1630[0], local1630[1]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static250.method3781();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static250.method3784();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static250.method3784();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local263 = Integer.parseInt(arg2.substring(8));
					Static119.aClass95_4.method8053(local263);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static85.method1345("Active streams: " + Static156.aClass3_Sub12_Sub1_1.method1763());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static501.method6574();
					Static85.method1345("Complete. Toolkit now: " + Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static85.method1345(Static548.aClient1.method1361());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static126.aString34.startsWith("win")) {
						Static238.method5013(new File("C:\\Temp\\heap.dump"));
					} else {
						Static238.method5013(new File("/tmp/heap.dump"));
					}
					Static85.method1345("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static85.method1345("Name: " + Static126.aString34);
					Static85.method1345("Arch: " + Static126.aString39);
					Static85.method1345("Ver: " + Static126.aString35);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local263 = Integer.parseInt(arg2.substring(8, 9));
					Static205.anInt3593 = local263;
					Static364.method5249();
					Static85.method1345("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local263 = arg2.indexOf(32);
					if (local263 < 0) {
						Static85.method1345("Syntax: ortho <n>");
						return;
					}
					local1242 = Static505.method6599(arg2.substring(local263 + 1));
					Static336.aClass3_Sub41_18.method6705(local1242, Static336.aClass3_Sub41_18.aClass14_Sub2_1);
					Static219.method3247();
					Static74.aBoolean102 = false;
					Static587.method7789();
					if (Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015() == local1242) {
						Static85.method1345("Successfully changed ortho mode");
						return;
					}
					Static85.method1345("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015() == 0) {
						Static85.method1345("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local263 = Static505.method6599(arg2.substring(arg2.indexOf(32) + 1));
					Static501.anInt7936 = local263;
					Static85.method1345("orthozoom=" + Static501.anInt7936);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local263 = Static505.method6599(arg2.substring(arg2.indexOf(32) + 1));
					Static533.anInt7255 = local263;
					Static22.anInt553 = local263;
					Static85.method1345("ortho tile size=" + local263);
					Static587.method7789();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static295.aBoolean333 = !Static295.aBoolean333;
					Static85.method1345("ortho camera lock is " + (Static295.aBoolean333 ? "on" : "off"));
					return;
				}
				@Pc(1971) File local1971;
				if (arg2.startsWith("setoutput ")) {
					local1971 = new File(arg2.substring(10));
					if (local1971.exists()) {
						local1971 = new File(arg2.substring(10) + "." + Static15.method380() + ".log");
						if (local1971.exists()) {
							Static85.method1345("file already exists!");
							return;
						}
					}
					if (Static268.aFileOutputStream1 != null) {
						Static268.aFileOutputStream1.close();
						Static268.aFileOutputStream1 = null;
					}
					try {
						Static268.aFileOutputStream1 = new FileOutputStream(local1971);
						return;
					} catch (@Pc(2013) FileNotFoundException local2013) {
						Static85.method1345("Could not create " + local1971.getName());
						return;
					} catch (@Pc(2025) SecurityException local2025) {
						Static85.method1345("Cannot write to " + local1971.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static268.aFileOutputStream1 != null) {
						Static268.aFileOutputStream1.close();
					}
					Static268.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1971 = new File(arg2.substring(10));
					if (!local1971.exists()) {
						Static85.method1345("No such file");
						return;
					}
					@Pc(2069) byte[] local2069 = Static57.method1067(local1971);
					if (local2069 == null) {
						Static85.method1345("Failed to read file");
						return;
					}
					local1253 = Static120.method1814(Static400.method5533(Static275.method4039(local2069), ""), '\n');
					Static488.method6445(local1253);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2100) short local2100 = (short) Static505.method6599(arg2.substring(5));
					if (local2100 > 0) {
						Static412.aShort57 = local2100;
					}
					return;
				}
				if (Static221.anInt3831 == 10) {
					local1430 = Static90.method1509(Static599.aClass240_82, Static226.aClass144_2);
					local1430.aClass3_Sub4_Sub1_2.method7948(arg2.length() + 3);
					local1430.aClass3_Sub4_Sub1_2.method7948(arg1 ? 1 : 0);
					local1430.aClass3_Sub4_Sub1_2.method7948(arg0 ? 1 : 0);
					local1430.aClass3_Sub4_Sub1_2.method7901(arg2);
					Static301.method2678(local1430);
				}
				if (arg2.startsWith("fps ") && Static228.aClass135_3 != Static256.aClass135_4) {
					Static373.method5315(Static505.method6599(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2167) Exception local2167) {
				Static85.method1345(Static114.aClass84_2.method1729(Static654.anInt10668));
				return;
			}
		}
		if (Static221.anInt3831 != 10) {
			Static85.method1345(Static114.aClass84_3.method1729(Static654.anInt10668) + arg2);
		}
	}
}
