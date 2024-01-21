import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt77;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
	private static boolean aBoolean29;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt75 = -315;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt76 = 626;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt74;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method43(arg0 + 45365, arg1 + 91923, 4) + (method43(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method43(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method45(local3, local13);
		@Pc(29) int local29 = method45(local3 + 1, local13);
		@Pc(35) int local35 = method45(local3, local13 + 1);
		@Pc(43) int local43 = method45(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method44(local23, local29, local9, arg2);
		@Pc(55) int local55 = method44(local35, local43, local9, arg2);
		return method44(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub3_Sub2_Sub1.anIntArray138[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method46(arg0 - 1, arg1 - 1) + method46(arg0 + 1, arg1 - 1) + method46(arg0 - 1, arg1 + 1) + method46(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method46(arg0 - 1, arg1) + method46(arg0 + 1, arg1) + method46(arg0, arg1 - 1) + method46(arg0, arg1 + 1);
		@Pc(59) int local59 = method46(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ec;Lclient!ob;IILclient!r;[[[IIIIZII)V")
	public static void method50(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(7) int local7 = arg5[arg9][arg10][arg2];
			@Pc(17) int local17 = arg5[arg9][arg10 + 1][arg2];
			@Pc(29) int local29 = arg5[arg9][arg10 + 1][arg2 + 1];
			@Pc(39) int local39 = arg5[arg9][arg10][arg2 + 1];
			@Pc(49) int local49 = local7 + local17 + local29 + local39 >> 2;
			@Pc(56) Class2 local56 = Class2.method23(arg3);
			@Pc(68) int local68 = arg10 + (arg2 << 7) + (arg3 << 14) + 1073741824;
			if (!local56.aBoolean11) {
				local68 += Integer.MIN_VALUE;
			}
			@Pc(82) byte local82 = (byte) ((arg8 << 6) + arg6);
			@Pc(95) Class1_Sub3_Sub1 local95;
			if (arg6 == 22) {
				local95 = local56.method26(22, arg8, local7, local17, local29, local39, -1);
				arg4.method465(local49, local82, local68, arg10, arg7, local95, arg2);
				if (local56.aBoolean9 && local56.aBoolean11) {
					arg0.method251(arg2, arg10, anInt75);
				}
				if (local56.anInt41 != -1) {
					arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 3));
				}
			} else {
				@Pc(170) int local170;
				if (arg6 == 10 || arg6 == 11) {
					local95 = local56.method26(10, arg8, local7, local17, local29, local39, -1);
					if (local95 != null) {
						@Pc(157) int local157 = 0;
						if (arg6 == 11) {
							local157 += 256;
						}
						@Pc(173) int local173;
						if (arg8 == 1 || arg8 == 3) {
							local170 = local56.anInt40;
							local173 = local56.anInt39;
						} else {
							local170 = local56.anInt39;
							local173 = local56.anInt40;
						}
						arg4.method469(local170, arg10, local95, local82, arg2, arg7, local49, local157, local68, null, local173);
					}
					if (local56.aBoolean9) {
						arg0.method250(local56.aBoolean10, arg10, local56.anInt39, arg8, local56.anInt40, arg2);
					}
					if (local56.anInt41 != -1) {
						arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 2));
					}
				} else if (arg6 >= 12) {
					local95 = local56.method26(arg6, arg8, local7, local17, local29, local39, -1);
					arg4.method469(1, arg10, local95, local82, arg2, arg7, local49, 0, local68, null, 1);
					if (local56.aBoolean9) {
						arg0.method250(local56.aBoolean10, arg10, local56.anInt39, arg8, local56.anInt40, arg2);
					}
					if (local56.anInt41 != -1) {
						arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 2));
					}
				} else if (arg6 == 0) {
					local95 = local56.method26(0, arg8, local7, local17, local29, local39, -1);
					arg4.method467(0, arg2, local68, anIntArray18[arg8], arg10, arg7, local82, local49, null, local95);
					if (local56.aBoolean9) {
						arg0.method249(local56.aBoolean10, arg8, arg2, arg10, arg6);
					}
					if (local56.anInt41 != -1) {
						arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 0));
					}
				} else if (arg6 == 1) {
					local95 = local56.method26(1, arg8, local7, local17, local29, local39, -1);
					arg4.method467(0, arg2, local68, anIntArray19[arg8], arg10, arg7, local82, local49, null, local95);
					if (local56.aBoolean9) {
						arg0.method249(local56.aBoolean10, arg8, arg2, arg10, arg6);
					}
					if (local56.anInt41 != -1) {
						arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 0));
					}
				} else {
					@Pc(426) int local426;
					@Pc(448) Class1_Sub3_Sub1 local448;
					if (arg6 == 2) {
						local426 = arg8 + 1 & 0x3;
						@Pc(438) Class1_Sub3_Sub1 local438 = local56.method26(2, arg8 + 4, local7, local17, local29, local39, -1);
						local448 = local56.method26(2, local426, local7, local17, local29, local39, -1);
						arg4.method467(anIntArray18[local426], arg2, local68, anIntArray18[arg8], arg10, arg7, local82, local49, local448, local438);
						if (local56.aBoolean9) {
							arg0.method249(local56.aBoolean10, arg8, arg2, arg10, arg6);
						}
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 0));
						}
					} else if (arg6 == 3) {
						local95 = local56.method26(3, arg8, local7, local17, local29, local39, -1);
						arg4.method467(0, arg2, local68, anIntArray19[arg8], arg10, arg7, local82, local49, null, local95);
						if (local56.aBoolean9) {
							arg0.method249(local56.aBoolean10, arg8, arg2, arg10, arg6);
						}
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 0));
						}
					} else if (arg6 == 9) {
						local95 = local56.method26(arg6, arg8, local7, local17, local29, local39, -1);
						arg4.method469(1, arg10, local95, local82, arg2, arg7, local49, 0, local68, null, 1);
						if (local56.aBoolean9) {
							arg0.method250(local56.aBoolean10, arg10, local56.anInt39, arg8, local56.anInt40, arg2);
						}
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 2));
						}
					} else if (arg6 == 4) {
						local95 = local56.method26(4, 0, local7, local17, local29, local39, -1);
						arg4.method468(arg2, local49, local82, arg10, anIntArray18[arg8], arg7, local95, 0, local68, arg8 * 512, 0);
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 1));
						}
					} else if (arg6 == 5) {
						local426 = 16;
						local170 = arg4.method486(arg7, arg10, arg2);
						if (local170 > 0) {
							local426 = Class2.method23(local170 >> 14 & 0x7FFF).anInt42;
						}
						local448 = local56.method26(4, 0, local7, local17, local29, local39, -1);
						arg4.method468(arg2, local49, local82, arg10, anIntArray18[arg8], arg7, local448, anIntArray20[arg8] * local426, local68, arg8 * 512, anIntArray21[arg8] * local426);
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 1));
						}
					} else if (arg6 == 6) {
						local95 = local56.method26(4, 0, local7, local17, local29, local39, -1);
						arg4.method468(arg2, local49, local82, arg10, 256, arg7, local95, 0, local68, arg8, 0);
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 1));
						}
					} else if (arg6 == 7) {
						local95 = local56.method26(4, 0, local7, local17, local29, local39, -1);
						arg4.method468(arg2, local49, local82, arg10, 512, arg7, local95, 0, local68, arg8, 0);
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 1));
						}
					} else if (arg6 == 8) {
						local95 = local56.method26(4, 0, local7, local17, local29, local39, -1);
						arg4.method468(arg2, local49, local82, arg10, 768, arg7, local95, 0, local68, arg8, 0);
						if (local56.anInt41 != -1) {
							arg1.method445(new Class1_Sub6(true, arg3, (byte) 9, arg10, arg2, Class19.aClass19Array1[local56.anInt41], arg7, 1));
						}
					}
				}
			}
		} catch (@Pc(898) RuntimeException local898) {
			signlink.reporterror("6964, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + false + ", " + arg9 + ", " + arg10 + ", " + local898.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt78 = arg2;
			this.anInt79 = arg3;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg0;
			@Pc(20) int local20 = 9 / arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt78][this.anInt79];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt78][this.anInt79];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt78][this.anInt79];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt78][this.anInt79];
			this.anIntArrayArrayArray2 = new int[4][this.anInt78 + 1][this.anInt79 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt78 + 1][this.anInt79 + 1];
			this.anIntArrayArray1 = new int[this.anInt78 + 1][this.anInt79 + 1];
			this.anIntArray13 = new int[this.anInt79];
			this.anIntArray14 = new int[this.anInt79];
			this.anIntArray15 = new int[this.anInt79];
			this.anIntArray16 = new int[this.anInt79];
			this.anIntArray17 = new int[this.anInt79];
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("59351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) byte local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < Class11.anInt395; local9++) {
				if (Class11.aClass11Array1[local9].aString19.equalsIgnoreCase("water")) {
					local7 = (byte) (local9 + 1);
					break;
				}
			}
			for (@Pc(31) int local31 = arg1; local31 < arg1 + 64; local31++) {
				for (@Pc(35) int local35 = arg0; local35 < arg0 + 64; local35++) {
					if (local35 >= 0 && local35 < this.anInt78 && local31 >= 0 && local31 < this.anInt79) {
						this.aByteArrayArrayArray3[0][local35][local31] = local7;
						for (@Pc(60) int local60 = 0; local60 < 4; local60++) {
							this.anIntArrayArrayArray1[local60][local35][local31] = 0;
							this.aByteArrayArrayArray1[local60][local35][local31] = 0;
						}
					}
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("3302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 64 + ", " + 64 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[BI)V")
	public void method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg3, 0);
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
					for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
						@Pc(27) int local27 = local17 + arg1;
						@Pc(31) int local31 = local21 + arg2;
						@Pc(53) int local53;
						if (local27 >= 0 && local27 < 104 && local31 >= 0 && local31 < 104) {
							this.aByteArrayArrayArray1[local13][local27][local31] = 0;
							while (true) {
								local53 = local11.method383();
								if (local53 == 0) {
									if (local13 == 0) {
										this.anIntArrayArrayArray1[0][local27][local31] = -method42(local27 + arg4 + 932731, local31 + 556238 + arg0) * 8;
									} else {
										this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - 240;
									}
									break;
								}
								if (local53 == 1) {
									@Pc(109) int local109 = local11.method383();
									if (local109 == 1) {
										local109 = 0;
									}
									if (local13 == 0) {
										this.anIntArrayArrayArray1[0][local27][local31] = -local109 * 8;
									} else {
										this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - local109 * 8;
									}
									break;
								}
								if (local53 <= 49) {
									this.aByteArrayArrayArray3[local13][local27][local31] = local11.method384();
									this.aByteArrayArrayArray4[local13][local27][local31] = (byte) ((local53 - 2) / 4);
									this.aByteArrayArrayArray5[local13][local27][local31] = (byte) (local53 - 2 & 0x3);
								} else if (local53 <= 81) {
									this.aByteArrayArrayArray1[local13][local27][local31] = (byte) (local53 - 49);
								} else {
									this.aByteArrayArrayArray2[local13][local27][local31] = (byte) (local53 - 81);
								}
							}
						} else {
							while (true) {
								local53 = local11.method383();
								if (local53 == 0) {
									break;
								}
								if (local53 == 1) {
									local11.method383();
									break;
								}
								if (local53 <= 49) {
									local11.method383();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("17144, " + arg0 + ", " + -16121 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;Lclient!ob;[B[Lclient!ec;BII)V")
	public void method38(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class9[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(17) Class1_Sub3_Sub3 local17 = new Class1_Sub3_Sub3(arg2, 0);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method397();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method397();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method383();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg5;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class9 local101 = null;
						if (local86 >= 0) {
							local101 = arg3[local86];
						}
						this.method39(local19, local74, local66, local55, local70, arg1, arg0, local62, local101);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("26256, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + arg4 + ", " + arg5 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBILclient!ob;Lclient!r;ILclient!ec;)V")
	private void method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) Class33 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class9 arg8) {
		try {
			if (aBoolean28) {
				if ((this.aByteArrayArrayArray1[arg3][arg4][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method41(arg1, arg3, arg4) != anInt77) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg3][arg4][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg1];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg1 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg3][arg4][arg1 + 1];
			@Pc(88) int local88 = local33 + local44 + local57 + local68 >> 2;
			@Pc(91) Class2 local91 = Class2.method23(arg0);
			@Pc(103) int local103 = arg4 + (arg1 << 7) + (arg0 << 14) + 1073741824;
			if (!local91.aBoolean11) {
				local103 += Integer.MIN_VALUE;
			}
			@Pc(117) byte local117 = (byte) ((arg2 << 6) + arg7);
			@Pc(139) Class1_Sub3_Sub1 local139;
			if (arg7 != 22) {
				@Pc(216) int local216;
				if (arg7 == 10 || arg7 == 11) {
					local139 = local91.method26(10, arg2, local33, local44, local57, local68, -1);
					if (local139 != null) {
						@Pc(203) int local203 = 0;
						if (arg7 == 11) {
							local203 += 256;
						}
						@Pc(219) int local219;
						if (arg2 == 1 || arg2 == 3) {
							local216 = local91.anInt40;
							local219 = local91.anInt39;
						} else {
							local216 = local91.anInt39;
							local219 = local91.anInt40;
						}
						if (arg6.method469(local216, arg4, local139, local117, arg1, arg3, local88, local203, local103, null, local219) && local91.aBoolean17) {
							for (@Pc(247) int local247 = 0; local247 <= local216; local247++) {
								for (@Pc(251) int local251 = 0; local251 <= local219; local251++) {
									@Pc(258) int local258 = local139.anInt361 / 4;
									if (local258 > 30) {
										local258 = 30;
									}
									if (local258 > this.aByteArrayArrayArray6[arg3][arg4 + local247][arg1 + local251]) {
										this.aByteArrayArrayArray6[arg3][arg4 + local247][arg1 + local251] = (byte) local258;
									}
								}
							}
						}
					}
					if (local91.aBoolean9 && arg8 != null) {
						arg8.method250(local91.aBoolean10, arg4, local91.anInt39, arg2, local91.anInt40, arg1);
					}
					if (local91.anInt41 != -1) {
						arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 2));
					}
				} else if (arg7 >= 12) {
					local139 = local91.method26(arg7, arg2, local33, local44, local57, local68, -1);
					arg6.method469(1, arg4, local139, local117, arg1, arg3, local88, 0, local103, null, 1);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x924;
					}
					if (local91.aBoolean9 && arg8 != null) {
						arg8.method250(local91.aBoolean10, arg4, local91.anInt39, arg2, local91.anInt40, arg1);
					}
					if (local91.anInt41 != -1) {
						arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 2));
					}
				} else if (arg7 == 0) {
					local139 = local91.method26(0, arg2, local33, local44, local57, local68, -1);
					arg6.method467(0, arg1, local103, anIntArray18[arg2], arg4, arg3, local117, local88, null, local139);
					if (arg2 == 0) {
						if (local91.aBoolean17) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
						}
						if (local91.aBoolean14) {
							this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x249;
						}
					} else if (arg2 == 1) {
						if (local91.aBoolean17) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						}
						if (local91.aBoolean14) {
							this.anIntArrayArrayArray2[arg3][arg4][arg1 + 1] |= 0x492;
						}
					} else if (arg2 == 2) {
						if (local91.aBoolean17) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						}
						if (local91.aBoolean14) {
							this.anIntArrayArrayArray2[arg3][arg4 + 1][arg1] |= 0x249;
						}
					} else if (arg2 == 3) {
						if (local91.aBoolean17) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
						}
						if (local91.aBoolean14) {
							this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x492;
						}
					}
					if (local91.aBoolean9 && arg8 != null) {
						arg8.method249(local91.aBoolean10, arg2, arg1, arg4, arg7);
					}
					if (local91.anInt41 != -1) {
						arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 0));
					}
					if (local91.anInt42 != 16) {
						arg6.method476(arg3, local91.anInt42, arg4, arg1);
					}
				} else if (arg7 == 1) {
					local139 = local91.method26(1, arg2, local33, local44, local57, local68, -1);
					arg6.method467(0, arg1, local103, anIntArray19[arg2], arg4, arg3, local117, local88, null, local139);
					if (local91.aBoolean17) {
						if (arg2 == 0) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
						} else if (arg2 == 1) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						} else if (arg2 == 2) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
						} else if (arg2 == 3) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
						}
					}
					if (local91.aBoolean9 && arg8 != null) {
						arg8.method249(local91.aBoolean10, arg2, arg1, arg4, arg7);
					}
					if (local91.anInt41 != -1) {
						arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 0));
					}
				} else {
					@Pc(817) int local817;
					@Pc(839) Class1_Sub3_Sub1 local839;
					if (arg7 == 2) {
						local817 = arg2 + 1 & 0x3;
						@Pc(829) Class1_Sub3_Sub1 local829 = local91.method26(2, arg2 + 4, local33, local44, local57, local68, -1);
						local839 = local91.method26(2, local817, local33, local44, local57, local68, -1);
						arg6.method467(anIntArray18[local817], arg1, local103, anIntArray18[arg2], arg4, arg3, local117, local88, local839, local829);
						if (local91.aBoolean14) {
							if (arg2 == 0) {
								this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg1 + 1] |= 0x492;
							} else if (arg2 == 1) {
								this.anIntArrayArrayArray2[arg3][arg4][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg1] |= 0x249;
							} else if (arg2 == 2) {
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x492;
							} else if (arg2 == 3) {
								this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4][arg1] |= 0x249;
							}
						}
						if (local91.aBoolean9 && arg8 != null) {
							arg8.method249(local91.aBoolean10, arg2, arg1, arg4, arg7);
						}
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 0));
						}
						if (local91.anInt42 != 16) {
							arg6.method476(arg3, local91.anInt42, arg4, arg1);
						}
					} else if (arg7 == 3) {
						local139 = local91.method26(3, arg2, local33, local44, local57, local68, -1);
						arg6.method467(0, arg1, local103, anIntArray19[arg2], arg4, arg3, local117, local88, null, local139);
						if (local91.aBoolean17) {
							if (arg2 == 0) {
								this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
							} else if (arg2 == 1) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
							} else if (arg2 == 2) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
							} else if (arg2 == 3) {
								this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							}
						}
						if (local91.aBoolean9 && arg8 != null) {
							arg8.method249(local91.aBoolean10, arg2, arg1, arg4, arg7);
						}
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 0));
						}
					} else if (arg7 == 9) {
						local139 = local91.method26(arg7, arg2, local33, local44, local57, local68, -1);
						arg6.method469(1, arg4, local139, local117, arg1, arg3, local88, 0, local103, null, 1);
						if (local91.aBoolean9 && arg8 != null) {
							arg8.method250(local91.aBoolean10, arg4, local91.anInt39, arg2, local91.anInt40, arg1);
						}
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 2));
						}
					} else if (arg7 == 4) {
						local139 = local91.method26(4, 0, local33, local44, local57, local68, -1);
						arg6.method468(arg1, local88, local117, arg4, anIntArray18[arg2], arg3, local139, 0, local103, arg2 * 512, 0);
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 1));
						}
					} else if (arg7 == 5) {
						local817 = 16;
						local216 = arg6.method486(arg3, arg4, arg1);
						if (local216 > 0) {
							local817 = Class2.method23(local216 >> 14 & 0x7FFF).anInt42;
						}
						local839 = local91.method26(4, 0, local33, local44, local57, local68, -1);
						arg6.method468(arg1, local88, local117, arg4, anIntArray18[arg2], arg3, local839, anIntArray20[arg2] * local817, local103, arg2 * 512, anIntArray21[arg2] * local817);
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 1));
						}
					} else if (arg7 == 6) {
						local139 = local91.method26(4, 0, local33, local44, local57, local68, -1);
						arg6.method468(arg1, local88, local117, arg4, 256, arg3, local139, 0, local103, arg2, 0);
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 1));
						}
					} else if (arg7 == 7) {
						local139 = local91.method26(4, 0, local33, local44, local57, local68, -1);
						arg6.method468(arg1, local88, local117, arg4, 512, arg3, local139, 0, local103, arg2, 0);
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 1));
						}
					} else if (arg7 == 8) {
						local139 = local91.method26(4, 0, local33, local44, local57, local68, -1);
						arg6.method468(arg1, local88, local117, arg4, 768, arg3, local139, 0, local103, arg2, 0);
						if (local91.anInt41 != -1) {
							arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 1));
						}
					}
				}
			} else if (!aBoolean28 || local91.aBoolean11 || local91.aBoolean18) {
				local139 = local91.method26(22, arg2, local33, local44, local57, local68, -1);
				arg6.method465(local88, local117, local103, arg4, arg3, local139, arg1);
				if (local91.aBoolean9 && local91.aBoolean11 && arg8 != null) {
					arg8.method251(arg1, arg4, anInt75);
				}
				if (local91.anInt41 != -1) {
					arg5.method445(new Class1_Sub6(true, arg0, (byte) 9, arg4, arg1, Class19.aClass19Array1[local91.anInt41], arg3, 3));
				}
			}
		} catch (@Pc(1495) RuntimeException local1495) {
			signlink.reporterror("59740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -12 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;I[Lclient!ec;)V")
	public void method40(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9[] arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg2[local27].method251(local11, local7, anInt75);
							}
						}
					}
				}
			}
			@Pc(95) int local95;
			@Pc(101) int local101;
			@Pc(103) int local103;
			@Pc(107) int local107;
			@Pc(131) int local131;
			@Pc(153) int local153;
			@Pc(166) int local166;
			@Pc(172) int local172;
			@Pc(176) int local176;
			@Pc(182) int local182;
			@Pc(198) int local198;
			@Pc(246) int local246;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(70) byte[][] local70 = this.aByteArrayArrayArray6[local7];
				local95 = (int) Math.sqrt((double) 5100);
				local101 = local95 * 768 >> 8;
				for (local103 = 1; local103 < this.anInt79 - 1; local103++) {
					for (local107 = 1; local107 < this.anInt78 - 1; local107++) {
						local131 = this.anIntArrayArrayArray1[local7][local107 + 1][local103] - this.anIntArrayArrayArray1[local7][local107 - 1][local103];
						local153 = this.anIntArrayArrayArray1[local7][local107][local103 + 1] - this.anIntArrayArrayArray1[local7][local107][local103 - 1];
						local166 = (int) Math.sqrt((double) (local131 * local131 + local153 * local153 + 65536));
						local172 = (local131 << 8) / local166;
						local176 = 65536 / local166;
						local182 = (local153 << 8) / local166;
						local198 = (local172 * -50 + local176 * -10 + local182 * -50) / local101 + 96;
						local246 = (local70[local107 - 1][local103] >> 2) + (local70[local107 + 1][local103] >> 3) + (local70[local107][local103 - 1] >> 2) + (local70[local107][local103 + 1] >> 3) + (local70[local107][local103] >> 1);
						this.anIntArrayArray1[local107][local103] = local198 - local246;
					}
				}
				for (local107 = 0; local107 < this.anInt79; local107++) {
					this.anIntArray13[local107] = 0;
					this.anIntArray14[local107] = 0;
					this.anIntArray15[local107] = 0;
					this.anIntArray16[local107] = 0;
					this.anIntArray17[local107] = 0;
				}
				for (local131 = -5; local131 < this.anInt78 + 5; local131++) {
					for (local153 = 0; local153 < this.anInt79; local153++) {
						local166 = local131 + 5;
						@Pc(381) int local381;
						if (local166 >= 0 && local166 < this.anInt78) {
							local172 = this.aByteArrayArrayArray2[local7][local166][local153] & 0xFF;
							if (local172 > 0) {
								@Pc(340) Class11 local340 = Class11.aClass11Array1[local172 - 1];
								this.anIntArray13[local153] += local340.anInt401;
								this.anIntArray14[local153] += local340.anInt399;
								this.anIntArray15[local153] += local340.anInt400;
								this.anIntArray16[local153] += local340.anInt402;
								local381 = this.anIntArray17[local153]++;
							}
						}
						local172 = local131 - 5;
						if (local172 >= 0 && local172 < this.anInt78) {
							local176 = this.aByteArrayArrayArray2[local7][local172][local153] & 0xFF;
							if (local176 > 0) {
								@Pc(413) Class11 local413 = Class11.aClass11Array1[local176 - 1];
								this.anIntArray13[local153] -= local413.anInt401;
								this.anIntArray14[local153] -= local413.anInt399;
								this.anIntArray15[local153] -= local413.anInt400;
								this.anIntArray16[local153] -= local413.anInt402;
								local381 = this.anIntArray17[local153]--;
							}
						}
					}
					if (local131 >= 1 && local131 < this.anInt78 - 1) {
						local166 = 0;
						local172 = 0;
						local176 = 0;
						local182 = 0;
						local198 = 0;
						for (local246 = -5; local246 < this.anInt79 + 5; local246++) {
							@Pc(489) int local489 = local246 + 5;
							if (local489 >= 0 && local489 < this.anInt79) {
								local166 += this.anIntArray13[local489];
								local172 += this.anIntArray14[local489];
								local176 += this.anIntArray15[local489];
								local182 += this.anIntArray16[local489];
								local198 += this.anIntArray17[local489];
							}
							@Pc(534) int local534 = local246 - 5;
							if (local534 >= 0 && local534 < this.anInt79) {
								local166 -= this.anIntArray13[local534];
								local172 -= this.anIntArray14[local534];
								local176 -= this.anIntArray15[local534];
								local182 -= this.anIntArray16[local534];
								local198 -= this.anIntArray17[local534];
							}
							if (local246 >= 1 && local246 < this.anInt79 - 1 && (!aBoolean28 || (this.aByteArrayArrayArray1[local7][local131][local246] & 0x10) == 0 && this.method41(local246, local7, local131) == anInt77)) {
								@Pc(617) int local617 = this.aByteArrayArrayArray2[local7][local131][local246] & 0xFF;
								@Pc(628) int local628 = this.aByteArrayArrayArray3[local7][local131][local246] & 0xFF;
								if (local617 > 0 || local628 > 0) {
									@Pc(641) int local641 = this.anIntArrayArrayArray1[local7][local131][local246];
									@Pc(652) int local652 = this.anIntArrayArrayArray1[local7][local131 + 1][local246];
									@Pc(665) int local665 = this.anIntArrayArrayArray1[local7][local131 + 1][local246 + 1];
									@Pc(676) int local676 = this.anIntArrayArrayArray1[local7][local131][local246 + 1];
									@Pc(683) int local683 = this.anIntArrayArray1[local131][local246];
									@Pc(692) int local692 = this.anIntArrayArray1[local131 + 1][local246];
									@Pc(703) int local703 = this.anIntArrayArray1[local131 + 1][local246 + 1];
									@Pc(712) int local712 = this.anIntArrayArray1[local131][local246 + 1];
									@Pc(714) int local714 = -1;
									if (local617 > 0) {
										local714 = this.method49(local166 * 256 / local182, local172 / local198, local176 / local198);
									}
									if (local7 > 0) {
										@Pc(734) boolean local734 = true;
										if (local617 == 0 && this.aByteArrayArrayArray4[local7][local131][local246] != 0) {
											local734 = false;
										}
										if (local628 > 0 && !Class11.aClass11Array1[local628 - 1].aBoolean97) {
											local734 = false;
										}
										if (local734 && local641 == local652 && local641 == local665 && local641 == local676) {
											this.anIntArrayArrayArray2[local7][local131][local246] |= 0x924;
										}
									}
									@Pc(783) int local783 = 0;
									if (local714 != -1) {
										local783 = Class1_Sub3_Sub2_Sub1.anIntArray142[method47(local714, 96)];
									}
									if (local628 == 0) {
										arg0.method464(local7, local131, local246, 0, 0, -1, local641, local652, local665, local676, method47(local714, local683), method47(local714, local692), method47(local714, local703), method47(local714, local712), 0, 0, 0, 0, local783, 0);
									} else {
										@Pc(837) int local837 = this.aByteArrayArrayArray4[local7][local131][local246] + 1;
										@Pc(846) byte local846 = this.aByteArrayArrayArray5[local7][local131][local246];
										@Pc(852) Class11 local852 = Class11.aClass11Array1[local628 - 1];
										@Pc(855) int local855 = local852.anInt397;
										@Pc(863) int local863;
										@Pc(861) int local861;
										if (local855 >= 0) {
											local861 = Class1_Sub3_Sub2_Sub1.method291(local855);
											local863 = -1;
										} else if (local852.anInt396 == 16711935) {
											local861 = 0;
											local863 = -2;
											local855 = -1;
										} else {
											local863 = this.method49(local852.anInt398, local852.anInt399, local852.anInt400);
											local861 = Class1_Sub3_Sub2_Sub1.anIntArray142[this.method48(local863, 96)];
										}
										arg0.method464(local7, local131, local246, local837, local846, local855, local641, local652, local665, local676, method47(local714, local683), method47(local714, local692), method47(local714, local703), method47(local714, local712), this.method48(local863, local683), this.method48(local863, local692), this.method48(local863, local703), this.method48(local863, local712), local783, local861);
									}
								}
							}
						}
					}
				}
				for (local153 = 1; local153 < this.anInt79 - 1; local153++) {
					for (local166 = 1; local166 < this.anInt78 - 1; local166++) {
						arg0.method463(local7, local166, local153, this.method41(local153, local7, local166));
					}
				}
			}
			if (!aBoolean29) {
				arg0.method491();
			}
			for (local11 = 0; local11 < this.anInt78; local11++) {
				for (local27 = 0; local27 < this.anInt79; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method461(local11, this.anInt74, local27);
					}
				}
			}
			if (!aBoolean29) {
				local27 = 1;
				@Pc(1039) int local1039 = 2;
				@Pc(1041) int local1041 = 4;
				for (@Pc(1043) int local1043 = 0; local1043 < 4; local1043++) {
					if (local1043 > 0) {
						local27 <<= 0x3;
						local1039 <<= 0x3;
						local1041 <<= 0x3;
					}
					for (@Pc(1061) int local1061 = 0; local1061 <= local1043; local1061++) {
						for (local95 = 0; local95 <= this.anInt79; local95++) {
							for (local101 = 0; local101 <= this.anInt78; local101++) {
								if ((this.anIntArrayArrayArray2[local1061][local101][local95] & local27) != 0) {
									local103 = local95;
									local107 = local95;
									local131 = local1061;
									local153 = local1061;
									while (local103 > 0 && (this.anIntArrayArrayArray2[local1061][local101][local103 - 1] & local27) != 0) {
										local103--;
									}
									while (local107 < this.anInt79 && (this.anIntArrayArrayArray2[local1061][local101][local107 + 1] & local27) != 0) {
										local107++;
									}
									label319: while (local131 > 0) {
										for (local166 = local103; local166 <= local107; local166++) {
											if ((this.anIntArrayArrayArray2[local131 - 1][local101][local166] & local27) == 0) {
												break label319;
											}
										}
										local131--;
									}
									label308: while (local153 < local1043) {
										for (local166 = local103; local166 <= local107; local166++) {
											if ((this.anIntArrayArrayArray2[local153 + 1][local101][local166] & local27) == 0) {
												break label308;
											}
										}
										local153++;
									}
									local166 = (local153 + 1 - local131) * (local107 + 1 - local103);
									if (local166 >= 8) {
										local176 = this.anIntArrayArrayArray1[local153][local101][local103] - 240;
										local182 = this.anIntArrayArrayArray1[local131][local101][local103];
										Class33.method462(local182, local101 * 128, local103 * 128, local176, local1043, local107 * 128 + 128, 1, local101 * 128);
										for (local198 = local131; local198 <= local153; local198++) {
											for (local246 = local103; local246 <= local107; local246++) {
												this.anIntArrayArrayArray2[local198][local101][local246] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1061][local101][local95] & local1039) != 0) {
									local103 = local101;
									local107 = local101;
									local131 = local1061;
									local153 = local1061;
									while (local103 > 0 && (this.anIntArrayArrayArray2[local1061][local103 - 1][local95] & local1039) != 0) {
										local103--;
									}
									while (local107 < this.anInt78 && (this.anIntArrayArrayArray2[local1061][local107 + 1][local95] & local1039) != 0) {
										local107++;
									}
									label372: while (local131 > 0) {
										for (local166 = local103; local166 <= local107; local166++) {
											if ((this.anIntArrayArrayArray2[local131 - 1][local166][local95] & local1039) == 0) {
												break label372;
											}
										}
										local131--;
									}
									label361: while (local153 < local1043) {
										for (local166 = local103; local166 <= local107; local166++) {
											if ((this.anIntArrayArrayArray2[local153 + 1][local166][local95] & local1039) == 0) {
												break label361;
											}
										}
										local153++;
									}
									local166 = (local153 + 1 - local131) * (local107 + 1 - local103);
									if (local166 >= 8) {
										local176 = this.anIntArrayArrayArray1[local153][local103][local95] - 240;
										local182 = this.anIntArrayArrayArray1[local131][local103][local95];
										Class33.method462(local182, local107 * 128 + 128, local95 * 128, local176, local1043, local95 * 128, 2, local103 * 128);
										for (local198 = local131; local198 <= local153; local198++) {
											for (local246 = local103; local246 <= local107; local246++) {
												this.anIntArrayArrayArray2[local198][local246][local95] &= ~local1039;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1061][local101][local95] & local1041) != 0) {
									local103 = local101;
									local107 = local101;
									local131 = local95;
									local153 = local95;
									while (local131 > 0 && (this.anIntArrayArrayArray2[local1061][local101][local131 - 1] & local1041) != 0) {
										local131--;
									}
									while (local153 < this.anInt79 && (this.anIntArrayArrayArray2[local1061][local101][local153 + 1] & local1041) != 0) {
										local153++;
									}
									label425: while (local103 > 0) {
										for (local166 = local131; local166 <= local153; local166++) {
											if ((this.anIntArrayArrayArray2[local1061][local103 - 1][local166] & local1041) == 0) {
												break label425;
											}
										}
										local103--;
									}
									label414: while (local107 < this.anInt78) {
										for (local166 = local131; local166 <= local153; local166++) {
											if ((this.anIntArrayArrayArray2[local1061][local107 + 1][local166] & local1041) == 0) {
												break label414;
											}
										}
										local107++;
									}
									if ((local107 + 1 - local103) * (local153 + 1 - local131) >= 4) {
										local166 = this.anIntArrayArrayArray1[local1061][local103][local131];
										Class33.method462(local166, local107 * 128 + 128, local131 * 128, local166, local1043, local153 * 128 + 128, 4, local103 * 128);
										for (local172 = local103; local172 <= local107; local172++) {
											for (local176 = local131; local176 <= local153; local176++) {
												this.anIntArrayArrayArray2[local1061][local172][local176] &= ~local1041;
											}
										}
									}
								}
							}
						}
					}
				}
				if (arg1 != 27394) {
					this.aBoolean27 = !this.aBoolean27;
				}
			}
		} catch (@Pc(1687) RuntimeException local1687) {
			signlink.reporterror("35676, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1687.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("16534, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)I")
	private int method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
}
