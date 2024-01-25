import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!wq;")
	public static Class216 aClass216_38 = new Class216();

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
	public static boolean aBoolean420 = true;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method4135() {
		if (Static83.aClass193_1 == null) {
			return;
		}
		if (Static83.aClass193_1.anInt6293 == 1) {
			Static83.aClass193_1 = null;
			return;
		}
		if (Static83.aClass193_1.anInt6293 == 2) {
			Static257.method4677(Static163.aString16, Static310.aClass168_5, 2);
			Static83.aClass193_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ae;IIII[Lclient!p;IZ[BI)[I")
	private static int[] method4136(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class151[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(32) int local32;
		if (!arg6) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				@Pc(15) Class151 local15 = arg4[local9];
				for (local17 = 0; local17 < 64; local17++) {
					for (local21 = 0; local21 < 64; local21++) {
						local27 = local17 + arg1;
						local32 = arg8 + local21;
						if (local27 >= 0 && local27 < Static95.anInt6381 && local32 >= 0 && Static237.anInt4532 > local32) {
							local15.method4097(local27, local32);
						}
					}
				}
			}
		}
		@Pc(75) Class2_Sub10 local75 = new Class2_Sub10(arg7);
		@Pc(80) int local80 = arg5 + arg1;
		local17 = arg2 + arg8;
		for (local21 = 0; local21 < arg3; local21++) {
			for (local27 = 0; local27 < 64; local27++) {
				for (local32 = 0; local32 < 64; local32++) {
					Static103.method2283(local17 + local32, 0, arg6, arg1 + local27, 0, 0, local80 + local27, false, local21, arg8 + local32, local75);
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(145) int local145;
		@Pc(170) int local170;
		@Pc(184) int local184;
		@Pc(188) int local188;
		@Pc(190) int local190;
		@Pc(194) int local194;
		while (local75.anInt4807 < local75.aByteArray57.length) {
			local145 = local75.method4421();
			if (local145 == 128) {
				Static212.anIntArray326[0] = local75.method4464();
				Static212.anIntArray326[1] = local75.method4460();
				Static212.anIntArray326[2] = local75.method4460();
				Static212.anIntArray326[3] = local75.method4460();
				local137 = true;
				Static212.anIntArray326[4] = local75.method4464();
			} else {
				if (local145 != 129) {
					local75.anInt4807--;
					break;
				}
				if (Static104.aByteArrayArrayArray10 == null) {
					Static104.aByteArrayArrayArray10 = new byte[4][][];
				}
				local139 = true;
				for (local170 = 0; local170 < 4; local170++) {
					@Pc(176) byte local176 = local75.method4436();
					if (local176 == 0 && Static104.aByteArrayArrayArray10[local170] != null) {
						local184 = arg1;
						local188 = arg1 + 64;
						local190 = arg8;
						local194 = arg8 + 64;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 >= Static95.anInt6381) {
							local188 = Static95.anInt6381;
						}
						if (arg1 < 0) {
							local184 = 0;
						} else if (arg1 >= Static95.anInt6381) {
							local184 = Static95.anInt6381;
						}
						if (arg8 < 0) {
							local190 = 0;
						} else if (arg8 >= Static237.anInt4532) {
							local190 = Static237.anInt4532;
						}
						if (local194 < 0) {
							local194 = 0;
						} else if (local194 >= Static237.anInt4532) {
							local194 = Static237.anInt4532;
						}
						while (local188 > local184) {
							while (local194 > local190) {
								Static104.aByteArrayArrayArray10[local170][local184][local190] = 0;
								local190++;
							}
							local184++;
						}
					} else if (local176 == 1) {
						if (Static104.aByteArrayArrayArray10[local170] == null) {
							Static104.aByteArrayArrayArray10[local170] = new byte[Static95.anInt6381 + 1][Static237.anInt4532 + 1];
						}
						for (local184 = 0; local184 < 64; local184 += 4) {
							for (local188 = 0; local188 < 64; local188 += 4) {
								@Pc(302) byte local302 = local75.method4436();
								for (local194 = local184 + arg1; local194 < arg1 + local184 + 4; local194++) {
									for (@Pc(313) int local313 = arg8 + local188; local313 < arg8 + local188 + 4; local313++) {
										if (local194 >= 0 && local194 < Static95.anInt6381 && local313 >= 0 && local313 < Static237.anInt4532) {
											Static104.aByteArrayArrayArray10[local170][local194][local313] = local302;
										}
									}
								}
							}
						}
					} else if (local176 == 2) {
						if (Static104.aByteArrayArrayArray10[local170] == null) {
							Static104.aByteArrayArrayArray10[local170] = new byte[Static95.anInt6381 + 1][Static237.anInt4532 + 1];
						}
						if (local170 > 0) {
							local184 = arg1;
							local188 = arg1 + 64;
							local190 = arg8;
							if (arg1 < 0) {
								local184 = 0;
							} else if (Static95.anInt6381 <= arg1) {
								local184 = Static95.anInt6381;
							}
							if (arg8 < 0) {
								local190 = 0;
							} else if (arg8 >= Static237.anInt4532) {
								local190 = Static237.anInt4532;
							}
							if (local188 < 0) {
								local188 = 0;
							} else if (Static95.anInt6381 <= local188) {
								local188 = Static95.anInt6381;
							}
							local194 = arg8 + 64;
							if (local194 < 0) {
								local194 = 0;
							} else if (Static237.anInt4532 <= local194) {
								local194 = Static237.anInt4532;
							}
							while (local188 > local184) {
								while (local194 > local190) {
									Static104.aByteArrayArrayArray10[local170][local184][local190] = Static104.aByteArrayArrayArray10[local170 - 1][local184][local190];
									local190++;
								}
								local184++;
							}
						}
					}
				}
			}
		}
		@Pc(544) int local544;
		if (!arg6) {
			@Pc(530) Class105 local530 = null;
			label281: while (true) {
				label274: do {
					while (true) {
						while (local75.aByteArray57.length > local75.anInt4807) {
							local170 = local75.method4421();
							if (local170 == 0) {
								local530 = new Class105(local75);
							} else {
								if (local170 == 1) {
									local544 = local75.method4421();
									continue label274;
								}
								if (local170 != 2) {
									throw new IllegalStateException();
								}
								if (local530 == null) {
									local530 = new Class105();
								}
								local530.method3035(local75);
							}
						}
						if (local530 != null) {
							for (local170 = 0; local170 < 8; local170++) {
								for (local544 = 0; local544 < 8; local544++) {
									local184 = local170 + (arg1 >> 3);
									local188 = (arg8 >> 3) + local544;
									if (local184 >= 0 && local184 < Static95.anInt6381 >> 3 && local188 >= 0 && local188 < Static237.anInt4532 >> 3) {
										Static344.method5935(local184, local188, local530);
									}
								}
							}
						}
						break label281;
					}
				} while (local544 <= 0);
				for (local184 = 0; local184 < local544; local184++) {
					@Pc(558) Class2_Sub36_Sub1 local558 = new Class2_Sub36_Sub1(local75);
					if (local558.anInt5126 == 31) {
						@Pc(570) Class166 local570 = Static90.method4778(local75.method4464());
						local558.method4672(local570.anInt5435, local570.anInt5437, local570.anInt5438, local570.anInt5442);
					}
					local558.anInt5111 += arg1 << 7;
					local558.anInt5115 += arg8 << 7;
					local190 = local558.anInt5111 >> 7;
					local194 = local558.anInt5115 >> 7;
					if (local190 >= 0 && local194 >= 0 && Static95.anInt6381 > local190 && Static237.anInt4532 > local194) {
						local558.anInt5109 = Static109.anIntArrayArrayArray3[local558.anInt5129][local190][local194] - local558.anInt5109;
						if (arg0.method4263() > 0) {
							Static94.method2136(local558);
						}
					}
				}
			}
		}
		if (!local139 && Static104.aByteArrayArrayArray10 != null) {
			for (local145 = 0; local145 < 4; local145++) {
				if (Static104.aByteArrayArrayArray10[local145] != null) {
					for (local170 = 0; local170 < 16; local170++) {
						for (local544 = 0; local544 < 16; local544++) {
							local184 = (arg1 >> 2) + local170;
							local188 = (arg8 >> 2) + local544;
							if (local184 >= 0 && local184 < 26 && local188 >= 0 && local188 < 26) {
								Static104.aByteArrayArrayArray10[local145][local184][local188] = 0;
							}
						}
					}
				}
			}
		}
		if (local137) {
			return Static212.anIntArray326;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
	public static void method4140(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local11 = 1;
			local9 = Static341.aByteArrayArray22;
		} else {
			local9 = Static10.aByteArrayArray2;
			local11 = 4;
		}
		@Pc(20) int local20 = local9.length;
		@Pc(40) int local40;
		@Pc(52) int local52;
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(30) int[] local30 = null;
			@Pc(34) byte[] local34 = local9[local26];
			local40 = Static201.anIntArray310[local26] >> 8;
			@Pc(46) int local46 = Static201.anIntArray310[local26] & 0xFF;
			local52 = local40 * 64 - Static138.anInt2879;
			@Pc(59) int local59 = local46 * 64 - Static342.anInt6864;
			if (local34 != null) {
				Static166.method3083();
				local30 = method4136(Static147.aClass4_2, local52, Static342.anInt6864, local11, Static169.aClass151Array1, Static138.anInt2879, arg0, local34, local59);
			}
			if (!arg0 && local40 == Static278.anInt5657 / 8 && Static146.anInt3013 / 8 == local46) {
				if (local30 == null) {
					Static89.aClass18_1 = null;
				} else {
					Static89.aClass18_1 = Static105.method2327(local30[3], local30[1], local30[0], local30[2]);
					Static82.anInt2744 = local30[4];
				}
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local20; local118++) {
			@Pc(130) int local130 = (Static201.anIntArray310[local118] >> 8) * 64 - Static138.anInt2879;
			local40 = (Static201.anIntArray310[local118] & 0xFF) * 64 - Static342.anInt6864;
			@Pc(144) byte[] local144 = local9[local118];
			if (local144 == null && Static146.anInt3013 < 800) {
				Static166.method3083();
				for (local52 = 0; local52 < local11; local52++) {
					Static344.method5933(local40, 64, local52, local130, 64);
				}
			}
		}
	}
}
