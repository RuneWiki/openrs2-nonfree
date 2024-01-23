import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_11;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[Lclient!rj;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array11;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	public static int anInt5907;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method4732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = -1;
		@Pc(19) int local19 = Static202.method3411(Static68.anInt1509, arg2 + arg0, Static43.anInt1054);
		@Pc(27) int local27 = -arg0;
		@Pc(36) int local36 = Static202.method3411(Static68.anInt1509, arg2 - arg0, Static43.anInt1054);
		Static133.method2321(local19, local36, Static274.anIntArrayArray50[arg1], arg3);
		while (local7 < local9) {
			local11 += 2;
			local27 += local11;
			@Pc(79) int local79;
			@Pc(74) int local74;
			@Pc(98) int local98;
			@Pc(106) int local106;
			if (local27 > 0) {
				local9--;
				local27 -= local9 << 1;
				local74 = arg1 + local9;
				local79 = arg1 - local9;
				if (Static127.anInt2664 <= local74 && Static290.anInt6021 >= local79) {
					local98 = Static202.method3411(Static68.anInt1509, arg2 + local7, Static43.anInt1054);
					local106 = Static202.method3411(Static68.anInt1509, arg2 - local7, Static43.anInt1054);
					if (local74 <= Static290.anInt6021) {
						Static133.method2321(local98, local106, Static274.anIntArrayArray50[local74], arg3);
					}
					if (Static127.anInt2664 <= local79) {
						Static133.method2321(local98, local106, Static274.anIntArrayArray50[local79], arg3);
					}
				}
			}
			local7++;
			local79 = arg1 - local7;
			local74 = arg1 + local7;
			if (local74 >= Static127.anInt2664 && Static290.anInt6021 >= local79) {
				local98 = Static202.method3411(Static68.anInt1509, local9 + arg2, Static43.anInt1054);
				local106 = Static202.method3411(Static68.anInt1509, arg2 - local9, Static43.anInt1054);
				if (local74 <= Static290.anInt6021) {
					Static133.method2321(local98, local106, Static274.anIntArrayArray50[local74], arg3);
				}
				if (local79 >= Static127.anInt2664) {
					Static133.method2321(local98, local106, Static274.anIntArrayArray50[local79], arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([[B[[BI[[F[[B[[F[[II[Lclient!k;I[[F[[B)V")
	public static void method4733(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class90[] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(3) int local3 = 0; local3 < arg7; local3++) {
			@Pc(14) Class90 local14 = arg8[local3];
			if (local14.anInt2654 == arg2) {
				@Pc(23) Class171 local23 = new Class171();
				@Pc(32) int local32 = (local14.anInt2635 >> 7) - local14.anInt2652;
				@Pc(34) int local34 = 0;
				@Pc(42) int local42 = local14.anInt2652 + (local14.anInt2649 >> 7);
				if (local42 > 103) {
					local42 = 103;
				}
				@Pc(58) int local58 = (local14.anInt2649 >> 7) - local14.anInt2652;
				if (local58 < 0) {
					local34 = -local58;
					local58 = 0;
				}
				@Pc(70) int local70;
				@Pc(82) short local82;
				@Pc(88) int local88;
				@Pc(96) int local96;
				@Pc(108) int local108;
				@Pc(131) int local131;
				@Pc(325) boolean local325;
				@Pc(353) int local353;
				for (local70 = local58; local70 <= local42; local70++) {
					local82 = local14.aShortArray39[local34];
					local88 = (local82 >> 8) + local32;
					local96 = (local82 & 0xFF) + local88 - 1;
					if (local88 < 0) {
						local88 = 0;
					}
					if (local96 > 103) {
						local96 = 103;
					}
					for (local108 = local88; local108 <= local96; local108++) {
						@Pc(123) int local123 = arg4[local108][local70] & 0xFF;
						local131 = arg10[local108][local70] & 0xFF;
						@Pc(133) boolean local133 = false;
						@Pc(150) Class57 local150;
						@Pc(170) int[] local170;
						@Pc(242) int[] local242;
						if (local123 == 0) {
							if (local131 == 0) {
								continue;
							}
							local150 = Static131.method2290(local131 - 1);
							if (local150.anInt1619 == -1) {
								continue;
							}
							if (arg1[local108][local70] != 0) {
								local242 = Static96.anIntArrayArray21[arg1[local108][local70]];
								local23.anInt5519 += ((local242.length >> 1) - 2) * 3;
								local23.anInt5517 += local242.length >> 1;
								continue;
							}
						} else if (local131 != 0) {
							local150 = Static131.method2290(local131 - 1);
							@Pc(161) byte local161;
							if (local150.anInt1619 == -1) {
								local161 = arg1[local108][local70];
								if (local161 != 0) {
									local170 = Static79.anIntArrayArray18[local161];
									local23.anInt5519 += (local170.length >> 1) * 3 - 6;
									local23.anInt5517 += local170.length >> 1;
								}
								continue;
							}
							local161 = arg1[local108][local70];
							if (local161 != 0) {
								local133 = true;
							}
						}
						@Pc(271) Class34 local271 = Static143.method2546(arg2, local108, local70);
						if (local271 != null) {
							@Pc(281) int local281 = (int) (local271.aLong49 >> 14) & 0x3F;
							if (local281 == 9) {
								local170 = null;
								@Pc(295) int local295 = (int) (local271.aLong49 >> 20) & 0x3;
								@Pc(312) boolean local312;
								@Pc(340) short local340;
								@Pc(346) int local346;
								if ((local295 & 0x1) == 0) {
									local312 = local88 <= local108 - 1;
									local325 = local96 >= local108 + 1;
									if (!local312 && local70 + 1 <= local42) {
										local340 = local14.aShortArray39[local34 + 1];
										local346 = local32 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local312 = local346 < local108 && local108 < local353;
									}
									if (!local325 && local70 - 1 >= local58) {
										local340 = local14.aShortArray39[local34 - 1];
										local346 = (local340 >> 8) + local32;
										local353 = local346 + (local340 & 0xFF);
										local325 = local108 > local346 && local108 < local353;
									}
									if (local312 && local325) {
										local170 = Static96.anIntArrayArray21[0];
									} else if (local312) {
										local170 = Static96.anIntArrayArray21[1];
									} else if (local325) {
										local170 = Static96.anIntArrayArray21[1];
									}
								} else {
									local312 = local108 - 1 >= local88;
									local325 = local96 >= local108 + 1;
									if (!local312 && local58 <= local70 - 1) {
										local340 = local14.aShortArray39[local34 - 1];
										local346 = local32 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local312 = local108 > local346 && local353 > local108;
									}
									if (!local325 && local42 >= local70 + 1) {
										local340 = local14.aShortArray39[local34 + 1];
										local346 = local32 + (local340 >> 8);
										local353 = local346 + (local340 & 0xFF);
										local325 = local346 < local108 && local108 < local353;
									}
									if (local312 && local325) {
										local170 = Static96.anIntArrayArray21[0];
									} else if (local312) {
										local170 = Static96.anIntArrayArray21[1];
									} else if (local325) {
										local170 = Static96.anIntArrayArray21[1];
									}
								}
								if (local170 != null) {
									local23.anInt5519 += ((local170.length >> 1) - 2) * 3;
									local23.anInt5517 += local170.length >> 1;
								}
								continue;
							}
						}
						if (local133) {
							local170 = Static79.anIntArrayArray18[arg1[local108][local70]];
							local242 = Static96.anIntArrayArray21[arg1[local108][local70]];
							local23.anInt5519 += ((local242.length >> 1) - 2) * 3;
							local23.anInt5519 += (local170.length >> 1) * 3 - 6;
							local23.anInt5517 += local242.length >> 1;
							local23.anInt5517 += local170.length >> 1;
						} else {
							local242 = Static96.anIntArrayArray21[0];
							local23.anInt5519 += ((local242.length >> 1) - 2) * 3;
							local23.anInt5517 += local242.length >> 1;
						}
					}
					local34++;
				}
				local23.method4435();
				local34 = 0;
				if ((local14.anInt2649 >> 7) - local14.anInt2652 < 0) {
					local34 = local14.anInt2652 - (local14.anInt2649 >> 7);
				}
				for (local70 = local58; local70 <= local42; local70++) {
					local82 = local14.aShortArray39[local34];
					local88 = (local82 >> 8) + local32;
					local96 = local88 + (local82 & 0xFF) - 1;
					if (local96 > 103) {
						local96 = 103;
					}
					if (local88 < 0) {
						local88 = 0;
					}
					for (local108 = local88; local108 <= local96; local108++) {
						@Pc(774) byte local774 = arg0[local108][local70];
						local131 = arg4[local108][local70] & 0xFF;
						@Pc(784) boolean local784 = false;
						@Pc(792) int local792 = arg10[local108][local70] & 0xFF;
						@Pc(805) Class57 local805;
						if (local131 == 0) {
							if (local792 == 0) {
								continue;
							}
							local805 = Static131.method2290(local792 - 1);
							if (local805.anInt1619 == -1) {
								continue;
							}
							if (arg1[local108][local70] != 0) {
								Static261.method4343(local108, arg6, local23, arg0[local108][local70], local70, arg5, arg9, Static96.anIntArrayArray21[arg1[local108][local70]], arg3, local14);
								continue;
							}
						} else if (local792 != 0) {
							local805 = Static131.method2290(local792 - 1);
							if (local805.anInt1619 == -1) {
								Static261.method4343(local108, arg6, local23, arg0[local108][local70], local70, arg5, arg9, Static79.anIntArrayArray18[arg1[local108][local70]], arg3, local14);
								continue;
							}
							@Pc(841) byte local841 = arg1[local108][local70];
							if (local841 != 0) {
								local784 = true;
							}
						}
						@Pc(903) Class34 local903 = Static143.method2546(arg2, local108, local70);
						if (local903 != null) {
							@Pc(914) int local914 = (int) (local903.aLong49 >> 14) & 0x3F;
							if (local914 == 9) {
								@Pc(919) int[] local919 = null;
								@Pc(927) int local927 = (int) (local903.aLong49 >> 20) & 0x3;
								@Pc(968) int local968;
								@Pc(999) boolean local999;
								@Pc(955) short local955;
								if ((local927 & 0x1) == 0) {
									local325 = local88 <= local108 - 1;
									if (!local325 && local70 + 1 <= local42) {
										local955 = local14.aShortArray39[local34 + 1];
										local353 = (local955 >> 8) + local32;
										local968 = (local955 & 0xFF) + local353;
										local325 = local108 > local353 && local968 > local108;
									}
									local999 = local108 + 1 <= local96;
									if (!local999 && local58 <= local70 - 1) {
										local955 = local14.aShortArray39[local34 - 1];
										local353 = local32 + (local955 >> 8);
										local968 = local353 + (local955 & 0xFF);
										local999 = local353 < local108 && local108 < local968;
									}
									if (local325 && local999) {
										local919 = Static96.anIntArrayArray21[0];
									} else if (local325) {
										local919 = Static96.anIntArrayArray21[1];
										local774 = 1;
									} else if (local999) {
										local774 = 3;
										local919 = Static96.anIntArrayArray21[1];
									}
								} else {
									local325 = local88 <= local108 - 1;
									if (!local325 && local58 <= local70 - 1) {
										local955 = local14.aShortArray39[local34 - 1];
										local353 = (local955 >> 8) + local32;
										local968 = local353 + (local955 & 0xFF);
										local325 = local353 < local108 && local968 > local108;
									}
									local999 = local96 >= local108 + 1;
									if (!local999 && local70 + 1 <= local42) {
										local955 = local14.aShortArray39[local34 + 1];
										local353 = (local955 >> 8) + local32;
										local968 = local353 + (local955 & 0xFF);
										local999 = local108 > local353 && local108 < local968;
									}
									if (local325 && local999) {
										local919 = Static96.anIntArrayArray21[0];
									} else if (local325) {
										local774 = 0;
										local919 = Static96.anIntArrayArray21[1];
									} else if (local999) {
										local919 = Static96.anIntArrayArray21[1];
										local774 = 2;
									}
								}
								if (local919 != null) {
									Static261.method4343(local108, arg6, local23, local774, local70, arg5, arg9, local919, arg3, local14);
								}
								continue;
							}
						}
						if (local784) {
							Static261.method4343(local108, arg6, local23, arg0[local108][local70], local70, arg5, arg9, Static79.anIntArrayArray18[arg1[local108][local70]], arg3, local14);
							Static261.method4343(local108, arg6, local23, arg0[local108][local70], local70, arg5, arg9, Static96.anIntArrayArray21[arg1[local108][local70]], arg3, local14);
						} else {
							Static261.method4343(local108, arg6, local23, local774, local70, arg5, arg9, Static96.anIntArrayArray21[0], arg3, local14);
						}
					}
					local34++;
				}
				if (local23.anInt5516 > 0 && local23.anInt5518 > 0) {
					local23.method4437();
					local14.aClass171_1 = local23;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIILclient!fc;IZJ)Z")
	public static boolean method4734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class36 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static141.anIntArrayArrayArray4 == Static144.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static26.anInt552 || local17 >= Static232.anInt4787) {
					return false;
				}
				@Pc(42) Class2_Sub31 local42 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][local10][local17];
				if (local42 != null && local42.anInt5708 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class34 local58 = new Class34();
		local58.aLong49 = arg11;
		local58.anInt904 = arg0;
		local58.anInt901 = arg5;
		local58.anInt899 = arg6;
		local58.anInt903 = arg7;
		local58.aClass36_1 = arg8;
		local58.anInt898 = arg9;
		local58.anInt894 = arg1;
		local58.anInt897 = arg2;
		local58.anInt896 = arg1 + arg3 - 1;
		local58.anInt902 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static180.aClass2_Sub31ArrayArrayArray2[local141][local17][local108] == null) {
						Static180.aClass2_Sub31ArrayArrayArray2[local141][local17][local108] = new Class2_Sub31(local141, local17, local108);
					}
				}
				@Pc(174) Class2_Sub31 local174 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][local17][local108];
				local174.aClass34Array2[local174.anInt5708] = local58;
				local174.anIntArray498[local174.anInt5708] = local115;
				local174.anInt5702 |= local115;
				local174.anInt5708++;
				if (local6 && Static157.anIntArrayArray27[local17][local108] != 0) {
					local8 = Static157.anIntArrayArray27[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static157.anIntArrayArray27[local17][local108] == 0) {
						Static157.anIntArrayArray27[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static292.aClass34Array3[Static288.anInt5982++] = local58;
		}
		return true;
	}
}
