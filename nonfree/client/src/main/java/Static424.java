import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_187 = new Class342(5);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
	public static boolean method7514() throws IOException {
		if (Static451.aClass223_6 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static170.aClass123_284 == null) {
			if (Static588.aBoolean721) {
				if (!Static451.aClass223_6.method5110(1)) {
					return false;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
				Static588.aBoolean721 = false;
				Static211.anInt8487++;
				Static402.anInt7199 = 0;
			}
			Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
			if (Static455.aClass3_Sub26_Sub1_2.method5557()) {
				if (!Static451.aClass223_6.method5110(1)) {
					return false;
				}
				Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 1);
				Static402.anInt7199 = 0;
				Static211.anInt8487++;
			}
			Static588.aBoolean721 = true;
			@Pc(69) Class123[] local69 = Static284.method4276();
			local73 = Static455.aClass3_Sub26_Sub1_2.method5548();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static455.aClass3_Sub26_Sub1_2.anInt8703);
			}
			Static170.aClass123_284 = local69[local73];
			Static42.anInt1159 = Static170.aClass123_284.anInt4227;
		}
		if (Static42.anInt1159 == -1) {
			if (!Static451.aClass223_6.method5110(1)) {
				return false;
			}
			Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 1, 0);
			Static402.anInt7199 = 0;
			Static211.anInt8487++;
			Static42.anInt1159 = Static455.aClass3_Sub26_Sub1_2.aByteArray213[0] & 0xFF;
		}
		if (Static42.anInt1159 == -2) {
			if (!Static451.aClass223_6.method5110(2)) {
				return false;
			}
			Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, 2, 0);
			Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
			Static42.anInt1159 = Static455.aClass3_Sub26_Sub1_2.method6811();
			Static402.anInt7199 = 0;
			Static211.anInt8487 += 2;
		}
		if (Static42.anInt1159 > 0) {
			if (!Static451.aClass223_6.method5110(Static42.anInt1159)) {
				return false;
			}
			Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
			Static451.aClass223_6.method5106(Static455.aClass3_Sub26_Sub1_2.aByteArray213, Static42.anInt1159, 0);
			Static402.anInt7199 = 0;
			Static211.anInt8487 += Static42.anInt1159;
		}
		Static269.aClass123_174 = Static83.aClass123_63;
		Static83.aClass123_63 = Static348.aClass123_128;
		Static348.aClass123_128 = Static170.aClass123_284;
		@Pc(248) int local248;
		@Pc(254) int local254;
		@Pc(259) int local259;
		@Pc(267) int local267;
		@Pc(271) int local271;
		if (Static7.aClass123_5 == Static170.aClass123_284) {
			Static13.anInt122 = Static455.aClass3_Sub26_Sub1_2.method6775() << 3;
			Static371.anInt6488 = Static455.aClass3_Sub26_Sub1_2.method6821();
			Static246.anInt4843 = Static455.aClass3_Sub26_Sub1_2.method6775() << 3;
			for (@Pc(238) Class3_Sub4 local238 = (Class3_Sub4) Static537.aClass297_34.method6529(); local238 != null; local238 = (Class3_Sub4) Static537.aClass297_34.method6532()) {
				local248 = (int) (local238.aLong262 >> 28 & 0x3L);
				local254 = (int) (local238.aLong262 & 0x3FFFL);
				local259 = local254 - Static321.anInt5874;
				local267 = (int) (local238.aLong262 >> 14 & 0x3FFFL);
				local271 = local267 - Static137.anInt3293;
				if (Static371.anInt6488 == local248 && local259 >= Static13.anInt122 && local259 < Static13.anInt122 + 8 && local271 >= Static246.anInt4843 && Static246.anInt4843 + 8 > local271) {
					local238.method8128();
					if (local259 >= 0 && local271 >= 0 && local259 < Static345.anInt6228 && Static535.anInt9341 > local271) {
						Static499.method4576(Static371.anInt6488, local259, local271);
					}
				}
			}
			for (@Pc(347) Class3_Sub29 local347 = (Class3_Sub29) Static391.aClass244_52.method5572(); local347 != null; local347 = (Class3_Sub29) Static391.aClass244_52.method5576()) {
				if (Static13.anInt122 <= local347.anInt5007 && local347.anInt5007 < Static13.anInt122 + 8 && Static246.anInt4843 <= local347.anInt5012 && Static246.anInt4843 + 8 > local347.anInt5012 && local347.anInt5004 == Static371.anInt6488) {
					local347.anInt5015 = 0;
				}
			}
			Static170.aClass123_284 = null;
			return true;
		} else if (Static170.aClass123_284 == Static229.aClass123_152) {
			Static120.method2331(Static242.aClass364_14);
			Static170.aClass123_284 = null;
			return true;
		} else {
			@Pc(422) String local422;
			@Pc(416) String local416;
			if (Static170.aClass123_284 == Static297.aClass123_281) {
				local416 = Static455.aClass3_Sub26_Sub1_2.method6786();
				local422 = Static554.method7609(Static35.method508(Static455.aClass3_Sub26_Sub1_2));
				Static295.method4425(local416, local416, local422, 0, 6, local416);
				Static170.aClass123_284 = null;
				return true;
			}
			@Pc(718) String local718;
			@Pc(448) boolean local448;
			@Pc(456) String local456;
			@Pc(466) String local466;
			@Pc(487) int local487;
			@Pc(468) boolean local468;
			@Pc(754) String local754;
			@Pc(521) boolean local521;
			if (Static125.aClass123_95 == Static170.aClass123_284) {
				while (Static455.aClass3_Sub26_Sub1_2.anInt8703 < Static42.anInt1159) {
					local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
					local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
					local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
					local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
					local267 = Static455.aClass3_Sub26_Sub1_2.method6814();
					local466 = "";
					local468 = false;
					if (local259 > 0) {
						local466 = Static455.aClass3_Sub26_Sub1_2.method6786();
						local468 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
					}
					for (local487 = 0; local487 < Static372.anInt6493; local487++) {
						if (local448) {
							if (local456.equals(Static437.aStringArray36[local487])) {
								Static437.aStringArray36[local487] = local422;
								Static530.aStringArray44[local487] = local456;
								local422 = null;
								break;
							}
						} else if (local422.equals(Static437.aStringArray36[local487])) {
							if (local259 != Static383.anIntArray374[local487]) {
								local521 = true;
								for (@Pc(526) Class25_Sub5_Sub2 local526 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5974(); local526 != null; local526 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5979()) {
									if (local526.aString103.equals(local422)) {
										if (local259 != 0 && local526.aShort47 == 0) {
											local526.method6959();
											local521 = false;
										} else if (local259 == 0 && local526.aShort47 != 0) {
											local526.method6959();
											local521 = false;
										}
									}
								}
								if (local521) {
									Static498.aClass269_7.method5977(new Class25_Sub5_Sub2(local422, local259));
								}
								Static383.anIntArray374[local487] = local259;
							}
							Static530.aStringArray44[local487] = local456;
							Static154.aStringArray11[local487] = local466;
							Static578.anIntArray577[local487] = local267;
							Static506.aBooleanArray27[local487] = local468;
							local422 = null;
							break;
						}
					}
					if (local422 != null && Static372.anInt6493 < 200) {
						Static437.aStringArray36[Static372.anInt6493] = local422;
						Static530.aStringArray44[Static372.anInt6493] = local456;
						Static383.anIntArray374[Static372.anInt6493] = local259;
						Static154.aStringArray11[Static372.anInt6493] = local466;
						Static578.anIntArray577[Static372.anInt6493] = local267;
						Static506.aBooleanArray27[Static372.anInt6493] = local468;
						Static372.anInt6493++;
					}
				}
				Static181.anInt3976 = 2;
				Static356.anInt6330 = Static523.anInt9188;
				local248 = Static372.anInt6493;
				while (local248 > 0) {
					local448 = true;
					local248--;
					for (local254 = 0; local254 < local248; local254++) {
						if (Static104.aClass212_1.anInt6145 != Static383.anIntArray374[local254] && Static383.anIntArray374[local254 + 1] == Static104.aClass212_1.anInt6145 || Static383.anIntArray374[local254] == 0 && Static383.anIntArray374[local254 + 1] != 0) {
							local259 = Static383.anIntArray374[local254];
							Static383.anIntArray374[local254] = Static383.anIntArray374[local254 + 1];
							Static383.anIntArray374[local254 + 1] = local259;
							local718 = Static154.aStringArray11[local254];
							Static154.aStringArray11[local254] = Static154.aStringArray11[local254 + 1];
							Static154.aStringArray11[local254 + 1] = local718;
							local466 = Static437.aStringArray36[local254];
							Static437.aStringArray36[local254] = Static437.aStringArray36[local254 + 1];
							Static437.aStringArray36[local254 + 1] = local466;
							local754 = Static530.aStringArray44[local254];
							Static530.aStringArray44[local254] = Static530.aStringArray44[local254 + 1];
							Static530.aStringArray44[local254 + 1] = local754;
							local487 = Static578.anIntArray577[local254];
							Static578.anIntArray577[local254] = Static578.anIntArray577[local254 + 1];
							Static578.anIntArray577[local254 + 1] = local487;
							local521 = Static506.aBooleanArray27[local254];
							Static506.aBooleanArray27[local254] = Static506.aBooleanArray27[local254 + 1];
							Static506.aBooleanArray27[local254 + 1] = local521;
							local448 = false;
						}
					}
					if (local448) {
						break;
					}
				}
				Static170.aClass123_284 = null;
				return true;
			}
			@Pc(878) int local878;
			@Pc(971) int local971;
			@Pc(936) Class74 local936;
			@Pc(961) int local961;
			@Pc(861) boolean local861;
			@Pc(841) boolean local841;
			if (Static170.aClass123_284 == Static325.aClass123_200) {
				local416 = Static455.aClass3_Sub26_Sub1_2.method6786();
				local841 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
				if (local841) {
					local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
				} else {
					local422 = local416;
				}
				local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
				@Pc(859) byte local859 = Static455.aClass3_Sub26_Sub1_2.method6825();
				local861 = false;
				if (local859 == -128) {
					local861 = true;
				}
				if (local861) {
					if (Static260.anInt5022 == 0) {
						Static170.aClass123_284 = null;
						return true;
					}
					for (local878 = 0; Static260.anInt5022 > local878 && (!Static131.aClass74Array1[local878].aString58.equals(local422) || Static131.aClass74Array1[local878].anInt2589 != local259); local878++) {
					}
					if (Static260.anInt5022 > local878) {
						while (local878 < Static260.anInt5022 - 1) {
							Static131.aClass74Array1[local878] = Static131.aClass74Array1[local878 + 1];
							local878++;
						}
						Static260.anInt5022--;
						Static131.aClass74Array1[Static260.anInt5022] = null;
					}
				} else {
					local754 = Static455.aClass3_Sub26_Sub1_2.method6786();
					local936 = new Class74();
					local936.aString58 = local422;
					local936.aString60 = local416;
					local936.aString59 = Static468.method6414(local936.aString58);
					local936.aString61 = local754;
					local936.aByte26 = local859;
					local936.anInt2589 = local259;
					for (local961 = Static260.anInt5022 - 1; local961 >= 0; local961--) {
						local971 = Static131.aClass74Array1[local961].aString59.compareTo(local936.aString59);
						if (local971 == 0) {
							Static131.aClass74Array1[local961].anInt2589 = local259;
							Static131.aClass74Array1[local961].aByte26 = local859;
							Static131.aClass74Array1[local961].aString61 = local754;
							if (local422.equals(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183)) {
								Static94.aByte24 = local859;
							}
							Static170.aClass123_284 = null;
							Static573.anInt9839 = Static523.anInt9188;
							return true;
						}
						if (local971 < 0) {
							break;
						}
					}
					if (Static260.anInt5022 >= Static131.aClass74Array1.length) {
						Static170.aClass123_284 = null;
						return true;
					}
					for (local971 = Static260.anInt5022 - 1; local971 > local961; local971--) {
						Static131.aClass74Array1[local971 + 1] = Static131.aClass74Array1[local971];
					}
					if (Static260.anInt5022 == 0) {
						Static131.aClass74Array1 = new Class74[100];
					}
					Static131.aClass74Array1[local961 + 1] = local936;
					Static260.anInt5022++;
					if (local422.equals(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183)) {
						Static94.aByte24 = local859;
					}
				}
				Static573.anInt9839 = Static523.anInt9188;
				Static170.aClass123_284 = null;
				return true;
			} else if (Static170.aClass123_284 == Static210.aClass123_302) {
				local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
				local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
				if (Static205.method3536(local248)) {
					Static212.method4713(0, local73, Static147.anInt3433, 5);
				}
				Static170.aClass123_284 = null;
				return true;
			} else if (Static170.aClass123_284 == Static190.aClass123_142) {
				local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
				local248 = Static455.aClass3_Sub26_Sub1_2.method6821();
				local841 = (local248 & 0x1) == 1;
				Static581.method7908(local73, local841);
				Static276.anIntArray242[Static196.anInt4252++ & 0x1F] = local73;
				Static170.aClass123_284 = null;
				return true;
			} else if (Static248.aClass123_162 == Static170.aClass123_284) {
				local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
				@Pc(1152) byte[] local1152 = new byte[Static42.anInt1159 - 1];
				Static455.aClass3_Sub26_Sub1_2.method6794(local1152, Static42.anInt1159 - 1);
				Static489.method7304(local1152, local448);
				Static170.aClass123_284 = null;
				return true;
			} else if (Static170.aClass123_284 == Static106.aClass123_88) {
				Static595.method8150(Static455.aClass3_Sub26_Sub1_2, Static42.anInt1159);
				Static170.aClass123_284 = null;
				return true;
			} else if (Static531.aClass123_290 == Static170.aClass123_284) {
				local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
				if (Static205.method3536(local73)) {
					Static503.method6753();
				}
				Static170.aClass123_284 = null;
				return true;
			} else if (Static406.aClass123_236 == Static170.aClass123_284) {
				local416 = Static455.aClass3_Sub26_Sub1_2.method6786();
				local248 = Static455.aClass3_Sub26_Sub1_2.method6822();
				local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
				if (Static205.method3536(local254)) {
					Static313.method4667(local416, local248);
				}
				Static170.aClass123_284 = null;
				return true;
			} else if (Static254.aClass123_165 == Static170.aClass123_284) {
				local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
				local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
				local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
				local259 = Static455.aClass3_Sub26_Sub1_2.method6822();
				local267 = Static455.aClass3_Sub26_Sub1_2.method6812();
				if (Static205.method3536(local259)) {
					Static212.method4713(local248, local73, local254 << 16 | local267, 7);
				}
				Static170.aClass123_284 = null;
				return true;
			} else if (Static521.aClass123_286 == Static170.aClass123_284) {
				Static120.method2331(Static570.aClass364_21);
				Static170.aClass123_284 = null;
				return true;
			} else if (Static170.aClass123_284 == Static37.aClass123_33) {
				Static120.method2331(Static451.aClass364_18);
				Static170.aClass123_284 = null;
				return true;
			} else if (Static170.aClass123_284 == Static495.aClass123_276) {
				local73 = Static455.aClass3_Sub26_Sub1_2.method6816();
				Static400.aClass309_8 = Static467.aClass168_12.method4094(local73);
				Static170.aClass123_284 = null;
				return true;
			} else {
				@Pc(1387) int local1387;
				@Pc(1548) int local1548;
				@Pc(1385) int local1385;
				@Pc(1840) int local1840;
				if (Static170.aClass123_284 == Static279.aClass123_182) {
					local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
					local248 = Static455.aClass3_Sub26_Sub1_2.method6783();
					local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
					local259 = Static455.aClass3_Sub26_Sub1_2.method6819();
					local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
					local861 = (local259 & 0x80) != 0;
					if (local73 >> 30 == 0) {
						@Pc(1492) Class250 local1492;
						@Pc(1545) Class270 local1545;
						@Pc(1512) Class270 local1512;
						if (local73 >> 29 != 0) {
							local878 = local73 & 0xFFFF;
							@Pc(1451) Class3_Sub39 local1451 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local878);
							if (local1451 != null) {
								if (local248 == 65535) {
									local248 = -1;
								}
								@Pc(1463) Class25_Sub2_Sub2_Sub5_Sub2 local1463 = local1451.aClass25_Sub2_Sub2_Sub5_Sub2_2;
								@Pc(1465) boolean local1465 = true;
								local1385 = local861 ? local1463.anInt8508 : local1463.anInt8548;
								if (local248 != -1 && local1385 != -1) {
									if (local248 == local1385) {
										local1492 = Static386.aClass23_1.method228(local248);
										if (local1492.aBoolean484 && local1492.anInt7025 != -1) {
											local1545 = Static245.aClass155_1.method3820(local1492.anInt7025);
											local1548 = local1545.anInt7686;
											if (local1548 == 0 || local1548 == 2) {
												local1465 = false;
											} else if (local1548 == 1) {
												local1465 = true;
											}
										}
									} else {
										local1492 = Static386.aClass23_1.method228(local248);
										@Pc(1497) Class250 local1497 = Static386.aClass23_1.method228(local1385);
										if (local1492.anInt7025 != -1 && local1497.anInt7025 != -1) {
											local1512 = Static245.aClass155_1.method3820(local1492.anInt7025);
											@Pc(1518) Class270 local1518 = Static245.aClass155_1.method3820(local1497.anInt7025);
											if (local1518.anInt7694 > local1512.anInt7694) {
												local1465 = false;
											}
										}
									}
								}
								if (local1465) {
									if (local861) {
										local1463.anInt8565 = local267;
										local1463.anInt8495 = 0;
										local1463.anInt8576 = local254 + Static397.anInt6998;
										local1463.anInt8499 = 1;
										local1463.anInt8557 = local259 & 0x7;
										local1463.anInt8504 = 0;
										local1463.anInt8508 = local248;
										if (local1463.anInt8576 > Static397.anInt6998) {
											local1463.anInt8495 = -1;
										}
										if (local1463.anInt8508 != -1 && local1463.anInt8576 == Static397.anInt6998) {
											local1387 = Static386.aClass23_1.method228(local1463.anInt8508).anInt7025;
											if (local1387 != -1) {
												local1545 = Static245.aClass155_1.method3820(local1387);
												if (local1545 != null && local1545.anIntArray443 != null && !local1463.aBoolean578) {
													Static217.method3600(0, local1463, local1545);
												}
											}
										}
									} else {
										local1463.anInt8525 = local254 + Static397.anInt6998;
										local1463.anInt8548 = local248;
										local1463.anInt8561 = 1;
										local1463.anInt8537 = local267;
										local1463.anInt8540 = 0;
										local1463.anInt8567 = 0;
										local1463.anInt8498 = local259 & 0x7;
										if (local1463.anInt8525 > Static397.anInt6998) {
											local1463.anInt8567 = -1;
										}
										if (local1463.anInt8548 != -1 && Static397.anInt6998 == local1463.anInt8525) {
											local1387 = Static386.aClass23_1.method228(local1463.anInt8548).anInt7025;
											if (local1387 != -1) {
												local1545 = Static245.aClass155_1.method3820(local1387);
												if (local1545 != null && local1545.anIntArray443 != null && !local1463.aBoolean578) {
													Static217.method3600(0, local1463, local1545);
												}
											}
										}
									}
								}
							}
						} else if (local73 >> 28 != 0) {
							local878 = local73 & 0xFFFF;
							@Pc(1741) Class25_Sub2_Sub2_Sub5_Sub1 local1741;
							if (local878 == Static147.anInt3433) {
								local1741 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1;
							} else {
								local1741 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local878];
							}
							if (local1741 != null) {
								if (local248 == 65535) {
									local248 = -1;
								}
								local521 = true;
								local971 = local861 ? local1741.anInt8508 : local1741.anInt8548;
								@Pc(1837) Class270 local1837;
								if (local248 != -1 && local971 != -1) {
									@Pc(1785) Class250 local1785;
									if (local248 == local971) {
										local1785 = Static386.aClass23_1.method228(local248);
										if (local1785.aBoolean484 && local1785.anInt7025 != -1) {
											local1837 = Static245.aClass155_1.method3820(local1785.anInt7025);
											local1840 = local1837.anInt7686;
											if (local1840 == 0 || local1840 == 2) {
												local521 = false;
											} else if (local1840 == 1) {
												local521 = true;
											}
										}
									} else {
										local1785 = Static386.aClass23_1.method228(local248);
										local1492 = Static386.aClass23_1.method228(local971);
										if (local1785.anInt7025 != -1 && local1492.anInt7025 != -1) {
											local1545 = Static245.aClass155_1.method3820(local1785.anInt7025);
											local1512 = Static245.aClass155_1.method3820(local1492.anInt7025);
											if (local1545.anInt7694 < local1512.anInt7694) {
												local521 = false;
											}
										}
									}
								}
								if (local521) {
									if (local861) {
										local1741.anInt8576 = local254 + Static397.anInt6998;
										local1741.anInt8565 = local267;
										local1741.anInt8504 = 0;
										local1741.anInt8508 = local248;
										local1741.anInt8557 = local259 & 0x7;
										local1741.anInt8499 = 1;
										local1741.anInt8495 = 0;
										if (local1741.anInt8508 == 65535) {
											local1741.anInt8508 = -1;
										}
										if (local1741.anInt8576 > Static397.anInt6998) {
											local1741.anInt8495 = -1;
										}
										if (local1741.anInt8508 != -1 && local1741.anInt8576 == Static397.anInt6998) {
											local1385 = Static386.aClass23_1.method228(local1741.anInt8508).anInt7025;
											if (local1385 != -1) {
												local1837 = Static245.aClass155_1.method3820(local1385);
												if (local1837 != null && local1837.anIntArray443 != null && !local1741.aBoolean578) {
													Static217.method3600(0, local1741, local1837);
												}
											}
										}
									} else {
										local1741.anInt8548 = local248;
										local1741.anInt8537 = local267;
										local1741.anInt8498 = local259 & 0x7;
										local1741.anInt8567 = 0;
										local1741.anInt8540 = 0;
										local1741.anInt8525 = local254 + Static397.anInt6998;
										local1741.anInt8561 = 1;
										if (local1741.anInt8525 > Static397.anInt6998) {
											local1741.anInt8567 = -1;
										}
										if (local1741.anInt8548 == 65535) {
											local1741.anInt8548 = -1;
										}
										if (local1741.anInt8548 != -1 && Static397.anInt6998 == local1741.anInt8525) {
											local1385 = Static386.aClass23_1.method228(local1741.anInt8548).anInt7025;
											if (local1385 != -1) {
												local1837 = Static245.aClass155_1.method3820(local1385);
												if (local1837 != null && local1837.anIntArray443 != null && !local1741.aBoolean578) {
													Static217.method3600(0, local1741, local1837);
												}
											}
										}
									}
								}
							}
						}
					} else {
						local878 = local73 >> 28 & 0x3;
						local487 = (local73 >> 14 & 0x3FFF) - Static321.anInt5874;
						local961 = (local73 & 0x3FFF) - Static137.anInt3293;
						if (local487 >= 0 && local961 >= 0 && Static345.anInt6228 > local487 && local961 < Static535.anInt9341) {
							local971 = local487 * 512 + 256;
							local1385 = local961 * 512 + 256;
							local1387 = local878;
							if (local878 < 3 && Static269.method4098(local487, local961)) {
								local1387 = local878 + 1;
							}
							@Pc(1424) Class25_Sub2_Sub2_Sub2 local1424 = new Class25_Sub2_Sub2_Sub2(local248, 0, Static397.anInt6998, local878, local1387, local971, Static78.method3298(local971, local878, local1385) - local267, local1385, local487, local487, local961, local961, local259 & 0x7);
							Static410.aClass244_55.method5570(new Class3_Sub7_Sub2(local1424));
						}
					}
					Static170.aClass123_284 = null;
					return true;
				} else if (Static170.aClass123_284 == Static434.aClass123_251) {
					local73 = Static455.aClass3_Sub26_Sub1_2.method6816();
					local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
					local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
					if (Static205.method3536(local248)) {
						Static595.method8148(local73, local456);
					}
					Static170.aClass123_284 = null;
					return true;
				} else if (Static170.aClass123_284 == Static467.aClass123_266) {
					Static120.method2331(Static557.aClass364_17);
					Static170.aClass123_284 = null;
					return true;
				} else if (Static170.aClass123_284 == Static24.aClass123_21) {
					local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
					local248 = Static455.aClass3_Sub26_Sub1_2.method6783();
					if (local248 == 65535) {
						local248 = -1;
					}
					local254 = Static455.aClass3_Sub26_Sub1_2.method6781();
					local259 = Static455.aClass3_Sub26_Sub1_2.method6774();
					if (Static205.method3536(local73)) {
						Static168.method3019(local248, local259, local254);
						@Pc(2108) Class133 local2108 = Static272.aClass121_2.method3327(local248);
						Static537.method7345(local2108.anInt4395, local2108.anInt4387, local254, local2108.anInt4445);
						Static162.method2968(local2108.anInt4426, local2108.anInt4401, local2108.anInt4435, local254);
					}
					Static170.aClass123_284 = null;
					return true;
				} else {
					@Pc(2181) long local2181;
					@Pc(2187) Class3_Sub24 local2187;
					@Pc(2196) Class3_Sub24 local2196;
					if (Static170.aClass123_284 == Static74.aClass123_58) {
						local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
						local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
						if (local248 == 65535) {
							local248 = -1;
						}
						local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
						if (local254 == 65535) {
							local254 = -1;
						}
						local259 = Static455.aClass3_Sub26_Sub1_2.method6816();
						local267 = Static455.aClass3_Sub26_Sub1_2.method6812();
						if (Static205.method3536(local73)) {
							for (local271 = local254; local271 <= local248; local271++) {
								local2181 = (long) local271 + ((long) local259 << 32);
								local2187 = (Class3_Sub24) Static573.aClass297_38.method6531(local2181);
								if (local2187 != null) {
									local2196 = new Class3_Sub24(local2187.anInt3988, local267);
									local2187.method8128();
								} else if (local271 == -1) {
									local2196 = new Class3_Sub24(Static105.method2180(local259).aClass3_Sub24_2.anInt3988, local267);
								} else {
									local2196 = new Class3_Sub24(0, local267);
								}
								Static573.aClass297_38.method6537(local2181, local2196);
							}
						}
						Static170.aClass123_284 = null;
						return true;
					} else if (Static62.aClass123_51 == Static170.aClass123_284) {
						if (Static178.aFrame3 != null) {
							Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
						}
						@Pc(2254) byte[] local2254 = new byte[Static42.anInt1159];
						Static455.aClass3_Sub26_Sub1_2.method5555(local2254, Static42.anInt1159);
						local422 = Static172.method3065(Static42.anInt1159, local2254, 0);
						Static466.method6370(Static467.aClass168_12, Static37.anInt1122 == 1, local422, true);
						Static170.aClass123_284 = null;
						return true;
					} else {
						@Pc(2316) long local2316;
						@Pc(2321) long local2321;
						@Pc(2311) long local2311;
						if (Static15.aClass123_14 == Static170.aClass123_284) {
							local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
							local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
							local456 = local422;
							if (local448) {
								local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
							}
							local2311 = Static455.aClass3_Sub26_Sub1_2.method6813();
							local2316 = Static455.aClass3_Sub26_Sub1_2.method6811();
							local2321 = Static455.aClass3_Sub26_Sub1_2.method6830();
							local971 = Static455.aClass3_Sub26_Sub1_2.method6814();
							local1385 = Static455.aClass3_Sub26_Sub1_2.method6811();
							@Pc(2335) long local2335 = local2321 + (local2316 << 32);
							@Pc(2337) boolean local2337 = false;
							@Pc(2339) int local2339 = 0;
							while (true) {
								if (local2339 >= 100) {
									if (local971 <= 1 && Static121.method2333(local456)) {
										local2337 = true;
									}
									break;
								}
								if (Static340.aLongArray11[local2339] == local2335) {
									local2337 = true;
									break;
								}
								local2339++;
							}
							if (!local2337 && Static354.anInt6317 == 0) {
								Static340.aLongArray11[Static370.anInt6323] = local2335;
								Static370.anInt6323 = (Static370.anInt6323 + 1) % 100;
								@Pc(2397) String local2397 = Static212.aClass294_3.method6455(local1385).method3051(Static455.aClass3_Sub26_Sub1_2);
								if (local971 == 2) {
									Static12.method111("<img=1>" + local422, Static153.method2852(local2311), local2397, 0, local1385, local422, "<img=1>" + local456, 20);
								} else if (local971 == 1) {
									Static12.method111("<img=0>" + local422, Static153.method2852(local2311), local2397, 0, local1385, local422, "<img=0>" + local456, 20);
								} else {
									Static12.method111(local422, Static153.method2852(local2311), local2397, 0, local1385, local422, local456, 20);
								}
							}
							Static170.aClass123_284 = null;
							return true;
						} else if (Static357.aClass123_210 == Static170.aClass123_284) {
							Static118.method2317(Static42.anInt1159, Static455.aClass3_Sub26_Sub1_2, Static467.aClass168_12);
							Static170.aClass123_284 = null;
							return true;
						} else if (Static28.aClass123_29 == Static170.aClass123_284) {
							local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
							local248 = Static455.aClass3_Sub26_Sub1_2.method6777();
							Static206.aClass143_3.method3695(local73, local248);
							Static170.aClass123_284 = null;
							return true;
						} else if (Static170.aClass123_284 == Static168.aClass123_123) {
							Static120.method2331(Static286.aClass364_15);
							Static170.aClass123_284 = null;
							return true;
						} else if (Static220.aClass123_149 == Static170.aClass123_284) {
							local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
							local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
							local254 = Static455.aClass3_Sub26_Sub1_2.method6814();
							local259 = Static455.aClass3_Sub26_Sub1_2.method6811() << 2;
							local267 = Static455.aClass3_Sub26_Sub1_2.method6814();
							local271 = Static455.aClass3_Sub26_Sub1_2.method6814();
							if (Static205.method3536(local73)) {
								Static8.method71(local254, local248, local259, local271, local267);
							}
							Static170.aClass123_284 = null;
							return true;
						} else if (Static187.aClass123_140 == Static170.aClass123_284) {
							local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
							local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
							local254 = Static455.aClass3_Sub26_Sub1_2.method6822();
							if (Static205.method3536(local254)) {
								Static289.method4333(local248, local73);
							}
							Static170.aClass123_284 = null;
							return true;
						} else if (Static527.aClass123_325 == Static170.aClass123_284) {
							local73 = Static455.aClass3_Sub26_Sub1_2.method6812();
							local248 = Static455.aClass3_Sub26_Sub1_2.method6783();
							@Pc(2602) byte local2602 = Static455.aClass3_Sub26_Sub1_2.method6829();
							if (Static205.method3536(local73)) {
								Static129.method2396(local248, local2602);
							}
							Static170.aClass123_284 = null;
							return true;
						} else {
							@Pc(2644) Class3_Sub49 local2644;
							if (Static170.aClass123_284 == Static122.aClass123_93) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
								local248 = Static455.aClass3_Sub26_Sub1_2.method6819();
								local254 = Static455.aClass3_Sub26_Sub1_2.method6781();
								local259 = Static455.aClass3_Sub26_Sub1_2.method6812();
								if (Static205.method3536(local259)) {
									local2644 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local254);
									if (local2644 != null) {
										Static46.method1171(local73 != local2644.anInt9244, false, local2644);
									}
									Static506.method6842(local73, local248, false, local254);
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static550.aClass123_306 == Static170.aClass123_284) {
								Static120.method2331(Static549.aClass364_20);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static170.aClass123_284 == Static86.aClass123_66) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6777();
								local248 = local73 >> 2;
								local254 = local73 & 0x3;
								local259 = Static92.anIntArray78[local248];
								local267 = Static455.aClass3_Sub26_Sub1_2.method6781();
								local271 = local267 >> 28 & 0x3;
								local878 = local267 >> 14 & 0x3FFF;
								local487 = local267 & 0x3FFF;
								local961 = Static455.aClass3_Sub26_Sub1_2.method6822();
								local878 -= Static321.anInt5874;
								local487 -= Static137.anInt3293;
								if (local961 == 65535) {
									local961 = -1;
								}
								Static80.method1849(local878, local248, local961, local487, local259, local271, local254);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static262.aClass123_169 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6812();
								@Pc(2761) int[] local2761 = new int[4];
								for (local254 = 0; local254 < 4; local254++) {
									local2761[local254] = Static455.aClass3_Sub26_Sub1_2.method6783();
								}
								local259 = Static455.aClass3_Sub26_Sub1_2.method6777();
								@Pc(2786) Class3_Sub39 local2786 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local73);
								if (local2786 != null) {
									Static447.method6196(local259, local2786.aClass25_Sub2_Sub2_Sub5_Sub2_2, local2761);
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static101.aClass123_86 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
								if (local73 == 65535) {
									local73 = -1;
								}
								local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
								local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
								local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
								Static205.method3538(local259, local267, local254, local73, local248, false);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static361.aClass123_212 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local254 = Static455.aClass3_Sub26_Sub1_2.method6781();
								if (Static205.method3536(local248)) {
									Static17.method6924(local73, local254);
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static133.aClass123_100 == Static170.aClass123_284) {
								Static120.method2331(Static86.aClass364_8);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static258.aClass123_168 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
								@Pc(2892) Object[] local2892 = new Object[local422.length() + 1];
								for (local259 = local422.length() - 1; local259 >= 0; local259--) {
									if (local422.charAt(local259) == 's') {
										local2892[local259 + 1] = Static455.aClass3_Sub26_Sub1_2.method6786();
									} else {
										local2892[local259 + 1] = Integer.valueOf(Static455.aClass3_Sub26_Sub1_2.method6816());
									}
								}
								local2892[0] = Integer.valueOf(Static455.aClass3_Sub26_Sub1_2.method6816());
								if (Static205.method3536(local73)) {
									@Pc(2945) Class3_Sub36 local2945 = new Class3_Sub36();
									local2945.anObjectArray1 = local2892;
									Static583.method7919(local2945);
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static93.aClass123_69 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6814();
								if (Static455.aClass3_Sub26_Sub1_2.method6814() == 0) {
									Static107.aClass275Array1[local73] = new Class275();
								} else {
									Static455.aClass3_Sub26_Sub1_2.anInt8703--;
									Static107.aClass275Array1[local73] = new Class275(Static455.aClass3_Sub26_Sub1_2);
								}
								Static170.aClass123_284 = null;
								Static67.anInt1837 = Static523.anInt9188;
								return true;
							} else if (Static32.aClass123_104 == Static170.aClass123_284) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
								local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
								if (Static205.method3536(local73) && Static449.aClass251ArrayArray1[local248] != null) {
									for (local267 = local254; local267 < local259; local267++) {
										local271 = Static455.aClass3_Sub26_Sub1_2.method6830();
										if (local267 < Static449.aClass251ArrayArray1[local248].length && Static449.aClass251ArrayArray1[local248][local267] != null) {
											Static449.aClass251ArrayArray1[local248][local267].anInt7287 = local271;
										}
									}
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static426.aClass123_245 == Static170.aClass123_284) {
								local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
								local248 = Static455.aClass3_Sub26_Sub1_2.method6822();
								if (Static205.method3536(local248)) {
									Static100.aBoolean637 = local448;
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static9.aClass123_12 == Static170.aClass123_284) {
								Static120.method2331(Static185.aClass364_11);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static170.aClass123_284 == Static538.aClass123_296) {
								local73 = Static455.aClass3_Sub26_Sub1_2.method6816();
								local248 = Static455.aClass3_Sub26_Sub1_2.method6783();
								local254 = Static455.aClass3_Sub26_Sub1_2.method6785();
								local259 = Static455.aClass3_Sub26_Sub1_2.method6812();
								if (local259 == 65535) {
									local259 = -1;
								}
								local267 = Static455.aClass3_Sub26_Sub1_2.method6783();
								if (local267 == 65535) {
									local267 = -1;
								}
								if (Static205.method3536(local248)) {
									for (local271 = local259; local271 <= local267; local271++) {
										local2181 = (long) local271 + ((long) local254 << 32);
										local2187 = (Class3_Sub24) Static573.aClass297_38.method6531(local2181);
										if (local2187 != null) {
											local2196 = new Class3_Sub24(local73, local2187.anInt3989);
											local2187.method8128();
										} else if (local271 == -1) {
											local2196 = new Class3_Sub24(local73, Static105.method2180(local254).aClass3_Sub24_2.anInt3989);
										} else {
											local2196 = new Class3_Sub24(local73, -1);
										}
										Static573.aClass297_38.method6537(local2181, local2196);
									}
								}
								Static170.aClass123_284 = null;
								return true;
							} else if (Static170.aClass123_284 == Static569.aClass123_313) {
								Static120.method2331(Static217.aClass364_13);
								Static170.aClass123_284 = null;
								return true;
							} else if (Static170.aClass123_284 == Static34.aClass123_99) {
								Static218.method6807(Static262.aBoolean331);
								Static170.aClass123_284 = null;
								return false;
							} else {
								@Pc(3271) boolean local3271;
								if (Static170.aClass123_284 == Static407.aClass123_239) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
									@Pc(3240) Class25_Sub2_Sub2_Sub5_Sub1 local3240;
									if (Static147.anInt3433 == local73) {
										local3240 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1;
									} else {
										local3240 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local73];
									}
									if (local3240 == null) {
										Static170.aClass123_284 = null;
										return true;
									}
									local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local3271 = (local254 & 0x8000) != 0;
									if (local3240.aString183 != null && local3240.aClass131_1 != null) {
										local861 = false;
										if (local259 <= 1) {
											if (!local3271 && (Static402.aBoolean498 && !Static226.aBoolean296 || Static416.aBoolean520)) {
												local861 = true;
											} else if (Static121.method2333(local3240.aString183)) {
												local861 = true;
											}
										}
										if (!local861 && Static354.anInt6317 == 0) {
											local487 = -1;
											if (local3271) {
												local254 &= 0x7FFF;
												@Pc(3320) Class211 local3320 = Static278.method4209(Static455.aClass3_Sub26_Sub1_2);
												local487 = local3320.anInt6132;
												local754 = local3320.aClass3_Sub7_Sub8_1.method3051(Static455.aClass3_Sub26_Sub1_2);
											} else {
												local754 = Static554.method7609(Static35.method508(Static455.aClass3_Sub26_Sub1_2));
											}
											local3240.aString229 = local754.trim();
											local3240.anInt8574 = local254 >> 8;
											local3240.anInt8569 = 150;
											local3240.anInt8509 = local254 & 0xFF;
											if (local259 == 1 || local259 == 2) {
												local961 = local3271 ? 17 : 1;
											} else {
												local961 = local3271 ? 17 : 2;
											}
											if (local259 == 2) {
												Static12.method111("<img=1>" + local3240.method5676(), null, local754, 0, local487, local3240.aString182, "<img=1>" + local3240.method5670(), local961);
											} else if (local259 == 1) {
												Static12.method111("<img=0>" + local3240.method5676(), null, local754, 0, local487, local3240.aString182, "<img=0>" + local3240.method5670(), local961);
											} else {
												Static12.method111(local3240.method5676(), null, local754, 0, local487, local3240.aString182, local3240.method5670(), local961);
											}
										}
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static137.aClass123_106) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6777();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6821();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
									if (local254 == 65535) {
										local254 = -1;
									}
									Static389.method6669(local73, local248, local254);
									Static170.aClass123_284 = null;
									return true;
								} else if (Static58.aClass123_46 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6787();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6821();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
									if (local254 == 65535) {
										local254 = -1;
									}
									Static592.method5618(local254, local248, local73);
									Static170.aClass123_284 = null;
									return true;
								} else if (Static357.aClass123_211 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6774();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6789();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
									if (Static205.method3536(local254)) {
										Static595.method8149(local73, local248);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static542.aClass123_300) {
									Static120.method2331(Static65.aClass364_6);
									Static170.aClass123_284 = null;
									return true;
								} else if (Static150.aClass123_112 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
									if (local73 == 65535) {
										local73 = -1;
									}
									local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
									Static15.method151(local73, local267, local254, local248, local259);
									Static170.aClass123_284 = null;
									return true;
								} else if (Static167.aClass123_227 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
									if (local248 == 65535) {
										local248 = -1;
									}
									local254 = Static455.aClass3_Sub26_Sub1_2.method6785();
									if (Static205.method3536(local73)) {
										Static212.method4713(-1, local254, local248, 1);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static563.aClass123_223 == Static170.aClass123_284) {
									local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
									local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
									local456 = local422;
									if (local448) {
										local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
									}
									local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local861 = false;
									if (local259 <= 1 && Static121.method2333(local456)) {
										local861 = true;
									}
									if (!local861 && Static354.anInt6317 == 0) {
										local754 = Static212.aClass294_3.method6455(local267).method3051(Static455.aClass3_Sub26_Sub1_2);
										if (local259 == 2) {
											Static12.method111("<img=1>" + local422, null, local754, 0, local267, local422, "<img=1>" + local456, 25);
										} else if (local259 == 1) {
											Static12.method111("<img=0>" + local422, null, local754, 0, local267, local422, "<img=0>" + local456, 25);
										} else {
											Static12.method111(local422, null, local754, 0, local267, local422, local456, 25);
										}
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static99.aClass123_77 == Static170.aClass123_284) {
									Static170.aClass123_284 = null;
									return false;
								} else if (Static547.aClass123_304 == Static170.aClass123_284) {
									local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
									local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
									local456 = local422;
									if (local448) {
										local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
									}
									local2311 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local2316 = Static455.aClass3_Sub26_Sub1_2.method6830();
									local487 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local961 = Static455.aClass3_Sub26_Sub1_2.method6811();
									@Pc(3823) long local3823 = (local2311 << 32) + local2316;
									@Pc(3825) boolean local3825 = false;
									local1840 = 0;
									while (true) {
										if (local1840 >= 100) {
											if (local487 <= 1 && Static121.method2333(local456)) {
												local3825 = true;
											}
											break;
										}
										if (Static340.aLongArray11[local1840] == local3823) {
											local3825 = true;
											break;
										}
										local1840++;
									}
									if (!local3825 && Static354.anInt6317 == 0) {
										Static340.aLongArray11[Static370.anInt6323] = local3823;
										Static370.anInt6323 = (Static370.anInt6323 + 1) % 100;
										@Pc(3880) String local3880 = Static212.aClass294_3.method6455(local961).method3051(Static455.aClass3_Sub26_Sub1_2);
										if (local487 == 2) {
											Static12.method111("<img=1>" + local422, null, local3880, 0, local961, local422, "<img=1>" + local456, 18);
										} else if (local487 == 1) {
											Static12.method111("<img=0>" + local422, null, local3880, 0, local961, local422, "<img=0>" + local456, 18);
										} else {
											Static12.method111(local422, null, local3880, 0, local961, local422, local456, 18);
										}
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static22.aClass123_19) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local259 = Static455.aClass3_Sub26_Sub1_2.method6811() << 2;
									local267 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local271 = Static455.aClass3_Sub26_Sub1_2.method6814();
									if (Static205.method3536(local73)) {
										Static43.method1111(local248, true, local254, local259, local267, local271);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static413.aClass123_243) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6816();
									if (Static205.method3536(local73)) {
										Static212.method4713(-1, local248, -1, 3);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static307.aClass123_193 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6777();
									Static361.anIntArray354[local248] = local73;
									Static564.anIntArray564[local248] = local254;
									Static95.anIntArray80[local248] = 1;
									local259 = Static312.anIntArray280[local248] - 1;
									for (local267 = 0; local267 < local259; local267++) {
										if (local73 >= Class8.anIntArray4[local267]) {
											Static95.anIntArray80[local248] = local267 + 2;
										}
									}
									Static397.anIntArray394[Static575.anInt9957++ & 0x1F] = local248;
									Static170.aClass123_284 = null;
									return true;
								} else if (Static18.aClass123_16 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6781();
									if (Static205.method3536(local73)) {
										Static247.method3935(local254, local248);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static565.aClass123_311) {
									Static259.anInt1155 = Static455.aClass3_Sub26_Sub1_2.method6814();
									Static194.anInt4230 = Static523.anInt9188;
									Static170.aClass123_284 = null;
									return true;
								} else if (Static447.aClass123_259 == Static170.aClass123_284) {
									Static496.method6695();
									Static170.aClass123_284 = null;
									return false;
								} else if (Static330.aClass123_201 == Static170.aClass123_284) {
									Static19.aString10 = Static42.anInt1159 <= 2 ? Static573.aClass350_30.method7730(Static201.anInt4321) : Static455.aClass3_Sub26_Sub1_2.method6786();
									Static580.anInt10050 = Static42.anInt1159 <= 0 ? -1 : Static455.aClass3_Sub26_Sub1_2.method6811();
									Static170.aClass123_284 = null;
									if (Static580.anInt10050 == 65535) {
										Static580.anInt10050 = -1;
									}
									return true;
								} else if (Static18.aClass123_15 == Static170.aClass123_284) {
									Static278.anInt5258 = Static455.aClass3_Sub26_Sub1_2.method6789();
									Static170.aClass123_284 = null;
									Static194.anInt4230 = Static523.anInt9188;
									return true;
								} else if (Static170.aClass123_284 == Static109.aClass123_89) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
									if (Static205.method3536(local73)) {
										Static446.method6190();
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static99.aClass123_78) {
									Static132.method2604(Static455.aClass3_Sub26_Sub1_2.method6786());
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static123.aClass123_94) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6816();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
									if (Static205.method3536(local254)) {
										Static371.method5232(local248, local73);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static550.aClass123_305 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6821();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6821();
									if (local73 == 255) {
										local73 = -1;
										local248 = -1;
									}
									Static64.method1586(local73, local248);
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static263.aClass123_170) {
									Static178.aClass134_2 = Static428.method5926(Static455.aClass3_Sub26_Sub1_2.method6814());
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static43.aClass123_36) {
									Static573.anInt9839 = Static523.anInt9188;
									if (Static42.anInt1159 == 0) {
										Static493.aString228 = null;
										Static260.anInt5022 = 0;
										Static131.aClass74Array1 = null;
										Static253.aString120 = null;
										Static170.aClass123_284 = null;
										return true;
									}
									Static493.aString228 = Static455.aClass3_Sub26_Sub1_2.method6786();
									local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
									if (local448) {
										Static455.aClass3_Sub26_Sub1_2.method6786();
									}
									@Pc(4329) long local4329 = Static455.aClass3_Sub26_Sub1_2.method6813();
									Static253.aString120 = Static517.method6954(local4329);
									Static238.aByte45 = Static455.aClass3_Sub26_Sub1_2.method6825();
									local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
									if (local259 == 255) {
										Static170.aClass123_284 = null;
										return true;
									}
									Static260.anInt5022 = local259;
									@Pc(4353) Class74[] local4353 = new Class74[100];
									for (local271 = 0; local271 < Static260.anInt5022; local271++) {
										local4353[local271] = new Class74();
										local4353[local271].aString60 = Static455.aClass3_Sub26_Sub1_2.method6786();
										local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
										if (local448) {
											local4353[local271].aString58 = Static455.aClass3_Sub26_Sub1_2.method6786();
										} else {
											local4353[local271].aString58 = local4353[local271].aString60;
										}
										local4353[local271].aString59 = Static468.method6414(local4353[local271].aString58);
										local4353[local271].anInt2589 = Static455.aClass3_Sub26_Sub1_2.method6811();
										local4353[local271].aByte26 = Static455.aClass3_Sub26_Sub1_2.method6825();
										local4353[local271].aString61 = Static455.aClass3_Sub26_Sub1_2.method6786();
										if (local4353[local271].aString58.equals(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183)) {
											Static94.aByte24 = local4353[local271].aByte26;
										}
									}
									local961 = Static260.anInt5022;
									while (local961 > 0) {
										local468 = true;
										local961--;
										for (local971 = 0; local971 < local961; local971++) {
											if (local4353[local971].aString59.compareTo(local4353[local971 + 1].aString59) > 0) {
												local936 = local4353[local971];
												local4353[local971] = local4353[local971 + 1];
												local468 = false;
												local4353[local971 + 1] = local936;
											}
										}
										if (local468) {
											break;
										}
									}
									Static170.aClass123_284 = null;
									Static131.aClass74Array1 = local4353;
									return true;
								} else if (Static170.aClass123_284 == Static472.aClass123_270) {
									Static218.method6807(false);
									Static170.aClass123_284 = null;
									return false;
								} else if (Static170.aClass123_284 == Static390.aClass123_230) {
									Static456.anInt7972 = Static455.aClass3_Sub26_Sub1_2.method6776();
									Static402.aBoolean498 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
									Static170.aClass123_284 = null;
									return true;
								} else if (Static170.aClass123_284 == Static351.aClass123_205) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6774();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6783();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
									if (Static205.method3536(local254)) {
										Static129.method2396(local248, local73);
									}
									Static170.aClass123_284 = null;
									return true;
								} else if (Static354.aClass123_208 == Static170.aClass123_284) {
									local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
									local248 = Static455.aClass3_Sub26_Sub1_2.method6781();
									local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
									if (local254 == 65535) {
										local254 = -1;
									}
									if (Static205.method3536(local73)) {
										Static212.method4713(-1, local248, local254, 2);
									}
									Static170.aClass123_284 = null;
									return true;
								} else {
									@Pc(4635) String local4635;
									if (Static170.aClass123_284 == Static526.aClass123_288) {
										local73 = Static455.aClass3_Sub26_Sub1_2.method6821();
										local248 = Static455.aClass3_Sub26_Sub1_2.method6777();
										local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
										if (local254 == 65535) {
											local254 = -1;
										}
										local4635 = Static455.aClass3_Sub26_Sub1_2.method6786();
										if (local248 >= 1 && local248 <= 8) {
											if (local4635.equalsIgnoreCase("null")) {
												local4635 = null;
											}
											Static40.aStringArray4[local248 - 1] = local4635;
											Static459.anIntArray476[local248 - 1] = local254;
											Static429.aBooleanArray26[local248 - 1] = local73 == 0;
										}
										Static170.aClass123_284 = null;
										return true;
									} else if (Static569.aClass123_314 == Static170.aClass123_284) {
										Static371.anInt6488 = Static455.aClass3_Sub26_Sub1_2.method6821();
										Static246.anInt4843 = Static455.aClass3_Sub26_Sub1_2.method6792() << 3;
										Static13.anInt122 = Static455.aClass3_Sub26_Sub1_2.method6775() << 3;
										Static170.aClass123_284 = null;
										return true;
									} else if (Static580.aClass123_322 == Static170.aClass123_284) {
										local73 = Static455.aClass3_Sub26_Sub1_2.method6785();
										local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
										local254 = Static455.aClass3_Sub26_Sub1_2.method6781();
										if (Static205.method3536(local248)) {
											@Pc(4729) Class3_Sub49 local4729 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local254);
											local2644 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local73);
											if (local2644 != null) {
												Static46.method1171(local4729 == null || local4729.anInt9244 != local2644.anInt9244, false, local2644);
											}
											if (local4729 != null) {
												local4729.method8128();
												Static204.aClass297_16.method6537((long) local73, local4729);
											}
											@Pc(4771) Class251 local4771 = Static105.method2180(local254);
											if (local4771 != null) {
												Static588.method8016(local4771);
											}
											local4771 = Static105.method2180(local73);
											if (local4771 != null) {
												Static588.method8016(local4771);
												Static479.method6546(local4771, true);
											}
											if (Static79.anInt2118 != -1) {
												Static51.method4569(1, Static79.anInt2118);
											}
										}
										Static170.aClass123_284 = null;
										return true;
									} else if (Static365.aClass123_216 == Static170.aClass123_284) {
										local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
										local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
										local841 = (local248 & 0x1) == 1;
										while (Static42.anInt1159 > Static455.aClass3_Sub26_Sub1_2.anInt8703) {
											local259 = Static455.aClass3_Sub26_Sub1_2.method6832();
											local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local271 = 0;
											if (local267 != 0) {
												local271 = Static455.aClass3_Sub26_Sub1_2.method6814();
												if (local271 == 255) {
													local271 = Static455.aClass3_Sub26_Sub1_2.method6816();
												}
											}
											Static355.method5095(local841, local267 - 1, local271, local73, local259);
										}
										Static276.anIntArray242[Static196.anInt4252++ & 0x1F] = local73;
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static228.aClass123_151) {
										local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
										local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
										local456 = local422;
										if (local448) {
											local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
										}
										local2311 = Static455.aClass3_Sub26_Sub1_2.method6811();
										local2316 = Static455.aClass3_Sub26_Sub1_2.method6830();
										local487 = Static455.aClass3_Sub26_Sub1_2.method6814();
										@Pc(4922) long local4922 = local2316 + (local2311 << 32);
										@Pc(4924) boolean local4924 = false;
										local1387 = 0;
										while (true) {
											if (local1387 >= 100) {
												if (local487 <= 1) {
													if (Static402.aBoolean498 && !Static226.aBoolean296 || Static416.aBoolean520) {
														local4924 = true;
													} else if (Static121.method2333(local456)) {
														local4924 = true;
													}
												}
												break;
											}
											if (Static340.aLongArray11[local1387] == local4922) {
												local4924 = true;
												break;
											}
											local1387++;
										}
										if (!local4924 && Static354.anInt6317 == 0) {
											Static340.aLongArray11[Static370.anInt6323] = local4922;
											Static370.anInt6323 = (Static370.anInt6323 + 1) % 100;
											@Pc(4989) String local4989 = Static554.method7609(Static35.method508(Static455.aClass3_Sub26_Sub1_2));
											if (local487 == 2) {
												Static12.method111("<img=1>" + local422, null, local4989, 0, -1, local422, "<img=1>" + local456, 7);
											} else if (local487 == 1) {
												Static12.method111("<img=0>" + local422, null, local4989, 0, -1, local422, "<img=0>" + local456, 7);
											} else {
												Static12.method111(local422, null, local4989, 0, -1, local422, local456, 3);
											}
										}
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static321.aClass123_198) {
										Static120.method2331(Static67.aClass364_7);
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static9.aClass123_13) {
										Static298.anInt5561 = Static455.aClass3_Sub26_Sub1_2.method6814();
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static52.aClass123_39) {
										Static336.anInt6067 = Static455.aClass3_Sub26_Sub1_2.method6814();
										for (local73 = 0; local73 < Static336.anInt6067; local73++) {
											Static101.aStringArray10[local73] = Static455.aClass3_Sub26_Sub1_2.method6786();
											Static205.aStringArray17[local73] = Static455.aClass3_Sub26_Sub1_2.method6786();
											if (Static205.aStringArray17[local73].equals("")) {
												Static205.aStringArray17[local73] = Static101.aStringArray10[local73];
											}
											Static554.aStringArray46[local73] = Static455.aClass3_Sub26_Sub1_2.method6786();
											Static412.aStringArray34[local73] = Static455.aClass3_Sub26_Sub1_2.method6786();
											if (Static412.aStringArray34[local73].equals("")) {
												Static412.aStringArray34[local73] = Static554.aStringArray46[local73];
											}
											Static82.aBooleanArray33[local73] = false;
										}
										Static356.anInt6330 = Static523.anInt9188;
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static134.aClass123_101) {
										Static120.method2331(Static173.aClass364_10);
										Static170.aClass123_284 = null;
										return true;
									} else if (Static65.aClass123_54 == Static170.aClass123_284) {
										Static246.anInt4843 = Static455.aClass3_Sub26_Sub1_2.method6829() << 3;
										Static371.anInt6488 = Static455.aClass3_Sub26_Sub1_2.method6819();
										Static13.anInt122 = Static455.aClass3_Sub26_Sub1_2.method6829() << 3;
										while (Static42.anInt1159 > Static455.aClass3_Sub26_Sub1_2.anInt8703) {
											@Pc(5197) Class364 local5197 = Static402.method5688()[Static455.aClass3_Sub26_Sub1_2.method6814()];
											Static120.method2331(local5197);
										}
										Static170.aClass123_284 = null;
										return true;
									} else if (Static170.aClass123_284 == Static572.aClass123_316) {
										Static181.anInt3976 = 1;
										Static356.anInt6330 = Static523.anInt9188;
										Static170.aClass123_284 = null;
										return true;
									} else {
										@Pc(5230) byte local5230;
										if (Static212.aClass123_197 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6812();
											local5230 = Static455.aClass3_Sub26_Sub1_2.method6825();
											Static206.aClass143_3.method3692(local73, local5230);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static4.aClass123_4 == Static170.aClass123_284) {
											Static455.aClass3_Sub26_Sub1_2.anInt8703 += 28;
											if (Static455.aClass3_Sub26_Sub1_2.method6779()) {
												Static431.method5968(Static455.aClass3_Sub26_Sub1_2, Static455.aClass3_Sub26_Sub1_2.anInt8703 - 28);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static313.aClass123_196 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local841 = (local248 & 0x1) == 1;
											Static45.method1112(local841, local73);
											local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
											for (local267 = 0; local267 < local259; local267++) {
												local271 = Static455.aClass3_Sub26_Sub1_2.method6811();
												local878 = Static455.aClass3_Sub26_Sub1_2.method6819();
												if (local878 == 255) {
													local878 = Static455.aClass3_Sub26_Sub1_2.method6774();
												}
												Static355.method5095(local841, local271 - 1, local878, local73, local267);
											}
											Static276.anIntArray242[Static196.anInt4252++ & 0x1F] = local73;
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static581.aClass123_323) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6774();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
											if (local254 == 65535) {
												local254 = -1;
											}
											if (Static205.method3536(local73)) {
												Static585.method7966(local248, local254);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static403.aClass123_234) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6781();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6783();
											if (Static205.method3536(local254)) {
												Static212.method4713(local248, local73, local259, 5);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static376.aClass123_221) {
											Static206.aClass143_3.method3693();
											Static170.aClass123_284 = null;
											Static230.anInt4679 += 32;
											return true;
										} else if (Static350.aClass123_204 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local267 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local271 = Static455.aClass3_Sub26_Sub1_2.method6811();
											if (Static205.method3536(local73)) {
												Static359.aBooleanArray17[local248] = true;
												Static247.anIntArray228[local248] = local254;
												Static153.anIntArray134[local248] = local259;
												Static581.anIntArray581[local248] = local267;
												Static461.anIntArray477[local248] = local271;
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static229.aClass123_153) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6816();
											if (Static205.method3536(local73)) {
												if (local248 == -1) {
													Static481.anInt8356 = -1;
													Static357.anInt6345 = -1;
												} else {
													local254 = local248 >> 14 & 0x3FFF;
													local254 -= Static321.anInt5874;
													local259 = local248 & 0x3FFF;
													if (local254 < 0) {
														local254 = 0;
													} else if (Static345.anInt6228 <= local254) {
														local254 = Static345.anInt6228;
													}
													local259 -= Static137.anInt3293;
													Static357.anInt6345 = (local254 << 9) + 256;
													if (local259 < 0) {
														local259 = 0;
													} else if (Static535.anInt9341 <= local259) {
														local259 = Static535.anInt9341;
													}
													Static481.anInt8356 = (local259 << 9) + 256;
												}
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static81.aClass123_61 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6814();
											@Pc(5570) boolean local5570 = (local73 & 0x1) == 1;
											local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local4635 = Static455.aClass3_Sub26_Sub1_2.method6786();
											if (local4635.equals("")) {
												local4635 = local456;
											}
											local718 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local466 = Static455.aClass3_Sub26_Sub1_2.method6786();
											if (local466.equals("")) {
												local466 = local718;
											}
											if (local5570) {
												for (local878 = 0; local878 < Static336.anInt6067; local878++) {
													if (Static205.aStringArray17[local878].equals(local466)) {
														Static101.aStringArray10[local878] = local456;
														Static205.aStringArray17[local878] = local4635;
														Static554.aStringArray46[local878] = local718;
														Static412.aStringArray34[local878] = local466;
														break;
													}
												}
											} else {
												Static101.aStringArray10[Static336.anInt6067] = local456;
												Static205.aStringArray17[Static336.anInt6067] = local4635;
												Static554.aStringArray46[Static336.anInt6067] = local718;
												Static412.aStringArray34[Static336.anInt6067] = local466;
												Static82.aBooleanArray33[Static336.anInt6067] = (local73 & 0x2) == 2;
												Static336.anInt6067++;
											}
											Static356.anInt6330 = Static523.anInt9188;
											Static170.aClass123_284 = null;
											return true;
										} else if (Static311.aClass123_194 == Static170.aClass123_284) {
											Static120.method2331(Static495.aClass364_19);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static351.aClass123_206 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local248 = local73 >> 5;
											local254 = local73 & 0x1F;
											if (local254 == 0) {
												Static98.aClass167Array1[local248] = null;
												Static170.aClass123_284 = null;
												return true;
											}
											@Pc(5713) Class167 local5713 = new Class167();
											local5713.anInt5096 = local254;
											local5713.anInt5094 = Static455.aClass3_Sub26_Sub1_2.method6814();
											if (local5713.anInt5094 >= 0 && local5713.anInt5094 < Static308.aClass73Array8.length) {
												if (local5713.anInt5096 == 1 || local5713.anInt5096 == 10) {
													local5713.anInt5098 = Static455.aClass3_Sub26_Sub1_2.method6811();
													Static455.aClass3_Sub26_Sub1_2.anInt8703 += 6;
												} else if (local5713.anInt5096 >= 2 && local5713.anInt5096 <= 6) {
													if (local5713.anInt5096 == 2) {
														local5713.anInt5101 = 256;
														local5713.anInt5104 = 256;
													}
													if (local5713.anInt5096 == 3) {
														local5713.anInt5101 = 256;
														local5713.anInt5104 = 0;
													}
													if (local5713.anInt5096 == 4) {
														local5713.anInt5101 = 256;
														local5713.anInt5104 = 512;
													}
													if (local5713.anInt5096 == 5) {
														local5713.anInt5101 = 0;
														local5713.anInt5104 = 256;
													}
													if (local5713.anInt5096 == 6) {
														local5713.anInt5104 = 256;
														local5713.anInt5101 = 512;
													}
													local5713.anInt5096 = 2;
													local5713.anInt5099 = Static455.aClass3_Sub26_Sub1_2.method6814();
													local5713.anInt5104 += Static455.aClass3_Sub26_Sub1_2.method6811() - Static321.anInt5874 << 9;
													local5713.anInt5101 += Static455.aClass3_Sub26_Sub1_2.method6811() - Static137.anInt3293 << 9;
													local5713.anInt5102 = Static455.aClass3_Sub26_Sub1_2.method6814() << 2;
													local5713.anInt5097 = Static455.aClass3_Sub26_Sub1_2.method6811();
												}
												local5713.anInt5100 = Static455.aClass3_Sub26_Sub1_2.method6811();
												if (local5713.anInt5100 == 65535) {
													local5713.anInt5100 = -1;
												}
												Static98.aClass167Array1[local248] = local5713;
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static400.aClass123_232) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6816();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6812();
											Static206.aClass143_3.method3695(local248, local73);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static470.aClass123_268) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6822();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6814();
											if (Static205.method3536(local248)) {
												Static239.method3809(local254, local73);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static101.aClass123_85 == Static170.aClass123_284) {
											Static564.method7681();
											Static170.aClass123_284 = null;
											return false;
										} else if (Static593.aClass123_327 == Static170.aClass123_284) {
											Static120.method2331(Static188.aClass364_12);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static566.aClass123_312) {
											for (local73 = 0; local73 < Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1.length; local73++) {
												if (Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local73] != null) {
													Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local73].anIntArray508 = null;
													Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local73].anInt8545 = -1;
												}
											}
											for (local248 = 0; local248 < Static238.anInt4737; local248++) {
												Static33.aClass3_Sub39Array1[local248].aClass25_Sub2_Sub2_Sub5_Sub2_2.anIntArray508 = null;
												Static33.aClass3_Sub39Array1[local248].aClass25_Sub2_Sub2_Sub5_Sub2_2.anInt8545 = -1;
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static79.aClass123_59 == Static170.aClass123_284) {
											local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
											local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local456 = local422;
											if (local448) {
												local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
											}
											local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local3271 = false;
											if (local259 <= 1) {
												if (Static402.aBoolean498 && !Static226.aBoolean296 || Static416.aBoolean520) {
													local3271 = true;
												} else if (local259 <= 1 && Static121.method2333(local456)) {
													local3271 = true;
												}
											}
											if (!local3271 && Static354.anInt6317 == 0) {
												local466 = Static554.method7609(Static35.method508(Static455.aClass3_Sub26_Sub1_2));
												if (local259 == 2) {
													Static12.method111("<img=1>" + local422, null, local466, 0, -1, local422, "<img=1>" + local456, 24);
												} else if (local259 == 1) {
													Static12.method111("<img=0>" + local422, null, local466, 0, -1, local422, "<img=0>" + local456, 24);
												} else {
													Static12.method111(local422, null, local466, 0, -1, local422, local456, 24);
												}
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static525.aClass123_287 == Static170.aClass123_284) {
											Static96.anInt2367 = Static455.aClass3_Sub26_Sub1_2.method6819();
											Static392.anInt6961 = Static455.aClass3_Sub26_Sub1_2.method6821();
											Static170.aClass123_284 = null;
											return true;
										} else if (Static341.aClass123_202 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6774();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6812();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
											if (Static205.method3536(local73)) {
												Static39.method1073(local259 + (local254 << 16), local248);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static452.aClass123_262) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											if (local73 == 65535) {
												local73 = -1;
											}
											local248 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6814();
											Static205.method3538(local259, 256, local254, local73, local248, true);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static132.aClass123_98 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6774();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local267 = Static455.aClass3_Sub26_Sub1_2.method6811();
											if (Static205.method3536(local73)) {
												Static537.method7345(local259, local254, local248, local267);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static178.aClass123_132 == Static170.aClass123_284) {
											Static120.method2331(Static151.aClass364_9);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static223.aClass123_150 == Static170.aClass123_284) {
											local416 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local456 = Static212.aClass294_3.method6455(local248).method3051(Static455.aClass3_Sub26_Sub1_2);
											Static12.method111(local416, null, local456, 0, local248, local416, local416, 19);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static332.aClass123_45 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
											local5230 = Static455.aClass3_Sub26_Sub1_2.method6825();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6777();
											if (Static205.method3536(local73)) {
												Static590.method8114(local5230, local254);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static149.aClass123_111 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6832();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6816();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6814();
											local4635 = "";
											local718 = local4635;
											if ((local254 & 0x1) != 0) {
												local4635 = Static455.aClass3_Sub26_Sub1_2.method6786();
												if ((local254 & 0x2) == 0) {
													local718 = local4635;
												} else {
													local718 = Static455.aClass3_Sub26_Sub1_2.method6786();
												}
											}
											local466 = Static455.aClass3_Sub26_Sub1_2.method6786();
											if (local73 == 99) {
												Static196.method3426(local466);
											} else if (local718.equals("") || !Static121.method2333(local718)) {
												Static295.method4425(local4635, local4635, local466, local248, local73, local718);
											} else {
												Static170.aClass123_284 = null;
												return true;
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static44.aClass123_326 == Static170.aClass123_284) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6822();
											local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
											if (Static205.method3536(local254)) {
												Static313.method4667(local422, local73);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static136.aClass123_105 == Static170.aClass123_284) {
											Static442.method6162();
											Static170.aClass123_284 = null;
											return true;
										} else if (Static277.aClass123_179 == Static170.aClass123_284) {
											local448 = Static455.aClass3_Sub26_Sub1_2.method6814() == 1;
											local422 = Static455.aClass3_Sub26_Sub1_2.method6786();
											local456 = local422;
											if (local448) {
												local456 = Static455.aClass3_Sub26_Sub1_2.method6786();
											}
											local2311 = Static455.aClass3_Sub26_Sub1_2.method6813();
											local2316 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local2321 = Static455.aClass3_Sub26_Sub1_2.method6830();
											local971 = Static455.aClass3_Sub26_Sub1_2.method6814();
											@Pc(6504) long local6504 = (local2316 << 32) + local2321;
											@Pc(6506) boolean local6506 = false;
											local1548 = 0;
											while (true) {
												if (local1548 >= 100) {
													if (local971 <= 1) {
														if (Static402.aBoolean498 && !Static226.aBoolean296 || Static416.aBoolean520) {
															local6506 = true;
														} else if (Static121.method2333(local456)) {
															local6506 = true;
														}
													}
													break;
												}
												if (Static340.aLongArray11[local1548] == local6504) {
													local6506 = true;
													break;
												}
												local1548++;
											}
											if (!local6506 && Static354.anInt6317 == 0) {
												Static340.aLongArray11[Static370.anInt6323] = local6504;
												Static370.anInt6323 = (Static370.anInt6323 + 1) % 100;
												@Pc(6571) String local6571 = Static554.method7609(Static35.method508(Static455.aClass3_Sub26_Sub1_2));
												if (local971 == 2 || local971 == 3) {
													Static12.method111("<img=1>" + local422, Static153.method2852(local2311), local6571, 0, -1, local422, "<img=1>" + local456, 9);
												} else if (local971 == 1) {
													Static12.method111("<img=0>" + local422, Static153.method2852(local2311), local6571, 0, -1, local422, "<img=0>" + local456, 9);
												} else {
													Static12.method111(local422, Static153.method2852(local2311), local6571, 0, -1, local422, local456, 9);
												}
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static219.aClass123_148 == Static170.aClass123_284) {
											Static554.method7603();
											Static170.aClass123_284 = null;
											return true;
										} else if (Static244.aClass123_160 == Static170.aClass123_284) {
											if (Static438.method3441(Static409.anInt1461)) {
												Static507.anInt8783 = (int) ((float) Static455.aClass3_Sub26_Sub1_2.method6811() * 2.5F);
											} else {
												Static507.anInt8783 = Static455.aClass3_Sub26_Sub1_2.method6811() * 30;
											}
											Static170.aClass123_284 = null;
											Static194.anInt4230 = Static523.anInt9188;
											return true;
										} else if (Static170.aClass123_284 == Static154.aClass123_115) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6816();
											if (Static205.method3536(local73)) {
												@Pc(6708) Class3_Sub49 local6708 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local248);
												if (local6708 != null) {
													Static46.method1171(true, false, local6708);
												}
												if (Static463.aClass251_12 != null) {
													Static588.method8016(Static463.aClass251_12);
													Static463.aClass251_12 = null;
												}
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static515.aClass123_283) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6783();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6774();
											Static206.aClass143_3.method3692(local73, local248);
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static403.aClass123_235) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6819();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6822();
											if (Static205.method3536(local248)) {
												Static378.anInt6559 = local73;
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static32.aClass123_103 == Static170.aClass123_284) {
											if (Static79.anInt2118 != -1) {
												Static51.method4569(0, Static79.anInt2118);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static489.aClass123_291) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6781();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6801();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local259 = Static455.aClass3_Sub26_Sub1_2.method6790();
											if (Static205.method3536(local254)) {
												Static381.method5311(local73, local259, local248);
											}
											Static170.aClass123_284 = null;
											return true;
										} else if (Static170.aClass123_284 == Static267.aClass123_173) {
											local73 = Static455.aClass3_Sub26_Sub1_2.method6811();
											local248 = Static455.aClass3_Sub26_Sub1_2.method6821();
											local254 = Static455.aClass3_Sub26_Sub1_2.method6783();
											if (Static205.method3536(local254)) {
												if (local248 == 2) {
													Static346.method5018();
												}
												Static79.anInt2118 = local73;
												Static336.method4909(local73);
												Static542.method7422(false);
												Static583.method7926(Static79.anInt2118);
												for (local259 = 0; local259 < 100; local259++) {
													Static544.aBooleanArray32[local259] = true;
												}
											}
											Static170.aClass123_284 = null;
											return true;
										} else {
											Static332.method1390(null, "T1 - " + (Static170.aClass123_284 == null ? -1 : Static170.aClass123_284.method3400()) + "," + (Static83.aClass123_63 == null ? -1 : Static83.aClass123_63.method3400()) + "," + (Static269.aClass123_174 == null ? -1 : Static269.aClass123_174.method3400()) + " - " + Static42.anInt1159);
											Static218.method6807(false);
											return true;
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

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!dh;I)I")
	public static int method7515(@OriginalArg(0) Class3_Sub13 arg0) {
		@Pc(12) String local12 = Static585.method7963(arg0);
		@Pc(14) int[] local14 = null;
		if (Static549.method7512(arg0.anInt2364)) {
			local14 = Static272.aClass121_2.method3327((int) arg0.aLong42).anIntArray199;
		} else if (arg0.anInt2365 != -1) {
			local14 = Static272.aClass121_2.method3327(arg0.anInt2365).anIntArray199;
		} else if (Static55.method6551(arg0.anInt2364)) {
			@Pc(38) Class3_Sub39 local38 = (Class3_Sub39) Static581.aClass297_39.method6531((long) arg0.aLong42);
			if (local38 != null) {
				@Pc(43) Class25_Sub2_Sub2_Sub5_Sub2 local43 = local38.aClass25_Sub2_Sub2_Sub5_Sub2_2;
				@Pc(46) Class213 local46 = local43.aClass213_1;
				if (local46.anIntArray345 != null) {
					local46 = local46.method4998(Static206.aClass143_3);
				}
				if (local46 != null) {
					local14 = local46.anIntArray347;
				}
			}
		} else if (Static343.method5003(arg0.anInt2364)) {
			@Pc(82) Class194 local82;
			if (arg0.anInt2364 == 1002) {
				local82 = Static536.aClass146_4.method3721((int) arg0.aLong42);
			} else {
				local82 = Static536.aClass146_4.method3721((int) (arg0.aLong42 >>> 32 & 0x7FFFFFFFL));
			}
			if (local82.anIntArray286 != null) {
				local82 = local82.method4696(Static206.aClass143_3);
			}
			if (local82 != null) {
				local14 = local82.anIntArray284;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static291.method4365(local14);
		}
		@Pc(139) int local139 = Static35.aClass328_1.method7376(Static147.aClass73Array5, local12);
		if (arg0.aBoolean172) {
			local139 += Static34.aClass73_9.E() + 4;
		}
		return local139;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method7517() {
		for (@Pc(10) Class25_Sub3 local10 = (Class25_Sub3) Static213.aClass269_2.method5978(); local10 != null; local10 = (Class25_Sub3) Static213.aClass269_2.method5978()) {
			Static401.method5673(local10);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122)) {
			local35 = 3;
			local36 = 0;
		} else {
			local35 = Static286.anInt5361;
			local36 = Static286.anInt5361;
		}
		Static70.method1710();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static70.method1709();
			Static70.method1713(local45);
			Static70.method1714(local45);
		}
		Static70.method1718();
		Static70.method1712();
	}
}
