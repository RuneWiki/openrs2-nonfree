import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VZMNLGCR")
public final class Class46 {

	@OriginalMember(owner = "client!VZMNLGCR", name = "d", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!VZMNLGCR", name = "j", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "[I")
	private static final int[] anIntArray176 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!VZMNLGCR", name = "c", descriptor = "I")
	private static int anInt703 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!VZMNLGCR", name = "h", descriptor = "[I")
	private static final int[] anIntArray177 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!VZMNLGCR", name = "i", descriptor = "I")
	private static int anInt706 = -182;

	@OriginalMember(owner = "client!VZMNLGCR", name = "m", descriptor = "Z")
	private static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!VZMNLGCR", name = "s", descriptor = "[I")
	private static final int[] anIntArray178 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!VZMNLGCR", name = "t", descriptor = "I")
	public static int anInt709 = 99;

	@OriginalMember(owner = "client!VZMNLGCR", name = "x", descriptor = "[I")
	private static final int[] anIntArray179 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!VZMNLGCR", name = "E", descriptor = "B")
	private static byte aByte26 = 6;

	@OriginalMember(owner = "client!VZMNLGCR", name = "F", descriptor = "Z")
	public static boolean aBoolean202 = true;

	@OriginalMember(owner = "client!VZMNLGCR", name = "G", descriptor = "I")
	private static int anInt712 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!VZMNLGCR", name = "f", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!VZMNLGCR", name = "p", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!VZMNLGCR", name = "q", descriptor = "I")
	private int anInt708 = -37804;

	@OriginalMember(owner = "client!VZMNLGCR", name = "D", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!VZMNLGCR", name = "u", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!VZMNLGCR", name = "v", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!VZMNLGCR", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!VZMNLGCR", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!VZMNLGCR", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!VZMNLGCR", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!VZMNLGCR", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!VZMNLGCR", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!VZMNLGCR", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!VZMNLGCR", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!VZMNLGCR", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!VZMNLGCR", name = "y", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!VZMNLGCR", name = "z", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!VZMNLGCR", name = "A", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!VZMNLGCR", name = "B", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!VZMNLGCR", name = "C", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(II)I")
	private static int method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method405(arg0 + 45365, arg1 + 91923, 4) + (method405(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method405(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(III[B)Z")
	public static boolean method403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(18) Class5_Sub1_Sub4 local18 = new Class5_Sub1_Sub4(arg2, -82);
			@Pc(20) int local20 = -1;
			label53: while (true) {
				@Pc(23) int local23 = local18.method451();
				if (local23 == 0) {
					return local3;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				@Pc(33) boolean local33 = false;
				while (true) {
					@Pc(38) int local38;
					while (!local33) {
						local38 = local18.method451();
						if (local38 == 0) {
							continue label53;
						}
						local31 += local38 - 1;
						@Pc(60) int local60 = local31 & 0x3F;
						@Pc(66) int local66 = local31 >> 6 & 0x3F;
						@Pc(71) int local71 = local18.method437() >> 2;
						@Pc(75) int local75 = local66 + arg0;
						@Pc(79) int local79 = local60 + arg1;
						if (local75 > 0 && local79 > 0 && local75 < 103 && local79 < 103) {
							@Pc(92) Class8 local92 = Class8.method40(local20);
							if (local71 != 22 || !aBoolean202 || local92.aBoolean35 || local92.aBoolean32) {
								local3 &= local92.method35();
								local33 = true;
							}
						}
					}
					local38 = local18.method451();
					if (local38 == 0) {
						break;
					}
					local18.method437();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("26353, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(III)I")
	private static int method405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method407(local3, local13);
		@Pc(29) int local29 = method407(local3 + 1, local13);
		@Pc(35) int local35 = method407(local3, local13 + 1);
		@Pc(43) int local43 = method407(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method409(local23, local29, local9, arg2);
		@Pc(55) int local55 = method409(local35, local43, local9, arg2);
		return method409(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(Lclient!XGRGMPUQ;ZLclient!LAQKYZGL;)V")
	public static void method406(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(14) int local14 = arg0.method451();
				if (local14 == 0) {
					return;
				}
				local3 += local14;
				@Pc(23) Class8 local23 = Class8.method40(local3);
				local23.method42(arg1);
				while (true) {
					@Pc(30) int local30 = arg0.method451();
					if (local30 == 0) {
						break;
					}
					arg0.method437();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("5167, " + arg0 + ", " + false + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "b", descriptor = "(II)I")
	private static int method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method410(arg0 - 1, arg1 - 1) + method410(arg0 + 1, arg1 - 1) + method410(arg0 - 1, arg1 + 1) + method410(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method410(arg0 - 1, arg1) + method410(arg0 + 1, arg1) + method410(arg0, arg1 - 1) + method410(arg0, arg1 + 1);
		@Pc(59) int local59 = method410(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(IIII)I")
	private static int method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class5_Sub1_Sub2_Sub4.anIntArray121[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "d", descriptor = "(II)I")
	private static int method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "b", descriptor = "(III)Z")
	public static boolean method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) Class8 local10 = Class8.method40(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local10.method34(arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("48735, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(IIIIIZLclient!YDQEOBYY;Lclient!GQSCEHQI;I[[[II)V")
	public static void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[][][] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg8[arg4][arg1][arg9];
			@Pc(19) int local19 = arg8[arg4][arg1 + 1][arg9];
			@Pc(31) int local31 = arg8[arg4][arg1 + 1][arg9 + 1];
			@Pc(41) int local41 = arg8[arg4][arg1][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class8 local58 = Class8.method40(arg3);
			@Pc(70) int local70 = arg1 + (arg9 << 7) + (arg3 << 14) + 1073741824;
			if (!local58.aBoolean35) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg7 << 6) + arg2);
			@Pc(104) Class5_Sub1_Sub1 local104;
			if (arg2 == 22) {
				if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
					local104 = local58.method37(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 22, 0, arg7, local58.anInt40, local41);
				}
				arg5.method480(91, arg1, local104, local84, local51, arg0, arg9, local70);
				if (local58.aBoolean37 && local58.aBoolean35) {
					arg6.method109(arg1, arg9, 955);
				}
			} else {
				@Pc(200) int local200;
				if (arg2 == 10 || arg2 == 11) {
					if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
						local104 = local58.method37(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 10, 0, arg7, local58.anInt40, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg2 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg7 == 1 || arg7 == 3) {
							local200 = local58.anInt53;
							local203 = local58.anInt45;
						} else {
							local200 = local58.anInt45;
							local203 = local58.anInt53;
						}
						arg5.method484(arg0, arg9, local84, local187, local104, local200, local51, local70, local203, (byte) 4, arg1);
					}
					if (local58.aBoolean37) {
						arg6.method108(local58.anInt45, arg1, arg9, local58.anInt53, arg7, local58.aBoolean40);
					}
				} else if (arg2 >= 12) {
					if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
						local104 = local58.method37(arg2, arg7, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, arg2, 0, arg7, local58.anInt40, local41);
					}
					arg5.method484(arg0, arg9, local84, 0, local104, 1, local51, local70, 1, (byte) 4, arg1);
					if (local58.aBoolean37) {
						arg6.method108(local58.anInt45, arg1, arg9, local58.anInt53, arg7, local58.aBoolean40);
					}
				} else if (arg2 == 0) {
					if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
						local104 = local58.method37(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 0, 0, arg7, local58.anInt40, local41);
					}
					arg5.method482(null, local84, arg9, local51, 0, local104, anIntArray179[arg7], arg0, local70, arg1);
					if (local58.aBoolean37) {
						arg6.method107(arg9, aByte26, arg7, arg1, local58.aBoolean40, arg2);
					}
				} else if (arg2 == 1) {
					if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
						local104 = local58.method37(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 1, 0, arg7, local58.anInt40, local41);
					}
					arg5.method482(null, local84, arg9, local51, 0, local104, anIntArray177[arg7], arg0, local70, arg1);
					if (local58.aBoolean37) {
						arg6.method107(arg9, aByte26, arg7, arg1, local58.aBoolean40, arg2);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class5_Sub1_Sub1 local475;
					if (arg2 == 2) {
						local446 = arg7 + 1 & 0x3;
						@Pc(465) Class5_Sub1_Sub1 local465;
						if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
							local465 = local58.method37(2, arg7 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method37(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 2, 0, arg7 + 4, local58.anInt40, local41);
							local475 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 2, 0, local446, local58.anInt40, local41);
						}
						arg5.method482(local475, local84, arg9, local51, anIntArray179[local446], local465, anIntArray179[arg7], arg0, local70, arg1);
						if (local58.aBoolean37) {
							arg6.method107(arg9, aByte26, arg7, arg1, local58.aBoolean40, arg2);
						}
					} else if (arg2 == 3) {
						if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
							local104 = local58.method37(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 3, 0, arg7, local58.anInt40, local41);
						}
						arg5.method482(null, local84, arg9, local51, 0, local104, anIntArray177[arg7], arg0, local70, arg1);
						if (local58.aBoolean37) {
							arg6.method107(arg9, aByte26, arg7, arg1, local58.aBoolean40, arg2);
						}
					} else if (arg2 == 9) {
						if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
							local104 = local58.method37(arg2, arg7, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, arg2, 0, arg7, local58.anInt40, local41);
						}
						arg5.method484(arg0, arg9, local84, 0, local104, 1, local51, local70, 1, (byte) 4, arg1);
						if (local58.aBoolean37) {
							arg6.method108(local58.anInt45, arg1, arg9, local58.anInt53, arg7, local58.aBoolean40);
						}
					} else {
						if (local58.aBoolean43) {
							if (arg7 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg7 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg7 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg2 == 4) {
							if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
								local104 = local58.method37(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 4, 0, 0, local58.anInt40, local41);
							}
							arg5.method483(local84, arg7 * 512, local51, arg9, arg0, arg1, anIntArray179[arg7], 0, 0, local70, local104);
						} else if (arg2 == 5) {
							local446 = 16;
							local200 = arg5.method500(arg0, arg1, arg9);
							if (local200 > 0) {
								local446 = Class8.method40(local200 >> 14 & 0x7FFF).anInt54;
							}
							if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
								local475 = local58.method37(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 4, 0, 0, local58.anInt40, local41);
							}
							arg5.method483(local84, arg7 * 512, local51, arg9, arg0, arg1, anIntArray179[arg7], anIntArray176[arg7] * local446, anIntArray178[arg7] * local446, local70, local475);
						} else if (arg2 == 6) {
							if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
								local104 = local58.method37(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 4, 0, 0, local58.anInt40, local41);
							}
							arg5.method483(local84, arg7, local51, arg9, arg0, arg1, 256, 0, 0, local70, local104);
						} else if (arg2 == 7) {
							if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
								local104 = local58.method37(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 4, 0, 0, local58.anInt40, local41);
							}
							arg5.method483(local84, arg7, local51, arg9, arg0, arg1, 512, 0, 0, local70, local104);
						} else if (arg2 == 8) {
							if (local58.anInt40 == -1 && local58.anIntArray13 == null) {
								local104 = local58.method37(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class5_Sub1_Sub1_Sub1(local31, local9, arg3, local19, true, 4, 0, 0, local58.anInt40, local41);
							}
							arg5.method483(local84, arg7, local51, arg9, arg0, arg1, 768, 0, 0, local70, local104);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("62765, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "e", descriptor = "(II)I")
	private static int method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "<init>", descriptor = "(I[[[I[[[BZI)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			anInt709 = 99;
			this.anInt710 = arg0;
			this.anInt711 = arg4;
			this.anIntArrayArrayArray4 = arg1;
			this.aByteArrayArrayArray3 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt710][this.anInt711];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt710][this.anInt711];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt710][this.anInt711];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt710][this.anInt711];
			this.anIntArrayArrayArray3 = new int[4][this.anInt710 + 1][this.anInt711 + 1];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt710 + 1][this.anInt711 + 1];
			this.anIntArrayArray16 = new int[this.anInt710 + 1][this.anInt711 + 1];
			this.anIntArray180 = new int[this.anInt711];
			this.anIntArray181 = new int[this.anInt711];
			this.anIntArray182 = new int[this.anInt711];
			this.anIntArray183 = new int[this.anInt711];
			this.anIntArray184 = new int[this.anInt711];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("53279, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(IBII)I")
	private int method404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("92950, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "c", descriptor = "(II)I")
	private int method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "([BI[Lclient!GQSCEHQI;ILclient!YDQEOBYY;IIIIII)V")
	public void method411(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class48 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg0, -82);
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method451();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method451();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method437();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					if (local48 == arg6 && local44 >= arg7 && local44 < arg7 + 8 && local38 >= arg5 && local38 < arg5 + 8) {
						@Pc(81) Class8 local81 = Class8.method40(local12);
						@Pc(98) int local98 = arg3 + Class14.method86(local44 & 0x7, local81.anInt53, local59, local38 & 0x7, arg9, local81.anInt45);
						@Pc(116) int local116 = arg1 + Class14.method87(local81.anInt53, local44 & 0x7, local38 & 0x7, arg9, local81.anInt45, local59, this.anInt705);
						if (local98 > 0 && local116 > 0 && local98 < 103 && local116 < 103) {
							@Pc(128) int local128 = arg8;
							if ((this.aByteArrayArrayArray3[1][local98][local116] & 0x2) == 2) {
								local128 = arg8 - 1;
							}
							@Pc(143) Class16 local143 = null;
							if (local128 >= 0) {
								local143 = arg2[local128];
							}
							this.method414(local143, local12, local116, local59 + arg9 & 0x3, arg4, local98, arg8, local55);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("70918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "([Lclient!GQSCEHQI;IIBI[BI)V")
	public void method412(@OriginalArg(0) Class16[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg0[local3].anIntArrayArray3[arg1 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class5_Sub1_Sub4 local65 = new Class5_Sub1_Sub4(arg5, -82);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method422(arg6, arg4, 0, local65, local71 + arg1, local75 + arg2, local11);
					}
				}
			}
			@Pc(108) boolean local108 = false;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("4821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "([Lclient!GQSCEHQI;Lclient!YDQEOBYY;B)V")
	public void method413(@OriginalArg(0) Class16[] arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != 3) {
				this.aBoolean201 = !this.aBoolean201;
			}
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(38) int local38;
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < 104; local18++) {
					for (local22 = 0; local22 < 104; local22++) {
						if ((this.aByteArrayArrayArray3[local14][local18][local22] & 0x1) == 1) {
							local38 = local14;
							if ((this.aByteArrayArrayArray3[1][local18][local22] & 0x2) == 2) {
								local38 = local14 - 1;
							}
							if (local38 >= 0) {
								arg0[local38].method109(local18, local22, 955);
							}
						}
					}
				}
			}
			anInt712 += (int) (Math.random() * 5.0D) - 2;
			if (anInt712 < -8) {
				anInt712 = -8;
			}
			if (anInt712 > 8) {
				anInt712 = 8;
			}
			anInt703 += (int) (Math.random() * 5.0D) - 2;
			if (anInt703 < -16) {
				anInt703 = -16;
			}
			if (anInt703 > 16) {
				anInt703 = 16;
			}
			@Pc(144) int local144;
			@Pc(150) int local150;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(180) int local180;
			@Pc(202) int local202;
			@Pc(215) int local215;
			@Pc(221) int local221;
			@Pc(225) int local225;
			@Pc(231) int local231;
			@Pc(247) int local247;
			@Pc(295) int local295;
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(119) byte[][] local119 = this.aByteArrayArrayArray1[local18];
				local144 = (int) Math.sqrt((double) 5100);
				local150 = local144 * 768 >> 8;
				for (local152 = 1; local152 < this.anInt711 - 1; local152++) {
					for (local156 = 1; local156 < this.anInt710 - 1; local156++) {
						local180 = this.anIntArrayArrayArray4[local18][local156 + 1][local152] - this.anIntArrayArrayArray4[local18][local156 - 1][local152];
						local202 = this.anIntArrayArrayArray4[local18][local156][local152 + 1] - this.anIntArrayArrayArray4[local18][local156][local152 - 1];
						local215 = (int) Math.sqrt((double) (local180 * local180 + local202 * local202 + 65536));
						local221 = (local180 << 8) / local215;
						local225 = 65536 / local215;
						local231 = (local202 << 8) / local215;
						local247 = (local221 * -50 + local225 * -10 + local231 * -50) / local150 + 96;
						local295 = (local119[local156 - 1][local152] >> 2) + (local119[local156 + 1][local152] >> 3) + (local119[local156][local152 - 1] >> 2) + (local119[local156][local152 + 1] >> 3) + (local119[local156][local152] >> 1);
						this.anIntArrayArray16[local156][local152] = local247 - local295;
					}
				}
				for (local156 = 0; local156 < this.anInt711; local156++) {
					this.anIntArray180[local156] = 0;
					this.anIntArray181[local156] = 0;
					this.anIntArray182[local156] = 0;
					this.anIntArray183[local156] = 0;
					this.anIntArray184[local156] = 0;
				}
				for (local180 = -5; local180 < this.anInt710 + 5; local180++) {
					for (local202 = 0; local202 < this.anInt711; local202++) {
						local215 = local180 + 5;
						@Pc(430) int local430;
						if (local215 >= 0 && local215 < this.anInt710) {
							local221 = this.aByteArrayArrayArray2[local18][local215][local202] & 0xFF;
							if (local221 > 0) {
								@Pc(389) Class36 local389 = Class36.aClass36Array1[local221 - 1];
								this.anIntArray180[local202] += local389.anInt551;
								this.anIntArray181[local202] += local389.anInt549;
								this.anIntArray182[local202] += local389.anInt550;
								this.anIntArray183[local202] += local389.anInt552;
								local430 = this.anIntArray184[local202]++;
							}
						}
						local221 = local180 - 5;
						if (local221 >= 0 && local221 < this.anInt710) {
							local225 = this.aByteArrayArrayArray2[local18][local221][local202] & 0xFF;
							if (local225 > 0) {
								@Pc(462) Class36 local462 = Class36.aClass36Array1[local225 - 1];
								this.anIntArray180[local202] -= local462.anInt551;
								this.anIntArray181[local202] -= local462.anInt549;
								this.anIntArray182[local202] -= local462.anInt550;
								this.anIntArray183[local202] -= local462.anInt552;
								local430 = this.anIntArray184[local202]--;
							}
						}
					}
					if (local180 >= 1 && local180 < this.anInt710 - 1) {
						local215 = 0;
						local221 = 0;
						local225 = 0;
						local231 = 0;
						local247 = 0;
						for (local295 = -5; local295 < this.anInt711 + 5; local295++) {
							@Pc(538) int local538 = local295 + 5;
							if (local538 >= 0 && local538 < this.anInt711) {
								local215 += this.anIntArray180[local538];
								local221 += this.anIntArray181[local538];
								local225 += this.anIntArray182[local538];
								local231 += this.anIntArray183[local538];
								local247 += this.anIntArray184[local538];
							}
							@Pc(583) int local583 = local295 - 5;
							if (local583 >= 0 && local583 < this.anInt711) {
								local215 -= this.anIntArray180[local583];
								local221 -= this.anIntArray181[local583];
								local225 -= this.anIntArray182[local583];
								local231 -= this.anIntArray183[local583];
								local247 -= this.anIntArray184[local583];
							}
							if (local295 >= 1 && local295 < this.anInt711 - 1 && (!aBoolean202 || (this.aByteArrayArrayArray3[0][local180][local295] & 0x2) != 0 || (this.aByteArrayArrayArray3[local18][local180][local295] & 0x10) == 0 && this.method404(local18, local180, local295) == anInt704)) {
								if (local18 < anInt709) {
									anInt709 = local18;
								}
								@Pc(682) int local682 = this.aByteArrayArrayArray2[local18][local180][local295] & 0xFF;
								@Pc(693) int local693 = this.aByteArrayArrayArray4[local18][local180][local295] & 0xFF;
								if (local682 > 0 || local693 > 0) {
									@Pc(706) int local706 = this.anIntArrayArrayArray4[local18][local180][local295];
									@Pc(717) int local717 = this.anIntArrayArrayArray4[local18][local180 + 1][local295];
									@Pc(730) int local730 = this.anIntArrayArrayArray4[local18][local180 + 1][local295 + 1];
									@Pc(741) int local741 = this.anIntArrayArrayArray4[local18][local180][local295 + 1];
									@Pc(748) int local748 = this.anIntArrayArray16[local180][local295];
									@Pc(757) int local757 = this.anIntArrayArray16[local180 + 1][local295];
									@Pc(768) int local768 = this.anIntArrayArray16[local180 + 1][local295 + 1];
									@Pc(777) int local777 = this.anIntArrayArray16[local180][local295 + 1];
									@Pc(779) int local779 = -1;
									@Pc(781) int local781 = -1;
									@Pc(789) int local789;
									@Pc(793) int local793;
									if (local682 > 0) {
										local789 = local215 * 256 / local231;
										local793 = local221 / local247;
										@Pc(797) int local797 = local225 / local247;
										local779 = this.method421(local789, local793, local797);
										@Pc(809) int local809 = local789 + anInt712 & 0xFF;
										local797 += anInt703;
										if (local797 < 0) {
											local797 = 0;
										} else if (local797 > 255) {
											local797 = 255;
										}
										local781 = this.method421(local809, local793, local797);
									}
									if (local18 > 0) {
										@Pc(834) boolean local834 = true;
										if (local682 == 0 && this.aByteArrayArrayArray6[local18][local180][local295] != 0) {
											local834 = false;
										}
										if (local693 > 0 && !Class36.aClass36Array1[local693 - 1].aBoolean146) {
											local834 = false;
										}
										if (local834 && local706 == local717 && local706 == local730 && local706 == local741) {
											this.anIntArrayArrayArray3[local18][local180][local295] |= 0x924;
										}
									}
									local789 = 0;
									if (local779 != -1) {
										local789 = Class5_Sub1_Sub2_Sub4.anIntArray125[method419(local781, 96)];
									}
									if (local693 == 0) {
										arg1.method479(local18, local180, local295, 0, 0, -1, local706, local717, local730, local741, method419(local779, local748), method419(local779, local757), method419(local779, local768), method419(local779, local777), 0, 0, 0, 0, local789, 0);
									} else {
										local793 = this.aByteArrayArrayArray6[local18][local180][local295] + 1;
										@Pc(946) byte local946 = this.aByteArrayArrayArray5[local18][local180][local295];
										@Pc(952) Class36 local952 = Class36.aClass36Array1[local693 - 1];
										@Pc(955) int local955 = local952.anInt547;
										@Pc(963) int local963;
										@Pc(961) int local961;
										if (local955 >= 0) {
											local961 = Class5_Sub1_Sub2_Sub4.method348(local955);
											local963 = -1;
										} else if (local952.anInt546 == 16711935) {
											local961 = 0;
											local963 = -2;
											local955 = -1;
										} else {
											local963 = this.method421(local952.anInt548, local952.anInt549, local952.anInt550);
											local961 = Class5_Sub1_Sub2_Sub4.anIntArray125[this.method408(local952.anInt553, 96)];
										}
										arg1.method479(local18, local180, local295, local793, local946, local955, local706, local717, local730, local741, method419(local779, local748), method419(local779, local757), method419(local779, local768), method419(local779, local777), this.method408(local963, local748), this.method408(local963, local757), this.method408(local963, local768), this.method408(local963, local777), local789, local961);
									}
								}
							}
						}
					}
				}
				for (local202 = 1; local202 < this.anInt711 - 1; local202++) {
					for (local215 = 1; local215 < this.anInt710 - 1; local215++) {
						arg1.method478(local18, local215, local202, this.method404(local18, local215, local202));
					}
				}
			}
			arg1.method505(anInt706);
			for (local22 = 0; local22 < this.anInt710; local22++) {
				for (local38 = 0; local38 < this.anInt711; local38++) {
					if ((this.aByteArrayArrayArray3[1][local22][local38] & 0x2) == 2) {
						arg1.method476(local22, local38);
					}
				}
			}
			local38 = 1;
			@Pc(1134) int local1134 = 2;
			@Pc(1136) int local1136 = 4;
			for (@Pc(1138) int local1138 = 0; local1138 < 4; local1138++) {
				if (local1138 > 0) {
					local38 <<= 0x3;
					local1134 <<= 0x3;
					local1136 <<= 0x3;
				}
				for (@Pc(1156) int local1156 = 0; local1156 <= local1138; local1156++) {
					for (local144 = 0; local144 <= this.anInt711; local144++) {
						for (local150 = 0; local150 <= this.anInt710; local150++) {
							if ((this.anIntArrayArrayArray3[local1156][local150][local144] & local38) != 0) {
								local152 = local144;
								local156 = local144;
								local180 = local1156;
								local202 = local1156;
								while (local152 > 0 && (this.anIntArrayArrayArray3[local1156][local150][local152 - 1] & local38) != 0) {
									local152--;
								}
								while (local156 < this.anInt711 && (this.anIntArrayArrayArray3[local1156][local150][local156 + 1] & local38) != 0) {
									local156++;
								}
								label337: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray3[local180 - 1][local150][local215] & local38) == 0) {
											break label337;
										}
									}
									local180--;
								}
								label326: while (local202 < local1138) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray3[local202 + 1][local150][local215] & local38) == 0) {
											break label326;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray4[local202][local150][local152] - 240;
									local231 = this.anIntArrayArrayArray4[local180][local150][local152];
									Class48.method477(local231, local156 * 128 + 128, local152 * 128, local150 * 128, 1, local150 * 128, local1138, local225);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray3[local247][local150][local295] &= ~local38;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray3[local1156][local150][local144] & local1134) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local1156;
								local202 = local1156;
								while (local152 > 0 && (this.anIntArrayArrayArray3[local1156][local152 - 1][local144] & local1134) != 0) {
									local152--;
								}
								while (local156 < this.anInt710 && (this.anIntArrayArrayArray3[local1156][local156 + 1][local144] & local1134) != 0) {
									local156++;
								}
								label390: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray3[local180 - 1][local215][local144] & local1134) == 0) {
											break label390;
										}
									}
									local180--;
								}
								label379: while (local202 < local1138) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray3[local202 + 1][local215][local144] & local1134) == 0) {
											break label379;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray4[local202][local152][local144] - 240;
									local231 = this.anIntArrayArrayArray4[local180][local152][local144];
									Class48.method477(local231, local144 * 128, local144 * 128, local156 * 128 + 128, 2, local152 * 128, local1138, local225);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray3[local247][local295][local144] &= ~local1134;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray3[local1156][local150][local144] & local1136) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local144;
								local202 = local144;
								while (local180 > 0 && (this.anIntArrayArrayArray3[local1156][local150][local180 - 1] & local1136) != 0) {
									local180--;
								}
								while (local202 < this.anInt711 && (this.anIntArrayArrayArray3[local1156][local150][local202 + 1] & local1136) != 0) {
									local202++;
								}
								label443: while (local152 > 0) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray3[local1156][local152 - 1][local215] & local1136) == 0) {
											break label443;
										}
									}
									local152--;
								}
								label432: while (local156 < this.anInt710) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray3[local1156][local156 + 1][local215] & local1136) == 0) {
											break label432;
										}
									}
									local156++;
								}
								if ((local156 + 1 - local152) * (local202 + 1 - local180) >= 4) {
									local215 = this.anIntArrayArrayArray4[local1156][local152][local180];
									Class48.method477(local215, local202 * 128 + 128, local180 * 128, local156 * 128 + 128, 4, local152 * 128, local1138, local215);
									for (local221 = local152; local221 <= local156; local221++) {
										for (local225 = local180; local225 <= local202; local225++) {
											this.anIntArrayArrayArray3[local1156][local221][local225] &= ~local1136;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("90962, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(Lclient!GQSCEHQI;IIIILclient!YDQEOBYY;III)V")
	private void method414(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean202 && (this.aByteArrayArrayArray3[0][arg5][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg6][arg5][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method404(arg6, arg5, arg2) != anInt704) {
					return;
				}
			}
			if (arg6 < anInt709) {
				anInt709 = arg6;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray4[arg6][arg5][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray4[arg6][arg5 + 1][arg2];
			@Pc(73) int local73 = this.anIntArrayArrayArray4[arg6][arg5 + 1][arg2 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray4[arg6][arg5][arg2 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class8 local97 = Class8.method40(arg1);
			@Pc(109) int local109 = arg5 + (arg2 << 7) + (arg1 << 14) + 1073741824;
			if (!local97.aBoolean35) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg3 << 6) + arg7);
			@Pc(155) Class5_Sub1_Sub1 local155;
			if (arg7 != 22) {
				@Pc(253) int local253;
				if (arg7 == 10 || arg7 == 11) {
					if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
						local155 = local97.method37(10, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 10, 0, arg3, local97.anInt40, local84);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg7 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg3 == 1 || arg3 == 3) {
							local253 = local97.anInt53;
							local256 = local97.anInt45;
						} else {
							local253 = local97.anInt45;
							local256 = local97.anInt53;
						}
						if (arg4.method484(arg6, arg2, local123, local240, local155, local253, local94, local109, local256, (byte) 4, arg5) && local97.aBoolean41) {
							@Pc(287) Class5_Sub1_Sub1_Sub6 local287;
							if (local155 instanceof Class5_Sub1_Sub1_Sub6) {
								local287 = (Class5_Sub1_Sub1_Sub6) local155;
							} else {
								local287 = local97.method37(10, arg3, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt692 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray1[arg6][arg5 + local303][arg2 + local307]) {
											this.aByteArrayArrayArray1[arg6][arg5 + local303][arg2 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean37 && arg0 != null) {
						arg0.method108(local97.anInt45, arg5, arg2, local97.anInt53, arg3, local97.aBoolean40);
					}
				} else if (arg7 >= 12) {
					if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
						local155 = local97.method37(arg7, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, arg7, 0, arg3, local97.anInt40, local84);
					}
					arg4.method484(arg6, arg2, local123, 0, local155, 1, local94, local109, 1, (byte) 4, arg5);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg6 > 0) {
						this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x924;
					}
					if (local97.aBoolean37 && arg0 != null) {
						arg0.method108(local97.anInt45, arg5, arg2, local97.anInt53, arg3, local97.aBoolean40);
					}
				} else if (arg7 == 0) {
					if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
						local155 = local97.method37(0, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 0, 0, arg3, local97.anInt40, local84);
					}
					arg4.method482(null, local123, arg2, local94, 0, local155, anIntArray179[arg3], arg6, local109, arg5);
					if (arg3 == 0) {
						if (local97.aBoolean41) {
							this.aByteArrayArrayArray1[arg6][arg5][arg2] = 50;
							this.aByteArrayArrayArray1[arg6][arg5][arg2 + 1] = 50;
						}
						if (local97.aBoolean31) {
							this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local97.aBoolean41) {
							this.aByteArrayArrayArray1[arg6][arg5][arg2 + 1] = 50;
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean31) {
							this.anIntArrayArrayArray3[arg6][arg5][arg2 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local97.aBoolean41) {
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2] = 50;
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean31) {
							this.anIntArrayArrayArray3[arg6][arg5 + 1][arg2] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local97.aBoolean41) {
							this.aByteArrayArrayArray1[arg6][arg5][arg2] = 50;
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2] = 50;
						}
						if (local97.aBoolean31) {
							this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x492;
						}
					}
					if (local97.aBoolean37 && arg0 != null) {
						arg0.method107(arg2, aByte26, arg3, arg5, local97.aBoolean40, arg7);
					}
					if (local97.anInt54 != 16) {
						arg4.method490(arg6, local97.anInt54, arg2, arg5);
					}
				} else if (arg7 == 1) {
					if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
						local155 = local97.method37(1, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 1, 0, arg3, local97.anInt40, local84);
					}
					arg4.method482(null, local123, arg2, local94, 0, local155, anIntArray177[arg3], arg6, local109, arg5);
					if (local97.aBoolean41) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray1[arg6][arg5][arg2 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray1[arg6][arg5][arg2] = 50;
						}
					}
					if (local97.aBoolean37 && arg0 != null) {
						arg0.method107(arg2, aByte26, arg3, arg5, local97.aBoolean40, arg7);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class5_Sub1_Sub1 local893;
					if (arg7 == 2) {
						local864 = arg3 + 1 & 0x3;
						@Pc(883) Class5_Sub1_Sub1 local883;
						if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
							local883 = local97.method37(2, arg3 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method37(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 2, 0, arg3 + 4, local97.anInt40, local84);
							local893 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 2, 0, local864, local97.anInt40, local84);
						}
						arg4.method482(local893, local123, arg2, local94, anIntArray179[local864], local883, anIntArray179[arg3], arg6, local109, arg5);
						if (local97.aBoolean31) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x249;
								this.anIntArrayArrayArray3[arg6][arg5][arg2 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray3[arg6][arg5][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray3[arg6][arg5 + 1][arg2] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray3[arg6][arg5 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x492;
								this.anIntArrayArrayArray3[arg6][arg5][arg2] |= 0x249;
							}
						}
						if (local97.aBoolean37 && arg0 != null) {
							arg0.method107(arg2, aByte26, arg3, arg5, local97.aBoolean40, arg7);
						}
						if (local97.anInt54 != 16) {
							arg4.method490(arg6, local97.anInt54, arg2, arg5);
						}
					} else if (arg7 == 3) {
						if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
							local155 = local97.method37(3, arg3, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 3, 0, arg3, local97.anInt40, local84);
						}
						arg4.method482(null, local123, arg2, local94, 0, local155, anIntArray177[arg3], arg6, local109, arg5);
						if (local97.aBoolean41) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray1[arg6][arg5][arg2 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray1[arg6][arg5 + 1][arg2] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray1[arg6][arg5][arg2] = 50;
							}
						}
						if (local97.aBoolean37 && arg0 != null) {
							arg0.method107(arg2, aByte26, arg3, arg5, local97.aBoolean40, arg7);
						}
					} else if (arg7 == 9) {
						if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
							local155 = local97.method37(arg7, arg3, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, arg7, 0, arg3, local97.anInt40, local84);
						}
						arg4.method484(arg6, arg2, local123, 0, local155, 1, local94, local109, 1, (byte) 4, arg5);
						if (local97.aBoolean37 && arg0 != null) {
							arg0.method108(local97.anInt45, arg5, arg2, local97.anInt53, arg3, local97.aBoolean40);
						}
					} else {
						if (local97.aBoolean43) {
							if (arg3 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg3 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg3 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg7 == 4) {
							if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
								local155 = local97.method37(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 4, 0, 0, local97.anInt40, local84);
							}
							arg4.method483(local123, arg3 * 512, local94, arg2, arg6, arg5, anIntArray179[arg3], 0, 0, local109, local155);
						} else if (arg7 == 5) {
							local864 = 16;
							local253 = arg4.method500(arg6, arg5, arg2);
							if (local253 > 0) {
								local864 = Class8.method40(local253 >> 14 & 0x7FFF).anInt54;
							}
							if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
								local893 = local97.method37(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 4, 0, 0, local97.anInt40, local84);
							}
							arg4.method483(local123, arg3 * 512, local94, arg2, arg6, arg5, anIntArray179[arg3], anIntArray176[arg3] * local864, anIntArray178[arg3] * local864, local109, local893);
						} else if (arg7 == 6) {
							if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
								local155 = local97.method37(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 4, 0, 0, local97.anInt40, local84);
							}
							arg4.method483(local123, arg3, local94, arg2, arg6, arg5, 256, 0, 0, local109, local155);
						} else if (arg7 == 7) {
							if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
								local155 = local97.method37(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 4, 0, 0, local97.anInt40, local84);
							}
							arg4.method483(local123, arg3, local94, arg2, arg6, arg5, 512, 0, 0, local109, local155);
						} else if (arg7 == 8) {
							if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
								local155 = local97.method37(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 4, 0, 0, local97.anInt40, local84);
							}
							arg4.method483(local123, arg3, local94, arg2, arg6, arg5, 768, 0, 0, local109, local155);
						}
					}
				}
			} else if (!aBoolean202 || local97.aBoolean35 || local97.aBoolean32) {
				if (local97.anInt40 == -1 && local97.anIntArray13 == null) {
					local155 = local97.method37(22, arg3, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class5_Sub1_Sub1_Sub1(local73, local49, arg1, local60, true, 22, 0, arg3, local97.anInt40, local84);
				}
				arg4.method480(91, arg5, local155, local123, local94, arg6, arg2, local109);
				if (local97.aBoolean37 && local97.aBoolean35 && arg0 != null) {
					arg0.method109(arg5, arg2, 955);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("37458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(III[BIIIZI[Lclient!GQSCEHQI;)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class16[] arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg2 + local3 > 0 && arg2 + local3 < 103 && arg0 + local7 > 0 && arg0 + local7 < 103) {
						arg8[arg7].anIntArrayArray3[arg2 + local3][arg0 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(66) Class5_Sub1_Sub4 local66 = new Class5_Sub1_Sub4(arg3, -82);
			for (@Pc(68) int local68 = 0; local68 < 4; local68++) {
				for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
					for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
						if (local68 == arg4 && local72 >= arg5 && local72 < arg5 + 8 && local76 >= arg1 && local76 < arg1 + 8) {
							this.method422(0, 0, arg6, local66, arg2 + Class14.method84(local72 & 0x7, local76 & 0x7, arg6), arg0 + Class14.method85(arg6, local76 & 0x7, local72 & 0x7), arg7);
						} else {
							this.method422(0, 0, 0, local66, -1, -1, 0);
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("96966, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(I[Lclient!GQSCEHQI;I[BBLclient!YDQEOBYY;)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) Class16[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class48 arg5) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg3, -82);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(22) int local22 = local7.method451();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method451();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method437();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg2;
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray3[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class16 local101 = null;
						if (local86 >= 0) {
							local101 = arg1[local86];
						}
						this.method414(local101, local9, local74, local66, arg5, local70, local55, local62);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("17345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(IIIII)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(14) int local14 = arg3; local14 <= arg3 + arg1; local14++) {
				for (@Pc(18) int local18 = arg0; local18 <= arg0 + arg2; local18++) {
					if (local18 >= 0 && local18 < this.anInt710 && local14 >= 0 && local14 < this.anInt711) {
						this.aByteArrayArrayArray1[0][local18][local14] = 127;
						if (local18 == arg0 && local18 > 0) {
							this.anIntArrayArrayArray4[0][local18][local14] = this.anIntArrayArrayArray4[0][local18 - 1][local14];
						}
						if (local18 == arg0 + arg2 && local18 < this.anInt710 - 1) {
							this.anIntArrayArrayArray4[0][local18][local14] = this.anIntArrayArrayArray4[0][local18 + 1][local14];
						}
						if (local14 == arg3 && local14 > 0) {
							this.anIntArrayArrayArray4[0][local18][local14] = this.anIntArrayArrayArray4[0][local18][local14 - 1];
						}
						if (local14 == arg3 + arg1 && local14 < this.anInt711 - 1) {
							this.anIntArrayArrayArray4[0][local18][local14] = this.anIntArrayArrayArray4[0][local18][local14 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("93377, " + arg0 + ", " + arg1 + ", " + -28 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "c", descriptor = "(III)I")
	private int method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	@OriginalMember(owner = "client!VZMNLGCR", name = "a", descriptor = "(IIIILclient!XGRGMPUQ;III)V")
	private void method422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub1_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(26) int local26;
			if (arg4 >= 0 && arg4 < 104 && arg5 >= 0 && arg5 < 104) {
				this.aByteArrayArrayArray3[arg6][arg4][arg5] = 0;
				while (true) {
					local26 = arg3.method437();
					if (local26 == 0) {
						if (arg6 == 0) {
							this.anIntArrayArrayArray4[0][arg4][arg5] = -method402(arg4 + arg0 + 932731, arg5 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray4[arg6][arg4][arg5] = this.anIntArrayArrayArray4[arg6 - 1][arg4][arg5] - 240;
							return;
						}
					}
					if (local26 == 1) {
						@Pc(80) int local80 = arg3.method437();
						if (local80 == 1) {
							local80 = 0;
						}
						if (arg6 == 0) {
							this.anIntArrayArrayArray4[0][arg4][arg5] = -local80 * 8;
							return;
						}
						this.anIntArrayArrayArray4[arg6][arg4][arg5] = this.anIntArrayArrayArray4[arg6 - 1][arg4][arg5] - local80 * 8;
						return;
					}
					if (local26 <= 49) {
						this.aByteArrayArrayArray4[arg6][arg4][arg5] = arg3.method438();
						this.aByteArrayArrayArray6[arg6][arg4][arg5] = (byte) ((local26 - 2) / 4);
						this.aByteArrayArrayArray5[arg6][arg4][arg5] = (byte) (local26 + arg2 - 2 & 0x3);
					} else if (local26 <= 81) {
						this.aByteArrayArrayArray3[arg6][arg4][arg5] = (byte) (local26 - 49);
					} else {
						this.aByteArrayArrayArray2[arg6][arg4][arg5] = (byte) (local26 - 81);
					}
				}
			} else {
				while (true) {
					local26 = arg3.method437();
					if (local26 == 0) {
						return;
					}
					if (local26 == 1) {
						arg3.method437();
						return;
					}
					if (local26 <= 49) {
						arg3.method437();
					}
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("63305, " + arg0 + ", " + -4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}
}
