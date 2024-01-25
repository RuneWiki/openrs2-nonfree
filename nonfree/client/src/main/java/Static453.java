import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "Lclient!hh;")
	public static Class109 aClass109_44;

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "J")
	public static volatile long aLong96 = 0L;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIJII)Ljava/lang/String;")
	public static String method2829(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local32 = true;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(53) int local53;
		@Pc(58) int local58;
		if (arg1 > 0) {
			for (local53 = 0; local53 < arg1; local53++) {
				local58 = (int) arg2;
				arg2 /= 10L;
				local46.append((char) (local58 + 48 - (int) arg2 * 10));
			}
			local46.append(local7);
		}
		local53 = 0;
		while (true) {
			local58 = (int) arg2;
			arg2 /= 10L;
			local46.append((char) (local58 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local32) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg0) {
				local53++;
				if (local53 % 3 == 0) {
					local46.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBI)I")
	public static int method2830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
	public static int method2831(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIIBI)V")
	public static void method2832(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static131.aClass137ArrayArrayArray2 == null) {
			Static447.aClass121_11.method4600(arg2, arg1, -16777216, arg4, arg3);
		} else if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >= 0 && Static80.anInt6558 * 128 > Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 && Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >= 0 && Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 < Static104.anInt2048 * 128) {
			Static177.anInt3327++;
			if (Static255.aClass47_Sub1_Sub5_Sub2_2 != null && Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 - (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() - 1) * 64 >> 7 == Static57.anInt866 && Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 + 64 - Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() * 64 >> 7 == Static326.anInt5983) {
				Static57.anInt866 = -1;
				Static326.anInt5983 = -1;
				Static111.method1742();
			}
			Static209.method3811();
			if (!arg0) {
				Static428.method5776();
			}
			Static200.method3101();
			Static310.method4253(arg3, arg4, true, arg2, arg1);
			@Pc(114) int local114 = Static82.anInt1487;
			@Pc(116) int local116 = Static114.anInt2192;
			@Pc(118) int local118 = Static250.anInt4327;
			@Pc(120) int local120 = Static90.anInt1738;
			@Pc(128) int local128;
			@Pc(161) int local161;
			if (Static57.anInt883 == 1) {
				local128 = (int) Static90.aFloat25;
				if (local128 < Static321.anInt5592 >> 8) {
					local128 = Static321.anInt5592 >> 8;
				}
				if (Static45.aBooleanArray3[4] && local128 < Static343.anIntArray454[4] + 128) {
					local128 = Static343.anIntArray454[4] + 128;
				}
				local161 = Static402.anInt7349 + (int) Static147.aFloat59 & 0x3FFF;
				Static104.method1680(Static34.anInt572, local161, local128, Static241.anInt4245, local120, Static405.method5510(Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060, Static1.anInt41) - 50, (local128 >> 3) * 3 + 600 << 0);
			} else if (Static57.anInt883 == 4) {
				local128 = (int) Static90.aFloat25;
				if (Static321.anInt5592 >> 8 > local128) {
					local128 = Static321.anInt5592 >> 8;
				}
				if (Static45.aBooleanArray3[4] && Static343.anIntArray454[4] + 128 > local128) {
					local128 = Static343.anIntArray454[4] + 128;
				}
				local161 = (int) Static147.aFloat59 & 0x3FFF;
				Static104.method1680(Static34.anInt572, local161, local128, Static241.anInt4245, local120, Static405.method5510(Static263.anInt4468, Static370.anInt7662, Static1.anInt41) - 50, (local128 >> 3) * 3 + 600 << 0);
			} else if (Static57.anInt883 == 5) {
				Static142.method2281(local120);
			}
			local128 = Static302.anInt5030;
			local161 = Static264.anInt4481;
			@Pc(270) int local270 = Static4.anInt149;
			@Pc(272) int local272 = Static401.anInt7130;
			@Pc(274) int local274 = Static432.anInt7548;
			@Pc(318) int local318;
			for (@Pc(276) int local276 = 0; local276 < 5; local276++) {
				if (Static45.aBooleanArray3[local276]) {
					local318 = (int) ((double) -Static404.anIntArray530[local276] + (double) (Static404.anIntArray530[local276] * 2 + 1) * Math.random() + Math.sin((double) Static235.anIntArray329[local276] / 100.0D * (double) Static253.anIntArray50[local276]) * (double) Static343.anIntArray454[local276]);
					if (local276 == 4) {
						Static401.anInt7130 += local318;
						if (Static401.anInt7130 < 1024) {
							Static401.anInt7130 = 1024;
						} else if (Static401.anInt7130 > 3072) {
							Static401.anInt7130 = 3072;
						}
					}
					if (local276 == 3) {
						Static432.anInt7548 = Static432.anInt7548 + local318 & 0x3FFF;
					}
					if (local276 == 2) {
						Static4.anInt149 += local318;
					}
					if (local276 == 1) {
						Static264.anInt4481 += local318;
					}
					if (local276 == 0) {
						Static302.anInt5030 += local318;
					}
				}
			}
			if (Static302.anInt5030 < 0) {
				Static302.anInt5030 = 0;
			}
			if (Static4.anInt149 < 0) {
				Static4.anInt149 = 0;
			}
			if ((Static251.anInt4344 << 7) - 1 < Static302.anInt5030) {
				Static302.anInt5030 = (Static251.anInt4344 << 7) - 1;
			}
			if (Static4.anInt149 > (Static219.anInt3872 << 7) - 1) {
				Static4.anInt149 = (Static219.anInt3872 << 7) - 1;
			}
			Static54.method834();
			Static420.method5671();
			Static447.aClass121_11.pa(local118, local116, local114 + local118, local120 + local116);
			Static447.aClass121_11.method4621();
			local318 = Static15.anInt285;
			if (Static448.aClass223_1 == null) {
				Static447.aClass121_11.M(local318);
			} else {
				Static448.aClass223_1.method5318(Static75.anInt1424 << 3, local114, Static447.aClass121_11, Static401.anInt7130, Static432.anInt7548, local118, local116, local120, local318);
			}
			Static442.method5918();
			Static198.aClass43_2.Q(Static302.anInt5030, Static264.anInt4481, Static4.anInt149, -Static401.anInt7130 & 0x3FFF, -Static432.anInt7548 & 0x3FFF, -Static423.anInt7380 & 0x3FFF);
			Static447.aClass121_11.m(Static198.aClass43_2);
			Static447.aClass121_11.GA(local118 + local114 / 2, local116 + local120 / 2, Static275.anInt4641 << 1, Static275.anInt4641 << 1);
			Static326.method4732(Static275.anInt4641 << 1, local116 + local120 / 2, Static275.anInt4641 << 1, local118 + local114 / 2);
			Static412.method5594(-Static401.anInt7130 & 0x3FFF, -Static432.anInt7548 & 0x3FFF, Static302.anInt5030, Static4.anInt149, -Static423.anInt7380 & 0x3FFF, Static264.anInt4481);
			@Pc(546) byte local546 = Static327.aClass230_Sub1_1.method5647(Static146.anInt2664) == 2 ? (byte) Static177.anInt3327 : 1;
			Static136.method2094(Static447.aClass121_11, Static123.anInt2333, Static144.anInt2601, Static198.aClass43_2, Static302.anInt5030, Static264.anInt4481, Static4.anInt149, Static183.aByteArrayArrayArray7, Static162.anIntArray219, Static194.anIntArray571, Static148.anIntArray547, Static347.anIntArray461, Static213.anIntArray299, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 + 1, local546, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7, !Static327.aClass230_Sub1_1.aBoolean614);
			Static442.method5918();
			if (Static40.anInt629 == 30) {
				Static362.method5157(local120, local118, local116, local114);
				Static176.method2839(local114, local118, local120, local116);
				Static176.method2835(local118, local114, local120, local116);
				Static289.method3973(local120, local116, local114, local118);
			}
			Static298.method4066();
			Static264.anInt4481 = local161;
			Static4.anInt149 = local270;
			Static401.anInt7130 = local272;
			Static432.anInt7548 = local274;
			Static302.anInt5030 = local128;
			if (Static374.aBoolean546 && Static125.aClass164_2.method3584() == 0) {
				Static374.aBoolean546 = false;
			}
			if (Static374.aBoolean546) {
				Static447.aClass121_11.method4600(local114, local118, -16777216, local120, local116);
				Static210.method3170(false, Static293.aClass96_81.method1935(Static389.anInt7061), Static199.aClass4_4);
			}
		} else {
			Static447.aClass121_11.method4600(arg2, arg1, -16777216, arg4, arg3);
		}
	}
}
