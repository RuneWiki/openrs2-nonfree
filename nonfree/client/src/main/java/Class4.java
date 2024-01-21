import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt81;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	private static boolean aBoolean28;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private static int anInt79 = -710;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private static boolean aBoolean25 = true;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt80 = 15823;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt82;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;ILclient!ec;I[[[IIILclient!ob;BIII)V")
	public static void method50(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class28 arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(9) int local9 = arg4[arg9][arg3][arg5];
			@Pc(19) int local19 = arg4[arg9][arg3 + 1][arg5];
			@Pc(31) int local31 = arg4[arg9][arg3 + 1][arg5 + 1];
			@Pc(41) int local41 = arg4[arg9][arg3][arg5 + 1];
			@Pc(46) boolean local46 = false;
			@Pc(60) int local60 = local9 + local19 + local31 + local41 >> 2;
			@Pc(63) Class2 local63 = Class2.method23(arg1);
			@Pc(75) int local75 = arg3 + (arg5 << 7) + (arg1 << 14) + 1073741824;
			if (!local63.aBoolean10) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg11 << 6) + arg10);
			@Pc(102) Class1_Sub3_Sub1 local102;
			if (arg10 == 22) {
				local102 = local63.method26(22, arg11, local9, local19, local31, local41, -1);
				arg0.method454(local60, local75, arg5, local89, arg3, local102, arg6);
				if (local63.aBoolean8 && local63.aBoolean10) {
					arg2.method240(arg5, arg3);
				}
				if (local63.anInt45 != -1) {
					arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 3, (byte) -50, true));
				}
			} else {
				@Pc(177) int local177;
				if (arg10 == 10 || arg10 == 11) {
					local102 = local63.method26(10, arg11, local9, local19, local31, local41, -1);
					if (local102 != null) {
						@Pc(164) int local164 = 0;
						if (arg10 == 11) {
							local164 += 256;
						}
						@Pc(180) int local180;
						if (arg11 == 1 || arg11 == 3) {
							local177 = local63.anInt44;
							local180 = local63.anInt43;
						} else {
							local177 = local63.anInt43;
							local180 = local63.anInt44;
						}
						arg0.method458(local89, arg5, local164, local177, local60, local180, arg3, local75, local102, null, arg6);
					}
					if (local63.aBoolean8) {
						arg2.method239(arg5, local63.anInt43, local63.aBoolean9, arg3, aBoolean25, local63.anInt44, arg11);
					}
					if (local63.anInt45 != -1) {
						arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 2, (byte) -50, true));
					}
				} else if (arg10 >= 12) {
					local102 = local63.method26(arg10, arg11, local9, local19, local31, local41, -1);
					arg0.method458(local89, arg5, 0, 1, local60, 1, arg3, local75, local102, null, arg6);
					if (local63.aBoolean8) {
						arg2.method239(arg5, local63.anInt43, local63.aBoolean9, arg3, aBoolean25, local63.anInt44, arg11);
					}
					if (local63.anInt45 != -1) {
						arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 2, (byte) -50, true));
					}
				} else if (arg10 == 0) {
					local102 = local63.method26(0, arg11, local9, local19, local31, local41, -1);
					arg0.method456((byte) 6, local75, 0, null, local89, anIntArray18[arg11], arg5, local102, local60, arg6, arg3);
					if (local63.aBoolean8) {
						arg2.method238(arg11, arg5, arg3, local63.aBoolean9, arg10);
					}
					if (local63.anInt45 != -1) {
						arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 0, (byte) -50, true));
					}
				} else if (arg10 == 1) {
					local102 = local63.method26(1, arg11, local9, local19, local31, local41, -1);
					arg0.method456((byte) 6, local75, 0, null, local89, anIntArray19[arg11], arg5, local102, local60, arg6, arg3);
					if (local63.aBoolean8) {
						arg2.method238(arg11, arg5, arg3, local63.aBoolean9, arg10);
					}
					if (local63.anInt45 != -1) {
						arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 0, (byte) -50, true));
					}
				} else {
					@Pc(433) int local433;
					@Pc(455) Class1_Sub3_Sub1 local455;
					if (arg10 == 2) {
						local433 = arg11 + 1 & 0x3;
						@Pc(445) Class1_Sub3_Sub1 local445 = local63.method26(2, arg11 + 4, local9, local19, local31, local41, -1);
						local455 = local63.method26(2, local433, local9, local19, local31, local41, -1);
						arg0.method456((byte) 6, local75, anIntArray18[local433], local455, local89, anIntArray18[arg11], arg5, local445, local60, arg6, arg3);
						if (local63.aBoolean8) {
							arg2.method238(arg11, arg5, arg3, local63.aBoolean9, arg10);
						}
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 0, (byte) -50, true));
						}
					} else if (arg10 == 3) {
						local102 = local63.method26(3, arg11, local9, local19, local31, local41, -1);
						arg0.method456((byte) 6, local75, 0, null, local89, anIntArray19[arg11], arg5, local102, local60, arg6, arg3);
						if (local63.aBoolean8) {
							arg2.method238(arg11, arg5, arg3, local63.aBoolean9, arg10);
						}
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 0, (byte) -50, true));
						}
					} else if (arg10 == 9) {
						local102 = local63.method26(arg10, arg11, local9, local19, local31, local41, -1);
						arg0.method458(local89, arg5, 0, 1, local60, 1, arg3, local75, local102, null, arg6);
						if (local63.aBoolean8) {
							arg2.method239(arg5, local63.anInt43, local63.aBoolean9, arg3, aBoolean25, local63.anInt44, arg11);
						}
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 2, (byte) -50, true));
						}
					} else if (arg10 == 4) {
						local102 = local63.method26(4, 0, local9, local19, local31, local41, -1);
						arg0.method457(0, local89, anIntArray18[arg11], arg11 * 512, local102, local60, arg5, arg3, 0, arg6, local75);
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg10 == 5) {
						local433 = 16;
						local177 = arg0.method474(arg6, arg3, arg5);
						if (local177 > 0) {
							local433 = Class2.method23(local177 >> 14 & 0x7FFF).anInt46;
						}
						local455 = local63.method26(4, 0, local9, local19, local31, local41, -1);
						arg0.method457(anIntArray20[arg11] * local433, local89, anIntArray18[arg11], arg11 * 512, local455, local60, arg5, arg3, anIntArray21[arg11] * local433, arg6, local75);
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg10 == 6) {
						local102 = local63.method26(4, 0, local9, local19, local31, local41, -1);
						arg0.method457(0, local89, 256, arg11, local102, local60, arg5, arg3, 0, arg6, local75);
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg10 == 7) {
						local102 = local63.method26(4, 0, local9, local19, local31, local41, -1);
						arg0.method457(0, local89, 512, arg11, local102, local60, arg5, arg3, 0, arg6, local75);
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg10 == 8) {
						local102 = local63.method26(4, 0, local9, local19, local31, local41, -1);
						arg0.method457(0, local89, 768, arg11, local102, local60, arg5, arg3, 0, arg6, local75);
						if (local63.anInt45 != -1) {
							arg7.method434(new Class1_Sub6(arg1, arg5, arg6, Class19.aClass19Array1[local63.anInt45], arg3, 1, (byte) -50, true));
						}
					}
				}
			}
		} catch (@Pc(905) RuntimeException local905) {
			signlink.reporterror("21891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local905.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[B[[[III)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt82 = arg0;
			this.anInt83 = arg3;
			this.anIntArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt82][this.anInt83];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt82][this.anInt83];
			this.anIntArrayArrayArray2 = new int[4][this.anInt82 + 1][this.anInt83 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt82 + 1][this.anInt83 + 1];
			this.anIntArrayArray1 = new int[this.anInt82 + 1][this.anInt83 + 1];
			this.anIntArray13 = new int[this.anInt83];
			this.anIntArray14 = new int[this.anInt83];
			this.anIntArray15 = new int[this.anInt83];
			this.anIntArray16 = new int[this.anInt83];
			this.anIntArray17 = new int[this.anInt83];
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("17193, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method36(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) byte local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < Class11.anInt381; local5++) {
				if (Class11.aClass11Array1[local5].aString18.equalsIgnoreCase("water")) {
					local3 = (byte) (local5 + 1);
					break;
				}
			}
			for (@Pc(27) int local27 = arg0; local27 < arg0 + 64; local27++) {
				for (@Pc(31) int local31 = arg1; local31 < arg1 + 64; local31++) {
					if (local31 >= 0 && local31 < this.anInt82 && local27 >= 0 && local27 < this.anInt83) {
						this.aByteArrayArrayArray3[0][local31][local27] = local3;
						for (@Pc(56) int local56 = 0; local56 < 4; local56++) {
							this.anIntArrayArrayArray1[local56][local31][local27] = 0;
							this.aByteArrayArrayArray1[local56][local31][local27] = 0;
						}
					}
				}
			}
			@Pc(96) boolean local96 = false;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("87787, " + arg0 + ", " + 64 + ", " + arg1 + ", " + arg2 + ", " + 64 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B[BIIII)V")
	public void method37(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) Class1_Sub3_Sub3 local16 = new Class1_Sub3_Sub3(arg1, this.aBoolean24);
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (@Pc(22) int local22 = 0; local22 < 64; local22++) {
					for (@Pc(26) int local26 = 0; local26 < 64; local26++) {
						@Pc(32) int local32 = local22 + arg5;
						@Pc(36) int local36 = local26 + arg2;
						@Pc(58) int local58;
						if (local32 >= 0 && local32 < 104 && local36 >= 0 && local36 < 104) {
							this.aByteArrayArrayArray1[local18][local32][local36] = 0;
							while (true) {
								local58 = local16.method372();
								if (local58 == 0) {
									if (local18 == 0) {
										this.anIntArrayArrayArray1[0][local32][local36] = -method42(local32 + arg4 + 932731, local36 + 556238 + arg3) * 8;
									} else {
										this.anIntArrayArrayArray1[local18][local32][local36] = this.anIntArrayArrayArray1[local18 - 1][local32][local36] - 240;
									}
									break;
								}
								if (local58 == 1) {
									@Pc(114) int local114 = local16.method372();
									if (local114 == 1) {
										local114 = 0;
									}
									if (local18 == 0) {
										this.anIntArrayArrayArray1[0][local32][local36] = -local114 * 8;
									} else {
										this.anIntArrayArrayArray1[local18][local32][local36] = this.anIntArrayArrayArray1[local18 - 1][local32][local36] - local114 * 8;
									}
									break;
								}
								if (local58 <= 49) {
									this.aByteArrayArrayArray3[local18][local32][local36] = local16.method373();
									this.aByteArrayArrayArray4[local18][local32][local36] = (byte) ((local58 - 2) / 4);
									this.aByteArrayArrayArray5[local18][local32][local36] = (byte) (local58 - 2 & 0x3);
								} else if (local58 <= 81) {
									this.aByteArrayArrayArray1[local18][local32][local36] = (byte) (local58 - 49);
								} else {
									this.aByteArrayArrayArray2[local18][local32][local36] = (byte) (local58 - 81);
								}
							}
						} else {
							while (true) {
								local58 = local16.method372();
								if (local58 == 0) {
									break;
								}
								if (local58 == 1) {
									local16.method372();
									break;
								}
								if (local58 <= 49) {
									local16.method372();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("18472, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB[Lclient!ec;[BLclient!ob;Lclient!r;I)V")
	public void method38(@OriginalArg(0) int arg0, @OriginalArg(2) Class9[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class28 arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(19) Class1_Sub3_Sub3 local19 = new Class1_Sub3_Sub3(arg2, this.aBoolean24);
			@Pc(21) int local21 = -1;
			while (true) {
				@Pc(24) int local24 = local19.method386();
				if (local24 == 0) {
					return;
				}
				local21 += local24;
				@Pc(32) int local32 = 0;
				while (true) {
					@Pc(35) int local35 = local19.method386();
					if (local35 == 0) {
						break;
					}
					local32 += local35 - 1;
					@Pc(47) int local47 = local32 & 0x3F;
					@Pc(53) int local53 = local32 >> 6 & 0x3F;
					@Pc(57) int local57 = local32 >> 12;
					@Pc(60) int local60 = local19.method372();
					@Pc(64) int local64 = local60 >> 2;
					@Pc(68) int local68 = local60 & 0x3;
					@Pc(72) int local72 = local53 + arg0;
					@Pc(76) int local76 = local47 + arg5;
					if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
						@Pc(88) int local88 = local57;
						if ((this.aByteArrayArrayArray1[1][local72][local76] & 0x2) == 2) {
							local88 = local57 - 1;
						}
						@Pc(103) Class9 local103 = null;
						if (local88 >= 0) {
							local103 = arg1[local88];
						}
						this.method39(local64, local21, arg3, local72, local76, arg4, local68, local57, local103);
					}
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("47168, " + arg0 + ", " + 50 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ob;IILclient!r;IIILclient!ec;)V")
	private void method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class9 arg8) {
		try {
			if (aBoolean27) {
				if ((this.aByteArrayArrayArray1[arg7][arg3][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method41(928, arg7, arg3, arg4) != anInt81) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg7][arg3][arg4];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg7][arg3 + 1][arg4];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg7][arg3 + 1][arg4 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg7][arg3][arg4 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class2 local81 = Class2.method23(arg1);
			@Pc(93) int local93 = arg3 + (arg4 << 7) + (arg1 << 14) + 1073741824;
			if (!local81.aBoolean10) {
				local93 += Integer.MIN_VALUE;
			}
			@Pc(118) byte local118 = (byte) ((arg6 << 6) + arg0);
			@Pc(140) Class1_Sub3_Sub1 local140;
			if (arg0 != 22) {
				@Pc(217) int local217;
				if (arg0 == 10 || arg0 == 11) {
					local140 = local81.method26(10, arg6, local33, local44, local57, local68, -1);
					if (local140 != null) {
						@Pc(204) int local204 = 0;
						if (arg0 == 11) {
							local204 += 256;
						}
						@Pc(220) int local220;
						if (arg6 == 1 || arg6 == 3) {
							local217 = local81.anInt44;
							local220 = local81.anInt43;
						} else {
							local217 = local81.anInt43;
							local220 = local81.anInt44;
						}
						if (arg5.method458(local118, arg4, local204, local217, local78, local220, arg3, local93, local140, null, arg7) && local81.aBoolean16) {
							for (@Pc(248) int local248 = 0; local248 <= local217; local248++) {
								for (@Pc(252) int local252 = 0; local252 <= local220; local252++) {
									@Pc(259) int local259 = local140.anInt347 / 4;
									if (local259 > 30) {
										local259 = 30;
									}
									if (local259 > this.aByteArrayArrayArray6[arg7][arg3 + local248][arg4 + local252]) {
										this.aByteArrayArrayArray6[arg7][arg3 + local248][arg4 + local252] = (byte) local259;
									}
								}
							}
						}
					}
					if (local81.aBoolean8 && arg8 != null) {
						arg8.method239(arg4, local81.anInt43, local81.aBoolean9, arg3, aBoolean25, local81.anInt44, arg6);
					}
					if (local81.anInt45 != -1) {
						arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 2, (byte) -50, true));
					}
				} else if (arg0 >= 12) {
					local140 = local81.method26(arg0, arg6, local33, local44, local57, local68, -1);
					arg5.method458(local118, arg4, 0, 1, local78, 1, arg3, local93, local140, null, arg7);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x924;
					}
					if (local81.aBoolean8 && arg8 != null) {
						arg8.method239(arg4, local81.anInt43, local81.aBoolean9, arg3, aBoolean25, local81.anInt44, arg6);
					}
					if (local81.anInt45 != -1) {
						arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 2, (byte) -50, true));
					}
				} else if (arg0 == 0) {
					local140 = local81.method26(0, arg6, local33, local44, local57, local68, -1);
					arg5.method456((byte) 6, local93, 0, null, local118, anIntArray18[arg6], arg4, local140, local78, arg7, arg3);
					if (arg6 == 0) {
						if (local81.aBoolean16) {
							this.aByteArrayArrayArray6[arg7][arg3][arg4] = 50;
							this.aByteArrayArrayArray6[arg7][arg3][arg4 + 1] = 50;
						}
						if (local81.aBoolean13) {
							this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local81.aBoolean16) {
							this.aByteArrayArrayArray6[arg7][arg3][arg4 + 1] = 50;
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean13) {
							this.anIntArrayArrayArray2[arg7][arg3][arg4 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local81.aBoolean16) {
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4] = 50;
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean13) {
							this.anIntArrayArrayArray2[arg7][arg3 + 1][arg4] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local81.aBoolean16) {
							this.aByteArrayArrayArray6[arg7][arg3][arg4] = 50;
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4] = 50;
						}
						if (local81.aBoolean13) {
							this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x492;
						}
					}
					if (local81.aBoolean8 && arg8 != null) {
						arg8.method238(arg6, arg4, arg3, local81.aBoolean9, arg0);
					}
					if (local81.anInt45 != -1) {
						arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 0, (byte) -50, true));
					}
				} else if (arg0 == 1) {
					local140 = local81.method26(1, arg6, local33, local44, local57, local68, -1);
					arg5.method456((byte) 6, local93, 0, null, local118, anIntArray19[arg6], arg4, local140, local78, arg7, arg3);
					if (local81.aBoolean16) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray6[arg7][arg3][arg4 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray6[arg7][arg3][arg4] = 50;
						}
					}
					if (local81.aBoolean8 && arg8 != null) {
						arg8.method238(arg6, arg4, arg3, local81.aBoolean9, arg0);
					}
					if (local81.anInt45 != -1) {
						arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 0, (byte) -50, true));
					}
				} else {
					@Pc(806) int local806;
					@Pc(828) Class1_Sub3_Sub1 local828;
					if (arg0 == 2) {
						local806 = arg6 + 1 & 0x3;
						@Pc(818) Class1_Sub3_Sub1 local818 = local81.method26(2, arg6 + 4, local33, local44, local57, local68, -1);
						local828 = local81.method26(2, local806, local33, local44, local57, local68, -1);
						arg5.method456((byte) 6, local93, anIntArray18[local806], local828, local118, anIntArray18[arg6], arg4, local818, local78, arg7, arg3);
						if (local81.aBoolean13) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg3][arg4 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray2[arg7][arg3][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg3 + 1][arg4] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray2[arg7][arg3 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg3][arg4] |= 0x249;
							}
						}
						if (local81.aBoolean8 && arg8 != null) {
							arg8.method238(arg6, arg4, arg3, local81.aBoolean9, arg0);
						}
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 0, (byte) -50, true));
						}
					} else if (arg0 == 3) {
						local140 = local81.method26(3, arg6, local33, local44, local57, local68, -1);
						arg5.method456((byte) 6, local93, 0, null, local118, anIntArray19[arg6], arg4, local140, local78, arg7, arg3);
						if (local81.aBoolean16) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray6[arg7][arg3][arg4 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray6[arg7][arg3 + 1][arg4] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray6[arg7][arg3][arg4] = 50;
							}
						}
						if (local81.aBoolean8 && arg8 != null) {
							arg8.method238(arg6, arg4, arg3, local81.aBoolean9, arg0);
						}
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 0, (byte) -50, true));
						}
					} else if (arg0 == 9) {
						local140 = local81.method26(arg0, arg6, local33, local44, local57, local68, -1);
						arg5.method458(local118, arg4, 0, 1, local78, 1, arg3, local93, local140, null, arg7);
						if (local81.aBoolean8 && arg8 != null) {
							arg8.method239(arg4, local81.anInt43, local81.aBoolean9, arg3, aBoolean25, local81.anInt44, arg6);
						}
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 2, (byte) -50, true));
						}
					} else if (arg0 == 4) {
						local140 = local81.method26(4, 0, local33, local44, local57, local68, -1);
						arg5.method457(0, local118, anIntArray18[arg6], arg6 * 512, local140, local78, arg4, arg3, 0, arg7, local93);
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg0 == 5) {
						local806 = 16;
						local217 = arg5.method474(arg7, arg3, arg4);
						if (local217 > 0) {
							local806 = Class2.method23(local217 >> 14 & 0x7FFF).anInt46;
						}
						local828 = local81.method26(4, 0, local33, local44, local57, local68, -1);
						arg5.method457(anIntArray20[arg6] * local806, local118, anIntArray18[arg6], arg6 * 512, local828, local78, arg4, arg3, anIntArray21[arg6] * local806, arg7, local93);
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg0 == 6) {
						local140 = local81.method26(4, 0, local33, local44, local57, local68, -1);
						arg5.method457(0, local118, 256, arg6, local140, local78, arg4, arg3, 0, arg7, local93);
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg0 == 7) {
						local140 = local81.method26(4, 0, local33, local44, local57, local68, -1);
						arg5.method457(0, local118, 512, arg6, local140, local78, arg4, arg3, 0, arg7, local93);
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 1, (byte) -50, true));
						}
					} else if (arg0 == 8) {
						local140 = local81.method26(4, 0, local33, local44, local57, local68, -1);
						arg5.method457(0, local118, 768, arg6, local140, local78, arg4, arg3, 0, arg7, local93);
						if (local81.anInt45 != -1) {
							arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 1, (byte) -50, true));
						}
					}
				}
			} else if (!aBoolean27 || local81.aBoolean10 || local81.aBoolean17) {
				local140 = local81.method26(22, arg6, local33, local44, local57, local68, -1);
				arg5.method454(local78, local93, arg4, local118, arg3, local140, arg7);
				if (local81.aBoolean8 && local81.aBoolean10 && arg8 != null) {
					arg8.method240(arg4, arg3);
				}
				if (local81.anInt45 != -1) {
					arg2.method434(new Class1_Sub6(arg1, arg4, arg7, Class19.aClass19Array1[local81.anInt45], arg3, 3, (byte) -50, true));
				}
			}
		} catch (@Pc(1472) RuntimeException local1472) {
			signlink.reporterror("7958, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 49826 + ", " + arg8 + ", " + local1472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;[Lclient!ec;Z)V")
	public void method40(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class9[] arg1) {
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
								arg1[local27].method240(local11, local7);
							}
						}
					}
				}
			}
			@Pc(99) int local99;
			@Pc(105) int local105;
			@Pc(107) int local107;
			@Pc(111) int local111;
			@Pc(135) int local135;
			@Pc(157) int local157;
			@Pc(170) int local170;
			@Pc(176) int local176;
			@Pc(180) int local180;
			@Pc(186) int local186;
			@Pc(202) int local202;
			@Pc(250) int local250;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(74) byte[][] local74 = this.aByteArrayArrayArray6[local7];
				local99 = (int) Math.sqrt((double) 5100);
				local105 = local99 * 768 >> 8;
				for (local107 = 1; local107 < this.anInt83 - 1; local107++) {
					for (local111 = 1; local111 < this.anInt82 - 1; local111++) {
						local135 = this.anIntArrayArrayArray1[local7][local111 + 1][local107] - this.anIntArrayArrayArray1[local7][local111 - 1][local107];
						local157 = this.anIntArrayArrayArray1[local7][local111][local107 + 1] - this.anIntArrayArrayArray1[local7][local111][local107 - 1];
						local170 = (int) Math.sqrt((double) (local135 * local135 + local157 * local157 + 65536));
						local176 = (local135 << 8) / local170;
						local180 = 65536 / local170;
						local186 = (local157 << 8) / local170;
						local202 = (local176 * -50 + local180 * -10 + local186 * -50) / local105 + 96;
						local250 = (local74[local111 - 1][local107] >> 2) + (local74[local111 + 1][local107] >> 3) + (local74[local111][local107 - 1] >> 2) + (local74[local111][local107 + 1] >> 3) + (local74[local111][local107] >> 1);
						this.anIntArrayArray1[local111][local107] = local202 - local250;
					}
				}
				for (local111 = 0; local111 < this.anInt83; local111++) {
					this.anIntArray13[local111] = 0;
					this.anIntArray14[local111] = 0;
					this.anIntArray15[local111] = 0;
					this.anIntArray16[local111] = 0;
					this.anIntArray17[local111] = 0;
				}
				for (local135 = -5; local135 < this.anInt82 + 5; local135++) {
					for (local157 = 0; local157 < this.anInt83; local157++) {
						local170 = local135 + 5;
						@Pc(385) int local385;
						if (local170 >= 0 && local170 < this.anInt82) {
							local176 = this.aByteArrayArrayArray2[local7][local170][local157] & 0xFF;
							if (local176 > 0) {
								@Pc(344) Class11 local344 = Class11.aClass11Array1[local176 - 1];
								this.anIntArray13[local157] += local344.anInt387;
								this.anIntArray14[local157] += local344.anInt385;
								this.anIntArray15[local157] += local344.anInt386;
								this.anIntArray16[local157] += local344.anInt388;
								local385 = this.anIntArray17[local157]++;
							}
						}
						local176 = local135 - 5;
						if (local176 >= 0 && local176 < this.anInt82) {
							local180 = this.aByteArrayArrayArray2[local7][local176][local157] & 0xFF;
							if (local180 > 0) {
								@Pc(417) Class11 local417 = Class11.aClass11Array1[local180 - 1];
								this.anIntArray13[local157] -= local417.anInt387;
								this.anIntArray14[local157] -= local417.anInt385;
								this.anIntArray15[local157] -= local417.anInt386;
								this.anIntArray16[local157] -= local417.anInt388;
								local385 = this.anIntArray17[local157]--;
							}
						}
					}
					if (local135 >= 1 && local135 < this.anInt82 - 1) {
						local170 = 0;
						local176 = 0;
						local180 = 0;
						local186 = 0;
						local202 = 0;
						for (local250 = -5; local250 < this.anInt83 + 5; local250++) {
							@Pc(493) int local493 = local250 + 5;
							if (local493 >= 0 && local493 < this.anInt83) {
								local170 += this.anIntArray13[local493];
								local176 += this.anIntArray14[local493];
								local180 += this.anIntArray15[local493];
								local186 += this.anIntArray16[local493];
								local202 += this.anIntArray17[local493];
							}
							@Pc(538) int local538 = local250 - 5;
							if (local538 >= 0 && local538 < this.anInt83) {
								local170 -= this.anIntArray13[local538];
								local176 -= this.anIntArray14[local538];
								local180 -= this.anIntArray15[local538];
								local186 -= this.anIntArray16[local538];
								local202 -= this.anIntArray17[local538];
							}
							if (local250 >= 1 && local250 < this.anInt83 - 1 && (!aBoolean27 || (this.aByteArrayArrayArray1[local7][local135][local250] & 0x10) == 0 && this.method41(928, local7, local135, local250) == anInt81)) {
								@Pc(621) int local621 = this.aByteArrayArrayArray2[local7][local135][local250] & 0xFF;
								@Pc(632) int local632 = this.aByteArrayArrayArray3[local7][local135][local250] & 0xFF;
								if (local621 > 0 || local632 > 0) {
									@Pc(645) int local645 = this.anIntArrayArrayArray1[local7][local135][local250];
									@Pc(656) int local656 = this.anIntArrayArrayArray1[local7][local135 + 1][local250];
									@Pc(669) int local669 = this.anIntArrayArrayArray1[local7][local135 + 1][local250 + 1];
									@Pc(680) int local680 = this.anIntArrayArrayArray1[local7][local135][local250 + 1];
									@Pc(687) int local687 = this.anIntArrayArray1[local135][local250];
									@Pc(696) int local696 = this.anIntArrayArray1[local135 + 1][local250];
									@Pc(707) int local707 = this.anIntArrayArray1[local135 + 1][local250 + 1];
									@Pc(716) int local716 = this.anIntArrayArray1[local135][local250 + 1];
									@Pc(718) int local718 = -1;
									if (local621 > 0) {
										local718 = this.method49(local170 * 256 / local186, local176 / local202, local180 / local202);
									}
									if (local7 > 0) {
										@Pc(738) boolean local738 = true;
										if (local621 == 0 && this.aByteArrayArrayArray4[local7][local135][local250] != 0) {
											local738 = false;
										}
										if (local632 > 0 && !Class11.aClass11Array1[local632 - 1].aBoolean100) {
											local738 = false;
										}
										if (local738 && local645 == local656 && local645 == local669 && local645 == local680) {
											this.anIntArrayArrayArray2[local7][local135][local250] |= 0x924;
										}
									}
									@Pc(787) int local787 = 0;
									if (local718 != -1) {
										local787 = Class1_Sub3_Sub2_Sub1.anIntArray142[method47(local718, 96)];
									}
									if (local632 == 0) {
										arg0.method453(local7, local135, local250, 0, 0, -1, local645, local656, local669, local680, method47(local718, local687), method47(local718, local696), method47(local718, local707), method47(local718, local716), 0, 0, 0, 0, local787, 0);
									} else {
										@Pc(841) int local841 = this.aByteArrayArrayArray4[local7][local135][local250] + 1;
										@Pc(850) byte local850 = this.aByteArrayArrayArray5[local7][local135][local250];
										@Pc(856) Class11 local856 = Class11.aClass11Array1[local632 - 1];
										@Pc(859) int local859 = local856.anInt383;
										@Pc(867) int local867;
										@Pc(865) int local865;
										if (local859 >= 0) {
											local865 = Class1_Sub3_Sub2_Sub1.method280(local859);
											local867 = -1;
										} else if (local856.anInt382 == 16711935) {
											local865 = 0;
											local867 = -2;
											local859 = -1;
										} else {
											local867 = this.method49(local856.anInt384, local856.anInt385, local856.anInt386);
											local865 = Class1_Sub3_Sub2_Sub1.anIntArray142[this.method48(local867, 96)];
										}
										arg0.method453(local7, local135, local250, local841, local850, local859, local645, local656, local669, local680, method47(local718, local687), method47(local718, local696), method47(local718, local707), method47(local718, local716), this.method48(local867, local687), this.method48(local867, local696), this.method48(local867, local707), this.method48(local867, local716), local787, local865);
									}
								}
							}
						}
					}
				}
				for (local157 = 1; local157 < this.anInt83 - 1; local157++) {
					for (local170 = 1; local170 < this.anInt82 - 1; local170++) {
						arg0.method452(local7, local170, local157, this.method41(928, local7, local170, local157));
					}
				}
			}
			if (!aBoolean28) {
				arg0.method479();
			}
			for (local11 = 0; local11 < this.anInt82; local11++) {
				for (local27 = 0; local27 < this.anInt83; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method450(local11, local27);
					}
				}
			}
			if (!aBoolean28) {
				local27 = 1;
				@Pc(1042) int local1042 = 2;
				@Pc(1044) int local1044 = 4;
				for (@Pc(1046) int local1046 = 0; local1046 < 4; local1046++) {
					if (local1046 > 0) {
						local27 <<= 0x3;
						local1042 <<= 0x3;
						local1044 <<= 0x3;
					}
					for (@Pc(1064) int local1064 = 0; local1064 <= local1046; local1064++) {
						for (local99 = 0; local99 <= this.anInt83; local99++) {
							for (local105 = 0; local105 <= this.anInt82; local105++) {
								if ((this.anIntArrayArrayArray2[local1064][local105][local99] & local27) != 0) {
									local107 = local99;
									local111 = local99;
									local135 = local1064;
									local157 = local1064;
									while (local107 > 0 && (this.anIntArrayArrayArray2[local1064][local105][local107 - 1] & local27) != 0) {
										local107--;
									}
									while (local111 < this.anInt83 && (this.anIntArrayArrayArray2[local1064][local105][local111 + 1] & local27) != 0) {
										local111++;
									}
									label309: while (local135 > 0) {
										for (local170 = local107; local170 <= local111; local170++) {
											if ((this.anIntArrayArrayArray2[local135 - 1][local105][local170] & local27) == 0) {
												break label309;
											}
										}
										local135--;
									}
									label298: while (local157 < local1046) {
										for (local170 = local107; local170 <= local111; local170++) {
											if ((this.anIntArrayArrayArray2[local157 + 1][local105][local170] & local27) == 0) {
												break label298;
											}
										}
										local157++;
									}
									local170 = (local157 + 1 - local135) * (local111 + 1 - local107);
									if (local170 >= 8) {
										local180 = this.anIntArrayArrayArray1[local157][local105][local107] - 240;
										local186 = this.anIntArrayArrayArray1[local135][local105][local107];
										Class33.method451(local111 * 128 + 128, local1046, this.anInt80, local105 * 128, local180, local107 * 128, 1, local186, local105 * 128);
										for (local202 = local135; local202 <= local157; local202++) {
											for (local250 = local107; local250 <= local111; local250++) {
												this.anIntArrayArrayArray2[local202][local105][local250] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1064][local105][local99] & local1042) != 0) {
									local107 = local105;
									local111 = local105;
									local135 = local1064;
									local157 = local1064;
									while (local107 > 0 && (this.anIntArrayArrayArray2[local1064][local107 - 1][local99] & local1042) != 0) {
										local107--;
									}
									while (local111 < this.anInt82 && (this.anIntArrayArrayArray2[local1064][local111 + 1][local99] & local1042) != 0) {
										local111++;
									}
									label362: while (local135 > 0) {
										for (local170 = local107; local170 <= local111; local170++) {
											if ((this.anIntArrayArrayArray2[local135 - 1][local170][local99] & local1042) == 0) {
												break label362;
											}
										}
										local135--;
									}
									label351: while (local157 < local1046) {
										for (local170 = local107; local170 <= local111; local170++) {
											if ((this.anIntArrayArrayArray2[local157 + 1][local170][local99] & local1042) == 0) {
												break label351;
											}
										}
										local157++;
									}
									local170 = (local157 + 1 - local135) * (local111 + 1 - local107);
									if (local170 >= 8) {
										local180 = this.anIntArrayArrayArray1[local157][local107][local99] - 240;
										local186 = this.anIntArrayArrayArray1[local135][local107][local99];
										Class33.method451(local99 * 128, local1046, this.anInt80, local107 * 128, local180, local99 * 128, 2, local186, local111 * 128 + 128);
										for (local202 = local135; local202 <= local157; local202++) {
											for (local250 = local107; local250 <= local111; local250++) {
												this.anIntArrayArrayArray2[local202][local250][local99] &= ~local1042;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1064][local105][local99] & local1044) != 0) {
									local107 = local105;
									local111 = local105;
									local135 = local99;
									local157 = local99;
									while (local135 > 0 && (this.anIntArrayArrayArray2[local1064][local105][local135 - 1] & local1044) != 0) {
										local135--;
									}
									while (local157 < this.anInt83 && (this.anIntArrayArrayArray2[local1064][local105][local157 + 1] & local1044) != 0) {
										local157++;
									}
									label415: while (local107 > 0) {
										for (local170 = local135; local170 <= local157; local170++) {
											if ((this.anIntArrayArrayArray2[local1064][local107 - 1][local170] & local1044) == 0) {
												break label415;
											}
										}
										local107--;
									}
									label404: while (local111 < this.anInt82) {
										for (local170 = local135; local170 <= local157; local170++) {
											if ((this.anIntArrayArrayArray2[local1064][local111 + 1][local170] & local1044) == 0) {
												break label404;
											}
										}
										local111++;
									}
									if ((local111 + 1 - local107) * (local157 + 1 - local135) >= 4) {
										local170 = this.anIntArrayArrayArray1[local1064][local107][local135];
										Class33.method451(local157 * 128 + 128, local1046, this.anInt80, local107 * 128, local170, local135 * 128, 4, local170, local111 * 128 + 128);
										for (local176 = local107; local176 <= local111; local176++) {
											for (local180 = local135; local180 <= local157; local180++) {
												this.anIntArrayArrayArray2[local1064][local176][local180] &= ~local1044;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1682) RuntimeException local1682) {
			signlink.reporterror("69404, " + arg0 + ", " + arg1 + ", " + true + ", " + local1682.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg3] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("35343, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
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
