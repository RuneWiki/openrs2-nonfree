import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt170;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt171 = -504;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	private static int anInt175 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt176 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[B)Z")
	public static boolean method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg3, -26728);
			if (arg0 != 21991) {
				throw new NullPointerException();
			}
			@Pc(18) int local18 = -1;
			label57: while (true) {
				@Pc(21) int local21 = local9.method494();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method494();
						if (local36 == 0) {
							continue label57;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method480() >> 2;
						@Pc(73) int local73 = local64 + arg1;
						@Pc(77) int local77 = local58 + arg2;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method288(local18);
							if (local69 != 22 || !aBoolean32 || local90.aBoolean120 || local90.aBoolean126) {
								local3 &= local90.method292();
								local31 = true;
							}
						}
					}
					local36 = local9.method494();
					if (local36 == 0) {
						break;
					}
					local9.method480();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("15820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;Lclient!ub;B)V")
	public static void method59(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		try {
			@Pc(8) int local8 = -1;
			while (true) {
				@Pc(11) int local11 = arg0.method494();
				if (local11 == 0) {
					return;
				}
				local8 += local11;
				@Pc(20) Class9 local20 = Class9.method288(local8);
				local20.method293(anInt171, arg1);
				while (true) {
					@Pc(27) int local27 = arg0.method494();
					if (local27 == 0) {
						break;
					}
					arg0.method480();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("84763, " + arg0 + ", " + arg1 + ", " + -75 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method65(arg0 + 45365, arg1 + 91923, 4) + (method65(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method65(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method67(local3, local13);
		@Pc(29) int local29 = method67(local3 + 1, local13);
		@Pc(35) int local35 = method67(local3, local13 + 1);
		@Pc(43) int local43 = method67(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method66(local23, local29, local9, arg2);
		@Pc(55) int local55 = method66(local35, local43, local9, arg2);
		return method66(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray179[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method68(arg0 - 1, arg1 - 1) + method68(arg0 + 1, arg1 - 1) + method68(arg0 - 1, arg1 + 1) + method68(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method68(arg0 - 1, arg1) + method68(arg0 + 1, arg1) + method68(arg0, arg1 - 1) + method68(arg0, arg1 + 1);
		@Pc(59) int local59 = method68(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	public static boolean method72(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) Class9 local12 = Class9.method288(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local12.method291(arg1);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("43233, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[[[ILclient!jc;IILclient!r;III)V")
	public static void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class37 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg3[arg0][arg8][arg6];
			@Pc(19) int local19 = arg3[arg0][arg8 + 1][arg6];
			@Pc(31) int local31 = arg3[arg0][arg8 + 1][arg6 + 1];
			@Pc(41) int local41 = arg3[arg0][arg8][arg6 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class9 local54 = Class9.method288(arg2);
			@Pc(66) int local66 = arg8 + (arg6 << 7) + (arg2 << 14) + 1073741824;
			if (!local54.aBoolean120) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg5 << 6) + arg9);
			@Pc(104) Class1_Sub1_Sub1 local104;
			if (arg9 == 22) {
				if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
					local104 = local54.method294(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 22, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
				}
				arg7.method536(arg1, local80, local66, arg6, local104, arg8, local51);
				if (local54.aBoolean118 && local54.aBoolean120) {
					arg4.method423(arg6, arg8);
				}
			} else {
				@Pc(200) int local200;
				if (arg9 == 10 || arg9 == 11) {
					if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
						local104 = local54.method294(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 10, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg9 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg5 == 1 || arg5 == 3) {
							local200 = local54.anInt514;
							local203 = local54.anInt513;
						} else {
							local200 = local54.anInt513;
							local203 = local54.anInt514;
						}
						arg7.method540(local203, arg1, arg6, local66, local51, local187, local80, arg8, local200, (byte) 7, local104);
					}
					if (local54.aBoolean118) {
						arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg8, arg5);
					}
				} else if (arg9 >= 12) {
					if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
						local104 = local54.method294(arg9, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local41, true, arg9, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
					}
					arg7.method540(1, arg1, arg6, local66, local51, 0, local80, arg8, 1, (byte) 7, local104);
					if (local54.aBoolean118) {
						arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg8, arg5);
					}
				} else if (arg9 == 0) {
					if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
						local104 = local54.method294(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 0, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
					}
					arg7.method538(null, local104, local66, local51, arg6, anIntArray25[arg5], 0, arg8, arg1, local80);
					if (local54.aBoolean118) {
						arg4.method421(arg8, arg5, arg6, local54.aBoolean119, arg9);
					}
				} else if (arg9 == 1) {
					if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
						local104 = local54.method294(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 1, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
					}
					arg7.method538(null, local104, local66, local51, arg6, anIntArray26[arg5], 0, arg8, arg1, local80);
					if (local54.aBoolean118) {
						arg4.method421(arg8, arg5, arg6, local54.aBoolean119, arg9);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class1_Sub1_Sub1 local475;
					if (arg9 == 2) {
						local446 = arg5 + 1 & 0x3;
						@Pc(465) Class1_Sub1_Sub1 local465;
						if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
							local465 = local54.method294(2, arg5 + 4, local9, local19, local31, local41, -1);
							local475 = local54.method294(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class1_Sub1_Sub1_Sub2(local41, true, 2, 0, local9, local19, local31, arg5 + 4, arg2, local54.anInt515);
							local475 = new Class1_Sub1_Sub1_Sub2(local41, true, 2, 0, local9, local19, local31, local446, arg2, local54.anInt515);
						}
						arg7.method538(local475, local465, local66, local51, arg6, anIntArray25[arg5], anIntArray25[local446], arg8, arg1, local80);
						if (local54.aBoolean118) {
							arg4.method421(arg8, arg5, arg6, local54.aBoolean119, arg9);
						}
					} else if (arg9 == 3) {
						if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
							local104 = local54.method294(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 3, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
						}
						arg7.method538(null, local104, local66, local51, arg6, anIntArray26[arg5], 0, arg8, arg1, local80);
						if (local54.aBoolean118) {
							arg4.method421(arg8, arg5, arg6, local54.aBoolean119, arg9);
						}
					} else if (arg9 == 9) {
						if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
							local104 = local54.method294(arg9, arg5, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(local41, true, arg9, 0, local9, local19, local31, arg5, arg2, local54.anInt515);
						}
						arg7.method540(1, arg1, arg6, local66, local51, 0, local80, arg8, 1, (byte) 7, local104);
						if (local54.aBoolean118) {
							arg4.method422(local54.anInt513, local54.anInt514, local54.aBoolean119, arg6, arg8, arg5);
						}
					} else {
						if (local54.aBoolean121) {
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
						if (arg9 == 4) {
							if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
								local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
							}
							arg7.method539(local104, local51, 0, arg5 * 512, arg1, anIntArray25[arg5], arg6, local80, 0, arg8, local66);
						} else if (arg9 == 5) {
							local446 = 16;
							local200 = arg7.method556(arg1, arg8, arg6);
							if (local200 > 0) {
								local446 = Class9.method288(local200 >> 14 & 0x7FFF).anInt516;
							}
							if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
								local475 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class1_Sub1_Sub1_Sub2(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
							}
							arg7.method539(local475, local51, anIntArray28[arg5] * local446, arg5 * 512, arg1, anIntArray25[arg5], arg6, local80, anIntArray27[arg5] * local446, arg8, local66);
						} else if (arg9 == 6) {
							if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
								local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
							}
							arg7.method539(local104, local51, 0, arg5, arg1, 256, arg6, local80, 0, arg8, local66);
						} else if (arg9 == 7) {
							if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
								local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
							}
							arg7.method539(local104, local51, 0, arg5, arg1, 512, arg6, local80, 0, arg8, local66);
						} else if (arg9 == 8) {
							if (local54.anInt515 == -1 && local54.anIntArray160 == null) {
								local104 = local54.method294(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(local41, true, 4, 0, local9, local19, local31, 0, arg2, local54.anInt515);
							}
							arg7.method539(local104, local51, 0, arg5, arg1, 768, arg6, local80, 0, arg8, local66);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("99529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 8 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[II[[[BI)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt173 = arg0;
			this.anInt174 = arg2;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt173][this.anInt174];
			this.anIntArrayArrayArray4 = new int[4][this.anInt173 + 1][this.anInt174 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArrayArray2 = new int[this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArray20 = new int[this.anInt174];
			this.anIntArray21 = new int[this.anInt174];
			this.anIntArray22 = new int[this.anInt174];
			this.anIntArray23 = new int[this.anInt174];
			this.anIntArray24 = new int[this.anInt174];
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("25158, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method56(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt173 && local3 >= 0 && local3 < this.anInt174) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt173 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt174 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("75669, " + 64 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + 64 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII[B)V")
	public void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, -26728);
			for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
				for (@Pc(27) int local27 = 0; local27 < 64; local27++) {
					for (@Pc(31) int local31 = 0; local31 < 64; local31++) {
						@Pc(37) int local37 = local27 + arg1;
						@Pc(41) int local41 = local31 + arg3;
						@Pc(63) int local63;
						if (local37 >= 0 && local37 < 104 && local41 >= 0 && local41 < 104) {
							this.aByteArrayArrayArray1[local23][local37][local41] = 0;
							while (true) {
								local63 = local7.method480();
								if (local63 == 0) {
									if (local23 == 0) {
										this.anIntArrayArrayArray3[0][local37][local41] = -method64(local37 + arg2 + 932731, local41 + 556238 + arg0) * 8;
									} else {
										this.anIntArrayArrayArray3[local23][local37][local41] = this.anIntArrayArrayArray3[local23 - 1][local37][local41] - 240;
									}
									break;
								}
								if (local63 == 1) {
									@Pc(119) int local119 = local7.method480();
									if (local119 == 1) {
										local119 = 0;
									}
									if (local23 == 0) {
										this.anIntArrayArrayArray3[0][local37][local41] = -local119 * 8;
									} else {
										this.anIntArrayArrayArray3[local23][local37][local41] = this.anIntArrayArrayArray3[local23 - 1][local37][local41] - local119 * 8;
									}
									break;
								}
								if (local63 <= 49) {
									this.aByteArrayArrayArray3[local23][local37][local41] = local7.method481();
									this.aByteArrayArrayArray4[local23][local37][local41] = (byte) ((local63 - 2) / 4);
									this.aByteArrayArrayArray5[local23][local37][local41] = (byte) (local63 - 2 & 0x3);
								} else if (local63 <= 81) {
									this.aByteArrayArrayArray1[local23][local37][local41] = (byte) (local63 - 49);
								} else {
									this.aByteArrayArrayArray2[local23][local37][local41] = (byte) (local63 - 81);
								}
							}
						} else {
							while (true) {
								local63 = local7.method480();
								if (local63 == 0) {
									break;
								}
								if (local63 == 1) {
									local7.method480();
									break;
								}
								if (local63 <= 49) {
									local7.method480();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("48111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!jc;Lclient!r;I[BZ)V")
	public void method60(@OriginalArg(0) int arg0, @OriginalArg(1) Class19[] arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg4, -26728);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method494();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method494();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method480();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg3;
					@Pc(73) int local73 = local44 + arg0;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray1[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class19 local100 = null;
						if (local85 >= 0) {
							local100 = arg1[local85];
						}
						this.method61(local65, local73, local54, local9, arg2, local100, local69, local61);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("17657, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILclient!r;Lclient!jc;II)V")
	private void method61(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean32) {
				if ((this.aByteArrayArrayArray1[arg2][arg6][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method63(arg2, arg6, 318, arg1) != anInt172) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg2][arg6][arg1];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg1];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg1 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg2][arg6][arg1 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method288(arg3);
			@Pc(93) int local93 = arg6 + (arg1 << 7) + (arg3 << 14) + 1073741824;
			if (!local81.aBoolean120) {
				local93 += Integer.MIN_VALUE;
			}
			@Pc(111) byte local111 = (byte) ((arg0 << 6) + arg7);
			@Pc(140) Class1_Sub1_Sub1 local140;
			if (arg7 != 22) {
				@Pc(238) int local238;
				if (arg7 == 10 || arg7 == 11) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local140 = local81.method294(10, arg0, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 10, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
					}
					if (local140 != null) {
						@Pc(225) int local225 = 0;
						if (arg7 == 11) {
							local225 += 256;
						}
						@Pc(241) int local241;
						if (arg0 == 1 || arg0 == 3) {
							local238 = local81.anInt514;
							local241 = local81.anInt513;
						} else {
							local238 = local81.anInt513;
							local241 = local81.anInt514;
						}
						if (arg4.method540(local241, arg2, arg1, local93, local78, local225, local111, arg6, local238, (byte) 7, local140) && local81.aBoolean125) {
							@Pc(272) Class1_Sub1_Sub1_Sub5 local272;
							if (local140 instanceof Class1_Sub1_Sub1_Sub5) {
								local272 = (Class1_Sub1_Sub1_Sub5) local140;
							} else {
								local272 = local81.method294(10, arg0, local33, local44, local57, local68, -1);
							}
							if (local272 != null) {
								for (@Pc(288) int local288 = 0; local288 <= local238; local288++) {
									for (@Pc(292) int local292 = 0; local292 <= local241; local292++) {
										@Pc(299) int local299 = local272.anInt498 / 4;
										if (local299 > 30) {
											local299 = 30;
										}
										if (local299 > this.aByteArrayArrayArray6[arg2][arg6 + local288][arg1 + local292]) {
											this.aByteArrayArrayArray6[arg2][arg6 + local288][arg1 + local292] = (byte) local299;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean118 && arg5 != null) {
						arg5.method422(local81.anInt513, local81.anInt514, local81.aBoolean119, arg1, arg6, arg0);
					}
				} else if (arg7 >= 12) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local140 = local81.method294(arg7, arg0, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local68, true, arg7, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
					}
					arg4.method540(1, arg2, arg1, local93, local78, 0, local111, arg6, 1, (byte) 7, local140);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x924;
					}
					if (local81.aBoolean118 && arg5 != null) {
						arg5.method422(local81.anInt513, local81.anInt514, local81.aBoolean119, arg1, arg6, arg0);
					}
				} else if (arg7 == 0) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local140 = local81.method294(0, arg0, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 0, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
					}
					arg4.method538(null, local140, local93, local78, arg1, anIntArray25[arg0], 0, arg6, arg2, local111);
					if (arg0 == 0) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local81.aBoolean125) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
						}
						if (local81.aBoolean123) {
							this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
						}
					}
					if (local81.aBoolean118 && arg5 != null) {
						arg5.method421(arg6, arg0, arg1, local81.aBoolean119, arg7);
					}
					if (local81.anInt516 != 16) {
						arg4.method546(arg2, local81.anInt516, arg1, arg6);
					}
				} else if (arg7 == 1) {
					if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
						local140 = local81.method294(1, arg0, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 1, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
					}
					arg4.method538(null, local140, local93, local78, arg1, anIntArray26[arg0], 0, arg6, arg2, local111);
					if (local81.aBoolean125) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
						}
					}
					if (local81.aBoolean118 && arg5 != null) {
						arg5.method421(arg6, arg0, arg1, local81.aBoolean119, arg7);
					}
				} else {
					@Pc(849) int local849;
					@Pc(878) Class1_Sub1_Sub1 local878;
					if (arg7 == 2) {
						local849 = arg0 + 1 & 0x3;
						@Pc(868) Class1_Sub1_Sub1 local868;
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local868 = local81.method294(2, arg0 + 4, local33, local44, local57, local68, -1);
							local878 = local81.method294(2, local849, local33, local44, local57, local68, -1);
						} else {
							local868 = new Class1_Sub1_Sub1_Sub2(local68, true, 2, 0, local33, local44, local57, arg0 + 4, arg3, local81.anInt515);
							local878 = new Class1_Sub1_Sub1_Sub2(local68, true, 2, 0, local33, local44, local57, local849, arg3, local81.anInt515);
						}
						arg4.method538(local878, local868, local93, local78, arg1, anIntArray25[arg0], anIntArray25[local849], arg6, arg2, local111);
						if (local81.aBoolean123) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6][arg1] |= 0x249;
							}
						}
						if (local81.aBoolean118 && arg5 != null) {
							arg5.method421(arg6, arg0, arg1, local81.aBoolean119, arg7);
						}
						if (local81.anInt516 != 16) {
							arg4.method546(arg2, local81.anInt516, arg1, arg6);
						}
					} else if (arg7 == 3) {
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local140 = local81.method294(3, arg0, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 3, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
						}
						arg4.method538(null, local140, local93, local78, arg1, anIntArray26[arg0], 0, arg6, arg2, local111);
						if (local81.aBoolean125) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray6[arg2][arg6][arg1 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg1] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray6[arg2][arg6][arg1] = 50;
							}
						}
						if (local81.aBoolean118 && arg5 != null) {
							arg5.method421(arg6, arg0, arg1, local81.aBoolean119, arg7);
						}
					} else if (arg7 == 9) {
						if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
							local140 = local81.method294(arg7, arg0, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(local68, true, arg7, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
						}
						arg4.method540(1, arg2, arg1, local93, local78, 0, local111, arg6, 1, (byte) 7, local140);
						if (local81.aBoolean118 && arg5 != null) {
							arg5.method422(local81.anInt513, local81.anInt514, local81.aBoolean119, arg1, arg6, arg0);
						}
					} else {
						if (local81.aBoolean121) {
							if (arg0 == 1) {
								local849 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local849;
							} else if (arg0 == 2) {
								local849 = local68;
								local68 = local44;
								local44 = local849;
								local849 = local57;
								local57 = local33;
								local33 = local849;
							} else if (arg0 == 3) {
								local849 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local849;
							}
						}
						if (arg7 == 4) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local140 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 4, 0, local33, local44, local57, 0, arg3, local81.anInt515);
							}
							arg4.method539(local140, local78, 0, arg0 * 512, arg2, anIntArray25[arg0], arg1, local111, 0, arg6, local93);
						} else if (arg7 == 5) {
							local849 = 16;
							local238 = arg4.method556(arg2, arg6, arg1);
							if (local238 > 0) {
								local849 = Class9.method288(local238 >> 14 & 0x7FFF).anInt516;
							}
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local878 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local878 = new Class1_Sub1_Sub1_Sub2(local68, true, 4, 0, local33, local44, local57, 0, arg3, local81.anInt515);
							}
							arg4.method539(local878, local78, anIntArray28[arg0] * local849, arg0 * 512, arg2, anIntArray25[arg0], arg1, local111, anIntArray27[arg0] * local849, arg6, local93);
						} else if (arg7 == 6) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local140 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 4, 0, local33, local44, local57, 0, arg3, local81.anInt515);
							}
							arg4.method539(local140, local78, 0, arg0, arg2, 256, arg1, local111, 0, arg6, local93);
						} else if (arg7 == 7) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local140 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 4, 0, local33, local44, local57, 0, arg3, local81.anInt515);
							}
							arg4.method539(local140, local78, 0, arg0, arg2, 512, arg1, local111, 0, arg6, local93);
						} else if (arg7 == 8) {
							if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
								local140 = local81.method294(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 4, 0, local33, local44, local57, 0, arg3, local81.anInt515);
							}
							arg4.method539(local140, local78, 0, arg0, arg2, 768, arg1, local111, 0, arg6, local93);
						}
					}
				}
			} else if (!aBoolean32 || local81.aBoolean120 || local81.aBoolean126) {
				if (local81.anInt515 == -1 && local81.anIntArray160 == null) {
					local140 = local81.method294(22, arg0, local33, local44, local57, local68, -1);
				} else {
					local140 = new Class1_Sub1_Sub1_Sub2(local68, true, 22, 0, local33, local44, local57, arg0, arg3, local81.anInt515);
				}
				arg4.method536(arg2, local111, local93, arg1, local140, arg6, local78);
				if (local81.aBoolean118 && local81.aBoolean120 && arg5 != null) {
					arg5.method423(arg1, arg6);
				}
			}
		} catch (@Pc(1623) RuntimeException local1623) {
			signlink.reporterror("18948, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1623.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;Lclient!r;Z)V")
	public void method62(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class37 arg1) {
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
								arg0[local27].method423(local11, local7);
							}
						}
					}
				}
			}
			anInt175 += (int) (Math.random() * 5.0D) - 2;
			if (anInt175 < -8) {
				anInt175 = -8;
			}
			if (anInt175 > 8) {
				anInt175 = 8;
			}
			anInt176 += (int) (Math.random() * 5.0D) - 2;
			if (anInt176 < -16) {
				anInt176 = -16;
			}
			if (anInt176 > 16) {
				anInt176 = 16;
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
				for (local141 = 1; local141 < this.anInt174 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt173 - 1; local145++) {
						local169 = this.anIntArrayArrayArray3[local7][local145 + 1][local141] - this.anIntArrayArrayArray3[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray3[local7][local145][local141 + 1] - this.anIntArrayArrayArray3[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray2[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt174; local145++) {
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt173 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt174; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt173) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray20[local191] += local378.anInt718;
								this.anIntArray21[local191] += local378.anInt716;
								this.anIntArray22[local191] += local378.anInt717;
								this.anIntArray23[local191] += local378.anInt719;
								local419 = this.anIntArray24[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt173) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray20[local191] -= local451.anInt718;
								this.anIntArray21[local191] -= local451.anInt716;
								this.anIntArray22[local191] -= local451.anInt717;
								this.anIntArray23[local191] -= local451.anInt719;
								local419 = this.anIntArray24[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt173 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt174 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt174) {
								local204 += this.anIntArray20[local527];
								local210 += this.anIntArray21[local527];
								local214 += this.anIntArray22[local527];
								local220 += this.anIntArray23[local527];
								local236 += this.anIntArray24[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt174) {
								local204 -= this.anIntArray20[local572];
								local210 -= this.anIntArray21[local572];
								local214 -= this.anIntArray22[local572];
								local220 -= this.anIntArray23[local572];
								local236 -= this.anIntArray24[local572];
							}
							if (local284 >= 1 && local284 < this.anInt174 - 1 && (!aBoolean32 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method63(local7, local169, 318, local284) == anInt172)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray3[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray3[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray3[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray3[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray2[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray2[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray2[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray2[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method71(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt175 & 0xFF;
										local770 += anInt176;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method71(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean183) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray183[method69(local754, 96)];
									}
									if (local666 == 0) {
										arg1.method535(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt714;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Class1_Sub1_Sub2_Sub1.method348(local928);
											local936 = -1;
										} else if (local925.anInt713 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method71(local925.anInt715, local925.anInt716, local925.anInt717);
											local934 = Class1_Sub1_Sub2_Sub1.anIntArray183[this.method70(local925.anInt720, 96)];
										}
										arg1.method535(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method69(local752, local721), method69(local752, local730), method69(local752, local741), method69(local752, local750), this.method70(local936, local721), this.method70(local936, local730), this.method70(local936, local741), this.method70(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt174 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt173 - 1; local204++) {
						arg1.method534(local7, local204, local191, this.method63(local7, local204, 318, local191));
					}
				}
			}
			arg1.method561();
			for (local11 = 0; local11 < this.anInt173; local11++) {
				for (local27 = 0; local27 < this.anInt174; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method532(local27, local11);
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
					for (local133 = 0; local133 <= this.anInt174; local133++) {
						for (local139 = 0; local139 <= this.anInt173; local139++) {
							if ((this.anIntArrayArrayArray4[local1132][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1132;
								local191 = local1132;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1132][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label324: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local139][local204] & local27) == 0) {
											break label324;
										}
									}
									local169--;
								}
								label313: while (local191 < local1114) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local139][local204] & local27) == 0) {
											break label313;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local139][local141];
									Class37.method533(local139 * 128, local1114, local145 * 128 + 128, local141 * 128, 1, local220, local139 * 128, local214);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local139][local133] & local1110) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1132;
								local191 = local1132;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1132][local141 - 1][local133] & local1110) != 0) {
									local141--;
								}
								while (local145 < this.anInt173 && (this.anIntArrayArrayArray4[local1132][local145 + 1][local133] & local1110) != 0) {
									local145++;
								}
								label377: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1110) == 0) {
											break label377;
										}
									}
									local169--;
								}
								label366: while (local191 < local1114) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1110) == 0) {
											break label366;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class37.method533(local141 * 128, local1114, local133 * 128, local133 * 128, 2, local220, local145 * 128 + 128, local214);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1110;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local139][local133] & local1112) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1132][local139][local169 - 1] & local1112) != 0) {
									local169--;
								}
								while (local191 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local139][local191 + 1] & local1112) != 0) {
									local191++;
								}
								label430: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1132][local141 - 1][local204] & local1112) == 0) {
											break label430;
										}
									}
									local141--;
								}
								label419: while (local145 < this.anInt173) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1132][local145 + 1][local204] & local1112) == 0) {
											break label419;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1132][local141][local169];
									Class37.method533(local141 * 128, local1114, local191 * 128 + 128, local169 * 128, 4, local204, local145 * 128 + 128, local204);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1132][local210][local214] &= ~local1112;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1747) RuntimeException local1747) {
			signlink.reporterror("91136, " + arg0 + ", " + arg1 + ", " + false + ", " + local1747.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if ((this.aByteArrayArrayArray1[arg0][arg1][arg3] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("93537, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
