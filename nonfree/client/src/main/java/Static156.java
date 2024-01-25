import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "[Lclient!wl;")
	public static Class215[] aClass215Array1;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!p;")
	public static final Class159 aClass159_5 = new Class159();

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Lclient!gg;")
	public static Class75 aClass75_1 = new Class75(8);

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!g;IIIIIIIIIII)Z")
	public static boolean method3146(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(23) int local23 = arg5 - 64;
		Static252.anIntArrayArray55[64][64] = 99;
		Static109.anIntArrayArray27[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(49) int local49 = 0;
		Static45.anIntArray113[0] = arg7;
		@Pc(56) int local56 = local37 + 1;
		Static57.anIntArray162[0] = arg5;
		@Pc(61) int[][] local61 = arg0.anIntArrayArray24;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(76) int local76;
				@Pc(92) int local92;
				@Pc(98) int local98;
				@Pc(249) int local249;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local49 == local56) {
									Static228.anInt4746 = local7;
									Static129.anInt2839 = local9;
									return false;
								}
								local7 = Static45.anIntArray113[local49];
								local9 = Static57.anIntArray162[local49];
								local76 = local9 - local23;
								local81 = local7 - local18;
								local49 = local49 + 1 & 0xFFF;
								local92 = local7 - arg0.anInt2230;
								local98 = local9 - arg0.anInt2240;
								if (arg4 == -4) {
									if (local7 == arg1 && arg3 == local9) {
										Static129.anInt2839 = local9;
										Static228.anInt4746 = local7;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static77.method1749(arg1, local7, arg9, arg2, arg10, arg3, local9, arg9)) {
										Static129.anInt2839 = local9;
										Static228.anInt4746 = local7;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg0.method1932(arg3, arg1, local7, arg10, arg9, arg2, arg9, arg8, local9)) {
										Static228.anInt4746 = local7;
										Static129.anInt2839 = local9;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg0.method1944(local9, arg8, arg9, arg1, arg2, arg3, local7, arg10)) {
										Static228.anInt4746 = local7;
										Static129.anInt2839 = local9;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg0.method1947(arg1, arg4, local9, arg3, arg9, arg6, local7)) {
										Static228.anInt4746 = local7;
										Static129.anInt2839 = local9;
										return true;
									}
								} else if (arg0.method1935(arg1, local9, arg4, arg6, arg9, local7, arg3)) {
									Static228.anInt4746 = local7;
									Static129.anInt2839 = local9;
									return true;
								}
								local249 = Static109.anIntArrayArray27[local81][local76] + 1;
								if (local81 > 0 && Static252.anIntArrayArray55[local81 - 1][local76] == 0 && (local61[local92 - 1][local98] & 0x43A40000) == 0 && (local61[local92 - 1][local98 + arg9 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 - 1 <= local292) {
											Static45.anIntArray113[local56] = local7 - 1;
											Static57.anIntArray162[local56] = local9;
											Static252.anIntArrayArray55[local81 - 1][local76] = 2;
											local56 = local56 + 1 & 0xFFF;
											Static109.anIntArrayArray27[local81 - 1][local76] = local249;
											break;
										}
										if ((local61[local92 - 1][local292 + local98] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 < 128 - arg9 && Static252.anIntArrayArray55[local81 + 1][local76] == 0 && (local61[local92 + arg9][local98] & 0x60E40000) == 0 && (local61[arg9 + local92][local98 + arg9 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static45.anIntArray113[local56] = local7 + 1;
											Static57.anIntArray162[local56] = local9;
											local56 = local56 + 1 & 0xFFF;
											Static252.anIntArrayArray55[local81 + 1][local76] = 8;
											Static109.anIntArrayArray27[local81 + 1][local76] = local249;
											break;
										}
										if ((local61[arg9 + local92][local98 + local292] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local76 > 0 && Static252.anIntArrayArray55[local81][local76 - 1] == 0 && (local61[local92][local98 - 1] & 0x43A40000) == 0 && (local61[local92 + arg9 - 1][local98 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static45.anIntArray113[local56] = local7;
											Static57.anIntArray162[local56] = local9 - 1;
											local56 = local56 + 1 & 0xFFF;
											Static252.anIntArrayArray55[local81][local76 - 1] = 1;
											Static109.anIntArrayArray27[local81][local76 - 1] = local249;
											break;
										}
										if ((local61[local92 + local292][local98 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local76 < 128 - arg9 && Static252.anIntArrayArray55[local81][local76 + 1] == 0 && (local61[local92][arg9 + local98] & 0x4E240000) == 0 && (local61[arg9 + local92 - 1][local98 + arg9] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 - 1 <= local292) {
											Static45.anIntArray113[local56] = local7;
											Static57.anIntArray162[local56] = local9 + 1;
											local56 = local56 + 1 & 0xFFF;
											Static252.anIntArrayArray55[local81][local76 + 1] = 4;
											Static109.anIntArrayArray27[local81][local76 + 1] = local249;
											break;
										}
										if ((local61[local292 + local92][local98 + arg9] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 > 0 && local76 > 0 && Static252.anIntArrayArray55[local81 - 1][local76 - 1] == 0 && (local61[local92 - 1][local98 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9) {
											Static45.anIntArray113[local56] = local7 - 1;
											Static57.anIntArray162[local56] = local9 - 1;
											local56 = local56 + 1 & 0xFFF;
											Static252.anIntArrayArray55[local81 - 1][local76 - 1] = 3;
											Static109.anIntArrayArray27[local81 - 1][local76 - 1] = local249;
											break;
										}
										if ((local61[local92 - 1][local292 + local98 - 1] & 0x4FA40000) != 0 || (local61[local292 + local92 - 1][local98 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg9 > local81 && local76 > 0 && Static252.anIntArrayArray55[local81 + 1][local76 - 1] == 0 && (local61[arg9 + local92][local98 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 <= local292) {
											Static45.anIntArray113[local56] = local7 + 1;
											Static57.anIntArray162[local56] = local9 - 1;
											Static252.anIntArrayArray55[local81 + 1][local76 - 1] = 9;
											local56 = local56 + 1 & 0xFFF;
											Static109.anIntArrayArray27[local81 + 1][local76 - 1] = local249;
											break;
										}
										if ((local61[arg9 + local92][local98 + local292 - 1] & 0x78E40000) != 0 || (local61[local92 + local292][local98 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local81 > 0 && local76 < 128 - arg9 && Static252.anIntArrayArray55[local81 - 1][local76 + 1] == 0 && (local61[local92 - 1][local98 + arg9] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg9; local292++) {
										if ((local61[local92 - 1][local98 + local292] & 0x4FA40000) != 0 || (local61[local292 + local92 - 1][arg9 + local98] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static45.anIntArray113[local56] = local7 - 1;
									Static57.anIntArray162[local56] = local9 + 1;
									local56 = local56 + 1 & 0xFFF;
									Static252.anIntArrayArray55[local81 - 1][local76 + 1] = 6;
									Static109.anIntArrayArray27[local81 - 1][local76 + 1] = local249;
								}
							} while (local81 >= 128 - arg9);
						} while (128 - arg9 <= local76);
					} while (Static252.anIntArrayArray55[local81 + 1][local76 + 1] != 0);
				} while ((local61[local92 + arg9][local98 + arg9] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg9; local292++) {
					if ((local61[local292 + local92][local98 + arg9] & 0x7E240000) != 0 || (local61[local92 + arg9][local292 + local98] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static45.anIntArray113[local56] = local7 + 1;
				Static57.anIntArray162[local56] = local9 + 1;
				Static252.anIntArrayArray55[local81 + 1][local76 + 1] = 12;
				local56 = local56 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local81 + 1][local76 + 1] = local249;
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
	public static void method3147() {
		for (@Pc(1) int local1 = 0; local1 < Static305.anInt6023; local1++) {
			if (!Static295.aBooleanArray26[local1]) {
				@Pc(10) Class1_Sub30_Sub1 local10 = Static309.aClass1_Sub30_Sub1Array2[local1];
				@Pc(13) int local13 = local10.anInt5311;
				@Pc(18) int local18 = local10.anInt5300 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt5299 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt5297 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt5297 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static315.anInt6124) {
					local54 = Static315.anInt6124 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray104[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static242.anInt6744) {
						local101 = Static242.anInt6744 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class17_Sub1 local134 = Static258.method4649(local13, local118, local71, fe.class);
						if (local134 != null && local134.aByte50 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte50 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray104[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray104[local28 - 1];
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
									local175 = local10.aShortArray104[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray104[local28 + 1];
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
				Static295.aBooleanArray26[local1] = true;
				Static298.aClass53Array3[local13].method2786(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZZI)V")
	public static void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(36) int local36 = arg1 - 334;
		if (local36 < 0) {
			local36 = 0;
		} else if (local36 > 100) {
			local36 = 100;
		}
		@Pc(58) int local58 = Static35.aShort16 + (Static84.aShort28 - Static35.aShort16) * local36 / 100;
		if (Static127.aShort31 > local58) {
			local58 = Static127.aShort31;
		} else if (Static315.aShort89 < local58) {
			local58 = Static315.aShort89;
		}
		@Pc(88) int local88 = arg1 * local58 * 512 / (arg2 * 334);
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(104) short local104;
		if (local88 < Static83.aShort27) {
			local104 = Static83.aShort27;
			local58 = local104 * 334 * arg2 / (arg1 * 512);
			if (Static315.aShort89 < local58) {
				local58 = Static315.aShort89;
				local133 = arg1 * 512 * local58 / (local104 * 334);
				local140 = (arg2 - local133) / 2;
				if (arg3) {
					Static208.aClass32_11.method2184();
					Static208.aClass32_11.method2191(-16777216, arg4, local140, arg0, arg1);
					Static208.aClass32_11.method2191(-16777216, arg4 + arg2 - local140, local140, arg0, arg1);
				}
				arg2 -= local140 * 2;
				arg4 += local140;
			}
		} else if (local88 > Static103.aShort29) {
			local104 = Static103.aShort29;
			local58 = arg2 * local104 * 334 / (arg1 * 512);
			if (Static127.aShort31 > local58) {
				local58 = Static127.aShort31;
				local133 = arg2 * 334 * local104 / (local58 * 512);
				local140 = (arg1 - local133) / 2;
				if (arg3) {
					Static208.aClass32_11.method2184();
					Static208.aClass32_11.method2191(-16777216, arg4, arg2, arg0, local140);
					Static208.aClass32_11.method2191(-16777216, arg4, arg2, arg0 + arg1 - local140, local140);
				}
				arg1 -= local140 * 2;
				arg0 += local140;
			}
		}
		Static1.anInt49 = (short) arg2;
		Static73.anInt1940 = arg0;
		Static340.anInt6545 = arg1 * local58 / 334;
		Static157.anInt4882 = arg4;
		Static74.anInt1955 = (short) arg1;
	}
}
