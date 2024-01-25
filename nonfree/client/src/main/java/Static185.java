import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public static int anInt3725;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_82 = new Class119(9, -1);

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
	public static void method2974() {
		Static368.method4824(Static121.aClass172_3, (long) Static253.anInt4787);
		if (Static226.anInt4225 != -1) {
			Static17.method369(Static226.anInt4225);
		}
		for (@Pc(18) int local18 = 0; local18 < Static246.anInt4693; local18++) {
			if (Static55.aBooleanArray8[local18]) {
				Static78.aBooleanArray11[local18] = true;
			}
			Static128.aBooleanArray12[local18] = Static55.aBooleanArray8[local18];
			Static55.aBooleanArray8[local18] = false;
		}
		Static36.anInt1021 = Static253.anInt4787;
		if (Static121.aClass172_3.method5483()) {
			Static284.aBoolean456 = true;
		}
		if (Static226.anInt4225 != -1) {
			Static246.anInt4693 = 0;
			Static7.method49();
		}
		Static121.aClass172_3.va();
		Static31.method4739(Static58.anInt1564);
		Static115.anInt2498 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIIIILclient!br;IIIII)Z")
	public static boolean method2975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class29 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg3;
		@Pc(15) int local15 = arg0 - 64;
		Static244.anIntArrayArray30[64][64] = 99;
		@Pc(26) int local26 = arg3 - 64;
		Static117.anIntArrayArray17[64][64] = 0;
		@Pc(34) byte local34 = 0;
		@Pc(36) int local36 = 0;
		Static195.anIntArray244[0] = arg0;
		@Pc(43) int local43 = local34 + 1;
		Static368.anIntArray399[0] = arg3;
		@Pc(48) int[][] local48 = arg5.anIntArrayArray8;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(247) int local247;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local36 == local43) {
									Static430.anInt3291 = local7;
									Static107.anInt2387 = local5;
									return false;
								}
								local7 = Static368.anIntArray399[local36];
								local5 = Static195.anIntArray244[local36];
								local36 = local36 + 1 & 0xFFF;
								local75 = local5 - local15;
								local80 = local7 - local26;
								local86 = local5 - arg5.anInt1055;
								local92 = local7 - arg5.anInt1062;
								if (arg7 == -4) {
									if (local5 == arg6 && local7 == arg10) {
										Static430.anInt3291 = local7;
										Static107.anInt2387 = local5;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static225.method3377(arg9, arg9, local5, arg1, arg4, arg10, arg6, local7)) {
										Static430.anInt3291 = local7;
										Static107.anInt2387 = local5;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg5.method744(arg6, arg8, arg1, arg9, local5, arg9, local7, arg10, arg4)) {
										Static430.anInt3291 = local7;
										Static107.anInt2387 = local5;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg5.method757(local5, arg9, arg8, arg10, local7, arg4, arg1, arg6)) {
										Static107.anInt2387 = local5;
										Static430.anInt3291 = local7;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg5.method748(arg7, arg6, local7, arg9, local5, arg2, arg10)) {
										Static107.anInt2387 = local5;
										Static430.anInt3291 = local7;
										return true;
									}
								} else if (arg5.method747(arg2, arg9, arg10, local7, arg7, local5, arg6)) {
									Static430.anInt3291 = local7;
									Static107.anInt2387 = local5;
									return true;
								}
								local247 = Static117.anIntArrayArray17[local75][local80] + 1;
								if (local75 > 0 && Static244.anIntArrayArray30[local75 - 1][local80] == 0 && (local48[local86 - 1][local92] & 0x43A40000) == 0 && (local48[local86 - 1][local92 + arg9 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static195.anIntArray244[local43] = local5 - 1;
											Static368.anIntArray399[local43] = local7;
											local43 = local43 + 1 & 0xFFF;
											Static244.anIntArrayArray30[local75 - 1][local80] = 2;
											Static117.anIntArrayArray17[local75 - 1][local80] = local247;
											break;
										}
										if ((local48[local86 - 1][local292 + local92] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg9 > local75 && Static244.anIntArrayArray30[local75 + 1][local80] == 0 && (local48[local86 + arg9][local92] & 0x60E40000) == 0 && (local48[local86 + arg9][arg9 + local92 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static195.anIntArray244[local43] = local5 + 1;
											Static368.anIntArray399[local43] = local7;
											Static244.anIntArrayArray30[local75 + 1][local80] = 8;
											local43 = local43 + 1 & 0xFFF;
											Static117.anIntArrayArray17[local75 + 1][local80] = local247;
											break;
										}
										if ((local48[local86 + arg9][local92 + local292] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 > 0 && Static244.anIntArrayArray30[local75][local80 - 1] == 0 && (local48[local86][local92 - 1] & 0x43A40000) == 0 && (local48[arg9 + local86 - 1][local92 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 - 1 <= local292) {
											Static195.anIntArray244[local43] = local5;
											Static368.anIntArray399[local43] = local7 - 1;
											Static244.anIntArrayArray30[local75][local80 - 1] = 1;
											local43 = local43 + 1 & 0xFFF;
											Static117.anIntArrayArray17[local75][local80 - 1] = local247;
											break;
										}
										if ((local48[local292 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 < 128 - arg9 && Static244.anIntArrayArray30[local75][local80 + 1] == 0 && (local48[local86][arg9 + local92] & 0x4E240000) == 0 && (local48[local86 + arg9 - 1][local92 + arg9] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static195.anIntArray244[local43] = local5;
											Static368.anIntArray399[local43] = local7 + 1;
											Static244.anIntArrayArray30[local75][local80 + 1] = 4;
											local43 = local43 + 1 & 0xFFF;
											Static117.anIntArrayArray17[local75][local80 + 1] = local247;
											break;
										}
										if ((local48[local292 + local86][arg9 + local92] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local75 > 0 && local80 > 0 && Static244.anIntArrayArray30[local75 - 1][local80 - 1] == 0 && (local48[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 <= local292) {
											Static195.anIntArray244[local43] = local5 - 1;
											Static368.anIntArray399[local43] = local7 - 1;
											local43 = local43 + 1 & 0xFFF;
											Static244.anIntArrayArray30[local75 - 1][local80 - 1] = 3;
											Static117.anIntArrayArray17[local75 - 1][local80 - 1] = local247;
											break;
										}
										if ((local48[local86 - 1][local92 + local292 - 1] & 0x4FA40000) != 0 || (local48[local86 + local292 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg9 > local75 && local80 > 0 && Static244.anIntArrayArray30[local75 + 1][local80 - 1] == 0 && (local48[arg9 + local86][local92 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9) {
											Static195.anIntArray244[local43] = local5 + 1;
											Static368.anIntArray399[local43] = local7 - 1;
											local43 = local43 + 1 & 0xFFF;
											Static244.anIntArrayArray30[local75 + 1][local80 - 1] = 9;
											Static117.anIntArrayArray17[local75 + 1][local80 - 1] = local247;
											break;
										}
										if ((local48[local86 + arg9][local92 + local292 - 1] & 0x78E40000) != 0 || (local48[local86 + local292][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local75 > 0 && local80 < 128 - arg9 && Static244.anIntArrayArray30[local75 - 1][local80 + 1] == 0 && (local48[local86 - 1][arg9 + local92] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg9; local292++) {
										if ((local48[local86 - 1][local92 + local292] & 0x4FA40000) != 0 || (local48[local292 + local86 - 1][local92 + arg9] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static195.anIntArray244[local43] = local5 - 1;
									Static368.anIntArray399[local43] = local7 + 1;
									local43 = local43 + 1 & 0xFFF;
									Static244.anIntArrayArray30[local75 - 1][local80 + 1] = 6;
									Static117.anIntArrayArray17[local75 - 1][local80 + 1] = local247;
								}
							} while (128 - arg9 <= local75);
						} while (local80 >= 128 - arg9);
					} while (Static244.anIntArrayArray30[local75 + 1][local80 + 1] != 0);
				} while ((local48[local86 + arg9][arg9 + local92] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg9; local292++) {
					if ((local48[local292 + local86][arg9 + local92] & 0x7E240000) != 0 || (local48[arg9 + local86][local92 + local292] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static195.anIntArray244[local43] = local5 + 1;
				Static368.anIntArray399[local43] = local7 + 1;
				local43 = local43 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local75 + 1][local80 + 1] = 12;
				Static117.anIntArrayArray17[local75 + 1][local80 + 1] = local247;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)[Lclient!iv;")
	public static Class119[] method2977() {
		return new Class119[] { Static174.aClass119_75, Static403.aClass119_140, Static175.aClass119_152, Static313.aClass119_116, Static156.aClass119_67, Static64.aClass119_24, Static91.aClass119_41, Static76.aClass119_32, Static165.aClass119_71, aClass119_82, Static264.aClass119_105, Static271.aClass119_108, Static360.aClass119_129, Static345.aClass119_153, Static115.aClass119_50, Static140.aClass119_60, Static253.aClass119_104, Static181.aClass119_79, Static382.aClass119_29, Static158.aClass119_69, Static401.aClass119_139, Static70.aClass119_25, Static117.aClass119_51, Static146.aClass119_62, Static407.aClass119_145, Static146.aClass119_63, Static370.aClass119_135, Static2.aClass119_3, Static391.aClass119_147, Static317.aClass119_118, Static89.aClass119_40, Static112.aClass119_49, Static108.aClass119_46, Static73.aClass119_26, Static406.aClass119_142, Static98.aClass119_43, Static127.aClass119_55, Static232.aClass119_96, Static378.aClass119_137, Static140.aClass119_61, Static445.aClass119_155, Static340.aClass119_123, Static323.aClass119_20, Static367.aClass119_134, Static432.aClass119_151, Static208.aClass119_89, Static120.aClass119_53, Static365.aClass119_133, Static207.aClass119_88, Static305.aClass119_114, Static195.aClass119_85, Static29.aClass119_130, Static34.aClass119_15, Static119.aClass119_52, Static199.aClass119_86, Static2.aClass119_1, Static314.aClass119_117, Static334.aClass119_121, Static349.aClass119_126, Static79.aClass119_120, Static244.aClass119_100, Static250.aClass119_103, Static169.aClass119_124, Static216.aClass119_90, Static230.aClass119_94, Static363.aClass119_131, Static84.aClass119_37, Static74.aClass119_30, Static289.aClass119_111, Static390.aClass119_138, Static204.aClass119_87, Static36.aClass119_17, Static168.aClass119_72, Static194.aClass119_84, Static376.aClass119_136, Static423.aClass119_150, Static265.aClass119_106, Static178.aClass119_78, Static405.aClass119_141, Static332.aClass119_119, Static2.aClass119_2, Static151.aClass119_65, Static419.aClass119_149, Static406.aClass119_143, Static109.aClass119_47, Static99.aClass119_44, Static97.aClass119_42, Static450.aClass119_154, Static147.aClass119_64, Static303.aClass119_113, Static177.aClass119_77, Static136.aClass119_58, Static84.aClass119_38, Static407.aClass119_144, Static62.aClass119_21, Static217.aClass119_91, Static80.aClass119_36, Static416.aClass119_148, Static311.aClass119_115, Static158.aClass119_68, Static6.aClass119_4, Static276.aClass119_109, Static9.aClass119_7, Static41.aClass119_18, Static106.aClass119_45, Static120.aClass119_54, Static137.aClass119_59, Static173.aClass119_74, Static225.aClass119_92, Static14.aClass119_10 };
	}
}
