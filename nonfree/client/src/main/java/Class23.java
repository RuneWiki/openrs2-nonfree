import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PMCVBMMY")
public final class Class23 {

	@OriginalMember(owner = "client!PMCVBMMY", name = "d", descriptor = "I")
	private static int anInt562;

	@OriginalMember(owner = "client!PMCVBMMY", name = "v", descriptor = "Z")
	private static boolean aBoolean129;

	@OriginalMember(owner = "client!PMCVBMMY", name = "B", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "Z")
	private static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!PMCVBMMY", name = "b", descriptor = "[I")
	private static final int[] anIntArray125 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!PMCVBMMY", name = "c", descriptor = "I")
	private static int anInt561 = -741;

	@OriginalMember(owner = "client!PMCVBMMY", name = "l", descriptor = "B")
	private static byte aByte23 = 83;

	@OriginalMember(owner = "client!PMCVBMMY", name = "m", descriptor = "I")
	private static int anInt563 = 1;

	@OriginalMember(owner = "client!PMCVBMMY", name = "o", descriptor = "Z")
	public static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!PMCVBMMY", name = "p", descriptor = "I")
	public static int anInt564 = 99;

	@OriginalMember(owner = "client!PMCVBMMY", name = "s", descriptor = "B")
	private static byte aByte24 = -42;

	@OriginalMember(owner = "client!PMCVBMMY", name = "w", descriptor = "[I")
	private static final int[] anIntArray131 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!PMCVBMMY", name = "x", descriptor = "I")
	private static int anInt567 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!PMCVBMMY", name = "y", descriptor = "[I")
	private static final int[] anIntArray132 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!PMCVBMMY", name = "C", descriptor = "I")
	private static int anInt569 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!PMCVBMMY", name = "G", descriptor = "Z")
	private static boolean aBoolean130 = true;

	@OriginalMember(owner = "client!PMCVBMMY", name = "I", descriptor = "[I")
	private static final int[] anIntArray133 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!PMCVBMMY", name = "D", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!PMCVBMMY", name = "t", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!PMCVBMMY", name = "H", descriptor = "I")
	private int anInt571 = 8;

	@OriginalMember(owner = "client!PMCVBMMY", name = "J", descriptor = "I")
	private int anInt572 = -543;

	@OriginalMember(owner = "client!PMCVBMMY", name = "q", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!PMCVBMMY", name = "r", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!PMCVBMMY", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!PMCVBMMY", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!PMCVBMMY", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!PMCVBMMY", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!PMCVBMMY", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!PMCVBMMY", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!PMCVBMMY", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!PMCVBMMY", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!PMCVBMMY", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!PMCVBMMY", name = "e", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!PMCVBMMY", name = "f", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!PMCVBMMY", name = "g", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!PMCVBMMY", name = "h", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!PMCVBMMY", name = "i", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(II)I")
	private static int method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(ILclient!LXDDKEZF;[[[IIILclient!XBMRDXRN;IIIII)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class43 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(9) int local9 = arg2[arg10][arg8][arg6];
			@Pc(19) int local19 = arg2[arg10][arg8 + 1][arg6];
			@Pc(31) int local31 = arg2[arg10][arg8 + 1][arg6 + 1];
			@Pc(41) int local41 = arg2[arg10][arg8][arg6 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class18 local54 = Class18.method278(arg3);
			@Pc(66) int local66 = arg8 + (arg6 << 7) + (arg3 << 14) + 1073741824;
			@Pc(70) int local70 = 98 / arg4;
			if (!local54.aBoolean90) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg7);
			@Pc(104) Class3_Sub1_Sub1 local104;
			if (arg7 == 22) {
				if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
					local104 = local54.method274(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, 22, local54.anInt479, local41);
				}
				arg1.method228(local104, arg6, local51, arg8, local84, local66, arg9);
				if (local54.aBoolean89 && local54.aBoolean90) {
					arg5.method511(arg8, arg6);
				}
			} else {
				@Pc(200) int local200;
				if (arg7 == 10 || arg7 == 11) {
					if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
						local104 = local54.method274(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, 10, local54.anInt479, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg7 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg0 == 1 || arg0 == 3) {
							local200 = local54.anInt484;
							local203 = local54.anInt488;
						} else {
							local200 = local54.anInt488;
							local203 = local54.anInt484;
						}
						arg1.method232(arg9, local66, local104, local203, local200, local51, local84, arg6, arg8, local187);
					}
					if (local54.aBoolean89) {
						arg5.method510(arg0, arg8, arg6, aByte23, local54.anInt488, local54.aBoolean94, local54.anInt484);
					}
				} else if (arg7 >= 12) {
					if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
						local104 = local54.method274(arg7, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, arg7, local54.anInt479, local41);
					}
					arg1.method232(arg9, local66, local104, 1, 1, local51, local84, arg6, arg8, 0);
					if (local54.aBoolean89) {
						arg5.method510(arg0, arg8, arg6, aByte23, local54.anInt488, local54.aBoolean94, local54.anInt484);
					}
				} else if (arg7 == 0) {
					if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
						local104 = local54.method274(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, 0, local54.anInt479, local41);
					}
					arg1.method230(anIntArray132[arg0], null, arg6, local66, local104, local84, arg8, arg9, 0, local51);
					if (local54.aBoolean89) {
						arg5.method509(arg8, local54.aBoolean94, arg7, arg6, arg0, anInt562);
					}
				} else if (arg7 == 1) {
					if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
						local104 = local54.method274(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, 1, local54.anInt479, local41);
					}
					arg1.method230(anIntArray133[arg0], null, arg6, local66, local104, local84, arg8, arg9, 0, local51);
					if (local54.aBoolean89) {
						arg5.method509(arg8, local54.aBoolean94, arg7, arg6, arg0, anInt562);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class3_Sub1_Sub1 local475;
					if (arg7 == 2) {
						local446 = arg0 + 1 & 0x3;
						@Pc(465) Class3_Sub1_Sub1 local465;
						if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
							local465 = local54.method274(2, arg0 + 4, local9, local19, local31, local41, -1);
							local475 = local54.method274(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0 + 4, 0, local9, 2, local54.anInt479, local41);
							local475 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, local446, 0, local9, 2, local54.anInt479, local41);
						}
						arg1.method230(anIntArray132[arg0], local475, arg6, local66, local465, local84, arg8, arg9, anIntArray132[local446], local51);
						if (local54.aBoolean89) {
							arg5.method509(arg8, local54.aBoolean94, arg7, arg6, arg0, anInt562);
						}
					} else if (arg7 == 3) {
						if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
							local104 = local54.method274(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, 3, local54.anInt479, local41);
						}
						arg1.method230(anIntArray133[arg0], null, arg6, local66, local104, local84, arg8, arg9, 0, local51);
						if (local54.aBoolean89) {
							arg5.method509(arg8, local54.aBoolean94, arg7, arg6, arg0, anInt562);
						}
					} else if (arg7 == 9) {
						if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
							local104 = local54.method274(arg7, arg0, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, arg0, 0, local9, arg7, local54.anInt479, local41);
						}
						arg1.method232(arg9, local66, local104, 1, 1, local51, local84, arg6, arg8, 0);
						if (local54.aBoolean89) {
							arg5.method510(arg0, arg8, arg6, aByte23, local54.anInt488, local54.aBoolean94, local54.anInt484);
						}
					} else {
						if (local54.aBoolean91) {
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
						if (arg7 == 4) {
							if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
								local104 = local54.method274(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, 0, 0, local9, 4, local54.anInt479, local41);
							}
							arg1.method231(aBoolean130, 0, local104, arg9, anIntArray132[arg0], local84, arg0 * 512, arg6, 0, local51, arg8, local66);
						} else if (arg7 == 5) {
							local446 = 16;
							local200 = arg1.method248(arg9, arg8, arg6);
							if (local200 > 0) {
								local446 = Class18.method278(local200 >> 14 & 0x7FFF).anInt487;
							}
							if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
								local475 = local54.method274(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, 0, 0, local9, 4, local54.anInt479, local41);
							}
							arg1.method231(aBoolean130, anIntArray131[arg0] * local446, local475, arg9, anIntArray132[arg0], local84, arg0 * 512, arg6, anIntArray125[arg0] * local446, local51, arg8, local66);
						} else if (arg7 == 6) {
							if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
								local104 = local54.method274(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, 0, 0, local9, 4, local54.anInt479, local41);
							}
							arg1.method231(aBoolean130, 0, local104, arg9, 256, local84, arg0, arg6, 0, local51, arg8, local66);
						} else if (arg7 == 7) {
							if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
								local104 = local54.method274(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, 0, 0, local9, 4, local54.anInt479, local41);
							}
							arg1.method231(aBoolean130, 0, local104, arg9, 512, local84, arg0, arg6, 0, local51, arg8, local66);
						} else if (arg7 == 8) {
							if (local54.anInt479 == -1 && local54.anIntArray79 == null) {
								local104 = local54.method274(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class3_Sub1_Sub1_Sub6(local31, arg3, true, local19, 0, 0, local9, 4, local54.anInt479, local41);
							}
							arg1.method231(aBoolean130, 0, local104, arg9, 768, local84, arg0, arg6, 0, local51, arg8, local66);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("64949, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "b", descriptor = "(III)Z")
	public static boolean method355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class18 local2 = Class18.method278(arg1);
			if (anInt563 != 1) {
				anInt562 = 444;
			}
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method280(arg0, anInt561);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("14063, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(IIII)I")
	private static int method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class3_Sub1_Sub3_Sub3.anIntArray138[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "c", descriptor = "(II)I")
	private static int method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "c", descriptor = "(III)I")
	private static int method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method366(local3, local13);
		@Pc(29) int local29 = method366(local3 + 1, local13);
		@Pc(35) int local35 = method366(local3, local13 + 1);
		@Pc(43) int local43 = method366(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method356(local23, local29, local9, arg2);
		@Pc(55) int local55 = method356(local35, local43, local9, arg2);
		return method356(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "d", descriptor = "(II)I")
	private static int method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method360(arg0 + 45365, arg1 + 91923, 4) + (method360(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method360(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(I[BZI)Z")
	public static boolean method364(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(17) Class3_Sub1_Sub2 local17 = new Class3_Sub1_Sub2(-527, arg1);
			@Pc(19) int local19 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local17.method103();
				if (local22 == 0) {
					return local3;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local17.method103();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local17.method89() >> 2;
						@Pc(74) int local74 = local65 + arg2;
						@Pc(78) int local78 = local59 + arg0;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class18 local91 = Class18.method278(local19);
							if (local70 != 22 || !aBoolean127 || local91.aBoolean90 || local91.aBoolean88) {
								local3 &= local91.method275(aByte24);
								local32 = true;
							}
						}
					}
					local37 = local17.method103();
					if (local37 == 0) {
						break;
					}
					local17.method89();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("34278, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(ZLclient!XZFDFADG;Lclient!GHHPHSRU;)V")
	public static void method365(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(11) int local11 = -1;
			while (true) {
				@Pc(14) int local14 = arg1.method103();
				if (local14 == 0) {
					return;
				}
				local11 += local14;
				@Pc(23) Class18 local23 = Class18.method278(local11);
				local23.method273(arg0);
				while (true) {
					@Pc(30) int local30 = arg1.method103();
					if (local30 == 0) {
						break;
					}
					arg1.method89();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("66163, " + true + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "e", descriptor = "(II)I")
	private static int method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method358(arg0 - 1, arg1 - 1) + method358(arg0 + 1, arg1 - 1) + method358(arg0 - 1, arg1 + 1) + method358(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method358(arg0 - 1, arg1) + method358(arg0 + 1, arg1) + method358(arg0, arg1 - 1) + method358(arg0, arg1 + 1);
		@Pc(59) int local59 = method358(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "<init>", descriptor = "([[[BI[[[III)V")
	public Class23(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt564 = 99;
			this.anInt565 = arg3;
			this.anInt566 = arg4;
			this.anIntArrayArrayArray5 = arg2;
			this.aByteArrayArrayArray2 = arg0;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt565][this.anInt566];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt565][this.anInt566];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt565][this.anInt566];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt565][this.anInt566];
			this.anIntArrayArrayArray6 = new int[4][this.anInt565 + 1][this.anInt566 + 1];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt565 + 1][this.anInt566 + 1];
			this.anIntArrayArray12 = new int[this.anInt565 + 1][this.anInt566 + 1];
			this.anIntArray126 = new int[this.anInt566];
			this.anIntArray127 = new int[this.anInt566];
			this.anIntArray128 = new int[this.anInt566];
			this.anIntArray129 = new int[this.anInt566];
			this.anIntArray130 = new int[this.anInt566];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("34124, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(Lclient!LXDDKEZF;B[Lclient!XBMRDXRN;)V")
	public void method346(@OriginalArg(0) Class17 arg0, @OriginalArg(2) Class43[] arg1) {
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
								arg1[local27].method511(local7, local11);
							}
						}
					}
				}
			}
			anInt567 += (int) (Math.random() * 5.0D) - 2;
			if (anInt567 < -8) {
				anInt567 = -8;
			}
			if (anInt567 > 8) {
				anInt567 = 8;
			}
			anInt569 += (int) (Math.random() * 5.0D) - 2;
			if (anInt569 < -16) {
				anInt569 = -16;
			}
			if (anInt569 > 16) {
				anInt569 = 16;
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
				for (local141 = 1; local141 < this.anInt566 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt565 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray12[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt566; local145++) {
					this.anIntArray126[local145] = 0;
					this.anIntArray127[local145] = 0;
					this.anIntArray128[local145] = 0;
					this.anIntArray129[local145] = 0;
					this.anIntArray130[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt565 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt566; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt565) {
							local210 = this.aByteArrayArrayArray5[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class25 local378 = Class25.aClass25Array1[local210 - 1];
								this.anIntArray126[local191] += local378.anInt580;
								this.anIntArray127[local191] += local378.anInt578;
								this.anIntArray128[local191] += local378.anInt579;
								this.anIntArray129[local191] += local378.anInt581;
								local419 = this.anIntArray130[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt565) {
							local214 = this.aByteArrayArrayArray5[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class25 local451 = Class25.aClass25Array1[local214 - 1];
								this.anIntArray126[local191] -= local451.anInt580;
								this.anIntArray127[local191] -= local451.anInt578;
								this.anIntArray128[local191] -= local451.anInt579;
								this.anIntArray129[local191] -= local451.anInt581;
								local419 = this.anIntArray130[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt565 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt566 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt566) {
								local204 += this.anIntArray126[local527];
								local210 += this.anIntArray127[local527];
								local214 += this.anIntArray128[local527];
								local220 += this.anIntArray129[local527];
								local236 += this.anIntArray130[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt566) {
								local204 -= this.anIntArray126[local572];
								local210 -= this.anIntArray127[local572];
								local214 -= this.anIntArray128[local572];
								local220 -= this.anIntArray129[local572];
								local236 -= this.anIntArray130[local572];
							}
							if (local284 >= 1 && local284 < this.anInt566 - 1 && (!aBoolean127 || (this.aByteArrayArrayArray2[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray2[local7][local169][local284] & 0x10) == 0 && this.method362(local169, local7, local284) == anInt568)) {
								if (local7 < anInt564) {
									anInt564 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray5[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray12[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray12[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray12[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray12[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method353(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt567 & 0xFF;
										local786 += anInt569;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method353(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray7[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class25.aClass25Array1[local682 - 1].aBoolean133) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class3_Sub1_Sub3_Sub3.anIntArray142[method351(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method227(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method351(local768, local737), method351(local768, local746), method351(local768, local757), method351(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray7[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray3[local7][local169][local284];
										@Pc(941) Class25 local941 = Class25.aClass25Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt576;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class3_Sub1_Sub3_Sub3.method396(local944);
											local952 = -1;
										} else if (local941.anInt575 == 16711935) {
											local950 = 0;
											local952 = -2;
											local944 = -1;
										} else {
											local952 = this.method353(local941.anInt577, local941.anInt578, local941.anInt579);
											local950 = Class3_Sub1_Sub3_Sub3.anIntArray142[this.method357(local941.anInt582, 96)];
										}
										arg0.method227(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method351(local768, local737), method351(local768, local746), method351(local768, local757), method351(local768, local766), this.method357(local952, local737), this.method357(local952, local746), this.method357(local952, local757), this.method357(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt566 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt565 - 1; local204++) {
						arg0.method226(local7, local204, local191, this.method362(local204, local7, local191));
					}
				}
			}
			arg0.method253();
			for (local11 = 0; local11 < this.anInt565; local11++) {
				for (local27 = 0; local27 < this.anInt566; local27++) {
					if ((this.aByteArrayArrayArray2[1][local11][local27] & 0x2) == 2) {
						arg0.method224(local11, this.anInt570, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1124) int local1124 = 2;
			@Pc(1126) int local1126 = 4;
			for (@Pc(1138) int local1138 = 0; local1138 < 4; local1138++) {
				if (local1138 > 0) {
					local27 <<= 0x3;
					local1124 <<= 0x3;
					local1126 <<= 0x3;
				}
				for (@Pc(1156) int local1156 = 0; local1156 <= local1138; local1156++) {
					for (local133 = 0; local133 <= this.anInt566; local133++) {
						for (local139 = 0; local139 <= this.anInt565; local139++) {
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1156][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt566 && (this.anIntArrayArrayArray6[local1156][local139][local145 + 1] & local27) != 0) {
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
								label317: while (local191 < local1138) {
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
									Class17.method225(local139 * 128, local1138, local220, local214, local145 * 128 + 128, 1, local139 * 128, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local1124) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1156][local141 - 1][local133] & local1124) != 0) {
									local141--;
								}
								while (local145 < this.anInt565 && (this.anIntArrayArrayArray6[local1156][local145 + 1][local133] & local1124) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1124) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1138) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1124) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class17.method225(local141 * 128, local1138, local220, local214, local133 * 128, 2, local145 * 128 + 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1124;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local1126) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1156][local139][local169 - 1] & local1126) != 0) {
									local169--;
								}
								while (local191 < this.anInt566 && (this.anIntArrayArrayArray6[local1156][local139][local191 + 1] & local1126) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1156][local141 - 1][local204] & local1126) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt565) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1156][local145 + 1][local204] & local1126) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1156][local141][local169];
									Class17.method225(local141 * 128, local1138, local204, local204, local191 * 128 + 128, 4, local145 * 128 + 128, local169 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1156][local210][local214] &= ~local1126;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("91730, " + arg0 + ", " + 107 + ", " + arg1 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(IIII[Lclient!XBMRDXRN;III[BI)V")
	public void method347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class43[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg1 + local3 > 0 && arg1 + local3 < 103 && arg0 + local7 > 0 && arg0 + local7 < 103) {
						arg3[arg5].anIntArrayArray19[arg1 + local3][arg0 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(62) Class3_Sub1_Sub2 local62 = new Class3_Sub1_Sub2(-527, arg7);
			for (@Pc(64) int local64 = 0; local64 < 4; local64++) {
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						if (local64 == arg6 && local68 >= arg2 && local68 < arg2 + 8 && local72 >= arg4 && local72 < arg4 + 8) {
							this.method363(local62, arg5, 0, 0, arg0 + Class46.method525(local72 & 0x7, local68 & 0x7, arg8), arg1 + Class46.method524(local68 & 0x7, arg8, local72 & 0x7), arg8);
						} else {
							this.method363(local62, 0, 0, 0, -1, -1, 0);
						}
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("54369, " + arg0 + ", " + -585 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(II[Lclient!XBMRDXRN;[BLclient!LXDDKEZF;I)V")
	public void method348(@OriginalArg(0) int arg0, @OriginalArg(2) Class43[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class17 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class3_Sub1_Sub2 local7 = new Class3_Sub1_Sub2(-527, arg2);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method103();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method103();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method89();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg4;
					@Pc(68) int local68 = local39 + arg0;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray2[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class43 local95 = null;
						if (local80 >= 0) {
							local95 = arg1[local80];
						}
						this.method359(local95, local64, local9, local56, local49, local60, arg3, local68);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("13837, " + arg0 + ", " + 6769 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "([Lclient!XBMRDXRN;IIIIIILclient!LXDDKEZF;II[B)V")
	public void method349(@OriginalArg(0) Class43[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(12) Class3_Sub1_Sub2 local12 = new Class3_Sub1_Sub2(-527, arg9);
			@Pc(14) int local14 = -1;
			while (true) {
				@Pc(17) int local17 = local12.method103();
				if (local17 == 0) {
					return;
				}
				local14 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local12.method103();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local12.method89();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					if (local50 == arg8 && local46 >= arg2 && local46 < arg2 + 8 && local40 >= arg3 && local40 < arg3 + 8) {
						@Pc(83) Class18 local83 = Class18.method278(local14);
						@Pc(100) int local100 = arg4 + Class46.method526(local61, local46 & 0x7, local40 & 0x7, arg1, local83.anInt484, local83.anInt488);
						@Pc(117) int local117 = arg7 + Class46.method527(local46 & 0x7, local40 & 0x7, local83.anInt488, arg1, local61, local83.anInt484);
						if (local100 > 0 && local117 > 0 && local100 < 103 && local117 < 103) {
							@Pc(129) int local129 = arg5;
							if ((this.aByteArrayArrayArray2[1][local100][local117] & 0x2) == 2) {
								local129 = arg5 - 1;
							}
							@Pc(144) Class43 local144 = null;
							if (local129 >= 0) {
								local144 = arg0[local129];
							}
							this.method359(local144, local100, local14, local57, arg5, local61 + arg1 & 0x3, arg6, local117);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("77675, " + arg0 + ", " + arg1 + ", " + 527 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(IZI[Lclient!XBMRDXRN;II[B)V")
	public void method350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg4 + local11 > 0 && arg4 + local11 < 103) {
							arg2[local3].anIntArrayArray19[arg3 + local7][arg4 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(75) Class3_Sub1_Sub2 local75 = new Class3_Sub1_Sub2(-527, arg5);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
					for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
						this.method363(local75, local11, arg0, arg1, local85 + arg4, local81 + arg3, 0);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("66801, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(IIIII)V")
	public void method352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg2; local7++) {
				for (@Pc(11) int local11 = arg0; local11 <= arg0 + arg1; local11++) {
					if (local11 >= 0 && local11 < this.anInt565 && local7 >= 0 && local7 < this.anInt566) {
						this.aByteArrayArrayArray4[0][local11][local7] = 127;
						if (local11 == arg0 && local11 > 0) {
							this.anIntArrayArrayArray5[0][local11][local7] = this.anIntArrayArrayArray5[0][local11 - 1][local7];
						}
						if (local11 == arg0 + arg1 && local11 < this.anInt565 - 1) {
							this.anIntArrayArrayArray5[0][local11][local7] = this.anIntArrayArrayArray5[0][local11 + 1][local7];
						}
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local11][local7] = this.anIntArrayArrayArray5[0][local11][local7 - 1];
						}
						if (local7 == arg3 + arg2 && local7 < this.anInt566 - 1) {
							this.anIntArrayArrayArray5[0][local11][local7] = this.anIntArrayArrayArray5[0][local11][local7 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("96137, " + arg0 + ", " + -5656 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(III)I")
	private int method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!PMCVBMMY", name = "b", descriptor = "(II)I")
	private int method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(Lclient!XBMRDXRN;IIIIILclient!LXDDKEZF;ZI)V")
	private void method359(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean127 && (this.aByteArrayArrayArray2[0][arg1][arg7] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray2[arg4][arg1][arg7] & 0x10) != 0) {
					return;
				}
				if (this.method362(arg1, arg4, arg7) != anInt568) {
					return;
				}
			}
			if (arg4 < anInt564) {
				anInt564 = arg4;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg4][arg1][arg7];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg4][arg1 + 1][arg7];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg4][arg1 + 1][arg7 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg4][arg1][arg7 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class18 local97 = Class18.method278(arg2);
			@Pc(112) int local112 = arg1 + (arg7 << 7) + (arg2 << 14) + 1073741824;
			if (!local97.aBoolean90) {
				local112 += Integer.MIN_VALUE;
			}
			@Pc(126) byte local126 = (byte) ((arg5 << 6) + arg3);
			@Pc(155) Class3_Sub1_Sub1 local155;
			if (arg3 != 22) {
				@Pc(253) int local253;
				if (arg3 == 10 || arg3 == 11) {
					if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
						local155 = local97.method274(10, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, 10, local97.anInt479, local84);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg3 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg5 == 1 || arg5 == 3) {
							local253 = local97.anInt484;
							local256 = local97.anInt488;
						} else {
							local253 = local97.anInt488;
							local256 = local97.anInt484;
						}
						if (arg6.method232(arg4, local112, local155, local256, local253, local94, local126, arg7, arg1, local240) && local97.aBoolean95) {
							@Pc(287) Class3_Sub1_Sub1_Sub3 local287;
							if (local155 instanceof Class3_Sub1_Sub1_Sub3) {
								local287 = (Class3_Sub1_Sub1_Sub3) local155;
							} else {
								local287 = local97.method274(10, arg5, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt550 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray4[arg4][arg1 + local303][arg7 + local307]) {
											this.aByteArrayArrayArray4[arg4][arg1 + local303][arg7 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean89 && arg0 != null) {
						arg0.method510(arg5, arg1, arg7, aByte23, local97.anInt488, local97.aBoolean94, local97.anInt484);
					}
				} else if (arg3 >= 12) {
					if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
						local155 = local97.method274(arg3, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, arg3, local97.anInt479, local84);
					}
					arg6.method232(arg4, local112, local155, 1, 1, local94, local126, arg7, arg1, 0);
					if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
						this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x924;
					}
					if (local97.aBoolean89 && arg0 != null) {
						arg0.method510(arg5, arg1, arg7, aByte23, local97.anInt488, local97.aBoolean94, local97.anInt484);
					}
				} else if (arg3 == 0) {
					if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
						local155 = local97.method274(0, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, 0, local97.anInt479, local84);
					}
					arg6.method230(anIntArray132[arg5], null, arg7, local112, local155, local126, arg1, arg4, 0, local94);
					if (arg5 == 0) {
						if (local97.aBoolean95) {
							this.aByteArrayArrayArray4[arg4][arg1][arg7] = 50;
							this.aByteArrayArrayArray4[arg4][arg1][arg7 + 1] = 50;
						}
						if (local97.aBoolean99) {
							this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local97.aBoolean95) {
							this.aByteArrayArrayArray4[arg4][arg1][arg7 + 1] = 50;
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7 + 1] = 50;
						}
						if (local97.aBoolean99) {
							this.anIntArrayArrayArray6[arg4][arg1][arg7 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local97.aBoolean95) {
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7] = 50;
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7 + 1] = 50;
						}
						if (local97.aBoolean99) {
							this.anIntArrayArrayArray6[arg4][arg1 + 1][arg7] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local97.aBoolean95) {
							this.aByteArrayArrayArray4[arg4][arg1][arg7] = 50;
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7] = 50;
						}
						if (local97.aBoolean99) {
							this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x492;
						}
					}
					if (local97.aBoolean89 && arg0 != null) {
						arg0.method509(arg1, local97.aBoolean94, arg3, arg7, arg5, anInt562);
					}
					if (local97.anInt487 != 16) {
						arg6.method238(local97.anInt487, arg1, arg7, arg4);
					}
				} else if (arg3 == 1) {
					if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
						local155 = local97.method274(1, arg5, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, 1, local97.anInt479, local84);
					}
					arg6.method230(anIntArray133[arg5], null, arg7, local112, local155, local126, arg1, arg4, 0, local94);
					if (local97.aBoolean95) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray4[arg4][arg1][arg7 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray4[arg4][arg1][arg7] = 50;
						}
					}
					if (local97.aBoolean89 && arg0 != null) {
						arg0.method509(arg1, local97.aBoolean94, arg3, arg7, arg5, anInt562);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class3_Sub1_Sub1 local893;
					if (arg3 == 2) {
						local864 = arg5 + 1 & 0x3;
						@Pc(883) Class3_Sub1_Sub1 local883;
						if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
							local883 = local97.method274(2, arg5 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method274(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5 + 4, 0, local49, 2, local97.anInt479, local84);
							local893 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, local864, 0, local49, 2, local97.anInt479, local84);
						}
						arg6.method230(anIntArray132[arg5], local893, arg7, local112, local883, local126, arg1, arg4, anIntArray132[local864], local94);
						if (local97.aBoolean99) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x249;
								this.anIntArrayArrayArray6[arg4][arg1][arg7 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray6[arg4][arg1][arg7 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg4][arg1 + 1][arg7] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray6[arg4][arg1 + 1][arg7] |= 0x249;
								this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x492;
								this.anIntArrayArrayArray6[arg4][arg1][arg7] |= 0x249;
							}
						}
						if (local97.aBoolean89 && arg0 != null) {
							arg0.method509(arg1, local97.aBoolean94, arg3, arg7, arg5, anInt562);
						}
						if (local97.anInt487 != 16) {
							arg6.method238(local97.anInt487, arg1, arg7, arg4);
						}
					} else if (arg3 == 3) {
						if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
							local155 = local97.method274(3, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, 3, local97.anInt479, local84);
						}
						arg6.method230(anIntArray133[arg5], null, arg7, local112, local155, local126, arg1, arg4, 0, local94);
						if (local97.aBoolean95) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray4[arg4][arg1][arg7 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray4[arg4][arg1 + 1][arg7] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray4[arg4][arg1][arg7] = 50;
							}
						}
						if (local97.aBoolean89 && arg0 != null) {
							arg0.method509(arg1, local97.aBoolean94, arg3, arg7, arg5, anInt562);
						}
					} else if (arg3 == 9) {
						if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
							local155 = local97.method274(arg3, arg5, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, arg3, local97.anInt479, local84);
						}
						arg6.method232(arg4, local112, local155, 1, 1, local94, local126, arg7, arg1, 0);
						if (local97.aBoolean89 && arg0 != null) {
							arg0.method510(arg5, arg1, arg7, aByte23, local97.anInt488, local97.aBoolean94, local97.anInt484);
						}
					} else {
						if (local97.aBoolean91) {
							if (arg5 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg5 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg5 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg3 == 4) {
							if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
								local155 = local97.method274(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, 0, 0, local49, 4, local97.anInt479, local84);
							}
							arg6.method231(aBoolean130, 0, local155, arg4, anIntArray132[arg5], local126, arg5 * 512, arg7, 0, local94, arg1, local112);
						} else if (arg3 == 5) {
							local864 = 16;
							local253 = arg6.method248(arg4, arg1, arg7);
							if (local253 > 0) {
								local864 = Class18.method278(local253 >> 14 & 0x7FFF).anInt487;
							}
							if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
								local893 = local97.method274(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, 0, 0, local49, 4, local97.anInt479, local84);
							}
							arg6.method231(aBoolean130, anIntArray131[arg5] * local864, local893, arg4, anIntArray132[arg5], local126, arg5 * 512, arg7, anIntArray125[arg5] * local864, local94, arg1, local112);
						} else if (arg3 == 6) {
							if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
								local155 = local97.method274(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, 0, 0, local49, 4, local97.anInt479, local84);
							}
							arg6.method231(aBoolean130, 0, local155, arg4, 256, local126, arg5, arg7, 0, local94, arg1, local112);
						} else if (arg3 == 7) {
							if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
								local155 = local97.method274(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, 0, 0, local49, 4, local97.anInt479, local84);
							}
							arg6.method231(aBoolean130, 0, local155, arg4, 512, local126, arg5, arg7, 0, local94, arg1, local112);
						} else if (arg3 == 8) {
							if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
								local155 = local97.method274(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, 0, 0, local49, 4, local97.anInt479, local84);
							}
							arg6.method231(aBoolean130, 0, local155, arg4, 768, local126, arg5, arg7, 0, local94, arg1, local112);
						}
					}
				}
			} else if (!aBoolean127 || local97.aBoolean90 || local97.aBoolean88) {
				if (local97.anInt479 == -1 && local97.anIntArray79 == null) {
					local155 = local97.method274(22, arg5, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class3_Sub1_Sub1_Sub6(local73, arg2, true, local60, arg5, 0, local49, 22, local97.anInt479, local84);
				}
				arg6.method228(local155, arg7, local94, arg1, local126, local112, arg4);
				if (local97.aBoolean89 && local97.aBoolean90 && arg0 != null) {
					arg0.method511(arg1, arg7);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("21965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(IIZI)I")
	private int method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray2[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray2[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("78672, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMCVBMMY", name = "a", descriptor = "(Lclient!GHHPHSRU;IIIIIII)V")
	private void method363(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(27) int local27;
			if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
				this.aByteArrayArrayArray2[arg1][arg5][arg4] = 0;
				while (true) {
					local27 = arg0.method89();
					if (local27 == 0) {
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg5][arg4] = -method361(arg5 + arg3 + 932731, arg4 + 556238 + arg2) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg1][arg5][arg4] = this.anIntArrayArrayArray5[arg1 - 1][arg5][arg4] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg0.method89();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg5][arg4] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg1][arg5][arg4] = this.anIntArrayArrayArray5[arg1 - 1][arg5][arg4] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray6[arg1][arg5][arg4] = arg0.method90();
						this.aByteArrayArrayArray7[arg1][arg5][arg4] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray3[arg1][arg5][arg4] = (byte) (local27 + arg6 - 2 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray2[arg1][arg5][arg4] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray5[arg1][arg5][arg4] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg0.method89();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg0.method89();
						return;
					}
					if (local27 <= 49) {
						arg0.method89();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("86736, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 8 + ", " + arg6 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}
}
