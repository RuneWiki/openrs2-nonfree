import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public static int anInt5245 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt5246 = 0;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[Lclient!c;")
	public static final Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array1 = new Class2_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method4349() {
		if (Static45.anInt5671 == 0) {
			return;
		}
		try {
			if (++Static352.anInt6601 > 2000) {
				if (Static131.aClass171_3 != null) {
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
				}
				if (Static335.anInt6657 >= 1) {
					Static52.anInt1173 = -5;
					Static45.anInt5671 = 0;
					return;
				}
				if (Static120.anInt2720 == Static47.anInt1066) {
					Static47.anInt1066 = Static73.anInt1645;
				} else {
					Static47.anInt1066 = Static120.anInt2720;
				}
				Static352.anInt6601 = 0;
				Static335.anInt6657++;
				Static45.anInt5671 = 1;
			}
			if (Static45.anInt5671 == 1) {
				Static195.aClass51_7 = Static212.aClass120_3.method3227(Static47.anInt1066, Static124.aString117);
				Static45.anInt5671 = 2;
			}
			@Pc(129) int local129;
			if (Static45.anInt5671 == 2) {
				if (Static195.aClass51_7.anInt1229 == 2) {
					throw new IOException();
				}
				if (Static195.aClass51_7.anInt1229 != 1) {
					return;
				}
				Static131.aClass171_3 = new Class171((Socket) Static195.aClass51_7.anObject1, Static212.aClass120_3);
				Static195.aClass51_7 = null;
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				local129 = Static131.aClass171_3.method4639();
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				if (local129 != 21) {
					Static52.anInt1173 = local129;
					Static45.anInt5671 = 0;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					return;
				}
				Static45.anInt5671 = 3;
			}
			if (Static45.anInt5671 == 3) {
				if (Static131.aClass171_3.method4638() < 1) {
					return;
				}
				Static65.aStringArray8 = new String[Static131.aClass171_3.method4639()];
				Static45.anInt5671 = 4;
			}
			if (Static45.anInt5671 == 4 && Static131.aClass171_3.method4638() >= Static65.aStringArray8.length * 8) {
				Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
				Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, Static65.aStringArray8.length * 8, 0);
				for (local129 = 0; local129 < Static65.aStringArray8.length; local129++) {
					Static65.aStringArray8[local129] = Static338.method4528(Static200.aClass4_Sub7_Sub1_2.method2409());
				}
				Static52.anInt1173 = 21;
				Static45.anInt5671 = 0;
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
			}
		} catch (@Pc(241) IOException local241) {
			if (Static131.aClass171_3 != null) {
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
			}
			if (Static335.anInt6657 >= 1) {
				Static52.anInt1173 = -4;
				Static45.anInt5671 = 0;
			} else {
				Static335.anInt6657++;
				Static352.anInt6601 = 0;
				Static45.anInt5671 = 1;
				if (Static47.anInt1066 == Static120.anInt2720) {
					Static47.anInt1066 = Static73.anInt1645;
				} else {
					Static47.anInt1066 = Static120.anInt2720;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4352(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static140.aStringArray25.length; local13++) {
			if (Static140.aStringArray25[local13].equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIIIZ)V")
	public static void method4353(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg0 && arg5 == Static182.anInt4006 && arg4 == Static252.anInt5225 && (arg3 == Static45.anInt5654 || Static313.method5257())) {
			return;
		}
		Static252.anInt5225 = arg4;
		Static45.anInt5654 = arg3;
		Static182.anInt4006 = arg5;
		if (Static313.method5257()) {
			Static45.anInt5654 = 0;
		}
		if (arg6) {
			Static233.method3965(28);
		} else {
			Static233.method3965(25);
		}
		Static164.method3149(Static118.aClass78_3, Static38.aString27, true);
		@Pc(52) int local52 = Static10.anInt231;
		@Pc(54) int local54 = Static81.anInt1732;
		Static10.anInt231 = (Static182.anInt4006 - (Static92.anInt2048 >> 4)) * 8;
		Static81.anInt1732 = (Static252.anInt5225 - (Static290.anInt5893 >> 4)) * 8;
		Static329.aClass4_Sub1_Sub11_5 = Static42.method2055(Static182.anInt4006 * 8, Static252.anInt5225 * 8);
		Static200.aClass158_3 = null;
		@Pc(86) int local86 = Static10.anInt231 - local52;
		@Pc(91) int local91 = Static81.anInt1732 - local54;
		@Pc(95) int local95;
		@Pc(105) int local105;
		if (arg6) {
			Static282.anInt5712 = 0;
			local95 = Static92.anInt2048 * 128 - 128;
			@Pc(167) int local167 = Static290.anInt5893 * 128 - 128;
			for (local105 = 0; local105 < 32768; local105++) {
				@Pc(175) Class2_Sub2_Sub1_Sub2 local175 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local105];
				if (local175 != null) {
					local175.anInt6465 -= local86 * 128;
					local175.anInt6466 -= local91 * 128;
					if (local175.anInt6465 >= 0 && local95 >= local175.anInt6465 && local175.anInt6466 >= 0 && local175.anInt6466 <= local167) {
						@Pc(213) boolean local213 = true;
						for (@Pc(215) int local215 = 0; local215 < 10; local215++) {
							local175.anIntArray518[local215] -= local86;
							local175.anIntArray517[local215] -= local91;
							if (local175.anIntArray518[local215] < 0 || local175.anIntArray518[local215] >= Static92.anInt2048 || local175.anIntArray517[local215] < 0 || local175.anIntArray517[local215] >= Static290.anInt5893) {
								local213 = false;
							}
						}
						if (local213) {
							Static332.anIntArray523[Static282.anInt5712++] = local105;
						} else {
							Static101.aClass2_Sub2_Sub1_Sub2Array6[local105].method5445(null);
							Static101.aClass2_Sub2_Sub1_Sub2Array6[local105] = null;
						}
					} else {
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local105].method5445(null);
						Static101.aClass2_Sub2_Sub1_Sub2Array6[local105] = null;
					}
				}
			}
		} else {
			for (local95 = 0; local95 < 32768; local95++) {
				@Pc(101) Class2_Sub2_Sub1_Sub2 local101 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local95];
				if (local101 != null) {
					for (local105 = 0; local105 < 10; local105++) {
						local101.anIntArray518[local105] -= local86;
						local101.anIntArray517[local105] -= local91;
					}
					local101.anInt6466 -= local91 * 128;
					local101.anInt6465 -= local86 * 128;
				}
			}
		}
		for (local95 = 0; local95 < 2048; local95++) {
			@Pc(315) Class2_Sub2_Sub1_Sub1 local315 = aClass2_Sub2_Sub1_Sub1Array1[local95];
			if (local315 != null) {
				for (local105 = 0; local105 < 10; local105++) {
					local315.anIntArray518[local105] -= local86;
					local315.anIntArray517[local105] -= local91;
				}
				local315.anInt6465 -= local86 * 128;
				local315.anInt6466 -= local91 * 128;
			}
		}
		Static279.anInt5645 = arg3;
		Static110.aClass2_Sub2_Sub1_Sub1_1.method654(Static279.anInt5645, arg2, false, arg1);
		Static82.method1453(local91, local86);
		for (@Pc(381) Class4_Sub26 local381 = (Class4_Sub26) Static332.aClass130_149.method3499(); local381 != null; local381 = (Class4_Sub26) Static332.aClass130_149.method3512()) {
			local381.anInt3641 -= local91;
			local381.anInt3634 -= local86;
			if (local381.anInt3634 < 0 || local381.anInt3641 < 0 || local381.anInt3634 >= Static92.anInt2048 || Static290.anInt5893 <= local381.anInt3641) {
				local381.method5667();
			}
		}
		Static234.anInt4843 = 0;
		if (Static321.anInt6340 != 0) {
			Static219.anInt4563 -= local91;
			Static321.anInt6340 -= local86;
		}
		if (arg6) {
			Static230.anInt4796 -= local86 * 128;
			Static154.anInt3448 -= local91;
			Static133.anInt3056 -= local91 * 128;
			Static9.anInt6459 -= local86;
			Static321.anInt6342 -= local86;
			Static80.anInt1721 -= local91;
			if (Math.abs(local86) > Static92.anInt2048 || Math.abs(local91) > Static290.anInt5893) {
				Static16.method350();
			}
		} else if (Static303.anInt3065 == 4) {
			Static5.anInt133 -= local91 * 128;
			Static2.anInt5073 -= local86 * 128;
			Static294.anInt3998 -= local86 * 128;
			Static331.anInt6556 -= local91 * 128;
		} else {
			Static303.anInt3065 = 1;
		}
		Static170.method3202();
		Static108.aClass130_44.method3514();
		Static146.aClass130_70.method3514();
		Static71.aClass204_2.method5362();
		Static57.method1022();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	public static void method4357(@OriginalArg(0) boolean arg0) {
		Static83.aBoolean137 = arg0;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(78) int local78;
		@Pc(158) int local158;
		@Pc(169) int local169;
		@Pc(178) int local178;
		if (!Static83.aBoolean137) {
			@Pc(18) boolean local18 = Static200.aClass4_Sub7_Sub1_2.method2417() == 1;
			@Pc(22) int local22 = Static200.aClass4_Sub7_Sub1_2.method2394();
			local26 = Static200.aClass4_Sub7_Sub1_2.method2394();
			local30 = Static200.aClass4_Sub7_Sub1_2.method2417();
			local34 = Static200.aClass4_Sub7_Sub1_2.method2394();
			local42 = (Static302.anInt6099 - Static200.aClass4_Sub7_Sub1_2.anInt2667) / 16;
			Static57.anIntArrayArray17 = new int[local42][4];
			for (local48 = 0; local48 < local42; local48++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static57.anIntArrayArray17[local48][local52] = Static200.aClass4_Sub7_Sub1_2.method2389();
				}
			}
			local52 = Static200.aClass4_Sub7_Sub1_2.method2394();
			local78 = Static200.aClass4_Sub7_Sub1_2.method2380();
			Static85.method1508(local30);
			Static40.aByteArrayArray1 = null;
			Static98.anIntArray526 = new int[local42];
			Static118.aByteArrayArray8 = new byte[local42][];
			Static281.anIntArray461 = new int[local42];
			Static235.aByteArrayArray25 = new byte[local42][];
			Static247.aByteArrayArray19 = new byte[local42][];
			Static182.anIntArray344 = null;
			Static313.anIntArray505 = new int[local42];
			Static173.anIntArray335 = new int[local42];
			Static128.anIntArray268 = new int[local42];
			Static68.aByteArrayArray3 = new byte[local42][];
			@Pc(114) boolean local114 = false;
			if ((local22 / 8 == 48 || local22 / 8 == 49) && (local52 / 8) == 48) {
				local114 = true;
			}
			local42 = 0;
			if (local22 / 8 == 48 && local52 / 8 == 148) {
				local114 = true;
			}
			for (local158 = (local22 - (Static92.anInt2048 >> 4)) / 8; local158 <= ((Static92.anInt2048 >> 4) + local22) / 8; local158++) {
				for (local169 = (local52 - (Static290.anInt5893 >> 4)) / 8; local169 <= ((Static290.anInt5893 >> 4) + local52) / 8; local169++) {
					local178 = (local158 << 8) + local169;
					if (local114 && (local169 == 49 || local169 == 149 || local169 == 147 || local158 == 50 || local158 == 49 && local169 == 47)) {
						Static313.anIntArray505[local42] = local178;
						Static173.anIntArray335[local42] = -1;
						Static281.anIntArray461[local42] = -1;
						Static98.anIntArray526[local42] = -1;
						Static128.anIntArray268[local42] = -1;
					} else {
						Static313.anIntArray505[local42] = local178;
						Static173.anIntArray335[local42] = Static159.aClass11_72.method301("m" + local158 + "_" + local169);
						Static281.anIntArray461[local42] = Static159.aClass11_72.method301("l" + local158 + "_" + local169);
						Static98.anIntArray526[local42] = Static159.aClass11_72.method301("um" + local158 + "_" + local169);
						Static128.anIntArray268[local42] = Static159.aClass11_72.method301("ul" + local158 + "_" + local169);
					}
					local42++;
				}
			}
			method4353(local18, local34, local26, local78, local52, local22, false);
			return;
		}
		@Pc(336) int local336 = Static200.aClass4_Sub7_Sub1_2.method2394();
		@Pc(347) boolean local347 = Static200.aClass4_Sub7_Sub1_2.method2361() == 1;
		local26 = Static200.aClass4_Sub7_Sub1_2.method2386();
		local30 = Static200.aClass4_Sub7_Sub1_2.method2361();
		local34 = Static200.aClass4_Sub7_Sub1_2.method2417();
		local42 = Static200.aClass4_Sub7_Sub1_2.method2404();
		local48 = Static200.aClass4_Sub7_Sub1_2.method2364();
		Static85.method1508(local30);
		Static200.aClass4_Sub7_Sub1_2.method1239();
		@Pc(383) int local383;
		for (local52 = 0; local52 < 4; local52++) {
			for (local78 = 0; local78 < Static92.anInt2048 >> 3; local78++) {
				for (local383 = 0; local383 < Static290.anInt5893 >> 3; local383++) {
					local158 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
					if (local158 == 1) {
						Static254.anIntArrayArrayArray16[local52][local78][local383] = Static200.aClass4_Sub7_Sub1_2.method1247(26);
					} else {
						Static254.anIntArrayArrayArray16[local52][local78][local383] = -1;
					}
				}
			}
		}
		Static200.aClass4_Sub7_Sub1_2.method1241();
		local78 = (Static302.anInt6099 - Static200.aClass4_Sub7_Sub1_2.anInt2667) / 16;
		Static57.anIntArrayArray17 = new int[local78][4];
		for (local383 = 0; local383 < local78; local383++) {
			for (local158 = 0; local158 < 4; local158++) {
				Static57.anIntArrayArray17[local383][local158] = Static200.aClass4_Sub7_Sub1_2.method2389();
			}
		}
		Static247.aByteArrayArray19 = new byte[local78][];
		Static68.aByteArrayArray3 = new byte[local78][];
		Static173.anIntArray335 = new int[local78];
		Static40.aByteArrayArray1 = null;
		Static98.anIntArray526 = new int[local78];
		Static182.anIntArray344 = null;
		Static235.aByteArrayArray25 = new byte[local78][];
		Static128.anIntArray268 = new int[local78];
		Static118.aByteArrayArray8 = new byte[local78][];
		Static281.anIntArray461 = new int[local78];
		Static313.anIntArray505 = new int[local78];
		local78 = 0;
		for (local158 = 0; local158 < 4; local158++) {
			for (local169 = 0; local169 < Static92.anInt2048 >> 3; local169++) {
				for (local178 = 0; local178 < Static290.anInt5893 >> 3; local178++) {
					@Pc(537) int local537 = Static254.anIntArrayArrayArray16[local158][local169][local178];
					if (local537 != -1) {
						@Pc(547) int local547 = local537 >> 14 & 0x3FF;
						@Pc(553) int local553 = local537 >> 3 & 0x7FF;
						@Pc(563) int local563 = local553 / 8 + (local547 / 8 << 8);
						for (@Pc(565) int local565 = 0; local565 < local78; local565++) {
							if (local563 == Static313.anIntArray505[local565]) {
								local563 = -1;
								break;
							}
						}
						if (local563 != -1) {
							Static313.anIntArray505[local78] = local563;
							@Pc(601) int local601 = local563 >> 8 & 0xFF;
							@Pc(605) int local605 = local563 & 0xFF;
							Static173.anIntArray335[local78] = Static159.aClass11_72.method301("m" + local601 + "_" + local605);
							Static281.anIntArray461[local78] = Static159.aClass11_72.method301("l" + local601 + "_" + local605);
							Static98.anIntArray526[local78] = Static159.aClass11_72.method301("um" + local601 + "_" + local605);
							Static128.anIntArray268[local78] = Static159.aClass11_72.method301("ul" + local601 + "_" + local605);
							local78++;
						}
					}
				}
			}
		}
		method4353(local347, local42, local48, local34, local26, local336, false);
	}
}
