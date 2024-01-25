import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method7337() {
		if (Static441.anIntArray394 != null) {
			return;
		}
		Static441.anIntArray394 = new int[65536];
		@Pc(37) double local37 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < 512; local41++) {
			@Pc(53) float local53 = ((float) (local41 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(62) float local62 = (float) (local41 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(64) int local64 = 0; local64 < 128; local64++) {
				@Pc(70) float local70 = (float) local64 / 128.0F;
				@Pc(72) float local72 = 0.0F;
				@Pc(74) float local74 = 0.0F;
				@Pc(76) float local76 = 0.0F;
				@Pc(80) float local80 = local53 / 60.0F;
				@Pc(83) int local83 = (int) local80;
				@Pc(87) int local87 = local83 % 6;
				@Pc(92) float local92 = local80 - (float) local83;
				@Pc(98) float local98 = (1.0F - local62) * local70;
				@Pc(106) float local106 = (1.0F - local62 * local92) * local70;
				@Pc(116) float local116 = (1.0F - (1.0F - local92) * local62) * local70;
				if (local87 == 0) {
					local76 = local98;
					local72 = local70;
					local74 = local116;
				} else if (local87 == 1) {
					local76 = local98;
					local72 = local106;
					local74 = local70;
				} else if (local87 == 2) {
					local74 = local70;
					local76 = local116;
					local72 = local98;
				} else if (local87 == 3) {
					local72 = local98;
					local76 = local70;
					local74 = local106;
				} else if (local87 == 4) {
					local76 = local70;
					local72 = local116;
					local74 = local98;
				} else if (local87 == 5) {
					local72 = local70;
					local74 = local98;
					local76 = local106;
				}
				local72 = (float) Math.pow((double) local72, local37);
				local74 = (float) Math.pow((double) local74, local37);
				local76 = (float) Math.pow((double) local76, local37);
				@Pc(214) int local214 = (int) (local72 * 256.0F);
				@Pc(219) int local219 = (int) (local74 * 256.0F);
				@Pc(224) int local224 = (int) (local76 * 256.0F);
				@Pc(237) int local237 = (local219 << 8) + (local214 << 16) + local224 - 16777216;
				Static441.anIntArray394[local39++] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method7340() {
		if (Static232.method3903(Static387.anInt9114)) {
			Static334.method5151(false);
		} else {
			Static260.aClass278_1 = Static277.aClass347_2.aClass278_2;
			Static277.aClass347_2.aClass278_2 = null;
			Static160.method2323(14);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!pka;IIIIIIIIIII)Z")
	public static boolean method7341(@OriginalArg(0) Class289 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12 = arg5;
		@Pc(14) int local14 = arg10;
		@Pc(23) int local23 = arg5 - 64;
		Static384.anIntArrayArray45[64][64] = 99;
		@Pc(34) int local34 = arg10 - 64;
		Static3.anIntArrayArray1[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static465.anIntArray413[0] = arg5;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static581.anIntArray499[0] = arg10;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray52;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(270) int local270;
				@Pc(318) int local318;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static131.anInt2079 = local14;
									Static447.anInt7500 = local12;
									return false;
								}
								local12 = Static465.anIntArray413[local48];
								local14 = Static581.anIntArray499[local48];
								local70 = local12 - local23;
								local75 = local14 - local34;
								local48 = local48 + 1 & 0xFFF;
								local87 = local12 - arg0.anInt8133;
								local93 = local14 - arg0.anInt8117;
								if (arg6 == -4) {
									if (local12 == arg3 && local14 == arg4) {
										Static447.anInt7500 = local12;
										Static131.anInt2079 = local14;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static303.method6871(arg3, arg8, arg4, arg7, arg2, arg8, local14, local12)) {
										Static131.anInt2079 = local14;
										Static447.anInt7500 = local12;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg0.method7087(arg8, arg3, arg4, local12, arg1, arg2, arg7, local14, arg8)) {
										Static447.anInt7500 = local12;
										Static131.anInt2079 = local14;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg0.method7072(arg1, local14, local12, arg7, arg3, arg8, arg2, arg4)) {
										Static447.anInt7500 = local12;
										Static131.anInt2079 = local14;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg0.method7086(arg6, local14, arg8, local12, arg9, arg4, arg3)) {
										Static447.anInt7500 = local12;
										Static131.anInt2079 = local14;
										return true;
									}
								} else if (arg0.method7080(local12, arg6, arg3, arg9, arg4, arg8, local14)) {
									Static447.anInt7500 = local12;
									Static131.anInt2079 = local14;
									return true;
								}
								local270 = Static3.anIntArrayArray1[local70][local75] + 1;
								if (local70 > 0 && Static384.anIntArrayArray45[local70 - 1][local75] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][arg8 + local93 - 1] & 0x4E240000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg8 - 1) {
											Static465.anIntArray413[local51] = local12 - 1;
											Static581.anIntArray499[local51] = local14;
											local51 = local51 + 1 & 0xFFF;
											Static384.anIntArrayArray45[local70 - 1][local75] = 2;
											Static3.anIntArrayArray1[local70 - 1][local75] = local270;
											break;
										}
										if ((local56[local87 - 1][local93 + local318] & 0x4FA40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg8 > local70 && Static384.anIntArrayArray45[local70 + 1][local75] == 0 && (local56[arg8 + local87][local93] & 0x60E40000) == 0 && (local56[arg8 + local87][local93 + arg8 - 1] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg8 - 1) {
											Static465.anIntArray413[local51] = local12 + 1;
											Static581.anIntArray499[local51] = local14;
											Static384.anIntArrayArray45[local70 + 1][local75] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static3.anIntArrayArray1[local70 + 1][local75] = local270;
											break;
										}
										if ((local56[arg8 + local87][local93 + local318] & 0x78E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local75 > 0 && Static384.anIntArrayArray45[local70][local75 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[arg8 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg8 - 1) {
											Static465.anIntArray413[local51] = local12;
											Static581.anIntArray499[local51] = local14 - 1;
											Static384.anIntArrayArray45[local70][local75 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static3.anIntArrayArray1[local70][local75 - 1] = local270;
											break;
										}
										if ((local56[local87 + local318][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg8 > local75 && Static384.anIntArrayArray45[local70][local75 + 1] == 0 && (local56[local87][local93 + arg8] & 0x4E240000) == 0 && (local56[local87 + arg8 - 1][local93 + arg8] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (arg8 - 1 <= local318) {
											Static465.anIntArray413[local51] = local12;
											Static581.anIntArray499[local51] = local14 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static384.anIntArrayArray45[local70][local75 + 1] = 4;
											Static3.anIntArrayArray1[local70][local75 + 1] = local270;
											break;
										}
										if ((local56[local87 + local318][local93 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static384.anIntArrayArray45[local70 - 1][local75 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local318 = 1;
									while (true) {
										if (arg8 <= local318) {
											Static465.anIntArray413[local51] = local12 - 1;
											Static581.anIntArray499[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static384.anIntArrayArray45[local70 - 1][local75 - 1] = 3;
											Static3.anIntArrayArray1[local70 - 1][local75 - 1] = local270;
											break;
										}
										if ((local56[local87 - 1][local318 + local93 - 1] & 0x4FA40000) != 0 || (local56[local87 + local318 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local70 < 128 - arg8 && local75 > 0 && Static384.anIntArrayArray45[local70 + 1][local75 - 1] == 0 && (local56[arg8 + local87][local93 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg8) {
											Static465.anIntArray413[local51] = local12 + 1;
											Static581.anIntArray499[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static384.anIntArrayArray45[local70 + 1][local75 - 1] = 9;
											Static3.anIntArrayArray1[local70 + 1][local75 - 1] = local270;
											break;
										}
										if ((local56[arg8 + local87][local93 + local318 - 1] & 0x78E40000) != 0 || (local56[local87 + local318][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local70 > 0 && local75 < 128 - arg8 && Static384.anIntArrayArray45[local70 - 1][local75 + 1] == 0 && (local56[local87 - 1][arg8 + local93] & 0x4E240000) == 0) {
									for (local318 = 1; local318 < arg8; local318++) {
										if ((local56[local87 - 1][local318 + local93] & 0x4FA40000) != 0 || (local56[local87 + local318 - 1][arg8 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static465.anIntArray413[local51] = local12 - 1;
									Static581.anIntArray499[local51] = local14 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static384.anIntArrayArray45[local70 - 1][local75 + 1] = 6;
									Static3.anIntArrayArray1[local70 - 1][local75 + 1] = local270;
								}
							} while (local70 >= 128 - arg8);
						} while (128 - arg8 <= local75);
					} while (Static384.anIntArrayArray45[local70 + 1][local75 + 1] != 0);
				} while ((local56[local87 + arg8][arg8 + local93] & 0x78240000) != 0);
				for (local318 = 1; local318 < arg8; local318++) {
					if ((local56[local87 + local318][local93 + arg8] & 0x7E240000) != 0 || (local56[local87 + arg8][local93 + local318] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static465.anIntArray413[local51] = local12 + 1;
				Static581.anIntArray499[local51] = local14 + 1;
				Static384.anIntArrayArray45[local70 + 1][local75 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local70 + 1][local75 + 1] = local270;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	public static void method7343(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class144 arg4) {
		if ((Static260.aClass45_15 == null || Static201.aClass45_12 == null || Static236.aClass45_13 == null) && Static99.aClass310_23.method7785(Static95.anInt1678) && Static99.aClass310_23.method7785(Static485.anInt8382) && Static99.aClass310_23.method7785(Static307.anInt5460)) {
			@Pc(43) Class266 local43 = Static697.method6466(Static99.aClass310_23, Static485.anInt8382, 0);
			Static201.aClass45_12 = arg4.method6964(local43, true);
			local43.method6460();
			Static310.aClass45_18 = arg4.method6964(local43, true);
			Static260.aClass45_15 = arg4.method6964(Static697.method6466(Static99.aClass310_23, Static95.anInt1678, 0), true);
			@Pc(68) Class266 local68 = Static697.method6466(Static99.aClass310_23, Static307.anInt5460, 0);
			Static236.aClass45_13 = arg4.method6964(local68, true);
			local68.method6460();
			Static87.aClass45_2 = arg4.method6964(local68, true);
		}
		if (Static260.aClass45_15 == null || Static201.aClass45_12 == null || Static236.aClass45_13 == null) {
			return;
		}
		@Pc(101) int local101 = (arg3 - Static236.aClass45_13.method7510() * 2) / Static260.aClass45_15.method7510();
		for (@Pc(103) int local103 = 0; local103 < local101; local103++) {
			Static260.aClass45_15.method7488(arg1 + Static236.aClass45_13.method7510() + Static260.aClass45_15.method7510() * local103, arg0 + (arg2 - Static260.aClass45_15.method7501()));
		}
		@Pc(141) int local141 = (arg2 - Static236.aClass45_13.method7501() - 20) / Static201.aClass45_12.method7501();
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			Static201.aClass45_12.method7488(arg1, local143 * Static201.aClass45_12.method7501() + arg0 + 20);
			Static310.aClass45_18.method7488(arg1 + arg3 - Static310.aClass45_18.method7510(), arg0 + 20 + Static201.aClass45_12.method7501() * local143);
		}
		Static236.aClass45_13.method7488(arg1, arg2 + arg0 - Static236.aClass45_13.method7501());
		Static87.aClass45_2.method7488(arg1 + arg3 - Static236.aClass45_13.method7510(), -Static236.aClass45_13.method7501() + arg0 + arg2);
	}
}
