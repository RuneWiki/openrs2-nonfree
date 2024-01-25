import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_218 = new Class214(63, 6);

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
	public static final int[] anIntArray371 = new int[1];

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method4701() {
		if (Static79.anInt1462 > 0) {
			Static252.method2868();
		} else {
			Static239.aClass3_4 = Static48.aClass3_2;
			Static48.aClass3_2 = null;
			Static430.method5422(40);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
	public static void method4702(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class250 local8 = Static359.method4655(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray27 != null) {
			@Pc(18) Class1_Sub31 local18 = new Class1_Sub31();
			local18.anObjectArray5 = local8.anObjectArray27;
			local18.aString49 = arg0;
			local18.anInt5073 = arg1;
			local18.aClass250_8 = local8;
			Static267.method3402(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt6983 != 0) {
			local35 = Static317.method4104(local8);
		}
		if (!local35 || !Static52.method804(local8).method1721(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static5.method94(Static98.aClass137_85);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 2) {
			Static5.method94(Static380.aClass137_239);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 3) {
			Static5.method94(Static195.aClass137_132);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 4) {
			Static5.method94(Static205.aClass137_141);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 5) {
			Static5.method94(Static427.aClass137_257);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 6) {
			Static5.method94(Static163.aClass137_116);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 7) {
			Static5.method94(Static43.aClass137_196);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 8) {
			Static5.method94(Static449.aClass137_264);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 9) {
			Static5.method94(Static347.aClass137_215);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
		if (arg1 == 10) {
			Static5.method94(Static410.aClass137_247);
			Static184.method2459(arg2, local8.anInt7030, arg3);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!qa;IZ)V")
	public static void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static66.anInt1148 == 0 || Static409.anInt6638 == 0) {
			return;
		}
		arg1.GA(Static348.anInt5661, Static295.anInt4969, Static66.anInt1148, Static409.anInt6638);
		arg1.pa(Static23.anInt495, Static107.anInt1912, Static66.anInt1148, Static409.anInt6638);
		@Pc(43) Class40 local43 = arg1.method3609();
		local43.Q(Static430.anInt7186, Static201.anInt3269, Static386.anInt6401, Static81.anInt1505, Static148.anInt2498, Static356.anInt5887);
		arg1.m(local43);
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(84) int local84;
		@Pc(92) int local92;
		@Pc(101) int local101;
		@Pc(116) int[] local116;
		@Pc(147) int local147;
		@Pc(156) int local156;
		if (Static240.aClass163Array3 != null) {
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(63) int local63 = arg1.d();
			local72 = (arg2 - Static348.anInt5661) * local63 / Static66.anInt1148;
			local81 = local63 * (arg0 - Static295.anInt4969) / Static409.anInt6638;
			local84 = arg1.W();
			local92 = (arg2 - Static348.anInt5661) * local84 / Static66.anInt1148;
			local101 = (arg0 - Static295.anInt4969) * local84 / Static409.anInt6638;
			local116 = new int[] { local72, local81, local63 };
			local43.X(local116);
			@Pc(134) int[] local134 = new int[] { local92, local101, local84 };
			local43.X(local134);
			@Pc(139) float local139 = 0.0F;
			local147 = local134[0] - local116[0];
			local156 = local134[1] - local116[1];
			@Pc(165) int local165 = local134[2] - local116[2];
			while (local139 < 1.0F) {
				@Pc(178) int local178 = (int) ((float) local147 * local139 + (float) local116[0]);
				@Pc(182) int local182 = local178 >> 7;
				@Pc(193) int local193 = (int) ((float) local116[2] + local139 * (float) local165);
				@Pc(197) int local197 = local193 >> 7;
				if (local182 > 0 && local197 > 0 && local182 < Static425.anInt6922 && Static251.anInt4072 > local197) {
					@Pc(221) int local221 = Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89;
					if (local221 < 3 && (Static357.aByteArrayArrayArray11[1][local182][local197] & 0x2) != 0) {
						local221++;
					}
					if ((float) Static240.aClass163Array3[local221].va(local178, local193) < (float) local156 * local139 + (float) local116[1]) {
						local58 = local178 + (Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() - 1 << 6) >> 7;
						local60 = local193 + (Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() - 1 << 6) >> 7;
						break;
					}
				}
				local139 = (float) ((double) local139 + 0.01D);
			}
			if (local58 != -1 && local60 != -1) {
				if (Static360.aBoolean498 && (Static20.anInt436 & 0x40) != 0) {
					@Pc(313) Class250 local313 = Static359.method4655(Static315.anInt5215, Static234.anInt3782);
					if (local313 == null) {
						Static172.method2334();
					} else {
						Static87.method1275(false, local58, 0L, " ->", Static161.anInt1936, true, Static149.aString68, -1, local60, 45);
					}
				} else {
					if (Static357.aClass6_4 == Static43.aClass6_3) {
						Static87.method1275(false, local58, 0L, "", -1, true, Static393.aClass151_200.method3122(Static188.anInt3028), -1, local60, 44);
					}
					Static87.method1275(false, local58, 0L, "", Static281.anInt4403, true, Static249.aString40, -1, local60, 5);
				}
			}
		}
		@Pc(369) Class227 local369 = Static449.aClass227_8;
		for (@Pc(374) Class13_Sub4 local374 = (Class13_Sub4) local369.method4827(); local374 != null; local374 = (Class13_Sub4) local369.method4834()) {
			if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local374.anInt4197 && local374.method3383(arg0, arg1, arg2)) {
				@Pc(498) int local498;
				if (local374.aClass20_1 instanceof Class20_Sub3_Sub3_Sub1) {
					@Pc(400) Class20_Sub3_Sub3_Sub1 local400 = (Class20_Sub3_Sub3_Sub1) local374.aClass20_1;
					local72 = local400.method4678();
					if ((local72 & 0x1) == 0 && (local400.anInt6613 & 0x7F) == 0 && (local400.anInt6616 & 0x7F) == 0 || (local72 & 0x1) == 1 && (local400.anInt6613 & 0x7F) == 64 && (local400.anInt6616 & 0x7F) == 64) {
						local81 = local400.anInt6613 - (local400.method4678() - 1 << 6);
						local84 = local400.anInt6616 - (local400.method4678() - 1 << 6);
						@Pc(510) int local510;
						for (local92 = 0; local92 < Static411.anInt6695; local92++) {
							@Pc(476) Class20_Sub3_Sub3_Sub2 local476 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local92]];
							if (local476 != null && Static368.anInt6250 != local476.anInt6070 && local476.aBoolean503) {
								local498 = local476.anInt6613 - (local476.aClass246_1.anInt6830 - 1 << 6);
								local510 = local476.anInt6616 - (local476.aClass246_1.anInt6830 - 1 << 6);
								if (local81 <= local498 && local476.aClass246_1.anInt6830 <= local400.method4678() - (local498 - local81 >> 7) && local84 <= local510 && local476.aClass246_1.anInt6830 <= local400.method4678() - (local510 - local84 >> 7)) {
									Static212.method2831(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local374.anInt4197, local476);
									local476.anInt6070 = Static368.anInt6250;
								}
							}
						}
						local101 = Static31.anInt624;
						local116 = Static363.anIntArray373;
						for (local510 = 0; local510 < local101; local510++) {
							@Pc(585) Class20_Sub3_Sub3_Sub1 local585 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local116[local510]];
							if (local585 != null && local585.anInt6070 != Static368.anInt6250 && local585 != local400 && local585.aBoolean503) {
								local147 = local585.anInt6613 - (local585.method4678() - 1 << 6);
								local156 = local585.anInt6616 - (local585.method4678() - 1 << 6);
								if (local147 >= local81 && local585.method4678() <= local400.method4678() - (local147 - local81 >> 7) && local84 <= local156 && local585.method4678() <= local400.method4678() - (local156 - local84 >> 7)) {
									Static184.method2457(local585, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local374.anInt4197);
									local585.anInt6070 = Static368.anInt6250;
								}
							}
						}
					}
					if (Static368.anInt6250 == local400.anInt6070) {
						continue;
					}
					Static184.method2457(local400, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local374.anInt4197);
					local400.anInt6070 = Static368.anInt6250;
				}
				if (local374.aClass20_1 instanceof Class20_Sub3_Sub3_Sub2) {
					@Pc(727) Class20_Sub3_Sub3_Sub2 local727 = (Class20_Sub3_Sub3_Sub2) local374.aClass20_1;
					if (local727.aClass246_1 != null) {
						if ((local727.aClass246_1.anInt6830 & 0x1) == 0 && (local727.anInt6613 & 0x7F) == 0 && (local727.anInt6616 & 0x7F) == 0 || (local727.aClass246_1.anInt6830 & 0x1) == 1 && (local727.anInt6613 & 0x7F) == 64 && (local727.anInt6616 & 0x7F) == 64) {
							local72 = local727.anInt6613 - (local727.aClass246_1.anInt6830 - 1 << 6);
							local81 = local727.anInt6616 - (local727.aClass246_1.anInt6830 - 1 << 6);
							for (local84 = 0; local84 < Static411.anInt6695; local84++) {
								@Pc(804) Class20_Sub3_Sub3_Sub2 local804 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local84]];
								if (local804 != null && local804.anInt6070 != Static368.anInt6250 && local804 != local727 && local804.aBoolean503) {
									local101 = local804.anInt6613 - (local804.aClass246_1.anInt6830 - 1 << 6);
									local498 = local804.anInt6616 - (local804.aClass246_1.anInt6830 - 1 << 6);
									if (local72 <= local101 && local727.aClass246_1.anInt6830 - (local101 - local72 >> 7) >= local804.aClass246_1.anInt6830 && local498 >= local81 && local727.aClass246_1.anInt6830 - (local498 - local81 >> 7) >= local804.aClass246_1.anInt6830) {
										Static212.method2831(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local374.anInt4197, local804);
										local804.anInt6070 = Static368.anInt6250;
									}
								}
							}
							local92 = Static31.anInt624;
							@Pc(902) int[] local902 = Static363.anIntArray373;
							for (local498 = 0; local498 < local92; local498++) {
								@Pc(912) Class20_Sub3_Sub3_Sub1 local912 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local902[local498]];
								if (local912 != null && local912.anInt6070 != Static368.anInt6250 && local912.aBoolean503) {
									@Pc(938) int local938 = local912.anInt6613 - (local912.method4678() - 1 << 6);
									local147 = local912.anInt6616 - (local912.method4678() - 1 << 6);
									if (local938 >= local72 && local912.method4678() <= local727.aClass246_1.anInt6830 - (local938 - local72 >> 7) && local147 >= local81 && local912.method4678() <= local727.aClass246_1.anInt6830 - (local147 - local81 >> 7)) {
										Static184.method2457(local912, Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 != local374.anInt4197);
										local912.anInt6070 = Static368.anInt6250;
									}
								}
							}
						}
						if (local727.anInt6070 == Static368.anInt6250) {
							continue;
						}
						Static212.method2831(local374.anInt4197 != Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local727);
						local727.anInt6070 = Static368.anInt6250;
					}
				}
				if (local374.aClass20_1 instanceof Class20_Sub5_Sub1) {
					@Pc(1058) Class1_Sub19 local1058 = (Class1_Sub19) Static194.aClass257_13.method5503((long) (local374.anInt4202 | local374.anInt4197 << 28 | local374.anInt4198 << 14));
					if (local1058 != null) {
						for (@Pc(1070) Class1_Sub13 local1070 = (Class1_Sub13) local1058.aClass254_15.method5439(); local1070 != null; local1070 = (Class1_Sub13) local1058.aClass254_15.method5435()) {
							@Pc(1078) Class74 local1078 = Static227.aClass65_2.method1327(local1070.anInt1501);
							if (!Static360.aBoolean498) {
								if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local374.anInt4197) {
									@Pc(1088) String[] local1088 = local1078.aStringArray15;
									for (local92 = 4; local92 >= 0; local92--) {
										if (local1088 != null && local1088[local92] != null) {
											@Pc(1100) byte local1100 = 0;
											if (local92 == 0) {
												local1100 = 58;
											}
											local498 = Static229.anInt3720;
											if (local92 == 1) {
												local1100 = 22;
											}
											if (local92 == 2) {
												local1100 = 20;
											}
											if (local92 == 3) {
												local1100 = 50;
											}
											if (local92 == 4) {
												local1100 = 2;
											}
											if (local92 == local1078.anInt1869) {
												local498 = local1078.anInt1900;
											}
											if (local92 == local1078.anInt1896) {
												local498 = local1078.anInt1865;
											}
											Static87.method1275(false, local374.anInt4202, (long) local1070.anInt1501, "<col=ff9040>" + local1078.aString14, local498, true, local1088[local92], -1, local374.anInt4198, local1100);
										}
									}
								}
								Static87.method1275(local374.anInt4197 != Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local374.anInt4202, (long) local1070.anInt1501, "<col=ff9040>" + local1078.aString14, Static299.anInt5002, true, Static111.aClass151_174.method3122(Static188.anInt3028), -1, local374.anInt4198, 1004);
							} else if (local374.anInt4197 == Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89) {
								@Pc(1248) Class78 local1248 = Static331.anInt5403 == -1 ? null : Static85.aClass132_5.method2771(Static331.anInt5403);
								if ((Static20.anInt436 & 0x1) != 0 && (local1248 == null || local1078.method1504(Static331.anInt5403, local1248.anInt1998) != local1248.anInt1998)) {
									Static87.method1275(false, local374.anInt4202, (long) local1070.anInt1501, Static419.aString58 + " -> <col=ff9040>" + local1078.aString14, Static161.anInt1936, true, Static149.aString68, -1, local374.anInt4198, 12);
								}
							}
						}
					}
				}
				if (local374.aClass20_1 instanceof Interface9) {
					@Pc(1313) Interface9 local1313 = (Interface9) local374.aClass20_1;
					@Pc(1320) Class141 local1320 = Static259.aClass95_3.method1821(local1313.method5124());
					if (local1320.anIntArray184 != null) {
						local1320 = local1320.method2832(Static364.aClass259_1);
					}
					if (local1320 != null) {
						if (!Static360.aBoolean498) {
							if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local374.anInt4197) {
								@Pc(1344) String[] local1344 = local1320.aStringArray26;
								if (local1344 != null) {
									for (local84 = 4; local84 >= 0; local84--) {
										if (local1344[local84] != null) {
											@Pc(1356) short local1356 = 0;
											local101 = Static229.anInt3720;
											if (local84 == 0) {
												local1356 = 57;
											}
											if (local84 == 1) {
												local1356 = 16;
											}
											if (local84 == 2) {
												local1356 = 13;
											}
											if (local84 == 3) {
												local1356 = 8;
											}
											if (local84 == local1320.anInt3430) {
												local101 = local1320.anInt3404;
											}
											if (local84 == 4) {
												local1356 = 1012;
											}
											if (local84 == local1320.anInt3400) {
												local101 = local1320.anInt3421;
											}
											Static87.method1275(false, local374.anInt4202, Static41.method652(local374.anInt4202, local1313, local374.anInt4198), "<col=00ffff>" + local1320.aString36, local101, true, local1344[local84], -1, local374.anInt4198, local1356);
										}
									}
								}
							}
							Static87.method1275(local374.anInt4197 != Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local374.anInt4202, (long) local1320.anInt3383, "<col=00ffff>" + local1320.aString36, Static299.anInt5002, true, Static111.aClass151_174.method3122(Static188.anInt3028), -1, local374.anInt4198, 1006);
						} else if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local374.anInt4197) {
							@Pc(1497) Class78 local1497 = Static331.anInt5403 == -1 ? null : Static85.aClass132_5.method2771(Static331.anInt5403);
							if ((Static20.anInt436 & 0x4) != 0 && (local1497 == null || local1320.method2828(local1497.anInt1998, Static331.anInt5403) != local1497.anInt1998)) {
								Static87.method1275(false, local374.anInt4202, Static41.method652(local374.anInt4202, local1313, local374.anInt4198), Static419.aString58 + " -> <col=00ffff>" + local1320.aString36, Static161.anInt1936, true, Static149.aString68, -1, local374.anInt4198, 18);
							}
						}
					}
				}
			}
		}
	}
}
