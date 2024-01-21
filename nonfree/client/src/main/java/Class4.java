import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt169;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private static int anInt167 = 2;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt168 = -26443;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean45 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray24 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt172 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt173 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt166 = 8841;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIZ)Z")
	public static boolean method57(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg1, 185);
			@Pc(17) int local17 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method488();
				if (local20 == 0) {
					return local3;
				}
				local17 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method488();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method474() >> 2;
						@Pc(72) int local72 = local63 + arg2;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method287(local17);
							if (local68 != 22 || !aBoolean45 || local89.aBoolean128 || local89.aBoolean134) {
								local3 &= local89.method291();
								local30 = true;
							}
						}
					}
					local35 = local9.method488();
					if (local35 == 0) {
						break;
					}
					local9.method474();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("13336, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lb;ILclient!ub;)V")
	public static void method58(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class44_Sub1 arg1) {
		try {
			@Pc(7) int local7 = -1;
			while (true) {
				@Pc(10) int local10 = arg0.method488();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				@Pc(19) Class9 local19 = Class9.method287(local7);
				local19.method292(arg1, anInt168);
				while (true) {
					@Pc(26) int local26 = arg0.method488();
					if (local26 == 0) {
						break;
					}
					arg0.method474();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("11207, " + arg0 + ", " + -936 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private static int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method64(arg0 + 45365, arg1 + 91923, 4) + (method64(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method64(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method66(local3, local13);
		@Pc(29) int local29 = method66(local3 + 1, local13);
		@Pc(35) int local35 = method66(local3, local13 + 1);
		@Pc(43) int local43 = method66(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method65(local23, local29, local9, arg2);
		@Pc(55) int local55 = method65(local35, local43, local9, arg2);
		return method65(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray176[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method67(arg0 - 1, arg1 - 1) + method67(arg0 + 1, arg1 - 1) + method67(arg0 - 1, arg1 + 1) + method67(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method67(arg0 - 1, arg1) + method67(arg0 + 1, arg1) + method67(arg0, arg1 - 1) + method67(arg0, arg1 + 1);
		@Pc(59) int local59 = method67(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)Z")
	public static boolean method71(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) Class9 local7 = Class9.method287(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local7.method290(arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("98122, " + arg0 + ", " + 110 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[[[IIILclient!r;ILclient!jc;III)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class37 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(9) int local9 = arg2[arg1][arg0][arg3];
			@Pc(19) int local19 = arg2[arg1][arg0 + 1][arg3];
			@Pc(31) int local31 = arg2[arg1][arg0 + 1][arg3 + 1];
			@Pc(41) int local41 = arg2[arg1][arg0][arg3 + 1];
			@Pc(58) int local58 = local9 + local19 + local31 + local41 >> 2;
			@Pc(61) Class9 local61 = Class9.method287(arg4);
			@Pc(73) int local73 = arg0 + (arg3 << 7) + (arg4 << 14) + 1073741824;
			if (!local61.aBoolean128) {
				local73 += Integer.MIN_VALUE;
			}
			@Pc(87) byte local87 = (byte) ((arg9 << 6) + arg6);
			@Pc(104) Class1_Sub1_Sub1 local104;
			if (arg6 == 22) {
				if (local61.anInt510 == -1) {
					local104 = local61.method293(22, arg9, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class1_Sub1_Sub1_Sub2(22, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
				}
				arg5.method530(local58, arg3, local87, arg8, local104, arg0, local73);
				if (local61.aBoolean126 && local61.aBoolean128) {
					arg7.method420(arg0, arg3);
				}
			} else {
				@Pc(197) int local197;
				if (arg6 == 10 || arg6 == 11) {
					if (local61.anInt510 == -1) {
						local104 = local61.method293(10, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(10, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
					}
					if (local104 != null) {
						@Pc(184) int local184 = 0;
						if (arg6 == 11) {
							local184 += 256;
						}
						@Pc(200) int local200;
						if (arg9 == 1 || arg9 == 3) {
							local197 = local61.anInt509;
							local200 = local61.anInt508;
						} else {
							local197 = local61.anInt508;
							local200 = local61.anInt509;
						}
						arg5.method534(local197, local104, arg0, local200, local184, arg8, arg3, local87, local73, local58);
					}
					if (local61.aBoolean126) {
						arg7.method419(arg3, local61.anInt509, local61.anInt508, arg0, local61.aBoolean127, (byte) 5, arg9);
					}
				} else if (arg6 >= 12) {
					if (local61.anInt510 == -1) {
						local104 = local61.method293(arg6, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(arg6, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
					}
					arg5.method534(1, local104, arg0, 1, 0, arg8, arg3, local87, local73, local58);
					if (local61.aBoolean126) {
						arg7.method419(arg3, local61.anInt509, local61.anInt508, arg0, local61.aBoolean127, (byte) 5, arg9);
					}
				} else if (arg6 == 0) {
					if (local61.anInt510 == -1) {
						local104 = local61.method293(0, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(0, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
					}
					arg5.method532(arg8, arg0, 0, local87, arg3, local104, local73, anIntArray24[arg9], local58, null);
					if (local61.aBoolean126) {
						arg7.method418(arg3, 352, arg9, arg0, arg6, local61.aBoolean127);
					}
				} else if (arg6 == 1) {
					if (local61.anInt510 == -1) {
						local104 = local61.method293(1, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub2(1, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
					}
					arg5.method532(arg8, arg0, 0, local87, arg3, local104, local73, anIntArray25[arg9], local58, null);
					if (local61.aBoolean126) {
						arg7.method418(arg3, 352, arg9, arg0, arg6, local61.aBoolean127);
					}
				} else {
					@Pc(434) int local434;
					@Pc(460) Class1_Sub1_Sub1 local460;
					if (arg6 == 2) {
						local434 = arg9 + 1 & 0x3;
						@Pc(450) Class1_Sub1_Sub1 local450;
						if (local61.anInt510 == -1) {
							local450 = local61.method293(2, arg9 + 4, local9, local19, local31, local41, -1);
							local460 = local61.method293(2, local434, local9, local19, local31, local41, -1);
						} else {
							local450 = new Class1_Sub1_Sub1_Sub2(2, false, local9, local41, local31, local19, local61.anInt510, true, arg9 + 4, arg4);
							local460 = new Class1_Sub1_Sub1_Sub2(2, false, local9, local41, local31, local19, local61.anInt510, true, local434, arg4);
						}
						arg5.method532(arg8, arg0, anIntArray24[local434], local87, arg3, local450, local73, anIntArray24[arg9], local58, local460);
						if (local61.aBoolean126) {
							arg7.method418(arg3, 352, arg9, arg0, arg6, local61.aBoolean127);
						}
					} else if (arg6 == 3) {
						if (local61.anInt510 == -1) {
							local104 = local61.method293(3, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(3, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
						}
						arg5.method532(arg8, arg0, 0, local87, arg3, local104, local73, anIntArray25[arg9], local58, null);
						if (local61.aBoolean126) {
							arg7.method418(arg3, 352, arg9, arg0, arg6, local61.aBoolean127);
						}
					} else if (arg6 == 9) {
						if (local61.anInt510 == -1) {
							local104 = local61.method293(arg6, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub2(arg6, false, local9, local41, local31, local19, local61.anInt510, true, arg9, arg4);
						}
						arg5.method534(1, local104, arg0, 1, 0, arg8, arg3, local87, local73, local58);
						if (local61.aBoolean126) {
							arg7.method419(arg3, local61.anInt509, local61.anInt508, arg0, local61.aBoolean127, (byte) 5, arg9);
						}
					} else {
						if (local61.aBoolean129) {
							if (arg9 == 1) {
								local434 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local434;
							} else if (arg9 == 2) {
								local434 = local41;
								local41 = local19;
								local19 = local434;
								local434 = local31;
								local31 = local9;
								local9 = local434;
							} else if (arg9 == 3) {
								local434 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local434;
							}
						}
						if (arg6 == 4) {
							if (local61.anInt510 == -1) {
								local104 = local61.method293(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(4, false, local9, local41, local31, local19, local61.anInt510, true, 0, arg4);
							}
							arg5.method533(local73, local104, 0, arg8, arg9 * 512, anIntArray24[arg9], 0, arg0, local87, local58, arg3);
						} else if (arg6 == 5) {
							local434 = 16;
							local197 = arg5.method550(arg8, arg0, arg3);
							if (local197 > 0) {
								local434 = Class9.method287(local197 >> 14 & 0x7FFF).anInt511;
							}
							if (local61.anInt510 == -1) {
								local460 = local61.method293(4, 0, local9, local19, local31, local41, -1);
							} else {
								local460 = new Class1_Sub1_Sub1_Sub2(4, false, local9, local41, local31, local19, local61.anInt510, true, 0, arg4);
							}
							arg5.method533(local73, local460, anIntArray26[arg9] * local434, arg8, arg9 * 512, anIntArray24[arg9], anIntArray27[arg9] * local434, arg0, local87, local58, arg3);
						} else if (arg6 == 6) {
							if (local61.anInt510 == -1) {
								local104 = local61.method293(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(4, false, local9, local41, local31, local19, local61.anInt510, true, 0, arg4);
							}
							arg5.method533(local73, local104, 0, arg8, arg9, 256, 0, arg0, local87, local58, arg3);
						} else if (arg6 == 7) {
							if (local61.anInt510 == -1) {
								local104 = local61.method293(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(4, false, local9, local41, local31, local19, local61.anInt510, true, 0, arg4);
							}
							arg5.method533(local73, local104, 0, arg8, arg9, 512, 0, arg0, local87, local58, arg3);
						} else if (arg6 == 8) {
							if (local61.anInt510 == -1) {
								local104 = local61.method293(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub2(4, false, local9, local41, local31, local19, local61.anInt510, true, 0, arg4);
							}
							arg5.method533(local73, local104, 0, arg8, arg9, 768, 0, arg0, local87, local58, arg3);
						}
					}
				}
			}
		} catch (@Pc(978) RuntimeException local978) {
			signlink.reporterror("53159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 7 + ", " + local978.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(B[[[I[[[BII)V")
	public Class4(@OriginalArg(0) byte arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt170 = arg4;
			this.anInt171 = arg3;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt170][this.anInt171];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt170][this.anInt171];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt170][this.anInt171];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt170][this.anInt171];
			this.anIntArrayArrayArray4 = new int[4][this.anInt170 + 1][this.anInt171 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt170 + 1][this.anInt171 + 1];
			this.anIntArrayArray2 = new int[this.anInt170 + 1][this.anInt171 + 1];
			this.anIntArray19 = new int[this.anInt171];
			this.anIntArray20 = new int[this.anInt171];
			this.anIntArray21 = new int[this.anInt171];
			this.anIntArray22 = new int[this.anInt171];
			this.anIntArray23 = new int[this.anInt171];
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("46334, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method55(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			@Pc(9) int local9;
			if (arg2 < anInt167 || arg2 > anInt167) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			for (local9 = arg1; local9 <= arg1 + 64; local9++) {
				for (@Pc(20) int local20 = arg0; local20 <= arg0 + 64; local20++) {
					if (local20 >= 0 && local20 < this.anInt170 && local9 >= 0 && local9 < this.anInt171) {
						this.aByteArrayArrayArray6[0][local20][local9] = 127;
						if (local20 == arg0 && local20 > 0) {
							this.anIntArrayArrayArray3[0][local20][local9] = this.anIntArrayArrayArray3[0][local20 - 1][local9];
						}
						if (local20 == arg0 + 64 && local20 < this.anInt170 - 1) {
							this.anIntArrayArrayArray3[0][local20][local9] = this.anIntArrayArrayArray3[0][local20 + 1][local9];
						}
						if (local9 == arg1 && local9 > 0) {
							this.anIntArrayArrayArray3[0][local20][local9] = this.anIntArrayArrayArray3[0][local20][local9 - 1];
						}
						if (local9 == arg1 + 64 && local9 < this.anInt171 - 1) {
							this.anIntArrayArrayArray3[0][local20][local9] = this.anIntArrayArrayArray3[0][local20][local9 + 1];
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("57287, " + arg0 + ", " + 64 + ", " + 64 + ", " + arg1 + ", " + arg2 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BIIII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(18) Class1_Sub1_Sub3 local18 = new Class1_Sub1_Sub3(arg1, 185);
			for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 64; local24++) {
					for (@Pc(28) int local28 = 0; local28 < 64; local28++) {
						@Pc(34) int local34 = local24 + arg2;
						@Pc(38) int local38 = local28 + arg4;
						@Pc(60) int local60;
						if (local34 >= 0 && local34 < 104 && local38 >= 0 && local38 < 104) {
							this.aByteArrayArrayArray1[local20][local34][local38] = 0;
							while (true) {
								local60 = local18.method474();
								if (local60 == 0) {
									if (local20 == 0) {
										this.anIntArrayArrayArray3[0][local34][local38] = -method63(local34 + arg0 + 932731, local38 + 556238 + arg3) * 8;
									} else {
										this.anIntArrayArrayArray3[local20][local34][local38] = this.anIntArrayArrayArray3[local20 - 1][local34][local38] - 240;
									}
									break;
								}
								if (local60 == 1) {
									@Pc(116) int local116 = local18.method474();
									if (local116 == 1) {
										local116 = 0;
									}
									if (local20 == 0) {
										this.anIntArrayArrayArray3[0][local34][local38] = -local116 * 8;
									} else {
										this.anIntArrayArrayArray3[local20][local34][local38] = this.anIntArrayArrayArray3[local20 - 1][local34][local38] - local116 * 8;
									}
									break;
								}
								if (local60 <= 49) {
									this.aByteArrayArrayArray3[local20][local34][local38] = local18.method475();
									this.aByteArrayArrayArray4[local20][local34][local38] = (byte) ((local60 - 2) / 4);
									this.aByteArrayArrayArray5[local20][local34][local38] = (byte) (local60 - 2 & 0x3);
								} else if (local60 <= 81) {
									this.aByteArrayArrayArray1[local20][local34][local38] = (byte) (local60 - 49);
								} else {
									this.aByteArrayArrayArray2[local20][local34][local38] = (byte) (local60 - 81);
								}
							}
						} else {
							while (true) {
								local60 = local18.method474();
								if (local60 == 0) {
									break;
								}
								if (local60 == 1) {
									local18.method474();
									break;
								}
								if (local60 <= 49) {
									local18.method474();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("37211, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 2 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB[Lclient!jc;Lclient!r;[B)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class19[] arg3, @OriginalArg(4) Class37 arg4, @OriginalArg(5) byte[] arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg5, 185);
			if (arg2 == 1) {
				@Pc(12) boolean local12 = false;
				@Pc(16) int local16 = -1;
				while (true) {
					@Pc(20) int local20 = local7.method488();
					if (local20 == 0) {
						return;
					}
					local16 += local20;
					@Pc(28) int local28 = 0;
					while (true) {
						@Pc(31) int local31 = local7.method488();
						if (local31 == 0) {
							break;
						}
						local28 += local31 - 1;
						@Pc(43) int local43 = local28 & 0x3F;
						@Pc(49) int local49 = local28 >> 6 & 0x3F;
						@Pc(53) int local53 = local28 >> 12;
						@Pc(56) int local56 = local7.method474();
						@Pc(60) int local60 = local56 >> 2;
						@Pc(64) int local64 = local56 & 0x3;
						@Pc(68) int local68 = local49 + arg0;
						@Pc(72) int local72 = local43 + arg1;
						if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
							@Pc(84) int local84 = local53;
							if ((this.aByteArrayArrayArray1[1][local68][local72] & 0x2) == 2) {
								local84 = local53 - 1;
							}
							@Pc(99) Class19 local99 = null;
							if (local84 >= 0) {
								local99 = arg3[local84];
							}
							this.method60(local60, arg4, local53, local16, local99, local64, local68, local72);
						}
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("8398, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!r;IBILclient!jc;III)V")
	private void method60(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean45) {
				if ((this.aByteArrayArrayArray1[arg2][arg6][arg7] & 0x10) != 0) {
					return;
				}
				if (this.method62(arg2, arg7, arg6) != anInt169) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg2][arg6][arg7];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg7];
			@Pc(61) int local61 = this.anIntArrayArrayArray3[arg2][arg6 + 1][arg7 + 1];
			@Pc(72) int local72 = this.anIntArrayArrayArray3[arg2][arg6][arg7 + 1];
			@Pc(82) int local82 = local33 + local44 + local61 + local72 >> 2;
			@Pc(85) Class9 local85 = Class9.method287(arg3);
			@Pc(97) int local97 = arg6 + (arg7 << 7) + (arg3 << 14) + 1073741824;
			if (!local85.aBoolean128) {
				local97 += Integer.MIN_VALUE;
			}
			@Pc(111) byte local111 = (byte) ((arg5 << 6) + arg0);
			@Pc(137) Class1_Sub1_Sub1 local137;
			if (arg0 != 22) {
				@Pc(232) int local232;
				if (arg0 == 10 || arg0 == 11) {
					if (local85.anInt510 == -1) {
						local137 = local85.method293(10, arg5, local33, local44, local61, local72, -1);
					} else {
						local137 = new Class1_Sub1_Sub1_Sub2(10, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
					}
					if (local137 != null) {
						@Pc(219) int local219 = 0;
						if (arg0 == 11) {
							local219 += 256;
						}
						@Pc(235) int local235;
						if (arg5 == 1 || arg5 == 3) {
							local232 = local85.anInt509;
							local235 = local85.anInt508;
						} else {
							local232 = local85.anInt508;
							local235 = local85.anInt509;
						}
						if (arg1.method534(local232, local137, arg6, local235, local219, arg2, arg7, local111, local97, local82) && local85.aBoolean133) {
							@Pc(266) Class1_Sub1_Sub1_Sub5 local266;
							if (local137 instanceof Class1_Sub1_Sub1_Sub5) {
								local266 = (Class1_Sub1_Sub1_Sub5) local137;
							} else {
								local266 = local85.method293(10, arg5, local33, local44, local61, local72, -1);
							}
							if (local266 != null) {
								for (@Pc(282) int local282 = 0; local282 <= local232; local282++) {
									for (@Pc(286) int local286 = 0; local286 <= local235; local286++) {
										@Pc(293) int local293 = local266.anInt491 / 4;
										if (local293 > 30) {
											local293 = 30;
										}
										if (local293 > this.aByteArrayArrayArray6[arg2][arg6 + local282][arg7 + local286]) {
											this.aByteArrayArrayArray6[arg2][arg6 + local282][arg7 + local286] = (byte) local293;
										}
									}
								}
							}
						}
					}
					if (local85.aBoolean126 && arg4 != null) {
						arg4.method419(arg7, local85.anInt509, local85.anInt508, arg6, local85.aBoolean127, (byte) 5, arg5);
					}
				} else if (arg0 >= 12) {
					if (local85.anInt510 == -1) {
						local137 = local85.method293(arg0, arg5, local33, local44, local61, local72, -1);
					} else {
						local137 = new Class1_Sub1_Sub1_Sub2(arg0, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
					}
					arg1.method534(1, local137, arg6, 1, 0, arg2, arg7, local111, local97, local82);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
						this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x924;
					}
					if (local85.aBoolean126 && arg4 != null) {
						arg4.method419(arg7, local85.anInt509, local85.anInt508, arg6, local85.aBoolean127, (byte) 5, arg5);
					}
				} else if (arg0 == 0) {
					if (local85.anInt510 == -1) {
						local137 = local85.method293(0, arg5, local33, local44, local61, local72, -1);
					} else {
						local137 = new Class1_Sub1_Sub1_Sub2(0, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
					}
					arg1.method532(arg2, arg6, 0, local111, arg7, local137, local97, anIntArray24[arg5], local82, null);
					if (arg5 == 0) {
						if (local85.aBoolean133) {
							this.aByteArrayArrayArray6[arg2][arg6][arg7] = 50;
							this.aByteArrayArrayArray6[arg2][arg6][arg7 + 1] = 50;
						}
						if (local85.aBoolean131) {
							this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x249;
						}
					} else if (arg5 == 1) {
						if (local85.aBoolean133) {
							this.aByteArrayArrayArray6[arg2][arg6][arg7 + 1] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7 + 1] = 50;
						}
						if (local85.aBoolean131) {
							this.anIntArrayArrayArray4[arg2][arg6][arg7 + 1] |= 0x492;
						}
					} else if (arg5 == 2) {
						if (local85.aBoolean133) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7 + 1] = 50;
						}
						if (local85.aBoolean131) {
							this.anIntArrayArrayArray4[arg2][arg6 + 1][arg7] |= 0x249;
						}
					} else if (arg5 == 3) {
						if (local85.aBoolean133) {
							this.aByteArrayArrayArray6[arg2][arg6][arg7] = 50;
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7] = 50;
						}
						if (local85.aBoolean131) {
							this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x492;
						}
					}
					if (local85.aBoolean126 && arg4 != null) {
						arg4.method418(arg7, 352, arg5, arg6, arg0, local85.aBoolean127);
					}
					if (local85.anInt511 != 16) {
						arg1.method540(arg7, arg6, local85.anInt511, arg2);
					}
				} else if (arg0 == 1) {
					if (local85.anInt510 == -1) {
						local137 = local85.method293(1, arg5, local33, local44, local61, local72, -1);
					} else {
						local137 = new Class1_Sub1_Sub1_Sub2(1, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
					}
					arg1.method532(arg2, arg6, 0, local111, arg7, local137, local97, anIntArray25[arg5], local82, null);
					if (local85.aBoolean133) {
						if (arg5 == 0) {
							this.aByteArrayArrayArray6[arg2][arg6][arg7 + 1] = 50;
						} else if (arg5 == 1) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7 + 1] = 50;
						} else if (arg5 == 2) {
							this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7] = 50;
						} else if (arg5 == 3) {
							this.aByteArrayArrayArray6[arg2][arg6][arg7] = 50;
						}
					}
					if (local85.aBoolean126 && arg4 != null) {
						arg4.method418(arg7, 352, arg5, arg6, arg0, local85.aBoolean127);
					}
				} else {
					@Pc(834) int local834;
					@Pc(860) Class1_Sub1_Sub1 local860;
					if (arg0 == 2) {
						local834 = arg5 + 1 & 0x3;
						@Pc(850) Class1_Sub1_Sub1 local850;
						if (local85.anInt510 == -1) {
							local850 = local85.method293(2, arg5 + 4, local33, local44, local61, local72, -1);
							local860 = local85.method293(2, local834, local33, local44, local61, local72, -1);
						} else {
							local850 = new Class1_Sub1_Sub1_Sub2(2, false, local33, local72, local61, local44, local85.anInt510, true, arg5 + 4, arg3);
							local860 = new Class1_Sub1_Sub1_Sub2(2, false, local33, local72, local61, local44, local85.anInt510, true, local834, arg3);
						}
						arg1.method532(arg2, arg6, anIntArray24[local834], local111, arg7, local850, local97, anIntArray24[arg5], local82, local860);
						if (local85.aBoolean131) {
							if (arg5 == 0) {
								this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg7 + 1] |= 0x492;
							} else if (arg5 == 1) {
								this.anIntArrayArrayArray4[arg2][arg6][arg7 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg7] |= 0x249;
							} else if (arg5 == 2) {
								this.anIntArrayArrayArray4[arg2][arg6 + 1][arg7] |= 0x249;
								this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x492;
							} else if (arg5 == 3) {
								this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x492;
								this.anIntArrayArrayArray4[arg2][arg6][arg7] |= 0x249;
							}
						}
						if (local85.aBoolean126 && arg4 != null) {
							arg4.method418(arg7, 352, arg5, arg6, arg0, local85.aBoolean127);
						}
						if (local85.anInt511 != 16) {
							arg1.method540(arg7, arg6, local85.anInt511, arg2);
						}
					} else if (arg0 == 3) {
						if (local85.anInt510 == -1) {
							local137 = local85.method293(3, arg5, local33, local44, local61, local72, -1);
						} else {
							local137 = new Class1_Sub1_Sub1_Sub2(3, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
						}
						arg1.method532(arg2, arg6, 0, local111, arg7, local137, local97, anIntArray25[arg5], local82, null);
						if (local85.aBoolean133) {
							if (arg5 == 0) {
								this.aByteArrayArrayArray6[arg2][arg6][arg7 + 1] = 50;
							} else if (arg5 == 1) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7 + 1] = 50;
							} else if (arg5 == 2) {
								this.aByteArrayArrayArray6[arg2][arg6 + 1][arg7] = 50;
							} else if (arg5 == 3) {
								this.aByteArrayArrayArray6[arg2][arg6][arg7] = 50;
							}
						}
						if (local85.aBoolean126 && arg4 != null) {
							arg4.method418(arg7, 352, arg5, arg6, arg0, local85.aBoolean127);
						}
					} else if (arg0 == 9) {
						if (local85.anInt510 == -1) {
							local137 = local85.method293(arg0, arg5, local33, local44, local61, local72, -1);
						} else {
							local137 = new Class1_Sub1_Sub1_Sub2(arg0, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
						}
						arg1.method534(1, local137, arg6, 1, 0, arg2, arg7, local111, local97, local82);
						if (local85.aBoolean126 && arg4 != null) {
							arg4.method419(arg7, local85.anInt509, local85.anInt508, arg6, local85.aBoolean127, (byte) 5, arg5);
						}
					} else {
						if (local85.aBoolean129) {
							if (arg5 == 1) {
								local834 = local72;
								local72 = local61;
								local61 = local44;
								local44 = local33;
								local33 = local834;
							} else if (arg5 == 2) {
								local834 = local72;
								local72 = local44;
								local44 = local834;
								local834 = local61;
								local61 = local33;
								local33 = local834;
							} else if (arg5 == 3) {
								local834 = local72;
								local72 = local33;
								local33 = local44;
								local44 = local61;
								local61 = local834;
							}
						}
						if (arg0 == 4) {
							if (local85.anInt510 == -1) {
								local137 = local85.method293(4, 0, local33, local44, local61, local72, -1);
							} else {
								local137 = new Class1_Sub1_Sub1_Sub2(4, false, local33, local72, local61, local44, local85.anInt510, true, 0, arg3);
							}
							arg1.method533(local97, local137, 0, arg2, arg5 * 512, anIntArray24[arg5], 0, arg6, local111, local82, arg7);
						} else if (arg0 == 5) {
							local834 = 16;
							local232 = arg1.method550(arg2, arg6, arg7);
							if (local232 > 0) {
								local834 = Class9.method287(local232 >> 14 & 0x7FFF).anInt511;
							}
							if (local85.anInt510 == -1) {
								local860 = local85.method293(4, 0, local33, local44, local61, local72, -1);
							} else {
								local860 = new Class1_Sub1_Sub1_Sub2(4, false, local33, local72, local61, local44, local85.anInt510, true, 0, arg3);
							}
							arg1.method533(local97, local860, anIntArray26[arg5] * local834, arg2, arg5 * 512, anIntArray24[arg5], anIntArray27[arg5] * local834, arg6, local111, local82, arg7);
						} else if (arg0 == 6) {
							if (local85.anInt510 == -1) {
								local137 = local85.method293(4, 0, local33, local44, local61, local72, -1);
							} else {
								local137 = new Class1_Sub1_Sub1_Sub2(4, false, local33, local72, local61, local44, local85.anInt510, true, 0, arg3);
							}
							arg1.method533(local97, local137, 0, arg2, arg5, 256, 0, arg6, local111, local82, arg7);
						} else if (arg0 == 7) {
							if (local85.anInt510 == -1) {
								local137 = local85.method293(4, 0, local33, local44, local61, local72, -1);
							} else {
								local137 = new Class1_Sub1_Sub1_Sub2(4, false, local33, local72, local61, local44, local85.anInt510, true, 0, arg3);
							}
							arg1.method533(local97, local137, 0, arg2, arg5, 512, 0, arg6, local111, local82, arg7);
						} else if (arg0 == 8) {
							if (local85.anInt510 == -1) {
								local137 = local85.method293(4, 0, local33, local44, local61, local72, -1);
							} else {
								local137 = new Class1_Sub1_Sub1_Sub2(4, false, local33, local72, local61, local44, local85.anInt510, true, 0, arg3);
							}
							arg1.method533(local97, local137, 0, arg2, arg5, 768, 0, arg6, local111, local82, arg7);
						}
					}
				}
			} else if (!aBoolean45 || local85.aBoolean128 || local85.aBoolean134) {
				if (local85.anInt510 == -1) {
					local137 = local85.method293(22, arg5, local33, local44, local61, local72, -1);
				} else {
					local137 = new Class1_Sub1_Sub1_Sub2(22, false, local33, local72, local61, local44, local85.anInt510, true, arg5, arg3);
				}
				arg1.method530(local82, arg7, local111, arg2, local137, arg6, local97);
				if (local85.aBoolean126 && local85.aBoolean128 && arg4 != null) {
					arg4.method420(arg6, arg7);
				}
			}
		} catch (@Pc(1584) RuntimeException local1584) {
			signlink.reporterror("81728, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 19 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1584.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!r;[Lclient!jc;)V")
	public void method61(@OriginalArg(1) Class37 arg0, @OriginalArg(2) Class19[] arg1) {
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
								arg1[local27].method420(local7, local11);
							}
						}
					}
				}
			}
			anInt172 += (int) (Math.random() * 5.0D) - 2;
			if (anInt172 < -8) {
				anInt172 = -8;
			}
			if (anInt172 > 8) {
				anInt172 = 8;
			}
			anInt173 += (int) (Math.random() * 5.0D) - 2;
			if (anInt173 < -16) {
				anInt173 = -16;
			}
			if (anInt173 > 16) {
				anInt173 = 16;
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
				for (local141 = 1; local141 < this.anInt171 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt170 - 1; local145++) {
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
				for (local145 = 0; local145 < this.anInt171; local145++) {
					this.anIntArray19[local145] = 0;
					this.anIntArray20[local145] = 0;
					this.anIntArray21[local145] = 0;
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt170 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt171; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt170) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Class21.aClass21Array1[local210 - 1];
								this.anIntArray19[local191] += local378.anInt712;
								this.anIntArray20[local191] += local378.anInt710;
								this.anIntArray21[local191] += local378.anInt711;
								this.anIntArray22[local191] += local378.anInt713;
								local419 = this.anIntArray23[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt170) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Class21.aClass21Array1[local214 - 1];
								this.anIntArray19[local191] -= local451.anInt712;
								this.anIntArray20[local191] -= local451.anInt710;
								this.anIntArray21[local191] -= local451.anInt711;
								this.anIntArray22[local191] -= local451.anInt713;
								local419 = this.anIntArray23[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt170 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt171 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt171) {
								local204 += this.anIntArray19[local527];
								local210 += this.anIntArray20[local527];
								local214 += this.anIntArray21[local527];
								local220 += this.anIntArray22[local527];
								local236 += this.anIntArray23[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt171) {
								local204 -= this.anIntArray19[local572];
								local210 -= this.anIntArray20[local572];
								local214 -= this.anIntArray21[local572];
								local220 -= this.anIntArray22[local572];
								local236 -= this.anIntArray23[local572];
							}
							if (local284 >= 1 && local284 < this.anInt171 - 1 && (!aBoolean45 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method62(local7, local284, local169) == anInt169)) {
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
										local752 = this.method70(local762, local766, local770);
										@Pc(782) int local782 = local762 + anInt172 & 0xFF;
										local770 += anInt173;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method70(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Class21.aClass21Array1[local666 - 1].aBoolean187) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray4[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Class1_Sub1_Sub2_Sub1.anIntArray180[method68(local754, 96)];
									}
									if (local666 == 0) {
										arg0.method529(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, method68(local752, local721), method68(local752, local730), method68(local752, local741), method68(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Class21.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt708;
										@Pc(937) int local937;
										@Pc(935) int local935;
										if (local928 >= 0) {
											local935 = Class1_Sub1_Sub2_Sub1.method345(local928, this.anInt166);
											local937 = -1;
										} else if (local925.anInt707 == 16711935) {
											local935 = 0;
											local937 = -2;
											local928 = -1;
										} else {
											local937 = this.method70(local925.anInt709, local925.anInt710, local925.anInt711);
											local935 = Class1_Sub1_Sub2_Sub1.anIntArray180[this.method69(local925.anInt714, 96)];
										}
										arg0.method529(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, method68(local752, local721), method68(local752, local730), method68(local752, local741), method68(local752, local750), this.method69(local937, local721), this.method69(local937, local730), this.method69(local937, local741), this.method69(local937, local750), local762, local935);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt171 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt170 - 1; local204++) {
						arg0.method528(local7, local204, local191, this.method62(local7, local191, local204));
					}
				}
			}
			arg0.method555();
			for (local11 = 0; local11 < this.anInt170; local11++) {
				for (local27 = 0; local27 < this.anInt171; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method526(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1112) int local1112 = 2;
			@Pc(1114) int local1114 = 4;
			for (@Pc(1116) int local1116 = 0; local1116 < 4; local1116++) {
				if (local1116 > 0) {
					local27 <<= 0x3;
					local1112 <<= 0x3;
					local1114 <<= 0x3;
				}
				for (@Pc(1134) int local1134 = 0; local1134 <= local1116; local1134++) {
					for (local133 = 0; local133 <= this.anInt171; local133++) {
						for (local139 = 0; local139 <= this.anInt170; local139++) {
							if ((this.anIntArrayArrayArray4[local1134][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1134;
								local191 = local1134;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1134][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt171 && (this.anIntArrayArrayArray4[local1134][local139][local145 + 1] & local27) != 0) {
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
								label313: while (local191 < local1116) {
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
									Class37.method527(local145 * 128 + 128, local220, local141 * 128, local1116, local139 * 128, local139 * 128, local214, 1);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1134][local139][local133] & local1112) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1134;
								local191 = local1134;
								while (local141 > 0 && (this.anIntArrayArrayArray4[local1134][local141 - 1][local133] & local1112) != 0) {
									local141--;
								}
								while (local145 < this.anInt170 && (this.anIntArrayArrayArray4[local1134][local145 + 1][local133] & local1112) != 0) {
									local145++;
								}
								label377: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local169 - 1][local204][local133] & local1112) == 0) {
											break label377;
										}
									}
									local169--;
								}
								label366: while (local191 < local1116) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray4[local191 + 1][local204][local133] & local1112) == 0) {
											break label366;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray3[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray3[local169][local141][local133];
									Class37.method527(local133 * 128, local220, local133 * 128, local1116, local141 * 128, local145 * 128 + 128, local214, 2);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray4[local236][local284][local133] &= ~local1112;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1134][local139][local133] & local1114) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray4[local1134][local139][local169 - 1] & local1114) != 0) {
									local169--;
								}
								while (local191 < this.anInt171 && (this.anIntArrayArrayArray4[local1134][local139][local191 + 1] & local1114) != 0) {
									local191++;
								}
								label430: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1134][local141 - 1][local204] & local1114) == 0) {
											break label430;
										}
									}
									local141--;
								}
								label419: while (local145 < this.anInt170) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray4[local1134][local145 + 1][local204] & local1114) == 0) {
											break label419;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray3[local1134][local141][local169];
									Class37.method527(local191 * 128 + 128, local204, local169 * 128, local1116, local141 * 128, local145 * 128 + 128, local204, 4);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray4[local1134][local210][local214] &= ~local1114;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1749) RuntimeException local1749) {
			signlink.reporterror("88705, " + 59 + ", " + arg0 + ", " + arg1 + ", " + local1749.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("20799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
	private int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
