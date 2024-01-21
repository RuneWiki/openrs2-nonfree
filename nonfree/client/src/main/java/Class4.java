import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt171;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray24 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt175 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt176 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt169 = 618;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt170 = 587;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt174;

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

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B[BII)Z")
	public static boolean method57(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg0, (byte) 1);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(21) int local21 = local9.method487();
				if (local21 == 0) {
					return local3;
				}
				local11 += local21;
				@Pc(29) int local29 = 0;
				@Pc(31) boolean local31 = false;
				while (true) {
					@Pc(36) int local36;
					while (!local31) {
						local36 = local9.method487();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						@Pc(58) int local58 = local29 & 0x3F;
						@Pc(64) int local64 = local29 >> 6 & 0x3F;
						@Pc(69) int local69 = local9.method473() >> 2;
						@Pc(73) int local73 = local64 + arg2;
						@Pc(77) int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							@Pc(90) Class9 local90 = Class9.method287(local11);
							if (local69 != 22 || !aBoolean32 || local90.aBoolean122 || local90.aBoolean128) {
								local3 &= local90.method291();
								local31 = true;
							}
						}
					}
					local36 = local9.method487();
					if (local36 == 0) {
						break;
					}
					local9.method473();
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("18190, " + 106 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!lb;Lclient!ub;)V")
	public static void method58(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class44_Sub1 arg1) {
		try {
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = arg0.method487();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(25) Class9 local25 = Class9.method287(local13);
				local25.method292(arg1);
				while (true) {
					@Pc(32) int local32 = arg0.method487();
					if (local32 == 0) {
						break;
					}
					arg0.method473();
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("56975, " + -47 + ", " + arg0 + ", " + arg1 + ", " + local43.toString());
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

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	public static boolean method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class9 local8 = Class9.method287(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local8.method290(arg1);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("73698, " + arg0 + ", " + arg1 + ", " + 469 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;IIZIIILclient!jc;[[[III)V")
	public static void method72(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) int[][][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(9) int local9 = arg8[arg1][arg10][arg9];
			@Pc(19) int local19 = arg8[arg1][arg10 + 1][arg9];
			@Pc(31) int local31 = arg8[arg1][arg10 + 1][arg9 + 1];
			@Pc(41) int local41 = arg8[arg1][arg10][arg9 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			if (arg3) {
				@Pc(57) Class9 local57 = Class9.method287(arg4);
				@Pc(69) int local69 = arg10 + (arg9 << 7) + (arg4 << 14) + 1073741824;
				if (!local57.aBoolean122) {
					local69 += Integer.MIN_VALUE;
				}
				@Pc(83) byte local83 = (byte) ((arg6 << 6) + arg5);
				@Pc(100) Class1_Sub1_Sub1 local100;
				if (arg5 == 22) {
					if (local57.anInt511 == -1) {
						local100 = local57.method293(22, arg6, local9, local19, local31, local41, -1);
					} else {
						local100 = new Class1_Sub1_Sub1_Sub2(22, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
					}
					arg0.method529(local51, local100, arg10, arg2, local69, local83, arg9);
					if (local57.aBoolean120 && local57.aBoolean122) {
						arg7.method420(arg10, arg9);
					}
				} else {
					@Pc(193) int local193;
					if (arg5 == 10 || arg5 == 11) {
						if (local57.anInt511 == -1) {
							local100 = local57.method293(10, arg6, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(10, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
						}
						if (local100 != null) {
							@Pc(180) int local180 = 0;
							if (arg5 == 11) {
								local180 += 256;
							}
							@Pc(196) int local196;
							if (arg6 == 1 || arg6 == 3) {
								local193 = local57.anInt510;
								local196 = local57.anInt509;
							} else {
								local193 = local57.anInt509;
								local196 = local57.anInt510;
							}
							arg0.method533(arg10, arg9, local196, arg2, local51, local100, local83, local193, local180, local69);
						}
						if (local57.aBoolean120) {
							arg7.method419(local57.anInt509, arg10, local57.anInt510, arg9, arg6, local57.aBoolean121);
						}
					} else if (arg5 >= 12) {
						if (local57.anInt511 == -1) {
							local100 = local57.method293(arg5, arg6, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(arg5, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
						}
						arg0.method533(arg10, arg9, 1, arg2, local51, local100, local83, 1, 0, local69);
						if (local57.aBoolean120) {
							arg7.method419(local57.anInt509, arg10, local57.anInt510, arg9, arg6, local57.aBoolean121);
						}
					} else if (arg5 == 0) {
						if (local57.anInt511 == -1) {
							local100 = local57.method293(0, arg6, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(0, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
						}
						arg0.method531(anIntArray24[arg6], null, local51, arg10, arg2, local83, 0, local69, local100, arg9);
						if (local57.aBoolean120) {
							arg7.method418(arg6, arg5, local57.aBoolean121, arg9, arg10);
						}
					} else if (arg5 == 1) {
						if (local57.anInt511 == -1) {
							local100 = local57.method293(1, arg6, local9, local19, local31, local41, -1);
						} else {
							local100 = new Class1_Sub1_Sub1_Sub2(1, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
						}
						arg0.method531(anIntArray25[arg6], null, local51, arg10, arg2, local83, 0, local69, local100, arg9);
						if (local57.aBoolean120) {
							arg7.method418(arg6, arg5, local57.aBoolean121, arg9, arg10);
						}
					} else {
						@Pc(430) int local430;
						@Pc(456) Class1_Sub1_Sub1 local456;
						if (arg5 == 2) {
							local430 = arg6 + 1 & 0x3;
							@Pc(446) Class1_Sub1_Sub1 local446;
							if (local57.anInt511 == -1) {
								local446 = local57.method293(2, arg6 + 4, local9, local19, local31, local41, -1);
								local456 = local57.method293(2, local430, local9, local19, local31, local41, -1);
							} else {
								local446 = new Class1_Sub1_Sub1_Sub2(2, arg6 + 4, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								local456 = new Class1_Sub1_Sub1_Sub2(2, local430, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
							}
							arg0.method531(anIntArray24[arg6], local456, local51, arg10, arg2, local83, anIntArray24[local430], local69, local446, arg9);
							if (local57.aBoolean120) {
								arg7.method418(arg6, arg5, local57.aBoolean121, arg9, arg10);
							}
						} else if (arg5 == 3) {
							if (local57.anInt511 == -1) {
								local100 = local57.method293(3, arg6, local9, local19, local31, local41, -1);
							} else {
								local100 = new Class1_Sub1_Sub1_Sub2(3, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
							}
							arg0.method531(anIntArray25[arg6], null, local51, arg10, arg2, local83, 0, local69, local100, arg9);
							if (local57.aBoolean120) {
								arg7.method418(arg6, arg5, local57.aBoolean121, arg9, arg10);
							}
						} else if (arg5 == 9) {
							if (local57.anInt511 == -1) {
								local100 = local57.method293(arg5, arg6, local9, local19, local31, local41, -1);
							} else {
								local100 = new Class1_Sub1_Sub1_Sub2(arg5, arg6, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
							}
							arg0.method533(arg10, arg9, 1, arg2, local51, local100, local83, 1, 0, local69);
							if (local57.aBoolean120) {
								arg7.method419(local57.anInt509, arg10, local57.anInt510, arg9, arg6, local57.aBoolean121);
							}
						} else {
							if (local57.aBoolean123) {
								if (arg6 == 1) {
									local430 = local41;
									local41 = local31;
									local31 = local19;
									local19 = local9;
									local9 = local430;
								} else if (arg6 == 2) {
									local430 = local41;
									local41 = local19;
									local19 = local430;
									local430 = local31;
									local31 = local9;
									local9 = local430;
								} else if (arg6 == 3) {
									local430 = local41;
									local41 = local9;
									local9 = local19;
									local19 = local31;
									local31 = local430;
								}
							}
							if (arg5 == 4) {
								if (local57.anInt511 == -1) {
									local100 = local57.method293(4, 0, local9, local19, local31, local41, -1);
								} else {
									local100 = new Class1_Sub1_Sub1_Sub2(4, 0, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								}
								arg0.method532(anIntArray24[arg6], local100, local83, arg9, local51, 0, arg6 * 512, arg2, arg10, 0, local69);
							} else if (arg5 == 5) {
								local430 = 16;
								local193 = arg0.method549(arg2, arg10, arg9);
								if (local193 > 0) {
									local430 = Class9.method287(local193 >> 14 & 0x7FFF).anInt512;
								}
								if (local57.anInt511 == -1) {
									local456 = local57.method293(4, 0, local9, local19, local31, local41, -1);
								} else {
									local456 = new Class1_Sub1_Sub1_Sub2(4, 0, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								}
								arg0.method532(anIntArray24[arg6], local456, local83, arg9, local51, anIntArray26[arg6] * local430, arg6 * 512, arg2, arg10, anIntArray27[arg6] * local430, local69);
							} else if (arg5 == 6) {
								if (local57.anInt511 == -1) {
									local100 = local57.method293(4, 0, local9, local19, local31, local41, -1);
								} else {
									local100 = new Class1_Sub1_Sub1_Sub2(4, 0, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								}
								arg0.method532(256, local100, local83, arg9, local51, 0, arg6, arg2, arg10, 0, local69);
							} else if (arg5 == 7) {
								if (local57.anInt511 == -1) {
									local100 = local57.method293(4, 0, local9, local19, local31, local41, -1);
								} else {
									local100 = new Class1_Sub1_Sub1_Sub2(4, 0, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								}
								arg0.method532(512, local100, local83, arg9, local51, 0, arg6, arg2, arg10, 0, local69);
							} else if (arg5 == 8) {
								if (local57.anInt511 == -1) {
									local100 = local57.method293(4, 0, local9, local19, local31, local41, -1);
								} else {
									local100 = new Class1_Sub1_Sub1_Sub2(4, 0, local57.anInt511, arg4, local31, anInt171, true, local19, local41, local9);
								}
								arg0.method532(768, local100, local83, arg9, local51, 0, arg6, arg2, arg10, 0, local69);
							}
						}
					}
				}
			}
		} catch (@Pc(974) RuntimeException local974) {
			signlink.reporterror("70426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local974.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I[[[III[[[B)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4) {
		try {
			this.anInt173 = arg0;
			this.anInt174 = arg2;
			this.anIntArrayArrayArray3 = arg1;
			this.aByteArrayArrayArray1 = arg4;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt173][this.anInt174];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt173][this.anInt174];
			this.anIntArrayArrayArray4 = new int[4][this.anInt173 + 1][this.anInt174 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArrayArray2 = new int[this.anInt173 + 1][this.anInt174 + 1];
			this.anIntArray19 = new int[this.anInt174];
			this.anIntArray20 = new int[this.anInt174];
			this.anIntArray21 = new int[this.anInt174];
			this.anIntArray22 = new int[this.anInt174];
			this.anIntArray23 = new int[this.anInt174];
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("46050, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public void method55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(12) int local12 = arg0; local12 <= arg0 + 64; local12++) {
				for (@Pc(16) int local16 = arg1; local16 <= arg1 + 64; local16++) {
					if (local16 >= 0 && local16 < this.anInt173 && local12 >= 0 && local12 < this.anInt174) {
						this.aByteArrayArrayArray6[0][local16][local12] = 127;
						if (local16 == arg1 && local16 > 0) {
							this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16 - 1][local12];
						}
						if (local16 == arg1 + 64 && local16 < this.anInt173 - 1) {
							this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16 + 1][local12];
						}
						if (local12 == arg0 && local12 > 0) {
							this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16][local12 - 1];
						}
						if (local12 == arg0 + 64 && local12 < this.anInt174 - 1) {
							this.anIntArrayArrayArray3[0][local16][local12] = this.anIntArrayArrayArray3[0][local16][local12 + 1];
						}
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("89240, " + arg0 + ", " + arg1 + ", " + 587 + ", " + 64 + ", " + 64 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI[BIII)V")
	public void method56(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1, (byte) 1);
			for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
				for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
					for (@Pc(20) int local20 = 0; local20 < 64; local20++) {
						@Pc(26) int local26 = local16 + arg4;
						@Pc(30) int local30 = local20 + arg2;
						@Pc(52) int local52;
						if (local26 >= 0 && local26 < 104 && local30 >= 0 && local30 < 104) {
							this.aByteArrayArrayArray1[local12][local26][local30] = 0;
							while (true) {
								local52 = local10.method473();
								if (local52 == 0) {
									if (local12 == 0) {
										this.anIntArrayArrayArray3[0][local26][local30] = -method63(local26 + arg0 + 932731, local30 + 556238 + arg3) * 8;
									} else {
										this.anIntArrayArrayArray3[local12][local26][local30] = this.anIntArrayArrayArray3[local12 - 1][local26][local30] - 240;
									}
									break;
								}
								if (local52 == 1) {
									@Pc(108) int local108 = local10.method473();
									if (local108 == 1) {
										local108 = 0;
									}
									if (local12 == 0) {
										this.anIntArrayArrayArray3[0][local26][local30] = -local108 * 8;
									} else {
										this.anIntArrayArrayArray3[local12][local26][local30] = this.anIntArrayArrayArray3[local12 - 1][local26][local30] - local108 * 8;
									}
									break;
								}
								if (local52 <= 49) {
									this.aByteArrayArrayArray3[local12][local26][local30] = local10.method474();
									this.aByteArrayArrayArray4[local12][local26][local30] = (byte) ((local52 - 2) / 4);
									this.aByteArrayArrayArray5[local12][local26][local30] = (byte) (local52 - 2 & 0x3);
								} else if (local52 <= 81) {
									this.aByteArrayArrayArray1[local12][local26][local30] = (byte) (local52 - 49);
								} else {
									this.aByteArrayArrayArray2[local12][local26][local30] = (byte) (local52 - 81);
								}
							}
						} else {
							while (true) {
								local52 = local10.method473();
								if (local52 == 0) {
									break;
								}
								if (local52 == 1) {
									local10.method473();
									break;
								}
								if (local52 <= 49) {
									local10.method473();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("10967, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BZLclient!r;I[Lclient!jc;)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg1, (byte) 1);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method487();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method487();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method473();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg3;
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg4[local86];
						}
						this.method60(local55, local101, local66, local62, local74, arg2, local9, local70);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("2329, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!jc;IIILclient!r;II)V")
	private void method60(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean32) {
				if ((this.aByteArrayArrayArray1[arg0][arg7][arg4] & 0x10) != 0) {
					return;
				}
				if (this.method62(arg0, arg4, arg7) != anInt172) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg0][arg7][arg4];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg0][arg7 + 1][arg4];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg0][arg7 + 1][arg4 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg0][arg7][arg4 + 1];
			@Pc(78) int local78 = local33 + local44 + local57 + local68 >> 2;
			@Pc(81) Class9 local81 = Class9.method287(arg6);
			@Pc(100) int local100 = arg7 + (arg4 << 7) + (arg6 << 14) + 1073741824;
			if (!local81.aBoolean122) {
				local100 += Integer.MIN_VALUE;
			}
			@Pc(114) byte local114 = (byte) ((arg2 << 6) + arg3);
			@Pc(140) Class1_Sub1_Sub1 local140;
			if (arg3 != 22) {
				@Pc(235) int local235;
				if (arg3 == 10 || arg3 == 11) {
					if (local81.anInt511 == -1) {
						local140 = local81.method293(10, arg2, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(10, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
					}
					if (local140 != null) {
						@Pc(222) int local222 = 0;
						if (arg3 == 11) {
							local222 += 256;
						}
						@Pc(238) int local238;
						if (arg2 == 1 || arg2 == 3) {
							local235 = local81.anInt510;
							local238 = local81.anInt509;
						} else {
							local235 = local81.anInt509;
							local238 = local81.anInt510;
						}
						if (arg5.method533(arg7, arg4, local238, arg0, local78, local140, local114, local235, local222, local100) && local81.aBoolean127) {
							@Pc(269) Class1_Sub1_Sub1_Sub5 local269;
							if (local140 instanceof Class1_Sub1_Sub1_Sub5) {
								local269 = (Class1_Sub1_Sub1_Sub5) local140;
							} else {
								local269 = local81.method293(10, arg2, local33, local44, local57, local68, -1);
							}
							if (local269 != null) {
								for (@Pc(285) int local285 = 0; local285 <= local235; local285++) {
									for (@Pc(289) int local289 = 0; local289 <= local238; local289++) {
										@Pc(296) int local296 = local269.anInt492 / 4;
										if (local296 > 30) {
											local296 = 30;
										}
										if (local296 > this.aByteArrayArrayArray6[arg0][arg7 + local285][arg4 + local289]) {
											this.aByteArrayArrayArray6[arg0][arg7 + local285][arg4 + local289] = (byte) local296;
										}
									}
								}
							}
						}
					}
					if (local81.aBoolean120 && arg1 != null) {
						arg1.method419(local81.anInt509, arg7, local81.anInt510, arg4, arg2, local81.aBoolean121);
					}
				} else if (arg3 >= 12) {
					if (local81.anInt511 == -1) {
						local140 = local81.method293(arg3, arg2, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(arg3, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
					}
					arg5.method533(arg7, arg4, 1, arg0, local78, local140, local114, 1, 0, local100);
					if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
						this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x924;
					}
					if (local81.aBoolean120 && arg1 != null) {
						arg1.method419(local81.anInt509, arg7, local81.anInt510, arg4, arg2, local81.aBoolean121);
					}
				} else if (arg3 == 0) {
					if (local81.anInt511 == -1) {
						local140 = local81.method293(0, arg2, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(0, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
					}
					arg5.method531(anIntArray24[arg2], null, local78, arg7, arg0, local114, 0, local100, local140, arg4);
					if (arg2 == 0) {
						if (local81.aBoolean127) {
							this.aByteArrayArrayArray6[arg0][arg7][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg7][arg4 + 1] = 50;
						}
						if (local81.aBoolean125) {
							this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x249;
						}
					} else if (arg2 == 1) {
						if (local81.aBoolean127) {
							this.aByteArrayArrayArray6[arg0][arg7][arg4 + 1] = 50;
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean125) {
							this.anIntArrayArrayArray4[arg0][arg7][arg4 + 1] |= 0x492;
						}
					} else if (arg2 == 2) {
						if (local81.aBoolean127) {
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4 + 1] = 50;
						}
						if (local81.aBoolean125) {
							this.anIntArrayArrayArray4[arg0][arg7 + 1][arg4] |= 0x249;
						}
					} else if (arg2 == 3) {
						if (local81.aBoolean127) {
							this.aByteArrayArrayArray6[arg0][arg7][arg4] = 50;
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4] = 50;
						}
						if (local81.aBoolean125) {
							this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x492;
						}
					}
					if (local81.aBoolean120 && arg1 != null) {
						arg1.method418(arg2, arg3, local81.aBoolean121, arg4, arg7);
					}
					if (local81.anInt512 != 16) {
						arg5.method539(arg7, arg4, arg0, local81.anInt512);
					}
				} else if (arg3 == 1) {
					if (local81.anInt511 == -1) {
						local140 = local81.method293(1, arg2, local33, local44, local57, local68, -1);
					} else {
						local140 = new Class1_Sub1_Sub1_Sub2(1, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
					}
					arg5.method531(anIntArray25[arg2], null, local78, arg7, arg0, local114, 0, local100, local140, arg4);
					if (local81.aBoolean127) {
						if (arg2 == 0) {
							this.aByteArrayArrayArray6[arg0][arg7][arg4 + 1] = 50;
						} else if (arg2 == 1) {
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4 + 1] = 50;
						} else if (arg2 == 2) {
							this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4] = 50;
						} else if (arg2 == 3) {
							this.aByteArrayArrayArray6[arg0][arg7][arg4] = 50;
						}
					}
					if (local81.aBoolean120 && arg1 != null) {
						arg1.method418(arg2, arg3, local81.aBoolean121, arg4, arg7);
					}
				} else {
					@Pc(837) int local837;
					@Pc(863) Class1_Sub1_Sub1 local863;
					if (arg3 == 2) {
						local837 = arg2 + 1 & 0x3;
						@Pc(853) Class1_Sub1_Sub1 local853;
						if (local81.anInt511 == -1) {
							local853 = local81.method293(2, arg2 + 4, local33, local44, local57, local68, -1);
							local863 = local81.method293(2, local837, local33, local44, local57, local68, -1);
						} else {
							local853 = new Class1_Sub1_Sub1_Sub2(2, arg2 + 4, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							local863 = new Class1_Sub1_Sub1_Sub2(2, local837, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
						}
						arg5.method531(anIntArray24[arg2], local863, local78, arg7, arg0, local114, anIntArray24[local837], local100, local853, arg4);
						if (local81.aBoolean125) {
							if (arg2 == 0) {
								this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg0][arg7][arg4 + 1] |= 0x492;
							} else if (arg2 == 1) {
								this.anIntArrayArrayArray4[arg0][arg7][arg4 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg0][arg7 + 1][arg4] |= 0x249;
							} else if (arg2 == 2) {
								this.anIntArrayArrayArray4[arg0][arg7 + 1][arg4] |= 0x249;
								this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x492;
							} else if (arg2 == 3) {
								this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x492;
								this.anIntArrayArrayArray4[arg0][arg7][arg4] |= 0x249;
							}
						}
						if (local81.aBoolean120 && arg1 != null) {
							arg1.method418(arg2, arg3, local81.aBoolean121, arg4, arg7);
						}
						if (local81.anInt512 != 16) {
							arg5.method539(arg7, arg4, arg0, local81.anInt512);
						}
					} else if (arg3 == 3) {
						if (local81.anInt511 == -1) {
							local140 = local81.method293(3, arg2, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(3, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
						}
						arg5.method531(anIntArray25[arg2], null, local78, arg7, arg0, local114, 0, local100, local140, arg4);
						if (local81.aBoolean127) {
							if (arg2 == 0) {
								this.aByteArrayArrayArray6[arg0][arg7][arg4 + 1] = 50;
							} else if (arg2 == 1) {
								this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4 + 1] = 50;
							} else if (arg2 == 2) {
								this.aByteArrayArrayArray6[arg0][arg7 + 1][arg4] = 50;
							} else if (arg2 == 3) {
								this.aByteArrayArrayArray6[arg0][arg7][arg4] = 50;
							}
						}
						if (local81.aBoolean120 && arg1 != null) {
							arg1.method418(arg2, arg3, local81.aBoolean121, arg4, arg7);
						}
					} else if (arg3 == 9) {
						if (local81.anInt511 == -1) {
							local140 = local81.method293(arg3, arg2, local33, local44, local57, local68, -1);
						} else {
							local140 = new Class1_Sub1_Sub1_Sub2(arg3, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
						}
						arg5.method533(arg7, arg4, 1, arg0, local78, local140, local114, 1, 0, local100);
						if (local81.aBoolean120 && arg1 != null) {
							arg1.method419(local81.anInt509, arg7, local81.anInt510, arg4, arg2, local81.aBoolean121);
						}
					} else {
						if (local81.aBoolean123) {
							if (arg2 == 1) {
								local837 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local837;
							} else if (arg2 == 2) {
								local837 = local68;
								local68 = local44;
								local44 = local837;
								local837 = local57;
								local57 = local33;
								local33 = local837;
							} else if (arg2 == 3) {
								local837 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local837;
							}
						}
						if (arg3 == 4) {
							if (local81.anInt511 == -1) {
								local140 = local81.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(4, 0, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							}
							arg5.method532(anIntArray24[arg2], local140, local114, arg4, local78, 0, arg2 * 512, arg0, arg7, 0, local100);
						} else if (arg3 == 5) {
							local837 = 16;
							local235 = arg5.method549(arg0, arg7, arg4);
							if (local235 > 0) {
								local837 = Class9.method287(local235 >> 14 & 0x7FFF).anInt512;
							}
							if (local81.anInt511 == -1) {
								local863 = local81.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local863 = new Class1_Sub1_Sub1_Sub2(4, 0, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							}
							arg5.method532(anIntArray24[arg2], local863, local114, arg4, local78, anIntArray26[arg2] * local837, arg2 * 512, arg0, arg7, anIntArray27[arg2] * local837, local100);
						} else if (arg3 == 6) {
							if (local81.anInt511 == -1) {
								local140 = local81.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(4, 0, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							}
							arg5.method532(256, local140, local114, arg4, local78, 0, arg2, arg0, arg7, 0, local100);
						} else if (arg3 == 7) {
							if (local81.anInt511 == -1) {
								local140 = local81.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(4, 0, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							}
							arg5.method532(512, local140, local114, arg4, local78, 0, arg2, arg0, arg7, 0, local100);
						} else if (arg3 == 8) {
							if (local81.anInt511 == -1) {
								local140 = local81.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local140 = new Class1_Sub1_Sub1_Sub2(4, 0, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
							}
							arg5.method532(768, local140, local114, arg4, local78, 0, arg2, arg0, arg7, 0, local100);
						}
					}
				}
			} else if (!aBoolean32 || local81.aBoolean122 || local81.aBoolean128) {
				if (local81.anInt511 == -1) {
					local140 = local81.method293(22, arg2, local33, local44, local57, local68, -1);
				} else {
					local140 = new Class1_Sub1_Sub1_Sub2(22, arg2, local81.anInt511, arg6, local57, anInt171, true, local44, local68, local33);
				}
				arg5.method529(local78, local140, arg7, arg0, local100, local114, arg4);
				if (local81.aBoolean120 && local81.aBoolean122 && arg1 != null) {
					arg1.method420(arg7, arg4);
				}
			}
		} catch (@Pc(1587) RuntimeException local1587) {
			signlink.reporterror("77494, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1587.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([Lclient!jc;ZLclient!r;)V")
	public void method61(@OriginalArg(0) Class19[] arg0, @OriginalArg(2) Class37 arg1) {
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
								arg0[local27].method420(local7, local11);
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
			@Pc(136) int local136;
			@Pc(142) int local142;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(172) int local172;
			@Pc(194) int local194;
			@Pc(207) int local207;
			@Pc(213) int local213;
			@Pc(217) int local217;
			@Pc(223) int local223;
			@Pc(239) int local239;
			@Pc(287) int local287;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(111) byte[][] local111 = this.aByteArrayArrayArray6[local7];
				local136 = (int) Math.sqrt((double) 5100);
				local142 = local136 * 768 >> 8;
				for (local144 = 1; local144 < this.anInt174 - 1; local144++) {
					for (local148 = 1; local148 < this.anInt173 - 1; local148++) {
						local172 = this.anIntArrayArrayArray3[local7][local148 + 1][local144] - this.anIntArrayArrayArray3[local7][local148 - 1][local144];
						local194 = this.anIntArrayArrayArray3[local7][local148][local144 + 1] - this.anIntArrayArrayArray3[local7][local148][local144 - 1];
						local207 = (int) Math.sqrt((double) (local172 * local172 + local194 * local194 + 65536));
						local213 = (local172 << 8) / local207;
						local217 = 65536 / local207;
						local223 = (local194 << 8) / local207;
						local239 = (local213 * -50 + local217 * -10 + local223 * -50) / local142 + 96;
						local287 = (local111[local148 - 1][local144] >> 2) + (local111[local148 + 1][local144] >> 3) + (local111[local148][local144 - 1] >> 2) + (local111[local148][local144 + 1] >> 3) + (local111[local148][local144] >> 1);
						this.anIntArrayArray2[local148][local144] = local239 - local287;
					}
				}
				for (local148 = 0; local148 < this.anInt174; local148++) {
					this.anIntArray19[local148] = 0;
					this.anIntArray20[local148] = 0;
					this.anIntArray21[local148] = 0;
					this.anIntArray22[local148] = 0;
					this.anIntArray23[local148] = 0;
				}
				for (local172 = -5; local172 < this.anInt173 + 5; local172++) {
					for (local194 = 0; local194 < this.anInt174; local194++) {
						local207 = local172 + 5;
						@Pc(422) int local422;
						if (local207 >= 0 && local207 < this.anInt173) {
							local213 = this.aByteArrayArrayArray2[local7][local207][local194] & 0xFF;
							if (local213 > 0) {
								@Pc(381) Class21 local381 = Class21.aClass21Array1[local213 - 1];
								this.anIntArray19[local194] += local381.anInt718;
								this.anIntArray20[local194] += local381.anInt716;
								this.anIntArray21[local194] += local381.anInt717;
								this.anIntArray22[local194] += local381.anInt719;
								local422 = this.anIntArray23[local194]++;
							}
						}
						local213 = local172 - 5;
						if (local213 >= 0 && local213 < this.anInt173) {
							local217 = this.aByteArrayArrayArray2[local7][local213][local194] & 0xFF;
							if (local217 > 0) {
								@Pc(454) Class21 local454 = Class21.aClass21Array1[local217 - 1];
								this.anIntArray19[local194] -= local454.anInt718;
								this.anIntArray20[local194] -= local454.anInt716;
								this.anIntArray21[local194] -= local454.anInt717;
								this.anIntArray22[local194] -= local454.anInt719;
								local422 = this.anIntArray23[local194]--;
							}
						}
					}
					if (local172 >= 1 && local172 < this.anInt173 - 1) {
						local207 = 0;
						local213 = 0;
						local217 = 0;
						local223 = 0;
						local239 = 0;
						for (local287 = -5; local287 < this.anInt174 + 5; local287++) {
							@Pc(530) int local530 = local287 + 5;
							if (local530 >= 0 && local530 < this.anInt174) {
								local207 += this.anIntArray19[local530];
								local213 += this.anIntArray20[local530];
								local217 += this.anIntArray21[local530];
								local223 += this.anIntArray22[local530];
								local239 += this.anIntArray23[local530];
							}
							@Pc(575) int local575 = local287 - 5;
							if (local575 >= 0 && local575 < this.anInt174) {
								local207 -= this.anIntArray19[local575];
								local213 -= this.anIntArray20[local575];
								local217 -= this.anIntArray21[local575];
								local223 -= this.anIntArray22[local575];
								local239 -= this.anIntArray23[local575];
							}
							if (local287 >= 1 && local287 < this.anInt174 - 1 && (!aBoolean32 || (this.aByteArrayArrayArray1[local7][local172][local287] & 0x10) == 0 && this.method62(local7, local287, local172) == anInt172)) {
								@Pc(658) int local658 = this.aByteArrayArrayArray2[local7][local172][local287] & 0xFF;
								@Pc(669) int local669 = this.aByteArrayArrayArray3[local7][local172][local287] & 0xFF;
								if (local658 > 0 || local669 > 0) {
									@Pc(682) int local682 = this.anIntArrayArrayArray3[local7][local172][local287];
									@Pc(693) int local693 = this.anIntArrayArrayArray3[local7][local172 + 1][local287];
									@Pc(706) int local706 = this.anIntArrayArrayArray3[local7][local172 + 1][local287 + 1];
									@Pc(717) int local717 = this.anIntArrayArrayArray3[local7][local172][local287 + 1];
									@Pc(724) int local724 = this.anIntArrayArray2[local172][local287];
									@Pc(733) int local733 = this.anIntArrayArray2[local172 + 1][local287];
									@Pc(744) int local744 = this.anIntArrayArray2[local172 + 1][local287 + 1];
									@Pc(753) int local753 = this.anIntArrayArray2[local172][local287 + 1];
									@Pc(755) int local755 = -1;
									@Pc(757) int local757 = -1;
									@Pc(765) int local765;
									@Pc(769) int local769;
									if (local658 > 0) {
										local765 = local207 * 256 / local223;
										local769 = local213 / local239;
										@Pc(773) int local773 = local217 / local239;
										local755 = this.method70(local765, local769, local773);
										@Pc(785) int local785 = local765 + anInt175 & 0xFF;
										local773 += anInt176;
										if (local773 < 0) {
											local773 = 0;
										} else if (local773 > 255) {
											local773 = 255;
										}
										local757 = this.method70(local785, local769, local773);
									}
									if (local7 > 0) {
										@Pc(810) boolean local810 = true;
										if (local658 == 0 && this.aByteArrayArrayArray4[local7][local172][local287] != 0) {
											local810 = false;
										}
										if (local669 > 0 && !Class21.aClass21Array1[local669 - 1].aBoolean177) {
											local810 = false;
										}
										if (local810 && local682 == local693 && local682 == local706 && local682 == local717) {
											this.anIntArrayArrayArray4[local7][local172][local287] |= 0x924;
										}
									}
									local765 = 0;
									if (local755 != -1) {
										local765 = Class1_Sub1_Sub2_Sub1.anIntArray180[method68(local757, 96)];
									}
									if (local669 == 0) {
										arg1.method528(local7, local172, local287, 0, 0, -1, local682, local693, local706, local717, method68(local755, local724), method68(local755, local733), method68(local755, local744), method68(local755, local753), 0, 0, 0, 0, local765, 0);
									} else {
										local769 = this.aByteArrayArrayArray4[local7][local172][local287] + 1;
										@Pc(922) byte local922 = this.aByteArrayArrayArray5[local7][local172][local287];
										@Pc(928) Class21 local928 = Class21.aClass21Array1[local669 - 1];
										@Pc(931) int local931 = local928.anInt714;
										@Pc(939) int local939;
										@Pc(937) int local937;
										if (local931 >= 0) {
											local937 = Class1_Sub1_Sub2_Sub1.method345(local931);
											local939 = -1;
										} else if (local928.anInt713 == 16711935) {
											local937 = 0;
											local939 = -2;
											local931 = -1;
										} else {
											local939 = this.method70(local928.anInt715, local928.anInt716, local928.anInt717);
											local937 = Class1_Sub1_Sub2_Sub1.anIntArray180[this.method69(local928.anInt720, 96)];
										}
										arg1.method528(local7, local172, local287, local769, local922, local931, local682, local693, local706, local717, method68(local755, local724), method68(local755, local733), method68(local755, local744), method68(local755, local753), this.method69(local939, local724), this.method69(local939, local733), this.method69(local939, local744), this.method69(local939, local753), local765, local937);
									}
								}
							}
						}
					}
				}
				for (local194 = 1; local194 < this.anInt174 - 1; local194++) {
					for (local207 = 1; local207 < this.anInt173 - 1; local207++) {
						arg1.method527(local7, local207, local194, this.method62(local7, local194, local207));
					}
				}
			}
			arg1.method554();
			for (local11 = 0; local11 < this.anInt173; local11++) {
				for (local27 = 0; local27 < this.anInt174; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg1.method525(local11, local27);
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
					for (local136 = 0; local136 <= this.anInt174; local136++) {
						for (local142 = 0; local142 <= this.anInt173; local142++) {
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local27) != 0) {
								local144 = local136;
								local148 = local136;
								local172 = local1132;
								local194 = local1132;
								while (local144 > 0 && (this.anIntArrayArrayArray4[local1132][local142][local144 - 1] & local27) != 0) {
									local144--;
								}
								while (local148 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local142][local148 + 1] & local27) != 0) {
									local148++;
								}
								label324: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local172 - 1][local142][local207] & local27) == 0) {
											break label324;
										}
									}
									local172--;
								}
								label313: while (local194 < local1114) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local194 + 1][local142][local207] & local27) == 0) {
											break label313;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray3[local194][local142][local144] - 240;
									local223 = this.anIntArrayArrayArray3[local172][local142][local144];
									Class37.method526(local1114, local217, local148 * 128 + 128, local142 * 128, local142 * 128, local144 * 128, local223, 1);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray4[local239][local142][local287] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local1110) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local1132;
								local194 = local1132;
								while (local144 > 0 && (this.anIntArrayArrayArray4[local1132][local144 - 1][local136] & local1110) != 0) {
									local144--;
								}
								while (local148 < this.anInt173 && (this.anIntArrayArrayArray4[local1132][local148 + 1][local136] & local1110) != 0) {
									local148++;
								}
								label377: while (local172 > 0) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local172 - 1][local207][local136] & local1110) == 0) {
											break label377;
										}
									}
									local172--;
								}
								label366: while (local194 < local1114) {
									for (local207 = local144; local207 <= local148; local207++) {
										if ((this.anIntArrayArrayArray4[local194 + 1][local207][local136] & local1110) == 0) {
											break label366;
										}
									}
									local194++;
								}
								local207 = (local194 + 1 - local172) * (local148 + 1 - local144);
								if (local207 >= 8) {
									local217 = this.anIntArrayArrayArray3[local194][local144][local136] - 240;
									local223 = this.anIntArrayArrayArray3[local172][local144][local136];
									Class37.method526(local1114, local217, local136 * 128, local144 * 128, local148 * 128 + 128, local136 * 128, local223, 2);
									for (local239 = local172; local239 <= local194; local239++) {
										for (local287 = local144; local287 <= local148; local287++) {
											this.anIntArrayArrayArray4[local239][local287][local136] &= ~local1110;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1132][local142][local136] & local1112) != 0) {
								local144 = local142;
								local148 = local142;
								local172 = local136;
								local194 = local136;
								while (local172 > 0 && (this.anIntArrayArrayArray4[local1132][local142][local172 - 1] & local1112) != 0) {
									local172--;
								}
								while (local194 < this.anInt174 && (this.anIntArrayArrayArray4[local1132][local142][local194 + 1] & local1112) != 0) {
									local194++;
								}
								label430: while (local144 > 0) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray4[local1132][local144 - 1][local207] & local1112) == 0) {
											break label430;
										}
									}
									local144--;
								}
								label419: while (local148 < this.anInt173) {
									for (local207 = local172; local207 <= local194; local207++) {
										if ((this.anIntArrayArrayArray4[local1132][local148 + 1][local207] & local1112) == 0) {
											break label419;
										}
									}
									local148++;
								}
								if ((local148 + 1 - local144) * (local194 + 1 - local172) >= 4) {
									local207 = this.anIntArrayArrayArray3[local1132][local144][local172];
									Class37.method526(local1114, local207, local194 * 128 + 128, local144 * 128, local148 * 128 + 128, local172 * 128, local207, 4);
									for (local213 = local144; local213 <= local148; local213++) {
										for (local217 = local172; local217 <= local194; local217++) {
											this.anIntArrayArrayArray4[local1132][local213][local217] &= ~local1112;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1747) RuntimeException local1747) {
			signlink.reporterror("25449, " + arg0 + ", " + false + ", " + arg1 + ", " + local1747.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("73870, " + arg0 + ", " + arg1 + ", " + 11451 + ", " + arg2 + ", " + local38.toString());
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
