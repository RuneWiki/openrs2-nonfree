import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "Lclient!vo;")
	public static Class348 aClass348_129;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_145 = new Class90(62, 4);

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_98 = new Class344(41, 4);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BILclient!r;)Z")
	public static boolean method7927(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(11) int local11 = (Static338.anInt6508 - 104) / 2;
		@Pc(17) int local17 = (Static390.anInt7654 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static592.method8254(local21, local25, arg0, local29)) {
						local40 = local29;
						if (Static193.method3175(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static402.method6127(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local29 = 0; local29 < local83.length; local29++) {
			local83[local29] = -16777216;
		}
		Static441.aClass88_29 = arg1.method7838(local83, 512, 512, 512);
		Static241.method3901();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(163) int local163 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(182) int local182 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(192) boolean[][] local192 = new boolean[Static54.anInt1440 + 2 + 1][Static54.anInt1440 + 3];
		@Pc(198) int local198;
		@Pc(202) int local202;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(215) int local215;
		@Pc(225) int local225;
		@Pc(234) int local234;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(315) int local315;
		@Pc(322) int local322;
		@Pc(326) int local326;
		@Pc(351) int local351;
		for (@Pc(194) int local194 = local11; local194 < local11 + 104; local194 += Static54.anInt1440) {
			for (local198 = local17; local198 < local17 + 104; local198 += Static54.anInt1440) {
				local202 = 0;
				local204 = 0;
				local206 = local194;
				if (local194 > 0) {
					local206 = local194 - 1;
					local202 += 4;
				}
				local215 = local198;
				if (local198 > 0) {
					local215 = local198 - 1;
				}
				local225 = local194 + Static54.anInt1440;
				if (local225 < 104) {
					local225++;
				}
				local234 = local198 + Static54.anInt1440;
				if (local234 < 104) {
					local234++;
					local204 += 4;
				}
				arg1.da(0, 0, Static54.anInt1440 * 4 + local202, local204 + Static54.anInt1440 * 4);
				arg1.ja(-16777216);
				@Pc(266) int local266;
				for (local258 = arg0; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static54.anInt1440; local262++) {
						for (local266 = 0; local266 <= Static54.anInt1440; local266++) {
							local192[local262][local266] = Static592.method8254(local262 + local206, local266 + local215, arg0, local258);
						}
					}
					Static432.aClass115Array3[local258].method8059(local206, local215, local225, local234, local192);
					if (!Static98.aBoolean191) {
						for (local266 = -4; local266 < Static54.anInt1440; local266++) {
							for (local315 = -4; local315 < Static54.anInt1440; local315++) {
								local322 = local194 + local266;
								local326 = local315 + local198;
								if (local322 >= local11 && local17 <= local326 && Static592.method8254(local322, local326, arg0, local258)) {
									local351 = local258;
									if (Static193.method3175(local326, local322)) {
										local351 = local258 - 1;
									}
									if (local351 >= 0) {
										Static345.method5259(local322, local40, local163, local202 + local266 * 4, local351, local326, arg1, local204 + (Static54.anInt1440 - local315) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static98.aBoolean191) {
					@Pc(401) Class232 local401 = Static526.aClass232Array1[arg0];
					for (local266 = 0; local266 < Static54.anInt1440; local266++) {
						for (local315 = 0; local315 < Static54.anInt1440; local315++) {
							local322 = local194 + local266;
							local326 = local315 + local198;
							local351 = local401.anIntArrayArray31[local322 - local401.anInt6640][local326 - local401.anInt6654];
							if ((local351 & 0x40240000) != 0) {
								arg1.method7825(4, 4, local204 + (Static54.anInt1440 - local315) * 4 - 4, -1713569622, local202 + local266 * 4);
							} else if ((local351 & 0x800000) != 0) {
								arg1.method7809((Static54.anInt1440 - local315) * 4 + local204 - 4, 4, -1713569622, local202 + local266 * 4);
							} else if ((local351 & 0x2000000) != 0) {
								arg1.method7789((Static54.anInt1440 - local315) * 4 + local204 - 4, local266 * 4 + 3 + local202, 4, -1713569622);
							} else if ((local351 & 0x8000000) != 0) {
								arg1.method7809(local204 + (Static54.anInt1440 - local315) * 4 + 3 - 4, 4, -1713569622, local202 + local266 * 4);
							} else if ((local351 & 0x20000000) != 0) {
								arg1.method7789((Static54.anInt1440 - local315) * 4 + local204 - 4, local266 * 4 + local202, 4, -1713569622);
							}
						}
					}
				}
				arg1.J(local202, local204, Static54.anInt1440 * 4, Static54.anInt1440 * 4, local182, 2);
				Static441.aClass88_29.da((local194 - local11) * 4 + 48, -((-local17 + local198) * 4) + 464 + -(Static54.anInt1440 * 4), Static54.anInt1440 * 4, Static54.anInt1440 * 4, local202, local204);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static533.method7519();
		Static415.anInt5970 = 0;
		Static122.aClass22_18.method886();
		if (!Static98.aBoolean191) {
			for (local198 = local11; local198 < local11 + 104; local198++) {
				for (local202 = local17; local202 < local17 + 104; local202++) {
					for (local204 = arg0; arg0 + 1 >= local204 && local204 <= 3; local204++) {
						if (Static592.method8254(local198, local202, arg0, local204)) {
							@Pc(698) Interface21 local698 = (Interface21) Static570.method8016(local204, local198, local202);
							if (local698 == null) {
								local698 = (Interface21) Static36.method1049(local204, local198, local202, sw.class);
							}
							if (local698 == null) {
								local698 = (Interface21) Static497.method7181(local204, local198, local202);
							}
							if (local698 == null) {
								local698 = (Interface21) Static228.method3717(local204, local198, local202);
							}
							if (local698 != null) {
								@Pc(739) Class233 local739 = Static103.aClass298_1.method6822(local698.method7281());
								if (!local739.aBoolean458 || Static258.aBoolean367) {
									local225 = local739.anInt6674;
									if (local739.anIntArray374 != null) {
										for (local234 = 0; local234 < local739.anIntArray374.length; local234++) {
											if (local739.anIntArray374[local234] != -1) {
												@Pc(769) Class233 local769 = Static103.aClass298_1.method6822(local739.anIntArray374[local234]);
												if (local769.anInt6674 >= 0) {
													local225 = local769.anInt6674;
												}
											}
										}
									}
									if (local225 >= 0) {
										@Pc(792) boolean local792 = false;
										if (local225 >= 0) {
											@Pc(802) Class288 local802 = Static89.aClass121_1.method2676(local225);
											if (local802 != null && local802.aBoolean605) {
												local792 = true;
											}
										}
										local258 = local198;
										local262 = local202;
										if (local792) {
											@Pc(820) int[][] local820 = Static526.aClass232Array1[local204].anIntArrayArray31;
											local315 = Static526.aClass232Array1[local204].anInt6640;
											local322 = Static526.aClass232Array1[local204].anInt6654;
											for (local326 = 0; local326 < 10; local326++) {
												local351 = (int) (Math.random() * 4.0D);
												if (local351 == 0 && local258 > local11 && local198 - 3 < local258 && (local820[local258 - local315 - 1][local262 - local322] & 0x2C0108) == 0) {
													local258--;
												}
												if (local351 == 1 && local11 + 104 - 1 > local258 && local198 + 3 > local258 && (local820[local258 + 1 - local315][local262 - local322] & 0x2C0180) == 0) {
													local258++;
												}
												if (local351 == 2 && local262 > local17 && local202 - 3 < local262 && (local820[local258 - local315][local262 - local322 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local351 == 3 && local17 + 104 - 1 > local262 && local262 < local202 + 3 && (local820[local258 - local315][local262 + 1 - local322] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static438.anIntArray488[Static415.anInt5970] = local739.anInt6713;
										Static214.anIntArray221[Static415.anInt5970] = local258;
										Static221.anIntArray27[Static415.anInt5970] = local262;
										Static415.anInt5970++;
									}
								}
							}
						}
					}
				}
			}
			if (Static11.aClass42_1 != null) {
				Static196.aClass348_49.anInt10233 = 1;
				Static89.aClass121_1.method2679(64, 1024);
				for (local202 = 0; local202 < Static11.aClass42_1.anInt1335; local202++) {
					local204 = Static11.aClass42_1.anIntArray37[local202];
					if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 == local204 >> 28) {
						local206 = (local204 >> 14 & 0x3FFF) - Static242.anInt10133;
						local215 = (local204 & 0x3FFF) - Static157.anInt3323;
						if (local206 >= 0 && Static338.anInt6508 > local206 && local215 >= 0 && local215 < Static390.anInt7654) {
							Static122.aClass22_18.method894(new Class4_Sub27(local202));
						} else {
							@Pc(1094) Class288 local1094 = Static89.aClass121_1.method2676(Static11.aClass42_1.anIntArray36[local202]);
							if (local1094.anIntArray498 != null && local1094.anInt8590 + local206 >= 0 && Static338.anInt6508 > local1094.anInt8596 + local206 && local1094.anInt8581 + local215 >= 0 && local215 + local1094.anInt8573 < Static390.anInt7654) {
								Static122.aClass22_18.method894(new Class4_Sub27(local202));
							}
						}
					}
				}
				Static89.aClass121_1.method2679(64, 128);
				Static196.aClass348_49.anInt10233 = 2;
				Static196.aClass348_49.method7980();
			}
		}
		return true;
	}
}
