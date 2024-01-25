import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[[[Lclient!ih;")
	public static Class156[][][] aClass156ArrayArrayArray2;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	public static int anInt8894 = 999999;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_75 = new Class181(69, 5);

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "[I")
	public static final int[] anIntArray690 = new int[32];

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
	public static void method7632() {
		if (Static421.anIntArray844 != null) {
			return;
		}
		Static421.anIntArray844 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
			@Pc(43) float local43 = ((float) (local29 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(52) float local52 = (float) (local29 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(54) int local54 = 0; local54 < 128; local54++) {
				@Pc(61) float local61 = (float) local54 / 128.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(71) float local71 = local43 / 60.0F;
				@Pc(74) int local74 = (int) local71;
				@Pc(78) int local78 = local74 % 6;
				@Pc(83) float local83 = local71 - (float) local74;
				@Pc(89) float local89 = (1.0F - local52) * local61;
				@Pc(97) float local97 = (1.0F - local83 * local52) * local61;
				@Pc(108) float local108 = local61 * (1.0F - local52 * (1.0F - local83));
				if (local78 == 0) {
					local67 = local89;
					local63 = local61;
					local65 = local108;
				} else if (local78 == 1) {
					local63 = local97;
					local67 = local89;
					local65 = local61;
				} else if (local78 == 2) {
					local67 = local108;
					local63 = local89;
					local65 = local61;
				} else if (local78 == 3) {
					local67 = local61;
					local65 = local97;
					local63 = local89;
				} else if (local78 == 4) {
					local63 = local108;
					local67 = local61;
					local65 = local89;
				} else if (local78 == 5) {
					local63 = local61;
					local67 = local97;
					local65 = local89;
				}
				local63 = (float) Math.pow((double) local63, local20);
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(213) int local213 = (int) (local67 * 256.0F);
				@Pc(226) int local226 = (local203 << 16) + (local208 << 8) + local213 - 16777216;
				Static421.anIntArray844[local22++] = local226;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public static void method7633() {
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_2, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub25_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub13_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub26_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub29_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub14_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub11_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub23_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub28_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_2, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub4_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub27_1, 0);
		Static358.method6960();
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub19_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 4);
		Static246.method3759();
		Static571.method8044();
		Static9.aBoolean5 = true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIILclient!kb;IIIIII)Z")
	public static boolean method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class182 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static608.anIntArrayArray61[64][64] = 99;
		Static151.anIntArrayArray14[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static9.anIntArray13[0] = arg9;
		@Pc(46) int local46 = local37 + 1;
		Static84.anIntArray110[0] = arg4;
		@Pc(56) int[][] local56 = arg5.anIntArrayArray21;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(93) int local93;
				@Pc(246) int local246;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local46 == local39) {
									Static30.anInt607 = local9;
									Static142.anInt8583 = local7;
									return false;
								}
								local7 = Static9.anIntArray13[local39];
								local9 = Static84.anIntArray110[local39];
								local71 = local7 - local18;
								local39 = local39 + 1 & 0xFFF;
								local82 = local9 - local23;
								local88 = local7 - arg5.anInt4545;
								local93 = local9 - arg5.anInt4560;
								if (arg2 == -4) {
									if (arg10 == local7 && local9 == arg3) {
										Static142.anInt8583 = local7;
										Static30.anInt607 = local9;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static409.method6259(arg0, arg8, local9, arg3, arg0, arg1, arg10, local7)) {
										Static142.anInt8583 = local7;
										Static30.anInt607 = local9;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg5.method4173(arg0, arg1, arg8, arg3, local7, arg10, arg7, arg0, local9)) {
										Static30.anInt607 = local9;
										Static142.anInt8583 = local7;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg5.method4168(arg10, arg1, arg0, arg3, local9, arg8, local7, arg7)) {
										Static142.anInt8583 = local7;
										Static30.anInt607 = local9;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg5.method4175(arg6, local9, arg2, arg0, arg10, local7, arg3)) {
										Static30.anInt607 = local9;
										Static142.anInt8583 = local7;
										return true;
									}
								} else if (arg5.method4167(arg0, arg6, arg2, local7, arg3, arg10, local9)) {
									Static142.anInt8583 = local7;
									Static30.anInt607 = local9;
									return true;
								}
								local246 = Static151.anIntArrayArray14[local71][local82] + 1;
								if (local71 > 0 && Static608.anIntArrayArray61[local71 - 1][local82] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][arg0 + local93 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg0 - 1 <= local291) {
											Static9.anIntArray13[local46] = local7 - 1;
											Static84.anIntArray110[local46] = local9;
											Static608.anIntArrayArray61[local71 - 1][local82] = 2;
											local46 = local46 + 1 & 0xFFF;
											Static151.anIntArrayArray14[local71 - 1][local82] = local246;
											break;
										}
										if ((local56[local88 - 1][local291 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg0 > local71 && Static608.anIntArrayArray61[local71 + 1][local82] == 0 && (local56[local88 + arg0][local93] & 0x60E40000) == 0 && (local56[local88 + arg0][local93 + arg0 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg0 - 1 <= local291) {
											Static9.anIntArray13[local46] = local7 + 1;
											Static84.anIntArray110[local46] = local9;
											Static608.anIntArrayArray61[local71 + 1][local82] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static151.anIntArrayArray14[local71 + 1][local82] = local246;
											break;
										}
										if ((local56[local88 + arg0][local291 + local93] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local82 > 0 && Static608.anIntArrayArray61[local71][local82 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + arg0 - 1][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg0 - 1) {
											Static9.anIntArray13[local46] = local7;
											Static84.anIntArray110[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static608.anIntArrayArray61[local71][local82 - 1] = 1;
											Static151.anIntArrayArray14[local71][local82 - 1] = local246;
											break;
										}
										if ((local56[local88 + local291][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local82 < 128 - arg0 && Static608.anIntArrayArray61[local71][local82 + 1] == 0 && (local56[local88][local93 + arg0] & 0x4E240000) == 0 && (local56[arg0 + local88 - 1][local93 + arg0] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg0 - 1) {
											Static9.anIntArray13[local46] = local7;
											Static84.anIntArray110[local46] = local9 + 1;
											Static608.anIntArrayArray61[local71][local82 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static151.anIntArrayArray14[local71][local82 + 1] = local246;
											break;
										}
										if ((local56[local88 + local291][local93 + arg0] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local71 > 0 && local82 > 0 && Static608.anIntArrayArray61[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg0 <= local291) {
											Static9.anIntArray13[local46] = local7 - 1;
											Static84.anIntArray110[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static608.anIntArrayArray61[local71 - 1][local82 - 1] = 3;
											Static151.anIntArrayArray14[local71 - 1][local82 - 1] = local246;
											break;
										}
										if ((local56[local88 - 1][local93 + local291 - 1] & 0x4FA40000) != 0 || (local56[local88 + local291 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg0 > local71 && local82 > 0 && Static608.anIntArrayArray61[local71 + 1][local82 - 1] == 0 && (local56[arg0 + local88][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg0 <= local291) {
											Static9.anIntArray13[local46] = local7 + 1;
											Static84.anIntArray110[local46] = local9 - 1;
											Static608.anIntArrayArray61[local71 + 1][local82 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static151.anIntArrayArray14[local71 + 1][local82 - 1] = local246;
											break;
										}
										if ((local56[arg0 + local88][local291 + local93 - 1] & 0x78E40000) != 0 || (local56[local291 + local88][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local71 > 0 && 128 - arg0 > local82 && Static608.anIntArrayArray61[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][arg0 + local93] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg0; local291++) {
										if ((local56[local88 - 1][local93 + local291] & 0x4FA40000) != 0 || (local56[local88 + local291 - 1][local93 + arg0] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static9.anIntArray13[local46] = local7 - 1;
									Static84.anIntArray110[local46] = local9 + 1;
									Static608.anIntArrayArray61[local71 - 1][local82 + 1] = 6;
									local46 = local46 + 1 & 0xFFF;
									Static151.anIntArrayArray14[local71 - 1][local82 + 1] = local246;
								}
							} while (local71 >= 128 - arg0);
						} while (local82 >= 128 - arg0);
					} while (Static608.anIntArrayArray61[local71 + 1][local82 + 1] != 0);
				} while ((local56[arg0 + local88][local93 + arg0] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg0; local291++) {
					if ((local56[local88 + local291][arg0 + local93] & 0x7E240000) != 0 || (local56[arg0 + local88][local291 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static9.anIntArray13[local46] = local7 + 1;
				Static84.anIntArray110[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local71 + 1][local82 + 1] = 12;
				Static151.anIntArrayArray14[local71 + 1][local82 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBI)V")
	public static void method7636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub4_Sub13 local13 = Static506.method2916(arg1, 1);
		local13.method4140();
		local13.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!rda;IIBII)Lclient!qd;")
	public static Class24_Sub4_Sub1 method7637(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean681 || Static586.method8223(arg2) && Static586.method8223(arg3)) {
			return new Class24_Sub4_Sub1(arg0, 3553, arg1, arg4, arg2, arg3, true);
		} else if (arg0.aBoolean667) {
			return new Class24_Sub4_Sub1(arg0, 34037, arg1, arg4, arg2, arg3, true);
		} else {
			return new Class24_Sub4_Sub1(arg0, arg1, arg4, arg2, arg3, Static522.method6795(arg2), Static522.method6795(arg3), true);
		}
	}
}
