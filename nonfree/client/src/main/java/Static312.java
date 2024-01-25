import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array9;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	public static int anInt5262 = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_277 = new Class12(30, 3);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZIIIIII)V")
	public static void method4268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || Static80.anInt6558 - 1 <= arg3 || Static104.anInt2048 - 1 <= arg0) {
			return;
		}
		if (Static131.aClass137ArrayArrayArray2 == null) {
			return;
		}
		@Pc(51) Interface11 local51;
		if (arg2 == 0) {
			local51 = (Interface11) Static208.method3165(arg4, arg3, arg0);
			@Pc(258) Interface11 local258 = (Interface11) Static55.method856(arg4, arg3, arg0);
			if (local51 != null && arg6 != 2) {
				if (local51 instanceof Class47_Sub2_Sub3) {
					((Class47_Sub2_Sub3) local51).aClass266_4.method5986(arg1);
				} else {
					Static105.method1699(arg5, arg3, arg4, arg0, local51.method5744(), arg1, arg2, arg6);
				}
			}
			if (local258 != null) {
				if (local258 instanceof Class47_Sub2_Sub3) {
					((Class47_Sub2_Sub3) local258).aClass266_4.method5986(arg1);
				} else {
					Static105.method1699(arg5, arg3, arg4, arg0, local258.method5744(), arg1, arg2, arg6);
				}
			}
		} else if (arg2 == 1) {
			local51 = (Interface11) Static170.method2638(arg4, arg3, arg0);
			if (local51 != null) {
				if (local51 instanceof Class47_Sub4_Sub1) {
					((Class47_Sub4_Sub1) local51).aClass266_1.method5986(arg1);
				} else {
					@Pc(141) int local141 = local51.method5744();
					if (arg6 == 4 || arg6 == 5) {
						Static105.method1699(arg5, arg3, arg4, arg0, local141, arg1, arg2, 4);
					} else if (arg6 == 6) {
						Static105.method1699(arg5 + 4, arg3, arg4, arg0, local141, arg1, arg2, 4);
					} else if (arg6 == 7) {
						Static105.method1699((arg5 + 2 & 0x3) + 4, arg3, arg4, arg0, local141, arg1, arg2, 4);
					} else if (arg6 == 8) {
						Static105.method1699(arg5 + 4, arg3, arg4, arg0, local141, arg1, arg2, 4);
						Static105.method1699((arg5 + 2 & 0x3) + 4, arg3, arg4, arg0, local141, arg1, arg2, 4);
					}
				}
			}
		} else if (arg2 == 2) {
			local51 = (Interface11) Static286.method3918(arg4, arg3, arg0, rq.class);
			if (local51 != null) {
				if (arg6 == 11) {
					arg6 = 10;
				}
				if (local51 instanceof Class47_Sub1_Sub6) {
					((Class47_Sub1_Sub6) local51).aClass266_3.method5986(arg1);
				} else {
					Static105.method1699(arg5, arg3, arg4, arg0, local51.method5744(), arg1, arg2, arg6);
				}
			}
		} else if (arg2 == 3) {
			local51 = (Interface11) Static112.method1764(arg4, arg3, arg0);
			if (local51 != null) {
				if (local51 instanceof Class47_Sub5_Sub2) {
					((Class47_Sub5_Sub2) local51).aClass266_2.method5986(arg1);
				} else {
					Static105.method1699(arg5, arg3, arg4, arg0, local51.method5744(), arg1, arg2, arg6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public static void method4270() {
		Static325.method4684();
		Static425.method5722(Static327.aClass230_Sub1_1.aBoolean607);
		Static145.aClass118_4 = Static262.method3695(22050, Static403.aClass42_6, 0, Static159.aCanvas3);
		Static145.aClass118_4.method3928(Static153.aClass1_Sub5_Sub4_3);
		Static10.aClass118_7 = Static262.method3695(2048, Static403.aClass42_6, 1, Static159.aCanvas3);
		Static10.aClass118_7.method3928(Static292.aClass1_Sub5_Sub1_2);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIZILclient!oe;II)Z")
	public static boolean method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class181 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(22) int local22 = arg0 - 64;
		Static210.anIntArrayArray24[64][64] = 99;
		Static81.anIntArrayArray7[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static355.anIntArray476[0] = arg9;
		@Pc(42) int local42 = 0;
		@Pc(50) int local50 = local36 + 1;
		Static366.anIntArray494[0] = arg0;
		@Pc(55) int[][] local55 = arg7.anIntArrayArray29;
		while (local42 != local50) {
			local7 = Static355.anIntArray476[local42];
			local9 = Static366.anIntArray494[local42];
			@Pc(69) int local69 = local7 - local18;
			local42 = local42 + 1 & 0xFFF;
			@Pc(80) int local80 = local9 - local22;
			@Pc(86) int local86 = local7 - arg7.anInt4723;
			@Pc(92) int local92 = local9 - arg7.anInt4725;
			if (arg8 == -4) {
				if (arg3 == local7 && arg6 == local9) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static401.method5482(2, arg3, arg6, arg4, local9, local7, arg2, 2)) {
					Static148.anInt7258 = local7;
					Static135.anInt2444 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg7.method3867(arg6, 2, arg2, arg3, arg4, local7, local9, arg1, 2)) {
					Static148.anInt7258 = local7;
					Static135.anInt2444 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg7.method3869(arg2, 2, arg1, arg3, arg4, local9, local7, arg6)) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg7.method3874(local7, 2, arg3, arg5, arg8, local9, arg6)) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg7.method3866(arg5, local7, arg8, arg3, 2, arg6, local9)) {
				Static135.anInt2444 = local9;
				Static148.anInt7258 = local7;
				return true;
			}
			@Pc(246) int local246 = Static81.anIntArrayArray7[local69][local80] + 1;
			if (local69 > 0 && Static210.anIntArrayArray24[local69 - 1][local80] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static355.anIntArray476[local50] = local7 - 1;
				Static366.anIntArray494[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local69 - 1][local80] = 2;
				Static81.anIntArrayArray7[local69 - 1][local80] = local246;
			}
			if (local69 < 126 && Static210.anIntArrayArray24[local69 + 1][local80] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static355.anIntArray476[local50] = local7 + 1;
				Static366.anIntArray494[local50] = local9;
				Static210.anIntArrayArray24[local69 + 1][local80] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69 + 1][local80] = local246;
			}
			if (local80 > 0 && Static210.anIntArrayArray24[local69][local80 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static355.anIntArray476[local50] = local7;
				Static366.anIntArray494[local50] = local9 - 1;
				Static210.anIntArrayArray24[local69][local80 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69][local80 - 1] = local246;
			}
			if (local80 < 126 && Static210.anIntArrayArray24[local69][local80 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static355.anIntArray476[local50] = local7;
				Static366.anIntArray494[local50] = local9 + 1;
				Static210.anIntArrayArray24[local69][local80 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69][local80 + 1] = local246;
			}
			if (local69 > 0 && local80 > 0 && Static210.anIntArrayArray24[local69 - 1][local80 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static355.anIntArray476[local50] = local7 - 1;
				Static366.anIntArray494[local50] = local9 - 1;
				Static210.anIntArrayArray24[local69 - 1][local80 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69 - 1][local80 - 1] = local246;
			}
			if (local69 < 126 && local80 > 0 && Static210.anIntArrayArray24[local69 + 1][local80 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static355.anIntArray476[local50] = local7 + 1;
				Static366.anIntArray494[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local69 + 1][local80 - 1] = 9;
				Static81.anIntArrayArray7[local69 + 1][local80 - 1] = local246;
			}
			if (local69 > 0 && local80 < 126 && Static210.anIntArrayArray24[local69 - 1][local80 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static355.anIntArray476[local50] = local7 - 1;
				Static366.anIntArray494[local50] = local9 + 1;
				Static210.anIntArrayArray24[local69 - 1][local80 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69 - 1][local80 + 1] = local246;
			}
			if (local69 < 126 && local80 < 126 && Static210.anIntArrayArray24[local69 + 1][local80 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static355.anIntArray476[local50] = local7 + 1;
				Static366.anIntArray494[local50] = local9 + 1;
				Static210.anIntArrayArray24[local69 + 1][local80 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local69 + 1][local80 + 1] = local246;
			}
		}
		Static148.anInt7258 = local7;
		Static135.anInt2444 = local9;
		return false;
	}
}
