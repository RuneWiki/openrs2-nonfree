import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CRRWDRTI")
public final class Class8 {

	@OriginalMember(owner = "client!CRRWDRTI", name = "i", descriptor = "I")
	public static int anInt52;

	@OriginalMember(owner = "client!CRRWDRTI", name = "s", descriptor = "Z")
	private static boolean aBoolean18;

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "I")
	private static int anInt51 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!CRRWDRTI", name = "k", descriptor = "I")
	private static int anInt53 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!CRRWDRTI", name = "o", descriptor = "[I")
	private static final int[] anIntArray24 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!CRRWDRTI", name = "p", descriptor = "I")
	private static int anInt54 = 323;

	@OriginalMember(owner = "client!CRRWDRTI", name = "r", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!CRRWDRTI", name = "v", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!CRRWDRTI", name = "w", descriptor = "I")
	public static int anInt55 = 99;

	@OriginalMember(owner = "client!CRRWDRTI", name = "C", descriptor = "Z")
	public static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!CRRWDRTI", name = "D", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!CRRWDRTI", name = "E", descriptor = "I")
	private static int anInt59 = -388;

	@OriginalMember(owner = "client!CRRWDRTI", name = "j", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!CRRWDRTI", name = "u", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!CRRWDRTI", name = "B", descriptor = "I")
	private int anInt58 = -53;

	@OriginalMember(owner = "client!CRRWDRTI", name = "x", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!CRRWDRTI", name = "y", descriptor = "I")
	private int anInt57;

	@OriginalMember(owner = "client!CRRWDRTI", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!CRRWDRTI", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!CRRWDRTI", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!CRRWDRTI", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!CRRWDRTI", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!CRRWDRTI", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!CRRWDRTI", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!CRRWDRTI", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!CRRWDRTI", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!CRRWDRTI", name = "d", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!CRRWDRTI", name = "e", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!CRRWDRTI", name = "f", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(II)I")
	private static int method40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(II)I")
	private static int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method46(arg0 + 45365, arg1 + 91923, 4) + (method46(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method46(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(BLclient!MBMGIXGO;Lclient!GHOWLKWN;)V")
	public static void method43(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class14_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(15) int local15 = arg0.method282();
				if (local15 == 0) {
					return;
				}
				local3 += local15;
				@Pc(24) Class46 local24 = Class46.method515(local3);
				local24.method517(arg1);
				while (true) {
					@Pc(31) int local31 = arg0.method282();
					if (local31 == 0) {
						break;
					}
					arg0.method268();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("73405, " + -107 + ", " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(III)I")
	private static int method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method56(local3, local13);
		@Pc(29) int local29 = method56(local3 + 1, local13);
		@Pc(35) int local35 = method56(local3, local13 + 1);
		@Pc(43) int local43 = method56(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method54(local23, local29, local9, arg2);
		@Pc(55) int local55 = method54(local35, local43, local9, arg2);
		return method54(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "(III)Z")
	public static boolean method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) Class46 local2 = Class46.method515(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method520(arg1);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("51637, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(IIII)I")
	private static int method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub1_Sub3.anIntArray103[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "d", descriptor = "(II)I")
	private static int method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method40(arg0 - 1, arg1 - 1) + method40(arg0 + 1, arg1 - 1) + method40(arg0 - 1, arg1 + 1) + method40(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method40(arg0 - 1, arg1) + method40(arg0 + 1, arg1) + method40(arg0, arg1 - 1) + method40(arg0, arg1 + 1);
		@Pc(59) int local59 = method40(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "e", descriptor = "(II)I")
	private static int method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(Lclient!NYFUGYQS;IIIILclient!FTPNODIB;[[[IIIIB)V")
	public static void method58(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(9) int local9 = arg6[arg4][arg7][arg2];
			@Pc(19) int local19 = arg6[arg4][arg7 + 1][arg2];
			@Pc(31) int local31 = arg6[arg4][arg7 + 1][arg2 + 1];
			@Pc(41) int local41 = arg6[arg4][arg7][arg2 + 1];
			@Pc(56) int local56 = local9 + local19 + local31 + local41 >> 2;
			@Pc(59) Class46 local59 = Class46.method515(arg8);
			@Pc(71) int local71 = arg7 + (arg2 << 7) + (arg8 << 14) + 1073741824;
			if (!local59.aBoolean203) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg1 << 6) + arg3);
			@Pc(105) Class1_Sub1_Sub2 local105;
			if (arg3 == 22) {
				if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
					local105 = local59.method521(22, arg1, local9, local19, local31, local41, -1);
				} else {
					local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, 22, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
				}
				arg0.method323(arg9, local56, arg2, local105, local85, local71, arg7);
				if (local59.aBoolean201 && local59.aBoolean203) {
					arg5.method167(arg2, arg7);
				}
			} else {
				@Pc(201) int local201;
				if (arg3 == 10 || arg3 == 11) {
					if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
						local105 = local59.method521(10, arg1, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, 10, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg3 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg1 == 1 || arg1 == 3) {
							local201 = local59.anInt756;
							local204 = local59.anInt746;
						} else {
							local201 = local59.anInt746;
							local204 = local59.anInt756;
						}
						arg0.method327(local71, local85, local56, local204, local105, local201, arg9, local188, arg2, arg7);
					}
					if (local59.aBoolean201) {
						arg5.method166(local59.aBoolean196, anInt54, local59.anInt746, local59.anInt756, arg7, arg2, arg1);
					}
				} else if (arg3 >= 12) {
					if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
						local105 = local59.method521(arg3, arg1, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, arg3, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
					}
					arg0.method327(local71, local85, local56, 1, local105, 1, arg9, 0, arg2, arg7);
					if (local59.aBoolean201) {
						arg5.method166(local59.aBoolean196, anInt54, local59.anInt746, local59.anInt756, arg7, arg2, arg1);
					}
				} else if (arg3 == 0) {
					if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
						local105 = local59.method521(0, arg1, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, 0, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
					}
					arg0.method325(anIntArray27[arg1], local105, local71, arg2, local85, arg7, null, local56, 0, arg9);
					if (local59.aBoolean201) {
						arg5.method165(arg2, arg1, arg7, arg3, (byte) 1, local59.aBoolean196);
					}
				} else if (arg3 == 1) {
					if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
						local105 = local59.method521(1, arg1, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, 1, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
					}
					arg0.method325(anIntArray25[arg1], local105, local71, arg2, local85, arg7, null, local56, 0, arg9);
					if (local59.aBoolean201) {
						arg5.method165(arg2, arg1, arg7, arg3, (byte) 1, local59.aBoolean196);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class1_Sub1_Sub2 local476;
					if (arg3 == 2) {
						local447 = arg1 + 1 & 0x3;
						@Pc(466) Class1_Sub1_Sub2 local466;
						if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
							local466 = local59.method521(2, arg1 + 4, local9, local19, local31, local41, -1);
							local476 = local59.method521(2, local447, local9, local19, local31, local41, -1);
						} else {
							local466 = new Class1_Sub1_Sub2_Sub5(arg8, arg1 + 4, 2, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							local476 = new Class1_Sub1_Sub2_Sub5(arg8, local447, 2, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
						}
						arg0.method325(anIntArray27[arg1], local466, local71, arg2, local85, arg7, local476, local56, anIntArray27[local447], arg9);
						if (local59.aBoolean201) {
							arg5.method165(arg2, arg1, arg7, arg3, (byte) 1, local59.aBoolean196);
						}
					} else if (arg3 == 3) {
						if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
							local105 = local59.method521(3, arg1, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, 3, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
						}
						arg0.method325(anIntArray25[arg1], local105, local71, arg2, local85, arg7, null, local56, 0, arg9);
						if (local59.aBoolean201) {
							arg5.method165(arg2, arg1, arg7, arg3, (byte) 1, local59.aBoolean196);
						}
					} else if (arg3 == 9) {
						if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
							local105 = local59.method521(arg3, arg1, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub2_Sub5(arg8, arg1, arg3, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
						}
						arg0.method327(local71, local85, local56, 1, local105, 1, arg9, 0, arg2, arg7);
						if (local59.aBoolean201) {
							arg5.method166(local59.aBoolean196, anInt54, local59.anInt746, local59.anInt756, arg7, arg2, arg1);
						}
					} else {
						if (local59.aBoolean197) {
							if (arg1 == 1) {
								local447 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local447;
							} else if (arg1 == 2) {
								local447 = local41;
								local41 = local19;
								local19 = local447;
								local447 = local31;
								local31 = local9;
								local9 = local447;
							} else if (arg1 == 3) {
								local447 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local447;
							}
						}
						if (arg3 == 4) {
							if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
								local105 = local59.method521(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub5(arg8, 0, 4, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							}
							arg0.method326(local71, arg2, arg1 * 512, arg9, 0, local56, local105, arg7, local85, 0, anIntArray27[arg1]);
						} else if (arg3 == 5) {
							local447 = 16;
							local201 = arg0.method343(arg9, arg7, arg2);
							if (local201 > 0) {
								local447 = Class46.method515(local201 >> 14 & 0x7FFF).anInt762;
							}
							if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
								local476 = local59.method521(4, 0, local9, local19, local31, local41, -1);
							} else {
								local476 = new Class1_Sub1_Sub2_Sub5(arg8, 0, 4, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							}
							arg0.method326(local71, arg2, arg1 * 512, arg9, anIntArray24[arg1] * local447, local56, local476, arg7, local85, anIntArray26[arg1] * local447, anIntArray27[arg1]);
						} else if (arg3 == 6) {
							if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
								local105 = local59.method521(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub5(arg8, 0, 4, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							}
							arg0.method326(local71, arg2, arg1, arg9, 0, local56, local105, arg7, local85, 0, 256);
						} else if (arg3 == 7) {
							if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
								local105 = local59.method521(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub5(arg8, 0, 4, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							}
							arg0.method326(local71, arg2, arg1, arg9, 0, local56, local105, arg7, local85, 0, 512);
						} else if (arg3 == 8) {
							if (local59.anInt763 == -1 && local59.anIntArray163 == null) {
								local105 = local59.method521(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub5(arg8, 0, 4, local19, (byte) 7, local31, local9, local41, local59.anInt763, true);
							}
							arg0.method326(local71, arg2, arg1, arg9, 0, local56, local105, arg7, local85, 0, 768);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("89985, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 93 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(I[BII)Z")
	public static boolean method59(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) boolean local13 = true;
			@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg1, 891);
			@Pc(21) int local21 = -1;
			label53: while (true) {
				@Pc(24) int local24 = local19.method282();
				if (local24 == 0) {
					return local13;
				}
				local21 += local24;
				@Pc(32) int local32 = 0;
				@Pc(34) boolean local34 = false;
				while (true) {
					@Pc(39) int local39;
					while (!local34) {
						local39 = local19.method282();
						if (local39 == 0) {
							continue label53;
						}
						local32 += local39 - 1;
						@Pc(61) int local61 = local32 & 0x3F;
						@Pc(67) int local67 = local32 >> 6 & 0x3F;
						@Pc(72) int local72 = local19.method268() >> 2;
						@Pc(76) int local76 = local67 + arg0;
						@Pc(80) int local80 = local61 + arg2;
						if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
							@Pc(93) Class46 local93 = Class46.method515(local21);
							if (local72 != 22 || !aBoolean20 || local93.aBoolean203 || local93.aBoolean193) {
								local13 &= local93.method522();
								local34 = true;
							}
						}
					}
					local39 = local19.method282();
					if (local39 == 0) {
						break;
					}
					local19.method268();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("14134, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "<init>", descriptor = "([[[BIII[[[I)V")
	public Class8(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt55 = 99;
			this.anInt56 = arg3;
			this.anInt57 = arg2;
			this.anIntArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray6 = arg0;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt56][this.anInt57];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt56][this.anInt57];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt56][this.anInt57];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt56][this.anInt57];
			this.anIntArrayArrayArray2 = new int[4][this.anInt56 + 1][this.anInt57 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt56 + 1][this.anInt57 + 1];
			this.anIntArrayArray1 = new int[this.anInt56 + 1][this.anInt57 + 1];
			this.anIntArray19 = new int[this.anInt57];
			this.anIntArray20 = new int[this.anInt57];
			this.anIntArray21 = new int[this.anInt57];
			this.anIntArray22 = new int[this.anInt57];
			this.anIntArray23 = new int[this.anInt57];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("40803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([Lclient!FTPNODIB;Lclient!NYFUGYQS;I)V")
	public void method41(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) Class27 arg1) {
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
								arg0[local27].method167(local11, local7);
							}
						}
					}
				}
			}
			anInt51 += (int) (Math.random() * 5.0D) - 2;
			if (anInt51 < -8) {
				anInt51 = -8;
			}
			if (anInt51 > 8) {
				anInt51 = 8;
			}
			anInt53 += (int) (Math.random() * 5.0D) - 2;
			if (anInt53 < -16) {
				anInt53 = -16;
			}
			if (anInt53 > 16) {
				anInt53 = 16;
			}
			@Pc(141) int local141;
			@Pc(147) int local147;
			@Pc(149) int local149;
			@Pc(153) int local153;
			@Pc(177) int local177;
			@Pc(199) int local199;
			@Pc(212) int local212;
			@Pc(218) int local218;
			@Pc(222) int local222;
			@Pc(228) int local228;
			@Pc(244) int local244;
			@Pc(292) int local292;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(116) byte[][] local116 = this.aByteArrayArrayArray2[local7];
				local141 = (int) Math.sqrt((double) 5100);
				local147 = local141 * 768 >> 8;
				for (local149 = 1; local149 < this.anInt57 - 1; local149++) {
					for (local153 = 1; local153 < this.anInt56 - 1; local153++) {
						local177 = this.anIntArrayArrayArray1[local7][local153 + 1][local149] - this.anIntArrayArrayArray1[local7][local153 - 1][local149];
						local199 = this.anIntArrayArrayArray1[local7][local153][local149 + 1] - this.anIntArrayArrayArray1[local7][local153][local149 - 1];
						local212 = (int) Math.sqrt((double) (local177 * local177 + local199 * local199 + 65536));
						local218 = (local177 << 8) / local212;
						local222 = 65536 / local212;
						local228 = (local199 << 8) / local212;
						local244 = (local218 * -50 + local222 * -10 + local228 * -50) / local147 + 96;
						local292 = (local116[local153 - 1][local149] >> 2) + (local116[local153 + 1][local149] >> 3) + (local116[local153][local149 - 1] >> 2) + (local116[local153][local149 + 1] >> 3) + (local116[local153][local149] >> 1);
						this.anIntArrayArray1[local153][local149] = local244 - local292;
					}
				}
				for (local153 = 0; local153 < this.anInt57; local153++) {
					this.anIntArray19[local153] = 0;
					this.anIntArray20[local153] = 0;
					this.anIntArray21[local153] = 0;
					this.anIntArray22[local153] = 0;
					this.anIntArray23[local153] = 0;
				}
				for (local177 = -5; local177 < this.anInt56 + 5; local177++) {
					for (local199 = 0; local199 < this.anInt57; local199++) {
						local212 = local177 + 5;
						@Pc(427) int local427;
						if (local212 >= 0 && local212 < this.anInt56) {
							local218 = this.aByteArrayArrayArray4[local7][local212][local199] & 0xFF;
							if (local218 > 0) {
								@Pc(386) Class24 local386 = Class24.aClass24Array1[local218 - 1];
								this.anIntArray19[local199] += local386.anInt480;
								this.anIntArray20[local199] += local386.anInt478;
								this.anIntArray21[local199] += local386.anInt479;
								this.anIntArray22[local199] += local386.anInt481;
								local427 = this.anIntArray23[local199]++;
							}
						}
						local218 = local177 - 5;
						if (local218 >= 0 && local218 < this.anInt56) {
							local222 = this.aByteArrayArrayArray4[local7][local218][local199] & 0xFF;
							if (local222 > 0) {
								@Pc(459) Class24 local459 = Class24.aClass24Array1[local222 - 1];
								this.anIntArray19[local199] -= local459.anInt480;
								this.anIntArray20[local199] -= local459.anInt478;
								this.anIntArray21[local199] -= local459.anInt479;
								this.anIntArray22[local199] -= local459.anInt481;
								local427 = this.anIntArray23[local199]--;
							}
						}
					}
					if (local177 >= 1 && local177 < this.anInt56 - 1) {
						local212 = 0;
						local218 = 0;
						local222 = 0;
						local228 = 0;
						local244 = 0;
						for (local292 = -5; local292 < this.anInt57 + 5; local292++) {
							@Pc(535) int local535 = local292 + 5;
							if (local535 >= 0 && local535 < this.anInt57) {
								local212 += this.anIntArray19[local535];
								local218 += this.anIntArray20[local535];
								local222 += this.anIntArray21[local535];
								local228 += this.anIntArray22[local535];
								local244 += this.anIntArray23[local535];
							}
							@Pc(580) int local580 = local292 - 5;
							if (local580 >= 0 && local580 < this.anInt57) {
								local212 -= this.anIntArray19[local580];
								local218 -= this.anIntArray20[local580];
								local222 -= this.anIntArray21[local580];
								local228 -= this.anIntArray22[local580];
								local244 -= this.anIntArray23[local580];
							}
							if (local292 >= 1 && local292 < this.anInt57 - 1 && (!aBoolean20 || (this.aByteArrayArrayArray6[0][local177][local292] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local177][local292] & 0x10) == 0 && this.method52(local292, local7, local177) == anInt52)) {
								if (local7 < anInt55) {
									anInt55 = local7;
								}
								@Pc(679) int local679 = this.aByteArrayArrayArray4[local7][local177][local292] & 0xFF;
								@Pc(690) int local690 = this.aByteArrayArrayArray1[local7][local177][local292] & 0xFF;
								if (local679 > 0 || local690 > 0) {
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local177][local292];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local7][local177 + 1][local292];
									@Pc(727) int local727 = this.anIntArrayArrayArray1[local7][local177 + 1][local292 + 1];
									@Pc(738) int local738 = this.anIntArrayArrayArray1[local7][local177][local292 + 1];
									@Pc(745) int local745 = this.anIntArrayArray1[local177][local292];
									@Pc(754) int local754 = this.anIntArrayArray1[local177 + 1][local292];
									@Pc(765) int local765 = this.anIntArrayArray1[local177 + 1][local292 + 1];
									@Pc(774) int local774 = this.anIntArrayArray1[local177][local292 + 1];
									@Pc(776) int local776 = -1;
									@Pc(778) int local778 = -1;
									@Pc(786) int local786;
									@Pc(790) int local790;
									if (local679 > 0) {
										local786 = local212 * 256 / local228;
										local790 = local218 / local244;
										@Pc(794) int local794 = local222 / local244;
										local776 = this.method47(local786, local790, local794);
										@Pc(806) int local806 = local786 + anInt51 & 0xFF;
										local794 += anInt53;
										if (local794 < 0) {
											local794 = 0;
										} else if (local794 > 255) {
											local794 = 255;
										}
										local778 = this.method47(local806, local790, local794);
									}
									if (local7 > 0) {
										@Pc(831) boolean local831 = true;
										if (local679 == 0 && this.aByteArrayArrayArray3[local7][local177][local292] != 0) {
											local831 = false;
										}
										if (local690 > 0 && !Class24.aClass24Array1[local690 - 1].aBoolean114) {
											local831 = false;
										}
										if (local831 && local703 == local714 && local703 == local727 && local703 == local738) {
											this.anIntArrayArrayArray2[local7][local177][local292] |= 0x924;
										}
									}
									local786 = 0;
									if (local776 != -1) {
										local786 = Class1_Sub1_Sub1_Sub3.anIntArray107[method57(local778, 96)];
									}
									if (local690 == 0) {
										arg1.method322(local7, local177, local292, 0, 0, -1, local703, local714, local727, local738, method57(local776, local745), method57(local776, local754), method57(local776, local765), method57(local776, local774), 0, 0, 0, 0, local786, 0);
									} else {
										local790 = this.aByteArrayArrayArray3[local7][local177][local292] + 1;
										@Pc(943) byte local943 = this.aByteArrayArrayArray5[local7][local177][local292];
										@Pc(949) Class24 local949 = Class24.aClass24Array1[local690 - 1];
										@Pc(952) int local952 = local949.anInt476;
										@Pc(960) int local960;
										@Pc(958) int local958;
										if (local952 >= 0) {
											local958 = Class1_Sub1_Sub1_Sub3.method393(local952);
											local960 = -1;
										} else if (local949.anInt475 == 16711935) {
											local958 = 0;
											local960 = -2;
											local952 = -1;
										} else {
											local960 = this.method47(local949.anInt477, local949.anInt478, local949.anInt479);
											local958 = Class1_Sub1_Sub1_Sub3.anIntArray107[this.method55(local949.anInt482, 96)];
										}
										arg1.method322(local7, local177, local292, local790, local943, local952, local703, local714, local727, local738, method57(local776, local745), method57(local776, local754), method57(local776, local765), method57(local776, local774), this.method55(local960, local745), this.method55(local960, local754), this.method55(local960, local765), this.method55(local960, local774), local786, local958);
									}
								}
							}
						}
					}
				}
				for (local199 = 1; local199 < this.anInt57 - 1; local199++) {
					for (local212 = 1; local212 < this.anInt56 - 1; local212++) {
						arg1.method321(local7, local212, local199, this.method52(local199, local7, local212));
					}
				}
			}
			arg1.method348();
			for (local11 = 0; local11 < this.anInt56; local11++) {
				for (local27 = 0; local27 < this.anInt57; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg1.method319(local27, local11);
					}
				}
			}
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
					for (local141 = 0; local141 <= this.anInt57; local141++) {
						for (local147 = 0; local147 <= this.anInt56; local147++) {
							if ((this.anIntArrayArrayArray2[local1153][local147][local141] & local27) != 0) {
								local149 = local141;
								local153 = local141;
								local177 = local1153;
								local199 = local1153;
								while (local149 > 0 && (this.anIntArrayArrayArray2[local1153][local147][local149 - 1] & local27) != 0) {
									local149--;
								}
								while (local153 < this.anInt57 && (this.anIntArrayArrayArray2[local1153][local147][local153 + 1] & local27) != 0) {
									local153++;
								}
								label328: while (local177 > 0) {
									for (local212 = local149; local212 <= local153; local212++) {
										if ((this.anIntArrayArrayArray2[local177 - 1][local147][local212] & local27) == 0) {
											break label328;
										}
									}
									local177--;
								}
								label317: while (local199 < local1135) {
									for (local212 = local149; local212 <= local153; local212++) {
										if ((this.anIntArrayArrayArray2[local199 + 1][local147][local212] & local27) == 0) {
											break label317;
										}
									}
									local199++;
								}
								local212 = (local199 + 1 - local177) * (local153 + 1 - local149);
								if (local212 >= 8) {
									local222 = this.anIntArrayArrayArray1[local199][local147][local149] - 240;
									local228 = this.anIntArrayArrayArray1[local177][local147][local149];
									Class27.method320(local1135, local147 * 128, local228, local147 * 128, local153 * 128 + 128, local222, this.anInt58, local149 * 128, 1);
									for (local244 = local177; local244 <= local199; local244++) {
										for (local292 = local149; local292 <= local153; local292++) {
											this.anIntArrayArrayArray2[local244][local147][local292] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1153][local147][local141] & local1131) != 0) {
								local149 = local147;
								local153 = local147;
								local177 = local1153;
								local199 = local1153;
								while (local149 > 0 && (this.anIntArrayArrayArray2[local1153][local149 - 1][local141] & local1131) != 0) {
									local149--;
								}
								while (local153 < this.anInt56 && (this.anIntArrayArrayArray2[local1153][local153 + 1][local141] & local1131) != 0) {
									local153++;
								}
								label381: while (local177 > 0) {
									for (local212 = local149; local212 <= local153; local212++) {
										if ((this.anIntArrayArrayArray2[local177 - 1][local212][local141] & local1131) == 0) {
											break label381;
										}
									}
									local177--;
								}
								label370: while (local199 < local1135) {
									for (local212 = local149; local212 <= local153; local212++) {
										if ((this.anIntArrayArrayArray2[local199 + 1][local212][local141] & local1131) == 0) {
											break label370;
										}
									}
									local199++;
								}
								local212 = (local199 + 1 - local177) * (local153 + 1 - local149);
								if (local212 >= 8) {
									local222 = this.anIntArrayArrayArray1[local199][local149][local141] - 240;
									local228 = this.anIntArrayArrayArray1[local177][local149][local141];
									Class27.method320(local1135, local149 * 128, local228, local153 * 128 + 128, local141 * 128, local222, this.anInt58, local141 * 128, 2);
									for (local244 = local177; local244 <= local199; local244++) {
										for (local292 = local149; local292 <= local153; local292++) {
											this.anIntArrayArrayArray2[local244][local292][local141] &= ~local1131;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1153][local147][local141] & local1133) != 0) {
								local149 = local147;
								local153 = local147;
								local177 = local141;
								local199 = local141;
								while (local177 > 0 && (this.anIntArrayArrayArray2[local1153][local147][local177 - 1] & local1133) != 0) {
									local177--;
								}
								while (local199 < this.anInt57 && (this.anIntArrayArrayArray2[local1153][local147][local199 + 1] & local1133) != 0) {
									local199++;
								}
								label434: while (local149 > 0) {
									for (local212 = local177; local212 <= local199; local212++) {
										if ((this.anIntArrayArrayArray2[local1153][local149 - 1][local212] & local1133) == 0) {
											break label434;
										}
									}
									local149--;
								}
								label423: while (local153 < this.anInt56) {
									for (local212 = local177; local212 <= local199; local212++) {
										if ((this.anIntArrayArrayArray2[local1153][local153 + 1][local212] & local1133) == 0) {
											break label423;
										}
									}
									local153++;
								}
								if ((local153 + 1 - local149) * (local199 + 1 - local177) >= 4) {
									local212 = this.anIntArrayArrayArray1[local1153][local149][local177];
									Class27.method320(local1135, local149 * 128, local212, local153 * 128 + 128, local199 * 128 + 128, local212, this.anInt58, local177 * 128, 4);
									for (local218 = local149; local218 <= local153; local218++) {
										for (local222 = local177; local222 <= local199; local222++) {
											this.anIntArrayArrayArray2[local1153][local218][local222] &= ~local1133;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("90532, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IIIII)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg1; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt56 && local3 >= 0 && local3 < this.anInt57) {
						this.aByteArrayArrayArray2[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg2 && local7 < this.anInt56 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg0 + arg1 && local3 < this.anInt57 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("73091, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(ILclient!NYFUGYQS;Lclient!FTPNODIB;IIIIZI)V")
	private void method45(@OriginalArg(0) int arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean20 && (this.aByteArrayArrayArray6[0][arg5][arg0] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg4][arg5][arg0] & 0x10) != 0) {
					return;
				}
				if (this.method52(arg0, arg4, arg5) != anInt52) {
					return;
				}
			}
			if (arg4 < anInt55) {
				anInt55 = arg4;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg4][arg5][arg0];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg4][arg5 + 1][arg0];
			@Pc(73) int local73 = this.anIntArrayArrayArray1[arg4][arg5 + 1][arg0 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg4][arg5][arg0 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class46 local97 = Class46.method515(arg6);
			@Pc(109) int local109 = arg5 + (arg0 << 7) + (arg6 << 14) + 1073741824;
			if (!local97.aBoolean203) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg7 << 6) + arg3);
			@Pc(155) Class1_Sub1_Sub2 local155;
			if (arg3 != 22) {
				@Pc(253) int local253;
				if (arg3 == 10 || arg3 == 11) {
					if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
						local155 = local97.method521(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, 10, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg3 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg7 == 1 || arg7 == 3) {
							local253 = local97.anInt756;
							local256 = local97.anInt746;
						} else {
							local253 = local97.anInt746;
							local256 = local97.anInt756;
						}
						if (arg1.method327(local109, local123, local94, local256, local155, local253, arg4, local240, arg0, arg5) && local97.aBoolean204) {
							@Pc(287) Class1_Sub1_Sub2_Sub6 local287;
							if (local155 instanceof Class1_Sub1_Sub2_Sub6) {
								local287 = (Class1_Sub1_Sub2_Sub6) local155;
							} else {
								local287 = local97.method521(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt804 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray2[arg4][arg5 + local303][arg0 + local307]) {
											this.aByteArrayArrayArray2[arg4][arg5 + local303][arg0 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean201 && arg2 != null) {
						arg2.method166(local97.aBoolean196, anInt54, local97.anInt746, local97.anInt756, arg5, arg0, arg7);
					}
				} else if (arg3 >= 12) {
					if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
						local155 = local97.method521(arg3, arg7, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, arg3, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
					}
					arg1.method327(local109, local123, local94, 1, local155, 1, arg4, 0, arg0, arg5);
					if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
						this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x924;
					}
					if (local97.aBoolean201 && arg2 != null) {
						arg2.method166(local97.aBoolean196, anInt54, local97.anInt746, local97.anInt756, arg5, arg0, arg7);
					}
				} else if (arg3 == 0) {
					if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
						local155 = local97.method521(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, 0, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
					}
					arg1.method325(anIntArray27[arg7], local155, local109, arg0, local123, arg5, null, local94, 0, arg4);
					if (arg7 == 0) {
						if (local97.aBoolean204) {
							this.aByteArrayArrayArray2[arg4][arg5][arg0] = 50;
							this.aByteArrayArrayArray2[arg4][arg5][arg0 + 1] = 50;
						}
						if (local97.aBoolean199) {
							this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local97.aBoolean204) {
							this.aByteArrayArrayArray2[arg4][arg5][arg0 + 1] = 50;
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0 + 1] = 50;
						}
						if (local97.aBoolean199) {
							this.anIntArrayArrayArray2[arg4][arg5][arg0 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local97.aBoolean204) {
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0] = 50;
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0 + 1] = 50;
						}
						if (local97.aBoolean199) {
							this.anIntArrayArrayArray2[arg4][arg5 + 1][arg0] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local97.aBoolean204) {
							this.aByteArrayArrayArray2[arg4][arg5][arg0] = 50;
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0] = 50;
						}
						if (local97.aBoolean199) {
							this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x492;
						}
					}
					if (local97.aBoolean201 && arg2 != null) {
						arg2.method165(arg0, arg7, arg5, arg3, (byte) 1, local97.aBoolean196);
					}
					if (local97.anInt762 != 16) {
						arg1.method333(arg0, local97.anInt762, arg5, arg4);
					}
				} else if (arg3 == 1) {
					if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
						local155 = local97.method521(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, 1, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
					}
					arg1.method325(anIntArray25[arg7], local155, local109, arg0, local123, arg5, null, local94, 0, arg4);
					if (local97.aBoolean204) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray2[arg4][arg5][arg0 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray2[arg4][arg5][arg0] = 50;
						}
					}
					if (local97.aBoolean201 && arg2 != null) {
						arg2.method165(arg0, arg7, arg5, arg3, (byte) 1, local97.aBoolean196);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class1_Sub1_Sub2 local893;
					if (arg3 == 2) {
						local864 = arg7 + 1 & 0x3;
						@Pc(883) Class1_Sub1_Sub2 local883;
						if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
							local883 = local97.method521(2, arg7 + 4, local49, local60, local73, local84, -1);
							local893 = local97.method521(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class1_Sub1_Sub2_Sub5(arg6, arg7 + 4, 2, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							local893 = new Class1_Sub1_Sub2_Sub5(arg6, local864, 2, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
						}
						arg1.method325(anIntArray27[arg7], local883, local109, arg0, local123, arg5, local893, local94, anIntArray27[local864], arg4);
						if (local97.aBoolean199) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg5][arg0 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray2[arg4][arg5][arg0 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg5 + 1][arg0] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray2[arg4][arg5 + 1][arg0] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg5][arg0] |= 0x249;
							}
						}
						if (local97.aBoolean201 && arg2 != null) {
							arg2.method165(arg0, arg7, arg5, arg3, (byte) 1, local97.aBoolean196);
						}
						if (local97.anInt762 != 16) {
							arg1.method333(arg0, local97.anInt762, arg5, arg4);
						}
					} else if (arg3 == 3) {
						if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
							local155 = local97.method521(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, 3, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
						}
						arg1.method325(anIntArray25[arg7], local155, local109, arg0, local123, arg5, null, local94, 0, arg4);
						if (local97.aBoolean204) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray2[arg4][arg5][arg0 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray2[arg4][arg5 + 1][arg0] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray2[arg4][arg5][arg0] = 50;
							}
						}
						if (local97.aBoolean201 && arg2 != null) {
							arg2.method165(arg0, arg7, arg5, arg3, (byte) 1, local97.aBoolean196);
						}
					} else if (arg3 == 9) {
						if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
							local155 = local97.method521(arg3, arg7, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, arg3, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
						}
						arg1.method327(local109, local123, local94, 1, local155, 1, arg4, 0, arg0, arg5);
						if (local97.aBoolean201 && arg2 != null) {
							arg2.method166(local97.aBoolean196, anInt54, local97.anInt746, local97.anInt756, arg5, arg0, arg7);
						}
					} else {
						if (local97.aBoolean197) {
							if (arg7 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg7 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg7 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg3 == 4) {
							if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
								local155 = local97.method521(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub1_Sub2_Sub5(arg6, 0, 4, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							}
							arg1.method326(local109, arg0, arg7 * 512, arg4, 0, local94, local155, arg5, local123, 0, anIntArray27[arg7]);
						} else if (arg3 == 5) {
							local864 = 16;
							local253 = arg1.method343(arg4, arg5, arg0);
							if (local253 > 0) {
								local864 = Class46.method515(local253 >> 14 & 0x7FFF).anInt762;
							}
							if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
								local893 = local97.method521(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class1_Sub1_Sub2_Sub5(arg6, 0, 4, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							}
							arg1.method326(local109, arg0, arg7 * 512, arg4, anIntArray24[arg7] * local864, local94, local893, arg5, local123, anIntArray26[arg7] * local864, anIntArray27[arg7]);
						} else if (arg3 == 6) {
							if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
								local155 = local97.method521(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub1_Sub2_Sub5(arg6, 0, 4, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							}
							arg1.method326(local109, arg0, arg7, arg4, 0, local94, local155, arg5, local123, 0, 256);
						} else if (arg3 == 7) {
							if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
								local155 = local97.method521(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub1_Sub2_Sub5(arg6, 0, 4, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							}
							arg1.method326(local109, arg0, arg7, arg4, 0, local94, local155, arg5, local123, 0, 512);
						} else if (arg3 == 8) {
							if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
								local155 = local97.method521(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class1_Sub1_Sub2_Sub5(arg6, 0, 4, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
							}
							arg1.method326(local109, arg0, arg7, arg4, 0, local94, local155, arg5, local123, 0, 768);
						}
					}
				}
			} else if (!aBoolean20 || local97.aBoolean203 || local97.aBoolean193) {
				if (local97.anInt763 == -1 && local97.anIntArray163 == null) {
					local155 = local97.method521(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class1_Sub1_Sub2_Sub5(arg6, arg7, 22, local60, (byte) 7, local73, local49, local84, local97.anInt763, true);
				}
				arg1.method323(arg4, local94, arg0, local155, local123, local109, arg5);
				if (local97.aBoolean201 && local97.aBoolean203 && arg2 != null) {
					arg2.method167(arg0, arg5);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("16863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(III)I")
	private int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(II[Lclient!FTPNODIB;III[BIII)V")
	public void method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg8 + local7 > 0 && arg8 + local7 < 103) {
						arg2[arg7].anIntArrayArray3[arg3 + local3][arg8 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(70) Class1_Sub1_Sub3 local70 = new Class1_Sub1_Sub3(arg5, 891);
			for (@Pc(72) int local72 = 0; local72 < 4; local72++) {
				for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
					for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
						if (local72 == arg0 && local76 >= arg4 && local76 < arg4 + 8 && local80 >= arg6 && local80 < arg6 + 8) {
							this.method51(arg8 + Class5.method26(local80 & 0x7, arg1, local76 & 0x7), 0, local70, arg3 + Class5.method25(arg1, local80 & 0x7, local76 & 0x7), arg7, arg1, 942, 0);
						} else {
							this.method51(-1, 0, local70, -1, 0, 0, 942, 0);
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("28153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([BIIIIB[Lclient!FTPNODIB;)V")
	public void method50(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class12[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg2 + local7 > 0 && arg2 + local7 < 103 && arg1 + local11 > 0 && arg1 + local11 < 103) {
							arg5[local3].anIntArrayArray3[arg2 + local7][arg1 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class1_Sub1_Sub3 local65 = new Class1_Sub1_Sub3(arg0, 891);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.method51(local75 + arg1, arg4, local65, local71 + arg2, local11, 0, 942, arg3);
					}
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("41691, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 4 + ", " + arg5 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IILclient!MBMGIXGO;IIIII)V")
	private void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(27) int local27;
			if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
				this.aByteArrayArrayArray6[arg4][arg3][arg0] = 0;
				while (true) {
					local27 = arg2.method268();
					if (local27 == 0) {
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg3][arg0] = -method42(arg3 + arg7 + 932731, arg0 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg4][arg3][arg0] = this.anIntArrayArrayArray1[arg4 - 1][arg3][arg0] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg2.method268();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg3][arg0] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg4][arg3][arg0] = this.anIntArrayArrayArray1[arg4 - 1][arg3][arg0] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray1[arg4][arg3][arg0] = arg2.method269();
						this.aByteArrayArrayArray3[arg4][arg3][arg0] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray5[arg4][arg3][arg0] = (byte) (local27 + arg5 - 2 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray6[arg4][arg3][arg0] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray4[arg4][arg3][arg0] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg2.method268();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg2.method268();
						return;
					}
					if (local27 <= 49) {
						arg2.method268();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("30203, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IIII)I")
	private int method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray6[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("5828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([Lclient!FTPNODIB;Lclient!NYFUGYQS;IIIZI[BIII)V")
	public void method53(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) Class27 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg6, 891);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method282();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method282();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method268();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg2 && local51 >= arg7 && local51 < arg7 + 8 && local45 >= arg4 && local45 < arg4 + 8) {
						@Pc(88) Class46 local88 = Class46.method515(local9);
						@Pc(104) int local104 = arg3 + Class5.method27(arg8, local88.anInt756, local51 & 0x7, local45 & 0x7, local88.anInt746);
						@Pc(120) int local120 = arg9 + Class5.method28(local45 & 0x7, local88.anInt756, arg8, local88.anInt746, local51 & 0x7);
						if (local104 > 0 && local120 > 0 && local104 < 103 && local120 < 103) {
							@Pc(132) int local132 = local55;
							if ((this.aByteArrayArrayArray6[1][local104][local120] & 0x2) == 2) {
								local132 = local55 - 1;
							}
							@Pc(147) Class12 local147 = null;
							if (local132 >= 0) {
								local147 = arg0[local132];
							}
							this.method45(local120, arg1, local147, local62, arg5, local104, local9, local66 + arg8 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("1483, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "(II)I")
	private int method55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(I[Lclient!FTPNODIB;IILclient!NYFUGYQS;[B)V")
	public void method60(@OriginalArg(0) int arg0, @OriginalArg(1) Class12[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class27 arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(14) Class1_Sub1_Sub3 local14 = new Class1_Sub1_Sub3(arg4, 891);
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local14.method282();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local14.method282();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local14.method268();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg0;
					@Pc(71) int local71 = local42 + arg2;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray6[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class12 local98 = null;
						if (local83 >= 0) {
							local98 = arg1[local83];
						}
						this.method45(local71, arg3, local98, local59, local52, local67, local16, local63);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("18363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}
}
