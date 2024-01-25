import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!lj;")
	public static Class183 aClass183_2;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_16 = new Class229(8, 3);

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "J")
	public static long aLong237 = 0L;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt5789 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLjava/lang/String;ZZ)V")
	public static void method4912(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static145.aClass21_4 == Static71.aClass21_1 && Static313.anInt5785 < 2) {
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
				Static135.aBoolean172 = true;
				Static508.method7026("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static135.aBoolean172 = false;
				Static508.method7026("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static508.method7026("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(80) Throwable local80) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static469.anInt9081 = 0;
				Static158.anInt2904 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static265.aClass299_4.method7028();
				Static508.method7026("Text coords cleared");
				return;
			}
			@Pc(109) int local109;
			@Pc(130) int local130;
			@Pc(120) Runtime local120;
			if (arg0.equalsIgnoreCase("gc")) {
				Static32.method756();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static508.method7026("mem=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static32.method756();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static508.method7026("Memory before cleanup=" + local130 + "k");
				Static111.method1895();
				Static32.method756();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local130 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static508.method7026("Memory after cleanup=" + local130 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("unloadnatives")) {
				Static508.method7026(Static150.method2373() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static508.method7026("Number of player models in cache:" + Static376.method5763());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static508.method7026("Dropped client connection");
				if (Static268.anInt5100 == 9) {
					Static214.method1853();
				} else if (Static268.anInt5100 == 10) {
					Static229.aBoolean316 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static322.aClass114_2.method2598();
				Static508.method7026("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static322.aClass114_2.method2605();
				Static508.method7026("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static466.aClass102_4.method2389();
				Static402.aClass56_2.method1311();
				Static322.aClass114_2.method2599();
				Static508.method7026("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static419.method6151();
				Static359.method5344();
				Static508.method7026("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static219.method6545(1, false, -1, -1);
				if (Static306.method4842() == 1) {
					Static508.method7026("wm1 succeeded");
					return;
				}
				Static508.method7026("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static219.method6545(2, false, -1, -1);
				if (Static306.method4842() == 2) {
					Static508.method7026("wm2 succeeded");
					return;
				}
				Static508.method7026("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static219.method6545(3, false, 1024, 768);
				if (Static306.method4842() != 3) {
					Static508.method7026("wm3 failed");
					return;
				}
				Static508.method7026("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static390.method4905(0);
				if (Static374.anInt6861 == 0) {
					Static508.method7026("Entered tk0");
					Static544.aClass1_Sub22_Sub1_1.anInt5437 = 0;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				Static508.method7026("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static390.method4905(1);
				if (Static374.anInt6861 != 1) {
					Static508.method7026("Failed to enter tk1");
					return;
				}
				Static508.method7026("Entered tk1");
				Static544.aClass1_Sub22_Sub1_1.anInt5437 = 1;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static390.method4905(2);
				if (Static374.anInt6861 == 2) {
					Static508.method7026("Entered tk2");
					Static544.aClass1_Sub22_Sub1_1.anInt5437 = 2;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				Static508.method7026("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static390.method4905(3);
				if (Static374.anInt6861 == 3) {
					Static508.method7026("Entered tk3");
					Static544.aClass1_Sub22_Sub1_1.anInt5437 = 3;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				Static508.method7026("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("tk4")) {
				Static390.method4905(4);
				if (Static374.anInt6861 == 4) {
					Static508.method7026("Entered tk4");
					Static544.aClass1_Sub22_Sub1_1.anInt5437 = 4;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					return;
				}
				Static508.method7026("Failed to enter tk4");
				return;
			}
			if (arg0.equalsIgnoreCase("tk5")) {
				Static390.method4905(5);
				if (Static374.anInt6861 != 5) {
					Static508.method7026("Failed to enter tk5");
					return;
				}
				Static508.method7026("Entered tk5");
				Static544.aClass1_Sub22_Sub1_1.anInt5437 = 5;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static544.aClass1_Sub22_Sub1_1.aBoolean388 = !Static544.aClass1_Sub22_Sub1_1.aBoolean388;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				Static419.method6151();
				Static508.method7026("ot=" + Static544.aClass1_Sub22_Sub1_1.aBoolean388);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static544.aClass1_Sub22_Sub1_1.aBoolean383 = !Static544.aClass1_Sub22_Sub1_1.aBoolean383;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				Static419.method6151();
				Static508.method7026("gb=" + Static544.aClass1_Sub22_Sub1_1.aBoolean383);
				return;
			}
			@Pc(641) int local641;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static508.method7026("Invalid shadows value");
					return;
				}
				@Pc(631) String local631 = arg0.substring(8);
				local641 = Static328.method5048(local631) ? Static197.method7005(local631) : -1;
				if (local641 >= 0 && local641 <= 2) {
					Static544.aClass1_Sub22_Sub1_1.method4647(local641, Static374.anInt6861);
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					Static419.method6151();
					Static508.method7026("shadows=" + local641);
					return;
				}
				Static508.method7026("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static544.aClass1_Sub22_Sub1_1.aBoolean396 = !Static544.aClass1_Sub22_Sub1_1.aBoolean396;
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				Static205.method3533();
				Static419.method6151();
				Static508.method7026("textures=" + Static544.aClass1_Sub22_Sub1_1.aBoolean396);
				return;
			}
			if (arg0.startsWith("lighting")) {
				Static544.aClass1_Sub22_Sub1_1.method4651(Static374.anInt6861, !Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861));
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				Static283.method4575();
				Static205.method3533();
				Static419.method6151();
				Static508.method7026("lighting=" + Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861));
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static508.method7026("Invalid buildarea value");
					return;
				}
				local109 = Static197.method7005(arg0.substring(6));
				if (local109 >= 0 && local109 <= Static238.method5129(Static17.anInt454)) {
					Static544.aClass1_Sub22_Sub1_1.anInt5450 = local109;
					Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
					Static375.aBoolean499 = false;
					Static508.method7026("maxbuildarea=" + Static544.aClass1_Sub22_Sub1_1.anInt5450);
					return;
				}
				Static508.method7026("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static508.method7026("Invalid particles value");
					return;
				}
				Static26.method592(Static197.method7005(arg0.substring(13)));
				Static544.aClass1_Sub22_Sub1_1.method4660(Static466.aClass102_4);
				Static375.aBoolean499 = false;
				Static508.method7026("particles=" + Static330.method5083());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static508.method7026("Invalid rect_debug value");
					return;
				}
				Static503.anInt8507 = Static197.method7005(arg0.substring(10).trim());
				Static508.method7026("rect_debug=" + Static503.anInt8507);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static54.aBoolean69 = true;
				Static508.method7026("qa_op_test=" + Static54.aBoolean69);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static440.aBoolean545 = !Static440.aBoolean545;
				Static508.method7026("clipcomponents=" + Static440.aBoolean545);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(915) boolean local915 = Static513.aClass122_10.method7215();
				if (!Static336.method5121(!local915)) {
					Static508.method7026("Failed to enable bloom");
					return;
				}
				if (!local915) {
					Static508.method7026("Bloom enabled");
					return;
				}
				Static508.method7026("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static157.aBoolean315) {
					Static157.aBoolean315 = true;
					Static508.method7026("Forced tweening ENABLED!");
					return;
				}
				Static157.aBoolean315 = false;
				Static508.method7026("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static546.aBoolean183) {
					Static508.method7026("Shift-click disabled.");
					Static546.aBoolean183 = false;
					return;
				}
				Static508.method7026("Shift-click ENABLED!");
				Static546.aBoolean183 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static508.method7026("x:" + (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9) + " z:" + (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static508.method7026("Height: " + Static544.aClass205Array3[Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98].ba(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 7, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static543.aClass171_154.method4355();
				Static543.aClass171_154.method4347();
				Static323.aClass257_4.method6139();
				Static244.aClass272_4.method6381();
				Static359.method5344();
				Static508.method7026("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static513.aClass122_10.method7240()) {
					local109 = Integer.parseInt(arg0.substring(3));
					if (local109 < 1) {
						local109 = 1;
					} else if (local109 > 4) {
						local109 = 4;
					}
					Static61.anInt1166 = local109;
					Static513.aClass122_10.method7239(Static61.anInt1166);
					Static513.aClass122_10.method7232(0);
					Static508.method7026("Render cores now: " + Static61.anInt1166);
					return;
				}
				Static508.method7026("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static508.method7026("I(s): " + Static384.aClass313_46.method7401() + "/" + Static384.aClass313_46.method7395());
				Static508.method7026("I(m): " + Static416.aClass313_51.method7401() + "/" + Static416.aClass313_51.method7395());
				Static508.method7026("O(s): " + Static342.aClass250_2.aClass154_1.method3985() + "/" + Static342.aClass250_2.aClass154_1.method3987());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static508.method7026("Pos: " + Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 + "," + ((Static522.anInt8770 >> 9) + Static470.anInt7897 >> 6) + "," + ((Static516.anInt8682 >> 9) + Static534.anInt9007 >> 6) + "," + ((Static522.anInt8770 >> 9) + Static470.anInt7897 & 0x3F) + "," + (Static534.anInt9007 + (Static516.anInt8682 >> 9) & 0x3F) + " Height: " + (Static38.method884(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98, Static522.anInt8770, Static516.anInt8682) - Static504.anInt8519));
				Static508.method7026("Look: " + Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 + "," + (Static470.anInt7897 + Static488.anInt8138 >> 6) + "," + (Static119.anInt2374 + Static534.anInt9007 >> 6) + "," + (Static470.anInt7897 + Static488.anInt8138 & 0x3F) + "," + (Static119.anInt2374 + Static534.anInt9007 & 0x3F) + " Height: " + (Static38.method884(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98, Static488.anInt8138, Static119.anInt2374) - Static46.anInt933));
				return;
			}
			if (arg0.equals("showocc")) {
				Static544.aBoolean641 = !Static544.aBoolean641;
				Static419.method6151();
				Static508.method7026("showocc=" + Static544.aBoolean641);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static43.aBoolean47 = !Static43.aBoolean47;
				Static419.method6151();
				Static508.method7026("forcewallocc=" + Static43.aBoolean47);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static343.aBoolean438 = !Static343.aBoolean438;
				Static513.aClass122_10.method7260(Static343.aBoolean438);
				Static8.method311();
				Static508.method7026("showprofiling=" + Static343.aBoolean438);
				return;
			}
			if (arg0.startsWith("performancetest")) {
				local109 = -1;
				local641 = 1000;
				if (arg0.length() > 15) {
					@Pc(1363) String[] local1363 = Static254.method4297(' ', arg0);
					try {
						if (local1363.length > 1) {
							local641 = Integer.parseInt(local1363[1]);
						}
					} catch (@Pc(1376) Throwable local1376) {
					}
					try {
						if (local1363.length > 2) {
							local109 = Integer.parseInt(local1363[2]);
						}
					} catch (@Pc(1387) Throwable local1387) {
					}
				}
				if (local109 != -1) {
					Static508.method7026("Performance: " + Static109.method3482(local641, Static374.anInt6861));
					return;
				}
				Static508.method7026("Java toolkit: " + Static109.method3482(local641, 0));
				Static508.method7026("SSE toolkit:  " + Static109.method3482(local641, 2));
				Static508.method7026("D3D toolkit:  " + Static109.method3482(local641, 3));
				Static508.method7026("GL toolkit:   " + Static109.method3482(local641, 1));
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(1460) Class246 local1460 = Static513.aClass122_10.method7276();
				Static508.method7026("Vendor: " + local1460.anInt7036);
				Static508.method7026("Name: " + local1460.aString63);
				Static508.method7026("Version: " + local1460.anInt7033);
				Static508.method7026("Device: " + local1460.aString64);
				Static508.method7026("Driver Version: " + local1460.aLong297);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static200.aBoolean280 = !Static200.aBoolean280;
				Static508.method7026("nonpcs=" + Static200.aBoolean280);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static86.method1468();
				Static508.method7026("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local109 = Integer.parseInt(arg0.substring(12));
				Static217.method7159(local109, Static33.method780(local109).aString72);
				Static508.method7026("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static508.method7026("w: " + Static52.aClass4_1.anInt111);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static144.method2331(Static257.aClass296_92);
				Static455.aClass1_Sub6_Sub2_2.method3937(0);
				local109 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
				local641 = arg0.indexOf(" ", 4);
				Static455.aClass1_Sub6_Sub2_2.method3917(arg0.substring(3, local641));
				Static385.method5852(Static455.aClass1_Sub6_Sub2_2, arg0.substring(local641));
				Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local109);
				return;
			}
			if (arg0.equals("heap")) {
				Static508.method7026("Heap: " + Static17.anInt454 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static82.method3794();
				Static508.method7026("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local109 = 0; local109 < Static42.anIntArray119.length; local109++) {
					if (Static303.aBooleanArray39[local109]) {
						Static42.anIntArray119[local109] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static42.anIntArray119[local109] *= -1;
						}
					}
				}
				Static82.method3794();
				Static508.method7026("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static361.aBoolean465 = true;
				Static359.method5344();
				Static508.method7026("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static361.aBoolean465 = false;
				Static359.method5344();
				Static508.method7026("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static194.method2970();
				Static508.method7026("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static508.method7026(Static232.method4011() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local109 = Integer.parseInt(arg0.substring(9));
				if (local109 >= 0 && local109 <= 4) {
					Static544.aClass1_Sub22_Sub1_1.anInt5435 = local109;
				}
				Static508.method7026("cpuusage=" + Static544.aClass1_Sub22_Sub1_1.anInt5435);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local109 = Integer.parseInt(arg0.substring(17));
				Static508.method7026("varpbit=" + Static251.aClass119_1.method2643(local109));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local109 = Integer.parseInt(arg0.substring(14));
				Static508.method7026("varp=" + Static251.aClass119_1.method2642(local109));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static59.method1114(false, 0);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static59.method1114(true, 0);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1837) String[] local1837 = Static254.method4297(' ', arg0.substring(12));
				if (local1837.length >= 2) {
					local641 = local1837.length > 2 ? Integer.parseInt(local1837[2]) : 0;
					Static225.method3895(local1837[0], local641, local1837[1]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static180.method2685();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static180.method2681();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static180.method2681();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local109 = Integer.parseInt(arg0.substring(8));
				Static513.aClass122_10.method7210(local109);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static508.method7026("Active streams: " + Static411.aClass1_Sub16_Sub1_2.method2230());
				return;
			}
			if (arg0.equals("autosetup")) {
				Static544.aClass1_Sub22_Sub1_1.method4658();
				Static508.method7026("Complete. Toolkit now: " + Static374.anInt6861);
				return;
			}
			if (arg0.equals("errormessage")) {
				Static508.method7026(Static230.aClient2.method1206());
				return;
			}
			if (Static268.anInt5100 == 9) {
				Static144.method2331(Static341.aClass296_273);
				Static455.aClass1_Sub6_Sub2_2.method3937(arg0.length() + 3);
				Static455.aClass1_Sub6_Sub2_2.method3937(arg2 ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3937(arg1 ? 1 : 0);
				Static455.aClass1_Sub6_Sub2_2.method3917(arg0);
			}
			if (arg0.startsWith("fps ") && Static145.aClass21_4 != Static71.aClass21_1) {
				Static64.method1154(Static197.method7005(arg0.substring(4)));
				return;
			}
			if (Static268.anInt5100 != 9) {
				Static508.method7026("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(2012) Exception local2012) {
			Static508.method7026("Whoops, something went wrong.");
			return;
		}
	}
}
