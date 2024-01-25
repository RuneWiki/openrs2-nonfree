import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "[Lclient!eq;")
	public static Class11_Sub1[] aClass11_Sub1Array1;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
	public static final int[] anIntArray110 = new int[2048];

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
	public static final int anInt904 = 1405;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZBLjava/lang/String;Z)V")
	public static void method804(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static268.aClass170_5 == Static254.aClass170_4 && Static435.anInt6026 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static209.aBoolean360 = true;
				Static246.method3501("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static209.aBoolean360 = false;
				Static246.method3501("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static246.method3501("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static180.anInt3219 = 0;
				Static156.anInt2547 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static349.aClass63_7.method1025();
				Static246.method3501("Text coords cleared");
				return;
			}
			@Pc(128) int local128;
			@Pc(108) int local108;
			@Pc(119) Runtime local119;
			if (arg1.equalsIgnoreCase("gc")) {
				Static79.method968();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static246.method3501("mem=" + local128 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static79.method968();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static246.method3501("Memory before cleanup=" + local128 + "k");
				Static369.method4805();
				Static79.method968();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static246.method3501("Memory after cleanup=" + local128 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static246.method3501("Number of player models in cache:" + Static336.method4400());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static246.method3501("Dropped client connection");
				if (Static135.anInt2114 == 9) {
					Static75.method935();
					return;
				}
				if (Static135.anInt2114 == 10) {
					Static106.aBoolean649 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static270.aClass269_3.method5750();
				Static246.method3501("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static270.aClass269_3.method5747();
				Static246.method3501("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static259.aClass177_2.method3850();
				Static337.aClass110_2.method3782();
				Static270.aClass269_3.method5759();
				Static246.method3501("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static200.method2868();
				Static349.method4563();
				Static246.method3501("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static461.method5951(-1, false, -1, 1);
				if (Static208.method3017() != 1) {
					Static246.method3501("wm1 failed");
					return;
				}
				Static246.method3501("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static461.method5951(-1, false, -1, 2);
				if (Static208.method3017() != 2) {
					Static246.method3501("wm2 failed");
					return;
				}
				Static246.method3501("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static461.method5951(768, false, 1024, 3);
				if (Static208.method3017() != 3) {
					Static246.method3501("wm3 failed");
					return;
				}
				Static246.method3501("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static422.method5393(0);
				if (Static214.anInt3968 == 0) {
					Static246.method3501("Entered tk0");
					Static126.aClass19_Sub1_1.anInt4219 = 0;
					Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
					Static355.aBoolean515 = false;
					return;
				}
				Static246.method3501("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static422.method5393(1);
				if (Static214.anInt3968 != 1) {
					Static246.method3501("Failed to enter tk1");
					return;
				}
				Static246.method3501("Entered tk1");
				Static126.aClass19_Sub1_1.anInt4219 = 1;
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
				Static355.aBoolean515 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static422.method5393(2);
				if (Static214.anInt3968 == 2) {
					Static246.method3501("Entered tk2");
					Static126.aClass19_Sub1_1.anInt4219 = 2;
					Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
					Static355.aBoolean515 = false;
					return;
				}
				Static246.method3501("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static422.method5393(3);
				if (Static214.anInt3968 != 3) {
					Static246.method3501("Failed to enter tk3");
					return;
				}
				Static246.method3501("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static126.aClass19_Sub1_1.aBoolean392 = !Static126.aClass19_Sub1_1.aBoolean392;
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
				Static355.aBoolean515 = false;
				Static200.method2868();
				Static246.method3501("ot=" + Static126.aClass19_Sub1_1.aBoolean392);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static126.aClass19_Sub1_1.aBoolean384 = !Static126.aClass19_Sub1_1.aBoolean384;
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
				Static355.aBoolean515 = false;
				Static200.method2868();
				Static246.method3501("gb=" + Static126.aClass19_Sub1_1.aBoolean384);
				return;
			}
			@Pc(573) int local573;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static246.method3501("Invalid shadows value");
					return;
				}
				@Pc(563) String local563 = arg1.substring(8);
				local573 = Static279.method3754(local563) ? Static252.method3564(local563) : -1;
				if (local573 >= 0 && local573 <= 2) {
					Static126.aClass19_Sub1_1.method3342(local573, Static214.anInt3968);
					Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
					Static355.aBoolean515 = false;
					Static200.method2868();
					Static246.method3501("shadows=" + local573);
					return;
				}
				Static246.method3501("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static126.aClass19_Sub1_1.aBoolean376 = !Static126.aClass19_Sub1_1.aBoolean376;
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
				Static355.aBoolean515 = false;
				Static443.method5528();
				Static200.method2868();
				Static246.method3501("textures=" + Static126.aClass19_Sub1_1.aBoolean376);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static246.method3501("Invalid buildarea value");
					return;
				}
				local108 = Static252.method3564(arg1.substring(6));
				if (local108 >= 0 && Static137.method1748(Static45.anInt669) >= local108) {
					Static126.aClass19_Sub1_1.anInt4233 = local108;
					Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
					Static355.aBoolean515 = false;
					Static246.method3501("maxbuildarea=" + Static126.aClass19_Sub1_1.anInt4233);
					return;
				}
				Static246.method3501("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static246.method3501("Invalid particles value");
					return;
				}
				Static151.method1903(Static252.method3564(arg1.substring(13)));
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
				Static355.aBoolean515 = false;
				Static246.method3501("particles=" + Static60.method838());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static246.method3501("Invalid rect_debug value");
					return;
				}
				Static202.anInt7380 = Static252.method3564(arg1.substring(10).trim());
				Static246.method3501("rect_debug=" + Static202.anInt7380);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static312.aBoolean465 = true;
				Static246.method3501("qa_op_test=" + Static312.aBoolean465);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static118.aBoolean191 = !Static118.aBoolean191;
				Static246.method3501("clipcomponents=" + Static118.aBoolean191);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(803) boolean local803 = Static186.aClass117_3.method5713();
				if (Static445.method5629(!local803)) {
					if (!local803) {
						Static246.method3501("Bloom enabled");
						return;
					}
					Static246.method3501("Bloom disabled");
					return;
				}
				Static246.method3501("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static463.aBoolean651) {
					Static463.aBoolean651 = false;
					Static246.method3501("Forced tweening disabled.");
					return;
				}
				Static463.aBoolean651 = true;
				Static246.method3501("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static53.aBoolean106) {
					Static246.method3501("Shift-click ENABLED!");
					Static53.aBoolean106 = true;
					return;
				}
				Static246.method3501("Shift-click disabled.");
				Static53.aBoolean106 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static246.method3501("x:" + (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7) + " z:" + (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static246.method3501("Height: " + Static452.aClass139Array3[Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90].ua(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static178.aClass185_49.method4013();
				Static178.aClass185_49.method4023();
				Static60.aClass223_1.method4703();
				Static205.aClass36_2.method661();
				Static349.method4563();
				Static246.method3501("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static186.aClass117_3.method5721()) {
					Static246.method3501("Current toolkit doesn't support multiple cores");
					return;
				}
				local108 = Integer.parseInt(arg1.substring(3));
				if (local108 < 1) {
					local108 = 1;
				} else if (local108 > 4) {
					local108 = 4;
				}
				Static452.anInt7194 = local108;
				Static186.aClass117_3.method5718(Static452.anInt7194);
				Static186.aClass117_3.method5722(0);
				Static246.method3501("Render cores now: " + Static452.anInt7194);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static246.method3501("I(s): " + Static459.aClass77_63.method1389() + "/" + Static459.aClass77_63.method1392());
				Static246.method3501("I(m): " + Static368.aClass77_60.method1389() + "/" + Static368.aClass77_60.method1392());
				Static246.method3501("O(s): " + Static285.aClass226_2.aClass181_1.method3923() + "/" + Static285.aClass226_2.aClass181_1.method3928());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static246.method3501("Pos: " + Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 + "," + (Static315.anInt5207 + (Static386.anInt7155 >> 7) >> 6) + "," + (Static47.anInt676 + (Static80.anInt1106 >> 7) >> 6) + "," + (Static315.anInt5207 + (Static386.anInt7155 >> 7) & 0x3F) + "," + (Static47.anInt676 + (Static80.anInt1106 >> 7) & 0x3F) + " Height: " + (Static135.method1732(Static386.anInt7155, Static80.anInt1106, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90) - Static375.anInt6055));
				Static246.method3501("Look: " + Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 + "," + (Static205.anInt3787 + Static315.anInt5207 >> 6) + "," + (Static47.anInt676 + Static150.anInt4704 >> 6) + "," + (Static315.anInt5207 + Static205.anInt3787 & 0x3F) + "," + (Static47.anInt676 + Static150.anInt4704 & 0x3F) + " Height: " + (Static135.method1732(Static205.anInt3787, Static150.anInt4704, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90) - Static86.anInt7437));
				return;
			}
			if (arg1.equals("showocc")) {
				Static99.aBoolean154 = !Static99.aBoolean154;
				Static200.method2868();
				Static246.method3501("showocc=" + Static99.aBoolean154);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static453.aBoolean628 = !Static453.aBoolean628;
				Static200.method2868();
				Static246.method3501("forcewallocc=" + Static453.aBoolean628);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static305.aBoolean462 = !Static305.aBoolean462;
				Static186.aClass117_3.method5674(Static305.aBoolean462);
				Static385.method4958();
				Static246.method3501("showprofiling=" + Static305.aBoolean462);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static246.method3501("Java toolkit: " + Static381.method4906(Static259.aClass177_2));
				Static246.method3501("GL toolkit:   " + Static381.method4906(Static259.aClass177_2));
				Static246.method3501("SSE toolkit:  " + Static381.method4906(Static259.aClass177_2));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static164.aBoolean572 = !Static164.aBoolean572;
				Static246.method3501("nonpcs=" + Static164.aBoolean572);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static168.method2855();
				Static246.method3501("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local108 = Integer.parseInt(arg1.substring(12));
				Static276.method3740(local108, Static227.method3224(local108).aString65);
				Static246.method3501("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static246.method3501("w: " + Static440.aClass112_6.anInt2708);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static178.method2589(Static368.aClass242_118);
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				local108 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
				local573 = arg1.indexOf(" ", 4);
				Static426.aClass1_Sub19_Sub2_2.method2935(arg1.substring(3, local573));
				Static284.method3783(Static426.aClass1_Sub19_Sub2_2, arg1.substring(local573));
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local108);
				return;
			}
			if (arg1.equals("heap")) {
				Static246.method3501("Heap: " + Static45.anInt669 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static317.method4196();
				Static246.method3501("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local108 = 0; local108 < Static136.anIntArray184.length; local108++) {
					if (Static173.aBooleanArray67[local108]) {
						Static136.anIntArray184[local108] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static136.anIntArray184[local108] *= -1;
						}
					}
				}
				Static317.method4196();
				Static246.method3501("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static34.aBoolean77 = true;
				Static349.method4563();
				Static246.method3501("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static34.aBoolean77 = false;
				Static349.method4563();
				Static246.method3501("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static167.method2199();
				Static246.method3501("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static246.method3501(Static85.method5074() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local108 = Integer.parseInt(arg1.substring(9));
				if (local108 >= 0 && local108 <= 4) {
					Static126.aClass19_Sub1_1.anInt4227 = local108;
				}
				Static246.method3501("cpuusage=" + Static126.aClass19_Sub1_1.anInt4227);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local108 = Integer.parseInt(arg1.substring(17));
				Static246.method3501("varpbit=" + Static32.aClass4_1.method31(local108));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local108 = Integer.parseInt(arg1.substring(14));
				Static246.method3501("varp=" + Static32.aClass4_1.method30(local108));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static258.method3614(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static258.method3614(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1628) String[] local1628 = Static354.method4612(' ', arg1.substring(12));
				if (local1628.length >= 2) {
					local573 = local1628.length <= 2 ? 0 : Integer.parseInt(local1628[2]);
					Static418.method5350(local1628[1], local1628[0], local573);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static198.method2846();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static198.method2840();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static198.method2840();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local108 = Integer.parseInt(arg1.substring(8));
				Static186.aClass117_3.method5704(local108);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static246.method3501("Active streams: " + Static123.aClass1_Sub9_Sub1_1.method4258());
				return;
			}
			if (arg1.equals("errormessage")) {
				Static246.method3501(Static324.aClient1.method749());
				return;
			}
			if (Static135.anInt2114 == 9) {
				Static178.method2589(Static284.aClass242_79);
				Static426.aClass1_Sub19_Sub2_2.method2934(arg1.length() + 3);
				Static426.aClass1_Sub19_Sub2_2.method2934(arg0 ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2934(arg2 ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2935(arg1);
			}
			if (arg1.startsWith("fps ") && Static254.aClass170_4 != Static268.aClass170_5) {
				Static236.method3366(Static252.method3564(arg1.substring(4)));
				return;
			}
			if (Static135.anInt2114 != 9) {
				Static246.method3501("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1789) Exception local1789) {
			Static246.method3501("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(Z)V")
	public static void method806(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static259.aClass216ArrayArrayArray3 = Static165.aClass216ArrayArrayArray2;
			Static452.aClass139Array3 = Static397.aClass139Array2;
		} else {
			Static259.aClass216ArrayArrayArray3 = Static71.aClass216ArrayArrayArray1;
			Static452.aClass139Array3 = Static157.aClass139Array1;
		}
		Static112.anInt1710 = Static259.aClass216ArrayArrayArray3.length;
	}
}
