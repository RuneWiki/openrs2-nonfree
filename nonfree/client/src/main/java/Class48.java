import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YIGACPUG")
public final class Class48 {

	@OriginalMember(owner = "client!YIGACPUG", name = "n", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "[I")
	private static final int[] anIntArray181 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "[I")
	private static final int[] anIntArray182 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!YIGACPUG", name = "d", descriptor = "B")
	private static byte aByte31 = 62;

	@OriginalMember(owner = "client!YIGACPUG", name = "f", descriptor = "I")
	private static int anInt757 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!YIGACPUG", name = "i", descriptor = "I")
	public static int anInt758 = 99;

	@OriginalMember(owner = "client!YIGACPUG", name = "l", descriptor = "B")
	private static byte aByte32 = 9;

	@OriginalMember(owner = "client!YIGACPUG", name = "m", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!YIGACPUG", name = "q", descriptor = "I")
	private static int anInt762 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!YIGACPUG", name = "B", descriptor = "[I")
	private static final int[] anIntArray188 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!YIGACPUG", name = "C", descriptor = "[I")
	private static final int[] anIntArray189 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!YIGACPUG", name = "F", descriptor = "Z")
	private static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!YIGACPUG", name = "H", descriptor = "I")
	private static int anInt766 = 3;

	@OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "I")
	private int anInt756 = 865;

	@OriginalMember(owner = "client!YIGACPUG", name = "e", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!YIGACPUG", name = "s", descriptor = "I")
	private int anInt763 = -6102;

	@OriginalMember(owner = "client!YIGACPUG", name = "z", descriptor = "I")
	private int anInt764 = -42268;

	@OriginalMember(owner = "client!YIGACPUG", name = "E", descriptor = "I")
	private int anInt765 = 48536;

	@OriginalMember(owner = "client!YIGACPUG", name = "j", descriptor = "I")
	private int anInt759;

	@OriginalMember(owner = "client!YIGACPUG", name = "k", descriptor = "I")
	private int anInt760;

	@OriginalMember(owner = "client!YIGACPUG", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!YIGACPUG", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!YIGACPUG", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!YIGACPUG", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!YIGACPUG", name = "G", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!YIGACPUG", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!YIGACPUG", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!YIGACPUG", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!YIGACPUG", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!YIGACPUG", name = "u", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!YIGACPUG", name = "v", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!YIGACPUG", name = "w", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!YIGACPUG", name = "x", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!YIGACPUG", name = "y", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ZLclient!LVBGZMMP;Lclient!FTMSICIZ;)V")
	public static void method505(@OriginalArg(1) Class20_Sub1 arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = -1;
			while (true) {
				@Pc(9) int local9 = arg1.method116();
				if (local9 == 0) {
					return;
				}
				local6 += local9;
				@Pc(18) Class28 local18 = Class28.method334(local6);
				local18.method339(arg0);
				while (true) {
					@Pc(25) int local25 = arg1.method116();
					if (local25 == 0) {
						break;
					}
					arg1.method102();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("86795, " + true + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(II)I")
	private static int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method511(arg0 + 45365, arg1 + 91923, 4) + (method511(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method511(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(III)I")
	private static int method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method523(local3, local13);
		@Pc(29) int local29 = method523(local3 + 1, local13);
		@Pc(35) int local35 = method523(local3, local13 + 1);
		@Pc(43) int local43 = method523(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method513(local23, local29, local9, arg2);
		@Pc(55) int local55 = method513(local35, local43, local9, arg2);
		return method513(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(IIII)I")
	private static int method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class4_Sub1_Sub1_Sub4.anIntArray205[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "(II)I")
	private static int method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!YIGACPUG", name = "c", descriptor = "(III)Z")
	public static boolean method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) Class28 local9 = Class28.method334(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local9.method342(arg0, aBoolean196);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("70878, " + arg0 + ", " + arg1 + ", " + -38079 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "d", descriptor = "(II)I")
	private static int method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([BIII)Z")
	public static boolean method520(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(14) Class4_Sub1_Sub3 local14 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			@Pc(16) int local16 = -1;
			label53: while (true) {
				@Pc(19) int local19 = local14.method116();
				if (local19 == 0) {
					return local3;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				@Pc(29) boolean local29 = false;
				while (true) {
					@Pc(34) int local34;
					while (!local29) {
						local34 = local14.method116();
						if (local34 == 0) {
							continue label53;
						}
						local27 += local34 - 1;
						@Pc(56) int local56 = local27 & 0x3F;
						@Pc(62) int local62 = local27 >> 6 & 0x3F;
						@Pc(67) int local67 = local14.method102() >> 2;
						@Pc(71) int local71 = local62 + arg1;
						@Pc(75) int local75 = local56 + arg2;
						if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
							@Pc(88) Class28 local88 = Class28.method334(local16);
							if (local67 != 22 || !aBoolean195 || local88.aBoolean126 || local88.aBoolean134) {
								local3 &= local88.method341();
								local29 = true;
							}
						}
					}
					local34 = local14.method116();
					if (local34 == 0) {
						break;
					}
					local14.method102();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("75894, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "e", descriptor = "(II)I")
	private static int method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method518(arg0 - 1, arg1 - 1) + method518(arg0 + 1, arg1 - 1) + method518(arg0 - 1, arg1 + 1) + method518(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method518(arg0 - 1, arg1) + method518(arg0 + 1, arg1) + method518(arg0, arg1 - 1) + method518(arg0, arg1 + 1);
		@Pc(59) int local59 = method518(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ILclient!XNSGYTEG;IILclient!ZSRJFSKK;III[[[III)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(18) int local18 = arg7[arg6][arg0][arg5];
			@Pc(28) int local28 = arg7[arg6][arg0 + 1][arg5];
			@Pc(40) int local40 = arg7[arg6][arg0 + 1][arg5 + 1];
			@Pc(50) int local50 = arg7[arg6][arg0][arg5 + 1];
			@Pc(60) int local60 = local18 + local28 + local40 + local50 >> 2;
			@Pc(63) Class28 local63 = Class28.method334(arg9);
			@Pc(75) int local75 = arg0 + (arg5 << 7) + (arg9 << 14) + 1073741824;
			if (!local63.aBoolean126) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg2 << 6) + arg3);
			@Pc(109) Class4_Sub1_Sub2 local109;
			if (arg3 == 22) {
				if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
					local109 = local63.method338(22, arg2, local18, local28, local40, local50, -1);
				} else {
					local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 22, local63.anInt385, local50, local40, arg2, 4, true);
				}
				arg1.method437(aByte31, local60, local89, arg8, local75, local109, arg5, arg0);
				if (local63.aBoolean125 && local63.aBoolean126) {
					arg4.method532(arg0, (byte) 8, arg5);
				}
			} else {
				@Pc(205) int local205;
				if (arg3 == 10 || arg3 == 11) {
					if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
						local109 = local63.method338(10, arg2, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 10, local63.anInt385, local50, local40, arg2, 4, true);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg3 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg2 == 1 || arg2 == 3) {
							local205 = local63.anInt384;
							local208 = local63.anInt387;
						} else {
							local205 = local63.anInt387;
							local208 = local63.anInt384;
						}
						arg1.method441(local208, arg5, arg0, local75, local205, arg8, local109, local89, local60, local192);
					}
					if (local63.aBoolean125) {
						arg4.method531(local63.anInt384, arg0, arg5, aByte32, local63.aBoolean136, arg2, local63.anInt387);
					}
				} else if (arg3 >= 12) {
					if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
						local109 = local63.method338(arg3, arg2, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, arg3, local63.anInt385, local50, local40, arg2, 4, true);
					}
					arg1.method441(1, arg5, arg0, local75, 1, arg8, local109, local89, local60, 0);
					if (local63.aBoolean125) {
						arg4.method531(local63.anInt384, arg0, arg5, aByte32, local63.aBoolean136, arg2, local63.anInt387);
					}
				} else if (arg3 == 0) {
					if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
						local109 = local63.method338(0, arg2, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 0, local63.anInt385, local50, local40, arg2, 4, true);
					}
					arg1.method439(local75, arg8, arg0, null, local89, local60, arg5, 0, anIntArray189[arg2], local109);
					if (local63.aBoolean125) {
						arg4.method530(local63.aBoolean136, arg0, arg5, arg2, arg3);
					}
				} else if (arg3 == 1) {
					if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
						local109 = local63.method338(1, arg2, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 1, local63.anInt385, local50, local40, arg2, 4, true);
					}
					arg1.method439(local75, arg8, arg0, null, local89, local60, arg5, 0, anIntArray188[arg2], local109);
					if (local63.aBoolean125) {
						arg4.method530(local63.aBoolean136, arg0, arg5, arg2, arg3);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class4_Sub1_Sub2 local480;
					if (arg3 == 2) {
						local451 = arg2 + 1 & 0x3;
						@Pc(470) Class4_Sub1_Sub2 local470;
						if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
							local470 = local63.method338(2, arg2 + 4, local18, local28, local40, local50, -1);
							local480 = local63.method338(2, local451, local18, local28, local40, local50, -1);
						} else {
							local470 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 2, local63.anInt385, local50, local40, arg2 + 4, 4, true);
							local480 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 2, local63.anInt385, local50, local40, local451, 4, true);
						}
						arg1.method439(local75, arg8, arg0, local480, local89, local60, arg5, anIntArray189[local451], anIntArray189[arg2], local470);
						if (local63.aBoolean125) {
							arg4.method530(local63.aBoolean136, arg0, arg5, arg2, arg3);
						}
					} else if (arg3 == 3) {
						if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
							local109 = local63.method338(3, arg2, local18, local28, local40, local50, -1);
						} else {
							local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 3, local63.anInt385, local50, local40, arg2, 4, true);
						}
						arg1.method439(local75, arg8, arg0, null, local89, local60, arg5, 0, anIntArray188[arg2], local109);
						if (local63.aBoolean125) {
							arg4.method530(local63.aBoolean136, arg0, arg5, arg2, arg3);
						}
					} else if (arg3 == 9) {
						if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
							local109 = local63.method338(arg3, arg2, local18, local28, local40, local50, -1);
						} else {
							local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, arg3, local63.anInt385, local50, local40, arg2, 4, true);
						}
						arg1.method441(1, arg5, arg0, local75, 1, arg8, local109, local89, local60, 0);
						if (local63.aBoolean125) {
							arg4.method531(local63.anInt384, arg0, arg5, aByte32, local63.aBoolean136, arg2, local63.anInt387);
						}
					} else {
						if (local63.aBoolean128) {
							if (arg2 == 1) {
								local451 = local50;
								local50 = local40;
								local40 = local28;
								local28 = local18;
								local18 = local451;
							} else if (arg2 == 2) {
								local451 = local50;
								local50 = local28;
								local28 = local451;
								local451 = local40;
								local40 = local18;
								local18 = local451;
							} else if (arg2 == 3) {
								local451 = local50;
								local50 = local18;
								local18 = local28;
								local28 = local40;
								local40 = local451;
							}
						}
						if (arg3 == 4) {
							if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
								local109 = local63.method338(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 4, local63.anInt385, local50, local40, 0, 4, true);
							}
							arg1.method440(0, arg0, arg8, arg5, 0, local109, anIntArray189[arg2], local75, arg2 * 512, local89, local60);
						} else if (arg3 == 5) {
							local451 = 16;
							local205 = arg1.method457(arg8, arg0, arg5);
							if (local205 > 0) {
								local451 = Class28.method334(local205 >> 14 & 0x7FFF).anInt393;
							}
							if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
								local480 = local63.method338(4, 0, local18, local28, local40, local50, -1);
							} else {
								local480 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 4, local63.anInt385, local50, local40, 0, 4, true);
							}
							arg1.method440(anIntArray181[arg2] * local451, arg0, arg8, arg5, anIntArray182[arg2] * local451, local480, anIntArray189[arg2], local75, arg2 * 512, local89, local60);
						} else if (arg3 == 6) {
							if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
								local109 = local63.method338(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 4, local63.anInt385, local50, local40, 0, 4, true);
							}
							arg1.method440(0, arg0, arg8, arg5, 0, local109, 256, local75, arg2, local89, local60);
						} else if (arg3 == 7) {
							if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
								local109 = local63.method338(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 4, local63.anInt385, local50, local40, 0, 4, true);
							}
							arg1.method440(0, arg0, arg8, arg5, 0, local109, 512, local75, arg2, local89, local60);
						} else if (arg3 == 8) {
							if (local63.anInt385 == -1 && local63.anIntArray104 == null) {
								local109 = local63.method338(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class4_Sub1_Sub2_Sub2(arg9, local28, local18, 4, local63.anInt385, local50, local40, 0, 4, true);
							}
							arg1.method440(0, arg0, arg8, arg5, 0, local109, 768, local75, arg2, local89, local60);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("63430, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "<init>", descriptor = "([[[II[[[BBI)V")
	public Class48(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			anInt758 = 99;
			this.anInt759 = arg1;
			this.anInt760 = arg4;
			this.anIntArrayArrayArray5 = arg0;
			this.aByteArrayArrayArray6 = arg2;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt759][this.anInt760];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt759][this.anInt760];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt759][this.anInt760];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt759][this.anInt760];
			this.anIntArrayArrayArray6 = new int[4][this.anInt759 + 1][this.anInt760 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt759 + 1][this.anInt760 + 1];
			this.anIntArrayArray17 = new int[this.anInt759 + 1][this.anInt760 + 1];
			this.anIntArray183 = new int[this.anInt760];
			this.anIntArray184 = new int[this.anInt760];
			this.anIntArray185 = new int[this.anInt760];
			this.anIntArray186 = new int[this.anInt760];
			this.anIntArray187 = new int[this.anInt760];
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("52731, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([BIIIIIII[Lclient!ZSRJFSKK;I)V")
	public void method503(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class50[] arg8, @OriginalArg(9) int arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg9 + local3 > 0 && arg9 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg8[arg7].anIntArrayArray18[arg9 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class4_Sub1_Sub3 local57 = new Class4_Sub1_Sub3(arg0, (byte) 3);
			if (arg6 <= 0) {
				this.anInt763 = 408;
			}
			for (@Pc(64) int local64 = 0; local64 < 4; local64++) {
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						if (local64 == arg3 && local68 >= arg4 && local68 < arg4 + 8 && local72 >= arg2 && local72 < arg2 + 8) {
							this.method516(arg1 + Class6.method82(arg5, local72 & 0x7, local68 & 0x7), arg7, arg5, arg9 + Class6.method81(local68 & 0x7, 745, local72 & 0x7, arg5), local57, 0, 0);
						} else {
							this.method516(-1, 0, 0, -1, local57, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("48860, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIB)V")
	public void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2 + local3][arg0 + local7] = 0;
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2][arg0 + local7] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 + local7];
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2 + local7][arg0] = this.anIntArrayArrayArray5[arg1][arg2 + local7][arg0 - 1];
				}
			}
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
			} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("13294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 42 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIII)I")
	private int method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anInt765 != 48536) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			if ((this.aByteArrayArrayArray6[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray6[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("84442, " + arg0 + ", " + arg1 + ", " + 48536 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(III)I")
	private int method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIIILclient!XNSGYTEG;I[BI[Lclient!ZSRJFSKK;I)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class50[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(17) Class4_Sub1_Sub3 local17 = new Class4_Sub1_Sub3(arg6, (byte) 3);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method116();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method116();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method102();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg1 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg9 && local45 < arg9 + 8) {
						@Pc(88) Class28 local88 = Class28.method334(local19);
						@Pc(105) int local105 = arg2 + Class6.method83(local88.anInt384, local51 & 0x7, local88.anInt387, local66, local45 & 0x7, arg0);
						@Pc(122) int local122 = arg3 + Class6.method84(local66, local88.anInt384, local51 & 0x7, local45 & 0x7, arg0, local88.anInt387);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg7;
							if ((this.aByteArrayArrayArray6[1][local105][local122] & 0x2) == 2) {
								local134 = arg7 - 1;
							}
							@Pc(149) Class50 local149 = null;
							if (local134 >= 0) {
								local149 = arg8[local134];
							}
							this.method512(local19, arg7, local122, local66 + arg0 & 0x3, local149, local105, local62, arg4);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("35251, " + arg0 + ", " + arg1 + ", " + -37619 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "b", descriptor = "(II)I")
	private int method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIIILclient!ZSRJFSKK;IILclient!XNSGYTEG;)V")
	private void method512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class50 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class45 arg7) {
		try {
			if (aBoolean195 && (this.aByteArrayArrayArray6[0][arg5][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg1][arg5][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method506(arg1, arg5, arg2) != anInt761) {
					return;
				}
			}
			if (arg1 < anInt758) {
				anInt758 = arg1;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg1][arg5][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg1][arg5 + 1][arg2];
			if (this.anInt764 != -42268) {
				this.anInt756 = 30;
			}
			@Pc(80) int local80 = this.anIntArrayArrayArray5[arg1][arg5 + 1][arg2 + 1];
			@Pc(91) int local91 = this.anIntArrayArrayArray5[arg1][arg5][arg2 + 1];
			@Pc(101) int local101 = local49 + local60 + local80 + local91 >> 2;
			@Pc(104) Class28 local104 = Class28.method334(arg0);
			@Pc(116) int local116 = arg5 + (arg2 << 7) + (arg0 << 14) + 1073741824;
			if (!local104.aBoolean126) {
				local116 += Integer.MIN_VALUE;
			}
			@Pc(130) byte local130 = (byte) ((arg3 << 6) + arg6);
			@Pc(159) Class4_Sub1_Sub2 local159;
			if (arg6 != 22) {
				@Pc(257) int local257;
				if (arg6 == 10 || arg6 == 11) {
					if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
						local159 = local104.method338(10, arg3, local49, local60, local80, local91, -1);
					} else {
						local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 10, local104.anInt385, local91, local80, arg3, 4, true);
					}
					if (local159 != null) {
						@Pc(244) int local244 = 0;
						if (arg6 == 11) {
							local244 += 256;
						}
						@Pc(260) int local260;
						if (arg3 == 1 || arg3 == 3) {
							local257 = local104.anInt384;
							local260 = local104.anInt387;
						} else {
							local257 = local104.anInt387;
							local260 = local104.anInt384;
						}
						if (arg7.method441(local260, arg2, arg5, local116, local257, arg1, local159, local130, local101, local244) && local104.aBoolean131) {
							@Pc(291) Class4_Sub1_Sub2_Sub3 local291;
							if (local159 instanceof Class4_Sub1_Sub2_Sub3) {
								local291 = (Class4_Sub1_Sub2_Sub3) local159;
							} else {
								local291 = local104.method338(10, arg3, local49, local60, local80, local91, -1);
							}
							if (local291 != null) {
								for (@Pc(307) int local307 = 0; local307 <= local257; local307++) {
									for (@Pc(311) int local311 = 0; local311 <= local260; local311++) {
										@Pc(318) int local318 = local291.anInt235 / 4;
										if (local318 > 30) {
											local318 = 30;
										}
										if (local318 > this.aByteArrayArrayArray3[arg1][arg5 + local307][arg2 + local311]) {
											this.aByteArrayArrayArray3[arg1][arg5 + local307][arg2 + local311] = (byte) local318;
										}
									}
								}
							}
						}
					}
					if (local104.aBoolean125 && arg4 != null) {
						arg4.method531(local104.anInt384, arg5, arg2, aByte32, local104.aBoolean136, arg3, local104.anInt387);
					}
				} else if (arg6 >= 12) {
					if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
						local159 = local104.method338(arg6, arg3, local49, local60, local80, local91, -1);
					} else {
						local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, arg6, local104.anInt385, local91, local80, arg3, 4, true);
					}
					arg7.method441(1, arg2, arg5, local116, 1, arg1, local159, local130, local101, 0);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x924;
					}
					if (local104.aBoolean125 && arg4 != null) {
						arg4.method531(local104.anInt384, arg5, arg2, aByte32, local104.aBoolean136, arg3, local104.anInt387);
					}
				} else if (arg6 == 0) {
					if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
						local159 = local104.method338(0, arg3, local49, local60, local80, local91, -1);
					} else {
						local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 0, local104.anInt385, local91, local80, arg3, 4, true);
					}
					arg7.method439(local116, arg1, arg5, null, local130, local101, arg2, 0, anIntArray189[arg3], local159);
					if (arg3 == 0) {
						if (local104.aBoolean131) {
							this.aByteArrayArrayArray3[arg1][arg5][arg2] = 50;
							this.aByteArrayArrayArray3[arg1][arg5][arg2 + 1] = 50;
						}
						if (local104.aBoolean129) {
							this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local104.aBoolean131) {
							this.aByteArrayArrayArray3[arg1][arg5][arg2 + 1] = 50;
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2 + 1] = 50;
						}
						if (local104.aBoolean129) {
							this.anIntArrayArrayArray6[arg1][arg5][arg2 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local104.aBoolean131) {
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2] = 50;
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2 + 1] = 50;
						}
						if (local104.aBoolean129) {
							this.anIntArrayArrayArray6[arg1][arg5 + 1][arg2] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local104.aBoolean131) {
							this.aByteArrayArrayArray3[arg1][arg5][arg2] = 50;
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2] = 50;
						}
						if (local104.aBoolean129) {
							this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x492;
						}
					}
					if (local104.aBoolean125 && arg4 != null) {
						arg4.method530(local104.aBoolean136, arg5, arg2, arg3, arg6);
					}
					if (local104.anInt393 != 16) {
						arg7.method447(arg5, local104.anInt393, arg1, arg2);
					}
				} else if (arg6 == 1) {
					if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
						local159 = local104.method338(1, arg3, local49, local60, local80, local91, -1);
					} else {
						local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 1, local104.anInt385, local91, local80, arg3, 4, true);
					}
					arg7.method439(local116, arg1, arg5, null, local130, local101, arg2, 0, anIntArray188[arg3], local159);
					if (local104.aBoolean131) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray3[arg1][arg5][arg2 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray3[arg1][arg5][arg2] = 50;
						}
					}
					if (local104.aBoolean125 && arg4 != null) {
						arg4.method530(local104.aBoolean136, arg5, arg2, arg3, arg6);
					}
				} else {
					@Pc(868) int local868;
					@Pc(897) Class4_Sub1_Sub2 local897;
					if (arg6 == 2) {
						local868 = arg3 + 1 & 0x3;
						@Pc(887) Class4_Sub1_Sub2 local887;
						if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
							local887 = local104.method338(2, arg3 + 4, local49, local60, local80, local91, -1);
							local897 = local104.method338(2, local868, local49, local60, local80, local91, -1);
						} else {
							local887 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 2, local104.anInt385, local91, local80, arg3 + 4, 4, true);
							local897 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 2, local104.anInt385, local91, local80, local868, 4, true);
						}
						arg7.method439(local116, arg1, arg5, local897, local130, local101, arg2, anIntArray189[local868], anIntArray189[arg3], local887);
						if (local104.aBoolean129) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg5][arg2 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray6[arg1][arg5][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg5 + 1][arg2] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray6[arg1][arg5 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg5][arg2] |= 0x249;
							}
						}
						if (local104.aBoolean125 && arg4 != null) {
							arg4.method530(local104.aBoolean136, arg5, arg2, arg3, arg6);
						}
						if (local104.anInt393 != 16) {
							arg7.method447(arg5, local104.anInt393, arg1, arg2);
						}
					} else if (arg6 == 3) {
						if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
							local159 = local104.method338(3, arg3, local49, local60, local80, local91, -1);
						} else {
							local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 3, local104.anInt385, local91, local80, arg3, 4, true);
						}
						arg7.method439(local116, arg1, arg5, null, local130, local101, arg2, 0, anIntArray188[arg3], local159);
						if (local104.aBoolean131) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray3[arg1][arg5][arg2 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray3[arg1][arg5 + 1][arg2] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray3[arg1][arg5][arg2] = 50;
							}
						}
						if (local104.aBoolean125 && arg4 != null) {
							arg4.method530(local104.aBoolean136, arg5, arg2, arg3, arg6);
						}
					} else if (arg6 == 9) {
						if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
							local159 = local104.method338(arg6, arg3, local49, local60, local80, local91, -1);
						} else {
							local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, arg6, local104.anInt385, local91, local80, arg3, 4, true);
						}
						arg7.method441(1, arg2, arg5, local116, 1, arg1, local159, local130, local101, 0);
						if (local104.aBoolean125 && arg4 != null) {
							arg4.method531(local104.anInt384, arg5, arg2, aByte32, local104.aBoolean136, arg3, local104.anInt387);
						}
					} else {
						if (local104.aBoolean128) {
							if (arg3 == 1) {
								local868 = local91;
								local91 = local80;
								local80 = local60;
								local60 = local49;
								local49 = local868;
							} else if (arg3 == 2) {
								local868 = local91;
								local91 = local60;
								local60 = local868;
								local868 = local80;
								local80 = local49;
								local49 = local868;
							} else if (arg3 == 3) {
								local868 = local91;
								local91 = local49;
								local49 = local60;
								local60 = local80;
								local80 = local868;
							}
						}
						if (arg6 == 4) {
							if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
								local159 = local104.method338(4, 0, local49, local60, local80, local91, -1);
							} else {
								local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 4, local104.anInt385, local91, local80, 0, 4, true);
							}
							arg7.method440(0, arg5, arg1, arg2, 0, local159, anIntArray189[arg3], local116, arg3 * 512, local130, local101);
						} else if (arg6 == 5) {
							local868 = 16;
							local257 = arg7.method457(arg1, arg5, arg2);
							if (local257 > 0) {
								local868 = Class28.method334(local257 >> 14 & 0x7FFF).anInt393;
							}
							if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
								local897 = local104.method338(4, 0, local49, local60, local80, local91, -1);
							} else {
								local897 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 4, local104.anInt385, local91, local80, 0, 4, true);
							}
							arg7.method440(anIntArray181[arg3] * local868, arg5, arg1, arg2, anIntArray182[arg3] * local868, local897, anIntArray189[arg3], local116, arg3 * 512, local130, local101);
						} else if (arg6 == 6) {
							if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
								local159 = local104.method338(4, 0, local49, local60, local80, local91, -1);
							} else {
								local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 4, local104.anInt385, local91, local80, 0, 4, true);
							}
							arg7.method440(0, arg5, arg1, arg2, 0, local159, 256, local116, arg3, local130, local101);
						} else if (arg6 == 7) {
							if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
								local159 = local104.method338(4, 0, local49, local60, local80, local91, -1);
							} else {
								local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 4, local104.anInt385, local91, local80, 0, 4, true);
							}
							arg7.method440(0, arg5, arg1, arg2, 0, local159, 512, local116, arg3, local130, local101);
						} else if (arg6 == 8) {
							if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
								local159 = local104.method338(4, 0, local49, local60, local80, local91, -1);
							} else {
								local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 4, local104.anInt385, local91, local80, 0, 4, true);
							}
							arg7.method440(0, arg5, arg1, arg2, 0, local159, 768, local116, arg3, local130, local101);
						}
					}
				}
			} else if (!aBoolean195 || local104.aBoolean126 || local104.aBoolean134) {
				if (local104.anInt385 == -1 && local104.anIntArray104 == null) {
					local159 = local104.method338(22, arg3, local49, local60, local80, local91, -1);
				} else {
					local159 = new Class4_Sub1_Sub2_Sub2(arg0, local60, local49, 22, local104.anInt385, local91, local80, arg3, 4, true);
				}
				arg7.method437(aByte31, local101, local130, arg1, local116, local159, arg2, arg5);
				if (local104.aBoolean125 && local104.aBoolean126 && arg4 != null) {
					arg4.method532(arg5, (byte) 8, arg2);
				}
			}
		} catch (@Pc(1642) RuntimeException local1642) {
			signlink.reporterror("94066, " + arg0 + ", " + -42268 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1642.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIILclient!FTMSICIZ;III)V")
	private void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(33) int local33;
			if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
				this.aByteArrayArrayArray6[arg1][arg3][arg0] = 0;
				while (true) {
					local33 = arg4.method102();
					if (local33 == 0) {
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg3][arg0] = -method507(arg3 + arg5 + 932731, arg0 + 556238 + arg6) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg1][arg3][arg0] = this.anIntArrayArrayArray5[arg1 - 1][arg3][arg0] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg4.method102();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg3][arg0] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg1][arg3][arg0] = this.anIntArrayArrayArray5[arg1 - 1][arg3][arg0] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray4[arg1][arg3][arg0] = arg4.method103();
						this.aByteArrayArrayArray7[arg1][arg3][arg0] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray2[arg1][arg3][arg0] = (byte) (local33 + arg2 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray6[arg1][arg3][arg0] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray5[arg1][arg3][arg0] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg4.method102();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg4.method102();
						return;
					}
					if (local33 <= 49) {
						arg4.method102();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("54565, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 21322 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(IIIII)V")
	public void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg3; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt759 && local3 >= 0 && local3 < this.anInt760) {
						this.aByteArrayArrayArray3[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 - 1][local3];
						}
						if (local7 == arg1 + arg2 && local7 < this.anInt759 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 - 1];
						}
						if (local3 == arg0 + arg3 && local3 < this.anInt760 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("42299, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "([Lclient!ZSRJFSKK;II[BIII)V")
	public void method519(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg0[local3].anIntArrayArray18[arg4 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class4_Sub1_Sub3 local65 = new Class4_Sub1_Sub3(arg3, (byte) 3);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method516(local75 + arg1, local11, 0, local71 + arg4, local65, arg5, arg2);
					}
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("89232, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -79 + ", " + arg5 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(ILclient!XNSGYTEG;[Lclient!ZSRJFSKK;)V")
	public void method521(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class50[] arg1) {
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
								arg1[local27].method532(local7, (byte) 8, local11);
							}
						}
					}
				}
			}
			anInt757 += (int) (Math.random() * 5.0D) - 2;
			if (anInt757 < -8) {
				anInt757 = -8;
			}
			if (anInt757 > 8) {
				anInt757 = 8;
			}
			anInt762 += (int) (Math.random() * 5.0D) - 2;
			if (anInt762 < -16) {
				anInt762 = -16;
			}
			if (anInt762 > 16) {
				anInt762 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray3[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt760 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt759 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray17[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt760; local145++) {
					this.anIntArray183[local145] = 0;
					this.anIntArray184[local145] = 0;
					this.anIntArray185[local145] = 0;
					this.anIntArray186[local145] = 0;
					this.anIntArray187[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt759 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt760; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt759) {
							local210 = this.aByteArrayArrayArray5[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class41 local378 = Class41.aClass41Array1[local210 - 1];
								this.anIntArray183[local191] += local378.anInt580;
								this.anIntArray184[local191] += local378.anInt578;
								this.anIntArray185[local191] += local378.anInt579;
								this.anIntArray186[local191] += local378.anInt581;
								local419 = this.anIntArray187[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt759) {
							local214 = this.aByteArrayArrayArray5[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class41 local451 = Class41.aClass41Array1[local214 - 1];
								this.anIntArray183[local191] -= local451.anInt580;
								this.anIntArray184[local191] -= local451.anInt578;
								this.anIntArray185[local191] -= local451.anInt579;
								this.anIntArray186[local191] -= local451.anInt581;
								local419 = this.anIntArray187[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt759 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt760 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt760) {
								local204 += this.anIntArray183[local527];
								local210 += this.anIntArray184[local527];
								local214 += this.anIntArray185[local527];
								local220 += this.anIntArray186[local527];
								local236 += this.anIntArray187[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt760) {
								local204 -= this.anIntArray183[local572];
								local210 -= this.anIntArray184[local572];
								local214 -= this.anIntArray185[local572];
								local220 -= this.anIntArray186[local572];
								local236 -= this.anIntArray187[local572];
							}
							if (local284 >= 1 && local284 < this.anInt760 - 1 && (!aBoolean195 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method506(local7, local169, local284) == anInt761)) {
								if (local7 < anInt758) {
									anInt758 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray5[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray4[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray17[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray17[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray17[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray17[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method508(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt757 & 0xFF;
										local786 += anInt762;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method508(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray7[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class41.aClass41Array1[local682 - 1].aBoolean167) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class4_Sub1_Sub1_Sub4.anIntArray209[method514(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method436(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method514(local768, local737), method514(local768, local746), method514(local768, local757), method514(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray7[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray2[local7][local169][local284];
										@Pc(941) Class41 local941 = Class41.aClass41Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt576;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class4_Sub1_Sub1_Sub4.method561(local944);
											local952 = -1;
										} else if (local941.anInt575 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class4_Sub1_Sub1_Sub4.anIntArray209[this.method510(local941.anInt582, 96)];
										} else {
											local952 = this.method508(local941.anInt577, local941.anInt578, local941.anInt579);
											local950 = Class4_Sub1_Sub1_Sub4.anIntArray209[this.method510(local941.anInt582, 96)];
										}
										arg0.method436(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method514(local768, local737), method514(local768, local746), method514(local768, local757), method514(local768, local766), this.method510(local952, local737), this.method510(local952, local746), this.method510(local952, local757), this.method510(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt760 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt759 - 1; local204++) {
						arg0.method435(local7, local204, local191, this.method506(local7, local204, local191));
					}
				}
			}
			arg0.method462();
			for (local11 = 0; local11 < this.anInt759; local11++) {
				for (local27 = 0; local27 < this.anInt760; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg0.method433(local11, (byte) 3, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1137) int local1137 = 2;
			@Pc(1139) int local1139 = 4;
			for (@Pc(1141) int local1141 = 0; local1141 < 4; local1141++) {
				if (local1141 > 0) {
					local27 <<= 0x3;
					local1137 <<= 0x3;
					local1139 <<= 0x3;
				}
				for (@Pc(1159) int local1159 = 0; local1159 <= local1141; local1159++) {
					for (local133 = 0; local133 <= this.anInt760; local133++) {
						for (local139 = 0; local139 <= this.anInt759; local139++) {
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1159][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt760 && (this.anIntArrayArrayArray6[local1159][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local139][local141];
									Class45.method434(local220, local141 * 128, local145 * 128 + 128, local139 * 128, local139 * 128, local1141, local214, 1);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local1137) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1159;
								local191 = local1159;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1159][local141 - 1][local133] & local1137) != 0) {
									local141--;
								}
								while (local145 < this.anInt759 && (this.anIntArrayArrayArray6[local1159][local145 + 1][local133] & local1137) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1137) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1141) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1137) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class45.method434(local220, local133 * 128, local133 * 128, local141 * 128, local145 * 128 + 128, local1141, local214, 2);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1137;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1159][local139][local133] & local1139) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1159][local139][local169 - 1] & local1139) != 0) {
									local169--;
								}
								while (local191 < this.anInt760 && (this.anIntArrayArrayArray6[local1159][local139][local191 + 1] & local1139) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1159][local141 - 1][local204] & local1139) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt759) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1159][local145 + 1][local204] & local1139) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1159][local141][local169];
									Class45.method434(local204, local169 * 128, local191 * 128 + 128, local141 * 128, local145 * 128 + 128, local1141, local204, 4);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1159][local210][local214] &= ~local1139;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1774) RuntimeException local1774) {
			signlink.reporterror("79484, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local1774.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIGACPUG", name = "a", descriptor = "(II[Lclient!ZSRJFSKK;[BLclient!XNSGYTEG;B)V")
	public void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class45 arg4) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg3, (byte) 3);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method116();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method116();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method102();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg0;
					@Pc(68) int local68 = local39 + arg1;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray6[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class50 local95 = null;
						if (local80 >= 0) {
							local95 = arg2[local80];
						}
						this.method512(local13, local49, local68, local60, local95, local64, local56, arg4);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("10862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 5 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}
}
