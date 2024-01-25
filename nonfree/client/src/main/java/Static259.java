import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "Lclient!mn;")
	public static Class171 aClass171_60;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
	public static int anInt4591 = 0;

	@OriginalMember(owner = "client!mn", name = "S", descriptor = "Lclient!vk;")
	public static final Class259 aClass259_2 = new Class259(1);

	@OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
	public static int anInt4592 = -2;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_11 = new Class163(13, 7);

	@OriginalMember(owner = "client!mn", name = "V", descriptor = "[I")
	public static final int[] anIntArray396 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!pb;IIIII)Ljava/awt/Frame;")
	public static Frame method3650(@OriginalArg(0) Class194 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method4398()) {
			return null;
		}
		@Pc(17) Class151[] local17 = Static303.method3589(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt3724 == arg1 && local17[local25].anInt3725 == arg3 && (!local23 || local17[local25].anInt3727 > arg2)) {
				local23 = true;
				arg2 = local17[local25].anInt3727;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(83) Class136 local83 = arg0.method4416(arg3, arg1, arg2);
		while (local83.anInt3418 == 0) {
			Static167.method6157(10L);
		}
		@Pc(100) Frame local100 = (Frame) local83.anObject10;
		if (local100 == null) {
			return null;
		} else if (local83.anInt3418 == 2) {
			Static95.method1419(arg0, local100);
			return null;
		} else {
			return local100;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(26) int local26 = arg6 + arg4;
		@Pc(31) int local31 = arg3 - arg6;
		for (@Pc(33) int local33 = arg4; local33 < local26; local33++) {
			Static215.method3035(arg5, arg1, Static46.anIntArrayArray24[local33], arg0);
		}
		@Pc(51) int local51 = arg5 + arg6;
		@Pc(56) int local56 = arg1 - arg6;
		for (@Pc(58) int local58 = arg3; local58 > local31; local58--) {
			Static215.method3035(arg5, arg1, Static46.anIntArrayArray24[local58], arg0);
		}
		for (@Pc(78) int local78 = local26; local78 <= local31; local78++) {
			@Pc(84) int[] local84 = Static46.anIntArrayArray24[local78];
			Static215.method3035(arg5, local51, local84, arg0);
			Static215.method3035(local51, local56, local84, arg2);
			Static215.method3035(local56, arg1, local84, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!sj;IIIIIIIIIII)Z")
	public static boolean method3678(@OriginalArg(0) Class225 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg3;
		@Pc(7) int local7 = arg2;
		@Pc(15) int local15 = arg3 - 64;
		Static320.anIntArrayArray138[64][64] = 99;
		@Pc(26) int local26 = arg2 - 64;
		Static397.anIntArrayArray168[64][64] = 0;
		@Pc(34) byte local34 = 0;
		Static311.anIntArray475[0] = arg3;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local34 + 1;
		Static228.anIntArray515[0] = arg2;
		@Pc(53) int[][] local53 = arg0.anIntArrayArray159;
		while (true) {
			label282: while (true) {
				@Pc(77) int local77;
				@Pc(72) int local72;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(242) int local242;
				@Pc(287) int local287;
				do {
					do {
						do {
							label259: do {
								if (local43 == local40) {
									Static199.anInt3421 = local5;
									Static379.anInt3836 = local7;
									return false;
								}
								local5 = Static311.anIntArray475[local40];
								local7 = Static228.anIntArray515[local40];
								local40 = local40 + 1 & 0xFFF;
								local72 = local7 - local26;
								local77 = local5 - local15;
								local83 = local5 - arg0.anInt6535;
								local89 = local7 - arg0.anInt6523;
								if (arg5 == -4) {
									if (arg6 == local5 && local7 == arg4) {
										Static199.anInt3421 = local5;
										Static379.anInt3836 = local7;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static233.method3186(local5, arg1, arg8, arg4, arg6, arg1, local7, arg7)) {
										Static379.anInt3836 = local7;
										Static199.anInt3421 = local5;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg0.method5189(local7, arg8, arg6, arg1, arg4, arg7, local5, arg1, arg9)) {
										Static199.anInt3421 = local5;
										Static379.anInt3836 = local7;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg0.method5190(arg8, local5, local7, arg6, arg7, arg4, arg9, arg1)) {
										Static199.anInt3421 = local5;
										Static379.anInt3836 = local7;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg0.method5199(arg1, local7, arg4, arg6, arg10, local5, arg5)) {
										Static199.anInt3421 = local5;
										Static379.anInt3836 = local7;
										return true;
									}
								} else if (arg0.method5196(local5, arg4, arg1, arg6, arg10, arg5, local7)) {
									Static379.anInt3836 = local7;
									Static199.anInt3421 = local5;
									return true;
								}
								local242 = Static397.anIntArrayArray168[local77][local72] + 1;
								if (local77 > 0 && Static320.anIntArrayArray138[local77 - 1][local72] == 0 && (local53[local83 - 1][local89] & 0x43A40000) == 0 && (local53[local83 - 1][arg1 + local89 - 1] & 0x4E240000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg1 - 1) {
											Static311.anIntArray475[local43] = local5 - 1;
											Static228.anIntArray515[local43] = local7;
											local43 = local43 + 1 & 0xFFF;
											Static320.anIntArrayArray138[local77 - 1][local72] = 2;
											Static397.anIntArrayArray168[local77 - 1][local72] = local242;
											break;
										}
										if ((local53[local83 - 1][local287 + local89] & 0x4FA40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local77 < 128 - arg1 && Static320.anIntArrayArray138[local77 + 1][local72] == 0 && (local53[local83 + arg1][local89] & 0x60E40000) == 0 && (local53[arg1 + local83][arg1 + local89 - 1] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (arg1 - 1 <= local287) {
											Static311.anIntArray475[local43] = local5 + 1;
											Static228.anIntArray515[local43] = local7;
											local43 = local43 + 1 & 0xFFF;
											Static320.anIntArrayArray138[local77 + 1][local72] = 8;
											Static397.anIntArrayArray168[local77 + 1][local72] = local242;
											break;
										}
										if ((local53[local83 + arg1][local287 + local89] & 0x78E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local72 > 0 && Static320.anIntArrayArray138[local77][local72 - 1] == 0 && (local53[local83][local89 - 1] & 0x43A40000) == 0 && (local53[local83 + arg1 - 1][local89 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (arg1 - 1 <= local287) {
											Static311.anIntArray475[local43] = local5;
											Static228.anIntArray515[local43] = local7 - 1;
											local43 = local43 + 1 & 0xFFF;
											Static320.anIntArrayArray138[local77][local72 - 1] = 1;
											Static397.anIntArrayArray168[local77][local72 - 1] = local242;
											break;
										}
										if ((local53[local83 + local287][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (128 - arg1 > local72 && Static320.anIntArrayArray138[local77][local72 + 1] == 0 && (local53[local83][arg1 + local89] & 0x4E240000) == 0 && (local53[arg1 + local83 - 1][local89 + arg1] & 0x78240000) == 0) {
									local287 = 1;
									while (true) {
										if (arg1 - 1 <= local287) {
											Static311.anIntArray475[local43] = local5;
											Static228.anIntArray515[local43] = local7 + 1;
											Static320.anIntArrayArray138[local77][local72 + 1] = 4;
											local43 = local43 + 1 & 0xFFF;
											Static397.anIntArrayArray168[local77][local72 + 1] = local242;
											break;
										}
										if ((local53[local287 + local83][arg1 + local89] & 0x7E240000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local77 > 0 && local72 > 0 && Static320.anIntArrayArray138[local77 - 1][local72 - 1] == 0 && (local53[local83 - 1][local89 - 1] & 0x43A40000) == 0) {
									local287 = 1;
									while (true) {
										if (arg1 <= local287) {
											Static311.anIntArray475[local43] = local5 - 1;
											Static228.anIntArray515[local43] = local7 - 1;
											Static320.anIntArrayArray138[local77 - 1][local72 - 1] = 3;
											local43 = local43 + 1 & 0xFFF;
											Static397.anIntArrayArray168[local77 - 1][local72 - 1] = local242;
											break;
										}
										if ((local53[local83 - 1][local89 + local287 - 1] & 0x4FA40000) != 0 || (local53[local287 + local83 - 1][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local77 < 128 - arg1 && local72 > 0 && Static320.anIntArrayArray138[local77 + 1][local72 - 1] == 0 && (local53[arg1 + local83][local89 - 1] & 0x60E40000) == 0) {
									local287 = 1;
									while (true) {
										if (local287 >= arg1) {
											Static311.anIntArray475[local43] = local5 + 1;
											Static228.anIntArray515[local43] = local7 - 1;
											local43 = local43 + 1 & 0xFFF;
											Static320.anIntArrayArray138[local77 + 1][local72 - 1] = 9;
											Static397.anIntArrayArray168[local77 + 1][local72 - 1] = local242;
											break;
										}
										if ((local53[local83 + arg1][local89 + local287 - 1] & 0x78E40000) != 0 || (local53[local83 + local287][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local287++;
									}
								}
								if (local77 > 0 && local72 < 128 - arg1 && Static320.anIntArrayArray138[local77 - 1][local72 + 1] == 0 && (local53[local83 - 1][arg1 + local89] & 0x4E240000) == 0) {
									for (local287 = 1; local287 < arg1; local287++) {
										if ((local53[local83 - 1][local287 + local89] & 0x4FA40000) != 0 || (local53[local287 + local83 - 1][local89 + arg1] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static311.anIntArray475[local43] = local5 - 1;
									Static228.anIntArray515[local43] = local7 + 1;
									Static320.anIntArrayArray138[local77 - 1][local72 + 1] = 6;
									local43 = local43 + 1 & 0xFFF;
									Static397.anIntArrayArray168[local77 - 1][local72 + 1] = local242;
								}
							} while (128 - arg1 <= local77);
						} while (local72 >= 128 - arg1);
					} while (Static320.anIntArrayArray138[local77 + 1][local72 + 1] != 0);
				} while ((local53[arg1 + local83][local89 + arg1] & 0x78240000) != 0);
				for (local287 = 1; local287 < arg1; local287++) {
					if ((local53[local287 + local83][arg1 + local89] & 0x7E240000) != 0 || (local53[arg1 + local83][local89 + local287] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static311.anIntArray475[local43] = local5 + 1;
				Static228.anIntArray515[local43] = local7 + 1;
				Static320.anIntArrayArray138[local77 + 1][local72 + 1] = 12;
				local43 = local43 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local77 + 1][local72 + 1] = local242;
			}
		}
	}
}
