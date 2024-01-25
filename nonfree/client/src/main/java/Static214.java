import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
	public static final int[] anIntArray237 = new int[3];

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public static int anInt4424 = 0;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_7 = new Class178(13, 0, 1, 0);

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	public static int anInt4427 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!uq;)V")
	public static void method3762(@OriginalArg(0) Class9_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class9_Sub2 local7 = null;
			for (@Pc(11) Class9_Sub2 local11 = Static463.aClass9_Sub2Array6[local4]; local11 != null; local11 = local11.aClass9_Sub2_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static463.aClass9_Sub2Array6[local4] = local11.aClass9_Sub2_23;
					} else {
						local7.aClass9_Sub2_23 = local11.aClass9_Sub2_23;
					}
					Static334.aBoolean462 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class9_Sub2 local43 = Static250.aClass9_Sub2Array5[local4]; local43 != null; local43 = local43.aClass9_Sub2_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static250.aClass9_Sub2Array5[local4] = local43.aClass9_Sub2_23;
					} else {
						local7.aClass9_Sub2_23 = local43.aClass9_Sub2_23;
					}
					Static334.aBoolean462 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class9_Sub2 local75 = Static164.aClass9_Sub2Array1[local4]; local75 != null; local75 = local75.aClass9_Sub2_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static164.aClass9_Sub2Array1[local4] = local75.aClass9_Sub2_23;
					} else {
						local7.aClass9_Sub2_23 = local75.aClass9_Sub2_23;
					}
					Static334.aBoolean462 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;ZZ)V")
	public static void method3768(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static8.method147("commands - This command");
				Static8.method147("cls - Clear console");
				Static8.method147("displayfps - Toggle FPS and other information");
				Static8.method147("renderer - Print graphics renderer information");
				Static8.method147("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt4424 = 0;
				Static505.anInt8524 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static196.aBoolean264 = !Static196.aBoolean264;
				if (Static196.aBoolean264) {
					Static8.method147("FPS on");
					return;
				}
				Static8.method147("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(65) Class98 local65 = Static266.aClass82_8.method6119();
				Static8.method147("Vendor: " + local65.anInt2850);
				Static8.method147("Name: " + local65.aString18);
				Static8.method147("Version: " + local65.anInt2849);
				Static8.method147("Device: " + local65.aString19);
				Static8.method147("Driver Version: " + local65.aLong78);
				return;
			}
			if (arg0.equals("heap")) {
				Static8.method147("Heap: " + Static248.anInt4899 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static8.method147(Static369.aClass235_4.method5893(Static455.anInt7738));
			return;
		}
		if (Static508.aClass220_11 != Static38.aClass220_2 || Static544.anInt9130 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static8.method147("FPS: " + Static557.anInt9262);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static480.aBoolean590 = !Static480.aBoolean590;
					if (Static480.aBoolean590) {
						Static8.method147("Occlsion now on!");
						return;
					}
					Static8.method147("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static196.aBoolean264 = true;
					Static8.method147("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static196.aBoolean264 = false;
					Static8.method147("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static8.method147("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static545.aClass3_Sub38_1.anInt7213 + "Mb");
						return;
					} catch (@Pc(243) Throwable local243) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static169.aClass139_4.method3201();
					Static8.method147("Text coords cleared");
					return;
				}
				@Pc(283) int local283;
				@Pc(263) int local263;
				@Pc(274) Runtime local274;
				if (arg0.equalsIgnoreCase("gc")) {
					Static515.method7512();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local283 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static8.method147("mem=" + local283 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static515.method7512();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local283 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static8.method147("Memory before cleanup=" + local283 + "k");
					Static407.method6327();
					Static515.method7512();
					for (@Pc(341) int local341 = 0; local341 < 10; local341++) {
						System.gc();
					}
					local283 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static8.method147("Memory after cleanup=" + local283 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static8.method147(Static312.method5234() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static8.method147("Dropped client connection");
					if (Static82.anInt1653 == 10) {
						Static114.method2111();
					} else if (Static82.anInt1653 == 11) {
						Static303.aBoolean610 = true;
						return;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static28.aClass157_1.method3977();
					Static8.method147("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static186.aClass323_1.method7827();
					Static8.method147("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static186.aClass323_1.method7825();
					Static8.method147("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static48.aClass298_12.method7285();
					Static547.aClass197_1.method5193();
					Static186.aClass323_1.method7824();
					Static8.method147("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static1.method8036();
					Static218.method3802();
					Static8.method147("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static257.aLong135 = Static191.method3071();
					Static65.aBoolean79 = true;
					Static1.method8036();
					Static218.method3802();
					Static8.method147("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static545.method7843(-1, 1, -1, false);
					if (Static339.method917() != 1) {
						Static8.method147("wm1 failed");
						return;
					}
					Static8.method147("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static545.method7843(-1, 2, -1, false);
					if (Static339.method917() != 2) {
						Static8.method147("wm2 failed");
						return;
					}
					Static8.method147("wm2 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static545.method7843(768, 3, 1024, false);
					if (Static339.method917() != 3) {
						Static8.method147("wm3 failed");
						return;
					}
					Static8.method147("wm3 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static230.method3973(0, false);
					if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 0) {
						Static8.method147("Failed to enter tk0");
						return;
					}
					Static8.method147("Entered tk0");
					Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
					Static124.method2223();
					Static576.aBoolean708 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static230.method3973(1, false);
					if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 1) {
						Static8.method147("Entered tk1");
						Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					Static8.method147("Failed to enter tk1");
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static230.method3973(2, false);
					if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 2) {
						Static8.method147("Entered tk2");
						Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					Static8.method147("Failed to enter tk2");
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static230.method3973(3, false);
					if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 3) {
						Static8.method147("Entered tk3");
						Static32.aClass3_Sub41_3.method6773(3, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					Static8.method147("Failed to enter tk3");
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static230.method3973(5, false);
					if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() == 5) {
						Static8.method147("Entered tk5");
						Static32.aClass3_Sub41_3.method6773(5, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						return;
					}
					Static8.method147("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static8.method147("Invalid buildarea value");
						return;
					}
					local263 = Static508.method7720(arg0.substring(6));
					if (local263 >= 0 && local263 <= Static629.method8523(Static248.anInt4899)) {
						Static32.aClass3_Sub41_3.method6773(local263, Static32.aClass3_Sub41_3.aClass7_Sub11_1);
						Static124.method2223();
						Static576.aBoolean708 = false;
						Static8.method147("maxbuildarea=" + Static32.aClass3_Sub41_3.aClass7_Sub11_1.method5159());
						return;
					}
					Static8.method147("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static8.method147("Invalid rect_debug value");
						return;
					}
					Static55.anInt1040 = Static508.method7720(arg0.substring(10).trim());
					Static8.method147("rect_debug=" + Static55.anInt1040);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static349.aBoolean768 = true;
					Static8.method147("qa_op_test=" + Static349.aBoolean768);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static603.aBoolean740 = !Static603.aBoolean740;
					Static8.method147("clipcomponents=" + Static603.aBoolean740);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(852) boolean local852 = Static266.aClass82_8.method6103();
					if (!Static64.method1059(!local852)) {
						Static8.method147("Failed to enable bloom");
						return;
					}
					if (local852) {
						Static8.method147("Bloom disabled");
						return;
					}
					Static8.method147("Bloom enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static607.aBoolean749) {
						Static607.aBoolean749 = true;
						Static8.method147("Forced tweening ENABLED!");
						return;
					}
					Static607.aBoolean749 = false;
					Static8.method147("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (!Static327.aBoolean456) {
						Static8.method147("Shift-click ENABLED!");
						Static327.aBoolean456 = true;
						return;
					}
					Static8.method147("Shift-click disabled.");
					Static327.aBoolean456 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static8.method147("x:" + (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9) + " z:" + (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static8.method147("Height: " + Static637.aClass91Array4[Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127].method7724(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static419.aClass343_200.method8141();
					Static419.aClass343_200.method8154();
					Static383.aClass233_150.method5858();
					Static167.aClass154_3.method3946();
					Static218.method3802();
					Static8.method147("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static266.aClass82_8.method6104()) {
						local263 = Integer.parseInt(arg0.substring(3));
						if (local263 < 1) {
							local263 = 1;
						} else if (local263 > 4) {
							local263 = 4;
						}
						Static259.anInt5039 = local263;
						Static1.method8036();
						Static8.method147("Render cores now: " + Static259.anInt5039);
						return;
					}
					Static8.method147("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static8.method147("I(s): " + Static365.aClass136_42.method3139() + "/" + Static365.aClass136_42.method3143());
					Static8.method147("I(m): " + Static552.aClass136_63.method3139() + "/" + Static552.aClass136_63.method3143());
					Static8.method147("O(s): " + Static298.aClass132_1.aClass122_1.method2909() + "/" + Static298.aClass132_1.aClass122_1.method2905());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static8.method147("Pos: " + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 + "," + (Static427.anInt7462 + (Static419.anInt7345 >> 9) >> 6) + "," + (Static22.anInt329 + (Static522.anInt8849 >> 9) >> 6) + "," + ((Static419.anInt7345 >> 9) + Static427.anInt7462 & 0x3F) + "," + ((Static522.anInt8849 >> 9) + Static22.anInt329 & 0x3F) + " Height: " + (Static594.method8211(Static419.anInt7345, Static522.anInt8849, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) - Static13.anInt232));
					Static8.method147("Look: " + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 + "," + (Static427.anInt7462 + Static348.anInt6489 >> 6) + "," + (Static540.anInt9071 + Static22.anInt329 >> 6) + "," + (Static427.anInt7462 + Static348.anInt6489 & 0x3F) + "," + (Static22.anInt329 + Static540.anInt9071 & 0x3F) + " Height: " + (Static594.method8211(Static348.anInt6489, Static540.anInt9071, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127) - Static134.anInt2813));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static628.aBoolean759 = !Static628.aBoolean759;
					Static266.aClass82_8.method6109(Static628.aBoolean759);
					Static470.method6946();
					Static8.method147("showprofiling=" + Static628.aBoolean759);
					return;
				}
				@Pc(1256) String[] local1256;
				@Pc(1245) int local1245;
				if (arg0.startsWith("performancetest")) {
					local263 = -1;
					local1245 = 1000;
					if (arg0.length() > 15) {
						local1256 = Static557.method7916(' ', arg0);
						try {
							if (local1256.length > 1) {
								local1245 = Integer.parseInt(local1256[1]);
							}
						} catch (@Pc(1269) Throwable local1269) {
						}
						try {
							if (local1256.length > 2) {
								local263 = Integer.parseInt(local1256[2]);
							}
						} catch (@Pc(1280) Throwable local1280) {
						}
					}
					if (local263 != -1) {
						Static8.method147("Performance: " + Static163.method2791(local1245, local263));
						return;
					}
					Static8.method147("Java toolkit: " + Static163.method2791(local1245, 0));
					Static8.method147("SSE toolkit:  " + Static163.method2791(local1245, 2));
					Static8.method147("D3D toolkit:  " + Static163.method2791(local1245, 3));
					Static8.method147("GL toolkit:   " + Static163.method2791(local1245, 1));
					Static8.method147("GLX toolkit:  " + Static163.method2791(local1245, 5));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static536.aBoolean672 = !Static536.aBoolean672;
					Static8.method147("nonpcs=" + Static536.aBoolean672);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static145.method3123();
					Static8.method147("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local263 = Integer.parseInt(arg0.substring(12));
					Static567.method8021(local263, Static536.method7772(local263).aString100);
					Static8.method147("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static8.method147("w: " + Static28.aClass157_1.anInt4641);
					return;
				}
				@Pc(1434) Class3_Sub27 local1434;
				if (arg0.startsWith("pc")) {
					local1434 = Static59.method1040(Static325.aClass20_2, Static143.aClass314_46);
					local1434.aClass3_Sub9_Sub2_2.method5572(0);
					local1245 = local1434.aClass3_Sub9_Sub2_2.anInt6453;
					local283 = arg0.indexOf(" ", 4);
					local1434.aClass3_Sub9_Sub2_2.method5638(arg0.substring(3, local283));
					Static525.method7635(arg0.substring(local283), local1434.aClass3_Sub9_Sub2_2);
					local1434.aClass3_Sub9_Sub2_2.method5615(local1434.aClass3_Sub9_Sub2_2.anInt6453 - local1245);
					Static148.method2572(local1434);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static173.method2878();
					Static8.method147("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local263 = 0; local263 < Static584.anIntArray595.length; local263++) {
						if (Static586.aBooleanArray29[local263]) {
							Static584.anIntArray595[local263] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static584.anIntArray595[local263] *= -1;
							}
						}
					}
					Static173.method2878();
					Static8.method147("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static630.aBoolean760 = true;
					Static218.method3802();
					Static8.method147("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static630.aBoolean760 = false;
					Static218.method3802();
					Static8.method147("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static393.method7906();
					Static8.method147("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static8.method147(Static576.method8076() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local263 = Integer.parseInt(arg0.substring(17));
					Static8.method147("varpbit=" + Static183.aClass285_1.method6938(local263));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local263 = Integer.parseInt(arg0.substring(14));
					Static8.method147("varp=" + Static183.aClass285_1.method6939(local263));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1637) String[] local1637 = Static557.method7916(' ', arg0.substring(12));
					if (local1637.length >= 2) {
						local1245 = local1637.length <= 2 ? 0 : Integer.parseInt(local1637[2]);
						Static4.method75(local1245, local1637[1], local1637[0]);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static400.method6279();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static400.method6285();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static400.method6285();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local263 = Integer.parseInt(arg0.substring(8));
					Static266.aClass82_8.method6155(local263);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static8.method147("Active streams: " + Static304.aClass3_Sub3_Sub3_3.method2977());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static188.method3054();
					Static8.method147("Complete. Toolkit now: " + Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static8.method147(Static554.aClient1.method1301());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static501.aString78.startsWith("win")) {
						Static37.method553(new File("C:\\Temp\\heap.dump"));
					} else {
						Static37.method553(new File("/tmp/heap.dump"));
					}
					Static8.method147("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static8.method147("Name: " + Static501.aString78);
					Static8.method147("Arch: " + Static501.aString75);
					Static8.method147("Ver: " + Static501.aString77);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local263 = Integer.parseInt(arg0.substring(8, 9));
					Static109.anInt2200 = local263;
					Static1.method8036();
					Static8.method147("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local263 = arg0.indexOf(32);
					if (local263 < 0) {
						Static8.method147("Syntax: ortho <n>");
						return;
					}
					local1245 = Static508.method7720(arg0.substring(local263 + 1));
					Static32.aClass3_Sub41_3.method6773(local1245, Static32.aClass3_Sub41_3.aClass7_Sub4_1);
					Static124.method2223();
					Static576.aBoolean708 = false;
					Static592.method8210();
					if (local1245 != Static32.aClass3_Sub41_3.aClass7_Sub4_1.method1402()) {
						Static8.method147("Failed to change ortho mode");
						return;
					}
					Static8.method147("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static32.aClass3_Sub41_3.aClass7_Sub4_1.method1402() == 0) {
						Static8.method147("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local263 = Static508.method7720(arg0.substring(arg0.indexOf(32) + 1));
					Static562.anInt9324 = local263;
					Static8.method147("orthozoom=" + Static562.anInt9324);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local263 = Static508.method7720(arg0.substring(arg0.indexOf(32) + 1));
					Static126.anInt2687 = local263;
					Static576.anInt9426 = local263;
					Static8.method147("ortho tile size=" + local263);
					Static592.method8210();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static207.aBoolean270 = !Static207.aBoolean270;
					Static8.method147("ortho camera lock is " + (Static207.aBoolean270 ? "on" : "off"));
					return;
				}
				@Pc(1979) File local1979;
				if (arg0.startsWith("setoutput ")) {
					local1979 = new File(arg0.substring(10));
					if (local1979.exists()) {
						local1979 = new File(arg0.substring(10) + "." + Static191.method3071() + ".log");
						if (local1979.exists()) {
							Static8.method147("file already exists!");
							return;
						}
					}
					if (Static638.aFileOutputStream1 != null) {
						Static638.aFileOutputStream1.close();
						Static638.aFileOutputStream1 = null;
					}
					try {
						Static638.aFileOutputStream1 = new FileOutputStream(local1979);
						return;
					} catch (@Pc(2021) FileNotFoundException local2021) {
						Static8.method147("Could not create " + local1979.getName());
						return;
					} catch (@Pc(2033) SecurityException local2033) {
						Static8.method147("Cannot write to " + local1979.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static638.aFileOutputStream1 != null) {
						Static638.aFileOutputStream1.close();
					}
					Static638.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local1979 = new File(arg0.substring(10));
					if (!local1979.exists()) {
						Static8.method147("No such file");
						return;
					}
					@Pc(2077) byte[] local2077 = Static20.method262(local1979);
					if (local2077 == null) {
						Static8.method147("Failed to read file");
						return;
					}
					local1256 = Static557.method7916('\n', Static29.method386("", Static97.method1658(local2077)));
					Static440.method6626(local1256);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2108) short local2108 = (short) Static508.method7720(arg0.substring(5));
					if (local2108 > 0) {
						Static584.aShort113 = local2108;
					}
					return;
				}
				if (Static82.anInt1653 == 10) {
					local1434 = Static59.method1040(Static325.aClass20_2, Static646.aClass314_75);
					local1434.aClass3_Sub9_Sub2_2.method5572(arg0.length() + 3);
					local1434.aClass3_Sub9_Sub2_2.method5572(arg1 ? 1 : 0);
					local1434.aClass3_Sub9_Sub2_2.method5572(arg2 ? 1 : 0);
					local1434.aClass3_Sub9_Sub2_2.method5638(arg0);
					Static148.method2572(local1434);
				}
				if (arg0.startsWith("fps ") && Static38.aClass220_2 != Static508.aClass220_11) {
					Static526.method7676(Static508.method7720(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2175) Exception local2175) {
				Static8.method147(Static369.aClass235_4.method5893(Static455.anInt7738));
				return;
			}
		}
		if (Static82.anInt1653 != 10) {
			Static8.method147(Static369.aClass235_5.method5893(Static455.anInt7738) + arg0);
		}
	}
}
