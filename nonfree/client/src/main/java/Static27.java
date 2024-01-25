import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public static int anInt2471 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
	public static void method2039(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static60.aClass258_1 == Static260.aClass258_7 && Static440.anInt7085 < 2) {
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
				Static199.aBoolean203 = true;
				Static433.method5450("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static199.aBoolean203 = false;
				Static433.method5450("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static433.method5450("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(73) Throwable local73) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static166.anInt2851 = 0;
				Static157.anInt2696 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static286.aClass93_4.method2073();
				Static433.method5450("Text coords cleared");
				return;
			}
			@Pc(123) int local123;
			@Pc(102) int local102;
			@Pc(113) Runtime local113;
			if (arg1.equalsIgnoreCase("gc")) {
				Static427.method5591();
				for (local102 = 0; local102 < 10; local102++) {
					System.gc();
				}
				local113 = Runtime.getRuntime();
				local123 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static433.method5450("mem=" + local123 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static427.method5591();
				for (local102 = 0; local102 < 10; local102++) {
					System.gc();
				}
				local113 = Runtime.getRuntime();
				local123 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static433.method5450("Memory before cleanup=" + local123 + "k");
				Static203.method2716();
				Static427.method5591();
				for (@Pc(182) int local182 = 0; local182 < 10; local182++) {
					System.gc();
				}
				local123 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static433.method5450("Memory after cleanup=" + local123 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static433.method5450("Number of player models in cache:" + Static239.method3069());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static433.method5450("Dropped client connection");
				if (Static290.anInt4777 == 9) {
					Static297.method3933();
				} else if (Static290.anInt4777 == 10) {
					Static141.aBoolean165 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static24.aClass84_1.method1901();
				Static433.method5450("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static24.aClass84_1.method1900();
				Static433.method5450("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static79.aClass183_2.method3915();
				Static375.aClass160_3.method3204();
				Static24.aClass84_1.method1903();
				Static433.method5450("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static284.method3776();
				Static12.method161();
				Static433.method5450("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static354.method4724(1, false, -1, -1);
				if (Static284.method3772() == 1) {
					Static433.method5450("wm1 succeeded");
					return;
				}
				Static433.method5450("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static354.method4724(2, false, -1, -1);
				if (Static284.method3772() == 2) {
					Static433.method5450("wm2 succeeded");
					return;
				}
				Static433.method5450("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static354.method4724(3, false, 768, 1024);
				if (Static284.method3772() == 3) {
					Static433.method5450("wm3 succeeded");
					return;
				}
				Static433.method5450("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static424.method5112(0);
				if (Static288.anInt4743 == 0) {
					Static433.method5450("Entered tk0");
					Static2.aClass148_Sub1_1.anInt3795 = 0;
					Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
					Static418.aBoolean496 = false;
					return;
				}
				Static433.method5450("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static424.method5112(1);
				if (Static288.anInt4743 != 1) {
					Static433.method5450("Failed to enter tk1");
					return;
				}
				Static433.method5450("Entered tk1");
				Static2.aClass148_Sub1_1.anInt3795 = 1;
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
				Static418.aBoolean496 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static424.method5112(2);
				if (Static288.anInt4743 == 2) {
					Static433.method5450("Entered tk2");
					Static2.aClass148_Sub1_1.anInt3795 = 2;
					Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
					Static418.aBoolean496 = false;
					return;
				}
				Static433.method5450("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static424.method5112(3);
				if (Static288.anInt4743 == 3) {
					Static433.method5450("Entered tk3");
					return;
				}
				Static433.method5450("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static2.aClass148_Sub1_1.aBoolean253 = !Static2.aClass148_Sub1_1.aBoolean253;
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
				Static418.aBoolean496 = false;
				Static284.method3776();
				Static433.method5450("ot=" + Static2.aClass148_Sub1_1.aBoolean253);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static2.aClass148_Sub1_1.aBoolean246 = !Static2.aClass148_Sub1_1.aBoolean246;
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
				Static418.aBoolean496 = false;
				Static284.method3776();
				Static433.method5450("gb=" + Static2.aClass148_Sub1_1.aBoolean246);
				return;
			}
			@Pc(560) int local560;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static433.method5450("Invalid shadows value");
					return;
				}
				@Pc(550) String local550 = arg1.substring(8);
				local560 = Static189.method2546(local550) ? Static205.method2736(local550) : -1;
				if (local560 >= 0 && local560 <= 2) {
					Static2.aClass148_Sub1_1.method3039(local560, Static288.anInt4743);
					Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
					Static418.aBoolean496 = false;
					Static284.method3776();
					Static433.method5450("shadows=" + local560);
					return;
				}
				Static433.method5450("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static2.aClass148_Sub1_1.aBoolean260 = !Static2.aClass148_Sub1_1.aBoolean260;
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
				Static418.aBoolean496 = false;
				Static361.method4755();
				Static284.method3776();
				Static433.method5450("textures=" + Static2.aClass148_Sub1_1.aBoolean260);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static433.method5450("Invalid buildarea value");
					return;
				}
				local102 = Static205.method2736(arg1.substring(6));
				if (local102 >= 0 && Static82.method1188(Static177.anInt3052) >= local102) {
					Static2.aClass148_Sub1_1.anInt3776 = local102;
					Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
					Static418.aBoolean496 = false;
					Static433.method5450("maxbuildarea=" + Static2.aClass148_Sub1_1.anInt3776);
					return;
				}
				Static433.method5450("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static433.method5450("Invalid particles value");
					return;
				}
				Static199.method2678(Static205.method2736(arg1.substring(13)));
				Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
				Static418.aBoolean496 = false;
				Static433.method5450("particles=" + Static194.method2631());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static433.method5450("Invalid rect_debug value");
					return;
				}
				Static340.anInt6976 = Static205.method2736(arg1.substring(10).trim());
				Static433.method5450("rect_debug=" + Static340.anInt6976);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static95.aBoolean158 = true;
				Static433.method5450("qa_op_test=" + Static95.aBoolean158);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static453.aBoolean526 = !Static453.aBoolean526;
				Static433.method5450("clipcomponents=" + Static453.aBoolean526);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(798) boolean local798 = Static82.aClass163_1.method5555();
				if (!Static417.method5271(!local798)) {
					Static433.method5450("Failed to enable bloom");
					return;
				}
				if (!local798) {
					Static433.method5450("Bloom enabled");
					return;
				}
				Static433.method5450("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static390.aBoolean492) {
					Static390.aBoolean492 = false;
					Static433.method5450("Forced tweening disabled.");
					return;
				}
				Static390.aBoolean492 = true;
				Static433.method5450("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static245.aBoolean275) {
					Static433.method5450("Shift-click ENABLED!");
					Static245.aBoolean275 = true;
					return;
				}
				Static433.method5450("Shift-click disabled.");
				Static245.aBoolean275 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static433.method5450("x:" + (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7) + " z:" + (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static433.method5450("Height: " + Static345.aClass162Array3[Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91].ua(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static103.aClass54_28.method1135();
				Static103.aClass54_28.method1117();
				Static70.aClass97_1.method2134();
				Static193.aClass120_2.method2515();
				Static12.method161();
				Static433.method5450("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static82.aClass163_1.method5524()) {
					local102 = Integer.parseInt(arg1.substring(3));
					if (local102 < 1) {
						local102 = 1;
					} else if (local102 > 4) {
						local102 = 4;
					}
					Static115.anInt2125 = local102;
					Static82.aClass163_1.method5564(Static115.anInt2125);
					Static82.aClass163_1.method5547(0);
					Static433.method5450("Render cores now: " + Static115.anInt2125);
					return;
				}
				Static433.method5450("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static433.method5450("I(s): " + Static354.aClass132_55.method2707() + "/" + Static354.aClass132_55.method2700());
				Static433.method5450("I(m): " + Static264.aClass132_40.method2707() + "/" + Static264.aClass132_40.method2700());
				Static433.method5450("O(s): " + Static384.aClass164_2.aClass119_1.method2491() + "/" + Static384.aClass164_2.aClass119_1.method2492());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static433.method5450("Pos: " + Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 + "," + ((Static174.anInt3028 >> 7) + Static275.anInt4506 >> 6) + "," + ((Static143.anInt2544 >> 7) + Static209.anInt3497 >> 6) + "," + (Static275.anInt4506 + (Static174.anInt3028 >> 7) & 0x3F) + "," + (Static209.anInt3497 + (Static143.anInt2544 >> 7) & 0x3F) + " Height: " + (Static302.method3973(Static143.anInt2544, Static174.anInt3028, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) - Static40.anInt771));
				Static433.method5450("Look: " + Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 + "," + (Static275.anInt4506 + Static338.anInt5763 >> 6) + "," + (Static330.anInt5575 + Static209.anInt3497 >> 6) + "," + (Static338.anInt5763 + Static275.anInt4506 & 0x3F) + "," + (Static330.anInt5575 + Static209.anInt3497 & 0x3F) + " Height: " + (Static302.method3973(Static330.anInt5575, Static338.anInt5763, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) - Static172.anInt3016));
				return;
			}
			if (arg1.equals("showocc")) {
				Static30.aBoolean56 = !Static30.aBoolean56;
				Static284.method3776();
				Static433.method5450("showocc=" + Static30.aBoolean56);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static443.aBoolean516 = !Static443.aBoolean516;
				Static284.method3776();
				Static433.method5450("forcewallocc=" + Static443.aBoolean516);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static190.aBoolean188 = !Static190.aBoolean188;
				Static82.aClass163_1.method5493(Static190.aBoolean188);
				Static164.method3947();
				Static433.method5450("showprofiling=" + Static190.aBoolean188);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static433.method5450("Java toolkit: " + Static96.method1494(Static79.aClass183_2));
				Static433.method5450("GL toolkit:   " + Static96.method1494(Static79.aClass183_2));
				Static433.method5450("SSE toolkit:  " + Static96.method1494(Static79.aClass183_2));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static104.aBoolean135 = !Static104.aBoolean135;
				Static433.method5450("nonpcs=" + Static104.aBoolean135);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static383.method4928();
				Static433.method5450("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local102 = Integer.parseInt(arg1.substring(12));
				Static153.method2189(Static14.method171(local102).aString73, local102);
				Static433.method5450("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static433.method5450("w: " + Static14.aClass265_1.anInt7137);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static29.method451(Static283.aClass102_138);
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				local102 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
				local560 = arg1.indexOf(" ", 4);
				Static456.aClass2_Sub13_Sub2_2.method3590(arg1.substring(3, local560));
				Static457.method5713(arg1.substring(local560), Static456.aClass2_Sub13_Sub2_2);
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local102);
				return;
			}
			if (arg1.equals("heap")) {
				Static433.method5450("Heap: " + Static177.anInt3052 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static336.method4489();
				Static433.method5450("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local102 = 0; local102 < Static400.anIntArray551.length; local102++) {
					if (Static270.aBooleanArray18[local102]) {
						Static400.anIntArray551[local102] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static400.anIntArray551[local102] *= -1;
						}
					}
				}
				Static336.method4489();
				Static433.method5450("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static204.aBoolean209 = true;
				Static12.method161();
				Static433.method5450("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static204.aBoolean209 = false;
				Static12.method161();
				Static433.method5450("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static190.method2553();
				Static433.method5450("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static433.method5450(Static30.method460() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local102 = Integer.parseInt(arg1.substring(9));
				if (local102 >= 0 && local102 <= 4) {
					Static2.aClass148_Sub1_1.anInt3793 = local102;
				}
				Static433.method5450("cpuusage=" + Static2.aClass148_Sub1_1.anInt3793);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local102 = Integer.parseInt(arg1.substring(17));
				Static433.method5450("varpbit=" + Static138.aClass268_1.method5650(local102));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local102 = Integer.parseInt(arg1.substring(14));
				Static433.method5450("varp=" + Static138.aClass268_1.method5649(local102));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static456.method5711(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static456.method5711(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1606) String[] local1606 = Static203.method2715(' ', arg1.substring(12));
				if (local1606.length >= 2) {
					local560 = local1606.length > 2 ? Integer.parseInt(local1606[2]) : 0;
					Static454.method5698(local1606[1], local560, local1606[0]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static191.method2563();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static191.method2570();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static191.method2570();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local102 = Integer.parseInt(arg1.substring(8));
				Static82.aClass163_1.method5495(local102);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static433.method5450("Active streams: " + Static421.aClass2_Sub1_Sub4_2.method3231());
				return;
			}
			if (arg1.equals("errormessage")) {
				Static433.method5450(Static320.aClient1.method790());
				return;
			}
			if (Static290.anInt4777 == 9) {
				Static29.method451(Static409.aClass102_197);
				Static456.aClass2_Sub13_Sub2_2.method3602(arg1.length() + 3);
				Static456.aClass2_Sub13_Sub2_2.method3602(arg2 ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3602(arg0 ? 1 : 0);
				Static456.aClass2_Sub13_Sub2_2.method3590(arg1);
			}
			if (arg1.startsWith("fps ") && Static60.aClass258_1 != Static260.aClass258_7) {
				Static366.method4810(Static205.method2736(arg1.substring(4)));
				return;
			}
			if (Static290.anInt4777 != 9) {
				Static433.method5450("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(1763) Exception local1763) {
			Static433.method5450("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
	public static boolean method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static169.method2370(arg0, arg1) || Static255.method3255(arg1, arg0);
	}
}
