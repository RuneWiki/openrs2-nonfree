import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "S")
	public static short aShort121 = 320;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)V")
	public static void method8462(@OriginalArg(0) byte arg0) {
		if (Static558.aByteArrayArrayArray18 == null) {
			Static558.aByteArrayArrayArray18 = new byte[4][Static224.anInt3557][Static267.anInt4309];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static224.anInt3557; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static267.anInt4309; local30++) {
					Static558.aByteArrayArrayArray18[local22][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!er;[[B)V")
	public static void method8463(@OriginalArg(1) Class100_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2544; local14++) {
			Static253.method3677();
			for (local20 = 0; local20 < Static224.anInt3557 >> 3; local20++) {
				for (local24 = 0; local24 < Static267.anInt4309 >> 3; local24++) {
					local34 = Static418.anIntArrayArrayArray17[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean182 || local43 == 0) {
							@Pc(57) int local57 = local34 >> 1 & 0x3;
							@Pc(63) int local63 = local34 >> 14 & 0x3FF;
							@Pc(69) int local69 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local63 / 8 << 8) + (local69 / 8);
							for (@Pc(82) int local82 = 0; local82 < Static472.anIntArray505.length; local82++) {
								if (local80 == Static472.anIntArray505[local82] && arg1[local82] != null) {
									@Pc(100) Class4_Sub11 local100 = new Class4_Sub11(arg1[local82]);
									arg0.method2456(local43, local63, local69, local24 * 8, local20 * 8, local57, local14, Static263.aClass389Array1, local100);
									arg0.method2469(Static582.aClass33_13, local43, local20 * 8, local69, local14, local12[0] == -1 ? local12 : null, local24 * 8, local57, local100, local63);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt2544; local20++) {
			Static253.method3677();
			for (local24 = 0; local24 < Static224.anInt3557 >> 3; local24++) {
				for (local34 = 0; local34 < Static267.anInt4309 >> 3; local34++) {
					local43 = Static418.anIntArrayArrayArray17[local20][local24][local34];
					if (local43 == -1) {
						arg0.method2462(local24 * 8, local20, 8, 8, local34 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static596.aClass332_1 = Static153.aClass344_1.method7526(local12[3], local12[2], local12[1], local12[0], Static422.aClass273_1);
			Static31.anInt9748 = local12[4];
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIIIILclient!wj;IIIII)Z")
	public static boolean method8464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class389 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg3 - 64;
		@Pc(23) int local23 = arg9 - 64;
		Static410.anIntArrayArray38[64][64] = 99;
		Static32.anIntArrayArray2[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static219.anIntArray249[0] = arg3;
		@Pc(46) int local46 = local37 + 1;
		Static555.anIntArray598[0] = arg9;
		@Pc(68) int[][] local68 = arg5.anIntArrayArray64;
		while (true) {
			label282: while (true) {
				@Pc(87) int local87;
				@Pc(83) int local83;
				@Pc(99) int local99;
				@Pc(105) int local105;
				@Pc(249) int local249;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local46 == local39) {
									Static54.anInt1253 = local7;
									Static437.anInt10168 = local9;
									return false;
								}
								local9 = Static555.anIntArray598[local39];
								local7 = Static219.anIntArray249[local39];
								local83 = local9 - local23;
								local87 = local7 - local18;
								local39 = local39 + 1 & 0xFFF;
								local99 = local7 - arg5.anInt10446;
								local105 = local9 - arg5.anInt10431;
								if (arg6 == -4) {
									if (arg10 == local7 && local9 == arg7) {
										Static437.anInt10168 = local9;
										Static54.anInt1253 = local7;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static65.method1433(local9, arg2, arg1, arg10, arg2, arg0, arg7, local7)) {
										Static54.anInt1253 = local7;
										Static437.anInt10168 = local9;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg5.method8812(arg1, arg0, arg2, arg2, local9, arg7, local7, arg4, arg10)) {
										Static437.anInt10168 = local9;
										Static54.anInt1253 = local7;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg5.method8808(arg1, arg2, arg7, arg10, local7, arg0, local9, arg4)) {
										Static54.anInt1253 = local7;
										Static437.anInt10168 = local9;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg5.method8809(arg7, arg6, local9, arg10, local7, arg8, arg2)) {
										Static437.anInt10168 = local9;
										Static54.anInt1253 = local7;
										return true;
									}
								} else if (arg5.method8804(arg10, local9, arg7, arg6, arg8, local7, arg2)) {
									Static54.anInt1253 = local7;
									Static437.anInt10168 = local9;
									return true;
								}
								local249 = Static32.anIntArrayArray2[local87][local83] + 1;
								if (local87 > 0 && Static410.anIntArrayArray38[local87 - 1][local83] == 0 && (local68[local99 - 1][local105] & 0x43A40000) == 0 && (local68[local99 - 1][local105 + arg2 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg2 - 1) {
											Static219.anIntArray249[local46] = local7 - 1;
											Static555.anIntArray598[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static410.anIntArrayArray38[local87 - 1][local83] = 2;
											Static32.anIntArrayArray2[local87 - 1][local83] = local249;
											break;
										}
										if ((local68[local99 - 1][local105 + local289] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local87 < 128 - arg2 && Static410.anIntArrayArray38[local87 + 1][local83] == 0 && (local68[local99 + arg2][local105] & 0x60E40000) == 0 && (local68[local99 + arg2][arg2 + local105 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 - 1 <= local289) {
											Static219.anIntArray249[local46] = local7 + 1;
											Static555.anIntArray598[local46] = local9;
											Static410.anIntArrayArray38[local87 + 1][local83] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static32.anIntArrayArray2[local87 + 1][local83] = local249;
											break;
										}
										if ((local68[local99 + arg2][local289 + local105] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local83 > 0 && Static410.anIntArrayArray38[local87][local83 - 1] == 0 && (local68[local99][local105 - 1] & 0x43A40000) == 0 && (local68[arg2 + local99 - 1][local105 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 - 1 <= local289) {
											Static219.anIntArray249[local46] = local7;
											Static555.anIntArray598[local46] = local9 - 1;
											Static410.anIntArrayArray38[local87][local83 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static32.anIntArrayArray2[local87][local83 - 1] = local249;
											break;
										}
										if ((local68[local99 + local289][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local83 < 128 - arg2 && Static410.anIntArrayArray38[local87][local83 + 1] == 0 && (local68[local99][arg2 + local105] & 0x4E240000) == 0 && (local68[local99 + arg2 - 1][arg2 + local105] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg2 - 1 <= local289) {
											Static219.anIntArray249[local46] = local7;
											Static555.anIntArray598[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static410.anIntArrayArray38[local87][local83 + 1] = 4;
											Static32.anIntArrayArray2[local87][local83 + 1] = local249;
											break;
										}
										if ((local68[local99 + local289][local105 + arg2] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local87 > 0 && local83 > 0 && Static410.anIntArrayArray38[local87 - 1][local83 - 1] == 0 && (local68[local99 - 1][local105 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg2) {
											Static219.anIntArray249[local46] = local7 - 1;
											Static555.anIntArray598[local46] = local9 - 1;
											Static410.anIntArrayArray38[local87 - 1][local83 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static32.anIntArrayArray2[local87 - 1][local83 - 1] = local249;
											break;
										}
										if ((local68[local99 - 1][local105 + local289 - 1] & 0x4FA40000) != 0 || (local68[local99 + local289 - 1][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (128 - arg2 > local87 && local83 > 0 && Static410.anIntArrayArray38[local87 + 1][local83 - 1] == 0 && (local68[local99 + arg2][local105 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg2) {
											Static219.anIntArray249[local46] = local7 + 1;
											Static555.anIntArray598[local46] = local9 - 1;
											Static410.anIntArrayArray38[local87 + 1][local83 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static32.anIntArrayArray2[local87 + 1][local83 - 1] = local249;
											break;
										}
										if ((local68[arg2 + local99][local289 + local105 - 1] & 0x78E40000) != 0 || (local68[local289 + local99][local105 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local87 > 0 && local83 < 128 - arg2 && Static410.anIntArrayArray38[local87 - 1][local83 + 1] == 0 && (local68[local99 - 1][arg2 + local105] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg2; local289++) {
										if ((local68[local99 - 1][local105 + local289] & 0x4FA40000) != 0 || (local68[local99 + local289 - 1][local105 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static219.anIntArray249[local46] = local7 - 1;
									Static555.anIntArray598[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static410.anIntArrayArray38[local87 - 1][local83 + 1] = 6;
									Static32.anIntArrayArray2[local87 - 1][local83 + 1] = local249;
								}
							} while (128 - arg2 <= local87);
						} while (local83 >= 128 - arg2);
					} while (Static410.anIntArrayArray38[local87 + 1][local83 + 1] != 0);
				} while ((local68[local99 + arg2][arg2 + local105] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg2; local289++) {
					if ((local68[local99 + local289][arg2 + local105] & 0x7E240000) != 0 || (local68[local99 + arg2][local105 + local289] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static219.anIntArray249[local46] = local7 + 1;
				Static555.anIntArray598[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local87 + 1][local83 + 1] = 12;
				Static32.anIntArrayArray2[local87 + 1][local83 + 1] = local249;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIILclient!pc;)Lclient!qt;")
	public static Class116_Sub2_Sub1 method8465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class33_Sub3 arg3) {
		if (arg3.aBoolean571 || Static211.method8993(arg2) && Static211.method8993(arg0)) {
			return new Class116_Sub2_Sub1(arg3, 3553, arg1, arg2, arg0);
		} else if (arg3.aBoolean568) {
			return new Class116_Sub2_Sub1(arg3, 34037, arg1, arg2, arg0);
		} else {
			return new Class116_Sub2_Sub1(arg3, arg1, arg2, arg0, Static162.method2593(arg2), Static162.method2593(arg0));
		}
	}
}
