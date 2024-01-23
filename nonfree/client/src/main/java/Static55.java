import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dk", name = "R", descriptor = "[Lclient!li;")
	public static Class104[] aClass104Array1 = new Class104[50];

	@OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
	public static int anInt1228 = 0;

	@OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
	public static int anInt1229 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!hn;IIIILclient!ie;IIIIIZZ)Lclient!ie;")
	public static Class36_Sub2 method891(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class36_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(27) long local27 = (long) ((arg10 << 24) + (arg5 << 16) + arg2) + ((long) arg7 << 32) + ((long) arg9 << 48);
		@Pc(33) Class36_Sub2 local33 = (Class36_Sub2) Static170.aClass61_29.method1384(local27);
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(127) int local127;
		@Pc(152) int local152;
		if (local33 == null) {
			@Pc(48) byte local48;
			if (arg2 == 1) {
				local48 = 9;
			} else if (arg2 == 2) {
				local48 = 12;
			} else if (arg2 == 3) {
				local48 = 15;
			} else if (arg2 == 4) {
				local48 = 18;
			} else {
				local48 = 21;
			}
			@Pc(89) int[] local89 = new int[] { 64, 96, 128 };
			@Pc(108) Class36_Sub7 local108 = new Class36_Sub7(local48 * 3 + 1, -local48 + local48 * 2 * 3, 0);
			local114 = local108.method4192(0, 0);
			@Pc(118) int[][] local118 = new int[3][local48];
			for (local120 = 0; local120 < 3; local120++) {
				local127 = local89[local120];
				local131 = local89[local120];
				for (@Pc(133) int local133 = 0; local133 < local48; local133++) {
					@Pc(142) int local142 = (local133 << 11) / local48;
					local152 = arg0 + Class68.anIntArray137[local142] * local131 >> 16;
					@Pc(162) int local162 = arg11 + local127 * Class68.anIntArray139[local142] >> 16;
					local118[local120][local133] = local108.method4192(local152, local162);
				}
			}
			for (local120 = 0; local120 < 3; local120++) {
				local131 = (local120 * 256 + 128) / 3;
				local127 = 256 - local131;
				@Pc(207) byte local207 = (byte) (arg10 * local131 + arg5 * local127 >> 8);
				@Pc(252) short local252 = (short) ((local131 * (arg9 & 0xFC00) + (arg7 & 0xFC00) * local127 & 0xFC0000) + ((arg9 & 0x380) * local131 + local127 * (arg7 & 0x380) & 0x38000) + ((arg7 & 0x7F) * local127 + local131 * (arg9 & 0x7F) & 0x7F00) >> 8);
				for (local152 = 0; local152 < local48; local152++) {
					if (local120 == 0) {
						local108.method4194(local114, local118[0][(local152 + 1) % local48], local118[0][local152], local252, local207);
					} else {
						local108.method4194(local118[local120 - 1][local152], local118[local120 - 1][(local152 + 1) % local48], local118[local120][(local152 + 1) % local48], local252, local207);
						local108.method4194(local118[local120 - 1][local152], local118[local120][(local152 + 1) % local48], local118[local120][local152], local252, local207);
					}
				}
			}
			local33 = local108.method4193(64, 768, -50, -10, -50);
			Static170.aClass61_29.method1377(local27, local33);
		}
		@Pc(392) int local392 = arg2 * 64 - 1;
		@Pc(395) int local395 = -local392;
		@Pc(397) int local397 = local392;
		@Pc(400) int local400 = -local392;
		@Pc(403) int local403 = arg6.method3948();
		local114 = local392;
		local120 = arg6.method3947();
		local131 = arg6.method3964();
		if (arg12) {
			if (arg4 > 640 && arg4 < 1408) {
				local114 = local392 + 128;
			}
			if (arg4 > 1664 || arg4 < 384) {
				local400 -= 128;
			}
			if (arg4 > 128 && arg4 < 896) {
				local395 -= 128;
			}
			if (arg4 > 1152 && arg4 < 1920) {
				local397 = local392 + 128;
			}
		}
		if (local397 < local120) {
			local120 = local397;
		}
		if (local400 > local131) {
			local131 = local400;
		}
		if (local395 > local403) {
			local403 = local395;
		}
		local127 = arg6.method3951();
		if (local127 > local114) {
			local127 = local114;
		}
		@Pc(488) Class8_Sub1_Sub22 local488 = null;
		if (arg1 != null) {
			@Pc(496) int local496 = arg1.anIntArray159[arg8];
			local488 = Static15.method289(local496 >> 16);
			arg8 = local496 & 0xFFFF;
		}
		if (local488 == null) {
			local33 = local33.method3957(true, true, true);
			local33.method3954((local120 - local403) / 2, 128, (local127 - local131) / 2);
			local33.method3950((local120 + local403) / 2, 0, (local131 + local127) / 2);
		} else {
			local33 = local33.method3957(!local488.method4281(arg8), !local488.method4285(arg8), true);
			local33.method3954((local120 - local403) / 2, 128, (local127 - local131) / 2);
			local33.method3950((local120 + local403) / 2, 0, (local131 + local127) / 2);
			local33.method3961(local488, arg8);
		}
		if (arg4 != 0) {
			local33.method3965(arg4);
		}
		if (Static116.aBoolean188) {
			@Pc(607) Class36_Sub2_Sub1 local607 = (Class36_Sub2_Sub1) local33;
			if (arg3 != Static59.method927(local403 + arg0, arg11 - -local131, Static34.anInt770) || arg3 != Static59.method927(arg0 + local120, local127 + arg11, Static34.anInt770)) {
				for (local152 = 0; local152 < local607.anInt4257; local152++) {
					local607.anIntArray324[local152] += Static59.method927(arg0 + local607.anIntArray320[local152], local607.anIntArray321[local152] - -arg11, Static34.anInt770) - arg3;
				}
				local607.aClass63_1.aBoolean137 = false;
				local607.aClass176_2.aBoolean476 = false;
			}
		} else {
			@Pc(687) Class36_Sub2_Sub2 local687 = (Class36_Sub2_Sub2) local33;
			if (arg3 != Static59.method927(local403 + arg0, local131 + arg11, Static34.anInt770) || Static59.method927(arg0 + local120, local127 + arg11, Static34.anInt770) != arg3) {
				for (local152 = 0; local152 < local687.anInt5253; local152++) {
					local687.anIntArray427[local152] += Static59.method927(local687.anIntArray430[local152] + arg0, arg11 + local687.anIntArray426[local152], Static34.anInt770) - arg3;
				}
				local687.aBoolean437 = false;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(15) int local15 = arg6 - arg0;
		if (Static221.anInt4539 > arg6) {
			local15++;
		}
		if (arg5 < Static156.anInt3157) {
			local10++;
		}
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(60) int local60;
		@Pc(65) int local65;
		@Pc(92) int local92;
		@Pc(125) int local125;
		@Pc(105) int local105;
		@Pc(117) int local117;
		@Pc(162) int local162;
		@Pc(207) int local207;
		@Pc(222) int local222;
		@Pc(237) int local237;
		@Pc(270) int local270;
		@Pc(276) int local276;
		@Pc(313) int local313;
		@Pc(382) int local382;
		for (local38 = 0; local38 < local10; local38++) {
			local49 = local38 * arg7 >> 16;
			local60 = arg7 * (local38 + 1) >> 16;
			local65 = local60 - local49;
			if (local65 > 0) {
				@Pc(74) int local74 = local38 + arg3 >> 6;
				if (local74 >= 0 && local74 <= Static81.anIntArrayArrayArray4.length - 1) {
					local49 += arg2;
					local60 += arg2;
					@Pc(185) int[][] local185 = Static81.anIntArrayArrayArray4[local74];
					@Pc(189) byte[][] local189 = Static66.aByteArrayArrayArray13[local74];
					@Pc(193) byte[][] local193 = Static74.aByteArrayArrayArray3[local74];
					@Pc(197) byte[][] local197 = Static182.aByteArrayArrayArray10[local74];
					@Pc(201) byte[][] local201 = Static197.aByteArrayArrayArray11[local74];
					@Pc(205) byte[][] local205 = Static141.aByteArrayArrayArray7[local74];
					for (local207 = 0; local207 < local15; local207++) {
						local222 = arg4 * local207 >> 16;
						@Pc(232) int local232 = (local207 + 1) * arg4 >> 16;
						local237 = local232 - local222;
						if (local237 > 0) {
							local232 += arg1;
							@Pc(254) int local254 = local207 + arg0 & 0x3F;
							local222 += arg1;
							@Pc(264) int local264 = arg0 + local207 >> 6;
							local270 = arg3 + local38 & 0x3F;
							local276 = (local254 << 6) + local270;
							if (local264 < 0 || local264 > local185.length - 1 || local185[local264] == null) {
								if (Static267.aClass8_Sub1_Sub2_2.anInt648 != -1) {
									local313 = Static267.aClass8_Sub1_Sub2_2.anInt648;
								} else if ((local38 + arg3 & 0x4) == (arg0 + local207 & 0x4)) {
									local313 = Static247.anIntArray475[Static191.anInt3845 + 1];
								} else {
									local313 = 4936552;
								}
								if (local264 < 0 || local185.length - 1 < local264) {
									if (local313 == 0) {
										local313 = 1;
									}
									Static103.method1664(local49, local222, local65, local237, local313);
									continue;
								}
							} else {
								local313 = local185[local264][local276];
							}
							if (local313 == 0) {
								local313 = 1;
							}
							local382 = local193[local264] == null ? 0 : Static247.anIntArray475[local193[local264][local276] & 0xFF];
							@Pc(399) int local399 = local197[local264] == null ? 0 : Static247.anIntArray475[local197[local264][local276] & 0xFF];
							@Pc(428) int local428;
							if (local382 == 0 && local399 == 0) {
								Static103.method1664(local49, local222, local65, local237, local313);
							} else {
								@Pc(424) byte local424;
								if (local382 != 0) {
									local424 = local189[local264] == null ? 0 : local189[local264][local276];
									local428 = local424 & 0xFC;
									if (local382 == -1) {
										local382 = 1;
									}
									if (local428 == 0 || local65 <= 1 || local237 <= 1) {
										Static103.method1664(local49, local222, local65, local237, local382);
									} else {
										Static76.method1205(local428 >> 2, local424 & 0x3, Static103.anIntArray155, local65, local313, local49, local382, local222, true, local237);
									}
								}
								if (local399 != 0) {
									if (local399 == -1) {
										local399 = local313;
									}
									local424 = local201[local264][local276];
									local428 = local424 & 0xFC;
									if (local428 == 0 || local65 <= 1 || local237 <= 1) {
										Static103.method1664(local49, local222, local65, local237, local399);
									}
									Static76.method1205(local428 >> 2, local424 & 0x3, Static103.anIntArray155, local65, 0, local49, local399, local222, local382 == 0, local237);
								}
							}
							if (local205[local264] != null) {
								@Pc(544) int local544 = local205[local264][local276] & 0xFF;
								if (local544 != 0) {
									if (local65 == 1) {
										local428 = local49;
									} else {
										local428 = local60 - 1;
									}
									@Pc(562) int local562 = 13421772;
									if (local544 >= 5 && local544 <= 8 || local544 >= 13 && local544 <= 16 || local544 >= 21 && local544 <= 24 || local544 == 27 || local544 == 28) {
										local544 -= 4;
										local562 = 13369344;
									}
									@Pc(602) int local602;
									if (local237 == 1) {
										local602 = local222;
									} else {
										local602 = local232 - 1;
									}
									if (local544 == 1) {
										Static103.method1683(local49, local222, local237, local562);
									} else if (local544 == 2) {
										Static103.method1677(local49, local222, local65, local562);
									} else if (local544 == 3) {
										Static103.method1683(local428, local222, local237, local562);
									} else if (local544 == 4) {
										Static103.method1677(local49, local602, local65, local562);
									} else if (local544 == 9) {
										Static103.method1683(local49, local222, local237, 16777215);
										Static103.method1677(local49, local222, local65, local562);
									} else if (local544 == 10) {
										Static103.method1683(local428, local222, local237, 16777215);
										Static103.method1677(local49, local222, local65, local562);
									} else if (local544 == 11) {
										Static103.method1683(local428, local222, local237, 16777215);
										Static103.method1677(local49, local602, local65, local562);
									} else if (local544 == 12) {
										Static103.method1683(local49, local222, local237, 16777215);
										Static103.method1677(local49, local602, local65, local562);
									} else if (local544 == 17) {
										Static103.method1677(local49, local222, 1, local562);
									} else if (local544 == 18) {
										Static103.method1677(local428, local222, 1, local562);
									} else if (local544 == 19) {
										Static103.method1677(local428, local602, 1, local562);
									} else if (local544 == 20) {
										Static103.method1677(local49, local602, 1, local562);
									} else {
										@Pc(690) int local690;
										if (local544 == 25) {
											for (local690 = 0; local690 < local237; local690++) {
												Static103.method1677(local690 + local49, -local690 + local602, 1, local562);
											}
										} else if (local544 == 26) {
											for (local690 = 0; local690 < local237; local690++) {
												Static103.method1677(local690 + local49, local222 + local690, 1, local562);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local49 += arg2;
					for (local92 = 0; local92 < local15; local92++) {
						local105 = (arg4 * local92 >> 16) + arg1;
						local117 = arg1 + (arg4 * (local92 + 1) >> 16);
						if (Static267.aClass8_Sub1_Sub2_2.anInt648 != -1) {
							local125 = Static267.aClass8_Sub1_Sub2_2.anInt648;
						} else if ((local92 + arg0 & 0x4) == (local38 + arg3 & 0x4)) {
							local125 = Static247.anIntArray475[Static191.anInt3845 + 1];
						} else {
							local125 = 4936552;
						}
						if (local125 == 0) {
							local125 = 1;
						}
						local162 = local117 - local105;
						Static103.method1664(local49, local105, local65, local162, local125);
					}
				}
			}
		}
		for (@Pc(816) int local816 = -2; local816 < local10 + 2; local816++) {
			local38 = local816 * arg7 >> 16;
			local49 = (local816 + 1) * arg7 >> 16;
			local60 = local49 - local38;
			if (local60 > 0) {
				local38 += arg2;
				local65 = arg3 + local816 >> 6;
				if (local65 >= 0 && local65 <= Static16.anIntArrayArrayArray8.length - 1) {
					@Pc(887) int[][] local887 = Static16.anIntArrayArrayArray8[local65];
					for (local92 = -2; local92 < local15 + 2; local92++) {
						local125 = arg4 * local92 >> 16;
						local105 = arg4 * (local92 + 1) >> 16;
						local117 = local105 - local125;
						if (local117 > 0) {
							local125 += arg1;
							local162 = arg0 + local92 >> 6;
							if (local162 >= 0 && local887.length - 1 >= local162) {
								@Pc(965) int local965 = ((arg0 + local92 & 0x3F) << 6) + (local816 + arg3 & 0x3F);
								if (local887[local162] != null) {
									local207 = local887[local162][local965];
									local222 = local207 & 0x1FFF;
									if (local222 != 0) {
										local237 = local207 >> 13 & 0x3;
										@Pc(998) Class52 local998 = Static156.method2488(local222 - 1);
										@Pc(1011) boolean local1011 = (local207 >> 15 & 0x1) == 1;
										@Pc(1017) Class43_Sub2 local1017 = local998.method1150(local1011, local237);
										if (local1017 != null) {
											local270 = local60 * local1017.anInt5710 / 4;
											local276 = local117 * local1017.anInt5709 / 4;
											if (local998.aBoolean111) {
												local313 = local207 >> 16 & 0xF;
												local382 = local207 >> 20 & 0xF;
												if ((local237 & 0x1) == 1) {
													local237 = local313;
													local313 = local382;
													local382 = local237;
												}
												local270 = local313 * local60;
												local276 = local117 * local382;
											}
											if (local270 != 0 && local276 != 0) {
												if (local998.anInt1570 == 0) {
													local1017.method4311(local38, local125 + local117 - local276, local270, local276);
												} else {
													local1017.method4302(local38, local125 + local117 - local276, local270, local276, local998.anInt1570);
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
	}
}
