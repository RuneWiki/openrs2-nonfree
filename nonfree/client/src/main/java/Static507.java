import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "F")
	public static float aFloat219;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public static int anInt8961 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method7426(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static466.method6830("commands - This command");
				Static466.method6830("cls - Clear console");
				Static466.method6830("displayfps - Toggle FPS and other information");
				Static466.method6830("renderer - Print graphics renderer information");
				Static466.method6830("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static559.anInt9499 = 0;
				Static157.anInt3114 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Class12_Sub2_Sub1_Sub2.lb = !Class12_Sub2_Sub1_Sub2.lb;
				if (Class12_Sub2_Sub1_Sub2.lb) {
					Static466.method6830("FPS on");
					return;
				}
				Static466.method6830("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(69) Class64 local69 = Static677.aClass137_47.method7953();
				Static466.method6830("Vendor: " + local69.anInt1799);
				Static466.method6830("Name: " + local69.aString20);
				Static466.method6830("Version: " + local69.anInt1798);
				Static466.method6830("Device: " + local69.aString19);
				Static466.method6830("Driver Version: " + local69.aLong43);
				return;
			}
			if (arg0.equals("heap")) {
				Static466.method6830("Heap: " + Static189.anInt3553 + "MB");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static466.method6830(Static514.aClass303_4.method7473(Static232.anInt4258));
			return;
		}
		if (Static513.aClass240_7 != Static420.aClass240_5 || Static447.anInt10238 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static466.method6830("FPS: " + Static12.anInt96);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static12.aBoolean9 = !Static12.aBoolean9;
					if (Static12.aBoolean9) {
						Static466.method6830("Occlsion now on!");
						return;
					}
					Static466.method6830("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Class12_Sub2_Sub1_Sub2.lb = true;
					Static466.method6830("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Class12_Sub2_Sub1_Sub2.lb = false;
					Static466.method6830("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static466.method6830("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static58.aClass14_Sub11_1.anInt1980 + "Mb");
						return;
					} catch (@Pc(251) Throwable local251) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static239.aClass376_4.method9007();
					Static466.method6830("Text coords cleared");
					return;
				}
				@Pc(291) int local291;
				@Pc(271) int local271;
				@Pc(282) Runtime local282;
				if (arg0.equalsIgnoreCase("gc")) {
					Static150.method2365();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local282 = Runtime.getRuntime();
					local291 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static466.method6830("mem=" + local291 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static150.method2365();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local282 = Runtime.getRuntime();
					local291 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static466.method6830("Memory before cleanup=" + local291 + "k");
					Static543.method7678();
					Static150.method2365();
					for (@Pc(349) int local349 = 0; local349 < 10; local349++) {
						System.gc();
					}
					local291 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static466.method6830("Memory after cleanup=" + local291 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static466.method6830(Static390.method5817() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static466.method6830("Dropped client connection");
					if (Static430.anInt7691 == 10) {
						Static456.method6584();
						return;
					}
					if (Static430.anInt7691 == 11) {
						Static91.aBoolean169 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static92.aClass337_1.method8199();
					Static466.method6830("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static204.aClass135_8.method3059();
					Static466.method6830("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static204.aClass135_8.method3064();
					Static466.method6830("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static234.aClass333_5.method8136();
					Static258.aClass97_2.method2293();
					Static204.aClass135_8.method3063();
					Static466.method6830("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static107.method1893();
					Static405.method6013();
					Static466.method6830("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static421.aLong210 = Static521.method7499();
					Static478.aBoolean579 = true;
					Static107.method1893();
					Static405.method6013();
					Static466.method6830("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static437.method6438(-1, -1, false, 1);
					if (Static482.method7137() == 1) {
						Static466.method6830("wm1 succeeded");
						return;
					}
					Static466.method6830("wm1 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static437.method6438(-1, -1, false, 2);
					if (Static482.method7137() == 2) {
						Static466.method6830("wm2 succeeded");
						return;
					}
					Static466.method6830("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static437.method6438(1024, 768, false, 3);
					if (Static482.method7137() != 3) {
						Static466.method6830("wm3 failed");
						return;
					}
					Static466.method6830("wm3 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static155.method2506(0, false);
					if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 0) {
						Static466.method6830("Entered tk0");
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 0);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					Static466.method6830("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static155.method2506(1, false);
					if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 1) {
						Static466.method6830("Failed to enter tk1");
						return;
					}
					Static466.method6830("Entered tk1");
					Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 1);
					Static169.method2762();
					Static26.aBoolean36 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static155.method2506(2, false);
					if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 2) {
						Static466.method6830("Entered tk2");
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 2);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					Static466.method6830("Failed to enter tk2");
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static155.method2506(3, false);
					if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 3) {
						Static466.method6830("Failed to enter tk3");
						return;
					}
					Static466.method6830("Entered tk3");
					Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 3);
					Static169.method2762();
					Static26.aBoolean36 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static155.method2506(5, false);
					if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 5) {
						Static466.method6830("Entered tk5");
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 5);
						Static169.method2762();
						Static26.aBoolean36 = false;
						return;
					}
					Static466.method6830("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static466.method6830("Invalid buildarea value");
						return;
					}
					local271 = Static235.method3555(arg0.substring(6));
					if (local271 >= 0 && local271 <= Static588.method8390(Static189.anInt3553)) {
						Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub3_1, local271);
						Static169.method2762();
						Static26.aBoolean36 = false;
						Static466.method6830("maxbuildarea=" + Static56.aClass14_Sub22_5.aClass21_Sub3_1.method964());
						return;
					}
					Static466.method6830("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static466.method6830("Invalid rect_debug value");
						return;
					}
					Static624.anInt10511 = Static235.method3555(arg0.substring(10).trim());
					Static466.method6830("rect_debug=" + Static624.anInt10511);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static28.aBoolean59 = true;
					Static466.method6830("qa_op_test=" + Static28.aBoolean59);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static436.aBoolean533 = !Static436.aBoolean533;
					Static466.method6830("clipcomponents=" + Static436.aBoolean533);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(870) boolean local870 = Static677.aClass137_47.method7880();
					if (Static154.method2473(!local870)) {
						if (local870) {
							Static466.method6830("Bloom disabled");
							return;
						}
						Static466.method6830("Bloom enabled");
						return;
					}
					Static466.method6830("Failed to enable bloom");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static394.aBoolean505) {
						Static394.aBoolean505 = true;
						Static466.method6830("Forced tweening ENABLED!");
						return;
					}
					Static394.aBoolean505 = false;
					Static466.method6830("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (!Static538.aBoolean652) {
						Static466.method6830("Shift-click ENABLED!");
						Static538.aBoolean652 = true;
						return;
					}
					Static466.method6830("Shift-click disabled.");
					Static538.aBoolean652 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static466.method6830("x:" + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9) + " z:" + (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static466.method6830("Height: " + Static576.aClass51Array3[Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146].method7857(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 >> 9, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static666.aClass386_141.method9201();
					Static666.aClass386_141.method9197();
					Static313.aClass83_6.method2079();
					Static196.aClass116_2.method2786();
					Static405.method6013();
					Static466.method6830("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static677.aClass137_47.method7899()) {
						local271 = Integer.parseInt(arg0.substring(3));
						if (local271 < 1) {
							local271 = 1;
						} else if (local271 > 4) {
							local271 = 4;
						}
						Static490.anInt8758 = local271;
						Static107.method1893();
						Static466.method6830("Render cores now: " + Static490.anInt8758);
						return;
					}
					Static466.method6830("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static466.method6830("I(s): " + Static46.aClass264_8.method6369() + "/" + Static46.aClass264_8.method6362());
					Static466.method6830("I(m): " + Static67.aClass264_13.method6369() + "/" + Static67.aClass264_13.method6362());
					Static466.method6830("O(s): " + Static175.aClass247_2.aClass387_1.method9229() + "/" + Static175.aClass247_2.aClass387_1.method9231());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static466.method6830("Pos: " + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 + "," + ((Static233.anInt4273 >> 9) + Static329.anInt6225 >> 6) + "," + (Static202.anInt3755 + (Static74.anInt1618 >> 9) >> 6) + "," + ((Static233.anInt4273 >> 9) + Static329.anInt6225 & 0x3F) + "," + (Static202.anInt3755 + (Static74.anInt1618 >> 9) & 0x3F) + " Height: " + (Static152.method2434(Static233.anInt4273, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, Static74.anInt1618) - Static396.anInt7302));
					Static466.method6830("Look: " + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 + "," + (Static329.anInt6225 + Static243.anInt4386 >> 6) + "," + (Static202.anInt3755 + Static8.anInt58 >> 6) + "," + (Static243.anInt4386 + Static329.anInt6225 & 0x3F) + "," + (Static202.anInt3755 + Static8.anInt58 & 0x3F) + " Height: " + (Static152.method2434(Static243.anInt4386, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, Static8.anInt58) - Static286.anInt4894));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static13.aBoolean13 = !Static13.aBoolean13;
					Static677.aClass137_47.method7954(Static13.aBoolean13);
					Static345.method5294();
					Static466.method6830("showprofiling=" + Static13.aBoolean13);
					return;
				}
				@Pc(1286) String[] local1286;
				@Pc(1275) int local1275;
				if (arg0.startsWith("performancetest")) {
					local271 = -1;
					local1275 = 1000;
					if (arg0.length() > 15) {
						local1286 = Static111.method1920(' ', arg0);
						try {
							if (local1286.length > 1) {
								local1275 = Integer.parseInt(local1286[1]);
							}
						} catch (@Pc(1297) Throwable local1297) {
						}
						try {
							if (local1286.length > 2) {
								local271 = Integer.parseInt(local1286[2]);
							}
						} catch (@Pc(1310) Throwable local1310) {
						}
					}
					if (local271 != -1) {
						Static466.method6830("Performance: " + Static428.method6310(local271, local1275));
						return;
					}
					Static466.method6830("Java toolkit: " + Static428.method6310(0, local1275));
					Static466.method6830("SSE toolkit:  " + Static428.method6310(2, local1275));
					Static466.method6830("D3D toolkit:  " + Static428.method6310(3, local1275));
					Static466.method6830("GL toolkit:   " + Static428.method6310(1, local1275));
					Static466.method6830("GLX toolkit:  " + Static428.method6310(5, local1275));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static156.aBoolean237 = !Static156.aBoolean237;
					Static466.method6830("nonpcs=" + Static156.aBoolean237);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static634.method8859();
					Static466.method6830("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local271 = Integer.parseInt(arg0.substring(12));
					Static660.method9134(local271, Static344.method9318(local271).aString89);
					Static466.method6830("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static466.method6830("w: " + Static92.aClass337_1.anInt9843);
					return;
				}
				@Pc(1463) Class14_Sub19 local1463;
				if (arg0.startsWith("pc")) {
					local1463 = Static286.method4081(Static205.aClass394_1, Static171.aClass100_50);
					local1463.aClass14_Sub29_Sub1_1.method5854(0);
					local1275 = local1463.aClass14_Sub29_Sub1_1.anInt7264;
					local291 = arg0.indexOf(" ", 4);
					local1463.aClass14_Sub29_Sub1_1.method5855(arg0.substring(3, local291));
					Static40.method1450(arg0.substring(local291), local1463.aClass14_Sub29_Sub1_1);
					local1463.aClass14_Sub29_Sub1_1.method5853(local1463.aClass14_Sub29_Sub1_1.anInt7264 - local1275);
					Static576.method8234(local1463);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static559.method7855();
					Static466.method6830("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local271 = 0; local271 < Static259.anIntArray800.length; local271++) {
						if (Static330.aBooleanArray15[local271]) {
							Static259.anIntArray800[local271] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static259.anIntArray800[local271] *= -1;
							}
						}
					}
					Static559.method7855();
					Static466.method6830("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static580.aBoolean705 = true;
					Static405.method6013();
					Static466.method6830("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static580.aBoolean705 = false;
					Static405.method6013();
					Static466.method6830("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static242.method3619();
					Static466.method6830("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static466.method6830(Static482.method7139() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local271 = Integer.parseInt(arg0.substring(17));
					Static466.method6830("varpbit=" + Static595.aClass241_1.method5813(local271));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local271 = Integer.parseInt(arg0.substring(14));
					Static466.method6830("varp=" + Static595.aClass241_1.method5814(local271));
					return;
				}
				@Pc(1669) String[] local1669;
				if (arg0.startsWith("directlogin")) {
					local1669 = Static111.method1920(' ', arg0.substring(12));
					if (local1669.length >= 2) {
						local1275 = local1669.length <= 2 ? 0 : Integer.parseInt(local1669[2]);
						Static447.method8529(local1669[0], local1669[1], local1275);
						return;
					}
				}
				if (arg0.startsWith("snlogin ")) {
					local1669 = Static111.method1920(' ', arg0.substring(8));
					local1275 = Integer.parseInt(local1669[0]);
					local291 = local1669.length == 2 ? Integer.parseInt(local1669[1]) : 0;
					Static652.method9071(local291, local1275);
					return;
				}
				if (arg0.startsWith("csprofileclear")) {
					Static632.method8841();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static632.method8838();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static632.method8838();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local271 = Integer.parseInt(arg0.substring(8));
					Static677.aClass137_47.method7931(local271);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static466.method6830("Active streams: " + Static217.aClass14_Sub5_Sub3_1.method6028());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static447.method8532();
					Static466.method6830("Complete. Toolkit now: " + Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static466.method6830(Static243.aClient1.method1454());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static565.aString98.startsWith("win")) {
						Static43.method933(new File("C:\\Temp\\heap.dump"));
					} else {
						Static43.method933(new File("/tmp/heap.dump"));
					}
					Static466.method6830("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static466.method6830("Name: " + Static565.aString98);
					Static466.method6830("Arch: " + Static565.aString96);
					Static466.method6830("Ver: " + Static565.aString100);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local271 = Integer.parseInt(arg0.substring(8, 9));
					Static465.anInt8178 = local271;
					Static107.method1893();
					Static466.method6830("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local271 = arg0.indexOf(32);
					if (local271 < 0) {
						Static466.method6830("Syntax: ortho <n>");
						return;
					}
					local1275 = Static235.method3555(arg0.substring(local271 + 1));
					Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub6_1, local1275);
					Static169.method2762();
					Static26.aBoolean36 = false;
					Static102.method1817();
					if (local1275 != Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933()) {
						Static466.method6830("Failed to change ortho mode");
						return;
					}
					Static466.method6830("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933() == 0) {
						Static466.method6830("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local271 = Static235.method3555(arg0.substring(arg0.indexOf(32) + 1));
					Static331.anInt6274 = local271;
					Static466.method6830("orthozoom=" + Static331.anInt6274);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local271 = Static235.method3555(arg0.substring(arg0.indexOf(32) + 1));
					Static620.anInt10426 = local271;
					Static140.anInt2665 = local271;
					Static466.method6830("ortho tile size=" + local271);
					Static102.method1817();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static521.aBoolean635 = !Static521.aBoolean635;
					Static466.method6830("ortho camera lock is " + (Static521.aBoolean635 ? "on" : "off"));
					return;
				}
				@Pc(2049) File local2049;
				if (arg0.startsWith("setoutput ")) {
					local2049 = new File(arg0.substring(10));
					if (local2049.exists()) {
						local2049 = new File(arg0.substring(10) + "." + Static521.method7499() + ".log");
						if (local2049.exists()) {
							Static466.method6830("file already exists!");
							return;
						}
					}
					if (Static16.aFileOutputStream3 != null) {
						Static16.aFileOutputStream3.close();
						Static16.aFileOutputStream3 = null;
					}
					try {
						Static16.aFileOutputStream3 = new FileOutputStream(local2049);
						return;
					} catch (@Pc(2093) FileNotFoundException local2093) {
						Static466.method6830("Could not create " + local2049.getName());
						return;
					} catch (@Pc(2105) SecurityException local2105) {
						Static466.method6830("Cannot write to " + local2049.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static16.aFileOutputStream3 != null) {
						Static16.aFileOutputStream3.close();
					}
					Static16.aFileOutputStream3 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2049 = new File(arg0.substring(10));
					if (!local2049.exists()) {
						Static466.method6830("No such file");
						return;
					}
					@Pc(2149) byte[] local2149 = Static350.method1352(local2049);
					if (local2149 == null) {
						Static466.method6830("Failed to read file");
						return;
					}
					local1286 = Static111.method1920('\n', Static115.method1958(Static111.method1918(local2149), ""));
					Static517.method7485(local1286);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2184) short local2184 = (short) Static235.method3555(arg0.substring(5));
					if (local2184 > 0) {
						Static175.aShort45 = local2184;
					}
					return;
				}
				if (Static430.anInt7691 == 10) {
					local1463 = Static286.method4081(Static205.aClass394_1, Static279.aClass100_76);
					local1463.aClass14_Sub29_Sub1_1.method5854(arg0.length() + 3);
					local1463.aClass14_Sub29_Sub1_1.method5854(arg2 ? 1 : 0);
					local1463.aClass14_Sub29_Sub1_1.method5854(arg1 ? 1 : 0);
					local1463.aClass14_Sub29_Sub1_1.method5855(arg0);
					Static576.method8234(local1463);
				}
				if (arg0.startsWith("fps ") && Static420.aClass240_5 != Static513.aClass240_7) {
					Static557.method7834(Static235.method3555(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2260) Exception local2260) {
				Static466.method6830(Static514.aClass303_4.method7473(Static232.anInt4258));
				return;
			}
		}
		if (Static430.anInt7691 != 10) {
			Static466.method6830(Static514.aClass303_5.method7473(Static232.anInt4258) + arg0);
		}
	}
}
