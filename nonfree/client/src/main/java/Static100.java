import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	public static int anInt2374;

	@OriginalMember(owner = "client!go", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!go", name = "C", descriptor = "I")
	public static int anInt2372 = -1;

	@OriginalMember(owner = "client!go", name = "F", descriptor = "I")
	public static int anInt2375 = 0;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "Lclient!en;")
	public static Class44 aClass44_11 = new Class44();

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	public static int anInt2380 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V")
	public static void method1726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) String local36 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local36);
		Static105.method789(local36);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIII)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg1) {
			Static26.method3692(arg4, arg2, arg3, arg0);
		} else if (arg3 - arg4 >= Static53.anInt1319 && Static81.anInt1915 >= arg3 + arg4 && arg0 - arg1 >= Static148.anInt3245 && Static166.anInt3675 >= arg1 + arg0) {
			Static90.method1601(arg4, arg0, arg1, arg2, arg3);
		} else {
			Static12.method230(arg0, arg4, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1729(@OriginalArg(0) String arg0) {
		return Static167.method3041(arg0, 10);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!va;IIIIIIZ)V")
	public static void method1730(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray543.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray543[local5] - Static10.anInt148;
			local22 = arg0.anIntArray547[local5] - Static268.anInt5235;
			local29 = arg0.anIntArray555[local5] - Static18.anInt389;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray550 != null) {
				Static292.anIntArray546[local5] = local39;
				Static292.anIntArray545[local5] = local61;
				Static292.anIntArray548[local5] = local71;
			}
			Static292.anIntArray552[local5] = Static1.anInt4 + (local39 << 9) / local71;
			Static292.anIntArray551[local5] = Static1.anInt3 + (local61 << 9) / local71;
		}
		Static1.anInt1 = 0;
		local3 = arg0.anIntArray549.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray549[local5];
			local22 = arg0.anIntArray556[local5];
			local29 = arg0.anIntArray554[local5];
			local39 = Static292.anIntArray552[local15];
			@Pc(148) int local148 = Static292.anIntArray552[local22];
			@Pc(152) int local152 = Static292.anIntArray552[local29];
			@Pc(156) int local156 = Static292.anIntArray551[local15];
			@Pc(160) int local160 = Static292.anIntArray551[local22];
			@Pc(164) int local164 = Static292.anIntArray551[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static182.aBoolean399 && Static231.method3761(Static218.anInt4450 + Static1.anInt4, Static72.anInt1818 + Static1.anInt3, local156, local160, local164, local39, local148, local152)) {
					Static263.anInt5180 = arg5;
					Static268.anInt5229 = arg6;
				}
				if (!Static116.aBoolean184 && !arg7) {
					Static1.aBoolean3 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static1.anInt2 || local148 > Static1.anInt2 || local152 > Static1.anInt2) {
						Static1.aBoolean3 = true;
					}
					if (arg0.anIntArray550 == null || arg0.anIntArray550[local5] == -1) {
						if (arg0.anIntArray553[local5] != 12345678) {
							Static1.method15(local156, local160, local164, local39, local148, local152, arg0.anIntArray553[local5], arg0.anIntArray542[local5], arg0.anIntArray544[local5]);
						}
					} else if (!Static206.aBoolean292) {
						@Pc(373) int local373 = Static1.anInterface3_1.method4132(arg0.anIntArray550[local5]);
						Static1.method15(local156, local160, local164, local39, local148, local152, Static95.method1665(local373, arg0.anIntArray553[local5]), Static95.method1665(local373, arg0.anIntArray542[local5]), Static95.method1665(local373, arg0.anIntArray544[local5]));
					} else if (arg0.aBoolean380) {
						Static1.method22(local156, local160, local164, local39, local148, local152, arg0.anIntArray553[local5], arg0.anIntArray542[local5], arg0.anIntArray544[local5], Static292.anIntArray546[0], Static292.anIntArray546[1], Static292.anIntArray546[3], Static292.anIntArray545[0], Static292.anIntArray545[1], Static292.anIntArray545[3], Static292.anIntArray548[0], Static292.anIntArray548[1], Static292.anIntArray548[3], arg0.anIntArray550[local5]);
					} else {
						Static1.method22(local156, local160, local164, local39, local148, local152, arg0.anIntArray553[local5], arg0.anIntArray542[local5], arg0.anIntArray544[local5], Static292.anIntArray546[local15], Static292.anIntArray546[local22], Static292.anIntArray546[local29], Static292.anIntArray545[local15], Static292.anIntArray545[local22], Static292.anIntArray545[local29], Static292.anIntArray548[local15], Static292.anIntArray548[local22], Static292.anIntArray548[local29], arg0.anIntArray550[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZCI)C")
	public static char method1732(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!qn;IIIIIIII)V")
	public static void method1733(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg6 & 0x3;
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (local5 == 1 || local5 == 3) {
			local21 = arg0.anInt4749;
			local18 = arg0.anInt4721;
		} else {
			local18 = arg0.anInt4749;
			local21 = arg0.anInt4721;
		}
		@Pc(44) int local44;
		@Pc(52) int local52;
		if (arg4 + local18 <= 104) {
			local44 = arg4 + (local18 >> 1);
			local52 = arg4 + (local18 + 1 >> 1);
		} else {
			local52 = arg4 + 1;
			local44 = arg4;
		}
		@Pc(81) int local81;
		@Pc(75) int local75;
		if (local21 + arg2 <= 104) {
			local75 = arg2 + (local21 + 1 >> 1);
			local81 = (local21 >> 1) + arg2;
		} else {
			local81 = arg2;
			local75 = arg2 + 1;
		}
		@Pc(97) int local97 = (local18 << 6) + (arg4 << 7);
		@Pc(101) int[][] local101 = Static9.anIntArrayArrayArray7[arg1];
		@Pc(109) int local109 = (arg2 << 7) + (local21 << 6);
		@Pc(136) int local136 = local101[local44][local75] + local101[local52][local81] + local101[local44][local81] + local101[local52][local75] >> 2;
		@Pc(138) int local138 = 0;
		@Pc(145) int[][] local145;
		if (arg1 != 0) {
			local145 = Static9.anIntArrayArrayArray7[0];
			local138 = local136 - (local145[local52][local75] + local145[local44][local81] + local145[local52][local81] + local145[local44][local75] >> 2);
		}
		local145 = null;
		if (arg1 < 3) {
			local145 = Static9.anIntArrayArrayArray7[arg1 + 1];
		}
		@Pc(208) Class50 local208 = arg0.method3825(local109, arg6, local136, local97, false, null, arg7, local145, true, local101);
		Static266.method4172(local208.aClass93_Sub1_1, local97 - arg3, local138, local109 - arg5);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!g;)V")
	public static void method1738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2) {
		if (arg2.anInt2094 == 1) {
			Static206.method3478("", 0L, arg2.anInt2096, (short) 40, arg2.aString70, 0, -1);
		}
		@Pc(39) String local39;
		if (arg2.anInt2094 == 2 && !Static287.aBoolean373) {
			local39 = Static50.method943(arg2);
			if (local39 != null) {
				Static206.method3478("<col=00ff00>" + arg2.aString72, 0L, arg2.anInt2096, (short) 20, local39, -1, -1);
			}
		}
		if (arg2.anInt2094 == 3) {
			Static206.method3478("", 0L, arg2.anInt2096, (short) 7, Static68.aString64, 0, -1);
		}
		if (arg2.anInt2094 == 4) {
			Static206.method3478("", 0L, arg2.anInt2096, (short) 33, arg2.aString70, 0, -1);
		}
		if (arg2.anInt2094 == 5) {
			Static206.method3478("", 0L, arg2.anInt2096, (short) 19, arg2.aString70, 0, -1);
		}
		if (arg2.anInt2094 == 6 && Static159.aClass56_17 == null) {
			Static206.method3478("", 0L, arg2.anInt2096, (short) 12, arg2.aString70, -1, -1);
		}
		@Pc(162) int local162;
		@Pc(160) int local160;
		if (arg2.anInt2092 == 2) {
			local160 = 0;
			for (local162 = 0; local162 < arg2.anInt2073; local162++) {
				for (@Pc(168) int local168 = 0; local168 < arg2.anInt2034; local168++) {
					@Pc(179) int local179 = (arg2.anInt2062 + 32) * local162;
					@Pc(186) int local186 = local168 * (arg2.anInt2045 + 32);
					if (local160 < 20) {
						local179 += arg2.anIntArray192[local160];
						local186 += arg2.anIntArray189[local160];
					}
					if (arg0 >= local186 && local179 <= arg1 && local186 + 32 > arg0 && local179 + 32 > arg1) {
						Static179.anInt3897 = local160;
						Static34.aClass56_5 = arg2;
						if (arg2.anIntArray178[local160] > 0) {
							@Pc(245) Class2_Sub7 local245 = Static42.method804(arg2);
							@Pc(256) Class60 local256 = Static87.method1546(arg2.anIntArray178[local160] - 1);
							if (Static73.anInt1823 == 1 && local245.method339()) {
								if (Static255.anInt5033 != arg2.anInt2096 || local160 != Static252.anInt4937) {
									Static206.method3478(Static4.aString3 + " -> <col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, (short) 13, Static21.aString22, local160, -1);
								}
							} else if (Static287.aBoolean373 && local245.method339()) {
								@Pc(281) Class2_Sub8_Sub24 local281 = Static161.anInt3604 == -1 ? null : Static270.method3460(Static161.anInt3604);
								if ((Static237.anInt4771 & 0x10) != 0 && (local281 == null || local256.method1644(Static161.anInt3604, local281.anInt5989) != local281.anInt5989)) {
									Static206.method3478(Static96.aString83 + " -> <col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, (short) 22, Static251.aString167, local160, Static312.anInt5126);
								}
							} else {
								@Pc(335) String[] local335 = local256.aStringArray17;
								if (Static262.aBoolean344) {
									local335 = Static103.method1789(local335);
								}
								@Pc(349) int local349;
								@Pc(367) byte local367;
								if (local245.method339()) {
									for (local349 = 4; local349 >= 3; local349--) {
										if (local335 != null && local335[local349] != null) {
											if (local349 == 3) {
												local367 = 8;
											} else {
												local367 = 49;
											}
											Static206.method3478("<col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, local367, local335[local349], local160, -1);
										}
									}
								}
								if (local245.method336()) {
									Static206.method3478("<col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, (short) 44, Static21.aString22, local160, Static269.anInt5273);
								}
								if (local245.method339() && local335 != null) {
									for (local349 = 2; local349 >= 0; local349--) {
										if (local335[local349] != null) {
											local367 = 0;
											if (local349 == 0) {
												local367 = 48;
											}
											if (local349 == 1) {
												local367 = 9;
											}
											if (local349 == 2) {
												local367 = 60;
											}
											Static206.method3478("<col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, local367, local335[local349], local160, -1);
										}
									}
								}
								local335 = arg2.aStringArray14;
								if (Static262.aBoolean344) {
									local335 = Static103.method1789(local335);
								}
								if (local335 != null) {
									for (local349 = 4; local349 >= 0; local349--) {
										if (local335[local349] != null) {
											local367 = 0;
											if (local349 == 0) {
												local367 = 23;
											}
											if (local349 == 1) {
												local367 = 26;
											}
											if (local349 == 2) {
												local367 = 51;
											}
											if (local349 == 3) {
												local367 = 29;
											}
											if (local349 == 4) {
												local367 = 58;
											}
											Static206.method3478("<col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, local367, local335[local349], local160, -1);
										}
									}
								}
								Static206.method3478("<col=ff9040>" + local256.aString81, (long) local256.anInt2257, arg2.anInt2096, (short) 1001, Static234.aString161, local160, Static294.anInt5732);
							}
						}
					}
					local160++;
				}
			}
		}
		if (!arg2.aBoolean132) {
			return;
		}
		if (!Static287.aBoolean373) {
			for (local160 = 9; local160 >= 5; local160--) {
				@Pc(669) String local669 = Static119.method4238(arg2, local160);
				if (local669 != null) {
					Static206.method3478(arg2.aString74, (long) (local160 + 1), arg2.anInt2096, (short) 1011, local669, arg2.anInt2056, Static215.method3576(local160, arg2));
				}
			}
			local39 = Static50.method943(arg2);
			if (local39 != null) {
				Static206.method3478(arg2.aString74, 0L, arg2.anInt2096, (short) 20, local39, arg2.anInt2056, -1);
			}
			for (local162 = 4; local162 >= 0; local162--) {
				@Pc(732) String local732 = Static119.method4238(arg2, local162);
				if (local732 != null) {
					Static206.method3478(arg2.aString74, (long) (local162 + 1), arg2.anInt2096, (short) 41, local732, arg2.anInt2056, Static215.method3576(local162, arg2));
				}
			}
			if (Static42.method804(arg2).method329()) {
				if (arg2.aString75 == null) {
					Static206.method3478("", 0L, arg2.anInt2096, (short) 12, Static92.aString80, arg2.anInt2056, -1);
				} else {
					Static206.method3478("", 0L, arg2.anInt2096, (short) 12, arg2.aString75, arg2.anInt2056, -1);
				}
			}
		} else if (Static42.method804(arg2).method330() && (Static237.anInt4771 & 0x20) != 0) {
			Static206.method3478(Static96.aString83 + " -> " + arg2.aString74, 0L, arg2.anInt2096, (short) 11, Static251.aString167, arg2.anInt2056, Static312.anInt5126);
		}
	}
}
