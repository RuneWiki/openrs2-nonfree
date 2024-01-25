import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	public static int anInt6387;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Lclient!kea;")
	public static Class161 aClass161_69;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!mca;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method5389(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static464.aClass253_15 == Static327.aClass253_10 && Static353.anInt6659 < 2) {
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
				Static120.aBoolean193 = true;
				Static457.method6860("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static120.aBoolean193 = false;
				Static457.method6860("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static457.method6860("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(84) Throwable local84) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static167.anInt3861 = 0;
				Static504.anInt9379 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static226.aClass90_10.method2324();
				Static457.method6860("Text coords cleared");
				return;
			}
			@Pc(113) int local113;
			@Pc(131) int local131;
			@Pc(122) Runtime local122;
			if (arg0.equalsIgnoreCase("gc")) {
				Static155.method2661();
				for (local113 = 0; local113 < 10; local113++) {
					System.gc();
				}
				local122 = Runtime.getRuntime();
				local131 = (int) ((local122.totalMemory() - local122.freeMemory()) / 1024L);
				Static457.method6860("mem=" + local131 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static155.method2661();
				for (local113 = 0; local113 < 10; local113++) {
					System.gc();
				}
				local122 = Runtime.getRuntime();
				local131 = (int) ((local122.totalMemory() - local122.freeMemory()) / 1024L);
				Static457.method6860("Memory before cleanup=" + local131 + "k");
				Static97.method1902();
				Static155.method2661();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local131 = (int) ((local122.totalMemory() - local122.freeMemory()) / 1024L);
				Static457.method6860("Memory after cleanup=" + local131 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("unloadnatives")) {
				Static457.method6860(Static280.method4812() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static457.method6860("Number of player models in cache:" + Static498.method7192());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static457.method6860("Dropped client connection");
				if (Static512.anInt8932 == 9) {
					Static492.method7175();
					return;
				}
				if (Static512.anInt8932 == 10) {
					Static463.aBoolean590 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
				Static81.aClass319_5.method7698();
				Static457.method6860("Rotated connection methods");
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static349.aClass153_2.method4120();
				Static457.method6860("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static349.aClass153_2.method4129();
				Static457.method6860("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static401.aClass285_11.method7049();
				Static467.aClass41_1.method1067();
				Static349.aClass153_2.method4119();
				Static457.method6860("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static318.method4381();
				Static370.method5843();
				Static457.method6860("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static295.method4940(-1, 1, false, -1);
				if (Static212.method3885() != 1) {
					Static457.method6860("wm1 failed");
					return;
				}
				Static457.method6860("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static295.method4940(-1, 2, false, -1);
				if (Static212.method3885() != 2) {
					Static457.method6860("wm2 failed");
					return;
				}
				Static457.method6860("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static295.method4940(1024, 3, false, 768);
				if (Static212.method3885() != 3) {
					Static457.method6860("wm3 failed");
					return;
				}
				Static457.method6860("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static269.method4698(0);
				if (Static382.anInt7091 != 0) {
					Static457.method6860("Failed to enter tk0");
					return;
				}
				Static457.method6860("Entered tk0");
				Static7.aClass3_Sub15_Sub1_1.anInt8379 = 0;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static269.method4698(1);
				if (Static382.anInt7091 != 1) {
					Static457.method6860("Failed to enter tk1");
					return;
				}
				Static457.method6860("Entered tk1");
				Static7.aClass3_Sub15_Sub1_1.anInt8379 = 1;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static269.method4698(2);
				if (Static382.anInt7091 == 2) {
					Static457.method6860("Entered tk2");
					Static7.aClass3_Sub15_Sub1_1.anInt8379 = 2;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				Static457.method6860("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static269.method4698(3);
				if (Static382.anInt7091 == 3) {
					Static457.method6860("Entered tk3");
					Static7.aClass3_Sub15_Sub1_1.anInt8379 = 3;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				Static457.method6860("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("tk4")) {
				Static269.method4698(4);
				if (Static382.anInt7091 == 4) {
					Static457.method6860("Entered tk4");
					Static7.aClass3_Sub15_Sub1_1.anInt8379 = 4;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				Static457.method6860("Failed to enter tk4");
				return;
			}
			if (arg0.equalsIgnoreCase("tk5")) {
				Static269.method4698(5);
				if (Static382.anInt7091 == 5) {
					Static457.method6860("Entered tk5");
					Static7.aClass3_Sub15_Sub1_1.anInt8379 = 5;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				Static457.method6860("Failed to enter tk5");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static7.aClass3_Sub15_Sub1_1.aBoolean599 = !Static7.aClass3_Sub15_Sub1_1.aBoolean599;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				Static318.method4381();
				Static457.method6860("ot=" + Static7.aClass3_Sub15_Sub1_1.aBoolean599);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static7.aClass3_Sub15_Sub1_1.aBoolean601 = !Static7.aClass3_Sub15_Sub1_1.aBoolean601;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				Static318.method4381();
				Static457.method6860("gb=" + Static7.aClass3_Sub15_Sub1_1.aBoolean601);
				return;
			}
			@Pc(674) int local674;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static457.method6860("Invalid shadows value");
					return;
				}
				@Pc(664) String local664 = arg0.substring(8);
				local674 = Static521.method7402(local664) ? Static454.method6837(local664) : -1;
				if (local674 >= 0 && local674 <= 2) {
					Static7.aClass3_Sub15_Sub1_1.method6948(local674, Static382.anInt7091);
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					Static318.method4381();
					Static457.method6860("shadows=" + local674);
					return;
				}
				Static457.method6860("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static7.aClass3_Sub15_Sub1_1.aBoolean602 = !Static7.aClass3_Sub15_Sub1_1.aBoolean602;
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				Static467.method6980();
				Static318.method4381();
				Static457.method6860("textures=" + Static7.aClass3_Sub15_Sub1_1.aBoolean602);
				return;
			}
			if (arg0.startsWith("lighting")) {
				Static7.aClass3_Sub15_Sub1_1.method6949(!Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091), Static382.anInt7091);
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				Static245.method4229();
				Static467.method6980();
				Static318.method4381();
				Static457.method6860("lighting=" + Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091));
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static457.method6860("Invalid buildarea value");
					return;
				}
				local113 = Static454.method6837(arg0.substring(6));
				if (local113 >= 0 && Static315.method5109(Class5_Sub1.lb) >= local113) {
					Static7.aClass3_Sub15_Sub1_1.anInt8365 = local113;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					Static457.method6860("maxbuildarea=" + Static7.aClass3_Sub15_Sub1_1.anInt8365);
					return;
				}
				Static457.method6860("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static457.method6860("Invalid particles value");
					return;
				}
				Static385.method5947(Static454.method6837(arg0.substring(13)));
				Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
				Static118.aBoolean189 = false;
				Static457.method6860("particles=" + Static260.method4581());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static457.method6860("Invalid rect_debug value");
					return;
				}
				Static336.anInt6343 = Static454.method6837(arg0.substring(10).trim());
				Static457.method6860("rect_debug=" + Static336.anInt6343);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static362.aBoolean430 = true;
				Static457.method6860("qa_op_test=" + Static362.aBoolean430);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static473.aBoolean580 = !Static473.aBoolean580;
				Static457.method6860("clipcomponents=" + Static473.aBoolean580);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(966) boolean local966 = Static121.aClass5_7.method7441();
				if (!Static226.method4083(!local966)) {
					Static457.method6860("Failed to enable bloom");
					return;
				}
				if (local966) {
					Static457.method6860("Bloom disabled");
					return;
				}
				Static457.method6860("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static497.aBoolean651) {
					Static497.aBoolean651 = true;
					Static457.method6860("Forced tweening ENABLED!");
					return;
				}
				Static497.aBoolean651 = false;
				Static457.method6860("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static37.aBoolean72) {
					Static457.method6860("Shift-click disabled.");
					Static37.aBoolean72 = false;
					return;
				}
				Static457.method6860("Shift-click ENABLED!");
				Static37.aBoolean72 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static457.method6860("x:" + (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9) + " z:" + (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static457.method6860("Height: " + Static511.aClass52Array3[Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100].JA(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 7, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static19.aClass161_7.method4256();
				Static19.aClass161_7.method4250();
				Static241.aClass198_15.method5095();
				Static531.aClass135_4.method3807();
				Static370.method5843();
				Static457.method6860("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static121.aClass5_7.method7480()) {
					Static457.method6860("Current toolkit doesn't support multiple cores");
					return;
				}
				local113 = Integer.parseInt(arg0.substring(3));
				if (local113 < 1) {
					local113 = 1;
				} else if (local113 > 4) {
					local113 = 4;
				}
				Static172.anInt3951 = local113;
				Static121.aClass5_7.method7474(Static172.anInt3951);
				Static121.aClass5_7.method7438(0);
				Static457.method6860("Render cores now: " + Static172.anInt3951);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static457.method6860("I(s): " + Static421.aClass125_50.method3510() + "/" + Static421.aClass125_50.method3507());
				Static457.method6860("I(m): " + Static383.aClass125_39.method3510() + "/" + Static383.aClass125_39.method3507());
				Static457.method6860("O(s): " + Static99.aClass96_7.aClass146_1.method4007() + "/" + Static99.aClass96_7.aClass146_1.method4005());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static457.method6860("Pos: " + Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 + "," + (Static223.anInt4827 + (Static311.anInt6050 >> 9) >> 6) + "," + (Static150.anInt3027 + (Static329.anInt6297 >> 9) >> 6) + "," + (Static223.anInt4827 + (Static311.anInt6050 >> 9) & 0x3F) + "," + (Static150.anInt3027 + (Static329.anInt6297 >> 9) & 0x3F) + " Height: " + (Static58.method1166(Static329.anInt6297, Static311.anInt6050, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) - Static347.anInt6620));
				Static457.method6860("Look: " + Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 + "," + (Static22.anInt8153 + Static223.anInt4827 >> 6) + "," + (Static347.anInt6621 + Static150.anInt3027 >> 6) + "," + (Static223.anInt4827 + Static22.anInt8153 & 0x3F) + "," + (Static150.anInt3027 + Static347.anInt6621 & 0x3F) + " Height: " + (Static58.method1166(Static347.anInt6621, Static22.anInt8153, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) - Static236.anInt1380));
				return;
			}
			if (arg0.equals("showocc")) {
				Static160.aBoolean278 = !Static160.aBoolean278;
				Static318.method4381();
				Static457.method6860("showocc=" + Static160.aBoolean278);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static367.aBoolean436 = !Static367.aBoolean436;
				Static318.method4381();
				Static457.method6860("forcewallocc=" + Static367.aBoolean436);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static481.aBoolean638 = !Static481.aBoolean638;
				Static121.aClass5_7.method7455(Static481.aBoolean638);
				Static544.method7772();
				Static457.method6860("showprofiling=" + Static481.aBoolean638);
				return;
			}
			if (arg0.startsWith("performancetest")) {
				local113 = -1;
				local674 = 1000;
				if (arg0.length() > 15) {
					@Pc(1426) String[] local1426 = Static439.method6626(' ', arg0);
					try {
						if (local1426.length > 1) {
							local674 = Integer.parseInt(local1426[1]);
						}
					} catch (@Pc(1437) Throwable local1437) {
					}
					try {
						if (local1426.length > 2) {
							local113 = Integer.parseInt(local1426[2]);
						}
					} catch (@Pc(1450) Throwable local1450) {
					}
				}
				if (local113 != -1) {
					Static457.method6860("Performance: " + Static6.method6470(Static382.anInt7091, local674));
					return;
				}
				Static457.method6860("Java toolkit: " + Static6.method6470(0, local674));
				Static457.method6860("SSE toolkit:  " + Static6.method6470(2, local674));
				Static457.method6860("D3D toolkit:  " + Static6.method6470(3, local674));
				Static457.method6860("GL toolkit:   " + Static6.method6470(1, local674));
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(1524) Class207 local1524 = Static121.aClass5_7.method7430();
				Static457.method6860("Vendor: " + local1524.anInt6309);
				Static457.method6860("Name: " + local1524.aString47);
				Static457.method6860("Version: " + local1524.anInt6308);
				Static457.method6860("Device: " + local1524.aString46);
				Static457.method6860("Driver Version: " + local1524.aLong188);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static159.aBoolean274 = !Static159.aBoolean274;
				Static457.method6860("nonpcs=" + Static159.aBoolean274);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static375.method5892();
				Static457.method6860("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local113 = Integer.parseInt(arg0.substring(12));
				Static165.method3203(Static45.method983(local113).aString24, local113);
				Static457.method6860("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static457.method6860("w: " + Static81.aClass319_5.anInt9320);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static278.method4791(Static416.aClass158_12);
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				local113 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
				local674 = arg0.indexOf(" ", 4);
				Static515.aClass3_Sub27_Sub1_2.method7608(arg0.substring(3, local674));
				Static318.method4378(arg0.substring(local674), Static515.aClass3_Sub27_Sub1_2);
				Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local113);
				return;
			}
			if (arg0.equals("heap")) {
				Static457.method6860("Heap: " + Class5_Sub1.lb + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static135.method2314();
				Static457.method6860("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local113 = 0; local113 < Static416.anIntArray153.length; local113++) {
					if (Static4.aBooleanArray44[local113]) {
						Static416.anIntArray153[local113] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static416.anIntArray153[local113] *= -1;
						}
					}
				}
				Static135.method2314();
				Static457.method6860("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static461.aBoolean587 = true;
				Static370.method5843();
				Static457.method6860("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static461.aBoolean587 = false;
				Static370.method5843();
				Static457.method6860("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static130.method2265();
				Static457.method6860("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static457.method6860(Static379.method5911() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local113 = Integer.parseInt(arg0.substring(9));
				if (local113 >= 0 && local113 <= 4) {
					Static7.aClass3_Sub15_Sub1_1.anInt8378 = local113;
				}
				Static457.method6860("cpuusage=" + Static7.aClass3_Sub15_Sub1_1.anInt8378);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local113 = Integer.parseInt(arg0.substring(17));
				Static457.method6860("varpbit=" + Static127.aClass215_1.method5534(local113));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local113 = Integer.parseInt(arg0.substring(14));
				Static457.method6860("varp=" + Static127.aClass215_1.method5535(local113));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static298.method7722(false, 0);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static298.method7722(true, 0);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1911) String[] local1911 = Static439.method6626(' ', arg0.substring(12));
				if (local1911.length >= 2) {
					local674 = local1911.length <= 2 ? 0 : Integer.parseInt(local1911[2]);
					Static302.method4988(local674, local1911[1], local1911[0]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static60.method1222();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static60.method1229();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static60.method1229();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local113 = Integer.parseInt(arg0.substring(8));
				Static121.aClass5_7.method7463(local113);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static457.method6860("Active streams: " + Static530.aClass3_Sub9_Sub3_2.method5655());
				return;
			}
			if (arg0.equals("autosetup")) {
				Static7.aClass3_Sub15_Sub1_1.method6962();
				Static457.method6860("Complete. Toolkit now: " + Static382.anInt7091);
				return;
			}
			if (arg0.equals("errormessage")) {
				Static457.method6860(Static317.aClient1.method1268());
				return;
			}
			if (Static512.anInt8932 == 9) {
				Static278.method4791(Static172.aClass158_47);
				Static515.aClass3_Sub27_Sub1_2.method7576(arg0.length() + 3);
				Static515.aClass3_Sub27_Sub1_2.method7576(arg1 ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7576(arg2 ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
			}
			if (arg0.startsWith("fps ") && Static464.aClass253_15 != Static327.aClass253_10) {
				Static220.method4023(Static454.method6837(arg0.substring(4)));
				return;
			}
			if (Static512.anInt8932 != 9) {
				Static457.method6860("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(2090) Exception local2090) {
			Static457.method6860("Whoops, something went wrong.");
			return;
		}
	}
}
