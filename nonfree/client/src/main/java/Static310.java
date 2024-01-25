import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!to", name = "J", descriptor = "Lclient!ra;")
	public static Class170 aClass170_106;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "Lclient!ra;")
	public static Class170 aClass170_107;

	@OriginalMember(owner = "client!to", name = "S", descriptor = "I")
	public static int anInt5949;

	@OriginalMember(owner = "client!to", name = "N", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!to", name = "R", descriptor = "I")
	public static int anInt5948 = 0;

	@OriginalMember(owner = "client!to", name = "U", descriptor = "I")
	public static int anInt5951 = 1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II[Lclient!jf;)V")
	public static void method5280(@OriginalArg(0) int arg0, @OriginalArg(2) Class96[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class96 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt2929 && (!local13.aBoolean197 || !Static43.method974(local13))) {
				if (local13.anInt2933 == 0) {
					if (!local13.aBoolean197 && Static43.method974(local13) && Static287.aClass96_17 != local13) {
						continue;
					}
					method5280(local13.anInt2877, arg1);
					if (local13.aClass96Array1 != null) {
						method5280(local13.anInt2877, local13.aClass96Array1);
					}
					@Pc(59) Class5_Sub40 local59 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local13.anInt2877);
					if (local59 != null) {
						Static194.method3497(local59.anInt6233);
					}
				}
				if (local13.anInt2933 == 6) {
					@Pc(92) int local92;
					if (local13.anInt2888 != -1 || local13.anInt2936 != -1) {
						@Pc(87) boolean local87 = Static302.method5141(local13);
						if (local87) {
							local92 = local13.anInt2936;
						} else {
							local92 = local13.anInt2888;
						}
						if (local92 != -1) {
							@Pc(104) Class17 local104 = Static261.method4492(local92);
							if (local104 != null) {
								local13.anInt2892 += Static346.anInt6449;
								while (local104.anIntArray26[local13.anInt2950] < local13.anInt2892) {
									local13.anInt2892 -= local104.anIntArray26[local13.anInt2950];
									local13.anInt2950++;
									if (local104.anIntArray24.length <= local13.anInt2950) {
										local13.anInt2950 -= local104.anInt520;
										if (local13.anInt2950 < 0 || local13.anInt2950 >= local104.anIntArray24.length) {
											local13.anInt2950 = 0;
										}
									}
									local13.anInt2906 = local13.anInt2950 + 1;
									if (local13.anInt2906 >= local104.anIntArray24.length) {
										local13.anInt2906 -= local104.anInt520;
										if (local13.anInt2906 < 0 || local104.anIntArray24.length <= local13.anInt2906) {
											local13.anInt2906 = -1;
										}
									}
									Static336.method4719(local13);
								}
							}
						}
					}
					if (local13.anInt2959 != 0 && !local13.aBoolean197) {
						@Pc(226) int local226 = local13.anInt2959 >> 16;
						local92 = local13.anInt2959 << 16 >> 16;
						@Pc(237) int local237 = local226 * Static346.anInt6449;
						local13.anInt2886 = local237 + local13.anInt2886 & 0x3FFF;
						local92 *= Static346.anInt6449;
						local13.anInt2927 = local13.anInt2927 + local92 & 0x3FFF;
						Static336.method4719(local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "h", descriptor = "(I)V")
	public static void method5282() {
		Static115.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(II)I")
	public static int method5283(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local30 > local51) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local32) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local51 + local32);
			}
			if (local14 == local51) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local23 == local51) {
				local65 = (local30 - local14) / (local51 - local32) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (-local32 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local51 - local32);
			}
		}
		local65 /= 6.0D;
		@Pc(162) int local162 = (int) (local65 * 256.0D);
		@Pc(167) int local167 = (int) (local67 * 256.0D);
		@Pc(172) int local172 = (int) (local73 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local167 >>= 0x4;
		} else if (local172 > 217) {
			local167 >>= 0x3;
		} else if (local172 > 192) {
			local167 >>= 0x2;
		} else if (local172 > 179) {
			local167 >>= 0x1;
		}
		return (local167 >> 5 << 7) + ((local162 & 0xFF) >> 2 << 10) + (local172 >> 1);
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V")
	public static void method5284() {
		if (Static95.aClass68_23 != null) {
			Static95.aClass68_23.method1994();
			Static95.aClass68_23 = null;
		}
		Static123.method2410();
		Static70.method1548();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static117.aClass49Array1[local17].method1236();
		}
		Static287.method4912(false);
		System.gc();
		Static283.method4781();
		Static100.anInt2201 = -1;
		Static46.aBoolean84 = false;
		Static188.method3461(true);
		Static263.anInt5063 = 0;
		Static324.aBoolean460 = false;
		Static63.anInt1492 = 0;
		Static28.anInt773 = 0;
		Static1.anInt3 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static141.aClass104Array1.length; local56++) {
			Static141.aClass104Array1[local56] = null;
		}
		Static63.anInt1486 = 0;
		Static161.anInt3258 = 0;
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static312.aClass25_Sub1_Sub1_Sub1Array1[local73] = null;
			Static227.aClass5_Sub1Array1[local73] = null;
		}
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static188.aClass25_Sub1_Sub1_Sub2Array1[local91] = null;
		}
		Static3.aClass42_56.method1054();
		Static285.method5098();
		Static339.anInt6356 = 0;
		Static117.method2316();
		Static247.method3557();
		Static27.method4657();
		Static199.method3527(true);
		try {
			Static367.method4779("loggedout", Static202.aClass10_3.anApplet1);
		} catch (@Pc(132) Throwable local132) {
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!en;)V")
	public static void method5285(@OriginalArg(1) Class59 arg0) {
		arg0.method4795(0, 0, Static17.anInt5991, 350);
		arg0.method4877(0, 0, Static17.anInt5991, 350, Static307.anInt5907 << 24 | 0x332277, 1);
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local33 = Static9.anIntArray7[local25];
			@Pc(37) int local37 = Static274.anIntArray404[local25];
			arg0.method4877(local33, local37, 2, 2, Static196.anIntArray279[local25] << 24 | 0xFFFFFF, 1);
		}
		for (local33 = 0; local33 < Static206.aStringArray28.length; local33++) {
			Static62.aClass91_3.method5300(-16777216, 350 - Static83.anInt2057 * local33 - Static282.aClass138_7.anInt4175 - Static19.anInt546 - 2, Static206.aStringArray28[local33], -1, 10);
		}
		arg0.method4797(-1, 350 - Static19.anInt546, Static17.anInt5991, 0);
		Static190.aClass91_8.method5300(-16777216, 349 - Static337.aClass138_10.anInt4175, "--> " + Static236.aString265 + "*", -1, 10);
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(B)V")
	public static void method5286() {
		Static101.method2033(Static15.aClass59_1, (long) Static180.anInt3606);
		if (Static207.anInt4106 != -1) {
			Static194.method3497(Static207.anInt4106);
		}
		for (@Pc(23) int local23 = 0; local23 < Static169.anInt3450; local23++) {
			if (Static293.aBooleanArray25[local23]) {
				Static39.aBooleanArray3[local23] = true;
			}
			Static177.aBooleanArray9[local23] = Static293.aBooleanArray25[local23];
			Static293.aBooleanArray25[local23] = false;
		}
		Static8.anInt251 = Static180.anInt3606;
		if (Static15.aClass59_1.method4862()) {
			Static256.aBoolean382 = true;
		}
		Static84.aClass96_7 = null;
		if (Static207.anInt4106 != -1) {
			Static169.anInt3450 = 0;
			Static316.method5383();
		}
		Static15.aClass59_1.method4810();
		Static103.method2061(Static112.anInt2425);
		Static346.anInt6449 = 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5287(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static226.anInt4439 == 0 && Static70.anInt1768 < 2) {
			return;
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static336.aBoolean407 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static336.aBoolean407 = false;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static175.aClass24_2.method625();
			}
			@Pc(45) int local45;
			@Pc(56) Runtime local56;
			@Pc(66) int local66;
			if (arg1.equalsIgnoreCase("gc")) {
				Static257.method4471();
				for (local45 = 0; local45 < 10; local45++) {
					System.gc();
				}
				local56 = Runtime.getRuntime();
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static236.method4028("mem=" + local66 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static257.method4471();
				for (local45 = 0; local45 < 10; local45++) {
					System.gc();
				}
				local56 = Runtime.getRuntime();
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static236.method4028("Memory before cleanup=" + local66 + "k");
				Static94.method1998();
				Static257.method4471();
				for (@Pc(120) int local120 = 0; local120 < 10; local120++) {
					System.gc();
				}
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static236.method4028("Memory after cleanup=" + local66 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static236.method4028("Number of player models in cache:" + Static170.method3230());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static79.method1765();
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static159.aClass7_1.method247();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static159.aClass7_1.method236();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static202.aClass10_3.method329();
				Static95.aClass68_23.method1996();
				Static159.aClass7_1.method246();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static133.method5809();
				Static211.method3742();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static56.method1201(-1, -1, 1, false);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static56.method1201(-1, -1, 2, false);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static56.method1201(1024, 768, 3, false);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static43.method967(0);
				Static355.anInt6625 = 0;
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static43.method967(1);
				Static355.anInt6625 = 1;
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static43.method967(2);
				Static355.anInt6625 = 2;
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static43.method967(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static67.aBoolean110 = !Static67.aBoolean110;
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
				Static133.method5809();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static90.aBoolean316 = !Static90.aBoolean316;
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
				Static133.method5809();
			}
			if (arg1.startsWith("shadows ")) {
				Static134.anInt2750 = Static269.method4544(arg1.substring(8));
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
				Static133.method5809();
			}
			if (arg1.startsWith("setba")) {
				Static335.anInt6338 = Static269.method4544(arg1.substring(6));
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static144.method2704(Static269.method4544(arg1.substring(13)));
				Static287.method4908(Static202.aClass10_3);
				Static76.aBoolean414 = false;
			}
			if (arg1.startsWith("fps ") && Static226.anInt4439 != 0) {
				Static27.method4638(Static269.method4544(arg1.substring(4)));
			}
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.startsWith("rect_debug")) {
				Static138.anInt2773 = Static269.method4544(arg1.substring(10).trim());
				Static236.method4028("rect_debug=" + Static138.anInt2773);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static213.aBoolean311 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static123.aBoolean176 = !Static123.aBoolean176;
				Static236.method4028("clipcomponents=" + Static123.aBoolean176);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(452) boolean local452 = Static15.aClass59_1.method4844();
				if (!Static169.method3179(!local452)) {
					Static236.method4028("Failed to enable bloom");
				} else if (local452) {
					Static236.method4028("Bloom disabled");
				} else {
					Static236.method4028("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static353.aBoolean489) {
					Static353.aBoolean489 = false;
					Static236.method4028("Forced tweening disabled.");
				} else {
					Static353.aBoolean489 = true;
					Static236.method4028("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static7.aBoolean6) {
					Static236.method4028("Shift-click disabled.");
					Static7.aBoolean6 = false;
				} else {
					Static236.method4028("Shift-click ENABLED!");
					Static7.aBoolean6 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static236.method4028("x:" + (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7) + " z:" + (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static236.method4028("Height: " + Static130.aClass3Array2[Static156.anInt3123].method5638(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static317.aClass170_114.method4572();
				Static317.aClass170_114.method4561();
				Static207.method3694();
				Static211.method3742();
			}
			if (arg1.startsWith("mc")) {
				if (Static15.aClass59_1.method4841()) {
					local45 = Integer.parseInt(arg1.substring(3));
					if (local45 < 1) {
						local45 = 1;
					} else if (local45 > 4) {
						local45 = 4;
					}
					Static255.anInt4975 = local45;
					Static15.aClass59_1.method4816(Static255.anInt4975);
					Static15.aClass59_1.method4847(0);
					Static236.method4028("Render cores now: " + Static255.anInt4975);
				} else {
					Static236.method4028("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static236.method4028("I(s): " + Static41.aClass66_12.method1931() + "/" + Static41.aClass66_12.method1937());
				Static236.method4028("I(m): " + Static265.aClass66_101.method1931() + "/" + Static265.aClass66_101.method1937());
				Static236.method4028("O(s): " + Static250.aClass109_1.method2993() + "/" + Static250.aClass109_1.method2992());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static236.method4028("Pos: " + Static156.anInt3123 + "," + (Static263.anInt5063 + (Static347.anInt6472 >> 7) >> 6) + "," + (Static28.anInt773 + (Static347.anInt6471 >> 7) >> 6) + "," + ((Static347.anInt6472 >> 7) + Static263.anInt5063 & 0x3F) + "," + ((Static347.anInt6471 >> 7) + Static28.anInt773 & 0x3F) + " Height: " + (Static66.method1393(Static347.anInt6471, Static156.anInt3123, Static347.anInt6472) - Static339.anInt6354));
				Static236.method4028("Look: " + Static156.anInt3123 + "," + (Static263.anInt5063 + Static99.anInt2187 >> 6) + "," + (Static28.anInt773 + Static256.anInt4992 >> 6) + "," + (Static99.anInt2187 + Static263.anInt5063 & 0x3F) + "," + (Static256.anInt4992 + Static28.anInt773 & 0x3F) + " Height: " + (Static66.method1393(Static256.anInt4992, Static156.anInt3123, Static99.anInt2187) - Static267.anInt5127));
			}
			if (arg1.equals("showocc")) {
				Static213.aBoolean309 = !Static213.aBoolean309;
				Static133.method5809();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static29.aBoolean57 = !Static29.aBoolean57;
				Static15.aClass59_1.method4873(Static29.aBoolean57);
				Static86.method1935();
			}
			if (arg1.equals("nonpcs")) {
				Static236.aBoolean335 = !Static236.aBoolean335;
			}
			if (arg1.equals("autoworld")) {
				Static323.method5437();
			}
			if (arg1.equals("heap")) {
				Static236.method4028("Heap: " + Static46.anInt1196 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static123.method2411();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local45 = 0; local45 < Static286.anIntArray412.length; local45++) {
					if (Static161.aBooleanArray15[local45]) {
						Static286.anIntArray412[local45] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static286.anIntArray412[local45] *= -1;
						}
					}
				}
				Static123.method2411();
			}
			if (arg1.equals("showcolmap")) {
				Static70.aBoolean119 = true;
				Static211.method3742();
			}
			if (arg1.equals("hidecolmap")) {
				Static70.aBoolean119 = false;
				Static211.method3742();
			}
			if (arg1.equals("resetcache")) {
				Static123.method2410();
			}
			if (arg1.equals("profilecpu")) {
				Static236.method4028(Static169.method3184() + "ms");
			}
			if (Static247.anInt3874 == 30) {
				Static335.aClass5_Sub1_Sub1_3.method174(134);
				Static335.aClass5_Sub1_Sub1_3.method1886(arg1.length() + 2);
				Static335.aClass5_Sub1_Sub1_3.method1886(arg0 ? 1 : 0);
				Static335.aClass5_Sub1_Sub1_3.method1849(arg1);
				return;
			}
		} catch (@Pc(979) Exception local979) {
			Static236.method4028("Whoops, something went wrong.");
			return;
		}
	}
}
