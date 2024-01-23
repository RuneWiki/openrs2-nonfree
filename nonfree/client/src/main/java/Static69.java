import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[Lclient!ql;")
	public static Class64_Sub1[] aClass64_Sub1Array1;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public static volatile int anInt1422 = -1;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "[I")
	public static int[] anIntArray134 = new int[1000];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(6) int local6 = arg2 - arg3;
		if (arg2 < Static158.anInt3242) {
			local6++;
		}
		@Pc(23) int local23 = arg4 - arg0;
		if (Static207.anInt2141 > arg4) {
			local23++;
		}
		@Pc(34) int local34;
		@Pc(49) int local49;
		@Pc(59) int local59;
		@Pc(64) int local64;
		@Pc(76) int local76;
		@Pc(119) int local119;
		@Pc(142) int local142;
		@Pc(163) int local163;
		@Pc(167) int local167;
		@Pc(212) int local212;
		@Pc(227) int local227;
		@Pc(237) int local237;
		@Pc(257) int local257;
		@Pc(280) int local280;
		@Pc(302) int local302;
		@Pc(403) int local403;
		@Pc(386) int local386;
		@Pc(186) int[][] local186;
		for (local34 = 0; local34 < local23; local34++) {
			local49 = arg7 * local34 >> 16;
			local59 = (local34 + 1) * arg7 >> 16;
			local64 = local59 - local49;
			if (local64 > 0) {
				local76 = arg0 + local34 >> 6;
				if (local76 >= 0 && Static280.anIntArrayArrayArray14.length - 1 >= local76) {
					local49 += arg5;
					local186 = Static280.anIntArrayArrayArray14[local76];
					local59 += arg5;
					@Pc(194) byte[][] local194 = Static245.aByteArrayArrayArray14[local76];
					@Pc(198) byte[][] local198 = Static293.aByteArrayArrayArray16[local76];
					@Pc(202) byte[][] local202 = Static211.aByteArrayArrayArray12[local76];
					@Pc(206) byte[][] local206 = Static301.aByteArrayArrayArray17[local76];
					@Pc(210) byte[][] local210 = Static138.aByteArrayArrayArray9[local76];
					for (local212 = 0; local212 < local6; local212++) {
						local227 = arg1 * local212 >> 16;
						local237 = (local212 + 1) * arg1 >> 16;
						@Pc(241) int local241 = local237 - local227;
						if (local241 > 0) {
							local227 += arg6;
							local257 = arg3 + local212 >> 6;
							local237 += arg6;
							@Pc(267) int local267 = arg3 + local212 & 0x3F;
							@Pc(273) int local273 = arg0 + local34 & 0x3F;
							local280 = (local267 << 6) + local273;
							if (local257 < 0 || local257 > local186.length - 1 || local186[local257] == null) {
								if (Static115.aClass4_Sub2_Sub18_1.anInt4527 != -1) {
									local302 = Static115.aClass4_Sub2_Sub18_1.anInt4527;
								} else if ((local212 + arg3 & 0x4) == (arg0 + local34 & 0x4)) {
									local302 = Static112.anIntArray191[Static132.anInt2620 + 1];
								} else {
									local302 = 4936552;
								}
								if (local257 < 0 || local257 > local186.length - 1) {
									if (local302 == 0) {
										local302 = 1;
									}
									Static258.method4031(local49, local227, local64, local241, local302);
									continue;
								}
							} else {
								local302 = local186[local257][local280];
							}
							if (local302 == 0) {
								local302 = 1;
							}
							local386 = local198[local257] == null ? 0 : Static112.anIntArray191[local198[local257][local280] & 0xFF];
							local403 = local194[local257] == null ? 0 : Static112.anIntArray191[local194[local257][local280] & 0xFF];
							@Pc(446) int local446;
							if (local403 == 0 && local386 == 0) {
								Static258.method4031(local49, local227, local64, local241, local302);
							} else {
								@Pc(442) byte local442;
								if (local403 != 0) {
									if (local403 == -1) {
										local403 = 1;
									}
									local442 = local202[local257] == null ? 0 : local202[local257][local280];
									local446 = local442 & 0xFC;
									if (local446 == 0 || local64 <= 1 || local241 <= 1) {
										Static258.method4031(local49, local227, local64, local241, local403);
									} else {
										Static63.method1163(local49, Static258.anIntArray399, local64, local403, local302, local241, local227, true, local446 >> 2, local442 & 0x3);
									}
								}
								if (local386 != 0) {
									if (local386 == -1) {
										local386 = local302;
									}
									local442 = local206[local257][local280];
									local446 = local442 & 0xFC;
									if (local446 == 0 || local64 <= 1 || local241 <= 1) {
										Static258.method4031(local49, local227, local64, local241, local386);
									}
									Static63.method1163(local49, Static258.anIntArray399, local64, local386, 0, local241, local227, local403 == 0, local446 >> 2, local442 & 0x3);
								}
							}
							if (local210[local257] != null) {
								@Pc(556) int local556 = local210[local257][local280] & 0xFF;
								if (local556 != 0) {
									@Pc(568) int local568;
									if (local241 == 1) {
										local568 = local227;
									} else {
										local568 = local237 - 1;
									}
									@Pc(574) int local574 = 13421772;
									if (local556 >= 5 && local556 <= 8 || local556 >= 13 && local556 <= 16 || local556 >= 21 && local556 <= 24 || local556 == 27 || local556 == 28) {
										local556 -= 4;
										local574 = 13369344;
									}
									if (local64 == 1) {
										local446 = local49;
									} else {
										local446 = local59 - 1;
									}
									if (local556 == 1) {
										Static258.method4018(local49, local227, local241, local574);
									} else if (local556 == 2) {
										Static258.method4021(local49, local227, local64, local574);
									} else if (local556 == 3) {
										Static258.method4018(local446, local227, local241, local574);
									} else if (local556 == 4) {
										Static258.method4021(local49, local568, local64, local574);
									} else if (local556 == 9) {
										Static258.method4018(local49, local227, local241, 16777215);
										Static258.method4021(local49, local227, local64, local574);
									} else if (local556 == 10) {
										Static258.method4018(local446, local227, local241, 16777215);
										Static258.method4021(local49, local227, local64, local574);
									} else if (local556 == 11) {
										Static258.method4018(local446, local227, local241, 16777215);
										Static258.method4021(local49, local568, local64, local574);
									} else if (local556 == 12) {
										Static258.method4018(local49, local227, local241, 16777215);
										Static258.method4021(local49, local568, local64, local574);
									} else if (local556 == 17) {
										Static258.method4021(local49, local227, 1, local574);
									} else if (local556 == 18) {
										Static258.method4021(local446, local227, 1, local574);
									} else if (local556 == 19) {
										Static258.method4021(local446, local568, 1, local574);
									} else if (local556 == 20) {
										Static258.method4021(local49, local568, 1, local574);
									} else {
										@Pc(733) int local733;
										if (local556 == 25) {
											for (local733 = 0; local733 < local241; local733++) {
												Static258.method4021(local49 + local733, local568 + -local733, 1, local574);
											}
										} else if (local556 == 26) {
											for (local733 = 0; local733 < local241; local733++) {
												Static258.method4021(local733 + local49, local227 + local733, 1, local574);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local49 += arg5;
					for (@Pc(95) int local95 = 0; local95 < local6; local95++) {
						if (Static115.aClass4_Sub2_Sub18_1.anInt4527 != -1) {
							local119 = Static115.aClass4_Sub2_Sub18_1.anInt4527;
						} else if ((local34 + arg0 & 0x4) == (local95 + arg3 & 0x4)) {
							local119 = Static112.anIntArray191[Static132.anInt2620 + 1];
						} else {
							local119 = 4936552;
						}
						local142 = (local95 * arg1 >> 16) + arg6;
						if (local119 == 0) {
							local119 = 1;
						}
						local163 = (arg1 * (local95 + 1) >> 16) + arg6;
						local167 = local163 - local142;
						Static258.method4031(local49, local142, local64, local167, local119);
					}
				}
			}
		}
		for (local34 = -2; local34 < local23 + 2; local34++) {
			local49 = arg7 * local34 >> 16;
			local59 = arg7 * (local34 + 1) >> 16;
			local64 = local59 - local49;
			if (local64 > 0) {
				local49 += arg5;
				local76 = local34 + arg0 >> 6;
				if (local76 >= 0 && local76 <= Static108.anIntArrayArrayArray2.length - 1) {
					local186 = Static108.anIntArrayArrayArray2[local76];
					for (local119 = -2; local119 < local6 + 2; local119++) {
						local142 = arg1 * local119 >> 16;
						local163 = arg1 * (local119 + 1) >> 16;
						local167 = local163 - local142;
						if (local167 > 0) {
							@Pc(951) int local951 = local119 + arg3 >> 6;
							local142 += arg6;
							if (local951 >= 0 && local951 <= local186.length - 1) {
								local212 = ((local119 + arg3 & 0x3F) << 6) + (arg0 + local34 & 0x3F);
								if (local186[local951] != null) {
									local227 = local186[local951][local212];
									local237 = local227 & 0x1FFF;
									if (local237 != 0) {
										@Pc(1010) Class2 local1010 = Static141.method2262(local237 - 1);
										@Pc(1021) boolean local1021 = (local227 >> 15 & 0x1) == 1;
										local257 = local227 >> 13 & 0x3;
										@Pc(1033) Class58_Sub2 local1033 = local1010.method7(local1021, local257);
										if (local1033 != null) {
											local280 = local64 * local1033.anInt5028 / 4;
											local302 = local1033.anInt5023 * local167 / 4;
											if (local1010.aBoolean1) {
												local403 = local227 >> 16 & 0xF;
												local386 = local227 >> 20 & 0xF;
												if ((local257 & 0x1) == 1) {
													local257 = local403;
													local403 = local386;
													local386 = local257;
												}
												local280 = local403 * local64;
												local302 = local386 * local167;
											}
											if (local280 != 0 && local302 != 0) {
												if (local1010.anInt9 == 0) {
													local1033.method3980(local49, local142 + local167 - local302, local280, local302);
												} else {
													local1033.method3982(local49, local142 + local167 - local302, local280, local302, local1010.anInt9);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	public static void method1190() {
		Static220.method3410();
		Static133.anInterface2Array1 = new Interface2[9];
		Static133.anInterface2Array1[1] = new Class61();
		Static133.anInterface2Array1[2] = new Class134();
		Static133.anInterface2Array1[3] = new Class140();
		Static133.anInterface2Array1[4] = new Class180();
		Static133.anInterface2Array1[5] = new Class98();
		Static133.anInterface2Array1[6] = new Class83();
		Static133.anInterface2Array1[7] = new Class135();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method1191() {
		Static175.aClass172_32.method4349(5);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V")
	public static void method1193() {
		Static282.aClass172_45.method4349(5);
		Static144.aClass172_24.method4349(5);
	}
}
