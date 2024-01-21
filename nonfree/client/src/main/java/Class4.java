import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private static boolean aBoolean32;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt169 = -702;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt171 = 8;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt175 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt176 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt170 = 5;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

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
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ[BI)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg1, 58);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method494();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
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
						@Pc(72) int local72 = local63 + arg0;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method288(local11);
							if (local68 != 22 || !aBoolean33 || local89.aBoolean125 || local89.aBoolean131) {
								local3 &= local89.method292(853);
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
			signlink.reporterror("90561, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ub;ZLclient!lb;)V")
	public static void method59(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = arg1.method494();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(24) Class9 local24 = Class9.method288(local12);
				local24.method293(arg0);
				while (true) {
					@Pc(31) int local31 = arg1.method494();
					if (local31 == 0) {
						break;
					}
					arg1.method480();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("73805, " + arg0 + ", " + false + ", " + arg1 + ", " + local42.toString());
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
	public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (anInt171 > 8 || anInt171 < 8) {
				anInt169 = 95;
			}
			@Pc(10) Class9 local10 = Class9.method288(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local10.method291(arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93257, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!jc;IIII[[[IBIIILclient!r;)V")
	public static void method73(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class37 arg9) {
		try {
			@Pc(9) int local9 = arg5[arg4][arg6][arg7];
			@Pc(19) int local19 = arg5[arg4][arg6 + 1][arg7];
			@Pc(31) int local31 = arg5[arg4][arg6 + 1][arg7 + 1];
			@Pc(41) int local41 = arg5[arg4][arg6][arg7 + 1];
			@Pc(60) int local60 = local9 + local19 + local31 + local41 >> 2;
			@Pc(63) Class9 local63 = Class9.method288(arg2);
			@Pc(75) int local75 = arg6 + (arg7 << 7) + (arg2 << 14) + 1073741824;
			if (!local63.aBoolean125) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg3 << 6) + arg8);
			@Pc(109) Class1_Sub1_Sub1 local109;
			if (arg8 == 22) {
				if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
					local109 = local63.method294(22, arg3, local9, local19, local31, local41, -1);
				} else {
					local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, 22, local41, arg2);
				}
				arg9.method536(arg1, arg6, arg7, local109, local89, local75, local60);
				if (local63.aBoolean123 && local63.aBoolean125) {
					arg0.method423(arg7, arg6);
				}
			} else {
				@Pc(205) int local205;
				if (arg8 == 10 || arg8 == 11) {
					if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method294(10, arg3, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, 10, local41, arg2);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg8 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg3 == 1 || arg3 == 3) {
							local205 = local63.anInt514;
							local208 = local63.anInt513;
						} else {
							local205 = local63.anInt513;
							local208 = local63.anInt514;
						}
						arg9.method540(local75, local89, arg7, local205, local60, arg1, local208, arg6, local109, local192);
					}
					if (local63.aBoolean123) {
						arg0.method422(arg3, arg6, local63.aBoolean124, arg7, local63.anInt513, local63.anInt514);
					}
				} else if (arg8 >= 12) {
					if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method294(arg8, arg3, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, arg8, local41, arg2);
					}
					arg9.method540(local75, local89, arg7, 1, local60, arg1, 1, arg6, local109, 0);
					if (local63.aBoolean123) {
						arg0.method422(arg3, arg6, local63.aBoolean124, arg7, local63.anInt513, local63.anInt514);
					}
				} else if (arg8 == 0) {
					if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method294(0, arg3, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, 0, local41, arg2);
					}
					arg9.method538(arg6, local109, anIntArray25[arg3], local60, null, arg1, arg7, 0, local75, local89);
					if (local63.aBoolean123) {
						arg0.method421(arg6, local63.aBoolean124, arg8, arg7, arg3);
					}
				} else if (arg8 == 1) {
					if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method294(1, arg3, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, 1, local41, arg2);
					}
					arg9.method538(arg6, local109, anIntArray26[arg3], local60, null, arg1, arg7, 0, local75, local89);
					if (local63.aBoolean123) {
						arg0.method421(arg6, local63.aBoolean124, arg8, arg7, arg3);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class1_Sub1_Sub1 local480;
					if (arg8 == 2) {
						local451 = arg3 + 1 & 0x3;
						@Pc(470) Class1_Sub1_Sub1 local470;
						if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
							local470 = local63.method294(2, arg3 + 4, local9, local19, local31, local41, -1);
							local480 = local63.method294(2, local451, local9, local19, local31, local41, -1);
						} else {
							local470 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3 + 4, local19, 2, local41, arg2);
							local480 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, local451, local19, 2, local41, arg2);
						}
						arg9.method538(arg6, local470, anIntArray25[arg3], local60, local480, arg1, arg7, anIntArray25[local451], local75, local89);
						if (local63.aBoolean123) {
							arg0.method421(arg6, local63.aBoolean124, arg8, arg7, arg3);
						}
					} else if (arg8 == 3) {
						if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
							local109 = local63.method294(3, arg3, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, 3, local41, arg2);
						}
						arg9.method538(arg6, local109, anIntArray26[arg3], local60, null, arg1, arg7, 0, local75, local89);
						if (local63.aBoolean123) {
							arg0.method421(arg6, local63.aBoolean124, arg8, arg7, arg3);
						}
					} else if (arg8 == 9) {
						if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
							local109 = local63.method294(arg8, arg3, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, arg3, local19, arg8, local41, arg2);
						}
						arg9.method540(local75, local89, arg7, 1, local60, arg1, 1, arg6, local109, 0);
						if (local63.aBoolean123) {
							arg0.method422(arg3, arg6, local63.aBoolean124, arg7, local63.anInt513, local63.anInt514);
						}
					} else {
						if (local63.aBoolean126) {
							if (arg3 == 1) {
								local451 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local451;
							} else if (arg3 == 2) {
								local451 = local41;
								local41 = local19;
								local19 = local451;
								local451 = local31;
								local31 = local9;
								local9 = local451;
							} else if (arg3 == 3) {
								local451 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local451;
							}
						}
						if (arg8 == 4) {
							if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, 0, local19, 4, local41, arg2);
							}
							arg9.method539(0, arg7, arg6, arg3 * 512, local60, local75, anIntArray25[arg3], local109, 0, arg1, local89);
						} else if (arg8 == 5) {
							local451 = 16;
							local205 = arg9.method556(arg1, arg6, arg7);
							if (local205 > 0) {
								local451 = Class9.method288(local205 >> 14 & 0x7FFF).anInt516;
							}
							if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
								local480 = local63.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local480 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, 0, local19, 4, local41, arg2);
							}
							arg9.method539(anIntArray27[arg3] * local451, arg7, arg6, arg3 * 512, local60, local75, anIntArray25[arg3], local480, anIntArray28[arg3] * local451, arg1, local89);
						} else if (arg8 == 6) {
							if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, 0, local19, 4, local41, arg2);
							}
							arg9.method539(0, arg7, arg6, arg3, local60, local75, 256, local109, 0, arg1, local89);
						} else if (arg8 == 7) {
							if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, 0, local19, 4, local41, arg2);
							}
							arg9.method539(0, arg7, arg6, arg3, local60, local75, 512, local109, 0, arg1, local89);
						} else if (arg8 == 8) {
							if (local63.anInt515 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(local63.anInt515, local31, -530, local9, true, 0, local19, 4, local41, arg2);
							}
							arg9.method539(0, arg7, arg6, arg3, local60, local75, 768, local109, 0, arg1, local89);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("50127, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -102 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[III[[[B)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			this.anInt173 = arg3;
			this.anInt174 = arg2;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg4;
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
			signlink.reporterror("97892, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		try {
			if (this.anInt170 <= 5 && this.anInt170 >= 5) {
				for (@Pc(12) int local12 = arg0; local12 <= arg0 + 64; local12++) {
					for (@Pc(16) int local16 = arg1; local16 <= arg1 + 64; local16++) {
						if (local16 >= 0 && local16 < this.anInt173 && local12 >= 0 && local12 < this.anInt174) {
							this.aByteArrayArrayArray6[0][local16][local12] = 127;
							if (local16 == arg1 && local16 > 0) {
								this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16 - 1][local12];
							}
							if (local16 == arg1 + 64 && local16 < this.anInt173 - 1) {
								this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16 + 1][local12];
							}
							if (local12 == arg0 && local12 > 0) {
								this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16][local12 - 1];
							}
							if (local12 == arg0 + 64 && local12 < this.anInt174 - 1) {
								this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16][local12 + 1];
							}
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("19351, " + arg0 + ", " + 64 + ", " + 64 + ", " + 5 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIII[B)V")
	public void method57(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, 58);
			for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
				for (@Pc(19) int local19 = 0; local19 < 64; local19++) {
					for (@Pc(23) int local23 = 0; local23 < 64; local23++) {
						@Pc(29) int local29 = local19 + arg2;
						@Pc(33) int local33 = local23 + arg0;
						@Pc(55) int local55;
						if (local29 >= 0 && local29 < 104 && local33 >= 0 && local33 < 104) {
							this.aByteArrayArrayArray1[local15][local29][local33] = 0;
							while (true) {
								local55 = local7.method480();
								if (local55 == 0) {
									if (local15 == 0) {
										this.anIntArrayArrayArray3[0][local29][local33] = -method64(local29 + arg3 + 932731, local33 + 556238 + arg1) * 8;
									} else {
										this.anIntArrayArrayArray3[local15][local29][local33] = this.anIntArrayArrayArray3[local15 - 1][local29][local33] - 240;
									}
									break;
								}
								if (local55 == 1) {
									@Pc(111) int local111 = local7.method480();
									if (local111 == 1) {
										local111 = 0;
									}
									if (local15 == 0) {
										this.anIntArrayArrayArray3[0][local29][local33] = -local111 * 8;
									} else {
										this.anIntArrayArrayArray3[local15][local29][local33] = this.anIntArrayArrayArray3[local15 - 1][local29][local33] - local111 * 8;
									}
									break;
								}
								if (local55 <= 49) {
									this.aByteArrayArrayArray3[local15][local29][local33] = local7.method481();
									this.aByteArrayArrayArray4[local15][local29][local33] = (byte) ((local55 - 2) / 4);
									this.aByteArrayArrayArray5[local15][local29][local33] = (byte) (local55 - 2 & 0x3);
								} else if (local55 <= 81) {
									this.aByteArrayArrayArray1[local15][local29][local33] = (byte) (local55 - 49);
								} else {
									this.aByteArrayArrayArray2[local15][local29][local33] = (byte) (local55 - 81);
								}
							}
						} else {
							while (true) {
								local55 = local7.method480();
								if (local55 == 0) {
									break;
								}
								if (local55 == 1) {
									local7.method480();
									break;
								}
								if (local55 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("63244, " + -12 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B[BI[Lclient!jc;Lclient!r;I)V")
	public void method60(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19[] arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, 58);
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			while (true) {
				@Pc(20) int local20 = local7.method494();
				if (local20 == 0) {
					return;
				}
				local9 += local20;
				@Pc(28) int local28 = 0;
				while (true) {
					@Pc(31) int local31 = local7.method494();
					if (local31 == 0) {
						break;
					}
					local28 += local31 - 1;
					@Pc(43) int local43 = local28 & 0x3F;
					@Pc(49) int local49 = local28 >> 6 & 0x3F;
					@Pc(53) int local53 = local28 >> 12;
					@Pc(56) int local56 = local7.method480();
					@Pc(60) int local60 = local56 >> 2;
					@Pc(64) int local64 = local56 & 0x3;
					@Pc(68) int local68 = local49 + arg5;
					@Pc(72) int local72 = local43 + arg2;
					if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
						@Pc(84) int local84 = local53;
						if ((this.aByteArrayArrayArray1[1][local68][local72] & 0x2) == 2) {
							local84 = local53 - 1;
						}
						@Pc(99) Class19 local99 = null;
						if (local84 >= 0) {
							local99 = arg3[local84];
						}
						this.method61(local9, local72, arg4, local53, local68, local64, local99, local60);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("18445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!r;IIIZLclient!jc;I)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean33) {
				if ((this.aByteArrayArrayArray1[arg3][arg4][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg4, arg3, arg1) != anInt172) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg3][arg4][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg3][arg4 + 1][arg1];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg3][arg4 + 1][arg1 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg3][arg4][arg1 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method288(arg0);
			@Pc(93) int local93 = arg4 + (arg1 << 7) + (arg0 << 14) + 1073741824;
			if (!local81.aBoolean125) {
				local93 += Integer.MIN_VALUE;
			}
			@Pc(107) byte local107 = (byte) ((arg5 << 6) + arg7);
			@Pc(145) Class1_Sub1_Sub1 local145;
			if (arg7 != 22) {
				@Pc(243) int local243;
				if (arg7 == 10 || arg7 == 11) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local145 = local81.method294(10, arg5, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, 10, local68, arg0);
					}
					if (local145 != null) {
						@Pc(230) int local230 = 0;
						if (arg7 == 11) {
							local230 += 256;
						}
						@Pc(246) int local246;
						if (arg5 == 1 || arg5 == 3) {
							local243 = local81.anInt514;
							local246 = local81.anInt513;
						} else {
							local243 = local81.anInt513;
							local246 = local81.anInt514;
						}
						if (arg2.method540(local93, local107, arg1, local243, local78, arg3, local246, arg4, local145, local230) && local81.aBoolean130) {
							@Pc(277) Class1_Sub1_Sub1_Sub5 local277;
							if (local145 instanceof Class1_Sub1_Sub1_Sub5) {
								local277 = (Class1_Sub1_Sub1_Sub5) local145;
							} else {
								local277 = local81.method294(10, arg5, local33, local44, local57, local68, -1);
							}
							if (local277 != null) {
								for (@Pc(293) int local293 = 0; local293 <= local243; local293++) {
									for (@Pc(297) int local297 = 0; local297 <= local246; local297++) {
										@Pc(304) int local304 = local277.anInt497 / 4;
										if (local304 > 30) {
											local304 = 30;
										}
										if (local304 > this.aByteArrayArrayArray6[arg3][arg4 + local293][arg1 + local297]) {
											this.aByteArrayArrayArray6[arg3][arg4 + local293][arg1 + local297] = (byte) local304;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean123 && arg6 != null) {
						arg6.method422(arg5, arg4, local81.aBoolean124, arg1, local81.anInt513, local81.anInt514);
					}
				} else if (arg7 >= 12) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local145 = local81.method294(arg7, arg5, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, arg7, local68, arg0);
					}
					arg2.method540(local93, local107, arg1, 1, local78, arg3, 1, arg4, local145, 0);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x924;
					}
					if (local81.aBoolean123 && arg6 != null) {
						arg6.method422(arg5, arg4, local81.aBoolean124, arg1, local81.anInt513, local81.anInt514);
					}
				} else if (arg7 == 0) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local145 = local81.method294(0, arg5, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, 0, local68, arg0);
					}
					arg2.method538(arg4, local145, anIntArray25[arg5], local78, null, arg3, arg1, 0, local93, local107);
					if (arg5 == 0) {
						if (local81.aBoolean130) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
						}
						if (local81.aBoolean128) {
							this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local81.aBoolean130) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						}
						if (local81.aBoolean128) {
							this.anIntArrayArrayArray4[arg3][arg4][arg1 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local81.aBoolean130) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						}
						if (local81.aBoolean128) {
							this.anIntArrayArrayArray4[arg3][arg4 + 1][arg1] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local81.aBoolean130) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
						}
						if (local81.aBoolean128) {
							this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x492;
						}
					}
					if (local81.aBoolean123 && arg6 != null) {
						arg6.method421(arg4, local81.aBoolean124, arg7, arg1, arg5);
					}
					if (local81.anInt516 != 16) {
						arg2.method546(local81.anInt516, arg3, arg1, arg4);
					}
				} else if (arg7 == 1) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local145 = local81.method294(1, arg5, local33, local44, local57, local68, -1);
					} else {
						local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, 1, local68, arg0);
					}
					arg2.method538(arg4, local145, anIntArray26[arg5], local78, null, arg3, arg1, 0, local93, local107);
					if (local81.aBoolean130) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
						}
					}
					if (local81.aBoolean123 && arg6 != null) {
						arg6.method421(arg4, local81.aBoolean124, arg7, arg1, arg5);
					}
				} else {
					@Pc(854) int local854;
					@Pc(883) Class1_Sub1_Sub1 local883;
					if (arg7 == 2) {
						local854 = arg5 + 1 & 0x3;
						@Pc(873) Class1_Sub1_Sub1 local873;
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local873 = local81.method294(2, arg5 + 4, local33, local44, local57, local68, -1);
							local883 = local81.method294(2, local854, local33, local44, local57, local68, -1);
						} else {
							local873 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5 + 4, local44, 2, local68, arg0);
							local883 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, local854, local44, 2, local68, arg0);
						}
						arg2.method538(arg4, local873, anIntArray25[arg5], local78, local883, arg3, arg1, anIntArray25[local854], local93, local107);
						if (local81.aBoolean128) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg4][arg1 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray4[arg3][arg4][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg4 + 1][arg1] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray4[arg3][arg4 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg4][arg1] |= 0x249;
							}
						}
						if (local81.aBoolean123 && arg6 != null) {
							arg6.method421(arg4, local81.aBoolean124, arg7, arg1, arg5);
						}
						if (local81.anInt516 != 16) {
							arg2.method546(local81.anInt516, arg3, arg1, arg4);
						}
					} else if (arg7 == 3) {
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local145 = local81.method294(3, arg5, local33, local44, local57, local68, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, 3, local68, arg0);
						}
						arg2.method538(arg4, local145, anIntArray26[arg5], local78, null, arg3, arg1, 0, local93, local107);
						if (local81.aBoolean130) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray6[arg3][arg4][arg1 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg1] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray6[arg3][arg4][arg1] = 50;
							}
						}
						if (local81.aBoolean123 && arg6 != null) {
							arg6.method421(arg4, local81.aBoolean124, arg7, arg1, arg5);
						}
					} else if (arg7 == 9) {
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local145 = local81.method294(arg7, arg5, local33, local44, local57, local68, -1);
						} else {
							local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, arg7, local68, arg0);
						}
						arg2.method540(local93, local107, arg1, 1, local78, arg3, 1, arg4, local145, 0);
						if (local81.aBoolean123 && arg6 != null) {
							arg6.method422(arg5, arg4, local81.aBoolean124, arg1, local81.anInt513, local81.anInt514);
						}
					} else {
						if (local81.aBoolean126) {
							if (arg5 == 1) {
								local854 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local854;
							} else if (arg5 == 2) {
								local854 = local68;
								local68 = local44;
								local44 = local854;
								local854 = local57;
								local57 = local33;
								local33 = local854;
							} else if (arg5 == 3) {
								local854 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local854;
							}
						}
						if (arg7 == 4) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local145 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, 0, local44, 4, local68, arg0);
							}
							arg2.method539(0, arg1, arg4, arg5 * 512, local78, local93, anIntArray25[arg5], local145, 0, arg3, local107);
						} else if (arg7 == 5) {
							local854 = 16;
							local243 = arg2.method556(arg3, arg4, arg1);
							if (local243 > 0) {
								local854 = Class9.method288(local243 >> 14 & 0x7FFF).anInt516;
							}
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local883 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local883 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, 0, local44, 4, local68, arg0);
							}
							arg2.method539(anIntArray27[arg5] * local854, arg1, arg4, arg5 * 512, local78, local93, anIntArray25[arg5], local883, anIntArray28[arg5] * local854, arg3, local107);
						} else if (arg7 == 6) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local145 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, 0, local44, 4, local68, arg0);
							}
							arg2.method539(0, arg1, arg4, arg5, local78, local93, 256, local145, 0, arg3, local107);
						} else if (arg7 == 7) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local145 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, 0, local44, 4, local68, arg0);
							}
							arg2.method539(0, arg1, arg4, arg5, local78, local93, 512, local145, 0, arg3, local107);
						} else if (arg7 == 8) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local145 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, 0, local44, 4, local68, arg0);
							}
							arg2.method539(0, arg1, arg4, arg5, local78, local93, 768, local145, 0, arg3, local107);
						}
					}
				}
			} else if (!aBoolean33 || local81.aBoolean125 || local81.aBoolean131) {
				if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
					local145 = local81.method294(22, arg5, local33, local44, local57, local68, -1);
				} else {
					local145 = new Class1_Sub1_Sub1_Sub2(local81.anInt515, local57, -530, local33, true, arg5, local44, 22, local68, arg0);
				}
				arg2.method536(arg3, arg4, arg1, local145, local107, local93, local78);
				if (local81.aBoolean123 && local81.aBoolean125 && arg6 != null) {
					arg6.method423(arg1, arg4);
				}
			}
		} catch (@Pc(1628) RuntimeException local1628) {
			signlink.reporterror("87172, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + local1628.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;I[Lclient!jc;)V")
	public void method62(@OriginalArg(0) Class37 arg0, @OriginalArg(2) Class19[] arg1) {
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
								arg1[local27].method423(local11, local7);
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
			@Pc(142) int local142;
			@Pc(148) int local148;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(178) int local178;
			@Pc(200) int local200;
			@Pc(213) int local213;
			@Pc(219) int local219;
			@Pc(223) int local223;
			@Pc(229) int local229;
			@Pc(245) int local245;
			@Pc(293) int local293;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(117) byte[][] local117 = this.aByteArrayArrayArray6[local7];
				local142 = (int) Math.sqrt((double) 5100);
				local148 = local142 * 768 >> 8;
				for (local150 = 1; local150 < this.anInt174 - 1; local150++) {
					for (local154 = 1; local154 < this.anInt173 - 1; local154++) {
						local178 = this.anIntArrayArrayArray3[local7][local154 + 1][local150] - this.anIntArrayArrayArray3[local7][local154 - 1][local150];
						local200 = this.anIntArrayArrayArray3[local7][local154][local150 + 1] - this.anIntArrayArrayArray3[local7][local154][local150 - 1];
						local213 = (int) Math.sqrt((double) (local178 * local178 + local200 * local200 + 65536));
						local219 = (local178 << 8) / local213;
						local223 = 65536 / local213;
						local229 = (local200 << 8) / local213;
						local245 = (local219 * -50 + local223 * -10 + local229 * -50) / local148 + 96;
						local293 = (local117[local154 - 1][local150] >> 2) + (local117[local154 + 1][local150] >> 3) + (local117[local154][local150 - 1] >> 2) + (local117[local154][local150 + 1] >> 3) + (local117[local154][local150] >> 1);
						this.anIntArrayArray2[local154][local150] = local245 - local293;
					}
				}
				for (local154 = 0; local154 < this.anInt174; local154++) {
					this.anIntArray20[local154] = 0;
					this.anIntArray21[local154] = 0;
					this.anIntArray22[local154] = 0;
					this.anIntArray23[local154] = 0;
					this.anIntArray24[local154] = 0;
				}
				for (local178 = -5; local178 < this.anInt173 + 5; local178++) {
					for (local200 = 0; local200 < this.anInt174; local200++) {
						local213 = local178 + 5;
						@Pc(428) int local428;
						if (local213 >= 0 && local213 < this.anInt173) {
							local219 = this.aByteArrayArrayArray2[local7][local213][local200] & 0xFF;
							if (local219 > 0) {
								@Pc(387) Class21 local387 = Class21.aClass21Array1[local219 - 1];
								this.anIntArray20[local200] += local387.anInt717;
								this.anIntArray21[local200] += local387.anInt715;
								this.anIntArray22[local200] += local387.anInt716;
								this.anIntArray23[local200] += local387.anInt718;
								local428 = this.anIntArray24[local200]++;
							}
						}
						local219 = local178 - 5;
						if (local219 >= 0 && local219 < this.anInt173) {
							local223 = this.aByteArrayArrayArray2[local7][local219][local200] & 0xFF;
							if (local223 > 0) {
								@Pc(460) Class21 local460 = Class21.aClass21Array1[local223 - 1];
								this.anIntArray20[local200] -= local460.anInt717;
								this.anIntArray21[local200] -= local460.anInt715;
								this.anIntArray22[local200] -= local460.anInt716;
								this.anIntArray23[local200] -= local460.anInt718;
								local428 = this.anIntArray24[local200]--;
							}
						}
					}
					if (local178 >= 1 && local178 < this.anInt173 - 1) {
						local213 = 0;
						local219 = 0;
						local223 = 0;
						local229 = 0;
						local245 = 0;
						for (local293 = -5; local293 < this.anInt174 + 5; local293++) {
							@Pc(536) int local536 = local293 + 5;
							if (local536 >= 0 && local536 < this.anInt174) {
								local213 += this.anIntArray20[local536];
								local219 += this.anIntArray21[local536];
								local223 += this.anIntArray22[local536];
								local229 += this.anIntArray23[local536];
								local245 += this.anIntArray24[local536];
							}
							@Pc(581) int local581 = local293 - 5;
							if (local581 >= 0 && local581 < this.anInt174) {
								local213 -= this.anIntArray20[local581];
								local219 -= this.anIntArray21[local581];
								local223 -= this.anIntArray22[local581];
								local229 -= this.anIntArray23[local581];
								local245 -= this.anIntArray24[local581];
							}
							if (local293 >= 1 && local293 < this.anInt174 - 1 && (!aBoolean33 || (this.aByteArrayArrayArray1[local7][local178][local293] & 0x10) == 0 && this.method63(local178, local7, local293) == anInt172)) {
								@Pc(664) int local664 = this.aByteArrayArrayArray2[local7][local178][local293] & 0xFF;
								@Pc(675) int local675 = this.aByteArrayArrayArray3[local7][local178][local293] & 0xFF;
								if (local664 > 0 || local675 > 0) {
									@Pc(688) int local688 = this.anIntArrayArrayArray3[local7][local178][local293];
									@Pc(699) int local699 = this.anIntArrayArrayArray3[local7][local178 + 1][local293];
									@Pc(712) int local712 = this.anIntArrayArrayArray3[local7][local178 + 1][local293 + 1];
									@Pc(723) int local723 = this.anIntArrayArrayArray3[local7][local178][local293 + 1];
									@Pc(730) int local730 = this.anIntArrayArray2[local178][local293];
									@Pc(739) int local739 = this.anIntArrayArray2[local178 + 1][local293];
									@Pc(750) int local750 = this.anIntArrayArray2[local178 + 1][local293 + 1];
									@Pc(759) int local759 = this.anIntArrayArray2[local178][local293 + 1];
									@Pc(761) int local761 = -1;
									@Pc(763) int local763 = -1;
									@Pc(771) int local771;
									@Pc(775) int local775;
									if (local664 > 0) {
										local771 = local213 * 256 / local229;
										local775 = local219 / local245;
										@Pc(779) int local779 = local223 / local245;
										local761 = this.method71(local771, local775, local779);
										@Pc(791) int local791 = local771 + anInt175 & 0xFF;
										local779 += anInt176;
										if (local779 < 0) {
											local779 = 0;
										} else if (local779 > 255) {
											local779 = 255;
										}
										local763 = this.method71(local791, local775, local779);
									}
									if (local7 > 0) {
										@Pc(816) boolean local816 = true;
										if (local664 == 0 && this.aByteArrayArrayArray4[local7][local178][local293] != 0) {
											local816 = false;
										}
										if (local675 > 0 && !Class21.aClass21Array1[local675 - 1].aBoolean181) {
											local816 = false;
										}
										if (local816 && local688 == local699 && local688 == local712 && local688 == local723) {
											this.anIntArrayArrayArray4[local7][local178][local293] |= 0x924;
										}
									}
									local771 = 0;
									if (local761 != -1) {
										local771 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local763, 96)];
									}
									if (local675 == 0) {
										arg0.method535(local7, local178, local293, 0, 0, -1, local688, local699, local712, local723, method69(local761, local730), method69(local761, local739), method69(local761, local750), method69(local761, local759), 0, 0, 0, 0, local771, 0);
									} else {
										local775 = this.aByteArrayArrayArray4[local7][local178][local293] + 1;
										@Pc(928) byte local928 = this.aByteArrayArrayArray5[local7][local178][local293];
										@Pc(934) Class21 local934 = Class21.aClass21Array1[local675 - 1];
										@Pc(937) int local937 = local934.anInt713;
										@Pc(945) int local945;
										@Pc(943) int local943;
										if (local937 >= 0) {
											local943 = Class1_Sub1_Sub2_Sub1.method348(local937);
											local945 = -1;
										} else if (local934.anInt712 == 16711935) {
											local943 = 0;
											local945 = -2;
											local937 = -1;
										} else {
											local945 = this.method71(local934.anInt714, local934.anInt715, local934.anInt716);
											local943 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local934.anInt719, 96)];
										}
										arg0.method535(local7, local178, local293, local775, local928, local937, local688, local699, local712, local723, method69(local761, local730), method69(local761, local739), method69(local761, local750), method69(local761, local759), this.method70(local945, local730), this.method70(local945, local739), this.method70(local945, local750), this.method70(local945, local759), local771, local943);
									}
								}
							}
						}
					}
				}
				for (local200 = 1; local200 < this.anInt174 - 1; local200++) {
					for (local213 = 1; local213 < this.anInt173 - 1; local213++) {
						arg0.method534(local7, local213, local200, this.method63(local213, local7, local200));
					}
				}
			}
			arg0.method561();
			for (local11 = 0; local11 < this.anInt173; local11++) {
				for (local27 = 0; local27 < this.anInt174; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method532(aBoolean32, local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1116) int local1116 = 2;
			@Pc(1118) int local1118 = 4;
			for (@Pc(1120) int local1120 = 0; local1120 < 4; local1120++) {
				if (local1120 > 0) {
					local27 <<= 0x3;
					local1116 <<= 0x3;
					local1118 <<= 0x3;
				}
				for (@Pc(1138) int local1138 = 0; local1138 <= local1120; local1138++) {
					for (local142 = 0; local142 <= this.anInt174; local142++) {
						for (local148 = 0; local148 <= this.anInt173; local148++) {
							if ((this.anIntArrayArrayArray4[local1138][local148][local142] & local27) != 0) {
								local150 = local142;
								local154 = local142;
								local178 = local1138;
								local200 = local1138;
								while (local150 > 0 && (this.anIntArrayArrayArray4[local1138][local148][local150 - 1] & local27) != 0) {
									local150--;
								}
								while (local154 < this.anInt174 && (this.anIntArrayArrayArray4[local1138][local148][local154 + 1] & local27) != 0) {
									local154++;
								}
								label324: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray4[local178 - 1][local148][local213] & local27) == 0) {
											break label324;
										}
									}
									local178--;
								}
								label313: while (local200 < local1120) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray4[local200 + 1][local148][local213] & local27) == 0) {
											break label313;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray3[local200][local148][local150] - 240;
									local229 = this.anIntArrayArrayArray3[local178][local148][local150];
									Class37.method533(local154 * 128 + 128, local148 * 128, local150 * 128, local148 * 128, local1120, local229, local223, 1);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray4[local245][local148][local293] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1138][local148][local142] & local1116) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local1138;
								local200 = local1138;
								while (local150 > 0 && (this.anIntArrayArrayArray4[local1138][local150 - 1][local142] & local1116) != 0) {
									local150--;
								}
								while (local154 < this.anInt173 && (this.anIntArrayArrayArray4[local1138][local154 + 1][local142] & local1116) != 0) {
									local154++;
								}
								label377: while (local178 > 0) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray4[local178 - 1][local213][local142] & local1116) == 0) {
											break label377;
										}
									}
									local178--;
								}
								label366: while (local200 < local1120) {
									for (local213 = local150; local213 <= local154; local213++) {
										if ((this.anIntArrayArrayArray4[local200 + 1][local213][local142] & local1116) == 0) {
											break label366;
										}
									}
									local200++;
								}
								local213 = (local200 + 1 - local178) * (local154 + 1 - local150);
								if (local213 >= 8) {
									local223 = this.anIntArrayArrayArray3[local200][local150][local142] - 240;
									local229 = this.anIntArrayArrayArray3[local178][local150][local142];
									Class37.method533(local142 * 128, local150 * 128, local142 * 128, local154 * 128 + 128, local1120, local229, local223, 2);
									for (local245 = local178; local245 <= local200; local245++) {
										for (local293 = local150; local293 <= local154; local293++) {
											this.anIntArrayArrayArray4[local245][local293][local142] &= ~local1116;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1138][local148][local142] & local1118) != 0) {
								local150 = local148;
								local154 = local148;
								local178 = local142;
								local200 = local142;
								while (local178 > 0 && (this.anIntArrayArrayArray4[local1138][local148][local178 - 1] & local1118) != 0) {
									local178--;
								}
								while (local200 < this.anInt174 && (this.anIntArrayArrayArray4[local1138][local148][local200 + 1] & local1118) != 0) {
									local200++;
								}
								label430: while (local150 > 0) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray4[local1138][local150 - 1][local213] & local1118) == 0) {
											break label430;
										}
									}
									local150--;
								}
								label419: while (local154 < this.anInt173) {
									for (local213 = local178; local213 <= local200; local213++) {
										if ((this.anIntArrayArrayArray4[local1138][local154 + 1][local213] & local1118) == 0) {
											break label419;
										}
									}
									local154++;
								}
								if ((local154 + 1 - local150) * (local200 + 1 - local178) >= 4) {
									local213 = this.anIntArrayArrayArray3[local1138][local150][local178];
									Class37.method533(local200 * 128 + 128, local150 * 128, local178 * 128, local154 * 128 + 128, local1120, local213, local213, 4);
									for (local219 = local150; local219 <= local154; local219++) {
										for (local223 = local178; local223 <= local200; local223++) {
											this.anIntArrayArrayArray4[local1138][local219][local223] &= ~local1118;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1753) RuntimeException local1753) {
			signlink.reporterror("87568, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local1753.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIII)I")
	private int method63(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47349, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
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
