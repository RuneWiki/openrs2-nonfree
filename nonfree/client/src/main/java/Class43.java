import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XAALPTAR")
public final class Class43 {

	@OriginalMember(owner = "client!XAALPTAR", name = "g", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!XAALPTAR", name = "o", descriptor = "I")
	private static int anInt702;

	@OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "[I")
	private static final int[] anIntArray175 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!XAALPTAR", name = "d", descriptor = "[I")
	private static final int[] anIntArray176 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!XAALPTAR", name = "h", descriptor = "I")
	public static int anInt698 = 99;

	@OriginalMember(owner = "client!XAALPTAR", name = "k", descriptor = "I")
	private static int anInt701 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!XAALPTAR", name = "n", descriptor = "[I")
	private static final int[] anIntArray177 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!XAALPTAR", name = "p", descriptor = "Z")
	private static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!XAALPTAR", name = "q", descriptor = "Z")
	private static boolean aBoolean188 = true;

	@OriginalMember(owner = "client!XAALPTAR", name = "r", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!XAALPTAR", name = "s", descriptor = "[I")
	private static final int[] anIntArray178 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!XAALPTAR", name = "F", descriptor = "I")
	private static int anInt704 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!XAALPTAR", name = "G", descriptor = "I")
	private static int anInt705 = 31743;

	@OriginalMember(owner = "client!XAALPTAR", name = "m", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!XAALPTAR", name = "t", descriptor = "I")
	private int anInt703 = 8;

	@OriginalMember(owner = "client!XAALPTAR", name = "u", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!XAALPTAR", name = "w", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!XAALPTAR", name = "H", descriptor = "B")
	private byte aByte25 = 1;

	@OriginalMember(owner = "client!XAALPTAR", name = "i", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!XAALPTAR", name = "j", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!XAALPTAR", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!XAALPTAR", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!XAALPTAR", name = "v", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!XAALPTAR", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!XAALPTAR", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!XAALPTAR", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!XAALPTAR", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!XAALPTAR", name = "x", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!XAALPTAR", name = "y", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!XAALPTAR", name = "z", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!XAALPTAR", name = "A", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!XAALPTAR", name = "B", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(III)Z")
	public static boolean method449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) Class41 local6 = Class41.method403(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local6.method402(173, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("26457, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(III)I")
	private static int method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method455(local3, local13);
		@Pc(29) int local29 = method455(local3 + 1, local13);
		@Pc(35) int local35 = method455(local3, local13 + 1);
		@Pc(43) int local43 = method455(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method460(local23, local29, local9, arg2);
		@Pc(55) int local55 = method460(local35, local43, local9, arg2);
		return method460(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(II)I")
	private static int method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method468(arg0 - 1, arg1 - 1) + method468(arg0 + 1, arg1 - 1) + method468(arg0 - 1, arg1 + 1) + method468(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method468(arg0 - 1, arg1) + method468(arg0 + 1, arg1) + method468(arg0, arg1 - 1) + method468(arg0, arg1 + 1);
		@Pc(59) int local59 = method468(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(I[BIZ)Z")
	public static boolean method456(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class2_Sub1_Sub4 local9 = new Class2_Sub1_Sub4(arg1, -46859);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local9.method354();
				if (local18 == 0) {
					return local3;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local9.method354();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local9.method340() >> 2;
						@Pc(70) int local70 = local61 + arg0;
						@Pc(74) int local74 = local55 + arg2;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class41 local87 = Class41.method403(local15);
							if (local66 != 22 || !aBoolean189 || local87.aBoolean159 || local87.aBoolean167) {
								local3 &= local87.method406();
								local28 = true;
							}
						}
					}
					local33 = local9.method354();
					if (local33 == 0) {
						break;
					}
					local9.method340();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("7741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(II)I")
	private static int method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method452(arg0 + 45365, arg1 + 91923, 4) + (method452(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method452(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "b", descriptor = "(IIII)I")
	private static int method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub2_Sub4.anIntArray188[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(Lclient!RSWRPCHR;ZLclient!QJAHKUCY;)V")
	public static void method461(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) Class9_Sub1 arg1) {
		try {
			@Pc(11) int local11 = -1;
			while (true) {
				@Pc(14) int local14 = arg0.method354();
				if (local14 == 0) {
					return;
				}
				local11 += local14;
				@Pc(23) Class41 local23 = Class41.method403(local11);
				local23.method407(arg1);
				while (true) {
					@Pc(30) int local30 = arg0.method354();
					if (local30 == 0) {
						break;
					}
					arg0.method340();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("9086, " + arg0 + ", " + true + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "d", descriptor = "(II)I")
	private static int method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(III[[[IIBIIILclient!YJCKMNKP;Lclient!KQTHKTBC;)V")
	public static void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class46 arg8, @OriginalArg(10) Class21 arg9) {
		try {
			@Pc(9) int local9 = arg3[arg2][arg0][arg7];
			@Pc(19) int local19 = arg3[arg2][arg0 + 1][arg7];
			@Pc(31) int local31 = arg3[arg2][arg0 + 1][arg7 + 1];
			@Pc(41) int local41 = arg3[arg2][arg0][arg7 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class41 local54 = Class41.method403(arg6);
			@Pc(66) int local66 = arg0 + (arg7 << 7) + (arg6 << 14) + 1073741824;
			if (!local54.aBoolean159) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg5 << 6) + arg4);
			@Pc(104) Class2_Sub1_Sub3 local104;
			if (arg4 == 22) {
				if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
					local104 = local54.method410(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, 22, local41, local19, local54.anInt659, local9, true);
				}
				arg8.method523(local66, arg0, local51, arg7, arg1, local80, local104);
				if (local54.aBoolean161 && local54.aBoolean159) {
					arg9.method212(arg7, arg0);
				}
			} else {
				@Pc(200) int local200;
				if (arg4 == 10 || arg4 == 11) {
					if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
						local104 = local54.method410(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, 10, local41, local19, local54.anInt659, local9, true);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg4 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg5 == 1 || arg5 == 3) {
							local200 = local54.anInt646;
							local203 = local54.anInt663;
						} else {
							local200 = local54.anInt663;
							local203 = local54.anInt646;
						}
						arg8.method527(local187, arg7, local104, arg1, local200, arg0, local80, local203, local51, local66);
					}
					if (local54.aBoolean161) {
						arg9.method211(arg7, local54.anInt646, arg5, local54.aBoolean170, arg0, local54.anInt663);
					}
				} else if (arg4 >= 12) {
					if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
						local104 = local54.method410(arg4, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, arg4, local41, local19, local54.anInt659, local9, true);
					}
					arg8.method527(0, arg7, local104, arg1, 1, arg0, local80, 1, local51, local66);
					if (local54.aBoolean161) {
						arg9.method211(arg7, local54.anInt646, arg5, local54.aBoolean170, arg0, local54.anInt663);
					}
				} else if (arg4 == 0) {
					if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
						local104 = local54.method410(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, 0, local41, local19, local54.anInt659, local9, true);
					}
					arg8.method525(null, (byte) 3, arg0, arg7, anIntArray176[arg5], arg1, local80, local66, local104, 0, local51);
					if (local54.aBoolean161) {
						arg9.method210(arg4, arg0, local54.aBoolean170, arg7, arg5);
					}
				} else if (arg4 == 1) {
					if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
						local104 = local54.method410(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, 1, local41, local19, local54.anInt659, local9, true);
					}
					arg8.method525(null, (byte) 3, arg0, arg7, anIntArray177[arg5], arg1, local80, local66, local104, 0, local51);
					if (local54.aBoolean161) {
						arg9.method210(arg4, arg0, local54.aBoolean170, arg7, arg5);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class2_Sub1_Sub3 local475;
					if (arg4 == 2) {
						local446 = arg5 + 1 & 0x3;
						@Pc(465) Class2_Sub1_Sub3 local465;
						if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
							local465 = local54.method410(2, arg5 + 4, local9, local19, local31, local41, -1);
							local475 = local54.method410(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5 + 4, 466, 2, local41, local19, local54.anInt659, local9, true);
							local475 = new Class2_Sub1_Sub3_Sub4(local31, arg6, local446, 466, 2, local41, local19, local54.anInt659, local9, true);
						}
						arg8.method525(local475, (byte) 3, arg0, arg7, anIntArray176[arg5], arg1, local80, local66, local465, anIntArray176[local446], local51);
						if (local54.aBoolean161) {
							arg9.method210(arg4, arg0, local54.aBoolean170, arg7, arg5);
						}
					} else if (arg4 == 3) {
						if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
							local104 = local54.method410(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, 3, local41, local19, local54.anInt659, local9, true);
						}
						arg8.method525(null, (byte) 3, arg0, arg7, anIntArray177[arg5], arg1, local80, local66, local104, 0, local51);
						if (local54.aBoolean161) {
							arg9.method210(arg4, arg0, local54.aBoolean170, arg7, arg5);
						}
					} else if (arg4 == 9) {
						if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
							local104 = local54.method410(arg4, arg5, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, arg5, 466, arg4, local41, local19, local54.anInt659, local9, true);
						}
						arg8.method527(0, arg7, local104, arg1, 1, arg0, local80, 1, local51, local66);
						if (local54.aBoolean161) {
							arg9.method211(arg7, local54.anInt646, arg5, local54.aBoolean170, arg0, local54.anInt663);
						}
					} else {
						if (local54.aBoolean162) {
							if (arg5 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg5 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg5 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg4 == 4) {
							if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
								local104 = local54.method410(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, 0, 466, 4, local41, local19, local54.anInt659, local9, true);
							}
							arg8.method526(local51, arg1, arg0, local66, 0, arg5 * 512, local80, arg7, local104, 0, anIntArray176[arg5]);
						} else if (arg4 == 5) {
							local446 = 16;
							local200 = arg8.method543(arg1, arg0, arg7);
							if (local200 > 0) {
								local446 = Class41.method403(local200 >> 14 & 0x7FFF).anInt648;
							}
							if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
								local475 = local54.method410(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class2_Sub1_Sub3_Sub4(local31, arg6, 0, 466, 4, local41, local19, local54.anInt659, local9, true);
							}
							arg8.method526(local51, arg1, arg0, local66, anIntArray175[arg5] * local446, arg5 * 512, local80, arg7, local475, anIntArray178[arg5] * local446, anIntArray176[arg5]);
						} else if (arg4 == 6) {
							if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
								local104 = local54.method410(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, 0, 466, 4, local41, local19, local54.anInt659, local9, true);
							}
							arg8.method526(local51, arg1, arg0, local66, 0, arg5, local80, arg7, local104, 0, 256);
						} else if (arg4 == 7) {
							if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
								local104 = local54.method410(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, 0, 466, 4, local41, local19, local54.anInt659, local9, true);
							}
							arg8.method526(local51, arg1, arg0, local66, 0, arg5, local80, arg7, local104, 0, 512);
						} else if (arg4 == 8) {
							if (local54.anInt659 == -1 && local54.anIntArray127 == null) {
								local104 = local54.method410(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class2_Sub1_Sub3_Sub4(local31, arg6, 0, 466, 4, local41, local19, local54.anInt659, local9, true);
							}
							arg8.method526(local51, arg1, arg0, local66, 0, arg5, local80, arg7, local104, 0, 768);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("98837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "e", descriptor = "(II)I")
	private static int method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "<init>", descriptor = "([[[BIII[[[I)V")
	public Class43(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt698 = 99;
			this.anInt699 = arg3;
			this.anInt700 = arg1;
			this.anIntArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray4 = arg0;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt699][this.anInt700];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt699][this.anInt700];
			this.anIntArrayArrayArray2 = new int[4][this.anInt699 + 1][this.anInt700 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt699 + 1][this.anInt700 + 1];
			this.anIntArrayArray15 = new int[this.anInt699 + 1][this.anInt700 + 1];
			this.anIntArray179 = new int[this.anInt700];
			this.anIntArray180 = new int[this.anInt700];
			this.anIntArray181 = new int[this.anInt700];
			this.anIntArray182 = new int[this.anInt700];
			this.anIntArray183 = new int[this.anInt700];
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("11034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(II)I")
	private int method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(BLclient!YJCKMNKP;[Lclient!KQTHKTBC;)V")
	public void method451(@OriginalArg(1) Class46 arg0, @OriginalArg(2) Class21[] arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray4[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray4[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method212(local11, local7);
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
			anInt704 += (int) (Math.random() * 5.0D) - 2;
			if (anInt704 < -16) {
				anInt704 = -16;
			}
			if (anInt704 > 16) {
				anInt704 = 16;
			}
			@Pc(140) int local140;
			@Pc(146) int local146;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(176) int local176;
			@Pc(198) int local198;
			@Pc(211) int local211;
			@Pc(217) int local217;
			@Pc(221) int local221;
			@Pc(227) int local227;
			@Pc(243) int local243;
			@Pc(291) int local291;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(115) byte[][] local115 = this.aByteArrayArrayArray6[local7];
				local140 = (int) Math.sqrt((double) 5100);
				local146 = local140 * 768 >> 8;
				for (local148 = 1; local148 < this.anInt700 - 1; local148++) {
					for (local152 = 1; local152 < this.anInt699 - 1; local152++) {
						local176 = this.anIntArrayArrayArray1[local7][local152 + 1][local148] - this.anIntArrayArrayArray1[local7][local152 - 1][local148];
						local198 = this.anIntArrayArrayArray1[local7][local152][local148 + 1] - this.anIntArrayArrayArray1[local7][local152][local148 - 1];
						local211 = (int) Math.sqrt((double) (local176 * local176 + local198 * local198 + 65536));
						local217 = (local176 << 8) / local211;
						local221 = 65536 / local211;
						local227 = (local198 << 8) / local211;
						local243 = (local217 * -50 + local221 * -10 + local227 * -50) / local146 + 96;
						local291 = (local115[local152 - 1][local148] >> 2) + (local115[local152 + 1][local148] >> 3) + (local115[local152][local148 - 1] >> 2) + (local115[local152][local148 + 1] >> 3) + (local115[local152][local148] >> 1);
						this.anIntArrayArray15[local152][local148] = local243 - local291;
					}
				}
				for (local152 = 0; local152 < this.anInt700; local152++) {
					this.anIntArray179[local152] = 0;
					this.anIntArray180[local152] = 0;
					this.anIntArray181[local152] = 0;
					this.anIntArray182[local152] = 0;
					this.anIntArray183[local152] = 0;
				}
				for (local176 = -5; local176 < this.anInt699 + 5; local176++) {
					for (local198 = 0; local198 < this.anInt700; local198++) {
						local211 = local176 + 5;
						@Pc(426) int local426;
						if (local211 >= 0 && local211 < this.anInt699) {
							local217 = this.aByteArrayArrayArray3[local7][local211][local198] & 0xFF;
							if (local217 > 0) {
								@Pc(385) Class50 local385 = Class50.aClass50Array1[local217 - 1];
								this.anIntArray179[local198] += local385.anInt798;
								this.anIntArray180[local198] += local385.anInt796;
								this.anIntArray181[local198] += local385.anInt797;
								this.anIntArray182[local198] += local385.anInt799;
								local426 = this.anIntArray183[local198]++;
							}
						}
						local217 = local176 - 5;
						if (local217 >= 0 && local217 < this.anInt699) {
							local221 = this.aByteArrayArrayArray3[local7][local217][local198] & 0xFF;
							if (local221 > 0) {
								@Pc(458) Class50 local458 = Class50.aClass50Array1[local221 - 1];
								this.anIntArray179[local198] -= local458.anInt798;
								this.anIntArray180[local198] -= local458.anInt796;
								this.anIntArray181[local198] -= local458.anInt797;
								this.anIntArray182[local198] -= local458.anInt799;
								local426 = this.anIntArray183[local198]--;
							}
						}
					}
					if (local176 >= 1 && local176 < this.anInt699 - 1) {
						local211 = 0;
						local217 = 0;
						local221 = 0;
						local227 = 0;
						local243 = 0;
						for (local291 = -5; local291 < this.anInt700 + 5; local291++) {
							@Pc(534) int local534 = local291 + 5;
							if (local534 >= 0 && local534 < this.anInt700) {
								local211 += this.anIntArray179[local534];
								local217 += this.anIntArray180[local534];
								local221 += this.anIntArray181[local534];
								local227 += this.anIntArray182[local534];
								local243 += this.anIntArray183[local534];
							}
							@Pc(579) int local579 = local291 - 5;
							if (local579 >= 0 && local579 < this.anInt700) {
								local211 -= this.anIntArray179[local579];
								local217 -= this.anIntArray180[local579];
								local221 -= this.anIntArray181[local579];
								local227 -= this.anIntArray182[local579];
								local243 -= this.anIntArray183[local579];
							}
							if (local291 >= 1 && local291 < this.anInt700 - 1 && (!aBoolean189 || (this.aByteArrayArrayArray4[0][local176][local291] & 0x2) != 0 || (this.aByteArrayArrayArray4[local7][local176][local291] & 0x10) == 0 && this.method469(local291, local176, local7) == anInt697)) {
								if (local7 < anInt698) {
									anInt698 = local7;
								}
								@Pc(678) int local678 = this.aByteArrayArrayArray3[local7][local176][local291] & 0xFF;
								@Pc(689) int local689 = this.aByteArrayArrayArray5[local7][local176][local291] & 0xFF;
								if (local678 > 0 || local689 > 0) {
									@Pc(702) int local702 = this.anIntArrayArrayArray1[local7][local176][local291];
									@Pc(713) int local713 = this.anIntArrayArrayArray1[local7][local176 + 1][local291];
									@Pc(726) int local726 = this.anIntArrayArrayArray1[local7][local176 + 1][local291 + 1];
									@Pc(737) int local737 = this.anIntArrayArrayArray1[local7][local176][local291 + 1];
									@Pc(744) int local744 = this.anIntArrayArray15[local176][local291];
									@Pc(753) int local753 = this.anIntArrayArray15[local176 + 1][local291];
									@Pc(764) int local764 = this.anIntArrayArray15[local176 + 1][local291 + 1];
									@Pc(773) int local773 = this.anIntArrayArray15[local176][local291 + 1];
									@Pc(775) int local775 = -1;
									@Pc(777) int local777 = -1;
									@Pc(785) int local785;
									@Pc(789) int local789;
									if (local678 > 0) {
										local785 = local211 * 256 / local227;
										local789 = local217 / local243;
										@Pc(793) int local793 = local221 / local243;
										local775 = this.method464(local785, local789, local793);
										@Pc(805) int local805 = local785 + anInt701 & 0xFF;
										local793 += anInt704;
										if (local793 < 0) {
											local793 = 0;
										} else if (local793 > 255) {
											local793 = 255;
										}
										local777 = this.method464(local805, local789, local793);
									}
									if (local7 > 0) {
										@Pc(830) boolean local830 = true;
										if (local678 == 0 && this.aByteArrayArrayArray7[local7][local176][local291] != 0) {
											local830 = false;
										}
										if (local689 > 0 && !Class50.aClass50Array1[local689 - 1].aBoolean216) {
											local830 = false;
										}
										if (local830 && local702 == local713 && local702 == local726 && local702 == local737) {
											this.anIntArrayArrayArray2[local7][local176][local291] |= 0x924;
										}
									}
									local785 = 0;
									if (local775 != -1) {
										local785 = Class2_Sub1_Sub2_Sub4.anIntArray192[method463(local777, 96)];
									}
									if (local689 == 0) {
										arg0.method522(local7, local176, local291, 0, 0, -1, local702, local713, local726, local737, method463(local775, local744), method463(local775, local753), method463(local775, local764), method463(local775, local773), 0, 0, 0, 0, local785, 0);
									} else {
										local789 = this.aByteArrayArrayArray7[local7][local176][local291] + 1;
										@Pc(942) byte local942 = this.aByteArrayArrayArray2[local7][local176][local291];
										@Pc(948) Class50 local948 = Class50.aClass50Array1[local689 - 1];
										@Pc(951) int local951 = local948.anInt794;
										@Pc(959) int local959;
										@Pc(957) int local957;
										if (local951 >= 0) {
											local957 = Class2_Sub1_Sub2_Sub4.method491(local951);
											local959 = -1;
										} else if (local948.anInt793 == 16711935) {
											local959 = -2;
											local951 = -1;
											local957 = Class2_Sub1_Sub2_Sub4.anIntArray192[this.method450(local948.anInt800, 96)];
										} else {
											local959 = this.method464(local948.anInt795, local948.anInt796, local948.anInt797);
											local957 = Class2_Sub1_Sub2_Sub4.anIntArray192[this.method450(local948.anInt800, 96)];
										}
										arg0.method522(local7, local176, local291, local789, local942, local951, local702, local713, local726, local737, method463(local775, local744), method463(local775, local753), method463(local775, local764), method463(local775, local773), this.method450(local959, local744), this.method450(local959, local753), this.method450(local959, local764), this.method450(local959, local773), local785, local957);
									}
								}
							}
						}
					}
				}
				for (local198 = 1; local198 < this.anInt700 - 1; local198++) {
					for (local211 = 1; local211 < this.anInt699 - 1; local211++) {
						arg0.method521(local7, local211, local198, this.method469(local198, local211, local7));
					}
				}
			}
			arg0.method548(901);
			for (local11 = 0; local11 < this.anInt699; local11++) {
				for (local27 = 0; local27 < this.anInt700; local27++) {
					if ((this.aByteArrayArrayArray4[1][local11][local27] & 0x2) == 2) {
						arg0.method519(local11, local27, this.aBoolean191);
					}
				}
			}
			local27 = 1;
			@Pc(1135) int local1135 = 2;
			@Pc(1137) int local1137 = 4;
			for (@Pc(1139) int local1139 = 0; local1139 < 4; local1139++) {
				if (local1139 > 0) {
					local27 <<= 0x3;
					local1135 <<= 0x3;
					local1137 <<= 0x3;
				}
				for (@Pc(1157) int local1157 = 0; local1157 <= local1139; local1157++) {
					for (local140 = 0; local140 <= this.anInt700; local140++) {
						for (local146 = 0; local146 <= this.anInt699; local146++) {
							if ((this.anIntArrayArrayArray2[local1157][local146][local140] & local27) != 0) {
								local148 = local140;
								local152 = local140;
								local176 = local1157;
								local198 = local1157;
								while (local148 > 0 && (this.anIntArrayArrayArray2[local1157][local146][local148 - 1] & local27) != 0) {
									local148--;
								}
								while (local152 < this.anInt700 && (this.anIntArrayArrayArray2[local1157][local146][local152 + 1] & local27) != 0) {
									local152++;
								}
								label328: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray2[local176 - 1][local146][local211] & local27) == 0) {
											break label328;
										}
									}
									local176--;
								}
								label317: while (local198 < local1139) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray2[local198 + 1][local146][local211] & local27) == 0) {
											break label317;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray1[local198][local146][local148] - 240;
									local227 = this.anIntArrayArrayArray1[local176][local146][local148];
									Class46.method520(local221, local1139, local152 * 128 + 128, local146 * 128, local148 * 128, local227, local146 * 128, 1);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray2[local243][local146][local291] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1157][local146][local140] & local1135) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local1157;
								local198 = local1157;
								while (local148 > 0 && (this.anIntArrayArrayArray2[local1157][local148 - 1][local140] & local1135) != 0) {
									local148--;
								}
								while (local152 < this.anInt699 && (this.anIntArrayArrayArray2[local1157][local152 + 1][local140] & local1135) != 0) {
									local152++;
								}
								label381: while (local176 > 0) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray2[local176 - 1][local211][local140] & local1135) == 0) {
											break label381;
										}
									}
									local176--;
								}
								label370: while (local198 < local1139) {
									for (local211 = local148; local211 <= local152; local211++) {
										if ((this.anIntArrayArrayArray2[local198 + 1][local211][local140] & local1135) == 0) {
											break label370;
										}
									}
									local198++;
								}
								local211 = (local198 + 1 - local176) * (local152 + 1 - local148);
								if (local211 >= 8) {
									local221 = this.anIntArrayArrayArray1[local198][local148][local140] - 240;
									local227 = this.anIntArrayArrayArray1[local176][local148][local140];
									Class46.method520(local221, local1139, local140 * 128, local152 * 128 + 128, local140 * 128, local227, local148 * 128, 2);
									for (local243 = local176; local243 <= local198; local243++) {
										for (local291 = local148; local291 <= local152; local291++) {
											this.anIntArrayArrayArray2[local243][local291][local140] &= ~local1135;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1157][local146][local140] & local1137) != 0) {
								local148 = local146;
								local152 = local146;
								local176 = local140;
								local198 = local140;
								while (local176 > 0 && (this.anIntArrayArrayArray2[local1157][local146][local176 - 1] & local1137) != 0) {
									local176--;
								}
								while (local198 < this.anInt700 && (this.anIntArrayArrayArray2[local1157][local146][local198 + 1] & local1137) != 0) {
									local198++;
								}
								label434: while (local148 > 0) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray2[local1157][local148 - 1][local211] & local1137) == 0) {
											break label434;
										}
									}
									local148--;
								}
								label423: while (local152 < this.anInt699) {
									for (local211 = local176; local211 <= local198; local211++) {
										if ((this.anIntArrayArrayArray2[local1157][local152 + 1][local211] & local1137) == 0) {
											break label423;
										}
									}
									local152++;
								}
								if ((local152 + 1 - local148) * (local198 + 1 - local176) >= 4) {
									local211 = this.anIntArrayArrayArray1[local1157][local148][local176];
									Class46.method520(local211, local1139, local198 * 128 + 128, local152 * 128 + 128, local176 * 128, local211, local148 * 128, 4);
									for (local217 = local148; local217 <= local152; local217++) {
										for (local221 = local176; local221 <= local198; local221++) {
											this.anIntArrayArrayArray2[local1157][local217][local221] &= ~local1137;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1772) RuntimeException local1772) {
			signlink.reporterror("87530, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local1772.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIBI)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg3; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg2; local7++) {
					if (local7 >= 0 && local7 < this.anInt699 && local3 >= 0 && local3 < this.anInt700) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg0 + arg2 && local7 < this.anInt699 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg1 + arg3 && local3 < this.anInt700 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("58492, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -60 + ", " + arg3 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "([BIIZI[Lclient!KQTHKTBC;IILclient!YJCKMNKP;II)V")
	public void method454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class21[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(17) Class2_Sub1_Sub4 local17 = new Class2_Sub1_Sub4(arg0, -46859);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method354();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method354();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method340();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg8 && local51 >= arg6 && local51 < arg6 + 8 && local45 >= arg2 && local45 < arg2 + 8) {
						@Pc(88) Class41 local88 = Class41.method403(local19);
						@Pc(105) int local105 = arg1 + Class45.method514(local66, local88.anInt663, local45 & 0x7, arg5, local51 & 0x7, local88.anInt646);
						@Pc(122) int local122 = arg9 + Class45.method515(arg5, local51 & 0x7, 197, local45 & 0x7, local88.anInt646, local66, local88.anInt663);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg3;
							if ((this.aByteArrayArrayArray4[1][local105][local122] & 0x2) == 2) {
								local134 = arg3 - 1;
							}
							@Pc(149) Class21 local149 = null;
							if (local134 >= 0) {
								local149 = arg4[local134];
							}
							this.method466(local66 + arg5 & 0x3, local105, local122, arg3, local19, local62, local149, arg7);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("32459, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIII)V")
	public void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (anInt705 == 31743) {
				@Pc(11) int local11;
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					for (local11 = 0; local11 < 8; local11++) {
						this.anIntArrayArrayArray1[arg2][arg0 + local7][arg1 + local11] = 0;
					}
				}
				if (arg0 > 0) {
					for (local11 = 1; local11 < 8; local11++) {
						this.anIntArrayArrayArray1[arg2][arg0][arg1 + local11] = this.anIntArrayArrayArray1[arg2][arg0 - 1][arg1 + local11];
					}
				}
				if (arg1 > 0) {
					for (local11 = 1; local11 < 8; local11++) {
						this.anIntArrayArrayArray1[arg2][arg0 + local11][arg1] = this.anIntArrayArrayArray1[arg2][arg0 + local11][arg1 - 1];
					}
				}
				if (arg0 > 0 && this.anIntArrayArrayArray1[arg2][arg0 - 1][arg1] != 0) {
					this.anIntArrayArrayArray1[arg2][arg0][arg1] = this.anIntArrayArrayArray1[arg2][arg0 - 1][arg1];
				} else if (arg1 > 0 && this.anIntArrayArrayArray1[arg2][arg0][arg1 - 1] != 0) {
					this.anIntArrayArrayArray1[arg2][arg0][arg1] = this.anIntArrayArrayArray1[arg2][arg0][arg1 - 1];
				} else if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray1[arg2][arg0 - 1][arg1 - 1] != 0) {
					this.anIntArrayArrayArray1[arg2][arg0][arg1] = this.anIntArrayArrayArray1[arg2][arg0 - 1][arg1 - 1];
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("8900, " + arg0 + ", " + arg1 + ", " + 31743 + ", " + arg2 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(II[Lclient!KQTHKTBC;IIIZI[BI)V")
	public void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg4 + local7 > 0 && arg4 + local7 < 103) {
						arg2[arg6].anIntArrayArray7[arg3 + local3][arg4 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class2_Sub1_Sub4 local57 = new Class2_Sub1_Sub4(arg7, -46859);
			for (@Pc(62) int local62 = 0; local62 < 4; local62++) {
				for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						if (local62 == arg0 && local66 >= arg8 && local66 < arg8 + 8 && local70 >= arg1 && local70 < arg1 + 8) {
							this.method465(0, arg3 + Class45.method512(arg5, local66 & 0x7, local70 & 0x7), 0, arg4 + Class45.method513(arg5, local70 & 0x7, local66 & 0x7, this.aByte25), arg6, local57, arg5);
						} else {
							this.method465(0, -1, 0, -1, 0, local57, 0);
						}
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("2977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIZ[Lclient!KQTHKTBC;Lclient!YJCKMNKP;[B)V")
	public void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class21[] arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(arg4, -46859);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method354();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method354();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method340();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg0;
					@Pc(68) int local68 = local39 + arg1;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray4[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class21 local95 = null;
						if (local80 >= 0) {
							local95 = arg2[local80];
						}
						this.method466(local60, local64, local68, local49, local13, local56, local95, arg3);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("48172, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(III)I")
	private int method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIIIILclient!RSWRPCHR;I)V")
	private void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub1_Sub4 arg5, @OriginalArg(7) int arg6) {
		try {
			if (this.anInt703 > 8 || this.anInt703 < 8) {
				aBoolean187 = !aBoolean187;
			}
			@Pc(37) int local37;
			if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
				this.aByteArrayArrayArray4[arg4][arg1][arg3] = 0;
				while (true) {
					local37 = arg5.method340();
					if (local37 == 0) {
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg3] = -method457(arg1 + arg2 + 932731, arg3 + 556238 + arg0) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg4][arg1][arg3] = this.anIntArrayArrayArray1[arg4 - 1][arg1][arg3] - 240;
							return;
						}
					}
					if (local37 == 1) {
						@Pc(91) int local91 = arg5.method340();
						if (local91 == 1) {
							local91 = 0;
						}
						if (arg4 == 0) {
							this.anIntArrayArrayArray1[0][arg1][arg3] = -local91 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg4][arg1][arg3] = this.anIntArrayArrayArray1[arg4 - 1][arg1][arg3] - local91 * 8;
						return;
					}
					if (local37 <= 49) {
						this.aByteArrayArrayArray5[arg4][arg1][arg3] = arg5.method341();
						this.aByteArrayArrayArray7[arg4][arg1][arg3] = (byte) ((local37 - 2) / 4);
						this.aByteArrayArrayArray2[arg4][arg1][arg3] = (byte) (local37 + arg6 - 2 & 0x3);
					} else if (local37 <= 81) {
						this.aByteArrayArrayArray4[arg4][arg1][arg3] = (byte) (local37 - 49);
					} else {
						this.aByteArrayArrayArray3[arg4][arg1][arg3] = (byte) (local37 - 81);
					}
				}
			} else {
				while (true) {
					local37 = arg5.method340();
					if (local37 == 0) {
						return;
					}
					if (local37 == 1) {
						arg5.method340();
						return;
					}
					if (local37 <= 49) {
						arg5.method340();
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("43541, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + arg5 + ", " + arg6 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(IIIIIIILclient!KQTHKTBC;Lclient!YJCKMNKP;)V")
	private void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class21 arg6, @OriginalArg(8) Class46 arg7) {
		try {
			if (aBoolean189 && (this.aByteArrayArrayArray4[0][arg1][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray4[arg3][arg1][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method469(arg2, arg1, arg3) != anInt697) {
					return;
				}
			}
			if (arg3 < anInt698) {
				anInt698 = arg3;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray1[arg3][arg1][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray1[arg3][arg1 + 1][arg2];
			@Pc(73) int local73 = this.anIntArrayArrayArray1[arg3][arg1 + 1][arg2 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray1[arg3][arg1][arg2 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(100) Class41 local100 = Class41.method403(arg4);
			@Pc(112) int local112 = arg1 + (arg2 << 7) + (arg4 << 14) + 1073741824;
			if (!local100.aBoolean159) {
				local112 += Integer.MIN_VALUE;
			}
			@Pc(126) byte local126 = (byte) ((arg0 << 6) + arg5);
			@Pc(155) Class2_Sub1_Sub3 local155;
			if (arg5 != 22) {
				@Pc(253) int local253;
				if (arg5 == 10 || arg5 == 11) {
					if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
						local155 = local100.method410(10, arg0, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, 10, local84, local60, local100.anInt659, local49, true);
					}
					if (local155 != null) {
						@Pc(240) int local240 = 0;
						if (arg5 == 11) {
							local240 += 256;
						}
						@Pc(256) int local256;
						if (arg0 == 1 || arg0 == 3) {
							local253 = local100.anInt646;
							local256 = local100.anInt663;
						} else {
							local253 = local100.anInt663;
							local256 = local100.anInt646;
						}
						if (arg7.method527(local240, arg2, local155, arg3, local253, arg1, local126, local256, local94, local112) && local100.aBoolean164) {
							@Pc(287) Class2_Sub1_Sub3_Sub5 local287;
							if (local155 instanceof Class2_Sub1_Sub3_Sub5) {
								local287 = (Class2_Sub1_Sub3_Sub5) local155;
							} else {
								local287 = local100.method410(10, arg0, local49, local60, local73, local84, -1);
							}
							if (local287 != null) {
								for (@Pc(303) int local303 = 0; local303 <= local253; local303++) {
									for (@Pc(307) int local307 = 0; local307 <= local256; local307++) {
										@Pc(314) int local314 = local287.anInt686 / 4;
										if (local314 > 30) {
											local314 = 30;
										}
										if (local314 > this.aByteArrayArrayArray6[arg3][arg1 + local303][arg2 + local307]) {
											this.aByteArrayArrayArray6[arg3][arg1 + local303][arg2 + local307] = (byte) local314;
										}
									}
								}
							}
						}
					}
					if (local100.aBoolean161 && arg6 != null) {
						arg6.method211(arg2, local100.anInt646, arg0, local100.aBoolean170, arg1, local100.anInt663);
					}
				} else if (arg5 >= 12) {
					if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
						local155 = local100.method410(arg5, arg0, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, arg5, local84, local60, local100.anInt659, local49, true);
					}
					arg7.method527(0, arg2, local155, arg3, 1, arg1, local126, 1, local94, local112);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x924;
					}
					if (local100.aBoolean161 && arg6 != null) {
						arg6.method211(arg2, local100.anInt646, arg0, local100.aBoolean170, arg1, local100.anInt663);
					}
				} else if (arg5 == 0) {
					if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
						local155 = local100.method410(0, arg0, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, 0, local84, local60, local100.anInt659, local49, true);
					}
					arg7.method525(null, (byte) 3, arg1, arg2, anIntArray176[arg0], arg3, local126, local112, local155, 0, local94);
					if (arg0 == 0) {
						if (local100.aBoolean164) {
							this.aByteArrayArrayArray6[arg3][arg1][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg1][arg2 + 1] = 50;
						}
						if (local100.aBoolean168) {
							this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local100.aBoolean164) {
							this.aByteArrayArrayArray6[arg3][arg1][arg2 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2 + 1] = 50;
						}
						if (local100.aBoolean168) {
							this.anIntArrayArrayArray2[arg3][arg1][arg2 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local100.aBoolean164) {
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2 + 1] = 50;
						}
						if (local100.aBoolean168) {
							this.anIntArrayArrayArray2[arg3][arg1 + 1][arg2] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local100.aBoolean164) {
							this.aByteArrayArrayArray6[arg3][arg1][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2] = 50;
						}
						if (local100.aBoolean168) {
							this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x492;
						}
					}
					if (local100.aBoolean161 && arg6 != null) {
						arg6.method210(arg5, arg1, local100.aBoolean170, arg2, arg0);
					}
					if (local100.anInt648 != 16) {
						arg7.method533(arg3, local100.anInt648, arg2, arg1);
					}
				} else if (arg5 == 1) {
					if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
						local155 = local100.method410(1, arg0, local49, local60, local73, local84, -1);
					} else {
						local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, 1, local84, local60, local100.anInt659, local49, true);
					}
					arg7.method525(null, (byte) 3, arg1, arg2, anIntArray177[arg0], arg3, local126, local112, local155, 0, local94);
					if (local100.aBoolean164) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray6[arg3][arg1][arg2 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray6[arg3][arg1][arg2] = 50;
						}
					}
					if (local100.aBoolean161 && arg6 != null) {
						arg6.method210(arg5, arg1, local100.aBoolean170, arg2, arg0);
					}
				} else {
					@Pc(864) int local864;
					@Pc(893) Class2_Sub1_Sub3 local893;
					if (arg5 == 2) {
						local864 = arg0 + 1 & 0x3;
						@Pc(883) Class2_Sub1_Sub3 local883;
						if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
							local883 = local100.method410(2, arg0 + 4, local49, local60, local73, local84, -1);
							local893 = local100.method410(2, local864, local49, local60, local73, local84, -1);
						} else {
							local883 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0 + 4, 466, 2, local84, local60, local100.anInt659, local49, true);
							local893 = new Class2_Sub1_Sub3_Sub4(local73, arg4, local864, 466, 2, local84, local60, local100.anInt659, local49, true);
						}
						arg7.method525(local893, (byte) 3, arg1, arg2, anIntArray176[arg0], arg3, local126, local112, local883, anIntArray176[local864], local94);
						if (local100.aBoolean168) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg1][arg2 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray2[arg3][arg1][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg1 + 1][arg2] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray2[arg3][arg1 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg1][arg2] |= 0x249;
							}
						}
						if (local100.aBoolean161 && arg6 != null) {
							arg6.method210(arg5, arg1, local100.aBoolean170, arg2, arg0);
						}
						if (local100.anInt648 != 16) {
							arg7.method533(arg3, local100.anInt648, arg2, arg1);
						}
					} else if (arg5 == 3) {
						if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
							local155 = local100.method410(3, arg0, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, 3, local84, local60, local100.anInt659, local49, true);
						}
						arg7.method525(null, (byte) 3, arg1, arg2, anIntArray177[arg0], arg3, local126, local112, local155, 0, local94);
						if (local100.aBoolean164) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray6[arg3][arg1][arg2 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray6[arg3][arg1 + 1][arg2] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray6[arg3][arg1][arg2] = 50;
							}
						}
						if (local100.aBoolean161 && arg6 != null) {
							arg6.method210(arg5, arg1, local100.aBoolean170, arg2, arg0);
						}
					} else if (arg5 == 9) {
						if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
							local155 = local100.method410(arg5, arg0, local49, local60, local73, local84, -1);
						} else {
							local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, arg5, local84, local60, local100.anInt659, local49, true);
						}
						arg7.method527(0, arg2, local155, arg3, 1, arg1, local126, 1, local94, local112);
						if (local100.aBoolean161 && arg6 != null) {
							arg6.method211(arg2, local100.anInt646, arg0, local100.aBoolean170, arg1, local100.anInt663);
						}
					} else {
						if (local100.aBoolean162) {
							if (arg0 == 1) {
								local864 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local864;
							} else if (arg0 == 2) {
								local864 = local84;
								local84 = local60;
								local60 = local864;
								local864 = local73;
								local73 = local49;
								local49 = local864;
							} else if (arg0 == 3) {
								local864 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local864;
							}
						}
						if (arg5 == 4) {
							if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
								local155 = local100.method410(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, 0, 466, 4, local84, local60, local100.anInt659, local49, true);
							}
							arg7.method526(local94, arg3, arg1, local112, 0, arg0 * 512, local126, arg2, local155, 0, anIntArray176[arg0]);
						} else if (arg5 == 5) {
							local864 = 16;
							local253 = arg7.method543(arg3, arg1, arg2);
							if (local253 > 0) {
								local864 = Class41.method403(local253 >> 14 & 0x7FFF).anInt648;
							}
							if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
								local893 = local100.method410(4, 0, local49, local60, local73, local84, -1);
							} else {
								local893 = new Class2_Sub1_Sub3_Sub4(local73, arg4, 0, 466, 4, local84, local60, local100.anInt659, local49, true);
							}
							arg7.method526(local94, arg3, arg1, local112, anIntArray175[arg0] * local864, arg0 * 512, local126, arg2, local893, anIntArray178[arg0] * local864, anIntArray176[arg0]);
						} else if (arg5 == 6) {
							if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
								local155 = local100.method410(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, 0, 466, 4, local84, local60, local100.anInt659, local49, true);
							}
							arg7.method526(local94, arg3, arg1, local112, 0, arg0, local126, arg2, local155, 0, 256);
						} else if (arg5 == 7) {
							if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
								local155 = local100.method410(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, 0, 466, 4, local84, local60, local100.anInt659, local49, true);
							}
							arg7.method526(local94, arg3, arg1, local112, 0, arg0, local126, arg2, local155, 0, 512);
						} else if (arg5 == 8) {
							if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
								local155 = local100.method410(4, 0, local49, local60, local73, local84, -1);
							} else {
								local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, 0, 466, 4, local84, local60, local100.anInt659, local49, true);
							}
							arg7.method526(local94, arg3, arg1, local112, 0, arg0, local126, arg2, local155, 0, 768);
						}
					}
				}
			} else if (!aBoolean189 || local100.aBoolean159 || local100.aBoolean167) {
				if (local100.anInt659 == -1 && local100.anIntArray127 == null) {
					local155 = local100.method410(22, arg0, local49, local60, local73, local84, -1);
				} else {
					local155 = new Class2_Sub1_Sub3_Sub4(local73, arg4, arg0, 466, 22, local84, local60, local100.anInt659, local49, true);
				}
				arg7.method523(local112, arg1, local94, arg2, arg3, local126, local155);
				if (local100.aBoolean161 && local100.aBoolean159 && arg6 != null) {
					arg6.method212(arg2, arg1);
				}
			}
		} catch (@Pc(1638) RuntimeException local1638) {
			signlink.reporterror("37476, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1638.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "c", descriptor = "(IIII)I")
	private int method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray4[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray4[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("24285, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAALPTAR", name = "a", descriptor = "(I[BZ[Lclient!KQTHKTBC;III)V")
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class21[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg3 + local7 > 0 && arg3 + local7 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
							arg2[local3].anIntArrayArray7[arg3 + local7][arg0 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(65) Class2_Sub1_Sub4 local65 = new Class2_Sub1_Sub4(arg1, -46859);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						this.method465(arg4, local80 + arg3, arg5, local84 + arg0, local11, local65, 0);
					}
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("10020, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
