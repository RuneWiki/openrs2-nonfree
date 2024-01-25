import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!lla", name = "k", descriptor = "Z")
	public static boolean aBoolean144;

	@OriginalMember(owner = "client!lla", name = "J", descriptor = "I")
	private static int anInt1996;

	@OriginalMember(owner = "client!lla", name = "V", descriptor = "I")
	private static int anInt1997;

	@OriginalMember(owner = "client!lla", name = "K", descriptor = "Z")
	private static boolean aBoolean145;

	@OriginalMember(owner = "client!lla", name = "L", descriptor = "I")
	private static int anInt1998;

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "I")
	private static int anInt1999;

	@OriginalMember(owner = "client!lla", name = "ab", descriptor = "I")
	private static int anInt2000;

	@OriginalMember(owner = "client!lla", name = "e", descriptor = "I")
	private static int anInt2001;

	@OriginalMember(owner = "client!lla", name = "v", descriptor = "Z")
	private static boolean aBoolean146;

	@OriginalMember(owner = "client!lla", name = "g", descriptor = "I")
	private static int anInt2002;

	@OriginalMember(owner = "client!lla", name = "H", descriptor = "Z")
	private static boolean aBoolean147;

	@OriginalMember(owner = "client!lla", name = "D", descriptor = "Z")
	private static boolean aBoolean148;

	@OriginalMember(owner = "client!lla", name = "t", descriptor = "I")
	private static int anInt2003;

	@OriginalMember(owner = "client!lla", name = "S", descriptor = "I")
	private static int anInt2004;

	@OriginalMember(owner = "client!lla", name = "n", descriptor = "Z")
	private static boolean aBoolean149;

	@OriginalMember(owner = "client!lla", name = "P", descriptor = "I")
	private static int anInt2005;

	@OriginalMember(owner = "client!lla", name = "T", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!lla", name = "s", descriptor = "I")
	private static int anInt2006;

	@OriginalMember(owner = "client!lla", name = "E", descriptor = "I")
	private static int anInt2007;

	@OriginalMember(owner = "client!lla", name = "y", descriptor = "F")
	public static float aFloat40 = 0.0F;

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ZLjava/lang/String;ZI)V")
	public static void method1852(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static369.method5071("commands - This command");
				Static369.method5071("cls - Clear console");
				Static369.method5071("displayfps - Toggle FPS and other information");
				Static369.method5071("renderer - Print graphics renderer information");
				Static369.method5071("heap - Print java memory information");
				Static369.method5071("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static630.anInt9714 = 0;
				Static181.anInt3158 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static714.aBoolean755 = !Static714.aBoolean755;
				if (Static714.aBoolean755) {
					Static369.method5071("FPS on");
					return;
				}
				Static369.method5071("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(100) Class19 local100 = Static153.aClass22_4.method9364();
				Static369.method5071("Vendor: " + local100.anInt738);
				Static369.method5071("Name: " + local100.aString6);
				Static369.method5071("Version: " + local100.anInt741);
				Static369.method5071("Device: " + local100.aString7);
				Static369.method5071("Driver Version: " + local100.aLong21);
				return;
			}
			if (arg1.equals("heap")) {
				Static369.method5071("Heap: " + Static7.anInt229 + "MB");
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static369.method5071("Pos: " + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 + "," + (Static291.anInt4448 + (Static305.anInt4908 >> 9) >> 6) + "," + ((Static263.anInt4101 >> 9) + Static189.anInt3243 >> 6) + "," + ((Static305.anInt4908 >> 9) + Static291.anInt4448 & 0x3F) + "," + ((Static263.anInt4101 >> 9) + Static189.anInt3243 & 0x3F) + " Height: " + (Static77.method1633(Static263.anInt4101, Static305.anInt4908, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) - Static490.anInt7687));
				Static369.method5071("Look: " + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 + "," + (Static453.anInt6956 + Static291.anInt4448 >> 6) + "," + (Static183.anInt3174 + Static189.anInt3243 >> 6) + "," + (Static291.anInt4448 + Static453.anInt6956 & 0x3F) + "," + (Static183.anInt3174 + Static189.anInt3243 & 0x3F) + " Height: " + (Static77.method1633(Static183.anInt3174, Static453.anInt6956, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) - Static512.anInt10668));
				return;
			}
		} catch (@Pc(321) Exception local321) {
			Static369.method5071(Static430.aClass257_2.method5699(Static456.anInt7118));
			return;
		}
		if (Static286.aClass379_8 != Static416.aClass379_6 || Static432.anInt6579 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static369.method5071("FPS: " + Static605.anInt9179);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static42.aBoolean87 = !Static42.aBoolean87;
					if (Static42.aBoolean87) {
						Static369.method5071("Occlsion now on!");
						return;
					}
					Static369.method5071("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static714.aBoolean755 = true;
					Static369.method5071("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static714.aBoolean755 = false;
					Static369.method5071("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static369.method5071("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static12.aClass3_Sub39_12.anInt5861 + "Mb");
						return;
					} catch (@Pc(474) Throwable local474) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static291.aClass319_4.method7192();
					Static369.method5071("Text coords cleared");
					return;
				}
				@Pc(524) int local524;
				@Pc(501) int local501;
				@Pc(514) Runtime local514;
				if (arg1.equalsIgnoreCase("gc")) {
					Static135.method9078();
					for (local501 = 0; local501 < 10; local501++) {
						System.gc();
					}
					local514 = Runtime.getRuntime();
					local524 = (int) ((local514.totalMemory() - local514.freeMemory()) / 1024L);
					Static369.method5071("mem=" + local524 + "k");
					return;
				}
				@Pc(590) int local590;
				if (arg1.equalsIgnoreCase("compact")) {
					Static135.method9078();
					for (local501 = 0; local501 < 10; local501++) {
						System.gc();
					}
					local514 = Runtime.getRuntime();
					local524 = (int) ((local514.totalMemory() - local514.freeMemory()) / 1024L);
					Static369.method5071("Memory before cleanup=" + local524 + "k");
					Static393.method5323();
					Static135.method9078();
					for (local590 = 0; local590 < 10; local590++) {
						System.gc();
					}
					local524 = (int) ((local514.totalMemory() - local514.freeMemory()) / 1024L);
					Static369.method5071("Memory after cleanup=" + local524 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static369.method5071(Static338.method4840() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static369.method5071("Dropped client connection");
					if (Static98.anInt2140 == 11) {
						Static526.method7028();
						return;
					}
					if (Static98.anInt2140 == 12) {
						Static95.aClass292_2.aBoolean535 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static226.aClass43_3.method1304();
					Static369.method5071("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static294.aClass349_3.method7771();
					Static369.method5071("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static294.aClass349_3.method7763();
					Static369.method5071("Dropped server js5 net queue");
					return;
				}
				@Pc(745) int local745;
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static122.aClass47_1.method1389();
					@Pc(743) Class292[] local743 = Static95.aClass292Array1;
					for (local745 = 0; local745 < local743.length; local745++) {
						@Pc(751) Class292 local751 = local743[local745];
						if (local751.aClass118_2 != null) {
							local751.aClass118_2.method7797();
						}
					}
					Static294.aClass349_3.method7778();
					Static369.method5071("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static19.method616();
					Static527.method7039();
					Static369.method5071("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static726.aLong344 = Static517.method6965();
					Static296.aBoolean291 = true;
					Static19.method616();
					Static527.method7039();
					Static369.method5071("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static112.method2180(1, false, -1, -1);
					if (Static276.method3880(3) != 1) {
						Static369.method5071("wm1 failed");
						return;
					}
					Static369.method5071("wm1 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static112.method2180(2, false, -1, -1);
					if (Static276.method3880(3) == 2) {
						Static369.method5071("wm2 succeeded");
						return;
					}
					Static369.method5071("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static112.method2180(3, false, 1024, 768);
					if (Static276.method3880(3) == 3) {
						Static369.method5071("wm3 succeeded");
						return;
					}
					Static369.method5071("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static36.method1127(false, 0);
					if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 0) {
						Static369.method5071("Failed to enter tk0");
						return;
					}
					Static369.method5071("Entered tk0");
					Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
					Static124.method2284();
					Static569.aBoolean580 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static36.method1127(false, 1);
					if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 1) {
						Static369.method5071("Failed to enter tk1");
						return;
					}
					Static369.method5071("Entered tk1");
					Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
					Static124.method2284();
					Static569.aBoolean580 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static36.method1127(false, 2);
					if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 2) {
						Static369.method5071("Entered tk2");
						Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					Static369.method5071("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static36.method1127(false, 3);
					if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 3) {
						Static369.method5071("Entered tk3");
						Static580.aClass3_Sub22_24.method2423(3, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					Static369.method5071("Failed to enter tk3");
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static36.method1127(false, 5);
					if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 5) {
						Static369.method5071("Failed to enter tk5");
						return;
					}
					Static369.method5071("Entered tk5");
					Static580.aClass3_Sub22_24.method2423(5, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
					Static124.method2284();
					Static569.aBoolean580 = false;
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static369.method5071("Invalid buildarea value");
						return;
					}
					local501 = Static636.method8390(arg1.substring(6));
					if (local501 >= 0 && local501 <= Static241.method3444(Static7.anInt229)) {
						Static580.aClass3_Sub22_24.method2423(local501, Static580.aClass3_Sub22_24.aClass21_Sub23_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						Static369.method5071("maxbuildarea=" + Static580.aClass3_Sub22_24.aClass21_Sub23_1.method7366());
						return;
					}
					Static369.method5071("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static369.method5071("Invalid rect_debug value");
						return;
					}
					Static262.anInt4080 = Static636.method8390(arg1.substring(10).trim());
					Static369.method5071("rect_debug=" + Static262.anInt4080);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static571.aBoolean583 = true;
					Static369.method5071("qa_op_test=" + Static571.aBoolean583);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static517.aBoolean546 = !Static517.aBoolean546;
					Static369.method5071("clipcomponents=" + Static517.aBoolean546);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1293) boolean local1293 = Static153.aClass22_4.method9332();
					if (!Static451.method5965(!local1293)) {
						Static369.method5071("Failed to enable bloom");
						return;
					}
					if (local1293) {
						Static369.method5071("Bloom disabled");
						return;
					}
					Static369.method5071("Bloom enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static703.aBoolean742) {
						Static703.aBoolean742 = false;
						Static369.method5071("Forced tweening disabled.");
						return;
					}
					Static703.aBoolean742 = true;
					Static369.method5071("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (!Static182.aBoolean199) {
						Static369.method5071("Shift-click ENABLED!");
						Static182.aBoolean199 = true;
						return;
					}
					Static369.method5071("Shift-click disabled.");
					Static182.aBoolean199 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static369.method5071("x:" + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9) + " z:" + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static369.method5071("Height: " + Static477.aClass259Array3[Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139].method9295(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static218.aClass182_59.method3969();
					Static218.aClass182_59.method3982();
					Static139.aClass68_3.method1958();
					Static47.aClass111_3.method2740();
					Static527.method7039();
					Static369.method5071("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static153.aClass22_4.method9386()) {
						local501 = Integer.parseInt(arg1.substring(3));
						if (local501 < 1) {
							local501 = 1;
						} else if (local501 > 4) {
							local501 = 4;
						}
						Static219.anInt3590 = local501;
						Static19.method616();
						Static369.method5071("Render cores now: " + Static219.anInt3590);
						return;
					}
					Static369.method5071("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static369.method5071("I(s): " + Static604.aClass307_85.method7010() + "/" + Static604.aClass307_85.method7005());
					Static369.method5071("I(m): " + Static435.aClass307_67.method7010() + "/" + Static435.aClass307_67.method7005());
					Static369.method5071("O(s): " + Static606.aClass62_2.aClass285_1.method6605() + "/" + Static606.aClass62_2.aClass285_1.method6611());
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static559.aBoolean578 = !Static559.aBoolean578;
					Static153.aClass22_4.method9393(Static559.aBoolean578);
					Static449.method5960();
					Static369.method5071("showprofiling=" + Static559.aBoolean578);
					return;
				}
				@Pc(1648) String[] local1648;
				if (arg1.startsWith("performancetest")) {
					local501 = -1;
					local745 = 1000;
					if (arg1.length() > 15) {
						local1648 = Static104.method2099(arg1, ' ');
						try {
							if (local1648.length > 1) {
								local745 = Integer.parseInt(local1648[1]);
							}
						} catch (@Pc(1659) Throwable local1659) {
						}
						try {
							if (local1648.length > 2) {
								local501 = Integer.parseInt(local1648[2]);
							}
						} catch (@Pc(1670) Throwable local1670) {
						}
					}
					if (local501 != -1) {
						Static369.method5071("Performance: " + Static93.method1944(local745, local501));
						return;
					}
					Static369.method5071("Java toolkit: " + Static93.method1944(local745, 0));
					Static369.method5071("SSE toolkit:  " + Static93.method1944(local745, 2));
					Static369.method5071("D3D toolkit:  " + Static93.method1944(local745, 3));
					Static369.method5071("GL toolkit:   " + Static93.method1944(local745, 1));
					Static369.method5071("GLX toolkit:  " + Static93.method1944(local745, 5));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static426.aBoolean440 = !Static426.aBoolean440;
					Static369.method5071("nonpcs=" + Static426.aBoolean440);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static683.method9053();
					Static369.method5071("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local501 = Integer.parseInt(arg1.substring(12));
					Static615.method7906(local501, Static131.method2341(local501).aString79);
					Static369.method5071("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static369.method5071("w: " + Static226.aClass43_3.anInt1402);
					return;
				}
				if (arg1.startsWith("pc")) {
					@Pc(1857) Class292 local1857 = Static631.method8307();
					@Pc(1863) Class3_Sub29 local1863 = Static507.method6901(Static25.aClass144_6, local1857.aClass88_2);
					local1863.aClass3_Sub2_Sub1_1.method2065(0);
					local524 = local1863.aClass3_Sub2_Sub1_1.anInt2178;
					local590 = arg1.indexOf(" ", 4);
					local1863.aClass3_Sub2_Sub1_1.method2073(arg1.substring(3, local590));
					Static710.method4896(arg1.substring(local590), local1863.aClass3_Sub2_Sub1_1);
					local1863.aClass3_Sub2_Sub1_1.method2057(local1863.aClass3_Sub2_Sub1_1.anInt2178 - local524);
					local1857.method6855(local1863);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static563.method7341();
					Static369.method5071("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local501 = 0; local501 < Static227.anIntArray269.length; local501++) {
						if (Static317.aBooleanArray10[local501]) {
							Static227.anIntArray269[local501] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static227.anIntArray269[local501] *= -1;
							}
						}
					}
					Static563.method7341();
					Static369.method5071("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static709.aBoolean752 = true;
					Static527.method7039();
					Static369.method5071("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static709.aBoolean752 = false;
					Static527.method7039();
					Static369.method5071("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static473.method6434();
					Static369.method5071("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static369.method5071(Static270.method3826() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local501 = Integer.parseInt(arg1.substring(17));
					Static369.method5071("varpbit=" + Static380.aClass127_1.method6960(local501));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local501 = Integer.parseInt(arg1.substring(14));
					Static369.method5071("varp=" + Static380.aClass127_1.method6961(local501));
					return;
				}
				@Pc(2113) String[] local2113;
				if (arg1.startsWith("directlogin")) {
					local2113 = Static104.method2099(arg1.substring(12), ' ');
					if (local2113.length >= 2) {
						local745 = local2113.length > 2 ? Integer.parseInt(local2113[2]) : 0;
						Static441.method5857(local2113[1], local2113[0], local745);
						return;
					}
				}
				if (arg1.startsWith("snlogin ")) {
					local2113 = Static104.method2099(arg1.substring(8), ' ');
					local745 = Integer.parseInt(local2113[0]);
					local524 = local2113.length == 2 ? Integer.parseInt(local2113[1]) : 0;
					Static459.method6216(local745, local524);
					return;
				}
				if (arg1.startsWith("csprofileclear")) {
					Static540.method7158();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static540.method7149();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static540.method7149();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local501 = Integer.parseInt(arg1.substring(8));
					Static153.aClass22_4.method9338(local501);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static369.method5071("Active streams: " + Static391.aClass3_Sub33_Sub4_1.method8547());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static482.method6515();
					Static369.method5071("Complete. Toolkit now: " + Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static369.method5071(Static459.aClient1.method1842());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static60.aString26.startsWith("win")) {
						Static501.method6844(new File("C:\\Temp\\heap.dump"));
					} else {
						Static501.method6844(new File("/tmp/heap.dump"));
					}
					Static369.method5071("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static369.method5071("Name: " + Static60.aString26);
					Static369.method5071("Arch: " + Static60.aString25);
					Static369.method5071("Ver: " + Static60.aString24);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local501 = Integer.parseInt(arg1.substring(8, 9));
					Static644.anInt9956 = local501;
					Static19.method616();
					Static369.method5071("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local501 = arg1.indexOf(32);
					if (local501 < 0) {
						Static369.method5071("Syntax: ortho <n>");
						return;
					}
					local745 = Static636.method8390(arg1.substring(local501 + 1));
					Static580.aClass3_Sub22_24.method2423(local745, Static580.aClass3_Sub22_24.aClass21_Sub10_1);
					Static124.method2284();
					Static569.aBoolean580 = false;
					Static248.method3510();
					if (Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499() != local745) {
						Static369.method5071("Failed to change ortho mode");
						return;
					}
					Static369.method5071("Successfully changed ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499() == 0) {
						Static369.method5071("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local501 = Static636.method8390(arg1.substring(arg1.indexOf(32) + 1));
					Static668.anInt10259 = local501;
					Static369.method5071("orthozoom=" + Static668.anInt10259);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local501 = Static636.method8390(arg1.substring(arg1.indexOf(32) + 1));
					Static324.anInt5245 = local501;
					Static8.anInt234 = local501;
					Static369.method5071("ortho tile size=" + local501);
					Static248.method3510();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static120.aBoolean161 = !Static120.aBoolean161;
					Static369.method5071("ortho camera lock is " + (Static120.aBoolean161 ? "on" : "off"));
					return;
				}
				if (arg1.startsWith("skydetail ")) {
					local501 = Static636.method8390(arg1.substring(arg1.indexOf(32) + 1));
					Static580.aClass3_Sub22_24.method2423(local501, Static580.aClass3_Sub22_24.aClass21_Sub14_1);
					Static369.method5071("skydetail is " + (Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5011() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2629) File local2629;
				if (arg1.startsWith("setoutput ")) {
					local2629 = new File(arg1.substring(10));
					if (local2629.exists()) {
						local2629 = new File(arg1.substring(10) + "." + Static517.method6965() + ".log");
						if (local2629.exists()) {
							Static369.method5071("file already exists!");
							return;
						}
					}
					if (Static568.aFileOutputStream1 != null) {
						Static568.aFileOutputStream1.close();
						Static568.aFileOutputStream1 = null;
					}
					try {
						Static568.aFileOutputStream1 = new FileOutputStream(local2629);
						return;
					} catch (@Pc(2678) FileNotFoundException local2678) {
						Static369.method5071("Could not create " + local2629.getName());
						return;
					} catch (@Pc(2692) SecurityException local2692) {
						Static369.method5071("Cannot write to " + local2629.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static568.aFileOutputStream1 != null) {
						Static568.aFileOutputStream1.close();
					}
					Static568.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2629 = new File(arg1.substring(10));
					if (!local2629.exists()) {
						Static369.method5071("No such file");
						return;
					}
					@Pc(2749) byte[] local2749 = Static459.method6215(local2629);
					if (local2749 == null) {
						Static369.method5071("Failed to read file");
						return;
					}
					local1648 = Static104.method2099(Static299.method4204("", Static571.method7403(local2749)), '\n');
					Static240.method6914(local1648);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2785) short local2785 = (short) Static636.method8390(arg1.substring(5));
					if (local2785 > 0) {
						Static566.aShort92 = local2785;
					}
					return;
				}
				if (arg1.startsWith("cs2debug")) {
					if (arg1.length() > 9 && arg1.charAt(8) == ' ') {
						Static540.aString107 = arg1.substring(9);
						Static540.aBoolean564 = true;
						Static369.method5071("cs2debug: (" + Static540.aString107 + ")");
						return;
					}
					Static540.aString107 = null;
					Static540.aBoolean564 = !Static540.aBoolean564;
					Static369.method5071("cs2debug:" + Static540.aBoolean564);
					return;
				}
				if (Static98.anInt2140 == 11) {
					@Pc(2871) Class3_Sub29 local2871 = Static507.method6901(Static259.aClass144_42, Static95.aClass292_2.aClass88_2);
					local2871.aClass3_Sub2_Sub1_1.method2065(arg1.length() + 3);
					local2871.aClass3_Sub2_Sub1_1.method2065(arg2 ? 1 : 0);
					local2871.aClass3_Sub2_Sub1_1.method2065(arg0 ? 1 : 0);
					local2871.aClass3_Sub2_Sub1_1.method2073(arg1);
					Static95.aClass292_2.method6855(local2871);
				}
				if (arg1.startsWith("fps ") && Static416.aClass379_6 != Static286.aClass379_8) {
					Static646.method8497(Static636.method8390(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2929) Exception local2929) {
				Static369.method5071(Static430.aClass257_2.method5699(Static456.anInt7118));
				return;
			}
		}
		if (Static98.anInt2140 != 11) {
			Static369.method5071(Static430.aClass257_3.method5699(Static456.anInt7118) + arg1);
		}
	}
}
