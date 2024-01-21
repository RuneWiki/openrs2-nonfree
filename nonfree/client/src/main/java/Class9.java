import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DIFHBVBT")
public final class Class9 {

	@OriginalMember(owner = "client!DIFHBVBT", name = "i", descriptor = "Z")
	private static boolean aBoolean55;

	@OriginalMember(owner = "client!DIFHBVBT", name = "l", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!DIFHBVBT", name = "m", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!DIFHBVBT", name = "b", descriptor = "[I")
	private static final int[] anIntArray23 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!DIFHBVBT", name = "d", descriptor = "[I")
	private static final int[] anIntArray24 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!DIFHBVBT", name = "e", descriptor = "B")
	private static byte aByte11 = 7;

	@OriginalMember(owner = "client!DIFHBVBT", name = "f", descriptor = "I")
	private static int anInt208 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!DIFHBVBT", name = "j", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!DIFHBVBT", name = "v", descriptor = "I")
	private static int anInt210 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!DIFHBVBT", name = "x", descriptor = "Z")
	public static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!DIFHBVBT", name = "y", descriptor = "I")
	public static int anInt211 = 99;

	@OriginalMember(owner = "client!DIFHBVBT", name = "E", descriptor = "[I")
	private static final int[] anIntArray31 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!DIFHBVBT", name = "g", descriptor = "B")
	private byte aByte12 = 6;

	@OriginalMember(owner = "client!DIFHBVBT", name = "s", descriptor = "B")
	private byte aByte13 = 6;

	@OriginalMember(owner = "client!DIFHBVBT", name = "u", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!DIFHBVBT", name = "w", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!DIFHBVBT", name = "F", descriptor = "I")
	private int anInt214 = 4;

	@OriginalMember(owner = "client!DIFHBVBT", name = "G", descriptor = "I")
	private int anInt215 = -965;

	@OriginalMember(owner = "client!DIFHBVBT", name = "z", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!DIFHBVBT", name = "A", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!DIFHBVBT", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!DIFHBVBT", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!DIFHBVBT", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!DIFHBVBT", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!DIFHBVBT", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!DIFHBVBT", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!DIFHBVBT", name = "H", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!DIFHBVBT", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!DIFHBVBT", name = "n", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!DIFHBVBT", name = "o", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!DIFHBVBT", name = "p", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!DIFHBVBT", name = "q", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!DIFHBVBT", name = "r", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(III)I")
	private static int method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method155(local3, local13);
		@Pc(29) int local29 = method155(local3 + 1, local13);
		@Pc(35) int local35 = method155(local3, local13 + 1);
		@Pc(43) int local43 = method155(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method166(local23, local29, local9, arg2);
		@Pc(55) int local55 = method166(local35, local43, local9, arg2);
		return method166(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(II)I")
	private static int method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method168(arg0 - 1, arg1 - 1) + method168(arg0 + 1, arg1 - 1) + method168(arg0 - 1, arg1 + 1) + method168(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method168(arg0 - 1, arg1) + method168(arg0 + 1, arg1) + method168(arg0, arg1 - 1) + method168(arg0, arg1 + 1);
		@Pc(59) int local59 = method168(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(IZI[B)Z")
	public static boolean method158(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub2 local9 = new Class1_Sub1_Sub2(arg3, 792);
			@Pc(11) int local11 = -1;
			if (!arg1) {
				throw new NullPointerException();
			}
			label55: while (true) {
				@Pc(20) int local20 = local9.method73();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method73();
						if (local35 == 0) {
							continue label55;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method59() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class38 local89 = Class38.method442(local11);
							if (local68 != 22 || !aBoolean59 || local89.aBoolean175 || local89.aBoolean180) {
								local3 &= local89.method435(414);
								local30 = true;
							}
						}
					}
					local35 = local9.method73();
					if (local35 == 0) {
						break;
					}
					local9.method59();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("19208, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(II[[[IIIIILclient!HQFIXEZL;ILclient!SIPXLNWG;Z)V")
	public static void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class18 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class40 arg9) {
		try {
			@Pc(9) int local9 = arg2[arg6][arg4][arg3];
			@Pc(19) int local19 = arg2[arg6][arg4 + 1][arg3];
			@Pc(31) int local31 = arg2[arg6][arg4 + 1][arg3 + 1];
			@Pc(41) int local41 = arg2[arg6][arg4][arg3 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class38 local54 = Class38.method442(arg1);
			@Pc(66) int local66 = arg4 + (arg3 << 7) + (arg1 << 14) + 1073741824;
			if (!local54.aBoolean175) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg0 << 6) + arg8);
			@Pc(109) Class1_Sub1_Sub1 local109;
			if (arg8 == 22) {
				if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
					local109 = local54.method434(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 22, arg0, local31, local54.anInt658);
				}
				arg9.method462(local80, arg5, local51, local66, arg3, aByte11, arg4, local109);
				if (local54.aBoolean178 && local54.aBoolean175) {
					arg7.method259(arg4, arg3);
				}
			} else {
				@Pc(205) int local205;
				if (arg8 == 10 || arg8 == 11) {
					if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
						local109 = local54.method434(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 10, arg0, local31, local54.anInt658);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg8 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg0 == 1 || arg0 == 3) {
							local205 = local54.anInt647;
							local208 = local54.anInt664;
						} else {
							local205 = local54.anInt664;
							local208 = local54.anInt647;
						}
						arg9.method466(arg3, arg4, local51, local66, local192, local109, local208, arg5, local205, local80);
					}
					if (local54.aBoolean178) {
						arg7.method258(arg3, arg4, local54.anInt664, arg0, local54.anInt647, local54.aBoolean176);
					}
				} else if (arg8 >= 12) {
					if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
						local109 = local54.method434(arg8, arg0, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, arg8, arg0, local31, local54.anInt658);
					}
					arg9.method466(arg3, arg4, local51, local66, 0, local109, 1, arg5, 1, local80);
					if (local54.aBoolean178) {
						arg7.method258(arg3, arg4, local54.anInt664, arg0, local54.anInt647, local54.aBoolean176);
					}
				} else if (arg8 == 0) {
					if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
						local109 = local54.method434(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 0, arg0, local31, local54.anInt658);
					}
					arg9.method464(null, local66, local80, 0, local109, local51, arg4, arg5, arg3, anIntArray23[arg0]);
					if (local54.aBoolean178) {
						arg7.method257(arg8, arg4, aBoolean55, local54.aBoolean176, arg0, arg3);
					}
				} else if (arg8 == 1) {
					if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
						local109 = local54.method434(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 1, arg0, local31, local54.anInt658);
					}
					arg9.method464(null, local66, local80, 0, local109, local51, arg4, arg5, arg3, anIntArray31[arg0]);
					if (local54.aBoolean178) {
						arg7.method257(arg8, arg4, aBoolean55, local54.aBoolean176, arg0, arg3);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class1_Sub1_Sub1 local480;
					if (arg8 == 2) {
						local451 = arg0 + 1 & 0x3;
						@Pc(470) Class1_Sub1_Sub1 local470;
						if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
							local470 = local54.method434(2, arg0 + 4, local9, local19, local31, local41, -1);
							local480 = local54.method434(2, local451, local9, local19, local31, local41, -1);
						} else {
							local470 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 2, arg0 + 4, local31, local54.anInt658);
							local480 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 2, local451, local31, local54.anInt658);
						}
						arg9.method464(local480, local66, local80, anIntArray23[local451], local470, local51, arg4, arg5, arg3, anIntArray23[arg0]);
						if (local54.aBoolean178) {
							arg7.method257(arg8, arg4, aBoolean55, local54.aBoolean176, arg0, arg3);
						}
					} else if (arg8 == 3) {
						if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
							local109 = local54.method434(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 3, arg0, local31, local54.anInt658);
						}
						arg9.method464(null, local66, local80, 0, local109, local51, arg4, arg5, arg3, anIntArray31[arg0]);
						if (local54.aBoolean178) {
							arg7.method257(arg8, arg4, aBoolean55, local54.aBoolean176, arg0, arg3);
						}
					} else if (arg8 == 9) {
						if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
							local109 = local54.method434(arg8, arg0, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, arg8, arg0, local31, local54.anInt658);
						}
						arg9.method466(arg3, arg4, local51, local66, 0, local109, 1, arg5, 1, local80);
						if (local54.aBoolean178) {
							arg7.method258(arg3, arg4, local54.anInt664, arg0, local54.anInt647, local54.aBoolean176);
						}
					} else {
						if (local54.aBoolean181) {
							if (arg0 == 1) {
								local451 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local451;
							} else if (arg0 == 2) {
								local451 = local41;
								local41 = local19;
								local19 = local451;
								local451 = local31;
								local31 = local9;
								local9 = local451;
							} else if (arg0 == 3) {
								local451 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local451;
							}
						}
						if (arg8 == 4) {
							if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
								local109 = local54.method434(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 4, 0, local31, local54.anInt658);
							}
							arg9.method465(local51, arg4, arg5, local66, arg0 * 512, local80, local109, arg3, anIntArray23[arg0], 0, 0);
						} else if (arg8 == 5) {
							local451 = 16;
							local205 = arg9.method482(arg5, arg4, arg3);
							if (local205 > 0) {
								local451 = Class38.method442(local205 >> 14 & 0x7FFF).anInt659;
							}
							if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
								local480 = local54.method434(4, 0, local9, local19, local31, local41, -1);
							} else {
								local480 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 4, 0, local31, local54.anInt658);
							}
							arg9.method465(local51, arg4, arg5, local66, arg0 * 512, local80, local480, arg3, anIntArray23[arg0], anIntArray24[arg0] * local451, anIntArray25[arg0] * local451);
						} else if (arg8 == 6) {
							if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
								local109 = local54.method434(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 4, 0, local31, local54.anInt658);
							}
							arg9.method465(local51, arg4, arg5, local66, arg0, local80, local109, arg3, 256, 0, 0);
						} else if (arg8 == 7) {
							if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
								local109 = local54.method434(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 4, 0, local31, local54.anInt658);
							}
							arg9.method465(local51, arg4, arg5, local66, arg0, local80, local109, arg3, 512, 0, 0);
						} else if (arg8 == 8) {
							if (local54.anInt658 == -1 && local54.anIntArray155 == null) {
								local109 = local54.method434(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local41, local9, local19, arg1, 4, 0, local31, local54.anInt658);
							}
							arg9.method465(local51, arg4, arg5, local66, arg0, local80, local109, arg3, 768, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("38527, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + true + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(IZI)Z")
	public static boolean method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class38 local2 = Class38.method442(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method436(arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("2642, " + arg0 + ", " + true + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(Lclient!CFARFRSG;Lclient!OBRIXRSB;I)V")
	public static void method162(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) Class20_Sub1 arg1) {
		try {
			@Pc(10) int local10 = -1;
			while (true) {
				@Pc(13) int local13 = arg0.method73();
				if (local13 == 0) {
					return;
				}
				local10 += local13;
				@Pc(22) Class38 local22 = Class38.method442(local10);
				local22.method444(arg1);
				while (true) {
					@Pc(29) int local29 = arg0.method73();
					if (local29 == 0) {
						break;
					}
					arg0.method59();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("44143, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "c", descriptor = "(II)I")
	private static int method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method153(arg0 + 45365, arg1 + 91923, 4) + (method153(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method153(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(IIII)I")
	private static int method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub3_Sub4.anIntArray180[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "d", descriptor = "(II)I")
	private static int method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "e", descriptor = "(II)I")
	private static int method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!DIFHBVBT", name = "<init>", descriptor = "(II[[[II[[[B)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt211 = 99;
			this.anInt212 = arg0;
			@Pc(28) int local28 = 44 / arg3;
			this.anInt213 = arg1;
			this.anIntArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = arg4;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt212][this.anInt213];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt212][this.anInt213];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt212][this.anInt213];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt212][this.anInt213];
			this.anIntArrayArrayArray2 = new int[4][this.anInt212 + 1][this.anInt213 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt212 + 1][this.anInt213 + 1];
			this.anIntArrayArray2 = new int[this.anInt212 + 1][this.anInt213 + 1];
			this.anIntArray26 = new int[this.anInt213];
			this.anIntArray27 = new int[this.anInt213];
			this.anIntArray28 = new int[this.anInt213];
			this.anIntArray29 = new int[this.anInt213];
			this.anIntArray30 = new int[this.anInt213];
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("91121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(Lclient!CFARFRSG;IIIIIII)V")
	private void method152(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(33) int local33;
			if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
				this.aByteArrayArrayArray2[arg5][arg1][arg3] = 0;
				while (true) {
					local33 = arg0.method59();
					if (local33 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg3] = -method163(arg1 + arg2 + 932731, arg3 + 556238 + arg6) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg5][arg1][arg3] = this.anIntArrayArrayArray1[arg5 - 1][arg1][arg3] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg0.method59();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg3] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg5][arg1][arg3] = this.anIntArrayArrayArray1[arg5 - 1][arg1][arg3] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray1[arg5][arg1][arg3] = arg0.method60();
						this.aByteArrayArrayArray5[arg5][arg1][arg3] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray4[arg5][arg1][arg3] = (byte) (local33 + arg4 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray2[arg5][arg1][arg3] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray3[arg5][arg1][arg3] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg0.method59();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg0.method59();
						return;
					}
					if (local33 <= 49) {
						arg0.method59();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("86990, " + arg0 + ", " + 769 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(IZIII)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(6) int local6 = arg0; local6 <= arg0 + arg1; local6++) {
				for (@Pc(10) int local10 = arg3; local10 <= arg3 + arg2; local10++) {
					if (local10 >= 0 && local10 < this.anInt212 && local6 >= 0 && local6 < this.anInt213) {
						this.aByteArrayArrayArray6[0][local10][local6] = 127;
						if (local10 == arg3 && local10 > 0) {
							this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10 - 1][local6];
						}
						if (local10 == arg3 + arg2 && local10 < this.anInt212 - 1) {
							this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10 + 1][local6];
						}
						if (local6 == arg0 && local6 > 0) {
							this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10][local6 - 1];
						}
						if (local6 == arg0 + arg1 && local6 < this.anInt213 - 1) {
							this.anIntArrayArrayArray1[0][local10][local6] = this.anIntArrayArrayArray1[0][local10][local6 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("90640, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "b", descriptor = "(II)I")
	private int method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(Lclient!SIPXLNWG;IILclient!HQFIXEZL;IIIII)V")
	private void method157(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(5) boolean local5 = false;
			if (aBoolean59 && (this.aByteArrayArrayArray2[0][arg1][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray2[arg5][arg1][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method167(this.aByte13, arg1, arg5, arg4) != anInt209) {
					return;
				}
			}
			if (arg5 < anInt211) {
				anInt211 = arg5;
			}
			@Pc(54) int local54 = this.anIntArrayArrayArray1[arg5][arg1][arg4];
			@Pc(65) int local65 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg4];
			@Pc(78) int local78 = this.anIntArrayArrayArray1[arg5][arg1 + 1][arg4 + 1];
			@Pc(89) int local89 = this.anIntArrayArrayArray1[arg5][arg1][arg4 + 1];
			@Pc(99) int local99 = local54 + local65 + local78 + local89 >> 2;
			@Pc(102) Class38 local102 = Class38.method442(arg6);
			@Pc(114) int local114 = arg1 + (arg4 << 7) + (arg6 << 14) + 1073741824;
			if (!local102.aBoolean175) {
				local114 += Integer.MIN_VALUE;
			}
			@Pc(128) byte local128 = (byte) ((arg7 << 6) + arg8);
			@Pc(157) Class1_Sub1_Sub1 local157;
			if (arg8 != 22) {
				@Pc(255) int local255;
				if (arg8 == 10 || arg8 == 11) {
					if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
						local157 = local102.method434(10, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 10, arg7, local78, local102.anInt658);
					}
					if (local157 != null) {
						@Pc(242) int local242 = 0;
						if (arg8 == 11) {
							local242 += 256;
						}
						@Pc(258) int local258;
						if (arg7 == 1 || arg7 == 3) {
							local255 = local102.anInt647;
							local258 = local102.anInt664;
						} else {
							local255 = local102.anInt664;
							local258 = local102.anInt647;
						}
						if (arg0.method466(arg4, arg1, local99, local114, local242, local157, local258, arg5, local255, local128) && local102.aBoolean172) {
							@Pc(289) Class1_Sub1_Sub1_Sub4 local289;
							if (local157 instanceof Class1_Sub1_Sub1_Sub4) {
								local289 = (Class1_Sub1_Sub1_Sub4) local157;
							} else {
								local289 = local102.method434(10, arg7, local54, local65, local78, local89, -1);
							}
							if (local289 != null) {
								for (@Pc(305) int local305 = 0; local305 <= local255; local305++) {
									for (@Pc(309) int local309 = 0; local309 <= local258; local309++) {
										@Pc(316) int local316 = local289.anInt496 / 4;
										if (local316 > 30) {
											local316 = 30;
										}
										if (local316 > this.aByteArrayArrayArray6[arg5][arg1 + local305][arg4 + local309]) {
											this.aByteArrayArrayArray6[arg5][arg1 + local305][arg4 + local309] = (byte) local316;
										}
									}
								}
							}
						}
					}
					if (local102.aBoolean178 && arg3 != null) {
						arg3.method258(arg4, arg1, local102.anInt664, arg7, local102.anInt647, local102.aBoolean176);
					}
				} else if (arg8 >= 12) {
					if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
						local157 = local102.method434(arg8, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, arg8, arg7, local78, local102.anInt658);
					}
					arg0.method466(arg4, arg1, local99, local114, 0, local157, 1, arg5, 1, local128);
					if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x924;
					}
					if (local102.aBoolean178 && arg3 != null) {
						arg3.method258(arg4, arg1, local102.anInt664, arg7, local102.anInt647, local102.aBoolean176);
					}
				} else if (arg8 == 0) {
					if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
						local157 = local102.method434(0, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 0, arg7, local78, local102.anInt658);
					}
					arg0.method464(null, local114, local128, 0, local157, local99, arg1, arg5, arg4, anIntArray23[arg7]);
					if (arg7 == 0) {
						if (local102.aBoolean172) {
							this.aByteArrayArrayArray6[arg5][arg1][arg4] = 50;
							this.aByteArrayArrayArray6[arg5][arg1][arg4 + 1] = 50;
						}
						if (local102.aBoolean182) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local102.aBoolean172) {
							this.aByteArrayArrayArray6[arg5][arg1][arg4 + 1] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4 + 1] = 50;
						}
						if (local102.aBoolean182) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local102.aBoolean172) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4 + 1] = 50;
						}
						if (local102.aBoolean182) {
							this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local102.aBoolean172) {
							this.aByteArrayArrayArray6[arg5][arg1][arg4] = 50;
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4] = 50;
						}
						if (local102.aBoolean182) {
							this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
						}
					}
					if (local102.aBoolean178 && arg3 != null) {
						arg3.method257(arg8, arg1, aBoolean55, local102.aBoolean176, arg7, arg4);
					}
					if (local102.anInt659 != 16) {
						arg0.method472(local102.anInt659, arg4, arg5, arg1);
					}
				} else if (arg8 == 1) {
					if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
						local157 = local102.method434(1, arg7, local54, local65, local78, local89, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 1, arg7, local78, local102.anInt658);
					}
					arg0.method464(null, local114, local128, 0, local157, local99, arg1, arg5, arg4, anIntArray31[arg7]);
					if (local102.aBoolean172) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray6[arg5][arg1][arg4 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray6[arg5][arg1][arg4] = 50;
						}
					}
					if (local102.aBoolean178 && arg3 != null) {
						arg3.method257(arg8, arg1, aBoolean55, local102.aBoolean176, arg7, arg4);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class1_Sub1_Sub1 local895;
					if (arg8 == 2) {
						local866 = arg7 + 1 & 0x3;
						@Pc(885) Class1_Sub1_Sub1 local885;
						if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
							local885 = local102.method434(2, arg7 + 4, local54, local65, local78, local89, -1);
							local895 = local102.method434(2, local866, local54, local65, local78, local89, -1);
						} else {
							local885 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 2, arg7 + 4, local78, local102.anInt658);
							local895 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 2, local866, local78, local102.anInt658);
						}
						arg0.method464(local895, local114, local128, anIntArray23[local866], local885, local99, arg1, arg5, arg4, anIntArray23[arg7]);
						if (local102.aBoolean182) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray2[arg5][arg1 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x492;
								this.anIntArrayArrayArray2[arg5][arg1][arg4] |= 0x249;
							}
						}
						if (local102.aBoolean178 && arg3 != null) {
							arg3.method257(arg8, arg1, aBoolean55, local102.aBoolean176, arg7, arg4);
						}
						if (local102.anInt659 != 16) {
							arg0.method472(local102.anInt659, arg4, arg5, arg1);
						}
					} else if (arg8 == 3) {
						if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
							local157 = local102.method434(3, arg7, local54, local65, local78, local89, -1);
						} else {
							local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 3, arg7, local78, local102.anInt658);
						}
						arg0.method464(null, local114, local128, 0, local157, local99, arg1, arg5, arg4, anIntArray31[arg7]);
						if (local102.aBoolean172) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray6[arg5][arg1][arg4 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray6[arg5][arg1 + 1][arg4] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray6[arg5][arg1][arg4] = 50;
							}
						}
						if (local102.aBoolean178 && arg3 != null) {
							arg3.method257(arg8, arg1, aBoolean55, local102.aBoolean176, arg7, arg4);
						}
					} else if (arg8 == 9) {
						if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
							local157 = local102.method434(arg8, arg7, local54, local65, local78, local89, -1);
						} else {
							local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, arg8, arg7, local78, local102.anInt658);
						}
						arg0.method466(arg4, arg1, local99, local114, 0, local157, 1, arg5, 1, local128);
						if (local102.aBoolean178 && arg3 != null) {
							arg3.method258(arg4, arg1, local102.anInt664, arg7, local102.anInt647, local102.aBoolean176);
						}
					} else {
						if (local102.aBoolean181) {
							if (arg7 == 1) {
								local866 = local89;
								local89 = local78;
								local78 = local65;
								local65 = local54;
								local54 = local866;
							} else if (arg7 == 2) {
								local866 = local89;
								local89 = local65;
								local65 = local866;
								local866 = local78;
								local78 = local54;
								local54 = local866;
							} else if (arg7 == 3) {
								local866 = local89;
								local89 = local54;
								local54 = local65;
								local65 = local78;
								local78 = local866;
							}
						}
						if (arg8 == 4) {
							if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
								local157 = local102.method434(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 4, 0, local78, local102.anInt658);
							}
							arg0.method465(local99, arg1, arg5, local114, arg7 * 512, local128, local157, arg4, anIntArray23[arg7], 0, 0);
						} else if (arg8 == 5) {
							local866 = 16;
							local255 = arg0.method482(arg5, arg1, arg4);
							if (local255 > 0) {
								local866 = Class38.method442(local255 >> 14 & 0x7FFF).anInt659;
							}
							if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
								local895 = local102.method434(4, 0, local54, local65, local78, local89, -1);
							} else {
								local895 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 4, 0, local78, local102.anInt658);
							}
							arg0.method465(local99, arg1, arg5, local114, arg7 * 512, local128, local895, arg4, anIntArray23[arg7], anIntArray24[arg7] * local866, anIntArray25[arg7] * local866);
						} else if (arg8 == 6) {
							if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
								local157 = local102.method434(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 4, 0, local78, local102.anInt658);
							}
							arg0.method465(local99, arg1, arg5, local114, arg7, local128, local157, arg4, 256, 0, 0);
						} else if (arg8 == 7) {
							if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
								local157 = local102.method434(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 4, 0, local78, local102.anInt658);
							}
							arg0.method465(local99, arg1, arg5, local114, arg7, local128, local157, arg4, 512, 0, 0);
						} else if (arg8 == 8) {
							if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
								local157 = local102.method434(4, 0, local54, local65, local78, local89, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 4, 0, local78, local102.anInt658);
							}
							arg0.method465(local99, arg1, arg5, local114, arg7, local128, local157, arg4, 768, 0, 0);
						}
					}
				}
			} else if (!aBoolean59 || local102.aBoolean175 || local102.aBoolean180) {
				if (local102.anInt658 == -1 && local102.anIntArray155 == null) {
					local157 = local102.method434(22, arg7, local54, local65, local78, local89, -1);
				} else {
					local157 = new Class1_Sub1_Sub1_Sub5((byte) 1, true, local89, local54, local65, arg6, 22, arg7, local78, local102.anInt658);
				}
				arg0.method462(local128, arg5, local99, local114, arg4, aByte11, arg1, local157);
				if (local102.aBoolean178 && local102.aBoolean175 && arg3 != null) {
					arg3.method259(arg1, arg4);
				}
			}
		} catch (@Pc(1640) RuntimeException local1640) {
			signlink.reporterror("68468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1640.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "b", descriptor = "(III)I")
	private int method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(I[BIZII[Lclient!HQFIXEZL;)V")
	public void method164(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class18[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg0 + local7 > 0 && arg0 + local7 < 103 && arg4 + local11 > 0 && arg4 + local11 < 103) {
							arg5[local3].anIntArrayArray4[arg0 + local7][arg4 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(70) Class1_Sub1_Sub2 local70 = new Class1_Sub1_Sub2(arg1, 792);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
					for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
						this.method152(local70, local76 + arg0, arg2, local80 + arg4, 0, local11, arg3);
					}
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("92973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(Lclient!SIPXLNWG;[Lclient!HQFIXEZL;B)V")
	public void method165(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class18[] arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray2[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method259(local7, local11);
							}
						}
					}
				}
			}
			anInt210 += (int) (Math.random() * 5.0D) - 2;
			if (anInt210 < -8) {
				anInt210 = -8;
			}
			if (anInt210 > 8) {
				anInt210 = 8;
			}
			anInt208 += (int) (Math.random() * 5.0D) - 2;
			if (anInt208 < -16) {
				anInt208 = -16;
			}
			if (anInt208 > 16) {
				anInt208 = 16;
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
				for (local141 = 1; local141 < this.anInt213 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt212 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray2[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt213; local145++) {
					this.anIntArray26[local145] = 0;
					this.anIntArray27[local145] = 0;
					this.anIntArray28[local145] = 0;
					this.anIntArray29[local145] = 0;
					this.anIntArray30[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt212 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt213; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt212) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class48 local378 = Class48.aClass48Array1[local210 - 1];
								this.anIntArray26[local191] += local378.anInt828;
								this.anIntArray27[local191] += local378.anInt826;
								this.anIntArray28[local191] += local378.anInt827;
								this.anIntArray29[local191] += local378.anInt829;
								local419 = this.anIntArray30[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt212) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class48 local451 = Class48.aClass48Array1[local214 - 1];
								this.anIntArray26[local191] -= local451.anInt828;
								this.anIntArray27[local191] -= local451.anInt826;
								this.anIntArray28[local191] -= local451.anInt827;
								this.anIntArray29[local191] -= local451.anInt829;
								local419 = this.anIntArray30[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt212 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt213 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt213) {
								local204 += this.anIntArray26[local527];
								local210 += this.anIntArray27[local527];
								local214 += this.anIntArray28[local527];
								local220 += this.anIntArray29[local527];
								local236 += this.anIntArray30[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt213) {
								local204 -= this.anIntArray26[local572];
								local210 -= this.anIntArray27[local572];
								local214 -= this.anIntArray28[local572];
								local220 -= this.anIntArray29[local572];
								local236 -= this.anIntArray30[local572];
							}
							if (local284 >= 1 && local284 < this.anInt213 - 1 && (!aBoolean59 || (this.aByteArrayArrayArray2[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray2[local7][local169][local284] & 0x10) == 0 && this.method167(this.aByte13, local169, local7, local284) == anInt209)) {
								if (local7 < anInt211) {
									anInt211 = local7;
								}
								@Pc(672) int local672 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(683) int local683 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								if (local672 > 0 || local683 > 0) {
									@Pc(696) int local696 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(707) int local707 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(720) int local720 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(731) int local731 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(738) int local738 = this.anIntArrayArray2[local169][local284];
									@Pc(747) int local747 = this.anIntArrayArray2[local169 + 1][local284];
									@Pc(758) int local758 = this.anIntArrayArray2[local169 + 1][local284 + 1];
									@Pc(767) int local767 = this.anIntArrayArray2[local169][local284 + 1];
									@Pc(769) int local769 = -1;
									@Pc(771) int local771 = -1;
									@Pc(779) int local779;
									@Pc(783) int local783;
									if (local672 > 0) {
										local779 = local204 * 256 / local220;
										local783 = local210 / local236;
										@Pc(787) int local787 = local214 / local236;
										local769 = this.method159(local779, local783, local787);
										@Pc(799) int local799 = local779 + anInt210 & 0xFF;
										local787 += anInt208;
										if (local787 < 0) {
											local787 = 0;
										} else if (local787 > 255) {
											local787 = 255;
										}
										local771 = this.method159(local799, local783, local787);
									}
									if (local7 > 0) {
										@Pc(824) boolean local824 = true;
										if (local672 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local824 = false;
										}
										if (local683 > 0 && !Class48.aClass48Array1[local683 - 1].aBoolean216) {
											local824 = false;
										}
										if (local824 && local696 == local707 && local696 == local720 && local696 == local731) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local779 = 0;
									if (local769 != -1) {
										local779 = Class1_Sub1_Sub3_Sub4.anIntArray184[method172(local771, 96)];
									}
									if (local683 == 0) {
										arg0.method461(local7, local169, local284, 0, 0, -1, local696, local707, local720, local731, method172(local769, local738), method172(local769, local747), method172(local769, local758), method172(local769, local767), 0, 0, 0, 0, local779, 0);
									} else {
										local783 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(936) byte local936 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(942) Class48 local942 = Class48.aClass48Array1[local683 - 1];
										@Pc(945) int local945 = local942.anInt824;
										@Pc(953) int local953;
										@Pc(951) int local951;
										if (local945 >= 0) {
											local951 = Class1_Sub1_Sub3_Sub4.method527(local945);
											local953 = -1;
										} else if (local942.anInt823 == 16711935) {
											local951 = 0;
											local953 = -2;
											local945 = -1;
										} else {
											local953 = this.method159(local942.anInt825, local942.anInt826, local942.anInt827);
											local951 = Class1_Sub1_Sub3_Sub4.anIntArray184[this.method156(local942.anInt830, 96)];
										}
										arg0.method461(local7, local169, local284, local783, local936, local945, local696, local707, local720, local731, method172(local769, local738), method172(local769, local747), method172(local769, local758), method172(local769, local767), this.method156(local953, local738), this.method156(local953, local747), this.method156(local953, local758), this.method156(local953, local767), local779, local951);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt213 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt212 - 1; local204++) {
						arg0.method460(local7, local204, local191, this.method167(this.aByte13, local204, local7, local191));
					}
				}
			}
			if (arg2 != 19) {
				this.aBoolean57 = !this.aBoolean57;
			}
			arg0.method487(148);
			for (local11 = 0; local11 < this.anInt212; local11++) {
				for (local27 = 0; local27 < this.anInt213; local27++) {
					if ((this.aByteArrayArrayArray2[1][local11][local27] & 0x2) == 2) {
						arg0.method458(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1136) int local1136 = 2;
			@Pc(1138) int local1138 = 4;
			for (@Pc(1140) int local1140 = 0; local1140 < 4; local1140++) {
				if (local1140 > 0) {
					local27 <<= 0x3;
					local1136 <<= 0x3;
					local1138 <<= 0x3;
				}
				for (@Pc(1158) int local1158 = 0; local1158 <= local1140; local1158++) {
					for (local133 = 0; local133 <= this.anInt213; local133++) {
						for (local139 = 0; local139 <= this.anInt212; local139++) {
							if ((this.anIntArrayArrayArray2[local1158][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1158;
								local191 = local1158;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1158][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt213 && (this.anIntArrayArrayArray2[local1158][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label337: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label337;
										}
									}
									local169--;
								}
								label326: while (local191 < local1140) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label326;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class40.method459(local139 * 128, local220, local145 * 128 + 128, local1140, local139 * 128, 1, local214, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1158][local139][local133] & local1136) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1158;
								local191 = local1158;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1158][local141 - 1][local133] & local1136) != 0) {
									local141--;
								}
								while (local145 < this.anInt212 && (this.anIntArrayArrayArray2[local1158][local145 + 1][local133] & local1136) != 0) {
									local145++;
								}
								label390: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1136) == 0) {
											break label390;
										}
									}
									local169--;
								}
								label379: while (local191 < local1140) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1136) == 0) {
											break label379;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class40.method459(local145 * 128 + 128, local220, local133 * 128, local1140, local141 * 128, 2, local214, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1136;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1158][local139][local133] & local1138) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1158][local139][local169 - 1] & local1138) != 0) {
									local169--;
								}
								while (local191 < this.anInt213 && (this.anIntArrayArrayArray2[local1158][local139][local191 + 1] & local1138) != 0) {
									local191++;
								}
								label443: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1158][local141 - 1][local204] & local1138) == 0) {
											break label443;
										}
									}
									local141--;
								}
								label432: while (local145 < this.anInt212) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1158][local145 + 1][local204] & local1138) == 0) {
											break label432;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1158][local141][local169];
									Class40.method459(local145 * 128 + 128, local204, local191 * 128 + 128, local1140, local141 * 128, 4, local204, local169 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1158][local210][local214] &= ~local1138;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1773) RuntimeException local1773) {
			signlink.reporterror("38551, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1773.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(BIII)I")
	private int method167(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 == this.aByte12) {
				@Pc(7) boolean local7 = false;
			} else {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			if ((this.aByteArrayArrayArray2[arg2][arg1][arg3] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray2[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("18287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "([BI[Lclient!HQFIXEZL;IZIILclient!SIPXLNWG;III)V")
	public void method169(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(arg0, 792);
			@Pc(14) int local14 = -1;
			while (true) {
				@Pc(17) int local17 = local7.method73();
				if (local17 == 0) {
					return;
				}
				local14 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local7.method73();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local7.method59();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					if (local50 == arg4 && local46 >= arg9 && local46 < arg9 + 8 && local40 >= arg1 && local40 < arg1 + 8) {
						@Pc(83) Class38 local83 = Class38.method442(local14);
						@Pc(100) int local100 = arg5 + Class39.method453(local61, local83.anInt664, local46 & 0x7, local40 & 0x7, local83.anInt647, arg8);
						@Pc(117) int local117 = arg7 + Class39.method454(local83.anInt647, arg8, local83.anInt664, local46 & 0x7, local61, local40 & 0x7);
						if (local100 > 0 && local117 > 0 && local100 < 103 && local117 < 103) {
							@Pc(129) int local129 = arg3;
							if ((this.aByteArrayArrayArray2[1][local100][local117] & 0x2) == 2) {
								local129 = arg3 - 1;
							}
							@Pc(144) Class18 local144 = null;
							if (local129 >= 0) {
								local144 = arg2[local129];
							}
							this.method157(arg6, local100, 552, local144, local117, arg3, local14, local61 + arg8 & 0x3, local57);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("24417, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(III[BII[Lclient!HQFIXEZL;III)V")
	public void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class18[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg8 + local3 > 0 && arg8 + local3 < 103 && arg9 + local7 > 0 && arg9 + local7 < 103) {
						arg6[arg4].anIntArrayArray4[arg8 + local3][arg9 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub2 local57 = new Class1_Sub1_Sub2(arg3, 792);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg0 && local63 >= arg5 && local63 < arg5 + 8 && local67 >= arg2 && local67 < arg2 + 8) {
							this.method152(local57, arg8 + Class39.method451(arg7, local67 & 0x7, local63 & 0x7), 0, arg9 + Class39.method452(local67 & 0x7, local63 & 0x7, arg7, 684), arg7, arg4, 0);
						} else {
							this.method152(local57, -1, 0, -1, 0, 0, 0);
						}
					}
				}
			}
			@Pc(146) boolean local146 = false;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("27971, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIFHBVBT", name = "a", descriptor = "(Lclient!SIPXLNWG;[Lclient!HQFIXEZL;[BIII)V")
	public void method171(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class18[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(arg2, 792);
			@Pc(20) int local20 = -1;
			while (true) {
				@Pc(23) int local23 = local7.method73();
				if (local23 == 0) {
					return;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				while (true) {
					@Pc(34) int local34 = local7.method73();
					if (local34 == 0) {
						break;
					}
					local31 += local34 - 1;
					@Pc(46) int local46 = local31 & 0x3F;
					@Pc(52) int local52 = local31 >> 6 & 0x3F;
					@Pc(56) int local56 = local31 >> 12;
					@Pc(59) int local59 = local7.method59();
					@Pc(63) int local63 = local59 >> 2;
					@Pc(67) int local67 = local59 & 0x3;
					@Pc(71) int local71 = local52 + arg4;
					@Pc(75) int local75 = local46 + arg3;
					if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
						@Pc(87) int local87 = local56;
						if ((this.aByteArrayArrayArray2[1][local71][local75] & 0x2) == 2) {
							local87 = local56 - 1;
						}
						@Pc(102) Class18 local102 = null;
						if (local87 >= 0) {
							local102 = arg1[local87];
						}
						this.method157(arg0, local71, 552, local102, local75, local56, local20, local67, local63);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("96797, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -267 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}
}
