import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private static boolean aBoolean32;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt168;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt169 = -606;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private static int anInt171 = 262;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	public static boolean aBoolean35 = true;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt175 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	private static int anInt176 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ[B)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, aBoolean32);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method494();
				if (local20 == 0) {
					return local3;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method494();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method480() >> 2;
						@Pc(72) int local72 = local63 + arg1;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method288(local17);
							if (local68 != 22 || !aBoolean35 || local89.aBoolean133 || local89.aBoolean139) {
								local3 &= local89.method292((byte) 3);
								local30 = true;
							}
						}
					}
					local35 = local9.method494();
					if (local35 == 0) {
						break;
					}
					local9.method480();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("92678, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ub;Lclient!lb;)V")
	public static void method59(@OriginalArg(1) Class44_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(7) int local7 = -1;
			while (true) {
				@Pc(10) int local10 = arg1.method494();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				@Pc(19) Class9 local19 = Class9.method288(local7);
				local19.method293(arg0);
				while (true) {
					@Pc(26) int local26 = arg1.method494();
					if (local26 == 0) {
						break;
					}
					arg1.method480();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("94518, " + 371 + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
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

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
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
	public static boolean method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method288(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method291(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("19081, " + 262 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[[IIZLclient!jc;IILclient!r;II)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class37 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg2[arg0][arg5][arg9];
			@Pc(19) int local19 = arg2[arg0][arg5 + 1][arg9];
			@Pc(31) int local31 = arg2[arg0][arg5 + 1][arg9 + 1];
			@Pc(41) int local41 = arg2[arg0][arg5][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method288(arg8);
			@Pc(66) int local66 = arg5 + (arg9 << 7) + (arg8 << 14) + 1073741824;
			if (!local54.aBoolean133) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg6 << 6) + arg3);
			@Pc(108) Class1_Sub1_Sub1 local108;
			if (arg3 == 22) {
				if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
					local108 = local54.method294(22, arg6, local9, local19, local31, local41, -1);
				} else {
					local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 22, local31, arg6, local19);
				}
				arg7.method536(arg9, local108, arg1, local66, local51, arg5, local80);
				if (local54.aBoolean131 && local54.aBoolean133) {
					arg4.method423(arg5, arg9);
				}
			} else {
				@Pc(204) int local204;
				if (arg3 == 10 || arg3 == 11) {
					if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
						local108 = local54.method294(10, arg6, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 10, local31, arg6, local19);
					}
					if (local108 != null) {
						@Pc(191) int local191 = 0;
						if (arg3 == 11) {
							local191 += 256;
						}
						@Pc(207) int local207;
						if (arg6 == 1 || arg6 == 3) {
							local204 = local54.anInt503;
							local207 = local54.anInt502;
						} else {
							local204 = local54.anInt502;
							local207 = local54.anInt503;
						}
						arg7.method540(local51, local204, local108, arg5, local207, local191, arg1, local66, arg9, local80);
					}
					if (local54.aBoolean131) {
						arg4.method422(local54.anInt502, local54.anInt503, local54.aBoolean132, arg9, arg6, arg5);
					}
				} else if (arg3 >= 12) {
					if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
						local108 = local54.method294(arg3, arg6, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, arg3, local31, arg6, local19);
					}
					arg7.method540(local51, 1, local108, arg5, 1, 0, arg1, local66, arg9, local80);
					if (local54.aBoolean131) {
						arg4.method422(local54.anInt502, local54.anInt503, local54.aBoolean132, arg9, arg6, arg5);
					}
				} else if (arg3 == 0) {
					if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
						local108 = local54.method294(0, arg6, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 0, local31, arg6, local19);
					}
					arg7.method538(local51, anInt168, arg5, arg1, 0, anIntArray25[arg6], null, local80, arg9, local108, local66);
					if (local54.aBoolean131) {
						arg4.method421(arg6, arg9, arg3, arg5, local54.aBoolean132);
					}
				} else if (arg3 == 1) {
					if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
						local108 = local54.method294(1, arg6, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 1, local31, arg6, local19);
					}
					arg7.method538(local51, anInt168, arg5, arg1, 0, anIntArray26[arg6], null, local80, arg9, local108, local66);
					if (local54.aBoolean131) {
						arg4.method421(arg6, arg9, arg3, arg5, local54.aBoolean132);
					}
				} else {
					@Pc(450) int local450;
					@Pc(479) Class1_Sub1_Sub1 local479;
					if (arg3 == 2) {
						local450 = arg6 + 1 & 0x3;
						@Pc(469) Class1_Sub1_Sub1 local469;
						if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
							local469 = local54.method294(2, arg6 + 4, local9, local19, local31, local41, -1);
							local479 = local54.method294(2, local450, local9, local19, local31, local41, -1);
						} else {
							local469 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 2, local31, arg6 + 4, local19);
							local479 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 2, local31, local450, local19);
						}
						arg7.method538(local51, anInt168, arg5, arg1, anIntArray25[local450], anIntArray25[arg6], local479, local80, arg9, local469, local66);
						if (local54.aBoolean131) {
							arg4.method421(arg6, arg9, arg3, arg5, local54.aBoolean132);
						}
					} else if (arg3 == 3) {
						if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
							local108 = local54.method294(3, arg6, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 3, local31, arg6, local19);
						}
						arg7.method538(local51, anInt168, arg5, arg1, 0, anIntArray26[arg6], null, local80, arg9, local108, local66);
						if (local54.aBoolean131) {
							arg4.method421(arg6, arg9, arg3, arg5, local54.aBoolean132);
						}
					} else if (arg3 == 9) {
						if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
							local108 = local54.method294(arg3, arg6, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, arg3, local31, arg6, local19);
						}
						arg7.method540(local51, 1, local108, arg5, 1, 0, arg1, local66, arg9, local80);
						if (local54.aBoolean131) {
							arg4.method422(local54.anInt502, local54.anInt503, local54.aBoolean132, arg9, arg6, arg5);
						}
					} else {
						if (local54.aBoolean134) {
							if (arg6 == 1) {
								local450 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local450;
							} else if (arg6 == 2) {
								local450 = local41;
								local41 = local19;
								local19 = local450;
								local450 = local31;
								local31 = local9;
								local9 = local450;
							} else if (arg6 == 3) {
								local450 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local450;
							}
						}
						if (arg3 == 4) {
							if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
								local108 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 4, local31, 0, local19);
							}
							arg7.method539(local66, 0, anIntArray25[arg6], arg6 * 512, arg5, local51, arg1, 0, arg9, local108, local80);
						} else if (arg3 == 5) {
							local450 = 16;
							local204 = arg7.method556(arg1, arg5, arg9);
							if (local204 > 0) {
								local450 = Class9.method288(local204 >> 14 & 0x7FFF).anInt505;
							}
							if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
								local479 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local479 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 4, local31, 0, local19);
							}
							arg7.method539(local66, anIntArray27[arg6] * local450, anIntArray25[arg6], arg6 * 512, arg5, local51, arg1, anIntArray28[arg6] * local450, arg9, local479, local80);
						} else if (arg3 == 6) {
							if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
								local108 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 4, local31, 0, local19);
							}
							arg7.method539(local66, 0, 256, arg6, arg5, local51, arg1, 0, arg9, local108, local80);
						} else if (arg3 == 7) {
							if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
								local108 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 4, local31, 0, local19);
							}
							arg7.method539(local66, 0, 512, arg6, arg5, local51, arg1, 0, arg9, local108, local80);
						} else if (arg3 == 8) {
							if (local54.anInt504 == -1 && local54.anIntArray160 == null) {
								local108 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub2(-7033, arg8, local9, true, local41, local54.anInt504, 4, local31, 0, local19);
							}
							arg7.method539(local66, 0, 768, arg6, arg5, local51, arg1, 0, arg9, local108, local80);
						}
					}
				}
			}
		} catch (@Pc(1018) RuntimeException local1018) {
			signlink.reporterror("53923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1018.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[BZII[[[I)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			this.anInt173 = arg3;
			this.anInt174 = arg2;
			this.anIntArrayArrayArray3 = arg4;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt173][this.anInt174];
			this.anIntArrayArrayArray4 = new int[4][this.anInt173 + 1][this.anInt174 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArrayArray2 = new int[this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArray20 = new int[this.anInt174];
			this.anIntArray21 = new int[this.anInt174];
			this.anIntArray22 = new int[this.anInt174];
			this.anIntArray23 = new int[this.anInt174];
			this.anIntArray24 = new int[this.anInt174];
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("11650, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZI)V")
	public void method56(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + 64; local3++) {
				for (local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt173 && local3 >= 0 && local3 < this.anInt174) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt173 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg2 + 64 && local3 < this.anInt174 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
			if (arg1) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("1621, " + 64 + ", " + arg0 + ", " + 64 + ", " + arg1 + ", " + arg2 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIII)V")
	public void method57(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, aBoolean32);
			@Pc(17) int local17;
			if (this.anInt170 > 0 || this.anInt170 < 0) {
				for (local17 = 1; local17 > 0; local17++) {
				}
			}
			for (local17 = 0; local17 < 4; local17++) {
				for (@Pc(28) int local28 = 0; local28 < 64; local28++) {
					for (@Pc(32) int local32 = 0; local32 < 64; local32++) {
						@Pc(38) int local38 = local28 + arg4;
						@Pc(42) int local42 = local32 + arg1;
						@Pc(64) int local64;
						if (local38 >= 0 && local38 < 104 && local42 >= 0 && local42 < 104) {
							this.aByteArrayArrayArray1[local17][local38][local42] = 0;
							while (true) {
								local64 = local7.method480();
								if (local64 == 0) {
									if (local17 == 0) {
										this.anIntArrayArrayArray3[0][local38][local42] = -method64(local38 + arg3 + 932731, local42 + 556238 + arg2) * 8;
									} else {
										this.anIntArrayArrayArray3[local17][local38][local42] = this.anIntArrayArrayArray3[local17 - 1][local38][local42] - 240;
									}
									break;
								}
								if (local64 == 1) {
									@Pc(120) int local120 = local7.method480();
									if (local120 == 1) {
										local120 = 0;
									}
									if (local17 == 0) {
										this.anIntArrayArrayArray3[0][local38][local42] = -local120 * 8;
									} else {
										this.anIntArrayArrayArray3[local17][local38][local42] = this.anIntArrayArrayArray3[local17 - 1][local38][local42] - local120 * 8;
									}
									break;
								}
								if (local64 <= 49) {
									this.aByteArrayArrayArray3[local17][local38][local42] = local7.method481();
									this.aByteArrayArrayArray4[local17][local38][local42] = (byte) ((local64 - 2) / 4);
									this.aByteArrayArrayArray5[local17][local38][local42] = (byte) (local64 - 2 & 0x3);
								} else if (local64 <= 81) {
									this.aByteArrayArrayArray1[local17][local38][local42] = (byte) (local64 - 49);
								} else {
									this.aByteArrayArrayArray2[local17][local38][local42] = (byte) (local64 - 81);
								}
							}
						} else {
							while (true) {
								local64 = local7.method480();
								if (local64 == 0) {
									break;
								}
								if (local64 == 1) {
									local7.method480();
									break;
								}
								if (local64 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("52403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;[BIII[Lclient!jc;)V")
	public void method60(@OriginalArg(0) Class37 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, aBoolean32);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(17) int local17 = local7.method494();
				if (local17 == 0) {
					return;
				}
				local9 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local7.method494();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local7.method480();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					@Pc(65) int local65 = local46 + arg2;
					@Pc(69) int local69 = local40 + arg3;
					if (local65 > 0 && local69 > 0 && local65 < 103 && local69 < 103) {
						@Pc(81) int local81 = local50;
						if ((this.aByteArrayArrayArray1[1][local65][local69] & 0x2) == 2) {
							local81 = local50 - 1;
						}
						@Pc(96) Class19 local96 = null;
						if (local81 >= 0) {
							local96 = arg4[local81];
						}
						this.method61(local9, local96, arg0, local69, local61, local57, local50, local65);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("6815, " + arg0 + ", " + arg1 + ", " + -808 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!jc;Lclient!r;ZIIIII)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean35) {
				if ((this.aByteArrayArrayArray1[arg6][arg7][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg3, arg7, arg6) != anInt172) {
					return;
				}
			}
			@Pc(43) int local43 = this.anIntArrayArrayArray3[arg6][arg7][arg3];
			@Pc(54) int local54 = this.anIntArrayArrayArray3[arg6][arg7 + 1][arg3];
			@Pc(67) int local67 = this.anIntArrayArrayArray3[arg6][arg7 + 1][arg3 + 1];
			@Pc(78) int local78 = this.anIntArrayArrayArray3[arg6][arg7][arg3 + 1];
			@Pc(88) int local88 = local43 + local54 + local67 + local78 >> 2;
			@Pc(91) Class9 local91 = Class9.method288(arg0);
			@Pc(103) int local103 = arg7 + (arg3 << 7) + (arg0 << 14) + 1073741824;
			if (!local91.aBoolean133) {
				local103 += Integer.MIN_VALUE;
			}
			@Pc(117) byte local117 = (byte) ((arg4 << 6) + arg5);
			@Pc(146) Class1_Sub1_Sub1 local146;
			if (arg5 != 22) {
				@Pc(244) int local244;
				if (arg5 == 10 || arg5 == 11) {
					if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
						local146 = local91.method294(10, arg4, local43, local54, local67, local78, -1);
					} else {
						local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 10, local67, arg4, local54);
					}
					if (local146 != null) {
						@Pc(231) int local231 = 0;
						if (arg5 == 11) {
							local231 += 256;
						}
						@Pc(247) int local247;
						if (arg4 == 1 || arg4 == 3) {
							local244 = local91.anInt503;
							local247 = local91.anInt502;
						} else {
							local244 = local91.anInt502;
							local247 = local91.anInt503;
						}
						if (arg2.method540(local88, local244, local146, arg7, local247, local231, arg6, local103, arg3, local117) && local91.aBoolean138) {
							@Pc(278) Class1_Sub1_Sub1_Sub5 local278;
							if (local146 instanceof Class1_Sub1_Sub1_Sub5) {
								local278 = (Class1_Sub1_Sub1_Sub5) local146;
							} else {
								local278 = local91.method294(10, arg4, local43, local54, local67, local78, -1);
							}
							if (local278 != null) {
								for (@Pc(294) int local294 = 0; local294 <= local244; local294++) {
									for (@Pc(298) int local298 = 0; local298 <= local247; local298++) {
										@Pc(305) int local305 = local278.anInt486 / 4;
										if (local305 > 30) {
											local305 = 30;
										}
										if (local305 > this.aByteArrayArrayArray6[arg6][arg7 + local294][arg3 + local298]) {
											this.aByteArrayArrayArray6[arg6][arg7 + local294][arg3 + local298] = (byte) local305;
										}
									}
								}
							}
						}
					}
					if (local91.aBoolean131 && arg1 != null) {
						arg1.method422(local91.anInt502, local91.anInt503, local91.aBoolean132, arg3, arg4, arg7);
					}
				} else if (arg5 >= 12) {
					if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
						local146 = local91.method294(arg5, arg4, local43, local54, local67, local78, -1);
					} else {
						local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, arg5, local67, arg4, local54);
					}
					arg2.method540(local88, 1, local146, arg7, 1, 0, arg6, local103, arg3, local117);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
						this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x924;
					}
					if (local91.aBoolean131 && arg1 != null) {
						arg1.method422(local91.anInt502, local91.anInt503, local91.aBoolean132, arg3, arg4, arg7);
					}
				} else if (arg5 == 0) {
					if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
						local146 = local91.method294(0, arg4, local43, local54, local67, local78, -1);
					} else {
						local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 0, local67, arg4, local54);
					}
					arg2.method538(local88, anInt168, arg7, arg6, 0, anIntArray25[arg4], null, local117, arg3, local146, local103);
					if (arg4 == 0) {
						if (local91.aBoolean138) {
							this.aByteArrayArrayArray6[arg6][arg7][arg3] = 50;
							this.aByteArrayArrayArray6[arg6][arg7][arg3 + 1] = 50;
						}
						if (local91.aBoolean136) {
							this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x249;
						}
					} else if (arg4 == 1) {
						if (local91.aBoolean138) {
							this.aByteArrayArrayArray6[arg6][arg7][arg3 + 1] = 50;
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3 + 1] = 50;
						}
						if (local91.aBoolean136) {
							this.anIntArrayArrayArray4[arg6][arg7][arg3 + 1] |= 0x492;
						}
					} else if (arg4 == 2) {
						if (local91.aBoolean138) {
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3] = 50;
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3 + 1] = 50;
						}
						if (local91.aBoolean136) {
							this.anIntArrayArrayArray4[arg6][arg7 + 1][arg3] |= 0x249;
						}
					} else if (arg4 == 3) {
						if (local91.aBoolean138) {
							this.aByteArrayArrayArray6[arg6][arg7][arg3] = 50;
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3] = 50;
						}
						if (local91.aBoolean136) {
							this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x492;
						}
					}
					if (local91.aBoolean131 && arg1 != null) {
						arg1.method421(arg4, arg3, arg5, arg7, local91.aBoolean132);
					}
					if (local91.anInt505 != 16) {
						arg2.method546(local91.anInt505, arg6, arg7, arg3);
					}
				} else if (arg5 == 1) {
					if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
						local146 = local91.method294(1, arg4, local43, local54, local67, local78, -1);
					} else {
						local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 1, local67, arg4, local54);
					}
					arg2.method538(local88, anInt168, arg7, arg6, 0, anIntArray26[arg4], null, local117, arg3, local146, local103);
					if (local91.aBoolean138) {
						if (arg4 == 0) {
							this.aByteArrayArrayArray6[arg6][arg7][arg3 + 1] = 50;
						} else if (arg4 == 1) {
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3 + 1] = 50;
						} else if (arg4 == 2) {
							this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3] = 50;
						} else if (arg4 == 3) {
							this.aByteArrayArrayArray6[arg6][arg7][arg3] = 50;
						}
					}
					if (local91.aBoolean131 && arg1 != null) {
						arg1.method421(arg4, arg3, arg5, arg7, local91.aBoolean132);
					}
				} else {
					@Pc(855) int local855;
					@Pc(884) Class1_Sub1_Sub1 local884;
					if (arg5 == 2) {
						local855 = arg4 + 1 & 0x3;
						@Pc(874) Class1_Sub1_Sub1 local874;
						if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
							local874 = local91.method294(2, arg4 + 4, local43, local54, local67, local78, -1);
							local884 = local91.method294(2, local855, local43, local54, local67, local78, -1);
						} else {
							local874 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 2, local67, arg4 + 4, local54);
							local884 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 2, local67, local855, local54);
						}
						arg2.method538(local88, anInt168, arg7, arg6, anIntArray25[local855], anIntArray25[arg4], local884, local117, arg3, local874, local103);
						if (local91.aBoolean136) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg6][arg7][arg3 + 1] |= 0x492;
							} else if (arg4 == 1) {
								this.anIntArrayArrayArray4[arg6][arg7][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg6][arg7 + 1][arg3] |= 0x249;
							} else if (arg4 == 2) {
								this.anIntArrayArrayArray4[arg6][arg7 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x492;
							} else if (arg4 == 3) {
								this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x492;
								this.anIntArrayArrayArray4[arg6][arg7][arg3] |= 0x249;
							}
						}
						if (local91.aBoolean131 && arg1 != null) {
							arg1.method421(arg4, arg3, arg5, arg7, local91.aBoolean132);
						}
						if (local91.anInt505 != 16) {
							arg2.method546(local91.anInt505, arg6, arg7, arg3);
						}
					} else if (arg5 == 3) {
						if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
							local146 = local91.method294(3, arg4, local43, local54, local67, local78, -1);
						} else {
							local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 3, local67, arg4, local54);
						}
						arg2.method538(local88, anInt168, arg7, arg6, 0, anIntArray26[arg4], null, local117, arg3, local146, local103);
						if (local91.aBoolean138) {
							if (arg4 == 0) {
								this.aByteArrayArrayArray6[arg6][arg7][arg3 + 1] = 50;
							} else if (arg4 == 1) {
								this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3 + 1] = 50;
							} else if (arg4 == 2) {
								this.aByteArrayArrayArray6[arg6][arg7 + 1][arg3] = 50;
							} else if (arg4 == 3) {
								this.aByteArrayArrayArray6[arg6][arg7][arg3] = 50;
							}
						}
						if (local91.aBoolean131 && arg1 != null) {
							arg1.method421(arg4, arg3, arg5, arg7, local91.aBoolean132);
						}
					} else if (arg5 == 9) {
						if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
							local146 = local91.method294(arg5, arg4, local43, local54, local67, local78, -1);
						} else {
							local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, arg5, local67, arg4, local54);
						}
						arg2.method540(local88, 1, local146, arg7, 1, 0, arg6, local103, arg3, local117);
						if (local91.aBoolean131 && arg1 != null) {
							arg1.method422(local91.anInt502, local91.anInt503, local91.aBoolean132, arg3, arg4, arg7);
						}
					} else {
						if (local91.aBoolean134) {
							if (arg4 == 1) {
								local855 = local78;
								local78 = local67;
								local67 = local54;
								local54 = local43;
								local43 = local855;
							} else if (arg4 == 2) {
								local855 = local78;
								local78 = local54;
								local54 = local855;
								local855 = local67;
								local67 = local43;
								local43 = local855;
							} else if (arg4 == 3) {
								local855 = local78;
								local78 = local43;
								local43 = local54;
								local54 = local67;
								local67 = local855;
							}
						}
						if (arg5 == 4) {
							if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
								local146 = local91.method294(4, 0, local43, local54, local67, local78, -1);
							} else {
								local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 4, local67, 0, local54);
							}
							arg2.method539(local103, 0, anIntArray25[arg4], arg4 * 512, arg7, local88, arg6, 0, arg3, local146, local117);
						} else if (arg5 == 5) {
							local855 = 16;
							local244 = arg2.method556(arg6, arg7, arg3);
							if (local244 > 0) {
								local855 = Class9.method288(local244 >> 14 & 0x7FFF).anInt505;
							}
							if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
								local884 = local91.method294(4, 0, local43, local54, local67, local78, -1);
							} else {
								local884 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 4, local67, 0, local54);
							}
							arg2.method539(local103, anIntArray27[arg4] * local855, anIntArray25[arg4], arg4 * 512, arg7, local88, arg6, anIntArray28[arg4] * local855, arg3, local884, local117);
						} else if (arg5 == 6) {
							if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
								local146 = local91.method294(4, 0, local43, local54, local67, local78, -1);
							} else {
								local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 4, local67, 0, local54);
							}
							arg2.method539(local103, 0, 256, arg4, arg7, local88, arg6, 0, arg3, local146, local117);
						} else if (arg5 == 7) {
							if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
								local146 = local91.method294(4, 0, local43, local54, local67, local78, -1);
							} else {
								local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 4, local67, 0, local54);
							}
							arg2.method539(local103, 0, 512, arg4, arg7, local88, arg6, 0, arg3, local146, local117);
						} else if (arg5 == 8) {
							if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
								local146 = local91.method294(4, 0, local43, local54, local67, local78, -1);
							} else {
								local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 4, local67, 0, local54);
							}
							arg2.method539(local103, 0, 768, arg4, arg7, local88, arg6, 0, arg3, local146, local117);
						}
					}
				}
			} else if (!aBoolean35 || local91.aBoolean133 || local91.aBoolean139) {
				if (local91.anInt504 == -1 && local91.anIntArray160 == null) {
					local146 = local91.method294(22, arg4, local43, local54, local67, local78, -1);
				} else {
					local146 = new Class1_Sub1_Sub1_Sub2(-7033, arg0, local43, true, local78, local91.anInt504, 22, local67, arg4, local54);
				}
				arg2.method536(arg3, local146, arg6, local103, local88, arg7, local117);
				if (local91.aBoolean131 && local91.aBoolean133 && arg1 != null) {
					arg1.method423(arg7, arg3);
				}
			}
		} catch (@Pc(1629) RuntimeException local1629) {
			signlink.reporterror("62306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1629.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[Lclient!jc;Lclient!r;)V")
	public void method62(@OriginalArg(1) Class19[] arg0, @OriginalArg(2) Class37 arg1) {
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
								arg0[local27].method423(local7, local11);
							}
						}
					}
				}
			}
			anInt175 += (int) (Math.random() * 5.0D) - 2;
			if (anInt175 < -8) {
				anInt175 = -8;
			}
			if (anInt175 > 8) {
				anInt175 = 8;
			}
			anInt176 += (int) (Math.random() * 5.0D) - 2;
			if (anInt176 < -16) {
				anInt176 = -16;
			}
			if (anInt176 > 16) {
				anInt176 = 16;
			}
			@Pc(136) int local136;
			@Pc(142) int local142;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(172) int local172;
			@Pc(194) int local194;
			@Pc(207) int local207;
			@Pc(213) int local213;
			@Pc(217) int local217;
			@Pc(223) int local223;
			@Pc(239) int local239;
			@Pc(287) int local287;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(111) byte[][] local111 = this.aByteArrayArrayArray6[local7];
				local136 = (int) Math.sqrt((double) 5100);
				local142 = local136 * 768 >> 8;
				for (local144 = 1; local144 < this.anInt174 - 1; local144++) {
					for (local148 = 1; local148 < this.anInt173 - 1; local148++) {
						local172 = this.anIntArrayArrayArray3[local7][local148 + 1][local144] - this.anIntArrayArrayArray3[local7][local148 - 1][local144];
						local194 = this.anIntArrayArrayArray3[local7][local148][local144 + 1] - this.anIntArrayArrayArray3[local7][local148][local144 - 1];
						local207 = (int) Math.sqrt((double) (local172 * local172 + local194 * local194 + 65536));
						local213 = (local172 << 8) / local207;
						local217 = 65536 / local207;
						local223 = (local194 << 8) / local207;
						local239 = (local213 * -50 + local217 * -10 + local223 * -50) / local142 + 96;
						local287 = (local111[local148 - 1][local144] >> 2) + (local111[local148 + 1][local144] >> 3) + (local111[local148][local144 - 1] >> 2) + (local111[local148][local144 + 1] >> 3) + (local111[local148][local144] >> 1);
						this.anIntArrayArray2[local148][local144] = local239 - local287;
					}
				}
				for (local148 = 0; local148 < this.anInt174; local148++) {
					this.anIntArray20[local148] = 0;
					this.anIntArray21[local148] = 0;
					this.anIntArray22[local148] = 0;
					this.anIntArray23[local148] = 0;
					this.anIntArray24[local148] = 0;
				}
				for (local172 = -5; local172 < this.anInt173 + 5; local172++) {
					for (local194 = 0; local194 < this.anInt174; local194++) {
						local207 = local172 + 5;
						@Pc(422) int local422;
						if (local207 >= 0 && local207 < this.anInt173) {
							local213 = this.aByteArrayArrayArray2[local7][local207][local194] & 0xFF;
							if (local213 > 0) {
								@Pc(381) Class21 local381 = Class21.aClass21Array1[local213 - 1];
								this.anIntArray20[local194] += local381.anInt707;
								this.anIntArray21[local194] += local381.anInt705;
								this.anIntArray22[local194] += local381.anInt706;
								this.anIntArray23[local194] += local381.anInt708;
								local422 = this.anIntArray24[local194]++;
							}
						}
						local213 = local172 - 5;
						if (local213 >= 0 && local213 < this.anInt173) {
							local217 = this.aByteArrayArrayArray2[local7][local213][local194] & 0xFF;
							if (local217 > 0) {
								@Pc(454) Class21 local454 = Class21.aClass21Array1[local217 - 1];
								this.anIntArray20[local194] -= local454.anInt707;
								this.anIntArray21[local194] -= local454.anInt705;
								this.anIntArray22[local194] -= local454.anInt706;
								this.anIntArray23[local194] -= local454.anInt708;
								local422 = this.anIntArray24[local194]--;
							}
						}
					}
					if (local172 >= 1 && local172 < this.anInt173 - 1) {
						local207 = 0;
						local213 = 0;
						local217 = 0;
						local223 = 0;
						local239 = 0;
						for (local287 = -5; local287 < this.anInt174 + 5; local287++) {
							@Pc(530) int local530 = local287 + 5;
							if (local530 >= 0 && local530 < this.anInt174) {
								local207 += this.anIntArray20[local530];
								local213 += this.anIntArray21[local530];
								local217 += this.anIntArray22[local530];
								local223 += this.anIntArray23[local530];
								local239 += this.anIntArray24[local530];
							}
							@Pc(575) int local575 = local287 - 5;
							if (local575 >= 0 && local575 < this.anInt174) {
								local207 -= this.anIntArray20[local575];
								local213 -= this.anIntArray21[local575];
								local217 -= this.anIntArray22[local575];
								local223 -= this.anIntArray23[local575];
								local239 -= this.anIntArray24[local575];
							}
							if (local287 >= 1 && local287 < this.anInt174 - 1 && (!aBoolean35 || (this.aByteArrayArrayArray1[local7][local172][local287] & 0x10) == 0 && this.method63(local287, local172, local7) == anInt172)) {
								@Pc(658) int local658 = this.aByteArrayArrayArray2[local7][local172][local287] & 0xFF;
								@Pc(669) int local669 = this.aByteArrayArrayArray3[local7][local172][local287] & 0xFF;
								if (local658 > 0 || local669 > 0) {
									@Pc(682) int local682 = this.anIntArrayArrayArray3[local7][local172][local287];
									@Pc(693) int local693 = this.anIntArrayArrayArray3[local7][local172 + 1][local287];
									@Pc(706) int local706 = this.anIntArrayArrayArray3[local7][local172 + 1][local287 + 1];
									@Pc(717) int local717 = this.anIntArrayArrayArray3[local7][local172][local287 + 1];
									@Pc(724) int local724 = this.anIntArrayArray2[local172][local287];
									@Pc(733) int local733 = this.anIntArrayArray2[local172 + 1][local287];
									@Pc(744) int local744 = this.anIntArrayArray2[local172 + 1][local287 + 1];
									@Pc(753) int local753 = this.anIntArrayArray2[local172][local287 + 1];
									@Pc(755) int local755 = -1;
									@Pc(757) int local757 = -1;
									@Pc(765) int local765;
									@Pc(769) int local769;
									if (local658 > 0) {
										local765 = local207 * 256 / local223;
										local769 = local213 / local239;
										@Pc(773) int local773 = local217 / local239;
										local755 = this.method71(local765, local769, local773);
										@Pc(785) int local785 = local765 + anInt175 & 0xFF;
										local773 += anInt176;
										if (local773 < 0) {
											local773 = 0;
										} else if (local773 > 255) {
											local773 = 255;
										}
										local757 = this.method71(local785, local769, local773);
									}
									if (local7 > 0) {
										@Pc(810) boolean local810 = true;
										if (local658 == 0 && this.aByteArrayArrayArray4[local7][local172][local287] != 0) {
											local810 = false;
										}
										if (local669 > 0 && !Class21.aClass21Array1[local669 - 1].aBoolean196) {
											local810 = false;
										}
										if (local810 && local682 == local693 && local682 == local706 && local682 == local717) {
											this.anIntArrayArrayArray4[local7][local172][local287] |= 0x924;
										}
									}
									local765 = 0;
									if (local755 != -1) {
										local765 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local757, 96)];
									}
									if (local669 == 0) {
										arg1.method535(local7, local172, local287, 0, 0, -1, local682, local693, local706, local717, method69(local755, local724), method69(local755, local733), method69(local755, local744), method69(local755, local753), 0, 0, 0, 0, local765, 0);
									} else {
										local769 = this.aByteArrayArrayArray4[local7][local172][local287] + 1;
										@Pc(922) byte local922 = this.aByteArrayArrayArray5[local7][local172][local287];
										@Pc(928) Class21 local928 = Class21.aClass21Array1[local669 - 1];
										@Pc(931) int local931 = local928.anInt703;
										@Pc(939) int local939;
										@Pc(937) int local937;
										if (local931 >= 0) {
											local937 = Class1_Sub1_Sub2_Sub1.method348((byte) 7, local931);
											local939 = -1;
										} else if (local928.anInt702 == 16711935) {
											local937 = 0;
											local939 = -2;
											local931 = -1;
										} else {
											local939 = this.method71(local928.anInt704, local928.anInt705, local928.anInt706);
											local937 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local928.anInt709, 96)];
										}
										arg1.method535(local7, local172, local287, local769, local922, local931, local682, local693, local706, local717, method69(local755, local724), method69(local755, local733), method69(local755, local744), method69(local755, local753), this.method70(local939, local724), this.method70(local939, local733), this.method70(local939, local744), this.method70(local939, local753), local765, local937);
									}
								}
							}
						}
					}
				}
				for (local194 = 1; local194 < this.anInt174 - 1; local194++) {
					for (local207 = 1; local207 < this.anInt173 - 1; local207++) {
						arg1.method534(local7, local207, local194, this.method63(local194, local207, local7));
					}
				}
			}
			arg1.method561(aBoolean33);
			for (local11 = 0; local11 < this.anInt173; local11++) {
				for (local27 = 0; local27 < this.anInt174; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method532(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1110) int local1110 = 2;
			@Pc(1112) int local1112 = 4;
			for (@Pc(1114) int local1114 = 0; local1114 < 4; local1114++) {
				if (local1114 > 0) {
					local27 <<= 0x3;
					local1110 <<= 0x3;
					local1112 <<= 0x3;
				}
				for (@Pc(1132) int local1132 = 0; local1132 <= local1114; local1132++) {
					for (local136 = 0; local136 <= this.anInt174; local136++) {
						for (local142 = 0; local142 <= this.anInt173; local142++) {
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local27) != 0) {
								local144 = local136;
								local148 = local136;
								local172 = local1132;
								local194 = local1132;
								while (local144 > 0 && (this.anIntArrayArrayArray4[local1132][local142][local144 - 1] & local27) != 0) {
									local144--;
								}
								while (local148 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local142][local148 + 1] & local27) != 0) {
									local148++;
								}
								label324: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local172 - 1][local142][local207] & local27) == 0) {
											break label324;
										}
									}
									local172--;
								}
								label313: while (local194 < local1114) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local194 + 1][local142][local207] & local27) == 0) {
											break label313;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray3[local194][local142][local144] - 240;
									local223 = this.anIntArrayArrayArray3[local172][local142][local144];
									Class37.method533(local217, local1114, local148 * 128 + 128, local144 * 128, local142 * 128, local142 * 128, local223, 1);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray4[local239][local142][local287] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local1110) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local1132;
								local194 = local1132;
								while (local144 > 0 && (this.anIntArrayArrayArray4[local1132][local144 - 1][local136] & local1110) != 0) {
									local144--;
								}
								while (local148 < this.anInt173 && (this.anIntArrayArrayArray4[local1132][local148 + 1][local136] & local1110) != 0) {
									local148++;
								}
								label377: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local172 - 1][local207][local136] & local1110) == 0) {
											break label377;
										}
									}
									local172--;
								}
								label366: while (local194 < local1114) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local194 + 1][local207][local136] & local1110) == 0) {
											break label366;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray3[local194][local144][local136] - 240;
									local223 = this.anIntArrayArrayArray3[local172][local144][local136];
									Class37.method533(local217, local1114, local136 * 128, local136 * 128, local148 * 128 + 128, local144 * 128, local223, 2);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray4[local239][local287][local136] &= ~local1110;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local1112) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local136;
								local194 = local136;
								while (local172 > 0 && (this.anIntArrayArrayArray4[local1132][local142][local172 - 1] & local1112) != 0) {
									local172--;
								}
								while (local194 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local142][local194 + 1] & local1112) != 0) {
									local194++;
								}
								label430: while (local144 > 0) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray4[local1132][local144 - 1][local207] & local1112) == 0) {
											break label430;
										}
									}
									local144--;
								}
								label419: while (local148 < this.anInt173) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray4[local1132][local148 + 1][local207] & local1112) == 0) {
											break label419;
										}
									}
									local148++;
								}
								if ((local148 + 1 - local144) * (local194 + 1 - local172) >= 4) {
									local207 = this.anIntArrayArrayArray3[local1132][local144][local172];
									Class37.method533(local207, local1114, local194 * 128 + 128, local172 * 128, local148 * 128 + 128, local144 * 128, local207, 4);
									for (local213 = local144; local213 <= local148; local213++) {
										for (local217 = local172; local217 <= local194; local217++) {
											this.anIntArrayArrayArray4[local1132][local213][local217] &= ~local1112;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1747) RuntimeException local1747) {
			signlink.reporterror("62059, " + true + ", " + arg0 + ", " + arg1 + ", " + local1747.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("58925, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local41.toString());
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
