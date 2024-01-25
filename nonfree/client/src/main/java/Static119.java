import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString85 = "Loading interfaces - ";

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
	public static void method2115() {
		Static158.aClass92_6.method4536(Static72.aFloat19 * ((float) Static293.anInt5927 * 0.1F + 0.7F));
		Static158.aClass92_6.method4457(Static6.anInt1977, Static322.aFloat75, Static305.aFloat73, (float) Static122.anInt2759, (float) Static355.anInt6889, (float) Static5.anInt138);
		Static158.aClass92_6.method4517(Static112.aClass49_1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2120(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static164.method3147(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static164.anInt3686; local17++) {
			@Pc(25) String local25 = Static164.method3147(Static284.aStringArray41[local17]);
			if (local25 != null && local25.equals(local12)) {
				Static164.anInt3686--;
				for (@Pc(37) int local37 = local17; local37 < Static164.anInt3686; local37++) {
					Static284.aStringArray41[local37] = Static284.aStringArray41[local37 + 1];
					Static116.aStringArray6[local37] = Static116.aStringArray6[local37 + 1];
					Static218.anIntArray376[local37] = Static218.anIntArray376[local37 + 1];
					Static167.aStringArray28[local37] = Static167.aStringArray28[local37 + 1];
					Static16.anIntArray49[local37] = Static16.anIntArray49[local37 + 1];
					Static213.aBooleanArray22[local37] = Static213.aBooleanArray22[local37 + 1];
				}
				Static345.anInt6764 = Static344.anInt6736;
				Static320.aClass4_Sub7_Sub1_3.method1237(35);
				Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0));
				Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBIIIIII)V")
	public static void method2121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg2;
		@Pc(21) int local21 = arg6 - arg2;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = (1 - local57) * local25 + local41;
		@Pc(77) int local77 = local29 - (local57 - 1) * local45;
		@Pc(85) int local85 = local33 * (1 - local61) + local49;
		@Pc(94) int local94 = local37 - (local61 - 1) * local53;
		@Pc(98) int local98 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = local45 * (local57 - 3);
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = (local61 - 3) * local53;
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = (arg6 - 1) * local98;
		@Pc(144) int local144 = local114;
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (arg4 >= Static229.anInt4777 && Static165.anInt3366 >= arg4) {
			@Pc(158) int[] local158 = Static30.anIntArrayArray10[arg4];
			local167 = Static181.method3367(Static338.anInt5369, arg5 - arg1, Static295.anInt5964);
			local176 = Static181.method3367(Static338.anInt5369, arg5 + arg1, Static295.anInt5964);
			local185 = Static181.method3367(Static338.anInt5369, arg5 - local16, Static295.anInt5964);
			local193 = Static181.method3367(Static338.anInt5369, local16 + arg5, Static295.anInt5964);
			Static182.method3394(local167, local158, arg3, local185);
			Static182.method3394(local185, local158, arg0, local193);
			Static182.method3394(local193, local158, arg3, local176);
		}
		@Pc(217) int local217 = (local21 - 1) * local110;
		while (local9 > 0) {
			@Pc(226) boolean local226 = local9 <= local21;
			if (local226) {
				if (local85 < 0) {
					while (local85 < 0) {
						local94 += local144;
						local85 += local128;
						local128 += local114;
						local144 += local114;
						local11++;
					}
				}
				if (local94 < 0) {
					local94 += local144;
					local85 += local128;
					local144 += local114;
					local11++;
					local128 += local114;
				}
				local85 += -local217;
				local94 += -local134;
				local217 -= local110;
				local134 -= local110;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local118;
					local77 += local136;
					local7++;
					local118 += local106;
					local136 += local106;
				}
			}
			if (local77 < 0) {
				local77 += local136;
				local69 += local118;
				local136 += local106;
				local7++;
				local118 += local106;
			}
			local77 += -local124;
			local69 += -local142;
			local142 -= local98;
			local124 -= local98;
			local9--;
			local167 = arg4 - local9;
			local176 = arg4 + local9;
			if (local176 >= Static229.anInt4777 && local167 <= Static165.anInt3366) {
				local185 = Static181.method3367(Static338.anInt5369, local7 + arg5, Static295.anInt5964);
				local193 = Static181.method3367(Static338.anInt5369, arg5 - local7, Static295.anInt5964);
				if (local226) {
					@Pc(429) int local429 = Static181.method3367(Static338.anInt5369, local11 + arg5, Static295.anInt5964);
					@Pc(438) int local438 = Static181.method3367(Static338.anInt5369, arg5 - local11, Static295.anInt5964);
					@Pc(449) int[] local449;
					if (Static229.anInt4777 <= local167) {
						local449 = Static30.anIntArrayArray10[local167];
						Static182.method3394(local193, local449, arg3, local438);
						Static182.method3394(local438, local449, arg0, local429);
						Static182.method3394(local429, local449, arg3, local185);
					}
					if (local176 <= Static165.anInt3366) {
						local449 = Static30.anIntArrayArray10[local176];
						Static182.method3394(local193, local449, arg3, local438);
						Static182.method3394(local438, local449, arg0, local429);
						Static182.method3394(local429, local449, arg3, local185);
					}
				} else {
					if (Static229.anInt4777 <= local167) {
						Static182.method3394(local193, Static30.anIntArrayArray10[local167], arg3, local185);
					}
					if (Static165.anInt3366 >= local176) {
						Static182.method3394(local193, Static30.anIntArrayArray10[local176], arg3, local185);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIIII)V")
	public static void method2124(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static18.aClass57ArrayArrayArray1 == null) {
			Static164.aClass92_7.method4502(arg1, arg2, arg3, arg4, -16777216);
			return;
		}
		Static230.anInt4802++;
		if (Static110.aClass2_Sub2_Sub1_Sub1_1 != null && Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 - (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() - 1) * 64 >> 7 == Static321.anInt6340 && Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 - (Static110.aClass2_Sub2_Sub1_Sub1_1.method5425() - 1) * 64 >> 7 == Static219.anInt4563) {
			Static219.anInt4563 = -1;
			Static321.anInt6340 = -1;
			Static100.method1855();
		}
		Static219.method3775();
		if (!arg0) {
			Static102.method1879();
		}
		Static171.method3215();
		Static289.method4937(arg4, arg1, true, arg3, arg2);
		@Pc(85) int local85 = Static13.anInt307;
		@Pc(87) int local87 = Static51.anInt1146;
		@Pc(89) int local89 = Static1.anInt3;
		@Pc(91) int local91 = Static130.anInt2949;
		@Pc(102) int local102;
		@Pc(137) int local137;
		if (Static303.anInt3065 == 1) {
			local102 = (int) Static174.aFloat39;
			if (Static65.anInt1359 >> 8 > local102) {
				local102 = Static65.anInt1359 >> 8;
			}
			if (Static71.aBooleanArray11[4] && Static59.anIntArray142[4] + 128 > local102) {
				local102 = Static59.anIntArray142[4] + 128;
			}
			local137 = (int) Static138.aFloat35 + Static146.anInt3285 & 0x3FFF;
			Static298.method5064(local102, (local102 >> 3) * 3 + 600, local137, Static5.anInt133, method2125(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466, Static279.anInt5645) - 50, local85, Static294.anInt3998);
		} else if (Static303.anInt3065 == 4) {
			local102 = (int) Static174.aFloat39;
			if (local102 < Static65.anInt1359 >> 8) {
				local102 = Static65.anInt1359 >> 8;
			}
			if (Static71.aBooleanArray11[4] && local102 < Static59.anIntArray142[4] + 128) {
				local102 = Static59.anIntArray142[4] + 128;
			}
			local137 = (int) Static138.aFloat35 & 0x3FFF;
			Static298.method5064(local102, (local102 >> 3) * 3 + 600, local137, Static5.anInt133, method2125(Static2.anInt5073, Static331.anInt6556, Static279.anInt5645) - 50, local85, Static294.anInt3998);
		} else if (Static303.anInt3065 == 5) {
			Static241.method4168(local85);
		}
		local102 = Static230.anInt4796;
		local137 = Static105.anInt6098;
		@Pc(242) int local242 = Static133.anInt3056;
		@Pc(244) int local244 = Static288.anInt5845;
		@Pc(246) int local246 = Static332.anInt6592;
		@Pc(289) int local289;
		for (@Pc(248) int local248 = 0; local248 < 5; local248++) {
			if (Static71.aBooleanArray11[local248]) {
				local289 = (int) (Math.random() * (double) (Static64.anIntArray149[local248] * 2 + 1) - (double) Static64.anIntArray149[local248] + Math.sin((double) Static130.anIntArray273[local248] * ((double) Static56.anIntArray138[local248] / 100.0D)) * (double) Static59.anIntArray142[local248]);
				if (local248 == 2) {
					Static133.anInt3056 += local289;
				}
				if (local248 == 4) {
					Static288.anInt5845 += local289;
					if (Static288.anInt5845 < 1024) {
						Static288.anInt5845 = 1024;
					} else if (Static288.anInt5845 > 3072) {
						Static288.anInt5845 = 3072;
					}
				}
				if (local248 == 1) {
					Static105.anInt6098 += local289;
				}
				if (local248 == 3) {
					Static332.anInt6592 = local289 + Static332.anInt6592 & 0x3FFF;
				}
				if (local248 == 0) {
					Static230.anInt4796 += local289;
				}
			}
		}
		if (Static230.anInt4796 < 0) {
			Static230.anInt4796 = 0;
		}
		if (Static133.anInt3056 < 0) {
			Static133.anInt3056 = 0;
		}
		if ((Static151.anInt3338 << 7) - 1 < Static230.anInt4796) {
			Static230.anInt4796 = (Static151.anInt3338 << 7) - 1;
		}
		if ((Static220.anInt4569 << 7) - 1 < Static133.anInt3056) {
			Static133.anInt3056 = (Static220.anInt4569 << 7) - 1;
		}
		Static145.method2844();
		Static178.method5426();
		Static164.aClass92_7.method4459(local91, local87, local91 + local89, local87 - -local85);
		Static164.aClass92_7.method4486();
		local289 = Static22.anInt409;
		if (Static93.aClass155_1 == null) {
			Static164.aClass92_7.method4529(local289);
		} else {
			Static93.aClass155_1.method4228(local91, Static164.aClass92_7, Static288.anInt5845, Static313.anInt6288 << 3, local85, local89, Static332.anInt6592, local87, local289);
		}
		Static294.method3383();
		Static269.aClass23_5.method5096(Static230.anInt4796, Static105.anInt6098, Static133.anInt3056, -Static288.anInt5845 & 0x3FFF, -Static332.anInt6592 & 0x3FFF, -Static221.anInt4596 & 0x3FFF);
		Static164.aClass92_7.method4530(Static269.aClass23_5);
		Static164.aClass92_7.method4520(local89 / 2 + local91, local87 + local85 / 2, Static51.anInt1147 << 1, Static51.anInt1147 << 1);
		Static38.method726(local87 + local85 / 2, local89 / 2 + local91, Static51.anInt1147 << 1, Static51.anInt1147 << 1);
		Static14.method312(Static133.anInt3056, -Static332.anInt6592 & 0x3FFF, Static230.anInt4796, -Static221.anInt4596 & 0x3FFF, -Static288.anInt5845 & 0x3FFF, Static105.anInt6098);
		@Pc(508) byte local508 = Static154.method2989() == 2 ? (byte) Static230.anInt4802 : 1;
		Static103.method2839(Static164.aClass92_7, Static342.anInt6706, Static117.anInt2483, Static269.aClass23_5, Static230.anInt4796, Static105.anInt6098, Static133.anInt3056, Static173.aByteArrayArrayArray6, Static238.anIntArray408, Static8.anIntArray41, Static44.anIntArray119, Static200.anIntArray364, Static211.anIntArray367, Static279.anInt5645 + 1, local508, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7, !Static200.aBoolean353);
		Static294.method3383();
		if (Static139.anInt3135 == 30) {
			Static235.method5577(local87, local89, local91, local85);
			Static343.method5584(local87, local91, local89, local85);
			Static102.method1880(local87, local85, local89, local91);
			Static214.method3715(local87, local85, local91, local89);
		}
		Static139.method2751();
		Static105.anInt6098 = local137;
		Static288.anInt5845 = local244;
		Static332.anInt6592 = local246;
		Static133.anInt3056 = local242;
		Static230.anInt4796 = local102;
		if (Static147.aBoolean276 && Static331.aClass93_2.method2433() == 0) {
			Static147.aBoolean276 = false;
		}
		if (Static147.aBoolean276) {
			Static164.aClass92_7.method4502(local87, local89, local91, local85, -16777216);
			Static164.method3149(Static118.aClass78_3, Static38.aString27, false);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIB)I")
	public static int method2125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static307.aClass26Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static92.anInt2048 - 1 || Static290.anInt5893 - 1 < local15) {
			return 0;
		}
		@Pc(36) int local36 = arg2;
		if (arg2 < 3 && (Static348.aByteArrayArrayArray11[1][local11][local15] & 0x2) != 0) {
			local36 = arg2 + 1;
		}
		return Static307.aClass26Array3[local36].method4990(arg0, arg1);
	}
}
