import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WZFUDUYZ")
public final class Class42 {

	@OriginalMember(owner = "client!WZFUDUYZ", name = "m", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "[I")
	private static final int[] anIntArray178 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!WZFUDUYZ", name = "g", descriptor = "I")
	private static int anInt768 = 9;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "h", descriptor = "[I")
	private static final int[] anIntArray179 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!WZFUDUYZ", name = "j", descriptor = "[I")
	private static final int[] anIntArray180 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!WZFUDUYZ", name = "l", descriptor = "I")
	private static int anInt769 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "n", descriptor = "[I")
	private static final int[] anIntArray181 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!WZFUDUYZ", name = "v", descriptor = "I")
	private static int anInt772 = 2;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "w", descriptor = "I")
	private static int anInt773 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "x", descriptor = "I")
	private static int anInt774 = 1;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "y", descriptor = "Z")
	public static boolean aBoolean215 = true;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "D", descriptor = "I")
	public static int anInt776 = 99;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "e", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "f", descriptor = "I")
	private int anInt767 = 3;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "o", descriptor = "I")
	private int anInt771 = 850;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "B", descriptor = "I")
	private int anInt775 = 171;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "G", descriptor = "B")
	private byte aByte54 = -30;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "E", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "F", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "A", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "u", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "H", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "p", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "q", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "r", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "s", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "t", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II)I")
	private static int method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(Lclient!BSNPYLEV;ZLclient!VYNRIVYZ;)V")
	public static void method534(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(2) Class9_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method108();
				if (local9 == 0) {
					return;
				}
				local3 += local9;
				@Pc(18) Class33 local18 = Class33.method459(local3);
				local18.method467(arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method108();
					if (local25 == 0) {
						break;
					}
					arg0.method94();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("55186, " + arg0 + ", " + true + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "(III)I")
	private static int method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method549(local3, local13);
		@Pc(29) int local29 = method549(local3 + 1, local13);
		@Pc(35) int local35 = method549(local3, local13 + 1);
		@Pc(43) int local43 = method549(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method551(local23, local29, local9, arg2);
		@Pc(55) int local55 = method551(local35, local43, local9, arg2);
		return method551(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "([[[IIILclient!PAJXYXWG;ILclient!EOLCIJGV;IIIII)V")
	public static void method541(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(20) int local20 = arg0[arg5][arg6][arg7];
			@Pc(30) int local30 = arg0[arg5][arg6 + 1][arg7];
			@Pc(42) int local42 = arg0[arg5][arg6 + 1][arg7 + 1];
			@Pc(52) int local52 = arg0[arg5][arg6][arg7 + 1];
			@Pc(62) int local62 = local20 + local30 + local42 + local52 >> 2;
			@Pc(65) Class33 local65 = Class33.method459(arg9);
			@Pc(77) int local77 = arg6 + (arg7 << 7) + (arg9 << 14) + 1073741824;
			if (!local65.aBoolean173) {
				local77 += Integer.MIN_VALUE;
			}
			@Pc(91) byte local91 = (byte) ((arg1 << 6) + arg8);
			@Pc(111) Class2_Sub1_Sub3 local111;
			if (arg8 == 22) {
				if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
					local111 = local65.method457(22, arg1, local20, local30, local42, local52, -1);
				} else {
					local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, 22, local65.anInt615, true, (byte) -21, local52, local30, local20);
				}
				arg2.method330(arg3, local77, arg7, local91, local111, arg6, local62);
				if (local65.aBoolean175 && local65.aBoolean173) {
					arg4.method188(arg7, arg6);
				}
			} else {
				@Pc(207) int local207;
				if (arg8 == 10 || arg8 == 11) {
					if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
						local111 = local65.method457(10, arg1, local20, local30, local42, local52, -1);
					} else {
						local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, 10, local65.anInt615, true, (byte) -21, local52, local30, local20);
					}
					if (local111 != null) {
						@Pc(194) int local194 = 0;
						if (arg8 == 11) {
							local194 += 256;
						}
						@Pc(210) int local210;
						if (arg1 == 1 || arg1 == 3) {
							local207 = local65.anInt617;
							local210 = local65.anInt609;
						} else {
							local207 = local65.anInt609;
							local210 = local65.anInt617;
						}
						arg2.method334(arg3, arg7, local62, local111, local194, local77, local91, anInt774, arg6, local210, local207);
					}
					if (local65.aBoolean175) {
						arg4.method187(arg7, local65.aBoolean181, local65.anInt609, local65.anInt617, arg1, arg6);
					}
				} else if (arg8 >= 12) {
					if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
						local111 = local65.method457(arg8, arg1, local20, local30, local42, local52, -1);
					} else {
						local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, arg8, local65.anInt615, true, (byte) -21, local52, local30, local20);
					}
					arg2.method334(arg3, arg7, local62, local111, 0, local77, local91, anInt774, arg6, 1, 1);
					if (local65.aBoolean175) {
						arg4.method187(arg7, local65.aBoolean181, local65.anInt609, local65.anInt617, arg1, arg6);
					}
				} else if (arg8 == 0) {
					if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
						local111 = local65.method457(0, arg1, local20, local30, local42, local52, -1);
					} else {
						local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, 0, local65.anInt615, true, (byte) -21, local52, local30, local20);
					}
					arg2.method332(arg3, anIntArray179[arg1], local77, arg7, local111, 0, local91, arg6, local62, null);
					if (local65.aBoolean175) {
						arg4.method186(arg1, arg7, arg8, arg6, local65.aBoolean181);
					}
				} else if (arg8 == 1) {
					if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
						local111 = local65.method457(1, arg1, local20, local30, local42, local52, -1);
					} else {
						local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, 1, local65.anInt615, true, (byte) -21, local52, local30, local20);
					}
					arg2.method332(arg3, anIntArray178[arg1], local77, arg7, local111, 0, local91, arg6, local62, null);
					if (local65.aBoolean175) {
						arg4.method186(arg1, arg7, arg8, arg6, local65.aBoolean181);
					}
				} else {
					@Pc(453) int local453;
					@Pc(482) Class2_Sub1_Sub3 local482;
					if (arg8 == 2) {
						local453 = arg1 + 1 & 0x3;
						@Pc(472) Class2_Sub1_Sub3 local472;
						if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
							local472 = local65.method457(2, arg1 + 4, local20, local30, local42, local52, -1);
							local482 = local65.method457(2, local453, local20, local30, local42, local52, -1);
						} else {
							local472 = new Class2_Sub1_Sub3_Sub6(local42, arg1 + 4, arg9, 2, local65.anInt615, true, (byte) -21, local52, local30, local20);
							local482 = new Class2_Sub1_Sub3_Sub6(local42, local453, arg9, 2, local65.anInt615, true, (byte) -21, local52, local30, local20);
						}
						arg2.method332(arg3, anIntArray179[arg1], local77, arg7, local472, anIntArray179[local453], local91, arg6, local62, local482);
						if (local65.aBoolean175) {
							arg4.method186(arg1, arg7, arg8, arg6, local65.aBoolean181);
						}
					} else if (arg8 == 3) {
						if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
							local111 = local65.method457(3, arg1, local20, local30, local42, local52, -1);
						} else {
							local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, 3, local65.anInt615, true, (byte) -21, local52, local30, local20);
						}
						arg2.method332(arg3, anIntArray178[arg1], local77, arg7, local111, 0, local91, arg6, local62, null);
						if (local65.aBoolean175) {
							arg4.method186(arg1, arg7, arg8, arg6, local65.aBoolean181);
						}
					} else if (arg8 == 9) {
						if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
							local111 = local65.method457(arg8, arg1, local20, local30, local42, local52, -1);
						} else {
							local111 = new Class2_Sub1_Sub3_Sub6(local42, arg1, arg9, arg8, local65.anInt615, true, (byte) -21, local52, local30, local20);
						}
						arg2.method334(arg3, arg7, local62, local111, 0, local77, local91, anInt774, arg6, 1, 1);
						if (local65.aBoolean175) {
							arg4.method187(arg7, local65.aBoolean181, local65.anInt609, local65.anInt617, arg1, arg6);
						}
					} else {
						if (local65.aBoolean169) {
							if (arg1 == 1) {
								local453 = local52;
								local52 = local42;
								local42 = local30;
								local30 = local20;
								local20 = local453;
							} else if (arg1 == 2) {
								local453 = local52;
								local52 = local30;
								local30 = local453;
								local453 = local42;
								local42 = local20;
								local20 = local453;
							} else if (arg1 == 3) {
								local453 = local52;
								local52 = local20;
								local20 = local30;
								local30 = local42;
								local42 = local453;
							}
						}
						if (arg8 == 4) {
							if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
								local111 = local65.method457(4, 0, local20, local30, local42, local52, -1);
							} else {
								local111 = new Class2_Sub1_Sub3_Sub6(local42, 0, arg9, 4, local65.anInt615, true, (byte) -21, local52, local30, local20);
							}
							arg2.method333(0, local62, local77, arg3, local111, arg1 * 512, 0, arg6, arg7, anIntArray179[arg1], local91);
						} else if (arg8 == 5) {
							local453 = 16;
							local207 = arg2.method350(arg3, arg6, arg7);
							if (local207 > 0) {
								local453 = Class33.method459(local207 >> 14 & 0x7FFF).anInt616;
							}
							if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
								local482 = local65.method457(4, 0, local20, local30, local42, local52, -1);
							} else {
								local482 = new Class2_Sub1_Sub3_Sub6(local42, 0, arg9, 4, local65.anInt615, true, (byte) -21, local52, local30, local20);
							}
							arg2.method333(anIntArray181[arg1] * local453, local62, local77, arg3, local482, arg1 * 512, anIntArray180[arg1] * local453, arg6, arg7, anIntArray179[arg1], local91);
						} else if (arg8 == 6) {
							if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
								local111 = local65.method457(4, 0, local20, local30, local42, local52, -1);
							} else {
								local111 = new Class2_Sub1_Sub3_Sub6(local42, 0, arg9, 4, local65.anInt615, true, (byte) -21, local52, local30, local20);
							}
							arg2.method333(0, local62, local77, arg3, local111, arg1, 0, arg6, arg7, 256, local91);
						} else if (arg8 == 7) {
							if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
								local111 = local65.method457(4, 0, local20, local30, local42, local52, -1);
							} else {
								local111 = new Class2_Sub1_Sub3_Sub6(local42, 0, arg9, 4, local65.anInt615, true, (byte) -21, local52, local30, local20);
							}
							arg2.method333(0, local62, local77, arg3, local111, arg1, 0, arg6, arg7, 512, local91);
						} else if (arg8 == 8) {
							if (local65.anInt615 == -1 && local65.anIntArray157 == null) {
								local111 = local65.method457(4, 0, local20, local30, local42, local52, -1);
							} else {
								local111 = new Class2_Sub1_Sub3_Sub6(local42, 0, arg9, 4, local65.anInt615, true, (byte) -21, local52, local30, local20);
							}
							arg2.method333(0, local62, local77, arg3, local111, arg1, 0, arg6, arg7, 768, local91);
						}
					}
				}
			}
		} catch (@Pc(1021) RuntimeException local1021) {
			signlink.reporterror("35198, " + arg0 + ", " + -604 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1021.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II[BI)Z")
	public static boolean method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class2_Sub1_Sub2 local9 = new Class2_Sub1_Sub2(arg2, (byte) 3);
			@Pc(11) int local11 = -1;
			if (arg1 != -48151) {
				throw new NullPointerException();
			}
			label55: while (true) {
				@Pc(21) int local21 = local9.method108();
				if (local21 == 0) {
					return local3;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method108();
						if (local36 == 0) {
							continue label55;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method94() >> 2;
						@Pc(73) int local73 = local64 + arg3;
						@Pc(77) int local77 = local58 + arg0;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class33 local90 = Class33.method459(local11);
							if (local69 != 22 || !aBoolean215 || local90.aBoolean173 || local90.aBoolean179) {
								local3 &= local90.method464();
								local31 = true;
							}
						}
					}
					local36 = local9.method108();
					if (local36 == 0) {
						break;
					}
					local9.method94();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("2150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "b", descriptor = "(II)I")
	private static int method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method540(arg0 + 45365, arg1 + 91923, 4) + (method540(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method540(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "(II)I")
	private static int method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!WZFUDUYZ", name = "d", descriptor = "(II)I")
	private static int method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method533(arg0 - 1, arg1 - 1) + method533(arg0 + 1, arg1 - 1) + method533(arg0 - 1, arg1 + 1) + method533(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method533(arg0 - 1, arg1) + method533(arg0 + 1, arg1) + method533(arg0, arg1 - 1) + method533(arg0, arg1 + 1);
		@Pc(59) int local59 = method533(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIII)I")
	private static int method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub1_Sub3.anIntArray58[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "c", descriptor = "(III)Z")
	public static boolean method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class33 local2 = Class33.method459(arg0);
			if (anInt772 > 2 || anInt772 < 2) {
				anInt768 = 210;
			}
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method466(arg1, 447);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("49491, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "<init>", descriptor = "(I[[[BBI[[[I)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt776 = 99;
			this.anInt777 = arg3;
			this.anInt778 = arg0;
			this.anIntArrayArrayArray6 = arg4;
			this.aByteArrayArrayArray6 = arg1;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt777][this.anInt778];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt777][this.anInt778];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt777][this.anInt778];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt777][this.anInt778];
			this.anIntArrayArrayArray5 = new int[4][this.anInt777 + 1][this.anInt778 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt777 + 1][this.anInt778 + 1];
			this.anIntArrayArray21 = new int[this.anInt777 + 1][this.anInt778 + 1];
			this.anIntArray182 = new int[this.anInt778];
			this.anIntArray183 = new int[this.anInt778];
			this.anIntArray184 = new int[this.anInt778];
			this.anIntArray185 = new int[this.anInt778];
			this.anIntArray186 = new int[this.anInt778];
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("27963, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIB)I")
	private int method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg3 != -30) {
				return 3;
			} else if ((this.aByteArrayArrayArray6[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray6[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("23651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(III)I")
	private int method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(Lclient!PAJXYXWG;Z[Lclient!EOLCIJGV;)V")
	public void method535(@OriginalArg(0) Class29 arg0, @OriginalArg(2) Class12[] arg1) {
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
								arg1[local27].method188(local11, local7);
							}
						}
					}
				}
			}
			anInt769 += (int) (Math.random() * 5.0D) - 2;
			if (anInt769 < -8) {
				anInt769 = -8;
			}
			if (anInt769 > 8) {
				anInt769 = 8;
			}
			anInt773 += (int) (Math.random() * 5.0D) - 2;
			if (anInt773 < -16) {
				anInt773 = -16;
			}
			if (anInt773 > 16) {
				anInt773 = 16;
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
				for (local141 = 1; local141 < this.anInt778 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt777 - 1; local145++) {
						local169 = this.anIntArrayArrayArray6[local7][local145 + 1][local141] - this.anIntArrayArrayArray6[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray6[local7][local145][local141 + 1] - this.anIntArrayArrayArray6[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray21[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt778; local145++) {
					this.anIntArray182[local145] = 0;
					this.anIntArray183[local145] = 0;
					this.anIntArray184[local145] = 0;
					this.anIntArray185[local145] = 0;
					this.anIntArray186[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt777 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt778; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt777) {
							local210 = this.aByteArrayArrayArray4[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class40 local378 = Class40.aClass40Array1[local210 - 1];
								this.anIntArray182[local191] += local378.anInt736;
								this.anIntArray183[local191] += local378.anInt734;
								this.anIntArray184[local191] += local378.anInt735;
								this.anIntArray185[local191] += local378.anInt737;
								local419 = this.anIntArray186[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt777) {
							local214 = this.aByteArrayArrayArray4[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class40 local451 = Class40.aClass40Array1[local214 - 1];
								this.anIntArray182[local191] -= local451.anInt736;
								this.anIntArray183[local191] -= local451.anInt734;
								this.anIntArray184[local191] -= local451.anInt735;
								this.anIntArray185[local191] -= local451.anInt737;
								local419 = this.anIntArray186[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt777 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt778 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt778) {
								local204 += this.anIntArray182[local527];
								local210 += this.anIntArray183[local527];
								local214 += this.anIntArray184[local527];
								local220 += this.anIntArray185[local527];
								local236 += this.anIntArray186[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt778) {
								local204 -= this.anIntArray182[local572];
								local210 -= this.anIntArray183[local572];
								local214 -= this.anIntArray184[local572];
								local220 -= this.anIntArray185[local572];
								local236 -= this.anIntArray186[local572];
							}
							if (local284 >= 1 && local284 < this.anInt778 - 1 && (!aBoolean215 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method531(local284, local169, local7, this.aByte54) == anInt770)) {
								if (local7 < anInt776) {
									anInt776 = local7;
								}
								@Pc(672) int local672 = this.aByteArrayArrayArray4[local7][local169][local284] & 0xFF;
								@Pc(683) int local683 = this.aByteArrayArrayArray7[local7][local169][local284] & 0xFF;
								if (local672 > 0 || local683 > 0) {
									@Pc(696) int local696 = this.anIntArrayArrayArray6[local7][local169][local284];
									@Pc(707) int local707 = this.anIntArrayArrayArray6[local7][local169 + 1][local284];
									@Pc(720) int local720 = this.anIntArrayArrayArray6[local7][local169 + 1][local284 + 1];
									@Pc(731) int local731 = this.anIntArrayArrayArray6[local7][local169][local284 + 1];
									@Pc(738) int local738 = this.anIntArrayArray21[local169][local284];
									@Pc(747) int local747 = this.anIntArrayArray21[local169 + 1][local284];
									@Pc(758) int local758 = this.anIntArrayArray21[local169 + 1][local284 + 1];
									@Pc(767) int local767 = this.anIntArrayArray21[local169][local284 + 1];
									@Pc(769) int local769 = -1;
									@Pc(771) int local771 = -1;
									@Pc(779) int local779;
									@Pc(783) int local783;
									if (local672 > 0) {
										local779 = local204 * 256 / local220;
										local783 = local210 / local236;
										@Pc(787) int local787 = local214 / local236;
										local769 = this.method532(local779, local783, local787);
										@Pc(799) int local799 = local779 + anInt769 & 0xFF;
										local787 += anInt773;
										if (local787 < 0) {
											local787 = 0;
										} else if (local787 > 255) {
											local787 = 255;
										}
										local771 = this.method532(local799, local783, local787);
									}
									if (local7 > 0) {
										@Pc(824) boolean local824 = true;
										if (local672 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local824 = false;
										}
										if (local683 > 0 && !Class40.aClass40Array1[local683 - 1].aBoolean205) {
											local824 = false;
										}
										if (local824 && local696 == local707 && local696 == local720 && local696 == local731) {
											this.anIntArrayArrayArray5[local7][local169][local284] |= 0x924;
										}
									}
									local779 = 0;
									if (local769 != -1) {
										local779 = Class2_Sub1_Sub1_Sub3.anIntArray62[method546(local771, 96)];
									}
									if (local683 == 0) {
										arg0.method329(local7, local169, local284, 0, 0, -1, local696, local707, local720, local731, method546(local769, local738), method546(local769, local747), method546(local769, local758), method546(local769, local767), 0, 0, 0, 0, local779, 0);
									} else {
										local783 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(936) byte local936 = this.aByteArrayArrayArray3[local7][local169][local284];
										@Pc(942) Class40 local942 = Class40.aClass40Array1[local683 - 1];
										@Pc(945) int local945 = local942.anInt732;
										@Pc(953) int local953;
										@Pc(951) int local951;
										if (local945 >= 0) {
											local951 = Class2_Sub1_Sub1_Sub3.method253((byte) 9, local945);
											local953 = -1;
										} else if (local942.anInt731 == 16711935) {
											local953 = -2;
											local945 = -1;
											local951 = Class2_Sub1_Sub1_Sub3.anIntArray62[this.method550(local942.anInt738, 96)];
										} else {
											local953 = this.method532(local942.anInt733, local942.anInt734, local942.anInt735);
											local951 = Class2_Sub1_Sub1_Sub3.anIntArray62[this.method550(local942.anInt738, 96)];
										}
										arg0.method329(local7, local169, local284, local783, local936, local945, local696, local707, local720, local731, method546(local769, local738), method546(local769, local747), method546(local769, local758), method546(local769, local767), this.method550(local953, local738), this.method550(local953, local747), this.method550(local953, local758), this.method550(local953, local767), local779, local951);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt778 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt777 - 1; local204++) {
						arg0.method328(local7, local204, local191, this.method531(local191, local204, local7, this.aByte54));
					}
				}
			}
			arg0.method355();
			for (local11 = 0; local11 < this.anInt777; local11++) {
				for (local27 = 0; local27 < this.anInt778; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg0.method326(local11, local27);
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
					for (local133 = 0; local133 <= this.anInt778; local133++) {
						for (local139 = 0; local139 <= this.anInt777; local139++) {
							if ((this.anIntArrayArrayArray5[local1155][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray5[local1155][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt778 && (this.anIntArrayArrayArray5[local1155][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1137) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray6[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray6[local169][local139][local141];
									Class29.method327(local1137, local220, 1, local214, local145 * 128 + 128, local139 * 128, local141 * 128, local139 * 128, 865);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray5[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1155][local139][local133] & local1133) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1155;
								local191 = local1155;
								while (local141 > 0 && (this.anIntArrayArrayArray5[local1155][local141 - 1][local133] & local1133) != 0) {
									local141--;
								}
								while (local145 < this.anInt777 && (this.anIntArrayArrayArray5[local1155][local145 + 1][local133] & local1133) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local169 - 1][local204][local133] & local1133) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1137) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray5[local191 + 1][local204][local133] & local1133) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray6[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray6[local169][local141][local133];
									Class29.method327(local1137, local220, 2, local214, local133 * 128, local141 * 128, local133 * 128, local145 * 128 + 128, 865);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray5[local236][local284][local133] &= ~local1133;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray5[local1155][local139][local133] & local1135) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray5[local1155][local139][local169 - 1] & local1135) != 0) {
									local169--;
								}
								while (local191 < this.anInt778 && (this.anIntArrayArrayArray5[local1155][local139][local191 + 1] & local1135) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray5[local1155][local141 - 1][local204] & local1135) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt777) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray5[local1155][local145 + 1][local204] & local1135) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray6[local1155][local141][local169];
									Class29.method327(local1137, local204, 4, local204, local191 * 128 + 128, local141 * 128, local169 * 128, local145 * 128 + 128, 865);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray5[local1155][local210][local214] &= ~local1135;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1770) RuntimeException local1770) {
			signlink.reporterror("87226, " + arg0 + ", " + true + ", " + arg1 + ", " + local1770.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIILclient!EOLCIJGV;IILclient!PAJXYXWG;II)V")
	private void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class29 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean215 && (this.aByteArrayArrayArray6[0][arg6][arg1] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg0][arg6][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method531(arg1, arg6, arg0, this.aByte54) != anInt770) {
					return;
				}
			}
			if (arg0 < anInt776) {
				anInt776 = arg0;
			}
			@Pc(50) int local50 = this.anIntArrayArrayArray6[arg0][arg6][arg1];
			@Pc(61) int local61 = this.anIntArrayArrayArray6[arg0][arg6 + 1][arg1];
			@Pc(74) int local74 = this.anIntArrayArrayArray6[arg0][arg6 + 1][arg1 + 1];
			@Pc(85) int local85 = this.anIntArrayArrayArray6[arg0][arg6][arg1 + 1];
			@Pc(100) int local100 = local50 + local61 + local74 + local85 >> 2;
			@Pc(103) Class33 local103 = Class33.method459(arg4);
			@Pc(115) int local115 = arg6 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!local103.aBoolean173) {
				local115 += Integer.MIN_VALUE;
			}
			@Pc(129) byte local129 = (byte) ((arg7 << 6) + arg2);
			@Pc(158) Class2_Sub1_Sub3 local158;
			if (arg2 != 22) {
				@Pc(256) int local256;
				if (arg2 == 10 || arg2 == 11) {
					if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
						local158 = local103.method457(10, arg7, local50, local61, local74, local85, -1);
					} else {
						local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, 10, local103.anInt615, true, (byte) -21, local85, local61, local50);
					}
					if (local158 != null) {
						@Pc(243) int local243 = 0;
						if (arg2 == 11) {
							local243 += 256;
						}
						@Pc(259) int local259;
						if (arg7 == 1 || arg7 == 3) {
							local256 = local103.anInt617;
							local259 = local103.anInt609;
						} else {
							local256 = local103.anInt609;
							local259 = local103.anInt617;
						}
						if (arg5.method334(arg0, arg1, local100, local158, local243, local115, local129, anInt774, arg6, local259, local256) && local103.aBoolean174) {
							@Pc(290) Class2_Sub1_Sub3_Sub4 local290;
							if (local158 instanceof Class2_Sub1_Sub3_Sub4) {
								local290 = (Class2_Sub1_Sub3_Sub4) local158;
							} else {
								local290 = local103.method457(10, arg7, local50, local61, local74, local85, -1);
							}
							if (local290 != null) {
								for (@Pc(306) int local306 = 0; local306 <= local256; local306++) {
									for (@Pc(310) int local310 = 0; local310 <= local259; local310++) {
										@Pc(317) int local317 = local290.anInt588 / 4;
										if (local317 > 30) {
											local317 = 30;
										}
										if (local317 > this.aByteArrayArrayArray2[arg0][arg6 + local306][arg1 + local310]) {
											this.aByteArrayArrayArray2[arg0][arg6 + local306][arg1 + local310] = (byte) local317;
										}
									}
								}
							}
						}
					}
					if (local103.aBoolean175 && arg3 != null) {
						arg3.method187(arg1, local103.aBoolean181, local103.anInt609, local103.anInt617, arg7, arg6);
					}
				} else if (arg2 >= 12) {
					if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
						local158 = local103.method457(arg2, arg7, local50, local61, local74, local85, -1);
					} else {
						local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, arg2, local103.anInt615, true, (byte) -21, local85, local61, local50);
					}
					arg5.method334(arg0, arg1, local100, local158, 0, local115, local129, anInt774, arg6, 1, 1);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x924;
					}
					if (local103.aBoolean175 && arg3 != null) {
						arg3.method187(arg1, local103.aBoolean181, local103.anInt609, local103.anInt617, arg7, arg6);
					}
				} else if (arg2 == 0) {
					if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
						local158 = local103.method457(0, arg7, local50, local61, local74, local85, -1);
					} else {
						local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, 0, local103.anInt615, true, (byte) -21, local85, local61, local50);
					}
					arg5.method332(arg0, anIntArray179[arg7], local115, arg1, local158, 0, local129, arg6, local100, null);
					if (arg7 == 0) {
						if (local103.aBoolean174) {
							this.aByteArrayArrayArray2[arg0][arg6][arg1] = 50;
							this.aByteArrayArrayArray2[arg0][arg6][arg1 + 1] = 50;
						}
						if (local103.aBoolean170) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local103.aBoolean174) {
							this.aByteArrayArrayArray2[arg0][arg6][arg1 + 1] = 50;
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1 + 1] = 50;
						}
						if (local103.aBoolean170) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local103.aBoolean174) {
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1] = 50;
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1 + 1] = 50;
						}
						if (local103.aBoolean170) {
							this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local103.aBoolean174) {
							this.aByteArrayArrayArray2[arg0][arg6][arg1] = 50;
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1] = 50;
						}
						if (local103.aBoolean170) {
							this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
						}
					}
					if (local103.aBoolean175 && arg3 != null) {
						arg3.method186(arg7, arg1, arg2, arg6, local103.aBoolean181);
					}
					if (local103.anInt616 != 16) {
						arg5.method340(arg0, arg6, local103.anInt616, arg1);
					}
				} else if (arg2 == 1) {
					if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
						local158 = local103.method457(1, arg7, local50, local61, local74, local85, -1);
					} else {
						local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, 1, local103.anInt615, true, (byte) -21, local85, local61, local50);
					}
					arg5.method332(arg0, anIntArray178[arg7], local115, arg1, local158, 0, local129, arg6, local100, null);
					if (local103.aBoolean174) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray2[arg0][arg6][arg1 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray2[arg0][arg6][arg1] = 50;
						}
					}
					if (local103.aBoolean175 && arg3 != null) {
						arg3.method186(arg7, arg1, arg2, arg6, local103.aBoolean181);
					}
				} else {
					@Pc(867) int local867;
					@Pc(896) Class2_Sub1_Sub3 local896;
					if (arg2 == 2) {
						local867 = arg7 + 1 & 0x3;
						@Pc(886) Class2_Sub1_Sub3 local886;
						if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
							local886 = local103.method457(2, arg7 + 4, local50, local61, local74, local85, -1);
							local896 = local103.method457(2, local867, local50, local61, local74, local85, -1);
						} else {
							local886 = new Class2_Sub1_Sub3_Sub6(local74, arg7 + 4, arg4, 2, local103.anInt615, true, (byte) -21, local85, local61, local50);
							local896 = new Class2_Sub1_Sub3_Sub6(local74, local867, arg4, 2, local103.anInt615, true, (byte) -21, local85, local61, local50);
						}
						arg5.method332(arg0, anIntArray179[arg7], local115, arg1, local886, anIntArray179[local867], local129, arg6, local100, local896);
						if (local103.aBoolean170) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray5[arg0][arg6 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x492;
								this.anIntArrayArrayArray5[arg0][arg6][arg1] |= 0x249;
							}
						}
						if (local103.aBoolean175 && arg3 != null) {
							arg3.method186(arg7, arg1, arg2, arg6, local103.aBoolean181);
						}
						if (local103.anInt616 != 16) {
							arg5.method340(arg0, arg6, local103.anInt616, arg1);
						}
					} else if (arg2 == 3) {
						if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
							local158 = local103.method457(3, arg7, local50, local61, local74, local85, -1);
						} else {
							local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, 3, local103.anInt615, true, (byte) -21, local85, local61, local50);
						}
						arg5.method332(arg0, anIntArray178[arg7], local115, arg1, local158, 0, local129, arg6, local100, null);
						if (local103.aBoolean174) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray2[arg0][arg6][arg1 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray2[arg0][arg6 + 1][arg1] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray2[arg0][arg6][arg1] = 50;
							}
						}
						if (local103.aBoolean175 && arg3 != null) {
							arg3.method186(arg7, arg1, arg2, arg6, local103.aBoolean181);
						}
					} else if (arg2 == 9) {
						if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
							local158 = local103.method457(arg2, arg7, local50, local61, local74, local85, -1);
						} else {
							local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, arg2, local103.anInt615, true, (byte) -21, local85, local61, local50);
						}
						arg5.method334(arg0, arg1, local100, local158, 0, local115, local129, anInt774, arg6, 1, 1);
						if (local103.aBoolean175 && arg3 != null) {
							arg3.method187(arg1, local103.aBoolean181, local103.anInt609, local103.anInt617, arg7, arg6);
						}
					} else {
						if (local103.aBoolean169) {
							if (arg7 == 1) {
								local867 = local85;
								local85 = local74;
								local74 = local61;
								local61 = local50;
								local50 = local867;
							} else if (arg7 == 2) {
								local867 = local85;
								local85 = local61;
								local61 = local867;
								local867 = local74;
								local74 = local50;
								local50 = local867;
							} else if (arg7 == 3) {
								local867 = local85;
								local85 = local50;
								local50 = local61;
								local61 = local74;
								local74 = local867;
							}
						}
						if (arg2 == 4) {
							if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
								local158 = local103.method457(4, 0, local50, local61, local74, local85, -1);
							} else {
								local158 = new Class2_Sub1_Sub3_Sub6(local74, 0, arg4, 4, local103.anInt615, true, (byte) -21, local85, local61, local50);
							}
							arg5.method333(0, local100, local115, arg0, local158, arg7 * 512, 0, arg6, arg1, anIntArray179[arg7], local129);
						} else if (arg2 == 5) {
							local867 = 16;
							local256 = arg5.method350(arg0, arg6, arg1);
							if (local256 > 0) {
								local867 = Class33.method459(local256 >> 14 & 0x7FFF).anInt616;
							}
							if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
								local896 = local103.method457(4, 0, local50, local61, local74, local85, -1);
							} else {
								local896 = new Class2_Sub1_Sub3_Sub6(local74, 0, arg4, 4, local103.anInt615, true, (byte) -21, local85, local61, local50);
							}
							arg5.method333(anIntArray181[arg7] * local867, local100, local115, arg0, local896, arg7 * 512, anIntArray180[arg7] * local867, arg6, arg1, anIntArray179[arg7], local129);
						} else if (arg2 == 6) {
							if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
								local158 = local103.method457(4, 0, local50, local61, local74, local85, -1);
							} else {
								local158 = new Class2_Sub1_Sub3_Sub6(local74, 0, arg4, 4, local103.anInt615, true, (byte) -21, local85, local61, local50);
							}
							arg5.method333(0, local100, local115, arg0, local158, arg7, 0, arg6, arg1, 256, local129);
						} else if (arg2 == 7) {
							if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
								local158 = local103.method457(4, 0, local50, local61, local74, local85, -1);
							} else {
								local158 = new Class2_Sub1_Sub3_Sub6(local74, 0, arg4, 4, local103.anInt615, true, (byte) -21, local85, local61, local50);
							}
							arg5.method333(0, local100, local115, arg0, local158, arg7, 0, arg6, arg1, 512, local129);
						} else if (arg2 == 8) {
							if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
								local158 = local103.method457(4, 0, local50, local61, local74, local85, -1);
							} else {
								local158 = new Class2_Sub1_Sub3_Sub6(local74, 0, arg4, 4, local103.anInt615, true, (byte) -21, local85, local61, local50);
							}
							arg5.method333(0, local100, local115, arg0, local158, arg7, 0, arg6, arg1, 768, local129);
						}
					}
				}
			} else if (!aBoolean215 || local103.aBoolean173 || local103.aBoolean179) {
				if (local103.anInt615 == -1 && local103.anIntArray157 == null) {
					local158 = local103.method457(22, arg7, local50, local61, local74, local85, -1);
				} else {
					local158 = new Class2_Sub1_Sub3_Sub6(local74, arg7, arg4, 22, local103.anInt615, true, (byte) -21, local85, local61, local50);
				}
				arg5.method330(arg0, local115, arg1, local129, local158, arg6, local100);
				if (local103.aBoolean175 && local103.aBoolean173 && arg3 != null) {
					arg3.method188(arg1, arg6);
				}
			}
		} catch (@Pc(1641) RuntimeException local1641) {
			signlink.reporterror("9943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1641.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "([Lclient!EOLCIJGV;IIII[BIIII)V")
	public void method537(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg4 + local7 > 0 && arg4 + local7 < 103) {
						arg0[arg6].anIntArrayArray3[arg3 + local3][arg4 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class2_Sub1_Sub2 local57 = new Class2_Sub1_Sub2(arg5, (byte) 3);
			for (@Pc(73) int local73 = 0; local73 < 4; local73++) {
				for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
					for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
						if (local73 == arg2 && local77 >= arg7 && local77 < arg7 + 8 && local81 >= arg1 && local81 < arg1 + 8) {
							this.method542(0, 0, arg3 + Class38.method500(arg8, local77 & 0x7, local81 & 0x7), arg4 + Class38.method501(local81 & 0x7, arg8, local77 & 0x7), arg6, local57, arg8);
						} else {
							this.method542(0, 0, -1, -1, 0, local57, 0);
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("76567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 7 + ", " + arg7 + ", " + arg8 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(Z[B[Lclient!EOLCIJGV;Lclient!PAJXYXWG;II)V")
	public void method538(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class12[] arg1, @OriginalArg(3) Class29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(17) Class2_Sub1_Sub2 local17 = new Class2_Sub1_Sub2(arg0, (byte) 3);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method108();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method108();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method94();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg3;
					@Pc(74) int local74 = local45 + arg4;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray6[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class12 local101 = null;
						if (local86 >= 0) {
							local101 = arg1[local86];
						}
						this.method536(local55, local74, local62, local101, local19, arg2, local70, local66);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("75358, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IBI[Lclient!EOLCIJGV;III[BIILclient!PAJXYXWG;)V")
	public void method539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class29 arg9) {
		try {
			@Pc(7) Class2_Sub1_Sub2 local7 = new Class2_Sub1_Sub2(arg6, (byte) 3);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method108();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method108();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method94();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg3 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg1 && local45 < arg1 + 8) {
						@Pc(88) Class33 local88 = Class33.method459(local9);
						@Pc(105) int local105 = arg4 + Class38.method502(local66, local45 & 0x7, local88.anInt617, local88.anInt609, arg7, local51 & 0x7);
						@Pc(122) int local122 = arg8 + Class38.method503(local88.anInt609, arg7, local88.anInt617, local51 & 0x7, local66, local45 & 0x7);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg0;
							if ((this.aByteArrayArrayArray6[1][local105][local122] & 0x2) == 2) {
								local134 = arg0 - 1;
							}
							@Pc(149) Class12 local149 = null;
							if (local134 >= 0) {
								local149 = arg2[local134];
							}
							this.method536(arg0, local122, local62, local149, local9, arg9, local105, local66 + arg7 & 0x3);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("32193, " + arg0 + ", " + -103 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIIIILclient!BSNPYLEV;I)V")
	private void method542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub2 arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.anInt767 <= 3 && this.anInt767 >= 3) {
				@Pc(32) int local32;
				if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
					this.aByteArrayArrayArray6[arg4][arg2][arg3] = 0;
					while (true) {
						local32 = arg5.method94();
						if (local32 == 0) {
							if (arg4 == 0) {
								this.anIntArrayArrayArray6[0][arg2][arg3] = -method545(arg2 + arg1 + 932731, arg3 + 556238 + arg0) * 8;
								return;
							} else {
								this.anIntArrayArrayArray6[arg4][arg2][arg3] = this.anIntArrayArrayArray6[arg4 - 1][arg2][arg3] - 240;
								return;
							}
						}
						if (local32 == 1) {
							@Pc(86) int local86 = arg5.method94();
							if (local86 == 1) {
								local86 = 0;
							}
							if (arg4 == 0) {
								this.anIntArrayArrayArray6[0][arg2][arg3] = -local86 * 8;
								return;
							}
							this.anIntArrayArrayArray6[arg4][arg2][arg3] = this.anIntArrayArrayArray6[arg4 - 1][arg2][arg3] - local86 * 8;
							return;
						}
						if (local32 <= 49) {
							this.aByteArrayArrayArray7[arg4][arg2][arg3] = arg5.method95();
							this.aByteArrayArrayArray5[arg4][arg2][arg3] = (byte) ((local32 - 2) / 4);
							this.aByteArrayArrayArray3[arg4][arg2][arg3] = (byte) (local32 + arg6 - 2 & 0x3);
						} else if (local32 <= 81) {
							this.aByteArrayArrayArray6[arg4][arg2][arg3] = (byte) (local32 - 49);
						} else {
							this.aByteArrayArrayArray4[arg4][arg2][arg3] = (byte) (local32 - 81);
						}
					}
				} else {
					while (true) {
						local32 = arg5.method94();
						if (local32 == 0) {
							return;
						}
						if (local32 == 1) {
							arg5.method94();
							return;
						}
						if (local32 <= 49) {
							arg5.method94();
						}
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("94131, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(II[Lclient!EOLCIJGV;I[BII)V")
	public void method544(@OriginalArg(0) int arg0, @OriginalArg(2) Class12[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg5 + local11 > 0 && arg5 + local11 < 103) {
							arg1[local3].anIntArrayArray3[arg4 + local7][arg5 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class2_Sub1_Sub2 local65 = new Class2_Sub1_Sub2(arg3, (byte) 3);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
					for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
						this.method542(arg2, arg0, local81 + arg4, local85 + arg5, local11, local65, 0);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("65185, " + arg0 + ", " + -48086 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIBI)V")
	public void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray6[arg2][arg0 + local3][arg1 + local7] = 0;
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray6[arg2][arg0][arg1 + local7] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 + local7];
				}
			}
			if (arg1 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray6[arg2][arg0 + local7][arg1] = this.anIntArrayArrayArray6[arg2][arg0 + local7][arg1 - 1];
				}
			}
			if (arg0 > 0 && this.anIntArrayArrayArray6[arg2][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray6[arg2][arg0][arg1] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray6[arg2][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray6[arg2][arg0][arg1] = this.anIntArrayArrayArray6[arg2][arg0][arg1 - 1];
			} else if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray6[arg2][arg0][arg1] = this.anIntArrayArrayArray6[arg2][arg0 - 1][arg1 - 1];
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("8315, " + arg0 + ", " + arg1 + ", " + -96 + ", " + arg2 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "a", descriptor = "(IIIII)V")
	public void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg0; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg3; local7++) {
					if (local7 >= 0 && local7 < this.anInt777 && local3 >= 0 && local3 < this.anInt778) {
						this.aByteArrayArrayArray2[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7 - 1][local3];
						}
						if (local7 == arg1 + arg3 && local7 < this.anInt777 - 1) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg0 && local3 < this.anInt778 - 1) {
							this.anIntArrayArrayArray6[0][local7][local3] = this.anIntArrayArrayArray6[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("57895, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -464 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZFUDUYZ", name = "e", descriptor = "(II)I")
	private int method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
