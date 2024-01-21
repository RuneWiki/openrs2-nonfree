import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt78;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
	private static boolean aBoolean24;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt75 = -43626;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt77 = 4;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean23 = true;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray18 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray19 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray21 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt76 = -80;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt80;

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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ec;II[[[IBILclient!ob;IILclient!r;II)V")
	public static void method50(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class33 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(7) int local7 = arg3[arg9][arg6][arg2];
			@Pc(17) int local17 = arg3[arg9][arg6 + 1][arg2];
			@Pc(34) int local34 = arg3[arg9][arg6 + 1][arg2 + 1];
			@Pc(44) int local44 = arg3[arg9][arg6][arg2 + 1];
			@Pc(54) int local54 = local7 + local17 + local34 + local44 >> 2;
			@Pc(57) Class2 local57 = Class2.method23(arg4);
			@Pc(69) int local69 = arg6 + (arg2 << 7) + (arg4 << 14) + 1073741824;
			if (!local57.aBoolean9) {
				local69 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg10 << 6) + arg7);
			@Pc(96) Class1_Sub3_Sub1 local96;
			if (arg7 == 22) {
				local96 = local57.method26(22, arg10, local7, local17, local34, local44, -1);
				arg8.method465(local69, arg6, local96, arg1, local83, local54, arg2);
				if (local57.aBoolean7 && local57.aBoolean9) {
					arg0.method251(arg2, arg6);
				}
				if (local57.anInt42 != -1) {
					arg5.method445(new Class1_Sub6(3, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
				}
			} else {
				@Pc(171) int local171;
				if (arg7 == 10 || arg7 == 11) {
					local96 = local57.method26(10, arg10, local7, local17, local34, local44, -1);
					if (local96 != null) {
						@Pc(158) int local158 = 0;
						if (arg7 == 11) {
							local158 += 256;
						}
						@Pc(174) int local174;
						if (arg10 == 1 || arg10 == 3) {
							local171 = local57.anInt41;
							local174 = local57.anInt40;
						} else {
							local171 = local57.anInt40;
							local174 = local57.anInt41;
						}
						arg8.method469(arg6, local69, local83, local96, null, local171, local158, local174, arg1, arg2, local54);
					}
					if (local57.aBoolean7) {
						arg0.method250(arg6, local57.anInt40, local57.anInt41, arg10, local57.aBoolean8, arg2);
					}
					if (local57.anInt42 != -1) {
						arg5.method445(new Class1_Sub6(2, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
					}
				} else if (arg7 >= 12) {
					local96 = local57.method26(arg7, arg10, local7, local17, local34, local44, -1);
					arg8.method469(arg6, local69, local83, local96, null, 1, 0, 1, arg1, arg2, local54);
					if (local57.aBoolean7) {
						arg0.method250(arg6, local57.anInt40, local57.anInt41, arg10, local57.aBoolean8, arg2);
					}
					if (local57.anInt42 != -1) {
						arg5.method445(new Class1_Sub6(2, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
					}
				} else if (arg7 == 0) {
					local96 = local57.method26(0, arg10, local7, local17, local34, local44, -1);
					arg8.method467(null, 0, arg2, anIntArray18[arg10], arg6, local69, arg1, local83, local54, local96);
					if (local57.aBoolean7) {
						arg0.method249(local57.aBoolean8, arg10, arg6, arg2, arg7);
					}
					if (local57.anInt42 != -1) {
						arg5.method445(new Class1_Sub6(0, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
					}
				} else if (arg7 == 1) {
					local96 = local57.method26(1, arg10, local7, local17, local34, local44, -1);
					arg8.method467(null, 0, arg2, anIntArray19[arg10], arg6, local69, arg1, local83, local54, local96);
					if (local57.aBoolean7) {
						arg0.method249(local57.aBoolean8, arg10, arg6, arg2, arg7);
					}
					if (local57.anInt42 != -1) {
						arg5.method445(new Class1_Sub6(0, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
					}
				} else {
					@Pc(427) int local427;
					@Pc(449) Class1_Sub3_Sub1 local449;
					if (arg7 == 2) {
						local427 = arg10 + 1 & 0x3;
						@Pc(439) Class1_Sub3_Sub1 local439 = local57.method26(2, arg10 + 4, local7, local17, local34, local44, -1);
						local449 = local57.method26(2, local427, local7, local17, local34, local44, -1);
						arg8.method467(local449, anIntArray18[local427], arg2, anIntArray18[arg10], arg6, local69, arg1, local83, local54, local439);
						if (local57.aBoolean7) {
							arg0.method249(local57.aBoolean8, arg10, arg6, arg2, arg7);
						}
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(0, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 3) {
						local96 = local57.method26(3, arg10, local7, local17, local34, local44, -1);
						arg8.method467(null, 0, arg2, anIntArray19[arg10], arg6, local69, arg1, local83, local54, local96);
						if (local57.aBoolean7) {
							arg0.method249(local57.aBoolean8, arg10, arg6, arg2, arg7);
						}
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(0, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 9) {
						local96 = local57.method26(arg7, arg10, local7, local17, local34, local44, -1);
						arg8.method469(arg6, local69, local83, local96, null, 1, 0, 1, arg1, arg2, local54);
						if (local57.aBoolean7) {
							arg0.method250(arg6, local57.anInt40, local57.anInt41, arg10, local57.aBoolean8, arg2);
						}
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(2, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 4) {
						local96 = local57.method26(4, 0, local7, local17, local34, local44, -1);
						arg8.method468(local83, local96, anIntArray18[arg10], arg10 * 512, arg6, 0, local54, 0, arg2, local69, arg1);
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(1, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 5) {
						local427 = 16;
						local171 = arg8.method486(arg1, arg6, arg2);
						if (local171 > 0) {
							local427 = Class2.method23(local171 >> 14 & 0x7FFF).anInt43;
						}
						local449 = local57.method26(4, 0, local7, local17, local34, local44, -1);
						arg8.method468(local83, local449, anIntArray18[arg10], arg10 * 512, arg6, anIntArray20[arg10] * local427, local54, anIntArray21[arg10] * local427, arg2, local69, arg1);
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(1, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 6) {
						local96 = local57.method26(4, 0, local7, local17, local34, local44, -1);
						arg8.method468(local83, local96, 256, arg10, arg6, 0, local54, 0, arg2, local69, arg1);
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(1, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 7) {
						local96 = local57.method26(4, 0, local7, local17, local34, local44, -1);
						arg8.method468(local83, local96, 512, arg10, arg6, 0, local54, 0, arg2, local69, arg1);
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(1, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					} else if (arg7 == 8) {
						local96 = local57.method26(4, 0, local7, local17, local34, local44, -1);
						arg8.method468(local83, local96, 768, arg10, arg6, 0, local54, 0, arg2, local69, arg1);
						if (local57.anInt42 != -1) {
							arg5.method445(new Class1_Sub6(1, arg2, arg1, true, Class19.aClass19Array1[local57.anInt42], anInt77, arg4, arg6));
						}
					}
				}
			}
		} catch (@Pc(899) RuntimeException local899) {
			signlink.reporterror("86285, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local899.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[III[[[B)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			this.anInt79 = arg3;
			this.anInt80 = arg0;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt79][this.anInt80];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt79][this.anInt80];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt79][this.anInt80];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt79][this.anInt80];
			this.anIntArrayArrayArray2 = new int[4][this.anInt79 + 1][this.anInt80 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt79 + 1][this.anInt80 + 1];
			this.anIntArrayArray1 = new int[this.anInt79 + 1][this.anInt80 + 1];
			this.anIntArray13 = new int[this.anInt80];
			this.anIntArray14 = new int[this.anInt80];
			this.anIntArray15 = new int[this.anInt80];
			this.anIntArray16 = new int[this.anInt80];
			this.anIntArray17 = new int[this.anInt80];
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("60306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method36(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) byte local3 = 0;
			for (@Pc(5) int local5 = 0; local5 < Class11.anInt402; local5++) {
				if (Class11.aClass11Array1[local5].aString19.equalsIgnoreCase("water")) {
					local3 = (byte) (local5 + 1);
					break;
				}
			}
			for (@Pc(27) int local27 = arg0; local27 < arg0 + 64; local27++) {
				for (@Pc(31) int local31 = arg1; local31 < arg1 + 64; local31++) {
					if (local31 >= 0 && local31 < this.anInt79 && local27 >= 0 && local27 < this.anInt80) {
						this.aByteArrayArrayArray3[0][local31][local27] = local3;
						for (@Pc(56) int local56 = 0; local56 < 4; local56++) {
							this.anIntArrayArrayArray1[local56][local31][local27] = 0;
							this.aByteArrayArrayArray1[local56][local31][local27] = 0;
						}
					}
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("26858, " + -41617 + ", " + arg0 + ", " + arg1 + ", " + 64 + ", " + 64 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIIII)V")
	public void method37(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(0, arg0);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg2;
						@Pc(27) int local27 = local17 + arg4;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method383();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -method42(local23 + arg3 + 932731, local27 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method383();
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
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method384();
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
								local49 = local7.method383();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method383();
									break;
								}
								if (local49 <= 49) {
									local7.method383();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("74893, " + -503 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BLclient!ob;[Lclient!ec;IILclient!r;)V")
	public void method38(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Class9[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class33 arg5) {
		try {
			@Pc(7) Class1_Sub3_Sub3 local7 = new Class1_Sub3_Sub3(0, arg1);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method397();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method397();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method383();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg0;
					@Pc(68) int local68 = local39 + arg4;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray1[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class9 local95 = null;
						if (local80 >= 0) {
							local95 = arg3[local80];
						}
						this.method39(local13, arg5, local64, arg2, local60, local68, local49, local95, local56, (byte) 8);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("77937, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -31192 + ", " + arg5 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!r;ILclient!ob;IIILclient!ec;IB)V")
	private void method39(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class9 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		try {
			if (aBoolean23) {
				if ((this.aByteArrayArrayArray1[arg6][arg2][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method41(arg6, arg5, arg2) != anInt78) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg6][arg2][arg5];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg6][arg2 + 1][arg5];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg6][arg2 + 1][arg5 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg6][arg2][arg5 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(83) boolean local83 = false;
			@Pc(95) Class2 local95 = Class2.method23(arg0);
			@Pc(107) int local107 = arg2 + (arg5 << 7) + (arg0 << 14) + 1073741824;
			if (!local95.aBoolean9) {
				local107 += Integer.MIN_VALUE;
			}
			@Pc(121) byte local121 = (byte) ((arg4 << 6) + arg8);
			@Pc(143) Class1_Sub3_Sub1 local143;
			if (arg8 != 22) {
				@Pc(220) int local220;
				if (arg8 == 10 || arg8 == 11) {
					local143 = local95.method26(10, arg4, local33, local44, local57, local68, -1);
					if (local143 != null) {
						@Pc(207) int local207 = 0;
						if (arg8 == 11) {
							local207 += 256;
						}
						@Pc(223) int local223;
						if (arg4 == 1 || arg4 == 3) {
							local220 = local95.anInt41;
							local223 = local95.anInt40;
						} else {
							local220 = local95.anInt40;
							local223 = local95.anInt41;
						}
						if (arg1.method469(arg2, local107, local121, local143, null, local220, local207, local223, arg6, arg5, local78) && local95.aBoolean15) {
							for (@Pc(251) int local251 = 0; local251 <= local220; local251++) {
								for (@Pc(255) int local255 = 0; local255 <= local223; local255++) {
									@Pc(262) int local262 = local143.anInt364 / 4;
									if (local262 > 30) {
										local262 = 30;
									}
									if (local262 > this.aByteArrayArrayArray6[arg6][arg2 + local251][arg5 + local255]) {
										this.aByteArrayArrayArray6[arg6][arg2 + local251][arg5 + local255] = (byte) local262;
									}
								}
							}
						}
					}
					if (local95.aBoolean7 && arg7 != null) {
						arg7.method250(arg2, local95.anInt40, local95.anInt41, arg4, local95.aBoolean8, arg5);
					}
					if (local95.anInt42 != -1) {
						arg3.method445(new Class1_Sub6(2, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
					}
				} else if (arg8 >= 12) {
					local143 = local95.method26(arg8, arg4, local33, local44, local57, local68, -1);
					arg1.method469(arg2, local107, local121, local143, null, 1, 0, 1, arg6, arg5, local78);
					if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg6 > 0) {
						this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x924;
					}
					if (local95.aBoolean7 && arg7 != null) {
						arg7.method250(arg2, local95.anInt40, local95.anInt41, arg4, local95.aBoolean8, arg5);
					}
					if (local95.anInt42 != -1) {
						arg3.method445(new Class1_Sub6(2, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
					}
				} else if (arg8 == 0) {
					local143 = local95.method26(0, arg4, local33, local44, local57, local68, -1);
					arg1.method467(null, 0, arg5, anIntArray18[arg4], arg2, local107, arg6, local121, local78, local143);
					if (arg4 == 0) {
						if (local95.aBoolean15) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
						}
						if (local95.aBoolean12) {
							this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x249;
						}
					} else if (arg4 == 1) {
						if (local95.aBoolean15) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						}
						if (local95.aBoolean12) {
							this.anIntArrayArrayArray2[arg6][arg2][arg5 + 1] |= 0x492;
						}
					} else if (arg4 == 2) {
						if (local95.aBoolean15) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						}
						if (local95.aBoolean12) {
							this.anIntArrayArrayArray2[arg6][arg2 + 1][arg5] |= 0x249;
						}
					} else if (arg4 == 3) {
						if (local95.aBoolean15) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
						}
						if (local95.aBoolean12) {
							this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x492;
						}
					}
					if (local95.aBoolean7 && arg7 != null) {
						arg7.method249(local95.aBoolean8, arg4, arg2, arg5, arg8);
					}
					if (local95.anInt42 != -1) {
						arg3.method445(new Class1_Sub6(0, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
					}
					if (local95.anInt43 != 16) {
						arg1.method476(local95.anInt43, arg5, arg6, arg2, (byte) 4);
					}
				} else if (arg8 == 1) {
					local143 = local95.method26(1, arg4, local33, local44, local57, local68, -1);
					arg1.method467(null, 0, arg5, anIntArray19[arg4], arg2, local107, arg6, local121, local78, local143);
					if (local95.aBoolean15) {
						if (arg4 == 0) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
						} else if (arg4 == 1) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
						} else if (arg4 == 2) {
							this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
						} else if (arg4 == 3) {
							this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
						}
					}
					if (local95.aBoolean7 && arg7 != null) {
						arg7.method249(local95.aBoolean8, arg4, arg2, arg5, arg8);
					}
					if (local95.anInt42 != -1) {
						arg3.method445(new Class1_Sub6(0, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
					}
				} else {
					@Pc(821) int local821;
					@Pc(843) Class1_Sub3_Sub1 local843;
					if (arg8 == 2) {
						local821 = arg4 + 1 & 0x3;
						@Pc(833) Class1_Sub3_Sub1 local833 = local95.method26(2, arg4 + 4, local33, local44, local57, local68, -1);
						local843 = local95.method26(2, local821, local33, local44, local57, local68, -1);
						arg1.method467(local843, anIntArray18[local821], arg5, anIntArray18[arg4], arg2, local107, arg6, local121, local78, local833);
						if (local95.aBoolean12) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x249;
								this.anIntArrayArrayArray2[arg6][arg2][arg5 + 1] |= 0x492;
							} else if (arg4 == 1) {
								this.anIntArrayArrayArray2[arg6][arg2][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg6][arg2 + 1][arg5] |= 0x249;
							} else if (arg4 == 2) {
								this.anIntArrayArrayArray2[arg6][arg2 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x492;
							} else if (arg4 == 3) {
								this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x492;
								this.anIntArrayArrayArray2[arg6][arg2][arg5] |= 0x249;
							}
						}
						if (local95.aBoolean7 && arg7 != null) {
							arg7.method249(local95.aBoolean8, arg4, arg2, arg5, arg8);
						}
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(0, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
						if (local95.anInt43 != 16) {
							arg1.method476(local95.anInt43, arg5, arg6, arg2, (byte) 4);
						}
					} else if (arg8 == 3) {
						local143 = local95.method26(3, arg4, local33, local44, local57, local68, -1);
						arg1.method467(null, 0, arg5, anIntArray19[arg4], arg2, local107, arg6, local121, local78, local143);
						if (local95.aBoolean15) {
							if (arg4 == 0) {
								this.aByteArrayArrayArray6[arg6][arg2][arg5 + 1] = 50;
							} else if (arg4 == 1) {
								this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5 + 1] = 50;
							} else if (arg4 == 2) {
								this.aByteArrayArrayArray6[arg6][arg2 + 1][arg5] = 50;
							} else if (arg4 == 3) {
								this.aByteArrayArrayArray6[arg6][arg2][arg5] = 50;
							}
						}
						if (local95.aBoolean7 && arg7 != null) {
							arg7.method249(local95.aBoolean8, arg4, arg2, arg5, arg8);
						}
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(0, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 9) {
						local143 = local95.method26(arg8, arg4, local33, local44, local57, local68, -1);
						arg1.method469(arg2, local107, local121, local143, null, 1, 0, 1, arg6, arg5, local78);
						if (local95.aBoolean7 && arg7 != null) {
							arg7.method250(arg2, local95.anInt40, local95.anInt41, arg4, local95.aBoolean8, arg5);
						}
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(2, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 4) {
						local143 = local95.method26(4, 0, local33, local44, local57, local68, -1);
						arg1.method468(local121, local143, anIntArray18[arg4], arg4 * 512, arg2, 0, local78, 0, arg5, local107, arg6);
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(1, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 5) {
						local821 = 16;
						local220 = arg1.method486(arg6, arg2, arg5);
						if (local220 > 0) {
							local821 = Class2.method23(local220 >> 14 & 0x7FFF).anInt43;
						}
						local843 = local95.method26(4, 0, local33, local44, local57, local68, -1);
						arg1.method468(local121, local843, anIntArray18[arg4], arg4 * 512, arg2, anIntArray20[arg4] * local821, local78, anIntArray21[arg4] * local821, arg5, local107, arg6);
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(1, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 6) {
						local143 = local95.method26(4, 0, local33, local44, local57, local68, -1);
						arg1.method468(local121, local143, 256, arg4, arg2, 0, local78, 0, arg5, local107, arg6);
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(1, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 7) {
						local143 = local95.method26(4, 0, local33, local44, local57, local68, -1);
						arg1.method468(local121, local143, 512, arg4, arg2, 0, local78, 0, arg5, local107, arg6);
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(1, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					} else if (arg8 == 8) {
						local143 = local95.method26(4, 0, local33, local44, local57, local68, -1);
						arg1.method468(local121, local143, 768, arg4, arg2, 0, local78, 0, arg5, local107, arg6);
						if (local95.anInt42 != -1) {
							arg3.method445(new Class1_Sub6(1, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
						}
					}
				}
			} else if (!aBoolean23 || local95.aBoolean9 || local95.aBoolean16) {
				local143 = local95.method26(22, arg4, local33, local44, local57, local68, -1);
				arg1.method465(local107, arg2, local143, arg6, local121, local78, arg5);
				if (local95.aBoolean7 && local95.aBoolean9 && arg7 != null) {
					arg7.method251(arg5, arg2);
				}
				if (local95.anInt42 != -1) {
					arg3.method445(new Class1_Sub6(3, arg5, arg6, true, Class19.aClass19Array1[local95.anInt42], anInt77, arg0, arg2));
				}
			}
		} catch (@Pc(1499) RuntimeException local1499) {
			signlink.reporterror("25159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;B[Lclient!ec;)V")
	public void method40(@OriginalArg(0) Class33 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class9[] arg2) {
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
								arg2[local27].method251(local11, local7);
							}
						}
					}
				}
			}
			@Pc(66) boolean local66 = false;
			@Pc(103) int local103;
			@Pc(109) int local109;
			@Pc(111) int local111;
			@Pc(115) int local115;
			@Pc(139) int local139;
			@Pc(161) int local161;
			@Pc(174) int local174;
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(190) int local190;
			@Pc(206) int local206;
			@Pc(254) int local254;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(78) byte[][] local78 = this.aByteArrayArrayArray6[local7];
				local103 = (int) Math.sqrt((double) 5100);
				local109 = local103 * 768 >> 8;
				for (local111 = 1; local111 < this.anInt80 - 1; local111++) {
					for (local115 = 1; local115 < this.anInt79 - 1; local115++) {
						local139 = this.anIntArrayArrayArray1[local7][local115 + 1][local111] - this.anIntArrayArrayArray1[local7][local115 - 1][local111];
						local161 = this.anIntArrayArrayArray1[local7][local115][local111 + 1] - this.anIntArrayArrayArray1[local7][local115][local111 - 1];
						local174 = (int) Math.sqrt((double) (local139 * local139 + local161 * local161 + 65536));
						local180 = (local139 << 8) / local174;
						local184 = 65536 / local174;
						local190 = (local161 << 8) / local174;
						local206 = (local180 * -50 + local184 * -10 + local190 * -50) / local109 + 96;
						local254 = (local78[local115 - 1][local111] >> 2) + (local78[local115 + 1][local111] >> 3) + (local78[local115][local111 - 1] >> 2) + (local78[local115][local111 + 1] >> 3) + (local78[local115][local111] >> 1);
						this.anIntArrayArray1[local115][local111] = local206 - local254;
					}
				}
				for (local115 = 0; local115 < this.anInt80; local115++) {
					this.anIntArray13[local115] = 0;
					this.anIntArray14[local115] = 0;
					this.anIntArray15[local115] = 0;
					this.anIntArray16[local115] = 0;
					this.anIntArray17[local115] = 0;
				}
				for (local139 = -5; local139 < this.anInt79 + 5; local139++) {
					for (local161 = 0; local161 < this.anInt80; local161++) {
						local174 = local139 + 5;
						@Pc(389) int local389;
						if (local174 >= 0 && local174 < this.anInt79) {
							local180 = this.aByteArrayArrayArray2[local7][local174][local161] & 0xFF;
							if (local180 > 0) {
								@Pc(348) Class11 local348 = Class11.aClass11Array1[local180 - 1];
								this.anIntArray13[local161] += local348.anInt408;
								this.anIntArray14[local161] += local348.anInt406;
								this.anIntArray15[local161] += local348.anInt407;
								this.anIntArray16[local161] += local348.anInt409;
								local389 = this.anIntArray17[local161]++;
							}
						}
						local180 = local139 - 5;
						if (local180 >= 0 && local180 < this.anInt79) {
							local184 = this.aByteArrayArrayArray2[local7][local180][local161] & 0xFF;
							if (local184 > 0) {
								@Pc(421) Class11 local421 = Class11.aClass11Array1[local184 - 1];
								this.anIntArray13[local161] -= local421.anInt408;
								this.anIntArray14[local161] -= local421.anInt406;
								this.anIntArray15[local161] -= local421.anInt407;
								this.anIntArray16[local161] -= local421.anInt409;
								local389 = this.anIntArray17[local161]--;
							}
						}
					}
					if (local139 >= 1 && local139 < this.anInt79 - 1) {
						local174 = 0;
						local180 = 0;
						local184 = 0;
						local190 = 0;
						local206 = 0;
						for (local254 = -5; local254 < this.anInt80 + 5; local254++) {
							@Pc(497) int local497 = local254 + 5;
							if (local497 >= 0 && local497 < this.anInt80) {
								local174 += this.anIntArray13[local497];
								local180 += this.anIntArray14[local497];
								local184 += this.anIntArray15[local497];
								local190 += this.anIntArray16[local497];
								local206 += this.anIntArray17[local497];
							}
							@Pc(542) int local542 = local254 - 5;
							if (local542 >= 0 && local542 < this.anInt80) {
								local174 -= this.anIntArray13[local542];
								local180 -= this.anIntArray14[local542];
								local184 -= this.anIntArray15[local542];
								local190 -= this.anIntArray16[local542];
								local206 -= this.anIntArray17[local542];
							}
							if (local254 >= 1 && local254 < this.anInt80 - 1 && (!aBoolean23 || (this.aByteArrayArrayArray1[local7][local139][local254] & 0x10) == 0 && this.method41(local7, local254, local139) == anInt78)) {
								@Pc(625) int local625 = this.aByteArrayArrayArray2[local7][local139][local254] & 0xFF;
								@Pc(636) int local636 = this.aByteArrayArrayArray3[local7][local139][local254] & 0xFF;
								if (local625 > 0 || local636 > 0) {
									@Pc(649) int local649 = this.anIntArrayArrayArray1[local7][local139][local254];
									@Pc(660) int local660 = this.anIntArrayArrayArray1[local7][local139 + 1][local254];
									@Pc(673) int local673 = this.anIntArrayArrayArray1[local7][local139 + 1][local254 + 1];
									@Pc(684) int local684 = this.anIntArrayArrayArray1[local7][local139][local254 + 1];
									@Pc(691) int local691 = this.anIntArrayArray1[local139][local254];
									@Pc(700) int local700 = this.anIntArrayArray1[local139 + 1][local254];
									@Pc(711) int local711 = this.anIntArrayArray1[local139 + 1][local254 + 1];
									@Pc(720) int local720 = this.anIntArrayArray1[local139][local254 + 1];
									@Pc(722) int local722 = -1;
									if (local625 > 0) {
										local722 = this.method49(local174 * 256 / local190, local180 / local206, local184 / local206);
									}
									if (local7 > 0) {
										@Pc(742) boolean local742 = true;
										if (local625 == 0 && this.aByteArrayArrayArray4[local7][local139][local254] != 0) {
											local742 = false;
										}
										if (local636 > 0 && !Class11.aClass11Array1[local636 - 1].aBoolean88) {
											local742 = false;
										}
										if (local742 && local649 == local660 && local649 == local673 && local649 == local684) {
											this.anIntArrayArrayArray2[local7][local139][local254] |= 0x924;
										}
									}
									@Pc(791) int local791 = 0;
									if (local722 != -1) {
										local791 = Class1_Sub3_Sub2_Sub1.anIntArray142[method47(local722, 96)];
									}
									if (local636 == 0) {
										arg0.method464(local7, local139, local254, 0, 0, -1, local649, local660, local673, local684, method47(local722, local691), method47(local722, local700), method47(local722, local711), method47(local722, local720), 0, 0, 0, 0, local791, 0);
									} else {
										@Pc(845) int local845 = this.aByteArrayArrayArray4[local7][local139][local254] + 1;
										@Pc(854) byte local854 = this.aByteArrayArrayArray5[local7][local139][local254];
										@Pc(860) Class11 local860 = Class11.aClass11Array1[local636 - 1];
										@Pc(863) int local863 = local860.anInt404;
										@Pc(871) int local871;
										@Pc(869) int local869;
										if (local863 >= 0) {
											local869 = Class1_Sub3_Sub2_Sub1.method291(local863);
											local871 = -1;
										} else if (local860.anInt403 == 16711935) {
											local869 = 0;
											local871 = -2;
											local863 = -1;
										} else {
											local871 = this.method49(local860.anInt405, local860.anInt406, local860.anInt407);
											local869 = Class1_Sub3_Sub2_Sub1.anIntArray142[this.method48(local871, 96)];
										}
										arg0.method464(local7, local139, local254, local845, local854, local863, local649, local660, local673, local684, method47(local722, local691), method47(local722, local700), method47(local722, local711), method47(local722, local720), this.method48(local871, local691), this.method48(local871, local700), this.method48(local871, local711), this.method48(local871, local720), local791, local869);
									}
								}
							}
						}
					}
				}
				for (local161 = 1; local161 < this.anInt80 - 1; local161++) {
					for (local174 = 1; local174 < this.anInt79 - 1; local174++) {
						arg0.method463(local7, local174, local161, this.method41(local7, local161, local174));
					}
				}
			}
			if (!aBoolean24) {
				arg0.method491();
			}
			for (local11 = 0; local11 < this.anInt79; local11++) {
				for (local27 = 0; local27 < this.anInt80; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method461(local11, local27);
					}
				}
			}
			if (!aBoolean24) {
				local27 = 1;
				@Pc(1046) int local1046 = 2;
				@Pc(1048) int local1048 = 4;
				for (@Pc(1050) int local1050 = 0; local1050 < 4; local1050++) {
					if (local1050 > 0) {
						local27 <<= 0x3;
						local1046 <<= 0x3;
						local1048 <<= 0x3;
					}
					for (@Pc(1068) int local1068 = 0; local1068 <= local1050; local1068++) {
						for (local103 = 0; local103 <= this.anInt80; local103++) {
							for (local109 = 0; local109 <= this.anInt79; local109++) {
								if ((this.anIntArrayArrayArray2[local1068][local109][local103] & local27) != 0) {
									local111 = local103;
									local115 = local103;
									local139 = local1068;
									local161 = local1068;
									while (local111 > 0 && (this.anIntArrayArrayArray2[local1068][local109][local111 - 1] & local27) != 0) {
										local111--;
									}
									while (local115 < this.anInt80 && (this.anIntArrayArrayArray2[local1068][local109][local115 + 1] & local27) != 0) {
										local115++;
									}
									label309: while (local139 > 0) {
										for (local174 = local111; local174 <= local115; local174++) {
											if ((this.anIntArrayArrayArray2[local139 - 1][local109][local174] & local27) == 0) {
												break label309;
											}
										}
										local139--;
									}
									label298: while (local161 < local1050) {
										for (local174 = local111; local174 <= local115; local174++) {
											if ((this.anIntArrayArrayArray2[local161 + 1][local109][local174] & local27) == 0) {
												break label298;
											}
										}
										local161++;
									}
									local174 = (local161 + 1 - local139) * (local115 + 1 - local111);
									if (local174 >= 8) {
										local184 = this.anIntArrayArrayArray1[local161][local109][local111] - 240;
										local190 = this.anIntArrayArrayArray1[local139][local109][local111];
										Class33.method462(local115 * 128 + 128, local111 * 128, local109 * 128, local1050, local184, local190, local109 * 128, 1);
										for (local206 = local139; local206 <= local161; local206++) {
											for (local254 = local111; local254 <= local115; local254++) {
												this.anIntArrayArrayArray2[local206][local109][local254] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1068][local109][local103] & local1046) != 0) {
									local111 = local109;
									local115 = local109;
									local139 = local1068;
									local161 = local1068;
									while (local111 > 0 && (this.anIntArrayArrayArray2[local1068][local111 - 1][local103] & local1046) != 0) {
										local111--;
									}
									while (local115 < this.anInt79 && (this.anIntArrayArrayArray2[local1068][local115 + 1][local103] & local1046) != 0) {
										local115++;
									}
									label362: while (local139 > 0) {
										for (local174 = local111; local174 <= local115; local174++) {
											if ((this.anIntArrayArrayArray2[local139 - 1][local174][local103] & local1046) == 0) {
												break label362;
											}
										}
										local139--;
									}
									label351: while (local161 < local1050) {
										for (local174 = local111; local174 <= local115; local174++) {
											if ((this.anIntArrayArrayArray2[local161 + 1][local174][local103] & local1046) == 0) {
												break label351;
											}
										}
										local161++;
									}
									local174 = (local161 + 1 - local139) * (local115 + 1 - local111);
									if (local174 >= 8) {
										local184 = this.anIntArrayArrayArray1[local161][local111][local103] - 240;
										local190 = this.anIntArrayArrayArray1[local139][local111][local103];
										Class33.method462(local103 * 128, local103 * 128, local115 * 128 + 128, local1050, local184, local190, local111 * 128, 2);
										for (local206 = local139; local206 <= local161; local206++) {
											for (local254 = local111; local254 <= local115; local254++) {
												this.anIntArrayArrayArray2[local206][local254][local103] &= ~local1046;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1068][local109][local103] & local1048) != 0) {
									local111 = local109;
									local115 = local109;
									local139 = local103;
									local161 = local103;
									while (local139 > 0 && (this.anIntArrayArrayArray2[local1068][local109][local139 - 1] & local1048) != 0) {
										local139--;
									}
									while (local161 < this.anInt80 && (this.anIntArrayArrayArray2[local1068][local109][local161 + 1] & local1048) != 0) {
										local161++;
									}
									label415: while (local111 > 0) {
										for (local174 = local139; local174 <= local161; local174++) {
											if ((this.anIntArrayArrayArray2[local1068][local111 - 1][local174] & local1048) == 0) {
												break label415;
											}
										}
										local111--;
									}
									label404: while (local115 < this.anInt79) {
										for (local174 = local139; local174 <= local161; local174++) {
											if ((this.anIntArrayArrayArray2[local1068][local115 + 1][local174] & local1048) == 0) {
												break label404;
											}
										}
										local115++;
									}
									if ((local115 + 1 - local111) * (local161 + 1 - local139) >= 4) {
										local174 = this.anIntArrayArrayArray1[local1068][local111][local139];
										Class33.method462(local161 * 128 + 128, local139 * 128, local115 * 128 + 128, local1050, local174, local174, local111 * 128, 4);
										for (local180 = local111; local180 <= local115; local180++) {
											for (local184 = local139; local184 <= local161; local184++) {
												this.anIntArrayArrayArray2[local1068][local180][local184] &= ~local1048;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1683) RuntimeException local1683) {
			signlink.reporterror("53660, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1683.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("19445, " + -80 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
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
