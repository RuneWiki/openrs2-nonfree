import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!ep;")
	public static Class60 aClass60_6;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!en;Lclient!fs;III)V")
	public static void method3034(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class51 local12;
		if (arg3 < Static12.anInt378) {
			local12 = Static138.aClass51ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass25_Sub4_1 != null && local12.aClass25_Sub4_1.method5585()) {
				arg1.method5584(0, arg0, 128, local12.aClass25_Sub4_1, 0, true);
			}
		}
		if (arg4 < Static12.anInt378) {
			local12 = Static138.aClass51ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub4_1 != null && local12.aClass25_Sub4_1.method5585()) {
				arg1.method5584(0, arg0, 0, local12.aClass25_Sub4_1, 128, true);
			}
		}
		if (arg3 < Static12.anInt378 && arg4 < Static248.anInt4822) {
			local12 = Static138.aClass51ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass25_Sub4_1 != null && local12.aClass25_Sub4_1.method5585()) {
				arg1.method5584(0, arg0, 128, local12.aClass25_Sub4_1, 128, true);
			}
		}
		if (arg3 < Static12.anInt378 && arg4 > 0) {
			local12 = Static138.aClass51ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass25_Sub4_1 != null && local12.aClass25_Sub4_1.method5585()) {
				arg1.method5584(0, arg0, 128, local12.aClass25_Sub4_1, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!en;ILclient!dl;IIIIIZZI)V")
	public static void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class49 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		if (!Static26.method628() && !Static289.method4920(arg9, Static9.anInt297, arg5, arg7)) {
			return;
		}
		if (arg5 < Static344.anInt1080) {
			Static344.anInt1080 = arg5;
		}
		@Pc(25) Class137 local25 = Static228.method3923(arg6);
		if (Static134.anInt2746 == 1 && local25.aBoolean301) {
			return;
		}
		@Pc(51) int local51;
		@Pc(48) int local48;
		if (arg8 == 1 || arg8 == 3) {
			local48 = local25.anInt4126;
			local51 = local25.anInt4166;
		} else {
			local48 = local25.anInt4166;
			local51 = local25.anInt4126;
		}
		@Pc(78) int local78;
		@Pc(72) int local72;
		if (Static266.anInt5101 >= local51 + arg9) {
			local72 = (local51 + 1 >> 1) + arg9;
			local78 = arg9 + (local51 >> 1);
		} else {
			local72 = arg9 + 1;
			local78 = arg9;
		}
		@Pc(109) int local109;
		@Pc(103) int local103;
		if (Static339.anInt6352 >= local48 + arg7) {
			local103 = (local48 + 1 >> 1) + arg7;
			local109 = (local48 >> 1) + arg7;
		} else {
			local109 = arg7;
			local103 = arg7 + 1;
		}
		@Pc(121) Class3 local121 = Static130.aClass3Array2[arg0];
		@Pc(146) int local146 = local121.method5638(local78, local109) + local121.method5638(local72, local109) + local121.method5638(local78, local103) + local121.method5638(local72, local103) >> 2;
		@Pc(154) int local154 = (local51 << 6) + (arg9 << 7);
		@Pc(162) int local162 = (local48 << 6) + (arg7 << 7);
		@Pc(173) boolean local173 = arg11 && !arg10 && local25.aBoolean296;
		if (local25.method3712()) {
			Static129.method2471(arg9, arg7, null, local25, arg8, arg5, null);
		}
		@Pc(207) boolean local207 = arg3 == -1 && local25.anInt4144 == -1 && local25.anIntArray294 == null && local25.anIntArray296 == null && !local25.aBoolean297;
		if (Static213.aBoolean309 && local25.anInt4125 != 1) {
			return;
		}
		if (arg1 != 22) {
			@Pc(343) Class25_Sub1 local343;
			@Pc(308) Class25_Sub1_Sub4 local308;
			@Pc(341) int local341;
			@Pc(401) int local401;
			if (arg1 == 10 || arg1 == 11) {
				local308 = null;
				if (local207) {
					@Pc(337) Class25_Sub1_Sub4 local337 = new Class25_Sub1_Sub4(arg2, local25, arg5, arg0, local154, local146, local162, arg10, arg9, arg9 + local51 - 1, arg7, local48 + arg7 - 1, arg1, arg8, local173);
					local341 = local337.method1516();
					local343 = local337;
					local308 = local337;
				} else {
					local341 = 15;
					local343 = new Class25_Sub1_Sub2(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, arg9, local51 + arg9 - 1, arg7, arg7 + local48 - 1, arg3);
				}
				if (Static82.method1817(local343, false)) {
					if (local308 != null && local308.method5551()) {
						local308.method5555(arg2);
					}
					if (local25.aBoolean299 && arg11) {
						if (local341 > 30) {
							local341 = 30;
						}
						for (local401 = 0; local401 <= local51; local401++) {
							for (@Pc(405) int local405 = 0; local405 <= local48; local405++) {
								local121.method5640(local401 + arg9, local405 + arg7, local341);
							}
						}
					}
				}
				if (local25.anInt4128 != 0 && arg4 != null) {
					arg4.method1235(local25.aBoolean290, arg9, !local25.aBoolean291, arg7, local51, local48);
				}
			} else if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
				if (local207) {
					local308 = new Class25_Sub1_Sub4(arg2, local25, arg5, arg0, local154, local146, local162, arg10, arg9, local51 + arg9 - 1, arg7, arg7 + local48 - 1, arg1, arg8, local173);
					if (local308.method5551()) {
						local308.method5555(arg2);
					}
					local343 = local308;
				} else {
					local343 = new Class25_Sub1_Sub2(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, arg9, arg9 + local51 - 1, arg7, arg7 + local48 - 1, arg3);
				}
				Static82.method1817(local343, false);
				if (arg11 && !arg10 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0 && local25.anInt4125 != 0) {
					Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x4);
				}
				if (local25.anInt4128 != 0 && arg4 != null) {
					arg4.method1235(local25.aBoolean290, arg9, !local25.aBoolean291, arg7, local51, local48);
				}
			} else {
				@Pc(621) Class25_Sub2_Sub1 local621;
				@Pc(623) Class25_Sub2 local623;
				if (arg1 == 0) {
					if (local207) {
						local621 = new Class25_Sub2_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg1, arg8, local173);
						local623 = local621;
						if (local621.method5551()) {
							local621.method5555(arg2);
						}
					} else {
						local623 = new Class25_Sub2_Sub2(arg2, local25, 0, arg8, arg5, arg0, local154, local146, local162, arg10, arg3);
					}
					Static296.method5016(arg5, arg9, arg7, local623, null);
					if (arg11) {
						if (arg8 == 0) {
							if (local25.aBoolean299) {
								local121.method5640(arg9, arg7, 50);
								local121.method5640(arg9, arg7 + 1, 50);
							}
							if (local25.anInt4125 == 1 && !arg10) {
								Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x1);
							}
						} else if (arg8 == 1) {
							if (local25.aBoolean299) {
								local121.method5640(arg9, arg7 + 1, 50);
								local121.method5640(arg9 + 1, arg7 + 1, 50);
							}
							if (local25.anInt4125 == 1 && !arg10) {
								Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] | 0x2);
							}
						} else if (arg8 == 2) {
							if (local25.aBoolean299) {
								local121.method5640(arg9 + 1, arg7, 50);
								local121.method5640(arg9 + 1, arg7 - -1, 50);
							}
							if (local25.anInt4125 == 1 && !arg10) {
								Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] | 0x1);
							}
						} else if (arg8 == 3) {
							if (local25.aBoolean299) {
								local121.method5640(arg9, arg7, 50);
								local121.method5640(arg9 + 1, arg7, 50);
							}
							if (local25.anInt4125 == 1 && !arg10) {
								Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x2);
							}
						}
					}
					if (local25.anInt4128 != 0 && arg4 != null) {
						arg4.method1234(arg1, arg7, arg8, local25.aBoolean290, arg9, !local25.aBoolean291);
					}
					if (local25.anInt4159 != 16) {
						Static9.method275(arg5, arg9, arg7, local25.anInt4159);
					}
				} else if (arg1 == 1) {
					if (local207) {
						local621 = new Class25_Sub2_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg1, arg8, local173);
						local623 = local621;
						if (local621.method5551()) {
							local621.method5555(arg2);
						}
					} else {
						local623 = new Class25_Sub2_Sub2(arg2, local25, 1, arg8, arg5, arg0, local154, local146, local162, arg10, arg3);
					}
					Static296.method5016(arg5, arg9, arg7, local623, null);
					if (local25.aBoolean299 && arg11) {
						if (arg8 == 0) {
							local121.method5640(arg9, arg7 + 1, 50);
						} else if (arg8 == 1) {
							local121.method5640(arg9 + 1, arg7 - -1, 50);
						} else if (arg8 == 2) {
							local121.method5640(arg9 + 1, arg7, 50);
						} else if (arg8 == 3) {
							local121.method5640(arg9, arg7, 50);
						}
					}
					if (local25.anInt4128 != 0 && arg4 != null) {
						arg4.method1234(arg1, arg7, arg8, local25.aBoolean290, arg9, !local25.aBoolean291);
					}
				} else if (arg1 == 2) {
					local341 = arg8 + 1 & 0x3;
					@Pc(1061) Class25_Sub2 local1061;
					if (local207) {
						@Pc(1079) Class25_Sub2_Sub1 local1079 = new Class25_Sub2_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg1, arg8 + 4, local173);
						@Pc(1093) Class25_Sub2_Sub1 local1093 = new Class25_Sub2_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg1, local341, local173);
						if (local1079.method5551()) {
							local1079.method5555(arg2);
						}
						if (local1093.method5551()) {
							local1093.method5555(arg2);
						}
						local623 = local1079;
						local1061 = local1093;
					} else {
						local623 = new Class25_Sub2_Sub2(arg2, local25, 2, arg8 + 4, arg5, arg0, local154, local146, local162, arg10, arg3);
						local1061 = new Class25_Sub2_Sub2(arg2, local25, 2, local341, arg5, arg0, local154, local146, local162, arg10, arg3);
					}
					Static296.method5016(arg5, arg9, arg7, local623, local1061);
					if (local25.anInt4125 == 1 && arg11 && !arg10) {
						if (arg8 == 0) {
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x1);
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] | 0x2);
						} else if (arg8 == 1) {
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7 + 1] | 0x2);
							Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] | 0x1);
						} else if (arg8 == 2) {
							Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9 + 1][arg7] | 0x1);
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x2);
						} else if (arg8 == 3) {
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x2);
							Static296.aByteArrayArrayArray26[arg5][arg9][arg7] = (byte) (Static296.aByteArrayArrayArray26[arg5][arg9][arg7] | 0x1);
						}
					}
					if (local25.anInt4128 != 0 && arg4 != null) {
						arg4.method1234(arg1, arg7, arg8, local25.aBoolean290, arg9, !local25.aBoolean291);
					}
					if (local25.anInt4159 != 16) {
						Static9.method275(arg5, arg9, arg7, local25.anInt4159);
					}
				} else if (arg1 == 3) {
					if (local207) {
						local621 = new Class25_Sub2_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg1, arg8, local173);
						if (local621.method5551()) {
							local621.method5555(arg2);
						}
						local623 = local621;
					} else {
						local623 = new Class25_Sub2_Sub2(arg2, local25, 3, arg8, arg5, arg0, local154, local146, local162, arg10, arg3);
					}
					Static296.method5016(arg5, arg9, arg7, local623, null);
					if (local25.aBoolean299 && arg11) {
						if (arg8 == 0) {
							local121.method5640(arg9, arg7 + 1, 50);
						} else if (arg8 == 1) {
							local121.method5640(arg9 + 1, arg7 - -1, 50);
						} else if (arg8 == 2) {
							local121.method5640(arg9 + 1, arg7, 50);
						} else if (arg8 == 3) {
							local121.method5640(arg9, arg7, 50);
						}
					}
					if (local25.anInt4128 != 0 && arg4 != null) {
						arg4.method1234(arg1, arg7, arg8, local25.aBoolean290, arg9, !local25.aBoolean291);
					}
				} else if (arg1 == 9) {
					if (local207) {
						local308 = new Class25_Sub1_Sub4(arg2, local25, arg5, arg0, local154, local146, local162, arg10, arg9, arg9, arg7, arg7, arg1, arg8, local173);
						local343 = local308;
						if (local308.method5551()) {
							local308.method5555(arg2);
						}
					} else {
						local343 = new Class25_Sub1_Sub2(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, arg9, arg9 + local51 - 1, arg7, arg7 + local48 - 1, arg3);
					}
					Static82.method1817(local343, false);
					if (local25.anInt4128 != 0 && arg4 != null) {
						arg4.method1235(local25.aBoolean290, arg9, !local25.aBoolean291, arg7, local51, local48);
					}
					if (local25.anInt4159 != 16) {
						Static9.method275(arg5, arg9, arg7, local25.anInt4159);
					}
				} else {
					@Pc(1589) Class25_Sub3 local1589;
					if (arg1 == 4) {
						if (local207) {
							@Pc(1607) Class25_Sub3_Sub2 local1607 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, 0, 0, 0, arg1, arg8);
							if (local1607.method5551()) {
								local1607.method5555(arg2);
							}
							local1589 = local1607;
						} else {
							local1589 = new Class25_Sub3_Sub1(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, 0, 0, 0, arg3);
						}
						Static230.method3960(arg5, arg9, arg7, local1589, null);
					} else {
						@Pc(1629) int local1629;
						@Pc(1635) Interface8 local1635;
						@Pc(1670) Class25_Sub3_Sub2 local1670;
						if (arg1 == 5) {
							local1629 = 16;
							local1635 = (Interface8) Static178.method3304(arg5, arg9, arg7);
							if (local1635 != null) {
								local1629 = Static228.method3923(local1635.method5549()).anInt4159;
							}
							if (local207) {
								local1670 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, 0, Static282.anIntArray408[arg8] * local1629, Static230.anIntArray323[arg8] * local1629, arg1, arg8);
								if (local1670.method5551()) {
									local1670.method5555(arg2);
								}
								local1589 = local1670;
							} else {
								local1589 = new Class25_Sub3_Sub1(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, 0, Static282.anIntArray408[arg8] * local1629, Static230.anIntArray323[arg8] * local1629, arg3);
							}
							Static230.method3960(arg5, arg9, arg7, local1589, null);
						} else if (arg1 == 6) {
							local1629 = 8;
							local1635 = (Interface8) Static178.method3304(arg5, arg9, arg7);
							if (local1635 != null) {
								local1629 = Static228.method3923(local1635.method5549()).anInt4159 / 2;
							}
							if (local207) {
								local1670 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, arg8, Static282.anIntArray408[arg8] * local1629, local1629 * Static230.anIntArray323[arg8], arg1, arg8 + 4);
								if (local1670.method5551()) {
									local1670.method5555(arg2);
								}
								local1589 = local1670;
							} else {
								local1589 = new Class25_Sub3_Sub1(arg2, local25, arg1, arg8 + 4, arg5, arg0, local154, local146, local162, arg10, arg8, local1629 * Static81.anIntArray111[arg8], local1629 * Static262.anIntArray388[arg8], arg3);
							}
							Static230.method3960(arg5, arg9, arg7, local1589, null);
						} else if (arg1 == 7) {
							local1629 = arg8 + 2 & 0x3;
							if (local207) {
								@Pc(1841) Class25_Sub3_Sub2 local1841 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, local1629, 0, 0, arg1, local1629 + 4);
								if (local1841.method5551()) {
									local1841.method5555(arg2);
								}
								local1589 = local1841;
							} else {
								local1589 = new Class25_Sub3_Sub1(arg2, local25, arg1, local1629 + 4, arg5, arg0, local154, local146, local162, arg10, local1629, 0, 0, arg3);
							}
							Static230.method3960(arg5, arg9, arg7, local1589, null);
						} else if (arg1 == 8) {
							local341 = arg8 + 2 & 0x3;
							local401 = 8;
							@Pc(1897) Interface8 local1897 = (Interface8) Static178.method3304(arg5, arg9, arg7);
							if (local1897 != null) {
								local401 = Static228.method3923(local1897.method5549()).anInt4159 / 2;
							}
							@Pc(1936) Class25_Sub3 local1936;
							@Pc(1954) Class25_Sub3 local1954;
							if (local207) {
								local1936 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, arg8, local401 * Static81.anIntArray111[arg8], local401 * Static262.anIntArray388[arg8], arg1, arg8 + 4);
								local1954 = new Class25_Sub3_Sub2(arg2, local25, arg0, local154, local146, local162, arg10, arg8, 0, 0, arg1, local341 + 4);
								if (local1936.method5551()) {
									local1936.method5555(arg2);
								}
								if (local1954.method5551()) {
									local1954.method5555(arg2);
								}
							} else {
								local1936 = new Class25_Sub3_Sub1(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, arg8, Static81.anIntArray111[arg8] * local401, local401 * Static262.anIntArray388[arg8], arg3);
								local1954 = new Class25_Sub3_Sub1(arg2, local25, arg1, arg8, arg5, arg0, local154, local146, local162, arg10, arg8, 0, 0, arg3);
							}
							Static230.method3960(arg5, arg9, arg7, local1936, local1954);
						}
					}
				}
			}
		} else if (Static22.aBoolean43 || local25.anInt4164 != 0 || local25.anInt4128 == 1 || local25.aBoolean303) {
			@Pc(261) Class25_Sub4 local261;
			if (local207) {
				@Pc(251) Class25_Sub4_Sub1 local251 = new Class25_Sub4_Sub1(arg2, local25, arg0, local154, local146, local162, arg10, arg8, local173);
				if (local251.method5551()) {
					local251.method5555(arg2);
				}
				local261 = local251;
			} else {
				local261 = new Class25_Sub4_Sub2(arg2, local25, arg8, arg5, arg0, local154, local146, local162, arg10, arg3);
			}
			Static222.method3887(arg5, arg9, arg7, local261);
			if (local25.anInt4128 == 1 && arg4 != null) {
				arg4.method1232(arg9, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	public static void method3036(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static138.aClass51ArrayArrayArray1 = Static147.aClass51ArrayArrayArray2;
			Static130.aClass3Array2 = Static93.aClass3Array1;
		} else {
			Static138.aClass51ArrayArrayArray1 = Static275.aClass51ArrayArrayArray3;
			Static130.aClass3Array2 = Static262.aClass3Array3;
		}
		Static248.anInt4820 = Static138.aClass51ArrayArrayArray1.length;
	}
}
