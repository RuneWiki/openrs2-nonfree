import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OBDFVVEL")
public final class Class27 {

	@OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!OBDFVVEL", name = "x", descriptor = "I")
	private static int anInt415;

	@OriginalMember(owner = "client!OBDFVVEL", name = "G", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "I")
	private static int anInt409 = 34585;

	@OriginalMember(owner = "client!OBDFVVEL", name = "d", descriptor = "I")
	private static int anInt411 = -447;

	@OriginalMember(owner = "client!OBDFVVEL", name = "f", descriptor = "[I")
	private static final int[] anIntArray124 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!OBDFVVEL", name = "l", descriptor = "[I")
	private static final int[] anIntArray125 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!OBDFVVEL", name = "m", descriptor = "[I")
	private static final int[] anIntArray126 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!OBDFVVEL", name = "n", descriptor = "B")
	private static byte aByte21 = -106;

	@OriginalMember(owner = "client!OBDFVVEL", name = "p", descriptor = "I")
	public static int anInt412 = 99;

	@OriginalMember(owner = "client!OBDFVVEL", name = "z", descriptor = "I")
	private static int anInt416 = 16592;

	@OriginalMember(owner = "client!OBDFVVEL", name = "A", descriptor = "I")
	private static int anInt417 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!OBDFVVEL", name = "B", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!OBDFVVEL", name = "D", descriptor = "I")
	private static int anInt418 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!OBDFVVEL", name = "E", descriptor = "[I")
	private static final int[] anIntArray132 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!OBDFVVEL", name = "i", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!OBDFVVEL", name = "k", descriptor = "B")
	private byte aByte20 = 6;

	@OriginalMember(owner = "client!OBDFVVEL", name = "C", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!OBDFVVEL", name = "q", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!OBDFVVEL", name = "r", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!OBDFVVEL", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!OBDFVVEL", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!OBDFVVEL", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!OBDFVVEL", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!OBDFVVEL", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!OBDFVVEL", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!OBDFVVEL", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!OBDFVVEL", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!OBDFVVEL", name = "s", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!OBDFVVEL", name = "t", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!OBDFVVEL", name = "u", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!OBDFVVEL", name = "v", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!OBDFVVEL", name = "w", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(Lclient!NQUAUMDT;BLclient!NJYVZTLI;)V")
	public static void method301(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) Class25_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(11) int local11 = arg0.method276();
				if (local11 == 0) {
					return;
				}
				local3 += local11;
				@Pc(20) Class19 local20 = Class19.method169(local3);
				local20.method164(arg1);
				while (true) {
					@Pc(27) int local27 = arg0.method276();
					if (local27 == 0) {
						break;
					}
					arg0.method262();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("11305, " + arg0 + ", " + 49 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(III)Z")
	public static boolean method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(11) Class19 local11 = Class19.method169(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method172(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("13688, " + arg0 + ", " + arg1 + ", " + -402 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(BIIILclient!UJWODGQS;Lclient!YCMSDYIA;I[[[IIII)V")
	public static void method305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41 arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			if (aByte21 != -106) {
				anInt416 = 37;
			}
			@Pc(14) int local14 = arg6[arg8][arg7][arg1];
			@Pc(24) int local24 = arg6[arg8][arg7 + 1][arg1];
			@Pc(36) int local36 = arg6[arg8][arg7 + 1][arg1 + 1];
			@Pc(46) int local46 = arg6[arg8][arg7][arg1 + 1];
			@Pc(56) int local56 = local14 + local24 + local36 + local46 >> 2;
			@Pc(59) Class19 local59 = Class19.method169(arg0);
			@Pc(71) int local71 = arg7 + (arg1 << 7) + (arg0 << 14) + 1073741824;
			if (!local59.aBoolean89) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg5 << 6) + arg9);
			@Pc(105) Class6_Sub2_Sub1 local105;
			if (arg9 == 22) {
				if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
					local105 = local59.method167(22, arg5, local14, local24, local36, local46, -1);
				} else {
					local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 22, local46, local24, local36, arg5, true, -126, local59.anInt322);
				}
				arg3.method408(local105, (byte) 1, local56, local85, arg1, local71, arg7, arg2);
				if (local59.aBoolean97 && local59.aBoolean89) {
					arg4.method517(arg7, aBoolean130, arg1);
				}
			} else {
				@Pc(201) int local201;
				if (arg9 == 10 || arg9 == 11) {
					if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
						local105 = local59.method167(10, arg5, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 10, local46, local24, local36, arg5, true, -126, local59.anInt322);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg9 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg5 == 1 || arg5 == 3) {
							local201 = local59.anInt304;
							local204 = local59.anInt319;
						} else {
							local201 = local59.anInt319;
							local204 = local59.anInt304;
						}
						arg3.method412(local71, local188, local201, arg1, arg7, local204, local85, local56, local105, arg2);
					}
					if (local59.aBoolean97) {
						arg4.method516(local59.aBoolean90, arg7, arg5, local59.anInt319, arg1, local59.anInt304);
					}
				} else if (arg9 >= 12) {
					if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
						local105 = local59.method167(arg9, arg5, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, arg9, local46, local24, local36, arg5, true, -126, local59.anInt322);
					}
					arg3.method412(local71, 0, 1, arg1, arg7, 1, local85, local56, local105, arg2);
					if (local59.aBoolean97) {
						arg4.method516(local59.aBoolean90, arg7, arg5, local59.anInt319, arg1, local59.anInt304);
					}
				} else if (arg9 == 0) {
					if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
						local105 = local59.method167(0, arg5, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 0, local46, local24, local36, arg5, true, -126, local59.anInt322);
					}
					arg3.method410(anInt409, anIntArray132[arg5], arg2, null, local85, arg1, local105, 0, local71, local56, arg7);
					if (local59.aBoolean97) {
						arg4.method515(local59.aBoolean90, arg5, arg1, arg9, arg7);
					}
				} else if (arg9 == 1) {
					if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
						local105 = local59.method167(1, arg5, local14, local24, local36, local46, -1);
					} else {
						local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 1, local46, local24, local36, arg5, true, -126, local59.anInt322);
					}
					arg3.method410(anInt409, anIntArray125[arg5], arg2, null, local85, arg1, local105, 0, local71, local56, arg7);
					if (local59.aBoolean97) {
						arg4.method515(local59.aBoolean90, arg5, arg1, arg9, arg7);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class6_Sub2_Sub1 local476;
					if (arg9 == 2) {
						local447 = arg5 + 1 & 0x3;
						@Pc(466) Class6_Sub2_Sub1 local466;
						if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
							local466 = local59.method167(2, arg5 + 4, local14, local24, local36, local46, -1);
							local476 = local59.method167(2, local447, local14, local24, local36, local46, -1);
						} else {
							local466 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 2, local46, local24, local36, arg5 + 4, true, -126, local59.anInt322);
							local476 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 2, local46, local24, local36, local447, true, -126, local59.anInt322);
						}
						arg3.method410(anInt409, anIntArray132[arg5], arg2, local476, local85, arg1, local466, anIntArray132[local447], local71, local56, arg7);
						if (local59.aBoolean97) {
							arg4.method515(local59.aBoolean90, arg5, arg1, arg9, arg7);
						}
					} else if (arg9 == 3) {
						if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
							local105 = local59.method167(3, arg5, local14, local24, local36, local46, -1);
						} else {
							local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 3, local46, local24, local36, arg5, true, -126, local59.anInt322);
						}
						arg3.method410(anInt409, anIntArray125[arg5], arg2, null, local85, arg1, local105, 0, local71, local56, arg7);
						if (local59.aBoolean97) {
							arg4.method515(local59.aBoolean90, arg5, arg1, arg9, arg7);
						}
					} else if (arg9 == 9) {
						if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
							local105 = local59.method167(arg9, arg5, local14, local24, local36, local46, -1);
						} else {
							local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, arg9, local46, local24, local36, arg5, true, -126, local59.anInt322);
						}
						arg3.method412(local71, 0, 1, arg1, arg7, 1, local85, local56, local105, arg2);
						if (local59.aBoolean97) {
							arg4.method516(local59.aBoolean90, arg7, arg5, local59.anInt319, arg1, local59.anInt304);
						}
					} else {
						if (local59.aBoolean98) {
							if (arg5 == 1) {
								local447 = local46;
								local46 = local36;
								local36 = local24;
								local24 = local14;
								local14 = local447;
							} else if (arg5 == 2) {
								local447 = local46;
								local46 = local24;
								local24 = local447;
								local447 = local36;
								local36 = local14;
								local14 = local447;
							} else if (arg5 == 3) {
								local447 = local46;
								local46 = local14;
								local14 = local24;
								local24 = local36;
								local36 = local447;
							}
						}
						if (arg9 == 4) {
							if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
								local105 = local59.method167(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 4, local46, local24, local36, 0, true, -126, local59.anInt322);
							}
							arg3.method411(local71, arg1, arg7, local85, 0, arg2, 0, local105, anIntArray132[arg5], arg5 * 512, local56);
						} else if (arg9 == 5) {
							local447 = 16;
							local201 = arg3.method428(arg2, arg7, arg1);
							if (local201 > 0) {
								local447 = Class19.method169(local201 >> 14 & 0x7FFF).anInt317;
							}
							if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
								local476 = local59.method167(4, 0, local14, local24, local36, local46, -1);
							} else {
								local476 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 4, local46, local24, local36, 0, true, -126, local59.anInt322);
							}
							arg3.method411(local71, arg1, arg7, local85, anIntArray126[arg5] * local447, arg2, anIntArray124[arg5] * local447, local476, anIntArray132[arg5], arg5 * 512, local56);
						} else if (arg9 == 6) {
							if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
								local105 = local59.method167(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 4, local46, local24, local36, 0, true, -126, local59.anInt322);
							}
							arg3.method411(local71, arg1, arg7, local85, 0, arg2, 0, local105, 256, arg5, local56);
						} else if (arg9 == 7) {
							if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
								local105 = local59.method167(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 4, local46, local24, local36, 0, true, -126, local59.anInt322);
							}
							arg3.method411(local71, arg1, arg7, local85, 0, arg2, 0, local105, 512, arg5, local56);
						} else if (arg9 == 8) {
							if (local59.anInt322 == -1 && local59.anIntArray104 == null) {
								local105 = local59.method167(4, 0, local14, local24, local36, local46, -1);
							} else {
								local105 = new Class6_Sub2_Sub1_Sub2(arg0, local14, 4, local46, local24, local36, 0, true, -126, local59.anInt322);
							}
							arg3.method411(local71, arg1, arg7, local85, 0, arg2, 0, local105, 768, arg5, local56);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("19177, " + -106 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(III)I")
	private static int method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method321(local3, local13);
		@Pc(29) int local29 = method321(local3 + 1, local13);
		@Pc(35) int local35 = method321(local3, local13 + 1);
		@Pc(43) int local43 = method321(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method322(local23, local29, local9, arg2);
		@Pc(55) int local55 = method322(local35, local43, local9, arg2);
		return method322(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method314(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(8) boolean local8 = true;
			@Pc(14) Class6_Sub2_Sub3 local14 = new Class6_Sub2_Sub3(-587, arg1);
			@Pc(16) int local16 = -1;
			label53: while (true) {
				@Pc(19) int local19 = local14.method276();
				if (local19 == 0) {
					return local8;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				@Pc(29) boolean local29 = false;
				while (true) {
					@Pc(34) int local34;
					while (!local29) {
						local34 = local14.method276();
						if (local34 == 0) {
							continue label53;
						}
						local27 += local34 - 1;
						@Pc(56) int local56 = local27 & 0x3F;
						@Pc(62) int local62 = local27 >> 6 & 0x3F;
						@Pc(67) int local67 = local14.method262() >> 2;
						@Pc(71) int local71 = local62 + arg2;
						@Pc(75) int local75 = local56 + arg0;
						if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
							@Pc(88) Class19 local88 = Class19.method169(local16);
							if (local67 != 22 || !aBoolean128 || local88.aBoolean89 || local88.aBoolean95) {
								local8 &= local88.method165();
								local29 = true;
							}
						}
					}
					local34 = local14.method276();
					if (local34 == 0) {
						break;
					}
					local14.method262();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("97019, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -90 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(II)I")
	private static int method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method307(arg0 + 45365, arg1 + 91923, 4) + (method307(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method307(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "(II)I")
	private static int method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!OBDFVVEL", name = "d", descriptor = "(II)I")
	private static int method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "e", descriptor = "(II)I")
	private static int method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method320(arg0 - 1, arg1 - 1) + method320(arg0 + 1, arg1 - 1) + method320(arg0 - 1, arg1 + 1) + method320(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method320(arg0 - 1, arg1) + method320(arg0 + 1, arg1) + method320(arg0, arg1 - 1) + method320(arg0, arg1 + 1);
		@Pc(59) int local59 = method320(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "b", descriptor = "(IIII)I")
	private static int method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class6_Sub2_Sub2_Sub4.anIntArray205[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "<init>", descriptor = "(IB[[[II[[[B)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt412 = 99;
			this.anInt413 = arg3;
			this.anInt414 = arg0;
			this.anIntArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray7 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt413][this.anInt414];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt413][this.anInt414];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt413][this.anInt414];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt413][this.anInt414];
			this.anIntArrayArrayArray2 = new int[4][this.anInt413 + 1][this.anInt414 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt413 + 1][this.anInt414 + 1];
			this.anIntArrayArray10 = new int[this.anInt413 + 1][this.anInt414 + 1];
			this.anIntArray127 = new int[this.anInt414];
			this.anIntArray128 = new int[this.anInt414];
			this.anIntArray129 = new int[this.anInt414];
			this.anIntArray130 = new int[this.anInt414];
			this.anIntArray131 = new int[this.anInt414];
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("27186, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IILclient!UJWODGQS;Lclient!YCMSDYIA;IIIII)V")
	private void method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean128 && (this.aByteArrayArrayArray7[0][arg4][arg6] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray7[arg5][arg4][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method310(arg6, 776, arg5, arg4) != anInt410) {
					return;
				}
			}
			if (arg5 < anInt412) {
				anInt412 = arg5;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg5][arg4][arg6];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg5][arg4 + 1][arg6];
			@Pc(73) int local73 = this.anIntArrayArrayArray1[arg5][arg4 + 1][arg6 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg5][arg4][arg6 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class19 local97 = Class19.method169(arg1);
			@Pc(109) int local109 = arg4 + (arg6 << 7) + (arg1 << 14) + 1073741824;
			if (arg7 != 16592) {
				this.aBoolean127 = !this.aBoolean127;
			}
			if (!local97.aBoolean89) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(134) byte local134 = (byte) ((arg8 << 6) + arg0);
			@Pc(163) Class6_Sub2_Sub1 local163;
			if (arg0 != 22) {
				@Pc(261) int local261;
				if (arg0 == 10 || arg0 == 11) {
					if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
						local163 = local97.method167(10, arg8, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 10, local84, local60, local73, arg8, true, -126, local97.anInt322);
					}
					if (local163 != null) {
						@Pc(248) int local248 = 0;
						if (arg0 == 11) {
							local248 += 256;
						}
						@Pc(264) int local264;
						if (arg8 == 1 || arg8 == 3) {
							local261 = local97.anInt304;
							local264 = local97.anInt319;
						} else {
							local261 = local97.anInt319;
							local264 = local97.anInt304;
						}
						if (arg2.method412(local109, local248, local261, arg6, arg4, local264, local134, local94, local163, arg5) && local97.aBoolean91) {
							@Pc(295) Class6_Sub2_Sub1_Sub3 local295;
							if (local163 instanceof Class6_Sub2_Sub1_Sub3) {
								local295 = (Class6_Sub2_Sub1_Sub3) local163;
							} else {
								local295 = local97.method167(10, arg8, local49, local60, local73, local84, -1);
							}
							if (local295 != null) {
								for (@Pc(311) int local311 = 0; local311 <= local261; local311++) {
									for (@Pc(315) int local315 = 0; local315 <= local264; local315++) {
										@Pc(322) int local322 = local295.anInt282 / 4;
										if (local322 > 30) {
											local322 = 30;
										}
										if (local322 > this.aByteArrayArrayArray5[arg5][arg4 + local311][arg6 + local315]) {
											this.aByteArrayArrayArray5[arg5][arg4 + local311][arg6 + local315] = (byte) local322;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean97 && arg3 != null) {
						arg3.method516(local97.aBoolean90, arg4, arg8, local97.anInt319, arg6, local97.anInt304);
					}
				} else if (arg0 >= 12) {
					if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
						local163 = local97.method167(arg0, arg8, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, arg0, local84, local60, local73, arg8, true, -126, local97.anInt322);
					}
					arg2.method412(local109, 0, 1, arg6, arg4, 1, local134, local94, local163, arg5);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x924;
					}
					if (local97.aBoolean97 && arg3 != null) {
						arg3.method516(local97.aBoolean90, arg4, arg8, local97.anInt319, arg6, local97.anInt304);
					}
				} else if (arg0 == 0) {
					if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
						local163 = local97.method167(0, arg8, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 0, local84, local60, local73, arg8, true, -126, local97.anInt322);
					}
					arg2.method410(anInt409, anIntArray132[arg8], arg5, null, local134, arg6, local163, 0, local109, local94, arg4);
					if (arg8 == 0) {
						if (local97.aBoolean91) {
							this.aByteArrayArrayArray5[arg5][arg4][arg6] = 50;
							this.aByteArrayArrayArray5[arg5][arg4][arg6 + 1] = 50;
						}
						if (local97.aBoolean92) {
							this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x249;
						}
					} else if (arg8 == 1) {
						if (local97.aBoolean91) {
							this.aByteArrayArrayArray5[arg5][arg4][arg6 + 1] = 50;
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6 + 1] = 50;
						}
						if (local97.aBoolean92) {
							this.anIntArrayArrayArray2[arg5][arg4][arg6 + 1] |= 0x492;
						}
					} else if (arg8 == 2) {
						if (local97.aBoolean91) {
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6] = 50;
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6 + 1] = 50;
						}
						if (local97.aBoolean92) {
							this.anIntArrayArrayArray2[arg5][arg4 + 1][arg6] |= 0x249;
						}
					} else if (arg8 == 3) {
						if (local97.aBoolean91) {
							this.aByteArrayArrayArray5[arg5][arg4][arg6] = 50;
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6] = 50;
						}
						if (local97.aBoolean92) {
							this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x492;
						}
					}
					if (local97.aBoolean97 && arg3 != null) {
						arg3.method515(local97.aBoolean90, arg8, arg6, arg0, arg4);
					}
					if (local97.anInt317 != 16) {
						arg2.method418(local97.anInt317, arg4, arg5, arg6);
					}
				} else if (arg0 == 1) {
					if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
						local163 = local97.method167(1, arg8, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 1, local84, local60, local73, arg8, true, -126, local97.anInt322);
					}
					arg2.method410(anInt409, anIntArray125[arg8], arg5, null, local134, arg6, local163, 0, local109, local94, arg4);
					if (local97.aBoolean91) {
						if (arg8 == 0) {
							this.aByteArrayArrayArray5[arg5][arg4][arg6 + 1] = 50;
						} else if (arg8 == 1) {
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6 + 1] = 50;
						} else if (arg8 == 2) {
							this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6] = 50;
						} else if (arg8 == 3) {
							this.aByteArrayArrayArray5[arg5][arg4][arg6] = 50;
						}
					}
					if (local97.aBoolean97 && arg3 != null) {
						arg3.method515(local97.aBoolean90, arg8, arg6, arg0, arg4);
					}
				} else {
					@Pc(872) int local872;
					@Pc(901) Class6_Sub2_Sub1 local901;
					if (arg0 == 2) {
						local872 = arg8 + 1 & 0x3;
						@Pc(891) Class6_Sub2_Sub1 local891;
						if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
							local891 = local97.method167(2, arg8 + 4, local49, local60, local73, local84, -1);
							local901 = local97.method167(2, local872, local49, local60, local73, local84, -1);
						} else {
							local891 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 2, local84, local60, local73, arg8 + 4, true, -126, local97.anInt322);
							local901 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 2, local84, local60, local73, local872, true, -126, local97.anInt322);
						}
						arg2.method410(anInt409, anIntArray132[arg8], arg5, local901, local134, arg6, local891, anIntArray132[local872], local109, local94, arg4);
						if (local97.aBoolean92) {
							if (arg8 == 0) {
								this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg4][arg6 + 1] |= 0x492;
							} else if (arg8 == 1) {
								this.anIntArrayArrayArray2[arg5][arg4][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg4 + 1][arg6] |= 0x249;
							} else if (arg8 == 2) {
								this.anIntArrayArrayArray2[arg5][arg4 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x492;
							} else if (arg8 == 3) {
								this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg4][arg6] |= 0x249;
							}
						}
						if (local97.aBoolean97 && arg3 != null) {
							arg3.method515(local97.aBoolean90, arg8, arg6, arg0, arg4);
						}
						if (local97.anInt317 != 16) {
							arg2.method418(local97.anInt317, arg4, arg5, arg6);
						}
					} else if (arg0 == 3) {
						if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
							local163 = local97.method167(3, arg8, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 3, local84, local60, local73, arg8, true, -126, local97.anInt322);
						}
						arg2.method410(anInt409, anIntArray125[arg8], arg5, null, local134, arg6, local163, 0, local109, local94, arg4);
						if (local97.aBoolean91) {
							if (arg8 == 0) {
								this.aByteArrayArrayArray5[arg5][arg4][arg6 + 1] = 50;
							} else if (arg8 == 1) {
								this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6 + 1] = 50;
							} else if (arg8 == 2) {
								this.aByteArrayArrayArray5[arg5][arg4 + 1][arg6] = 50;
							} else if (arg8 == 3) {
								this.aByteArrayArrayArray5[arg5][arg4][arg6] = 50;
							}
						}
						if (local97.aBoolean97 && arg3 != null) {
							arg3.method515(local97.aBoolean90, arg8, arg6, arg0, arg4);
						}
					} else if (arg0 == 9) {
						if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
							local163 = local97.method167(arg0, arg8, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, arg0, local84, local60, local73, arg8, true, -126, local97.anInt322);
						}
						arg2.method412(local109, 0, 1, arg6, arg4, 1, local134, local94, local163, arg5);
						if (local97.aBoolean97 && arg3 != null) {
							arg3.method516(local97.aBoolean90, arg4, arg8, local97.anInt319, arg6, local97.anInt304);
						}
					} else {
						if (local97.aBoolean98) {
							if (arg8 == 1) {
								local872 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local872;
							} else if (arg8 == 2) {
								local872 = local84;
								local84 = local60;
								local60 = local872;
								local872 = local73;
								local73 = local49;
								local49 = local872;
							} else if (arg8 == 3) {
								local872 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local872;
							}
						}
						if (arg0 == 4) {
							if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
								local163 = local97.method167(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 4, local84, local60, local73, 0, true, -126, local97.anInt322);
							}
							arg2.method411(local109, arg6, arg4, local134, 0, arg5, 0, local163, anIntArray132[arg8], arg8 * 512, local94);
						} else if (arg0 == 5) {
							local872 = 16;
							local261 = arg2.method428(arg5, arg4, arg6);
							if (local261 > 0) {
								local872 = Class19.method169(local261 >> 14 & 0x7FFF).anInt317;
							}
							if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
								local901 = local97.method167(4, 0, local49, local60, local73, local84, -1);
							} else {
								local901 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 4, local84, local60, local73, 0, true, -126, local97.anInt322);
							}
							arg2.method411(local109, arg6, arg4, local134, anIntArray126[arg8] * local872, arg5, anIntArray124[arg8] * local872, local901, anIntArray132[arg8], arg8 * 512, local94);
						} else if (arg0 == 6) {
							if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
								local163 = local97.method167(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 4, local84, local60, local73, 0, true, -126, local97.anInt322);
							}
							arg2.method411(local109, arg6, arg4, local134, 0, arg5, 0, local163, 256, arg8, local94);
						} else if (arg0 == 7) {
							if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
								local163 = local97.method167(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 4, local84, local60, local73, 0, true, -126, local97.anInt322);
							}
							arg2.method411(local109, arg6, arg4, local134, 0, arg5, 0, local163, 512, arg8, local94);
						} else if (arg0 == 8) {
							if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
								local163 = local97.method167(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 4, local84, local60, local73, 0, true, -126, local97.anInt322);
							}
							arg2.method411(local109, arg6, arg4, local134, 0, arg5, 0, local163, 768, arg8, local94);
						}
					}
				}
			} else if (!aBoolean128 || local97.aBoolean89 || local97.aBoolean95) {
				if (local97.anInt322 == -1 && local97.anIntArray104 == null) {
					local163 = local97.method167(22, arg8, local49, local60, local73, local84, -1);
				} else {
					local163 = new Class6_Sub2_Sub1_Sub2(arg1, local49, 22, local84, local60, local73, arg8, true, -126, local97.anInt322);
				}
				arg2.method408(local163, (byte) 1, local94, local134, arg6, local109, arg4, arg5);
				if (local97.aBoolean97 && local97.aBoolean89 && arg3 != null) {
					arg3.method517(arg4, aBoolean130, arg6);
				}
			}
		} catch (@Pc(1646) RuntimeException local1646) {
			signlink.reporterror("5922, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1646.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[B[Lclient!YCMSDYIA;Lclient!UJWODGQS;I)V")
	public void method304(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class47[] arg2, @OriginalArg(4) Class41 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(-587, arg1);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method276();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method276();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method262();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg4;
					@Pc(68) int local68 = local39 + arg0;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray7[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class47 local95 = null;
						if (local80 >= 0) {
							local95 = arg2[local80];
						}
						this.method303(local56, local9, arg3, local95, local64, local49, local68, anInt416, local60);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("56074, " + arg0 + ", " + -43202 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[Lclient!YCMSDYIA;[BIII)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
							arg2[local3].anIntArrayArray17[arg1 + local7][arg0 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(75) Class6_Sub2_Sub3 local75 = new Class6_Sub2_Sub3(-587, arg3);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
					for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
						this.method313(0, local85 + arg0, local75, arg4, local11, arg5, local81 + arg1);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("83543, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIZI)V")
	public void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) int local10;
			for (@Pc(6) int local6 = 0; local6 < 8; local6++) {
				for (local10 = 0; local10 < 8; local10++) {
					this.anIntArrayArrayArray1[arg1][arg0 + local6][arg2 + local10] = 0;
				}
			}
			if (arg0 > 0) {
				for (local10 = 1; local10 < 8; local10++) {
					this.anIntArrayArrayArray1[arg1][arg0][arg2 + local10] = this.anIntArrayArrayArray1[arg1][arg0 - 1][arg2 + local10];
				}
			}
			if (arg2 > 0) {
				for (local10 = 1; local10 < 8; local10++) {
					this.anIntArrayArrayArray1[arg1][arg0 + local10][arg2] = this.anIntArrayArrayArray1[arg1][arg0 + local10][arg2 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray1[arg1][arg0 - 1][arg2] != 0) {
				this.anIntArrayArrayArray1[arg1][arg0][arg2] = this.anIntArrayArrayArray1[arg1][arg0 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray1[arg1][arg0][arg2 - 1] != 0) {
				this.anIntArrayArrayArray1[arg1][arg0][arg2] = this.anIntArrayArrayArray1[arg1][arg0][arg2 - 1];
			} else if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray1[arg1][arg0 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray1[arg1][arg0][arg2] = this.anIntArrayArrayArray1[arg1][arg0 - 1][arg2 - 1];
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("27259, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIBII)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg1; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt413 && local3 >= 0 && local3 < this.anInt414) {
						this.aByteArrayArrayArray5[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg2 && local7 < this.anInt413 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg0 + arg1 && local3 < this.anInt414 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("9085, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IIII)I")
	private int method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if ((this.aByteArrayArrayArray7[arg2][arg3][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray7[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("39537, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "c", descriptor = "(III)I")
	private int method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II)I")
	private int method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(IILclient!NQUAUMDT;IIIZI)V")
	private void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(32) int local32;
			if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
				this.aByteArrayArrayArray7[arg4][arg6][arg1] = 0;
				while (true) {
					local32 = arg2.method262();
					if (local32 == 0) {
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg6][arg1] = -method315(arg6 + arg5 + 932731, arg1 + 556238 + arg3) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg4][arg6][arg1] = this.anIntArrayArrayArray1[arg4 - 1][arg6][arg1] - 240;
							return;
						}
					}
					if (local32 == 1) {
						@Pc(86) int local86 = arg2.method262();
						if (local86 == 1) {
							local86 = 0;
						}
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg6][arg1] = -local86 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg4][arg6][arg1] = this.anIntArrayArrayArray1[arg4 - 1][arg6][arg1] - local86 * 8;
						return;
					}
					if (local32 <= 49) {
						this.aByteArrayArrayArray4[arg4][arg6][arg1] = arg2.method263();
						this.aByteArrayArrayArray6[arg4][arg6][arg1] = (byte) ((local32 - 2) / 4);
						this.aByteArrayArrayArray3[arg4][arg6][arg1] = (byte) (local32 + arg0 - 2 & 0x3);
					} else if (local32 <= 81) {
						this.aByteArrayArrayArray7[arg4][arg6][arg1] = (byte) (local32 - 49);
					} else {
						this.aByteArrayArrayArray2[arg4][arg6][arg1] = (byte) (local32 - 81);
					}
				}
			} else {
				while (true) {
					local32 = arg2.method262();
					if (local32 == 0) {
						return;
					}
					if (local32 == 1) {
						arg2.method262();
						return;
					}
					if (local32 <= 49) {
						arg2.method262();
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("36191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(II[BII[Lclient!YCMSDYIA;IIII)V")
	public void method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg1 + local3 > 0 && arg1 + local3 < 103 && arg6 + local7 > 0 && arg6 + local7 < 103) {
						arg5[arg8].anIntArrayArray17[arg1 + local3][arg6 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(64) Class6_Sub2_Sub3 local64 = new Class6_Sub2_Sub3(-587, arg2);
			for (@Pc(66) int local66 = 0; local66 < 4; local66++) {
				for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
					for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
						if (local66 == arg4 && local70 >= arg0 && local70 < arg0 + 8 && local74 >= arg3 && local74 < arg3 + 8) {
							this.method313(arg7, arg6 + Class30.method332(local70 & 0x7, local74 & 0x7, arg7), local64, 0, arg8, 0, arg1 + Class30.method331(local74 & 0x7, local70 & 0x7, arg7));
						} else {
							this.method313(0, -1, local64, 0, 0, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("80960, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 4 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "([Lclient!YCMSDYIA;Lclient!UJWODGQS;I)V")
	public void method317(@OriginalArg(0) Class47[] arg0, @OriginalArg(1) Class41 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray7[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method517(local7, aBoolean130, local11);
							}
						}
					}
				}
			}
			anInt417 += (int) (Math.random() * 5.0D) - 2;
			if (anInt417 < -8) {
				anInt417 = -8;
			}
			if (anInt417 > 8) {
				anInt417 = 8;
			}
			anInt418 += (int) (Math.random() * 5.0D) - 2;
			if (anInt418 < -16) {
				anInt418 = -16;
			}
			if (anInt418 > 16) {
				anInt418 = 16;
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
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(119) byte[][] local119 = this.aByteArrayArrayArray5[local7];
				local144 = (int) Math.sqrt((double) 5100);
				local150 = local144 * 768 >> 8;
				for (local152 = 1; local152 < this.anInt414 - 1; local152++) {
					for (local156 = 1; local156 < this.anInt413 - 1; local156++) {
						local180 = this.anIntArrayArrayArray1[local7][local156 + 1][local152] - this.anIntArrayArrayArray1[local7][local156 - 1][local152];
						local202 = this.anIntArrayArrayArray1[local7][local156][local152 + 1] - this.anIntArrayArrayArray1[local7][local156][local152 - 1];
						local215 = (int) Math.sqrt((double) (local180 * local180 + local202 * local202 + 65536));
						local221 = (local180 << 8) / local215;
						local225 = 65536 / local215;
						local231 = (local202 << 8) / local215;
						local247 = (local221 * -50 + local225 * -10 + local231 * -50) / local150 + 96;
						local295 = (local119[local156 - 1][local152] >> 2) + (local119[local156 + 1][local152] >> 3) + (local119[local156][local152 - 1] >> 2) + (local119[local156][local152 + 1] >> 3) + (local119[local156][local152] >> 1);
						this.anIntArrayArray10[local156][local152] = local247 - local295;
					}
				}
				for (local156 = 0; local156 < this.anInt414; local156++) {
					this.anIntArray127[local156] = 0;
					this.anIntArray128[local156] = 0;
					this.anIntArray129[local156] = 0;
					this.anIntArray130[local156] = 0;
					this.anIntArray131[local156] = 0;
				}
				for (local180 = -5; local180 < this.anInt413 + 5; local180++) {
					for (local202 = 0; local202 < this.anInt414; local202++) {
						local215 = local180 + 5;
						@Pc(430) int local430;
						if (local215 >= 0 && local215 < this.anInt413) {
							local221 = this.aByteArrayArrayArray2[local7][local215][local202] & 0xFF;
							if (local221 > 0) {
								@Pc(389) Class32 local389 = Class32.aClass32Array1[local221 - 1];
								this.anIntArray127[local202] += local389.anInt452;
								this.anIntArray128[local202] += local389.anInt450;
								this.anIntArray129[local202] += local389.anInt451;
								this.anIntArray130[local202] += local389.anInt453;
								local430 = this.anIntArray131[local202]++;
							}
						}
						local221 = local180 - 5;
						if (local221 >= 0 && local221 < this.anInt413) {
							local225 = this.aByteArrayArrayArray2[local7][local221][local202] & 0xFF;
							if (local225 > 0) {
								@Pc(462) Class32 local462 = Class32.aClass32Array1[local225 - 1];
								this.anIntArray127[local202] -= local462.anInt452;
								this.anIntArray128[local202] -= local462.anInt450;
								this.anIntArray129[local202] -= local462.anInt451;
								this.anIntArray130[local202] -= local462.anInt453;
								local430 = this.anIntArray131[local202]--;
							}
						}
					}
					if (local180 >= 1 && local180 < this.anInt413 - 1) {
						local215 = 0;
						local221 = 0;
						local225 = 0;
						local231 = 0;
						local247 = 0;
						for (local295 = -5; local295 < this.anInt414 + 5; local295++) {
							@Pc(538) int local538 = local295 + 5;
							if (local538 >= 0 && local538 < this.anInt414) {
								local215 += this.anIntArray127[local538];
								local221 += this.anIntArray128[local538];
								local225 += this.anIntArray129[local538];
								local231 += this.anIntArray130[local538];
								local247 += this.anIntArray131[local538];
							}
							@Pc(583) int local583 = local295 - 5;
							if (local583 >= 0 && local583 < this.anInt414) {
								local215 -= this.anIntArray127[local583];
								local221 -= this.anIntArray128[local583];
								local225 -= this.anIntArray129[local583];
								local231 -= this.anIntArray130[local583];
								local247 -= this.anIntArray131[local583];
							}
							if (local295 >= 1 && local295 < this.anInt414 - 1 && (!aBoolean128 || (this.aByteArrayArrayArray7[0][local180][local295] & 0x2) != 0 || (this.aByteArrayArrayArray7[local7][local180][local295] & 0x10) == 0 && this.method310(local295, 776, local7, local180) == anInt410)) {
								if (local7 < anInt412) {
									anInt412 = local7;
								}
								@Pc(682) int local682 = this.aByteArrayArrayArray2[local7][local180][local295] & 0xFF;
								@Pc(693) int local693 = this.aByteArrayArrayArray4[local7][local180][local295] & 0xFF;
								if (local682 > 0 || local693 > 0) {
									@Pc(706) int local706 = this.anIntArrayArrayArray1[local7][local180][local295];
									@Pc(717) int local717 = this.anIntArrayArrayArray1[local7][local180 + 1][local295];
									@Pc(730) int local730 = this.anIntArrayArrayArray1[local7][local180 + 1][local295 + 1];
									@Pc(741) int local741 = this.anIntArrayArrayArray1[local7][local180][local295 + 1];
									@Pc(748) int local748 = this.anIntArrayArray10[local180][local295];
									@Pc(757) int local757 = this.anIntArrayArray10[local180 + 1][local295];
									@Pc(768) int local768 = this.anIntArrayArray10[local180 + 1][local295 + 1];
									@Pc(777) int local777 = this.anIntArrayArray10[local180][local295 + 1];
									@Pc(779) int local779 = -1;
									@Pc(781) int local781 = -1;
									@Pc(789) int local789;
									@Pc(793) int local793;
									if (local682 > 0) {
										local789 = local215 * 256 / local231;
										local793 = local221 / local247;
										@Pc(797) int local797 = local225 / local247;
										local779 = this.method311(local789, local793, local797);
										@Pc(809) int local809 = local789 + anInt417 & 0xFF;
										local797 += anInt418;
										if (local797 < 0) {
											local797 = 0;
										} else if (local797 > 255) {
											local797 = 255;
										}
										local781 = this.method311(local809, local793, local797);
									}
									if (local7 > 0) {
										@Pc(834) boolean local834 = true;
										if (local682 == 0 && this.aByteArrayArrayArray6[local7][local180][local295] != 0) {
											local834 = false;
										}
										if (local693 > 0 && !Class32.aClass32Array1[local693 - 1].aBoolean142) {
											local834 = false;
										}
										if (local834 && local706 == local717 && local706 == local730 && local706 == local741) {
											this.anIntArrayArrayArray2[local7][local180][local295] |= 0x924;
										}
									}
									local789 = 0;
									if (local779 != -1) {
										local789 = Class6_Sub2_Sub2_Sub4.anIntArray209[method319(local781, 96)];
									}
									if (local693 == 0) {
										arg1.method407(local7, local180, local295, 0, 0, -1, local706, local717, local730, local741, method319(local779, local748), method319(local779, local757), method319(local779, local768), method319(local779, local777), 0, 0, 0, 0, local789, 0);
									} else {
										local793 = this.aByteArrayArrayArray6[local7][local180][local295] + 1;
										@Pc(946) byte local946 = this.aByteArrayArrayArray3[local7][local180][local295];
										@Pc(952) Class32 local952 = Class32.aClass32Array1[local693 - 1];
										@Pc(955) int local955 = local952.anInt448;
										@Pc(963) int local963;
										@Pc(961) int local961;
										if (local955 >= 0) {
											local961 = Class6_Sub2_Sub2_Sub4.method565(local955);
											local963 = -1;
										} else if (local952.anInt447 == 16711935) {
											local963 = -2;
											local955 = -1;
											local961 = Class6_Sub2_Sub2_Sub4.anIntArray209[this.method312(local952.anInt454, 96)];
										} else {
											local963 = this.method311(local952.anInt449, local952.anInt450, local952.anInt451);
											local961 = Class6_Sub2_Sub2_Sub4.anIntArray209[this.method312(local952.anInt454, 96)];
										}
										arg1.method407(local7, local180, local295, local793, local946, local955, local706, local717, local730, local741, method319(local779, local748), method319(local779, local757), method319(local779, local768), method319(local779, local777), this.method312(local963, local748), this.method312(local963, local757), this.method312(local963, local768), this.method312(local963, local777), local789, local961);
									}
								}
							}
						}
					}
				}
				for (local202 = 1; local202 < this.anInt414 - 1; local202++) {
					for (local215 = 1; local215 < this.anInt413 - 1; local215++) {
						arg1.method406(local7, local215, local202, this.method310(local202, 776, local7, local215));
					}
				}
			}
			arg1.method433();
			for (local11 = 0; local11 < this.anInt413; local11++) {
				for (local27 = 0; local27 < this.anInt414; local27++) {
					if ((this.aByteArrayArrayArray7[1][local11][local27] & 0x2) == 2) {
						arg1.method404((byte) 2, local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1138) int local1138 = 2;
			@Pc(1140) int local1140 = 4;
			for (@Pc(1142) int local1142 = 0; local1142 < 4; local1142++) {
				if (local1142 > 0) {
					local27 <<= 0x3;
					local1138 <<= 0x3;
					local1140 <<= 0x3;
				}
				for (@Pc(1160) int local1160 = 0; local1160 <= local1142; local1160++) {
					for (local144 = 0; local144 <= this.anInt414; local144++) {
						for (local150 = 0; local150 <= this.anInt413; local150++) {
							if ((this.anIntArrayArrayArray2[local1160][local150][local144] & local27) != 0) {
								local152 = local144;
								local156 = local144;
								local180 = local1160;
								local202 = local1160;
								while (local152 > 0 && (this.anIntArrayArrayArray2[local1160][local150][local152 - 1] & local27) != 0) {
									local152--;
								}
								while (local156 < this.anInt414 && (this.anIntArrayArrayArray2[local1160][local150][local156 + 1] & local27) != 0) {
									local156++;
								}
								label328: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray2[local180 - 1][local150][local215] & local27) == 0) {
											break label328;
										}
									}
									local180--;
								}
								label317: while (local202 < local1142) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray2[local202 + 1][local150][local215] & local27) == 0) {
											break label317;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray1[local202][local150][local152] - 240;
									local231 = this.anIntArrayArrayArray1[local180][local150][local152];
									Class41.method405(local225, local1142, local152 * 128, local150 * 128, local156 * 128 + 128, local231, 1, local150 * 128);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray2[local247][local150][local295] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1160][local150][local144] & local1138) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local1160;
								local202 = local1160;
								while (local152 > 0 && (this.anIntArrayArrayArray2[local1160][local152 - 1][local144] & local1138) != 0) {
									local152--;
								}
								while (local156 < this.anInt413 && (this.anIntArrayArrayArray2[local1160][local156 + 1][local144] & local1138) != 0) {
									local156++;
								}
								label381: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray2[local180 - 1][local215][local144] & local1138) == 0) {
											break label381;
										}
									}
									local180--;
								}
								label370: while (local202 < local1142) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray2[local202 + 1][local215][local144] & local1138) == 0) {
											break label370;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray1[local202][local152][local144] - 240;
									local231 = this.anIntArrayArrayArray1[local180][local152][local144];
									Class41.method405(local225, local1142, local144 * 128, local156 * 128 + 128, local144 * 128, local231, 2, local152 * 128);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray2[local247][local295][local144] &= ~local1138;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1160][local150][local144] & local1140) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local144;
								local202 = local144;
								while (local180 > 0 && (this.anIntArrayArrayArray2[local1160][local150][local180 - 1] & local1140) != 0) {
									local180--;
								}
								while (local202 < this.anInt414 && (this.anIntArrayArrayArray2[local1160][local150][local202 + 1] & local1140) != 0) {
									local202++;
								}
								label434: while (local152 > 0) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray2[local1160][local152 - 1][local215] & local1140) == 0) {
											break label434;
										}
									}
									local152--;
								}
								label423: while (local156 < this.anInt413) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray2[local1160][local156 + 1][local215] & local1140) == 0) {
											break label423;
										}
									}
									local156++;
								}
								if ((local156 + 1 - local152) * (local202 + 1 - local180) >= 4) {
									local215 = this.anIntArrayArrayArray1[local1160][local152][local180];
									Class41.method405(local215, local1142, local180 * 128, local156 * 128 + 128, local202 * 128 + 128, local215, 4, local152 * 128);
									for (local221 = local152; local221 <= local156; local221++) {
										for (local225 = local180; local225 <= local202; local225++) {
											this.anIntArrayArrayArray2[local1160][local221][local225] &= ~local1140;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1775) RuntimeException local1775) {
			signlink.reporterror("57003, " + arg0 + ", " + arg1 + ", " + -593 + ", " + local1775.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OBDFVVEL", name = "a", descriptor = "(ILclient!UJWODGQS;[Lclient!YCMSDYIA;Z[BIIIIII)V")
	public void method318(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class47[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class6_Sub2_Sub3 local7 = new Class6_Sub2_Sub3(-587, arg3);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method276();
				if (local15 == 0) {
					return;
				}
				local9 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method276();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method262();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					if (local48 == arg6 && local44 >= arg4 && local44 < arg4 + 8 && local38 >= arg7 && local38 < arg7 + 8) {
						@Pc(81) Class19 local81 = Class19.method169(local9);
						@Pc(99) int local99 = arg5 + Class30.method333(local59, local81.anInt319, local38 & 0x7, local81.anInt304, local44 & 0x7, this.aByte20, arg0);
						@Pc(116) int local116 = arg8 + Class30.method334(arg0, local38 & 0x7, local59, local81.anInt319, local44 & 0x7, local81.anInt304);
						if (local99 > 0 && local116 > 0 && local99 < 103 && local116 < 103) {
							@Pc(128) int local128 = arg9;
							if ((this.aByteArrayArrayArray7[1][local99][local116] & 0x2) == 2) {
								local128 = arg9 - 1;
							}
							@Pc(143) Class47 local143 = null;
							if (local128 >= 0) {
								local143 = arg2[local128];
							}
							this.method303(local55, local9, arg1, local143, local99, arg9, local116, anInt416, local59 + arg0 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("50483, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}
}
