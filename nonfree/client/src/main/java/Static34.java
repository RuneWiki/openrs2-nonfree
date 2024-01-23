import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt831;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!kh;")
	private static Class60 aClass60_269 = Static200.method3116("Examine");

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!jh;")
	public static Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_273 = Static200.method3116("New User");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_270 = aClass60_273;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_271 = aClass60_269;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_272 = Static200.method3116("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_274 = Static200.method3116("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!db", name = "w", descriptor = "[I")
	public static int[] anIntArray123 = new int[100];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method608(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static6.anIntArrayArray4[local3][local7] = 0;
				Static42.anIntArrayArray17[local3][local7] = 99999999;
			}
		}
		Static6.anIntArrayArray4[arg8][arg6] = 99;
		Static42.anIntArrayArray17[arg8][arg6] = 0;
		local7 = arg8;
		@Pc(53) int local53 = arg6;
		@Pc(55) boolean local55 = false;
		@Pc(57) int local57 = 0;
		@Pc(59) byte local59 = 0;
		Static22.anIntArray88[0] = arg8;
		@Pc(66) int local66 = local59 + 1;
		Static214.anIntArray615[0] = arg6;
		@Pc(73) int[][] local73 = Static153.aClass3Array1[Static180.anInt3841].anIntArrayArray1;
		@Pc(190) int local190;
		while (local57 != local66) {
			local53 = Static214.anIntArray615[local57];
			local7 = Static22.anIntArray88[local57];
			local57 = local57 + 1 & 0xFFF;
			if (local7 == arg1 && local53 == arg4) {
				local55 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static153.aClass3Array1[Static180.anInt3841].method37(arg4, arg2, local53, arg5 - 1, local7, 2, arg1)) {
					local55 = true;
					break;
				}
				if (arg5 < 10 && Static153.aClass3Array1[Static180.anInt3841].method53(local7, 2, arg5 - 1, arg4, local53, arg2, arg1)) {
					local55 = true;
					break;
				}
			}
			if (arg7 != 0 && arg10 != 0 && Static153.aClass3Array1[Static180.anInt3841].method48(arg10, 2, arg4, local53, arg1, arg9, arg7, local7)) {
				local55 = true;
				break;
			}
			local190 = Static42.anIntArrayArray17[local7][local53] + 1;
			if (local7 > 0 && Static6.anIntArrayArray4[local7 - 1][local53] == 0 && (local73[local7 - 1][local53] & 0x12C010E) == 0 && (local73[local7 - 1][local53 + 1] & 0x12C0138) == 0) {
				Static22.anIntArray88[local66] = local7 - 1;
				Static214.anIntArray615[local66] = local53;
				local66 = local66 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7 - 1][local53] = 2;
				Static42.anIntArrayArray17[local7 - 1][local53] = local190;
			}
			if (local7 < 102 && Static6.anIntArrayArray4[local7 + 1][local53] == 0 && (local73[local7 + 2][local53] & 0x12C0183) == 0 && (local73[local7 + 2][local53 + 1] & 0x12C01E0) == 0) {
				Static22.anIntArray88[local66] = local7 + 1;
				Static214.anIntArray615[local66] = local53;
				Static6.anIntArrayArray4[local7 + 1][local53] = 8;
				Static42.anIntArrayArray17[local7 + 1][local53] = local190;
				local66 = local66 + 1 & 0xFFF;
			}
			if (local53 > 0 && Static6.anIntArrayArray4[local7][local53 - 1] == 0 && (local73[local7][local53 - 1] & 0x12C010E) == 0 && (local73[local7 + 1][local53 - 1] & 0x12C0183) == 0) {
				Static22.anIntArray88[local66] = local7;
				Static214.anIntArray615[local66] = local53 - 1;
				local66 = local66 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7][local53 - 1] = 1;
				Static42.anIntArrayArray17[local7][local53 - 1] = local190;
			}
			if (local53 < 102 && Static6.anIntArrayArray4[local7][local53 + 1] == 0 && (local73[local7][local53 + 2] & 0x12C0138) == 0 && (local73[local7 + 1][local53 + 2] & 0x12C01E0) == 0) {
				Static22.anIntArray88[local66] = local7;
				Static214.anIntArray615[local66] = local53 + 1;
				Static6.anIntArrayArray4[local7][local53 + 1] = 4;
				local66 = local66 + 1 & 0xFFF;
				Static42.anIntArrayArray17[local7][local53 + 1] = local190;
			}
			if (local7 > 0 && local53 > 0 && Static6.anIntArrayArray4[local7 - 1][local53 - 1] == 0 && (local73[local7 - 1][local53] & 0x12C0138) == 0 && (local73[local7 - 1][local53 - 1] & 0x12C010E) == 0 && (local73[local7][local53 - 1] & 0x12C0183) == 0) {
				Static22.anIntArray88[local66] = local7 - 1;
				Static214.anIntArray615[local66] = local53 - 1;
				local66 = local66 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7 - 1][local53 - 1] = 3;
				Static42.anIntArrayArray17[local7 - 1][local53 - 1] = local190;
			}
			if (local7 < 102 && local53 > 0 && Static6.anIntArrayArray4[local7 + 1][local53 - 1] == 0 && (local73[local7 + 1][local53 - 1] & 0x12C010E) == 0 && (local73[local7 + 2][local53 - 1] & 0x12C0183) == 0 && (local73[local7 + 2][local53] & 0x12C01E0) == 0) {
				Static22.anIntArray88[local66] = local7 + 1;
				Static214.anIntArray615[local66] = local53 - 1;
				Static6.anIntArrayArray4[local7 + 1][local53 - 1] = 9;
				Static42.anIntArrayArray17[local7 + 1][local53 - 1] = local190;
				local66 = local66 + 1 & 0xFFF;
			}
			if (local7 > 0 && local53 < 102 && Static6.anIntArrayArray4[local7 - 1][local53 + 1] == 0 && (local73[local7 - 1][local53 + 1] & 0x12C010E) == 0 && (local73[local7 - 1][local53 + 2] & 0x12C0138) == 0 && (local73[local7][local53 + 2] & 0x12C01E0) == 0) {
				Static22.anIntArray88[local66] = local7 - 1;
				Static214.anIntArray615[local66] = local53 + 1;
				local66 = local66 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7 - 1][local53 + 1] = 6;
				Static42.anIntArrayArray17[local7 - 1][local53 + 1] = local190;
			}
			if (local7 < 102 && local53 < 102 && Static6.anIntArrayArray4[local7 + 1][local53 + 1] == 0 && (local73[local7 + 1][local53 + 2] & 0x12C0138) == 0 && (local73[local7 + 2][local53 + 2] & 0x12C01E0) == 0 && (local73[local7 + 2][local53 + 1] & 0x12C0183) == 0) {
				Static22.anIntArray88[local66] = local7 + 1;
				Static214.anIntArray615[local66] = local53 + 1;
				local66 = local66 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7 + 1][local53 + 1] = 12;
				Static42.anIntArrayArray17[local7 + 1][local53 + 1] = local190;
			}
		}
		Static193.anInt4130 = 0;
		@Pc(872) int local872;
		if (!local55) {
			if (!arg0) {
				return false;
			}
			local872 = 100;
			local190 = 1000;
			for (@Pc(881) int local881 = arg1 - 10; local881 <= arg1 + 10; local881++) {
				for (@Pc(888) int local888 = arg4 - 10; local888 <= arg4 + 10; local888++) {
					if (local881 >= 0 && local888 >= 0 && local881 < 104 && local888 < 104 && Static42.anIntArrayArray17[local881][local888] < 100) {
						@Pc(914) int local914 = 0;
						if (local881 < arg1) {
							local914 = arg1 - local881;
						} else if (arg1 + arg7 - 1 < local881) {
							local914 = local881 + 1 - arg7 - arg1;
						}
						@Pc(950) int local950 = 0;
						if (local888 < arg4) {
							local950 = arg4 - local888;
						} else if (arg10 + arg4 - 1 < local888) {
							local950 = local888 + 1 - arg4 - arg10;
						}
						@Pc(984) int local984 = local950 * local950 + local914 * local914;
						if (local984 < local190 || local984 == local190 && local872 > Static42.anIntArrayArray17[local881][local888]) {
							local190 = local984;
							local7 = local881;
							local872 = Static42.anIntArrayArray17[local881][local888];
							local53 = local888;
						}
					}
				}
			}
			if (local190 == 1000) {
				return false;
			}
			if (arg8 == local7 && arg6 == local53) {
				return false;
			}
			Static193.anInt4130 = 1;
		}
		@Pc(1052) byte local1052 = 0;
		Static22.anIntArray88[0] = local7;
		local57 = local1052 + 1;
		Static214.anIntArray615[0] = local53;
		local190 = local872 = Static6.anIntArrayArray4[local7][local53];
		while (arg8 != local7 || arg6 != local53) {
			if (local190 != local872) {
				Static22.anIntArray88[local57] = local7;
				local872 = local190;
				Static214.anIntArray615[local57++] = local53;
			}
			if ((local190 & 0x1) != 0) {
				local53++;
			} else if ((local190 & 0x4) != 0) {
				local53--;
			}
			if ((local190 & 0x2) != 0) {
				local7++;
			} else if ((local190 & 0x8) != 0) {
				local7--;
			}
			local190 = Static6.anIntArrayArray4[local7][local53];
		}
		if (local57 > 0) {
			Static94.method1625(arg3, Static214.anIntArray615, local57, Static22.anIntArray88);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lclient!kh;)Lclient!kh;")
	public static Class60 method611(@OriginalArg(1) Class60[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static82.method1453(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V")
	public static void method614(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static135.anInt2930; local18++) {
			if (arg0 == Static29.aLongArray1[local18]) {
				Static135.anInt2930--;
				for (@Pc(36) int local36 = local18; local36 < Static135.anInt2930; local36++) {
					Static61.aClass60Array9[local36] = Static61.aClass60Array9[local36 + 1];
					Static90.anIntArray247[local36] = Static90.anIntArray247[local36 + 1];
					Static167.aClass60Array27[local36] = Static167.aClass60Array27[local36 + 1];
					Static29.aLongArray1[local36] = Static29.aLongArray1[local36 + 1];
					Static213.anIntArray610[local36] = Static213.anIntArray610[local36 + 1];
					Static132.aBooleanArray18[local36] = Static132.aBooleanArray18[local36 + 1];
				}
				Static181.anInt3848 = Static171.anInt3707;
				Static96.aClass1_Sub9_Sub1_3.method953(121);
				Static96.aClass1_Sub9_Sub1_3.method897(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
	public static int method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg5;
			arg5 = local12;
		}
		@Pc(25) int local25 = arg0 & 0x3;
		if (local25 == 0) {
			return arg4;
		} else if (local25 == 1) {
			return arg3;
		} else if (local25 == 2) {
			return 7 + 1 - arg4 - arg2;
		} else {
			return 8 - arg3 - arg5;
		}
	}
}
