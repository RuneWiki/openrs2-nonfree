import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
	public static int anInt9839;

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "Lclient!td;")
	public static Class332 aClass332_8;

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
	public static int anInt9847 = 0;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BZLjava/lang/String;Z)V")
	public static void method8199(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static611.method8213("commands - This command");
				Static611.method8213("cls - Clear console");
				Static611.method8213("displayfps - Toggle FPS and other information");
				Static611.method8213("renderer - Print graphics renderer information");
				Static611.method8213("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static331.anInt6012 = 0;
				Static206.anInt3291 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static451.aBoolean575 = !Static451.aBoolean575;
				if (Static451.aBoolean575) {
					Static611.method8213("FPS on");
					return;
				}
				Static611.method8213("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(67) Class300 local67 = Static563.aClass143_13.method6248();
				Static611.method8213("Vendor: " + local67.anInt8494);
				Static611.method8213("Name: " + local67.aString89);
				Static611.method8213("Version: " + local67.anInt8491);
				Static611.method8213("Device: " + local67.aString90);
				Static611.method8213("Driver Version: " + local67.aLong262);
				return;
			}
			if (arg1.equals("heap")) {
				Static611.method8213("Heap: " + Static126.anInt2180 + "MB");
				return;
			}
		} catch (@Pc(135) Exception local135) {
			Static611.method8213(Static49.aClass42_2.method730(Static259.anInt4113));
			return;
		}
		if (Static71.aClass267_2 != Static99.aClass267_3 || Static281.anInt4403 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static611.method8213("FPS: " + Static581.anInt9565);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static649.aBoolean743 = !Static649.aBoolean743;
					if (!Static649.aBoolean743) {
						Static611.method8213("Occlsion now off!");
						return;
					}
					Static611.method8213("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static451.aBoolean575 = true;
					Static611.method8213("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static451.aBoolean575 = false;
					Static611.method8213("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static611.method8213("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static87.aClass5_Sub30_1.anInt4369 + "Mb");
						return;
					} catch (@Pc(243) Throwable local243) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static261.aClass102_2.method2053();
					Static611.method8213("Text coords cleared");
					return;
				}
				@Pc(280) int local280;
				@Pc(263) int local263;
				@Pc(271) Runtime local271;
				if (arg1.equalsIgnoreCase("gc")) {
					Static345.method5206();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local271 = Runtime.getRuntime();
					local280 = (int) ((local271.totalMemory() - local271.freeMemory()) / 1024L);
					Static611.method8213("mem=" + local280 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static345.method5206();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local271 = Runtime.getRuntime();
					local280 = (int) ((local271.totalMemory() - local271.freeMemory()) / 1024L);
					Static611.method8213("Memory before cleanup=" + local280 + "k");
					Static379.method5102();
					Static345.method5206();
					for (@Pc(334) int local334 = 0; local334 < 10; local334++) {
						System.gc();
					}
					local280 = (int) ((local271.totalMemory() - local271.freeMemory()) / 1024L);
					Static611.method8213("Memory after cleanup=" + local280 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static611.method8213(Static43.method610() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static611.method8213("Dropped client connection");
					if (Static539.anInt8853 == 10) {
						Static360.method5289();
					} else if (Static539.anInt8853 == 11) {
						Static396.aBoolean496 = true;
						return;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static6.aClass365_1.method8293();
					Static611.method8213("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static589.aClass288_3.method7051();
					Static611.method8213("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static589.aClass288_3.method7053();
					Static611.method8213("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static150.aClass202_2.method4723();
					Static537.aClass240_34.method5657();
					Static589.aClass288_3.method7048();
					Static611.method8213("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static12.method8633();
					Static191.method2757();
					Static611.method8213("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static307.aLong157 = Static124.method1947();
					Static360.aBoolean457 = true;
					Static12.method8633();
					Static191.method2757();
					Static611.method8213("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static113.method1830(-1, 1, -1, false);
					if (Static581.method7952() == 1) {
						Static611.method8213("wm1 succeeded");
						return;
					}
					Static611.method8213("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static113.method1830(-1, 2, -1, false);
					if (Static581.method7952() == 2) {
						Static611.method8213("wm2 succeeded");
						return;
					}
					Static611.method8213("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static113.method1830(1024, 3, 768, false);
					if (Static581.method7952() != 3) {
						Static611.method8213("wm3 failed");
						return;
					}
					Static611.method8213("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static75.method1101(false, 0);
					if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 0) {
						Static611.method8213("Failed to enter tk0");
						return;
					}
					Static611.method8213("Entered tk0");
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 0);
					Static185.method2703();
					Static97.aBoolean118 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static75.method1101(false, 1);
					if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 1) {
						Static611.method8213("Failed to enter tk1");
						return;
					}
					Static611.method8213("Entered tk1");
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 1);
					Static185.method2703();
					Static97.aBoolean118 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static75.method1101(false, 2);
					if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 2) {
						Static611.method8213("Failed to enter tk2");
						return;
					}
					Static611.method8213("Entered tk2");
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 2);
					Static185.method2703();
					Static97.aBoolean118 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static75.method1101(false, 3);
					if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 3) {
						Static611.method8213("Entered tk3");
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 3);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					Static611.method8213("Failed to enter tk3");
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static75.method1101(false, 5);
					if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 5) {
						Static611.method8213("Entered tk5");
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, 5);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					Static611.method8213("Failed to enter tk5");
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static611.method8213("Invalid buildarea value");
						return;
					}
					local263 = Static171.method2534(arg1.substring(6));
					if (local263 >= 0 && local263 <= Static34.method450(Static126.anInt2180)) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub11_1, local263);
						Static185.method2703();
						Static97.aBoolean118 = false;
						Static611.method8213("maxbuildarea=" + Static655.aClass5_Sub36_29.aClass2_Sub11_1.method5016());
						return;
					}
					Static611.method8213("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static611.method8213("Invalid rect_debug value");
						return;
					}
					Static325.anInt5947 = Static171.method2534(arg1.substring(10).trim());
					Static611.method8213("rect_debug=" + Static325.anInt5947);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static292.aBoolean301 = true;
					Static611.method8213("qa_op_test=" + Static292.aBoolean301);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static489.aBoolean607 = !Static489.aBoolean607;
					Static611.method8213("clipcomponents=" + Static489.aBoolean607);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(840) boolean local840 = Static563.aClass143_13.method6224();
					if (!Static178.method2617(!local840)) {
						Static611.method8213("Failed to enable bloom");
						return;
					}
					if (!local840) {
						Static611.method8213("Bloom enabled");
						return;
					}
					Static611.method8213("Bloom disabled");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static67.aBoolean65) {
						Static67.aBoolean65 = true;
						Static611.method8213("Forced tweening ENABLED!");
						return;
					}
					Static67.aBoolean65 = false;
					Static611.method8213("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static464.aBoolean585) {
						Static611.method8213("Shift-click disabled.");
						Static464.aBoolean585 = false;
						return;
					}
					Static611.method8213("Shift-click ENABLED!");
					Static464.aBoolean585 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static611.method8213("x:" + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9) + " z:" + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static611.method8213("Height: " + Static298.aClass88Array3[Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149].method8749(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static471.aClass50_136.method895();
					Static471.aClass50_136.method903();
					Static40.aClass161_1.method3451();
					Static299.aClass218_1.method5158();
					Static191.method2757();
					Static611.method8213("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static563.aClass143_13.method6234()) {
						Static611.method8213("Current toolkit doesn't support multiple cores");
						return;
					}
					local263 = Integer.parseInt(arg1.substring(3));
					if (local263 < 1) {
						local263 = 1;
					} else if (local263 > 4) {
						local263 = 4;
					}
					Static102.anInt1809 = local263;
					Static12.method8633();
					Static611.method8213("Render cores now: " + Static102.anInt1809);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static611.method8213("I(s): " + Static451.aClass265_50.method6574() + "/" + Static451.aClass265_50.method6576());
					Static611.method8213("I(m): " + Static493.aClass265_54.method6574() + "/" + Static493.aClass265_54.method6576());
					Static611.method8213("O(s): " + Static259.aClass135_1.aClass51_1.method939() + "/" + Static259.aClass135_1.aClass51_1.method928());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static611.method8213("Pos: " + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 + "," + (Static454.anInt7910 + (Static570.anInt9347 >> 9) >> 6) + "," + (Static48.anInt750 + (Static105.anInt1868 >> 9) >> 6) + "," + (Static454.anInt7910 + (Static570.anInt9347 >> 9) & 0x3F) + "," + ((Static105.anInt1868 >> 9) + Static48.anInt750 & 0x3F) + " Height: " + (Static161.method1246(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149, Static105.anInt1868, Static570.anInt9347) - Static546.anInt8938));
					Static611.method8213("Look: " + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 + "," + (Static454.anInt7910 + Static345.anInt6197 >> 6) + "," + (Static48.anInt750 + Static144.anInt10373 >> 6) + "," + (Static345.anInt6197 + Static454.anInt7910 & 0x3F) + "," + (Static48.anInt750 + Static144.anInt10373 & 0x3F) + " Height: " + (Static161.method1246(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149, Static144.anInt10373, Static345.anInt6197) - Static310.anInt5525));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static433.aBoolean559 = !Static433.aBoolean559;
					Static563.aClass143_13.method6197(Static433.aBoolean559);
					Static365.method5375();
					Static611.method8213("showprofiling=" + Static433.aBoolean559);
					return;
				}
				@Pc(1237) String[] local1237;
				@Pc(1228) int local1228;
				if (arg1.startsWith("performancetest")) {
					local263 = -1;
					local1228 = 1000;
					if (arg1.length() > 15) {
						local1237 = Static466.method6897(' ', arg1);
						try {
							if (local1237.length > 1) {
								local1228 = Integer.parseInt(local1237[1]);
							}
						} catch (@Pc(1250) Throwable local1250) {
						}
						try {
							if (local1237.length > 2) {
								local263 = Integer.parseInt(local1237[2]);
							}
						} catch (@Pc(1263) Throwable local1263) {
						}
					}
					if (local263 == -1) {
						Static611.method8213("Java toolkit: " + Static595.method8078(0, local1228));
						Static611.method8213("SSE toolkit:  " + Static595.method8078(2, local1228));
						Static611.method8213("D3D toolkit:  " + Static595.method8078(3, local1228));
						Static611.method8213("GL toolkit:   " + Static595.method8078(1, local1228));
						Static611.method8213("GLX toolkit:  " + Static595.method8078(5, local1228));
						return;
					}
					Static611.method8213("Performance: " + Static595.method8078(local263, local1228));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static210.aBoolean233 = !Static210.aBoolean233;
					Static611.method8213("nonpcs=" + Static210.aBoolean233);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static633.method8422();
					Static611.method8213("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local263 = Integer.parseInt(arg1.substring(12));
					Static66.method953(local263, Static401.method5878(local263).aString34);
					Static611.method8213("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static611.method8213("w: " + Static6.aClass365_1.anInt9973);
					return;
				}
				@Pc(1416) Class5_Sub16 local1416;
				if (arg1.startsWith("pc")) {
					local1416 = Static455.method6717(Static650.aClass187_110, aClass332_8);
					local1416.aClass5_Sub15_Sub2_1.method3651(0);
					local1228 = local1416.aClass5_Sub15_Sub2_1.anInt4144;
					local280 = arg1.indexOf(" ", 4);
					local1416.aClass5_Sub15_Sub2_1.method3680(arg1.substring(3, local280));
					Static60.method886(arg1.substring(local280), local1416.aClass5_Sub15_Sub2_1);
					local1416.aClass5_Sub15_Sub2_1.method3649(local1416.aClass5_Sub15_Sub2_1.anInt4144 - local1228);
					Static479.method7038(local1416);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static267.method3773();
					Static611.method8213("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local263 = 0; local263 < Static205.anIntArray184.length; local263++) {
						if (Static155.aBooleanArray3[local263]) {
							Static205.anIntArray184[local263] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static205.anIntArray184[local263] *= -1;
							}
						}
					}
					Static267.method3773();
					Static611.method8213("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static279.aBoolean290 = true;
					Static191.method2757();
					Static611.method8213("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static279.aBoolean290 = false;
					Static191.method2757();
					Static611.method8213("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static422.method6420();
					Static611.method8213("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static611.method8213(Static79.method1209() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local263 = Integer.parseInt(arg1.substring(17));
					Static611.method8213("varpbit=" + Static413.aClass63_1.method1213(local263));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local263 = Integer.parseInt(arg1.substring(14));
					Static611.method8213("varp=" + Static413.aClass63_1.method1214(local263));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1619) String[] local1619 = Static466.method6897(' ', arg1.substring(12));
					if (local1619.length >= 2) {
						local1228 = local1619.length <= 2 ? 0 : Integer.parseInt(local1619[2]);
						Static15.method252(local1619[1], local1619[0], local1228);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static497.method7208();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static497.method7215();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static497.method7215();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local263 = Integer.parseInt(arg1.substring(8));
					Static563.aClass143_13.method6230(local263);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static611.method8213("Active streams: " + Static229.aClass5_Sub14_Sub3_1.method2295());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static448.method6653();
					Static611.method8213("Complete. Toolkit now: " + Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static611.method8213(Static437.aClient1.method1248());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static308.aString53.startsWith("win")) {
						Static588.method8005(new File("C:\\Temp\\heap.dump"));
					} else {
						Static588.method8005(new File("/tmp/heap.dump"));
					}
					Static611.method8213("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static611.method8213("Name: " + Static308.aString53);
					Static611.method8213("Arch: " + Static308.aString52);
					Static611.method8213("Ver: " + Static308.aString51);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local263 = Integer.parseInt(arg1.substring(8, 9));
					Static90.anInt1507 = local263;
					Static12.method8633();
					Static611.method8213("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local263 = arg1.indexOf(32);
					if (local263 < 0) {
						Static611.method8213("Syntax: ortho <n>");
						return;
					}
					local1228 = Static171.method2534(arg1.substring(local263 + 1));
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub22_1, local1228);
					Static185.method2703();
					Static97.aBoolean118 = false;
					Static90.method1397();
					if (local1228 == Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578()) {
						Static611.method8213("Successfully changed ortho mode");
						return;
					}
					Static611.method8213("Failed to change ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578() == 0) {
						Static611.method8213("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local263 = Static171.method2534(arg1.substring(arg1.indexOf(32) + 1));
					Static663.anInt10392 = local263;
					Static611.method8213("orthozoom=" + Static663.anInt10392);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local263 = Static171.method2534(arg1.substring(arg1.indexOf(32) + 1));
					Static431.anInt7605 = local263;
					Static135.anInt2261 = local263;
					Static611.method8213("ortho tile size=" + local263);
					Static90.method1397();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static656.aBoolean750 = !Static656.aBoolean750;
					Static611.method8213("ortho camera lock is " + (Static656.aBoolean750 ? "on" : "off"));
					return;
				}
				@Pc(1958) File local1958;
				if (arg1.startsWith("setoutput ")) {
					local1958 = new File(arg1.substring(10));
					if (local1958.exists()) {
						local1958 = new File(arg1.substring(10) + "." + Static124.method1947() + ".log");
						if (local1958.exists()) {
							Static611.method8213("file already exists!");
							return;
						}
					}
					if (Static162.aFileOutputStream6 != null) {
						Static162.aFileOutputStream6.close();
						Static162.aFileOutputStream6 = null;
					}
					try {
						Static162.aFileOutputStream6 = new FileOutputStream(local1958);
						return;
					} catch (@Pc(2000) FileNotFoundException local2000) {
						Static611.method8213("Could not create " + local1958.getName());
						return;
					} catch (@Pc(2012) SecurityException local2012) {
						Static611.method8213("Cannot write to " + local1958.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static162.aFileOutputStream6 != null) {
						Static162.aFileOutputStream6.close();
					}
					Static162.aFileOutputStream6 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local1958 = new File(arg1.substring(10));
					if (!local1958.exists()) {
						Static611.method8213("No such file");
						return;
					}
					@Pc(2056) byte[] local2056 = Static598.method8100(local1958);
					if (local2056 == null) {
						Static611.method8213("Failed to read file");
						return;
					}
					local1237 = Static466.method6897('\n', Static333.method5133(Static562.method7685(local2056), ""));
					Static128.method2000(local1237);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2087) short local2087 = (short) Static171.method2534(arg1.substring(5));
					if (local2087 > 0) {
						Static242.aShort113 = local2087;
					}
					return;
				}
				if (Static539.anInt8853 == 10) {
					local1416 = Static455.method6717(Static26.aClass187_6, aClass332_8);
					local1416.aClass5_Sub15_Sub2_1.method3651(arg1.length() + 3);
					local1416.aClass5_Sub15_Sub2_1.method3651(arg0 ? 1 : 0);
					local1416.aClass5_Sub15_Sub2_1.method3651(arg2 ? 1 : 0);
					local1416.aClass5_Sub15_Sub2_1.method3680(arg1);
					Static479.method7038(local1416);
				}
				if (arg1.startsWith("fps ") && Static99.aClass267_3 != Static71.aClass267_2) {
					Static242.method8206(Static171.method2534(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2156) Exception local2156) {
				Static611.method8213(Static49.aClass42_2.method730(Static259.anInt4113));
				return;
			}
		}
		if (Static539.anInt8853 != 10) {
			Static611.method8213(Static49.aClass42_3.method730(Static259.anInt4113) + arg1);
		}
	}
}
