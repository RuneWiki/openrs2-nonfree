import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jk", name = "Cc", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_17 = new Class42(512);

	@OriginalMember(owner = "client!jk", name = "Oc", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_11 = new Class212(14, 16);

	@OriginalMember(owner = "client!jk", name = "Qc", descriptor = "[I")
	public static final int[] anIntArray308 = new int[8];

	@OriginalMember(owner = "client!jk", name = "Vc", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;ZZZ)V")
	public static void method4043(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static134.aClass199_4 == Static124.aClass199_3 && Static137.anInt1383 < 2) {
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
				Static399.aBoolean506 = true;
				Static360.method5527("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static399.aBoolean506 = false;
				Static360.method5527("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static360.method5527("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(80) Throwable local80) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static488.anInt6246 = 0;
				Static532.anInt8981 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static413.aClass77_12.method2164();
				Static360.method5527("Text coords cleared");
				return;
			}
			@Pc(109) int local109;
			@Pc(129) int local129;
			@Pc(120) Runtime local120;
			if (arg0.equalsIgnoreCase("gc")) {
				Static174.method3033();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local129 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static360.method5527("mem=" + local129 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static174.method3033();
				for (local109 = 0; local109 < 10; local109++) {
					System.gc();
				}
				local120 = Runtime.getRuntime();
				local129 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static360.method5527("Memory before cleanup=" + local129 + "k");
				Static225.method3576();
				Static174.method3033();
				for (@Pc(187) int local187 = 0; local187 < 10; local187++) {
					System.gc();
				}
				local129 = (int) ((local120.totalMemory() - local120.freeMemory()) / 1024L);
				Static360.method5527("Memory after cleanup=" + local129 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("unloadnatives")) {
				Static360.method5527(Static543.method5326() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static360.method5527("Number of player models in cache:" + Static73.method1330());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static360.method5527("Dropped client connection");
				if (Static389.anInt7024 == 9) {
					Static493.method6846();
				} else if (Static389.anInt7024 == 10) {
					Static233.aBoolean269 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static301.aClass55_3.method1336();
				Static360.method5527("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static301.aClass55_3.method1343();
				Static360.method5527("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static159.aClass9_10.method274();
				client.lb.method4914();
				Static301.aClass55_3.method1341();
				Static360.method5527("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static27.method672();
				Static457.method6380();
				Static360.method5527("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static302.method4984(-1, -1, false, 1);
				if (Static503.method6935() == 1) {
					Static360.method5527("wm1 succeeded");
					return;
				}
				Static360.method5527("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static302.method4984(-1, -1, false, 2);
				if (Static503.method6935() != 2) {
					Static360.method5527("wm2 failed");
					return;
				}
				Static360.method5527("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static302.method4984(1024, 768, false, 3);
				if (Static503.method6935() != 3) {
					Static360.method5527("wm3 failed");
					return;
				}
				Static360.method5527("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static77.method4915(0);
				if (Static17.anInt459 != 0) {
					Static360.method5527("Failed to enter tk0");
					return;
				}
				Static360.method5527("Entered tk0");
				Static300.aClass5_Sub28_Sub1_1.anInt4887 = 0;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static77.method4915(1);
				if (Static17.anInt459 != 1) {
					Static360.method5527("Failed to enter tk1");
					return;
				}
				Static360.method5527("Entered tk1");
				Static300.aClass5_Sub28_Sub1_1.anInt4887 = 1;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static77.method4915(2);
				if (Static17.anInt459 == 2) {
					Static360.method5527("Entered tk2");
					Static300.aClass5_Sub28_Sub1_1.anInt4887 = 2;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				Static360.method5527("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static77.method4915(3);
				if (Static17.anInt459 != 3) {
					Static360.method5527("Failed to enter tk3");
					return;
				}
				Static360.method5527("Entered tk3");
				Static300.aClass5_Sub28_Sub1_1.anInt4887 = 3;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk4")) {
				Static77.method4915(4);
				if (Static17.anInt459 == 4) {
					Static360.method5527("Entered tk4");
					Static300.aClass5_Sub28_Sub1_1.anInt4887 = 4;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				Static360.method5527("Failed to enter tk4");
				return;
			}
			if (arg0.equalsIgnoreCase("tk5")) {
				Static77.method4915(5);
				if (Static17.anInt459 == 5) {
					Static360.method5527("Entered tk5");
					Static300.aClass5_Sub28_Sub1_1.anInt4887 = 5;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					return;
				}
				Static360.method5527("Failed to enter tk5");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static300.aClass5_Sub28_Sub1_1.aBoolean326 = !Static300.aClass5_Sub28_Sub1_1.aBoolean326;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				Static27.method672();
				Static360.method5527("ot=" + Static300.aClass5_Sub28_Sub1_1.aBoolean326);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static300.aClass5_Sub28_Sub1_1.aBoolean328 = !Static300.aClass5_Sub28_Sub1_1.aBoolean328;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				Static27.method672();
				Static360.method5527("gb=" + Static300.aClass5_Sub28_Sub1_1.aBoolean328);
				return;
			}
			@Pc(648) int local648;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static360.method5527("Invalid shadows value");
					return;
				}
				@Pc(638) String local638 = arg0.substring(8);
				local648 = Static359.method5525(local638) ? Static412.method5992(local638) : -1;
				if (local648 >= 0 && local648 <= 2) {
					Static300.aClass5_Sub28_Sub1_1.method4112(Static17.anInt459, local648);
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					Static27.method672();
					Static360.method5527("shadows=" + local648);
					return;
				}
				Static360.method5527("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static300.aClass5_Sub28_Sub1_1.aBoolean327 = !Static300.aClass5_Sub28_Sub1_1.aBoolean327;
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				Static507.method6976();
				Static27.method672();
				Static360.method5527("textures=" + Static300.aClass5_Sub28_Sub1_1.aBoolean327);
				return;
			}
			if (arg0.startsWith("lighting")) {
				Static300.aClass5_Sub28_Sub1_1.method4111(!Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459), Static17.anInt459);
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				Static81.method1438();
				Static507.method6976();
				Static27.method672();
				Static360.method5527("lighting=" + Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459));
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static360.method5527("Invalid buildarea value");
					return;
				}
				local109 = Static412.method5992(arg0.substring(6));
				if (local109 >= 0 && local109 <= Static509.method6985(Static193.anInt3735)) {
					Static300.aClass5_Sub28_Sub1_1.anInt4869 = local109;
					Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
					Static495.aBoolean612 = false;
					Static360.method5527("maxbuildarea=" + Static300.aClass5_Sub28_Sub1_1.anInt4869);
					return;
				}
				Static360.method5527("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static360.method5527("Invalid particles value");
					return;
				}
				Static296.method4924(Static412.method5992(arg0.substring(13)));
				Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
				Static495.aBoolean612 = false;
				Static360.method5527("particles=" + Static337.method5257());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static360.method5527("Invalid rect_debug value");
					return;
				}
				Static405.anInt7237 = Static412.method5992(arg0.substring(10).trim());
				Static360.method5527("rect_debug=" + Static405.anInt7237);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static525.aBoolean645 = true;
				Static360.method5527("qa_op_test=" + Static525.aBoolean645);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static222.aBoolean623 = !Static222.aBoolean623;
				Static360.method5527("clipcomponents=" + Static222.aBoolean623);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(925) boolean local925 = Static110.aClass62_15.method7031();
				if (Static194.method3241(!local925)) {
					if (local925) {
						Static360.method5527("Bloom disabled");
						return;
					}
					Static360.method5527("Bloom enabled");
					return;
				}
				Static360.method5527("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static457.aBoolean567) {
					Static457.aBoolean567 = true;
					Static360.method5527("Forced tweening ENABLED!");
					return;
				}
				Static457.aBoolean567 = false;
				Static360.method5527("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static2.aBoolean3) {
					Static360.method5527("Shift-click ENABLED!");
					Static2.aBoolean3 = true;
					return;
				}
				Static360.method5527("Shift-click disabled.");
				Static2.aBoolean3 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static360.method5527("x:" + (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7) + " z:" + (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static360.method5527("Height: " + Static248.aClass131Array4[Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91].ba(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static533.aClass117_228.method2983();
				Static533.aClass117_228.method2952();
				Static196.aClass274_1.method6378();
				Static358.aClass246_3.method5846();
				Static457.method6380();
				Static360.method5527("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static110.aClass62_15.method7000()) {
					local109 = Integer.parseInt(arg0.substring(3));
					if (local109 < 1) {
						local109 = 1;
					} else if (local109 > 4) {
						local109 = 4;
					}
					Static453.anInt7860 = local109;
					Static110.aClass62_15.method6997(Static453.anInt7860);
					Static110.aClass62_15.method7001(0);
					Static360.method5527("Render cores now: " + Static453.anInt7860);
					return;
				}
				Static360.method5527("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static360.method5527("I(s): " + Static481.aClass288_65.method6738() + "/" + Static481.aClass288_65.method6734());
				Static360.method5527("I(m): " + Static291.aClass288_41.method6738() + "/" + Static291.aClass288_41.method6734());
				Static360.method5527("O(s): " + Static451.aClass67_2.aClass225_1.method5539() + "/" + Static451.aClass67_2.aClass225_1.method5544());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static360.method5527("Pos: " + Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 + "," + ((Static367.anInt6861 >> 7) + Static515.anInt3214 >> 6) + "," + ((Static364.anInt6817 >> 7) + Static338.anInt6353 >> 6) + "," + ((Static367.anInt6861 >> 7) + Static515.anInt3214 & 0x3F) + "," + (Static338.anInt6353 + (Static364.anInt6817 >> 7) & 0x3F) + " Height: " + (Static191.method5464(Static367.anInt6861, Static364.anInt6817, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91) - Static182.anInt3520));
				Static360.method5527("Look: " + Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91 + "," + (Static515.anInt3214 + Static164.anInt3309 >> 6) + "," + (Static484.anInt8947 + Static338.anInt6353 >> 6) + "," + (Static164.anInt3309 + Static515.anInt3214 & 0x3F) + "," + (Static338.anInt6353 + Static484.anInt8947 & 0x3F) + " Height: " + (Static191.method5464(Static164.anInt3309, Static484.anInt8947, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91) - Static159.anInt3262));
				return;
			}
			if (arg0.equals("showocc")) {
				Static250.aBoolean348 = !Static250.aBoolean348;
				Static27.method672();
				Static360.method5527("showocc=" + Static250.aBoolean348);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static307.aBoolean415 = !Static307.aBoolean415;
				Static27.method672();
				Static360.method5527("forcewallocc=" + Static307.aBoolean415);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static424.aBoolean534 = !Static424.aBoolean534;
				Static110.aClass62_15.method7027(Static424.aBoolean534);
				Static187.method3149();
				Static360.method5527("showprofiling=" + Static424.aBoolean534);
				return;
			}
			if (arg0.startsWith("performancetest")) {
				local109 = -1;
				local648 = 1000;
				if (arg0.length() > 15) {
					@Pc(1377) String[] local1377 = Static514.method7107(' ', arg0);
					try {
						if (local1377.length > 1) {
							local648 = Integer.parseInt(local1377[1]);
						}
					} catch (@Pc(1388) Throwable local1388) {
					}
					try {
						if (local1377.length > 2) {
							local109 = Integer.parseInt(local1377[2]);
						}
					} catch (@Pc(1399) Throwable local1399) {
					}
				}
				if (local109 == -1) {
					Static360.method5527("Java toolkit: " + Static261.method4376(0, local648));
					Static360.method5527("SSE toolkit:  " + Static261.method4376(2, local648));
					Static360.method5527("D3D toolkit:  " + Static261.method4376(3, local648));
					Static360.method5527("GL toolkit:   " + Static261.method4376(1, local648));
					return;
				}
				Static360.method5527("Performance: " + Static261.method4376(Static17.anInt459, local648));
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(1473) Class68 local1473 = Static110.aClass62_15.method7016();
				Static360.method5527("Vendor: " + local1473.anInt2182);
				Static360.method5527("Name: " + local1473.aString31);
				Static360.method5527("Version: " + local1473.anInt2183);
				Static360.method5527("Device: " + local1473.aString30);
				Static360.method5527("Driver Version: " + local1473.aLong62);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static360.aBoolean478 = !Static360.aBoolean478;
				Static360.method5527("nonpcs=" + Static360.aBoolean478);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static199.method3284();
				Static360.method5527("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local109 = Integer.parseInt(arg0.substring(12));
				Static139.method2597(Static3.method208(local109).aString26, local109);
				Static360.method5527("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static360.method5527("w: " + Static212.aClass43_2.anInt1149);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static415.method5995(Static450.aClass236_76);
				Static164.aClass5_Sub3_Sub1_2.method4192(0);
				local109 = Static164.aClass5_Sub3_Sub1_2.anInt4960;
				local648 = arg0.indexOf(" ", 4);
				Static164.aClass5_Sub3_Sub1_2.method4208(arg0.substring(3, local648));
				Static139.method2599(Static164.aClass5_Sub3_Sub1_2, arg0.substring(local648));
				Static164.aClass5_Sub3_Sub1_2.method4170(Static164.aClass5_Sub3_Sub1_2.anInt4960 - local109);
				return;
			}
			if (arg0.equals("heap")) {
				Static360.method5527("Heap: " + Static193.anInt3735 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static520.method7265();
				Static360.method5527("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local109 = 0; local109 < Static481.anIntArray650.length; local109++) {
					if (Static466.aBooleanArray34[local109]) {
						Static481.anIntArray650[local109] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static481.anIntArray650[local109] *= -1;
						}
					}
				}
				Static520.method7265();
				Static360.method5527("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static533.aBoolean651 = true;
				Static457.method6380();
				Static360.method5527("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static533.aBoolean651 = false;
				Static457.method6380();
				Static360.method5527("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static452.method6364();
				Static360.method5527("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static360.method5527(Static308.method5030() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local109 = Integer.parseInt(arg0.substring(9));
				if (local109 >= 0 && local109 <= 4) {
					Static300.aClass5_Sub28_Sub1_1.anInt4868 = local109;
				}
				Static360.method5527("cpuusage=" + Static300.aClass5_Sub28_Sub1_1.anInt4868);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local109 = Integer.parseInt(arg0.substring(17));
				Static360.method5527("varpbit=" + Static540.aClass242_1.method5717(local109));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local109 = Integer.parseInt(arg0.substring(14));
				Static360.method5527("varp=" + Static540.aClass242_1.method5716(local109));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static510.method6990(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static510.method6990(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1854) String[] local1854 = Static514.method7107(' ', arg0.substring(12));
				if (local1854.length >= 2) {
					local648 = local1854.length <= 2 ? 0 : Integer.parseInt(local1854[2]);
					Static511.method7084(local1854[0], local648, local1854[1]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static266.method4400();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static266.method4411();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static266.method4411();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local109 = Integer.parseInt(arg0.substring(8));
				Static110.aClass62_15.method6996(local109);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static360.method5527("Active streams: " + Static373.aClass5_Sub15_Sub2_1.method4872());
				return;
			}
			if (arg0.equals("autosetup")) {
				Static300.aClass5_Sub28_Sub1_1.method4134();
				Static360.method5527("Complete. Toolkit now: " + Static17.anInt459);
				return;
			}
			if (arg0.equals("errormessage")) {
				Static360.method5527(Static263.aClient1.method1265());
				return;
			}
			if (Static389.anInt7024 == 9) {
				Static415.method5995(Static465.aClass236_81);
				Static164.aClass5_Sub3_Sub1_2.method4192(arg0.length() + 3);
				Static164.aClass5_Sub3_Sub1_2.method4192(arg2 ? 1 : 0);
				Static164.aClass5_Sub3_Sub1_2.method4192(arg1 ? 1 : 0);
				Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
			}
			if (arg0.startsWith("fps ") && Static124.aClass199_3 != Static134.aClass199_4) {
				Static211.method3426(Static412.method5992(arg0.substring(4)));
				return;
			}
			if (Static389.anInt7024 != 9) {
				Static360.method5527("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(2029) Exception local2029) {
			Static360.method5527("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!bda;I)V")
	public static void method4044(@OriginalArg(0) Class15_Sub2_Sub1_Sub1 arg0) {
		@Pc(11) Class5_Sub19 local11 = (Class5_Sub19) Static484.aClass42_43.method1109((long) arg0.anInt4745);
		if (local11 == null) {
			return;
		}
		if (local11.aClass5_Sub15_Sub1_2 != null) {
			Static373.aClass5_Sub15_Sub2_1.method4871(local11.aClass5_Sub15_Sub1_2);
			local11.aClass5_Sub15_Sub1_2 = null;
		}
		local11.method7425();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(IIBII)V")
	public static void method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg2 >= arg0) {
			for (local14 = arg0; local14 < arg2; local14++) {
				Static352.anIntArrayArray51[local14][arg1] = arg3;
			}
		} else {
			for (local14 = arg2; local14 < arg0; local14++) {
				Static352.anIntArrayArray51[local14][arg1] = arg3;
			}
		}
	}
}
