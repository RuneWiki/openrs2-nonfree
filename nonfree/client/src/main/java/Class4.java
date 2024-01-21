import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CJZJWICI")
public final class Class4 {

	@OriginalMember(owner = "client!CJZJWICI", name = "A", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "[I")
	private static final int[] anIntArray56 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!CJZJWICI", name = "d", descriptor = "I")
	private static int anInt156 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!CJZJWICI", name = "o", descriptor = "[I")
	private static final int[] anIntArray62 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!CJZJWICI", name = "p", descriptor = "I")
	private static int anInt158 = -6346;

	@OriginalMember(owner = "client!CJZJWICI", name = "q", descriptor = "I")
	private static int anInt159 = -389;

	@OriginalMember(owner = "client!CJZJWICI", name = "r", descriptor = "I")
	private static int anInt160 = 658;

	@OriginalMember(owner = "client!CJZJWICI", name = "u", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!CJZJWICI", name = "v", descriptor = "[I")
	private static final int[] anIntArray63 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!CJZJWICI", name = "x", descriptor = "I")
	public static int anInt161 = 99;

	@OriginalMember(owner = "client!CJZJWICI", name = "B", descriptor = "I")
	private static int anInt165 = 585;

	@OriginalMember(owner = "client!CJZJWICI", name = "D", descriptor = "[I")
	private static final int[] anIntArray64 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!CJZJWICI", name = "E", descriptor = "I")
	private static int anInt166 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!CJZJWICI", name = "b", descriptor = "I")
	private int anInt155 = -258;

	@OriginalMember(owner = "client!CJZJWICI", name = "k", descriptor = "I")
	private int anInt157 = 4;

	@OriginalMember(owner = "client!CJZJWICI", name = "F", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!CJZJWICI", name = "y", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!CJZJWICI", name = "z", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!CJZJWICI", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!CJZJWICI", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!CJZJWICI", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!CJZJWICI", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!CJZJWICI", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!CJZJWICI", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!CJZJWICI", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!CJZJWICI", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!CJZJWICI", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!CJZJWICI", name = "e", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!CJZJWICI", name = "f", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!CJZJWICI", name = "g", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!CJZJWICI", name = "h", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!CJZJWICI", name = "i", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(III)I")
	private static int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method87(local3, local13);
		@Pc(29) int local29 = method87(local3 + 1, local13);
		@Pc(35) int local35 = method87(local3, local13 + 1);
		@Pc(43) int local43 = method87(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method85(local23, local29, local9, arg2);
		@Pc(55) int local55 = method85(local35, local43, local9, arg2);
		return method85(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(II)I")
	private static int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CJZJWICI", name = "c", descriptor = "(III)Z")
	public static boolean method75(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class19 local2 = Class19.method182(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method173(anInt159, arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("84682, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(I[BII)Z")
	public static boolean method76(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class3_Sub1_Sub2 local9 = new Class3_Sub1_Sub2(true, arg0);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local9.method214();
				if (local18 == 0) {
					return local3;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local9.method214();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local9.method200() >> 2;
						@Pc(70) int local70 = local61 + arg1;
						@Pc(74) int local74 = local55 + arg2;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class19 local87 = Class19.method182(local15);
							if (local66 != 22 || !aBoolean32 || local87.aBoolean86 || local87.aBoolean90) {
								local3 &= local87.method176();
								local28 = true;
							}
						}
					}
					local33 = local9.method214();
					if (local33 == 0) {
						break;
					}
					local9.method200();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("6571, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(ZLclient!FJSXIAWX;Lclient!MLYYHULT;)V")
	public static void method77(@OriginalArg(1) Class8_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(9) int local9 = arg1.method214();
				if (local9 == 0) {
					return;
				}
				local3 += local9;
				@Pc(18) Class19 local18 = Class19.method182(local3);
				local18.method180(arg0);
				while (true) {
					@Pc(25) int local25 = arg1.method214();
					if (local25 == 0) {
						break;
					}
					arg1.method200();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("77032, " + true + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "b", descriptor = "(II)I")
	private static int method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method70(arg0 + 45365, arg1 + 91923, 4) + (method70(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method70(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "d", descriptor = "(II)I")
	private static int method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IIILclient!TAWLWNCF;I[[[IIILclient!OTPPFNKL;II)V")
	public static void method84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class22 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(9) int local9 = arg5[arg0][arg2][arg7];
			@Pc(19) int local19 = arg5[arg0][arg2 + 1][arg7];
			@Pc(31) int local31 = arg5[arg0][arg2 + 1][arg7 + 1];
			@Pc(41) int local41 = arg5[arg0][arg2][arg7 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class19 local54 = Class19.method182(arg10);
			@Pc(66) int local66 = arg2 + (arg7 << 7) + (arg10 << 14) + 1073741824;
			if (!local54.aBoolean86) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg1 << 6) + arg9);
			if (arg6 == anInt158) {
				@Pc(104) Class3_Sub1_Sub1 local104;
				if (arg9 == 22) {
					if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
						local104 = local54.method183(22, arg1, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, 22, local9, local19, local31, local54.anInt376, local41);
					}
					arg3.method468(local104, anInt165, local66, arg2, arg7, arg4, local80, local51);
					if (local54.aBoolean92 && local54.aBoolean86) {
						arg8.method286(arg7, arg2);
					}
				} else {
					@Pc(200) int local200;
					if (arg9 == 10 || arg9 == 11) {
						if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
							local104 = local54.method183(10, arg1, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, 10, local9, local19, local31, local54.anInt376, local41);
						}
						if (local104 != null) {
							@Pc(187) int local187 = 0;
							if (arg9 == 11) {
								local187 += 256;
							}
							@Pc(203) int local203;
							if (arg1 == 1 || arg1 == 3) {
								local200 = local54.anInt381;
								local203 = local54.anInt375;
							} else {
								local200 = local54.anInt375;
								local203 = local54.anInt381;
							}
							arg3.method472(local104, arg7, local203, arg2, local80, local66, local187, arg4, local200, local51);
						}
						if (local54.aBoolean92) {
							arg8.method285(local54.aBoolean96, local54.anInt381, arg7, local54.anInt375, arg2, arg1);
						}
					} else if (arg9 >= 12) {
						if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
							local104 = local54.method183(arg9, arg1, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, arg9, local9, local19, local31, local54.anInt376, local41);
						}
						arg3.method472(local104, arg7, 1, arg2, local80, local66, 0, arg4, 1, local51);
						if (local54.aBoolean92) {
							arg8.method285(local54.aBoolean96, local54.anInt381, arg7, local54.anInt375, arg2, arg1);
						}
					} else if (arg9 == 0) {
						if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
							local104 = local54.method183(0, arg1, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, 0, local9, local19, local31, local54.anInt376, local41);
						}
						arg3.method470(0, anIntArray63[arg1], arg4, arg7, arg2, local104, local51, local66, local80, null);
						if (local54.aBoolean92) {
							arg8.method284(local54.aBoolean96, arg9, arg7, arg2, arg1);
						}
					} else if (arg9 == 1) {
						if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
							local104 = local54.method183(1, arg1, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, 1, local9, local19, local31, local54.anInt376, local41);
						}
						arg3.method470(0, anIntArray64[arg1], arg4, arg7, arg2, local104, local51, local66, local80, null);
						if (local54.aBoolean92) {
							arg8.method284(local54.aBoolean96, arg9, arg7, arg2, arg1);
						}
					} else {
						@Pc(446) int local446;
						@Pc(475) Class3_Sub1_Sub1 local475;
						if (arg9 == 2) {
							local446 = arg1 + 1 & 0x3;
							@Pc(465) Class3_Sub1_Sub1 local465;
							if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
								local465 = local54.method183(2, arg1 + 4, local9, local19, local31, local41, -1);
								local475 = local54.method183(2, local446, local9, local19, local31, local41, -1);
							} else {
								local465 = new Class3_Sub1_Sub1_Sub3(true, arg1 + 4, arg10, (byte) 6, 2, local9, local19, local31, local54.anInt376, local41);
								local475 = new Class3_Sub1_Sub1_Sub3(true, local446, arg10, (byte) 6, 2, local9, local19, local31, local54.anInt376, local41);
							}
							arg3.method470(anIntArray63[local446], anIntArray63[arg1], arg4, arg7, arg2, local465, local51, local66, local80, local475);
							if (local54.aBoolean92) {
								arg8.method284(local54.aBoolean96, arg9, arg7, arg2, arg1);
							}
						} else if (arg9 == 3) {
							if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
								local104 = local54.method183(3, arg1, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, 3, local9, local19, local31, local54.anInt376, local41);
							}
							arg3.method470(0, anIntArray64[arg1], arg4, arg7, arg2, local104, local51, local66, local80, null);
							if (local54.aBoolean92) {
								arg8.method284(local54.aBoolean96, arg9, arg7, arg2, arg1);
							}
						} else if (arg9 == 9) {
							if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
								local104 = local54.method183(arg9, arg1, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub3(true, arg1, arg10, (byte) 6, arg9, local9, local19, local31, local54.anInt376, local41);
							}
							arg3.method472(local104, arg7, 1, arg2, local80, local66, 0, arg4, 1, local51);
							if (local54.aBoolean92) {
								arg8.method285(local54.aBoolean96, local54.anInt381, arg7, local54.anInt375, arg2, arg1);
							}
						} else {
							if (local54.aBoolean97) {
								if (arg1 == 1) {
									local446 = local41;
									local41 = local31;
									local31 = local19;
									local19 = local9;
									local9 = local446;
								} else if (arg1 == 2) {
									local446 = local41;
									local41 = local19;
									local19 = local446;
									local446 = local31;
									local31 = local9;
									local9 = local446;
								} else if (arg1 == 3) {
									local446 = local41;
									local41 = local9;
									local9 = local19;
									local19 = local31;
									local31 = local446;
								}
							}
							if (arg9 == 4) {
								if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
									local104 = local54.method183(4, 0, local9, local19, local31, local41, -1);
								} else {
									local104 = new Class3_Sub1_Sub1_Sub3(true, 0, arg10, (byte) 6, 4, local9, local19, local31, local54.anInt376, local41);
								}
								arg3.method471(arg7, 0, arg4, arg2, local104, 0, arg1 * 512, local66, anIntArray63[arg1], local51, local80);
							} else if (arg9 == 5) {
								local446 = 16;
								local200 = arg3.method488(arg4, arg2, arg7);
								if (local200 > 0) {
									local446 = Class19.method182(local200 >> 14 & 0x7FFF).anInt383;
								}
								if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
									local475 = local54.method183(4, 0, local9, local19, local31, local41, -1);
								} else {
									local475 = new Class3_Sub1_Sub1_Sub3(true, 0, arg10, (byte) 6, 4, local9, local19, local31, local54.anInt376, local41);
								}
								arg3.method471(arg7, anIntArray62[arg1] * local446, arg4, arg2, local475, anIntArray56[arg1] * local446, arg1 * 512, local66, anIntArray63[arg1], local51, local80);
							} else if (arg9 == 6) {
								if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
									local104 = local54.method183(4, 0, local9, local19, local31, local41, -1);
								} else {
									local104 = new Class3_Sub1_Sub1_Sub3(true, 0, arg10, (byte) 6, 4, local9, local19, local31, local54.anInt376, local41);
								}
								arg3.method471(arg7, 0, arg4, arg2, local104, 0, arg1, local66, 256, local51, local80);
							} else if (arg9 == 7) {
								if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
									local104 = local54.method183(4, 0, local9, local19, local31, local41, -1);
								} else {
									local104 = new Class3_Sub1_Sub1_Sub3(true, 0, arg10, (byte) 6, 4, local9, local19, local31, local54.anInt376, local41);
								}
								arg3.method471(arg7, 0, arg4, arg2, local104, 0, arg1, local66, 512, local51, local80);
							} else if (arg9 == 8) {
								if (local54.anInt376 == -1 && local54.anIntArray124 == null) {
									local104 = local54.method183(4, 0, local9, local19, local31, local41, -1);
								} else {
									local104 = new Class3_Sub1_Sub1_Sub3(true, 0, arg10, (byte) 6, 4, local9, local19, local31, local54.anInt376, local41);
								}
								arg3.method471(arg7, 0, arg4, arg2, local104, 0, arg1, local66, 768, local51, local80);
							}
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("25340, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IIII)I")
	private static int method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub1_Sub4_Sub2.anIntArray148[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "e", descriptor = "(II)I")
	private static int method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method83(arg0 - 1, arg1 - 1) + method83(arg0 + 1, arg1 - 1) + method83(arg0 - 1, arg1 + 1) + method83(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method83(arg0 - 1, arg1) + method83(arg0 + 1, arg1) + method83(arg0, arg1 - 1) + method83(arg0, arg1 + 1);
		@Pc(59) int local59 = method83(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "<init>", descriptor = "(I[[[IZ[[[BI)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			anInt161 = 99;
			this.anInt162 = arg4;
			this.anInt163 = arg0;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray2 = arg3;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt162][this.anInt163];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt162][this.anInt163];
			this.anIntArrayArrayArray2 = new int[4][this.anInt162 + 1][this.anInt163 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt162 + 1][this.anInt163 + 1];
			this.anIntArrayArray6 = new int[this.anInt162 + 1][this.anInt163 + 1];
			this.anIntArray57 = new int[this.anInt163];
			this.anIntArray58 = new int[this.anInt163];
			this.anIntArray59 = new int[this.anInt163];
			this.anIntArray60 = new int[this.anInt163];
			this.anIntArray61 = new int[this.anInt163];
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("15111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IIILclient!MLYYHULT;IIII)V")
	private void method69(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(27) int local27;
			if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
				this.aByteArrayArrayArray2[arg1][arg6][arg4] = 0;
				while (true) {
					local27 = arg2.method200();
					if (local27 == 0) {
						if (arg1 == 0) {
							this.anIntArrayArrayArray1[0][arg6][arg4] = -method79(arg6 + arg5 + 932731, arg4 + 556238 + arg0) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg1][arg6][arg4] = this.anIntArrayArrayArray1[arg1 - 1][arg6][arg4] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg2.method200();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg1 == 0) {
							this.anIntArrayArrayArray1[0][arg6][arg4] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg1][arg6][arg4] = this.anIntArrayArrayArray1[arg1 - 1][arg6][arg4] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray4[arg1][arg6][arg4] = arg2.method201();
						this.aByteArrayArrayArray5[arg1][arg6][arg4] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray1[arg1][arg6][arg4] = (byte) (local27 + arg3 - 2 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray2[arg1][arg6][arg4] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray6[arg1][arg6][arg4] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg2.method200();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg2.method200();
						return;
					}
					if (local27 <= 49) {
						arg2.method200();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("4316, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "b", descriptor = "(III)I")
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(I[Lclient!OTPPFNKL;BLclient!TAWLWNCF;I[B)V")
	public void method73(@OriginalArg(0) int arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(18) Class3_Sub1_Sub2 local18 = new Class3_Sub1_Sub2(true, arg4);
			@Pc(20) int local20 = -1;
			while (true) {
				@Pc(23) int local23 = local18.method214();
				if (local23 == 0) {
					return;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local18.method214();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local18.method200();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					@Pc(71) int local71 = local52 + arg3;
					@Pc(75) int local75 = local46 + arg0;
					if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
						@Pc(87) int local87 = local56;
						if ((this.aByteArrayArrayArray2[1][local71][local75] & 0x2) == 2) {
							local87 = local56 - 1;
						}
						@Pc(102) Class22 local102 = null;
						if (local87 >= 0) {
							local102 = arg1[local87];
						}
						this.method78(local102, local63, arg2, local75, local67, local71, local20, local56);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("47360, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IIII[Lclient!OTPPFNKL;IIBLclient!TAWLWNCF;[BI)V")
	public void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class34 arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(true, arg9);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(20) int local20 = local7.method214();
				if (local20 == 0) {
					return;
				}
				local9 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method214();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method200();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					if (local53 == arg0 && local49 >= arg6 && local49 < arg6 + 8 && local43 >= arg2 && local43 < arg2 + 8) {
						@Pc(86) Class19 local86 = Class19.method182(local9);
						@Pc(103) int local103 = arg3 + Class18.method171(arg5, local86.anInt375, local43 & 0x7, local49 & 0x7, local64, local86.anInt381);
						@Pc(120) int local120 = arg1 + Class18.method172(local86.anInt375, local43 & 0x7, local86.anInt381, local64, arg5, local49 & 0x7);
						if (local103 > 0 && local120 > 0 && local103 < 103 && local120 < 103) {
							@Pc(132) int local132 = arg10;
							if ((this.aByteArrayArrayArray2[1][local103][local120] & 0x2) == 2) {
								local132 = arg10 - 1;
							}
							@Pc(147) Class22 local147 = null;
							if (local132 >= 0) {
								local147 = arg4[local132];
							}
							this.method78(local147, local60, arg8, local120, local64 + arg5 & 0x3, local103, local9, arg10);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("38204, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(Lclient!OTPPFNKL;IILclient!TAWLWNCF;IIIII)V")
	private void method78(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean32 && (this.aByteArrayArrayArray2[0][arg5][arg3] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray2[arg7][arg5][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method86(arg5, arg7, arg3) != anInt164) {
					return;
				}
			}
			if (arg7 < anInt161) {
				anInt161 = arg7;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg7][arg5][arg3];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg7][arg5 + 1][arg3];
			@Pc(73) int local73 = this.anIntArrayArrayArray1[arg7][arg5 + 1][arg3 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg7][arg5][arg3 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class19 local97 = Class19.method182(arg6);
			@Pc(114) int local114 = arg5 + (arg3 << 7) + (arg6 << 14) + 1073741824;
			if (!local97.aBoolean86) {
				local114 += Integer.MIN_VALUE;
			}
			@Pc(128) byte local128 = (byte) ((arg4 << 6) + arg1);
			@Pc(157) Class3_Sub1_Sub1 local157;
			if (arg1 != 22) {
				@Pc(255) int local255;
				if (arg1 == 10 || arg1 == 11) {
					if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
						local157 = local97.method183(10, arg4, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, 10, local49, local60, local73, local97.anInt376, local84);
					}
					if (local157 != null) {
						@Pc(242) int local242 = 0;
						if (arg1 == 11) {
							local242 += 256;
						}
						@Pc(258) int local258;
						if (arg4 == 1 || arg4 == 3) {
							local255 = local97.anInt381;
							local258 = local97.anInt375;
						} else {
							local255 = local97.anInt375;
							local258 = local97.anInt381;
						}
						if (arg2.method472(local157, arg3, local258, arg5, local128, local114, local242, arg7, local255, local94) && local97.aBoolean89) {
							@Pc(289) Class3_Sub1_Sub1_Sub1 local289;
							if (local157 instanceof Class3_Sub1_Sub1_Sub1) {
								local289 = (Class3_Sub1_Sub1_Sub1) local157;
							} else {
								local289 = local97.method183(10, arg4, local49, local60, local73, local84, -1);
							}
							if (local289 != null) {
								for (@Pc(305) int local305 = 0; local305 <= local255; local305++) {
									for (@Pc(309) int local309 = 0; local309 <= local258; local309++) {
										@Pc(316) int local316 = local289.anInt26 / 4;
										if (local316 > 30) {
											local316 = 30;
										}
										if (local316 > this.aByteArrayArrayArray3[arg7][arg5 + local305][arg3 + local309]) {
											this.aByteArrayArrayArray3[arg7][arg5 + local305][arg3 + local309] = (byte) local316;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean92 && arg0 != null) {
						arg0.method285(local97.aBoolean96, local97.anInt381, arg3, local97.anInt375, arg5, arg4);
					}
				} else if (arg1 >= 12) {
					if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
						local157 = local97.method183(arg1, arg4, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, arg1, local49, local60, local73, local97.anInt376, local84);
					}
					arg2.method472(local157, arg3, 1, arg5, local128, local114, 0, arg7, 1, local94);
					if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x924;
					}
					if (local97.aBoolean92 && arg0 != null) {
						arg0.method285(local97.aBoolean96, local97.anInt381, arg3, local97.anInt375, arg5, arg4);
					}
				} else if (arg1 == 0) {
					if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
						local157 = local97.method183(0, arg4, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, 0, local49, local60, local73, local97.anInt376, local84);
					}
					arg2.method470(0, anIntArray63[arg4], arg7, arg3, arg5, local157, local94, local114, local128, null);
					if (arg4 == 0) {
						if (local97.aBoolean89) {
							this.aByteArrayArrayArray3[arg7][arg5][arg3] = 50;
							this.aByteArrayArrayArray3[arg7][arg5][arg3 + 1] = 50;
						}
						if (local97.aBoolean88) {
							this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x249;
						}
					} else if (arg4 == 1) {
						if (local97.aBoolean89) {
							this.aByteArrayArrayArray3[arg7][arg5][arg3 + 1] = 50;
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3 + 1] = 50;
						}
						if (local97.aBoolean88) {
							this.anIntArrayArrayArray2[arg7][arg5][arg3 + 1] |= 0x492;
						}
					} else if (arg4 == 2) {
						if (local97.aBoolean89) {
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3] = 50;
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3 + 1] = 50;
						}
						if (local97.aBoolean88) {
							this.anIntArrayArrayArray2[arg7][arg5 + 1][arg3] |= 0x249;
						}
					} else if (arg4 == 3) {
						if (local97.aBoolean89) {
							this.aByteArrayArrayArray3[arg7][arg5][arg3] = 50;
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3] = 50;
						}
						if (local97.aBoolean88) {
							this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x492;
						}
					}
					if (local97.aBoolean92 && arg0 != null) {
						arg0.method284(local97.aBoolean96, arg1, arg3, arg5, arg4);
					}
					if (local97.anInt383 != 16) {
						arg2.method478(arg3, arg5, local97.anInt383, arg7);
					}
				} else if (arg1 == 1) {
					if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
						local157 = local97.method183(1, arg4, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, 1, local49, local60, local73, local97.anInt376, local84);
					}
					arg2.method470(0, anIntArray64[arg4], arg7, arg3, arg5, local157, local94, local114, local128, null);
					if (local97.aBoolean89) {
						if (arg4 == 0) {
							this.aByteArrayArrayArray3[arg7][arg5][arg3 + 1] = 50;
						} else if (arg4 == 1) {
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3 + 1] = 50;
						} else if (arg4 == 2) {
							this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3] = 50;
						} else if (arg4 == 3) {
							this.aByteArrayArrayArray3[arg7][arg5][arg3] = 50;
						}
					}
					if (local97.aBoolean92 && arg0 != null) {
						arg0.method284(local97.aBoolean96, arg1, arg3, arg5, arg4);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class3_Sub1_Sub1 local895;
					if (arg1 == 2) {
						local866 = arg4 + 1 & 0x3;
						@Pc(885) Class3_Sub1_Sub1 local885;
						if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
							local885 = local97.method183(2, arg4 + 4, local49, local60, local73, local84, -1);
							local895 = local97.method183(2, local866, local49, local60, local73, local84, -1);
						} else {
							local885 = new Class3_Sub1_Sub1_Sub3(true, arg4 + 4, arg6, (byte) 6, 2, local49, local60, local73, local97.anInt376, local84);
							local895 = new Class3_Sub1_Sub1_Sub3(true, local866, arg6, (byte) 6, 2, local49, local60, local73, local97.anInt376, local84);
						}
						arg2.method470(anIntArray63[local866], anIntArray63[arg4], arg7, arg3, arg5, local885, local94, local114, local128, local895);
						if (local97.aBoolean88) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg5][arg3 + 1] |= 0x492;
							} else if (arg4 == 1) {
								this.anIntArrayArrayArray2[arg7][arg5][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg5 + 1][arg3] |= 0x249;
							} else if (arg4 == 2) {
								this.anIntArrayArrayArray2[arg7][arg5 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x492;
							} else if (arg4 == 3) {
								this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg5][arg3] |= 0x249;
							}
						}
						if (local97.aBoolean92 && arg0 != null) {
							arg0.method284(local97.aBoolean96, arg1, arg3, arg5, arg4);
						}
						if (local97.anInt383 != 16) {
							arg2.method478(arg3, arg5, local97.anInt383, arg7);
						}
					} else if (arg1 == 3) {
						if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
							local157 = local97.method183(3, arg4, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, 3, local49, local60, local73, local97.anInt376, local84);
						}
						arg2.method470(0, anIntArray64[arg4], arg7, arg3, arg5, local157, local94, local114, local128, null);
						if (local97.aBoolean89) {
							if (arg4 == 0) {
								this.aByteArrayArrayArray3[arg7][arg5][arg3 + 1] = 50;
							} else if (arg4 == 1) {
								this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3 + 1] = 50;
							} else if (arg4 == 2) {
								this.aByteArrayArrayArray3[arg7][arg5 + 1][arg3] = 50;
							} else if (arg4 == 3) {
								this.aByteArrayArrayArray3[arg7][arg5][arg3] = 50;
							}
						}
						if (local97.aBoolean92 && arg0 != null) {
							arg0.method284(local97.aBoolean96, arg1, arg3, arg5, arg4);
						}
					} else if (arg1 == 9) {
						if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
							local157 = local97.method183(arg1, arg4, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, arg1, local49, local60, local73, local97.anInt376, local84);
						}
						arg2.method472(local157, arg3, 1, arg5, local128, local114, 0, arg7, 1, local94);
						if (local97.aBoolean92 && arg0 != null) {
							arg0.method285(local97.aBoolean96, local97.anInt381, arg3, local97.anInt375, arg5, arg4);
						}
					} else {
						if (local97.aBoolean97) {
							if (arg4 == 1) {
								local866 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local866;
							} else if (arg4 == 2) {
								local866 = local84;
								local84 = local60;
								local60 = local866;
								local866 = local73;
								local73 = local49;
								local49 = local866;
							} else if (arg4 == 3) {
								local866 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local866;
							}
						}
						if (arg1 == 4) {
							if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
								local157 = local97.method183(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class3_Sub1_Sub1_Sub3(true, 0, arg6, (byte) 6, 4, local49, local60, local73, local97.anInt376, local84);
							}
							arg2.method471(arg3, 0, arg7, arg5, local157, 0, arg4 * 512, local114, anIntArray63[arg4], local94, local128);
						} else if (arg1 == 5) {
							local866 = 16;
							local255 = arg2.method488(arg7, arg5, arg3);
							if (local255 > 0) {
								local866 = Class19.method182(local255 >> 14 & 0x7FFF).anInt383;
							}
							if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
								local895 = local97.method183(4, 0, local49, local60, local73, local84, -1);
							} else {
								local895 = new Class3_Sub1_Sub1_Sub3(true, 0, arg6, (byte) 6, 4, local49, local60, local73, local97.anInt376, local84);
							}
							arg2.method471(arg3, anIntArray62[arg4] * local866, arg7, arg5, local895, anIntArray56[arg4] * local866, arg4 * 512, local114, anIntArray63[arg4], local94, local128);
						} else if (arg1 == 6) {
							if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
								local157 = local97.method183(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class3_Sub1_Sub1_Sub3(true, 0, arg6, (byte) 6, 4, local49, local60, local73, local97.anInt376, local84);
							}
							arg2.method471(arg3, 0, arg7, arg5, local157, 0, arg4, local114, 256, local94, local128);
						} else if (arg1 == 7) {
							if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
								local157 = local97.method183(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class3_Sub1_Sub1_Sub3(true, 0, arg6, (byte) 6, 4, local49, local60, local73, local97.anInt376, local84);
							}
							arg2.method471(arg3, 0, arg7, arg5, local157, 0, arg4, local114, 512, local94, local128);
						} else if (arg1 == 8) {
							if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
								local157 = local97.method183(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class3_Sub1_Sub1_Sub3(true, 0, arg6, (byte) 6, 4, local49, local60, local73, local97.anInt376, local84);
							}
							arg2.method471(arg3, 0, arg7, arg5, local157, 0, arg4, local114, 768, local94, local128);
						}
					}
				}
			} else if (!aBoolean32 || local97.aBoolean86 || local97.aBoolean90) {
				if (local97.anInt376 == -1 && local97.anIntArray124 == null) {
					local157 = local97.method183(22, arg4, local49, local60, local73, local84, -1);
				} else {
					local157 = new Class3_Sub1_Sub1_Sub3(true, arg4, arg6, (byte) 6, 22, local49, local60, local73, local97.anInt376, local84);
				}
				arg2.method468(local157, anInt165, local114, arg5, arg3, arg7, local128, local94);
				if (local97.aBoolean92 && local97.aBoolean86 && arg0 != null) {
					arg0.method286(arg3, arg5);
				}
			}
		} catch (@Pc(1640) RuntimeException local1640) {
			signlink.reporterror("76313, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1640.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "c", descriptor = "(II)I")
	private int method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "([BI[Lclient!OTPPFNKL;IIII)V")
	public void method81(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg3 + local11 > 0 && arg3 + local11 < 103) {
							arg2[local3].anIntArrayArray15[arg1 + local7][arg3 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class3_Sub1_Sub2 local65 = new Class3_Sub1_Sub2(true, arg0);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method69(arg4, local11, local65, 0, local75 + arg3, arg5, local71 + arg1);
					}
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("9730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IBI[Lclient!OTPPFNKL;II[BIII)V")
	public void method82(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg3 + local7 > 0 && arg3 + local7 < 103) {
						arg2[arg6].anIntArrayArray15[arg4 + local3][arg3 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class3_Sub1_Sub2 local57 = new Class3_Sub1_Sub2(true, arg5);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg1 && local63 >= arg8 && local63 < arg8 + 8 && local67 >= arg0 && local67 < arg0 + 8) {
							this.method69(0, arg6, local57, arg7, arg3 + Class18.method170(arg7, this.anInt157, local67 & 0x7, local63 & 0x7), 0, arg4 + Class18.method169(arg7, local67 & 0x7, local63 & 0x7));
						} else {
							this.method69(0, 0, local57, 0, -1, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("29518, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "b", descriptor = "(IIII)I")
	private int method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray2[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray2[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("4795, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(B[Lclient!OTPPFNKL;Lclient!TAWLWNCF;)V")
	public void method88(@OriginalArg(1) Class22[] arg0, @OriginalArg(2) Class34 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray2[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method286(local11, local7);
							}
						}
					}
				}
			}
			anInt156 += (int) (Math.random() * 5.0D) - 2;
			if (anInt156 < -8) {
				anInt156 = -8;
			}
			if (anInt156 > 8) {
				anInt156 = 8;
			}
			anInt166 += (int) (Math.random() * 5.0D) - 2;
			if (anInt166 < -16) {
				anInt166 = -16;
			}
			if (anInt166 > 16) {
				anInt166 = 16;
			}
			@Pc(138) int local138;
			@Pc(144) int local144;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(174) int local174;
			@Pc(196) int local196;
			@Pc(209) int local209;
			@Pc(215) int local215;
			@Pc(219) int local219;
			@Pc(225) int local225;
			@Pc(241) int local241;
			@Pc(289) int local289;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(113) byte[][] local113 = this.aByteArrayArrayArray3[local7];
				local138 = (int) Math.sqrt((double) 5100);
				local144 = local138 * 768 >> 8;
				for (local146 = 1; local146 < this.anInt163 - 1; local146++) {
					for (local150 = 1; local150 < this.anInt162 - 1; local150++) {
						local174 = this.anIntArrayArrayArray1[local7][local150 + 1][local146] - this.anIntArrayArrayArray1[local7][local150 - 1][local146];
						local196 = this.anIntArrayArrayArray1[local7][local150][local146 + 1] - this.anIntArrayArrayArray1[local7][local150][local146 - 1];
						local209 = (int) Math.sqrt((double) (local174 * local174 + local196 * local196 + 65536));
						local215 = (local174 << 8) / local209;
						local219 = 65536 / local209;
						local225 = (local196 << 8) / local209;
						local241 = (local215 * -50 + local219 * -10 + local225 * -50) / local144 + 96;
						local289 = (local113[local150 - 1][local146] >> 2) + (local113[local150 + 1][local146] >> 3) + (local113[local150][local146 - 1] >> 2) + (local113[local150][local146 + 1] >> 3) + (local113[local150][local146] >> 1);
						this.anIntArrayArray6[local150][local146] = local241 - local289;
					}
				}
				for (local150 = 0; local150 < this.anInt163; local150++) {
					this.anIntArray57[local150] = 0;
					this.anIntArray58[local150] = 0;
					this.anIntArray59[local150] = 0;
					this.anIntArray60[local150] = 0;
					this.anIntArray61[local150] = 0;
				}
				for (local174 = -5; local174 < this.anInt162 + 5; local174++) {
					for (local196 = 0; local196 < this.anInt163; local196++) {
						local209 = local174 + 5;
						@Pc(424) int local424;
						if (local209 >= 0 && local209 < this.anInt162) {
							local215 = this.aByteArrayArrayArray6[local7][local209][local196] & 0xFF;
							if (local215 > 0) {
								@Pc(383) Class33 local383 = Class33.aClass33Array1[local215 - 1];
								this.anIntArray57[local196] += local383.anInt655;
								this.anIntArray58[local196] += local383.anInt653;
								this.anIntArray59[local196] += local383.anInt654;
								this.anIntArray60[local196] += local383.anInt656;
								local424 = this.anIntArray61[local196]++;
							}
						}
						local215 = local174 - 5;
						if (local215 >= 0 && local215 < this.anInt162) {
							local219 = this.aByteArrayArrayArray6[local7][local215][local196] & 0xFF;
							if (local219 > 0) {
								@Pc(456) Class33 local456 = Class33.aClass33Array1[local219 - 1];
								this.anIntArray57[local196] -= local456.anInt655;
								this.anIntArray58[local196] -= local456.anInt653;
								this.anIntArray59[local196] -= local456.anInt654;
								this.anIntArray60[local196] -= local456.anInt656;
								local424 = this.anIntArray61[local196]--;
							}
						}
					}
					if (local174 >= 1 && local174 < this.anInt162 - 1) {
						local209 = 0;
						local215 = 0;
						local219 = 0;
						local225 = 0;
						local241 = 0;
						for (local289 = -5; local289 < this.anInt163 + 5; local289++) {
							@Pc(532) int local532 = local289 + 5;
							if (local532 >= 0 && local532 < this.anInt163) {
								local209 += this.anIntArray57[local532];
								local215 += this.anIntArray58[local532];
								local219 += this.anIntArray59[local532];
								local225 += this.anIntArray60[local532];
								local241 += this.anIntArray61[local532];
							}
							@Pc(577) int local577 = local289 - 5;
							if (local577 >= 0 && local577 < this.anInt163) {
								local209 -= this.anIntArray57[local577];
								local215 -= this.anIntArray58[local577];
								local219 -= this.anIntArray59[local577];
								local225 -= this.anIntArray60[local577];
								local241 -= this.anIntArray61[local577];
							}
							if (local289 >= 1 && local289 < this.anInt163 - 1 && (!aBoolean32 || (this.aByteArrayArrayArray2[0][local174][local289] & 0x2) != 0 || (this.aByteArrayArrayArray2[local7][local174][local289] & 0x10) == 0 && this.method86(local174, local7, local289) == anInt164)) {
								if (local7 < anInt161) {
									anInt161 = local7;
								}
								@Pc(676) int local676 = this.aByteArrayArrayArray6[local7][local174][local289] & 0xFF;
								@Pc(687) int local687 = this.aByteArrayArrayArray4[local7][local174][local289] & 0xFF;
								if (local676 > 0 || local687 > 0) {
									@Pc(700) int local700 = this.anIntArrayArrayArray1[local7][local174][local289];
									@Pc(711) int local711 = this.anIntArrayArrayArray1[local7][local174 + 1][local289];
									@Pc(724) int local724 = this.anIntArrayArrayArray1[local7][local174 + 1][local289 + 1];
									@Pc(735) int local735 = this.anIntArrayArrayArray1[local7][local174][local289 + 1];
									@Pc(742) int local742 = this.anIntArrayArray6[local174][local289];
									@Pc(751) int local751 = this.anIntArrayArray6[local174 + 1][local289];
									@Pc(762) int local762 = this.anIntArrayArray6[local174 + 1][local289 + 1];
									@Pc(771) int local771 = this.anIntArrayArray6[local174][local289 + 1];
									@Pc(773) int local773 = -1;
									@Pc(775) int local775 = -1;
									@Pc(783) int local783;
									@Pc(787) int local787;
									if (local676 > 0) {
										local783 = local209 * 256 / local225;
										local787 = local215 / local241;
										@Pc(791) int local791 = local219 / local241;
										local773 = this.method71(local783, local787, local791);
										@Pc(803) int local803 = local783 + anInt156 & 0xFF;
										local791 += anInt166;
										if (local791 < 0) {
											local791 = 0;
										} else if (local791 > 255) {
											local791 = 255;
										}
										local775 = this.method71(local803, local787, local791);
									}
									if (local7 > 0) {
										@Pc(828) boolean local828 = true;
										if (local676 == 0 && this.aByteArrayArrayArray5[local7][local174][local289] != 0) {
											local828 = false;
										}
										if (local687 > 0 && !Class33.aClass33Array1[local687 - 1].aBoolean175) {
											local828 = false;
										}
										if (local828 && local700 == local711 && local700 == local724 && local700 == local735) {
											this.anIntArrayArrayArray2[local7][local174][local289] |= 0x924;
										}
									}
									local783 = 0;
									if (local773 != -1) {
										local783 = Class3_Sub1_Sub4_Sub2.anIntArray152[method72(local775, 96)];
									}
									if (local687 == 0) {
										arg1.method467(local7, local174, local289, 0, 0, -1, local700, local711, local724, local735, method72(local773, local742), method72(local773, local751), method72(local773, local762), method72(local773, local771), 0, 0, 0, 0, local783, 0);
									} else {
										local787 = this.aByteArrayArrayArray5[local7][local174][local289] + 1;
										@Pc(940) byte local940 = this.aByteArrayArrayArray1[local7][local174][local289];
										@Pc(946) Class33 local946 = Class33.aClass33Array1[local687 - 1];
										@Pc(949) int local949 = local946.anInt651;
										@Pc(957) int local957;
										@Pc(955) int local955;
										if (local949 >= 0) {
											local955 = Class3_Sub1_Sub4_Sub2.method368(local949);
											local957 = -1;
										} else if (local946.anInt650 == 16711935) {
											local955 = 0;
											local957 = -2;
											local949 = -1;
										} else {
											local957 = this.method71(local946.anInt652, local946.anInt653, local946.anInt654);
											local955 = Class3_Sub1_Sub4_Sub2.anIntArray152[this.method80(local946.anInt657, 96)];
										}
										arg1.method467(local7, local174, local289, local787, local940, local949, local700, local711, local724, local735, method72(local773, local742), method72(local773, local751), method72(local773, local762), method72(local773, local771), this.method80(local957, local742), this.method80(local957, local751), this.method80(local957, local762), this.method80(local957, local771), local783, local955);
									}
								}
							}
						}
					}
				}
				for (local196 = 1; local196 < this.anInt163 - 1; local196++) {
					for (local209 = 1; local209 < this.anInt162 - 1; local209++) {
						arg1.method466(local7, local209, local196, this.method86(local209, local7, local196));
					}
				}
			}
			arg1.method493();
			for (local11 = 0; local11 < this.anInt162; local11++) {
				for (local27 = 0; local27 < this.anInt163; local27++) {
					if ((this.aByteArrayArrayArray2[1][local11][local27] & 0x2) == 2) {
						arg1.method464(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1126) int local1126 = 2;
			@Pc(1128) int local1128 = 4;
			for (@Pc(1130) int local1130 = 0; local1130 < 4; local1130++) {
				if (local1130 > 0) {
					local27 <<= 0x3;
					local1126 <<= 0x3;
					local1128 <<= 0x3;
				}
				for (@Pc(1148) int local1148 = 0; local1148 <= local1130; local1148++) {
					for (local138 = 0; local138 <= this.anInt163; local138++) {
						for (local144 = 0; local144 <= this.anInt162; local144++) {
							if ((this.anIntArrayArrayArray2[local1148][local144][local138] & local27) != 0) {
								local146 = local138;
								local150 = local138;
								local174 = local1148;
								local196 = local1148;
								while (local146 > 0 && (this.anIntArrayArrayArray2[local1148][local144][local146 - 1] & local27) != 0) {
									local146--;
								}
								while (local150 < this.anInt163 && (this.anIntArrayArrayArray2[local1148][local144][local150 + 1] & local27) != 0) {
									local150++;
								}
								label328: while (local174 > 0) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray2[local174 - 1][local144][local209] & local27) == 0) {
											break label328;
										}
									}
									local174--;
								}
								label317: while (local196 < local1130) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray2[local196 + 1][local144][local209] & local27) == 0) {
											break label317;
										}
									}
									local196++;
								}
								local209 = (local196 + 1 - local174) * (local150 + 1 - local146);
								if (local209 >= 8) {
									local219 = this.anIntArrayArrayArray1[local196][local144][local146] - 240;
									local225 = this.anIntArrayArrayArray1[local174][local144][local146];
									Class34.method465(local225, local146 * 128, local144 * 128, local219, local1130, local144 * 128, local150 * 128 + 128, 1);
									for (local241 = local174; local241 <= local196; local241++) {
										for (local289 = local146; local289 <= local150; local289++) {
											this.anIntArrayArrayArray2[local241][local144][local289] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1148][local144][local138] & local1126) != 0) {
								local146 = local144;
								local150 = local144;
								local174 = local1148;
								local196 = local1148;
								while (local146 > 0 && (this.anIntArrayArrayArray2[local1148][local146 - 1][local138] & local1126) != 0) {
									local146--;
								}
								while (local150 < this.anInt162 && (this.anIntArrayArrayArray2[local1148][local150 + 1][local138] & local1126) != 0) {
									local150++;
								}
								label381: while (local174 > 0) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray2[local174 - 1][local209][local138] & local1126) == 0) {
											break label381;
										}
									}
									local174--;
								}
								label370: while (local196 < local1130) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray2[local196 + 1][local209][local138] & local1126) == 0) {
											break label370;
										}
									}
									local196++;
								}
								local209 = (local196 + 1 - local174) * (local150 + 1 - local146);
								if (local209 >= 8) {
									local219 = this.anIntArrayArrayArray1[local196][local146][local138] - 240;
									local225 = this.anIntArrayArrayArray1[local174][local146][local138];
									Class34.method465(local225, local138 * 128, local146 * 128, local219, local1130, local150 * 128 + 128, local138 * 128, 2);
									for (local241 = local174; local241 <= local196; local241++) {
										for (local289 = local146; local289 <= local150; local289++) {
											this.anIntArrayArrayArray2[local241][local289][local138] &= ~local1126;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1148][local144][local138] & local1128) != 0) {
								local146 = local144;
								local150 = local144;
								local174 = local138;
								local196 = local138;
								while (local174 > 0 && (this.anIntArrayArrayArray2[local1148][local144][local174 - 1] & local1128) != 0) {
									local174--;
								}
								while (local196 < this.anInt163 && (this.anIntArrayArrayArray2[local1148][local144][local196 + 1] & local1128) != 0) {
									local196++;
								}
								label434: while (local146 > 0) {
									for (local209 = local174; local209 <= local196; local209++) {
										if ((this.anIntArrayArrayArray2[local1148][local146 - 1][local209] & local1128) == 0) {
											break label434;
										}
									}
									local146--;
								}
								label423: while (local150 < this.anInt162) {
									for (local209 = local174; local209 <= local196; local209++) {
										if ((this.anIntArrayArrayArray2[local1148][local150 + 1][local209] & local1128) == 0) {
											break label423;
										}
									}
									local150++;
								}
								if ((local150 + 1 - local146) * (local196 + 1 - local174) >= 4) {
									local209 = this.anIntArrayArrayArray1[local1148][local146][local174];
									Class34.method465(local209, local174 * 128, local146 * 128, local209, local1130, local150 * 128 + 128, local196 * 128 + 128, 4);
									for (local215 = local146; local215 <= local150; local215++) {
										for (local219 = local174; local219 <= local196; local219++) {
											this.anIntArrayArrayArray2[local1148][local215][local219] &= ~local1128;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1763) RuntimeException local1763) {
			signlink.reporterror("66151, " + 61 + ", " + arg0 + ", " + arg1 + ", " + local1763.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CJZJWICI", name = "a", descriptor = "(IIIII)V")
	public void method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg4; local3++) {
				for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg0; local7++) {
					if (local7 >= 0 && local7 < this.anInt162 && local3 >= 0 && local3 < this.anInt163) {
						this.aByteArrayArrayArray3[0][local7][local3] = 127;
						if (local7 == arg2 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg2 + arg0 && local7 < this.anInt162 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg4 && local3 < this.anInt163 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
			@Pc(150) boolean local150 = false;
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("89957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
