import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Lclient!oca;")
	public static Class211 aClass211_2;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "[I")
	public static final int[] anIntArray506 = new int[50];

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
	public static int anInt6352 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method5411(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		if (Static455.aClass320_15 == Static414.aClass320_17 && Static475.anInt8486 < 2) {
			return;
		}
		if (arg2.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg2.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg2.equalsIgnoreCase("fpson")) {
				Static382.aBoolean529 = true;
				Static120.method2321("fps debug enabled");
				return;
			}
			if (arg2.equalsIgnoreCase("fpsoff")) {
				Static382.aBoolean529 = false;
				Static120.method2321("fps debug disabled");
				return;
			}
			if (arg2.equals("systemmem")) {
				try {
					Static120.method2321("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(78) Throwable local78) {
					return;
				}
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static62.anInt1194 = 0;
				Static262.anInt7160 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("cleartext")) {
				Static369.aClass107_7.method2838();
				Static120.method2321("Text coords cleared");
				return;
			}
			@Pc(107) int local107;
			@Pc(126) int local126;
			@Pc(116) Runtime local116;
			if (arg2.equalsIgnoreCase("gc")) {
				Static234.method3654();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local116 = Runtime.getRuntime();
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static120.method2321("mem=" + local126 + "k");
				return;
			}
			if (arg2.equalsIgnoreCase("compact")) {
				Static234.method3654();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local116 = Runtime.getRuntime();
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static120.method2321("Memory before cleanup=" + local126 + "k");
				Static386.method6005();
				Static234.method3654();
				for (@Pc(184) int local184 = 0; local184 < 10; local184++) {
					System.gc();
				}
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static120.method2321("Memory after cleanup=" + local126 + "k");
				return;
			}
			if (arg2.equalsIgnoreCase("unloadnatives")) {
				Static120.method2321(Static58.method1080() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg2.equalsIgnoreCase("pcachesize")) {
				Static120.method2321("Number of player models in cache:" + Static26.method601());
				return;
			}
			if (arg2.equalsIgnoreCase("clientdrop")) {
				Static120.method2321("Dropped client connection");
				if (Static271.anInt8654 == 9) {
					Static270.method7140();
				} else if (Static271.anInt8654 == 10) {
					Static158.aBoolean237 = true;
					return;
				}
				return;
			}
			if (arg2.equalsIgnoreCase("clientjs5drop")) {
				Static100.aClass94_1.method2487();
				Static120.method2321("Dropped client js5 net queue");
				return;
			}
			if (arg2.equalsIgnoreCase("serverjs5drop")) {
				Static100.aClass94_1.method2493();
				Static120.method2321("Dropped server js5 net queue");
				return;
			}
			if (arg2.equalsIgnoreCase("breakcon")) {
				Static531.aClass283_6.method7170();
				Static497.aClass173_2.method7258();
				Static100.aClass94_1.method2492();
				Static120.method2321("Breaking new connections for 5 seconds");
				return;
			}
			if (arg2.equalsIgnoreCase("rebuild")) {
				Static410.method6418();
				Static469.method7062();
				Static120.method2321("Rebuilding map");
				return;
			}
			if (arg2.equalsIgnoreCase("wm1")) {
				Static301.method4737(-1, false, -1, 1);
				if (Static181.method3002() == 1) {
					Static120.method2321("wm1 succeeded");
					return;
				}
				Static120.method2321("wm1 failed");
				return;
			}
			if (arg2.equalsIgnoreCase("wm2")) {
				Static301.method4737(-1, false, -1, 2);
				if (Static181.method3002() != 2) {
					Static120.method2321("wm2 failed");
					return;
				}
				Static120.method2321("wm2 succeeded");
				return;
			}
			if (arg2.equalsIgnoreCase("wm3")) {
				Static301.method4737(768, false, 1024, 3);
				if (Static181.method3002() != 3) {
					Static120.method2321("wm3 failed");
					return;
				}
				Static120.method2321("wm3 succeeded");
				return;
			}
			if (arg2.equalsIgnoreCase("tk0")) {
				Static233.method6719(0);
				if (Static266.anInt4923 == 0) {
					Static120.method2321("Entered tk0");
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = 0;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				Static120.method2321("Failed to enter tk0");
				return;
			}
			if (arg2.equalsIgnoreCase("tk1")) {
				Static233.method6719(1);
				if (Static266.anInt4923 == 1) {
					Static120.method2321("Entered tk1");
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = 1;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				Static120.method2321("Failed to enter tk1");
				return;
			}
			if (arg2.equalsIgnoreCase("tk2")) {
				Static233.method6719(2);
				if (Static266.anInt4923 != 2) {
					Static120.method2321("Failed to enter tk2");
					return;
				}
				Static120.method2321("Entered tk2");
				Static281.aClass2_Sub19_Sub1_1.anInt2180 = 2;
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				return;
			}
			if (arg2.equalsIgnoreCase("tk3")) {
				Static233.method6719(3);
				if (Static266.anInt4923 == 3) {
					Static120.method2321("Entered tk3");
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = 3;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				Static120.method2321("Failed to enter tk3");
				return;
			}
			if (arg2.equalsIgnoreCase("tk4")) {
				Static233.method6719(4);
				if (Static266.anInt4923 == 4) {
					Static120.method2321("Entered tk4");
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = 4;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				Static120.method2321("Failed to enter tk4");
				return;
			}
			if (arg2.equalsIgnoreCase("tk5")) {
				Static233.method6719(5);
				if (Static266.anInt4923 == 5) {
					Static120.method2321("Entered tk5");
					Static281.aClass2_Sub19_Sub1_1.anInt2180 = 5;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					return;
				}
				Static120.method2321("Failed to enter tk5");
				return;
			}
			if (arg2.equalsIgnoreCase("ot")) {
				Static281.aClass2_Sub19_Sub1_1.aBoolean189 = !Static281.aClass2_Sub19_Sub1_1.aBoolean189;
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				Static410.method6418();
				Static120.method2321("ot=" + Static281.aClass2_Sub19_Sub1_1.aBoolean189);
				return;
			}
			if (arg2.equalsIgnoreCase("gb")) {
				Static281.aClass2_Sub19_Sub1_1.aBoolean191 = !Static281.aClass2_Sub19_Sub1_1.aBoolean191;
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				Static410.method6418();
				Static120.method2321("gb=" + Static281.aClass2_Sub19_Sub1_1.aBoolean191);
				return;
			}
			@Pc(638) int local638;
			if (arg2.startsWith("shadows")) {
				if (arg2.length() < 8) {
					Static120.method2321("Invalid shadows value");
					return;
				}
				@Pc(628) String local628 = arg2.substring(8);
				local638 = Static9.method378(local628) ? Static359.method5799(local628) : -1;
				if (local638 >= 0 && local638 <= 2) {
					Static281.aClass2_Sub19_Sub1_1.method2138(local638, Static266.anInt4923);
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					Static410.method6418();
					Static120.method2321("shadows=" + local638);
					return;
				}
				Static120.method2321("Invalid shadows value");
				return;
			}
			if (arg2.startsWith("textures")) {
				Static281.aClass2_Sub19_Sub1_1.aBoolean179 = !Static281.aClass2_Sub19_Sub1_1.aBoolean179;
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				Static436.method6681();
				Static410.method6418();
				Static120.method2321("textures=" + Static281.aClass2_Sub19_Sub1_1.aBoolean179);
				return;
			}
			if (arg2.startsWith("lighting")) {
				Static281.aClass2_Sub19_Sub1_1.method2136(!Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923), Static266.anInt4923);
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				Static330.method3998();
				Static436.method6681();
				Static410.method6418();
				Static120.method2321("lighting=" + Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923));
				return;
			}
			if (arg2.startsWith("setba")) {
				if (arg2.length() < 6) {
					Static120.method2321("Invalid buildarea value");
					return;
				}
				local107 = Static359.method5799(arg2.substring(6));
				if (local107 >= 0 && local107 <= Static58.method1074(Static78.anInt1651)) {
					Static281.aClass2_Sub19_Sub1_1.anInt2189 = local107;
					Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
					Static210.aBoolean299 = false;
					Static120.method2321("maxbuildarea=" + Static281.aClass2_Sub19_Sub1_1.anInt2189);
					return;
				}
				Static120.method2321("Invalid buildarea value");
				return;
			}
			if (arg2.startsWith("setparticles")) {
				if (arg2.length() < 13) {
					Static120.method2321("Invalid particles value");
					return;
				}
				Static250.method3960(Static359.method5799(arg2.substring(13)));
				Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
				Static210.aBoolean299 = false;
				Static120.method2321("particles=" + Static523.method7573());
				return;
			}
			if (arg2.startsWith("rect_debug")) {
				if (arg2.length() < 10) {
					Static120.method2321("Invalid rect_debug value");
					return;
				}
				Static10.anInt227 = Static359.method5799(arg2.substring(10).trim());
				Static120.method2321("rect_debug=" + Static10.anInt227);
				return;
			}
			if (arg2.equalsIgnoreCase("qa_op_test")) {
				Static372.aBoolean522 = true;
				Static120.method2321("qa_op_test=" + Static372.aBoolean522);
				return;
			}
			if (arg2.equalsIgnoreCase("clipcomponents")) {
				Static101.aBoolean613 = !Static101.aBoolean613;
				Static120.method2321("clipcomponents=" + Static101.aBoolean613);
				return;
			}
			if (arg2.startsWith("bloom")) {
				@Pc(905) boolean local905 = Static103.aClass39_3.method6043();
				if (!Static3.method262(!local905)) {
					Static120.method2321("Failed to enable bloom");
					return;
				}
				if (!local905) {
					Static120.method2321("Bloom enabled");
					return;
				}
				Static120.method2321("Bloom disabled");
				return;
			}
			if (arg2.equalsIgnoreCase("tween")) {
				if (Static112.aBoolean204) {
					Static112.aBoolean204 = false;
					Static120.method2321("Forced tweening disabled.");
					return;
				}
				Static112.aBoolean204 = true;
				Static120.method2321("Forced tweening ENABLED!");
				return;
			}
			if (arg2.equalsIgnoreCase("shiftclick")) {
				if (!Static150.aBoolean224) {
					Static120.method2321("Shift-click ENABLED!");
					Static150.aBoolean224 = true;
					return;
				}
				Static120.method2321("Shift-click disabled.");
				Static150.aBoolean224 = false;
				return;
			}
			if (arg2.equalsIgnoreCase("getcgcoord")) {
				Static120.method2321("x:" + (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7) + " z:" + (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7));
				return;
			}
			if (arg2.equalsIgnoreCase("getheight")) {
				Static120.method2321("Height: " + Static532.aClass75Array3[Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90].ba(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7));
				return;
			}
			if (arg2.equalsIgnoreCase("resetminimap")) {
				Static460.aClass53_147.method1614();
				Static460.aClass53_147.method1618();
				Static537.aClass112_4.method2956();
				Static387.aClass56_4.method1681();
				Static469.method7062();
				Static120.method2321("Minimap reset");
				return;
			}
			if (arg2.startsWith("mc")) {
				if (!Static103.aClass39_3.method6037()) {
					Static120.method2321("Current toolkit doesn't support multiple cores");
					return;
				}
				local107 = Integer.parseInt(arg2.substring(3));
				if (local107 < 1) {
					local107 = 1;
				} else if (local107 > 4) {
					local107 = 4;
				}
				Static178.anInt3308 = local107;
				Static103.aClass39_3.method6074(Static178.anInt3308);
				Static103.aClass39_3.method6047(0);
				Static120.method2321("Render cores now: " + Static178.anInt3308);
				return;
			}
			if (arg2.startsWith("cachespace")) {
				Static120.method2321("I(s): " + Static531.aClass231_69.method6239() + "/" + Static531.aClass231_69.method6234());
				Static120.method2321("I(m): " + Static2.aClass231_1.method6239() + "/" + Static2.aClass231_1.method6234());
				Static120.method2321("O(s): " + Static464.aClass115_1.aClass102_1.method2748() + "/" + Static464.aClass115_1.aClass102_1.method2736());
				return;
			}
			if (arg2.equalsIgnoreCase("getcamerapos")) {
				Static120.method2321("Pos: " + Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 + "," + (Static238.anInt4280 + (Static187.anInt3432 >> 7) >> 6) + "," + (Static371.anInt6936 + (Static353.anInt5258 >> 7) >> 6) + "," + ((Static187.anInt3432 >> 7) + Static238.anInt4280 & 0x3F) + "," + ((Static353.anInt5258 >> 7) + Static371.anInt6936 & 0x3F) + " Height: " + (Static200.method3233(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, Static187.anInt3432, Static353.anInt5258) - Static329.anInt3848));
				Static120.method2321("Look: " + Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 + "," + (Static274.anInt4992 + Static238.anInt4280 >> 6) + "," + (Static371.anInt6936 + Static68.anInt1456 >> 6) + "," + (Static274.anInt4992 + Static238.anInt4280 & 0x3F) + "," + (Static68.anInt1456 + Static371.anInt6936 & 0x3F) + " Height: " + (Static200.method3233(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, Static274.anInt4992, Static68.anInt1456) - Static269.anInt4939));
				return;
			}
			if (arg2.equals("showocc")) {
				Static136.aBoolean216 = !Static136.aBoolean216;
				Static410.method6418();
				Static120.method2321("showocc=" + Static136.aBoolean216);
				return;
			}
			if (arg2.equals("wallocc")) {
				Static532.aBoolean666 = !Static532.aBoolean666;
				Static410.method6418();
				Static120.method2321("forcewallocc=" + Static532.aBoolean666);
				return;
			}
			if (arg2.equals("renderprofile") || arg2.equals("rp")) {
				Static325.aBoolean410 = !Static325.aBoolean410;
				Static103.aClass39_3.method6010(Static325.aBoolean410);
				Static516.method7510();
				Static120.method2321("showprofiling=" + Static325.aBoolean410);
				return;
			}
			if (arg2.startsWith("performancetest")) {
				local107 = -1;
				local638 = 1000;
				if (arg2.length() > 15) {
					@Pc(1350) String[] local1350 = Static225.method3542(' ', arg2);
					try {
						if (local1350.length > 1) {
							local638 = Integer.parseInt(local1350[1]);
						}
					} catch (@Pc(1361) Throwable local1361) {
					}
					try {
						if (local1350.length > 2) {
							local107 = Integer.parseInt(local1350[2]);
						}
					} catch (@Pc(1372) Throwable local1372) {
					}
				}
				if (local107 != -1) {
					Static120.method2321("Performance: " + Static507.method2596(local638, Static266.anInt4923));
					return;
				}
				Static120.method2321("Java toolkit: " + Static507.method2596(local638, 0));
				Static120.method2321("SSE toolkit:  " + Static507.method2596(local638, 2));
				Static120.method2321("D3D toolkit:  " + Static507.method2596(local638, 3));
				Static120.method2321("GL toolkit:   " + Static507.method2596(local638, 1));
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(1446) Class254 local1446 = Static103.aClass39_3.method6009();
				Static120.method2321("Vendor: " + local1446.anInt7849);
				Static120.method2321("Name: " + local1446.aString157);
				Static120.method2321("Version: " + local1446.anInt7845);
				Static120.method2321("Device: " + local1446.aString158);
				Static120.method2321("Driver Version: " + local1446.aLong186);
				return;
			}
			if (arg2.equals("nonpcs")) {
				Static96.aBoolean134 = !Static96.aBoolean134;
				Static120.method2321("nonpcs=" + Static96.aBoolean134);
				return;
			}
			if (arg2.equals("autoworld")) {
				Static131.method2412();
				Static120.method2321("auto world selected");
				return;
			}
			if (arg2.startsWith("switchworld")) {
				local107 = Integer.parseInt(arg2.substring(12));
				Static528.method7626(local107, Static71.method1449(local107).aString116);
				Static120.method2321("switched");
				return;
			}
			if (arg2.equals("getworld")) {
				Static120.method2321("w: " + Static471.aClass163_5.anInt4593);
				return;
			}
			if (arg2.startsWith("pc")) {
				Static93.method1721(Static99.aClass243_25);
				Static381.aClass2_Sub29_Sub2_2.method5172(0);
				local107 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
				local638 = arg2.indexOf(" ", 4);
				Static381.aClass2_Sub29_Sub2_2.method5189(arg2.substring(3, local638));
				Static340.method5357(Static381.aClass2_Sub29_Sub2_2, arg2.substring(local638));
				Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local107);
				return;
			}
			if (arg2.equals("heap")) {
				Static120.method2321("Heap: " + Static78.anInt1651 + "MB");
				return;
			}
			if (arg2.equals("savevarcs")) {
				Static538.method7748();
				Static120.method2321("perm varcs saved");
				return;
			}
			if (arg2.equals("scramblevarcs")) {
				for (local107 = 0; local107 < Static399.anIntArray113.length; local107++) {
					if (Static432.aBooleanArray35[local107]) {
						Static399.anIntArray113[local107] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static399.anIntArray113[local107] *= -1;
						}
					}
				}
				Static538.method7748();
				Static120.method2321("perm varcs scrambled");
				return;
			}
			if (arg2.equals("showcolmap")) {
				Static370.aBoolean521 = true;
				Static469.method7062();
				Static120.method2321("colmap is shown");
				return;
			}
			if (arg2.equals("hidecolmap")) {
				Static370.aBoolean521 = false;
				Static469.method7062();
				Static120.method2321("colmap is hidden");
				return;
			}
			if (arg2.equals("resetcache")) {
				Static209.method3332();
				Static120.method2321("Caches reset");
				return;
			}
			if (arg2.equals("profilecpu")) {
				Static120.method2321(Static222.method1471() + "ms");
				return;
			}
			if (arg2.startsWith("cpuusage")) {
				local107 = Integer.parseInt(arg2.substring(9));
				if (local107 >= 0 && local107 <= 4) {
					Static281.aClass2_Sub19_Sub1_1.anInt2183 = local107;
				}
				Static120.method2321("cpuusage=" + Static281.aClass2_Sub19_Sub1_1.anInt2183);
				return;
			}
			if (arg2.startsWith("getclientvarpbit")) {
				local107 = Integer.parseInt(arg2.substring(17));
				Static120.method2321("varpbit=" + Static84.aClass302_1.method7514(local107));
				return;
			}
			if (arg2.startsWith("getclientvarp")) {
				local107 = Integer.parseInt(arg2.substring(14));
				Static120.method2321("varp=" + Static84.aClass302_1.method7513(local107));
				return;
			}
			if (arg2.startsWith("demologin")) {
				Static67.method1238(false, 0);
				return;
			}
			if (arg2.startsWith("newdemologin")) {
				Static67.method1238(true, 0);
				return;
			}
			if (arg2.startsWith("directlogin")) {
				@Pc(1825) String[] local1825 = Static225.method3542(' ', arg2.substring(12));
				if (local1825.length >= 2) {
					local638 = local1825.length <= 2 ? 0 : Integer.parseInt(local1825[2]);
					Static299.method4719(local1825[1], local638, local1825[0]);
					return;
				}
			}
			if (arg2.startsWith("csprofileclear")) {
				Static258.method4031();
				return;
			}
			if (arg2.startsWith("csprofileoutputc")) {
				Static258.method4033();
				return;
			}
			if (arg2.startsWith("csprofileoutputt")) {
				Static258.method4033();
				return;
			}
			if (arg2.startsWith("texsize")) {
				local107 = Integer.parseInt(arg2.substring(8));
				Static103.aClass39_3.method6012(local107);
				return;
			}
			if (arg2.equals("soundstreamcount")) {
				Static120.method2321("Active streams: " + Static288.aClass2_Sub12_Sub2_5.method2090());
				return;
			}
			if (arg2.equals("autosetup")) {
				Static281.aClass2_Sub19_Sub1_1.method2149();
				Static120.method2321("Complete. Toolkit now: " + Static266.anInt4923);
				return;
			}
			if (arg2.equals("errormessage")) {
				Static120.method2321(Static456.aClient1.method1235());
				return;
			}
			if (Static271.anInt8654 == 9) {
				Static93.method1721(Static136.aClass243_34);
				Static381.aClass2_Sub29_Sub2_2.method5172(arg2.length() + 3);
				Static381.aClass2_Sub29_Sub2_2.method5172(arg1 ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5172(arg0 ? 1 : 0);
				Static381.aClass2_Sub29_Sub2_2.method5189(arg2);
			}
			if (arg2.startsWith("fps ") && Static455.aClass320_15 != Static414.aClass320_17) {
				Static16.method469(Static359.method5799(arg2.substring(4)));
				return;
			}
			if (Static271.anInt8654 != 9) {
				Static120.method2321("Unrecogonised commmand when not logged in: " + arg2);
				return;
			}
		} catch (@Pc(1994) Exception local1994) {
			Static120.method2321("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!haa;IIIII)V")
	public static void method5412(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6354 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub5Array4[local4] != null) {
				arg0.anInt6354++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6354; local22++) {
			@Pc(31) long local31 = Static139.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class83 local41;
			while (local31 != 0L) {
				local41 = Static410.aClass83Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub5_1 == arg0.aClass2_Sub5Array4[local22]) {
					continue label51;
				}
			}
			local31 = Static139.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static410.aClass83Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub5_1 == arg0.aClass2_Sub5Array4[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt6354 - 1; local93++) {
				arg0.aClass2_Sub5Array4[local93] = arg0.aClass2_Sub5Array4[local93 + 1];
			}
			arg0.anInt6354--;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIB)I")
	public static int method5413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}
}
