import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[128][128];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!oa;I)Z")
	public static boolean method4907(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static118.anInt2527 - 104) / 2;
		@Pc(17) int local17 = (Static549.anInt9482 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(34) int local34;
		@Pc(45) int local45;
		for (@Pc(26) int local26 = local11; local26 < local11 + 104; local26++) {
			for (@Pc(30) int local30 = local17; local30 < local17 + 104; local30++) {
				for (local34 = arg1; local34 <= 3; local34++) {
					if (Static151.method2599(local26, local30, arg1, local34)) {
						local45 = local34;
						if (Static307.method4073(local26, local30)) {
							local45 = local34 - 1;
						}
						if (local45 >= 0) {
							local19 &= Static431.method6553(local26, local45, local30);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(91) int[] local91 = new int[262144];
		for (local34 = 0; local34 < local91.length; local34++) {
			local91[local34] = -16777216;
		}
		Static388.aClass119_28 = arg0.method7483(local91, 512, 512, 512);
		Static172.method3278();
		local45 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((238 - (10 - ((int) (Math.random() * 20.0D))) << 16) - (-((int) (Math.random() * 20.0D)) - 238) - 10) | 0xFF000000;
		@Pc(161) int local161 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x612CFF00) << 16;
		@Pc(180) int local180 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(188) boolean[][] local188 = new boolean[Static510.anInt8901 + 1][Static510.anInt8901 + 1];
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(218) int local218;
		@Pc(227) int local227;
		@Pc(253) int local253;
		@Pc(257) int local257;
		@Pc(310) int local310;
		@Pc(316) int local316;
		@Pc(321) int local321;
		@Pc(340) int local340;
		for (@Pc(190) int local190 = local11; local190 < local11 + 104; local190 += Static510.anInt8901) {
			for (local194 = local17; local194 < local17 + 104; local194 += Static510.anInt8901) {
				local198 = 0;
				local200 = 0;
				local202 = local190;
				if (local190 > 0) {
					local198 += 4;
					local202 = local190 - 1;
				}
				local208 = local194;
				if (local194 > 0) {
					local208 = local194 - 1;
				}
				local218 = Static510.anInt8901 + local190;
				if (local218 < 104) {
					local218++;
				}
				local227 = local194 + Static510.anInt8901;
				if (local227 < 104) {
					local227++;
					local200 += 4;
				}
				arg0.ca(0, 0, Static510.anInt8901 * 4 + local198, Static510.anInt8901 * 4 + local200);
				arg0.D(-16777216);
				@Pc(261) int local261;
				for (local253 = arg1; local253 <= 3; local253++) {
					for (local257 = 0; local257 <= Static510.anInt8901; local257++) {
						for (local261 = 0; local261 <= Static510.anInt8901; local261++) {
							local188[local257][local261] = Static151.method2599(local257 + local202, local208 + local261, arg1, local253);
						}
					}
					Static163.aClass52Array4[local253].method7826(local202, local208, local218, local227, local188);
					if (!Static461.aBoolean587) {
						for (local261 = -4; local261 < Static510.anInt8901; local261++) {
							for (local310 = -4; local310 < Static510.anInt8901; local310++) {
								local316 = local261 + local190;
								local321 = local194 + local310;
								if (local316 >= local11 && local321 >= local17 && Static151.method2599(local316, local321, arg1, local253)) {
									local340 = local253;
									if (Static307.method4073(local316, local321)) {
										local340 = local253 - 1;
									}
									if (local340 >= 0) {
										Static395.method6020(local321, local340, arg0, local261 * 4 + local198, local161, local316, local200 + (Static510.anInt8901 + -local310) * 4 - 4, local45);
									}
								}
							}
						}
					}
				}
				if (Static461.aBoolean587) {
					@Pc(399) Class306 local399 = Static95.aClass306Array1[arg1];
					for (local261 = 0; local261 < Static510.anInt8901; local261++) {
						for (local310 = 0; local310 < Static510.anInt8901; local310++) {
							local316 = local190 + local261;
							local321 = local194 + local310;
							local340 = local399.anIntArrayArray85[local316 - local399.anInt8975][local321 - local399.anInt8969];
							if ((local340 & 0x40240000) != 0) {
								arg0.method7459(4, (Static510.anInt8901 - local310) * 4 + local200 - 4, -1713569622, 4, local198 + local261 * 4);
							} else if ((local340 & 0x800000) != 0) {
								arg0.method7434(local261 * 4 + local198, 4, -1713569622, (Static510.anInt8901 - local310) * 4 + local200 - 4);
							} else if ((local340 & 0x2000000) != 0) {
								arg0.method7476(-1713569622, local198 + local261 * 4 + 3, local200 + -4 + (Static510.anInt8901 + -local310) * 4, 4);
							} else if ((local340 & 0x8000000) != 0) {
								arg0.method7434(local261 * 4 + local198, 4, -1713569622, local200 + (Static510.anInt8901 - local310) * 4 + 3 - 4);
							} else if ((local340 & 0x20000000) != 0) {
								arg0.method7476(-1713569622, local261 * 4 + local198, (-local310 + Static510.anInt8901) * 4 + local200 - 4, 4);
							}
						}
					}
				}
				arg0.C(local198, local200, Static510.anInt8901 * 4, Static510.anInt8901 * 4, local180, 2);
				Static388.aClass119_28.GA((local190 - local11) * 4 + 48, 464 - (-local17 + local194) * 4 + -(Static510.anInt8901 * 4), Static510.anInt8901 * 4, Static510.anInt8901 * 4, local198, local200);
			}
		}
		arg0.F();
		arg0.D(-16777215);
		Static403.method6133();
		Static418.anInt7809 = 0;
		Static449.aClass71_62.method2088();
		if (!Static461.aBoolean587) {
			for (local194 = local11; local194 < local11 + 104; local194++) {
				for (local198 = local17; local198 < local17 + 104; local198++) {
					for (local200 = arg1; local200 <= arg1 + 1 && local200 <= 3; local200++) {
						if (Static151.method2599(local194, local198, arg1, local200)) {
							@Pc(683) Interface15 local683 = (Interface15) Static72.method1464(local200, local194, local198);
							if (local683 == null) {
								local683 = (Interface15) Static420.method6482(local200, local194, local198, qn.class);
							}
							if (local683 == null) {
								local683 = (Interface15) Static542.method7740(local200, local194, local198);
							}
							if (local683 == null) {
								local683 = (Interface15) Static183.method4959(local200, local194, local198);
							}
							if (local683 != null) {
								@Pc(724) Class242 local724 = Static454.aClass298_3.method7185(local683.method7758());
								if (!local724.aBoolean483 || Static56.aBoolean91) {
									local218 = local724.anInt7208;
									if (local724.anIntArray632 != null) {
										for (local227 = 0; local227 < local724.anIntArray632.length; local227++) {
											if (local724.anIntArray632[local227] != -1) {
												@Pc(753) Class242 local753 = Static454.aClass298_3.method7185(local724.anIntArray632[local227]);
												if (local753.anInt7208 >= 0) {
													local218 = local753.anInt7208;
												}
											}
										}
									}
									if (local218 >= 0) {
										@Pc(775) boolean local775 = false;
										if (local218 >= 0) {
											@Pc(782) Class179 local782 = Static531.aClass135_4.method3801(local218);
											if (local782 != null && local782.aBoolean368) {
												local775 = true;
											}
										}
										local253 = local194;
										local257 = local198;
										if (local775) {
											@Pc(800) int[][] local800 = Static95.aClass306Array1[local200].anIntArrayArray85;
											local310 = Static95.aClass306Array1[local200].anInt8975;
											local316 = Static95.aClass306Array1[local200].anInt8969;
											for (local321 = 0; local321 < 10; local321++) {
												local340 = (int) (Math.random() * 4.0D);
												if (local340 == 0 && local253 > local11 && local194 - 3 < local253 && (local800[local253 - local310 - 1][local257 - local316] & 0x2C0108) == 0) {
													local253--;
												}
												if (local340 == 1 && local253 < local11 + 103 && local194 + 3 > local253 && (local800[local253 + 1 - local310][local257 - local316] & 0x2C0180) == 0) {
													local253++;
												}
												if (local340 == 2 && local17 < local257 && local198 - 3 < local257 && (local800[local253 - local310][local257 - local316 - 1] & 0x2C0102) == 0) {
													local257--;
												}
												if (local340 == 3 && local257 < local17 + 104 - 1 && local257 < local198 + 3 && (local800[local253 - local310][local257 + 1 - local316] & 0x2C0120) == 0) {
													local257++;
												}
											}
										}
										Static331.anIntArray548[Static418.anInt7809] = local724.anInt7168;
										Static464.anIntArray712[Static418.anInt7809] = local253;
										Static306.anIntArray536[Static418.anInt7809] = local257;
										Static418.anInt7809++;
									}
								}
							}
						}
					}
				}
			}
			if (Static267.aClass82_3 != null) {
				Static492.aClass161_109.anInt5061 = 1;
				Static531.aClass135_4.method3800(1024, 64);
				for (local198 = 0; local198 < Static267.aClass82_3.anInt2616; local198++) {
					local200 = Static267.aClass82_3.anIntArray262[local198];
					if (local200 >> 28 == Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) {
						local202 = (local200 >> 14 & 0x3FFF) - Static223.anInt4827;
						local208 = (local200 & 0x3FFF) - Static150.anInt3027;
						if (local202 >= 0 && Static118.anInt2527 > local202 && local208 >= 0 && Static549.anInt9482 > local208) {
							Static449.aClass71_62.method2076(new Class3_Sub47(local198));
						} else {
							@Pc(1085) Class179 local1085 = Static531.aClass135_4.method3801(Static267.aClass82_3.anIntArray263[local198]);
							if (local1085.anIntArray509 != null && local1085.anInt5732 + local202 >= 0 && Static118.anInt2527 > local202 + local1085.anInt5718 && local208 + local1085.anInt5734 >= 0 && Static549.anInt9482 > local1085.anInt5727 + local208) {
								Static449.aClass71_62.method2076(new Class3_Sub47(local198));
							}
						}
					}
				}
				Static531.aClass135_4.method3800(128, 64);
				Static492.aClass161_109.anInt5061 = 2;
				Static492.aClass161_109.method4250();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method4909() {
		Static47.aClass71_68 = new Class71();
	}
}
