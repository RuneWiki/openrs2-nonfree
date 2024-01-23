import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt5137;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!db;")
	public static Class31 aClass31_38 = new Class31(30);

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString175 = "scroll:";

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZIII)V")
	public static void method3958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) Class127 local4 = Static241.method3829(arg4, arg1);
		if (local4 != null && local4.anObjectArray21 != null) {
			@Pc(18) Class1_Sub20 local18 = new Class1_Sub20();
			local18.aClass127_9 = local4;
			local18.anObjectArray2 = local4.anObjectArray21;
			Static283.method4321(local18);
		}
		Static26.anInt574 = arg0;
		Static162.anInt2993 = arg5;
		Static14.anInt367 = arg3;
		Static278.anInt5569 = arg4;
		Static197.anInt3818 = arg1;
		Static223.anInt4684 = arg2;
		Static75.aBoolean115 = true;
		Static155.method2392(local4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method3959() {
		Static56.anInt1180 = 0;
		@Pc(12) int local12 = (Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7) + Static224.anInt4695;
		@Pc(23) int local23 = Static158.anInt2961 + (Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static56.anInt1180 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static56.anInt1180 = 1;
		}
		if (Static56.anInt1180 == 1 && local12 >= 3139 && local12 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static56.anInt1180 = 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ak;ILclient!ak;Z)Lclient!bk;")
	public static Class1_Sub2_Sub4 method3960(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(10) int[] local10 = arg2.method266(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(32) byte[] local32 = arg2.method238(arg0, local10[local14]);
			if (local32 == null) {
				local12 = false;
			} else {
				@Pc(53) int local53 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(69) byte[] local69 = arg1.method238(local53, 0);
				if (local69 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub4(arg2, arg1, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[[FI[[I[[B[[F[[B[[B[[BI[Lclient!hm;[[F)V")
	public static void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(10) Class72[] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(14) int local14 = 0; local14 < arg2; local14++) {
			@Pc(21) Class72 local21 = arg9[local14];
			if (local21.anInt1953 == arg0) {
				@Pc(30) Class57 local30 = new Class57();
				@Pc(32) int local32 = 0;
				@Pc(40) int local40 = (local21.anInt1961 >> 7) - local21.anInt1952;
				@Pc(48) int local48 = (local21.anInt1947 >> 7) - local21.anInt1952;
				@Pc(56) int local56 = local21.anInt1952 + (local21.anInt1947 >> 7);
				if (local56 > 103) {
					local56 = 103;
				}
				if (local48 < 0) {
					local32 = -local48;
					local48 = 0;
				}
				@Pc(75) int local75;
				@Pc(83) short local83;
				@Pc(90) int local90;
				@Pc(98) int local98;
				@Pc(114) int local114;
				@Pc(137) int local137;
				@Pc(326) boolean local326;
				@Pc(353) int local353;
				for (local75 = local48; local75 <= local56; local75++) {
					local83 = local21.aShortArray36[local32];
					local90 = local40 + (local83 >> 8);
					local98 = local90 + (local83 & 0xFF) - 1;
					if (local90 < 0) {
						local90 = 0;
					}
					if (local98 > 103) {
						local98 = 103;
					}
					for (local114 = local90; local114 <= local98; local114++) {
						@Pc(129) int local129 = arg4[local114][local75] & 0xFF;
						local137 = arg6[local114][local75] & 0xFF;
						@Pc(139) boolean local139 = false;
						@Pc(157) Class182 local157;
						@Pc(181) int[] local181;
						@Pc(247) int[] local247;
						if (local129 == 0) {
							if (local137 == 0) {
								continue;
							}
							local157 = Static106.method1680(local137 - 1);
							if (local157.anInt5910 == -1) {
								continue;
							}
							if (arg7[local114][local75] != 0) {
								local181 = Static116.anIntArrayArray20[arg7[local114][local75]];
								local30.anInt1621 += ((local181.length >> 1) - 2) * 3;
								local30.anInt1620 += local181.length >> 1;
								continue;
							}
						} else if (local137 != 0) {
							local157 = Static106.method1680(local137 - 1);
							@Pc(226) byte local226;
							if (local157.anInt5910 == -1) {
								local226 = arg7[local114][local75];
								if (local226 != 0) {
									local247 = Static189.anIntArrayArray29[local226];
									local30.anInt1621 += ((local247.length >> 1) - 2) * 3;
									local30.anInt1620 += local247.length >> 1;
								}
								continue;
							}
							local226 = arg7[local114][local75];
							if (local226 != 0) {
								local139 = true;
							}
						}
						@Pc(276) Class124 local276 = Static147.method2286(arg0, local114, local75);
						if (local276 != null) {
							@Pc(287) int local287 = (int) (local276.aLong114 >> 14) & 0x3F;
							if (local287 == 9) {
								local247 = null;
								@Pc(300) int local300 = (int) (local276.aLong114 >> 20) & 0x3;
								@Pc(313) boolean local313;
								@Pc(340) short local340;
								@Pc(346) int local346;
								if ((local300 & 0x1) == 0) {
									local313 = local90 <= local114 - 1;
									local326 = local114 + 1 <= local98;
									if (!local313 && local75 + 1 <= local56) {
										local340 = local21.aShortArray36[local32 + 1];
										local346 = (local340 >> 8) + local40;
										local353 = local346 + (local340 & 0xFF);
										local313 = local114 > local346 && local353 > local114;
									}
									if (!local326 && local48 <= local75 - 1) {
										local340 = local21.aShortArray36[local32 - 1];
										local346 = local40 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local326 = local346 < local114 && local114 < local353;
									}
									if (local313 && local326) {
										local247 = Static116.anIntArrayArray20[0];
									} else if (local313) {
										local247 = Static116.anIntArrayArray20[1];
									} else if (local326) {
										local247 = Static116.anIntArrayArray20[1];
									}
								} else {
									local313 = local114 - 1 >= local90;
									local326 = local98 >= local114 + 1;
									if (!local313 && local75 - 1 >= local48) {
										local340 = local21.aShortArray36[local32 - 1];
										local346 = (local340 >> 8) + local40;
										local353 = local346 + (local340 & 0xFF);
										local313 = local346 < local114 && local114 < local353;
									}
									if (!local326 && local75 + 1 <= local56) {
										local340 = local21.aShortArray36[local32 + 1];
										local346 = local40 + (local340 >> 8);
										local353 = (local340 & 0xFF) + local346;
										local326 = local114 > local346 && local114 < local353;
									}
									if (local313 && local326) {
										local247 = Static116.anIntArrayArray20[0];
									} else if (local313) {
										local247 = Static116.anIntArrayArray20[1];
									} else if (local326) {
										local247 = Static116.anIntArrayArray20[1];
									}
								}
								if (local247 != null) {
									local30.anInt1621 += ((local247.length >> 1) - 2) * 3;
									local30.anInt1620 += local247.length >> 1;
								}
								continue;
							}
						}
						if (local139) {
							local247 = Static189.anIntArrayArray29[arg7[local114][local75]];
							local181 = Static116.anIntArrayArray20[arg7[local114][local75]];
							local30.anInt1621 += ((local181.length >> 1) - 2) * 3;
							local30.anInt1621 += ((local247.length >> 1) - 2) * 3;
							local30.anInt1620 += local181.length >> 1;
							local30.anInt1620 += local247.length >> 1;
						} else {
							local181 = Static116.anIntArrayArray20[0];
							local30.anInt1621 += (local181.length >> 1) * 3 - 6;
							local30.anInt1620 += local181.length >> 1;
						}
					}
					local32++;
				}
				local32 = 0;
				local30.method1392();
				if ((local21.anInt1947 >> 7) - local21.anInt1952 < 0) {
					local32 = local21.anInt1952 - (local21.anInt1947 >> 7);
				}
				for (local75 = local48; local75 <= local56; local75++) {
					local83 = local21.aShortArray36[local32];
					local90 = (local83 >> 8) + local40;
					local98 = local90 + (local83 & 0xFF) - 1;
					if (local90 < 0) {
						local90 = 0;
					}
					if (local98 > 103) {
						local98 = 103;
					}
					for (local114 = local90; local114 <= local98; local114++) {
						@Pc(762) byte local762 = arg8[local114][local75];
						local137 = arg4[local114][local75] & 0xFF;
						@Pc(778) int local778 = arg6[local114][local75] & 0xFF;
						@Pc(780) boolean local780 = false;
						@Pc(795) Class182 local795;
						if (local137 == 0) {
							if (local778 == 0) {
								continue;
							}
							local795 = Static106.method1680(local778 - 1);
							if (local795.anInt5910 == -1) {
								continue;
							}
							if (arg7[local114][local75] != 0) {
								Static89.method1469(Static116.anIntArrayArray20[arg7[local114][local75]], local75, local114, arg3, local30, arg10, arg1, local21, arg8[local114][local75], arg5);
								continue;
							}
						} else if (local778 != 0) {
							local795 = Static106.method1680(local778 - 1);
							if (local795.anInt5910 == -1) {
								Static89.method1469(Static189.anIntArrayArray29[arg7[local114][local75]], local75, local114, arg3, local30, arg10, arg1, local21, arg8[local114][local75], arg5);
								continue;
							}
							@Pc(883) byte local883 = arg7[local114][local75];
							if (local883 != 0) {
								local780 = true;
							}
						}
						@Pc(894) Class124 local894 = Static147.method2286(arg0, local114, local75);
						if (local894 != null) {
							@Pc(905) int local905 = (int) (local894.aLong114 >> 14) & 0x3F;
							if (local905 == 9) {
								@Pc(917) int local917 = (int) (local894.aLong114 >> 20) & 0x3;
								@Pc(919) int[] local919 = null;
								@Pc(969) int local969;
								@Pc(941) boolean local941;
								@Pc(956) short local956;
								if ((local917 & 0x1) == 0) {
									local326 = local90 <= local114 - 1;
									local941 = local114 + 1 <= local98;
									if (!local326 && local75 + 1 <= local56) {
										local956 = local21.aShortArray36[local32 + 1];
										local353 = (local956 >> 8) + local40;
										local969 = local353 + (local956 & 0xFF);
										local326 = local114 > local353 && local969 > local114;
									}
									if (!local941 && local75 - 1 >= local48) {
										local956 = local21.aShortArray36[local32 - 1];
										local353 = (local956 >> 8) + local40;
										local969 = (local956 & 0xFF) + local353;
										local941 = local114 > local353 && local969 > local114;
									}
									if (local326 && local941) {
										local919 = Static116.anIntArrayArray20[0];
									} else if (local326) {
										local762 = 1;
										local919 = Static116.anIntArrayArray20[1];
									} else if (local941) {
										local919 = Static116.anIntArrayArray20[1];
										local762 = 3;
									}
								} else {
									local326 = local90 <= local114 - 1;
									local941 = local114 + 1 <= local98;
									if (!local326 && local48 <= local75 - 1) {
										local956 = local21.aShortArray36[local32 - 1];
										local353 = local40 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local353;
										local326 = local114 > local353 && local114 < local969;
									}
									if (!local941 && local75 + 1 <= local56) {
										local956 = local21.aShortArray36[local32 + 1];
										local353 = local40 + (local956 >> 8);
										local969 = (local956 & 0xFF) + local353;
										local941 = local114 > local353 && local969 > local114;
									}
									if (local326 && local941) {
										local919 = Static116.anIntArrayArray20[0];
									} else if (local326) {
										local762 = 0;
										local919 = Static116.anIntArrayArray20[1];
									} else if (local941) {
										local919 = Static116.anIntArrayArray20[1];
										local762 = 2;
									}
								}
								if (local919 != null) {
									Static89.method1469(local919, local75, local114, arg3, local30, arg10, arg1, local21, local762, arg5);
								}
								continue;
							}
						}
						if (local780) {
							Static89.method1469(Static189.anIntArrayArray29[arg7[local114][local75]], local75, local114, arg3, local30, arg10, arg1, local21, arg8[local114][local75], arg5);
							Static89.method1469(Static116.anIntArrayArray20[arg7[local114][local75]], local75, local114, arg3, local30, arg10, arg1, local21, arg8[local114][local75], arg5);
						} else {
							Static89.method1469(Static116.anIntArrayArray20[0], local75, local114, arg3, local30, arg10, arg1, local21, local762, arg5);
						}
					}
					local32++;
				}
				if (local30.anInt1618 > 0 && local30.anInt1619 > 0) {
					local30.method1396();
					local21.aClass57_1 = local30;
				}
			}
		}
	}
}
