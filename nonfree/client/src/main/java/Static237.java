import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!pi;")
	public static Class258 aClass258_3;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method3662() {
		if (Static246.aBoolean325) {
			return;
		}
		Static115.aBoolean505 = true;
		Static246.aBoolean325 = true;
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean577) {
			Static126.aFloat84 = (int) Static126.aFloat84 - 17 & 0xFFFFFFF0;
		} else {
			Static63.aFloat30 += (-12.0F - Static63.aFloat30) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
	public static void method3663(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static359.method5539("commands - This command");
				Static359.method5539("cls - Clear console");
				Static359.method5539("displayfps - Toggle FPS and other information");
				Static359.method5539("renderer - Print graphics renderer information");
				Static359.method5539("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static59.anInt1292 = 0;
				Static98.anInt1998 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static25.aBoolean45 = !Static25.aBoolean45;
				if (Static25.aBoolean45) {
					Static359.method5539("FPS on");
					return;
				}
				Static359.method5539("FPS off");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(71) Class15 local71 = Static505.aClass45_11.method7401();
				Static359.method5539("Vendor: " + local71.anInt307);
				Static359.method5539("Name: " + local71.aString2);
				Static359.method5539("Version: " + local71.anInt308);
				Static359.method5539("Device: " + local71.aString3);
				Static359.method5539("Driver Version: " + local71.aLong12);
				return;
			}
			if (arg2.equals("heap")) {
				Static359.method5539("Heap: " + Static350.anInt6083 + "MB");
				return;
			}
		} catch (@Pc(143) Exception local143) {
			Static359.method5539(Static544.aClass343_6.method7222(Static256.anInt4535));
			return;
		}
		if (Static478.aClass272_10 != Static516.aClass272_11 || Static500.anInt8114 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static359.method5539("FPS: " + Static286.anInt4910);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static279.aBoolean733 = !Static279.aBoolean733;
					if (!Static279.aBoolean733) {
						Static359.method5539("Occlsion now off!");
						return;
					}
					Static359.method5539("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static25.aBoolean45 = true;
					Static359.method5539("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static25.aBoolean45 = false;
					Static359.method5539("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static359.method5539("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(256) Throwable local256) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static82.aClass178_21.method4162();
					Static359.method5539("Text coords cleared");
					return;
				}
				@Pc(295) int local295;
				@Pc(276) int local276;
				@Pc(285) Runtime local285;
				if (arg2.equalsIgnoreCase("gc")) {
					Static593.method7933();
					for (local276 = 0; local276 < 10; local276++) {
						System.gc();
					}
					local285 = Runtime.getRuntime();
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static359.method5539("mem=" + local295 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static593.method7933();
					for (local276 = 0; local276 < 10; local276++) {
						System.gc();
					}
					local285 = Runtime.getRuntime();
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static359.method5539("Memory before cleanup=" + local295 + "k");
					Static587.method7878();
					Static593.method7933();
					for (@Pc(353) int local353 = 0; local353 < 10; local353++) {
						System.gc();
					}
					local295 = (int) ((local285.totalMemory() - local285.freeMemory()) / 1024L);
					Static359.method5539("Memory after cleanup=" + local295 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static359.method5539(Static392.method5755() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static359.method5539("Dropped client connection");
					if (Static32.anInt602 == 10) {
						Static58.method1205();
					} else if (Static32.anInt602 == 11) {
						Static165.aBoolean259 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static221.aClass51_1.method1489();
					Static359.method5539("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static391.aClass277_2.method6119();
					Static359.method5539("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static391.aClass277_2.method6118();
					Static359.method5539("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					aClass258_3.method5886();
					Static324.aClass165_2.method3981();
					Static391.aClass277_2.method6111();
					Static359.method5539("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static444.method6194();
					Static512.method6889();
					Static359.method5539("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static270.aLong139 = Static158.method2936();
					Static313.aBoolean391 = true;
					Static444.method6194();
					Static512.method6889();
					Static359.method5539("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static3.method5708(false, -1, -1, 1);
					if (Static38.method626() == 1) {
						Static359.method5539("wm1 succeeded");
						return;
					}
					Static359.method5539("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static3.method5708(false, -1, -1, 2);
					if (Static38.method626() != 2) {
						Static359.method5539("wm2 failed");
						return;
					}
					Static359.method5539("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static3.method5708(false, 1024, 768, 3);
					if (Static38.method626() == 3) {
						Static359.method5539("wm3 succeeded");
						return;
					}
					Static359.method5539("wm3 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static486.method6610(0);
					if (Static60.anInt1312 == 0) {
						Static359.method5539("Entered tk0");
						Static405.aClass3_Sub3_Sub1_1.anInt7562 = 0;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						return;
					}
					Static359.method5539("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static486.method6610(1);
					if (Static60.anInt1312 == 1) {
						Static359.method5539("Entered tk1");
						Static405.aClass3_Sub3_Sub1_1.anInt7562 = 1;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						return;
					}
					Static359.method5539("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static486.method6610(2);
					if (Static60.anInt1312 == 2) {
						Static359.method5539("Entered tk2");
						Static405.aClass3_Sub3_Sub1_1.anInt7562 = 2;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						return;
					}
					Static359.method5539("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static486.method6610(3);
					if (Static60.anInt1312 == 3) {
						Static359.method5539("Entered tk3");
						Static405.aClass3_Sub3_Sub1_1.anInt7562 = 3;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						return;
					}
					Static359.method5539("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static486.method6610(5);
					if (Static60.anInt1312 == 5) {
						Static359.method5539("Entered tk5");
						Static405.aClass3_Sub3_Sub1_1.anInt7562 = 5;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						return;
					}
					Static359.method5539("Failed to enter tk5");
					return;
				}
				if (arg2.equalsIgnoreCase("ot")) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean590 = !Static405.aClass3_Sub3_Sub1_1.aBoolean590;
					Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
					Static206.aBoolean283 = false;
					Static444.method6194();
					Static359.method5539("ot=" + Static405.aClass3_Sub3_Sub1_1.aBoolean590);
					return;
				}
				if (arg2.equalsIgnoreCase("gb")) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean588 = !Static405.aClass3_Sub3_Sub1_1.aBoolean588;
					Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
					Static206.aBoolean283 = false;
					Static444.method6194();
					Static359.method5539("gb=" + Static405.aClass3_Sub3_Sub1_1.aBoolean588);
					return;
				}
				@Pc(821) int local821;
				if (arg2.startsWith("shadows")) {
					if (arg2.length() < 8) {
						Static359.method5539("Invalid shadows value");
						return;
					}
					@Pc(809) String local809 = arg2.substring(8);
					local821 = Static368.method5388(local809) ? Static213.method6524(local809) : -1;
					if (local821 >= 0 && local821 <= 2) {
						Static405.aClass3_Sub3_Sub1_1.method6298(local821, Static60.anInt1312);
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						Static444.method6194();
						Static359.method5539("shadows=" + local821);
						return;
					}
					Static359.method5539("Invalid shadows value");
					return;
				}
				if (arg2.startsWith("textures")) {
					Static405.aClass3_Sub3_Sub1_1.aBoolean579 = !Static405.aClass3_Sub3_Sub1_1.aBoolean579;
					Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
					Static206.aBoolean283 = false;
					Static563.method7599();
					Static444.method6194();
					Static359.method5539("textures=" + Static405.aClass3_Sub3_Sub1_1.aBoolean579);
					return;
				}
				if (arg2.startsWith("lighting")) {
					Static405.aClass3_Sub3_Sub1_1.method6295(Static60.anInt1312, !Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312));
					Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
					Static206.aBoolean283 = false;
					Static428.method6060();
					Static563.method7599();
					Static444.method6194();
					Static359.method5539("lighting=" + Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312));
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static359.method5539("Invalid buildarea value");
						return;
					}
					local276 = Static213.method6524(arg2.substring(6));
					if (local276 >= 0 && local276 <= Static53.method844(Static350.anInt6083)) {
						Static405.aClass3_Sub3_Sub1_1.anInt7571 = local276;
						Static405.aClass3_Sub3_Sub1_1.method6313(aClass258_3);
						Static206.aBoolean283 = false;
						Static359.method5539("maxbuildarea=" + Static405.aClass3_Sub3_Sub1_1.anInt7571);
						return;
					}
					Static359.method5539("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static359.method5539("Invalid rect_debug value");
						return;
					}
					Static475.anInt7861 = Static213.method6524(arg2.substring(10).trim());
					Static359.method5539("rect_debug=" + Static475.anInt7861);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static425.aBoolean541 = true;
					Static359.method5539("qa_op_test=" + Static425.aBoolean541);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static424.aBoolean540 = !Static424.aBoolean540;
					Static359.method5539("clipcomponents=" + Static424.aBoolean540);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1066) boolean local1066 = Static505.aClass45_11.method7363();
					if (!Static228.method3543(!local1066)) {
						Static359.method5539("Failed to enable bloom");
						return;
					}
					if (local1066) {
						Static359.method5539("Bloom disabled");
						return;
					}
					Static359.method5539("Bloom enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (!Static391.aBoolean508) {
						Static391.aBoolean508 = true;
						Static359.method5539("Forced tweening ENABLED!");
						return;
					}
					Static391.aBoolean508 = false;
					Static359.method5539("Forced tweening disabled.");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static505.aBoolean625) {
						Static359.method5539("Shift-click disabled.");
						Static505.aBoolean625 = false;
						return;
					}
					Static359.method5539("Shift-click ENABLED!");
					Static505.aBoolean625 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static359.method5539("x:" + (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9) + " z:" + (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static359.method5539("Height: " + Static68.aClass34Array1[Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117].method6525(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static552.aClass322_150.method6801();
					Static552.aClass322_150.method6815();
					Static350.aClass87_3.method2535();
					Static39.aClass102_1.method2923();
					Static512.method6889();
					Static359.method5539("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (!Static505.aClass45_11.method7360()) {
						Static359.method5539("Current toolkit doesn't support multiple cores");
						return;
					}
					local276 = Integer.parseInt(arg2.substring(3));
					if (local276 < 1) {
						local276 = 1;
					} else if (local276 > 4) {
						local276 = 4;
					}
					Static536.anInt8590 = local276;
					Static444.method6194();
					Static359.method5539("Render cores now: " + Static536.anInt8590);
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static359.method5539("I(s): " + Static51.aClass6_5.method101() + "/" + Static51.aClass6_5.method93());
					Static359.method5539("I(m): " + Static490.aClass6_60.method101() + "/" + Static490.aClass6_60.method93());
					Static359.method5539("O(s): " + Static6.aClass92_1.aClass179_1.method4178() + "/" + Static6.aClass92_1.aClass179_1.method4172());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static359.method5539("Pos: " + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 + "," + ((Static226.anInt3984 >> 9) + Static335.anInt5608 >> 6) + "," + (Static246.anInt4344 + (Static350.anInt6080 >> 9) >> 6) + "," + (Static335.anInt5608 + (Static226.anInt3984 >> 9) & 0x3F) + "," + ((Static350.anInt6080 >> 9) + Static246.anInt4344 & 0x3F) + " Height: " + (Static475.method6537(Static350.anInt6080, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, Static226.anInt3984) - Static461.anInt7704));
					Static359.method5539("Look: " + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 + "," + (Static379.anInt6484 + Static335.anInt5608 >> 6) + "," + (Static399.anInt6956 + Static246.anInt4344 >> 6) + "," + (Static335.anInt5608 + Static379.anInt6484 & 0x3F) + "," + (Static246.anInt4344 + Static399.anInt6956 & 0x3F) + " Height: " + (Static475.method6537(Static399.anInt6956, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117, Static379.anInt6484) - Static351.anInt6111));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static292.aBoolean364 = !Static292.aBoolean364;
					Static505.aClass45_11.method7421(Static292.aBoolean364);
					Static2.method41();
					Static359.method5539("showprofiling=" + Static292.aBoolean364);
					return;
				}
				if (arg2.startsWith("performancetest")) {
					local276 = -1;
					local821 = 1000;
					if (arg2.length() > 15) {
						@Pc(1484) String[] local1484 = Static572.method7699(' ', arg2);
						try {
							if (local1484.length > 1) {
								local821 = Integer.parseInt(local1484[1]);
							}
						} catch (@Pc(1497) Throwable local1497) {
						}
						try {
							if (local1484.length > 2) {
								local276 = Integer.parseInt(local1484[2]);
							}
						} catch (@Pc(1508) Throwable local1508) {
						}
					}
					if (local276 != -1) {
						Static359.method5539("Performance: " + Static311.method4560(local821, Static60.anInt1312));
						return;
					}
					Static359.method5539("Java toolkit: " + Static311.method4560(local821, 0));
					Static359.method5539("SSE toolkit:  " + Static311.method4560(local821, 2));
					Static359.method5539("D3D toolkit:  " + Static311.method4560(local821, 3));
					Static359.method5539("GL toolkit:   " + Static311.method4560(local821, 1));
					Static359.method5539("GLX toolkit:  " + Static311.method4560(local821, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static103.aBoolean167 = !Static103.aBoolean167;
					Static359.method5539("nonpcs=" + Static103.aBoolean167);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static34.method545();
					Static359.method5539("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local276 = Integer.parseInt(arg2.substring(12));
					Static323.method4687(local276, Static368.method5399(local276).aString20);
					Static359.method5539("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static359.method5539("w: " + Static221.aClass51_1.anInt1589);
					return;
				}
				@Pc(1668) Class3_Sub42 local1668;
				if (arg2.startsWith("pc")) {
					local1668 = Static591.method7910(Static9.aClass199_3, Static274.aClass303_55);
					local1668.aClass3_Sub11_Sub1_1.method5213(0);
					local821 = local1668.aClass3_Sub11_Sub1_1.anInt6128;
					local295 = arg2.indexOf(" ", 4);
					local1668.aClass3_Sub11_Sub1_1.method5227(arg2.substring(3, local295));
					Static337.method4789(arg2.substring(local295), local1668.aClass3_Sub11_Sub1_1);
					local1668.aClass3_Sub11_Sub1_1.method5197(local1668.aClass3_Sub11_Sub1_1.anInt6128 - local821);
					Static511.method6885(local1668);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static549.method7294();
					Static359.method5539("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local276 = 0; local276 < Static468.anIntArray497.length; local276++) {
						if (Static351.aBooleanArray21[local276]) {
							Static468.anIntArray497[local276] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static468.anIntArray497[local276] *= -1;
							}
						}
					}
					Static549.method7294();
					Static359.method5539("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static333.aBoolean402 = true;
					Static512.method6889();
					Static359.method5539("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static333.aBoolean402 = false;
					Static512.method6889();
					Static359.method5539("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static495.method6690();
					Static359.method5539("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static359.method5539(Static363.method5169() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local276 = Integer.parseInt(arg2.substring(17));
					Static359.method5539("varpbit=" + Static491.aClass318_1.method6736(local276));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local276 = Integer.parseInt(arg2.substring(14));
					Static359.method5539("varp=" + Static491.aClass318_1.method6735(local276));
					return;
				}
				if (arg2.startsWith("demologin")) {
					Static262.method4019(false, 0);
					return;
				}
				if (arg2.startsWith("newdemologin")) {
					Static262.method4019(true, 0);
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1901) String[] local1901 = Static572.method7699(' ', arg2.substring(12));
					if (local1901.length >= 2) {
						local821 = local1901.length > 2 ? Integer.parseInt(local1901[2]) : 0;
						Static267.method4087(local1901[0], local821, local1901[1]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static312.method4568();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static312.method4562();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static312.method4562();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local276 = Integer.parseInt(arg2.substring(8));
					Static505.aClass45_11.method7372(local276);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static359.method5539("Active streams: " + Static353.aClass3_Sub4_Sub2_1.method641());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static405.aClass3_Sub3_Sub1_1.method6305();
					Static359.method5539("Complete. Toolkit now: " + Static60.anInt1312);
					return;
				}
				if (arg2.equals("errormessage")) {
					Static359.method5539(Static308.aClient1.method1514());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static408.aString61.startsWith("win")) {
						Static263.method4023(new File("C:\\Temp\\heap.dump"));
					} else {
						Static263.method4023(new File("/tmp/heap.dump"));
					}
					Static359.method5539("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static359.method5539("Name: " + Static408.aString61);
					Static359.method5539("Arch: " + Static408.aString59);
					Static359.method5539("Ver: " + Static408.aString60);
					return;
				}
				if (arg2.equals("w2debug")) {
					Static285.aBoolean354 = !Static285.aBoolean354;
					Static444.method6194();
					Static359.method5539("Toggled!");
					return;
				}
				if (Static32.anInt602 == 10) {
					local1668 = Static591.method7910(Static9.aClass199_3, Static572.aClass303_99);
					local1668.aClass3_Sub11_Sub1_1.method5213(arg2.length() + 3);
					local1668.aClass3_Sub11_Sub1_1.method5213(arg0 ? 1 : 0);
					local1668.aClass3_Sub11_Sub1_1.method5213(arg1 ? 1 : 0);
					local1668.aClass3_Sub11_Sub1_1.method5227(arg2);
					Static511.method6885(local1668);
				}
				if (arg2.startsWith("fps ") && Static516.aClass272_11 != Static478.aClass272_10) {
					Static203.method4576(Static213.method6524(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2150) Exception local2150) {
				Static359.method5539(Static544.aClass343_6.method7222(Static256.anInt4535));
				return;
			}
		}
		if (Static32.anInt602 != 10) {
			Static359.method5539(Static544.aClass343_7.method7222(Static256.anInt4535) + arg2);
		}
	}
}
