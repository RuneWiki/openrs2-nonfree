import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LVLPWFEX")
public final class Class29 {

	@OriginalMember(owner = "client!LVLPWFEX", name = "d", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!LVLPWFEX", name = "q", descriptor = "I")
	public static int anInt524;

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "I")
	private static int anInt516 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!LVLPWFEX", name = "e", descriptor = "[I")
	private static final int[] anIntArray131 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!LVLPWFEX", name = "f", descriptor = "Z")
	public static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!LVLPWFEX", name = "g", descriptor = "I")
	private static int anInt518 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!LVLPWFEX", name = "h", descriptor = "I")
	private static int anInt519 = 317;

	@OriginalMember(owner = "client!LVLPWFEX", name = "k", descriptor = "[I")
	private static final int[] anIntArray132 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!LVLPWFEX", name = "n", descriptor = "I")
	public static int anInt521 = 99;

	@OriginalMember(owner = "client!LVLPWFEX", name = "x", descriptor = "[I")
	private static final int[] anIntArray138 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!LVLPWFEX", name = "y", descriptor = "[I")
	private static final int[] anIntArray139 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!LVLPWFEX", name = "i", descriptor = "I")
	private int anInt520 = -5592;

	@OriginalMember(owner = "client!LVLPWFEX", name = "z", descriptor = "I")
	private int anInt525 = -13936;

	@OriginalMember(owner = "client!LVLPWFEX", name = "A", descriptor = "I")
	private int anInt526 = 293;

	@OriginalMember(owner = "client!LVLPWFEX", name = "o", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!LVLPWFEX", name = "p", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!LVLPWFEX", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!LVLPWFEX", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!LVLPWFEX", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!LVLPWFEX", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!LVLPWFEX", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!LVLPWFEX", name = "B", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!LVLPWFEX", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!LVLPWFEX", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!LVLPWFEX", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!LVLPWFEX", name = "r", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!LVLPWFEX", name = "s", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!LVLPWFEX", name = "t", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!LVLPWFEX", name = "u", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!LVLPWFEX", name = "v", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(II)I")
	private static int method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method420(arg0 + 45365, arg1 + 91923, 4) + (method420(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method420(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "b", descriptor = "(II)I")
	private static int method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(IIII)I")
	private static int method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class4_Sub1_Sub2_Sub3.anIntArray145[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "c", descriptor = "(II)I")
	private static int method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!LVLPWFEX", name = "e", descriptor = "(II)I")
	private static int method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method409(arg0 - 1, arg1 - 1) + method409(arg0 + 1, arg1 - 1) + method409(arg0 - 1, arg1 + 1) + method409(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method409(arg0 - 1, arg1) + method409(arg0 + 1, arg1) + method409(arg0, arg1 - 1) + method409(arg0, arg1 + 1);
		@Pc(59) int local59 = method409(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(Z[BII)Z")
	public static boolean method419(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) boolean local9 = true;
			@Pc(15) Class4_Sub1_Sub3 local15 = new Class4_Sub1_Sub3(arg0, false);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local15.method181();
				if (local20 == 0) {
					return local9;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local15.method181();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local15.method167() >> 2;
						@Pc(72) int local72 = local63 + arg1;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class20 local89 = Class20.method236(local17);
							if (local68 != 22 || !aBoolean150 || local89.aBoolean85 || local89.aBoolean83) {
								local9 &= local89.method232();
								local30 = true;
							}
						}
					}
					local35 = local15.method181();
					if (local35 == 0) {
						break;
					}
					local15.method167();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("43793, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "b", descriptor = "(III)I")
	private static int method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method416(local3, local13);
		@Pc(29) int local29 = method416(local3 + 1, local13);
		@Pc(35) int local35 = method416(local3, local13 + 1);
		@Pc(43) int local43 = method416(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method412(local23, local29, local9, arg2);
		@Pc(55) int local55 = method412(local35, local43, local9, arg2);
		return method412(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(Lclient!EGCCHUZS;Lclient!DHNAQSHE;I)V")
	public static void method423(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(11) int local11 = arg0.method181();
				if (local11 == 0) {
					return;
				}
				local3 += local11;
				@Pc(20) Class20 local20 = Class20.method236(local3);
				local20.method230(arg1);
				while (true) {
					@Pc(27) int local27 = arg0.method181();
					if (local27 == 0) {
						break;
					}
					arg0.method167();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("74927, " + arg0 + ", " + arg1 + ", " + -41384 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(Lclient!KYNTOGBR;[[[IIIILclient!BXNXROZD;IIIII)V")
	public static void method424(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg2][arg6][arg7];
			@Pc(19) int local19 = arg1[arg2][arg6 + 1][arg7];
			@Pc(31) int local31 = arg1[arg2][arg6 + 1][arg7 + 1];
			@Pc(41) int local41 = arg1[arg2][arg6][arg7 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class20 local54 = Class20.method236(arg4);
			@Pc(66) int local66 = arg6 + (arg7 << 7) + (arg4 << 14) + 1073741824;
			if (!local54.aBoolean85) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg9 << 6) + arg3);
			@Pc(104) Class4_Sub1_Sub1 local104;
			if (arg3 == 22) {
				if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
					local104 = local54.method231(22, arg9, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, 22, true, local31, 18451, local41);
				}
				arg0.method348(arg8, local84, local51, arg7, local66, arg6, local104);
				if (local54.aBoolean89 && local54.aBoolean85) {
					arg5.method15(arg6, arg7);
				}
			} else {
				@Pc(200) int local200;
				if (arg3 == 10 || arg3 == 11) {
					if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
						local104 = local54.method231(10, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, 10, true, local31, 18451, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg3 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg9 == 1 || arg9 == 3) {
							local200 = local54.anInt310;
							local203 = local54.anInt319;
						} else {
							local200 = local54.anInt319;
							local203 = local54.anInt310;
						}
						arg0.method352(local51, local104, arg6, local200, arg8, local203, local187, local84, arg7, local66);
					}
					if (local54.aBoolean89) {
						arg5.method14(arg9, local54.anInt319, arg7, arg6, local54.aBoolean91, local54.anInt310);
					}
				} else if (arg3 >= 12) {
					if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
						local104 = local54.method231(arg3, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, arg3, true, local31, 18451, local41);
					}
					arg0.method352(local51, local104, arg6, 1, arg8, 1, 0, local84, arg7, local66);
					if (local54.aBoolean89) {
						arg5.method14(arg9, local54.anInt319, arg7, arg6, local54.aBoolean91, local54.anInt310);
					}
				} else if (arg3 == 0) {
					if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
						local104 = local54.method231(0, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, 0, true, local31, 18451, local41);
					}
					arg0.method350(0, arg8, null, local66, anInt517, local51, arg6, anIntArray138[arg9], local104, arg7, local84);
					if (local54.aBoolean89) {
						arg5.method13(arg3, arg9, local54.aBoolean91, arg6, arg7);
					}
				} else if (arg3 == 1) {
					if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
						local104 = local54.method231(1, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, 1, true, local31, 18451, local41);
					}
					arg0.method350(0, arg8, null, local66, anInt517, local51, arg6, anIntArray139[arg9], local104, arg7, local84);
					if (local54.aBoolean89) {
						arg5.method13(arg3, arg9, local54.aBoolean91, arg6, arg7);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class4_Sub1_Sub1 local475;
					if (arg3 == 2) {
						local446 = arg9 + 1 & 0x3;
						@Pc(465) Class4_Sub1_Sub1 local465;
						if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
							local465 = local54.method231(2, arg9 + 4, local9, local19, local31, local41, -1);
							local475 = local54.method231(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9 + 4, local19, arg4, 2, true, local31, 18451, local41);
							local475 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, local446, local19, arg4, 2, true, local31, 18451, local41);
						}
						arg0.method350(anIntArray138[local446], arg8, local475, local66, anInt517, local51, arg6, anIntArray138[arg9], local465, arg7, local84);
						if (local54.aBoolean89) {
							arg5.method13(arg3, arg9, local54.aBoolean91, arg6, arg7);
						}
					} else if (arg3 == 3) {
						if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
							local104 = local54.method231(3, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, 3, true, local31, 18451, local41);
						}
						arg0.method350(0, arg8, null, local66, anInt517, local51, arg6, anIntArray139[arg9], local104, arg7, local84);
						if (local54.aBoolean89) {
							arg5.method13(arg3, arg9, local54.aBoolean91, arg6, arg7);
						}
					} else if (arg3 == 9) {
						if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
							local104 = local54.method231(arg3, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, arg9, local19, arg4, arg3, true, local31, 18451, local41);
						}
						arg0.method352(local51, local104, arg6, 1, arg8, 1, 0, local84, arg7, local66);
						if (local54.aBoolean89) {
							arg5.method14(arg9, local54.anInt319, arg7, arg6, local54.aBoolean91, local54.anInt310);
						}
					} else {
						if (local54.aBoolean94) {
							if (arg9 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg9 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg9 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg3 == 4) {
							if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
								local104 = local54.method231(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, 0, local19, arg4, 4, true, local31, 18451, local41);
							}
							arg0.method351(local51, 0, local104, anIntArray138[arg9], arg6, 0, arg9 * 512, arg8, arg7, local84, local66);
						} else if (arg3 == 5) {
							local446 = 16;
							local200 = arg0.method368(arg8, arg6, arg7);
							if (local200 > 0) {
								local446 = Class20.method236(local200 >> 14 & 0x7FFF).anInt323;
							}
							if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
								local475 = local54.method231(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, 0, local19, arg4, 4, true, local31, 18451, local41);
							}
							arg0.method351(local51, anIntArray132[arg9] * local446, local475, anIntArray138[arg9], arg6, anIntArray131[arg9] * local446, arg9 * 512, arg8, arg7, local84, local66);
						} else if (arg3 == 6) {
							if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
								local104 = local54.method231(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, 0, local19, arg4, 4, true, local31, 18451, local41);
							}
							arg0.method351(local51, 0, local104, 256, arg6, 0, arg9, arg8, arg7, local84, local66);
						} else if (arg3 == 7) {
							if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
								local104 = local54.method231(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, 0, local19, arg4, 4, true, local31, 18451, local41);
							}
							arg0.method351(local51, 0, local104, 512, arg6, 0, arg9, arg8, arg7, local84, local66);
						} else if (arg3 == 8) {
							if (local54.anInt316 == -1 && local54.anIntArray42 == null) {
								local104 = local54.method231(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class4_Sub1_Sub1_Sub6(local54.anInt316, local9, 0, local19, arg4, 4, true, local31, 18451, local41);
							}
							arg0.method351(local51, 0, local104, 768, arg6, 0, arg9, arg8, arg7, local84, local66);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("95517, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(IIZ)Z")
	public static boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) Class20 local6 = Class20.method236(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local6.method238(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("24257, " + arg0 + ", " + arg1 + ", " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "<init>", descriptor = "([[[IIII[[[B)V")
	public Class29(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt521 = 99;
			this.anInt522 = arg3;
			this.anInt523 = arg2;
			this.anIntArrayArrayArray3 = arg0;
			this.aByteArrayArrayArray3 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt522][this.anInt523];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt522][this.anInt523];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt522][this.anInt523];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt522][this.anInt523];
			this.anIntArrayArrayArray4 = new int[4][this.anInt522 + 1][this.anInt523 + 1];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt522 + 1][this.anInt523 + 1];
			this.anIntArrayArray11 = new int[this.anInt522 + 1][this.anInt523 + 1];
			this.anIntArray133 = new int[this.anInt523];
			this.anIntArray134 = new int[this.anInt523];
			this.anIntArray135 = new int[this.anInt523];
			this.anIntArray136 = new int[this.anInt523];
			this.anIntArray137 = new int[this.anInt523];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("65953, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "([B[Lclient!BXNXROZD;IIIIILclient!KYNTOGBR;III)V")
	public void method408(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class25 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg0, false);
			@Pc(14) int local14 = -1;
			while (true) {
				@Pc(17) int local17 = local7.method181();
				if (local17 == 0) {
					return;
				}
				local14 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local7.method181();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local7.method167();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					if (local50 == arg9 && local46 >= arg6 && local46 < arg6 + 8 && local40 >= arg2 && local40 < arg2 + 8) {
						@Pc(83) Class20 local83 = Class20.method236(local14);
						@Pc(101) int local101 = arg3 + Class45.method548(local83.anInt310, local61, local83.anInt319, arg4, local40 & 0x7, this.anInt525, local46 & 0x7);
						@Pc(118) int local118 = arg8 + Class45.method549(local46 & 0x7, local40 & 0x7, local83.anInt310, local83.anInt319, arg4, local61);
						if (local101 > 0 && local118 > 0 && local101 < 103 && local118 < 103) {
							@Pc(130) int local130 = arg5;
							if ((this.aByteArrayArrayArray3[1][local101][local118] & 0x2) == 2) {
								local130 = arg5 - 1;
							}
							@Pc(145) Class3 local145 = null;
							if (local130 >= 0) {
								local145 = arg1[local130];
							}
							this.method426(local14, arg7, local145, local118, local57, arg5, local61 + arg4 & 0x3, local101);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("17367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 13580 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(IIIIIIILclient!EGCCHUZS;)V")
	private void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub1_Sub3 arg6) {
		try {
			if (this.anInt520 == -5592) {
				@Pc(28) int local28;
				if (arg4 >= 0 && arg4 < 104 && arg1 >= 0 && arg1 < 104) {
					this.aByteArrayArrayArray3[arg0][arg4][arg1] = 0;
					while (true) {
						local28 = arg6.method167();
						if (local28 == 0) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray3[0][arg4][arg1] = -method407(arg4 + arg3 + 932731, arg1 + 556238 + arg2) * 8;
								return;
							} else {
								this.anIntArrayArrayArray3[arg0][arg4][arg1] = this.anIntArrayArrayArray3[arg0 - 1][arg4][arg1] - 240;
								return;
							}
						}
						if (local28 == 1) {
							@Pc(82) int local82 = arg6.method167();
							if (local82 == 1) {
								local82 = 0;
							}
							if (arg0 == 0) {
								this.anIntArrayArrayArray3[0][arg4][arg1] = -local82 * 8;
								return;
							}
							this.anIntArrayArrayArray3[arg0][arg4][arg1] = this.anIntArrayArrayArray3[arg0 - 1][arg4][arg1] - local82 * 8;
							return;
						}
						if (local28 <= 49) {
							this.aByteArrayArrayArray5[arg0][arg4][arg1] = arg6.method168();
							this.aByteArrayArrayArray6[arg0][arg4][arg1] = (byte) ((local28 - 2) / 4);
							this.aByteArrayArrayArray7[arg0][arg4][arg1] = (byte) (local28 + arg5 - 2 & 0x3);
						} else if (local28 <= 81) {
							this.aByteArrayArrayArray3[arg0][arg4][arg1] = (byte) (local28 - 49);
						} else {
							this.aByteArrayArrayArray2[arg0][arg4][arg1] = (byte) (local28 - 81);
						}
					}
				} else {
					while (true) {
						local28 = arg6.method167();
						if (local28 == 0) {
							return;
						}
						if (local28 == 1) {
							arg6.method167();
							return;
						}
						if (local28 <= 49) {
							arg6.method167();
						}
					}
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("19324, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -5592 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(IIIII)V")
	public void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg2; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg1; local7++) {
					if (local7 >= 0 && local7 < this.anInt522 && local3 >= 0 && local3 < this.anInt523) {
						this.aByteArrayArrayArray4[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg1 && local7 < this.anInt522 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg2 && local3 < this.anInt523 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("81585, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -137 + ", " + arg3 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "b", descriptor = "(IIII)I")
	private int method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray3[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("17421, " + arg0 + ", " + arg1 + ", " + 32242 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "d", descriptor = "(II)I")
	private int method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(III)I")
	private int method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(IIIIII[B[Lclient!BXNXROZD;II)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class3[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
					if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
						arg7[arg8].anIntArrayArray1[arg4 + local7][arg0 + local11] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(61) Class4_Sub1_Sub3 local61 = new Class4_Sub1_Sub3(arg6, false);
			for (@Pc(63) int local63 = 0; local63 < 4; local63++) {
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						if (local63 == arg1 && local67 >= arg9 && local67 < arg9 + 8 && local71 >= arg2 && local71 < arg2 + 8) {
							this.method410(arg8, arg0 + Class45.method547(arg5, local71 & 0x7, local67 & 0x7), 0, 0, arg4 + Class45.method546(local71 & 0x7, local67 & 0x7, arg5), arg5, local61);
						} else {
							this.method410(0, -1, 0, 0, -1, 0, local61);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("99714, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "([Lclient!BXNXROZD;BII[BII)V")
	public void method421(@OriginalArg(0) Class3[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg0[local3].anIntArrayArray1[arg1 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class4_Sub1_Sub3 local65 = new Class4_Sub1_Sub3(arg3, false);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method410(local11, local75 + arg2, arg4, arg5, local71 + arg1, 0, local65);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("12361, " + arg0 + ", " + -78 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "([Lclient!BXNXROZD;Lclient!KYNTOGBR;Z)V")
	public void method422(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) boolean arg2) {
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
								arg0[local27].method15(local7, local11);
							}
						}
					}
				}
			}
			anInt516 += (int) (Math.random() * 5.0D) - 2;
			if (anInt516 < -8) {
				anInt516 = -8;
			}
			if (anInt516 > 8) {
				anInt516 = 8;
			}
			anInt518 += (int) (Math.random() * 5.0D) - 2;
			if (anInt518 < -16) {
				anInt518 = -16;
			}
			if (anInt518 > 16) {
				anInt518 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray4[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt523 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt522 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray11[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt523; local145++) {
					this.anIntArray133[local145] = 0;
					this.anIntArray134[local145] = 0;
					this.anIntArray135[local145] = 0;
					this.anIntArray136[local145] = 0;
					this.anIntArray137[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt522 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt523; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt522) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class18 local378 = Class18.aClass18Array1[local210 - 1];
								this.anIntArray133[local191] += local378.anInt301;
								this.anIntArray134[local191] += local378.anInt299;
								this.anIntArray135[local191] += local378.anInt300;
								this.anIntArray136[local191] += local378.anInt302;
								local419 = this.anIntArray137[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt522) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class18 local451 = Class18.aClass18Array1[local214 - 1];
								this.anIntArray133[local191] -= local451.anInt301;
								this.anIntArray134[local191] -= local451.anInt299;
								this.anIntArray135[local191] -= local451.anInt300;
								this.anIntArray136[local191] -= local451.anInt302;
								local419 = this.anIntArray137[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt522 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt523 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt523) {
								local204 += this.anIntArray133[local527];
								local210 += this.anIntArray134[local527];
								local214 += this.anIntArray135[local527];
								local220 += this.anIntArray136[local527];
								local236 += this.anIntArray137[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt523) {
								local204 -= this.anIntArray133[local572];
								local210 -= this.anIntArray134[local572];
								local214 -= this.anIntArray135[local572];
								local220 -= this.anIntArray136[local572];
								local236 -= this.anIntArray137[local572];
							}
							if (local284 >= 1 && local284 < this.anInt523 - 1 && (!aBoolean150 || (this.aByteArrayArrayArray3[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local169][local284] & 0x10) == 0 && this.method414(local7, local284, local169) == anInt524)) {
								if (local7 < anInt521) {
									anInt521 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray5[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray11[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray11[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray11[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray11[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method417(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt516 & 0xFF;
										local786 += anInt518;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method417(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray6[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class18.aClass18Array1[local682 - 1].aBoolean81) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class4_Sub1_Sub2_Sub3.anIntArray149[method413(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method347(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method413(local768, local737), method413(local768, local746), method413(local768, local757), method413(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray6[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray7[local7][local169][local284];
										@Pc(941) Class18 local941 = Class18.aClass18Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt297;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class4_Sub1_Sub2_Sub3.method454(local944);
											local952 = -1;
										} else if (local941.anInt296 == 16711935) {
											local950 = 0;
											local952 = -2;
											local944 = -1;
										} else {
											local952 = this.method417(local941.anInt298, local941.anInt299, local941.anInt300);
											local950 = Class4_Sub1_Sub2_Sub3.anIntArray149[this.method415(local941.anInt303, 96)];
										}
										arg1.method347(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method413(local768, local737), method413(local768, local746), method413(local768, local757), method413(local768, local766), this.method415(local952, local737), this.method415(local952, local746), this.method415(local952, local757), this.method415(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt523 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt522 - 1; local204++) {
						arg1.method346(local7, local204, local191, this.method414(local7, local191, local204));
					}
				}
			}
			arg1.method373(798);
			if (!arg2) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			for (local11 = 0; local11 < this.anInt522; local11++) {
				for (local27 = 0; local27 < this.anInt523; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg1.method344(local27, local11);
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
					for (local133 = 0; local133 <= this.anInt523; local133++) {
						for (local139 = 0; local139 <= this.anInt522; local139++) {
							if ((this.anIntArrayArrayArray4[local1154][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1154][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt523 && (this.anIntArrayArrayArray4[local1154][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label332: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label332;
										}
									}
									local169--;
								}
								label321: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label321;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class25.method345(local214, 834, 1, local1136, local139 * 128, local145 * 128 + 128, local141 * 128, local220, local139 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1154][local139][local133] & local1132) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1154][local141 - 1][local133] & local1132) != 0) {
									local141--;
								}
								while (local145 < this.anInt522 && (this.anIntArrayArrayArray4[local1154][local145 + 1][local133] & local1132) != 0) {
									local145++;
								}
								label385: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1132) == 0) {
											break label385;
										}
									}
									local169--;
								}
								label374: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1132) == 0) {
											break label374;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class25.method345(local214, 834, 2, local1136, local141 * 128, local133 * 128, local133 * 128, local220, local145 * 128 + 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1132;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1154][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1154][local139][local169 - 1] & local1134) != 0) {
									local169--;
								}
								while (local191 < this.anInt523 && (this.anIntArrayArrayArray4[local1154][local139][local191 + 1] & local1134) != 0) {
									local191++;
								}
								label438: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1154][local141 - 1][local204] & local1134) == 0) {
											break label438;
										}
									}
									local141--;
								}
								label427: while (local145 < this.anInt522) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1154][local145 + 1][local204] & local1134) == 0) {
											break label427;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1154][local141][local169];
									Class25.method345(local204, 834, 4, local1136, local141 * 128, local191 * 128 + 128, local169 * 128, local204, local145 * 128 + 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1154][local210][local214] &= ~local1134;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1769) RuntimeException local1769) {
			signlink.reporterror("62323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1769.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(ILclient!KYNTOGBR;Lclient!BXNXROZD;IIIBII)V")
	private void method426(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean150 && (this.aByteArrayArrayArray3[0][arg7][arg3] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg5][arg7][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method414(arg5, arg3, arg7) != anInt524) {
					return;
				}
			}
			if (arg5 < anInt521) {
				anInt521 = arg5;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray3[arg5][arg7][arg3];
			@Pc(60) int local60 = this.anIntArrayArrayArray3[arg5][arg7 + 1][arg3];
			@Pc(73) int local73 = this.anIntArrayArrayArray3[arg5][arg7 + 1][arg3 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray3[arg5][arg7][arg3 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class20 local97 = Class20.method236(arg0);
			@Pc(109) int local109 = arg7 + (arg3 << 7) + (arg0 << 14) + 1073741824;
			if (!local97.aBoolean85) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg6 << 6) + arg4);
			@Pc(157) Class4_Sub1_Sub1 local157;
			if (arg4 != 22) {
				@Pc(255) int local255;
				if (arg4 == 10 || arg4 == 11) {
					if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
						local157 = local97.method231(10, arg6, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, 10, true, local73, 18451, local84);
					}
					if (local157 != null) {
						@Pc(242) int local242 = 0;
						if (arg4 == 11) {
							local242 += 256;
						}
						@Pc(258) int local258;
						if (arg6 == 1 || arg6 == 3) {
							local255 = local97.anInt310;
							local258 = local97.anInt319;
						} else {
							local255 = local97.anInt319;
							local258 = local97.anInt310;
						}
						if (arg1.method352(local94, local157, arg7, local255, arg5, local258, local242, local123, arg3, local109) && local97.aBoolean84) {
							@Pc(289) Class4_Sub1_Sub1_Sub3 local289;
							if (local157 instanceof Class4_Sub1_Sub1_Sub3) {
								local289 = (Class4_Sub1_Sub1_Sub3) local157;
							} else {
								local289 = local97.method231(10, arg6, local49, local60, local73, local84, -1);
							}
							if (local289 != null) {
								for (@Pc(305) int local305 = 0; local305 <= local255; local305++) {
									for (@Pc(309) int local309 = 0; local309 <= local258; local309++) {
										@Pc(316) int local316 = local289.anInt377 / 4;
										if (local316 > 30) {
											local316 = 30;
										}
										if (local316 > this.aByteArrayArrayArray4[arg5][arg7 + local305][arg3 + local309]) {
											this.aByteArrayArrayArray4[arg5][arg7 + local305][arg3 + local309] = (byte) local316;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean89 && arg2 != null) {
						arg2.method14(arg6, local97.anInt319, arg3, arg7, local97.aBoolean91, local97.anInt310);
					}
				} else if (arg4 >= 12) {
					if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
						local157 = local97.method231(arg4, arg6, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, arg4, true, local73, 18451, local84);
					}
					arg1.method352(local94, local157, arg7, 1, arg5, 1, 0, local123, arg3, local109);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x924;
					}
					if (local97.aBoolean89 && arg2 != null) {
						arg2.method14(arg6, local97.anInt319, arg3, arg7, local97.aBoolean91, local97.anInt310);
					}
				} else if (arg4 == 0) {
					if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
						local157 = local97.method231(0, arg6, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, 0, true, local73, 18451, local84);
					}
					arg1.method350(0, arg5, null, local109, anInt517, local94, arg7, anIntArray138[arg6], local157, arg3, local123);
					if (arg6 == 0) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray4[arg5][arg7][arg3] = 50;
							this.aByteArrayArrayArray4[arg5][arg7][arg3 + 1] = 50;
						}
						if (local97.aBoolean87) {
							this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray4[arg5][arg7][arg3 + 1] = 50;
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3 + 1] = 50;
						}
						if (local97.aBoolean87) {
							this.anIntArrayArrayArray4[arg5][arg7][arg3 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3] = 50;
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3 + 1] = 50;
						}
						if (local97.aBoolean87) {
							this.anIntArrayArrayArray4[arg5][arg7 + 1][arg3] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray4[arg5][arg7][arg3] = 50;
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3] = 50;
						}
						if (local97.aBoolean87) {
							this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x492;
						}
					}
					if (local97.aBoolean89 && arg2 != null) {
						arg2.method13(arg4, arg6, local97.aBoolean91, arg7, arg3);
					}
					if (local97.anInt323 != 16) {
						arg1.method358(arg7, local97.anInt323, 193, arg5, arg3);
					}
				} else if (arg4 == 1) {
					if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
						local157 = local97.method231(1, arg6, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, 1, true, local73, 18451, local84);
					}
					arg1.method350(0, arg5, null, local109, anInt517, local94, arg7, anIntArray139[arg6], local157, arg3, local123);
					if (local97.aBoolean84) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray4[arg5][arg7][arg3 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray4[arg5][arg7][arg3] = 50;
						}
					}
					if (local97.aBoolean89 && arg2 != null) {
						arg2.method13(arg4, arg6, local97.aBoolean91, arg7, arg3);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class4_Sub1_Sub1 local895;
					if (arg4 == 2) {
						local866 = arg6 + 1 & 0x3;
						@Pc(885) Class4_Sub1_Sub1 local885;
						if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
							local885 = local97.method231(2, arg6 + 4, local49, local60, local73, local84, -1);
							local895 = local97.method231(2, local866, local49, local60, local73, local84, -1);
						} else {
							local885 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6 + 4, local60, arg0, 2, true, local73, 18451, local84);
							local895 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, local866, local60, arg0, 2, true, local73, 18451, local84);
						}
						arg1.method350(anIntArray138[local866], arg5, local895, local109, anInt517, local94, arg7, anIntArray138[arg6], local885, arg3, local123);
						if (local97.aBoolean87) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg5][arg7][arg3 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray4[arg5][arg7][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg5][arg7 + 1][arg3] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray4[arg5][arg7 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x492;
								this.anIntArrayArrayArray4[arg5][arg7][arg3] |= 0x249;
							}
						}
						if (local97.aBoolean89 && arg2 != null) {
							arg2.method13(arg4, arg6, local97.aBoolean91, arg7, arg3);
						}
						if (local97.anInt323 != 16) {
							arg1.method358(arg7, local97.anInt323, 193, arg5, arg3);
						}
					} else if (arg4 == 3) {
						if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
							local157 = local97.method231(3, arg6, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, 3, true, local73, 18451, local84);
						}
						arg1.method350(0, arg5, null, local109, anInt517, local94, arg7, anIntArray139[arg6], local157, arg3, local123);
						if (local97.aBoolean84) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray4[arg5][arg7][arg3 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray4[arg5][arg7 + 1][arg3] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray4[arg5][arg7][arg3] = 50;
							}
						}
						if (local97.aBoolean89 && arg2 != null) {
							arg2.method13(arg4, arg6, local97.aBoolean91, arg7, arg3);
						}
					} else if (arg4 == 9) {
						if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
							local157 = local97.method231(arg4, arg6, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, arg4, true, local73, 18451, local84);
						}
						arg1.method352(local94, local157, arg7, 1, arg5, 1, 0, local123, arg3, local109);
						if (local97.aBoolean89 && arg2 != null) {
							arg2.method14(arg6, local97.anInt319, arg3, arg7, local97.aBoolean91, local97.anInt310);
						}
					} else {
						if (local97.aBoolean94) {
							if (arg6 == 1) {
								local866 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local866;
							} else if (arg6 == 2) {
								local866 = local84;
								local84 = local60;
								local60 = local866;
								local866 = local73;
								local73 = local49;
								local49 = local866;
							} else if (arg6 == 3) {
								local866 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local866;
							}
						}
						if (arg4 == 4) {
							if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
								local157 = local97.method231(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, 0, local60, arg0, 4, true, local73, 18451, local84);
							}
							arg1.method351(local94, 0, local157, anIntArray138[arg6], arg7, 0, arg6 * 512, arg5, arg3, local123, local109);
						} else if (arg4 == 5) {
							local866 = 16;
							local255 = arg1.method368(arg5, arg7, arg3);
							if (local255 > 0) {
								local866 = Class20.method236(local255 >> 14 & 0x7FFF).anInt323;
							}
							if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
								local895 = local97.method231(4, 0, local49, local60, local73, local84, -1);
							} else {
								local895 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, 0, local60, arg0, 4, true, local73, 18451, local84);
							}
							arg1.method351(local94, anIntArray132[arg6] * local866, local895, anIntArray138[arg6], arg7, anIntArray131[arg6] * local866, arg6 * 512, arg5, arg3, local123, local109);
						} else if (arg4 == 6) {
							if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
								local157 = local97.method231(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, 0, local60, arg0, 4, true, local73, 18451, local84);
							}
							arg1.method351(local94, 0, local157, 256, arg7, 0, arg6, arg5, arg3, local123, local109);
						} else if (arg4 == 7) {
							if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
								local157 = local97.method231(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, 0, local60, arg0, 4, true, local73, 18451, local84);
							}
							arg1.method351(local94, 0, local157, 512, arg7, 0, arg6, arg5, arg3, local123, local109);
						} else if (arg4 == 8) {
							if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
								local157 = local97.method231(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, 0, local60, arg0, 4, true, local73, 18451, local84);
							}
							arg1.method351(local94, 0, local157, 768, arg7, 0, arg6, arg5, arg3, local123, local109);
						}
					}
				}
			} else if (!aBoolean150 || local97.aBoolean85 || local97.aBoolean83) {
				if (local97.anInt316 == -1 && local97.anIntArray42 == null) {
					local157 = local97.method231(22, arg6, local49, local60, local73, local84, -1);
				} else {
					local157 = new Class4_Sub1_Sub1_Sub6(local97.anInt316, local49, arg6, local60, arg0, 22, true, local73, 18451, local84);
				}
				arg1.method348(arg5, local123, local94, arg3, local109, arg7, local157);
				if (local97.aBoolean89 && local97.aBoolean85 && arg2 != null) {
					arg2.method15(arg7, arg3);
				}
			}
		} catch (@Pc(1640) RuntimeException local1640) {
			signlink.reporterror("87808, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 57 + ", " + arg6 + ", " + arg7 + ", " + local1640.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LVLPWFEX", name = "a", descriptor = "(ILclient!KYNTOGBR;I[B[Lclient!BXNXROZD;I)V")
	public void method427(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class3[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class4_Sub1_Sub3 local7 = new Class4_Sub1_Sub3(arg2, false);
			@Pc(17) int local17 = -1;
			while (true) {
				@Pc(20) int local20 = local7.method181();
				if (local20 == 0) {
					return;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method181();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method167();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					@Pc(68) int local68 = local49 + arg4;
					@Pc(72) int local72 = local43 + arg0;
					if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
						@Pc(84) int local84 = local53;
						if ((this.aByteArrayArrayArray3[1][local68][local72] & 0x2) == 2) {
							local84 = local53 - 1;
						}
						@Pc(99) Class3 local99 = null;
						if (local84 >= 0) {
							local99 = arg3[local84];
						}
						this.method426(local17, arg1, local99, local72, local60, local53, local64, local68);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("73761, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}
}
