import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SSYGWTYM")
public final class Class34 {

	@OriginalMember(owner = "client!SSYGWTYM", name = "j", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!SSYGWTYM", name = "F", descriptor = "Z")
	private static boolean aBoolean167;

	@OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "Z")
	public static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "[I")
	private static final int[] anIntArray146 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!SSYGWTYM", name = "d", descriptor = "[I")
	private static final int[] anIntArray147 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!SSYGWTYM", name = "g", descriptor = "I")
	private static int anInt482 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!SSYGWTYM", name = "h", descriptor = "I")
	private static int anInt483 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!SSYGWTYM", name = "l", descriptor = "[I")
	private static final int[] anIntArray148 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!SSYGWTYM", name = "A", descriptor = "[I")
	private static final int[] anIntArray154 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!SSYGWTYM", name = "B", descriptor = "I")
	public static int anInt488 = 99;

	@OriginalMember(owner = "client!SSYGWTYM", name = "i", descriptor = "I")
	private int anInt484 = -396;

	@OriginalMember(owner = "client!SSYGWTYM", name = "m", descriptor = "I")
	private int anInt486 = -28345;

	@OriginalMember(owner = "client!SSYGWTYM", name = "n", descriptor = "I")
	private int anInt487 = 906;

	@OriginalMember(owner = "client!SSYGWTYM", name = "u", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!SSYGWTYM", name = "v", descriptor = "B")
	private byte aByte19 = 2;

	@OriginalMember(owner = "client!SSYGWTYM", name = "w", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!SSYGWTYM", name = "C", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!SSYGWTYM", name = "D", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!SSYGWTYM", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!SSYGWTYM", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!SSYGWTYM", name = "x", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!SSYGWTYM", name = "y", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!SSYGWTYM", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!SSYGWTYM", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!SSYGWTYM", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!SSYGWTYM", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!SSYGWTYM", name = "p", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!SSYGWTYM", name = "q", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!SSYGWTYM", name = "r", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!SSYGWTYM", name = "s", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!SSYGWTYM", name = "t", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(II)I")
	private static int method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "(II)I")
	private static int method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIII)I")
	private static int method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub1_Sub2.anIntArray118[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "(II)I")
	private static int method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method321(arg0 - 1, arg1 - 1) + method321(arg0 + 1, arg1 - 1) + method321(arg0 - 1, arg1 + 1) + method321(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method321(arg0 - 1, arg1) + method321(arg0 + 1, arg1) + method321(arg0, arg1 - 1) + method321(arg0, arg1 + 1);
		@Pc(59) int local59 = method321(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(Lclient!EMWAMCXW;ILclient!KMIIMWED;)V")
	public static void method328(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18_Sub1 arg2) {
		try {
			if (arg1 == 5) {
				@Pc(7) int local7 = -1;
				while (true) {
					@Pc(10) int local10 = arg0.method111();
					if (local10 == 0) {
						return;
					}
					local7 += local10;
					@Pc(19) Class1 local19 = Class1.method4(local7);
					local19.method7(arg2);
					while (true) {
						@Pc(26) int local26 = arg0.method111();
						if (local26 == 0) {
							break;
						}
						arg0.method97();
					}
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("82839, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(III)I")
	private static int method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method325(local3, local13);
		@Pc(29) int local29 = method325(local3 + 1, local13);
		@Pc(35) int local35 = method325(local3, local13 + 1);
		@Pc(43) int local43 = method325(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method322(local23, local29, local9, arg2);
		@Pc(55) int local55 = method322(local35, local43, local9, arg2);
		return method322(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "(III)Z")
	public static boolean method335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) Class1 local10 = Class1.method4(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local10.method9(arg1);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("20559, " + -164 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "e", descriptor = "(II)I")
	private static int method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method332(arg0 + 45365, arg1 + 91923, 4) + (method332(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method332(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(I[[[ILclient!ZPFBNGWW;IILclient!CAMRNFMB;IIIII)V")
	public static void method339(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg1[arg9][arg0][arg8];
			@Pc(19) int local19 = arg1[arg9][arg0 + 1][arg8];
			@Pc(34) int local34 = arg1[arg9][arg0 + 1][arg8 + 1];
			@Pc(44) int local44 = arg1[arg9][arg0][arg8 + 1];
			@Pc(54) int local54 = local9 + local19 + local34 + local44 >> 2;
			@Pc(57) Class1 local57 = Class1.method4(arg6);
			@Pc(69) int local69 = arg0 + (arg8 << 7) + (arg6 << 14) + 1073741824;
			if (!local57.aBoolean1) {
				local69 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg3 << 6) + arg7);
			@Pc(103) Class2_Sub1_Sub2 local103;
			if (arg7 == 22) {
				if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
					local103 = local57.method5(22, arg3, local9, local19, local34, local44, -1);
				} else {
					local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, 22, local9, arg6, local19, local57.anInt7, (byte) 5, true);
				}
				arg2.method493(arg8, (byte) 9, arg0, local69, local54, local83, local103, arg4);
				if (local57.aBoolean7 && local57.aBoolean1) {
					arg5.method43(arg8, arg0);
				}
			} else {
				@Pc(199) int local199;
				if (arg7 == 10 || arg7 == 11) {
					if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
						local103 = local57.method5(10, arg3, local9, local19, local34, local44, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, 10, local9, arg6, local19, local57.anInt7, (byte) 5, true);
					}
					if (local103 != null) {
						@Pc(186) int local186 = 0;
						if (arg7 == 11) {
							local186 += 256;
						}
						@Pc(202) int local202;
						if (arg3 == 1 || arg3 == 3) {
							local199 = local57.anInt13;
							local202 = local57.anInt8;
						} else {
							local199 = local57.anInt8;
							local202 = local57.anInt13;
						}
						arg2.method497(local54, local83, arg8, local186, local103, local199, local202, arg4, arg0, local69);
					}
					if (local57.aBoolean7) {
						arg5.method42(local57.anInt13, local57.aBoolean6, arg8, arg0, local57.anInt8, arg3);
					}
				} else if (arg7 >= 12) {
					if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
						local103 = local57.method5(arg7, arg3, local9, local19, local34, local44, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, arg7, local9, arg6, local19, local57.anInt7, (byte) 5, true);
					}
					arg2.method497(local54, local83, arg8, 0, local103, 1, 1, arg4, arg0, local69);
					if (local57.aBoolean7) {
						arg5.method42(local57.anInt13, local57.aBoolean6, arg8, arg0, local57.anInt8, arg3);
					}
				} else if (arg7 == 0) {
					if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
						local103 = local57.method5(0, arg3, local9, local19, local34, local44, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, 0, local9, arg6, local19, local57.anInt7, (byte) 5, true);
					}
					arg2.method495(arg4, 0, local54, local69, local103, arg8, null, local83, anIntArray154[arg3], arg0, 49);
					if (local57.aBoolean7) {
						arg5.method41(arg0, arg8, arg7, local57.aBoolean6, arg3);
					}
				} else if (arg7 == 1) {
					if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
						local103 = local57.method5(1, arg3, local9, local19, local34, local44, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, 1, local9, arg6, local19, local57.anInt7, (byte) 5, true);
					}
					arg2.method495(arg4, 0, local54, local69, local103, arg8, null, local83, anIntArray146[arg3], arg0, 49);
					if (local57.aBoolean7) {
						arg5.method41(arg0, arg8, arg7, local57.aBoolean6, arg3);
					}
				} else {
					@Pc(445) int local445;
					@Pc(474) Class2_Sub1_Sub2 local474;
					if (arg7 == 2) {
						local445 = arg3 + 1 & 0x3;
						@Pc(464) Class2_Sub1_Sub2 local464;
						if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
							local464 = local57.method5(2, arg3 + 4, local9, local19, local34, local44, -1);
							local474 = local57.method5(2, local445, local9, local19, local34, local44, -1);
						} else {
							local464 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3 + 4, 2, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							local474 = new Class2_Sub1_Sub2_Sub4(local34, local44, local445, 2, local9, arg6, local19, local57.anInt7, (byte) 5, true);
						}
						arg2.method495(arg4, anIntArray154[local445], local54, local69, local464, arg8, local474, local83, anIntArray154[arg3], arg0, 49);
						if (local57.aBoolean7) {
							arg5.method41(arg0, arg8, arg7, local57.aBoolean6, arg3);
						}
					} else if (arg7 == 3) {
						if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
							local103 = local57.method5(3, arg3, local9, local19, local34, local44, -1);
						} else {
							local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, 3, local9, arg6, local19, local57.anInt7, (byte) 5, true);
						}
						arg2.method495(arg4, 0, local54, local69, local103, arg8, null, local83, anIntArray146[arg3], arg0, 49);
						if (local57.aBoolean7) {
							arg5.method41(arg0, arg8, arg7, local57.aBoolean6, arg3);
						}
					} else if (arg7 == 9) {
						if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
							local103 = local57.method5(arg7, arg3, local9, local19, local34, local44, -1);
						} else {
							local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, arg3, arg7, local9, arg6, local19, local57.anInt7, (byte) 5, true);
						}
						arg2.method497(local54, local83, arg8, 0, local103, 1, 1, arg4, arg0, local69);
						if (local57.aBoolean7) {
							arg5.method42(local57.anInt13, local57.aBoolean6, arg8, arg0, local57.anInt8, arg3);
						}
					} else {
						if (local57.aBoolean12) {
							if (arg3 == 1) {
								local445 = local44;
								local44 = local34;
								local34 = local19;
								local19 = local9;
								local9 = local445;
							} else if (arg3 == 2) {
								local445 = local44;
								local44 = local19;
								local19 = local445;
								local445 = local34;
								local34 = local9;
								local9 = local445;
							} else if (arg3 == 3) {
								local445 = local44;
								local44 = local9;
								local9 = local19;
								local19 = local34;
								local34 = local445;
							}
						}
						if (arg7 == 4) {
							if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
								local103 = local57.method5(4, 0, local9, local19, local34, local44, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, 0, 4, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							}
							arg2.method496(local103, arg4, local69, arg0, 0, 0, local83, local54, arg3 * 512, anIntArray154[arg3], arg8);
						} else if (arg7 == 5) {
							local445 = 16;
							local199 = arg2.method513(arg4, arg0, arg8);
							if (local199 > 0) {
								local445 = Class1.method4(local199 >> 14 & 0x7FFF).anInt17;
							}
							if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
								local474 = local57.method5(4, 0, local9, local19, local34, local44, -1);
							} else {
								local474 = new Class2_Sub1_Sub2_Sub4(local34, local44, 0, 4, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							}
							arg2.method496(local474, arg4, local69, arg0, anIntArray147[arg3] * local445, anIntArray148[arg3] * local445, local83, local54, arg3 * 512, anIntArray154[arg3], arg8);
						} else if (arg7 == 6) {
							if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
								local103 = local57.method5(4, 0, local9, local19, local34, local44, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, 0, 4, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							}
							arg2.method496(local103, arg4, local69, arg0, 0, 0, local83, local54, arg3, 256, arg8);
						} else if (arg7 == 7) {
							if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
								local103 = local57.method5(4, 0, local9, local19, local34, local44, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, 0, 4, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							}
							arg2.method496(local103, arg4, local69, arg0, 0, 0, local83, local54, arg3, 512, arg8);
						} else if (arg7 == 8) {
							if (local57.anInt7 == -1 && local57.anIntArray2 == null) {
								local103 = local57.method5(4, 0, local9, local19, local34, local44, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub4(local34, local44, 0, 4, local9, arg6, local19, local57.anInt7, (byte) 5, true);
							}
							arg2.method496(local103, arg4, local69, arg0, 0, 0, local83, local54, arg3, 768, arg8);
						}
					}
				}
			}
		} catch (@Pc(1013) RuntimeException local1013) {
			signlink.reporterror("18654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1013.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(I[BIZ)Z")
	public static boolean method340(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class2_Sub1_Sub3 local9 = new Class2_Sub1_Sub3(arg1, true);
			@Pc(11) int local11 = -1;
			if (!arg3) {
				aBoolean167 = !aBoolean167;
			}
			label60: while (true) {
				@Pc(22) int local22 = local9.method111();
				if (local22 == 0) {
					return local3;
				}
				local11 += local22;
				@Pc(30) int local30 = 0;
				@Pc(32) boolean local32 = false;
				while (true) {
					@Pc(37) int local37;
					while (!local32) {
						local37 = local9.method111();
						if (local37 == 0) {
							continue label60;
						}
						local30 += local37 - 1;
						@Pc(59) int local59 = local30 & 0x3F;
						@Pc(65) int local65 = local30 >> 6 & 0x3F;
						@Pc(70) int local70 = local9.method97() >> 2;
						@Pc(74) int local74 = local65 + arg0;
						@Pc(78) int local78 = local59 + arg2;
						if (local74 > 0 && local78 > 0 && local74 < 103 && local78 < 103) {
							@Pc(91) Class1 local91 = Class1.method4(local11);
							if (local70 != 22 || !aBoolean164 || local91.aBoolean1 || local91.aBoolean4) {
								local3 &= local91.method6();
								local32 = true;
							}
						}
					}
					local37 = local9.method111();
					if (local37 == 0) {
						break;
					}
					local9.method97();
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("96637, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "<init>", descriptor = "([[[IIII[[[B)V")
	public Class34(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			anInt488 = 99;
			this.anInt489 = arg1;
			this.anInt490 = arg2;
			this.anIntArrayArrayArray3 = arg0;
			this.aByteArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt489][this.anInt490];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt489][this.anInt490];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt489][this.anInt490];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt489][this.anInt490];
			this.anIntArrayArrayArray4 = new int[4][this.anInt489 + 1][this.anInt490 + 1];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt489 + 1][this.anInt490 + 1];
			this.anIntArrayArray19 = new int[this.anInt489 + 1][this.anInt490 + 1];
			this.anIntArray149 = new int[this.anInt490];
			this.anIntArray150 = new int[this.anInt490];
			this.anIntArray151 = new int[this.anInt490];
			this.anIntArray152 = new int[this.anInt490];
			this.anIntArray153 = new int[this.anInt490];
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("26773, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIII)V")
	public void method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg3; local7++) {
				for (@Pc(11) int local11 = arg4; local11 <= arg4 + arg2; local11++) {
					if (local11 >= 0 && local11 < this.anInt489 && local7 >= 0 && local7 < this.anInt490) {
						this.aByteArrayArrayArray2[0][local11][local7] = 127;
						if (local11 == arg4 && local11 > 0) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11 - 1][local7];
						}
						if (local11 == arg4 + arg2 && local11 < this.anInt489 - 1) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11 + 1][local7];
						}
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11][local7 - 1];
						}
						if (local7 == arg0 + arg3 && local7 < this.anInt490 - 1) {
							this.anIntArrayArrayArray3[0][local11][local7] = this.anIntArrayArrayArray3[0][local11][local7 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("4718, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IBII)V")
	public void method323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) int local17;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				for (local17 = 0; local17 < 8; local17++) {
					this.anIntArrayArrayArray3[arg0][arg2 + local13][arg1 + local17] = 0;
				}
			}
			if (arg2 > 0) {
				for (local17 = 1; local17 < 8; local17++) {
					this.anIntArrayArrayArray3[arg0][arg2][arg1 + local17] = this.anIntArrayArrayArray3[arg0][arg2 - 1][arg1 + local17];
				}
			}
			if (arg1 > 0) {
				for (local17 = 1; local17 < 8; local17++) {
					this.anIntArrayArrayArray3[arg0][arg2 + local17][arg1] = this.anIntArrayArrayArray3[arg0][arg2 + local17][arg1 - 1];
				}
			}
			if (arg2 > 0 && this.anIntArrayArrayArray3[arg0][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray3[arg0][arg2][arg1] = this.anIntArrayArrayArray3[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray3[arg0][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray3[arg0][arg2][arg1] = this.anIntArrayArrayArray3[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray3[arg0][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray3[arg0][arg2][arg1] = this.anIntArrayArrayArray3[arg0][arg2 - 1][arg1 - 1];
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("55714, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIILclient!EMWAMCXW;III)V")
	private void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg3 != -28345) {
				this.aBoolean165 = !this.aBoolean165;
			}
			@Pc(34) int local34;
			if (arg5 >= 0 && arg5 < 104 && arg0 >= 0 && arg0 < 104) {
				this.aByteArrayArrayArray1[arg7][arg5][arg0] = 0;
				while (true) {
					local34 = arg4.method97();
					if (local34 == 0) {
						if (arg7 == 0) {
							this.anIntArrayArrayArray3[0][arg5][arg0] = -method336(arg5 + arg1 + 932731, arg0 + 556238 + arg6) * 8;
							return;
						} else {
							this.anIntArrayArrayArray3[arg7][arg5][arg0] = this.anIntArrayArrayArray3[arg7 - 1][arg5][arg0] - 240;
							return;
						}
					}
					if (local34 == 1) {
						@Pc(88) int local88 = arg4.method97();
						if (local88 == 1) {
							local88 = 0;
						}
						if (arg7 == 0) {
							this.anIntArrayArrayArray3[0][arg5][arg0] = -local88 * 8;
							return;
						}
						this.anIntArrayArrayArray3[arg7][arg5][arg0] = this.anIntArrayArrayArray3[arg7 - 1][arg5][arg0] - local88 * 8;
						return;
					}
					if (local34 <= 49) {
						this.aByteArrayArrayArray4[arg7][arg5][arg0] = arg4.method98();
						this.aByteArrayArrayArray5[arg7][arg5][arg0] = (byte) ((local34 - 2) / 4);
						this.aByteArrayArrayArray3[arg7][arg5][arg0] = (byte) (local34 + arg2 - 2 & 0x3);
					} else if (local34 <= 81) {
						this.aByteArrayArrayArray1[arg7][arg5][arg0] = (byte) (local34 - 49);
					} else {
						this.aByteArrayArrayArray6[arg7][arg5][arg0] = (byte) (local34 - 81);
					}
				}
			} else {
				while (true) {
					local34 = arg4.method97();
					if (local34 == 0) {
						return;
					}
					if (local34 == 1) {
						arg4.method97();
						return;
					}
					if (local34 <= 49) {
						arg4.method97();
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("47765, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "([Lclient!CAMRNFMB;IIII[BZ)V")
	public void method326(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		try {
			@Pc(14) int local14;
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < 64; local10++) {
					for (local14 = 0; local14 < 64; local14++) {
						if (arg3 + local10 > 0 && arg3 + local10 < 103 && arg1 + local14 > 0 && arg1 + local14 < 103) {
							arg0[local6].anIntArrayArray4[arg3 + local10][arg1 + local14] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class2_Sub1_Sub3 local68 = new Class2_Sub1_Sub3(arg5, true);
			for (local14 = 0; local14 < 4; local14++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method324(local78 + arg1, arg2, 0, this.anInt486, local68, local74 + arg3, arg4, local14);
					}
				}
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("46639, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIZ)I")
	private int method327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("95399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IZI[Lclient!CAMRNFMB;[BLclient!ZPFBNGWW;)V")
	public void method329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class47 arg4) {
		try {
			@Pc(10) Class2_Sub1_Sub3 local10 = new Class2_Sub1_Sub3(arg3, true);
			@Pc(12) int local12 = -1;
			while (true) {
				@Pc(15) int local15 = local10.method111();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local10.method111();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local10.method97();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					@Pc(63) int local63 = local44 + arg0;
					@Pc(67) int local67 = local38 + arg1;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						@Pc(79) int local79 = local48;
						if ((this.aByteArrayArrayArray1[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						@Pc(94) Class5 local94 = null;
						if (local79 >= 0) {
							local94 = arg2[local79];
						}
						this.method338(local55, local59, local67, local48, local63, local12, arg4, local94);
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("61123, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "([Lclient!CAMRNFMB;Lclient!ZPFBNGWW;B)V")
	public void method330(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) byte arg2) {
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
								arg0[local27].method43(local11, local7);
							}
						}
					}
				}
			}
			anInt482 += (int) (Math.random() * 5.0D) - 2;
			if (arg2 == 2) {
				if (anInt482 < -8) {
					anInt482 = -8;
				}
				if (anInt482 > 8) {
					anInt482 = 8;
				}
				anInt483 += (int) (Math.random() * 5.0D) - 2;
				if (anInt483 < -16) {
					anInt483 = -16;
				}
				if (anInt483 > 16) {
					anInt483 = 16;
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
					for (local145 = 1; local145 < this.anInt490 - 1; local145++) {
						for (local149 = 1; local149 < this.anInt489 - 1; local149++) {
							local173 = this.anIntArrayArrayArray3[local7][local149 + 1][local145] - this.anIntArrayArrayArray3[local7][local149 - 1][local145];
							local195 = this.anIntArrayArrayArray3[local7][local149][local145 + 1] - this.anIntArrayArrayArray3[local7][local149][local145 - 1];
							local208 = (int) Math.sqrt((double) (local173 * local173 + local195 * local195 + 65536));
							local214 = (local173 << 8) / local208;
							local218 = 65536 / local208;
							local224 = (local195 << 8) / local208;
							local240 = (local214 * -50 + local218 * -10 + local224 * -50) / local143 + 96;
							local288 = (local112[local149 - 1][local145] >> 2) + (local112[local149 + 1][local145] >> 3) + (local112[local149][local145 - 1] >> 2) + (local112[local149][local145 + 1] >> 3) + (local112[local149][local145] >> 1);
							this.anIntArrayArray19[local149][local145] = local240 - local288;
						}
					}
					for (local149 = 0; local149 < this.anInt490; local149++) {
						this.anIntArray149[local149] = 0;
						this.anIntArray150[local149] = 0;
						this.anIntArray151[local149] = 0;
						this.anIntArray152[local149] = 0;
						this.anIntArray153[local149] = 0;
					}
					for (local173 = -5; local173 < this.anInt489 + 5; local173++) {
						for (local195 = 0; local195 < this.anInt490; local195++) {
							local208 = local173 + 5;
							@Pc(423) int local423;
							if (local208 >= 0 && local208 < this.anInt489) {
								local214 = this.aByteArrayArrayArray6[local7][local208][local195] & 0xFF;
								if (local214 > 0) {
									@Pc(382) Class32 local382 = Class32.aClass32Array1[local214 - 1];
									this.anIntArray149[local195] += local382.anInt469;
									this.anIntArray150[local195] += local382.anInt467;
									this.anIntArray151[local195] += local382.anInt468;
									this.anIntArray152[local195] += local382.anInt470;
									local423 = this.anIntArray153[local195]++;
								}
							}
							local214 = local173 - 5;
							if (local214 >= 0 && local214 < this.anInt489) {
								local218 = this.aByteArrayArrayArray6[local7][local214][local195] & 0xFF;
								if (local218 > 0) {
									@Pc(455) Class32 local455 = Class32.aClass32Array1[local218 - 1];
									this.anIntArray149[local195] -= local455.anInt469;
									this.anIntArray150[local195] -= local455.anInt467;
									this.anIntArray151[local195] -= local455.anInt468;
									this.anIntArray152[local195] -= local455.anInt470;
									local423 = this.anIntArray153[local195]--;
								}
							}
						}
						if (local173 >= 1 && local173 < this.anInt489 - 1) {
							local208 = 0;
							local214 = 0;
							local218 = 0;
							local224 = 0;
							local240 = 0;
							for (local288 = -5; local288 < this.anInt490 + 5; local288++) {
								@Pc(531) int local531 = local288 + 5;
								if (local531 >= 0 && local531 < this.anInt490) {
									local208 += this.anIntArray149[local531];
									local214 += this.anIntArray150[local531];
									local218 += this.anIntArray151[local531];
									local224 += this.anIntArray152[local531];
									local240 += this.anIntArray153[local531];
								}
								@Pc(576) int local576 = local288 - 5;
								if (local576 >= 0 && local576 < this.anInt490) {
									local208 -= this.anIntArray149[local576];
									local214 -= this.anIntArray150[local576];
									local218 -= this.anIntArray151[local576];
									local224 -= this.anIntArray152[local576];
									local240 -= this.anIntArray153[local576];
								}
								if (local288 >= 1 && local288 < this.anInt490 - 1 && (!aBoolean164 || (this.aByteArrayArrayArray1[0][local173][local288] & 0x2) != 0 || (this.aByteArrayArrayArray1[local7][local173][local288] & 0x10) == 0 && this.method327(local288, local7, local173) == anInt485)) {
									if (local7 < anInt488) {
										anInt488 = local7;
									}
									@Pc(675) int local675 = this.aByteArrayArrayArray6[local7][local173][local288] & 0xFF;
									@Pc(686) int local686 = this.aByteArrayArrayArray4[local7][local173][local288] & 0xFF;
									if (local675 > 0 || local686 > 0) {
										@Pc(699) int local699 = this.anIntArrayArrayArray3[local7][local173][local288];
										@Pc(710) int local710 = this.anIntArrayArrayArray3[local7][local173 + 1][local288];
										@Pc(723) int local723 = this.anIntArrayArrayArray3[local7][local173 + 1][local288 + 1];
										@Pc(734) int local734 = this.anIntArrayArrayArray3[local7][local173][local288 + 1];
										@Pc(741) int local741 = this.anIntArrayArray19[local173][local288];
										@Pc(750) int local750 = this.anIntArrayArray19[local173 + 1][local288];
										@Pc(761) int local761 = this.anIntArrayArray19[local173 + 1][local288 + 1];
										@Pc(770) int local770 = this.anIntArrayArray19[local173][local288 + 1];
										@Pc(772) int local772 = -1;
										@Pc(774) int local774 = -1;
										@Pc(782) int local782;
										@Pc(786) int local786;
										if (local675 > 0) {
											local782 = local208 * 256 / local224;
											local786 = local214 / local240;
											@Pc(790) int local790 = local218 / local240;
											local772 = this.method334(local782, local786, local790);
											@Pc(802) int local802 = local782 + anInt482 & 0xFF;
											local790 += anInt483;
											if (local790 < 0) {
												local790 = 0;
											} else if (local790 > 255) {
												local790 = 255;
											}
											local774 = this.method334(local802, local786, local790);
										}
										if (local7 > 0) {
											@Pc(827) boolean local827 = true;
											if (local675 == 0 && this.aByteArrayArrayArray5[local7][local173][local288] != 0) {
												local827 = false;
											}
											if (local686 > 0 && !Class32.aClass32Array1[local686 - 1].aBoolean163) {
												local827 = false;
											}
											if (local827 && local699 == local710 && local699 == local723 && local699 == local734) {
												this.anIntArrayArrayArray4[local7][local173][local288] |= 0x924;
											}
										}
										local782 = 0;
										if (local772 != -1) {
											local782 = Class2_Sub1_Sub1_Sub2.anIntArray122[method319(local774, 96)];
										}
										if (local686 == 0) {
											arg1.method492(local7, local173, local288, 0, 0, -1, local699, local710, local723, local734, method319(local772, local741), method319(local772, local750), method319(local772, local761), method319(local772, local770), 0, 0, 0, 0, local782, 0);
										} else {
											local786 = this.aByteArrayArrayArray5[local7][local173][local288] + 1;
											@Pc(939) byte local939 = this.aByteArrayArrayArray3[local7][local173][local288];
											@Pc(945) Class32 local945 = Class32.aClass32Array1[local686 - 1];
											@Pc(948) int local948 = local945.anInt465;
											@Pc(956) int local956;
											@Pc(954) int local954;
											if (local948 >= 0) {
												local954 = Class2_Sub1_Sub1_Sub2.method260(local948);
												local956 = -1;
											} else if (local945.anInt464 == 16711935) {
												local956 = -2;
												local948 = -1;
												local954 = Class2_Sub1_Sub1_Sub2.anIntArray122[this.method333(local945.anInt471, 96)];
											} else {
												local956 = this.method334(local945.anInt466, local945.anInt467, local945.anInt468);
												local954 = Class2_Sub1_Sub1_Sub2.anIntArray122[this.method333(local945.anInt471, 96)];
											}
											arg1.method492(local7, local173, local288, local786, local939, local948, local699, local710, local723, local734, method319(local772, local741), method319(local772, local750), method319(local772, local761), method319(local772, local770), this.method333(local956, local741), this.method333(local956, local750), this.method333(local956, local761), this.method333(local956, local770), local782, local954);
										}
									}
								}
							}
						}
					}
					for (local195 = 1; local195 < this.anInt490 - 1; local195++) {
						for (local208 = 1; local208 < this.anInt489 - 1; local208++) {
							arg1.method491(local7, local208, local195, this.method327(local195, local7, local208));
						}
					}
				}
				arg1.method518(this.aByte19);
				for (local11 = 0; local11 < this.anInt489; local11++) {
					for (local27 = 0; local27 < this.anInt490; local27++) {
						if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
							arg1.method489(this.anInt484, local27, local11);
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
						for (local137 = 0; local137 <= this.anInt490; local137++) {
							for (local143 = 0; local143 <= this.anInt489; local143++) {
								if ((this.anIntArrayArrayArray4[local1155][local143][local137] & local27) != 0) {
									local145 = local137;
									local149 = local137;
									local173 = local1155;
									local195 = local1155;
									while (local145 > 0 && (this.anIntArrayArrayArray4[local1155][local143][local145 - 1] & local27) != 0) {
										local145--;
									}
									while (local149 < this.anInt490 && (this.anIntArrayArrayArray4[local1155][local143][local149 + 1] & local27) != 0) {
										local149++;
									}
									label332: while (local173 > 0) {
										for (local208 = local145; local208 <= local149; local208++) {
											if ((this.anIntArrayArrayArray4[local173 - 1][local143][local208] & local27) == 0) {
												break label332;
											}
										}
										local173--;
									}
									label321: while (local195 < local1137) {
										for (local208 = local145; local208 <= local149; local208++) {
											if ((this.anIntArrayArrayArray4[local195 + 1][local143][local208] & local27) == 0) {
												break label321;
											}
										}
										local195++;
									}
									local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
									if (local208 >= 8) {
										local218 = this.anIntArrayArrayArray3[local195][local143][local145] - 240;
										local224 = this.anIntArrayArrayArray3[local173][local143][local145];
										Class47.method490(local218, local149 * 128 + 128, local145 * 128, local143 * 128, local143 * 128, 1, local1137, local224);
										for (local240 = local173; local240 <= local195; local240++) {
											for (local288 = local145; local288 <= local149; local288++) {
												this.anIntArrayArrayArray4[local240][local143][local288] &= ~local27;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray4[local1155][local143][local137] & local1133) != 0) {
									local145 = local143;
									local149 = local143;
									local173 = local1155;
									local195 = local1155;
									while (local145 > 0 && (this.anIntArrayArrayArray4[local1155][local145 - 1][local137] & local1133) != 0) {
										local145--;
									}
									while (local149 < this.anInt489 && (this.anIntArrayArrayArray4[local1155][local149 + 1][local137] & local1133) != 0) {
										local149++;
									}
									label385: while (local173 > 0) {
										for (local208 = local145; local208 <= local149; local208++) {
											if ((this.anIntArrayArrayArray4[local173 - 1][local208][local137] & local1133) == 0) {
												break label385;
											}
										}
										local173--;
									}
									label374: while (local195 < local1137) {
										for (local208 = local145; local208 <= local149; local208++) {
											if ((this.anIntArrayArrayArray4[local195 + 1][local208][local137] & local1133) == 0) {
												break label374;
											}
										}
										local195++;
									}
									local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
									if (local208 >= 8) {
										local218 = this.anIntArrayArrayArray3[local195][local145][local137] - 240;
										local224 = this.anIntArrayArrayArray3[local173][local145][local137];
										Class47.method490(local218, local137 * 128, local137 * 128, local145 * 128, local149 * 128 + 128, 2, local1137, local224);
										for (local240 = local173; local240 <= local195; local240++) {
											for (local288 = local145; local288 <= local149; local288++) {
												this.anIntArrayArrayArray4[local240][local288][local137] &= ~local1133;
											}
										}
									}
								}
								if ((this.anIntArrayArrayArray4[local1155][local143][local137] & local1135) != 0) {
									local145 = local143;
									local149 = local143;
									local173 = local137;
									local195 = local137;
									while (local173 > 0 && (this.anIntArrayArrayArray4[local1155][local143][local173 - 1] & local1135) != 0) {
										local173--;
									}
									while (local195 < this.anInt490 && (this.anIntArrayArrayArray4[local1155][local143][local195 + 1] & local1135) != 0) {
										local195++;
									}
									label438: while (local145 > 0) {
										for (local208 = local173; local208 <= local195; local208++) {
											if ((this.anIntArrayArrayArray4[local1155][local145 - 1][local208] & local1135) == 0) {
												break label438;
											}
										}
										local145--;
									}
									label427: while (local149 < this.anInt489) {
										for (local208 = local173; local208 <= local195; local208++) {
											if ((this.anIntArrayArrayArray4[local1155][local149 + 1][local208] & local1135) == 0) {
												break label427;
											}
										}
										local149++;
									}
									if ((local149 + 1 - local145) * (local195 + 1 - local173) >= 4) {
										local208 = this.anIntArrayArrayArray3[local1155][local145][local173];
										Class47.method490(local208, local195 * 128 + 128, local173 * 128, local145 * 128, local149 * 128 + 128, 4, local1137, local208);
										for (local214 = local145; local214 <= local149; local214++) {
											for (local218 = local173; local218 <= local195; local218++) {
												this.anIntArrayArrayArray4[local1155][local214][local218] &= ~local1135;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1770) RuntimeException local1770) {
			signlink.reporterror("18746, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1770.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(II[Lclient!CAMRNFMB;I[BLclient!ZPFBNGWW;IIIII)V")
	public void method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class47 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class2_Sub1_Sub3 local7 = new Class2_Sub1_Sub3(arg4, true);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method111();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method111();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method97();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg9 && local51 >= arg1 && local51 < arg1 + 8 && local45 >= arg6 && local45 < arg6 + 8) {
						@Pc(88) Class1 local88 = Class1.method4(local19);
						@Pc(105) int local105 = arg7 + Class12.method141(local66, arg0, local88.anInt8, local51 & 0x7, local45 & 0x7, local88.anInt13);
						@Pc(122) int local122 = arg3 + Class12.method142(local51 & 0x7, local45 & 0x7, arg0, local66, local88.anInt13, local88.anInt8);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg8;
							if ((this.aByteArrayArrayArray1[1][local105][local122] & 0x2) == 2) {
								local134 = arg8 - 1;
							}
							@Pc(149) Class5 local149 = null;
							if (local134 >= 0) {
								local149 = arg2[local134];
							}
							this.method338(local62, local66 + arg0 & 0x3, local122, arg8, local105, local19, arg5, local149);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("61378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -673 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "d", descriptor = "(II)I")
	private int method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "(III)I")
	private int method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIII[BIIII[Lclient!CAMRNFMB;)V")
	public void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5[] arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg2 + local3 > 0 && arg2 + local3 < 103 && arg7 + local7 > 0 && arg7 + local7 < 103) {
						arg8[arg5].anIntArrayArray4[arg2 + local3][arg7 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class2_Sub1_Sub3 local57 = new Class2_Sub1_Sub3(arg4, true);
			for (@Pc(63) int local63 = 0; local63 < 4; local63++) {
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						if (local63 == arg3 && local67 >= arg0 && local67 < arg0 + 8 && local71 >= arg1 && local71 < arg1 + 8) {
							this.method324(arg7 + Class12.method140(local67 & 0x7, arg6, local71 & 0x7), 0, arg6, this.anInt486, local57, arg2 + Class12.method139(local67 & 0x7, (byte) 9, arg6, local71 & 0x7), 0, arg5);
						} else {
							this.method324(-1, 0, 0, this.anInt486, local57, -1, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("60444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 7 + ", " + arg7 + ", " + arg8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIIIIILclient!ZPFBNGWW;Lclient!CAMRNFMB;)V")
	private void method338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class47 arg6, @OriginalArg(8) Class5 arg7) {
		try {
			if (aBoolean164 && (this.aByteArrayArrayArray1[0][arg4][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray1[arg3][arg4][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method327(arg2, arg3, arg4) != anInt485) {
					return;
				}
			}
			if (arg3 < anInt488) {
				anInt488 = arg3;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray3[arg3][arg4][arg2];
			@Pc(60) int local60 = this.anIntArrayArrayArray3[arg3][arg4 + 1][arg2];
			@Pc(73) int local73 = this.anIntArrayArrayArray3[arg3][arg4 + 1][arg2 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray3[arg3][arg4][arg2 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(103) Class1 local103 = Class1.method4(arg5);
			@Pc(115) int local115 = arg4 + (arg2 << 7) + (arg5 << 14) + 1073741824;
			if (!local103.aBoolean1) {
				local115 += Integer.MIN_VALUE;
			}
			@Pc(129) byte local129 = (byte) ((arg1 << 6) + arg0);
			@Pc(158) Class2_Sub1_Sub2 local158;
			if (arg0 != 22) {
				@Pc(256) int local256;
				if (arg0 == 10 || arg0 == 11) {
					if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
						local158 = local103.method5(10, arg1, local49, local60, local73, local84, -1);
					} else {
						local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, 10, local49, arg5, local60, local103.anInt7, (byte) 5, true);
					}
					if (local158 != null) {
						@Pc(243) int local243 = 0;
						if (arg0 == 11) {
							local243 += 256;
						}
						@Pc(259) int local259;
						if (arg1 == 1 || arg1 == 3) {
							local256 = local103.anInt13;
							local259 = local103.anInt8;
						} else {
							local256 = local103.anInt8;
							local259 = local103.anInt13;
						}
						if (arg6.method497(local94, local129, arg2, local243, local158, local256, local259, arg3, arg4, local115) && local103.aBoolean2) {
							@Pc(290) Class2_Sub1_Sub2_Sub2 local290;
							if (local158 instanceof Class2_Sub1_Sub2_Sub2) {
								local290 = (Class2_Sub1_Sub2_Sub2) local158;
							} else {
								local290 = local103.method5(10, arg1, local49, local60, local73, local84, -1);
							}
							if (local290 != null) {
								for (@Pc(306) int local306 = 0; local306 <= local256; local306++) {
									for (@Pc(310) int local310 = 0; local310 <= local259; local310++) {
										@Pc(317) int local317 = local290.anInt160 / 4;
										if (local317 > 30) {
											local317 = 30;
										}
										if (local317 > this.aByteArrayArrayArray2[arg3][arg4 + local306][arg2 + local310]) {
											this.aByteArrayArrayArray2[arg3][arg4 + local306][arg2 + local310] = (byte) local317;
										}
									}
								}
							}
						}
					}
					if (local103.aBoolean7 && arg7 != null) {
						arg7.method42(local103.anInt13, local103.aBoolean6, arg2, arg4, local103.anInt8, arg1);
					}
				} else if (arg0 >= 12) {
					if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
						local158 = local103.method5(arg0, arg1, local49, local60, local73, local84, -1);
					} else {
						local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, arg0, local49, arg5, local60, local103.anInt7, (byte) 5, true);
					}
					arg6.method497(local94, local129, arg2, 0, local158, 1, 1, arg3, arg4, local115);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x924;
					}
					if (local103.aBoolean7 && arg7 != null) {
						arg7.method42(local103.anInt13, local103.aBoolean6, arg2, arg4, local103.anInt8, arg1);
					}
				} else if (arg0 == 0) {
					if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
						local158 = local103.method5(0, arg1, local49, local60, local73, local84, -1);
					} else {
						local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, 0, local49, arg5, local60, local103.anInt7, (byte) 5, true);
					}
					arg6.method495(arg3, 0, local94, local115, local158, arg2, null, local129, anIntArray154[arg1], arg4, 49);
					if (arg1 == 0) {
						if (local103.aBoolean2) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
						}
						if (local103.aBoolean8) {
							this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x249;
						}
					} else if (arg1 == 1) {
						if (local103.aBoolean2) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local103.aBoolean8) {
							this.anIntArrayArrayArray4[arg3][arg4][arg2 + 1] |= 0x492;
						}
					} else if (arg1 == 2) {
						if (local103.aBoolean2) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local103.aBoolean8) {
							this.anIntArrayArrayArray4[arg3][arg4 + 1][arg2] |= 0x249;
						}
					} else if (arg1 == 3) {
						if (local103.aBoolean2) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
						}
						if (local103.aBoolean8) {
							this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x492;
						}
					}
					if (local103.aBoolean7 && arg7 != null) {
						arg7.method41(arg4, arg2, arg0, local103.aBoolean6, arg1);
					}
					if (local103.anInt17 != 16) {
						arg6.method503(local103.anInt17, arg2, arg4, arg3);
					}
				} else if (arg0 == 1) {
					if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
						local158 = local103.method5(1, arg1, local49, local60, local73, local84, -1);
					} else {
						local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, 1, local49, arg5, local60, local103.anInt7, (byte) 5, true);
					}
					arg6.method495(arg3, 0, local94, local115, local158, arg2, null, local129, anIntArray146[arg1], arg4, 49);
					if (local103.aBoolean2) {
						if (arg1 == 0) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
						} else if (arg1 == 1) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
						} else if (arg1 == 2) {
							this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
						} else if (arg1 == 3) {
							this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
						}
					}
					if (local103.aBoolean7 && arg7 != null) {
						arg7.method41(arg4, arg2, arg0, local103.aBoolean6, arg1);
					}
				} else {
					@Pc(867) int local867;
					@Pc(896) Class2_Sub1_Sub2 local896;
					if (arg0 == 2) {
						local867 = arg1 + 1 & 0x3;
						@Pc(886) Class2_Sub1_Sub2 local886;
						if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
							local886 = local103.method5(2, arg1 + 4, local49, local60, local73, local84, -1);
							local896 = local103.method5(2, local867, local49, local60, local73, local84, -1);
						} else {
							local886 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1 + 4, 2, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							local896 = new Class2_Sub1_Sub2_Sub4(local73, local84, local867, 2, local49, arg5, local60, local103.anInt7, (byte) 5, true);
						}
						arg6.method495(arg3, anIntArray154[local867], local94, local115, local886, arg2, local896, local129, anIntArray154[arg1], arg4, 49);
						if (local103.aBoolean8) {
							if (arg1 == 0) {
								this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg4][arg2 + 1] |= 0x492;
							} else if (arg1 == 1) {
								this.anIntArrayArrayArray4[arg3][arg4][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg4 + 1][arg2] |= 0x249;
							} else if (arg1 == 2) {
								this.anIntArrayArrayArray4[arg3][arg4 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x492;
							} else if (arg1 == 3) {
								this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x492;
								this.anIntArrayArrayArray4[arg3][arg4][arg2] |= 0x249;
							}
						}
						if (local103.aBoolean7 && arg7 != null) {
							arg7.method41(arg4, arg2, arg0, local103.aBoolean6, arg1);
						}
						if (local103.anInt17 != 16) {
							arg6.method503(local103.anInt17, arg2, arg4, arg3);
						}
					} else if (arg0 == 3) {
						if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
							local158 = local103.method5(3, arg1, local49, local60, local73, local84, -1);
						} else {
							local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, 3, local49, arg5, local60, local103.anInt7, (byte) 5, true);
						}
						arg6.method495(arg3, 0, local94, local115, local158, arg2, null, local129, anIntArray146[arg1], arg4, 49);
						if (local103.aBoolean2) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray2[arg3][arg4][arg2 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray2[arg3][arg4 + 1][arg2] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray2[arg3][arg4][arg2] = 50;
							}
						}
						if (local103.aBoolean7 && arg7 != null) {
							arg7.method41(arg4, arg2, arg0, local103.aBoolean6, arg1);
						}
					} else if (arg0 == 9) {
						if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
							local158 = local103.method5(arg0, arg1, local49, local60, local73, local84, -1);
						} else {
							local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, arg0, local49, arg5, local60, local103.anInt7, (byte) 5, true);
						}
						arg6.method497(local94, local129, arg2, 0, local158, 1, 1, arg3, arg4, local115);
						if (local103.aBoolean7 && arg7 != null) {
							arg7.method42(local103.anInt13, local103.aBoolean6, arg2, arg4, local103.anInt8, arg1);
						}
					} else {
						if (local103.aBoolean12) {
							if (arg1 == 1) {
								local867 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local867;
							} else if (arg1 == 2) {
								local867 = local84;
								local84 = local60;
								local60 = local867;
								local867 = local73;
								local73 = local49;
								local49 = local867;
							} else if (arg1 == 3) {
								local867 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local867;
							}
						}
						if (arg0 == 4) {
							if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
								local158 = local103.method5(4, 0, local49, local60, local73, local84, -1);
							} else {
								local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, 0, 4, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							}
							arg6.method496(local158, arg3, local115, arg4, 0, 0, local129, local94, arg1 * 512, anIntArray154[arg1], arg2);
						} else if (arg0 == 5) {
							local867 = 16;
							local256 = arg6.method513(arg3, arg4, arg2);
							if (local256 > 0) {
								local867 = Class1.method4(local256 >> 14 & 0x7FFF).anInt17;
							}
							if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
								local896 = local103.method5(4, 0, local49, local60, local73, local84, -1);
							} else {
								local896 = new Class2_Sub1_Sub2_Sub4(local73, local84, 0, 4, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							}
							arg6.method496(local896, arg3, local115, arg4, anIntArray147[arg1] * local867, anIntArray148[arg1] * local867, local129, local94, arg1 * 512, anIntArray154[arg1], arg2);
						} else if (arg0 == 6) {
							if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
								local158 = local103.method5(4, 0, local49, local60, local73, local84, -1);
							} else {
								local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, 0, 4, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							}
							arg6.method496(local158, arg3, local115, arg4, 0, 0, local129, local94, arg1, 256, arg2);
						} else if (arg0 == 7) {
							if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
								local158 = local103.method5(4, 0, local49, local60, local73, local84, -1);
							} else {
								local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, 0, 4, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							}
							arg6.method496(local158, arg3, local115, arg4, 0, 0, local129, local94, arg1, 512, arg2);
						} else if (arg0 == 8) {
							if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
								local158 = local103.method5(4, 0, local49, local60, local73, local84, -1);
							} else {
								local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, 0, 4, local49, arg5, local60, local103.anInt7, (byte) 5, true);
							}
							arg6.method496(local158, arg3, local115, arg4, 0, 0, local129, local94, arg1, 768, arg2);
						}
					}
				}
			} else if (!aBoolean164 || local103.aBoolean1 || local103.aBoolean4) {
				if (local103.anInt7 == -1 && local103.anIntArray2 == null) {
					local158 = local103.method5(22, arg1, local49, local60, local73, local84, -1);
				} else {
					local158 = new Class2_Sub1_Sub2_Sub4(local73, local84, arg1, 22, local49, arg5, local60, local103.anInt7, (byte) 5, true);
				}
				arg6.method493(arg2, (byte) 9, arg4, local115, local94, local129, local158, arg3);
				if (local103.aBoolean7 && local103.aBoolean1 && arg7 != null) {
					arg7.method43(arg2, arg4);
				}
			}
		} catch (@Pc(1641) RuntimeException local1641) {
			signlink.reporterror("69276, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1641.toString());
			throw new RuntimeException();
		}
	}
}
