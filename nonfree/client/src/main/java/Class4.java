import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt180;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private static int anInt178 = 1000;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static boolean aBoolean38 = true;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	private static int anInt183 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt184 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BI)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) boolean local7 = false;
			@Pc(13) Class1_Sub1_Sub3 local13 = new Class1_Sub1_Sub3(anInt178, arg2);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local13.method494();
				if (local18 == 0) {
					return local3;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local13.method494();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local13.method480() >> 2;
						@Pc(70) int local70 = local61 + arg3;
						@Pc(74) int local74 = local55 + arg0;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class9 local87 = Class9.method288(local15);
							if (local66 != 22 || !aBoolean38 || local87.aBoolean127 || local87.aBoolean133) {
								local3 &= local87.method292();
								local28 = true;
							}
						}
					}
					local33 = local13.method494();
					if (local33 == 0) {
						break;
					}
					local13.method480();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("85877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;ILclient!ub;)V")
	public static void method59(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class44_Sub1 arg1) {
		try {
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = arg0.method494();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(25) Class9 local25 = Class9.method288(local13);
				local25.method293(arg1);
				while (true) {
					@Pc(32) int local32 = arg0.method494();
					if (local32 == 0) {
						break;
					}
					arg0.method480();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("40455, " + arg0 + ", " + -15495 + ", " + arg1 + ", " + local43.toString());
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
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
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("34085, " + 121 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!r;IILclient!jc;[[[IIII)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg4][arg9][arg0];
			@Pc(19) int local19 = arg6[arg4][arg9 + 1][arg0];
			@Pc(31) int local31 = arg6[arg4][arg9 + 1][arg0 + 1];
			@Pc(41) int local41 = arg6[arg4][arg9][arg0 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method288(arg8);
			@Pc(72) int local72 = arg9 + (arg0 << 7) + (arg8 << 14) + 1073741824;
			if (!local54.aBoolean127) {
				local72 += Integer.MIN_VALUE;
			}
			@Pc(86) byte local86 = (byte) ((arg1 << 6) + arg7);
			@Pc(106) Class1_Sub1_Sub1 local106;
			if (arg7 == 22) {
				if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
					local106 = local54.method294(22, arg1, local9, local19, local31, local41, -1);
				} else {
					local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 22, local54.anInt519, local31, local19, -966, arg1);
				}
				arg3.method536(arg9, arg2, local72, arg0, local86, local51, local106);
				if (local54.aBoolean125 && local54.aBoolean127) {
					arg5.method423(arg0, (byte) 7, arg9);
				}
			} else {
				@Pc(202) int local202;
				if (arg7 == 10 || arg7 == 11) {
					if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
						local106 = local54.method294(10, arg1, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 10, local54.anInt519, local31, local19, -966, arg1);
					}
					if (local106 != null) {
						@Pc(189) int local189 = 0;
						if (arg7 == 11) {
							local189 += 256;
						}
						@Pc(205) int local205;
						if (arg1 == 1 || arg1 == 3) {
							local202 = local54.anInt518;
							local205 = local54.anInt517;
						} else {
							local202 = local54.anInt517;
							local205 = local54.anInt518;
						}
						arg3.method540(arg2, local106, local202, local72, local86, local205, arg0, local51, local189, arg9);
					}
					if (local54.aBoolean125) {
						arg5.method422(arg0, arg1, local54.aBoolean126, local54.anInt518, arg9, local54.anInt517);
					}
				} else if (arg7 >= 12) {
					if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
						local106 = local54.method294(arg7, arg1, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, arg7, local54.anInt519, local31, local19, -966, arg1);
					}
					arg3.method540(arg2, local106, 1, local72, local86, 1, arg0, local51, 0, arg9);
					if (local54.aBoolean125) {
						arg5.method422(arg0, arg1, local54.aBoolean126, local54.anInt518, arg9, local54.anInt517);
					}
				} else if (arg7 == 0) {
					if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
						local106 = local54.method294(0, arg1, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 0, local54.anInt519, local31, local19, -966, arg1);
					}
					arg3.method538(local86, 0, arg0, anIntArray25[arg1], arg2, arg9, local106, null, local51, local72);
					if (local54.aBoolean125) {
						arg5.method421(arg9, local54.aBoolean126, arg7, arg0, arg1);
					}
				} else if (arg7 == 1) {
					if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
						local106 = local54.method294(1, arg1, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 1, local54.anInt519, local31, local19, -966, arg1);
					}
					arg3.method538(local86, 0, arg0, anIntArray26[arg1], arg2, arg9, local106, null, local51, local72);
					if (local54.aBoolean125) {
						arg5.method421(arg9, local54.aBoolean126, arg7, arg0, arg1);
					}
				} else {
					@Pc(448) int local448;
					@Pc(477) Class1_Sub1_Sub1 local477;
					if (arg7 == 2) {
						local448 = arg1 + 1 & 0x3;
						@Pc(467) Class1_Sub1_Sub1 local467;
						if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
							local467 = local54.method294(2, arg1 + 4, local9, local19, local31, local41, -1);
							local477 = local54.method294(2, local448, local9, local19, local31, local41, -1);
						} else {
							local467 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 2, local54.anInt519, local31, local19, -966, arg1 + 4);
							local477 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 2, local54.anInt519, local31, local19, -966, local448);
						}
						arg3.method538(local86, anIntArray25[local448], arg0, anIntArray25[arg1], arg2, arg9, local467, local477, local51, local72);
						if (local54.aBoolean125) {
							arg5.method421(arg9, local54.aBoolean126, arg7, arg0, arg1);
						}
					} else if (arg7 == 3) {
						if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
							local106 = local54.method294(3, arg1, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 3, local54.anInt519, local31, local19, -966, arg1);
						}
						arg3.method538(local86, 0, arg0, anIntArray26[arg1], arg2, arg9, local106, null, local51, local72);
						if (local54.aBoolean125) {
							arg5.method421(arg9, local54.aBoolean126, arg7, arg0, arg1);
						}
					} else if (arg7 == 9) {
						if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
							local106 = local54.method294(arg7, arg1, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, arg7, local54.anInt519, local31, local19, -966, arg1);
						}
						arg3.method540(arg2, local106, 1, local72, local86, 1, arg0, local51, 0, arg9);
						if (local54.aBoolean125) {
							arg5.method422(arg0, arg1, local54.aBoolean126, local54.anInt518, arg9, local54.anInt517);
						}
					} else {
						if (local54.aBoolean128) {
							if (arg1 == 1) {
								local448 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local448;
							} else if (arg1 == 2) {
								local448 = local41;
								local41 = local19;
								local19 = local448;
								local448 = local31;
								local31 = local9;
								local9 = local448;
							} else if (arg1 == 3) {
								local448 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local448;
							}
						}
						if (arg7 == 4) {
							if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
								local106 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 4, local54.anInt519, local31, local19, -966, 0);
							}
							arg3.method539(local86, 0, arg9, arg1 * 512, anIntArray25[arg1], arg2, 0, local51, local72, arg0, local106);
						} else if (arg7 == 5) {
							local448 = 16;
							local202 = arg3.method556(arg2, arg9, arg0);
							if (local202 > 0) {
								local448 = Class9.method288(local202 >> 14 & 0x7FFF).anInt520;
							}
							if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
								local477 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local477 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 4, local54.anInt519, local31, local19, -966, 0);
							}
							arg3.method539(local86, anIntArray27[arg1] * local448, arg9, arg1 * 512, anIntArray25[arg1], arg2, anIntArray28[arg1] * local448, local51, local72, arg0, local477);
						} else if (arg7 == 6) {
							if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
								local106 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 4, local54.anInt519, local31, local19, -966, 0);
							}
							arg3.method539(local86, 0, arg9, arg1, 256, arg2, 0, local51, local72, arg0, local106);
						} else if (arg7 == 7) {
							if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
								local106 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 4, local54.anInt519, local31, local19, -966, 0);
							}
							arg3.method539(local86, 0, arg9, arg1, 512, arg2, 0, local51, local72, arg0, local106);
						} else if (arg7 == 8) {
							if (local54.anInt519 == -1 && local54.anIntArray160 == null) {
								local106 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class1_Sub1_Sub1_Sub2(arg8, true, local41, local9, 4, local54.anInt519, local31, local19, -966, 0);
							}
							arg3.method539(local86, 0, arg9, arg1, 768, arg2, 0, local51, local72, arg0, local106);
						}
					}
				}
			}
		} catch (@Pc(1016) RuntimeException local1016) {
			signlink.reporterror("93516, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -600 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1016.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[BII[[[II)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt181 = arg1;
			this.anInt182 = arg2;
			this.anIntArrayArrayArray3 = arg3;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt181][this.anInt182];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt181][this.anInt182];
			this.anIntArrayArrayArray4 = new int[4][this.anInt181 + 1][this.anInt182 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt181 + 1][this.anInt182 + 1];
			this.anIntArrayArray2 = new int[this.anInt181 + 1][this.anInt182 + 1];
			this.anIntArray20 = new int[this.anInt182];
			this.anIntArray21 = new int[this.anInt182];
			this.anIntArray22 = new int[this.anInt182];
			this.anIntArray23 = new int[this.anInt182];
			this.anIntArray24 = new int[this.anInt182];
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("3360, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt181 && local3 >= 0 && local3 < this.anInt182) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt181 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt182 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("82523, " + arg0 + ", " + arg1 + ", " + 64 + ", " + 3 + ", " + 64 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BIII)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(anInt178, arg2);
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
					for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
						@Pc(27) int local27 = local17 + arg4;
						@Pc(31) int local31 = local21 + arg5;
						@Pc(53) int local53;
						if (local27 >= 0 && local27 < 104 && local31 >= 0 && local31 < 104) {
							this.aByteArrayArrayArray1[local13][local27][local31] = 0;
							while (true) {
								local53 = local11.method480();
								if (local53 == 0) {
									if (local13 == 0) {
										this.anIntArrayArrayArray3[0][local27][local31] = -method64(local27 + arg3 + 932731, local31 + 556238 + arg0) * 8;
									} else {
										this.anIntArrayArrayArray3[local13][local27][local31] = this.anIntArrayArrayArray3[local13 - 1][local27][local31] - 240;
									}
									break;
								}
								if (local53 == 1) {
									@Pc(109) int local109 = local11.method480();
									if (local109 == 1) {
										local109 = 0;
									}
									if (local13 == 0) {
										this.anIntArrayArrayArray3[0][local27][local31] = -local109 * 8;
									} else {
										this.anIntArrayArrayArray3[local13][local27][local31] = this.anIntArrayArrayArray3[local13 - 1][local27][local31] - local109 * 8;
									}
									break;
								}
								if (local53 <= 49) {
									this.aByteArrayArrayArray3[local13][local27][local31] = local11.method481();
									this.aByteArrayArrayArray4[local13][local27][local31] = (byte) ((local53 - 2) / 4);
									this.aByteArrayArrayArray5[local13][local27][local31] = (byte) (local53 - 2 & 0x3);
								} else if (local53 <= 81) {
									this.aByteArrayArrayArray1[local13][local27][local31] = (byte) (local53 - 49);
								} else {
									this.aByteArrayArrayArray2[local13][local27][local31] = (byte) (local53 - 81);
								}
							}
						} else {
							while (true) {
								local53 = local11.method480();
								if (local53 == 0) {
									break;
								}
								if (local53 == 1) {
									local11.method480();
									break;
								}
								if (local53 <= 49) {
									local11.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("27951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;II[BLclient!r;I)V")
	public void method60(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(anInt178, arg2);
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
					@Pc(64) int local64 = local45 + arg1;
					@Pc(68) int local68 = local39 + arg4;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray1[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class19 local95 = null;
						if (local80 >= 0) {
							local95 = arg0[local80];
						}
						this.method61(local56, local13, local49, local68, local95, (byte) 5, local60, local64, arg3);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("41995, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!jc;BIILclient!r;)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class37 arg8) {
		try {
			if (aBoolean38) {
				if ((this.aByteArrayArrayArray1[arg2][arg7][arg3] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg2, arg3, arg7) != anInt180) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg2][arg7][arg3];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg2][arg7 + 1][arg3];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg2][arg7 + 1][arg3 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg2][arg7][arg3 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(83) boolean local83 = false;
			@Pc(89) Class9 local89 = Class9.method288(arg1);
			@Pc(101) int local101 = arg7 + (arg3 << 7) + (arg1 << 14) + 1073741824;
			if (!local89.aBoolean127) {
				local101 += Integer.MIN_VALUE;
			}
			@Pc(115) byte local115 = (byte) ((arg6 << 6) + arg0);
			@Pc(144) Class1_Sub1_Sub1 local144;
			if (arg0 != 22) {
				@Pc(242) int local242;
				if (arg0 == 10 || arg0 == 11) {
					if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
						local144 = local89.method294(10, arg6, local33, local44, local57, local68, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 10, local89.anInt519, local57, local44, -966, arg6);
					}
					if (local144 != null) {
						@Pc(229) int local229 = 0;
						if (arg0 == 11) {
							local229 += 256;
						}
						@Pc(245) int local245;
						if (arg6 == 1 || arg6 == 3) {
							local242 = local89.anInt518;
							local245 = local89.anInt517;
						} else {
							local242 = local89.anInt517;
							local245 = local89.anInt518;
						}
						if (arg8.method540(arg2, local144, local242, local101, local115, local245, arg3, local78, local229, arg7) && local89.aBoolean132) {
							@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
							if (local144 instanceof Class1_Sub1_Sub1_Sub5) {
								local276 = (Class1_Sub1_Sub1_Sub5) local144;
							} else {
								local276 = local89.method294(10, arg6, local33, local44, local57, local68, -1);
							}
							if (local276 != null) {
								for (@Pc(292) int local292 = 0; local292 <= local242; local292++) {
									for (@Pc(296) int local296 = 0; local296 <= local245; local296++) {
										@Pc(303) int local303 = local276.anInt501 / 4;
										if (local303 > 30) {
											local303 = 30;
										}
										if (local303 > this.aByteArrayArrayArray6[arg2][arg7 + local292][arg3 + local296]) {
											this.aByteArrayArrayArray6[arg2][arg7 + local292][arg3 + local296] = (byte) local303;
										}
									}
								}
							}
						}
					}
					if (local89.aBoolean125 && arg4 != null) {
						arg4.method422(arg3, arg6, local89.aBoolean126, local89.anInt518, arg7, local89.anInt517);
					}
				} else if (arg0 >= 12) {
					if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
						local144 = local89.method294(arg0, arg6, local33, local44, local57, local68, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, arg0, local89.anInt519, local57, local44, -966, arg6);
					}
					arg8.method540(arg2, local144, 1, local101, local115, 1, arg3, local78, 0, arg7);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x924;
					}
					if (local89.aBoolean125 && arg4 != null) {
						arg4.method422(arg3, arg6, local89.aBoolean126, local89.anInt518, arg7, local89.anInt517);
					}
				} else if (arg0 == 0) {
					if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
						local144 = local89.method294(0, arg6, local33, local44, local57, local68, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 0, local89.anInt519, local57, local44, -966, arg6);
					}
					arg8.method538(local115, 0, arg3, anIntArray25[arg6], arg2, arg7, local144, null, local78, local101);
					if (arg6 == 0) {
						if (local89.aBoolean132) {
							this.aByteArrayArrayArray6[arg2][arg7][arg3] = 50;
							this.aByteArrayArrayArray6[arg2][arg7][arg3 + 1] = 50;
						}
						if (local89.aBoolean130) {
							this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local89.aBoolean132) {
							this.aByteArrayArrayArray6[arg2][arg7][arg3 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3 + 1] = 50;
						}
						if (local89.aBoolean130) {
							this.anIntArrayArrayArray4[arg2][arg7][arg3 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local89.aBoolean132) {
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3] = 50;
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3 + 1] = 50;
						}
						if (local89.aBoolean130) {
							this.anIntArrayArrayArray4[arg2][arg7 + 1][arg3] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local89.aBoolean132) {
							this.aByteArrayArrayArray6[arg2][arg7][arg3] = 50;
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3] = 50;
						}
						if (local89.aBoolean130) {
							this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x492;
						}
					}
					if (local89.aBoolean125 && arg4 != null) {
						arg4.method421(arg7, local89.aBoolean126, arg0, arg3, arg6);
					}
					if (local89.anInt520 != 16) {
						arg8.method546(local89.anInt520, arg7, arg2, arg3);
					}
				} else if (arg0 == 1) {
					if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
						local144 = local89.method294(1, arg6, local33, local44, local57, local68, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 1, local89.anInt519, local57, local44, -966, arg6);
					}
					arg8.method538(local115, 0, arg3, anIntArray26[arg6], arg2, arg7, local144, null, local78, local101);
					if (local89.aBoolean132) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray6[arg2][arg7][arg3 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray6[arg2][arg7][arg3] = 50;
						}
					}
					if (local89.aBoolean125 && arg4 != null) {
						arg4.method421(arg7, local89.aBoolean126, arg0, arg3, arg6);
					}
				} else {
					@Pc(853) int local853;
					@Pc(882) Class1_Sub1_Sub1 local882;
					if (arg0 == 2) {
						local853 = arg6 + 1 & 0x3;
						@Pc(872) Class1_Sub1_Sub1 local872;
						if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
							local872 = local89.method294(2, arg6 + 4, local33, local44, local57, local68, -1);
							local882 = local89.method294(2, local853, local33, local44, local57, local68, -1);
						} else {
							local872 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 2, local89.anInt519, local57, local44, -966, arg6 + 4);
							local882 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 2, local89.anInt519, local57, local44, -966, local853);
						}
						arg8.method538(local115, anIntArray25[local853], arg3, anIntArray25[arg6], arg2, arg7, local872, local882, local78, local101);
						if (local89.aBoolean130) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg7][arg3 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray4[arg2][arg7][arg3 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg7 + 1][arg3] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray4[arg2][arg7 + 1][arg3] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg7][arg3] |= 0x249;
							}
						}
						if (local89.aBoolean125 && arg4 != null) {
							arg4.method421(arg7, local89.aBoolean126, arg0, arg3, arg6);
						}
						if (local89.anInt520 != 16) {
							arg8.method546(local89.anInt520, arg7, arg2, arg3);
						}
					} else if (arg0 == 3) {
						if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
							local144 = local89.method294(3, arg6, local33, local44, local57, local68, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 3, local89.anInt519, local57, local44, -966, arg6);
						}
						arg8.method538(local115, 0, arg3, anIntArray26[arg6], arg2, arg7, local144, null, local78, local101);
						if (local89.aBoolean132) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray6[arg2][arg7][arg3 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray6[arg2][arg7 + 1][arg3] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray6[arg2][arg7][arg3] = 50;
							}
						}
						if (local89.aBoolean125 && arg4 != null) {
							arg4.method421(arg7, local89.aBoolean126, arg0, arg3, arg6);
						}
					} else if (arg0 == 9) {
						if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
							local144 = local89.method294(arg0, arg6, local33, local44, local57, local68, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, arg0, local89.anInt519, local57, local44, -966, arg6);
						}
						arg8.method540(arg2, local144, 1, local101, local115, 1, arg3, local78, 0, arg7);
						if (local89.aBoolean125 && arg4 != null) {
							arg4.method422(arg3, arg6, local89.aBoolean126, local89.anInt518, arg7, local89.anInt517);
						}
					} else {
						if (local89.aBoolean128) {
							if (arg6 == 1) {
								local853 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local853;
							} else if (arg6 == 2) {
								local853 = local68;
								local68 = local44;
								local44 = local853;
								local853 = local57;
								local57 = local33;
								local33 = local853;
							} else if (arg6 == 3) {
								local853 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local853;
							}
						}
						if (arg0 == 4) {
							if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
								local144 = local89.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 4, local89.anInt519, local57, local44, -966, 0);
							}
							arg8.method539(local115, 0, arg7, arg6 * 512, anIntArray25[arg6], arg2, 0, local78, local101, arg3, local144);
						} else if (arg0 == 5) {
							local853 = 16;
							local242 = arg8.method556(arg2, arg7, arg3);
							if (local242 > 0) {
								local853 = Class9.method288(local242 >> 14 & 0x7FFF).anInt520;
							}
							if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
								local882 = local89.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local882 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 4, local89.anInt519, local57, local44, -966, 0);
							}
							arg8.method539(local115, anIntArray27[arg6] * local853, arg7, arg6 * 512, anIntArray25[arg6], arg2, anIntArray28[arg6] * local853, local78, local101, arg3, local882);
						} else if (arg0 == 6) {
							if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
								local144 = local89.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 4, local89.anInt519, local57, local44, -966, 0);
							}
							arg8.method539(local115, 0, arg7, arg6, 256, arg2, 0, local78, local101, arg3, local144);
						} else if (arg0 == 7) {
							if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
								local144 = local89.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 4, local89.anInt519, local57, local44, -966, 0);
							}
							arg8.method539(local115, 0, arg7, arg6, 512, arg2, 0, local78, local101, arg3, local144);
						} else if (arg0 == 8) {
							if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
								local144 = local89.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 4, local89.anInt519, local57, local44, -966, 0);
							}
							arg8.method539(local115, 0, arg7, arg6, 768, arg2, 0, local78, local101, arg3, local144);
						}
					}
				}
			} else if (!aBoolean38 || local89.aBoolean127 || local89.aBoolean133) {
				if (local89.anInt519 == -1 && local89.anIntArray160 == null) {
					local144 = local89.method294(22, arg6, local33, local44, local57, local68, -1);
				} else {
					local144 = new Class1_Sub1_Sub1_Sub2(arg1, true, local68, local33, 22, local89.anInt519, local57, local44, -966, arg6);
				}
				arg8.method536(arg7, arg2, local101, arg3, local115, local78, local144);
				if (local89.aBoolean125 && local89.aBoolean127 && arg4 != null) {
					arg4.method423(arg3, (byte) 7, arg7);
				}
			}
		} catch (@Pc(1627) RuntimeException local1627) {
			signlink.reporterror("42776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1627.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;I[Lclient!jc;)V")
	public void method62(@OriginalArg(0) Class37 arg0, @OriginalArg(2) Class19[] arg1) {
		try {
			@Pc(11) int local11;
			@Pc(15) int local15;
			@Pc(31) int local31;
			for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					for (local15 = 0; local15 < 104; local15++) {
						if ((this.aByteArrayArrayArray1[local7][local11][local15] & 0x1) == 1) {
							local31 = local7;
							if ((this.aByteArrayArrayArray1[1][local11][local15] & 0x2) == 2) {
								local31 = local7 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method423(local15, (byte) 7, local11);
							}
						}
					}
				}
			}
			anInt183 += (int) (Math.random() * 5.0D) - 2;
			if (anInt183 < -8) {
				anInt183 = -8;
			}
			if (anInt183 > 8) {
				anInt183 = 8;
			}
			anInt184 += (int) (Math.random() * 5.0D) - 2;
			if (anInt184 < -16) {
				anInt184 = -16;
			}
			if (anInt184 > 16) {
				anInt184 = 16;
			}
			@Pc(137) int local137;
			@Pc(143) int local143;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(173) int local173;
			@Pc(195) int local195;
			@Pc(208) int local208;
			@Pc(214) int local214;
			@Pc(218) int local218;
			@Pc(224) int local224;
			@Pc(240) int local240;
			@Pc(288) int local288;
			for (local11 = 0; local11 < 4; local11++) {
				@Pc(112) byte[][] local112 = this.aByteArrayArrayArray6[local11];
				local137 = (int) Math.sqrt((double) 5100);
				local143 = local137 * 768 >> 8;
				for (local145 = 1; local145 < this.anInt182 - 1; local145++) {
					for (local149 = 1; local149 < this.anInt181 - 1; local149++) {
						local173 = this.anIntArrayArrayArray3[local11][local149 + 1][local145] - this.anIntArrayArrayArray3[local11][local149 - 1][local145];
						local195 = this.anIntArrayArrayArray3[local11][local149][local145 + 1] - this.anIntArrayArrayArray3[local11][local149][local145 - 1];
						local208 = (int) Math.sqrt((double) (local173 * local173 + local195 * local195 + 65536));
						local214 = (local173 << 8) / local208;
						local218 = 65536 / local208;
						local224 = (local195 << 8) / local208;
						local240 = (local214 * -50 + local218 * -10 + local224 * -50) / local143 + 96;
						local288 = (local112[local149 - 1][local145] >> 2) + (local112[local149 + 1][local145] >> 3) + (local112[local149][local145 - 1] >> 2) + (local112[local149][local145 + 1] >> 3) + (local112[local149][local145] >> 1);
						this.anIntArrayArray2[local149][local145] = local240 - local288;
					}
				}
				for (local149 = 0; local149 < this.anInt182; local149++) {
					this.anIntArray20[local149] = 0;
					this.anIntArray21[local149] = 0;
					this.anIntArray22[local149] = 0;
					this.anIntArray23[local149] = 0;
					this.anIntArray24[local149] = 0;
				}
				for (local173 = -5; local173 < this.anInt181 + 5; local173++) {
					for (local195 = 0; local195 < this.anInt182; local195++) {
						local208 = local173 + 5;
						@Pc(423) int local423;
						if (local208 >= 0 && local208 < this.anInt181) {
							local214 = this.aByteArrayArrayArray2[local11][local208][local195] & 0xFF;
							if (local214 > 0) {
								@Pc(382) Class21 local382 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray20[local195] += local382.anInt727;
								this.anIntArray21[local195] += local382.anInt725;
								this.anIntArray22[local195] += local382.anInt726;
								this.anIntArray23[local195] += local382.anInt728;
								local423 = this.anIntArray24[local195]++;
							}
						}
						local214 = local173 - 5;
						if (local214 >= 0 && local214 < this.anInt181) {
							local218 = this.aByteArrayArrayArray2[local11][local214][local195] & 0xFF;
							if (local218 > 0) {
								@Pc(455) Class21 local455 = Class21.aClass21Array1[local218 - 1];
								this.anIntArray20[local195] -= local455.anInt727;
								this.anIntArray21[local195] -= local455.anInt725;
								this.anIntArray22[local195] -= local455.anInt726;
								this.anIntArray23[local195] -= local455.anInt728;
								local423 = this.anIntArray24[local195]--;
							}
						}
					}
					if (local173 >= 1 && local173 < this.anInt181 - 1) {
						local208 = 0;
						local214 = 0;
						local218 = 0;
						local224 = 0;
						local240 = 0;
						for (local288 = -5; local288 < this.anInt182 + 5; local288++) {
							@Pc(531) int local531 = local288 + 5;
							if (local531 >= 0 && local531 < this.anInt182) {
								local208 += this.anIntArray20[local531];
								local214 += this.anIntArray21[local531];
								local218 += this.anIntArray22[local531];
								local224 += this.anIntArray23[local531];
								local240 += this.anIntArray24[local531];
							}
							@Pc(576) int local576 = local288 - 5;
							if (local576 >= 0 && local576 < this.anInt182) {
								local208 -= this.anIntArray20[local576];
								local214 -= this.anIntArray21[local576];
								local218 -= this.anIntArray22[local576];
								local224 -= this.anIntArray23[local576];
								local240 -= this.anIntArray24[local576];
							}
							if (local288 >= 1 && local288 < this.anInt182 - 1 && (!aBoolean38 || (this.aByteArrayArrayArray1[local11][local173][local288] & 0x10) == 0 && this.method63(local11, local288, local173) == anInt180)) {
								@Pc(659) int local659 = this.aByteArrayArrayArray2[local11][local173][local288] & 0xFF;
								@Pc(670) int local670 = this.aByteArrayArrayArray3[local11][local173][local288] & 0xFF;
								if (local659 > 0 || local670 > 0) {
									@Pc(683) int local683 = this.anIntArrayArrayArray3[local11][local173][local288];
									@Pc(694) int local694 = this.anIntArrayArrayArray3[local11][local173 + 1][local288];
									@Pc(707) int local707 = this.anIntArrayArrayArray3[local11][local173 + 1][local288 + 1];
									@Pc(718) int local718 = this.anIntArrayArrayArray3[local11][local173][local288 + 1];
									@Pc(725) int local725 = this.anIntArrayArray2[local173][local288];
									@Pc(734) int local734 = this.anIntArrayArray2[local173 + 1][local288];
									@Pc(745) int local745 = this.anIntArrayArray2[local173 + 1][local288 + 1];
									@Pc(754) int local754 = this.anIntArrayArray2[local173][local288 + 1];
									@Pc(756) int local756 = -1;
									@Pc(758) int local758 = -1;
									@Pc(766) int local766;
									@Pc(770) int local770;
									if (local659 > 0) {
										local766 = local208 * 256 / local224;
										local770 = local214 / local240;
										@Pc(774) int local774 = local218 / local240;
										local756 = this.method71(local766, local770, local774);
										@Pc(786) int local786 = local766 + anInt183 & 0xFF;
										local774 += anInt184;
										if (local774 < 0) {
											local774 = 0;
										} else if (local774 > 255) {
											local774 = 255;
										}
										local758 = this.method71(local786, local770, local774);
									}
									if (local11 > 0) {
										@Pc(811) boolean local811 = true;
										if (local659 == 0 && this.aByteArrayArrayArray4[local11][local173][local288] != 0) {
											local811 = false;
										}
										if (local670 > 0 && !Class21.aClass21Array1[local670 - 1].aBoolean191) {
											local811 = false;
										}
										if (local811 && local683 == local694 && local683 == local707 && local683 == local718) {
											this.anIntArrayArrayArray4[local11][local173][local288] |= 0x924;
										}
									}
									local766 = 0;
									if (local756 != -1) {
										local766 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local758, 96)];
									}
									if (local670 == 0) {
										arg0.method535(local11, local173, local288, 0, 0, -1, local683, local694, local707, local718, method69(local756, local725), method69(local756, local734), method69(local756, local745), method69(local756, local754), 0, 0, 0, 0, local766, 0);
									} else {
										local770 = this.aByteArrayArrayArray4[local11][local173][local288] + 1;
										@Pc(923) byte local923 = this.aByteArrayArrayArray5[local11][local173][local288];
										@Pc(929) Class21 local929 = Class21.aClass21Array1[local670 - 1];
										@Pc(932) int local932 = local929.anInt723;
										@Pc(940) int local940;
										@Pc(938) int local938;
										if (local932 >= 0) {
											local938 = Class1_Sub1_Sub2_Sub1.method348(local932);
											local940 = -1;
										} else if (local929.anInt722 == 16711935) {
											local938 = 0;
											local940 = -2;
											local932 = -1;
										} else {
											local940 = this.method71(local929.anInt724, local929.anInt725, local929.anInt726);
											local938 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local929.anInt729, 96)];
										}
										arg0.method535(local11, local173, local288, local770, local923, local932, local683, local694, local707, local718, method69(local756, local725), method69(local756, local734), method69(local756, local745), method69(local756, local754), this.method70(local940, local725), this.method70(local940, local734), this.method70(local940, local745), this.method70(local940, local754), local766, local938);
									}
								}
							}
						}
					}
				}
				for (local195 = 1; local195 < this.anInt182 - 1; local195++) {
					for (local208 = 1; local208 < this.anInt181 - 1; local208++) {
						arg0.method534(local11, local208, local195, this.method63(local11, local195, local208));
					}
				}
			}
			arg0.method561();
			for (local15 = 0; local15 < this.anInt181; local15++) {
				for (local31 = 0; local31 < this.anInt182; local31++) {
					if ((this.aByteArrayArrayArray1[1][local15][local31] & 0x2) == 2) {
						arg0.method532(local31, local15);
					}
				}
			}
			local31 = 1;
			@Pc(1111) int local1111 = 2;
			@Pc(1113) int local1113 = 4;
			for (@Pc(1115) int local1115 = 0; local1115 < 4; local1115++) {
				if (local1115 > 0) {
					local31 <<= 0x3;
					local1111 <<= 0x3;
					local1113 <<= 0x3;
				}
				for (@Pc(1133) int local1133 = 0; local1133 <= local1115; local1133++) {
					for (local137 = 0; local137 <= this.anInt182; local137++) {
						for (local143 = 0; local143 <= this.anInt181; local143++) {
							if ((this.anIntArrayArrayArray4[local1133][local143][local137] & local31) != 0) {
								local145 = local137;
								local149 = local137;
								local173 = local1133;
								local195 = local1133;
								while (local145 > 0 && (this.anIntArrayArrayArray4[local1133][local143][local145 - 1] & local31) != 0) {
									local145--;
								}
								while (local149 < this.anInt182 && (this.anIntArrayArrayArray4[local1133][local143][local149 + 1] & local31) != 0) {
									local149++;
								}
								label324: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray4[local173 - 1][local143][local208] & local31) == 0) {
											break label324;
										}
									}
									local173--;
								}
								label313: while (local195 < local1115) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray4[local195 + 1][local143][local208] & local31) == 0) {
											break label313;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray3[local195][local143][local145] - 240;
									local224 = this.anIntArrayArrayArray3[local173][local143][local145];
									Class37.method533(1, local218, local1115, local143 * 128, local143 * 128, local224, local145 * 128, this.anInt179, local149 * 128 + 128);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray4[local240][local143][local288] &= ~local31;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1133][local143][local137] & local1111) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local1133;
								local195 = local1133;
								while (local145 > 0 && (this.anIntArrayArrayArray4[local1133][local145 - 1][local137] & local1111) != 0) {
									local145--;
								}
								while (local149 < this.anInt181 && (this.anIntArrayArrayArray4[local1133][local149 + 1][local137] & local1111) != 0) {
									local149++;
								}
								label377: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray4[local173 - 1][local208][local137] & local1111) == 0) {
											break label377;
										}
									}
									local173--;
								}
								label366: while (local195 < local1115) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray4[local195 + 1][local208][local137] & local1111) == 0) {
											break label366;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray3[local195][local145][local137] - 240;
									local224 = this.anIntArrayArrayArray3[local173][local145][local137];
									Class37.method533(2, local218, local1115, local149 * 128 + 128, local145 * 128, local224, local137 * 128, this.anInt179, local137 * 128);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray4[local240][local288][local137] &= ~local1111;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1133][local143][local137] & local1113) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local137;
								local195 = local137;
								while (local173 > 0 && (this.anIntArrayArrayArray4[local1133][local143][local173 - 1] & local1113) != 0) {
									local173--;
								}
								while (local195 < this.anInt182 && (this.anIntArrayArrayArray4[local1133][local143][local195 + 1] & local1113) != 0) {
									local195++;
								}
								label430: while (local145 > 0) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray4[local1133][local145 - 1][local208] & local1113) == 0) {
											break label430;
										}
									}
									local145--;
								}
								label419: while (local149 < this.anInt181) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray4[local1133][local149 + 1][local208] & local1113) == 0) {
											break label419;
										}
									}
									local149++;
								}
								if ((local149 + 1 - local145) * (local195 + 1 - local173) >= 4) {
									local208 = this.anIntArrayArrayArray3[local1133][local145][local173];
									Class37.method533(4, local208, local1115, local149 * 128 + 128, local145 * 128, local208, local173 * 128, this.anInt179, local195 * 128 + 128);
									for (local214 = local145; local214 <= local149; local214++) {
										for (local218 = local173; local218 <= local195; local218++) {
											this.anIntArrayArrayArray4[local1133][local214][local218] &= ~local1113;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1751) RuntimeException local1751) {
			signlink.reporterror("43248, " + arg0 + ", " + -994 + ", " + arg1 + ", " + local1751.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method63(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("3381, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
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
