import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YVYOADIW")
public final class Class5_Sub1_Sub1_Sub4 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!YVYOADIW", name = "C", descriptor = "Z")
	public static boolean aBoolean207;

	@OriginalMember(owner = "client!YVYOADIW", name = "D", descriptor = "Z")
	private static boolean aBoolean208;

	@OriginalMember(owner = "client!YVYOADIW", name = "F", descriptor = "I")
	public static int anInt784;

	@OriginalMember(owner = "client!YVYOADIW", name = "G", descriptor = "I")
	public static int anInt785;

	@OriginalMember(owner = "client!YVYOADIW", name = "H", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!YVYOADIW", name = "M", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!YVYOADIW", name = "N", descriptor = "I")
	private static int anInt787;

	@OriginalMember(owner = "client!YVYOADIW", name = "R", descriptor = "I")
	private static int anInt788;

	@OriginalMember(owner = "client!YVYOADIW", name = "S", descriptor = "[[I")
	private static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!YVYOADIW", name = "V", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!YVYOADIW", name = "x", descriptor = "I")
	private static int anInt782 = 168;

	@OriginalMember(owner = "client!YVYOADIW", name = "y", descriptor = "Z")
	private static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!YVYOADIW", name = "z", descriptor = "I")
	private static int anInt783 = 35857;

	@OriginalMember(owner = "client!YVYOADIW", name = "B", descriptor = "Z")
	public static boolean aBoolean206;

	@OriginalMember(owner = "client!YVYOADIW", name = "E", descriptor = "Z")
	public static boolean aBoolean209;

	@OriginalMember(owner = "client!YVYOADIW", name = "I", descriptor = "[I")
	private static int[] anIntArray202;

	@OriginalMember(owner = "client!YVYOADIW", name = "J", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!YVYOADIW", name = "K", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!YVYOADIW", name = "L", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!YVYOADIW", name = "O", descriptor = "[Lclient!SFAIBATY;")
	public static Class5_Sub1_Sub1_Sub2[] aClass5_Sub1_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!YVYOADIW", name = "P", descriptor = "[Z")
	private static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!YVYOADIW", name = "Q", descriptor = "[I")
	private static int[] anIntArray207;

	@OriginalMember(owner = "client!YVYOADIW", name = "T", descriptor = "[[I")
	private static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!YVYOADIW", name = "U", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!YVYOADIW", name = "W", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!YVYOADIW", name = "X", descriptor = "[[I")
	private static int[][] anIntArrayArray21;

	static {
		aBoolean205 = true;
		aBoolean206 = true;
		aBoolean209 = true;
		anIntArray202 = new int[512];
		anIntArray203 = new int[2048];
		anIntArray204 = new int[2048];
		anIntArray205 = new int[2048];
		for (@Pc(25) int local25 = 1; local25 < 512; local25++) {
			anIntArray202[local25] = 32768 / local25;
		}
		for (@Pc(38) int local38 = 1; local38 < 2048; local38++) {
			anIntArray203[local38] = 65536 / local38;
		}
		for (@Pc(51) int local51 = 0; local51 < 2048; local51++) {
			anIntArray204[local51] = (int) (Math.sin((double) local51 * 0.0030679615D) * 65536.0D);
			anIntArray205[local51] = (int) (Math.cos((double) local51 * 0.0030679615D) * 65536.0D);
		}
		aClass5_Sub1_Sub1_Sub2Array1 = new Class5_Sub1_Sub1_Sub2[50];
		aBooleanArray10 = new boolean[50];
		anIntArray207 = new int[50];
		anIntArrayArray20 = new int[50][];
		anIntArray208 = new int[50];
		anIntArray209 = new int[65536];
		anIntArrayArray21 = new int[50][];
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(B)V")
	public static void method556() {
		try {
			anIntArray202 = null;
			anIntArray202 = null;
			anIntArray204 = null;
			anIntArray205 = null;
			anIntArray206 = null;
			aClass5_Sub1_Sub1_Sub2Array1 = null;
			aBooleanArray10 = null;
			anIntArray207 = null;
			anIntArrayArray19 = null;
			anIntArrayArray20 = null;
			anIntArray208 = null;
			anIntArray209 = null;
			anIntArrayArray21 = null;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("48572, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "c", descriptor = "(I)V")
	public static void method557() {
		try {
			anIntArray206 = new int[Class5_Sub1_Sub1.anInt774];
			for (@Pc(12) int local12 = 0; local12 < Class5_Sub1_Sub1.anInt774; local12++) {
				anIntArray206[local12] = Class5_Sub1_Sub1.anInt773 * local12;
			}
			anInt785 = Class5_Sub1_Sub1.anInt773 / 2;
			anInt786 = Class5_Sub1_Sub1.anInt774 / 2;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("23171, " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(III)V")
	public static void method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			anIntArray206 = new int[arg0];
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				anIntArray206[local7] = arg1 * local7;
			}
			anInt785 = arg1 / 2;
			anInt786 = arg0 / 2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("64307, " + -604 + ", " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "b", descriptor = "(B)V")
	public static void method559() {
		try {
			anIntArrayArray19 = null;
			for (@Pc(7) int local7 = 0; local7 < 50; local7++) {
				anIntArrayArray20[local7] = null;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("45205, " + 101 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(ZI)V")
	public static void method560(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				anInt782 = -410;
			}
			if (anIntArrayArray19 == null) {
				anInt788 = 20;
				if (aBoolean206) {
					anIntArrayArray19 = new int[anInt788][16384];
				} else {
					anIntArrayArray19 = new int[anInt788][65536];
				}
				for (@Pc(23) int local23 = 0; local23 < 50; local23++) {
					anIntArrayArray20[local23] = null;
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("69542, " + arg0 + ", " + 20 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(Lclient!TXPLZUUI;Z)V")
	public static void method561(@OriginalArg(0) Class40 arg0) {
		try {
			anInt787 = 0;
			for (@Pc(13) int local13 = 0; local13 < 50; local13++) {
				try {
					aClass5_Sub1_Sub1_Sub2Array1[local13] = new Class5_Sub1_Sub1_Sub2(arg0, String.valueOf(local13), 0);
					if (aBoolean206 && aClass5_Sub1_Sub1_Sub2Array1[local13].anInt630 == 128) {
						aClass5_Sub1_Sub1_Sub2Array1[local13].method412();
					} else {
						aClass5_Sub1_Sub1_Sub2Array1[local13].method413();
					}
					anInt787++;
				} catch (@Pc(51) Exception local51) {
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("13612, " + arg0 + ", " + false + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(II)I")
	public static int method562(@OriginalArg(0) int arg0) {
		try {
			if (anIntArray207[arg0] != 0) {
				return anIntArray207[arg0];
			}
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(20) int local20 = anIntArrayArray21[arg0].length;
			for (@Pc(32) int local32 = 0; local32 < local20; local32++) {
				local11 += anIntArrayArray21[arg0][local32] >> 16 & 0xFF;
				local13 += anIntArrayArray21[arg0][local32] >> 8 & 0xFF;
				local15 += anIntArrayArray21[arg0][local32] & 0xFF;
			}
			@Pc(88) int local88 = (local11 / local20 << 16) + (local13 / local20 << 8) + local15 / local20;
			local88 = method566(local88, 1.4D);
			if (local88 == 0) {
				local88 = 1;
			}
			anIntArray207[arg0] = local88;
			return local88;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("83198, " + arg0 + ", " + -826 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "b", descriptor = "(ZI)V")
	public static void method563(@OriginalArg(1) int arg0) {
		try {
			if (anIntArrayArray20[arg0] != null) {
				anIntArrayArray19[anInt788++] = anIntArrayArray20[arg0];
				anIntArrayArray20[arg0] = null;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32938, " + false + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "d", descriptor = "(I)[I")
	private static int[] method564(@OriginalArg(0) int arg0) {
		anIntArray208[arg0] = anInt789++;
		if (anIntArrayArray20[arg0] != null) {
			return anIntArrayArray20[arg0];
		}
		@Pc(27) int[] local27;
		@Pc(39) int local39;
		if (anInt788 > 0) {
			local27 = anIntArrayArray19[--anInt788];
			anIntArrayArray19[anInt788] = null;
		} else {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			for (local39 = 0; local39 < anInt787; local39++) {
				if (anIntArrayArray20[local39] != null && (anIntArray208[local39] < local35 || local37 == -1)) {
					local35 = anIntArray208[local39];
					local37 = local39;
				}
			}
			local27 = anIntArrayArray20[local37];
			anIntArrayArray20[local37] = null;
		}
		anIntArrayArray20[arg0] = local27;
		@Pc(79) Class5_Sub1_Sub1_Sub2 local79 = aClass5_Sub1_Sub1_Sub2Array1[arg0];
		@Pc(83) int[] local83 = anIntArrayArray21[arg0];
		@Pc(106) int local106;
		if (aBoolean206) {
			aBooleanArray10[arg0] = false;
			for (local39 = 0; local39 < 4096; local39++) {
				local106 = local27[local39] = local83[local79.aByteArray17[local39]] & 0xF8F8FF;
				if (local106 == 0) {
					aBooleanArray10[arg0] = true;
				}
				local27[local39 + 4096] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 8192] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 12288] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		} else {
			if (local79.anInt626 == 64) {
				for (local39 = 0; local39 < 128; local39++) {
					for (local106 = 0; local106 < 128; local106++) {
						local27[local106 + (local39 << 7)] = local83[local79.aByteArray17[(local106 >> 1) + (local39 >> 1 << 6)]];
					}
				}
			} else {
				for (local39 = 0; local39 < 16384; local39++) {
					local27[local39] = local83[local79.aByteArray17[local39]];
				}
			}
			aBooleanArray10[arg0] = false;
			for (local39 = 0; local39 < 16384; local39++) {
				local27[local39] &= 0xF8F8FF;
				local106 = local27[local39];
				if (local106 == 0) {
					aBooleanArray10[arg0] = true;
				}
				local27[local39 + 16384] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 32768] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 49152] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(ID)V")
	public static void method565(@OriginalArg(1) double arg0) {
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
					local279 = method566(local279, local9);
					if (local279 == 0) {
						local279 = 1;
					}
					anIntArray209[local11++] = local279;
				}
			}
			for (@Pc(312) int local312 = 0; local312 < 50; local312++) {
				if (aClass5_Sub1_Sub1_Sub2Array1[local312] != null) {
					@Pc(323) int[] local323 = aClass5_Sub1_Sub1_Sub2Array1[local312].anIntArray168;
					anIntArrayArray21[local312] = new int[local323.length];
					for (@Pc(331) int local331 = 0; local331 < local323.length; local331++) {
						anIntArrayArray21[local312][local331] = method566(local323[local331], local9);
						if ((anIntArrayArray21[local312][local331] & 0xF8F8FF) == 0 && local331 != 0) {
							anIntArrayArray21[local312][local331] = 1;
						}
					}
				}
			}
			for (@Pc(370) int local370 = 0; local370 < 50; local370++) {
				method563(local370);
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("79933, " + -620 + ", " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "b", descriptor = "(ID)I")
	private static int method566(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
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

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
			if (arg0 < Class5_Sub1_Sub1.anInt776) {
				if (arg1 > Class5_Sub1_Sub1.anInt776) {
					arg1 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
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
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class5_Sub1_Sub1.anInt773;
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
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class5_Sub1_Sub1.anInt776) {
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg0 > Class5_Sub1_Sub1.anInt776) {
					arg0 = Class5_Sub1_Sub1.anInt776;
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
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class5_Sub1_Sub1.anInt773;
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
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method568(Class5_Sub1_Sub1.anIntArray201, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					}
				}
			}
		} else if (arg2 < Class5_Sub1_Sub1.anInt776) {
			if (arg0 > Class5_Sub1_Sub1.anInt776) {
				arg0 = Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 > Class5_Sub1_Sub1.anInt776) {
				arg1 = Class5_Sub1_Sub1.anInt776;
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
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class5_Sub1_Sub1.anInt773;
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
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method568(Class5_Sub1_Sub1.anIntArray201, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "([IIIIIIII)V")
	private static void method568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(18) int local18;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(51) int local51;
		@Pc(97) int local97;
		if (aBoolean209) {
			if (aBoolean207) {
				if (arg3 - arg2 > 3) {
					local18 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local18 = 0;
				}
				if (arg3 > Class5_Sub1_Sub1.anInt779) {
					arg3 = Class5_Sub1_Sub1.anInt779;
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
					local18 = (arg5 - arg4) * anIntArray202[local51] >> 15;
				} else {
					local18 = 0;
				}
			} else {
				return;
			}
			@Pc(104) int local104;
			if (anInt784 == 0) {
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray209[arg4 >> 8];
							do {
								arg0[arg1++] = local97;
								local51--;
							} while (local51 > 0);
							return;
						}
						break;
					}
					local97 = anIntArray209[arg4 >> 8];
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
				local149 = anInt784;
				local153 = 256 - anInt784;
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray209[arg4 >> 8];
							local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
								local51--;
							} while (local51 > 0);
						}
						break;
					}
					local97 = anIntArray209[arg4 >> 8];
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
			if (aBoolean207) {
				if (arg3 > Class5_Sub1_Sub1.anInt779) {
					arg3 = Class5_Sub1_Sub1.anInt779;
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
			if (anInt784 == 0) {
				do {
					arg0[local408++] = anIntArray209[arg4 >> 8];
					arg4 += local18;
					local51--;
				} while (local51 > 0);
			} else {
				local149 = anInt784;
				local153 = 256 - anInt784;
				do {
					local97 = anIntArray209[arg4 >> 8];
					arg4 += local18;
					@Pc(467) int local467 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					arg0[local408++] = local467 + ((arg0[local408] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local408] & 0xFF00) * local149 >> 8 & 0xFF00);
					local51--;
				} while (local51 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "b", descriptor = "(IIIIIII)V")
	public static void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
			if (arg0 < Class5_Sub1_Sub1.anInt776) {
				if (arg1 > Class5_Sub1_Sub1.anInt776) {
					arg1 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
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
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class5_Sub1_Sub1.anInt773;
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
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class5_Sub1_Sub1.anInt773;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class5_Sub1_Sub1.anInt776) {
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg0 > Class5_Sub1_Sub1.anInt776) {
					arg0 = Class5_Sub1_Sub1.anInt776;
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
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class5_Sub1_Sub1.anInt773;
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
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class5_Sub1_Sub1.anInt773;
								}
							}
							method570(Class5_Sub1_Sub1.anIntArray201, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class5_Sub1_Sub1.anInt773;
						}
					}
				}
			}
		} else if (arg2 < Class5_Sub1_Sub1.anInt776) {
			if (arg0 > Class5_Sub1_Sub1.anInt776) {
				arg0 = Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 > Class5_Sub1_Sub1.anInt776) {
				arg1 = Class5_Sub1_Sub1.anInt776;
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
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class5_Sub1_Sub1.anInt773;
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
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class5_Sub1_Sub1.anInt773;
							}
						}
						method570(Class5_Sub1_Sub1.anIntArray201, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class5_Sub1_Sub1.anInt773;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "([IIIIII)V")
	private static void method570(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean207) {
			if (arg4 > Class5_Sub1_Sub1.anInt779) {
				arg4 = Class5_Sub1_Sub1.anInt779;
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
		if (anInt784 == 0) {
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
		@Pc(72) int local72 = anInt784;
		@Pc(76) int local76 = 256 - anInt784;
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

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = method564(arg18);
		aBoolean208 = !aBooleanArray10[arg18];
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
			if (arg0 < Class5_Sub1_Sub1.anInt776) {
				if (arg1 > Class5_Sub1_Sub1.anInt776) {
					arg1 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
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
					local298 = arg0 - anInt786;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg0 != arg1 && local182 < local128 || arg0 == arg1 && local182 > local155) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class5_Sub1_Sub1.anInt773;
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
					local298 = arg0 - anInt786;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if ((arg0 == arg2 || local182 >= local128) && (arg0 != arg2 || local155 <= local128)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray206[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class5_Sub1_Sub1.anInt776) {
				if (arg2 > Class5_Sub1_Sub1.anInt776) {
					arg2 = Class5_Sub1_Sub1.anInt776;
				}
				if (arg0 > Class5_Sub1_Sub1.anInt776) {
					arg0 = Class5_Sub1_Sub1.anInt776;
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
					local298 = arg1 - anInt786;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg1 != arg2 && local128 < local155 || arg1 == arg2 && local128 > local182) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class5_Sub1_Sub1.anInt773;
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
					local298 = arg1 - anInt786;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (local128 < local155) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray206[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class5_Sub1_Sub1.anInt773;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class5_Sub1_Sub1.anInt773;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg2 < Class5_Sub1_Sub1.anInt776) {
			if (arg0 > Class5_Sub1_Sub1.anInt776) {
				arg0 = Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 > Class5_Sub1_Sub1.anInt776) {
				arg1 = Class5_Sub1_Sub1.anInt776;
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
				local298 = arg2 - anInt786;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class5_Sub1_Sub1.anInt773;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class5_Sub1_Sub1.anInt773;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class5_Sub1_Sub1.anInt773;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class5_Sub1_Sub1.anInt773;
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
				local298 = arg2 - anInt786;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class5_Sub1_Sub1.anInt773;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class5_Sub1_Sub1.anInt773;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray206[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class5_Sub1_Sub1.anInt773;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method572(Class5_Sub1_Sub1.anIntArray201, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class5_Sub1_Sub1.anInt773;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!YVYOADIW", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method572(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(15) int local15;
		@Pc(40) int local40;
		if (aBoolean207) {
			local15 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > Class5_Sub1_Sub1.anInt779) {
				arg6 = Class5_Sub1_Sub1.anInt779;
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
				local15 = (arg8 - arg7) * anIntArray202[local40] >> 6;
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
		if (aBoolean206) {
			local89 = 0;
			local91 = 0;
			local95 = arg5 - anInt785;
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
			if (aBoolean208) {
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
		local95 = arg5 - anInt785;
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
		if (aBoolean208) {
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
