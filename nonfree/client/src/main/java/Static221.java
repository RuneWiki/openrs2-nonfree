import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "[Lclient!ya;")
	public static Class96[] aClass96Array4;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
	public static final int anInt4419 = 0;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public static int anInt4420 = 0;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_59 = new Class177(4, 7);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!qs;Lclient!qs;Lclient!td;Lclient!qs;I)Z")
	public static boolean method3427(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class1_Sub19_Sub3 arg2, @OriginalArg(3) Class211 arg3) {
		Static450.aClass211_92 = arg1;
		Static26.aClass1_Sub19_Sub3_1 = arg2;
		Static363.aClass211_76 = arg0;
		Static146.aClass211_39 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method3428() {
		@Pc(7) Class128 local7 = null;
		try {
			@Pc(13) Class157 local13 = Static150.aClass183_3.method4157("2", true);
			while (local13.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (local13.anInt4667 == 1) {
				local7 = (Class128) local13.anObject13;
				@Pc(45) byte[] local45 = new byte[(int) local7.method3092()];
				@Pc(60) int local60;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local60) {
					local60 = local7.method3093(local45.length - local47, local47, local45);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				Static366.method5115(new Class1_Sub3(local45));
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method3091();
			}
		} catch (@Pc(92) Exception local92) {
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;ZBZ)V")
	public static void method3429(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static59.aClass248_1 == Static314.aClass248_7 && Static41.anInt1052 < 2) {
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
				Static227.aBoolean283 = true;
				Static336.method4727("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static227.aBoolean283 = false;
				Static336.method4727("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static336.method4727("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(71) Throwable local71) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static32.anInt888 = 0;
				Static453.anInt7924 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static367.aClass117_8.method2960();
				Static336.method4727("Text coords cleared");
				return;
			}
			@Pc(117) int local117;
			@Pc(100) int local100;
			@Pc(108) Runtime local108;
			if (arg0.equalsIgnoreCase("gc")) {
				Static9.method2257();
				for (local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local108 = Runtime.getRuntime();
				local117 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static336.method4727("mem=" + local117 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static9.method2257();
				for (local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local108 = Runtime.getRuntime();
				local117 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static336.method4727("Memory before cleanup=" + local117 + "k");
				Static363.method5088();
				Static9.method2257();
				for (@Pc(173) int local173 = 0; local173 < 10; local173++) {
					System.gc();
				}
				local117 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static336.method4727("Memory after cleanup=" + local117 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static336.method4727("Number of player models in cache:" + Static322.method4581());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static336.method4727("Dropped client connection");
				if (Static170.anInt3494 == 9) {
					Static48.method898();
				} else if (Static170.anInt3494 == 10) {
					Static259.aBoolean313 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static175.aClass159_2.method3619();
				Static336.method4727("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static175.aClass159_2.method3616();
				Static336.method4727("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static150.aClass183_3.method4160();
				Static388.aClass236_13.method5229();
				Static175.aClass159_2.method3614();
				Static336.method4727("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static69.method1330();
				Static249.method3728();
				Static336.method4727("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static230.method3513(-1, 1, false, -1);
				if (Static86.method1531() != 1) {
					Static336.method4727("wm1 failed");
					return;
				}
				Static336.method4727("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static230.method3513(-1, 2, false, -1);
				if (Static86.method1531() != 2) {
					Static336.method4727("wm2 failed");
					return;
				}
				Static336.method4727("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static230.method3513(768, 3, false, 1024);
				if (Static86.method1531() == 3) {
					Static336.method4727("wm3 succeeded");
					return;
				}
				Static336.method4727("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static197.method3166(0);
				if (Static262.anInt2805 != 0) {
					Static336.method4727("Failed to enter tk0");
					return;
				}
				Static336.method4727("Entered tk0");
				Static12.aClass34_Sub1_1.anInt7162 = 0;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static197.method3166(1);
				if (Static262.anInt2805 == 1) {
					Static336.method4727("Entered tk1");
					Static12.aClass34_Sub1_1.anInt7162 = 1;
					Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
					Static399.aBoolean22 = false;
					return;
				}
				Static336.method4727("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static197.method3166(2);
				if (Static262.anInt2805 != 2) {
					Static336.method4727("Failed to enter tk2");
					return;
				}
				Static336.method4727("Entered tk2");
				Static12.aClass34_Sub1_1.anInt7162 = 2;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static197.method3166(3);
				if (Static262.anInt2805 != 3) {
					Static336.method4727("Failed to enter tk3");
					return;
				}
				Static336.method4727("Entered tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static12.aClass34_Sub1_1.aBoolean444 = !Static12.aClass34_Sub1_1.aBoolean444;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				Static69.method1330();
				Static336.method4727("ot=" + Static12.aClass34_Sub1_1.aBoolean444);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static12.aClass34_Sub1_1.aBoolean446 = !Static12.aClass34_Sub1_1.aBoolean446;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				Static69.method1330();
				Static336.method4727("gb=" + Static12.aClass34_Sub1_1.aBoolean446);
				return;
			}
			@Pc(555) int local555;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static336.method4727("Invalid shadows value");
					return;
				}
				@Pc(545) String local545 = arg0.substring(8);
				local555 = Static437.method5877(local545) ? Static293.method3599(local545) : -1;
				if (local555 >= 0 && local555 <= 2) {
					Static12.aClass34_Sub1_1.method5461(local555, Static262.anInt2805);
					Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
					Static399.aBoolean22 = false;
					Static69.method1330();
					Static336.method4727("shadows=" + local555);
					return;
				}
				Static336.method4727("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static12.aClass34_Sub1_1.aBoolean458 = !Static12.aClass34_Sub1_1.aBoolean458;
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				Static226.method3464();
				Static69.method1330();
				Static336.method4727("textures=" + Static12.aClass34_Sub1_1.aBoolean458);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static336.method4727("Invalid buildarea value");
					return;
				}
				local100 = Static293.method3599(arg0.substring(6));
				if (local100 >= 0 && Static380.method5247(Static155.anInt3339) >= local100) {
					Static12.aClass34_Sub1_1.anInt7165 = local100;
					Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
					Static399.aBoolean22 = false;
					Static336.method4727("maxbuildarea=" + Static12.aClass34_Sub1_1.anInt7165);
					return;
				}
				Static336.method4727("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static336.method4727("Invalid particles value");
					return;
				}
				Static176.method2984(Static293.method3599(arg0.substring(13)));
				Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
				Static399.aBoolean22 = false;
				Static336.method4727("particles=" + Static301.method4354());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static336.method4727("Invalid rect_debug value");
					return;
				}
				Static213.anInt3960 = Static293.method3599(arg0.substring(10).trim());
				Static336.method4727("rect_debug=" + Static213.anInt3960);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static226.aBoolean281 = true;
				Static336.method4727("qa_op_test=" + Static226.aBoolean281);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static291.aBoolean483 = !Static291.aBoolean483;
				Static336.method4727("clipcomponents=" + Static291.aBoolean483);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(781) boolean local781 = Static30.aClass106_3.method5945();
				if (!Static211.method3322(!local781)) {
					Static336.method4727("Failed to enable bloom");
					return;
				}
				if (local781) {
					Static336.method4727("Bloom disabled");
					return;
				}
				Static336.method4727("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static261.aBoolean314) {
					Static261.aBoolean314 = true;
					Static336.method4727("Forced tweening ENABLED!");
					return;
				}
				Static261.aBoolean314 = false;
				Static336.method4727("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static326.aBoolean381) {
					Static336.method4727("Shift-click ENABLED!");
					Static326.aBoolean381 = true;
					return;
				}
				Static336.method4727("Shift-click disabled.");
				Static326.aBoolean381 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static336.method4727("x:" + (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7) + " z:" + (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static336.method4727("Height: " + Static396.aClass96Array5[Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102].ua(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static140.aClass211_38.method4766();
				Static140.aClass211_38.method4764();
				Static420.aClass84_2.method1798();
				Static163.aClass170_2.method3741();
				Static249.method3728();
				Static336.method4727("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static30.aClass106_3.method5980()) {
					Static336.method4727("Current toolkit doesn't support multiple cores");
					return;
				}
				local100 = Integer.parseInt(arg0.substring(3));
				if (local100 < 1) {
					local100 = 1;
				} else if (local100 > 4) {
					local100 = 4;
				}
				Static453.anInt7926 = local100;
				Static30.aClass106_3.method5911(Static453.anInt7926);
				Static30.aClass106_3.method5978(0);
				Static336.method4727("Render cores now: " + Static453.anInt7926);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static336.method4727("I(s): " + Static81.aClass91_25.method1991() + "/" + Static81.aClass91_25.method2000());
				Static336.method4727("I(m): " + Static89.aClass91_104.method1991() + "/" + Static89.aClass91_104.method2000());
				Static336.method4727("O(s): " + Static43.aClass57_1.aClass229_1.method5106() + "/" + Static43.aClass57_1.aClass229_1.method5110());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static336.method4727("Pos: " + Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 + "," + (Static278.anInt5374 + (Static378.anInt6885 >> 7) >> 6) + "," + ((Static78.anInt1973 >> 7) + Static380.anInt6896 >> 6) + "," + ((Static378.anInt6885 >> 7) + Static278.anInt5374 & 0x3F) + "," + (Static380.anInt6896 + (Static78.anInt1973 >> 7) & 0x3F) + " Height: " + (Static227.method3475(Static378.anInt6885, Static78.anInt1973, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) - Static107.anInt2426));
				Static336.method4727("Look: " + Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 + "," + (Static278.anInt5374 + Static325.anInt6023 >> 6) + "," + (Static41.anInt1051 + Static380.anInt6896 >> 6) + "," + (Static325.anInt6023 + Static278.anInt5374 & 0x3F) + "," + (Static41.anInt1051 + Static380.anInt6896 & 0x3F) + " Height: " + (Static227.method3475(Static325.anInt6023, Static41.anInt1051, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) - Static195.anInt4072));
				return;
			}
			if (arg0.equals("showocc")) {
				Static166.aBoolean205 = !Static166.aBoolean205;
				Static69.method1330();
				Static336.method4727("showocc=" + Static166.aBoolean205);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static153.aBoolean324 = !Static153.aBoolean324;
				Static69.method1330();
				Static336.method4727("forcewallocc=" + Static153.aBoolean324);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static28.aBoolean25 = !Static28.aBoolean25;
				Static30.aClass106_3.method5971(Static28.aBoolean25);
				Static53.method993();
				Static336.method4727("showprofiling=" + Static28.aBoolean25);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static336.method4727("Java toolkit: " + Static214.method5443(Static150.aClass183_3));
				Static336.method4727("GL toolkit:   " + Static214.method5443(Static150.aClass183_3));
				Static336.method4727("SSE toolkit:  " + Static214.method5443(Static150.aClass183_3));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static201.aBoolean259 = !Static201.aBoolean259;
				Static336.method4727("nonpcs=" + Static201.aBoolean259);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static220.method3422();
				Static336.method4727("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local100 = Integer.parseInt(arg0.substring(12));
				Static388.method5417(local100, Static439.method5905(local100).aString28);
				Static336.method4727("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static336.method4727("w: " + Static156.aClass35_9.anInt1006);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static32.method677(Static101.aClass177_33);
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				local100 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
				local555 = arg0.indexOf(" ", 4);
				Static433.aClass1_Sub3_Sub1_11.method1190(arg0.substring(3, local555));
				Static143.method2293(arg0.substring(local555), Static433.aClass1_Sub3_Sub1_11);
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local100);
				return;
			}
			if (arg0.equals("heap")) {
				Static336.method4727("Heap: " + Static155.anInt3339 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static208.method3578();
				Static336.method4727("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local100 = 0; local100 < Static31.anIntArray221.length; local100++) {
					if (Static398.aBooleanArray23[local100]) {
						Static31.anIntArray221[local100] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static31.anIntArray221[local100] *= -1;
						}
					}
				}
				Static208.method3578();
				Static336.method4727("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static195.aBoolean248 = true;
				Static249.method3728();
				Static336.method4727("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static195.aBoolean248 = false;
				Static249.method3728();
				Static336.method4727("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static312.method4476();
				Static336.method4727("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static336.method4727(Static236.method3593() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local100 = Integer.parseInt(arg0.substring(9));
				if (local100 >= 0 && local100 <= 4) {
					Static12.aClass34_Sub1_1.anInt7171 = local100;
				}
				Static336.method4727("cpuusage=" + Static12.aClass34_Sub1_1.anInt7171);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local100 = Integer.parseInt(arg0.substring(17));
				Static336.method4727("varpbit=" + Static366.aClass190_1.method4299(local100));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local100 = Integer.parseInt(arg0.substring(14));
				Static336.method4727("varp=" + Static366.aClass190_1.method4300(local100));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static349.method4942(false, 0);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static349.method4942(true, 0);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1576) String[] local1576 = Static117.method1928(' ', arg0.substring(12));
				if (local1576.length >= 2) {
					local555 = local1576.length > 2 ? Integer.parseInt(local1576[2]) : 0;
					Static327.method4636(local1576[1], local1576[0], local555);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static178.method2997();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static178.method3003();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static178.method3003();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local100 = Integer.parseInt(arg0.substring(8));
				Static30.aClass106_3.method5957(local100);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static336.method4727("Active streams: " + Static12.aClass1_Sub19_Sub2_1.method3183());
				return;
			}
			if (Static170.anInt3494 == 9) {
				Static32.method677(Static240.aClass177_65);
				Static433.aClass1_Sub3_Sub1_11.method1208(arg0.length() + 3);
				Static433.aClass1_Sub3_Sub1_11.method1208(arg1 ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1208(arg2 ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
			}
			if (arg0.startsWith("fps ") && Static59.aClass248_1 != Static314.aClass248_7) {
				Static271.method4035(Static293.method3599(arg0.substring(4)));
				return;
			}
			if (Static170.anInt3494 != 9) {
				Static336.method4727("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1721) Exception local1721) {
			Static336.method4727("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public static void method3431() {
		if (Static174.anInt3826 == 0) {
			return;
		}
		try {
			if (++Static54.anInt1413 > 2000) {
				if (Static388.aClass236_13 != null) {
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
				}
				if (Static319.anInt1887 >= 1) {
					Static174.anInt3826 = 0;
					Static168.anInt1719 = -5;
					return;
				}
				Static283.aClass35_11.aBoolean65 = !Static283.aClass35_11.aBoolean65;
				Static54.anInt1413 = 0;
				Static319.anInt1887++;
				Static174.anInt3826 = 1;
			}
			if (Static174.anInt3826 == 1) {
				Static184.aClass157_2 = Static150.aClass183_3.method4154(Static283.aClass35_11.method735(), Static283.aClass35_11.aString6);
				Static174.anInt3826 = 2;
			}
			@Pc(115) int local115;
			if (Static174.anInt3826 == 2) {
				if (Static184.aClass157_2.anInt4667 == 2) {
					throw new IOException();
				}
				if (Static184.aClass157_2.anInt4667 != 1) {
					return;
				}
				Static388.aClass236_13 = new Class236((Socket) Static184.aClass157_2.anObject13, Static150.aClass183_3);
				Static184.aClass157_2 = null;
				Static388.aClass236_13.method5227(Static433.aClass1_Sub3_Sub1_11.anInt1710, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
				Static360.method5075();
				local115 = Static388.aClass236_13.method5231();
				Static360.method5075();
				if (local115 != 21) {
					Static174.anInt3826 = 0;
					Static168.anInt1719 = local115;
					Static388.aClass236_13.method5236();
					Static388.aClass236_13 = null;
					return;
				}
				Static174.anInt3826 = 3;
			}
			if (Static174.anInt3826 == 3) {
				if (Static388.aClass236_13.method5235() < 1) {
					return;
				}
				Static399.aStringArray3 = new String[Static388.aClass236_13.method5231()];
				Static174.anInt3826 = 4;
			}
			if (Static174.anInt3826 == 4) {
				if (Static388.aClass236_13.method5235() < Static399.aStringArray3.length * 8) {
					return;
				}
				Static5.aClass1_Sub3_Sub1_1.anInt1710 = 0;
				Static388.aClass236_13.method5226(0, Static5.aClass1_Sub3_Sub1_1.aByteArray14, Static399.aStringArray3.length * 8);
				for (local115 = 0; local115 < Static399.aStringArray3.length; local115++) {
					Static399.aStringArray3[local115] = Static434.method5788(Static5.aClass1_Sub3_Sub1_1.method1162());
				}
				Static174.anInt3826 = 0;
				Static168.anInt1719 = 21;
				Static388.aClass236_13.method5236();
				Static388.aClass236_13 = null;
				return;
			}
		} catch (@Pc(204) IOException local204) {
			if (Static388.aClass236_13 != null) {
				Static388.aClass236_13.method5236();
				Static388.aClass236_13 = null;
			}
			if (Static319.anInt1887 >= 1) {
				Static168.anInt1719 = -4;
				Static174.anInt3826 = 0;
			} else {
				Static54.anInt1413 = 0;
				Static174.anInt3826 = 1;
				Static283.aClass35_11.aBoolean65 = !Static283.aClass35_11.aBoolean65;
				Static319.anInt1887++;
			}
		}
	}
}
