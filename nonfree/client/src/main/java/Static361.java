import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!pq;")
	public static Class251 aClass251_104;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLjava/lang/String;IZ)V")
	public static void method5343(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static192.aClass287_3 == Static376.aClass287_6 && Static231.anInt3930 < 2) {
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
				Static386.aBoolean486 = true;
				Static555.method7074("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static386.aBoolean486 = false;
				Static555.method7074("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static555.method7074("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(78) Throwable local78) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static444.anInt7729 = 0;
				Static537.anInt9110 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static206.aClass249_3.method5818();
				Static555.method7074("Text coords cleared");
				return;
			}
			@Pc(107) int local107;
			@Pc(126) int local126;
			@Pc(116) Runtime local116;
			if (arg1.equalsIgnoreCase("gc")) {
				Static414.method6083();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local116 = Runtime.getRuntime();
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static555.method7074("mem=" + local126 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static414.method6083();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local116 = Runtime.getRuntime();
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static555.method7074("Memory before cleanup=" + local126 + "k");
				Static262.method3723();
				Static414.method6083();
				for (@Pc(182) int local182 = 0; local182 < 10; local182++) {
					System.gc();
				}
				local126 = (int) ((local116.totalMemory() - local116.freeMemory()) / 1024L);
				Static555.method7074("Memory after cleanup=" + local126 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static555.method7074(Static249.method3548() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static555.method7074("Number of player models in cache:" + Static337.method5123());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static555.method7074("Dropped client connection");
				if (Static146.anInt2581 == 10) {
					Static253.method3573();
					return;
				}
				if (Static146.anInt2581 == 11) {
					Static156.aBoolean183 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
				Static271.aClass147_2.method3179();
				Static555.method7074("Rotated connection methods");
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static294.aClass175_3.method3745();
				Static555.method7074("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static294.aClass175_3.method3735();
				Static555.method7074("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static152.aClass57_4.method930();
				Static225.aClass71_1.method5965();
				Static294.aClass175_3.method3741();
				Static555.method7074("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static32.method456();
				Static260.method3646();
				Static555.method7074("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static111.method1753(-1, -1, 1, false);
				if (Static354.method5293() == 1) {
					Static555.method7074("wm1 succeeded");
					return;
				}
				Static555.method7074("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static111.method1753(-1, -1, 2, false);
				if (Static354.method5293() != 2) {
					Static555.method7074("wm2 failed");
					return;
				}
				Static555.method7074("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static111.method1753(768, 1024, 3, false);
				if (Static354.method5293() != 3) {
					Static555.method7074("wm3 failed");
					return;
				}
				Static555.method7074("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static360.method5340(0);
				if (Static567.anInt9503 == 0) {
					Static555.method7074("Entered tk0");
					Static480.aClass6_Sub37_Sub1_1.anInt6046 = 0;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				Static555.method7074("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static360.method5340(1);
				if (Static567.anInt9503 == 1) {
					Static555.method7074("Entered tk1");
					Static480.aClass6_Sub37_Sub1_1.anInt6046 = 1;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				Static555.method7074("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static360.method5340(2);
				if (Static567.anInt9503 != 2) {
					Static555.method7074("Failed to enter tk2");
					return;
				}
				Static555.method7074("Entered tk2");
				Static480.aClass6_Sub37_Sub1_1.anInt6046 = 2;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static360.method5340(3);
				if (Static567.anInt9503 == 3) {
					Static555.method7074("Entered tk3");
					Static480.aClass6_Sub37_Sub1_1.anInt6046 = 3;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				Static555.method7074("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static360.method5340(4);
				if (Static567.anInt9503 == 4) {
					Static555.method7074("Entered tk4");
					Static480.aClass6_Sub37_Sub1_1.anInt6046 = 4;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				Static555.method7074("Failed to enter tk4");
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static360.method5340(5);
				if (Static567.anInt9503 != 5) {
					Static555.method7074("Failed to enter tk5");
					return;
				}
				Static555.method7074("Entered tk5");
				Static480.aClass6_Sub37_Sub1_1.anInt6046 = 5;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static480.aClass6_Sub37_Sub1_1.aBoolean408 = !Static480.aClass6_Sub37_Sub1_1.aBoolean408;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				Static32.method456();
				Static555.method7074("ot=" + Static480.aClass6_Sub37_Sub1_1.aBoolean408);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static480.aClass6_Sub37_Sub1_1.aBoolean409 = !Static480.aClass6_Sub37_Sub1_1.aBoolean409;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				Static32.method456();
				Static555.method7074("gb=" + Static480.aClass6_Sub37_Sub1_1.aBoolean409);
				return;
			}
			@Pc(655) int local655;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static555.method7074("Invalid shadows value");
					return;
				}
				@Pc(645) String local645 = arg1.substring(8);
				local655 = Static44.method598(local645) ? Static467.method6543(local645) : -1;
				if (local655 >= 0 && local655 <= 2) {
					Static480.aClass6_Sub37_Sub1_1.method5148(Static567.anInt9503, local655);
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					Static32.method456();
					Static555.method7074("shadows=" + local655);
					return;
				}
				Static555.method7074("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static480.aClass6_Sub37_Sub1_1.aBoolean401 = !Static480.aClass6_Sub37_Sub1_1.aBoolean401;
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				Static321.method4977();
				Static32.method456();
				Static555.method7074("textures=" + Static480.aClass6_Sub37_Sub1_1.aBoolean401);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static480.aClass6_Sub37_Sub1_1.method5145(!Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503), Static567.anInt9503);
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				Static528.method7588();
				Static321.method4977();
				Static32.method456();
				Static555.method7074("lighting=" + Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static555.method7074("Invalid buildarea value");
					return;
				}
				local107 = Static467.method6543(arg1.substring(6));
				if (local107 >= 0 && local107 <= Static224.method3261(Static31.anInt551)) {
					Static480.aClass6_Sub37_Sub1_1.anInt6061 = local107;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					Static555.method7074("maxbuildarea=" + Static480.aClass6_Sub37_Sub1_1.anInt6061);
					return;
				}
				Static555.method7074("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static555.method7074("Invalid particles value");
					return;
				}
				Static186.method2764(Static467.method6543(arg1.substring(13)));
				Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
				Static474.aBoolean543 = false;
				Static555.method7074("particles=" + Static249.method3547());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static555.method7074("Invalid rect_debug value");
					return;
				}
				Static278.anInt6568 = Static467.method6543(arg1.substring(10).trim());
				Static555.method7074("rect_debug=" + Static278.anInt6568);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static446.aBoolean529 = true;
				Static555.method7074("qa_op_test=" + Static446.aBoolean529);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static14.aBoolean11 = !Static14.aBoolean11;
				Static555.method7074("clipcomponents=" + Static14.aBoolean11);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(927) boolean local927 = Static176.aClass121_5.method7141();
				if (Static540.method7485(!local927)) {
					if (local927) {
						Static555.method7074("Bloom disabled");
						return;
					}
					Static555.method7074("Bloom enabled");
					return;
				}
				Static555.method7074("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static318.aBoolean368) {
					Static318.aBoolean368 = false;
					Static555.method7074("Forced tweening disabled.");
					return;
				}
				Static318.aBoolean368 = true;
				Static555.method7074("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static330.aBoolean414) {
					Static555.method7074("Shift-click ENABLED!");
					Static330.aBoolean414 = true;
					return;
				}
				Static555.method7074("Shift-click disabled.");
				Static330.aBoolean414 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static555.method7074("x:" + (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9) + " z:" + (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static555.method7074("Height: " + Static285.aClass60Array8[Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103].JA(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 7, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static447.aClass251_141.method5831();
				Static447.aClass251_141.method5833();
				Static32.aClass245_1.method5767();
				Static474.aClass276_4.method6399();
				Static260.method3646();
				Static555.method7074("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static176.aClass121_5.method7093()) {
					Static555.method7074("Current toolkit doesn't support multiple cores");
					return;
				}
				local107 = Integer.parseInt(arg1.substring(3));
				if (local107 < 1) {
					local107 = 1;
				} else if (local107 > 4) {
					local107 = 4;
				}
				Static247.anInt4098 = local107;
				Static176.aClass121_5.method7119(Static247.anInt4098);
				Static176.aClass121_5.method7105(0);
				Static555.method7074("Render cores now: " + Static247.anInt4098);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static555.method7074("I(s): " + Static458.aClass332_175.method7508() + "/" + Static458.aClass332_175.method7499());
				Static555.method7074("I(m): " + Static303.aClass332_126.method7508() + "/" + Static303.aClass332_126.method7499());
				Static555.method7074("O(s): " + Static295.aClass256_2.aClass122_1.method2591() + "/" + Static295.aClass256_2.aClass122_1.method2589());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static555.method7074("Pos: " + Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 + "," + ((Static388.anInt6921 >> 9) + Static218.anInt3718 >> 6) + "," + (Static167.anInt3048 + (Static220.anInt3753 >> 9) >> 6) + "," + ((Static388.anInt6921 >> 9) + Static218.anInt3718 & 0x3F) + "," + ((Static220.anInt3753 >> 9) + Static167.anInt3048 & 0x3F) + " Height: " + (Static490.method6768(Static388.anInt6921, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, Static220.anInt3753) - Static33.anInt568));
				Static555.method7074("Look: " + Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 + "," + (Static218.anInt3718 + Static71.anInt1189 >> 6) + "," + (Static167.anInt3048 + Static152.anInt2703 >> 6) + "," + (Static71.anInt1189 + Static218.anInt3718 & 0x3F) + "," + (Static152.anInt2703 + Static167.anInt3048 & 0x3F) + " Height: " + (Static490.method6768(Static71.anInt1189, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, Static152.anInt2703) - Static277.anInt4615));
				return;
			}
			if (arg1.equals("showocc")) {
				Static469.aBoolean541 = !Static469.aBoolean541;
				Static32.method456();
				Static555.method7074("showocc=" + Static469.aBoolean541);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static2.aBoolean3 = !Static2.aBoolean3;
				Static32.method456();
				Static555.method7074("forcewallocc=" + Static2.aBoolean3);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static60.aBoolean49 = !Static60.aBoolean49;
				Static176.aClass121_5.method7135(Static60.aBoolean49);
				Static272.method3835();
				Static555.method7074("showprofiling=" + Static60.aBoolean49);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local107 = -1;
				local655 = 1000;
				if (arg1.length() > 15) {
					@Pc(1380) String[] local1380 = Static128.method1936(arg1, ' ');
					try {
						if (local1380.length > 1) {
							local655 = Integer.parseInt(local1380[1]);
						}
					} catch (@Pc(1391) Throwable local1391) {
					}
					try {
						if (local1380.length > 2) {
							local107 = Integer.parseInt(local1380[2]);
						}
					} catch (@Pc(1402) Throwable local1402) {
					}
				}
				if (local107 == -1) {
					Static555.method7074("Java toolkit: " + Static137.method2054(0, local655));
					Static555.method7074("SSE toolkit:  " + Static137.method2054(2, local655));
					Static555.method7074("D3D toolkit:  " + Static137.method2054(3, local655));
					Static555.method7074("GL toolkit:   " + Static137.method2054(1, local655));
					Static555.method7074("GLX toolkit:  " + Static137.method2054(5, local655));
					return;
				}
				Static555.method7074("Performance: " + Static137.method2054(Static567.anInt9503, local655));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1487) Class282 local1487 = Static176.aClass121_5.method7124();
				Static555.method7074("Vendor: " + local1487.anInt7766);
				Static555.method7074("Name: " + local1487.aString90);
				Static555.method7074("Version: " + local1487.anInt7767);
				Static555.method7074("Device: " + local1487.aString91);
				Static555.method7074("Driver Version: " + local1487.aLong197);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static63.aBoolean53 = !Static63.aBoolean53;
				Static555.method7074("nonpcs=" + Static63.aBoolean53);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static468.method6558();
				Static555.method7074("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local107 = Integer.parseInt(arg1.substring(12));
				Static122.method1852(local107, Static92.method5966(local107).aString33);
				Static555.method7074("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static555.method7074("w: " + Static271.aClass147_2.anInt3691);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static136.method2051(Static457.aClass160_55);
				Static218.aClass6_Sub14_Sub2_1.method6035(0);
				local107 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
				local655 = arg1.indexOf(" ", 4);
				Static218.aClass6_Sub14_Sub2_1.method5989(arg1.substring(3, local655));
				Static526.method7358(Static218.aClass6_Sub14_Sub2_1, arg1.substring(local655));
				Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local107);
				return;
			}
			if (arg1.equals("heap")) {
				Static555.method7074("Heap: " + Static31.anInt551 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static480.method6664();
				Static555.method7074("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local107 = 0; local107 < Static402.anIntArray568.length; local107++) {
					if (Static248.aBooleanArray25[local107]) {
						Static402.anIntArray568[local107] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static402.anIntArray568[local107] *= -1;
						}
					}
				}
				Static480.method6664();
				Static555.method7074("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static543.aBoolean642 = true;
				Static260.method3646();
				Static555.method7074("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static543.aBoolean642 = false;
				Static260.method3646();
				Static555.method7074("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static244.method3524();
				Static555.method7074("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static555.method7074(Static222.method3235() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local107 = Integer.parseInt(arg1.substring(9));
				if (local107 >= 0 && local107 <= 4) {
					Static480.aClass6_Sub37_Sub1_1.anInt6053 = local107;
				}
				Static555.method7074("cpuusage=" + Static480.aClass6_Sub37_Sub1_1.anInt6053);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local107 = Integer.parseInt(arg1.substring(17));
				Static555.method7074("varpbit=" + Static505.aClass30_1.method495(local107));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local107 = Integer.parseInt(arg1.substring(14));
				Static555.method7074("varp=" + Static505.aClass30_1.method494(local107));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static532.method7402(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static532.method7402(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1864) String[] local1864 = Static128.method1936(arg1.substring(12), ' ');
				if (local1864.length >= 2) {
					local655 = local1864.length <= 2 ? 0 : Integer.parseInt(local1864[2]);
					Static293.method4107(local655, local1864[1], local1864[0]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static100.method1638();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static100.method1632();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static100.method1632();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local107 = Integer.parseInt(arg1.substring(8));
				Static176.aClass121_5.method7086(local107);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static555.method7074("Active streams: " + Static144.aClass6_Sub19_Sub3_2.method6427());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static480.aClass6_Sub37_Sub1_1.method5154();
				Static555.method7074("Complete. Toolkit now: " + Static567.anInt9503);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static555.method7074(Static153.aClient1.method841());
				return;
			}
			if (Static146.anInt2581 == 10) {
				Static136.method2051(Static231.aClass160_47);
				Static218.aClass6_Sub14_Sub2_1.method6035(arg1.length() + 3);
				Static218.aClass6_Sub14_Sub2_1.method6035(arg0 ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method6035(arg2 ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5989(arg1);
			}
			if (arg1.startsWith("fps ") && Static192.aClass287_3 != Static376.aClass287_6) {
				Static263.method3729(Static467.method6543(arg1.substring(4)));
				return;
			}
			if (Static146.anInt2581 != 10) {
				Static555.method7074("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(2037) Exception local2037) {
			Static555.method7074("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method5344() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static99.aBooleanArray16[local11] = false;
		}
		Static354.anInt6233 = 1;
		Static141.anInt2540 = -1;
		Static309.anInt5560 = 0;
		Static544.anInt9197 = -1;
		Static205.anInt3498 = 0;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method5345() {
		Static538.aClass275_190.method6357();
		Static392.aClass275_145.method6357();
		@Pc(29) int local29;
		for (@Pc(24) Class6_Sub48 local24 = (Class6_Sub48) Static445.aClass275_162.method6366(); local24 != null; local24 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			local29 = local24.anInt8333;
			if (local29 < 1000) {
				local24.method7849();
				if (local29 == 46 || local29 == 16 || local29 == 57 || local29 == 47 || local29 == 20 || local29 == 50 || local29 == 48) {
					Static392.aClass275_145.method6370(local24);
				} else {
					Static538.aClass275_190.method6370(local24);
				}
			}
		}
		Static538.aClass275_190.method6367(Static445.aClass275_162);
		Static392.aClass275_145.method6367(Static445.aClass275_162);
		if (Static374.anInt6451 <= 1) {
			Static185.aClass6_Sub48_1 = null;
		} else if (Static330.aBoolean414 && Static539.aClass88_1.method6348(81) && Static374.anInt6451 > 2) {
			Static185.aClass6_Sub48_1 = (Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283.aClass6_283;
		} else {
			Static185.aClass6_Sub48_1 = (Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283;
		}
		local29 = -1;
		@Pc(130) Class6_Sub8 local130 = (Class6_Sub8) Static274.aClass275_64.method6366();
		if (local130 != null) {
			local29 = local130.method7651();
		}
		if (!Static330.aBoolean415) {
			if (local29 == 0 && (Static129.anInt2230 == 1 && Static374.anInt6451 > 2 || Static346.method5212())) {
				local29 = 2;
			}
			if (local29 == 2 && Static374.anInt6451 > 0 && local130 != null) {
				if (Static382.aClass97_10 == null && Static540.anInt9139 == 0) {
					Static178.method5955(local130.method7645(), local130.method7643());
				} else {
					Static460.anInt7814 = 2;
				}
			}
			if (local29 == 0 && Static374.anInt6451 > 0) {
				Static290.method4086();
			}
			if (Static382.aClass97_10 == null && Static540.anInt9139 == 0) {
				Static460.anInt7814 = 0;
				Static336.aClass6_Sub48_3 = null;
				return;
			}
			return;
		}
		@Pc(211) int local211;
		@Pc(215) int local215;
		if (local29 == -1) {
			local211 = Static427.aClass134_1.method6093();
			local215 = Static427.aClass134_1.method6092();
			if (local211 < Static83.anInt1402 - 10 || local211 > Static353.anInt6216 + Static83.anInt1402 + 10 || local215 < Static377.anInt6491 - 10 || Static377.anInt6491 + Static519.anInt8950 + 10 < local215) {
				Static287.method7854();
			}
		}
		if (local29 != 0) {
			return;
		}
		local211 = Static83.anInt1402;
		local215 = Static377.anInt6491;
		@Pc(254) int local254 = Static353.anInt6216;
		@Pc(258) int local258 = local130.method7645();
		@Pc(262) int local262 = local130.method7643();
		@Pc(264) int local264 = -1;
		@Pc(283) int local283;
		for (@Pc(266) int local266 = 0; local266 < Static374.anInt6451; local266++) {
			if (Static206.aBoolean233) {
				local283 = (Static374.anInt6451 - local266 - 1) * 16 + local215 + 33;
				if (local258 > local211 && local211 + local254 > local258 && local262 > local283 - 13 && local262 < local283 + 4) {
					local264 = local266;
				}
			} else {
				local283 = local215 + (Static374.anInt6451 - local266 - 1) * 16 + 31;
				if (local258 > local211 && local258 < local211 + local254 && local283 - 13 < local262 && local283 + 3 > local262) {
					local264 = local266;
				}
			}
		}
		if (local264 != -1) {
			local283 = 0;
			@Pc(373) Class27 local373 = new Class27(Static445.aClass275_162);
			for (@Pc(378) Class6_Sub48 local378 = (Class6_Sub48) local373.method458(); local378 != null; local378 = (Class6_Sub48) local373.method455()) {
				if (local264 == local283) {
					Static206.method3068(local378, local262, local258);
				}
				local283++;
			}
		}
		Static287.method7854();
	}
}
