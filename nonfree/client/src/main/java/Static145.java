import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!er", name = "gb", descriptor = "Lclient!hu;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/lang/String;ZZ)V")
	public static void method2526(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static339.method5160("commands - This command");
				Static339.method5160("cls - Clear console");
				Static339.method5160("displayfps - Toggle FPS and other information");
				Static339.method5160("renderer - Print graphics renderer information");
				Static339.method5160("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static392.anInt10294 = 0;
				Static275.anInt6800 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static408.aBoolean526 = !Static408.aBoolean526;
				if (Static408.aBoolean526) {
					Static339.method5160("FPS on");
					return;
				}
				Static339.method5160("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(65) Class18 local65 = Static582.aClass16_12.method8193();
				Static339.method5160("Vendor: " + local65.anInt679);
				Static339.method5160("Name: " + local65.aString5);
				Static339.method5160("Version: " + local65.anInt680);
				Static339.method5160("Device: " + local65.aString6);
				Static339.method5160("Driver Version: " + local65.aLong7);
				return;
			}
			if (arg0.equals("heap")) {
				Static339.method5160("Heap: " + Static595.anInt9375 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static339.method5160(Static569.aClass335_2.method7694(Static319.anInt5939));
			return;
		}
		if (Static216.aClass309_6 != Static229.aClass309_8 || Static13.anInt164 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static339.method5160("FPS: " + Static3.anInt18);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static44.aBoolean107 = !Static44.aBoolean107;
					if (!Static44.aBoolean107) {
						Static339.method5160("Occlsion now off!");
						return;
					}
					Static339.method5160("Occlsion now on!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static408.aBoolean526 = true;
					Static339.method5160("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static408.aBoolean526 = false;
					Static339.method5160("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static339.method5160("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static447.aClass3_Sub34_1.anInt6531 + "Mb");
						return;
					} catch (@Pc(241) Throwable local241) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static408.aClass105_9.method2445();
					Static339.method5160("Text coords cleared");
					return;
				}
				@Pc(282) int local282;
				@Pc(261) int local261;
				@Pc(272) Runtime local272;
				if (arg0.equalsIgnoreCase("gc")) {
					Static4.method44();
					for (local261 = 0; local261 < 10; local261++) {
						System.gc();
					}
					local272 = Runtime.getRuntime();
					local282 = (int) ((local272.totalMemory() - local272.freeMemory()) / 1024L);
					Static339.method5160("mem=" + local282 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static4.method44();
					for (local261 = 0; local261 < 10; local261++) {
						System.gc();
					}
					local272 = Runtime.getRuntime();
					local282 = (int) ((local272.totalMemory() - local272.freeMemory()) / 1024L);
					Static339.method5160("Memory before cleanup=" + local282 + "k");
					Static469.method6704();
					Static4.method44();
					for (@Pc(337) int local337 = 0; local337 < 10; local337++) {
						System.gc();
					}
					local282 = (int) ((local272.totalMemory() - local272.freeMemory()) / 1024L);
					Static339.method5160("Memory after cleanup=" + local282 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static339.method5160(Static340.method5164() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static339.method5160("Dropped client connection");
					if (Static520.anInt6836 == 10) {
						Static344.method5200();
						return;
					}
					if (Static520.anInt6836 == 11) {
						Static5.aBoolean10 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static605.aClass161_7.method3709();
					Static339.method5160("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static600.aClass366_3.method8104();
					Static339.method5160("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static600.aClass366_3.method8102();
					Static339.method5160("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static499.aClass231_4.method5293();
					Static673.aClass160_3.method3505();
					Static600.aClass366_3.method8106();
					Static339.method5160("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static230.method3703();
					Static542.method7494();
					Static339.method5160("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static513.aLong254 = Static131.method2268();
					Static21.aBoolean66 = true;
					Static230.method3703();
					Static542.method7494();
					Static339.method5160("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static211.method8142(-1, 1, -1, false);
					if (Static545.method7549() == 1) {
						Static339.method5160("wm1 succeeded");
						return;
					}
					Static339.method5160("wm1 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static211.method8142(-1, 2, -1, false);
					if (Static545.method7549() != 2) {
						Static339.method5160("wm2 failed");
						return;
					}
					Static339.method5160("wm2 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static211.method8142(768, 3, 1024, false);
					if (Static545.method7549() == 3) {
						Static339.method5160("wm3 succeeded");
						return;
					}
					Static339.method5160("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static422.method6016(false, 0);
					if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 0) {
						Static339.method5160("Entered tk0");
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 0);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					Static339.method5160("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static422.method6016(false, 1);
					if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 1) {
						Static339.method5160("Failed to enter tk1");
						return;
					}
					Static339.method5160("Entered tk1");
					Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 1);
					Static57.method6341();
					Static411.aBoolean527 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static422.method6016(false, 2);
					if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 2) {
						Static339.method5160("Failed to enter tk2");
						return;
					}
					Static339.method5160("Entered tk2");
					Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 2);
					Static57.method6341();
					Static411.aBoolean527 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static422.method6016(false, 3);
					if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 3) {
						Static339.method5160("Entered tk3");
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 3);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					Static339.method5160("Failed to enter tk3");
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static422.method6016(false, 5);
					if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 5) {
						Static339.method5160("Entered tk5");
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 5);
						Static57.method6341();
						Static411.aBoolean527 = false;
						return;
					}
					Static339.method5160("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static339.method5160("Invalid buildarea value");
						return;
					}
					local261 = Static305.method4695(arg0.substring(6));
					if (local261 >= 0 && Static595.method7959(Static595.anInt9375) >= local261) {
						Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub14_1, local261);
						Static57.method6341();
						Static411.aBoolean527 = false;
						Static339.method5160("maxbuildarea=" + Static227.aClass3_Sub15_11.aClass17_Sub14_1.method4653());
						return;
					}
					Static339.method5160("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static339.method5160("Invalid rect_debug value");
						return;
					}
					Static339.anInt6143 = Static305.method4695(arg0.substring(10).trim());
					Static339.method5160("rect_debug=" + Static339.anInt6143);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static605.aBoolean708 = true;
					Static339.method5160("qa_op_test=" + Static605.aBoolean708);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static650.aBoolean739 = !Static650.aBoolean739;
					Static339.method5160("clipcomponents=" + Static650.aBoolean739);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(844) boolean local844 = Static582.aClass16_12.method8186();
					if (!Static455.method6554(!local844)) {
						Static339.method5160("Failed to enable bloom");
						return;
					}
					if (!local844) {
						Static339.method5160("Bloom enabled");
						return;
					}
					Static339.method5160("Bloom disabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (Static296.aBoolean620) {
						Static296.aBoolean620 = false;
						Static339.method5160("Forced tweening disabled.");
						return;
					}
					Static296.aBoolean620 = true;
					Static339.method5160("Forced tweening ENABLED!");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static381.aBoolean509) {
						Static339.method5160("Shift-click disabled.");
						Static381.aBoolean509 = false;
						return;
					}
					Static339.method5160("Shift-click ENABLED!");
					Static381.aBoolean509 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static339.method5160("x:" + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9) + " z:" + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static339.method5160("Height: " + Static343.aClass104Array2[Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142].method8279(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static235.aClass143_57.method3142();
					Static235.aClass143_57.method3141();
					Static453.aClass116_2.method2726();
					Static661.aClass321_4.method7486();
					Static542.method7494();
					Static339.method5160("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static582.aClass16_12.method8179()) {
						local261 = Integer.parseInt(arg0.substring(3));
						if (local261 < 1) {
							local261 = 1;
						} else if (local261 > 4) {
							local261 = 4;
						}
						Static188.anInt3451 = local261;
						Static230.method3703();
						Static339.method5160("Render cores now: " + Static188.anInt3451);
						return;
					}
					Static339.method5160("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static339.method5160("I(s): " + Static428.aClass279_39.method6634() + "/" + Static428.aClass279_39.method6629());
					Static339.method5160("I(m): " + Static81.aClass279_9.method6634() + "/" + Static81.aClass279_9.method6629());
					Static339.method5160("O(s): " + Static237.aClass371_2.aClass192_1.method4418() + "/" + Static237.aClass371_2.aClass192_1.method4421());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static339.method5160("Pos: " + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 + "," + (Static417.anInt7047 + (Static97.anInt2082 >> 9) >> 6) + "," + ((Static663.anInt10236 >> 9) + Static347.anInt7851 >> 6) + "," + (Static417.anInt7047 + (Static97.anInt2082 >> 9) & 0x3F) + "," + (Static347.anInt7851 + (Static663.anInt10236 >> 9) & 0x3F) + " Height: " + (Static194.method5133(Static97.anInt2082, Static663.anInt10236, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) - Static265.anInt9363));
					Static339.method5160("Look: " + Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 + "," + (Static417.anInt7047 + Static409.anInt6761 >> 6) + "," + (Static347.anInt7851 + Static108.anInt2245 >> 6) + "," + (Static409.anInt6761 + Static417.anInt7047 & 0x3F) + "," + (Static347.anInt7851 + Static108.anInt2245 & 0x3F) + " Height: " + (Static194.method5133(Static409.anInt6761, Static108.anInt2245, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) - Static404.anInt6908));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static311.aBoolean452 = !Static311.aBoolean452;
					Static582.aClass16_12.method8125(Static311.aBoolean452);
					Static376.method5543();
					Static339.method5160("showprofiling=" + Static311.aBoolean452);
					return;
				}
				@Pc(1242) String[] local1242;
				@Pc(1233) int local1233;
				if (arg0.startsWith("performancetest")) {
					local261 = -1;
					local1233 = 1000;
					if (arg0.length() > 15) {
						local1242 = Static325.method5062(arg0, ' ');
						try {
							if (local1242.length > 1) {
								local1233 = Integer.parseInt(local1242[1]);
							}
						} catch (@Pc(1253) Throwable local1253) {
						}
						try {
							if (local1242.length > 2) {
								local261 = Integer.parseInt(local1242[2]);
							}
						} catch (@Pc(1264) Throwable local1264) {
						}
					}
					if (local261 != -1) {
						Static339.method5160("Performance: " + Static671.method8691(local261, local1233));
						return;
					}
					Static339.method5160("Java toolkit: " + Static671.method8691(0, local1233));
					Static339.method5160("SSE toolkit:  " + Static671.method8691(2, local1233));
					Static339.method5160("D3D toolkit:  " + Static671.method8691(3, local1233));
					Static339.method5160("GL toolkit:   " + Static671.method8691(1, local1233));
					Static339.method5160("GLX toolkit:  " + Static671.method8691(5, local1233));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static592.aBoolean196 = !Static592.aBoolean196;
					Static339.method5160("nonpcs=" + Static592.aBoolean196);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static98.method1957();
					Static339.method5160("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local261 = Integer.parseInt(arg0.substring(12));
					Static447.method6464(Static59.method1456(local261).aString130, local261);
					Static339.method5160("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static339.method5160("w: " + Static605.aClass161_7.anInt4423);
					return;
				}
				@Pc(1418) Class3_Sub44 local1418;
				if (arg0.startsWith("pc")) {
					local1418 = Static275.method5689(Static510.aClass376_122, Static540.aClass282_4);
					local1418.aClass3_Sub17_Sub2_3.method4849(0);
					local1233 = local1418.aClass3_Sub17_Sub2_3.lb;
					local282 = arg0.indexOf(" ", 4);
					local1418.aClass3_Sub17_Sub2_3.method4878(arg0.substring(3, local282));
					Static61.method1525(local1418.aClass3_Sub17_Sub2_3, arg0.substring(local282));
					local1418.aClass3_Sub17_Sub2_3.method4873(local1418.aClass3_Sub17_Sub2_3.lb - local1233);
					Static616.method8089(local1418);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static540.method6275();
					Static339.method5160("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local261 = 0; local261 < Static79.anIntArray121.length; local261++) {
						if (Static440.aBooleanArray22[local261]) {
							Static79.anIntArray121[local261] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static79.anIntArray121[local261] *= -1;
							}
						}
					}
					Static540.method6275();
					Static339.method5160("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static251.aBoolean372 = true;
					Static542.method7494();
					Static339.method5160("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static251.aBoolean372 = false;
					Static542.method7494();
					Static339.method5160("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static389.method5059();
					Static339.method5160("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static339.method5160(Static424.method6048() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local261 = Integer.parseInt(arg0.substring(17));
					Static339.method5160("varpbit=" + Static592.aClass47_2.method1430(local261));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local261 = Integer.parseInt(arg0.substring(14));
					Static339.method5160("varp=" + Static592.aClass47_2.method1429(local261));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1621) String[] local1621 = Static325.method5062(arg0.substring(12), ' ');
					if (local1621.length >= 2) {
						local1233 = local1621.length > 2 ? Integer.parseInt(local1621[2]) : 0;
						Static351.method5277(local1621[1], local1233, local1621[0]);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static543.method7503();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static543.method7509();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static543.method7509();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local261 = Integer.parseInt(arg0.substring(8));
					Static582.aClass16_12.method8114(local261);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static339.method5160("Active streams: " + Static557.aClass3_Sub9_Sub1_2.method1425());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static473.method6803();
					Static339.method5160("Complete. Toolkit now: " + Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static339.method5160(Static487.aClient1.method1737());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static353.aString80.startsWith("win")) {
						Static22.method746(new File("C:\\Temp\\heap.dump"));
					} else {
						Static22.method746(new File("/tmp/heap.dump"));
					}
					Static339.method5160("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static339.method5160("Name: " + Static353.aString80);
					Static339.method5160("Arch: " + Static353.aString86);
					Static339.method5160("Ver: " + Static353.aString82);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local261 = Integer.parseInt(arg0.substring(8, 9));
					Static245.anInt4575 = local261;
					Static230.method3703();
					Static339.method5160("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local261 = arg0.indexOf(32);
					if (local261 < 0) {
						Static339.method5160("Syntax: ortho <n>");
						return;
					}
					local1233 = Static305.method4695(arg0.substring(local261 + 1));
					Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub16_1, local1233);
					Static57.method6341();
					Static411.aBoolean527 = false;
					Static566.method4437();
					if (Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569() != local1233) {
						Static339.method5160("Failed to change ortho mode");
						return;
					}
					Static339.method5160("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569() == 0) {
						Static339.method5160("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local261 = Static305.method4695(arg0.substring(arg0.indexOf(32) + 1));
					Static209.anInt10102 = local261;
					Static339.method5160("orthozoom=" + Static209.anInt10102);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local261 = Static305.method4695(arg0.substring(arg0.indexOf(32) + 1));
					Static675.anInt10315 = local261;
					Static633.anInt9772 = local261;
					Static339.method5160("ortho tile size=" + local261);
					Static566.method4437();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static207.aBoolean296 = !Static207.aBoolean296;
					Static339.method5160("ortho camera lock is " + (Static207.aBoolean296 ? "on" : "off"));
					return;
				}
				@Pc(1964) File local1964;
				if (arg0.startsWith("setoutput ")) {
					local1964 = new File(arg0.substring(10));
					if (local1964.exists()) {
						local1964 = new File(arg0.substring(10) + "." + Static131.method2268() + ".log");
						if (local1964.exists()) {
							Static339.method5160("file already exists!");
							return;
						}
					}
					if (Static540.aFileOutputStream3 != null) {
						Static540.aFileOutputStream3.close();
						Static540.aFileOutputStream3 = null;
					}
					try {
						Static540.aFileOutputStream3 = new FileOutputStream(local1964);
						return;
					} catch (@Pc(2006) FileNotFoundException local2006) {
						Static339.method5160("Could not create " + local1964.getName());
						return;
					} catch (@Pc(2018) SecurityException local2018) {
						Static339.method5160("Cannot write to " + local1964.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static540.aFileOutputStream3 != null) {
						Static540.aFileOutputStream3.close();
					}
					Static540.aFileOutputStream3 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local1964 = new File(arg0.substring(10));
					if (!local1964.exists()) {
						Static339.method5160("No such file");
						return;
					}
					@Pc(2062) byte[] local2062 = Static42.method1222(local1964);
					if (local2062 == null) {
						Static339.method5160("Failed to read file");
						return;
					}
					local1242 = Static325.method5062(Static529.method7391("", Static506.method7176(local2062)), '\n');
					Static149.method2574(local1242);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2093) short local2093 = (short) Static305.method4695(arg0.substring(5));
					if (local2093 > 0) {
						Static155.aShort36 = local2093;
					}
					return;
				}
				if (Static520.anInt6836 == 10) {
					local1418 = Static275.method5689(Static30.aClass376_6, Static540.aClass282_4);
					local1418.aClass3_Sub17_Sub2_3.method4849(arg0.length() + 3);
					local1418.aClass3_Sub17_Sub2_3.method4849(arg2 ? 1 : 0);
					local1418.aClass3_Sub17_Sub2_3.method4849(arg1 ? 1 : 0);
					local1418.aClass3_Sub17_Sub2_3.method4878(arg0);
					Static616.method8089(local1418);
				}
				if (arg0.startsWith("fps ") && Static216.aClass309_6 != Static229.aClass309_8) {
					Static326.method5079(Static305.method4695(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2165) Exception local2165) {
				Static339.method5160(Static569.aClass335_2.method7694(Static319.anInt5939));
				return;
			}
		}
		if (Static520.anInt6836 != 10) {
			Static339.method5160(Static569.aClass335_3.method7694(Static319.anInt5939) + arg0);
		}
	}
}
