import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PMIXOPWJ")
public final class Class29 {

	@OriginalMember(owner = "client!PMIXOPWJ", name = "h", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "[I")
	private static final int[] anIntArray132 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "I")
	private static int anInt626 = -21200;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "I")
	private static int anInt627 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "d", descriptor = "[I")
	private static final int[] anIntArray133 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!PMIXOPWJ", name = "e", descriptor = "[I")
	private static final int[] anIntArray134 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!PMIXOPWJ", name = "g", descriptor = "I")
	private static int anInt628 = 398;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "m", descriptor = "I")
	private static int anInt630 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "o", descriptor = "Z")
	public static boolean aBoolean123 = true;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "v", descriptor = "[I")
	private static final int[] anIntArray140 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!PMIXOPWJ", name = "A", descriptor = "I")
	public static int anInt632 = 99;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "f", descriptor = "B")
	private byte aByte17 = 9;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "n", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "u", descriptor = "I")
	private int anInt631 = 16143;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "D", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "B", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "C", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "i", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "x", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "y", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "z", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "p", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "q", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "r", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "s", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "t", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II)I")
	private static int method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method430(arg0 - 1, arg1 - 1) + method430(arg0 + 1, arg1 - 1) + method430(arg0 - 1, arg1 + 1) + method430(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method430(arg0 - 1, arg1) + method430(arg0 + 1, arg1) + method430(arg0, arg1 - 1) + method430(arg0, arg1 + 1);
		@Pc(59) int local59 = method430(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II[BI)Z")
	public static boolean method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, 0);
			@Pc(11) int local11 = -1;
			if (arg3 != 39858) {
				anInt626 = 410;
			}
			label55: while (true) {
				@Pc(19) int local19 = local9.method169();
				if (local19 == 0) {
					return local3;
				}
				local11 += local19;
				@Pc(27) int local27 = 0;
				@Pc(29) boolean local29 = false;
				while (true) {
					@Pc(34) int local34;
					while (!local29) {
						local34 = local9.method169();
						if (local34 == 0) {
							continue label55;
						}
						local27 += local34 - 1;
						@Pc(56) int local56 = local27 & 0x3F;
						@Pc(62) int local62 = local27 >> 6 & 0x3F;
						@Pc(67) int local67 = local9.method155() >> 2;
						@Pc(71) int local71 = local62 + arg0;
						@Pc(75) int local75 = local56 + arg1;
						if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
							@Pc(88) Class44 local88 = Class44.method519(local11);
							if (local67 != 22 || !aBoolean123 || local88.aBoolean163 || local88.aBoolean164) {
								local3 &= local88.method526();
								local29 = true;
							}
						}
					}
					local34 = local9.method169();
					if (local34 == 0) {
						break;
					}
					local9.method155();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("38331, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "(II)I")
	private static int method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(III)I")
	private static int method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method418(local3, local13);
		@Pc(29) int local29 = method418(local3 + 1, local13);
		@Pc(35) int local35 = method418(local3, local13 + 1);
		@Pc(43) int local43 = method418(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method427(local23, local29, local9, arg2);
		@Pc(55) int local55 = method427(local35, local43, local9, arg2);
		return method427(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(IIII)I")
	private static int method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray8[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "d", descriptor = "(II)I")
	private static int method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method426(arg0 + 45365, arg1 + 91923, 4) + (method426(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method426(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "c", descriptor = "(III)Z")
	public static boolean method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) Class44 local9 = Class44.method519(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local9.method524(arg0, 173);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("63599, " + 27253 + ", " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "e", descriptor = "(II)I")
	private static int method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(ZLclient!EYMNCFMK;Lclient!XQFIPMSR;)V")
	public static void method432(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class12_Sub1 arg1) {
		try {
			@Pc(6) int local6 = -1;
			while (true) {
				@Pc(9) int local9 = arg0.method169();
				if (local9 == 0) {
					return;
				}
				local6 += local9;
				@Pc(18) Class44 local18 = Class44.method519(local6);
				local18.method521(arg1);
				while (true) {
					@Pc(25) int local25 = arg0.method169();
					if (local25 == 0) {
						break;
					}
					arg0.method155();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("93480, " + false + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([[[ILclient!FKUDHMAZ;IIIZLclient!ZGDLGUZR;IIII)V")
	public static void method435(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class50 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = arg0[arg3][arg7][arg6];
			@Pc(19) int local19 = arg0[arg3][arg7 + 1][arg6];
			@Pc(31) int local31 = arg0[arg3][arg7 + 1][arg6 + 1];
			@Pc(41) int local41 = arg0[arg3][arg7][arg6 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(54) Class44 local54 = Class44.method519(arg2);
			@Pc(66) int local66 = arg7 + (arg6 << 7) + (arg2 << 14) + 1073741824;
			if (!local54.aBoolean163) {
				local66 += Integer.MIN_VALUE;
			}
			@Pc(80) byte local80 = (byte) ((arg9 << 6) + arg4);
			@Pc(104) Class1_Sub1_Sub1 local104;
			if (arg4 == 22) {
				if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
					local104 = local54.method520(22, arg9, local9, local19, local31, local41, -1);
				} else {
					local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, 22);
				}
				arg1.method201(arg8, arg7, local80, local104, local51, local66, arg6);
				if (local54.aBoolean166 && local54.aBoolean163) {
					arg5.method567(arg7, arg6);
				}
			} else {
				@Pc(200) int local200;
				if (arg4 == 10 || arg4 == 11) {
					if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
						local104 = local54.method520(10, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, 10);
					}
					if (local104 != null) {
						@Pc(187) int local187 = 0;
						if (arg4 == 11) {
							local187 += 256;
						}
						@Pc(203) int local203;
						if (arg9 == 1 || arg9 == 3) {
							local200 = local54.anInt777;
							local203 = local54.anInt773;
						} else {
							local200 = local54.anInt773;
							local203 = local54.anInt777;
						}
						arg1.method205(arg6, local187, arg8, local200, local104, local80, local203, local51, arg7, local66);
					}
					if (local54.aBoolean166) {
						arg5.method566(local54.aBoolean168, local54.anInt773, (byte) 1, arg9, local54.anInt777, arg6, arg7);
					}
				} else if (arg4 >= 12) {
					if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
						local104 = local54.method520(arg4, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, arg4);
					}
					arg1.method205(arg6, 0, arg8, 1, local104, local80, 1, local51, arg7, local66);
					if (local54.aBoolean166) {
						arg5.method566(local54.aBoolean168, local54.anInt773, (byte) 1, arg9, local54.anInt777, arg6, arg7);
					}
				} else if (arg4 == 0) {
					if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
						local104 = local54.method520(0, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, 0);
					}
					arg1.method203(arg8, local51, 0, null, local104, anIntArray133[arg9], arg7, local80, arg6, local66);
					if (local54.aBoolean166) {
						arg5.method565(arg7, local54.aBoolean168, arg9, arg4, arg6);
					}
				} else if (arg4 == 1) {
					if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
						local104 = local54.method520(1, arg9, local9, local19, local31, local41, -1);
					} else {
						local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, 1);
					}
					arg1.method203(arg8, local51, 0, null, local104, anIntArray132[arg9], arg7, local80, arg6, local66);
					if (local54.aBoolean166) {
						arg5.method565(arg7, local54.aBoolean168, arg9, arg4, arg6);
					}
				} else {
					@Pc(446) int local446;
					@Pc(475) Class1_Sub1_Sub1 local475;
					if (arg4 == 2) {
						local446 = arg9 + 1 & 0x3;
						@Pc(465) Class1_Sub1_Sub1 local465;
						if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
							local465 = local54.method520(2, arg9 + 4, local9, local19, local31, local41, -1);
							local475 = local54.method520(2, local446, local9, local19, local31, local41, -1);
						} else {
							local465 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9 + 4, arg2, true, 2);
							local475 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, local446, arg2, true, 2);
						}
						arg1.method203(arg8, local51, anIntArray133[local446], local475, local465, anIntArray133[arg9], arg7, local80, arg6, local66);
						if (local54.aBoolean166) {
							arg5.method565(arg7, local54.aBoolean168, arg9, arg4, arg6);
						}
					} else if (arg4 == 3) {
						if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
							local104 = local54.method520(3, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, 3);
						}
						arg1.method203(arg8, local51, 0, null, local104, anIntArray132[arg9], arg7, local80, arg6, local66);
						if (local54.aBoolean166) {
							arg5.method565(arg7, local54.aBoolean168, arg9, arg4, arg6);
						}
					} else if (arg4 == 9) {
						if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
							local104 = local54.method520(arg4, arg9, local9, local19, local31, local41, -1);
						} else {
							local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, arg9, arg2, true, arg4);
						}
						arg1.method205(arg6, 0, arg8, 1, local104, local80, 1, local51, arg7, local66);
						if (local54.aBoolean166) {
							arg5.method566(local54.aBoolean168, local54.anInt773, (byte) 1, arg9, local54.anInt777, arg6, arg7);
						}
					} else {
						if (local54.aBoolean167) {
							if (arg9 == 1) {
								local446 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local446;
							} else if (arg9 == 2) {
								local446 = local41;
								local41 = local19;
								local19 = local446;
								local446 = local31;
								local31 = local9;
								local9 = local446;
							} else if (arg9 == 3) {
								local446 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local446;
							}
						}
						if (arg4 == 4) {
							if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
								local104 = local54.method520(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, 0, arg2, true, 4);
							}
							arg1.method204(local51, 0, local80, local66, 0, arg8, arg6, local104, arg7, arg9 * 512, anIntArray133[arg9]);
						} else if (arg4 == 5) {
							local446 = 16;
							local200 = arg1.method221(arg8, arg7, arg6);
							if (local200 > 0) {
								local446 = Class44.method519(local200 >> 14 & 0x7FFF).anInt763;
							}
							if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
								local475 = local54.method520(4, 0, local9, local19, local31, local41, -1);
							} else {
								local475 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, 0, arg2, true, 4);
							}
							arg1.method204(local51, anIntArray140[arg9] * local446, local80, local66, anIntArray134[arg9] * local446, arg8, arg6, local475, arg7, arg9 * 512, anIntArray133[arg9]);
						} else if (arg4 == 6) {
							if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
								local104 = local54.method520(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, 0, arg2, true, 4);
							}
							arg1.method204(local51, 0, local80, local66, 0, arg8, arg6, local104, arg7, arg9, 256);
						} else if (arg4 == 7) {
							if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
								local104 = local54.method520(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, 0, arg2, true, 4);
							}
							arg1.method204(local51, 0, local80, local66, 0, arg8, arg6, local104, arg7, arg9, 512);
						} else if (arg4 == 8) {
							if (local54.anInt775 == -1 && local54.anIntArray193 == null) {
								local104 = local54.method520(4, 0, local9, local19, local31, local41, -1);
							} else {
								local104 = new Class1_Sub1_Sub1_Sub4(723, local41, local31, local54.anInt775, local19, local9, 0, arg2, true, 4);
							}
							arg1.method204(local51, 0, local80, local66, 0, arg8, arg6, local104, arg7, arg9, 768);
						}
					}
				}
			}
		} catch (@Pc(1014) RuntimeException local1014) {
			signlink.reporterror("57363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1014.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "<init>", descriptor = "([[[BIII[[[I)V")
	public Class29(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][][] arg4) {
		try {
			anInt632 = 99;
			this.anInt633 = arg3;
			this.anInt634 = arg1;
			this.anIntArrayArrayArray5 = arg4;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt633][this.anInt634];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt633][this.anInt634];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt633][this.anInt634];
			@Pc(55) int local55 = 19 / arg2;
			this.aByteArrayArrayArray4 = new byte[4][this.anInt633][this.anInt634];
			this.anIntArrayArrayArray6 = new int[4][this.anInt633 + 1][this.anInt634 + 1];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt633 + 1][this.anInt634 + 1];
			this.anIntArrayArray14 = new int[this.anInt633 + 1][this.anInt634 + 1];
			this.anIntArray135 = new int[this.anInt634];
			this.anIntArray136 = new int[this.anInt634];
			this.anIntArray137 = new int[this.anInt634];
			this.anIntArray138 = new int[this.anInt634];
			this.anIntArray139 = new int[this.anInt634];
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("82813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(ZILclient!FKUDHMAZ;[B[Lclient!ZGDLGUZR;I)V")
	public void method415(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class50[] arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, 0);
			@Pc(9) int local9 = -1;
			while (true) {
				@Pc(21) int local21 = local7.method169();
				if (local21 == 0) {
					return;
				}
				local9 += local21;
				@Pc(29) int local29 = 0;
				while (true) {
					@Pc(32) int local32 = local7.method169();
					if (local32 == 0) {
						break;
					}
					local29 += local32 - 1;
					@Pc(44) int local44 = local29 & 0x3F;
					@Pc(50) int local50 = local29 >> 6 & 0x3F;
					@Pc(54) int local54 = local29 >> 12;
					@Pc(57) int local57 = local7.method155();
					@Pc(61) int local61 = local57 >> 2;
					@Pc(65) int local65 = local57 & 0x3;
					@Pc(69) int local69 = local50 + arg4;
					@Pc(73) int local73 = local44 + arg0;
					if (local69 > 0 && local73 > 0 && local69 < 103 && local73 < 103) {
						@Pc(85) int local85 = local54;
						if ((this.aByteArrayArrayArray1[1][local69][local73] & 0x2) == 2) {
							local85 = local54 - 1;
						}
						@Pc(100) Class50 local100 = null;
						if (local85 >= 0) {
							local100 = arg3[local85];
						}
						this.method419(local65, local73, local61, local54, local9, local69, local100, arg1);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("91700, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(III)I")
	private int method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(8) int local8 = arg1; local8 <= arg1 + arg3; local8++) {
				for (@Pc(12) int local12 = arg0; local12 <= arg0 + arg2; local12++) {
					if (local12 >= 0 && local12 < this.anInt633 && local8 >= 0 && local8 < this.anInt634) {
						this.aByteArrayArrayArray5[0][local12][local8] = 127;
						if (local12 == arg0 && local12 > 0) {
							this.anIntArrayArrayArray5[0][local12][local8] = this.anIntArrayArrayArray5[0][local12 - 1][local8];
						}
						if (local12 == arg0 + arg2 && local12 < this.anInt633 - 1) {
							this.anIntArrayArrayArray5[0][local12][local8] = this.anIntArrayArrayArray5[0][local12 + 1][local8];
						}
						if (local8 == arg1 && local8 > 0) {
							this.anIntArrayArrayArray5[0][local12][local8] = this.anIntArrayArrayArray5[0][local12][local8 - 1];
						}
						if (local8 == arg1 + arg3 && local8 < this.anInt634 - 1) {
							this.anIntArrayArrayArray5[0][local12][local8] = this.anIntArrayArrayArray5[0][local12][local8 + 1];
						}
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("30266, " + arg0 + ", " + -10774 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIIIILclient!ZGDLGUZR;BLclient!FKUDHMAZ;)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class50 arg6, @OriginalArg(8) Class9 arg7) {
		try {
			if (aBoolean123 && (this.aByteArrayArrayArray1[0][arg5][arg1] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray1[arg3][arg5][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method425((byte) 5, arg3, arg5, arg1) != anInt629) {
					return;
				}
			}
			if (arg3 < anInt632) {
				anInt632 = arg3;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray5[arg3][arg5][arg1];
			@Pc(60) int local60 = this.anIntArrayArrayArray5[arg3][arg5 + 1][arg1];
			@Pc(73) int local73 = this.anIntArrayArrayArray5[arg3][arg5 + 1][arg1 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray5[arg3][arg5][arg1 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(101) Class44 local101 = Class44.method519(arg4);
			@Pc(113) int local113 = arg5 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!local101.aBoolean163) {
				local113 += Integer.MIN_VALUE;
			}
			@Pc(127) byte local127 = (byte) ((arg0 << 6) + arg2);
			@Pc(156) Class1_Sub1_Sub1 local156;
			if (arg2 != 22) {
				@Pc(254) int local254;
				if (arg2 == 10 || arg2 == 11) {
					if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
						local156 = local101.method520(10, arg0, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, 10);
					}
					if (local156 != null) {
						@Pc(241) int local241 = 0;
						if (arg2 == 11) {
							local241 += 256;
						}
						@Pc(257) int local257;
						if (arg0 == 1 || arg0 == 3) {
							local254 = local101.anInt777;
							local257 = local101.anInt773;
						} else {
							local254 = local101.anInt773;
							local257 = local101.anInt777;
						}
						if (arg7.method205(arg1, local241, arg3, local254, local156, local127, local257, local94, arg5, local113) && local101.aBoolean160) {
							@Pc(288) Class1_Sub1_Sub1_Sub5 local288;
							if (local156 instanceof Class1_Sub1_Sub1_Sub5) {
								local288 = (Class1_Sub1_Sub1_Sub5) local156;
							} else {
								local288 = local101.method520(10, arg0, local49, local60, local73, local84, -1);
							}
							if (local288 != null) {
								for (@Pc(304) int local304 = 0; local304 <= local254; local304++) {
									for (@Pc(308) int local308 = 0; local308 <= local257; local308++) {
										@Pc(315) int local315 = local288.anInt603 / 4;
										if (local315 > 30) {
											local315 = 30;
										}
										if (local315 > this.aByteArrayArrayArray5[arg3][arg5 + local304][arg1 + local308]) {
											this.aByteArrayArrayArray5[arg3][arg5 + local304][arg1 + local308] = (byte) local315;
										}
									}
								}
							}
						}
					}
					if (local101.aBoolean166 && arg6 != null) {
						arg6.method566(local101.aBoolean168, local101.anInt773, (byte) 1, arg0, local101.anInt777, arg1, arg5);
					}
				} else if (arg2 >= 12) {
					if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
						local156 = local101.method520(arg2, arg0, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, arg2);
					}
					arg7.method205(arg1, 0, arg3, 1, local156, local127, 1, local94, arg5, local113);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x924;
					}
					if (local101.aBoolean166 && arg6 != null) {
						arg6.method566(local101.aBoolean168, local101.anInt773, (byte) 1, arg0, local101.anInt777, arg1, arg5);
					}
				} else if (arg2 == 0) {
					if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
						local156 = local101.method520(0, arg0, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, 0);
					}
					arg7.method203(arg3, local94, 0, null, local156, anIntArray133[arg0], arg5, local127, arg1, local113);
					if (arg0 == 0) {
						if (local101.aBoolean160) {
							this.aByteArrayArrayArray5[arg3][arg5][arg1] = 50;
							this.aByteArrayArrayArray5[arg3][arg5][arg1 + 1] = 50;
						}
						if (local101.aBoolean159) {
							this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x249;
						}
					} else if (arg0 == 1) {
						if (local101.aBoolean160) {
							this.aByteArrayArrayArray5[arg3][arg5][arg1 + 1] = 50;
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1 + 1] = 50;
						}
						if (local101.aBoolean159) {
							this.anIntArrayArrayArray6[arg3][arg5][arg1 + 1] |= 0x492;
						}
					} else if (arg0 == 2) {
						if (local101.aBoolean160) {
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1] = 50;
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1 + 1] = 50;
						}
						if (local101.aBoolean159) {
							this.anIntArrayArrayArray6[arg3][arg5 + 1][arg1] |= 0x249;
						}
					} else if (arg0 == 3) {
						if (local101.aBoolean160) {
							this.aByteArrayArrayArray5[arg3][arg5][arg1] = 50;
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1] = 50;
						}
						if (local101.aBoolean159) {
							this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x492;
						}
					}
					if (local101.aBoolean166 && arg6 != null) {
						arg6.method565(arg5, local101.aBoolean168, arg0, arg2, arg1);
					}
					if (local101.anInt763 != 16) {
						arg7.method211(local101.anInt763, arg3, arg1, arg5);
					}
				} else if (arg2 == 1) {
					if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
						local156 = local101.method520(1, arg0, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, 1);
					}
					arg7.method203(arg3, local94, 0, null, local156, anIntArray132[arg0], arg5, local127, arg1, local113);
					if (local101.aBoolean160) {
						if (arg0 == 0) {
							this.aByteArrayArrayArray5[arg3][arg5][arg1 + 1] = 50;
						} else if (arg0 == 1) {
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1 + 1] = 50;
						} else if (arg0 == 2) {
							this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1] = 50;
						} else if (arg0 == 3) {
							this.aByteArrayArrayArray5[arg3][arg5][arg1] = 50;
						}
					}
					if (local101.aBoolean166 && arg6 != null) {
						arg6.method565(arg5, local101.aBoolean168, arg0, arg2, arg1);
					}
				} else {
					@Pc(865) int local865;
					@Pc(894) Class1_Sub1_Sub1 local894;
					if (arg2 == 2) {
						local865 = arg0 + 1 & 0x3;
						@Pc(884) Class1_Sub1_Sub1 local884;
						if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
							local884 = local101.method520(2, arg0 + 4, local49, local60, local73, local84, -1);
							local894 = local101.method520(2, local865, local49, local60, local73, local84, -1);
						} else {
							local884 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0 + 4, arg4, true, 2);
							local894 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, local865, arg4, true, 2);
						}
						arg7.method203(arg3, local94, anIntArray133[local865], local894, local884, anIntArray133[arg0], arg5, local127, arg1, local113);
						if (local101.aBoolean159) {
							if (arg0 == 0) {
								this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x249;
								this.anIntArrayArrayArray6[arg3][arg5][arg1 + 1] |= 0x492;
							} else if (arg0 == 1) {
								this.anIntArrayArrayArray6[arg3][arg5][arg1 + 1] |= 0x492;
								this.anIntArrayArrayArray6[arg3][arg5 + 1][arg1] |= 0x249;
							} else if (arg0 == 2) {
								this.anIntArrayArrayArray6[arg3][arg5 + 1][arg1] |= 0x249;
								this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x492;
							} else if (arg0 == 3) {
								this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x492;
								this.anIntArrayArrayArray6[arg3][arg5][arg1] |= 0x249;
							}
						}
						if (local101.aBoolean166 && arg6 != null) {
							arg6.method565(arg5, local101.aBoolean168, arg0, arg2, arg1);
						}
						if (local101.anInt763 != 16) {
							arg7.method211(local101.anInt763, arg3, arg1, arg5);
						}
					} else if (arg2 == 3) {
						if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
							local156 = local101.method520(3, arg0, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, 3);
						}
						arg7.method203(arg3, local94, 0, null, local156, anIntArray132[arg0], arg5, local127, arg1, local113);
						if (local101.aBoolean160) {
							if (arg0 == 0) {
								this.aByteArrayArrayArray5[arg3][arg5][arg1 + 1] = 50;
							} else if (arg0 == 1) {
								this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1 + 1] = 50;
							} else if (arg0 == 2) {
								this.aByteArrayArrayArray5[arg3][arg5 + 1][arg1] = 50;
							} else if (arg0 == 3) {
								this.aByteArrayArrayArray5[arg3][arg5][arg1] = 50;
							}
						}
						if (local101.aBoolean166 && arg6 != null) {
							arg6.method565(arg5, local101.aBoolean168, arg0, arg2, arg1);
						}
					} else if (arg2 == 9) {
						if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
							local156 = local101.method520(arg2, arg0, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, arg2);
						}
						arg7.method205(arg1, 0, arg3, 1, local156, local127, 1, local94, arg5, local113);
						if (local101.aBoolean166 && arg6 != null) {
							arg6.method566(local101.aBoolean168, local101.anInt773, (byte) 1, arg0, local101.anInt777, arg1, arg5);
						}
					} else {
						if (local101.aBoolean167) {
							if (arg0 == 1) {
								local865 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local865;
							} else if (arg0 == 2) {
								local865 = local84;
								local84 = local60;
								local60 = local865;
								local865 = local73;
								local73 = local49;
								local49 = local865;
							} else if (arg0 == 3) {
								local865 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local865;
							}
						}
						if (arg2 == 4) {
							if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
								local156 = local101.method520(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, 0, arg4, true, 4);
							}
							arg7.method204(local94, 0, local127, local113, 0, arg3, arg1, local156, arg5, arg0 * 512, anIntArray133[arg0]);
						} else if (arg2 == 5) {
							local865 = 16;
							local254 = arg7.method221(arg3, arg5, arg1);
							if (local254 > 0) {
								local865 = Class44.method519(local254 >> 14 & 0x7FFF).anInt763;
							}
							if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
								local894 = local101.method520(4, 0, local49, local60, local73, local84, -1);
							} else {
								local894 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, 0, arg4, true, 4);
							}
							arg7.method204(local94, anIntArray140[arg0] * local865, local127, local113, anIntArray134[arg0] * local865, arg3, arg1, local894, arg5, arg0 * 512, anIntArray133[arg0]);
						} else if (arg2 == 6) {
							if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
								local156 = local101.method520(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, 0, arg4, true, 4);
							}
							arg7.method204(local94, 0, local127, local113, 0, arg3, arg1, local156, arg5, arg0, 256);
						} else if (arg2 == 7) {
							if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
								local156 = local101.method520(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, 0, arg4, true, 4);
							}
							arg7.method204(local94, 0, local127, local113, 0, arg3, arg1, local156, arg5, arg0, 512);
						} else if (arg2 == 8) {
							if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
								local156 = local101.method520(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, 0, arg4, true, 4);
							}
							arg7.method204(local94, 0, local127, local113, 0, arg3, arg1, local156, arg5, arg0, 768);
						}
					}
				}
			} else if (!aBoolean123 || local101.aBoolean163 || local101.aBoolean164) {
				if (local101.anInt775 == -1 && local101.anIntArray193 == null) {
					local156 = local101.method520(22, arg0, local49, local60, local73, local84, -1);
				} else {
					local156 = new Class1_Sub1_Sub1_Sub4(723, local84, local73, local101.anInt775, local60, local49, arg0, arg4, true, 22);
				}
				arg7.method201(arg3, arg5, local127, local156, local94, local113, arg1);
				if (local101.aBoolean166 && local101.aBoolean163 && arg6 != null) {
					arg6.method567(arg5, arg1);
				}
			}
		} catch (@Pc(1639) RuntimeException local1639) {
			signlink.reporterror("9309, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 1 + ", " + arg7 + ", " + local1639.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "b", descriptor = "(II)I")
	private int method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (local7 = 0; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2 + local3][arg0 + local7] = 0;
				}
			}
			if (arg2 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2][arg0 + local7] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 + local7];
				}
			}
			if (arg0 > 0) {
				for (local7 = 1; local7 < 8; local7++) {
					this.anIntArrayArrayArray5[arg1][arg2 + local7][arg0] = this.anIntArrayArrayArray5[arg1][arg2 + local7][arg0 - 1];
				}
			}
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
			} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray5[arg1][arg2][arg0] = this.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("98530, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(IIIILclient!EYMNCFMK;III)V")
	private void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(27) int local27;
			if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
				this.aByteArrayArrayArray1[arg6][arg2][arg3] = 0;
				while (true) {
					local27 = arg4.method155();
					if (local27 == 0) {
						if (arg6 == 0) {
							this.anIntArrayArrayArray5[0][arg2][arg3] = -method428(arg2 + arg1 + 932731, arg3 + 556238 + arg5) * 8;
							return;
						} else {
							this.anIntArrayArrayArray5[arg6][arg2][arg3] = this.anIntArrayArrayArray5[arg6 - 1][arg2][arg3] - 240;
							return;
						}
					}
					if (local27 == 1) {
						@Pc(81) int local81 = arg4.method155();
						if (local81 == 1) {
							local81 = 0;
						}
						if (arg6 == 0) {
							this.anIntArrayArrayArray5[0][arg2][arg3] = -local81 * 8;
							return;
						}
						this.anIntArrayArrayArray5[arg6][arg2][arg3] = this.anIntArrayArrayArray5[arg6 - 1][arg2][arg3] - local81 * 8;
						return;
					}
					if (local27 <= 49) {
						this.aByteArrayArrayArray6[arg6][arg2][arg3] = arg4.method156();
						this.aByteArrayArrayArray2[arg6][arg2][arg3] = (byte) ((local27 - 2) / 4);
						this.aByteArrayArrayArray4[arg6][arg2][arg3] = (byte) (local27 + arg0 - 2 & 0x3);
					} else if (local27 <= 81) {
						this.aByteArrayArrayArray1[arg6][arg2][arg3] = (byte) (local27 - 49);
					} else {
						this.aByteArrayArrayArray3[arg6][arg2][arg3] = (byte) (local27 - 81);
					}
				}
			} else {
				while (true) {
					local27 = arg4.method155();
					if (local27 == 0) {
						return;
					}
					if (local27 == 1) {
						arg4.method155();
						return;
					}
					if (local27 <= 49) {
						arg4.method155();
					}
				}
			}
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("20262, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 5 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(BIII)I")
	private int method425(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			if ((this.aByteArrayArrayArray1[arg1][arg2][arg3] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("45995, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(II[BILclient!FKUDHMAZ;III[Lclient!ZGDLGUZR;II)V")
	public void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class50[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, 0);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local7.method169();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.method169();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.method155();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg0 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg9 && local45 < arg9 + 8) {
						@Pc(88) Class44 local88 = Class44.method519(local19);
						@Pc(105) int local105 = arg8 + Class42.method507(local88.anInt773, local51 & 0x7, local45 & 0x7, local66, local88.anInt777, arg6);
						@Pc(122) int local122 = arg1 + Class42.method508(local45 & 0x7, local66, local51 & 0x7, local88.anInt773, arg6, local88.anInt777);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg3;
							if ((this.aByteArrayArrayArray1[1][local105][local122] & 0x2) == 2) {
								local134 = arg3 - 1;
							}
							@Pc(149) Class50 local149 = null;
							if (local134 >= 0) {
								local149 = arg7[local134];
							}
							this.method419(local66 + arg6 & 0x3, local122, local62, arg3, local19, local105, local149, arg4);
						}
					}
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("87405, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -644 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([Lclient!ZGDLGUZR;IIII[BB)V")
	public void method433(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) byte arg6) {
		try {
			if (this.aByte17 == 9) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt631 = -399;
			}
			@Pc(22) int local22;
			for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						if (arg1 + local18 > 0 && arg1 + local18 < 103 && arg2 + local22 > 0 && arg2 + local22 < 103) {
							arg0[local14].anIntArrayArray21[arg1 + local18][arg2 + local22] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(76) Class1_Sub1_Sub3 local76 = new Class1_Sub1_Sub3(arg5, 0);
			for (local22 = 0; local22 < 4; local22++) {
				for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
					for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
						this.method423(0, arg4, local82 + arg1, local86 + arg2, local76, arg3, local22);
					}
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("87914, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "([Lclient!ZGDLGUZR;IIIIBII[BI)V")
	public void method434(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
				for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
					if (arg8 + local8 > 0 && arg8 + local8 < 103 && arg1 + local12 > 0 && arg1 + local12 < 103) {
						arg0[arg6].anIntArrayArray21[arg8 + local8][arg1 + local12] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(62) Class1_Sub1_Sub3 local62 = new Class1_Sub1_Sub3(arg7, 0);
			for (@Pc(64) int local64 = 0; local64 < 4; local64++) {
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						if (local64 == arg5 && local68 >= arg4 && local68 < arg4 + 8 && local72 >= arg3 && local72 < arg3 + 8) {
							this.method423(arg2, 0, arg8 + Class42.method505(local68 & 0x7, local72 & 0x7, arg2), arg1 + Class42.method506(arg2, local68 & 0x7, local72 & 0x7), local62, 0, arg6);
						} else {
							this.method423(0, 0, -1, -1, local62, 0, 0);
						}
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("44023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 5 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMIXOPWJ", name = "a", descriptor = "(Lclient!FKUDHMAZ;B[Lclient!ZGDLGUZR;)V")
	public void method436(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class50[] arg1) {
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
								arg1[local27].method567(local7, local11);
							}
						}
					}
				}
			}
			anInt627 += (int) (Math.random() * 5.0D) - 2;
			if (anInt627 < -8) {
				anInt627 = -8;
			}
			if (anInt627 > 8) {
				anInt627 = 8;
			}
			anInt630 += (int) (Math.random() * 5.0D) - 2;
			if (anInt630 < -16) {
				anInt630 = -16;
			}
			if (anInt630 > 16) {
				anInt630 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray5[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt634 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt633 - 1; local145++) {
						local169 = this.anIntArrayArrayArray5[local7][local145 + 1][local141] - this.anIntArrayArrayArray5[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray5[local7][local145][local141 + 1] - this.anIntArrayArrayArray5[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray14[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt634; local145++) {
					this.anIntArray135[local145] = 0;
					this.anIntArray136[local145] = 0;
					this.anIntArray137[local145] = 0;
					this.anIntArray138[local145] = 0;
					this.anIntArray139[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt633 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt634; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt633) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class14 local378 = Class14.aClass14Array1[local210 - 1];
								this.anIntArray135[local191] += local378.anInt405;
								this.anIntArray136[local191] += local378.anInt403;
								this.anIntArray137[local191] += local378.anInt404;
								this.anIntArray138[local191] += local378.anInt406;
								local419 = this.anIntArray139[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt633) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class14 local451 = Class14.aClass14Array1[local214 - 1];
								this.anIntArray135[local191] -= local451.anInt405;
								this.anIntArray136[local191] -= local451.anInt403;
								this.anIntArray137[local191] -= local451.anInt404;
								this.anIntArray138[local191] -= local451.anInt406;
								local419 = this.anIntArray139[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt633 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt634 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt634) {
								local204 += this.anIntArray135[local527];
								local210 += this.anIntArray136[local527];
								local214 += this.anIntArray137[local527];
								local220 += this.anIntArray138[local527];
								local236 += this.anIntArray139[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt634) {
								local204 -= this.anIntArray135[local572];
								local210 -= this.anIntArray136[local572];
								local214 -= this.anIntArray137[local572];
								local220 -= this.anIntArray138[local572];
								local236 -= this.anIntArray139[local572];
							}
							if (local284 >= 1 && local284 < this.anInt634 - 1 && (!aBoolean123 || (this.aByteArrayArrayArray1[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method425((byte) 5, local7, local169, local284) == anInt629)) {
								if (local7 < anInt632) {
									anInt632 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray6[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray5[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray5[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray5[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray5[local7][local169][local284 + 1];
									@Pc(737) int local737 = this.anIntArrayArray14[local169][local284];
									@Pc(746) int local746 = this.anIntArrayArray14[local169 + 1][local284];
									@Pc(757) int local757 = this.anIntArrayArray14[local169 + 1][local284 + 1];
									@Pc(766) int local766 = this.anIntArrayArray14[local169][local284 + 1];
									@Pc(768) int local768 = -1;
									@Pc(770) int local770 = -1;
									@Pc(778) int local778;
									@Pc(782) int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										@Pc(786) int local786 = local214 / local236;
										local768 = this.method416(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt627 & 0xFF;
										local786 += anInt630;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method416(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray2[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class14.aClass14Array1[local682 - 1].aBoolean73) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray6[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class1_Sub1_Sub2_Sub1.anIntArray12[method424(local770, 96)];
									}
									if (local682 == 0) {
										arg0.method200(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method424(local768, local737), method424(local768, local746), method424(local768, local757), method424(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray2[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray4[local7][local169][local284];
										@Pc(941) Class14 local941 = Class14.aClass14Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt401;
										@Pc(952) int local952;
										@Pc(950) int local950;
										if (local944 >= 0) {
											local950 = Class1_Sub1_Sub2_Sub1.method51(local944);
											local952 = -1;
										} else if (local941.anInt400 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class1_Sub1_Sub2_Sub1.anIntArray12[this.method420(local941.anInt407, 96)];
										} else {
											local952 = this.method416(local941.anInt402, local941.anInt403, local941.anInt404);
											local950 = Class1_Sub1_Sub2_Sub1.anIntArray12[this.method420(local941.anInt407, 96)];
										}
										arg0.method200(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method424(local768, local737), method424(local768, local746), method424(local768, local757), method424(local768, local766), this.method420(local952, local737), this.method420(local952, local746), this.method420(local952, local757), this.method420(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt634 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt633 - 1; local204++) {
						arg0.method199(local7, local204, local191, this.method425((byte) 5, local7, local204, local191));
					}
				}
			}
			arg0.method226();
			for (local11 = 0; local11 < this.anInt633; local11++) {
				for (local27 = 0; local27 < this.anInt634; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method197(local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1131) int local1131 = 2;
			@Pc(1133) int local1133 = 4;
			for (@Pc(1135) int local1135 = 0; local1135 < 4; local1135++) {
				if (local1135 > 0) {
					local27 <<= 0x3;
					local1131 <<= 0x3;
					local1133 <<= 0x3;
				}
				for (@Pc(1153) int local1153 = 0; local1153 <= local1135; local1153++) {
					for (local133 = 0; local133 <= this.anInt634; local133++) {
						for (local139 = 0; local139 <= this.anInt633; local139++) {
							if ((this.anIntArrayArrayArray6[local1153][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1153;
								local191 = local1153;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1153][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt634 && (this.anIntArrayArrayArray6[local1153][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1135) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local139][local141];
									Class9.method198(local220, local214, local145 * 128 + 128, local139 * 128, 1, local139 * 128, local141 * 128, local1135);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1153][local139][local133] & local1131) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1153;
								local191 = local1153;
								while (local141 > 0 && (this.anIntArrayArrayArray6[local1153][local141 - 1][local133] & local1131) != 0) {
									local141--;
								}
								while (local145 < this.anInt633 && (this.anIntArrayArrayArray6[local1153][local145 + 1][local133] & local1131) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local169 - 1][local204][local133] & local1131) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1135) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray6[local191 + 1][local204][local133] & local1131) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray5[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray5[local169][local141][local133];
									Class9.method198(local220, local214, local133 * 128, local141 * 128, 2, local145 * 128 + 128, local133 * 128, local1135);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray6[local236][local284][local133] &= ~local1131;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray6[local1153][local139][local133] & local1133) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray6[local1153][local139][local169 - 1] & local1133) != 0) {
									local169--;
								}
								while (local191 < this.anInt634 && (this.anIntArrayArrayArray6[local1153][local139][local191 + 1] & local1133) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1153][local141 - 1][local204] & local1133) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt633) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray6[local1153][local145 + 1][local204] & local1133) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray5[local1153][local141][local169];
									Class9.method198(local204, local204, local191 * 128 + 128, local141 * 128, 4, local145 * 128 + 128, local169 * 128, local1135);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray6[local1153][local210][local214] &= ~local1133;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1768) RuntimeException local1768) {
			signlink.reporterror("21896, " + arg0 + ", " + -126 + ", " + arg1 + ", " + local1768.toString());
			throw new RuntimeException();
		}
	}
}
