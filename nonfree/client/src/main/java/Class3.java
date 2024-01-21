import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BXGEDAMF")
public final class Class3 {

	@OriginalMember(owner = "client!BXGEDAMF", name = "l", descriptor = "I")
	public static int anInt98;

	@OriginalMember(owner = "client!BXGEDAMF", name = "A", descriptor = "Z")
	private static boolean aBoolean28;

	@OriginalMember(owner = "client!BXGEDAMF", name = "C", descriptor = "I")
	private static int anInt103;

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "[I")
	private static final int[] anIntArray8 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "I")
	public static int anInt94 = 99;

	@OriginalMember(owner = "client!BXGEDAMF", name = "i", descriptor = "[I")
	private static final int[] anIntArray9 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!BXGEDAMF", name = "j", descriptor = "I")
	private static int anInt97 = -30521;

	@OriginalMember(owner = "client!BXGEDAMF", name = "k", descriptor = "[I")
	private static final int[] anIntArray10 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!BXGEDAMF", name = "o", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!BXGEDAMF", name = "p", descriptor = "I")
	private static int anInt99 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!BXGEDAMF", name = "s", descriptor = "[I")
	private static final int[] anIntArray11 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!BXGEDAMF", name = "t", descriptor = "I")
	private static int anInt100 = -660;

	@OriginalMember(owner = "client!BXGEDAMF", name = "B", descriptor = "I")
	private static int anInt102 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!BXGEDAMF", name = "D", descriptor = "I")
	private static int anInt104 = 6;

	@OriginalMember(owner = "client!BXGEDAMF", name = "g", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!BXGEDAMF", name = "z", descriptor = "I")
	private int anInt101 = 44107;

	@OriginalMember(owner = "client!BXGEDAMF", name = "E", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!BXGEDAMF", name = "c", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!BXGEDAMF", name = "d", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!BXGEDAMF", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!BXGEDAMF", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!BXGEDAMF", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!BXGEDAMF", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!BXGEDAMF", name = "f", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!BXGEDAMF", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!BXGEDAMF", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!BXGEDAMF", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!BXGEDAMF", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!BXGEDAMF", name = "u", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!BXGEDAMF", name = "v", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!BXGEDAMF", name = "w", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!BXGEDAMF", name = "x", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!BXGEDAMF", name = "y", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ZLclient!TKPFKOXP;Lclient!FOFQGQZJ;)V")
	public static void method34(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) Class14_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(14) int local14 = arg0.method506();
				if (local14 == 0) {
					return;
				}
				local3 += local14;
				@Pc(23) Class37 local23 = Class37.method451(local3);
				local23.method456(arg1);
				while (true) {
					@Pc(30) int local30 = arg0.method506();
					if (local30 == 0) {
						break;
					}
					arg0.method492();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("84989, " + true + ", " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ZI[BI)Z")
	public static boolean method35(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class2_Sub1_Sub4 local9 = new Class2_Sub1_Sub4(859, arg1);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method506();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method506();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method492() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class37 local89 = Class37.method451(local11);
							if (local68 != 22 || !aBoolean27 || local89.aBoolean159 || local89.aBoolean157) {
								local3 &= local89.method450(anInt104);
								local30 = true;
							}
						}
					}
					local35 = local9.method506();
					if (local35 == 0) {
						break;
					}
					local9.method492();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("84256, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(II)I")
	private static int method36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIII)I")
	private static int method38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub3_Sub1.anIntArray52[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(III)I")
	private static int method41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method49(local3, local13);
		@Pc(29) int local29 = method49(local3 + 1, local13);
		@Pc(35) int local35 = method49(local3, local13 + 1);
		@Pc(43) int local43 = method49(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method38(local23, local29, local9, arg2);
		@Pc(55) int local55 = method38(local35, local43, local9, arg2);
		return method38(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "c", descriptor = "(II)I")
	private static int method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "d", descriptor = "(II)I")
	private static int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method41(arg0 + 45365, arg1 + 91923, 4) + (method41(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method41(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(BII)Z")
	public static boolean method48(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class37 local2 = Class37.method451(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method457(anInt97, arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("11564, " + -50 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "e", descriptor = "(II)I")
	private static int method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method43(arg0 - 1, arg1 - 1) + method43(arg0 + 1, arg1 - 1) + method43(arg0 - 1, arg1 + 1) + method43(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method43(arg0 - 1, arg1) + method43(arg0 + 1, arg1) + method43(arg0, arg1 - 1) + method43(arg0, arg1 + 1);
		@Pc(59) int local59 = method43(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([[[ILclient!VDSFJUIR;IIILclient!JPCEPCNA;IBIII)V")
	public static void method50(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg0[arg7][arg6][arg2];
			@Pc(19) int local19 = arg0[arg7][arg6 + 1][arg2];
			@Pc(35) int local35 = arg0[arg7][arg6 + 1][arg2 + 1];
			@Pc(45) int local45 = arg0[arg7][arg6][arg2 + 1];
			@Pc(55) int local55 = local9 + local19 + local35 + local45 >> 2;
			@Pc(58) Class37 local58 = Class37.method451(arg8);
			@Pc(70) int local70 = arg6 + (arg2 << 7) + (arg8 << 14) + 1073741824;
			if (!local58.aBoolean159) {
				local70 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg3 << 6) + arg9);
			@Pc(104) Class2_Sub1_Sub1 local104;
			if (arg9 == 22) {
				if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
					local104 = local58.method448(22, arg3, local9, local19, local35, local45, -1);
				} else {
					local104 = new Class2_Sub1_Sub1_Sub3(22, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
				}
				arg5.method228(local84, arg6, local55, arg4, arg2, local104, local70);
				if (local58.aBoolean156 && local58.aBoolean159) {
					arg1.method536(arg6, arg2);
				}
			} else {
				@Pc(200) int local200;
				if (arg9 == 10 || arg9 == 11) {
					if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
						local104 = local58.method448(10, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(10, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg9 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg3 == 1 || arg3 == 3) {
							local200 = local58.anInt593;
							local203 = local58.anInt575;
						} else {
							local200 = local58.anInt575;
							local203 = local58.anInt593;
						}
						arg5.method232(local55, local84, local200, arg2, local187, local70, arg4, local203, arg6, local104);
					}
					if (local58.aBoolean156) {
						arg1.method535(local58.anInt575, arg3, arg6, local58.aBoolean158, arg2, local58.anInt593);
					}
				} else if (arg9 >= 12) {
					if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
						local104 = local58.method448(arg9, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(arg9, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
					}
					arg5.method232(local55, local84, 1, arg2, 0, local70, arg4, 1, arg6, local104);
					if (local58.aBoolean156) {
						arg1.method535(local58.anInt575, arg3, arg6, local58.aBoolean158, arg2, local58.anInt593);
					}
				} else if (arg9 == 0) {
					if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
						local104 = local58.method448(0, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(0, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
					}
					arg5.method230(arg2, arg6, local55, null, anIntArray11[arg3], arg4, local84, local70, 0, local104);
					if (local58.aBoolean156) {
						arg1.method534(arg9, arg6, anInt103, arg3, local58.aBoolean158, arg2);
					}
				} else if (arg9 == 1) {
					if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
						local104 = local58.method448(1, arg3, local9, local19, local35, local45, -1);
					} else {
						local104 = new Class2_Sub1_Sub1_Sub3(1, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
					}
					arg5.method230(arg2, arg6, local55, null, anIntArray9[arg3], arg4, local84, local70, 0, local104);
					if (local58.aBoolean156) {
						arg1.method534(arg9, arg6, anInt103, arg3, local58.aBoolean158, arg2);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class2_Sub1_Sub1 local475;
					if (arg9 == 2) {
						local446 = arg3 + 1 & 0x3;
						@Pc(465) Class2_Sub1_Sub1 local465;
						if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
							local465 = local58.method448(2, arg3 + 4, local9, local19, local35, local45, -1);
							local475 = local58.method448(2, local446, local9, local19, local35, local45, -1);
						} else {
							local465 = new Class2_Sub1_Sub1_Sub3(2, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3 + 4);
							local475 = new Class2_Sub1_Sub1_Sub3(2, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, local446);
						}
						arg5.method230(arg2, arg6, local55, local475, anIntArray11[arg3], arg4, local84, local70, anIntArray11[local446], local465);
						if (local58.aBoolean156) {
							arg1.method534(arg9, arg6, anInt103, arg3, local58.aBoolean158, arg2);
						}
					} else if (arg9 == 3) {
						if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
							local104 = local58.method448(3, arg3, local9, local19, local35, local45, -1);
						} else {
							local104 = new Class2_Sub1_Sub1_Sub3(3, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
						}
						arg5.method230(arg2, arg6, local55, null, anIntArray9[arg3], arg4, local84, local70, 0, local104);
						if (local58.aBoolean156) {
							arg1.method534(arg9, arg6, anInt103, arg3, local58.aBoolean158, arg2);
						}
					} else if (arg9 == 9) {
						if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
							local104 = local58.method448(arg9, arg3, local9, local19, local35, local45, -1);
						} else {
							local104 = new Class2_Sub1_Sub1_Sub3(arg9, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, arg3);
						}
						arg5.method232(local55, local84, 1, arg2, 0, local70, arg4, 1, arg6, local104);
						if (local58.aBoolean156) {
							arg1.method535(local58.anInt575, arg3, arg6, local58.aBoolean158, arg2, local58.anInt593);
						}
					} else {
						if (local58.aBoolean155) {
							if (arg3 == 1) {
								local446 = local45;
								local45 = local35;
								local35 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg3 == 2) {
								local446 = local45;
								local45 = local19;
								local19 = local446;
								local446 = local35;
								local35 = local9;
								local9 = local446;
							} else if (arg3 == 3) {
								local446 = local45;
								local45 = local9;
								local9 = local19;
								local19 = local35;
								local35 = local446;
							}
						}
						if (arg9 == 4) {
							if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
								local104 = local58.method448(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(4, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, 0);
							}
							arg5.method231(local84, local104, 0, local70, arg2, arg4, arg6, 0, anIntArray11[arg3], arg3 * 512, local55);
						} else if (arg9 == 5) {
							local446 = 16;
							local200 = arg5.method248(arg4, arg6, arg2);
							if (local200 > 0) {
								local446 = Class37.method451(local200 >> 14 & 0x7FFF).anInt590;
							}
							if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
								local475 = local58.method448(4, 0, local9, local19, local35, local45, -1);
							} else {
								local475 = new Class2_Sub1_Sub1_Sub3(4, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, 0);
							}
							arg5.method231(local84, local475, anIntArray10[arg3] * local446, local70, arg2, arg4, arg6, anIntArray8[arg3] * local446, anIntArray11[arg3], arg3 * 512, local55);
						} else if (arg9 == 6) {
							if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
								local104 = local58.method448(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(4, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, 0);
							}
							arg5.method231(local84, local104, 0, local70, arg2, arg4, arg6, 0, 256, arg3, local55);
						} else if (arg9 == 7) {
							if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
								local104 = local58.method448(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(4, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, 0);
							}
							arg5.method231(local84, local104, 0, local70, arg2, arg4, arg6, 0, 512, arg3, local55);
						} else if (arg9 == 8) {
							if (local58.anInt580 == -1 && local58.anIntArray169 == null) {
								local104 = local58.method448(4, 0, local9, local19, local35, local45, -1);
							} else {
								local104 = new Class2_Sub1_Sub1_Sub3(4, local45, arg8, 2, local58.anInt580, local35, local19, local9, true, 0);
							}
							arg5.method231(local84, local104, 0, local70, arg2, arg4, arg6, 0, 768, arg3, local55);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("68838, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 50 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "<init>", descriptor = "([[[I[[[BIII)V")
	public Class3(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt94 = 99;
			this.anInt95 = arg3;
			this.anInt96 = arg4;
			this.anIntArrayArrayArray2 = arg0;
			this.aByteArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt95][this.anInt96];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt95][this.anInt96];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt95][this.anInt96];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt95][this.anInt96];
			this.anIntArrayArrayArray1 = new int[4][this.anInt95 + 1][this.anInt96 + 1];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt95 + 1][this.anInt96 + 1];
			this.anIntArrayArray1 = new int[this.anInt95 + 1][this.anInt96 + 1];
			this.anIntArray12 = new int[this.anInt96];
			this.anIntArray13 = new int[this.anInt96];
			this.anIntArray14 = new int[this.anInt96];
			this.anIntArray15 = new int[this.anInt96];
			this.anIntArray16 = new int[this.anInt96];
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("84174, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ILclient!JPCEPCNA;Lclient!VDSFJUIR;IIIIII)V")
	private void method33(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean27 && (this.aByteArrayArrayArray3[0][arg7][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg6][arg7][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method40(arg4, arg6, arg7) != anInt98) {
					return;
				}
			}
			if (arg6 < anInt94) {
				anInt94 = arg6;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg6][arg7][arg4];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg6][arg7 + 1][arg4];
			@Pc(64) boolean local64 = false;
			@Pc(77) int local77 = this.anIntArrayArrayArray2[arg6][arg7 + 1][arg4 + 1];
			@Pc(88) int local88 = this.anIntArrayArrayArray2[arg6][arg7][arg4 + 1];
			@Pc(98) int local98 = local49 + local60 + local77 + local88 >> 2;
			@Pc(101) Class37 local101 = Class37.method451(arg0);
			@Pc(113) int local113 = arg7 + (arg4 << 7) + (arg0 << 14) + 1073741824;
			if (!local101.aBoolean159) {
				local113 += Integer.MIN_VALUE;
			}
			@Pc(127) byte local127 = (byte) ((arg3 << 6) + arg5);
			@Pc(156) Class2_Sub1_Sub1 local156;
			if (arg5 != 22) {
				@Pc(254) int local254;
				if (arg5 == 10 || arg5 == 11) {
					if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
						local156 = local101.method448(10, arg3, local49, local60, local77, local88, -1);
					} else {
						local156 = new Class2_Sub1_Sub1_Sub3(10, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
					}
					if (local156 != null) {
						@Pc(241) int local241 = 0;
						if (arg5 == 11) {
							local241 += 256;
						}
						@Pc(257) int local257;
						if (arg3 == 1 || arg3 == 3) {
							local254 = local101.anInt593;
							local257 = local101.anInt575;
						} else {
							local254 = local101.anInt575;
							local257 = local101.anInt593;
						}
						if (arg1.method232(local98, local127, local254, arg4, local241, local113, arg6, local257, arg7, local156) && local101.aBoolean147) {
							@Pc(288) Class2_Sub1_Sub1_Sub6 local288;
							if (local156 instanceof Class2_Sub1_Sub1_Sub6) {
								local288 = (Class2_Sub1_Sub1_Sub6) local156;
							} else {
								local288 = local101.method448(10, arg3, local49, local60, local77, local88, -1);
							}
							if (local288 != null) {
								for (@Pc(304) int local304 = 0; local304 <= local254; local304++) {
									for (@Pc(308) int local308 = 0; local308 <= local257; local308++) {
										@Pc(315) int local315 = local288.anInt496 / 4;
										if (local315 > 30) {
											local315 = 30;
										}
										if (local315 > this.aByteArrayArrayArray1[arg6][arg7 + local304][arg4 + local308]) {
											this.aByteArrayArrayArray1[arg6][arg7 + local304][arg4 + local308] = (byte) local315;
										}
									}
								}
							}
						}
					}
					if (local101.aBoolean156 && arg2 != null) {
						arg2.method535(local101.anInt575, arg3, arg7, local101.aBoolean158, arg4, local101.anInt593);
					}
				} else if (arg5 >= 12) {
					if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
						local156 = local101.method448(arg5, arg3, local49, local60, local77, local88, -1);
					} else {
						local156 = new Class2_Sub1_Sub1_Sub3(arg5, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
					}
					arg1.method232(local98, local127, 1, arg4, 0, local113, arg6, 1, arg7, local156);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
						this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x924;
					}
					if (local101.aBoolean156 && arg2 != null) {
						arg2.method535(local101.anInt575, arg3, arg7, local101.aBoolean158, arg4, local101.anInt593);
					}
				} else if (arg5 == 0) {
					if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
						local156 = local101.method448(0, arg3, local49, local60, local77, local88, -1);
					} else {
						local156 = new Class2_Sub1_Sub1_Sub3(0, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
					}
					arg1.method230(arg4, arg7, local98, null, anIntArray11[arg3], arg6, local127, local113, 0, local156);
					if (arg3 == 0) {
						if (local101.aBoolean147) {
							this.aByteArrayArrayArray1[arg6][arg7][arg4] = 50;
							this.aByteArrayArrayArray1[arg6][arg7][arg4 + 1] = 50;
						}
						if (local101.aBoolean152) {
							this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local101.aBoolean147) {
							this.aByteArrayArrayArray1[arg6][arg7][arg4 + 1] = 50;
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4 + 1] = 50;
						}
						if (local101.aBoolean152) {
							this.anIntArrayArrayArray1[arg6][arg7][arg4 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local101.aBoolean147) {
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4] = 50;
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4 + 1] = 50;
						}
						if (local101.aBoolean152) {
							this.anIntArrayArrayArray1[arg6][arg7 + 1][arg4] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local101.aBoolean147) {
							this.aByteArrayArrayArray1[arg6][arg7][arg4] = 50;
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4] = 50;
						}
						if (local101.aBoolean152) {
							this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x492;
						}
					}
					if (local101.aBoolean156 && arg2 != null) {
						arg2.method534(arg5, arg7, anInt103, arg3, local101.aBoolean158, arg4);
					}
					if (local101.anInt590 != 16) {
						arg1.method238(arg4, this.aByte2, arg7, local101.anInt590, arg6);
					}
				} else if (arg5 == 1) {
					if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
						local156 = local101.method448(1, arg3, local49, local60, local77, local88, -1);
					} else {
						local156 = new Class2_Sub1_Sub1_Sub3(1, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
					}
					arg1.method230(arg4, arg7, local98, null, anIntArray9[arg3], arg6, local127, local113, 0, local156);
					if (local101.aBoolean147) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray1[arg6][arg7][arg4 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray1[arg6][arg7][arg4] = 50;
						}
					}
					if (local101.aBoolean156 && arg2 != null) {
						arg2.method534(arg5, arg7, anInt103, arg3, local101.aBoolean158, arg4);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class2_Sub1_Sub1 local895;
					if (arg5 == 2) {
						local866 = arg3 + 1 & 0x3;
						@Pc(885) Class2_Sub1_Sub1 local885;
						if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
							local885 = local101.method448(2, arg3 + 4, local49, local60, local77, local88, -1);
							local895 = local101.method448(2, local866, local49, local60, local77, local88, -1);
						} else {
							local885 = new Class2_Sub1_Sub1_Sub3(2, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3 + 4);
							local895 = new Class2_Sub1_Sub1_Sub3(2, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, local866);
						}
						arg1.method230(arg4, arg7, local98, local895, anIntArray11[arg3], arg6, local127, local113, anIntArray11[local866], local885);
						if (local101.aBoolean152) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x249;
								this.anIntArrayArrayArray1[arg6][arg7][arg4 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray1[arg6][arg7][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg6][arg7 + 1][arg4] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray1[arg6][arg7 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x492;
								this.anIntArrayArrayArray1[arg6][arg7][arg4] |= 0x249;
							}
						}
						if (local101.aBoolean156 && arg2 != null) {
							arg2.method534(arg5, arg7, anInt103, arg3, local101.aBoolean158, arg4);
						}
						if (local101.anInt590 != 16) {
							arg1.method238(arg4, this.aByte2, arg7, local101.anInt590, arg6);
						}
					} else if (arg5 == 3) {
						if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
							local156 = local101.method448(3, arg3, local49, local60, local77, local88, -1);
						} else {
							local156 = new Class2_Sub1_Sub1_Sub3(3, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
						}
						arg1.method230(arg4, arg7, local98, null, anIntArray9[arg3], arg6, local127, local113, 0, local156);
						if (local101.aBoolean147) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray1[arg6][arg7][arg4 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray1[arg6][arg7 + 1][arg4] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray1[arg6][arg7][arg4] = 50;
							}
						}
						if (local101.aBoolean156 && arg2 != null) {
							arg2.method534(arg5, arg7, anInt103, arg3, local101.aBoolean158, arg4);
						}
					} else if (arg5 == 9) {
						if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
							local156 = local101.method448(arg5, arg3, local49, local60, local77, local88, -1);
						} else {
							local156 = new Class2_Sub1_Sub1_Sub3(arg5, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
						}
						arg1.method232(local98, local127, 1, arg4, 0, local113, arg6, 1, arg7, local156);
						if (local101.aBoolean156 && arg2 != null) {
							arg2.method535(local101.anInt575, arg3, arg7, local101.aBoolean158, arg4, local101.anInt593);
						}
					} else {
						if (local101.aBoolean155) {
							if (arg3 == 1) {
								local866 = local88;
								local88 = local77;
								local77 = local60;
								local60 = local49;
								local49 = local866;
							} else if (arg3 == 2) {
								local866 = local88;
								local88 = local60;
								local60 = local866;
								local866 = local77;
								local77 = local49;
								local49 = local866;
							} else if (arg3 == 3) {
								local866 = local88;
								local88 = local49;
								local49 = local60;
								local60 = local77;
								local77 = local866;
							}
						}
						if (arg5 == 4) {
							if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
								local156 = local101.method448(4, 0, local49, local60, local77, local88, -1);
							} else {
								local156 = new Class2_Sub1_Sub1_Sub3(4, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, 0);
							}
							arg1.method231(local127, local156, 0, local113, arg4, arg6, arg7, 0, anIntArray11[arg3], arg3 * 512, local98);
						} else if (arg5 == 5) {
							local866 = 16;
							local254 = arg1.method248(arg6, arg7, arg4);
							if (local254 > 0) {
								local866 = Class37.method451(local254 >> 14 & 0x7FFF).anInt590;
							}
							if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
								local895 = local101.method448(4, 0, local49, local60, local77, local88, -1);
							} else {
								local895 = new Class2_Sub1_Sub1_Sub3(4, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, 0);
							}
							arg1.method231(local127, local895, anIntArray10[arg3] * local866, local113, arg4, arg6, arg7, anIntArray8[arg3] * local866, anIntArray11[arg3], arg3 * 512, local98);
						} else if (arg5 == 6) {
							if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
								local156 = local101.method448(4, 0, local49, local60, local77, local88, -1);
							} else {
								local156 = new Class2_Sub1_Sub1_Sub3(4, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, 0);
							}
							arg1.method231(local127, local156, 0, local113, arg4, arg6, arg7, 0, 256, arg3, local98);
						} else if (arg5 == 7) {
							if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
								local156 = local101.method448(4, 0, local49, local60, local77, local88, -1);
							} else {
								local156 = new Class2_Sub1_Sub1_Sub3(4, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, 0);
							}
							arg1.method231(local127, local156, 0, local113, arg4, arg6, arg7, 0, 512, arg3, local98);
						} else if (arg5 == 8) {
							if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
								local156 = local101.method448(4, 0, local49, local60, local77, local88, -1);
							} else {
								local156 = new Class2_Sub1_Sub1_Sub3(4, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, 0);
							}
							arg1.method231(local127, local156, 0, local113, arg4, arg6, arg7, 0, 768, arg3, local98);
						}
					}
				}
			} else if (!aBoolean27 || local101.aBoolean159 || local101.aBoolean157) {
				if (local101.anInt580 == -1 && local101.anIntArray169 == null) {
					local156 = local101.method448(22, arg3, local49, local60, local77, local88, -1);
				} else {
					local156 = new Class2_Sub1_Sub1_Sub3(22, local88, arg0, 2, local101.anInt580, local77, local60, local49, true, arg3);
				}
				arg1.method228(local127, arg7, local98, arg6, arg4, local156, local113);
				if (local101.aBoolean156 && local101.aBoolean159 && arg2 != null) {
					arg2.method536(arg7, arg4);
				}
			}
		} catch (@Pc(1641) RuntimeException local1641) {
			signlink.reporterror("37082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1641.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIIIIIILclient!TKPFKOXP;)V")
	private void method37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub1_Sub4 arg6) {
		try {
			@Pc(32) int local32;
			if (arg5 >= 0 && arg5 < 104 && arg1 >= 0 && arg1 < 104) {
				this.aByteArrayArrayArray3[arg0][arg5][arg1] = 0;
				while (true) {
					local32 = arg6.method492();
					if (local32 == 0) {
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg5][arg1] = -method46(arg5 + arg4 + 932731, arg1 + 556238 + arg2) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg0][arg5][arg1] = this.anIntArrayArrayArray2[arg0 - 1][arg5][arg1] - 240;
							return;
						}
					}
					if (local32 == 1) {
						@Pc(86) int local86 = arg6.method492();
						if (local86 == 1) {
							local86 = 0;
						}
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg5][arg1] = -local86 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg0][arg5][arg1] = this.anIntArrayArrayArray2[arg0 - 1][arg5][arg1] - local86 * 8;
						return;
					}
					if (local32 <= 49) {
						this.aByteArrayArrayArray6[arg0][arg5][arg1] = arg6.method493();
						this.aByteArrayArrayArray2[arg0][arg5][arg1] = (byte) ((local32 - 2) / 4);
						this.aByteArrayArrayArray4[arg0][arg5][arg1] = (byte) (local32 + arg3 - 2 & 0x3);
					} else if (local32 <= 81) {
						this.aByteArrayArrayArray3[arg0][arg5][arg1] = (byte) (local32 - 49);
					} else {
						this.aByteArrayArrayArray5[arg0][arg5][arg1] = (byte) (local32 - 81);
					}
				}
			} else {
				while (true) {
					local32 = arg6.method492();
					if (local32 == 0) {
						return;
					}
					if (local32 == 1) {
						arg6.method492();
						return;
					}
					if (local32 <= 49) {
						arg6.method492();
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("67214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(II)I")
	private int method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIBI)I")
	private int method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("65130, " + arg0 + ", " + arg1 + ", " + 65 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([Lclient!VDSFJUIR;Lclient!JPCEPCNA;Z)V")
	public void method42(@OriginalArg(0) Class42[] arg0, @OriginalArg(1) Class20 arg1) {
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
								arg0[local27].method536(local7, local11);
							}
						}
					}
				}
			}
			anInt102 += (int) (Math.random() * 5.0D) - 2;
			if (anInt102 < -8) {
				anInt102 = -8;
			}
			if (anInt102 > 8) {
				anInt102 = 8;
			}
			anInt99 += (int) (Math.random() * 5.0D) - 2;
			if (anInt99 < -16) {
				anInt99 = -16;
			}
			if (anInt99 > 16) {
				anInt99 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray1[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt96 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt95 - 1; local145++) {
						local169 = this.anIntArrayArrayArray2[local7][local145 + 1][local141] - this.anIntArrayArrayArray2[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray2[local7][local145][local141 + 1] - this.anIntArrayArrayArray2[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt96; local145++) {
					this.anIntArray12[local145] = 0;
					this.anIntArray13[local145] = 0;
					this.anIntArray14[local145] = 0;
					this.anIntArray15[local145] = 0;
					this.anIntArray16[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt95 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt96; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt95) {
							local210 = this.aByteArrayArrayArray5[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class11 local378 = Class11.aClass11Array1[local210 - 1];
								this.anIntArray12[local191] += local378.anInt171;
								this.anIntArray13[local191] += local378.anInt169;
								this.anIntArray14[local191] += local378.anInt170;
								this.anIntArray15[local191] += local378.anInt172;
								local419 = this.anIntArray16[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt95) {
							local214 = this.aByteArrayArrayArray5[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class11 local451 = Class11.aClass11Array1[local214 - 1];
								this.anIntArray12[local191] -= local451.anInt171;
								this.anIntArray13[local191] -= local451.anInt169;
								this.anIntArray14[local191] -= local451.anInt170;
								this.anIntArray15[local191] -= local451.anInt172;
								local419 = this.anIntArray16[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt95 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt96 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt96) {
								local204 += this.anIntArray12[local527];
								local210 += this.anIntArray13[local527];
								local214 += this.anIntArray14[local527];
								local220 += this.anIntArray15[local527];
								local236 += this.anIntArray16[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt96) {
								local204 -= this.anIntArray12[local572];
								local210 -= this.anIntArray13[local572];
								local214 -= this.anIntArray14[local572];
								local220 -= this.anIntArray15[local572];
								local236 -= this.anIntArray16[local572];
							}
							if (local284 >= 1 && local284 < this.anInt96 - 1 && (!aBoolean27 || (this.aByteArrayArrayArray3[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local169][local284] & 0x10) == 0 && this.method40(local284, local7, local169) == anInt98)) {
								if (local7 < anInt94) {
									anInt94 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray5[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray2[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray2[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray2[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray2[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray1[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method51(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt102 & 0xFF;
										local786 += anInt99;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method51(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray2[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class11.aClass11Array1[local682 - 1].aBoolean40) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray1[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class2_Sub1_Sub3_Sub1.anIntArray56[method36(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method227(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method36(local768, local737), method36(local768, local746), method36(local768, local757), method36(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray2[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class11 local941 = Class11.aClass11Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt167;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class2_Sub1_Sub3_Sub1.method138(local944);
											local952 = -1;
										} else if (local941.anInt166 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class2_Sub1_Sub3_Sub1.anIntArray56[this.method39(local941.anInt173, 96)];
										} else {
											local952 = this.method51(local941.anInt168, local941.anInt169, local941.anInt170);
											local950 = Class2_Sub1_Sub3_Sub1.anIntArray56[this.method39(local941.anInt173, 96)];
										}
										arg1.method227(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method36(local768, local737), method36(local768, local746), method36(local768, local757), method36(local768, local766), this.method39(local952, local737), this.method39(local952, local746), this.method39(local952, local757), this.method39(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt96 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt95 - 1; local204++) {
						arg1.method226(local7, local204, local191, this.method40(local191, local7, local204));
					}
				}
			}
			arg1.method253();
			for (local11 = 0; local11 < this.anInt95; local11++) {
				for (local27 = 0; local27 < this.anInt96; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg1.method224(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1127) int local1127 = 2;
			@Pc(1129) int local1129 = 4;
			for (@Pc(1131) int local1131 = 0; local1131 < 4; local1131++) {
				if (local1131 > 0) {
					local27 <<= 0x3;
					local1127 <<= 0x3;
					local1129 <<= 0x3;
				}
				for (@Pc(1149) int local1149 = 0; local1149 <= local1131; local1149++) {
					for (local133 = 0; local133 <= this.anInt96; local133++) {
						for (local139 = 0; local139 <= this.anInt95; local139++) {
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1149;
								local191 = local1149;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1149][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt96 && (this.anIntArrayArrayArray1[local1149][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label329: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local139][local204] & local27) == 0) {
											break label329;
										}
									}
									local169--;
								}
								label318: while (local191 < local1131) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local139][local204] & local27) == 0) {
											break label318;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local139][local141];
									Class20.method225(local141 * 128, local139 * 128, local139 * 128, local214, local220, local145 * 128 + 128, 1, local1131);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local1127) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1149;
								local191 = local1149;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1149][local141 - 1][local133] & local1127) != 0) {
									local141--;
								}
								while (local145 < this.anInt95 && (this.anIntArrayArrayArray1[local1149][local145 + 1][local133] & local1127) != 0) {
									local145++;
								}
								label382: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local204][local133] & local1127) == 0) {
											break label382;
										}
									}
									local169--;
								}
								label371: while (local191 < local1131) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local204][local133] & local1127) == 0) {
											break label371;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local141][local133];
									Class20.method225(local133 * 128, local141 * 128, local145 * 128 + 128, local214, local220, local133 * 128, 2, local1131);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local284][local133] &= ~local1127;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1149][local139][local133] & local1129) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray1[local1149][local139][local169 - 1] & local1129) != 0) {
									local169--;
								}
								while (local191 < this.anInt96 && (this.anIntArrayArrayArray1[local1149][local139][local191 + 1] & local1129) != 0) {
									local191++;
								}
								label435: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1149][local141 - 1][local204] & local1129) == 0) {
											break label435;
										}
									}
									local141--;
								}
								label424: while (local145 < this.anInt95) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1149][local145 + 1][local204] & local1129) == 0) {
											break label424;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray2[local1149][local141][local169];
									Class20.method225(local169 * 128, local141 * 128, local145 * 128 + 128, local204, local204, local191 * 128 + 128, 4, local1131);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray1[local1149][local210][local214] &= ~local1129;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1766) RuntimeException local1766) {
			signlink.reporterror("73675, " + arg0 + ", " + arg1 + ", " + true + ", " + local1766.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(I[BIII[Lclient!VDSFJUIR;I)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class42[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg5[local3].anIntArrayArray21[arg3 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class2_Sub1_Sub4 local65 = new Class2_Sub1_Sub4(859, arg1);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method37(local11, local75 + arg2, arg0, 0, arg4, local71 + arg3, local65);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("58030, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(ILclient!JPCEPCNA;IIIIII[Lclient!VDSFJUIR;I[B)V")
	public void method45(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class42[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(859, arg9);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method506();
				if (local15 == 0) {
					return;
				}
				local9 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method506();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method492();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					if (local48 == arg3 && local44 >= arg0 && local44 < arg0 + 8 && local38 >= arg5 && local38 < arg5 + 8) {
						@Pc(81) Class37 local81 = Class37.method451(local9);
						@Pc(98) int local98 = arg4 + Class28.method413(local38 & 0x7, local59, local81.anInt593, local81.anInt575, arg6, local44 & 0x7);
						@Pc(115) int local115 = arg2 + Class28.method414(local81.anInt593, local81.anInt575, 731, arg6, local44 & 0x7, local59, local38 & 0x7);
						if (local98 > 0 && local115 > 0 && local98 < 103 && local115 < 103) {
							@Pc(127) int local127 = arg8;
							if ((this.aByteArrayArrayArray3[1][local98][local115] & 0x2) == 2) {
								local127 = arg8 - 1;
							}
							@Pc(142) Class42 local142 = null;
							if (local127 >= 0) {
								local142 = arg7[local127];
							}
							this.method33(local9, arg1, local142, local59 + arg6 & 0x3, local115, local55, arg8, local98, 351);
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("41776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(IIIII)V")
	public void method47(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(8) int local8 = arg2; local8 <= arg2 + arg1; local8++) {
				for (@Pc(12) int local12 = arg0; local12 <= arg0 + arg3; local12++) {
					if (local12 >= 0 && local12 < this.anInt95 && local8 >= 0 && local8 < this.anInt96) {
						this.aByteArrayArrayArray1[0][local12][local8] = 127;
						if (local12 == arg0 && local12 > 0) {
							this.anIntArrayArrayArray2[0][local12][local8] = this.anIntArrayArrayArray2[0][local12 - 1][local8];
						}
						if (local12 == arg0 + arg3 && local12 < this.anInt95 - 1) {
							this.anIntArrayArrayArray2[0][local12][local8] = this.anIntArrayArrayArray2[0][local12 + 1][local8];
						}
						if (local8 == arg2 && local8 > 0) {
							this.anIntArrayArrayArray2[0][local12][local8] = this.anIntArrayArrayArray2[0][local12][local8 - 1];
						}
						if (local8 == arg2 + arg1 && local8 < this.anInt96 - 1) {
							this.anIntArrayArrayArray2[0][local12][local8] = this.anIntArrayArrayArray2[0][local12][local8 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("29273, " + arg0 + ", " + -38997 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(III)I")
	private int method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "(III[BIIZI[Lclient!VDSFJUIR;I)V")
	public void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class42[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg0 + local7 > 0 && arg0 + local7 < 103) {
						arg7[arg8].anIntArrayArray21[arg4 + local3][arg0 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(62) Class2_Sub1_Sub4 local62 = new Class2_Sub1_Sub4(859, arg3);
			for (@Pc(64) int local64 = 0; local64 < 4; local64++) {
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						if (local64 == arg2 && local68 >= arg6 && local68 < arg6 + 8 && local72 >= arg5 && local72 < arg5 + 8) {
							this.method37(arg8, arg0 + Class28.method412(arg1, local68 & 0x7, local72 & 0x7), 0, arg1, 0, arg4 + Class28.method411(arg1, local72 & 0x7, local68 & 0x7), local62);
						} else {
							this.method37(0, -1, 0, 0, 0, -1, local62);
						}
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("35539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "a", descriptor = "([B[Lclient!VDSFJUIR;IILclient!JPCEPCNA;I)V")
	public void method53(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class42[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(859, arg0);
			@Pc(11) boolean local11 = false;
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method506();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method506();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method492();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg2;
					@Pc(68) int local68 = local39 + arg5;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray3[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class42 local95 = null;
						if (local80 >= 0) {
							local95 = arg1[local80];
						}
						this.method33(local13, arg4, local95, local60, local68, local56, local49, local64, 351);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("5873, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXGEDAMF", name = "b", descriptor = "(IIII)V")
	public void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg2][arg3 + local3][arg0 + local7] = 0;
				}
			}
			@Pc(34) boolean local34 = true;
			if (arg3 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg2][arg3][arg0 + local7] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg0 + local7];
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray2[arg2][arg3 + local7][arg0] = this.anIntArrayArrayArray2[arg2][arg3 + local7][arg0 - 1];
				}
			}
			if (arg3 > 0 && this.anIntArrayArrayArray2[arg2][arg3 - 1][arg0] != 0) {
				this.anIntArrayArrayArray2[arg2][arg3][arg0] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg3][arg0 - 1] != 0) {
				this.anIntArrayArrayArray2[arg2][arg3][arg0] = this.anIntArrayArrayArray2[arg2][arg3][arg0 - 1];
			} else if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg3 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray2[arg2][arg3][arg0] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg0 - 1];
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("49562, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}
}
