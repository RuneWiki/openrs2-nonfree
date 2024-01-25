import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public static int anInt8741;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
	public static void method7437() {
		Static367.aClass65_11.method6888(Static360.aFloat123, Static542.aFloat122, Static17.aFloat1);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Z")
	public static boolean method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static72.method978(arg1)) {
			return true;
		} else {
			return !Static72.method978(arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLjava/lang/String;ZB)V")
	public static void method7439(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static574.method7927("commands - This command");
				Static574.method7927("cls - Clear console");
				Static574.method7927("displayfps - Toggle FPS and other information");
				Static574.method7927("renderer - Print graphics renderer information");
				Static574.method7927("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static6.anInt66 = 0;
				Static151.anInt3096 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static198.aBoolean709 = !Static198.aBoolean709;
				if (Static198.aBoolean709) {
					Static574.method7927("FPS on");
					return;
				}
				Static574.method7927("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(71) Class118 local71 = Static208.aClass65_7.method6878();
				Static574.method7927("Vendor: " + local71.anInt3332);
				Static574.method7927("Name: " + local71.aString20);
				Static574.method7927("Version: " + local71.anInt3328);
				Static574.method7927("Device: " + local71.aString21);
				Static574.method7927("Driver Version: " + local71.aLong65);
				return;
			}
			if (arg1.equals("heap")) {
				Static574.method7927("Heap: " + Static631.anInt10279 + "MB");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static574.method7927(Static64.aClass52_2.method907(Static544.anInt8937));
			return;
		}
		if (Static560.aClass187_13 != Static217.aClass187_7 || Static105.anInt2257 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static574.method7927("FPS: " + Static457.anInt7750);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static37.aBoolean43 = !Static37.aBoolean43;
					if (Static37.aBoolean43) {
						Static574.method7927("Occlsion now on!");
						return;
					}
					Static574.method7927("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static198.aBoolean709 = true;
					Static574.method7927("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static198.aBoolean709 = false;
					Static574.method7927("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static574.method7927("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static580.aClass5_Sub30_1.anInt4762 + "Mb");
						return;
					} catch (@Pc(249) Throwable local249) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static394.aClass156_4.method3782();
					Static574.method7927("Text coords cleared");
					return;
				}
				@Pc(287) int local287;
				@Pc(269) int local269;
				@Pc(277) Runtime local277;
				if (arg1.equalsIgnoreCase("gc")) {
					Static15.method207();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static574.method7927("mem=" + local287 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static15.method207();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static574.method7927("Memory before cleanup=" + local287 + "k");
					Static486.method6993();
					Static15.method207();
					for (@Pc(341) int local341 = 0; local341 < 10; local341++) {
						System.gc();
					}
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static574.method7927("Memory after cleanup=" + local287 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static574.method7927(Static95.method5783() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static574.method7927("Dropped client connection");
					if (Static173.anInt3397 == 10) {
						Static243.method3796();
						return;
					}
					if (Static173.anInt3397 == 11) {
						Static419.aBoolean638 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static514.aClass395_4.method9035();
					Static574.method7927("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static671.aClass296_3.method7085();
					Static574.method7927("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static671.aClass296_3.method7097();
					Static574.method7927("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static570.aClass268_5.method6329();
					Static12.aClass244_1.method5751();
					Static671.aClass296_3.method7087();
					Static574.method7927("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static248.method3851();
					Static551.method7650();
					Static574.method7927("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static504.aLong238 = Static547.method7619();
					Static288.aBoolean486 = true;
					Static248.method3851();
					Static551.method7650();
					Static574.method7927("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static279.method4512(-1, false, 1, -1);
					if (Static469.method6688() == 1) {
						Static574.method7927("wm1 succeeded");
						return;
					}
					Static574.method7927("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static279.method4512(-1, false, 2, -1);
					if (Static469.method6688() == 2) {
						Static574.method7927("wm2 succeeded");
						return;
					}
					Static574.method7927("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static279.method4512(768, false, 3, 1024);
					if (Static469.method6688() != 3) {
						Static574.method7927("wm3 failed");
						return;
					}
					Static574.method7927("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static428.method6321(0, false);
					if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 0) {
						Static574.method7927("Entered tk0");
						Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					Static574.method7927("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static428.method6321(1, false);
					if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 1) {
						Static574.method7927("Entered tk1");
						Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					Static574.method7927("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static428.method6321(2, false);
					if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 2) {
						Static574.method7927("Entered tk2");
						Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					Static574.method7927("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static428.method6321(3, false);
					if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 3) {
						Static574.method7927("Failed to enter tk3");
						return;
					}
					Static574.method7927("Entered tk3");
					Static172.aClass5_Sub50_14.method7531(3, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
					Static102.method1995();
					Static244.aBoolean480 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static428.method6321(5, false);
					if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 5) {
						Static574.method7927("Entered tk5");
						Static172.aClass5_Sub50_14.method7531(5, Static172.aClass5_Sub50_14.aClass12_Sub16_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						return;
					}
					Static574.method7927("Failed to enter tk5");
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static574.method7927("Invalid buildarea value");
						return;
					}
					local269 = Static270.method4173(arg1.substring(6));
					if (local269 >= 0 && local269 <= Static474.method6790(Static631.anInt10279)) {
						Static172.aClass5_Sub50_14.method7531(local269, Static172.aClass5_Sub50_14.aClass12_Sub1_1);
						Static102.method1995();
						Static244.aBoolean480 = false;
						Static574.method7927("maxbuildarea=" + Static172.aClass5_Sub50_14.aClass12_Sub1_1.method191());
						return;
					}
					Static574.method7927("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static574.method7927("Invalid rect_debug value");
						return;
					}
					Static332.anInt6133 = Static270.method4173(arg1.substring(10).trim());
					Static574.method7927("rect_debug=" + Static332.anInt6133);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static202.aBoolean307 = true;
					Static574.method7927("qa_op_test=" + Static202.aBoolean307);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static547.aBoolean764 = !Static547.aBoolean764;
					Static574.method7927("clipcomponents=" + Static547.aBoolean764);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(856) boolean local856 = Static208.aClass65_7.method6934();
					if (Static477.method6823(!local856)) {
						if (!local856) {
							Static574.method7927("Bloom enabled");
							return;
						}
						Static574.method7927("Bloom disabled");
						return;
					}
					Static574.method7927("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static31.aBoolean30) {
						Static31.aBoolean30 = true;
						Static574.method7927("Forced tweening ENABLED!");
						return;
					}
					Static31.aBoolean30 = false;
					Static574.method7927("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (!Static157.aBoolean262) {
						Static574.method7927("Shift-click ENABLED!");
						Static157.aBoolean262 = true;
						return;
					}
					Static574.method7927("Shift-click disabled.");
					Static157.aBoolean262 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static574.method7927("x:" + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9) + " z:" + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static574.method7927("Height: " + Static495.aClass109Array4[Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145].method7695(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static257.aClass390_60.method8907();
					Static257.aClass390_60.method8930();
					Static367.aClass365_4.method8485();
					Static49.aClass93_1.method2281();
					Static551.method7650();
					Static574.method7927("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static208.aClass65_7.method6883()) {
						local269 = Integer.parseInt(arg1.substring(3));
						if (local269 < 1) {
							local269 = 1;
						} else if (local269 > 4) {
							local269 = 4;
						}
						Static396.anInt7026 = local269;
						Static248.method3851();
						Static574.method7927("Render cores now: " + Static396.anInt7026);
						return;
					}
					Static574.method7927("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static574.method7927("I(s): " + Static505.aClass340_50.method7992() + "/" + Static505.aClass340_50.method7994());
					Static574.method7927("I(m): " + Static598.aClass340_61.method7992() + "/" + Static598.aClass340_61.method7994());
					Static574.method7927("O(s): " + Static110.aClass105_1.aClass84_1.method2095() + "/" + Static110.aClass105_1.aClass84_1.method2084());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static574.method7927("Pos: " + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 + "," + ((Static332.anInt6132 >> 9) + Static153.anInt3147 >> 6) + "," + ((Static407.anInt7215 >> 9) + Static201.anInt3839 >> 6) + "," + (Static153.anInt3147 + (Static332.anInt6132 >> 9) & 0x3F) + "," + (Static201.anInt3839 + (Static407.anInt7215 >> 9) & 0x3F) + " Height: " + (Static441.method6444(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145, Static332.anInt6132, Static407.anInt7215) - Static200.anInt3808));
					Static574.method7927("Look: " + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 + "," + (Static153.anInt3147 + Static392.anInt6960 >> 6) + "," + (Static260.anInt4823 + Static201.anInt3839 >> 6) + "," + (Static153.anInt3147 + Static392.anInt6960 & 0x3F) + "," + (Static260.anInt4823 + Static201.anInt3839 & 0x3F) + " Height: " + (Static441.method6444(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145, Static392.anInt6960, Static260.anInt4823) - Static201.anInt3831));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static323.aBoolean536 = !Static323.aBoolean536;
					Static208.aClass65_7.method6944(Static323.aBoolean536);
					Static106.method2039();
					Static574.method7927("showprofiling=" + Static323.aBoolean536);
					return;
				}
				@Pc(1262) String[] local1262;
				@Pc(1251) int local1251;
				if (arg1.startsWith("performancetest")) {
					local269 = -1;
					local1251 = 1000;
					if (arg1.length() > 15) {
						local1262 = Static147.method2668(' ', arg1);
						try {
							if (local1262.length > 1) {
								local1251 = Integer.parseInt(local1262[1]);
							}
						} catch (@Pc(1273) Throwable local1273) {
						}
						try {
							if (local1262.length > 2) {
								local269 = Integer.parseInt(local1262[2]);
							}
						} catch (@Pc(1286) Throwable local1286) {
						}
					}
					if (local269 != -1) {
						Static574.method7927("Performance: " + Static293.method4687(local1251, local269));
						return;
					}
					Static574.method7927("Java toolkit: " + Static293.method4687(local1251, 0));
					Static574.method7927("SSE toolkit:  " + Static293.method4687(local1251, 2));
					Static574.method7927("D3D toolkit:  " + Static293.method4687(local1251, 3));
					Static574.method7927("GL toolkit:   " + Static293.method4687(local1251, 1));
					Static574.method7927("GLX toolkit:  " + Static293.method4687(local1251, 5));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static628.aBoolean873 = !Static628.aBoolean873;
					Static574.method7927("nonpcs=" + Static628.aBoolean873);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static477.method6824();
					Static574.method7927("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local269 = Integer.parseInt(arg1.substring(12));
					Static409.method6020(local269, Static603.method8261(local269).aString2);
					Static574.method7927("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static574.method7927("w: " + Static514.aClass395_4.anInt10873);
					return;
				}
				@Pc(1439) Class5_Sub21 local1439;
				if (arg1.startsWith("pc")) {
					local1439 = Static64.method905(Static263.aClass49_1, Static586.aClass305_94);
					local1439.aClass5_Sub41_Sub2_1.method7798(0);
					local1251 = local1439.aClass5_Sub41_Sub2_1.anInt9230;
					local287 = arg1.indexOf(" ", 4);
					local1439.aClass5_Sub41_Sub2_1.method7854(arg1.substring(3, local287));
					Static415.method6168(local1439.aClass5_Sub41_Sub2_1, arg1.substring(local287));
					local1439.aClass5_Sub41_Sub2_1.method7839(local1439.aClass5_Sub41_Sub2_1.anInt9230 - local1251);
					Static495.method7092(local1439);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static431.method6343();
					Static574.method7927("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local269 = 0; local269 < Static326.anIntArray342.length; local269++) {
						if (Static180.aBooleanArray15[local269]) {
							Static326.anIntArray342[local269] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static326.anIntArray342[local269] *= -1;
							}
						}
					}
					Static431.method6343();
					Static574.method7927("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static536.aBoolean753 = true;
					Static551.method7650();
					Static574.method7927("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static536.aBoolean753 = false;
					Static551.method7650();
					Static574.method7927("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static341.method5193();
					Static574.method7927("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static574.method7927(Static222.method3494() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local269 = Integer.parseInt(arg1.substring(17));
					Static574.method7927("varpbit=" + Static161.aClass237_3.method5678(local269));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local269 = Integer.parseInt(arg1.substring(14));
					Static574.method7927("varp=" + Static161.aClass237_3.method5679(local269));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1644) String[] local1644 = Static147.method2668(' ', arg1.substring(12));
					if (local1644.length >= 2) {
						local1251 = local1644.length > 2 ? Integer.parseInt(local1644[2]) : 0;
						Static365.method5530(local1644[1], local1251, local1644[0]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static652.method8746();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static652.method8741();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static652.method8741();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local269 = Integer.parseInt(arg1.substring(8));
					Static208.aClass65_7.method6911(local269);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static574.method7927("Active streams: " + Static245.aClass5_Sub17_Sub4_2.method6187());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static526.method7436();
					Static574.method7927("Complete. Toolkit now: " + Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static574.method7927(Static209.aClient2.method1794());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static429.aString64.startsWith("win")) {
						Static518.method7339(new File("C:\\Temp\\heap.dump"));
					} else {
						Static518.method7339(new File("/tmp/heap.dump"));
					}
					Static574.method7927("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static574.method7927("Name: " + Static429.aString64);
					Static574.method7927("Arch: " + Static429.aString65);
					Static574.method7927("Ver: " + Static429.aString69);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local269 = Integer.parseInt(arg1.substring(8, 9));
					Static109.anInt2332 = local269;
					Static248.method3851();
					Static574.method7927("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local269 = arg1.indexOf(32);
					if (local269 < 0) {
						Static574.method7927("Syntax: ortho <n>");
						return;
					}
					local1251 = Static270.method4173(arg1.substring(local269 + 1));
					Static172.aClass5_Sub50_14.method7531(local1251, Static172.aClass5_Sub50_14.aClass12_Sub24_1);
					Static102.method1995();
					Static244.aBoolean480 = false;
					Static517.method7322();
					if (local1251 != Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854()) {
						Static574.method7927("Failed to change ortho mode");
						return;
					}
					Static574.method7927("Successfully changed ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854() == 0) {
						Static574.method7927("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local269 = Static270.method4173(arg1.substring(arg1.indexOf(32) + 1));
					Static483.anInt8098 = local269;
					Static574.method7927("orthozoom=" + Static483.anInt8098);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local269 = Static270.method4173(arg1.substring(arg1.indexOf(32) + 1));
					Static507.anInt8521 = local269;
					Static217.anInt4055 = local269;
					Static574.method7927("ortho tile size=" + local269);
					Static517.method7322();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static35.aBoolean38 = !Static35.aBoolean38;
					Static574.method7927("ortho camera lock is " + (Static35.aBoolean38 ? "on" : "off"));
					return;
				}
				@Pc(1991) File local1991;
				if (arg1.startsWith("setoutput ")) {
					local1991 = new File(arg1.substring(10));
					if (local1991.exists()) {
						local1991 = new File(arg1.substring(10) + "." + Static547.method7619() + ".log");
						if (local1991.exists()) {
							Static574.method7927("file already exists!");
							return;
						}
					}
					if (Static64.aFileOutputStream1 != null) {
						Static64.aFileOutputStream1.close();
						Static64.aFileOutputStream1 = null;
					}
					try {
						Static64.aFileOutputStream1 = new FileOutputStream(local1991);
						return;
					} catch (@Pc(2033) FileNotFoundException local2033) {
						Static574.method7927("Could not create " + local1991.getName());
						return;
					} catch (@Pc(2045) SecurityException local2045) {
						Static574.method7927("Cannot write to " + local1991.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static64.aFileOutputStream1 != null) {
						Static64.aFileOutputStream1.close();
					}
					Static64.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local1991 = new File(arg1.substring(10));
					if (!local1991.exists()) {
						Static574.method7927("No such file");
						return;
					}
					@Pc(2089) byte[] local2089 = Static125.method2265(local1991);
					if (local2089 == null) {
						Static574.method7927("Failed to read file");
						return;
					}
					local1262 = Static147.method2668('\n', Static669.method8928("", Static149.method2715(local2089)));
					Static102.method1990(local1262);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2122) short local2122 = (short) Static270.method4173(arg1.substring(5));
					if (local2122 > 0) {
						Static524.aShort82 = local2122;
					}
					return;
				}
				if (Static173.anInt3397 == 10) {
					local1439 = Static64.method905(Static263.aClass49_1, Static536.aClass305_85);
					local1439.aClass5_Sub41_Sub2_1.method7798(arg1.length() + 3);
					local1439.aClass5_Sub41_Sub2_1.method7798(arg0 ? 1 : 0);
					local1439.aClass5_Sub41_Sub2_1.method7798(arg2 ? 1 : 0);
					local1439.aClass5_Sub41_Sub2_1.method7854(arg1);
					Static495.method7092(local1439);
				}
				if (arg1.startsWith("fps ") && Static560.aClass187_13 != Static217.aClass187_7) {
					Static500.method7128(Static270.method4173(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2193) Exception local2193) {
				Static574.method7927(Static64.aClass52_2.method907(Static544.anInt8937));
				return;
			}
		}
		if (Static173.anInt3397 != 10) {
			Static574.method7927(Static64.aClass52_3.method907(Static544.anInt8937) + arg1);
		}
	}
}
