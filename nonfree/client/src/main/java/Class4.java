import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt201;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt203;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	private static boolean aBoolean33;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "B")
	private static byte aByte1 = 5;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt202 = -550;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray29 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray30 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt206 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt207 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIZ)Z")
	public static boolean method59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) boolean local9 = true;
			@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg0, 337);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local15.method512();
				if (local20 == 0) {
					return local9;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local15.method512();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local15.method498() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg1;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method258(local17);
							if (local68 != 22 || !aBoolean32 || local89.aBoolean113 || local89.aBoolean119) {
								local9 &= local89.method262();
								local30 = true;
							}
						}
					}
					local35 = local15.method512();
					if (local35 == 0) {
						break;
					}
					local15.method498();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("56701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mb;Lclient!vb;Z)V")
	public static void method60(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class45_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method512();
				if (local9 == 0) {
					return;
				}
				local3 += local9;
				@Pc(18) Class9 local18 = Class9.method258(local3);
				local18.method263(arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method512();
					if (local25 == 0) {
						break;
					}
					arg0.method498();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("99596, " + arg0 + ", " + arg1 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method66(arg0 + 45365, arg1 + 91923, 4) + (method66(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method66(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method68(local3, local13);
		@Pc(29) int local29 = method68(local3 + 1, local13);
		@Pc(35) int local35 = method68(local3, local13 + 1);
		@Pc(43) int local43 = method68(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method67(local23, local29, local9, arg2);
		@Pc(55) int local55 = method67(local35, local43, local9, arg2);
		return method67(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray184[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method69(arg0 - 1, arg1 - 1) + method69(arg0 + 1, arg1 - 1) + method69(arg0 - 1, arg1 + 1) + method69(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method69(arg0 - 1, arg1) + method69(arg0 + 1, arg1) + method69(arg0, arg1 - 1) + method69(arg0, arg1 + 1);
		@Pc(59) int local59 = method69(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
	public static boolean method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method258(arg1);
			if (aByte1 != 5) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method261(arg0);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("21354, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([[[IILclient!s;IILclient!jc;IIIII)V")
	public static void method74(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg0[arg3][arg4][arg9];
			@Pc(19) int local19 = arg0[arg3][arg4 + 1][arg9];
			@Pc(31) int local31 = arg0[arg3][arg4 + 1][arg9 + 1];
			@Pc(41) int local41 = arg0[arg3][arg4][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method258(arg8);
			@Pc(66) int local66 = arg4 + (arg9 << 7) + (arg8 << 14) + 1073741824;
			if (!local54.aBoolean113) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(84) byte local84 = (byte) ((arg6 << 6) + arg1);
			@Pc(101) Class1_Sub1_Sub1 local101;
			if (arg1 == 22) {
				if (local54.anInt517 == -1) {
					local101 = local54.method264(22, arg6, local9, local19, local31, local41, -1);
				} else {
					local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, 22);
				}
				arg2.method550(arg9, (byte) 8, local66, local101, local51, arg7, arg4, local84);
				if (local54.aBoolean111 && local54.aBoolean113) {
					arg5.method417(arg9, arg4);
				}
			} else {
				@Pc(194) int local194;
				if (arg1 == 10 || arg1 == 11) {
					if (local54.anInt517 == -1) {
						local101 = local54.method264(10, arg6, local9, local19, local31, local41, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, 10);
					}
					if (local101 != null) {
						@Pc(181) int local181 = 0;
						if (arg1 == 11) {
							local181 += 256;
						}
						@Pc(197) int local197;
						if (arg6 == 1 || arg6 == 3) {
							local194 = local54.anInt516;
							local197 = local54.anInt515;
						} else {
							local194 = local54.anInt515;
							local197 = local54.anInt516;
						}
						arg2.method554(local197, arg4, local181, arg7, local194, local101, arg9, local84, local66, local51);
					}
					if (local54.aBoolean111) {
						arg5.method416(arg6, arg4, arg9, local54.anInt516, local54.aBoolean112, local54.anInt515, anInt201);
					}
				} else if (arg1 >= 12) {
					if (local54.anInt517 == -1) {
						local101 = local54.method264(arg1, arg6, local9, local19, local31, local41, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, arg1);
					}
					arg2.method554(1, arg4, 0, arg7, 1, local101, arg9, local84, local66, local51);
					if (local54.aBoolean111) {
						arg5.method416(arg6, arg4, arg9, local54.anInt516, local54.aBoolean112, local54.anInt515, anInt201);
					}
				} else if (arg1 == 0) {
					if (local54.anInt517 == -1) {
						local101 = local54.method264(0, arg6, local9, local19, local31, local41, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, 0);
					}
					arg2.method552(0, arg9, anIntArray27[arg6], arg4, local66, arg7, local84, null, local51, local101);
					if (local54.aBoolean111) {
						arg5.method415(arg9, arg1, arg4, local54.aBoolean112, arg6);
					}
				} else if (arg1 == 1) {
					if (local54.anInt517 == -1) {
						local101 = local54.method264(1, arg6, local9, local19, local31, local41, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, 1);
					}
					arg2.method552(0, arg9, anIntArray28[arg6], arg4, local66, arg7, local84, null, local51, local101);
					if (local54.aBoolean111) {
						arg5.method415(arg9, arg1, arg4, local54.aBoolean112, arg6);
					}
				} else {
					@Pc(457) Class1_Sub1_Sub1 local457;
					@Pc(431) int local431;
					if (arg1 == 2) {
						local431 = arg6 + 1 & 0x3;
						@Pc(447) Class1_Sub1_Sub1 local447;
						if (local54.anInt517 == -1) {
							local447 = local54.method264(2, arg6 + 4, local9, local19, local31, local41, -1);
							local457 = local54.method264(2, local431, local9, local19, local31, local41, -1);
						} else {
							local447 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6 + 4, arg8, 2);
							local457 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, local431, arg8, 2);
						}
						arg2.method552(anIntArray27[local431], arg9, anIntArray27[arg6], arg4, local66, arg7, local84, local457, local51, local447);
						if (local54.aBoolean111) {
							arg5.method415(arg9, arg1, arg4, local54.aBoolean112, arg6);
						}
					} else if (arg1 == 3) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(3, arg6, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, 3);
						}
						arg2.method552(0, arg9, anIntArray28[arg6], arg4, local66, arg7, local84, null, local51, local101);
						if (local54.aBoolean111) {
							arg5.method415(arg9, arg1, arg4, local54.aBoolean112, arg6);
						}
					} else if (arg1 == 9) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(arg1, arg6, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, arg6, arg8, arg1);
						}
						arg2.method554(1, arg4, 0, arg7, 1, local101, arg9, local84, local66, local51);
						if (local54.aBoolean111) {
							arg5.method416(arg6, arg4, arg9, local54.anInt516, local54.aBoolean112, local54.anInt515, anInt201);
						}
					} else if (arg1 == 4) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, 0, arg8, 4);
						}
						arg2.method553(arg4, anIntArray27[arg6], local66, local51, arg9, local84, 0, arg7, 0, arg6 * 512, local101);
					} else if (arg1 == 5) {
						local431 = 16;
						local194 = arg2.method570(arg7, arg4, arg9);
						if (local194 > 0) {
							local431 = Class9.method258(local194 >> 14 & 0x7FFF).anInt518;
						}
						if (local54.anInt517 == -1) {
							local457 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local457 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, 0, arg8, 4);
						}
						arg2.method553(arg4, anIntArray27[arg6], local66, local51, arg9, local84, anIntArray30[arg6] * local431, arg7, anIntArray29[arg6] * local431, arg6 * 512, local457);
					} else if (arg1 == 6) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, 0, arg8, 4);
						}
						arg2.method553(arg4, 256, local66, local51, arg9, local84, 0, arg7, 0, arg6, local101);
					} else if (arg1 == 7) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, 0, arg8, 4);
						}
						arg2.method553(arg4, 512, local66, local51, arg9, local84, 0, arg7, 0, arg6, local101);
					} else if (arg1 == 8) {
						if (local54.anInt517 == -1) {
							local101 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(local9, true, local41, local54.anInt517, local19, anInt202, local31, 0, arg8, 4);
						}
						arg2.method553(arg4, 768, local66, local51, arg9, local84, 0, arg7, 0, arg6, local101);
					}
				}
			}
		} catch (@Pc(927) RuntimeException local927) {
			signlink.reporterror("64986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 34324 + ", " + arg8 + ", " + arg9 + ", " + local927.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II[[[BI[[[I)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			this.anInt204 = arg1;
			this.anInt205 = arg3;
			this.anIntArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt204][this.anInt205];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt204][this.anInt205];
			this.anIntArrayArrayArray2 = new int[4][this.anInt204 + 1][this.anInt205 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt204 + 1][this.anInt205 + 1];
			this.anIntArrayArray1 = new int[this.anInt204 + 1][this.anInt205 + 1];
			this.anIntArray22 = new int[this.anInt205];
			this.anIntArray23 = new int[this.anInt205];
			this.anIntArray24 = new int[this.anInt205];
			this.anIntArray25 = new int[this.anInt205];
			this.anIntArray26 = new int[this.anInt205];
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("45944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIII)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(13) int local13 = arg1; local13 <= arg1 + 64; local13++) {
				for (@Pc(17) int local17 = arg0; local17 <= arg0 + 64; local17++) {
					if (local17 >= 0 && local17 < this.anInt204 && local13 >= 0 && local13 < this.anInt205) {
						this.aByteArrayArrayArray6[0][local17][local13] = 127;
						if (local17 == arg0 && local17 > 0) {
							this.anIntArrayArrayArray1[0][local17][local13] = this.anIntArrayArrayArray1[0][local17 - 1][local13];
						}
						if (local17 == arg0 + 64 && local17 < this.anInt204 - 1) {
							this.anIntArrayArrayArray1[0][local17][local13] = this.anIntArrayArrayArray1[0][local17 + 1][local13];
						}
						if (local13 == arg1 && local13 > 0) {
							this.anIntArrayArrayArray1[0][local17][local13] = this.anIntArrayArrayArray1[0][local17][local13 - 1];
						}
						if (local13 == arg1 + 64 && local13 < this.anInt205 - 1) {
							this.anIntArrayArrayArray1[0][local17][local13] = this.anIntArrayArrayArray1[0][local17][local13 + 1];
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("55299, " + arg0 + ", " + true + ", " + 64 + ", " + arg1 + ", " + 64 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIIZ)V")
	public void method58(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(17) Class1_Sub1_Sub3 local17 = new Class1_Sub1_Sub3(arg0, 337);
			for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
				for (@Pc(23) int local23 = 0; local23 < 64; local23++) {
					for (@Pc(27) int local27 = 0; local27 < 64; local27++) {
						@Pc(33) int local33 = local23 + arg3;
						@Pc(37) int local37 = local27 + arg1;
						@Pc(59) int local59;
						if (local33 >= 0 && local33 < 104 && local37 >= 0 && local37 < 104) {
							this.aByteArrayArrayArray1[local19][local33][local37] = 0;
							while (true) {
								local59 = local17.method498();
								if (local59 == 0) {
									if (local19 == 0) {
										this.anIntArrayArrayArray1[0][local33][local37] = -method65(local33 + arg4 + 932731, local37 + 556238 + arg2) * 8;
									} else {
										this.anIntArrayArrayArray1[local19][local33][local37] = this.anIntArrayArrayArray1[local19 - 1][local33][local37] - 240;
									}
									break;
								}
								if (local59 == 1) {
									@Pc(115) int local115 = local17.method498();
									if (local115 == 1) {
										local115 = 0;
									}
									if (local19 == 0) {
										this.anIntArrayArrayArray1[0][local33][local37] = -local115 * 8;
									} else {
										this.anIntArrayArrayArray1[local19][local33][local37] = this.anIntArrayArrayArray1[local19 - 1][local33][local37] - local115 * 8;
									}
									break;
								}
								if (local59 <= 49) {
									this.aByteArrayArrayArray3[local19][local33][local37] = local17.method499();
									this.aByteArrayArrayArray4[local19][local33][local37] = (byte) ((local59 - 2) / 4);
									this.aByteArrayArrayArray5[local19][local33][local37] = (byte) (local59 - 2 & 0x3);
								} else if (local59 <= 81) {
									this.aByteArrayArrayArray1[local19][local33][local37] = (byte) (local59 - 49);
								} else {
									this.aByteArrayArrayArray2[local19][local33][local37] = (byte) (local59 - 81);
								}
							}
						} else {
							while (true) {
								local59 = local17.method498();
								if (local59 == 0) {
									break;
								}
								if (local59 == 1) {
									local17.method498();
									break;
								}
								if (local59 <= 49) {
									local17.method498();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("80681, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;III[Lclient!jc;[B)V")
	public void method61(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class19[] arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, 337);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method512();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method512();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method498();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg2;
					@Pc(74) int local74 = local45 + arg1;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg3[local86];
						}
						this.method62(local66, local19, local101, local74, local62, arg0, local70, local55);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("36363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!jc;IILclient!s;III)V")
	private void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean32) {
				if ((this.aByteArrayArrayArray1[arg7][arg6][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method64(arg3, arg6, arg7) != anInt203) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg7][arg6][arg3];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg3];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg3 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg7][arg6][arg3 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method258(arg1);
			@Pc(96) int local96 = arg6 + (arg3 << 7) + (arg1 << 14) + 1073741824;
			if (!local81.aBoolean113) {
				local96 += Integer.MIN_VALUE;
			}
			@Pc(110) byte local110 = (byte) ((arg0 << 6) + arg4);
			@Pc(136) Class1_Sub1_Sub1 local136;
			if (arg4 != 22) {
				@Pc(231) int local231;
				if (arg4 == 10 || arg4 == 11) {
					if (local81.anInt517 == -1) {
						local136 = local81.method264(10, arg0, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, 10);
					}
					if (local136 != null) {
						@Pc(218) int local218 = 0;
						if (arg4 == 11) {
							local218 += 256;
						}
						@Pc(234) int local234;
						if (arg0 == 1 || arg0 == 3) {
							local231 = local81.anInt516;
							local234 = local81.anInt515;
						} else {
							local231 = local81.anInt515;
							local234 = local81.anInt516;
						}
						if (arg5.method554(local234, arg6, local218, arg7, local231, local136, arg3, local110, local96, local78) && local81.aBoolean118) {
							@Pc(265) Class1_Sub1_Sub1_Sub5 local265;
							if (local136 instanceof Class1_Sub1_Sub1_Sub5) {
								local265 = (Class1_Sub1_Sub1_Sub5) local136;
							} else {
								local265 = local81.method264(10, arg0, local33, local44, local57, local68, -1);
							}
							if (local265 != null) {
								for (@Pc(281) int local281 = 0; local281 <= local231; local281++) {
									for (@Pc(285) int local285 = 0; local285 <= local234; local285++) {
										@Pc(292) int local292 = local265.anInt546 / 4;
										if (local292 > 30) {
											local292 = 30;
										}
										if (local292 > this.aByteArrayArrayArray6[arg7][arg6 + local281][arg3 + local285]) {
											this.aByteArrayArrayArray6[arg7][arg6 + local281][arg3 + local285] = (byte) local292;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean111 && arg2 != null) {
						arg2.method416(arg0, arg6, arg3, local81.anInt516, local81.aBoolean112, local81.anInt515, anInt201);
					}
				} else if (arg4 >= 12) {
					if (local81.anInt517 == -1) {
						local136 = local81.method264(arg4, arg0, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, arg4);
					}
					arg5.method554(1, arg6, 0, arg7, 1, local136, arg3, local110, local96, local78);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x924;
					}
					if (local81.aBoolean111 && arg2 != null) {
						arg2.method416(arg0, arg6, arg3, local81.anInt516, local81.aBoolean112, local81.anInt515, anInt201);
					}
				} else if (arg4 == 0) {
					if (local81.anInt517 == -1) {
						local136 = local81.method264(0, arg0, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, 0);
					}
					arg5.method552(0, arg3, anIntArray27[arg0], arg6, local96, arg7, local110, null, local78, local136);
					if (arg0 == 0) {
						if (local81.aBoolean118) {
							this.aByteArrayArrayArray6[arg7][arg6][arg3] = 50;
							this.aByteArrayArrayArray6[arg7][arg6][arg3 + 1] = 50;
						}
						if (local81.aBoolean116) {
							this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local81.aBoolean118) {
							this.aByteArrayArrayArray6[arg7][arg6][arg3 + 1] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3 + 1] = 50;
						}
						if (local81.aBoolean116) {
							this.anIntArrayArrayArray2[arg7][arg6][arg3 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local81.aBoolean118) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3 + 1] = 50;
						}
						if (local81.aBoolean116) {
							this.anIntArrayArrayArray2[arg7][arg6 + 1][arg3] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local81.aBoolean118) {
							this.aByteArrayArrayArray6[arg7][arg6][arg3] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3] = 50;
						}
						if (local81.aBoolean116) {
							this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x492;
						}
					}
					if (local81.aBoolean111 && arg2 != null) {
						arg2.method415(arg3, arg4, arg6, local81.aBoolean112, arg0);
					}
					if (local81.anInt518 != 16) {
						arg5.method560(local81.anInt518, arg7, arg3, arg6);
					}
				} else if (arg4 == 1) {
					if (local81.anInt517 == -1) {
						local136 = local81.method264(1, arg0, local33, local44, local57, local68, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, 1);
					}
					arg5.method552(0, arg3, anIntArray28[arg0], arg6, local96, arg7, local110, null, local78, local136);
					if (local81.aBoolean118) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray6[arg7][arg6][arg3 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray6[arg7][arg6][arg3] = 50;
						}
					}
					if (local81.aBoolean111 && arg2 != null) {
						arg2.method415(arg3, arg4, arg6, local81.aBoolean112, arg0);
					}
				} else {
					@Pc(859) Class1_Sub1_Sub1 local859;
					@Pc(833) int local833;
					if (arg4 == 2) {
						local833 = arg0 + 1 & 0x3;
						@Pc(849) Class1_Sub1_Sub1 local849;
						if (local81.anInt517 == -1) {
							local849 = local81.method264(2, arg0 + 4, local33, local44, local57, local68, -1);
							local859 = local81.method264(2, local833, local33, local44, local57, local68, -1);
						} else {
							local849 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0 + 4, arg1, 2);
							local859 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, local833, arg1, 2);
						}
						arg5.method552(anIntArray27[local833], arg3, anIntArray27[arg0], arg6, local96, arg7, local110, local859, local78, local849);
						if (local81.aBoolean116) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg6][arg3 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray2[arg7][arg6][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg6 + 1][arg3] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray2[arg7][arg6 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg6][arg3] |= 0x249;
							}
						}
						if (local81.aBoolean111 && arg2 != null) {
							arg2.method415(arg3, arg4, arg6, local81.aBoolean112, arg0);
						}
						if (local81.anInt518 != 16) {
							arg5.method560(local81.anInt518, arg7, arg3, arg6);
						}
					} else if (arg4 == 3) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(3, arg0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, 3);
						}
						arg5.method552(0, arg3, anIntArray28[arg0], arg6, local96, arg7, local110, null, local78, local136);
						if (local81.aBoolean118) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray6[arg7][arg6][arg3 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg3] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray6[arg7][arg6][arg3] = 50;
							}
						}
						if (local81.aBoolean111 && arg2 != null) {
							arg2.method415(arg3, arg4, arg6, local81.aBoolean112, arg0);
						}
					} else if (arg4 == 9) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(arg4, arg0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, arg4);
						}
						arg5.method554(1, arg6, 0, arg7, 1, local136, arg3, local110, local96, local78);
						if (local81.aBoolean111 && arg2 != null) {
							arg2.method416(arg0, arg6, arg3, local81.anInt516, local81.aBoolean112, local81.anInt515, anInt201);
						}
					} else if (arg4 == 4) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, 0, arg1, 4);
						}
						arg5.method553(arg6, anIntArray27[arg0], local96, local78, arg3, local110, 0, arg7, 0, arg0 * 512, local136);
					} else if (arg4 == 5) {
						local833 = 16;
						local231 = arg5.method570(arg7, arg6, arg3);
						if (local231 > 0) {
							local833 = Class9.method258(local231 >> 14 & 0x7FFF).anInt518;
						}
						if (local81.anInt517 == -1) {
							local859 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local859 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, 0, arg1, 4);
						}
						arg5.method553(arg6, anIntArray27[arg0], local96, local78, arg3, local110, anIntArray30[arg0] * local833, arg7, anIntArray29[arg0] * local833, arg0 * 512, local859);
					} else if (arg4 == 6) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, 0, arg1, 4);
						}
						arg5.method553(arg6, 256, local96, local78, arg3, local110, 0, arg7, 0, arg0, local136);
					} else if (arg4 == 7) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, 0, arg1, 4);
						}
						arg5.method553(arg6, 512, local96, local78, arg3, local110, 0, arg7, 0, arg0, local136);
					} else if (arg4 == 8) {
						if (local81.anInt517 == -1) {
							local136 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, 0, arg1, 4);
						}
						arg5.method553(arg6, 768, local96, local78, arg3, local110, 0, arg7, 0, arg0, local136);
					}
				}
			} else if (!aBoolean32 || local81.aBoolean113 || local81.aBoolean119) {
				if (local81.anInt517 == -1) {
					local136 = local81.method264(22, arg0, local33, local44, local57, local68, -1);
				} else {
					local136 = new Class1_Sub1_Sub1_Sub2(local33, true, local68, local81.anInt517, local44, anInt202, local57, arg0, arg1, 22);
				}
				arg5.method550(arg3, (byte) 8, local96, local136, local78, arg7, arg6, local110);
				if (local81.aBoolean111 && local81.aBoolean113 && arg2 != null) {
					arg2.method417(arg3, arg6);
				}
			}
		} catch (@Pc(1535) RuntimeException local1535) {
			signlink.reporterror("42980, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -370 + ", " + arg7 + ", " + local1535.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;Lclient!s;Z)V")
	public void method63(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class39 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(21) int local21;
			@Pc(37) int local37;
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (local17 = 0; local17 < 104; local17++) {
					for (local21 = 0; local21 < 104; local21++) {
						if ((this.aByteArrayArrayArray1[local13][local17][local21] & 0x1) == 1) {
							local37 = local13;
							if ((this.aByteArrayArrayArray1[1][local17][local21] & 0x2) == 2) {
								local37 = local13 - 1;
							}
							if (local37 >= 0) {
								arg0[local37].method417(local21, local17);
							}
						}
					}
				}
			}
			if (aBoolean33) {
				anInt206 = 0;
				anInt207 = 0;
			} else {
				anInt206 += (int) (Math.random() * 5.0D) - 2;
				if (anInt206 < -8) {
					anInt206 = -8;
				}
				if (anInt206 > 8) {
					anInt206 = 8;
				}
				anInt207 += (int) (Math.random() * 5.0D) - 2;
				if (anInt207 < -16) {
					anInt207 = -16;
				}
				if (anInt207 > 16) {
					anInt207 = 16;
				}
			}
			@Pc(151) int local151;
			@Pc(157) int local157;
			@Pc(159) int local159;
			@Pc(163) int local163;
			@Pc(187) int local187;
			@Pc(209) int local209;
			@Pc(222) int local222;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(238) int local238;
			@Pc(254) int local254;
			@Pc(302) int local302;
			for (local17 = 0; local17 < 4; local17++) {
				@Pc(126) byte[][] local126 = this.aByteArrayArrayArray6[local17];
				local151 = (int) Math.sqrt((double) 5100);
				local157 = local151 * 768 >> 8;
				for (local159 = 1; local159 < this.anInt205 - 1; local159++) {
					for (local163 = 1; local163 < this.anInt204 - 1; local163++) {
						local187 = this.anIntArrayArrayArray1[local17][local163 + 1][local159] - this.anIntArrayArrayArray1[local17][local163 - 1][local159];
						local209 = this.anIntArrayArrayArray1[local17][local163][local159 + 1] - this.anIntArrayArrayArray1[local17][local163][local159 - 1];
						local222 = (int) Math.sqrt((double) (local187 * local187 + local209 * local209 + 65536));
						local228 = (local187 << 8) / local222;
						local232 = 65536 / local222;
						local238 = (local209 << 8) / local222;
						local254 = (local228 * -50 + local232 * -10 + local238 * -50) / local157 + 96;
						local302 = (local126[local163 - 1][local159] >> 2) + (local126[local163 + 1][local159] >> 3) + (local126[local163][local159 - 1] >> 2) + (local126[local163][local159 + 1] >> 3) + (local126[local163][local159] >> 1);
						this.anIntArrayArray1[local163][local159] = local254 - local302;
					}
				}
				for (local163 = 0; local163 < this.anInt205; local163++) {
					this.anIntArray22[local163] = 0;
					this.anIntArray23[local163] = 0;
					this.anIntArray24[local163] = 0;
					this.anIntArray25[local163] = 0;
					this.anIntArray26[local163] = 0;
				}
				for (local187 = -5; local187 < this.anInt204 + 5; local187++) {
					for (local209 = 0; local209 < this.anInt205; local209++) {
						local222 = local187 + 5;
						@Pc(437) int local437;
						if (local222 >= 0 && local222 < this.anInt204) {
							local228 = this.aByteArrayArrayArray2[local17][local222][local209] & 0xFF;
							if (local228 > 0) {
								@Pc(396) Class21 local396 = Class21.aClass21Array1[local228 - 1];
								this.anIntArray22[local209] += local396.anInt723;
								this.anIntArray23[local209] += local396.anInt721;
								this.anIntArray24[local209] += local396.anInt722;
								this.anIntArray25[local209] += local396.anInt724;
								local437 = this.anIntArray26[local209]++;
							}
						}
						local228 = local187 - 5;
						if (local228 >= 0 && local228 < this.anInt204) {
							local232 = this.aByteArrayArrayArray2[local17][local228][local209] & 0xFF;
							if (local232 > 0) {
								@Pc(469) Class21 local469 = Class21.aClass21Array1[local232 - 1];
								this.anIntArray22[local209] -= local469.anInt723;
								this.anIntArray23[local209] -= local469.anInt721;
								this.anIntArray24[local209] -= local469.anInt722;
								this.anIntArray25[local209] -= local469.anInt724;
								local437 = this.anIntArray26[local209]--;
							}
						}
					}
					if (local187 >= 1 && local187 < this.anInt204 - 1) {
						local222 = 0;
						local228 = 0;
						local232 = 0;
						local238 = 0;
						local254 = 0;
						for (local302 = -5; local302 < this.anInt205 + 5; local302++) {
							@Pc(545) int local545 = local302 + 5;
							if (local545 >= 0 && local545 < this.anInt205) {
								local222 += this.anIntArray22[local545];
								local228 += this.anIntArray23[local545];
								local232 += this.anIntArray24[local545];
								local238 += this.anIntArray25[local545];
								local254 += this.anIntArray26[local545];
							}
							@Pc(590) int local590 = local302 - 5;
							if (local590 >= 0 && local590 < this.anInt205) {
								local222 -= this.anIntArray22[local590];
								local228 -= this.anIntArray23[local590];
								local232 -= this.anIntArray24[local590];
								local238 -= this.anIntArray25[local590];
								local254 -= this.anIntArray26[local590];
							}
							if (local302 >= 1 && local302 < this.anInt205 - 1 && (!aBoolean32 || (this.aByteArrayArrayArray1[local17][local187][local302] & 0x10) == 0 && this.method64(local302, local187, local17) == anInt203)) {
								@Pc(673) int local673 = this.aByteArrayArrayArray2[local17][local187][local302] & 0xFF;
								@Pc(684) int local684 = this.aByteArrayArrayArray3[local17][local187][local302] & 0xFF;
								if (local673 > 0 || local684 > 0) {
									@Pc(697) int local697 = this.anIntArrayArrayArray1[local17][local187][local302];
									@Pc(708) int local708 = this.anIntArrayArrayArray1[local17][local187 + 1][local302];
									@Pc(721) int local721 = this.anIntArrayArrayArray1[local17][local187 + 1][local302 + 1];
									@Pc(732) int local732 = this.anIntArrayArrayArray1[local17][local187][local302 + 1];
									@Pc(739) int local739 = this.anIntArrayArray1[local187][local302];
									@Pc(748) int local748 = this.anIntArrayArray1[local187 + 1][local302];
									@Pc(759) int local759 = this.anIntArrayArray1[local187 + 1][local302 + 1];
									@Pc(768) int local768 = this.anIntArrayArray1[local187][local302 + 1];
									@Pc(770) int local770 = -1;
									@Pc(772) int local772 = -1;
									@Pc(780) int local780;
									@Pc(784) int local784;
									if (local673 > 0) {
										local780 = local222 * 256 / local238;
										local784 = local228 / local254;
										@Pc(788) int local788 = local232 / local254;
										local770 = this.method72(local780, local784, local788);
										@Pc(800) int local800 = local780 + anInt206 & 0xFF;
										local788 += anInt207;
										if (local788 < 0) {
											local788 = 0;
										} else if (local788 > 255) {
											local788 = 255;
										}
										local772 = this.method72(local800, local784, local788);
									}
									if (local17 > 0) {
										@Pc(825) boolean local825 = true;
										if (local673 == 0 && this.aByteArrayArrayArray4[local17][local187][local302] != 0) {
											local825 = false;
										}
										if (local684 > 0 && !Class21.aClass21Array1[local684 - 1].aBoolean174) {
											local825 = false;
										}
										if (local825 && local697 == local708 && local697 == local721 && local697 == local732) {
											this.anIntArrayArrayArray2[local17][local187][local302] |= 0x924;
										}
									}
									local780 = 0;
									if (local770 != -1) {
										local780 = Class1_Sub1_Sub2_Sub1.anIntArray188[method70(local772, 96)];
									}
									if (local684 == 0) {
										arg1.method549(local17, local187, local302, 0, 0, -1, local697, local708, local721, local732, method70(local770, local739), method70(local770, local748), method70(local770, local759), method70(local770, local768), 0, 0, 0, 0, local780, 0);
									} else {
										local784 = this.aByteArrayArrayArray4[local17][local187][local302] + 1;
										@Pc(937) byte local937 = this.aByteArrayArrayArray5[local17][local187][local302];
										@Pc(943) Class21 local943 = Class21.aClass21Array1[local684 - 1];
										@Pc(946) int local946 = local943.anInt719;
										@Pc(954) int local954;
										@Pc(952) int local952;
										if (local946 >= 0) {
											local952 = Class1_Sub1_Sub2_Sub1.method376(local946);
											local954 = -1;
										} else if (local943.anInt718 == 16711935) {
											local952 = 0;
											local954 = -2;
											local946 = -1;
										} else {
											local954 = this.method72(local943.anInt720, local943.anInt721, local943.anInt722);
											local952 = Class1_Sub1_Sub2_Sub1.anIntArray188[this.method71(local943.anInt725, 96)];
										}
										arg1.method549(local17, local187, local302, local784, local937, local946, local697, local708, local721, local732, method70(local770, local739), method70(local770, local748), method70(local770, local759), method70(local770, local768), this.method71(local954, local739), this.method71(local954, local748), this.method71(local954, local759), this.method71(local954, local768), local780, local952);
									}
								}
							}
						}
					}
				}
				for (local209 = 1; local209 < this.anInt205 - 1; local209++) {
					for (local222 = 1; local222 < this.anInt204 - 1; local222++) {
						arg1.method548(local17, local222, local209, this.method64(local209, local222, local17));
					}
				}
			}
			if (!aBoolean33) {
				arg1.method575();
			}
			for (local21 = 0; local21 < this.anInt204; local21++) {
				for (local37 = 0; local37 < this.anInt205; local37++) {
					if ((this.aByteArrayArrayArray1[1][local21][local37] & 0x2) == 2) {
						arg1.method546(local37, local21);
					}
				}
			}
			if (!aBoolean33) {
				local37 = 1;
				@Pc(1130) int local1130 = 2;
				@Pc(1132) int local1132 = 4;
				for (@Pc(1134) int local1134 = 0; local1134 < 4; local1134++) {
					if (local1134 > 0) {
						local37 <<= 0x3;
						local1130 <<= 0x3;
						local1132 <<= 0x3;
					}
					for (@Pc(1152) int local1152 = 0; local1152 <= local1134; local1152++) {
						for (local151 = 0; local151 <= this.anInt205; local151++) {
							for (local157 = 0; local157 <= this.anInt204; local157++) {
								if ((this.anIntArrayArrayArray2[local1152][local157][local151] & local37) != 0) {
									local159 = local151;
									local163 = local151;
									local187 = local1152;
									local209 = local1152;
									while (local159 > 0 && (this.anIntArrayArrayArray2[local1152][local157][local159 - 1] & local37) != 0) {
										local159--;
									}
									while (local163 < this.anInt205 && (this.anIntArrayArrayArray2[local1152][local157][local163 + 1] & local37) != 0) {
										local163++;
									}
									label335: while (local187 > 0) {
										for (local222 = local159; local222 <= local163; local222++) {
											if ((this.anIntArrayArrayArray2[local187 - 1][local157][local222] & local37) == 0) {
												break label335;
											}
										}
										local187--;
									}
									label324: while (local209 < local1134) {
										for (local222 = local159; local222 <= local163; local222++) {
											if ((this.anIntArrayArrayArray2[local209 + 1][local157][local222] & local37) == 0) {
												break label324;
											}
										}
										local209++;
									}
									local222 = (local209 + 1 - local187) * (local163 + 1 - local159);
									if (local222 >= 8) {
										local232 = this.anIntArrayArrayArray1[local209][local157][local159] - 240;
										local238 = this.anIntArrayArrayArray1[local187][local157][local159];
										Class39.method547(local163 * 128 + 128, 1, local238, local159 * 128, local232, local157 * 128, local1134, local157 * 128);
										for (local254 = local187; local254 <= local209; local254++) {
											for (local302 = local159; local302 <= local163; local302++) {
												this.anIntArrayArrayArray2[local254][local157][local302] &= ~local37;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1152][local157][local151] & local1130) != 0) {
									local159 = local157;
									local163 = local157;
									local187 = local1152;
									local209 = local1152;
									while (local159 > 0 && (this.anIntArrayArrayArray2[local1152][local159 - 1][local151] & local1130) != 0) {
										local159--;
									}
									while (local163 < this.anInt204 && (this.anIntArrayArrayArray2[local1152][local163 + 1][local151] & local1130) != 0) {
										local163++;
									}
									label388: while (local187 > 0) {
										for (local222 = local159; local222 <= local163; local222++) {
											if ((this.anIntArrayArrayArray2[local187 - 1][local222][local151] & local1130) == 0) {
												break label388;
											}
										}
										local187--;
									}
									label377: while (local209 < local1134) {
										for (local222 = local159; local222 <= local163; local222++) {
											if ((this.anIntArrayArrayArray2[local209 + 1][local222][local151] & local1130) == 0) {
												break label377;
											}
										}
										local209++;
									}
									local222 = (local209 + 1 - local187) * (local163 + 1 - local159);
									if (local222 >= 8) {
										local232 = this.anIntArrayArrayArray1[local209][local159][local151] - 240;
										local238 = this.anIntArrayArrayArray1[local187][local159][local151];
										Class39.method547(local151 * 128, 2, local238, local151 * 128, local232, local163 * 128 + 128, local1134, local159 * 128);
										for (local254 = local187; local254 <= local209; local254++) {
											for (local302 = local159; local302 <= local163; local302++) {
												this.anIntArrayArrayArray2[local254][local302][local151] &= ~local1130;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1152][local157][local151] & local1132) != 0) {
									local159 = local157;
									local163 = local157;
									local187 = local151;
									local209 = local151;
									while (local187 > 0 && (this.anIntArrayArrayArray2[local1152][local157][local187 - 1] & local1132) != 0) {
										local187--;
									}
									while (local209 < this.anInt205 && (this.anIntArrayArrayArray2[local1152][local157][local209 + 1] & local1132) != 0) {
										local209++;
									}
									label441: while (local159 > 0) {
										for (local222 = local187; local222 <= local209; local222++) {
											if ((this.anIntArrayArrayArray2[local1152][local159 - 1][local222] & local1132) == 0) {
												break label441;
											}
										}
										local159--;
									}
									label430: while (local163 < this.anInt204) {
										for (local222 = local187; local222 <= local209; local222++) {
											if ((this.anIntArrayArrayArray2[local1152][local163 + 1][local222] & local1132) == 0) {
												break label430;
											}
										}
										local163++;
									}
									if ((local163 + 1 - local159) * (local209 + 1 - local187) >= 4) {
										local222 = this.anIntArrayArrayArray1[local1152][local159][local187];
										Class39.method547(local209 * 128 + 128, 4, local222, local187 * 128, local222, local163 * 128 + 128, local1134, local159 * 128);
										for (local228 = local159; local228 <= local163; local228++) {
											for (local232 = local187; local232 <= local209; local232++) {
												this.anIntArrayArrayArray2[local1152][local228][local232] &= ~local1132;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1767) RuntimeException local1767) {
			signlink.reporterror("97800, " + arg0 + ", " + arg1 + ", " + true + ", " + local1767.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("19769, " + -936 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
