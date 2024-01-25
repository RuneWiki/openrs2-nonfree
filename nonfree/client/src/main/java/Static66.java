import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!nga;")
	public static Class234 aClass234_1;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[I")
	public static final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBZ)V")
	public static void method1075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static60.aClass53ArrayArrayArray1 == null) {
			Static440.aClass44_12.method5006(arg0, arg3, arg1, -16777216, arg2);
		} else if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >= 0 && Static428.anInt8046 * 512 > Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >= 0 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 < Static119.anInt2717 * 512) {
			Static203.anInt3850++;
			if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 != null && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() * 256 >> 9 == Static582.anInt10107 && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 + 256 - Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() * 256 >> 9 == Static8.anInt182) {
				Static8.anInt182 = -1;
				Static582.anInt10107 = -1;
				Static224.method3666();
			}
			Static364.method5858();
			if (!arg4) {
				Static294.method3564();
			}
			Static369.method5939();
			Static506.method2844(arg3, arg1, true, arg2, arg0);
			@Pc(112) int local112 = Static4.anInt153;
			@Pc(114) int local114 = Static136.anInt2911;
			@Pc(116) int local116 = Static231.anInt4191;
			@Pc(122) int local122 = Static366.anInt8690;
			@Pc(133) int local133;
			@Pc(168) int local168;
			if (Static166.anInt3419 == 1) {
				local133 = (int) Static213.aFloat141;
				if (local133 < Static445.anInt8282 >> 8) {
					local133 = Static445.anInt8282 >> 8;
				}
				if (Static225.aBooleanArray10[4] && local133 < Static129.anIntArray133[4] + 128) {
					local133 = Static129.anIntArray133[4] + 128;
				}
				local168 = Static321.anInt6261 + (int) Static201.aFloat128 & 0x3FFF;
				Static495.method7349(local114, Static557.anInt1156, local133, Static60.anInt983, local168, (local133 >> 3) * 3 + 600 << 2, Static501.method5641(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934, Static13.anInt231, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935) - 200);
			} else if (Static166.anInt3419 == 4) {
				local133 = (int) Static213.aFloat141;
				if (Static445.anInt8282 >> 8 > local133) {
					local133 = Static445.anInt8282 >> 8;
				}
				if (Static225.aBooleanArray10[4] && Static129.anIntArray133[4] + 128 > local133) {
					local133 = Static129.anIntArray133[4] + 128;
				}
				local168 = (int) Static201.aFloat128 & 0x3FFF;
				Static495.method7349(local114, Static557.anInt1156, local133, Static60.anInt983, local168, (local133 >> 3) * 3 + 600 << 2, Static501.method5641(Static413.anInt8208, Static13.anInt231, Static339.anInt6576) - 200);
			} else if (Static166.anInt3419 == 5) {
				Static548.method7960(local114);
			}
			local133 = Static24.anInt387;
			local168 = Static209.anInt3913;
			@Pc(273) int local273 = Static110.anInt2624;
			@Pc(275) int local275 = Static232.anInt4203;
			@Pc(277) int local277 = Static261.anInt5009;
			@Pc(321) int local321;
			for (@Pc(279) int local279 = 0; local279 < 5; local279++) {
				if (Static225.aBooleanArray10[local279]) {
					local321 = (int) ((double) -Static352.anIntArray351[local279] + Math.random() * (double) (Static352.anIntArray351[local279] * 2 + 1) + Math.sin((double) Static525.anIntArray503[local279] * ((double) Static87.anIntArray86[local279] / 100.0D)) * (double) Static129.anIntArray133[local279]);
					if (local279 == 1) {
						Static209.anInt3913 += local321 << 2;
					}
					if (local279 == 2) {
						Static110.anInt2624 += local321 << 2;
					}
					if (local279 == 4) {
						Static232.anInt4203 += local321;
						if (Static232.anInt4203 < 1024) {
							Static232.anInt4203 = 1024;
						} else if (Static232.anInt4203 > 3072) {
							Static232.anInt4203 = 3072;
						}
					}
					if (local279 == 3) {
						Static261.anInt5009 = Static261.anInt5009 + local321 & 0x3FFF;
					}
					if (local279 == 0) {
						Static24.anInt387 += local321 << 2;
					}
				}
			}
			if (Static24.anInt387 < 0) {
				Static24.anInt387 = 0;
			}
			if (Static110.anInt2624 < 0) {
				Static110.anInt2624 = 0;
			}
			if ((Static182.anInt3633 << 9) - 1 < Static24.anInt387) {
				Static24.anInt387 = (Static182.anInt3633 << 9) - 1;
			}
			if ((Static253.anInt4651 << 9) - 1 < Static110.anInt2624) {
				Static110.anInt2624 = (Static253.anInt4651 << 9) - 1;
			}
			Static329.method5383();
			Static239.method7074();
			Static440.aClass44_12.da(local112, local122, local116 + local112, local114 + local122);
			Static440.aClass44_12.ya();
			local321 = Static242.anInt4382;
			if (Static529.aClass215_1 == null) {
				Static440.aClass44_12.ja(local321);
			} else {
				Static529.aClass215_1.method5317(local114, Static177.anInt9180 << 3, Static440.aClass44_12, local112, local321, Static261.anInt5009, local122, local116, Static232.anInt4203);
			}
			Static390.method6204();
			Static267.aClass8_3.na(Static24.anInt387, Static209.anInt3913, Static110.anInt2624, -Static232.anInt4203 & 0x3FFF, -Static261.anInt5009 & 0x3FFF, -Static458.anInt8547 & 0x3FFF);
			Static440.aClass44_12.method4999(Static267.aClass8_3);
			Static440.aClass44_12.la(local112 + local116 / 2, local122 + local114 / 2, Static585.anInt9800 << 1, Static585.anInt9800 << 1);
			Static98.method2171(Static585.anInt9800 << 1, local114 / 2 + local122, local112 + local116 / 2, Static585.anInt9800 << 1);
			Static501.method5644(Static110.anInt2624, Static209.anInt3913, -Static261.anInt5009 & 0x3FFF, Static24.anInt387, -Static458.anInt8547 & 0x3FFF, -Static232.anInt4203 & 0x3FFF);
			@Pc(555) byte local555 = Static214.aClass4_Sub19_Sub1_1.method2794(Static495.anInt9000) == 2 ? (byte) Static203.anInt3850 : 1;
			Static479.method7191(Static106.anInt2418, Static24.anInt387, Static209.anInt3913, Static110.anInt2624, Static483.aByteArrayArrayArray18, Static207.anIntArray189, Static87.anIntArray85, Static50.anIntArray28, Static126.anIntArray130, Static434.anIntArray425, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126 + 1, local555, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >> 9, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >> 9, !Static214.aClass4_Sub19_Sub1_1.aBoolean253);
			Static390.method6204();
			if (Static203.anInt3855 == 10) {
				Static328.method5375(local116, local112, local114, local122);
				Static453.method6972(local116, local122, local114, local112);
				Static15.method191(local114, local112, local122, local116);
				Static396.method6272(local122, local114, local112, local116);
			}
			Static549.method7963();
			Static110.anInt2624 = local273;
			Static261.anInt5009 = local277;
			Static232.anInt4203 = local275;
			Static24.anInt387 = local133;
			Static209.anInt3913 = local168;
			if (Static32.aBoolean27 && Static528.aClass329_3.method7761() == 0) {
				Static32.aBoolean27 = false;
			}
			if (Static32.aBoolean27) {
				Static440.aClass44_12.method5006(local112, local116, local122, -16777216, local114);
				Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, false, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181));
			}
		} else {
			Static440.aClass44_12.method5006(arg0, arg3, arg1, -16777216, arg2);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg4;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(84) int local84 = local29 - (local57 - 1) * local45;
		@Pc(93) int local93 = local49 + (1 - local61) * local33;
		@Pc(102) int local102 = local37 - (local61 - 1) * local53;
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local45 * (local57 - 3);
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = local53 * (local61 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg3 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(158) int[] local158 = Static46.anIntArrayArray4[arg5];
		Static306.method5239(local158, arg1 - local16, arg0, arg1 - arg6);
		Static306.method5239(local158, arg1 + local16, arg2, arg1 - local16);
		Static306.method5239(local158, arg6 + arg1, arg0, local16 + arg1);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local9 <= local21;
			if (local198) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local132 += local118;
						local148 += local118;
						local11++;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local11++;
					local132 += local118;
					local148 += local118;
				}
				local102 += -local138;
				local93 += -local154;
				local138 -= local114;
				local154 -= local114;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local84 += local140;
					local70 += local122;
					local122 += local110;
					local140 += local110;
					local7++;
				}
			}
			if (local84 < 0) {
				local70 += local122;
				local84 += local140;
				local140 += local110;
				local7++;
				local122 += local110;
			}
			local84 += -local128;
			local70 += -local146;
			local146 -= local106;
			local128 -= local106;
			local9--;
			@Pc(335) int local335 = arg5 - local9;
			@Pc(340) int local340 = arg5 + local9;
			@Pc(345) int local345 = arg1 + local7;
			@Pc(350) int local350 = arg1 - local7;
			if (local198) {
				@Pc(357) int local357 = arg1 + local11;
				@Pc(362) int local362 = arg1 - local11;
				Static306.method5239(Static46.anIntArrayArray4[local335], local362, arg0, local350);
				Static306.method5239(Static46.anIntArrayArray4[local335], local357, arg2, local362);
				Static306.method5239(Static46.anIntArrayArray4[local335], local345, arg0, local357);
				Static306.method5239(Static46.anIntArrayArray4[local340], local362, arg0, local350);
				Static306.method5239(Static46.anIntArrayArray4[local340], local357, arg2, local362);
				Static306.method5239(Static46.anIntArrayArray4[local340], local345, arg0, local357);
			} else {
				Static306.method5239(Static46.anIntArrayArray4[local335], local345, arg0, local350);
				Static306.method5239(Static46.anIntArrayArray4[local340], local345, arg0, local350);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIIILclient!da;)Lclient!sr;")
	public static Class308 method1078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class57 arg3) {
		return arg3 == null ? null : new Class308(arg2, arg0, arg1, arg3.K(), arg3.KA(), arg3.l(), arg3.J(), arg3.H(), arg3.OA(), arg3.za());
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Z")
	public static boolean method1079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
