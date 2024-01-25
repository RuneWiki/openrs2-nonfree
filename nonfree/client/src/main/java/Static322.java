import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_177 = new Class272(79, 6);

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_120 = new Class298(11, 6);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!r;I)Z")
	public static boolean method5008(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(11) int local11 = (Static400.anInt6818 - 104) / 2;
		@Pc(17) int local17 = (Static271.anInt5050 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static1.method6(arg0, local29, local25, local21)) {
						local40 = local29;
						if (Static425.method6053(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static223.method3867(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(82) int[] local82 = new int[262144];
		for (local29 = 0; local29 < local82.length; local29++) {
			local82[local29] = -16777216;
		}
		Static564.aClass46_32 = arg1.method7198(local82, 512, 512, 512);
		Static589.method7755();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D) + 228 << 8) - ((int) (Math.random() * 20.0D) + 238)) - 10 | 0xFF000000;
		@Pc(150) int local150 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x7818FF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(182) boolean[][] local182 = new boolean[Static118.anInt2715 + 1][Static118.anInt2715 + 1];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(196) int local196;
		@Pc(205) int local205;
		@Pc(212) int local212;
		@Pc(222) int local222;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(310) int local310;
		@Pc(316) int local316;
		@Pc(321) int local321;
		@Pc(340) int local340;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static118.anInt2715) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static118.anInt2715) {
				local192 = 0;
				local194 = 0;
				local196 = local184;
				if (local184 > 0) {
					local196 = local184 - 1;
					local192 += 4;
				}
				local205 = local188;
				if (local188 > 0) {
					local205 = local188 - 1;
				}
				local212 = Static118.anInt2715 + local184;
				if (local212 < 104) {
					local212++;
				}
				local222 = Static118.anInt2715 + local188;
				if (local222 < 104) {
					local194 += 4;
					local222++;
				}
				arg1.da(0, 0, local192 + Static118.anInt2715 * 4, local194 + Static118.anInt2715 * 4);
				arg1.ja(-16777216);
				@Pc(257) int local257;
				for (local249 = arg0; local249 <= 3; local249++) {
					for (local253 = 0; local253 <= Static118.anInt2715; local253++) {
						for (local257 = 0; local257 <= Static118.anInt2715; local257++) {
							local182[local253][local257] = Static1.method6(arg0, local249, local257 + local205, local253 + local196);
						}
					}
					Static374.aClass139Array17[local249].method6891(local196, local205, local212, local222, local182);
					if (!Static236.aBoolean344) {
						for (local257 = -4; local257 < Static118.anInt2715; local257++) {
							for (local310 = -4; local310 < Static118.anInt2715; local310++) {
								local316 = local184 + local257;
								local321 = local188 + local310;
								if (local316 >= local11 && local321 >= local17 && Static1.method6(arg0, local249, local321, local316)) {
									local340 = local249;
									if (Static425.method6053(local316, local321)) {
										local340 = local249 - 1;
									}
									if (local340 >= 0) {
										Static428.method1621((Static118.anInt2715 - local310) * 4 + local194 - 4, local192 + local257 * 4, local40, local340, local321, local316, local150, arg1);
									}
								}
							}
						}
					}
				}
				if (Static236.aBoolean344) {
					@Pc(398) Class95 local398 = Static221.aClass95Array2[arg0];
					for (local257 = 0; local257 < Static118.anInt2715; local257++) {
						for (local310 = 0; local310 < Static118.anInt2715; local310++) {
							local316 = local184 + local257;
							local321 = local188 + local310;
							local340 = local398.anIntArrayArray22[local316 - local398.anInt3047][local321 - local398.anInt3057];
							if ((local340 & 0x40240000) != 0) {
								arg1.method7185((Static118.anInt2715 - local310) * 4 + local194 - 4, 4, 4, local257 * 4 + local192, -1713569622);
							} else if ((local340 & 0x800000) != 0) {
								arg1.method7200(local257 * 4 + local192, -1713569622, 4, local194 + (Static118.anInt2715 - local310) * 4 - 4);
							} else if ((local340 & 0x2000000) != 0) {
								arg1.method7213(local192 + local257 * 4 + 3, 4, -1713569622, (Static118.anInt2715 - local310) * 4 + local194 - 4);
							} else if ((local340 & 0x8000000) != 0) {
								arg1.method7200(local257 * 4 + local192, -1713569622, 4, (Static118.anInt2715 - local310) * 4 + local194 - 1);
							} else if ((local340 & 0x20000000) != 0) {
								arg1.method7213(local257 * 4 + local192, 4, -1713569622, (Static118.anInt2715 - local310) * 4 + local194 - 4);
							}
						}
					}
				}
				arg1.J(local192, local194, Static118.anInt2715 * 4, Static118.anInt2715 * 4, local174, 2);
				Static564.aClass46_32.da((local184 - local11) * 4 + 48, -((-local17 + local188) * 4) + 464 - Static118.anInt2715 * 4, Static118.anInt2715 * 4, Static118.anInt2715 * 4, local192, local194);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static121.method2508();
		Static272.anInt5060 = 0;
		Static17.aClass130_4.method3541();
		if (!Static236.aBoolean344) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local192 = local17; local192 < local17 + 104; local192++) {
					for (local194 = arg0; arg0 + 1 >= local194 && local194 <= 3; local194++) {
						if (Static1.method6(arg0, local194, local192, local188)) {
							@Pc(689) Interface22 local689 = (Interface22) Static168.method7472(local194, local188, local192);
							if (local689 == null) {
								local689 = (Interface22) Static417.method5998(local194, local188, local192, qu.class);
							}
							if (local689 == null) {
								local689 = (Interface22) Static247.method4031(local194, local188, local192);
							}
							if (local689 == null) {
								local689 = (Interface22) Static339.method5173(local194, local188, local192);
							}
							if (local689 != null) {
								@Pc(730) Class23 local730 = Static476.aClass69_5.method2181(local689.method7088());
								if (!local730.aBoolean58 || Static137.aBoolean250) {
									local212 = local730.anInt776;
									if (local730.anIntArray78 != null) {
										for (local222 = 0; local222 < local730.anIntArray78.length; local222++) {
											if (local730.anIntArray78[local222] != -1) {
												@Pc(761) Class23 local761 = Static476.aClass69_5.method2181(local730.anIntArray78[local222]);
												if (local761.anInt776 >= 0) {
													local212 = local761.anInt776;
												}
											}
										}
									}
									if (local212 >= 0) {
										@Pc(780) boolean local780 = false;
										if (local212 >= 0) {
											@Pc(787) Class40 local787 = Static191.aClass168_2.method4062(local212);
											if (local787 != null && local787.aBoolean92) {
												local780 = true;
											}
										}
										local249 = local188;
										local253 = local192;
										if (local780) {
											@Pc(805) int[][] local805 = Static221.aClass95Array2[local194].anIntArrayArray22;
											local310 = Static221.aClass95Array2[local194].anInt3047;
											local316 = Static221.aClass95Array2[local194].anInt3057;
											for (local321 = 0; local321 < 10; local321++) {
												local340 = (int) (Math.random() * 4.0D);
												if (local340 == 0 && local11 < local249 && local249 > local188 - 3 && (local805[local249 - local310 - 1][local253 - local316] & 0x2C0108) == 0) {
													local249--;
												}
												if (local340 == 1 && local11 + 104 - 1 > local249 && local188 + 3 > local249 && (local805[local249 + 1 - local310][local253 - local316] & 0x2C0180) == 0) {
													local249++;
												}
												if (local340 == 2 && local253 > local17 && local253 > local192 - 3 && (local805[local249 - local310][local253 - local316 - 1] & 0x2C0102) == 0) {
													local253--;
												}
												if (local340 == 3 && local253 < local17 + 104 - 1 && local253 < local192 + 3 && (local805[local249 - local310][local253 + 1 - local316] & 0x2C0120) == 0) {
													local253++;
												}
											}
										}
										Static119.anIntArray241[Static272.anInt5060] = local730.anInt764;
										Static501.anIntArray614[Static272.anInt5060] = local249;
										Static337.anIntArray466[Static272.anInt5060] = local253;
										Static272.anInt5060++;
									}
								}
							}
						}
					}
				}
			}
			if (Static190.aClass149_1 != null) {
				Static531.aClass246_249.anInt6627 = 1;
				Static191.aClass168_2.method4063(64, 1024);
				for (local192 = 0; local192 < Static190.aClass149_1.anInt4386; local192++) {
					local194 = Static190.aClass149_1.anIntArray352[local192];
					if (local194 >> 28 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126) {
						local196 = (local194 >> 14 & 0x3FFF) - Static529.anInt8344;
						local205 = (local194 & 0x3FFF) - Static463.anInt7588;
						if (local196 >= 0 && Static400.anInt6818 > local196 && local205 >= 0 && Static271.anInt5050 > local205) {
							Static17.aClass130_4.method3548(new Class3_Sub4(local192));
						} else {
							@Pc(1083) Class40 local1083 = Static191.aClass168_2.method4062(Static190.aClass149_1.anIntArray351[local192]);
							if (local1083.anIntArray104 != null && local1083.anInt1391 + local196 >= 0 && local196 + local1083.anInt1407 < Static400.anInt6818 && local205 + local1083.anInt1386 >= 0 && Static271.anInt5050 > local1083.anInt1406 + local205) {
								Static17.aClass130_4.method3548(new Class3_Sub4(local192));
							}
						}
					}
				}
				Static191.aClass168_2.method4063(64, 128);
				Static531.aClass246_249.anInt6627 = 2;
				Static531.aClass246_249.method5662();
			}
		}
		return true;
	}
}
