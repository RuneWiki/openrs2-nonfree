import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public static int anInt4379;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1157 = Static231.method3737(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "[Lclient!ai;")
	public static Class5_Sub1[] aClass5_Sub1Array1 = new Class5_Sub1[4];

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1158 = Static231.method3737("Loaded textures");

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1159 = aClass107_1158;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public static void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(14) int local14 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static44.anIntArray101[local28] != arg1) {
				local8[local14] = Static44.anIntArray101[local28];
				local17[local14] = Static40.anIntArray85[local28];
				local14++;
			}
		}
		Static40.anIntArray85 = local17;
		Static44.anIntArray101 = local8;
		Static201.method3224(Static8.aClass54Array1, Static8.aClass54Array1.length - 1, 0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!pe;)V")
	public static void method3236(@OriginalArg(1) Class1_Sub2_Sub15 arg0) {
		arg0.method3327(Static175.aClass107_1034, Static158.anInt3484 / 2, Static180.anInt4990 / 2 - 26, 16777215, -1);
		@Pc(22) int local22 = Static180.anInt4990 / 2 - 18;
		Static205.method3249(Static158.anInt3484 / 2 - 152, local22, 304, 34, 9179409);
		Static205.method3249(Static158.anInt3484 / 2 - 151, local22 + 1, 302, 32, 0);
		Static205.method3250(Static158.anInt3484 / 2 - 150, local22 + 2, Static70.anInt1592 * 3, 30, 9179409);
		Static205.method3250(Static70.anInt1592 * 3 + Static158.anInt3484 / 2 - 150, local22 + 2, 300 - Static70.anInt1592 * 3, 30, 0);
		arg0.method3327(Static196.aClass107_1124, Static158.anInt3484 / 2, Static180.anInt4990 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!jc;ZIIIIIIZI)V")
	public static void method3237(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8) {
		if (arg7 && !Static155.method412() && (Static221.aByteArrayArrayArray14[0][arg4][arg6] & 0x2) == 0) {
			if ((Static221.aByteArrayArrayArray14[arg3][arg4][arg6] & 0x10) != 0) {
				return;
			}
			if (Static75.method1339(arg6, arg4, arg3) != Static166.anInt4347) {
				return;
			}
		}
		if (Static203.anInt207 > arg3) {
			Static203.anInt207 = arg3;
		}
		@Pc(48) Class101 local48 = Static170.method2725(arg0);
		@Pc(61) int local61;
		@Pc(64) int local64;
		if (arg5 == 1 || arg5 == 3) {
			local64 = local48.anInt3922;
			local61 = local48.anInt3904;
		} else {
			local61 = local48.anInt3922;
			local64 = local48.anInt3904;
		}
		@Pc(94) int local94;
		@Pc(88) int local88;
		if (arg4 + local61 <= 104) {
			local88 = arg4 + (local61 + 1 >> 1);
			local94 = (local61 >> 1) + arg4;
		} else {
			local94 = arg4;
			local88 = arg4 + 1;
		}
		@Pc(114) int local114;
		@Pc(112) int local112;
		if (arg6 + local64 > 104) {
			local112 = arg6 + 1;
			local114 = arg6;
		} else {
			local112 = arg6 + (local64 + 1 >> 1);
			local114 = arg6 + (local64 >> 1);
		}
		@Pc(134) int[][] local134 = Static166.anIntArrayArrayArray11[arg8];
		@Pc(143) int local143 = (arg6 << 7) + (local64 << 6);
		@Pc(151) int local151 = (arg4 << 7) + (local61 << 6);
		@Pc(177) int local177 = local134[local88][local112] + local134[local94][local112] + local134[local88][local114] + local134[local94][local114] >> 2;
		@Pc(179) int[][] local179 = null;
		@Pc(196) long local196 = (long) ((arg5 | 0x400) << 20 | arg2 << 14 | arg4 | arg6 << 7);
		if (arg8 < 3) {
			local179 = Static166.anIntArrayArrayArray11[arg8 + 1];
		}
		if (local48.anInt3896 == 0) {
			local196 |= Long.MIN_VALUE;
		}
		if (local48.anInt3925 == 1) {
			local196 |= 0x400000L;
		}
		if (local48.aBoolean354) {
			local196 |= 0x80000000L;
		}
		local196 |= (long) arg0 << 32;
		if (local48.method2847()) {
			Static194.method3159(null, null, local48, arg5, arg4, arg3, arg6);
		}
		@Pc(274) boolean local274 = local48.aBoolean350 & true;
		@Pc(317) Class5 local317;
		@Pc(314) Class80 local314;
		if (arg2 == 22) {
			if (Static163.aBoolean317 || local48.anInt3896 != 0 || local48.anInt3921 == 1 || local48.aBoolean347) {
				if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
					local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 22, local274);
					local317 = local314.aClass5_7;
				} else {
					local317 = new Class5_Sub7(arg0, 22, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
				}
				Static25.method451(arg3, arg4, arg6, local177, local317, local196, local48.aBoolean349);
				if (local48.anInt3921 == 1 && arg1 != null) {
					arg1.method1683(arg6, arg4);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
				local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg2 == 11 ? arg5 + 4 : arg5, 10, local274);
				local317 = local314.aClass5_7;
			} else {
				local317 = new Class5_Sub7(arg0, 10, arg2 == 11 ? arg5 + 4 : arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
			}
			if (local317 != null) {
				@Pc(438) boolean local438 = Static118.method2046(arg3, arg4, arg6, local177, local61, local64, local317, local196);
				if (local48.aBoolean351 && local438 && arg7) {
					@Pc(447) int local447 = 15;
					if (local317 instanceof Class5_Sub3) {
						local447 = ((Class5_Sub3) local317).method548() / 4;
						if (local447 > 30) {
							local447 = 30;
						}
					}
					for (@Pc(465) int local465 = 0; local465 <= local61; local465++) {
						for (@Pc(469) int local469 = 0; local469 <= local64; local469++) {
							if (local447 > Static88.aByteArrayArrayArray8[arg3][arg4 + local465][local469 + arg6]) {
								Static88.aByteArrayArrayArray8[arg3][arg4 + local465][local469 + arg6] = (byte) local447;
							}
						}
					}
				}
			}
			if (local48.anInt3921 != 0 && arg1 != null) {
				arg1.method1677(local61, arg6, local48.aBoolean346, arg4, local64);
			}
		} else if (arg2 >= 12) {
			if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
				local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, arg2, local274);
				local317 = local314.aClass5_7;
			} else {
				local317 = new Class5_Sub7(arg0, arg2, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
			}
			Static118.method2046(arg3, arg4, arg6, local177, 1, 1, local317, local196);
			if (arg7 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0) {
				Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x4;
			}
			if (local48.anInt3921 != 0 && arg1 != null) {
				arg1.method1677(local61, arg6, local48.aBoolean346, arg4, local64);
			}
		} else if (arg2 == 0) {
			if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
				local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 0, local274);
				local317 = local314.aClass5_7;
			} else {
				local317 = new Class5_Sub7(arg0, 0, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
			}
			Static8.method251(arg3, arg4, arg6, local177, local317, null, Static108.anIntArray228[arg5], 0, local196);
			if (arg7) {
				if (arg5 == 0) {
					if (local48.aBoolean351) {
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6] = 50;
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6 + 1] = 50;
					}
					if (local48.aBoolean348) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x1;
					}
				} else if (arg5 == 1) {
					if (local48.aBoolean351) {
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6 + 1] = 50;
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6 + 1] = 50;
					}
					if (local48.aBoolean348) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6 + 1] |= 0x2;
					}
				} else if (arg5 == 2) {
					if (local48.aBoolean351) {
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6] = 50;
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6 + 1] = 50;
					}
					if (local48.aBoolean348) {
						Static13.anIntArrayArrayArray1[arg3][arg4 + 1][arg6] |= 0x1;
					}
				} else if (arg5 == 3) {
					if (local48.aBoolean351) {
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6] = 50;
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6] = 50;
					}
					if (local48.aBoolean348) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x2;
					}
				}
			}
			if (local48.anInt3921 != 0 && arg1 != null) {
				arg1.method1678(arg6, arg4, arg2, arg5, local48.aBoolean346);
			}
			if (local48.anInt3902 != 16) {
				Static51.method2307(arg3, arg4, arg6, local48.anInt3902);
			}
		} else if (arg2 == 1) {
			if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
				local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 1, local274);
				local317 = local314.aClass5_7;
			} else {
				local317 = new Class5_Sub7(arg0, 1, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
			}
			Static8.method251(arg3, arg4, arg6, local177, local317, null, Static162.anIntArray309[arg5], 0, local196);
			if (local48.aBoolean351 && arg7) {
				if (arg5 == 0) {
					Static88.aByteArrayArrayArray8[arg3][arg4][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					Static88.aByteArrayArrayArray8[arg3][arg4][arg6] = 50;
				}
			}
			if (local48.anInt3921 != 0 && arg1 != null) {
				arg1.method1678(arg6, arg4, arg2, arg5, local48.aBoolean346);
			}
		} else {
			@Pc(1065) int local1065;
			if (arg2 == 2) {
				local1065 = arg5 + 1 & 0x3;
				@Pc(1105) Class5 local1105;
				@Pc(1090) Class5 local1090;
				if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
					@Pc(1124) Class80 local1124 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5 + 4, 2, local274);
					local1090 = local1124.aClass5_7;
					@Pc(1141) Class80 local1141 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, local1065, 2, local274);
					local1105 = local1141.aClass5_7;
				} else {
					local1090 = new Class5_Sub7(arg0, 2, arg5 + 4, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
					local1105 = new Class5_Sub7(arg0, 2, local1065, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
				}
				Static8.method251(arg3, arg4, arg6, local177, local1090, local1105, Static108.anIntArray228[arg5], Static108.anIntArray228[local1065], local196);
				if (local48.aBoolean348 && arg7) {
					if (arg5 == 0) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x1;
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6 + 1] |= 0x2;
					} else if (arg5 == 1) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6 + 1] |= 0x2;
						Static13.anIntArrayArrayArray1[arg3][arg4 + 1][arg6] |= 0x1;
					} else if (arg5 == 2) {
						Static13.anIntArrayArrayArray1[arg3][arg4 + 1][arg6] |= 0x1;
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x2;
					} else if (arg5 == 3) {
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x2;
						Static13.anIntArrayArrayArray1[arg3][arg4][arg6] |= 0x1;
					}
				}
				if (local48.anInt3921 != 0 && arg1 != null) {
					arg1.method1678(arg6, arg4, arg2, arg5, local48.aBoolean346);
				}
				if (local48.anInt3902 != 16) {
					Static51.method2307(arg3, arg4, arg6, local48.anInt3902);
				}
			} else if (arg2 == 3) {
				if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
					local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 3, local274);
					local317 = local314.aClass5_7;
				} else {
					local317 = new Class5_Sub7(arg0, 3, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
				}
				Static8.method251(arg3, arg4, arg6, local177, local317, null, Static162.anIntArray309[arg5], 0, local196);
				if (local48.aBoolean351 && arg7) {
					if (arg5 == 0) {
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6 + 1] = 50;
					} else if (arg5 == 1) {
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6 + 1] = 50;
					} else if (arg5 == 2) {
						Static88.aByteArrayArrayArray8[arg3][arg4 + 1][arg6] = 50;
					} else if (arg5 == 3) {
						Static88.aByteArrayArrayArray8[arg3][arg4][arg6] = 50;
					}
				}
				if (local48.anInt3921 != 0 && arg1 != null) {
					arg1.method1678(arg6, arg4, arg2, arg5, local48.aBoolean346);
				}
			} else if (arg2 == 9) {
				if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
					local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, arg2, local274);
					local317 = local314.aClass5_7;
				} else {
					local317 = new Class5_Sub7(arg0, arg2, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
				}
				Static118.method2046(arg3, arg4, arg6, local177, 1, 1, local317, local196);
				if (local48.anInt3921 != 0 && arg1 != null) {
					arg1.method1677(local61, arg6, local48.aBoolean346, arg4, local64);
				}
				if (local48.anInt3902 != 16) {
					Static51.method2307(arg3, arg4, arg6, local48.anInt3902);
				}
			} else if (arg2 == 4) {
				if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
					local314 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 4, local274);
					local317 = local314.aClass5_7;
				} else {
					local317 = new Class5_Sub7(arg0, 4, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
				}
				Static125.method2097(arg3, arg4, arg6, local177, local317, null, Static108.anIntArray228[arg5], 0, 0, 0, local196);
			} else {
				@Pc(1662) long local1662;
				@Pc(1700) Class5 local1700;
				@Pc(1697) Class80 local1697;
				if (arg2 == 5) {
					local1065 = 16;
					local1662 = Static222.method2957(arg3, arg4, arg6);
					if (local1662 != 0L) {
						local1065 = Static170.method2725(Integer.MAX_VALUE & (int) (local1662 >>> 32)).anInt3902;
					}
					if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
						local1697 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5, 4, local274);
						local1700 = local1697.aClass5_7;
					} else {
						local1700 = new Class5_Sub7(arg0, 4, arg5, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
					}
					Static125.method2097(arg3, arg4, arg6, local177, local1700, null, Static108.anIntArray228[arg5], 0, Static129.anIntArray248[arg5] * local1065, Static72.anIntArray152[arg5] * local1065, local196);
				} else if (arg2 == 6) {
					local1065 = 8;
					local1662 = Static222.method2957(arg3, arg4, arg6);
					if (local1662 != 0L) {
						local1065 = Static170.method2725(Integer.MAX_VALUE & (int) (local1662 >>> 32)).anInt3902 / 2;
					}
					if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
						local1697 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5 + 4, 4, local274);
						local1700 = local1697.aClass5_7;
					} else {
						local1700 = new Class5_Sub7(arg0, 4, arg5 + 4, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
					}
					Static125.method2097(arg3, arg4, arg6, local177, local1700, null, 256, arg5, local1065 * Static123.anIntArray240[arg5], local1065 * Static212.anIntArray368[arg5], local196);
				} else if (arg2 == 7) {
					@Pc(1847) int local1847 = arg5 + 2 & 0x3;
					if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
						@Pc(1890) Class80 local1890 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, local1847 + 4, 4, local274);
						local317 = local1890.aClass5_7;
					} else {
						local317 = new Class5_Sub7(arg0, 4, local1847 + 4, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
					}
					Static125.method2097(arg3, arg4, arg6, local177, local317, null, 256, local1847, 0, 0, local196);
				} else if (arg2 == 8) {
					local1662 = Static222.method2957(arg3, arg4, arg6);
					local1065 = 8;
					if (local1662 != 0L) {
						local1065 = Static170.method2725((int) (local1662 >>> 32) & Integer.MAX_VALUE).anInt3902 / 2;
					}
					@Pc(1940) int local1940 = arg5 + 2 & 0x3;
					@Pc(1985) Class5 local1985;
					if (local48.anInt3909 == -1 && local48.anIntArray338 == null) {
						@Pc(1963) Class80 local1963 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, arg5 + 4, 4, local274);
						local1700 = local1963.aClass5_7;
						@Pc(1982) Class80 local1982 = local48.method2839(local143, arg7, local134, local179, local151, null, local177, local1940 + 4, 4, local274);
						local1985 = local1982.aClass5_7;
					} else {
						local1700 = new Class5_Sub7(arg0, 4, arg5 + 4, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
						local1985 = new Class5_Sub7(arg0, 4, local1940 + 4, arg8, arg4, arg6, local48.anInt3909, local48.aBoolean353, null);
					}
					Static125.method2097(arg3, arg4, arg6, local177, local1700, local1985, 256, arg5, Static123.anIntArray240[arg5] * local1065, local1065 * Static212.anIntArray368[arg5], local196);
				}
			}
		}
	}
}
