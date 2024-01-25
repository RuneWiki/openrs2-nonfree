import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!r;")
	public static Class7 aClass7_12;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "[Lclient!baa;")
	public static final Class27[] aClass27Array1 = new Class27[6];

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
	public static final int[] anIntArray330 = new int[3];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZBLjava/lang/String;)V")
	public static void method4762(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static47.method1139("commands - This command");
				Static47.method1139("cls - Clear console");
				Static47.method1139("displayfps - Toggle FPS and other information");
				Static47.method1139("renderer - Print graphics renderer information");
				Static47.method1139("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static85.anInt2259 = 0;
				Static506.anInt9457 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static370.aBoolean508 = !Static370.aBoolean508;
				if (!Static370.aBoolean508) {
					Static47.method1139("FPS off");
					return;
				}
				Static47.method1139("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(65) Class308 local65 = Static39.aClass7_2.method7815();
				Static47.method1139("Vendor: " + local65.anInt9288);
				Static47.method1139("Name: " + local65.aString197);
				Static47.method1139("Version: " + local65.anInt9286);
				Static47.method1139("Device: " + local65.aString196);
				Static47.method1139("Driver Version: " + local65.aLong257);
				return;
			}
			if (arg2.equals("heap")) {
				Static47.method1139("Heap: " + Static503.anInt9410 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static47.method1139(Static223.aClass152_6.method3624(Static142.anInt3088));
			return;
		}
		if (Static342.aClass326_6 != Static383.aClass326_7 || Static100.anInt2432 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static47.method1139("FPS: " + Static90.anInt2299);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static358.aBoolean477 = !Static358.aBoolean477;
					if (Static358.aBoolean477) {
						Static47.method1139("Occlsion now on!");
						return;
					}
					Static47.method1139("Occlsion now off!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static370.aBoolean508 = true;
					Static47.method1139("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static370.aBoolean508 = false;
					Static47.method1139("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static47.method1139("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(248) Throwable local248) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static573.aClass158_20.method3724();
					Static47.method1139("Text coords cleared");
					return;
				}
				@Pc(288) int local288;
				@Pc(268) int local268;
				@Pc(279) Runtime local279;
				if (arg2.equalsIgnoreCase("gc")) {
					Static85.method1795();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local279 = Runtime.getRuntime();
					local288 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static47.method1139("mem=" + local288 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static85.method1795();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local279 = Runtime.getRuntime();
					local288 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static47.method1139("Memory before cleanup=" + local288 + "k");
					Static478.method6940();
					Static85.method1795();
					for (@Pc(346) int local346 = 0; local346 < 10; local346++) {
						System.gc();
					}
					local288 = (int) ((local279.totalMemory() - local279.freeMemory()) / 1024L);
					Static47.method1139("Memory after cleanup=" + local288 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static47.method1139(Static587.method8192() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static47.method1139("Dropped client connection");
					if (Static9.anInt758 == 10) {
						Static114.method2103();
					} else if (Static9.anInt758 == 11) {
						Static24.aBoolean94 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static326.aClass271_2.method6250();
					Static47.method1139("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static433.aClass72_3.method1864();
					Static47.method1139("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static433.aClass72_3.method1850();
					Static47.method1139("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static372.aClass366_5.method8267();
					Static528.aClass36_2.method1993();
					Static433.aClass72_3.method1852();
					Static47.method1139("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static472.method6892();
					Static571.method8034();
					Static47.method1139("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static346.aLong178 = Static112.method2047();
					Static433.aBoolean593 = true;
					Static472.method6892();
					Static571.method8034();
					Static47.method1139("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static503.method7242(-1, 1, false, -1);
					if (Static578.method8122() != 1) {
						Static47.method1139("wm1 failed");
						return;
					}
					Static47.method1139("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static503.method7242(-1, 2, false, -1);
					if (Static578.method8122() == 2) {
						Static47.method1139("wm2 succeeded");
						return;
					}
					Static47.method1139("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static503.method7242(768, 3, false, 1024);
					if (Static578.method8122() != 3) {
						Static47.method1139("wm3 failed");
						return;
					}
					Static47.method1139("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static146.method2531(0);
					if (Static453.anInt8614 == 0) {
						Static47.method1139("Entered tk0");
						Static455.aClass4_Sub35_Sub1_1.anInt9933 = 0;
						Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
						Static556.aBoolean698 = false;
						return;
					}
					Static47.method1139("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static146.method2531(1);
					if (Static453.anInt8614 != 1) {
						Static47.method1139("Failed to enter tk1");
						return;
					}
					Static47.method1139("Entered tk1");
					Static455.aClass4_Sub35_Sub1_1.anInt9933 = 1;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static146.method2531(2);
					if (Static453.anInt8614 != 2) {
						Static47.method1139("Failed to enter tk2");
						return;
					}
					Static47.method1139("Entered tk2");
					Static455.aClass4_Sub35_Sub1_1.anInt9933 = 2;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static146.method2531(3);
					if (Static453.anInt8614 != 3) {
						Static47.method1139("Failed to enter tk3");
						return;
					}
					Static47.method1139("Entered tk3");
					Static455.aClass4_Sub35_Sub1_1.anInt9933 = 3;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static146.method2531(5);
					if (Static453.anInt8614 != 5) {
						Static47.method1139("Failed to enter tk5");
						return;
					}
					Static47.method1139("Entered tk5");
					Static455.aClass4_Sub35_Sub1_1.anInt9933 = 5;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("ot")) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean680 = !Static455.aClass4_Sub35_Sub1_1.aBoolean680;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					Static472.method6892();
					Static47.method1139("ot=" + Static455.aClass4_Sub35_Sub1_1.aBoolean680);
					return;
				}
				if (arg2.equalsIgnoreCase("gb")) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean670 = !Static455.aClass4_Sub35_Sub1_1.aBoolean670;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					Static472.method6892();
					Static47.method1139("gb=" + Static455.aClass4_Sub35_Sub1_1.aBoolean670);
					return;
				}
				@Pc(783) int local783;
				if (arg2.startsWith("shadows")) {
					if (arg2.length() < 8) {
						Static47.method1139("Invalid shadows value");
						return;
					}
					@Pc(773) String local773 = arg2.substring(8);
					local783 = Static256.method4063(local773) ? Static393.method6016(local773) : -1;
					if (local783 >= 0 && local783 <= 2) {
						Static455.aClass4_Sub35_Sub1_1.method7618(Static453.anInt8614, local783);
						Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
						Static556.aBoolean698 = false;
						Static472.method6892();
						Static47.method1139("shadows=" + local783);
						return;
					}
					Static47.method1139("Invalid shadows value");
					return;
				}
				if (arg2.startsWith("textures")) {
					Static455.aClass4_Sub35_Sub1_1.aBoolean675 = !Static455.aClass4_Sub35_Sub1_1.aBoolean675;
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					Static303.method4804();
					Static472.method6892();
					Static47.method1139("textures=" + Static455.aClass4_Sub35_Sub1_1.aBoolean675);
					return;
				}
				if (arg2.startsWith("lighting")) {
					Static455.aClass4_Sub35_Sub1_1.method7611(!Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614), Static453.anInt8614);
					Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
					Static556.aBoolean698 = false;
					Static41.method1090();
					Static303.method4804();
					Static472.method6892();
					Static47.method1139("lighting=" + Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614));
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static47.method1139("Invalid buildarea value");
						return;
					}
					local268 = Static393.method6016(arg2.substring(6));
					if (local268 >= 0 && Static488.method7097(Static503.anInt9410) >= local268) {
						Static455.aClass4_Sub35_Sub1_1.anInt9923 = local268;
						Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
						Static556.aBoolean698 = false;
						Static47.method1139("maxbuildarea=" + Static455.aClass4_Sub35_Sub1_1.anInt9923);
						return;
					}
					Static47.method1139("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static47.method1139("Invalid rect_debug value");
						return;
					}
					Static266.anInt5358 = Static393.method6016(arg2.substring(10).trim());
					Static47.method1139("rect_debug=" + Static266.anInt5358);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static80.aBoolean170 = true;
					Static47.method1139("qa_op_test=" + Static80.aBoolean170);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static393.aBoolean559 = !Static393.aBoolean559;
					Static47.method1139("clipcomponents=" + Static393.aBoolean559);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1020) boolean local1020 = Static39.aClass7_2.method7850();
					if (Static15.method758(!local1020)) {
						if (!local1020) {
							Static47.method1139("Bloom enabled");
							return;
						}
						Static47.method1139("Bloom disabled");
						return;
					}
					Static47.method1139("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (!Static165.aBoolean248) {
						Static165.aBoolean248 = true;
						Static47.method1139("Forced tweening ENABLED!");
						return;
					}
					Static165.aBoolean248 = false;
					Static47.method1139("Forced tweening disabled.");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static405.aBoolean565) {
						Static47.method1139("Shift-click disabled.");
						Static405.aBoolean565 = false;
						return;
					}
					Static47.method1139("Shift-click ENABLED!");
					Static405.aBoolean565 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static47.method1139("x:" + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9) + " z:" + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static47.method1139("Height: " + Static255.aClass115Array2[Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127].method8055(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550 >> 9, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static159.aClass348_38.method7961();
					Static159.aClass348_38.method7980();
					Static259.aClass249_2.method5894();
					Static89.aClass121_1.method2683();
					Static571.method8034();
					Static47.method1139("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (!Static39.aClass7_2.method7821()) {
						Static47.method1139("Current toolkit doesn't support multiple cores");
						return;
					}
					local268 = Integer.parseInt(arg2.substring(3));
					if (local268 < 1) {
						local268 = 1;
					} else if (local268 > 4) {
						local268 = 4;
					}
					Static98.anInt2403 = local268;
					Static472.method6892();
					Static47.method1139("Render cores now: " + Static98.anInt2403);
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static47.method1139("I(s): " + Static390.aClass167_42.method3973() + "/" + Static390.aClass167_42.method3970());
					Static47.method1139("I(m): " + Static456.aClass167_47.method3973() + "/" + Static456.aClass167_47.method3970());
					Static47.method1139("O(s): " + Static338.aClass29_1.aClass307_1.method7086() + "/" + Static338.aClass29_1.aClass307_1.method7077());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static47.method1139("Pos: " + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 + "," + ((Static534.anInt9775 >> 9) + Static242.anInt10133 >> 6) + "," + (Static157.anInt3323 + (Static114.anInt2613 >> 9) >> 6) + "," + (Static242.anInt10133 + (Static534.anInt9775 >> 9) & 0x3F) + "," + ((Static114.anInt2613 >> 9) + Static157.anInt3323 & 0x3F) + " Height: " + (Static461.method6782(Static114.anInt2613, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static534.anInt9775) - Static139.anInt3067));
					Static47.method1139("Look: " + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 + "," + (Static191.anInt3980 + Static242.anInt10133 >> 6) + "," + (Static157.anInt3323 + Static533.anInt9769 >> 6) + "," + (Static242.anInt10133 + Static191.anInt3980 & 0x3F) + "," + (Static533.anInt9769 + Static157.anInt3323 & 0x3F) + " Height: " + (Static461.method6782(Static533.anInt9769, Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static191.anInt3980) - Static341.anInt6582));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static546.aBoolean690 = !Static546.aBoolean690;
					Static39.aClass7_2.method7805(Static546.aBoolean690);
					Static197.method3235();
					Static47.method1139("showprofiling=" + Static546.aBoolean690);
					return;
				}
				@Pc(1423) String[] local1423;
				if (arg2.startsWith("performancetest")) {
					local268 = -1;
					local783 = 1000;
					if (arg2.length() > 15) {
						local1423 = Static297.method4750(arg2, ' ');
						try {
							if (local1423.length > 1) {
								local783 = Integer.parseInt(local1423[1]);
							}
						} catch (@Pc(1436) Throwable local1436) {
						}
						try {
							if (local1423.length > 2) {
								local268 = Integer.parseInt(local1423[2]);
							}
						} catch (@Pc(1449) Throwable local1449) {
						}
					}
					if (local268 != -1) {
						Static47.method1139("Performance: " + Static371.method5562(local783, Static453.anInt8614));
						return;
					}
					Static47.method1139("Java toolkit: " + Static371.method5562(local783, 0));
					Static47.method1139("SSE toolkit:  " + Static371.method5562(local783, 2));
					Static47.method1139("D3D toolkit:  " + Static371.method5562(local783, 3));
					Static47.method1139("GL toolkit:   " + Static371.method5562(local783, 1));
					Static47.method1139("GLX toolkit:  " + Static371.method5562(local783, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static165.aBoolean249 = !Static165.aBoolean249;
					Static47.method1139("nonpcs=" + Static165.aBoolean249);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static34.method3923();
					Static47.method1139("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local268 = Integer.parseInt(arg2.substring(12));
					Static435.method6471(local268, Static442.method6524(local268).aString224);
					Static47.method1139("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static47.method1139("w: " + Static326.aClass271_2.anInt7991);
					return;
				}
				@Pc(1602) Class4_Sub39 local1602;
				if (arg2.startsWith("pc")) {
					local1602 = Static32.method999(Static402.aClass356_1, Static248.aClass344_36);
					local1602.aClass4_Sub13_Sub2_1.method7052(0);
					local783 = local1602.aClass4_Sub13_Sub2_1.anInt9170;
					local288 = arg2.indexOf(" ", 4);
					local1602.aClass4_Sub13_Sub2_1.method7002(arg2.substring(3, local288));
					Static335.method5120(arg2.substring(local288), local1602.aClass4_Sub13_Sub2_1);
					local1602.aClass4_Sub13_Sub2_1.method6991(local1602.aClass4_Sub13_Sub2_1.anInt9170 - local783);
					Static50.method1166(local1602);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static573.method8080();
					Static47.method1139("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local268 = 0; local268 < Static65.anIntArray67.length; local268++) {
						if (Static188.aBooleanArray11[local268]) {
							Static65.anIntArray67[local268] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static65.anIntArray67[local268] *= -1;
							}
						}
					}
					Static573.method8080();
					Static47.method1139("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static98.aBoolean191 = true;
					Static571.method8034();
					Static47.method1139("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static98.aBoolean191 = false;
					Static571.method8034();
					Static47.method1139("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static276.method4458();
					Static47.method1139("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static47.method1139(Static500.method7214() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local268 = Integer.parseInt(arg2.substring(17));
					Static47.method1139("varpbit=" + Static523.aClass173_1.method4069(local268));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local268 = Integer.parseInt(arg2.substring(14));
					Static47.method1139("varp=" + Static523.aClass173_1.method4068(local268));
					return;
				}
				if (arg2.startsWith("demologin")) {
					Static415.method4712(false, 0);
					return;
				}
				if (arg2.startsWith("newdemologin")) {
					Static415.method4712(true, 0);
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1820) String[] local1820 = Static297.method4750(arg2.substring(12), ' ');
					if (local1820.length >= 2) {
						local783 = local1820.length <= 2 ? 0 : Integer.parseInt(local1820[2]);
						Static183.method3009(local1820[1], local1820[0], local783);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static471.method6886();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static471.method6889();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static471.method6889();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local268 = Integer.parseInt(arg2.substring(8));
					Static39.aClass7_2.method7791(local268);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static47.method1139("Active streams: " + Static472.aClass4_Sub21_Sub3_2.method5928());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static455.aClass4_Sub35_Sub1_1.method7638();
					Static47.method1139("Complete. Toolkit now: " + Static453.anInt8614);
					return;
				}
				if (arg2.equals("errormessage")) {
					Static47.method1139(Static104.aClient3.method1524());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static594.aString238.startsWith("win")) {
						Static419.method6253(new File("C:\\Temp\\heap.dump"));
					} else {
						Static419.method6253(new File("/tmp/heap.dump"));
					}
					Static47.method1139("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static47.method1139("Name: " + Static594.aString238);
					Static47.method1139("Arch: " + Static594.aString241);
					Static47.method1139("Ver: " + Static594.aString237);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local268 = Integer.parseInt(arg2.substring(8, 9));
					Static75.anInt1921 = local268;
					Static472.method6892();
					Static47.method1139("Toggled!");
					return;
				}
				@Pc(2014) File local2014;
				if (arg2.startsWith("setoutput ")) {
					local2014 = new File(arg2.substring(10));
					if (local2014.exists()) {
						local2014 = new File(arg2.substring(10) + "." + Static112.method2047() + ".log");
						if (local2014.exists()) {
							Static47.method1139("file already exists!");
							return;
						}
					}
					if (Static348.aFileOutputStream1 != null) {
						Static348.aFileOutputStream1.close();
						Static348.aFileOutputStream1 = null;
					}
					try {
						Static348.aFileOutputStream1 = new FileOutputStream(local2014);
						return;
					} catch (@Pc(2056) FileNotFoundException local2056) {
						Static47.method1139("Could not create " + local2014.getName());
						return;
					} catch (@Pc(2068) SecurityException local2068) {
						Static47.method1139("Cannot write to " + local2014.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static348.aFileOutputStream1 != null) {
						Static348.aFileOutputStream1.close();
					}
					Static348.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2014 = new File(arg2.substring(10));
					if (!local2014.exists()) {
						Static47.method1139("No such file");
						return;
					}
					@Pc(2112) byte[] local2112 = Static291.method4716(local2014);
					if (local2112 == null) {
						Static47.method1139("Failed to read file");
						return;
					}
					local1423 = Static297.method4750(Static202.method3283(Static260.method4124(local2112), ""), '\n');
					Static272.method8238(local1423);
					return;
				}
				if (Static9.anInt758 == 10) {
					local1602 = Static32.method999(Static402.aClass356_1, Static465.aClass344_85);
					local1602.aClass4_Sub13_Sub2_1.method7052(arg2.length() + 3);
					local1602.aClass4_Sub13_Sub2_1.method7052(arg1 ? 1 : 0);
					local1602.aClass4_Sub13_Sub2_1.method7052(arg0 ? 1 : 0);
					local1602.aClass4_Sub13_Sub2_1.method7002(arg2);
					Static50.method1166(local1602);
				}
				if (arg2.startsWith("fps ") && Static383.aClass326_7 != Static342.aClass326_6) {
					Static340.method5174(Static393.method6016(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2195) Exception local2195) {
				Static47.method1139(Static223.aClass152_6.method3624(Static142.anInt3088));
				return;
			}
		}
		if (Static9.anInt758 != 10) {
			Static47.method1139(Static223.aClass152_7.method3624(Static142.anInt3088) + arg2);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)Z")
	public static boolean method4770(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
