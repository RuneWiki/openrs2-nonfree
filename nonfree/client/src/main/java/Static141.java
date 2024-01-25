import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	public static int anInt2827;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public static int anInt2822 = 0;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "[I")
	public static final int[] anIntArray244 = new int[1000];

	@OriginalMember(owner = "client!fs", name = "C", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method2638(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static334.aClass139_4 == Static190.aClass139_1 && Static378.anInt6739 < 2) {
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
				Static520.aBoolean687 = true;
				Static465.method7070("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static520.aBoolean687 = false;
				Static465.method7070("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static465.method7070("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(75) Throwable local75) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static151.anInt5204 = 0;
				Static30.anInt788 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static16.aClass184_50.method5136();
				Static465.method7070("Text coords cleared");
				return;
			}
			@Pc(108) int local108;
			@Pc(129) int local129;
			@Pc(119) Runtime local119;
			if (arg1.equalsIgnoreCase("gc")) {
				Static341.method5720();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static465.method7070("mem=" + local129 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static341.method5720();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static465.method7070("Memory before cleanup=" + local129 + "k");
				Static210.method3879();
				Static341.method5720();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local129 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static465.method7070("Memory after cleanup=" + local129 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static465.method7070(Static113.method2232() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static465.method7070("Number of player models in cache:" + Static449.method6960());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static465.method7070("Dropped client connection");
				if (Static186.anInt3863 == 9) {
					Static365.method5914();
					return;
				}
				if (Static186.anInt3863 == 10) {
					Static107.aBoolean189 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static302.aClass117_5.method2920();
				Static465.method7070("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static302.aClass117_5.method2919();
				Static465.method7070("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static473.aClass229_14.method6069();
				Static200.aClass134_2.method8120();
				Static302.aClass117_5.method2928();
				Static465.method7070("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static473.method7370();
				Static293.method7812();
				Static465.method7070("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static487.method7514(1, -1, -1, false);
				if (Static226.method4065() != 1) {
					Static465.method7070("wm1 failed");
					return;
				}
				Static465.method7070("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static487.method7514(2, -1, -1, false);
				if (Static226.method4065() == 2) {
					Static465.method7070("wm2 succeeded");
					return;
				}
				Static465.method7070("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static487.method7514(3, 768, 1024, false);
				if (Static226.method4065() != 3) {
					Static465.method7070("wm3 failed");
					return;
				}
				Static465.method7070("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static124.method2356(0);
				if (Static449.anInt7876 == 0) {
					Static465.method7070("Entered tk0");
					Static286.aClass1_Sub15_Sub1_1.anInt7039 = 0;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				Static465.method7070("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static124.method2356(1);
				if (Static449.anInt7876 != 1) {
					Static465.method7070("Failed to enter tk1");
					return;
				}
				Static465.method7070("Entered tk1");
				Static286.aClass1_Sub15_Sub1_1.anInt7039 = 1;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static124.method2356(2);
				if (Static449.anInt7876 == 2) {
					Static465.method7070("Entered tk2");
					Static286.aClass1_Sub15_Sub1_1.anInt7039 = 2;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				Static465.method7070("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static124.method2356(3);
				if (Static449.anInt7876 != 3) {
					Static465.method7070("Failed to enter tk3");
					return;
				}
				Static465.method7070("Entered tk3");
				Static286.aClass1_Sub15_Sub1_1.anInt7039 = 3;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static124.method2356(4);
				if (Static449.anInt7876 != 4) {
					Static465.method7070("Failed to enter tk4");
					return;
				}
				Static465.method7070("Entered tk4");
				Static286.aClass1_Sub15_Sub1_1.anInt7039 = 4;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static124.method2356(5);
				if (Static449.anInt7876 == 5) {
					Static465.method7070("Entered tk5");
					Static286.aClass1_Sub15_Sub1_1.anInt7039 = 5;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				Static465.method7070("Failed to enter tk5");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static286.aClass1_Sub15_Sub1_1.aBoolean525 = !Static286.aClass1_Sub15_Sub1_1.aBoolean525;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				Static473.method7370();
				Static465.method7070("ot=" + Static286.aClass1_Sub15_Sub1_1.aBoolean525);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static286.aClass1_Sub15_Sub1_1.aBoolean534 = !Static286.aClass1_Sub15_Sub1_1.aBoolean534;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				Static473.method7370();
				Static465.method7070("gb=" + Static286.aClass1_Sub15_Sub1_1.aBoolean534);
				return;
			}
			@Pc(643) int local643;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static465.method7070("Invalid shadows value");
					return;
				}
				@Pc(631) String local631 = arg1.substring(8);
				local643 = Static453.method6978(local631) ? Static302.method8211(local631) : -1;
				if (local643 >= 0 && local643 <= 2) {
					Static286.aClass1_Sub15_Sub1_1.method6360(local643, Static449.anInt7876);
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					Static473.method7370();
					Static465.method7070("shadows=" + local643);
					return;
				}
				Static465.method7070("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static286.aClass1_Sub15_Sub1_1.aBoolean527 = !Static286.aClass1_Sub15_Sub1_1.aBoolean527;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				Static449.method6959();
				Static473.method7370();
				Static465.method7070("textures=" + Static286.aClass1_Sub15_Sub1_1.aBoolean527);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static286.aClass1_Sub15_Sub1_1.method6363(Static449.anInt7876, !Static286.aClass1_Sub15_Sub1_1.method6361(Static449.anInt7876));
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				Static22.method601();
				Static449.method6959();
				Static473.method7370();
				Static465.method7070("lighting=" + Static286.aClass1_Sub15_Sub1_1.method6361(Static449.anInt7876));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static465.method7070("Invalid buildarea value");
					return;
				}
				local108 = Static302.method8211(arg1.substring(6));
				if (local108 >= 0 && Static427.method6649(Static520.anInt9181) >= local108) {
					Static286.aClass1_Sub15_Sub1_1.anInt7036 = local108;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					Static465.method7070("maxbuildarea=" + Static286.aClass1_Sub15_Sub1_1.anInt7036);
					return;
				}
				Static465.method7070("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static465.method7070("Invalid particles value");
					return;
				}
				Static511.method7828(Static302.method8211(arg1.substring(13)));
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static473.aBoolean625 = false;
				Static465.method7070("particles=" + Static421.method6581());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static465.method7070("Invalid rect_debug value");
					return;
				}
				Static44.anInt9301 = Static302.method8211(arg1.substring(10).trim());
				Static465.method7070("rect_debug=" + Static44.anInt9301);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static428.aBoolean561 = true;
				Static465.method7070("qa_op_test=" + Static428.aBoolean561);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static212.aBoolean334 = !Static212.aBoolean334;
				Static465.method7070("clipcomponents=" + Static212.aBoolean334);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(918) boolean local918 = Static455.aClass4_11.method7182();
				if (!Static164.method2944(!local918)) {
					Static465.method7070("Failed to enable bloom");
					return;
				}
				if (local918) {
					Static465.method7070("Bloom disabled");
					return;
				}
				Static465.method7070("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static294.aBoolean419) {
					Static294.aBoolean419 = false;
					Static465.method7070("Forced tweening disabled.");
					return;
				}
				Static294.aBoolean419 = true;
				Static465.method7070("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static451.aBoolean585) {
					Static465.method7070("Shift-click disabled.");
					Static451.aBoolean585 = false;
					return;
				}
				Static465.method7070("Shift-click ENABLED!");
				Static451.aBoolean585 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static465.method7070("x:" + (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7) + " z:" + (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static465.method7070("Height: " + Static296.aClass7Array11[Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108].ba(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7, Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static46.aClass69_14.method1905();
				Static46.aClass69_14.method1879();
				Static152.aClass160_1.method4295();
				Static193.aClass32_2.method1125();
				Static293.method7812();
				Static465.method7070("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static455.aClass4_11.method7152()) {
					local108 = Integer.parseInt(arg1.substring(3));
					if (local108 < 1) {
						local108 = 1;
					} else if (local108 > 4) {
						local108 = 4;
					}
					Static154.anInt3012 = local108;
					Static455.aClass4_11.method7185(Static154.anInt3012);
					Static455.aClass4_11.method7196(0);
					Static465.method7070("Render cores now: " + Static154.anInt3012);
					return;
				}
				Static465.method7070("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static465.method7070("I(s): " + Static344.aClass277_49.method7023() + "/" + Static344.aClass277_49.method7024());
				Static465.method7070("I(m): " + Static303.aClass277_43.method7023() + "/" + Static303.aClass277_43.method7024());
				Static465.method7070("O(s): " + Static181.aClass316_1.aClass78_1.method2018() + "/" + Static181.aClass316_1.aClass78_1.method2014());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static465.method7070("Pos: " + Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 + "," + ((Static321.anInt6064 >> 7) + Static538.anInt9485 >> 6) + "," + (Static282.anInt5380 + (Static46.anInt1256 >> 7) >> 6) + "," + (Static538.anInt9485 + (Static321.anInt6064 >> 7) & 0x3F) + "," + ((Static46.anInt1256 >> 7) + Static282.anInt5380 & 0x3F) + " Height: " + (Static508.method7754(Static46.anInt1256, Static321.anInt6064, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) - Static276.anInt8653));
				Static465.method7070("Look: " + Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 + "," + (Static526.anInt9307 + Static538.anInt9485 >> 6) + "," + (Static28.anInt771 + Static282.anInt5380 >> 6) + "," + (Static526.anInt9307 + Static538.anInt9485 & 0x3F) + "," + (Static282.anInt5380 + Static28.anInt771 & 0x3F) + " Height: " + (Static508.method7754(Static28.anInt771, Static526.anInt9307, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) - Static113.anInt2324));
				return;
			}
			if (arg1.equals("showocc")) {
				Static453.aBoolean587 = !Static453.aBoolean587;
				Static473.method7370();
				Static465.method7070("showocc=" + Static453.aBoolean587);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static220.aBoolean337 = !Static220.aBoolean337;
				Static473.method7370();
				Static465.method7070("forcewallocc=" + Static220.aBoolean337);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static148.aBoolean251 = !Static148.aBoolean251;
				Static455.aClass4_11.method7216(Static148.aBoolean251);
				Static329.method5605();
				Static465.method7070("showprofiling=" + Static148.aBoolean251);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local108 = -1;
				local643 = 1000;
				if (arg1.length() > 15) {
					@Pc(1368) String[] local1368 = Static340.method5715(arg1, ' ');
					try {
						if (local1368.length > 1) {
							local643 = Integer.parseInt(local1368[1]);
						}
					} catch (@Pc(1381) Throwable local1381) {
					}
					try {
						if (local1368.length > 2) {
							local108 = Integer.parseInt(local1368[2]);
						}
					} catch (@Pc(1394) Throwable local1394) {
					}
				}
				if (local108 == -1) {
					Static465.method7070("Java toolkit: " + Static267.method4741(0, local643));
					Static465.method7070("SSE toolkit:  " + Static267.method4741(2, local643));
					Static465.method7070("D3D toolkit:  " + Static267.method4741(3, local643));
					Static465.method7070("GL toolkit:   " + Static267.method4741(1, local643));
					return;
				}
				Static465.method7070("Performance: " + Static267.method4741(Static449.anInt7876, local643));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1471) Class98 local1471 = Static455.aClass4_11.method7207();
				Static465.method7070("Vendor: " + local1471.anInt2591);
				Static465.method7070("Name: " + local1471.aString56);
				Static465.method7070("Version: " + local1471.anInt2586);
				Static465.method7070("Device: " + local1471.aString57);
				Static465.method7070("Driver Version: " + local1471.aLong70);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static526.aBoolean698 = !Static526.aBoolean698;
				Static465.method7070("nonpcs=" + Static526.aBoolean698);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static75.method1732();
				Static465.method7070("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local108 = Integer.parseInt(arg1.substring(12));
				Static360.method5866(Static430.method8163(local108).aString132, local108);
				Static465.method7070("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static465.method7070("w: " + Class216.lb.anInt6291);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static216.method3997(Static77.aClass252_36);
				Static259.aClass1_Sub17_Sub2_1.method4451(0);
				local108 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
				local643 = arg1.indexOf(" ", 4);
				Static259.aClass1_Sub17_Sub2_1.method4464(arg1.substring(3, local643));
				Static469.method7145(arg1.substring(local643), Static259.aClass1_Sub17_Sub2_1);
				Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local108);
				return;
			}
			if (arg1.equals("heap")) {
				Static465.method7070("Heap: " + Static520.anInt9181 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				method2640();
				Static465.method7070("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local108 = 0; local108 < Static540.anIntArray837.length; local108++) {
					if (Static137.aBooleanArray4[local108]) {
						Static540.anIntArray837[local108] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static540.anIntArray837[local108] *= -1;
						}
					}
				}
				method2640();
				Static465.method7070("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static532.aBoolean702 = true;
				Static293.method7812();
				Static465.method7070("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static532.aBoolean702 = false;
				Static293.method7812();
				Static465.method7070("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static519.method1985();
				Static465.method7070("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static465.method7070(Static353.method5815() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local108 = Integer.parseInt(arg1.substring(9));
				if (local108 >= 0 && local108 <= 4) {
					Static286.aClass1_Sub15_Sub1_1.anInt7051 = local108;
				}
				Static465.method7070("cpuusage=" + Static286.aClass1_Sub15_Sub1_1.anInt7051);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local108 = Integer.parseInt(arg1.substring(17));
				Static465.method7070("varpbit=" + Static417.aClass10_1.method523(local108));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local108 = Integer.parseInt(arg1.substring(14));
				Static465.method7070("varp=" + Static417.aClass10_1.method522(local108));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static408.method6498(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static408.method6498(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1854) String[] local1854 = Static340.method5715(arg1.substring(12), ' ');
				if (local1854.length >= 2) {
					local643 = local1854.length <= 2 ? 0 : Integer.parseInt(local1854[2]);
					Static325.method5580(local643, local1854[0], local1854[1]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static173.method3219();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static173.method3212();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static173.method3212();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local108 = Integer.parseInt(arg1.substring(8));
				Static455.aClass4_11.method7201(local108);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static465.method7070("Active streams: " + Static475.aClass1_Sub4_Sub2_2.method3186());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static286.aClass1_Sub15_Sub1_1.method6364();
				Static465.method7070("Complete. Toolkit now: " + Static449.anInt7876);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static465.method7070(Static125.aClient1.method1551());
				return;
			}
			if (Static186.anInt3863 == 9) {
				Static216.method3997(Static387.aClass252_98);
				Static259.aClass1_Sub17_Sub2_1.method4451(arg1.length() + 3);
				Static259.aClass1_Sub17_Sub2_1.method4451(arg2 ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4451(arg0 ? 1 : 0);
				Static259.aClass1_Sub17_Sub2_1.method4464(arg1);
			}
			if (arg1.startsWith("fps ") && Static190.aClass139_1 != Static334.aClass139_4) {
				Static17.method533(Static302.method8211(arg1.substring(4)));
				return;
			}
			if (Static186.anInt3863 != 9) {
				Static465.method7070("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(2035) Exception local2035) {
			Static465.method7070("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2639(@OriginalArg(0) String arg0) {
		if (Static161.aClass181Array1 != null) {
			Static216.method3997(Static109.aClass252_42);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg0));
			Static259.aClass1_Sub17_Sub2_1.method4464(arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public static void method2640() {
		@Pc(7) Class208 local7 = null;
		try {
			@Pc(13) Class311 local13 = Static473.aClass229_14.method6071("2", true);
			while (local13.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (local13.anInt9169 == 1) {
				local7 = (Class208) local13.anObject17;
				@Pc(40) Class1_Sub17 local40 = new Class1_Sub17(Static94.anInt2056 * 6 + 3);
				local40.method4451(1);
				local40.method4473(Static94.anInt2056);
				for (@Pc(52) int local52 = 0; local52 < Static540.anIntArray837.length; local52++) {
					if (Static137.aBooleanArray4[local52]) {
						local40.method4473(local52);
						local40.method4489(Static540.anIntArray837[local52]);
					}
				}
				local7.method5701(0, local40.aByteArray58, local40.anInt4872);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method5704();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static257.aLong129 = Static110.method2222();
		Static502.aBoolean668 = false;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BC)Z")
	public static boolean method2642(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
