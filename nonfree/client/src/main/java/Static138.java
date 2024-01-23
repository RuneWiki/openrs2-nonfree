import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!li", name = "O", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!li", name = "X", descriptor = "Lclient!hc;")
	public static Class51 aClass51_46;

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "[[[Lclient!ab;")
	public static Class3[][][] aClass3ArrayArrayArray1;

	@OriginalMember(owner = "client!li", name = "cb", descriptor = "[Lclient!og;")
	public static Class1_Sub20[] aClass1_Sub20Array1;

	@OriginalMember(owner = "client!li", name = "fb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
	public static int anInt3358 = -1;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "I")
	public static int anInt3362 = 0;

	@OriginalMember(owner = "client!li", name = "eb", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(B)Z")
	public static boolean method2530() {
		if (Static250.aBoolean272) {
			try {
				Static267.method82("showVideoAd", Static38.aClass28_1.anApplet1);
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
	public static void method2531() {
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(22) int local22;
		@Pc(39) int local39;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(60) int local60;
		@Pc(163) Class9_Sub7 local163;
		if (Static117.anInt3040 == 199) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local22 = (local14 & 0xF) + Static168.anInt3924 * 2;
			local33 = Static183.anInt5173 * 2 + (local14 >> 4 & 0xF);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1756() + local33;
			local46 = local22 + Static58.aClass1_Sub13_Sub1_1.method1756();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1798();
			local54 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local60 = Static58.aClass1_Sub13_Sub1_1.method1772() * 4;
			local66 = Static58.aClass1_Sub13_Sub1_1.method1772() * 4;
			local70 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local74 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local78 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local82 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local78 == 255) {
				local78 = -1;
			}
			if (local33 >= 0 && local22 >= 0 && local33 < 208 && local22 < 208 && local39 >= 0 && local46 >= 0 && local39 < 208 && local46 < 208 && local54 != 65535) {
				local39 = local39 * 64;
				local22 = local22 * 64;
				local46 *= 64;
				local33 = local33 * 64;
				local163 = new Class9_Sub7(local54, Static137.anInt3321, local33, local22, Static200.method3326(Static137.anInt3321, local22, local33) - local60, Static156.anInt3722 + local70, Static156.anInt3722 + local74, local78, local82, local50, local66);
				local163.method2371(local39, local46, local70 + Static156.anInt3722, Static200.method3326(Static137.anInt3321, local46, local39) - local66);
				Static106.aClass3_12.method28(new Class1_Sub2_Sub17(local163));
			}
		} else if (Static117.anInt3040 == 31) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local33 = Static183.anInt5173 + (local14 >> 4 & 0x7);
			local22 = Static168.anInt3924 + (local14 & 0x7);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local46 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local39 == 65535) {
				local39 = -1;
			}
			local50 = local46 >> 4 & 0xF;
			local60 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local54 = local46 & 0x7;
			local66 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104) {
				local70 = local50 + 1;
				if (Static83.aClass9_Sub1_Sub1_1.anIntArray43[0] >= local33 - local70 && local70 + local33 >= Static83.aClass9_Sub1_Sub1_1.anIntArray43[0] && local22 - local70 <= Static83.aClass9_Sub1_Sub1_1.anIntArray41[0] && Static83.aClass9_Sub1_Sub1_1.anIntArray41[0] <= local70 + local22 && Static47.anInt1385 != 0 && local54 > 0 && Static139.anInt5524 < 50 && local39 != -1) {
					Static222.anIntArray427[Static139.anInt5524] = local39;
					Static11.anIntArray44[Static139.anInt5524] = local54;
					Static52.anIntArray111[Static139.anInt5524] = local60;
					Static185.aClass76Array1[Static139.anInt5524] = null;
					Static207.anIntArray350[Static139.anInt5524] = local50 + (local22 << 8) + (local33 << 16);
					Static5.anIntArray6[Static139.anInt5524] = local66;
					Static139.anInt5524++;
				}
			}
		} else if (Static117.anInt3040 == 123) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local33 = (local14 >> 4 & 0x7) + Static183.anInt5173;
			local22 = Static168.anInt3924 + (local14 & 0x7);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1756() + local33;
			local46 = Static58.aClass1_Sub13_Sub1_1.method1756() + local22;
			local50 = Static58.aClass1_Sub13_Sub1_1.method1798();
			local54 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local60 = Static58.aClass1_Sub13_Sub1_1.method1772() * 4;
			local66 = Static58.aClass1_Sub13_Sub1_1.method1772() * 4;
			local70 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local74 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local78 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local78 == 255) {
				local78 = -1;
			}
			local82 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104 && local39 >= 0 && local46 >= 0 && local39 < 104 && local46 < 104 && local54 != 65535) {
				local33 = local33 * 128 + 64;
				local39 = local39 * 128 + 64;
				local22 = local22 * 128 + 64;
				local46 = local46 * 128 + 64;
				local163 = new Class9_Sub7(local54, Static137.anInt3321, local33, local22, Static200.method3326(Static137.anInt3321, local22, local33) - local60, Static156.anInt3722 + local70, local74 + Static156.anInt3722, local78, local82, local50, local66);
				local163.method2371(local39, local46, Static156.anInt3722 + local70, -local66 + Static200.method3326(Static137.anInt3321, local46, local39));
				Static106.aClass3_12.method28(new Class1_Sub2_Sub17(local163));
			}
		} else if (Static117.anInt3040 == 101) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1811();
			local33 = local14 >> 2;
			local22 = local14 & 0x3;
			local39 = Static185.anIntArray313[local33];
			local46 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local50 = (local46 >> 4 & 0x7) + Static183.anInt5173;
			local54 = Static168.anInt3924 + (local46 & 0x7);
			local60 = Static58.aClass1_Sub13_Sub1_1.method1793();
			if (local60 == 65535) {
				local60 = -1;
			}
			Static160.method2814(local54, local50, local33, local60, local22, local39, Static137.anInt3321);
		} else if (Static117.anInt3040 == 222) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1814();
			local33 = local14 >> 2;
			local22 = local14 & 0x3;
			local39 = Static185.anIntArray313[local33];
			local46 = Static58.aClass1_Sub13_Sub1_1.method1814();
			local50 = Static183.anInt5173 + (local46 >> 4 & 0x7);
			local54 = Static168.anInt3924 + (local46 & 0x7);
			local60 = Static58.aClass1_Sub13_Sub1_1.method1784();
			if (local50 >= 0 && local54 >= 0 && local50 < 104 && local54 < 104) {
				Static132.method2480(local50, local60, local22, -1, local39, local33, Static137.anInt3321, local54, 0);
			}
		} else if (Static117.anInt3040 == 151) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1814();
			local33 = Static183.anInt5173 + (local14 >> 4 & 0x7);
			local22 = Static168.anInt3924 + (local14 & 0x7);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1779();
			local46 = local39 >> 2;
			local50 = local39 & 0x3;
			local54 = Static185.anIntArray313[local46];
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104) {
				Static132.method2480(local33, -1, local50, -1, local54, local46, Static137.anInt3321, local22, 0);
			}
		} else if (Static117.anInt3040 == 38) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local22 = Static168.anInt3924 * 2 + (local14 & 0xF);
			local33 = (local14 >> 4 & 0xF) + Static183.anInt5173 * 2;
			local39 = local33 + Static58.aClass1_Sub13_Sub1_1.method1756();
			local46 = local22 + Static58.aClass1_Sub13_Sub1_1.method1756();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1798();
			local54 = Static58.aClass1_Sub13_Sub1_1.method1798();
			local60 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local66 = Static58.aClass1_Sub13_Sub1_1.method1756();
			local70 = Static58.aClass1_Sub13_Sub1_1.method1772() * 4;
			local74 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local78 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local82 = Static58.aClass1_Sub13_Sub1_1.method1772();
			@Pc(822) int local822 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if (local82 == 255) {
				local82 = -1;
			}
			if (local33 >= 0 && local22 >= 0 && local33 < 208 && local22 < 208 && local39 >= 0 && local46 >= 0 && local39 < 208 && local46 < 208 && local60 != 65535) {
				local33 *= 64;
				local46 = local46 * 64;
				local39 = local39 * 64;
				local22 *= 64;
				if (local50 != 0) {
					@Pc(895) int local895;
					@Pc(908) Class9_Sub1 local908;
					@Pc(889) int local889;
					@Pc(899) int local899;
					if (local50 < 0) {
						local889 = -local50 - 1;
						local895 = local889 >> 11 & 0xF;
						local899 = local889 & 0x7FF;
						if (Static243.anInt5251 == local899) {
							local908 = Static83.aClass9_Sub1_Sub1_1;
						} else {
							local908 = Static147.aClass9_Sub1_Sub1Array1[local899];
						}
					} else {
						local889 = local50 - 1;
						local899 = local889 & 0x7FF;
						local895 = local889 >> 11 & 0xF;
						local908 = Static36.aClass9_Sub1_Sub2Array2[local899];
					}
					if (local908 != null) {
						@Pc(940) Class59 local940 = local908.method207();
						if (local940.anIntArrayArray18 != null && local940.anIntArrayArray18[local895] != null) {
							local899 = local940.anIntArrayArray18[local895][0];
							@Pc(962) int local962 = local940.anIntArrayArray18[local895][2];
							@Pc(967) int local967 = Class132.anIntArray440[local908.anInt419];
							@Pc(972) int local972 = Class132.anIntArray439[local908.anInt419];
							local66 -= local940.anIntArrayArray18[local895][1];
							@Pc(992) int local992 = local962 * local967 + local972 * local899 >> 16;
							@Pc(1003) int local1003 = local972 * local962 - local899 * local967 >> 16;
							local22 += local1003;
							local33 += local992;
						}
					}
				}
				@Pc(1039) Class9_Sub7 local1039 = new Class9_Sub7(local60, Static137.anInt3321, local33, local22, Static200.method3326(Static137.anInt3321, local22, local33) - local66, Static156.anInt3722 + local74, Static156.anInt3722 + local78, local82, local822, local54, local70);
				local1039.method2371(local39, local46, local74 + Static156.anInt3722, Static200.method3326(Static137.anInt3321, local46, local39) + -local70);
				Static106.aClass3_12.method28(new Class1_Sub2_Sub17(local1039));
			}
		} else if (Static117.anInt3040 == 95) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local33 = Static183.anInt5173 + (local14 >> 4 & 0x7);
			local22 = (local14 & 0x7) + Static168.anInt3924;
			local39 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local46 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1764();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104) {
				@Pc(1124) Class3 local1124 = aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22];
				if (local1124 != null) {
					for (@Pc(1133) Class1_Sub2_Sub14 local1133 = (Class1_Sub2_Sub14) local1124.method30(); local1133 != null; local1133 = (Class1_Sub2_Sub14) local1124.method33()) {
						@Pc(1138) Class9_Sub2 local1138 = local1133.aClass9_Sub2_1;
						if ((local39 & 0x7FFF) == local1138.anInt529 && local46 == local1138.anInt532) {
							local1138.anInt532 = local50;
							break;
						}
					}
					Static28.method574(local22, local33);
				}
			}
		} else if (Static117.anInt3040 == 18) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1779();
			local33 = Static183.anInt5173 + (local14 >> 4 & 0x7);
			local22 = Static168.anInt3924 + (local14 & 0x7);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1793();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104) {
				@Pc(1224) Class3 local1224 = aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22];
				if (local1224 != null) {
					for (@Pc(1231) Class1_Sub2_Sub14 local1231 = (Class1_Sub2_Sub14) local1224.method30(); local1231 != null; local1231 = (Class1_Sub2_Sub14) local1224.method33()) {
						if ((local39 & 0x7FFF) == local1231.aClass9_Sub2_1.anInt529) {
							local1231.method4186();
							break;
						}
					}
					if (local1224.method30() == null) {
						aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22] = null;
					}
					Static28.method574(local22, local33);
				}
			}
		} else if (Static117.anInt3040 == 89) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1784();
			local33 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local39 = (local33 & 0x7) + Static168.anInt3924;
			local22 = (local33 >> 4 & 0x7) + Static183.anInt5173;
			local46 = Static58.aClass1_Sub13_Sub1_1.method1784();
			if (local22 >= 0 && local39 >= 0 && local22 < 104 && local39 < 104) {
				@Pc(1324) Class9_Sub2 local1324 = new Class9_Sub2();
				local1324.anInt532 = local46;
				local1324.anInt529 = local14;
				if (aClass3ArrayArrayArray1[Static137.anInt3321][local22][local39] == null) {
					aClass3ArrayArrayArray1[Static137.anInt3321][local22][local39] = new Class3();
				}
				aClass3ArrayArrayArray1[Static137.anInt3321][local22][local39].method28(new Class1_Sub2_Sub14(local1324));
				Static28.method574(local39, local22);
			}
		} else if (Static117.anInt3040 == 106) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local22 = (local14 & 0x7) + Static168.anInt3924;
			local33 = (local14 >> 4 & 0x7) + Static183.anInt5173;
			local39 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local46 = Static58.aClass1_Sub13_Sub1_1.method1772();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1764();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104) {
				local22 = local22 * 128 + 64;
				local33 = local33 * 128 + 64;
				@Pc(1448) Class9_Sub6 local1448 = new Class9_Sub6(local39, Static137.anInt3321, local33, local22, Static200.method3326(Static137.anInt3321, local22, local33) - local46, local50, Static156.anInt3722);
				Static213.aClass3_21.method28(new Class1_Sub2_Sub19(local1448));
			}
		} else if (Static117.anInt3040 == 83) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local33 = Static58.aClass1_Sub13_Sub1_1.method1772();
			Static77.method1518(local14).method923(local33);
		} else if (Static117.anInt3040 == 112) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1814();
			local22 = (local14 & 0x7) + Static168.anInt3924;
			local33 = Static183.anInt5173 + (local14 >> 4 & 0x7);
			local39 = Static58.aClass1_Sub13_Sub1_1.method1784();
			local46 = Static58.aClass1_Sub13_Sub1_1.method1793();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1764();
			if (local33 >= 0 && local22 >= 0 && local33 < 104 && local22 < 104 && Static243.anInt5251 != local39) {
				@Pc(1532) Class9_Sub2 local1532 = new Class9_Sub2();
				local1532.anInt529 = local46;
				local1532.anInt532 = local50;
				if (aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22] == null) {
					aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22] = new Class3();
				}
				aClass3ArrayArrayArray1[Static137.anInt3321][local33][local22].method28(new Class1_Sub2_Sub14(local1532));
				Static28.method574(local22, local33);
			}
		} else if (Static117.anInt3040 == 118) {
			local14 = Static58.aClass1_Sub13_Sub1_1.method1811();
			local22 = local14 & 0x3;
			local33 = local14 >> 2;
			@Pc(1597) byte local1597 = Static58.aClass1_Sub13_Sub1_1.method1775();
			local46 = Static58.aClass1_Sub13_Sub1_1.method1800();
			local50 = Static58.aClass1_Sub13_Sub1_1.method1793();
			@Pc(1609) byte local1609 = Static58.aClass1_Sub13_Sub1_1.method1812();
			@Pc(1613) byte local1613 = Static58.aClass1_Sub13_Sub1_1.method1792();
			local66 = Static58.aClass1_Sub13_Sub1_1.method1779();
			local70 = Static183.anInt5173 + (local66 >> 4 & 0x7);
			local74 = Static168.anInt3924 + (local66 & 0x7);
			local78 = Static58.aClass1_Sub13_Sub1_1.method1764();
			local82 = Static58.aClass1_Sub13_Sub1_1.method1761();
			@Pc(1644) byte local1644 = Static58.aClass1_Sub13_Sub1_1.method1812();
			Static238.method3933(local1609, local22, local50, local78, local1644, local33, local1597, local1613, local46, local70, local74, local82);
		}
	}

	@OriginalMember(owner = "client!li", name = "h", descriptor = "(I)V")
	public static void method2532() {
		Static171.aClass1_Sub13_Sub1_3.method1825(80);
		for (@Pc(14) Class1_Sub5 local14 = (Class1_Sub5) Static204.aClass140_13.method4012(); local14 != null; local14 = (Class1_Sub5) Static204.aClass140_13.method4013()) {
			if (local14.anInt1355 == 0) {
				Static263.method4207(local14, true);
			}
		}
		if (Static58.aClass122_6 != null) {
			Static257.method4146(Static58.aClass122_6);
			Static58.aClass122_6 = null;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2533(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static153.method2748("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg4 && arg5 == arg7 && arg1 == arg8 && arg3 == arg2) {
			Static214.method3516(arg1, arg6, arg3, arg7, arg0);
			return;
		}
		@Pc(33) int local33 = arg0;
		@Pc(35) int local35 = arg7;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(43) int local43 = arg7 * 3;
		@Pc(47) int local47 = arg5 * 3;
		@Pc(51) int local51 = arg2 * 3;
		@Pc(55) int local55 = arg4 * 3;
		@Pc(59) int local59 = arg8 * 3;
		@Pc(68) int local68 = local47 + arg3 - local51 - arg7;
		@Pc(78) int local78 = local39 + local59 - local55 - local55;
		@Pc(82) int local82 = local55 - local39;
		@Pc(91) int local91 = local43 + local51 - local47 - local47;
		@Pc(101) int local101 = local55 + arg1 - arg0 - local59;
		@Pc(105) int local105 = local47 - local43;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local115 * local107 >> 12;
			@Pc(125) int local125 = local101 * local121;
			@Pc(129) int local129 = local115 * local78;
			@Pc(133) int local133 = local91 * local115;
			@Pc(137) int local137 = local68 * local121;
			@Pc(141) int local141 = local82 * local107;
			@Pc(145) int local145 = local105 * local107;
			@Pc(155) int local155 = arg0 + (local141 + local129 + local125 >> 12);
			@Pc(167) int local167 = arg7 + (local145 + local137 + local133 >> 12);
			Static214.method3516(local155, arg6, local167, local35, local33);
			local33 = local155;
			local35 = local167;
		}
	}
}
