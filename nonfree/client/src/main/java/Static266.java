import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public static int anInt5439 = 0;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZIIII)V")
	public static void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(20) Class2_Sub26 local20 = (Class2_Sub26) Static210.aClass199_20.method5751(local14);
		if (local20 == null) {
			local20 = new Class2_Sub26();
			Static210.aClass199_20.method5749(local20, local14);
		}
		if (arg4 >= local20.anIntArray270.length) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray270.length; local52++) {
				local45[local52] = local20.anIntArray270[local52];
				local50[local52] = local20.anIntArray269[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray270.length; local78 < arg4; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray269 = local50;
			local20.anIntArray270 = local45;
		}
		local20.anIntArray270[arg4] = arg2;
		local20.anIntArray269[arg4] = arg3;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZIIIB[Lclient!p;IIIILclient!ae;[B)[I")
	public static int[] method4814(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class151[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class4 arg9, @OriginalArg(11) byte[] arg10) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg0) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg0) {
			@Pc(31) Class151 local31 = arg4[arg5];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = arg6 + Static192.method3450(local33 & 0x7, local37 & 0x7, arg1);
					@Pc(64) int local64 = arg7 + Static59.method1356(local33 & 0x7, local37 & 0x7, arg1);
					if (local51 > 0 && local51 < Static95.anInt6381 - 1 && local64 > 0 && local64 < Static237.anInt4532 - 1) {
						local31.method4097(local51, local64);
					}
				}
			}
		}
		@Pc(103) Class2_Sub10 local103 = new Class2_Sub10(arg10);
		local33 = (arg2 & 0x1FFFFFF8) << 3;
		local37 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (arg1 == 1) {
			local119 = 1;
		} else if (arg1 == 2) {
			local119 = 1;
			local117 = 1;
		} else if (arg1 == 3) {
			local117 = 1;
		}
		@Pc(213) int local213;
		@Pc(225) int local225;
		@Pc(255) int local255;
		@Pc(264) int local264;
		@Pc(276) int local276;
		@Pc(284) int local284;
		for (@Pc(154) int local154 = 0; local154 < local21; local154++) {
			for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
				for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
					if (local154 != arg8 || local158 < local11 || local158 > local11 + 8 || local17 > local162 || local17 + 8 < local162) {
						Static103.method2283(0, 0, arg0, -1, 0, 0, 0, false, 0, -1, local103);
					} else if (local158 == local11 + 8 || local162 == local17 + 8) {
						if (arg1 == 0) {
							local225 = local162 + arg7 - local17;
							local213 = arg6 + local158 - local11;
						} else if (arg1 == 1) {
							local225 = arg7 + local11 + 8 - local158;
							local213 = local162 + arg6 - local17;
						} else if (arg1 == 2) {
							local225 = arg7 + local17 + 8 - local162;
							local213 = local11 + arg6 + 8 - local158;
						} else {
							local225 = arg7 + local158 - local11;
							local213 = local17 + arg6 + 8 - local162;
						}
						Static103.method2283(local37 + local162, 0, arg0, local213, 0, 0, local33 + local158, true, arg5, local225, local103);
					} else {
						local213 = Static192.method3450(local158 & 0x7, local162 & 0x7, arg1) + arg6;
						local225 = Static59.method1356(local158 & 0x7, local162 & 0x7, arg1) + arg7;
						Static103.method2283(local37 + local162, local117, arg0, local213, arg1, local119, local158 + local33, false, arg5, local225, local103);
						if (local158 == 63 || local162 == 63) {
							local255 = local158 == 63 ? 64 : local158;
							local264 = local162 == 63 ? 64 : local162;
							if (arg1 == 0) {
								local276 = arg6 + local255 - local11;
								local284 = local264 + arg7 - local17;
							} else if (arg1 == 1) {
								local276 = local264 + arg6 - local17;
								local284 = arg7 + local11 + 8 - local255;
							} else if (arg1 == 2) {
								local276 = arg6 + local11 + 8 - local255;
								local284 = arg7 + local17 + 8 - local264;
							} else {
								local276 = local17 + arg6 + 8 - local264;
								local284 = local255 + arg7 - local11;
							}
							if (local276 >= 0 && Static95.anInt6381 > local276 && local284 >= 0 && Static237.anInt4532 > local284) {
								Static109.anIntArrayArrayArray3[arg5][local276][local284] = Static109.anIntArrayArrayArray3[arg5][local213 + local117][local225 + local119];
							}
						}
					}
				}
			}
		}
		@Pc(506) boolean local506 = false;
		@Pc(562) int local562;
		@Pc(681) int local681;
		@Pc(719) int local719;
		while (local103.anInt4807 < local103.aByteArray57.length) {
			local213 = local103.method4421();
			if (local213 == 128) {
				Static212.anIntArray326[0] = local103.method4464();
				Static212.anIntArray326[1] = local103.method4460();
				Static212.anIntArray326[2] = local103.method4460();
				Static212.anIntArray326[3] = local103.method4460();
				local506 = true;
				Static212.anIntArray326[4] = local103.method4464();
			} else {
				if (local213 != 129) {
					local103.anInt4807--;
					break;
				}
				if (Static104.aByteArrayArrayArray10 == null) {
					Static104.aByteArrayArrayArray10 = new byte[4][][];
				}
				for (local225 = 0; local225 < 4; local225++) {
					@Pc(541) byte local541 = local103.method4436();
					if (local541 == 0 && Static104.aByteArrayArrayArray10[arg5] != null) {
						if (arg8 >= local225) {
							local264 = arg6;
							local276 = arg6 + 7;
							local284 = arg7;
							local562 = arg7 + 7;
							if (arg7 < 0) {
								local284 = 0;
							} else if (arg7 >= Static237.anInt4532) {
								local284 = Static237.anInt4532;
							}
							if (local276 < 0) {
								local276 = 0;
							} else if (Static95.anInt6381 <= local276) {
								local276 = Static95.anInt6381;
							}
							if (arg6 < 0) {
								local264 = 0;
							} else if (Static95.anInt6381 <= arg6) {
								local264 = Static95.anInt6381;
							}
							if (local562 < 0) {
								local562 = 0;
							} else if (Static237.anInt4532 <= local562) {
								local562 = Static237.anInt4532;
							}
							while (local264 < local276) {
								while (local562 > local284) {
									Static104.aByteArrayArrayArray10[arg5][local264][local284] = 0;
									local284++;
								}
								local264++;
							}
						}
					} else if (local541 == 1) {
						if (Static104.aByteArrayArrayArray10[arg5] == null) {
							Static104.aByteArrayArrayArray10[arg5] = new byte[Static95.anInt6381 + 1][Static237.anInt4532 + 1];
						}
						for (local264 = 0; local264 < 64; local264 += 4) {
							for (local276 = 0; local276 < 64; local276 += 4) {
								@Pc(672) byte local672 = local103.method4436();
								if (arg8 >= local225) {
									for (local562 = local264; local562 < local264 + 4; local562++) {
										for (local681 = local276; local681 < local276 + 4; local681++) {
											if (local562 >= local11 && local562 < local11 + 8 && local17 <= local681 && local17 < local17 + 8) {
												local719 = Static192.method3450(local562 & 0x7, local681 & 0x7, arg1) + arg6;
												@Pc(731) int local731 = Static59.method1356(local562 & 0x7, local681 & 0x7, arg1) + arg7;
												if (local719 >= 0 && Static95.anInt6381 > local719 && local731 >= 0 && local731 < Static237.anInt4532) {
													Static104.aByteArrayArrayArray10[arg5][local719][local731] = local672;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg0) {
			@Pc(839) Class105 local839 = null;
			label276: while (true) {
				while (true) {
					while (local103.anInt4807 < local103.aByteArray57.length) {
						local225 = local103.method4421();
						if (local225 == 0) {
							local839 = new Class105(local103);
						} else if (local225 == 1) {
							local255 = local103.method4421();
							if (local255 > 0) {
								for (local264 = 0; local264 < local255; local264++) {
									@Pc(885) Class2_Sub36_Sub1 local885 = new Class2_Sub36_Sub1(local103);
									if (local885.anInt5126 == 31) {
										@Pc(897) Class166 local897 = Static90.method4778(local103.method4464());
										local885.method4672(local897.anInt5435, local897.anInt5437, local897.anInt5438, local897.anInt5442);
									}
									local284 = local885.anInt5111 >> 7;
									local562 = local885.anInt5115 >> 7;
									if (arg8 == local885.anInt5129 && local284 >= local11 && local11 + 8 > local284 && local17 <= local562 && local562 < local17 + 8) {
										local681 = Static303.method5319(local885.anInt5111 & 0x3FF, arg1, local885.anInt5115 & 0x3FF) + (arg6 << 7);
										local719 = (arg7 << 7) + Static96.method2170(local885.anInt5111 & 0x3FF, arg1, local885.anInt5115 & 0x3FF);
										local885.anInt5111 = local681;
										local885.anInt5115 = local719;
										local284 = local885.anInt5111 >> 7;
										local562 = local885.anInt5115 >> 7;
										if (local284 >= 0 && local562 >= 0 && Static95.anInt6381 > local284 && local562 < Static237.anInt4532) {
											local885.anInt5109 = Static109.anIntArrayArrayArray3[arg8][local284][local562] - local885.anInt5109;
											if (arg9.method4263() > 0) {
												Static94.method2136(local885);
											}
										}
									}
								}
							}
						} else if (local225 == 2) {
							if (local839 == null) {
								local839 = new Class105();
							}
							local839.method3035(local103);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local839 != null) {
						Static344.method5935(arg6 >> 3, arg7 >> 3, local839);
					}
					break label276;
				}
			}
		}
		if (Static104.aByteArrayArrayArray10 != null && Static104.aByteArrayArrayArray10[arg5] != null) {
			local213 = arg6 + 7;
			local225 = arg7 + 7;
			for (local255 = arg6; local255 < local213; local255++) {
				for (local264 = arg7; local264 < local225; local264++) {
					Static104.aByteArrayArrayArray10[arg5][local255][local264] = 0;
				}
			}
		}
		if (local506) {
			return Static212.anIntArray326;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	public static void method4815() {
		Static12.method424(false);
		if (Static95.anInt6379 >= 0 && Static95.anInt6379 != 0) {
			Static291.method5166(Static95.anInt6379);
			Static95.anInt6379 = -1;
		}
	}
}
