import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private static boolean aBoolean27;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt166;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private static int anInt169;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt170;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt165 = 32;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private static int anInt167 = 9;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	public static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray22 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	private static final int[] anIntArray23 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
	private static final int[] anIntArray24 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "D", descriptor = "I")
	private static int anInt173 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	private static int anInt174 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt168 = -128;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z[BII)Z")
	public static boolean method54(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg0, true);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method517();
				if (local20 == 0) {
					return local3;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method517();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method503() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg1;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class11 local89 = Class11.method292(local17);
							if (local68 != 22 || !aBoolean28 || local89.aBoolean122 || local89.aBoolean128) {
								local3 &= local89.method296();
								local30 = true;
							}
						}
					}
					local35 = local9.method517();
					if (local35 == 0) {
						break;
					}
					local9.method503();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("10444, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vb;ILclient!mb;)V")
	public static void method55(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(14) int local14 = arg1.method517();
				if (local14 == 0) {
					return;
				}
				local3 += local14;
				@Pc(23) Class11 local23 = Class11.method292(local3);
				local23.method297(arg0);
				while (true) {
					@Pc(30) int local30 = arg1.method517();
					if (local30 == 0) {
						break;
					}
					arg1.method503();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("43612, " + arg0 + ", " + -4 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method61(arg0 + 45365, arg1 + 91923, 4) + (method61(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method61(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method63(local3, local13);
		@Pc(29) int local29 = method63(local3 + 1, local13);
		@Pc(35) int local35 = method63(local3, local13 + 1);
		@Pc(43) int local43 = method63(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method62(local23, local29, local9, arg2);
		@Pc(55) int local55 = method62(local35, local43, local9, arg2);
		return method62(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray171[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method64(arg0 - 1, arg1 - 1) + method64(arg0 + 1, arg1 - 1) + method64(arg0 - 1, arg1 + 1) + method64(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method64(arg0 - 1, arg1) + method64(arg0 + 1, arg1) + method64(arg0, arg1 - 1) + method64(arg0, arg1 + 1);
		@Pc(59) int local59 = method64(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)Z")
	public static boolean method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(2) Class11 local2 = Class11.method292(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local2.method295(anInt169, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("36023, " + true + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIB[[[ILclient!r;IIILclient!kc;)V")
	public static void method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[][][] arg4, @OriginalArg(6) Class36 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class21 arg9) {
		try {
			@Pc(9) int local9 = arg4[arg7][arg3][arg6];
			@Pc(19) int local19 = arg4[arg7][arg3 + 1][arg6];
			@Pc(41) int local41 = arg4[arg7][arg3 + 1][arg6 + 1];
			@Pc(51) int local51 = arg4[arg7][arg3][arg6 + 1];
			@Pc(61) int local61 = local9 + local19 + local41 + local51 >> 2;
			@Pc(64) Class11 local64 = Class11.method292(arg8);
			@Pc(76) int local76 = arg3 + (arg6 << 7) + (arg8 << 14) + 1073741824;
			if (!local64.aBoolean122) {
				local76 += Integer.MIN_VALUE;
			}
			@Pc(90) byte local90 = (byte) ((arg0 << 6) + arg1);
			@Pc(107) Class1_Sub1_Sub1 local107;
			if (arg1 == 22) {
				if (local64.anInt522 == -1) {
					local107 = local64.method298(22, arg0, local9, local19, local41, local51, -1);
				} else {
					local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, 22, local41);
				}
				arg5.method554(arg3, arg6, local61, local76, local107, arg2, local90);
				if (local64.aBoolean120 && local64.aBoolean122) {
					arg9.method446(arg6, arg3);
				}
			} else {
				@Pc(200) int local200;
				if (arg1 == 10 || arg1 == 11) {
					if (local64.anInt522 == -1) {
						local107 = local64.method298(10, arg0, local9, local19, local41, local51, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, 10, local41);
					}
					if (local107 != null) {
						@Pc(187) int local187 = 0;
						if (arg1 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg0 == 1 || arg0 == 3) {
							local200 = local64.anInt521;
							local203 = local64.anInt520;
						} else {
							local200 = local64.anInt520;
							local203 = local64.anInt521;
						}
						arg5.method558(local203, local200, arg3, local90, arg6, local107, local187, arg2, local76, anInt165, local61);
					}
					if (local64.aBoolean120) {
						arg9.method445(local64.anInt521, arg0, local64.anInt520, local64.aBoolean121, arg6, arg3);
					}
				} else if (arg1 >= 12) {
					if (local64.anInt522 == -1) {
						local107 = local64.method298(arg1, arg0, local9, local19, local41, local51, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, arg1, local41);
					}
					arg5.method558(1, 1, arg3, local90, arg6, local107, 0, arg2, local76, anInt165, local61);
					if (local64.aBoolean120) {
						arg9.method445(local64.anInt521, arg0, local64.anInt520, local64.aBoolean121, arg6, arg3);
					}
				} else if (arg1 == 0) {
					if (local64.anInt522 == -1) {
						local107 = local64.method298(0, arg0, local9, local19, local41, local51, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, 0, local41);
					}
					arg5.method556(arg6, local90, local76, null, anIntArray22[arg0], local107, local61, arg3, 0, arg2);
					if (local64.aBoolean120) {
						arg9.method444(local64.aBoolean121, arg6, arg0, anInt166, arg1, arg3);
					}
				} else if (arg1 == 1) {
					if (local64.anInt522 == -1) {
						local107 = local64.method298(1, arg0, local9, local19, local41, local51, -1);
					} else {
						local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, 1, local41);
					}
					arg5.method556(arg6, local90, local76, null, anIntArray23[arg0], local107, local61, arg3, 0, arg2);
					if (local64.aBoolean120) {
						arg9.method444(local64.aBoolean121, arg6, arg0, anInt166, arg1, arg3);
					}
				} else {
					@Pc(437) int local437;
					@Pc(463) Class1_Sub1_Sub1 local463;
					if (arg1 == 2) {
						local437 = arg0 + 1 & 0x3;
						@Pc(453) Class1_Sub1_Sub1 local453;
						if (local64.anInt522 == -1) {
							local453 = local64.method298(2, arg0 + 4, local9, local19, local41, local51, -1);
							local463 = local64.method298(2, local437, local9, local19, local41, local51, -1);
						} else {
							local453 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0 + 4, (byte) 69, true, local19, local9, arg8, local51, 2, local41);
							local463 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, local437, (byte) 69, true, local19, local9, arg8, local51, 2, local41);
						}
						arg5.method556(arg6, local90, local76, local463, anIntArray22[arg0], local453, local61, arg3, anIntArray22[local437], arg2);
						if (local64.aBoolean120) {
							arg9.method444(local64.aBoolean121, arg6, arg0, anInt166, arg1, arg3);
						}
					} else if (arg1 == 3) {
						if (local64.anInt522 == -1) {
							local107 = local64.method298(3, arg0, local9, local19, local41, local51, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, 3, local41);
						}
						arg5.method556(arg6, local90, local76, null, anIntArray23[arg0], local107, local61, arg3, 0, arg2);
						if (local64.aBoolean120) {
							arg9.method444(local64.aBoolean121, arg6, arg0, anInt166, arg1, arg3);
						}
					} else if (arg1 == 9) {
						if (local64.anInt522 == -1) {
							local107 = local64.method298(arg1, arg0, local9, local19, local41, local51, -1);
						} else {
							local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, arg0, (byte) 69, true, local19, local9, arg8, local51, arg1, local41);
						}
						arg5.method558(1, 1, arg3, local90, arg6, local107, 0, arg2, local76, anInt165, local61);
						if (local64.aBoolean120) {
							arg9.method445(local64.anInt521, arg0, local64.anInt520, local64.aBoolean121, arg6, arg3);
						}
					} else {
						if (local64.aBoolean123) {
							if (arg0 == 1) {
								local437 = local51;
								local51 = local41;
								local41 = local19;
								local19 = local9;
								local9 = local437;
							} else if (arg0 == 2) {
								local437 = local51;
								local51 = local19;
								local19 = local437;
								local437 = local41;
								local41 = local9;
								local9 = local437;
							} else if (arg0 == 3) {
								local437 = local51;
								local51 = local9;
								local9 = local19;
								local19 = local41;
								local41 = local437;
							}
						}
						if (arg1 == 4) {
							if (local64.anInt522 == -1) {
								local107 = local64.method298(4, 0, local9, local19, local41, local51, -1);
							} else {
								local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, 0, (byte) 69, true, local19, local9, arg8, local51, 4, local41);
							}
							arg5.method557(0, local107, arg2, arg3, local90, local76, anIntArray22[arg0], arg0 * 512, local61, 0, arg6);
						} else if (arg1 == 5) {
							local437 = 16;
							local200 = arg5.method574(arg2, arg3, arg6);
							if (local200 > 0) {
								local437 = Class11.method292(local200 >> 14 & 0x7FFF).anInt523;
							}
							if (local64.anInt522 == -1) {
								local463 = local64.method298(4, 0, local9, local19, local41, local51, -1);
							} else {
								local463 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, 0, (byte) 69, true, local19, local9, arg8, local51, 4, local41);
							}
							arg5.method557(anIntArray25[arg0] * local437, local463, arg2, arg3, local90, local76, anIntArray22[arg0], arg0 * 512, local61, anIntArray24[arg0] * local437, arg6);
						} else if (arg1 == 6) {
							if (local64.anInt522 == -1) {
								local107 = local64.method298(4, 0, local9, local19, local41, local51, -1);
							} else {
								local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, 0, (byte) 69, true, local19, local9, arg8, local51, 4, local41);
							}
							arg5.method557(0, local107, arg2, arg3, local90, local76, 256, arg0, local61, 0, arg6);
						} else if (arg1 == 7) {
							if (local64.anInt522 == -1) {
								local107 = local64.method298(4, 0, local9, local19, local41, local51, -1);
							} else {
								local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, 0, (byte) 69, true, local19, local9, arg8, local51, 4, local41);
							}
							arg5.method557(0, local107, arg2, arg3, local90, local76, 512, arg0, local61, 0, arg6);
						} else if (arg1 == 8) {
							if (local64.anInt522 == -1) {
								local107 = local64.method298(4, 0, local9, local19, local41, local51, -1);
							} else {
								local107 = new Class1_Sub1_Sub1_Sub2(local64.anInt522, 0, (byte) 69, true, local19, local9, arg8, local51, 4, local41);
							}
							arg5.method557(0, local107, arg2, arg3, local90, local76, 768, arg0, local61, 0, arg6);
						}
					}
				}
			}
		} catch (@Pc(981) RuntimeException local981) {
			signlink.reporterror("66315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -91 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local981.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[III[[[BI)V")
	public Class4(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt171 = arg4;
			this.anInt172 = arg1;
			this.anIntArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt171][this.anInt172];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt171][this.anInt172];
			this.anIntArrayArrayArray2 = new int[4][this.anInt171 + 1][this.anInt172 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt171 + 1][this.anInt172 + 1];
			this.anIntArrayArray1 = new int[this.anInt171 + 1][this.anInt172 + 1];
			this.anIntArray17 = new int[this.anInt172];
			this.anIntArray18 = new int[this.anInt172];
			this.anIntArray19 = new int[this.anInt172];
			this.anIntArray20 = new int[this.anInt172];
			this.anIntArray21 = new int[this.anInt172];
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("19454, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method52(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(3) int local3 = arg0; local3 <= arg0 + 64; local3++) {
				for (@Pc(7) int local7 = arg1; local7 <= arg1 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt171 && local3 >= 0 && local3 < this.anInt172) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg1 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg1 + 64 && local7 < this.anInt171 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg0 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg0 + 64 && local3 < this.anInt172 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("96577, " + 0 + ", " + 64 + ", " + arg0 + ", " + arg1 + ", " + 64 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII[B)V")
	public void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg4, true);
			for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
					for (@Pc(21) int local21 = 0; local21 < 64; local21++) {
						@Pc(27) int local27 = local17 + arg3;
						@Pc(31) int local31 = local21 + arg0;
						@Pc(53) int local53;
						if (local27 >= 0 && local27 < 104 && local31 >= 0 && local31 < 104) {
							this.aByteArrayArrayArray1[local13][local27][local31] = 0;
							while (true) {
								local53 = local11.method503();
								if (local53 == 0) {
									if (local13 == 0) {
										this.anIntArrayArrayArray1[0][local27][local31] = -method60(local27 + arg1 + 932731, local31 + 556238 + arg2) * 8;
									} else {
										this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - 240;
									}
									break;
								}
								if (local53 == 1) {
									@Pc(109) int local109 = local11.method503();
									if (local109 == 1) {
										local109 = 0;
									}
									if (local13 == 0) {
										this.anIntArrayArrayArray1[0][local27][local31] = -local109 * 8;
									} else {
										this.anIntArrayArrayArray1[local13][local27][local31] = this.anIntArrayArrayArray1[local13 - 1][local27][local31] - local109 * 8;
									}
									break;
								}
								if (local53 <= 49) {
									this.aByteArrayArrayArray3[local13][local27][local31] = local11.method504();
									this.aByteArrayArrayArray4[local13][local27][local31] = (byte) ((local53 - 2) / 4);
									this.aByteArrayArrayArray5[local13][local27][local31] = (byte) (local53 - 2 & 0x3);
								} else if (local53 <= 81) {
									this.aByteArrayArrayArray1[local13][local27][local31] = (byte) (local53 - 49);
								} else {
									this.aByteArrayArrayArray2[local13][local27][local31] = (byte) (local53 - 81);
								}
							}
						} else {
							while (true) {
								local53 = local11.method503();
								if (local53 == 0) {
									break;
								}
								if (local53 == 1) {
									local11.method503();
									break;
								}
								if (local53 <= 49) {
									local11.method503();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("32192, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 34545 + ", " + arg4 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BLclient!r;[Lclient!kc;I)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(4) Class21[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, true);
			@Pc(16) int local16 = -1;
			while (true) {
				@Pc(19) int local19 = local7.method517();
				if (local19 == 0) {
					return;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				while (true) {
					@Pc(30) int local30 = local7.method517();
					if (local30 == 0) {
						break;
					}
					local27 += local30 - 1;
					@Pc(42) int local42 = local27 & 0x3F;
					@Pc(48) int local48 = local27 >> 6 & 0x3F;
					@Pc(52) int local52 = local27 >> 12;
					@Pc(55) int local55 = local7.method503();
					@Pc(59) int local59 = local55 >> 2;
					@Pc(63) int local63 = local55 & 0x3;
					@Pc(67) int local67 = local48 + arg1;
					@Pc(71) int local71 = local42 + arg0;
					if (local67 > 0 && local71 > 0 && local67 < 103 && local71 < 103) {
						@Pc(83) int local83 = local52;
						if ((this.aByteArrayArrayArray1[1][local67][local71] & 0x2) == 2) {
							local83 = local52 - 1;
						}
						@Pc(98) Class21 local98 = null;
						if (local83 >= 0) {
							local98 = arg4[local83];
						}
						this.method57(local98, local16, local71, arg3, local59, local63, local67, local52);
					}
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("68310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -128 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!kc;IILclient!r;BIIII)V")
	private void method57(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean28) {
				if ((this.aByteArrayArrayArray1[arg7][arg6][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method59(arg2, arg7, arg6) != anInt170) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray1[arg7][arg6][arg2];
			@Pc(44) int local44 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg2];
			@Pc(57) int local57 = this.anIntArrayArrayArray1[arg7][arg6 + 1][arg2 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray1[arg7][arg6][arg2 + 1];
			@Pc(87) int local87 = local33 + local44 + local57 + local68 >> 2;
			@Pc(90) Class11 local90 = Class11.method292(arg1);
			@Pc(102) int local102 = arg6 + (arg2 << 7) + (arg1 << 14) + 1073741824;
			if (!local90.aBoolean122) {
				local102 += Integer.MIN_VALUE;
			}
			@Pc(116) byte local116 = (byte) ((arg5 << 6) + arg4);
			@Pc(142) Class1_Sub1_Sub1 local142;
			if (arg4 != 22) {
				@Pc(237) int local237;
				if (arg4 == 10 || arg4 == 11) {
					if (local90.anInt522 == -1) {
						local142 = local90.method298(10, arg5, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, 10, local57);
					}
					if (local142 != null) {
						@Pc(224) int local224 = 0;
						if (arg4 == 11) {
							local224 += 256;
						}
						@Pc(240) int local240;
						if (arg5 == 1 || arg5 == 3) {
							local237 = local90.anInt521;
							local240 = local90.anInt520;
						} else {
							local237 = local90.anInt520;
							local240 = local90.anInt521;
						}
						if (arg3.method558(local240, local237, arg6, local116, arg2, local142, local224, arg7, local102, anInt165, local87) && local90.aBoolean127) {
							@Pc(271) Class1_Sub1_Sub1_Sub5 local271;
							if (local142 instanceof Class1_Sub1_Sub1_Sub5) {
								local271 = (Class1_Sub1_Sub1_Sub5) local142;
							} else {
								local271 = local90.method298(10, arg5, local33, local44, local57, local68, -1);
							}
							if (local271 != null) {
								for (@Pc(287) int local287 = 0; local287 <= local237; local287++) {
									for (@Pc(291) int local291 = 0; local291 <= local240; local291++) {
										@Pc(298) int local298 = local271.anInt489 / 4;
										if (local298 > 30) {
											local298 = 30;
										}
										if (local298 > this.aByteArrayArrayArray6[arg7][arg6 + local287][arg2 + local291]) {
											this.aByteArrayArrayArray6[arg7][arg6 + local287][arg2 + local291] = (byte) local298;
										}
									}
								}
							}
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method445(local90.anInt521, arg5, local90.anInt520, local90.aBoolean121, arg2, arg6);
					}
				} else if (arg4 >= 12) {
					if (local90.anInt522 == -1) {
						local142 = local90.method298(arg4, arg5, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, arg4, local57);
					}
					arg3.method558(1, 1, arg6, local116, arg2, local142, 0, arg7, local102, anInt165, local87);
					if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
						this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x924;
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method445(local90.anInt521, arg5, local90.anInt520, local90.aBoolean121, arg2, arg6);
					}
				} else if (arg4 == 0) {
					if (local90.anInt522 == -1) {
						local142 = local90.method298(0, arg5, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, 0, local57);
					}
					arg3.method556(arg2, local116, local102, null, anIntArray22[arg5], local142, local87, arg6, 0, arg7);
					if (arg5 == 0) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local90.aBoolean127) {
							this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
						}
						if (local90.aBoolean125) {
							this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method444(local90.aBoolean121, arg2, arg5, anInt166, arg4, arg6);
					}
					if (local90.anInt523 != 16) {
						arg3.method564(arg6, arg2, arg7, local90.anInt523);
					}
				} else if (arg4 == 1) {
					if (local90.anInt522 == -1) {
						local142 = local90.method298(1, arg5, local33, local44, local57, local68, -1);
					} else {
						local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, 1, local57);
					}
					arg3.method556(arg2, local116, local102, null, anIntArray23[arg5], local142, local87, arg6, 0, arg7);
					if (local90.aBoolean127) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
						}
					}
					if (local90.aBoolean120 && arg0 != null) {
						arg0.method444(local90.aBoolean121, arg2, arg5, anInt166, arg4, arg6);
					}
				} else {
					@Pc(839) int local839;
					@Pc(865) Class1_Sub1_Sub1 local865;
					if (arg4 == 2) {
						local839 = arg5 + 1 & 0x3;
						@Pc(855) Class1_Sub1_Sub1 local855;
						if (local90.anInt522 == -1) {
							local855 = local90.method298(2, arg5 + 4, local33, local44, local57, local68, -1);
							local865 = local90.method298(2, local839, local33, local44, local57, local68, -1);
						} else {
							local855 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5 + 4, (byte) 69, true, local44, local33, arg1, local68, 2, local57);
							local865 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, local839, (byte) 69, true, local44, local33, arg1, local68, 2, local57);
						}
						arg3.method556(arg2, local116, local102, local865, anIntArray22[arg5], local855, local87, arg6, anIntArray22[local839], arg7);
						if (local90.aBoolean125) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray2[arg7][arg6 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x492;
								this.anIntArrayArrayArray2[arg7][arg6][arg2] |= 0x249;
							}
						}
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method444(local90.aBoolean121, arg2, arg5, anInt166, arg4, arg6);
						}
						if (local90.anInt523 != 16) {
							arg3.method564(arg6, arg2, arg7, local90.anInt523);
						}
					} else if (arg4 == 3) {
						if (local90.anInt522 == -1) {
							local142 = local90.method298(3, arg5, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, 3, local57);
						}
						arg3.method556(arg2, local116, local102, null, anIntArray23[arg5], local142, local87, arg6, 0, arg7);
						if (local90.aBoolean127) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray6[arg7][arg6 + 1][arg2] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray6[arg7][arg6][arg2] = 50;
							}
						}
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method444(local90.aBoolean121, arg2, arg5, anInt166, arg4, arg6);
						}
					} else if (arg4 == 9) {
						if (local90.anInt522 == -1) {
							local142 = local90.method298(arg4, arg5, local33, local44, local57, local68, -1);
						} else {
							local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, arg4, local57);
						}
						arg3.method558(1, 1, arg6, local116, arg2, local142, 0, arg7, local102, anInt165, local87);
						if (local90.aBoolean120 && arg0 != null) {
							arg0.method445(local90.anInt521, arg5, local90.anInt520, local90.aBoolean121, arg2, arg6);
						}
					} else {
						if (local90.aBoolean123) {
							if (arg5 == 1) {
								local839 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local839;
							} else if (arg5 == 2) {
								local839 = local68;
								local68 = local44;
								local44 = local839;
								local839 = local57;
								local57 = local33;
								local33 = local839;
							} else if (arg5 == 3) {
								local839 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local839;
							}
						}
						if (arg4 == 4) {
							if (local90.anInt522 == -1) {
								local142 = local90.method298(4, 0, local33, local44, local57, local68, -1);
							} else {
								local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, 0, (byte) 69, true, local44, local33, arg1, local68, 4, local57);
							}
							arg3.method557(0, local142, arg7, arg6, local116, local102, anIntArray22[arg5], arg5 * 512, local87, 0, arg2);
						} else if (arg4 == 5) {
							local839 = 16;
							local237 = arg3.method574(arg7, arg6, arg2);
							if (local237 > 0) {
								local839 = Class11.method292(local237 >> 14 & 0x7FFF).anInt523;
							}
							if (local90.anInt522 == -1) {
								local865 = local90.method298(4, 0, local33, local44, local57, local68, -1);
							} else {
								local865 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, 0, (byte) 69, true, local44, local33, arg1, local68, 4, local57);
							}
							arg3.method557(anIntArray25[arg5] * local839, local865, arg7, arg6, local116, local102, anIntArray22[arg5], arg5 * 512, local87, anIntArray24[arg5] * local839, arg2);
						} else if (arg4 == 6) {
							if (local90.anInt522 == -1) {
								local142 = local90.method298(4, 0, local33, local44, local57, local68, -1);
							} else {
								local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, 0, (byte) 69, true, local44, local33, arg1, local68, 4, local57);
							}
							arg3.method557(0, local142, arg7, arg6, local116, local102, 256, arg5, local87, 0, arg2);
						} else if (arg4 == 7) {
							if (local90.anInt522 == -1) {
								local142 = local90.method298(4, 0, local33, local44, local57, local68, -1);
							} else {
								local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, 0, (byte) 69, true, local44, local33, arg1, local68, 4, local57);
							}
							arg3.method557(0, local142, arg7, arg6, local116, local102, 512, arg5, local87, 0, arg2);
						} else if (arg4 == 8) {
							if (local90.anInt522 == -1) {
								local142 = local90.method298(4, 0, local33, local44, local57, local68, -1);
							} else {
								local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, 0, (byte) 69, true, local44, local33, arg1, local68, 4, local57);
							}
							arg3.method557(0, local142, arg7, arg6, local116, local102, 768, arg5, local87, 0, arg2);
						}
					}
				}
			} else if (!aBoolean28 || local90.aBoolean122 || local90.aBoolean128) {
				if (local90.anInt522 == -1) {
					local142 = local90.method298(22, arg5, local33, local44, local57, local68, -1);
				} else {
					local142 = new Class1_Sub1_Sub1_Sub2(local90.anInt522, arg5, (byte) 69, true, local44, local33, arg1, local68, 22, local57);
				}
				arg3.method554(arg6, arg2, local87, local102, local142, arg7, local116);
				if (local90.aBoolean120 && local90.aBoolean122 && arg0 != null) {
					arg0.method446(arg2, arg6);
				}
			}
		} catch (@Pc(1589) RuntimeException local1589) {
			signlink.reporterror("71526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1589.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!r;[Lclient!kc;)V")
	public void method58(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class21[] arg1) {
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
								arg1[local27].method446(local11, local7);
							}
						}
					}
				}
			}
			anInt173 += (int) (Math.random() * 5.0D) - 2;
			if (anInt173 < -8) {
				anInt173 = -8;
			}
			if (anInt173 > 8) {
				anInt173 = 8;
			}
			anInt174 += (int) (Math.random() * 5.0D) - 2;
			if (anInt174 < -16) {
				anInt174 = -16;
			}
			if (anInt174 > 16) {
				anInt174 = 16;
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
				for (local141 = 1; local141 < this.anInt172 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt171 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt172; local145++) {
					this.anIntArray17[local145] = 0;
					this.anIntArray18[local145] = 0;
					this.anIntArray19[local145] = 0;
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt171 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt172; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt171) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class23 local378 = Class23.aClass23Array1[local210 - 1];
								this.anIntArray17[local191] += local378.anInt742;
								this.anIntArray18[local191] += local378.anInt740;
								this.anIntArray19[local191] += local378.anInt741;
								this.anIntArray20[local191] += local378.anInt743;
								local419 = this.anIntArray21[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt171) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class23 local451 = Class23.aClass23Array1[local214 - 1];
								this.anIntArray17[local191] -= local451.anInt742;
								this.anIntArray18[local191] -= local451.anInt740;
								this.anIntArray19[local191] -= local451.anInt741;
								this.anIntArray20[local191] -= local451.anInt743;
								local419 = this.anIntArray21[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt171 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt172 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt172) {
								local204 += this.anIntArray17[local527];
								local210 += this.anIntArray18[local527];
								local214 += this.anIntArray19[local527];
								local220 += this.anIntArray20[local527];
								local236 += this.anIntArray21[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt172) {
								local204 -= this.anIntArray17[local572];
								local210 -= this.anIntArray18[local572];
								local214 -= this.anIntArray19[local572];
								local220 -= this.anIntArray20[local572];
								local236 -= this.anIntArray21[local572];
							}
							if (local284 >= 1 && local284 < this.anInt172 - 1 && (!aBoolean28 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method59(local284, local7, local169) == anInt170)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray1[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method67(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt173 & 0xFF;
										local770 += anInt174;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method67(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class23.aClass23Array1[local666 - 1].aBoolean179) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray175[method65(local754, 96)];
									}
									if (local666 == 0) {
										arg0.method553(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method65(local752, local721), method65(local752, local730), method65(local752, local741), method65(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class23 local925 = Class23.aClass23Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt738;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method339(local928);
											local936 = -1;
										} else if (local925.anInt737 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method67(local925.anInt739, local925.anInt740, local925.anInt741);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray175[this.method66(local925.anInt744, 96)];
										}
										arg0.method553(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method65(local752, local721), method65(local752, local730), method65(local752, local741), method65(local752, local750), this.method66(local936, local721), this.method66(local936, local730), this.method66(local936, local741), this.method66(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt172 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt171 - 1; local204++) {
						arg0.method552(local7, local204, local191, this.method59(local191, local7, local204));
					}
				}
			}
			arg0.method579();
			for (local11 = 0; local11 < this.anInt171; local11++) {
				for (local27 = 0; local27 < this.anInt172; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method550(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1110) int local1110 = 2;
			@Pc(1112) int local1112 = 4;
			for (@Pc(1114) int local1114 = 0; local1114 < 4; local1114++) {
				if (local1114 > 0) {
					local27 <<= 0x3;
					local1110 <<= 0x3;
					local1112 <<= 0x3;
				}
				for (@Pc(1132) int local1132 = 0; local1132 <= local1114; local1132++) {
					for (local133 = 0; local133 <= this.anInt172; local133++) {
						for (local139 = 0; local139 <= this.anInt171; local139++) {
							if ((this.anIntArrayArrayArray2[local1132][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1132;
								local191 = local1132;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1132][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt172 && (this.anIntArrayArrayArray2[local1132][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label324: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label324;
										}
									}
									local169--;
								}
								label313: while (local191 < local1114) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label313;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class36.method551(local145 * 128 + 128, local214, local141 * 128, local139 * 128, 1, local1114, local139 * 128, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1132][local139][local133] & local1110) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1132;
								local191 = local1132;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1132][local141 - 1][local133] & local1110) != 0) {
									local141--;
								}
								while (local145 < this.anInt171 && (this.anIntArrayArrayArray2[local1132][local145 + 1][local133] & local1110) != 0) {
									local145++;
								}
								label377: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1110) == 0) {
											break label377;
										}
									}
									local169--;
								}
								label366: while (local191 < local1114) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1110) == 0) {
											break label366;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class36.method551(local133 * 128, local214, local133 * 128, local145 * 128 + 128, 2, local1114, local141 * 128, local220);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1110;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1132][local139][local133] & local1112) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1132][local139][local169 - 1] & local1112) != 0) {
									local169--;
								}
								while (local191 < this.anInt172 && (this.anIntArrayArrayArray2[local1132][local139][local191 + 1] & local1112) != 0) {
									local191++;
								}
								label430: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1132][local141 - 1][local204] & local1112) == 0) {
											break label430;
										}
									}
									local141--;
								}
								label419: while (local145 < this.anInt171) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1132][local145 + 1][local204] & local1112) == 0) {
											break label419;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1132][local141][local169];
									Class36.method551(local191 * 128 + 128, local204, local169 * 128, local145 * 128 + 128, 4, local1114, local141 * 128, local204);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1132][local210][local214] &= ~local1112;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1747) RuntimeException local1747) {
			signlink.reporterror("17136, " + false + ", " + arg0 + ", " + arg1 + ", " + local1747.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("20733, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -40434 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)I")
	private int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
}
