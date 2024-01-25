import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
	public static int anInt3338;

	@OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
	public static int anInt3342;

	@OriginalMember(owner = "client!fw", name = "I", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!tc;Lclient!oa;B)V")
	public static void method2946(@OriginalArg(0) Class305 arg0, @OriginalArg(1) Class15 arg1) {
		@Pc(36) boolean local36 = Static517.aClass23_2.method905(arg1, arg0.anInt9172, arg0.anInt9240 | 0xFF000000, arg0.anInt9170, arg0.anInt9234, arg0.anInt9216, arg0.aBoolean764 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null) == null;
		if (local36) {
			Static28.aClass183_2.method4792(new Class3_Sub49(arg0.anInt9216, arg0.anInt9170, arg0.anInt9234, arg0.anInt9240 | 0xFF000000, arg0.anInt9172, arg0.aBoolean764));
			Static282.method4860(arg0);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;ZIZ)V")
	public static void method2949(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static508.aClass109_7 == Static51.aClass109_2 && Static158.anInt3421 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg0.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static126.aBoolean224 = true;
				Static454.method7045("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static126.aBoolean224 = false;
				Static454.method7045("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static454.method7045("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(81) Throwable local81) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static413.anInt8076 = 0;
				Static86.anInt1983 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static206.aClass134_10.method3232();
				Static454.method7045("Text coords cleared");
				return;
			}
			@Pc(130) int local130;
			@Pc(112) int local112;
			@Pc(120) Runtime local120;
			if (arg0.equalsIgnoreCase("gc")) {
				Static221.method3802();
				for (local112 = 0; local112 < 10; local112++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static454.method7045("mem=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static221.method3802();
				for (local112 = 0; local112 < 10; local112++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static454.method7045("Memory before cleanup=" + local130 + "k");
				Static580.method8284();
				Static221.method3802();
				for (@Pc(189) int local189 = 0; local189 < 10; local189++) {
					System.gc();
				}
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static454.method7045("Memory after cleanup=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("unloadnatives")) {
				Static454.method7045(Static327.method5677() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static454.method7045("Number of player models in cache:" + Static72.method6649());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static454.method7045("Dropped client connection");
				if (Static75.anInt1880 == 10) {
					Static51.method1281();
					return;
				}
				if (Static75.anInt1880 == 11) {
					Static420.aBoolean673 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
				Static461.aClass329_6.method7876();
				Static454.method7045("Rotated connection methods");
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static122.aClass289_2.method7103();
				Static454.method7045("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static122.aClass289_2.method7098();
				Static454.method7045("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static480.aClass326_3.method7782();
				Static393.aClass8_2.method357();
				Static122.aClass289_2.method7092();
				Static454.method7045("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static595.method8411();
				Static23.method7146();
				Static454.method7045("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static342.method5819(1, -1, -1, false);
				if (Static216.method3759() != 1) {
					Static454.method7045("wm1 failed");
					return;
				}
				Static454.method7045("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static342.method5819(2, -1, -1, false);
				if (Static216.method3759() == 2) {
					Static454.method7045("wm2 succeeded");
					return;
				}
				Static454.method7045("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static342.method5819(3, 1024, 768, false);
				if (Static216.method3759() == 3) {
					Static454.method7045("wm3 succeeded");
					return;
				}
				Static454.method7045("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static63.method1592(0);
				if (Static275.anInt5823 != 0) {
					Static454.method7045("Failed to enter tk0");
					return;
				}
				Static454.method7045("Entered tk0");
				Static455.aClass3_Sub27_Sub1_1.anInt4792 = 0;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static63.method1592(1);
				if (Static275.anInt5823 == 1) {
					Static454.method7045("Entered tk1");
					Static455.aClass3_Sub27_Sub1_1.anInt4792 = 1;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				Static454.method7045("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static63.method1592(2);
				if (Static275.anInt5823 != 2) {
					Static454.method7045("Failed to enter tk2");
					return;
				}
				Static454.method7045("Entered tk2");
				Static455.aClass3_Sub27_Sub1_1.anInt4792 = 2;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static63.method1592(3);
				if (Static275.anInt5823 != 3) {
					Static454.method7045("Failed to enter tk3");
					return;
				}
				Static454.method7045("Entered tk3");
				Static455.aClass3_Sub27_Sub1_1.anInt4792 = 3;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk4")) {
				Static63.method1592(4);
				if (Static275.anInt5823 != 4) {
					Static454.method7045("Failed to enter tk4");
					return;
				}
				Static454.method7045("Entered tk4");
				Static455.aClass3_Sub27_Sub1_1.anInt4792 = 4;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk5")) {
				Static63.method1592(5);
				if (Static275.anInt5823 != 5) {
					Static454.method7045("Failed to enter tk5");
					return;
				}
				Static454.method7045("Entered tk5");
				Static455.aClass3_Sub27_Sub1_1.anInt4792 = 5;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static455.aClass3_Sub27_Sub1_1.aBoolean397 = !Static455.aClass3_Sub27_Sub1_1.aBoolean397;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				Static595.method8411();
				Static454.method7045("ot=" + Static455.aClass3_Sub27_Sub1_1.aBoolean397);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static455.aClass3_Sub27_Sub1_1.aBoolean383 = !Static455.aClass3_Sub27_Sub1_1.aBoolean383;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				Static595.method8411();
				Static454.method7045("gb=" + Static455.aClass3_Sub27_Sub1_1.aBoolean383);
				return;
			}
			@Pc(674) int local674;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static454.method7045("Invalid shadows value");
					return;
				}
				@Pc(662) String local662 = arg0.substring(8);
				local674 = Static256.method4564(local662) ? Static403.method6559(local662) : -1;
				if (local674 >= 0 && local674 <= 2) {
					Static455.aClass3_Sub27_Sub1_1.method4037(local674, Static275.anInt5823);
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					Static595.method8411();
					Static454.method7045("shadows=" + local674);
					return;
				}
				Static454.method7045("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static455.aClass3_Sub27_Sub1_1.aBoolean391 = !Static455.aClass3_Sub27_Sub1_1.aBoolean391;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				Static49.method1242();
				Static595.method8411();
				Static454.method7045("textures=" + Static455.aClass3_Sub27_Sub1_1.aBoolean391);
				return;
			}
			if (arg0.startsWith("lighting")) {
				Static455.aClass3_Sub27_Sub1_1.method4039(Static275.anInt5823, !Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823));
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				Static423.method6761();
				Static49.method1242();
				Static595.method8411();
				Static454.method7045("lighting=" + Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823));
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static454.method7045("Invalid buildarea value");
					return;
				}
				local112 = Static403.method6559(arg0.substring(6));
				if (local112 >= 0 && Static279.method4841(Static188.anInt3749) >= local112) {
					Static455.aClass3_Sub27_Sub1_1.anInt4802 = local112;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					Static454.method7045("maxbuildarea=" + Static455.aClass3_Sub27_Sub1_1.anInt4802);
					return;
				}
				Static454.method7045("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static454.method7045("Invalid particles value");
					return;
				}
				Static551.method8044(Static403.method6559(arg0.substring(13)));
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
				Static11.aBoolean30 = false;
				Static454.method7045("particles=" + Static390.method6232());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static454.method7045("Invalid rect_debug value");
					return;
				}
				Static157.anInt3409 = Static403.method6559(arg0.substring(10).trim());
				Static454.method7045("rect_debug=" + Static157.anInt3409);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static230.aBoolean352 = true;
				Static454.method7045("qa_op_test=" + Static230.aBoolean352);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static109.aBoolean198 = !Static109.aBoolean198;
				Static454.method7045("clipcomponents=" + Static109.aBoolean198);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(952) boolean local952 = Static546.aClass15_16.method5325();
				if (Static200.method3363(!local952)) {
					if (!local952) {
						Static454.method7045("Bloom enabled");
						return;
					}
					Static454.method7045("Bloom disabled");
					return;
				}
				Static454.method7045("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static4.aBoolean20) {
					Static4.aBoolean20 = false;
					Static454.method7045("Forced tweening disabled.");
					return;
				}
				Static4.aBoolean20 = true;
				Static454.method7045("Forced tweening ENABLED!");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static42.aBoolean85) {
					Static454.method7045("Shift-click disabled.");
					Static42.aBoolean85 = false;
					return;
				}
				Static454.method7045("Shift-click ENABLED!");
				Static42.aBoolean85 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static454.method7045("x:" + (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9) + " z:" + (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static454.method7045("Height: " + Static224.aClass4Array3[Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103].JA(Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 7, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static579.aClass254_137.method6422();
				Static579.aClass254_137.method6392();
				Static568.aClass315_4.method7657();
				Static44.aClass10_1.method399();
				Static23.method7146();
				Static454.method7045("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static546.aClass15_16.method5284()) {
					Static454.method7045("Current toolkit doesn't support multiple cores");
					return;
				}
				local112 = Integer.parseInt(arg0.substring(3));
				if (local112 < 1) {
					local112 = 1;
				} else if (local112 > 4) {
					local112 = 4;
				}
				Static583.anInt9699 = local112;
				Static546.aClass15_16.method5304(Static583.anInt9699);
				Static546.aClass15_16.method5317(0);
				Static454.method7045("Render cores now: " + Static583.anInt9699);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static454.method7045("I(s): " + Static198.aClass211_25.method5531() + "/" + Static198.aClass211_25.method5539());
				Static454.method7045("I(m): " + Static402.aClass211_65.method5531() + "/" + Static402.aClass211_65.method5539());
				Static454.method7045("O(s): " + Static517.aClass23_2.aClass117_1.method3018() + "/" + Static517.aClass23_2.aClass117_1.method3022());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static454.method7045("Pos: " + Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 + "," + ((Static594.anInt10391 >> 9) + Static230.anInt4667 >> 6) + "," + (Static563.anInt10006 + (Static496.anInt9269 >> 9) >> 6) + "," + (Static230.anInt4667 + (Static594.anInt10391 >> 9) & 0x3F) + "," + (Static563.anInt10006 + (Static496.anInt9269 >> 9) & 0x3F) + " Height: " + (Static274.method4782(Static496.anInt9269, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, Static594.anInt10391) - Static360.anInt1771));
				Static454.method7045("Look: " + Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 + "," + (Static464.anInt8682 + Static230.anInt4667 >> 6) + "," + (Static563.anInt10006 + Static480.anInt8972 >> 6) + "," + (Static464.anInt8682 + Static230.anInt4667 & 0x3F) + "," + (Static563.anInt10006 + Static480.anInt8972 & 0x3F) + " Height: " + (Static274.method4782(Static480.anInt8972, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, Static464.anInt8682) - Static439.anInt8397));
				return;
			}
			if (arg0.equals("showocc")) {
				Static151.aBoolean259 = !Static151.aBoolean259;
				Static595.method8411();
				Static454.method7045("showocc=" + Static151.aBoolean259);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static509.aBoolean789 = !Static509.aBoolean789;
				Static595.method8411();
				Static454.method7045("forcewallocc=" + Static509.aBoolean789);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static216.aBoolean340 = !Static216.aBoolean340;
				Static546.aClass15_16.method5345(Static216.aBoolean340);
				Static263.method4644();
				Static454.method7045("showprofiling=" + Static216.aBoolean340);
				return;
			}
			if (arg0.startsWith("performancetest")) {
				local112 = -1;
				local674 = 1000;
				if (arg0.length() > 15) {
					@Pc(1407) String[] local1407 = Static335.method5785(' ', arg0);
					try {
						if (local1407.length > 1) {
							local674 = Integer.parseInt(local1407[1]);
						}
					} catch (@Pc(1418) Throwable local1418) {
					}
					try {
						if (local1407.length > 2) {
							local112 = Integer.parseInt(local1407[2]);
						}
					} catch (@Pc(1431) Throwable local1431) {
					}
				}
				if (local112 == -1) {
					Static454.method7045("Java toolkit: " + Static577.method8255(local674, 0));
					Static454.method7045("SSE toolkit:  " + Static577.method8255(local674, 2));
					Static454.method7045("D3D toolkit:  " + Static577.method8255(local674, 3));
					Static454.method7045("GL toolkit:   " + Static577.method8255(local674, 1));
					Static454.method7045("GLX toolkit:  " + Static577.method8255(local674, 5));
					return;
				}
				Static454.method7045("Performance: " + Static577.method8255(local674, Static275.anInt5823));
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(1523) Class242 local1523 = Static546.aClass15_16.method5278();
				Static454.method7045("Vendor: " + local1523.anInt7297);
				Static454.method7045("Name: " + local1523.aString86);
				Static454.method7045("Version: " + local1523.anInt7296);
				Static454.method7045("Device: " + local1523.aString85);
				Static454.method7045("Driver Version: " + local1523.aLong188);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static281.aBoolean507 = !Static281.aBoolean507;
				Static454.method7045("nonpcs=" + Static281.aBoolean507);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static491.method6678();
				Static454.method7045("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local112 = Integer.parseInt(arg0.substring(12));
				Static175.method3125(Static52.method1287(local112).aString50, local112);
				Static454.method7045("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static454.method7045("w: " + Static461.aClass329_6.anInt9698);
				return;
			}
			@Pc(1657) Class3_Sub9 local1657;
			if (arg0.startsWith("pc")) {
				local1657 = Static587.method8316(Static187.aClass40_2, Static400.aClass230_77);
				local1657.aClass3_Sub7_Sub1_1.method6494(0);
				local674 = local1657.aClass3_Sub7_Sub1_1.anInt7869;
				local130 = arg0.indexOf(" ", 4);
				local1657.aClass3_Sub7_Sub1_1.method6516(arg0.substring(3, local130));
				Static154.method2978(arg0.substring(local130), local1657.aClass3_Sub7_Sub1_1);
				local1657.aClass3_Sub7_Sub1_1.method6499(local1657.aClass3_Sub7_Sub1_1.anInt7869 - local674);
				Static230.method3933(local1657);
				return;
			}
			if (arg0.equals("heap")) {
				Static454.method7045("Heap: " + Static188.anInt3749 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static38.method1123();
				Static454.method7045("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local112 = 0; local112 < Static183.anIntArray237.length; local112++) {
					if (Static57.aBooleanArray5[local112]) {
						Static183.anIntArray237[local112] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static183.anIntArray237[local112] *= -1;
						}
					}
				}
				Static38.method1123();
				Static454.method7045("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static114.aBoolean206 = true;
				Static23.method7146();
				Static454.method7045("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static114.aBoolean206 = false;
				Static23.method7146();
				Static454.method7045("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static247.method4472();
				Static454.method7045("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static454.method7045(Static229.method3921() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local112 = Integer.parseInt(arg0.substring(9));
				if (local112 >= 0 && local112 <= 4) {
					Static455.aClass3_Sub27_Sub1_1.anInt4809 = local112;
				}
				Static454.method7045("cpuusage=" + Static455.aClass3_Sub27_Sub1_1.anInt4809);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local112 = Integer.parseInt(arg0.substring(17));
				Static454.method7045("varpbit=" + Static588.aClass322_1.method7757(local112));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local112 = Integer.parseInt(arg0.substring(14));
				Static454.method7045("varp=" + Static588.aClass322_1.method7756(local112));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static580.method8285(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static580.method8285(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1939) String[] local1939 = Static335.method5785(' ', arg0.substring(12));
				if (local1939.length >= 2) {
					local674 = local1939.length > 2 ? Integer.parseInt(local1939[2]) : 0;
					Static283.method4874(local1939[0], local1939[1], local674);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static597.method8427();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static597.method8429();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static597.method8429();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local112 = Integer.parseInt(arg0.substring(8));
				Static546.aClass15_16.method5296(local112);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static454.method7045("Active streams: " + Static485.aClass3_Sub14_Sub1_2.method2822());
				return;
			}
			if (arg0.equals("autosetup")) {
				Static455.aClass3_Sub27_Sub1_1.method4055();
				Static454.method7045("Complete. Toolkit now: " + Static275.anInt5823);
				return;
			}
			if (arg0.equals("errormessage")) {
				Static454.method7045(Static173.aClient1.method1687());
				return;
			}
			if (Static75.anInt1880 == 10) {
				local1657 = Static587.method8316(Static187.aClass40_2, Static117.aClass230_26);
				local1657.aClass3_Sub7_Sub1_1.method6494(arg0.length() + 3);
				local1657.aClass3_Sub7_Sub1_1.method6494(arg1 ? 1 : 0);
				local1657.aClass3_Sub7_Sub1_1.method6494(arg2 ? 1 : 0);
				local1657.aClass3_Sub7_Sub1_1.method6516(arg0);
				Static230.method3933(local1657);
			}
			if (arg0.startsWith("fps ") && Static508.aClass109_7 != Static51.aClass109_2) {
				Static245.method4407(Static403.method6559(arg0.substring(4)));
				return;
			}
			if (Static75.anInt1880 != 10) {
				Static454.method7045("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(2129) Exception local2129) {
			Static454.method7045("Whoops, something went wrong.");
			return;
		}
	}
}
