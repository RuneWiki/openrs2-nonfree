import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!eja", name = "t", descriptor = "I")
	public static int anInt2788;

	@OriginalMember(owner = "client!eja", name = "m", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_44 = new Class186(140, 1);

	@OriginalMember(owner = "client!eja", name = "k", descriptor = "Lclient!m;")
	public static final Class235 aClass235_18 = new Class235(21);

	@OriginalMember(owner = "client!eja", name = "o", descriptor = "J")
	public static long aLong107 = -1L;

	@OriginalMember(owner = "client!eja", name = "s", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_45 = new Class186(95, 6);

	@OriginalMember(owner = "client!eja", name = "r", descriptor = "[I")
	public static int[] anIntArray134 = new int[1];

	@OriginalMember(owner = "client!eja", name = "j", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!ha;Lclient!ce;I)I")
	public static int method2422(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class46 arg1) {
		if (arg1.anInt1148 != -1) {
			return arg1.anInt1148;
		}
		if (arg1.anInt1147 != -1) {
			@Pc(31) Class32 local31 = arg0.anInterface2_11.method1027(arg1.anInt1147);
			if (!local31.aBoolean67) {
				return local31.aShort9;
			}
		}
		return arg1.anInt1150;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)V")
	public static void method2423(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(14, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIIIIILclient!tq;IIII)Z")
	public static boolean method2424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class360 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg1 - 64;
		@Pc(22) int local22 = arg8 - 64;
		Static407.anIntArrayArray40[64][64] = 99;
		Static717.anIntArrayArray62[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static198.anIntArray177[0] = arg1;
		@Pc(45) int local45 = local36 + 1;
		Static469.anIntArray88[0] = arg8;
		@Pc(57) int[][] local57 = arg6.anIntArrayArray56;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(271) int local271;
				@Pc(323) int local323;
				do {
					do {
						do {
							label259: do {
								if (local38 == local45) {
									Static282.anInt5124 = local9;
									Static633.anInt3424 = local7;
									return false;
								}
								local7 = Static198.anIntArray177[local38];
								local9 = Static469.anIntArray88[local38];
								local38 = local38 + 1 & 0xFFF;
								local78 = local7 - local18;
								local82 = local9 - local22;
								local88 = local7 - arg6.anInt10108;
								local94 = local9 - arg6.anInt10114;
								if (arg10 == -4) {
									if (local7 == arg0 && arg9 == local9) {
										Static633.anInt3424 = local7;
										Static282.anInt5124 = local9;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static85.method1104(arg0, arg7, local7, arg5, arg7, arg9, arg2, local9)) {
										Static282.anInt5124 = local9;
										Static633.anInt3424 = local7;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg6.method8488(arg2, local7, local9, arg7, arg3, arg0, arg9, arg5, arg7)) {
										Static633.anInt3424 = local7;
										Static282.anInt5124 = local9;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg6.method8494(arg2, arg7, arg3, local7, arg9, arg5, arg0, local9)) {
										Static633.anInt3424 = local7;
										Static282.anInt5124 = local9;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg6.method8485(arg0, arg7, local9, local7, arg4, arg10, arg9)) {
										Static282.anInt5124 = local9;
										Static633.anInt3424 = local7;
										return true;
									}
								} else if (arg6.method8493(arg4, arg10, local7, arg9, arg7, arg0, local9)) {
									Static282.anInt5124 = local9;
									Static633.anInt3424 = local7;
									return true;
								}
								local271 = Static717.anIntArrayArray62[local78][local82] + 1;
								if (local78 > 0 && Static407.anIntArrayArray40[local78 - 1][local82] == 0 && (local57[local88 - 1][local94] & 0x43A40000) == 0 && (local57[local88 - 1][local94 + arg7 - 1] & 0x4E240000) == 0) {
									local323 = 1;
									while (true) {
										if (arg7 - 1 <= local323) {
											Static198.anIntArray177[local45] = local7 - 1;
											Static469.anIntArray88[local45] = local9;
											Static407.anIntArrayArray40[local78 - 1][local82] = 2;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78 - 1][local82] = local271;
											break;
										}
										if ((local57[local88 - 1][local94 + local323] & 0x4FA40000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (local78 < 128 - arg7 && Static407.anIntArrayArray40[local78 + 1][local82] == 0 && (local57[arg7 + local88][local94] & 0x60E40000) == 0 && (local57[arg7 + local88][local94 + arg7 - 1] & 0x78240000) == 0) {
									local323 = 1;
									while (true) {
										if (arg7 - 1 <= local323) {
											Static198.anIntArray177[local45] = local7 + 1;
											Static469.anIntArray88[local45] = local9;
											Static407.anIntArrayArray40[local78 + 1][local82] = 8;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78 + 1][local82] = local271;
											break;
										}
										if ((local57[local88 + arg7][local323 + local94] & 0x78E40000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (local82 > 0 && Static407.anIntArrayArray40[local78][local82 - 1] == 0 && (local57[local88][local94 - 1] & 0x43A40000) == 0 && (local57[local88 + arg7 - 1][local94 - 1] & 0x60E40000) == 0) {
									local323 = 1;
									while (true) {
										if (arg7 - 1 <= local323) {
											Static198.anIntArray177[local45] = local7;
											Static469.anIntArray88[local45] = local9 - 1;
											Static407.anIntArrayArray40[local78][local82 - 1] = 1;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78][local82 - 1] = local271;
											break;
										}
										if ((local57[local88 + local323][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (local82 < 128 - arg7 && Static407.anIntArrayArray40[local78][local82 + 1] == 0 && (local57[local88][arg7 + local94] & 0x4E240000) == 0 && (local57[arg7 + local88 - 1][arg7 + local94] & 0x78240000) == 0) {
									local323 = 1;
									while (true) {
										if (arg7 - 1 <= local323) {
											Static198.anIntArray177[local45] = local7;
											Static469.anIntArray88[local45] = local9 + 1;
											Static407.anIntArrayArray40[local78][local82 + 1] = 4;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78][local82 + 1] = local271;
											break;
										}
										if ((local57[local88 + local323][arg7 + local94] & 0x7E240000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (local78 > 0 && local82 > 0 && Static407.anIntArrayArray40[local78 - 1][local82 - 1] == 0 && (local57[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local323 = 1;
									while (true) {
										if (local323 >= arg7) {
											Static198.anIntArray177[local45] = local7 - 1;
											Static469.anIntArray88[local45] = local9 - 1;
											Static407.anIntArrayArray40[local78 - 1][local82 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78 - 1][local82 - 1] = local271;
											break;
										}
										if ((local57[local88 - 1][local323 + local94 - 1] & 0x4FA40000) != 0 || (local57[local88 + local323 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (128 - arg7 > local78 && local82 > 0 && Static407.anIntArrayArray40[local78 + 1][local82 - 1] == 0 && (local57[local88 + arg7][local94 - 1] & 0x60E40000) == 0) {
									local323 = 1;
									while (true) {
										if (arg7 <= local323) {
											Static198.anIntArray177[local45] = local7 + 1;
											Static469.anIntArray88[local45] = local9 - 1;
											Static407.anIntArrayArray40[local78 + 1][local82 - 1] = 9;
											local45 = local45 + 1 & 0xFFF;
											Static717.anIntArrayArray62[local78 + 1][local82 - 1] = local271;
											break;
										}
										if ((local57[arg7 + local88][local323 + local94 - 1] & 0x78E40000) != 0 || (local57[local88 + local323][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local323++;
									}
								}
								if (local78 > 0 && local82 < 128 - arg7 && Static407.anIntArrayArray40[local78 - 1][local82 + 1] == 0 && (local57[local88 - 1][local94 + arg7] & 0x4E240000) == 0) {
									for (local323 = 1; local323 < arg7; local323++) {
										if ((local57[local88 - 1][local323 + local94] & 0x4FA40000) != 0 || (local57[local323 + local88 - 1][local94 + arg7] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static198.anIntArray177[local45] = local7 - 1;
									Static469.anIntArray88[local45] = local9 + 1;
									Static407.anIntArrayArray40[local78 - 1][local82 + 1] = 6;
									local45 = local45 + 1 & 0xFFF;
									Static717.anIntArrayArray62[local78 - 1][local82 + 1] = local271;
								}
							} while (128 - arg7 <= local78);
						} while (local82 >= 128 - arg7);
					} while (Static407.anIntArrayArray40[local78 + 1][local82 + 1] != 0);
				} while ((local57[arg7 + local88][local94 + arg7] & 0x78240000) != 0);
				for (local323 = 1; local323 < arg7; local323++) {
					if ((local57[local88 + local323][arg7 + local94] & 0x7E240000) != 0 || (local57[arg7 + local88][local323 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static198.anIntArray177[local45] = local7 + 1;
				Static469.anIntArray88[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static407.anIntArrayArray40[local78 + 1][local82 + 1] = 12;
				Static717.anIntArrayArray62[local78 + 1][local82 + 1] = local271;
			}
		}
	}
}
