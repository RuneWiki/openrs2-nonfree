import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SMJSOFHG")
public final class Class39 {

	@OriginalMember(owner = "client!SMJSOFHG", name = "t", descriptor = "I")
	public static int anInt671;

	@OriginalMember(owner = "client!SMJSOFHG", name = "j", descriptor = "Z")
	private static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!SMJSOFHG", name = "l", descriptor = "I")
	private static int anInt666 = -550;

	@OriginalMember(owner = "client!SMJSOFHG", name = "m", descriptor = "[I")
	private static final int[] anIntArray175 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!SMJSOFHG", name = "p", descriptor = "Z")
	public static boolean aBoolean157 = true;

	@OriginalMember(owner = "client!SMJSOFHG", name = "r", descriptor = "I")
	private static int anInt669 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!SMJSOFHG", name = "s", descriptor = "I")
	private static int anInt670 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!SMJSOFHG", name = "v", descriptor = "[I")
	private static final int[] anIntArray176 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!SMJSOFHG", name = "w", descriptor = "[I")
	private static final int[] anIntArray177 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!SMJSOFHG", name = "x", descriptor = "[I")
	private static final int[] anIntArray178 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!SMJSOFHG", name = "A", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!SMJSOFHG", name = "n", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!SMJSOFHG", name = "o", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!SMJSOFHG", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!SMJSOFHG", name = "h", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!SMJSOFHG", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!SMJSOFHG", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!SMJSOFHG", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!SMJSOFHG", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!SMJSOFHG", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!SMJSOFHG", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!SMJSOFHG", name = "b", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!SMJSOFHG", name = "c", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!SMJSOFHG", name = "d", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!SMJSOFHG", name = "e", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!SMJSOFHG", name = "f", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(III)I")
	private static int method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method437(local3, local13);
		@Pc(29) int local29 = method437(local3 + 1, local13);
		@Pc(35) int local35 = method437(local3, local13 + 1);
		@Pc(43) int local43 = method437(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method427(local23, local29, local9, arg2);
		@Pc(55) int local55 = method427(local35, local43, local9, arg2);
		return method427(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(II[BZ)Z")
	public static boolean method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(13) Class1_Sub1_Sub2 local13 = new Class1_Sub1_Sub2(false, arg2);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local13.method36();
				if (local18 == 0) {
					return local3;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local13.method36();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local13.method22() >> 2;
						@Pc(70) int local70 = local61 + arg0;
						@Pc(74) int local74 = local55 + arg1;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class22 local87 = Class22.method312(local15);
							if (local66 != 22 || !aBoolean157 || local87.aBoolean102 || local87.aBoolean101) {
								local3 &= local87.method316();
								local28 = true;
							}
						}
					}
					local33 = local13.method36();
					if (local33 == 0) {
						break;
					}
					local13.method22();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("62713, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(II)I")
	private static int method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method423(arg0 + 45365, arg1 + 91923, 4) + (method423(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method423(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(Lclient!FHVZVKRA;ZLclient!BJPWOXRJ;)V")
	public static void method426(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(7) int local7 = -1;
			while (true) {
				@Pc(10) int local10 = arg1.method36();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				@Pc(19) Class22 local19 = Class22.method312(local7);
				local19.method313(arg0);
				while (true) {
					@Pc(26) int local26 = arg1.method36();
					if (local26 == 0) {
						break;
					}
					arg1.method22();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("48003, " + arg0 + ", " + true + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(IIII)I")
	private static int method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub3_Sub1.anIntArray27[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "b", descriptor = "(III)Z")
	public static boolean method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) Class22 local11 = Class22.method312(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method314(arg1);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("18329, " + -48173 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "b", descriptor = "(II)I")
	private static int method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "d", descriptor = "(II)I")
	private static int method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SMJSOFHG", name = "e", descriptor = "(II)I")
	private static int method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method432(arg0 - 1, arg1 - 1) + method432(arg0 + 1, arg1 - 1) + method432(arg0 - 1, arg1 + 1) + method432(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method432(arg0 - 1, arg1) + method432(arg0 + 1, arg1) + method432(arg0, arg1 - 1) + method432(arg0, arg1 + 1);
		@Pc(59) int local59 = method432(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(IIILclient!HUQCCBIO;IIIZ[[[ILclient!HFOJZUJK;I)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[][][] arg7, @OriginalArg(9) Class11 arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg7[arg9][arg1][arg6];
			@Pc(19) int local19 = arg7[arg9][arg1 + 1][arg6];
			@Pc(31) int local31 = arg7[arg9][arg1 + 1][arg6 + 1];
			@Pc(41) int local41 = arg7[arg9][arg1][arg6 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class22 local54 = Class22.method312(arg4);
			@Pc(66) int local66 = arg1 + (arg6 << 7) + (arg4 << 14) + 1073741824;
			if (!local54.aBoolean102) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg0 << 6) + arg2);
			@Pc(108) Class1_Sub1_Sub1 local108;
			if (arg2 == 22) {
				if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
					local108 = local54.method317(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 22, arg0, true, arg4, local19, local31, false);
				}
				arg8.method141(local80, local51, local66, arg5, arg6, local108, arg1);
				if (local54.aBoolean104 && local54.aBoolean102) {
					arg3.method208(arg1, (byte) 5, arg6);
				}
			} else {
				@Pc(204) int local204;
				if (arg2 == 10 || arg2 == 11) {
					if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
						local108 = local54.method317(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 10, arg0, true, arg4, local19, local31, false);
					}
					if (local108 != null) {
						@Pc(191) int local191 = 0;
						if (arg2 == 11) {
							local191 += 256;
						}
						@Pc(207) int local207;
						if (arg0 == 1 || arg0 == 3) {
							local204 = local54.anInt429;
							local207 = local54.anInt416;
						} else {
							local204 = local54.anInt416;
							local207 = local54.anInt429;
						}
						arg8.method145(local204, arg5, local108, local191, local51, arg1, local80, local66, arg6, local207);
					}
					if (local54.aBoolean104) {
						arg3.method207(arg6, local54.anInt416, local54.anInt429, local54.aBoolean105, arg0, arg1);
					}
				} else if (arg2 >= 12) {
					if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
						local108 = local54.method317(arg2, arg0, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, arg2, arg0, true, arg4, local19, local31, false);
					}
					arg8.method145(1, arg5, local108, 0, local51, arg1, local80, local66, arg6, 1);
					if (local54.aBoolean104) {
						arg3.method207(arg6, local54.anInt416, local54.anInt429, local54.aBoolean105, arg0, arg1);
					}
				} else if (arg2 == 0) {
					if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
						local108 = local54.method317(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 0, arg0, true, arg4, local19, local31, false);
					}
					arg8.method143(local108, local51, local80, null, arg5, anIntArray176[arg0], arg1, local66, arg6, 0);
					if (local54.aBoolean104) {
						arg3.method206(arg6, arg1, local54.aBoolean105, arg0, arg2);
					}
				} else if (arg2 == 1) {
					if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
						local108 = local54.method317(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 1, arg0, true, arg4, local19, local31, false);
					}
					arg8.method143(local108, local51, local80, null, arg5, anIntArray178[arg0], arg1, local66, arg6, 0);
					if (local54.aBoolean104) {
						arg3.method206(arg6, arg1, local54.aBoolean105, arg0, arg2);
					}
				} else {
					@Pc(450) int local450;
					@Pc(479) Class1_Sub1_Sub1 local479;
					if (arg2 == 2) {
						local450 = arg0 + 1 & 0x3;
						@Pc(469) Class1_Sub1_Sub1 local469;
						if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
							local469 = local54.method317(2, arg0 + 4, local9, local19, local31, local41, -1);
							local479 = local54.method317(2, local450, local9, local19, local31, local41, -1);
						} else {
							local469 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 2, arg0 + 4, true, arg4, local19, local31, false);
							local479 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 2, local450, true, arg4, local19, local31, false);
						}
						arg8.method143(local469, local51, local80, local479, arg5, anIntArray176[arg0], arg1, local66, arg6, anIntArray176[local450]);
						if (local54.aBoolean104) {
							arg3.method206(arg6, arg1, local54.aBoolean105, arg0, arg2);
						}
					} else if (arg2 == 3) {
						if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
							local108 = local54.method317(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 3, arg0, true, arg4, local19, local31, false);
						}
						arg8.method143(local108, local51, local80, null, arg5, anIntArray178[arg0], arg1, local66, arg6, 0);
						if (local54.aBoolean104) {
							arg3.method206(arg6, arg1, local54.aBoolean105, arg0, arg2);
						}
					} else if (arg2 == 9) {
						if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
							local108 = local54.method317(arg2, arg0, local9, local19, local31, local41, -1);
						} else {
							local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, arg2, arg0, true, arg4, local19, local31, false);
						}
						arg8.method145(1, arg5, local108, 0, local51, arg1, local80, local66, arg6, 1);
						if (local54.aBoolean104) {
							arg3.method207(arg6, local54.anInt416, local54.anInt429, local54.aBoolean105, arg0, arg1);
						}
					} else {
						if (local54.aBoolean100) {
							if (arg0 == 1) {
								local450 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local450;
							} else if (arg0 == 2) {
								local450 = local41;
								local41 = local19;
								local19 = local450;
								local450 = local31;
								local31 = local9;
								local9 = local450;
							} else if (arg0 == 3) {
								local450 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local450;
							}
						}
						if (arg2 == 4) {
							if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
								local108 = local54.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 4, 0, true, arg4, local19, local31, false);
							}
							arg8.method144(0, local80, arg6, local108, 0, local51, arg1, local66, arg0 * 512, anIntArray176[arg0], arg5);
						} else if (arg2 == 5) {
							local450 = 16;
							local204 = arg8.method161(arg5, arg1, arg6);
							if (local204 > 0) {
								local450 = Class22.method312(local204 >> 14 & 0x7FFF).anInt434;
							}
							if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
								local479 = local54.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local479 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 4, 0, true, arg4, local19, local31, false);
							}
							arg8.method144(anIntArray175[arg0] * local450, local80, arg6, local479, anIntArray177[arg0] * local450, local51, arg1, local66, arg0 * 512, anIntArray176[arg0], arg5);
						} else if (arg2 == 6) {
							if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
								local108 = local54.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 4, 0, true, arg4, local19, local31, false);
							}
							arg8.method144(0, local80, arg6, local108, 0, local51, arg1, local66, arg0, 256, arg5);
						} else if (arg2 == 7) {
							if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
								local108 = local54.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 4, 0, true, arg4, local19, local31, false);
							}
							arg8.method144(0, local80, arg6, local108, 0, local51, arg1, local66, arg0, 512, arg5);
						} else if (arg2 == 8) {
							if (local54.anInt426 == -1 && local54.anIntArray115 == null) {
								local108 = local54.method317(4, 0, local9, local19, local31, local41, -1);
							} else {
								local108 = new Class1_Sub1_Sub1_Sub5(local9, local41, local54.anInt426, 4, 0, true, arg4, local19, local31, false);
							}
							arg8.method144(0, local80, arg6, local108, 0, local51, arg1, local66, arg0, 768, arg5);
						}
					}
				}
			}
		} catch (@Pc(1018) RuntimeException local1018) {
			signlink.reporterror("95800, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1018.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "<init>", descriptor = "([[[BII[[[II)V")
	public Class39(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt667 = arg4;
			this.anInt668 = arg2;
			this.anIntArrayArrayArray5 = arg3;
			this.aByteArrayArrayArray3 = arg0;
			this.aByteArrayArrayArray6 = new byte[4][this.anInt667][this.anInt668];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt667][this.anInt668];
			this.aByteArrayArrayArray7 = new byte[4][this.anInt667][this.anInt668];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt667][this.anInt668];
			this.anIntArrayArrayArray6 = new int[4][this.anInt667 + 1][this.anInt668 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt667 + 1][this.anInt668 + 1];
			this.anIntArrayArray19 = new int[this.anInt667 + 1][this.anInt668 + 1];
			this.anIntArray170 = new int[this.anInt668];
			this.anIntArray171 = new int[this.anInt668];
			this.anIntArray172 = new int[this.anInt668];
			this.anIntArray173 = new int[this.anInt668];
			this.anIntArray174 = new int[this.anInt668];
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("64888, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(I[BII[Lclient!HUQCCBIO;Lclient!HFOJZUJK;)V")
	public void method429(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class13[] arg3, @OriginalArg(5) Class11 arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(false, arg1);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(15) int local15 = local7.method36();
				if (local15 == 0) {
					return;
				}
				local9 += local15;
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(26) int local26 = local7.method36();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					@Pc(38) int local38 = local23 & 0x3F;
					@Pc(44) int local44 = local23 >> 6 & 0x3F;
					@Pc(48) int local48 = local23 >> 12;
					@Pc(51) int local51 = local7.method22();
					@Pc(55) int local55 = local51 >> 2;
					@Pc(59) int local59 = local51 & 0x3;
					@Pc(63) int local63 = local44 + arg2;
					@Pc(67) int local67 = local38 + arg0;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						@Pc(79) int local79 = local48;
						if ((this.aByteArrayArrayArray3[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						@Pc(94) Class13 local94 = null;
						if (local79 >= 0) {
							local94 = arg3[local79];
						}
						this.method431(local63, local9, local59, local48, local55, arg4, local67, local94);
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("82085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -753 + ", " + arg3 + ", " + arg4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(ZIII)I")
	private int method430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray3[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("53025, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(IIZIIILclient!HFOJZUJK;ILclient!HUQCCBIO;)V")
	private void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class13 arg7) {
		try {
			if (aBoolean157) {
				if ((this.aByteArrayArrayArray3[arg3][arg0][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method430(arg0, arg6, arg3) != anInt671) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray5[arg3][arg0][arg6];
			@Pc(44) int local44 = this.anIntArrayArrayArray5[arg3][arg0 + 1][arg6];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg3][arg0 + 1][arg6 + 1];
			@Pc(71) int local71 = this.anIntArrayArrayArray5[arg3][arg0][arg6 + 1];
			@Pc(81) int local81 = local33 + local44 + local60 + local71 >> 2;
			@Pc(84) Class22 local84 = Class22.method312(arg1);
			@Pc(96) int local96 = arg0 + (arg6 << 7) + (arg1 << 14) + 1073741824;
			if (!local84.aBoolean102) {
				local96 += Integer.MIN_VALUE;
			}
			@Pc(110) byte local110 = (byte) ((arg2 << 6) + arg4);
			@Pc(139) Class1_Sub1_Sub1 local139;
			if (arg4 != 22) {
				@Pc(237) int local237;
				if (arg4 == 10 || arg4 == 11) {
					if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
						local139 = local84.method317(10, arg2, local33, local44, local60, local71, -1);
					} else {
						local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 10, arg2, true, arg1, local44, local60, false);
					}
					if (local139 != null) {
						@Pc(224) int local224 = 0;
						if (arg4 == 11) {
							local224 += 256;
						}
						@Pc(240) int local240;
						if (arg2 == 1 || arg2 == 3) {
							local237 = local84.anInt429;
							local240 = local84.anInt416;
						} else {
							local237 = local84.anInt416;
							local240 = local84.anInt429;
						}
						if (arg5.method145(local237, arg3, local139, local224, local81, arg0, local110, local96, arg6, local240) && local84.aBoolean109) {
							@Pc(271) Class1_Sub1_Sub1_Sub4 local271;
							if (local139 instanceof Class1_Sub1_Sub1_Sub4) {
								local271 = (Class1_Sub1_Sub1_Sub4) local139;
							} else {
								local271 = local84.method317(10, arg2, local33, local44, local60, local71, -1);
							}
							if (local271 != null) {
								for (@Pc(287) int local287 = 0; local287 <= local237; local287++) {
									for (@Pc(291) int local291 = 0; local291 <= local240; local291++) {
										@Pc(298) int local298 = local271.anInt362 / 4;
										if (local298 > 30) {
											local298 = 30;
										}
										if (local298 > this.aByteArrayArrayArray5[arg3][arg0 + local287][arg6 + local291]) {
											this.aByteArrayArrayArray5[arg3][arg0 + local287][arg6 + local291] = (byte) local298;
										}
									}
								}
							}
						}
					}
					if (local84.aBoolean104 && arg7 != null) {
						arg7.method207(arg6, local84.anInt416, local84.anInt429, local84.aBoolean105, arg2, arg0);
					}
				} else if (arg4 >= 12) {
					if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
						local139 = local84.method317(arg4, arg2, local33, local44, local60, local71, -1);
					} else {
						local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, arg4, arg2, true, arg1, local44, local60, false);
					}
					arg5.method145(1, arg3, local139, 0, local81, arg0, local110, local96, arg6, 1);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x924;
					}
					if (local84.aBoolean104 && arg7 != null) {
						arg7.method207(arg6, local84.anInt416, local84.anInt429, local84.aBoolean105, arg2, arg0);
					}
				} else if (arg4 == 0) {
					if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
						local139 = local84.method317(0, arg2, local33, local44, local60, local71, -1);
					} else {
						local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 0, arg2, true, arg1, local44, local60, false);
					}
					arg5.method143(local139, local81, local110, null, arg3, anIntArray176[arg2], arg0, local96, arg6, 0);
					if (arg2 == 0) {
						if (local84.aBoolean109) {
							this.aByteArrayArrayArray5[arg3][arg0][arg6] = 50;
							this.aByteArrayArrayArray5[arg3][arg0][arg6 + 1] = 50;
						}
						if (local84.aBoolean107) {
							this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x249;
						}
					} else if (arg2 == 1) {
						if (local84.aBoolean109) {
							this.aByteArrayArrayArray5[arg3][arg0][arg6 + 1] = 50;
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6 + 1] = 50;
						}
						if (local84.aBoolean107) {
							this.anIntArrayArrayArray6[arg3][arg0][arg6 + 1] |= 0x492;
						}
					} else if (arg2 == 2) {
						if (local84.aBoolean109) {
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6] = 50;
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6 + 1] = 50;
						}
						if (local84.aBoolean107) {
							this.anIntArrayArrayArray6[arg3][arg0 + 1][arg6] |= 0x249;
						}
					} else if (arg2 == 3) {
						if (local84.aBoolean109) {
							this.aByteArrayArrayArray5[arg3][arg0][arg6] = 50;
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6] = 50;
						}
						if (local84.aBoolean107) {
							this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x492;
						}
					}
					if (local84.aBoolean104 && arg7 != null) {
						arg7.method206(arg6, arg0, local84.aBoolean105, arg2, arg4);
					}
					if (local84.anInt434 != 16) {
						arg5.method151(arg0, arg6, local84.anInt434, arg3);
					}
				} else if (arg4 == 1) {
					if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
						local139 = local84.method317(1, arg2, local33, local44, local60, local71, -1);
					} else {
						local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 1, arg2, true, arg1, local44, local60, false);
					}
					arg5.method143(local139, local81, local110, null, arg3, anIntArray178[arg2], arg0, local96, arg6, 0);
					if (local84.aBoolean109) {
						if (arg2 == 0) {
							this.aByteArrayArrayArray5[arg3][arg0][arg6 + 1] = 50;
						} else if (arg2 == 1) {
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6 + 1] = 50;
						} else if (arg2 == 2) {
							this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6] = 50;
						} else if (arg2 == 3) {
							this.aByteArrayArrayArray5[arg3][arg0][arg6] = 50;
						}
					}
					if (local84.aBoolean104 && arg7 != null) {
						arg7.method206(arg6, arg0, local84.aBoolean105, arg2, arg4);
					}
				} else {
					@Pc(848) int local848;
					@Pc(877) Class1_Sub1_Sub1 local877;
					if (arg4 == 2) {
						local848 = arg2 + 1 & 0x3;
						@Pc(867) Class1_Sub1_Sub1 local867;
						if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
							local867 = local84.method317(2, arg2 + 4, local33, local44, local60, local71, -1);
							local877 = local84.method317(2, local848, local33, local44, local60, local71, -1);
						} else {
							local867 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 2, arg2 + 4, true, arg1, local44, local60, false);
							local877 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 2, local848, true, arg1, local44, local60, false);
						}
						arg5.method143(local867, local81, local110, local877, arg3, anIntArray176[arg2], arg0, local96, arg6, anIntArray176[local848]);
						if (local84.aBoolean107) {
							if (arg2 == 0) {
								this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x249;
								this.anIntArrayArrayArray6[arg3][arg0][arg6 + 1] |= 0x492;
							} else if (arg2 == 1) {
								this.anIntArrayArrayArray6[arg3][arg0][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg3][arg0 + 1][arg6] |= 0x249;
							} else if (arg2 == 2) {
								this.anIntArrayArrayArray6[arg3][arg0 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x492;
							} else if (arg2 == 3) {
								this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x492;
								this.anIntArrayArrayArray6[arg3][arg0][arg6] |= 0x249;
							}
						}
						if (local84.aBoolean104 && arg7 != null) {
							arg7.method206(arg6, arg0, local84.aBoolean105, arg2, arg4);
						}
						if (local84.anInt434 != 16) {
							arg5.method151(arg0, arg6, local84.anInt434, arg3);
						}
					} else if (arg4 == 3) {
						if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
							local139 = local84.method317(3, arg2, local33, local44, local60, local71, -1);
						} else {
							local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 3, arg2, true, arg1, local44, local60, false);
						}
						arg5.method143(local139, local81, local110, null, arg3, anIntArray178[arg2], arg0, local96, arg6, 0);
						if (local84.aBoolean109) {
							if (arg2 == 0) {
								this.aByteArrayArrayArray5[arg3][arg0][arg6 + 1] = 50;
							} else if (arg2 == 1) {
								this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6 + 1] = 50;
							} else if (arg2 == 2) {
								this.aByteArrayArrayArray5[arg3][arg0 + 1][arg6] = 50;
							} else if (arg2 == 3) {
								this.aByteArrayArrayArray5[arg3][arg0][arg6] = 50;
							}
						}
						if (local84.aBoolean104 && arg7 != null) {
							arg7.method206(arg6, arg0, local84.aBoolean105, arg2, arg4);
						}
					} else if (arg4 == 9) {
						if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
							local139 = local84.method317(arg4, arg2, local33, local44, local60, local71, -1);
						} else {
							local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, arg4, arg2, true, arg1, local44, local60, false);
						}
						arg5.method145(1, arg3, local139, 0, local81, arg0, local110, local96, arg6, 1);
						if (local84.aBoolean104 && arg7 != null) {
							arg7.method207(arg6, local84.anInt416, local84.anInt429, local84.aBoolean105, arg2, arg0);
						}
					} else {
						if (local84.aBoolean100) {
							if (arg2 == 1) {
								local848 = local71;
								local71 = local60;
								local60 = local44;
								local44 = local33;
								local33 = local848;
							} else if (arg2 == 2) {
								local848 = local71;
								local71 = local44;
								local44 = local848;
								local848 = local60;
								local60 = local33;
								local33 = local848;
							} else if (arg2 == 3) {
								local848 = local71;
								local71 = local33;
								local33 = local44;
								local44 = local60;
								local60 = local848;
							}
						}
						if (arg4 == 4) {
							if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
								local139 = local84.method317(4, 0, local33, local44, local60, local71, -1);
							} else {
								local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 4, 0, true, arg1, local44, local60, false);
							}
							arg5.method144(0, local110, arg6, local139, 0, local81, arg0, local96, arg2 * 512, anIntArray176[arg2], arg3);
						} else if (arg4 == 5) {
							local848 = 16;
							local237 = arg5.method161(arg3, arg0, arg6);
							if (local237 > 0) {
								local848 = Class22.method312(local237 >> 14 & 0x7FFF).anInt434;
							}
							if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
								local877 = local84.method317(4, 0, local33, local44, local60, local71, -1);
							} else {
								local877 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 4, 0, true, arg1, local44, local60, false);
							}
							arg5.method144(anIntArray175[arg2] * local848, local110, arg6, local877, anIntArray177[arg2] * local848, local81, arg0, local96, arg2 * 512, anIntArray176[arg2], arg3);
						} else if (arg4 == 6) {
							if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
								local139 = local84.method317(4, 0, local33, local44, local60, local71, -1);
							} else {
								local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 4, 0, true, arg1, local44, local60, false);
							}
							arg5.method144(0, local110, arg6, local139, 0, local81, arg0, local96, arg2, 256, arg3);
						} else if (arg4 == 7) {
							if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
								local139 = local84.method317(4, 0, local33, local44, local60, local71, -1);
							} else {
								local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 4, 0, true, arg1, local44, local60, false);
							}
							arg5.method144(0, local110, arg6, local139, 0, local81, arg0, local96, arg2, 512, arg3);
						} else if (arg4 == 8) {
							if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
								local139 = local84.method317(4, 0, local33, local44, local60, local71, -1);
							} else {
								local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 4, 0, true, arg1, local44, local60, false);
							}
							arg5.method144(0, local110, arg6, local139, 0, local81, arg0, local96, arg2, 768, arg3);
						}
					}
				}
			} else if (!aBoolean157 || local84.aBoolean102 || local84.aBoolean101) {
				if (local84.anInt426 == -1 && local84.anIntArray115 == null) {
					local139 = local84.method317(22, arg2, local33, local44, local60, local71, -1);
				} else {
					local139 = new Class1_Sub1_Sub1_Sub5(local33, local71, local84.anInt426, 22, arg2, true, arg1, local44, local60, false);
				}
				arg5.method141(local110, local81, local96, arg3, arg6, local139, arg0);
				if (local84.aBoolean104 && local84.aBoolean102 && arg7 != null) {
					arg7.method208(arg0, (byte) 5, arg6);
				}
			}
		} catch (@Pc(1622) RuntimeException local1622) {
			signlink.reporterror("92884, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1622.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "c", descriptor = "(II)I")
	private int method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!SMJSOFHG", name = "c", descriptor = "(III)I")
	private int method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(I[BIZII)V")
	public void method436(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub2 local7 = new Class1_Sub1_Sub2(false, arg1);
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
					for (@Pc(20) int local20 = 0; local20 < 64; local20++) {
						@Pc(26) int local26 = local16 + arg3;
						@Pc(30) int local30 = local20 + arg4;
						@Pc(52) int local52;
						if (local26 >= 0 && local26 < 104 && local30 >= 0 && local30 < 104) {
							this.aByteArrayArrayArray3[local12][local26][local30] = 0;
							while (true) {
								local52 = local7.method22();
								if (local52 == 0) {
									if (local12 == 0) {
										this.anIntArrayArrayArray5[0][local26][local30] = -method425(local26 + arg0 + 932731, local30 + 556238 + arg2) * 8;
									} else {
										this.anIntArrayArrayArray5[local12][local26][local30] = this.anIntArrayArrayArray5[local12 - 1][local26][local30] - 240;
									}
									break;
								}
								if (local52 == 1) {
									@Pc(108) int local108 = local7.method22();
									if (local108 == 1) {
										local108 = 0;
									}
									if (local12 == 0) {
										this.anIntArrayArrayArray5[0][local26][local30] = -local108 * 8;
									} else {
										this.anIntArrayArrayArray5[local12][local26][local30] = this.anIntArrayArrayArray5[local12 - 1][local26][local30] - local108 * 8;
									}
									break;
								}
								if (local52 <= 49) {
									this.aByteArrayArrayArray2[local12][local26][local30] = local7.method23();
									this.aByteArrayArrayArray7[local12][local26][local30] = (byte) ((local52 - 2) / 4);
									this.aByteArrayArrayArray4[local12][local26][local30] = (byte) (local52 - 2 & 0x3);
								} else if (local52 <= 81) {
									this.aByteArrayArrayArray3[local12][local26][local30] = (byte) (local52 - 49);
								} else {
									this.aByteArrayArrayArray6[local12][local26][local30] = (byte) (local52 - 81);
								}
							}
						} else {
							while (true) {
								local52 = local7.method22();
								if (local52 == 0) {
									break;
								}
								if (local52 == 1) {
									local7.method22();
									break;
								}
								if (local52 <= 49) {
									local7.method22();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("99039, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(Lclient!HFOJZUJK;I[Lclient!HUQCCBIO;)V")
	public void method439(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class13[] arg1) {
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
								arg1[local27].method208(local7, (byte) 5, local11);
							}
						}
					}
				}
			}
			anInt670 += (int) (Math.random() * 5.0D) - 2;
			if (anInt670 < -8) {
				anInt670 = -8;
			}
			if (anInt670 > 8) {
				anInt670 = 8;
			}
			anInt669 += (int) (Math.random() * 5.0D) - 2;
			if (anInt669 < -16) {
				anInt669 = -16;
			}
			if (anInt669 > 16) {
				anInt669 = 16;
			}
			@Pc(147) int local147;
			@Pc(153) int local153;
			@Pc(155) int local155;
			@Pc(159) int local159;
			@Pc(183) int local183;
			@Pc(205) int local205;
			@Pc(218) int local218;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(234) int local234;
			@Pc(250) int local250;
			@Pc(298) int local298;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(122) byte[][] local122 = this.aByteArrayArrayArray5[local7];
				local147 = (int) Math.sqrt((double) 5100);
				local153 = local147 * 768 >> 8;
				for (local155 = 1; local155 < this.anInt668 - 1; local155++) {
					for (local159 = 1; local159 < this.anInt667 - 1; local159++) {
						local183 = this.anIntArrayArrayArray5[local7][local159 + 1][local155] - this.anIntArrayArrayArray5[local7][local159 - 1][local155];
						local205 = this.anIntArrayArrayArray5[local7][local159][local155 + 1] - this.anIntArrayArrayArray5[local7][local159][local155 - 1];
						local218 = (int) Math.sqrt((double) (local183 * local183 + local205 * local205 + 65536));
						local224 = (local183 << 8) / local218;
						local228 = 65536 / local218;
						local234 = (local205 << 8) / local218;
						local250 = (local224 * -50 + local228 * -10 + local234 * -50) / local153 + 96;
						local298 = (local122[local159 - 1][local155] >> 2) + (local122[local159 + 1][local155] >> 3) + (local122[local159][local155 - 1] >> 2) + (local122[local159][local155 + 1] >> 3) + (local122[local159][local155] >> 1);
						this.anIntArrayArray19[local159][local155] = local250 - local298;
					}
				}
				for (local159 = 0; local159 < this.anInt668; local159++) {
					this.anIntArray170[local159] = 0;
					this.anIntArray171[local159] = 0;
					this.anIntArray172[local159] = 0;
					this.anIntArray173[local159] = 0;
					this.anIntArray174[local159] = 0;
				}
				for (local183 = -5; local183 < this.anInt667 + 5; local183++) {
					for (local205 = 0; local205 < this.anInt668; local205++) {
						local218 = local183 + 5;
						@Pc(433) int local433;
						if (local218 >= 0 && local218 < this.anInt667) {
							local224 = this.aByteArrayArrayArray6[local7][local218][local205] & 0xFF;
							if (local224 > 0) {
								@Pc(392) Class18 local392 = Class18.aClass18Array1[local224 - 1];
								this.anIntArray170[local205] += local392.anInt388;
								this.anIntArray171[local205] += local392.anInt386;
								this.anIntArray172[local205] += local392.anInt387;
								this.anIntArray173[local205] += local392.anInt389;
								local433 = this.anIntArray174[local205]++;
							}
						}
						local224 = local183 - 5;
						if (local224 >= 0 && local224 < this.anInt667) {
							local228 = this.aByteArrayArrayArray6[local7][local224][local205] & 0xFF;
							if (local228 > 0) {
								@Pc(465) Class18 local465 = Class18.aClass18Array1[local228 - 1];
								this.anIntArray170[local205] -= local465.anInt388;
								this.anIntArray171[local205] -= local465.anInt386;
								this.anIntArray172[local205] -= local465.anInt387;
								this.anIntArray173[local205] -= local465.anInt389;
								local433 = this.anIntArray174[local205]--;
							}
						}
					}
					if (local183 >= 1 && local183 < this.anInt667 - 1) {
						local218 = 0;
						local224 = 0;
						local228 = 0;
						local234 = 0;
						local250 = 0;
						for (local298 = -5; local298 < this.anInt668 + 5; local298++) {
							@Pc(541) int local541 = local298 + 5;
							if (local541 >= 0 && local541 < this.anInt668) {
								local218 += this.anIntArray170[local541];
								local224 += this.anIntArray171[local541];
								local228 += this.anIntArray172[local541];
								local234 += this.anIntArray173[local541];
								local250 += this.anIntArray174[local541];
							}
							@Pc(586) int local586 = local298 - 5;
							if (local586 >= 0 && local586 < this.anInt668) {
								local218 -= this.anIntArray170[local586];
								local224 -= this.anIntArray171[local586];
								local228 -= this.anIntArray172[local586];
								local234 -= this.anIntArray173[local586];
								local250 -= this.anIntArray174[local586];
							}
							if (local298 >= 1 && local298 < this.anInt668 - 1 && (!aBoolean157 || (this.aByteArrayArrayArray3[local7][local183][local298] & 0x10) == 0 && this.method430(local183, local298, local7) == anInt671)) {
								@Pc(669) int local669 = this.aByteArrayArrayArray6[local7][local183][local298] & 0xFF;
								@Pc(680) int local680 = this.aByteArrayArrayArray2[local7][local183][local298] & 0xFF;
								if (local669 > 0 || local680 > 0) {
									@Pc(693) int local693 = this.anIntArrayArrayArray5[local7][local183][local298];
									@Pc(704) int local704 = this.anIntArrayArrayArray5[local7][local183 + 1][local298];
									@Pc(717) int local717 = this.anIntArrayArrayArray5[local7][local183 + 1][local298 + 1];
									@Pc(728) int local728 = this.anIntArrayArrayArray5[local7][local183][local298 + 1];
									@Pc(735) int local735 = this.anIntArrayArray19[local183][local298];
									@Pc(744) int local744 = this.anIntArrayArray19[local183 + 1][local298];
									@Pc(755) int local755 = this.anIntArrayArray19[local183 + 1][local298 + 1];
									@Pc(764) int local764 = this.anIntArrayArray19[local183][local298 + 1];
									@Pc(766) int local766 = -1;
									@Pc(768) int local768 = -1;
									@Pc(776) int local776;
									@Pc(780) int local780;
									if (local669 > 0) {
										local776 = local218 * 256 / local234;
										local780 = local224 / local250;
										@Pc(784) int local784 = local228 / local250;
										local766 = this.method434(local776, local780, local784);
										@Pc(796) int local796 = local776 + anInt670 & 0xFF;
										local784 += anInt669;
										if (local784 < 0) {
											local784 = 0;
										} else if (local784 > 255) {
											local784 = 255;
										}
										local768 = this.method434(local796, local780, local784);
									}
									if (local7 > 0) {
										@Pc(821) boolean local821 = true;
										if (local669 == 0 && this.aByteArrayArrayArray7[local7][local183][local298] != 0) {
											local821 = false;
										}
										if (local680 > 0 && !Class18.aClass18Array1[local680 - 1].aBoolean94) {
											local821 = false;
										}
										if (local821 && local693 == local704 && local693 == local717 && local693 == local728) {
											this.anIntArrayArrayArray6[local7][local183][local298] |= 0x924;
										}
									}
									local776 = 0;
									if (local766 != -1) {
										local776 = Class1_Sub1_Sub3_Sub1.anIntArray31[method435(local768, 96)];
									}
									if (local680 == 0) {
										arg0.method140(local7, local183, local298, 0, 0, -1, local693, local704, local717, local728, method435(local766, local735), method435(local766, local744), method435(local766, local755), method435(local766, local764), 0, 0, 0, 0, local776, 0);
									} else {
										local780 = this.aByteArrayArrayArray7[local7][local183][local298] + 1;
										@Pc(933) byte local933 = this.aByteArrayArrayArray4[local7][local183][local298];
										@Pc(939) Class18 local939 = Class18.aClass18Array1[local680 - 1];
										@Pc(942) int local942 = local939.anInt384;
										@Pc(950) int local950;
										@Pc(948) int local948;
										if (local942 >= 0) {
											local948 = Class1_Sub1_Sub3_Sub1.method106(local942);
											local950 = -1;
										} else if (local939.anInt383 == 16711935) {
											local948 = 0;
											local950 = -2;
											local942 = -1;
										} else {
											local950 = this.method434(local939.anInt385, local939.anInt386, local939.anInt387);
											local948 = Class1_Sub1_Sub3_Sub1.anIntArray31[this.method433(local939.anInt390, 96)];
										}
										arg0.method140(local7, local183, local298, local780, local933, local942, local693, local704, local717, local728, method435(local766, local735), method435(local766, local744), method435(local766, local755), method435(local766, local764), this.method433(local950, local735), this.method433(local950, local744), this.method433(local950, local755), this.method433(local950, local764), local776, local948);
									}
								}
							}
						}
					}
				}
				for (local205 = 1; local205 < this.anInt668 - 1; local205++) {
					for (local218 = 1; local218 < this.anInt667 - 1; local218++) {
						arg0.method139(local7, local218, local205, this.method430(local218, local205, local7));
					}
				}
			}
			arg0.method166();
			for (local11 = 0; local11 < this.anInt667; local11++) {
				for (local27 = 0; local27 < this.anInt668; local27++) {
					if ((this.aByteArrayArrayArray3[1][local11][local27] & 0x2) == 2) {
						arg0.method137(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1121) int local1121 = 2;
			@Pc(1123) int local1123 = 4;
			for (@Pc(1125) int local1125 = 0; local1125 < 4; local1125++) {
				if (local1125 > 0) {
					local27 <<= 0x3;
					local1121 <<= 0x3;
					local1123 <<= 0x3;
				}
				for (@Pc(1143) int local1143 = 0; local1143 <= local1125; local1143++) {
					for (local147 = 0; local147 <= this.anInt668; local147++) {
						for (local153 = 0; local153 <= this.anInt667; local153++) {
							if ((this.anIntArrayArrayArray6[local1143][local153][local147] & local27) != 0) {
								local155 = local147;
								local159 = local147;
								local183 = local1143;
								local205 = local1143;
								while (local155 > 0 && (this.anIntArrayArrayArray6[local1143][local153][local155 - 1] & local27) != 0) {
									local155--;
								}
								while (local159 < this.anInt668 && (this.anIntArrayArrayArray6[local1143][local153][local159 + 1] & local27) != 0) {
									local159++;
								}
								label324: while (local183 > 0) {
									for (local218 = local155; local218 <= local159; local218++) {
										if ((this.anIntArrayArrayArray6[local183 - 1][local153][local218] & local27) == 0) {
											break label324;
										}
									}
									local183--;
								}
								label313: while (local205 < local1125) {
									for (local218 = local155; local218 <= local159; local218++) {
										if ((this.anIntArrayArrayArray6[local205 + 1][local153][local218] & local27) == 0) {
											break label313;
										}
									}
									local205++;
								}
								local218 = (local205 + 1 - local183) * (local159 + 1 - local155);
								if (local218 >= 8) {
									local228 = this.anIntArrayArrayArray5[local205][local153][local155] - 240;
									local234 = this.anIntArrayArrayArray5[local183][local153][local155];
									Class11.method138(local234, 1, local1125, local153 * 128, local155 * 128, local159 * 128 + 128, local153 * 128, local228, 338);
									for (local250 = local183; local250 <= local205; local250++) {
										for (local298 = local155; local298 <= local159; local298++) {
											this.anIntArrayArrayArray6[local250][local153][local298] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1143][local153][local147] & local1121) != 0) {
								local155 = local153;
								local159 = local153;
								local183 = local1143;
								local205 = local1143;
								while (local155 > 0 && (this.anIntArrayArrayArray6[local1143][local155 - 1][local147] & local1121) != 0) {
									local155--;
								}
								while (local159 < this.anInt667 && (this.anIntArrayArrayArray6[local1143][local159 + 1][local147] & local1121) != 0) {
									local159++;
								}
								label377: while (local183 > 0) {
									for (local218 = local155; local218 <= local159; local218++) {
										if ((this.anIntArrayArrayArray6[local183 - 1][local218][local147] & local1121) == 0) {
											break label377;
										}
									}
									local183--;
								}
								label366: while (local205 < local1125) {
									for (local218 = local155; local218 <= local159; local218++) {
										if ((this.anIntArrayArrayArray6[local205 + 1][local218][local147] & local1121) == 0) {
											break label366;
										}
									}
									local205++;
								}
								local218 = (local205 + 1 - local183) * (local159 + 1 - local155);
								if (local218 >= 8) {
									local228 = this.anIntArrayArrayArray5[local205][local155][local147] - 240;
									local234 = this.anIntArrayArrayArray5[local183][local155][local147];
									Class11.method138(local234, 2, local1125, local155 * 128, local147 * 128, local147 * 128, local159 * 128 + 128, local228, 338);
									for (local250 = local183; local250 <= local205; local250++) {
										for (local298 = local155; local298 <= local159; local298++) {
											this.anIntArrayArrayArray6[local250][local298][local147] &= ~local1121;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1143][local153][local147] & local1123) != 0) {
								local155 = local153;
								local159 = local153;
								local183 = local147;
								local205 = local147;
								while (local183 > 0 && (this.anIntArrayArrayArray6[local1143][local153][local183 - 1] & local1123) != 0) {
									local183--;
								}
								while (local205 < this.anInt668 && (this.anIntArrayArrayArray6[local1143][local153][local205 + 1] & local1123) != 0) {
									local205++;
								}
								label430: while (local155 > 0) {
									for (local218 = local183; local218 <= local205; local218++) {
										if ((this.anIntArrayArrayArray6[local1143][local155 - 1][local218] & local1123) == 0) {
											break label430;
										}
									}
									local155--;
								}
								label419: while (local159 < this.anInt667) {
									for (local218 = local183; local218 <= local205; local218++) {
										if ((this.anIntArrayArrayArray6[local1143][local159 + 1][local218] & local1123) == 0) {
											break label419;
										}
									}
									local159++;
								}
								if ((local159 + 1 - local155) * (local205 + 1 - local183) >= 4) {
									local218 = this.anIntArrayArrayArray5[local1143][local155][local183];
									Class11.method138(local218, 4, local1125, local155 * 128, local183 * 128, local205 * 128 + 128, local159 * 128 + 128, local218, 338);
									for (local224 = local155; local224 <= local159; local224++) {
										for (local228 = local183; local228 <= local205; local228++) {
											this.anIntArrayArrayArray6[local1143][local224][local228] &= ~local1123;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1758) RuntimeException local1758) {
			signlink.reporterror("2722, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local1758.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SMJSOFHG", name = "a", descriptor = "(IIIIZ)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(12) int local12 = arg0; local12 <= arg0 + 64; local12++) {
				for (@Pc(16) int local16 = arg1; local16 <= arg1 + 64; local16++) {
					if (local16 >= 0 && local16 < this.anInt667 && local12 >= 0 && local12 < this.anInt668) {
						this.aByteArrayArrayArray5[0][local16][local12] = 127;
						if (local16 == arg1 && local16 > 0) {
							this.anIntArrayArrayArray5[0][local16][local12] = this.anIntArrayArrayArray5[0][local16 - 1][local12];
						}
						if (local16 == arg1 + 64 && local16 < this.anInt667 - 1) {
							this.anIntArrayArrayArray5[0][local16][local12] = this.anIntArrayArrayArray5[0][local16 + 1][local12];
						}
						if (local12 == arg0 && local12 > 0) {
							this.anIntArrayArrayArray5[0][local16][local12] = this.anIntArrayArrayArray5[0][local16][local12 - 1];
						}
						if (local12 == arg0 + 64 && local12 < this.anInt668 - 1) {
							this.anIntArrayArrayArray5[0][local16][local12] = this.anIntArrayArrayArray5[0][local16][local12 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("90385, " + arg0 + ", " + 64 + ", " + 64 + ", " + arg1 + ", " + true + ", " + local157.toString());
			throw new RuntimeException();
		}
	}
}
