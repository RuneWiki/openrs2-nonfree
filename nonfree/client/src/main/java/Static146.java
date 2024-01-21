import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt3132;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_15;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1078 = Static151.method2243(" ");

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1079 = Static151.method2243(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public static int anInt3138 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[B)Lclient!mb;")
	public static Class62 method2188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) Class62 local5 = new Class62();
		local5.anInt2653 = 0;
		local5.aByteArray28 = new byte[arg1];
		for (@Pc(18) int local18 = arg0; local18 < arg1 + arg0; local18++) {
			if (arg2[local18] != 0) {
				local5.aByteArray28[local5.anInt2653++] = arg2[local18];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2189(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class2_Sub11 local4 = new Class2_Sub11(arg0);
		@Pc(16) int local16 = local4.method1534();
		@Pc(20) int local20 = local4.method1577();
		if (local20 < 0 || Static202.anInt4182 != 0 && Static202.anInt4182 < local20) {
			throw new RuntimeException();
		} else if (local16 == 0) {
			@Pc(42) byte[] local42 = new byte[local20];
			local4.method1541(local42, local20);
			return local42;
		} else {
			@Pc(54) int local54 = local4.method1577();
			if (local54 < 0 || Static202.anInt4182 != 0 && Static202.anInt4182 < local54) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local54];
			if (local16 == 1) {
				Static110.method1695(local72, local54, arg0, local20);
			} else {
				Static203.aClass11_1.method237(local72, local4);
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIZIIILclient!tf;BIZ)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class95 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg3 && (Static133.aByteArrayArrayArray11[0][arg4][arg5] & 0x2) == 0) {
			if ((Static133.aByteArrayArrayArray11[arg2][arg4][arg5] & 0x10) != 0) {
				return;
			}
			if (Static71.method992(arg4, arg2, arg5) != Static119.anInt2627) {
				return;
			}
		}
		if (arg2 < Static51.anInt1107) {
			Static51.anInt1107 = arg2;
		}
		@Pc(56) Class2_Sub1_Sub11 local56 = Static60.method844(arg1);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg6 == 1 || arg6 == 3) {
			local67 = local56.anInt1559;
			local70 = local56.anInt1556;
		} else {
			local67 = local56.anInt1556;
			local70 = local56.anInt1559;
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (arg5 + local70 > 104) {
			local88 = arg5 + 1;
			local90 = arg5;
		} else {
			local90 = (local70 >> 1) + arg5;
			local88 = (local70 + 1 >> 1) + arg5;
		}
		@Pc(128) int local128;
		@Pc(122) int local122;
		if (local67 + arg4 <= 104) {
			local122 = arg4 + (local67 + 1 >> 1);
			local128 = (local67 >> 1) + arg4;
		} else {
			local128 = arg4;
			local122 = arg4 + 1;
		}
		@Pc(140) int[][] local140 = Static171.anIntArrayArrayArray7[arg8];
		@Pc(148) int local148 = (arg4 << 7) + (local67 << 6);
		@Pc(156) int local156 = (arg5 << 7) + (local70 << 6);
		@Pc(182) int local182 = local140[local122][local88] + local140[local128][local88] + local140[local122][local90] + local140[local128][local90] >> 2;
		@Pc(199) long local199 = (long) ((arg6 | 0x400) << 20 | arg5 << 7 | arg4 | arg0 << 14);
		if (local56.anInt1561 == 0) {
			local199 |= Long.MIN_VALUE;
		}
		if (local56.anInt1549 == 1) {
			local199 |= 0x400000L;
		}
		local199 |= (long) arg1 << 32;
		if (arg9 && local56.method1071()) {
			Static186.method2678(arg5, arg6, arg4, arg2, local56);
		}
		@Pc(275) Class7 local275;
		@Pc(272) Class2_Sub1_Sub10 local272;
		if (arg0 == 22) {
			if (!arg3 || local56.anInt1561 != 0 || local56.anInt1550 == 1 || local56.aBoolean68) {
				if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
					local272 = local56.method1070(local156, arg6, 22, local148, arg9, local182, local140);
					local275 = local272.aClass7_6;
				} else {
					local275 = new Class7_Sub5(arg1, 22, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
				}
				Static178.method2579(arg2, arg4, arg5, local182, local275, local199, local56.aBoolean75);
				if (local56.anInt1550 == 1 && arg7 != null) {
					arg7.method2673(arg4, arg5);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
				local272 = local56.method1070(local156, arg6, 10, local148, arg9, local182, local140);
				local275 = local272.aClass7_6;
			} else {
				local275 = new Class7_Sub5(arg1, 10, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
			}
			if (local275 != null) {
				@Pc(379) boolean local379 = Static97.method1594(arg2, arg4, arg5, local182, local67, local70, local275, arg0 == 11 ? 256 : 0, local199);
				if (local56.aBoolean74 && local379 && arg9) {
					@Pc(388) int local388 = 15;
					if (local275 instanceof Class7_Sub7) {
						local388 = ((Class7_Sub7) local275).method3168() / 4;
						if (local388 > 30) {
							local388 = 30;
						}
					}
					for (@Pc(406) int local406 = 0; local406 <= local67; local406++) {
						for (@Pc(410) int local410 = 0; local410 <= local70; local410++) {
							if (local388 > Static199.aByteArrayArrayArray17[arg2][arg4 + local406][local410 + arg5]) {
								Static199.aByteArrayArrayArray17[arg2][arg4 + local406][local410 + arg5] = (byte) local388;
							}
						}
					}
				}
			}
			if (local56.anInt1550 != 0 && arg7 != null) {
				arg7.method2666(local67, arg4, local70, arg5, local56.aBoolean72);
			}
		} else if (arg0 >= 12) {
			if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
				local272 = local56.method1070(local156, arg6, arg0, local148, arg9, local182, local140);
				local275 = local272.aClass7_6;
			} else {
				local275 = new Class7_Sub5(arg1, arg0, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
			}
			Static97.method1594(arg2, arg4, arg5, local182, 1, 1, local275, 0, local199);
			if (arg9 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
				Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x924;
			}
			if (local56.anInt1550 != 0 && arg7 != null) {
				arg7.method2666(local67, arg4, local70, arg5, local56.aBoolean72);
			}
		} else if (arg0 == 0) {
			if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
				local272 = local56.method1070(local156, arg6, 0, local148, arg9, local182, local140);
				local275 = local272.aClass7_6;
			} else {
				local275 = new Class7_Sub5(arg1, 0, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
			}
			Static163.method2393(arg2, arg4, arg5, local182, local275, null, Static77.anIntArray309[arg6], 0, local199);
			if (arg9) {
				if (arg6 == 0) {
					if (local56.aBoolean74) {
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5] = 50;
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5 + 1] = 50;
					}
					if (local56.aBoolean69) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
					}
				} else if (arg6 == 1) {
					if (local56.aBoolean74) {
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5 + 1] = 50;
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5 + 1] = 50;
					}
					if (local56.aBoolean69) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
					}
				} else if (arg6 == 2) {
					if (local56.aBoolean74) {
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5] = 50;
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5 + 1] = 50;
					}
					if (local56.aBoolean69) {
						Static102.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
					}
				} else if (arg6 == 3) {
					if (local56.aBoolean74) {
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5] = 50;
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5] = 50;
					}
					if (local56.aBoolean69) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
					}
				}
			}
			if (local56.anInt1550 != 0 && arg7 != null) {
				arg7.method2664(arg0, arg4, arg6, arg5, local56.aBoolean72);
			}
			if (local56.anInt1568 != 16) {
				Static80.method1136(arg2, arg4, arg5, local56.anInt1568);
			}
		} else if (arg0 == 1) {
			if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
				local272 = local56.method1070(local156, arg6, 1, local148, arg9, local182, local140);
				local275 = local272.aClass7_6;
			} else {
				local275 = new Class7_Sub5(arg1, 1, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
			}
			Static163.method2393(arg2, arg4, arg5, local182, local275, null, Static213.anIntArray399[arg6], 0, local199);
			if (local56.aBoolean74 && arg9) {
				if (arg6 == 0) {
					Static199.aByteArrayArrayArray17[arg2][arg4][arg5 + 1] = 50;
				} else if (arg6 == 1) {
					Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5 + 1] = 50;
				} else if (arg6 == 2) {
					Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5] = 50;
				} else if (arg6 == 3) {
					Static199.aByteArrayArrayArray17[arg2][arg4][arg5] = 50;
				}
			}
			if (local56.anInt1550 != 0 && arg7 != null) {
				arg7.method2664(arg0, arg4, arg6, arg5, local56.aBoolean72);
			}
		} else {
			@Pc(1010) int local1010;
			if (arg0 == 2) {
				local1010 = arg6 + 1 & 0x3;
				@Pc(1050) Class7 local1050;
				@Pc(1035) Class7 local1035;
				if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
					@Pc(1066) Class2_Sub1_Sub10 local1066 = local56.method1070(local156, arg6 + 4, 2, local148, arg9, local182, local140);
					local1035 = local1066.aClass7_6;
					@Pc(1080) Class2_Sub1_Sub10 local1080 = local56.method1070(local156, local1010, 2, local148, arg9, local182, local140);
					local1050 = local1080.aClass7_6;
				} else {
					local1035 = new Class7_Sub5(arg1, 2, arg6 + 4, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
					local1050 = new Class7_Sub5(arg1, 2, local1010, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
				}
				Static163.method2393(arg2, arg4, arg5, local182, local1035, local1050, Static77.anIntArray309[arg6], Static77.anIntArray309[local1010], local199);
				if (local56.aBoolean69 && arg9) {
					if (arg6 == 0) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
					} else if (arg6 == 1) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
						Static102.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
					} else if (arg6 == 2) {
						Static102.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
					} else if (arg6 == 3) {
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
						Static102.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
					}
				}
				if (local56.anInt1550 != 0 && arg7 != null) {
					arg7.method2664(arg0, arg4, arg6, arg5, local56.aBoolean72);
				}
				if (local56.anInt1568 != 16) {
					Static80.method1136(arg2, arg4, arg5, local56.anInt1568);
				}
			} else if (arg0 == 3) {
				if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
					local272 = local56.method1070(local156, arg6, 3, local148, arg9, local182, local140);
					local275 = local272.aClass7_6;
				} else {
					local275 = new Class7_Sub5(arg1, 3, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
				}
				Static163.method2393(arg2, arg4, arg5, local182, local275, null, Static213.anIntArray399[arg6], 0, local199);
				if (local56.aBoolean74 && arg9) {
					if (arg6 == 0) {
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5 + 1] = 50;
					} else if (arg6 == 1) {
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5 + 1] = 50;
					} else if (arg6 == 2) {
						Static199.aByteArrayArrayArray17[arg2][arg4 + 1][arg5] = 50;
					} else if (arg6 == 3) {
						Static199.aByteArrayArrayArray17[arg2][arg4][arg5] = 50;
					}
				}
				if (local56.anInt1550 != 0 && arg7 != null) {
					arg7.method2664(arg0, arg4, arg6, arg5, local56.aBoolean72);
				}
			} else if (arg0 == 9) {
				if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
					local272 = local56.method1070(local156, arg6, arg0, local148, arg9, local182, local140);
					local275 = local272.aClass7_6;
				} else {
					local275 = new Class7_Sub5(arg1, arg0, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
				}
				Static97.method1594(arg2, arg4, arg5, local182, 1, 1, local275, 0, local199);
				if (local56.anInt1550 != 0 && arg7 != null) {
					arg7.method2666(local67, arg4, local70, arg5, local56.aBoolean72);
				}
				if (local56.anInt1568 != 16) {
					Static80.method1136(arg2, arg4, arg5, local56.anInt1568);
				}
			} else if (arg0 == 4) {
				if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
					local272 = local56.method1070(local156, arg6, 4, local148, arg9, local182, local140);
					local275 = local272.aClass7_6;
				} else {
					local275 = new Class7_Sub5(arg1, 4, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
				}
				Static113.method1736(arg2, arg4, arg5, local182, local275, null, Static77.anIntArray309[arg6], 0, 0, 0, local199);
			} else {
				@Pc(1577) long local1577;
				@Pc(1615) Class7 local1615;
				@Pc(1628) Class2_Sub1_Sub10 local1628;
				if (arg0 == 5) {
					local1010 = 16;
					local1577 = Static77.method2472(arg2, arg4, arg5);
					if (local1577 != 0L) {
						local1010 = Static60.method844((int) (local1577 >>> 32) & Integer.MAX_VALUE).anInt1568;
					}
					if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
						local1628 = local56.method1070(local156, arg6, 4, local148, arg9, local182, local140);
						local1615 = local1628.aClass7_6;
					} else {
						local1615 = new Class7_Sub5(arg1, 4, arg6, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
					}
					Static113.method1736(arg2, arg4, arg5, local182, local1615, null, Static77.anIntArray309[arg6], 0, local1010 * Static12.anIntArray28[arg6], local1010 * Static169.anIntArray308[arg6], local199);
				} else if (arg0 == 6) {
					local1010 = 8;
					local1577 = Static77.method2472(arg2, arg4, arg5);
					if (local1577 != 0L) {
						local1010 = Static60.method844((int) (local1577 >>> 32) & Integer.MAX_VALUE).anInt1568 / 2;
					}
					if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
						local1628 = local56.method1070(local156, arg6 + 4, 4, local148, arg9, local182, local140);
						local1615 = local1628.aClass7_6;
					} else {
						local1615 = new Class7_Sub5(arg1, 4, arg6 + 4, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
					}
					Static113.method1736(arg2, arg4, arg5, local182, local1615, null, 256, arg6, local1010 * Static101.anIntArray210[arg6], local1010 * Static206.anIntArray31[arg6], local199);
				} else if (arg0 == 7) {
					@Pc(1756) int local1756 = arg6 + 2 & 0x3;
					if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
						@Pc(1776) Class2_Sub1_Sub10 local1776 = local56.method1070(local156, local1756 + 4, 4, local148, arg9, local182, local140);
						local275 = local1776.aClass7_6;
					} else {
						local275 = new Class7_Sub5(arg1, 4, local1756 + 4, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
					}
					Static113.method1736(arg2, arg4, arg5, local182, local275, null, 256, local1756, 0, 0, local199);
				} else if (arg0 == 8) {
					local1577 = Static77.method2472(arg2, arg4, arg5);
					local1010 = 8;
					if (local1577 != 0L) {
						local1010 = Static60.method844((int) (local1577 >>> 32) & Integer.MAX_VALUE).anInt1568 / 2;
					}
					@Pc(1843) int local1843 = arg6 + 2 & 0x3;
					@Pc(1882) Class7 local1882;
					if (local56.anInt1562 == -1 && local56.anIntArray133 == null) {
						@Pc(1863) Class2_Sub1_Sub10 local1863 = local56.method1070(local156, arg6 + 4, 4, local148, arg9, local182, local140);
						local1615 = local1863.aClass7_6;
						@Pc(1879) Class2_Sub1_Sub10 local1879 = local56.method1070(local156, local1843 + 4, 4, local148, arg9, local182, local140);
						local1882 = local1879.aClass7_6;
					} else {
						local1615 = new Class7_Sub5(arg1, 4, arg6 + 4, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
						local1882 = new Class7_Sub5(arg1, 4, local1843 + 4, arg8, arg4, arg5, local56.anInt1562, local56.aBoolean71, null);
					}
					Static113.method1736(arg2, arg4, arg5, local182, local1615, local1882, 256, arg6, Static101.anIntArray210[arg6] * local1010, local1010 * Static206.anIntArray31[arg6], local199);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBI)I")
	public static int method2192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static65.method899(arg1 - 1, arg0 + -1) + Static65.method899(arg1 - 1, arg0 - -1) + Static65.method899(arg1 + 1, arg0 + -1) + Static65.method899(arg1 - -1, arg0 + 1);
		@Pc(79) int local79 = Static65.method899(arg1, arg0 - 1) + Static65.method899(arg1, arg0 + 1) + Static65.method899(arg1 - 1, arg0) + Static65.method899(arg1 + 1, arg0);
		@Pc(84) int local84 = Static65.method899(arg1, arg0);
		return local79 / 8 + local49 / 16 + local84 / 4;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
	public static int method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!mb;I)Z")
	public static boolean method2194(@OriginalArg(0) Class62 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static125.anInt2769; local11++) {
			if (arg0.method1858(Static86.aClass62Array104[local11])) {
				return true;
			}
		}
		return false;
	}
}
