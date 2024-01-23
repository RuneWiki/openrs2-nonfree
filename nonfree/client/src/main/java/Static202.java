import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt4038;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!ph;")
	public static Class138 aClass138_53;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString135 = "Loading defaults - ";

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Lclient!s;")
	public static Class156 aClass156_18 = new Class156(16);

	@OriginalMember(owner = "client!om", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString136 = "Loaded config";

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!oj;Lclient!ph;Lclient!ph;Z)V")
	public static void method3244(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class138 arg2) {
		Static276.anInterface4_3 = arg0;
		Static49.aClass138_10 = arg2;
		Static271.aClass138_73 = arg1;
		if (Static271.aClass138_73 != null) {
			Static236.anInt4779 = Static271.aClass138_73.method3365(1);
		}
		if (Static49.aClass138_10 != null) {
			Static295.anInt5588 = Static49.aClass138_10.method3365(1);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([[B[[B[[BI[[B[[FI[[I[Lclient!tm;I[[F[[F)V")
	public static void method3245(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) float[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) Class170[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(13) int local13 = 0; local13 < arg8; local13++) {
			@Pc(24) Class170 local24 = arg7[local13];
			if (local24.anInt5272 == arg5) {
				@Pc(37) Class100 local37 = new Class100();
				@Pc(39) int local39 = 0;
				@Pc(47) int local47 = local24.anInt5280 + (local24.anInt5266 >> 7);
				@Pc(56) int local56 = (local24.anInt5278 >> 7) - local24.anInt5280;
				@Pc(65) int local65 = (local24.anInt5266 >> 7) - local24.anInt5280;
				if (local47 > 103) {
					local47 = 103;
				}
				if (local65 < 0) {
					local39 = -local65;
					local65 = 0;
				}
				@Pc(85) int local85;
				@Pc(97) short local97;
				@Pc(103) int local103;
				@Pc(111) int local111;
				@Pc(126) int local126;
				@Pc(145) int local145;
				@Pc(318) boolean local318;
				@Pc(364) int local364;
				for (local85 = local65; local85 <= local47; local85++) {
					local97 = local24.aShortArray90[local39];
					local103 = (local97 >> 8) + local56;
					local111 = (local97 & 0xFF) + local103 - 1;
					if (local103 < 0) {
						local103 = 0;
					}
					if (local111 > 103) {
						local111 = 103;
					}
					for (local126 = local103; local126 <= local111; local126++) {
						@Pc(137) int local137 = arg0[local126][local85] & 0xFF;
						local145 = arg1[local126][local85] & 0xFF;
						@Pc(147) boolean local147 = false;
						@Pc(160) Class59 local160;
						@Pc(181) int[] local181;
						@Pc(232) int[] local232;
						if (local137 == 0) {
							if (local145 == 0) {
								continue;
							}
							local160 = Static229.method3600(local145 - 1);
							if (local160.anInt1520 == -1) {
								continue;
							}
							if (arg2[local126][local85] != 0) {
								local181 = Static114.anIntArrayArray14[arg2[local126][local85]];
								local37.anInt2764 += (local181.length >> 1) * 3 - 6;
								local37.anInt2765 += local181.length >> 1;
								continue;
							}
						} else if (local145 != 0) {
							local160 = Static229.method3600(local145 - 1);
							@Pc(225) byte local225;
							if (local160.anInt1520 == -1) {
								local225 = arg2[local126][local85];
								if (local225 != 0) {
									local232 = Static239.anIntArrayArray36[local225];
									local37.anInt2764 += ((local232.length >> 1) - 2) * 3;
									local37.anInt2765 += local232.length >> 1;
								}
								continue;
							}
							local225 = arg2[local126][local85];
							if (local225 != 0) {
								local147 = true;
							}
						}
						@Pc(274) Class60 local274 = Static31.method536(arg5, local126, local85);
						if (local274 != null) {
							@Pc(284) int local284 = (int) (local274.aLong64 >> 14) & 0x3F;
							if (local284 == 9) {
								local232 = null;
								@Pc(298) int local298 = (int) (local274.aLong64 >> 20) & 0x3;
								@Pc(331) boolean local331;
								@Pc(350) short local350;
								@Pc(357) int local357;
								if ((local298 & 0x1) == 0) {
									local331 = local103 <= local126 - 1;
									local318 = local111 >= local126 + 1;
									if (!local331 && local85 + 1 <= local47) {
										local350 = local24.aShortArray90[local39 + 1];
										local357 = (local350 >> 8) + local56;
										local364 = (local350 & 0xFF) + local357;
										local331 = local126 > local357 && local126 < local364;
									}
									if (!local318 && local65 <= local85 - 1) {
										local350 = local24.aShortArray90[local39 - 1];
										local357 = (local350 >> 8) + local56;
										local364 = local357 + (local350 & 0xFF);
										local318 = local357 < local126 && local126 < local364;
									}
									if (local331 && local318) {
										local232 = Static114.anIntArrayArray14[0];
									} else if (local331) {
										local232 = Static114.anIntArrayArray14[1];
									} else if (local318) {
										local232 = Static114.anIntArrayArray14[1];
									}
								} else {
									local318 = local111 >= local126 + 1;
									local331 = local103 <= local126 - 1;
									if (!local331 && local65 <= local85 - 1) {
										local350 = local24.aShortArray90[local39 - 1];
										local357 = local56 + (local350 >> 8);
										local364 = local357 + (local350 & 0xFF);
										local331 = local357 < local126 && local126 < local364;
									}
									if (!local318 && local47 >= local85 + 1) {
										local350 = local24.aShortArray90[local39 + 1];
										local357 = local56 + (local350 >> 8);
										local364 = local357 + (local350 & 0xFF);
										local318 = local357 < local126 && local126 < local364;
									}
									if (local331 && local318) {
										local232 = Static114.anIntArrayArray14[0];
									} else if (local331) {
										local232 = Static114.anIntArrayArray14[1];
									} else if (local318) {
										local232 = Static114.anIntArrayArray14[1];
									}
								}
								if (local232 != null) {
									local37.anInt2764 += (local232.length >> 1) * 3 - 6;
									local37.anInt2765 += local232.length >> 1;
								}
								continue;
							}
						}
						if (local147) {
							local181 = Static114.anIntArrayArray14[arg2[local126][local85]];
							local232 = Static239.anIntArrayArray36[arg2[local126][local85]];
							local37.anInt2764 += (local181.length >> 1) * 3 - 6;
							local37.anInt2764 += (local232.length >> 1) * 3 - 6;
							local37.anInt2765 += local181.length >> 1;
							local37.anInt2765 += local232.length >> 1;
						} else {
							local181 = Static114.anIntArrayArray14[0];
							local37.anInt2764 += ((local181.length >> 1) - 2) * 3;
							local37.anInt2765 += local181.length >> 1;
						}
					}
					local39++;
				}
				local37.method2236();
				local39 = 0;
				if ((local24.anInt5266 >> 7) - local24.anInt5280 < 0) {
					local39 = local24.anInt5280 - (local24.anInt5266 >> 7);
				}
				for (local85 = local65; local85 <= local47; local85++) {
					local97 = local24.aShortArray90[local39];
					local103 = local56 + (local97 >> 8);
					local111 = local103 + (local97 & 0xFF) - 1;
					if (local111 > 103) {
						local111 = 103;
					}
					if (local103 < 0) {
						local103 = 0;
					}
					for (local126 = local103; local126 <= local111; local126++) {
						@Pc(768) byte local768 = arg3[local126][local85];
						local145 = arg0[local126][local85] & 0xFF;
						@Pc(784) int local784 = arg1[local126][local85] & 0xFF;
						@Pc(786) boolean local786 = false;
						@Pc(798) Class59 local798;
						if (local145 == 0) {
							if (local784 == 0) {
								continue;
							}
							local798 = Static229.method3600(local784 - 1);
							if (local798.anInt1520 == -1) {
								continue;
							}
							if (arg2[local126][local85] != 0) {
								Static206.method3275(local126, Static114.anIntArrayArray14[arg2[local126][local85]], local37, arg3[local126][local85], arg10, arg6, arg4, local85, local24, arg9);
								continue;
							}
						} else if (local784 != 0) {
							local798 = Static229.method3600(local784 - 1);
							if (local798.anInt1520 == -1) {
								Static206.method3275(local126, Static239.anIntArrayArray36[arg2[local126][local85]], local37, arg3[local126][local85], arg10, arg6, arg4, local85, local24, arg9);
								continue;
							}
							@Pc(877) byte local877 = arg2[local126][local85];
							if (local877 != 0) {
								local786 = true;
							}
						}
						@Pc(888) Class60 local888 = Static31.method536(arg5, local126, local85);
						if (local888 != null) {
							@Pc(898) int local898 = (int) (local888.aLong64 >> 14) & 0x3F;
							if (local898 == 9) {
								@Pc(906) int[] local906 = null;
								@Pc(914) int local914 = (int) (local888.aLong64 >> 20) & 0x3;
								@Pc(965) int local965;
								@Pc(939) boolean local939;
								@Pc(953) short local953;
								if ((local914 & 0x1) == 0) {
									local318 = local126 - 1 >= local103;
									if (!local318 && local47 >= local85 + 1) {
										local953 = local24.aShortArray90[local39 + 1];
										local364 = (local953 >> 8) + local56;
										local965 = (local953 & 0xFF) + local364;
										local318 = local126 > local364 && local965 > local126;
									}
									local939 = local111 >= local126 + 1;
									if (!local939 && local85 - 1 >= local65) {
										local953 = local24.aShortArray90[local39 - 1];
										local364 = (local953 >> 8) + local56;
										local965 = local364 + (local953 & 0xFF);
										local939 = local126 > local364 && local965 > local126;
									}
									if (local318 && local939) {
										local906 = Static114.anIntArrayArray14[0];
									} else if (local318) {
										local906 = Static114.anIntArrayArray14[1];
										local768 = 1;
									} else if (local939) {
										local906 = Static114.anIntArrayArray14[1];
										local768 = 3;
									}
								} else {
									local318 = local103 <= local126 - 1;
									local939 = local111 >= local126 + 1;
									if (!local318 && local85 - 1 >= local65) {
										local953 = local24.aShortArray90[local39 - 1];
										local364 = (local953 >> 8) + local56;
										local965 = (local953 & 0xFF) + local364;
										local318 = local126 > local364 && local126 < local965;
									}
									if (!local939 && local47 >= local85 + 1) {
										local953 = local24.aShortArray90[local39 + 1];
										local364 = local56 + (local953 >> 8);
										local965 = local364 + (local953 & 0xFF);
										local939 = local364 < local126 && local965 > local126;
									}
									if (local318 && local939) {
										local906 = Static114.anIntArrayArray14[0];
									} else if (local318) {
										local768 = 0;
										local906 = Static114.anIntArrayArray14[1];
									} else if (local939) {
										local768 = 2;
										local906 = Static114.anIntArrayArray14[1];
									}
								}
								if (local906 != null) {
									Static206.method3275(local126, local906, local37, local768, arg10, arg6, arg4, local85, local24, arg9);
								}
								continue;
							}
						}
						if (local786) {
							Static206.method3275(local126, Static239.anIntArrayArray36[arg2[local126][local85]], local37, arg3[local126][local85], arg10, arg6, arg4, local85, local24, arg9);
							Static206.method3275(local126, Static114.anIntArrayArray14[arg2[local126][local85]], local37, arg3[local126][local85], arg10, arg6, arg4, local85, local24, arg9);
						} else {
							Static206.method3275(local126, Static114.anIntArrayArray14[0], local37, local768, arg10, arg6, arg4, local85, local24, arg9);
						}
					}
					local39++;
				}
				if (local37.anInt2762 > 0 && local37.anInt2763 > 0) {
					local37.method2239();
					local24.aClass100_1 = local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V")
	public static void method3246(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static72.method1159(arg0 - 1L);
			Static72.method1159(1L);
		} else {
			Static72.method1159(arg0);
		}
	}
}
