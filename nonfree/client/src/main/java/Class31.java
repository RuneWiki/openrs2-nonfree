import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NSTMHEDV")
public final class Class31 {

	@OriginalMember(owner = "client!NSTMHEDV", name = "g", descriptor = "I")
	public static int anInt504;

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "I")
	private static int anInt502 = 49845;

	@OriginalMember(owner = "client!NSTMHEDV", name = "c", descriptor = "I")
	private static int anInt503 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!NSTMHEDV", name = "h", descriptor = "[I")
	private static final int[] anIntArray106 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!NSTMHEDV", name = "j", descriptor = "I")
	private static int anInt505 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!NSTMHEDV", name = "k", descriptor = "Z")
	public static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "l", descriptor = "I")
	public static int anInt506 = 99;

	@OriginalMember(owner = "client!NSTMHEDV", name = "o", descriptor = "[I")
	private static final int[] anIntArray107 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!NSTMHEDV", name = "p", descriptor = "[I")
	private static final int[] anIntArray108 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!NSTMHEDV", name = "v", descriptor = "I")
	private static int anInt509 = 171;

	@OriginalMember(owner = "client!NSTMHEDV", name = "w", descriptor = "Z")
	private static boolean aBoolean131 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "D", descriptor = "B")
	private static byte aByte23 = -102;

	@OriginalMember(owner = "client!NSTMHEDV", name = "F", descriptor = "I")
	private static int anInt511 = 7;

	@OriginalMember(owner = "client!NSTMHEDV", name = "G", descriptor = "[I")
	private static final int[] anIntArray114 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!NSTMHEDV", name = "H", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "I", descriptor = "Z")
	private static boolean aBoolean133 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "f", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "i", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "t", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "E", descriptor = "I")
	private int anInt510 = -107;

	@OriginalMember(owner = "client!NSTMHEDV", name = "K", descriptor = "Z")
	private boolean aBoolean134 = true;

	@OriginalMember(owner = "client!NSTMHEDV", name = "m", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!NSTMHEDV", name = "n", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!NSTMHEDV", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!NSTMHEDV", name = "J", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!NSTMHEDV", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!NSTMHEDV", name = "b", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!NSTMHEDV", name = "d", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!NSTMHEDV", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!NSTMHEDV", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!NSTMHEDV", name = "r", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!NSTMHEDV", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!NSTMHEDV", name = "x", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!NSTMHEDV", name = "y", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!NSTMHEDV", name = "z", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!NSTMHEDV", name = "A", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!NSTMHEDV", name = "B", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(ZLclient!DNRIFKTO;Lclient!MWSOISVX;)V")
	public static void method297(@OriginalArg(1) Class2_Sub1_Sub4 arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		try {
			@Pc(3) int local3 = -1;
			while (true) {
				@Pc(10) int local10 = arg0.method108();
				if (local10 == 0) {
					return;
				}
				local3 += local10;
				@Pc(19) Class41 local19 = Class41.method410(local3);
				local19.method413(arg1);
				while (true) {
					@Pc(26) int local26 = arg0.method108();
					if (local26 == 0) {
						break;
					}
					arg0.method94();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("1138, " + true + ", " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "b", descriptor = "(II)I")
	private static int method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method307(arg0 + 45365, arg1 + 91923, 4) + (method307(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method307(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(IIII)I")
	private static int method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class2_Sub1_Sub1_Sub1.anIntArray6[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(IIIIIIILclient!URWDWMOD;Lclient!XSMXYXEY;I[[[I)V")
	public static void method304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) Class47 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][][] arg9) {
		try {
			@Pc(9) int local9 = arg9[arg5][arg4][arg2];
			@Pc(19) int local19 = arg9[arg5][arg4 + 1][arg2];
			@Pc(31) int local31 = arg9[arg5][arg4 + 1][arg2 + 1];
			@Pc(41) int local41 = arg9[arg5][arg4][arg2 + 1];
			@Pc(51) int local51 = local9 + local19 + local31 + local41 >> 2;
			@Pc(57) Class41 local57 = Class41.method410(arg3);
			@Pc(69) int local69 = arg4 + (arg2 << 7) + (arg3 << 14) + 1073741824;
			if (!local57.aBoolean177) {
				local69 += Integer.MIN_VALUE;
			}
			@Pc(83) byte local83 = (byte) ((arg0 << 6) + arg8);
			@Pc(103) Class2_Sub1_Sub2 local103;
			if (arg8 == 22) {
				if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
					local103 = local57.method411(22, arg0, local9, local19, local31, local41, -1);
				} else {
					local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, 22);
				}
				arg7.method513(local69, local103, local83, aBoolean131, arg4, arg2, arg1, local51);
				if (local57.aBoolean175 && local57.aBoolean177) {
					arg6.method468(arg2, aByte23, arg4);
				}
			} else {
				@Pc(199) int local199;
				if (arg8 == 10 || arg8 == 11) {
					if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
						local103 = local57.method411(10, arg0, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, 10);
					}
					if (local103 != null) {
						@Pc(186) int local186 = 0;
						if (arg8 == 11) {
							local186 += 256;
						}
						@Pc(202) int local202;
						if (arg0 == 1 || arg0 == 3) {
							local199 = local57.anInt610;
							local202 = local57.anInt611;
						} else {
							local199 = local57.anInt611;
							local202 = local57.anInt610;
						}
						arg7.method517(arg4, local199, local69, local103, local186, local202, local51, arg1, local83, arg2);
					}
					if (local57.aBoolean175) {
						arg6.method467(local57.anInt610, arg0, local57.anInt611, local57.aBoolean176, arg2, arg4);
					}
				} else if (arg8 >= 12) {
					if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
						local103 = local57.method411(arg8, arg0, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, arg8);
					}
					arg7.method517(arg4, 1, local69, local103, 0, 1, local51, arg1, local83, arg2);
					if (local57.aBoolean175) {
						arg6.method467(local57.anInt610, arg0, local57.anInt611, local57.aBoolean176, arg2, arg4);
					}
				} else if (arg8 == 0) {
					if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
						local103 = local57.method411(0, arg0, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, 0);
					}
					arg7.method515(local69, local83, arg4, local103, null, arg1, arg2, anIntArray108[arg0], 0, local51);
					if (local57.aBoolean175) {
						arg6.method466(local57.aBoolean176, arg8, arg0, arg4, arg2);
					}
				} else if (arg8 == 1) {
					if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
						local103 = local57.method411(1, arg0, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, 1);
					}
					arg7.method515(local69, local83, arg4, local103, null, arg1, arg2, anIntArray114[arg0], 0, local51);
					if (local57.aBoolean175) {
						arg6.method466(local57.aBoolean176, arg8, arg0, arg4, arg2);
					}
				} else {
					@Pc(445) int local445;
					@Pc(474) Class2_Sub1_Sub2 local474;
					if (arg8 == 2) {
						local445 = arg0 + 1 & 0x3;
						@Pc(464) Class2_Sub1_Sub2 local464;
						if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
							local464 = local57.method411(2, arg0 + 4, local9, local19, local31, local41, -1);
							local474 = local57.method411(2, local445, local9, local19, local31, local41, -1);
						} else {
							local464 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0 + 4, local31, arg3, local41, true, 2);
							local474 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, local445, local31, arg3, local41, true, 2);
						}
						arg7.method515(local69, local83, arg4, local464, local474, arg1, arg2, anIntArray108[arg0], anIntArray108[local445], local51);
						if (local57.aBoolean175) {
							arg6.method466(local57.aBoolean176, arg8, arg0, arg4, arg2);
						}
					} else if (arg8 == 3) {
						if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
							local103 = local57.method411(3, arg0, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, 3);
						}
						arg7.method515(local69, local83, arg4, local103, null, arg1, arg2, anIntArray114[arg0], 0, local51);
						if (local57.aBoolean175) {
							arg6.method466(local57.aBoolean176, arg8, arg0, arg4, arg2);
						}
					} else if (arg8 == 9) {
						if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
							local103 = local57.method411(arg8, arg0, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, arg0, local31, arg3, local41, true, arg8);
						}
						arg7.method517(arg4, 1, local69, local103, 0, 1, local51, arg1, local83, arg2);
						if (local57.aBoolean175) {
							arg6.method467(local57.anInt610, arg0, local57.anInt611, local57.aBoolean176, arg2, arg4);
						}
					} else {
						if (local57.aBoolean171) {
							if (arg0 == 1) {
								local445 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local445;
							} else if (arg0 == 2) {
								local445 = local41;
								local41 = local19;
								local19 = local445;
								local445 = local31;
								local31 = local9;
								local9 = local445;
							} else if (arg0 == 3) {
								local445 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local445;
							}
						}
						if (arg8 == 4) {
							if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
								local103 = local57.method411(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, 0, local31, arg3, local41, true, 4);
							}
							arg7.method516(arg0 * 512, 0, local83, arg1, arg4, anInt509, anIntArray108[arg0], local51, arg2, 0, local103, local69);
						} else if (arg8 == 5) {
							local445 = 16;
							local199 = arg7.method533(arg1, arg4, arg2);
							if (local199 > 0) {
								local445 = Class41.method410(local199 >> 14 & 0x7FFF).anInt605;
							}
							if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
								local474 = local57.method411(4, 0, local9, local19, local31, local41, -1);
							} else {
								local474 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, 0, local31, arg3, local41, true, 4);
							}
							arg7.method516(arg0 * 512, anIntArray106[arg0] * local445, local83, arg1, arg4, anInt509, anIntArray108[arg0], local51, arg2, anIntArray107[arg0] * local445, local474, local69);
						} else if (arg8 == 6) {
							if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
								local103 = local57.method411(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, 0, local31, arg3, local41, true, 4);
							}
							arg7.method516(arg0, 0, local83, arg1, arg4, anInt509, 256, local51, arg2, 0, local103, local69);
						} else if (arg8 == 7) {
							if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
								local103 = local57.method411(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, 0, local31, arg3, local41, true, 4);
							}
							arg7.method516(arg0, 0, local83, arg1, arg4, anInt509, 512, local51, arg2, 0, local103, local69);
						} else if (arg8 == 8) {
							if (local57.anInt621 == -1 && local57.anIntArray164 == null) {
								local103 = local57.method411(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class2_Sub1_Sub2_Sub3(0, local9, local19, local57.anInt621, 0, local31, arg3, local41, true, 4);
							}
							arg7.method516(arg0, 0, local83, arg1, arg4, anInt509, 768, local51, arg2, 0, local103, local69);
						}
					}
				}
			}
		} catch (@Pc(1013) RuntimeException local1013) {
			signlink.reporterror("62649, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1013.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "c", descriptor = "(II)I")
	private static int method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "b", descriptor = "(III)I")
	private static int method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method317(local3, local13);
		@Pc(29) int local29 = method317(local3 + 1, local13);
		@Pc(35) int local35 = method317(local3, local13 + 1);
		@Pc(43) int local43 = method317(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method303(local23, local29, local9, arg2);
		@Pc(55) int local55 = method303(local35, local43, local9, arg2);
		return method303(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "d", descriptor = "(II)I")
	private static int method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!NSTMHEDV", name = "c", descriptor = "(III)Z")
	public static boolean method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(11) Class41 local11 = Class41.method410(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local11.method419(arg0);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("79122, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(I[BII)Z")
	public static boolean method311(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			if (arg2 < anInt511 || arg2 > anInt511) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			@Pc(22) Class2_Sub1_Sub4 local22 = new Class2_Sub1_Sub4(arg1, aBoolean132);
			@Pc(24) int local24 = -1;
			label58: while (true) {
				@Pc(27) int local27 = local22.method108();
				if (local27 == 0) {
					return local3;
				}
				local24 += local27;
				@Pc(35) int local35 = 0;
				@Pc(37) boolean local37 = false;
				while (true) {
					@Pc(42) int local42;
					while (!local37) {
						local42 = local22.method108();
						if (local42 == 0) {
							continue label58;
						}
						local35 += local42 - 1;
						@Pc(64) int local64 = local35 & 0x3F;
						@Pc(70) int local70 = local35 >> 6 & 0x3F;
						@Pc(75) int local75 = local22.method94() >> 2;
						@Pc(79) int local79 = local70 + arg3;
						@Pc(83) int local83 = local64 + arg0;
						if (local79 > 0 && local83 > 0 && local79 < 103 && local83 < 103) {
							@Pc(96) Class41 local96 = Class41.method410(local24);
							if (local75 != 22 || !aBoolean129 || local96.aBoolean177 || local96.aBoolean173) {
								local3 &= local96.method409();
								local37 = true;
							}
						}
					}
					local42 = local22.method108();
					if (local42 == 0) {
						break;
					}
					local22.method94();
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("77656, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "e", descriptor = "(II)I")
	private static int method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method305(arg0 - 1, arg1 - 1) + method305(arg0 + 1, arg1 - 1) + method305(arg0 - 1, arg1 + 1) + method305(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method305(arg0 - 1, arg1) + method305(arg0 + 1, arg1) + method305(arg0, arg1 - 1) + method305(arg0, arg1 + 1);
		@Pc(59) int local59 = method305(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "<init>", descriptor = "(I[[[BB[[[II)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4) {
		try {
			anInt506 = 99;
			this.anInt507 = arg4;
			this.anInt508 = arg0;
			this.anIntArrayArrayArray4 = arg3;
			this.aByteArrayArrayArray6 = arg1;
			this.aByteArrayArrayArray3 = new byte[4][this.anInt507][this.anInt508];
			this.aByteArrayArrayArray1 = new byte[4][this.anInt507][this.anInt508];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt507][this.anInt508];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt507][this.anInt508];
			this.anIntArrayArrayArray3 = new int[4][this.anInt507 + 1][this.anInt508 + 1];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt507 + 1][this.anInt508 + 1];
			this.anIntArrayArray11 = new int[this.anInt507 + 1][this.anInt508 + 1];
			this.anIntArray109 = new int[this.anInt508];
			this.anIntArray110 = new int[this.anInt508];
			this.anIntArray111 = new int[this.anInt508];
			this.anIntArray112 = new int[this.anInt508];
			this.anIntArray113 = new int[this.anInt508];
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("27868, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(Lclient!DNRIFKTO;IIIIIII)V")
	private void method298(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(28) int local28;
			if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
				this.aByteArrayArrayArray6[arg3][arg6][arg1] = 0;
				while (true) {
					local28 = arg0.method94();
					if (local28 == 0) {
						if (arg3 == 0) {
							this.anIntArrayArrayArray4[0][arg6][arg1] = -method302(arg6 + arg2 + 932731, arg1 + 556238 + arg5) * 8;
							return;
						} else {
							this.anIntArrayArrayArray4[arg3][arg6][arg1] = this.anIntArrayArrayArray4[arg3 - 1][arg6][arg1] - 240;
							return;
						}
					}
					if (local28 == 1) {
						@Pc(82) int local82 = arg0.method94();
						if (local82 == 1) {
							local82 = 0;
						}
						if (arg3 == 0) {
							this.anIntArrayArrayArray4[0][arg6][arg1] = -local82 * 8;
							return;
						}
						this.anIntArrayArrayArray4[arg3][arg6][arg1] = this.anIntArrayArrayArray4[arg3 - 1][arg6][arg1] - local82 * 8;
						return;
					}
					if (local28 <= 49) {
						this.aByteArrayArrayArray1[arg3][arg6][arg1] = arg0.method95();
						this.aByteArrayArrayArray2[arg3][arg6][arg1] = (byte) ((local28 - 2) / 4);
						this.aByteArrayArrayArray5[arg3][arg6][arg1] = (byte) (local28 + arg4 - 2 & 0x3);
					} else if (local28 <= 81) {
						this.aByteArrayArrayArray6[arg3][arg6][arg1] = (byte) (local28 - 49);
					} else {
						this.aByteArrayArrayArray3[arg3][arg6][arg1] = (byte) (local28 - 81);
					}
				}
			} else {
				while (true) {
					local28 = arg0.method94();
					if (local28 == 0) {
						return;
					}
					if (local28 == 1) {
						arg0.method94();
						return;
					}
					if (local28 <= 49) {
						arg0.method94();
					}
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("16555, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(IZIII)V")
	public void method299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			for (@Pc(3) int local3 = arg2; local3 <= arg2 + arg1; local3++) {
				for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg0; local7++) {
					if (local7 >= 0 && local7 < this.anInt507 && local3 >= 0 && local3 < this.anInt508) {
						this.aByteArrayArrayArray4[0][local7][local3] = 127;
						if (local7 == arg3 && local7 > 0) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7 - 1][local3];
						}
						if (local7 == arg3 + arg0 && local7 < this.anInt507 - 1) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7 + 1][local3];
						}
						if (local3 == arg2 && local3 > 0) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7][local3 - 1];
						}
						if (local3 == arg2 + arg1 && local3 < this.anInt508 - 1) {
							this.anIntArrayArrayArray4[0][local7][local3] = this.anIntArrayArrayArray4[0][local7][local3 + 1];
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("46344, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(III)I")
	private int method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(II)I")
	private int method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(ZIIILclient!URWDWMOD;ILclient!XSMXYXEY;II)V")
	private void method306(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class45 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class47 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (aBoolean129 && (this.aByteArrayArrayArray6[0][arg3][arg5] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray6[arg8][arg3][arg5] & 0x10) != 0) {
					return;
				}
				if (this.method315(arg5, arg3, arg8) != anInt504) {
					return;
				}
			}
			if (arg8 < anInt506) {
				anInt506 = arg8;
			}
			@Pc(49) int local49 = this.anIntArrayArrayArray4[arg8][arg3][arg5];
			@Pc(60) int local60 = this.anIntArrayArrayArray4[arg8][arg3 + 1][arg5];
			@Pc(73) int local73 = this.anIntArrayArrayArray4[arg8][arg3 + 1][arg5 + 1];
			@Pc(84) int local84 = this.anIntArrayArrayArray4[arg8][arg3][arg5 + 1];
			@Pc(94) int local94 = local49 + local60 + local73 + local84 >> 2;
			@Pc(97) Class41 local97 = Class41.method410(arg1);
			@Pc(109) int local109 = arg3 + (arg5 << 7) + (arg1 << 14) + 1073741824;
			if (!arg0) {
				anInt502 = -233;
			}
			if (!local97.aBoolean177) {
				local109 += Integer.MIN_VALUE;
			}
			@Pc(127) byte local127 = (byte) ((arg7 << 6) + arg2);
			@Pc(156) Class2_Sub1_Sub2 local156;
			if (arg2 != 22) {
				@Pc(254) int local254;
				if (arg2 == 10 || arg2 == 11) {
					if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
						local156 = local97.method411(10, arg7, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, 10);
					}
					if (local156 != null) {
						@Pc(241) int local241 = 0;
						if (arg2 == 11) {
							local241 += 256;
						}
						@Pc(257) int local257;
						if (arg7 == 1 || arg7 == 3) {
							local254 = local97.anInt610;
							local257 = local97.anInt611;
						} else {
							local254 = local97.anInt611;
							local257 = local97.anInt610;
						}
						if (arg6.method517(arg3, local254, local109, local156, local241, local257, local94, arg8, local127, arg5) && local97.aBoolean169) {
							@Pc(288) Class2_Sub1_Sub2_Sub5 local288;
							if (local156 instanceof Class2_Sub1_Sub2_Sub5) {
								local288 = (Class2_Sub1_Sub2_Sub5) local156;
							} else {
								local288 = local97.method411(10, arg7, local49, local60, local73, local84, -1);
							}
							if (local288 != null) {
								for (@Pc(304) int local304 = 0; local304 <= local254; local304++) {
									for (@Pc(308) int local308 = 0; local308 <= local257; local308++) {
										@Pc(315) int local315 = local288.anInt593 / 4;
										if (local315 > 30) {
											local315 = 30;
										}
										if (local315 > this.aByteArrayArrayArray4[arg8][arg3 + local304][arg5 + local308]) {
											this.aByteArrayArrayArray4[arg8][arg3 + local304][arg5 + local308] = (byte) local315;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean175 && arg4 != null) {
						arg4.method467(local97.anInt610, arg7, local97.anInt611, local97.aBoolean176, arg5, arg3);
					}
				} else if (arg2 >= 12) {
					if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
						local156 = local97.method411(arg2, arg7, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, arg2);
					}
					arg6.method517(arg3, 1, local109, local156, 0, 1, local94, arg8, local127, arg5);
					if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
						this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x924;
					}
					if (local97.aBoolean175 && arg4 != null) {
						arg4.method467(local97.anInt610, arg7, local97.anInt611, local97.aBoolean176, arg5, arg3);
					}
				} else if (arg2 == 0) {
					if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
						local156 = local97.method411(0, arg7, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, 0);
					}
					arg6.method515(local109, local127, arg3, local156, null, arg8, arg5, anIntArray108[arg7], 0, local94);
					if (arg7 == 0) {
						if (local97.aBoolean169) {
							this.aByteArrayArrayArray4[arg8][arg3][arg5] = 50;
							this.aByteArrayArrayArray4[arg8][arg3][arg5 + 1] = 50;
						}
						if (local97.aBoolean179) {
							this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x249;
						}
					} else if (arg7 == 1) {
						if (local97.aBoolean169) {
							this.aByteArrayArrayArray4[arg8][arg3][arg5 + 1] = 50;
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5 + 1] = 50;
						}
						if (local97.aBoolean179) {
							this.anIntArrayArrayArray3[arg8][arg3][arg5 + 1] |= 0x492;
						}
					} else if (arg7 == 2) {
						if (local97.aBoolean169) {
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5] = 50;
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5 + 1] = 50;
						}
						if (local97.aBoolean179) {
							this.anIntArrayArrayArray3[arg8][arg3 + 1][arg5] |= 0x249;
						}
					} else if (arg7 == 3) {
						if (local97.aBoolean169) {
							this.aByteArrayArrayArray4[arg8][arg3][arg5] = 50;
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5] = 50;
						}
						if (local97.aBoolean179) {
							this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x492;
						}
					}
					if (local97.aBoolean175 && arg4 != null) {
						arg4.method466(local97.aBoolean176, arg2, arg7, arg3, arg5);
					}
					if (local97.anInt605 != 16) {
						arg6.method523(arg5, arg3, local97.anInt605, arg8);
					}
				} else if (arg2 == 1) {
					if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
						local156 = local97.method411(1, arg7, local49, local60, local73, local84, -1);
					} else {
						local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, 1);
					}
					arg6.method515(local109, local127, arg3, local156, null, arg8, arg5, anIntArray114[arg7], 0, local94);
					if (local97.aBoolean169) {
						if (arg7 == 0) {
							this.aByteArrayArrayArray4[arg8][arg3][arg5 + 1] = 50;
						} else if (arg7 == 1) {
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5 + 1] = 50;
						} else if (arg7 == 2) {
							this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5] = 50;
						} else if (arg7 == 3) {
							this.aByteArrayArrayArray4[arg8][arg3][arg5] = 50;
						}
					}
					if (local97.aBoolean175 && arg4 != null) {
						arg4.method466(local97.aBoolean176, arg2, arg7, arg3, arg5);
					}
				} else {
					@Pc(865) int local865;
					@Pc(894) Class2_Sub1_Sub2 local894;
					if (arg2 == 2) {
						local865 = arg7 + 1 & 0x3;
						@Pc(884) Class2_Sub1_Sub2 local884;
						if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
							local884 = local97.method411(2, arg7 + 4, local49, local60, local73, local84, -1);
							local894 = local97.method411(2, local865, local49, local60, local73, local84, -1);
						} else {
							local884 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7 + 4, local73, arg1, local84, true, 2);
							local894 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, local865, local73, arg1, local84, true, 2);
						}
						arg6.method515(local109, local127, arg3, local884, local894, arg8, arg5, anIntArray108[arg7], anIntArray108[local865], local94);
						if (local97.aBoolean179) {
							if (arg7 == 0) {
								this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x249;
								this.anIntArrayArrayArray3[arg8][arg3][arg5 + 1] |= 0x492;
							} else if (arg7 == 1) {
								this.anIntArrayArrayArray3[arg8][arg3][arg5 + 1] |= 0x492;
								this.anIntArrayArrayArray3[arg8][arg3 + 1][arg5] |= 0x249;
							} else if (arg7 == 2) {
								this.anIntArrayArrayArray3[arg8][arg3 + 1][arg5] |= 0x249;
								this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x492;
							} else if (arg7 == 3) {
								this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x492;
								this.anIntArrayArrayArray3[arg8][arg3][arg5] |= 0x249;
							}
						}
						if (local97.aBoolean175 && arg4 != null) {
							arg4.method466(local97.aBoolean176, arg2, arg7, arg3, arg5);
						}
						if (local97.anInt605 != 16) {
							arg6.method523(arg5, arg3, local97.anInt605, arg8);
						}
					} else if (arg2 == 3) {
						if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
							local156 = local97.method411(3, arg7, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, 3);
						}
						arg6.method515(local109, local127, arg3, local156, null, arg8, arg5, anIntArray114[arg7], 0, local94);
						if (local97.aBoolean169) {
							if (arg7 == 0) {
								this.aByteArrayArrayArray4[arg8][arg3][arg5 + 1] = 50;
							} else if (arg7 == 1) {
								this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5 + 1] = 50;
							} else if (arg7 == 2) {
								this.aByteArrayArrayArray4[arg8][arg3 + 1][arg5] = 50;
							} else if (arg7 == 3) {
								this.aByteArrayArrayArray4[arg8][arg3][arg5] = 50;
							}
						}
						if (local97.aBoolean175 && arg4 != null) {
							arg4.method466(local97.aBoolean176, arg2, arg7, arg3, arg5);
						}
					} else if (arg2 == 9) {
						if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
							local156 = local97.method411(arg2, arg7, local49, local60, local73, local84, -1);
						} else {
							local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, arg2);
						}
						arg6.method517(arg3, 1, local109, local156, 0, 1, local94, arg8, local127, arg5);
						if (local97.aBoolean175 && arg4 != null) {
							arg4.method467(local97.anInt610, arg7, local97.anInt611, local97.aBoolean176, arg5, arg3);
						}
					} else {
						if (local97.aBoolean171) {
							if (arg7 == 1) {
								local865 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local865;
							} else if (arg7 == 2) {
								local865 = local84;
								local84 = local60;
								local60 = local865;
								local865 = local73;
								local73 = local49;
								local49 = local865;
							} else if (arg7 == 3) {
								local865 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local865;
							}
						}
						if (arg2 == 4) {
							if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
								local156 = local97.method411(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, 0, local73, arg1, local84, true, 4);
							}
							arg6.method516(arg7 * 512, 0, local127, arg8, arg3, anInt509, anIntArray108[arg7], local94, arg5, 0, local156, local109);
						} else if (arg2 == 5) {
							local865 = 16;
							local254 = arg6.method533(arg8, arg3, arg5);
							if (local254 > 0) {
								local865 = Class41.method410(local254 >> 14 & 0x7FFF).anInt605;
							}
							if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
								local894 = local97.method411(4, 0, local49, local60, local73, local84, -1);
							} else {
								local894 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, 0, local73, arg1, local84, true, 4);
							}
							arg6.method516(arg7 * 512, anIntArray106[arg7] * local865, local127, arg8, arg3, anInt509, anIntArray108[arg7], local94, arg5, anIntArray107[arg7] * local865, local894, local109);
						} else if (arg2 == 6) {
							if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
								local156 = local97.method411(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, 0, local73, arg1, local84, true, 4);
							}
							arg6.method516(arg7, 0, local127, arg8, arg3, anInt509, 256, local94, arg5, 0, local156, local109);
						} else if (arg2 == 7) {
							if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
								local156 = local97.method411(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, 0, local73, arg1, local84, true, 4);
							}
							arg6.method516(arg7, 0, local127, arg8, arg3, anInt509, 512, local94, arg5, 0, local156, local109);
						} else if (arg2 == 8) {
							if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
								local156 = local97.method411(4, 0, local49, local60, local73, local84, -1);
							} else {
								local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, 0, local73, arg1, local84, true, 4);
							}
							arg6.method516(arg7, 0, local127, arg8, arg3, anInt509, 768, local94, arg5, 0, local156, local109);
						}
					}
				}
			} else if (!aBoolean129 || local97.aBoolean177 || local97.aBoolean173) {
				if (local97.anInt621 == -1 && local97.anIntArray164 == null) {
					local156 = local97.method411(22, arg7, local49, local60, local73, local84, -1);
				} else {
					local156 = new Class2_Sub1_Sub2_Sub3(0, local49, local60, local97.anInt621, arg7, local73, arg1, local84, true, 22);
				}
				arg6.method513(local109, local156, local127, aBoolean131, arg3, arg5, arg8, local94);
				if (local97.aBoolean175 && local97.aBoolean177 && arg4 != null) {
					arg4.method468(arg5, aByte23, arg3);
				}
			}
		} catch (@Pc(1639) RuntimeException local1639) {
			signlink.reporterror("23109, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1639.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(II[Lclient!URWDWMOD;IIIIILclient!XSMXYXEY;I[B)V")
	public void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class47 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(17) Class2_Sub1_Sub4 local17 = new Class2_Sub1_Sub4(arg9, aBoolean132);
			@Pc(19) int local19 = -1;
			while (true) {
				@Pc(22) int local22 = local17.method108();
				if (local22 == 0) {
					return;
				}
				local19 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local17.method108();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local17.method94();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					if (local55 == arg3 && local51 >= arg5 && local51 < arg5 + 8 && local45 >= arg0 && local45 < arg0 + 8) {
						@Pc(88) Class41 local88 = Class41.method410(local19);
						@Pc(105) int local105 = arg4 + Class20.method246(local45 & 0x7, local51 & 0x7, local88.anInt610, local66, local88.anInt611, arg1);
						@Pc(122) int local122 = arg6 + Class20.method247(local88.anInt610, local45 & 0x7, arg1, local88.anInt611, local66, local51 & 0x7);
						if (local105 > 0 && local122 > 0 && local105 < 103 && local122 < 103) {
							@Pc(134) int local134 = arg8;
							if ((this.aByteArrayArrayArray6[1][local105][local122] & 0x2) == 2) {
								local134 = arg8 - 1;
							}
							@Pc(149) Class45 local149 = null;
							if (local134 >= 0) {
								local149 = arg2[local134];
							}
							this.method306(this.aBoolean127, local19, local62, local105, local149, local122, arg7, local66 + arg1 & 0x3, arg8);
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("970, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -2506 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(III[BLclient!XSMXYXEY;[Lclient!URWDWMOD;)V")
	public void method312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class47 arg3, @OriginalArg(5) Class45[] arg4) {
		try {
			@Pc(7) Class2_Sub1_Sub4 local7 = new Class2_Sub1_Sub4(arg2, aBoolean132);
			@Pc(13) int local13 = -1;
			while (true) {
				@Pc(16) int local16 = local7.method108();
				if (local16 == 0) {
					return;
				}
				local13 += local16;
				@Pc(24) int local24 = 0;
				while (true) {
					@Pc(27) int local27 = local7.method108();
					if (local27 == 0) {
						break;
					}
					local24 += local27 - 1;
					@Pc(39) int local39 = local24 & 0x3F;
					@Pc(45) int local45 = local24 >> 6 & 0x3F;
					@Pc(49) int local49 = local24 >> 12;
					@Pc(52) int local52 = local7.method94();
					@Pc(56) int local56 = local52 >> 2;
					@Pc(60) int local60 = local52 & 0x3;
					@Pc(64) int local64 = local45 + arg1;
					@Pc(68) int local68 = local39 + arg0;
					if (local64 > 0 && local68 > 0 && local64 < 103 && local68 < 103) {
						@Pc(80) int local80 = local49;
						if ((this.aByteArrayArrayArray6[1][local64][local68] & 0x2) == 2) {
							local80 = local49 - 1;
						}
						@Pc(95) Class45 local95 = null;
						if (local80 >= 0) {
							local95 = arg4[local80];
						}
						this.method306(this.aBoolean127, local13, local56, local64, local95, local68, arg3, local60, local49);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("86190, " + -44739 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(IIIII[Lclient!URWDWMOD;I[BII)V")
	public void method313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class45[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
					if (arg2 + local3 > 0 && arg2 + local3 < 103 && arg1 + local7 > 0 && arg1 + local7 < 103) {
						arg4[arg8].anIntArrayArray16[arg2 + local3][arg1 + local7] &= 0xFEFFFFFF;
					}
				}
			}
			@Pc(57) Class2_Sub1_Sub4 local57 = new Class2_Sub1_Sub4(arg6, aBoolean132);
			for (@Pc(68) int local68 = 0; local68 < 4; local68++) {
				for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
					for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
						if (local68 == arg3 && local72 >= arg7 && local72 < arg7 + 8 && local76 >= arg0 && local76 < arg0 + 8) {
							this.method298(local57, arg1 + Class20.method245(arg5, local72 & 0x7, local76 & 0x7), 0, arg8, arg5, 0, arg2 + Class20.method244(local76 & 0x7, local72 & 0x7, this.anInt510, arg5));
						} else {
							this.method298(local57, -1, 0, 0, 0, 0, -1);
						}
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("60037, " + arg0 + ", " + -815 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "([Lclient!URWDWMOD;Lclient!XSMXYXEY;I)V")
	public void method314(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray6[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method468(local11, aByte23, local7);
							}
						}
					}
				}
			}
			anInt503 += (int) (Math.random() * 5.0D) - 2;
			if (anInt503 < -8) {
				anInt503 = -8;
			}
			if (anInt503 > 8) {
				anInt503 = 8;
			}
			anInt505 += (int) (Math.random() * 5.0D) - 2;
			if (anInt505 < -16) {
				anInt505 = -16;
			}
			if (anInt505 > 16) {
				anInt505 = 16;
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
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray4[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt508 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt507 - 1; local145++) {
						local169 = this.anIntArrayArrayArray4[local7][local145 + 1][local141] - this.anIntArrayArrayArray4[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray4[local7][local145][local141 + 1] - this.anIntArrayArrayArray4[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray11[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt508; local145++) {
					this.anIntArray109[local145] = 0;
					this.anIntArray110[local145] = 0;
					this.anIntArray111[local145] = 0;
					this.anIntArray112[local145] = 0;
					this.anIntArray113[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt507 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt508; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt507) {
							local210 = this.aByteArrayArrayArray3[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class13 local378 = Class13.aClass13Array1[local210 - 1];
								this.anIntArray109[local191] += local378.anInt215;
								this.anIntArray110[local191] += local378.anInt213;
								this.anIntArray111[local191] += local378.anInt214;
								this.anIntArray112[local191] += local378.anInt216;
								local419 = this.anIntArray113[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt507) {
							local214 = this.aByteArrayArrayArray3[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class13 local451 = Class13.aClass13Array1[local214 - 1];
								this.anIntArray109[local191] -= local451.anInt215;
								this.anIntArray110[local191] -= local451.anInt213;
								this.anIntArray111[local191] -= local451.anInt214;
								this.anIntArray112[local191] -= local451.anInt216;
								local419 = this.anIntArray113[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt507 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt508 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt508) {
								local204 += this.anIntArray109[local527];
								local210 += this.anIntArray110[local527];
								local214 += this.anIntArray111[local527];
								local220 += this.anIntArray112[local527];
								local236 += this.anIntArray113[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt508) {
								local204 -= this.anIntArray109[local572];
								local210 -= this.anIntArray110[local572];
								local214 -= this.anIntArray111[local572];
								local220 -= this.anIntArray112[local572];
								local236 -= this.anIntArray113[local572];
							}
							if (local284 >= 1 && local284 < this.anInt508 - 1 && (!aBoolean129 || (this.aByteArrayArrayArray6[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray6[local7][local169][local284] & 0x10) == 0 && this.method315(local284, local169, local7) == anInt504)) {
								if (local7 < anInt506) {
									anInt506 = local7;
								}
								@Pc(671) int local671 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								@Pc(682) int local682 = this.aByteArrayArrayArray1[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									@Pc(695) int local695 = this.anIntArrayArrayArray4[local7][local169][local284];
									@Pc(706) int local706 = this.anIntArrayArrayArray4[local7][local169 + 1][local284];
									@Pc(719) int local719 = this.anIntArrayArrayArray4[local7][local169 + 1][local284 + 1];
									@Pc(730) int local730 = this.anIntArrayArrayArray4[local7][local169][local284 + 1];
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
										local768 = this.method300(local778, local782, local786);
										@Pc(798) int local798 = local778 + anInt503 & 0xFF;
										local786 += anInt505;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method300(local798, local782, local786);
									}
									if (local7 > 0) {
										@Pc(823) boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray2[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class13.aClass13Array1[local682 - 1].aBoolean56) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray3[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class2_Sub1_Sub1_Sub1.anIntArray10[method309(local770, 96)];
									}
									if (local682 == 0) {
										arg1.method512(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method309(local768, local737), method309(local768, local746), method309(local768, local757), method309(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray2[local7][local169][local284] + 1;
										@Pc(935) byte local935 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(941) Class13 local941 = Class13.aClass13Array1[local682 - 1];
										@Pc(944) int local944 = local941.anInt211;
										@Pc(953) int local953;
										@Pc(951) int local951;
										if (local944 >= 0) {
											local951 = Class2_Sub1_Sub1_Sub1.method38(local944, this.aBoolean128);
											local953 = -1;
										} else if (local941.anInt210 == 16711935) {
											local951 = 0;
											local953 = -2;
											local944 = -1;
										} else {
											local953 = this.method300(local941.anInt212, local941.anInt213, local941.anInt214);
											local951 = Class2_Sub1_Sub1_Sub1.anIntArray10[this.method301(local941.anInt217, 96)];
										}
										arg1.method512(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method309(local768, local737), method309(local768, local746), method309(local768, local757), method309(local768, local766), this.method301(local953, local737), this.method301(local953, local746), this.method301(local953, local757), this.method301(local953, local766), local778, local951);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt508 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt507 - 1; local204++) {
						arg1.method511(local7, local204, local191, this.method315(local191, local204, local7));
					}
				}
			}
			arg1.method538();
			for (local11 = 0; local11 < this.anInt507; local11++) {
				for (local27 = 0; local27 < this.anInt508; local27++) {
					if ((this.aByteArrayArrayArray6[1][local11][local27] & 0x2) == 2) {
						arg1.method509(local11, local27);
					}
				}
			}
			local27 = 1;
			@Pc(1134) int local1134 = 2;
			@Pc(1136) int local1136 = 4;
			for (@Pc(1138) int local1138 = 0; local1138 < 4; local1138++) {
				if (local1138 > 0) {
					local27 <<= 0x3;
					local1134 <<= 0x3;
					local1136 <<= 0x3;
				}
				for (@Pc(1156) int local1156 = 0; local1156 <= local1138; local1156++) {
					for (local133 = 0; local133 <= this.anInt508; local133++) {
						for (local139 = 0; local139 <= this.anInt507; local139++) {
							if ((this.anIntArrayArrayArray3[local1156][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray3[local1156][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt508 && (this.anIntArrayArrayArray3[local1156][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label328: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray3[local169 - 1][local139][local204] & local27) == 0) {
											break label328;
										}
									}
									local169--;
								}
								label317: while (local191 < local1138) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray3[local191 + 1][local139][local204] & local27) == 0) {
											break label317;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray4[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray4[local169][local139][local141];
									Class47.method510(1, local139 * 128, local141 * 128, local139 * 128, local145 * 128 + 128, local220, local214, local1138);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray3[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray3[local1156][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1156;
								local191 = local1156;
								while (local141 > 0 && (this.anIntArrayArrayArray3[local1156][local141 - 1][local133] & local1134) != 0) {
									local141--;
								}
								while (local145 < this.anInt507 && (this.anIntArrayArrayArray3[local1156][local145 + 1][local133] & local1134) != 0) {
									local145++;
								}
								label381: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray3[local169 - 1][local204][local133] & local1134) == 0) {
											break label381;
										}
									}
									local169--;
								}
								label370: while (local191 < local1138) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray3[local191 + 1][local204][local133] & local1134) == 0) {
											break label370;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray4[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray4[local169][local141][local133];
									Class47.method510(2, local145 * 128 + 128, local133 * 128, local141 * 128, local133 * 128, local220, local214, local1138);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray3[local236][local284][local133] &= ~local1134;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray3[local1156][local139][local133] & local1136) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray3[local1156][local139][local169 - 1] & local1136) != 0) {
									local169--;
								}
								while (local191 < this.anInt508 && (this.anIntArrayArrayArray3[local1156][local139][local191 + 1] & local1136) != 0) {
									local191++;
								}
								label434: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray3[local1156][local141 - 1][local204] & local1136) == 0) {
											break label434;
										}
									}
									local141--;
								}
								label423: while (local145 < this.anInt507) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray3[local1156][local145 + 1][local204] & local1136) == 0) {
											break label423;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray4[local1156][local141][local169];
									Class47.method510(4, local145 * 128 + 128, local169 * 128, local141 * 128, local191 * 128 + 128, local204, local204, local1138);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray3[local1156][local210][local214] &= ~local1136;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1771) RuntimeException local1771) {
			signlink.reporterror("85207, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local1771.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "b", descriptor = "(IIII)I")
	private int method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if ((this.aByteArrayArrayArray6[arg2][arg1][arg0] & 0x8) == 0) {
				return arg2 <= 0 || (this.aByteArrayArrayArray6[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("53702, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 46887 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTMHEDV", name = "a", descriptor = "(III[BB[Lclient!URWDWMOD;I)V")
	public void method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class45[] arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
					for (local11 = 0; local11 < 64; local11++) {
						if (arg2 + local7 > 0 && arg2 + local7 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
							arg5[local3].anIntArrayArray16[arg2 + local7][arg0 + local11] &= 0xFEFFFFFF;
						}
					}
				}
			}
			@Pc(64) boolean local64 = false;
			@Pc(74) Class2_Sub1_Sub4 local74 = new Class2_Sub1_Sub4(arg3, aBoolean132);
			for (local11 = 0; local11 < 4; local11++) {
				for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						this.method298(local74, local84 + arg0, arg6, local11, 0, arg1, local80 + arg2);
					}
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("92151, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
