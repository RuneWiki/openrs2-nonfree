import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub3_Sub2_Sub1 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "Z")
	public static boolean aBoolean102;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Z")
	private static boolean aBoolean103;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public static int anInt421;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public static int anInt422;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	public static int anInt423;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	private static int anInt424;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	private static int anInt425;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[[I")
	private static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public static int anInt426;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	private static int anInt420 = -37106;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Z")
	public static boolean aBoolean101 = true;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Z")
	public static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
	private static int[] anIntArray135 = new int[512];

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "[I")
	public static int[] anIntArray136 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[I")
	public static int[] anIntArray137 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[I")
	public static int[] anIntArray138 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "[Lclient!ib;")
	public static Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "[Z")
	private static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "[I")
	private static int[] anIntArray140;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "[[I")
	private static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[[I")
	private static int[][] anIntArrayArray14;

	static {
		for (@Pc(19) int local19 = 1; local19 < 512; local19++) {
			anIntArray135[local19] = 32768 / local19;
		}
		for (@Pc(32) int local32 = 1; local32 < 2048; local32++) {
			anIntArray136[local32] = 65536 / local32;
		}
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			anIntArray137[local45] = (int) (Math.sin((double) local45 * 0.0030679615D) * 65536.0D);
			anIntArray138[local45] = (int) (Math.cos((double) local45 * 0.0030679615D) * 65536.0D);
		}
		aClass1_Sub3_Sub2_Sub3Array4 = new Class1_Sub3_Sub2_Sub3[50];
		aBooleanArray4 = new boolean[50];
		anIntArray140 = new int[50];
		anIntArrayArray13 = new int[50][];
		anIntArray141 = new int[50];
		anIntArray142 = new int[65536];
		anIntArrayArray14 = new int[50][];
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method285(@OriginalArg(0) boolean arg0) {
		try {
			anIntArray135 = null;
			anIntArray135 = null;
			anIntArray137 = null;
			anIntArray138 = null;
			anIntArray139 = null;
			aClass1_Sub3_Sub2_Sub3Array4 = null;
			if (!arg0) {
				aBooleanArray4 = null;
				anIntArray140 = null;
				anIntArrayArray12 = null;
				anIntArrayArray13 = null;
				anIntArray141 = null;
				anIntArray142 = null;
				anIntArrayArray14 = null;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("92823, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method286() {
		try {
			anIntArray139 = new int[Class1_Sub3_Sub2.anInt517];
			for (@Pc(13) int local13 = 0; local13 < Class1_Sub3_Sub2.anInt517; local13++) {
				anIntArray139[local13] = Class1_Sub3_Sub2.anInt516 * local13;
			}
			anInt422 = Class1_Sub3_Sub2.anInt516 / 2;
			anInt423 = Class1_Sub3_Sub2.anInt517 / 2;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("42019, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI)V")
	public static void method287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			anIntArray139 = new int[arg0];
			for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
				anIntArray139[local12] = arg1 * local12;
			}
			anInt422 = arg1 / 2;
			anInt423 = arg0 / 2;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("26019, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method288() {
		try {
			anIntArrayArray12 = null;
			for (@Pc(18) int local18 = 0; local18 < 50; local18++) {
				anIntArrayArray13[local18] = null;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("17512, " + 1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public static void method289() {
		try {
			if (anIntArrayArray12 == null) {
				anInt425 = 20;
				if (aBoolean101) {
					anIntArrayArray12 = new int[anInt425][16384];
				} else {
					anIntArrayArray12 = new int[anInt425][65536];
				}
				for (@Pc(22) int local22 = 0; local22 < 50; local22++) {
					anIntArrayArray13[local22] = null;
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("77136, " + 1000 + ", " + 20 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ub;B)V")
	public static void method290(@OriginalArg(0) Class39 arg0) {
		try {
			anInt424 = 0;
			for (@Pc(5) int local5 = 0; local5 < 50; local5++) {
				try {
					aClass1_Sub3_Sub2_Sub3Array4[local5] = new Class1_Sub3_Sub2_Sub3(arg0, String.valueOf(local5), 0);
					if (aBoolean101 && aClass1_Sub3_Sub2_Sub3Array4[local5].anInt506 == 128) {
						aClass1_Sub3_Sub2_Sub3Array4[local5].method342();
					} else {
						aClass1_Sub3_Sub2_Sub3Array4[local5].method343();
					}
					anInt424++;
				} catch (@Pc(43) Exception local43) {
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("77123, " + arg0 + ", " + 25 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)I")
	public static int method291(@OriginalArg(0) int arg0) {
		try {
			if (anIntArray140[arg0] != 0) {
				return anIntArray140[arg0];
			}
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = anIntArrayArray14[arg0].length;
			for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
				local9 += anIntArrayArray14[arg0][local20] >> 16 & 0xFF;
				local11 += anIntArrayArray14[arg0][local20] >> 8 & 0xFF;
				local13 += anIntArrayArray14[arg0][local20] & 0xFF;
			}
			@Pc(76) int local76 = (local9 / local18 << 16) + (local11 / local18 << 8) + local13 / local18;
			local76 = method295(local76, 1.4D);
			if (local76 == 0) {
				local76 = 1;
			}
			anIntArray140[arg0] = local76;
			return local76;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("98883, " + arg0 + ", " + true + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IZ)V")
	public static void method292(@OriginalArg(0) int arg0) {
		try {
			if (anIntArrayArray13[arg0] != null) {
				anIntArrayArray12[anInt425++] = anIntArrayArray13[arg0];
				anIntArrayArray13[arg0] = null;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("91535, " + arg0 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)[I")
	private static int[] method293(@OriginalArg(0) int arg0) {
		anIntArray141[arg0] = anInt426++;
		if (anIntArrayArray13[arg0] != null) {
			return anIntArrayArray13[arg0];
		}
		@Pc(27) int[] local27;
		@Pc(39) int local39;
		if (anInt425 > 0) {
			local27 = anIntArrayArray12[--anInt425];
			anIntArrayArray12[anInt425] = null;
		} else {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			for (local39 = 0; local39 < anInt424; local39++) {
				if (anIntArrayArray13[local39] != null && (anIntArray141[local39] < local35 || local37 == -1)) {
					local35 = anIntArray141[local39];
					local37 = local39;
				}
			}
			local27 = anIntArrayArray13[local37];
			anIntArrayArray13[local37] = null;
		}
		anIntArrayArray13[arg0] = local27;
		@Pc(79) Class1_Sub3_Sub2_Sub3 local79 = aClass1_Sub3_Sub2_Sub3Array4[arg0];
		@Pc(83) int[] local83 = anIntArrayArray14[arg0];
		@Pc(106) int local106;
		if (aBoolean101) {
			aBooleanArray4[arg0] = false;
			for (local39 = 0; local39 < 4096; local39++) {
				local106 = local27[local39] = local83[local79.aByteArray6[local39]] & 0xF8F8FF;
				if (local106 == 0) {
					aBooleanArray4[arg0] = true;
				}
				local27[local39 + 4096] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 8192] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 12288] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		} else {
			if (local79.anInt502 == 64) {
				for (local39 = 0; local39 < 128; local39++) {
					for (local106 = 0; local106 < 128; local106++) {
						local27[local106 + (local39 << 7)] = local83[local79.aByteArray6[(local106 >> 1) + (local39 >> 1 << 6)]];
					}
				}
			} else {
				for (local39 = 0; local39 < 16384; local39++) {
					local27[local39] = local83[local79.aByteArray6[local39]];
				}
			}
			aBooleanArray4[arg0] = false;
			for (local39 = 0; local39 < 16384; local39++) {
				local27[local39] &= 0xF8F8FF;
				local106 = local27[local39];
				if (local106 == 0) {
					aBooleanArray4[arg0] = true;
				}
				local27[local39 + 16384] = local106 - (local106 >>> 3) & 0xF8F8FF;
				local27[local39 + 32768] = local106 - (local106 >>> 2) & 0xF8F8FF;
				local27[local39 + 49152] = local106 - (local106 >>> 2) - (local106 >>> 3) & 0xF8F8FF;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(DI)V")
	public static void method294(@OriginalArg(0) double arg0) {
		try {
			@Pc(14) double local14 = arg0 + Math.random() * 0.03D - 0.015D;
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < 512; local18++) {
				@Pc(29) double local29 = (double) (local18 / 8) / 64.0D + 0.0078125D;
				@Pc(38) double local38 = (double) (local18 & 0x7) / 8.0D + 0.0625D;
				for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
					@Pc(47) double local47 = (double) local40 / 128.0D;
					@Pc(49) double local49 = local47;
					@Pc(51) double local51 = local47;
					@Pc(53) double local53 = local47;
					if (local38 != 0.0D) {
						@Pc(67) double local67;
						if (local47 < 0.5D) {
							local67 = local47 * (local38 + 1.0D);
						} else {
							local67 = local47 + local38 - local47 * local38;
						}
						@Pc(83) double local83 = local47 * 2.0D - local67;
						@Pc(87) double local87 = local29 + 0.3333333333333333D;
						if (local87 > 1.0D) {
							local87--;
						}
						@Pc(101) double local101 = local29 - 0.3333333333333333D;
						if (local101 < 0.0D) {
							local101++;
						}
						if (local87 * 6.0D < 1.0D) {
							local49 = local83 + (local67 - local83) * 6.0D * local87;
						} else if (local87 * 2.0D < 1.0D) {
							local49 = local67;
						} else if (local87 * 3.0D < 2.0D) {
							local49 = local83 + (local67 - local83) * (0.6666666666666666D - local87) * 6.0D;
						} else {
							local49 = local83;
						}
						if (local29 * 6.0D < 1.0D) {
							local51 = local83 + (local67 - local83) * 6.0D * local29;
						} else if (local29 * 2.0D < 1.0D) {
							local51 = local67;
						} else if (local29 * 3.0D < 2.0D) {
							local51 = local83 + (local67 - local83) * (0.6666666666666666D - local29) * 6.0D;
						} else {
							local51 = local83;
						}
						if (local101 * 6.0D < 1.0D) {
							local53 = local83 + (local67 - local83) * 6.0D * local101;
						} else if (local101 * 2.0D < 1.0D) {
							local53 = local67;
						} else if (local101 * 3.0D < 2.0D) {
							local53 = local83 + (local67 - local83) * (0.6666666666666666D - local101) * 6.0D;
						} else {
							local53 = local83;
						}
					}
					@Pc(264) int local264 = (int) (local49 * 256.0D);
					@Pc(269) int local269 = (int) (local51 * 256.0D);
					@Pc(274) int local274 = (int) (local53 * 256.0D);
					@Pc(284) int local284 = (local264 << 16) + (local269 << 8) + local274;
					@Pc(288) int local288 = method295(local284, local14);
					anIntArray142[local16++] = local288;
				}
			}
			for (@Pc(303) int local303 = 0; local303 < 50; local303++) {
				if (aClass1_Sub3_Sub2_Sub3Array4[local303] != null) {
					@Pc(314) int[] local314 = aClass1_Sub3_Sub2_Sub3Array4[local303].anIntArray177;
					anIntArrayArray14[local303] = new int[local314.length];
					for (@Pc(322) int local322 = 0; local322 < local314.length; local322++) {
						anIntArrayArray14[local303][local322] = method295(local314[local322], local14);
					}
				}
			}
			for (@Pc(345) int local345 = 0; local345 < 50; local345++) {
				method292(local345);
			}
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("5714, " + arg0 + ", " + -72 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ID)I")
	private static int method295(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
			if (arg0 < Class1_Sub3_Sub2.anInt519) {
				if (arg1 > Class1_Sub3_Sub2.anInt519) {
					arg1 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
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
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
									arg5 += local57;
									arg4 += local30;
									arg8 += local59;
									arg7 += local32;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += local57;
							arg3 += local3;
							arg8 += local59;
							arg6 += local5;
							arg0 += Class1_Sub3_Sub2.anInt516;
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
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg5 += local30;
									arg3 += local3;
									arg8 += local32;
									arg6 += local5;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg4 += local57;
							arg3 += local3;
							arg7 += local59;
							arg6 += local5;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt519) {
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt519) {
					arg0 = Class1_Sub3_Sub2.anInt519;
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
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
									arg3 += local3;
									arg5 += local57;
									arg6 += local5;
									arg8 += local59;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += local3;
							arg4 += local30;
							arg6 += local5;
							arg7 += local32;
							arg1 += Class1_Sub3_Sub2.anInt516;
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
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
									arg3 += local57;
									arg4 += local30;
									arg6 += local59;
									arg7 += local32;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method297(Class1_Sub3_Sub2.anIntArray178, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
							arg5 += local3;
							arg4 += local30;
							arg8 += local5;
							arg7 += local32;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt519) {
			if (arg0 > Class1_Sub3_Sub2.anInt519) {
				arg0 = Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt519) {
				arg1 = Class1_Sub3_Sub2.anInt519;
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
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
								arg4 += local30;
								arg3 += local3;
								arg7 += local32;
								arg6 += local5;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += local30;
						arg5 += local57;
						arg7 += local32;
						arg8 += local59;
						arg2 += Class1_Sub3_Sub2.anInt516;
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
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
								arg4 += local3;
								arg5 += local57;
								arg7 += local5;
								arg8 += local59;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method297(Class1_Sub3_Sub2.anIntArray178, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += local30;
						arg5 += local57;
						arg6 += local32;
						arg8 += local59;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIIIII)V")
	private static void method297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(18) int local18;
		@Pc(149) int local149;
		@Pc(153) int local153;
		@Pc(51) int local51;
		@Pc(97) int local97;
		if (aBoolean104) {
			if (aBoolean102) {
				if (arg3 - arg2 > 3) {
					local18 = (arg5 - arg4) / (arg3 - arg2);
				} else {
					local18 = 0;
				}
				if (arg3 > Class1_Sub3_Sub2.anInt522) {
					arg3 = Class1_Sub3_Sub2.anInt522;
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
					local18 = (arg5 - arg4) * anIntArray135[local51] >> 15;
				} else {
					local18 = 0;
				}
			} else {
				return;
			}
			@Pc(104) int local104;
			if (anInt421 == 0) {
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray142[arg4 >> 8];
							do {
								arg0[arg1++] = local97;
								local51--;
							} while (local51 > 0);
							return;
						}
						break;
					}
					local97 = anIntArray142[arg4 >> 8];
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
				local149 = anInt421;
				local153 = 256 - anInt421;
				while (true) {
					local51--;
					if (local51 < 0) {
						local51 = arg3 - arg2 & 0x3;
						if (local51 > 0) {
							local97 = anIntArray142[arg4 >> 8];
							local97 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
							do {
								arg0[arg1++] = local97 + ((arg0[arg1] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[arg1] & 0xFF00) * local149 >> 8 & 0xFF00);
								local51--;
							} while (local51 > 0);
						}
						break;
					}
					local97 = anIntArray142[arg4 >> 8];
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
			if (aBoolean102) {
				if (arg3 > Class1_Sub3_Sub2.anInt522) {
					arg3 = Class1_Sub3_Sub2.anInt522;
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
			if (anInt421 == 0) {
				do {
					arg0[local408++] = anIntArray142[arg4 >> 8];
					arg4 += local18;
					local51--;
				} while (local51 > 0);
			} else {
				local149 = anInt421;
				local153 = 256 - anInt421;
				do {
					local97 = anIntArray142[arg4 >> 8];
					arg4 += local18;
					@Pc(467) int local467 = ((local97 & 0xFF00FF) * local153 >> 8 & 0xFF00FF) + ((local97 & 0xFF00) * local153 >> 8 & 0xFF00);
					arg0[local408++] = local467 + ((arg0[local408] & 0xFF00FF) * local149 >> 8 & 0xFF00FF) + ((arg0[local408] & 0xFF00) * local149 >> 8 & 0xFF00);
					local51--;
				} while (local51 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
			if (arg0 < Class1_Sub3_Sub2.anInt519) {
				if (arg1 > Class1_Sub3_Sub2.anInt519) {
					arg1 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
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
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local33;
									arg4 += local18;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local33;
							arg3 += local3;
							arg0 += Class1_Sub3_Sub2.anInt516;
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
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local18;
									arg3 += local3;
									arg0 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local33;
							arg3 += local3;
							arg0 += Class1_Sub3_Sub2.anInt516;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt519) {
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt519) {
					arg0 = Class1_Sub3_Sub2.anInt519;
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
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local3;
									arg5 += local33;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local3;
							arg4 += local18;
							arg1 += Class1_Sub3_Sub2.anInt516;
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
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local33;
									arg4 += local18;
									arg1 += Class1_Sub3_Sub2.anInt516;
								}
							}
							method299(Class1_Sub3_Sub2.anIntArray178, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local3;
							arg4 += local18;
							arg1 += Class1_Sub3_Sub2.anInt516;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt519) {
			if (arg0 > Class1_Sub3_Sub2.anInt519) {
				arg0 = Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt519) {
				arg1 = Class1_Sub3_Sub2.anInt519;
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
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local18;
								arg3 += local3;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local18;
						arg5 += local33;
						arg2 += Class1_Sub3_Sub2.anInt516;
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
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local3;
								arg5 += local33;
								arg2 += Class1_Sub3_Sub2.anInt516;
							}
						}
						method299(Class1_Sub3_Sub2.anIntArray178, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local18;
						arg5 += local33;
						arg2 += Class1_Sub3_Sub2.anInt516;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIII)V")
	private static void method299(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean102) {
			if (arg4 > Class1_Sub3_Sub2.anInt522) {
				arg4 = Class1_Sub3_Sub2.anInt522;
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
		if (anInt421 == 0) {
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
		@Pc(72) int local72 = anInt421;
		@Pc(76) int local76 = 256 - anInt421;
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = method293(arg18);
		aBoolean103 = !aBooleanArray4[arg18];
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
			if (arg0 < Class1_Sub3_Sub2.anInt519) {
				if (arg1 > Class1_Sub3_Sub2.anInt519) {
					arg1 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
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
					local298 = arg0 - anInt423;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg0 != arg1 && local182 < local128 || arg0 == arg1 && local182 > local155) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local182;
									arg4 += local155;
									arg8 += local184;
									arg7 += local157;
									arg0 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local182;
							arg3 += local128;
							arg8 += local184;
							arg6 += local130;
							arg0 += Class1_Sub3_Sub2.anInt516;
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
					local298 = arg0 - anInt423;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if ((arg0 == arg2 || local182 >= local128) && (arg0 != arg2 || local155 <= local128)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray139[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg5 += local155;
									arg3 += local128;
									arg8 += local157;
									arg6 += local130;
									arg0 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg4 += local182;
							arg3 += local128;
							arg7 += local184;
							arg6 += local130;
							arg0 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < Class1_Sub3_Sub2.anInt519) {
				if (arg2 > Class1_Sub3_Sub2.anInt519) {
					arg2 = Class1_Sub3_Sub2.anInt519;
				}
				if (arg0 > Class1_Sub3_Sub2.anInt519) {
					arg0 = Class1_Sub3_Sub2.anInt519;
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
					local298 = arg1 - anInt423;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (arg1 != arg2 && local128 < local155 || arg1 == arg2 && local128 > local182) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local128;
									arg5 += local182;
									arg6 += local130;
									arg8 += local184;
									arg1 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
							arg3 += local128;
							arg4 += local155;
							arg6 += local130;
							arg7 += local157;
							arg1 += Class1_Sub3_Sub2.anInt516;
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
					local298 = arg1 - anInt423;
					local46 += local66 * local298;
					local76 += local96 * local298;
					local106 += local126 * local298;
					if (local128 < local155) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray139[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
									arg3 += local182;
									arg4 += local155;
									arg6 += local184;
									arg7 += local157;
									arg1 += Class1_Sub3_Sub2.anInt516;
									local46 += local66;
									local76 += local96;
									local106 += local126;
								}
							}
							method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
							arg5 += local128;
							arg4 += local155;
							arg8 += local130;
							arg7 += local157;
							arg1 += Class1_Sub3_Sub2.anInt516;
							local46 += local66;
							local76 += local96;
							local106 += local126;
						}
					}
				}
			}
		} else if (arg2 < Class1_Sub3_Sub2.anInt519) {
			if (arg0 > Class1_Sub3_Sub2.anInt519) {
				arg0 = Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 > Class1_Sub3_Sub2.anInt519) {
				arg1 = Class1_Sub3_Sub2.anInt519;
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
				local298 = arg2 - anInt423;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class1_Sub3_Sub2.anInt516;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class1_Sub3_Sub2.anInt516;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local155;
								arg3 += local128;
								arg7 += local157;
								arg6 += local130;
								arg2 += Class1_Sub3_Sub2.anInt516;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
						arg4 += local155;
						arg5 += local182;
						arg7 += local157;
						arg8 += local184;
						arg2 += Class1_Sub3_Sub2.anInt516;
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
				local298 = arg2 - anInt423;
				local46 += local66 * local298;
				local76 += local96 * local298;
				local106 += local126 * local298;
				if (local155 < local182) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class1_Sub3_Sub2.anInt516;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class1_Sub3_Sub2.anInt516;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray139[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, local46, local76, local106, local56, local86, local116);
								arg4 += local128;
								arg5 += local182;
								arg7 += local130;
								arg8 += local184;
								arg2 += Class1_Sub3_Sub2.anInt516;
								local46 += local66;
								local76 += local96;
								local106 += local126;
							}
						}
						method301(Class1_Sub3_Sub2.anIntArray178, local4, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, local46, local76, local106, local56, local86, local116);
						arg3 += local155;
						arg5 += local182;
						arg6 += local157;
						arg8 += local184;
						arg2 += Class1_Sub3_Sub2.anInt516;
						local46 += local66;
						local76 += local96;
						local106 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method301(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg5 >= arg6) {
			return;
		}
		@Pc(15) int local15;
		@Pc(40) int local40;
		if (aBoolean102) {
			local15 = (arg8 - arg7) / (arg6 - arg5);
			if (arg6 > Class1_Sub3_Sub2.anInt522) {
				arg6 = Class1_Sub3_Sub2.anInt522;
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
				local15 = (arg8 - arg7) * anIntArray135[local40] >> 6;
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
		if (aBoolean101) {
			local89 = 0;
			local91 = 0;
			local95 = arg5 - anInt422;
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
			if (aBoolean103) {
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
		local95 = arg5 - anInt422;
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
		if (aBoolean103) {
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
