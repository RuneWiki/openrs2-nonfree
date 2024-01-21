import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private static boolean aBoolean28;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt170;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "B")
	private static byte aByte3 = 6;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt173 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt174 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private int anInt169 = 42522;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "B")
	private byte aByte4 = 111;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

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
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIZI)Z")
	public static boolean method58(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(false, arg0);
			@Pc(19) int local19 = -1;
			label53: while (true) {
				@Pc(22) int local22 = local9.method494();
				if (local22 == 0) {
					return local3;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local9.method494();
						if (local37 == 0) {
							continue label53;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local9.method480() >> 2;
						@Pc(74) int local74 = local65 + arg1;
						@Pc(78) int local78 = local59 + arg2;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class9 local91 = Class9.method288(local19);
							if (local70 != 22 || !aBoolean30 || local91.aBoolean122 || local91.aBoolean128) {
								local3 &= local91.method292(579);
								local32 = true;
							}
						}
					}
					local37 = local9.method494();
					if (local37 == 0) {
						break;
					}
					local9.method480();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("66800, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ub;BLclient!lb;)V")
	public static void method59(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = arg2.method494();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(28) Class9 local28 = Class9.method288(local16);
				local28.method293(arg0);
				while (true) {
					@Pc(35) int local35 = arg2.method494();
					if (local35 == 0) {
						break;
					}
					arg2.method480();
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("95582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method65(arg0 + 45365, arg1 + 91923, 4) + (method65(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method65(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method67(local3, local13);
		@Pc(29) int local29 = method67(local3 + 1, local13);
		@Pc(35) int local35 = method67(local3, local13 + 1);
		@Pc(43) int local43 = method67(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method66(local23, local29, local9, arg2);
		@Pc(55) int local55 = method66(local35, local43, local9, arg2);
		return method66(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray179[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method68(arg0 - 1, arg1 - 1) + method68(arg0 + 1, arg1 - 1) + method68(arg0 - 1, arg1 + 1) + method68(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method68(arg0 - 1, arg1) + method68(arg0 + 1, arg1) + method68(arg0, arg1 - 1) + method68(arg0, arg1 + 1);
		@Pc(59) int local59 = method68(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class9 local2 = Class9.method288(arg1);
			@Pc(6) boolean local6 = false;
			if (arg2 == 11) {
				arg2 = 10;
			}
			if (arg2 >= 5 && arg2 <= 8) {
				arg2 = 4;
			}
			return local2.method291(643, arg2);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("72631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[[ILclient!jc;IILclient!r;IIII)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg7][arg9][arg4];
			@Pc(19) int local19 = arg1[arg7][arg9 + 1][arg4];
			@Pc(31) int local31 = arg1[arg7][arg9 + 1][arg4 + 1];
			@Pc(41) int local41 = arg1[arg7][arg9][arg4 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method288(arg0);
			@Pc(76) int local76 = arg9 + (arg4 << 7) + (arg0 << 14) + 1073741824;
			if (!local54.aBoolean122) {
				local76 += Integer.MIN_VALUE;
			}
			@Pc(90) byte local90 = (byte) ((arg8 << 6) + arg3);
			@Pc(110) Class1_Sub1_Sub1 local110;
			if (arg3 == 22) {
				if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
					local110 = local54.method294(22, arg8, local9, local19, local31, local41, -1);
				} else {
					local110 = new Class1_Sub1_Sub1_Sub2(arg0, 22, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
				}
				arg5.method536(arg6, local110, arg4, (byte) 1, arg9, local90, local76, local51);
				if (local54.aBoolean120 && local54.aBoolean122) {
					arg2.method423(arg4, arg9);
				}
			} else {
				@Pc(206) int local206;
				if (arg3 == 10 || arg3 == 11) {
					if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
						local110 = local54.method294(10, arg8, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub2(arg0, 10, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
					}
					if (local110 != null) {
						@Pc(193) int local193 = 0;
						if (arg3 == 11) {
							local193 += 256;
						}
						@Pc(209) int local209;
						if (arg8 == 1 || arg8 == 3) {
							local206 = local54.anInt517;
							local209 = local54.anInt516;
						} else {
							local206 = local54.anInt516;
							local209 = local54.anInt517;
						}
						arg5.method540(local76, arg4, arg9, local209, arg6, local90, local206, local193, local51, local110);
					}
					if (local54.aBoolean120) {
						arg2.method422(arg4, local54.anInt516, local54.aBoolean121, aByte3, local54.anInt517, arg8, arg9);
					}
				} else if (arg3 >= 12) {
					if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
						local110 = local54.method294(arg3, arg8, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub2(arg0, arg3, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
					}
					arg5.method540(local76, arg4, arg9, 1, arg6, local90, 1, 0, local51, local110);
					if (local54.aBoolean120) {
						arg2.method422(arg4, local54.anInt516, local54.aBoolean121, aByte3, local54.anInt517, arg8, arg9);
					}
				} else if (arg3 == 0) {
					if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
						local110 = local54.method294(0, arg8, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub2(arg0, 0, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
					}
					arg5.method538(arg9, arg4, local76, null, local51, local110, arg6, local90, anIntArray25[arg8], 0);
					if (local54.aBoolean120) {
						arg2.method421(arg9, local54.aBoolean121, arg8, arg3, arg4);
					}
				} else if (arg3 == 1) {
					if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
						local110 = local54.method294(1, arg8, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub2(arg0, 1, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
					}
					arg5.method538(arg9, arg4, local76, null, local51, local110, arg6, local90, anIntArray26[arg8], 0);
					if (local54.aBoolean120) {
						arg2.method421(arg9, local54.aBoolean121, arg8, arg3, arg4);
					}
				} else {
					@Pc(452) int local452;
					@Pc(481) Class1_Sub1_Sub1 local481;
					if (arg3 == 2) {
						local452 = arg8 + 1 & 0x3;
						@Pc(471) Class1_Sub1_Sub1 local471;
						if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
							local471 = local54.method294(2, arg8 + 4, local9, local19, local31, local41, -1);
							local481 = local54.method294(2, local452, local9, local19, local31, local41, -1);
						} else {
							local471 = new Class1_Sub1_Sub1_Sub2(arg0, 2, local41, local19, local54.anInt518, arg8 + 4, local9, local31, true, 188);
							local481 = new Class1_Sub1_Sub1_Sub2(arg0, 2, local41, local19, local54.anInt518, local452, local9, local31, true, 188);
						}
						arg5.method538(arg9, arg4, local76, local481, local51, local471, arg6, local90, anIntArray25[arg8], anIntArray25[local452]);
						if (local54.aBoolean120) {
							arg2.method421(arg9, local54.aBoolean121, arg8, arg3, arg4);
						}
					} else if (arg3 == 3) {
						if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
							local110 = local54.method294(3, arg8, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub2(arg0, 3, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
						}
						arg5.method538(arg9, arg4, local76, null, local51, local110, arg6, local90, anIntArray26[arg8], 0);
						if (local54.aBoolean120) {
							arg2.method421(arg9, local54.aBoolean121, arg8, arg3, arg4);
						}
					} else if (arg3 == 9) {
						if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
							local110 = local54.method294(arg3, arg8, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub2(arg0, arg3, local41, local19, local54.anInt518, arg8, local9, local31, true, 188);
						}
						arg5.method540(local76, arg4, arg9, 1, arg6, local90, 1, 0, local51, local110);
						if (local54.aBoolean120) {
							arg2.method422(arg4, local54.anInt516, local54.aBoolean121, aByte3, local54.anInt517, arg8, arg9);
						}
					} else {
						if (local54.aBoolean123) {
							if (arg8 == 1) {
								local452 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local452;
							} else if (arg8 == 2) {
								local452 = local41;
								local41 = local19;
								local19 = local452;
								local452 = local31;
								local31 = local9;
								local9 = local452;
							} else if (arg8 == 3) {
								local452 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local452;
							}
						}
						if (arg3 == 4) {
							if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
								local110 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub2(arg0, 4, local41, local19, local54.anInt518, 0, local9, local31, true, 188);
							}
							arg5.method539(local51, arg8 * 512, 0, anIntArray25[arg8], arg9, local110, local90, local76, 0, arg6, arg4);
						} else if (arg3 == 5) {
							local452 = 16;
							local206 = arg5.method556(arg6, arg9, arg4);
							if (local206 > 0) {
								local452 = Class9.method288(local206 >> 14 & 0x7FFF).anInt519;
							}
							if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
								local481 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local481 = new Class1_Sub1_Sub1_Sub2(arg0, 4, local41, local19, local54.anInt518, 0, local9, local31, true, 188);
							}
							arg5.method539(local51, arg8 * 512, anIntArray28[arg8] * local452, anIntArray25[arg8], arg9, local481, local90, local76, anIntArray27[arg8] * local452, arg6, arg4);
						} else if (arg3 == 6) {
							if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
								local110 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub2(arg0, 4, local41, local19, local54.anInt518, 0, local9, local31, true, 188);
							}
							arg5.method539(local51, arg8, 0, 256, arg9, local110, local90, local76, 0, arg6, arg4);
						} else if (arg3 == 7) {
							if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
								local110 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub2(arg0, 4, local41, local19, local54.anInt518, 0, local9, local31, true, 188);
							}
							arg5.method539(local51, arg8, 0, 512, arg9, local110, local90, local76, 0, arg6, arg4);
						} else if (arg3 == 8) {
							if (local54.anInt518 == -1 && local54.anIntArray160 == null) {
								local110 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub2(arg0, 4, local41, local19, local54.anInt518, 0, local9, local31, true, 188);
							}
							arg5.method539(local51, arg8, 0, 768, arg9, local110, local90, local76, 0, arg6, arg4);
						}
					}
				}
			}
		} catch (@Pc(1020) RuntimeException local1020) {
			signlink.reporterror("68954, " + arg0 + ", " + -44218 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1020.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(III[[[I[[[B)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				throw new NullPointerException();
			}
			this.anInt171 = arg2;
			this.anInt172 = arg1;
			this.anIntArrayArrayArray3 = arg3;
			this.aByteArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt171][this.anInt172];
			this.anIntArrayArrayArray4 = new int[4][this.anInt171 + 1][this.anInt172 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt171 + 1][this.anInt172 + 1];
			this.anIntArrayArray2 = new int[this.anInt171 + 1][this.anInt172 + 1];
			this.anIntArray20 = new int[this.anInt172];
			this.anIntArray21 = new int[this.anInt172];
			this.anIntArray22 = new int[this.anInt172];
			this.anIntArray23 = new int[this.anInt172];
			this.anIntArray24 = new int[this.anInt172];
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("39591, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt171 && local3 >= 0 && local3 < this.anInt172) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt171 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt172 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("24251, " + 0 + ", " + arg0 + ", " + 64 + ", " + 64 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIII)V")
	public void method57(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(false, arg0);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg2;
						@Pc(27) int local27 = local17 + arg1;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method480();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -method64(local23 + arg3 + 932731, local27 + 556238 + arg4) * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method480();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method481();
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
								local49 = local7.method480();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method480();
									break;
								}
								if (local49 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("14277, " + arg0 + ", " + arg1 + ", " + 416 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!r;[BI[Lclient!jc;I)V")
	public void method60(@OriginalArg(1) Class37 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(false, arg1);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local11.method494();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local11.method494();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local11.method480();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg4;
					@Pc(68) int local68 = local39 + arg2;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray1[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class19 local95 = null;
						if (local80 >= 0) {
							local95 = arg3[local80];
						}
						this.method61(local95, local68, local60, local49, local13, arg0, local56, local64, this.anInt169);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("53266, " + 92 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jc;IIIILclient!r;III)V")
	private void method61(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class37 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean30) {
				if ((this.aByteArrayArrayArray1[arg3][arg7][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg3, arg7, arg1) != anInt170) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg3][arg7][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg3][arg7 + 1][arg1];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg3][arg7 + 1][arg1 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg3][arg7][arg1 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			if (arg8 != 42522) {
				aBoolean29 = true;
			}
			@Pc(90) Class9 local90 = Class9.method288(arg4);
			@Pc(102) int local102 = arg7 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!local90.aBoolean122) {
				local102 += Integer.MIN_VALUE;
			}
			@Pc(116) byte local116 = (byte) ((arg2 << 6) + arg6);
			@Pc(145) Class1_Sub1_Sub1 local145;
			if (arg6 != 22) {
				@Pc(243) int local243;
				if (arg6 == 10 || arg6 == 11) {
					if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(10, arg2, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(arg4, 10, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
					}
					if (local145 != null) {
						@Pc(230) int local230 = 0;
						if (arg6 == 11) {
							local230 += 256;
						}
						@Pc(246) int local246;
						if (arg2 == 1 || arg2 == 3) {
							local243 = local90.anInt517;
							local246 = local90.anInt516;
						} else {
							local243 = local90.anInt516;
							local246 = local90.anInt517;
						}
						if (arg5.method540(local102, arg1, arg7, local246, arg3, local116, local243, local230, local78, local145) && local90.aBoolean127) {
							@Pc(277) Class1_Sub1_Sub1_Sub5 local277;
							if (local145 instanceof Class1_Sub1_Sub1_Sub5) {
								local277 = (Class1_Sub1_Sub1_Sub5) local145;
							} else {
								local277 = local90.method294(10, arg2, local33, local44, local57, local68, -1);
							}
							if (local277 != null) {
								for (@Pc(293) int local293 = 0; local293 <= local243; local293++) {
									for (@Pc(297) int local297 = 0; local297 <= local246; local297++) {
										@Pc(304) int local304 = local277.anInt501 / 4;
										if (local304 > 30) {
											local304 = 30;
										}
										if (local304 > this.aByteArrayArrayArray6[arg3][arg7 + local293][arg1 + local297]) {
											this.aByteArrayArrayArray6[arg3][arg7 + local293][arg1 + local297] = (byte) local304;
										}
									}
								}
							}
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method422(arg1, local90.anInt516, local90.aBoolean121, aByte3, local90.anInt517, arg2, arg7);
					}
				} else if (arg6 >= 12) {
					if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(arg6, arg2, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(arg4, arg6, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
					}
					arg5.method540(local102, arg1, arg7, 1, arg3, local116, 1, 0, local78, local145);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x924;
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method422(arg1, local90.anInt516, local90.aBoolean121, aByte3, local90.anInt517, arg2, arg7);
					}
				} else if (arg6 == 0) {
					if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(0, arg2, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(arg4, 0, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
					}
					arg5.method538(arg7, arg1, local102, null, local78, local145, arg3, local116, anIntArray25[arg2], 0);
					if (arg2 == 0) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg3][arg7][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg7][arg1 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x249;
						}
					} else if (arg2 == 1) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg3][arg7][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray4[arg3][arg7][arg1 + 1] |= 0x492;
						}
					} else if (arg2 == 2) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray4[arg3][arg7 + 1][arg1] |= 0x249;
						}
					} else if (arg2 == 3) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg3][arg7][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x492;
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method421(arg7, local90.aBoolean121, arg2, arg6, arg1);
					}
					if (local90.anInt519 != 16) {
						arg5.method546(arg3, local90.anInt519, arg7, arg1);
					}
				} else if (arg6 == 1) {
					if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
						local145 = local90.method294(1, arg2, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(arg4, 1, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
					}
					arg5.method538(arg7, arg1, local102, null, local78, local145, arg3, local116, anIntArray26[arg2], 0);
					if (local90.aBoolean127) {
						if (arg2 == 0) {
							this.aByteArrayArrayArray6[arg3][arg7][arg1 + 1] = 50;
						} else if (arg2 == 1) {
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1 + 1] = 50;
						} else if (arg2 == 2) {
							this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1] = 50;
						} else if (arg2 == 3) {
							this.aByteArrayArrayArray6[arg3][arg7][arg1] = 50;
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method421(arg7, local90.aBoolean121, arg2, arg6, arg1);
					}
				} else {
					@Pc(854) int local854;
					@Pc(883) Class1_Sub1_Sub1 local883;
					if (arg6 == 2) {
						local854 = arg2 + 1 & 0x3;
						@Pc(873) Class1_Sub1_Sub1 local873;
						if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
							local873 = local90.method294(2, arg2 + 4, local33, local44, local57, local68, -1);
							local883 = local90.method294(2, local854, local33, local44, local57, local68, -1);
						} else {
							local873 = new Class1_Sub1_Sub1_Sub2(arg4, 2, local68, local44, local90.anInt518, arg2 + 4, local33, local57, true, 188);
							local883 = new Class1_Sub1_Sub1_Sub2(arg4, 2, local68, local44, local90.anInt518, local854, local33, local57, true, 188);
						}
						arg5.method538(arg7, arg1, local102, local883, local78, local873, arg3, local116, anIntArray25[arg2], anIntArray25[local854]);
						if (local90.aBoolean125) {
							if (arg2 == 0) {
								this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg7][arg1 + 1] |= 0x492;
							} else if (arg2 == 1) {
								this.anIntArrayArrayArray4[arg3][arg7][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg7 + 1][arg1] |= 0x249;
							} else if (arg2 == 2) {
								this.anIntArrayArrayArray4[arg3][arg7 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x492;
							} else if (arg2 == 3) {
								this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg7][arg1] |= 0x249;
							}
						}
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method421(arg7, local90.aBoolean121, arg2, arg6, arg1);
						}
						if (local90.anInt519 != 16) {
							arg5.method546(arg3, local90.anInt519, arg7, arg1);
						}
					} else if (arg6 == 3) {
						if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
							local145 = local90.method294(3, arg2, local33, local44, local57, local68, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(arg4, 3, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
						}
						arg5.method538(arg7, arg1, local102, null, local78, local145, arg3, local116, anIntArray26[arg2], 0);
						if (local90.aBoolean127) {
							if (arg2 == 0) {
								this.aByteArrayArrayArray6[arg3][arg7][arg1 + 1] = 50;
							} else if (arg2 == 1) {
								this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1 + 1] = 50;
							} else if (arg2 == 2) {
								this.aByteArrayArrayArray6[arg3][arg7 + 1][arg1] = 50;
							} else if (arg2 == 3) {
								this.aByteArrayArrayArray6[arg3][arg7][arg1] = 50;
							}
						}
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method421(arg7, local90.aBoolean121, arg2, arg6, arg1);
						}
					} else if (arg6 == 9) {
						if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
							local145 = local90.method294(arg6, arg2, local33, local44, local57, local68, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(arg4, arg6, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
						}
						arg5.method540(local102, arg1, arg7, 1, arg3, local116, 1, 0, local78, local145);
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method422(arg1, local90.anInt516, local90.aBoolean121, aByte3, local90.anInt517, arg2, arg7);
						}
					} else {
						if (local90.aBoolean123) {
							if (arg2 == 1) {
								local854 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local854;
							} else if (arg2 == 2) {
								local854 = local68;
								local68 = local44;
								local44 = local854;
								local854 = local57;
								local57 = local33;
								local33 = local854;
							} else if (arg2 == 3) {
								local854 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local854;
							}
						}
						if (arg6 == 4) {
							if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local68, local44, local90.anInt518, 0, local33, local57, true, 188);
							}
							arg5.method539(local78, arg2 * 512, 0, anIntArray25[arg2], arg7, local145, local116, local102, 0, arg3, arg1);
						} else if (arg6 == 5) {
							local854 = 16;
							local243 = arg5.method556(arg3, arg7, arg1);
							if (local243 > 0) {
								local854 = Class9.method288(local243 >> 14 & 0x7FFF).anInt519;
							}
							if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
								local883 = local90.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local883 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local68, local44, local90.anInt518, 0, local33, local57, true, 188);
							}
							arg5.method539(local78, arg2 * 512, anIntArray28[arg2] * local854, anIntArray25[arg2], arg7, local883, local116, local102, anIntArray27[arg2] * local854, arg3, arg1);
						} else if (arg6 == 6) {
							if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local68, local44, local90.anInt518, 0, local33, local57, true, 188);
							}
							arg5.method539(local78, arg2, 0, 256, arg7, local145, local116, local102, 0, arg3, arg1);
						} else if (arg6 == 7) {
							if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local68, local44, local90.anInt518, 0, local33, local57, true, 188);
							}
							arg5.method539(local78, arg2, 0, 512, arg7, local145, local116, local102, 0, arg3, arg1);
						} else if (arg6 == 8) {
							if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
								local145 = local90.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(arg4, 4, local68, local44, local90.anInt518, 0, local33, local57, true, 188);
							}
							arg5.method539(local78, arg2, 0, 768, arg7, local145, local116, local102, 0, arg3, arg1);
						}
					}
				}
			} else if (!aBoolean30 || local90.aBoolean122 || local90.aBoolean128) {
				if (local90.anInt518 == -1 && local90.anIntArray160 == null) {
					local145 = local90.method294(22, arg2, local33, local44, local57, local68, -1);
				} else {
					local145 = new Class1_Sub1_Sub1_Sub2(arg4, 22, local68, local44, local90.anInt518, arg2, local33, local57, true, 188);
				}
				arg5.method536(arg3, local145, arg1, (byte) 1, arg7, local116, local102, local78);
				if (local90.aBoolean120 && local90.aBoolean122 && arg0 != null) {
					arg0.method423(arg1, arg7);
				}
			}
		} catch (@Pc(1628) RuntimeException local1628) {
			signlink.reporterror("30854, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1628.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;BLclient!r;)V")
	public void method62(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class37 arg2) {
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
								arg0[local27].method423(local11, local7);
							}
						}
					}
				}
			}
			anInt173 += (int) (Math.random() * 5.0D) - 2;
			if (anInt173 < -8) {
				anInt173 = -8;
			}
			if (anInt173 > 8) {
				anInt173 = 8;
			}
			anInt174 += (int) (Math.random() * 5.0D) - 2;
			if (anInt174 < -16) {
				anInt174 = -16;
			}
			if (anInt174 > 16) {
				anInt174 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray6[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt172 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt171 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray2[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt172; local145++) {
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt171 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt172; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt171) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray20[local191] += local378.anInt732;
								this.anIntArray21[local191] += local378.anInt730;
								this.anIntArray22[local191] += local378.anInt731;
								this.anIntArray23[local191] += local378.anInt733;
								local419 = this.anIntArray24[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt171) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray20[local191] -= local451.anInt732;
								this.anIntArray21[local191] -= local451.anInt730;
								this.anIntArray22[local191] -= local451.anInt731;
								this.anIntArray23[local191] -= local451.anInt733;
								local419 = this.anIntArray24[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt171 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt172 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt172) {
								local204 += this.anIntArray20[local527];
								local210 += this.anIntArray21[local527];
								local214 += this.anIntArray22[local527];
								local220 += this.anIntArray23[local527];
								local236 += this.anIntArray24[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt172) {
								local204 -= this.anIntArray20[local572];
								local210 -= this.anIntArray21[local572];
								local214 -= this.anIntArray22[local572];
								local220 -= this.anIntArray23[local572];
								local236 -= this.anIntArray24[local572];
							}
							if (local284 >= 1 && local284 < this.anInt172 - 1 && (!aBoolean30 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method63(local7, local169, local284) == anInt170)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray2[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray2[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray2[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray2[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method71(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt173 & 0xFF;
										local770 += anInt174;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method71(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean178) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local754, 96)];
									}
									if (local666 == 0) {
										arg2.method535(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt728;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method348(local928);
											local936 = -1;
										} else if (local925.anInt727 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method71(local925.anInt729, local925.anInt730, local925.anInt731);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local925.anInt734, 96)];
										}
										arg2.method535(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), this.method70(local936, local721), this.method70(local936, local730), this.method70(local936, local741), this.method70(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt172 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt171 - 1; local204++) {
						arg2.method534(local7, local204, local191, this.method63(local7, local204, local191));
					}
				}
			}
			arg2.method561();
			for (local11 = 0; local11 < this.anInt171; local11++) {
				for (local27 = 0; local27 < this.anInt172; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg2.method532(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1107) int local1107 = 2;
			@Pc(1109) int local1109 = 4;
			for (@Pc(1111) int local1111 = 0; local1111 < 4; local1111++) {
				if (local1111 > 0) {
					local27 <<= 0x3;
					local1107 <<= 0x3;
					local1109 <<= 0x3;
				}
				for (@Pc(1129) int local1129 = 0; local1129 <= local1111; local1129++) {
					for (local133 = 0; local133 <= this.anInt172; local133++) {
						for (local139 = 0; local139 <= this.anInt171; local139++) {
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1129][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt172 && (this.anIntArrayArrayArray4[local1129][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class37.method533(local220, local214, local139 * 128, local139 * 128, 1, local145 * 128 + 128, local1111, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local1107) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1129][local141 - 1][local133] & local1107) != 0) {
									local141--;
								}
								while (local145 < this.anInt171 && (this.anIntArrayArrayArray4[local1129][local145 + 1][local133] & local1107) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1107) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1107) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class37.method533(local220, local214, local141 * 128, local145 * 128 + 128, 2, local133 * 128, local1111, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1107;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1129][local139][local133] & local1109) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1129][local139][local169 - 1] & local1109) != 0) {
									local169--;
								}
								while (local191 < this.anInt172 && (this.anIntArrayArrayArray4[local1129][local139][local191 + 1] & local1109) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1129][local141 - 1][local204] & local1109) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt171) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1129][local145 + 1][local204] & local1109) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1129][local141][local169];
									Class37.method533(local204, local204, local141 * 128, local145 * 128 + 128, 4, local191 * 128 + 128, local1111, local169 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1129][local210][local214] &= ~local1109;
										}
									}
								}
							}
						}
					}
				}
			}
			if (arg1 == 64) {
				;
			}
		} catch (@Pc(1747) RuntimeException local1747) {
			signlink.reporterror("17435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1747.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIII)I")
	private int method63(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte4 != 111) {
				return 2;
			} else if ((this.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("38157, " + 111 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
}
