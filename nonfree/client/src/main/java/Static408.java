import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!un", name = "f", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_178 = new Class81(13, -1);

	@OriginalMember(owner = "client!un", name = "l", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_146 = new Class256("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!un", name = "m", descriptor = "I")
	public static int anInt7081 = -1;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	public static int anInt7082 = 0;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZLclient!pc;ZI)V")
	public static void method5525(@OriginalArg(1) int arg0, @OriginalArg(3) Class188 arg1, @OriginalArg(5) int arg2) {
		Static158.anInt3122 = 10000;
		Static229.anInt4373 = arg2;
		Static206.aBoolean322 = false;
		Static434.anInt7559 = arg0;
		Static391.aClass188_113 = arg1;
		Static415.anInt7247 = 1;
		Static358.anInt6316 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)I")
	public static int method5526(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZII)V")
	public static void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static148.method2189(arg4, arg1, arg2, arg3);
		} else if (arg1 - arg2 >= Static331.anInt5894 && arg2 + arg1 <= Static351.anInt6176 && arg4 - arg0 >= Static75.anInt1858 && arg0 + arg4 <= Static175.anInt3399) {
			Static289.method5199(arg0, arg1, arg3, arg4, arg2);
		} else {
			Static335.method1092(arg4, arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIILclient!cl;[II[IIBIZ)I")
	public static int method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class37 arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static225.anIntArrayArray35[local3][local7] = 0;
				Static266.anIntArrayArray38[local3][local7] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg9 == 1) {
			local49 = Static34.method448(arg7, arg3, arg5, arg2, arg4, arg0, arg6, arg11, arg1, arg12);
		} else if (arg9 == 2) {
			local49 = Static380.method5299(arg4, arg12, arg2, arg3, arg5, arg1, arg0, arg6, arg11, arg7);
		} else {
			local49 = Static250.method3257(arg1, arg7, arg9, arg6, arg11, arg4, arg12, arg5, arg2, arg0, arg3);
		}
		@Pc(89) int local89 = arg4 - 64;
		@Pc(93) int local93 = arg6 - 64;
		@Pc(95) int local95 = Static369.anInt6567;
		@Pc(102) int local102 = Static433.anInt7533;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local49) {
			if (!arg13) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg11 - 10; local119 <= arg11 + 10; local119++) {
				for (@Pc(126) int local126 = arg3 - 10; local126 <= arg3 + 10; local126++) {
					@Pc(133) int local133 = local119 - local89;
					@Pc(137) int local137 = local126 - local93;
					if (local133 >= 0 && local137 >= 0 && local133 < 128 && local137 < 128 && Static266.anIntArrayArray38[local133][local137] < 100) {
						@Pc(166) int local166 = 0;
						if (arg11 > local119) {
							local166 = arg11 - local119;
						} else if (arg12 + arg11 - 1 < local119) {
							local166 = local119 + 1 - arg11 - arg12;
						}
						@Pc(193) int local193 = 0;
						if (arg3 > local126) {
							local193 = arg3 - local126;
						} else if (local126 > arg1 + arg3 - 1) {
							local193 = local126 + 1 - arg3 - arg1;
						}
						@Pc(236) int local236 = local166 * local166 + local193 * local193;
						if (local110 > local236 || local110 == local236 && local112 > Static266.anIntArrayArray38[local133][local137]) {
							local95 = local119;
							local112 = Static266.anIntArrayArray38[local133][local137];
							local110 = local236;
							local102 = local126;
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg4 == local95 && local102 == arg6) {
			return 0;
		}
		@Pc(300) byte local300 = 0;
		Static378.anIntArray443[0] = local95;
		local110 = local300 + 1;
		Static351.anIntArray416[0] = local102;
		@Pc(322) int local322;
		local112 = local322 = Static225.anIntArrayArray35[local95 - local89][local102 - local93];
		while (local95 != arg4 || local102 != arg6) {
			if (local112 != local322) {
				Static378.anIntArray443[local110] = local95;
				local322 = local112;
				Static351.anIntArray416[local110++] = local102;
			}
			if ((local112 & 0x2) != 0) {
				local95++;
			} else if ((local112 & 0x8) != 0) {
				local95--;
			}
			if ((local112 & 0x1) != 0) {
				local102++;
			} else if ((local112 & 0x4) != 0) {
				local102--;
			}
			local112 = Static225.anIntArrayArray35[local95 - local89][local102 - local93];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg10[local119] = Static378.anIntArray443[local110];
			arg8[local119++] = Static351.anIntArray416[local110];
			if (local119 >= arg10.length) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!qa;Lclient!cr;I)V")
	public static void method5533(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class41 arg1) {
		@Pc(31) boolean local31 = Static350.aClass149_2.method3485(arg0, arg1.anInt1678, arg1.anInt1648 | 0xFF000000, arg1.anInt1651, arg1.anInt1606, arg1.anInt1671, arg1.lb ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null) == null;
		if (local31) {
			Static60.aClass265_14.method5999(new Class2_Sub8(arg1.anInt1671, arg1.anInt1678, arg1.anInt1606, arg1.anInt1648 | 0xFF000000, arg1.anInt1651, arg1.lb));
		}
	}
}
