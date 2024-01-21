import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Z")
	public static boolean aBoolean161;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Z")
	private static boolean aBoolean162;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public static int anInt610;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
	public static int[] anIntArray180;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
	private static int anInt613;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
	private static int anInt614;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "[[I")
	private static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public static int anInt615;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Z")
	private static boolean aBoolean158 = true;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	private static int anInt608 = -728;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	private static int anInt609;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
	public static boolean aBoolean160;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "[I")
	private static int[] anIntArray176;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "[Lclient!jb;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "[Z")
	private static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "[I")
	private static int[] anIntArray181;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[[I")
	private static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "[[I")
	private static int[][] anIntArrayArray15;

	static {
		aBoolean159 = true;
		anInt609 = 513;
		aBoolean160 = true;
		aBoolean163 = true;
		anIntArray176 = new int[512];
		anIntArray177 = new int[2048];
		anIntArray178 = new int[2048];
		anIntArray179 = new int[2048];
		for (@Pc(25) int local25 = 1; local25 < 512; local25++) {
			anIntArray176[local25] = 32768 / local25;
		}
		for (@Pc(38) int local38 = 1; local38 < 2048; local38++) {
			anIntArray177[local38] = 65536 / local38;
		}
		for (@Pc(51) int local51 = 0; local51 < 2048; local51++) {
			anIntArray178[local51] = (int) (Math.sin((double) local51 * 0.0030679615D) * 65536.0D);
			anIntArray179[local51] = (int) (Math.cos((double) local51 * 0.0030679615D) * 65536.0D);
		}
		aClass1_Sub1_Sub2_Sub3Array5 = new Class1_Sub1_Sub2_Sub3[50];
		aBooleanArray8 = new boolean[50];
		anIntArray181 = new int[50];
		anIntArrayArray14 = new int[50][];
		anIntArray182 = new int[50];
		anIntArray183 = new int[65536];
		anIntArrayArray15 = new int[50][];
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V")
	public static void method342() {
		try {
			anIntArray176 = null;
			anIntArray176 = null;
			anIntArray178 = null;
			anIntArray179 = null;
			anIntArray180 = null;
			aClass1_Sub1_Sub2_Sub3Array5 = null;
			aBooleanArray8 = null;
			anIntArray181 = null;
			anIntArrayArray13 = null;
			anIntArrayArray14 = null;
			anIntArray182 = null;
			anIntArray183 = null;
			anIntArrayArray15 = null;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22272, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)V")
	public static void method343() {
		try {
			anIntArray180 = new int[Class1_Sub1_Sub2.anInt720];
			for (@Pc(7) int local7 = 0; local7 < Class1_Sub1_Sub2.anInt720; local7++) {
				anIntArray180[local7] = Class1_Sub1_Sub2.anInt719 * local7;
			}
			anInt611 = Class1_Sub1_Sub2.anInt719 / 2;
			anInt612 = Class1_Sub1_Sub2.anInt720 / 2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("12067, " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			anIntArray180 = new int[arg0];
			for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
				anIntArray180[local8] = arg1 * local8;
			}
			anInt611 = arg1 / 2;
			anInt612 = arg0 / 2;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("3473, " + arg0 + ", " + arg1 + ", " + -49366 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)V")
	public static void method345() {
		try {
			anIntArrayArray13 = null;
			for (@Pc(7) int local7 = 0; local7 < 50; local7++) {
				anIntArrayArray14[local7] = null;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("80004, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method346() {
		try {
			if (anIntArrayArray13 == null) {
				anInt614 = 20;
				if (aBoolean160) {
					anIntArrayArray13 = new int[anInt614][16384];
				} else {
					anIntArrayArray13 = new int[anInt614][65536];
				}
				for (@Pc(24) int local24 = 0; local24 < 50; local24++) {
					anIntArrayArray14[local24] = null;
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("11642, " + 20 + ", " + -728 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!xb;B)V")
	public static void method347(@OriginalArg(0) Class47 arg0, @OriginalArg(1) byte arg1) {
		try {
			anInt613 = 0;
			if (arg1 != -69) {
				anInt609 = -382;
			}
			for (@Pc(10) int local10 = 0; local10 < 50; local10++) {
				try {
					aClass1_Sub1_Sub2_Sub3Array5[local10] = new Class1_Sub1_Sub2_Sub3(arg0, String.valueOf(local10), 0);
					if (aBoolean160 && aClass1_Sub1_Sub2_Sub3Array5[local10].anInt699 == 128) {
						aClass1_Sub1_Sub2_Sub3Array5[local10].method413();
					} else {
						aClass1_Sub1_Sub2_Sub3Array5[local10].method414();
					}
					anInt613++;
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("44756, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
	public static int method348(@OriginalArg(0) int arg0) {
		try {
			if (anIntArray181[arg0] != 0) {
				return anIntArray181[arg0];
			}
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(20) int local20 = anIntArrayArray15[arg0].length;
			for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
				local11 += anIntArrayArray15[arg0][local22] >> 16 & 0xFF;
				local13 += anIntArrayArray15[arg0][local22] >> 8 & 0xFF;
				local15 += anIntArrayArray15[arg0][local22] & 0xFF;
			}
			@Pc(88) int local88 = (local11 / local20 << 16) + (local13 / local20 << 8) + local15 / local20;
			local88 = method352(local88, 1.4D);
			if (local88 == 0) {
				local88 = 1;
			}
			anIntArray181[arg0] = local88;
			return local88;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("12034, " + arg0 + ", " + -592 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V")
	public static void method349(@OriginalArg(1) int arg0) {
		try {
			if (anIntArrayArray14[arg0] != null) {
				anIntArrayArray13[anInt614++] = anIntArrayArray14[arg0];
				anIntArrayArray14[arg0] = null;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("28813, " + 0 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[I")
	private static int[] method350(@OriginalArg(0) int arg0) {
		anIntArray182[arg0] = anInt615++;
		if (anIntArrayArray14[arg0] != null) {
			return anIntArrayArray14[arg0];
		}
		@Pc(27) int[] local27;
		@Pc(39) int local39;
		if (anInt614 > 0) {
			local27 = anIntArrayArray13[--anInt614];
			anIntArrayArray13[anInt614] = null;
		} else {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			for (local39 = 0; local39 < anInt613; local39++) {
				if (anIntArrayArray14[local39] != null && (anIntArray182[local39] < local35 || local37 == -1)) {
					local35 = anIntArray182[local39];
					local37 = local39;
				}
			}
			local27 = anIntArrayArray14[local37];
			anIntArrayArray14[local37] = null;
		}
		anIntArrayArray14[arg0] = local27;
		@Pc(79) Class1_Sub1_Sub2_Sub3 local79 = aClass1_Sub1_Sub2_Sub3Array5[arg0];
		@Pc(83) int[] local83 = anIntArrayArray15[arg0];
		@Pc(106) int local106;
		if (aBoolean160) {
			aBooleanArray8[arg0] = false;
			for (local39 = 0; local39 < 4096; local39++) {
				local106 = local27[local39] = local83[local79.aByteArray7[local39]] & 0xF8F8FF;
				if (local106 == 0) {
					aBooleanArray8[arg0] = true;
				}
				local27[local39 + 4096] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 8192] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 12288] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		} else {
			if (local79.anInt695 == 64) {
				for (local39 = 0; local39 < 128; local39++) {
					for (local106 = 0; local106 < 128; local106++) {
						local27[local106 + (local39 << 7)] = local83[local79.aByteArray7[(local106 >> 1) + (local39 >> 1 << 6)]];
					}
				}
			} else {
				for (local39 = 0; local39 < 16384; local39++) {
					local27[local39] = local83[local79.aByteArray7[local39]];
				}
			}
			aBooleanArray8[arg0] = false;
			for (local39 = 0; local39 < 16384; local39++) {
				local27[local39] &= 0xF8F8FF;
				local106 = local27[local39];
				if (local106 == 0) {
					aBooleanArray8[arg0] = true;
				}
				local27[local39 + 16384] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 32768] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 49152] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZD)V")
	public static void method351(@OriginalArg(1) double arg0) {
		try {
			@Pc(9) double local9 = arg0 + Math.random() * 0.03D - 0.015D;
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < 512; local13++) {
				@Pc(24) double local24 = (double) (local13 / 8) / 64.0D + 0.0078125D;
				@Pc(33) double local33 = (double) (local13 & 0x7) / 8.0D + 0.0625D;
				for (@Pc(35) int local35 = 0; local35 < 128; local35++) {
					@Pc(42) double local42 = (double) local35 / 128.0D;
					@Pc(44) double local44 = local42;
					@Pc(46) double local46 = local42;
					@Pc(48) double local48 = local42;
					if (local33 != 0.0D) {
						@Pc(62) double local62;
						if (local42 < 0.5D) {
							local62 = local42 * (local33 + 1.0D);
						} else {
							local62 = local42 + local33 - local42 * local33;
						}
						@Pc(78) double local78 = local42 * 2.0D - local62;
						@Pc(82) double local82 = local24 + 0.3333333333333333D;
						if (local82 > 1.0D) {
							local82--;
						}
						@Pc(96) double local96 = local24 - 0.3333333333333333D;
						if (local96 < 0.0D) {
							local96++;
						}
						if (local82 * 6.0D < 1.0D) {
							local44 = local78 + (local62 - local78) * 6.0D * local82;
						} else if (local82 * 2.0D < 1.0D) {
							local44 = local62;
						} else if (local82 * 3.0D < 2.0D) {
							local44 = local78 + (local62 - local78) * (0.6666666666666666D - local82) * 6.0D;
						} else {
							local44 = local78;
						}
						if (local24 * 6.0D < 1.0D) {
							local46 = local78 + (local62 - local78) * 6.0D * local24;
						} else if (local24 * 2.0D < 1.0D) {
							local46 = local62;
						} else if (local24 * 3.0D < 2.0D) {
							local46 = local78 + (local62 - local78) * (0.6666666666666666D - local24) * 6.0D;
						} else {
							local46 = local78;
						}
						if (local96 * 6.0D < 1.0D) {
							local48 = local78 + (local62 - local78) * 6.0D * local96;
						} else if (local96 * 2.0D < 1.0D) {
							local48 = local62;
						} else if (local96 * 3.0D < 2.0D) {
							local48 = local78 + (local62 - local78) * (0.6666666666666666D - local96) * 6.0D;
						} else {
							local48 = local78;
						}
					}
					@Pc(259) int local259 = (int) (local44 * 256.0D);
					@Pc(264) int local264 = (int) (local46 * 256.0D);
					@Pc(269) int local269 = (int) (local48 * 256.0D);
					@Pc(279) int local279 = (local259 << 16) + (local264 << 8) + local269;
					local279 = method352(local279, local9);
					if (local279 == 0) {
						local279 = 1;
					}
					anIntArray183[local11++] = local279;
				}
			}
			for (@Pc(302) int local302 = 0; local302 < 50; local302++) {
				if (aClass1_Sub1_Sub2_Sub3Array5[local302] != null) {
					@Pc(313) int[] local313 = aClass1_Sub1_Sub2_Sub3Array5[local302].anIntArray212;
					anIntArrayArray15[local302] = new int[local313.length];
					for (@Pc(321) int local321 = 0; local321 < local313.length; local321++) {
						anIntArrayArray15[local302][local321] = method352(local313[local321], local9);
						if ((anIntArrayArray15[local302][local321] & 0xF8F8FF) == 0 && local321 != 0) {
							anIntArrayArray15[local302][local321] = 1;
						}
					}
				}
			}
			for (@Pc(363) int local363 = 0; local363 < 50; local363++) {
				method349(local363);
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("50848, " + false + ", " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ID)I")
	private static int method352(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(6) double local6 = (double) (arg0 >> 16) / 256.0D;
		@Pc(15) double local15 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(22) double local22 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = Math.pow(local6, arg1);
		@Pc(30) double local30 = Math.pow(local15, arg1);
		@Pc(34) double local34 = Math.pow(local22, arg1);
		@Pc(39) int local39 = (int) (local26 * 256.0D);
		@Pc(44) int local44 = (int) (local30 * 256.0D);
		@Pc(49) int local49 = (int) (local34 * 256.0D);
		return (local39 << 16) + (local44 << 8) + local49;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		if (arg1 != arg0) {
			local3 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local5 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		if (arg2 != arg1) {
			local30 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local32 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		if (arg2 != arg0) {
			local57 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local59 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub1_Sub2.anInt722) {
				if (arg1 > Class1_Sub1_Sub2.anInt722) {
					arg1 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg5 -= local57 * arg0;
						arg3 -= local3 * arg0;
						arg8 -= local59 * arg0;
						arg6 -= local5 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0xF;
					if (arg1 < 0) {
						arg4 -= local30 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local57 < local3 || arg0 == arg1 && local57 > local30) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0xF;
					if (arg0 < 0) {
						arg4 -= local57 * arg0;
						arg3 -= local3 * arg0;
						arg7 -= local59 * arg0;
						arg6 -= local5 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local30 * arg2;
						arg8 -= local32 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local57 < local3 || arg0 == arg2 && local30 > local3) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub1_Sub2.anInt722) {
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg0 > Class1_Sub1_Sub2.anInt722) {
					arg0 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg3 -= local3 * arg1;
						arg4 -= local30 * arg1;
						arg6 -= local5 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0xF;
					if (arg2 < 0) {
						arg5 -= local57 * arg2;
						arg8 -= local59 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local3 < local30 || arg1 == arg2 && local3 > local57) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0xF;
					if (arg1 < 0) {
						arg5 -= local3 * arg1;
						arg4 -= local30 * arg1;
						arg8 -= local5 * arg1;
						arg7 -= local32 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0xF;
					if (arg0 < 0) {
						arg3 -= local57 * arg0;
						arg6 -= local59 * arg0;
						arg0 = 0;
					}
					if (local3 < local30) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method354(Class1_Sub1_Sub2.anIntArray213, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub1_Sub2.anInt722) {
			if (arg0 > Class1_Sub1_Sub2.anInt722) {
				arg0 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg1 > Class1_Sub1_Sub2.anInt722) {
				arg1 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg4 -= local30 * arg2;
					arg5 -= local57 * arg2;
					arg7 -= local32 * arg2;
					arg8 -= local59 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0xF;
				if (arg0 < 0) {
					arg3 -= local3 * arg0;
					arg6 -= local5 * arg0;
					arg0 = 0;
				}
				if (local30 < local57) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0xF;
				if (arg2 < 0) {
					arg3 -= local30 * arg2;
					arg5 -= local57 * arg2;
					arg6 -= local32 * arg2;
					arg8 -= local59 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0xF;
				if (arg1 < 0) {
					arg4 -= local3 * arg1;
					arg7 -= local5 * arg1;
					arg1 = 0;
				}
				if (local30 < local57) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method354(Class1_Sub1_Sub2.anIntArray213, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIIIII)V")
	private static void method354(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(18) int local18;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(51) int local51;
		@Pc(97) int local97;
		if (aBoolean163) {
			if (aBoolean161) {
				if (arg3 - arg2 > 3) {
					local18 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local18 = 0;
				}
				if (arg3 > Class1_Sub1_Sub2.anInt725) {
					arg3 = Class1_Sub1_Sub2.anInt725;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
				arg1 += arg2;
				local51 = arg3 - arg2 >> 2;
				local18 <<= 0x2;
			} else if (arg2 < arg3) {
				arg1 += arg2;
				local51 = arg3 - arg2 >> 2;
				if (local51 > 0) {
					local18 = (arg5 - arg4) * anIntArray176[local51] >> 15;
				} else {
					local18 = 0;
				}
			} else {
				return;
			}
			@Pc(104) int local104;
			if (anInt610 == 0) {
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray183[arg4 >> 8];
							do {
								arg0[arg1++] = local97;
								local51--;
							} while (local51 > 0);
							return;
						}
						break;
					}
					local97 = anIntArray183[arg4 >> 8];
					arg4 += local18;
					local104 = arg1 + 1;
					arg0[arg1] = local97;
					@Pc(109) int local109 = local104 + 1;
					arg0[local104] = local97;
					@Pc(114) int local114 = local109 + 1;
					arg0[local109] = local97;
					arg1 = local114 + 1;
					arg0[local114] = local97;
				}
			} else {
				local149 = anInt610;
				local153 = 256 - anInt610;
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray183[arg4 >> 8];
							local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
								local51--;
							} while (local51 > 0);
						}
						break;
					}
					local97 = anIntArray183[arg4 >> 8];
					arg4 += local18;
					local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					local104 = arg1 + 1;
					arg0[arg1] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg0[local104++] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg0[local104++] = local97 + ((arg0[local104] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local104] & 0xFF00) * local149 >> 8 & 0xFF00);
					arg1 = local104 + 1;
					arg0[local104] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
				}
			}
		} else if (arg2 < arg3) {
			local18 = (arg5 - arg4) / (arg3 - arg2);
			if (aBoolean161) {
				if (arg3 > Class1_Sub1_Sub2.anInt725) {
					arg3 = Class1_Sub1_Sub2.anInt725;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg2 = 0;
				}
				if (arg2 >= arg3) {
					return;
				}
			}
			@Pc(408) int local408 = arg1 + arg2;
			local51 = arg3 - arg2;
			if (anInt610 == 0) {
				do {
					arg0[local408++] = anIntArray183[arg4 >> 8];
					arg4 += local18;
					local51--;
				} while (local51 > 0);
			} else {
				local149 = anInt610;
				local153 = 256 - anInt610;
				do {
					local97 = anIntArray183[arg4 >> 8];
					arg4 += local18;
					@Pc(467) int local467 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					arg0[local408++] = local467 + ((arg0[local408] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local408] & 0xFF00) * local149 >> 8 & 0xFF00);
					local51--;
				} while (local51 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIIII)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = 0;
		if (arg1 != arg0) {
			local3 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(18) int local18 = 0;
		if (arg2 != arg1) {
			local18 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(33) int local33 = 0;
		if (arg2 != arg0) {
			local33 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub1_Sub2.anInt722) {
				if (arg1 > Class1_Sub1_Sub2.anInt722) {
					arg1 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local33 * arg0;
						arg3 -= local3 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local33 < local3 || arg0 == arg1 && local33 > local18) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local33 * arg0;
						arg3 -= local3 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local18 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local33 < local3 || arg0 == arg2 && local18 > local3) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class1_Sub1_Sub2.anInt719;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub1_Sub2.anInt722) {
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg0 > Class1_Sub1_Sub2.anInt722) {
					arg0 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local3 * arg1;
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local33 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local3 < local18 || arg1 == arg2 && local3 > local33) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local3 * arg1;
						arg4 -= local18 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local33 * arg0;
						arg0 = 0;
					}
					if (local3 < local18) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class1_Sub1_Sub2.anInt719;
								}
							}
							method356(Class1_Sub1_Sub2.anIntArray213, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class1_Sub1_Sub2.anInt719;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub1_Sub2.anInt722) {
			if (arg0 > Class1_Sub1_Sub2.anInt722) {
				arg0 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg1 > Class1_Sub1_Sub2.anInt722) {
				arg1 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local18 * arg2;
					arg5 -= local33 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local3 * arg0;
					arg0 = 0;
				}
				if (local18 < local33) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local18 * arg2;
					arg5 -= local33 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local3 * arg1;
					arg1 = 0;
				}
				if (local18 < local33) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class1_Sub1_Sub2.anInt719;
							}
						}
						method356(Class1_Sub1_Sub2.anIntArray213, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class1_Sub1_Sub2.anInt719;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIII)V")
	private static void method356(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean161) {
			if (arg4 > Class1_Sub1_Sub2.anInt725) {
				arg4 = Class1_Sub1_Sub2.anInt725;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(26) int local26 = arg4 - arg3 >> 2;
		@Pc(33) int local33;
		if (anInt610 == 0) {
			while (true) {
				local26--;
				if (local26 < 0) {
					local26 = arg4 - arg3 & 0x3;
					while (true) {
						local26--;
						if (local26 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local33 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local33++] = arg2;
				arg0[local33++] = arg2;
				arg1 = local33 + 1;
				arg0[local33] = arg2;
			}
			return;
		}
		@Pc(72) int local72 = anInt610;
		@Pc(76) int local76 = 256 - anInt610;
		@Pc(96) int local96 = ((arg2 & 0xFF00FF) * local76 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local76 >> 8 & 0xFF00);
		while (true) {
			local26--;
			if (local26 < 0) {
				local26 = arg4 - arg3 & 0x3;
				while (true) {
					local26--;
					if (local26 < 0) {
						return;
					}
					arg0[arg1++] = local96 + ((arg0[arg1] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local72 >> 8 & 0xFF00);
				}
			}
			local33 = arg1 + 1;
			arg0[arg1] = local96 + ((arg0[local33] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local33] & 0xFF00) * local72 >> 8 & 0xFF00);
			@Pc(130) int local130 = local33 + 1;
			arg0[local33] = local96 + ((arg0[local130] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local130] & 0xFF00) * local72 >> 8 & 0xFF00);
			@Pc(159) int local159 = local130 + 1;
			arg0[local130] = local96 + ((arg0[local159] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[local159] & 0xFF00) * local72 >> 8 & 0xFF00);
			arg1 = local159 + 1;
			arg0[local159] = local96 + ((arg0[arg1] & 0xFF00FF) * local72 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local72 >> 8 & 0xFF00);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = method350(arg18);
		aBoolean162 = !aBooleanArray8[arg18];
		@Pc(16) int local16 = arg9 - arg10;
		@Pc(20) int local20 = arg12 - arg13;
		@Pc(24) int local24 = arg15 - arg16;
		@Pc(28) int local28 = arg11 - arg9;
		@Pc(32) int local32 = arg14 - arg12;
		@Pc(36) int local36 = arg17 - arg15;
		@Pc(46) int local46 = local28 * arg12 - local32 * arg9 << 14;
		@Pc(56) int local56 = local32 * arg15 - local36 * arg12 << 8;
		@Pc(66) int local66 = local36 * arg9 - local28 * arg15 << 5;
		@Pc(76) int local76 = local16 * arg12 - local20 * arg9 << 14;
		@Pc(86) int local86 = local20 * arg15 - local24 * arg12 << 8;
		@Pc(96) int local96 = local24 * arg9 - local16 * arg15 << 5;
		@Pc(106) int local106 = local20 * local28 - local16 * local32 << 14;
		@Pc(116) int local116 = local24 * local32 - local20 * local36 << 8;
		@Pc(126) int local126 = local16 * local36 - local24 * local28 << 5;
		@Pc(128) int local128 = 0;
		@Pc(130) int local130 = 0;
		if (arg1 != arg0) {
			local128 = (arg4 - arg3 << 16) / (arg1 - arg0);
			local130 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		@Pc(155) int local155 = 0;
		@Pc(157) int local157 = 0;
		if (arg2 != arg1) {
			local155 = (arg5 - arg4 << 16) / (arg2 - arg1);
			local157 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		if (arg2 != arg0) {
			local182 = (arg3 - arg5 << 16) / (arg0 - arg2);
			local184 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		@Pc(298) int local298;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < Class1_Sub1_Sub2.anInt722) {
				if (arg1 > Class1_Sub1_Sub2.anInt722) {
					arg1 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					arg8 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local182 * arg0;
						arg3 -= local128 * arg0;
						arg8 -= local184 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					arg7 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local155 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					local298 = arg0 - anInt612;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg0 != arg1 && local182 < local128 || arg0 == arg1 && local182 > local155) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					arg7 = arg6 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local182 * arg0;
						arg3 -= local128 * arg0;
						arg7 -= local184 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local155 * arg2;
						arg8 -= local157 * arg2;
						arg2 = 0;
					}
					local298 = arg0 - anInt612;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if ((arg0 == arg2 || local182 >= local128) && (arg0 != arg2 || local155 <= local128)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray180[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub1_Sub2.anInt722) {
				if (arg2 > Class1_Sub1_Sub2.anInt722) {
					arg2 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg0 > Class1_Sub1_Sub2.anInt722) {
					arg0 = Class1_Sub1_Sub2.anInt722;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					arg6 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local128 * arg1;
						arg4 -= local155 * arg1;
						arg6 -= local130 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					arg8 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local182 * arg2;
						arg8 -= local184 * arg2;
						arg2 = 0;
					}
					local298 = arg1 - anInt612;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg1 != arg2 && local128 < local155 || arg1 == arg2 && local128 > local182) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					arg8 = arg7 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local128 * arg1;
						arg4 -= local155 * arg1;
						arg8 -= local130 * arg1;
						arg7 -= local157 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					arg6 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local182 * arg0;
						arg6 -= local184 * arg0;
						arg0 = 0;
					}
					local298 = arg1 - anInt612;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (local128 < local155) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray180[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class1_Sub1_Sub2.anInt719;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class1_Sub1_Sub2.anInt719;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub1_Sub2.anInt722) {
			if (arg0 > Class1_Sub1_Sub2.anInt722) {
				arg0 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg1 > Class1_Sub1_Sub2.anInt722) {
				arg1 = Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				arg7 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local155 * arg2;
					arg5 -= local182 * arg2;
					arg7 -= local157 * arg2;
					arg8 -= local184 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				arg6 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local128 * arg0;
					arg6 -= local130 * arg0;
					arg0 = 0;
				}
				local298 = arg2 - anInt612;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class1_Sub1_Sub2.anInt719;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class1_Sub1_Sub2.anInt719;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class1_Sub1_Sub2.anInt719;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class1_Sub1_Sub2.anInt719;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg6 = arg8 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local155 * arg2;
					arg5 -= local182 * arg2;
					arg6 -= local157 * arg2;
					arg8 -= local184 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				arg7 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local128 * arg1;
					arg7 -= local130 * arg1;
					arg1 = 0;
				}
				local298 = arg2 - anInt612;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class1_Sub1_Sub2.anInt719;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class1_Sub1_Sub2.anInt719;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray180[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class1_Sub1_Sub2.anInt719;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method358(Class1_Sub1_Sub2.anIntArray213, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class1_Sub1_Sub2.anInt719;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method358(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(15) int local15;
		@Pc(40) int local40;
		if (aBoolean161) {
			local15 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > Class1_Sub1_Sub2.anInt725) {
				arg6 = Class1_Sub1_Sub2.anInt725;
			}
			if (arg5 < 0) {
				arg7 -= arg5 * local15;
				arg5 = 0;
			}
			if (arg5 >= arg6) {
				return;
			}
			local40 = arg6 - arg5 >> 3;
			local15 <<= 0xC;
			arg7 <<= 0x9;
		} else {
			if (arg6 - arg5 > 7) {
				local40 = arg6 - arg5 >> 3;
				local15 = (arg8 - arg7) * anIntArray176[local40] >> 6;
			} else {
				local40 = 0;
				local15 = 0;
			}
			arg7 <<= 0x9;
		}
		arg4 += arg5;
		@Pc(89) int local89;
		@Pc(91) int local91;
		@Pc(123) int local123;
		@Pc(95) int local95;
		@Pc(188) int local188;
		@Pc(194) int local194;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (aBoolean160) {
			local89 = 0;
			local91 = 0;
			local95 = arg5 - anInt611;
			local103 = arg9 + (arg12 >> 3) * local95;
			local111 = arg10 + (arg13 >> 3) * local95;
			local119 = arg11 + (arg14 >> 3) * local95;
			local123 = local119 >> 12;
			if (local123 != 0) {
				arg2 = local103 / local123;
				arg3 = local111 / local123;
				if (arg2 < 0) {
					arg2 = 0;
				} else if (arg2 > 4032) {
					arg2 = 4032;
				}
			}
			arg9 = local103 + arg12;
			arg10 = local111 + arg13;
			arg11 = local119 + arg14;
			local123 = arg11 >> 12;
			if (local123 != 0) {
				local89 = arg9 / local123;
				local91 = arg10 / local123;
				if (local89 < 7) {
					local89 = 7;
				} else if (local89 > 4032) {
					local89 = 4032;
				}
			}
			local188 = local89 - arg2 >> 3;
			local194 = local91 - arg3 >> 3;
			arg2 += arg7 >> 3 & 0xC0000;
			local206 = arg7 >> 23;
			if (aBoolean162) {
				while (local40-- > 0) {
					local213 = arg4 + 1;
					arg0[arg4] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg0[local213++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
					arg4 = local213 + 1;
					arg0[local213] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 = local89;
					arg3 = local91;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local123 = arg11 >> 12;
					if (local123 != 0) {
						local89 = arg9 / local123;
						local91 = arg10 / local123;
						if (local89 < 7) {
							local89 = 7;
						} else if (local89 > 4032) {
							local89 = 4032;
						}
					}
					local188 = local89 - arg2 >> 3;
					local194 = local91 - arg3 >> 3;
					arg7 += local15;
					arg2 += arg7 >> 3 & 0xC0000;
					local206 = arg7 >> 23;
				}
				local40 = arg6 - arg5 & 0x7;
				while (local40-- > 0) {
					arg0[arg4++] = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206;
					arg2 += local188;
					arg3 += local194;
				}
			} else {
				while (local40-- > 0) {
					@Pc(507) int local507;
					if ((local507 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[arg4] = local507;
					}
					local213 = arg4 + 1;
					arg2 += local188;
					arg3 += local194;
					@Pc(534) int local534;
					if ((local534 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local534;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(561) int local561;
					if ((local561 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local561;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(588) int local588;
					if ((local588 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local588;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(615) int local615;
					if ((local615 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local615;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(642) int local642;
					if ((local642 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local642;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(669) int local669;
					if ((local669 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local669;
					}
					local213++;
					arg2 += local188;
					arg3 += local194;
					@Pc(696) int local696;
					if ((local696 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[local213] = local696;
					}
					arg4 = local213 + 1;
					arg2 = local89;
					arg3 = local91;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					local123 = arg11 >> 12;
					if (local123 != 0) {
						local89 = arg9 / local123;
						local91 = arg10 / local123;
						if (local89 < 7) {
							local89 = 7;
						} else if (local89 > 4032) {
							local89 = 4032;
						}
					}
					local188 = local89 - arg2 >> 3;
					local194 = local91 - arg3 >> 3;
					arg7 += local15;
					arg2 += arg7 >> 3 & 0xC0000;
					local206 = arg7 >> 23;
				}
				local40 = arg6 - arg5 & 0x7;
				while (local40-- > 0) {
					@Pc(796) int local796;
					if ((local796 = arg1[(arg3 & 0xFC0) + (arg2 >> 6)] >>> local206) != 0) {
						arg0[arg4] = local796;
					}
					arg4++;
					arg2 += local188;
					arg3 += local194;
				}
			}
			return;
		}
		local89 = 0;
		local91 = 0;
		local95 = arg5 - anInt611;
		local103 = arg9 + (arg12 >> 3) * local95;
		local111 = arg10 + (arg13 >> 3) * local95;
		local119 = arg11 + (arg14 >> 3) * local95;
		local123 = local119 >> 14;
		if (local123 != 0) {
			arg2 = local103 / local123;
			arg3 = local111 / local123;
			if (arg2 < 0) {
				arg2 = 0;
			} else if (arg2 > 16256) {
				arg2 = 16256;
			}
		}
		arg9 = local103 + arg12;
		arg10 = local111 + arg13;
		arg11 = local119 + arg14;
		local123 = arg11 >> 14;
		if (local123 != 0) {
			local89 = arg9 / local123;
			local91 = arg10 / local123;
			if (local89 < 7) {
				local89 = 7;
			} else if (local89 > 16256) {
				local89 = 16256;
			}
		}
		local188 = local89 - arg2 >> 3;
		local194 = local91 - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		local206 = arg7 >> 23;
		if (aBoolean162) {
			while (local40-- > 0) {
				local213 = arg4 + 1;
				arg0[arg4] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(961) int local961 = local213 + 1;
				arg0[local213] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(984) int local984 = local961 + 1;
				arg0[local961] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1007) int local1007 = local984 + 1;
				arg0[local984] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1030) int local1030 = local1007 + 1;
				arg0[local1007] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1053) int local1053 = local1030 + 1;
				arg0[local1030] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				@Pc(1076) int local1076 = local1053 + 1;
				arg0[local1053] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
				arg4 = local1076 + 1;
				arg0[local1076] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 = local89;
				arg3 = local91;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				local123 = arg11 >> 14;
				if (local123 != 0) {
					local89 = arg9 / local123;
					local91 = arg10 / local123;
					if (local89 < 7) {
						local89 = 7;
					} else if (local89 > 16256) {
						local89 = 16256;
					}
				}
				local188 = local89 - arg2 >> 3;
				local194 = local91 - arg3 >> 3;
				arg7 += local15;
				arg2 += arg7 & 0x600000;
				local206 = arg7 >> 23;
			}
			local40 = arg6 - arg5 & 0x7;
			while (local40-- > 0) {
				arg0[arg4++] = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206;
				arg2 += local188;
				arg3 += local194;
			}
			return;
		}
		while (local40-- > 0) {
			@Pc(1230) int local1230;
			if ((local1230 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[arg4] = local1230;
			}
			local213 = arg4 + 1;
			arg2 += local188;
			arg3 += local194;
			@Pc(1257) int local1257;
			if ((local1257 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1257;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1284) int local1284;
			if ((local1284 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1284;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1311) int local1311;
			if ((local1311 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1311;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1338) int local1338;
			if ((local1338 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1338;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1365) int local1365;
			if ((local1365 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1365;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1392) int local1392;
			if ((local1392 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1392;
			}
			local213++;
			arg2 += local188;
			arg3 += local194;
			@Pc(1419) int local1419;
			if ((local1419 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[local213] = local1419;
			}
			arg4 = local213 + 1;
			arg2 = local89;
			arg3 = local91;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			local123 = arg11 >> 14;
			if (local123 != 0) {
				local89 = arg9 / local123;
				local91 = arg10 / local123;
				if (local89 < 7) {
					local89 = 7;
				} else if (local89 > 16256) {
					local89 = 16256;
				}
			}
			local188 = local89 - arg2 >> 3;
			local194 = local91 - arg3 >> 3;
			arg7 += local15;
			arg2 += arg7 & 0x600000;
			local206 = arg7 >> 23;
		}
		local40 = arg6 - arg5 & 0x7;
		while (local40-- > 0) {
			@Pc(1517) int local1517;
			if ((local1517 = arg1[(arg3 & 0x3F80) + (arg2 >> 7)] >>> local206) != 0) {
				arg0[arg4] = local1517;
			}
			arg4++;
			arg2 += local188;
			arg3 += local194;
		}
	}
}
