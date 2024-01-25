import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!hv", name = "F", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_67 = new Class55("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!hv", name = "I", descriptor = "Lclient!kq;")
	public static final Class136 aClass136_5 = new Class136("LIVE", 0);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)I")
	public static int method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(36) int local36 = (arg0 & 0x7F) * arg1 + (arg2 & 0x7F) * local17 >> 7;
		@Pc(50) int local50 = arg1 * (arg0 & 0x380) + local17 * (arg2 & 0x380) >> 7;
		@Pc(64) int local64 = arg1 * (arg0 & 0xFC00) + local17 * (arg2 & 0xFC00) >> 7;
		return local36 & 0x7F | local50 & 0x380 | local64 & 0xFC00;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method2414(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static313.aClass136_7 == aClass136_5 && Static157.anInt2920 < 2) {
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
				Static416.aBoolean433 = true;
				Static269.method3626("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static416.aBoolean433 = false;
				Static269.method3626("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static269.method3626("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(80) Throwable local80) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static68.anInt1324 = 0;
				Static72.anInt1377 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static335.aClass169_7.method3594();
				Static269.method3626("Text coords cleared");
				return;
			}
			@Pc(130) int local130;
			@Pc(109) int local109;
			@Pc(120) Runtime local120;
			if (arg0.equalsIgnoreCase("gc")) {
				Static24.method253();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static269.method3626("mem=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static24.method253();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static269.method3626("Memory before cleanup=" + local130 + "k");
				Static346.method4466();
				Static24.method253();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static269.method3626("Memory after cleanup=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static269.method3626("Number of player models in cache:" + Static305.method5644());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static269.method3626("Dropped client connection");
				if (Static206.anInt3642 == 9) {
					Static16.method5106();
					return;
				}
				if (Static206.anInt3642 == 10) {
					Static28.aBoolean13 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static90.aClass120_1.method2647();
				Static269.method3626("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static90.aClass120_1.method2654();
				Static269.method3626("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static230.aClass61_4.method1474();
				Static211.aClass247_4.method5154();
				Static90.aClass120_1.method2650();
				Static269.method3626("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static145.method2628();
				Static140.method793();
				Static269.method3626("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static335.method4379(1, -1, false, -1);
				if (Static120.method1994() != 1) {
					Static269.method3626("wm1 failed");
					return;
				}
				Static269.method3626("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static335.method4379(2, -1, false, -1);
				if (Static120.method1994() != 2) {
					Static269.method3626("wm2 failed");
					return;
				}
				Static269.method3626("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static335.method4379(3, 768, false, 1024);
				if (Static120.method1994() == 3) {
					Static269.method3626("wm3 succeeded");
					return;
				}
				Static269.method3626("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static90.method1613(0);
				if (Static377.anInt6113 == 0) {
					Static269.method3626("Entered tk0");
					Static130.aClass153_Sub1_1.anInt5245 = 0;
					Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
					Static169.aBoolean182 = false;
					return;
				}
				Static269.method3626("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static90.method1613(1);
				if (Static377.anInt6113 == 1) {
					Static269.method3626("Entered tk1");
					Static130.aClass153_Sub1_1.anInt5245 = 1;
					Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
					Static169.aBoolean182 = false;
					return;
				}
				Static269.method3626("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static90.method1613(2);
				if (Static377.anInt6113 != 2) {
					Static269.method3626("Failed to enter tk2");
					return;
				}
				Static269.method3626("Entered tk2");
				Static130.aClass153_Sub1_1.anInt5245 = 2;
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
				Static169.aBoolean182 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static90.method1613(3);
				if (Static377.anInt6113 == 3) {
					Static269.method3626("Entered tk3");
					return;
				}
				Static269.method3626("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static130.aClass153_Sub1_1.aBoolean350 = !Static130.aClass153_Sub1_1.aBoolean350;
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
				Static169.aBoolean182 = false;
				Static145.method2628();
				Static269.method3626("ot=" + Static130.aClass153_Sub1_1.aBoolean350);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static130.aClass153_Sub1_1.aBoolean348 = !Static130.aClass153_Sub1_1.aBoolean348;
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
				Static169.aBoolean182 = false;
				Static145.method2628();
				Static269.method3626("gb=" + Static130.aClass153_Sub1_1.aBoolean348);
				return;
			}
			@Pc(565) int local565;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static269.method3626("Invalid shadows value");
					return;
				}
				@Pc(555) String local555 = arg0.substring(8);
				local565 = Static106.method1840(local555) ? Static259.method3459(local555) : -1;
				if (local565 >= 0 && local565 <= 2) {
					Static130.aClass153_Sub1_1.method4220(Static377.anInt6113, local565);
					Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
					Static169.aBoolean182 = false;
					Static145.method2628();
					Static269.method3626("shadows=" + local565);
					return;
				}
				Static269.method3626("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static130.aClass153_Sub1_1.aBoolean338 = !Static130.aClass153_Sub1_1.aBoolean338;
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
				Static169.aBoolean182 = false;
				Static281.method5553();
				Static145.method2628();
				Static269.method3626("textures=" + Static130.aClass153_Sub1_1.aBoolean338);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static269.method3626("Invalid buildarea value");
					return;
				}
				local109 = Static259.method3459(arg0.substring(6));
				if (local109 >= 0 && Static435.method5603(Static268.anInt4537) >= local109) {
					Static130.aClass153_Sub1_1.anInt5234 = local109;
					Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
					Static169.aBoolean182 = false;
					Static269.method3626("maxbuildarea=" + Static130.aClass153_Sub1_1.anInt5234);
					return;
				}
				Static269.method3626("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static269.method3626("Invalid particles value");
					return;
				}
				Static36.method513(Static259.method3459(arg0.substring(13)));
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
				Static169.aBoolean182 = false;
				Static269.method3626("particles=" + Static35.method3785());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static269.method3626("Invalid rect_debug value");
					return;
				}
				Static288.anInt4801 = Static259.method3459(arg0.substring(10).trim());
				Static269.method3626("rect_debug=" + Static288.anInt4801);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static283.aBoolean297 = true;
				Static269.method3626("qa_op_test=" + Static283.aBoolean297);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static178.aBoolean196 = !Static178.aBoolean196;
				Static269.method3626("clipcomponents=" + Static178.aBoolean196);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(798) boolean local798 = Static269.aClass51_9.method5326();
				if (!Static143.method2214(!local798)) {
					Static269.method3626("Failed to enable bloom");
					return;
				}
				if (local798) {
					Static269.method3626("Bloom disabled");
					return;
				}
				Static269.method3626("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static262.aBoolean495) {
					Static262.aBoolean495 = true;
					Static269.method3626("Forced tweening ENABLED!");
					return;
				}
				Static262.aBoolean495 = false;
				Static269.method3626("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static243.aBoolean254) {
					Static269.method3626("Shift-click disabled.");
					Static243.aBoolean254 = false;
					return;
				}
				Static269.method3626("Shift-click ENABLED!");
				Static243.aBoolean254 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static269.method3626("x:" + (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7) + " z:" + (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static269.method3626("Height: " + Static244.aClass165Array8[Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102].l(Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static25.aClass178_9.method3825();
				Static25.aClass178_9.method3814();
				Static351.aClass176_4.method3719();
				Static106.aClass62_3.method1479();
				Static140.method793();
				Static269.method3626("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static269.aClass51_9.method5284()) {
					Static269.method3626("Current toolkit doesn't support multiple cores");
					return;
				}
				local109 = Integer.parseInt(arg0.substring(3));
				if (local109 < 1) {
					local109 = 1;
				} else if (local109 > 4) {
					local109 = 4;
				}
				Static367.anInt5880 = local109;
				Static269.aClass51_9.method5340(Static367.anInt5880);
				Static269.aClass51_9.method5341(0);
				Static269.method3626("Render cores now: " + Static367.anInt5880);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static269.method3626("I(s): " + Static226.aClass126_26.method2826() + "/" + Static226.aClass126_26.method2818());
				Static269.method3626("I(m): " + Static303.aClass126_42.method2826() + "/" + Static303.aClass126_42.method2818());
				Static269.method3626("O(s): " + Static259.aClass206_2.aClass110_1.method2370() + "/" + Static259.aClass206_2.aClass110_1.method2366());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static269.method3626("Pos: " + Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 + "," + ((Static46.anInt737 >> 7) + Static359.anInt5713 >> 6) + "," + (Static314.anInt5181 + (Static181.anInt3254 >> 7) >> 6) + "," + (Static359.anInt5713 + (Static46.anInt737 >> 7) & 0x3F) + "," + ((Static181.anInt3254 >> 7) + Static314.anInt5181 & 0x3F) + " Height: " + (Static333.method2748(Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, Static181.anInt3254, Static46.anInt737) - Static212.anInt3801));
				Static269.method3626("Look: " + Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 + "," + (Static359.anInt5713 + Static448.anInt7378 >> 6) + "," + (Static314.anInt5181 + Static453.anInt7459 >> 6) + "," + (Static359.anInt5713 + Static448.anInt7378 & 0x3F) + "," + (Static453.anInt7459 + Static314.anInt5181 & 0x3F) + " Height: " + (Static333.method2748(Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, Static453.anInt7459, Static448.anInt7378) - Static263.anInt4464));
				return;
			}
			if (arg0.equals("showocc")) {
				Static434.aBoolean485 = !Static434.aBoolean485;
				Static145.method2628();
				Static269.method3626("showocc=" + Static434.aBoolean485);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static162.aBoolean177 = !Static162.aBoolean177;
				Static145.method2628();
				Static269.method3626("forcewallocc=" + Static162.aBoolean177);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static416.aBoolean434 = !Static416.aBoolean434;
				Static269.aClass51_9.method5331(Static416.aBoolean434);
				Static32.method423();
				Static269.method3626("showprofiling=" + Static416.aBoolean434);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static269.method3626("Java toolkit: " + Static325.method4303(Static230.aClass61_4));
				Static269.method3626("GL toolkit:   " + Static325.method4303(Static230.aClass61_4));
				Static269.method3626("SSE toolkit:  " + Static325.method4303(Static230.aClass61_4));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static291.aBoolean304 = !Static291.aBoolean304;
				Static269.method3626("nonpcs=" + Static291.aBoolean304);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static20.method1884();
				Static269.method3626("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local109 = Integer.parseInt(arg0.substring(12));
				Static410.method5160(Static333.method2746(local109).aString18, local109);
				Static269.method3626("switched");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static81.method1414(Static261.aClass2_70);
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				local109 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
				local565 = arg0.indexOf(" ", 4);
				Static255.aClass7_Sub14_Sub1_2.method3947(arg0.substring(3, local565));
				Static47.method615(Static255.aClass7_Sub14_Sub1_2, arg0.substring(local565));
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local109);
				return;
			}
			if (arg0.equals("heap")) {
				Static269.method3626("Heap: " + Static268.anInt4537 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static157.method2340();
				Static269.method3626("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local109 = 0; local109 < Static101.anIntArray136.length; local109++) {
					if (Static196.aBooleanArray18[local109]) {
						Static101.anIntArray136[local109] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static101.anIntArray136[local109] *= -1;
						}
					}
				}
				Static157.method2340();
				Static269.method3626("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static213.aBoolean231 = true;
				Static140.method793();
				Static269.method3626("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static213.aBoolean231 = false;
				Static140.method793();
				Static269.method3626("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static69.method1173();
				Static269.method3626("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static269.method3626(Static289.method3845() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local109 = Integer.parseInt(arg0.substring(9));
				if (local109 >= 0 && local109 <= 4) {
					Static130.aClass153_Sub1_1.anInt5230 = local109;
				}
				Static269.method3626("cpuusage=" + Static130.aClass153_Sub1_1.anInt5230);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local109 = Integer.parseInt(arg0.substring(17));
				Static269.method3626("varpbit=" + Static224.aClass239_7.method4992(local109));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local109 = Integer.parseInt(arg0.substring(14));
				Static269.method3626("varp=" + Static224.aClass239_7.method4993(local109));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static151.method2278(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static151.method2278(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1588) String[] local1588 = Static295.method3893(arg0.substring(12), ' ');
				if (local1588.length >= 2) {
					local565 = local1588.length > 2 ? Integer.parseInt(local1588[2]) : 0;
					Static193.method2787(local565, local1588[1], local1588[0]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static159.method2350();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static159.method2343();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static159.method2343();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local109 = Integer.parseInt(arg0.substring(8));
				Static269.aClass51_9.method5345(local109);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static269.method3626("Active streams: " + Static452.aClass7_Sub8_Sub1_2.method2430());
				return;
			}
			if (Static206.anInt3642 == 9) {
				Static81.method1414(Static395.aClass2_100);
				Static255.aClass7_Sub14_Sub1_2.method3970(arg0.length() + 3);
				Static255.aClass7_Sub14_Sub1_2.method3970(arg1 ? 1 : 0);
				Static255.aClass7_Sub14_Sub1_2.method3970(arg2 ? 1 : 0);
				Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
			}
			if (arg0.startsWith("fps ") && Static313.aClass136_7 != aClass136_5) {
				Static240.method3266(Static259.method3459(arg0.substring(4)));
				return;
			}
			if (Static206.anInt3642 != 9) {
				Static269.method3626("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1735) Exception local1735) {
			Static269.method3626("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!sr;ZZ)V")
	public static void method2415(@OriginalArg(0) Class26_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static102.anInt2085 >= 400) {
			return;
		}
		@Pc(12) Class249 local12 = arg0.aClass249_1;
		if (local12.anIntArray579 != null) {
			local12 = local12.method5179(Static224.aClass239_7);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean428) {
			return;
		}
		@Pc(35) String local35 = local12.aString64;
		if (local12.anInt6535 != 0) {
			@Pc(54) String local54 = Static55.aClass137_1 == Static191.aClass137_3 ? Static236.aClass55_90.method1205(Static5.anInt20) : Static373.aClass55_124.method1205(Static5.anInt20);
			local35 = local35 + Static7.method42(local12.anInt6535, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143) + " (" + local54 + local12.anInt6535 + ")";
		}
		if (!Static402.aBoolean412) {
			if (!arg1) {
				@Pc(84) String[] local84 = local12.aStringArray51;
				if (Static444.aBoolean493) {
					local84 = Static206.method2969(local84);
				}
				@Pc(94) int local94;
				if (local84 != null) {
					for (local94 = 4; local94 >= 0; local94--) {
						if (local84[local94] != null && (local12.aByte84 == 0 || !local84[local94].equalsIgnoreCase(Static183.aClass55_71.method1205(Static5.anInt20)))) {
							@Pc(117) byte local117 = 0;
							if (local94 == 0) {
								local117 = 3;
							}
							@Pc(126) int local126 = Static357.anInt5687;
							if (local94 == 1) {
								local117 = 45;
							}
							if (local94 == 2) {
								local117 = 21;
							}
							if (local94 == 3) {
								local117 = 57;
							}
							if (local94 == local12.anInt6530) {
								local126 = local12.anInt6529;
							}
							if (local94 == 4) {
								local117 = 9;
							}
							if (local94 == local12.anInt6525) {
								local126 = local12.anInt6513;
							}
							Static181.method2635(0, local84[local94], local126, false, -1, "<col=ffff00>" + local35, 0, (long) arg0.anInt7080, true, local117);
						}
					}
				}
				if (local12.aByte84 == 1 && local84 != null) {
					for (local94 = 4; local94 >= 0; local94--) {
						if (local84[local94] != null && local84[local94].equalsIgnoreCase(Static183.aClass55_71.method1205(Static5.anInt20))) {
							@Pc(220) short local220 = 0;
							if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143 < local12.anInt6535) {
								local220 = 2000;
							}
							@Pc(233) short local233 = 0;
							if (local94 == 0) {
								local233 = 3;
							}
							if (local94 == 1) {
								local233 = 45;
							}
							if (local94 == 2) {
								local233 = 21;
							}
							if (local94 == 3) {
								local233 = 57;
							}
							if (local94 == 4) {
								local233 = 9;
							}
							if (local233 != 0) {
								local233 += local220;
							}
							Static181.method2635(0, local84[local94], local12.anInt6531, false, -1, "<col=ffff00>" + local35, 0, (long) arg0.anInt7080, true, local233);
						}
					}
				}
			}
			Static181.method2635(0, Static286.aClass55_89.method1205(Static5.anInt20), Static296.anInt4919, arg1, -1, "<col=ffff00>" + local35, 0, (long) arg0.anInt7080, true, 1010);
		} else if (!arg1) {
			@Pc(352) Class256 local352 = Static141.anInt2697 == -1 ? null : Static443.aClass193_4.method4068(Static141.anInt2697);
			if ((Static180.anInt3240 & 0x2) != 0) {
				if (local352 == null || local12.method5180(Static141.anInt2697, local352.anInt6961) != local352.anInt6961) {
					Static181.method2635(0, Static139.aString32, Static250.anInt4255, false, -1, Static73.aString7 + " -> <col=ffff00>" + local35, 0, (long) arg0.anInt7080, true, 49);
				}
				return;
			}
		}
	}
}
