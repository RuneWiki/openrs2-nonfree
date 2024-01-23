import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public static int anInt443;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!nm;")
	public static Class119 aClass119_6;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!sc;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public static int anInt448;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!cl;")
	public static Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public static int anInt442 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString13 = "slide:";

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[Lclient!kk;")
	public static Class101[] aClass101Array1 = new Class101[50];

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class59 local3 = new Class59();
		local3.anInt1787 = arg1 / 128;
		local3.anInt1794 = arg2 / 128;
		local3.anInt1783 = arg3 / 128;
		local3.anInt1784 = arg4 / 128;
		local3.anInt1795 = arg0;
		local3.anInt1779 = arg1;
		local3.anInt1797 = arg2;
		local3.anInt1791 = arg3;
		local3.anInt1786 = arg4;
		local3.anInt1796 = arg5;
		local3.anInt1777 = arg6;
		Static225.aClass59Array2[Static3.anInt118++] = local3;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZI)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static178.method3135(arg3, arg1, arg2, arg0);
		} else if (Static188.anInt3598 <= arg2 - arg0 && Static289.anInt5245 >= arg0 + arg2 && Static231.anInt4333 <= arg1 - arg4 && arg4 + arg1 <= Static218.anInt4086) {
			Static310.method4606(arg2, arg1, arg4, arg0, arg3);
		} else {
			Static122.method2214(arg3, arg4, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)J")
	public static long method440() {
		return Static81.aClass34_1.method4653();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILclient!si;)V")
	public static void method441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class157 arg3) {
		Static246.method3875();
		if (Static71.aBoolean165) {
			Static93.method1772(arg2, arg1, arg3.anInt4680 + arg2, arg1 - -arg3.anInt4689);
		} else {
			Static77.method1587(arg2, arg1, arg3.anInt4680 + arg2, arg3.anInt4689 + arg1);
		}
		if (Static124.anInt597 != 2 && Static124.anInt597 != 5 && Static263.aClass1_Sub5_Sub6_9 != null) {
			@Pc(88) int local88 = Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32 + 48;
			@Pc(98) int local98 = 464 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
			@Pc(105) int local105 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
			if (Static71.aBoolean165) {
				((Class1_Sub5_Sub6_Sub2) Static263.aClass1_Sub5_Sub6_9).method3210(arg2, arg1, arg3.anInt4680, arg3.anInt4689, local88, local98, local105, Static289.anInt5250 + 256, (Class1_Sub5_Sub6_Sub2) arg3.method3973(false));
			} else {
				((Class1_Sub5_Sub6_Sub1) Static263.aClass1_Sub5_Sub6_9).method1273(arg2, arg1, arg3.anInt4680, arg3.anInt4689, local88, local98, local105, Static289.anInt5250 + 256, arg3.anIntArray533, arg3.anIntArray539);
			}
			@Pc(187) int local187;
			@Pc(197) int local197;
			@Pc(236) int local236;
			@Pc(224) int local224;
			if (Static69.aClass78_1 != null) {
				for (@Pc(154) int local154 = 0; local154 < Static69.aClass78_1.anInt2253; local154++) {
					if (Static69.aClass78_1.aClass1_Sub5_Sub1Array1[local154] != null && Static69.aClass78_1.anIntArray157[local154] >> 28 == Static132.anInt2608) {
						local187 = (Static69.aClass78_1.anIntArray157[local154] >> 14 & 0x3FFF) - Static38.anInt714;
						local197 = (Static69.aClass78_1.anIntArray157[local154] & 0x3FFF) - Static135.anInt2659;
						if (local187 >= 0 && local187 < 104 && local197 >= 0 && local197 < 104) {
							local224 = local197 * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
							local236 = local187 * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
							Static111.method2029(arg3, arg2, local224, Static69.aClass78_1.aClass1_Sub5_Sub1Array1[local154].anInt359, arg1, local236);
						}
					}
				}
			}
			for (local187 = 0; local187 < Static183.anInt3509; local187++) {
				local197 = Static209.anIntArray439[local187] * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
				local236 = Static133.anIntArray208[local187] * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
				@Pc(294) Class150 local294 = Static160.method2744(Static146.anIntArray257[local187]);
				if (local294.anIntArray507 != null) {
					local294 = local294.method3884();
					if (local294 == null || local294.anInt4544 == -1) {
						continue;
					}
				}
				Static111.method2029(arg3, arg2, local236, local294.anInt4544, arg1, local197);
			}
			@Pc(369) int local369;
			for (local187 = 0; local187 < 104; local187++) {
				for (local197 = 0; local197 < 104; local197++) {
					@Pc(341) Class96 local341 = Static203.aClass96ArrayArrayArray5[Static132.anInt2608][local187][local197];
					if (local341 != null) {
						local224 = local187 * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
						local369 = local197 * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
						Static29.method519(Static128.aClass1_Sub5_Sub6Array3[0], arg1, arg3, local369, arg2, local224);
					}
				}
			}
			for (local187 = 0; local187 < Static1.anInt48; local187++) {
				@Pc(396) Class11_Sub4_Sub2 local396 = Static138.aClass11_Sub4_Sub2Array2[Static288.anIntArray572[local187]];
				if (local396 != null && local396.method3354()) {
					@Pc(406) Class183 local406 = local396.aClass183_1;
					if (local406 != null && local406.anIntArray596 != null) {
						local406 = local406.method4526();
					}
					if (local406 != null && local406.aBoolean514 && local406.aBoolean511) {
						local224 = local396.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
						local369 = local396.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
						if (local406.anInt5449 == -1) {
							Static29.method519(Static128.aClass1_Sub5_Sub6Array3[1], arg1, arg3, local369, arg2, local224);
						} else {
							Static111.method2029(arg3, arg2, local369, local406.anInt5449, arg1, local224);
						}
					}
				}
			}
			for (local187 = 0; local187 < Static275.anInt5043; local187++) {
				@Pc(491) Class11_Sub4_Sub1 local491 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local187]];
				if (local491 != null && local491.method3354()) {
					local236 = local491.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
					local224 = local491.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
					@Pc(521) boolean local521 = false;
					@Pc(528) long local528 = Static282.method4276(local491.aString99);
					for (@Pc(530) int local530 = 0; local530 < Static144.anInt2798; local530++) {
						if (Static133.aLongArray7[local530] == local528 && Static58.anIntArray96[local530] != 0) {
							local521 = true;
							break;
						}
					}
					@Pc(560) boolean local560 = false;
					for (@Pc(562) int local562 = 0; local562 < Static5.anInt201; local562++) {
						if (Static18.aClass1_Sub8Array1[local562].aLong210 == local528) {
							local560 = true;
							break;
						}
					}
					@Pc(585) boolean local585 = false;
					if (Static138.aClass11_Sub4_Sub1_3.anInt2998 != 0 && local491.anInt2998 != 0 && Static138.aClass11_Sub4_Sub1_3.anInt2998 == local491.anInt2998) {
						local585 = true;
					}
					if (local521) {
						Static29.method519(Static128.aClass1_Sub5_Sub6Array3[3], arg1, arg3, local224, arg2, local236);
					} else if (local560) {
						Static29.method519(Static128.aClass1_Sub5_Sub6Array3[5], arg1, arg3, local224, arg2, local236);
					} else if (local585) {
						Static29.method519(Static128.aClass1_Sub5_Sub6Array3[4], arg1, arg3, local224, arg2, local236);
					} else {
						Static29.method519(Static128.aClass1_Sub5_Sub6Array3[2], arg1, arg3, local224, arg2, local236);
					}
				}
			}
			@Pc(660) Class80[] local660 = Static160.aClass80Array1;
			for (local197 = 0; local197 < local660.length; local197++) {
				@Pc(670) Class80 local670 = local660[local197];
				if (local670 != null && local670.anInt2271 != 0 && Static167.anInt637 % 20 < 10) {
					@Pc(716) int local716;
					if (local670.anInt2271 == 1 && local670.anInt2276 >= 0 && Static138.aClass11_Sub4_Sub2Array2.length > local670.anInt2276) {
						@Pc(701) Class11_Sub4_Sub2 local701 = Static138.aClass11_Sub4_Sub2Array2[local670.anInt2276];
						if (local701 != null) {
							local716 = local701.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
							local369 = local701.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
							Static313.method4663(arg3, local670.anInt2268, arg2, 360000, local369, local716, arg1);
						}
					}
					if (local670.anInt2271 == 2) {
						local716 = local670.anInt2272 * 4;
						local224 = (local670.anInt2267 - Static38.anInt714) * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
						local716 *= local716;
						local369 = (local670.anInt2266 - Static135.anInt2659) * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
						Static313.method4663(arg3, local670.anInt2268, arg2, local716, local224, local369, arg1);
					}
					if (local670.anInt2271 == 10 && local670.anInt2276 >= 0 && local670.anInt2276 < Static14.aClass11_Sub4_Sub1Array1.length) {
						@Pc(812) Class11_Sub4_Sub1 local812 = Static14.aClass11_Sub4_Sub1Array1[local670.anInt2276];
						if (local812 != null) {
							local369 = local812.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
							local716 = local812.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
							Static313.method4663(arg3, local670.anInt2268, arg2, 360000, local369, local716, arg1);
						}
					}
				}
			}
			if (Static24.anInt490 != 0) {
				local187 = Static24.anInt490 * 4 + Static138.aClass11_Sub4_Sub1_3.method3347() * 2 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32 - 2;
				local197 = Static261.anInt4835 * 4 + Static138.aClass11_Sub4_Sub1_3.method3347() * 2 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32 - 2;
				Static29.method519(Static153.aClass1_Sub5_Sub6_3, arg1, arg3, local197, arg2, local187);
			}
			if (Static71.aBoolean165) {
				Static93.method1777(arg2 + arg3.anInt4680 / 2 - 1, arg1 + -1 + arg3.anInt4689 / 2, 3, 3, 16777215);
			} else {
				Static77.method1596(arg3.anInt4680 / 2 + arg2 - 1, arg1 + arg3.anInt4689 / 2 - 1, 3, 3, 16777215);
			}
		} else if (Static71.aBoolean165) {
			@Pc(59) Class1_Sub5_Sub6 local59 = arg3.method3973(false);
			if (local59 != null) {
				local59.method3195(arg2, arg1);
			}
		} else {
			Static77.method1605(arg2, arg1, arg3.anIntArray533, arg3.anIntArray539);
		}
		Static88.aBooleanArray5[arg0] = true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ICZ)I")
	public static int method442(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	public static void method444() {
		Static183.anInt3512 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static3.anInt118; local3++) {
			@Pc(10) Class59 local10 = Static225.aClass59Array2[local3];
			@Pc(14) int local14;
			if (Static18.anIntArray37 != null) {
				for (local14 = 0; local14 < Static18.anIntArray37.length; local14++) {
					if (Static18.anIntArray37[local14] != -1000000 && (local10.anInt1796 <= Static18.anIntArray37[local14] || local10.anInt1777 <= Static18.anIntArray37[local14]) && (local10.anInt1779 <= Static194.anIntArray408[local14] || local10.anInt1797 <= Static194.anIntArray408[local14]) && (local10.anInt1779 >= Static250.anIntArray511[local14] || local10.anInt1797 >= Static250.anIntArray511[local14]) && (local10.anInt1791 <= Static66.anIntArray109[local14] || local10.anInt1786 <= Static66.anIntArray109[local14]) && (local10.anInt1791 >= Static136.anIntArray213[local14] || local10.anInt1786 >= Static136.anIntArray213[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt1795 == 1) {
				local14 = local10.anInt1787 + Static161.anInt3224 - Static66.anInt1366;
				if (local14 >= 0 && local14 <= Static161.anInt3224 + Static161.anInt3224) {
					local115 = local10.anInt1783 + Static161.anInt3224 - Static196.anInt3902;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1784 + Static161.anInt3224 - Static196.anInt3902;
					if (local126 > Static161.anInt3224 + Static161.anInt3224) {
						local126 = Static161.anInt3224 + Static161.anInt3224;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static279.aBooleanArrayArray3[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static156.anInt3124 - local10.anInt1779;
						if (local158 > 32) {
							local10.anInt1798 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1798 = 2;
							local158 = -local158;
						}
						local10.anInt1778 = (local10.anInt1791 - Static292.anInt5278 << 8) / local158;
						local10.anInt1788 = (local10.anInt1786 - Static292.anInt5278 << 8) / local158;
						local10.anInt1780 = (local10.anInt1796 - Static215.anInt4033 << 8) / local158;
						local10.anInt1785 = (local10.anInt1777 - Static215.anInt4033 << 8) / local158;
						Static173.aClass59Array1[Static183.anInt3512++] = local10;
					}
				}
			} else if (local10.anInt1795 == 2) {
				local14 = local10.anInt1783 + Static161.anInt3224 - Static196.anInt3902;
				if (local14 >= 0 && local14 <= Static161.anInt3224 + Static161.anInt3224) {
					local115 = local10.anInt1787 + Static161.anInt3224 - Static66.anInt1366;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1794 + Static161.anInt3224 - Static66.anInt1366;
					if (local126 > Static161.anInt3224 + Static161.anInt3224) {
						local126 = Static161.anInt3224 + Static161.anInt3224;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static279.aBooleanArrayArray3[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static292.anInt5278 - local10.anInt1791;
						if (local158 > 32) {
							local10.anInt1798 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt1798 = 4;
							local158 = -local158;
						}
						local10.anInt1793 = (local10.anInt1779 - Static156.anInt3124 << 8) / local158;
						local10.anInt1782 = (local10.anInt1797 - Static156.anInt3124 << 8) / local158;
						local10.anInt1780 = (local10.anInt1796 - Static215.anInt4033 << 8) / local158;
						local10.anInt1785 = (local10.anInt1777 - Static215.anInt4033 << 8) / local158;
						Static173.aClass59Array1[Static183.anInt3512++] = local10;
					}
				}
			} else if (local10.anInt1795 == 4) {
				local14 = local10.anInt1796 - Static215.anInt4033;
				if (local14 > 128) {
					local115 = local10.anInt1783 + Static161.anInt3224 - Static196.anInt3902;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt1784 + Static161.anInt3224 - Static196.anInt3902;
					if (local126 > Static161.anInt3224 + Static161.anInt3224) {
						local126 = Static161.anInt3224 + Static161.anInt3224;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt1787 + Static161.anInt3224 - Static66.anInt1366;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt1794 + Static161.anInt3224 - Static66.anInt1366;
						if (local158 > Static161.anInt3224 + Static161.anInt3224) {
							local158 = Static161.anInt3224 + Static161.anInt3224;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static279.aBooleanArrayArray3[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt1798 = 5;
							local10.anInt1793 = (local10.anInt1779 - Static156.anInt3124 << 8) / local14;
							local10.anInt1782 = (local10.anInt1797 - Static156.anInt3124 << 8) / local14;
							local10.anInt1778 = (local10.anInt1791 - Static292.anInt5278 << 8) / local14;
							local10.anInt1788 = (local10.anInt1786 - Static292.anInt5278 << 8) / local14;
							Static173.aClass59Array1[Static183.anInt3512++] = local10;
						}
					}
				}
			}
		}
	}
}
