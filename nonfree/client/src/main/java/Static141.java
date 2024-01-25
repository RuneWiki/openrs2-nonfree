import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public static int anInt3256;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Z")
	public static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public static int anInt3259 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lclient!hm;")
	public static Class144 method2862(@OriginalArg(0) int arg0) {
		@Pc(19) Class144 local19 = (Class144) Static156.aClass211_64.method5534((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static10.aClass254_4.method6401(0, arg0);
		local19 = new Class144();
		if (local31 != null) {
			local19.method3329(new Class3_Sub7(local31));
		}
		local19.method3328();
		Static156.aClass211_64.method5529((long) arg0, local19);
		return local19;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static351.method5860(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static474.method7272(arg0, arg1) | Static335.method5787(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static196.method3327(arg0, arg1) | (arg1 & 0x2000) != 0 | Static265.method4659(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!oa;I)Z")
	public static boolean method2864(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (Static460.anInt8640 - 104) / 2;
		@Pc(15) int local15 = (Static292.anInt7682 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(25) int local25;
		@Pc(35) int local35;
		for (@Pc(19) int local19 = local9; local19 < local9 + 104; local19++) {
			for (@Pc(22) int local22 = local15; local22 < local15 + 104; local22++) {
				for (local25 = arg1; local25 <= 3; local25++) {
					if (Static194.method3317(local25, arg1, local22, local19)) {
						local35 = local25;
						if (Static503.method7578(local19, local22)) {
							local35 = local25 - 1;
						}
						if (local35 >= 0) {
							local17 &= Static106.method2239(local22, local19, local35);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(76) int[] local76 = new int[262144];
		for (local25 = 0; local25 < local76.length; local25++) {
			local76[local25] = -16777216;
		}
		Static417.aClass37_33 = arg0.method5324(local76, 512, 512, 512);
		Static562.method8115();
		local35 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x79C4FF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(182) boolean[][] local182 = new boolean[Static262.anInt5578 + 1][Static262.anInt5578 + 1];
		@Pc(187) int local187;
		@Pc(190) int local190;
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(203) int local203;
		@Pc(211) int local211;
		@Pc(221) int local221;
		@Pc(245) int local245;
		@Pc(248) int local248;
		@Pc(300) int local300;
		@Pc(305) int local305;
		@Pc(309) int local309;
		@Pc(328) int local328;
		for (@Pc(184) int local184 = local9; local184 < local9 + 104; local184 += Static262.anInt5578) {
			for (local187 = local15; local187 < local15 + 104; local187 += Static262.anInt5578) {
				local190 = 0;
				local192 = 0;
				local194 = local184;
				if (local184 > 0) {
					local194 = local184 - 1;
					local190 += 4;
				}
				local203 = local187;
				if (local187 > 0) {
					local203 = local187 - 1;
				}
				local211 = local184 + Static262.anInt5578;
				if (local211 < 104) {
					local211++;
				}
				local221 = Static262.anInt5578 + local187;
				if (local221 < 104) {
					local221++;
					local192 += 4;
				}
				arg0.ca(0, 0, Static262.anInt5578 * 4 + local190, local192 + Static262.anInt5578 * 4);
				arg0.D(-16777216);
				@Pc(251) int local251;
				for (local245 = arg1; local245 <= 3; local245++) {
					for (local248 = 0; local248 <= Static262.anInt5578; local248++) {
						for (local251 = 0; local251 <= Static262.anInt5578; local251++) {
							local182[local248][local251] = Static194.method3317(local245, arg1, local203 + local251, local248 + local194);
						}
					}
					Static381.aClass4Array2[local245].method8446(local194, local203, local211, local221, local182);
					if (!Static114.aBoolean206) {
						for (local251 = -4; local251 < Static262.anInt5578; local251++) {
							for (local300 = -4; local300 < Static262.anInt5578; local300++) {
								local305 = local251 + local184;
								local309 = local187 + local300;
								if (local9 <= local305 && local309 >= local15 && Static194.method3317(local245, arg1, local309, local305)) {
									local328 = local245;
									if (Static503.method7578(local305, local309)) {
										local328 = local245 - 1;
									}
									if (local328 >= 0) {
										Static524.method7766(arg0, local190 + local251 * 4, local35, local192 + (Static262.anInt5578 - local300) * 4 - 4, local155, local309, local328, local305);
									}
								}
							}
						}
					}
				}
				if (Static114.aBoolean206) {
					@Pc(376) Class350 local376 = Static403.aClass350Array1[arg1];
					for (local251 = 0; local251 < Static262.anInt5578; local251++) {
						for (local300 = 0; local300 < Static262.anInt5578; local300++) {
							local305 = local184 + local251;
							local309 = local187 + local300;
							local328 = local376.anIntArrayArray82[local305 - local376.anInt10126][local309 - local376.anInt10122];
							if ((local328 & 0x40240000) != 0) {
								arg0.method5341(-1713569622, local190 + local251 * 4, 4, 4, (Static262.anInt5578 - local300) * 4 + local192 - 4);
							} else if ((local328 & 0x800000) != 0) {
								arg0.method5281(local192 + (Static262.anInt5578 - local300) * 4 - 4, 4, -1713569622, local190 + local251 * 4);
							} else if ((local328 & 0x2000000) != 0) {
								arg0.method5316(4, -1713569622, (Static262.anInt5578 - local300) * 4 + local192 - 4, local251 * 4 + 3 + local190);
							} else if ((local328 & 0x8000000) != 0) {
								arg0.method5281((Static262.anInt5578 - local300) * 4 + local192 + 3 - 4, 4, -1713569622, local251 * 4 + local190);
							} else if ((local328 & 0x20000000) != 0) {
								arg0.method5316(4, -1713569622, local192 + (Static262.anInt5578 - local300) * 4 - 4, local190 + local251 * 4);
							}
						}
					}
				}
				arg0.C(local190, local192, Static262.anInt5578 * 4, Static262.anInt5578 * 4, local174, 2);
				Static417.aClass37_33.GA((local184 - local9) * 4 + 48, -(Static262.anInt5578 * 4) + -((-local15 + local187) * 4) + 464, Static262.anInt5578 * 4, Static262.anInt5578 * 4, local190, local192);
			}
		}
		arg0.F();
		arg0.D(-16777215);
		Static210.method3686();
		Static569.anInt10058 = 0;
		Static240.aClass183_28.method4790();
		if (!Static114.aBoolean206) {
			for (local187 = local9; local187 < local9 + 104; local187++) {
				for (local190 = local15; local190 < local15 + 104; local190++) {
					for (local192 = arg1; local192 <= arg1 + 1 && local192 <= 3; local192++) {
						if (Static194.method3317(local192, arg1, local190, local187)) {
							@Pc(655) Interface22 local655 = (Interface22) Static86.method1922(local192, local187, local190);
							if (local655 == null) {
								local655 = (Interface22) Static200.method3364(local192, local187, local190, ut.class);
							}
							if (local655 == null) {
								local655 = (Interface22) Static496.method7511(local192, local187, local190);
							}
							if (local655 == null) {
								local655 = (Interface22) Static563.method8123(local192, local187, local190);
							}
							if (local655 != null) {
								@Pc(696) Class292 local696 = Static253.aClass146_2.method3356(local655.method8398());
								if (!local696.aBoolean724 || Static584.aBoolean846) {
									local211 = local696.anInt8788;
									if (local696.anIntArray571 != null) {
										for (local221 = 0; local221 < local696.anIntArray571.length; local221++) {
											if (local696.anIntArray571[local221] != -1) {
												@Pc(727) Class292 local727 = Static253.aClass146_2.method3356(local696.anIntArray571[local221]);
												if (local727.anInt8788 >= 0) {
													local211 = local727.anInt8788;
												}
											}
										}
									}
									if (local211 >= 0) {
										@Pc(750) boolean local750 = false;
										if (local211 >= 0) {
											@Pc(760) Class70 local760 = Static44.aClass10_1.method400(local211);
											if (local760 != null && local760.aBoolean183) {
												local750 = true;
											}
										}
										local245 = local187;
										local248 = local190;
										if (local750) {
											@Pc(778) int[][] local778 = Static403.aClass350Array1[local192].anIntArrayArray82;
											local300 = Static403.aClass350Array1[local192].anInt10126;
											local305 = Static403.aClass350Array1[local192].anInt10122;
											for (local309 = 0; local309 < 10; local309++) {
												local328 = (int) (Math.random() * 4.0D);
												if (local328 == 0 && local245 > local9 && local245 > local187 - 3 && (local778[local245 - local300 - 1][local248 - local305] & 0x2C0108) == 0) {
													local245--;
												}
												if (local328 == 1 && local245 < local9 + 103 && local245 < local187 + 3 && (local778[local245 + 1 - local300][local248 - local305] & 0x2C0180) == 0) {
													local245++;
												}
												if (local328 == 2 && local248 > local15 && local190 - 3 < local248 && (local778[local245 - local300][local248 - local305 - 1] & 0x2C0102) == 0) {
													local248--;
												}
												if (local328 == 3 && local15 + 104 - 1 > local248 && local190 + 3 > local248 && (local778[local245 - local300][local248 + 1 - local305] & 0x2C0120) == 0) {
													local248++;
												}
											}
										}
										Static21.anIntArray19[Static569.anInt10058] = local696.anInt8757;
										Static276.anIntArray355[Static569.anInt10058] = local245;
										Static237.anIntArray302[Static569.anInt10058] = local248;
										Static569.anInt10058++;
									}
								}
							}
						}
					}
				}
			}
			if (Static356.aClass238_3 != null) {
				Static389.aClass254_103.anInt7731 = 1;
				Static44.aClass10_1.method401(64, 1024);
				for (local190 = 0; local190 < Static356.aClass238_3.anInt7252; local190++) {
					local192 = Static356.aClass238_3.anIntArray465[local190];
					if (local192 >> 28 == Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103) {
						local194 = (local192 >> 14 & 0x3FFF) - Static230.anInt4667;
						local203 = (local192 & 0x3FFF) - Static563.anInt10006;
						if (local194 >= 0 && Static460.anInt8640 > local194 && local203 >= 0 && Static292.anInt7682 > local203) {
							Static240.aClass183_28.method4792(new Class3_Sub48(local190));
						} else {
							@Pc(1050) Class70 local1050 = Static44.aClass10_1.method400(Static356.aClass238_3.anIntArray464[local190]);
							if (local1050.anIntArray119 != null && local1050.anInt2389 + local194 >= 0 && Static460.anInt8640 > local1050.anInt2371 + local194 && local203 + local1050.anInt2400 >= 0 && Static292.anInt7682 > local1050.anInt2388 + local203) {
								Static240.aClass183_28.method4792(new Class3_Sub48(local190));
							}
						}
					}
				}
				Static44.aClass10_1.method401(64, 128);
				Static389.aClass254_103.anInt7731 = 2;
				Static389.aClass254_103.method6392();
			}
		}
		return true;
	}
}
