import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!re;")
	public static Class175 aClass175_6;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!rg;")
	public static Class177 aClass177_19 = null;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public static int anInt5701 = 0;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public static void method5022() {
		for (@Pc(7) int local7 = 0; local7 < Static183.aByteArrayArrayArray7.length; local7++) {
			for (@Pc(25) int local25 = 0; local25 < Static183.aByteArrayArrayArray7[0].length; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static183.aByteArrayArrayArray7[0][0].length; local29++) {
					Static183.aByteArrayArrayArray7[local7][local25][local29] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!kq;Z)[Lclient!qi;")
	public static Class164[] method5025(@OriginalArg(0) Class110 arg0) {
		if (!arg0.method3363()) {
			return new Class164[0];
		}
		@Pc(16) Class134 local16 = arg0.method3367();
		while (local16.anInt4033 == 0) {
			Static134.method2598(10L);
		}
		if (local16.anInt4033 == 2) {
			return new Class164[0];
		}
		@Pc(43) int[] local43 = (int[]) local16.anObject6;
		@Pc(49) Class164[] local49 = new Class164[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(57) Class164 local57 = new Class164();
			local49[local51] = local57;
			local57.anInt4856 = local43[local51 << 2];
			local57.anInt4851 = local43[(local51 << 2) + 1];
			local57.anInt4852 = local43[(local51 << 2) + 2];
			local57.anInt4853 = local43[(local51 << 2) + 3];
		}
		return local49;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg8 && arg0 == arg5 && arg2 == arg6 && arg7 == arg4) {
			Static69.method1389(arg7, arg3, arg1, arg5, arg6);
			return;
		}
		@Pc(31) int local31 = arg1;
		@Pc(33) int local33 = arg5;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(66) int local66 = local45 + arg6 - arg1 - local53;
		@Pc(76) int local76 = local49 + arg7 - local57 - arg5;
		@Pc(85) int local85 = local53 + local37 - local45 - local45;
		@Pc(95) int local95 = local57 + local41 - local49 - local49;
		@Pc(100) int local100 = local45 - local37;
		@Pc(105) int local105 = local49 - local41;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local115 * local107 >> 12;
			@Pc(125) int local125 = local66 * local121;
			@Pc(129) int local129 = local121 * local76;
			@Pc(133) int local133 = local115 * local85;
			@Pc(137) int local137 = local95 * local115;
			@Pc(141) int local141 = local100 * local107;
			@Pc(145) int local145 = local107 * local105;
			@Pc(156) int local156 = arg1 + (local125 + local133 + local141 >> 12);
			@Pc(168) int local168 = arg5 + (local145 + local129 + local137 >> 12);
			Static69.method1389(local168, arg3, local31, local33, local156);
			local33 = local168;
			local31 = local156;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ie;IIZLclient!aa;IIIZIIII)V")
	public static void method5028(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (!Static123.method2195() && !Static350.method5668(Static47.anInt1095, arg7, arg10, arg5)) {
			return;
		}
		if (Static341.anInt2257 > arg10) {
			Static341.anInt2257 = arg10;
		}
		@Pc(29) Class188 local29 = Static126.method2405(arg11);
		if (Static258.anInt5029 == 1 && local29.aBoolean479) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg1 == 1 || arg1 == 3) {
			local49 = local29.anInt5541;
			local52 = local29.anInt5533;
		} else {
			local52 = local29.anInt5541;
			local49 = local29.anInt5533;
		}
		@Pc(71) int local71;
		@Pc(69) int local69;
		if (Static48.anInt1107 < local52 + arg7) {
			local69 = arg7 + 1;
			local71 = arg7;
		} else {
			local71 = arg7 + (local52 >> 1);
			local69 = arg7 + (local52 + 1 >> 1);
		}
		@Pc(97) int local97;
		@Pc(101) int local101;
		if (arg5 + local49 > Static337.anInt6402) {
			local97 = arg5;
			local101 = arg5 + 1;
		} else {
			local97 = (local49 >> 1) + arg5;
			local101 = (local49 + 1 >> 1) + arg5;
		}
		@Pc(121) Class41 local121 = Static7.aClass41Array1[arg6];
		@Pc(143) int local143 = local121.method5434(local71, local97) + local121.method5434(local69, local97) + local121.method5434(local71, local101) + local121.method5434(local69, local101) >> 2;
		@Pc(152) int local152 = (arg7 << 7) + (local52 << 6);
		@Pc(161) int local161 = (arg5 << 7) + (local49 << 6);
		@Pc(172) boolean local172 = arg3 && !arg8 && local29.aBoolean484;
		if (local29.method4908()) {
			Static222.method4056(arg5, null, arg10, arg1, local29, arg7, null);
		}
		@Pc(211) boolean local211 = arg2 == -1 && local29.anInt5542 == -1 && local29.anIntArray698 == null && local29.anIntArray697 == null && !local29.aBoolean481;
		if (Static178.aBoolean309 && local29.anInt5547 != 1) {
			return;
		}
		if (arg9 != 22) {
			@Pc(335) Class5_Sub3 local335;
			@Pc(304) Class5_Sub3_Sub2 local304;
			@Pc(308) int local308;
			@Pc(398) int local398;
			if (arg9 == 10 || arg9 == 11) {
				local304 = null;
				if (local211) {
					@Pc(364) Class5_Sub3_Sub2 local364 = new Class5_Sub3_Sub2(arg4, local29, arg10, arg6, local152, local143, local161, arg8, arg7, local52 + arg7 - 1, arg5, local49 + arg5 - 1, arg9, arg1, local172);
					local335 = local364;
					local304 = local364;
					local308 = local364.method2519();
				} else {
					local308 = 15;
					local335 = new Class5_Sub3_Sub5(arg4, local29, arg9, arg1, arg10, arg6, local152, local143, local161, arg8, arg7, local52 + arg7 - 1, arg5, local49 + arg5 - 1, arg2);
				}
				if (Static313.method5285(local335, false)) {
					if (local304 != null && local304.method5700()) {
						local304.method5694(arg4);
					}
					if (local29.aBoolean483 && arg3) {
						if (local308 > 30) {
							local308 = 30;
						}
						for (local398 = 0; local398 <= local52; local398++) {
							for (@Pc(402) int local402 = 0; local402 <= local49; local402++) {
								local121.method5427(arg7 + local398, local402 + arg5, local308);
							}
						}
					}
				}
				if (local29.anInt5529 != 0 && arg0 != null) {
					arg0.method2606(local29.aBoolean473, !local29.aBoolean480, local49, arg7, local52, arg5);
				}
			} else if ((arg9 < 12 || arg9 > 17) && (arg9 < 18 || arg9 > 21)) {
				@Pc(639) Class5_Sub1_Sub1 local639;
				@Pc(623) Class5_Sub1 local623;
				if (arg9 == 0) {
					if (local211) {
						local639 = new Class5_Sub1_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg9, arg1, local172);
						local623 = local639;
						if (local639.method5700()) {
							local639.method5694(arg4);
						}
					} else {
						local623 = new Class5_Sub1_Sub2(arg4, local29, 0, arg1, arg10, arg6, local152, local143, local161, arg8, arg2);
					}
					Static134.method2605(arg10, arg7, arg5, local623, null);
					if (arg3) {
						if (arg1 == 0) {
							if (local29.aBoolean483) {
								local121.method5427(arg7, arg5, 50);
								local121.method5427(arg7, arg5 + 1, 50);
							}
							if (local29.anInt5547 == 1 && !arg8) {
								Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x1);
							}
						} else if (arg1 == 1) {
							if (local29.aBoolean483) {
								local121.method5427(arg7, arg5 + 1, 50);
								local121.method5427(arg7 + 1, arg5 + 1, 50);
							}
							if (local29.anInt5547 == 1 && !arg8) {
								Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] | 0x2);
							}
						} else if (arg1 == 2) {
							if (local29.aBoolean483) {
								local121.method5427(arg7 + 1, arg5, 50);
								local121.method5427(arg7 + 1, arg5 + 1, 50);
							}
							if (local29.anInt5547 == 1 && !arg8) {
								Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] | 0x1);
							}
						} else if (arg1 == 3) {
							if (local29.aBoolean483) {
								local121.method5427(arg7, arg5, 50);
								local121.method5427(arg7 + 1, arg5, 50);
							}
							if (local29.anInt5547 == 1 && !arg8) {
								Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x2);
							}
						}
					}
					if (local29.anInt5529 != 0 && arg0 != null) {
						arg0.method2608(arg9, arg5, !local29.aBoolean480, arg1, arg7, local29.aBoolean473);
					}
					if (local29.anInt5548 != 16) {
						Static171.method3411(arg10, arg7, arg5, local29.anInt5548);
					}
				} else if (arg9 == 1) {
					if (local211) {
						local639 = new Class5_Sub1_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg9, arg1, local172);
						if (local639.method5700()) {
							local639.method5694(arg4);
						}
						local623 = local639;
					} else {
						local623 = new Class5_Sub1_Sub2(arg4, local29, 1, arg1, arg10, arg6, local152, local143, local161, arg8, arg2);
					}
					Static134.method2605(arg10, arg7, arg5, local623, null);
					if (local29.aBoolean483 && arg3) {
						if (arg1 == 0) {
							local121.method5427(arg7, arg5 + 1, 50);
						} else if (arg1 == 1) {
							local121.method5427(arg7 + 1, arg5 + 1, 50);
						} else if (arg1 == 2) {
							local121.method5427(arg7 + 1, arg5, 50);
						} else if (arg1 == 3) {
							local121.method5427(arg7, arg5, 50);
						}
					}
					if (local29.anInt5529 != 0 && arg0 != null) {
						arg0.method2608(arg9, arg5, !local29.aBoolean480, arg1, arg7, local29.aBoolean473);
					}
				} else if (arg9 == 2) {
					local308 = arg1 + 1 & 0x3;
					@Pc(1077) Class5_Sub1 local1077;
					if (local211) {
						@Pc(1051) Class5_Sub1_Sub1 local1051 = new Class5_Sub1_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg9, arg1 + 4, local172);
						@Pc(1065) Class5_Sub1_Sub1 local1065 = new Class5_Sub1_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg9, local308, local172);
						if (local1051.method5700()) {
							local1051.method5694(arg4);
						}
						local623 = local1051;
						local1077 = local1065;
						if (local1065.method5700()) {
							local1065.method5694(arg4);
						}
					} else {
						local623 = new Class5_Sub1_Sub2(arg4, local29, 2, arg1 + 4, arg10, arg6, local152, local143, local161, arg8, arg2);
						local1077 = new Class5_Sub1_Sub2(arg4, local29, 2, local308, arg10, arg6, local152, local143, local161, arg8, arg2);
					}
					Static134.method2605(arg10, arg7, arg5, local623, local1077);
					if (local29.anInt5547 == 1 && arg3 && !arg8) {
						if (arg1 == 0) {
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x1);
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] | 0x2);
						} else if (arg1 == 1) {
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5 + 1] | 0x2);
							Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] | 0x1);
						} else if (arg1 == 2) {
							Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7 + 1][arg5] | 0x1);
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x2);
						} else if (arg1 == 3) {
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x2);
							Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x1);
						}
					}
					if (local29.anInt5529 != 0 && arg0 != null) {
						arg0.method2608(arg9, arg5, !local29.aBoolean480, arg1, arg7, local29.aBoolean473);
					}
					if (local29.anInt5548 != 16) {
						Static171.method3411(arg10, arg7, arg5, local29.anInt5548);
					}
				} else if (arg9 == 3) {
					if (local211) {
						local639 = new Class5_Sub1_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg9, arg1, local172);
						local623 = local639;
						if (local639.method5700()) {
							local639.method5694(arg4);
						}
					} else {
						local623 = new Class5_Sub1_Sub2(arg4, local29, 3, arg1, arg10, arg6, local152, local143, local161, arg8, arg2);
					}
					Static134.method2605(arg10, arg7, arg5, local623, null);
					if (local29.aBoolean483 && arg3) {
						if (arg1 == 0) {
							local121.method5427(arg7, arg5 + 1, 50);
						} else if (arg1 == 1) {
							local121.method5427(arg7 + 1, arg5 + 1, 50);
						} else if (arg1 == 2) {
							local121.method5427(arg7 + 1, arg5, 50);
						} else if (arg1 == 3) {
							local121.method5427(arg7, arg5, 50);
						}
					}
					if (local29.anInt5529 != 0 && arg0 != null) {
						arg0.method2608(arg9, arg5, !local29.aBoolean480, arg1, arg7, local29.aBoolean473);
					}
				} else if (arg9 == 9) {
					if (local211) {
						local304 = new Class5_Sub3_Sub2(arg4, local29, arg10, arg6, local152, local143, local161, arg8, arg7, arg7, arg5, arg5, arg9, arg1, local172);
						local335 = local304;
						if (local304.method5700()) {
							local304.method5694(arg4);
						}
					} else {
						local335 = new Class5_Sub3_Sub5(arg4, local29, arg9, arg1, arg10, arg6, local152, local143, local161, arg8, arg7, arg7 + local52 - 1, arg5, local49 + arg5 - 1, arg2);
					}
					Static313.method5285(local335, false);
					if (local29.anInt5529 != 0 && arg0 != null) {
						arg0.method2606(local29.aBoolean473, !local29.aBoolean480, local49, arg7, local52, arg5);
					}
					if (local29.anInt5548 != 16) {
						Static171.method3411(arg10, arg7, arg5, local29.anInt5548);
					}
				} else {
					@Pc(1605) Class5_Sub4 local1605;
					if (arg9 == 4) {
						if (local211) {
							@Pc(1623) Class5_Sub4_Sub1 local1623 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, 0, 0, 0, arg9, arg1);
							local1605 = local1623;
							if (local1623.method5700()) {
								local1623.method5694(arg4);
							}
						} else {
							local1605 = new Class5_Sub4_Sub2(arg4, local29, arg9, arg1, arg10, arg6, local152, local143, local161, arg8, 0, 0, 0, arg2);
						}
						Static112.method3714(arg10, arg7, arg5, local1605, null);
					} else {
						@Pc(1645) int local1645;
						@Pc(1651) Interface8 local1651;
						@Pc(1716) Class5_Sub4_Sub1 local1716;
						if (arg9 == 5) {
							local1645 = 16;
							local1651 = (Interface8) Static264.method4812(arg10, arg7, arg5);
							if (local1651 != null) {
								local1645 = Static126.method2405(local1651.method5697()).anInt5548;
							}
							if (local211) {
								local1716 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, 0, local1645 * Static108.anIntArray267[arg1], local1645 * Static338.anIntArray798[arg1], arg9, arg1);
								local1605 = local1716;
								if (local1716.method5700()) {
									local1716.method5694(arg4);
								}
							} else {
								local1605 = new Class5_Sub4_Sub2(arg4, local29, arg9, arg1, arg10, arg6, local152, local143, local161, arg8, 0, local1645 * Static108.anIntArray267[arg1], Static338.anIntArray798[arg1] * local1645, arg2);
							}
							Static112.method3714(arg10, arg7, arg5, local1605, null);
						} else if (arg9 == 6) {
							local1645 = 8;
							local1651 = (Interface8) Static264.method4812(arg10, arg7, arg5);
							if (local1651 != null) {
								local1645 = Static126.method2405(local1651.method5697()).anInt5548 / 2;
							}
							if (local211) {
								local1716 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg1, Static108.anIntArray267[arg1] * local1645, Static338.anIntArray798[arg1] * local1645, arg9, arg1 + 4);
								local1605 = local1716;
								if (local1716.method5700()) {
									local1716.method5694(arg4);
								}
							} else {
								local1605 = new Class5_Sub4_Sub2(arg4, local29, arg9, arg1 + 4, arg10, arg6, local152, local143, local161, arg8, arg1, Static105.anIntArray259[arg1] * local1645, Static274.anIntArray682[arg1] * local1645, arg2);
							}
							Static112.method3714(arg10, arg7, arg5, local1605, null);
						} else if (arg9 == 7) {
							local1645 = arg1 + 2 & 0x3;
							if (local211) {
								@Pc(1885) Class5_Sub4_Sub1 local1885 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, local1645, 0, 0, arg9, local1645 + 4);
								if (local1885.method5700()) {
									local1885.method5694(arg4);
								}
								local1605 = local1885;
							} else {
								local1605 = new Class5_Sub4_Sub2(arg4, local29, arg9, local1645 + 4, arg10, arg6, local152, local143, local161, arg8, local1645, 0, 0, arg2);
							}
							Static112.method3714(arg10, arg7, arg5, local1605, null);
						} else if (arg9 == 8) {
							local308 = arg1 + 2 & 0x3;
							local398 = 8;
							@Pc(1921) Interface8 local1921 = (Interface8) Static264.method4812(arg10, arg7, arg5);
							if (local1921 != null) {
								local398 = Static126.method2405(local1921.method5697()).anInt5548 / 2;
							}
							@Pc(1962) Class5_Sub4 local1962;
							@Pc(1984) Class5_Sub4 local1984;
							if (local211) {
								local1962 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg1, Static105.anIntArray259[arg1] * local398, Static274.anIntArray682[arg1] * local398, arg9, arg1 + 4);
								local1984 = new Class5_Sub4_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg1, 0, 0, arg9, local308 + 4);
								if (local1962.method5700()) {
									local1962.method5694(arg4);
								}
								if (local1984.method5700()) {
									local1984.method5694(arg4);
								}
							} else {
								local1962 = new Class5_Sub4_Sub2(arg4, local29, arg9, arg1 + 4, arg10, arg6, local152, local143, local161, arg8, arg1, Static105.anIntArray259[arg1] * local398, Static274.anIntArray682[arg1] * local398, arg2);
								local1984 = new Class5_Sub4_Sub2(arg4, local29, arg9, local308 + 4, arg10, arg6, local152, local143, local161, arg8, arg1, 0, 0, arg2);
							}
							Static112.method3714(arg10, arg7, arg5, local1962, local1984);
						}
					}
				}
			} else {
				if (local211) {
					local304 = new Class5_Sub3_Sub2(arg4, local29, arg10, arg6, local152, local143, local161, arg8, arg7, local52 + arg7 - 1, arg5, arg5 + local49 - 1, arg9, arg1, local172);
					local335 = local304;
					if (local304.method5700()) {
						local304.method5694(arg4);
					}
				} else {
					local335 = new Class5_Sub3_Sub5(arg4, local29, arg9, arg1, arg10, arg6, local152, local143, local161, arg8, arg7, local52 + arg7 - 1, arg5, arg5 + local49 - 1, arg2);
				}
				Static313.method5285(local335, false);
				if (arg3 && !arg8 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg10 > 0 && local29.anInt5547 != 0) {
					Static337.aByteArrayArrayArray12[arg10][arg7][arg5] = (byte) (Static337.aByteArrayArrayArray12[arg10][arg7][arg5] | 0x4);
				}
				if (local29.anInt5529 != 0 && arg0 != null) {
					arg0.method2606(local29.aBoolean473, !local29.aBoolean480, local49, arg7, local52, arg5);
				}
			}
		} else if (Static217.aBoolean365 || local29.anInt5546 != 0 || local29.anInt5529 == 1 || local29.aBoolean482) {
			@Pc(255) Class5_Sub5 local255;
			if (local211) {
				@Pc(253) Class5_Sub5_Sub1 local253 = new Class5_Sub5_Sub1(arg4, local29, arg6, local152, local143, local161, arg8, arg1, local172);
				local255 = local253;
				if (local253.method5700()) {
					local253.method5694(arg4);
				}
			} else {
				local255 = new Class5_Sub5_Sub2(arg4, local29, arg1, arg10, arg6, local152, local143, local161, arg8, arg2);
			}
			Static101.method1908(arg10, arg7, arg5, local255);
			if (local29.anInt5529 == 1 && arg0 != null) {
				arg0.method2592(arg5, arg7);
			}
		}
	}
}
