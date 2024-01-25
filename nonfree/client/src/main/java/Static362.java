import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
	public static boolean aBoolean487;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_9 = new Class357(3, 2);

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray106 = new String[200];

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_165 = new Class363(108, 17);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method5082(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static16.anInt491;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class293 local27 = Static590.aClass158_1.method3499(arg0[local18]);
			if (local27.anInt8052 != -1) {
				@Pc(39) Class39 local39 = (Class39) Static574.aClass313_60.method6989((long) local27.anInt8052);
				if (local39 == null) {
					@Pc(47) Class13 local47 = Static596.method247(Static490.aClass259_153, local27.anInt8052, 0);
					if (local47 != null) {
						local39 = Static307.aClass100_6.method6256(local47, true);
						Static574.aClass313_60.method6980((long) local27.anInt8052, local39);
					}
				}
				if (local39 != null) {
					Static126.aClass39Array14[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)I")
	public static int method5083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static90.method1416(arg1 - 1, arg0 + -1) + Static90.method1416(arg1 - 1, arg0 + 1) + Static90.method1416(arg1 - -1, arg0 + -1) + Static90.method1416(arg1 - -1, arg0 - -1);
		@Pc(80) int local80 = Static90.method1416(arg1, arg0 - 1) + Static90.method1416(arg1, arg0 + 1) + Static90.method1416(arg1 - 1, arg0) + Static90.method1416(arg1 + 1, arg0);
		@Pc(85) int local85 = Static90.method1416(arg1, arg0);
		return local80 / 8 + local43 / 16 + local85 / 4;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
	public static void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static80.anInt1738 < arg2 || Static326.anInt6028 > arg4) {
			return;
		}
		@Pc(30) boolean local30;
		if (arg0 < Static553.anInt9074) {
			arg0 = Static553.anInt9074;
			local30 = false;
		} else if (Static249.anInt4668 < arg0) {
			local30 = false;
			arg0 = Static249.anInt4668;
		} else {
			local30 = true;
		}
		@Pc(59) boolean local59;
		if (arg3 < Static553.anInt9074) {
			arg3 = Static553.anInt9074;
			local59 = false;
		} else if (Static249.anInt4668 >= arg3) {
			local59 = true;
		} else {
			arg3 = Static249.anInt4668;
			local59 = false;
		}
		if (arg2 >= Static326.anInt6028) {
			Static276.method3099(arg0, Static582.anIntArrayArray69[arg2++], arg1, arg3);
		} else {
			arg2 = Static326.anInt6028;
		}
		if (arg4 <= Static80.anInt1738) {
			Static276.method3099(arg0, Static582.anIntArrayArray69[arg4--], arg1, arg3);
		} else {
			arg4 = Static80.anInt1738;
		}
		@Pc(113) int local113;
		if (local30 && local59) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				@Pc(119) int[] local119 = Static582.anIntArrayArray69[local113];
				local119[arg0] = local119[arg3] = arg1;
			}
			return;
		}
		if (local30) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				Static582.anIntArrayArray69[local113][arg0] = arg1;
			}
			return;
		}
		if (local59) {
			for (local113 = arg2; local113 <= arg4; local113++) {
				Static582.anIntArrayArray69[local113][arg3] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!r;I)Lclient!sa;")
	public static Class294 method5086(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class40 local14 = Static589.method7958(arg1, arg0, true);
		return local14 == null ? null : local14.aClass294_3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method5087(@OriginalArg(1) int arg0) {
		if (Static168.method2918(arg0)) {
			Static391.method5731(Static2.aClass196ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILclient!wd;IIIII)Z")
	public static boolean method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class355 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg6;
		@Pc(23) int local23 = arg3 - 64;
		@Pc(27) int local27 = arg6 - 64;
		Static233.anIntArrayArray24[64][64] = 99;
		Static416.anIntArrayArray47[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static6.anIntArray26[0] = arg3;
		@Pc(50) int local50 = local41 + 1;
		Static255.anIntArray325[0] = arg6;
		@Pc(55) int[][] local55 = arg5.anIntArrayArray68;
		while (local50 != local43) {
			local7 = Static6.anIntArray26[local43];
			local9 = Static255.anIntArray325[local43];
			@Pc(70) int local70 = local9 - local27;
			@Pc(75) int local75 = local7 - local23;
			local43 = local43 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg5.anInt9399;
			@Pc(92) int local92 = local9 - arg5.anInt9391;
			if (arg7 == -4) {
				if (arg0 == local7 && arg8 == local9) {
					Static245.anInt4563 = local9;
					Static30.anInt768 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static108.method1627(local7, 2, local9, arg4, arg0, arg8, 2, arg2)) {
					Static245.anInt4563 = local9;
					Static30.anInt768 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg5.method7814(arg4, 2, arg8, arg9, arg0, arg2, local9, local7, 2)) {
					Static30.anInt768 = local7;
					Static245.anInt4563 = local9;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg5.method7804(arg4, arg0, local9, arg8, arg2, local7, arg9, 2)) {
					Static30.anInt768 = local7;
					Static245.anInt4563 = local9;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg5.method7819(local7, local9, 2, arg8, arg1, arg7, arg0)) {
					Static30.anInt768 = local7;
					Static245.anInt4563 = local9;
					return true;
				}
			} else if (arg5.method7808(2, arg7, arg8, arg1, local9, local7, arg0)) {
				Static245.anInt4563 = local9;
				Static30.anInt768 = local7;
				return true;
			}
			@Pc(249) int local249 = Static416.anIntArrayArray47[local75][local70] + 1;
			if (local75 > 0 && Static233.anIntArrayArray24[local75 - 1][local70] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local75 - 1][local70] = 2;
				Static416.anIntArrayArray47[local75 - 1][local70] = local249;
			}
			if (local75 < 126 && Static233.anIntArrayArray24[local75 + 1][local70] == 0 && (local55[local87 + 2][local92] & 0x60E40000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9;
				Static233.anIntArrayArray24[local75 + 1][local70] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local75 + 1][local70] = local249;
			}
			if (local70 > 0 && Static233.anIntArrayArray24[local75][local70 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static6.anIntArray26[local50] = local7;
				Static255.anIntArray325[local50] = local9 - 1;
				Static233.anIntArrayArray24[local75][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local75][local70 - 1] = local249;
			}
			if (local70 < 126 && Static233.anIntArrayArray24[local75][local70 + 1] == 0 && (local55[local87][local92 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static6.anIntArray26[local50] = local7;
				Static255.anIntArray325[local50] = local9 + 1;
				Static233.anIntArrayArray24[local75][local70 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local75][local70 + 1] = local249;
			}
			if (local75 > 0 && local70 > 0 && Static233.anIntArrayArray24[local75 - 1][local70 - 1] == 0 && (local55[local87 - 1][local92] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local87][local92 - 1] & 0x63E40000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9 - 1;
				Static233.anIntArrayArray24[local75 - 1][local70 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static416.anIntArrayArray47[local75 - 1][local70 - 1] = local249;
			}
			if (local75 < 126 && local70 > 0 && Static233.anIntArrayArray24[local75 + 1][local70 - 1] == 0 && (local55[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local92] & 0x78E40000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local75 + 1][local70 - 1] = 9;
				Static416.anIntArrayArray47[local75 + 1][local70 - 1] = local249;
			}
			if (local75 > 0 && local70 < 126 && Static233.anIntArrayArray24[local75 - 1][local70 + 1] == 0 && (local55[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local87][local92 + 2] & 0x7E240000) == 0) {
				Static6.anIntArray26[local50] = local7 - 1;
				Static255.anIntArray325[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local75 - 1][local70 + 1] = 6;
				Static416.anIntArrayArray47[local75 - 1][local70 + 1] = local249;
			}
			if (local75 < 126 && local70 < 126 && Static233.anIntArrayArray24[local75 + 1][local70 + 1] == 0 && (local55[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static6.anIntArray26[local50] = local7 + 1;
				Static255.anIntArray325[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local75 + 1][local70 + 1] = 12;
				Static416.anIntArrayArray47[local75 + 1][local70 + 1] = local249;
			}
		}
		Static245.anInt4563 = local9;
		Static30.anInt768 = local7;
		return false;
	}
}
