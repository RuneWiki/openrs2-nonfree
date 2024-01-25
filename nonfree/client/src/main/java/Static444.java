import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[Lclient!kf;")
	public static Class14_Sub1[] aClass14_Sub1Array4;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	public static int anInt7482;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public static void method6595() {
		if (Static214.anInt3694 <= 0) {
			Static1.aString102 = "";
			return;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static276.aStringArray39.length; local20++) {
			if (Static276.aStringArray39[local20].indexOf("--> ") != -1) {
				local18++;
				if (Static214.anInt3694 == local18) {
					Static1.aString102 = Static276.aStringArray39[local20].substring(Static276.aStringArray39[local20].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZZZLjava/lang/String;)V")
	public static void method6596(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static177.method2690("commands - This command");
				Static177.method2690("cls - Clear console");
				Static177.method2690("displayfps - Toggle FPS and other information");
				Static177.method2690("renderer - Print graphics renderer information");
				Static177.method2690("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static496.anInt8473 = 0;
				Static64.anInt1040 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static125.aBoolean158 = !Static125.aBoolean158;
				if (!Static125.aBoolean158) {
					Static177.method2690("FPS off");
					return;
				}
				Static177.method2690("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(65) Class185 local65 = Static485.aClass126_17.method6980();
				Static177.method2690("Vendor: " + local65.anInt4673);
				Static177.method2690("Name: " + local65.aString68);
				Static177.method2690("Version: " + local65.anInt4672);
				Static177.method2690("Device: " + local65.aString69);
				Static177.method2690("Driver Version: " + local65.aLong144);
				return;
			}
			if (arg2.equals("heap")) {
				Static177.method2690("Heap: " + Static125.anInt2059 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static177.method2690(Static76.aClass58_2.method1237(Static321.anInt5554));
			return;
		}
		if (Static363.aClass346_4 != Static34.aClass346_2 || Static408.anInt7025 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static177.method2690("FPS: " + Static33.anInt623);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static592.aBoolean843 = !Static592.aBoolean843;
					if (!Static592.aBoolean843) {
						Static177.method2690("Occlsion now off!");
						return;
					}
					Static177.method2690("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static125.aBoolean158 = true;
					Static177.method2690("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static125.aBoolean158 = false;
					Static177.method2690("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static177.method2690("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static343.aClass5_Sub28_1.anInt5496 + "Mb");
						return;
					} catch (@Pc(251) Throwable local251) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static41.aClass363_1.method8482();
					Static177.method2690("Text coords cleared");
					return;
				}
				@Pc(292) int local292;
				@Pc(271) int local271;
				@Pc(282) Runtime local282;
				if (arg2.equalsIgnoreCase("gc")) {
					Static454.method6739();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local282 = Runtime.getRuntime();
					local292 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static177.method2690("mem=" + local292 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static454.method6739();
					for (local271 = 0; local271 < 10; local271++) {
						System.gc();
					}
					local282 = Runtime.getRuntime();
					local292 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static177.method2690("Memory before cleanup=" + local292 + "k");
					Static393.method6104();
					Static454.method6739();
					for (@Pc(348) int local348 = 0; local348 < 10; local348++) {
						System.gc();
					}
					local292 = (int) ((local282.totalMemory() - local282.freeMemory()) / 1024L);
					Static177.method2690("Memory after cleanup=" + local292 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static177.method2690(Static291.method4300() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static177.method2690("Dropped client connection");
					if (Static469.anInt7883 == 10) {
						Static18.method449();
					} else if (Static469.anInt7883 == 11) {
						Static156.aBoolean236 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static282.aClass109_2.method2382();
					Static177.method2690("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static49.aClass331_1.method7792();
					Static177.method2690("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static49.aClass331_1.method7795();
					Static177.method2690("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static214.aClass192_1.method4335();
					Static487.aClass30_2.method676();
					Static49.aClass331_1.method7793();
					Static177.method2690("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static532.method7607();
					Static227.method3580();
					Static177.method2690("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static408.aLong191 = Static205.method3179();
					Static554.aBoolean741 = true;
					Static532.method7607();
					Static227.method3580();
					Static177.method2690("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static236.method3632(false, 1, -1, -1);
					if (Static259.method1979() == 1) {
						Static177.method2690("wm1 succeeded");
						return;
					}
					Static177.method2690("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static236.method3632(false, 2, -1, -1);
					if (Static259.method1979() == 2) {
						Static177.method2690("wm2 succeeded");
						return;
					}
					Static177.method2690("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static236.method3632(false, 3, 768, 1024);
					if (Static259.method1979() == 3) {
						Static177.method2690("wm3 succeeded");
						return;
					}
					Static177.method2690("wm3 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static590.method8288(false, 0);
					if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 0) {
						Static177.method2690("Failed to enter tk0");
						return;
					}
					Static177.method2690("Entered tk0");
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 0);
					Static499.method7307();
					Static71.aBoolean80 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static590.method8288(false, 1);
					if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 1) {
						Static177.method2690("Entered tk1");
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 1);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					Static177.method2690("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static590.method8288(false, 2);
					if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 2) {
						Static177.method2690("Entered tk2");
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 2);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					Static177.method2690("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static590.method8288(false, 3);
					if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 3) {
						Static177.method2690("Failed to enter tk3");
						return;
					}
					Static177.method2690("Entered tk3");
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 3);
					Static499.method7307();
					Static71.aBoolean80 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static590.method8288(false, 5);
					if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 5) {
						Static177.method2690("Failed to enter tk5");
						return;
					}
					Static177.method2690("Entered tk5");
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, 5);
					Static499.method7307();
					Static71.aBoolean80 = false;
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static177.method2690("Invalid buildarea value");
						return;
					}
					local271 = Static443.method6588(arg2.substring(6));
					if (local271 >= 0 && local271 <= Static99.method1462(Static125.anInt2059)) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, local271);
						Static499.method7307();
						Static71.aBoolean80 = false;
						Static177.method2690("maxbuildarea=" + Static627.aClass5_Sub46_31.aClass11_Sub20_1.method6520());
						return;
					}
					Static177.method2690("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static177.method2690("Invalid rect_debug value");
						return;
					}
					Static579.anInt9497 = Static443.method6588(arg2.substring(10).trim());
					Static177.method2690("rect_debug=" + Static579.anInt9497);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static571.aBoolean764 = true;
					Static177.method2690("qa_op_test=" + Static571.aBoolean764);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static271.aBoolean366 = !Static271.aBoolean366;
					Static177.method2690("clipcomponents=" + Static271.aBoolean366);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(851) boolean local851 = Static485.aClass126_17.method7025();
					if (Static533.method384(!local851)) {
						if (!local851) {
							Static177.method2690("Bloom enabled");
							return;
						}
						Static177.method2690("Bloom disabled");
						return;
					}
					Static177.method2690("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static35.aBoolean59) {
						Static35.aBoolean59 = false;
						Static177.method2690("Forced tweening disabled.");
						return;
					}
					Static35.aBoolean59 = true;
					Static177.method2690("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static473.aBoolean660) {
						Static177.method2690("Shift-click disabled.");
						Static473.aBoolean660 = false;
						return;
					}
					Static177.method2690("Shift-click ENABLED!");
					Static473.aBoolean660 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static177.method2690("x:" + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9) + " z:" + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static177.method2690("Height: " + Static299.aClass40Array1[Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125].method8442(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static488.aClass384_112.method8868();
					Static488.aClass384_112.method8875();
					Static39.aClass56_3.method1171();
					Static40.aClass273_3.method6534();
					Static227.method3580();
					Static177.method2690("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static485.aClass126_17.method7043()) {
						local271 = Integer.parseInt(arg2.substring(3));
						if (local271 < 1) {
							local271 = 1;
						} else if (local271 > 4) {
							local271 = 4;
						}
						Static296.anInt4746 = local271;
						Static532.method7607();
						Static177.method2690("Render cores now: " + Static296.anInt4746);
						return;
					}
					Static177.method2690("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static177.method2690("I(s): " + Static243.aClass293_29.method6926() + "/" + Static243.aClass293_29.method6928());
					Static177.method2690("I(m): " + Static436.aClass293_49.method6926() + "/" + Static436.aClass293_49.method6928());
					Static177.method2690("O(s): " + Static479.aClass348_1.aClass239_1.method5777() + "/" + Static479.aClass348_1.aClass239_1.method5775());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static177.method2690("Pos: " + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 + "," + (Static113.anInt1785 + (Static70.anInt9231 >> 9) >> 6) + "," + (Static622.anInt10087 + (Static646.anInt10445 >> 9) >> 6) + "," + (Static113.anInt1785 + (Static70.anInt9231 >> 9) & 0x3F) + "," + ((Static646.anInt10445 >> 9) + Static622.anInt10087 & 0x3F) + " Height: " + (Static600.method8378(Static646.anInt10445, Static70.anInt9231, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) - Static216.anInt3726));
					Static177.method2690("Look: " + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 + "," + (Static2.anInt7 + Static113.anInt1785 >> 6) + "," + (Static477.anInt7975 + Static622.anInt10087 >> 6) + "," + (Static113.anInt1785 + Static2.anInt7 & 0x3F) + "," + (Static622.anInt10087 + Static477.anInt7975 & 0x3F) + " Height: " + (Static600.method8378(Static477.anInt7975, Static2.anInt7, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) - Static193.anInt3440));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static309.aBoolean452 = !Static309.aBoolean452;
					Static485.aClass126_17.method7022(Static309.aBoolean452);
					Static582.method8176();
					Static177.method2690("showprofiling=" + Static309.aBoolean452);
					return;
				}
				@Pc(1252) String[] local1252;
				@Pc(1241) int local1241;
				if (arg2.startsWith("performancetest")) {
					local271 = -1;
					local1241 = 1000;
					if (arg2.length() > 15) {
						local1252 = Static132.method1987(arg2, ' ');
						try {
							if (local1252.length > 1) {
								local1241 = Integer.parseInt(local1252[1]);
							}
						} catch (@Pc(1265) Throwable local1265) {
						}
						try {
							if (local1252.length > 2) {
								local271 = Integer.parseInt(local1252[2]);
							}
						} catch (@Pc(1278) Throwable local1278) {
						}
					}
					if (local271 != -1) {
						Static177.method2690("Performance: " + Static569.method6634(local271, local1241));
						return;
					}
					Static177.method2690("Java toolkit: " + Static569.method6634(0, local1241));
					Static177.method2690("SSE toolkit:  " + Static569.method6634(2, local1241));
					Static177.method2690("D3D toolkit:  " + Static569.method6634(3, local1241));
					Static177.method2690("GL toolkit:   " + Static569.method6634(1, local1241));
					Static177.method2690("GLX toolkit:  " + Static569.method6634(5, local1241));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static480.aBoolean307 = !Static480.aBoolean307;
					Static177.method2690("nonpcs=" + Static480.aBoolean307);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static427.method6425();
					Static177.method2690("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local271 = Integer.parseInt(arg2.substring(12));
					Static245.method3744(Static558.method7840(local271).aString121, local271);
					Static177.method2690("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static177.method2690("w: " + Static282.aClass109_2.anInt2756);
					return;
				}
				@Pc(1440) Class5_Sub40 local1440;
				if (arg2.startsWith("pc")) {
					local1440 = Static25.method507(Static98.aClass208_2, Static45.aClass181_11);
					local1440.aClass5_Sub12_Sub2_2.method8647(0);
					local1241 = local1440.aClass5_Sub12_Sub2_2.anInt10154;
					local292 = arg2.indexOf(" ", 4);
					local1440.aClass5_Sub12_Sub2_2.method8619(arg2.substring(3, local292));
					Static283.method4245(local1440.aClass5_Sub12_Sub2_2, arg2.substring(local292));
					local1440.aClass5_Sub12_Sub2_2.method8652(local1440.aClass5_Sub12_Sub2_2.anInt10154 - local1241);
					Static612.method8496(local1440);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static159.method2410();
					Static177.method2690("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local271 = 0; local271 < Static605.anIntArray802.length; local271++) {
						if (Static361.aBooleanArray42[local271]) {
							Static605.anIntArray802[local271] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static605.anIntArray802[local271] *= -1;
							}
						}
					}
					Static159.method2410();
					Static177.method2690("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static492.aBoolean700 = true;
					Static227.method3580();
					Static177.method2690("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static492.aBoolean700 = false;
					Static227.method3580();
					Static177.method2690("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static587.method8245();
					Static177.method2690("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static177.method2690(Static286.method7989() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local271 = Integer.parseInt(arg2.substring(17));
					Static177.method2690("varpbit=" + Static564.aClass304_1.method7288(local271));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local271 = Integer.parseInt(arg2.substring(14));
					Static177.method2690("varp=" + Static564.aClass304_1.method7289(local271));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1639) String[] local1639 = Static132.method1987(arg2.substring(12), ' ');
					if (local1639.length >= 2) {
						local1241 = local1639.length <= 2 ? 0 : Integer.parseInt(local1639[2]);
						Static323.method5012(local1639[0], local1639[1], local1241);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static82.method1324();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static82.method1315();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static82.method1315();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local271 = Integer.parseInt(arg2.substring(8));
					Static485.aClass126_17.method6997(local271);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static177.method2690("Active streams: " + Static287.aClass5_Sub16_Sub3_1.method6141());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static420.method6384();
					Static177.method2690("Complete. Toolkit now: " + Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static177.method2690(Static108.aClient1.method1207());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static295.aString75.startsWith("win")) {
						Static578.method8152(new File("C:\\Temp\\heap.dump"));
					} else {
						Static578.method8152(new File("/tmp/heap.dump"));
					}
					Static177.method2690("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static177.method2690("Name: " + Static295.aString75);
					Static177.method2690("Arch: " + Static295.aString74);
					Static177.method2690("Ver: " + Static295.aString76);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local271 = Integer.parseInt(arg2.substring(8, 9));
					Static619.anInt10049 = local271;
					Static532.method7607();
					Static177.method2690("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local271 = arg2.indexOf(32);
					if (local271 < 0) {
						Static177.method2690("Syntax: ortho <n>");
						return;
					}
					local1241 = Static443.method6588(arg2.substring(local271 + 1));
					Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub21_1, local1241);
					Static499.method7307();
					Static71.aBoolean80 = false;
					Static494.method7283();
					if (local1241 == Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586()) {
						Static177.method2690("Successfully changed ortho mode");
						return;
					}
					Static177.method2690("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586() == 0) {
						Static177.method2690("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local271 = Static443.method6588(arg2.substring(arg2.indexOf(32) + 1));
					Static461.anInt7805 = local271;
					Static177.method2690("orthozoom=" + Static461.anInt7805);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local271 = Static443.method6588(arg2.substring(arg2.indexOf(32) + 1));
					Static426.anInt7223 = local271;
					Static208.anInt3630 = local271;
					Static177.method2690("ortho tile size=" + local271);
					Static494.method7283();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static165.aBoolean249 = !Static165.aBoolean249;
					Static177.method2690("ortho camera lock is " + (Static165.aBoolean249 ? "on" : "off"));
					return;
				}
				@Pc(1985) File local1985;
				if (arg2.startsWith("setoutput ")) {
					local1985 = new File(arg2.substring(10));
					if (local1985.exists()) {
						local1985 = new File(arg2.substring(10) + "." + Static205.method3179() + ".log");
						if (local1985.exists()) {
							Static177.method2690("file already exists!");
							return;
						}
					}
					if (Static425.aFileOutputStream1 != null) {
						Static425.aFileOutputStream1.close();
						Static425.aFileOutputStream1 = null;
					}
					try {
						Static425.aFileOutputStream1 = new FileOutputStream(local1985);
						return;
					} catch (@Pc(2027) FileNotFoundException local2027) {
						Static177.method2690("Could not create " + local1985.getName());
						return;
					} catch (@Pc(2039) SecurityException local2039) {
						Static177.method2690("Cannot write to " + local1985.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static425.aFileOutputStream1 != null) {
						Static425.aFileOutputStream1.close();
					}
					Static425.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1985 = new File(arg2.substring(10));
					if (!local1985.exists()) {
						Static177.method2690("No such file");
						return;
					}
					@Pc(2083) byte[] local2083 = Static443.method6585(local1985);
					if (local2083 == null) {
						Static177.method2690("Failed to read file");
						return;
					}
					local1252 = Static132.method1987(Static151.method2203(Static490.method7198(local2083), ""), '\n');
					Static205.method3177(local1252);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2118) short local2118 = (short) Static443.method6588(arg2.substring(5));
					if (local2118 > 0) {
						Static88.aShort20 = local2118;
					}
					return;
				}
				if (Static469.anInt7883 == 10) {
					local1440 = Static25.method507(Static98.aClass208_2, Static56.aClass181_14);
					local1440.aClass5_Sub12_Sub2_2.method8647(arg2.length() + 3);
					local1440.aClass5_Sub12_Sub2_2.method8647(arg0 ? 1 : 0);
					local1440.aClass5_Sub12_Sub2_2.method8647(arg1 ? 1 : 0);
					local1440.aClass5_Sub12_Sub2_2.method8619(arg2);
					Static612.method8496(local1440);
				}
				if (arg2.startsWith("fps ") && Static34.aClass346_2 != Static363.aClass346_4) {
					Static33.method626(Static443.method6588(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2185) Exception local2185) {
				Static177.method2690(Static76.aClass58_2.method1237(Static321.anInt5554));
				return;
			}
		}
		if (Static469.anInt7883 != 10) {
			Static177.method2690(Static76.aClass58_3.method1237(Static321.anInt5554) + arg2);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)B")
	public static byte method6597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
