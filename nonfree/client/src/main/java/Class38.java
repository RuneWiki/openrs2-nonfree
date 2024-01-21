import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SNNOFNNG")
public final class Class38 {

	@OriginalMember(owner = "client!SNNOFNNG", name = "s", descriptor = "Z")
	private static boolean aBoolean144;

	@OriginalMember(owner = "client!SNNOFNNG", name = "C", descriptor = "I")
	public static int anInt615;

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "I")
	private static int anInt607 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!SNNOFNNG", name = "i", descriptor = "[I")
	private static final int[] anIntArray170 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!SNNOFNNG", name = "k", descriptor = "I")
	private static int anInt609 = -521;

	@OriginalMember(owner = "client!SNNOFNNG", name = "m", descriptor = "Z")
	public static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!SNNOFNNG", name = "p", descriptor = "I")
	public static int anInt610 = 99;

	@OriginalMember(owner = "client!SNNOFNNG", name = "t", descriptor = "[I")
	private static final int[] anIntArray171 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!SNNOFNNG", name = "u", descriptor = "I")
	private static int anInt613 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!SNNOFNNG", name = "w", descriptor = "I")
	private static int anInt614 = 23;

	@OriginalMember(owner = "client!SNNOFNNG", name = "x", descriptor = "[I")
	private static final int[] anIntArray172 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!SNNOFNNG", name = "E", descriptor = "[I")
	private static final int[] anIntArray173 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!SNNOFNNG", name = "F", descriptor = "I")
	private static int anInt616 = 9;

	@OriginalMember(owner = "client!SNNOFNNG", name = "g", descriptor = "I")
	private int anInt608 = 631;

	@OriginalMember(owner = "client!SNNOFNNG", name = "o", descriptor = "B")
	private byte aByte15 = -83;

	@OriginalMember(owner = "client!SNNOFNNG", name = "D", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!SNNOFNNG", name = "q", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!SNNOFNNG", name = "r", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!SNNOFNNG", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!SNNOFNNG", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!SNNOFNNG", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!SNNOFNNG", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!SNNOFNNG", name = "v", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!SNNOFNNG", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!SNNOFNNG", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!SNNOFNNG", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!SNNOFNNG", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!SNNOFNNG", name = "c", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!SNNOFNNG", name = "d", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!SNNOFNNG", name = "e", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!SNNOFNNG", name = "f", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(II)I")
	private static int method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method413(arg0 - 1, arg1 - 1) + method413(arg0 + 1, arg1 - 1) + method413(arg0 - 1, arg1 + 1) + method413(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method413(arg0 - 1, arg1) + method413(arg0 + 1, arg1) + method413(arg0, arg1 - 1) + method413(arg0, arg1 + 1);
		@Pc(59) int local59 = method413(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "c", descriptor = "(II)I")
	private static int method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIII)I")
	private static int method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class8_Sub1_Sub2_Sub4.anIntArray205[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(Lclient!BISZONYZ;BLclient!IUVBENCV;)V")
	public static void method415(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) int local17 = -1;
			while (true) {
				@Pc(20) int local20 = arg2.method166();
				if (local20 == 0) {
					return;
				}
				local17 += local20;
				@Pc(29) Class23 local29 = Class23.method260(local17);
				local29.method254(arg0);
				while (true) {
					@Pc(36) int local36 = arg2.method166();
					if (local36 == 0) {
						break;
					}
					arg2.method152();
				}
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("41688, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(III)I")
	private static int method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method408(local3, local13);
		@Pc(29) int local29 = method408(local3 + 1, local13);
		@Pc(35) int local35 = method408(local3, local13 + 1);
		@Pc(43) int local43 = method408(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method414(local23, local29, local9, arg2);
		@Pc(55) int local55 = method414(local35, local43, local9, arg2);
		return method414(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "d", descriptor = "(II)I")
	private static int method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIIIIILclient!POACSVST;Lclient!AOKWRKNA;[[[II)V")
	public static void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class32 arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int[][][] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg8[arg1][arg3][arg0];
			@Pc(19) int local19 = arg8[arg1][arg3 + 1][arg0];
			@Pc(31) int local31 = arg8[arg1][arg3 + 1][arg0 + 1];
			@Pc(41) int local41 = arg8[arg1][arg3][arg0 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class23 local54 = Class23.method260(arg9);
			@Pc(72) int local72 = arg3 + (arg0 << 7) + (arg9 << 14) + 1073741824;
			if (!local54.aBoolean87) {
				local72 += Integer.MIN_VALUE;
			}
			@Pc(86) byte local86 = (byte) ((arg4 << 6) + arg2);
			@Pc(106) Class8_Sub1_Sub1 local106;
			if (arg2 == 22) {
				if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
					local106 = local54.method257(22, arg4, local9, local19, local31, local41, -1);
				} else {
					local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 22, true, local19, local9, arg9, arg4);
				}
				arg6.method322(local72, arg0, arg3, arg5, local86, local51, local106);
				if (local54.aBoolean86 && local54.aBoolean87) {
					arg7.method4(arg0, anInt609, arg3);
				}
			} else {
				@Pc(202) int local202;
				if (arg2 == 10 || arg2 == 11) {
					if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
						local106 = local54.method257(10, arg4, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 10, true, local19, local9, arg9, arg4);
					}
					if (local106 != null) {
						@Pc(189) int local189 = 0;
						if (arg2 == 11) {
							local189 += 256;
						}
						@Pc(205) int local205;
						if (arg4 == 1 || arg4 == 3) {
							local202 = local54.anInt389;
							local205 = local54.anInt374;
						} else {
							local202 = local54.anInt374;
							local205 = local54.anInt389;
						}
						arg6.method326(arg0, local106, local189, local72, local202, local205, arg3, arg5, local51, local86);
					}
					if (local54.aBoolean86) {
						arg7.method3(local54.anInt374, arg0, arg4, arg3, local54.aBoolean81, local54.anInt389);
					}
				} else if (arg2 >= 12) {
					if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
						local106 = local54.method257(arg2, arg4, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, arg2, true, local19, local9, arg9, arg4);
					}
					arg6.method326(arg0, local106, 0, local72, 1, 1, arg3, arg5, local51, local86);
					if (local54.aBoolean86) {
						arg7.method3(local54.anInt374, arg0, arg4, arg3, local54.aBoolean81, local54.anInt389);
					}
				} else if (arg2 == 0) {
					if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
						local106 = local54.method257(0, arg4, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 0, true, local19, local9, arg9, arg4);
					}
					arg6.method324(anInt616, arg5, 0, anIntArray170[arg4], local72, arg0, local86, local106, local51, arg3, null);
					if (local54.aBoolean86) {
						arg7.method2(arg0, arg3, local54.aBoolean81, arg4, arg2);
					}
				} else if (arg2 == 1) {
					if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
						local106 = local54.method257(1, arg4, local9, local19, local31, local41, -1);
					} else {
						local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 1, true, local19, local9, arg9, arg4);
					}
					arg6.method324(anInt616, arg5, 0, anIntArray172[arg4], local72, arg0, local86, local106, local51, arg3, null);
					if (local54.aBoolean86) {
						arg7.method2(arg0, arg3, local54.aBoolean81, arg4, arg2);
					}
				} else {
					@Pc(448) int local448;
					@Pc(477) Class8_Sub1_Sub1 local477;
					if (arg2 == 2) {
						local448 = arg4 + 1 & 0x3;
						@Pc(467) Class8_Sub1_Sub1 local467;
						if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
							local467 = local54.method257(2, arg4 + 4, local9, local19, local31, local41, -1);
							local477 = local54.method257(2, local448, local9, local19, local31, local41, -1);
						} else {
							local467 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 2, true, local19, local9, arg9, arg4 + 4);
							local477 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 2, true, local19, local9, arg9, local448);
						}
						arg6.method324(anInt616, arg5, anIntArray170[local448], anIntArray170[arg4], local72, arg0, local86, local467, local51, arg3, local477);
						if (local54.aBoolean86) {
							arg7.method2(arg0, arg3, local54.aBoolean81, arg4, arg2);
						}
					} else if (arg2 == 3) {
						if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
							local106 = local54.method257(3, arg4, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 3, true, local19, local9, arg9, arg4);
						}
						arg6.method324(anInt616, arg5, 0, anIntArray172[arg4], local72, arg0, local86, local106, local51, arg3, null);
						if (local54.aBoolean86) {
							arg7.method2(arg0, arg3, local54.aBoolean81, arg4, arg2);
						}
					} else if (arg2 == 9) {
						if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
							local106 = local54.method257(arg2, arg4, local9, local19, local31, local41, -1);
						} else {
							local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, arg2, true, local19, local9, arg9, arg4);
						}
						arg6.method326(arg0, local106, 0, local72, 1, 1, arg3, arg5, local51, local86);
						if (local54.aBoolean86) {
							arg7.method3(local54.anInt374, arg0, arg4, arg3, local54.aBoolean81, local54.anInt389);
						}
					} else {
						if (local54.aBoolean90) {
							if (arg4 == 1) {
								local448 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local448;
							} else if (arg4 == 2) {
								local448 = local41;
								local41 = local19;
								local19 = local448;
								local448 = local31;
								local31 = local9;
								local9 = local448;
							} else if (arg4 == 3) {
								local448 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local448;
							}
						}
						if (arg2 == 4) {
							if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
								local106 = local54.method257(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 4, true, local19, local9, arg9, 0);
							}
							arg6.method325(arg0, local51, 0, arg4 * 512, 0, local72, local86, arg5, anIntArray170[arg4], local106, arg3);
						} else if (arg2 == 5) {
							local448 = 16;
							local202 = arg6.method342(arg5, arg3, arg0);
							if (local202 > 0) {
								local448 = Class23.method260(local202 >> 14 & 0x7FFF).anInt391;
							}
							if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
								local477 = local54.method257(4, 0, local9, local19, local31, local41, -1);
							} else {
								local477 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 4, true, local19, local9, arg9, 0);
							}
							arg6.method325(arg0, local51, anIntArray171[arg4] * local448, arg4 * 512, anIntArray173[arg4] * local448, local72, local86, arg5, anIntArray170[arg4], local477, arg3);
						} else if (arg2 == 6) {
							if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
								local106 = local54.method257(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 4, true, local19, local9, arg9, 0);
							}
							arg6.method325(arg0, local51, 0, arg4, 0, local72, local86, arg5, 256, local106, arg3);
						} else if (arg2 == 7) {
							if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
								local106 = local54.method257(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 4, true, local19, local9, arg9, 0);
							}
							arg6.method325(arg0, local51, 0, arg4, 0, local72, local86, arg5, 512, local106, arg3);
						} else if (arg2 == 8) {
							if (local54.anInt390 == -1 && local54.anIntArray112 == null) {
								local106 = local54.method257(4, 0, local9, local19, local31, local41, -1);
							} else {
								local106 = new Class8_Sub1_Sub1_Sub6(local41, local31, (byte) 7, local54.anInt390, 4, true, local19, local9, arg9, 0);
							}
							arg6.method325(arg0, local51, 0, arg4, 0, local72, local86, arg5, 768, local106, arg3);
						}
					}
				}
			}
		} catch (@Pc(1016) RuntimeException local1016) {
			signlink.reporterror("54920, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -688 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1016.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "e", descriptor = "(II)I")
	private static int method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method418(arg0 + 45365, arg1 + 91923, 4) + (method418(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method418(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[BII)Z")
	public static boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(9) boolean local9 = true;
			@Pc(15) Class8_Sub1_Sub3 local15 = new Class8_Sub1_Sub3(arg1, 713);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local15.method166();
				if (local20 == 0) {
					return local9;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local15.method166();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local15.method152() >> 2;
						@Pc(72) int local72 = local63 + arg0;
						@Pc(76) int local76 = local57 + arg2;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class23 local89 = Class23.method260(local17);
							if (local68 != 22 || !aBoolean143 || local89.aBoolean87 || local89.aBoolean92) {
								local9 &= local89.method261();
								local30 = true;
							}
						}
					}
					local35 = local15.method166();
					if (local35 == 0) {
						break;
					}
					local15.method152();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("10716, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 55 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIZ)Z")
	public static boolean method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) Class23 local10 = Class23.method260(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local10.method256((byte) 8, arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("91932, " + arg0 + ", " + arg1 + ", " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "<init>", descriptor = "([[[I[[[BIIZ)V")
	public Class38(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			anInt610 = 99;
			this.anInt611 = arg3;
			this.anInt612 = arg2;
			this.anIntArrayArrayArray4 = arg0;
			this.aByteArrayArrayArray5 = arg1;
			this.aByteArrayArrayArray1 = new byte[4][this.anInt611][this.anInt612];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt611][this.anInt612];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt611][this.anInt612];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt611][this.anInt612];
			this.anIntArrayArrayArray3 = new int[4][this.anInt611 + 1][this.anInt612 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt611 + 1][this.anInt612 + 1];
			this.anIntArrayArray17 = new int[this.anInt611 + 1][this.anInt612 + 1];
			this.anIntArray165 = new int[this.anInt612];
			this.anIntArray166 = new int[this.anInt612];
			this.anIntArray167 = new int[this.anInt612];
			this.anIntArray168 = new int[this.anInt612];
			this.anIntArray169 = new int[this.anInt612];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("18042, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IBII)I")
	private int method409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray5[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray5[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("45279, " + arg0 + ", " + 78 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([Lclient!AOKWRKNA;IIIIII[BII)V")
	public void method410(@OriginalArg(0) Class1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg6 + local3 > 0 && arg6 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg0[arg4].anIntArrayArray1[arg6 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			if (arg8 <= 0) {
				this.aBoolean145 = !this.aBoolean145;
			}
			@Pc(67) Class8_Sub1_Sub3 local67 = new Class8_Sub1_Sub3(arg7, 713);
			for (@Pc(69) int local69 = 0; local69 < 4; local69++) {
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						if (local69 == arg5 && local73 >= arg2 && local73 < arg2 + 8 && local77 >= arg9 && local77 < arg9 + 8) {
							this.method423(arg1 + Class5.method43(local73 & 0x7, local77 & 0x7, arg3), arg3, 0, local67, arg6 + Class5.method42(local77 & 0x7, arg3, local73 & 0x7), 0, arg4);
						} else {
							this.method423(-1, 0, 0, local67, -1, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("81792, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIII)V")
	public void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg0; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt611 && local3 >= 0 && local3 < this.anInt612) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg2 && local7 < this.anInt611 - 1) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg0 && local3 < this.anInt612 - 1) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("90535, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -46682 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(II)I")
	private int method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[BIIILclient!POACSVST;II[Lclient!AOKWRKNA;IZ)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class32 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1[] arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg1, 713);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method166();
				if (local15 == 0) {
					return;
				}
				local9 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method166();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method152();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					if (local48 == arg7 && local44 >= arg3 && local44 < arg3 + 8 && local38 >= arg6 && local38 < arg6 + 8) {
						@Pc(81) Class23 local81 = Class23.method260(local9);
						@Pc(98) int local98 = arg0 + Class5.method44(local44 & 0x7, local81.anInt374, local38 & 0x7, local81.anInt389, local59, arg9);
						@Pc(115) int local115 = arg2 + Class5.method45(local44 & 0x7, local81.anInt389, arg9, local38 & 0x7, local59, local81.anInt374);
						if (local98 > 0 && local115 > 0 && local98 < 103 && local115 < 103) {
							@Pc(127) int local127 = arg4;
							if ((this.aByteArrayArrayArray5[1][local98][local115] & 0x2) == 2) {
								local127 = arg4 - 1;
							}
							@Pc(142) Class1 local142 = null;
							if (local127 >= 0) {
								local142 = arg8[local127];
							}
							this.method426(local9, local115, local55, local59 + arg9 & 0x3, local142, arg4, local98, arg5);
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("80558, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + true + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([BI[Lclient!AOKWRKNA;IZII)V")
	public void method417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg5 + local7 > 0 && arg5 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg2[local3].anIntArrayArray1[arg5 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class8_Sub1_Sub3 local68 = new Class8_Sub1_Sub3(arg0, 713);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method423(local78 + arg1, 0, arg4, local68, local74 + arg5, arg3, local11);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("69870, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[Lclient!AOKWRKNA;Lclient!POACSVST;B[BI)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) Class1[] arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class8_Sub1_Sub3 local7 = new Class8_Sub1_Sub3(arg3, 713);
			if (this.aByte15 != -83) {
				this.anInt608 = 346;
			}
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local7.method166();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local7.method166();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local7.method152();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg4;
					@Pc(71) int local71 = local42 + arg0;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray5[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class1 local98 = null;
						if (local83 >= 0) {
							local98 = arg1[local83];
						}
						this.method426(local16, local71, local59, local63, local98, local52, local67, arg2);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("73850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -83 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(IIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray4[arg2][arg0 + local3][arg1 + local7] = 0;
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray4[arg2][arg0][arg1 + local7] = this.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 + local7];
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray4[arg2][arg0 + local7][arg1] = this.anIntArrayArrayArray4[arg2][arg0 + local7][arg1 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray4[arg2][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray4[arg2][arg0][arg1] = this.anIntArrayArrayArray4[arg2][arg0 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray4[arg2][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray4[arg2][arg0][arg1] = this.anIntArrayArrayArray4[arg2][arg0][arg1 - 1];
			} else if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray4[arg2][arg0][arg1] = this.anIntArrayArrayArray4[arg2][arg0 - 1][arg1 - 1];
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("19037, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -503 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(III)I")
	private int method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIILclient!IUVBENCV;III)V")
	private void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub1_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(26) int local26;
			if (arg4 >= 0 && arg4 < 104 && arg0 >= 0 && arg0 < 104) {
				this.aByteArrayArrayArray5[arg6][arg4][arg0] = 0;
				while (true) {
					local26 = arg3.method152();
					if (local26 == 0) {
						if (arg6 == 0) {
							this.anIntArrayArrayArray4[0][arg4][arg0] = -method425(arg4 + arg2 + 932731, arg0 + 556238 + arg5) * 8;
							return;
						} else {
							this.anIntArrayArrayArray4[arg6][arg4][arg0] = this.anIntArrayArrayArray4[arg6 - 1][arg4][arg0] - 240;
							return;
						}
					}
					if (local26 == 1) {
						@Pc(80) int local80 = arg3.method152();
						if (local80 == 1) {
							local80 = 0;
						}
						if (arg6 == 0) {
							this.anIntArrayArrayArray4[0][arg4][arg0] = -local80 * 8;
							return;
						}
						this.anIntArrayArrayArray4[arg6][arg4][arg0] = this.anIntArrayArrayArray4[arg6 - 1][arg4][arg0] - local80 * 8;
						return;
					}
					if (local26 <= 49) {
						this.aByteArrayArrayArray2[arg6][arg4][arg0] = arg3.method153();
						this.aByteArrayArrayArray4[arg6][arg4][arg0] = (byte) ((local26 - 2) / 4);
						this.aByteArrayArrayArray3[arg6][arg4][arg0] = (byte) (local26 + arg1 - 2 & 0x3);
					} else if (local26 <= 81) {
						this.aByteArrayArrayArray5[arg6][arg4][arg0] = (byte) (local26 - 49);
					} else {
						this.aByteArrayArrayArray1[arg6][arg4][arg0] = (byte) (local26 - 81);
					}
				}
			} else {
				while (true) {
					local26 = arg3.method152();
					if (local26 == 0) {
						return;
					}
					if (local26 == 1) {
						arg3.method152();
						return;
					}
					if (local26 <= 49) {
						arg3.method152();
					}
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("62381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIILclient!AOKWRKNA;IIILclient!POACSVST;)V")
	private void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class32 arg7) {
		try {
			if (aBoolean143 && (this.aByteArrayArrayArray5[0][arg6][arg1] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray5[arg5][arg6][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method409(arg5, arg1, arg6) != anInt615) {
					return;
				}
			}
			if (arg5 < anInt610) {
				anInt610 = arg5;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray4[arg5][arg6][arg1];
			@Pc(60) int local60 = this.anIntArrayArrayArray4[arg5][arg6 + 1][arg1];
			@Pc(73) int local73 = this.anIntArrayArrayArray4[arg5][arg6 + 1][arg1 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray4[arg5][arg6][arg1 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class23 local97 = Class23.method260(arg0);
			@Pc(109) int local109 = arg6 + (arg1 << 7) + (arg0 << 14) + 1073741824;
			if (!local97.aBoolean87) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg3 << 6) + arg2);
			@Pc(155) Class8_Sub1_Sub1 local155;
			if (arg2 != 22) {
				@Pc(253) int local253;
				if (arg2 == 10 || arg2 == 11) {
					if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
						local155 = local97.method257(10, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 10, true, local60, local49, arg0, arg3);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg2 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg3 == 1 || arg3 == 3) {
							local253 = local97.anInt389;
							local256 = local97.anInt374;
						} else {
							local253 = local97.anInt374;
							local256 = local97.anInt389;
						}
						if (arg7.method326(arg1, local155, local240, local109, local253, local256, arg6, arg5, local94, local123) && local97.aBoolean84) {
							@Pc(287) Class8_Sub1_Sub1_Sub5 local287;
							if (local155 instanceof Class8_Sub1_Sub1_Sub5) {
								local287 = (Class8_Sub1_Sub1_Sub5) local155;
							} else {
								local287 = local97.method257(10, arg3, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt293 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray6[arg5][arg6 + local303][arg1 + local307]) {
											this.aByteArrayArrayArray6[arg5][arg6 + local303][arg1 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean86 && arg4 != null) {
						arg4.method3(local97.anInt374, arg1, arg3, arg6, local97.aBoolean81, local97.anInt389);
					}
				} else if (arg2 >= 12) {
					if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
						local155 = local97.method257(arg2, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, arg2, true, local60, local49, arg0, arg3);
					}
					arg7.method326(arg1, local155, 0, local109, 1, 1, arg6, arg5, local94, local123);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg5 > 0) {
						this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x924;
					}
					if (local97.aBoolean86 && arg4 != null) {
						arg4.method3(local97.anInt374, arg1, arg3, arg6, local97.aBoolean81, local97.anInt389);
					}
				} else if (arg2 == 0) {
					if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
						local155 = local97.method257(0, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 0, true, local60, local49, arg0, arg3);
					}
					arg7.method324(anInt616, arg5, 0, anIntArray170[arg3], local109, arg1, local123, local155, local94, arg6, null);
					if (arg3 == 0) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray6[arg5][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg6][arg1 + 1] = 50;
						}
						if (local97.aBoolean91) {
							this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray6[arg5][arg6][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1 + 1] = 50;
						}
						if (local97.aBoolean91) {
							this.anIntArrayArrayArray3[arg5][arg6][arg1 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1 + 1] = 50;
						}
						if (local97.aBoolean91) {
							this.anIntArrayArrayArray3[arg5][arg6 + 1][arg1] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local97.aBoolean84) {
							this.aByteArrayArrayArray6[arg5][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1] = 50;
						}
						if (local97.aBoolean91) {
							this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x492;
						}
					}
					if (local97.aBoolean86 && arg4 != null) {
						arg4.method2(arg1, arg6, local97.aBoolean81, arg3, arg2);
					}
					if (local97.anInt391 != 16) {
						arg7.method332(arg1, arg5, local97.anInt391, arg6);
					}
				} else if (arg2 == 1) {
					if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
						local155 = local97.method257(1, arg3, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 1, true, local60, local49, arg0, arg3);
					}
					arg7.method324(anInt616, arg5, 0, anIntArray172[arg3], local109, arg1, local123, local155, local94, arg6, null);
					if (local97.aBoolean84) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray6[arg5][arg6][arg1 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray6[arg5][arg6][arg1] = 50;
						}
					}
					if (local97.aBoolean86 && arg4 != null) {
						arg4.method2(arg1, arg6, local97.aBoolean81, arg3, arg2);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class8_Sub1_Sub1 local893;
					if (arg2 == 2) {
						local864 = arg3 + 1 & 0x3;
						@Pc(883) Class8_Sub1_Sub1 local883;
						if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
							local883 = local97.method257(2, arg3 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method257(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 2, true, local60, local49, arg0, arg3 + 4);
							local893 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 2, true, local60, local49, arg0, local864);
						}
						arg7.method324(anInt616, arg5, anIntArray170[local864], anIntArray170[arg3], local109, arg1, local123, local883, local94, arg6, local893);
						if (local97.aBoolean91) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x249;
								this.anIntArrayArrayArray3[arg5][arg6][arg1 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray3[arg5][arg6][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray3[arg5][arg6 + 1][arg1] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray3[arg5][arg6 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x492;
								this.anIntArrayArrayArray3[arg5][arg6][arg1] |= 0x249;
							}
						}
						if (local97.aBoolean86 && arg4 != null) {
							arg4.method2(arg1, arg6, local97.aBoolean81, arg3, arg2);
						}
						if (local97.anInt391 != 16) {
							arg7.method332(arg1, arg5, local97.anInt391, arg6);
						}
					} else if (arg2 == 3) {
						if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
							local155 = local97.method257(3, arg3, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 3, true, local60, local49, arg0, arg3);
						}
						arg7.method324(anInt616, arg5, 0, anIntArray172[arg3], local109, arg1, local123, local155, local94, arg6, null);
						if (local97.aBoolean84) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray6[arg5][arg6][arg1 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray6[arg5][arg6 + 1][arg1] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray6[arg5][arg6][arg1] = 50;
							}
						}
						if (local97.aBoolean86 && arg4 != null) {
							arg4.method2(arg1, arg6, local97.aBoolean81, arg3, arg2);
						}
					} else if (arg2 == 9) {
						if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
							local155 = local97.method257(arg2, arg3, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, arg2, true, local60, local49, arg0, arg3);
						}
						arg7.method326(arg1, local155, 0, local109, 1, 1, arg6, arg5, local94, local123);
						if (local97.aBoolean86 && arg4 != null) {
							arg4.method3(local97.anInt374, arg1, arg3, arg6, local97.aBoolean81, local97.anInt389);
						}
					} else {
						if (local97.aBoolean90) {
							if (arg3 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg3 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg3 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg2 == 4) {
							if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
								local155 = local97.method257(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 4, true, local60, local49, arg0, 0);
							}
							arg7.method325(arg1, local94, 0, arg3 * 512, 0, local109, local123, arg5, anIntArray170[arg3], local155, arg6);
						} else if (arg2 == 5) {
							local864 = 16;
							local253 = arg7.method342(arg5, arg6, arg1);
							if (local253 > 0) {
								local864 = Class23.method260(local253 >> 14 & 0x7FFF).anInt391;
							}
							if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
								local893 = local97.method257(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 4, true, local60, local49, arg0, 0);
							}
							arg7.method325(arg1, local94, anIntArray171[arg3] * local864, arg3 * 512, anIntArray173[arg3] * local864, local109, local123, arg5, anIntArray170[arg3], local893, arg6);
						} else if (arg2 == 6) {
							if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
								local155 = local97.method257(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 4, true, local60, local49, arg0, 0);
							}
							arg7.method325(arg1, local94, 0, arg3, 0, local109, local123, arg5, 256, local155, arg6);
						} else if (arg2 == 7) {
							if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
								local155 = local97.method257(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 4, true, local60, local49, arg0, 0);
							}
							arg7.method325(arg1, local94, 0, arg3, 0, local109, local123, arg5, 512, local155, arg6);
						} else if (arg2 == 8) {
							if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
								local155 = local97.method257(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 4, true, local60, local49, arg0, 0);
							}
							arg7.method325(arg1, local94, 0, arg3, 0, local109, local123, arg5, 768, local155, arg6);
						}
					}
				}
			} else if (!aBoolean143 || local97.aBoolean87 || local97.aBoolean92) {
				if (local97.anInt390 == -1 && local97.anIntArray112 == null) {
					local155 = local97.method257(22, arg3, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class8_Sub1_Sub1_Sub6(local84, local73, (byte) 7, local97.anInt390, 22, true, local60, local49, arg0, arg3);
				}
				arg7.method322(local109, arg1, arg6, arg5, local123, local94, local155);
				if (local97.aBoolean86 && local97.aBoolean87 && arg4 != null) {
					arg4.method4(arg1, anInt609, arg6);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("21653, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -812 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([Lclient!AOKWRKNA;ZLclient!POACSVST;)V")
	public void method429(@OriginalArg(0) Class1[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class32 arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray5[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method4(local11, anInt609, local7);
							}
						}
					}
				}
			}
			anInt607 += (int) (Math.random() * 5.0D) - 2;
			if (anInt607 < -8) {
				anInt607 = -8;
			}
			if (anInt607 > 8) {
				anInt607 = 8;
			}
			anInt613 += (int) (Math.random() * 5.0D) - 2;
			if (anInt613 < -16) {
				anInt613 = -16;
			}
			if (anInt613 > 16) {
				anInt613 = 16;
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
				for (local141 = 1; local141 < this.anInt612 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt611 - 1; local145++) {
						local169 = this.anIntArrayArrayArray4[local7][local145 + 1][local141] - this.anIntArrayArrayArray4[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray4[local7][local145][local141 + 1] - this.anIntArrayArrayArray4[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray17[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt612; local145++) {
					this.anIntArray165[local145] = 0;
					this.anIntArray166[local145] = 0;
					this.anIntArray167[local145] = 0;
					this.anIntArray168[local145] = 0;
					this.anIntArray169[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt611 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt612; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt611) {
							local210 = this.aByteArrayArrayArray1[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class48 local378 = Class48.aClass48Array1[local210 - 1];
								this.anIntArray165[local191] += local378.anInt780;
								this.anIntArray166[local191] += local378.anInt778;
								this.anIntArray167[local191] += local378.anInt779;
								this.anIntArray168[local191] += local378.anInt781;
								local419 = this.anIntArray169[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt611) {
							local214 = this.aByteArrayArrayArray1[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class48 local451 = Class48.aClass48Array1[local214 - 1];
								this.anIntArray165[local191] -= local451.anInt780;
								this.anIntArray166[local191] -= local451.anInt778;
								this.anIntArray167[local191] -= local451.anInt779;
								this.anIntArray168[local191] -= local451.anInt781;
								local419 = this.anIntArray169[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt611 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt612 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt612) {
								local204 += this.anIntArray165[local527];
								local210 += this.anIntArray166[local527];
								local214 += this.anIntArray167[local527];
								local220 += this.anIntArray168[local527];
								local236 += this.anIntArray169[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt612) {
								local204 -= this.anIntArray165[local572];
								local210 -= this.anIntArray166[local572];
								local214 -= this.anIntArray167[local572];
								local220 -= this.anIntArray168[local572];
								local236 -= this.anIntArray169[local572];
							}
							if (local284 >= 1 && local284 < this.anInt612 - 1 && (!aBoolean143 || (this.aByteArrayArrayArray5[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray5[local7][local169][local284] & 0x10) == 0 && this.method409(local7, local284, local169) == anInt615)) {
								if (local7 < anInt610) {
									anInt610 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray4[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray4[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray4[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray4[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray17[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray17[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray17[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray17[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method422(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt607 & 0xFF;
										local786 += anInt613;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method422(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class48.aClass48Array1[local682 - 1].aBoolean172) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray3[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class8_Sub1_Sub2_Sub4.anIntArray209[method420(local770, 96)];
									}
									if (local682 == 0) {
										arg2.method321(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method420(local768, local737), method420(local768, local746), method420(local768, local757), method420(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray3[local7][local169][local284];
										@Pc(941) Class48 local941 = Class48.aClass48Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt776;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class8_Sub1_Sub2_Sub4.method563(local944);
											local952 = -1;
										} else if (local941.anInt775 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class8_Sub1_Sub2_Sub4.anIntArray209[this.method412(local941.anInt782, 96)];
										} else {
											local952 = this.method422(local941.anInt777, local941.anInt778, local941.anInt779);
											local950 = Class8_Sub1_Sub2_Sub4.anIntArray209[this.method412(local941.anInt782, 96)];
										}
										arg2.method321(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method420(local768, local737), method420(local768, local746), method420(local768, local757), method420(local768, local766), this.method412(local952, local737), this.method412(local952, local746), this.method412(local952, local757), this.method412(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt612 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt611 - 1; local204++) {
						arg2.method320(local7, local204, local191, this.method409(local7, local191, local204));
					}
				}
			}
			arg2.method347();
			if (!arg1) {
				for (local11 = 0; local11 < this.anInt611; local11++) {
					for (local27 = 0; local27 < this.anInt612; local27++) {
						if ((this.aByteArrayArrayArray5[1][local11][local27] & 0x2) == 2) {
							arg2.method318(local27, local11);
						}
					}
				}
				local27 = 1;
				@Pc(1130) int local1130 = 2;
				@Pc(1132) int local1132 = 4;
				for (@Pc(1134) int local1134 = 0; local1134 < 4; local1134++) {
					if (local1134 > 0) {
						local27 <<= 0x3;
						local1130 <<= 0x3;
						local1132 <<= 0x3;
					}
					for (@Pc(1152) int local1152 = 0; local1152 <= local1134; local1152++) {
						for (local133 = 0; local133 <= this.anInt612; local133++) {
							for (local139 = 0; local139 <= this.anInt611; local139++) {
								if ((this.anIntArrayArrayArray3[local1152][local139][local133] & local27) != 0) {
									local141 = local133;
									local145 = local133;
									local169 = local1152;
									local191 = local1152;
									while (local141 > 0 && (this.anIntArrayArrayArray3[local1152][local139][local141 - 1] & local27) != 0) {
										local141--;
									}
									while (local145 < this.anInt612 && (this.anIntArrayArrayArray3[local1152][local139][local145 + 1] & local27) != 0) {
										local145++;
									}
									label332: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray3[local169 - 1][local139][local204] & local27) == 0) {
												break label332;
											}
										}
										local169--;
									}
									label321: while (local191 < local1134) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray3[local191 + 1][local139][local204] & local27) == 0) {
												break label321;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray4[local191][local139][local141] - 240;
										local220 = this.anIntArrayArrayArray4[local169][local139][local141];
										Class32.method319(local139 * 128, local139 * 128, local220, local214, local1134, 1, local141 * 128, local145 * 128 + 128, anInt614);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray3[local236][local139][local284] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray3[local1152][local139][local133] & local1130) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local1152;
									local191 = local1152;
									while (local141 > 0 && (this.anIntArrayArrayArray3[local1152][local141 - 1][local133] & local1130) != 0) {
										local141--;
									}
									while (local145 < this.anInt611 && (this.anIntArrayArrayArray3[local1152][local145 + 1][local133] & local1130) != 0) {
										local145++;
									}
									label385: while (local169 > 0) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray3[local169 - 1][local204][local133] & local1130) == 0) {
												break label385;
											}
										}
										local169--;
									}
									label374: while (local191 < local1134) {
										for (local204 = local141; local204 <= local145; local204++) {
											if ((this.anIntArrayArrayArray3[local191 + 1][local204][local133] & local1130) == 0) {
												break label374;
											}
										}
										local191++;
									}
									local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
									if (local204 >= 8) {
										local214 = this.anIntArrayArrayArray4[local191][local141][local133] - 240;
										local220 = this.anIntArrayArrayArray4[local169][local141][local133];
										Class32.method319(local141 * 128, local145 * 128 + 128, local220, local214, local1134, 2, local133 * 128, local133 * 128, anInt614);
										for (local236 = local169; local236 <= local191; local236++) {
											for (local284 = local141; local284 <= local145; local284++) {
												this.anIntArrayArrayArray3[local236][local284][local133] &= ~local1130;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray3[local1152][local139][local133] & local1132) != 0) {
									local141 = local139;
									local145 = local139;
									local169 = local133;
									local191 = local133;
									while (local169 > 0 && (this.anIntArrayArrayArray3[local1152][local139][local169 - 1] & local1132) != 0) {
										local169--;
									}
									while (local191 < this.anInt612 && (this.anIntArrayArrayArray3[local1152][local139][local191 + 1] & local1132) != 0) {
										local191++;
									}
									label438: while (local141 > 0) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray3[local1152][local141 - 1][local204] & local1132) == 0) {
												break label438;
											}
										}
										local141--;
									}
									label427: while (local145 < this.anInt611) {
										for (local204 = local169; local204 <= local191; local204++) {
											if ((this.anIntArrayArrayArray3[local1152][local145 + 1][local204] & local1132) == 0) {
												break label427;
											}
										}
										local145++;
									}
									if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
										local204 = this.anIntArrayArrayArray4[local1152][local141][local169];
										Class32.method319(local141 * 128, local145 * 128 + 128, local204, local204, local1134, 4, local169 * 128, local191 * 128 + 128, anInt614);
										for (local210 = local141; local210 <= local145; local210++) {
											for (local214 = local169; local214 <= local191; local214++) {
												this.anIntArrayArrayArray3[local1152][local210][local214] &= ~local1132;
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
			signlink.reporterror("85950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1767.toString());
			throw new RuntimeException();
		}
	}
}
