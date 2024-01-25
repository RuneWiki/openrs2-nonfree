import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_57 = new Class157(36, 15);

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_66 = new Class221(90, 12);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIII)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg1 << 1;
		@Pc(42) int local42 = local25 + local13 * (1 - local33);
		@Pc(51) int local51 = local17 - local29 * (local33 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = local29 * ((arg1 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static115.method2278(Static364.anIntArrayArray57[arg0], arg3 + arg4, arg2, arg4 - arg3);
		@Pc(99) int local99 = local55 * (arg1 - 1);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local7++;
					local67 += local59;
					local81 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local81 += local59;
				local7++;
				local67 += local59;
			}
			local51 += -local75;
			local42 += -local99;
			local75 -= local55;
			local9--;
			local99 -= local55;
			@Pc(167) int local167 = arg0 - local9;
			@Pc(171) int local171 = local9 + arg0;
			@Pc(175) int local175 = arg4 + local7;
			@Pc(180) int local180 = arg4 - local7;
			Static115.method2278(Static364.anIntArrayArray57[local167], local175, arg2, local180);
			Static115.method2278(Static364.anIntArrayArray57[local171], local175, arg2, local180);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIZII)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static196.aClass51ArrayArrayArray3 == null) {
			Static51.aClass37_1.method3694(arg0, -16777216, arg3, arg1, arg4);
		} else if (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >= 0 && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 < Static66.anInt1177 * 128 && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >= 0 && Static12.anInt213 * 128 > Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888) {
			Static31.anInt512++;
			if (Static177.aClass1_Sub2_Sub3_Sub1_1 != null && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 + 64 - Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() * 64 >> 7 == Static57.anInt1013 && Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 + 64 - Static177.aClass1_Sub2_Sub3_Sub1_1.method5787() * 64 >> 7 == Static360.anInt6858) {
				Static57.anInt1013 = -1;
				Static360.anInt6858 = -1;
				Static107.method2099();
			}
			Static345.method5624();
			if (!arg2) {
				Static146.method2843();
			}
			Static23.method302();
			Static345.method5621(true, arg1, arg4, arg0, arg3);
			@Pc(108) int local108 = Static104.anInt2182;
			@Pc(110) int local110 = Static297.anInt5864;
			@Pc(112) int local112 = Static300.anInt5980;
			@Pc(114) int local114 = Static113.anInt2395;
			@Pc(133) int local133;
			@Pc(172) int local172;
			if (Static135.anInt2910 == 1) {
				local133 = (int) Static99.aFloat33;
				if (Static12.anInt215 >> 8 > local133) {
					local133 = Static12.anInt215 >> 8;
				}
				if (Static62.aBooleanArray7[4] && local133 < Static25.anIntArray51[4] + 128) {
					local133 = Static25.anIntArray51[4] + 128;
				}
				local172 = Static206.anInt4521 + (int) Static366.aFloat48 & 0x3FFF;
				Static221.method4178(Static54.anInt975, local172, (local133 >> 3) * 3 + 600, Static98.anInt2002, local133, Static97.method1899(Static291.anInt5263, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893) - 50, local114);
			} else if (Static135.anInt2910 == 4) {
				local133 = (int) Static99.aFloat33;
				if (local133 < Static12.anInt215 >> 8) {
					local133 = Static12.anInt215 >> 8;
				}
				if (Static62.aBooleanArray7[4] && local133 < Static25.anIntArray51[4] + 128) {
					local133 = Static25.anIntArray51[4] + 128;
				}
				local172 = (int) Static366.aFloat48 & 0x3FFF;
				Static221.method4178(Static54.anInt975, local172, (local133 >> 3) * 3 + 600, Static98.anInt2002, local133, Static97.method1899(Static291.anInt5263, Static362.anInt6967, Static118.anInt2492) - 50, local114);
			} else if (Static135.anInt2910 == 5) {
				Static30.method402(local114);
			}
			local133 = Static166.anInt3804;
			local172 = Static23.anInt356;
			@Pc(265) int local265 = Static51.anInt879;
			@Pc(267) int local267 = Static168.anInt3820;
			@Pc(269) int local269 = Static195.anInt4286;
			@Pc(313) int local313;
			for (@Pc(271) int local271 = 0; local271 < 5; local271++) {
				if (Static62.aBooleanArray7[local271]) {
					local313 = (int) ((double) -Static100.anIntArray159[local271] + (double) (Static100.anIntArray159[local271] * 2 + 1) * Math.random() + Math.sin((double) Static281.anIntArray444[local271] / 100.0D * (double) Static338.anIntArray503[local271]) * (double) Static25.anIntArray51[local271]);
					if (local271 == 4) {
						Static168.anInt3820 += local313;
						if (Static168.anInt3820 < 1024) {
							Static168.anInt3820 = 1024;
						} else if (Static168.anInt3820 > 3072) {
							Static168.anInt3820 = 3072;
						}
					}
					if (local271 == 3) {
						Static195.anInt4286 = local313 + Static195.anInt4286 & 0x3FFF;
					}
					if (local271 == 0) {
						Static166.anInt3804 += local313;
					}
					if (local271 == 1) {
						Static23.anInt356 += local313;
					}
					if (local271 == 2) {
						Static51.anInt879 += local313;
					}
				}
			}
			if (Static166.anInt3804 < 0) {
				Static166.anInt3804 = 0;
			}
			if ((Static344.anInt6692 << 7) - 1 < Static166.anInt3804) {
				Static166.anInt3804 = (Static344.anInt6692 << 7) - 1;
			}
			if (Static51.anInt879 < 0) {
				Static51.anInt879 = 0;
			}
			if (Static51.anInt879 > (Static63.anInt1129 << 7) - 1) {
				Static51.anInt879 = (Static63.anInt1129 << 7) - 1;
			}
			Static171.method3374();
			Static274.method4755();
			Static51.aClass37_1.method3677(local108, local110, local108 + local112, local110 - -local114);
			Static51.aClass37_1.method3665();
			local313 = Static341.anInt462;
			if (Static11.aClass162_1 == null) {
				Static51.aClass37_1.method3689(local313);
			} else {
				Static11.aClass162_1.method4655(Static195.anInt4286, local108, local313, Static168.anInt3820, local110, local114, Static210.anInt4587 << 3, local112, Static51.aClass37_1);
			}
			Static276.method4761();
			Static297.aClass38_4.method4471(Static166.anInt3804, Static23.anInt356, Static51.anInt879, -Static168.anInt3820 & 0x3FFF, -Static195.anInt4286 & 0x3FFF, -Static234.anInt5031 & 0x3FFF);
			Static51.aClass37_1.method3682(Static297.aClass38_4);
			Static51.aClass37_1.method3716(local108 + local112 / 2, local110 - -(local114 / 2), Static124.anInt2617 << 1, Static124.anInt2617 << 1);
			Static78.method1598(Static124.anInt2617 << 1, Static124.anInt2617 << 1, local108 + local112 / 2, local114 / 2 + local110);
			Static102.method2034(Static51.anInt879, Static166.anInt3804, -Static195.anInt4286 & 0x3FFF, -Static168.anInt3820 & 0x3FFF, Static23.anInt356, -Static234.anInt5031 & 0x3FFF);
			@Pc(545) byte local545 = Static177.method3423() == 2 ? (byte) Static31.anInt512 : 1;
			Static123.method2387(Static51.aClass37_1, Static6.anInt91, Static323.anInt6326, Static297.aClass38_4, Static166.anInt3804, Static23.anInt356, Static51.anInt879, Static332.aByteArrayArrayArray12, Static95.anIntArray148, Static129.anIntArray224, Static116.anIntArray200, Static247.anIntArray404, Static233.anIntArray395, Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 + 1, local545, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7, Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7, !Static273.aBoolean494);
			Static276.method4761();
			if (Static176.anInt3971 == 30) {
				Static193.method3608(local114, local112, local110, local108);
				Static349.method5647(local108, local114, local112, local110);
				Static270.method4694(local110, local108, local114, local112);
				Static139.method2698(local112, local114, local108, local110);
			}
			Static30.method408();
			Static195.anInt4286 = local269;
			Static23.anInt356 = local172;
			Static168.anInt3820 = local267;
			Static51.anInt879 = local265;
			Static166.anInt3804 = local133;
			if (Static278.aBoolean498 && Static57.aClass79_1.method2118() == 0) {
				Static278.aBoolean498 = false;
			}
			if (Static278.aBoolean498) {
				Static51.aClass37_1.method3694(local112, -16777216, local114, local108, local110);
				Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803), false);
			}
		} else {
			Static51.aClass37_1.method3694(arg0, -16777216, arg3, arg1, arg4);
		}
	}
}
