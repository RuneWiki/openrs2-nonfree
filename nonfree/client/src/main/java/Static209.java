import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!ct;")
	public static Class30 aClass30_63;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	public static int anInt4165;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	public static final int[] anIntArray346 = new int[500];

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_141 = new Class106("M", "M", "M", "M");

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
	public static boolean aBoolean308 = true;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public static int anInt4164 = 0;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIILclient!th;IZII)Z")
	public static boolean method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class196 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg8 - 64;
		Static243.anIntArrayArray52[64][64] = 99;
		@Pc(28) int local28 = arg5 - 64;
		Static226.anIntArrayArray42[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static181.anIntArray282[0] = arg8;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static77.anIntArray138[0] = arg5;
		@Pc(50) int[][] local50 = arg7.anIntArrayArray66;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(82) int local82;
				@Pc(87) int local87;
				@Pc(237) int local237;
				@Pc(276) int local276;
				do {
					do {
						do {
							label259: do {
								if (local45 == local42) {
									Static5.anInt194 = local7;
									Static225.anInt4529 = local9;
									return false;
								}
								local7 = Static181.anIntArray282[local42];
								local9 = Static77.anIntArray138[local42];
								local42 = local42 + 1 & 0xFFF;
								local71 = local7 - local18;
								local76 = local9 - local28;
								local82 = local7 - arg7.anInt5923;
								local87 = local9 - arg7.anInt5905;
								if (arg9 == -4) {
									if (local7 == arg2 && local9 == arg6) {
										Static5.anInt194 = local7;
										Static225.anInt4529 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static66.method1504(local9, arg6, local7, arg3, arg0, arg1, arg1, arg2)) {
										Static5.anInt194 = local7;
										Static225.anInt4529 = local9;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg7.method5320(arg0, local7, arg3, local9, arg1, arg6, arg2, arg1, arg10)) {
										Static5.anInt194 = local7;
										Static225.anInt4529 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg7.method5309(local7, arg10, arg0, arg6, local9, arg1, arg3, arg2)) {
										Static225.anInt4529 = local9;
										Static5.anInt194 = local7;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg7.method5313(arg9, arg4, local7, arg1, arg6, local9, arg2)) {
										Static225.anInt4529 = local9;
										Static5.anInt194 = local7;
										return true;
									}
								} else if (arg7.method5310(arg4, arg1, local9, arg2, local7, arg9, arg6)) {
									Static225.anInt4529 = local9;
									Static5.anInt194 = local7;
									return true;
								}
								local237 = Static226.anIntArrayArray42[local71][local76] + 1;
								if (local71 > 0 && Static243.anIntArrayArray52[local71 - 1][local76] == 0 && (local50[local82 - 1][local87] & 0x43A40000) == 0 && (local50[local82 - 1][arg1 + local87 - 1] & 0x4E240000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 - 1 <= local276) {
											Static181.anIntArray282[local45] = local7 - 1;
											Static77.anIntArray138[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static243.anIntArrayArray52[local71 - 1][local76] = 2;
											Static226.anIntArrayArray42[local71 - 1][local76] = local237;
											break;
										}
										if ((local50[local82 - 1][local87 + local276] & 0x4FA40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local71 < 128 - arg1 && Static243.anIntArrayArray52[local71 + 1][local76] == 0 && (local50[arg1 + local82][local87] & 0x60E40000) == 0 && (local50[arg1 + local82][local87 + arg1 - 1] & 0x78240000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 - 1 <= local276) {
											Static181.anIntArray282[local45] = local7 + 1;
											Static77.anIntArray138[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static243.anIntArrayArray52[local71 + 1][local76] = 8;
											Static226.anIntArrayArray42[local71 + 1][local76] = local237;
											break;
										}
										if ((local50[arg1 + local82][local276 + local87] & 0x78E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local76 > 0 && Static243.anIntArrayArray52[local71][local76 - 1] == 0 && (local50[local82][local87 - 1] & 0x43A40000) == 0 && (local50[arg1 + local82 - 1][local87 - 1] & 0x60E40000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 - 1 <= local276) {
											Static181.anIntArray282[local45] = local7;
											Static77.anIntArray138[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Static243.anIntArrayArray52[local71][local76 - 1] = 1;
											Static226.anIntArrayArray42[local71][local76 - 1] = local237;
											break;
										}
										if ((local50[local276 + local82][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (128 - arg1 > local76 && Static243.anIntArrayArray52[local71][local76 + 1] == 0 && (local50[local82][arg1 + local87] & 0x4E240000) == 0 && (local50[local82 + arg1 - 1][local87 + arg1] & 0x78240000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 - 1 <= local276) {
											Static181.anIntArray282[local45] = local7;
											Static77.anIntArray138[local45] = local9 + 1;
											Static243.anIntArrayArray52[local71][local76 + 1] = 4;
											local45 = local45 + 1 & 0xFFF;
											Static226.anIntArrayArray42[local71][local76 + 1] = local237;
											break;
										}
										if ((local50[local82 + local276][local87 + arg1] & 0x7E240000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local71 > 0 && local76 > 0 && Static243.anIntArrayArray52[local71 - 1][local76 - 1] == 0 && (local50[local82 - 1][local87 - 1] & 0x43A40000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 <= local276) {
											Static181.anIntArray282[local45] = local7 - 1;
											Static77.anIntArray138[local45] = local9 - 1;
											Static243.anIntArrayArray52[local71 - 1][local76 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Static226.anIntArrayArray42[local71 - 1][local76 - 1] = local237;
											break;
										}
										if ((local50[local82 - 1][local276 + local87 - 1] & 0x4FA40000) != 0 || (local50[local276 + local82 - 1][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local71 < 128 - arg1 && local76 > 0 && Static243.anIntArrayArray52[local71 + 1][local76 - 1] == 0 && (local50[local82 + arg1][local87 - 1] & 0x60E40000) == 0) {
									local276 = 1;
									while (true) {
										if (arg1 <= local276) {
											Static181.anIntArray282[local45] = local7 + 1;
											Static77.anIntArray138[local45] = local9 - 1;
											Static243.anIntArrayArray52[local71 + 1][local76 - 1] = 9;
											local45 = local45 + 1 & 0xFFF;
											Static226.anIntArrayArray42[local71 + 1][local76 - 1] = local237;
											break;
										}
										if ((local50[local82 + arg1][local276 + local87 - 1] & 0x78E40000) != 0 || (local50[local276 + local82][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local276++;
									}
								}
								if (local71 > 0 && local76 < 128 - arg1 && Static243.anIntArrayArray52[local71 - 1][local76 + 1] == 0 && (local50[local82 - 1][local87 + arg1] & 0x4E240000) == 0) {
									for (local276 = 1; local276 < arg1; local276++) {
										if ((local50[local82 - 1][local87 + local276] & 0x4FA40000) != 0 || (local50[local276 + local82 - 1][arg1 + local87] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static181.anIntArray282[local45] = local7 - 1;
									Static77.anIntArray138[local45] = local9 + 1;
									Static243.anIntArrayArray52[local71 - 1][local76 + 1] = 6;
									local45 = local45 + 1 & 0xFFF;
									Static226.anIntArrayArray42[local71 - 1][local76 + 1] = local237;
								}
							} while (local71 >= 128 - arg1);
						} while (local76 >= 128 - arg1);
					} while (Static243.anIntArrayArray52[local71 + 1][local76 + 1] != 0);
				} while ((local50[local82 + arg1][arg1 + local87] & 0x78240000) != 0);
				for (local276 = 1; local276 < arg1; local276++) {
					if ((local50[local82 + local276][local87 + arg1] & 0x7E240000) != 0 || (local50[local82 + arg1][local87 + local276] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static181.anIntArray282[local45] = local7 + 1;
				Static77.anIntArray138[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local71 + 1][local76 + 1] = 12;
				Static226.anIntArrayArray42[local71 + 1][local76 + 1] = local237;
			}
		}
	}
}
