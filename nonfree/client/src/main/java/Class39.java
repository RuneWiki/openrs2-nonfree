import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SBZYTIRX")
public final class Class39 {

	@OriginalMember(owner = "client!SBZYTIRX", name = "f", descriptor = "I")
	private static int anInt694;

	@OriginalMember(owner = "client!SBZYTIRX", name = "D", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!SBZYTIRX", name = "e", descriptor = "[I")
	private static final int[] anIntArray172 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!SBZYTIRX", name = "j", descriptor = "I")
	public static int anInt695 = 99;

	@OriginalMember(owner = "client!SBZYTIRX", name = "r", descriptor = "[I")
	private static final int[] anIntArray178 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!SBZYTIRX", name = "s", descriptor = "[I")
	private static final int[] anIntArray179 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!SBZYTIRX", name = "u", descriptor = "[I")
	private static final int[] anIntArray180 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!SBZYTIRX", name = "x", descriptor = "I")
	private static int anInt698 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!SBZYTIRX", name = "B", descriptor = "Z")
	public static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!SBZYTIRX", name = "C", descriptor = "I")
	private static int anInt701 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!SBZYTIRX", name = "G", descriptor = "B")
	private static byte aByte22 = 3;

	@OriginalMember(owner = "client!SBZYTIRX", name = "v", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!SBZYTIRX", name = "z", descriptor = "I")
	private int anInt699 = 5;

	@OriginalMember(owner = "client!SBZYTIRX", name = "A", descriptor = "I")
	private int anInt700 = -319;

	@OriginalMember(owner = "client!SBZYTIRX", name = "E", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!SBZYTIRX", name = "F", descriptor = "I")
	private int anInt703 = -431;

	@OriginalMember(owner = "client!SBZYTIRX", name = "k", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!SBZYTIRX", name = "l", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!SBZYTIRX", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!SBZYTIRX", name = "w", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!SBZYTIRX", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!SBZYTIRX", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!SBZYTIRX", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!SBZYTIRX", name = "y", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!SBZYTIRX", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!SBZYTIRX", name = "m", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!SBZYTIRX", name = "n", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!SBZYTIRX", name = "o", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!SBZYTIRX", name = "p", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!SBZYTIRX", name = "q", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(II)I")
	private static int method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method475(arg0 - 1, arg1 - 1) + method475(arg0 + 1, arg1 - 1) + method475(arg0 - 1, arg1 + 1) + method475(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method475(arg0 - 1, arg1) + method475(arg0 + 1, arg1) + method475(arg0, arg1 - 1) + method475(arg0, arg1 + 1);
		@Pc(59) int local59 = method475(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(II)I")
	private static int method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIII[[[IIILclient!LQLHEUAQ;ILclient!JFQWYHZJ;I)V")
	public static void method476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class18 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg3[arg7][arg4][arg5];
			@Pc(19) int local19 = arg3[arg7][arg4 + 1][arg5];
			@Pc(31) int local31 = arg3[arg7][arg4 + 1][arg5 + 1];
			@Pc(41) int local41 = arg3[arg7][arg4][arg5 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class5 local54 = Class5.method130(arg9);
			@Pc(66) int local66 = arg4 + (arg5 << 7) + (arg9 << 14) + 1073741824;
			if (!local54.aBoolean48) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg2 << 6) + arg0);
			@Pc(109) Class1_Sub1_Sub1 local109;
			if (arg0 == 22) {
				if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
					local109 = local54.method132(22, arg2, local9, local19, local31, local41, -1);
				} else {
					local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, 22, true, 902, local9, local41);
				}
				arg8.method197(arg1, local109, arg5, arg4, local51, local66, local80);
				if (local54.aBoolean45 && local54.aBoolean48) {
					arg6.method261(arg4, arg5);
				}
			} else {
				@Pc(205) int local205;
				if (arg0 == 10 || arg0 == 11) {
					if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
						local109 = local54.method132(10, arg2, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, 10, true, 902, local9, local41);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg0 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg2 == 1 || arg2 == 3) {
							local205 = local54.anInt280;
							local208 = local54.anInt261;
						} else {
							local205 = local54.anInt261;
							local208 = local54.anInt280;
						}
						arg8.method201(arg4, local109, arg5, anInt694, local192, local208, local66, local80, local51, local205, arg1);
					}
					if (local54.aBoolean45) {
						arg6.method260(arg5, local54.aBoolean39, local54.anInt261, arg2, arg4, local54.anInt280);
					}
				} else if (arg0 >= 12) {
					if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
						local109 = local54.method132(arg0, arg2, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, arg0, true, 902, local9, local41);
					}
					arg8.method201(arg4, local109, arg5, anInt694, 0, 1, local66, local80, local51, 1, arg1);
					if (local54.aBoolean45) {
						arg6.method260(arg5, local54.aBoolean39, local54.anInt261, arg2, arg4, local54.anInt280);
					}
				} else if (arg0 == 0) {
					if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
						local109 = local54.method132(0, arg2, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, 0, true, 902, local9, local41);
					}
					arg8.method199(anIntArray180[arg2], 0, arg5, local66, null, local109, local80, arg4, arg1, local51);
					if (local54.aBoolean45) {
						arg6.method259(local54.aBoolean39, arg4, arg2, arg0, arg5);
					}
				} else if (arg0 == 1) {
					if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
						local109 = local54.method132(1, arg2, local9, local19, local31, local41, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, 1, true, 902, local9, local41);
					}
					arg8.method199(anIntArray172[arg2], 0, arg5, local66, null, local109, local80, arg4, arg1, local51);
					if (local54.aBoolean45) {
						arg6.method259(local54.aBoolean39, arg4, arg2, arg0, arg5);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class1_Sub1_Sub1 local480;
					if (arg0 == 2) {
						local451 = arg2 + 1 & 0x3;
						@Pc(470) Class1_Sub1_Sub1 local470;
						if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
							local470 = local54.method132(2, arg2 + 4, local9, local19, local31, local41, -1);
							local480 = local54.method132(2, local451, local9, local19, local31, local41, -1);
						} else {
							local470 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2 + 4, 2, true, 902, local9, local41);
							local480 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, local451, 2, true, 902, local9, local41);
						}
						arg8.method199(anIntArray180[arg2], anIntArray180[local451], arg5, local66, local480, local470, local80, arg4, arg1, local51);
						if (local54.aBoolean45) {
							arg6.method259(local54.aBoolean39, arg4, arg2, arg0, arg5);
						}
					} else if (arg0 == 3) {
						if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
							local109 = local54.method132(3, arg2, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, 3, true, 902, local9, local41);
						}
						arg8.method199(anIntArray172[arg2], 0, arg5, local66, null, local109, local80, arg4, arg1, local51);
						if (local54.aBoolean45) {
							arg6.method259(local54.aBoolean39, arg4, arg2, arg0, arg5);
						}
					} else if (arg0 == 9) {
						if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
							local109 = local54.method132(arg0, arg2, local9, local19, local31, local41, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, arg2, arg0, true, 902, local9, local41);
						}
						arg8.method201(arg4, local109, arg5, anInt694, 0, 1, local66, local80, local51, 1, arg1);
						if (local54.aBoolean45) {
							arg6.method260(arg5, local54.aBoolean39, local54.anInt261, arg2, arg4, local54.anInt280);
						}
					} else {
						if (local54.aBoolean42) {
							if (arg2 == 1) {
								local451 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local451;
							} else if (arg2 == 2) {
								local451 = local41;
								local41 = local19;
								local19 = local451;
								local451 = local31;
								local31 = local9;
								local9 = local451;
							} else if (arg2 == 3) {
								local451 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local451;
							}
						}
						if (arg0 == 4) {
							if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
								local109 = local54.method132(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, 0, 4, true, 902, local9, local41);
							}
							arg8.method200(arg1, arg5, 0, arg4, local109, anIntArray180[arg2], aByte22, 0, arg2 * 512, local66, local80, local51);
						} else if (arg0 == 5) {
							local451 = 16;
							local205 = arg8.method217(arg1, arg4, arg5);
							if (local205 > 0) {
								local451 = Class5.method130(local205 >> 14 & 0x7FFF).anInt262;
							}
							if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
								local480 = local54.method132(4, 0, local9, local19, local31, local41, -1);
							} else {
								local480 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, 0, 4, true, 902, local9, local41);
							}
							arg8.method200(arg1, arg5, anIntArray178[arg2] * local451, arg4, local480, anIntArray180[arg2], aByte22, anIntArray179[arg2] * local451, arg2 * 512, local66, local80, local51);
						} else if (arg0 == 6) {
							if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
								local109 = local54.method132(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, 0, 4, true, 902, local9, local41);
							}
							arg8.method200(arg1, arg5, 0, arg4, local109, 256, aByte22, 0, arg2, local66, local80, local51);
						} else if (arg0 == 7) {
							if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
								local109 = local54.method132(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, 0, 4, true, 902, local9, local41);
							}
							arg8.method200(arg1, arg5, 0, arg4, local109, 512, aByte22, 0, arg2, local66, local80, local51);
						} else if (arg0 == 8) {
							if (local54.anInt264 == -1 && local54.anIntArray36 == null) {
								local109 = local54.method132(4, 0, local9, local19, local31, local41, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub5(local19, local54.anInt264, arg9, local31, 0, 4, true, 902, local9, local41);
							}
							arg8.method200(arg1, arg5, 0, arg4, local109, 768, aByte22, 0, arg2, local66, local80, local51);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("82072, " + 33254 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(IIII)I")
	private static int method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub4.anIntArray196[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "c", descriptor = "(II)I")
	private static int method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SBZYTIRX", name = "b", descriptor = "(III)I")
	private static int method483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method472(local3, local13);
		@Pc(29) int local29 = method472(local3 + 1, local13);
		@Pc(35) int local35 = method472(local3, local13 + 1);
		@Pc(43) int local43 = method472(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method479(local23, local29, local9, arg2);
		@Pc(55) int local55 = method479(local35, local43, local9, arg2);
		return method479(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "d", descriptor = "(II)I")
	private static int method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method483(arg0 + 45365, arg1 + 91923, 4) + (method483(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method483(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IBI)Z")
	public static boolean method487(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Class5 local2 = Class5.method130(arg2);
			@Pc(7) boolean local7 = false;
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method125(arg0);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("66273, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(I[BII)Z")
	public static boolean method490(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) boolean local12 = true;
			@Pc(18) Class1_Sub1_Sub4 local18 = new Class1_Sub1_Sub4(0, arg0);
			@Pc(20) int local20 = -1;
			label53: while (true) {
				@Pc(23) int local23 = local18.method308();
				if (local23 == 0) {
					return local12;
				}
				local20 += local23;
				@Pc(31) int local31 = 0;
				@Pc(33) boolean local33 = false;
				while (true) {
					@Pc(38) int local38;
					while (!local33) {
						local38 = local18.method308();
						if (local38 == 0) {
							continue label53;
						}
						local31 += local38 - 1;
						@Pc(60) int local60 = local31 & 0x3F;
						@Pc(66) int local66 = local31 >> 6 & 0x3F;
						@Pc(71) int local71 = local18.method294() >> 2;
						@Pc(75) int local75 = local66 + arg2;
						@Pc(79) int local79 = local60 + arg1;
						if (local75 > 0 && local79 > 0 && local75 < 103 && local79 < 103) {
							@Pc(92) Class5 local92 = Class5.method130(local20);
							if (local71 != 22 || !aBoolean150 || local92.aBoolean48 || local92.aBoolean38) {
								local12 &= local92.method126();
								local33 = true;
							}
						}
					}
					local38 = local18.method308();
					if (local38 == 0) {
						break;
					}
					local18.method294();
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("24799, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(Lclient!RKMPVAZH;ILclient!MVHXDWGI;)V")
	public static void method492(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(10) int local10 = arg1.method308();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class5 local19 = Class5.method130(local3);
				local19.method129(arg0);
				while (true) {
					@Pc(26) int local26 = arg1.method308();
					if (local26 == 0) {
						break;
					}
					arg1.method294();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24044, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "<init>", descriptor = "([[[III[[[BI)V")
	public Class39(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			anInt695 = 99;
			this.anInt696 = arg4;
			this.anInt697 = arg1;
			this.anIntArrayArrayArray6 = arg0;
			this.aByteArrayArrayArray6 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt696][this.anInt697];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt696][this.anInt697];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt696][this.anInt697];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt696][this.anInt697];
			this.anIntArrayArrayArray5 = new int[4][this.anInt696 + 1][this.anInt697 + 1];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt696 + 1][this.anInt697 + 1];
			this.anIntArrayArray18 = new int[this.anInt696 + 1][this.anInt697 + 1];
			this.anIntArray173 = new int[this.anInt697];
			this.anIntArray174 = new int[this.anInt697];
			this.anIntArray175 = new int[this.anInt697];
			this.anIntArray176 = new int[this.anInt697];
			this.anIntArray177 = new int[this.anInt697];
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("12094, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIII)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			if (this.anInt699 != 5) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(18) int local18;
			for (local7 = 0; local7 < 8; local7++) {
				for (local18 = 0; local18 < 8; local18++) {
					this.anIntArrayArrayArray6[arg0][arg1 + local7][arg2 + local18] = 0;
				}
			}
			if (arg1 > 0) {
				for (local18 = 1; local18 < 8; local18++) {
					this.anIntArrayArrayArray6[arg0][arg1][arg2 + local18] = this.anIntArrayArrayArray6[arg0][arg1 - 1][arg2 + local18];
				}
			}
			if (arg2 > 0) {
				for (local18 = 1; local18 < 8; local18++) {
					this.anIntArrayArrayArray6[arg0][arg1 + local18][arg2] = this.anIntArrayArrayArray6[arg0][arg1 + local18][arg2 - 1];
				}
			}
			if (arg1 > 0 && this.anIntArrayArrayArray6[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = this.anIntArrayArrayArray6[arg0][arg1 - 1][arg2];
			} else if (arg2 > 0 && this.anIntArrayArrayArray6[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = this.anIntArrayArrayArray6[arg0][arg1][arg2 - 1];
			} else if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray6[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = this.anIntArrayArrayArray6[arg0][arg1 - 1][arg2 - 1];
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("84877, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIIILclient!JFQWYHZJ;Lclient!LQLHEUAQ;III)V")
	private void method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class18 arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean150 && (this.aByteArrayArrayArray6[0][arg2][arg1] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg0][arg2][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method486(arg2, arg0, arg1) != anInt702) {
					return;
				}
			}
			if (arg0 < anInt695) {
				anInt695 = arg0;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray6[arg0][arg2][arg1];
			@Pc(60) int local60 = this.anIntArrayArrayArray6[arg0][arg2 + 1][arg1];
			@Pc(73) int local73 = this.anIntArrayArrayArray6[arg0][arg2 + 1][arg1 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray6[arg0][arg2][arg1 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(111) Class5 local111 = Class5.method130(arg3);
			@Pc(123) int local123 = arg2 + (arg1 << 7) + (arg3 << 14) + 1073741824;
			if (!local111.aBoolean48) {
				local123 += Integer.MIN_VALUE;
			}
			@Pc(137) byte local137 = (byte) ((arg7 << 6) + arg6);
			@Pc(166) Class1_Sub1_Sub1 local166;
			if (arg6 != 22) {
				@Pc(264) int local264;
				if (arg6 == 10 || arg6 == 11) {
					if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
						local166 = local111.method132(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, 10, true, 902, local49, local84);
					}
					if (local166 != null) {
						@Pc(251) int local251 = 0;
						if (arg6 == 11) {
							local251 += 256;
						}
						@Pc(267) int local267;
						if (arg7 == 1 || arg7 == 3) {
							local264 = local111.anInt280;
							local267 = local111.anInt261;
						} else {
							local264 = local111.anInt261;
							local267 = local111.anInt280;
						}
						if (arg4.method201(arg2, local166, arg1, anInt694, local251, local267, local123, local137, local94, local264, arg0) && local111.aBoolean49) {
							@Pc(298) Class1_Sub1_Sub1_Sub4 local298;
							if (local166 instanceof Class1_Sub1_Sub1_Sub4) {
								local298 = (Class1_Sub1_Sub1_Sub4) local166;
							} else {
								local298 = local111.method132(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local298 != null) {
								for (@Pc(314) int local314 = 0; local314 <= local264; local314++) {
									for (@Pc(318) int local318 = 0; local318 <= local267; local318++) {
										@Pc(325) int local325 = local298.anInt609 / 4;
										if (local325 > 30) {
											local325 = 30;
										}
										if (local325 > this.aByteArrayArrayArray7[arg0][arg2 + local314][arg1 + local318]) {
											this.aByteArrayArrayArray7[arg0][arg2 + local314][arg1 + local318] = (byte) local325;
										}
									}
								}
							}
						}
					}
					if (local111.aBoolean45 && arg5 != null) {
						arg5.method260(arg1, local111.aBoolean39, local111.anInt261, arg7, arg2, local111.anInt280);
					}
				} else if (arg6 >= 12) {
					if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
						local166 = local111.method132(arg6, arg7, local49, local60, local73, local84, -1);
					} else {
						local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, arg6, true, 902, local49, local84);
					}
					arg4.method201(arg2, local166, arg1, anInt694, 0, 1, local123, local137, local94, 1, arg0);
					if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x924;
					}
					if (local111.aBoolean45 && arg5 != null) {
						arg5.method260(arg1, local111.aBoolean39, local111.anInt261, arg7, arg2, local111.anInt280);
					}
				} else if (arg6 == 0) {
					if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
						local166 = local111.method132(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, 0, true, 902, local49, local84);
					}
					arg4.method199(anIntArray180[arg7], 0, arg1, local123, null, local166, local137, arg2, arg0, local94);
					if (arg7 == 0) {
						if (local111.aBoolean49) {
							this.aByteArrayArrayArray7[arg0][arg2][arg1] = 50;
							this.aByteArrayArrayArray7[arg0][arg2][arg1 + 1] = 50;
						}
						if (local111.aBoolean47) {
							this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local111.aBoolean49) {
							this.aByteArrayArrayArray7[arg0][arg2][arg1 + 1] = 50;
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1 + 1] = 50;
						}
						if (local111.aBoolean47) {
							this.anIntArrayArrayArray5[arg0][arg2][arg1 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local111.aBoolean49) {
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1] = 50;
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1 + 1] = 50;
						}
						if (local111.aBoolean47) {
							this.anIntArrayArrayArray5[arg0][arg2 + 1][arg1] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local111.aBoolean49) {
							this.aByteArrayArrayArray7[arg0][arg2][arg1] = 50;
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1] = 50;
						}
						if (local111.aBoolean47) {
							this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x492;
						}
					}
					if (local111.aBoolean45 && arg5 != null) {
						arg5.method259(local111.aBoolean39, arg2, arg7, arg6, arg1);
					}
					if (local111.anInt262 != 16) {
						arg4.method207(local111.anInt262, arg2, arg0, arg1);
					}
				} else if (arg6 == 1) {
					if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
						local166 = local111.method132(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, 1, true, 902, local49, local84);
					}
					arg4.method199(anIntArray172[arg7], 0, arg1, local123, null, local166, local137, arg2, arg0, local94);
					if (local111.aBoolean49) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray7[arg0][arg2][arg1 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray7[arg0][arg2][arg1] = 50;
						}
					}
					if (local111.aBoolean45 && arg5 != null) {
						arg5.method259(local111.aBoolean39, arg2, arg7, arg6, arg1);
					}
				} else {
					@Pc(875) int local875;
					@Pc(904) Class1_Sub1_Sub1 local904;
					if (arg6 == 2) {
						local875 = arg7 + 1 & 0x3;
						@Pc(894) Class1_Sub1_Sub1 local894;
						if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
							local894 = local111.method132(2, arg7 + 4, local49, local60, local73, local84, -1);
							local904 = local111.method132(2, local875, local49, local60, local73, local84, -1);
						} else {
							local894 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7 + 4, 2, true, 902, local49, local84);
							local904 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, local875, 2, true, 902, local49, local84);
						}
						arg4.method199(anIntArray180[arg7], anIntArray180[local875], arg1, local123, local904, local894, local137, arg2, arg0, local94);
						if (local111.aBoolean47) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg2][arg1 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray5[arg0][arg2][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg2 + 1][arg1] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray5[arg0][arg2 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg2][arg1] |= 0x249;
							}
						}
						if (local111.aBoolean45 && arg5 != null) {
							arg5.method259(local111.aBoolean39, arg2, arg7, arg6, arg1);
						}
						if (local111.anInt262 != 16) {
							arg4.method207(local111.anInt262, arg2, arg0, arg1);
						}
					} else if (arg6 == 3) {
						if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
							local166 = local111.method132(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, 3, true, 902, local49, local84);
						}
						arg4.method199(anIntArray172[arg7], 0, arg1, local123, null, local166, local137, arg2, arg0, local94);
						if (local111.aBoolean49) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray7[arg0][arg2][arg1 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray7[arg0][arg2 + 1][arg1] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray7[arg0][arg2][arg1] = 50;
							}
						}
						if (local111.aBoolean45 && arg5 != null) {
							arg5.method259(local111.aBoolean39, arg2, arg7, arg6, arg1);
						}
					} else if (arg6 == 9) {
						if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
							local166 = local111.method132(arg6, arg7, local49, local60, local73, local84, -1);
						} else {
							local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, arg6, true, 902, local49, local84);
						}
						arg4.method201(arg2, local166, arg1, anInt694, 0, 1, local123, local137, local94, 1, arg0);
						if (local111.aBoolean45 && arg5 != null) {
							arg5.method260(arg1, local111.aBoolean39, local111.anInt261, arg7, arg2, local111.anInt280);
						}
					} else {
						if (local111.aBoolean42) {
							if (arg7 == 1) {
								local875 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local875;
							} else if (arg7 == 2) {
								local875 = local84;
								local84 = local60;
								local60 = local875;
								local875 = local73;
								local73 = local49;
								local49 = local875;
							} else if (arg7 == 3) {
								local875 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local875;
							}
						}
						if (arg6 == 4) {
							if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
								local166 = local111.method132(4, 0, local49, local60, local73, local84, -1);
							} else {
								local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, 0, 4, true, 902, local49, local84);
							}
							arg4.method200(arg0, arg1, 0, arg2, local166, anIntArray180[arg7], aByte22, 0, arg7 * 512, local123, local137, local94);
						} else if (arg6 == 5) {
							local875 = 16;
							local264 = arg4.method217(arg0, arg2, arg1);
							if (local264 > 0) {
								local875 = Class5.method130(local264 >> 14 & 0x7FFF).anInt262;
							}
							if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
								local904 = local111.method132(4, 0, local49, local60, local73, local84, -1);
							} else {
								local904 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, 0, 4, true, 902, local49, local84);
							}
							arg4.method200(arg0, arg1, anIntArray178[arg7] * local875, arg2, local904, anIntArray180[arg7], aByte22, anIntArray179[arg7] * local875, arg7 * 512, local123, local137, local94);
						} else if (arg6 == 6) {
							if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
								local166 = local111.method132(4, 0, local49, local60, local73, local84, -1);
							} else {
								local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, 0, 4, true, 902, local49, local84);
							}
							arg4.method200(arg0, arg1, 0, arg2, local166, 256, aByte22, 0, arg7, local123, local137, local94);
						} else if (arg6 == 7) {
							if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
								local166 = local111.method132(4, 0, local49, local60, local73, local84, -1);
							} else {
								local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, 0, 4, true, 902, local49, local84);
							}
							arg4.method200(arg0, arg1, 0, arg2, local166, 512, aByte22, 0, arg7, local123, local137, local94);
						} else if (arg6 == 8) {
							if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
								local166 = local111.method132(4, 0, local49, local60, local73, local84, -1);
							} else {
								local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, 0, 4, true, 902, local49, local84);
							}
							arg4.method200(arg0, arg1, 0, arg2, local166, 768, aByte22, 0, arg7, local123, local137, local94);
						}
					}
				}
			} else if (!aBoolean150 || local111.aBoolean48 || local111.aBoolean38) {
				if (local111.anInt264 == -1 && local111.anIntArray36 == null) {
					local166 = local111.method132(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local166 = new Class1_Sub1_Sub1_Sub5(local60, local111.anInt264, arg3, local73, arg7, 22, true, 902, local49, local84);
				}
				arg4.method197(arg0, local166, arg1, arg2, local94, local123, local137);
				if (local111.aBoolean45 && local111.aBoolean48 && arg5 != null) {
					arg5.method261(arg2, arg1);
				}
			}
		} catch (@Pc(1649) RuntimeException local1649) {
			signlink.reporterror("95495, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 7 + ", " + arg6 + ", " + arg7 + ", " + local1649.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(III)I")
	private int method477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IIIIILclient!MVHXDWGI;IB)V")
	private void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(37) int local37;
			if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
				this.aByteArrayArrayArray6[arg2][arg4][arg6] = 0;
				while (true) {
					local37 = arg5.method294();
					if (local37 == 0) {
						if (arg2 == 0) {
							this.anIntArrayArrayArray6[0][arg4][arg6] = -method485(arg4 + arg0 + 932731, arg6 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray6[arg2][arg4][arg6] = this.anIntArrayArrayArray6[arg2 - 1][arg4][arg6] - 240;
							return;
						}
					}
					if (local37 == 1) {
						@Pc(91) int local91 = arg5.method294();
						if (local91 == 1) {
							local91 = 0;
						}
						if (arg2 == 0) {
							this.anIntArrayArrayArray6[0][arg4][arg6] = -local91 * 8;
							return;
						}
						this.anIntArrayArrayArray6[arg2][arg4][arg6] = this.anIntArrayArrayArray6[arg2 - 1][arg4][arg6] - local91 * 8;
						return;
					}
					if (local37 <= 49) {
						this.aByteArrayArrayArray3[arg2][arg4][arg6] = arg5.method295();
						this.aByteArrayArrayArray4[arg2][arg4][arg6] = (byte) ((local37 - 2) / 4);
						this.aByteArrayArrayArray5[arg2][arg4][arg6] = (byte) (local37 + arg3 - 2 & 0x3);
					} else if (local37 <= 81) {
						this.aByteArrayArrayArray6[arg2][arg4][arg6] = (byte) (local37 - 49);
					} else {
						this.aByteArrayArrayArray2[arg2][arg4][arg6] = (byte) (local37 - 81);
					}
				}
			} else {
				while (true) {
					local37 = arg5.method294();
					if (local37 == 0) {
						return;
					}
					if (local37 == 1) {
						arg5.method294();
						return;
					}
					if (local37 <= 49) {
						arg5.method294();
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("6639, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([Lclient!LQLHEUAQ;Lclient!JFQWYHZJ;II[BIIIIII)V")
	public void method481(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(0, arg4);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method308();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method308();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method294();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg2 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg9 && local45 < arg9 + 8) {
						@Pc(88) Class5 local88 = Class5.method130(local9);
						@Pc(105) int local105 = arg3 + Class14.method149(local45 & 0x7, local66, local88.anInt261, local51 & 0x7, arg8, local88.anInt280);
						@Pc(122) int local122 = arg7 + Class14.method150(local88.anInt261, local88.anInt280, local45 & 0x7, local51 & 0x7, arg8, local66);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg6;
							if ((this.aByteArrayArrayArray6[1][local105][local122] & 0x2) == 2) {
								local134 = arg6 - 1;
							}
							@Pc(149) Class22 local149 = null;
							if (local134 >= 0) {
								local149 = arg0[local134];
							}
							this.method474(arg6, local122, local105, local9, arg1, local149, local62, local66 + arg8 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("58652, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -627 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([B[Lclient!LQLHEUAQ;Lclient!JFQWYHZJ;III)V")
	public void method482(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class22[] arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub4 local7 = new Class1_Sub1_Sub4(0, arg0);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(17) int local17 = local7.method308();
				if (local17 == 0) {
					return;
				}
				local9 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local7.method308();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local7.method294();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					@Pc(65) int local65 = local46 + arg3;
					@Pc(69) int local69 = local40 + arg4;
					if (local65 > 0 && local69 > 0 && local65 < 103 && local69 < 103) {
						@Pc(81) int local81 = local50;
						if ((this.aByteArrayArrayArray6[1][local65][local69] & 0x2) == 2) {
							local81 = local50 - 1;
						}
						@Pc(96) Class22 local96 = null;
						if (local81 >= 0) {
							local96 = arg1[local81];
						}
						this.method474(local50, local69, local65, local9, arg2, local96, local57, local61);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("59050, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -319 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(I[BIIZI[Lclient!LQLHEUAQ;)V")
	public void method484(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class22[] arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg2 + local7 > 0 && arg2 + local7 < 103 && arg3 + local11 > 0 && arg3 + local11 < 103) {
							arg5[local3].anIntArrayArray6[arg2 + local7][arg3 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class1_Sub1_Sub4 local68 = new Class1_Sub1_Sub4(0, arg1);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method478(arg0, arg4, local11, 0, local74 + arg2, local68, local78 + arg3, (byte) 1);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("1802, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IZII)I")
	private int method486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg1][arg0][arg2] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray6[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("61953, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "([Lclient!LQLHEUAQ;II[BIIIZII)V")
	public void method488(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg4 + local3 > 0 && arg4 + local3 < 103 && arg7 + local7 > 0 && arg7 + local7 < 103) {
						arg0[arg8].anIntArrayArray6[arg4 + local3][arg7 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub4 local57 = new Class1_Sub1_Sub4(0, arg3);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg2 && local63 >= arg1 && local63 < arg1 + 8 && local67 >= arg6 && local67 < arg6 + 8) {
							this.method478(0, 0, arg8, arg5, arg4 + Class14.method147(local63 & 0x7, arg5, local67 & 0x7), local57, arg7 + Class14.method148(local63 & 0x7, local67 & 0x7, arg5), (byte) 1);
						} else {
							this.method478(0, 0, 0, 0, -1, local57, -1, (byte) 1);
						}
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("82020, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + arg8 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(IBIII)V")
	public void method489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg3; local7++) {
				for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg0; local11++) {
					if (local11 >= 0 && local11 < this.anInt696 && local7 >= 0 && local7 < this.anInt697) {
						this.aByteArrayArrayArray7[0][local11][local7] = 127;
						if (local11 == arg2 && local11 > 0) {
							this.anIntArrayArrayArray6[0][local11][local7] = this.anIntArrayArrayArray6[0][local11 - 1][local7];
						}
						if (local11 == arg2 + arg0 && local11 < this.anInt696 - 1) {
							this.anIntArrayArrayArray6[0][local11][local7] = this.anIntArrayArrayArray6[0][local11 + 1][local7];
						}
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray6[0][local11][local7] = this.anIntArrayArrayArray6[0][local11][local7 - 1];
						}
						if (local7 == arg1 + arg3 && local7 < this.anInt697 - 1) {
							this.anIntArrayArrayArray6[0][local11][local7] = this.anIntArrayArrayArray6[0][local11][local7 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("23549, " + arg0 + ", " + -14 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBZYTIRX", name = "e", descriptor = "(II)I")
	private int method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SBZYTIRX", name = "a", descriptor = "(ILclient!JFQWYHZJ;[Lclient!LQLHEUAQ;)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class22[] arg2) {
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
								arg2[local27].method261(local7, local11);
							}
						}
					}
				}
			}
			anInt701 += (int) (Math.random() * 5.0D) - 2;
			if (anInt701 < -8) {
				anInt701 = -8;
			}
			if (anInt701 > 8) {
				anInt701 = 8;
			}
			anInt698 += (int) (Math.random() * 5.0D) - 2;
			if (arg0 != -17648) {
				anInt694 = -244;
			}
			if (anInt698 < -16) {
				anInt698 = -16;
			}
			if (anInt698 > 16) {
				anInt698 = 16;
			}
			@Pc(138) int local138;
			@Pc(144) int local144;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(174) int local174;
			@Pc(196) int local196;
			@Pc(209) int local209;
			@Pc(215) int local215;
			@Pc(219) int local219;
			@Pc(225) int local225;
			@Pc(241) int local241;
			@Pc(289) int local289;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(113) byte[][] local113 = this.aByteArrayArrayArray7[local7];
				local138 = (int) Math.sqrt((double) 5100);
				local144 = local138 * 768 >> 8;
				for (local146 = 1; local146 < this.anInt697 - 1; local146++) {
					for (local150 = 1; local150 < this.anInt696 - 1; local150++) {
						local174 = this.anIntArrayArrayArray6[local7][local150 + 1][local146] - this.anIntArrayArrayArray6[local7][local150 - 1][local146];
						local196 = this.anIntArrayArrayArray6[local7][local150][local146 + 1] - this.anIntArrayArrayArray6[local7][local150][local146 - 1];
						local209 = (int) Math.sqrt((double) (local174 * local174 + local196 * local196 + 65536));
						local215 = (local174 << 8) / local209;
						local219 = 65536 / local209;
						local225 = (local196 << 8) / local209;
						local241 = (local215 * -50 + local219 * -10 + local225 * -50) / local144 + 96;
						local289 = (local113[local150 - 1][local146] >> 2) + (local113[local150 + 1][local146] >> 3) + (local113[local150][local146 - 1] >> 2) + (local113[local150][local146 + 1] >> 3) + (local113[local150][local146] >> 1);
						this.anIntArrayArray18[local150][local146] = local241 - local289;
					}
				}
				for (local150 = 0; local150 < this.anInt697; local150++) {
					this.anIntArray173[local150] = 0;
					this.anIntArray174[local150] = 0;
					this.anIntArray175[local150] = 0;
					this.anIntArray176[local150] = 0;
					this.anIntArray177[local150] = 0;
				}
				for (local174 = -5; local174 < this.anInt696 + 5; local174++) {
					for (local196 = 0; local196 < this.anInt697; local196++) {
						local209 = local174 + 5;
						@Pc(424) int local424;
						if (local209 >= 0 && local209 < this.anInt696) {
							local215 = this.aByteArrayArrayArray2[local7][local209][local196] & 0xFF;
							if (local215 > 0) {
								@Pc(383) Class31 local383 = Class31.aClass31Array1[local215 - 1];
								this.anIntArray173[local196] += local383.anInt635;
								this.anIntArray174[local196] += local383.anInt633;
								this.anIntArray175[local196] += local383.anInt634;
								this.anIntArray176[local196] += local383.anInt636;
								local424 = this.anIntArray177[local196]++;
							}
						}
						local215 = local174 - 5;
						if (local215 >= 0 && local215 < this.anInt696) {
							local219 = this.aByteArrayArrayArray2[local7][local215][local196] & 0xFF;
							if (local219 > 0) {
								@Pc(456) Class31 local456 = Class31.aClass31Array1[local219 - 1];
								this.anIntArray173[local196] -= local456.anInt635;
								this.anIntArray174[local196] -= local456.anInt633;
								this.anIntArray175[local196] -= local456.anInt634;
								this.anIntArray176[local196] -= local456.anInt636;
								local424 = this.anIntArray177[local196]--;
							}
						}
					}
					if (local174 >= 1 && local174 < this.anInt696 - 1) {
						local209 = 0;
						local215 = 0;
						local219 = 0;
						local225 = 0;
						local241 = 0;
						for (local289 = -5; local289 < this.anInt697 + 5; local289++) {
							@Pc(532) int local532 = local289 + 5;
							if (local532 >= 0 && local532 < this.anInt697) {
								local209 += this.anIntArray173[local532];
								local215 += this.anIntArray174[local532];
								local219 += this.anIntArray175[local532];
								local225 += this.anIntArray176[local532];
								local241 += this.anIntArray177[local532];
							}
							@Pc(577) int local577 = local289 - 5;
							if (local577 >= 0 && local577 < this.anInt697) {
								local209 -= this.anIntArray173[local577];
								local215 -= this.anIntArray174[local577];
								local219 -= this.anIntArray175[local577];
								local225 -= this.anIntArray176[local577];
								local241 -= this.anIntArray177[local577];
							}
							if (local289 >= 1 && local289 < this.anInt697 - 1 && (!aBoolean150 || (this.aByteArrayArrayArray6[0][local174][local289] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local174][local289] & 0x10) == 0 && this.method486(local174, local7, local289) == anInt702)) {
								if (local7 < anInt695) {
									anInt695 = local7;
								}
								@Pc(676) int local676 = this.aByteArrayArrayArray2[local7][local174][local289] & 0xFF;
								@Pc(687) int local687 = this.aByteArrayArrayArray3[local7][local174][local289] & 0xFF;
								if (local676 > 0 || local687 > 0) {
									@Pc(700) int local700 = this.anIntArrayArrayArray6[local7][local174][local289];
									@Pc(711) int local711 = this.anIntArrayArrayArray6[local7][local174 + 1][local289];
									@Pc(724) int local724 = this.anIntArrayArrayArray6[local7][local174 + 1][local289 + 1];
									@Pc(735) int local735 = this.anIntArrayArrayArray6[local7][local174][local289 + 1];
									@Pc(742) int local742 = this.anIntArrayArray18[local174][local289];
									@Pc(751) int local751 = this.anIntArrayArray18[local174 + 1][local289];
									@Pc(762) int local762 = this.anIntArrayArray18[local174 + 1][local289 + 1];
									@Pc(771) int local771 = this.anIntArrayArray18[local174][local289 + 1];
									@Pc(773) int local773 = -1;
									@Pc(775) int local775 = -1;
									@Pc(783) int local783;
									@Pc(787) int local787;
									if (local676 > 0) {
										local783 = local209 * 256 / local225;
										local787 = local215 / local241;
										@Pc(791) int local791 = local219 / local241;
										local773 = this.method477(local783, local787, local791);
										@Pc(803) int local803 = local783 + anInt701 & 0xFF;
										local791 += anInt698;
										if (local791 < 0) {
											local791 = 0;
										} else if (local791 > 255) {
											local791 = 255;
										}
										local775 = this.method477(local803, local787, local791);
									}
									if (local7 > 0) {
										@Pc(828) boolean local828 = true;
										if (local676 == 0 && this.aByteArrayArrayArray4[local7][local174][local289] != 0) {
											local828 = false;
										}
										if (local687 > 0 && !Class31.aClass31Array1[local687 - 1].aBoolean131) {
											local828 = false;
										}
										if (local828 && local700 == local711 && local700 == local724 && local700 == local735) {
											this.anIntArrayArrayArray5[local7][local174][local289] |= 0x924;
										}
									}
									local783 = 0;
									if (local773 != -1) {
										local783 = Class1_Sub1_Sub2_Sub4.anIntArray200[method480(local775, 96)];
									}
									if (local687 == 0) {
										arg1.method196(local7, local174, local289, 0, 0, -1, local700, local711, local724, local735, method480(local773, local742), method480(local773, local751), method480(local773, local762), method480(local773, local771), 0, 0, 0, 0, local783, 0);
									} else {
										local787 = this.aByteArrayArrayArray4[local7][local174][local289] + 1;
										@Pc(940) byte local940 = this.aByteArrayArrayArray5[local7][local174][local289];
										@Pc(946) Class31 local946 = Class31.aClass31Array1[local687 - 1];
										@Pc(949) int local949 = local946.anInt631;
										@Pc(957) int local957;
										@Pc(955) int local955;
										if (local949 >= 0) {
											local955 = Class1_Sub1_Sub2_Sub4.method530(local949);
											local957 = -1;
										} else if (local946.anInt630 == 16711935) {
											local957 = -2;
											local949 = -1;
											local955 = Class1_Sub1_Sub2_Sub4.anIntArray200[this.method491(local946.anInt637, 96)];
										} else {
											local957 = this.method477(local946.anInt632, local946.anInt633, local946.anInt634);
											local955 = Class1_Sub1_Sub2_Sub4.anIntArray200[this.method491(local946.anInt637, 96)];
										}
										arg1.method196(local7, local174, local289, local787, local940, local949, local700, local711, local724, local735, method480(local773, local742), method480(local773, local751), method480(local773, local762), method480(local773, local771), this.method491(local957, local742), this.method491(local957, local751), this.method491(local957, local762), this.method491(local957, local771), local783, local955);
									}
								}
							}
						}
					}
				}
				for (local196 = 1; local196 < this.anInt697 - 1; local196++) {
					for (local209 = 1; local209 < this.anInt696 - 1; local209++) {
						arg1.method195(local7, local209, local196, this.method486(local209, local7, local196));
					}
				}
			}
			arg1.method222(this.anInt703);
			for (local11 = 0; local11 < this.anInt696; local11++) {
				for (local27 = 0; local27 < this.anInt697; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg1.method193(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1133) int local1133 = 2;
			@Pc(1135) int local1135 = 4;
			for (@Pc(1137) int local1137 = 0; local1137 < 4; local1137++) {
				if (local1137 > 0) {
					local27 <<= 0x3;
					local1133 <<= 0x3;
					local1135 <<= 0x3;
				}
				for (@Pc(1155) int local1155 = 0; local1155 <= local1137; local1155++) {
					for (local138 = 0; local138 <= this.anInt697; local138++) {
						for (local144 = 0; local144 <= this.anInt696; local144++) {
							if ((this.anIntArrayArrayArray5[local1155][local144][local138] & local27) != 0) {
								local146 = local138;
								local150 = local138;
								local174 = local1155;
								local196 = local1155;
								while (local146 > 0 && (this.anIntArrayArrayArray5[local1155][local144][local146 - 1] & local27) != 0) {
									local146--;
								}
								while (local150 < this.anInt697 && (this.anIntArrayArrayArray5[local1155][local144][local150 + 1] & local27) != 0) {
									local150++;
								}
								label332: while (local174 > 0) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray5[local174 - 1][local144][local209] & local27) == 0) {
											break label332;
										}
									}
									local174--;
								}
								label321: while (local196 < local1137) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray5[local196 + 1][local144][local209] & local27) == 0) {
											break label321;
										}
									}
									local196++;
								}
								local209 = (local196 + 1 - local174) * (local150 + 1 - local146);
								if (local209 >= 8) {
									local219 = this.anIntArrayArrayArray6[local196][local144][local146] - 240;
									local225 = this.anIntArrayArrayArray6[local174][local144][local146];
									Class18.method194(local225, local144 * 128, local150 * 128 + 128, local219, local1137, local144 * 128, local146 * 128, 1);
									for (local241 = local174; local241 <= local196; local241++) {
										for (local289 = local146; local289 <= local150; local289++) {
											this.anIntArrayArrayArray5[local241][local144][local289] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1155][local144][local138] & local1133) != 0) {
								local146 = local144;
								local150 = local144;
								local174 = local1155;
								local196 = local1155;
								while (local146 > 0 && (this.anIntArrayArrayArray5[local1155][local146 - 1][local138] & local1133) != 0) {
									local146--;
								}
								while (local150 < this.anInt696 && (this.anIntArrayArrayArray5[local1155][local150 + 1][local138] & local1133) != 0) {
									local150++;
								}
								label385: while (local174 > 0) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray5[local174 - 1][local209][local138] & local1133) == 0) {
											break label385;
										}
									}
									local174--;
								}
								label374: while (local196 < local1137) {
									for (local209 = local146; local209 <= local150; local209++) {
										if ((this.anIntArrayArrayArray5[local196 + 1][local209][local138] & local1133) == 0) {
											break label374;
										}
									}
									local196++;
								}
								local209 = (local196 + 1 - local174) * (local150 + 1 - local146);
								if (local209 >= 8) {
									local219 = this.anIntArrayArrayArray6[local196][local146][local138] - 240;
									local225 = this.anIntArrayArrayArray6[local174][local146][local138];
									Class18.method194(local225, local150 * 128 + 128, local138 * 128, local219, local1137, local146 * 128, local138 * 128, 2);
									for (local241 = local174; local241 <= local196; local241++) {
										for (local289 = local146; local289 <= local150; local289++) {
											this.anIntArrayArrayArray5[local241][local289][local138] &= ~local1133;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1155][local144][local138] & local1135) != 0) {
								local146 = local144;
								local150 = local144;
								local174 = local138;
								local196 = local138;
								while (local174 > 0 && (this.anIntArrayArrayArray5[local1155][local144][local174 - 1] & local1135) != 0) {
									local174--;
								}
								while (local196 < this.anInt697 && (this.anIntArrayArrayArray5[local1155][local144][local196 + 1] & local1135) != 0) {
									local196++;
								}
								label438: while (local146 > 0) {
									for (local209 = local174; local209 <= local196; local209++) {
										if ((this.anIntArrayArrayArray5[local1155][local146 - 1][local209] & local1135) == 0) {
											break label438;
										}
									}
									local146--;
								}
								label427: while (local150 < this.anInt696) {
									for (local209 = local174; local209 <= local196; local209++) {
										if ((this.anIntArrayArrayArray5[local1155][local150 + 1][local209] & local1135) == 0) {
											break label427;
										}
									}
									local150++;
								}
								if ((local150 + 1 - local146) * (local196 + 1 - local174) >= 4) {
									local209 = this.anIntArrayArrayArray6[local1155][local146][local174];
									Class18.method194(local209, local150 * 128 + 128, local196 * 128 + 128, local209, local1137, local146 * 128, local174 * 128, 4);
									for (local215 = local146; local215 <= local150; local215++) {
										for (local219 = local174; local219 <= local196; local219++) {
											this.anIntArrayArrayArray5[local1155][local215][local219] &= ~local1135;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1770) RuntimeException local1770) {
			signlink.reporterror("54093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1770.toString());
			throw new RuntimeException();
		}
	}
}
