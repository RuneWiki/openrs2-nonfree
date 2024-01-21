import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt1568 = 0;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public static int anInt1572 = 100;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_527 = Static161.method2452(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lclient!cf;")
	public static Class5_Sub2_Sub6 method1177(@OriginalArg(1) int arg0) {
		@Pc(6) Class5_Sub2_Sub6 local6 = (Class5_Sub2_Sub6) Static84.aClass8_18.method227((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static37.aClass23_26.method738(arg0, 16);
		local6 = new Class5_Sub2_Sub6();
		if (local25 != null) {
			local6.method406(new Class5_Sub6(local25));
		}
		Static84.aClass8_18.method232((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method1178() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static85.anInt1879 - 1; local13++) {
				if (Static151.aShortArray40[local13] < 1000 && Static151.aShortArray40[local13 + 1] > 1000) {
					local7 = false;
					@Pc(33) Class20 local33 = Static193.aClass20Array31[local13];
					Static193.aClass20Array31[local13] = Static193.aClass20Array31[local13 + 1];
					Static193.aClass20Array31[local13 + 1] = local33;
					@Pc(51) Class20 local51 = Static203.aClass20Array32[local13];
					Static203.aClass20Array32[local13] = Static203.aClass20Array32[local13 + 1];
					Static203.aClass20Array32[local13 + 1] = local51;
					@Pc(69) int local69 = Static63.anIntArray131[local13];
					Static63.anIntArray131[local13] = Static63.anIntArray131[local13 + 1];
					Static63.anIntArray131[local13 + 1] = local69;
					@Pc(87) int local87 = Static170.anIntArray362[local13];
					Static170.anIntArray362[local13] = Static170.anIntArray362[local13 + 1];
					Static170.anIntArray362[local13 + 1] = local87;
					@Pc(105) short local105 = Static151.aShortArray40[local13];
					Static151.aShortArray40[local13] = Static151.aShortArray40[local13 + 1];
					Static151.aShortArray40[local13 + 1] = local105;
					@Pc(123) long local123 = Static159.aLongArray36[local13];
					Static159.aLongArray36[local13] = Static159.aLongArray36[local13 + 1];
					Static159.aLongArray36[local13 + 1] = local123;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method1179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 <= arg2 + arg4; local7++) {
			for (local11 = arg3; local11 <= arg0 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static165.aByteArrayArrayArray9[arg1][local11][local7] = 127;
				}
			}
		}
		@Pc(57) int local57;
		for (local11 = arg4; local11 < arg4 + arg2; local11++) {
			for (local57 = arg3; local57 < arg0 + arg3; local57++) {
				if (local57 >= 0 && local57 < 104 && local11 >= 0 && local11 < 104) {
					Static37.anIntArrayArrayArray5[arg1][local57][local11] = arg1 > 0 ? Static37.anIntArrayArrayArray5[arg1 - 1][local57][local11] : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local57 = arg4 + 1; local57 < arg2 + arg4; local57++) {
				if (local57 >= 0 && local57 < 104) {
					Static37.anIntArrayArrayArray5[arg1][arg3][local57] = Static37.anIntArrayArrayArray5[arg1][arg3 - 1][local57];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local57 = arg3 + 1; local57 < arg0 + arg3; local57++) {
				if (local57 >= 0 && local57 < 104) {
					Static37.anIntArrayArrayArray5[arg1][local57][arg4] = Static37.anIntArrayArrayArray5[arg1][local57][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg1 != 0) {
			if (arg3 > 0 && Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4] != Static37.anIntArrayArrayArray5[arg1 - 1][arg3 - 1][arg4]) {
				Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static37.anIntArrayArrayArray5[arg1 - 1][arg3][arg4 - 1] != Static37.anIntArrayArrayArray5[arg1][arg3][arg4 - 1]) {
				Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3][arg4 - 1];
				return;
			}
			if (arg3 > 0 && arg4 > 0 && Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4 - 1] != Static37.anIntArrayArrayArray5[arg1 - 1][arg3 - 1][arg4 - 1]) {
				Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4] != 0) {
			Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static37.anIntArrayArrayArray5[arg1][arg3][arg4 - 1] != 0) {
			Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3][arg4 - 1];
			return;
		}
		if (arg3 > 0 && arg4 > 0 && Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4 - 1] != 0) {
			Static37.anIntArrayArrayArray5[arg1][arg3][arg4] = Static37.anIntArrayArrayArray5[arg1][arg3 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lclient!dc;")
	public static Class20 method1180(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static132.method2805(arg0) : Static53.aClass20_377;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZIIIZIII)Z")
	public static boolean method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static155.anIntArrayArray34[local7][local11] = 0;
				Static167.anIntArrayArray36[local7][local11] = 99999999;
			}
		}
		Static155.anIntArrayArray34[arg5][arg2] = 99;
		local11 = arg5;
		Static167.anIntArrayArray36[arg5][arg2] = 0;
		@Pc(51) int local51 = arg2;
		@Pc(53) byte local53 = 0;
		Static85.anIntArray183[0] = arg5;
		@Pc(60) int local60 = local53 + 1;
		Static128.anIntArray292[0] = arg2;
		@Pc(64) int local64 = 0;
		@Pc(69) int[][] local69 = Static9.aClass76Array1[Static111.anInt2327].anIntArrayArray30;
		@Pc(71) boolean local71 = false;
		@Pc(181) int local181;
		while (local64 != local60) {
			local51 = Static128.anIntArray292[local64];
			local11 = Static85.anIntArray183[local64];
			local64 = local64 + 1 & 0xFFF;
			if (local11 == arg1 && local51 == arg10) {
				local71 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static9.aClass76Array1[Static111.anInt2327].method2230(arg9 - 1, arg0, arg1, local51, 1, local11, arg10)) {
					local71 = true;
					break;
				}
				if (arg9 < 10 && Static9.aClass76Array1[Static111.anInt2327].method2228(arg1, local51, local11, arg10, arg0, arg9 - 1, 1)) {
					local71 = true;
					break;
				}
			}
			if (arg6 != 0 && arg8 != 0 && Static9.aClass76Array1[Static111.anInt2327].method2215(arg10, arg1, local11, arg6, 1, local51, arg7, arg8)) {
				local71 = true;
				break;
			}
			local181 = Static167.anIntArrayArray36[local11][local51] + 1;
			if (local11 > 0 && Static155.anIntArrayArray34[local11 - 1][local51] == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0) {
				Static85.anIntArray183[local60] = local11 - 1;
				Static128.anIntArray292[local60] = local51;
				local60 = local60 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local11 - 1][local51] = 2;
				Static167.anIntArrayArray36[local11 - 1][local51] = local181;
			}
			if (local11 < 103 && Static155.anIntArrayArray34[local11 + 1][local51] == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0) {
				Static85.anIntArray183[local60] = local11 + 1;
				Static128.anIntArray292[local60] = local51;
				local60 = local60 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local11 + 1][local51] = 8;
				Static167.anIntArrayArray36[local11 + 1][local51] = local181;
			}
			if (local51 > 0 && Static155.anIntArrayArray34[local11][local51 - 1] == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static85.anIntArray183[local60] = local11;
				Static128.anIntArray292[local60] = local51 - 1;
				Static155.anIntArrayArray34[local11][local51 - 1] = 1;
				local60 = local60 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local11][local51 - 1] = local181;
			}
			if (local51 < 103 && Static155.anIntArrayArray34[local11][local51 + 1] == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static85.anIntArray183[local60] = local11;
				Static128.anIntArray292[local60] = local51 + 1;
				Static155.anIntArrayArray34[local11][local51 + 1] = 4;
				Static167.anIntArrayArray36[local11][local51 + 1] = local181;
				local60 = local60 + 1 & 0xFFF;
			}
			if (local11 > 0 && local51 > 0 && Static155.anIntArrayArray34[local11 - 1][local51 - 1] == 0 && (local69[local11 - 1][local51 - 1] & 0x12C010E) == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static85.anIntArray183[local60] = local11 - 1;
				Static128.anIntArray292[local60] = local51 - 1;
				Static155.anIntArrayArray34[local11 - 1][local51 - 1] = 3;
				Static167.anIntArrayArray36[local11 - 1][local51 - 1] = local181;
				local60 = local60 + 1 & 0xFFF;
			}
			if (local11 < 103 && local51 > 0 && Static155.anIntArrayArray34[local11 + 1][local51 - 1] == 0 && (local69[local11 + 1][local51 - 1] & 0x12C0183) == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0 && (local69[local11][local51 - 1] & 0x12C0102) == 0) {
				Static85.anIntArray183[local60] = local11 + 1;
				Static128.anIntArray292[local60] = local51 - 1;
				Static155.anIntArrayArray34[local11 + 1][local51 - 1] = 9;
				local60 = local60 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local11 + 1][local51 - 1] = local181;
			}
			if (local11 > 0 && local51 < 103 && Static155.anIntArrayArray34[local11 - 1][local51 + 1] == 0 && (local69[local11 - 1][local51 + 1] & 0x12C0138) == 0 && (local69[local11 - 1][local51] & 0x12C0108) == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static85.anIntArray183[local60] = local11 - 1;
				Static128.anIntArray292[local60] = local51 + 1;
				Static155.anIntArrayArray34[local11 - 1][local51 + 1] = 6;
				local60 = local60 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local11 - 1][local51 + 1] = local181;
			}
			if (local11 < 103 && local51 < 103 && Static155.anIntArrayArray34[local11 + 1][local51 + 1] == 0 && (local69[local11 + 1][local51 + 1] & 0x12C01E0) == 0 && (local69[local11 + 1][local51] & 0x12C0180) == 0 && (local69[local11][local51 + 1] & 0x12C0120) == 0) {
				Static85.anIntArray183[local60] = local11 + 1;
				Static128.anIntArray292[local60] = local51 + 1;
				Static155.anIntArrayArray34[local11 + 1][local51 + 1] = 12;
				local60 = local60 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local11 + 1][local51 + 1] = local181;
			}
		}
		Static152.anInt3068 = 0;
		@Pc(787) int local787;
		if (!local71) {
			if (!arg4) {
				return false;
			}
			local181 = 1000;
			local787 = 100;
			for (@Pc(794) int local794 = arg1 - 10; local794 <= arg1 + 10; local794++) {
				for (@Pc(801) int local801 = arg10 - 10; local801 <= arg10 + 10; local801++) {
					if (local794 >= 0 && local801 >= 0 && local794 < 104 && local801 < 104 && Static167.anIntArrayArray36[local794][local801] < 100) {
						@Pc(830) int local830 = 0;
						if (arg1 > local794) {
							local830 = arg1 - local794;
						} else if (local794 > arg1 + arg6 - 1) {
							local830 = local794 + 1 - arg1 - arg6;
						}
						@Pc(860) int local860 = 0;
						if (local801 < arg10) {
							local860 = arg10 - local801;
						} else if (local801 > arg10 + arg8 - 1) {
							local860 = local801 + 1 - arg10 - arg8;
						}
						@Pc(904) int local904 = local830 * local830 + local860 * local860;
						if (local181 > local904 || local181 == local904 && local787 > Static167.anIntArrayArray36[local794][local801]) {
							local11 = local794;
							local787 = Static167.anIntArrayArray36[local794][local801];
							local51 = local801;
							local181 = local904;
						}
					}
				}
			}
			if (local181 == 1000) {
				return false;
			}
			if (arg5 == local11 && arg2 == local51) {
				return false;
			}
			Static152.anInt3068 = 1;
		}
		@Pc(970) byte local970 = 0;
		Static85.anIntArray183[0] = local11;
		local64 = local970 + 1;
		Static128.anIntArray292[0] = local51;
		local181 = local787 = Static155.anIntArrayArray34[local11][local51];
		while (local11 != arg5 || local51 != arg2) {
			if (local181 != local787) {
				local787 = local181;
				Static85.anIntArray183[local64] = local11;
				Static128.anIntArray292[local64++] = local51;
			}
			if ((local181 & 0x1) != 0) {
				local51++;
			} else if ((local181 & 0x4) != 0) {
				local51--;
			}
			if ((local181 & 0x2) != 0) {
				local11++;
			} else if ((local181 & 0x8) != 0) {
				local11--;
			}
			local181 = Static155.anIntArrayArray34[local11][local51];
		}
		if (local64 > 0) {
			Static28.method420(local64, Static128.anIntArray292, Static85.anIntArray183, arg3);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!p;IZIZIIIIZI)V")
	public static void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9) {
		if (arg3 && (Static168.aByteArrayArrayArray13[0][arg8][arg0] & 0x2) == 0) {
			if ((Static168.aByteArrayArrayArray13[arg4][arg8][arg0] & 0x10) != 0) {
				return;
			}
			if (Static35.method555(arg0, arg8, arg4) != Static38.anInt829) {
				return;
			}
		}
		if (arg4 < Static56.anInt1162) {
			Static56.anInt1162 = arg4;
		}
		@Pc(64) Class5_Sub2_Sub7 local64 = Static63.method1046(arg9);
		@Pc(68) int[][] local68 = Static37.anIntArrayArrayArray5[arg7];
		@Pc(80) int local80;
		@Pc(77) int local77;
		if (arg2 == 1 || arg2 == 3) {
			local77 = local64.anInt517;
			local80 = local64.anInt519;
		} else {
			local77 = local64.anInt519;
			local80 = local64.anInt517;
		}
		@Pc(111) int local111;
		@Pc(104) int local104;
		if (local80 + arg8 <= 104) {
			local104 = arg8 + (local80 + 1 >> 1);
			local111 = arg8 + (local80 >> 1);
		} else {
			local111 = arg8;
			local104 = arg8 + 1;
		}
		@Pc(141) int local141;
		@Pc(135) int local135;
		if (local77 + arg0 <= 104) {
			local135 = arg0 + (local77 + 1 >> 1);
			local141 = arg0 + (local77 >> 1);
		} else {
			local135 = arg0 + 1;
			local141 = arg0;
		}
		@Pc(158) int local158 = (arg8 << 7) + (local80 << 6);
		@Pc(166) int local166 = (arg0 << 7) + (local77 << 6);
		@Pc(192) int local192 = local68[local104][local135] + local68[local111][local135] + local68[local104][local141] + local68[local111][local141] >> 2;
		@Pc(194) int[][] local194 = null;
		if (arg7 < 3) {
			local194 = Static37.anIntArrayArrayArray5[arg7 + 1];
		}
		@Pc(229) long local229 = (long) (arg2 << 20 | arg6 << 14 | arg0 << 7 | arg8 | 0x40000000);
		if (local64.anInt543 == 0) {
			local229 |= Long.MIN_VALUE;
		}
		if (local64.anInt536 == 1) {
			local229 |= 0x400000L;
		}
		if (arg5 && local64.method430()) {
			Static116.method1863(arg8, arg0, local64, arg4, arg2);
		}
		local229 |= (long) arg9 << 32;
		@Pc(313) Class1 local313;
		@Pc(327) Class5_Sub2_Sub5 local327;
		if (arg6 == 22) {
			if (!arg3 || local64.anInt543 != 0 || local64.anInt548 == 1 || local64.aBoolean31) {
				if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
					local327 = local64.method421(22, arg5, local194, local68, local166, local158, arg2, local192);
					local313 = local327.aClass1_1;
				} else {
					local313 = new Class1_Sub4(arg9, 22, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
				}
				Static181.method2742(arg4, arg8, arg0, local192, local313, local229, local64.aBoolean24);
				if (local64.anInt548 == 1 && arg1 != null) {
					arg1.method2222(arg8, arg0);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
				local327 = local64.method421(10, arg5, local194, local68, local166, local158, arg2, local192);
				local313 = local327.aClass1_1;
			} else {
				local313 = new Class1_Sub4(arg9, 10, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
			}
			if (local313 != null) {
				@Pc(418) boolean local418 = Static184.method2782(arg4, arg8, arg0, local192, local80, local77, local313, arg6 == 11 ? 256 : 0, local229);
				if (local64.aBoolean30 && local418 && arg5) {
					@Pc(427) int local427 = 15;
					if (local313 instanceof Class1_Sub1) {
						local427 = ((Class1_Sub1) local313).method667() / 4;
						if (local427 > 30) {
							local427 = 30;
						}
					}
					for (@Pc(445) int local445 = 0; local445 <= local80; local445++) {
						for (@Pc(449) int local449 = 0; local449 <= local77; local449++) {
							if (local427 > Static165.aByteArrayArrayArray9[arg4][arg8 + local445][local449 + arg0]) {
								Static165.aByteArrayArrayArray9[arg4][local445 + arg8][local449 + arg0] = (byte) local427;
							}
						}
					}
				}
			}
			if (local64.anInt548 != 0 && arg1 != null) {
				arg1.method2218(local64.aBoolean27, arg0, local77, local80, arg8);
			}
		} else if (arg6 >= 12) {
			if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
				local327 = local64.method421(arg6, arg5, local194, local68, local166, local158, arg2, local192);
				local313 = local327.aClass1_1;
			} else {
				local313 = new Class1_Sub4(arg9, arg6, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
			}
			Static184.method2782(arg4, arg8, arg0, local192, 1, 1, local313, 0, local229);
			if (arg5 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
				Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x924;
			}
			if (local64.anInt548 != 0 && arg1 != null) {
				arg1.method2218(local64.aBoolean27, arg0, local77, local80, arg8);
			}
		} else if (arg6 == 0) {
			if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
				local327 = local64.method421(0, arg5, local194, local68, local166, local158, arg2, local192);
				local313 = local327.aClass1_1;
			} else {
				local313 = new Class1_Sub4(arg9, 0, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
			}
			Static61.method1022(arg4, arg8, arg0, local192, local313, null, Static191.anIntArray402[arg2], 0, local229);
			if (arg5) {
				if (arg2 == 0) {
					if (local64.aBoolean30) {
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0] = 50;
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0 + 1] = 50;
					}
					if (local64.aBoolean29) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local64.aBoolean30) {
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0 + 1] = 50;
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0 + 1] = 50;
					}
					if (local64.aBoolean29) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local64.aBoolean30) {
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0] = 50;
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0 + 1] = 50;
					}
					if (local64.aBoolean29) {
						Static105.anIntArrayArrayArray8[arg4][arg8 + 1][arg0] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local64.aBoolean30) {
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0] = 50;
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0] = 50;
					}
					if (local64.aBoolean29) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x492;
					}
				}
			}
			if (local64.anInt548 != 0 && arg1 != null) {
				arg1.method2234(local64.aBoolean27, arg0, arg2, arg8, arg6);
			}
			if (local64.anInt532 != 16) {
				Static143.method2231(arg4, arg8, arg0, local64.anInt532);
			}
		} else if (arg6 == 1) {
			if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
				local327 = local64.method421(1, arg5, local194, local68, local166, local158, arg2, local192);
				local313 = local327.aClass1_1;
			} else {
				local313 = new Class1_Sub4(arg9, 1, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
			}
			Static61.method1022(arg4, arg8, arg0, local192, local313, null, Static65.anIntArray134[arg2], 0, local229);
			if (local64.aBoolean30 && arg5) {
				if (arg2 == 0) {
					Static165.aByteArrayArrayArray9[arg4][arg8][arg0 + 1] = 50;
				} else if (arg2 == 1) {
					Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0 + 1] = 50;
				} else if (arg2 == 2) {
					Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0] = 50;
				} else if (arg2 == 3) {
					Static165.aByteArrayArrayArray9[arg4][arg8][arg0] = 50;
				}
			}
			if (local64.anInt548 != 0 && arg1 != null) {
				arg1.method2234(local64.aBoolean27, arg0, arg2, arg8, arg6);
			}
		} else {
			@Pc(1041) int local1041;
			if (arg6 == 2) {
				local1041 = arg2 + 1 & 0x3;
				@Pc(1080) Class1 local1080;
				@Pc(1065) Class1 local1065;
				if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
					@Pc(1062) Class5_Sub2_Sub5 local1062 = local64.method421(2, arg5, local194, local68, local166, local158, arg2 + 4, local192);
					local1065 = local1062.aClass1_1;
					@Pc(1077) Class5_Sub2_Sub5 local1077 = local64.method421(2, arg5, local194, local68, local166, local158, local1041, local192);
					local1080 = local1077.aClass1_1;
				} else {
					local1065 = new Class1_Sub4(arg9, 2, arg2 + 4, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
					local1080 = new Class1_Sub4(arg9, 2, local1041, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
				}
				Static61.method1022(arg4, arg8, arg0, local192, local1065, local1080, Static191.anIntArray402[arg2], Static191.anIntArray402[local1041], local229);
				if (local64.aBoolean29 && arg5) {
					if (arg2 == 0) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x249;
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0 + 1] |= 0x492;
					} else if (arg2 == 1) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0 + 1] |= 0x492;
						Static105.anIntArrayArrayArray8[arg4][arg8 + 1][arg0] |= 0x249;
					} else if (arg2 == 2) {
						Static105.anIntArrayArrayArray8[arg4][arg8 + 1][arg0] |= 0x249;
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x492;
					} else if (arg2 == 3) {
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x492;
						Static105.anIntArrayArrayArray8[arg4][arg8][arg0] |= 0x249;
					}
				}
				if (local64.anInt548 != 0 && arg1 != null) {
					arg1.method2234(local64.aBoolean27, arg0, arg2, arg8, arg6);
				}
				if (local64.anInt532 != 16) {
					Static143.method2231(arg4, arg8, arg0, local64.anInt532);
				}
			} else if (arg6 == 3) {
				if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
					local327 = local64.method421(3, arg5, local194, local68, local166, local158, arg2, local192);
					local313 = local327.aClass1_1;
				} else {
					local313 = new Class1_Sub4(arg9, 3, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
				}
				Static61.method1022(arg4, arg8, arg0, local192, local313, null, Static65.anIntArray134[arg2], 0, local229);
				if (local64.aBoolean30 && arg5) {
					if (arg2 == 0) {
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0 + 1] = 50;
					} else if (arg2 == 1) {
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0 + 1] = 50;
					} else if (arg2 == 2) {
						Static165.aByteArrayArrayArray9[arg4][arg8 + 1][arg0] = 50;
					} else if (arg2 == 3) {
						Static165.aByteArrayArrayArray9[arg4][arg8][arg0] = 50;
					}
				}
				if (local64.anInt548 != 0 && arg1 != null) {
					arg1.method2234(local64.aBoolean27, arg0, arg2, arg8, arg6);
				}
			} else if (arg6 == 9) {
				if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
					local327 = local64.method421(arg6, arg5, local194, local68, local166, local158, arg2, local192);
					local313 = local327.aClass1_1;
				} else {
					local313 = new Class1_Sub4(arg9, arg6, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
				}
				Static184.method2782(arg4, arg8, arg0, local192, 1, 1, local313, 0, local229);
				if (local64.anInt548 != 0 && arg1 != null) {
					arg1.method2218(local64.aBoolean27, arg0, local77, local80, arg8);
				}
				if (local64.anInt532 != 16) {
					Static143.method2231(arg4, arg8, arg0, local64.anInt532);
				}
			} else if (arg6 == 4) {
				if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
					local327 = local64.method421(4, arg5, local194, local68, local166, local158, arg2, local192);
					local313 = local327.aClass1_1;
				} else {
					local313 = new Class1_Sub4(arg9, 4, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
				}
				Static133.method2064(arg4, arg8, arg0, local192, local313, null, Static191.anIntArray402[arg2], 0, 0, 0, local229);
			} else {
				@Pc(1616) long local1616;
				@Pc(1652) Class1 local1652;
				@Pc(1666) Class5_Sub2_Sub5 local1666;
				if (arg6 == 5) {
					local1041 = 16;
					local1616 = Static31.method509(arg4, arg8, arg0);
					if (local1616 != 0L) {
						local1041 = Static63.method1046(Integer.MAX_VALUE & (int) (local1616 >>> 32)).anInt532;
					}
					if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
						local1666 = local64.method421(4, arg5, local194, local68, local166, local158, arg2, local192);
						local1652 = local1666.aClass1_1;
					} else {
						local1652 = new Class1_Sub4(arg9, 4, arg2, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
					}
					Static133.method2064(arg4, arg8, arg0, local192, local1652, null, Static191.anIntArray402[arg2], 0, local1041 * Static157.anIntArray346[arg2], local1041 * Static106.anIntArray239[arg2], local229);
				} else if (arg6 == 6) {
					local1041 = 8;
					local1616 = Static31.method509(arg4, arg8, arg0);
					if (local1616 != 0L) {
						local1041 = Static63.method1046((int) (local1616 >>> 32) & Integer.MAX_VALUE).anInt532 / 2;
					}
					if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
						local1666 = local64.method421(4, arg5, local194, local68, local166, local158, arg2 + 4, local192);
						local1652 = local1666.aClass1_1;
					} else {
						local1652 = new Class1_Sub4(arg9, 4, arg2 + 4, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
					}
					Static133.method2064(arg4, arg8, arg0, local192, local1652, null, 256, arg2, local1041 * Static80.anIntArray174[arg2], Static21.anIntArray428[arg2] * local1041, local229);
				} else if (arg6 == 7) {
					@Pc(1797) int local1797 = arg2 + 2 & 0x3;
					if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
						@Pc(1838) Class5_Sub2_Sub5 local1838 = local64.method421(4, arg5, local194, local68, local166, local158, local1797 + 4, local192);
						local313 = local1838.aClass1_1;
					} else {
						local313 = new Class1_Sub4(arg9, 4, local1797 + 4, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
					}
					Static133.method2064(arg4, arg8, arg0, local192, local313, null, 256, local1797, 0, 0, local229);
				} else if (arg6 == 8) {
					local1041 = 8;
					local1616 = Static31.method509(arg4, arg8, arg0);
					if (local1616 != 0L) {
						local1041 = Static63.method1046((int) (local1616 >>> 32) & Integer.MAX_VALUE).anInt532 / 2;
					}
					@Pc(1890) int local1890 = arg2 + 2 & 0x3;
					@Pc(1931) Class1 local1931;
					if (local64.anInt529 == -1 && local64.anIntArray35 == null) {
						@Pc(1947) Class5_Sub2_Sub5 local1947 = local64.method421(4, arg5, local194, local68, local166, local158, arg2 + 4, local192);
						local1652 = local1947.aClass1_1;
						@Pc(1964) Class5_Sub2_Sub5 local1964 = local64.method421(4, arg5, local194, local68, local166, local158, local1890 + 4, local192);
						local1931 = local1964.aClass1_1;
					} else {
						local1652 = new Class1_Sub4(arg9, 4, arg2 + 4, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
						local1931 = new Class1_Sub4(arg9, 4, local1890 + 4, arg7, arg8, arg0, local64.anInt529, local64.aBoolean28, null);
					}
					Static133.method2064(arg4, arg8, arg0, local192, local1652, local1931, 256, arg2, local1041 * Static80.anIntArray174[arg2], local1041 * Static21.anIntArray428[arg2], local229);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method1184() {
		@Pc(14) int local14;
		@Pc(30) int local30;
		@Pc(21) int local21;
		@Pc(34) int local34;
		@Pc(43) int local43;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(75) int local75;
		if (Static196.anInt3834 == 238) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local21 = Static210.anInt922 + (local14 & 0x7);
			local30 = Static38.anInt830 + (local14 >> 4 & 0x7);
			local34 = Static10.aClass5_Sub6_Sub1_1.method3077();
			if (local34 == 65535) {
				local34 = -1;
			}
			local43 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local49 = local43 >> 4 & 0xF;
			local53 = local43 & 0x7;
			local57 = Static10.aClass5_Sub6_Sub1_1.method3062();
			if (local30 >= 0 && local21 >= 0 && local30 < 104 && local21 < 104) {
				local75 = local49 + 1;
				if (Static210.aClass1_Sub2_Sub2_2.anIntArray250[0] >= local30 - local75 && Static210.aClass1_Sub2_Sub2_2.anIntArray250[0] <= local75 + local30 && Static210.aClass1_Sub2_Sub2_2.anIntArray253[0] >= local21 - local75 && local21 + local75 >= Static210.aClass1_Sub2_Sub2_2.anIntArray253[0] && Static188.anInt3751 != 0 && local53 > 0 && Static198.anInt3860 < 50 && local34 != -1) {
					Static110.anIntArray255[Static198.anInt3860] = local34;
					Static27.anIntArray34[Static198.anInt3860] = local53;
					Static103.anIntArray232[Static198.anInt3860] = local57;
					Static184.aClass21Array1[Static198.anInt3860] = null;
					Static173.anIntArray365[Static198.anInt3860] = (local30 << 16) + ((local21 << 8) + local49);
					Static198.anInt3860++;
				}
			}
			return;
		}
		@Pc(235) int local235;
		@Pc(239) int local239;
		@Pc(243) int local243;
		@Pc(231) int local231;
		@Pc(327) Class1_Sub6 local327;
		if (Static196.anInt3834 == 125) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local30 = Static38.anInt830 * 2 + (local14 >> 4 & 0xF);
			local21 = Static210.anInt922 * 2 + (local14 & 0xF);
			local34 = local30 + Static10.aClass5_Sub6_Sub1_1.method3053();
			local43 = Static10.aClass5_Sub6_Sub1_1.method3053() + local21;
			local49 = Static10.aClass5_Sub6_Sub1_1.method3075();
			local53 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local57 = Static10.aClass5_Sub6_Sub1_1.method3062() * 4;
			local75 = Static10.aClass5_Sub6_Sub1_1.method3062() * 4;
			local231 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local235 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local239 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local243 = Static10.aClass5_Sub6_Sub1_1.method3062();
			if (local30 >= 0 && local21 >= 0 && local30 < 208 && local21 < 208 && local34 >= 0 && local43 >= 0 && local34 < 208 && local43 < 208 && local53 != 65535) {
				local34 = local34 * 64;
				local21 = local21 * 64;
				local43 = local43 * 64;
				local30 *= 64;
				local327 = new Class1_Sub6(local53, Static111.anInt2327, local30, local21, Static128.method1999(Static111.anInt2327, local30, local21) - local57, Static177.anInt3533 + local231, local235 + Static177.anInt3533, local239, local243, local49, local75);
				local327.method2314(local231 + Static177.anInt3533, local43, local34, Static128.method1999(Static111.anInt2327, local34, local43) - local75);
				Static75.aClass91_9.method2686(new Class5_Sub2_Sub3(local327));
			}
		} else if (Static196.anInt3834 == 138) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local30 = Static10.aClass5_Sub6_Sub1_1.method3036();
			local34 = Static210.anInt922 + (local30 & 0x7);
			local21 = Static38.anInt830 + (local30 >> 4 & 0x7);
			local43 = Static10.aClass5_Sub6_Sub1_1.method3081();
			if (local21 >= 0 && local34 >= 0 && local21 < 104 && local34 < 104) {
				@Pc(397) Class1_Sub3 local397 = new Class1_Sub3();
				local397.anInt1380 = local14;
				local397.anInt1383 = local43;
				if (Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local21][local34] == null) {
					Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local21][local34] = new Class91();
				}
				Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local21][local34].method2686(new Class5_Sub2_Sub1(local397));
				Static88.method1474(local21, local34);
			}
		} else if (Static196.anInt3834 == 198) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local30 = (local14 >> 4 & 0x7) + Static38.anInt830;
			local21 = (local14 & 0x7) + Static210.anInt922;
			local34 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local43 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local49 = Static10.aClass5_Sub6_Sub1_1.method3077();
			if (local30 >= 0 && local21 >= 0 && local30 < 104 && local21 < 104) {
				@Pc(492) Class91 local492 = Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local30][local21];
				if (local492 != null) {
					for (@Pc(499) Class5_Sub2_Sub1 local499 = (Class5_Sub2_Sub1) local492.method2684(); local499 != null; local499 = (Class5_Sub2_Sub1) local492.method2678()) {
						@Pc(504) Class1_Sub3 local504 = local499.aClass1_Sub3_1;
						if ((local34 & 0x7FFF) == local504.anInt1380 && local504.anInt1383 == local43) {
							local504.anInt1383 = local49;
							break;
						}
					}
					Static88.method1474(local30, local21);
				}
			}
		} else if (Static196.anInt3834 == 24) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3043();
			local30 = Static10.aClass5_Sub6_Sub1_1.method3074();
			local34 = local30 & 0x3;
			local21 = local30 >> 2;
			local43 = Static148.anIntArray322[local21];
			local49 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local53 = Static38.anInt830 + (local49 >> 4 & 0x7);
			local57 = Static210.anInt922 + (local49 & 0x7);
			if (local53 >= 0 && local57 >= 0 && local53 < 104 && local57 < 104) {
				Static159.method2435(local57, local14, 0, Static111.anInt2327, local43, -1, local34, local21, local53);
			}
		} else if (Static196.anInt3834 == 214) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local30 = Static38.anInt830 + (local14 >> 4 & 0x7);
			local21 = Static210.anInt922 + (local14 & 0x7);
			local34 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local43 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local49 = Static10.aClass5_Sub6_Sub1_1.method3077();
			if (local30 >= 0 && local21 >= 0 && local30 < 104 && local21 < 104) {
				local21 = local21 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(683) Class1_Sub7 local683 = new Class1_Sub7(local34, Static111.anInt2327, local30, local21, Static128.method1999(Static111.anInt2327, local30, local21) - local43, local49, Static177.anInt3533);
				Static166.aClass91_15.method2686(new Class5_Sub2_Sub9(local683));
			}
		} else if (Static196.anInt3834 == 134) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local30 = Static38.anInt830 + (local14 >> 4 & 0x7);
			local21 = Static210.anInt922 + (local14 & 0x7);
			local34 = Static10.aClass5_Sub6_Sub1_1.method3043();
			if (local30 >= 0 && local21 >= 0 && local30 < 104 && local21 < 104) {
				@Pc(739) Class91 local739 = Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local30][local21];
				if (local739 != null) {
					for (@Pc(746) Class5_Sub2_Sub1 local746 = (Class5_Sub2_Sub1) local739.method2684(); local746 != null; local746 = (Class5_Sub2_Sub1) local739.method2678()) {
						if (local746.aClass1_Sub3_1.anInt1380 == (local34 & 0x7FFF)) {
							local746.method3207();
							break;
						}
					}
					if (local739.method2684() == null) {
						Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local30][local21] = null;
					}
					Static88.method1474(local30, local21);
				}
			}
		} else if (Static196.anInt3834 == 188) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local21 = (local14 & 0x7) + Static210.anInt922;
			local30 = Static38.anInt830 + (local14 >> 4 & 0x7);
			local34 = Static10.aClass5_Sub6_Sub1_1.method3053() + local30;
			local43 = Static10.aClass5_Sub6_Sub1_1.method3053() + local21;
			local49 = Static10.aClass5_Sub6_Sub1_1.method3075();
			local53 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local57 = Static10.aClass5_Sub6_Sub1_1.method3062() * 4;
			local75 = Static10.aClass5_Sub6_Sub1_1.method3062() * 4;
			local231 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local235 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local239 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local243 = Static10.aClass5_Sub6_Sub1_1.method3062();
			if (local30 >= 0 && local21 >= 0 && local30 < 104 && local21 < 104 && local34 >= 0 && local43 >= 0 && local34 < 104 && local43 < 104 && local53 != 65535) {
				local34 = local34 * 128 + 64;
				local21 = local21 * 128 + 64;
				local43 = local43 * 128 + 64;
				local30 = local30 * 128 + 64;
				local327 = new Class1_Sub6(local53, Static111.anInt2327, local30, local21, Static128.method1999(Static111.anInt2327, local30, local21) - local57, Static177.anInt3533 + local231, local235 + Static177.anInt3533, local239, local243, local49, local75);
				local327.method2314(local231 + Static177.anInt3533, local43, local34, Static128.method1999(Static111.anInt2327, local34, local43) - local75);
				Static75.aClass91_9.method2686(new Class5_Sub2_Sub3(local327));
			}
		} else if (Static196.anInt3834 == 77) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3074();
			local21 = local14 & 0x3;
			local30 = local14 >> 2;
			local34 = Static148.anIntArray322[local30];
			local43 = Static10.aClass5_Sub6_Sub1_1.method3036();
			local49 = Static38.anInt830 + (local43 >> 4 & 0x7);
			local53 = Static210.anInt922 + (local43 & 0x7);
			if (local49 >= 0 && local53 >= 0 && local49 < 104 && local53 < 104) {
				Static159.method2435(local53, -1, 0, Static111.anInt2327, local34, -1, local21, local30, local49);
			}
		} else if (Static196.anInt3834 == 16) {
			local14 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local30 = Static10.aClass5_Sub6_Sub1_1.method3043();
			local21 = Static10.aClass5_Sub6_Sub1_1.method3081();
			local34 = Static10.aClass5_Sub6_Sub1_1.method3062();
			local43 = (local34 >> 4 & 0x7) + Static38.anInt830;
			local49 = Static210.anInt922 + (local34 & 0x7);
			if (local43 >= 0 && local49 >= 0 && local43 < 104 && local49 < 104 && local21 != Static65.anInt1414) {
				@Pc(1083) Class1_Sub3 local1083 = new Class1_Sub3();
				local1083.anInt1380 = local30;
				local1083.anInt1383 = local14;
				if (Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local43][local49] == null) {
					Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local43][local49] = new Class91();
				}
				Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local43][local49].method2686(new Class5_Sub2_Sub1(local1083));
				Static88.method1474(local43, local49);
			}
		} else {
			if (Static196.anInt3834 == 74) {
				local30 = Static10.aClass5_Sub6_Sub1_1.method3074();
				local21 = (local30 >> 4 & 0x7) + Static38.anInt830;
				local34 = Static210.anInt922 + (local30 & 0x7);
				local43 = Static10.aClass5_Sub6_Sub1_1.method3077();
				local49 = Static10.aClass5_Sub6_Sub1_1.method3081();
				@Pc(1168) byte local1168 = Static10.aClass5_Sub6_Sub1_1.method3034();
				@Pc(1172) byte local1172 = Static10.aClass5_Sub6_Sub1_1.method3041();
				@Pc(1176) byte local1176 = Static10.aClass5_Sub6_Sub1_1.method3053();
				@Pc(1180) byte local1180 = Static10.aClass5_Sub6_Sub1_1.method3035();
				local235 = Static10.aClass5_Sub6_Sub1_1.method3062();
				local239 = local235 >> 2;
				@Pc(1192) int local1192 = Static148.anIntArray322[local239];
				@Pc(1196) int local1196 = Static10.aClass5_Sub6_Sub1_1.method3043();
				@Pc(1200) int local1200 = Static10.aClass5_Sub6_Sub1_1.method3081();
				@Pc(1205) Class1_Sub2_Sub2 local1205;
				if (Static65.anInt1414 == local1200) {
					local1205 = Static210.aClass1_Sub2_Sub2_2;
				} else {
					local1205 = Static6.aClass1_Sub2_Sub2Array1[local1200];
				}
				local243 = local235 & 0x3;
				if (local1205 != null) {
					@Pc(1221) Class5_Sub2_Sub7 local1221 = Static63.method1046(local49);
					@Pc(1237) int local1237;
					@Pc(1234) int local1234;
					if (local243 == 1 || local243 == 3) {
						local1234 = local1221.anInt517;
						local1237 = local1221.anInt519;
					} else {
						local1237 = local1221.anInt517;
						local1234 = local1221.anInt519;
					}
					@Pc(1251) int local1251 = (local1237 >> 1) + local21;
					@Pc(1257) int local1257 = (local1234 >> 1) + local34;
					@Pc(1266) int local1266 = local21 + (local1237 + 1 >> 1);
					@Pc(1274) int local1274 = local34 + (local1234 + 1 >> 1);
					@Pc(1278) int[][] local1278 = Static37.anIntArrayArrayArray5[Static111.anInt2327];
					@Pc(1280) int[][] local1280 = null;
					if (Static111.anInt2327 < 3) {
						local1280 = Static37.anIntArrayArrayArray5[Static111.anInt2327 + 1];
					}
					@Pc(1318) int local1318 = local1278[local1251][local1274] + local1278[local1251][local1257] + local1278[local1266][local1257] + local1278[local1266][local1274] >> 2;
					@Pc(1326) int local1326 = (local21 << 7) + (local1237 << 6);
					@Pc(1335) int local1335 = (local34 << 7) + (local1234 << 6);
					@Pc(1347) Class5_Sub2_Sub5 local1347 = local1221.method421(local239, false, local1280, local1278, local1335, local1326, local243, local1318);
					if (local1347 != null) {
						@Pc(1358) byte local1358;
						if (local1176 > local1172) {
							local1358 = local1176;
							local1176 = local1172;
							local1172 = local1358;
						}
						if (local1168 > local1180) {
							local1358 = local1168;
							local1168 = local1180;
							local1180 = local1358;
						}
						Static159.method2435(local34, -1, local1196 + 1, Static111.anInt2327, local1192, local43 + 1, 0, 0, local21);
						local1205.aClass1_Sub1_1 = (Class1_Sub1) local1347.aClass1_1;
						local1205.anInt2272 = local1196 + Static177.anInt3533;
						local1205.anInt2293 = local43 + Static177.anInt3533;
						local1205.anInt2288 = local1318;
						local1205.anInt2279 = local1172 + local21;
						local1205.anInt2277 = local21 + local1176;
						local1205.anInt2280 = local1168 + local34;
						local1205.anInt2271 = local1234 * 64 + local34 * 128;
						local1205.anInt2283 = local34 + local1180;
						local1205.anInt2282 = local21 * 128 + local1237 * 64;
					}
				}
			}
			if (Static196.anInt3834 == 60) {
				local30 = Static10.aClass5_Sub6_Sub1_1.method3059();
				local21 = Static38.anInt830 + (local30 >> 4 & 0x7);
				local34 = Static210.anInt922 + (local30 & 0x7);
				local43 = Static10.aClass5_Sub6_Sub1_1.method3081();
				local49 = Static10.aClass5_Sub6_Sub1_1.method3059();
				local57 = local49 & 0x3;
				if (local43 == 65535) {
					local43 = -1;
				}
				local53 = local49 >> 2;
				local75 = Static148.anIntArray322[local53];
				Static116.method1861(local75, local21, local34, local43, local53, Static111.anInt2327, local57);
			}
		}
	}
}
