import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!mda", name = "r", descriptor = "Lclient!oh;")
	public static Class273 aClass273_10;

	@OriginalMember(owner = "client!mda", name = "W", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_122 = new Class225(84, -1);

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "[Lclient!et;")
	public static final Class2_Sub20[] aClass2_Sub20Array1 = new Class2_Sub20[2048];

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "Lclient!gn;")
	public static final Class2_Sub31 aClass2_Sub31_1 = new Class2_Sub31(0, -1);

	@OriginalMember(owner = "client!mda", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[200];

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mda", name = "V", descriptor = "I")
	public static int anInt6468 = 0;

	@OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
	public static int anInt6469 = 1;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZBI[[[Lclient!qj;II)Z")
	public static boolean method5814(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class311[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg0 ? 1 : (byte) (Static68.anInt1174 & 0xFF);
		if (local22 == Static481.aByteArrayArrayArray17[Static684.anInt10516][arg1][arg3]) {
			return false;
		} else if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(56) byte local56 = 0;
			Static97.anIntArray129[0] = arg1;
			@Pc(62) int local62 = 0;
			@Pc(65) int local65 = local56 + 1;
			Static142.anIntArray326[0] = arg3;
			Static481.aByteArrayArrayArray17[Static684.anInt10516][arg1][arg3] = local22;
			while (local62 != local65) {
				@Pc(83) int local83 = Static97.anIntArray129[local62] & 0xFFFF;
				@Pc(91) int local91 = Static97.anIntArray129[local62] >> 16 & 0xFF;
				@Pc(99) int local99 = Static97.anIntArray129[local62] >> 24 & 0xFF;
				@Pc(105) int local105 = Static142.anIntArray326[local62] & 0xFFFF;
				@Pc(113) int local113 = Static142.anIntArray326[local62] >> 16 & 0xFF;
				local62 = local62 + 1 & 0xFFF;
				@Pc(121) boolean local121 = false;
				if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local83][local105] & 0x4) == 0) {
					local121 = true;
				}
				@Pc(135) boolean local135 = false;
				@Pc(141) int local141;
				@Pc(191) int local191;
				@Pc(241) int local241;
				if (arg2 != null) {
					label237: for (local141 = Static684.anInt10516 + 1; local141 <= 3; local141++) {
						if (arg2[local141] != null && (Static392.aByteArrayArrayArray16[local141][local83][local105] & 0x8) == 0) {
							@Pc(357) Class4_Sub2_Sub1 local357;
							@Pc(367) int local367;
							@Pc(346) Class311 local346;
							@Pc(352) Class142 local352;
							if (local121 && arg2[local141][local83][local105] != null) {
								if (arg2[local141][local83][local105].aClass4_Sub2_Sub3_2 != null) {
									local191 = Static343.method4762(local91);
									if (arg2[local141][local83][local105].aClass4_Sub2_Sub3_2.aShort120 == local191 || arg2[local141][local83][local105].aClass4_Sub2_Sub3_1 != null && local191 == arg2[local141][local83][local105].aClass4_Sub2_Sub3_1.aShort120) {
										continue;
									}
									if (local99 != 0) {
										local241 = Static343.method4762(local99);
										if (local241 == arg2[local141][local83][local105].aClass4_Sub2_Sub3_2.aShort120 || arg2[local141][local83][local105].aClass4_Sub2_Sub3_1 != null && arg2[local141][local83][local105].aClass4_Sub2_Sub3_1.aShort120 == local241) {
											continue;
										}
									}
									if (local113 != 0) {
										local241 = Static343.method4762(local113);
										if (arg2[local141][local83][local105].aClass4_Sub2_Sub3_2.aShort120 == local241 || arg2[local141][local83][local105].aClass4_Sub2_Sub3_1 != null && local241 == arg2[local141][local83][local105].aClass4_Sub2_Sub3_1.aShort120) {
											continue;
										}
									}
								}
								local346 = arg2[local141][local83][local105];
								if (local346.aClass142_2 != null) {
									for (local352 = local346.aClass142_2; local352 != null; local352 = local352.aClass142_1) {
										local357 = local352.aClass4_Sub2_Sub1_1;
										if (local357 instanceof Interface25) {
											@Pc(363) Interface25 local363 = (Interface25) local357;
											local367 = local363.method8991((byte) 56);
											if (local367 == 21) {
												local367 = 19;
											}
											@Pc(376) int local376 = local363.method8992();
											@Pc(382) int local382 = local376 << 6 | local367;
											if (local382 == local91 || local99 != 0 && local99 == local382 || local113 != 0 && local382 == local113) {
												continue label237;
											}
										}
									}
								}
							}
							local346 = arg2[local141][local83][local105];
							if (local346 != null && local346.aClass142_2 != null) {
								for (local352 = local346.aClass142_2; local352 != null; local352 = local352.aClass142_1) {
									local357 = local352.aClass4_Sub2_Sub1_1;
									if (local357.aShort128 != local357.aShort130 || local357.aShort129 != local357.aShort127) {
										for (@Pc(467) int local467 = local357.aShort130; local467 <= local357.aShort128; local467++) {
											for (local367 = local357.aShort127; local367 <= local357.aShort129; local367++) {
												Static481.aByteArrayArrayArray17[local141][local467][local367] = local22;
											}
										}
									}
								}
							}
							local135 = true;
							Static481.aByteArrayArrayArray17[local141][local83][local105] = local22;
						}
					}
				}
				if (local135) {
					local141 = Static158.aClass133Array4[Static684.anInt10516 + 1].method8217(local83, local105);
					if (Static693.anIntArray741[arg4] < local141) {
						Static693.anIntArray741[arg4] = local141;
					}
					local191 = local83 << 9;
					if (local191 < Static64.anIntArray100[arg4]) {
						Static64.anIntArray100[arg4] = local191;
					} else if (local191 > Static73.anIntArray109[arg4]) {
						Static73.anIntArray109[arg4] = local191;
					}
					local241 = local105 << 9;
					if (local241 < Static133.anIntArray166[arg4]) {
						Static133.anIntArray166[arg4] = local241;
					} else if (local241 > Static495.anIntArray566[arg4]) {
						Static495.anIntArray566[arg4] = local241;
					}
				}
				if (!local121) {
					if (local83 >= 1 && Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] != local22) {
						Static97.anIntArray129[local65] = local83 - 1 | 0x120000 | 0xD3000000;
						Static142.anIntArray326[local65] = local105 | 0x130000;
						Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] = local22;
						local65 = local65 + 1 & 0xFFF;
					}
					local105++;
					if (local105 < Static280.anInt6752) {
						if (local83 - 1 >= 0 && local22 != Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83][local105] & 0x4) == 0 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83 - 1][local105 - 1] & 0x4) == 0) {
							Static97.anIntArray129[local65] = local83 - 1 | 0x120000 | 0x52000000;
							Static142.anIntArray326[local65] = local105 | 0x130000;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] = local22;
							local65 = local65 + 1 & 0xFFF;
						}
						if (Static481.aByteArrayArrayArray17[Static684.anInt10516][local83][local105] != local22) {
							Static97.anIntArray129[local65] = local83 | 0x13000000 | 0x520000;
							Static142.anIntArray326[local65] = local105 | 0x530000;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83][local105] = local22;
							local65 = local65 + 1 & 0xFFF;
						}
						if (Static426.anInt6942 > local83 + 1 && local22 != Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105] && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83][local105] & 0x4) == 0 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83 + 1][local105 - 1] & 0x4) == 0) {
							Static97.anIntArray129[local65] = local83 + 1 | 0x520000 | 0x92000000;
							Static142.anIntArray326[local65] = local105 | 0x530000;
							local65 = local65 + 1 & 0xFFF;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105] = local22;
						}
					}
					local105--;
					if (Static426.anInt6942 > local83 + 1 && local22 != Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105]) {
						Static97.anIntArray129[local65] = local83 + 1 | 0x920000 | 0x53000000;
						Static142.anIntArray326[local65] = local105 | 0x930000;
						local65 = local65 + 1 & 0xFFF;
						Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105] = local22;
					}
					local105--;
					if (local105 >= 0) {
						if (local83 - 1 >= 0 && local22 != Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83][local105] & 0x4) == 0 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83 - 1][local105 + 1] & 0x4) == 0) {
							Static97.anIntArray129[local65] = local83 - 1 | 0xD20000 | 0x12000000;
							Static142.anIntArray326[local65] = local105 | 0xD30000;
							local65 = local65 + 1 & 0xFFF;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 - 1][local105] = local22;
						}
						if (Static481.aByteArrayArrayArray17[Static684.anInt10516][local83][local105] != local22) {
							Static97.anIntArray129[local65] = local83 | 0x93000000 | 0xD20000;
							Static142.anIntArray326[local65] = local105 | 0xD30000;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83][local105] = local22;
							local65 = local65 + 1 & 0xFFF;
						}
						if (local83 + 1 < Static426.anInt6942 && Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105] != local22 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83][local105] & 0x4) == 0 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][local83 + 1][local105 + 1] & 0x4) == 0) {
							Static97.anIntArray129[local65] = 0xD2000000 | 0x920000 | local83 + 1;
							Static142.anIntArray326[local65] = local105 | 0x930000;
							local65 = local65 + 1 & 0xFFF;
							Static481.aByteArrayArrayArray17[Static684.anInt10516][local83 + 1][local105] = local22;
						}
					}
				}
			}
			if (Static693.anIntArray741[arg4] != -1000000) {
				Static693.anIntArray741[arg4] += 40;
				Static64.anIntArray100[arg4] -= 512;
				Static73.anIntArray109[arg4] += 512;
				Static495.anIntArray566[arg4] += 512;
				Static133.anIntArray166[arg4] -= 512;
			}
			return true;
		}
	}
}
