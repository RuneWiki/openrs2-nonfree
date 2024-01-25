import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!ra;")
	public static Class170 aClass170_63;

	@OriginalMember(owner = "client!la", name = "jb", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Z")
	public static boolean aBoolean246 = true;

	@OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
	public static final int anInt3467 = 50;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "[I")
	public static final int[] anIntArray242 = new int[anInt3467];

	@OriginalMember(owner = "client!la", name = "U", descriptor = "[I")
	public static final int[] anIntArray245 = new int[anInt3467];

	@OriginalMember(owner = "client!la", name = "X", descriptor = "I")
	public static int anInt3450 = 0;

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[anInt3467];

	@OriginalMember(owner = "client!la", name = "yb", descriptor = "[I")
	public static final int[] anIntArray256 = new int[anInt3467];

	@OriginalMember(owner = "client!la", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray257 = new int[anInt3467];

	@OriginalMember(owner = "client!la", name = "Kb", descriptor = "[I")
	public static final int[] anIntArray260 = new int[anInt3467];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Z")
	public static boolean method3179(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static15.aClass59_1.method4844();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static15.aClass59_1.method4883();
		} else if (!Static15.aClass59_1.method4826()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static91.aBoolean135 = arg0;
			Static287.method4908(Static202.aClass10_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)I")
	public static int method3184() {
		@Pc(7) Class59 local7 = Static15.aClass59_1;
		@Pc(9) boolean local9 = false;
		if (Static134.anInt2746 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static129.method2469(0, null, 0, local18, null);
		}
		@Pc(35) long local35 = Static284.method4783();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method4819();
		}
		@Pc(69) int local69 = (int) (Static284.method4783() - local35);
		local7.method4835(0, 0, 100, 100, -16777216);
		if (local9) {
			local7.method4857();
		}
		return local69;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "()V")
	public static void method3189() {
		for (@Pc(1) int local1 = 0; local1 < Static132.anInt2864; local1++) {
			if (!Static105.aBooleanArray7[local1]) {
				@Pc(10) Class5_Sub13_Sub1 local10 = Static233.aClass5_Sub13_Sub1Array3[local1];
				@Pc(13) int local13 = local10.anInt2094;
				@Pc(18) int local18 = local10.anInt2079 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt2080 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt2082 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt2082 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static248.anInt4822) {
					local54 = Static248.anInt4822 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray17[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static12.anInt378) {
						local101 = Static12.anInt378 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class25_Sub1 local134 = Static82.method1816(local13, local118, local71, sa.class);
						if (local134 != null && local134.aByte61 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte61 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray17[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray17[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray17[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray17[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static105.aBooleanArray7[local1] = true;
				Static130.aClass3Array2[local13].method5637(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)V")
	public static void method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class51 local28 = Static138.aClass51ArrayArrayArray1[local9][arg0][arg1] = Static138.aClass51ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte13--;
				for (@Pc(40) Class103 local40 = local28.aClass103_1; local40 != null; local40 = local40.aClass103_2) {
					@Pc(44) Class25_Sub1 local44 = local40.aClass25_Sub1_1;
					if (local44.aShort76 == arg0 && local44.aShort75 == arg1) {
						local44.aByte62--;
					}
				}
			}
		}
		if (Static138.aClass51ArrayArrayArray1[0][arg0][arg1] == null) {
			Static138.aClass51ArrayArrayArray1[0][arg0][arg1] = new Class51(0, arg0, arg1);
			Static138.aClass51ArrayArrayArray1[0][arg0][arg1].aByte9 = 1;
		}
		Static138.aClass51ArrayArrayArray1[0][arg0][arg1].aClass51_1 = local7;
		Static138.aClass51ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIIIILclient!dl;I)Z")
	public static boolean method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class49 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(17) int local17 = arg7 - 64;
		Static55.anIntArrayArray6[64][64] = 99;
		@Pc(28) int local28 = arg4 - 64;
		Static144.anIntArrayArray19[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static219.anIntArray309[0] = arg7;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static302.anIntArray449[0] = arg4;
		@Pc(50) int[][] local50 = arg9.anIntArrayArray7;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(65) int local65;
				@Pc(82) int local82;
				@Pc(87) int local87;
				@Pc(242) int local242;
				@Pc(278) int local278;
				do {
					do {
						do {
							label259: do {
								if (local42 == local45) {
									Static259.anInt3212 = local7;
									Static9.anInt309 = local9;
									return false;
								}
								local7 = Static219.anIntArray309[local42];
								local9 = Static302.anIntArray449[local42];
								local65 = local9 - local28;
								local42 = local42 + 1 & 0xFFF;
								local76 = local7 - local17;
								local82 = local7 - arg9.anInt1413;
								local87 = local9 - arg9.anInt1400;
								if (arg10 == -4) {
									if (local7 == arg5 && arg6 == local9) {
										Static9.anInt309 = local9;
										Static259.anInt3212 = local7;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static324.method5466(arg8, arg0, local9, arg5, arg2, local7, arg6, arg8)) {
										Static259.anInt3212 = local7;
										Static9.anInt309 = local9;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg9.method1243(arg8, local9, arg2, arg0, local7, arg6, arg1, arg8, arg5)) {
										Static259.anInt3212 = local7;
										Static9.anInt309 = local9;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg9.method1242(arg6, local7, arg5, arg1, local9, arg0, arg8, arg2)) {
										Static9.anInt309 = local9;
										Static259.anInt3212 = local7;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg9.method1239(arg8, arg6, arg5, local7, local9, arg3, arg10)) {
										Static259.anInt3212 = local7;
										Static9.anInt309 = local9;
										return true;
									}
								} else if (arg9.method1233(local9, arg6, local7, arg3, arg5, arg10, arg8)) {
									Static259.anInt3212 = local7;
									Static9.anInt309 = local9;
									return true;
								}
								local242 = Static144.anIntArrayArray19[local76][local65] + 1;
								if (local76 > 0 && Static55.anIntArrayArray6[local76 - 1][local65] == 0 && (local50[local82 - 1][local87] & 0x43A40000) == 0 && (local50[local82 - 1][arg8 + local87 - 1] & 0x4E240000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg8 - 1) {
											Static219.anIntArray309[local45] = local7 - 1;
											Static302.anIntArray449[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static55.anIntArrayArray6[local76 - 1][local65] = 2;
											Static144.anIntArrayArray19[local76 - 1][local65] = local242;
											break;
										}
										if ((local50[local82 - 1][local87 + local278] & 0x4FA40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local76 < 128 - arg8 && Static55.anIntArrayArray6[local76 + 1][local65] == 0 && (local50[arg8 + local82][local87] & 0x60E40000) == 0 && (local50[local82 + arg8][local87 + arg8 - 1] & 0x78240000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg8 - 1) {
											Static219.anIntArray309[local45] = local7 + 1;
											Static302.anIntArray449[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static55.anIntArrayArray6[local76 + 1][local65] = 8;
											Static144.anIntArrayArray19[local76 + 1][local65] = local242;
											break;
										}
										if ((local50[local82 + arg8][local87 + local278] & 0x78E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local65 > 0 && Static55.anIntArrayArray6[local76][local65 - 1] == 0 && (local50[local82][local87 - 1] & 0x43A40000) == 0 && (local50[arg8 + local82 - 1][local87 - 1] & 0x60E40000) == 0) {
									local278 = 1;
									while (true) {
										if (arg8 - 1 <= local278) {
											Static219.anIntArray309[local45] = local7;
											Static302.anIntArray449[local45] = local9 - 1;
											Static55.anIntArrayArray6[local76][local65 - 1] = 1;
											local45 = local45 + 1 & 0xFFF;
											Static144.anIntArrayArray19[local76][local65 - 1] = local242;
											break;
										}
										if ((local50[local82 + local278][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (128 - arg8 > local65 && Static55.anIntArrayArray6[local76][local65 + 1] == 0 && (local50[local82][arg8 + local87] & 0x4E240000) == 0 && (local50[arg8 + local82 - 1][arg8 + local87] & 0x78240000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg8 - 1) {
											Static219.anIntArray309[local45] = local7;
											Static302.anIntArray449[local45] = local9 + 1;
											local45 = local45 + 1 & 0xFFF;
											Static55.anIntArrayArray6[local76][local65 + 1] = 4;
											Static144.anIntArrayArray19[local76][local65 + 1] = local242;
											break;
										}
										if ((local50[local82 + local278][arg8 + local87] & 0x7E240000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local76 > 0 && local65 > 0 && Static55.anIntArrayArray6[local76 - 1][local65 - 1] == 0 && (local50[local82 - 1][local87 - 1] & 0x43A40000) == 0) {
									local278 = 1;
									while (true) {
										if (local278 >= arg8) {
											Static219.anIntArray309[local45] = local7 - 1;
											Static302.anIntArray449[local45] = local9 - 1;
											Static55.anIntArrayArray6[local76 - 1][local65 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Static144.anIntArrayArray19[local76 - 1][local65 - 1] = local242;
											break;
										}
										if ((local50[local82 - 1][local87 + local278 - 1] & 0x4FA40000) != 0 || (local50[local82 + local278 - 1][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local76 < 128 - arg8 && local65 > 0 && Static55.anIntArrayArray6[local76 + 1][local65 - 1] == 0 && (local50[local82 + arg8][local87 - 1] & 0x60E40000) == 0) {
									local278 = 1;
									while (true) {
										if (arg8 <= local278) {
											Static219.anIntArray309[local45] = local7 + 1;
											Static302.anIntArray449[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Static55.anIntArrayArray6[local76 + 1][local65 - 1] = 9;
											Static144.anIntArrayArray19[local76 + 1][local65 - 1] = local242;
											break;
										}
										if ((local50[local82 + arg8][local278 + local87 - 1] & 0x78E40000) != 0 || (local50[local278 + local82][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local278++;
									}
								}
								if (local76 > 0 && local65 < 128 - arg8 && Static55.anIntArrayArray6[local76 - 1][local65 + 1] == 0 && (local50[local82 - 1][arg8 + local87] & 0x4E240000) == 0) {
									for (local278 = 1; local278 < arg8; local278++) {
										if ((local50[local82 - 1][local87 + local278] & 0x4FA40000) != 0 || (local50[local278 + local82 - 1][arg8 + local87] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static219.anIntArray309[local45] = local7 - 1;
									Static302.anIntArray449[local45] = local9 + 1;
									Static55.anIntArrayArray6[local76 - 1][local65 + 1] = 6;
									local45 = local45 + 1 & 0xFFF;
									Static144.anIntArrayArray19[local76 - 1][local65 + 1] = local242;
								}
							} while (local76 >= 128 - arg8);
						} while (local65 >= 128 - arg8);
					} while (Static55.anIntArrayArray6[local76 + 1][local65 + 1] != 0);
				} while ((local50[arg8 + local82][local87 + arg8] & 0x78240000) != 0);
				for (local278 = 1; local278 < arg8; local278++) {
					if ((local50[local82 + local278][local87 + arg8] & 0x7E240000) != 0 || (local50[local82 + arg8][local278 + local87] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static219.anIntArray309[local45] = local7 + 1;
				Static302.anIntArray449[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local76 + 1][local65 + 1] = 12;
				Static144.anIntArrayArray19[local76 + 1][local65 + 1] = local242;
			}
		}
	}
}
