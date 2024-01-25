import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public static int anInt3700;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_127 = new Class106("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray11 = new byte[250][];

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
	public static final int[] anIntArray282 = new int[4096];

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!al;")
	public static final Class8 aClass8_1 = Static11.method911();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIILclient!th;ZIILclient!fp;ZIIB)V")
	public static void method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class196 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class63 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!Static150.method4956() && !Static320.method4042(arg0, arg3, arg6, Static75.anInt3288)) {
			return;
		}
		if (Static365.anInt7016 > arg6) {
			Static365.anInt7016 = arg6;
		}
		@Pc(42) Class71 local42 = Static219.method4081(arg2);
		if (Static241.anInt4925 == 1 && local42.aBoolean173) {
			return;
		}
		@Pc(63) int local63;
		@Pc(60) int local60;
		if (arg10 == 1 || arg10 == 3) {
			local60 = local42.anInt2411;
			local63 = local42.anInt2376;
		} else {
			local60 = local42.anInt2376;
			local63 = local42.anInt2411;
		}
		@Pc(78) int local78;
		@Pc(82) int local82;
		if (Static311.anInt5653 < arg0 + local63) {
			local78 = arg0;
			local82 = arg0 + 1;
		} else {
			local78 = (local63 >> 1) + arg0;
			local82 = (local63 + 1 >> 1) + arg0;
		}
		@Pc(113) int local113;
		@Pc(121) int local121;
		if (local60 + arg3 <= Static189.anInt3820) {
			local113 = (local60 >> 1) + arg3;
			local121 = arg3 + (local60 + 1 >> 1);
		} else {
			local121 = arg3 + 1;
			local113 = arg3;
		}
		@Pc(133) Class36 local133 = Static258.aClass36Array2[arg1];
		@Pc(156) int local156 = local133.method4431(local78, local113) + local133.method4431(local82, local113) + local133.method4431(local78, local121) + local133.method4431(local82, local121) >> 2;
		@Pc(164) int local164 = (local63 << 6) + (arg0 << 7);
		@Pc(172) int local172 = (local60 << 6) + (arg3 << 7);
		@Pc(183) boolean local183 = arg5 && !arg9 && local42.aBoolean170;
		if (local42.method2277()) {
			Static286.method5275(arg10, null, null, arg3, arg6, local42, arg0);
		}
		@Pc(217) boolean local217 = arg7 == -1 && local42.anInt2384 == -1 && local42.anIntArray175 == null && local42.anIntArray178 == null && !local42.aBoolean168;
		if (Static258.aBoolean75 && local42.anInt2412 != 1) {
			return;
		}
		if (arg11 != 22) {
			@Pc(350) Class11_Sub2 local350;
			@Pc(312) Class11_Sub2_Sub3 local312;
			@Pc(346) int local346;
			@Pc(406) int local406;
			if (arg11 == 10 || arg11 == 11) {
				local312 = null;
				if (local217) {
					@Pc(342) Class11_Sub2_Sub3 local342 = new Class11_Sub2_Sub3(arg8, local42, arg6, arg1, local164, local156, local172, arg9, arg0, arg0 + local63 - 1, arg3, arg3 + local60 - 1, arg11, arg10, local183);
					local346 = local342.method4009();
					local312 = local342;
					local350 = local342;
				} else {
					local346 = 15;
					local350 = new Class11_Sub2_Sub5(arg8, local42, arg11, arg10, arg6, arg1, local164, local156, local172, arg9, arg0, local63 + arg0 - 1, arg3, local60 + arg3 - 1, arg7);
				}
				if (Static152.method2920(local350, false)) {
					if (local312 != null && local312.method5924()) {
						local312.method5926(arg8);
					}
					if (local42.aBoolean167 && arg5) {
						if (local346 > 30) {
							local346 = 30;
						}
						for (local406 = 0; local406 <= local63; local406++) {
							for (@Pc(410) int local410 = 0; local410 <= local60; local410++) {
								local133.method4443(arg0 + local406, local410 + arg3, local346);
							}
						}
					}
				}
				if (local42.anInt2397 != 0 && arg4 != null) {
					arg4.method5323(local42.aBoolean171, local60, local63, !local42.aBoolean174, arg3, arg0);
				}
			} else if (arg11 >= 12 && arg11 <= 17 || arg11 >= 18 && arg11 <= 21) {
				if (local217) {
					local312 = new Class11_Sub2_Sub3(arg8, local42, arg6, arg1, local164, local156, local172, arg9, arg0, local63 + arg0 - 1, arg3, arg3 + local60 - 1, arg11, arg10, local183);
					if (local312.method5924()) {
						local312.method5926(arg8);
					}
					local350 = local312;
				} else {
					local350 = new Class11_Sub2_Sub5(arg8, local42, arg11, arg10, arg6, arg1, local164, local156, local172, arg9, arg0, local63 + arg0 - 1, arg3, local60 + arg3 - 1, arg7);
				}
				Static152.method2920(local350, false);
				if (arg5 && !arg9 && arg11 >= 12 && arg11 <= 17 && arg11 != 13 && arg6 > 0 && local42.anInt2412 != 0) {
					Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x4);
				}
				if (local42.anInt2397 != 0 && arg4 != null) {
					arg4.method5323(local42.aBoolean171, local60, local63, !local42.aBoolean174, arg3, arg0);
				}
			} else {
				@Pc(626) Class11_Sub5_Sub1 local626;
				@Pc(636) Class11_Sub5 local636;
				if (arg11 == 0) {
					if (local217) {
						local626 = new Class11_Sub5_Sub1(arg8, local42, arg1, local164, local156, local172, arg9, arg11, arg10, local183);
						if (local626.method5924()) {
							local626.method5926(arg8);
						}
						local636 = local626;
					} else {
						local636 = new Class11_Sub5_Sub3(arg8, local42, 0, arg10, arg6, arg1, local164, local156, local172, arg9, arg7);
					}
					Static92.method1931(arg6, arg0, arg3, local636, null);
					if (arg5) {
						if (arg10 == 0) {
							if (local42.aBoolean167) {
								local133.method4443(arg0, arg3, 50);
								local133.method4443(arg0, arg3 + 1, 50);
							}
							if (local42.anInt2412 == 1 && !arg9) {
								Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x1);
							}
						} else if (arg10 == 1) {
							if (local42.aBoolean167) {
								local133.method4443(arg0, arg3 + 1, 50);
								local133.method4443(arg0 + 1, arg3 + 1, 50);
							}
							if (local42.anInt2412 == 1 && !arg9) {
								Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] | 0x2);
							}
						} else if (arg10 == 2) {
							if (local42.aBoolean167) {
								local133.method4443(arg0 + 1, arg3, 50);
								local133.method4443(arg0 + 1, arg3 + 1, 50);
							}
							if (local42.anInt2412 == 1 && !arg9) {
								Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] | 0x1);
							}
						} else if (arg10 == 3) {
							if (local42.aBoolean167) {
								local133.method4443(arg0, arg3, 50);
								local133.method4443(arg0 + 1, arg3, 50);
							}
							if (local42.anInt2412 == 1 && !arg9) {
								Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x2);
							}
						}
					}
					if (local42.anInt2397 != 0 && arg4 != null) {
						arg4.method5315(local42.aBoolean171, arg11, arg0, arg3, arg10, !local42.aBoolean174);
					}
					if (local42.anInt2413 != 16) {
						Static229.method4281(arg6, arg0, arg3, local42.anInt2413);
					}
				} else if (arg11 == 1) {
					if (local217) {
						local626 = new Class11_Sub5_Sub1(arg8, local42, arg1, local164, local156, local172, arg9, arg11, arg10, local183);
						if (local626.method5924()) {
							local626.method5926(arg8);
						}
						local636 = local626;
					} else {
						local636 = new Class11_Sub5_Sub3(arg8, local42, 1, arg10, arg6, arg1, local164, local156, local172, arg9, arg7);
					}
					Static92.method1931(arg6, arg0, arg3, local636, null);
					if (local42.aBoolean167 && arg5) {
						if (arg10 == 0) {
							local133.method4443(arg0, arg3 + 1, 50);
						} else if (arg10 == 1) {
							local133.method4443(arg0 + 1, arg3 + 1, 50);
						} else if (arg10 == 2) {
							local133.method4443(arg0 + 1, arg3, 50);
						} else if (arg10 == 3) {
							local133.method4443(arg0, arg3, 50);
						}
					}
					if (local42.anInt2397 != 0 && arg4 != null) {
						arg4.method5315(local42.aBoolean171, arg11, arg0, arg3, arg10, !local42.aBoolean174);
					}
				} else if (arg11 == 2) {
					local346 = arg10 + 1 & 0x3;
					@Pc(1074) Class11_Sub5 local1074;
					if (local217) {
						@Pc(1048) Class11_Sub5_Sub1 local1048 = new Class11_Sub5_Sub1(arg8, local42, arg1, local164, local156, local172, arg9, arg11, arg10 + 4, local183);
						@Pc(1062) Class11_Sub5_Sub1 local1062 = new Class11_Sub5_Sub1(arg8, local42, arg1, local164, local156, local172, arg9, arg11, local346, local183);
						if (local1048.method5924()) {
							local1048.method5926(arg8);
						}
						local636 = local1048;
						local1074 = local1062;
						if (local1062.method5924()) {
							local1062.method5926(arg8);
						}
					} else {
						local636 = new Class11_Sub5_Sub3(arg8, local42, 2, arg10 + 4, arg6, arg1, local164, local156, local172, arg9, arg7);
						local1074 = new Class11_Sub5_Sub3(arg8, local42, 2, local346, arg6, arg1, local164, local156, local172, arg9, arg7);
					}
					Static92.method1931(arg6, arg0, arg3, local636, local1074);
					if (local42.anInt2412 == 1 && arg5 && !arg9) {
						if (arg10 == 0) {
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x1);
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] | 0x2);
						} else if (arg10 == 1) {
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3 + 1] | 0x2);
							Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] | 0x1);
						} else if (arg10 == 2) {
							Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0 + 1][arg3] | 0x1);
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x2);
						} else if (arg10 == 3) {
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x2);
							Static312.aByteArrayArrayArray9[arg6][arg0][arg3] = (byte) (Static312.aByteArrayArrayArray9[arg6][arg0][arg3] | 0x1);
						}
					}
					if (local42.anInt2397 != 0 && arg4 != null) {
						arg4.method5315(local42.aBoolean171, arg11, arg0, arg3, arg10, !local42.aBoolean174);
					}
					if (local42.anInt2413 != 16) {
						Static229.method4281(arg6, arg0, arg3, local42.anInt2413);
					}
				} else if (arg11 == 3) {
					if (local217) {
						local626 = new Class11_Sub5_Sub1(arg8, local42, arg1, local164, local156, local172, arg9, arg11, arg10, local183);
						if (local626.method5924()) {
							local626.method5926(arg8);
						}
						local636 = local626;
					} else {
						local636 = new Class11_Sub5_Sub3(arg8, local42, 3, arg10, arg6, arg1, local164, local156, local172, arg9, arg7);
					}
					Static92.method1931(arg6, arg0, arg3, local636, null);
					if (local42.aBoolean167 && arg5) {
						if (arg10 == 0) {
							local133.method4443(arg0, arg3 + 1, 50);
						} else if (arg10 == 1) {
							local133.method4443(arg0 + 1, arg3 - -1, 50);
						} else if (arg10 == 2) {
							local133.method4443(arg0 + 1, arg3, 50);
						} else if (arg10 == 3) {
							local133.method4443(arg0, arg3, 50);
						}
					}
					if (local42.anInt2397 != 0 && arg4 != null) {
						arg4.method5315(local42.aBoolean171, arg11, arg0, arg3, arg10, !local42.aBoolean174);
					}
				} else if (arg11 == 9) {
					if (local217) {
						local312 = new Class11_Sub2_Sub3(arg8, local42, arg6, arg1, local164, local156, local172, arg9, arg0, arg0, arg3, arg3, arg11, arg10, local183);
						if (local312.method5924()) {
							local312.method5926(arg8);
						}
						local350 = local312;
					} else {
						local350 = new Class11_Sub2_Sub5(arg8, local42, arg11, arg10, arg6, arg1, local164, local156, local172, arg9, arg0, arg0 + local63 - 1, arg3, local60 + arg3 - 1, arg7);
					}
					Static152.method2920(local350, false);
					if (local42.anInt2397 != 0 && arg4 != null) {
						arg4.method5323(local42.aBoolean171, local60, local63, !local42.aBoolean174, arg3, arg0);
					}
					if (local42.anInt2413 != 16) {
						Static229.method4281(arg6, arg0, arg3, local42.anInt2413);
					}
				} else {
					@Pc(1591) Class11_Sub4 local1591;
					if (arg11 == 4) {
						if (local217) {
							@Pc(1589) Class11_Sub4_Sub2 local1589 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, 0, 0, 0, arg11, arg10);
							local1591 = local1589;
							if (local1589.method5924()) {
								local1589.method5926(arg8);
							}
						} else {
							local1591 = new Class11_Sub4_Sub3(arg8, local42, arg11, arg10, arg6, arg1, local164, local156, local172, arg9, 0, 0, 0, arg7);
						}
						Static279.method4982(arg6, arg0, arg3, local1591, null);
					} else {
						@Pc(1631) int local1631;
						@Pc(1637) Interface4 local1637;
						@Pc(1700) Class11_Sub4_Sub2 local1700;
						if (arg11 == 5) {
							local1631 = 16;
							local1637 = (Interface4) Static342.method5727(arg6, arg0, arg3);
							if (local1637 != null) {
								local1631 = Static219.method4081(local1637.method5927()).anInt2413;
							}
							if (local217) {
								local1700 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, 0, local1631 * Static65.anIntArray454[arg10], local1631 * Static275.anIntArray415[arg10], arg11, arg10);
								local1591 = local1700;
								if (local1700.method5924()) {
									local1700.method5926(arg8);
								}
							} else {
								local1591 = new Class11_Sub4_Sub3(arg8, local42, arg11, arg10, arg6, arg1, local164, local156, local172, arg9, 0, Static65.anIntArray454[arg10] * local1631, Static275.anIntArray415[arg10] * local1631, arg7);
							}
							Static279.method4982(arg6, arg0, arg3, local1591, null);
						} else if (arg11 == 6) {
							local1631 = 8;
							local1637 = (Interface4) Static342.method5727(arg6, arg0, arg3);
							if (local1637 != null) {
								local1631 = Static219.method4081(local1637.method5927()).anInt2413 / 2;
							}
							if (local217) {
								local1700 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, arg10, Static65.anIntArray454[arg10] * local1631, local1631 * Static275.anIntArray415[arg10], arg11, arg10 + 4);
								local1591 = local1700;
								if (local1700.method5924()) {
									local1700.method5926(arg8);
								}
							} else {
								local1591 = new Class11_Sub4_Sub3(arg8, local42, arg11, arg10 + 4, arg6, arg1, local164, local156, local172, arg9, arg10, Static140.anIntArray227[arg10] * local1631, Static368.anIntArray522[arg10] * local1631, arg7);
							}
							Static279.method4982(arg6, arg0, arg3, local1591, null);
						} else if (arg11 == 7) {
							local1631 = arg10 + 2 & 0x3;
							if (local217) {
								@Pc(1869) Class11_Sub4_Sub2 local1869 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, local1631, 0, 0, arg11, local1631 + 4);
								local1591 = local1869;
								if (local1869.method5924()) {
									local1869.method5926(arg8);
								}
							} else {
								local1591 = new Class11_Sub4_Sub3(arg8, local42, arg11, local1631 + 4, arg6, arg1, local164, local156, local172, arg9, local1631, 0, 0, arg7);
							}
							Static279.method4982(arg6, arg0, arg3, local1591, null);
						} else if (arg11 == 8) {
							local346 = arg10 + 2 & 0x3;
							local406 = 8;
							@Pc(1903) Interface4 local1903 = (Interface4) Static342.method5727(arg6, arg0, arg3);
							if (local1903 != null) {
								local406 = Static219.method4081(local1903.method5927()).anInt2413 / 2;
							}
							@Pc(1944) Class11_Sub4 local1944;
							@Pc(1964) Class11_Sub4 local1964;
							if (local217) {
								local1944 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, arg10, Static140.anIntArray227[arg10] * local406, local406 * Static368.anIntArray522[arg10], arg11, arg10 + 4);
								local1964 = new Class11_Sub4_Sub2(arg8, local42, arg1, local164, local156, local172, arg9, arg10, 0, 0, arg11, local346 + 4);
								if (local1944.method5924()) {
									local1944.method5926(arg8);
								}
								if (local1964.method5924()) {
									local1964.method5926(arg8);
								}
							} else {
								local1944 = new Class11_Sub4_Sub3(arg8, local42, arg11, arg10 + 4, arg6, arg1, local164, local156, local172, arg9, arg10, local406 * Static140.anIntArray227[arg10], Static368.anIntArray522[arg10] * local406, arg7);
								local1964 = new Class11_Sub4_Sub3(arg8, local42, arg11, local346 + 4, arg6, arg1, local164, local156, local172, arg9, arg10, 0, 0, arg7);
							}
							Static279.method4982(arg6, arg0, arg3, local1944, local1964);
						}
					}
				}
			}
		} else if (Static30.aBoolean49 || local42.anInt2377 != 0 || local42.anInt2397 == 1 || local42.aBoolean172) {
			@Pc(261) Class11_Sub1 local261;
			if (local217) {
				@Pc(259) Class11_Sub1_Sub3 local259 = new Class11_Sub1_Sub3(arg8, local42, arg1, local164, local156, local172, arg9, arg10, local183);
				local261 = local259;
				if (local259.method5924()) {
					local259.method5926(arg8);
				}
			} else {
				local261 = new Class11_Sub1_Sub2(arg8, local42, arg10, arg6, arg1, local164, local156, local172, arg9, arg7);
			}
			Static275.method4904(arg6, arg0, arg3, local261);
			if (local42.anInt2397 == 1 && arg4 != null) {
				arg4.method5308(arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
	public static void method3455(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static180.aBooleanArray18[arg0]) {
			Static84.aClass30_24.method1183(arg0);
			Static341.aClass112ArrayArray1[arg0] = null;
			Static180.aBooleanArray18[arg0] = false;
		}
	}
}
