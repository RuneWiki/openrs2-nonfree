import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!vo;")
	public static Class348 aClass348_26;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "Lclient!qca;")
	public static final Class4_Sub40 aClass4_Sub40_1 = new Class4_Sub40(0, -1);

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[6][];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI[[[Lclient!ko;IIZ)Z")
	public static boolean method1597(@OriginalArg(1) int arg0, @OriginalArg(2) Class182[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static70.anInt1864 & 0xFF);
		if (Static159.aByteArrayArrayArray3[Static352.anInt6764][arg0][arg3] == local14) {
			return false;
		} else if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][arg0][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			Static129.anIntArray133[0] = arg0;
			@Pc(60) int local60 = local51 + 1;
			Static480.anIntArray579[0] = arg3;
			Static159.aByteArrayArrayArray3[Static352.anInt6764][arg0][arg3] = local14;
			while (local53 != local60) {
				@Pc(78) int local78 = Static129.anIntArray133[local53] & 0xFFFF;
				@Pc(86) int local86 = Static129.anIntArray133[local53] >> 16 & 0xFF;
				@Pc(94) int local94 = Static129.anIntArray133[local53] >> 24 & 0xFF;
				@Pc(100) int local100 = Static480.anIntArray579[local53] & 0xFFFF;
				@Pc(108) int local108 = Static480.anIntArray579[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(211) int local211;
				label231: for (@Pc(134) int local134 = Static352.anInt6764 + 1; local134 <= 3; local134++) {
					if ((Static266.aByteArrayArrayArray10[local134][local78][local100] & 0x8) == 0) {
						@Pc(313) Class21_Sub1_Sub1 local313;
						@Pc(323) int local323;
						@Pc(302) Class182 local302;
						@Pc(308) Class192 local308;
						if (local116 && arg1[local134][local78][local100] != null) {
							if (arg1[local134][local78][local100].aClass21_Sub1_Sub2_1 != null) {
								local172 = Static384.method5951(local86);
								if (arg1[local134][local78][local100].aClass21_Sub1_Sub2_1.aShort65 == local172 || arg1[local134][local78][local100].aClass21_Sub1_Sub2_2 != null && arg1[local134][local78][local100].aClass21_Sub1_Sub2_2.aShort65 == local172) {
									continue;
								}
								if (local94 != 0) {
									local211 = Static384.method5951(local94);
									if (arg1[local134][local78][local100].aClass21_Sub1_Sub2_1.aShort65 == local211 || arg1[local134][local78][local100].aClass21_Sub1_Sub2_2 != null && local211 == arg1[local134][local78][local100].aClass21_Sub1_Sub2_2.aShort65) {
										continue;
									}
								}
								if (local108 != 0) {
									local211 = Static384.method5951(local108);
									if (arg1[local134][local78][local100].aClass21_Sub1_Sub2_1.aShort65 == local211 || arg1[local134][local78][local100].aClass21_Sub1_Sub2_2 != null && arg1[local134][local78][local100].aClass21_Sub1_Sub2_2.aShort65 == local211) {
										continue;
									}
								}
							}
							local302 = arg1[local134][local78][local100];
							if (local302.aClass192_2 != null) {
								for (local308 = local302.aClass192_2; local308 != null; local308 = local308.aClass192_3) {
									local313 = local308.aClass21_Sub1_Sub1_1;
									if (local313 instanceof Interface21) {
										@Pc(319) Interface21 local319 = (Interface21) local313;
										local323 = local319.method7280();
										@Pc(327) int local327 = local319.method7283();
										if (local323 == 21) {
											local323 = 19;
										}
										@Pc(338) int local338 = local323 | local327 << 6;
										if (local338 == local86 || local94 != 0 && local94 == local338 || local108 != 0 && local338 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg1[local134][local78][local100];
						if (local302 != null && local302.aClass192_2 != null) {
							for (local308 = local302.aClass192_2; local308 != null; local308 = local308.aClass192_3) {
								local313 = local308.aClass21_Sub1_Sub1_1;
								if (local313.aShort119 != local313.aShort120 || local313.aShort121 != local313.aShort122) {
									for (@Pc(406) int local406 = local313.aShort119; local406 <= local313.aShort120; local406++) {
										for (local323 = local313.aShort121; local323 <= local313.aShort122; local323++) {
											Static159.aByteArrayArrayArray3[local134][local406][local323] = local14;
										}
									}
								}
							}
						}
						local130 = true;
						Static159.aByteArrayArrayArray3[local134][local78][local100] = local14;
					}
				}
				if (local130) {
					local172 = Static255.aClass115Array2[Static352.anInt6764 + 1].method8055(local100, local78);
					if (local172 > Static301.anIntArray332[arg2]) {
						Static301.anIntArray332[arg2] = local172;
					}
					local211 = local78 << 9;
					if (local211 < Static333.anIntArray354[arg2]) {
						Static333.anIntArray354[arg2] = local211;
					} else if (local211 > Static425.anIntArray455[arg2]) {
						Static425.anIntArray455[arg2] = local211;
					}
					@Pc(517) int local517 = local100 << 9;
					if (local517 < Static211.anIntArray211[arg2]) {
						Static211.anIntArray211[arg2] = local517;
					} else if (Static15.anIntArray16[arg2] < local517) {
						Static15.anIntArray16[arg2] = local517;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] != local14) {
						Static129.anIntArray133[local60] = local78 - 1 | 0xD3000000 | 0x120000;
						Static480.anIntArray579[local60] = local100 | 0x130000;
						local60 = local60 + 1 & 0xFFF;
						Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] = local14;
					}
					local100++;
					if (local100 < Static390.anInt7654) {
						if (local78 - 1 >= 0 && local14 != Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78][local100] & 0x4) == 0 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static129.anIntArray133[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static480.anIntArray579[local60] = local100 | 0x130000;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local14 != Static159.aByteArrayArrayArray3[Static352.anInt6764][local78][local100]) {
							Static129.anIntArray133[local60] = local78 | 0x520000 | 0x13000000;
							Static480.anIntArray579[local60] = local100 | 0x530000;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static338.anInt6508 && Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] != local14 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78][local100] & 0x4) == 0 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static129.anIntArray133[local60] = local78 + 1 | 0x92000000 | 0x520000;
							Static480.anIntArray579[local60] = local100 | 0x530000;
							local60 = local60 + 1 & 0xFFF;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] = local14;
						}
					}
					local100--;
					if (Static338.anInt6508 > local78 + 1 && Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] != local14) {
						Static129.anIntArray133[local60] = local78 + 1 | 0x53000000 | 0x920000;
						Static480.anIntArray579[local60] = local100 | 0x930000;
						Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local14 != Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78][local100] & 0x4) == 0 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static129.anIntArray133[local60] = 0x12000000 | 0xD20000 | local78 - 1;
							Static480.anIntArray579[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 - 1][local100] = local14;
						}
						if (Static159.aByteArrayArrayArray3[Static352.anInt6764][local78][local100] != local14) {
							Static129.anIntArray133[local60] = 0x93000000 | 0xD20000 | local78;
							Static480.anIntArray579[local60] = local100 | 0xD30000;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static338.anInt6508 > local78 + 1 && Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] != local14 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78][local100] & 0x4) == 0 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static129.anIntArray133[local60] = local78 + 1 | 0x920000 | 0xD2000000;
							Static480.anIntArray579[local60] = local100 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static159.aByteArrayArrayArray3[Static352.anInt6764][local78 + 1][local100] = local14;
						}
					}
				}
			}
			if (Static301.anIntArray332[arg2] != -1000000) {
				Static301.anIntArray332[arg2] += 40;
				Static333.anIntArray354[arg2] -= 512;
				Static425.anIntArray455[arg2] += 512;
				Static15.anIntArray16[arg2] += 512;
				Static211.anIntArray211[arg2] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	public static void method1599() {
		try {
			@Pc(18) int local18;
			if (Static491.anInt9287 == 1) {
				local18 = Static365.aClass4_Sub21_Sub4_6.method6187();
				if (local18 > 0 && Static365.aClass4_Sub21_Sub4_6.method6166()) {
					local18 -= Static480.anInt10343;
					if (local18 < 0) {
						local18 = 0;
					}
					Static365.aClass4_Sub21_Sub4_6.method6165(local18);
					return;
				}
				Static365.aClass4_Sub21_Sub4_6.method6175();
				Static365.aClass4_Sub21_Sub4_6.method6198();
				Static156.aClass4_Sub5_5 = null;
				if (Static221.aClass348_16 == null) {
					Static491.anInt9287 = 0;
				} else {
					Static491.anInt9287 = 2;
				}
				Static128.aClass17_1 = null;
			}
			if (Static491.anInt9287 == 3) {
				local18 = Static365.aClass4_Sub21_Sub4_6.method6187();
				if (local18 < Static419.anInt7992 && Static365.aClass4_Sub21_Sub4_6.method6166()) {
					local18 += Static364.anInt7019;
					if (local18 > Static419.anInt7992) {
						local18 = Static419.anInt7992;
					}
					Static365.aClass4_Sub21_Sub4_6.method6165(local18);
				} else {
					Static491.anInt9287 = 0;
					Static364.anInt7019 = 0;
				}
			}
		} catch (@Pc(95) Exception local95) {
			local95.printStackTrace();
			Static365.aClass4_Sub21_Sub4_6.method6175();
			Static128.aClass17_1 = null;
			Static491.anInt9287 = 0;
			Static156.aClass4_Sub5_5 = null;
			Static132.aClass4_Sub21_Sub4_1 = null;
			Static221.aClass348_16 = null;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1600(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local8 + local10);
		for (@Pc(50) int local50 = 0; local50 < local8; local50++) {
			@Pc(56) char local56 = arg0.charAt(local50);
			if (local56 == '<') {
				local48.append("<lt>");
			} else if (local56 == '>') {
				local48.append("<gt>");
			} else {
				local48.append(local56);
			}
		}
		return local48.toString();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	public static void method1601() {
		Static158.aClass167_9.method3961();
	}
}
