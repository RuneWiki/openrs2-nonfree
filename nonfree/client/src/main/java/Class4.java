import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt85;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	private static boolean aBoolean23;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt88 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt89 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt83 = 5;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIILclient!ec;Lclient!r;ILclient!ob;[[[I)V")
	public static void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6, @OriginalArg(8) Class33 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class28 arg9, @OriginalArg(11) int[][][] arg10) {
		try {
			@Pc(7) int local7 = arg10[arg4][arg2][arg5];
			@Pc(17) int local17 = arg10[arg4][arg2 + 1][arg5];
			@Pc(29) int local29 = arg10[arg4][arg2 + 1][arg5 + 1];
			@Pc(39) int local39 = arg10[arg4][arg2][arg5 + 1];
			@Pc(49) int local49 = local7 + local17 + local29 + local39 >> 2;
			@Pc(55) Class2 local55 = Class2.method23(arg8);
			@Pc(67) int local67 = arg2 + (arg5 << 7) + (arg8 << 14) + 1073741824;
			if (!local55.aBoolean8) {
				local67 += Integer.MIN_VALUE;
			}
			@Pc(81) byte local81 = (byte) ((arg3 << 6) + arg1);
			@Pc(94) Class1_Sub3_Sub1 local94;
			if (arg1 == 22) {
				local94 = local55.method26(22, arg3, local7, local17, local29, local39, -1);
				arg7.method473(local94, local67, local49, arg0, local81, arg2, arg5);
				if (local55.aBoolean6 && local55.aBoolean8) {
					arg6.method252(arg5, arg2);
				}
				if (local55.anInt47 != -1) {
					arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 3, arg8, true, arg0, 1));
				}
			} else {
				@Pc(169) int local169;
				if (arg1 == 10 || arg1 == 11) {
					local94 = local55.method26(10, arg3, local7, local17, local29, local39, -1);
					if (local94 != null) {
						@Pc(156) int local156 = 0;
						if (arg1 == 11) {
							local156 += 256;
						}
						@Pc(172) int local172;
						if (arg3 == 1 || arg3 == 3) {
							local169 = local55.anInt46;
							local172 = local55.anInt45;
						} else {
							local169 = local55.anInt45;
							local172 = local55.anInt46;
						}
						arg7.method477(arg2, local169, local49, local94, local156, local81, null, arg5, arg0, local172, local67);
					}
					if (local55.aBoolean6) {
						arg6.method251(local55.anInt45, arg2, arg5, local55.aBoolean7, local55.anInt46, arg3);
					}
					if (local55.anInt47 != -1) {
						arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 2, arg8, true, arg0, 1));
					}
				} else if (arg1 >= 12) {
					local94 = local55.method26(arg1, arg3, local7, local17, local29, local39, -1);
					arg7.method477(arg2, 1, local49, local94, 0, local81, null, arg5, arg0, 1, local67);
					if (local55.aBoolean6) {
						arg6.method251(local55.anInt45, arg2, arg5, local55.aBoolean7, local55.anInt46, arg3);
					}
					if (local55.anInt47 != -1) {
						arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 2, arg8, true, arg0, 1));
					}
				} else if (arg1 == 0) {
					local94 = local55.method26(0, arg3, local7, local17, local29, local39, -1);
					arg7.method475(arg2, arg5, local81, anIntArray18[arg3], local49, null, local67, arg0, 0, local94);
					if (local55.aBoolean6) {
						arg6.method250(arg5, arg2, arg1, arg3, local55.aBoolean7);
					}
					if (local55.anInt47 != -1) {
						arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 0, arg8, true, arg0, 1));
					}
				} else if (arg1 == 1) {
					local94 = local55.method26(1, arg3, local7, local17, local29, local39, -1);
					arg7.method475(arg2, arg5, local81, anIntArray19[arg3], local49, null, local67, arg0, 0, local94);
					if (local55.aBoolean6) {
						arg6.method250(arg5, arg2, arg1, arg3, local55.aBoolean7);
					}
					if (local55.anInt47 != -1) {
						arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 0, arg8, true, arg0, 1));
					}
				} else {
					@Pc(425) int local425;
					@Pc(447) Class1_Sub3_Sub1 local447;
					if (arg1 == 2) {
						local425 = arg3 + 1 & 0x3;
						@Pc(437) Class1_Sub3_Sub1 local437 = local55.method26(2, arg3 + 4, local7, local17, local29, local39, -1);
						local447 = local55.method26(2, local425, local7, local17, local29, local39, -1);
						arg7.method475(arg2, arg5, local81, anIntArray18[arg3], local49, local447, local67, arg0, anIntArray18[local425], local437);
						if (local55.aBoolean6) {
							arg6.method250(arg5, arg2, arg1, arg3, local55.aBoolean7);
						}
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 0, arg8, true, arg0, 1));
						}
					} else if (arg1 == 3) {
						local94 = local55.method26(3, arg3, local7, local17, local29, local39, -1);
						arg7.method475(arg2, arg5, local81, anIntArray19[arg3], local49, null, local67, arg0, 0, local94);
						if (local55.aBoolean6) {
							arg6.method250(arg5, arg2, arg1, arg3, local55.aBoolean7);
						}
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 0, arg8, true, arg0, 1));
						}
					} else if (arg1 == 9) {
						local94 = local55.method26(arg1, arg3, local7, local17, local29, local39, -1);
						arg7.method477(arg2, 1, local49, local94, 0, local81, null, arg5, arg0, 1, local67);
						if (local55.aBoolean6) {
							arg6.method251(local55.anInt45, arg2, arg5, local55.aBoolean7, local55.anInt46, arg3);
						}
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 2, arg8, true, arg0, 1));
						}
					} else if (arg1 == 4) {
						local94 = local55.method26(4, 0, local7, local17, local29, local39, -1);
						arg7.method476(local49, anIntArray18[arg3], arg2, local67, arg3 * 512, arg5, local81, arg0, 0, 0, local94);
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 1, arg8, true, arg0, 1));
						}
					} else if (arg1 == 5) {
						local425 = 16;
						local169 = arg7.method494(arg0, arg2, arg5);
						if (local169 > 0) {
							local425 = Class2.method23(local169 >> 14 & 0x7FFF).anInt48;
						}
						local447 = local55.method26(4, 0, local7, local17, local29, local39, -1);
						arg7.method476(local49, anIntArray18[arg3], arg2, local67, arg3 * 512, arg5, local81, arg0, anIntArray20[arg3] * local425, anIntArray21[arg3] * local425, local447);
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 1, arg8, true, arg0, 1));
						}
					} else if (arg1 == 6) {
						local94 = local55.method26(4, 0, local7, local17, local29, local39, -1);
						arg7.method476(local49, 256, arg2, local67, arg3, arg5, local81, arg0, 0, 0, local94);
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 1, arg8, true, arg0, 1));
						}
					} else if (arg1 == 7) {
						local94 = local55.method26(4, 0, local7, local17, local29, local39, -1);
						arg7.method476(local49, 512, arg2, local67, arg3, arg5, local81, arg0, 0, 0, local94);
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 1, arg8, true, arg0, 1));
						}
					} else if (arg1 == 8) {
						local94 = local55.method26(4, 0, local7, local17, local29, local39, -1);
						arg7.method476(local49, 768, arg2, local67, arg3, arg5, local81, arg0, 0, 0, local94);
						if (local55.anInt47 != -1) {
							arg9.method453(new Class1_Sub6(arg5, arg2, Class19.aClass19Array1[local55.anInt47], 1, arg8, true, arg0, 1));
						}
					}
				}
			}
		} catch (@Pc(897) RuntimeException local897) {
			signlink.reporterror("96539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local897.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZI[[[BI[[[I)V")
	public Class4(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			this.anInt86 = arg1;
			this.anInt87 = arg3;
			this.anIntArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt86][this.anInt87];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt86][this.anInt87];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt86][this.anInt87];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt86][this.anInt87];
			this.anIntArrayArrayArray2 = new int[4][this.anInt86 + 1][this.anInt87 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt86 + 1][this.anInt87 + 1];
			this.anIntArrayArray1 = new int[this.anInt86 + 1][this.anInt87 + 1];
			this.anIntArray13 = new int[this.anInt87];
			this.anIntArray14 = new int[this.anInt87];
			this.anIntArray15 = new int[this.anInt87];
			this.anIntArray16 = new int[this.anInt87];
			this.anIntArray17 = new int[this.anInt87];
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("52285, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZI)V")
	public void method36(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) byte local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < Class11.anInt398; local5++) {
				if (Class11.aClass11Array1[local5].aString19.equalsIgnoreCase("water")) {
					local3 = (byte) (local5 + 1);
					break;
				}
			}
			for (@Pc(36) int local36 = arg1; local36 < arg1 + 64; local36++) {
				for (@Pc(40) int local40 = arg0; local40 < arg0 + 64; local40++) {
					if (local40 >= 0 && local40 < this.anInt86 && local36 >= 0 && local36 < this.anInt87) {
						this.aByteArrayArrayArray3[0][local40][local36] = local3;
						for (@Pc(65) int local65 = 0; local65 < 4; local65++) {
							this.anIntArrayArrayArray1[local65][local40][local36] = 0;
							this.aByteArrayArrayArray1[local65][local40][local36] = 0;
						}
					}
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("73676, " + 64 + ", " + arg0 + ", " + arg1 + ", " + true + ", " + 64 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[BII)V")
	public void method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3((byte) 64, arg3);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg4;
						@Pc(27) int local27 = local17 + arg0;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method391();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -method42(local23 + arg2 + 932731, local27 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method391();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method392();
									this.aByteArrayArrayArray4[local9][local23][local27] = (byte) ((local49 - 2) / 4);
									this.aByteArrayArrayArray5[local9][local23][local27] = (byte) (local49 - 2 & 0x3);
								} else if (local49 <= 81) {
									this.aByteArrayArrayArray1[local9][local23][local27] = (byte) (local49 - 49);
								} else {
									this.aByteArrayArrayArray2[local9][local23][local27] = (byte) (local49 - 81);
								}
							}
						} else {
							while (true) {
								local49 = local7.method391();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method391();
									break;
								}
								if (local49 <= 49) {
									local7.method391();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("57548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!ob;[B[Lclient!ec;Lclient!r;II)V")
	public void method38(@OriginalArg(1) Class28 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class9[] arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(10) Class1_Sub3_Sub3 local10 = new Class1_Sub3_Sub3((byte) 64, arg1);
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = local10.method405();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local10.method405();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local10.method391();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					@Pc(63) int local63 = local44 + arg5;
					@Pc(67) int local67 = local38 + arg4;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						@Pc(79) int local79 = local48;
						if ((this.aByteArrayArrayArray1[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						@Pc(94) Class9 local94 = null;
						if (local79 >= 0) {
							local94 = arg2[local79];
						}
						this.method39(arg3, local55, local67, local94, local59, local63, arg0, local48, local12);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("63503, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;IILclient!ec;IILclient!ob;III)V")
	private void method39(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			if (aBoolean22) {
				if ((this.aByteArrayArrayArray1[arg7][arg5][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method41(arg7, arg5, arg2) != anInt85) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg7][arg5][arg2];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg7][arg5 + 1][arg2];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg7][arg5 + 1][arg2 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg7][arg5][arg2 + 1];
			@Pc(83) int local83 = local33 + local44 + local57 + local68 >> 2;
			@Pc(86) Class2 local86 = Class2.method23(arg8);
			@Pc(98) int local98 = arg5 + (arg2 << 7) + (arg8 << 14) + 1073741824;
			if (!local86.aBoolean8) {
				local98 += Integer.MIN_VALUE;
			}
			@Pc(112) byte local112 = (byte) ((arg4 << 6) + arg1);
			@Pc(134) Class1_Sub3_Sub1 local134;
			if (arg1 != 22) {
				@Pc(211) int local211;
				if (arg1 == 10 || arg1 == 11) {
					local134 = local86.method26(10, arg4, local33, local44, local57, local68, -1);
					if (local134 != null) {
						@Pc(198) int local198 = 0;
						if (arg1 == 11) {
							local198 += 256;
						}
						@Pc(214) int local214;
						if (arg4 == 1 || arg4 == 3) {
							local211 = local86.anInt46;
							local214 = local86.anInt45;
						} else {
							local211 = local86.anInt45;
							local214 = local86.anInt46;
						}
						if (arg0.method477(arg5, local211, local83, local134, local198, local112, null, arg2, arg7, local214, local98) && local86.aBoolean14) {
							for (@Pc(242) int local242 = 0; local242 <= local211; local242++) {
								for (@Pc(246) int local246 = 0; local246 <= local214; local246++) {
									@Pc(253) int local253 = local134.anInt365 / 4;
									if (local253 > 30) {
										local253 = 30;
									}
									if (local253 > this.aByteArrayArrayArray6[arg7][arg5 + local242][arg2 + local246]) {
										this.aByteArrayArrayArray6[arg7][arg5 + local242][arg2 + local246] = (byte) local253;
									}
								}
							}
						}
					}
					if (local86.aBoolean6 && arg3 != null) {
						arg3.method251(local86.anInt45, arg5, arg2, local86.aBoolean7, local86.anInt46, arg4);
					}
					if (local86.anInt47 != -1) {
						arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 2, arg8, true, arg7, 1));
					}
				} else if (arg1 >= 12) {
					local134 = local86.method26(arg1, arg4, local33, local44, local57, local68, -1);
					arg0.method477(arg5, 1, local83, local134, 0, local112, null, arg2, arg7, 1, local98);
					if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x924;
					}
					if (local86.aBoolean6 && arg3 != null) {
						arg3.method251(local86.anInt45, arg5, arg2, local86.aBoolean7, local86.anInt46, arg4);
					}
					if (local86.anInt47 != -1) {
						arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 2, arg8, true, arg7, 1));
					}
				} else if (arg1 == 0) {
					local134 = local86.method26(0, arg4, local33, local44, local57, local68, -1);
					arg0.method475(arg5, arg2, local112, anIntArray18[arg4], local83, null, local98, arg7, 0, local134);
					if (arg4 == 0) {
						if (local86.aBoolean14) {
							this.aByteArrayArrayArray6[arg7][arg5][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg5][arg2 + 1] = 50;
						}
						if (local86.aBoolean11) {
							this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x249;
						}
					} else if (arg4 == 1) {
						if (local86.aBoolean14) {
							this.aByteArrayArrayArray6[arg7][arg5][arg2 + 1] = 50;
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2 + 1] = 50;
						}
						if (local86.aBoolean11) {
							this.anIntArrayArrayArray2[arg7][arg5][arg2 + 1] |= 0x492;
						}
					} else if (arg4 == 2) {
						if (local86.aBoolean14) {
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2 + 1] = 50;
						}
						if (local86.aBoolean11) {
							this.anIntArrayArrayArray2[arg7][arg5 + 1][arg2] |= 0x249;
						}
					} else if (arg4 == 3) {
						if (local86.aBoolean14) {
							this.aByteArrayArrayArray6[arg7][arg5][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2] = 50;
						}
						if (local86.aBoolean11) {
							this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x492;
						}
					}
					if (local86.aBoolean6 && arg3 != null) {
						arg3.method250(arg2, arg5, arg1, arg4, local86.aBoolean7);
					}
					if (local86.anInt47 != -1) {
						arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 0, arg8, true, arg7, 1));
					}
					if (local86.anInt48 != 16) {
						arg0.method484(arg5, local86.anInt48, arg7, arg2);
					}
				} else if (arg1 == 1) {
					local134 = local86.method26(1, arg4, local33, local44, local57, local68, -1);
					arg0.method475(arg5, arg2, local112, anIntArray19[arg4], local83, null, local98, arg7, 0, local134);
					if (local86.aBoolean14) {
						if (arg4 == 0) {
							this.aByteArrayArrayArray6[arg7][arg5][arg2 + 1] = 50;
						} else if (arg4 == 1) {
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2 + 1] = 50;
						} else if (arg4 == 2) {
							this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2] = 50;
						} else if (arg4 == 3) {
							this.aByteArrayArrayArray6[arg7][arg5][arg2] = 50;
						}
					}
					if (local86.aBoolean6 && arg3 != null) {
						arg3.method250(arg2, arg5, arg1, arg4, local86.aBoolean7);
					}
					if (local86.anInt47 != -1) {
						arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 0, arg8, true, arg7, 1));
					}
				} else {
					@Pc(812) int local812;
					@Pc(834) Class1_Sub3_Sub1 local834;
					if (arg1 == 2) {
						local812 = arg4 + 1 & 0x3;
						@Pc(824) Class1_Sub3_Sub1 local824 = local86.method26(2, arg4 + 4, local33, local44, local57, local68, -1);
						local834 = local86.method26(2, local812, local33, local44, local57, local68, -1);
						arg0.method475(arg5, arg2, local112, anIntArray18[arg4], local83, local834, local98, arg7, anIntArray18[local812], local824);
						if (local86.aBoolean11) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg5][arg2 + 1] |= 0x492;
							} else if (arg4 == 1) {
								this.anIntArrayArrayArray2[arg7][arg5][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg5 + 1][arg2] |= 0x249;
							} else if (arg4 == 2) {
								this.anIntArrayArrayArray2[arg7][arg5 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x492;
							} else if (arg4 == 3) {
								this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg5][arg2] |= 0x249;
							}
						}
						if (local86.aBoolean6 && arg3 != null) {
							arg3.method250(arg2, arg5, arg1, arg4, local86.aBoolean7);
						}
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 0, arg8, true, arg7, 1));
						}
						if (local86.anInt48 != 16) {
							arg0.method484(arg5, local86.anInt48, arg7, arg2);
						}
					} else if (arg1 == 3) {
						local134 = local86.method26(3, arg4, local33, local44, local57, local68, -1);
						arg0.method475(arg5, arg2, local112, anIntArray19[arg4], local83, null, local98, arg7, 0, local134);
						if (local86.aBoolean14) {
							if (arg4 == 0) {
								this.aByteArrayArrayArray6[arg7][arg5][arg2 + 1] = 50;
							} else if (arg4 == 1) {
								this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2 + 1] = 50;
							} else if (arg4 == 2) {
								this.aByteArrayArrayArray6[arg7][arg5 + 1][arg2] = 50;
							} else if (arg4 == 3) {
								this.aByteArrayArrayArray6[arg7][arg5][arg2] = 50;
							}
						}
						if (local86.aBoolean6 && arg3 != null) {
							arg3.method250(arg2, arg5, arg1, arg4, local86.aBoolean7);
						}
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 0, arg8, true, arg7, 1));
						}
					} else if (arg1 == 9) {
						local134 = local86.method26(arg1, arg4, local33, local44, local57, local68, -1);
						arg0.method477(arg5, 1, local83, local134, 0, local112, null, arg2, arg7, 1, local98);
						if (local86.aBoolean6 && arg3 != null) {
							arg3.method251(local86.anInt45, arg5, arg2, local86.aBoolean7, local86.anInt46, arg4);
						}
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 2, arg8, true, arg7, 1));
						}
					} else if (arg1 == 4) {
						local134 = local86.method26(4, 0, local33, local44, local57, local68, -1);
						arg0.method476(local83, anIntArray18[arg4], arg5, local98, arg4 * 512, arg2, local112, arg7, 0, 0, local134);
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 1, arg8, true, arg7, 1));
						}
					} else if (arg1 == 5) {
						local812 = 16;
						local211 = arg0.method494(arg7, arg5, arg2);
						if (local211 > 0) {
							local812 = Class2.method23(local211 >> 14 & 0x7FFF).anInt48;
						}
						local834 = local86.method26(4, 0, local33, local44, local57, local68, -1);
						arg0.method476(local83, anIntArray18[arg4], arg5, local98, arg4 * 512, arg2, local112, arg7, anIntArray20[arg4] * local812, anIntArray21[arg4] * local812, local834);
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 1, arg8, true, arg7, 1));
						}
					} else if (arg1 == 6) {
						local134 = local86.method26(4, 0, local33, local44, local57, local68, -1);
						arg0.method476(local83, 256, arg5, local98, arg4, arg2, local112, arg7, 0, 0, local134);
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 1, arg8, true, arg7, 1));
						}
					} else if (arg1 == 7) {
						local134 = local86.method26(4, 0, local33, local44, local57, local68, -1);
						arg0.method476(local83, 512, arg5, local98, arg4, arg2, local112, arg7, 0, 0, local134);
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 1, arg8, true, arg7, 1));
						}
					} else if (arg1 == 8) {
						local134 = local86.method26(4, 0, local33, local44, local57, local68, -1);
						arg0.method476(local83, 768, arg5, local98, arg4, arg2, local112, arg7, 0, 0, local134);
						if (local86.anInt47 != -1) {
							arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 1, arg8, true, arg7, 1));
						}
					}
				}
			} else if (!aBoolean22 || local86.aBoolean8 || local86.aBoolean15) {
				local134 = local86.method26(22, arg4, local33, local44, local57, local68, -1);
				arg0.method473(local134, local98, local83, arg7, local112, arg5, arg2);
				if (local86.aBoolean6 && local86.aBoolean8 && arg3 != null) {
					arg3.method252(arg2, arg5);
				}
				if (local86.anInt47 != -1) {
					arg6.method453(new Class1_Sub6(arg2, arg5, Class19.aClass19Array1[local86.anInt47], 3, arg8, true, arg7, 1));
				}
			}
		} catch (@Pc(1490) RuntimeException local1490) {
			signlink.reporterror("85542, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 163 + ", " + arg7 + ", " + arg8 + ", " + local1490.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!ec;ILclient!r;)V")
	public void method40(@OriginalArg(0) Class9[] arg0, @OriginalArg(2) Class33 arg1) {
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
								arg0[local27].method252(local11, local7);
							}
						}
					}
				}
			}
			anInt88 += (int) (Math.random() * 5.0D) - 2;
			if (anInt88 < -8) {
				anInt88 = -8;
			}
			if (anInt88 > 8) {
				anInt88 = 8;
			}
			anInt89 += (int) (Math.random() * 5.0D) - 2;
			if (anInt89 < -16) {
				anInt89 = -16;
			}
			if (anInt89 > 16) {
				anInt89 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray6[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt87 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt86 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt87; local145++) {
					this.anIntArray13[local145] = 0;
					this.anIntArray14[local145] = 0;
					this.anIntArray15[local145] = 0;
					this.anIntArray16[local145] = 0;
					this.anIntArray17[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt86 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt87; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt86) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class11 local378 = Class11.aClass11Array1[local210 - 1];
								this.anIntArray13[local191] += local378.anInt404;
								this.anIntArray14[local191] += local378.anInt402;
								this.anIntArray15[local191] += local378.anInt403;
								this.anIntArray16[local191] += local378.anInt405;
								local419 = this.anIntArray17[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt86) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class11 local451 = Class11.aClass11Array1[local214 - 1];
								this.anIntArray13[local191] -= local451.anInt404;
								this.anIntArray14[local191] -= local451.anInt402;
								this.anIntArray15[local191] -= local451.anInt403;
								this.anIntArray16[local191] -= local451.anInt405;
								local419 = this.anIntArray17[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt86 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt87 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt87) {
								local204 += this.anIntArray13[local527];
								local210 += this.anIntArray14[local527];
								local214 += this.anIntArray15[local527];
								local220 += this.anIntArray16[local527];
								local236 += this.anIntArray17[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt87) {
								local204 -= this.anIntArray13[local572];
								local210 -= this.anIntArray14[local572];
								local214 -= this.anIntArray15[local572];
								local220 -= this.anIntArray16[local572];
								local236 -= this.anIntArray17[local572];
							}
							if (local284 >= 1 && local284 < this.anInt87 - 1 && (!aBoolean22 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method41(local7, local169, local284) == anInt85)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray1[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method49(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt88 & 0xFF;
										local770 += anInt89;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method49(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class11.aClass11Array1[local666 - 1].aBoolean93) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub3_Sub2_Sub1.anIntArray142[method47(local754, 96)];
									}
									if (local666 == 0) {
										arg1.method472(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method47(local752, local721), method47(local752, local730), method47(local752, local741), method47(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class11 local925 = Class11.aClass11Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt400;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub3_Sub2_Sub1.method293(local928, (byte) 5);
											local936 = -1;
										} else if (local925.anInt399 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method49(local925.anInt401, local925.anInt402, local925.anInt403);
											local934 = Class1_Sub3_Sub2_Sub1.anIntArray142[this.method48(local925.anInt406, 96)];
										}
										arg1.method472(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method47(local752, local721), method47(local752, local730), method47(local752, local741), method47(local752, local750), this.method48(local936, local721), this.method48(local936, local730), this.method48(local936, local741), this.method48(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt87 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt86 - 1; local204++) {
						arg1.method471(local7, local204, local191, this.method41(local7, local204, local191));
					}
				}
			}
			if (!aBoolean23) {
				arg1.method499();
			}
			for (local11 = 0; local11 < this.anInt86; local11++) {
				for (local27 = 0; local27 < this.anInt87; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method469(local11, local27);
					}
				}
			}
			if (!aBoolean23) {
				local27 = 1;
				@Pc(1118) int local1118 = 2;
				@Pc(1120) int local1120 = 4;
				for (@Pc(1122) int local1122 = 0; local1122 < 4; local1122++) {
					if (local1122 > 0) {
						local27 <<= 0x3;
						local1118 <<= 0x3;
						local1120 <<= 0x3;
					}
					for (@Pc(1140) int local1140 = 0; local1140 <= local1122; local1140++) {
						for (local133 = 0; local133 <= this.anInt87; local133++) {
							for (local139 = 0; local139 <= this.anInt86; local139++) {
								if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local27) != 0) {
									local141 = local133;
									local145 = local133;
									local169 = local1140;
									local191 = local1140;
									while (local141 > 0 && (this.anIntArrayArrayArray2[local1140][local139][local141 - 1] & local27) != 0) {
										local141--;
									}
									while (local145 < this.anInt87 && (this.anIntArrayArrayArray2[local1140][local139][local145 + 1] & local27) != 0) {
										local145++;
									}
									label332: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
												break label332;
											}
										}
										local169--;
									}
									label321: while (local191 < local1122) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
												break label321;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
										local220 = this.anIntArrayArrayArray1[local169][local139][local141];
										Class33.method470(local139 * 128, local1122, 1, local141 * 128, local214, local145 * 128 + 128, local139 * 128, local220);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local1118) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local1140;
									local191 = local1140;
									while (local141 > 0 && (this.anIntArrayArrayArray2[local1140][local141 - 1][local133] & local1118) != 0) {
										local141--;
									}
									while (local145 < this.anInt86 && (this.anIntArrayArrayArray2[local1140][local145 + 1][local133] & local1118) != 0) {
										local145++;
									}
									label385: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1118) == 0) {
												break label385;
											}
										}
										local169--;
									}
									label374: while (local191 < local1122) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1118) == 0) {
												break label374;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
										local220 = this.anIntArrayArrayArray1[local169][local141][local133];
										Class33.method470(local141 * 128, local1122, 2, local133 * 128, local214, local133 * 128, local145 * 128 + 128, local220);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1118;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local1120) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local133;
									local191 = local133;
									while (local169 > 0 && (this.anIntArrayArrayArray2[local1140][local139][local169 - 1] & local1120) != 0) {
										local169--;
									}
									while (local191 < this.anInt87 && (this.anIntArrayArrayArray2[local1140][local139][local191 + 1] & local1120) != 0) {
										local191++;
									}
									label438: while (local141 > 0) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray2[local1140][local141 - 1][local204] & local1120) == 0) {
												break label438;
											}
										}
										local141--;
									}
									label427: while (local145 < this.anInt86) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray2[local1140][local145 + 1][local204] & local1120) == 0) {
												break label427;
											}
										}
										local145++;
									}
									if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
										local204 = this.anIntArrayArrayArray1[local1140][local141][local169];
										Class33.method470(local141 * 128, local1122, 4, local169 * 128, local204, local191 * 128 + 128, local145 * 128 + 128, local204);
										for (local210 = local141; local210 <= local145; local210++) {
											for (local214 = local169; local214 <= local191; local214++) {
												this.anIntArrayArrayArray2[local1140][local210][local214] &= ~local1120;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1755) RuntimeException local1755) {
			signlink.reporterror("18433, " + arg0 + ", " + -19432 + ", " + arg1 + ", " + local1755.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)I")
	private int method41(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("74630, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
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
