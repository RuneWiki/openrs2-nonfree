import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
	public static short[] aShortArray70;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public static int anInt3448;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "[S")
	public static final short[] aShortArray71 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	public static void method3159() {
		Static324.aClass32_14.method2140(((float) Static13.anInt489 * 0.1F + 0.7F) * 1.1523438F);
		Static324.aClass32_14.method2189(Static148.anInt3242, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static324.aClass32_14.method2204(Static47.anInt1511, -1);
		Static324.aClass32_14.method2169(Static176.aClass114_2);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!uo;IIZIZIIIZILclient!g;)V")
	public static void method3160(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class71 arg11) {
		if (!Static40.method953() && !Static106.method2323(arg10, arg8, Static141.anInt6334, arg3)) {
			return;
		}
		if (Static211.anInt4537 > arg3) {
			Static211.anInt4537 = arg3;
		}
		@Pc(29) Class141 local29 = Static119.method2548(arg6);
		if (Static306.anInt6046 == 1 && local29.aBoolean395) {
			return;
		}
		@Pc(45) int local45;
		@Pc(48) int local48;
		if (arg5 == 1 || arg5 == 3) {
			local45 = local29.anInt4256;
			local48 = local29.anInt4297;
		} else {
			local45 = local29.anInt4297;
			local48 = local29.anInt4256;
		}
		@Pc(72) int local72;
		@Pc(80) int local80;
		if (arg8 + local45 <= Static233.anInt5573) {
			local72 = arg8 + (local45 >> 1);
			local80 = arg8 + (local45 + 1 >> 1);
		} else {
			local80 = arg8 + 1;
			local72 = arg8;
		}
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (arg10 + local48 <= Static134.anInt2971) {
			local100 = arg10 + (local48 >> 1);
			local109 = arg10 + (local48 + 1 >> 1);
		} else {
			local100 = arg10;
			local109 = arg10 + 1;
		}
		@Pc(121) Class53 local121 = Static298.aClass53Array3[arg2];
		@Pc(145) int local145 = local121.method2785(local72, local100) + local121.method2785(local80, local100) + local121.method2785(local72, local109) + local121.method2785(local80, local109) >> 2;
		@Pc(154) int local154 = (arg8 << 7) + (local45 << 6);
		@Pc(162) int local162 = (local48 << 6) + (arg10 << 7);
		@Pc(173) boolean local173 = arg4 && !arg9 && local29.aBoolean397;
		if (local29.method3835()) {
			Static209.method3980(arg5, null, local29, null, arg3, arg8, arg10);
		}
		@Pc(207) boolean local207 = arg0 == -1 && local29.anInt4280 == -1 && local29.anIntArray392 == null && local29.anIntArray391 == null && !local29.aBoolean394;
		if (Static20.aBoolean82 && local29.anInt4286 != 1) {
			return;
		}
		if (arg7 != 22) {
			@Pc(347) Class17_Sub1 local347;
			@Pc(310) Class17_Sub1_Sub5 local310;
			@Pc(345) int local345;
			@Pc(405) int local405;
			if (arg7 == 10 || arg7 == 11) {
				local310 = null;
				if (local207) {
					@Pc(339) Class17_Sub1_Sub5 local339 = new Class17_Sub1_Sub5(arg1, local29, arg3, arg2, local154, local145, local162, arg9, arg8, local45 + arg8 - 1, arg10, local48 + arg10 - 1, arg7, arg5, local173);
					local310 = local339;
					local345 = local339.method4502();
					local347 = local339;
				} else {
					local345 = 15;
					local347 = new Class17_Sub1_Sub3(arg1, local29, arg7, arg5, arg3, arg2, local154, local145, local162, arg9, arg8, arg8 + local45 - 1, arg10, local48 + arg10 - 1, arg0);
				}
				if (Static63.method4865(local347, false)) {
					if (local310 != null && local310.method4795()) {
						local310.method4800(arg1);
					}
					if (local29.aBoolean396 && arg4) {
						if (local345 > 30) {
							local345 = 30;
						}
						for (local405 = 0; local405 <= local45; local405++) {
							for (@Pc(409) int local409 = 0; local409 <= local48; local409++) {
								local121.method2793(arg8 + local405, local409 + arg10, local345);
							}
						}
					}
				}
				if (local29.anInt4262 != 0 && arg11 != null) {
					arg11.method1933(!local29.aBoolean403, arg8, arg10, local45, local48, local29.aBoolean406);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local207) {
					local310 = new Class17_Sub1_Sub5(arg1, local29, arg3, arg2, local154, local145, local162, arg9, arg8, local45 + arg8 - 1, arg10, arg10 + local48 - 1, arg7, arg5, local173);
					if (local310.method4795()) {
						local310.method4800(arg1);
					}
					local347 = local310;
				} else {
					local347 = new Class17_Sub1_Sub3(arg1, local29, arg7, arg5, arg3, arg2, local154, local145, local162, arg9, arg8, arg8 + local45 - 1, arg10, local48 + arg10 - 1, arg0);
				}
				Static63.method4865(local347, false);
				if (arg4 && !arg9 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0 && local29.anInt4286 != 0) {
					Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x4);
				}
				if (local29.anInt4262 != 0 && arg11 != null) {
					arg11.method1933(!local29.aBoolean403, arg8, arg10, local45, local48, local29.aBoolean406);
				}
			} else {
				@Pc(650) Class17_Sub4_Sub2 local650;
				@Pc(634) Class17_Sub4 local634;
				if (arg7 == 0) {
					if (local207) {
						local650 = new Class17_Sub4_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg7, arg5, local173);
						local634 = local650;
						if (local650.method4795()) {
							local650.method4800(arg1);
						}
					} else {
						local634 = new Class17_Sub4_Sub1(arg1, local29, 0, arg5, arg3, arg2, local154, local145, local162, arg9, arg0);
					}
					Static72.method1684(arg3, arg8, arg10, local634, null);
					if (arg4) {
						if (arg5 == 0) {
							if (local29.aBoolean396) {
								local121.method2793(arg8, arg10, 50);
								local121.method2793(arg8, arg10 + 1, 50);
							}
							if (local29.anInt4286 == 1 && !arg9) {
								Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x1);
							}
						} else if (arg5 == 1) {
							if (local29.aBoolean396) {
								local121.method2793(arg8, arg10 + 1, 50);
								local121.method2793(arg8 + 1, arg10 + 1, 50);
							}
							if (local29.anInt4286 == 1 && !arg9) {
								Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] | 0x2);
							}
						} else if (arg5 == 2) {
							if (local29.aBoolean396) {
								local121.method2793(arg8 + 1, arg10, 50);
								local121.method2793(arg8 + 1, arg10 - -1, 50);
							}
							if (local29.anInt4286 == 1 && !arg9) {
								Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] | 0x1);
							}
						} else if (arg5 == 3) {
							if (local29.aBoolean396) {
								local121.method2793(arg8, arg10, 50);
								local121.method2793(arg8 + 1, arg10, 50);
							}
							if (local29.anInt4286 == 1 && !arg9) {
								Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x2);
							}
						}
					}
					if (local29.anInt4262 != 0 && arg11 != null) {
						arg11.method1938(arg5, arg10, local29.aBoolean406, arg8, !local29.aBoolean403, arg7);
					}
					if (local29.anInt4299 != 16) {
						Static49.method1302(arg3, arg8, arg10, local29.anInt4299);
					}
				} else if (arg7 == 1) {
					if (local207) {
						local650 = new Class17_Sub4_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg7, arg5, local173);
						if (local650.method4795()) {
							local650.method4800(arg1);
						}
						local634 = local650;
					} else {
						local634 = new Class17_Sub4_Sub1(arg1, local29, 1, arg5, arg3, arg2, local154, local145, local162, arg9, arg0);
					}
					Static72.method1684(arg3, arg8, arg10, local634, null);
					if (local29.aBoolean396 && arg4) {
						if (arg5 == 0) {
							local121.method2793(arg8, arg10 + 1, 50);
						} else if (arg5 == 1) {
							local121.method2793(arg8 + 1, arg10 + 1, 50);
						} else if (arg5 == 2) {
							local121.method2793(arg8 + 1, arg10, 50);
						} else if (arg5 == 3) {
							local121.method2793(arg8, arg10, 50);
						}
					}
					if (local29.anInt4262 != 0 && arg11 != null) {
						arg11.method1938(arg5, arg10, local29.aBoolean406, arg8, !local29.aBoolean403, arg7);
					}
				} else if (arg7 == 2) {
					local345 = arg5 + 1 & 0x3;
					@Pc(1095) Class17_Sub4 local1095;
					if (local207) {
						@Pc(1061) Class17_Sub4_Sub2 local1061 = new Class17_Sub4_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg7, arg5 + 4, local173);
						@Pc(1075) Class17_Sub4_Sub2 local1075 = new Class17_Sub4_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg7, local345, local173);
						if (local1061.method4795()) {
							local1061.method4800(arg1);
						}
						local634 = local1061;
						if (local1075.method4795()) {
							local1075.method4800(arg1);
						}
						local1095 = local1075;
					} else {
						local634 = new Class17_Sub4_Sub1(arg1, local29, 2, arg5 + 4, arg3, arg2, local154, local145, local162, arg9, arg0);
						local1095 = new Class17_Sub4_Sub1(arg1, local29, 2, local345, arg3, arg2, local154, local145, local162, arg9, arg0);
					}
					Static72.method1684(arg3, arg8, arg10, local634, local1095);
					if (local29.anInt4286 == 1 && arg4 && !arg9) {
						if (arg5 == 0) {
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x1);
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] | 0x2);
						} else if (arg5 == 1) {
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10 + 1] | 0x2);
							Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] | 0x1);
						} else if (arg5 == 2) {
							Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8 + 1][arg10] | 0x1);
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x2);
						} else if (arg5 == 3) {
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x2);
							Static64.aByteArrayArrayArray2[arg3][arg8][arg10] = (byte) (Static64.aByteArrayArrayArray2[arg3][arg8][arg10] | 0x1);
						}
					}
					if (local29.anInt4262 != 0 && arg11 != null) {
						arg11.method1938(arg5, arg10, local29.aBoolean406, arg8, !local29.aBoolean403, arg7);
					}
					if (local29.anInt4299 != 16) {
						Static49.method1302(arg3, arg8, arg10, local29.anInt4299);
					}
				} else if (arg7 == 3) {
					if (local207) {
						local650 = new Class17_Sub4_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg7, arg5, local173);
						local634 = local650;
						if (local650.method4795()) {
							local650.method4800(arg1);
						}
					} else {
						local634 = new Class17_Sub4_Sub1(arg1, local29, 3, arg5, arg3, arg2, local154, local145, local162, arg9, arg0);
					}
					Static72.method1684(arg3, arg8, arg10, local634, null);
					if (local29.aBoolean396 && arg4) {
						if (arg5 == 0) {
							local121.method2793(arg8, arg10 + 1, 50);
						} else if (arg5 == 1) {
							local121.method2793(arg8 + 1, arg10 - -1, 50);
						} else if (arg5 == 2) {
							local121.method2793(arg8 + 1, arg10, 50);
						} else if (arg5 == 3) {
							local121.method2793(arg8, arg10, 50);
						}
					}
					if (local29.anInt4262 != 0 && arg11 != null) {
						arg11.method1938(arg5, arg10, local29.aBoolean406, arg8, !local29.aBoolean403, arg7);
					}
				} else if (arg7 == 9) {
					if (local207) {
						local310 = new Class17_Sub1_Sub5(arg1, local29, arg3, arg2, local154, local145, local162, arg9, arg8, arg8, arg10, arg10, arg7, arg5, local173);
						if (local310.method4795()) {
							local310.method4800(arg1);
						}
						local347 = local310;
					} else {
						local347 = new Class17_Sub1_Sub3(arg1, local29, arg7, arg5, arg3, arg2, local154, local145, local162, arg9, arg8, arg8 + local45 - 1, arg10, local48 + arg10 - 1, arg0);
					}
					Static63.method4865(local347, false);
					if (local29.anInt4262 != 0 && arg11 != null) {
						arg11.method1933(!local29.aBoolean403, arg8, arg10, local45, local48, local29.aBoolean406);
					}
					if (local29.anInt4299 != 16) {
						Static49.method1302(arg3, arg8, arg10, local29.anInt4299);
					}
				} else {
					@Pc(1618) Class17_Sub3 local1618;
					if (arg7 == 4) {
						if (local207) {
							@Pc(1608) Class17_Sub3_Sub2 local1608 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, 0, 0, 0, arg7, arg5);
							if (local1608.method4795()) {
								local1608.method4800(arg1);
							}
							local1618 = local1608;
						} else {
							local1618 = new Class17_Sub3_Sub1(arg1, local29, arg7, arg5, arg3, arg2, local154, local145, local162, arg9, 0, 0, 0, arg0);
						}
						Static32.method1928(arg3, arg8, arg10, local1618, null);
					} else {
						@Pc(1650) int local1650;
						@Pc(1656) Interface5 local1656;
						@Pc(1719) Class17_Sub3_Sub2 local1719;
						if (arg7 == 5) {
							local1650 = 16;
							local1656 = (Interface5) Static352.method5612(arg3, arg8, arg10);
							if (local1656 != null) {
								local1650 = Static119.method2548(local1656.method4799()).anInt4299;
							}
							if (local207) {
								local1719 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, 0, local1650 * Static77.anIntArray200[arg5], local1650 * Static177.anIntArray372[arg5], arg7, arg5);
								if (local1719.method4795()) {
									local1719.method4800(arg1);
								}
								local1618 = local1719;
							} else {
								local1618 = new Class17_Sub3_Sub1(arg1, local29, arg7, arg5, arg3, arg2, local154, local145, local162, arg9, 0, Static77.anIntArray200[arg5] * local1650, local1650 * Static177.anIntArray372[arg5], arg0);
							}
							Static32.method1928(arg3, arg8, arg10, local1618, null);
						} else if (arg7 == 6) {
							local1650 = 8;
							local1656 = (Interface5) Static352.method5612(arg3, arg8, arg10);
							if (local1656 != null) {
								local1650 = Static119.method2548(local1656.method4799()).anInt4299 / 2;
							}
							if (local207) {
								local1719 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg5, local1650 * Static77.anIntArray200[arg5], Static177.anIntArray372[arg5] * local1650, arg7, arg5 + 4);
								local1618 = local1719;
								if (local1719.method4795()) {
									local1719.method4800(arg1);
								}
							} else {
								local1618 = new Class17_Sub3_Sub1(arg1, local29, arg7, arg5 + 4, arg3, arg2, local154, local145, local162, arg9, arg5, local1650 * Static278.anIntArray474[arg5], Static88.anIntArray211[arg5] * local1650, arg0);
							}
							Static32.method1928(arg3, arg8, arg10, local1618, null);
						} else if (arg7 == 7) {
							local1650 = arg5 + 2 & 0x3;
							if (local207) {
								@Pc(1888) Class17_Sub3_Sub2 local1888 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, local1650, 0, 0, arg7, local1650 + 4);
								if (local1888.method4795()) {
									local1888.method4800(arg1);
								}
								local1618 = local1888;
							} else {
								local1618 = new Class17_Sub3_Sub1(arg1, local29, arg7, local1650 + 4, arg3, arg2, local154, local145, local162, arg9, local1650, 0, 0, arg0);
							}
							Static32.method1928(arg3, arg8, arg10, local1618, null);
						} else if (arg7 == 8) {
							local345 = arg5 + 2 & 0x3;
							local405 = 8;
							@Pc(1924) Interface5 local1924 = (Interface5) Static352.method5612(arg3, arg8, arg10);
							if (local1924 != null) {
								local405 = Static119.method2548(local1924.method4799()).anInt4299 / 2;
							}
							@Pc(1963) Class17_Sub3 local1963;
							@Pc(1981) Class17_Sub3 local1981;
							if (local207) {
								local1963 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg5, Static278.anIntArray474[arg5] * local405, Static88.anIntArray211[arg5] * local405, arg7, arg5 + 4);
								local1981 = new Class17_Sub3_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg5, 0, 0, arg7, local345 + 4);
								if (local1963.method4795()) {
									local1963.method4800(arg1);
								}
								if (local1981.method4795()) {
									local1981.method4800(arg1);
								}
							} else {
								local1963 = new Class17_Sub3_Sub1(arg1, local29, arg7, arg5 + 4, arg3, arg2, local154, local145, local162, arg9, arg5, Static278.anIntArray474[arg5] * local405, Static88.anIntArray211[arg5] * local405, arg0);
								local1981 = new Class17_Sub3_Sub1(arg1, local29, arg7, local345 + 4, arg3, arg2, local154, local145, local162, arg9, arg5, 0, 0, arg0);
							}
							Static32.method1928(arg3, arg8, arg10, local1963, local1981);
						}
					}
				}
			}
		} else if (Static84.aBoolean195 || local29.anInt4294 != 0 || local29.anInt4262 == 1 || local29.aBoolean398) {
			@Pc(257) Class17_Sub5 local257;
			if (local207) {
				@Pc(255) Class17_Sub5_Sub2 local255 = new Class17_Sub5_Sub2(arg1, local29, arg2, local154, local145, local162, arg9, arg5, local173);
				local257 = local255;
				if (local255.method4795()) {
					local255.method4800(arg1);
				}
			} else {
				local257 = new Class17_Sub5_Sub1(arg1, local29, arg5, arg3, arg2, local154, local145, local162, arg9, arg0);
			}
			Static222.method4157(arg3, arg8, arg10, local257);
			if (local29.anInt4262 == 1 && arg11 != null) {
				arg11.method1931(arg10, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)V")
	public static void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub4_Sub9 local12 = Static139.method4227(arg0, 14);
		local12.method1869();
		local12.anInt2142 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
	public static boolean method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static318.anInt6133; local1++) {
			@Pc(6) Class23 local6 = Static91.aClass23Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1018 == 1) {
				local15 = local6.anInt1032 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1020 + (local6.anInt1024 * local15 >> 8);
					local37 = local6.anInt1021 + (local6.anInt1011 * local15 >> 8);
					local47 = local6.anInt1016 + (local6.anInt1027 * local15 >> 8);
					local57 = local6.anInt1017 + (local6.anInt1029 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1018 == 2) {
				local15 = arg0 - local6.anInt1032;
				if (local15 > 0) {
					local27 = local6.anInt1020 + (local6.anInt1024 * local15 >> 8);
					local37 = local6.anInt1021 + (local6.anInt1011 * local15 >> 8);
					local47 = local6.anInt1016 + (local6.anInt1027 * local15 >> 8);
					local57 = local6.anInt1017 + (local6.anInt1029 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1018 == 3) {
				local15 = local6.anInt1020 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1032 + (local6.anInt1019 * local15 >> 8);
					local37 = local6.anInt1022 + (local6.anInt1013 * local15 >> 8);
					local47 = local6.anInt1016 + (local6.anInt1027 * local15 >> 8);
					local57 = local6.anInt1017 + (local6.anInt1029 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1018 == 4) {
				local15 = arg2 - local6.anInt1020;
				if (local15 > 0) {
					local27 = local6.anInt1032 + (local6.anInt1019 * local15 >> 8);
					local37 = local6.anInt1022 + (local6.anInt1013 * local15 >> 8);
					local47 = local6.anInt1016 + (local6.anInt1027 * local15 >> 8);
					local57 = local6.anInt1017 + (local6.anInt1029 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1018 == 5) {
				local15 = arg1 - local6.anInt1016;
				if (local15 > 0) {
					local27 = local6.anInt1032 + (local6.anInt1019 * local15 >> 8);
					local37 = local6.anInt1022 + (local6.anInt1013 * local15 >> 8);
					local47 = local6.anInt1020 + (local6.anInt1024 * local15 >> 8);
					local57 = local6.anInt1021 + (local6.anInt1011 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		Static301.anInt5960 = arg2;
		Static354.anInt6757 = arg3;
		Static41.anInt1307 = arg4;
		Static355.anInt6783 = arg0;
		Static271.anInt5526 = arg1;
		if (arg5 && Static355.anInt6783 >= 100) {
			Static320.anInt5326 = Static301.anInt5960 * 128 + 64;
			Static64.anInt1797 = Static354.anInt6757 * 128 + 64;
			Static95.anInt2319 = Static94.method2022(Static64.anInt1797, Static320.anInt5326, Static242.anInt6745) - Static41.anInt1307;
		}
		Static147.anInt3204 = 2;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3165(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(65) int local65;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local65 = 0; local65 < arg0; local65++) {
				if (local26 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(104) int local104;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local104 = 0; local104 < arg0; local104++) {
				if (local104 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(155) int local155;
		for (local104 = arg0 - 1; local104 >= 0; local104--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local104 <= local155) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(200) int local200;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local200 = 0; local200 < arg0; local200++) {
				if (local155 >> 1 >= local200) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(241) int local241;
		for (local200 = 0; local200 < arg0; local200++) {
			for (local241 = 0; local241 < arg0; local241++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local200 << 1 <= local241) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(298) int local298;
		for (local241 = 0; local241 < arg0; local241++) {
			for (local298 = arg0 - 1; local298 >= 0; local298--) {
				if (local241 >> 1 >= local298) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(351) int local351;
		for (local298 = arg0 - 1; local298 >= 0; local298--) {
			for (local351 = arg0 - 1; local351 >= 0; local351--) {
				if (local351 >= local298 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(395) int local395;
		for (local351 = arg0 - 1; local351 >= 0; local351--) {
			for (local395 = arg0 - 1; local395 >= 0; local395--) {
				if (local395 <= local351 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(452) int local452;
		for (local395 = arg0 - 1; local395 >= 0; local395--) {
			for (local452 = 0; local452 < arg0; local452++) {
				if (local452 >= local395 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(498) int local498;
		for (local452 = 0; local452 < arg0; local452++) {
			for (local498 = 0; local498 < arg0; local498++) {
				if (local452 >> 1 >= local498) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(551) int local551;
		for (local498 = 0; local498 < arg0; local498++) {
			for (local551 = arg0 - 1; local551 >= 0; local551--) {
				if (local551 >= local498 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(602) int local602;
		for (local551 = arg0 - 1; local551 >= 0; local551--) {
			for (local602 = 0; local602 < arg0; local602++) {
				if (local551 >> 1 <= local602) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(648) int local648;
		for (local602 = 0; local602 < arg0; local602++) {
			for (local648 = 0; local648 < arg0; local648++) {
				if (local602 << 1 >= local648) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(701) int local701;
		for (local648 = 0; local648 < arg0; local648++) {
			for (local701 = arg0 - 1; local701 >= 0; local701--) {
				if (local648 >> 1 <= local701) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(746) int local746;
		for (local701 = arg0 - 1; local701 >= 0; local701--) {
			for (local746 = arg0 - 1; local746 >= 0; local746--) {
				if (local746 <= local701 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(794) int local794;
		for (local746 = arg0 - 1; local746 >= 0; local746--) {
			for (local794 = arg0 - 1; local794 >= 0; local794--) {
				if (local794 >= local746 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(843) int local843;
		for (local794 = arg0 - 1; local794 >= 0; local794--) {
			for (local843 = 0; local843 < arg0; local843++) {
				if (local843 <= local794 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(889) int local889;
		for (local843 = 0; local843 < arg0; local843++) {
			for (local889 = 0; local889 < arg0; local889++) {
				if (local843 >> 1 <= local889) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(934) int local934;
		for (local889 = 0; local889 < arg0; local889++) {
			for (local934 = arg0 - 1; local934 >= 0; local934--) {
				if (local934 <= local889 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(976) int local976;
		for (local934 = 0; local934 < arg0; local934++) {
			for (local976 = 0; local976 < arg0; local976++) {
				if (arg0 / 2 >= local976) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1023) int local1023;
		for (local976 = 0; local976 < arg0; local976++) {
			for (local1023 = 0; local1023 < arg0; local1023++) {
				if (arg0 / 2 >= local976) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1070) int local1070;
		for (local1023 = 0; local1023 < arg0; local1023++) {
			for (local1070 = 0; local1070 < arg0; local1070++) {
				if (arg0 / 2 <= local1070) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1113) int local1113;
		for (local1070 = 0; local1070 < arg0; local1070++) {
			for (local1113 = 0; local1113 < arg0; local1113++) {
				if (arg0 / 2 <= local1070) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1156) int local1156;
		for (local1113 = 0; local1113 < arg0; local1113++) {
			for (local1156 = 0; local1156 < arg0; local1156++) {
				if (local1113 - arg0 / 2 >= local1156) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1200) int local1200;
		for (local1156 = arg0 - 1; local1156 >= 0; local1156--) {
			for (local1200 = 0; local1200 < arg0; local1200++) {
				if (local1156 - arg0 / 2 >= local1200) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1248) int local1248;
		for (local1200 = arg0 - 1; local1200 >= 0; local1200--) {
			for (local1248 = arg0 - 1; local1248 >= 0; local1248--) {
				if (local1248 <= local1200 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1297) int local1297;
		for (local1248 = 0; local1248 < arg0; local1248++) {
			for (local1297 = arg0 - 1; local1297 >= 0; local1297--) {
				if (local1248 - arg0 / 2 >= local1297) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1345) int local1345;
		for (local1297 = 0; local1297 < arg0; local1297++) {
			for (local1345 = 0; local1345 < arg0; local1345++) {
				if (local1345 >= local1297 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1389) int local1389;
		for (local1345 = arg0 - 1; local1345 >= 0; local1345--) {
			for (local1389 = 0; local1389 < arg0; local1389++) {
				if (local1389 >= local1345 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1442) int local1442;
		for (local1389 = arg0 - 1; local1389 >= 0; local1389--) {
			for (local1442 = arg0 - 1; local1442 >= 0; local1442--) {
				if (local1442 >= local1389 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1442 = 0; local1442 < arg0; local1442++) {
			for (@Pc(1487) int local1487 = arg0 - 1; local1487 >= 0; local1487--) {
				if (local1442 - arg0 / 2 <= local1487) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
