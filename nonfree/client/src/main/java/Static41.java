import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Lclient!cc;")
	public static Class22 aClass22_5;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int anInt852 = 10;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString20 = " is already on your ignore list.";

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public static int anInt856 = 0;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString21 = "Loaded title screen";

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class4_Sub24 local7 = new Class4_Sub24();
		local7.anInt3457 = arg6;
		local7.anInt3459 = arg5;
		local7.anInt3444 = arg7;
		local7.anInt3446 = arg11;
		local7.anInt3452 = arg0;
		local7.anInt3458 = arg3;
		local7.anInt3454 = arg2;
		local7.anInt3445 = arg10;
		local7.anInt3447 = arg1;
		local7.anInt3451 = arg4;
		local7.anInt3455 = arg8;
		local7.anInt3450 = arg9;
		Static269.aClass10_57.method184(local7);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([[BI[[B[[B[Lclient!sj;[[B[[III[[F[[F[[F)V")
	public static void method686(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class155[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(23) Class155 local23 = arg4[local12];
			if (local23.anInt4698 == arg7) {
				@Pc(36) Class179 local36 = new Class179();
				@Pc(44) int local44 = (local23.anInt4688 >> 7) - local23.anInt4700;
				@Pc(52) int local52 = (local23.anInt4691 >> 7) - local23.anInt4700;
				@Pc(54) int local54 = 0;
				if (local52 < 0) {
					local54 = -local52;
					local52 = 0;
				}
				@Pc(74) int local74 = local23.anInt4700 + (local23.anInt4691 >> 7);
				if (local74 > 103) {
					local74 = 103;
				}
				@Pc(84) int local84;
				@Pc(92) short local92;
				@Pc(98) int local98;
				@Pc(106) int local106;
				@Pc(121) int local121;
				@Pc(144) int local144;
				@Pc(374) boolean local374;
				@Pc(351) int local351;
				for (local84 = local52; local84 <= local74; local84++) {
					local92 = local23.aShortArray77[local54];
					local98 = (local92 >> 8) + local44;
					local106 = (local92 & 0xFF) + local98 - 1;
					if (local98 < 0) {
						local98 = 0;
					}
					if (local106 > 103) {
						local106 = 103;
					}
					for (local121 = local98; local121 <= local106; local121++) {
						@Pc(136) int local136 = arg5[local121][local84] & 0xFF;
						local144 = arg3[local121][local84] & 0xFF;
						@Pc(146) boolean local146 = false;
						@Pc(162) Class35 local162;
						@Pc(187) int[] local187;
						@Pc(241) int[] local241;
						if (local136 == 0) {
							if (local144 == 0) {
								continue;
							}
							local162 = Static171.method2693(local144 - 1);
							if (local162.anInt1071 == -1) {
								continue;
							}
							if (arg2[local121][local84] != 0) {
								local187 = Static270.anIntArrayArray42[arg2[local121][local84]];
								local36.anInt5414 += ((local187.length >> 1) - 2) * 3;
								local36.anInt5415 += local187.length >> 1;
								continue;
							}
						} else if (local144 != 0) {
							local162 = Static171.method2693(local144 - 1);
							@Pc(234) byte local234;
							if (local162.anInt1071 == -1) {
								local234 = arg2[local121][local84];
								if (local234 != 0) {
									local241 = Static281.anIntArrayArray46[local234];
									local36.anInt5414 += (local241.length >> 1) * 3 - 6;
									local36.anInt5415 += local241.length >> 1;
								}
								continue;
							}
							local234 = arg2[local121][local84];
							if (local234 != 0) {
								local146 = true;
							}
						}
						@Pc(280) Class173 local280 = Static21.method3459(arg7, local121, local84);
						if (local280 != null) {
							@Pc(291) int local291 = (int) (local280.aLong183 >> 14) & 0x3F;
							if (local291 == 9) {
								local241 = null;
								@Pc(307) int local307 = (int) (local280.aLong183 >> 20) & 0x3;
								@Pc(320) boolean local320;
								@Pc(339) short local339;
								@Pc(345) int local345;
								if ((local307 & 0x1) == 0) {
									local374 = local121 + 1 <= local106;
									local320 = local98 <= local121 - 1;
									if (!local320 && local84 + 1 <= local74) {
										local339 = local23.aShortArray77[local54 + 1];
										local345 = local44 + (local339 >> 8);
										local351 = local345 + (local339 & 0xFF);
										local320 = local345 < local121 && local121 < local351;
									}
									if (!local374 && local84 - 1 >= local52) {
										local339 = local23.aShortArray77[local54 - 1];
										local345 = local44 + (local339 >> 8);
										local351 = (local339 & 0xFF) + local345;
										local374 = local121 > local345 && local121 < local351;
									}
									if (local320 && local374) {
										local241 = Static270.anIntArrayArray42[0];
									} else if (local320) {
										local241 = Static270.anIntArrayArray42[1];
									} else if (local374) {
										local241 = Static270.anIntArrayArray42[1];
									}
								} else {
									local320 = local98 <= local121 - 1;
									if (!local320 && local52 <= local84 - 1) {
										local339 = local23.aShortArray77[local54 - 1];
										local345 = (local339 >> 8) + local44;
										local351 = local345 + (local339 & 0xFF);
										local320 = local345 < local121 && local121 < local351;
									}
									local374 = local121 + 1 <= local106;
									if (!local374 && local84 + 1 <= local74) {
										local339 = local23.aShortArray77[local54 + 1];
										local345 = (local339 >> 8) + local44;
										local351 = (local339 & 0xFF) + local345;
										local374 = local345 < local121 && local351 > local121;
									}
									if (local320 && local374) {
										local241 = Static270.anIntArrayArray42[0];
									} else if (local320) {
										local241 = Static270.anIntArrayArray42[1];
									} else if (local374) {
										local241 = Static270.anIntArrayArray42[1];
									}
								}
								if (local241 != null) {
									local36.anInt5414 += (local241.length >> 1) * 3 - 6;
									local36.anInt5415 += local241.length >> 1;
								}
								continue;
							}
						}
						if (local146) {
							local187 = Static270.anIntArrayArray42[arg2[local121][local84]];
							local241 = Static281.anIntArrayArray46[arg2[local121][local84]];
							local36.anInt5414 += (local187.length >> 1) * 3 - 6;
							local36.anInt5414 += (local241.length >> 1) * 3 - 6;
							local36.anInt5415 += local187.length >> 1;
							local36.anInt5415 += local241.length >> 1;
						} else {
							local187 = Static270.anIntArrayArray42[0];
							local36.anInt5414 += (local187.length >> 1) * 3 - 6;
							local36.anInt5415 += local187.length >> 1;
						}
					}
					local54++;
				}
				local36.method4304();
				local54 = 0;
				if ((local23.anInt4691 >> 7) - local23.anInt4700 < 0) {
					local54 = local23.anInt4700 - (local23.anInt4691 >> 7);
				}
				for (local84 = local52; local84 <= local74; local84++) {
					local92 = local23.aShortArray77[local54];
					local98 = local44 + (local92 >> 8);
					local106 = (local92 & 0xFF) + local98 - 1;
					if (local98 < 0) {
						local98 = 0;
					}
					if (local106 > 103) {
						local106 = 103;
					}
					for (local121 = local98; local121 <= local106; local121++) {
						@Pc(775) byte local775 = arg0[local121][local84];
						@Pc(777) boolean local777 = false;
						local144 = arg5[local121][local84] & 0xFF;
						@Pc(793) int local793 = arg3[local121][local84] & 0xFF;
						@Pc(809) Class35 local809;
						if (local144 == 0) {
							if (local793 == 0) {
								continue;
							}
							local809 = Static171.method2693(local793 - 1);
							if (local809.anInt1071 == -1) {
								continue;
							}
							if (arg2[local121][local84] != 0) {
								Static192.method3016(arg10, arg6, local36, arg0[local121][local84], local23, local121, arg9, arg8, Static270.anIntArrayArray42[arg2[local121][local84]], local84);
								continue;
							}
						} else if (local793 != 0) {
							local809 = Static171.method2693(local793 - 1);
							if (local809.anInt1071 == -1) {
								Static192.method3016(arg10, arg6, local36, arg0[local121][local84], local23, local121, arg9, arg8, Static281.anIntArrayArray46[arg2[local121][local84]], local84);
								continue;
							}
							@Pc(819) byte local819 = arg2[local121][local84];
							if (local819 != 0) {
								local777 = true;
							}
						}
						@Pc(907) Class173 local907 = Static21.method3459(arg7, local121, local84);
						if (local907 != null) {
							@Pc(918) int local918 = (int) (local907.aLong183 >> 14) & 0x3F;
							if (local918 == 9) {
								@Pc(924) int[] local924 = null;
								@Pc(932) int local932 = (int) (local907.aLong183 >> 20) & 0x3;
								@Pc(994) int local994;
								@Pc(963) boolean local963;
								@Pc(981) short local981;
								if ((local932 & 0x1) == 0) {
									local374 = local98 <= local121 - 1;
									local963 = local121 + 1 <= local106;
									if (!local374 && local74 >= local84 + 1) {
										local981 = local23.aShortArray77[local54 + 1];
										local351 = (local981 >> 8) + local44;
										local994 = local351 + (local981 & 0xFF);
										local374 = local351 < local121 && local994 > local121;
									}
									if (!local963 && local52 <= local84 - 1) {
										local981 = local23.aShortArray77[local54 - 1];
										local351 = local44 + (local981 >> 8);
										local994 = (local981 & 0xFF) + local351;
										local963 = local351 < local121 && local121 < local994;
									}
									if (local374 && local963) {
										local924 = Static270.anIntArrayArray42[0];
									} else if (local374) {
										local924 = Static270.anIntArrayArray42[1];
										local775 = 1;
									} else if (local963) {
										local775 = 3;
										local924 = Static270.anIntArrayArray42[1];
									}
								} else {
									local374 = local121 - 1 >= local98;
									local963 = local121 + 1 <= local106;
									if (!local374 && local52 <= local84 - 1) {
										local981 = local23.aShortArray77[local54 - 1];
										local351 = (local981 >> 8) + local44;
										local994 = (local981 & 0xFF) + local351;
										local374 = local351 < local121 && local994 > local121;
									}
									if (!local963 && local74 >= local84 + 1) {
										local981 = local23.aShortArray77[local54 + 1];
										local351 = local44 + (local981 >> 8);
										local994 = (local981 & 0xFF) + local351;
										local963 = local351 < local121 && local121 < local994;
									}
									if (local374 && local963) {
										local924 = Static270.anIntArrayArray42[0];
									} else if (local374) {
										local775 = 0;
										local924 = Static270.anIntArrayArray42[1];
									} else if (local963) {
										local924 = Static270.anIntArrayArray42[1];
										local775 = 2;
									}
								}
								if (local924 != null) {
									Static192.method3016(arg10, arg6, local36, local775, local23, local121, arg9, arg8, local924, local84);
								}
								continue;
							}
						}
						if (local777) {
							Static192.method3016(arg10, arg6, local36, arg0[local121][local84], local23, local121, arg9, arg8, Static281.anIntArrayArray46[arg2[local121][local84]], local84);
							Static192.method3016(arg10, arg6, local36, arg0[local121][local84], local23, local121, arg9, arg8, Static270.anIntArrayArray42[arg2[local121][local84]], local84);
						} else {
							Static192.method3016(arg10, arg6, local36, local775, local23, local121, arg9, arg8, Static270.anIntArrayArray42[0], local84);
						}
					}
					local54++;
				}
				if (local36.anInt5416 > 0 && local36.anInt5417 > 0) {
					local36.method4300();
					local23.aClass179_1 = local36;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method687() {
		aString20 = null;
		aClass22_5 = null;
		aString21 = null;
	}
}
