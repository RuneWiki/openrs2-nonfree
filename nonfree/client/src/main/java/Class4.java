import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt198 = 678;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt199 = 6;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray29 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray30 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt204 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	private static int anInt205 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt197 = -48;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private int anInt200 = -62;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

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
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BB)Z")
	public static boolean method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, (byte) 3);
			@Pc(16) int local16 = -1;
			label53: while (true) {
				@Pc(19) int local19 = local9.method512();
				if (local19 == 0) {
					return local3;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				@Pc(29) boolean local29 = false;
				while (true) {
					@Pc(34) int local34;
					while (!local29) {
						local34 = local9.method512();
						if (local34 == 0) {
							continue label53;
						}
						local27 += local34 - 1;
						@Pc(56) int local56 = local27 & 0x3F;
						@Pc(62) int local62 = local27 >> 6 & 0x3F;
						@Pc(67) int local67 = local9.method498() >> 2;
						@Pc(71) int local71 = local62 + arg1;
						@Pc(75) int local75 = local56 + arg0;
						if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
							@Pc(88) Class9 local88 = Class9.method258(local16);
							if (local67 != 22 || !aBoolean33 || local88.aBoolean117 || local88.aBoolean123) {
								local3 &= local88.method262();
								local29 = true;
							}
						}
					}
					local34 = local9.method512();
					if (local34 == 0) {
						break;
					}
					local9.method498();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("87069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 74 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mb;Lclient!vb;B)V")
	public static void method60(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class45_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(15) int local15 = arg0.method512();
				if (local15 == 0) {
					return;
				}
				local3 += local15;
				@Pc(24) Class9 local24 = Class9.method258(local3);
				local24.method263(arg1);
				while (true) {
					@Pc(31) int local31 = arg0.method512();
					if (local31 == 0) {
						break;
					}
					arg0.method498();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("55015, " + arg0 + ", " + arg1 + ", " + -13 + ", " + local42.toString());
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

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	public static boolean method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(11) Class9 local11 = Class9.method258(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method261(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("85291, " + arg0 + ", " + arg1 + ", " + 23745 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!jc;IIILclient!s;[[[IIII)V")
	public static void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class39 arg6, @OriginalArg(7) int[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg7[arg8][arg1][arg3];
			@Pc(19) int local19 = arg7[arg8][arg1 + 1][arg3];
			if (anInt199 == 6) {
				@Pc(35) int local35 = arg7[arg8][arg1 + 1][arg3 + 1];
				@Pc(45) int local45 = arg7[arg8][arg1][arg3 + 1];
				@Pc(55) int local55 = local9 + local19 + local35 + local45 >> 2;
				@Pc(58) Class9 local58 = Class9.method258(arg5);
				@Pc(70) int local70 = arg1 + (arg3 << 7) + (arg5 << 14) + 1073741824;
				if (!local58.aBoolean117) {
					local70 += Integer.MIN_VALUE;
				}
				@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg4);
				@Pc(101) Class1_Sub1_Sub1 local101;
				if (arg4 == 22) {
					if (local58.anInt521 == -1) {
						local101 = local58.method264(22, arg0, local9, local19, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(22, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
					}
					arg6.method550(local101, arg1, local70, arg9, arg3, local55, local84);
					if (local58.aBoolean115 && local58.aBoolean117) {
						arg2.method417(arg3, arg1);
					}
				} else {
					@Pc(194) int local194;
					if (arg4 == 10 || arg4 == 11) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(10, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(10, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						if (local101 != null) {
							@Pc(181) int local181 = 0;
							if (arg4 == 11) {
								local181 += 256;
							}
							@Pc(197) int local197;
							if (arg0 == 1 || arg0 == 3) {
								local194 = local58.anInt520;
								local197 = local58.anInt519;
							} else {
								local194 = local58.anInt519;
								local197 = local58.anInt520;
							}
							arg6.method554(local84, local194, local55, local101, local197, local70, arg3, arg1, local181, arg9);
						}
						if (local58.aBoolean115) {
							arg2.method416(local58.aBoolean116, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
						}
					} else if (arg4 >= 12) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(arg4, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method554(local84, 1, local55, local101, 1, local70, arg3, arg1, 0, arg9);
						if (local58.aBoolean115) {
							arg2.method416(local58.aBoolean116, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
						}
					} else if (arg4 == 0) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(0, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(0, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method552(local101, null, local70, 0, arg3, local84, arg1, local55, anIntArray27[arg0], arg9);
						if (local58.aBoolean115) {
							arg2.method415(arg1, arg3, arg0, local58.aBoolean116, arg4);
						}
					} else if (arg4 == 1) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(1, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(1, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method552(local101, null, local70, 0, arg3, local84, arg1, local55, anIntArray28[arg0], arg9);
						if (local58.aBoolean115) {
							arg2.method415(arg1, arg3, arg0, local58.aBoolean116, arg4);
						}
					} else {
						@Pc(457) Class1_Sub1_Sub1 local457;
						@Pc(431) int local431;
						if (arg4 == 2) {
							local431 = arg0 + 1 & 0x3;
							@Pc(447) Class1_Sub1_Sub1 local447;
							if (local58.anInt521 == -1) {
								local447 = local58.method264(2, arg0 + 4, local9, local19, local35, local45, -1);
								local457 = local58.method264(2, local431, local9, local19, local35, local45, -1);
							} else {
								local447 = new Class1_Sub1_Sub1_Sub2(2, arg0 + 4, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
								local457 = new Class1_Sub1_Sub1_Sub2(2, local431, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method552(local447, local457, local70, anIntArray27[local431], arg3, local84, arg1, local55, anIntArray27[arg0], arg9);
							if (local58.aBoolean115) {
								arg2.method415(arg1, arg3, arg0, local58.aBoolean116, arg4);
							}
						} else if (arg4 == 3) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(3, arg0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(3, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method552(local101, null, local70, 0, arg3, local84, arg1, local55, anIntArray28[arg0], arg9);
							if (local58.aBoolean115) {
								arg2.method415(arg1, arg3, arg0, local58.aBoolean116, arg4);
							}
						} else if (arg4 == 9) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(arg4, arg0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method554(local84, 1, local55, local101, 1, local70, arg3, arg1, 0, arg9);
							if (local58.aBoolean115) {
								arg2.method416(local58.aBoolean116, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
							}
						} else if (arg4 == 4) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(anIntArray27[arg0], 0, local84, local55, arg1, local70, arg0 * 512, arg3, 0, local101, arg9);
						} else if (arg4 == 5) {
							local431 = 16;
							local194 = arg6.method570(arg9, arg1, arg3);
							if (local194 > 0) {
								local431 = Class9.method258(local194 >> 14 & 0x7FFF).anInt522;
							}
							if (local58.anInt521 == -1) {
								local457 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local457 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(anIntArray27[arg0], anIntArray29[arg0] * local431, local84, local55, arg1, local70, arg0 * 512, arg3, anIntArray30[arg0] * local431, local457, arg9);
						} else if (arg4 == 6) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(256, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg9);
						} else if (arg4 == 7) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(512, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg9);
						} else if (arg4 == 8) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(768, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg9);
						}
					}
				}
			}
		} catch (@Pc(927) RuntimeException local927) {
			signlink.reporterror("52567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 6 + ", " + arg8 + ", " + arg9 + ", " + local927.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt202 = arg2;
			this.anInt203 = arg4;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg0;
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
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("22153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIII)V")
	public void method57(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt202 && local3 >= 0 && local3 < this.anInt203) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt202 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt203 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("20612, " + 1 + ", " + 64 + ", " + arg0 + ", " + arg1 + ", " + 64 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BIII)V")
	public void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, (byte) 3);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg0;
						@Pc(27) int local27 = local17 + arg4;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method498();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -method65(local23 + arg1 + 932731, local27 + 556238 + arg3) * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method498();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method499();
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
								local49 = local7.method498();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method498();
									break;
								}
								if (local49 <= 49) {
									local7.method498();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("25719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!s;I[B[Lclient!jc;B)V")
	public void method61(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class19[] arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg3, (byte) 3);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(22) int local22 = local7.method512();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
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
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg4[local86];
						}
						this.method62(local62, local66, local70, local9, local55, local101, local74, arg1);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("95130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!jc;ILclient!s;)V")
	private void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class39 arg7) {
		try {
			if (aBoolean33) {
				if ((this.aByteArrayArrayArray1[arg4][arg2][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method64(arg2, arg6, arg4) != anInt201) {
					return;
				}
			}
			@Pc(36) int local36 = this.anIntArrayArrayArray1[arg4][arg2][arg6];
			@Pc(47) int local47 = this.anIntArrayArrayArray1[arg4][arg2 + 1][arg6];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg4][arg2 + 1][arg6 + 1];
			@Pc(71) int local71 = this.anIntArrayArrayArray1[arg4][arg2][arg6 + 1];
			@Pc(81) int local81 = local36 + local47 + local60 + local71 >> 2;
			@Pc(84) Class9 local84 = Class9.method258(arg3);
			@Pc(96) int local96 = arg2 + (arg6 << 7) + (arg3 << 14) + 1073741824;
			if (!local84.aBoolean117) {
				local96 += Integer.MIN_VALUE;
			}
			@Pc(110) byte local110 = (byte) ((arg1 << 6) + arg0);
			@Pc(136) Class1_Sub1_Sub1 local136;
			if (arg0 != 22) {
				@Pc(231) int local231;
				if (arg0 == 10 || arg0 == 11) {
					if (local84.anInt521 == -1) {
						local136 = local84.method264(10, arg1, local36, local47, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(10, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
					}
					if (local136 != null) {
						@Pc(218) int local218 = 0;
						if (arg0 == 11) {
							local218 += 256;
						}
						@Pc(234) int local234;
						if (arg1 == 1 || arg1 == 3) {
							local231 = local84.anInt520;
							local234 = local84.anInt519;
						} else {
							local231 = local84.anInt519;
							local234 = local84.anInt520;
						}
						if (arg7.method554(local110, local231, local81, local136, local234, local96, arg6, arg2, local218, arg4) && local84.aBoolean122) {
							@Pc(265) Class1_Sub1_Sub1_Sub5 local265;
							if (local136 instanceof Class1_Sub1_Sub1_Sub5) {
								local265 = (Class1_Sub1_Sub1_Sub5) local136;
							} else {
								local265 = local84.method264(10, arg1, local36, local47, local60, local71, -1);
							}
							if (local265 != null) {
								for (@Pc(281) int local281 = 0; local281 <= local231; local281++) {
									for (@Pc(285) int local285 = 0; local285 <= local234; local285++) {
										@Pc(292) int local292 = local265.anInt551 / 4;
										if (local292 > 30) {
											local292 = 30;
										}
										if (local292 > this.aByteArrayArrayArray6[arg4][arg2 + local281][arg6 + local285]) {
											this.aByteArrayArrayArray6[arg4][arg2 + local281][arg6 + local285] = (byte) local292;
										}
									}
								}
							}
						}
					}
					if (local84.aBoolean115 && arg5 != null) {
						arg5.method416(local84.aBoolean116, arg6, arg1, local84.anInt519, local84.anInt520, arg2);
					}
				} else if (arg0 >= 12) {
					if (local84.anInt521 == -1) {
						local136 = local84.method264(arg0, arg1, local36, local47, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(arg0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
					}
					arg7.method554(local110, 1, local81, local136, 1, local96, arg6, arg2, 0, arg4);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
						this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x924;
					}
					if (local84.aBoolean115 && arg5 != null) {
						arg5.method416(local84.aBoolean116, arg6, arg1, local84.anInt519, local84.anInt520, arg2);
					}
				} else if (arg0 == 0) {
					if (local84.anInt521 == -1) {
						local136 = local84.method264(0, arg1, local36, local47, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
					}
					arg7.method552(local136, null, local96, 0, arg6, local110, arg2, local81, anIntArray27[arg1], arg4);
					if (arg1 == 0) {
						if (local84.aBoolean122) {
							this.aByteArrayArrayArray6[arg4][arg2][arg6] = 50;
							this.aByteArrayArrayArray6[arg4][arg2][arg6 + 1] = 50;
						}
						if (local84.aBoolean120) {
							this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local84.aBoolean122) {
							this.aByteArrayArrayArray6[arg4][arg2][arg6 + 1] = 50;
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6 + 1] = 50;
						}
						if (local84.aBoolean120) {
							this.anIntArrayArrayArray2[arg4][arg2][arg6 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local84.aBoolean122) {
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6] = 50;
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6 + 1] = 50;
						}
						if (local84.aBoolean120) {
							this.anIntArrayArrayArray2[arg4][arg2 + 1][arg6] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local84.aBoolean122) {
							this.aByteArrayArrayArray6[arg4][arg2][arg6] = 50;
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6] = 50;
						}
						if (local84.aBoolean120) {
							this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x492;
						}
					}
					if (local84.aBoolean115 && arg5 != null) {
						arg5.method415(arg2, arg6, arg1, local84.aBoolean116, arg0);
					}
					if (local84.anInt522 != 16) {
						arg7.method560(arg4, arg6, arg2, local84.anInt522);
					}
				} else if (arg0 == 1) {
					if (local84.anInt521 == -1) {
						local136 = local84.method264(1, arg1, local36, local47, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(1, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
					}
					arg7.method552(local136, null, local96, 0, arg6, local110, arg2, local81, anIntArray28[arg1], arg4);
					if (local84.aBoolean122) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray6[arg4][arg2][arg6 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray6[arg4][arg2][arg6] = 50;
						}
					}
					if (local84.aBoolean115 && arg5 != null) {
						arg5.method415(arg2, arg6, arg1, local84.aBoolean116, arg0);
					}
				} else {
					@Pc(859) Class1_Sub1_Sub1 local859;
					@Pc(833) int local833;
					if (arg0 == 2) {
						local833 = arg1 + 1 & 0x3;
						@Pc(849) Class1_Sub1_Sub1 local849;
						if (local84.anInt521 == -1) {
							local849 = local84.method264(2, arg1 + 4, local36, local47, local60, local71, -1);
							local859 = local84.method264(2, local833, local36, local47, local60, local71, -1);
						} else {
							local849 = new Class1_Sub1_Sub1_Sub2(2, arg1 + 4, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							local859 = new Class1_Sub1_Sub1_Sub2(2, local833, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method552(local849, local859, local96, anIntArray27[local833], arg6, local110, arg2, local81, anIntArray27[arg1], arg4);
						if (local84.aBoolean120) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg2][arg6 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray2[arg4][arg2][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg2 + 1][arg6] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray2[arg4][arg2 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg2][arg6] |= 0x249;
							}
						}
						if (local84.aBoolean115 && arg5 != null) {
							arg5.method415(arg2, arg6, arg1, local84.aBoolean116, arg0);
						}
						if (local84.anInt522 != 16) {
							arg7.method560(arg4, arg6, arg2, local84.anInt522);
						}
					} else if (arg0 == 3) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(3, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(3, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method552(local136, null, local96, 0, arg6, local110, arg2, local81, anIntArray28[arg1], arg4);
						if (local84.aBoolean122) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray6[arg4][arg2][arg6 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg6] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray6[arg4][arg2][arg6] = 50;
							}
						}
						if (local84.aBoolean115 && arg5 != null) {
							arg5.method415(arg2, arg6, arg1, local84.aBoolean116, arg0);
						}
					} else if (arg0 == 9) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(arg0, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(arg0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method554(local110, 1, local81, local136, 1, local96, arg6, arg2, 0, arg4);
						if (local84.aBoolean115 && arg5 != null) {
							arg5.method416(local84.aBoolean116, arg6, arg1, local84.anInt519, local84.anInt520, arg2);
						}
					} else if (arg0 == 4) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method553(anIntArray27[arg1], 0, local110, local81, arg2, local96, arg1 * 512, arg6, 0, local136, arg4);
					} else if (arg0 == 5) {
						local833 = 16;
						local231 = arg7.method570(arg4, arg2, arg6);
						if (local231 > 0) {
							local833 = Class9.method258(local231 >> 14 & 0x7FFF).anInt522;
						}
						if (local84.anInt521 == -1) {
							local859 = local84.method264(4, 0, local36, local47, local60, local71, -1);
						} else {
							local859 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method553(anIntArray27[arg1], anIntArray29[arg1] * local833, local110, local81, arg2, local96, arg1 * 512, arg6, anIntArray30[arg1] * local833, local859, arg4);
					} else if (arg0 == 6) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method553(256, 0, local110, local81, arg2, local96, arg1, arg6, 0, local136, arg4);
					} else if (arg0 == 7) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method553(512, 0, local110, local81, arg2, local96, arg1, arg6, 0, local136, arg4);
					} else if (arg0 == 8) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg7.method553(768, 0, local110, local81, arg2, local96, arg1, arg6, 0, local136, arg4);
					}
				}
			} else if (!aBoolean33 || local84.aBoolean117 || local84.aBoolean123) {
				if (local84.anInt521 == -1) {
					local136 = local84.method264(22, arg1, local36, local47, local60, local71, -1);
				} else {
					local136 = new Class1_Sub1_Sub1_Sub2(22, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
				}
				arg7.method550(local136, arg2, local96, arg4, arg6, local81, local110);
				if (local84.aBoolean115 && local84.aBoolean117 && arg5 != null) {
					arg5.method417(arg6, arg2);
				}
			}
		} catch (@Pc(1535) RuntimeException local1535) {
			signlink.reporterror("37996, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 20 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1535.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;[Lclient!jc;I)V")
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
								arg1[local27].method417(local11, local7);
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
								this.anIntArray22[local191] += local378.anInt727;
								this.anIntArray23[local191] += local378.anInt725;
								this.anIntArray24[local191] += local378.anInt726;
								this.anIntArray25[local191] += local378.anInt728;
								local419 = this.anIntArray26[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt202) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray22[local191] -= local451.anInt727;
								this.anIntArray23[local191] -= local451.anInt725;
								this.anIntArray24[local191] -= local451.anInt726;
								this.anIntArray25[local191] -= local451.anInt728;
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
							if (local284 >= 1 && local284 < this.anInt203 - 1 && (!aBoolean33 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method64(local169, local284, local7) == anInt201)) {
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
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean181) {
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
										@Pc(928) int local928 = local925.anInt723;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method376(local928);
											local936 = -1;
										} else if (local925.anInt722 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method72(local925.anInt724, local925.anInt725, local925.anInt726);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray188[this.method71(local925.anInt729, 96)];
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
						arg0.method548(local7, local204, local191, this.method64(local204, local191, local7));
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
			@Pc(1107) int local1107 = 2;
			@Pc(1109) int local1109 = 4;
			for (@Pc(1111) int local1111 = 0; local1111 < 4; local1111++) {
				if (local1111 > 0) {
					local27 <<= 0x3;
					local1107 <<= 0x3;
					local1109 <<= 0x3;
				}
				for (@Pc(1129) int local1129 = 0; local1129 <= local1111; local1129++) {
					for (local133 = 0; local133 <= this.anInt203; local133++) {
						for (local139 = 0; local139 <= this.anInt202; local139++) {
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1129][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt203 && (this.anIntArrayArrayArray2[local1129][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label325: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label325;
										}
									}
									local169--;
								}
								label314: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label314;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class39.method547(local139 * 128, 1, local214, local139 * 128, local1111, local220, local141 * 128, local145 * 128 + 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local1107) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1129][local141 - 1][local133] & local1107) != 0) {
									local141--;
								}
								while (local145 < this.anInt202 && (this.anIntArrayArrayArray2[local1129][local145 + 1][local133] & local1107) != 0) {
									local145++;
								}
								label378: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1107) == 0) {
											break label378;
										}
									}
									local169--;
								}
								label367: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1107) == 0) {
											break label367;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class39.method547(local141 * 128, 2, local214, local145 * 128 + 128, local1111, local220, local133 * 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1107;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local1109) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1129][local139][local169 - 1] & local1109) != 0) {
									local169--;
								}
								while (local191 < this.anInt203 && (this.anIntArrayArrayArray2[local1129][local139][local191 + 1] & local1109) != 0) {
									local191++;
								}
								label431: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1129][local141 - 1][local204] & local1109) == 0) {
											break label431;
										}
									}
									local141--;
								}
								label420: while (local145 < this.anInt202) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1129][local145 + 1][local204] & local1109) == 0) {
											break label420;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1129][local141][local169];
									Class39.method547(local141 * 128, 4, local204, local145 * 128 + 128, local1111, local204, local169 * 128, local191 * 128 + 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1129][local210][local214] &= ~local1109;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1750) RuntimeException local1750) {
			signlink.reporterror("80831, " + arg0 + ", " + arg1 + ", " + 44106 + ", " + local1750.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("72080, " + 11519 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
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
