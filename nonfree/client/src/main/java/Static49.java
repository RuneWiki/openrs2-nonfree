import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!ak;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!wp;")
	public static final Class217 aClass217_1 = new Class217();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public static int method1300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static39.method917(arg0 - 1, arg1 + -1) + Static39.method917(arg0 + 1, arg1 + -1) + Static39.method917(arg0 - 1, arg1 + 1) + Static39.method917(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static39.method917(arg0 - 1, arg1) + Static39.method917(arg0 + 1, arg1) + Static39.method917(arg0, arg1 - 1) + Static39.method917(arg0, arg1 + 1);
		@Pc(85) int local85 = Static39.method917(arg0, arg1);
		return local85 / 4 + local42 / 16 + local72 / 8;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1301() {
		for (@Pc(18) Class1_Sub23 local18 = (Class1_Sub23) Static188.aClass16_22.method410(); local18 != null; local18 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			if (Static228.method4254(local18.anInt3588)) {
				Static252.method4576(local18);
			}
		}
		if (Static115.anInt2635 == 1) {
			Static146.aBoolean308 = false;
			Static8.method5018(Static282.anInt6601, Static198.anInt1219, Static339.anInt6506, Static210.anInt4473);
			return;
		}
		Static8.method5018(Static282.anInt6601, Static198.anInt1219, Static339.anInt6506, Static210.anInt4473);
		@Pc(52) int local52 = Static90.aClass63_3.method1746(Static345.aClass34_190.method1285(Static259.anInt2907));
		for (@Pc(57) Class1_Sub23 local57 = (Class1_Sub23) Static188.aClass16_22.method410(); local57 != null; local57 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			@Pc(63) int local63 = Static100.method3994(local57);
			if (local52 < local63) {
				local52 = local63;
			}
		}
		Static282.anInt6601 = (Static337.aBoolean630 ? 26 : 22) + Static115.anInt2635 * 16;
		Static198.anInt1219 = local52 + 8;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class17_Sub3 local13 = local7.aClass17_Sub3_1;
		@Pc(16) Class17_Sub3 local16 = local7.aClass17_Sub3_2;
		if (local13 != null) {
			local13.anInt5587 = local13.anInt5587 * arg3 / 16;
			local13.anInt5581 = local13.anInt5581 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5587 = local16.anInt5587 * arg3 / 16;
			local16.anInt5581 = local16.anInt5581 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1304(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static63.anInt5669 == 0 && Static342.anInt2998 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static33.aBoolean105 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static33.aBoolean105 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static234.anInt4773 = 0;
				Static178.anInt3855 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static64.aClass217_2.method5688();
			}
			@Pc(57) int local57;
			@Pc(68) Runtime local68;
			@Pc(77) int local77;
			if (arg1.equalsIgnoreCase("gc")) {
				Static332.method5395();
				for (local57 = 0; local57 < 10; local57++) {
					System.gc();
				}
				local68 = Runtime.getRuntime();
				local77 = (int) ((local68.totalMemory() - local68.freeMemory()) / 1024L);
				Static344.method5517("mem=" + local77 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static332.method5395();
				for (local57 = 0; local57 < 10; local57++) {
					System.gc();
				}
				local68 = Runtime.getRuntime();
				local77 = (int) ((local68.totalMemory() - local68.freeMemory()) / 1024L);
				Static344.method5517("Memory before cleanup=" + local77 + "k");
				Static192.method3721();
				Static332.method5395();
				for (@Pc(133) int local133 = 0; local133 < 10; local133++) {
					System.gc();
				}
				local77 = (int) ((local68.totalMemory() - local68.freeMemory()) / 1024L);
				Static344.method5517("Memory after cleanup=" + local77 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static344.method5517("Number of player models in cache:" + Static36.method877());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				if (Static295.anInt5811 == 30) {
					Static198.method886();
				} else if (Static295.anInt5811 == 25) {
					Static225.aBoolean459 = true;
				}
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static283.aClass186_3.method4886();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static283.aClass186_3.method4890();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static15.aClass143_1.method3893();
				Static7.aClass148_1.method4119();
				Static283.aClass186_3.method4891();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static23.method657();
				Static299.method1010();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static30.method888(-1, -1, 1, false);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static30.method888(-1, -1, 2, false);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static30.method888(768, 1024, 3, false);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static259.method2702(0);
				Static204.anInt4306 = 0;
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static259.method2702(1);
				Static204.anInt4306 = 1;
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static259.method2702(2);
				Static204.anInt4306 = 2;
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static259.method2702(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static336.aBoolean628 = !Static336.aBoolean628;
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
				Static23.method657();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static348.aBoolean657 = !Static348.aBoolean657;
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
				Static23.method657();
			}
			if (arg1.startsWith("shadows ")) {
				Static163.anInt3549 = Static89.method1943(arg1.substring(8));
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
				Static23.method657();
			}
			if (arg1.startsWith("setba")) {
				Static324.anInt6232 = Static89.method1943(arg1.substring(6));
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static183.method3606(Static89.method1943(arg1.substring(13)));
				Static348.method5579(Static15.aClass143_1);
				Static269.aBoolean537 = false;
			}
			if (arg1.startsWith("fps ") && Static63.anInt5669 != 0) {
				Static77.method1754(Static89.method1943(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static262.anInt5352 = Static89.method1943(arg1.substring(10).trim());
				Static344.method5517("rect_debug=" + Static262.anInt5352);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static185.aBoolean369 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static81.aBoolean497 = !Static81.aBoolean497;
				Static344.method5517("clipcomponents=" + Static81.aBoolean497);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(466) boolean local466 = Static208.aClass32_11.method2166();
				if (!Static159.method3232(!local466)) {
					Static344.method5517("Failed to enable bloom");
				} else if (local466) {
					Static344.method5517("Bloom disabled");
				} else {
					Static344.method5517("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static159.aBoolean329) {
					Static159.aBoolean329 = false;
					Static344.method5517("Forced tweening disabled.");
				} else {
					Static159.aBoolean329 = true;
					Static344.method5517("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static39.aBoolean120) {
					Static344.method5517("Shift-click disabled.");
					Static39.aBoolean120 = false;
				} else {
					Static344.method5517("Shift-click ENABLED!");
					Static39.aBoolean120 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static344.method5517("x:" + (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7) + " z:" + (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static344.method5517("Height: " + Static298.aClass53Array3[Static242.anInt6745].method2785(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7, Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static193.aClass216_64.method5645();
				Static193.aClass216_64.method5656();
				Static274.method4806();
				Static299.method1010();
			}
			if (arg1.startsWith("mc")) {
				if (Static208.aClass32_11.method2141()) {
					local57 = Integer.parseInt(arg1.substring(3));
					if (local57 < 1) {
						local57 = 1;
					} else if (local57 > 4) {
						local57 = 4;
					}
					Static131.anInt3019 = local57;
					Static208.aClass32_11.method2147(Static131.anInt3019);
					Static208.aClass32_11.method2211(0);
					Static344.method5517("Render cores now: " + Static131.anInt3019);
				} else {
					Static344.method5517("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static344.method5517("I(s): " + Static150.aClass87_29.method2478() + "/" + Static150.aClass87_29.method2476());
				Static344.method5517("I(m): " + Static82.aClass87_17.method2478() + "/" + Static82.aClass87_17.method2476());
				Static344.method5517("O(s): " + Static357.aClass18_3.method572() + "/" + Static357.aClass18_3.method575());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static344.method5517("Pos: " + Static242.anInt6745 + "," + (Static234.anInt4783 + (Static320.anInt5326 >> 7) >> 6) + "," + ((Static64.anInt1797 >> 7) + Static32.anInt2224 >> 6) + "," + (Static234.anInt4783 + (Static320.anInt5326 >> 7) & 0x3F) + "," + (Static32.anInt2224 + (Static64.anInt1797 >> 7) & 0x3F) + " Height: " + (Static94.method2022(Static64.anInt1797, Static320.anInt5326, Static242.anInt6745) - Static95.anInt2319));
				Static344.method5517("Look: " + Static242.anInt6745 + "," + (Static234.anInt4783 + Static107.anInt2549 >> 6) + "," + (Static219.anInt4615 + Static32.anInt2224 >> 6) + "," + (Static107.anInt2549 + Static234.anInt4783 & 0x3F) + "," + (Static32.anInt2224 + Static219.anInt4615 & 0x3F) + " Height: " + (Static94.method2022(Static219.anInt4615, Static107.anInt2549, Static242.anInt6745) - Static121.anInt2760));
			}
			if (arg1.equals("showocc")) {
				Static20.aBoolean82 = !Static20.aBoolean82;
				Static23.method657();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static251.aBoolean454 = !Static251.aBoolean454;
				Static208.aClass32_11.method2207(Static251.aBoolean454);
				Static18.method435();
			}
			if (arg1.equals("nonpcs")) {
				Static282.aBoolean649 = !Static282.aBoolean649;
			}
			if (arg1.equals("autoworld")) {
				Static352.method5611();
			}
			if (arg1.equals("heap")) {
				Static344.method5517("Heap: " + Static257.anInt5344 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static119.method2550();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local57 = 0; local57 < Static183.anIntArray351.length; local57++) {
					if (Static197.aBooleanArray20[local57]) {
						Static183.anIntArray351[local57] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static183.anIntArray351[local57] *= -1;
						}
					}
				}
				Static119.method2550();
			}
			if (arg1.equals("showcolmap")) {
				Static342.aBoolean288 = true;
				Static299.method1010();
			}
			if (arg1.equals("hidecolmap")) {
				Static342.aBoolean288 = false;
				Static299.method1010();
			}
			if (arg1.equals("resetcache")) {
				Static334.method5421();
			}
			if (arg1.equals("profilecpu")) {
				Static344.method5517(Static257.method4646() + "ms");
			}
			if (arg1.startsWith("cpuusage")) {
				local57 = Integer.parseInt(arg1.substring(9));
				if (local57 >= 0 && local57 <= 4) {
					Static218.anInt4605 = local57;
				}
			}
			if (Static295.anInt5811 == 30) {
				Static342.aClass1_Sub8_Sub1_7.method3229(208);
				Static342.aClass1_Sub8_Sub1_7.method4562(arg1.length() + 2);
				Static342.aClass1_Sub8_Sub1_7.method4562(arg0 ? 1 : 0);
				Static342.aClass1_Sub8_Sub1_7.method4531(arg1);
			}
		} catch (@Pc(1020) Exception local1020) {
			Static344.method5517("Whoops, something went wrong.");
		}
	}
}
