import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DBFHRNVI")
public final class Class7 {

	@OriginalMember(owner = "client!DBFHRNVI", name = "t", descriptor = "I")
	private static int anInt75;

	@OriginalMember(owner = "client!DBFHRNVI", name = "w", descriptor = "I")
	public static int anInt77;

	@OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!DBFHRNVI", name = "d", descriptor = "I")
	public static int anInt69 = 99;

	@OriginalMember(owner = "client!DBFHRNVI", name = "i", descriptor = "[I")
	private static final int[] anIntArray15 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!DBFHRNVI", name = "m", descriptor = "[I")
	private static final int[] anIntArray16 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!DBFHRNVI", name = "n", descriptor = "I")
	private static int anInt72 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!DBFHRNVI", name = "q", descriptor = "I")
	private static int anInt73 = -578;

	@OriginalMember(owner = "client!DBFHRNVI", name = "r", descriptor = "I")
	private static int anInt74 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!DBFHRNVI", name = "v", descriptor = "[I")
	private static final int[] anIntArray17 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!DBFHRNVI", name = "B", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!DBFHRNVI", name = "g", descriptor = "B")
	private byte aByte2 = 40;

	@OriginalMember(owner = "client!DBFHRNVI", name = "k", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!DBFHRNVI", name = "o", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!DBFHRNVI", name = "u", descriptor = "I")
	private int anInt76 = -942;

	@OriginalMember(owner = "client!DBFHRNVI", name = "z", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!DBFHRNVI", name = "e", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!DBFHRNVI", name = "f", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!DBFHRNVI", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!DBFHRNVI", name = "y", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!DBFHRNVI", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!DBFHRNVI", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!DBFHRNVI", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!DBFHRNVI", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!DBFHRNVI", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!DBFHRNVI", name = "C", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!DBFHRNVI", name = "D", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!DBFHRNVI", name = "E", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!DBFHRNVI", name = "F", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!DBFHRNVI", name = "G", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IBI)Z")
	public static boolean method21(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) Class11 local9 = Class11.method60(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local9.method63(arg1);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("63017, " + arg0 + ", " + -78 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(II)I")
	private static int method24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method31(arg0 + 45365, arg1 + 91923, 4) - 128 + (method31(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method31(arg0, arg1, 1) - 128 >> 2);
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([[[IIIILclient!EOSBSGLH;IIIIILclient!UMNOCQQA;)V")
	public static void method26(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class38 arg10) {
		try {
			@Pc(9) int local9 = arg0[arg2][arg3][arg5];
			@Pc(19) int local19 = arg0[arg2][arg3 + 1][arg5];
			@Pc(31) int local31 = arg0[arg2][arg3 + 1][arg5 + 1];
			@Pc(41) int local41 = arg0[arg2][arg3][arg5 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(55) boolean local55 = false;
			@Pc(58) Class11 local58 = Class11.method60(arg6);
			@Pc(70) int local70 = arg3 + (arg5 << 7) + (arg6 << 14) + 1073741824;
			if (!local58.aBoolean44) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg8 << 6) + arg9);
			@Pc(104) Class6_Sub1_Sub2 local104;
			if (arg9 == 22) {
				if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
					local104 = local58.method65(22, arg8, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, 22, true, local41);
				}
				arg10.method403(local70, local104, arg5, arg3, arg1, local84, local51);
				if (local58.aBoolean37 && local58.aBoolean44) {
					arg4.method69(arg3, arg5);
				}
			} else {
				@Pc(200) int local200;
				if (arg9 == 10 || arg9 == 11) {
					if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
						local104 = local58.method65(10, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, 10, true, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg9 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg8 == 1 || arg8 == 3) {
							local200 = local58.anInt127;
							local203 = local58.anInt111;
						} else {
							local200 = local58.anInt111;
							local203 = local58.anInt127;
						}
						arg10.method407(arg3, local200, local70, local104, local187, local84, local203, arg5, local51, arg1);
					}
					if (local58.aBoolean37) {
						arg4.method68(local58.anInt111, arg5, local58.anInt127, arg3, local58.aBoolean36, arg8);
					}
				} else if (arg9 >= 12) {
					if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
						local104 = local58.method65(arg9, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, arg9, true, local41);
					}
					arg10.method407(arg3, 1, local70, local104, 0, local84, 1, arg5, local51, arg1);
					if (local58.aBoolean37) {
						arg4.method68(local58.anInt111, arg5, local58.anInt127, arg3, local58.aBoolean36, arg8);
					}
				} else if (arg9 == 0) {
					if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
						local104 = local58.method65(0, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, 0, true, local41);
					}
					arg10.method405(local51, (Class6_Sub1_Sub2) null, arg5, anIntArray15[arg8], arg3, 0, arg1, local70, local104, local84);
					if (local58.aBoolean37) {
						arg4.method67(local58.aBoolean36, arg3, arg8, arg5, arg9);
					}
				} else if (arg9 == 1) {
					if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
						local104 = local58.method65(1, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, 1, true, local41);
					}
					arg10.method405(local51, (Class6_Sub1_Sub2) null, arg5, anIntArray17[arg8], arg3, 0, arg1, local70, local104, local84);
					if (local58.aBoolean37) {
						arg4.method67(local58.aBoolean36, arg3, arg8, arg5, arg9);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class6_Sub1_Sub2 local475;
					if (arg9 == 2) {
						local446 = arg8 + 1 & 0x3;
						@Pc(465) Class6_Sub1_Sub2 local465;
						if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
							local465 = local58.method65(2, 4 + arg8, local9, local19, local31, local41, -1);
							local475 = local58.method65(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 4 + arg8, local19, local31, local9, 2, true, local41);
							local475 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, local446, local19, local31, local9, 2, true, local41);
						}
						arg10.method405(local51, local475, arg5, anIntArray15[arg8], arg3, anIntArray15[local446], arg1, local70, local465, local84);
						if (local58.aBoolean37) {
							arg4.method67(local58.aBoolean36, arg3, arg8, arg5, arg9);
						}
					} else if (arg9 == 3) {
						if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
							local104 = local58.method65(3, arg8, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, 3, true, local41);
						}
						arg10.method405(local51, (Class6_Sub1_Sub2) null, arg5, anIntArray17[arg8], arg3, 0, arg1, local70, local104, local84);
						if (local58.aBoolean37) {
							arg4.method67(local58.aBoolean36, arg3, arg8, arg5, arg9);
						}
					} else if (arg9 == 9) {
						if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
							local104 = local58.method65(arg9, arg8, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, arg8, local19, local31, local9, arg9, true, local41);
						}
						arg10.method407(arg3, 1, local70, local104, 0, local84, 1, arg5, local51, arg1);
						if (local58.aBoolean37) {
							arg4.method68(local58.anInt111, arg5, local58.anInt127, arg3, local58.aBoolean36, arg8);
						}
					} else {
						if (local58.aBoolean41) {
							if (arg8 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg8 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg8 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg9 == 4) {
							if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
								local104 = local58.method65(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 0, local19, local31, local9, 4, true, local41);
							}
							arg10.method406(anIntArray15[arg8], 0, local70, local51, arg3, 0, local84, arg1, arg5, arg8 * 512, local104);
						} else if (arg9 == 5) {
							local446 = 16;
							local200 = arg10.method423(arg1, arg3, arg5);
							if (local200 > 0) {
								local446 = Class11.method60(local200 >> 14 & 0x7FFF).anInt116;
							}
							if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
								local475 = local58.method65(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 0, local19, local31, local9, 4, true, local41);
							}
							arg10.method406(anIntArray15[arg8], anIntArray16[arg8] * local446, local70, local51, arg3, anIntArray18[arg8] * local446, local84, arg1, arg5, arg8 * 512, local475);
						} else if (arg9 == 6) {
							if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
								local104 = local58.method65(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 0, local19, local31, local9, 4, true, local41);
							}
							arg10.method406(256, 0, local70, local51, arg3, 0, local84, arg1, arg5, arg8, local104);
						} else if (arg9 == 7) {
							if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
								local104 = local58.method65(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 0, local19, local31, local9, 4, true, local41);
							}
							arg10.method406(512, 0, local70, local51, arg3, 0, local84, arg1, arg5, arg8, local104);
						} else if (arg9 == 8) {
							if (local58.anInt114 == -1 && local58.anIntArray29 == null) {
								local104 = local58.method65(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class6_Sub1_Sub2_Sub1(local58.anInt114, arg6, 0, 0, local19, local31, local9, 4, true, local41);
							}
							arg10.method406(768, 0, local70, local51, arg3, 0, local84, arg1, arg5, arg8, local104);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("52797, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(III)I")
	private static int method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method33(local3, local13);
		@Pc(29) int local29 = method33(local3 + 1, local13);
		@Pc(35) int local35 = method33(local3, local13 + 1);
		@Pc(43) int local43 = method33(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method37(local23, local29, local9, arg2);
		@Pc(55) int local55 = method37(local35, local43, local9, arg2);
		return method37(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(II)I")
	private static int method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "(II)I")
	private static int method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method39(arg0 - 1, arg1 - 1) + method39(arg0 + 1, arg1 - 1) + method39(arg0 - 1, arg1 + 1) + method39(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method39(arg0 - 1, arg1) + method39(arg0 + 1, arg1) + method39(arg0, arg1 - 1) + method39(arg0, arg1 + 1);
		@Pc(59) int local59 = method39(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIB[B)Z")
	public static boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[] arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(8) boolean local8 = false;
			@Pc(22) Class6_Sub1_Sub4 local22 = new Class6_Sub1_Sub4(888, arg3);
			@Pc(24) int local24 = -1;
			label53: while (true) {
				@Pc(27) int local27 = local22.method253();
				if (local27 == 0) {
					return local3;
				}
				local24 += local27;
				@Pc(35) int local35 = 0;
				@Pc(37) boolean local37 = false;
				while (true) {
					@Pc(42) int local42;
					while (!local37) {
						local42 = local22.method253();
						if (local42 == 0) {
							continue label53;
						}
						local35 += local42 - 1;
						@Pc(64) int local64 = local35 & 0x3F;
						@Pc(70) int local70 = local35 >> 6 & 0x3F;
						@Pc(75) int local75 = local22.method239() >> 2;
						@Pc(79) int local79 = local70 + arg0;
						@Pc(83) int local83 = local64 + arg1;
						if (local79 > 0 && local83 > 0 && local79 < 103 && local83 < 103) {
							@Pc(96) Class11 local96 = Class11.method60(local24);
							if (local75 != 22 || !aBoolean22 || local96.aBoolean44 || local96.aBoolean42) {
								local3 &= local96.method64();
								local37 = true;
							}
						}
					}
					local42 = local22.method253();
					if (local42 == 0) {
						break;
					}
					local22.method239();
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("55648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(Lclient!PQBRPYKE;ILclient!QUPTMIEH;)V")
	public static void method36(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(2) Class30_Sub1 arg1) {
		try {
			@Pc(8) int local8 = -1;
			while (true) {
				@Pc(11) int local11 = arg0.method253();
				if (local11 == 0) {
					return;
				}
				local8 += local11;
				@Pc(20) Class11 local20 = Class11.method60(local8);
				local20.method56(anInt73, arg1);
				while (true) {
					@Pc(27) int local27 = arg0.method253();
					if (local27 == 0) {
						break;
					}
					arg0.method239();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("84859, " + arg0 + ", " + 39766 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "c", descriptor = "(IIII)I")
	private static int method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class6_Sub1_Sub3_Sub1.anIntArray123[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "e", descriptor = "(II)I")
	private static int method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "<init>", descriptor = "(II[[[B[[[II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			anInt69 = 99;
			this.anInt70 = arg0;
			this.anInt71 = arg4;
			this.anIntArrayArrayArray2 = arg3;
			this.aByteArrayArrayArray6 = arg2;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt70][this.anInt71];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt70][this.anInt71];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt70][this.anInt71];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt70][this.anInt71];
			this.anIntArrayArrayArray1 = new int[4][this.anInt70 + 1][this.anInt71 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt70 + 1][this.anInt71 + 1];
			this.anIntArrayArray2 = new int[this.anInt70 + 1][this.anInt71 + 1];
			this.anIntArray19 = new int[this.anInt71];
			this.anIntArray20 = new int[this.anInt71];
			this.anIntArray21 = new int[this.anInt71];
			this.anIntArray22 = new int[this.anInt71];
			this.anIntArray23 = new int[this.anInt71];
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("14366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIIII)V")
	public void method22(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg1; local3++) {
				for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg0; local7++) {
					if (local7 >= 0 && local7 < this.anInt70 && local3 >= 0 && local3 < this.anInt71) {
						this.aByteArrayArrayArray2[0][local7][local3] = 127;
						if (local7 == arg2 && local7 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 - 1][local3];
						}
						if (local7 == arg2 + arg0 && local7 < this.anInt70 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg1 && local3 < this.anInt71 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("76066, " + arg0 + ", " + 73 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIIIIIILclient!PQBRPYKE;)V")
	private void method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub1_Sub4 arg6) {
		try {
			@Pc(27) int local27;
			if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
				this.aByteArrayArrayArray6[arg4][arg1][arg3] = 0;
				while (true) {
					local27 = arg6.method239();
					if (local27 == 0) {
						if (arg4 == 0) {
							this.anIntArrayArrayArray2[0][arg1][arg3] = -method24(932731 + arg1 + arg5, 556238 + arg3 + arg2) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg4][arg1][arg3] = this.anIntArrayArrayArray2[arg4 - 1][arg1][arg3] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg6.method239();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg4 == 0) {
							this.anIntArrayArrayArray2[0][arg1][arg3] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg4][arg1][arg3] = this.anIntArrayArrayArray2[arg4 - 1][arg1][arg3] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray1[arg4][arg1][arg3] = arg6.method240();
						this.aByteArrayArrayArray5[arg4][arg1][arg3] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray4[arg4][arg1][arg3] = (byte) (local27 - 2 + arg0 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray6[arg4][arg1][arg3] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray3[arg4][arg1][arg3] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg6.method239();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg6.method239();
						return;
					}
					if (local27 <= 49) {
						arg6.method239();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("96923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([BIIB[Lclient!EOSBSGLH;II)V")
	public void method25(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class12[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(22) int local22;
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						if (arg2 + local18 > 0 && arg2 + local18 < 103 && arg4 + local22 > 0 && arg4 + local22 < 103) {
							arg3[local14].anIntArrayArray3[arg2 + local18][arg4 + local22] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(76) Class6_Sub1_Sub4 local76 = new Class6_Sub1_Sub4(888, arg0);
			for (local22 = 0; local22 < 4; local22++) {
				for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
					for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
						this.method23(0, local82 + arg2, arg5, local86 + arg4, local22, arg1, local76);
					}
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("20428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -108 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(Lclient!UMNOCQQA;[Lclient!EOSBSGLH;[BIIB)V")
	public void method27(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class12[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg5 != this.aByte2) {
				this.anInt76 = 483;
			}
			@Pc(14) Class6_Sub1_Sub4 local14 = new Class6_Sub1_Sub4(888, arg2);
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local14.method253();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local14.method253();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local14.method239();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg3;
					@Pc(71) int local71 = local42 + arg4;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray6[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class12 local98 = null;
						if (local83 >= 0) {
							local98 = arg1[local83];
						}
						this.method28(arg0, local16, local71, local52, local67, local98, local59, local63);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("13146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(Lclient!UMNOCQQA;IIIZILclient!EOSBSGLH;II)V")
	private void method28(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean22 && (this.aByteArrayArrayArray6[0][arg4][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg3][arg4][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method30(arg2, arg3, arg4) != anInt77) {
					return;
				}
			}
			if (arg3 < anInt69) {
				anInt69 = arg3;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg3][arg4][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg3][arg4 + 1][arg2];
			@Pc(73) int local73 = this.anIntArrayArrayArray2[arg3][arg4 + 1][arg2 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray2[arg3][arg4][arg2 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class11 local97 = Class11.method60(arg1);
			@Pc(109) int local109 = arg4 + (arg2 << 7) + (arg1 << 14) + 1073741824;
			if (!local97.aBoolean44) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(131) byte local131 = (byte) ((arg7 << 6) + arg6);
			@Pc(160) Class6_Sub1_Sub2 local160;
			if (arg6 != 22) {
				@Pc(258) int local258;
				if (arg6 == 10 || arg6 == 11) {
					if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
						local160 = local97.method65(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, 10, true, local84);
					}
					if (local160 != null) {
						@Pc(245) int local245 = 0;
						if (arg6 == 11) {
							local245 += 256;
						}
						@Pc(261) int local261;
						if (arg7 == 1 || arg7 == 3) {
							local258 = local97.anInt127;
							local261 = local97.anInt111;
						} else {
							local258 = local97.anInt111;
							local261 = local97.anInt127;
						}
						if (arg0.method407(arg4, local258, local109, local160, local245, local131, local261, arg2, local94, arg3) && local97.aBoolean34) {
							@Pc(292) Class6_Sub1_Sub2_Sub2 local292;
							if (local160 instanceof Class6_Sub1_Sub2_Sub2) {
								local292 = (Class6_Sub1_Sub2_Sub2) local160;
							} else {
								local292 = local97.method65(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local292 != null) {
								for (@Pc(308) int local308 = 0; local308 <= local258; local308++) {
									for (@Pc(312) int local312 = 0; local312 <= local261; local312++) {
										@Pc(319) int local319 = local292.anInt150 / 4;
										if (local319 > 30) {
											local319 = 30;
										}
										if (local319 > this.aByteArrayArrayArray2[arg3][arg4 + local308][arg2 + local312]) {
											this.aByteArrayArrayArray2[arg3][arg4 + local308][arg2 + local312] = (byte) local319;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean37 && arg5 != null) {
						arg5.method68(local97.anInt111, arg2, local97.anInt127, arg4, local97.aBoolean36, arg7);
					}
				} else if (arg6 >= 12) {
					if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
						local160 = local97.method65(arg6, arg7, local49, local60, local73, local84, -1);
					} else {
						local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, arg6, true, local84);
					}
					arg0.method407(arg4, 1, local109, local160, 0, local131, 1, arg2, local94, arg3);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x924;
					}
					if (local97.aBoolean37 && arg5 != null) {
						arg5.method68(local97.anInt111, arg2, local97.anInt127, arg4, local97.aBoolean36, arg7);
					}
				} else if (arg6 == 0) {
					if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
						local160 = local97.method65(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, 0, true, local84);
					}
					arg0.method405(local94, (Class6_Sub1_Sub2) null, arg2, anIntArray15[arg7], arg4, 0, arg3, local109, local160, local131);
					if (arg7 == 0) {
						if (local97.aBoolean34) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
						}
						if (local97.aBoolean38) {
							this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local97.aBoolean34) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean38) {
							this.anIntArrayArrayArray1[arg3][arg4][arg2 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local97.aBoolean34) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean38) {
							this.anIntArrayArrayArray1[arg3][arg4 + 1][arg2] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local97.aBoolean34) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
						}
						if (local97.aBoolean38) {
							this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x492;
						}
					}
					if (local97.aBoolean37 && arg5 != null) {
						arg5.method67(local97.aBoolean36, arg4, arg7, arg2, arg6);
					}
					if (local97.anInt116 != 16) {
						arg0.method413(arg3, arg2, arg4, local97.anInt116);
					}
				} else if (arg6 == 1) {
					if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
						local160 = local97.method65(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, 1, true, local84);
					}
					arg0.method405(local94, (Class6_Sub1_Sub2) null, arg2, anIntArray17[arg7], arg4, 0, arg3, local109, local160, local131);
					if (local97.aBoolean34) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
						}
					}
					if (local97.aBoolean37 && arg5 != null) {
						arg5.method67(local97.aBoolean36, arg4, arg7, arg2, arg6);
					}
				} else {
					@Pc(869) int local869;
					@Pc(898) Class6_Sub1_Sub2 local898;
					if (arg6 == 2) {
						local869 = arg7 + 1 & 0x3;
						@Pc(888) Class6_Sub1_Sub2 local888;
						if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
							local888 = local97.method65(2, 4 + arg7, local49, local60, local73, local84, -1);
							local898 = local97.method65(2, local869, local49, local60, local73, local84, -1);
						} else {
							local888 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 4 + arg7, local60, local73, local49, 2, true, local84);
							local898 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, local869, local60, local73, local49, 2, true, local84);
						}
						arg0.method405(local94, local898, arg2, anIntArray15[arg7], arg4, anIntArray15[local869], arg3, local109, local888, local131);
						if (local97.aBoolean38) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x249;
								this.anIntArrayArrayArray1[arg3][arg4][arg2 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray1[arg3][arg4][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg3][arg4 + 1][arg2] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray1[arg3][arg4 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x492;
								this.anIntArrayArrayArray1[arg3][arg4][arg2] |= 0x249;
							}
						}
						if (local97.aBoolean37 && arg5 != null) {
							arg5.method67(local97.aBoolean36, arg4, arg7, arg2, arg6);
						}
						if (local97.anInt116 != 16) {
							arg0.method413(arg3, arg2, arg4, local97.anInt116);
						}
					} else if (arg6 == 3) {
						if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
							local160 = local97.method65(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, 3, true, local84);
						}
						arg0.method405(local94, (Class6_Sub1_Sub2) null, arg2, anIntArray17[arg7], arg4, 0, arg3, local109, local160, local131);
						if (local97.aBoolean34) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							}
						}
						if (local97.aBoolean37 && arg5 != null) {
							arg5.method67(local97.aBoolean36, arg4, arg7, arg2, arg6);
						}
					} else if (arg6 == 9) {
						if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
							local160 = local97.method65(arg6, arg7, local49, local60, local73, local84, -1);
						} else {
							local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, arg6, true, local84);
						}
						arg0.method407(arg4, 1, local109, local160, 0, local131, 1, arg2, local94, arg3);
						if (local97.aBoolean37 && arg5 != null) {
							arg5.method68(local97.anInt111, arg2, local97.anInt127, arg4, local97.aBoolean36, arg7);
						}
					} else {
						if (local97.aBoolean41) {
							if (arg7 == 1) {
								local869 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local869;
							} else if (arg7 == 2) {
								local869 = local84;
								local84 = local60;
								local60 = local869;
								local869 = local73;
								local73 = local49;
								local49 = local869;
							} else if (arg7 == 3) {
								local869 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local869;
							}
						}
						if (arg6 == 4) {
							if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
								local160 = local97.method65(4, 0, local49, local60, local73, local84, -1);
							} else {
								local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 0, local60, local73, local49, 4, true, local84);
							}
							arg0.method406(anIntArray15[arg7], 0, local109, local94, arg4, 0, local131, arg3, arg2, arg7 * 512, local160);
						} else if (arg6 == 5) {
							local869 = 16;
							local258 = arg0.method423(arg3, arg4, arg2);
							if (local258 > 0) {
								local869 = Class11.method60(local258 >> 14 & 0x7FFF).anInt116;
							}
							if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
								local898 = local97.method65(4, 0, local49, local60, local73, local84, -1);
							} else {
								local898 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 0, local60, local73, local49, 4, true, local84);
							}
							arg0.method406(anIntArray15[arg7], anIntArray16[arg7] * local869, local109, local94, arg4, anIntArray18[arg7] * local869, local131, arg3, arg2, arg7 * 512, local898);
						} else if (arg6 == 6) {
							if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
								local160 = local97.method65(4, 0, local49, local60, local73, local84, -1);
							} else {
								local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 0, local60, local73, local49, 4, true, local84);
							}
							arg0.method406(256, 0, local109, local94, arg4, 0, local131, arg3, arg2, arg7, local160);
						} else if (arg6 == 7) {
							if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
								local160 = local97.method65(4, 0, local49, local60, local73, local84, -1);
							} else {
								local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 0, local60, local73, local49, 4, true, local84);
							}
							arg0.method406(512, 0, local109, local94, arg4, 0, local131, arg3, arg2, arg7, local160);
						} else if (arg6 == 8) {
							if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
								local160 = local97.method65(4, 0, local49, local60, local73, local84, -1);
							} else {
								local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, 0, local60, local73, local49, 4, true, local84);
							}
							arg0.method406(768, 0, local109, local94, arg4, 0, local131, arg3, arg2, arg7, local160);
						}
					}
				}
			} else if (!aBoolean22 || local97.aBoolean44 || local97.aBoolean42) {
				if (local97.anInt114 == -1 && local97.anIntArray29 == null) {
					local160 = local97.method65(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local160 = new Class6_Sub1_Sub2_Sub1(local97.anInt114, arg1, 0, arg7, local60, local73, local49, 22, true, local84);
				}
				arg0.method403(local109, local160, arg2, arg4, arg3, local131, local94);
				if (local97.aBoolean37 && local97.aBoolean44 && arg5 != null) {
					arg5.method69(arg4, arg2);
				}
			}
		} catch (@Pc(1643) RuntimeException local1643) {
			signlink.reporterror("23839, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1643.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "([Lclient!EOSBSGLH;IIIZIII[BI)V")
	public void method29(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
						arg0[arg6].anIntArrayArray3[arg3 + local3][arg2 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(60) Class6_Sub1_Sub4 local60 = new Class6_Sub1_Sub4(888, arg7);
			for (@Pc(62) int local62 = 0; local62 < 4; local62++) {
				for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						if (local62 == arg5 && local66 >= arg1 && local66 < arg1 + 8 && local70 >= arg8 && local70 < arg8 + 8) {
							this.method23(arg4, arg3 + Class47.method532(local66 & 0x7, this.aBoolean24, local70 & 0x7, arg4), 0, arg2 + Class47.method533(arg4, aBoolean23, local70 & 0x7, local66 & 0x7), arg6, 0, local60);
						} else {
							this.method23(0, -1, 0, -1, 0, 0, local60);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("5302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIII)I")
	private int method30(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray6[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("37957, " + -16053 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(IIII)V")
	public void method34(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg0][arg1 + local3][arg2 + local7] = 0;
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg0][arg1][arg2 + local7] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg2 + local7];
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg0][arg1 + local7][arg2] = this.anIntArrayArrayArray2[arg0][arg1 + local7][arg2 - 1];
				}
			}
			if (arg1 > 0 && this.anIntArrayArrayArray2[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray2[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = this.anIntArrayArrayArray2[arg0][arg1][arg2 - 1];
			} else if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = this.anIntArrayArrayArray2[arg0][arg1 - 1][arg2 - 1];
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("21905, " + -11121 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "d", descriptor = "(II)I")
	private int method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!DBFHRNVI", name = "b", descriptor = "(III)I")
	private int method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(IIILclient!UMNOCQQA;I[Lclient!EOSBSGLH;III[BI)V")
	public void method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(5) Class12[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(888, arg8);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method253();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method253();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method239();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg0 && local51 >= arg9 && local51 < arg9 + 8 && local45 >= arg2 && local45 < arg2 + 8) {
						@Pc(88) Class11 local88 = Class11.method60(local19);
						@Pc(105) int local105 = arg1 + Class47.method534(local51 & 0x7, local88.anInt111, arg7, local88.anInt127, local66, local45 & 0x7);
						@Pc(123) int local123 = arg6 + Class47.method535(arg7, this.aBoolean26, local45 & 0x7, local88.anInt127, local51 & 0x7, local66, local88.anInt111);
						if (local105 > 0 && local123 > 0 && local105 < 103 && local123 < 103) {
							@Pc(135) int local135 = arg5;
							if ((this.aByteArrayArrayArray6[1][local105][local123] & 0x2) == 2) {
								local135 = arg5 - 1;
							}
							@Pc(150) Class12 local150 = null;
							if (local135 >= 0) {
								local150 = arg4[local135];
							}
							this.method28(arg3, local19, local123, arg5, local105, local150, local62, local66 + arg7 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("65912, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBFHRNVI", name = "a", descriptor = "(I[Lclient!EOSBSGLH;Lclient!UMNOCQQA;)V")
	public void method42(@OriginalArg(1) Class12[] arg0, @OriginalArg(2) Class38 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray6[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method69(local7, local11);
							}
						}
					}
				}
			}
			anInt74 += (int) (Math.random() * 5.0D) - 2;
			if (anInt74 < -8) {
				anInt74 = -8;
			}
			if (anInt74 > 8) {
				anInt74 = 8;
			}
			anInt72 += (int) (Math.random() * 5.0D) - 2;
			if (anInt72 < -16) {
				anInt72 = -16;
			}
			if (anInt72 > 16) {
				anInt72 = 16;
			}
			@Pc(133) int local133;
			@Pc(139) int local139;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(169) int local169;
			@Pc(191) int local191;
			@Pc(204) int local204;
			@Pc(210) int local210;
			@Pc(214) int local214;
			@Pc(220) int local220;
			@Pc(236) int local236;
			@Pc(284) int local284;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray2[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = 768 * local133 >> 8;
				for (local141 = 1; local141 < this.anInt71 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt70 - 1; local145++) {
						local169 = this.anIntArrayArrayArray2[local7][local145 + 1][local141] - this.anIntArrayArrayArray2[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray2[local7][local145][local141 + 1] - this.anIntArrayArrayArray2[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + 65536 + local191 * local191));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = 96 + (-50 * local210 + -10 * local214 + -50 * local220) / local139;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray2[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt71; local145++) {
					this.anIntArray19[local145] = 0;
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt70 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt71; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt70) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class24 local378 = Class24.aClass24Array1[local210 - 1];
								this.anIntArray19[local191] += local378.anInt326;
								this.anIntArray20[local191] += local378.anInt324;
								this.anIntArray21[local191] += local378.anInt325;
								this.anIntArray22[local191] += local378.anInt327;
								local419 = this.anIntArray23[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt70) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class24 local451 = Class24.aClass24Array1[local214 - 1];
								this.anIntArray19[local191] -= local451.anInt326;
								this.anIntArray20[local191] -= local451.anInt324;
								this.anIntArray21[local191] -= local451.anInt325;
								this.anIntArray22[local191] -= local451.anInt327;
								local419 = this.anIntArray23[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt70 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt71 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt71) {
								local204 += this.anIntArray19[local527];
								local210 += this.anIntArray20[local527];
								local214 += this.anIntArray21[local527];
								local220 += this.anIntArray22[local527];
								local236 += this.anIntArray23[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt71) {
								local204 -= this.anIntArray19[local572];
								local210 -= this.anIntArray20[local572];
								local214 -= this.anIntArray21[local572];
								local220 -= this.anIntArray22[local572];
								local236 -= this.anIntArray23[local572];
							}
							if (local284 >= 1 && local284 < this.anInt71 - 1 && (!aBoolean22 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method30(local284, local7, local169) == anInt77)) {
								if (local7 < anInt69) {
									anInt69 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray2[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray2[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray2[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray2[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray2[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray2[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray2[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray2[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method40(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt74 & 0xFF;
										local786 += anInt72;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method40(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class24.aClass24Array1[local682 - 1].aBoolean83) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray1[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class6_Sub1_Sub3_Sub1.anIntArray127[method32(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method402(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method32(local768, local737), method32(local768, local746), method32(local768, local757), method32(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class24 local941 = Class24.aClass24Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt322;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class6_Sub1_Sub3_Sub1.method209(local944);
											local952 = -1;
										} else if (local941.anInt321 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class6_Sub1_Sub3_Sub1.anIntArray127[this.method38(local941.anInt328, 96)];
										} else {
											local952 = this.method40(local941.anInt323, local941.anInt324, local941.anInt325);
											local950 = Class6_Sub1_Sub3_Sub1.anIntArray127[this.method38(local941.anInt328, 96)];
										}
										arg1.method402(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method32(local768, local737), method32(local768, local746), method32(local768, local757), method32(local768, local766), this.method38(local952, local737), this.method38(local952, local746), this.method38(local952, local757), this.method38(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt71 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt70 - 1; local204++) {
						arg1.method401(local7, local204, local191, this.method30(local191, local7, local204));
					}
				}
			}
			arg1.method428(83);
			for (local11 = 0; local11 < this.anInt70; local11++) {
				for (local27 = 0; local27 < this.anInt71; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg1.method399(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1127) int local1127 = 2;
			@Pc(1129) int local1129 = 4;
			for (@Pc(1131) int local1131 = 0; local1131 < 4; local1131++) {
				if (local1131 > 0) {
					local27 <<= 0x3;
					local1127 <<= 0x3;
					local1129 <<= 0x3;
				}
				for (@Pc(1149) int local1149 = 0; local1149 <= local1131; local1149++) {
					for (local133 = 0; local133 <= this.anInt71; local133++) {
						for (local139 = 0; local139 <= this.anInt70; local139++) {
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1149;
								local191 = local1149;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1149][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt71 && (this.anIntArrayArrayArray1[local1149][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label329: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local139][local204] & local27) == 0) {
											break label329;
										}
									}
									local169--;
								}
								label318: while (local191 < local1131) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local139][local204] & local27) == 0) {
											break label318;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 - local141 + 1);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local139][local141];
									Class38.method400(local220, local139 * 128, local145 * 128 + 128, local139 * 128, local141 * 128, 1, local1131, local214);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local1127) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1149;
								local191 = local1149;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1149][local141 - 1][local133] & local1127) != 0) {
									local141--;
								}
								while (local145 < this.anInt70 && (this.anIntArrayArrayArray1[local1149][local145 + 1][local133] & local1127) != 0) {
									local145++;
								}
								label382: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local204][local133] & local1127) == 0) {
											break label382;
										}
									}
									local169--;
								}
								label371: while (local191 < local1131) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local204][local133] & local1127) == 0) {
											break label371;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 - local141 + 1);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local141][local133];
									Class38.method400(local220, local141 * 128, local133 * 128, local145 * 128 + 128, local133 * 128, 2, local1131, local214);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local284][local133] &= ~local1127;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local1129) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray1[local1149][local139][local169 - 1] & local1129) != 0) {
									local169--;
								}
								while (local191 < this.anInt71 && (this.anIntArrayArrayArray1[local1149][local139][local191 + 1] & local1129) != 0) {
									local191++;
								}
								label435: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1149][local141 - 1][local204] & local1129) == 0) {
											break label435;
										}
									}
									local141--;
								}
								label424: while (local145 < this.anInt70) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1149][local145 + 1][local204] & local1129) == 0) {
											break label424;
										}
									}
									local145++;
								}
								if ((local145 - local141 + 1) * (local191 - local169 + 1) >= 4) {
									local204 = this.anIntArrayArrayArray2[local1149][local141][local169];
									Class38.method400(local204, local141 * 128, local191 * 128 + 128, local145 * 128 + 128, local169 * 128, 4, local1131, local204);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray1[local1149][local210][local214] &= ~local1129;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1766) RuntimeException local1766) {
			signlink.reporterror("17659, " + 38 + ", " + arg0 + ", " + arg1 + ", " + local1766.toString());
			throw new RuntimeException();
		}
	}
}
