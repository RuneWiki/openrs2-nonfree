import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!h", name = "G", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	public static int anInt2491;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "I")
	public static int anInt2492 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZILclient!dr;Lclient!ek;IIZIIBIII)V")
	public static void method2301(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (!Static230.method4872() && !Static32.method438(arg9, arg4, Static30.anInt483, arg10)) {
			return;
		}
		if (Static306.anInt4214 > arg10) {
			Static306.anInt4214 = arg10;
		}
		@Pc(29) Class74 local29 = Static228.method4210(arg5);
		if (Static114.anInt2421 == 1 && local29.aBoolean197) {
			return;
		}
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (arg1 == 1 || arg1 == 3) {
			local55 = local29.anInt2094;
			local58 = local29.anInt2048;
		} else {
			local55 = local29.anInt2048;
			local58 = local29.anInt2094;
		}
		@Pc(90) int local90;
		@Pc(84) int local84;
		if (Static66.anInt1177 >= arg9 + local58) {
			local84 = arg9 + (local58 + 1 >> 1);
			local90 = arg9 + (local58 >> 1);
		} else {
			local90 = arg9;
			local84 = arg9 + 1;
		}
		@Pc(119) int local119;
		@Pc(112) int local112;
		if (Static12.anInt213 >= arg4 + local55) {
			local112 = arg4 + (local55 + 1 >> 1);
			local119 = arg4 + (local55 >> 1);
		} else {
			local119 = arg4;
			local112 = arg4 + 1;
		}
		@Pc(131) Class105 local131 = Static9.aClass105Array1[arg7];
		@Pc(154) int local154 = local131.method4453(local90, local119) + local131.method4453(local84, local119) + local131.method4453(local90, local112) + local131.method4453(local84, local112) >> 2;
		@Pc(163) int local163 = (arg9 << 7) + (local58 << 6);
		@Pc(171) int local171 = (local55 << 6) + (arg4 << 7);
		@Pc(182) boolean local182 = arg0 && !arg6 && local29.aBoolean192;
		if (local29.method2009()) {
			Static177.method3424(arg1, null, arg10, local29, arg4, arg9, null);
		}
		@Pc(216) boolean local216 = arg8 == -1 && local29.anInt2050 == -1 && local29.anIntArray160 == null && local29.anIntArray161 == null && !local29.aBoolean195;
		if (Static363.aBoolean619 && local29.anInt2098 != 1) {
			return;
		}
		if (arg11 != 22) {
			@Pc(341) Class1_Sub2 local341;
			@Pc(310) Class1_Sub2_Sub4 local310;
			@Pc(347) int local347;
			@Pc(405) int local405;
			if (arg11 == 10 || arg11 == 11) {
				local310 = null;
				if (local216) {
					@Pc(339) Class1_Sub2_Sub4 local339 = new Class1_Sub2_Sub4(arg2, local29, arg10, arg7, local163, local154, local171, arg6, arg9, arg9 + local58 - 1, arg4, local55 + arg4 - 1, arg11, arg1, local182);
					local341 = local339;
					local310 = local339;
					local347 = local339.method3002();
				} else {
					local347 = 15;
					local341 = new Class1_Sub2_Sub1(arg2, local29, arg11, arg1, arg10, arg7, local163, local154, local171, arg6, arg9, local58 + arg9 - 1, arg4, arg4 + local55 - 1, arg8);
				}
				if (Static342.method5581(local341, false)) {
					if (local310 != null && local310.method5497()) {
						local310.method5498(arg2);
					}
					if (local29.aBoolean193 && arg0) {
						if (local347 > 30) {
							local347 = 30;
						}
						for (local405 = 0; local405 <= local58; local405++) {
							for (@Pc(409) int local409 = 0; local409 <= local55; local409++) {
								local131.method4457(local405 + arg9, arg4 + local409, local347);
							}
						}
					}
				}
				if (local29.anInt2064 != 0 && arg3 != null) {
					arg3.method1615(local55, local29.aBoolean200, local58, arg9, !local29.aBoolean190, arg4);
				}
			} else if (arg11 >= 12 && arg11 <= 17 || arg11 >= 18 && arg11 <= 21) {
				if (local216) {
					local310 = new Class1_Sub2_Sub4(arg2, local29, arg10, arg7, local163, local154, local171, arg6, arg9, arg9 + local58 - 1, arg4, arg4 + local55 - 1, arg11, arg1, local182);
					if (local310.method5497()) {
						local310.method5498(arg2);
					}
					local341 = local310;
				} else {
					local341 = new Class1_Sub2_Sub1(arg2, local29, arg11, arg1, arg10, arg7, local163, local154, local171, arg6, arg9, local58 + arg9 - 1, arg4, local55 + arg4 - 1, arg8);
				}
				Static342.method5581(local341, false);
				if (arg0 && !arg6 && arg11 >= 12 && arg11 <= 17 && arg11 != 13 && arg10 > 0 && local29.anInt2098 != 0) {
					Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x4);
				}
				if (local29.anInt2064 != 0 && arg3 != null) {
					arg3.method1615(local55, local29.aBoolean200, local58, arg9, !local29.aBoolean190, arg4);
				}
			} else {
				@Pc(641) Class1_Sub1_Sub2 local641;
				@Pc(625) Class1_Sub1 local625;
				if (arg11 == 0) {
					if (local216) {
						local641 = new Class1_Sub1_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg11, arg1, local182);
						local625 = local641;
						if (local641.method5497()) {
							local641.method5498(arg2);
						}
					} else {
						local625 = new Class1_Sub1_Sub1(arg2, local29, 0, arg1, arg10, arg7, local163, local154, local171, arg6, arg8);
					}
					Static321.method1019(arg10, arg9, arg4, local625, null);
					if (arg0) {
						if (arg1 == 0) {
							if (local29.aBoolean193) {
								local131.method4457(arg9, arg4, 50);
								local131.method4457(arg9, arg4 + 1, 50);
							}
							if (local29.anInt2098 == 1 && !arg6) {
								Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x1);
							}
						} else if (arg1 == 1) {
							if (local29.aBoolean193) {
								local131.method4457(arg9, arg4 + 1, 50);
								local131.method4457(arg9 + 1, arg4 + 1, 50);
							}
							if (local29.anInt2098 == 1 && !arg6) {
								Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] | 0x2);
							}
						} else if (arg1 == 2) {
							if (local29.aBoolean193) {
								local131.method4457(arg9 + 1, arg4, 50);
								local131.method4457(arg9 + 1, arg4 - -1, 50);
							}
							if (local29.anInt2098 == 1 && !arg6) {
								Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] | 0x1);
							}
						} else if (arg1 == 3) {
							if (local29.aBoolean193) {
								local131.method4457(arg9, arg4, 50);
								local131.method4457(arg9 + 1, arg4, 50);
							}
							if (local29.anInt2098 == 1 && !arg6) {
								Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x2);
							}
						}
					}
					if (local29.anInt2064 != 0 && arg3 != null) {
						arg3.method1609(arg1, arg9, arg11, !local29.aBoolean190, local29.aBoolean200, arg4);
					}
					if (local29.anInt2097 != 16) {
						Static269.method5570(arg10, arg9, arg4, local29.anInt2097);
					}
				} else if (arg11 == 1) {
					if (local216) {
						local641 = new Class1_Sub1_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg11, arg1, local182);
						local625 = local641;
						if (local641.method5497()) {
							local641.method5498(arg2);
						}
					} else {
						local625 = new Class1_Sub1_Sub1(arg2, local29, 1, arg1, arg10, arg7, local163, local154, local171, arg6, arg8);
					}
					Static321.method1019(arg10, arg9, arg4, local625, null);
					if (local29.aBoolean193 && arg0) {
						if (arg1 == 0) {
							local131.method4457(arg9, arg4 + 1, 50);
						} else if (arg1 == 1) {
							local131.method4457(arg9 + 1, arg4 + 1, 50);
						} else if (arg1 == 2) {
							local131.method4457(arg9 + 1, arg4, 50);
						} else if (arg1 == 3) {
							local131.method4457(arg9, arg4, 50);
						}
					}
					if (local29.anInt2064 != 0 && arg3 != null) {
						arg3.method1609(arg1, arg9, arg11, !local29.aBoolean190, local29.aBoolean200, arg4);
					}
				} else if (arg11 == 2) {
					local347 = arg1 + 1 & 0x3;
					@Pc(1090) Class1_Sub1 local1090;
					if (local216) {
						@Pc(1056) Class1_Sub1_Sub2 local1056 = new Class1_Sub1_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg11, arg1 + 4, local182);
						@Pc(1070) Class1_Sub1_Sub2 local1070 = new Class1_Sub1_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg11, local347, local182);
						if (local1056.method5497()) {
							local1056.method5498(arg2);
						}
						local625 = local1056;
						if (local1070.method5497()) {
							local1070.method5498(arg2);
						}
						local1090 = local1070;
					} else {
						local625 = new Class1_Sub1_Sub1(arg2, local29, 2, arg1 + 4, arg10, arg7, local163, local154, local171, arg6, arg8);
						local1090 = new Class1_Sub1_Sub1(arg2, local29, 2, local347, arg10, arg7, local163, local154, local171, arg6, arg8);
					}
					Static321.method1019(arg10, arg9, arg4, local625, local1090);
					if (local29.anInt2098 == 1 && arg0 && !arg6) {
						if (arg1 == 0) {
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x1);
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] | 0x2);
						} else if (arg1 == 1) {
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4 + 1] | 0x2);
							Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] | 0x1);
						} else if (arg1 == 2) {
							Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9 + 1][arg4] | 0x1);
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x2);
						} else if (arg1 == 3) {
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x2);
							Static314.aByteArrayArrayArray11[arg10][arg9][arg4] = (byte) (Static314.aByteArrayArrayArray11[arg10][arg9][arg4] | 0x1);
						}
					}
					if (local29.anInt2064 != 0 && arg3 != null) {
						arg3.method1609(arg1, arg9, arg11, !local29.aBoolean190, local29.aBoolean200, arg4);
					}
					if (local29.anInt2097 != 16) {
						Static269.method5570(arg10, arg9, arg4, local29.anInt2097);
					}
				} else if (arg11 == 3) {
					if (local216) {
						local641 = new Class1_Sub1_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg11, arg1, local182);
						local625 = local641;
						if (local641.method5497()) {
							local641.method5498(arg2);
						}
					} else {
						local625 = new Class1_Sub1_Sub1(arg2, local29, 3, arg1, arg10, arg7, local163, local154, local171, arg6, arg8);
					}
					Static321.method1019(arg10, arg9, arg4, local625, null);
					if (local29.aBoolean193 && arg0) {
						if (arg1 == 0) {
							local131.method4457(arg9, arg4 + 1, 50);
						} else if (arg1 == 1) {
							local131.method4457(arg9 + 1, arg4 - -1, 50);
						} else if (arg1 == 2) {
							local131.method4457(arg9 + 1, arg4, 50);
						} else if (arg1 == 3) {
							local131.method4457(arg9, arg4, 50);
						}
					}
					if (local29.anInt2064 != 0 && arg3 != null) {
						arg3.method1609(arg1, arg9, arg11, !local29.aBoolean190, local29.aBoolean200, arg4);
					}
				} else if (arg11 == 9) {
					if (local216) {
						local310 = new Class1_Sub2_Sub4(arg2, local29, arg10, arg7, local163, local154, local171, arg6, arg9, arg9, arg4, arg4, arg11, arg1, local182);
						local341 = local310;
						if (local310.method5497()) {
							local310.method5498(arg2);
						}
					} else {
						local341 = new Class1_Sub2_Sub1(arg2, local29, arg11, arg1, arg10, arg7, local163, local154, local171, arg6, arg9, arg9 + local58 - 1, arg4, arg4 + local55 - 1, arg8);
					}
					Static342.method5581(local341, false);
					if (local29.anInt2064 != 0 && arg3 != null) {
						arg3.method1615(local55, local29.aBoolean200, local58, arg9, !local29.aBoolean190, arg4);
					}
					if (local29.anInt2097 != 16) {
						Static269.method5570(arg10, arg9, arg4, local29.anInt2097);
					}
				} else {
					@Pc(1596) Class1_Sub3 local1596;
					if (arg11 == 4) {
						if (local216) {
							@Pc(1614) Class1_Sub3_Sub3 local1614 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, 0, 0, 0, arg11, arg1);
							if (local1614.method5497()) {
								local1614.method5498(arg2);
							}
							local1596 = local1614;
						} else {
							local1596 = new Class1_Sub3_Sub2(arg2, local29, arg11, arg1, arg10, arg7, local163, local154, local171, arg6, 0, 0, 0, arg8);
						}
						Static279.method3545(arg10, arg9, arg4, local1596, null);
					} else {
						@Pc(1636) int local1636;
						@Pc(1642) Interface8 local1642;
						@Pc(1705) Class1_Sub3_Sub3 local1705;
						if (arg11 == 5) {
							local1636 = 16;
							local1642 = (Interface8) Static356.method5687(arg10, arg9, arg4);
							if (local1642 != null) {
								local1636 = Static228.method4210(local1642.method5502()).anInt2097;
							}
							if (local216) {
								local1705 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, 0, local1636 * Static129.anIntArray223[arg1], local1636 * Static276.anIntArray438[arg1], arg11, arg1);
								local1596 = local1705;
								if (local1705.method5497()) {
									local1705.method5498(arg2);
								}
							} else {
								local1596 = new Class1_Sub3_Sub2(arg2, local29, arg11, arg1, arg10, arg7, local163, local154, local171, arg6, 0, local1636 * Static129.anIntArray223[arg1], local1636 * Static276.anIntArray438[arg1], arg8);
							}
							Static279.method3545(arg10, arg9, arg4, local1596, null);
						} else if (arg11 == 6) {
							local1636 = 8;
							local1642 = (Interface8) Static356.method5687(arg10, arg9, arg4);
							if (local1642 != null) {
								local1636 = Static228.method4210(local1642.method5502()).anInt2097 / 2;
							}
							if (local216) {
								local1705 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, arg1, Static129.anIntArray223[arg1] * local1636, Static276.anIntArray438[arg1] * local1636, arg11, arg1 + 4);
								if (local1705.method5497()) {
									local1705.method5498(arg2);
								}
								local1596 = local1705;
							} else {
								local1596 = new Class1_Sub3_Sub2(arg2, local29, arg11, arg1 + 4, arg10, arg7, local163, local154, local171, arg6, arg1, Static342.anIntArray508[arg1] * local1636, local1636 * Static108.anIntArray178[arg1], arg8);
							}
							Static279.method3545(arg10, arg9, arg4, local1596, null);
						} else if (arg11 == 7) {
							local1636 = arg1 + 2 & 0x3;
							if (local216) {
								@Pc(1870) Class1_Sub3_Sub3 local1870 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, local1636, 0, 0, arg11, local1636 + 4);
								if (local1870.method5497()) {
									local1870.method5498(arg2);
								}
								local1596 = local1870;
							} else {
								local1596 = new Class1_Sub3_Sub2(arg2, local29, arg11, local1636 + 4, arg10, arg7, local163, local154, local171, arg6, local1636, 0, 0, arg8);
							}
							Static279.method3545(arg10, arg9, arg4, local1596, null);
						} else if (arg11 == 8) {
							local347 = arg1 + 2 & 0x3;
							local405 = 8;
							@Pc(1904) Interface8 local1904 = (Interface8) Static356.method5687(arg10, arg9, arg4);
							if (local1904 != null) {
								local405 = Static228.method4210(local1904.method5502()).anInt2097 / 2;
							}
							@Pc(1945) Class1_Sub3 local1945;
							@Pc(1967) Class1_Sub3 local1967;
							if (local216) {
								local1945 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, arg1, Static342.anIntArray508[arg1] * local405, local405 * Static108.anIntArray178[arg1], arg11, arg1 + 4);
								local1967 = new Class1_Sub3_Sub3(arg2, local29, arg7, local163, local154, local171, arg6, arg1, 0, 0, arg11, local347 + 4);
								if (local1945.method5497()) {
									local1945.method5498(arg2);
								}
								if (local1967.method5497()) {
									local1967.method5498(arg2);
								}
							} else {
								local1945 = new Class1_Sub3_Sub2(arg2, local29, arg11, arg1 + 4, arg10, arg7, local163, local154, local171, arg6, arg1, local405 * Static342.anIntArray508[arg1], Static108.anIntArray178[arg1] * local405, arg8);
								local1967 = new Class1_Sub3_Sub2(arg2, local29, arg11, local347 + 4, arg10, arg7, local163, local154, local171, arg6, arg1, 0, 0, arg8);
							}
							Static279.method3545(arg10, arg9, arg4, local1945, local1967);
						}
					}
				}
			}
		} else if (Static146.aBoolean287 || local29.anInt2086 != 0 || local29.anInt2064 == 1 || local29.aBoolean199) {
			@Pc(267) Class1_Sub4 local267;
			if (local216) {
				@Pc(257) Class1_Sub4_Sub2 local257 = new Class1_Sub4_Sub2(arg2, local29, arg7, local163, local154, local171, arg6, arg1, local182);
				if (local257.method5497()) {
					local257.method5498(arg2);
				}
				local267 = local257;
			} else {
				local267 = new Class1_Sub4_Sub1(arg2, local29, arg1, arg10, arg7, local163, local154, local171, arg6, arg8);
			}
			Static129.method2511(arg10, arg9, arg4, local267);
			if (local29.anInt2064 == 1 && arg3 != null) {
				arg3.method1612(arg9, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(III)Z")
	public static boolean method2302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static46.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static2.anInt57) {
			return false;
		} else if (local7 == Static2.anInt57) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static325.anInt6336;
			@Pc(26) int local26 = arg2 << Static325.anInt6336;
			if (Static283.method4806(local22 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg2), local26 + 1) && Static283.method4806(local22 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg2), local26 + 1) && Static283.method4806(local22 + Static6.anInt96 - 1, Static9.aClass105Array1[arg0].method4453(arg1 + 1, arg2 + 1), local26 + Static6.anInt96 - 1) && Static283.method4806(local22 + 1, Static9.aClass105Array1[arg0].method4453(arg1, arg2 + 1), local26 + Static6.anInt96 - 1)) {
				Static46.anIntArrayArrayArray3[arg0][arg1][arg2] = Static2.anInt57;
				return true;
			} else {
				Static46.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static2.anInt57;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(III)I")
	public static int method2303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method2304() {
		Static186.aClass107_20.method3015();
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method2305() {
		for (@Pc(7) int local7 = 0; local7 < Static159.anInt2743; local7++) {
			@Pc(13) int local13 = Static281.anIntArray443[local7];
			@Pc(17) Class1_Sub2_Sub3_Sub2 local17 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static273.aClass2_Sub12_Sub2_3.method3124();
			if ((local21 & 0x40) != 0) {
				local21 += Static273.aClass2_Sub12_Sub2_3.method3124() << 8;
			}
			@Pc(41) int local41;
			@Pc(58) int local58;
			if ((local21 & 0x400) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3146();
				@Pc(44) int[] local44 = new int[local41];
				@Pc(47) int[] local47 = new int[local41];
				@Pc(50) int[] local50 = new int[local41];
				for (@Pc(52) int local52 = 0; local52 < local41; local52++) {
					local58 = Static273.aClass2_Sub12_Sub2_3.method3104();
					if (local58 == 65535) {
						local58 = -1;
					}
					local44[local52] = local58;
					local47[local52] = Static273.aClass2_Sub12_Sub2_3.method3132();
					local50[local52] = Static273.aClass2_Sub12_Sub2_3.method3109();
				}
				Static257.method4520(local50, local44, local47, local17);
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt6916 = Static273.aClass2_Sub12_Sub2_3.method3109();
				if (local17.anInt6916 == 65535) {
					local17.anInt6916 = -1;
				}
			}
			if ((local21 & 0x1) != 0) {
				if (local17.aClass139_1.method4126()) {
					Static282.method4799(local17);
				}
				local17.method5790(Static90.method1809(Static273.aClass2_Sub12_Sub2_3.method3099()));
				local17.method5782(local17.aClass139_1.anInt4778);
				local17.anInt6919 = local17.aClass139_1.anInt4805 << 3;
				if (local17.aClass139_1.method4126()) {
					Static177.method3424(0, null, local17.aByte77, null, local17.anIntArray534[0], local17.anIntArray535[0], local17);
				}
			}
			if ((local21 & 0x2) != 0) {
				local17.aString73 = Static273.aClass2_Sub12_Sub2_3.method3113();
				local17.anInt6936 = 100;
			}
			@Pc(207) int local207;
			if ((local21 & 0x20) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3153();
				local207 = Static273.aClass2_Sub12_Sub2_3.method3140();
				local17.method5779(local41, Static6.anInt91, local207);
				local17.anInt6935 = Static6.anInt91 + 300;
				local17.anInt6923 = Static273.aClass2_Sub12_Sub2_3.method3140();
			}
			if ((local21 & 0x80) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3153();
				local207 = Static273.aClass2_Sub12_Sub2_3.method3140();
				local17.method5779(local41, Static6.anInt91, local207);
			}
			if ((local21 & 0x200) != 0) {
				local17.anInt6982 = Static273.aClass2_Sub12_Sub2_3.method3104();
				local17.anInt6978 = Static273.aClass2_Sub12_Sub2_3.method3109();
			}
			if ((local21 & 0x100) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3104();
				local17.anInt6938 = Static273.aClass2_Sub12_Sub2_3.method3146();
				local17.anInt6913 = Static273.aClass2_Sub12_Sub2_3.method3146();
				local17.aBoolean616 = (local41 & 0x8000) != 0;
				local17.anInt6920 = local41 & 0x7FFF;
				local17.anInt6924 = Static6.anInt91 + local17.anInt6920 + local17.anInt6938;
			}
			if ((local21 & 0x10) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3116();
				local207 = Static273.aClass2_Sub12_Sub2_3.method3148();
				if (local41 == 65535) {
					local41 = -1;
				}
				@Pc(321) boolean local321 = true;
				@Pc(350) Class84 local350;
				if (local41 != -1 && local17.anInt6902 != -1) {
					@Pc(338) Class177 local338;
					if (local41 == local17.anInt6902) {
						local338 = Static41.method4707(local41);
						if (local338.aBoolean516 && local338.anInt5808 != -1) {
							local350 = Static91.method1822(local338.anInt5808);
							local58 = local350.anInt2456;
							if (local58 == 0) {
								local321 = false;
							} else if (local58 == 1) {
								local321 = true;
							} else if (local58 == 2) {
								local321 = false;
								local17.anInt6908 = 0;
							}
						}
					} else {
						local338 = Static41.method4707(local41);
						@Pc(388) Class177 local388 = Static41.method4707(local17.anInt6902);
						if (local338.anInt5808 != -1 && local388.anInt5808 != -1) {
							@Pc(402) Class84 local402 = Static91.method1822(local338.anInt5808);
							@Pc(407) Class84 local407 = Static91.method1822(local388.anInt5808);
							if (local407.anInt2459 > local402.anInt2459) {
								local321 = false;
							}
						}
					}
				}
				if (local321) {
					local17.anInt6898 = 0;
					local17.anInt6902 = local41;
					local17.anInt6946 = local207 >> 16;
					local17.anInt6957 = 1;
					local17.anInt6948 = Static6.anInt91 + (local207 & 0xFFFF);
					local17.anInt6945 = 0;
					if (Static6.anInt91 < local17.anInt6948) {
						local17.anInt6898 = -1;
					}
					if (local17.anInt6902 != -1 && local17.anInt6948 == Static6.anInt91) {
						@Pc(474) int local474 = Static41.method4707(local17.anInt6902).anInt5808;
						if (local474 != -1) {
							local350 = Static91.method1822(local474);
							if (local350 != null && local350.anIntArray197 != null) {
								Static41.method4705(false, 0, local17.anInt6888, local17.anInt6893, local350, local17.aByte77);
							}
						}
					}
				}
			}
			if ((local21 & 0x4) != 0) {
				local41 = Static273.aClass2_Sub12_Sub2_3.method3104();
				if (local41 == 65535) {
					local41 = -1;
				}
				local207 = Static273.aClass2_Sub12_Sub2_3.method3140();
				Static214.method4057(local41, local17, local207);
			}
		}
	}
}
