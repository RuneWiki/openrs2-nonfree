import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private static int anInt199 = -27210;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt200 = 868;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray29 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray30 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt204 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt205 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIII)Z")
	public static boolean method59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(16, arg0);
			@Pc(18) int local18 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local16.method512();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local16.method512();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local16.method498() >> 2;
						@Pc(73) int local73 = local64 + arg2;
						@Pc(77) int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method258(local18);
							if (local69 != 22 || !aBoolean35 || local90.aBoolean120 || local90.aBoolean126) {
								local3 &= local90.method262(anInt200);
								local31 = true;
							}
						}
					}
					local36 = local16.method512();
					if (local36 == 0) {
						break;
					}
					local16.method498();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("40784, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vb;Lclient!mb;I)V")
	public static void method60(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(7) int local7 = -1;
			while (true) {
				@Pc(10) int local10 = arg1.method512();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				@Pc(19) Class9 local19 = Class9.method258(local7);
				local19.method263(arg0);
				while (true) {
					@Pc(26) int local26 = arg1.method512();
					if (local26 == 0) {
						break;
					}
					arg1.method498();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("91621, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local37.toString());
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ)Z")
	public static boolean method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method258(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method261(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("3558, " + arg0 + ", " + arg1 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!jc;IIILclient!s;II[[[I)V")
	public static void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class39 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][][] arg9) {
		try {
			@Pc(9) int local9 = arg9[arg2][arg7][arg0];
			@Pc(19) int local19 = arg9[arg2][arg7 + 1][arg0];
			@Pc(31) int local31 = arg9[arg2][arg7 + 1][arg0 + 1];
			@Pc(41) int local41 = arg9[arg2][arg7][arg0 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method258(arg4);
			@Pc(66) int local66 = arg7 + (arg0 << 7) + (arg4 << 14) + 1073741824;
			if (!local54.aBoolean120) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg1 << 6) + arg5);
			@Pc(100) Class1_Sub1_Sub1 local100;
			if (arg5 == 22) {
				if (local54.anInt522 == -1) {
					local100 = local54.method264(22, arg1, local9, local19, local31, local41, -1);
				} else {
					local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 22, arg1, local41, local54.anInt522, true, local19);
				}
				arg6.method550(local51, arg8, local83, local66, arg7, local100, arg0);
				if (local54.aBoolean118 && local54.aBoolean120) {
					arg3.method417(arg7, arg0);
				}
			} else {
				@Pc(193) int local193;
				if (arg5 == 10 || arg5 == 11) {
					if (local54.anInt522 == -1) {
						local100 = local54.method264(10, arg1, local9, local19, local31, local41, -1);
					} else {
						local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 10, arg1, local41, local54.anInt522, true, local19);
					}
					if (local100 != null) {
						@Pc(180) int local180 = 0;
						if (arg5 == 11) {
							local180 += 256;
						}
						@Pc(196) int local196;
						if (arg1 == 1 || arg1 == 3) {
							local193 = local54.anInt521;
							local196 = local54.anInt520;
						} else {
							local193 = local54.anInt520;
							local196 = local54.anInt521;
						}
						arg6.method554(local180, local51, arg0, arg8, arg7, local100, local83, local66, local196, local193);
					}
					if (local54.aBoolean118) {
						arg3.method416(arg7, anInt199, local54.anInt521, arg0, local54.anInt520, arg1, local54.aBoolean119);
					}
				} else if (arg5 >= 12) {
					if (local54.anInt522 == -1) {
						local100 = local54.method264(arg5, arg1, local9, local19, local31, local41, -1);
					} else {
						local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, arg5, arg1, local41, local54.anInt522, true, local19);
					}
					arg6.method554(0, local51, arg0, arg8, arg7, local100, local83, local66, 1, 1);
					if (local54.aBoolean118) {
						arg3.method416(arg7, anInt199, local54.anInt521, arg0, local54.anInt520, arg1, local54.aBoolean119);
					}
				} else if (arg5 == 0) {
					if (local54.anInt522 == -1) {
						local100 = local54.method264(0, arg1, local9, local19, local31, local41, -1);
					} else {
						local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 0, arg1, local41, local54.anInt522, true, local19);
					}
					arg6.method552(anIntArray27[arg1], arg8, local100, null, local51, 0, arg0, arg7, local66, local83);
					if (local54.aBoolean118) {
						arg3.method415(arg1, arg5, arg7, arg0, local54.aBoolean119);
					}
				} else if (arg5 == 1) {
					if (local54.anInt522 == -1) {
						local100 = local54.method264(1, arg1, local9, local19, local31, local41, -1);
					} else {
						local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 1, arg1, local41, local54.anInt522, true, local19);
					}
					arg6.method552(anIntArray28[arg1], arg8, local100, null, local51, 0, arg0, arg7, local66, local83);
					if (local54.aBoolean118) {
						arg3.method415(arg1, arg5, arg7, arg0, local54.aBoolean119);
					}
				} else {
					@Pc(456) Class1_Sub1_Sub1 local456;
					@Pc(430) int local430;
					if (arg5 == 2) {
						local430 = arg1 + 1 & 0x3;
						@Pc(446) Class1_Sub1_Sub1 local446;
						if (local54.anInt522 == -1) {
							local446 = local54.method264(2, arg1 + 4, local9, local19, local31, local41, -1);
							local456 = local54.method264(2, local430, local9, local19, local31, local41, -1);
						} else {
							local446 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 2, arg1 + 4, local41, local54.anInt522, true, local19);
							local456 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 2, local430, local41, local54.anInt522, true, local19);
						}
						arg6.method552(anIntArray27[arg1], arg8, local446, local456, local51, anIntArray27[local430], arg0, arg7, local66, local83);
						if (local54.aBoolean118) {
							arg3.method415(arg1, arg5, arg7, arg0, local54.aBoolean119);
						}
					} else if (arg5 == 3) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(3, arg1, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 3, arg1, local41, local54.anInt522, true, local19);
						}
						arg6.method552(anIntArray28[arg1], arg8, local100, null, local51, 0, arg0, arg7, local66, local83);
						if (local54.aBoolean118) {
							arg3.method415(arg1, arg5, arg7, arg0, local54.aBoolean119);
						}
					} else if (arg5 == 9) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(arg5, arg1, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, arg5, arg1, local41, local54.anInt522, true, local19);
						}
						arg6.method554(0, local51, arg0, arg8, arg7, local100, local83, local66, 1, 1);
						if (local54.aBoolean118) {
							arg3.method416(arg7, anInt199, local54.anInt521, arg0, local54.anInt520, arg1, local54.aBoolean119);
						}
					} else if (arg5 == 4) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 4, 0, local41, local54.anInt522, true, local19);
						}
						arg6.method553(arg1 * 512, arg7, local100, 0, local51, local83, anIntArray27[arg1], (byte) 7, arg0, local66, arg8, 0);
					} else if (arg5 == 5) {
						local430 = 16;
						local193 = arg6.method570(arg8, arg7, arg0);
						if (local193 > 0) {
							local430 = Class9.method258(local193 >> 14 & 0x7FFF).anInt523;
						}
						if (local54.anInt522 == -1) {
							local456 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local456 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 4, 0, local41, local54.anInt522, true, local19);
						}
						arg6.method553(arg1 * 512, arg7, local456, anIntArray30[arg1] * local430, local51, local83, anIntArray27[arg1], (byte) 7, arg0, local66, arg8, anIntArray29[arg1] * local430);
					} else if (arg5 == 6) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 4, 0, local41, local54.anInt522, true, local19);
						}
						arg6.method553(arg1, arg7, local100, 0, local51, local83, 256, (byte) 7, arg0, local66, arg8, 0);
					} else if (arg5 == 7) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 4, 0, local41, local54.anInt522, true, local19);
						}
						arg6.method553(arg1, arg7, local100, 0, local51, local83, 512, (byte) 7, arg0, local66, arg8, 0);
					} else if (arg5 == 8) {
						if (local54.anInt522 == -1) {
							local100 = local54.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, local31, local9, arg4, 4, 0, local41, local54.anInt522, true, local19);
						}
						arg6.method553(arg1, arg7, local100, 0, local51, local83, 768, (byte) 7, arg0, local66, arg8, 0);
					}
				}
			}
		} catch (@Pc(926) RuntimeException local926) {
			signlink.reporterror("56887, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -412 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local926.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[I[[[BIII)V")
	public Class4(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt202 = arg4;
			this.anInt203 = arg2;
			this.anIntArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt202][this.anInt203];
			this.anIntArrayArrayArray2 = new int[4][this.anInt202 + 1][this.anInt203 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt202 + 1][this.anInt203 + 1];
			this.anIntArrayArray1 = new int[this.anInt202 + 1][this.anInt203 + 1];
			this.anIntArray22 = new int[this.anInt203];
			this.anIntArray23 = new int[this.anInt203];
			this.anIntArray24 = new int[this.anInt203];
			this.anIntArray25 = new int[this.anInt203];
			this.anIntArray26 = new int[this.anInt203];
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("64189, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method57(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + 64; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt202 && local3 >= 0 && local3 < this.anInt203) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg1 + 64 && local7 < this.anInt202 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg0 + 64 && local3 < this.anInt203 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("59390, " + 64 + ", " + -190 + ", " + arg0 + ", " + arg1 + ", " + 64 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[BI)V")
	public void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(16, arg4);
			for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
				for (@Pc(23) int local23 = 0; local23 < 64; local23++) {
					for (@Pc(27) int local27 = 0; local27 < 64; local27++) {
						@Pc(33) int local33 = local23 + arg3;
						@Pc(37) int local37 = local27 + arg1;
						@Pc(59) int local59;
						if (local33 >= 0 && local33 < 104 && local37 >= 0 && local37 < 104) {
							this.aByteArrayArrayArray1[local19][local33][local37] = 0;
							while (true) {
								local59 = local7.method498();
								if (local59 == 0) {
									if (local19 == 0) {
										this.anIntArrayArrayArray1[0][local33][local37] = -method65(local33 + arg2 + 932731, local37 + 556238 + arg0) * 8;
									} else {
										this.anIntArrayArrayArray1[local19][local33][local37] = this.anIntArrayArrayArray1[local19 - 1][local33][local37] - 240;
									}
									break;
								}
								if (local59 == 1) {
									@Pc(115) int local115 = local7.method498();
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
									this.aByteArrayArrayArray3[local19][local33][local37] = local7.method499();
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
								local59 = local7.method498();
								if (local59 == 0) {
									break;
								}
								if (local59 == 1) {
									local7.method498();
									break;
								}
								if (local59 <= 49) {
									local7.method498();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("66932, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;III[B[Lclient!jc;)V")
	public void method61(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class19[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(16, arg3);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method512();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method512();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method498();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg1;
					@Pc(73) int local73 = local44 + arg2;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray1[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class19 local100 = null;
						if (local85 >= 0) {
							local100 = arg4[local85];
						}
						this.method62(local54, local65, local61, local9, local73, arg0, local69, local100);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("62272, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILclient!s;IILclient!jc;)V")
	private void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class19 arg7) {
		try {
			if (aBoolean35) {
				if ((this.aByteArrayArrayArray1[arg0][arg6][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method64(arg0, arg4, arg6) != anInt201) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg0][arg6][arg4];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg0][arg6 + 1][arg4];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg0][arg6 + 1][arg4 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg0][arg6][arg4 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method258(arg3);
			@Pc(102) int local102 = arg6 + (arg4 << 7) + (arg3 << 14) + 1073741824;
			if (!local81.aBoolean120) {
				local102 += Integer.MIN_VALUE;
			}
			@Pc(116) byte local116 = (byte) ((arg1 << 6) + arg2);
			@Pc(142) Class1_Sub1_Sub1 local142;
			if (arg2 != 22) {
				@Pc(237) int local237;
				if (arg2 == 10 || arg2 == 11) {
					if (local81.anInt522 == -1) {
						local142 = local81.method264(10, arg1, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 10, arg1, local68, local81.anInt522, true, local44);
					}
					if (local142 != null) {
						@Pc(224) int local224 = 0;
						if (arg2 == 11) {
							local224 += 256;
						}
						@Pc(240) int local240;
						if (arg1 == 1 || arg1 == 3) {
							local237 = local81.anInt521;
							local240 = local81.anInt520;
						} else {
							local237 = local81.anInt520;
							local240 = local81.anInt521;
						}
						if (arg5.method554(local224, local78, arg4, arg0, arg6, local142, local116, local102, local240, local237) && local81.aBoolean125) {
							@Pc(271) Class1_Sub1_Sub1_Sub5 local271;
							if (local142 instanceof Class1_Sub1_Sub1_Sub5) {
								local271 = (Class1_Sub1_Sub1_Sub5) local142;
							} else {
								local271 = local81.method264(10, arg1, local33, local44, local57, local68, -1);
							}
							if (local271 != null) {
								for (@Pc(287) int local287 = 0; local287 <= local237; local287++) {
									for (@Pc(291) int local291 = 0; local291 <= local240; local291++) {
										@Pc(298) int local298 = local271.anInt556 / 4;
										if (local298 > 30) {
											local298 = 30;
										}
										if (local298 > this.aByteArrayArrayArray6[arg0][arg6 + local287][arg4 + local291]) {
											this.aByteArrayArrayArray6[arg0][arg6 + local287][arg4 + local291] = (byte) local298;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean118 && arg7 != null) {
						arg7.method416(arg6, anInt199, local81.anInt521, arg4, local81.anInt520, arg1, local81.aBoolean119);
					}
				} else if (arg2 >= 12) {
					if (local81.anInt522 == -1) {
						local142 = local81.method264(arg2, arg1, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, arg2, arg1, local68, local81.anInt522, true, local44);
					}
					arg5.method554(0, local78, arg4, arg0, arg6, local142, local116, local102, 1, 1);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x924;
					}
					if (local81.aBoolean118 && arg7 != null) {
						arg7.method416(arg6, anInt199, local81.anInt521, arg4, local81.anInt520, arg1, local81.aBoolean119);
					}
				} else if (arg2 == 0) {
					if (local81.anInt522 == -1) {
						local142 = local81.method264(0, arg1, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 0, arg1, local68, local81.anInt522, true, local44);
					}
					arg5.method552(anIntArray27[arg1], arg0, local142, null, local78, 0, arg4, arg6, local102, local116);
					if (arg1 == 0) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg0][arg6][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg6][arg4 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg0][arg6][arg4 + 1] = 50;
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray2[arg0][arg6][arg4 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray2[arg0][arg6 + 1][arg4] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg0][arg6][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x492;
						}
					}
					if (local81.aBoolean118 && arg7 != null) {
						arg7.method415(arg1, arg2, arg6, arg4, local81.aBoolean119);
					}
					if (local81.anInt523 != 16) {
						arg5.method560(local81.anInt523, arg4, arg0, arg6);
					}
				} else if (arg2 == 1) {
					if (local81.anInt522 == -1) {
						local142 = local81.method264(1, arg1, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 1, arg1, local68, local81.anInt522, true, local44);
					}
					arg5.method552(anIntArray28[arg1], arg0, local142, null, local78, 0, arg4, arg6, local102, local116);
					if (local81.aBoolean125) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray6[arg0][arg6][arg4 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray6[arg0][arg6][arg4] = 50;
						}
					}
					if (local81.aBoolean118 && arg7 != null) {
						arg7.method415(arg1, arg2, arg6, arg4, local81.aBoolean119);
					}
				} else {
					@Pc(865) Class1_Sub1_Sub1 local865;
					@Pc(839) int local839;
					if (arg2 == 2) {
						local839 = arg1 + 1 & 0x3;
						@Pc(855) Class1_Sub1_Sub1 local855;
						if (local81.anInt522 == -1) {
							local855 = local81.method264(2, arg1 + 4, local33, local44, local57, local68, -1);
							local865 = local81.method264(2, local839, local33, local44, local57, local68, -1);
						} else {
							local855 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 2, arg1 + 4, local68, local81.anInt522, true, local44);
							local865 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 2, local839, local68, local81.anInt522, true, local44);
						}
						arg5.method552(anIntArray27[arg1], arg0, local855, local865, local78, anIntArray27[local839], arg4, arg6, local102, local116);
						if (local81.aBoolean123) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg0][arg6][arg4 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray2[arg0][arg6][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg0][arg6 + 1][arg4] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray2[arg0][arg6 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x492;
								this.anIntArrayArrayArray2[arg0][arg6][arg4] |= 0x249;
							}
						}
						if (local81.aBoolean118 && arg7 != null) {
							arg7.method415(arg1, arg2, arg6, arg4, local81.aBoolean119);
						}
						if (local81.anInt523 != 16) {
							arg5.method560(local81.anInt523, arg4, arg0, arg6);
						}
					} else if (arg2 == 3) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(3, arg1, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 3, arg1, local68, local81.anInt522, true, local44);
						}
						arg5.method552(anIntArray28[arg1], arg0, local142, null, local78, 0, arg4, arg6, local102, local116);
						if (local81.aBoolean125) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray6[arg0][arg6][arg4 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray6[arg0][arg6 + 1][arg4] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray6[arg0][arg6][arg4] = 50;
							}
						}
						if (local81.aBoolean118 && arg7 != null) {
							arg7.method415(arg1, arg2, arg6, arg4, local81.aBoolean119);
						}
					} else if (arg2 == 9) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(arg2, arg1, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, arg2, arg1, local68, local81.anInt522, true, local44);
						}
						arg5.method554(0, local78, arg4, arg0, arg6, local142, local116, local102, 1, 1);
						if (local81.aBoolean118 && arg7 != null) {
							arg7.method416(arg6, anInt199, local81.anInt521, arg4, local81.anInt520, arg1, local81.aBoolean119);
						}
					} else if (arg2 == 4) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 4, 0, local68, local81.anInt522, true, local44);
						}
						arg5.method553(arg1 * 512, arg6, local142, 0, local78, local116, anIntArray27[arg1], (byte) 7, arg4, local102, arg0, 0);
					} else if (arg2 == 5) {
						local839 = 16;
						local237 = arg5.method570(arg0, arg6, arg4);
						if (local237 > 0) {
							local839 = Class9.method258(local237 >> 14 & 0x7FFF).anInt523;
						}
						if (local81.anInt522 == -1) {
							local865 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local865 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 4, 0, local68, local81.anInt522, true, local44);
						}
						arg5.method553(arg1 * 512, arg6, local865, anIntArray30[arg1] * local839, local78, local116, anIntArray27[arg1], (byte) 7, arg4, local102, arg0, anIntArray29[arg1] * local839);
					} else if (arg2 == 6) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 4, 0, local68, local81.anInt522, true, local44);
						}
						arg5.method553(arg1, arg6, local142, 0, local78, local116, 256, (byte) 7, arg4, local102, arg0, 0);
					} else if (arg2 == 7) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 4, 0, local68, local81.anInt522, true, local44);
						}
						arg5.method553(arg1, arg6, local142, 0, local78, local116, 512, (byte) 7, arg4, local102, arg0, 0);
					} else if (arg2 == 8) {
						if (local81.anInt522 == -1) {
							local142 = local81.method264(4, 0, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 4, 0, local68, local81.anInt522, true, local44);
						}
						arg5.method553(arg1, arg6, local142, 0, local78, local116, 768, (byte) 7, arg4, local102, arg0, 0);
					}
				}
			} else if (!aBoolean35 || local81.aBoolean120 || local81.aBoolean126) {
				if (local81.anInt522 == -1) {
					local142 = local81.method264(22, arg1, local33, local44, local57, local68, -1);
				} else {
					local142 = new Class1_Sub1_Sub1_Sub2(1, local57, local33, arg3, 22, arg1, local68, local81.anInt522, true, local44);
				}
				arg5.method550(local78, arg0, local116, local102, arg6, local142, arg4);
				if (local81.aBoolean118 && local81.aBoolean120 && arg7 != null) {
					arg7.method417(arg6, arg4);
				}
			}
		} catch (@Pc(1541) RuntimeException local1541) {
			signlink.reporterror("78046, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 182 + ", " + arg7 + ", " + local1541.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;[Lclient!jc;B)V")
	public void method63(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class19[] arg1) {
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
								arg1[local27].method417(local7, local11);
							}
						}
					}
				}
			}
			anInt204 += (int) (Math.random() * 5.0D) - 2;
			if (anInt204 < -8) {
				anInt204 = -8;
			}
			if (anInt204 > 8) {
				anInt204 = 8;
			}
			anInt205 += (int) (Math.random() * 5.0D) - 2;
			if (anInt205 < -16) {
				anInt205 = -16;
			}
			if (anInt205 > 16) {
				anInt205 = 16;
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
				for (local141 = 1; local141 < this.anInt203 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt202 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt203; local145++) {
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
					this.anIntArray25[local145] = 0;
					this.anIntArray26[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt202 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt203; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt202) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray22[local191] += local378.anInt730;
								this.anIntArray23[local191] += local378.anInt728;
								this.anIntArray24[local191] += local378.anInt729;
								this.anIntArray25[local191] += local378.anInt731;
								local419 = this.anIntArray26[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt202) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray22[local191] -= local451.anInt730;
								this.anIntArray23[local191] -= local451.anInt728;
								this.anIntArray24[local191] -= local451.anInt729;
								this.anIntArray25[local191] -= local451.anInt731;
								local419 = this.anIntArray26[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt202 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt203 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt203) {
								local204 += this.anIntArray22[local527];
								local210 += this.anIntArray23[local527];
								local214 += this.anIntArray24[local527];
								local220 += this.anIntArray25[local527];
								local236 += this.anIntArray26[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt203) {
								local204 -= this.anIntArray22[local572];
								local210 -= this.anIntArray23[local572];
								local214 -= this.anIntArray24[local572];
								local220 -= this.anIntArray25[local572];
								local236 -= this.anIntArray26[local572];
							}
							if (local284 >= 1 && local284 < this.anInt203 - 1 && (!aBoolean35 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method64(local7, local284, local169) == anInt201)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray1[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method72(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt204 & 0xFF;
										local770 += anInt205;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method72(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean195) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray188[method70(local754, 96)];
									}
									if (local666 == 0) {
										arg0.method549(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method70(local752, local721), method70(local752, local730), method70(local752, local741), method70(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt726;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method376(local928);
											local936 = -1;
										} else if (local925.anInt725 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method72(local925.anInt727, local925.anInt728, local925.anInt729);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray188[this.method71(local925.anInt732, 96)];
										}
										arg0.method549(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method70(local752, local721), method70(local752, local730), method70(local752, local741), method70(local752, local750), this.method71(local936, local721), this.method71(local936, local730), this.method71(local936, local741), this.method71(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt203 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt202 - 1; local204++) {
						arg0.method548(local7, local204, local191, this.method64(local7, local191, local204));
					}
				}
			}
			arg0.method575();
			for (local11 = 0; local11 < this.anInt202; local11++) {
				for (local27 = 0; local27 < this.anInt203; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method546(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1118) int local1118 = 2;
			@Pc(1120) int local1120 = 4;
			for (@Pc(1122) int local1122 = 0; local1122 < 4; local1122++) {
				if (local1122 > 0) {
					local27 <<= 0x3;
					local1118 <<= 0x3;
					local1120 <<= 0x3;
				}
				for (@Pc(1140) int local1140 = 0; local1140 <= local1122; local1140++) {
					for (local133 = 0; local133 <= this.anInt203; local133++) {
						for (local139 = 0; local139 <= this.anInt202; local139++) {
							if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1140;
								local191 = local1140;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1140][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt203 && (this.anIntArrayArrayArray2[local1140][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label324: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label324;
										}
									}
									local169--;
								}
								label313: while (local191 < local1122) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label313;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class39.method547(local139 * 128, local145 * 128 + 128, local214, local139 * 128, local1122, 1, local141 * 128, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local1118) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1140;
								local191 = local1140;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1140][local141 - 1][local133] & local1118) != 0) {
									local141--;
								}
								while (local145 < this.anInt202 && (this.anIntArrayArrayArray2[local1140][local145 + 1][local133] & local1118) != 0) {
									local145++;
								}
								label377: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1118) == 0) {
											break label377;
										}
									}
									local169--;
								}
								label366: while (local191 < local1122) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1118) == 0) {
											break label366;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class39.method547(local145 * 128 + 128, local133 * 128, local214, local141 * 128, local1122, 2, local133 * 128, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1118;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1140][local139][local133] & local1120) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1140][local139][local169 - 1] & local1120) != 0) {
									local169--;
								}
								while (local191 < this.anInt203 && (this.anIntArrayArrayArray2[local1140][local139][local191 + 1] & local1120) != 0) {
									local191++;
								}
								label430: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1140][local141 - 1][local204] & local1120) == 0) {
											break label430;
										}
									}
									local141--;
								}
								label419: while (local145 < this.anInt202) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1140][local145 + 1][local204] & local1120) == 0) {
											break label419;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1140][local141][local169];
									Class39.method547(local145 * 128 + 128, local191 * 128 + 128, local204, local141 * 128, local1122, 4, local169 * 128, local204);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1140][local210][local214] &= ~local1120;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1755) RuntimeException local1755) {
			signlink.reporterror("10868, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local1755.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZ)I")
	private int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("21279, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local36.toString());
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
