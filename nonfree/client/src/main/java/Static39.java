import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_481 = Static45.method1937(")1j");

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_482 = Static45.method1937(": ");

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public static final int anInt1039 = 50;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	public static int[] anIntArray174 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
	public static int[] anIntArray175 = new int[100];

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_483 = Static45.method1937("Continue");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
	public static int[] anIntArray176 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!af;")
	private static Class5 aClass5_484 = Static45.method1937("No reply from loginserver)3");

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "[I")
	public static int[] anIntArray177 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array8 = new Class5[anInt1039];

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_485 = aClass5_484;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	public static int anInt1036 = 0;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
	public static int[] anIntArray178 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
	public static int[] anIntArray179 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "[I")
	public static int[] anIntArray180 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_486 = aClass5_483;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_487 = Static45.method1937("<col=ffff00>*V");

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "[I")
	public static int[] anIntArray181 = new int[anInt1039];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([Lclient!af;I)[Lclient!af;")
	public static Class5[] method770(@OriginalArg(0) Class5[] arg0) {
		@Pc(8) Class5[] local8 = new Class5[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static100.method1696(new Class5[] { Static48.method838(local15), aClass5_482 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static100.method1696(new Class5[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method771() {
		anIntArray179 = null;
		aClass5_484 = null;
		aClass5_483 = null;
		aClass5_487 = null;
		anIntArray181 = null;
		anIntArray176 = null;
		aClass5Array8 = null;
		aClass5_481 = null;
		aClass5_482 = null;
		anIntArray177 = null;
		anIntArray178 = null;
		anIntArray174 = null;
		anIntArray175 = null;
		aClass5_486 = null;
		anIntArray180 = null;
		aClass5_485 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V")
	public static void method772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(24) Class1_Sub3_Sub15 local24 = (Class1_Sub3_Sub15) Static95.aClass7_10.method287(local10);
		if (local24 != null) {
			Static6.aClass17_1.method609(local24);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
	public static void method773(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub20 local10 = new Class1_Sub20(arg0);
		local10.anInt2951 = arg0.length - 2;
		Static46.anInt1118 = local10.method2087();
		Static48.anIntArray196 = new int[Static46.anInt1118];
		Static73.aByteArrayArray7 = new byte[Static46.anInt1118][];
		Static76.anIntArray296 = new int[Static46.anInt1118];
		Static109.anIntArray409 = new int[Static46.anInt1118];
		Static75.anIntArray290 = new int[Static46.anInt1118];
		local10.anInt2951 = arg0.length - Static46.anInt1118 * 8 - 7;
		Static11.anInt327 = local10.method2087();
		Static116.anInt2900 = local10.method2087();
		@Pc(62) int local62 = (local10.method2053() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static46.anInt1118; local64++) {
			Static75.anIntArray290[local64] = local10.method2087();
		}
		for (@Pc(78) int local78 = 0; local78 < Static46.anInt1118; local78++) {
			Static48.anIntArray196[local78] = local10.method2087();
		}
		for (@Pc(92) int local92 = 0; local92 < Static46.anInt1118; local92++) {
			Static109.anIntArray409[local92] = local10.method2087();
		}
		for (@Pc(110) int local110 = 0; local110 < Static46.anInt1118; local110++) {
			Static76.anIntArray296[local110] = local10.method2087();
		}
		local10.anInt2951 = arg0.length + 3 - Static46.anInt1118 * 8 - local62 * 3 - 7;
		Static27.anIntArray97 = new int[local62];
		for (@Pc(152) int local152 = 1; local152 < local62; local152++) {
			Static27.anIntArray97[local152] = local10.method2075();
			if (Static27.anIntArray97[local152] == 0) {
				Static27.anIntArray97[local152] = 1;
			}
		}
		local10.anInt2951 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static46.anInt1118; local181++) {
			@Pc(187) int local187 = Static76.anIntArray296[local181];
			@Pc(191) int local191 = Static109.anIntArray409[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static73.aByteArrayArray7[local181] = local198;
			@Pc(206) int local206 = local10.method2053();
			@Pc(210) int local210;
			if (local206 == 0) {
				for (local210 = 0; local210 < local195; local210++) {
					local198[local210] = local10.method2099();
				}
			} else if (local206 == 1) {
				for (local210 = 0; local210 < local191; local210++) {
					for (@Pc(237) int local237 = 0; local237 < local187; local237++) {
						local198[local237 * local191 + local210] = local10.method2099();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method774(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static45.anInt2757 > 0) {
			local19 = Static43.aByteArrayArray5[--Static45.anInt2757];
			Static43.aByteArrayArray5[Static45.anInt2757] = null;
			return local19;
		} else if (arg0 == 5000 && Static66.anInt3169 > 0) {
			local19 = Static65.aByteArrayArray6[--Static66.anInt3169];
			Static65.aByteArrayArray6[Static66.anInt3169] = null;
			return local19;
		} else if (arg0 == 30000 && Static106.anInt2620 > 0) {
			local19 = Static17.aByteArrayArray3[--Static106.anInt2620];
			Static17.aByteArrayArray3[Static106.anInt2620] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method775(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static3.method59(local13) : local13;
		} else if (arg0 instanceof Class30) {
			@Pc(27) Class30 local27 = (Class30) arg0;
			return local27.method1936();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
	public static void method776(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub2 local17 = (Class1_Sub2) Static59.aClass7_6.method287((long) arg0);
		if (local17 != null) {
			local17.method2220();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	public static int method777() {
		@Pc(7) int local7 = 3;
		if (Static109.anInt2693 < 310) {
			@Pc(14) int local14 = Static66.anInt3170 >> 7;
			@Pc(18) int local18 = Static121.anInt3115 >> 7;
			@Pc(23) int local23 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7;
			@Pc(28) int local28 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7;
			if ((Static25.aByteArrayArrayArray1[Static7.anInt213][local14][local18] & 0x4) != 0) {
				local7 = Static7.anInt213;
			}
			@Pc(51) int local51;
			if (local14 >= local28) {
				local51 = local14 - local28;
			} else {
				local51 = local28 - local14;
			}
			@Pc(66) int local66;
			if (local18 < local23) {
				local66 = local23 - local18;
			} else {
				local66 = local18 - local23;
			}
			@Pc(86) int local86;
			@Pc(88) int local88;
			if (local51 <= local66) {
				local86 = local51 * 65536 / local66;
				local88 = 32768;
				while (local23 != local18) {
					local88 += local86;
					if (local23 > local18) {
						local18++;
					} else if (local18 > local23) {
						local18--;
					}
					if ((Static25.aByteArrayArrayArray1[Static7.anInt213][local14][local18] & 0x4) != 0) {
						local7 = Static7.anInt213;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local28 > local14) {
							local14++;
						} else if (local14 > local28) {
							local14--;
						}
						if ((Static25.aByteArrayArrayArray1[Static7.anInt213][local14][local18] & 0x4) != 0) {
							local7 = Static7.anInt213;
						}
					}
				}
			} else {
				local86 = local66 * 65536 / local51;
				local88 = 32768;
				while (local28 != local14) {
					local88 += local86;
					if (local14 < local28) {
						local14++;
					} else if (local28 < local14) {
						local14--;
					}
					if ((Static25.aByteArrayArrayArray1[Static7.anInt213][local14][local18] & 0x4) != 0) {
						local7 = Static7.anInt213;
					}
					if (local88 >= 65536) {
						local88 -= 65536;
						if (local18 < local23) {
							local18++;
						} else if (local18 > local23) {
							local18--;
						}
						if ((Static25.aByteArrayArrayArray1[Static7.anInt213][local14][local18] & 0x4) != 0) {
							local7 = Static7.anInt213;
						}
					}
				}
			}
		}
		if ((Static25.aByteArrayArrayArray1[Static7.anInt213][Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7][Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7] & 0x4) != 0) {
			local7 = Static7.anInt213;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
	public static boolean method778() {
		@Pc(8) long local8 = Static52.method906();
		@Pc(14) int local14 = (int) (local8 - Static84.aLong65);
		Static84.aLong65 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static38.anInt976 += local14;
		if (Static90.anInt2229 == 0 && Static1.anInt50 == 0 && Static74.anInt1720 == 0 && Static56.anInt1347 == 0) {
			return true;
		} else if (Static1.aClass78_1 == null) {
			return false;
		} else {
			try {
				if (Static38.anInt976 > 30000) {
					throw new IOException();
				}
				@Pc(59) Class1_Sub3_Sub15 local59;
				@Pc(64) Class1_Sub20 local64;
				while (Static1.anInt50 < 20 && Static56.anInt1347 > 0) {
					local59 = (Class1_Sub3_Sub15) Static78.aClass7_9.method288();
					local64 = new Class1_Sub20(4);
					local64.method2081(1);
					local64.method2104((int) local59.aLong95);
					Static1.aClass78_1.method2182(4, local64.aByteArray36);
					Static9.aClass7_1.method291(local59, local59.aLong95);
					Static1.anInt50++;
					Static56.anInt1347--;
				}
				while (Static90.anInt2229 < 20 && Static74.anInt1720 > 0) {
					local59 = (Class1_Sub3_Sub15) Static6.aClass17_1.method608();
					local64 = new Class1_Sub20(4);
					local64.method2081(0);
					local64.method2104((int) local59.aLong95);
					Static1.aClass78_1.method2182(4, local64.aByteArray36);
					local59.method2235();
					Static21.aClass7_2.method291(local59, local59.aLong95);
					Static90.anInt2229++;
					Static74.anInt1720--;
				}
				for (@Pc(155) int local155 = 0; local155 < 100; local155++) {
					@Pc(161) int local161 = Static1.aClass78_1.method2179();
					if (local161 < 0) {
						throw new IOException();
					}
					if (local161 == 0) {
						break;
					}
					Static38.anInt976 = 0;
					@Pc(179) byte local179 = 0;
					if (Static51.aClass1_Sub3_Sub15_1 == null) {
						local179 = 8;
					} else if (Static97.anInt2389 == 0) {
						local179 = 1;
					}
					@Pc(199) int local199;
					@Pc(220) int local220;
					@Pc(267) int local267;
					@Pc(277) int local277;
					if (local179 > 0) {
						local199 = local179 - Static58.aClass1_Sub20_4.anInt2951;
						if (local199 > local161) {
							local199 = local161;
						}
						Static1.aClass78_1.method2180(Static58.aClass1_Sub20_4.aByteArray36, local199, Static58.aClass1_Sub20_4.anInt2951);
						if (Static121.aByte8 != 0) {
							for (local220 = 0; local220 < local199; local220++) {
								Static58.aClass1_Sub20_4.aByteArray36[Static58.aClass1_Sub20_4.anInt2951 + local220] = (byte) (Static58.aClass1_Sub20_4.aByteArray36[Static58.aClass1_Sub20_4.anInt2951 + local220] ^ Static121.aByte8);
							}
						}
						Static58.aClass1_Sub20_4.anInt2951 += local199;
						if (local179 > Static58.aClass1_Sub20_4.anInt2951) {
							break;
						}
						if (Static51.aClass1_Sub3_Sub15_1 == null) {
							Static58.aClass1_Sub20_4.anInt2951 = 0;
							local220 = Static58.aClass1_Sub20_4.method2053();
							local267 = Static58.aClass1_Sub20_4.method2087();
							@Pc(271) int local271 = Static58.aClass1_Sub20_4.method2053();
							local277 = Static58.aClass1_Sub20_4.method2094();
							@Pc(284) long local284 = (long) (local267 + (local220 << 16));
							@Pc(290) Class1_Sub3_Sub15 local290 = (Class1_Sub3_Sub15) Static9.aClass7_1.method287(local284);
							Static27.aBoolean24 = true;
							if (local290 == null) {
								local290 = (Class1_Sub3_Sub15) Static21.aClass7_2.method287(local284);
								Static27.aBoolean24 = false;
							}
							if (local290 == null) {
								throw new IOException();
							}
							Static51.aClass1_Sub3_Sub15_1 = local290;
							@Pc(319) int local319 = local271 == 0 ? 5 : 9;
							Static100.aClass1_Sub20_5 = new Class1_Sub20(Static51.aClass1_Sub3_Sub15_1.aByte7 + local319 + local277);
							Static100.aClass1_Sub20_5.method2081(local271);
							Static100.aClass1_Sub20_5.method2092(local277);
							Static97.anInt2389 = 8;
							Static58.aClass1_Sub20_4.anInt2951 = 0;
						} else if (Static97.anInt2389 == 0) {
							if (Static58.aClass1_Sub20_4.aByteArray36[0] == -1) {
								Static97.anInt2389 = 1;
								Static58.aClass1_Sub20_4.anInt2951 = 0;
							} else {
								Static51.aClass1_Sub3_Sub15_1 = null;
							}
						}
					} else {
						local220 = 512 - Static97.anInt2389;
						local199 = Static100.aClass1_Sub20_5.aByteArray36.length - Static51.aClass1_Sub3_Sub15_1.aByte7;
						if (local220 > local199 - Static100.aClass1_Sub20_5.anInt2951) {
							local220 = local199 - Static100.aClass1_Sub20_5.anInt2951;
						}
						if (local161 < local220) {
							local220 = local161;
						}
						Static1.aClass78_1.method2180(Static100.aClass1_Sub20_5.aByteArray36, local220, Static100.aClass1_Sub20_5.anInt2951);
						if (Static121.aByte8 != 0) {
							for (local267 = 0; local267 < local220; local267++) {
								Static100.aClass1_Sub20_5.aByteArray36[Static100.aClass1_Sub20_5.anInt2951 + local267] = (byte) (Static100.aClass1_Sub20_5.aByteArray36[Static100.aClass1_Sub20_5.anInt2951 + local267] ^ Static121.aByte8);
							}
						}
						Static97.anInt2389 += local220;
						Static100.aClass1_Sub20_5.anInt2951 += local220;
						if (local199 == Static100.aClass1_Sub20_5.anInt2951) {
							if (Static51.aClass1_Sub3_Sub15_1.aLong95 == 16711935L) {
								Static41.aClass1_Sub20_1 = Static100.aClass1_Sub20_5;
								for (local267 = 0; local267 < 256; local267++) {
									@Pc(539) Class41_Sub1 local539 = Static37.aClass41_Sub1Array1[local267];
									if (local539 != null) {
										Static41.aClass1_Sub20_1.anInt2951 = local267 * 8 + 5;
										local277 = Static41.aClass1_Sub20_1.method2094();
										@Pc(556) int local556 = Static41.aClass1_Sub20_1.method2094();
										local539.method1736(local556, local277);
									}
								}
							} else {
								Static21.aCRC32_1.reset();
								Static21.aCRC32_1.update(Static100.aClass1_Sub20_5.aByteArray36, 0, local199);
								local267 = (int) Static21.aCRC32_1.getValue();
								if (Static51.aClass1_Sub3_Sub15_1.anInt2382 != local267) {
									try {
										Static1.aClass78_1.method2176();
									} catch (@Pc(485) Exception local485) {
									}
									Static1.aClass78_1 = null;
									Static80.anInt1993++;
									Static121.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static120.anInt1835 = 0;
								Static80.anInt1993 = 0;
								Static51.aClass1_Sub3_Sub15_1.aClass41_Sub1_15.method1728((Static51.aClass1_Sub3_Sub15_1.aLong95 & 0xFF0000L) == 16711680L, Static27.aBoolean24, Static100.aClass1_Sub20_5.aByteArray36, (int) (Static51.aClass1_Sub3_Sub15_1.aLong95 & 0xFFFFL));
							}
							Static51.aClass1_Sub3_Sub15_1.method2220();
							if (Static27.aBoolean24) {
								Static1.anInt50--;
							} else {
								Static90.anInt2229--;
							}
							Static97.anInt2389 = 0;
							Static51.aClass1_Sub3_Sub15_1 = null;
							Static100.aClass1_Sub20_5 = null;
						} else {
							if (Static97.anInt2389 != 512) {
								break;
							}
							Static97.anInt2389 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(607) IOException local607) {
				try {
					Static1.aClass78_1.method2176();
				} catch (@Pc(612) Exception local612) {
				}
				Static120.anInt1835++;
				Static1.aClass78_1 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I")
	public static int method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}
}
