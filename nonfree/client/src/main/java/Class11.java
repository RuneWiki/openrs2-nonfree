import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EZVBBZYG")
public final class Class11 {

	@OriginalMember(owner = "client!EZVBBZYG", name = "n", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "[I")
	private static final int[] anIntArray72 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!EZVBBZYG", name = "h", descriptor = "[I")
	private static final int[] anIntArray73 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!EZVBBZYG", name = "j", descriptor = "I")
	private static int anInt210 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!EZVBBZYG", name = "l", descriptor = "Z")
	public static boolean aBoolean60 = true;

	@OriginalMember(owner = "client!EZVBBZYG", name = "q", descriptor = "I")
	private static int anInt212 = 279;

	@OriginalMember(owner = "client!EZVBBZYG", name = "r", descriptor = "I")
	private static int anInt213 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!EZVBBZYG", name = "s", descriptor = "[I")
	private static final int[] anIntArray74 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!EZVBBZYG", name = "B", descriptor = "I")
	private static int anInt215 = -828;

	@OriginalMember(owner = "client!EZVBBZYG", name = "C", descriptor = "I")
	private static int anInt216 = 4;

	@OriginalMember(owner = "client!EZVBBZYG", name = "D", descriptor = "I")
	public static int anInt217 = 99;

	@OriginalMember(owner = "client!EZVBBZYG", name = "G", descriptor = "[I")
	private static final int[] anIntArray80 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!EZVBBZYG", name = "d", descriptor = "I")
	private int anInt209 = -949;

	@OriginalMember(owner = "client!EZVBBZYG", name = "g", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!EZVBBZYG", name = "k", descriptor = "B")
	private byte aByte6 = 7;

	@OriginalMember(owner = "client!EZVBBZYG", name = "y", descriptor = "I")
	private int anInt214 = 486;

	@OriginalMember(owner = "client!EZVBBZYG", name = "E", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!EZVBBZYG", name = "F", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!EZVBBZYG", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!EZVBBZYG", name = "f", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!EZVBBZYG", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!EZVBBZYG", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!EZVBBZYG", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!EZVBBZYG", name = "A", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!EZVBBZYG", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!EZVBBZYG", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!EZVBBZYG", name = "t", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!EZVBBZYG", name = "u", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!EZVBBZYG", name = "v", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!EZVBBZYG", name = "w", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!EZVBBZYG", name = "x", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II)I")
	private static int method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(I[[[IZIIILclient!CRVZDSLK;IILclient!RHXAQRFP;I)V")
	public static void method165(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg3][arg9][arg6];
			@Pc(19) int local19 = arg1[arg3][arg9 + 1][arg6];
			@Pc(31) int local31 = arg1[arg3][arg9 + 1][arg6 + 1];
			@Pc(41) int local41 = arg1[arg3][arg9][arg6 + 1];
			@Pc(55) int local55 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class24 local58 = Class24.method307(arg7);
			@Pc(70) int local70 = arg9 + (arg6 << 7) + (arg7 << 14) + 1073741824;
			if (!local58.aBoolean96) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg4);
			@Pc(104) Class2_Sub1_Sub1 local104;
			if (arg4 == 22) {
				if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
					local104 = local58.method317(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, 22, true, arg7, local31, false);
				}
				arg8.method382(local104, arg6, arg2, local70, arg9, local84, local55);
				if (local58.aBoolean91 && local58.aBoolean96) {
					arg5.method23(arg9, anInt216, arg6);
				}
			} else {
				@Pc(200) int local200;
				if (arg4 == 10 || arg4 == 11) {
					if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
						local104 = local58.method317(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, 10, true, arg7, local31, false);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg4 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg0 == 1 || arg0 == 3) {
							local200 = local58.anInt314;
							local203 = local58.anInt306;
						} else {
							local200 = local58.anInt306;
							local203 = local58.anInt314;
						}
						arg8.method386(local203, local104, local200, local70, local55, local187, local84, arg2, arg6, arg9);
					}
					if (local58.aBoolean91) {
						arg5.method22(arg9, arg0, local58.anInt306, local58.anInt314, local58.aBoolean95, arg6);
					}
				} else if (arg4 >= 12) {
					if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
						local104 = local58.method317(arg4, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, arg4, true, arg7, local31, false);
					}
					arg8.method386(1, local104, 1, local70, local55, 0, local84, arg2, arg6, arg9);
					if (local58.aBoolean91) {
						arg5.method22(arg9, arg0, local58.anInt306, local58.anInt314, local58.aBoolean95, arg6);
					}
				} else if (arg4 == 0) {
					if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
						local104 = local58.method317(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, 0, true, arg7, local31, false);
					}
					arg8.method384(arg2, 0, arg6, null, anIntArray72[arg0], local55, local70, local104, local84, arg9);
					if (local58.aBoolean91) {
						arg5.method21(arg0, local58.aBoolean95, arg6, arg4, arg9);
					}
				} else if (arg4 == 1) {
					if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
						local104 = local58.method317(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, 1, true, arg7, local31, false);
					}
					arg8.method384(arg2, 0, arg6, null, anIntArray74[arg0], local55, local70, local104, local84, arg9);
					if (local58.aBoolean91) {
						arg5.method21(arg0, local58.aBoolean95, arg6, arg4, arg9);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class2_Sub1_Sub1 local475;
					if (arg4 == 2) {
						local446 = arg0 + 1 & 0x3;
						@Pc(465) Class2_Sub1_Sub1 local465;
						if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
							local465 = local58.method317(2, arg0 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method317(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0 + 4, local9, 2, true, arg7, local31, false);
							local475 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, local446, local9, 2, true, arg7, local31, false);
						}
						arg8.method384(arg2, anIntArray72[local446], arg6, local475, anIntArray72[arg0], local55, local70, local465, local84, arg9);
						if (local58.aBoolean91) {
							arg5.method21(arg0, local58.aBoolean95, arg6, arg4, arg9);
						}
					} else if (arg4 == 3) {
						if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
							local104 = local58.method317(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, 3, true, arg7, local31, false);
						}
						arg8.method384(arg2, 0, arg6, null, anIntArray74[arg0], local55, local70, local104, local84, arg9);
						if (local58.aBoolean91) {
							arg5.method21(arg0, local58.aBoolean95, arg6, arg4, arg9);
						}
					} else if (arg4 == 9) {
						if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
							local104 = local58.method317(arg4, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, arg0, local9, arg4, true, arg7, local31, false);
						}
						arg8.method386(1, local104, 1, local70, local55, 0, local84, arg2, arg6, arg9);
						if (local58.aBoolean91) {
							arg5.method22(arg9, arg0, local58.anInt306, local58.anInt314, local58.aBoolean95, arg6);
						}
					} else {
						if (local58.aBoolean102) {
							if (arg0 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg0 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg0 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg4 == 4) {
							if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
								local104 = local58.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, 0, local9, 4, true, arg7, local31, false);
							}
							arg8.method385(local55, local104, 0, arg6, anIntArray72[arg0], local84, 0, local70, arg2, arg0 * 512, arg9);
						} else if (arg4 == 5) {
							local446 = 16;
							local200 = arg8.method402(arg2, arg9, arg6);
							if (local200 > 0) {
								local446 = Class24.method307(local200 >> 14 & 0x7FFF).anInt302;
							}
							if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
								local475 = local58.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, 0, local9, 4, true, arg7, local31, false);
							}
							arg8.method385(local55, local475, anIntArray80[arg0] * local446, arg6, anIntArray72[arg0], local84, anIntArray73[arg0] * local446, local70, arg2, arg0 * 512, arg9);
						} else if (arg4 == 6) {
							if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
								local104 = local58.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, 0, local9, 4, true, arg7, local31, false);
							}
							arg8.method385(local55, local104, 0, arg6, 256, local84, 0, local70, arg2, arg0, arg9);
						} else if (arg4 == 7) {
							if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
								local104 = local58.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, 0, local9, 4, true, arg7, local31, false);
							}
							arg8.method385(local55, local104, 0, arg6, 512, local84, 0, local70, arg2, arg0, arg9);
						} else if (arg4 == 8) {
							if (local58.anInt313 == -1 && local58.anIntArray96 == null) {
								local104 = local58.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(local19, local58.anInt313, local41, 0, local9, 4, true, arg7, local31, false);
							}
							arg8.method385(local55, local104, 0, arg6, 768, local84, 0, local70, arg2, arg0, arg9);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("83250, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(III)I")
	private static int method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method170(local3, local13);
		@Pc(29) int local29 = method170(local3 + 1, local13);
		@Pc(35) int local35 = method170(local3, local13 + 1);
		@Pc(43) int local43 = method170(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method171(local23, local29, local9, arg2);
		@Pc(55) int local55 = method171(local35, local43, local9, arg2);
		return method171(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(Lclient!EBLTOQBO;BLclient!LBBVYYXO;)V")
	public static void method168(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = -1;
			while (true) {
				@Pc(20) int local20 = arg2.method281();
				if (local20 == 0) {
					return;
				}
				local17 += local20;
				@Pc(29) Class24 local29 = Class24.method307(local17);
				local29.method316((byte) 1, arg0);
				while (true) {
					@Pc(36) int local36 = arg2.method281();
					if (local36 == 0) {
						break;
					}
					arg2.method267();
				}
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("55070, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(II)I")
	private static int method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method173(arg0 - 1, arg1 - 1) + method173(arg0 + 1, arg1 - 1) + method173(arg0 - 1, arg1 + 1) + method173(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method173(arg0 - 1, arg1) + method173(arg0 + 1, arg1) + method173(arg0, arg1 - 1) + method173(arg0, arg1 + 1);
		@Pc(59) int local59 = method173(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIII)I")
	private static int method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub2_Sub1.anIntArray8[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(III)Z")
	public static boolean method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class24 local2 = Class24.method307(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method308(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("54561, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "(II)I")
	private static int method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II[BI)Z")
	public static boolean method174(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class2_Sub1_Sub3 local9 = new Class2_Sub1_Sub3((byte) 114, arg1);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method281();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method281();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method267() >> 2;
						@Pc(72) int local72 = local63 + arg0;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class24 local89 = Class24.method307(local11);
							if (local68 != 22 || !aBoolean60 || local89.aBoolean96 || local89.aBoolean97) {
								local3 &= local89.method315(anInt212);
								local30 = true;
							}
						}
					}
					local35 = local9.method281();
					if (local35 == 0) {
						break;
					}
					local9.method267();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("91056, " + arg0 + ", " + -482 + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "d", descriptor = "(II)I")
	private static int method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method166(arg0 + 45365, arg1 + 91923, 4) + (method166(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method166(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "<init>", descriptor = "([[[BI[[[III)V")
	public Class11(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt217 = 99;
			this.anInt218 = arg3;
			this.anInt219 = arg1;
			this.anIntArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray3 = arg0;
			if (arg4 >= 0) {
				throw new NullPointerException();
			}
			this.aByteArrayArrayArray2 = new byte[4][this.anInt218][this.anInt219];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt218][this.anInt219];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt218][this.anInt219];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt218][this.anInt219];
			this.anIntArrayArrayArray2 = new int[4][this.anInt218 + 1][this.anInt219 + 1];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt218 + 1][this.anInt219 + 1];
			this.anIntArrayArray11 = new int[this.anInt218 + 1][this.anInt219 + 1];
			this.anIntArray75 = new int[this.anInt219];
			this.anIntArray76 = new int[this.anInt219];
			this.anIntArray77 = new int[this.anInt219];
			this.anIntArray78 = new int[this.anInt219];
			this.anIntArray79 = new int[this.anInt219];
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("27597, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "([Lclient!CRVZDSLK;IIIIIBI[BLclient!RHXAQRFP;I)V")
	public void method163(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3((byte) 114, arg7);
			@Pc(9) int local9 = -1;
			@Pc(15) int local15;
			if (this.aByte6 != 7) {
				for (local15 = 1; local15 > 0; local15++) {
				}
			}
			while (true) {
				local15 = local7.method281();
				if (local15 == 0) {
					return;
				}
				local9 += local15;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local7.method281();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local7.method267();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					if (local56 == arg4 && local52 >= arg2 && local52 < arg2 + 8 && local46 >= arg9 && local46 < arg9 + 8) {
						@Pc(89) Class24 local89 = Class24.method307(local9);
						@Pc(106) int local106 = arg1 + Class21.method251(local52 & 0x7, local89.anInt314, local46 & 0x7, arg6, local89.anInt306, local67);
						@Pc(123) int local123 = arg3 + Class21.method252(arg6, local46 & 0x7, local67, local52 & 0x7, local89.anInt314, local89.anInt306);
						if (local106 > 0 && local123 > 0 && local106 < 103 && local123 < 103) {
							@Pc(135) int local135 = arg5;
							if ((this.aByteArrayArrayArray3[1][local106][local123] & 0x2) == 2) {
								local135 = arg5 - 1;
							}
							@Pc(150) Class5 local150 = null;
							if (local135 >= 0) {
								local150 = arg0[local135];
							}
							this.method164(local67 + arg6 & 0x3, local106, local9, local150, local123, arg5, arg8, local63);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("5894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 7 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IBIILclient!CRVZDSLK;IILclient!RHXAQRFP;I)V")
	private void method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class34 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean60 && (this.aByteArrayArrayArray3[0][arg1][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg5][arg1][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method182(arg1, arg4, arg5) != anInt211) {
					return;
				}
			}
			if (arg5 < anInt217) {
				anInt217 = arg5;
			}
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg5][arg1][arg4];
			@Pc(71) int local71 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg4];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg4 + 1];
			@Pc(95) int local95 = this.anIntArrayArrayArray1[arg5][arg1][arg4 + 1];
			@Pc(105) int local105 = local60 + local71 + local84 + local95 >> 2;
			@Pc(108) Class24 local108 = Class24.method307(arg2);
			@Pc(120) int local120 = arg1 + (arg4 << 7) + (arg2 << 14) + 1073741824;
			if (!local108.aBoolean96) {
				local120 += Integer.MIN_VALUE;
			}
			@Pc(134) byte local134 = (byte) ((arg0 << 6) + arg7);
			@Pc(163) Class2_Sub1_Sub1 local163;
			if (arg7 != 22) {
				@Pc(261) int local261;
				if (arg7 == 10 || arg7 == 11) {
					if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
						local163 = local108.method317(10, arg0, local60, local71, local84, local95, -1);
					} else {
						local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, 10, true, arg2, local84, false);
					}
					if (local163 != null) {
						@Pc(248) int local248 = 0;
						if (arg7 == 11) {
							local248 += 256;
						}
						@Pc(264) int local264;
						if (arg0 == 1 || arg0 == 3) {
							local261 = local108.anInt314;
							local264 = local108.anInt306;
						} else {
							local261 = local108.anInt306;
							local264 = local108.anInt314;
						}
						if (arg6.method386(local264, local163, local261, local120, local105, local248, local134, arg5, arg4, arg1) && local108.aBoolean92) {
							@Pc(295) Class2_Sub1_Sub1_Sub2 local295;
							if (local163 instanceof Class2_Sub1_Sub1_Sub2) {
								local295 = (Class2_Sub1_Sub1_Sub2) local163;
							} else {
								local295 = local108.method317(10, arg0, local60, local71, local84, local95, -1);
							}
							if (local295 != null) {
								for (@Pc(311) int local311 = 0; local311 <= local261; local311++) {
									for (@Pc(315) int local315 = 0; local315 <= local264; local315++) {
										@Pc(322) int local322 = local295.anInt104 / 4;
										if (local322 > 30) {
											local322 = 30;
										}
										if (local322 > this.aByteArrayArrayArray1[arg5][arg1 + local311][arg4 + local315]) {
											this.aByteArrayArrayArray1[arg5][arg1 + local311][arg4 + local315] = (byte) local322;
										}
									}
								}
							}
						}
					}
					if (local108.aBoolean91 && arg3 != null) {
						arg3.method22(arg1, arg0, local108.anInt306, local108.anInt314, local108.aBoolean95, arg4);
					}
				} else if (arg7 >= 12) {
					if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
						local163 = local108.method317(arg7, arg0, local60, local71, local84, local95, -1);
					} else {
						local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, arg7, true, arg2, local84, false);
					}
					arg6.method386(1, local163, 1, local120, local105, 0, local134, arg5, arg4, arg1);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x924;
					}
					if (local108.aBoolean91 && arg3 != null) {
						arg3.method22(arg1, arg0, local108.anInt306, local108.anInt314, local108.aBoolean95, arg4);
					}
				} else if (arg7 == 0) {
					if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
						local163 = local108.method317(0, arg0, local60, local71, local84, local95, -1);
					} else {
						local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, 0, true, arg2, local84, false);
					}
					arg6.method384(arg5, 0, arg4, null, anIntArray72[arg0], local105, local120, local163, local134, arg1);
					if (arg0 == 0) {
						if (local108.aBoolean92) {
							this.aByteArrayArrayArray1[arg5][arg1][arg4] = 50;
							this.aByteArrayArrayArray1[arg5][arg1][arg4 + 1] = 50;
						}
						if (local108.aBoolean101) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local108.aBoolean92) {
							this.aByteArrayArrayArray1[arg5][arg1][arg4 + 1] = 50;
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4 + 1] = 50;
						}
						if (local108.aBoolean101) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local108.aBoolean92) {
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4] = 50;
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4 + 1] = 50;
						}
						if (local108.aBoolean101) {
							this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local108.aBoolean92) {
							this.aByteArrayArrayArray1[arg5][arg1][arg4] = 50;
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4] = 50;
						}
						if (local108.aBoolean101) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
						}
					}
					if (local108.aBoolean91 && arg3 != null) {
						arg3.method21(arg0, local108.aBoolean95, arg4, arg7, arg1);
					}
					if (local108.anInt302 != 16) {
						arg6.method392(local108.anInt302, arg1, arg4, arg5);
					}
				} else if (arg7 == 1) {
					if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
						local163 = local108.method317(1, arg0, local60, local71, local84, local95, -1);
					} else {
						local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, 1, true, arg2, local84, false);
					}
					arg6.method384(arg5, 0, arg4, null, anIntArray74[arg0], local105, local120, local163, local134, arg1);
					if (local108.aBoolean92) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray1[arg5][arg1][arg4 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray1[arg5][arg1][arg4] = 50;
						}
					}
					if (local108.aBoolean91 && arg3 != null) {
						arg3.method21(arg0, local108.aBoolean95, arg4, arg7, arg1);
					}
				} else {
					@Pc(872) int local872;
					@Pc(901) Class2_Sub1_Sub1 local901;
					if (arg7 == 2) {
						local872 = arg0 + 1 & 0x3;
						@Pc(891) Class2_Sub1_Sub1 local891;
						if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
							local891 = local108.method317(2, arg0 + 4, local60, local71, local84, local95, -1);
							local901 = local108.method317(2, local872, local60, local71, local84, local95, -1);
						} else {
							local891 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0 + 4, local60, 2, true, arg2, local84, false);
							local901 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, local872, local60, 2, true, arg2, local84, false);
						}
						arg6.method384(arg5, anIntArray72[local872], arg4, local901, anIntArray72[arg0], local105, local120, local891, local134, arg1);
						if (local108.aBoolean101) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
							}
						}
						if (local108.aBoolean91 && arg3 != null) {
							arg3.method21(arg0, local108.aBoolean95, arg4, arg7, arg1);
						}
						if (local108.anInt302 != 16) {
							arg6.method392(local108.anInt302, arg1, arg4, arg5);
						}
					} else if (arg7 == 3) {
						if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
							local163 = local108.method317(3, arg0, local60, local71, local84, local95, -1);
						} else {
							local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, 3, true, arg2, local84, false);
						}
						arg6.method384(arg5, 0, arg4, null, anIntArray74[arg0], local105, local120, local163, local134, arg1);
						if (local108.aBoolean92) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray1[arg5][arg1][arg4 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray1[arg5][arg1 + 1][arg4] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray1[arg5][arg1][arg4] = 50;
							}
						}
						if (local108.aBoolean91 && arg3 != null) {
							arg3.method21(arg0, local108.aBoolean95, arg4, arg7, arg1);
						}
					} else if (arg7 == 9) {
						if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
							local163 = local108.method317(arg7, arg0, local60, local71, local84, local95, -1);
						} else {
							local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, arg7, true, arg2, local84, false);
						}
						arg6.method386(1, local163, 1, local120, local105, 0, local134, arg5, arg4, arg1);
						if (local108.aBoolean91 && arg3 != null) {
							arg3.method22(arg1, arg0, local108.anInt306, local108.anInt314, local108.aBoolean95, arg4);
						}
					} else {
						if (local108.aBoolean102) {
							if (arg0 == 1) {
								local872 = local95;
								local95 = local84;
								local84 = local71;
								local71 = local60;
								local60 = local872;
							} else if (arg0 == 2) {
								local872 = local95;
								local95 = local71;
								local71 = local872;
								local872 = local84;
								local84 = local60;
								local60 = local872;
							} else if (arg0 == 3) {
								local872 = local95;
								local95 = local60;
								local60 = local71;
								local71 = local84;
								local84 = local872;
							}
						}
						if (arg7 == 4) {
							if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
								local163 = local108.method317(4, 0, local60, local71, local84, local95, -1);
							} else {
								local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, 0, local60, 4, true, arg2, local84, false);
							}
							arg6.method385(local105, local163, 0, arg4, anIntArray72[arg0], local134, 0, local120, arg5, arg0 * 512, arg1);
						} else if (arg7 == 5) {
							local872 = 16;
							local261 = arg6.method402(arg5, arg1, arg4);
							if (local261 > 0) {
								local872 = Class24.method307(local261 >> 14 & 0x7FFF).anInt302;
							}
							if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
								local901 = local108.method317(4, 0, local60, local71, local84, local95, -1);
							} else {
								local901 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, 0, local60, 4, true, arg2, local84, false);
							}
							arg6.method385(local105, local901, anIntArray80[arg0] * local872, arg4, anIntArray72[arg0], local134, anIntArray73[arg0] * local872, local120, arg5, arg0 * 512, arg1);
						} else if (arg7 == 6) {
							if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
								local163 = local108.method317(4, 0, local60, local71, local84, local95, -1);
							} else {
								local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, 0, local60, 4, true, arg2, local84, false);
							}
							arg6.method385(local105, local163, 0, arg4, 256, local134, 0, local120, arg5, arg0, arg1);
						} else if (arg7 == 7) {
							if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
								local163 = local108.method317(4, 0, local60, local71, local84, local95, -1);
							} else {
								local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, 0, local60, 4, true, arg2, local84, false);
							}
							arg6.method385(local105, local163, 0, arg4, 512, local134, 0, local120, arg5, arg0, arg1);
						} else if (arg7 == 8) {
							if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
								local163 = local108.method317(4, 0, local60, local71, local84, local95, -1);
							} else {
								local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, 0, local60, 4, true, arg2, local84, false);
							}
							arg6.method385(local105, local163, 0, arg4, 768, local134, 0, local120, arg5, arg0, arg1);
						}
					}
				}
			} else if (!aBoolean60 || local108.aBoolean96 || local108.aBoolean97) {
				if (local108.anInt313 == -1 && local108.anIntArray96 == null) {
					local163 = local108.method317(22, arg0, local60, local71, local84, local95, -1);
				} else {
					local163 = new Class2_Sub1_Sub1_Sub3(local71, local108.anInt313, local95, arg0, local60, 22, true, arg2, local84, false);
				}
				arg6.method382(local163, arg4, arg5, local120, arg1, local134, local105);
				if (local108.aBoolean91 && local108.aBoolean96 && arg3 != null) {
					arg3.method23(arg1, anInt216, arg4);
				}
			}
		} catch (@Pc(1646) RuntimeException local1646) {
			signlink.reporterror("34583, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1646.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(I[Lclient!CRVZDSLK;[BIIIIIII)V")
	public void method167(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
					if (arg8 + local15 > 0 && arg8 + local15 < 103 && arg5 + local19 > 0 && arg5 + local19 < 103) {
						arg1[arg7].anIntArrayArray1[arg8 + local15][arg5 + local19] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(69) Class2_Sub1_Sub3 local69 = new Class2_Sub1_Sub3((byte) 114, arg2);
			for (@Pc(71) int local71 = 0; local71 < 4; local71++) {
				for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
					for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
						if (local71 == arg4 && local75 >= arg3 && local75 < arg3 + 8 && local79 >= arg0 && local79 < arg0 + 8) {
							this.method175(0, arg6, arg8 + Class21.method249(local79 & 0x7, arg6, local75 & 0x7), 0, local69, arg5 + Class21.method250(local75 & 0x7, arg6, local79 & 0x7), arg7);
						} else {
							this.method175(0, 0, -1, 0, local69, -1, 0);
						}
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("3391, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -828 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(ZIII)V")
	public void method169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray1[arg0][arg2 + local3][arg1 + local7] = 0;
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray1[arg0][arg2][arg1 + local7] = this.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 + local7];
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray1[arg0][arg2 + local7][arg1] = this.anIntArrayArrayArray1[arg0][arg2 + local7][arg1 - 1];
				}
			}
			if (arg2 > 0 && this.anIntArrayArrayArray1[arg0][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray1[arg0][arg2][arg1] = this.anIntArrayArrayArray1[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray1[arg0][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray1[arg0][arg2][arg1] = this.anIntArrayArrayArray1[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray1[arg0][arg2][arg1] = this.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1];
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("98828, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIIIZLclient!LBBVYYXO;II)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(28) int local28;
			if (arg2 >= 0 && arg2 < 104 && arg5 >= 0 && arg5 < 104) {
				this.aByteArrayArrayArray3[arg6][arg2][arg5] = 0;
				while (true) {
					local28 = arg4.method267();
					if (local28 == 0) {
						if (arg6 == 0) {
							this.anIntArrayArrayArray1[0][arg2][arg5] = -method177(arg2 + arg3 + 932731, arg5 + 556238 + arg0) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg6][arg2][arg5] = this.anIntArrayArrayArray1[arg6 - 1][arg2][arg5] - 240;
							return;
						}
					}
					if (local28 == 1) {
						@Pc(82) int local82 = arg4.method267();
						if (local82 == 1) {
							local82 = 0;
						}
						if (arg6 == 0) {
							this.anIntArrayArrayArray1[0][arg2][arg5] = -local82 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg6][arg2][arg5] = this.anIntArrayArrayArray1[arg6 - 1][arg2][arg5] - local82 * 8;
						return;
					}
					if (local28 <= 49) {
						this.aByteArrayArrayArray4[arg6][arg2][arg5] = arg4.method268();
						this.aByteArrayArrayArray6[arg6][arg2][arg5] = (byte) ((local28 - 2) / 4);
						this.aByteArrayArrayArray5[arg6][arg2][arg5] = (byte) (local28 + arg1 - 2 & 0x3);
					} else if (local28 <= 81) {
						this.aByteArrayArrayArray3[arg6][arg2][arg5] = (byte) (local28 - 49);
					} else {
						this.aByteArrayArrayArray2[arg6][arg2][arg5] = (byte) (local28 - 81);
					}
				}
			} else {
				while (true) {
					local28 = arg4.method267();
					if (local28 == 0) {
						return;
					}
					if (local28 == 1) {
						arg4.method267();
						return;
					}
					if (local28 <= 49) {
						arg4.method267();
					}
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("96453, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IZILclient!RHXAQRFP;[B[Lclient!CRVZDSLK;)V")
	public void method176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class5[] arg5) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3((byte) 114, arg4);
			@Pc(9) int local9 = -1;
			if (!arg1) {
				while (true) {
					@Pc(15) int local15 = local7.method281();
					if (local15 == 0) {
						return;
					}
					local9 += local15;
					@Pc(23) int local23 = 0;
					while (true) {
						@Pc(26) int local26 = local7.method281();
						if (local26 == 0) {
							break;
						}
						local23 += local26 - 1;
						@Pc(38) int local38 = local23 & 0x3F;
						@Pc(44) int local44 = local23 >> 6 & 0x3F;
						@Pc(48) int local48 = local23 >> 12;
						@Pc(51) int local51 = local7.method267();
						@Pc(55) int local55 = local51 >> 2;
						@Pc(59) int local59 = local51 & 0x3;
						@Pc(63) int local63 = local44 + arg0;
						@Pc(67) int local67 = local38 + arg2;
						if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
							@Pc(79) int local79 = local48;
							if ((this.aByteArrayArrayArray3[1][local63][local67] & 0x2) == 2) {
								local79 = local48 - 1;
							}
							@Pc(94) Class5 local94 = null;
							if (local79 >= 0) {
								local94 = arg5[local79];
							}
							this.method164(local59, local63, local9, local94, local67, local48, arg3, local55);
						}
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("60119, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "c", descriptor = "(III)I")
	private int method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(IIIII)V")
	public void method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 < 0) {
				for (@Pc(6) int local6 = arg4; local6 <= arg4 + arg3; local6++) {
					for (@Pc(10) int local10 = arg2; local10 <= arg2 + arg1; local10++) {
						if (local10 >= 0 && local10 < this.anInt218 && local6 >= 0 && local6 < this.anInt219) {
							this.aByteArrayArrayArray1[0][local10][local6] = 127;
							if (local10 == arg2 && local10 > 0) {
								this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10 - 1][local6];
							}
							if (local10 == arg2 + arg1 && local10 < this.anInt218 - 1) {
								this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10 + 1][local6];
							}
							if (local6 == arg4 && local6 > 0) {
								this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10][local6 - 1];
							}
							if (local6 == arg4 + arg3 && local6 < this.anInt219 - 1) {
								this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10][local6 + 1];
							}
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("86133, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(II[Lclient!CRVZDSLK;III[B)V")
	public void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg2[local3].anIntArrayArray1[arg4 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(71) Class2_Sub1_Sub3 local71 = new Class2_Sub1_Sub3((byte) 114, arg5);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
					for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
						this.method175(arg0, 0, local77 + arg4, arg3, local71, local81 + arg1, local11);
					}
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("1755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 28908 + ", " + arg5 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "a", descriptor = "(Lclient!RHXAQRFP;[Lclient!CRVZDSLK;Z)V")
	public void method181(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class5[] arg1) {
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
								arg1[local27].method23(local7, anInt216, local11);
							}
						}
					}
				}
			}
			anInt213 += (int) (Math.random() * 5.0D) - 2;
			if (anInt213 < -8) {
				anInt213 = -8;
			}
			if (anInt213 > 8) {
				anInt213 = 8;
			}
			anInt210 += (int) (Math.random() * 5.0D) - 2;
			if (anInt210 < -16) {
				anInt210 = -16;
			}
			if (anInt210 > 16) {
				anInt210 = 16;
			}
			@Pc(136) int local136;
			@Pc(142) int local142;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(172) int local172;
			@Pc(194) int local194;
			@Pc(207) int local207;
			@Pc(213) int local213;
			@Pc(217) int local217;
			@Pc(223) int local223;
			@Pc(239) int local239;
			@Pc(287) int local287;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(111) byte[][] local111 = this.aByteArrayArrayArray1[local7];
				local136 = (int) Math.sqrt((double) 5100);
				local142 = local136 * 768 >> 8;
				for (local144 = 1; local144 < this.anInt219 - 1; local144++) {
					for (local148 = 1; local148 < this.anInt218 - 1; local148++) {
						local172 = this.anIntArrayArrayArray1[local7][local148 + 1][local144] - this.anIntArrayArrayArray1[local7][local148 - 1][local144];
						local194 = this.anIntArrayArrayArray1[local7][local148][local144 + 1] - this.anIntArrayArrayArray1[local7][local148][local144 - 1];
						local207 = (int) Math.sqrt((double) (local172 * local172 + local194 * local194 + 65536));
						local213 = (local172 << 8) / local207;
						local217 = 65536 / local207;
						local223 = (local194 << 8) / local207;
						local239 = (local213 * -50 + local217 * -10 + local223 * -50) / local142 + 96;
						local287 = (local111[local148 - 1][local144] >> 2) + (local111[local148 + 1][local144] >> 3) + (local111[local148][local144 - 1] >> 2) + (local111[local148][local144 + 1] >> 3) + (local111[local148][local144] >> 1);
						this.anIntArrayArray11[local148][local144] = local239 - local287;
					}
				}
				for (local148 = 0; local148 < this.anInt219; local148++) {
					this.anIntArray75[local148] = 0;
					this.anIntArray76[local148] = 0;
					this.anIntArray77[local148] = 0;
					this.anIntArray78[local148] = 0;
					this.anIntArray79[local148] = 0;
				}
				for (local172 = -5; local172 < this.anInt218 + 5; local172++) {
					for (local194 = 0; local194 < this.anInt219; local194++) {
						local207 = local172 + 5;
						@Pc(422) int local422;
						if (local207 >= 0 && local207 < this.anInt218) {
							local213 = this.aByteArrayArrayArray2[local7][local207][local194] & 0xFF;
							if (local213 > 0) {
								@Pc(381) Class3 local381 = Class3.aClass3Array1[local213 - 1];
								this.anIntArray75[local194] += local381.anInt37;
								this.anIntArray76[local194] += local381.anInt35;
								this.anIntArray77[local194] += local381.anInt36;
								this.anIntArray78[local194] += local381.anInt38;
								local422 = this.anIntArray79[local194]++;
							}
						}
						local213 = local172 - 5;
						if (local213 >= 0 && local213 < this.anInt218) {
							local217 = this.aByteArrayArrayArray2[local7][local213][local194] & 0xFF;
							if (local217 > 0) {
								@Pc(454) Class3 local454 = Class3.aClass3Array1[local217 - 1];
								this.anIntArray75[local194] -= local454.anInt37;
								this.anIntArray76[local194] -= local454.anInt35;
								this.anIntArray77[local194] -= local454.anInt36;
								this.anIntArray78[local194] -= local454.anInt38;
								local422 = this.anIntArray79[local194]--;
							}
						}
					}
					if (local172 >= 1 && local172 < this.anInt218 - 1) {
						local207 = 0;
						local213 = 0;
						local217 = 0;
						local223 = 0;
						local239 = 0;
						for (local287 = -5; local287 < this.anInt219 + 5; local287++) {
							@Pc(530) int local530 = local287 + 5;
							if (local530 >= 0 && local530 < this.anInt219) {
								local207 += this.anIntArray75[local530];
								local213 += this.anIntArray76[local530];
								local217 += this.anIntArray77[local530];
								local223 += this.anIntArray78[local530];
								local239 += this.anIntArray79[local530];
							}
							@Pc(575) int local575 = local287 - 5;
							if (local575 >= 0 && local575 < this.anInt219) {
								local207 -= this.anIntArray75[local575];
								local213 -= this.anIntArray76[local575];
								local217 -= this.anIntArray77[local575];
								local223 -= this.anIntArray78[local575];
								local239 -= this.anIntArray79[local575];
							}
							if (local287 >= 1 && local287 < this.anInt219 - 1 && (!aBoolean60 || (this.aByteArrayArrayArray3[0][local172][local287] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local172][local287] & 0x10) == 0 && this.method182(local172, local287, local7) == anInt211)) {
								if (local7 < anInt217) {
									anInt217 = local7;
								}
								@Pc(674) int local674 = this.aByteArrayArrayArray2[local7][local172][local287] & 0xFF;
								@Pc(685) int local685 = this.aByteArrayArrayArray4[local7][local172][local287] & 0xFF;
								if (local674 > 0 || local685 > 0) {
									@Pc(698) int local698 = this.anIntArrayArrayArray1[local7][local172][local287];
									@Pc(709) int local709 = this.anIntArrayArrayArray1[local7][local172 + 1][local287];
									@Pc(722) int local722 = this.anIntArrayArrayArray1[local7][local172 + 1][local287 + 1];
									@Pc(733) int local733 = this.anIntArrayArrayArray1[local7][local172][local287 + 1];
									@Pc(740) int local740 = this.anIntArrayArray11[local172][local287];
									@Pc(749) int local749 = this.anIntArrayArray11[local172 + 1][local287];
									@Pc(760) int local760 = this.anIntArrayArray11[local172 + 1][local287 + 1];
									@Pc(769) int local769 = this.anIntArrayArray11[local172][local287 + 1];
									@Pc(771) int local771 = -1;
									@Pc(773) int local773 = -1;
									@Pc(781) int local781;
									@Pc(785) int local785;
									if (local674 > 0) {
										local781 = local207 * 256 / local223;
										local785 = local213 / local239;
										@Pc(789) int local789 = local217 / local239;
										local771 = this.method178(local781, local785, local789);
										@Pc(801) int local801 = local781 + anInt213 & 0xFF;
										local789 += anInt210;
										if (local789 < 0) {
											local789 = 0;
										} else if (local789 > 255) {
											local789 = 255;
										}
										local773 = this.method178(local801, local785, local789);
									}
									if (local7 > 0) {
										@Pc(826) boolean local826 = true;
										if (local674 == 0 && this.aByteArrayArrayArray6[local7][local172][local287] != 0) {
											local826 = false;
										}
										if (local685 > 0 && !Class3.aClass3Array1[local685 - 1].aBoolean9) {
											local826 = false;
										}
										if (local826 && local698 == local709 && local698 == local722 && local698 == local733) {
											this.anIntArrayArrayArray2[local7][local172][local287] |= 0x924;
										}
									}
									local781 = 0;
									if (local771 != -1) {
										local781 = Class2_Sub1_Sub2_Sub1.anIntArray12[method162(local773, 96)];
									}
									if (local685 == 0) {
										arg0.method381(local7, local172, local287, 0, 0, -1, local698, local709, local722, local733, method162(local771, local740), method162(local771, local749), method162(local771, local760), method162(local771, local769), 0, 0, 0, 0, local781, 0);
									} else {
										local785 = this.aByteArrayArrayArray6[local7][local172][local287] + 1;
										@Pc(938) byte local938 = this.aByteArrayArrayArray5[local7][local172][local287];
										@Pc(944) Class3 local944 = Class3.aClass3Array1[local685 - 1];
										@Pc(947) int local947 = local944.anInt33;
										@Pc(955) int local955;
										@Pc(953) int local953;
										if (local947 >= 0) {
											local953 = Class2_Sub1_Sub2_Sub1.method66(local947);
											local955 = -1;
										} else if (local944.anInt32 == 16711935) {
											local955 = -2;
											local947 = -1;
											local953 = Class2_Sub1_Sub2_Sub1.anIntArray12[this.method183(local944.anInt39, 96)];
										} else {
											local955 = this.method178(local944.anInt34, local944.anInt35, local944.anInt36);
											local953 = Class2_Sub1_Sub2_Sub1.anIntArray12[this.method183(local944.anInt39, 96)];
										}
										arg0.method381(local7, local172, local287, local785, local938, local947, local698, local709, local722, local733, method162(local771, local740), method162(local771, local749), method162(local771, local760), method162(local771, local769), this.method183(local955, local740), this.method183(local955, local749), this.method183(local955, local760), this.method183(local955, local769), local781, local953);
									}
								}
							}
						}
					}
				}
				for (local194 = 1; local194 < this.anInt219 - 1; local194++) {
					for (local207 = 1; local207 < this.anInt218 - 1; local207++) {
						arg0.method380(local7, local207, local194, this.method182(local207, local194, local7));
					}
				}
			}
			arg0.method407();
			for (local11 = 0; local11 < this.anInt218; local11++) {
				for (local27 = 0; local27 < this.anInt219; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg0.method378(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1130) int local1130 = 2;
			@Pc(1132) int local1132 = 4;
			for (@Pc(1134) int local1134 = 0; local1134 < 4; local1134++) {
				if (local1134 > 0) {
					local27 <<= 0x3;
					local1130 <<= 0x3;
					local1132 <<= 0x3;
				}
				for (@Pc(1152) int local1152 = 0; local1152 <= local1134; local1152++) {
					for (local136 = 0; local136 <= this.anInt219; local136++) {
						for (local142 = 0; local142 <= this.anInt218; local142++) {
							if ((this.anIntArrayArrayArray2[local1152][local142][local136] & local27) != 0) {
								local144 = local136;
								local148 = local136;
								local172 = local1152;
								local194 = local1152;
								while (local144 > 0 && (this.anIntArrayArrayArray2[local1152][local142][local144 - 1] & local27) != 0) {
									local144--;
								}
								while (local148 < this.anInt219 && (this.anIntArrayArrayArray2[local1152][local142][local148 + 1] & local27) != 0) {
									local148++;
								}
								label328: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray2[local172 - 1][local142][local207] & local27) == 0) {
											break label328;
										}
									}
									local172--;
								}
								label317: while (local194 < local1134) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray2[local194 + 1][local142][local207] & local27) == 0) {
											break label317;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray1[local194][local142][local144] - 240;
									local223 = this.anIntArrayArrayArray1[local172][local142][local144];
									Class34.method379(local142 * 128, local223, local142 * 128, local148 * 128 + 128, local1134, 1, local217, local144 * 128);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray2[local239][local142][local287] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1152][local142][local136] & local1130) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local1152;
								local194 = local1152;
								while (local144 > 0 && (this.anIntArrayArrayArray2[local1152][local144 - 1][local136] & local1130) != 0) {
									local144--;
								}
								while (local148 < this.anInt218 && (this.anIntArrayArrayArray2[local1152][local148 + 1][local136] & local1130) != 0) {
									local148++;
								}
								label381: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray2[local172 - 1][local207][local136] & local1130) == 0) {
											break label381;
										}
									}
									local172--;
								}
								label370: while (local194 < local1134) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray2[local194 + 1][local207][local136] & local1130) == 0) {
											break label370;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray1[local194][local144][local136] - 240;
									local223 = this.anIntArrayArrayArray1[local172][local144][local136];
									Class34.method379(local148 * 128 + 128, local223, local144 * 128, local136 * 128, local1134, 2, local217, local136 * 128);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray2[local239][local287][local136] &= ~local1130;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1152][local142][local136] & local1132) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local136;
								local194 = local136;
								while (local172 > 0 && (this.anIntArrayArrayArray2[local1152][local142][local172 - 1] & local1132) != 0) {
									local172--;
								}
								while (local194 < this.anInt219 && (this.anIntArrayArrayArray2[local1152][local142][local194 + 1] & local1132) != 0) {
									local194++;
								}
								label434: while (local144 > 0) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray2[local1152][local144 - 1][local207] & local1132) == 0) {
											break label434;
										}
									}
									local144--;
								}
								label423: while (local148 < this.anInt218) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray2[local1152][local148 + 1][local207] & local1132) == 0) {
											break label423;
										}
									}
									local148++;
								}
								if ((local148 + 1 - local144) * (local194 + 1 - local172) >= 4) {
									local207 = this.anIntArrayArrayArray1[local1152][local144][local172];
									Class34.method379(local148 * 128 + 128, local207, local144 * 128, local194 * 128 + 128, local1134, 4, local207, local172 * 128);
									for (local213 = local144; local213 <= local148; local213++) {
										for (local217 = local172; local217 <= local194; local217++) {
											this.anIntArrayArrayArray2[local1152][local213][local217] &= ~local1132;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1767) RuntimeException local1767) {
			signlink.reporterror("31465, " + arg0 + ", " + arg1 + ", " + false + ", " + local1767.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "b", descriptor = "(IIII)I")
	private int method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray3[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("82990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EZVBBZYG", name = "e", descriptor = "(II)I")
	private int method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
}
