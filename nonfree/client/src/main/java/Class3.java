import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AIYLKTEB")
public final class Class3 {

	@OriginalMember(owner = "client!AIYLKTEB", name = "y", descriptor = "I")
	public static int anInt13;

	@OriginalMember(owner = "client!AIYLKTEB", name = "H", descriptor = "I")
	private static int anInt20;

	@OriginalMember(owner = "client!AIYLKTEB", name = "i", descriptor = "I")
	private static int anInt8 = -304;

	@OriginalMember(owner = "client!AIYLKTEB", name = "j", descriptor = "[I")
	private static final int[] anIntArray6 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!AIYLKTEB", name = "k", descriptor = "[I")
	private static final int[] anIntArray7 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!AIYLKTEB", name = "n", descriptor = "[I")
	private static final int[] anIntArray8 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!AIYLKTEB", name = "r", descriptor = "I")
	private static int anInt10 = 43310;

	@OriginalMember(owner = "client!AIYLKTEB", name = "s", descriptor = "I")
	private static int anInt11 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!AIYLKTEB", name = "v", descriptor = "I")
	private static int anInt12 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!AIYLKTEB", name = "w", descriptor = "[I")
	private static final int[] anIntArray9 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!AIYLKTEB", name = "z", descriptor = "I")
	public static int anInt14 = 99;

	@OriginalMember(owner = "client!AIYLKTEB", name = "C", descriptor = "Z")
	public static boolean aBoolean5 = true;

	@OriginalMember(owner = "client!AIYLKTEB", name = "G", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!AIYLKTEB", name = "m", descriptor = "I")
	private int anInt9 = 5;

	@OriginalMember(owner = "client!AIYLKTEB", name = "u", descriptor = "B")
	private byte aByte2 = -78;

	@OriginalMember(owner = "client!AIYLKTEB", name = "x", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!AIYLKTEB", name = "E", descriptor = "I")
	private int anInt17 = 2;

	@OriginalMember(owner = "client!AIYLKTEB", name = "F", descriptor = "I")
	private int anInt18 = -13196;

	@OriginalMember(owner = "client!AIYLKTEB", name = "A", descriptor = "I")
	private int anInt15;

	@OriginalMember(owner = "client!AIYLKTEB", name = "B", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!AIYLKTEB", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!AIYLKTEB", name = "D", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!AIYLKTEB", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!AIYLKTEB", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!AIYLKTEB", name = "t", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!AIYLKTEB", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!AIYLKTEB", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!AIYLKTEB", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!AIYLKTEB", name = "c", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!AIYLKTEB", name = "d", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!AIYLKTEB", name = "e", descriptor = "[I")
	private int[] anIntArray3;

	@OriginalMember(owner = "client!AIYLKTEB", name = "f", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!AIYLKTEB", name = "g", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(III)I")
	private static int method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method22(local3, local13);
		@Pc(29) int local29 = method22(local3 + 1, local13);
		@Pc(35) int local35 = method22(local3, local13 + 1);
		@Pc(43) int local43 = method22(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method12(local23, local29, local9, arg2);
		@Pc(55) int local55 = method12(local35, local43, local9, arg2);
		return method12(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(II)I")
	private static int method7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!AIYLKTEB", name = "b", descriptor = "(III)Z")
	public static boolean method10(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class41 local2 = Class41.method452(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method446(anInt8, arg0);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("27633, " + 946 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(IIII)I")
	private static int method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub1_Sub1.anIntArray15[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(Lclient!JHKSAGUC;Lclient!VCPXACGS;B)V")
	public static void method13(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class31_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(10) int local10 = arg0.method252();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class41 local19 = Class41.method452(local3);
				local19.method453(arg1, (byte) 6);
				while (true) {
					@Pc(26) int local26 = arg0.method252();
					if (local26 == 0) {
						break;
					}
					arg0.method238();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("50846, " + arg0 + ", " + arg1 + ", " + 36 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(III[[[ILclient!KFLNJHKB;IIIILclient!UMYAUCNU;I)V")
	public static void method21(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][][] arg2, @OriginalArg(4) Class20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class45 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg2[arg9][arg0][arg7];
			@Pc(19) int local19 = arg2[arg9][arg0 + 1][arg7];
			@Pc(31) int local31 = arg2[arg9][arg0 + 1][arg7 + 1];
			@Pc(41) int local41 = arg2[arg9][arg0][arg7 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class41 local54 = Class41.method452(arg4);
			if (anInt10 != 43310) {
				anInt20 = -396;
			}
			@Pc(71) int local71 = arg0 + (arg7 << 7) + (arg4 << 14) + 1073741824;
			if (!local54.aBoolean141) {
				local71 += Integer.MIN_VALUE;
			}
			@Pc(85) byte local85 = (byte) ((arg5 << 6) + arg6);
			@Pc(105) Class1_Sub1_Sub2 local105;
			if (arg6 == 22) {
				if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
					local105 = local54.method447(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local105 = new Class1_Sub1_Sub2_Sub3(22, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
				}
				arg8.method471(local85, local105, arg0, local71, local51, arg7, arg1);
				if (local54.aBoolean144 && local54.aBoolean141) {
					arg3.method279(arg0, arg7);
				}
			} else {
				@Pc(201) int local201;
				if (arg6 == 10 || arg6 == 11) {
					if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
						local105 = local54.method447(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub3(10, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
					}
					if (local105 != null) {
						@Pc(188) int local188 = 0;
						if (arg6 == 11) {
							local188 += 256;
						}
						@Pc(204) int local204;
						if (arg5 == 1 || arg5 == 3) {
							local201 = local54.anInt640;
							local204 = local54.anInt648;
						} else {
							local201 = local54.anInt648;
							local204 = local54.anInt640;
						}
						arg8.method475(arg0, local204, local188, local51, local105, local201, arg7, local85, local71, arg1);
					}
					if (local54.aBoolean144) {
						arg3.method278(local54.aBoolean133, arg7, local54.anInt640, local54.anInt648, arg5, arg0, (byte) 7);
					}
				} else if (arg6 >= 12) {
					if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
						local105 = local54.method447(arg6, arg5, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub3(arg6, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
					}
					arg8.method475(arg0, 1, 0, local51, local105, 1, arg7, local85, local71, arg1);
					if (local54.aBoolean144) {
						arg3.method278(local54.aBoolean133, arg7, local54.anInt640, local54.anInt648, arg5, arg0, (byte) 7);
					}
				} else if (arg6 == 0) {
					if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
						local105 = local54.method447(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub3(0, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
					}
					arg8.method473(local105, arg1, local85, local71, arg7, 0, local51, arg0, null, anIntArray8[arg5]);
					if (local54.aBoolean144) {
						arg3.method277(arg6, arg5, local54.aBoolean133, arg7, arg0, 861);
					}
				} else if (arg6 == 1) {
					if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
						local105 = local54.method447(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local105 = new Class1_Sub1_Sub2_Sub3(1, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
					}
					arg8.method473(local105, arg1, local85, local71, arg7, 0, local51, arg0, null, anIntArray7[arg5]);
					if (local54.aBoolean144) {
						arg3.method277(arg6, arg5, local54.aBoolean133, arg7, arg0, 861);
					}
				} else {
					@Pc(447) int local447;
					@Pc(476) Class1_Sub1_Sub2 local476;
					if (arg6 == 2) {
						local447 = arg5 + 1 & 0x3;
						@Pc(466) Class1_Sub1_Sub2 local466;
						if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
							local466 = local54.method447(2, arg5 + 4, local9, local19, local31, local41, -1);
							local476 = local54.method447(2, local447, local9, local19, local31, local41, -1);
						} else {
							local466 = new Class1_Sub1_Sub2_Sub3(2, arg5 + 4, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							local476 = new Class1_Sub1_Sub2_Sub3(2, local447, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
						}
						arg8.method473(local466, arg1, local85, local71, arg7, anIntArray8[local447], local51, arg0, local476, anIntArray8[arg5]);
						if (local54.aBoolean144) {
							arg3.method277(arg6, arg5, local54.aBoolean133, arg7, arg0, 861);
						}
					} else if (arg6 == 3) {
						if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
							local105 = local54.method447(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub2_Sub3(3, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
						}
						arg8.method473(local105, arg1, local85, local71, arg7, 0, local51, arg0, null, anIntArray7[arg5]);
						if (local54.aBoolean144) {
							arg3.method277(arg6, arg5, local54.aBoolean133, arg7, arg0, 861);
						}
					} else if (arg6 == 9) {
						if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
							local105 = local54.method447(arg6, arg5, local9, local19, local31, local41, -1);
						} else {
							local105 = new Class1_Sub1_Sub2_Sub3(arg6, arg5, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
						}
						arg8.method475(arg0, 1, 0, local51, local105, 1, arg7, local85, local71, arg1);
						if (local54.aBoolean144) {
							arg3.method278(local54.aBoolean133, arg7, local54.anInt640, local54.anInt648, arg5, arg0, (byte) 7);
						}
					} else {
						if (local54.aBoolean138) {
							if (arg5 == 1) {
								local447 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local447;
							} else if (arg5 == 2) {
								local447 = local41;
								local41 = local19;
								local19 = local447;
								local447 = local31;
								local31 = local9;
								local9 = local447;
							} else if (arg5 == 3) {
								local447 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local447;
							}
						}
						if (arg6 == 4) {
							if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
								local105 = local54.method447(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub3(4, 0, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							}
							arg8.method474(arg7, arg5 * 512, local71, local105, 0, anIntArray8[arg5], arg1, local51, 0, local85, arg0);
						} else if (arg6 == 5) {
							local447 = 16;
							local201 = arg8.method491(arg1, arg0, arg7);
							if (local201 > 0) {
								local447 = Class41.method452(local201 >> 14 & 0x7FFF).anInt646;
							}
							if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
								local476 = local54.method447(4, 0, local9, local19, local31, local41, -1);
							} else {
								local476 = new Class1_Sub1_Sub2_Sub3(4, 0, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							}
							arg8.method474(arg7, arg5 * 512, local71, local476, anIntArray9[arg5] * local447, anIntArray8[arg5], arg1, local51, anIntArray6[arg5] * local447, local85, arg0);
						} else if (arg6 == 6) {
							if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
								local105 = local54.method447(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub3(4, 0, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							}
							arg8.method474(arg7, arg5, local71, local105, 0, 256, arg1, local51, 0, local85, arg0);
						} else if (arg6 == 7) {
							if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
								local105 = local54.method447(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub3(4, 0, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							}
							arg8.method474(arg7, arg5, local71, local105, 0, 512, arg1, local51, 0, local85, arg0);
						} else if (arg6 == 8) {
							if (local54.anInt651 == -1 && local54.anIntArray161 == null) {
								local105 = local54.method447(4, 0, local9, local19, local31, local41, -1);
							} else {
								local105 = new Class1_Sub1_Sub2_Sub3(4, 0, local19, arg4, -611, local54.anInt651, local41, local31, true, local9);
							}
							arg8.method474(arg7, arg5, local71, local105, 0, 768, arg1, local51, 0, local85, arg0);
						}
					}
				}
			}
		} catch (@Pc(1015) RuntimeException local1015) {
			signlink.reporterror("21539, " + arg0 + ", " + 43310 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1015.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "c", descriptor = "(II)I")
	private static int method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method25(arg0 - 1, arg1 - 1) + method25(arg0 + 1, arg1 - 1) + method25(arg0 - 1, arg1 + 1) + method25(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method25(arg0 - 1, arg1) + method25(arg0 + 1, arg1) + method25(arg0, arg1 - 1) + method25(arg0, arg1 + 1);
		@Pc(59) int local59 = method25(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "d", descriptor = "(II)I")
	private static int method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method6(arg0 + 45365, arg1 + 91923, 4) + (method6(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method6(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "e", descriptor = "(II)I")
	private static int method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(IZ[BI)Z")
	public static boolean method26(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg1, 8);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method252();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method252();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method238() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class41 local89 = Class41.method452(local11);
							if (local68 != 22 || !aBoolean5 || local89.aBoolean141 || local89.aBoolean135) {
								local3 &= local89.method449();
								local30 = true;
							}
						}
					}
					local35 = local9.method252();
					if (local35 == 0) {
						break;
					}
					local9.method238();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("32610, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "<init>", descriptor = "(I[[[IZ[[[BI)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2) {
				for (@Pc(20) int local20 = 1; local20 > 0; local20++) {
				}
			}
			anInt14 = 99;
			this.anInt15 = arg0;
			this.anInt16 = arg4;
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray3 = arg3;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt15][this.anInt16];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt15][this.anInt16];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt15][this.anInt16];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt15][this.anInt16];
			this.anIntArrayArrayArray2 = new int[4][this.anInt15 + 1][this.anInt16 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt15 + 1][this.anInt16 + 1];
			this.anIntArrayArray1 = new int[this.anInt15 + 1][this.anInt16 + 1];
			this.anIntArray1 = new int[this.anInt16];
			this.anIntArray2 = new int[this.anInt16];
			this.anIntArray3 = new int[this.anInt16];
			this.anIntArray4 = new int[this.anInt16];
			this.anIntArray5 = new int[this.anInt16];
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("81355, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(IIIBI)V")
	public void method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg3; local7++) {
				for (@Pc(11) int local11 = arg1; local11 <= arg1 + arg2; local11++) {
					if (local11 >= 0 && local11 < this.anInt15 && local7 >= 0 && local7 < this.anInt16) {
						this.aByteArrayArrayArray2[0][local11][local7] = 127;
						if (local11 == arg1 && local11 > 0) {
							this.anIntArrayArrayArray1[0][local11][local7] = this.anIntArrayArrayArray1[0][local11 - 1][local7];
						}
						if (local11 == arg1 + arg2 && local11 < this.anInt15 - 1) {
							this.anIntArrayArrayArray1[0][local11][local7] = this.anIntArrayArrayArray1[0][local11 + 1][local7];
						}
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local11][local7] = this.anIntArrayArrayArray1[0][local11][local7 - 1];
						}
						if (local7 == arg0 + arg3 && local7 < this.anInt16 - 1) {
							this.anIntArrayArrayArray1[0][local11][local7] = this.anIntArrayArrayArray1[0][local11][local7 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("5054, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(Z[BII[Lclient!KFLNJHKB;II)V")
	public void method9(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg1 + local7 > 0 && arg1 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
							arg3[local3].anIntArrayArray7[arg1 + local7][arg2 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class1_Sub1_Sub3 local68 = new Class1_Sub1_Sub3(arg0, 8);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method19(local68, local74 + arg1, local78 + arg2, 0, arg4, local11, arg5);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("58701, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "b", descriptor = "(II)I")
	private int method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(ILclient!UMYAUCNU;[Lclient!KFLNJHKB;)V")
	public void method14(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class20[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray3[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray3[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method279(local7, local11);
							}
						}
					}
				}
			}
			anInt12 += (int) (Math.random() * 5.0D) - 2;
			if (anInt12 < -8) {
				anInt12 = -8;
			}
			if (anInt12 > 8) {
				anInt12 = 8;
			}
			anInt11 += (int) (Math.random() * 5.0D) - 2;
			if (anInt11 < -16) {
				anInt11 = -16;
			}
			if (anInt11 > 16) {
				anInt11 = 16;
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
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(112) byte[][] local112 = this.aByteArrayArrayArray2[local7];
				local137 = (int) Math.sqrt((double) 5100);
				local143 = local137 * 768 >> 8;
				for (local145 = 1; local145 < this.anInt16 - 1; local145++) {
					for (local149 = 1; local149 < this.anInt15 - 1; local149++) {
						local173 = this.anIntArrayArrayArray1[local7][local149 + 1][local145] - this.anIntArrayArrayArray1[local7][local149 - 1][local145];
						local195 = this.anIntArrayArrayArray1[local7][local149][local145 + 1] - this.anIntArrayArrayArray1[local7][local149][local145 - 1];
						local208 = (int) Math.sqrt((double) (local173 * local173 + local195 * local195 + 65536));
						local214 = (local173 << 8) / local208;
						local218 = 65536 / local208;
						local224 = (local195 << 8) / local208;
						local240 = (local214 * -50 + local218 * -10 + local224 * -50) / local143 + 96;
						local288 = (local112[local149 - 1][local145] >> 2) + (local112[local149 + 1][local145] >> 3) + (local112[local149][local145 - 1] >> 2) + (local112[local149][local145 + 1] >> 3) + (local112[local149][local145] >> 1);
						this.anIntArrayArray1[local149][local145] = local240 - local288;
					}
				}
				for (local149 = 0; local149 < this.anInt16; local149++) {
					this.anIntArray1[local149] = 0;
					this.anIntArray2[local149] = 0;
					this.anIntArray3[local149] = 0;
					this.anIntArray4[local149] = 0;
					this.anIntArray5[local149] = 0;
				}
				for (local173 = -5; local173 < this.anInt15 + 5; local173++) {
					for (local195 = 0; local195 < this.anInt16; local195++) {
						local208 = local173 + 5;
						@Pc(423) int local423;
						if (local208 >= 0 && local208 < this.anInt15) {
							local214 = this.aByteArrayArrayArray6[local7][local208][local195] & 0xFF;
							if (local214 > 0) {
								@Pc(382) Class28 local382 = Class28.aClass28Array1[local214 - 1];
								this.anIntArray1[local195] += local382.anInt465;
								this.anIntArray2[local195] += local382.anInt463;
								this.anIntArray3[local195] += local382.anInt464;
								this.anIntArray4[local195] += local382.anInt466;
								local423 = this.anIntArray5[local195]++;
							}
						}
						local214 = local173 - 5;
						if (local214 >= 0 && local214 < this.anInt15) {
							local218 = this.aByteArrayArrayArray6[local7][local214][local195] & 0xFF;
							if (local218 > 0) {
								@Pc(455) Class28 local455 = Class28.aClass28Array1[local218 - 1];
								this.anIntArray1[local195] -= local455.anInt465;
								this.anIntArray2[local195] -= local455.anInt463;
								this.anIntArray3[local195] -= local455.anInt464;
								this.anIntArray4[local195] -= local455.anInt466;
								local423 = this.anIntArray5[local195]--;
							}
						}
					}
					if (local173 >= 1 && local173 < this.anInt15 - 1) {
						local208 = 0;
						local214 = 0;
						local218 = 0;
						local224 = 0;
						local240 = 0;
						for (local288 = -5; local288 < this.anInt16 + 5; local288++) {
							@Pc(531) int local531 = local288 + 5;
							if (local531 >= 0 && local531 < this.anInt16) {
								local208 += this.anIntArray1[local531];
								local214 += this.anIntArray2[local531];
								local218 += this.anIntArray3[local531];
								local224 += this.anIntArray4[local531];
								local240 += this.anIntArray5[local531];
							}
							@Pc(576) int local576 = local288 - 5;
							if (local576 >= 0 && local576 < this.anInt16) {
								local208 -= this.anIntArray1[local576];
								local214 -= this.anIntArray2[local576];
								local218 -= this.anIntArray3[local576];
								local224 -= this.anIntArray4[local576];
								local240 -= this.anIntArray5[local576];
							}
							if (local288 >= 1 && local288 < this.anInt16 - 1 && (!aBoolean5 || (this.aByteArrayArrayArray3[0][local173][local288] & 0x2) != 0 || (this.aByteArrayArrayArray3[local7][local173][local288] & 0x10) == 0 && this.method24(local7, local173, local288) == anInt13)) {
								if (local7 < anInt14) {
									anInt14 = local7;
								}
								@Pc(675) int local675 = this.aByteArrayArrayArray6[local7][local173][local288] & 0xFF;
								@Pc(686) int local686 = this.aByteArrayArrayArray4[local7][local173][local288] & 0xFF;
								if (local675 > 0 || local686 > 0) {
									@Pc(699) int local699 = this.anIntArrayArrayArray1[local7][local173][local288];
									@Pc(710) int local710 = this.anIntArrayArrayArray1[local7][local173 + 1][local288];
									@Pc(723) int local723 = this.anIntArrayArrayArray1[local7][local173 + 1][local288 + 1];
									@Pc(734) int local734 = this.anIntArrayArrayArray1[local7][local173][local288 + 1];
									@Pc(741) int local741 = this.anIntArrayArray1[local173][local288];
									@Pc(750) int local750 = this.anIntArrayArray1[local173 + 1][local288];
									@Pc(761) int local761 = this.anIntArrayArray1[local173 + 1][local288 + 1];
									@Pc(770) int local770 = this.anIntArrayArray1[local173][local288 + 1];
									@Pc(772) int local772 = -1;
									@Pc(774) int local774 = -1;
									@Pc(782) int local782;
									@Pc(786) int local786;
									if (local675 > 0) {
										local782 = local208 * 256 / local224;
										local786 = local214 / local240;
										@Pc(790) int local790 = local218 / local240;
										local772 = this.method20(local782, local786, local790);
										@Pc(802) int local802 = local782 + anInt12 & 0xFF;
										local790 += anInt11;
										if (local790 < 0) {
											local790 = 0;
										} else if (local790 > 255) {
											local790 = 255;
										}
										local774 = this.method20(local802, local786, local790);
									}
									if (local7 > 0) {
										@Pc(827) boolean local827 = true;
										if (local675 == 0 && this.aByteArrayArrayArray1[local7][local173][local288] != 0) {
											local827 = false;
										}
										if (local686 > 0 && !Class28.aClass28Array1[local686 - 1].aBoolean99) {
											local827 = false;
										}
										if (local827 && local699 == local710 && local699 == local723 && local699 == local734) {
											this.anIntArrayArrayArray2[local7][local173][local288] |= 0x924;
										}
									}
									local782 = 0;
									if (local772 != -1) {
										local782 = Class1_Sub1_Sub1_Sub1.anIntArray19[method7(local774, 96)];
									}
									if (local686 == 0) {
										arg0.method470(local7, local173, local288, 0, 0, -1, local699, local710, local723, local734, method7(local772, local741), method7(local772, local750), method7(local772, local761), method7(local772, local770), 0, 0, 0, 0, local782, 0);
									} else {
										local786 = this.aByteArrayArrayArray1[local7][local173][local288] + 1;
										@Pc(939) byte local939 = this.aByteArrayArrayArray5[local7][local173][local288];
										@Pc(945) Class28 local945 = Class28.aClass28Array1[local686 - 1];
										@Pc(948) int local948 = local945.anInt461;
										@Pc(956) int local956;
										@Pc(954) int local954;
										if (local948 >= 0) {
											local954 = Class1_Sub1_Sub1_Sub1.method61(local948);
											local956 = -1;
										} else if (local945.anInt460 == 16711935) {
											local954 = 0;
											local956 = -2;
											local948 = -1;
										} else {
											local956 = this.method20(local945.anInt462, local945.anInt463, local945.anInt464);
											local954 = Class1_Sub1_Sub1_Sub1.anIntArray19[this.method11(local945.anInt467, 96)];
										}
										arg0.method470(local7, local173, local288, local786, local939, local948, local699, local710, local723, local734, method7(local772, local741), method7(local772, local750), method7(local772, local761), method7(local772, local770), this.method11(local956, local741), this.method11(local956, local750), this.method11(local956, local761), this.method11(local956, local770), local782, local954);
									}
								}
							}
						}
					}
				}
				for (local195 = 1; local195 < this.anInt16 - 1; local195++) {
					for (local208 = 1; local208 < this.anInt15 - 1; local208++) {
						arg0.method469(local7, local208, local195, this.method24(local7, local208, local195));
					}
				}
			}
			arg0.method496();
			for (local11 = 0; local11 < this.anInt15; local11++) {
				for (local27 = 0; local27 < this.anInt16; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg0.method467(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1127) int local1127 = 2;
			@Pc(1129) int local1129 = 4;
			for (@Pc(1131) int local1131 = 0; local1131 < 4; local1131++) {
				if (local1131 > 0) {
					local27 <<= 0x3;
					local1127 <<= 0x3;
					local1129 <<= 0x3;
				}
				for (@Pc(1149) int local1149 = 0; local1149 <= local1131; local1149++) {
					for (local137 = 0; local137 <= this.anInt16; local137++) {
						for (local143 = 0; local143 <= this.anInt15; local143++) {
							if ((this.anIntArrayArrayArray2[local1149][local143][local137] & local27) != 0) {
								local145 = local137;
								local149 = local137;
								local173 = local1149;
								local195 = local1149;
								while (local145 > 0 && (this.anIntArrayArrayArray2[local1149][local143][local145 - 1] & local27) != 0) {
									local145--;
								}
								while (local149 < this.anInt16 && (this.anIntArrayArrayArray2[local1149][local143][local149 + 1] & local27) != 0) {
									local149++;
								}
								label328: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray2[local173 - 1][local143][local208] & local27) == 0) {
											break label328;
										}
									}
									local173--;
								}
								label317: while (local195 < local1131) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray2[local195 + 1][local143][local208] & local27) == 0) {
											break label317;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray1[local195][local143][local145] - 240;
									local224 = this.anIntArrayArrayArray1[local173][local143][local145];
									Class45.method468(local224, local143 * 128, local149 * 128 + 128, local218, 1, local1131, local143 * 128, local145 * 128);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray2[local240][local143][local288] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1149][local143][local137] & local1127) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local1149;
								local195 = local1149;
								while (local145 > 0 && (this.anIntArrayArrayArray2[local1149][local145 - 1][local137] & local1127) != 0) {
									local145--;
								}
								while (local149 < this.anInt15 && (this.anIntArrayArrayArray2[local1149][local149 + 1][local137] & local1127) != 0) {
									local149++;
								}
								label381: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray2[local173 - 1][local208][local137] & local1127) == 0) {
											break label381;
										}
									}
									local173--;
								}
								label370: while (local195 < local1131) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray2[local195 + 1][local208][local137] & local1127) == 0) {
											break label370;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray1[local195][local145][local137] - 240;
									local224 = this.anIntArrayArrayArray1[local173][local145][local137];
									Class45.method468(local224, local145 * 128, local137 * 128, local218, 2, local1131, local149 * 128 + 128, local137 * 128);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray2[local240][local288][local137] &= ~local1127;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1149][local143][local137] & local1129) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local137;
								local195 = local137;
								while (local173 > 0 && (this.anIntArrayArrayArray2[local1149][local143][local173 - 1] & local1129) != 0) {
									local173--;
								}
								while (local195 < this.anInt16 && (this.anIntArrayArrayArray2[local1149][local143][local195 + 1] & local1129) != 0) {
									local195++;
								}
								label434: while (local145 > 0) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray2[local1149][local145 - 1][local208] & local1129) == 0) {
											break label434;
										}
									}
									local145--;
								}
								label423: while (local149 < this.anInt15) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray2[local1149][local149 + 1][local208] & local1129) == 0) {
											break label423;
										}
									}
									local149++;
								}
								if ((local149 + 1 - local145) * (local195 + 1 - local173) >= 4) {
									local208 = this.anIntArrayArrayArray1[local1149][local145][local173];
									Class45.method468(local208, local145 * 128, local195 * 128 + 128, local208, 4, local1131, local149 * 128 + 128, local173 * 128);
									for (local214 = local145; local214 <= local149; local214++) {
										for (local218 = local173; local218 <= local195; local218++) {
											this.anIntArrayArrayArray2[local1149][local214][local218] &= ~local1129;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1764) RuntimeException local1764) {
			signlink.reporterror("11188, " + 27029 + ", " + arg0 + ", " + arg1 + ", " + local1764.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(ZI[Lclient!KFLNJHKB;III[BIII)V")
	public void method15(@OriginalArg(1) int arg0, @OriginalArg(2) Class20[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg7 + local3 > 0 && arg7 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
						arg1[arg6].anIntArrayArray7[arg7 + local3][arg2 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub3 local57 = new Class1_Sub1_Sub3(arg5, 8);
			for (@Pc(62) int local62 = 0; local62 < 4; local62++) {
				for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						if (local62 == arg0 && local66 >= arg3 && local66 < arg3 + 8 && local70 >= arg8 && local70 < arg8 + 8) {
							this.method19(local57, arg7 + Class11.method137(local66 & 0x7, arg4, local70 & 0x7), arg2 + Class11.method138(local66 & 0x7, local70 & 0x7, arg4), arg4, 0, arg6, 0);
						} else {
							this.method19(local57, -1, -1, 0, 0, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("99838, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(Lclient!KFLNJHKB;ILclient!UMYAUCNU;IIIIBI)V")
	private void method16(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean5 && (this.aByteArrayArrayArray3[0][arg7][arg5] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray3[arg4][arg7][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method24(arg4, arg7, arg5) != anInt13) {
					return;
				}
			}
			if (arg4 < anInt14) {
				anInt14 = arg4;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg4][arg7][arg5];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg4][arg7 + 1][arg5];
			@Pc(73) int local73 = this.anIntArrayArrayArray1[arg4][arg7 + 1][arg5 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg4][arg7][arg5 + 1];
			@Pc(90) int local90;
			if (this.aByte2 != -78) {
				for (local90 = 1; local90 > 0; local90++) {
				}
			}
			local90 = local49 + local60 + local73 + local84 >> 2;
			@Pc(108) Class41 local108 = Class41.method452(arg6);
			@Pc(120) int local120 = arg7 + (arg5 << 7) + (arg6 << 14) + 1073741824;
			if (!local108.aBoolean141) {
				local120 += Integer.MIN_VALUE;
			}
			@Pc(134) byte local134 = (byte) ((arg1 << 6) + arg3);
			@Pc(163) Class1_Sub1_Sub2 local163;
			if (arg3 != 22) {
				@Pc(261) int local261;
				if (arg3 == 10 || arg3 == 11) {
					if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
						local163 = local108.method447(10, arg1, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class1_Sub1_Sub2_Sub3(10, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
					}
					if (local163 != null) {
						@Pc(248) int local248 = 0;
						if (arg3 == 11) {
							local248 += 256;
						}
						@Pc(264) int local264;
						if (arg1 == 1 || arg1 == 3) {
							local261 = local108.anInt640;
							local264 = local108.anInt648;
						} else {
							local261 = local108.anInt648;
							local264 = local108.anInt640;
						}
						if (arg2.method475(arg7, local264, local248, local90, local163, local261, arg5, local134, local120, arg4) && local108.aBoolean134) {
							@Pc(295) Class1_Sub1_Sub2_Sub6 local295;
							if (local163 instanceof Class1_Sub1_Sub2_Sub6) {
								local295 = (Class1_Sub1_Sub2_Sub6) local163;
							} else {
								local295 = local108.method447(10, arg1, local49, local60, local73, local84, -1);
							}
							if (local295 != null) {
								for (@Pc(311) int local311 = 0; local311 <= local261; local311++) {
									for (@Pc(315) int local315 = 0; local315 <= local264; local315++) {
										@Pc(322) int local322 = local295.anInt616 / 4;
										if (local322 > 30) {
											local322 = 30;
										}
										if (local322 > this.aByteArrayArrayArray2[arg4][arg7 + local311][arg5 + local315]) {
											this.aByteArrayArrayArray2[arg4][arg7 + local311][arg5 + local315] = (byte) local322;
										}
									}
								}
							}
						}
					}
					if (local108.aBoolean144 && arg0 != null) {
						arg0.method278(local108.aBoolean133, arg5, local108.anInt640, local108.anInt648, arg1, arg7, (byte) 7);
					}
				} else if (arg3 >= 12) {
					if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
						local163 = local108.method447(arg3, arg1, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class1_Sub1_Sub2_Sub3(arg3, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
					}
					arg2.method475(arg7, 1, 0, local90, local163, 1, arg5, local134, local120, arg4);
					if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
						this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x924;
					}
					if (local108.aBoolean144 && arg0 != null) {
						arg0.method278(local108.aBoolean133, arg5, local108.anInt640, local108.anInt648, arg1, arg7, (byte) 7);
					}
				} else if (arg3 == 0) {
					if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
						local163 = local108.method447(0, arg1, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class1_Sub1_Sub2_Sub3(0, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
					}
					arg2.method473(local163, arg4, local134, local120, arg5, 0, local90, arg7, null, anIntArray8[arg1]);
					if (arg1 == 0) {
						if (local108.aBoolean134) {
							this.aByteArrayArrayArray2[arg4][arg7][arg5] = 50;
							this.aByteArrayArrayArray2[arg4][arg7][arg5 + 1] = 50;
						}
						if (local108.aBoolean136) {
							this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local108.aBoolean134) {
							this.aByteArrayArrayArray2[arg4][arg7][arg5 + 1] = 50;
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5 + 1] = 50;
						}
						if (local108.aBoolean136) {
							this.anIntArrayArrayArray2[arg4][arg7][arg5 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local108.aBoolean134) {
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5] = 50;
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5 + 1] = 50;
						}
						if (local108.aBoolean136) {
							this.anIntArrayArrayArray2[arg4][arg7 + 1][arg5] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local108.aBoolean134) {
							this.aByteArrayArrayArray2[arg4][arg7][arg5] = 50;
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5] = 50;
						}
						if (local108.aBoolean136) {
							this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x492;
						}
					}
					if (local108.aBoolean144 && arg0 != null) {
						arg0.method277(arg3, arg1, local108.aBoolean133, arg5, arg7, 861);
					}
					if (local108.anInt646 != 16) {
						arg2.method481(local108.anInt646, arg7, arg4, arg5);
					}
				} else if (arg3 == 1) {
					if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
						local163 = local108.method447(1, arg1, local49, local60, local73, local84, -1);
					} else {
						local163 = new Class1_Sub1_Sub2_Sub3(1, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
					}
					arg2.method473(local163, arg4, local134, local120, arg5, 0, local90, arg7, null, anIntArray7[arg1]);
					if (local108.aBoolean134) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray2[arg4][arg7][arg5 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray2[arg4][arg7][arg5] = 50;
						}
					}
					if (local108.aBoolean144 && arg0 != null) {
						arg0.method277(arg3, arg1, local108.aBoolean133, arg5, arg7, 861);
					}
				} else {
					@Pc(872) int local872;
					@Pc(901) Class1_Sub1_Sub2 local901;
					if (arg3 == 2) {
						local872 = arg1 + 1 & 0x3;
						@Pc(891) Class1_Sub1_Sub2 local891;
						if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
							local891 = local108.method447(2, arg1 + 4, local49, local60, local73, local84, -1);
							local901 = local108.method447(2, local872, local49, local60, local73, local84, -1);
						} else {
							local891 = new Class1_Sub1_Sub2_Sub3(2, arg1 + 4, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							local901 = new Class1_Sub1_Sub2_Sub3(2, local872, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
						}
						arg2.method473(local891, arg4, local134, local120, arg5, anIntArray8[local872], local90, arg7, local901, anIntArray8[arg1]);
						if (local108.aBoolean136) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg7][arg5 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray2[arg4][arg7][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg7 + 1][arg5] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray2[arg4][arg7 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x492;
								this.anIntArrayArrayArray2[arg4][arg7][arg5] |= 0x249;
							}
						}
						if (local108.aBoolean144 && arg0 != null) {
							arg0.method277(arg3, arg1, local108.aBoolean133, arg5, arg7, 861);
						}
						if (local108.anInt646 != 16) {
							arg2.method481(local108.anInt646, arg7, arg4, arg5);
						}
					} else if (arg3 == 3) {
						if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
							local163 = local108.method447(3, arg1, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class1_Sub1_Sub2_Sub3(3, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
						}
						arg2.method473(local163, arg4, local134, local120, arg5, 0, local90, arg7, null, anIntArray7[arg1]);
						if (local108.aBoolean134) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray2[arg4][arg7][arg5 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray2[arg4][arg7 + 1][arg5] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray2[arg4][arg7][arg5] = 50;
							}
						}
						if (local108.aBoolean144 && arg0 != null) {
							arg0.method277(arg3, arg1, local108.aBoolean133, arg5, arg7, 861);
						}
					} else if (arg3 == 9) {
						if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
							local163 = local108.method447(arg3, arg1, local49, local60, local73, local84, -1);
						} else {
							local163 = new Class1_Sub1_Sub2_Sub3(arg3, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
						}
						arg2.method475(arg7, 1, 0, local90, local163, 1, arg5, local134, local120, arg4);
						if (local108.aBoolean144 && arg0 != null) {
							arg0.method278(local108.aBoolean133, arg5, local108.anInt640, local108.anInt648, arg1, arg7, (byte) 7);
						}
					} else {
						if (local108.aBoolean138) {
							if (arg1 == 1) {
								local872 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local872;
							} else if (arg1 == 2) {
								local872 = local84;
								local84 = local60;
								local60 = local872;
								local872 = local73;
								local73 = local49;
								local49 = local872;
							} else if (arg1 == 3) {
								local872 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local872;
							}
						}
						if (arg3 == 4) {
							if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
								local163 = local108.method447(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class1_Sub1_Sub2_Sub3(4, 0, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							}
							arg2.method474(arg5, arg1 * 512, local120, local163, 0, anIntArray8[arg1], arg4, local90, 0, local134, arg7);
						} else if (arg3 == 5) {
							local872 = 16;
							local261 = arg2.method491(arg4, arg7, arg5);
							if (local261 > 0) {
								local872 = Class41.method452(local261 >> 14 & 0x7FFF).anInt646;
							}
							if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
								local901 = local108.method447(4, 0, local49, local60, local73, local84, -1);
							} else {
								local901 = new Class1_Sub1_Sub2_Sub3(4, 0, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							}
							arg2.method474(arg5, arg1 * 512, local120, local901, anIntArray9[arg1] * local872, anIntArray8[arg1], arg4, local90, anIntArray6[arg1] * local872, local134, arg7);
						} else if (arg3 == 6) {
							if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
								local163 = local108.method447(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class1_Sub1_Sub2_Sub3(4, 0, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							}
							arg2.method474(arg5, arg1, local120, local163, 0, 256, arg4, local90, 0, local134, arg7);
						} else if (arg3 == 7) {
							if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
								local163 = local108.method447(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class1_Sub1_Sub2_Sub3(4, 0, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							}
							arg2.method474(arg5, arg1, local120, local163, 0, 512, arg4, local90, 0, local134, arg7);
						} else if (arg3 == 8) {
							if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
								local163 = local108.method447(4, 0, local49, local60, local73, local84, -1);
							} else {
								local163 = new Class1_Sub1_Sub2_Sub3(4, 0, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
							}
							arg2.method474(arg5, arg1, local120, local163, 0, 768, arg4, local90, 0, local134, arg7);
						}
					}
				}
			} else if (!aBoolean5 || local108.aBoolean141 || local108.aBoolean135) {
				if (local108.anInt651 == -1 && local108.anIntArray161 == null) {
					local163 = local108.method447(22, arg1, local49, local60, local73, local84, -1);
				} else {
					local163 = new Class1_Sub1_Sub2_Sub3(22, arg1, local60, arg6, -611, local108.anInt651, local84, local73, true, local49);
				}
				arg2.method471(local134, local163, arg7, local120, local90, arg5, arg4);
				if (local108.aBoolean144 && local108.aBoolean141 && arg0 != null) {
					arg0.method279(arg7, arg5);
				}
			}
		} catch (@Pc(1646) RuntimeException local1646) {
			signlink.reporterror("48106, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -78 + ", " + arg7 + ", " + local1646.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(II[B[Lclient!KFLNJHKB;IIIIILclient!UMYAUCNU;I)V")
	public void method17(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class20[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class45 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, 8);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method252();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method252();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method238();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					if (local49 == arg3 && local45 >= arg5 && local45 < arg5 + 8 && local39 >= arg9 && local39 < arg9 + 8) {
						@Pc(82) Class41 local82 = Class41.method452(local9);
						@Pc(99) int local99 = arg4 + Class11.method139(arg7, local82.anInt648, this.anInt9, local45 & 0x7, local82.anInt640, local39 & 0x7);
						@Pc(115) int local115 = arg0 + Class11.method140(local82.anInt640, local45 & 0x7, arg7, local82.anInt648, local39 & 0x7);
						if (local99 > 0 && local115 > 0 && local99 < 103 && local115 < 103) {
							@Pc(127) int local127 = local49;
							if ((this.aByteArrayArrayArray3[1][local99][local115] & 0x2) == 2) {
								local127 = local49 - 1;
							}
							@Pc(142) Class20 local142 = null;
							if (local127 >= 0) {
								local142 = arg2[local127];
							}
							this.method16(local142, local60 + arg7 & 0x3, arg8, local56, arg6, local115, local9, local99);
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("73834, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(ILclient!UMYAUCNU;II[Lclient!KFLNJHKB;[B)V")
	public void method18(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class20[] arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, 8);
			if (this.anInt17 != 2) {
				this.anInt18 = -40;
			}
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local7.method252();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local7.method252();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local7.method238();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg2;
					@Pc(71) int local71 = local42 + arg0;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray3[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class20 local98 = null;
						if (local83 >= 0) {
							local98 = arg3[local83];
						}
						this.method16(local98, local63, arg1, local59, local52, local71, local16, local67);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("10374, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(Lclient!JHKSAGUC;IIIIIII)V")
	private void method19(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(34) int local34;
			if (arg1 >= 0 && arg1 < 104 && arg2 >= 0 && arg2 < 104) {
				this.aByteArrayArrayArray3[arg5][arg1][arg2] = 0;
				while (true) {
					local34 = arg0.method238();
					if (local34 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg2] = -method23(arg1 + arg6 + 932731, arg2 + 556238 + arg4) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg5][arg1][arg2] = this.anIntArrayArrayArray1[arg5 - 1][arg1][arg2] - 240;
							return;
						}
					}
					if (local34 == 1) {
						@Pc(88) int local88 = arg0.method238();
						if (local88 == 1) {
							local88 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg2] = -local88 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg5][arg1][arg2] = this.anIntArrayArrayArray1[arg5 - 1][arg1][arg2] - local88 * 8;
						return;
					}
					if (local34 <= 49) {
						this.aByteArrayArrayArray4[arg5][arg1][arg2] = arg0.method239();
						this.aByteArrayArrayArray1[arg5][arg1][arg2] = (byte) ((local34 - 2) / 4);
						this.aByteArrayArrayArray5[arg5][arg1][arg2] = (byte) (local34 + arg3 - 2 & 0x3);
					} else if (local34 <= 81) {
						this.aByteArrayArrayArray3[arg5][arg1][arg2] = (byte) (local34 - 49);
					} else {
						this.aByteArrayArrayArray6[arg5][arg1][arg2] = (byte) (local34 - 81);
					}
				}
			} else {
				while (true) {
					local34 = arg0.method238();
					if (local34 == 0) {
						return;
					}
					if (local34 == 1) {
						arg0.method238();
						return;
					}
					if (local34 <= 49) {
						arg0.method238();
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("97960, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 7 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIYLKTEB", name = "c", descriptor = "(III)I")
	private int method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!AIYLKTEB", name = "a", descriptor = "(ZIII)I")
	private int method24(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("75143, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
