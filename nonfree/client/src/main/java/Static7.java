import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "O", descriptor = "Lclient!fd;")
	public static Class25 aClass25_48;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	public static int anInt4637 = 0;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1325 = Static158.method3034("New User");

	@OriginalMember(owner = "client!af", name = "B", descriptor = "[I")
	public static final int[] anIntArray506 = new int[4000];

	@OriginalMember(owner = "client!af", name = "D", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_70 = new Class89(64);

	@OriginalMember(owner = "client!af", name = "E", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1326 = aClass60_1325;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1327 = Static158.method3034("Hidden)2");

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1328 = Static158.method3034("null");

	@OriginalMember(owner = "client!af", name = "P", descriptor = "Lclient!ae;")
	public static final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_43 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIZIIIZLclient!hi;)V")
	public static void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class35 arg9) {
		if (arg4 && (Static147.aByteArrayArrayArray36[0][arg1][arg5] & 0x2) == 0) {
			if ((Static147.aByteArrayArrayArray36[arg3][arg1][arg5] & 0x10) != 0) {
				return;
			}
			if (Static6.method249(arg1, arg3, arg5) != Static53.anInt1670) {
				return;
			}
		}
		if (arg3 < Static93.anInt2725) {
			Static93.anInt2725 = arg3;
		}
		@Pc(55) Class2_Sub1_Sub9 local55 = Static158.method3037(arg2);
		@Pc(69) int local69;
		@Pc(66) int local66;
		if (arg0 == 1 || arg0 == 3) {
			local66 = local55.anInt1688;
			local69 = local55.anInt1683;
		} else {
			local66 = local55.anInt1683;
			local69 = local55.anInt1688;
		}
		@Pc(91) int local91;
		@Pc(89) int local89;
		if (arg1 + local69 > 104) {
			local89 = arg1 + 1;
			local91 = arg1;
		} else {
			local91 = arg1 + (local69 >> 1);
			local89 = (local69 + 1 >> 1) + arg1;
		}
		@Pc(127) int local127;
		@Pc(121) int local121;
		if (arg5 + local66 <= 104) {
			local121 = (local66 + 1 >> 1) + arg5;
			local127 = arg5 + (local66 >> 1);
		} else {
			local127 = arg5;
			local121 = arg5 + 1;
		}
		@Pc(139) int[][] local139 = Static32.anIntArrayArrayArray4[arg6];
		@Pc(166) int local166 = local139[local89][local127] + local139[local91][local127] + local139[local91][local121] + local139[local89][local121] >> 2;
		@Pc(174) int local174 = (local69 << 6) + (arg1 << 7);
		@Pc(182) int local182 = (local66 << 6) + (arg5 << 7);
		@Pc(199) long local199 = (long) ((arg0 | 0x400) << 20 | arg7 << 14 | arg1 | arg5 << 7);
		if (local55.anInt1669 == 0) {
			local199 |= Long.MIN_VALUE;
		}
		if (local55.anInt1651 == 1) {
			local199 |= 0x400000L;
		}
		local199 |= (long) arg2 << 32;
		if (arg8 && local55.method1258()) {
			Static2.method3175(arg5, arg3, local55, arg0, arg1);
		}
		@Pc(274) Class2_Sub1_Sub1 local274;
		@Pc(271) Class2_Sub1_Sub16 local271;
		if (arg7 == 22) {
			if (!arg4 || local55.anInt1669 != 0 || local55.anInt1674 == 1 || local55.aBoolean68) {
				if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
					local271 = local55.method1261(local174, 22, arg8, arg0, local166, local182, local139);
					local274 = local271.aClass2_Sub1_Sub1_8;
				} else {
					local274 = new Class2_Sub1_Sub1_Sub5(arg2, 22, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
				}
				Static70.method1639(arg3, arg1, arg5, local166, local274, local199, local55.aBoolean60);
				if (local55.anInt1674 == 1 && arg9 != null) {
					arg9.method1666(arg1, arg5);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
				local271 = local55.method1261(local174, 10, arg8, arg0, local166, local182, local139);
				local274 = local271.aClass2_Sub1_Sub1_8;
			} else {
				local274 = new Class2_Sub1_Sub1_Sub5(arg2, 10, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
			}
			if (local274 != null) {
				@Pc(379) boolean local379 = Static75.method1832(arg3, arg1, arg5, local166, local69, local66, local274, arg7 == 11 ? 256 : 0, local199);
				if (local55.aBoolean65 && local379 && arg8) {
					@Pc(388) int local388 = 15;
					if (local274 instanceof Class2_Sub1_Sub1_Sub4) {
						local388 = ((Class2_Sub1_Sub1_Sub4) local274).method1621() / 4;
						if (local388 > 30) {
							local388 = 30;
						}
					}
					for (@Pc(406) int local406 = 0; local406 <= local69; local406++) {
						for (@Pc(410) int local410 = 0; local410 <= local66; local410++) {
							if (local388 > Static54.aByteArrayArrayArray19[arg3][local406 + arg1][arg5 + local410]) {
								Static54.aByteArrayArrayArray19[arg3][local406 + arg1][local410 + arg5] = (byte) local388;
							}
						}
					}
				}
			}
			if (local55.anInt1674 != 0 && arg9 != null) {
				arg9.method1667(local69, local66, local55.aBoolean63, arg5, arg1);
			}
		} else if (arg7 >= 12) {
			if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
				local271 = local55.method1261(local174, arg7, arg8, arg0, local166, local182, local139);
				local274 = local271.aClass2_Sub1_Sub1_8;
			} else {
				local274 = new Class2_Sub1_Sub1_Sub5(arg2, arg7, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
			}
			Static75.method1832(arg3, arg1, arg5, local166, 1, 1, local274, 0, local199);
			if (arg8 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
				Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x924;
			}
			if (local55.anInt1674 != 0 && arg9 != null) {
				arg9.method1667(local69, local66, local55.aBoolean63, arg5, arg1);
			}
		} else if (arg7 == 0) {
			if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
				local271 = local55.method1261(local174, 0, arg8, arg0, local166, local182, local139);
				local274 = local271.aClass2_Sub1_Sub1_8;
			} else {
				local274 = new Class2_Sub1_Sub1_Sub5(arg2, 0, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
			}
			Static95.method2244(arg3, arg1, arg5, local166, local274, null, Static188.anIntArray487[arg0], 0, local199);
			if (arg8) {
				if (arg0 == 0) {
					if (local55.aBoolean65) {
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5] = 50;
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5 + 1] = 50;
					}
					if (local55.aBoolean67) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local55.aBoolean65) {
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5 + 1] = 50;
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5 + 1] = 50;
					}
					if (local55.aBoolean67) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local55.aBoolean65) {
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5] = 50;
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5 + 1] = 50;
					}
					if (local55.aBoolean67) {
						Static9.anIntArrayArrayArray1[arg3][arg1 + 1][arg5] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local55.aBoolean65) {
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5] = 50;
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5] = 50;
					}
					if (local55.aBoolean67) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x492;
					}
				}
			}
			if (local55.anInt1674 != 0 && arg9 != null) {
				arg9.method1673(arg7, arg0, local55.aBoolean63, arg1, arg5);
			}
			if (local55.anInt1664 != 16) {
				Static11.method309(arg3, arg1, arg5, local55.anInt1664);
			}
		} else if (arg7 == 1) {
			if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
				local271 = local55.method1261(local174, 1, arg8, arg0, local166, local182, local139);
				local274 = local271.aClass2_Sub1_Sub1_8;
			} else {
				local274 = new Class2_Sub1_Sub1_Sub5(arg2, 1, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
			}
			Static95.method2244(arg3, arg1, arg5, local166, local274, null, Static102.anIntArray338[arg0], 0, local199);
			if (local55.aBoolean65 && arg8) {
				if (arg0 == 0) {
					Static54.aByteArrayArrayArray19[arg3][arg1][arg5 + 1] = 50;
				} else if (arg0 == 1) {
					Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5 + 1] = 50;
				} else if (arg0 == 2) {
					Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5] = 50;
				} else if (arg0 == 3) {
					Static54.aByteArrayArrayArray19[arg3][arg1][arg5] = 50;
				}
			}
			if (local55.anInt1674 != 0 && arg9 != null) {
				arg9.method1673(arg7, arg0, local55.aBoolean63, arg1, arg5);
			}
		} else {
			@Pc(1010) int local1010;
			if (arg7 == 2) {
				local1010 = arg0 + 1 & 0x3;
				@Pc(1051) Class2_Sub1_Sub1 local1051;
				@Pc(1037) Class2_Sub1_Sub1 local1037;
				if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
					@Pc(1034) Class2_Sub1_Sub16 local1034 = local55.method1261(local174, 2, arg8, arg0 + 4, local166, local182, local139);
					local1037 = local1034.aClass2_Sub1_Sub1_8;
					@Pc(1048) Class2_Sub1_Sub16 local1048 = local55.method1261(local174, 2, arg8, local1010, local166, local182, local139);
					local1051 = local1048.aClass2_Sub1_Sub1_8;
				} else {
					local1037 = new Class2_Sub1_Sub1_Sub5(arg2, 2, arg0 + 4, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
					local1051 = new Class2_Sub1_Sub1_Sub5(arg2, 2, local1010, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
				}
				Static95.method2244(arg3, arg1, arg5, local166, local1037, local1051, Static188.anIntArray487[arg0], Static188.anIntArray487[local1010], local199);
				if (local55.aBoolean67 && arg8) {
					if (arg0 == 0) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x249;
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5 + 1] |= 0x492;
					} else if (arg0 == 1) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5 + 1] |= 0x492;
						Static9.anIntArrayArrayArray1[arg3][arg1 + 1][arg5] |= 0x249;
					} else if (arg0 == 2) {
						Static9.anIntArrayArrayArray1[arg3][arg1 + 1][arg5] |= 0x249;
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x492;
					} else if (arg0 == 3) {
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x492;
						Static9.anIntArrayArrayArray1[arg3][arg1][arg5] |= 0x249;
					}
				}
				if (local55.anInt1674 != 0 && arg9 != null) {
					arg9.method1673(arg7, arg0, local55.aBoolean63, arg1, arg5);
				}
				if (local55.anInt1664 != 16) {
					Static11.method309(arg3, arg1, arg5, local55.anInt1664);
				}
			} else if (arg7 == 3) {
				if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
					local271 = local55.method1261(local174, 3, arg8, arg0, local166, local182, local139);
					local274 = local271.aClass2_Sub1_Sub1_8;
				} else {
					local274 = new Class2_Sub1_Sub1_Sub5(arg2, 3, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
				}
				Static95.method2244(arg3, arg1, arg5, local166, local274, null, Static102.anIntArray338[arg0], 0, local199);
				if (local55.aBoolean65 && arg8) {
					if (arg0 == 0) {
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5 + 1] = 50;
					} else if (arg0 == 1) {
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5 + 1] = 50;
					} else if (arg0 == 2) {
						Static54.aByteArrayArrayArray19[arg3][arg1 + 1][arg5] = 50;
					} else if (arg0 == 3) {
						Static54.aByteArrayArrayArray19[arg3][arg1][arg5] = 50;
					}
				}
				if (local55.anInt1674 != 0 && arg9 != null) {
					arg9.method1673(arg7, arg0, local55.aBoolean63, arg1, arg5);
				}
			} else if (arg7 == 9) {
				if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
					local271 = local55.method1261(local174, arg7, arg8, arg0, local166, local182, local139);
					local274 = local271.aClass2_Sub1_Sub1_8;
				} else {
					local274 = new Class2_Sub1_Sub1_Sub5(arg2, arg7, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
				}
				Static75.method1832(arg3, arg1, arg5, local166, 1, 1, local274, 0, local199);
				if (local55.anInt1674 != 0 && arg9 != null) {
					arg9.method1667(local69, local66, local55.aBoolean63, arg5, arg1);
				}
				if (local55.anInt1664 != 16) {
					Static11.method309(arg3, arg1, arg5, local55.anInt1664);
				}
			} else if (arg7 == 4) {
				if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
					local271 = local55.method1261(local174, 4, arg8, arg0, local166, local182, local139);
					local274 = local271.aClass2_Sub1_Sub1_8;
				} else {
					local274 = new Class2_Sub1_Sub1_Sub5(arg2, 4, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
				}
				Static106.method2399(arg3, arg1, arg5, local166, local274, null, Static188.anIntArray487[arg0], 0, 0, 0, local199);
			} else {
				@Pc(1587) long local1587;
				@Pc(1625) Class2_Sub1_Sub1 local1625;
				@Pc(1622) Class2_Sub1_Sub16 local1622;
				if (arg7 == 5) {
					local1010 = 16;
					local1587 = Static197.method3579(arg3, arg1, arg5);
					if (local1587 != 0L) {
						local1010 = Static158.method3037((int) (local1587 >>> 32) & Integer.MAX_VALUE).anInt1664;
					}
					if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
						local1622 = local55.method1261(local174, 4, arg8, arg0, local166, local182, local139);
						local1625 = local1622.aClass2_Sub1_Sub1_8;
					} else {
						local1625 = new Class2_Sub1_Sub1_Sub5(arg2, 4, arg0, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
					}
					Static106.method2399(arg3, arg1, arg5, local166, local1625, null, Static188.anIntArray487[arg0], 0, Static186.anIntArray486[arg0] * local1010, Static189.anIntArray489[arg0] * local1010, local199);
				} else if (arg7 == 6) {
					local1010 = 8;
					local1587 = Static197.method3579(arg3, arg1, arg5);
					if (local1587 != 0L) {
						local1010 = Static158.method3037(Integer.MAX_VALUE & (int) (local1587 >>> 32)).anInt1664 / 2;
					}
					if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
						local1622 = local55.method1261(local174, 4, arg8, arg0 + 4, local166, local182, local139);
						local1625 = local1622.aClass2_Sub1_Sub1_8;
					} else {
						local1625 = new Class2_Sub1_Sub1_Sub5(arg2, 4, arg0 + 4, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
					}
					Static106.method2399(arg3, arg1, arg5, local166, local1625, null, 256, arg0, local1010 * Static128.anIntArray400[arg0], local1010 * Static163.anIntArray448[arg0], local199);
				} else if (arg7 == 7) {
					@Pc(1763) int local1763 = arg0 + 2 & 0x3;
					if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
						@Pc(1784) Class2_Sub1_Sub16 local1784 = local55.method1261(local174, 4, arg8, local1763 + 4, local166, local182, local139);
						local274 = local1784.aClass2_Sub1_Sub1_8;
					} else {
						local274 = new Class2_Sub1_Sub1_Sub5(arg2, 4, local1763 + 4, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
					}
					Static106.method2399(arg3, arg1, arg5, local166, local274, null, 256, local1763, 0, 0, local199);
				} else if (arg7 == 8) {
					local1010 = 8;
					local1587 = Static197.method3579(arg3, arg1, arg5);
					if (local1587 != 0L) {
						local1010 = Static158.method3037(Integer.MAX_VALUE & (int) (local1587 >>> 32)).anInt1664 / 2;
					}
					@Pc(1853) int local1853 = arg0 + 2 & 0x3;
					@Pc(1895) Class2_Sub1_Sub1 local1895;
					if (local55.anInt1667 == -1 && local55.anIntArray162 == null) {
						@Pc(1910) Class2_Sub1_Sub16 local1910 = local55.method1261(local174, 4, arg8, arg0 + 4, local166, local182, local139);
						local1625 = local1910.aClass2_Sub1_Sub1_8;
						@Pc(1926) Class2_Sub1_Sub16 local1926 = local55.method1261(local174, 4, arg8, local1853 + 4, local166, local182, local139);
						local1895 = local1926.aClass2_Sub1_Sub1_8;
					} else {
						local1625 = new Class2_Sub1_Sub1_Sub5(arg2, 4, arg0 + 4, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
						local1895 = new Class2_Sub1_Sub1_Sub5(arg2, 4, local1853 + 4, arg6, arg1, arg5, local55.anInt1667, local55.aBoolean66, null);
					}
					Static106.method2399(arg3, arg1, arg5, local166, local1625, local1895, 256, arg0, Static128.anIntArray400[arg0] * local1010, Static163.anIntArray448[arg0] * local1010, local199);
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIII)V")
	public static void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static163.method3070(arg1 + arg4, arg4 + -arg1, arg3, Static42.anIntArrayArray8[arg0]);
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg2 * arg2;
		@Pc(30) int local30 = arg1 * arg1;
		@Pc(34) int local34 = local26 << 1;
		@Pc(38) int local38 = local30 << 1;
		@Pc(42) int local42 = arg2 << 1;
		@Pc(50) int local50 = local34 + local30 * (1 - local42);
		@Pc(63) int local63 = local26 - (local42 - 1) * local38;
		@Pc(67) int local67 = local30 << 2;
		@Pc(71) int local71 = local26 << 2;
		@Pc(79) int local79 = local34 * 3;
		@Pc(85) int local85 = local67 * (arg2 - 1);
		@Pc(93) int local93 = local38 * ((arg2 << 1) - 3);
		@Pc(99) int local99 = local71;
		while (local22 > 0) {
			if (local50 < 0) {
				while (local50 < 0) {
					local3++;
					local50 += local79;
					local63 += local99;
					local99 += local71;
					local79 += local71;
				}
			}
			if (local63 < 0) {
				local50 += local79;
				local3++;
				local79 += local71;
				local63 += local99;
				local99 += local71;
			}
			local63 += -local93;
			local50 += -local85;
			local85 -= local67;
			local93 -= local67;
			local22--;
			@Pc(173) int local173 = arg4 + local3;
			@Pc(178) int local178 = arg0 + local22;
			@Pc(183) int local183 = arg0 - local22;
			@Pc(187) int local187 = arg4 - local3;
			Static163.method3070(local173, local187, arg3, Static42.anIntArrayArray8[local183]);
			Static163.method3070(local173, local187, arg3, Static42.anIntArrayArray8[local178]);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public static void method3564() {
		Static38.aClass89_11.method3439();
		Static38.aClass89_12.method3439();
		Static87.aClass89_30.method3439();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public static int method3570(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static127.method2669(arg0);
		@Pc(15) int local15 = local12.anInt1016;
		@Pc(18) int local18 = local12.anInt1014;
		@Pc(21) int local21 = local12.anInt1018;
		@Pc(28) int local28 = Class2_Sub1_Sub16.anIntArray418[local21 - local18];
		return local28 & Static163.anIntArray447[local15] >> local18;
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	public static void method3572() {
		Static148.anInt3844 = 0;
		Static122.anInt3358 = 0;
		Static71.method3262();
		Static93.method2183();
		Static174.method3265();
		Static188.method3445();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static122.anInt3358; local19++) {
			local25 = Static181.anIntArray475[local19];
			if (Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local25].anInt3299 != Static20.anInt580) {
				Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local25] = null;
			}
		}
		if (Static139.aClass2_Sub3_Sub1_32.anInt273 != Static168.anInt4121) {
			throw new RuntimeException("gpp1 pos:" + Static139.aClass2_Sub3_Sub1_32.anInt273 + " psize:" + Static168.anInt4121);
		}
		for (local25 = 0; local25 < Static166.anInt4101; local25++) {
			if (Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static166.anInt4101);
			}
		}
	}
}
