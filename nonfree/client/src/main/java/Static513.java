import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!ri;")
	public static Class284 aClass284_146;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/lang/String;ZB)V")
	public static void method6930(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			label692: {
				if (!arg1.equalsIgnoreCase("commands") && !arg1.equalsIgnoreCase("help")) {
					if (!arg1.equalsIgnoreCase("cls")) {
						if (arg1.equalsIgnoreCase("displayfps")) {
							Static306.aBoolean385 = !Static306.aBoolean385;
							if (!Static306.aBoolean385) {
								Static196.method3426("FPS off");
								return;
							}
							Static196.method3426("FPS on");
							return;
						}
						if (arg1.equals("renderer")) {
							@Pc(65) Class102 local65 = Static319.aClass31_11.method8041();
							Static196.method3426("Vendor: " + local65.anInt3366);
							Static196.method3426("Name: " + local65.aString72);
							Static196.method3426("Version: " + local65.anInt3364);
							Static196.method3426("Device: " + local65.aString73);
							Static196.method3426("Driver Version: " + local65.aLong68);
							return;
						}
						if (arg1.equals("heap")) {
							Static196.method3426("Heap: " + Static372.anInt6489 + "MB");
							return;
						}
						break label692;
					}
					Static340.anInt6134 = 0;
					Static298.anInt5568 = 0;
					return;
				}
				Static196.method3426("commands - This command");
				Static196.method3426("cls - Clear console");
				Static196.method3426("displayfps - Toggle FPS and other information");
				Static196.method3426("renderer - Print graphics renderer information");
				Static196.method3426("heap - Print java memory information");
				return;
			}
		} catch (@Pc(138) Exception local138) {
			Static196.method3426(Static573.aClass350_6.method7730(Static201.anInt4321));
			return;
		}
		if (Static412.aClass5_7 != Static332.aClass5_3 || Static212.anInt5852 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static196.method3426("FPS: " + Static180.anInt3953);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static383.aBoolean467 = !Static383.aBoolean467;
					if (!Static383.aBoolean467) {
						Static196.method3426("Occlsion now off!");
						return;
					}
					Static196.method3426("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static306.aBoolean385 = true;
					Static196.method3426("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static306.aBoolean385 = false;
					Static196.method3426("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static196.method3426("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(249) Throwable local249) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static6.aClass269_1.method5969();
					Static196.method3426("Text coords cleared");
					return;
				}
				@Pc(288) int local288;
				@Pc(269) int local269;
				@Pc(278) Runtime local278;
				if (arg1.equalsIgnoreCase("gc")) {
					Static119.method2327();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local278 = Runtime.getRuntime();
					local288 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static196.method3426("mem=" + local288 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static119.method2327();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local278 = Runtime.getRuntime();
					local288 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static196.method3426("Memory before cleanup=" + local288 + "k");
					Static189.method3320();
					Static119.method2327();
					for (@Pc(345) int local345 = 0; local345 < 10; local345++) {
						System.gc();
					}
					local288 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static196.method3426("Memory after cleanup=" + local288 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static196.method3426(Static186.method3291() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static196.method3426("Dropped client connection");
					if (Static409.anInt1461 == 10) {
						Static318.method4716();
						return;
					}
					if (Static409.anInt1461 == 11) {
						Static116.aBoolean190 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static104.aClass212_1.method4973();
					Static196.method3426("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static153.aClass117_1.method3181();
					Static196.method3426("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static153.aClass117_1.method3173();
					Static196.method3426("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static467.aClass168_12.method4082();
					Static451.aClass223_6.method5111();
					Static153.aClass117_1.method3182();
					Static196.method3426("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static393.method5569();
					Static253.method3969();
					Static196.method3426("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static443.aLong214 = Static96.method2000();
					Static330.aBoolean425 = true;
					Static393.method5569();
					Static253.method3969();
					Static196.method3426("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static276.method4180(false, -1, 1, -1);
					if (Static534.method7318() == 1) {
						Static196.method3426("wm1 succeeded");
						return;
					}
					Static196.method3426("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static276.method4180(false, -1, 2, -1);
					if (Static534.method7318() == 2) {
						Static196.method3426("wm2 succeeded");
						return;
					}
					Static196.method3426("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static276.method4180(false, 1024, 3, 768);
					if (Static534.method7318() == 3) {
						Static196.method3426("wm3 succeeded");
						return;
					}
					Static196.method3426("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static47.method1180(0);
					if (Static37.anInt1122 == 0) {
						Static196.method3426("Entered tk0");
						Static348.aClass3_Sub51_Sub1_5.anInt9955 = 0;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
						return;
					}
					Static196.method3426("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static47.method1180(1);
					if (Static37.anInt1122 == 1) {
						Static196.method3426("Entered tk1");
						Static348.aClass3_Sub51_Sub1_5.anInt9955 = 1;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
						return;
					}
					Static196.method3426("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static47.method1180(2);
					if (Static37.anInt1122 != 2) {
						Static196.method3426("Failed to enter tk2");
						return;
					}
					Static196.method3426("Entered tk2");
					Static348.aClass3_Sub51_Sub1_5.anInt9955 = 2;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static47.method1180(3);
					if (Static37.anInt1122 != 3) {
						Static196.method3426("Failed to enter tk3");
						return;
					}
					Static196.method3426("Entered tk3");
					Static348.aClass3_Sub51_Sub1_5.anInt9955 = 3;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static47.method1180(5);
					if (Static37.anInt1122 == 5) {
						Static196.method3426("Entered tk5");
						Static348.aClass3_Sub51_Sub1_5.anInt9955 = 5;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
						return;
					}
					Static196.method3426("Failed to enter tk5");
					return;
				}
				if (arg1.equalsIgnoreCase("ot")) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean680 = !Static348.aClass3_Sub51_Sub1_5.aBoolean680;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					Static393.method5569();
					Static196.method3426("ot=" + Static348.aClass3_Sub51_Sub1_5.aBoolean680);
					return;
				}
				if (arg1.equalsIgnoreCase("gb")) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean685 = !Static348.aClass3_Sub51_Sub1_5.aBoolean685;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					Static393.method5569();
					Static196.method3426("gb=" + Static348.aClass3_Sub51_Sub1_5.aBoolean685);
					return;
				}
				@Pc(789) int local789;
				if (arg1.startsWith("shadows")) {
					if (arg1.length() < 8) {
						Static196.method3426("Invalid shadows value");
						return;
					}
					@Pc(779) String local779 = arg1.substring(8);
					local789 = Static517.method6956(local779) ? Static406.method5727(local779) : -1;
					if (local789 >= 0 && local789 <= 2) {
						Static348.aClass3_Sub51_Sub1_5.method7828(Static37.anInt1122, local789);
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
						Static393.method5569();
						Static196.method3426("shadows=" + local789);
						return;
					}
					Static196.method3426("Invalid shadows value");
					return;
				}
				if (arg1.startsWith("textures")) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean678 = !Static348.aClass3_Sub51_Sub1_5.aBoolean678;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					Static564.method7698();
					Static393.method5569();
					Static196.method3426("textures=" + Static348.aClass3_Sub51_Sub1_5.aBoolean678);
					return;
				}
				if (arg1.startsWith("lighting")) {
					Static348.aClass3_Sub51_Sub1_5.method7821(Static37.anInt1122, !Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122));
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					Static38.method1056();
					Static564.method7698();
					Static393.method5569();
					Static196.method3426("lighting=" + Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122));
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static196.method3426("Invalid buildarea value");
						return;
					}
					local269 = Static406.method5727(arg1.substring(6));
					if (local269 >= 0 && local269 <= Static275.method4163(Static372.anInt6489)) {
						Static348.aClass3_Sub51_Sub1_5.anInt9946 = local269;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
						Static196.method3426("maxbuildarea=" + Static348.aClass3_Sub51_Sub1_5.anInt9946);
						return;
					}
					Static196.method3426("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static196.method3426("Invalid rect_debug value");
						return;
					}
					Static92.anInt2339 = Static406.method5727(arg1.substring(10).trim());
					Static196.method3426("rect_debug=" + Static92.anInt2339);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static355.aBoolean446 = true;
					Static196.method3426("qa_op_test=" + Static355.aBoolean446);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static313.aBoolean392 = !Static313.aBoolean392;
					Static196.method3426("clipcomponents=" + Static313.aBoolean392);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1019) boolean local1019 = Static319.aClass31_11.method8085();
					if (!Static566.method7707(!local1019)) {
						Static196.method3426("Failed to enable bloom");
						return;
					}
					if (!local1019) {
						Static196.method3426("Bloom enabled");
						return;
					}
					Static196.method3426("Bloom disabled");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static323.aBoolean412) {
						Static323.aBoolean412 = false;
						Static196.method3426("Forced tweening disabled.");
						return;
					}
					Static323.aBoolean412 = true;
					Static196.method3426("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static171.aBoolean264) {
						Static196.method3426("Shift-click disabled.");
						Static171.aBoolean264 = false;
						return;
					}
					Static196.method3426("Shift-click ENABLED!");
					Static171.aBoolean264 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static196.method3426("x:" + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9) + " z:" + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static196.method3426("Height: " + Static256.aClass127Array3[Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117].method7862(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static194.aClass284_60.method6341();
					Static194.aClass284_60.method6334();
					Static493.aClass296_4.method6519();
					Static550.aClass189_3.method4641();
					Static253.method3969();
					Static196.method3426("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static319.aClass31_11.method8018()) {
						local269 = Integer.parseInt(arg1.substring(3));
						if (local269 < 1) {
							local269 = 1;
						} else if (local269 > 4) {
							local269 = 4;
						}
						Static183.anInt4003 = local269;
						Static393.method5569();
						Static196.method3426("Render cores now: " + Static183.anInt4003);
						return;
					}
					Static196.method3426("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static196.method3426("I(s): " + Static527.aClass342_205.method7696() + "/" + Static527.aClass342_205.method7690());
					Static196.method3426("I(m): " + Static472.aClass342_164.method7696() + "/" + Static472.aClass342_164.method7690());
					Static196.method3426("O(s): " + Static272.aClass121_2.aClass207_1.method4899() + "/" + Static272.aClass121_2.aClass207_1.method4905());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static196.method3426("Pos: " + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 + "," + (Static321.anInt5874 + (Static407.anInt7345 >> 9) >> 6) + "," + ((Static418.anInt7466 >> 9) + Static137.anInt3293 >> 6) + "," + (Static321.anInt5874 + (Static407.anInt7345 >> 9) & 0x3F) + "," + (Static137.anInt3293 + (Static418.anInt7466 >> 9) & 0x3F) + " Height: " + (Static78.method3298(Static407.anInt7345, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, Static418.anInt7466) - Static335.anInt6057));
					Static196.method3426("Look: " + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 + "," + (Static321.anInt5874 + Static472.anInt8217 >> 6) + "," + (Static258.anInt5017 + Static137.anInt3293 >> 6) + "," + (Static472.anInt8217 + Static321.anInt5874 & 0x3F) + "," + (Static137.anInt3293 + Static258.anInt5017 & 0x3F) + " Height: " + (Static78.method3298(Static472.anInt8217, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117, Static258.anInt5017) - Static77.anInt2106));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static451.aBoolean554 = !Static451.aBoolean554;
					Static319.aClass31_11.method8061(Static451.aBoolean554);
					Static566.method7705();
					Static196.method3426("showprofiling=" + Static451.aBoolean554);
					return;
				}
				@Pc(1417) String[] local1417;
				if (arg1.startsWith("performancetest")) {
					local269 = -1;
					local789 = 1000;
					if (arg1.length() > 15) {
						local1417 = Static317.method4706(' ', arg1);
						try {
							if (local1417.length > 1) {
								local789 = Integer.parseInt(local1417[1]);
							}
						} catch (@Pc(1428) Throwable local1428) {
						}
						try {
							if (local1417.length > 2) {
								local269 = Integer.parseInt(local1417[2]);
							}
						} catch (@Pc(1441) Throwable local1441) {
						}
					}
					if (local269 != -1) {
						Static196.method3426("Performance: " + Static188.method3311(Static37.anInt1122, local789));
						return;
					}
					Static196.method3426("Java toolkit: " + Static188.method3311(0, local789));
					Static196.method3426("SSE toolkit:  " + Static188.method3311(2, local789));
					Static196.method3426("D3D toolkit:  " + Static188.method3311(3, local789));
					Static196.method3426("GL toolkit:   " + Static188.method3311(1, local789));
					Static196.method3426("GLX toolkit:  " + Static188.method3311(5, local789));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static28.aBoolean23 = !Static28.aBoolean23;
					Static196.method3426("nonpcs=" + Static28.aBoolean23);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static458.method6306();
					Static196.method3426("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local269 = Integer.parseInt(arg1.substring(12));
					Static110.method2208(local269, Static197.method3443(local269).aString30);
					Static196.method3426("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static196.method3426("w: " + Static104.aClass212_1.anInt6145);
					return;
				}
				@Pc(1594) Class3_Sub10 local1594;
				if (arg1.startsWith("pc")) {
					local1594 = Static129.method2403(Static452.aClass353_2, Static155.aClass287_54);
					local1594.aClass3_Sub26_Sub1_1.method6809(0);
					local789 = local1594.aClass3_Sub26_Sub1_1.anInt8703;
					local288 = arg1.indexOf(" ", 4);
					local1594.aClass3_Sub26_Sub1_1.method6772(arg1.substring(3, local288));
					Static548.method7506(local1594.aClass3_Sub26_Sub1_1, arg1.substring(local288));
					local1594.aClass3_Sub26_Sub1_1.method6768(local1594.aClass3_Sub26_Sub1_1.anInt8703 - local789);
					Static193.method3398(local1594);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static176.method3157();
					Static196.method3426("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local269 = 0; local269 < Static161.anIntArray147.length; local269++) {
						if (Static592.aBooleanArray21[local269]) {
							Static161.anIntArray147[local269] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static161.anIntArray147[local269] *= -1;
							}
						}
					}
					Static176.method3157();
					Static196.method3426("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static83.aBoolean166 = true;
					Static253.method3969();
					Static196.method3426("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static83.aBoolean166 = false;
					Static253.method3969();
					Static196.method3426("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static527.method8126();
					Static196.method3426("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static196.method3426(Static489.method7303() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local269 = Integer.parseInt(arg1.substring(17));
					Static196.method3426("varpbit=" + Static206.aClass143_3.method3687(local269));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local269 = Integer.parseInt(arg1.substring(14));
					Static196.method3426("varp=" + Static206.aClass143_3.method3688(local269));
					return;
				}
				if (arg1.startsWith("demologin")) {
					Static360.method8011(false, 0);
					return;
				}
				if (arg1.startsWith("newdemologin")) {
					Static360.method8011(true, 0);
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1811) String[] local1811 = Static317.method4706(' ', arg1.substring(12));
					if (local1811.length >= 2) {
						local789 = local1811.length <= 2 ? 0 : Integer.parseInt(local1811[2]);
						Static431.method5967(local1811[0], local789, local1811[1]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static583.method7928();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static583.method7921();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static583.method7921();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local269 = Integer.parseInt(arg1.substring(8));
					Static319.aClass31_11.method8048(local269);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static196.method3426("Active streams: " + Static354.aClass3_Sub16_Sub4_2.method7759());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static348.aClass3_Sub51_Sub1_5.method7833();
					Static196.method3426("Complete. Toolkit now: " + Static37.anInt1122);
					return;
				}
				if (arg1.equals("errormessage")) {
					Static196.method3426(Static507.aClient1.method1698());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static268.aString130.startsWith("win")) {
						Static102.method2103(new File("C:\\Temp\\heap.dump"));
					} else {
						Static102.method2103(new File("/tmp/heap.dump"));
					}
					Static196.method3426("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static196.method3426("Name: " + Static268.aString130);
					Static196.method3426("Arch: " + Static268.aString129);
					Static196.method3426("Ver: " + Static268.aString132);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local269 = Integer.parseInt(arg1.substring(8, 9));
					Static528.anInt10344 = local269;
					Static393.method5569();
					Static196.method3426("Toggled!");
					return;
				}
				@Pc(2005) File local2005;
				if (arg1.startsWith("setoutput ")) {
					local2005 = new File(arg1.substring(10));
					if (local2005.exists()) {
						local2005 = new File(arg1.substring(10) + "." + Static96.method2000() + ".log");
						if (local2005.exists()) {
							Static196.method3426("file already exists!");
							return;
						}
					}
					if (Static172.aFileOutputStream1 != null) {
						Static172.aFileOutputStream1.close();
						Static172.aFileOutputStream1 = null;
					}
					try {
						Static172.aFileOutputStream1 = new FileOutputStream(local2005);
						return;
					} catch (@Pc(2047) FileNotFoundException local2047) {
						Static196.method3426("Could not create " + local2005.getName());
						return;
					} catch (@Pc(2059) SecurityException local2059) {
						Static196.method3426("Cannot write to " + local2005.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static172.aFileOutputStream1 != null) {
						Static172.aFileOutputStream1.close();
					}
					Static172.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2005 = new File(arg1.substring(10));
					if (!local2005.exists()) {
						Static196.method3426("No such file");
						return;
					}
					@Pc(2103) byte[] local2103 = Static19.method205(local2005);
					if (local2103 == null) {
						Static196.method3426("Failed to read file");
						return;
					}
					local1417 = Static317.method4706('\n', Static223.method3697(Static290.method4344(local2103), ""));
					Static228.method3731(local1417);
					return;
				}
				if (Static409.anInt1461 == 10) {
					local1594 = Static129.method2403(Static452.aClass353_2, Static111.aClass287_40);
					local1594.aClass3_Sub26_Sub1_1.method6809(arg1.length() + 3);
					local1594.aClass3_Sub26_Sub1_1.method6809(arg0 ? 1 : 0);
					local1594.aClass3_Sub26_Sub1_1.method6809(arg2 ? 1 : 0);
					local1594.aClass3_Sub26_Sub1_1.method6772(arg1);
					Static193.method3398(local1594);
				}
				if (arg1.startsWith("fps ") && Static332.aClass5_3 != Static412.aClass5_7) {
					Static336.method4911(Static406.method5727(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2186) Exception local2186) {
				Static196.method3426(Static573.aClass350_6.method7730(Static201.anInt4321));
				return;
			}
		}
		if (Static409.anInt1461 != 10) {
			Static196.method3426(Static573.aClass350_7.method7730(Static201.anInt4321) + arg1);
		}
	}
}
