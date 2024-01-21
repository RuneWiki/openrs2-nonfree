import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CDASFTJJ")
public final class Class8 {

	@OriginalMember(owner = "client!CDASFTJJ", name = "l", descriptor = "Z")
	private static boolean aBoolean30;

	@OriginalMember(owner = "client!CDASFTJJ", name = "B", descriptor = "Z")
	private static boolean aBoolean32;

	@OriginalMember(owner = "client!CDASFTJJ", name = "D", descriptor = "I")
	public static int anInt87;

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "[I")
	private static final int[] anIntArray14 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!CDASFTJJ", name = "h", descriptor = "I")
	private static int anInt80 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!CDASFTJJ", name = "m", descriptor = "I")
	private static int anInt81 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!CDASFTJJ", name = "p", descriptor = "[I")
	private static final int[] anIntArray15 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!CDASFTJJ", name = "q", descriptor = "I")
	public static int anInt83 = 99;

	@OriginalMember(owner = "client!CDASFTJJ", name = "t", descriptor = "Z")
	private static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!CDASFTJJ", name = "z", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!CDASFTJJ", name = "A", descriptor = "[I")
	private static final int[] anIntArray22 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!CDASFTJJ", name = "C", descriptor = "I")
	private static int anInt86 = -493;

	@OriginalMember(owner = "client!CDASFTJJ", name = "E", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!CDASFTJJ", name = "b", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!CDASFTJJ", name = "c", descriptor = "I")
	private int anInt79 = -35541;

	@OriginalMember(owner = "client!CDASFTJJ", name = "n", descriptor = "I")
	private int anInt82 = -406;

	@OriginalMember(owner = "client!CDASFTJJ", name = "r", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!CDASFTJJ", name = "s", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!CDASFTJJ", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!CDASFTJJ", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!CDASFTJJ", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!CDASFTJJ", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!CDASFTJJ", name = "d", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!CDASFTJJ", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!CDASFTJJ", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!CDASFTJJ", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!CDASFTJJ", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!CDASFTJJ", name = "u", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!CDASFTJJ", name = "v", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!CDASFTJJ", name = "w", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!CDASFTJJ", name = "x", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!CDASFTJJ", name = "y", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(Lclient!PKHWFJLM;Lclient!JHGVYYQH;I)V")
	public static void method59(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) Class9_Sub1 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg2 != -33719) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			local6 = -1;
			while (true) {
				@Pc(16) int local16 = arg0.method254();
				if (local16 == 0) {
					return;
				}
				local6 += local16;
				@Pc(25) Class26 local25 = Class26.method179(local6);
				local25.method182(arg1);
				while (true) {
					@Pc(32) int local32 = arg0.method254();
					if (local32 == 0) {
						break;
					}
					arg0.method240();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("50041, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(II)I")
	private static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method75(arg0 + 45365, arg1 + 91923, 4) + (method75(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method75(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(ILclient!WJVLISUF;IIILclient!TJMGSZMW;[[[IIZII)V")
	public static void method64(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class37 arg5, @OriginalArg(6) int[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg3][arg4][arg7];
			@Pc(19) int local19 = arg6[arg3][arg4 + 1][arg7];
			@Pc(31) int local31 = arg6[arg3][arg4 + 1][arg7 + 1];
			@Pc(41) int local41 = arg6[arg3][arg4][arg7 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class26 local54 = Class26.method179(arg2);
			@Pc(74) int local74 = arg4 + (arg7 << 7) + (arg2 << 14) + 1073741824;
			if (!local54.aBoolean78) {
				local74 += Integer.MIN_VALUE;
			}
			@Pc(88) byte local88 = (byte) ((arg8 << 6) + arg0);
			@Pc(108) Class5_Sub1_Sub2 local108;
			if (arg0 == 22) {
				if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
					local108 = local54.method184(22, arg8, local9, local19, local31, local41, -1);
				} else {
					local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, 22, local41, local54.anInt263);
				}
				arg1.method487(arg9, local108, arg4, local51, arg7, local74, local88);
				if (local54.aBoolean87 && local54.aBoolean78) {
					arg5.method427(arg4, arg7, anInt86);
				}
			} else {
				@Pc(204) int local204;
				if (arg0 == 10 || arg0 == 11) {
					if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
						local108 = local54.method184(10, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, 10, local41, local54.anInt263);
					}
					if (local108 != null) {
						@Pc(191) int local191 = 0;
						if (arg0 == 11) {
							local191 += 256;
						}
						@Pc(207) int local207;
						if (arg8 == 1 || arg8 == 3) {
							local204 = local54.anInt265;
							local207 = local54.anInt269;
						} else {
							local204 = local54.anInt269;
							local207 = local54.anInt265;
						}
						arg1.method491(arg7, arg9, local51, local207, local108, arg4, local74, local204, local191, local88);
					}
					if (local54.aBoolean87) {
						arg5.method426(arg4, arg7, local54.anInt265, local54.aBoolean89, arg8, local54.anInt269);
					}
				} else if (arg0 >= 12) {
					if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
						local108 = local54.method184(arg0, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, arg0, local41, local54.anInt263);
					}
					arg1.method491(arg7, arg9, local51, 1, local108, arg4, local74, 1, 0, local88);
					if (local54.aBoolean87) {
						arg5.method426(arg4, arg7, local54.anInt265, local54.aBoolean89, arg8, local54.anInt269);
					}
				} else if (arg0 == 0) {
					if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
						local108 = local54.method184(0, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, 0, local41, local54.anInt263);
					}
					arg1.method489(anIntArray15[arg8], aBoolean30, local51, 0, local74, local108, arg9, arg7, null, arg4, local88);
					if (local54.aBoolean87) {
						arg5.method425(arg8, local54.aBoolean89, arg0, arg7, arg4);
					}
				} else if (arg0 == 1) {
					if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
						local108 = local54.method184(1, arg8, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, 1, local41, local54.anInt263);
					}
					arg1.method489(anIntArray21[arg8], aBoolean30, local51, 0, local74, local108, arg9, arg7, null, arg4, local88);
					if (local54.aBoolean87) {
						arg5.method425(arg8, local54.aBoolean89, arg0, arg7, arg4);
					}
				} else {
					@Pc(450) int local450;
					@Pc(479) Class5_Sub1_Sub2 local479;
					if (arg0 == 2) {
						local450 = arg8 + 1 & 0x3;
						@Pc(469) Class5_Sub1_Sub2 local469;
						if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
							local469 = local54.method184(2, arg8 + 4, local9, local19, local31, local41, -1);
							local479 = local54.method184(2, local450, local9, local19, local31, local41, -1);
						} else {
							local469 = new Class5_Sub1_Sub2_Sub6(arg2, arg8 + 4, true, local31, 9, local9, local19, 2, local41, local54.anInt263);
							local479 = new Class5_Sub1_Sub2_Sub6(arg2, local450, true, local31, 9, local9, local19, 2, local41, local54.anInt263);
						}
						arg1.method489(anIntArray15[arg8], aBoolean30, local51, anIntArray15[local450], local74, local469, arg9, arg7, local479, arg4, local88);
						if (local54.aBoolean87) {
							arg5.method425(arg8, local54.aBoolean89, arg0, arg7, arg4);
						}
					} else if (arg0 == 3) {
						if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
							local108 = local54.method184(3, arg8, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, 3, local41, local54.anInt263);
						}
						arg1.method489(anIntArray21[arg8], aBoolean30, local51, 0, local74, local108, arg9, arg7, null, arg4, local88);
						if (local54.aBoolean87) {
							arg5.method425(arg8, local54.aBoolean89, arg0, arg7, arg4);
						}
					} else if (arg0 == 9) {
						if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
							local108 = local54.method184(arg0, arg8, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class5_Sub1_Sub2_Sub6(arg2, arg8, true, local31, 9, local9, local19, arg0, local41, local54.anInt263);
						}
						arg1.method491(arg7, arg9, local51, 1, local108, arg4, local74, 1, 0, local88);
						if (local54.aBoolean87) {
							arg5.method426(arg4, arg7, local54.anInt265, local54.aBoolean89, arg8, local54.anInt269);
						}
					} else {
						if (local54.aBoolean84) {
							if (arg8 == 1) {
								local450 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local450;
							} else if (arg8 == 2) {
								local450 = local41;
								local41 = local19;
								local19 = local450;
								local450 = local31;
								local31 = local9;
								local9 = local450;
							} else if (arg8 == 3) {
								local450 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local450;
							}
						}
						if (arg0 == 4) {
							if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
								local108 = local54.method184(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class5_Sub1_Sub2_Sub6(arg2, 0, true, local31, 9, local9, local19, 4, local41, local54.anInt263);
							}
							arg1.method490(local51, arg4, local108, local88, anIntArray15[arg8], local74, arg7, arg9, arg8 * 512, 0, 0);
						} else if (arg0 == 5) {
							local450 = 16;
							local204 = arg1.method507(arg9, arg4, arg7);
							if (local204 > 0) {
								local450 = Class26.method179(local204 >> 14 & 0x7FFF).anInt262;
							}
							if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
								local479 = local54.method184(4, 0, local9, local19, local31, local41, -1);
							} else {
								local479 = new Class5_Sub1_Sub2_Sub6(arg2, 0, true, local31, 9, local9, local19, 4, local41, local54.anInt263);
							}
							arg1.method490(local51, arg4, local479, local88, anIntArray15[arg8], local74, arg7, arg9, arg8 * 512, anIntArray22[arg8] * local450, anIntArray14[arg8] * local450);
						} else if (arg0 == 6) {
							if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
								local108 = local54.method184(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class5_Sub1_Sub2_Sub6(arg2, 0, true, local31, 9, local9, local19, 4, local41, local54.anInt263);
							}
							arg1.method490(local51, arg4, local108, local88, 256, local74, arg7, arg9, arg8, 0, 0);
						} else if (arg0 == 7) {
							if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
								local108 = local54.method184(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class5_Sub1_Sub2_Sub6(arg2, 0, true, local31, 9, local9, local19, 4, local41, local54.anInt263);
							}
							arg1.method490(local51, arg4, local108, local88, 512, local74, arg7, arg9, arg8, 0, 0);
						} else if (arg0 == 8) {
							if (local54.anInt263 == -1 && local54.anIntArray83 == null) {
								local108 = local54.method184(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class5_Sub1_Sub2_Sub6(arg2, 0, true, local31, 9, local9, local19, 4, local41, local54.anInt263);
							}
							arg1.method490(local51, arg4, local108, local88, 768, local74, arg7, arg9, arg8, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(1018) RuntimeException local1018) {
			signlink.reporterror("14054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + arg8 + ", " + arg9 + ", " + local1018.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(I[BII)Z")
	public static boolean method65(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class5_Sub1_Sub4 local9 = new Class5_Sub1_Sub4(arg0, 0);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local9.method254();
				if (local21 == 0) {
					return local3;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method254();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method240() >> 2;
						@Pc(73) int local73 = local64 + arg1;
						@Pc(77) int local77 = local58 + arg2;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class26 local90 = Class26.method179(local11);
							if (local69 != 22 || !aBoolean33 || local90.aBoolean78 || local90.aBoolean88) {
								local3 &= local90.method185();
								local31 = true;
							}
						}
					}
					local36 = local9.method254();
					if (local36 == 0) {
						break;
					}
					local9.method240();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("72432, " + -22551 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(IIII)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class5_Sub1_Sub1_Sub4.anIntArray205[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "b", descriptor = "(II)I")
	private static int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "b", descriptor = "(III)Z")
	public static boolean method73(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) Class26 local11 = Class26.method179(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method187(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("24737, " + 49097 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "c", descriptor = "(II)I")
	private static int method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method72(arg0 - 1, arg1 - 1) + method72(arg0 + 1, arg1 - 1) + method72(arg0 - 1, arg1 + 1) + method72(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method72(arg0 - 1, arg1) + method72(arg0 + 1, arg1) + method72(arg0, arg1 - 1) + method72(arg0, arg1 + 1);
		@Pc(59) int local59 = method72(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "c", descriptor = "(III)I")
	private static int method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method74(local3, local13);
		@Pc(29) int local29 = method74(local3 + 1, local13);
		@Pc(35) int local35 = method74(local3, local13 + 1);
		@Pc(43) int local43 = method74(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method68(local23, local29, local9, arg2);
		@Pc(55) int local55 = method68(local35, local43, local9, arg2);
		return method68(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "e", descriptor = "(II)I")
	private static int method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CDASFTJJ", name = "<init>", descriptor = "([[[I[[[BIII)V")
	public Class8(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt83 = 99;
			this.anInt84 = arg2;
			this.anInt85 = arg4;
			this.anIntArrayArrayArray2 = arg0;
			this.aByteArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt84][this.anInt85];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt84][this.anInt85];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt84][this.anInt85];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt84][this.anInt85];
			this.anIntArrayArrayArray1 = new int[4][this.anInt84 + 1][this.anInt85 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt84 + 1][this.anInt85 + 1];
			this.anIntArrayArray1 = new int[this.anInt84 + 1][this.anInt85 + 1];
			this.anIntArray16 = new int[this.anInt85];
			this.anIntArray17 = new int[this.anInt85];
			this.anIntArray18 = new int[this.anInt85];
			this.anIntArray19 = new int[this.anInt85];
			this.anIntArray20 = new int[this.anInt85];
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("62084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(II[Lclient!TJMGSZMW;[BIIIBII)V")
	public void method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6;
			if (arg7 != -123) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < 8; local6++) {
				for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
					if (arg6 + local6 > 0 && arg6 + local6 < 103 && arg8 + local17 > 0 && arg8 + local17 < 103) {
						arg2[arg4].anIntArrayArray15[arg6 + local6][arg8 + local17] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(67) Class5_Sub1_Sub4 local67 = new Class5_Sub1_Sub4(arg3, 0);
			for (@Pc(69) int local69 = 0; local69 < 4; local69++) {
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						if (local69 == arg0 && local73 >= arg5 && local73 < arg5 + 8 && local77 >= arg1 && local77 < arg1 + 8) {
							this.method69(0, arg8 + Class35.method385(arg9, local77 & 0x7, local73 & 0x7), local67, arg6 + Class35.method384(local77 & 0x7, local73 & 0x7, arg9), arg9, arg4, this.anInt78, 0);
						} else {
							this.method69(0, -1, local67, -1, 0, 0, this.anInt78, 0);
						}
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("5464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(III)I")
	private int method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(Lclient!WJVLISUF;[Lclient!TJMGSZMW;I)V")
	public void method62(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class37[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray3[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method427(local7, local11, anInt86);
							}
						}
					}
				}
			}
			anInt80 += (int) (Math.random() * 5.0D) - 2;
			if (anInt80 < -8) {
				anInt80 = -8;
			}
			if (anInt80 > 8) {
				anInt80 = 8;
			}
			anInt81 += (int) (Math.random() * 5.0D) - 2;
			if (anInt81 < -16) {
				anInt81 = -16;
			}
			if (anInt81 > 16) {
				anInt81 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray5[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt85 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt84 - 1; local145++) {
						local169 = this.anIntArrayArrayArray2[local7][local145 + 1][local141] - this.anIntArrayArrayArray2[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray2[local7][local145][local141 + 1] - this.anIntArrayArrayArray2[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt85; local145++) {
					this.anIntArray16[local145] = 0;
					this.anIntArray17[local145] = 0;
					this.anIntArray18[local145] = 0;
					this.anIntArray19[local145] = 0;
					this.anIntArray20[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt84 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt85; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt84) {
							local210 = this.aByteArrayArrayArray6[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class34 local378 = Class34.aClass34Array1[local210 - 1];
								this.anIntArray16[local191] += local378.anInt566;
								this.anIntArray17[local191] += local378.anInt564;
								this.anIntArray18[local191] += local378.anInt565;
								this.anIntArray19[local191] += local378.anInt567;
								local419 = this.anIntArray20[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt84) {
							local214 = this.aByteArrayArrayArray6[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class34 local451 = Class34.aClass34Array1[local214 - 1];
								this.anIntArray16[local191] -= local451.anInt566;
								this.anIntArray17[local191] -= local451.anInt564;
								this.anIntArray18[local191] -= local451.anInt565;
								this.anIntArray19[local191] -= local451.anInt567;
								local419 = this.anIntArray20[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt84 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt85 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt85) {
								local204 += this.anIntArray16[local527];
								local210 += this.anIntArray17[local527];
								local214 += this.anIntArray18[local527];
								local220 += this.anIntArray19[local527];
								local236 += this.anIntArray20[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt85) {
								local204 -= this.anIntArray16[local572];
								local210 -= this.anIntArray17[local572];
								local214 -= this.anIntArray18[local572];
								local220 -= this.anIntArray19[local572];
								local236 -= this.anIntArray20[local572];
							}
							if (local284 >= 1 && local284 < this.anInt85 - 1 && (!aBoolean33 || (this.aByteArrayArrayArray3[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local169][local284] & 0x10) == 0 && this.method70(local284, local169, local7) == anInt87)) {
								if (local7 < anInt83) {
									anInt83 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray2[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray2[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray2[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray2[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray1[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method61(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt80 & 0xFF;
										local786 += anInt81;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method61(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray1[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class34.aClass34Array1[local682 - 1].aBoolean145) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray1[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class5_Sub1_Sub1_Sub4.anIntArray209[method77(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method486(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method77(local768, local737), method77(local768, local746), method77(local768, local757), method77(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray1[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class34 local941 = Class34.aClass34Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt562;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class5_Sub1_Sub1_Sub4.method562(local944);
											local952 = -1;
										} else if (local941.anInt561 == 16711935) {
											local950 = 0;
											local952 = -2;
											local944 = -1;
										} else {
											local952 = this.method61(local941.anInt563, local941.anInt564, local941.anInt565);
											local950 = Class5_Sub1_Sub1_Sub4.anIntArray209[this.method76(local941.anInt568, 96)];
										}
										arg0.method486(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method77(local768, local737), method77(local768, local746), method77(local768, local757), method77(local768, local766), this.method76(local952, local737), this.method76(local952, local746), this.method76(local952, local757), this.method76(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt85 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt84 - 1; local204++) {
						arg0.method485(local7, local204, local191, this.method70(local191, local204, local7));
					}
				}
			}
			arg0.method512();
			for (local11 = 0; local11 < this.anInt84; local11++) {
				for (local27 = 0; local27 < this.anInt85; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg0.method483(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1132) int local1132 = 2;
			@Pc(1134) int local1134 = 4;
			for (@Pc(1136) int local1136 = 0; local1136 < 4; local1136++) {
				if (local1136 > 0) {
					local27 <<= 0x3;
					local1132 <<= 0x3;
					local1134 <<= 0x3;
				}
				for (@Pc(1154) int local1154 = 0; local1154 <= local1136; local1154++) {
					for (local133 = 0; local133 <= this.anInt85; local133++) {
						for (local139 = 0; local139 <= this.anInt84; local139++) {
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1154][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt85 && (this.anIntArrayArrayArray1[local1154][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local139][local141];
									Class46.method484(local145 * 128 + 128, local139 * 128, this.anInt82, local220, 1, local1136, local214, local139 * 128, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local1132) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1154][local141 - 1][local133] & local1132) != 0) {
									local141--;
								}
								while (local145 < this.anInt84 && (this.anIntArrayArrayArray1[local1154][local145 + 1][local133] & local1132) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local204][local133] & local1132) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local204][local133] & local1132) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local141][local133];
									Class46.method484(local133 * 128, local141 * 128, this.anInt82, local220, 2, local1136, local214, local145 * 128 + 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local284][local133] &= ~local1132;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray1[local1154][local139][local169 - 1] & local1134) != 0) {
									local169--;
								}
								while (local191 < this.anInt85 && (this.anIntArrayArrayArray1[local1154][local139][local191 + 1] & local1134) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1154][local141 - 1][local204] & local1134) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt84) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1154][local145 + 1][local204] & local1134) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray2[local1154][local141][local169];
									Class46.method484(local191 * 128 + 128, local141 * 128, this.anInt82, local204, 4, local1136, local204, local145 * 128 + 128, local169 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray1[local1154][local210][local214] &= ~local1134;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1772) RuntimeException local1772) {
			signlink.reporterror("39178, " + arg0 + ", " + arg1 + ", " + -396 + ", " + local1772.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(BIIII)V")
	public void method66(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg3; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt84 && local3 >= 0 && local3 < this.anInt85) {
						this.aByteArrayArrayArray5[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg2 && local7 < this.anInt84 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg3 && local3 < this.anInt85 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("97908, " + -73 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(IILclient!TJMGSZMW;ILclient!WJVLISUF;IIII)V")
	private void method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean33 && (this.aByteArrayArrayArray3[0][arg7][arg3] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg1][arg7][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method70(arg3, arg7, arg1) != anInt87) {
					return;
				}
			}
			if (arg1 < anInt83) {
				anInt83 = arg1;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg1][arg7][arg3];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg1][arg7 + 1][arg3];
			@Pc(73) int local73 = this.anIntArrayArrayArray2[arg1][arg7 + 1][arg3 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray2[arg1][arg7][arg3 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(107) Class26 local107 = Class26.method179(arg5);
			@Pc(119) int local119 = arg7 + (arg3 << 7) + (arg5 << 14) + 1073741824;
			if (!local107.aBoolean78) {
				local119 += Integer.MIN_VALUE;
			}
			@Pc(133) byte local133 = (byte) ((arg0 << 6) + arg6);
			@Pc(162) Class5_Sub1_Sub2 local162;
			if (arg6 != 22) {
				@Pc(260) int local260;
				if (arg6 == 10 || arg6 == 11) {
					if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
						local162 = local107.method184(10, arg0, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, 10, local84, local107.anInt263);
					}
					if (local162 != null) {
						@Pc(247) int local247 = 0;
						if (arg6 == 11) {
							local247 += 256;
						}
						@Pc(263) int local263;
						if (arg0 == 1 || arg0 == 3) {
							local260 = local107.anInt265;
							local263 = local107.anInt269;
						} else {
							local260 = local107.anInt269;
							local263 = local107.anInt265;
						}
						if (arg4.method491(arg3, arg1, local94, local263, local162, arg7, local119, local260, local247, local133) && local107.aBoolean82) {
							@Pc(294) Class5_Sub1_Sub2_Sub5 local294;
							if (local162 instanceof Class5_Sub1_Sub2_Sub5) {
								local294 = (Class5_Sub1_Sub2_Sub5) local162;
							} else {
								local294 = local107.method184(10, arg0, local49, local60, local73, local84, -1);
							}
							if (local294 != null) {
								for (@Pc(310) int local310 = 0; local310 <= local260; local310++) {
									for (@Pc(314) int local314 = 0; local314 <= local263; local314++) {
										@Pc(321) int local321 = local294.anInt456 / 4;
										if (local321 > 30) {
											local321 = 30;
										}
										if (local321 > this.aByteArrayArrayArray5[arg1][arg7 + local310][arg3 + local314]) {
											this.aByteArrayArrayArray5[arg1][arg7 + local310][arg3 + local314] = (byte) local321;
										}
									}
								}
							}
						}
					}
					if (local107.aBoolean87 && arg2 != null) {
						arg2.method426(arg7, arg3, local107.anInt265, local107.aBoolean89, arg0, local107.anInt269);
					}
				} else if (arg6 >= 12) {
					if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
						local162 = local107.method184(arg6, arg0, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, arg6, local84, local107.anInt263);
					}
					arg4.method491(arg3, arg1, local94, 1, local162, arg7, local119, 1, 0, local133);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x924;
					}
					if (local107.aBoolean87 && arg2 != null) {
						arg2.method426(arg7, arg3, local107.anInt265, local107.aBoolean89, arg0, local107.anInt269);
					}
				} else if (arg6 == 0) {
					if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
						local162 = local107.method184(0, arg0, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, 0, local84, local107.anInt263);
					}
					arg4.method489(anIntArray15[arg0], aBoolean30, local94, 0, local119, local162, arg1, arg3, null, arg7, local133);
					if (arg0 == 0) {
						if (local107.aBoolean82) {
							this.aByteArrayArrayArray5[arg1][arg7][arg3] = 50;
							this.aByteArrayArrayArray5[arg1][arg7][arg3 + 1] = 50;
						}
						if (local107.aBoolean80) {
							this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local107.aBoolean82) {
							this.aByteArrayArrayArray5[arg1][arg7][arg3 + 1] = 50;
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3 + 1] = 50;
						}
						if (local107.aBoolean80) {
							this.anIntArrayArrayArray1[arg1][arg7][arg3 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local107.aBoolean82) {
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3] = 50;
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3 + 1] = 50;
						}
						if (local107.aBoolean80) {
							this.anIntArrayArrayArray1[arg1][arg7 + 1][arg3] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local107.aBoolean82) {
							this.aByteArrayArrayArray5[arg1][arg7][arg3] = 50;
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3] = 50;
						}
						if (local107.aBoolean80) {
							this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x492;
						}
					}
					if (local107.aBoolean87 && arg2 != null) {
						arg2.method425(arg0, local107.aBoolean89, arg6, arg3, arg7);
					}
					if (local107.anInt262 != 16) {
						arg4.method497(arg7, arg1, arg3, local107.anInt262);
					}
				} else if (arg6 == 1) {
					if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
						local162 = local107.method184(1, arg0, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, 1, local84, local107.anInt263);
					}
					arg4.method489(anIntArray21[arg0], aBoolean30, local94, 0, local119, local162, arg1, arg3, null, arg7, local133);
					if (local107.aBoolean82) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray5[arg1][arg7][arg3 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray5[arg1][arg7][arg3] = 50;
						}
					}
					if (local107.aBoolean87 && arg2 != null) {
						arg2.method425(arg0, local107.aBoolean89, arg6, arg3, arg7);
					}
				} else {
					@Pc(871) int local871;
					@Pc(900) Class5_Sub1_Sub2 local900;
					if (arg6 == 2) {
						local871 = arg0 + 1 & 0x3;
						@Pc(890) Class5_Sub1_Sub2 local890;
						if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
							local890 = local107.method184(2, arg0 + 4, local49, local60, local73, local84, -1);
							local900 = local107.method184(2, local871, local49, local60, local73, local84, -1);
						} else {
							local890 = new Class5_Sub1_Sub2_Sub6(arg5, arg0 + 4, true, local73, 9, local49, local60, 2, local84, local107.anInt263);
							local900 = new Class5_Sub1_Sub2_Sub6(arg5, local871, true, local73, 9, local49, local60, 2, local84, local107.anInt263);
						}
						arg4.method489(anIntArray15[arg0], aBoolean30, local94, anIntArray15[local871], local119, local890, arg1, arg3, local900, arg7, local133);
						if (local107.aBoolean80) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x249;
								this.anIntArrayArrayArray1[arg1][arg7][arg3 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray1[arg1][arg7][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg1][arg7 + 1][arg3] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray1[arg1][arg7 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x492;
								this.anIntArrayArrayArray1[arg1][arg7][arg3] |= 0x249;
							}
						}
						if (local107.aBoolean87 && arg2 != null) {
							arg2.method425(arg0, local107.aBoolean89, arg6, arg3, arg7);
						}
						if (local107.anInt262 != 16) {
							arg4.method497(arg7, arg1, arg3, local107.anInt262);
						}
					} else if (arg6 == 3) {
						if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
							local162 = local107.method184(3, arg0, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, 3, local84, local107.anInt263);
						}
						arg4.method489(anIntArray21[arg0], aBoolean30, local94, 0, local119, local162, arg1, arg3, null, arg7, local133);
						if (local107.aBoolean82) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray5[arg1][arg7][arg3 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray5[arg1][arg7 + 1][arg3] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray5[arg1][arg7][arg3] = 50;
							}
						}
						if (local107.aBoolean87 && arg2 != null) {
							arg2.method425(arg0, local107.aBoolean89, arg6, arg3, arg7);
						}
					} else if (arg6 == 9) {
						if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
							local162 = local107.method184(arg6, arg0, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, arg6, local84, local107.anInt263);
						}
						arg4.method491(arg3, arg1, local94, 1, local162, arg7, local119, 1, 0, local133);
						if (local107.aBoolean87 && arg2 != null) {
							arg2.method426(arg7, arg3, local107.anInt265, local107.aBoolean89, arg0, local107.anInt269);
						}
					} else {
						if (local107.aBoolean84) {
							if (arg0 == 1) {
								local871 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local871;
							} else if (arg0 == 2) {
								local871 = local84;
								local84 = local60;
								local60 = local871;
								local871 = local73;
								local73 = local49;
								local49 = local871;
							} else if (arg0 == 3) {
								local871 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local871;
							}
						}
						if (arg6 == 4) {
							if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
								local162 = local107.method184(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class5_Sub1_Sub2_Sub6(arg5, 0, true, local73, 9, local49, local60, 4, local84, local107.anInt263);
							}
							arg4.method490(local94, arg7, local162, local133, anIntArray15[arg0], local119, arg3, arg1, arg0 * 512, 0, 0);
						} else if (arg6 == 5) {
							local871 = 16;
							local260 = arg4.method507(arg1, arg7, arg3);
							if (local260 > 0) {
								local871 = Class26.method179(local260 >> 14 & 0x7FFF).anInt262;
							}
							if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
								local900 = local107.method184(4, 0, local49, local60, local73, local84, -1);
							} else {
								local900 = new Class5_Sub1_Sub2_Sub6(arg5, 0, true, local73, 9, local49, local60, 4, local84, local107.anInt263);
							}
							arg4.method490(local94, arg7, local900, local133, anIntArray15[arg0], local119, arg3, arg1, arg0 * 512, anIntArray22[arg0] * local871, anIntArray14[arg0] * local871);
						} else if (arg6 == 6) {
							if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
								local162 = local107.method184(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class5_Sub1_Sub2_Sub6(arg5, 0, true, local73, 9, local49, local60, 4, local84, local107.anInt263);
							}
							arg4.method490(local94, arg7, local162, local133, 256, local119, arg3, arg1, arg0, 0, 0);
						} else if (arg6 == 7) {
							if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
								local162 = local107.method184(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class5_Sub1_Sub2_Sub6(arg5, 0, true, local73, 9, local49, local60, 4, local84, local107.anInt263);
							}
							arg4.method490(local94, arg7, local162, local133, 512, local119, arg3, arg1, arg0, 0, 0);
						} else if (arg6 == 8) {
							if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
								local162 = local107.method184(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class5_Sub1_Sub2_Sub6(arg5, 0, true, local73, 9, local49, local60, 4, local84, local107.anInt263);
							}
							arg4.method490(local94, arg7, local162, local133, 768, local119, arg3, arg1, arg0, 0, 0);
						}
					}
				}
			} else if (!aBoolean33 || local107.aBoolean78 || local107.aBoolean88) {
				if (local107.anInt263 == -1 && local107.anIntArray83 == null) {
					local162 = local107.method184(22, arg0, local49, local60, local73, local84, -1);
				} else {
					local162 = new Class5_Sub1_Sub2_Sub6(arg5, arg0, true, local73, 9, local49, local60, 22, local84, local107.anInt263);
				}
				arg4.method487(arg1, local162, arg7, local94, arg3, local119, local133);
				if (local107.aBoolean87 && local107.aBoolean78 && arg2 != null) {
					arg2.method427(arg7, arg3, anInt86);
				}
			}
		} catch (@Pc(1645) RuntimeException local1645) {
			signlink.reporterror("53539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 31613 + ", " + arg7 + ", " + local1645.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(IILclient!PKHWFJLM;IIIII)V")
	private void method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5;
			if (arg6 != 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg3 >= 0 && arg3 < 104 && arg1 >= 0 && arg1 < 104) {
				this.aByteArrayArrayArray3[arg5][arg3][arg1] = 0;
				while (true) {
					local5 = arg2.method240();
					if (local5 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray2[0][arg3][arg1] = -method63(arg3 + arg0 + 932731, arg1 + 556238 + arg7) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg5][arg3][arg1] = this.anIntArrayArrayArray2[arg5 - 1][arg3][arg1] - 240;
							return;
						}
					}
					if (local5 == 1) {
						@Pc(86) int local86 = arg2.method240();
						if (local86 == 1) {
							local86 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray2[0][arg3][arg1] = -local86 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg5][arg3][arg1] = this.anIntArrayArrayArray2[arg5 - 1][arg3][arg1] - local86 * 8;
						return;
					}
					if (local5 <= 49) {
						this.aByteArrayArrayArray2[arg5][arg3][arg1] = arg2.method241();
						this.aByteArrayArrayArray1[arg5][arg3][arg1] = (byte) ((local5 - 2) / 4);
						this.aByteArrayArrayArray4[arg5][arg3][arg1] = (byte) (local5 + arg4 - 2 & 0x3);
					} else if (local5 <= 81) {
						this.aByteArrayArrayArray3[arg5][arg3][arg1] = (byte) (local5 - 49);
					} else {
						this.aByteArrayArrayArray6[arg5][arg3][arg1] = (byte) (local5 - 81);
					}
				}
			} else {
				while (true) {
					local5 = arg2.method240();
					if (local5 == 0) {
						return;
					}
					if (local5 == 1) {
						arg2.method240();
						return;
					}
					if (local5 <= 49) {
						arg2.method240();
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("30709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(IBII)I")
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("45101, " + arg0 + ", " + -102 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(IIII[BI[Lclient!TJMGSZMW;)V")
	public void method71(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg5[local3].anIntArrayArray15[arg4 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class5_Sub1_Sub4 local65 = new Class5_Sub1_Sub4(arg3, 0);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method69(arg2, local75 + arg1, local65, local71 + arg4, 0, local11, this.anInt78, arg0);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("20647, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "d", descriptor = "(II)I")
	private int method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(II[BIIILclient!WJVLISUF;III[Lclient!TJMGSZMW;)V")
	public void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class46 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class37[] arg10) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg2, 0);
			if (arg0 != this.anInt79) {
				aBoolean32 = !aBoolean32;
			}
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method254();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method254();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method240();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg1 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg3 && local45 < arg3 + 8) {
						@Pc(88) Class26 local88 = Class26.method179(local19);
						@Pc(105) int local105 = arg4 + Class35.method386(local51 & 0x7, local88.anInt269, arg7, local45 & 0x7, local66, local88.anInt265);
						@Pc(122) int local122 = arg9 + Class35.method387(arg7, local88.anInt269, local88.anInt265, local51 & 0x7, local66, local45 & 0x7);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg8;
							if ((this.aByteArrayArrayArray3[1][local105][local122] & 0x2) == 2) {
								local134 = arg8 - 1;
							}
							@Pc(149) Class37 local149 = null;
							if (local134 >= 0) {
								local149 = arg10[local134];
							}
							this.method67(local66 + arg7 & 0x3, arg8, local149, local122, arg6, local19, local62, local105);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("65515, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDASFTJJ", name = "a", descriptor = "(ILclient!WJVLISUF;[Lclient!TJMGSZMW;II[B)V")
	public void method79(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class37[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class5_Sub1_Sub4 local7 = new Class5_Sub1_Sub4(arg4, 0);
			@Pc(17) int local17 = -1;
			while (true) {
				@Pc(20) int local20 = local7.method254();
				if (local20 == 0) {
					return;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method254();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method240();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					@Pc(68) int local68 = local49 + arg0;
					@Pc(72) int local72 = local43 + arg3;
					if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
						@Pc(84) int local84 = local53;
						if ((this.aByteArrayArrayArray3[1][local68][local72] & 0x2) == 2) {
							local84 = local53 - 1;
						}
						@Pc(99) Class37 local99 = null;
						if (local84 >= 0) {
							local99 = arg2[local84];
						}
						this.method67(local64, local53, local99, local72, arg1, local17, local60, local68);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("90306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 576 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}
}
