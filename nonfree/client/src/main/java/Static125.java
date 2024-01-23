import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!nm;")
	public static Class119 aClass119_46;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!nm;")
	public static Class119 aClass119_47;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!ah;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt2511 = 50;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[anInt2511];

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
	public static int[] anIntArray189 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString85 = "M";

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[I")
	public static int[] anIntArray190 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString86 = " from your ignore list first.";

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
	public static int[] anIntArray191 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
	public static int[] anIntArray192 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
	public static int[] anIntArray193 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
	public static int[] anIntArray194 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
	public static int[] anIntArray195 = new int[anInt2511];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!fh;I)V")
	public static void method2229(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (Static298.aClass38_5 == null) {
			return;
		}
		try {
			Static298.aClass38_5.method1030(0L);
			Static298.aClass38_5.method1029(arg1, arg0.aByteArray63, 24);
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([[BI[Lclient!ni;[[F[[F[[B[[BIB[[B[[I[[F)V")
	public static void method2230(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118[] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(16) Class118 local16 = arg2[local9];
			if (arg7 == local16.anInt3552) {
				@Pc(24) Class73 local24 = new Class73();
				@Pc(26) int local26 = 0;
				@Pc(34) int local34 = (local16.anInt3551 >> 7) - local16.anInt3568;
				@Pc(43) int local43 = (local16.anInt3569 >> 7) - local16.anInt3568;
				if (local43 < 0) {
					local26 = -local43;
					local43 = 0;
				}
				@Pc(62) int local62 = (local16.anInt3569 >> 7) + local16.anInt3568;
				if (local62 > 103) {
					local62 = 103;
				}
				@Pc(71) int local71;
				@Pc(83) short local83;
				@Pc(89) int local89;
				@Pc(97) int local97;
				@Pc(111) int local111;
				@Pc(130) int local130;
				@Pc(364) boolean local364;
				@Pc(345) int local345;
				for (local71 = local43; local71 <= local62; local71++) {
					local83 = local16.aShortArray74[local26];
					local89 = (local83 >> 8) + local34;
					local97 = local89 + (local83 & 0xFF) - 1;
					if (local89 < 0) {
						local89 = 0;
					}
					if (local97 > 103) {
						local97 = 103;
					}
					for (local111 = local89; local111 <= local97; local111++) {
						@Pc(122) int local122 = arg8[local111][local71] & 0xFF;
						local130 = arg0[local111][local71] & 0xFF;
						@Pc(132) boolean local132 = false;
						@Pc(149) Class192 local149;
						@Pc(170) int[] local170;
						@Pc(241) int[] local241;
						if (local122 == 0) {
							if (local130 == 0) {
								continue;
							}
							local149 = Static64.method1137(local130 - 1);
							if (local149.anInt5619 == -1) {
								continue;
							}
							if (arg5[local111][local71] != 0) {
								local241 = Static47.anIntArrayArray8[arg5[local111][local71]];
								local24.anInt2149 += (local241.length >> 1) * 3 - 6;
								local24.anInt2150 += local241.length >> 1;
								continue;
							}
						} else if (local130 != 0) {
							local149 = Static64.method1137(local130 - 1);
							@Pc(160) byte local160;
							if (local149.anInt5619 == -1) {
								local160 = arg5[local111][local71];
								if (local160 != 0) {
									local170 = Static181.anIntArrayArray25[local160];
									local24.anInt2149 += ((local170.length >> 1) - 2) * 3;
									local24.anInt2150 += local170.length >> 1;
								}
								continue;
							}
							local160 = arg5[local111][local71];
							if (local160 != 0) {
								local132 = true;
							}
						}
						@Pc(270) Class45 local270 = Static235.method3788(arg7, local111, local71);
						if (local270 != null) {
							@Pc(281) int local281 = (int) (local270.aLong56 >> 14) & 0x3F;
							if (local281 == 9) {
								local170 = null;
								@Pc(294) int local294 = (int) (local270.aLong56 >> 20) & 0x3;
								@Pc(314) boolean local314;
								@Pc(332) short local332;
								@Pc(339) int local339;
								if ((local294 & 0x1) == 0) {
									local314 = local89 <= local111 - 1;
									if (!local314 && local62 >= local71 + 1) {
										local332 = local16.aShortArray74[local26 + 1];
										local339 = local34 + (local332 >> 8);
										local345 = (local332 & 0xFF) + local339;
										local314 = local339 < local111 && local111 < local345;
									}
									local364 = local97 >= local111 + 1;
									if (!local364 && local71 - 1 >= local43) {
										local332 = local16.aShortArray74[local26 - 1];
										local339 = local34 + (local332 >> 8);
										local345 = (local332 & 0xFF) + local339;
										local364 = local339 < local111 && local111 < local345;
									}
									if (local314 && local364) {
										local170 = Static47.anIntArrayArray8[0];
									} else if (local314) {
										local170 = Static47.anIntArrayArray8[1];
									} else if (local364) {
										local170 = Static47.anIntArrayArray8[1];
									}
								} else {
									local364 = local97 >= local111 + 1;
									local314 = local89 <= local111 - 1;
									if (!local314 && local43 <= local71 - 1) {
										local332 = local16.aShortArray74[local26 - 1];
										local339 = (local332 >> 8) + local34;
										local345 = (local332 & 0xFF) + local339;
										local314 = local339 < local111 && local345 > local111;
									}
									if (!local364 && local62 >= local71 + 1) {
										local332 = local16.aShortArray74[local26 + 1];
										local339 = local34 + (local332 >> 8);
										local345 = (local332 & 0xFF) + local339;
										local364 = local111 > local339 && local345 > local111;
									}
									if (local314 && local364) {
										local170 = Static47.anIntArrayArray8[0];
									} else if (local314) {
										local170 = Static47.anIntArrayArray8[1];
									} else if (local364) {
										local170 = Static47.anIntArrayArray8[1];
									}
								}
								if (local170 != null) {
									local24.anInt2149 += ((local170.length >> 1) - 2) * 3;
									local24.anInt2150 += local170.length >> 1;
								}
								continue;
							}
						}
						if (local132) {
							local241 = Static47.anIntArrayArray8[arg5[local111][local71]];
							local170 = Static181.anIntArrayArray25[arg5[local111][local71]];
							local24.anInt2149 += (local241.length >> 1) * 3 - 6;
							local24.anInt2149 += ((local170.length >> 1) - 2) * 3;
							local24.anInt2150 += local241.length >> 1;
							local24.anInt2150 += local170.length >> 1;
						} else {
							local241 = Static47.anIntArrayArray8[0];
							local24.anInt2149 += (local241.length >> 1) * 3 - 6;
							local24.anInt2150 += local241.length >> 1;
						}
					}
					local26++;
				}
				local26 = 0;
				local24.method1945();
				if ((local16.anInt3569 >> 7) - local16.anInt3568 < 0) {
					local26 = local16.anInt3568 - (local16.anInt3569 >> 7);
				}
				for (local71 = local43; local71 <= local62; local71++) {
					local83 = local16.aShortArray74[local26];
					local89 = local34 + (local83 >> 8);
					local97 = (local83 & 0xFF) + local89 - 1;
					if (local89 < 0) {
						local89 = 0;
					}
					if (local97 > 103) {
						local97 = 103;
					}
					for (local111 = local89; local111 <= local97; local111++) {
						@Pc(768) int local768 = arg0[local111][local71] & 0xFF;
						local130 = arg8[local111][local71] & 0xFF;
						@Pc(778) boolean local778 = false;
						@Pc(784) byte local784 = arg6[local111][local71];
						@Pc(797) Class192 local797;
						if (local130 == 0) {
							if (local768 == 0) {
								continue;
							}
							local797 = Static64.method1137(local768 - 1);
							if (local797.anInt5619 == -1) {
								continue;
							}
							if (arg5[local111][local71] != 0) {
								Static240.method3830(local111, arg9, Static47.anIntArrayArray8[arg5[local111][local71]], arg10, arg6[local111][local71], local24, local71, arg3, local16, arg4);
								continue;
							}
						} else if (local768 != 0) {
							local797 = Static64.method1137(local768 - 1);
							if (local797.anInt5619 == -1) {
								Static240.method3830(local111, arg9, Static181.anIntArrayArray25[arg5[local111][local71]], arg10, arg6[local111][local71], local24, local71, arg3, local16, arg4);
								continue;
							}
							@Pc(809) byte local809 = arg5[local111][local71];
							if (local809 != 0) {
								local778 = true;
							}
						}
						@Pc(895) Class45 local895 = Static235.method3788(arg7, local111, local71);
						if (local895 != null) {
							@Pc(907) int local907 = (int) (local895.aLong56 >> 14) & 0x3F;
							if (local907 == 9) {
								@Pc(914) int[] local914 = null;
								@Pc(922) int local922 = (int) (local895.aLong56 >> 20) & 0x3;
								@Pc(979) int local979;
								@Pc(949) boolean local949;
								@Pc(967) short local967;
								if ((local922 & 0x1) == 0) {
									local364 = local89 <= local111 - 1;
									local949 = local97 >= local111 + 1;
									if (!local364 && local71 + 1 <= local62) {
										local967 = local16.aShortArray74[local26 + 1];
										local345 = (local967 >> 8) + local34;
										local979 = local345 + (local967 & 0xFF);
										local364 = local111 > local345 && local979 > local111;
									}
									if (!local949 && local43 <= local71 - 1) {
										local967 = local16.aShortArray74[local26 - 1];
										local345 = (local967 >> 8) + local34;
										local979 = (local967 & 0xFF) + local345;
										local949 = local345 < local111 && local979 > local111;
									}
									if (local364 && local949) {
										local914 = Static47.anIntArrayArray8[0];
									} else if (local364) {
										local914 = Static47.anIntArrayArray8[1];
										local784 = 1;
									} else if (local949) {
										local784 = 3;
										local914 = Static47.anIntArrayArray8[1];
									}
								} else {
									local364 = local89 <= local111 - 1;
									local949 = local111 + 1 <= local97;
									if (!local364 && local71 - 1 >= local43) {
										local967 = local16.aShortArray74[local26 - 1];
										local345 = (local967 >> 8) + local34;
										local979 = local345 + (local967 & 0xFF);
										local364 = local111 > local345 && local979 > local111;
									}
									if (!local949 && local62 >= local71 + 1) {
										local967 = local16.aShortArray74[local26 + 1];
										local345 = local34 + (local967 >> 8);
										local979 = (local967 & 0xFF) + local345;
										local949 = local111 > local345 && local979 > local111;
									}
									if (local364 && local949) {
										local914 = Static47.anIntArrayArray8[0];
									} else if (local364) {
										local784 = 0;
										local914 = Static47.anIntArrayArray8[1];
									} else if (local949) {
										local914 = Static47.anIntArrayArray8[1];
										local784 = 2;
									}
								}
								if (local914 != null) {
									Static240.method3830(local111, arg9, local914, arg10, local784, local24, local71, arg3, local16, arg4);
								}
								continue;
							}
						}
						if (local778) {
							Static240.method3830(local111, arg9, Static181.anIntArrayArray25[arg5[local111][local71]], arg10, arg6[local111][local71], local24, local71, arg3, local16, arg4);
							Static240.method3830(local111, arg9, Static47.anIntArrayArray8[arg5[local111][local71]], arg10, arg6[local111][local71], local24, local71, arg3, local16, arg4);
						} else {
							Static240.method3830(local111, arg9, Static47.anIntArrayArray8[0], arg10, local784, local24, local71, arg3, local16, arg4);
						}
					}
					local26++;
				}
				if (local24.anInt2148 > 0 && local24.anInt2151 > 0) {
					local24.method1944();
					local16.aClass73_1 = local24;
				}
			}
		}
	}
}
