import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ev", name = "I", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ev", name = "K", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
	public static int[] anIntArray308 = new int[1];

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method2284(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static274.anInt4982 == 0 || Static365.anInt6882 == 0) {
			return;
		}
		arg0.b(Static144.anInt2658, Static90.anInt8344, Static274.anInt4982, Static365.anInt6882);
		arg0.N(Static262.anInt7124, Static189.anInt3454, Static274.anInt4982, Static365.anInt6882);
		@Pc(36) Class181 local36 = arg0.method6035();
		local36.B(Static255.anInt4610, Static511.anInt8881, Static193.anInt3520, Static355.anInt6705, Static420.anInt7812, Static156.anInt2887);
		arg0.method6015(local36);
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(110) int[] local110;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (Static164.aClass75Array1 != null) {
			@Pc(51) int local51 = -1;
			@Pc(53) int local53 = -1;
			local56 = arg0.c();
			local65 = (arg2 - Static144.anInt2658) * local56 / Static274.anInt4982;
			local74 = (arg1 - Static90.anInt8344) * local56 / Static365.anInt6882;
			local77 = arg0.CA();
			local86 = (arg2 - Static144.anInt2658) * local77 / Static274.anInt4982;
			local95 = (arg1 - Static90.anInt8344) * local77 / Static365.anInt6882;
			local110 = new int[] { local65, local74, local56 };
			local36.va(local110);
			@Pc(128) int[] local128 = new int[] { local86, local95, local77 };
			local36.va(local128);
			@Pc(133) float local133 = 0.0F;
			local142 = local128[0] - local110[0];
			local151 = local128[1] - local110[1];
			@Pc(159) int local159 = local128[2] - local110[2];
			while (local133 < 1.0F) {
				@Pc(172) int local172 = (int) (local133 * (float) local142 + (float) local110[0]);
				@Pc(176) int local176 = local172 >> 7;
				@Pc(187) int local187 = (int) (local133 * (float) local159 + (float) local110[2]);
				@Pc(191) int local191 = local187 >> 7;
				if (local176 > 0 && local191 > 0 && local176 < Static363.anInt1158 && Static511.anInt8889 > local191) {
					@Pc(211) int local211 = Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90;
					if (local211 < 3 && (Static267.aByteArrayArrayArray19[1][local176][local191] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static164.aClass75Array1[local211].aa(local172, local187) < local133 * (float) local151 + (float) local110[1]) {
						local51 = (Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() - 1 << 6) + local172 >> 7;
						local53 = (Static266.aClass1_Sub1_Sub2_Sub1_1.method4394() - 1 << 6) + local187 >> 7;
						break;
					}
				}
				local133 = (float) ((double) local133 + 0.01D);
			}
			if (local51 != -1 && local53 != -1) {
				if (Static21.aBoolean31 && (Static176.anInt3294 & 0x40) != 0) {
					@Pc(302) Class310 local302 = Static519.method7538(Static116.anInt2332, Static55.anInt970);
					if (local302 == null) {
						Static465.method7011();
					} else {
						Static111.method2154(0L, -1, 9, local53, true, Static131.aString66, local51, " ->", Static472.anInt8248, false);
					}
				} else {
					if (Static185.aClass212_1 == Static533.aClass212_4) {
						Static111.method2154(0L, -1, 23, local53, true, Static141.aClass202_255.method5139(Static172.anInt6352), local51, "", -1, false);
					}
					Static111.method2154(0L, -1, 19, local53, true, Static62.aString37, local51, "", Static322.anInt6010, false);
				}
			}
		}
		@Pc(358) Class107 local358 = Static64.aClass107_1;
		for (@Pc(365) Class6_Sub5 local365 = (Class6_Sub5) local358.method2832(); local365 != null; local365 = (Class6_Sub5) local358.method2835()) {
			if ((Static146.aBoolean222 || Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local365.anInt4918) && local365.method4291(arg1, arg0, arg2)) {
				@Pc(497) int local497;
				@Pc(509) int local509;
				if (local365.aClass1_1 instanceof Class1_Sub1_Sub2_Sub1) {
					@Pc(391) Class1_Sub1_Sub2_Sub1 local391 = (Class1_Sub1_Sub2_Sub1) local365.aClass1_1;
					local65 = local391.method4394();
					if ((local65 & 0x1) == 0 && (local391.anInt7660 & 0x7F) == 0 && (local391.anInt7659 & 0x7F) == 0 || (local65 & 0x1) == 1 && (local391.anInt7660 & 0x7F) == 64 && (local391.anInt7659 & 0x7F) == 64) {
						local74 = local391.anInt7660 - (local391.method4394() - 1 << 6);
						local77 = local391.anInt7659 - (local391.method4394() - 1 << 6);
						for (local86 = 0; local86 < Static520.anInt1936; local86++) {
							@Pc(467) Class2_Sub11 local467 = (Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local86]);
							if (local467 != null) {
								@Pc(472) Class1_Sub1_Sub2_Sub2 local472 = local467.aClass1_Sub1_Sub2_Sub2_1;
								if (Static115.anInt2326 != local472.anInt5086 && local472.aBoolean384) {
									local497 = local472.anInt7660 - (local472.aClass12_1.anInt313 - 1 << 6);
									local509 = local472.anInt7659 - (local472.aClass12_1.anInt313 - 1 << 6);
									if (local74 <= local497 && local472.aClass12_1.anInt313 <= local391.method4394() - (local497 - local74 >> 7) && local509 >= local77 && local472.aClass12_1.anInt313 <= local391.method4394() - (local509 - local77 >> 7)) {
										Static347.method5460(local365.anInt4918 != Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, local472);
										local472.anInt5086 = Static115.anInt2326;
									}
								}
							}
						}
						local95 = Static16.anInt362;
						local110 = Static325.anIntArray473;
						for (local497 = 0; local497 < local95; local497++) {
							@Pc(584) Class1_Sub1_Sub2_Sub1 local584 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local110[local497]];
							if (local584 != null && Static115.anInt2326 != local584.anInt5086 && local391 != local584 && local584.aBoolean384) {
								local142 = local584.anInt7660 - (local584.method4394() - 1 << 6);
								local151 = local584.anInt7659 - (local584.method4394() - 1 << 6);
								if (local74 <= local142 && local584.method4394() <= local391.method4394() - (local142 - local74 >> 7) && local151 >= local77 && local584.method4394() <= local391.method4394() - (local151 - local77 >> 7)) {
									Static125.method2369(local584, local365.anInt4918 != Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90);
									local584.anInt5086 = Static115.anInt2326;
								}
							}
						}
					}
					if (Static115.anInt2326 == local391.anInt5086) {
						continue;
					}
					Static125.method2369(local391, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local365.anInt4918);
					local391.anInt5086 = Static115.anInt2326;
				}
				@Pc(848) int local848;
				if (local365.aClass1_1 instanceof Class1_Sub1_Sub2_Sub2) {
					@Pc(732) Class1_Sub1_Sub2_Sub2 local732 = (Class1_Sub1_Sub2_Sub2) local365.aClass1_1;
					if (local732.aClass12_1 != null) {
						if ((local732.aClass12_1.anInt313 & 0x1) == 0 && (local732.anInt7660 & 0x7F) == 0 && (local732.anInt7659 & 0x7F) == 0 || (local732.aClass12_1.anInt313 & 0x1) == 1 && (local732.anInt7660 & 0x7F) == 64 && (local732.anInt7659 & 0x7F) == 64) {
							local65 = local732.anInt7660 - (local732.aClass12_1.anInt313 - 1 << 6);
							local74 = local732.anInt7659 - (local732.aClass12_1.anInt313 - 1 << 6);
							for (local77 = 0; local77 < Static520.anInt1936; local77++) {
								@Pc(819) Class2_Sub11 local819 = (Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local77]);
								if (local819 != null) {
									@Pc(824) Class1_Sub1_Sub2_Sub2 local824 = local819.aClass1_Sub1_Sub2_Sub2_1;
									if (local824.anInt5086 != Static115.anInt2326 && local824 != local732 && local824.aBoolean384) {
										local848 = local824.anInt7660 - (local824.aClass12_1.anInt313 - 1 << 6);
										local497 = local824.anInt7659 - (local824.aClass12_1.anInt313 - 1 << 6);
										if (local848 >= local65 && local732.aClass12_1.anInt313 - (local848 - local65 >> 7) >= local824.aClass12_1.anInt313 && local74 <= local497 && local732.aClass12_1.anInt313 - (local497 - local74 >> 7) >= local824.aClass12_1.anInt313) {
											Static347.method5460(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local365.anInt4918, local824);
											local824.anInt5086 = Static115.anInt2326;
										}
									}
								}
							}
							local86 = Static16.anInt362;
							@Pc(921) int[] local921 = Static325.anIntArray473;
							for (local848 = 0; local848 < local86; local848++) {
								@Pc(931) Class1_Sub1_Sub2_Sub1 local931 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local921[local848]];
								if (local931 != null && local931.anInt5086 != Static115.anInt2326 && local931.aBoolean384) {
									local509 = local931.anInt7660 - (local931.method4394() - 1 << 6);
									local142 = local931.anInt7659 - (local931.method4394() - 1 << 6);
									if (local509 >= local65 && local931.method4394() <= local732.aClass12_1.anInt313 - (local509 - local65 >> 7) && local142 >= local74 && local931.method4394() <= local732.aClass12_1.anInt313 - (local142 - local74 >> 7)) {
										Static125.method2369(local931, local365.anInt4918 != Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90);
										local931.anInt5086 = Static115.anInt2326;
									}
								}
							}
						}
						if (local732.anInt5086 == Static115.anInt2326) {
							continue;
						}
						Static347.method5460(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local365.anInt4918, local732);
						local732.anInt5086 = Static115.anInt2326;
					}
				}
				if (local365.aClass1_1 instanceof Class1_Sub5_Sub1) {
					local56 = Static238.anInt4280 + local365.anInt4921;
					local65 = local365.anInt4920 + Static371.anInt6936;
					@Pc(1085) Class2_Sub40 local1085 = (Class2_Sub40) Static357.aClass127_36.method3205((long) (local56 | local365.anInt4918 << 28 | local65 << 14));
					if (local1085 != null) {
						for (@Pc(1095) Class2_Sub27 local1095 = (Class2_Sub27) local1085.aClass249_57.method6521(); local1095 != null; local1095 = (Class2_Sub27) local1085.aClass249_57.method6526()) {
							@Pc(1103) Class300 local1103 = Static464.aClass115_1.method2970(local1095.anInt3463);
							if (!Static21.aBoolean31) {
								if (Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local365.anInt4918) {
									@Pc(1113) String[] local1113 = local1103.aStringArray43;
									for (local848 = 4; local848 >= 0; local848--) {
										if (local1113 != null && local1113[local848] != null) {
											@Pc(1125) byte local1125 = 0;
											if (local848 == 0) {
												local1125 = 60;
											}
											local509 = Static145.anInt2686;
											if (local848 == 1) {
												local1125 = 3;
											}
											if (local848 == 2) {
												local1125 = 22;
											}
											if (local848 == 3) {
												local1125 = 50;
											}
											if (local1103.anInt8925 == local848) {
												local509 = local1103.anInt8900;
											}
											if (local848 == 4) {
												local1125 = 4;
											}
											if (local848 == local1103.anInt8901) {
												local509 = local1103.anInt8913;
											}
											Static111.method2154((long) local1095.anInt3463, -1, local1125, local365.anInt4920, true, local1113[local848], local365.anInt4921, "<col=ff9040>" + local1103.aString197, local509, false);
										}
									}
								}
								Static111.method2154((long) local1095.anInt3463, -1, 1002, local365.anInt4920, true, Static148.aClass202_87.method5139(Static172.anInt6352), local365.anInt4921, "<col=ff9040>" + local1103.aString197, Static4.anInt114, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local365.anInt4918);
							} else if (Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local365.anInt4918) {
								@Pc(1265) Class73 local1265 = Static74.anInt1557 == -1 ? null : Static66.aClass247_1.method6470(Static74.anInt1557);
								if ((Static176.anInt3294 & 0x1) != 0 && (local1265 == null || local1103.method7473(Static74.anInt1557, local1265.anInt2133) != local1265.anInt2133)) {
									Static111.method2154((long) local1095.anInt3463, -1, 17, local365.anInt4920, true, Static131.aString66, local365.anInt4921, Static125.aString61 + " -> <col=ff9040>" + local1103.aString197, Static472.anInt8248, false);
								}
							}
						}
					}
				}
				if (local365.aClass1_1 instanceof Interface6) {
					@Pc(1330) Interface6 local1330 = (Interface6) local365.aClass1_1;
					@Pc(1339) Class129 local1339 = Static505.aClass206_4.method5326(local1330.method7688());
					if (local1339.anIntArray392 != null) {
						local1339 = local1339.method3276(Static84.aClass302_1);
					}
					if (local1339 != null) {
						if (!Static21.aBoolean31) {
							if (local365.anInt4918 == Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90) {
								@Pc(1439) String[] local1439 = local1339.aStringArray21;
								if (local1439 != null) {
									for (local77 = 4; local77 >= 0; local77--) {
										if (local1439[local77] != null) {
											@Pc(1451) short local1451 = 0;
											local95 = Static145.anInt2686;
											if (local77 == 0) {
												local1451 = 10;
											}
											if (local77 == 1) {
												local1451 = 49;
											}
											if (local77 == 2) {
												local1451 = 8;
											}
											if (local77 == 3) {
												local1451 = 20;
											}
											if (local77 == local1339.anInt3685) {
												local95 = local1339.anInt3692;
											}
											if (local77 == 4) {
												local1451 = 1010;
											}
											if (local77 == local1339.anInt3676) {
												local95 = local1339.anInt3684;
											}
											Static111.method2154(Static383.method5987(local1330, local365.anInt4921, local365.anInt4920), -1, local1451, local365.anInt4920, true, local1439[local77], local365.anInt4921, "<col=00ffff>" + local1339.aString92, local95, false);
										}
									}
								}
							}
							Static111.method2154((long) local1339.anInt3646, -1, 1006, local365.anInt4920, true, Static148.aClass202_87.method5139(Static172.anInt6352), local365.anInt4921, "<col=00ffff>" + local1339.aString92, Static4.anInt114, local365.anInt4918 != Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90);
						} else if (local365.anInt4918 == Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90) {
							@Pc(1372) Class73 local1372 = Static74.anInt1557 == -1 ? null : Static66.aClass247_1.method6470(Static74.anInt1557);
							if ((Static176.anInt3294 & 0x4) != 0 && (local1372 == null || local1339.method3266(local1372.anInt2133, Static74.anInt1557) != local1372.anInt2133)) {
								Static111.method2154(Static383.method5987(local1330, local365.anInt4921, local365.anInt4920), -1, 57, local365.anInt4920, true, Static131.aString66, local365.anInt4921, Static125.aString61 + " -> <col=00ffff>" + local1339.aString92, Static472.anInt8248, false);
							}
						}
					}
				}
			}
		}
	}
}
