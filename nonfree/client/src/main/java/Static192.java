import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "[I")
	public static int[] anIntArray722;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!pt;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
	public static boolean aBoolean276;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_49 = new Class32("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "[I")
	public static final int[] anIntArray723 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString41 = "";

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public static void method3297(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub10_Sub2 local10 = Static217.method3611(arg0, 2);
		local10.method859();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3298(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static17.aClass117_1 == Static141.aClass117_7 && Static303.anInt5133 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static379.aBoolean456 = true;
				Static210.method3525("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static379.aBoolean456 = false;
				Static210.method3525("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static337.anInt5767 = 0;
				Static89.anInt1712 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static163.aClass154_4.method3488();
				Static210.method3525("Text coords cleared");
				return;
			}
			@Pc(77) int local77;
			@Pc(96) int local96;
			@Pc(86) Runtime local86;
			if (arg1.equalsIgnoreCase("gc")) {
				Static231.method3768();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local86 = Runtime.getRuntime();
				local96 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static210.method3525("mem=" + local96 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static231.method3768();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local86 = Runtime.getRuntime();
				local96 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static210.method3525("Memory before cleanup=" + local96 + "k");
				Static82.method1233();
				Static231.method3768();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static210.method3525("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static210.method3525("Number of player models in cache:" + Static291.method4410());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static210.method3525("Dropped client connection");
				if (Static391.anInt6627 == 30) {
					Static17.method320();
				} else if (Static391.anInt6627 == 25) {
					Static55.aBoolean87 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static333.aClass106_2.method2689();
				Static210.method3525("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static333.aClass106_2.method2697();
				Static210.method3525("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static359.aClass111_5.method2797();
				Static88.aClass221_1.method4797();
				Static333.aClass106_2.method2695();
				Static210.method3525("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static133.method2606();
				Static51.method869();
				Static210.method3525("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static145.method4675(1, -1, -1, false);
				if (Static162.method2888() != 1) {
					Static210.method3525("wm1 failed");
					return;
				}
				Static210.method3525("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static145.method4675(2, -1, -1, false);
				if (Static162.method2888() == 2) {
					Static210.method3525("wm2 succeeded");
					return;
				}
				Static210.method3525("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static145.method4675(3, 1024, 768, false);
				if (Static162.method2888() == 3) {
					Static210.method3525("wm3 succeeded");
					return;
				}
				Static210.method3525("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static150.method2787(0);
				if (Static62.anInt1261 == 0) {
					Static210.method3525("Entered tk0");
					Static182.anInt3879 = 0;
					Static164.method2916(Static359.aClass111_5);
					Static64.aBoolean92 = false;
					return;
				}
				Static210.method3525("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static150.method2787(1);
				if (Static62.anInt1261 != 1) {
					Static210.method3525("Failed to enter tk1");
					return;
				}
				Static210.method3525("Entered tk1");
				Static182.anInt3879 = 1;
				Static164.method2916(Static359.aClass111_5);
				Static64.aBoolean92 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static150.method2787(2);
				if (Static62.anInt1261 != 2) {
					Static210.method3525("Failed to enter tk2");
					return;
				}
				Static210.method3525("Entered tk2");
				Static182.anInt3879 = 2;
				Static164.method2916(Static359.aClass111_5);
				Static64.aBoolean92 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static150.method2787(3);
				if (Static62.anInt1261 != 3) {
					Static210.method3525("Failed to enter tk3");
					return;
				}
				Static210.method3525("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static187.aBoolean270 = !Static187.aBoolean270;
				Static164.method2916(Static359.aClass111_5);
				Static64.aBoolean92 = false;
				Static133.method2606();
				Static210.method3525("ot=" + Static187.aBoolean270);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static358.aBoolean142 = !Static358.aBoolean142;
				Static164.method2916(Static359.aClass111_5);
				Static64.aBoolean92 = false;
				Static133.method2606();
				Static210.method3525("gb=" + Static358.aBoolean142);
				return;
			}
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static210.method3525("Invalid shadows value");
					return;
				}
				@Pc(510) String local510 = arg1.substring(8);
				@Pc(520) int local520 = Static34.method626(local510) ? Static189.method5666(local510) : -1;
				if (local520 >= 0 && local520 <= 2) {
					Static202.anInt3721 = local520;
					Static164.method2916(Static359.aClass111_5);
					Static64.aBoolean92 = false;
					Static133.method2606();
					Static210.method3525("shadows=" + local520);
					return;
				}
				Static210.method3525("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static210.method3525("Invalid buildarea value");
					return;
				}
				local77 = Static189.method5666(arg1.substring(6));
				if (local77 >= 0 && local77 <= Static6.method149(Static253.anInt4468)) {
					Static81.anInt1473 = local77;
					Static164.method2916(Static359.aClass111_5);
					Static64.aBoolean92 = false;
					Static210.method3525("maxbuildarea=" + Static81.anInt1473);
					return;
				}
				Static210.method3525("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static210.method3525("Invalid particles value");
					return;
				}
				Static133.method2603(Static189.method5666(arg1.substring(13)));
				Static164.method2916(Static359.aClass111_5);
				Static64.aBoolean92 = false;
				Static210.method3525("particles=" + Static232.method3779());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static210.method3525("Invalid rect_debug value");
					return;
				}
				Static301.anInt5345 = Static189.method5666(arg1.substring(10).trim());
				Static210.method3525("rect_debug=" + Static301.anInt5345);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static226.aBoolean445 = true;
				Static210.method3525("qa_op_test=" + Static226.aBoolean445);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static21.aBoolean35 = !Static21.aBoolean35;
				Static210.method3525("clipcomponents=" + Static21.aBoolean35);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(710) boolean local710 = Static111.aClass63_3.method1974();
				if (Static3.method78(!local710)) {
					if (local710) {
						Static210.method3525("Bloom disabled");
						return;
					}
					Static210.method3525("Bloom enabled");
					return;
				}
				Static210.method3525("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static298.aBoolean384) {
					Static298.aBoolean384 = false;
					Static210.method3525("Forced tweening disabled.");
					return;
				}
				Static298.aBoolean384 = true;
				Static210.method3525("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static250.aBoolean335) {
					Static210.method3525("Shift-click ENABLED!");
					Static250.aBoolean335 = true;
					return;
				}
				Static210.method3525("Shift-click disabled.");
				Static250.aBoolean335 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static210.method3525("x:" + (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7) + " z:" + (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static210.method3525("Height: " + Static350.aClass107Array4[Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69].method4685(Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static263.aClass171_64.method3743();
				Static263.aClass171_64.method3763();
				Static304.aClass206_122.method4412();
				Static158.aClass226_1.method4907();
				Static51.method869();
				Static210.method3525("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static111.aClass63_3.method2013()) {
					local77 = Integer.parseInt(arg1.substring(3));
					if (local77 < 1) {
						local77 = 1;
					} else if (local77 > 4) {
						local77 = 4;
					}
					Static295.anInt5086 = local77;
					Static111.aClass63_3.method2004(Static295.anInt5086);
					Static111.aClass63_3.method2044(0);
					Static210.method3525("Render cores now: " + Static295.anInt5086);
					return;
				}
				Static210.method3525("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static210.method3525("I(s): " + Static333.aClass160_54.method3600() + "/" + Static333.aClass160_54.method3593());
				Static210.method3525("I(m): " + Static340.aClass160_58.method3600() + "/" + Static340.aClass160_58.method3593());
				Static210.method3525("O(s): " + Static15.aClass81_1.aClass140_1.method3170() + "/" + Static15.aClass81_1.aClass140_1.method3171());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static210.method3525("Pos: " + Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 + "," + (Static28.anInt606 + (Static224.anInt4006 >> 7) >> 6) + "," + ((Static51.anInt1057 >> 7) + Static319.anInt5425 >> 6) + "," + (Static28.anInt606 + (Static224.anInt4006 >> 7) & 0x3F) + "," + (Static319.anInt5425 + (Static51.anInt1057 >> 7) & 0x3F) + " Height: " + (Static170.method3006(Static224.anInt4006, Static51.anInt1057, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69) - Static285.anInt4940));
				Static210.method3525("Look: " + Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 + "," + (Static139.anInt2784 + Static28.anInt606 >> 6) + "," + (Static296.anInt5089 + Static319.anInt5425 >> 6) + "," + (Static28.anInt606 + Static139.anInt2784 & 0x3F) + "," + (Static296.anInt5089 + Static319.anInt5425 & 0x3F) + " Height: " + (Static170.method3006(Static139.anInt2784, Static296.anInt5089, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69) - Static177.anInt3412));
				return;
			}
			if (arg1.equals("showocc")) {
				Static137.aBoolean354 = !Static137.aBoolean354;
				Static133.method2606();
				Static210.method3525("showocc=" + Static137.aBoolean354);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static57.aBoolean271 = !Static57.aBoolean271;
				Static111.aClass63_3.method1992(Static57.aBoolean271);
				Static271.method4163();
				Static210.method3525("showprofiling=" + Static57.aBoolean271);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static209.aBoolean292 = !Static209.aBoolean292;
				Static210.method3525("nonpcs=" + Static209.aBoolean292);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static105.method2215();
				Static210.method3525("auto world selected");
				return;
			}
			if (arg1.equals("heap")) {
				Static210.method3525("Heap: " + Static253.anInt4468 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static37.method675();
				Static210.method3525("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local77 = 0; local77 < Static330.anIntArray1157.length; local77++) {
					if (Static88.aBooleanArray13[local77]) {
						Static330.anIntArray1157[local77] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static330.anIntArray1157[local77] *= -1;
						}
					}
				}
				Static37.method675();
				Static210.method3525("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static359.aBoolean435 = true;
				Static51.method869();
				Static210.method3525("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static359.aBoolean435 = false;
				Static51.method869();
				Static210.method3525("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static206.method3485();
				Static210.method3525("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static210.method3525(Static355.method5206() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local77 = Integer.parseInt(arg1.substring(9));
				if (local77 >= 0 && local77 <= 4) {
					Static29.anInt617 = local77;
				}
				Static210.method3525("cpuusage=" + Static29.anInt617);
				return;
			}
			if (Static391.anInt6627 == 30) {
				Static216.method3597(Static45.aClass11_16);
				Static372.aClass2_Sub16_Sub2_4.method5358(arg1.length() + 2);
				Static372.aClass2_Sub16_Sub2_4.method5358(arg0 ? 1 : 0);
				Static372.aClass2_Sub16_Sub2_4.method5362(arg1);
			}
			if (arg1.startsWith("fps ") && Static141.aClass117_7 != Static17.aClass117_1) {
				Static199.method3356(Static189.method5666(arg1.substring(4)));
				return;
			}
			if (Static391.anInt6627 != 30) {
				Static210.method3525("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1358) Exception local1358) {
			Static210.method3525("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nn;")
	public static RuntimeException_Sub1 method3300(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString49 = local12.aString49 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lclient!ae;II)V")
	public static void method3301(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class4 local9 = arg0[local3];
			if (local9 != null && local9.anInt88 == arg1 && !Static45.method788(local9)) {
				if (local9.anInt125 == 0) {
					method3301(arg0, local9.anInt94);
					if (local9.aClass4Array1 != null) {
						method3301(local9.aClass4Array1, local9.anInt94);
					}
					@Pc(46) Class2_Sub38 local46 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local9.anInt94);
					if (local46 != null) {
						Static319.method4719(local46.anInt4976);
					}
				}
				if (local9.anInt125 == 6 && local9.anInt124 != -1) {
					@Pc(66) Class202 local66 = Static36.aClass236_1.method5396(local9.anInt124);
					if (local66 != null) {
						local9.anInt117 += Static64.anInt1278;
						while (local66.anIntArray973[local9.anInt85] < local9.anInt117) {
							local9.anInt117 -= local66.anIntArray973[local9.anInt85];
							local9.anInt85++;
							if (local9.anInt85 >= local66.anIntArray974.length) {
								local9.anInt85 -= local66.anInt4942;
								if (local9.anInt85 < 0 || local9.anInt85 >= local66.anIntArray974.length) {
									local9.anInt85 = 0;
								}
							}
							local9.anInt105 = local9.anInt85 + 1;
							if (local9.anInt105 >= local66.anIntArray974.length) {
								local9.anInt105 -= local66.anInt4942;
								if (local9.anInt105 < 0 || local66.anIntArray974.length <= local9.anInt105) {
									local9.anInt105 = -1;
								}
							}
							Static51.method872(local9);
						}
					}
				}
			}
		}
	}
}
