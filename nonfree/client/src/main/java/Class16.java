import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IPCPGCKM")
public final class Class16 {

	@OriginalMember(owner = "client!IPCPGCKM", name = "e", descriptor = "I")
	public static int anInt299;

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "I")
	private static int anInt298 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "[I")
	private static final int[] anIntArray105 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!IPCPGCKM", name = "i", descriptor = "I")
	private static int anInt301 = 536;

	@OriginalMember(owner = "client!IPCPGCKM", name = "j", descriptor = "[I")
	private static final int[] anIntArray106 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!IPCPGCKM", name = "l", descriptor = "Z")
	public static boolean aBoolean66 = true;

	@OriginalMember(owner = "client!IPCPGCKM", name = "m", descriptor = "[I")
	private static final int[] anIntArray107 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!IPCPGCKM", name = "o", descriptor = "[I")
	private static final int[] anIntArray108 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!IPCPGCKM", name = "t", descriptor = "I")
	public static int anInt304 = 99;

	@OriginalMember(owner = "client!IPCPGCKM", name = "w", descriptor = "I")
	private static int anInt307 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!IPCPGCKM", name = "h", descriptor = "I")
	private int anInt300 = -38597;

	@OriginalMember(owner = "client!IPCPGCKM", name = "k", descriptor = "I")
	private int anInt302 = 6;

	@OriginalMember(owner = "client!IPCPGCKM", name = "n", descriptor = "I")
	private int anInt303 = -685;

	@OriginalMember(owner = "client!IPCPGCKM", name = "p", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!IPCPGCKM", name = "u", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!IPCPGCKM", name = "v", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!IPCPGCKM", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!IPCPGCKM", name = "d", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!IPCPGCKM", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!IPCPGCKM", name = "s", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!IPCPGCKM", name = "D", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!IPCPGCKM", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!IPCPGCKM", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!IPCPGCKM", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!IPCPGCKM", name = "y", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!IPCPGCKM", name = "z", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!IPCPGCKM", name = "A", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!IPCPGCKM", name = "B", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!IPCPGCKM", name = "C", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIII)I")
	private static int method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub2.anIntArray139[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(BI[[[IILclient!TCDQXHKB;IILclient!VLOWRGUJ;III)V")
	public static void method208(@OriginalArg(1) int arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class35 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = arg1[arg2][arg4][arg0];
			@Pc(29) int local29 = arg1[arg2][arg4 + 1][arg0];
			@Pc(41) int local41 = arg1[arg2][arg4 + 1][arg0 + 1];
			@Pc(51) int local51 = arg1[arg2][arg4][arg0 + 1];
			@Pc(61) int local61 = local19 + local29 + local41 + local51 >> 2;
			@Pc(64) Class48 local64 = Class48.method567(arg8);
			@Pc(76) int local76 = arg4 + (arg0 << 7) + (arg8 << 14) + 1073741824;
			if (!local64.aBoolean198) {
				local76 += Integer.MIN_VALUE;
			}
			@Pc(90) byte local90 = (byte) ((arg9 << 6) + arg5);
			@Pc(110) Class1_Sub1_Sub1 local110;
			if (arg5 == 22) {
				if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
					local110 = local64.method558(22, arg9, local19, local29, local41, local51, -1);
				} else {
					local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, 22, arg8, local51, local64.anInt798, false);
				}
				arg3.method402(arg7, arg0, local61, local110, arg4, local76, local90);
				if (local64.aBoolean193 && local64.aBoolean198) {
					arg6.method522(arg0, arg4);
				}
			} else {
				@Pc(206) int local206;
				if (arg5 == 10 || arg5 == 11) {
					if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
						local110 = local64.method558(10, arg9, local19, local29, local41, local51, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, 10, arg8, local51, local64.anInt798, false);
					}
					if (local110 != null) {
						@Pc(193) int local193 = 0;
						if (arg5 == 11) {
							local193 += 256;
						}
						@Pc(209) int local209;
						if (arg9 == 1 || arg9 == 3) {
							local206 = local64.anInt807;
							local209 = local64.anInt804;
						} else {
							local206 = local64.anInt804;
							local209 = local64.anInt807;
						}
						arg3.method406(arg4, local209, local110, local90, local76, local206, local61, arg0, local193, arg7);
					}
					if (local64.aBoolean193) {
						arg6.method521(local64.anInt804, arg0, local64.anInt807, arg9, arg4, local64.aBoolean190);
					}
				} else if (arg5 >= 12) {
					if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
						local110 = local64.method558(arg5, arg9, local19, local29, local41, local51, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, arg5, arg8, local51, local64.anInt798, false);
					}
					arg3.method406(arg4, 1, local110, local90, local76, 1, local61, arg0, 0, arg7);
					if (local64.aBoolean193) {
						arg6.method521(local64.anInt804, arg0, local64.anInt807, arg9, arg4, local64.aBoolean190);
					}
				} else if (arg5 == 0) {
					if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
						local110 = local64.method558(0, arg9, local19, local29, local41, local51, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, 0, arg8, local51, local64.anInt798, false);
					}
					arg3.method404(anIntArray108[arg9], local110, arg4, null, arg0, local76, 0, arg7, local61, local90);
					if (local64.aBoolean193) {
						arg6.method520(arg4, arg5, arg9, arg0, local64.aBoolean190);
					}
				} else if (arg5 == 1) {
					if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
						local110 = local64.method558(1, arg9, local19, local29, local41, local51, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, 1, arg8, local51, local64.anInt798, false);
					}
					arg3.method404(anIntArray105[arg9], local110, arg4, null, arg0, local76, 0, arg7, local61, local90);
					if (local64.aBoolean193) {
						arg6.method520(arg4, arg5, arg9, arg0, local64.aBoolean190);
					}
				} else {
					@Pc(452) int local452;
					@Pc(481) Class1_Sub1_Sub1 local481;
					if (arg5 == 2) {
						local452 = arg9 + 1 & 0x3;
						@Pc(471) Class1_Sub1_Sub1 local471;
						if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
							local471 = local64.method558(2, arg9 + 4, local19, local29, local41, local51, -1);
							local481 = local64.method558(2, local452, local19, local29, local41, local51, -1);
						} else {
							local471 = new Class1_Sub1_Sub1_Sub1(local19, arg9 + 4, local41, local29, true, 2, arg8, local51, local64.anInt798, false);
							local481 = new Class1_Sub1_Sub1_Sub1(local19, local452, local41, local29, true, 2, arg8, local51, local64.anInt798, false);
						}
						arg3.method404(anIntArray108[arg9], local471, arg4, local481, arg0, local76, anIntArray108[local452], arg7, local61, local90);
						if (local64.aBoolean193) {
							arg6.method520(arg4, arg5, arg9, arg0, local64.aBoolean190);
						}
					} else if (arg5 == 3) {
						if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
							local110 = local64.method558(3, arg9, local19, local29, local41, local51, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, 3, arg8, local51, local64.anInt798, false);
						}
						arg3.method404(anIntArray105[arg9], local110, arg4, null, arg0, local76, 0, arg7, local61, local90);
						if (local64.aBoolean193) {
							arg6.method520(arg4, arg5, arg9, arg0, local64.aBoolean190);
						}
					} else if (arg5 == 9) {
						if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
							local110 = local64.method558(arg5, arg9, local19, local29, local41, local51, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub1(local19, arg9, local41, local29, true, arg5, arg8, local51, local64.anInt798, false);
						}
						arg3.method406(arg4, 1, local110, local90, local76, 1, local61, arg0, 0, arg7);
						if (local64.aBoolean193) {
							arg6.method521(local64.anInt804, arg0, local64.anInt807, arg9, arg4, local64.aBoolean190);
						}
					} else {
						if (local64.aBoolean195) {
							if (arg9 == 1) {
								local452 = local51;
								local51 = local41;
								local41 = local29;
								local29 = local19;
								local19 = local452;
							} else if (arg9 == 2) {
								local452 = local51;
								local51 = local29;
								local29 = local452;
								local452 = local41;
								local41 = local19;
								local19 = local452;
							} else if (arg9 == 3) {
								local452 = local51;
								local51 = local19;
								local19 = local29;
								local29 = local41;
								local41 = local452;
							}
						}
						if (arg5 == 4) {
							if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
								local110 = local64.method558(4, 0, local19, local29, local41, local51, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub1(local19, 0, local41, local29, true, 4, arg8, local51, local64.anInt798, false);
							}
							arg3.method405(local76, local90, local110, 0, local61, arg7, 0, anIntArray108[arg9], arg4, arg0, arg9 * 512);
						} else if (arg5 == 5) {
							local452 = 16;
							local206 = arg3.method422(arg7, arg4, arg0);
							if (local206 > 0) {
								local452 = Class48.method567(local206 >> 14 & 0x7FFF).anInt811;
							}
							if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
								local481 = local64.method558(4, 0, local19, local29, local41, local51, -1);
							} else {
								local481 = new Class1_Sub1_Sub1_Sub1(local19, 0, local41, local29, true, 4, arg8, local51, local64.anInt798, false);
							}
							arg3.method405(local76, local90, local481, anIntArray106[arg9] * local452, local61, arg7, anIntArray107[arg9] * local452, anIntArray108[arg9], arg4, arg0, arg9 * 512);
						} else if (arg5 == 6) {
							if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
								local110 = local64.method558(4, 0, local19, local29, local41, local51, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub1(local19, 0, local41, local29, true, 4, arg8, local51, local64.anInt798, false);
							}
							arg3.method405(local76, local90, local110, 0, local61, arg7, 0, 256, arg4, arg0, arg9);
						} else if (arg5 == 7) {
							if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
								local110 = local64.method558(4, 0, local19, local29, local41, local51, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub1(local19, 0, local41, local29, true, 4, arg8, local51, local64.anInt798, false);
							}
							arg3.method405(local76, local90, local110, 0, local61, arg7, 0, 512, arg4, arg0, arg9);
						} else if (arg5 == 8) {
							if (local64.anInt798 == -1 && local64.anIntArray206 == null) {
								local110 = local64.method558(4, 0, local19, local29, local41, local51, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub1(local19, 0, local41, local29, true, 4, arg8, local51, local64.anInt798, false);
							}
							arg3.method405(local76, local90, local110, 0, local61, arg7, 0, 768, arg4, arg0, arg9);
						}
					}
				}
			}
		} catch (@Pc(1020) RuntimeException local1020) {
			signlink.reporterror("46560, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1020.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(II)I")
	private static int method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method228(arg0 + 45365, arg1 + 91923, 4) + (method228(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method228(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(ZI[BI)Z")
	public static boolean method212(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg1, anInt301);
			@Pc(15) int local15 = -1;
			label53: while (true) {
				@Pc(18) int local18 = local9.method69();
				if (local18 == 0) {
					return local3;
				}
				local15 += local18;
				@Pc(26) int local26 = 0;
				@Pc(28) boolean local28 = false;
				while (true) {
					@Pc(33) int local33;
					while (!local28) {
						local33 = local9.method69();
						if (local33 == 0) {
							continue label53;
						}
						local26 += local33 - 1;
						@Pc(55) int local55 = local26 & 0x3F;
						@Pc(61) int local61 = local26 >> 6 & 0x3F;
						@Pc(66) int local66 = local9.method55() >> 2;
						@Pc(70) int local70 = local61 + arg2;
						@Pc(74) int local74 = local55 + arg0;
						if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
							@Pc(87) Class48 local87 = Class48.method567(local15);
							if (local66 != 22 || !aBoolean66 || local87.aBoolean198 || local87.aBoolean203) {
								local3 &= local87.method561();
								local28 = true;
							}
						}
					}
					local33 = local9.method69();
					if (local33 == 0) {
						break;
					}
					local9.method55();
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("22537, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(II)I")
	private static int method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "(II)I")
	private static int method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method214(arg0 - 1, arg1 - 1) + method214(arg0 + 1, arg1 - 1) + method214(arg0 - 1, arg1 + 1) + method214(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method214(arg0 - 1, arg1) + method214(arg0 + 1, arg1) + method214(arg0, arg1 - 1) + method214(arg0, arg1 + 1);
		@Pc(59) int local59 = method214(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "e", descriptor = "(II)I")
	private static int method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(ZII)Z")
	public static boolean method226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) Class48 local8 = Class48.method567(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local8.method557(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("63536, " + true + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(Lclient!CMGGUSPR;Lclient!UCDUMMGN;I)V")
	public static void method227(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class36_Sub1 arg1) {
		try {
			@Pc(6) int local6 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method69();
				if (local9 == 0) {
					return;
				}
				local6 += local9;
				@Pc(18) Class48 local18 = Class48.method567(local6);
				local18.method560(arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method69();
					if (local25 == 0) {
						break;
					}
					arg0.method55();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("14489, " + arg0 + ", " + arg1 + ", " + -781 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(III)I")
	private static int method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method217(local3, local13);
		@Pc(29) int local29 = method217(local3 + 1, local13);
		@Pc(35) int local35 = method217(local3, local13 + 1);
		@Pc(43) int local43 = method217(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method207(local23, local29, local9, arg2);
		@Pc(55) int local55 = method207(local35, local43, local9, arg2);
		return method207(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "<init>", descriptor = "(I[[[B[[[III)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			anInt304 = 99;
			this.anInt305 = arg0;
			this.anInt306 = arg4;
			this.anIntArrayArrayArray3 = arg2;
			this.aByteArrayArrayArray2 = arg1;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt305][this.anInt306];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt305][this.anInt306];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt305][this.anInt306];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt305][this.anInt306];
			this.anIntArrayArrayArray4 = new int[4][this.anInt305 + 1][this.anInt306 + 1];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt305 + 1][this.anInt306 + 1];
			this.anIntArrayArray11 = new int[this.anInt305 + 1][this.anInt306 + 1];
			this.anIntArray109 = new int[this.anInt306];
			this.anIntArray110 = new int[this.anInt306];
			this.anIntArray111 = new int[this.anInt306];
			this.anIntArray112 = new int[this.anInt306];
			this.anIntArray113 = new int[this.anInt306];
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("44031, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIILclient!TCDQXHKB;IIILclient!VLOWRGUJ;I)V")
	private void method210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean66 && (this.aByteArrayArrayArray2[0][arg7][arg4] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray2[arg1][arg7][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method220(arg1, arg7, arg4) != anInt299) {
					return;
				}
			}
			if (arg1 < anInt304) {
				anInt304 = arg1;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray3[arg1][arg7][arg4];
			@Pc(60) int local60 = this.anIntArrayArrayArray3[arg1][arg7 + 1][arg4];
			@Pc(73) int local73 = this.anIntArrayArrayArray3[arg1][arg7 + 1][arg4 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray3[arg1][arg7][arg4 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class48 local97 = Class48.method567(arg3);
			@Pc(109) int local109 = arg7 + (arg4 << 7) + (arg3 << 14) + 1073741824;
			if (!local97.aBoolean198) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(123) byte local123 = (byte) ((arg0 << 6) + arg5);
			@Pc(157) Class1_Sub1_Sub1 local157;
			if (arg5 != 22) {
				@Pc(255) int local255;
				if (arg5 == 10 || arg5 == 11) {
					if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
						local157 = local97.method558(10, arg0, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, 10, arg3, local84, local97.anInt798, false);
					}
					if (local157 != null) {
						@Pc(242) int local242 = 0;
						if (arg5 == 11) {
							local242 += 256;
						}
						@Pc(258) int local258;
						if (arg0 == 1 || arg0 == 3) {
							local255 = local97.anInt807;
							local258 = local97.anInt804;
						} else {
							local255 = local97.anInt804;
							local258 = local97.anInt807;
						}
						if (arg2.method406(arg7, local258, local157, local123, local109, local255, local94, arg4, local242, arg1) && local97.aBoolean197) {
							@Pc(289) Class1_Sub1_Sub1_Sub2 local289;
							if (local157 instanceof Class1_Sub1_Sub1_Sub2) {
								local289 = (Class1_Sub1_Sub1_Sub2) local157;
							} else {
								local289 = local97.method558(10, arg0, local49, local60, local73, local84, -1);
							}
							if (local289 != null) {
								for (@Pc(305) int local305 = 0; local305 <= local255; local305++) {
									for (@Pc(309) int local309 = 0; local309 <= local258; local309++) {
										@Pc(316) int local316 = local289.anInt139 / 4;
										if (local316 > 30) {
											local316 = 30;
										}
										if (local316 > this.aByteArrayArrayArray3[arg1][arg7 + local305][arg4 + local309]) {
											this.aByteArrayArrayArray3[arg1][arg7 + local305][arg4 + local309] = (byte) local316;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean193 && arg6 != null) {
						arg6.method521(local97.anInt804, arg4, local97.anInt807, arg0, arg7, local97.aBoolean190);
					}
				} else if (arg5 >= 12) {
					if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
						local157 = local97.method558(arg5, arg0, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, arg5, arg3, local84, local97.anInt798, false);
					}
					arg2.method406(arg7, 1, local157, local123, local109, 1, local94, arg4, 0, arg1);
					if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x924;
					}
					if (local97.aBoolean193 && arg6 != null) {
						arg6.method521(local97.anInt804, arg4, local97.anInt807, arg0, arg7, local97.aBoolean190);
					}
				} else if (arg5 == 0) {
					if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
						local157 = local97.method558(0, arg0, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, 0, arg3, local84, local97.anInt798, false);
					}
					arg2.method404(anIntArray108[arg0], local157, arg7, null, arg4, local109, 0, arg1, local94, local123);
					if (arg0 == 0) {
						if (local97.aBoolean197) {
							this.aByteArrayArrayArray3[arg1][arg7][arg4] = 50;
							this.aByteArrayArrayArray3[arg1][arg7][arg4 + 1] = 50;
						}
						if (local97.aBoolean202) {
							this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local97.aBoolean197) {
							this.aByteArrayArrayArray3[arg1][arg7][arg4 + 1] = 50;
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean202) {
							this.anIntArrayArrayArray4[arg1][arg7][arg4 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local97.aBoolean197) {
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4] = 50;
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4 + 1] = 50;
						}
						if (local97.aBoolean202) {
							this.anIntArrayArrayArray4[arg1][arg7 + 1][arg4] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local97.aBoolean197) {
							this.aByteArrayArrayArray3[arg1][arg7][arg4] = 50;
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4] = 50;
						}
						if (local97.aBoolean202) {
							this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x492;
						}
					}
					if (local97.aBoolean193 && arg6 != null) {
						arg6.method520(arg7, arg5, arg0, arg4, local97.aBoolean190);
					}
					if (local97.anInt811 != 16) {
						arg2.method412(arg1, local97.anInt811, arg7, arg4);
					}
				} else if (arg5 == 1) {
					if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
						local157 = local97.method558(1, arg0, local49, local60, local73, local84, -1);
					} else {
						local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, 1, arg3, local84, local97.anInt798, false);
					}
					arg2.method404(anIntArray105[arg0], local157, arg7, null, arg4, local109, 0, arg1, local94, local123);
					if (local97.aBoolean197) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray3[arg1][arg7][arg4 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray3[arg1][arg7][arg4] = 50;
						}
					}
					if (local97.aBoolean193 && arg6 != null) {
						arg6.method520(arg7, arg5, arg0, arg4, local97.aBoolean190);
					}
				} else {
					@Pc(866) int local866;
					@Pc(895) Class1_Sub1_Sub1 local895;
					if (arg5 == 2) {
						local866 = arg0 + 1 & 0x3;
						@Pc(885) Class1_Sub1_Sub1 local885;
						if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
							local885 = local97.method558(2, arg0 + 4, local49, local60, local73, local84, -1);
							local895 = local97.method558(2, local866, local49, local60, local73, local84, -1);
						} else {
							local885 = new Class1_Sub1_Sub1_Sub1(local49, arg0 + 4, local73, local60, true, 2, arg3, local84, local97.anInt798, false);
							local895 = new Class1_Sub1_Sub1_Sub1(local49, local866, local73, local60, true, 2, arg3, local84, local97.anInt798, false);
						}
						arg2.method404(anIntArray108[arg0], local885, arg7, local895, arg4, local109, anIntArray108[local866], arg1, local94, local123);
						if (local97.aBoolean202) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg1][arg7][arg4 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray4[arg1][arg7][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg1][arg7 + 1][arg4] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray4[arg1][arg7 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x492;
								this.anIntArrayArrayArray4[arg1][arg7][arg4] |= 0x249;
							}
						}
						if (local97.aBoolean193 && arg6 != null) {
							arg6.method520(arg7, arg5, arg0, arg4, local97.aBoolean190);
						}
						if (local97.anInt811 != 16) {
							arg2.method412(arg1, local97.anInt811, arg7, arg4);
						}
					} else if (arg5 == 3) {
						if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
							local157 = local97.method558(3, arg0, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, 3, arg3, local84, local97.anInt798, false);
						}
						arg2.method404(anIntArray105[arg0], local157, arg7, null, arg4, local109, 0, arg1, local94, local123);
						if (local97.aBoolean197) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray3[arg1][arg7][arg4 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray3[arg1][arg7 + 1][arg4] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray3[arg1][arg7][arg4] = 50;
							}
						}
						if (local97.aBoolean193 && arg6 != null) {
							arg6.method520(arg7, arg5, arg0, arg4, local97.aBoolean190);
						}
					} else if (arg5 == 9) {
						if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
							local157 = local97.method558(arg5, arg0, local49, local60, local73, local84, -1);
						} else {
							local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, arg5, arg3, local84, local97.anInt798, false);
						}
						arg2.method406(arg7, 1, local157, local123, local109, 1, local94, arg4, 0, arg1);
						if (local97.aBoolean193 && arg6 != null) {
							arg6.method521(local97.anInt804, arg4, local97.anInt807, arg0, arg7, local97.aBoolean190);
						}
					} else {
						if (local97.aBoolean195) {
							if (arg0 == 1) {
								local866 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local866;
							} else if (arg0 == 2) {
								local866 = local84;
								local84 = local60;
								local60 = local866;
								local866 = local73;
								local73 = local49;
								local49 = local866;
							} else if (arg0 == 3) {
								local866 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local866;
							}
						}
						if (arg5 == 4) {
							if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
								local157 = local97.method558(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub1(local49, 0, local73, local60, true, 4, arg3, local84, local97.anInt798, false);
							}
							arg2.method405(local109, local123, local157, 0, local94, arg1, 0, anIntArray108[arg0], arg7, arg4, arg0 * 512);
						} else if (arg5 == 5) {
							local866 = 16;
							local255 = arg2.method422(arg1, arg7, arg4);
							if (local255 > 0) {
								local866 = Class48.method567(local255 >> 14 & 0x7FFF).anInt811;
							}
							if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
								local895 = local97.method558(4, 0, local49, local60, local73, local84, -1);
							} else {
								local895 = new Class1_Sub1_Sub1_Sub1(local49, 0, local73, local60, true, 4, arg3, local84, local97.anInt798, false);
							}
							arg2.method405(local109, local123, local895, anIntArray106[arg0] * local866, local94, arg1, anIntArray107[arg0] * local866, anIntArray108[arg0], arg7, arg4, arg0 * 512);
						} else if (arg5 == 6) {
							if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
								local157 = local97.method558(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub1(local49, 0, local73, local60, true, 4, arg3, local84, local97.anInt798, false);
							}
							arg2.method405(local109, local123, local157, 0, local94, arg1, 0, 256, arg7, arg4, arg0);
						} else if (arg5 == 7) {
							if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
								local157 = local97.method558(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub1(local49, 0, local73, local60, true, 4, arg3, local84, local97.anInt798, false);
							}
							arg2.method405(local109, local123, local157, 0, local94, arg1, 0, 512, arg7, arg4, arg0);
						} else if (arg5 == 8) {
							if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
								local157 = local97.method558(4, 0, local49, local60, local73, local84, -1);
							} else {
								local157 = new Class1_Sub1_Sub1_Sub1(local49, 0, local73, local60, true, 4, arg3, local84, local97.anInt798, false);
							}
							arg2.method405(local109, local123, local157, 0, local94, arg1, 0, 768, arg7, arg4, arg0);
						}
					}
				}
			} else if (!aBoolean66 || local97.aBoolean198 || local97.aBoolean203) {
				if (local97.anInt798 == -1 && local97.anIntArray206 == null) {
					local157 = local97.method558(22, arg0, local49, local60, local73, local84, -1);
				} else {
					local157 = new Class1_Sub1_Sub1_Sub1(local49, arg0, local73, local60, true, 22, arg3, local84, local97.anInt798, false);
				}
				arg2.method402(arg1, arg4, local94, local157, arg7, local109, local123);
				if (local97.aBoolean193 && local97.aBoolean198 && arg6 != null) {
					arg6.method522(arg4, arg7);
				}
			}
		} catch (@Pc(1640) RuntimeException local1640) {
			signlink.reporterror("91743, " + -71 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1640.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "([Lclient!VLOWRGUJ;Lclient!TCDQXHKB;I)V")
	public void method211(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) Class35 arg1) {
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
								arg0[local27].method522(local11, local7);
							}
						}
					}
				}
			}
			anInt307 += (int) (Math.random() * 5.0D) - 2;
			if (anInt307 < -8) {
				anInt307 = -8;
			}
			if (anInt307 > 8) {
				anInt307 = 8;
			}
			anInt298 += (int) (Math.random() * 5.0D) - 2;
			if (anInt298 < -16) {
				anInt298 = -16;
			}
			if (anInt298 > 16) {
				anInt298 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray3[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt306 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt305 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray11[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt306; local145++) {
					this.anIntArray109[local145] = 0;
					this.anIntArray110[local145] = 0;
					this.anIntArray111[local145] = 0;
					this.anIntArray112[local145] = 0;
					this.anIntArray113[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt305 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt306; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt305) {
							local210 = this.aByteArrayArrayArray4[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class14 local378 = Class14.aClass14Array1[local210 - 1];
								this.anIntArray109[local191] += local378.anInt172;
								this.anIntArray110[local191] += local378.anInt170;
								this.anIntArray111[local191] += local378.anInt171;
								this.anIntArray112[local191] += local378.anInt173;
								local419 = this.anIntArray113[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt305) {
							local214 = this.aByteArrayArrayArray4[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class14 local451 = Class14.aClass14Array1[local214 - 1];
								this.anIntArray109[local191] -= local451.anInt172;
								this.anIntArray110[local191] -= local451.anInt170;
								this.anIntArray111[local191] -= local451.anInt171;
								this.anIntArray112[local191] -= local451.anInt173;
								local419 = this.anIntArray113[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt305 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt306 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt306) {
								local204 += this.anIntArray109[local527];
								local210 += this.anIntArray110[local527];
								local214 += this.anIntArray111[local527];
								local220 += this.anIntArray112[local527];
								local236 += this.anIntArray113[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt306) {
								local204 -= this.anIntArray109[local572];
								local210 -= this.anIntArray110[local572];
								local214 -= this.anIntArray111[local572];
								local220 -= this.anIntArray112[local572];
								local236 -= this.anIntArray113[local572];
							}
							if (local284 >= 1 && local284 < this.anInt306 - 1 && (!aBoolean66 || (this.aByteArrayArrayArray2[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray2[local7][local169][local284] & 0x10) == 0 && this.method220(local7, local169, local284) == anInt299)) {
								if (local7 < anInt304) {
									anInt304 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray4[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray11[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray11[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray11[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray11[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method215(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt307 & 0xFF;
										local786 += anInt298;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method215(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray5[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class14.aClass14Array1[local682 - 1].aBoolean51) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class1_Sub1_Sub2_Sub2.anIntArray143[method225(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method401(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method225(local768, local737), method225(local768, local746), method225(local768, local757), method225(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray5[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray6[local7][local169][local284];
										@Pc(941) Class14 local941 = Class14.aClass14Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt168;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class1_Sub1_Sub2_Sub2.method341(local944);
											local952 = -1;
										} else if (local941.anInt167 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class1_Sub1_Sub2_Sub2.anIntArray143[this.method219(local941.anInt174, 96)];
										} else {
											local952 = this.method215(local941.anInt169, local941.anInt170, local941.anInt171);
											local950 = Class1_Sub1_Sub2_Sub2.anIntArray143[this.method219(local941.anInt174, 96)];
										}
										arg1.method401(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method225(local768, local737), method225(local768, local746), method225(local768, local757), method225(local768, local766), this.method219(local952, local737), this.method219(local952, local746), this.method219(local952, local757), this.method219(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt306 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt305 - 1; local204++) {
						arg1.method400(local7, local204, local191, this.method220(local7, local204, local191));
					}
				}
			}
			arg1.method427();
			for (local11 = 0; local11 < this.anInt305; local11++) {
				for (local27 = 0; local27 < this.anInt306; local27++) {
					if ((this.aByteArrayArrayArray2[1][local11][local27] & 0x2) == 2) {
						arg1.method398(local11, this.anInt300, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1138) int local1138 = 2;
			@Pc(1140) int local1140 = 4;
			for (@Pc(1142) int local1142 = 0; local1142 < 4; local1142++) {
				if (local1142 > 0) {
					local27 <<= 0x3;
					local1138 <<= 0x3;
					local1140 <<= 0x3;
				}
				for (@Pc(1160) int local1160 = 0; local1160 <= local1142; local1160++) {
					for (local133 = 0; local133 <= this.anInt306; local133++) {
						for (local139 = 0; local139 <= this.anInt305; local139++) {
							if ((this.anIntArrayArrayArray4[local1160][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1160;
								local191 = local1160;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1160][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt306 && (this.anIntArrayArrayArray4[local1160][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1142) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class35.method399(local220, 1, local214, local1142, local139 * 128, local141 * 128, 656, local139 * 128, local145 * 128 + 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1160][local139][local133] & local1138) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1160;
								local191 = local1160;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1160][local141 - 1][local133] & local1138) != 0) {
									local141--;
								}
								while (local145 < this.anInt305 && (this.anIntArrayArrayArray4[local1160][local145 + 1][local133] & local1138) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1138) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1142) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1138) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class35.method399(local220, 2, local214, local1142, local141 * 128, local133 * 128, 656, local145 * 128 + 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1138;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1160][local139][local133] & local1140) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1160][local139][local169 - 1] & local1140) != 0) {
									local169--;
								}
								while (local191 < this.anInt306 && (this.anIntArrayArrayArray4[local1160][local139][local191 + 1] & local1140) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1160][local141 - 1][local204] & local1140) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt305) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1160][local145 + 1][local204] & local1140) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1160][local141][local169];
									Class35.method399(local204, 4, local204, local1142, local141 * 128, local169 * 128, 656, local145 * 128 + 128, local191 * 128 + 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1160][local210][local214] &= ~local1140;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1775) RuntimeException local1775) {
			signlink.reporterror("95741, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local1775.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IILclient!CMGGUSPR;ZIIII)V")
	private void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(32) int local32;
			if (arg1 >= 0 && arg1 < 104 && arg5 >= 0 && arg5 < 104) {
				this.aByteArrayArrayArray2[arg0][arg1][arg5] = 0;
				while (true) {
					local32 = arg2.method55();
					if (local32 == 0) {
						if (arg0 == 0) {
							this.anIntArrayArrayArray3[0][arg1][arg5] = -method209(arg1 + arg3 + 932731, arg5 + 556238 + arg4) * 8;
							return;
						} else {
							this.anIntArrayArrayArray3[arg0][arg1][arg5] = this.anIntArrayArrayArray3[arg0 - 1][arg1][arg5] - 240;
							return;
						}
					}
					if (local32 == 1) {
						@Pc(86) int local86 = arg2.method55();
						if (local86 == 1) {
							local86 = 0;
						}
						if (arg0 == 0) {
							this.anIntArrayArrayArray3[0][arg1][arg5] = -local86 * 8;
							return;
						}
						this.anIntArrayArrayArray3[arg0][arg1][arg5] = this.anIntArrayArrayArray3[arg0 - 1][arg1][arg5] - local86 * 8;
						return;
					}
					if (local32 <= 49) {
						this.aByteArrayArrayArray1[arg0][arg1][arg5] = arg2.method56();
						this.aByteArrayArrayArray5[arg0][arg1][arg5] = (byte) ((local32 - 2) / 4);
						this.aByteArrayArrayArray6[arg0][arg1][arg5] = (byte) (local32 + arg6 - 2 & 0x3);
					} else if (local32 <= 81) {
						this.aByteArrayArrayArray2[arg0][arg1][arg5] = (byte) (local32 - 49);
					} else {
						this.aByteArrayArrayArray4[arg0][arg1][arg5] = (byte) (local32 - 81);
					}
				}
			} else {
				while (true) {
					local32 = arg2.method55();
					if (local32 == 0) {
						return;
					}
					if (local32 == 1) {
						arg2.method55();
						return;
					}
					if (local32 <= 49) {
						arg2.method55();
					}
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("21578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(III)I")
	private int method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIIILclient!TCDQXHKB;II[Lclient!VLOWRGUJ;I[BI)V")
	public void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class35 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class40[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg8, anInt301);
			@Pc(14) int local14 = -1;
			while (true) {
				@Pc(17) int local17 = local12.method69();
				if (local17 == 0) {
					return;
				}
				local14 += local17;
				@Pc(25) int local25 = 0;
				while (true) {
					@Pc(28) int local28 = local12.method69();
					if (local28 == 0) {
						break;
					}
					local25 += local28 - 1;
					@Pc(40) int local40 = local25 & 0x3F;
					@Pc(46) int local46 = local25 >> 6 & 0x3F;
					@Pc(50) int local50 = local25 >> 12;
					@Pc(53) int local53 = local12.method55();
					@Pc(57) int local57 = local53 >> 2;
					@Pc(61) int local61 = local53 & 0x3;
					if (local50 == arg0 && local46 >= arg2 && local46 < arg2 + 8 && local40 >= arg5 && local40 < arg5 + 8) {
						@Pc(83) Class48 local83 = Class48.method567(local14);
						@Pc(100) int local100 = arg7 + Class28.method375(arg9, local46 & 0x7, local83.anInt807, local83.anInt804, local40 & 0x7, local61);
						@Pc(117) int local117 = arg3 + Class28.method376(local83.anInt804, local46 & 0x7, arg9, local61, local40 & 0x7, local83.anInt807);
						if (local100 > 0 && local117 > 0 && local100 < 103 && local117 < 103) {
							@Pc(129) int local129 = arg1;
							if ((this.aByteArrayArrayArray2[1][local100][local117] & 0x2) == 2) {
								local129 = arg1 - 1;
							}
							@Pc(144) Class40 local144 = null;
							if (local129 >= 0) {
								local144 = arg6[local129];
							}
							this.method210(local61 + arg9 & 0x3, arg1, arg4, local14, local117, local57, local144, local100);
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("96101, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -316 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIBLclient!TCDQXHKB;[Lclient!VLOWRGUJ;[B)V")
	public void method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) Class40[] arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, anInt301);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method69();
				if (local16 == 0) {
					return;
				}
				local9 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method69();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method55();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg0;
					@Pc(68) int local68 = local39 + arg1;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray2[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class40 local95 = null;
						if (local80 >= 0) {
							local95 = arg3[local80];
						}
						this.method210(local60, local49, arg2, local9, local68, local56, local95, local64);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("17044, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "d", descriptor = "(II)I")
	private int method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!IPCPGCKM", name = "b", descriptor = "(IIII)I")
	private int method220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray2[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray2[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("91079, " + arg0 + ", " + 33 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(I[Lclient!VLOWRGUJ;II[BIIIII)V")
	public void method221(@OriginalArg(0) int arg0, @OriginalArg(1) Class40[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg0 + local3 > 0 && arg0 + local3 < 103 && arg8 + local7 > 0 && arg8 + local7 < 103) {
						arg1[arg6].anIntArrayArray19[arg0 + local3][arg8 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub3 local57 = new Class1_Sub1_Sub3(arg4, anInt301);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg7 && local63 >= arg5 && local63 < arg5 + 8 && local67 >= arg2 && local67 < arg2 + 8) {
							this.method213(arg6, arg0 + Class28.method373(local63 & 0x7, arg3, local67 & 0x7), local57, 0, 0, arg8 + Class28.method374(arg3, local67 & 0x7, local63 & 0x7), arg3);
						} else {
							this.method213(0, -1, local57, 0, 0, -1, 0);
						}
					}
				}
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("20401, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 32496 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "([Lclient!VLOWRGUJ;III[BII)V")
	public void method222(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(14) int local14;
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < 64; local10++) {
					for (local14 = 0; local14 < 64; local14++) {
						if (arg1 + local10 > 0 && arg1 + local10 < 103 && arg2 + local14 > 0 && arg2 + local14 < 103) {
							arg0[local6].anIntArrayArray19[arg1 + local10][arg2 + local14] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class1_Sub1_Sub3 local68 = new Class1_Sub1_Sub3(arg4, anInt301);
			for (local14 = 0; local14 < 4; local14++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method213(local14, local74 + arg1, local68, arg3, arg5, local78 + arg2, 0);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("32545, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "a", descriptor = "(IIIIZ)V")
	public void method223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(6) int local6 = arg3; local6 <= arg3 + arg0; local6++) {
				for (@Pc(10) int local10 = arg2; local10 <= arg2 + arg1; local10++) {
					if (local10 >= 0 && local10 < this.anInt305 && local6 >= 0 && local6 < this.anInt306) {
						this.aByteArrayArrayArray3[0][local10][local6] = 127;
						if (local10 == arg2 && local10 > 0) {
							this.anIntArrayArrayArray3[0][local10][local6] = this.anIntArrayArrayArray3[0][local10 - 1][local6];
						}
						if (local10 == arg2 + arg1 && local10 < this.anInt305 - 1) {
							this.anIntArrayArrayArray3[0][local10][local6] = this.anIntArrayArrayArray3[0][local10 + 1][local6];
						}
						if (local6 == arg3 && local6 > 0) {
							this.anIntArrayArrayArray3[0][local10][local6] = this.anIntArrayArrayArray3[0][local10][local6 - 1];
						}
						if (local6 == arg3 + arg0 && local6 < this.anInt306 - 1) {
							this.anIntArrayArrayArray3[0][local10][local6] = this.anIntArrayArrayArray3[0][local10][local6 + 1];
						}
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("31748, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IPCPGCKM", name = "c", descriptor = "(IIII)V")
	public void method224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg2 + local3][arg0 + local7] = 0;
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg2][arg0 + local7] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 + local7];
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray3[arg1][arg2 + local7][arg0] = this.anIntArrayArrayArray3[arg1][arg2 + local7][arg0 - 1];
				}
			}
			if (arg2 > 0 && this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2][arg0 - 1];
			} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray3[arg1][arg2][arg0] = this.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1];
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("44814, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}
}
