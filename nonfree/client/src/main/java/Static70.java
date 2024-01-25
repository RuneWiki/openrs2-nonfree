import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!dj;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	public static int anInt1598;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	public static int anInt1594 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!r;)Z")
	public static boolean method1139(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(11) int local11 = (Static188.anInt3850 - 104) / 2;
		@Pc(17) int local17 = (Static49.anInt1174 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static199.method3279(local29, arg0, local21, local25)) {
						local40 = local29;
						if (Static551.method7475(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static470.method6601(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(92) int[] local92 = new int[262144];
		for (local29 = 0; local29 < local92.length; local29++) {
			local92[local29] = -16777216;
		}
		Static513.aClass39_35 = arg1.method6226(local92, 512, 512, 512);
		Static238.method3693();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(167) int local167 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x1CFFFF00) << 16;
		@Pc(186) int local186 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(194) boolean[][] local194 = new boolean[Static15.anInt472 + 1][Static15.anInt472 + 1];
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(217) int local217;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(259) int local259;
		@Pc(263) int local263;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(329) int local329;
		@Pc(348) int local348;
		for (@Pc(196) int local196 = local11; local196 < local11 + 104; local196 += Static15.anInt472) {
			for (local200 = local17; local200 < local17 + 104; local200 += Static15.anInt472) {
				local204 = 0;
				local206 = 0;
				local208 = local196;
				if (local196 > 0) {
					local208 = local196 - 1;
					local204 += 4;
				}
				local217 = local200;
				if (local200 > 0) {
					local217 = local200 - 1;
				}
				local224 = Static15.anInt472 + local196;
				if (local224 < 104) {
					local224++;
				}
				local235 = local200 + Static15.anInt472;
				if (local235 < 104) {
					local206 += 4;
					local235++;
				}
				arg1.da(0, 0, Static15.anInt472 * 4 + local204, Static15.anInt472 * 4 + local206);
				arg1.ja(-16777216);
				@Pc(267) int local267;
				for (local259 = arg0; local259 <= 3; local259++) {
					for (local263 = 0; local263 <= Static15.anInt472; local263++) {
						for (local267 = 0; local267 <= Static15.anInt472; local267++) {
							local194[local263][local267] = Static199.method3279(local259, arg0, local208 + local263, local217 + local267);
						}
					}
					Static569.aClass67Array8[local259].method6713(local208, local217, local224, local235, local194);
					if (!Static423.aBoolean563) {
						for (local267 = -4; local267 < Static15.anInt472; local267++) {
							for (local317 = -4; local317 < Static15.anInt472; local317++) {
								local324 = local196 + local267;
								local329 = local200 + local317;
								if (local324 >= local11 && local17 <= local329 && Static199.method3279(local259, arg0, local324, local329)) {
									local348 = local259;
									if (Static551.method7475(local329, local324)) {
										local348 = local259 - 1;
									}
									if (local348 >= 0) {
										Static392.method5756(local348, local324, local267 * 4 + local204, local206 + -4 + (Static15.anInt472 - local317) * 4, local329, arg1, local40, local167);
									}
								}
							}
						}
					}
				}
				if (Static423.aBoolean563) {
					@Pc(402) Class355 local402 = Static495.aClass355Array1[arg0];
					for (local267 = 0; local267 < Static15.anInt472; local267++) {
						for (local317 = 0; local317 < Static15.anInt472; local317++) {
							local324 = local267 + local196;
							local329 = local200 + local317;
							local348 = local402.anIntArrayArray68[local324 - local402.anInt9399][local329 - local402.anInt9391];
							if ((local348 & 0x40240000) != 0) {
								arg1.method6261(-1713569622, local267 * 4 + local204, (-local317 + Static15.anInt472) * 4 + (local206 - 4), 4, 4);
							} else if ((local348 & 0x800000) != 0) {
								arg1.method6232(local206 + (Static15.anInt472 - local317) * 4 - 4, local204 + local267 * 4, 4, -1713569622);
							} else if ((local348 & 0x2000000) != 0) {
								arg1.method6189(local267 * 4 + local204 + 3, -1713569622, 4, local206 + (Static15.anInt472 - local317) * 4 - 4);
							} else if ((local348 & 0x8000000) != 0) {
								arg1.method6232((Static15.anInt472 - local317) * 4 + local206 - 1, local267 * 4 + local204, 4, -1713569622);
							} else if ((local348 & 0x20000000) != 0) {
								arg1.method6189(local267 * 4 + local204, -1713569622, 4, (Static15.anInt472 - local317) * 4 + local206 - 4);
							}
						}
					}
				}
				arg1.J(local204, local206, Static15.anInt472 * 4, Static15.anInt472 * 4, local186, 2);
				Static513.aClass39_35.da((local196 - local11) * 4 + 48, -(Static15.anInt472 * 4) + (464 - (-local17 + local200) * 4), Static15.anInt472 * 4, Static15.anInt472 * 4, local204, local206);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static139.method2348();
		Static391.anInt6845 = 0;
		Static388.aClass8_40.method220();
		if (!Static423.aBoolean563) {
			for (local200 = local11; local200 < local11 + 104; local200++) {
				for (local204 = local17; local204 < local17 + 104; local204++) {
					for (local206 = arg0; arg0 + 1 >= local206 && local206 <= 3; local206++) {
						if (Static199.method3279(local206, arg0, local200, local204)) {
							@Pc(689) Interface24 local689 = (Interface24) Static317.method4928(local206, local200, local204);
							if (local689 == null) {
								local689 = (Interface24) Static224.method3516(local206, local200, local204, vda.class);
							}
							if (local689 == null) {
								local689 = (Interface24) Static353.method5256(local206, local200, local204);
							}
							if (local689 == null) {
								local689 = (Interface24) Static122.method1787(local206, local200, local204);
							}
							if (local689 != null) {
								@Pc(730) Class32 local730 = Static541.aClass97_4.method1794(local689.method7337());
								if (!local730.aBoolean55 || Static451.aBoolean23) {
									local224 = local730.anInt798;
									if (local730.anIntArray50 != null) {
										for (local235 = 0; local235 < local730.anIntArray50.length; local235++) {
											if (local730.anIntArray50[local235] != -1) {
												@Pc(760) Class32 local760 = Static541.aClass97_4.method1794(local730.anIntArray50[local235]);
												if (local760.anInt798 >= 0) {
													local224 = local760.anInt798;
												}
											}
										}
									}
									if (local224 >= 0) {
										@Pc(776) boolean local776 = false;
										if (local224 >= 0) {
											@Pc(786) Class366 local786 = Static205.aClass25_3.method435(local224);
											if (local786 != null && local786.aBoolean736) {
												local776 = true;
											}
										}
										local259 = local200;
										local263 = local204;
										if (local776) {
											@Pc(804) int[][] local804 = Static495.aClass355Array1[local206].anIntArrayArray68;
											local317 = Static495.aClass355Array1[local206].anInt9399;
											local324 = Static495.aClass355Array1[local206].anInt9391;
											for (local329 = 0; local329 < 10; local329++) {
												local348 = (int) (Math.random() * 4.0D);
												if (local348 == 0 && local259 > local11 && local200 - 3 < local259 && (local804[local259 - local317 - 1][local263 - local324] & 0x2C0108) == 0) {
													local259--;
												}
												if (local348 == 1 && local259 < local11 + 104 - 1 && local259 < local200 + 3 && (local804[local259 + 1 - local317][local263 - local324] & 0x2C0180) == 0) {
													local259++;
												}
												if (local348 == 2 && local17 < local263 && local263 > local204 - 3 && (local804[local259 - local317][local263 - local324 - 1] & 0x2C0102) == 0) {
													local263--;
												}
												if (local348 == 3 && local17 + 104 - 1 > local263 && local204 + 3 > local263 && (local804[local259 - local317][local263 + 1 - local324] & 0x2C0120) == 0) {
													local263++;
												}
											}
										}
										Static537.anIntArray636[Static391.anInt6845] = local730.anInt773;
										Static514.anIntArray31[Static391.anInt6845] = local259;
										Static560.anIntArray666[Static391.anInt6845] = local263;
										Static391.anInt6845++;
									}
								}
							}
						}
					}
				}
			}
			if (Static382.aClass288_3 != null) {
				Static156.aClass259_158.anInt7135 = 1;
				Static205.aClass25_3.method441(64, 1024);
				for (local204 = 0; local204 < Static382.aClass288_3.anInt7989; local204++) {
					local206 = Static382.aClass288_3.anIntArray530[local204];
					if (local206 >> 28 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
						local208 = (local206 >> 14 & 0x3FFF) - Static35.anInt906;
						local217 = (local206 & 0x3FFF) - Static130.anInt5246;
						if (local208 >= 0 && local208 < Static188.anInt3850 && local217 >= 0 && Static49.anInt1174 > local217) {
							Static388.aClass8_40.method212(new Class2_Sub22(local204));
						} else {
							@Pc(1103) Class366 local1103 = Static205.aClass25_3.method435(Static382.aClass288_3.anIntArray528[local204]);
							if (local1103.anIntArray702 != null && local208 + local1103.anInt9638 >= 0 && Static188.anInt3850 > local1103.anInt9651 + local208 && local217 + local1103.anInt9620 >= 0 && local217 + local1103.anInt9621 < Static49.anInt1174) {
								Static388.aClass8_40.method212(new Class2_Sub22(local204));
							}
						}
					}
				}
				Static205.aClass25_3.method441(64, 128);
				Static156.aClass259_158.anInt7135 = 2;
				Static156.aClass259_158.method5975();
			}
		}
		return true;
	}
}
