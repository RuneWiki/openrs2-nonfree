import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private static boolean aBoolean17;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt48;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	private static boolean aBoolean19;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static boolean aBoolean18 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray10 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray11 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray12 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray13 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "B")
	private byte aByte2 = 80;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt50;

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
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method42(arg0 + 45365, arg1 + 91923, 4) + (method42(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method42(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method44(local3, local13);
		@Pc(29) int local29 = method44(local3 + 1, local13);
		@Pc(35) int local35 = method44(local3, local13 + 1);
		@Pc(43) int local43 = method44(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method43(local23, local29, local9, arg2);
		@Pc(55) int local55 = method43(local35, local43, local9, arg2);
		return method43(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private static int method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub3_Sub2_Sub1.anIntArray125[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method45(arg0 - 1, arg1 - 1) + method45(arg0 + 1, arg1 - 1) + method45(arg0 - 1, arg1 + 1) + method45(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method45(arg0 - 1, arg1) + method45(arg0 + 1, arg1) + method45(arg0, arg1 - 1) + method45(arg0, arg1 + 1);
		@Pc(59) int local59 = method45(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!r;IIIILclient!bc;Lclient!ob;[[[IIBI)V")
	public static void method49(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3 arg6, @OriginalArg(7) Class25 arg7, @OriginalArg(8) int[][][] arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(7) int local7 = arg8[arg10][arg5][arg9];
			@Pc(17) int local17 = arg8[arg10][arg5 + 1][arg9];
			@Pc(29) int local29 = arg8[arg10][arg5 + 1][arg9 + 1];
			@Pc(39) int local39 = arg8[arg10][arg5][arg9 + 1];
			@Pc(49) int local49 = local7 + local17 + local29 + local39 >> 2;
			@Pc(52) Class39 local52 = Class39.method496(arg0);
			@Pc(64) int local64 = arg5 + (arg9 << 7) + (arg0 << 14) + 1073741824;
			if (!local52.aBoolean148) {
				local64 += Integer.MIN_VALUE;
			}
			@Pc(78) byte local78 = (byte) ((arg3 << 6) + arg2);
			@Pc(100) Class1_Sub3_Sub1 local100;
			if (arg2 == 22) {
				local100 = local52.method499(22, arg3, local7, local17, local29, local39, -1);
				arg1.method419(local64, arg9, local78, local100, arg5, local49, arg4);
				if (local52.aBoolean146 && local52.aBoolean148) {
					arg6.method27(arg9, arg5);
				}
			} else {
				@Pc(155) int local155;
				if (arg2 == 10 || arg2 == 11) {
					local100 = local52.method499(10, arg3, local7, local17, local29, local39, -1);
					if (local100 != null) {
						@Pc(142) int local142 = 0;
						if (arg2 == 11) {
							local142 += 256;
						}
						@Pc(158) int local158;
						if (arg3 == 1 || arg3 == 3) {
							local155 = local52.anInt665;
							local158 = local52.anInt664;
						} else {
							local155 = local52.anInt664;
							local158 = local52.anInt665;
						}
						arg1.method423(local100, local78, null, local49, arg5, local158, local155, arg4, local64, arg9, local142);
					}
					if (local52.aBoolean146) {
						arg6.method26(arg5, local52.anInt665, local52.aBoolean147, local52.anInt664, arg9, arg3);
					}
					if (local52.anInt666 != -1) {
						arg7.method399(new Class1_Sub6(2, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
					}
				} else if (arg2 >= 12) {
					local100 = local52.method499(arg2, arg3, local7, local17, local29, local39, -1);
					arg1.method423(local100, local78, null, local49, arg5, 1, 1, arg4, local64, arg9, 0);
					if (local52.aBoolean146) {
						arg6.method26(arg5, local52.anInt665, local52.aBoolean147, local52.anInt664, arg9, arg3);
					}
					if (local52.anInt666 != -1) {
						arg7.method399(new Class1_Sub6(2, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
					}
				} else if (arg2 == 0) {
					local100 = local52.method499(0, arg3, local7, local17, local29, local39, -1);
					arg1.method421(local64, 0, local49, local100, arg9, arg5, null, local78, anIntArray10[arg3], arg4);
					if (local52.aBoolean146) {
						arg6.method25(arg2, arg9, arg3, arg5, 757, local52.aBoolean147);
					}
				} else if (arg2 == 1) {
					local100 = local52.method499(1, arg3, local7, local17, local29, local39, -1);
					arg1.method421(local64, 0, local49, local100, arg9, arg5, null, local78, anIntArray11[arg3], arg4);
					if (local52.aBoolean146) {
						arg6.method25(arg2, arg9, arg3, arg5, 757, local52.aBoolean147);
					}
				} else {
					@Pc(371) int local371;
					@Pc(393) Class1_Sub3_Sub1 local393;
					if (arg2 == 2) {
						local371 = arg3 + 1 & 0x3;
						@Pc(383) Class1_Sub3_Sub1 local383 = local52.method499(2, arg3 + 4, local7, local17, local29, local39, -1);
						local393 = local52.method499(2, local371, local7, local17, local29, local39, -1);
						arg1.method421(local64, anIntArray10[local371], local49, local383, arg9, arg5, local393, local78, anIntArray10[arg3], arg4);
						if (local52.aBoolean146) {
							arg6.method25(arg2, arg9, arg3, arg5, 757, local52.aBoolean147);
						}
					} else if (arg2 == 3) {
						local100 = local52.method499(3, arg3, local7, local17, local29, local39, -1);
						arg1.method421(local64, 0, local49, local100, arg9, arg5, null, local78, anIntArray11[arg3], arg4);
						if (local52.aBoolean146) {
							arg6.method25(arg2, arg9, arg3, arg5, 757, local52.aBoolean147);
						}
					} else if (arg2 == 9) {
						local100 = local52.method499(arg2, arg3, local7, local17, local29, local39, -1);
						arg1.method423(local100, local78, null, local49, arg5, 1, 1, arg4, local64, arg9, 0);
						if (local52.aBoolean146) {
							arg6.method26(arg5, local52.anInt665, local52.aBoolean147, local52.anInt664, arg9, arg3);
						}
					} else if (arg2 == 4) {
						local100 = local52.method499(4, 0, local7, local17, local29, local39, -1);
						arg1.method422(arg5, local78, local49, 0, local64, anIntArray10[arg3], arg3 * 512, 0, local100, arg9, arg4);
						if (local52.anInt666 != -1) {
							arg7.method399(new Class1_Sub6(1, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
						}
					} else if (arg2 == 5) {
						local371 = 16;
						local155 = arg1.method437(arg4, arg5, arg9);
						if (local155 > 0) {
							local371 = Class39.method496(local155 >> 14 & 0x7FFF).anInt667;
						}
						local393 = local52.method499(4, 0, local7, local17, local29, local39, -1);
						arg1.method422(arg5, local78, local49, anIntArray13[arg3] * local371, local64, anIntArray10[arg3], arg3 * 512, anIntArray12[arg3] * local371, local393, arg9, arg4);
						if (local52.anInt666 != -1) {
							arg7.method399(new Class1_Sub6(1, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
						}
					} else if (arg2 == 6) {
						local100 = local52.method499(4, 0, local7, local17, local29, local39, -1);
						arg1.method422(arg5, local78, local49, 0, local64, 256, arg3, 0, local100, arg9, arg4);
						if (local52.anInt666 != -1) {
							arg7.method399(new Class1_Sub6(1, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
						}
					} else if (arg2 == 7) {
						local100 = local52.method499(4, 0, local7, local17, local29, local39, -1);
						arg1.method422(arg5, local78, local49, 0, local64, 512, arg3, 0, local100, arg9, arg4);
						if (local52.anInt666 != -1) {
							arg7.method399(new Class1_Sub6(1, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
						}
					} else if (arg2 == 8) {
						local100 = local52.method499(4, 0, local7, local17, local29, local39, -1);
						arg1.method422(arg5, local78, local49, 0, local64, 768, arg3, 0, local100, arg9, arg4);
						if (local52.anInt666 != -1) {
							arg7.method399(new Class1_Sub6(1, -69, arg4, arg0, true, Class13.aClass13Array1[local52.anInt666], arg9, arg5));
						}
					}
				}
			}
		} catch (@Pc(783) RuntimeException local783) {
			signlink.reporterror("42428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 1 + ", " + arg10 + ", " + local783.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[BII[[[II)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt49 = arg1;
			this.anInt50 = arg2;
			@Pc(14) int local14 = 89 / arg4;
			this.anIntArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt49][this.anInt50];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt49][this.anInt50];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt49][this.anInt50];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt49][this.anInt50];
			this.anIntArrayArrayArray2 = new int[4][this.anInt49 + 1][this.anInt50 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt49 + 1][this.anInt50 + 1];
			this.anIntArrayArray2 = new int[this.anInt49 + 1][this.anInt50 + 1];
			this.anIntArray5 = new int[this.anInt50];
			this.anIntArray6 = new int[this.anInt50];
			this.anIntArray7 = new int[this.anInt50];
			this.anIntArray8 = new int[this.anInt50];
			this.anIntArray9 = new int[this.anInt50];
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("4911, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) byte local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < Class5.anInt62; local9++) {
				if (Class5.aClass5Array1[local9].aString1.equalsIgnoreCase("water")) {
					local7 = (byte) (local9 + 1);
					break;
				}
			}
			for (@Pc(31) int local31 = arg1; local31 < arg1 + 64; local31++) {
				for (@Pc(35) int local35 = arg2; local35 < arg2 + 64; local35++) {
					if (local35 >= 0 && local35 < this.anInt49 && local31 >= 0 && local31 < this.anInt50) {
						this.aByteArrayArrayArray3[0][local35][local31] = local7;
						for (@Pc(60) int local60 = 0; local60 < 4; local60++) {
							this.anIntArrayArrayArray1[local60][local35][local31] = 0;
							this.aByteArrayArrayArray1[local60][local35][local31] = 0;
						}
					}
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("22606, " + arg0 + ", " + arg1 + ", " + 64 + ", " + arg2 + ", " + 64 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[BI)V")
	public void method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg3, 4);
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (@Pc(22) int local22 = 0; local22 < 64; local22++) {
						@Pc(28) int local28 = local18 + arg4;
						@Pc(32) int local32 = local22 + arg0;
						@Pc(54) int local54;
						if (local28 >= 0 && local28 < 104 && local32 >= 0 && local32 < 104) {
							this.aByteArrayArrayArray1[local14][local28][local32] = 0;
							while (true) {
								local54 = local7.method380();
								if (local54 == 0) {
									if (local14 == 0) {
										this.anIntArrayArrayArray1[0][local28][local32] = -method41(local28 + arg1 + 932731, local32 + 556238 + arg2) * 8;
									} else {
										this.anIntArrayArrayArray1[local14][local28][local32] = this.anIntArrayArrayArray1[local14 - 1][local28][local32] - 240;
									}
									break;
								}
								if (local54 == 1) {
									@Pc(110) int local110 = local7.method380();
									if (local110 == 1) {
										local110 = 0;
									}
									if (local14 == 0) {
										this.anIntArrayArrayArray1[0][local28][local32] = -local110 * 8;
									} else {
										this.anIntArrayArrayArray1[local14][local28][local32] = this.anIntArrayArrayArray1[local14 - 1][local28][local32] - local110 * 8;
									}
									break;
								}
								if (local54 <= 49) {
									this.aByteArrayArrayArray3[local14][local28][local32] = local7.method381();
									this.aByteArrayArrayArray4[local14][local28][local32] = (byte) ((local54 - 2) / 4);
									this.aByteArrayArrayArray5[local14][local28][local32] = (byte) (local54 - 2 & 0x3);
								} else if (local54 <= 81) {
									this.aByteArrayArrayArray1[local14][local28][local32] = (byte) (local54 - 49);
								} else {
									this.aByteArrayArrayArray2[local14][local28][local32] = (byte) (local54 - 81);
								}
							}
						} else {
							while (true) {
								local54 = local7.method380();
								if (local54 == 0) {
									break;
								}
								if (local54 == 1) {
									local7.method380();
									break;
								}
								if (local54 <= 49) {
									local7.method380();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("29526, " + arg0 + ", " + -519 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BBLclient!r;[Lclient!bc;IILclient!ob;)V")
	public void method38(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class3[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25 arg5) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(arg0, 4);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method394();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method394();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method380();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg4;
					@Pc(74) int local74 = local45 + arg3;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						this.method39(local19, local66, local74, local62, this.anInt47, arg2[local55], local70, local55, arg5, arg1);
					}
				}
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("39271, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILclient!bc;IILclient!ob;Lclient!r;)V")
	private void method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class25 arg8, @OriginalArg(9) Class30 arg9) {
		try {
			@Pc(5) int local5;
			if (aBoolean18) {
				local5 = arg7;
				if (arg7 > 0 && (this.aByteArrayArrayArray1[1][arg6][arg2] & 0x2) != 0) {
					local5 = arg7 - 1;
				}
				if ((this.aByteArrayArrayArray1[arg7][arg6][arg2] & 0x8) != 0) {
					local5 = 0;
				}
				if (local5 != anInt48) {
					return;
				}
				if ((this.aByteArrayArrayArray1[arg7][arg6][arg2] & 0x10) != 0) {
					return;
				}
			}
			local5 = this.anIntArrayArrayArray1[arg7][arg6][arg2];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg2];
			@Pc(81) int local81 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg2 + 1];
			@Pc(92) int local92 = this.anIntArrayArrayArray1[arg7][arg6][arg2 + 1];
			if (arg4 == 0) {
				@Pc(105) int local105 = local5 + local68 + local81 + local92 >> 2;
				@Pc(108) Class39 local108 = Class39.method496(arg0);
				@Pc(120) int local120 = arg6 + (arg2 << 7) + (arg0 << 14) + 1073741824;
				if (!local108.aBoolean148) {
					local120 += Integer.MIN_VALUE;
				}
				@Pc(134) byte local134 = (byte) ((arg1 << 6) + arg3);
				@Pc(156) Class1_Sub3_Sub1 local156;
				if (arg3 != 22) {
					@Pc(211) int local211;
					if (arg3 == 10 || arg3 == 11) {
						local156 = local108.method499(10, arg1, local5, local68, local81, local92, -1);
						if (local156 != null) {
							@Pc(198) int local198 = 0;
							if (arg3 == 11) {
								local198 += 256;
							}
							@Pc(214) int local214;
							if (arg1 == 1 || arg1 == 3) {
								local211 = local108.anInt665;
								local214 = local108.anInt664;
							} else {
								local211 = local108.anInt664;
								local214 = local108.anInt665;
							}
							if (arg9.method423(local156, local134, null, local105, arg6, local214, local211, arg7, local120, arg2, local198) && local108.aBoolean154) {
								for (@Pc(242) int local242 = 0; local242 <= local211; local242++) {
									for (@Pc(246) int local246 = 0; local246 <= local214; local246++) {
										@Pc(253) int local253 = local156.anInt257 / 4;
										if (local253 > 30) {
											local253 = 30;
										}
										if (local253 > this.aByteArrayArrayArray6[arg7][arg6 + local242][arg2 + local246]) {
											this.aByteArrayArrayArray6[arg7][arg6 + local242][arg2 + local246] = (byte) local253;
										}
									}
								}
							}
						}
						if (local108.aBoolean146) {
							arg5.method26(arg6, local108.anInt665, local108.aBoolean147, local108.anInt664, arg2, arg1);
						}
						if (local108.anInt666 != -1) {
							arg8.method399(new Class1_Sub6(2, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
						}
					} else if (arg3 >= 12) {
						local156 = local108.method499(arg3, arg1, local5, local68, local81, local92, -1);
						arg9.method423(local156, local134, null, local105, arg6, 1, 1, arg7, local120, arg2, 0);
						if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg7 > 0) {
							this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x924;
						}
						if (local108.aBoolean146) {
							arg5.method26(arg6, local108.anInt665, local108.aBoolean147, local108.anInt664, arg2, arg1);
						}
						if (local108.anInt666 != -1) {
							arg8.method399(new Class1_Sub6(2, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
						}
					} else if (arg3 == 0) {
						local156 = local108.method499(0, arg1, local5, local68, local81, local92, -1);
						arg9.method421(local120, 0, local105, local156, arg2, arg6, null, local134, anIntArray10[arg1], arg7);
						if (arg1 == 0) {
							if (local108.aBoolean154) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
								this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
							}
							if (local108.aBoolean151) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
							}
						} else if (arg1 == 1) {
							if (local108.aBoolean154) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
							}
							if (local108.aBoolean151) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
							}
						} else if (arg1 == 2) {
							if (local108.aBoolean154) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
							}
							if (local108.aBoolean151) {
								this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
							}
						} else if (arg1 == 3) {
							if (local108.aBoolean154) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
							}
							if (local108.aBoolean151) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
							}
						}
						if (local108.aBoolean146) {
							arg5.method25(arg3, arg2, arg1, arg6, 757, local108.aBoolean147);
						}
						if (local108.anInt666 != -1) {
							arg8.method399(new Class1_Sub6(0, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
						}
					} else if (arg3 == 1) {
						local156 = local108.method499(1, arg1, local5, local68, local81, local92, -1);
						arg9.method421(local120, 0, local105, local156, arg2, arg6, null, local134, anIntArray11[arg1], arg7);
						if (local108.aBoolean154) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
							}
						}
						if (local108.aBoolean146) {
							arg5.method25(arg3, arg2, arg1, arg6, 757, local108.aBoolean147);
						}
						if (local108.anInt666 != -1) {
							arg8.method399(new Class1_Sub6(0, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
						}
					} else {
						@Pc(792) int local792;
						@Pc(814) Class1_Sub3_Sub1 local814;
						if (arg3 == 2) {
							local792 = arg1 + 1 & 0x3;
							@Pc(804) Class1_Sub3_Sub1 local804 = local108.method499(2, arg1 + 4, local5, local68, local81, local92, -1);
							local814 = local108.method499(2, local792, local5, local68, local81, local92, -1);
							arg9.method421(local120, anIntArray10[local792], local105, local804, arg2, arg6, local814, local134, anIntArray10[arg1], arg7);
							if (local108.aBoolean151) {
								if (arg1 == 0) {
									this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
									this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
								} else if (arg1 == 1) {
									this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
									this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
								} else if (arg1 == 2) {
									this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
									this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
								} else if (arg1 == 3) {
									this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
									this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
								}
							}
							if (local108.aBoolean146) {
								arg5.method25(arg3, arg2, arg1, arg6, 757, local108.aBoolean147);
							}
						} else if (arg3 == 3) {
							local156 = local108.method499(3, arg1, local5, local68, local81, local92, -1);
							arg9.method421(local120, 0, local105, local156, arg2, arg6, null, local134, anIntArray11[arg1], arg7);
							if (local108.aBoolean154) {
								if (arg1 == 0) {
									this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
								} else if (arg1 == 1) {
									this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
								} else if (arg1 == 2) {
									this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
								} else if (arg1 == 3) {
									this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
								}
							}
							if (local108.aBoolean146) {
								arg5.method25(arg3, arg2, arg1, arg6, 757, local108.aBoolean147);
							}
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(0, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 9) {
							local156 = local108.method499(arg3, arg1, local5, local68, local81, local92, -1);
							arg9.method423(local156, local134, null, local105, arg6, 1, 1, arg7, local120, arg2, 0);
							if (local108.aBoolean146) {
								arg5.method26(arg6, local108.anInt665, local108.aBoolean147, local108.anInt664, arg2, arg1);
							}
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(2, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 4) {
							local156 = local108.method499(4, 0, local5, local68, local81, local92, -1);
							arg9.method422(arg6, local134, local105, 0, local120, anIntArray10[arg1], arg1 * 512, 0, local156, arg2, arg7);
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(1, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 5) {
							local792 = 16;
							local211 = arg9.method437(arg7, arg6, arg2);
							if (local211 > 0) {
								local792 = Class39.method496(local211 >> 14 & 0x7FFF).anInt667;
							}
							local814 = local108.method499(4, 0, local5, local68, local81, local92, -1);
							arg9.method422(arg6, local134, local105, anIntArray13[arg1] * local792, local120, anIntArray10[arg1], arg1 * 512, anIntArray12[arg1] * local792, local814, arg2, arg7);
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(1, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 6) {
							local156 = local108.method499(4, 0, local5, local68, local81, local92, -1);
							arg9.method422(arg6, local134, local105, 0, local120, 256, arg1, 0, local156, arg2, arg7);
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(1, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 7) {
							local156 = local108.method499(4, 0, local5, local68, local81, local92, -1);
							arg9.method422(arg6, local134, local105, 0, local120, 512, arg1, 0, local156, arg2, arg7);
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(1, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						} else if (arg3 == 8) {
							local156 = local108.method499(4, 0, local5, local68, local81, local92, -1);
							arg9.method422(arg6, local134, local105, 0, local120, 768, arg1, 0, local156, arg2, arg7);
							if (local108.anInt666 != -1) {
								arg8.method399(new Class1_Sub6(1, -69, arg7, arg0, true, Class13.aClass13Array1[local108.anInt666], arg2, arg6));
							}
						}
					}
				} else if (!aBoolean18 || local108.aBoolean148 || local108.aBoolean155) {
					local156 = local108.method499(22, arg1, local5, local68, local81, local92, -1);
					arg9.method419(local120, arg2, local134, local156, arg6, local105, arg7);
					if (local108.aBoolean146 && local108.aBoolean148) {
						arg5.method27(arg2, arg6);
					}
				}
			}
		} catch (@Pc(1432) RuntimeException local1432) {
			signlink.reporterror("25924, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;Z[Lclient!bc;)V")
	public void method40(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class3[] arg1) {
		try {
			@Pc(3) Class3 local3 = null;
			@Pc(12) int local12;
			@Pc(16) int local16;
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				@Pc(10) Class3 local10 = arg1[local5];
				for (local12 = 0; local12 < 104; local12++) {
					for (local16 = 0; local16 < 104; local16++) {
						if ((this.aByteArrayArrayArray1[local5][local12][local16] & 0x1) == 1) {
							local10.method27(local16, local12);
						}
						if (local5 > 0 && (this.aByteArrayArrayArray1[1][local12][local16] & 0x2) == 2) {
							local3.anIntArrayArray1[local12][local16] = local10.anIntArrayArray1[local12][local16];
						}
					}
				}
				local3 = local10;
			}
			@Pc(109) int local109;
			@Pc(115) int local115;
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(145) int local145;
			@Pc(167) int local167;
			@Pc(180) int local180;
			@Pc(186) int local186;
			@Pc(190) int local190;
			@Pc(196) int local196;
			@Pc(212) int local212;
			@Pc(260) int local260;
			for (@Pc(77) int local77 = 0; local77 < 4; local77++) {
				@Pc(84) byte[][] local84 = this.aByteArrayArrayArray6[local77];
				local109 = (int) Math.sqrt((double) 5100);
				local115 = local109 * 768 >> 8;
				for (local117 = 1; local117 < this.anInt50 - 1; local117++) {
					for (local121 = 1; local121 < this.anInt49 - 1; local121++) {
						local145 = this.anIntArrayArrayArray1[local77][local121 + 1][local117] - this.anIntArrayArrayArray1[local77][local121 - 1][local117];
						local167 = this.anIntArrayArrayArray1[local77][local121][local117 + 1] - this.anIntArrayArrayArray1[local77][local121][local117 - 1];
						local180 = (int) Math.sqrt((double) (local145 * local145 + local167 * local167 + 65536));
						local186 = (local145 << 8) / local180;
						local190 = 65536 / local180;
						local196 = (local167 << 8) / local180;
						local212 = (local186 * -50 + local190 * -10 + local196 * -50) / local115 + 96;
						local260 = (local84[local121 - 1][local117] >> 2) + (local84[local121 + 1][local117] >> 3) + (local84[local121][local117 - 1] >> 2) + (local84[local121][local117 + 1] >> 3) + (local84[local121][local117] >> 1);
						this.anIntArrayArray2[local121][local117] = local212 - local260;
					}
				}
				for (local121 = 0; local121 < this.anInt50; local121++) {
					this.anIntArray5[local121] = 0;
					this.anIntArray6[local121] = 0;
					this.anIntArray7[local121] = 0;
					this.anIntArray8[local121] = 0;
					this.anIntArray9[local121] = 0;
				}
				for (local145 = -5; local145 < this.anInt49 + 5; local145++) {
					for (local167 = 0; local167 < this.anInt50; local167++) {
						local180 = local145 + 5;
						@Pc(395) int local395;
						if (local180 >= 0 && local180 < this.anInt49) {
							local186 = this.aByteArrayArrayArray2[local77][local180][local167] & 0xFF;
							if (local186 > 0) {
								@Pc(354) Class5 local354 = Class5.aClass5Array1[local186 - 1];
								this.anIntArray5[local167] += local354.anInt68;
								this.anIntArray6[local167] += local354.anInt66;
								this.anIntArray7[local167] += local354.anInt67;
								this.anIntArray8[local167] += local354.anInt69;
								local395 = this.anIntArray9[local167]++;
							}
						}
						local186 = local145 - 5;
						if (local186 >= 0 && local186 < this.anInt49) {
							local190 = this.aByteArrayArrayArray2[local77][local186][local167] & 0xFF;
							if (local190 > 0) {
								@Pc(427) Class5 local427 = Class5.aClass5Array1[local190 - 1];
								this.anIntArray5[local167] -= local427.anInt68;
								this.anIntArray6[local167] -= local427.anInt66;
								this.anIntArray7[local167] -= local427.anInt67;
								this.anIntArray8[local167] -= local427.anInt69;
								local395 = this.anIntArray9[local167]--;
							}
						}
					}
					if (local145 >= 1 && local145 < this.anInt49 - 1) {
						local180 = 0;
						local186 = 0;
						local190 = 0;
						local196 = 0;
						local212 = 0;
						for (local260 = -5; local260 < this.anInt50 + 5; local260++) {
							@Pc(503) int local503 = local260 + 5;
							if (local503 >= 0 && local503 < this.anInt50) {
								local180 += this.anIntArray5[local503];
								local186 += this.anIntArray6[local503];
								local190 += this.anIntArray7[local503];
								local196 += this.anIntArray8[local503];
								local212 += this.anIntArray9[local503];
							}
							@Pc(548) int local548 = local260 - 5;
							if (local548 >= 0 && local548 < this.anInt50) {
								local180 -= this.anIntArray5[local548];
								local186 -= this.anIntArray6[local548];
								local190 -= this.anIntArray7[local548];
								local196 -= this.anIntArray8[local548];
								local212 -= this.anIntArray9[local548];
							}
							if (local260 >= 1 && local260 < this.anInt50 - 1) {
								@Pc(602) int local602;
								if (aBoolean18) {
									local602 = local77;
									if (local77 > 0 && (this.aByteArrayArrayArray1[1][local145][local260] & 0x2) != 0) {
										local602 = local77 - 1;
									}
									if ((this.aByteArrayArrayArray1[local77][local145][local260] & 0x8) != 0) {
										local602 = 0;
									}
									if (local602 != anInt48 || (this.aByteArrayArrayArray1[local77][local145][local260] & 0x10) != 0) {
										continue;
									}
								}
								local602 = this.aByteArrayArrayArray2[local77][local145][local260] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local77][local145][local260] & 0xFF;
								if (local602 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray1[local77][local145][local260];
									@Pc(690) int local690 = this.anIntArrayArrayArray1[local77][local145 + 1][local260];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local77][local145 + 1][local260 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local77][local145][local260 + 1];
									@Pc(721) int local721 = this.anIntArrayArray2[local145][local260];
									@Pc(730) int local730 = this.anIntArrayArray2[local145 + 1][local260];
									@Pc(741) int local741 = this.anIntArrayArray2[local145 + 1][local260 + 1];
									@Pc(750) int local750 = this.anIntArrayArray2[local145][local260 + 1];
									@Pc(752) int local752 = -1;
									if (local602 > 0) {
										local752 = this.method48(local180 * 256 / local196, local186 / local212, local190 / local212);
									}
									if (local77 > 0) {
										@Pc(772) boolean local772 = true;
										if (local602 == 0 && this.aByteArrayArrayArray4[local77][local145][local260] != 0) {
											local772 = false;
										}
										if (local666 > 0 && !Class5.aClass5Array1[local666 - 1].aBoolean25) {
											local772 = false;
										}
										if (local772 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray2[local77][local145][local260] |= 0x924;
										}
									}
									@Pc(821) int local821 = 0;
									if (local752 != -1) {
										local821 = Class1_Sub3_Sub2_Sub1.anIntArray129[method46(local752, 96)];
									}
									if (local666 == 0) {
										arg0.method418(local77, local145, local260, 0, 0, -1, local679, local690, local703, local714, method46(local752, local721), method46(local752, local730), method46(local752, local741), method46(local752, local750), 0, 0, 0, 0, local821, 0);
									} else {
										@Pc(875) int local875 = this.aByteArrayArrayArray4[local77][local145][local260] + 1;
										@Pc(884) byte local884 = this.aByteArrayArrayArray5[local77][local145][local260];
										@Pc(890) Class5 local890 = Class5.aClass5Array1[local666 - 1];
										@Pc(893) int local893 = local890.anInt64;
										@Pc(901) int local901;
										@Pc(899) int local899;
										if (local893 >= 0) {
											local899 = Class1_Sub3_Sub2_Sub1.method257(local893);
											local901 = -1;
										} else if (local890.anInt63 == 16711935) {
											local899 = 0;
											local901 = -2;
											local893 = -1;
										} else {
											local901 = this.method48(local890.anInt65, local890.anInt66, local890.anInt67);
											local899 = Class1_Sub3_Sub2_Sub1.anIntArray129[this.method47(local901, 96)];
										}
										arg0.method418(local77, local145, local260, local875, local884, local893, local679, local690, local703, local714, method46(local752, local721), method46(local752, local730), method46(local752, local741), method46(local752, local750), this.method47(local901, local721), this.method47(local901, local730), this.method47(local901, local741), this.method47(local901, local750), local821, local899);
									}
								}
							}
						}
					}
				}
				for (local167 = 1; local167 < this.anInt50 - 1; local167++) {
					for (local180 = 1; local180 < this.anInt49 - 1; local180++) {
						local186 = local77;
						if (local77 > 0 && (this.aByteArrayArrayArray1[1][local180][local167] & 0x2) != 0) {
							local186 = local77 - 1;
						}
						if ((this.aByteArrayArrayArray1[local77][local180][local167] & 0x8) != 0) {
							local186 = 0;
						}
						arg0.method417(local77, local180, local167, local186);
					}
				}
			}
			if (!aBoolean19) {
				arg0.method442();
			}
			for (local12 = 0; local12 < this.anInt49; local12++) {
				for (local16 = 0; local16 < this.anInt50; local16++) {
					if ((this.aByteArrayArrayArray1[1][local12][local16] & 0x2) == 2) {
						arg0.method415(local16, local12);
					}
				}
			}
			if (!aBoolean19) {
				local16 = 1;
				@Pc(1100) int local1100 = 2;
				@Pc(1102) int local1102 = 4;
				for (@Pc(1104) int local1104 = 0; local1104 < 4; local1104++) {
					if (local1104 > 0) {
						local16 <<= 0x3;
						local1100 <<= 0x3;
						local1102 <<= 0x3;
					}
					for (@Pc(1122) int local1122 = 0; local1122 <= local1104; local1122++) {
						for (local109 = 0; local109 <= this.anInt50; local109++) {
							for (local115 = 0; local115 <= this.anInt49; local115++) {
								if ((this.anIntArrayArrayArray2[local1122][local115][local109] & local16) != 0) {
									local117 = local109;
									local121 = local109;
									local145 = local1122;
									local167 = local1122;
									while (local117 > 0 && (this.anIntArrayArrayArray2[local1122][local115][local117 - 1] & local16) != 0) {
										local117--;
									}
									while (local121 < this.anInt50 && (this.anIntArrayArrayArray2[local1122][local115][local121 + 1] & local16) != 0) {
										local121++;
									}
									label327: while (local145 > 0) {
										for (local180 = local117; local180 <= local121; local180++) {
											if ((this.anIntArrayArrayArray2[local145 - 1][local115][local180] & local16) == 0) {
												break label327;
											}
										}
										local145--;
									}
									label316: while (local167 < local1104) {
										for (local180 = local117; local180 <= local121; local180++) {
											if ((this.anIntArrayArrayArray2[local167 + 1][local115][local180] & local16) == 0) {
												break label316;
											}
										}
										local167++;
									}
									local180 = (local167 + 1 - local145) * (local121 + 1 - local117);
									if (local180 >= 8) {
										local190 = this.anIntArrayArrayArray1[local167][local115][local117] - 240;
										local196 = this.anIntArrayArrayArray1[local145][local115][local117];
										Class30.method416(local115 * 128, local190, local115 * 128, this.aByte2, local121 * 128 + 128, local117 * 128, 1, local196, local1104);
										for (local212 = local145; local212 <= local167; local212++) {
											for (local260 = local117; local260 <= local121; local260++) {
												this.anIntArrayArrayArray2[local212][local115][local260] &= ~local16;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1122][local115][local109] & local1100) != 0) {
									local117 = local115;
									local121 = local115;
									local145 = local1122;
									local167 = local1122;
									while (local117 > 0 && (this.anIntArrayArrayArray2[local1122][local117 - 1][local109] & local1100) != 0) {
										local117--;
									}
									while (local121 < this.anInt49 && (this.anIntArrayArrayArray2[local1122][local121 + 1][local109] & local1100) != 0) {
										local121++;
									}
									label380: while (local145 > 0) {
										for (local180 = local117; local180 <= local121; local180++) {
											if ((this.anIntArrayArrayArray2[local145 - 1][local180][local109] & local1100) == 0) {
												break label380;
											}
										}
										local145--;
									}
									label369: while (local167 < local1104) {
										for (local180 = local117; local180 <= local121; local180++) {
											if ((this.anIntArrayArrayArray2[local167 + 1][local180][local109] & local1100) == 0) {
												break label369;
											}
										}
										local167++;
									}
									local180 = (local167 + 1 - local145) * (local121 + 1 - local117);
									if (local180 >= 8) {
										local190 = this.anIntArrayArrayArray1[local167][local117][local109] - 240;
										local196 = this.anIntArrayArrayArray1[local145][local117][local109];
										Class30.method416(local117 * 128, local190, local121 * 128 + 128, this.aByte2, local109 * 128, local109 * 128, 2, local196, local1104);
										for (local212 = local145; local212 <= local167; local212++) {
											for (local260 = local117; local260 <= local121; local260++) {
												this.anIntArrayArrayArray2[local212][local260][local109] &= ~local1100;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1122][local115][local109] & local1102) != 0) {
									local117 = local115;
									local121 = local115;
									local145 = local109;
									local167 = local109;
									while (local145 > 0 && (this.anIntArrayArrayArray2[local1122][local115][local145 - 1] & local1102) != 0) {
										local145--;
									}
									while (local167 < this.anInt50 && (this.anIntArrayArrayArray2[local1122][local115][local167 + 1] & local1102) != 0) {
										local167++;
									}
									label433: while (local117 > 0) {
										for (local180 = local145; local180 <= local167; local180++) {
											if ((this.anIntArrayArrayArray2[local1122][local117 - 1][local180] & local1102) == 0) {
												break label433;
											}
										}
										local117--;
									}
									label422: while (local121 < this.anInt49) {
										for (local180 = local145; local180 <= local167; local180++) {
											if ((this.anIntArrayArrayArray2[local1122][local121 + 1][local180] & local1102) == 0) {
												break label422;
											}
										}
										local121++;
									}
									if ((local121 + 1 - local117) * (local167 + 1 - local145) >= 4) {
										local180 = this.anIntArrayArrayArray1[local1122][local117][local145];
										Class30.method416(local117 * 128, local180, local121 * 128 + 128, this.aByte2, local167 * 128 + 128, local145 * 128, 4, local180, local1104);
										for (local186 = local117; local186 <= local121; local186++) {
											for (local190 = local145; local190 <= local167; local190++) {
												this.anIntArrayArrayArray2[local1122][local186][local190] &= ~local1102;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1742) RuntimeException local1742) {
			signlink.reporterror("61682, " + arg0 + ", " + false + ", " + arg1 + ", " + local1742.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
