import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!jd;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_2;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!qj;")
	public static Class165 aClass165_43;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!af;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public static int anInt2140;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[B")
	private static byte[] aByteArray46;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt2142;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "[B")
	private static byte[] aByteArray47;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "[B")
	private static byte[] aByteArray48;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "[[[Lclient!re;")
	private static Class175[][][] aClass175ArrayArrayArray2;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public static int anInt2143;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
	private static short[] aShortArray40;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
	private static int[] anIntArray258;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public static int anInt2144;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!br;")
	private static Class26 aClass26_15;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[S")
	private static short[] aShortArray41;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "[B")
	private static byte[] aByteArray49;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	public static int anInt2145;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	public static int anInt2146;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public static int anInt2148;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
	public static int anInt2150;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "[B")
	private static byte[] aByteArray50;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
	public static int anInt2151;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!br;")
	private static final Class26 aClass26_14 = new Class26(16);

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!tc;")
	public static final Class195 aClass195_17 = new Class195();

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt2138 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[B")
	private static final byte[] aByteArray45 = new byte[1];

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public static int anInt2139 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[S")
	private static final short[] aShortArray39 = new short[1];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;IIIIIII[S[BZ)V")
	private static void method1953(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method3300(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray258[arg6];
					if (arg10 || local32 != 0) {
						arg0.method3300(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static276.method4787(anIntArray258[arg6], arg1, arg3, local32, arg0, anInt2137, arg5, arg7 >> 6 & 0x3, local20, arg2, aByteArrayArrayArray3, arg4);
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
				@Pc(126) Class188 local126 = Static126.method2405(arg8[local100] & 0xFFFF);
				if (local126.anInt5537 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt5546 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method3325(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method3286(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method3325(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method3286(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method3325(arg1, arg2, arg4, -1, 0);
							arg0.method3286(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method3325(local20, arg2, arg4, -1, 0);
							arg0.method3286(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method3325(local20, arg2, arg4, -1, 0);
							arg0.method3286(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method3325(arg1, arg2, arg4, -1, 0);
							arg0.method3286(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method3286(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method3286(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method3286(local20, local32, 1, local132, 0);
						} else {
							arg0.method3286(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3286(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3286(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2149 = arg0 - anInt2144;
		anInt2140 = arg1 - anInt2150;
		anInt2143 = arg2 - anInt2144;
		anInt2147 = arg3 - anInt2150;
		anInt2145 = arg4;
		anInt2142 = arg5;
		anInt2141 = arg6;
		anInt2151 = arg7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;IIII[S[B)V")
	private static void method1955(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class188 local13 = Static126.method2405(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt5537;
			if (local16 != -1) {
				@Pc(23) Class185 local23 = Static28.method822(local16);
				@Pc(47) Class90 local47 = local23.method4855(arg0, local13.aBoolean485 ? arg6[local4] >> 6 & 0x3 : 0, local13.aBoolean477 ? local13.aBoolean478 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5464() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5467() >> 2;
					if (local23.aBoolean469) {
						@Pc(69) int local69 = local13.anInt5541;
						@Pc(72) int local72 = local13.anInt5533;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt5463 == 0) {
							local47.method5462(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5458(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt5463 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!ad;")
	public static Class4 method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class4 local3 = new Class4();
		for (@Pc(8) Class1_Sub1_Sub12 local8 = (Class1_Sub1_Sub12) aClass26_14.method871(); local8 != null; local8 = (Class1_Sub1_Sub12) aClass26_14.method878()) {
			if (local8.aBoolean251 && local8.method2740(arg1, arg0)) {
				local3.method180(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!jd;")
	public static Class1_Sub1_Sub12 method1957(@OriginalArg(0) int arg0) {
		return (Class1_Sub1_Sub12) aClass26_14.method870((long) arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sr;III)I")
	private static int method1958(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class199 local3 = Static340.method3663(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt5861;
		if (local10 >= 0 && arg0.method2788(local10).aBoolean570) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt5853 >= 0) {
			local26 = local3.anInt5853;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static220.anIntArray551[Static198.method3729(Static235.method4221(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static220.anIntArray551[Static198.method3729(Static235.method4221(arg0.method2788(local10).aShort90)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt5865 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt5865;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static220.anIntArray551[Static198.method3729(Static235.method4221(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;IIII)V")
	private static void method1960(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2143 - anInt2149;
		@Pc(7) int local7 = anInt2140 - anInt2147;
		if (anInt2143 < anInt2148) {
			local3++;
		}
		if (anInt2140 < anInt2146) {
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
			local28 = (arg1 * local17 >> 16) + anInt2145;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2145;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2149 + local17;
				if (local50 >= 0 && local50 < anInt2148) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2151 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2151 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2147;
							local172 = local50 + local93 * anInt2148;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt2146) {
								local174 = (aByteArray49[local172] & 0xFF) << 16 | aShortArray40[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray48[local172] & 0xFF;
								local178 = aShortArray41[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass1_Sub1_Sub12_2.anInt2822 != -1) {
									local174 = aClass1_Sub1_Sub12_2.anInt2822 | 0xFF000000;
								} else if ((local17 + anInt2149 & 0x4) == (local57 + anInt2140 & 0x4)) {
									local174 = anIntArray258[Static145.anInt2851 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method3300(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method1953(arg0, local28, local70, local44, local84, local174, local176, aByteArray50[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class1_Sub14 local280 = (Class1_Sub14) aClass26_15.method870((long) (local50 << 16 | local93));
								if (local280 != null) {
									method1953(arg0, local28, local70, local44, local84, local174, local176, aByteArray50[local172], local280.aShortArray31, local280.aByteArray33, true);
								}
							} else {
								aShortArray39[0] = (short) (local178 - 1);
								aByteArray45[0] = aByteArray47[local172];
								method1953(arg0, local28, local70, local44, local84, local174, local176, aByteArray50[local172], aShortArray39, aByteArray45, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2151 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2151 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub1_Sub12_2.anInt2822 != -1) {
							local93 = aClass1_Sub1_Sub12_2.anInt2822 | 0xFF000000;
						} else if ((local17 + anInt2149 & 0x4) == (local57 + anInt2140 & 0x4)) {
							local93 = anIntArray258[Static145.anInt2851 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method3300(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2145;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2145;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2149;
				if (local57 >= 0 && local57 < anInt2148) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2151 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2151 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt2147;
							if (local172 >= 0 && local172 < anInt2146) {
								local174 = aShortArray41[local57 + local172 * anInt2148] & 0xFFFF;
								if (local174 <= 0) {
									method1955(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class1_Sub14 local457 = (Class1_Sub14) aClass26_15.method870((long) (local57 << 16 | local172));
									if (local457 != null) {
										method1955(arg0, local40, local80, local50, local93, local457.aShortArray31, local457.aByteArray33);
									}
								} else {
									aShortArray39[0] = (short) (local174 - 1);
									aByteArray45[0] = aByteArray47[local57 + local172 * anInt2148];
									method1955(arg0, local40, local80, local50, local93, aShortArray39, aByteArray45);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2149 >> 6;
		local44 = anInt2147 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2143 >> 6;
		local57 = anInt2140 >> 6;
		if (local50 >= aClass175ArrayArrayArray2[0].length) {
			local50 = aClass175ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass175ArrayArrayArray2[0][0].length) {
			local57 = aClass175ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class175 local587 = aClass175ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt2144 >> 6)) * 64;
						local174 = (local84 + (anInt2150 >> 6)) * 64;
						for (@Pc(610) Class15_Sub1 local610 = (Class15_Sub1) local587.method4669(); local610 != null; local610 = (Class15_Sub1) local587.method4673()) {
							local178 = local172 + local610.aByte5 - anInt2144 - anInt2149;
							local629 = local174 + local610.aByte8 - anInt2150 - anInt2147;
							local639 = (arg1 * local178 >> 16) + anInt2145;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt2145;
							local663 = anInt2151 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt2151 - (arg2 * local629 >> 16);
							method1953(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt391, local610.aByte7 & 0xFF, local610.aByte6, local610.aShortArray15, local610.aByteArray15, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class175 local725 = aClass175ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt2144 >> 6)) * 64;
						local176 = (local93 + (anInt2150 >> 6)) * 64;
						for (@Pc(748) Class15_Sub1 local748 = (Class15_Sub1) local725.method4669(); local748 != null; local748 = (Class15_Sub1) local725.method4673()) {
							local629 = local174 + local748.aByte5 - anInt2144 - anInt2149;
							local639 = local176 + local748.aByte8 - anInt2150 - anInt2147;
							local651 = (arg1 * local629 >> 16) + anInt2145;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt2145;
							local673 = anInt2151 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt2151 - (arg2 * local639 >> 16);
							method1955(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray15, local748.aByteArray15);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;Lclient!eb;IIII[I[I)V")
	private static void method1961(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class1_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3141();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3141();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray46[arg4 + arg5 * anInt2148] = (byte) local21;
					aByteArray48[arg4 + arg5 * anInt2148] = 0;
				} else {
					aByteArray48[arg4 + arg5 * anInt2148] = (byte) local21;
					aByteArray50[arg4 + arg5 * anInt2148] = 0;
					aByteArray46[arg4 + arg5 * anInt2148] = arg1.method3130();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3141();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3141();
				local127 = arg1.method3141();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3141();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray46[arg4 + arg5 * anInt2148] = (byte) local123;
				aByteArray48[arg4 + arg5 * anInt2148] = (byte) local125;
				aByteArray50[arg4 + arg5 * anInt2148] = (byte) local127;
				if (local139 == 1) {
					aShortArray41[arg4 + arg5 * anInt2148] = (short) (arg1.method3115() + 1);
					aByteArray47[arg4 + arg5 * anInt2148] = arg1.method3130();
				} else if (local139 > 1) {
					aShortArray41[arg4 + arg5 * anInt2148] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3115();
						local218[local220] = arg1.method3130();
					}
					aClass26_15.method877((long) (arg4 << 16 | arg5), new Class1_Sub14(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3115();
						local218[local220] = arg1.method3130();
					}
				}
				if (aClass175ArrayArrayArray2[local118 - 1][arg2 - (anInt2144 >> 6)][arg3 - (anInt2150 >> 6)] == null) {
					aClass175ArrayArrayArray2[local118 - 1][arg2 - (anInt2144 >> 6)][arg3 - (anInt2150 >> 6)] = new Class175();
				}
				@Pc(338) Class15_Sub1 local338 = new Class15_Sub1(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass175ArrayArrayArray2[local118 - 1][arg2 - (anInt2144 >> 6)][arg3 - (anInt2150 >> 6)].method4672(local338);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!aa;IIII)Lclient!tc;")
	private static Class195 method1962(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub25 local4 = (Class1_Sub25) aClass195_17.method5029(); local4 != null; local4 = (Class1_Sub25) aClass195_17.method5021()) {
			method1971(arg0, local4, arg1, arg2);
		}
		return aClass195_17;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public static void method1963() {
		aByteArray46 = new byte[anInt2148 * anInt2146];
		aByteArray48 = new byte[anInt2148 * anInt2146];
		aByteArray50 = new byte[anInt2148 * anInt2146];
		aShortArray41 = new short[anInt2148 * anInt2146];
		aByteArray47 = new byte[anInt2148 * anInt2146];
		aClass26_15 = new Class26(1024);
		aClass175ArrayArrayArray2 = new Class175[3][anInt2148 >> 6][anInt2146 >> 6];
		anIntArray258 = new int[Static7.anInt160 + 1];
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	public static void method1964() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass6_3.anInt158; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub1_Sub12_2.method2737(aClass6_3.anIntArray21[local4] >> 14 & 0x3FFF, local2, aClass6_3.anIntArray21[local4] >> 28 & 0x3, aClass6_3.anIntArray21[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub25 local42 = new Class1_Sub25(aClass6_3.anIntArray22[local4]);
				local42.anInt4119 = local2[1] - anInt2144;
				local42.anInt4125 = local2[2] - anInt2150;
				aClass195_17.method5018(local42);
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
	public static void method1965() {
		aByteArray46 = null;
		aByteArray49 = null;
		aShortArray40 = null;
		aByteArray48 = null;
		aByteArray50 = null;
		aShortArray41 = null;
		aByteArray47 = null;
		aClass26_15 = null;
		aClass175ArrayArrayArray2 = null;
		anIntArray258 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qj;)V")
	public static void method1966(@OriginalArg(0) Class165 arg0) {
		aClass165_43 = arg0;
		aClass26_14.method876();
		@Pc(9) int local9 = aClass165_43.method4502("details");
		@Pc(14) int[] local14 = aClass165_43.method4500(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class1_Sub1_Sub12 local25 = Static226.method4111(local9, local14[local16], aClass165_43);
			aClass26_14.method877((long) local25.anInt2833, local25);
		}
		Static115.method2094(false);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Lclient!jd;")
	public static Class1_Sub1_Sub12 method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub1_Sub12 local4 = (Class1_Sub1_Sub12) aClass26_14.method871(); local4 != null; local4 = (Class1_Sub1_Sub12) aClass26_14.method878()) {
			if (local4.aBoolean251 && local4.method2740(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;II)V")
	public static void method1968(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7(aClass165_43.method4480(aClass1_Sub1_Sub12_2.aString112, "area"));
		@Pc(13) int local13 = local9.method3141();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3141();
		}
		@Pc(33) int local33 = local9.method3141();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3141();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3368 < local9.aByteArray58.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3141() == 0) {
					local58 = local9.method3141();
					local62 = local9.method3141();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2144;
							local84 = local62 * 64 + local67 - anInt2150;
							method1961(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3141();
					local62 = local9.method3141();
					local64 = local9.method3141();
					local67 = local9.method3141();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2144;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2150;
							method1961(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray49 = new byte[anInt2148 * anInt2146];
			aShortArray40 = new short[anInt2148 * anInt2146];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2148 * anInt2146];
				for (local64 = 0; local64 < aClass175ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass175ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class175 local205 = aClass175ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class15_Sub1 local212 = (Class15_Sub1) local205.method4669(); local212 != null; local212 = (Class15_Sub1) local205.method4673()) {
								local191[local64 * 64 + local212.aByte5 + (local67 * 64 + local212.aByte8) * anInt2148] = (byte) local212.anInt391;
							}
						}
					}
				}
				method1969(local191, aByteArray49, aShortArray40, arg1, arg2);
				for (local67 = 0; local67 < aClass175ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass175ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class175 local276 = aClass175ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class15_Sub1 local283 = (Class15_Sub1) local276.method4669(); local283 != null; local283 = (Class15_Sub1) local276.method4673()) {
								local148 = local67 * 64 + local283.aByte5 + (local76 * 64 + local283.aByte8) * anInt2148;
								local283.anInt391 = (aByteArray49[local148] & 0xFF) << 16 | aShortArray40[local148] & 0xFFFF;
								if (local283.anInt391 != 0) {
									local283.anInt391 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method1969(aByteArray46, aByteArray49, aShortArray40, arg1, arg2);
			aByteArray46 = null;
			method1972();
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([B[B[SII)V")
	private static void method1969(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2146];
		@Pc(5) int[] local5 = new int[anInt2146];
		@Pc(8) int[] local8 = new int[anInt2146];
		@Pc(11) int[] local11 = new int[anInt2146];
		@Pc(14) int[] local14 = new int[anInt2146];
		for (@Pc(16) int local16 = -5; local16 < anInt2148; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2146; local27++) {
				@Pc(49) Class9 local49;
				@Pc(85) int local85;
				if (local21 < anInt2148) {
					local41 = arg0[local21 + local27 * anInt2148] & 0xFF;
					if (local41 > 0) {
						local49 = Static33.method873(local41 - 1);
						local2[local27] += local49.anInt224;
						local5[local27] += local49.anInt231;
						local8[local27] += local49.anInt230;
						local11[local27] += local49.anInt228;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2148] & 0xFF;
					if (local41 > 0) {
						local49 = Static33.method873(local41 - 1);
						local2[local27] -= local49.anInt224;
						local5[local27] -= local49.anInt231;
						local8[local27] -= local49.anInt230;
						local11[local27] -= local49.anInt228;
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
				for (@Pc(165) int local165 = -5; local165 < anInt2146; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt2146) {
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
						if ((arg0[local16 + local165 * anInt2148] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt2148;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static257.method4559(local157 / local163, local159 / local163, local41 * 256 / local161);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt2148;
							@Pc(331) int local331 = Static220.anIntArray551[Static198.method3729(Static269.method4696(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sr;II)V")
	public static void method1970(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt160; local1++) {
			anIntArray258[local1 + 1] = method1958(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;Lclient!ne;IIII)V")
	private static void method1971(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class1_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4121 = anInt2145 + (arg2 * (arg1.anInt4119 - anInt2149) >> 16);
		arg1.anInt4120 = anInt2151 - (arg3 * (arg1.anInt4125 - anInt2147) >> 16);
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "()V")
	private static void method1972() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt2148; local1++) {
			for (local4 = 0; local4 < anInt2146; local4++) {
				local15 = aShortArray41[local1 + local4 * anInt2148] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub14 local31 = (Class1_Sub14) aClass26_15.method870((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray31.length; local35++) {
								@Pc(45) Class188 local45 = Static126.method2405(local31.aShortArray31[local35] & 0xFFFF);
								local48 = local45.anInt5549;
								if (local45.anIntArray697 != null) {
									local45 = local45.method4915();
									if (local45 != null) {
										local48 = local45.anInt5549;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class1_Sub25 local68 = new Class1_Sub25(local48);
									local68.anInt4119 = local1;
									local68.anInt4125 = local4;
									aClass195_17.method5018(local68);
								}
							}
						}
					} else {
						@Pc(91) Class188 local91 = Static126.method2405(local15 - 1);
						local35 = local91.anInt5549;
						if (local91.anIntArray697 != null) {
							local91 = local91.method4915();
							if (local91 != null) {
								local35 = local91.anInt5549;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class1_Sub25 local114 = new Class1_Sub25(local35);
							local114.anInt4119 = local1;
							local114.anInt4125 = local4;
							aClass195_17.method5018(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass175ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass175ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class175 local149 = aClass175ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class15_Sub1 local156 = (Class15_Sub1) local149.method4669(); local156 != null; local156 = (Class15_Sub1) local149.method4673()) {
							if (local156.aShortArray15 != null) {
								for (local48 = 0; local48 < local156.aShortArray15.length; local48++) {
									@Pc(172) Class188 local172 = Static126.method2405(local156.aShortArray15[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt5549;
									if (local172.anIntArray697 != null) {
										local172 = local172.method4915();
										if (local172 != null) {
											local175 = local172.anInt5549;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class1_Sub25 local195 = new Class1_Sub25(local175);
										local195.anInt4119 = (local15 + (anInt2144 >> 6)) * 64 + local156.aByte5 - anInt2144;
										local195.anInt4125 = (local140 + (anInt2150 >> 6)) * 64 + local156.aByte8 - anInt2150;
										aClass195_17.method5018(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!aa;)V")
	public static void method1973(@OriginalArg(0) Class2 arg0) {
		@Pc(3) int local3 = anInt2143 - anInt2149;
		@Pc(7) int local7 = anInt2140 - anInt2147;
		@Pc(15) int local15 = (anInt2141 - anInt2145 << 16) / local3;
		@Pc(23) int local23 = (anInt2151 - anInt2142 << 16) / local7;
		method1960(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!aa;)Lclient!tc;")
	public static Class195 method1974(@OriginalArg(0) Class2 arg0) {
		@Pc(3) int local3 = anInt2143 - anInt2149;
		@Pc(7) int local7 = anInt2140 - anInt2147;
		@Pc(15) int local15 = (anInt2141 - anInt2145 << 16) / local3;
		@Pc(23) int local23 = (anInt2151 - anInt2142 << 16) / local7;
		return method1962(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method1975(@OriginalArg(0) int arg0) {
		aClass1_Sub1_Sub12_2 = (Class1_Sub1_Sub12) aClass26_14.method870((long) arg0);
	}
}
