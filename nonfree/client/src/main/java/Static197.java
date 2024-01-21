import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!uh", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!uh", name = "lb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1417 = Static151.method2243("flash3:");

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1418 = aClass62_1417;

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1419 = Static151.method2243("null");

	@OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1420 = Static151.method2243("labels)3dat");

	@OriginalMember(owner = "client!uh", name = "Z", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1421 = Static151.method2243("yellow:");

	@OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1422 = aClass62_1421;

	@OriginalMember(owner = "client!uh", name = "bb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1423 = Static151.method2243("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!uh", name = "db", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1424 = Static151.method2243("title_mute");

	@OriginalMember(owner = "client!uh", name = "jb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1425 = Static151.method2243("blinken3:");

	@OriginalMember(owner = "client!uh", name = "kb", descriptor = "I")
	public static int anInt4088 = 0;

	@OriginalMember(owner = "client!uh", name = "mb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1426 = aClass62_1421;

	@OriginalMember(owner = "client!uh", name = "nb", descriptor = "I")
	public static int anInt4089 = 0;

	@OriginalMember(owner = "client!uh", name = "qb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1427 = aClass62_1417;

	@OriginalMember(owner = "client!uh", name = "rb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1428 = Static151.method2243("0(U");

	@OriginalMember(owner = "client!uh", name = "sb", descriptor = "Z")
	public static volatile boolean aBoolean180 = true;

	@OriginalMember(owner = "client!uh", name = "tb", descriptor = "I")
	public static int anInt4092 = -1;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!mb;I)V")
	public static void method2838(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class62 local7 = arg0.method1882().method1876();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static145.anInt3126; local15++) {
			@Pc(23) Class7_Sub2_Sub2 local23 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local15]];
			if (local23 != null && local23.aClass62_1072 != null && local23.aClass62_1072.method1858(local7)) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local23.anIntArray275[0], 2, local23.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				if (arg1 == 1) {
					Static58.aClass2_Sub11_Sub1_2.method1595(146);
					Static58.aClass2_Sub11_Sub1_2.method1578(Static28.anIntArray60[local15]);
				} else if (arg1 == 4) {
					Static58.aClass2_Sub11_Sub1_2.method1595(103);
					Static58.aClass2_Sub11_Sub1_2.method1559(Static28.anIntArray60[local15]);
				} else if (arg1 == 6) {
					Static58.aClass2_Sub11_Sub1_2.method1595(76);
					Static58.aClass2_Sub11_Sub1_2.method1582(Static28.anIntArray60[local15]);
				} else if (arg1 == 7) {
					Static58.aClass2_Sub11_Sub1_2.method1595(142);
					Static58.aClass2_Sub11_Sub1_2.method1533(Static28.anIntArray60[local15]);
				}
				local13 = true;
				break;
			}
		}
		if (!local13) {
			Static154.method2292(Static169.method2460(new Class62[] { Static150.aClass62_1051, local7 }), 0, Static69.aClass62_484);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!dh;II)V")
	public static void method2839(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt3069 > Static25.anInt581) {
			Static87.method1235(arg0);
		} else if (Static25.anInt581 > arg0.anInt3100) {
			Static175.method2546(arg0);
		} else {
			Static48.method734(arg0);
		}
		if (arg0.anInt3046 < 128 || arg0.anInt3085 < 128 || arg0.anInt3046 >= 13184 || arg0.anInt3085 >= 13184) {
			arg0.anInt3046 = arg0.anIntArray275[0] * 128 + arg0.anInt3048 * 64;
			arg0.anInt3100 = 0;
			arg0.anInt3091 = -1;
			arg0.anInt3085 = arg0.anInt3048 * 64 + arg0.anIntArray274[0] * 128;
			arg0.anInt3062 = -1;
			arg0.anInt3069 = 0;
			arg0.method2173();
		}
		if (arg0 == Static186.aClass7_Sub2_Sub2_1 && (arg0.anInt3046 < 1536 || arg0.anInt3085 < 1536 || arg0.anInt3046 >= 11776 || arg0.anInt3085 >= 11776)) {
			arg0.anInt3085 = arg0.anInt3048 * 64 + arg0.anIntArray274[0] * 128;
			arg0.anInt3069 = 0;
			arg0.anInt3046 = arg0.anIntArray275[0] * 128 + arg0.anInt3048 * 64;
			arg0.anInt3100 = 0;
			arg0.anInt3091 = -1;
			arg0.anInt3062 = -1;
			arg0.method2173();
		}
		Static101.method1614(arg0);
		Static88.method1249(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIZII[B[II)V")
	public static void method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = -(arg4 >> 2);
		@Pc(22) int local22 = -(arg4 & 0x3);
		for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
			for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
				if (arg6[arg8++] == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2;
				}
				if (arg6[arg8++] == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2;
				}
				if (arg6[arg8++] == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2;
				}
				if (arg6[arg8++] == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2;
				}
			}
			for (@Pc(97) int local97 = local22; local97 < 0; local97++) {
				if (arg6[arg8++] == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2;
				}
			}
			arg3 += arg5;
			arg8 += arg1;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI[Lclient!tf;[B)V")
	public static void method2841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95[] arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg3);
		@Pc(26) int local26 = -1;
		while (true) {
			@Pc(30) int local30 = local10.method1574();
			if (local30 == 0) {
				return;
			}
			local26 += local30;
			@Pc(41) int local41 = 0;
			while (true) {
				@Pc(45) int local45 = local10.method1572();
				if (local45 == 0) {
					break;
				}
				local41 += local45 - 1;
				@Pc(57) int local57 = local41 & 0x3F;
				@Pc(63) int local63 = local41 >> 6 & 0x3F;
				@Pc(67) int local67 = local10.method1534();
				@Pc(71) int local71 = local41 >> 12;
				@Pc(75) int local75 = local67 >> 2;
				@Pc(79) int local79 = local67 & 0x3;
				@Pc(83) int local83 = arg1 + local63;
				@Pc(87) int local87 = arg0 + local57;
				if (local83 > 0 && local87 > 0 && local83 < 103 && local87 < 103) {
					@Pc(102) int local102 = local71;
					if ((Static133.aByteArrayArrayArray11[1][local83][local87] & 0x2) == 2) {
						local102 = local71 - 1;
					}
					@Pc(116) Class95 local116 = null;
					if (local102 >= 0) {
						local116 = arg2[local102];
					}
					Static146.method2191(local75, local26, local71, Static60.aBoolean52, local83, local87, local79, local116, local71, true);
				}
			}
		}
	}
}
