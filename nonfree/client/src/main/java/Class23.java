import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KPOYRTLL")
public final class Class23 {

	@OriginalMember(owner = "client!KPOYRTLL", name = "s", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "I")
	private static int anInt367 = 3;

	@OriginalMember(owner = "client!KPOYRTLL", name = "d", descriptor = "[I")
	private static final int[] anIntArray69 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!KPOYRTLL", name = "j", descriptor = "[I")
	private static final int[] anIntArray75 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!KPOYRTLL", name = "m", descriptor = "I")
	public static int anInt368 = 99;

	@OriginalMember(owner = "client!KPOYRTLL", name = "r", descriptor = "Z")
	private static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!KPOYRTLL", name = "u", descriptor = "[I")
	private static final int[] anIntArray76 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!KPOYRTLL", name = "v", descriptor = "[I")
	private static final int[] anIntArray77 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!KPOYRTLL", name = "z", descriptor = "I")
	private static int anInt374 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!KPOYRTLL", name = "B", descriptor = "I")
	private static int anInt376 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!KPOYRTLL", name = "E", descriptor = "Z")
	public static boolean aBoolean94 = true;

	@OriginalMember(owner = "client!KPOYRTLL", name = "q", descriptor = "I")
	private int anInt371 = 823;

	@OriginalMember(owner = "client!KPOYRTLL", name = "y", descriptor = "I")
	private int anInt373 = 45492;

	@OriginalMember(owner = "client!KPOYRTLL", name = "A", descriptor = "I")
	private int anInt375 = -17707;

	@OriginalMember(owner = "client!KPOYRTLL", name = "D", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!KPOYRTLL", name = "n", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!KPOYRTLL", name = "o", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!KPOYRTLL", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!KPOYRTLL", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!KPOYRTLL", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!KPOYRTLL", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!KPOYRTLL", name = "x", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!KPOYRTLL", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!KPOYRTLL", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!KPOYRTLL", name = "e", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!KPOYRTLL", name = "f", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!KPOYRTLL", name = "g", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!KPOYRTLL", name = "h", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!KPOYRTLL", name = "i", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(III)I")
	private static int method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method178(local3, local13);
		@Pc(29) int local29 = method178(local3 + 1, local13);
		@Pc(35) int local35 = method178(local3, local13 + 1);
		@Pc(43) int local43 = method178(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method177(local23, local29, local9, arg2);
		@Pc(55) int local55 = method177(local35, local43, local9, arg2);
		return method177(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "(III)Z")
	public static boolean method167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class28 local2 = Class28.method268(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method274(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("77839, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(II)I")
	private static int method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(ZLclient!RGCGKKUR;Lclient!NTGEPOMK;)V")
	public static void method170(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method425();
				if (local9 == 0) {
					return;
				}
				local3 += local9;
				@Pc(18) Class28 local18 = Class28.method268(local3);
				local18.method269((byte) 8, arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method425();
					if (local25 == 0) {
						break;
					}
					arg0.method411();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("18233, " + true + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(Lclient!OUUKQIMK;IIILclient!ASFXKKJM;II[[[IIII)V")
	public static void method173(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(9) int local9 = arg7[arg1][arg10][arg9];
			@Pc(19) int local19 = arg7[arg1][arg10 + 1][arg9];
			@Pc(31) int local31 = arg7[arg1][arg10 + 1][arg9 + 1];
			@Pc(41) int local41 = arg7[arg1][arg10][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class28 local54 = Class28.method268(arg8);
			@Pc(66) int local66 = arg10 + (arg9 << 7) + (arg8 << 14) + 1073741824;
			if (!local54.aBoolean130) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg5 << 6) + arg3);
			@Pc(84) int local84;
			if (arg6 <= 0) {
				for (local84 = 1; local84 > 0; local84++) {
				}
			}
			@Pc(109) Class6_Sub1_Sub2 local109;
			if (arg3 == 22) {
				if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
					local109 = local54.method273(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, 22, local9, local54.anInt472, true, true, arg8);
				}
				arg0.method325(arg9, local80, arg2, arg10, local109, local51, local66);
				if (local54.aBoolean135 && local54.aBoolean130) {
					arg4.method8(arg10, arg9);
				}
			} else {
				@Pc(205) int local205;
				if (arg3 == 10 || arg3 == 11) {
					if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
						local109 = local54.method273(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, 10, local9, local54.anInt472, true, true, arg8);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg3 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg5 == 1 || arg5 == 3) {
							local205 = local54.anInt483;
							local208 = local54.anInt489;
						} else {
							local205 = local54.anInt489;
							local208 = local54.anInt483;
						}
						arg0.method329(arg10, local205, local80, arg2, local208, local192, local51, arg9, (byte) 2, local109, local66);
					}
					if (local54.aBoolean135) {
						arg4.method7(arg9, arg5, arg10, local54.aBoolean127, local54.anInt483, local54.anInt489);
					}
				} else if (arg3 >= 12) {
					if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
						local109 = local54.method273(arg3, arg5, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, arg3, local9, local54.anInt472, true, true, arg8);
					}
					arg0.method329(arg10, 1, local80, arg2, 1, 0, local51, arg9, (byte) 2, local109, local66);
					if (local54.aBoolean135) {
						arg4.method7(arg9, arg5, arg10, local54.aBoolean127, local54.anInt483, local54.anInt489);
					}
				} else if (arg3 == 0) {
					if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
						local109 = local54.method273(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, 0, local9, local54.anInt472, true, true, arg8);
					}
					arg0.method327(arg10, arg2, local109, null, local80, 0, anIntArray76[arg5], local51, arg9, local66);
					if (local54.aBoolean135) {
						arg4.method6(anInt367, arg9, local54.aBoolean127, arg3, arg10, arg5);
					}
				} else if (arg3 == 1) {
					if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
						local109 = local54.method273(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, 1, local9, local54.anInt472, true, true, arg8);
					}
					arg0.method327(arg10, arg2, local109, null, local80, 0, anIntArray75[arg5], local51, arg9, local66);
					if (local54.aBoolean135) {
						arg4.method6(anInt367, arg9, local54.aBoolean127, arg3, arg10, arg5);
					}
				} else {
					@Pc(480) Class6_Sub1_Sub2 local480;
					if (arg3 == 2) {
						local84 = arg5 + 1 & 0x3;
						@Pc(470) Class6_Sub1_Sub2 local470;
						if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
							local470 = local54.method273(2, arg5 + 4, local9, local19, local31, local41, -1);
							local480 = local54.method273(2, local84, local9, local19, local31, local41, -1);
						} else {
							local470 = new Class6_Sub1_Sub2_Sub6(local19, arg5 + 4, local31, local41, 2, local9, local54.anInt472, true, true, arg8);
							local480 = new Class6_Sub1_Sub2_Sub6(local19, local84, local31, local41, 2, local9, local54.anInt472, true, true, arg8);
						}
						arg0.method327(arg10, arg2, local470, local480, local80, anIntArray76[local84], anIntArray76[arg5], local51, arg9, local66);
						if (local54.aBoolean135) {
							arg4.method6(anInt367, arg9, local54.aBoolean127, arg3, arg10, arg5);
						}
					} else if (arg3 == 3) {
						if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
							local109 = local54.method273(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, 3, local9, local54.anInt472, true, true, arg8);
						}
						arg0.method327(arg10, arg2, local109, null, local80, 0, anIntArray75[arg5], local51, arg9, local66);
						if (local54.aBoolean135) {
							arg4.method6(anInt367, arg9, local54.aBoolean127, arg3, arg10, arg5);
						}
					} else if (arg3 == 9) {
						if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
							local109 = local54.method273(arg3, arg5, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class6_Sub1_Sub2_Sub6(local19, arg5, local31, local41, arg3, local9, local54.anInt472, true, true, arg8);
						}
						arg0.method329(arg10, 1, local80, arg2, 1, 0, local51, arg9, (byte) 2, local109, local66);
						if (local54.aBoolean135) {
							arg4.method7(arg9, arg5, arg10, local54.aBoolean127, local54.anInt483, local54.anInt489);
						}
					} else {
						if (local54.aBoolean128) {
							if (arg5 == 1) {
								local84 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local84;
							} else if (arg5 == 2) {
								local84 = local41;
								local41 = local19;
								local19 = local84;
								local84 = local31;
								local31 = local9;
								local9 = local84;
							} else if (arg5 == 3) {
								local84 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local84;
							}
						}
						if (arg3 == 4) {
							if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
								local109 = local54.method273(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class6_Sub1_Sub2_Sub6(local19, 0, local31, local41, 4, local9, local54.anInt472, true, true, arg8);
							}
							arg0.method328(local109, local80, arg5 * 512, anIntArray76[arg5], arg9, arg2, 0, local51, 0, arg10, local66);
						} else if (arg3 == 5) {
							local84 = 16;
							local205 = arg0.method345(arg2, arg10, arg9);
							if (local205 > 0) {
								local84 = Class28.method268(local205 >> 14 & 0x7FFF).anInt474;
							}
							if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
								local480 = local54.method273(4, 0, local9, local19, local31, local41, -1);
							} else {
								local480 = new Class6_Sub1_Sub2_Sub6(local19, 0, local31, local41, 4, local9, local54.anInt472, true, true, arg8);
							}
							arg0.method328(local480, local80, arg5 * 512, anIntArray76[arg5], arg9, arg2, anIntArray69[arg5] * local84, local51, anIntArray77[arg5] * local84, arg10, local66);
						} else if (arg3 == 6) {
							if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
								local109 = local54.method273(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class6_Sub1_Sub2_Sub6(local19, 0, local31, local41, 4, local9, local54.anInt472, true, true, arg8);
							}
							arg0.method328(local109, local80, arg5, 256, arg9, arg2, 0, local51, 0, arg10, local66);
						} else if (arg3 == 7) {
							if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
								local109 = local54.method273(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class6_Sub1_Sub2_Sub6(local19, 0, local31, local41, 4, local9, local54.anInt472, true, true, arg8);
							}
							arg0.method328(local109, local80, arg5, 512, arg9, arg2, 0, local51, 0, arg10, local66);
						} else if (arg3 == 8) {
							if (local54.anInt472 == -1 && local54.anIntArray127 == null) {
								local109 = local54.method273(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class6_Sub1_Sub2_Sub6(local19, 0, local31, local41, 4, local9, local54.anInt472, true, true, arg8);
							}
							arg0.method328(local109, local80, arg5, 768, arg9, arg2, 0, local51, 0, arg10, local66);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("95319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(IIII)I")
	private static int method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class6_Sub1_Sub1_Sub1.anIntArray11[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(II)I")
	private static int method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method169(arg0 - 1, arg1 - 1) + method169(arg0 + 1, arg1 - 1) + method169(arg0 - 1, arg1 + 1) + method169(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method169(arg0 - 1, arg1) + method169(arg0 + 1, arg1) + method169(arg0, arg1 - 1) + method169(arg0, arg1 + 1);
		@Pc(59) int local59 = method169(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "c", descriptor = "(II)I")
	private static int method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!KPOYRTLL", name = "d", descriptor = "(II)I")
	private static int method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method163(arg0 + 45365, arg1 + 91923, 4) + (method163(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method163(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(I[BII)Z")
	public static boolean method183(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class6_Sub1_Sub4 local9 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local9.method425();
				if (local21 == 0) {
					return local3;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method425();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method411() >> 2;
						@Pc(73) int local73 = local64 + arg2;
						@Pc(77) int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class28 local90 = Class28.method268(local11);
							if (local69 != 22 || !aBoolean94 || local90.aBoolean130 || local90.aBoolean125) {
								local3 &= local90.method277(aBoolean92);
								local31 = true;
							}
						}
					}
					local36 = local9.method425();
					if (local36 == 0) {
						break;
					}
					local9.method411();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("44502, " + 49844 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "<init>", descriptor = "(BII[[[B[[[I)V")
	public Class23(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt368 = 99;
			this.anInt369 = arg1;
			this.anInt370 = arg2;
			this.anIntArrayArrayArray2 = arg4;
			this.aByteArrayArrayArray6 = arg3;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt369][this.anInt370];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt369][this.anInt370];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt369][this.anInt370];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt369][this.anInt370];
			this.anIntArrayArrayArray1 = new int[4][this.anInt369 + 1][this.anInt370 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt369 + 1][this.anInt370 + 1];
			this.anIntArrayArray7 = new int[this.anInt369 + 1][this.anInt370 + 1];
			this.anIntArray70 = new int[this.anInt370];
			this.anIntArray71 = new int[this.anInt370];
			this.anIntArray72 = new int[this.anInt370];
			this.anIntArray73 = new int[this.anInt370];
			this.anIntArray74 = new int[this.anInt370];
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("62297, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIIIBI[B[Lclient!ASFXKKJM;I)V")
	public void method164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) Class3[] arg8, @OriginalArg(9) int arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg0 + local3 > 0 && arg0 + local3 < 103 && arg4 + local7 > 0 && arg4 + local7 < 103) {
						arg8[arg6].anIntArrayArray1[arg0 + local3][arg4 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class6_Sub1_Sub4 local57 = new Class6_Sub1_Sub4(arg7, (byte) -17);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg9 && local63 >= arg2 && local63 < arg2 + 8 && local67 >= arg3 && local67 < arg3 + 8) {
							this.method168(arg6, 0, arg4 + Class1.method2(arg1, this.anInt375, local67 & 0x7, local63 & 0x7), 0, arg0 + Class1.method1(local67 & 0x7, arg1, local63 & 0x7), arg1, local57);
						} else {
							this.method168(0, 0, -1, 0, -1, 0, local57);
						}
					}
				}
			}
			if (arg5 == -111) {
				;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("11580, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([Lclient!ASFXKKJM;[BIIIIIIIILclient!OUUKQIMK;)V")
	public void method165(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class32 arg9) {
		try {
			@Pc(7) Class6_Sub1_Sub4 local7 = new Class6_Sub1_Sub4(arg1, (byte) -17);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method425();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method425();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method411();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg4 && local51 >= arg2 && local51 < arg2 + 8 && local45 >= arg3 && local45 < arg3 + 8) {
						@Pc(88) Class28 local88 = Class28.method268(local19);
						@Pc(105) int local105 = arg5 + Class1.method3(local88.anInt489, local45 & 0x7, local88.anInt483, local66, local51 & 0x7, arg8);
						@Pc(122) int local122 = arg7 + Class1.method4(local66, local45 & 0x7, local88.anInt489, arg8, local51 & 0x7, local88.anInt483);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg6;
							if ((this.aByteArrayArrayArray6[1][local105][local122] & 0x2) == 2) {
								local134 = arg6 - 1;
							}
							@Pc(149) Class3 local149 = null;
							if (local134 >= 0) {
								local149 = arg0[local134];
							}
							this.method174(local62, local149, arg9, local19, local105, local66 + arg8 & 0x3, local122, arg6);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("81105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "b", descriptor = "(III)I")
	private int method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IZIIIIILclient!RGCGKKUR;)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub1_Sub4 arg6) {
		try {
			@Pc(33) int local33;
			if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
				this.aByteArrayArrayArray6[arg0][arg4][arg2] = 0;
				while (true) {
					local33 = arg6.method411();
					if (local33 == 0) {
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg4][arg2] = -method182(arg4 + arg1 + 932731, arg2 + 556238 + arg3) * 8;
							return;
						} else {
							this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0 - 1][arg4][arg2] - 240;
							return;
						}
					}
					if (local33 == 1) {
						@Pc(87) int local87 = arg6.method411();
						if (local87 == 1) {
							local87 = 0;
						}
						if (arg0 == 0) {
							this.anIntArrayArrayArray2[0][arg4][arg2] = -local87 * 8;
							return;
						}
						this.anIntArrayArrayArray2[arg0][arg4][arg2] = this.anIntArrayArrayArray2[arg0 - 1][arg4][arg2] - local87 * 8;
						return;
					}
					if (local33 <= 49) {
						this.aByteArrayArrayArray1[arg0][arg4][arg2] = arg6.method412();
						this.aByteArrayArrayArray3[arg0][arg4][arg2] = (byte) ((local33 - 2) / 4);
						this.aByteArrayArrayArray5[arg0][arg4][arg2] = (byte) (local33 + arg5 - 2 & 0x3);
					} else if (local33 <= 81) {
						this.aByteArrayArrayArray6[arg0][arg4][arg2] = (byte) (local33 - 49);
					} else {
						this.aByteArrayArrayArray4[arg0][arg4][arg2] = (byte) (local33 - 81);
					}
				}
			} else {
				while (true) {
					local33 = arg6.method411();
					if (local33 == 0) {
						return;
					}
					if (local33 == 1) {
						arg6.method411();
						return;
					}
					if (local33 <= 49) {
						arg6.method411();
					}
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("85238, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([BIZILclient!OUUKQIMK;[Lclient!ASFXKKJM;)V")
	public void method171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class32 arg3, @OriginalArg(5) Class3[] arg4) {
		try {
			@Pc(16) Class6_Sub1_Sub4 local16 = new Class6_Sub1_Sub4(arg0, (byte) -17);
			@Pc(18) int local18 = -1;
			while (true) {
				@Pc(21) int local21 = local16.method425();
				if (local21 == 0) {
					return;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local16.method425();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local16.method411();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg2;
					@Pc(73) int local73 = local44 + arg1;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray6[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class3 local100 = null;
						if (local85 >= 0) {
							local100 = arg4[local85];
						}
						this.method174(local61, local100, arg3, local18, local69, local65, local73, local54);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("69118, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIII)I")
	private int method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray6[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("30443, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 823 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(ILclient!ASFXKKJM;Lclient!OUUKQIMK;IIIIII)V")
	private void method174(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (aBoolean94 && (this.aByteArrayArrayArray6[0][arg4][arg6] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg7][arg4][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method172(arg4, arg6, arg7) != anInt372) {
					return;
				}
			}
			if (arg7 < anInt368) {
				anInt368 = arg7;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray2[arg7][arg4][arg6];
			@Pc(60) int local60 = this.anIntArrayArrayArray2[arg7][arg4 + 1][arg6];
			@Pc(73) int local73 = this.anIntArrayArrayArray2[arg7][arg4 + 1][arg6 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray2[arg7][arg4][arg6 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class28 local97 = Class28.method268(arg3);
			@Pc(118) int local118 = arg4 + (arg6 << 7) + (arg3 << 14) + 1073741824;
			if (!local97.aBoolean130) {
				local118 += Integer.MIN_VALUE;
			}
			@Pc(132) byte local132 = (byte) ((arg5 << 6) + arg0);
			@Pc(161) Class6_Sub1_Sub2 local161;
			if (arg0 != 22) {
				@Pc(259) int local259;
				if (arg0 == 10 || arg0 == 11) {
					if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
						local161 = local97.method273(10, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, 10, local49, local97.anInt472, true, true, arg3);
					}
					if (local161 != null) {
						@Pc(246) int local246 = 0;
						if (arg0 == 11) {
							local246 += 256;
						}
						@Pc(262) int local262;
						if (arg5 == 1 || arg5 == 3) {
							local259 = local97.anInt483;
							local262 = local97.anInt489;
						} else {
							local259 = local97.anInt489;
							local262 = local97.anInt483;
						}
						if (arg2.method329(arg4, local259, local132, arg7, local262, local246, local94, arg6, (byte) 2, local161, local118) && local97.aBoolean137) {
							@Pc(293) Class6_Sub1_Sub2_Sub5 local293;
							if (local161 instanceof Class6_Sub1_Sub2_Sub5) {
								local293 = (Class6_Sub1_Sub2_Sub5) local161;
							} else {
								local293 = local97.method273(10, arg5, local49, local60, local73, local84, -1);
							}
							if (local293 != null) {
								for (@Pc(309) int local309 = 0; local309 <= local259; local309++) {
									for (@Pc(313) int local313 = 0; local313 <= local262; local313++) {
										@Pc(320) int local320 = local293.anInt434 / 4;
										if (local320 > 30) {
											local320 = 30;
										}
										if (local320 > this.aByteArrayArrayArray2[arg7][arg4 + local309][arg6 + local313]) {
											this.aByteArrayArrayArray2[arg7][arg4 + local309][arg6 + local313] = (byte) local320;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean135 && arg1 != null) {
						arg1.method7(arg6, arg5, arg4, local97.aBoolean127, local97.anInt483, local97.anInt489);
					}
				} else if (arg0 >= 12) {
					if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
						local161 = local97.method273(arg0, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, arg0, local49, local97.anInt472, true, true, arg3);
					}
					arg2.method329(arg4, 1, local132, arg7, 1, 0, local94, arg6, (byte) 2, local161, local118);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x924;
					}
					if (local97.aBoolean135 && arg1 != null) {
						arg1.method7(arg6, arg5, arg4, local97.aBoolean127, local97.anInt483, local97.anInt489);
					}
				} else if (arg0 == 0) {
					if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
						local161 = local97.method273(0, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, 0, local49, local97.anInt472, true, true, arg3);
					}
					arg2.method327(arg4, arg7, local161, null, local132, 0, anIntArray76[arg5], local94, arg6, local118);
					if (arg5 == 0) {
						if (local97.aBoolean137) {
							this.aByteArrayArrayArray2[arg7][arg4][arg6] = 50;
							this.aByteArrayArrayArray2[arg7][arg4][arg6 + 1] = 50;
						}
						if (local97.aBoolean126) {
							this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local97.aBoolean137) {
							this.aByteArrayArrayArray2[arg7][arg4][arg6 + 1] = 50;
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6 + 1] = 50;
						}
						if (local97.aBoolean126) {
							this.anIntArrayArrayArray1[arg7][arg4][arg6 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local97.aBoolean137) {
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6] = 50;
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6 + 1] = 50;
						}
						if (local97.aBoolean126) {
							this.anIntArrayArrayArray1[arg7][arg4 + 1][arg6] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local97.aBoolean137) {
							this.aByteArrayArrayArray2[arg7][arg4][arg6] = 50;
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6] = 50;
						}
						if (local97.aBoolean126) {
							this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x492;
						}
					}
					if (local97.aBoolean135 && arg1 != null) {
						arg1.method6(anInt367, arg6, local97.aBoolean127, arg0, arg4, arg5);
					}
					if (local97.anInt474 != 16) {
						arg2.method335(arg7, arg4, local97.anInt474, arg6);
					}
				} else if (arg0 == 1) {
					if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
						local161 = local97.method273(1, arg5, local49, local60, local73, local84, -1);
					} else {
						local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, 1, local49, local97.anInt472, true, true, arg3);
					}
					arg2.method327(arg4, arg7, local161, null, local132, 0, anIntArray75[arg5], local94, arg6, local118);
					if (local97.aBoolean137) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray2[arg7][arg4][arg6 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray2[arg7][arg4][arg6] = 50;
						}
					}
					if (local97.aBoolean135 && arg1 != null) {
						arg1.method6(anInt367, arg6, local97.aBoolean127, arg0, arg4, arg5);
					}
				} else {
					@Pc(870) int local870;
					@Pc(899) Class6_Sub1_Sub2 local899;
					if (arg0 == 2) {
						local870 = arg5 + 1 & 0x3;
						@Pc(889) Class6_Sub1_Sub2 local889;
						if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
							local889 = local97.method273(2, arg5 + 4, local49, local60, local73, local84, -1);
							local899 = local97.method273(2, local870, local49, local60, local73, local84, -1);
						} else {
							local889 = new Class6_Sub1_Sub2_Sub6(local60, arg5 + 4, local73, local84, 2, local49, local97.anInt472, true, true, arg3);
							local899 = new Class6_Sub1_Sub2_Sub6(local60, local870, local73, local84, 2, local49, local97.anInt472, true, true, arg3);
						}
						arg2.method327(arg4, arg7, local889, local899, local132, anIntArray76[local870], anIntArray76[arg5], local94, arg6, local118);
						if (local97.aBoolean126) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x249;
								this.anIntArrayArrayArray1[arg7][arg4][arg6 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray1[arg7][arg4][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray1[arg7][arg4 + 1][arg6] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray1[arg7][arg4 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x492;
								this.anIntArrayArrayArray1[arg7][arg4][arg6] |= 0x249;
							}
						}
						if (local97.aBoolean135 && arg1 != null) {
							arg1.method6(anInt367, arg6, local97.aBoolean127, arg0, arg4, arg5);
						}
						if (local97.anInt474 != 16) {
							arg2.method335(arg7, arg4, local97.anInt474, arg6);
						}
					} else if (arg0 == 3) {
						if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
							local161 = local97.method273(3, arg5, local49, local60, local73, local84, -1);
						} else {
							local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, 3, local49, local97.anInt472, true, true, arg3);
						}
						arg2.method327(arg4, arg7, local161, null, local132, 0, anIntArray75[arg5], local94, arg6, local118);
						if (local97.aBoolean137) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray2[arg7][arg4][arg6 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray2[arg7][arg4 + 1][arg6] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray2[arg7][arg4][arg6] = 50;
							}
						}
						if (local97.aBoolean135 && arg1 != null) {
							arg1.method6(anInt367, arg6, local97.aBoolean127, arg0, arg4, arg5);
						}
					} else if (arg0 == 9) {
						if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
							local161 = local97.method273(arg0, arg5, local49, local60, local73, local84, -1);
						} else {
							local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, arg0, local49, local97.anInt472, true, true, arg3);
						}
						arg2.method329(arg4, 1, local132, arg7, 1, 0, local94, arg6, (byte) 2, local161, local118);
						if (local97.aBoolean135 && arg1 != null) {
							arg1.method7(arg6, arg5, arg4, local97.aBoolean127, local97.anInt483, local97.anInt489);
						}
					} else {
						if (local97.aBoolean128) {
							if (arg5 == 1) {
								local870 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local870;
							} else if (arg5 == 2) {
								local870 = local84;
								local84 = local60;
								local60 = local870;
								local870 = local73;
								local73 = local49;
								local49 = local870;
							} else if (arg5 == 3) {
								local870 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local870;
							}
						}
						if (arg0 == 4) {
							if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
								local161 = local97.method273(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class6_Sub1_Sub2_Sub6(local60, 0, local73, local84, 4, local49, local97.anInt472, true, true, arg3);
							}
							arg2.method328(local161, local132, arg5 * 512, anIntArray76[arg5], arg6, arg7, 0, local94, 0, arg4, local118);
						} else if (arg0 == 5) {
							local870 = 16;
							local259 = arg2.method345(arg7, arg4, arg6);
							if (local259 > 0) {
								local870 = Class28.method268(local259 >> 14 & 0x7FFF).anInt474;
							}
							if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
								local899 = local97.method273(4, 0, local49, local60, local73, local84, -1);
							} else {
								local899 = new Class6_Sub1_Sub2_Sub6(local60, 0, local73, local84, 4, local49, local97.anInt472, true, true, arg3);
							}
							arg2.method328(local899, local132, arg5 * 512, anIntArray76[arg5], arg6, arg7, anIntArray69[arg5] * local870, local94, anIntArray77[arg5] * local870, arg4, local118);
						} else if (arg0 == 6) {
							if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
								local161 = local97.method273(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class6_Sub1_Sub2_Sub6(local60, 0, local73, local84, 4, local49, local97.anInt472, true, true, arg3);
							}
							arg2.method328(local161, local132, arg5, 256, arg6, arg7, 0, local94, 0, arg4, local118);
						} else if (arg0 == 7) {
							if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
								local161 = local97.method273(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class6_Sub1_Sub2_Sub6(local60, 0, local73, local84, 4, local49, local97.anInt472, true, true, arg3);
							}
							arg2.method328(local161, local132, arg5, 512, arg6, arg7, 0, local94, 0, arg4, local118);
						} else if (arg0 == 8) {
							if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
								local161 = local97.method273(4, 0, local49, local60, local73, local84, -1);
							} else {
								local161 = new Class6_Sub1_Sub2_Sub6(local60, 0, local73, local84, 4, local49, local97.anInt472, true, true, arg3);
							}
							arg2.method328(local161, local132, arg5, 768, arg6, arg7, 0, local94, 0, arg4, local118);
						}
					}
				}
			} else if (!aBoolean94 || local97.aBoolean130 || local97.aBoolean125) {
				if (local97.anInt472 == -1 && local97.anIntArray127 == null) {
					local161 = local97.method273(22, arg5, local49, local60, local73, local84, -1);
				} else {
					local161 = new Class6_Sub1_Sub2_Sub6(local60, arg5, local73, local84, 22, local49, local97.anInt472, true, true, arg3);
				}
				arg2.method325(arg6, local132, arg7, arg4, local161, local94, local118);
				if (local97.aBoolean135 && local97.aBoolean130 && arg1 != null) {
					arg1.method8(arg4, arg6);
				}
			}
		} catch (@Pc(1644) RuntimeException local1644) {
			signlink.reporterror("62503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -127 + ", " + local1644.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIB)V")
	public void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) int local15;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				for (local15 = 0; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg2][arg0 + local11][arg1 + local15] = 0;
				}
			}
			if (arg0 > 0) {
				for (local15 = 1; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg2][arg0][arg1 + local15] = this.anIntArrayArrayArray2[arg2][arg0 - 1][arg1 + local15];
				}
			}
			if (arg1 > 0) {
				for (local15 = 1; local15 < 8; local15++) {
					this.anIntArrayArrayArray2[arg2][arg0 + local15][arg1] = this.anIntArrayArrayArray2[arg2][arg0 + local15][arg1 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg2][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray2[arg2][arg0][arg1] = this.anIntArrayArrayArray2[arg2][arg0 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray2[arg2][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg2][arg0][arg1] = this.anIntArrayArrayArray2[arg2][arg0][arg1 - 1];
			} else if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray2[arg2][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg2][arg0][arg1] = this.anIntArrayArrayArray2[arg2][arg0 - 1][arg1 - 1];
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("69219, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIIBI)V")
	public void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg0; local3++) {
				for (@Pc(7) int local7 = arg4; local7 <= arg4 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt369 && local3 >= 0 && local3 < this.anInt370) {
						this.aByteArrayArrayArray2[0][local7][local3] = 127;
						if (local7 == arg4 && local7 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 - 1][local3];
						}
						if (local7 == arg4 + arg2 && local7 < this.anInt369 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg0 && local3 < this.anInt370 - 1) {
							this.anIntArrayArrayArray2[0][local7][local3] = this.anIntArrayArrayArray2[0][local7][local3 + 1];
						}
					}
				}
			}
			@Pc(151) boolean local151 = false;
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("31378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "([Lclient!ASFXKKJM;Lclient!OUUKQIMK;I)V")
	public void method179(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class32 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray6[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method8(local7, local11);
							}
						}
					}
				}
			}
			anInt376 += (int) (Math.random() * 5.0D) - 2;
			if (anInt376 < -8) {
				anInt376 = -8;
			}
			if (anInt376 > 8) {
				anInt376 = 8;
			}
			anInt374 += (int) (Math.random() * 5.0D) - 2;
			if (anInt374 < -16) {
				anInt374 = -16;
			}
			if (anInt374 > 16) {
				anInt374 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray2[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt370 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt369 - 1; local145++) {
						local169 = this.anIntArrayArrayArray2[local7][local145 + 1][local141] - this.anIntArrayArrayArray2[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray2[local7][local145][local141 + 1] - this.anIntArrayArrayArray2[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray7[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt370; local145++) {
					this.anIntArray70[local145] = 0;
					this.anIntArray71[local145] = 0;
					this.anIntArray72[local145] = 0;
					this.anIntArray73[local145] = 0;
					this.anIntArray74[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt369 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt370; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt369) {
							local210 = this.aByteArrayArrayArray4[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class45 local378 = Class45.aClass45Array1[local210 - 1];
								this.anIntArray70[local191] += local378.anInt756;
								this.anIntArray71[local191] += local378.anInt754;
								this.anIntArray72[local191] += local378.anInt755;
								this.anIntArray73[local191] += local378.anInt757;
								local419 = this.anIntArray74[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt369) {
							local214 = this.aByteArrayArrayArray4[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class45 local451 = Class45.aClass45Array1[local214 - 1];
								this.anIntArray70[local191] -= local451.anInt756;
								this.anIntArray71[local191] -= local451.anInt754;
								this.anIntArray72[local191] -= local451.anInt755;
								this.anIntArray73[local191] -= local451.anInt757;
								local419 = this.anIntArray74[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt369 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt370 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt370) {
								local204 += this.anIntArray70[local527];
								local210 += this.anIntArray71[local527];
								local214 += this.anIntArray72[local527];
								local220 += this.anIntArray73[local527];
								local236 += this.anIntArray74[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt370) {
								local204 -= this.anIntArray70[local572];
								local210 -= this.anIntArray71[local572];
								local214 -= this.anIntArray72[local572];
								local220 -= this.anIntArray73[local572];
								local236 -= this.anIntArray74[local572];
							}
							if (local284 >= 1 && local284 < this.anInt370 - 1 && (!aBoolean94 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method172(local169, local284, local7) == anInt372)) {
								if (local7 < anInt368) {
									anInt368 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray4[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray2[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray2[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray2[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray2[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray7[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray7[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray7[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray7[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method166(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt376 & 0xFF;
										local786 += anInt374;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method166(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray3[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class45.aClass45Array1[local682 - 1].aBoolean198) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray1[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class6_Sub1_Sub1_Sub1.anIntArray15[method180(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method324(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method180(local768, local737), method180(local768, local746), method180(local768, local757), method180(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray3[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(941) Class45 local941 = Class45.aClass45Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt752;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class6_Sub1_Sub1_Sub1.method75(local944);
											local952 = -1;
										} else if (local941.anInt751 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class6_Sub1_Sub1_Sub1.anIntArray15[this.method184(local941.anInt758, 96)];
										} else {
											local952 = this.method166(local941.anInt753, local941.anInt754, local941.anInt755);
											local950 = Class6_Sub1_Sub1_Sub1.anIntArray15[this.method184(local941.anInt758, 96)];
										}
										arg1.method324(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method180(local768, local737), method180(local768, local746), method180(local768, local757), method180(local768, local766), this.method184(local952, local737), this.method184(local952, local746), this.method184(local952, local757), this.method184(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt370 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt369 - 1; local204++) {
						arg1.method323(local7, local204, local191, this.method172(local204, local191, local7));
					}
				}
			}
			arg1.method350();
			for (local11 = 0; local11 < this.anInt369; local11++) {
				for (local27 = 0; local27 < this.anInt370; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg1.method321(local27, (byte) 9, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1132) int local1132 = 2;
			@Pc(1134) int local1134 = 4;
			for (@Pc(1136) int local1136 = 0; local1136 < 4; local1136++) {
				if (local1136 > 0) {
					local27 <<= 0x3;
					local1132 <<= 0x3;
					local1134 <<= 0x3;
				}
				for (@Pc(1154) int local1154 = 0; local1154 <= local1136; local1154++) {
					for (local133 = 0; local133 <= this.anInt370; local133++) {
						for (local139 = 0; local139 <= this.anInt369; local139++) {
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1154][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt370 && (this.anIntArrayArrayArray1[local1154][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local139][local141];
									Class32.method322(local139 * 128, local145 * 128 + 128, local220, local1136, local214, 1, local139 * 128, local141 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local1132) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray1[local1154][local141 - 1][local133] & local1132) != 0) {
									local141--;
								}
								while (local145 < this.anInt369 && (this.anIntArrayArrayArray1[local1154][local145 + 1][local133] & local1132) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local169 - 1][local204][local133] & local1132) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray1[local191 + 1][local204][local133] & local1132) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray2[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray2[local169][local141][local133];
									Class32.method322(local141 * 128, local133 * 128, local220, local1136, local214, 2, local145 * 128 + 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray1[local236][local284][local133] &= ~local1132;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray1[local1154][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray1[local1154][local139][local169 - 1] & local1134) != 0) {
									local169--;
								}
								while (local191 < this.anInt370 && (this.anIntArrayArrayArray1[local1154][local139][local191 + 1] & local1134) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1154][local141 - 1][local204] & local1134) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt369) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray1[local1154][local145 + 1][local204] & local1134) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray2[local1154][local141][local169];
									Class32.method322(local141 * 128, local191 * 128 + 128, local204, local1136, local204, 4, local145 * 128 + 128, local169 * 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray1[local1154][local210][local214] &= ~local1134;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1769) RuntimeException local1769) {
			signlink.reporterror("41062, " + arg0 + ", " + arg1 + ", " + -2206 + ", " + local1769.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "a", descriptor = "(IIII[Lclient!ASFXKKJM;[BI)V")
	public void method181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg0 + local7 > 0 && arg0 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg3[local3].anIntArrayArray1[arg0 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(71) Class6_Sub1_Sub4 local71 = new Class6_Sub1_Sub4(arg4, (byte) -17);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
					for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
						this.method168(local11, arg5, local81 + arg2, arg1, local77 + arg0, 0, local71);
					}
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("30677, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPOYRTLL", name = "e", descriptor = "(II)I")
	private int method184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
}
