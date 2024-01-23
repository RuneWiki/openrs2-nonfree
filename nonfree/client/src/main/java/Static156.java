import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!le", name = "t", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public static int anInt2936;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!mm;")
	public static Class115 aClass115_6 = new Class115();

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!l;")
	public static Class98 aClass98_23 = new Class98(64);

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
	public static int[] anIntArray336 = new int[32];

	@OriginalMember(owner = "client!le", name = "x", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method2595(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(15) int local15 = 0; local15 < Static152.anInt2869; local15++) {
			@Pc(24) Class10_Sub5_Sub1 local24 = Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local15]];
			if (local24 != null && local24.aString124 != null && local24.aString124.equalsIgnoreCase(arg1)) {
				local7 = true;
				if (arg0 == 1) {
					Static215.aClass3_Sub26_Sub1_2.method3958(229);
					Static215.aClass3_Sub26_Sub1_2.method3897(Static102.anIntArray188[local15]);
					Static215.aClass3_Sub26_Sub1_2.method3907(0);
				} else if (arg0 == 4) {
					Static215.aClass3_Sub26_Sub1_2.method3958(180);
					Static215.aClass3_Sub26_Sub1_2.method3897(Static102.anIntArray188[local15]);
					Static215.aClass3_Sub26_Sub1_2.method3919(0);
				} else if (arg0 == 5) {
					Static215.aClass3_Sub26_Sub1_2.method3958(175);
					Static215.aClass3_Sub26_Sub1_2.method3912(0);
					Static215.aClass3_Sub26_Sub1_2.method3938(Static102.anIntArray188[local15]);
				} else if (arg0 == 6) {
					Static215.aClass3_Sub26_Sub1_2.method3958(207);
					Static215.aClass3_Sub26_Sub1_2.method3919(0);
					Static215.aClass3_Sub26_Sub1_2.method3892(Static102.anIntArray188[local15]);
				} else if (arg0 == 7) {
					Static215.aClass3_Sub26_Sub1_2.method3958(32);
					Static215.aClass3_Sub26_Sub1_2.method3940(Static102.anIntArray188[local15]);
					Static215.aClass3_Sub26_Sub1_2.method3919(0);
				}
				break;
			}
		}
		if (!local7) {
			Static199.method3284(Static25.aString13 + arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method2596() {
		Static206.aClass98_34.method2571();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIIIIIIIIZ)V")
	public static void method2597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = 0; local7 < 104; local7++) {
			for (local14 = 0; local14 < 104; local14++) {
				Static158.anIntArrayArray46[local7][local14] = 0;
				Static57.anIntArrayArray14[local7][local14] = 99999999;
			}
		}
		local7 = arg5;
		Static158.anIntArrayArray46[arg5][arg1] = 99;
		local14 = arg1;
		Static57.anIntArrayArray14[arg5][arg1] = 0;
		@Pc(58) byte local58 = 0;
		@Pc(60) int local60 = 0;
		Static76.anIntArray141[0] = arg5;
		@Pc(67) int local67 = local58 + 1;
		Static35.anIntArray55[0] = arg1;
		@Pc(71) boolean local71 = false;
		@Pc(76) int[][] local76 = Static138.aClass153Array1[Static99.anInt1826].anIntArrayArray69;
		@Pc(195) int local195;
		while (local60 != local67) {
			local7 = Static76.anIntArray141[local60];
			local14 = Static35.anIntArray55[local60];
			local60 = local60 + 1 & 0xFFF;
			if (local7 == arg3 && arg2 == local14) {
				local71 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static138.aClass153Array1[Static99.anInt1826].method4086(arg2, arg0 - 1, 1, local7, local14, arg3, arg8)) {
					local71 = true;
					break;
				}
				if (arg0 < 10 && Static138.aClass153Array1[Static99.anInt1826].method4077(arg3, arg0 - 1, arg8, local14, arg2, local7, 1)) {
					local71 = true;
					break;
				}
			}
			if (arg7 != 0 && arg4 != 0 && Static138.aClass153Array1[Static99.anInt1826].method4079(arg7, arg4, local14, local7, 1, arg2, arg3, arg6)) {
				local71 = true;
				break;
			}
			local195 = Static57.anIntArrayArray14[local7][local14] + 1;
			if (local7 > 0 && Static158.anIntArrayArray46[local7 - 1][local14] == 0 && (local76[local7 - 1][local14] & 0x2C0108) == 0) {
				Static76.anIntArray141[local67] = local7 - 1;
				Static35.anIntArray55[local67] = local14;
				Static158.anIntArrayArray46[local7 - 1][local14] = 2;
				local67 = local67 + 1 & 0xFFF;
				Static57.anIntArrayArray14[local7 - 1][local14] = local195;
			}
			if (local7 < 103 && Static158.anIntArrayArray46[local7 + 1][local14] == 0 && (local76[local7 + 1][local14] & 0x2C0180) == 0) {
				Static76.anIntArray141[local67] = local7 + 1;
				Static35.anIntArray55[local67] = local14;
				local67 = local67 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local7 + 1][local14] = 8;
				Static57.anIntArrayArray14[local7 + 1][local14] = local195;
			}
			if (local14 > 0 && Static158.anIntArrayArray46[local7][local14 - 1] == 0 && (local76[local7][local14 - 1] & 0x2C0102) == 0) {
				Static76.anIntArray141[local67] = local7;
				Static35.anIntArray55[local67] = local14 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local7][local14 - 1] = 1;
				Static57.anIntArrayArray14[local7][local14 - 1] = local195;
			}
			if (local14 < 103 && Static158.anIntArrayArray46[local7][local14 + 1] == 0 && (local76[local7][local14 + 1] & 0x2C0120) == 0) {
				Static76.anIntArray141[local67] = local7;
				Static35.anIntArray55[local67] = local14 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local7][local14 + 1] = 4;
				Static57.anIntArrayArray14[local7][local14 + 1] = local195;
			}
			if (local7 > 0 && local14 > 0 && Static158.anIntArrayArray46[local7 - 1][local14 - 1] == 0 && (local76[local7 - 1][local14 - 1] & 0x2C010E) == 0 && (local76[local7 - 1][local14] & 0x2C0108) == 0 && (local76[local7][local14 - 1] & 0x2C0102) == 0) {
				Static76.anIntArray141[local67] = local7 - 1;
				Static35.anIntArray55[local67] = local14 - 1;
				Static158.anIntArrayArray46[local7 - 1][local14 - 1] = 3;
				local67 = local67 + 1 & 0xFFF;
				Static57.anIntArrayArray14[local7 - 1][local14 - 1] = local195;
			}
			if (local7 < 103 && local14 > 0 && Static158.anIntArrayArray46[local7 + 1][local14 - 1] == 0 && (local76[local7 + 1][local14 - 1] & 0x2C0183) == 0 && (local76[local7 + 1][local14] & 0x2C0180) == 0 && (local76[local7][local14 - 1] & 0x2C0102) == 0) {
				Static76.anIntArray141[local67] = local7 + 1;
				Static35.anIntArray55[local67] = local14 - 1;
				local67 = local67 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local7 + 1][local14 - 1] = 9;
				Static57.anIntArrayArray14[local7 + 1][local14 - 1] = local195;
			}
			if (local7 > 0 && local14 < 103 && Static158.anIntArrayArray46[local7 - 1][local14 + 1] == 0 && (local76[local7 - 1][local14 + 1] & 0x2C0138) == 0 && (local76[local7 - 1][local14] & 0x2C0108) == 0 && (local76[local7][local14 + 1] & 0x2C0120) == 0) {
				Static76.anIntArray141[local67] = local7 - 1;
				Static35.anIntArray55[local67] = local14 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local7 - 1][local14 + 1] = 6;
				Static57.anIntArrayArray14[local7 - 1][local14 + 1] = local195;
			}
			if (local7 < 103 && local14 < 103 && Static158.anIntArrayArray46[local7 + 1][local14 + 1] == 0 && (local76[local7 + 1][local14 + 1] & 0x2C01E0) == 0 && (local76[local7 + 1][local14] & 0x2C0180) == 0 && (local76[local7][local14 + 1] & 0x2C0120) == 0) {
				Static76.anIntArray141[local67] = local7 + 1;
				Static35.anIntArray55[local67] = local14 + 1;
				Static158.anIntArrayArray46[local7 + 1][local14 + 1] = 12;
				Static57.anIntArrayArray14[local7 + 1][local14 + 1] = local195;
				local67 = local67 + 1 & 0xFFF;
			}
		}
		if (!local71) {
			local195 = 1000;
			@Pc(828) int local828 = 100;
			for (@Pc(835) int local835 = arg3 - 10; local835 <= arg3 + 10; local835++) {
				for (@Pc(849) int local849 = arg2 - 10; local849 <= arg2 + 10; local849++) {
					if (local835 >= 0 && local849 >= 0 && local835 < 104 && local849 < 104 && Static57.anIntArrayArray14[local835][local849] < 100) {
						@Pc(887) int local887 = 0;
						if (arg2 > local849) {
							local887 = arg2 - local849;
						} else if (local849 > arg4 + arg2 - 1) {
							local887 = local849 + 1 - arg4 - arg2;
						}
						@Pc(922) int local922 = 0;
						if (arg3 > local835) {
							local922 = arg3 - local835;
						} else if (local835 > arg7 + arg3 - 1) {
							local922 = local835 + 1 - arg7 - arg3;
						}
						@Pc(964) int local964 = local922 * local922 + local887 * local887;
						if (local195 > local964 || local964 == local195 && Static57.anIntArrayArray14[local835][local849] < local828) {
							local7 = local835;
							local14 = local849;
							local828 = Static57.anIntArrayArray14[local835][local849];
							local195 = local964;
						}
					}
				}
			}
			if (local195 == 1000) {
				return;
			}
			if (arg5 == local7 && arg1 == local14) {
				return;
			}
		}
		Static6.aBoolean11 = false;
		Static247.anInt4992 = local14;
		Static81.anInt1533 = local7;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V")
	public static void method2598(@OriginalArg(0) boolean arg0) {
		Static226.method3660(Static87.anInt4430, Static23.aFloat9, Static295.aFloat60, Static185.aFloat51);
		Static226.method3658(Static252.anInt5209, Static23.anInt431, arg0);
		Static226.method3655((float) Static31.anInt572, (float) Static310.anInt6112, (float) Static113.anInt2102);
		Static226.method3654();
		Static303.aFloat73 = Static41.aFloat11;
		Static56.aClass3_Sub4_Sub24_3 = Static177.aClass3_Sub4_Sub24_5;
		Static303.aFloat72 = Static224.aFloat75;
		Static303.aFloat74 = Static78.aFloat20;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method2599() {
		Static308.aClass98_47.method2571();
		Static79.aClass98_13.method2571();
		Static248.aClass98_39.method2571();
		Static64.aClass98_10.method2571();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method2600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 <= arg2) {
			for (local6 = arg1; local6 < arg2; local6++) {
				Static129.anIntArrayArray40[local6][arg0] = arg3;
			}
		} else {
			for (local6 = arg2; local6 < arg1; local6++) {
				Static129.anIntArrayArray40[local6][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
	public static void method2603(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 4);
		local8.method970();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)I")
	public static int method2604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lclient!vd;")
	public static Class3_Sub4_Sub22 method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg0;
		@Pc(18) Class3_Sub4_Sub22 local18 = (Class3_Sub4_Sub22) Static155.aClass33_6.method828((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static195.aClass155_82.method4137(Static195.aClass155_82.method4122(local9));
		if (local32 == null) {
			local9 = arg0 | arg2 + 65536 << 8;
			local18 = (Class3_Sub4_Sub22) Static155.aClass33_6.method828((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local32 = Static195.aClass155_82.method4137(Static195.aClass155_82.method4122(local9));
			if (local32 == null) {
				local9 = arg0 | 0xFFFF00;
				local18 = (Class3_Sub4_Sub22) Static155.aClass33_6.method828((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local32 = Static195.aClass155_82.method4137(Static195.aClass155_82.method4122(local9));
				if (local32 == null) {
					return null;
				} else if (local32.length > 1) {
					local18 = Static306.method4924(local32);
					local18.anInt5814 = arg0;
					Static155.aClass33_6.method827(local18, (long) local9 << 16);
					return local18;
				} else {
					return null;
				}
			} else if (local32.length > 1) {
				local18 = Static306.method4924(local32);
				local18.anInt5814 = arg0;
				Static155.aClass33_6.method827(local18, (long) local9 << 16);
				return local18;
			} else {
				return null;
			}
		} else if (local32.length > 1) {
			local18 = Static306.method4924(local32);
			local18.anInt5814 = arg0;
			Static155.aClass33_6.method827(local18, (long) local9 << 16);
			return local18;
		} else {
			return null;
		}
	}
}
