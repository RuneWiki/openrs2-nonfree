import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_17 = new Class208(46, -1);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public static int anInt671 = 16777215;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[128][128];

	@OriginalMember(owner = "client!c", name = "x", descriptor = "S")
	public static short aShort12 = 32767;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method541(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static306.aClass49_7 == Static158.aClass49_3 && Static273.anInt5130 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static25.aBoolean303 = true;
				Static375.method5958("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static25.aBoolean303 = false;
				Static375.method5958("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static195.anInt4058 = 0;
				Static372.anInt6826 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static119.aClass199_2.method4905();
				Static375.method5958("Text coords cleared");
				return;
			}
			@Pc(69) int local69;
			@Pc(88) int local88;
			@Pc(78) Runtime local78;
			if (arg0.equalsIgnoreCase("gc")) {
				Static77.method1331();
				for (local69 = 0; local69 < 10; local69++) {
					System.gc();
				}
				local78 = Runtime.getRuntime();
				local88 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static375.method5958("mem=" + local88 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static77.method1331();
				for (local69 = 0; local69 < 10; local69++) {
					System.gc();
				}
				local78 = Runtime.getRuntime();
				local88 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static375.method5958("Memory before cleanup=" + local88 + "k");
				Static60.method1151();
				Static77.method1331();
				for (@Pc(149) int local149 = 0; local149 < 10; local149++) {
					System.gc();
				}
				local88 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static375.method5958("Memory after cleanup=" + local88 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static375.method5958("Number of player models in cache:" + Static390.method6113());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static375.method5958("Dropped client connection");
				if (Static121.anInt6774 == 30) {
					Static185.method3422();
				} else if (Static121.anInt6774 == 25) {
					Static218.aBoolean316 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static364.aClass222_3.method5519();
				Static375.method5958("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static364.aClass222_3.method5525();
				Static375.method5958("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static154.aClass123_2.method3246();
				Static386.aClass226_4.method5544();
				Static364.aClass222_3.method5517();
				Static375.method5958("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static44.method598();
				Static124.method3771();
				Static375.method5958("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static314.method5081(-1, 1, false, -1);
				if (Static195.method3553() != 1) {
					Static375.method5958("wm1 failed");
					return;
				}
				Static375.method5958("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static314.method5081(-1, 2, false, -1);
				if (Static195.method3553() == 2) {
					Static375.method5958("wm2 succeeded");
					return;
				}
				Static375.method5958("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static314.method5081(1024, 3, false, 768);
				if (Static195.method3553() != 3) {
					Static375.method5958("wm3 failed");
					return;
				}
				Static375.method5958("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static364.method5791(0);
				if (Static36.anInt2910 == 0) {
					Static375.method5958("Entered tk0");
					Static232.anInt4637 = 0;
					Static237.method4219(Static154.aClass123_2);
					Static383.aBoolean489 = false;
					return;
				}
				Static375.method5958("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static364.method5791(1);
				if (Static36.anInt2910 != 1) {
					Static375.method5958("Failed to enter tk1");
					return;
				}
				Static375.method5958("Entered tk1");
				Static232.anInt4637 = 1;
				Static237.method4219(Static154.aClass123_2);
				Static383.aBoolean489 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static364.method5791(2);
				if (Static36.anInt2910 != 2) {
					Static375.method5958("Failed to enter tk2");
					return;
				}
				Static375.method5958("Entered tk2");
				Static232.anInt4637 = 2;
				Static237.method4219(Static154.aClass123_2);
				Static383.aBoolean489 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static364.method5791(3);
				if (Static36.anInt2910 == 3) {
					Static375.method5958("Entered tk3");
					return;
				}
				Static375.method5958("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static135.aBoolean205 = !Static135.aBoolean205;
				Static237.method4219(Static154.aClass123_2);
				Static383.aBoolean489 = false;
				Static44.method598();
				Static375.method5958("ot=" + Static135.aBoolean205);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static73.aBoolean126 = !Static73.aBoolean126;
				Static237.method4219(Static154.aClass123_2);
				Static383.aBoolean489 = false;
				Static44.method598();
				Static375.method5958("gb=" + Static73.aBoolean126);
				return;
			}
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static375.method5958("Invalid shadows value");
					return;
				}
				@Pc(508) String local508 = arg0.substring(8);
				@Pc(518) int local518 = Static84.method1453(local508) ? Static335.method5402(local508) : -1;
				if (local518 >= 0 && local518 <= 2) {
					Static266.anInt5047 = local518;
					Static237.method4219(Static154.aClass123_2);
					Static383.aBoolean489 = false;
					Static44.method598();
					Static375.method5958("shadows=" + local518);
					return;
				}
				Static375.method5958("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static375.method5958("Invalid buildarea value");
					return;
				}
				local69 = Static335.method5402(arg0.substring(6));
				if (local69 >= 0 && local69 <= Static185.method3421(Static199.anInt4131)) {
					Static42.anInt733 = local69;
					Static237.method4219(Static154.aClass123_2);
					Static383.aBoolean489 = false;
					Static375.method5958("maxbuildarea=" + Static42.anInt733);
					return;
				}
				Static375.method5958("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static375.method5958("Invalid particles value");
					return;
				}
				Static133.method2326(Static335.method5402(arg0.substring(13)));
				Static237.method4219(Static154.aClass123_2);
				Static383.aBoolean489 = false;
				Static375.method5958("particles=" + Static333.method5395());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static375.method5958("Invalid rect_debug value");
					return;
				}
				Static208.anInt4248 = Static335.method5402(arg0.substring(10).trim());
				Static375.method5958("rect_debug=" + Static208.anInt4248);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static119.aBoolean188 = true;
				Static375.method5958("qa_op_test=" + Static119.aBoolean188);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static233.aBoolean335 = !Static233.aBoolean335;
				Static375.method5958("clipcomponents=" + Static233.aBoolean335);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(706) boolean local706 = Static383.aClass48_9.method2542();
				if (!Static146.method2643(!local706)) {
					Static375.method5958("Failed to enable bloom");
					return;
				}
				if (!local706) {
					Static375.method5958("Bloom enabled");
					return;
				}
				Static375.method5958("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static314.aBoolean420) {
					Static314.aBoolean420 = true;
					Static375.method5958("Forced tweening ENABLED!");
					return;
				}
				Static314.aBoolean420 = false;
				Static375.method5958("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static228.aBoolean332) {
					Static375.method5958("Shift-click disabled.");
					Static228.aBoolean332 = false;
					return;
				}
				Static375.method5958("Shift-click ENABLED!");
				Static228.aBoolean332 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static375.method5958("x:" + (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7) + " z:" + (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static375.method5958("Height: " + Static128.aClass149Array1[Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73].method5837(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7, Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static324.aClass83_116.method1952();
				Static324.aClass83_116.method1969();
				Static197.aClass30_2.method535();
				Static78.aClass195_2.method4810();
				Static124.method3771();
				Static375.method5958("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static383.aClass48_9.method2519()) {
					Static375.method5958("Current toolkit doesn't support multiple cores");
					return;
				}
				local69 = Integer.parseInt(arg0.substring(3));
				if (local69 < 1) {
					local69 = 1;
				} else if (local69 > 4) {
					local69 = 4;
				}
				Static148.anInt3148 = local69;
				Static383.aClass48_9.method2478(Static148.anInt3148);
				Static383.aClass48_9.method2518(0);
				Static375.method5958("Render cores now: " + Static148.anInt3148);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static375.method5958("I(s): " + Static113.aClass41_69.method834() + "/" + Static113.aClass41_69.method824());
				Static375.method5958("I(m): " + Static46.aClass41_63.method834() + "/" + Static46.aClass41_63.method824());
				Static375.method5958("O(s): " + Static57.aClass196_1.aClass230_1.method5595() + "/" + Static57.aClass196_1.aClass230_1.method5601());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static375.method5958("Pos: " + Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 + "," + (Static279.anInt5198 + (Static145.anInt5345 >> 7) >> 6) + "," + (Static350.anInt6470 + (Static27.anInt2842 >> 7) >> 6) + "," + ((Static145.anInt5345 >> 7) + Static279.anInt5198 & 0x3F) + "," + (Static350.anInt6470 + (Static27.anInt2842 >> 7) & 0x3F) + " Height: " + (Static36.method2335(Static27.anInt2842, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, Static145.anInt5345) - Static266.anInt5034));
				Static375.method5958("Look: " + Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 + "," + (Static279.anInt5198 + Static182.anInt3889 >> 6) + "," + (Static350.anInt6470 + Static226.anInt4563 >> 6) + "," + (Static182.anInt3889 + Static279.anInt5198 & 0x3F) + "," + (Static350.anInt6470 + Static226.anInt4563 & 0x3F) + " Height: " + (Static36.method2335(Static226.anInt4563, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, Static182.anInt3889) - Static181.anInt3812));
				return;
			}
			if (arg0.equals("showocc")) {
				Static116.aBoolean184 = !Static116.aBoolean184;
				Static44.method598();
				Static375.method5958("showocc=" + Static116.aBoolean184);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static182.aBoolean278 = !Static182.aBoolean278;
				Static44.method598();
				Static375.method5958("forcewallocc=" + Static182.aBoolean278);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static42.aBoolean52 = !Static42.aBoolean52;
				Static383.aClass48_9.method2504(Static42.aBoolean52);
				Static189.method508();
				Static375.method5958("showprofiling=" + Static42.aBoolean52);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static92.aBoolean145 = !Static92.aBoolean145;
				Static375.method5958("nonpcs=" + Static92.aBoolean145);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static245.method4310();
				Static375.method5958("auto world selected");
				return;
			}
			if (arg0.equals("heap")) {
				Static375.method5958("Heap: " + Static199.anInt4131 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static209.method3787();
				Static375.method5958("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local69 = 0; local69 < Static318.anIntArray509.length; local69++) {
					if (Static137.aBooleanArray7[local69]) {
						Static318.anIntArray509[local69] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static318.anIntArray509[local69] *= -1;
						}
					}
				}
				Static209.method3787();
				Static375.method5958("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static231.aBoolean334 = true;
				Static124.method3771();
				Static375.method5958("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static231.aBoolean334 = false;
				Static124.method3771();
				Static375.method5958("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static227.method4131();
				Static375.method5958("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static375.method5958(Static111.method2019() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local69 = Integer.parseInt(arg0.substring(9));
				if (local69 >= 0 && local69 <= 4) {
					Static71.anInt1579 = local69;
				}
				Static375.method5958("cpuusage=" + Static71.anInt1579);
				return;
			}
			if (Static121.anInt6774 == 30) {
				Static77.method1332(Static364.aClass183_105);
				Static76.aClass2_Sub24_Sub2_7.method5746(arg0.length() + 2);
				Static76.aClass2_Sub24_Sub2_7.method5746(arg1 ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
			}
			if (arg0.startsWith("fps ") && Static306.aClass49_7 != Static158.aClass49_3) {
				Static81.method1388(Static335.method5402(arg0.substring(4)));
				return;
			}
			if (Static121.anInt6774 != 30) {
				Static375.method5958("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1383) Exception local1383) {
			Static375.method5958("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIIIII)V")
	public static void method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static273.method4589(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (Static317.anInt5793 <= arg3 && Static69.anInt1551 >= arg3) {
			@Pc(52) int[] local52 = Static152.anIntArrayArray30[arg3];
			local61 = Static86.method1459(Static121.anInt6758, arg0 - arg5, Static179.anInt3768);
			local70 = Static86.method1459(Static121.anInt6758, arg0 + arg5, Static179.anInt3768);
			local79 = Static86.method1459(Static121.anInt6758, arg0 - local15, Static179.anInt3768);
			local88 = Static86.method1459(Static121.anInt6758, arg0 + local15, Static179.anInt3768);
			Static307.method5019(local52, local79, arg2, local61);
			Static307.method5019(local52, local88, arg1, local79);
			Static307.method5019(local52, local70, arg2, local88);
		}
		while (local21 > local10) {
			local38 += 2;
			local36 += 2;
			local34 += local38;
			local24 += local36;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				local34 -= local31 << 1;
				Static226.anIntArray378[local31] = local10;
			}
			local10++;
			@Pc(208) int local208;
			@Pc(217) int local217;
			@Pc(228) int[] local228;
			@Pc(157) int local157;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local157 = arg3 - local21;
				local61 = arg3 + local21;
				if (local61 >= Static317.anInt5793 && Static69.anInt1551 >= local157) {
					if (local21 < local15) {
						local70 = Static226.anIntArray378[local21];
						local79 = Static86.method1459(Static121.anInt6758, arg0 + local10, Static179.anInt3768);
						local88 = Static86.method1459(Static121.anInt6758, arg0 - local10, Static179.anInt3768);
						local208 = Static86.method1459(Static121.anInt6758, local70 + arg0, Static179.anInt3768);
						local217 = Static86.method1459(Static121.anInt6758, arg0 - local70, Static179.anInt3768);
						if (local61 <= Static69.anInt1551) {
							local228 = Static152.anIntArrayArray30[local61];
							Static307.method5019(local228, local217, arg2, local88);
							Static307.method5019(local228, local208, arg1, local217);
							Static307.method5019(local228, local79, arg2, local208);
						}
						if (Static317.anInt5793 <= local157) {
							local228 = Static152.anIntArrayArray30[local157];
							Static307.method5019(local228, local217, arg2, local88);
							Static307.method5019(local228, local208, arg1, local217);
							Static307.method5019(local228, local79, arg2, local208);
						}
					} else {
						local70 = Static86.method1459(Static121.anInt6758, arg0 + local10, Static179.anInt3768);
						local79 = Static86.method1459(Static121.anInt6758, arg0 - local10, Static179.anInt3768);
						if (Static69.anInt1551 >= local61) {
							Static307.method5019(Static152.anIntArrayArray30[local61], local70, arg2, local79);
						}
						if (Static317.anInt5793 <= local157) {
							Static307.method5019(Static152.anIntArrayArray30[local157], local70, arg2, local79);
						}
					}
				}
			}
			local157 = arg3 - local10;
			local61 = local10 + arg3;
			if (local61 >= Static317.anInt5793 && Static69.anInt1551 >= local157) {
				local70 = local21 + arg0;
				local79 = arg0 - local21;
				if (local70 >= Static179.anInt3768 && local79 <= Static121.anInt6758) {
					local70 = Static86.method1459(Static121.anInt6758, local70, Static179.anInt3768);
					local79 = Static86.method1459(Static121.anInt6758, local79, Static179.anInt3768);
					if (local10 < local15) {
						local88 = local31 >= local10 ? local31 : Static226.anIntArray378[local10];
						local208 = Static86.method1459(Static121.anInt6758, local88 + arg0, Static179.anInt3768);
						local217 = Static86.method1459(Static121.anInt6758, arg0 - local88, Static179.anInt3768);
						if (Static69.anInt1551 >= local61) {
							local228 = Static152.anIntArrayArray30[local61];
							Static307.method5019(local228, local217, arg2, local79);
							Static307.method5019(local228, local208, arg1, local217);
							Static307.method5019(local228, local70, arg2, local208);
						}
						if (local157 >= Static317.anInt5793) {
							local228 = Static152.anIntArrayArray30[local157];
							Static307.method5019(local228, local217, arg2, local79);
							Static307.method5019(local228, local208, arg1, local217);
							Static307.method5019(local228, local70, arg2, local208);
						}
					} else {
						if (local61 <= Static69.anInt1551) {
							Static307.method5019(Static152.anIntArrayArray30[local61], local70, arg2, local79);
						}
						if (Static317.anInt5793 <= local157) {
							Static307.method5019(Static152.anIntArrayArray30[local157], local70, arg2, local79);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(7, arg1);
		local8.method1198();
		local8.anInt1465 = arg0;
	}
}
