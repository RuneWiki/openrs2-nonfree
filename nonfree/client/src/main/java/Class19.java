import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HTMZBQHM")
public final class Class19 {

	@OriginalMember(owner = "client!HTMZBQHM", name = "m", descriptor = "I")
	private static int anInt364;

	@OriginalMember(owner = "client!HTMZBQHM", name = "C", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!HTMZBQHM", name = "h", descriptor = "Z")
	public static boolean aBoolean99 = true;

	@OriginalMember(owner = "client!HTMZBQHM", name = "j", descriptor = "I")
	private static int anInt363 = 9776;

	@OriginalMember(owner = "client!HTMZBQHM", name = "l", descriptor = "[I")
	private static final int[] anIntArray105 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!HTMZBQHM", name = "o", descriptor = "B")
	private static byte aByte13 = 3;

	@OriginalMember(owner = "client!HTMZBQHM", name = "p", descriptor = "[I")
	private static final int[] anIntArray106 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!HTMZBQHM", name = "r", descriptor = "I")
	private static int anInt365 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!HTMZBQHM", name = "s", descriptor = "I")
	public static int anInt366 = 99;

	@OriginalMember(owner = "client!HTMZBQHM", name = "v", descriptor = "[I")
	private static final int[] anIntArray107 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!HTMZBQHM", name = "w", descriptor = "I")
	private static int anInt369 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!HTMZBQHM", name = "x", descriptor = "I")
	private static int anInt370 = -677;

	@OriginalMember(owner = "client!HTMZBQHM", name = "A", descriptor = "[I")
	private static final int[] anIntArray108 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!HTMZBQHM", name = "D", descriptor = "B")
	private static byte aByte14 = 8;

	@OriginalMember(owner = "client!HTMZBQHM", name = "z", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!HTMZBQHM", name = "q", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!HTMZBQHM", name = "E", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!HTMZBQHM", name = "H", descriptor = "Z")
	private boolean aBoolean102 = true;

	@OriginalMember(owner = "client!HTMZBQHM", name = "t", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!HTMZBQHM", name = "u", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!HTMZBQHM", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!HTMZBQHM", name = "g", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!HTMZBQHM", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!HTMZBQHM", name = "f", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!HTMZBQHM", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!HTMZBQHM", name = "G", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!HTMZBQHM", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!HTMZBQHM", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!HTMZBQHM", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!HTMZBQHM", name = "b", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!HTMZBQHM", name = "c", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!HTMZBQHM", name = "d", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!HTMZBQHM", name = "e", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(II)I")
	private static int method297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "([[[IIIIIILclient!DLDGGHZP;IIILclient!EXLGBZBR;)V")
	public static void method298(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class14 arg10) {
		try {
			@Pc(9) int local9 = arg0[arg3][arg9][arg2];
			@Pc(19) int local19 = arg0[arg3][arg9 + 1][arg2];
			@Pc(31) int local31 = arg0[arg3][arg9 + 1][arg2 + 1];
			@Pc(41) int local41 = arg0[arg3][arg9][arg2 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class40 local54 = Class40.method529(arg8);
			@Pc(66) int local66 = arg9 + (arg2 << 7) + (arg8 << 14) + 1073741824;
			if (!local54.aBoolean175) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg7 << 6) + arg4);
			@Pc(85) int local85;
			if (arg5 != anInt363) {
				for (local85 = 1; local85 > 0; local85++) {
				}
			}
			@Pc(110) Class1_Sub1_Sub1 local110;
			if (arg4 == 22) {
				if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
					local110 = local54.method522(22, arg7, local9, local19, local31, local41, -1);
				} else {
					local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, 22, local9, (byte) 5, local31, local41);
				}
				arg6.method48(local80, local51, arg9, arg1, local66, arg2, local110, aByte13);
				if (local54.aBoolean176 && local54.aBoolean175) {
					arg10.method155(arg9, arg2);
				}
			} else {
				@Pc(206) int local206;
				if (arg4 == 10 || arg4 == 11) {
					if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
						local110 = local54.method522(10, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, 10, local9, (byte) 5, local31, local41);
					}
					if (local110 != null) {
						@Pc(193) int local193 = 0;
						if (arg4 == 11) {
							local193 += 256;
						}
						@Pc(209) int local209;
						if (arg7 == 1 || arg7 == 3) {
							local206 = local54.anInt722;
							local209 = local54.anInt736;
						} else {
							local206 = local54.anInt736;
							local209 = local54.anInt722;
						}
						arg6.method52(local206, local193, arg9, local110, local66, arg1, arg2, local80, local209, local51);
					}
					if (local54.aBoolean176) {
						arg10.method154(local54.anInt722, arg2, arg7, arg9, local54.anInt736, local54.aBoolean179);
					}
				} else if (arg4 >= 12) {
					if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
						local110 = local54.method522(arg4, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, arg4, local9, (byte) 5, local31, local41);
					}
					arg6.method52(1, 0, arg9, local110, local66, arg1, arg2, local80, 1, local51);
					if (local54.aBoolean176) {
						arg10.method154(local54.anInt722, arg2, arg7, arg9, local54.anInt736, local54.aBoolean179);
					}
				} else if (arg4 == 0) {
					if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
						local110 = local54.method522(0, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, 0, local9, (byte) 5, local31, local41);
					}
					arg6.method50(arg1, local80, arg9, anIntArray105[arg7], arg2, null, local51, local110, 0, local66);
					if (local54.aBoolean176) {
						arg10.method153(local54.aBoolean179, arg2, arg7, arg9, arg4);
					}
				} else if (arg4 == 1) {
					if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
						local110 = local54.method522(1, arg7, local9, local19, local31, local41, -1);
					} else {
						local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, 1, local9, (byte) 5, local31, local41);
					}
					arg6.method50(arg1, local80, arg9, anIntArray107[arg7], arg2, null, local51, local110, 0, local66);
					if (local54.aBoolean176) {
						arg10.method153(local54.aBoolean179, arg2, arg7, arg9, arg4);
					}
				} else {
					@Pc(481) Class1_Sub1_Sub1 local481;
					if (arg4 == 2) {
						local85 = arg7 + 1 & 0x3;
						@Pc(471) Class1_Sub1_Sub1 local471;
						if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
							local471 = local54.method522(2, arg7 + 4, local9, local19, local31, local41, -1);
							local481 = local54.method522(2, local85, local9, local19, local31, local41, -1);
						} else {
							local471 = new Class1_Sub1_Sub1_Sub3(arg7 + 4, local19, true, local54.anInt726, arg8, 2, local9, (byte) 5, local31, local41);
							local481 = new Class1_Sub1_Sub1_Sub3(local85, local19, true, local54.anInt726, arg8, 2, local9, (byte) 5, local31, local41);
						}
						arg6.method50(arg1, local80, arg9, anIntArray105[arg7], arg2, local481, local51, local471, anIntArray105[local85], local66);
						if (local54.aBoolean176) {
							arg10.method153(local54.aBoolean179, arg2, arg7, arg9, arg4);
						}
					} else if (arg4 == 3) {
						if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
							local110 = local54.method522(3, arg7, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, 3, local9, (byte) 5, local31, local41);
						}
						arg6.method50(arg1, local80, arg9, anIntArray107[arg7], arg2, null, local51, local110, 0, local66);
						if (local54.aBoolean176) {
							arg10.method153(local54.aBoolean179, arg2, arg7, arg9, arg4);
						}
					} else if (arg4 == 9) {
						if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
							local110 = local54.method522(arg4, arg7, local9, local19, local31, local41, -1);
						} else {
							local110 = new Class1_Sub1_Sub1_Sub3(arg7, local19, true, local54.anInt726, arg8, arg4, local9, (byte) 5, local31, local41);
						}
						arg6.method52(1, 0, arg9, local110, local66, arg1, arg2, local80, 1, local51);
						if (local54.aBoolean176) {
							arg10.method154(local54.anInt722, arg2, arg7, arg9, local54.anInt736, local54.aBoolean179);
						}
					} else {
						if (local54.aBoolean174) {
							if (arg7 == 1) {
								local85 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local85;
							} else if (arg7 == 2) {
								local85 = local41;
								local41 = local19;
								local19 = local85;
								local85 = local31;
								local31 = local9;
								local9 = local85;
							} else if (arg7 == 3) {
								local85 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local85;
							}
						}
						if (arg4 == 4) {
							if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
								local110 = local54.method522(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub3(0, local19, true, local54.anInt726, arg8, 4, local9, (byte) 5, local31, local41);
							}
							arg6.method51(anIntArray105[arg7], local66, local110, 0, local80, arg2, local51, arg9, 0, arg1, arg7 * 512, (byte) 2);
						} else if (arg4 == 5) {
							local85 = 16;
							local206 = arg6.method68(arg1, arg9, arg2);
							if (local206 > 0) {
								local85 = Class40.method529(local206 >> 14 & 0x7FFF).anInt732;
							}
							if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
								local481 = local54.method522(4, 0, local9, local19, local31, local41, -1);
							} else {
								local481 = new Class1_Sub1_Sub1_Sub3(0, local19, true, local54.anInt726, arg8, 4, local9, (byte) 5, local31, local41);
							}
							arg6.method51(anIntArray105[arg7], local66, local481, anIntArray106[arg7] * local85, local80, arg2, local51, arg9, anIntArray108[arg7] * local85, arg1, arg7 * 512, (byte) 2);
						} else if (arg4 == 6) {
							if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
								local110 = local54.method522(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub3(0, local19, true, local54.anInt726, arg8, 4, local9, (byte) 5, local31, local41);
							}
							arg6.method51(256, local66, local110, 0, local80, arg2, local51, arg9, 0, arg1, arg7, (byte) 2);
						} else if (arg4 == 7) {
							if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
								local110 = local54.method522(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub3(0, local19, true, local54.anInt726, arg8, 4, local9, (byte) 5, local31, local41);
							}
							arg6.method51(512, local66, local110, 0, local80, arg2, local51, arg9, 0, arg1, arg7, (byte) 2);
						} else if (arg4 == 8) {
							if (local54.anInt726 == -1 && local54.anIntArray164 == null) {
								local110 = local54.method522(4, 0, local9, local19, local31, local41, -1);
							} else {
								local110 = new Class1_Sub1_Sub1_Sub3(0, local19, true, local54.anInt726, arg8, 4, local9, (byte) 5, local31, local41);
							}
							arg6.method51(768, local66, local110, 0, local80, arg2, local51, arg9, 0, arg1, arg7, (byte) 2);
						}
					}
				}
			}
		} catch (@Pc(1020) RuntimeException local1020) {
			signlink.reporterror("27727, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1020.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(IIII)I")
	private static int method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub3.anIntArray54[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "b", descriptor = "(II)I")
	private static int method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method311(arg0 + 45365, arg1 + 91923, 4) + (method311(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method311(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "([BIBI)Z")
	public static boolean method302(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg0, anInt364);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(24) int local24 = local9.method373();
				if (local24 == 0) {
					return local3;
				}
				local11 += local24;
				@Pc(32) int local32 = 0;
				@Pc(34) boolean local34 = false;
				while (true) {
					@Pc(39) int local39;
					while (!local34) {
						local39 = local9.method373();
						if (local39 == 0) {
							continue label53;
						}
						local32 += local39 - 1;
						@Pc(61) int local61 = local32 & 0x3F;
						@Pc(67) int local67 = local32 >> 6 & 0x3F;
						@Pc(72) int local72 = local9.method359() >> 2;
						@Pc(76) int local76 = local67 + arg1;
						@Pc(80) int local80 = local61 + arg2;
						if (local76 > 0 && local80 > 0 && local76 < 103 && local80 < 103) {
							@Pc(93) Class40 local93 = Class40.method529(local11);
							if (local72 != 22 || !aBoolean99 || local93.aBoolean175 || local93.aBoolean182) {
								local3 &= local93.method524(aByte14);
								local34 = true;
							}
						}
					}
					local39 = local9.method373();
					if (local39 == 0) {
						break;
					}
					local9.method359();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("89087, " + arg0 + ", " + arg1 + ", " + -102 + ", " + arg2 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "c", descriptor = "(II)I")
	private static int method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method313(arg0 - 1, arg1 - 1) + method313(arg0 + 1, arg1 - 1) + method313(arg0 - 1, arg1 + 1) + method313(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method313(arg0 - 1, arg1) + method313(arg0 + 1, arg1) + method313(arg0, arg1 - 1) + method313(arg0, arg1 + 1);
		@Pc(59) int local59 = method313(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(ILclient!LDILQFVA;Lclient!GLPUEKVZ;)V")
	public static void method304(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class16_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(17) int local17 = arg0.method373();
				if (local17 == 0) {
					return;
				}
				local3 += local17;
				@Pc(26) Class40 local26 = Class40.method529(local3);
				local26.method526(arg1);
				while (true) {
					@Pc(33) int local33 = arg0.method373();
					if (local33 == 0) {
						break;
					}
					arg0.method359();
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("17999, " + -548 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(III)Z")
	public static boolean method308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) Class40 local6 = Class40.method529(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local6.method528(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48450, " + 500 + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "b", descriptor = "(III)I")
	private static int method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method303(local3, local13);
		@Pc(29) int local29 = method303(local3 + 1, local13);
		@Pc(35) int local35 = method303(local3, local13 + 1);
		@Pc(43) int local43 = method303(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method299(local23, local29, local9, arg2);
		@Pc(55) int local55 = method299(local35, local43, local9, arg2);
		return method299(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "e", descriptor = "(II)I")
	private static int method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "<init>", descriptor = "([[[BBI[[[II)V")
	public Class19(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			anInt366 = 99;
			this.anInt367 = arg2;
			this.anInt368 = arg4;
			this.anIntArrayArrayArray5 = arg3;
			this.aByteArrayArrayArray2 = arg0;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt367][this.anInt368];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt367][this.anInt368];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt367][this.anInt368];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt367][this.anInt368];
			this.anIntArrayArrayArray6 = new int[4][this.anInt367 + 1][this.anInt368 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt367 + 1][this.anInt368 + 1];
			this.anIntArrayArray15 = new int[this.anInt367 + 1][this.anInt368 + 1];
			this.anIntArray100 = new int[this.anInt368];
			this.anIntArray101 = new int[this.anInt368];
			this.anIntArray102 = new int[this.anInt368];
			this.anIntArray103 = new int[this.anInt368];
			this.anIntArray104 = new int[this.anInt368];
			if (arg1 == 3) {
				@Pc(121) boolean local121 = false;
			} else {
				for (@Pc(124) int local124 = 1; local124 > 0; local124++) {
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(ILclient!DLDGGHZP;[BI[Lclient!EXLGBZBR;I)V")
	public void method295(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) Class14[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg2, anInt364);
			@Pc(18) int local18 = -1;
			while (true) {
				@Pc(21) int local21 = local16.method373();
				if (local21 == 0) {
					return;
				}
				local18 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local16.method373();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local16.method359();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg0;
					@Pc(73) int local73 = local44 + arg4;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray2[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class14 local100 = null;
						if (local85 >= 0) {
							local100 = arg3[local85];
						}
						this.method307(local65, local54, local61, local69, arg1, local18, local73, local100);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("68781, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -696 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(ZLclient!DLDGGHZP;[Lclient!EXLGBZBR;)V")
	public void method296(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class14[] arg1) {
		try {
			@Pc(11) int local11;
			@Pc(15) int local15;
			@Pc(31) int local31;
			for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					for (local15 = 0; local15 < 104; local15++) {
						if ((this.aByteArrayArrayArray2[local7][local11][local15] & 0x1) == 1) {
							local31 = local7;
							if ((this.aByteArrayArrayArray2[1][local11][local15] & 0x2) == 2) {
								local31 = local7 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method155(local11, local15);
							}
						}
					}
				}
			}
			anInt365 += (int) (Math.random() * 5.0D) - 2;
			if (anInt365 < -8) {
				anInt365 = -8;
			}
			if (anInt365 > 8) {
				anInt365 = 8;
			}
			anInt369 += (int) (Math.random() * 5.0D) - 2;
			if (anInt369 < -16) {
				anInt369 = -16;
			}
			if (anInt369 > 16) {
				anInt369 = 16;
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
			for (local11 = 0; local11 < 4; local11++) {
				@Pc(112) byte[][] local112 = this.aByteArrayArrayArray5[local11];
				local137 = (int) Math.sqrt((double) 5100);
				local143 = local137 * 768 >> 8;
				for (local145 = 1; local145 < this.anInt368 - 1; local145++) {
					for (local149 = 1; local149 < this.anInt367 - 1; local149++) {
						local173 = this.anIntArrayArrayArray5[local11][local149 + 1][local145] - this.anIntArrayArrayArray5[local11][local149 - 1][local145];
						local195 = this.anIntArrayArrayArray5[local11][local149][local145 + 1] - this.anIntArrayArrayArray5[local11][local149][local145 - 1];
						local208 = (int) Math.sqrt((double) (local173 * local173 + local195 * local195 + 65536));
						local214 = (local173 << 8) / local208;
						local218 = 65536 / local208;
						local224 = (local195 << 8) / local208;
						local240 = (local214 * -50 + local218 * -10 + local224 * -50) / local143 + 96;
						local288 = (local112[local149 - 1][local145] >> 2) + (local112[local149 + 1][local145] >> 3) + (local112[local149][local145 - 1] >> 2) + (local112[local149][local145 + 1] >> 3) + (local112[local149][local145] >> 1);
						this.anIntArrayArray15[local149][local145] = local240 - local288;
					}
				}
				for (local149 = 0; local149 < this.anInt368; local149++) {
					this.anIntArray100[local149] = 0;
					this.anIntArray101[local149] = 0;
					this.anIntArray102[local149] = 0;
					this.anIntArray103[local149] = 0;
					this.anIntArray104[local149] = 0;
				}
				for (local173 = -5; local173 < this.anInt367 + 5; local173++) {
					for (local195 = 0; local195 < this.anInt368; local195++) {
						local208 = local173 + 5;
						@Pc(423) int local423;
						if (local208 >= 0 && local208 < this.anInt367) {
							local214 = this.aByteArrayArrayArray4[local11][local208][local195] & 0xFF;
							if (local214 > 0) {
								@Pc(382) Class43 local382 = Class43.aClass43Array1[local214 - 1];
								this.anIntArray100[local195] += local382.anInt762;
								this.anIntArray101[local195] += local382.anInt760;
								this.anIntArray102[local195] += local382.anInt761;
								this.anIntArray103[local195] += local382.anInt763;
								local423 = this.anIntArray104[local195]++;
							}
						}
						local214 = local173 - 5;
						if (local214 >= 0 && local214 < this.anInt367) {
							local218 = this.aByteArrayArrayArray4[local11][local214][local195] & 0xFF;
							if (local218 > 0) {
								@Pc(455) Class43 local455 = Class43.aClass43Array1[local218 - 1];
								this.anIntArray100[local195] -= local455.anInt762;
								this.anIntArray101[local195] -= local455.anInt760;
								this.anIntArray102[local195] -= local455.anInt761;
								this.anIntArray103[local195] -= local455.anInt763;
								local423 = this.anIntArray104[local195]--;
							}
						}
					}
					if (local173 >= 1 && local173 < this.anInt367 - 1) {
						local208 = 0;
						local214 = 0;
						local218 = 0;
						local224 = 0;
						local240 = 0;
						for (local288 = -5; local288 < this.anInt368 + 5; local288++) {
							@Pc(531) int local531 = local288 + 5;
							if (local531 >= 0 && local531 < this.anInt368) {
								local208 += this.anIntArray100[local531];
								local214 += this.anIntArray101[local531];
								local218 += this.anIntArray102[local531];
								local224 += this.anIntArray103[local531];
								local240 += this.anIntArray104[local531];
							}
							@Pc(576) int local576 = local288 - 5;
							if (local576 >= 0 && local576 < this.anInt368) {
								local208 -= this.anIntArray100[local576];
								local214 -= this.anIntArray101[local576];
								local218 -= this.anIntArray102[local576];
								local224 -= this.anIntArray103[local576];
								local240 -= this.anIntArray104[local576];
							}
							if (local288 >= 1 && local288 < this.anInt368 - 1 && (!aBoolean99 || (this.aByteArrayArrayArray2[0][local173][local288] & 0x2) != 0 || (this.aByteArrayArrayArray2[local11][local173][local288] & 0x10) == 0 && this.method300(local173, local288, local11) == anInt372)) {
								if (local11 < anInt366) {
									anInt366 = local11;
								}
								@Pc(675) int local675 = this.aByteArrayArrayArray4[local11][local173][local288] & 0xFF;
								@Pc(686) int local686 = this.aByteArrayArrayArray1[local11][local173][local288] & 0xFF;
								if (local675 > 0 || local686 > 0) {
									@Pc(699) int local699 = this.anIntArrayArrayArray5[local11][local173][local288];
									@Pc(710) int local710 = this.anIntArrayArrayArray5[local11][local173 + 1][local288];
									@Pc(723) int local723 = this.anIntArrayArrayArray5[local11][local173 + 1][local288 + 1];
									@Pc(734) int local734 = this.anIntArrayArrayArray5[local11][local173][local288 + 1];
									@Pc(741) int local741 = this.anIntArrayArray15[local173][local288];
									@Pc(750) int local750 = this.anIntArrayArray15[local173 + 1][local288];
									@Pc(761) int local761 = this.anIntArrayArray15[local173 + 1][local288 + 1];
									@Pc(770) int local770 = this.anIntArrayArray15[local173][local288 + 1];
									@Pc(772) int local772 = -1;
									@Pc(774) int local774 = -1;
									@Pc(782) int local782;
									@Pc(786) int local786;
									if (local675 > 0) {
										local782 = local208 * 256 / local224;
										local786 = local214 / local240;
										@Pc(790) int local790 = local218 / local240;
										local772 = this.method314(local782, local786, local790);
										@Pc(802) int local802 = local782 + anInt365 & 0xFF;
										local790 += anInt369;
										if (local790 < 0) {
											local790 = 0;
										} else if (local790 > 255) {
											local790 = 255;
										}
										local774 = this.method314(local802, local786, local790);
									}
									if (local11 > 0) {
										@Pc(827) boolean local827 = true;
										if (local675 == 0 && this.aByteArrayArrayArray3[local11][local173][local288] != 0) {
											local827 = false;
										}
										if (local686 > 0 && !Class43.aClass43Array1[local686 - 1].aBoolean190) {
											local827 = false;
										}
										if (local827 && local699 == local710 && local699 == local723 && local699 == local734) {
											this.anIntArrayArrayArray6[local11][local173][local288] |= 0x924;
										}
									}
									local782 = 0;
									if (local772 != -1) {
										local782 = Class1_Sub1_Sub2_Sub3.anIntArray58[method297(local774, 96)];
									}
									if (local686 == 0) {
										arg0.method47(local11, local173, local288, 0, 0, -1, local699, local710, local723, local734, method297(local772, local741), method297(local772, local750), method297(local772, local761), method297(local772, local770), 0, 0, 0, 0, local782, 0);
									} else {
										local786 = this.aByteArrayArrayArray3[local11][local173][local288] + 1;
										@Pc(939) byte local939 = this.aByteArrayArrayArray6[local11][local173][local288];
										@Pc(945) Class43 local945 = Class43.aClass43Array1[local686 - 1];
										@Pc(948) int local948 = local945.anInt758;
										@Pc(956) int local956;
										@Pc(954) int local954;
										if (local948 >= 0) {
											local954 = Class1_Sub1_Sub2_Sub3.method248(local948);
											local956 = -1;
										} else if (local945.anInt757 == 16711935) {
											local954 = 0;
											local956 = -2;
											local948 = -1;
										} else {
											local956 = this.method314(local945.anInt759, local945.anInt760, local945.anInt761);
											local954 = Class1_Sub1_Sub2_Sub3.anIntArray58[this.method305(local945.anInt764, 96)];
										}
										arg0.method47(local11, local173, local288, local786, local939, local948, local699, local710, local723, local734, method297(local772, local741), method297(local772, local750), method297(local772, local761), method297(local772, local770), this.method305(local956, local741), this.method305(local956, local750), this.method305(local956, local761), this.method305(local956, local770), local782, local954);
									}
								}
							}
						}
					}
				}
				for (local195 = 1; local195 < this.anInt368 - 1; local195++) {
					for (local208 = 1; local208 < this.anInt367 - 1; local208++) {
						arg0.method46(local11, local208, local195, this.method300(local208, local195, local11));
					}
				}
			}
			arg0.method73();
			for (local15 = 0; local15 < this.anInt367; local15++) {
				for (local31 = 0; local31 < this.anInt368; local31++) {
					if ((this.aByteArrayArrayArray2[1][local15][local31] & 0x2) == 2) {
						arg0.method44(local15, local31);
					}
				}
			}
			local31 = 1;
			@Pc(1127) int local1127 = 2;
			@Pc(1129) int local1129 = 4;
			for (@Pc(1131) int local1131 = 0; local1131 < 4; local1131++) {
				if (local1131 > 0) {
					local31 <<= 0x3;
					local1127 <<= 0x3;
					local1129 <<= 0x3;
				}
				for (@Pc(1149) int local1149 = 0; local1149 <= local1131; local1149++) {
					for (local137 = 0; local137 <= this.anInt368; local137++) {
						for (local143 = 0; local143 <= this.anInt367; local143++) {
							if ((this.anIntArrayArrayArray6[local1149][local143][local137] & local31) != 0) {
								local145 = local137;
								local149 = local137;
								local173 = local1149;
								local195 = local1149;
								while (local145 > 0 && (this.anIntArrayArrayArray6[local1149][local143][local145 - 1] & local31) != 0) {
									local145--;
								}
								while (local149 < this.anInt368 && (this.anIntArrayArrayArray6[local1149][local143][local149 + 1] & local31) != 0) {
									local149++;
								}
								label328: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local173 - 1][local143][local208] & local31) == 0) {
											break label328;
										}
									}
									local173--;
								}
								label317: while (local195 < local1131) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local195 + 1][local143][local208] & local31) == 0) {
											break label317;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray5[local195][local143][local145] - 240;
									local224 = this.anIntArrayArrayArray5[local173][local143][local145];
									Class5.method45(local143 * 128, local1131, local218, local145 * 128, local143 * 128, local149 * 128 + 128, 1, local224);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray6[local240][local143][local288] &= ~local31;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1149][local143][local137] & local1127) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local1149;
								local195 = local1149;
								while (local145 > 0 && (this.anIntArrayArrayArray6[local1149][local145 - 1][local137] & local1127) != 0) {
									local145--;
								}
								while (local149 < this.anInt367 && (this.anIntArrayArrayArray6[local1149][local149 + 1][local137] & local1127) != 0) {
									local149++;
								}
								label381: while (local173 > 0) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local173 - 1][local208][local137] & local1127) == 0) {
											break label381;
										}
									}
									local173--;
								}
								label370: while (local195 < local1131) {
									for (local208 = local145; local208 <= local149; local208++) {
										if ((this.anIntArrayArrayArray6[local195 + 1][local208][local137] & local1127) == 0) {
											break label370;
										}
									}
									local195++;
								}
								local208 = (local195 + 1 - local173) * (local149 + 1 - local145);
								if (local208 >= 8) {
									local218 = this.anIntArrayArrayArray5[local195][local145][local137] - 240;
									local224 = this.anIntArrayArrayArray5[local173][local145][local137];
									Class5.method45(local149 * 128 + 128, local1131, local218, local137 * 128, local145 * 128, local137 * 128, 2, local224);
									for (local240 = local173; local240 <= local195; local240++) {
										for (local288 = local145; local288 <= local149; local288++) {
											this.anIntArrayArrayArray6[local240][local288][local137] &= ~local1127;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1149][local143][local137] & local1129) != 0) {
								local145 = local143;
								local149 = local143;
								local173 = local137;
								local195 = local137;
								while (local173 > 0 && (this.anIntArrayArrayArray6[local1149][local143][local173 - 1] & local1129) != 0) {
									local173--;
								}
								while (local195 < this.anInt368 && (this.anIntArrayArrayArray6[local1149][local143][local195 + 1] & local1129) != 0) {
									local195++;
								}
								label434: while (local145 > 0) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray6[local1149][local145 - 1][local208] & local1129) == 0) {
											break label434;
										}
									}
									local145--;
								}
								label423: while (local149 < this.anInt367) {
									for (local208 = local173; local208 <= local195; local208++) {
										if ((this.anIntArrayArrayArray6[local1149][local149 + 1][local208] & local1129) == 0) {
											break label423;
										}
									}
									local149++;
								}
								if ((local149 + 1 - local145) * (local195 + 1 - local173) >= 4) {
									local208 = this.anIntArrayArrayArray5[local1149][local145][local173];
									Class5.method45(local149 * 128 + 128, local1131, local208, local173 * 128, local145 * 128, local195 * 128 + 128, 4, local208);
									for (local214 = local145; local214 <= local149; local214++) {
										for (local218 = local173; local218 <= local195; local218++) {
											this.anIntArrayArrayArray6[local1149][local214][local218] &= ~local1129;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1764) RuntimeException local1764) {
			signlink.reporterror("51853, " + false + ", " + arg0 + ", " + arg1 + ", " + local1764.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "b", descriptor = "(IIII)I")
	private int method300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray2[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray2[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("27493, " + -439 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "d", descriptor = "(II)I")
	private int method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(I[Lclient!EXLGBZBR;IILclient!DLDGGHZP;IZI[BII)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(1) Class14[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg7, anInt364);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method373();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method373();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method359();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg9 && local51 >= arg0 && local51 < arg0 + 8 && local45 >= arg5 && local45 < arg5 + 8) {
						@Pc(88) Class40 local88 = Class40.method529(local9);
						@Pc(104) int local104 = arg6 + Class3.method31(local88.anInt736, local88.anInt722, local51 & 0x7, arg2, local45 & 0x7);
						@Pc(120) int local120 = arg8 + Class3.method32(local88.anInt722, local45 & 0x7, local88.anInt736, arg2, local51 & 0x7);
						if (local104 > 0 && local120 > 0 && local104 < 103 && local120 < 103) {
							@Pc(132) int local132 = arg3;
							if ((this.aByteArrayArrayArray2[1][local104][local120] & 0x2) == 2) {
								local132 = arg3 - 1;
							}
							@Pc(147) Class14 local147 = null;
							if (local132 >= 0) {
								local147 = arg1[local132];
							}
							this.method307(local66 + arg2 & 0x3, arg3, local62, local104, arg4, local9, local120, local147);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("82779, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(IIIIILclient!DLDGGHZP;IILclient!EXLGBZBR;)V")
	private void method307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class14 arg7) {
		try {
			if (aBoolean99 && (this.aByteArrayArrayArray2[0][arg3][arg6] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray2[arg1][arg3][arg6] & 0x10) != 0) {
					return;
				}
				if (this.method300(arg3, arg6, arg1) != anInt372) {
					return;
				}
			}
			if (arg1 < anInt366) {
				anInt366 = arg1;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg1][arg3][arg6];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg1][arg3 + 1][arg6];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg1][arg3 + 1][arg6 + 1];
			@Pc(95) int local95 = this.anIntArrayArrayArray5[arg1][arg3][arg6 + 1];
			@Pc(105) int local105 = local49 + local60 + local84 + local95 >> 2;
			@Pc(108) Class40 local108 = Class40.method529(arg5);
			@Pc(120) int local120 = arg3 + (arg6 << 7) + (arg5 << 14) + 1073741824;
			if (!local108.aBoolean175) {
				local120 += Integer.MIN_VALUE;
			}
			@Pc(134) byte local134 = (byte) ((arg0 << 6) + arg2);
			@Pc(163) Class1_Sub1_Sub1 local163;
			if (arg2 != 22) {
				@Pc(261) int local261;
				if (arg2 == 10 || arg2 == 11) {
					if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
						local163 = local108.method522(10, arg0, local49, local60, local84, local95, -1);
					} else {
						local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, 10, local49, (byte) 5, local84, local95);
					}
					if (local163 != null) {
						@Pc(248) int local248 = 0;
						if (arg2 == 11) {
							local248 += 256;
						}
						@Pc(264) int local264;
						if (arg0 == 1 || arg0 == 3) {
							local261 = local108.anInt722;
							local264 = local108.anInt736;
						} else {
							local261 = local108.anInt736;
							local264 = local108.anInt722;
						}
						if (arg4.method52(local261, local248, arg3, local163, local120, arg1, arg6, local134, local264, local105) && local108.aBoolean177) {
							@Pc(295) Class1_Sub1_Sub1_Sub4 local295;
							if (local163 instanceof Class1_Sub1_Sub1_Sub4) {
								local295 = (Class1_Sub1_Sub1_Sub4) local163;
							} else {
								local295 = local108.method522(10, arg0, local49, local60, local84, local95, -1);
							}
							if (local295 != null) {
								for (@Pc(311) int local311 = 0; local311 <= local261; local311++) {
									for (@Pc(315) int local315 = 0; local315 <= local264; local315++) {
										@Pc(322) int local322 = local295.anInt352 / 4;
										if (local322 > 30) {
											local322 = 30;
										}
										if (local322 > this.aByteArrayArrayArray5[arg1][arg3 + local311][arg6 + local315]) {
											this.aByteArrayArrayArray5[arg1][arg3 + local311][arg6 + local315] = (byte) local322;
										}
									}
								}
							}
						}
					}
					if (local108.aBoolean176 && arg7 != null) {
						arg7.method154(local108.anInt722, arg6, arg0, arg3, local108.anInt736, local108.aBoolean179);
					}
				} else if (arg2 >= 12) {
					if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
						local163 = local108.method522(arg2, arg0, local49, local60, local84, local95, -1);
					} else {
						local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, arg2, local49, (byte) 5, local84, local95);
					}
					arg4.method52(1, 0, arg3, local163, local120, arg1, arg6, local134, 1, local105);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg1 > 0) {
						this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x924;
					}
					if (local108.aBoolean176 && arg7 != null) {
						arg7.method154(local108.anInt722, arg6, arg0, arg3, local108.anInt736, local108.aBoolean179);
					}
				} else if (arg2 == 0) {
					if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
						local163 = local108.method522(0, arg0, local49, local60, local84, local95, -1);
					} else {
						local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, 0, local49, (byte) 5, local84, local95);
					}
					arg4.method50(arg1, local134, arg3, anIntArray105[arg0], arg6, null, local105, local163, 0, local120);
					if (arg0 == 0) {
						if (local108.aBoolean177) {
							this.aByteArrayArrayArray5[arg1][arg3][arg6] = 50;
							this.aByteArrayArrayArray5[arg1][arg3][arg6 + 1] = 50;
						}
						if (local108.aBoolean181) {
							this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local108.aBoolean177) {
							this.aByteArrayArrayArray5[arg1][arg3][arg6 + 1] = 50;
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6 + 1] = 50;
						}
						if (local108.aBoolean181) {
							this.anIntArrayArrayArray6[arg1][arg3][arg6 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local108.aBoolean177) {
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6] = 50;
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6 + 1] = 50;
						}
						if (local108.aBoolean181) {
							this.anIntArrayArrayArray6[arg1][arg3 + 1][arg6] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local108.aBoolean177) {
							this.aByteArrayArrayArray5[arg1][arg3][arg6] = 50;
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6] = 50;
						}
						if (local108.aBoolean181) {
							this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x492;
						}
					}
					if (local108.aBoolean176 && arg7 != null) {
						arg7.method153(local108.aBoolean179, arg6, arg0, arg3, arg2);
					}
					if (local108.anInt732 != 16) {
						arg4.method58(arg3, arg1, arg6, local108.anInt732);
					}
				} else if (arg2 == 1) {
					if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
						local163 = local108.method522(1, arg0, local49, local60, local84, local95, -1);
					} else {
						local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, 1, local49, (byte) 5, local84, local95);
					}
					arg4.method50(arg1, local134, arg3, anIntArray107[arg0], arg6, null, local105, local163, 0, local120);
					if (local108.aBoolean177) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray5[arg1][arg3][arg6 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray5[arg1][arg3][arg6] = 50;
						}
					}
					if (local108.aBoolean176 && arg7 != null) {
						arg7.method153(local108.aBoolean179, arg6, arg0, arg3, arg2);
					}
				} else {
					@Pc(872) int local872;
					@Pc(901) Class1_Sub1_Sub1 local901;
					if (arg2 == 2) {
						local872 = arg0 + 1 & 0x3;
						@Pc(891) Class1_Sub1_Sub1 local891;
						if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
							local891 = local108.method522(2, arg0 + 4, local49, local60, local84, local95, -1);
							local901 = local108.method522(2, local872, local49, local60, local84, local95, -1);
						} else {
							local891 = new Class1_Sub1_Sub1_Sub3(arg0 + 4, local60, true, local108.anInt726, arg5, 2, local49, (byte) 5, local84, local95);
							local901 = new Class1_Sub1_Sub1_Sub3(local872, local60, true, local108.anInt726, arg5, 2, local49, (byte) 5, local84, local95);
						}
						arg4.method50(arg1, local134, arg3, anIntArray105[arg0], arg6, local901, local105, local891, anIntArray105[local872], local120);
						if (local108.aBoolean181) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg3][arg6 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray6[arg1][arg3][arg6 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg3 + 1][arg6] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray6[arg1][arg3 + 1][arg6] |= 0x249;
								this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x492;
								this.anIntArrayArrayArray6[arg1][arg3][arg6] |= 0x249;
							}
						}
						if (local108.aBoolean176 && arg7 != null) {
							arg7.method153(local108.aBoolean179, arg6, arg0, arg3, arg2);
						}
						if (local108.anInt732 != 16) {
							arg4.method58(arg3, arg1, arg6, local108.anInt732);
						}
					} else if (arg2 == 3) {
						if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
							local163 = local108.method522(3, arg0, local49, local60, local84, local95, -1);
						} else {
							local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, 3, local49, (byte) 5, local84, local95);
						}
						arg4.method50(arg1, local134, arg3, anIntArray107[arg0], arg6, null, local105, local163, 0, local120);
						if (local108.aBoolean177) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray5[arg1][arg3][arg6 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray5[arg1][arg3 + 1][arg6] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray5[arg1][arg3][arg6] = 50;
							}
						}
						if (local108.aBoolean176 && arg7 != null) {
							arg7.method153(local108.aBoolean179, arg6, arg0, arg3, arg2);
						}
					} else if (arg2 == 9) {
						if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
							local163 = local108.method522(arg2, arg0, local49, local60, local84, local95, -1);
						} else {
							local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, arg2, local49, (byte) 5, local84, local95);
						}
						arg4.method52(1, 0, arg3, local163, local120, arg1, arg6, local134, 1, local105);
						if (local108.aBoolean176 && arg7 != null) {
							arg7.method154(local108.anInt722, arg6, arg0, arg3, local108.anInt736, local108.aBoolean179);
						}
					} else {
						if (local108.aBoolean174) {
							if (arg0 == 1) {
								local872 = local95;
								local95 = local84;
								local84 = local60;
								local60 = local49;
								local49 = local872;
							} else if (arg0 == 2) {
								local872 = local95;
								local95 = local60;
								local60 = local872;
								local872 = local84;
								local84 = local49;
								local49 = local872;
							} else if (arg0 == 3) {
								local872 = local95;
								local95 = local49;
								local49 = local60;
								local60 = local84;
								local84 = local872;
							}
						}
						if (arg2 == 4) {
							if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
								local163 = local108.method522(4, 0, local49, local60, local84, local95, -1);
							} else {
								local163 = new Class1_Sub1_Sub1_Sub3(0, local60, true, local108.anInt726, arg5, 4, local49, (byte) 5, local84, local95);
							}
							arg4.method51(anIntArray105[arg0], local120, local163, 0, local134, arg6, local105, arg3, 0, arg1, arg0 * 512, (byte) 2);
						} else if (arg2 == 5) {
							local872 = 16;
							local261 = arg4.method68(arg1, arg3, arg6);
							if (local261 > 0) {
								local872 = Class40.method529(local261 >> 14 & 0x7FFF).anInt732;
							}
							if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
								local901 = local108.method522(4, 0, local49, local60, local84, local95, -1);
							} else {
								local901 = new Class1_Sub1_Sub1_Sub3(0, local60, true, local108.anInt726, arg5, 4, local49, (byte) 5, local84, local95);
							}
							arg4.method51(anIntArray105[arg0], local120, local901, anIntArray106[arg0] * local872, local134, arg6, local105, arg3, anIntArray108[arg0] * local872, arg1, arg0 * 512, (byte) 2);
						} else if (arg2 == 6) {
							if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
								local163 = local108.method522(4, 0, local49, local60, local84, local95, -1);
							} else {
								local163 = new Class1_Sub1_Sub1_Sub3(0, local60, true, local108.anInt726, arg5, 4, local49, (byte) 5, local84, local95);
							}
							arg4.method51(256, local120, local163, 0, local134, arg6, local105, arg3, 0, arg1, arg0, (byte) 2);
						} else if (arg2 == 7) {
							if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
								local163 = local108.method522(4, 0, local49, local60, local84, local95, -1);
							} else {
								local163 = new Class1_Sub1_Sub1_Sub3(0, local60, true, local108.anInt726, arg5, 4, local49, (byte) 5, local84, local95);
							}
							arg4.method51(512, local120, local163, 0, local134, arg6, local105, arg3, 0, arg1, arg0, (byte) 2);
						} else if (arg2 == 8) {
							if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
								local163 = local108.method522(4, 0, local49, local60, local84, local95, -1);
							} else {
								local163 = new Class1_Sub1_Sub1_Sub3(0, local60, true, local108.anInt726, arg5, 4, local49, (byte) 5, local84, local95);
							}
							arg4.method51(768, local120, local163, 0, local134, arg6, local105, arg3, 0, arg1, arg0, (byte) 2);
						}
					}
				}
			} else if (!aBoolean99 || local108.aBoolean175 || local108.aBoolean182) {
				if (local108.anInt726 == -1 && local108.anIntArray164 == null) {
					local163 = local108.method522(22, arg0, local49, local60, local84, local95, -1);
				} else {
					local163 = new Class1_Sub1_Sub1_Sub3(arg0, local60, true, local108.anInt726, arg5, 22, local49, (byte) 5, local84, local95);
				}
				arg4.method48(local134, local105, arg3, arg1, local120, arg6, local163, aByte13);
				if (local108.aBoolean176 && local108.aBoolean175 && arg7 != null) {
					arg7.method155(arg3, arg6);
				}
			}
		} catch (@Pc(1646) RuntimeException local1646) {
			signlink.reporterror("56576, " + arg0 + ", " + -35 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1646.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(IIIIILclient!LDILQFVA;II)V")
	private void method309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(34) int local34;
			if (arg0 >= 0 && arg0 < 104 && arg6 >= 0 && arg6 < 104) {
				this.aByteArrayArrayArray2[arg1][arg0][arg6] = 0;
				while (true) {
					local34 = arg4.method359();
					if (local34 == 0) {
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg0][arg6] = -method301(arg0 + arg5 + 932731, arg6 + 556238 + arg3) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg1][arg0][arg6] = this.anIntArrayArrayArray5[arg1 - 1][arg0][arg6] - 240;
							return;
						}
					}
					if (local34 == 1) {
						@Pc(88) int local88 = arg4.method359();
						if (local88 == 1) {
							local88 = 0;
						}
						if (arg1 == 0) {
							this.anIntArrayArrayArray5[0][arg0][arg6] = -local88 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg1][arg0][arg6] = this.anIntArrayArrayArray5[arg1 - 1][arg0][arg6] - local88 * 8;
						return;
					}
					if (local34 <= 49) {
						this.aByteArrayArrayArray1[arg1][arg0][arg6] = arg4.method360();
						this.aByteArrayArrayArray3[arg1][arg0][arg6] = (byte) ((local34 - 2) / 4);
						this.aByteArrayArrayArray6[arg1][arg0][arg6] = (byte) (local34 + arg2 - 2 & 0x3);
					} else if (local34 <= 81) {
						this.aByteArrayArrayArray2[arg1][arg0][arg6] = (byte) (local34 - 49);
					} else {
						this.aByteArrayArrayArray4[arg1][arg0][arg6] = (byte) (local34 - 81);
					}
				}
			} else {
				while (true) {
					local34 = arg4.method359();
					if (local34 == 0) {
						return;
					}
					if (local34 == 1) {
						arg4.method359();
						return;
					}
					if (local34 <= 49) {
						arg4.method359();
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("66224, " + 17053 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "(IIIII)V")
	public void method310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg0; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg1; local7++) {
					if (local7 >= 0 && local7 < this.anInt367 && local3 >= 0 && local3 < this.anInt368) {
						this.aByteArrayArrayArray5[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg1 && local7 < this.anInt367 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg0 && local3 < this.anInt368 - 1) {
							this.anIntArrayArrayArray5[0][local7][local3] = this.anIntArrayArrayArray5[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("41176, " + -90 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "([Lclient!EXLGBZBR;[BIIIIZ)V")
	public void method312(@OriginalArg(0) Class14[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(14) int local14;
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < 64; local10++) {
					for (local14 = 0; local14 < 64; local14++) {
						if (arg2 + local10 > 0 && arg2 + local10 < 103 && arg5 + local14 > 0 && arg5 + local14 < 103) {
							arg0[local6].anIntArrayArray5[arg2 + local10][arg5 + local14] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(68) Class1_Sub1_Sub3 local68 = new Class1_Sub1_Sub3(arg1, anInt364);
			for (local14 = 0; local14 < 4; local14++) {
				for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						this.method309(local74 + arg2, local14, 0, arg3, local68, arg4, local78 + arg5);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("94026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTMZBQHM", name = "c", descriptor = "(III)I")
	private int method314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!HTMZBQHM", name = "a", descriptor = "([Lclient!EXLGBZBR;[BIIIIIIIB)V")
	public void method315(@OriginalArg(0) Class14[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
						arg0[arg4].anIntArrayArray5[arg3 + local3][arg2 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class1_Sub1_Sub3 local57 = new Class1_Sub1_Sub3(arg1, anInt364);
			for (@Pc(59) int local59 = 0; local59 < 4; local59++) {
				for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						if (local59 == arg5 && local63 >= arg8 && local63 < arg8 + 8 && local67 >= arg6 && local67 < arg6 + 8) {
							this.method309(arg3 + Class3.method29(arg7, local67 & 0x7, local63 & 0x7), arg4, arg7, 0, local57, 0, arg2 + Class3.method30(local63 & 0x7, arg7, local67 & 0x7));
						} else {
							this.method309(-1, 0, 0, 0, local57, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("67810, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -119 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}
}
