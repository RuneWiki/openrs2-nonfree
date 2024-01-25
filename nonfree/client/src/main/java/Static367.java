import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "[I")
	public static final int[] anIntArray340 = new int[2048];

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5510(@OriginalArg(0) String arg0) {
		@Pc(5) String local5 = null;
		@Pc(18) int local18 = arg0.indexOf("--> ");
		if (local18 >= 0) {
			local5 = arg0.substring(0, local18 + 4);
			arg0 = arg0.substring(local18 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(50) int local50 = arg0.indexOf(" ", "directlogin ".length());
			if (local50 >= 0) {
				@Pc(58) int local58 = arg0.length();
				arg0 = arg0.substring(0, local50) + " ";
				for (@Pc(74) int local74 = local50 + 1; local74 < local58; local74++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local5 == null ? arg0 : local5 + arg0;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B[B)Z")
	public static boolean method5513(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class14_Sub21 local15 = new Class14_Sub21(arg0);
		@Pc(19) int local19 = local15.method7695(119);
		if (local19 != 2) {
			return false;
		}
		@Pc(39) boolean local39 = local15.method7695(94) == 1;
		if (local39) {
			Static87.method1438(local15);
		}
		Static158.method2258(local15);
		return true;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method5514(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			label723: {
				if (!arg2.equalsIgnoreCase("commands") && !arg2.equalsIgnoreCase("help")) {
					if (arg2.equalsIgnoreCase("cls")) {
						Static411.anInt7100 = 0;
						Static46.anInt765 = 0;
						return;
					}
					if (arg2.equalsIgnoreCase("displayfps")) {
						Static432.aBoolean511 = !Static432.aBoolean511;
						if (Static432.aBoolean511) {
							Static590.method8398("FPS on");
							return;
						}
						Static590.method8398("FPS off");
						return;
					}
					if (!arg2.equals("renderer")) {
						if (arg2.equals("heap")) {
							Static590.method8398("Heap: " + Static360.anInt6168 + "MB");
							return;
						}
						break label723;
					}
					@Pc(93) Class35 local93 = Static103.aClass144_3.method6960();
					Static590.method8398("Vendor: " + local93.anInt653);
					Static590.method8398("Name: " + local93.aString16);
					Static590.method8398("Version: " + local93.anInt654);
					Static590.method8398("Device: " + local93.aString17);
					Static590.method8398("Driver Version: " + local93.aLong30);
					return;
				}
				Static590.method8398("commands - This command");
				Static590.method8398("cls - Clear console");
				Static590.method8398("displayfps - Toggle FPS and other information");
				Static590.method8398("renderer - Print graphics renderer information");
				Static590.method8398("heap - Print java memory information");
				return;
			}
		} catch (@Pc(178) Exception local178) {
			Static590.method8398(Class21.lb.method324(Static26.anInt352));
			return;
		}
		if (Static548.aClass59_10 != Static115.aClass59_4 || Static469.anInt11068 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static590.method8398("FPS: " + Static485.anInt8396);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static413.aBoolean501 = !Static413.aBoolean501;
					if (!Static413.aBoolean501) {
						Static590.method8398("Occlsion now off!");
						return;
					}
					Static590.method8398("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static432.aBoolean511 = true;
					Static590.method8398("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static432.aBoolean511 = false;
					Static590.method8398("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static590.method8398("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static526.aClass14_Sub12_1.anInt1226 + "Mb");
						return;
					} catch (@Pc(331) Throwable local331) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static505.aClass283_12.method6797();
					Static590.method8398("Text coords cleared");
					return;
				}
				@Pc(376) int local376;
				@Pc(358) int local358;
				@Pc(366) Runtime local366;
				if (arg2.equalsIgnoreCase("gc")) {
					Static243.method4060();
					for (local358 = 0; local358 < 10; local358++) {
						System.gc();
					}
					local366 = Runtime.getRuntime();
					local376 = (int) ((local366.totalMemory() - local366.freeMemory()) / 1024L);
					Static590.method8398("mem=" + local376 + "k");
					return;
				}
				@Pc(441) int local441;
				if (arg2.equalsIgnoreCase("compact")) {
					Static243.method4060();
					for (local358 = 0; local358 < 10; local358++) {
						System.gc();
					}
					local366 = Runtime.getRuntime();
					local376 = (int) ((local366.totalMemory() - local366.freeMemory()) / 1024L);
					Static590.method8398("Memory before cleanup=" + local376 + "k");
					Static608.method8581();
					Static243.method4060();
					for (local441 = 0; local441 < 10; local441++) {
						System.gc();
					}
					local376 = (int) ((local366.totalMemory() - local366.freeMemory()) / 1024L);
					Static590.method8398("Memory after cleanup=" + local376 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static590.method8398(Static233.method3927() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static590.method8398("Dropped client connection");
					if (Static387.anInt9114 == 11) {
						Static486.method7340();
						return;
					}
					if (Static387.anInt9114 == 12) {
						Static277.aClass347_2.aBoolean662 = true;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static564.aClass357_4.method8506();
					Static590.method8398("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static685.aClass24_3.method366();
					Static590.method8398("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static685.aClass24_3.method370();
					Static590.method8398("Dropped server js5 net queue");
					return;
				}
				@Pc(587) int local587;
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static344.aClass173_5.method4233();
					@Pc(585) Class347[] local585 = Static277.aClass347Array1;
					for (local587 = 0; local587 < local585.length; local587++) {
						@Pc(592) Class347 local592 = local585[local587];
						if (local592.aClass278_2 != null) {
							local592.aClass278_2.method6648();
						}
					}
					Static685.aClass24_3.method378();
					Static590.method8398("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static535.method7899();
					Static563.method4401();
					Static590.method8398("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static146.aLong96 = Static26.method382();
					Static599.aBoolean681 = true;
					Static535.method7899();
					Static563.method4401();
					Static590.method8398("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static89.method8701(false, -1, 1, -1);
					if (Static141.method2141() != 1) {
						Static590.method8398("wm1 failed");
						return;
					}
					Static590.method8398("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static89.method8701(false, -1, 2, -1);
					if (Static141.method2141() != 2) {
						Static590.method8398("wm2 failed");
						return;
					}
					Static590.method8398("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static89.method8701(false, 768, 3, 1024);
					if (Static141.method2141() != 3) {
						Static590.method8398("wm3 failed");
						return;
					}
					Static590.method8398("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static459.method8986(false, 0);
					if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 0) {
						Static590.method8398("Failed to enter tk0");
						return;
					}
					Static590.method8398("Entered tk0");
					Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
					Static574.method8188();
					Static411.aBoolean499 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static459.method8986(false, 1);
					if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1) {
						Static590.method8398("Entered tk1");
						Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					Static590.method8398("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static459.method8986(false, 2);
					if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 2) {
						Static590.method8398("Entered tk2");
						Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					Static590.method8398("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static459.method8986(false, 3);
					if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 3) {
						Static590.method8398("Entered tk3");
						Static181.aClass14_Sub26_9.method5270(3, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
						Static574.method8188();
						Static411.aBoolean499 = false;
						return;
					}
					Static590.method8398("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static459.method8986(false, 5);
					if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 5) {
						Static590.method8398("Failed to enter tk5");
						return;
					}
					Static590.method8398("Entered tk5");
					Static181.aClass14_Sub26_9.method5270(5, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
					Static574.method8188();
					Static411.aBoolean499 = false;
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static590.method8398("Invalid buildarea value");
						return;
					}
					local358 = Static297.method4858(arg2.substring(6), -128);
					if (local358 >= 0 && local358 <= Static360.method5459(Static360.anInt6168)) {
						Static181.aClass14_Sub26_9.method5270(local358, Static181.aClass14_Sub26_9.aClass43_Sub29_1);
						Static574.method8188();
						Static411.aBoolean499 = false;
						Static590.method8398("maxbuildarea=" + Static181.aClass14_Sub26_9.aClass43_Sub29_1.method8277());
						return;
					}
					Static590.method8398("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static590.method8398("Invalid rect_debug value");
						return;
					}
					Static58.anInt983 = Static297.method4858(arg2.substring(10).trim(), -108);
					Static590.method8398("rect_debug=" + Static58.anInt983);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static123.aBoolean140 = true;
					Static590.method8398("qa_op_test=" + Static123.aBoolean140);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static461.aBoolean540 = !Static461.aBoolean540;
					Static590.method8398("clipcomponents=" + Static461.aBoolean540);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1134) boolean local1134 = Static103.aClass144_3.method6898();
					if (Static282.method4746(!local1134)) {
						if (local1134) {
							Static590.method8398("Bloom disabled");
							return;
						}
						Static590.method8398("Bloom enabled");
						return;
					}
					Static590.method8398("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static525.aBoolean629) {
						Static525.aBoolean629 = false;
						Static590.method8398("Forced tweening disabled.");
						return;
					}
					Static525.aBoolean629 = true;
					Static590.method8398("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static477.aBoolean585) {
						Static590.method8398("Shift-click disabled.");
						Static477.aBoolean585 = false;
						return;
					}
					Static590.method8398("Shift-click ENABLED!");
					Static477.aBoolean585 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static590.method8398("x:" + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9) + " z:" + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static590.method8398("Height: " + Static258.aClass159Array1[Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146].method8207(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 >> 9, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static99.aClass310_23.method7790();
					Static99.aClass310_23.method7789();
					Static94.aClass334_3.method8134();
					Static690.aClass274_7.method6615();
					Static563.method4401();
					Static590.method8398("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static103.aClass144_3.method6924()) {
						local358 = Integer.parseInt(arg2.substring(3));
						if (local358 < 1) {
							local358 = 1;
						} else if (local358 > 4) {
							local358 = 4;
						}
						Static106.anInt1837 = local358;
						Static535.method7899();
						Static590.method8398("Render cores now: " + Static106.anInt1837);
						return;
					}
					Static590.method8398("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static590.method8398("I(s): " + Static576.aClass317_65.method7881() + "/" + Static576.aClass317_65.method7877());
					Static590.method8398("I(m): " + Static472.aClass317_54.method7881() + "/" + Static472.aClass317_54.method7877());
					Static590.method8398("O(s): " + Static252.aClass56_1.aClass151_1.method3791() + "/" + Static252.aClass56_1.aClass151_1.method3789());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static590.method8398("Pos: " + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 + "," + ((Static70.anInt1085 >> 9) + Static36.anInt617 >> 6) + "," + ((Static229.anInt4393 >> 9) + Static550.anInt9242 >> 6) + "," + (Static36.anInt617 + (Static70.anInt1085 >> 9) & 0x3F) + "," + ((Static229.anInt4393 >> 9) + Static550.anInt9242 & 0x3F) + " Height: " + (Static388.method5919(Static229.anInt4393, Static70.anInt1085, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) - Static153.anInt2372));
					Static590.method8398("Look: " + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 + "," + (Static36.anInt617 + Static81.anInt1406 >> 6) + "," + (Static119.anInt1918 + Static550.anInt9242 >> 6) + "," + (Static81.anInt1406 + Static36.anInt617 & 0x3F) + "," + (Static119.anInt1918 + Static550.anInt9242 & 0x3F) + " Height: " + (Static388.method5919(Static119.anInt1918, Static81.anInt1406, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) - Static546.anInt10354));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static127.aBoolean780 = !Static127.aBoolean780;
					Static103.aClass144_3.method6954(Static127.aBoolean780);
					Static405.method6120();
					Static590.method8398("showprofiling=" + Static127.aBoolean780);
					return;
				}
				@Pc(1628) String[] local1628;
				if (arg2.startsWith("performancetest")) {
					local358 = -1;
					local587 = 1000;
					if (arg2.length() > 15) {
						local1628 = Static407.method2868(arg2, ' ');
						try {
							if (local1628.length > 1) {
								local587 = Integer.parseInt(local1628[1]);
							}
						} catch (@Pc(1639) Throwable local1639) {
						}
						try {
							if (local1628.length > 2) {
								local358 = Integer.parseInt(local1628[2]);
							}
						} catch (@Pc(1650) Throwable local1650) {
						}
					}
					if (local358 != -1) {
						Static590.method8398("Performance: " + Static12.method243(local587, local358));
						return;
					}
					Static590.method8398("Java toolkit: " + Static12.method243(local587, 0));
					Static590.method8398("SSE toolkit:  " + Static12.method243(local587, 2));
					Static590.method8398("D3D toolkit:  " + Static12.method243(local587, 3));
					Static590.method8398("GL toolkit:   " + Static12.method243(local587, 1));
					Static590.method8398("GLX toolkit:  " + Static12.method243(local587, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static548.aBoolean640 = !Static548.aBoolean640;
					Static590.method8398("nonpcs=" + Static548.aBoolean640);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static277.method4686();
					Static590.method8398("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local358 = Integer.parseInt(arg2.substring(12));
					Static332.method5147(local358, Static434.method6484(local358).aString57);
					Static590.method8398("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static590.method8398("w: " + Static564.aClass357_4.anInt9936);
					return;
				}
				if (arg2.startsWith("pc")) {
					@Pc(1838) Class347 local1838 = Static435.method6495();
					@Pc(1844) Class14_Sub54 local1844 = Static72.method1195(local1838.aClass197_2, Static252.aClass251_110);
					local1844.aClass14_Sub21_Sub2_2.method7747(0);
					local376 = local1844.aClass14_Sub21_Sub2_2.anInt8936;
					local441 = arg2.indexOf(" ", 4);
					local1844.aClass14_Sub21_Sub2_2.method7690(arg2.substring(3, local441));
					Static582.method8305(arg2.substring(local441), local1844.aClass14_Sub21_Sub2_2);
					local1844.aClass14_Sub21_Sub2_2.method7715(local1844.aClass14_Sub21_Sub2_2.anInt8936 - local376);
					local1838.method8308(local1844);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static32.method9346();
					Static590.method8398("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local358 = 0; local358 < Static184.anIntArray401.length; local358++) {
						if (Static195.aBooleanArray6[local358]) {
							Static184.anIntArray401[local358] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static184.anIntArray401[local358] *= -1;
							}
						}
					}
					Static32.method9346();
					Static590.method8398("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static196.aBoolean249 = true;
					Static563.method4401();
					Static590.method8398("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static196.aBoolean249 = false;
					Static563.method4401();
					Static590.method8398("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static419.method9119();
					Static590.method8398("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static590.method8398(Static346.method5277() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local358 = Integer.parseInt(arg2.substring(17));
					Static590.method8398("varpbit=" + Static188.aClass238_1.method5864(local358));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local358 = Integer.parseInt(arg2.substring(14));
					Static590.method8398("varp=" + Static188.aClass238_1.method5865(local358));
					return;
				}
				@Pc(2089) String[] local2089;
				if (arg2.startsWith("directlogin")) {
					local2089 = Static407.method2868(arg2.substring(12), ' ');
					if (local2089.length >= 2) {
						local587 = local2089.length <= 2 ? 0 : Integer.parseInt(local2089[2]);
						Static119.method1854(local2089[1], local2089[0], local587);
						return;
					}
				}
				if (arg2.startsWith("snlogin ")) {
					local2089 = Static407.method2868(arg2.substring(8), ' ');
					local587 = Integer.parseInt(local2089[0]);
					local376 = local2089.length == 2 ? Integer.parseInt(local2089[1]) : 0;
					Static55.method998(local587, local376);
					return;
				}
				if (arg2.startsWith("csprofileclear")) {
					Static672.method9303();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static672.method9297();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static672.method9297();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local358 = Integer.parseInt(arg2.substring(8));
					Static103.aClass144_3.method6911(local358);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static590.method8398("Active streams: " + Static196.aClass14_Sub1_Sub2_1.method1806());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static158.method2259();
					Static590.method8398("Complete. Toolkit now: " + Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static590.method8398(Static105.aClient4.method1350());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static251.aString65.startsWith("win")) {
						Static422.method6294(new File("C:\\Temp\\heap.dump"));
					} else {
						Static422.method6294(new File("/tmp/heap.dump"));
					}
					Static590.method8398("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static590.method8398("Name: " + Static251.aString65);
					Static590.method8398("Arch: " + Static251.aString61);
					Static590.method8398("Ver: " + Static251.aString59);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local358 = Integer.parseInt(arg2.substring(8, 9));
					Static327.anInt5650 = local358;
					Static535.method7899();
					Static590.method8398("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local358 = arg2.indexOf(32);
					if (local358 < 0) {
						Static590.method8398("Syntax: ortho <n>");
						return;
					}
					local587 = Static297.method4858(arg2.substring(local358 + 1), 101);
					Static181.aClass14_Sub26_9.method5270(local587, Static181.aClass14_Sub26_9.aClass43_Sub13_1);
					Static574.method8188();
					Static411.aBoolean499 = false;
					Static350.method5351();
					if (local587 == Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215()) {
						Static590.method8398("Successfully changed ortho mode");
						return;
					}
					Static590.method8398("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215() == 0) {
						Static590.method8398("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local358 = Static297.method4858(arg2.substring(arg2.indexOf(32) + 1), 105);
					Static481.anInt10751 = local358;
					Static590.method8398("orthozoom=" + Static481.anInt10751);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local358 = Static297.method4858(arg2.substring(arg2.indexOf(32) + 1), -121);
					Static379.anInt6681 = local358;
					Static451.anInt7533 = local358;
					Static590.method8398("ortho tile size=" + local358);
					Static350.method5351();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static420.aBoolean502 = !Static420.aBoolean502;
					Static590.method8398("ortho camera lock is " + (Static420.aBoolean502 ? "on" : "off"));
					return;
				}
				if (arg2.startsWith("skydetail ")) {
					local358 = Static297.method4858(arg2.substring(arg2.indexOf(32) + 1), -107);
					Static181.aClass14_Sub26_9.method5270(local358, Static181.aClass14_Sub26_9.aClass43_Sub10_1);
					Static590.method8398("skydetail is " + (Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3094() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2610) File local2610;
				if (arg2.startsWith("setoutput ")) {
					local2610 = new File(arg2.substring(10));
					if (local2610.exists()) {
						local2610 = new File(arg2.substring(10) + "." + Static26.method382() + ".log");
						if (local2610.exists()) {
							Static590.method8398("file already exists!");
							return;
						}
					}
					if (Static501.aFileOutputStream1 != null) {
						Static501.aFileOutputStream1.close();
						Static501.aFileOutputStream1 = null;
					}
					try {
						Static501.aFileOutputStream1 = new FileOutputStream(local2610);
						return;
					} catch (@Pc(2659) FileNotFoundException local2659) {
						Static590.method8398("Could not create " + local2610.getName());
						return;
					} catch (@Pc(2673) SecurityException local2673) {
						Static590.method8398("Cannot write to " + local2610.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static501.aFileOutputStream1 != null) {
						Static501.aFileOutputStream1.close();
					}
					Static501.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2610 = new File(arg2.substring(10));
					if (!local2610.exists()) {
						Static590.method8398("No such file");
						return;
					}
					@Pc(2730) byte[] local2730 = Static544.method8202(local2610);
					if (local2730 == null) {
						Static590.method8398("Failed to read file");
						return;
					}
					local1628 = Static407.method2868(Static648.method9081(Static35.method586(local2730), ""), '\n');
					Static23.method345(local1628);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2768) short local2768 = (short) Static297.method4858(arg2.substring(5), 108);
					if (local2768 > 0) {
						Static587.aShort102 = local2768;
					}
					return;
				}
				if (arg2.startsWith("cs2debug")) {
					if (arg2.length() > 9 && arg2.charAt(8) == ' ') {
						Static672.aString122 = arg2.substring(9);
						Static672.aBoolean765 = true;
						Static590.method8398("cs2debug: (" + Static672.aString122 + ")");
						return;
					}
					Static672.aString122 = null;
					Static672.aBoolean765 = !Static672.aBoolean765;
					Static590.method8398("cs2debug:" + Static672.aBoolean765);
					return;
				}
				if (Static387.anInt9114 == 11) {
					@Pc(2856) Class14_Sub54 local2856 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static657.aClass251_265);
					local2856.aClass14_Sub21_Sub2_2.method7747(arg2.length() + 3);
					local2856.aClass14_Sub21_Sub2_2.method7747(arg0 ? 1 : 0);
					local2856.aClass14_Sub21_Sub2_2.method7747(arg1 ? 1 : 0);
					local2856.aClass14_Sub21_Sub2_2.method7690(arg2);
					Static277.aClass347_2.method8308(local2856);
				}
				if (arg2.startsWith("fps ") && Static115.aClass59_4 != Static548.aClass59_10) {
					Static369.method5536(Static297.method4858(arg2.substring(4), 102));
					return;
				}
			} catch (@Pc(2916) Exception local2916) {
				Static590.method8398(Class21.lb.method324(Static26.anInt352));
				return;
			}
		}
		if (Static387.anInt9114 != 11) {
			Static590.method8398(Static21.aClass21_2.method324(Static26.anInt352) + arg2);
		}
	}
}
