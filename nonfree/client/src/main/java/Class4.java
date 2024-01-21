import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt200;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	private static boolean aBoolean33;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "B")
	private static byte aByte4 = -124;

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
	private static int anInt203 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt204 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt198 = 1733;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt199 = 922;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt202;

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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BIBI)Z")
	public static boolean method59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg0, false);
			@Pc(11) int local11 = -1;
			if (aByte4 != -124) {
				throw new NullPointerException();
			}
			label55: while (true) {
				@Pc(21) int local21 = local9.method510();
				if (local21 == 0) {
					return local3;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method510();
						if (local36 == 0) {
							continue label55;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method496() >> 2;
						@Pc(73) int local73 = local64 + arg2;
						@Pc(77) int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method258(local11);
							if (local69 != 22 || !aBoolean32 || local90.aBoolean105 || local90.aBoolean112) {
								local3 &= local90.method262();
								local31 = true;
							}
						}
					}
					local36 = local9.method510();
					if (local36 == 0) {
						break;
					}
					local9.method496();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("47270, " + arg0 + ", " + arg1 + ", " + -124 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!mb;Lclient!vb;)V")
	public static void method60(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class43_Sub1 arg2) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 == 0) {
				while (true) {
					@Pc(9) int local9 = arg1.method510();
					if (local9 == 0) {
						return;
					}
					local3 += local9;
					@Pc(18) Class9 local18 = Class9.method258(local3);
					local18.method263(arg2);
					while (true) {
						@Pc(25) int local25 = arg1.method510();
						if (local25 == 0) {
							break;
						}
						arg1.method496();
					}
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("97353, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
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
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray183[arg2 * 1024 / arg3] >> 1;
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
	public static boolean method73(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class9 local2 = Class9.method258(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method261(arg0);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("57375, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([[[ILclient!s;BIIIIIILclient!jc;I)V")
	public static void method74(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class19 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg0[arg6][arg4][arg3];
			@Pc(19) int local19 = arg0[arg6][arg4 + 1][arg3];
			@Pc(31) int local31 = arg0[arg6][arg4 + 1][arg3 + 1];
			@Pc(41) int local41 = arg0[arg6][arg4][arg3 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(64) Class9 local64 = Class9.method258(arg5);
			@Pc(76) int local76 = arg4 + (arg3 << 7) + (arg5 << 14) + 1073741824;
			if (!local64.aBoolean105) {
				local76 += Integer.MIN_VALUE;
			}
			@Pc(90) byte local90 = (byte) ((arg9 << 6) + arg7);
			@Pc(107) Class1_Sub1_Sub1 local107;
			if (arg7 == 22) {
				if (local64.anInt525 == -1) {
					local107 = local64.method264(22, arg9, local9, local19, local31, local41, -1);
				} else {
					local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 22, arg9, local19, local64.anInt525);
				}
				arg1.method584(arg3, arg4, arg2, local76, local90, local107, local51);
				if (local64.aBoolean103 && local64.aBoolean105) {
					arg8.method415(arg4, arg3);
				}
			} else {
				@Pc(200) int local200;
				if (arg7 == 10 || arg7 == 11) {
					if (local64.anInt525 == -1) {
						local107 = local64.method264(10, arg9, local9, local19, local31, local41, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 10, arg9, local19, local64.anInt525);
					}
					if (local107 != null) {
						@Pc(187) int local187 = 0;
						if (arg7 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg9 == 1 || arg9 == 3) {
							local200 = local64.anInt524;
							local203 = local64.anInt523;
						} else {
							local200 = local64.anInt523;
							local203 = local64.anInt524;
						}
						arg1.method588(local76, arg4, local107, 165, local51, local200, arg3, local187, local90, local203, arg2);
					}
					if (local64.aBoolean103) {
						arg8.method414(arg3, arg9, local64.anInt523, local64.anInt524, local64.aBoolean104, arg4);
					}
				} else if (arg7 >= 12) {
					if (local64.anInt525 == -1) {
						local107 = local64.method264(arg7, arg9, local9, local19, local31, local41, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, arg7, arg9, local19, local64.anInt525);
					}
					arg1.method588(local76, arg4, local107, 165, local51, 1, arg3, 0, local90, 1, arg2);
					if (local64.aBoolean103) {
						arg8.method414(arg3, arg9, local64.anInt523, local64.anInt524, local64.aBoolean104, arg4);
					}
				} else if (arg7 == 0) {
					if (local64.anInt525 == -1) {
						local107 = local64.method264(0, arg9, local9, local19, local31, local41, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 0, arg9, local19, local64.anInt525);
					}
					arg1.method586(local51, local90, arg3, local107, arg4, 0, local76, arg2, anIntArray27[arg9], null);
					if (local64.aBoolean103) {
						arg8.method413(arg7, arg9, arg3, arg4, local64.aBoolean104);
					}
				} else if (arg7 == 1) {
					if (local64.anInt525 == -1) {
						local107 = local64.method264(1, arg9, local9, local19, local31, local41, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 1, arg9, local19, local64.anInt525);
					}
					arg1.method586(local51, local90, arg3, local107, arg4, 0, local76, arg2, anIntArray28[arg9], null);
					if (local64.aBoolean103) {
						arg8.method413(arg7, arg9, arg3, arg4, local64.aBoolean104);
					}
				} else {
					@Pc(463) Class1_Sub1_Sub1 local463;
					@Pc(437) int local437;
					if (arg7 == 2) {
						local437 = arg9 + 1 & 0x3;
						@Pc(453) Class1_Sub1_Sub1 local453;
						if (local64.anInt525 == -1) {
							local453 = local64.method264(2, arg9 + 4, local9, local19, local31, local41, -1);
							local463 = local64.method264(2, local437, local9, local19, local31, local41, -1);
						} else {
							local453 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 2, arg9 + 4, local19, local64.anInt525);
							local463 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 2, local437, local19, local64.anInt525);
						}
						arg1.method586(local51, local90, arg3, local453, arg4, anIntArray27[local437], local76, arg2, anIntArray27[arg9], local463);
						if (local64.aBoolean103) {
							arg8.method413(arg7, arg9, arg3, arg4, local64.aBoolean104);
						}
					} else if (arg7 == 3) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(3, arg9, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 3, arg9, local19, local64.anInt525);
						}
						arg1.method586(local51, local90, arg3, local107, arg4, 0, local76, arg2, anIntArray28[arg9], null);
						if (local64.aBoolean103) {
							arg8.method413(arg7, arg9, arg3, arg4, local64.aBoolean104);
						}
					} else if (arg7 == 9) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(arg7, arg9, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, arg7, arg9, local19, local64.anInt525);
						}
						arg1.method588(local76, arg4, local107, 165, local51, 1, arg3, 0, local90, 1, arg2);
						if (local64.aBoolean103) {
							arg8.method414(arg3, arg9, local64.anInt523, local64.anInt524, local64.aBoolean104, arg4);
						}
					} else if (arg7 == 4) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 4, 0, local19, local64.anInt525);
						}
						arg1.method587(465, arg3, 0, anIntArray27[arg9], arg2, arg4, local90, local76, arg9 * 512, 0, local107, local51);
					} else if (arg7 == 5) {
						local437 = 16;
						local200 = arg1.method604(arg2, arg4, arg3);
						if (local200 > 0) {
							local437 = Class9.method258(local200 >> 14 & 0x7FFF).anInt526;
						}
						if (local64.anInt525 == -1) {
							local463 = local64.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local463 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 4, 0, local19, local64.anInt525);
						}
						arg1.method587(465, arg3, anIntArray30[arg9] * local437, anIntArray27[arg9], arg2, arg4, local90, local76, arg9 * 512, anIntArray29[arg9] * local437, local463, local51);
					} else if (arg7 == 6) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 4, 0, local19, local64.anInt525);
						}
						arg1.method587(465, arg3, 0, 256, arg2, arg4, local90, local76, arg9, 0, local107, local51);
					} else if (arg7 == 7) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 4, 0, local19, local64.anInt525);
						}
						arg1.method587(465, arg3, 0, 512, arg2, arg4, local90, local76, arg9, 0, local107, local51);
					} else if (arg7 == 8) {
						if (local64.anInt525 == -1) {
							local107 = local64.method264(4, 0, local9, local19, local31, local41, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local31, arg5, (byte) 2, true, local9, local41, 4, 0, local19, local64.anInt525);
						}
						arg1.method587(465, arg3, 0, 768, arg2, arg4, local90, local76, arg9, 0, local107, local51);
					}
				}
			}
		} catch (@Pc(933) RuntimeException local933) {
			signlink.reporterror("35062, " + arg0 + ", " + arg1 + ", " + 32 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local933.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt201 = arg2;
			this.anInt202 = arg4;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt201][this.anInt202];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt201][this.anInt202];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt201][this.anInt202];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt201][this.anInt202];
			this.anIntArrayArrayArray2 = new int[4][this.anInt201 + 1][this.anInt202 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt201 + 1][this.anInt202 + 1];
			this.anIntArrayArray1 = new int[this.anInt201 + 1][this.anInt202 + 1];
			this.anIntArray22 = new int[this.anInt202];
			this.anIntArray23 = new int[this.anInt202];
			this.anIntArray24 = new int[this.anInt202];
			this.anIntArray25 = new int[this.anInt202];
			this.anIntArray26 = new int[this.anInt202];
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("82524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method57(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(8) int local8 = arg0; local8 <= arg0 + 64; local8++) {
				for (@Pc(12) int local12 = arg1; local12 <= arg1 + 64; local12++) {
					if (local12 >= 0 && local12 < this.anInt201 && local8 >= 0 && local8 < this.anInt202) {
						this.aByteArrayArrayArray6[0][local12][local8] = 127;
						if (local12 == arg1 && local12 > 0) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12 - 1][local8];
						}
						if (local12 == arg1 + 64 && local12 < this.anInt201 - 1) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12 + 1][local8];
						}
						if (local8 == arg0 && local8 > 0) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12][local8 - 1];
						}
						if (local8 == arg0 + 64 && local8 < this.anInt202 - 1) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12][local8 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("70080, " + -29 + ", " + 64 + ", " + arg0 + ", " + arg1 + ", " + 64 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[BIIII)V")
	public void method58(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg0, false);
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
					for (@Pc(20) int local20 = 0; local20 < 64; local20++) {
						@Pc(26) int local26 = local16 + arg3;
						@Pc(30) int local30 = local20 + arg2;
						@Pc(52) int local52;
						if (local26 >= 0 && local26 < 104 && local30 >= 0 && local30 < 104) {
							this.aByteArrayArrayArray1[local12][local26][local30] = 0;
							while (true) {
								local52 = local7.method496();
								if (local52 == 0) {
									if (local12 == 0) {
										this.anIntArrayArrayArray1[0][local26][local30] = -method65(local26 + arg1 + 932731, local30 + 556238 + arg4) * 8;
									} else {
										this.anIntArrayArrayArray1[local12][local26][local30] = this.anIntArrayArrayArray1[local12 - 1][local26][local30] - 240;
									}
									break;
								}
								if (local52 == 1) {
									@Pc(108) int local108 = local7.method496();
									if (local108 == 1) {
										local108 = 0;
									}
									if (local12 == 0) {
										this.anIntArrayArrayArray1[0][local26][local30] = -local108 * 8;
									} else {
										this.anIntArrayArrayArray1[local12][local26][local30] = this.anIntArrayArrayArray1[local12 - 1][local26][local30] - local108 * 8;
									}
									break;
								}
								if (local52 <= 49) {
									this.aByteArrayArrayArray3[local12][local26][local30] = local7.method497();
									this.aByteArrayArrayArray4[local12][local26][local30] = (byte) ((local52 - 2) / 4);
									this.aByteArrayArrayArray5[local12][local26][local30] = (byte) (local52 - 2 & 0x3);
								} else if (local52 <= 81) {
									this.aByteArrayArrayArray1[local12][local26][local30] = (byte) (local52 - 49);
								} else {
									this.aByteArrayArrayArray2[local12][local26][local30] = (byte) (local52 - 81);
								}
							}
						} else {
							while (true) {
								local52 = local7.method496();
								if (local52 == 0) {
									break;
								}
								if (local52 == 1) {
									local7.method496();
									break;
								}
								if (local52 <= 49) {
									local7.method496();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("71699, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;I[BIBLclient!s;)V")
	public void method61(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class38 arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, false);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(23) int local23 = local7.method510();
				if (local23 == 0) {
					return;
				}
				local9 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local7.method510();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local7.method496();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					@Pc(71) int local71 = local52 + arg3;
					@Pc(75) int local75 = local46 + arg1;
					if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
						@Pc(87) int local87 = local56;
						if ((this.aByteArrayArrayArray1[1][local71][local75] & 0x2) == 2) {
							local87 = local56 - 1;
						}
						@Pc(102) Class19 local102 = null;
						if (local87 >= 0) {
							local102 = arg0[local87];
						}
						this.method62(local63, local71, local75, local67, local9, local56, local102, arg4);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("93023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 112 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIILclient!jc;Lclient!s;)V")
	private void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) Class38 arg7) {
		try {
			if (aBoolean32) {
				if ((this.aByteArrayArrayArray1[arg5][arg1][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method64(arg1, arg5, arg2) != anInt200) {
					return;
				}
			}
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg5][arg1][arg2];
			@Pc(55) int local55 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg2];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg2 + 1];
			@Pc(79) int local79 = this.anIntArrayArrayArray1[arg5][arg1][arg2 + 1];
			@Pc(89) int local89 = local44 + local55 + local68 + local79 >> 2;
			@Pc(92) Class9 local92 = Class9.method258(arg4);
			@Pc(104) int local104 = arg1 + (arg2 << 7) + (arg4 << 14) + 1073741824;
			if (!local92.aBoolean105) {
				local104 += Integer.MIN_VALUE;
			}
			@Pc(118) byte local118 = (byte) ((arg3 << 6) + arg0);
			@Pc(144) Class1_Sub1_Sub1 local144;
			if (arg0 != 22) {
				@Pc(239) int local239;
				if (arg0 == 10 || arg0 == 11) {
					if (local92.anInt525 == -1) {
						local144 = local92.method264(10, arg3, local44, local55, local68, local79, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 10, arg3, local55, local92.anInt525);
					}
					if (local144 != null) {
						@Pc(226) int local226 = 0;
						if (arg0 == 11) {
							local226 += 256;
						}
						@Pc(242) int local242;
						if (arg3 == 1 || arg3 == 3) {
							local239 = local92.anInt524;
							local242 = local92.anInt523;
						} else {
							local239 = local92.anInt523;
							local242 = local92.anInt524;
						}
						if (arg7.method588(local104, arg1, local144, 165, local89, local239, arg2, local226, local118, local242, arg5) && local92.aBoolean111) {
							@Pc(273) Class1_Sub1_Sub1_Sub5 local273;
							if (local144 instanceof Class1_Sub1_Sub1_Sub5) {
								local273 = (Class1_Sub1_Sub1_Sub5) local144;
							} else {
								local273 = local92.method264(10, arg3, local44, local55, local68, local79, -1);
							}
							if (local273 != null) {
								for (@Pc(289) int local289 = 0; local289 <= local239; local289++) {
									for (@Pc(293) int local293 = 0; local293 <= local242; local293++) {
										@Pc(300) int local300 = local273.anInt556 / 4;
										if (local300 > 30) {
											local300 = 30;
										}
										if (local300 > this.aByteArrayArrayArray6[arg5][arg1 + local289][arg2 + local293]) {
											this.aByteArrayArrayArray6[arg5][arg1 + local289][arg2 + local293] = (byte) local300;
										}
									}
								}
							}
						}
					}
					if (local92.aBoolean103 && arg6 != null) {
						arg6.method414(arg2, arg3, local92.anInt523, local92.anInt524, local92.aBoolean104, arg1);
					}
				} else if (arg0 >= 12) {
					if (local92.anInt525 == -1) {
						local144 = local92.method264(arg0, arg3, local44, local55, local68, local79, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, arg0, arg3, local55, local92.anInt525);
					}
					arg7.method588(local104, arg1, local144, 165, local89, 1, arg2, 0, local118, 1, arg5);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x924;
					}
					if (local92.aBoolean103 && arg6 != null) {
						arg6.method414(arg2, arg3, local92.anInt523, local92.anInt524, local92.aBoolean104, arg1);
					}
				} else if (arg0 == 0) {
					if (local92.anInt525 == -1) {
						local144 = local92.method264(0, arg3, local44, local55, local68, local79, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 0, arg3, local55, local92.anInt525);
					}
					arg7.method586(local89, local118, arg2, local144, arg1, 0, local104, arg5, anIntArray27[arg3], null);
					if (arg3 == 0) {
						if (local92.aBoolean111) {
							this.aByteArrayArrayArray6[arg5][arg1][arg2] = 50;
							this.aByteArrayArrayArray6[arg5][arg1][arg2 + 1] = 50;
						}
						if (local92.aBoolean108) {
							this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local92.aBoolean111) {
							this.aByteArrayArrayArray6[arg5][arg1][arg2 + 1] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2 + 1] = 50;
						}
						if (local92.aBoolean108) {
							this.anIntArrayArrayArray2[arg5][arg1][arg2 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local92.aBoolean111) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2 + 1] = 50;
						}
						if (local92.aBoolean108) {
							this.anIntArrayArrayArray2[arg5][arg1 + 1][arg2] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local92.aBoolean111) {
							this.aByteArrayArrayArray6[arg5][arg1][arg2] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2] = 50;
						}
						if (local92.aBoolean108) {
							this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x492;
						}
					}
					if (local92.aBoolean103 && arg6 != null) {
						arg6.method413(arg0, arg3, arg2, arg1, local92.aBoolean104);
					}
					if (local92.anInt526 != 16) {
						arg7.method594(arg2, arg5, local92.anInt526, arg1);
					}
				} else if (arg0 == 1) {
					if (local92.anInt525 == -1) {
						local144 = local92.method264(1, arg3, local44, local55, local68, local79, -1);
					} else {
						local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 1, arg3, local55, local92.anInt525);
					}
					arg7.method586(local89, local118, arg2, local144, arg1, 0, local104, arg5, anIntArray28[arg3], null);
					if (local92.aBoolean111) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray6[arg5][arg1][arg2 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray6[arg5][arg1][arg2] = 50;
						}
					}
					if (local92.aBoolean103 && arg6 != null) {
						arg6.method413(arg0, arg3, arg2, arg1, local92.aBoolean104);
					}
				} else {
					@Pc(867) Class1_Sub1_Sub1 local867;
					@Pc(841) int local841;
					if (arg0 == 2) {
						local841 = arg3 + 1 & 0x3;
						@Pc(857) Class1_Sub1_Sub1 local857;
						if (local92.anInt525 == -1) {
							local857 = local92.method264(2, arg3 + 4, local44, local55, local68, local79, -1);
							local867 = local92.method264(2, local841, local44, local55, local68, local79, -1);
						} else {
							local857 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 2, arg3 + 4, local55, local92.anInt525);
							local867 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 2, local841, local55, local92.anInt525);
						}
						arg7.method586(local89, local118, arg2, local857, arg1, anIntArray27[local841], local104, arg5, anIntArray27[arg3], local867);
						if (local92.aBoolean108) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg2 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray2[arg5][arg1][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg2] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1][arg2] |= 0x249;
							}
						}
						if (local92.aBoolean103 && arg6 != null) {
							arg6.method413(arg0, arg3, arg2, arg1, local92.aBoolean104);
						}
						if (local92.anInt526 != 16) {
							arg7.method594(arg2, arg5, local92.anInt526, arg1);
						}
					} else if (arg0 == 3) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(3, arg3, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 3, arg3, local55, local92.anInt525);
						}
						arg7.method586(local89, local118, arg2, local144, arg1, 0, local104, arg5, anIntArray28[arg3], null);
						if (local92.aBoolean111) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray6[arg5][arg1][arg2 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray6[arg5][arg1 + 1][arg2] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray6[arg5][arg1][arg2] = 50;
							}
						}
						if (local92.aBoolean103 && arg6 != null) {
							arg6.method413(arg0, arg3, arg2, arg1, local92.aBoolean104);
						}
					} else if (arg0 == 9) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(arg0, arg3, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, arg0, arg3, local55, local92.anInt525);
						}
						arg7.method588(local104, arg1, local144, 165, local89, 1, arg2, 0, local118, 1, arg5);
						if (local92.aBoolean103 && arg6 != null) {
							arg6.method414(arg2, arg3, local92.anInt523, local92.anInt524, local92.aBoolean104, arg1);
						}
					} else if (arg0 == 4) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(4, 0, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 4, 0, local55, local92.anInt525);
						}
						arg7.method587(465, arg2, 0, anIntArray27[arg3], arg5, arg1, local118, local104, arg3 * 512, 0, local144, local89);
					} else if (arg0 == 5) {
						local841 = 16;
						local239 = arg7.method604(arg5, arg1, arg2);
						if (local239 > 0) {
							local841 = Class9.method258(local239 >> 14 & 0x7FFF).anInt526;
						}
						if (local92.anInt525 == -1) {
							local867 = local92.method264(4, 0, local44, local55, local68, local79, -1);
						} else {
							local867 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 4, 0, local55, local92.anInt525);
						}
						arg7.method587(465, arg2, anIntArray30[arg3] * local841, anIntArray27[arg3], arg5, arg1, local118, local104, arg3 * 512, anIntArray29[arg3] * local841, local867, local89);
					} else if (arg0 == 6) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(4, 0, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 4, 0, local55, local92.anInt525);
						}
						arg7.method587(465, arg2, 0, 256, arg5, arg1, local118, local104, arg3, 0, local144, local89);
					} else if (arg0 == 7) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(4, 0, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 4, 0, local55, local92.anInt525);
						}
						arg7.method587(465, arg2, 0, 512, arg5, arg1, local118, local104, arg3, 0, local144, local89);
					} else if (arg0 == 8) {
						if (local92.anInt525 == -1) {
							local144 = local92.method264(4, 0, local44, local55, local68, local79, -1);
						} else {
							local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 4, 0, local55, local92.anInt525);
						}
						arg7.method587(465, arg2, 0, 768, arg5, arg1, local118, local104, arg3, 0, local144, local89);
					}
				}
			} else if (!aBoolean32 || local92.aBoolean105 || local92.aBoolean112) {
				if (local92.anInt525 == -1) {
					local144 = local92.method264(22, arg3, local44, local55, local68, local79, -1);
				} else {
					local144 = new Class1_Sub1_Sub1_Sub2(local68, arg4, (byte) 2, true, local44, local79, 22, arg3, local55, local92.anInt525);
				}
				arg7.method584(arg2, arg1, arg5, local104, local118, local144, local89);
				if (local92.aBoolean103 && local92.aBoolean105 && arg6 != null) {
					arg6.method415(arg1, arg2);
				}
			}
		} catch (@Pc(1543) RuntimeException local1543) {
			signlink.reporterror("80366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 32055 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1543.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;ZLclient!s;)V")
	public void method63(@OriginalArg(0) Class19[] arg0, @OriginalArg(2) Class38 arg1) {
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
								arg0[local27].method415(local7, local11);
							}
						}
					}
				}
			}
			if (aBoolean33) {
				anInt203 = 0;
				anInt204 = 0;
			} else {
				anInt203 += (int) (Math.random() * 5.0D) - 2;
				if (anInt203 < -8) {
					anInt203 = -8;
				}
				if (anInt203 > 8) {
					anInt203 = 8;
				}
				anInt204 += (int) (Math.random() * 5.0D) - 2;
				if (anInt204 < -16) {
					anInt204 = -16;
				}
				if (anInt204 > 16) {
					anInt204 = 16;
				}
			}
			@Pc(150) int local150;
			@Pc(156) int local156;
			@Pc(158) int local158;
			@Pc(162) int local162;
			@Pc(186) int local186;
			@Pc(208) int local208;
			@Pc(221) int local221;
			@Pc(227) int local227;
			@Pc(231) int local231;
			@Pc(237) int local237;
			@Pc(253) int local253;
			@Pc(301) int local301;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(125) byte[][] local125 = this.aByteArrayArrayArray6[local7];
				local150 = (int) Math.sqrt((double) 5100);
				local156 = local150 * 768 >> 8;
				for (local158 = 1; local158 < this.anInt202 - 1; local158++) {
					for (local162 = 1; local162 < this.anInt201 - 1; local162++) {
						local186 = this.anIntArrayArrayArray1[local7][local162 + 1][local158] - this.anIntArrayArrayArray1[local7][local162 - 1][local158];
						local208 = this.anIntArrayArrayArray1[local7][local162][local158 + 1] - this.anIntArrayArrayArray1[local7][local162][local158 - 1];
						local221 = (int) Math.sqrt((double) (local186 * local186 + local208 * local208 + 65536));
						local227 = (local186 << 8) / local221;
						local231 = 65536 / local221;
						local237 = (local208 << 8) / local221;
						local253 = (local227 * -50 + local231 * -10 + local237 * -50) / local156 + 96;
						local301 = (local125[local162 - 1][local158] >> 2) + (local125[local162 + 1][local158] >> 3) + (local125[local162][local158 - 1] >> 2) + (local125[local162][local158 + 1] >> 3) + (local125[local162][local158] >> 1);
						this.anIntArrayArray1[local162][local158] = local253 - local301;
					}
				}
				for (local162 = 0; local162 < this.anInt202; local162++) {
					this.anIntArray22[local162] = 0;
					this.anIntArray23[local162] = 0;
					this.anIntArray24[local162] = 0;
					this.anIntArray25[local162] = 0;
					this.anIntArray26[local162] = 0;
				}
				for (local186 = -5; local186 < this.anInt201 + 5; local186++) {
					for (local208 = 0; local208 < this.anInt202; local208++) {
						local221 = local186 + 5;
						@Pc(436) int local436;
						if (local221 >= 0 && local221 < this.anInt201) {
							local227 = this.aByteArrayArrayArray2[local7][local221][local208] & 0xFF;
							if (local227 > 0) {
								@Pc(395) Class21 local395 = Class21.aClass21Array1[local227 - 1];
								this.anIntArray22[local208] += local395.anInt732;
								this.anIntArray23[local208] += local395.anInt730;
								this.anIntArray24[local208] += local395.anInt731;
								this.anIntArray25[local208] += local395.anInt733;
								local436 = this.anIntArray26[local208]++;
							}
						}
						local227 = local186 - 5;
						if (local227 >= 0 && local227 < this.anInt201) {
							local231 = this.aByteArrayArrayArray2[local7][local227][local208] & 0xFF;
							if (local231 > 0) {
								@Pc(468) Class21 local468 = Class21.aClass21Array1[local231 - 1];
								this.anIntArray22[local208] -= local468.anInt732;
								this.anIntArray23[local208] -= local468.anInt730;
								this.anIntArray24[local208] -= local468.anInt731;
								this.anIntArray25[local208] -= local468.anInt733;
								local436 = this.anIntArray26[local208]--;
							}
						}
					}
					if (local186 >= 1 && local186 < this.anInt201 - 1) {
						local221 = 0;
						local227 = 0;
						local231 = 0;
						local237 = 0;
						local253 = 0;
						for (local301 = -5; local301 < this.anInt202 + 5; local301++) {
							@Pc(544) int local544 = local301 + 5;
							if (local544 >= 0 && local544 < this.anInt202) {
								local221 += this.anIntArray22[local544];
								local227 += this.anIntArray23[local544];
								local231 += this.anIntArray24[local544];
								local237 += this.anIntArray25[local544];
								local253 += this.anIntArray26[local544];
							}
							@Pc(589) int local589 = local301 - 5;
							if (local589 >= 0 && local589 < this.anInt202) {
								local221 -= this.anIntArray22[local589];
								local227 -= this.anIntArray23[local589];
								local231 -= this.anIntArray24[local589];
								local237 -= this.anIntArray25[local589];
								local253 -= this.anIntArray26[local589];
							}
							if (local301 >= 1 && local301 < this.anInt202 - 1 && (!aBoolean32 || (this.aByteArrayArrayArray1[local7][local186][local301] & 0x10) == 0 && this.method64(local186, local7, local301) == anInt200)) {
								@Pc(672) int local672 = this.aByteArrayArrayArray2[local7][local186][local301] & 0xFF;
								@Pc(683) int local683 = this.aByteArrayArrayArray3[local7][local186][local301] & 0xFF;
								if (local672 > 0 || local683 > 0) {
									@Pc(696) int local696 = this.anIntArrayArrayArray1[local7][local186][local301];
									@Pc(707) int local707 = this.anIntArrayArrayArray1[local7][local186 + 1][local301];
									@Pc(720) int local720 = this.anIntArrayArrayArray1[local7][local186 + 1][local301 + 1];
									@Pc(731) int local731 = this.anIntArrayArrayArray1[local7][local186][local301 + 1];
									@Pc(738) int local738 = this.anIntArrayArray1[local186][local301];
									@Pc(747) int local747 = this.anIntArrayArray1[local186 + 1][local301];
									@Pc(758) int local758 = this.anIntArrayArray1[local186 + 1][local301 + 1];
									@Pc(767) int local767 = this.anIntArrayArray1[local186][local301 + 1];
									@Pc(769) int local769 = -1;
									@Pc(771) int local771 = -1;
									@Pc(779) int local779;
									@Pc(783) int local783;
									if (local672 > 0) {
										local779 = local221 * 256 / local237;
										local783 = local227 / local253;
										@Pc(787) int local787 = local231 / local253;
										local769 = this.method72(local779, local783, local787);
										@Pc(799) int local799 = local779 + anInt203 & 0xFF;
										local787 += anInt204;
										if (local787 < 0) {
											local787 = 0;
										} else if (local787 > 255) {
											local787 = 255;
										}
										local771 = this.method72(local799, local783, local787);
									}
									if (local7 > 0) {
										@Pc(824) boolean local824 = true;
										if (local672 == 0 && this.aByteArrayArrayArray4[local7][local186][local301] != 0) {
											local824 = false;
										}
										if (local683 > 0 && !Class21.aClass21Array1[local683 - 1].aBoolean164) {
											local824 = false;
										}
										if (local824 && local696 == local707 && local696 == local720 && local696 == local731) {
											this.anIntArrayArrayArray2[local7][local186][local301] |= 0x924;
										}
									}
									local779 = 0;
									if (local769 != -1) {
										local779 = Class1_Sub1_Sub2_Sub1.anIntArray187[method70(local771, 96)];
									}
									if (local683 == 0) {
										arg1.method583(local7, local186, local301, 0, 0, -1, local696, local707, local720, local731, method70(local769, local738), method70(local769, local747), method70(local769, local758), method70(local769, local767), 0, 0, 0, 0, local779, 0);
									} else {
										local783 = this.aByteArrayArrayArray4[local7][local186][local301] + 1;
										@Pc(936) byte local936 = this.aByteArrayArrayArray5[local7][local186][local301];
										@Pc(942) Class21 local942 = Class21.aClass21Array1[local683 - 1];
										@Pc(945) int local945 = local942.anInt728;
										@Pc(954) int local954;
										@Pc(952) int local952;
										if (local945 >= 0) {
											local952 = Class1_Sub1_Sub2_Sub1.method374(local945, this.aBoolean30);
											local954 = -1;
										} else if (local942.anInt727 == 16711935) {
											local952 = 0;
											local954 = -2;
											local945 = -1;
										} else {
											local954 = this.method72(local942.anInt729, local942.anInt730, local942.anInt731);
											local952 = Class1_Sub1_Sub2_Sub1.anIntArray187[this.method71(local942.anInt734, 96)];
										}
										arg1.method583(local7, local186, local301, local783, local936, local945, local696, local707, local720, local731, method70(local769, local738), method70(local769, local747), method70(local769, local758), method70(local769, local767), this.method71(local954, local738), this.method71(local954, local747), this.method71(local954, local758), this.method71(local954, local767), local779, local952);
									}
								}
							}
						}
					}
				}
				for (local208 = 1; local208 < this.anInt202 - 1; local208++) {
					for (local221 = 1; local221 < this.anInt201 - 1; local221++) {
						arg1.method582(local7, local221, local208, this.method64(local221, local7, local208));
					}
				}
			}
			if (!aBoolean33) {
				arg1.method609();
			}
			for (local11 = 0; local11 < this.anInt201; local11++) {
				for (local27 = 0; local27 < this.anInt202; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method580(local11, this.anInt198, local27);
					}
				}
			}
			if (!aBoolean33) {
				local27 = 1;
				@Pc(1131) int local1131 = 2;
				@Pc(1133) int local1133 = 4;
				for (@Pc(1135) int local1135 = 0; local1135 < 4; local1135++) {
					if (local1135 > 0) {
						local27 <<= 0x3;
						local1131 <<= 0x3;
						local1133 <<= 0x3;
					}
					for (@Pc(1153) int local1153 = 0; local1153 <= local1135; local1153++) {
						for (local150 = 0; local150 <= this.anInt202; local150++) {
							for (local156 = 0; local156 <= this.anInt201; local156++) {
								if ((this.anIntArrayArrayArray2[local1153][local156][local150] & local27) != 0) {
									local158 = local150;
									local162 = local150;
									local186 = local1153;
									local208 = local1153;
									while (local158 > 0 && (this.anIntArrayArrayArray2[local1153][local156][local158 - 1] & local27) != 0) {
										local158--;
									}
									while (local162 < this.anInt202 && (this.anIntArrayArrayArray2[local1153][local156][local162 + 1] & local27) != 0) {
										local162++;
									}
									label335: while (local186 > 0) {
										for (local221 = local158; local221 <= local162; local221++) {
											if ((this.anIntArrayArrayArray2[local186 - 1][local156][local221] & local27) == 0) {
												break label335;
											}
										}
										local186--;
									}
									label324: while (local208 < local1135) {
										for (local221 = local158; local221 <= local162; local221++) {
											if ((this.anIntArrayArrayArray2[local208 + 1][local156][local221] & local27) == 0) {
												break label324;
											}
										}
										local208++;
									}
									local221 = (local208 + 1 - local186) * (local162 + 1 - local158);
									if (local221 >= 8) {
										local231 = this.anIntArrayArrayArray1[local208][local156][local158] - 240;
										local237 = this.anIntArrayArrayArray1[local186][local156][local158];
										Class38.method581(local156 * 128, local156 * 128, local231, 1, local158 * 128, local1135, local237, local162 * 128 + 128);
										for (local253 = local186; local253 <= local208; local253++) {
											for (local301 = local158; local301 <= local162; local301++) {
												this.anIntArrayArrayArray2[local253][local156][local301] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1153][local156][local150] & local1131) != 0) {
									local158 = local156;
									local162 = local156;
									local186 = local1153;
									local208 = local1153;
									while (local158 > 0 && (this.anIntArrayArrayArray2[local1153][local158 - 1][local150] & local1131) != 0) {
										local158--;
									}
									while (local162 < this.anInt201 && (this.anIntArrayArrayArray2[local1153][local162 + 1][local150] & local1131) != 0) {
										local162++;
									}
									label388: while (local186 > 0) {
										for (local221 = local158; local221 <= local162; local221++) {
											if ((this.anIntArrayArrayArray2[local186 - 1][local221][local150] & local1131) == 0) {
												break label388;
											}
										}
										local186--;
									}
									label377: while (local208 < local1135) {
										for (local221 = local158; local221 <= local162; local221++) {
											if ((this.anIntArrayArrayArray2[local208 + 1][local221][local150] & local1131) == 0) {
												break label377;
											}
										}
										local208++;
									}
									local221 = (local208 + 1 - local186) * (local162 + 1 - local158);
									if (local221 >= 8) {
										local231 = this.anIntArrayArrayArray1[local208][local158][local150] - 240;
										local237 = this.anIntArrayArrayArray1[local186][local158][local150];
										Class38.method581(local158 * 128, local162 * 128 + 128, local231, 2, local150 * 128, local1135, local237, local150 * 128);
										for (local253 = local186; local253 <= local208; local253++) {
											for (local301 = local158; local301 <= local162; local301++) {
												this.anIntArrayArrayArray2[local253][local301][local150] &= ~local1131;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray2[local1153][local156][local150] & local1133) != 0) {
									local158 = local156;
									local162 = local156;
									local186 = local150;
									local208 = local150;
									while (local186 > 0 && (this.anIntArrayArrayArray2[local1153][local156][local186 - 1] & local1133) != 0) {
										local186--;
									}
									while (local208 < this.anInt202 && (this.anIntArrayArrayArray2[local1153][local156][local208 + 1] & local1133) != 0) {
										local208++;
									}
									label441: while (local158 > 0) {
										for (local221 = local186; local221 <= local208; local221++) {
											if ((this.anIntArrayArrayArray2[local1153][local158 - 1][local221] & local1133) == 0) {
												break label441;
											}
										}
										local158--;
									}
									label430: while (local162 < this.anInt201) {
										for (local221 = local186; local221 <= local208; local221++) {
											if ((this.anIntArrayArrayArray2[local1153][local162 + 1][local221] & local1133) == 0) {
												break label430;
											}
										}
										local162++;
									}
									if ((local162 + 1 - local158) * (local208 + 1 - local186) >= 4) {
										local221 = this.anIntArrayArrayArray1[local1153][local158][local186];
										Class38.method581(local158 * 128, local162 * 128 + 128, local221, 4, local186 * 128, local1135, local221, local208 * 128 + 128);
										for (local227 = local158; local227 <= local162; local227++) {
											for (local231 = local186; local231 <= local208; local231++) {
												this.anIntArrayArrayArray2[local1153][local227][local231] &= ~local1133;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1768) RuntimeException local1768) {
			signlink.reporterror("26845, " + arg0 + ", " + true + ", " + arg1 + ", " + local1768.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("80178, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
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
