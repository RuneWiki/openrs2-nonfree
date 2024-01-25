import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!jr;")
	public static Class1_Sub4_Sub15 aClass1_Sub4_Sub15_2;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!ct;")
	public static Class30 aClass30_51;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public static int anInt3313;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!i;")
	public static Class86 aClass86_3;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "[[[Lclient!tg;")
	private static Class195[][][] aClass195ArrayArrayArray2;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "[B")
	private static byte[] aByteArray62;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public static int anInt3316;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[S")
	private static short[] aShortArray74;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "[S")
	private static short[] aShortArray75;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt3319;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public static int anInt3320;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "[I")
	private static int[] anIntArray240;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	public static int anInt3321;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	public static int anInt3322;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "[B")
	private static byte[] aByteArray63;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	public static int anInt3324;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "Lclient!dq;")
	private static Class38 aClass38_16;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!dq;")
	private static final Class38 aClass38_15 = new Class38(16);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[B")
	private static final byte[] aByteArray61 = new byte[1];

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt3311 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "[S")
	private static final short[] aShortArray73 = new short[1];

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt3312 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_21 = new Class42();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt3316 = arg0 - anInt3320;
		anInt3315 = arg1 - anInt3314;
		anInt3318 = arg2 - anInt3320;
		anInt3322 = arg3 - anInt3314;
		anInt3325 = arg4;
		anInt3317 = arg5;
		anInt3323 = arg6;
		anInt3319 = arg7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ct;)V")
	public static void method3040(@OriginalArg(0) Class30 arg0) {
		aClass30_51 = arg0;
		aClass38_15.method1466();
		@Pc(9) int local9 = aClass30_51.method1153("details");
		@Pc(14) int[] local14 = aClass30_51.method1156(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class1_Sub4_Sub15 local25 = Static288.method5080(local14[local16], aClass30_51, local9);
			aClass38_15.method1472(local25, (long) local25.anInt3236);
		}
		Static130.method2676(false);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;Lclient!at;IIII[I[I)V")
	private static void method3041(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method2132();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method2132();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray62[arg4 + arg5 * anInt3324] = (byte) local21;
					aByteArray63[arg4 + arg5 * anInt3324] = 0;
				} else {
					aByteArray63[arg4 + arg5 * anInt3324] = (byte) local21;
					aByteArray65[arg4 + arg5 * anInt3324] = 0;
					aByteArray62[arg4 + arg5 * anInt3324] = arg1.method2122();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method2132();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method2132();
				local127 = arg1.method2132();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method2132();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray62[arg4 + arg5 * anInt3324] = (byte) local123;
				aByteArray63[arg4 + arg5 * anInt3324] = (byte) local125;
				aByteArray65[arg4 + arg5 * anInt3324] = (byte) local127;
				if (local139 == 1) {
					aShortArray74[arg4 + arg5 * anInt3324] = (short) (arg1.method2161() + 1);
					aByteArray64[arg4 + arg5 * anInt3324] = arg1.method2122();
				} else if (local139 > 1) {
					aShortArray74[arg4 + arg5 * anInt3324] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2161();
						local218[local220] = arg1.method2122();
					}
					aClass38_16.method1472(new Class1_Sub18(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method2161();
						local218[local220] = arg1.method2122();
					}
				}
				if (aClass195ArrayArrayArray2[local118 - 1][arg2 - (anInt3320 >> 6)][arg3 - (anInt3314 >> 6)] == null) {
					aClass195ArrayArrayArray2[local118 - 1][arg2 - (anInt3320 >> 6)][arg3 - (anInt3314 >> 6)] = new Class195();
				}
				@Pc(338) Class32_Sub5 local338 = new Class32_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass195ArrayArrayArray2[local118 - 1][arg2 - (anInt3320 >> 6)][arg3 - (anInt3314 >> 6)].method5300(local338);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method3042(@OriginalArg(0) int arg0) {
		aClass1_Sub4_Sub15_2 = (Class1_Sub4_Sub15) aClass38_15.method1475((long) arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!jr;")
	public static Class1_Sub4_Sub15 method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub4_Sub15 local4 = (Class1_Sub4_Sub15) aClass38_15.method1474(); local4 != null; local4 = (Class1_Sub4_Sub15) aClass38_15.method1470()) {
			if (local4.aBoolean219 && local4.method2974(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	private static void method3044() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt3324; local1++) {
			for (local4 = 0; local4 < anInt3321; local4++) {
				local15 = aShortArray74[local1 + local4 * anInt3324] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub18 local31 = (Class1_Sub18) aClass38_16.method1475((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray44.length; local35++) {
								@Pc(45) Class71 local45 = Static219.method4081(local31.aShortArray44[local35] & 0xFFFF);
								local48 = local45.anInt2369;
								if (local45.anIntArray178 != null) {
									local45 = local45.method2282();
									if (local45 != null) {
										local48 = local45.anInt2369;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class1_Sub17 local68 = new Class1_Sub17(local48);
									local68.anInt1641 = local1;
									local68.anInt1651 = local4;
									aClass42_21.method1549(local68);
								}
							}
						}
					} else {
						@Pc(91) Class71 local91 = Static219.method4081(local15 - 1);
						local35 = local91.anInt2369;
						if (local91.anIntArray178 != null) {
							local91 = local91.method2282();
							if (local91 != null) {
								local35 = local91.anInt2369;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class1_Sub17 local114 = new Class1_Sub17(local35);
							local114.anInt1641 = local1;
							local114.anInt1651 = local4;
							aClass42_21.method1549(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass195ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass195ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class195 local149 = aClass195ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class32_Sub5 local156 = (Class32_Sub5) local149.method5302(); local156 != null; local156 = (Class32_Sub5) local149.method5298()) {
							if (local156.aShortArray90 != null) {
								for (local48 = 0; local48 < local156.aShortArray90.length; local48++) {
									@Pc(172) Class71 local172 = Static219.method4081(local156.aShortArray90[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt2369;
									if (local172.anIntArray178 != null) {
										local172 = local172.method2282();
										if (local172 != null) {
											local175 = local172.anInt2369;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class1_Sub17 local195 = new Class1_Sub17(local175);
										local195.anInt1641 = (local15 + (anInt3320 >> 6)) * 64 + local156.aByte61 - anInt3320;
										local195.anInt1651 = (local140 + (anInt3314 >> 6)) * 64 + local156.aByte60 - anInt3314;
										aClass42_21.method1549(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;IIIIIII[S[BZ)V")
	private static void method3045(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method4653(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray240[arg6];
					if (arg10 || local32 != 0) {
						arg0.method4653(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static50.method1205(arg4, arg7 >> 6 & 0x3, anIntArray240[arg6], arg3, arg1, arg0, arg2, local20, anInt3313, arg5, aByteArrayArrayArray4, local32);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(126) Class71 local126 = Static219.method4081(arg8[local100] & 0xFFFF);
				if (local126.anInt2368 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt2377 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method4586(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method4604(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4586(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method4604(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method4586(arg1, arg2, arg4, -1, 0);
							arg0.method4604(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method4586(local20, arg2, arg4, -1, 0);
							arg0.method4604(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4586(local20, arg2, arg4, -1, 0);
							arg0.method4604(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method4586(arg1, arg2, arg4, -1, 0);
							arg0.method4604(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method4604(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method4604(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method4604(local20, local32, 1, local132, 0);
						} else {
							arg0.method4604(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4604(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4604(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;)Lclient!eb;")
	public static Class42 method3046(@OriginalArg(0) Class63 arg0) {
		@Pc(3) int local3 = anInt3318 - anInt3316;
		@Pc(7) int local7 = anInt3315 - anInt3322;
		@Pc(15) int local15 = (anInt3323 - anInt3325 << 16) / local3;
		@Pc(23) int local23 = (anInt3319 - anInt3317 << 16) / local7;
		return method3048(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ic;II)V")
	public static void method3047(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static188.anInt3800; local1++) {
			anIntArray240[local1 + 1] = method3059(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!eb;")
	private static Class42 method3048(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub17 local4 = (Class1_Sub17) aClass42_21.method1543(); local4 != null; local4 = (Class1_Sub17) aClass42_21.method1551()) {
			method3049(arg0, local4, arg1, arg2);
		}
		return aClass42_21;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;Lclient!eg;IIII)V")
	private static void method3049(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class1_Sub17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt1644 = anInt3325 + (arg2 * (arg1.anInt1641 - anInt3316) >> 16);
		arg1.anInt1643 = anInt3319 - (arg3 * (arg1.anInt1651 - anInt3322) >> 16);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lclient!ig;")
	public static Class89 method3050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class89 local3 = new Class89();
		for (@Pc(8) Class1_Sub4_Sub15 local8 = (Class1_Sub4_Sub15) aClass38_15.method1474(); local8 != null; local8 = (Class1_Sub4_Sub15) aClass38_15.method1470()) {
			if (local8.aBoolean219 && local8.method2974(arg0, arg1)) {
				local3.method2720(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;II)V")
	public static void method3052(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7(aClass30_51.method1184(aClass1_Sub4_Sub15_2.aString23, "area"));
		@Pc(13) int local13 = local9.method2132();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method2132();
		}
		@Pc(33) int local33 = local9.method2132();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method2132();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt2219 < local9.aByteArray41.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method2132() == 0) {
					local58 = local9.method2132();
					local62 = local9.method2132();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt3320;
							local84 = local62 * 64 + local67 - anInt3314;
							method3041(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method2132();
					local62 = local9.method2132();
					local64 = local9.method2132();
					local67 = local9.method2132();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt3320;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt3314;
							method3041(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray66 = new byte[anInt3324 * anInt3321];
			aShortArray75 = new short[anInt3324 * anInt3321];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt3324 * anInt3321];
				for (local64 = 0; local64 < aClass195ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass195ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class195 local205 = aClass195ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class32_Sub5 local212 = (Class32_Sub5) local205.method5302(); local212 != null; local212 = (Class32_Sub5) local205.method5298()) {
								local191[local64 * 64 + local212.aByte61 + (local67 * 64 + local212.aByte60) * anInt3324] = (byte) local212.anInt5486;
							}
						}
					}
				}
				method3057(local191, aByteArray66, aShortArray75, arg1, arg2);
				for (local67 = 0; local67 < aClass195ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass195ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class195 local276 = aClass195ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class32_Sub5 local283 = (Class32_Sub5) local276.method5302(); local283 != null; local283 = (Class32_Sub5) local276.method5298()) {
								local148 = local67 * 64 + local283.aByte61 + (local76 * 64 + local283.aByte60) * anInt3324;
								local283.anInt5486 = (aByteArray66[local148] & 0xFF) << 16 | aShortArray75[local148] & 0xFFFF;
								if (local283.anInt5486 != 0) {
									local283.anInt5486 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3057(aByteArray62, aByteArray66, aShortArray75, arg1, arg2);
			aByteArray62 = null;
			method3044();
			return;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!fp;IIII)V")
	private static void method3053(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt3318 - anInt3316;
		@Pc(7) int local7 = anInt3315 - anInt3322;
		if (anInt3318 < anInt3324) {
			local3++;
		}
		if (anInt3315 < anInt3321) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(178) int local178;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt3325;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt3325;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt3316 + local17;
				if (local50 >= 0 && local50 < anInt3324) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3319 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3319 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt3322;
							local172 = local50 + local93 * anInt3324;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt3321) {
								local174 = (aByteArray66[local172] & 0xFF) << 16 | aShortArray75[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray63[local172] & 0xFF;
								local178 = aShortArray74[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass1_Sub4_Sub15_2.anInt3246 != -1) {
									local174 = aClass1_Sub4_Sub15_2.anInt3246 | 0xFF000000;
								} else if ((local17 + anInt3316 & 0x4) == (local57 + anInt3315 & 0x4)) {
									local174 = anIntArray240[Static50.anInt1268 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method4653(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method3045(arg0, local28, local70, local44, local84, local174, local176, aByteArray65[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class1_Sub18 local280 = (Class1_Sub18) aClass38_16.method1475((long) (local50 << 16 | local93));
								if (local280 != null) {
									method3045(arg0, local28, local70, local44, local84, local174, local176, aByteArray65[local172], local280.aShortArray44, local280.aByteArray36, true);
								}
							} else {
								aShortArray73[0] = (short) (local178 - 1);
								aByteArray61[0] = aByteArray64[local172];
								method3045(arg0, local28, local70, local44, local84, local174, local176, aByteArray65[local172], aShortArray73, aByteArray61, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3319 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3319 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub4_Sub15_2.anInt3246 != -1) {
							local93 = aClass1_Sub4_Sub15_2.anInt3246 | 0xFF000000;
						} else if ((local17 + anInt3316 & 0x4) == (local57 + anInt3315 & 0x4)) {
							local93 = anIntArray240[Static50.anInt1268 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method4653(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt3325;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt3325;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt3316;
				if (local57 >= 0 && local57 < anInt3324) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt3319 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt3319 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt3322;
							if (local172 >= 0 && local172 < anInt3321) {
								local174 = aShortArray74[local57 + local172 * anInt3324] & 0xFFFF;
								if (local174 <= 0) {
									method3056(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class1_Sub18 local457 = (Class1_Sub18) aClass38_16.method1475((long) (local57 << 16 | local172));
									if (local457 != null) {
										method3056(arg0, local40, local80, local50, local93, local457.aShortArray44, local457.aByteArray36);
									}
								} else {
									aShortArray73[0] = (short) (local174 - 1);
									aByteArray61[0] = aByteArray64[local57 + local172 * anInt3324];
									method3056(arg0, local40, local80, local50, local93, aShortArray73, aByteArray61);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt3316 >> 6;
		local44 = anInt3322 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt3318 >> 6;
		local57 = anInt3315 >> 6;
		if (local50 >= aClass195ArrayArrayArray2[0].length) {
			local50 = aClass195ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass195ArrayArrayArray2[0][0].length) {
			local57 = aClass195ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class195 local587 = aClass195ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt3320 >> 6)) * 64;
						local174 = (local84 + (anInt3314 >> 6)) * 64;
						for (@Pc(610) Class32_Sub5 local610 = (Class32_Sub5) local587.method5302(); local610 != null; local610 = (Class32_Sub5) local587.method5298()) {
							local178 = local172 + local610.aByte61 - anInt3320 - anInt3316;
							local629 = local174 + local610.aByte60 - anInt3314 - anInt3322;
							local639 = (arg1 * local178 >> 16) + anInt3325;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt3325;
							local663 = anInt3319 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt3319 - (arg2 * local629 >> 16);
							method3045(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt5486, local610.aByte62 & 0xFF, local610.aByte59, local610.aShortArray90, local610.aByteArray82, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class195 local725 = aClass195ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt3320 >> 6)) * 64;
						local176 = (local93 + (anInt3314 >> 6)) * 64;
						for (@Pc(748) Class32_Sub5 local748 = (Class32_Sub5) local725.method5302(); local748 != null; local748 = (Class32_Sub5) local725.method5298()) {
							local629 = local174 + local748.aByte61 - anInt3320 - anInt3316;
							local639 = local176 + local748.aByte60 - anInt3314 - anInt3322;
							local651 = (arg1 * local629 >> 16) + anInt3325;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt3325;
							local673 = anInt3319 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt3319 - (arg2 * local639 >> 16);
							method3056(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray90, local748.aByteArray82);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public static void method3054() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass86_3.anInt2801; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub4_Sub15_2.method2982(aClass86_3.anIntArray210[local4] & 0x3FFF, aClass86_3.anIntArray210[local4] >> 28 & 0x3, local2, aClass86_3.anIntArray210[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub17 local42 = new Class1_Sub17(aClass86_3.anIntArray211[local4]);
				local42.anInt1641 = local2[1] - anInt3320;
				local42.anInt1651 = local2[2] - anInt3314;
				aClass42_21.method1549(local42);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lclient!jr;")
	public static Class1_Sub4_Sub15 method3055(@OriginalArg(0) int arg0) {
		return (Class1_Sub4_Sub15) aClass38_15.method1475((long) arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fp;IIII[S[B)V")
	private static void method3056(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class71 local13 = Static219.method4081(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt2368;
			if (local16 != -1) {
				@Pc(23) Class85 local23 = Static251.method4730(local16);
				@Pc(47) Class4 local47 = local23.method2629(local13.aBoolean161 ? arg6[local4] >> 6 & 0x3 : 0, local13.aBoolean166 ? local13.lb : false, arg0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5961() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5963() >> 2;
					if (local23.aBoolean202) {
						@Pc(69) int local69 = local13.anInt2411;
						@Pc(72) int local72 = local13.anInt2376;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt2756 == 0) {
							local47.method5964(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5955(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt2756 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([B[B[SII)V")
	private static void method3057(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt3321];
		@Pc(5) int[] local5 = new int[anInt3321];
		@Pc(8) int[] local8 = new int[anInt3321];
		@Pc(11) int[] local11 = new int[anInt3321];
		@Pc(14) int[] local14 = new int[anInt3321];
		for (@Pc(16) int local16 = -5; local16 < anInt3324; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt3321; local27++) {
				@Pc(49) Class189 local49;
				@Pc(85) int local85;
				if (local21 < anInt3324) {
					local41 = arg0[local21 + local27 * anInt3324] & 0xFF;
					if (local41 > 0) {
						local49 = Static49.method1146(local41 - 1);
						local2[local27] += local49.anInt5577;
						local5[local27] += local49.anInt5580;
						local8[local27] += local49.anInt5571;
						local11[local27] += local49.anInt5574;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt3324] & 0xFF;
					if (local41 > 0) {
						local49 = Static49.method1146(local41 - 1);
						local2[local27] -= local49.anInt5577;
						local5[local27] -= local49.anInt5580;
						local8[local27] -= local49.anInt5571;
						local11[local27] -= local49.anInt5574;
						local85 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(157) int local157 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				for (@Pc(165) int local165 = -5; local165 < anInt3321; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt3321) {
						local41 += local2[local170];
						local157 += local5[local170];
						local159 += local8[local170];
						local161 += local11[local170];
						local163 += local14[local170];
					}
					@Pc(207) int local207 = local165 - 5;
					if (local207 >= 0) {
						local41 -= local2[local207];
						local157 -= local5[local207];
						local159 -= local8[local207];
						local161 -= local11[local207];
						local163 -= local14[local207];
					}
					if (local165 >= 0 && local163 > 0) {
						@Pc(259) int local259;
						if ((arg0[local16 + local165 * anInt3324] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt3324;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static290.method5228(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt3324;
							@Pc(331) int local331 = Static170.anIntArray264[Static28.method693(Static246.method6005(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public static void method3058() {
		aByteArray62 = new byte[anInt3324 * anInt3321];
		aByteArray63 = new byte[anInt3324 * anInt3321];
		aByteArray65 = new byte[anInt3324 * anInt3321];
		aShortArray74 = new short[anInt3324 * anInt3321];
		aByteArray64 = new byte[anInt3324 * anInt3321];
		aClass38_16 = new Class38(1024);
		aClass195ArrayArrayArray2 = new Class195[3][anInt3324 >> 6][anInt3321 >> 6];
		anIntArray240 = new int[Static188.anInt3800 + 1];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ic;III)I")
	private static int method3059(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class180 local3 = Static201.method3743(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt5286;
		if (local10 >= 0 && arg0.method5486(local10).aBoolean390) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt5283 >= 0) {
			local26 = local3.anInt5283;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static170.anIntArray264[Static28.method693(Static147.method2871(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static170.anIntArray264[Static28.method693(Static147.method2871(arg0.method5486(local10).aShort72)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt5293 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt5293;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static170.anIntArray264[Static28.method693(Static147.method2871(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public static void method3060() {
		aByteArray62 = null;
		aByteArray66 = null;
		aShortArray75 = null;
		aByteArray63 = null;
		aByteArray65 = null;
		aShortArray74 = null;
		aByteArray64 = null;
		aClass38_16 = null;
		aClass195ArrayArrayArray2 = null;
		anIntArray240 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!fp;)V")
	public static void method3061(@OriginalArg(0) Class63 arg0) {
		@Pc(3) int local3 = anInt3318 - anInt3316;
		@Pc(7) int local7 = anInt3315 - anInt3322;
		@Pc(15) int local15 = (anInt3323 - anInt3325 << 16) / local3;
		@Pc(23) int local23 = (anInt3319 - anInt3317 << 16) / local7;
		method3053(arg0, local15, local23);
	}
}
