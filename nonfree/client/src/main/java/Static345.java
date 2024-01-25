import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!on;")
	public static final Class154 aClass154_9 = new Class154(64);

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt6528 = 0;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt6530 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!u;")
	public static Class187_Sub1 method5562() {
		return Static272.aClass187_Sub1Array2.length > Static235.anInt4668 ? Static272.aClass187_Sub1Array2[Static235.anInt4668++] : null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!oa;IZLclient!pe;IIIIIZI)V")
	public static void method5563(@OriginalArg(1) int arg0, @OriginalArg(2) Class149 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class89 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static105.method5089() && !Static215.method3801(arg11, arg6, arg2, Static75.anInt1865)) {
			return;
		}
		if (Static45.anInt1289 > arg2) {
			Static45.anInt1289 = arg2;
		}
		@Pc(27) Class122 local27 = Static245.method4227(arg8);
		if (Static329.anInt6220 == 1 && local27.aBoolean264) {
			return;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (arg5 == 1 || arg5 == 3) {
			local52 = local27.anInt3562;
			local49 = local27.anInt3527;
		} else {
			local49 = local27.anInt3562;
			local52 = local27.anInt3527;
		}
		@Pc(82) int local82;
		@Pc(76) int local76;
		if (local49 + arg11 <= Static15.anInt287) {
			local76 = (local49 + 1 >> 1) + arg11;
			local82 = arg11 + (local49 >> 1);
		} else {
			local82 = arg11;
			local76 = arg11 + 1;
		}
		@Pc(97) int local97;
		@Pc(101) int local101;
		if (Static325.anInt6173 < arg6 + local52) {
			local97 = arg6;
			local101 = arg6 + 1;
		} else {
			local97 = arg6 + (local52 >> 1);
			local101 = arg6 + (local52 + 1 >> 1);
		}
		@Pc(121) Class8 local121 = Static331.aClass8Array5[arg0];
		@Pc(145) int local145 = local121.method4173(local82, local97) + local121.method4173(local76, local97) + local121.method4173(local82, local101) + local121.method4173(local76, local101) >> 2;
		@Pc(153) int local153 = (local49 << 6) + (arg11 << 7);
		@Pc(162) int local162 = (arg6 << 7) + (local52 << 6);
		@Pc(173) boolean local173 = arg10 && !arg3 && local27.aBoolean275;
		if (local27.method3228()) {
			Static339.method5516(null, arg11, arg2, null, local27, arg6, arg5);
		}
		@Pc(207) boolean local207 = arg9 == -1 && local27.anInt3523 == -1 && local27.anIntArray474 == null && local27.anIntArray481 == null && !local27.aBoolean261;
		if (Static63.aBoolean406 && local27.anInt3554 != 1) {
			return;
		}
		if (arg7 != 22) {
			@Pc(333) Class22_Sub2 local333;
			@Pc(303) Class22_Sub2_Sub5 local303;
			@Pc(335) int local335;
			@Pc(402) int local402;
			if (arg7 == 10 || arg7 == 11) {
				local303 = null;
				if (local207) {
					@Pc(363) Class22_Sub2_Sub5 local363 = new Class22_Sub2_Sub5(arg4, local27, arg2, arg0, local153, local145, local162, arg3, arg11, local49 + arg11 - 1, arg6, arg6 + local52 - 1, arg7, arg5, local173);
					local333 = local363;
					local335 = local363.method5073();
					local303 = local363;
				} else {
					local333 = new Class22_Sub2_Sub3(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, arg11, arg11 + local49 - 1, arg6, local52 + arg6 - 1, arg9);
					local335 = 15;
				}
				if (Static235.method4081(local333, false, !arg10)) {
					if (local303 != null && local303.method5363()) {
						local303.method5365(arg4);
					}
					if (local27.aBoolean267 && arg10) {
						if (local335 > 30) {
							local335 = 30;
						}
						for (local402 = 0; local402 <= local49; local402++) {
							for (@Pc(405) int local405 = 0; local405 <= local52; local405++) {
								local121.method4172(arg11 + local402, local405 + arg6, local335);
							}
						}
					}
				}
				if (local27.anInt3570 != 0 && arg1 != null) {
					arg1.method3947(!local27.aBoolean266, arg11, local49, local52, local27.aBoolean270, arg6);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local207) {
					local303 = new Class22_Sub2_Sub5(arg4, local27, arg2, arg0, local153, local145, local162, arg3, arg11, arg11 + local49 - 1, arg6, arg6 + local52 - 1, arg7, arg5, local173);
					local333 = local303;
					if (local303.method5363()) {
						local303.method5365(arg4);
					}
				} else {
					local333 = new Class22_Sub2_Sub3(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, arg11, local49 + arg11 - 1, arg6, arg6 + local52 - 1, arg9);
				}
				Static235.method4081(local333, false, !arg10);
				if (arg10 && !arg3 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0 && local27.anInt3554 != 0) {
					Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x4);
				}
				if (local27.anInt3570 != 0 && arg1 != null) {
					arg1.method3947(!local27.aBoolean266, arg11, local49, local52, local27.aBoolean270, arg6);
				}
			} else {
				@Pc(624) Class22_Sub4_Sub1 local624;
				@Pc(634) Class22_Sub4 local634;
				if (arg7 == 0) {
					if (local207) {
						local624 = new Class22_Sub4_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg7, arg5, local173);
						if (local624.method5363()) {
							local624.method5365(arg4);
						}
						local634 = local624;
					} else {
						local634 = new Class22_Sub4_Sub2(arg4, local27, 0, arg5, arg2, arg0, local153, local145, local162, arg3, arg9);
					}
					Static163.method3124(arg2, arg11, arg6, local634, null);
					if (arg10) {
						if (arg5 == 0) {
							if (local27.aBoolean267) {
								local121.method4172(arg11, arg6, 50);
								local121.method4172(arg11, arg6 + 1, 50);
							}
							if (local27.anInt3554 == 1 && !arg3) {
								Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x1);
							}
						} else if (arg5 == 1) {
							if (local27.aBoolean267) {
								local121.method4172(arg11, arg6 + 1, 50);
								local121.method4172(arg11 + 1, arg6 + 1, 50);
							}
							if (local27.anInt3554 == 1 && !arg3) {
								Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] | 0x2);
							}
						} else if (arg5 == 2) {
							if (local27.aBoolean267) {
								local121.method4172(arg11 + 1, arg6, 50);
								local121.method4172(arg11 + 1, arg6 + 1, 50);
							}
							if (local27.anInt3554 == 1 && !arg3) {
								Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] | 0x1);
							}
						} else if (arg5 == 3) {
							if (local27.aBoolean267) {
								local121.method4172(arg11, arg6, 50);
								local121.method4172(arg11 + 1, arg6, 50);
							}
							if (local27.anInt3554 == 1 && !arg3) {
								Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x2);
							}
						}
					}
					if (local27.anInt3570 != 0 && arg1 != null) {
						arg1.method3959(arg5, !local27.aBoolean266, local27.aBoolean270, arg11, arg7, arg6);
					}
					if (local27.anInt3546 != 16) {
						Static341.method5539(arg2, arg11, arg6, local27.anInt3546);
					}
				} else if (arg7 == 1) {
					if (local207) {
						local624 = new Class22_Sub4_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg7, arg5, local173);
						if (local624.method5363()) {
							local624.method5365(arg4);
						}
						local634 = local624;
					} else {
						local634 = new Class22_Sub4_Sub2(arg4, local27, 1, arg5, arg2, arg0, local153, local145, local162, arg3, arg9);
					}
					Static163.method3124(arg2, arg11, arg6, local634, null);
					if (local27.aBoolean267 && arg10) {
						if (arg5 == 0) {
							local121.method4172(arg11, arg6 + 1, 50);
						} else if (arg5 == 1) {
							local121.method4172(arg11 + 1, arg6 + 1, 50);
						} else if (arg5 == 2) {
							local121.method4172(arg11 + 1, arg6, 50);
						} else if (arg5 == 3) {
							local121.method4172(arg11, arg6, 50);
						}
					}
					if (local27.anInt3570 != 0 && arg1 != null) {
						arg1.method3959(arg5, !local27.aBoolean266, local27.aBoolean270, arg11, arg7, arg6);
					}
				} else if (arg7 == 2) {
					local335 = arg5 + 1 & 0x3;
					@Pc(1068) Class22_Sub4 local1068;
					if (local207) {
						@Pc(1034) Class22_Sub4_Sub1 local1034 = new Class22_Sub4_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg7, arg5 + 4, local173);
						@Pc(1048) Class22_Sub4_Sub1 local1048 = new Class22_Sub4_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg7, local335, local173);
						if (local1034.method5363()) {
							local1034.method5365(arg4);
						}
						if (local1048.method5363()) {
							local1048.method5365(arg4);
						}
						local634 = local1034;
						local1068 = local1048;
					} else {
						local634 = new Class22_Sub4_Sub2(arg4, local27, 2, arg5 + 4, arg2, arg0, local153, local145, local162, arg3, arg9);
						local1068 = new Class22_Sub4_Sub2(arg4, local27, 2, local335, arg2, arg0, local153, local145, local162, arg3, arg9);
					}
					Static163.method3124(arg2, arg11, arg6, local634, local1068);
					if (local27.anInt3554 == 1 && arg10 && !arg3) {
						if (arg5 == 0) {
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x1);
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] | 0x2);
						} else if (arg5 == 1) {
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6 + 1] | 0x2);
							Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] | 0x1);
						} else if (arg5 == 2) {
							Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11 + 1][arg6] | 0x1);
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x2);
						} else if (arg5 == 3) {
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x2);
							Static220.aByteArrayArrayArray9[arg2][arg11][arg6] = (byte) (Static220.aByteArrayArrayArray9[arg2][arg11][arg6] | 0x1);
						}
					}
					if (local27.anInt3570 != 0 && arg1 != null) {
						arg1.method3959(arg5, !local27.aBoolean266, local27.aBoolean270, arg11, arg7, arg6);
					}
					if (local27.anInt3546 != 16) {
						Static341.method5539(arg2, arg11, arg6, local27.anInt3546);
					}
				} else if (arg7 == 3) {
					if (local207) {
						local624 = new Class22_Sub4_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg7, arg5, local173);
						local634 = local624;
						if (local624.method5363()) {
							local624.method5365(arg4);
						}
					} else {
						local634 = new Class22_Sub4_Sub2(arg4, local27, 3, arg5, arg2, arg0, local153, local145, local162, arg3, arg9);
					}
					Static163.method3124(arg2, arg11, arg6, local634, null);
					if (local27.aBoolean267 && arg10) {
						if (arg5 == 0) {
							local121.method4172(arg11, arg6 + 1, 50);
						} else if (arg5 == 1) {
							local121.method4172(arg11 + 1, arg6 + 1, 50);
						} else if (arg5 == 2) {
							local121.method4172(arg11 + 1, arg6, 50);
						} else if (arg5 == 3) {
							local121.method4172(arg11, arg6, 50);
						}
					}
					if (local27.anInt3570 != 0 && arg1 != null) {
						arg1.method3959(arg5, !local27.aBoolean266, local27.aBoolean270, arg11, arg7, arg6);
					}
				} else if (arg7 == 9) {
					if (local207) {
						local303 = new Class22_Sub2_Sub5(arg4, local27, arg2, arg0, local153, local145, local162, arg3, arg11, arg11, arg6, arg6, arg7, arg5, local173);
						if (local303.method5363()) {
							local303.method5365(arg4);
						}
						local333 = local303;
					} else {
						local333 = new Class22_Sub2_Sub3(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, arg11, local49 + arg11 - 1, arg6, local52 + arg6 - 1, arg9);
					}
					Static235.method4081(local333, false, !arg10);
					if (local27.anInt3570 != 0 && arg1 != null) {
						arg1.method3947(!local27.aBoolean266, arg11, local49, local52, local27.aBoolean270, arg6);
					}
					if (local27.anInt3546 != 16) {
						Static341.method5539(arg2, arg11, arg6, local27.anInt3546);
					}
				} else {
					@Pc(1588) Class22_Sub5 local1588;
					if (arg7 == 4) {
						if (local207) {
							@Pc(1578) Class22_Sub5_Sub1 local1578 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, 0, 0, 0, arg7, arg5);
							if (local1578.method5363()) {
								local1578.method5365(arg4);
							}
							local1588 = local1578;
						} else {
							local1588 = new Class22_Sub5_Sub2(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, 0, 0, 0, arg9);
						}
						Static141.method2855(arg2, arg11, arg6, local1588, null);
					} else {
						@Pc(1619) int local1619;
						@Pc(1625) Interface1 local1625;
						@Pc(1660) Class22_Sub5_Sub1 local1660;
						if (arg7 == 5) {
							local1619 = 16;
							local1625 = (Interface1) Static48.method4691(arg2, arg11, arg6);
							if (local1625 != null) {
								local1619 = Static245.method4227(local1625.method5362()).anInt3546;
							}
							if (local207) {
								local1660 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, 0, Static185.anIntArray510[arg5] * local1619, Static313.anIntArray753[arg5] * local1619, arg7, arg5);
								if (local1660.method5363()) {
									local1660.method5365(arg4);
								}
								local1588 = local1660;
							} else {
								local1588 = new Class22_Sub5_Sub2(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, 0, Static185.anIntArray510[arg5] * local1619, local1619 * Static313.anIntArray753[arg5], arg9);
							}
							Static141.method2855(arg2, arg11, arg6, local1588, null);
						} else if (arg7 == 6) {
							local1619 = 8;
							local1625 = (Interface1) Static48.method4691(arg2, arg11, arg6);
							if (local1625 != null) {
								local1619 = Static245.method4227(local1625.method5362()).anInt3546 / 2;
							}
							if (local207) {
								local1660 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg5, local1619 * Static185.anIntArray510[arg5], local1619 * Static313.anIntArray753[arg5], arg7, arg5 + 4);
								if (local1660.method5363()) {
									local1660.method5365(arg4);
								}
								local1588 = local1660;
							} else {
								local1588 = new Class22_Sub5_Sub2(arg4, local27, arg7, arg5 + 4, arg2, arg0, local153, local145, local162, arg3, arg5, local1619 * Static213.anIntArray581[arg5], Static254.anIntArray647[arg5] * local1619, arg9);
							}
							Static141.method2855(arg2, arg11, arg6, local1588, null);
						} else if (arg7 == 7) {
							local1619 = arg5 + 2 & 0x3;
							if (local207) {
								@Pc(1852) Class22_Sub5_Sub1 local1852 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, local1619, 0, 0, arg7, local1619 + 4);
								local1588 = local1852;
								if (local1852.method5363()) {
									local1852.method5365(arg4);
								}
							} else {
								local1588 = new Class22_Sub5_Sub2(arg4, local27, arg7, local1619 + 4, arg2, arg0, local153, local145, local162, arg3, local1619, 0, 0, arg9);
							}
							Static141.method2855(arg2, arg11, arg6, local1588, null);
						} else if (arg7 == 8) {
							local335 = arg5 + 2 & 0x3;
							local402 = 8;
							@Pc(1888) Interface1 local1888 = (Interface1) Static48.method4691(arg2, arg11, arg6);
							if (local1888 != null) {
								local402 = Static245.method4227(local1888.method5362()).anInt3546 / 2;
							}
							@Pc(1927) Class22_Sub5 local1927;
							@Pc(1945) Class22_Sub5 local1945;
							if (local207) {
								local1927 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg5, local402 * Static213.anIntArray581[arg5], local402 * Static254.anIntArray647[arg5], arg7, arg5 + 4);
								local1945 = new Class22_Sub5_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg5, 0, 0, arg7, local335 + 4);
								if (local1927.method5363()) {
									local1927.method5365(arg4);
								}
								if (local1945.method5363()) {
									local1945.method5365(arg4);
								}
							} else {
								local1927 = new Class22_Sub5_Sub2(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, arg5, Static213.anIntArray581[arg5] * local402, Static254.anIntArray647[arg5] * local402, arg9);
								local1945 = new Class22_Sub5_Sub2(arg4, local27, arg7, arg5, arg2, arg0, local153, local145, local162, arg3, arg5, 0, 0, arg9);
							}
							Static141.method2855(arg2, arg11, arg6, local1927, local1945);
						}
					}
				}
			}
		} else if (Static155.aBoolean244 || local27.anInt3560 != 0 || local27.anInt3570 == 1 || local27.aBoolean272) {
			@Pc(250) Class22_Sub1 local250;
			if (local207) {
				@Pc(264) Class22_Sub1_Sub1 local264 = new Class22_Sub1_Sub1(arg4, local27, arg0, local153, local145, local162, arg3, arg5, local173);
				local250 = local264;
				if (local264.method5363()) {
					local264.method5365(arg4);
				}
			} else {
				local250 = new Class22_Sub1_Sub2(arg4, local27, arg5, arg2, arg0, local153, local145, local162, arg3, arg9);
			}
			Static353.method2008(arg2, arg11, arg6, local250);
			if (local27.anInt3570 == 1 && arg1 != null) {
				arg1.method3961(arg6, arg11);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public static int method5564() {
		@Pc(11) Class103 local11 = Static283.aClass103_59;
		synchronized (Static283.aClass103_59) {
			return Static283.aClass103_59.method2681();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg6;
		@Pc(21) int local21 = arg2 - arg6;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(38) int local38 = local16 * local16;
		@Pc(42) int local42 = local21 * local21;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg2 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local30;
		@Pc(84) int local84 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = local38 * (1 - local66) + local54;
		@Pc(102) int local102 = local42 - (local66 - 1) * local58;
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = (local62 - 3) * local50;
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = local58 * (local66 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg2 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(196) int local196;
		@Pc(205) int local205;
		if (Static142.anInt3103 <= arg1 && Static314.anInt6030 >= arg1) {
			@Pc(168) int[] local168 = Static323.anIntArrayArray55[arg1];
			local177 = Static270.method4496(Static168.anInt3509, arg3 - arg4, Static61.anInt1534);
			local186 = Static270.method4496(Static168.anInt3509, arg3 + arg4, Static61.anInt1534);
			local196 = Static270.method4496(Static168.anInt3509, arg3 - local16, Static61.anInt1534);
			local205 = Static270.method4496(Static168.anInt3509, arg3 + local16, Static61.anInt1534);
			Static282.method4681(arg0, local177, local168, local196);
			Static282.method4681(arg5, local196, local168, local205);
			Static282.method4681(arg0, local205, local168, local186);
		}
		while (local9 > 0) {
			@Pc(236) boolean local236 = local21 >= local9;
			if (local236) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local11++;
						local148 += local118;
						local132 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local148 += local118;
					local132 += local118;
					local11++;
				}
				local102 += -local138;
				local93 += -local154;
				local154 -= local114;
				local138 -= local114;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local122;
					local84 += local140;
					local122 += local110;
					local7++;
					local140 += local110;
				}
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local140 += local110;
				local7++;
				local122 += local110;
			}
			local84 += -local128;
			local75 += -local146;
			local128 -= local106;
			local9--;
			local146 -= local106;
			local177 = arg1 - local9;
			local186 = arg1 + local9;
			if (local186 >= Static142.anInt3103 && Static314.anInt6030 >= local177) {
				local196 = Static270.method4496(Static168.anInt3509, arg3 + local7, Static61.anInt1534);
				local205 = Static270.method4496(Static168.anInt3509, arg3 - local7, Static61.anInt1534);
				if (local236) {
					@Pc(409) int local409 = Static270.method4496(Static168.anInt3509, local11 + arg3, Static61.anInt1534);
					@Pc(418) int local418 = Static270.method4496(Static168.anInt3509, arg3 - local11, Static61.anInt1534);
					@Pc(429) int[] local429;
					if (Static142.anInt3103 <= local177) {
						local429 = Static323.anIntArrayArray55[local177];
						Static282.method4681(arg0, local205, local429, local418);
						Static282.method4681(arg5, local418, local429, local409);
						Static282.method4681(arg0, local409, local429, local196);
					}
					if (Static314.anInt6030 >= local186) {
						local429 = Static323.anIntArrayArray55[local186];
						Static282.method4681(arg0, local205, local429, local418);
						Static282.method4681(arg5, local418, local429, local409);
						Static282.method4681(arg0, local409, local429, local196);
					}
				} else {
					if (Static142.anInt3103 <= local177) {
						Static282.method4681(arg0, local205, Static323.anIntArrayArray55[local177], local196);
					}
					if (local186 <= Static314.anInt6030) {
						Static282.method4681(arg0, local205, Static323.anIntArrayArray55[local186], local196);
					}
				}
			}
		}
	}
}
