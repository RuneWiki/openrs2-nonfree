import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private static int anInt163 = 30967;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
	public static boolean aBoolean39 = true;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	private static final int[] anIntArray25 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	private static final int[] anIntArray26 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	private static final int[] anIntArray27 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	private static final int[] anIntArray28 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "I")
	private static int anInt167 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	private static int anInt168 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	private int anInt162 = 101;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt166;

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
	private int[] anIntArray20;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[B)Z")
	public static boolean method57(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, 15787);
			@Pc(11) int local11 = -1;
			label53: while (true) {
				@Pc(20) int local20 = local9.method490();
				if (local20 == 0) {
					return local3;
				}
				local11 += local20;
				@Pc(28) int local28 = 0;
				@Pc(30) boolean local30 = false;
				while (true) {
					@Pc(35) int local35;
					while (!local30) {
						local35 = local9.method490();
						if (local35 == 0) {
							continue label53;
						}
						local28 += local35 - 1;
						@Pc(57) int local57 = local28 & 0x3F;
						@Pc(63) int local63 = local28 >> 6 & 0x3F;
						@Pc(68) int local68 = local9.method476() >> 2;
						@Pc(72) int local72 = local63 + arg1;
						@Pc(76) int local76 = local57 + arg0;
						if (local72 > 0 && local76 > 0 && local72 < 103 && local76 < 103) {
							@Pc(89) Class9 local89 = Class9.method287(local11);
							if (local68 != 22 || !aBoolean39 || local89.aBoolean125 || local89.aBoolean131) {
								local3 &= local89.method291();
								local30 = true;
							}
						}
					}
					local35 = local9.method490();
					if (local35 == 0) {
						break;
					}
					local9.method476();
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("52153, " + 576 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ub;Lclient!lb;I)V")
	public static void method58(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = -1;
			if (arg2 < 0) {
				while (true) {
					@Pc(11) int local11 = arg1.method490();
					if (local11 == 0) {
						return;
					}
					local3 += local11;
					@Pc(20) Class9 local20 = Class9.method287(local3);
					local20.method292(arg0, (byte) 2);
					while (true) {
						@Pc(27) int local27 = arg1.method490();
						if (local27 == 0) {
							break;
						}
						arg1.method476();
					}
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("6914, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
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
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray178[arg2 * 1024 / arg3] >> 1;
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
			@Pc(11) Class9 local11 = Class9.method287(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method290(arg1, 658);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("35395, " + arg0 + ", " + arg1 + ", " + 677 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[[[IIILclient!jc;Lclient!r;II)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class19 arg7, @OriginalArg(8) Class37 arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(18) int local18 = arg4[arg5][arg6][arg2];
			@Pc(28) int local28 = arg4[arg5][arg6 + 1][arg2];
			@Pc(40) int local40 = arg4[arg5][arg6 + 1][arg2 + 1];
			@Pc(50) int local50 = arg4[arg5][arg6][arg2 + 1];
			@Pc(60) int local60 = local18 + local28 + local40 + local50 >> 2;
			@Pc(63) Class9 local63 = Class9.method287(arg9);
			@Pc(75) int local75 = arg6 + (arg2 << 7) + (arg9 << 14) + 1073741824;
			if (!local63.aBoolean125) {
				local75 += Integer.MIN_VALUE;
			}
			@Pc(89) byte local89 = (byte) ((arg0 << 6) + arg3);
			@Pc(109) Class1_Sub1_Sub1 local109;
			if (arg3 == 22) {
				if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
					local109 = local63.method293(22, arg0, local18, local28, local40, local50, -1);
				} else {
					local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, 22, local50, local40, false, local18, local63.anInt504, true, local28);
				}
				arg8.method532(local89, local75, arg1, arg2, local60, local109, arg6);
				if (local63.aBoolean123 && local63.aBoolean125) {
					arg7.method420(arg6, arg2);
				}
			} else {
				@Pc(205) int local205;
				if (arg3 == 10 || arg3 == 11) {
					if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method293(10, arg0, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, 10, local50, local40, false, local18, local63.anInt504, true, local28);
					}
					if (local109 != null) {
						@Pc(192) int local192 = 0;
						if (arg3 == 11) {
							local192 += 256;
						}
						@Pc(208) int local208;
						if (arg0 == 1 || arg0 == 3) {
							local205 = local63.anInt503;
							local208 = local63.anInt502;
						} else {
							local205 = local63.anInt502;
							local208 = local63.anInt503;
						}
						arg8.method536(arg2, arg6, local60, local89, local75, local192, local205, arg1, local109, local208);
					}
					if (local63.aBoolean123) {
						arg7.method419(arg2, local63.anInt502, local63.aBoolean124, arg6, local63.anInt503, arg0);
					}
				} else if (arg3 >= 12) {
					if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method293(arg3, arg0, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, arg3, local50, local40, false, local18, local63.anInt504, true, local28);
					}
					arg8.method536(arg2, arg6, local60, local89, local75, 0, 1, arg1, local109, 1);
					if (local63.aBoolean123) {
						arg7.method419(arg2, local63.anInt502, local63.aBoolean124, arg6, local63.anInt503, arg0);
					}
				} else if (arg3 == 0) {
					if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method293(0, arg0, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, 0, local50, local40, false, local18, local63.anInt504, true, local28);
					}
					arg8.method534(local89, anIntArray25[arg0], local60, local75, arg6, local109, 0, null, arg1, arg2);
					if (local63.aBoolean123) {
						arg7.method418(arg0, local63.aBoolean124, arg3, arg6, arg2);
					}
				} else if (arg3 == 1) {
					if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
						local109 = local63.method293(1, arg0, local18, local28, local40, local50, -1);
					} else {
						local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, 1, local50, local40, false, local18, local63.anInt504, true, local28);
					}
					arg8.method534(local89, anIntArray26[arg0], local60, local75, arg6, local109, 0, null, arg1, arg2);
					if (local63.aBoolean123) {
						arg7.method418(arg0, local63.aBoolean124, arg3, arg6, arg2);
					}
				} else {
					@Pc(451) int local451;
					@Pc(480) Class1_Sub1_Sub1 local480;
					if (arg3 == 2) {
						local451 = arg0 + 1 & 0x3;
						@Pc(470) Class1_Sub1_Sub1 local470;
						if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
							local470 = local63.method293(2, arg0 + 4, local18, local28, local40, local50, -1);
							local480 = local63.method293(2, local451, local18, local28, local40, local50, -1);
						} else {
							local470 = new Class1_Sub1_Sub1_Sub2(arg0 + 4, arg9, 2, local50, local40, false, local18, local63.anInt504, true, local28);
							local480 = new Class1_Sub1_Sub1_Sub2(local451, arg9, 2, local50, local40, false, local18, local63.anInt504, true, local28);
						}
						arg8.method534(local89, anIntArray25[arg0], local60, local75, arg6, local470, anIntArray25[local451], local480, arg1, arg2);
						if (local63.aBoolean123) {
							arg7.method418(arg0, local63.aBoolean124, arg3, arg6, arg2);
						}
					} else if (arg3 == 3) {
						if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
							local109 = local63.method293(3, arg0, local18, local28, local40, local50, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, 3, local50, local40, false, local18, local63.anInt504, true, local28);
						}
						arg8.method534(local89, anIntArray26[arg0], local60, local75, arg6, local109, 0, null, arg1, arg2);
						if (local63.aBoolean123) {
							arg7.method418(arg0, local63.aBoolean124, arg3, arg6, arg2);
						}
					} else if (arg3 == 9) {
						if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
							local109 = local63.method293(arg3, arg0, local18, local28, local40, local50, -1);
						} else {
							local109 = new Class1_Sub1_Sub1_Sub2(arg0, arg9, arg3, local50, local40, false, local18, local63.anInt504, true, local28);
						}
						arg8.method536(arg2, arg6, local60, local89, local75, 0, 1, arg1, local109, 1);
						if (local63.aBoolean123) {
							arg7.method419(arg2, local63.anInt502, local63.aBoolean124, arg6, local63.anInt503, arg0);
						}
					} else {
						if (local63.aBoolean126) {
							if (arg0 == 1) {
								local451 = local50;
								local50 = local40;
								local40 = local28;
								local28 = local18;
								local18 = local451;
							} else if (arg0 == 2) {
								local451 = local50;
								local50 = local28;
								local28 = local451;
								local451 = local40;
								local40 = local18;
								local18 = local451;
							} else if (arg0 == 3) {
								local451 = local50;
								local50 = local18;
								local18 = local28;
								local28 = local40;
								local40 = local451;
							}
						}
						if (arg3 == 4) {
							if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method293(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(0, arg9, 4, local50, local40, false, local18, local63.anInt504, true, local28);
							}
							arg8.method535(arg2, arg1, local60, local109, local89, anIntArray25[arg0], arg0 * 512, local75, 0, anInt163, arg6, 0);
						} else if (arg3 == 5) {
							local451 = 16;
							local205 = arg8.method552(arg1, arg6, arg2);
							if (local205 > 0) {
								local451 = Class9.method287(local205 >> 14 & 0x7FFF).anInt505;
							}
							if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
								local480 = local63.method293(4, 0, local18, local28, local40, local50, -1);
							} else {
								local480 = new Class1_Sub1_Sub1_Sub2(0, arg9, 4, local50, local40, false, local18, local63.anInt504, true, local28);
							}
							arg8.method535(arg2, arg1, local60, local480, local89, anIntArray25[arg0], arg0 * 512, local75, anIntArray27[arg0] * local451, anInt163, arg6, anIntArray28[arg0] * local451);
						} else if (arg3 == 6) {
							if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method293(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(0, arg9, 4, local50, local40, false, local18, local63.anInt504, true, local28);
							}
							arg8.method535(arg2, arg1, local60, local109, local89, 256, arg0, local75, 0, anInt163, arg6, 0);
						} else if (arg3 == 7) {
							if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method293(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(0, arg9, 4, local50, local40, false, local18, local63.anInt504, true, local28);
							}
							arg8.method535(arg2, arg1, local60, local109, local89, 512, arg0, local75, 0, anInt163, arg6, 0);
						} else if (arg3 == 8) {
							if (local63.anInt504 == -1 && local63.anIntArray160 == null) {
								local109 = local63.method293(4, 0, local18, local28, local40, local50, -1);
							} else {
								local109 = new Class1_Sub1_Sub1_Sub2(0, arg9, 4, local50, local40, false, local18, local63.anInt504, true, local28);
							}
							arg8.method535(arg2, arg1, local60, local109, local89, 768, arg0, local75, 0, anInt163, arg6, 0);
						}
					}
				}
			}
		} catch (@Pc(1019) RuntimeException local1019) {
			signlink.reporterror("39236, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 0 + ", " + local1019.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[IIB[[[BI)V")
	public Class4(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt165 = arg4;
			this.anInt166 = arg1;
			this.anIntArrayArrayArray3 = arg0;
			this.aByteArrayArrayArray1 = arg3;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt165][this.anInt166];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt165][this.anInt166];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt165][this.anInt166];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt165][this.anInt166];
			this.anIntArrayArrayArray4 = new int[4][this.anInt165 + 1][this.anInt166 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt165 + 1][this.anInt166 + 1];
			this.anIntArrayArray2 = new int[this.anInt165 + 1][this.anInt166 + 1];
			this.anIntArray20 = new int[this.anInt166];
			this.anIntArray21 = new int[this.anInt166];
			this.anIntArray22 = new int[this.anInt166];
			this.anIntArray23 = new int[this.anInt166];
			this.anIntArray24 = new int[this.anInt166];
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("68666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZI)V")
	public void method55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(3) int local3 = arg1; local3 <= arg1 + 64; local3++) {
				for (@Pc(7) int local7 = arg0; local7 <= arg0 + 64; local7++) {
					if (local7 >= 0 && local7 < this.anInt165 && local3 >= 0 && local3 < this.anInt166) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg0 && local7 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 - 1][local3];
						}
						if (local7 == arg0 + 64 && local7 < this.anInt165 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7 + 1][local3];
						}
						if (local3 == arg1 && local3 > 0) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 - 1];
						}
						if (local3 == arg1 + 64 && local3 < this.anInt166 - 1) {
							this.anIntArrayArrayArray3[0][local7][local3] = this.anIntArrayArrayArray3[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("84774, " + arg0 + ", " + arg1 + ", " + 64 + ", " + true + ", " + 64 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB[BII)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, 15787);
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg4;
						@Pc(27) int local27 = local17 + arg3;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.method476();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -method63(local23 + arg1 + 932731, local27 + 556238 + arg0) * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.method476();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray3[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray3[local9][local23][local27] = this.anIntArrayArrayArray3[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.method477();
									this.aByteArrayArrayArray4[local9][local23][local27] = (byte) ((local49 - 2) / 4);
									this.aByteArrayArrayArray5[local9][local23][local27] = (byte) (local49 - 2 & 0x3);
								} else if (local49 <= 81) {
									this.aByteArrayArrayArray1[local9][local23][local27] = (byte) (local49 - 49);
								} else {
									this.aByteArrayArrayArray2[local9][local23][local27] = (byte) (local49 - 81);
								}
							}
						} else {
							while (true) {
								local49 = local7.method476();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.method476();
									break;
								}
								if (local49 <= 49) {
									local7.method476();
								}
							}
						}
					}
				}
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("95853, " + arg0 + ", " + arg1 + ", " + -54 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BLclient!r;B[Lclient!jc;)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class37 arg3, @OriginalArg(5) Class19[] arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, 15787);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method490();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method490();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method476();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg1;
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
						this.method60(local62, local70, arg3, local66, local55, local74, local101, local9);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("3868, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 4 + ", " + arg4 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!r;IIIILclient!jc;I)V")
	private void method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) int arg7) {
		try {
			if (aBoolean39) {
				if ((this.aByteArrayArrayArray1[arg4][arg1][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method62(arg5, arg1, arg4) != anInt164) {
					return;
				}
			}
			@Pc(33) int local33 = this.anIntArrayArrayArray3[arg4][arg1][arg5];
			@Pc(44) int local44 = this.anIntArrayArrayArray3[arg4][arg1 + 1][arg5];
			@Pc(57) int local57 = this.anIntArrayArrayArray3[arg4][arg1 + 1][arg5 + 1];
			@Pc(68) int local68 = this.anIntArrayArrayArray3[arg4][arg1][arg5 + 1];
			@Pc(83) int local83 = local33 + local44 + local57 + local68 >> 2;
			@Pc(86) Class9 local86 = Class9.method287(arg7);
			@Pc(98) int local98 = arg1 + (arg5 << 7) + (arg7 << 14) + 1073741824;
			if (!local86.aBoolean125) {
				local98 += Integer.MIN_VALUE;
			}
			@Pc(112) byte local112 = (byte) ((arg3 << 6) + arg0);
			@Pc(141) Class1_Sub1_Sub1 local141;
			if (arg0 != 22) {
				@Pc(239) int local239;
				if (arg0 == 10 || arg0 == 11) {
					if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
						local141 = local86.method293(10, arg3, local33, local44, local57, local68, -1);
					} else {
						local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, 10, local68, local57, false, local33, local86.anInt504, true, local44);
					}
					if (local141 != null) {
						@Pc(226) int local226 = 0;
						if (arg0 == 11) {
							local226 += 256;
						}
						@Pc(242) int local242;
						if (arg3 == 1 || arg3 == 3) {
							local239 = local86.anInt503;
							local242 = local86.anInt502;
						} else {
							local239 = local86.anInt502;
							local242 = local86.anInt503;
						}
						if (arg2.method536(arg5, arg1, local83, local112, local98, local226, local239, arg4, local141, local242) && local86.aBoolean130) {
							@Pc(273) Class1_Sub1_Sub1_Sub5 local273;
							if (local141 instanceof Class1_Sub1_Sub1_Sub5) {
								local273 = (Class1_Sub1_Sub1_Sub5) local141;
							} else {
								local273 = local86.method293(10, arg3, local33, local44, local57, local68, -1);
							}
							if (local273 != null) {
								for (@Pc(289) int local289 = 0; local289 <= local239; local289++) {
									for (@Pc(293) int local293 = 0; local293 <= local242; local293++) {
										@Pc(300) int local300 = local273.anInt484 / 4;
										if (local300 > 30) {
											local300 = 30;
										}
										if (local300 > this.aByteArrayArrayArray6[arg4][arg1 + local289][arg5 + local293]) {
											this.aByteArrayArrayArray6[arg4][arg1 + local289][arg5 + local293] = (byte) local300;
										}
									}
								}
							}
						}
					}
					if (local86.aBoolean123 && arg6 != null) {
						arg6.method419(arg5, local86.anInt502, local86.aBoolean124, arg1, local86.anInt503, arg3);
					}
				} else if (arg0 >= 12) {
					if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
						local141 = local86.method293(arg0, arg3, local33, local44, local57, local68, -1);
					} else {
						local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, arg0, local68, local57, false, local33, local86.anInt504, true, local44);
					}
					arg2.method536(arg5, arg1, local83, local112, local98, 0, 1, arg4, local141, 1);
					if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
						this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x924;
					}
					if (local86.aBoolean123 && arg6 != null) {
						arg6.method419(arg5, local86.anInt502, local86.aBoolean124, arg1, local86.anInt503, arg3);
					}
				} else if (arg0 == 0) {
					if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
						local141 = local86.method293(0, arg3, local33, local44, local57, local68, -1);
					} else {
						local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, 0, local68, local57, false, local33, local86.anInt504, true, local44);
					}
					arg2.method534(local112, anIntArray25[arg3], local83, local98, arg1, local141, 0, null, arg4, arg5);
					if (arg3 == 0) {
						if (local86.aBoolean130) {
							this.aByteArrayArrayArray6[arg4][arg1][arg5] = 50;
							this.aByteArrayArrayArray6[arg4][arg1][arg5 + 1] = 50;
						}
						if (local86.aBoolean128) {
							this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x249;
						}
					} else if (arg3 == 1) {
						if (local86.aBoolean130) {
							this.aByteArrayArrayArray6[arg4][arg1][arg5 + 1] = 50;
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5 + 1] = 50;
						}
						if (local86.aBoolean128) {
							this.anIntArrayArrayArray4[arg4][arg1][arg5 + 1] |= 0x492;
						}
					} else if (arg3 == 2) {
						if (local86.aBoolean130) {
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5] = 50;
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5 + 1] = 50;
						}
						if (local86.aBoolean128) {
							this.anIntArrayArrayArray4[arg4][arg1 + 1][arg5] |= 0x249;
						}
					} else if (arg3 == 3) {
						if (local86.aBoolean130) {
							this.aByteArrayArrayArray6[arg4][arg1][arg5] = 50;
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5] = 50;
						}
						if (local86.aBoolean128) {
							this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x492;
						}
					}
					if (local86.aBoolean123 && arg6 != null) {
						arg6.method418(arg3, local86.aBoolean124, arg0, arg1, arg5);
					}
					if (local86.anInt505 != 16) {
						arg2.method542(arg5, local86.anInt505, arg1, arg4);
					}
				} else if (arg0 == 1) {
					if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
						local141 = local86.method293(1, arg3, local33, local44, local57, local68, -1);
					} else {
						local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, 1, local68, local57, false, local33, local86.anInt504, true, local44);
					}
					arg2.method534(local112, anIntArray26[arg3], local83, local98, arg1, local141, 0, null, arg4, arg5);
					if (local86.aBoolean130) {
						if (arg3 == 0) {
							this.aByteArrayArrayArray6[arg4][arg1][arg5 + 1] = 50;
						} else if (arg3 == 1) {
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5 + 1] = 50;
						} else if (arg3 == 2) {
							this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5] = 50;
						} else if (arg3 == 3) {
							this.aByteArrayArrayArray6[arg4][arg1][arg5] = 50;
						}
					}
					if (local86.aBoolean123 && arg6 != null) {
						arg6.method418(arg3, local86.aBoolean124, arg0, arg1, arg5);
					}
				} else {
					@Pc(850) int local850;
					@Pc(879) Class1_Sub1_Sub1 local879;
					if (arg0 == 2) {
						local850 = arg3 + 1 & 0x3;
						@Pc(869) Class1_Sub1_Sub1 local869;
						if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
							local869 = local86.method293(2, arg3 + 4, local33, local44, local57, local68, -1);
							local879 = local86.method293(2, local850, local33, local44, local57, local68, -1);
						} else {
							local869 = new Class1_Sub1_Sub1_Sub2(arg3 + 4, arg7, 2, local68, local57, false, local33, local86.anInt504, true, local44);
							local879 = new Class1_Sub1_Sub1_Sub2(local850, arg7, 2, local68, local57, false, local33, local86.anInt504, true, local44);
						}
						arg2.method534(local112, anIntArray25[arg3], local83, local98, arg1, local869, anIntArray25[local850], local879, arg4, arg5);
						if (local86.aBoolean128) {
							if (arg3 == 0) {
								this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x249;
								this.anIntArrayArrayArray4[arg4][arg1][arg5 + 1] |= 0x492;
							} else if (arg3 == 1) {
								this.anIntArrayArrayArray4[arg4][arg1][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray4[arg4][arg1 + 1][arg5] |= 0x249;
							} else if (arg3 == 2) {
								this.anIntArrayArrayArray4[arg4][arg1 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x492;
							} else if (arg3 == 3) {
								this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x492;
								this.anIntArrayArrayArray4[arg4][arg1][arg5] |= 0x249;
							}
						}
						if (local86.aBoolean123 && arg6 != null) {
							arg6.method418(arg3, local86.aBoolean124, arg0, arg1, arg5);
						}
						if (local86.anInt505 != 16) {
							arg2.method542(arg5, local86.anInt505, arg1, arg4);
						}
					} else if (arg0 == 3) {
						if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
							local141 = local86.method293(3, arg3, local33, local44, local57, local68, -1);
						} else {
							local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, 3, local68, local57, false, local33, local86.anInt504, true, local44);
						}
						arg2.method534(local112, anIntArray26[arg3], local83, local98, arg1, local141, 0, null, arg4, arg5);
						if (local86.aBoolean130) {
							if (arg3 == 0) {
								this.aByteArrayArrayArray6[arg4][arg1][arg5 + 1] = 50;
							} else if (arg3 == 1) {
								this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5 + 1] = 50;
							} else if (arg3 == 2) {
								this.aByteArrayArrayArray6[arg4][arg1 + 1][arg5] = 50;
							} else if (arg3 == 3) {
								this.aByteArrayArrayArray6[arg4][arg1][arg5] = 50;
							}
						}
						if (local86.aBoolean123 && arg6 != null) {
							arg6.method418(arg3, local86.aBoolean124, arg0, arg1, arg5);
						}
					} else if (arg0 == 9) {
						if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
							local141 = local86.method293(arg0, arg3, local33, local44, local57, local68, -1);
						} else {
							local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, arg0, local68, local57, false, local33, local86.anInt504, true, local44);
						}
						arg2.method536(arg5, arg1, local83, local112, local98, 0, 1, arg4, local141, 1);
						if (local86.aBoolean123 && arg6 != null) {
							arg6.method419(arg5, local86.anInt502, local86.aBoolean124, arg1, local86.anInt503, arg3);
						}
					} else {
						if (local86.aBoolean126) {
							if (arg3 == 1) {
								local850 = local68;
								local68 = local57;
								local57 = local44;
								local44 = local33;
								local33 = local850;
							} else if (arg3 == 2) {
								local850 = local68;
								local68 = local44;
								local44 = local850;
								local850 = local57;
								local57 = local33;
								local33 = local850;
							} else if (arg3 == 3) {
								local850 = local68;
								local68 = local33;
								local33 = local44;
								local44 = local57;
								local57 = local850;
							}
						}
						if (arg0 == 4) {
							if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
								local141 = local86.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local141 = new Class1_Sub1_Sub1_Sub2(0, arg7, 4, local68, local57, false, local33, local86.anInt504, true, local44);
							}
							arg2.method535(arg5, arg4, local83, local141, local112, anIntArray25[arg3], arg3 * 512, local98, 0, anInt163, arg1, 0);
						} else if (arg0 == 5) {
							local850 = 16;
							local239 = arg2.method552(arg4, arg1, arg5);
							if (local239 > 0) {
								local850 = Class9.method287(local239 >> 14 & 0x7FFF).anInt505;
							}
							if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
								local879 = local86.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local879 = new Class1_Sub1_Sub1_Sub2(0, arg7, 4, local68, local57, false, local33, local86.anInt504, true, local44);
							}
							arg2.method535(arg5, arg4, local83, local879, local112, anIntArray25[arg3], arg3 * 512, local98, anIntArray27[arg3] * local850, anInt163, arg1, anIntArray28[arg3] * local850);
						} else if (arg0 == 6) {
							if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
								local141 = local86.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local141 = new Class1_Sub1_Sub1_Sub2(0, arg7, 4, local68, local57, false, local33, local86.anInt504, true, local44);
							}
							arg2.method535(arg5, arg4, local83, local141, local112, 256, arg3, local98, 0, anInt163, arg1, 0);
						} else if (arg0 == 7) {
							if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
								local141 = local86.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local141 = new Class1_Sub1_Sub1_Sub2(0, arg7, 4, local68, local57, false, local33, local86.anInt504, true, local44);
							}
							arg2.method535(arg5, arg4, local83, local141, local112, 512, arg3, local98, 0, anInt163, arg1, 0);
						} else if (arg0 == 8) {
							if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
								local141 = local86.method293(4, 0, local33, local44, local57, local68, -1);
							} else {
								local141 = new Class1_Sub1_Sub1_Sub2(0, arg7, 4, local68, local57, false, local33, local86.anInt504, true, local44);
							}
							arg2.method535(arg5, arg4, local83, local141, local112, 768, arg3, local98, 0, anInt163, arg1, 0);
						}
					}
				}
			} else if (!aBoolean39 || local86.aBoolean125 || local86.aBoolean131) {
				if (local86.anInt504 == -1 && local86.anIntArray160 == null) {
					local141 = local86.method293(22, arg3, local33, local44, local57, local68, -1);
				} else {
					local141 = new Class1_Sub1_Sub1_Sub2(arg3, arg7, 22, local68, local57, false, local33, local86.anInt504, true, local44);
				}
				arg2.method532(local112, local98, arg4, arg5, local83, local141, arg1);
				if (local86.aBoolean123 && local86.aBoolean125 && arg6 != null) {
					arg6.method420(arg1, arg5);
				}
			}
		} catch (@Pc(1624) RuntimeException local1624) {
			signlink.reporterror("66723, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -805 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1624.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B[Lclient!jc;Lclient!r;)V")
	public void method61(@OriginalArg(1) Class19[] arg0, @OriginalArg(2) Class37 arg1) {
		try {
			@Pc(18) int local18;
			@Pc(22) int local22;
			@Pc(38) int local38;
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < 104; local18++) {
					for (local22 = 0; local22 < 104; local22++) {
						if ((this.aByteArrayArrayArray1[local14][local18][local22] & 0x1) == 1) {
							local38 = local14;
							if ((this.aByteArrayArrayArray1[1][local18][local22] & 0x2) == 2) {
								local38 = local14 - 1;
							}
							if (local38 >= 0) {
								arg0[local38].method420(local18, local22);
							}
						}
					}
				}
			}
			anInt167 += (int) (Math.random() * 5.0D) - 2;
			if (anInt167 < -8) {
				anInt167 = -8;
			}
			if (anInt167 > 8) {
				anInt167 = 8;
			}
			anInt168 += (int) (Math.random() * 5.0D) - 2;
			if (anInt168 < -16) {
				anInt168 = -16;
			}
			if (anInt168 > 16) {
				anInt168 = 16;
			}
			@Pc(144) int local144;
			@Pc(150) int local150;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(180) int local180;
			@Pc(202) int local202;
			@Pc(215) int local215;
			@Pc(221) int local221;
			@Pc(225) int local225;
			@Pc(231) int local231;
			@Pc(247) int local247;
			@Pc(295) int local295;
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(119) byte[][] local119 = this.aByteArrayArrayArray6[local18];
				local144 = (int) Math.sqrt((double) 5100);
				local150 = local144 * 768 >> 8;
				for (local152 = 1; local152 < this.anInt166 - 1; local152++) {
					for (local156 = 1; local156 < this.anInt165 - 1; local156++) {
						local180 = this.anIntArrayArrayArray3[local18][local156 + 1][local152] - this.anIntArrayArrayArray3[local18][local156 - 1][local152];
						local202 = this.anIntArrayArrayArray3[local18][local156][local152 + 1] - this.anIntArrayArrayArray3[local18][local156][local152 - 1];
						local215 = (int) Math.sqrt((double) (local180 * local180 + local202 * local202 + 65536));
						local221 = (local180 << 8) / local215;
						local225 = 65536 / local215;
						local231 = (local202 << 8) / local215;
						local247 = (local221 * -50 + local225 * -10 + local231 * -50) / local150 + 96;
						local295 = (local119[local156 - 1][local152] >> 2) + (local119[local156 + 1][local152] >> 3) + (local119[local156][local152 - 1] >> 2) + (local119[local156][local152 + 1] >> 3) + (local119[local156][local152] >> 1);
						this.anIntArrayArray2[local156][local152] = local247 - local295;
					}
				}
				for (local156 = 0; local156 < this.anInt166; local156++) {
					this.anIntArray20[local156] = 0;
					this.anIntArray21[local156] = 0;
					this.anIntArray22[local156] = 0;
					this.anIntArray23[local156] = 0;
					this.anIntArray24[local156] = 0;
				}
				for (local180 = -5; local180 < this.anInt165 + 5; local180++) {
					for (local202 = 0; local202 < this.anInt166; local202++) {
						local215 = local180 + 5;
						@Pc(430) int local430;
						if (local215 >= 0 && local215 < this.anInt165) {
							local221 = this.aByteArrayArrayArray2[local18][local215][local202] & 0xFF;
							if (local221 > 0) {
								@Pc(389) Class21 local389 = Class21.aClass21Array1[local221 - 1];
								this.anIntArray20[local202] += local389.anInt708;
								this.anIntArray21[local202] += local389.anInt706;
								this.anIntArray22[local202] += local389.anInt707;
								this.anIntArray23[local202] += local389.anInt709;
								local430 = this.anIntArray24[local202]++;
							}
						}
						local221 = local180 - 5;
						if (local221 >= 0 && local221 < this.anInt165) {
							local225 = this.aByteArrayArrayArray2[local18][local221][local202] & 0xFF;
							if (local225 > 0) {
								@Pc(462) Class21 local462 = Class21.aClass21Array1[local225 - 1];
								this.anIntArray20[local202] -= local462.anInt708;
								this.anIntArray21[local202] -= local462.anInt706;
								this.anIntArray22[local202] -= local462.anInt707;
								this.anIntArray23[local202] -= local462.anInt709;
								local430 = this.anIntArray24[local202]--;
							}
						}
					}
					if (local180 >= 1 && local180 < this.anInt165 - 1) {
						local215 = 0;
						local221 = 0;
						local225 = 0;
						local231 = 0;
						local247 = 0;
						for (local295 = -5; local295 < this.anInt166 + 5; local295++) {
							@Pc(538) int local538 = local295 + 5;
							if (local538 >= 0 && local538 < this.anInt166) {
								local215 += this.anIntArray20[local538];
								local221 += this.anIntArray21[local538];
								local225 += this.anIntArray22[local538];
								local231 += this.anIntArray23[local538];
								local247 += this.anIntArray24[local538];
							}
							@Pc(583) int local583 = local295 - 5;
							if (local583 >= 0 && local583 < this.anInt166) {
								local215 -= this.anIntArray20[local583];
								local221 -= this.anIntArray21[local583];
								local225 -= this.anIntArray22[local583];
								local231 -= this.anIntArray23[local583];
								local247 -= this.anIntArray24[local583];
							}
							if (local295 >= 1 && local295 < this.anInt166 - 1 && (!aBoolean39 || (this.aByteArrayArrayArray1[local18][local180][local295] & 0x10) == 0 && this.method62(local295, local180, local18) == anInt164)) {
								@Pc(666) int local666 = this.aByteArrayArrayArray2[local18][local180][local295] & 0xFF;
								@Pc(677) int local677 = this.aByteArrayArrayArray3[local18][local180][local295] & 0xFF;
								if (local666 > 0 || local677 > 0) {
									@Pc(690) int local690 = this.anIntArrayArrayArray3[local18][local180][local295];
									@Pc(701) int local701 = this.anIntArrayArrayArray3[local18][local180 + 1][local295];
									@Pc(714) int local714 = this.anIntArrayArrayArray3[local18][local180 + 1][local295 + 1];
									@Pc(725) int local725 = this.anIntArrayArrayArray3[local18][local180][local295 + 1];
									@Pc(732) int local732 = this.anIntArrayArray2[local180][local295];
									@Pc(741) int local741 = this.anIntArrayArray2[local180 + 1][local295];
									@Pc(752) int local752 = this.anIntArrayArray2[local180 + 1][local295 + 1];
									@Pc(761) int local761 = this.anIntArrayArray2[local180][local295 + 1];
									@Pc(763) int local763 = -1;
									@Pc(765) int local765 = -1;
									@Pc(773) int local773;
									@Pc(777) int local777;
									if (local666 > 0) {
										local773 = local215 * 256 / local231;
										local777 = local221 / local247;
										@Pc(781) int local781 = local225 / local247;
										local763 = this.method70(local773, local777, local781);
										@Pc(793) int local793 = local773 + anInt167 & 0xFF;
										local781 += anInt168;
										if (local781 < 0) {
											local781 = 0;
										} else if (local781 > 255) {
											local781 = 255;
										}
										local765 = this.method70(local793, local777, local781);
									}
									if (local18 > 0) {
										@Pc(818) boolean local818 = true;
										if (local666 == 0 && this.aByteArrayArrayArray4[local18][local180][local295] != 0) {
											local818 = false;
										}
										if (local677 > 0 && !Class21.aClass21Array1[local677 - 1].aBoolean192) {
											local818 = false;
										}
										if (local818 && local690 == local701 && local690 == local714 && local690 == local725) {
											this.anIntArrayArrayArray4[local18][local180][local295] |= 0x924;
										}
									}
									local773 = 0;
									if (local763 != -1) {
										local773 = Class1_Sub1_Sub2_Sub1.anIntArray182[method68(local765, 96)];
									}
									if (local677 == 0) {
										arg1.method531(local18, local180, local295, 0, 0, -1, local690, local701, local714, local725, method68(local763, local732), method68(local763, local741), method68(local763, local752), method68(local763, local761), 0, 0, 0, 0, local773, 0);
									} else {
										local777 = this.aByteArrayArrayArray4[local18][local180][local295] + 1;
										@Pc(930) byte local930 = this.aByteArrayArrayArray5[local18][local180][local295];
										@Pc(936) Class21 local936 = Class21.aClass21Array1[local677 - 1];
										@Pc(939) int local939 = local936.anInt704;
										@Pc(947) int local947;
										@Pc(945) int local945;
										if (local939 >= 0) {
											local945 = Class1_Sub1_Sub2_Sub1.method345(local939);
											local947 = -1;
										} else if (local936.anInt703 == 16711935) {
											local945 = 0;
											local947 = -2;
											local939 = -1;
										} else {
											local947 = this.method70(local936.anInt705, local936.anInt706, local936.anInt707);
											local945 = Class1_Sub1_Sub2_Sub1.anIntArray182[this.method69(local936.anInt710, 96)];
										}
										arg1.method531(local18, local180, local295, local777, local930, local939, local690, local701, local714, local725, method68(local763, local732), method68(local763, local741), method68(local763, local752), method68(local763, local761), this.method69(local947, local732), this.method69(local947, local741), this.method69(local947, local752), this.method69(local947, local761), local773, local945);
									}
								}
							}
						}
					}
				}
				for (local202 = 1; local202 < this.anInt166 - 1; local202++) {
					for (local215 = 1; local215 < this.anInt165 - 1; local215++) {
						arg1.method530(local18, local215, local202, this.method62(local202, local215, local18));
					}
				}
			}
			arg1.method557();
			for (local22 = 0; local22 < this.anInt165; local22++) {
				for (local38 = 0; local38 < this.anInt166; local38++) {
					if ((this.aByteArrayArrayArray1[1][local22][local38] & 0x2) == 2) {
						arg1.method528(local38, local22);
					}
				}
			}
			local38 = 1;
			@Pc(1118) int local1118 = 2;
			@Pc(1120) int local1120 = 4;
			for (@Pc(1122) int local1122 = 0; local1122 < 4; local1122++) {
				if (local1122 > 0) {
					local38 <<= 0x3;
					local1118 <<= 0x3;
					local1120 <<= 0x3;
				}
				for (@Pc(1140) int local1140 = 0; local1140 <= local1122; local1140++) {
					for (local144 = 0; local144 <= this.anInt166; local144++) {
						for (local150 = 0; local150 <= this.anInt165; local150++) {
							if ((this.anIntArrayArrayArray4[local1140][local150][local144] & local38) != 0) {
								local152 = local144;
								local156 = local144;
								local180 = local1140;
								local202 = local1140;
								while (local152 > 0 && (this.anIntArrayArrayArray4[local1140][local150][local152 - 1] & local38) != 0) {
									local152--;
								}
								while (local156 < this.anInt166 && (this.anIntArrayArrayArray4[local1140][local150][local156 + 1] & local38) != 0) {
									local156++;
								}
								label324: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray4[local180 - 1][local150][local215] & local38) == 0) {
											break label324;
										}
									}
									local180--;
								}
								label313: while (local202 < local1122) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray4[local202 + 1][local150][local215] & local38) == 0) {
											break label313;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray3[local202][local150][local152] - 240;
									local231 = this.anIntArrayArrayArray3[local180][local150][local152];
									Class37.method529(local152 * 128, local1122, local225, local150 * 128, local150 * 128, local231, local156 * 128 + 128, 1);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray4[local247][local150][local295] &= ~local38;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1140][local150][local144] & local1118) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local1140;
								local202 = local1140;
								while (local152 > 0 && (this.anIntArrayArrayArray4[local1140][local152 - 1][local144] & local1118) != 0) {
									local152--;
								}
								while (local156 < this.anInt165 && (this.anIntArrayArrayArray4[local1140][local156 + 1][local144] & local1118) != 0) {
									local156++;
								}
								label377: while (local180 > 0) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray4[local180 - 1][local215][local144] & local1118) == 0) {
											break label377;
										}
									}
									local180--;
								}
								label366: while (local202 < local1122) {
									for (local215 = local152; local215 <= local156; local215++) {
										if ((this.anIntArrayArrayArray4[local202 + 1][local215][local144] & local1118) == 0) {
											break label366;
										}
									}
									local202++;
								}
								local215 = (local202 + 1 - local180) * (local156 + 1 - local152);
								if (local215 >= 8) {
									local225 = this.anIntArrayArrayArray3[local202][local152][local144] - 240;
									local231 = this.anIntArrayArrayArray3[local180][local152][local144];
									Class37.method529(local144 * 128, local1122, local225, local156 * 128 + 128, local152 * 128, local231, local144 * 128, 2);
									for (local247 = local180; local247 <= local202; local247++) {
										for (local295 = local152; local295 <= local156; local295++) {
											this.anIntArrayArrayArray4[local247][local295][local144] &= ~local1118;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray4[local1140][local150][local144] & local1120) != 0) {
								local152 = local150;
								local156 = local150;
								local180 = local144;
								local202 = local144;
								while (local180 > 0 && (this.anIntArrayArrayArray4[local1140][local150][local180 - 1] & local1120) != 0) {
									local180--;
								}
								while (local202 < this.anInt166 && (this.anIntArrayArrayArray4[local1140][local150][local202 + 1] & local1120) != 0) {
									local202++;
								}
								label430: while (local152 > 0) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray4[local1140][local152 - 1][local215] & local1120) == 0) {
											break label430;
										}
									}
									local152--;
								}
								label419: while (local156 < this.anInt165) {
									for (local215 = local180; local215 <= local202; local215++) {
										if ((this.anIntArrayArrayArray4[local1140][local156 + 1][local215] & local1120) == 0) {
											break label419;
										}
									}
									local156++;
								}
								if ((local156 + 1 - local152) * (local202 + 1 - local180) >= 4) {
									local215 = this.anIntArrayArrayArray3[local1140][local152][local180];
									Class37.method529(local180 * 128, local1122, local215, local156 * 128 + 128, local152 * 128, local215, local202 * 128 + 128, 4);
									for (local221 = local152; local221 <= local156; local221++) {
										for (local225 = local180; local225 <= local202; local225++) {
											this.anIntArrayArrayArray4[local1140][local221][local225] &= ~local1120;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1755) RuntimeException local1755) {
			signlink.reporterror("24657, " + 76 + ", " + arg0 + ", " + arg1 + ", " + local1755.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if ((this.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("30913, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local42.toString());
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
