import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!cb;")
	public static final Class26 aClass26_1 = new Class26();

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt5772 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method4936() {
		Static263.method4659();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static29.aClass71Array1[local8].method1945();
		}
		Static299.method1010();
		Static334.method5421();
		System.gc();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIB)V")
	public static void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static77.aClass194ArrayArrayArray1 == null) {
			return;
		}
		@Pc(24) long local24 = (long) (arg1 | arg2 << 14 | arg0 << 28);
		@Pc(30) Class1_Sub7 local30 = (Class1_Sub7) Static339.aClass197_30.method5157(local24);
		if (local30 == null) {
			Static81.method4491(arg0, arg1, arg2);
			return;
		}
		@Pc(44) Class1_Sub40 local44 = (Class1_Sub40) local30.aClass16_2.method410();
		if (local44 == null) {
			Static81.method4491(arg0, arg1, arg2);
			return;
		}
		@Pc(58) Class17_Sub2_Sub1 local58 = (Class17_Sub2_Sub1) Static81.method4491(arg0, arg1, arg2);
		if (local58 == null) {
			local58 = new Class17_Sub2_Sub1();
		} else {
			local58.anInt1007 = local58.anInt1008 = -1;
		}
		local58.anInt1001 = local44.anInt6576;
		local58.anInt1000 = local44.anInt6580;
		label44: while (true) {
			@Pc(86) Class1_Sub40 local86 = (Class1_Sub40) local30.aClass16_2.method419();
			if (local86 == null) {
				break;
			}
			if (local58.anInt1000 != local86.anInt6580) {
				local58.anInt1003 = local86.anInt6576;
				local58.anInt1007 = local86.anInt6580;
				while (true) {
					@Pc(107) Class1_Sub40 local107 = (Class1_Sub40) local30.aClass16_2.method419();
					if (local107 == null) {
						break label44;
					}
					if (local58.anInt1000 != local107.anInt6580 && local58.anInt1007 != local107.anInt6580) {
						local58.anInt1008 = local107.anInt6580;
						local58.anInt1002 = local107.anInt6576;
					}
				}
			}
		}
		@Pc(155) int local155 = Static94.method2022((arg2 << 7) + 64, (arg1 << 7) + 64, arg0);
		Static95.method2038(arg0, arg1, arg2, local155, local58);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4939(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) int local19 = 0;
		@Pc(22) int local22 = arg0.length();
		while (local19 < local22 && Static351.method5608(arg0.charAt(local19))) {
			local19++;
		}
		while (local19 < local22 && Static351.method5608(arg0.charAt(local22 - 1))) {
			local22--;
		}
		@Pc(56) int local56 = local22 - local19;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local56);
		for (@Pc(75) int local75 = local19; local75 < local22; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static313.method5181(local81)) {
				@Pc(89) char local89 = Static259.method2698(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBI[[B[[BI[ZLclient!uo;[[BIILclient!jn;ILclient!rn;)V")
	public static void method4940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class32 arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class108 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class181 arg12) {
		@Pc(56) int local56;
		if (arg10 != null && arg12 != null || arg12 != null && arg1 == 12 || arg10 != null && arg1 == 0) {
			@Pc(37) boolean[] local37 = arg10 != null && arg10.aBoolean300 ? Static222.aBooleanArrayArray5[arg1] : Static38.aBooleanArrayArray1[arg1];
			@Pc(64) Class108 local64;
			@Pc(82) byte local82;
			@Pc(98) int local98;
			@Pc(103) int local103;
			if (arg9 > 0) {
				if (arg0 > 0) {
					local56 = arg7[arg0 - 1][arg9 - 1] & 0xFF;
					if (local56 > 0) {
						local64 = Static2.method65(local56 - 1);
						if (local64.anInt3153 != -1 && local64.aBoolean300) {
							local82 = arg3[arg0 - 1][arg9 - 1];
							local98 = arg2[arg0 - 1][arg9 - 1] * 2 + 4 & 0x7;
							local103 = Static343.method5441(arg6, local64);
							if (Static240.aBooleanArrayArray3[local82][local98]) {
								Static226.anIntArray420[0] = local64.anInt3153;
								Static240.anIntArray194[0] = local103;
								Static112.anIntArray245[0] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
								Static289.anIntArray449[0] = local64.anInt3156;
								Static294.anIntArray482[0] = local64.anInt3148;
								Static129.anIntArray256[0] = 256;
							}
						}
					}
				}
				if (arg8 - 1 > arg0) {
					local56 = arg7[arg0 + 1][arg9 - 1] & 0xFF;
					if (local56 > 0) {
						local64 = Static2.method65(local56 - 1);
						if (local64.anInt3153 != -1 && local64.aBoolean300) {
							local82 = arg3[arg0 + 1][arg9 - 1];
							local98 = arg2[arg0 + 1][arg9 - 1] * 2 + 6 & 0x7;
							local103 = Static343.method5441(arg6, local64);
							if (Static240.aBooleanArrayArray3[local82][local98]) {
								Static226.anIntArray420[2] = local64.anInt3153;
								Static240.anIntArray194[2] = local103;
								Static112.anIntArray245[2] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
								Static289.anIntArray449[2] = local64.anInt3156;
								Static294.anIntArray482[2] = local64.anInt3148;
								Static129.anIntArray256[2] = 512;
							}
						}
					}
				}
			}
			if (arg11 - 1 > arg9) {
				if (arg0 > 0) {
					local56 = arg7[arg0 - 1][arg9 + 1] & 0xFF;
					if (local56 > 0) {
						local64 = Static2.method65(local56 - 1);
						if (local64.anInt3153 != -1 && local64.aBoolean300) {
							local82 = arg3[arg0 - 1][arg9 + 1];
							local98 = arg2[arg0 - 1][arg9 + 1] * 2 + 2 & 0x7;
							local103 = Static343.method5441(arg6, local64);
							if (Static240.aBooleanArrayArray3[local82][local98]) {
								Static226.anIntArray420[6] = local64.anInt3153;
								Static240.anIntArray194[6] = local103;
								Static112.anIntArray245[6] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
								Static289.anIntArray449[6] = local64.anInt3156;
								Static294.anIntArray482[6] = local64.anInt3148;
								Static129.anIntArray256[6] = 64;
							}
						}
					}
				}
				if (arg0 < arg8 - 1) {
					local56 = arg7[arg0 + 1][arg9 + 1] & 0xFF;
					if (local56 > 0) {
						local64 = Static2.method65(local56 - 1);
						if (local64.anInt3153 != -1 && local64.aBoolean300) {
							local82 = arg3[arg0 + 1][arg9 + 1];
							local98 = arg2[arg0 + 1][arg9 + 1] * 2 & 0x7;
							local103 = Static343.method5441(arg6, local64);
							if (Static240.aBooleanArrayArray3[local82][local98]) {
								Static226.anIntArray420[4] = local64.anInt3153;
								Static240.anIntArray194[4] = local103;
								Static112.anIntArray245[4] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
								Static289.anIntArray449[4] = local64.anInt3156;
								Static294.anIntArray482[4] = local64.anInt3148;
								Static129.anIntArray256[4] = 128;
							}
						}
					}
				}
			}
			@Pc(524) int local524;
			@Pc(529) int local529;
			@Pc(531) int local531;
			@Pc(513) byte local513;
			if (arg9 > 0) {
				local56 = arg7[arg0][arg9 - 1] & 0xFF;
				if (local56 > 0) {
					local64 = Static2.method65(local56 - 1);
					if (local64.anInt3153 != -1) {
						local82 = arg3[arg0][arg9 - 1];
						local513 = arg2[arg0][arg9 - 1];
						if (local64.aBoolean300) {
							local103 = 2;
							local524 = local513 * 2 + 4;
							local529 = Static343.method5441(arg6, local64);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local103 &= 0x7;
								if (Static240.aBooleanArrayArray3[local82][local524] && Static294.anIntArray482[local103] <= local64.anInt3148) {
									Static226.anIntArray420[local103] = local64.anInt3153;
									Static240.anIntArray194[local103] = local529;
									Static112.anIntArray245[local103] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
									Static289.anIntArray449[local103] = local64.anInt3156;
									if (local64.anInt3148 == Static294.anIntArray482[local103]) {
										Static129.anIntArray256[local103] |= 0x20;
									} else {
										Static129.anIntArray256[local103] = 32;
									}
									Static294.anIntArray482[local103] = local64.anInt3148;
								}
								local524++;
								local103--;
							}
							if (!local37[--arg4 & 0x3]) {
								arg5[0] = Static222.aBooleanArrayArray5[local82][local513 + 2 & 0x3];
							}
						} else if (!local37[--arg4 & 0x3]) {
							arg5[0] = Static38.aBooleanArrayArray1[local82][local513 + 2 & 0x3];
						}
					}
				}
			}
			if (arg11 - 1 > arg9) {
				local56 = arg7[arg0][arg9 + 1] & 0xFF;
				if (local56 > 0) {
					local64 = Static2.method65(local56 - 1);
					if (local64.anInt3153 != -1) {
						local82 = arg3[arg0][arg9 + 1];
						local513 = arg2[arg0][arg9 + 1];
						if (local64.aBoolean300) {
							local103 = 4;
							local524 = local513 * 2 + 2;
							local529 = Static343.method5441(arg6, local64);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local103 &= 0x7;
								if (Static240.aBooleanArrayArray3[local82][local524] && Static294.anIntArray482[local103] <= local64.anInt3148) {
									Static226.anIntArray420[local103] = local64.anInt3153;
									Static240.anIntArray194[local103] = local529;
									Static112.anIntArray245[local103] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
									Static289.anIntArray449[local103] = local64.anInt3156;
									if (Static294.anIntArray482[local103] == local64.anInt3148) {
										Static129.anIntArray256[local103] |= 0x10;
									} else {
										Static129.anIntArray256[local103] = 16;
									}
									Static294.anIntArray482[local103] = local64.anInt3148;
								}
								local103++;
								local524--;
							}
							if (!local37[arg4 + 2 & 0x3]) {
								arg5[2] = Static222.aBooleanArrayArray5[local82][--local513 & 0x3];
							}
						} else if (!local37[arg4 + 2 & 0x3]) {
							arg5[2] = Static38.aBooleanArrayArray1[local82][local513 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local56 = arg7[arg0 - 1][arg9] & 0xFF;
				if (local56 > 0) {
					local64 = Static2.method65(local56 - 1);
					if (local64.anInt3153 != -1) {
						local82 = arg3[arg0 - 1][arg9];
						local513 = arg2[arg0 - 1][arg9];
						if (local64.aBoolean300) {
							local103 = 6;
							local524 = local513 * 2 + 4;
							local529 = Static343.method5441(arg6, local64);
							for (local531 = 0; local531 < 3; local531++) {
								local524 &= 0x7;
								local103 &= 0x7;
								if (Static240.aBooleanArrayArray3[local82][local524] && Static294.anIntArray482[local103] <= local64.anInt3148) {
									Static226.anIntArray420[local103] = local64.anInt3153;
									Static240.anIntArray194[local103] = local529;
									Static112.anIntArray245[local103] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
									Static289.anIntArray449[local103] = local64.anInt3156;
									if (Static294.anIntArray482[local103] == local64.anInt3148) {
										Static129.anIntArray256[local103] |= 0x8;
									} else {
										Static129.anIntArray256[local103] = 8;
									}
									Static294.anIntArray482[local103] = local64.anInt3148;
								}
								local524--;
								local103++;
							}
							if (!local37[arg4 + 3 & 0x3]) {
								arg5[3] = Static222.aBooleanArrayArray5[local82][local513 + 1 & 0x3];
							}
						} else if (!local37[arg4 + 3 & 0x3]) {
							arg5[3] = Static38.aBooleanArrayArray1[local82][local513 + 1 & 0x3];
						}
					}
				}
			}
			if (arg8 - 1 > arg0) {
				local56 = arg7[arg0 + 1][arg9] & 0xFF;
				if (local56 > 0) {
					local64 = Static2.method65(local56 - 1);
					if (local64.anInt3153 != -1) {
						local82 = arg3[arg0 + 1][arg9];
						local513 = arg2[arg0 + 1][arg9];
						if (local64.aBoolean300) {
							local103 = 4;
							local524 = local513 * 2 + 6;
							local529 = Static343.method5441(arg6, local64);
							for (local531 = 0; local531 < 3; local531++) {
								local103 &= 0x7;
								local524 &= 0x7;
								if (Static240.aBooleanArrayArray3[local82][local524] && Static294.anIntArray482[local103] <= local64.anInt3148) {
									Static226.anIntArray420[local103] = local64.anInt3153;
									Static240.anIntArray194[local103] = local529;
									Static112.anIntArray245[local103] = arg6.method2178() ? local64.anInt3150 : local64.anInt3158;
									Static289.anIntArray449[local103] = local64.anInt3156;
									if (local64.anInt3148 == Static294.anIntArray482[local103]) {
										Static129.anIntArray256[local103] |= 0x4;
									} else {
										Static129.anIntArray256[local103] = 4;
									}
									Static294.anIntArray482[local103] = local64.anInt3148;
								}
								local103--;
								local524++;
							}
							if (!local37[arg4 + 1 & 0x3]) {
								arg5[1] = Static222.aBooleanArrayArray5[local82][local513 + 3 & 0x3];
							}
						} else if (!local37[arg4 + 1 & 0x3]) {
							arg5[1] = Static38.aBooleanArrayArray1[local82][local513 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg10 == null) {
			return;
		}
		@Pc(1239) int local1239 = Static343.method5441(arg6, arg10);
		if (!arg10.aBoolean300) {
			return;
		}
		for (local56 = 0; local56 < 8; local56++) {
			@Pc(1254) int local1254 = local56 - arg4 * 2 & 0x7;
			if (Static240.aBooleanArrayArray3[arg1][local56] && Static294.anIntArray482[local1254] <= arg10.anInt3148) {
				Static226.anIntArray420[local1254] = arg10.anInt3153;
				Static240.anIntArray194[local1254] = local1239;
				Static112.anIntArray245[local1254] = arg6.method2178() ? arg10.anInt3150 : arg10.anInt3158;
				Static289.anIntArray449[local1254] = arg10.anInt3156;
				if (arg10.anInt3148 == Static294.anIntArray482[local1254]) {
					Static129.anIntArray256[local1254] |= 0x2;
				} else {
					Static129.anIntArray256[local1254] = 2;
				}
				Static294.anIntArray482[local1254] = arg10.anInt3148;
			}
		}
		return;
	}
}
