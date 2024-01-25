import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
	public static void method8744(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			label723: {
				if (!arg1.equalsIgnoreCase("commands") && !arg1.equalsIgnoreCase("help")) {
					if (arg1.equalsIgnoreCase("cls")) {
						Static577.anInt9220 = 0;
						Static573.anInt9177 = 0;
						return;
					}
					if (arg1.equalsIgnoreCase("displayfps")) {
						Static46.aBoolean42 = !Static46.aBoolean42;
						if (Static46.aBoolean42) {
							Static655.method8761("FPS on");
							return;
						}
						Static655.method8761("FPS off");
						return;
					}
					if (!arg1.equals("renderer")) {
						if (arg1.equals("heap")) {
							Static655.method8761("Heap: " + Static532.anInt8714 + "MB");
							return;
						}
						break label723;
					}
					@Pc(95) Class52 local95 = Static202.aClass75_5.method6699();
					Static655.method8761("Vendor: " + local95.anInt780);
					Static655.method8761("Name: " + local95.aString12);
					Static655.method8761("Version: " + local95.anInt782);
					Static655.method8761("Device: " + local95.aString11);
					Static655.method8761("Driver Version: " + local95.aLong40);
					return;
				}
				Static655.method8761("commands - This command");
				Static655.method8761("cls - Clear console");
				Static655.method8761("displayfps - Toggle FPS and other information");
				Static655.method8761("renderer - Print graphics renderer information");
				Static655.method8761("heap - Print java memory information");
				return;
			}
		} catch (@Pc(190) Exception local190) {
			Static655.method8761(Static50.aClass43_2.method596(Static601.anInt9518));
			return;
		}
		if (Static520.aClass352_8 != Static41.aClass352_2 || Static679.anInt6104 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static655.method8761("FPS: " + Static467.anInt8014);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static519.aBoolean664 = !Static519.aBoolean664;
					if (Static519.aBoolean664) {
						Static655.method8761("Occlsion now on!");
						return;
					}
					Static655.method8761("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static46.aBoolean42 = true;
					Static655.method8761("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static46.aBoolean42 = false;
					Static655.method8761("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static655.method8761("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static192.aClass6_Sub1_1.anInt39 + "Mb");
						return;
					} catch (@Pc(341) Throwable local341) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static292.aClass385_4.method8774();
					Static655.method8761("Text coords cleared");
					return;
				}
				@Pc(389) int local389;
				@Pc(368) int local368;
				@Pc(379) Runtime local379;
				if (arg1.equalsIgnoreCase("gc")) {
					Static163.method3217();
					for (local368 = 0; local368 < 10; local368++) {
						System.gc();
					}
					local379 = Runtime.getRuntime();
					local389 = (int) ((local379.totalMemory() - local379.freeMemory()) / 1024L);
					Static655.method8761("mem=" + local389 + "k");
					return;
				}
				@Pc(454) int local454;
				if (arg1.equalsIgnoreCase("compact")) {
					Static163.method3217();
					for (local368 = 0; local368 < 10; local368++) {
						System.gc();
					}
					local379 = Runtime.getRuntime();
					local389 = (int) ((local379.totalMemory() - local379.freeMemory()) / 1024L);
					Static655.method8761("Memory before cleanup=" + local389 + "k");
					Static434.method6604();
					Static163.method3217();
					for (local454 = 0; local454 < 10; local454++) {
						System.gc();
					}
					local389 = (int) ((local379.totalMemory() - local379.freeMemory()) / 1024L);
					Static655.method8761("Memory after cleanup=" + local389 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static655.method8761(Static628.method8567() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static655.method8761("Dropped client connection");
					if (Static37.anInt498 == 11) {
						Static578.method8055();
						return;
					}
					if (Static37.anInt498 == 12) {
						Static525.aClass260_4.aBoolean538 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static82.aClass165_2.method4207();
					Static655.method8761("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static116.aClass189_2.method4687();
					Static655.method8761("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static116.aClass189_2.method4681();
					Static655.method8761("Dropped server js5 net queue");
					return;
				}
				@Pc(602) int local602;
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static651.aClass122_38.method3360();
					@Pc(600) Class260[] local600 = Static525.aClass260Array1;
					for (local602 = 0; local602 < local600.length; local602++) {
						@Pc(608) Class260 local608 = local600[local602];
						if (local608.aClass141_1 != null) {
							local608.aClass141_1.method7611();
						}
					}
					Static116.aClass189_2.method4686();
					Static655.method8761("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static41.method532();
					Static120.method2195();
					Static655.method8761("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static259.aLong156 = Static549.method7758();
					Static634.aBoolean729 = true;
					Static41.method532();
					Static120.method2195();
					Static655.method8761("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static137.method2612(-1, -1, 1, false);
					if (Static368.method5566() != 1) {
						Static655.method8761("wm1 failed");
						return;
					}
					Static655.method8761("wm1 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static137.method2612(-1, -1, 2, false);
					if (Static368.method5566() != 2) {
						Static655.method8761("wm2 failed");
						return;
					}
					Static655.method8761("wm2 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static137.method2612(768, 1024, 3, false);
					if (Static368.method5566() == 3) {
						Static655.method8761("wm3 succeeded");
						return;
					}
					Static655.method8761("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static536.method7652(false, 0);
					if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 0) {
						Static655.method8761("Failed to enter tk0");
						return;
					}
					Static655.method8761("Entered tk0");
					Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
					Static392.method6007();
					Static554.aBoolean681 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static536.method7652(false, 1);
					if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != 1) {
						Static655.method8761("Failed to enter tk1");
						return;
					}
					Static655.method8761("Entered tk1");
					Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
					Static392.method6007();
					Static554.aBoolean681 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static536.method7652(false, 2);
					if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 2) {
						Static655.method8761("Entered tk2");
						Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					Static655.method8761("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static536.method7652(false, 3);
					if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 3) {
						Static655.method8761("Entered tk3");
						Static687.aClass6_Sub44_33.method7080(3, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					Static655.method8761("Failed to enter tk3");
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static536.method7652(false, 5);
					if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 5) {
						Static655.method8761("Entered tk5");
						Static687.aClass6_Sub44_33.method7080(5, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					Static655.method8761("Failed to enter tk5");
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static655.method8761("Invalid buildarea value");
						return;
					}
					local368 = Static543.method7715(arg1.substring(6));
					if (local368 >= 0 && local368 <= Static614.method8472(Static532.anInt8714)) {
						Static687.aClass6_Sub44_33.method7080(local368, Static687.aClass6_Sub44_33.aClass7_Sub7_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						Static655.method8761("maxbuildarea=" + Static687.aClass6_Sub44_33.aClass7_Sub7_1.method1193());
						return;
					}
					Static655.method8761("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static655.method8761("Invalid rect_debug value");
						return;
					}
					Static47.anInt577 = Static543.method7715(arg1.substring(10).trim());
					Static655.method8761("rect_debug=" + Static47.anInt577);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static628.aBoolean728 = true;
					Static655.method8761("qa_op_test=" + Static628.aBoolean728);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static506.aBoolean647 = !Static506.aBoolean647;
					Static655.method8761("clipcomponents=" + Static506.aBoolean647);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1160) boolean local1160 = Static202.aClass75_5.method6705();
					if (Static591.method8211(!local1160)) {
						if (local1160) {
							Static655.method8761("Bloom disabled");
							return;
						}
						Static655.method8761("Bloom enabled");
						return;
					}
					Static655.method8761("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static640.aBoolean734) {
						Static640.aBoolean734 = false;
						Static655.method8761("Forced tweening disabled.");
						return;
					}
					Static640.aBoolean734 = true;
					Static655.method8761("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static28.aBoolean30) {
						Static655.method8761("Shift-click disabled.");
						Static28.aBoolean30 = false;
						return;
					}
					Static655.method8761("Shift-click ENABLED!");
					Static28.aBoolean30 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static655.method8761("x:" + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9) + " z:" + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static655.method8761("Height: " + Static555.aClass96Array3[Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135].method8080(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static583.aClass223_113.method5277();
					Static583.aClass223_113.method5268();
					Static599.aClass306_2.method7374();
					Static508.aClass190_3.method4693();
					Static120.method2195();
					Static655.method8761("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static202.aClass75_5.method6693()) {
						local368 = Integer.parseInt(arg1.substring(3));
						if (local368 < 1) {
							local368 = 1;
						} else if (local368 > 4) {
							local368 = 4;
						}
						Static241.anInt4642 = local368;
						Static41.method532();
						Static655.method8761("Render cores now: " + Static241.anInt4642);
						return;
					}
					Static655.method8761("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static655.method8761("I(s): " + Static149.aClass359_17.method8519() + "/" + Static149.aClass359_17.method8510());
					Static655.method8761("I(m): " + Static556.aClass359_50.method8519() + "/" + Static556.aClass359_50.method8510());
					Static655.method8761("O(s): " + Static149.aClass244_1.aClass112_1.method3213() + "/" + Static149.aClass244_1.aClass112_1.method3215());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static655.method8761("Pos: " + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 + "," + ((Static475.anInt8090 >> 9) + Static50.anInt606 >> 6) + "," + ((Static365.anInt6155 >> 9) + Static404.anInt7039 >> 6) + "," + (Static50.anInt606 + (Static475.anInt8090 >> 9) & 0x3F) + "," + (Static404.anInt7039 + (Static365.anInt6155 >> 9) & 0x3F) + " Height: " + (Static248.method4318(Static365.anInt6155, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, Static475.anInt8090) - Static406.anInt7076));
					Static655.method8761("Look: " + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 + "," + (Static50.anInt606 + Static104.anInt2080 >> 6) + "," + (Static404.anInt7039 + Static484.anInt8246 >> 6) + "," + (Static104.anInt2080 + Static50.anInt606 & 0x3F) + "," + (Static404.anInt7039 + Static484.anInt8246 & 0x3F) + " Height: " + (Static248.method4318(Static484.anInt8246, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, Static104.anInt2080) - Static26.anInt362));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static309.aBoolean404 = !Static309.aBoolean404;
					Static202.aClass75_5.method6650(Static309.aBoolean404);
					Static667.method8850();
					Static655.method8761("showprofiling=" + Static309.aBoolean404);
					return;
				}
				@Pc(1654) String[] local1654;
				if (arg1.startsWith("performancetest")) {
					local368 = -1;
					local602 = 1000;
					if (arg1.length() > 15) {
						local1654 = Static26.method332(' ', arg1);
						try {
							if (local1654.length > 1) {
								local602 = Integer.parseInt(local1654[1]);
							}
						} catch (@Pc(1667) Throwable local1667) {
						}
						try {
							if (local1654.length > 2) {
								local368 = Integer.parseInt(local1654[2]);
							}
						} catch (@Pc(1678) Throwable local1678) {
						}
					}
					if (local368 == -1) {
						Static655.method8761("Java toolkit: " + Static565.method7970(0, local602));
						Static655.method8761("SSE toolkit:  " + Static565.method7970(2, local602));
						Static655.method8761("D3D toolkit:  " + Static565.method7970(3, local602));
						Static655.method8761("GL toolkit:   " + Static565.method7970(1, local602));
						Static655.method8761("GLX toolkit:  " + Static565.method7970(5, local602));
						return;
					}
					Static655.method8761("Performance: " + Static565.method7970(local368, local602));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static185.aBoolean308 = !Static185.aBoolean308;
					Static655.method8761("nonpcs=" + Static185.aBoolean308);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static244.method4312();
					Static655.method8761("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local368 = Integer.parseInt(arg1.substring(12));
					Static653.method8740(local368, Static517.method7487(local368).aString70);
					Static655.method8761("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static655.method8761("w: " + Static82.aClass165_2.anInt4607);
					return;
				}
				if (arg1.startsWith("pc")) {
					@Pc(1868) Class260 local1868 = Static629.method8573();
					@Pc(1874) Class6_Sub13 local1874 = Static30.method353(Static683.aClass241_126, local1868.aClass270_2);
					local1874.aClass6_Sub15_Sub1_1.method3016(0);
					local389 = local1874.aClass6_Sub15_Sub1_1.anInt3174;
					local454 = arg1.indexOf(" ", 4);
					local1874.aClass6_Sub15_Sub1_1.method2991(arg1.substring(3, local454));
					Static568.method8736(arg1.substring(local454), local1874.aClass6_Sub15_Sub1_1);
					local1874.aClass6_Sub15_Sub1_1.method2999(local1874.aClass6_Sub15_Sub1_1.anInt3174 - local389);
					local1868.method6404(local1874);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static287.method4705();
					Static655.method8761("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local368 = 0; local368 < Static333.anIntArray333.length; local368++) {
						if (Static371.aBooleanArray19[local368]) {
							Static333.anIntArray333[local368] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static333.anIntArray333[local368] *= -1;
							}
						}
					}
					Static287.method4705();
					Static655.method8761("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static550.aBoolean672 = true;
					Static120.method2195();
					Static655.method8761("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static550.aBoolean672 = false;
					Static120.method2195();
					Static655.method8761("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static375.method5662();
					Static655.method8761("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static655.method8761(Static508.method3113(9714) + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local368 = Integer.parseInt(arg1.substring(17));
					Static655.method8761("varpbit=" + Static303.aClass55_2.method935(local368));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local368 = Integer.parseInt(arg1.substring(14));
					Static655.method8761("varp=" + Static303.aClass55_2.method936(local368));
					return;
				}
				@Pc(2130) String[] local2130;
				if (arg1.startsWith("directlogin")) {
					local2130 = Static26.method332(' ', arg1.substring(12));
					if (local2130.length >= 2) {
						local602 = local2130.length <= 2 ? 0 : Integer.parseInt(local2130[2]);
						Static352.method5391(local2130[1], local2130[0], local602);
						return;
					}
				}
				if (arg1.startsWith("snlogin ")) {
					local2130 = Static26.method332(' ', arg1.substring(8));
					local602 = Integer.parseInt(local2130[0]);
					local389 = local2130.length == 2 ? Integer.parseInt(local2130[1]) : 0;
					Static499.method7330(local602, local389);
					return;
				}
				if (arg1.startsWith("csprofileclear")) {
					Static301.method4836();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static301.method4844();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static301.method4844();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local368 = Integer.parseInt(arg1.substring(8));
					Static202.aClass75_5.method6706(local368);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static655.method8761("Active streams: " + Static544.aClass6_Sub17_Sub3_2.method4658());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static629.method8578();
					Static655.method8761("Complete. Toolkit now: " + Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static655.method8761(Static635.aClient1.method1046());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static174.aString36.startsWith("win")) {
						Static332.method5164(new File("C:\\Temp\\heap.dump"));
					} else {
						Static332.method5164(new File("/tmp/heap.dump"));
					}
					Static655.method8761("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static655.method8761("Name: " + Static174.aString36);
					Static655.method8761("Arch: " + Static174.aString34);
					Static655.method8761("Ver: " + Static174.aString33);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local368 = Integer.parseInt(arg1.substring(8, 9));
					Static437.anInt7442 = local368;
					Static41.method532();
					Static655.method8761("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local368 = arg1.indexOf(32);
					if (local368 < 0) {
						Static655.method8761("Syntax: ortho <n>");
						return;
					}
					local602 = Static543.method7715(arg1.substring(local368 + 1));
					Static687.aClass6_Sub44_33.method7080(local602, Static687.aClass6_Sub44_33.aClass7_Sub9_1);
					Static392.method6007();
					Static554.aBoolean681 = false;
					Static300.method7412();
					if (local602 != Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017()) {
						Static655.method8761("Failed to change ortho mode");
						return;
					}
					Static655.method8761("Successfully changed ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017() == 0) {
						Static655.method8761("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local368 = Static543.method7715(arg1.substring(arg1.indexOf(32) + 1));
					Static377.anInt6464 = local368;
					Static655.method8761("orthozoom=" + Static377.anInt6464);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local368 = Static543.method7715(arg1.substring(arg1.indexOf(32) + 1));
					Static103.anInt2062 = local368;
					Static208.anInt4171 = local368;
					Static655.method8761("ortho tile size=" + local368);
					Static300.method7412();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static473.aBoolean609 = !Static473.aBoolean609;
					Static655.method8761("ortho camera lock is " + (Static473.aBoolean609 ? "on" : "off"));
					return;
				}
				if (arg1.startsWith("skydetail ")) {
					local368 = Static543.method7715(arg1.substring(arg1.indexOf(32) + 1));
					Static687.aClass6_Sub44_33.method7080(local368, Static687.aClass6_Sub44_33.aClass7_Sub11_1);
					Static655.method8761("skydetail is " + (Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2916() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2642) File local2642;
				if (arg1.startsWith("setoutput ")) {
					local2642 = new File(arg1.substring(10));
					if (local2642.exists()) {
						local2642 = new File(arg1.substring(10) + "." + Static549.method7758() + ".log");
						if (local2642.exists()) {
							Static655.method8761("file already exists!");
							return;
						}
					}
					if (Static214.aFileOutputStream1 != null) {
						Static214.aFileOutputStream1.close();
						Static214.aFileOutputStream1 = null;
					}
					try {
						Static214.aFileOutputStream1 = new FileOutputStream(local2642);
						return;
					} catch (@Pc(2691) FileNotFoundException local2691) {
						Static655.method8761("Could not create " + local2642.getName());
						return;
					} catch (@Pc(2705) SecurityException local2705) {
						Static655.method8761("Cannot write to " + local2642.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static214.aFileOutputStream1 != null) {
						Static214.aFileOutputStream1.close();
					}
					Static214.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2642 = new File(arg1.substring(10));
					if (!local2642.exists()) {
						Static655.method8761("No such file");
						return;
					}
					@Pc(2764) byte[] local2764 = Static54.method653(local2642);
					if (local2764 == null) {
						Static655.method8761("Failed to read file");
						return;
					}
					local1654 = Static26.method332('\n', Static272.method976("", Static145.method2851(local2764)));
					Static107.method2043(local1654);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2802) short local2802 = (short) Static543.method7715(arg1.substring(5));
					if (local2802 > 0) {
						Static73.aShort43 = local2802;
					}
					return;
				}
				if (arg1.startsWith("cs2debug")) {
					if (arg1.length() > 9 && arg1.charAt(8) == ' ') {
						Static301.aString60 = arg1.substring(9);
						Static301.aBoolean399 = true;
						Static655.method8761("cs2debug: (" + Static301.aString60 + ")");
						return;
					}
					Static301.aString60 = null;
					Static301.aBoolean399 = !Static301.aBoolean399;
					Static655.method8761("cs2debug:" + Static301.aBoolean399);
					return;
				}
				if (Static37.anInt498 == 11) {
					@Pc(2887) Class6_Sub13 local2887 = Static30.method353(Static656.aClass241_120, Static525.aClass260_4.aClass270_2);
					local2887.aClass6_Sub15_Sub1_1.method3016(arg1.length() + 3);
					local2887.aClass6_Sub15_Sub1_1.method3016(arg0 ? 1 : 0);
					local2887.aClass6_Sub15_Sub1_1.method3016(arg2 ? 1 : 0);
					local2887.aClass6_Sub15_Sub1_1.method2991(arg1);
					Static525.aClass260_4.method6404(local2887);
				}
				if (arg1.startsWith("fps ") && Static520.aClass352_8 != Static41.aClass352_2) {
					Static545.method7723(Static543.method7715(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2945) Exception local2945) {
				Static655.method8761(Static50.aClass43_2.method596(Static601.anInt9518));
				return;
			}
		}
		if (Static37.anInt498 != 11) {
			Static655.method8761(Static50.aClass43_3.method596(Static601.anInt9518) + arg1);
		}
	}
}
