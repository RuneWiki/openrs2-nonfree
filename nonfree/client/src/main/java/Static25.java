import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!fb;")
	public static Class20 aClass20_13;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!wd;")
	public static Class3_Sub11 aClass3_Sub11_1 = new Class3_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt655 = 1;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_325 = Static87.method1648(")3000");

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt658 = 0;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_326 = Static87.method1648(" )2> @yel@");

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!hb;")
	private static Class27 aClass27_328 = Static87.method1648("Username: ");

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_327 = aClass27_328;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt659 = 1;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "J")
	public static long aLong27 = 0L;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method487() {
		Static31.anInt803++;
		Static90.method1713(true);
		Static1.method3(true);
		Static90.method1713(false);
		Static1.method3(false);
		Static103.method1840();
		Static20.method345();
		@Pc(29) int local29;
		@Pc(65) int local65;
		if (!Static30.aBoolean45) {
			local29 = Static97.anInt2292;
			if (local29 < Static12.anInt286 / 256) {
				local29 = Static12.anInt286 / 256;
			}
			if (Static85.aBooleanArray11[4] && local29 < Static2.anIntArray2[4] + 128) {
				local29 = Static2.anIntArray2[4] + 128;
			}
			local65 = Static70.anInt1818 + Static73.anInt1924 & 0x7FF;
			Static107.method1900(Static48.method1675(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399, Static68.anInt1747, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408) - 50, Static50.anInt1340, Static7.anInt179, local29, local65, local29 * 3 + 600);
		}
		if (Static30.aBoolean45) {
			local29 = Static8.method177();
		} else {
			local29 = Static1.method7();
		}
		@Pc(97) int local97 = Static45.anInt371;
		@Pc(99) int local99 = Static81.anInt2195;
		local65 = Static108.anInt2777;
		@Pc(103) int local103 = Static86.anInt2328;
		@Pc(105) int local105 = Static75.anInt2122;
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			if (Static85.aBooleanArray11[local107]) {
				@Pc(148) int local148 = (int) (Math.random() * (double) (Static103.anIntArray393[local107] * 2 + 1) - (double) Static103.anIntArray393[local107] + Math.sin((double) Static24.anIntArray122[local107] / 100.0D * (double) Static77.anIntArray330[local107]) * (double) Static2.anIntArray2[local107]);
				if (local107 == 4) {
					Static81.anInt2195 += local148;
					if (Static81.anInt2195 < 128) {
						Static81.anInt2195 = 128;
					}
					if (Static81.anInt2195 > 383) {
						Static81.anInt2195 = 383;
					}
				}
				if (local107 == 3) {
					Static86.anInt2328 = local148 + Static86.anInt2328 & 0x7FF;
				}
				if (local107 == 2) {
					Static45.anInt371 += local148;
				}
				if (local107 == 1) {
					Static75.anInt2122 += local148;
				}
				if (local107 == 0) {
					Static108.anInt2777 += local148;
				}
			}
		}
		Static50.method978();
		Static21.anInt552 = Static93.anInt2546 - 4;
		Static21.anInt550 = 0;
		Static21.anInt551 = Static85.anInt2297 - 4;
		Static21.aBoolean32 = true;
		Static95.method1320();
		Static76.aClass18_1.method493(Static108.anInt2777, Static75.anInt2122, Static45.anInt371, Static81.anInt2195, Static86.anInt2328, local29);
		Static76.aClass18_1.method525();
		Static10.method232();
		Static31.method659();
		((Class52) Static51.anInterface4_1).method1551(Static39.anInt989);
		Static65.method1198();
		if (Static80.aBoolean104 && Static24.method486() == 0) {
			Static80.aBoolean104 = false;
		}
		if (Static80.aBoolean104) {
			Static50.method978();
			Static95.method1320();
			Static35.method687(Static33.aClass27_396, false, null);
		}
		Static31.method662();
		Static75.anInt2122 = local105;
		Static86.anInt2328 = local103;
		Static108.anInt2777 = local65;
		Static81.anInt2195 = local99;
		Static45.anInt371 = local97;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII)Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 method488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub3_Sub2_Sub2 local14;
		if (arg2 == 0) {
			local14 = (Class3_Sub3_Sub2_Sub2) Static97.aClass21_28.method658((long) arg0);
			if (local14 != null && arg1 != local14.anInt1018 && local14.anInt1018 != -1) {
				local14.method1883();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(37) Class3_Sub3_Sub9 local37 = Static37.method696(arg0);
		if (local37.anIntArray306 == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (local37.anIntArray304[local49] <= arg1 && local37.anIntArray304[local49] != 0) {
					local47 = local37.anIntArray306[local49];
				}
			}
			if (local47 != -1) {
				local37 = Static37.method696(local47);
			}
		}
		@Pc(89) Class3_Sub3_Sub1_Sub1 local89 = local37.method1264(true, 1);
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class3_Sub3_Sub2_Sub2 local95 = null;
		if (local37.anInt1796 != -1) {
			local95 = method488(local37.anInt1791, 10, -1);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(112) int[] local112 = Static95.anIntArray314;
		@Pc(114) int local114 = Static95.anInt1896;
		@Pc(116) int local116 = Static95.anInt1897;
		@Pc(118) int local118 = Static95.anInt1898;
		@Pc(120) int local120 = Static95.anInt1899;
		@Pc(122) int local122 = Static95.anInt1895;
		@Pc(124) int local124 = Static95.anInt1894;
		@Pc(126) int[] local126 = Static51.method1025();
		@Pc(128) int local128 = Static51.anInt1373;
		@Pc(130) int local130 = Static51.anInt1371;
		local14 = new Class3_Sub3_Sub2_Sub2(32, 32);
		Static95.method1323(local14.anIntArray172, 32, 32);
		Static24.anIntArray121 = Static51.method1015(Static24.anIntArray121);
		Static95.method1322(0, 0, 32, 32, 0);
		@Pc(153) int local153 = local37.anInt1810;
		Static51.aBoolean70 = false;
		if (arg2 == -1) {
			local153 = (int) ((double) local153 * 1.5D);
		}
		if (arg2 > 0) {
			local153 = (int) ((double) local153 * 1.04D);
		}
		@Pc(185) int local185 = local153 * Class3_Sub3_Sub2_Sub3.anIntArray226[local37.anInt1806] >> 16;
		@Pc(194) int local194 = local153 * Class3_Sub3_Sub2_Sub3.anIntArray225[local37.anInt1806] >> 16;
		local89.method419();
		local89.method393(local37.anInt1804, local37.anInt1789, local37.anInt1806, local37.anInt1783, local89.anInt2368 / 2 + local185 + local37.anInt1798, local37.anInt1798 + local194);
		for (@Pc(223) int local223 = 31; local223 >= 0; local223--) {
			for (local194 = 31; local194 >= 0; local194--) {
				if (local14.anIntArray172[local194 * 32 + local223] == 0) {
					if (local223 > 0 && local14.anIntArray172[local223 + local194 * 32 - 1] > 1) {
						local14.anIntArray172[local194 * 32 + local223] = 1;
					} else if (local194 > 0 && local14.anIntArray172[local223 + local194 * 32 - 32] > 1) {
						local14.anIntArray172[local223 + local194 * 32] = 1;
					} else if (local223 < 31 && local14.anIntArray172[local223 + local194 * 32 + 1] > 1) {
						local14.anIntArray172[local194 * 32 + local223] = 1;
					} else if (local194 < 31 && local14.anIntArray172[local194 * 32 + local223 + 32] > 1) {
						local14.anIntArray172[local194 * 32 + local223] = 1;
					}
				}
			}
		}
		@Pc(371) int local371;
		if (arg2 > 0) {
			for (local371 = 31; local371 >= 0; local371--) {
				for (local194 = 31; local194 >= 0; local194--) {
					if (local14.anIntArray172[local371 + local194 * 32] == 0) {
						if (local371 > 0 && local14.anIntArray172[local194 * 32 + local371 - 1] == 1) {
							local14.anIntArray172[local194 * 32 + local371] = arg2;
						} else if (local194 > 0 && local14.anIntArray172[local194 * 32 + local371 - 32] == 1) {
							local14.anIntArray172[local194 * 32 + local371] = arg2;
						} else if (local371 < 31 && local14.anIntArray172[local371 + local194 * 32 + 1] == 1) {
							local14.anIntArray172[local371 + local194 * 32] = arg2;
						} else if (local194 < 31 && local14.anIntArray172[local371 + local194 * 32 + 32] == 1) {
							local14.anIntArray172[local194 * 32 + local371] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (local371 = 31; local371 >= 0; local371--) {
				for (local194 = 31; local194 >= 0; local194--) {
					if (local14.anIntArray172[local371 + local194 * 32] == 0 && local371 > 0 && local194 > 0 && local14.anIntArray172[local371 + (local194 - 1) * 32 - 1] > 0) {
						local14.anIntArray172[local371 + local194 * 32] = 3153952;
					}
				}
			}
		}
		if (local37.anInt1796 != -1) {
			local371 = local95.anInt1019;
			local95.anInt1019 = 32;
			@Pc(588) int local588 = local95.anInt1018;
			local95.anInt1018 = 32;
			local95.method804(0, 0);
			local95.anInt1019 = local371;
			local95.anInt1018 = local588;
		}
		if (arg2 == 0) {
			Static97.aClass21_28.method660(local14, (long) arg0);
		}
		Static95.method1323(local112, local116, local124);
		Static95.method1325(local114, local120, local118, local122);
		Static51.method1015(local126);
		Static51.anInt1373 = local128;
		Static51.anInt1371 = local130;
		Static51.method1018();
		Static51.aBoolean70 = true;
		if (local37.anInt1786 == 1) {
			local14.anInt1019 = 33;
		} else {
			local14.anInt1019 = 32;
		}
		local14.anInt1018 = arg1;
		return local14;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZI[II)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		Static105.aClass12_81.method674();
		Static105.aClass3_Sub3_Sub2_Sub4_110.method1332(0, 0);
		if (arg1) {
			if (arg3[arg0] != -1) {
				if (arg0 == 0) {
					Static54.aClass3_Sub3_Sub2_Sub4_60.method1332(22, 10);
				}
				if (arg0 == 1) {
					Static105.aClass3_Sub3_Sub2_Sub4_111.method1332(54, 8);
				}
				if (arg0 == 2) {
					Static105.aClass3_Sub3_Sub2_Sub4_111.method1332(82, 8);
				}
				if (arg0 == 3) {
					Static47.aClass3_Sub3_Sub2_Sub4_47.method1332(110, 8);
				}
				if (arg0 == 4) {
					Static45.aClass3_Sub3_Sub2_Sub4_19.method1332(153, 8);
				}
				if (arg0 == 5) {
					Static45.aClass3_Sub3_Sub2_Sub4_19.method1332(181, 8);
				}
				if (arg0 == 6) {
					Static94.aClass3_Sub3_Sub2_Sub4_98.method1332(209, 9);
				}
			}
			if (arg3[0] != -1 && arg2 != 0) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[0].method1332(29, 13);
			}
			if (arg3[1] != -1 && arg2 != 1) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[1].method1332(53, 11);
			}
			if (arg3[2] != -1 && arg2 != 2) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[2].method1332(82, 11);
			}
			if (arg3[3] != -1 && arg2 != 3) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[3].method1332(115, 12);
			}
			if (arg3[4] != -1 && arg2 != 4) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[4].method1332(153, 13);
			}
			if (arg3[5] != -1 && arg2 != 5) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[5].method1332(180, 11);
			}
			if (arg3[6] != -1 && arg2 != 6) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[6].method1332(208, 13);
			}
		}
		Static75.aClass12_64.method674();
		Static12.aClass3_Sub3_Sub2_Sub4_17.method1332(0, 0);
		if (arg1) {
			if (arg3[arg0] != -1) {
				if (arg0 == 7) {
					Static69.aClass3_Sub3_Sub2_Sub4_75.method1332(42, 0);
				}
				if (arg0 == 8) {
					Static74.aClass3_Sub3_Sub2_Sub4_85.method1332(74, 0);
				}
				if (arg0 == 9) {
					Static74.aClass3_Sub3_Sub2_Sub4_85.method1332(102, 0);
				}
				if (arg0 == 10) {
					Static80.aClass3_Sub3_Sub2_Sub4_89.method1332(130, 1);
				}
				if (arg0 == 11) {
					Static50.aClass3_Sub3_Sub2_Sub4_50.method1332(173, 0);
				}
				if (arg0 == 12) {
					Static50.aClass3_Sub3_Sub2_Sub4_50.method1332(201, 0);
				}
				if (arg0 == 13) {
					Static52.aClass3_Sub3_Sub2_Sub4_59.method1332(229, 0);
				}
			}
			if (arg3[8] != -1 && arg2 != 8) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[7].method1332(74, 2);
			}
			if (arg3[9] != -1 && arg2 != 9) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[8].method1332(102, 3);
			}
			if (arg3[10] != -1 && arg2 != 10) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[9].method1332(137, 4);
			}
			if (arg3[11] != -1 && arg2 != 11) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[10].method1332(174, 2);
			}
			if (arg3[12] != -1 && arg2 != 12) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[11].method1332(201, 2);
			}
			if (arg3[13] != -1 && arg2 != 13) {
				Static106.aClass3_Sub3_Sub2_Sub4Array3[12].method1332(226, 2);
			}
		}
		try {
			@Pc(348) Graphics local348 = Static19.aCanvas1.getGraphics();
			Static105.aClass12_81.method671(516, local348, 160);
			Static75.aClass12_64.method671(496, local348, 466);
		} catch (@Pc(362) Exception local362) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method490() {
		aClass3_Sub11_1 = null;
		aClass27_327 = null;
		aClass27_325 = null;
		aClass20_13 = null;
		aClass27_328 = null;
		aClass27_326 = null;
	}
}
