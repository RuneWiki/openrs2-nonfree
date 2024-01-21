import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 aClass8_Sub1_Sub3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
	public static int[] anIntArray63 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_265 = Static56.method816("Members object");

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_264 = aClass34_265;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[B")
	public static byte[] aByteArray4 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!ic;")
	private static Class34 aClass34_266 = Static56.method816("Welcome to RuneScape");

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_267 = Static56.method816(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!ic;")
	public static Class34 aClass34_268 = Static56.method816("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "Lclient!ic;")
	public static Class34 aClass34_269 = aClass34_266;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method304(@OriginalArg(1) Class8_Sub18 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt2378 == 0) {
			local5 = Static3.aClass64_1.method1397(arg0.anInt2373, arg0.anInt2367, arg0.anInt2377);
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		if (arg0.anInt2378 == 1) {
			local5 = Static3.aClass64_1.method1398(arg0.anInt2373, arg0.anInt2367, arg0.anInt2377);
		}
		if (arg0.anInt2378 == 2) {
			local5 = Static3.aClass64_1.method1435(arg0.anInt2373, arg0.anInt2367, arg0.anInt2377);
		}
		if (arg0.anInt2378 == 3) {
			local5 = Static3.aClass64_1.method1427(arg0.anInt2373, arg0.anInt2367, arg0.anInt2377);
		}
		if (local5 != 0) {
			local27 = local5 >> 14 & 0x7FFF;
			@Pc(87) int local87 = Static3.aClass64_1.method1389(arg0.anInt2373, arg0.anInt2367, arg0.anInt2377, local5);
			local23 = local87 & 0x1F;
			local25 = local87 >> 6 & 0x3;
		}
		arg0.anInt2381 = local27;
		arg0.anInt2371 = local25;
		arg0.anInt2382 = local23;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method305() {
		Static15.aClass48_11.method1101();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method306() {
		aClass34_264 = null;
		aClass34_265 = null;
		aByteArray4 = null;
		anIntArray64 = null;
		aClass34_268 = null;
		aClass34_269 = null;
		aClass8_Sub1_Sub3_Sub4_Sub1_1 = null;
		aClass34_267 = null;
		aClass34_266 = null;
		anIntArray63 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!jf;II)V")
	public static void method307(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (Static21.anInt655 < arg0.anInt2026) {
			Static67.method1018(arg0);
		} else if (arg0.anInt2039 >= Static21.anInt655) {
			method310(arg0);
		} else {
			Static113.method1616(arg0);
		}
		if (arg0.anInt2043 < 128 || arg0.anInt2059 < 128 || arg0.anInt2043 >= 13184 || arg0.anInt2059 >= 13184) {
			arg0.anInt2043 = arg0.anIntArray262[0] * 128 + arg0.anInt2030 * 64;
			arg0.anInt2009 = -1;
			arg0.anInt2006 = -1;
			arg0.anInt2039 = 0;
			arg0.anInt2026 = 0;
			arg0.anInt2059 = arg0.anInt2030 * 64 + arg0.anIntArray260[0] * 128;
			arg0.method1224();
		}
		if (arg0 == Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1 && (arg0.anInt2043 < 1536 || arg0.anInt2059 < 1536 || arg0.anInt2043 >= 11776 || arg0.anInt2059 >= 11776)) {
			arg0.anInt2006 = -1;
			arg0.anInt2059 = arg0.anInt2030 * 64 + arg0.anIntArray260[0] * 128;
			arg0.anInt2009 = -1;
			arg0.anInt2043 = arg0.anInt2030 * 64 + arg0.anIntArray262[0] * 128;
			arg0.anInt2026 = 0;
			arg0.anInt2039 = 0;
			arg0.method1224();
		}
		Static50.method751(arg0);
		Static34.method559(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!s;")
	public static Class8_Sub1_Sub16 method308(@OriginalArg(1) int arg0) {
		@Pc(10) Class8_Sub1_Sub16 local10 = (Class8_Sub1_Sub16) Static134.aClass48_59.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static4.aClass14_1.method1156(arg0, 9);
		local10 = new Class8_Sub1_Sub16();
		local10.anInt2428 = arg0;
		if (local20 != null) {
			local10.method1502(new Class8_Sub20(local20));
		}
		local10.method1498();
		Static134.aClass48_59.method1097(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILclient!q;ILclient!kd;II)V")
	public static void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class64 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class42 arg6, @OriginalArg(7) int arg7) {
		if (Static108.aBoolean98 && (Static105.aByteArrayArrayArray5[0][arg7][arg5] & 0x2) == 0) {
			if ((Static105.aByteArrayArrayArray5[arg2][arg7][arg5] & 0x10) != 0) {
				return;
			}
			if (Static105.method1479(arg5, arg7, arg2) != Static88.anInt2344) {
				return;
			}
		}
		if (Static41.anInt996 > arg2) {
			Static41.anInt996 = arg2;
		}
		@Pc(51) Class8_Sub1_Sub4 local51 = Static50.method752(arg1);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg0 == 1 || arg0 == 3) {
			local62 = local51.anInt455;
			local65 = local51.anInt443;
		} else {
			local65 = local51.anInt455;
			local62 = local51.anInt443;
		}
		@Pc(92) int local92;
		@Pc(86) int local86;
		if (arg7 + local62 <= 104) {
			local86 = (local62 + 1 >> 1) + arg7;
			local92 = (local62 >> 1) + arg7;
		} else {
			local92 = arg7;
			local86 = arg7 + 1;
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (arg5 + local65 > 104) {
			local110 = arg5;
			local114 = arg5 + 1;
		} else {
			local114 = (local65 + 1 >> 1) + arg5;
			local110 = (local65 >> 1) + arg5;
		}
		@Pc(134) int[][] local134 = Static24.anIntArrayArrayArray4[arg2];
		@Pc(160) int local160 = local134[local86][local114] + local134[local86][local110] + local134[local92][local110] + local134[local92][local114] >> 2;
		@Pc(169) int local169 = (arg7 << 7) + (local62 << 6);
		@Pc(175) int local175 = arg3 + (arg0 << 6);
		@Pc(187) int local187 = (arg5 << 7) + (arg7 + (arg1 << 14) + 1073741824);
		if (local51.anInt414 == 0) {
			local187 += Integer.MIN_VALUE;
		}
		@Pc(205) int local205 = (arg5 << 7) + (local65 << 6);
		if (local51.anInt454 == 1) {
			local175 += 256;
		}
		if (local51.method270()) {
			Static75.method1102(arg5, arg0, arg7, arg2, local51);
		}
		@Pc(266) Class8_Sub1_Sub1 local266;
		if (arg3 != 22) {
			@Pc(369) int local369;
			if (arg3 == 10 || arg3 == 11) {
				if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
					local266 = local51.method261(local160, arg0, local169, local134, 10, local205);
				} else {
					local266 = new Class8_Sub1_Sub1_Sub1(arg1, 10, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
				}
				if (local266 != null && arg4.method1396(arg2, arg7, arg5, local160, local62, local65, local266, arg3 == 11 ? 256 : 0, local187, local175) && local51.aBoolean25) {
					local369 = 15;
					if (local266 instanceof Class8_Sub1_Sub1_Sub6) {
						local369 = ((Class8_Sub1_Sub1_Sub6) local266).method1288() / 4;
						if (local369 > 30) {
							local369 = 30;
						}
					}
					for (@Pc(387) int local387 = 0; local387 <= local62; local387++) {
						for (@Pc(391) int local391 = 0; local391 <= local65; local391++) {
							if (local369 > Static107.aByteArrayArrayArray6[arg2][local387 + arg7][arg5 + local391]) {
								Static107.aByteArrayArrayArray6[arg2][arg7 + local387][arg5 + local391] = (byte) local369;
							}
						}
					}
				}
				if (local51.anInt424 != 0 && arg6 != null) {
					arg6.method1027(local62, local65, arg5, arg7, local51.aBoolean22);
				}
			} else if (arg3 >= 12) {
				if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
					local266 = local51.method261(local160, arg0, local169, local134, arg3, local205);
				} else {
					local266 = new Class8_Sub1_Sub1_Sub1(arg1, arg3, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
				}
				arg4.method1396(arg2, arg7, arg5, local160, 1, 1, local266, 0, local187, local175);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg2 > 0) {
					Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x924;
				}
				if (local51.anInt424 != 0 && arg6 != null) {
					arg6.method1027(local62, local65, arg5, arg7, local51.aBoolean22);
				}
			} else if (arg3 == 0) {
				if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
					local266 = local51.method261(local160, arg0, local169, local134, 0, local205);
				} else {
					local266 = new Class8_Sub1_Sub1_Sub1(arg1, 0, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
				}
				arg4.method1410(arg2, arg7, arg5, local160, local266, null, anIntArray63[arg0], 0, local187, local175);
				if (arg0 == 0) {
					if (local51.aBoolean25) {
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5] = 50;
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5 + 1] = 50;
					}
					if (local51.aBoolean21) {
						Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local51.aBoolean25) {
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5 + 1] = 50;
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5 + 1] = 50;
					}
					if (local51.aBoolean21) {
						Static97.anIntArrayArrayArray5[arg2][arg7][arg5 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local51.aBoolean25) {
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5] = 50;
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5 + 1] = 50;
					}
					if (local51.aBoolean21) {
						Static97.anIntArrayArrayArray5[arg2][arg7 + 1][arg5] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local51.aBoolean25) {
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5] = 50;
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5] = 50;
					}
					if (local51.aBoolean21) {
						Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x492;
					}
				}
				if (local51.anInt424 != 0 && arg6 != null) {
					arg6.method1017(local51.aBoolean22, arg0, arg5, arg7, arg3);
				}
				if (local51.anInt448 != 16) {
					arg4.method1407(arg2, arg7, arg5, local51.anInt448);
				}
			} else if (arg3 == 1) {
				if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
					local266 = local51.method261(local160, arg0, local169, local134, 1, local205);
				} else {
					local266 = new Class8_Sub1_Sub1_Sub1(arg1, 1, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
				}
				arg4.method1410(arg2, arg7, arg5, local160, local266, null, Static14.anIntArray51[arg0], 0, local187, local175);
				if (local51.aBoolean25) {
					if (arg0 == 0) {
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5 + 1] = 50;
					} else if (arg0 == 1) {
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5 + 1] = 50;
					} else if (arg0 == 2) {
						Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5] = 50;
					} else if (arg0 == 3) {
						Static107.aByteArrayArrayArray6[arg2][arg7][arg5] = 50;
					}
				}
				if (local51.anInt424 != 0 && arg6 != null) {
					arg6.method1017(local51.aBoolean22, arg0, arg5, arg7, arg3);
				}
			} else {
				@Pc(966) int local966;
				@Pc(995) Class8_Sub1_Sub1 local995;
				if (arg3 == 2) {
					local966 = arg0 + 1 & 0x3;
					@Pc(985) Class8_Sub1_Sub1 local985;
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local985 = local51.method261(local160, arg0 + 4, local169, local134, 2, local205);
						local995 = local51.method261(local160, local966, local169, local134, 2, local205);
					} else {
						local985 = new Class8_Sub1_Sub1_Sub1(arg1, 2, arg0 + 4, arg2, arg7, arg5, local51.anInt438, true, null);
						local995 = new Class8_Sub1_Sub1_Sub1(arg1, 2, local966, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1410(arg2, arg7, arg5, local160, local985, local995, anIntArray63[arg0], anIntArray63[local966], local187, local175);
					if (local51.aBoolean21) {
						if (arg0 == 0) {
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x249;
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5 + 1] |= 0x492;
							Static97.anIntArrayArrayArray5[arg2][arg7 + 1][arg5] |= 0x249;
						} else if (arg0 == 2) {
							Static97.anIntArrayArrayArray5[arg2][arg7 + 1][arg5] |= 0x249;
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x492;
						} else if (arg0 == 3) {
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x492;
							Static97.anIntArrayArrayArray5[arg2][arg7][arg5] |= 0x249;
						}
					}
					if (local51.anInt424 != 0 && arg6 != null) {
						arg6.method1017(local51.aBoolean22, arg0, arg5, arg7, arg3);
					}
					if (local51.anInt448 != 16) {
						arg4.method1407(arg2, arg7, arg5, local51.anInt448);
					}
				} else if (arg3 == 3) {
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local266 = local51.method261(local160, arg0, local169, local134, 3, local205);
					} else {
						local266 = new Class8_Sub1_Sub1_Sub1(arg1, 3, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1410(arg2, arg7, arg5, local160, local266, null, Static14.anIntArray51[arg0], 0, local187, local175);
					if (local51.aBoolean25) {
						if (arg0 == 0) {
							Static107.aByteArrayArrayArray6[arg2][arg7][arg5 + 1] = 50;
						} else if (arg0 == 1) {
							Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5 + 1] = 50;
						} else if (arg0 == 2) {
							Static107.aByteArrayArrayArray6[arg2][arg7 + 1][arg5] = 50;
						} else if (arg0 == 3) {
							Static107.aByteArrayArrayArray6[arg2][arg7][arg5] = 50;
						}
					}
					if (local51.anInt424 != 0 && arg6 != null) {
						arg6.method1017(local51.aBoolean22, arg0, arg5, arg7, arg3);
					}
				} else if (arg3 == 9) {
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local266 = local51.method261(local160, arg0, local169, local134, arg3, local205);
					} else {
						local266 = new Class8_Sub1_Sub1_Sub1(arg1, arg3, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1396(arg2, arg7, arg5, local160, 1, 1, local266, 0, local187, local175);
					if (local51.anInt424 != 0 && arg6 != null) {
						arg6.method1027(local62, local65, arg5, arg7, local51.aBoolean22);
					}
					if (local51.anInt448 != 16) {
						arg4.method1407(arg2, arg7, arg5, local51.anInt448);
					}
				} else if (arg3 == 4) {
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local266 = local51.method261(local160, arg0, local169, local134, 4, local205);
					} else {
						local266 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1414(arg2, arg7, arg5, local160, local266, null, anIntArray63[arg0], 0, 0, 0, local187, local175);
				} else if (arg3 == 5) {
					local369 = arg4.method1397(arg2, arg7, arg5);
					local966 = 16;
					if (local369 != 0) {
						local966 = Static50.method752(local369 >> 14 & 0x7FFF).anInt448;
					}
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local995 = local51.method261(local160, arg0, local169, local134, 4, local205);
					} else {
						local995 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1414(arg2, arg7, arg5, local160, local995, null, anIntArray63[arg0], 0, Static79.anIntArray241[arg0] * local966, Static44.anIntArray144[arg0] * local966, local187, local175);
				} else if (arg3 == 6) {
					local369 = arg4.method1397(arg2, arg7, arg5);
					local966 = 8;
					if (local369 != 0) {
						local966 = Static50.method752(local369 >> 14 & 0x7FFF).anInt448 / 2;
					}
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local995 = local51.method261(local160, arg0 + 4, local169, local134, 4, local205);
					} else {
						local995 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg0 + 4, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1414(arg2, arg7, arg5, local160, local995, null, 256, arg0, local966 * Static109.anIntArray338[arg0], Static107.anIntArray334[arg0] * local966, local187, local175);
				} else if (arg3 == 7) {
					local369 = arg0 + 2 & 0x3;
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local266 = local51.method261(local160, local369 + 4, local169, local134, 4, local205);
					} else {
						local266 = new Class8_Sub1_Sub1_Sub1(arg1, 4, local369 + 4, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1414(arg2, arg7, arg5, local160, local266, null, 256, local369, 0, 0, local187, local175);
				} else if (arg3 == 8) {
					local966 = 8;
					local369 = arg4.method1397(arg2, arg7, arg5);
					@Pc(1769) int local1769 = arg0 + 2 & 0x3;
					if (local369 != 0) {
						local966 = Static50.method752(local369 >> 14 & 0x7FFF).anInt448 / 2;
					}
					@Pc(1824) Class8_Sub1_Sub1 local1824;
					if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
						local995 = local51.method261(local160, arg0 + 4, local169, local134, 4, local205);
						local1824 = local51.method261(local160, local1769 + 4, local169, local134, 4, local205);
					} else {
						local995 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg0 + 4, arg2, arg7, arg5, local51.anInt438, true, null);
						local1824 = new Class8_Sub1_Sub1_Sub1(arg1, 4, local1769 + 4, arg2, arg7, arg5, local51.anInt438, true, null);
					}
					arg4.method1414(arg2, arg7, arg5, local160, local995, local1824, 256, arg0, local966 * Static109.anIntArray338[arg0], local966 * Static107.anIntArray334[arg0], local187, local175);
				}
			}
		} else if (!Static108.aBoolean98 || local51.anInt414 != 0 || local51.anInt424 == 1 || local51.aBoolean20) {
			if (local51.anInt438 == -1 && local51.anIntArray56 == null) {
				local266 = local51.method261(local160, arg0, local169, local134, 22, local205);
			} else {
				local266 = new Class8_Sub1_Sub1_Sub1(arg1, 22, arg0, arg2, arg7, arg5, local51.anInt438, true, null);
			}
			arg4.method1392(arg2, arg7, arg5, local160, local266, local187, local175);
			if (local51.anInt424 == 1 && arg6 != null) {
				arg6.method1023(arg7, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!jf;)V")
	private static void method310(@OriginalArg(1) Class8_Sub1_Sub1_Sub4 arg0) {
		if (Static21.anInt655 == arg0.anInt2039 || arg0.anInt2009 == -1 || arg0.anInt2027 != 0 || arg0.anInt2060 + 1 > Static47.method733(arg0.anInt2009).anIntArray76[arg0.anInt2015]) {
			@Pc(31) int local31 = arg0.anInt2039 - arg0.anInt2026;
			@Pc(37) int local37 = Static21.anInt655 - arg0.anInt2026;
			@Pc(47) int local47 = arg0.anInt2030 * 64 + arg0.anInt2058 * 128;
			@Pc(57) int local57 = arg0.anInt2061 * 128 + arg0.anInt2030 * 64;
			@Pc(67) int local67 = arg0.anInt2030 * 64 + arg0.anInt2047 * 128;
			arg0.anInt2043 = (local47 * (local31 - local37) + local37 * local67) / local31;
			@Pc(91) int local91 = arg0.anInt2030 * 64 + arg0.anInt2044 * 128;
			arg0.anInt2059 = (local91 * local37 + (local31 - local37) * local57) / local31;
		}
		if (arg0.anInt2017 == 0) {
			arg0.anInt2022 = 1024;
		}
		if (arg0.anInt2017 == 1) {
			arg0.anInt2022 = 1536;
		}
		arg0.anInt2020 = 0;
		if (arg0.anInt2017 == 2) {
			arg0.anInt2022 = 0;
		}
		if (arg0.anInt2017 == 3) {
			arg0.anInt2022 = 512;
		}
		arg0.anInt2038 = arg0.anInt2022;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBLclient!s;)V")
	public static void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub1_Sub16 arg3) {
		if (Static96.anInt552 >= 400) {
			return;
		}
		if (arg3.anIntArray331 != null) {
			arg3 = arg3.method1503();
		}
		if (arg3 == null || !arg3.aBoolean95) {
			return;
		}
		@Pc(26) Class34 local26 = arg3.aClass34_1142;
		if (arg3.anInt2426 != 0) {
			local26 = Static44.method669(new Class34[] { local26, Static53.method778(arg3.anInt2426, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1275), Static3.aClass34_24, Static59.aClass34_739, Static44.method672(arg3.anInt2426), Static30.aClass34_451 });
		}
		if (Static88.anInt2340 == 1) {
			Static72.method1076(arg2, Static44.method669(new Class34[] { Static88.aClass34_1100, Static32.aClass34_458, local26 }), arg1, Static22.aClass34_1204, 57, arg0);
		} else if (!Static32.aBoolean41) {
			@Pc(142) Class34[] local142 = arg3.aClass34Array17;
			if (Static59.aBoolean61) {
				local142 = Static113.method1620(local142);
			}
			@Pc(152) int local152;
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && !local142[local152].method806(Static60.aClass34_749)) {
						@Pc(171) byte local171 = 0;
						if (local152 == 0) {
							local171 = 11;
						}
						if (local152 == 1) {
							local171 = 23;
						}
						if (local152 == 2) {
							local171 = 39;
						}
						if (local152 == 3) {
							local171 = 31;
						}
						if (local152 == 4) {
							local171 = 46;
						}
						Static72.method1076(arg2, Static44.method669(new Class34[] { Static4.aClass34_29, local26 }), arg1, local142[local152], local171, arg0);
					}
				}
			}
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && local142[local152].method806(Static60.aClass34_749)) {
						@Pc(255) short local255 = 0;
						if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1275 < arg3.anInt2426) {
							local255 = 2000;
						}
						@Pc(268) int local268 = 0;
						if (local152 == 0) {
							local268 = local255 + 11;
						}
						if (local152 == 1) {
							local268 = local255 + 23;
						}
						if (local152 == 2) {
							local268 = local255 + 39;
						}
						if (local152 == 3) {
							local268 = local255 + 31;
						}
						if (local152 == 4) {
							local268 = local255 + 46;
						}
						Static72.method1076(arg2, Static44.method669(new Class34[] { Static4.aClass34_29, local26 }), arg1, local142[local152], local268, arg0);
					}
				}
			}
			Static72.method1076(arg2, Static44.method669(new Class34[] { Static4.aClass34_29, local26 }), arg1, Static19.aClass34_295, 1001, arg0);
		} else if ((Static120.anInt2889 & 0x2) == 2) {
			Static72.method1076(arg2, Static44.method669(new Class34[] { Static120.aClass34_1321, Static32.aClass34_458, local26 }), arg1, Static49.aClass34_652, 26, arg0);
		}
	}
}
