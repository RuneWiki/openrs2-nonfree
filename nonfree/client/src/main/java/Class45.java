import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WMHCOPKE")
public final class Class45 {

	@OriginalMember(owner = "client!WMHCOPKE", name = "p", descriptor = "Z")
	private static boolean aBoolean174;

	@OriginalMember(owner = "client!WMHCOPKE", name = "z", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!WMHCOPKE", name = "f", descriptor = "[I")
	private static final int[] anIntArray201 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!WMHCOPKE", name = "h", descriptor = "B")
	private static byte aByte25 = -112;

	@OriginalMember(owner = "client!WMHCOPKE", name = "k", descriptor = "I")
	private static int anInt735 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!WMHCOPKE", name = "n", descriptor = "B")
	private static byte aByte26 = 4;

	@OriginalMember(owner = "client!WMHCOPKE", name = "q", descriptor = "[I")
	private static final int[] anIntArray202 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!WMHCOPKE", name = "u", descriptor = "I")
	private static int anInt738 = -302;

	@OriginalMember(owner = "client!WMHCOPKE", name = "v", descriptor = "I")
	public static int anInt739 = 99;

	@OriginalMember(owner = "client!WMHCOPKE", name = "A", descriptor = "Z")
	public static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!WMHCOPKE", name = "B", descriptor = "[I")
	private static final int[] anIntArray203 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!WMHCOPKE", name = "E", descriptor = "I")
	private static int anInt743 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!WMHCOPKE", name = "H", descriptor = "[I")
	private static final int[] anIntArray204 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!WMHCOPKE", name = "r", descriptor = "I")
	private int anInt736 = -192;

	@OriginalMember(owner = "client!WMHCOPKE", name = "t", descriptor = "I")
	private int anInt737 = -214;

	@OriginalMember(owner = "client!WMHCOPKE", name = "F", descriptor = "I")
	private int anInt744 = -309;

	@OriginalMember(owner = "client!WMHCOPKE", name = "G", descriptor = "I")
	private int anInt745 = -840;

	@OriginalMember(owner = "client!WMHCOPKE", name = "x", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!WMHCOPKE", name = "y", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!WMHCOPKE", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!WMHCOPKE", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!WMHCOPKE", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!WMHCOPKE", name = "D", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!WMHCOPKE", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!WMHCOPKE", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!WMHCOPKE", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!WMHCOPKE", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!WMHCOPKE", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!WMHCOPKE", name = "d", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!WMHCOPKE", name = "e", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(II)I")
	private static int method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method525(arg0 + 45365, arg1 + 91923, 4) + (method525(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method525(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "([BZII)Z")
	public static boolean method517(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub4 local9 = new Class1_Sub1_Sub4(arg0, true);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method419();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method419();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method405() >> 2;
						@Pc(72) int local72 = local63 + arg1;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class32 local89 = Class32.method345(local11);
							if (local68 != 22 || !aBoolean175 || local89.aBoolean121 || local89.aBoolean116) {
								local3 &= local89.method350(aByte26);
								local30 = true;
							}
						}
					}
					local35 = local9.method419();
					if (local35 == 0) {
						break;
					}
					local9.method405();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("67582, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "(II)I")
	private static int method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!WMHCOPKE", name = "d", descriptor = "(II)I")
	private static int method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method529(arg0 - 1, arg1 - 1) + method529(arg0 + 1, arg1 - 1) + method529(arg0 - 1, arg1 + 1) + method529(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method529(arg0 - 1, arg1) + method529(arg0 + 1, arg1) + method529(arg0, arg1 - 1) + method529(arg0, arg1 + 1);
		@Pc(59) int local59 = method529(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(III)I")
	private static int method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method523(local3, local13);
		@Pc(29) int local29 = method523(local3 + 1, local13);
		@Pc(35) int local35 = method523(local3, local13 + 1);
		@Pc(43) int local43 = method523(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method527(local23, local29, local9, arg2);
		@Pc(55) int local55 = method527(local35, local43, local9, arg2);
		return method527(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(III)Z")
	public static boolean method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class32 local2 = Class32.method345(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method349(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("61950, " + arg0 + ", " + arg1 + ", " + 19 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(IIII)I")
	private static int method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub3.anIntArray162[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(Lclient!SVWJKJVI;Lclient!IHBKBLZU;I)V")
	public static void method528(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) Class4_Sub1 arg1) {
		try {
			@Pc(11) int local11 = -1;
			while (true) {
				@Pc(14) int local14 = arg0.method419();
				if (local14 == 0) {
					return;
				}
				local11 += local14;
				@Pc(23) Class32 local23 = Class32.method345(local11);
				local23.method343(arg1);
				while (true) {
					@Pc(30) int local30 = arg0.method419();
					if (local30 == 0) {
						break;
					}
					arg0.method405();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("66140, " + arg0 + ", " + arg1 + ", " + 923 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "e", descriptor = "(II)I")
	private static int method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(I[[[IIZILclient!OXMJPDWD;Lclient!GXHGUSOD;IIII)V")
	public static void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg7][arg0][arg9];
			@Pc(19) int local19 = arg1[arg7][arg0 + 1][arg9];
			@Pc(31) int local31 = arg1[arg7][arg0 + 1][arg9 + 1];
			@Pc(41) int local41 = arg1[arg7][arg0][arg9 + 1];
			@Pc(55) int local55 = local9 + local19 + local31 + local41 >> 2;
			@Pc(58) Class32 local58 = Class32.method345(arg2);
			@Pc(70) int local70 = arg0 + (arg9 << 7) + (arg2 << 14) + 1073741824;
			if (!local58.aBoolean121) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg8 << 6) + arg3);
			@Pc(104) Class1_Sub1_Sub1 local104;
			if (arg3 == 22) {
				if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
					local104 = local58.method342(22, arg8, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 22, arg8, true, local9, local41);
				}
				arg5.method60(local104, arg0, arg9, local70, local55, arg6, local84);
				if (local58.aBoolean117 && local58.aBoolean121) {
					arg4.method298(arg9, arg0);
				}
			} else {
				@Pc(200) int local200;
				if (arg3 == 10 || arg3 == 11) {
					if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
						local104 = local58.method342(10, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 10, arg8, true, local9, local41);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg3 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg8 == 1 || arg8 == 3) {
							local200 = local58.anInt547;
							local203 = local58.anInt543;
						} else {
							local200 = local58.anInt543;
							local203 = local58.anInt547;
						}
						arg5.method64(arg6, local70, aByte25, local104, local200, local55, local84, arg9, local203, arg0, local187);
					}
					if (local58.aBoolean117) {
						arg4.method297(arg9, local58.anInt547, local58.anInt543, arg8, local58.aBoolean119, arg0);
					}
				} else if (arg3 >= 12) {
					if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
						local104 = local58.method342(arg3, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, arg3, arg8, true, local9, local41);
					}
					arg5.method64(arg6, local70, aByte25, local104, 1, local55, local84, arg9, 1, arg0, 0);
					if (local58.aBoolean117) {
						arg4.method297(arg9, local58.anInt547, local58.anInt543, arg8, local58.aBoolean119, arg0);
					}
				} else if (arg3 == 0) {
					if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
						local104 = local58.method342(0, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 0, arg8, true, local9, local41);
					}
					arg5.method62(arg0, 0, null, local70, local104, anIntArray202[arg8], local84, arg9, local55, arg6);
					if (local58.aBoolean117) {
						arg4.method296(arg3, arg9, local58.aBoolean119, arg8, arg0);
					}
				} else if (arg3 == 1) {
					if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
						local104 = local58.method342(1, arg8, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 1, arg8, true, local9, local41);
					}
					arg5.method62(arg0, 0, null, local70, local104, anIntArray201[arg8], local84, arg9, local55, arg6);
					if (local58.aBoolean117) {
						arg4.method296(arg3, arg9, local58.aBoolean119, arg8, arg0);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class1_Sub1_Sub1 local475;
					if (arg3 == 2) {
						local446 = arg8 + 1 & 0x3;
						@Pc(465) Class1_Sub1_Sub1 local465;
						if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
							local465 = local58.method342(2, arg8 + 4, local9, local19, local31, local41, -1);
							local475 = local58.method342(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 2, arg8 + 4, true, local9, local41);
							local475 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 2, local446, true, local9, local41);
						}
						arg5.method62(arg0, anIntArray202[local446], local475, local70, local465, anIntArray202[arg8], local84, arg9, local55, arg6);
						if (local58.aBoolean117) {
							arg4.method296(arg3, arg9, local58.aBoolean119, arg8, arg0);
						}
					} else if (arg3 == 3) {
						if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
							local104 = local58.method342(3, arg8, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 3, arg8, true, local9, local41);
						}
						arg5.method62(arg0, 0, null, local70, local104, anIntArray201[arg8], local84, arg9, local55, arg6);
						if (local58.aBoolean117) {
							arg4.method296(arg3, arg9, local58.aBoolean119, arg8, arg0);
						}
					} else if (arg3 == 9) {
						if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
							local104 = local58.method342(arg3, arg8, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, arg3, arg8, true, local9, local41);
						}
						arg5.method64(arg6, local70, aByte25, local104, 1, local55, local84, arg9, 1, arg0, 0);
						if (local58.aBoolean117) {
							arg4.method297(arg9, local58.anInt547, local58.anInt543, arg8, local58.aBoolean119, arg0);
						}
					} else {
						if (local58.aBoolean124) {
							if (arg8 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg8 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg8 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg3 == 4) {
							if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
								local104 = local58.method342(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 4, 0, true, local9, local41);
							}
							arg5.method63(arg6, 0, local104, local70, anIntArray202[arg8], 0, local84, 450, arg0, arg8 * 512, local55, arg9);
						} else if (arg3 == 5) {
							local446 = 16;
							local200 = arg5.method80(arg6, arg0, arg9);
							if (local200 > 0) {
								local446 = Class32.method345(local200 >> 14 & 0x7FFF).anInt552;
							}
							if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
								local475 = local58.method342(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 4, 0, true, local9, local41);
							}
							arg5.method63(arg6, anIntArray204[arg8] * local446, local475, local70, anIntArray202[arg8], anIntArray203[arg8] * local446, local84, 450, arg0, arg8 * 512, local55, arg9);
						} else if (arg3 == 6) {
							if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
								local104 = local58.method342(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 4, 0, true, local9, local41);
							}
							arg5.method63(arg6, 0, local104, local70, 256, 0, local84, 450, arg0, arg8, local55, arg9);
						} else if (arg3 == 7) {
							if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
								local104 = local58.method342(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 4, 0, true, local9, local41);
							}
							arg5.method63(arg6, 0, local104, local70, 512, 0, local84, 450, arg0, arg8, local55, arg9);
						} else if (arg3 == 8) {
							if (local58.anInt553 == -1 && local58.anIntArray154 == null) {
								local104 = local58.method342(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local31, local19, arg2, local58.anInt553, -371, 4, 0, true, local9, local41);
							}
							arg5.method63(arg6, 0, local104, local70, 768, 0, local84, 450, arg0, arg8, local55, arg9);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("33350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "<init>", descriptor = "([[[I[[[BIBI)V")
	public Class45(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			anInt739 = 99;
			this.anInt740 = arg2;
			this.anInt741 = arg4;
			this.anIntArrayArrayArray5 = arg0;
			this.aByteArrayArrayArray6 = arg1;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt740][this.anInt741];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt740][this.anInt741];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt740][this.anInt741];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt740][this.anInt741];
			this.anIntArrayArrayArray6 = new int[4][this.anInt740 + 1][this.anInt741 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt740 + 1][this.anInt741 + 1];
			this.anIntArrayArray21 = new int[this.anInt740 + 1][this.anInt741 + 1];
			this.anIntArray196 = new int[this.anInt741];
			this.anIntArray197 = new int[this.anInt741];
			this.anIntArray198 = new int[this.anInt741];
			this.anIntArray199 = new int[this.anInt741];
			this.anIntArray200 = new int[this.anInt741];
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("19755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIII)I")
	private int method518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray6[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("49663, " + arg0 + ", " + -572 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(I[Lclient!OXMJPDWD;I[BIII)V")
	public void method519(@OriginalArg(0) int arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg4 + local11 > 0 && arg4 + local11 < 103) {
							arg1[local3].anIntArrayArray13[arg3 + local7][arg4 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class1_Sub1_Sub4 local65 = new Class1_Sub1_Sub4(arg2, true);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
					for (@Pc(79) int local79 = 0; local79 < 64; local79++) {
						this.method520(local65, arg5, 0, arg0, local79 + arg4, local11, local75 + arg3);
					}
				}
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("5638, " + arg0 + ", " + arg1 + ", " + -39848 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(Lclient!SVWJKJVI;IIIIIII)V")
	private void method520(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(28) int local28;
			if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
				this.aByteArrayArrayArray6[arg5][arg6][arg4] = 0;
				while (true) {
					local28 = arg0.method405();
					if (local28 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray5[0][arg6][arg4] = -method516(arg6 + arg1 + 932731, arg4 + 556238 + arg3) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg5][arg6][arg4] = this.anIntArrayArrayArray5[arg5 - 1][arg6][arg4] - 240;
							return;
						}
					}
					if (local28 == 1) {
						@Pc(82) int local82 = arg0.method405();
						if (local82 == 1) {
							local82 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray5[0][arg6][arg4] = -local82 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg5][arg6][arg4] = this.anIntArrayArrayArray5[arg5 - 1][arg6][arg4] - local82 * 8;
						return;
					}
					if (local28 <= 49) {
						this.aByteArrayArrayArray7[arg5][arg6][arg4] = arg0.method406();
						this.aByteArrayArrayArray5[arg5][arg6][arg4] = (byte) ((local28 - 2) / 4);
						this.aByteArrayArrayArray4[arg5][arg6][arg4] = (byte) (local28 + arg2 - 2 & 0x3);
					} else if (local28 <= 81) {
						this.aByteArrayArrayArray6[arg5][arg6][arg4] = (byte) (local28 - 49);
					} else {
						this.aByteArrayArrayArray2[arg5][arg6][arg4] = (byte) (local28 - 81);
					}
				}
			} else {
				while (true) {
					local28 = arg0.method405();
					if (local28 == 0) {
						return;
					}
					if (local28 == 1) {
						arg0.method405();
						return;
					}
					if (local28 <= 49) {
						arg0.method405();
					}
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("25529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "b", descriptor = "(II)I")
	private int method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(ZIII)V")
	public void method524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg2][arg1 + local3][arg0 + local7] = 0;
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg2][arg1][arg0 + local7] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 + local7];
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg2][arg1 + local7][arg0] = this.anIntArrayArrayArray5[arg2][arg1 + local7][arg0 - 1];
				}
			}
			if (arg1 > 0 && this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1][arg0 - 1];
			} else if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg2][arg1][arg0] = this.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1];
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("57425, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(Lclient!GXHGUSOD;[Lclient!OXMJPDWD;I)V")
	public void method530(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class28[] arg1) {
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
								arg1[local27].method298(local11, local7);
							}
						}
					}
				}
			}
			anInt743 += (int) (Math.random() * 5.0D) - 2;
			if (anInt743 < -8) {
				anInt743 = -8;
			}
			if (anInt743 > 8) {
				anInt743 = 8;
			}
			anInt735 += (int) (Math.random() * 5.0D) - 2;
			if (anInt735 < -16) {
				anInt735 = -16;
			}
			if (anInt735 > 16) {
				anInt735 = 16;
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
				for (local141 = 1; local141 < this.anInt741 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt740 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray21[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt741; local145++) {
					this.anIntArray196[local145] = 0;
					this.anIntArray197[local145] = 0;
					this.anIntArray198[local145] = 0;
					this.anIntArray199[local145] = 0;
					this.anIntArray200[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt740 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt741; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt740) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class6 local378 = Class6.aClass6Array1[local210 - 1];
								this.anIntArray196[local191] += local378.anInt76;
								this.anIntArray197[local191] += local378.anInt74;
								this.anIntArray198[local191] += local378.anInt75;
								this.anIntArray199[local191] += local378.anInt77;
								local419 = this.anIntArray200[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt740) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class6 local451 = Class6.aClass6Array1[local214 - 1];
								this.anIntArray196[local191] -= local451.anInt76;
								this.anIntArray197[local191] -= local451.anInt74;
								this.anIntArray198[local191] -= local451.anInt75;
								this.anIntArray199[local191] -= local451.anInt77;
								local419 = this.anIntArray200[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt740 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt741 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt741) {
								local204 += this.anIntArray196[local527];
								local210 += this.anIntArray197[local527];
								local214 += this.anIntArray198[local527];
								local220 += this.anIntArray199[local527];
								local236 += this.anIntArray200[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt741) {
								local204 -= this.anIntArray196[local572];
								local210 -= this.anIntArray197[local572];
								local214 -= this.anIntArray198[local572];
								local220 -= this.anIntArray199[local572];
								local236 -= this.anIntArray200[local572];
							}
							if (local284 >= 1 && local284 < this.anInt741 - 1 && (!aBoolean175 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method518(local284, local169, local7) == anInt742)) {
								if (local7 < anInt739) {
									anInt739 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray7[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray21[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray21[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray21[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray21[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method532(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt743 & 0xFF;
										local786 += anInt735;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method532(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class6.aClass6Array1[local682 - 1].aBoolean19) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class1_Sub1_Sub2_Sub3.anIntArray166[method522(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method59(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method522(local768, local737), method522(local768, local746), method522(local768, local757), method522(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class6 local941 = Class6.aClass6Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt72;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class1_Sub1_Sub2_Sub3.method372(local944);
											local952 = -1;
										} else if (local941.anInt71 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class1_Sub1_Sub2_Sub3.anIntArray166[this.method521(local941.anInt78, 96)];
										} else {
											local952 = this.method532(local941.anInt73, local941.anInt74, local941.anInt75);
											local950 = Class1_Sub1_Sub2_Sub3.anIntArray166[this.method521(local941.anInt78, 96)];
										}
										arg0.method59(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method522(local768, local737), method522(local768, local746), method522(local768, local757), method522(local768, local766), this.method521(local952, local737), this.method521(local952, local746), this.method521(local952, local757), this.method521(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt741 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt740 - 1; local204++) {
						arg0.method58(local7, local204, local191, this.method518(local191, local204, local7));
					}
				}
			}
			arg0.method85();
			for (local11 = 0; local11 < this.anInt740; local11++) {
				for (local27 = 0; local27 < this.anInt741; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg0.method56(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1134) int local1134 = 2;
			@Pc(1136) int local1136 = 4;
			for (@Pc(1138) int local1138 = 0; local1138 < 4; local1138++) {
				if (local1138 > 0) {
					local27 <<= 0x3;
					local1134 <<= 0x3;
					local1136 <<= 0x3;
				}
				for (@Pc(1156) int local1156 = 0; local1156 <= local1138; local1156++) {
					for (local133 = 0; local133 <= this.anInt741; local133++) {
						for (local139 = 0; local139 <= this.anInt740; local139++) {
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1156][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt741 && (this.anIntArrayArrayArray6[local1156][local139][local145 + 1] & local27) != 0) {
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
									Class10.method57(local214, local145 * 128 + 128, local139 * 128, 1, local139 * 128, local141 * 128, local220, local1138);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1156][local141 - 1][local133] & local1134) != 0) {
									local141--;
								}
								while (local145 < this.anInt740 && (this.anIntArrayArrayArray6[local1156][local145 + 1][local133] & local1134) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1134) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1138) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1134) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class10.method57(local214, local133 * 128, local145 * 128 + 128, 2, local141 * 128, local133 * 128, local220, local1138);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1134;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1156][local139][local133] & local1136) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1156][local139][local169 - 1] & local1136) != 0) {
									local169--;
								}
								while (local191 < this.anInt741 && (this.anIntArrayArrayArray6[local1156][local139][local191 + 1] & local1136) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1156][local141 - 1][local204] & local1136) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt740) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1156][local145 + 1][local204] & local1136) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1156][local141][local169];
									Class10.method57(local204, local191 * 128 + 128, local145 * 128 + 128, 4, local141 * 128, local169 * 128, local204, local1138);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1156][local210][local214] &= ~local1136;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("62960, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "c", descriptor = "(III)I")
	private int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIILclient!OXMJPDWD;IILclient!GXHGUSOD;II)V")
	private void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean175 && (this.aByteArrayArrayArray6[0][arg7][arg0] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg2][arg7][arg0] & 0x10) != 0) {
					return;
				}
				if (this.method518(arg0, arg7, arg2) != anInt742) {
					return;
				}
			}
			if (arg2 < anInt739) {
				anInt739 = arg2;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg2][arg7][arg0];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg2][arg7 + 1][arg0];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg2][arg7 + 1][arg0 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg2][arg7][arg0 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(106) Class32 local106 = Class32.method345(arg4);
			@Pc(118) int local118 = arg7 + (arg0 << 7) + (arg4 << 14) + 1073741824;
			if (!local106.aBoolean121) {
				local118 += Integer.MIN_VALUE;
			}
			@Pc(132) byte local132 = (byte) ((arg5 << 6) + arg1);
			@Pc(161) Class1_Sub1_Sub1 local161;
			if (arg1 != 22) {
				@Pc(259) int local259;
				if (arg1 == 10 || arg1 == 11) {
					if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
						local161 = local106.method342(10, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 10, arg5, true, local49, local84);
					}
					if (local161 != null) {
						@Pc(246) int local246 = 0;
						if (arg1 == 11) {
							local246 += 256;
						}
						@Pc(262) int local262;
						if (arg5 == 1 || arg5 == 3) {
							local259 = local106.anInt547;
							local262 = local106.anInt543;
						} else {
							local259 = local106.anInt543;
							local262 = local106.anInt547;
						}
						if (arg6.method64(arg2, local118, aByte25, local161, local259, local94, local132, arg0, local262, arg7, local246) && local106.aBoolean123) {
							@Pc(293) Class1_Sub1_Sub1_Sub3 local293;
							if (local161 instanceof Class1_Sub1_Sub1_Sub3) {
								local293 = (Class1_Sub1_Sub1_Sub3) local161;
							} else {
								local293 = local106.method342(10, arg5, local49, local60, local73, local84, -1);
							}
							if (local293 != null) {
								for (@Pc(309) int local309 = 0; local309 <= local259; local309++) {
									for (@Pc(313) int local313 = 0; local313 <= local262; local313++) {
										@Pc(320) int local320 = local293.anInt184 / 4;
										if (local320 > 30) {
											local320 = 30;
										}
										if (local320 > this.aByteArrayArrayArray3[arg2][arg7 + local309][arg0 + local313]) {
											this.aByteArrayArrayArray3[arg2][arg7 + local309][arg0 + local313] = (byte) local320;
										}
									}
								}
							}
						}
					}
					if (local106.aBoolean117 && arg3 != null) {
						arg3.method297(arg0, local106.anInt547, local106.anInt543, arg5, local106.aBoolean119, arg7);
					}
				} else if (arg1 >= 12) {
					if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
						local161 = local106.method342(arg1, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, arg1, arg5, true, local49, local84);
					}
					arg6.method64(arg2, local118, aByte25, local161, 1, local94, local132, arg0, 1, arg7, 0);
					if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x924;
					}
					if (local106.aBoolean117 && arg3 != null) {
						arg3.method297(arg0, local106.anInt547, local106.anInt543, arg5, local106.aBoolean119, arg7);
					}
				} else if (arg1 == 0) {
					if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
						local161 = local106.method342(0, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 0, arg5, true, local49, local84);
					}
					arg6.method62(arg7, 0, null, local118, local161, anIntArray202[arg5], local132, arg0, local94, arg2);
					if (arg5 == 0) {
						if (local106.aBoolean123) {
							this.aByteArrayArrayArray3[arg2][arg7][arg0] = 50;
							this.aByteArrayArrayArray3[arg2][arg7][arg0 + 1] = 50;
						}
						if (local106.aBoolean118) {
							this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local106.aBoolean123) {
							this.aByteArrayArrayArray3[arg2][arg7][arg0 + 1] = 50;
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0 + 1] = 50;
						}
						if (local106.aBoolean118) {
							this.anIntArrayArrayArray6[arg2][arg7][arg0 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local106.aBoolean123) {
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0] = 50;
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0 + 1] = 50;
						}
						if (local106.aBoolean118) {
							this.anIntArrayArrayArray6[arg2][arg7 + 1][arg0] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local106.aBoolean123) {
							this.aByteArrayArrayArray3[arg2][arg7][arg0] = 50;
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0] = 50;
						}
						if (local106.aBoolean118) {
							this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x492;
						}
					}
					if (local106.aBoolean117 && arg3 != null) {
						arg3.method296(arg1, arg0, local106.aBoolean119, arg5, arg7);
					}
					if (local106.anInt552 != 16) {
						arg6.method70(arg7, arg2, arg0, local106.anInt552);
					}
				} else if (arg1 == 1) {
					if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
						local161 = local106.method342(1, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 1, arg5, true, local49, local84);
					}
					arg6.method62(arg7, 0, null, local118, local161, anIntArray201[arg5], local132, arg0, local94, arg2);
					if (local106.aBoolean123) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray3[arg2][arg7][arg0 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray3[arg2][arg7][arg0] = 50;
						}
					}
					if (local106.aBoolean117 && arg3 != null) {
						arg3.method296(arg1, arg0, local106.aBoolean119, arg5, arg7);
					}
				} else {
					@Pc(870) int local870;
					@Pc(899) Class1_Sub1_Sub1 local899;
					if (arg1 == 2) {
						local870 = arg5 + 1 & 0x3;
						@Pc(889) Class1_Sub1_Sub1 local889;
						if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
							local889 = local106.method342(2, arg5 + 4, local49, local60, local73, local84, -1);
							local899 = local106.method342(2, local870, local49, local60, local73, local84, -1);
						} else {
							local889 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 2, arg5 + 4, true, local49, local84);
							local899 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 2, local870, true, local49, local84);
						}
						arg6.method62(arg7, anIntArray202[local870], local899, local118, local889, anIntArray202[arg5], local132, arg0, local94, arg2);
						if (local106.aBoolean118) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x249;
								this.anIntArrayArrayArray6[arg2][arg7][arg0 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray6[arg2][arg7][arg0 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg2][arg7 + 1][arg0] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray6[arg2][arg7 + 1][arg0] |= 0x249;
								this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x492;
								this.anIntArrayArrayArray6[arg2][arg7][arg0] |= 0x249;
							}
						}
						if (local106.aBoolean117 && arg3 != null) {
							arg3.method296(arg1, arg0, local106.aBoolean119, arg5, arg7);
						}
						if (local106.anInt552 != 16) {
							arg6.method70(arg7, arg2, arg0, local106.anInt552);
						}
					} else if (arg1 == 3) {
						if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
							local161 = local106.method342(3, arg5, local49, local60, local73, local84, -1);
						} else {
							local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 3, arg5, true, local49, local84);
						}
						arg6.method62(arg7, 0, null, local118, local161, anIntArray201[arg5], local132, arg0, local94, arg2);
						if (local106.aBoolean123) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray3[arg2][arg7][arg0 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray3[arg2][arg7 + 1][arg0] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray3[arg2][arg7][arg0] = 50;
							}
						}
						if (local106.aBoolean117 && arg3 != null) {
							arg3.method296(arg1, arg0, local106.aBoolean119, arg5, arg7);
						}
					} else if (arg1 == 9) {
						if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
							local161 = local106.method342(arg1, arg5, local49, local60, local73, local84, -1);
						} else {
							local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, arg1, arg5, true, local49, local84);
						}
						arg6.method64(arg2, local118, aByte25, local161, 1, local94, local132, arg0, 1, arg7, 0);
						if (local106.aBoolean117 && arg3 != null) {
							arg3.method297(arg0, local106.anInt547, local106.anInt543, arg5, local106.aBoolean119, arg7);
						}
					} else {
						if (local106.aBoolean124) {
							if (arg5 == 1) {
								local870 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local870;
							} else if (arg5 == 2) {
								local870 = local84;
								local84 = local60;
								local60 = local870;
								local870 = local73;
								local73 = local49;
								local49 = local870;
							} else if (arg5 == 3) {
								local870 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local870;
							}
						}
						if (arg1 == 4) {
							if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
								local161 = local106.method342(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 4, 0, true, local49, local84);
							}
							arg6.method63(arg2, 0, local161, local118, anIntArray202[arg5], 0, local132, 450, arg7, arg5 * 512, local94, arg0);
						} else if (arg1 == 5) {
							local870 = 16;
							local259 = arg6.method80(arg2, arg7, arg0);
							if (local259 > 0) {
								local870 = Class32.method345(local259 >> 14 & 0x7FFF).anInt552;
							}
							if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
								local899 = local106.method342(4, 0, local49, local60, local73, local84, -1);
							} else {
								local899 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 4, 0, true, local49, local84);
							}
							arg6.method63(arg2, anIntArray204[arg5] * local870, local899, local118, anIntArray202[arg5], anIntArray203[arg5] * local870, local132, 450, arg7, arg5 * 512, local94, arg0);
						} else if (arg1 == 6) {
							if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
								local161 = local106.method342(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 4, 0, true, local49, local84);
							}
							arg6.method63(arg2, 0, local161, local118, 256, 0, local132, 450, arg7, arg5, local94, arg0);
						} else if (arg1 == 7) {
							if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
								local161 = local106.method342(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 4, 0, true, local49, local84);
							}
							arg6.method63(arg2, 0, local161, local118, 512, 0, local132, 450, arg7, arg5, local94, arg0);
						} else if (arg1 == 8) {
							if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
								local161 = local106.method342(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 4, 0, true, local49, local84);
							}
							arg6.method63(arg2, 0, local161, local118, 768, 0, local132, 450, arg7, arg5, local94, arg0);
						}
					}
				}
			} else if (!aBoolean175 || local106.aBoolean121 || local106.aBoolean116) {
				if (local106.anInt553 == -1 && local106.anIntArray154 == null) {
					local161 = local106.method342(22, arg5, local49, local60, local73, local84, -1);
				} else {
					local161 = new Class1_Sub1_Sub1_Sub2(local73, local60, arg4, local106.anInt553, -371, 22, arg5, true, local49, local84);
				}
				arg6.method60(local161, arg7, arg0, local118, local94, arg2, local132);
				if (local106.aBoolean117 && local106.aBoolean121 && arg3 != null) {
					arg3.method298(arg0, arg7);
				}
			}
		} catch (@Pc(1644) RuntimeException local1644) {
			signlink.reporterror("53682, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -302 + ", " + arg7 + ", " + local1644.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "([BIILclient!GXHGUSOD;I[Lclient!OXMJPDWD;)V")
	public void method534(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(arg0, true);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method419();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method419();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method405();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg1;
					@Pc(68) int local68 = local39 + arg3;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray6[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class28 local95 = null;
						if (local80 >= 0) {
							local95 = arg4[local80];
						}
						this.method533(local68, local56, local49, local95, local9, local60, arg2, local64);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("78502, " + arg0 + ", " + arg1 + ", " + 6107 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIIII)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(11) int local11 = arg1; local11 <= arg1 + arg3; local11++) {
				for (@Pc(15) int local15 = arg0; local15 <= arg0 + arg2; local15++) {
					if (local15 >= 0 && local15 < this.anInt740 && local11 >= 0 && local11 < this.anInt741) {
						this.aByteArrayArrayArray3[0][local15][local11] = 127;
						if (local15 == arg0 && local15 > 0) {
							this.anIntArrayArrayArray5[0][local15][local11] = this.anIntArrayArrayArray5[0][local15 - 1][local11];
						}
						if (local15 == arg0 + arg2 && local15 < this.anInt740 - 1) {
							this.anIntArrayArrayArray5[0][local15][local11] = this.anIntArrayArrayArray5[0][local15 + 1][local11];
						}
						if (local11 == arg1 && local11 > 0) {
							this.anIntArrayArrayArray5[0][local15][local11] = this.anIntArrayArrayArray5[0][local15][local11 - 1];
						}
						if (local11 == arg1 + arg3 && local11 < this.anInt741 - 1) {
							this.anIntArrayArrayArray5[0][local15][local11] = this.anIntArrayArrayArray5[0][local15][local11 + 1];
						}
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("42678, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(III[BBIIII[Lclient!OXMJPDWD;)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class28[] arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg5 + local7 > 0 && arg5 + local7 < 103) {
						arg8[arg6].anIntArrayArray13[arg4 + local3][arg5 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub4 local57 = new Class1_Sub1_Sub4(arg3, true);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg7 && local63 >= arg2 && local63 < arg2 + 8 && local67 >= arg1 && local67 < arg1 + 8) {
							this.method520(local57, 0, arg0, 0, arg5 + Class49.method543(local67 & 0x7, arg0, local63 & 0x7), arg6, arg4 + Class49.method542(local67 & 0x7, local63 & 0x7, arg0));
						} else {
							this.method520(local57, 0, 0, 0, -1, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("35378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 74 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMHCOPKE", name = "a", descriptor = "(IIII[Lclient!OXMJPDWD;II[BILclient!GXHGUSOD;I)V")
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class10 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(arg6, true);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(17) int local17 = local7.method419();
				if (local17 == 0) {
					return;
				}
				local9 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local7.method419();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local7.method405();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					if (local50 == arg5 && local46 >= arg3 && local46 < arg3 + 8 && local40 >= arg2 && local40 < arg2 + 8) {
						@Pc(83) Class32 local83 = Class32.method345(local9);
						@Pc(100) int local100 = arg7 + Class49.method544(local83.anInt543, local40 & 0x7, arg1, 426, local46 & 0x7, local83.anInt547, local61);
						@Pc(117) int local117 = arg0 + Class49.method545(local46 & 0x7, local40 & 0x7, local61, arg1, local83.anInt547, local83.anInt543);
						if (local100 > 0 && local117 > 0 && local100 < 103 && local117 < 103) {
							@Pc(129) int local129 = arg9;
							if ((this.aByteArrayArrayArray6[1][local100][local117] & 0x2) == 2) {
								local129 = arg9 - 1;
							}
							@Pc(144) Class28 local144 = null;
							if (local129 >= 0) {
								local144 = arg4[local129];
							}
							this.method533(local117, local57, arg9, local144, local9, local61 + arg1 & 0x3, arg8, local100);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("75851, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -192 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}
}
