import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public static int anInt1344;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!fh;")
	public static Class58 aClass58_39;

	@OriginalMember(owner = "client!en", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Loading wordpack - ";

	@OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString83 = "Starting 3d Library";

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static248.method3922(arg0);
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(15) int local15 = arg0;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = -arg0;
		if (local9 < 0) {
			local9 = 0;
		}
		@Pc(29) int local29 = local9;
		@Pc(48) int local48;
		@Pc(56) int local56;
		@Pc(67) int local67;
		@Pc(77) int local77;
		if (Static156.anInt3086 <= arg5 && arg5 <= Static218.anInt4231) {
			@Pc(40) int[] local40 = Static220.anIntArrayArray36[arg5];
			local48 = Static3.method9(Static48.anInt902, arg2 - arg0, Static131.anInt2553);
			local56 = Static3.method9(Static48.anInt902, arg0 + arg2, Static131.anInt2553);
			local67 = Static3.method9(Static48.anInt902, arg2 - local9, Static131.anInt2553);
			local77 = Static3.method9(Static48.anInt902, arg2 + local9, Static131.anInt2553);
			Static99.method1656(local40, arg3, local48, local67);
			Static99.method1656(local40, arg4, local67, local77);
			Static99.method1656(local40, arg3, local77, local56);
		}
		@Pc(98) int local98 = -local9;
		@Pc(100) int local100 = -1;
		@Pc(102) int local102 = -1;
		while (local17 < local15) {
			local100 += 2;
			local98 += local100;
			local102 += 2;
			if (local98 >= 0 && local29 >= 1) {
				local29--;
				local98 -= local29 << 1;
				Static310.anIntArray678[local29] = local17;
			}
			local17++;
			local20 += local102;
			@Pc(254) int local254;
			@Pc(262) int local262;
			@Pc(274) int[] local274;
			@Pc(154) int local154;
			if (local20 >= 0) {
				local15--;
				local20 -= local15 << 1;
				local154 = arg5 - local15;
				local48 = arg5 + local15;
				if (Static156.anInt3086 <= local48 && local154 <= Static218.anInt4231) {
					if (local15 >= local9) {
						local56 = Static3.method9(Static48.anInt902, arg2 + local17, Static131.anInt2553);
						local67 = Static3.method9(Static48.anInt902, arg2 - local17, Static131.anInt2553);
						if (Static218.anInt4231 >= local48) {
							Static99.method1656(Static220.anIntArrayArray36[local48], arg3, local67, local56);
						}
						if (local154 >= Static156.anInt3086) {
							Static99.method1656(Static220.anIntArrayArray36[local154], arg3, local67, local56);
						}
					} else {
						local56 = Static310.anIntArray678[local15];
						local67 = Static3.method9(Static48.anInt902, arg2 + local17, Static131.anInt2553);
						local77 = Static3.method9(Static48.anInt902, arg2 - local17, Static131.anInt2553);
						local254 = Static3.method9(Static48.anInt902, arg2 + local56, Static131.anInt2553);
						local262 = Static3.method9(Static48.anInt902, arg2 - local56, Static131.anInt2553);
						if (Static218.anInt4231 >= local48) {
							local274 = Static220.anIntArrayArray36[local48];
							Static99.method1656(local274, arg3, local77, local262);
							Static99.method1656(local274, arg4, local262, local254);
							Static99.method1656(local274, arg3, local254, local67);
						}
						if (Static156.anInt3086 <= local154) {
							local274 = Static220.anIntArrayArray36[local154];
							Static99.method1656(local274, arg3, local77, local262);
							Static99.method1656(local274, arg4, local262, local254);
							Static99.method1656(local274, arg3, local254, local67);
						}
					}
				}
			}
			local48 = arg5 + local17;
			local154 = arg5 - local17;
			if (Static156.anInt3086 <= local48 && Static218.anInt4231 >= local154) {
				local56 = local15 + arg2;
				local67 = arg2 - local15;
				if (local56 >= Static48.anInt902 && Static131.anInt2553 >= local67) {
					local56 = Static3.method9(Static48.anInt902, local56, Static131.anInt2553);
					local67 = Static3.method9(Static48.anInt902, local67, Static131.anInt2553);
					if (local17 >= local9) {
						if (Static218.anInt4231 >= local48) {
							Static99.method1656(Static220.anIntArrayArray36[local48], arg3, local67, local56);
						}
						if (Static156.anInt3086 <= local154) {
							Static99.method1656(Static220.anIntArrayArray36[local154], arg3, local67, local56);
						}
					} else {
						local77 = local29 >= local17 ? local29 : Static310.anIntArray678[local17];
						local254 = Static3.method9(Static48.anInt902, arg2 + local77, Static131.anInt2553);
						local262 = Static3.method9(Static48.anInt902, arg2 - local77, Static131.anInt2553);
						if (Static218.anInt4231 >= local48) {
							local274 = Static220.anIntArrayArray36[local48];
							Static99.method1656(local274, arg3, local67, local262);
							Static99.method1656(local274, arg4, local262, local254);
							Static99.method1656(local274, arg3, local254, local56);
						}
						if (Static156.anInt3086 <= local154) {
							local274 = Static220.anIntArrayArray36[local154];
							Static99.method1656(local274, arg3, local67, local262);
							Static99.method1656(local274, arg4, local262, local254);
							Static99.method1656(local274, arg3, local254, local56);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)I")
	public static int method1084() {
		return 14;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)Z")
	public static boolean method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static31.method508(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static264.method4156(local10 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg2] + arg3, local14 + 1) && Static264.method4156(local10 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static264.method4156(local10 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static264.method4156(local10 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[[BI[Lclient!em;[[I[[B[[F[[B[[F[[FI[[B)V")
	public static void method1094(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class50[] arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			@Pc(22) Class50 local22 = arg2[local11];
			if (local22.anInt1326 == arg9) {
				@Pc(34) Class137 local34 = new Class137();
				@Pc(43) int local43 = (local22.anInt1320 >> 7) - local22.anInt1318;
				@Pc(45) int local45 = 0;
				if (local43 < 0) {
					local45 = -local43;
					local43 = 0;
				}
				@Pc(61) int local61 = local22.anInt1318 + (local22.anInt1320 >> 7);
				if (local61 > 103) {
					local61 = 103;
				}
				@Pc(78) int local78 = (local22.anInt1338 >> 7) - local22.anInt1318;
				@Pc(80) int local80;
				@Pc(88) short local88;
				@Pc(94) int local94;
				@Pc(102) int local102;
				@Pc(119) int local119;
				@Pc(138) int local138;
				@Pc(368) boolean local368;
				@Pc(341) int local341;
				for (local80 = local43; local80 <= local61; local80++) {
					local88 = local22.aShortArray28[local45];
					local94 = (local88 >> 8) + local78;
					local102 = (local88 & 0xFF) + local94 - 1;
					if (local94 < 0) {
						local94 = 0;
					}
					if (local102 > 103) {
						local102 = 103;
					}
					for (local119 = local94; local119 <= local102; local119++) {
						@Pc(130) int local130 = arg4[local119][local80] & 0xFF;
						local138 = arg6[local119][local80] & 0xFF;
						@Pc(140) boolean local140 = false;
						@Pc(156) Class129 local156;
						@Pc(177) int[] local177;
						@Pc(243) int[] local243;
						if (local130 == 0) {
							if (local138 == 0) {
								continue;
							}
							local156 = Static182.method2948(local138 - 1);
							if (local156.anInt3869 == -1) {
								continue;
							}
							if (arg10[local119][local80] != 0) {
								local177 = Static35.anIntArrayArray5[arg10[local119][local80]];
								local34.anInt4160 += (local177.length >> 1) * 3 - 6;
								local34.anInt4159 += local177.length >> 1;
								continue;
							}
						} else if (local138 != 0) {
							local156 = Static182.method2948(local138 - 1);
							@Pc(224) byte local224;
							if (local156.anInt3869 == -1) {
								local224 = arg10[local119][local80];
								if (local224 != 0) {
									local243 = Static86.anIntArrayArray16[local224];
									local34.anInt4160 += (local243.length >> 1) * 3 - 6;
									local34.anInt4159 += local243.length >> 1;
								}
								continue;
							}
							local224 = arg10[local119][local80];
							if (local224 != 0) {
								local140 = true;
							}
						}
						@Pc(272) Class33 local272 = Static193.method3075(arg9, local119, local80);
						if (local272 != null) {
							@Pc(283) int local283 = (int) (local272.aLong38 >> 14) & 0x3F;
							if (local283 == 9) {
								local243 = null;
								@Pc(297) int local297 = (int) (local272.aLong38 >> 20) & 0x3;
								@Pc(315) boolean local315;
								@Pc(329) short local329;
								@Pc(335) int local335;
								if ((local297 & 0x1) == 0) {
									local315 = local119 - 1 >= local94;
									if (!local315 && local61 >= local80 + 1) {
										local329 = local22.aShortArray28[local45 + 1];
										local335 = local78 + (local329 >> 8);
										local341 = (local329 & 0xFF) + local335;
										local315 = local119 > local335 && local341 > local119;
									}
									local368 = local102 >= local119 + 1;
									if (!local368 && local80 - 1 >= local43) {
										local329 = local22.aShortArray28[local45 - 1];
										local335 = local78 + (local329 >> 8);
										local341 = local335 + (local329 & 0xFF);
										local368 = local335 < local119 && local119 < local341;
									}
									if (local315 && local368) {
										local243 = Static35.anIntArrayArray5[0];
									} else if (local315) {
										local243 = Static35.anIntArrayArray5[1];
									} else if (local368) {
										local243 = Static35.anIntArrayArray5[1];
									}
								} else {
									local315 = local94 <= local119 - 1;
									if (!local315 && local43 <= local80 - 1) {
										local329 = local22.aShortArray28[local45 - 1];
										local335 = (local329 >> 8) + local78;
										local341 = local335 + (local329 & 0xFF);
										local315 = local119 > local335 && local341 > local119;
									}
									local368 = local119 + 1 <= local102;
									if (!local368 && local61 >= local80 + 1) {
										local329 = local22.aShortArray28[local45 + 1];
										local335 = (local329 >> 8) + local78;
										local341 = (local329 & 0xFF) + local335;
										local368 = local335 < local119 && local119 < local341;
									}
									if (local315 && local368) {
										local243 = Static35.anIntArrayArray5[0];
									} else if (local315) {
										local243 = Static35.anIntArrayArray5[1];
									} else if (local368) {
										local243 = Static35.anIntArrayArray5[1];
									}
								}
								if (local243 != null) {
									local34.anInt4160 += ((local243.length >> 1) - 2) * 3;
									local34.anInt4159 += local243.length >> 1;
								}
								continue;
							}
						}
						if (local140) {
							local177 = Static35.anIntArrayArray5[arg10[local119][local80]];
							local243 = Static86.anIntArrayArray16[arg10[local119][local80]];
							local34.anInt4160 += ((local177.length >> 1) - 2) * 3;
							local34.anInt4160 += ((local243.length >> 1) - 2) * 3;
							local34.anInt4159 += local177.length >> 1;
							local34.anInt4159 += local243.length >> 1;
						} else {
							local177 = Static35.anIntArrayArray5[0];
							local34.anInt4160 += ((local177.length >> 1) - 2) * 3;
							local34.anInt4159 += local177.length >> 1;
						}
					}
					local45++;
				}
				local34.method3445();
				local45 = 0;
				if ((local22.anInt1320 >> 7) - local22.anInt1318 < 0) {
					local45 = local22.anInt1318 - (local22.anInt1320 >> 7);
				}
				for (local80 = local43; local80 <= local61; local80++) {
					local88 = local22.aShortArray28[local45];
					local94 = local78 + (local88 >> 8);
					local102 = (local88 & 0xFF) + local94 - 1;
					if (local94 < 0) {
						local94 = 0;
					}
					if (local102 > 103) {
						local102 = 103;
					}
					for (local119 = local94; local119 <= local102; local119++) {
						@Pc(779) byte local779 = arg0[local119][local80];
						local138 = arg4[local119][local80] & 0xFF;
						@Pc(795) int local795 = arg6[local119][local80] & 0xFF;
						@Pc(797) boolean local797 = false;
						@Pc(810) Class129 local810;
						if (local138 == 0) {
							if (local795 == 0) {
								continue;
							}
							local810 = Static182.method2948(local795 - 1);
							if (local810.anInt3869 == -1) {
								continue;
							}
							if (arg10[local119][local80] != 0) {
								Static110.method1779(local22, Static35.anIntArrayArray5[arg10[local119][local80]], arg7, local80, local119, local34, arg5, arg8, arg0[local119][local80], arg3);
								continue;
							}
						} else if (local795 != 0) {
							local810 = Static182.method2948(local795 - 1);
							if (local810.anInt3869 == -1) {
								Static110.method1779(local22, Static86.anIntArrayArray16[arg10[local119][local80]], arg7, local80, local119, local34, arg5, arg8, arg0[local119][local80], arg3);
								continue;
							}
							@Pc(895) byte local895 = arg10[local119][local80];
							if (local895 != 0) {
								local797 = true;
							}
						}
						@Pc(907) Class33 local907 = Static193.method3075(arg9, local119, local80);
						if (local907 != null) {
							@Pc(918) int local918 = (int) (local907.aLong38 >> 14) & 0x3F;
							if (local918 == 9) {
								@Pc(925) int[] local925 = null;
								@Pc(933) int local933 = (int) (local907.aLong38 >> 20) & 0x3;
								@Pc(985) int local985;
								@Pc(959) boolean local959;
								@Pc(973) short local973;
								if ((local933 & 0x1) == 0) {
									local368 = local94 <= local119 - 1;
									local959 = local119 + 1 <= local102;
									if (!local368 && local61 >= local80 + 1) {
										local973 = local22.aShortArray28[local45 + 1];
										local341 = (local973 >> 8) + local78;
										local985 = (local973 & 0xFF) + local341;
										local368 = local341 < local119 && local119 < local985;
									}
									if (!local959 && local80 - 1 >= local43) {
										local973 = local22.aShortArray28[local45 - 1];
										local341 = local78 + (local973 >> 8);
										local985 = (local973 & 0xFF) + local341;
										local959 = local341 < local119 && local119 < local985;
									}
									if (local368 && local959) {
										local925 = Static35.anIntArrayArray5[0];
									} else if (local368) {
										local925 = Static35.anIntArrayArray5[1];
										local779 = 1;
									} else if (local959) {
										local925 = Static35.anIntArrayArray5[1];
										local779 = 3;
									}
								} else {
									local368 = local119 - 1 >= local94;
									local959 = local102 >= local119 + 1;
									if (!local368 && local80 - 1 >= local43) {
										local973 = local22.aShortArray28[local45 - 1];
										local341 = local78 + (local973 >> 8);
										local985 = local341 + (local973 & 0xFF);
										local368 = local341 < local119 && local119 < local985;
									}
									if (!local959 && local61 >= local80 + 1) {
										local973 = local22.aShortArray28[local45 + 1];
										local341 = local78 + (local973 >> 8);
										local985 = (local973 & 0xFF) + local341;
										local959 = local119 > local341 && local119 < local985;
									}
									if (local368 && local959) {
										local925 = Static35.anIntArrayArray5[0];
									} else if (local368) {
										local925 = Static35.anIntArrayArray5[1];
										local779 = 0;
									} else if (local959) {
										local925 = Static35.anIntArrayArray5[1];
										local779 = 2;
									}
								}
								if (local925 != null) {
									Static110.method1779(local22, local925, arg7, local80, local119, local34, arg5, arg8, local779, arg3);
								}
								continue;
							}
						}
						if (local797) {
							Static110.method1779(local22, Static86.anIntArrayArray16[arg10[local119][local80]], arg7, local80, local119, local34, arg5, arg8, arg0[local119][local80], arg3);
							Static110.method1779(local22, Static35.anIntArrayArray5[arg10[local119][local80]], arg7, local80, local119, local34, arg5, arg8, arg0[local119][local80], arg3);
						} else {
							Static110.method1779(local22, Static35.anIntArrayArray5[0], arg7, local80, local119, local34, arg5, arg8, local779, arg3);
						}
					}
					local45++;
				}
				if (local34.anInt4161 > 0 && local34.anInt4162 > 0) {
					local34.method3447();
					local22.aClass137_1 = local34;
				}
			}
		}
	}
}
