import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z", line = 18)
	public static boolean method1823() throws IOException {
		if (Static312.aClass111_4 == null) {
			return false;
		}
		@Pc(15) int local15 = Static312.aClass111_4.method2797();
		if (local15 == 0) {
			return false;
		}
		@Pc(74) int local74;
		if (Class12_Sub4.aClass89_164 == null) {
			if (Class54.aBoolean129) {
				local15--;
				Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 1, 0);
				Static278.anInt5685++;
				Class54.aBoolean129 = false;
			}
			Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
			if (Class150.aClass2_Sub4_Sub2_3.method4871()) {
				if (local15 == 0) {
					return false;
				}
				Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 1, 1);
				local15--;
				Static278.anInt5685++;
			}
			Class54.aBoolean129 = true;
			@Pc(70) Class89[] local70 = Static156.method3189();
			local74 = Class150.aClass2_Sub4_Sub2_3.method4865();
			if (local74 < 0 || local70.length <= local74) {
				throw new IOException("invo:" + local74);
			}
			Class12_Sub4.aClass89_164 = local70[local74];
			Class61.anInt1834 = Class12_Sub4.aClass89_164.anInt2402;
		}
		if (Class61.anInt1834 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 1, 0);
			Static278.anInt5685++;
			Class61.anInt1834 = Class150.aClass2_Sub4_Sub2_3.aByteArray73[0] & 0xFF;
			local15--;
		}
		if (Class61.anInt1834 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, 2, 0);
			Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
			local15 -= 2;
			Class61.anInt1834 = Class150.aClass2_Sub4_Sub2_3.method4830();
			Static278.anInt5685 += 2;
		}
		if (Class61.anInt1834 > local15) {
			return false;
		}
		Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
		Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, Class61.anInt1834, 0);
		Class2_Sub3_Sub24.anInt4945 = 0;
		Static37.aClass89_35 = Static62.aClass89_57;
		Static278.anInt5685 += Class61.anInt1834;
		Static62.aClass89_57 = Static311.aClass89_222;
		Static311.aClass89_222 = Class12_Sub4.aClass89_164;
		if (Class2_Sub3_Sub29.aClass89_202 == Class12_Sub4.aClass89_164) {
			Static218.method3340(Static305.aClass152_5, Class61.anInt1834, Class150.aClass2_Sub4_Sub2_3);
			Class12_Sub4.aClass89_164 = null;
			return true;
		} else if (Class12_Sub4.aClass89_164 == Class243.aClass89_246) {
			Static199.aClass226_1.method5782();
			Class12_Sub4.aClass89_164 = null;
			Class9.anInt269 += 32;
			return true;
		} else {
			@Pc(228) int local228;
			@Pc(249) int local249;
			@Pc(220) int local220;
			if (Class12_Sub4.aClass89_164 == Class2_Sub35.aClass89_214) {
				local220 = Class150.aClass2_Sub4_Sub2_3.method4816();
				local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
				local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
				if (Static352.method6315(local228)) {
					if (local220 == 2) {
						Static84.method5954();
					}
					Class97.anInt2592 = local74;
					Static150.method2958(local74);
					Static56.method891(false);
					Static185.method3599(Class97.anInt2592);
					for (local249 = 0; local249 < 100; local249++) {
						Class2_Sub3_Sub10_Sub1.aBooleanArray59[local249] = true;
					}
				}
				Class12_Sub4.aClass89_164 = null;
				return true;
			}
			@Pc(272) byte local272;
			if (Class12_Sub4.aClass89_164 == Class55.aClass89_58) {
				local272 = Class150.aClass2_Sub4_Sub2_3.method4855();
				local74 = Class150.aClass2_Sub4_Sub2_3.method4807();
				local228 = Class150.aClass2_Sub4_Sub2_3.method4854();
				if (Static352.method6315(local74)) {
					Static299.method5482(local228, local272);
				}
				Class12_Sub4.aClass89_164 = null;
				return true;
			} else if (Class157.aClass89_161 == Class12_Sub4.aClass89_164) {
				local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
				if (Static352.method6315(local220)) {
					Static110.method2371();
				}
				Class12_Sub4.aClass89_164 = null;
				return true;
			} else {
				@Pc(344) Class2_Sub7 local344;
				if (Class12_Sub4.aClass89_164 == Class199.aClass89_200) {
					local220 = Class150.aClass2_Sub4_Sub2_3.method4836();
					local74 = Class150.aClass2_Sub4_Sub2_3.method4836();
					local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
					if (Static352.method6315(local228)) {
						@Pc(335) Class2_Sub7 local335 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local220);
						local344 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local74);
						if (local344 != null) {
							Static253.method4656(false, local344, local335 == null || local344.anInt1368 != local335.anInt1368);
						}
						if (local335 != null) {
							local335.method6469();
							Class2_Sub3_Sub34.aClass4_130.method87(local335, (long) local74);
						}
						@Pc(375) Class161 local375 = Static6.method140(local220);
						if (local375 != null) {
							Static187.method3646(local375);
						}
						local375 = Static6.method140(local74);
						if (local375 != null) {
							Static187.method3646(local375);
							Static81.method1913(true, local375);
						}
						if (Class97.anInt2592 != -1) {
							Static366.method6461(Class97.anInt2592, 1);
						}
					}
					Class12_Sub4.aClass89_164 = null;
					return true;
				} else if (Class46.aClass89_49 == Class12_Sub4.aClass89_164) {
					if (Class97.anInt2592 != -1) {
						Static366.method6461(Class97.anInt2592, 0);
					}
					Class12_Sub4.aClass89_164 = null;
					return true;
				} else if (Class12_Sub4.aClass89_164 == Class20.aClass89_22) {
					local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
					if (Static352.method6315(local220)) {
						Static326.method5860();
					}
					Class12_Sub4.aClass89_164 = null;
					return true;
				} else {
					@Pc(452) String local452;
					@Pc(444) String local444;
					if (Class28.aClass89_27 == Class12_Sub4.aClass89_164) {
						local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
						local452 = Static144.method2774(Static285.method5277(Class150.aClass2_Sub4_Sub2_3));
						Static32.method4201(local444, 0, local452, 6, local444);
						Class12_Sub4.aClass89_164 = null;
						return true;
					}
					@Pc(506) int local506;
					@Pc(512) int local512;
					@Pc(536) int local536;
					@Pc(542) int local542;
					@Pc(638) int local638;
					@Pc(497) int local497;
					@Pc(604) boolean local604;
					if (Class2_Sub3_Sub25.aClass89_186 == Class12_Sub4.aClass89_164) {
						local220 = Class150.aClass2_Sub4_Sub2_3.method4807();
						local74 = Class150.aClass2_Sub4_Sub2_3.method4807();
						local228 = Class150.aClass2_Sub4_Sub2_3.method4837();
						local249 = Class150.aClass2_Sub4_Sub2_3.method4804();
						if (local228 >> 30 == 0) {
							@Pc(621) Class91 local621;
							@Pc(692) Class157 local692;
							@Pc(684) Class157 local684;
							@Pc(667) Class91 local667;
							@Pc(635) Class157 local635;
							if (local228 >> 29 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(790) Class11_Sub5_Sub2_Sub2 local790 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local497];
								if (local790 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local790.anInt4586 != -1) {
										if (local790.anInt4586 == local220) {
											local621 = Static299.aClass211_2.method5408(local220);
											if (local621.aBoolean177 && local621.anInt2445 != -1) {
												local635 = Static37.aClass85_1.method2373(local621.anInt2445);
												local638 = local635.anInt4017;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static299.aClass211_2.method5408(local220);
											local667 = Static299.aClass211_2.method5408(local790.anInt4586);
											if (local621.anInt2445 != -1 && local667.anInt2445 != -1) {
												local684 = Static37.aClass85_1.method2373(local621.anInt2445);
												local692 = Static37.aClass85_1.method2373(local667.anInt2445);
												if (local692.anInt4018 > local684.anInt4018) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local790.anInt4586 = local220;
										local790.anInt4611 = 0;
										local790.anInt4574 = 0;
										local790.anInt4587 = local74 + Class83.anInt2345;
										local790.anInt4630 = local249;
										local790.anInt4603 = 1;
										if (Class83.anInt2345 < local790.anInt4587) {
											local790.anInt4574 = -1;
										}
										if (local790.anInt4586 != -1 && local790.anInt4587 == Class83.anInt2345) {
											local536 = Static299.aClass211_2.method5408(local790.anInt4586).anInt2445;
											if (local536 != -1) {
												local635 = Static37.aClass85_1.method2373(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, false, local790.aByte78, local790.anInt6768, local790.anInt6770, 0);
												}
											}
										}
									}
								}
							} else if (local228 >> 28 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(589) Class11_Sub5_Sub2_Sub1 local589;
								if (Class11_Sub3_Sub2.anInt4220 == local497) {
									local589 = Static17.aClass11_Sub5_Sub2_Sub1_3;
								} else {
									local589 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local497];
								}
								if (local589 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local589.anInt4586 != -1) {
										if (local220 == local589.anInt4586) {
											local621 = Static299.aClass211_2.method5408(local220);
											if (local621.aBoolean177 && local621.anInt2445 != -1) {
												local635 = Static37.aClass85_1.method2373(local621.anInt2445);
												local638 = local635.anInt4017;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static299.aClass211_2.method5408(local220);
											local667 = Static299.aClass211_2.method5408(local589.anInt4586);
											if (local621.anInt2445 != -1 && local667.anInt2445 != -1) {
												local684 = Static37.aClass85_1.method2373(local621.anInt2445);
												local692 = Static37.aClass85_1.method2373(local667.anInt2445);
												if (local692.anInt4018 > local684.anInt4018) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local589.anInt4611 = 0;
										local589.anInt4574 = 0;
										local589.anInt4603 = 1;
										local589.anInt4630 = local249;
										local589.anInt4586 = local220;
										local589.anInt4587 = local74 + Class83.anInt2345;
										if (local589.anInt4586 == 65535) {
											local589.anInt4586 = -1;
										}
										if (Class83.anInt2345 < local589.anInt4587) {
											local589.anInt4574 = -1;
										}
										if (local589.anInt4586 != -1 && Class83.anInt2345 == local589.anInt4587) {
											local536 = Static299.aClass211_2.method5408(local589.anInt4586).anInt2445;
											if (local536 != -1) {
												local635 = Static37.aClass85_1.method2373(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, Static17.aClass11_Sub5_Sub2_Sub1_3 == local589, local589.aByte78, local589.anInt6768, local589.anInt6770, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local497 = local228 >> 28 & 0x3;
							local506 = (local228 >> 14 & 0x3FFF) - Static154.anInt3136;
							local512 = (local228 & 0x3FFF) - Static139.anInt2716;
							if (local506 >= 0 && local512 >= 0 && Class241.anInt7020 > local506 && OutputStream_Sub1.anInt4442 > local512) {
								local536 = local506 * 128 + 64;
								local542 = local512 * 128 + 64;
								@Pc(563) Class11_Sub5_Sub4 local563 = new Class11_Sub5_Sub4(local220, 0, Class83.anInt2345, local497, local536, Static360.method6033(local536, local542, local497) - local249, local542, local506, local506, local512, local512);
								Class92.aClass135_20.method3541(new Class2_Sub2_Sub1(local563));
							}
						}
						Class12_Sub4.aClass89_164 = null;
						return true;
					} else if (Class206.aClass89_204 == Class12_Sub4.aClass89_164) {
						local220 = Class150.aClass2_Sub4_Sub2_3.method4854();
						local74 = Class150.aClass2_Sub4_Sub2_3.method4853();
						local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
						if (Static352.method6315(local228)) {
							Static7.method6470(local220, local74);
						}
						Class12_Sub4.aClass89_164 = null;
						return true;
					} else if (Class87.aClass89_95 == Class12_Sub4.aClass89_164) {
						local220 = Class150.aClass2_Sub4_Sub2_3.method4807();
						local74 = Class150.aClass2_Sub4_Sub2_3.method4805();
						if (Static352.method6315(local220)) {
							Class83.anInt2341 = local74;
						}
						Class12_Sub4.aClass89_164 = null;
						return true;
					} else if (Class12_Sub4.aClass89_164 == Class108.aClass89_119) {
						Static336.method6055(Class150.aClass2_Sub4_Sub2_3, Class61.anInt1834);
						Class12_Sub4.aClass89_164 = null;
						return true;
					} else {
						@Pc(1101) long local1101;
						@Pc(1118) Class2_Sub10 local1118;
						@Pc(1109) Class2_Sub10 local1109;
						if (Class12_Sub4.aClass89_164 == Class2_Sub43.aClass89_253) {
							local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
							if (local220 == 65535) {
								local220 = -1;
							}
							local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
							local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
							if (local228 == 65535) {
								local228 = -1;
							}
							local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
							local497 = Class150.aClass2_Sub4_Sub2_3.method4853();
							if (Static352.method6315(local249)) {
								for (local506 = local220; local506 <= local228; local506++) {
									local1101 = (long) local506 + ((long) local497 << 32);
									local1109 = (Class2_Sub10) Class219.aClass4_127.method90(local1101);
									if (local1109 != null) {
										local1118 = new Class2_Sub10(local1109.anInt1756, local74);
										local1109.method6469();
									} else if (local506 == -1) {
										local1118 = new Class2_Sub10(Static6.method140(local497).aClass2_Sub10_1.anInt1756, local74);
									} else {
										local1118 = new Class2_Sub10(0, local74);
									}
									Class219.aClass4_127.method87(local1118, local1101);
								}
							}
							Class12_Sub4.aClass89_164 = null;
							return true;
						} else if (Class12_Sub4.aClass89_164 == Class173_Sub4.aClass89_243) {
							local220 = Class150.aClass2_Sub4_Sub2_3.method4845();
							local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
							if (Static352.method6315(local74)) {
								Static177.method3502(-1, -1, 3, local220);
							}
							Class12_Sub4.aClass89_164 = null;
							return true;
						} else if (Class72.aClass89_84 == Class12_Sub4.aClass89_164) {
							local220 = Class150.aClass2_Sub4_Sub2_3.method4807();
							local74 = Class150.aClass2_Sub4_Sub2_3.method4812();
							local228 = Class150.aClass2_Sub4_Sub2_3.method4845();
							local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
							if (Static352.method6315(local220)) {
								local344 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local228);
								if (local344 != null) {
									Static253.method4656(false, local344, local249 != local344.anInt1368);
								}
								Static356.method6366(local228, local74, false, local249);
							}
							Class12_Sub4.aClass89_164 = null;
							return true;
						} else if (Class19.aClass89_120 == Class12_Sub4.aClass89_164) {
							local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
							local74 = Class150.aClass2_Sub4_Sub2_3.method4805();
							local228 = Class150.aClass2_Sub4_Sub2_3.method4812();
							Class2_Sub3_Sub10.anIntArray464[local74] = local220;
							Class2_Sub3_Sub24.anIntArray338[local74] = local228;
							Class218.anIntArray414[local74] = 1;
							local249 = Class192.anIntArray369[local74] - 1;
							for (local497 = 0; local497 < local249; local497++) {
								if (local220 >= Class12_Sub1_Sub1.anIntArray292[local497]) {
									Class218.anIntArray414[local74] = local497 + 2;
								}
							}
							Class146.anIntArray226[Class90_Sub1.anInt7104++ & 0x1F] = local74;
							Class12_Sub4.aClass89_164 = null;
							return true;
						} else if (Class12_Sub4.aClass89_164 == Class108.aClass89_118) {
							local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
							local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
							local228 = Class150.aClass2_Sub4_Sub2_3.method4816();
							local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
							local497 = Class150.aClass2_Sub4_Sub2_3.method4816();
							local506 = Class150.aClass2_Sub4_Sub2_3.method4816();
							if (Static352.method6315(local220)) {
								Static48.method1547(local228, local497, local506, true, local249, local74);
							}
							Class12_Sub4.aClass89_164 = null;
							return true;
						} else {
							@Pc(1371) boolean local1371;
							@Pc(1381) String local1381;
							@Pc(1627) String local1627;
							@Pc(1391) String local1391;
							@Pc(1663) String local1663;
							if (Class62.aClass89_69 == Class12_Sub4.aClass89_164) {
								while (Class150.aClass2_Sub4_Sub2_3.anInt5289 < Class61.anInt1834) {
									local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
									local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
									local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
									local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local497 = Class150.aClass2_Sub4_Sub2_3.method4816();
									local1391 = "";
									local604 = false;
									if (local249 > 0) {
										local1391 = Class150.aClass2_Sub4_Sub2_3.method4810();
										local604 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
									}
									for (local536 = 0; local536 < Class2_Sub43.anInt7165; local536++) {
										if (local1371) {
											if (local1381.equals(Class12_Sub1_Sub1.aStringArray43[local536])) {
												Class12_Sub1_Sub1.aStringArray43[local536] = local452;
												Class214.aStringArray54[local536] = local1381;
												local452 = null;
												break;
											}
										} else if (local452.equals(Class12_Sub1_Sub1.aStringArray43[local536])) {
											if (Class173_Sub2.anIntArray333[local536] != local249) {
												Class173_Sub2.anIntArray333[local536] = local249;
												if (local249 > 0) {
													Static32.method4201("", 0, local452 + Class2_Sub4_Sub2.aClass79_112.method2269(Class197.anInt5569), 5, "");
												}
												if (local249 == 0) {
													Static32.method4201("", 0, local452 + Class11_Sub5_Sub5.aClass79_140.method2269(Class197.anInt5569), 5, "");
												}
											}
											Class214.aStringArray54[local536] = local1381;
											Class147.aStringArray32[local536] = local1391;
											Class83.anIntArray148[local536] = local497;
											local452 = null;
											Class37.aBooleanArray13[local536] = local604;
											break;
										}
									}
									if (local452 != null && Class2_Sub43.anInt7165 < 200) {
										Class12_Sub1_Sub1.aStringArray43[Class2_Sub43.anInt7165] = local452;
										Class214.aStringArray54[Class2_Sub43.anInt7165] = local1381;
										Class173_Sub2.anIntArray333[Class2_Sub43.anInt7165] = local249;
										Class147.aStringArray32[Class2_Sub43.anInt7165] = local1391;
										Class83.anIntArray148[Class2_Sub43.anInt7165] = local497;
										Class37.aBooleanArray13[Class2_Sub43.anInt7165] = local604;
										Class2_Sub43.anInt7165++;
									}
								}
								Class123.anInt3359 = 2;
								Class11_Sub4.anInt3966 = Class65.anInt1874;
								local74 = Class2_Sub43.anInt7165;
								while (local74 > 0) {
									local1371 = true;
									local74--;
									for (local228 = 0; local228 < local74; local228++) {
										if (Class173_Sub2.anIntArray333[local228] != Class87.anInt2382 && Class87.anInt2382 == Class173_Sub2.anIntArray333[local228 + 1] || Class173_Sub2.anIntArray333[local228] == 0 && Class173_Sub2.anIntArray333[local228 + 1] != 0) {
											local249 = Class173_Sub2.anIntArray333[local228];
											Class173_Sub2.anIntArray333[local228] = Class173_Sub2.anIntArray333[local228 + 1];
											Class173_Sub2.anIntArray333[local228 + 1] = local249;
											local1627 = Class147.aStringArray32[local228];
											Class147.aStringArray32[local228] = Class147.aStringArray32[local228 + 1];
											Class147.aStringArray32[local228 + 1] = local1627;
											local1391 = Class12_Sub1_Sub1.aStringArray43[local228];
											Class12_Sub1_Sub1.aStringArray43[local228] = Class12_Sub1_Sub1.aStringArray43[local228 + 1];
											Class12_Sub1_Sub1.aStringArray43[local228 + 1] = local1391;
											local1663 = Class214.aStringArray54[local228];
											Class214.aStringArray54[local228] = Class214.aStringArray54[local228 + 1];
											Class214.aStringArray54[local228 + 1] = local1663;
											local536 = Class83.anIntArray148[local228];
											Class83.anIntArray148[local228] = Class83.anIntArray148[local228 + 1];
											Class83.anIntArray148[local228 + 1] = local536;
											@Pc(1699) boolean local1699 = Class37.aBooleanArray13[local228];
											Class37.aBooleanArray13[local228] = Class37.aBooleanArray13[local228 + 1];
											local1371 = false;
											Class37.aBooleanArray13[local228 + 1] = local1699;
										}
									}
									if (local1371) {
										break;
									}
								}
								Class12_Sub4.aClass89_164 = null;
								return true;
							} else if (Class12_Sub4.aClass89_164 == Class148.aClass89_156) {
								Class2_Sub3_Sub6.anInt1047 = Class150.aClass2_Sub4_Sub2_3.method4824();
								Class69.anInt1948 = Class65.anInt1874;
								Class12_Sub4.aClass89_164 = null;
								return true;
							} else {
								@Pc(1780) long local1780;
								@Pc(1785) long local1785;
								if (Class12_Sub4.aClass89_164 == Class154.aClass89_158) {
									local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
									local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
									local1381 = local452;
									if (local1371) {
										local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
									}
									local1780 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local1785 = Class150.aClass2_Sub4_Sub2_3.method4834();
									local536 = Class150.aClass2_Sub4_Sub2_3.method4816();
									@Pc(1796) long local1796 = (local1780 << 32) + local1785;
									@Pc(1798) boolean local1798 = false;
									@Pc(1800) int local1800 = 0;
									while (true) {
										if (local1800 >= 100) {
											if (local536 <= 1) {
												if (Class43.aBoolean123 && !Class73.aBoolean159 || Class78_Sub1.aBoolean166) {
													local1798 = true;
												} else if (Static98.method2210(local1381)) {
													local1798 = true;
												}
											}
											break;
										}
										if (local1796 == Class130.aLongArray11[local1800]) {
											local1798 = true;
											break;
										}
										local1800++;
									}
									if (!local1798 && Class150.anInt3781 == 0) {
										Class130.aLongArray11[Class134.anInt3551] = local1796;
										Class134.anInt3551 = (Class134.anInt3551 + 1) % 100;
										@Pc(1866) String local1866 = Static144.method2774(Static285.method5277(Class150.aClass2_Sub4_Sub2_3));
										if (local536 == 2) {
											Static205.method3875(0, null, local1866, -1, 7, "<img=1>" + local1381, "<img=1>" + local452);
										} else if (local536 == 1) {
											Static205.method3875(0, null, local1866, -1, 7, "<img=0>" + local1381, "<img=0>" + local452);
										} else {
											Static205.method3875(0, null, local1866, -1, 3, local1381, local452);
										}
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class2_Sub11.aClass89_63) {
									local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local1381 = Static137.method2701(local74).method5603(Class150.aClass2_Sub4_Sub2_3);
									Static205.method3875(0, null, local1381, local74, 19, local444, local444);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class2_Sub3_Sub3.aClass89_12) {
									Static92.method2146();
									Class12_Sub4.aClass89_164 = null;
									return false;
								} else if (Class12_Sub4.aClass89_164 == Class2_Sub2_Sub11.aClass89_136) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4854();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4845();
									Static199.aClass226_1.method5786(local74, local220);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class240.aClass89_245) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4816();
									local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local497 = Class150.aClass2_Sub4_Sub2_3.method4816();
									local506 = Class150.aClass2_Sub4_Sub2_3.method4816();
									if (Static352.method6315(local220)) {
										Static32.method4204(local497, local249, local228, local506, local74);
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class2_Sub3_Sub12.aClass89_88 == Class12_Sub4.aClass89_164) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4805();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4812();
									if (local220 == 255) {
										local74 = -1;
										local220 = -1;
									}
									Static260.method4876(local220, local74);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class3.aClass89_6) {
									Static307.method5657(Class221.aClass210_16);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class2_Sub3_Sub1.aClass89_9 == Class12_Sub4.aClass89_164) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4854();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4845();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4812();
									if (Static352.method6315(local220)) {
										Static17.method4209(local74, local228);
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class11_Sub1.aClass89_144 == Class12_Sub4.aClass89_164) {
									for (local220 = 0; local220 < Class9.aClass11_Sub5_Sub2_Sub1Array1.length; local220++) {
										if (Class9.aClass11_Sub5_Sub2_Sub1Array1[local220] != null) {
											Class9.aClass11_Sub5_Sub2_Sub1Array1[local220].anInt4589 = -1;
										}
									}
									for (local74 = 0; local74 < Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1.length; local74++) {
										if (Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local74] != null) {
											Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local74].anInt4589 = -1;
										}
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class99.aClass89_110 == Class12_Sub4.aClass89_164) {
									Class2_Sub2_Sub9.anInt2770 = Class150.aClass2_Sub4_Sub2_3.method4830() * 30;
									Class12_Sub4.aClass89_164 = null;
									Class69.anInt1948 = Class65.anInt1874;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class2_Sub3_Sub24.aClass89_180) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
									if (local220 == 65535) {
										local220 = -1;
									}
									local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local249 = Class150.aClass2_Sub4_Sub2_3.method4816();
									Static28.method939(local74, local249, local228, local220);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class49.aClass89_224 == Class12_Sub4.aClass89_164) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
									if (Static352.method6315(local74)) {
										Static113.method2385(local228, local220);
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class41.aClass89_46) {
									Static307.method5657(Class242.aClass210_15);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class224.aClass89_227 == Class12_Sub4.aClass89_164) {
									Static307.method5657(Class11_Sub5_Sub5.aClass210_13);
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class12_Sub4.aClass89_164 == Class49.aClass89_223) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4854();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4853();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
									local249 = Class150.aClass2_Sub4_Sub2_3.method4854();
									if (Static352.method6315(local228)) {
										Static350.method6283(local220 + (local249 << 16), local74);
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else if (Class39.aClass89_43 == Class12_Sub4.aClass89_164) {
									local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
									local74 = Class150.aClass2_Sub4_Sub2_3.method4853();
									local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
									local249 = Class150.aClass2_Sub4_Sub2_3.method4804();
									if (Static352.method6315(local228)) {
										Static177.method3502(local249, local74, 5, local220);
									}
									Class12_Sub4.aClass89_164 = null;
									return true;
								} else {
									@Pc(2522) Class214 local2522;
									if (Class12_Sub4.aClass89_164 == Class61.aClass89_67) {
										Class191.anInt5358 = Class65.anInt1874;
										if (Class61.anInt1834 == 0) {
											Class177.aString53 = null;
											Static174.anInt3726 = 0;
											Class12_Sub3.aString25 = null;
											Class12_Sub4.aClass89_164 = null;
											Static44.aClass214Array1 = null;
											return true;
										}
										Class12_Sub3.aString25 = Class150.aClass2_Sub4_Sub2_3.method4810();
										local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
										if (local1371) {
											Class150.aClass2_Sub4_Sub2_3.method4810();
										}
										@Pc(2364) long local2364 = Class150.aClass2_Sub4_Sub2_3.method4799();
										Class177.aString53 = Static189.method3677(local2364);
										Static244.aByte54 = Class150.aClass2_Sub4_Sub2_3.method4826();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4816();
										if (local249 == 255) {
											Class12_Sub4.aClass89_164 = null;
											return true;
										}
										Static174.anInt3726 = local249;
										@Pc(2392) Class214[] local2392 = new Class214[100];
										for (local506 = 0; local506 < Static174.anInt3726; local506++) {
											local2392[local506] = new Class214();
											local2392[local506].aString58 = Class150.aClass2_Sub4_Sub2_3.method4810();
											local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
											if (local1371) {
												local2392[local506].aString60 = Class150.aClass2_Sub4_Sub2_3.method4810();
											} else {
												local2392[local506].aString60 = local2392[local506].aString58;
											}
											local2392[local506].aString59 = Static126.method2539(local2392[local506].aString60);
											local2392[local506].anInt5966 = Class150.aClass2_Sub4_Sub2_3.method4830();
											local2392[local506].aByte65 = Class150.aClass2_Sub4_Sub2_3.method4826();
											local2392[local506].aString61 = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (local2392[local506].aString60.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
												Static112.aByte25 = local2392[local506].aByte65;
											}
										}
										local542 = Static174.anInt3726;
										while (local542 > 0) {
											local542--;
											local604 = true;
											for (local638 = 0; local638 < local542; local638++) {
												if (local2392[local638].aString59.compareTo(local2392[local638 + 1].aString59) > 0) {
													local2522 = local2392[local638];
													local2392[local638] = local2392[local638 + 1];
													local2392[local638 + 1] = local2522;
													local604 = false;
												}
											}
											if (local604) {
												break;
											}
										}
										Static44.aClass214Array1 = local2392;
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class2_Sub3_Sub39.aClass89_258) {
										Class150.aClass2_Sub4_Sub2_3.anInt5289 += 28;
										if (Class150.aClass2_Sub4_Sub2_3.method4809()) {
											Static271.method5066(Class150.aClass2_Sub4_Sub2_3, Class150.aClass2_Sub4_Sub2_3.anInt5289 - 28);
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class2_Sub44.aClass89_255 == Class12_Sub4.aClass89_164) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4816();
										if (Class150.aClass2_Sub4_Sub2_3.method4816() == 0) {
											Class194.aClass187Array1[local220] = new Class187();
										} else {
											Class150.aClass2_Sub4_Sub2_3.anInt5289--;
											Class194.aClass187Array1[local220] = new Class187(Class150.aClass2_Sub4_Sub2_3);
										}
										Class12_Sub4.aClass89_164 = null;
										Class123_Sub1.anInt3377 = Class65.anInt1874;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class2_Sub20.aClass89_123) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
										if (Static352.method6315(local220) && Static25.aClass161ArrayArray1[local74] != null) {
											for (local497 = local228; local497 < local249; local497++) {
												local506 = Class150.aClass2_Sub4_Sub2_3.method4834();
												if (local497 < Static25.aClass161ArrayArray1[local74].length && Static25.aClass161ArrayArray1[local74][local497] != null) {
													Static25.aClass161ArrayArray1[local74][local497].anInt4240 = local506;
												}
											}
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class233.aClass89_230 == Class12_Sub4.aClass89_164) {
										Static307.method5657(Class2_Sub18.aClass210_7);
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class140.aClass89_150) {
										Static307.method5657(Class191.aClass210_11);
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class66.aClass89_74 == Class12_Sub4.aClass89_164) {
										Class103.anInt2700 = Class150.aClass2_Sub4_Sub2_3.method4816();
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class117.aClass89_134 == Class12_Sub4.aClass89_164) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
										local228 = Class150.aClass2_Sub4_Sub2_3.method4816();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4816();
										local497 = Class150.aClass2_Sub4_Sub2_3.method4816();
										local506 = Class150.aClass2_Sub4_Sub2_3.method4830();
										if (Static352.method6315(local220)) {
											Class132.aBooleanArray33[local74] = true;
											Class96.anIntArray164[local74] = local228;
											Class2_Sub3_Sub11.anIntArray134[local74] = local249;
											Class2_Sub2_Sub3.anIntArray87[local74] = local497;
											Class84.anIntArray149[local74] = local506;
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class61.aClass89_66) {
										if (Static338.aFrame2 != null) {
											Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
										}
										@Pc(2782) byte[] local2782 = new byte[Class61.anInt1834];
										Class150.aClass2_Sub4_Sub2_3.method4867(local2782, Class61.anInt1834);
										local452 = Static44.method1464(0, local2782, Class61.anInt1834);
										Static257.method4766(local452, Static305.aClass152_5, Class2_Sub10.anInt1760 == 1, true);
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class246.aClass89_248 == Class12_Sub4.aClass89_164) {
										Static307.method5657(Class58.aClass210_3);
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class123.aClass89_140 == Class12_Sub4.aClass89_164) {
										Static63.anInt1635 = Class150.aClass2_Sub4_Sub2_3.method4816();
										Static7.anInt7227 = Class150.aClass2_Sub4_Sub2_3.method4805();
										Static226.anInt4495 = Class150.aClass2_Sub4_Sub2_3.method4864();
										for (@Pc(2839) Class2_Sub32 local2839 = (Class2_Sub32) Class87.aClass4_49.method80(); local2839 != null; local2839 = (Class2_Sub32) Class87.aClass4_49.method79()) {
											local74 = (int) (local2839.aLong232 & 0x3FFFL);
											local228 = (int) (local2839.aLong232 >> 14 & 0x3FFFL);
											local249 = (int) (local2839.aLong232 >> 28 & 0x3L);
											if (Static226.anInt4495 == local249 && Static63.anInt1635 <= local74 && Static63.anInt1635 + 8 > local74 && local228 >= Static7.anInt7227 && local228 < Static7.anInt7227 + 8) {
												local2839.method6469();
												Static155.method3155(local74, Static226.anInt4495, local228);
											}
										}
										for (@Pc(2914) Class2_Sub37 local2914 = (Class2_Sub37) Class145.aClass135_26.method3552(); local2914 != null; local2914 = (Class2_Sub37) Class145.aClass135_26.method3553()) {
											if (local2914.anInt6472 >= Static63.anInt1635 && local2914.anInt6472 < Static63.anInt1635 + 8 && local2914.anInt6474 >= Static7.anInt7227 && local2914.anInt6474 < Static7.anInt7227 + 8 && Static226.anInt4495 == local2914.anInt6469) {
												local2914.anInt6473 = 0;
											}
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class2_Sub5.aClass89_34) {
										local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
										local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
										local1381 = local452;
										if (local1371) {
											local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
										}
										local1780 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local1785 = Class150.aClass2_Sub4_Sub2_3.method4834();
										local536 = Class150.aClass2_Sub4_Sub2_3.method4816();
										local542 = Class150.aClass2_Sub4_Sub2_3.method4830();
										@Pc(3014) long local3014 = local1785 + (local1780 << 32);
										@Pc(3016) boolean local3016 = false;
										@Pc(3018) int local3018 = 0;
										while (true) {
											if (local3018 >= 100) {
												if (local536 <= 1 && Static98.method2210(local1381)) {
													local3016 = true;
												}
												break;
											}
											if (local3014 == Class130.aLongArray11[local3018]) {
												local3016 = true;
												break;
											}
											local3018++;
										}
										if (!local3016 && Class150.anInt3781 == 0) {
											Class130.aLongArray11[Class134.anInt3551] = local3014;
											Class134.anInt3551 = (Class134.anInt3551 + 1) % 100;
											@Pc(3071) String local3071 = Static137.method2701(local542).method5603(Class150.aClass2_Sub4_Sub2_3);
											if (local536 == 2) {
												Static205.method3875(0, null, local3071, local542, 18, "<img=1>" + local1381, "<img=1>" + local452);
											} else if (local536 == 1) {
												Static205.method3875(0, null, local3071, local542, 18, "<img=0>" + local1381, "<img=0>" + local452);
											} else {
												Static205.method3875(0, null, local3071, local542, 18, local1381, local452);
											}
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class2_Sub2_Sub7.aClass89_91) {
										Static226.anInt4495 = Class150.aClass2_Sub4_Sub2_3.method4864();
										Static7.anInt7227 = Class150.aClass2_Sub4_Sub2_3.method4805();
										Static63.anInt1635 = Class150.aClass2_Sub4_Sub2_3.method4812();
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class165.aClass89_170 == Class12_Sub4.aClass89_164) {
										Class123.anInt3359 = 1;
										Class11_Sub4.anInt3966 = Class65.anInt1874;
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class101.aClass89_112 == Class12_Sub4.aClass89_164) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4853();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Class150.aClass2_Sub4_Sub2_3.method4836();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4807();
										if (local249 == 65535) {
											local249 = -1;
										}
										local497 = Class150.aClass2_Sub4_Sub2_3.method4804();
										if (Static352.method6315(local497)) {
											for (local506 = local74; local506 <= local249; local506++) {
												local1101 = ((long) local220 << 32) + ((long) local506);
												local1109 = (Class2_Sub10) Class219.aClass4_127.method90(local1101);
												if (local1109 != null) {
													local1118 = new Class2_Sub10(local228, local1109.anInt1757);
													local1109.method6469();
												} else if (local506 == -1) {
													local1118 = new Class2_Sub10(local228, Static6.method140(local220).aClass2_Sub10_1.anInt1757);
												} else {
													local1118 = new Class2_Sub10(local228, -1);
												}
												Class219.aClass4_127.method87(local1118, local1101);
											}
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class2_Sub3_Sub39.aClass89_259 == Class12_Sub4.aClass89_164) {
										Class2_Sub3_Sub30.anInt5688 = Class150.aClass2_Sub4_Sub2_3.method4816();
										for (local220 = 0; local220 < Class2_Sub3_Sub30.anInt5688; local220++) {
											Class2_Sub3_Sub22.aStringArray35[local220] = Class150.aClass2_Sub4_Sub2_3.method4810();
											Class11_Sub3_Sub2.aStringArray39[local220] = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (Class11_Sub3_Sub2.aStringArray39[local220].equals("")) {
												Class11_Sub3_Sub2.aStringArray39[local220] = Class2_Sub3_Sub22.aStringArray35[local220];
											}
											Class173_Sub4.aStringArray66[local220] = Class150.aClass2_Sub4_Sub2_3.method4810();
											Class2_Sub3_Sub20.aStringArray28[local220] = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (Class2_Sub3_Sub20.aStringArray28[local220].equals("")) {
												Class2_Sub3_Sub20.aStringArray28[local220] = Class173_Sub4.aStringArray66[local220];
											}
											Class119.aBooleanArray31[local220] = false;
										}
										Class12_Sub4.aClass89_164 = null;
										Class11_Sub4.anInt3966 = Class65.anInt1874;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class148.aClass89_155) {
										local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4807();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Class150.aClass2_Sub4_Sub2_3.method4812();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4812();
										if (local228 >= 1 && local228 <= 8) {
											if (local444.equalsIgnoreCase("null")) {
												local444 = null;
											}
											Class2_Sub2_Sub13.aStringArray44[local228 - 1] = local444;
											Class145.anIntArray225[local228 - 1] = local74;
											Class2_Sub6.aBooleanArray11[local228 - 1] = local249 == 0;
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class2_Sub17.aClass89_106 == Class12_Sub4.aClass89_164) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4807();
										local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
										if (Static352.method6315(local74)) {
											Static214.method4023(local220, local228);
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class65.aClass89_73 == Class12_Sub4.aClass89_164) {
										local220 = Class150.aClass2_Sub4_Sub2_3.method4854();
										local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = Class150.aClass2_Sub4_Sub2_3.method4836();
										local249 = Class150.aClass2_Sub4_Sub2_3.method4853();
										if (Static352.method6315(local220)) {
											Static201.method3775(local74, local249, local228);
											@Pc(3499) Class188 local3499 = Static290.aClass107_2.method2761(local74);
											Static254.method4681(local3499.anInt5205, local3499.anInt5235, local249, local3499.anInt5231);
											Static351.method6288(local249, local3499.anInt5238, local3499.anInt5241, local3499.anInt5222);
										}
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else if (Class12_Sub4.aClass89_164 == Class11_Sub3_Sub1.aClass89_72) {
										Static65.method1782(true);
										Class12_Sub4.aClass89_164 = null;
										return true;
									} else {
										@Pc(3551) boolean local3551;
										if (Class12_Sub4.aClass89_164 == Class236.aClass89_236) {
											local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
											local3551 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
											if (local3551) {
												local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
											} else {
												local452 = local444;
											}
											local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
											@Pc(3569) byte local3569 = Class150.aClass2_Sub4_Sub2_3.method4826();
											@Pc(3571) boolean local3571 = false;
											if (local3569 == -128) {
												local3571 = true;
											}
											if (local3571) {
												if (Static174.anInt3726 == 0) {
													Class12_Sub4.aClass89_164 = null;
													return true;
												}
												for (local512 = 0; local512 < Static174.anInt3726 && (!Static44.aClass214Array1[local512].aString60.equals(local452) || Static44.aClass214Array1[local512].anInt5966 != local249); local512++) {
												}
												if (local512 < Static174.anInt3726) {
													while (local512 < Static174.anInt3726 - 1) {
														Static44.aClass214Array1[local512] = Static44.aClass214Array1[local512 + 1];
														local512++;
													}
													Static174.anInt3726--;
													Static44.aClass214Array1[Static174.anInt3726] = null;
												}
											} else {
												local1663 = Class150.aClass2_Sub4_Sub2_3.method4810();
												local2522 = new Class214();
												local2522.aString58 = local444;
												local2522.aString60 = local452;
												local2522.aString59 = Static126.method2539(local2522.aString60);
												local2522.aByte65 = local3569;
												local2522.aString61 = local1663;
												local2522.anInt5966 = local249;
												for (local542 = Static174.anInt3726 - 1; local542 >= 0; local542--) {
													local638 = Static44.aClass214Array1[local542].aString59.compareTo(local2522.aString59);
													if (local638 == 0) {
														Static44.aClass214Array1[local542].anInt5966 = local249;
														Static44.aClass214Array1[local542].aByte65 = local3569;
														Static44.aClass214Array1[local542].aString61 = local1663;
														if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
															Static112.aByte25 = local3569;
														}
														Class191.anInt5358 = Class65.anInt1874;
														Class12_Sub4.aClass89_164 = null;
														return true;
													}
													if (local638 < 0) {
														break;
													}
												}
												if (Static174.anInt3726 >= Static44.aClass214Array1.length) {
													Class12_Sub4.aClass89_164 = null;
													return true;
												}
												for (local638 = Static174.anInt3726 - 1; local638 > local542; local638--) {
													Static44.aClass214Array1[local638 + 1] = Static44.aClass214Array1[local638];
												}
												if (Static174.anInt3726 == 0) {
													Static44.aClass214Array1 = new Class214[100];
												}
												Static44.aClass214Array1[local542 + 1] = local2522;
												Static174.anInt3726++;
												if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
													Static112.aByte25 = local3569;
												}
											}
											Class12_Sub4.aClass89_164 = null;
											Class191.anInt5358 = Class65.anInt1874;
											return true;
										}
										@Pc(3809) String local3809;
										if (Class108.aClass89_117 == Class12_Sub4.aClass89_164) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4818();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4837();
											local228 = Class150.aClass2_Sub4_Sub2_3.method4816();
											local3809 = "";
											local1627 = local3809;
											if ((local228 & 0x1) != 0) {
												local3809 = Class150.aClass2_Sub4_Sub2_3.method4810();
												if ((local228 & 0x2) == 0) {
													local1627 = local3809;
												} else {
													local1627 = Class150.aClass2_Sub4_Sub2_3.method4810();
												}
											}
											local1391 = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (local220 == 99) {
												Static149.method2941(local1391);
											} else if (local1627.equals("") || !Static98.method2210(local1627)) {
												Static32.method4201(local3809, local74, local1391, local220, local1627);
											} else {
												Class12_Sub4.aClass89_164 = null;
												return true;
											}
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class2_Sub2_Sub3.aClass89_39) {
											Static307.method5657(Class2_Sub3_Sub25.lb);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class123_Sub1.aClass89_141) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
											Static329.aClass32_5 = Static305.aClass152_5.method3758(local220);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class2_Sub3_Sub25.aClass89_184 == Class12_Sub4.aClass89_164) {
											Class17.anInt545 = Class150.aClass2_Sub4_Sub2_3.method4864();
											Class220.anInt6194 = Class150.aClass2_Sub4_Sub2_3.method4812();
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class11_Sub5_Sub2.aClass89_175 == Class12_Sub4.aClass89_164) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4816();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
											Static199.aClass226_1.method5787(local74, local220);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class70.aClass89_81 == Class12_Sub4.aClass89_164) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4804();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4836();
											local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
											if (local228 == 65535) {
												local228 = -1;
											}
											if (Static352.method6315(local220)) {
												Static130.method2597(local74, local228);
											}
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class11_Sub2.aClass89_152) {
											Static307.method5657(OutputStream_Sub1.aClass210_10);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class163.aClass89_167 == Class12_Sub4.aClass89_164) {
											Class70.anInt2000 = Class150.aClass2_Sub4_Sub2_3.method4816();
											Class69.anInt1948 = Class65.anInt1874;
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class116.aClass89_131 == Class12_Sub4.aClass89_164) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
											local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
											if (Static352.method6315(local228)) {
												Static141.method2739(local220, local74);
											}
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class174.aClass89_176) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4845();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
											Static199.aClass226_1.method5787(local74, local220);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class2_Sub28.aClass89_182) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4816();
											@Pc(4068) boolean local4068 = (local220 & 0x1) == 1;
											local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
											local3809 = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (local3809.equals("")) {
												local3809 = local1381;
											}
											local1627 = Class150.aClass2_Sub4_Sub2_3.method4810();
											local1391 = Class150.aClass2_Sub4_Sub2_3.method4810();
											if (local1391.equals("")) {
												local1391 = local1627;
											}
											if (local4068) {
												for (local512 = 0; local512 < Class2_Sub3_Sub30.anInt5688; local512++) {
													if (Class11_Sub3_Sub2.aStringArray39[local512].equals(local1391)) {
														Class2_Sub3_Sub22.aStringArray35[local512] = local1381;
														Class11_Sub3_Sub2.aStringArray39[local512] = local3809;
														Class173_Sub4.aStringArray66[local512] = local1627;
														Class2_Sub3_Sub20.aStringArray28[local512] = local1391;
														break;
													}
												}
											} else {
												Class2_Sub3_Sub22.aStringArray35[Class2_Sub3_Sub30.anInt5688] = local1381;
												Class11_Sub3_Sub2.aStringArray39[Class2_Sub3_Sub30.anInt5688] = local3809;
												Class173_Sub4.aStringArray66[Class2_Sub3_Sub30.anInt5688] = local1627;
												Class2_Sub3_Sub20.aStringArray28[Class2_Sub3_Sub30.anInt5688] = local1391;
												Class119.aBooleanArray31[Class2_Sub3_Sub30.anInt5688] = (local220 & 0x2) == 2;
												Class2_Sub3_Sub30.anInt5688++;
											}
											Class12_Sub4.aClass89_164 = null;
											Class11_Sub4.anInt3966 = Class65.anInt1874;
											return true;
										} else if (Class103.aClass89_113 == Class12_Sub4.aClass89_164) {
											local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
											local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
											if (Static352.method6315(local228)) {
												Static10.method239(local74, local444);
											}
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class2_Sub2_Sub8.aClass89_103) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4812();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
											if (local74 == 65535) {
												local74 = -1;
											}
											local228 = Class150.aClass2_Sub4_Sub2_3.method4812();
											Static129.method2580(local220, local228, local74);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else if (Class12_Sub4.aClass89_164 == Class11_Sub3.aClass89_226) {
											local220 = Class150.aClass2_Sub4_Sub2_3.method4864();
											local74 = Class150.aClass2_Sub4_Sub2_3.method4834();
											local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
											if (local228 == 65535) {
												local228 = -1;
											}
											Static164.method3325(local228, local74, local220);
											Class12_Sub4.aClass89_164 = null;
											return true;
										} else {
											@Pc(4300) long local4300;
											if (Class90.aClass89_249 == Class12_Sub4.aClass89_164) {
												local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
												local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
												local1381 = local452;
												if (local1371) {
													local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
												}
												local1780 = Class150.aClass2_Sub4_Sub2_3.method4799();
												local1785 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local4300 = Class150.aClass2_Sub4_Sub2_3.method4834();
												local638 = Class150.aClass2_Sub4_Sub2_3.method4816();
												@Pc(4310) long local4310 = (local1785 << 32) + local4300;
												@Pc(4312) boolean local4312 = false;
												@Pc(4314) int local4314 = 0;
												while (true) {
													if (local4314 >= 100) {
														if (local638 <= 1) {
															if (Class43.aBoolean123 && !Class73.aBoolean159 || Class78_Sub1.aBoolean166) {
																local4312 = true;
															} else if (Static98.method2210(local1381)) {
																local4312 = true;
															}
														}
														break;
													}
													if (Class130.aLongArray11[local4314] == local4310) {
														local4312 = true;
														break;
													}
													local4314++;
												}
												if (!local4312 && Class150.anInt3781 == 0) {
													Class130.aLongArray11[Class134.anInt3551] = local4310;
													Class134.anInt3551 = (Class134.anInt3551 + 1) % 100;
													@Pc(4372) String local4372 = Static144.method2774(Static285.method5277(Class150.aClass2_Sub4_Sub2_3));
													if (local638 == 2 || local638 == 3) {
														Static205.method3875(0, Static159.method3230(local1780), local4372, -1, 9, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static205.method3875(0, Static159.method3230(local1780), local4372, -1, 9, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static205.method3875(0, Static159.method3230(local1780), local4372, -1, 9, local1381, local452);
													}
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class2_Sub2_Sub15.aClass89_216) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
												local3551 = (local74 & 0x1) == 1;
												while (Class61.anInt1834 > Class150.aClass2_Sub4_Sub2_3.anInt5289) {
													local249 = Class150.aClass2_Sub4_Sub2_3.method4818();
													local497 = Class150.aClass2_Sub4_Sub2_3.method4830();
													local506 = 0;
													if (local497 != 0) {
														local506 = Class150.aClass2_Sub4_Sub2_3.method4816();
														if (local506 == 255) {
															local506 = Class150.aClass2_Sub4_Sub2_3.method4837();
														}
													}
													Static58.method2393(local249, local506, local220, local497 - 1, local3551);
												}
												Class2_Sub3_Sub12.anIntArray135[Class15_Sub2.anInt1415++ & 0x1F] = local220;
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class145.aClass89_154 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4853();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
												if (local228 == 65535) {
													local228 = -1;
												}
												if (Static352.method6315(local74)) {
													Static177.method3502(local228, -1, 1, local220);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class12_Sub1.aClass89_171) {
												Static307.method5657(Class140.aClass210_9);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class215.aClass89_217 == Class12_Sub4.aClass89_164) {
												local444 = Class150.aClass2_Sub4_Sub2_3.method4810();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4853();
												if (Static352.method6315(local74)) {
													Static296.method5433(local228, local444);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class134.aClass89_146 == Class12_Sub4.aClass89_164) {
												Static307.method5657(Class79.aClass210_5);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class214.aClass89_211) {
												Static65.method1782(false);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub3_Sub17.aClass89_130 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4845();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4851();
												local249 = Class150.aClass2_Sub4_Sub2_3.method4801();
												if (Static352.method6315(local74)) {
													Static121.method2440(local249, local228, local220);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class198.aClass89_199 == Class12_Sub4.aClass89_164) {
												Static169.method3376(false);
												Class12_Sub4.aClass89_164 = null;
												return false;
											} else if (Class12_Sub4.aClass89_164 == Class49_Sub2_Sub1.aClass89_225) {
												Static145.aClass170_2 = Static312.method5696(Class150.aClass2_Sub4_Sub2_3.method4816());
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class63.aClass89_70 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4805();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
												local3551 = (local220 & 0x1) == 1;
												Static156.method3187(local3551, local74);
												Class2_Sub3_Sub12.anIntArray135[Class15_Sub2.anInt1415++ & 0x1F] = local74;
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class7.aClass89_13 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4853();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4807();
												if (local74 == 65535) {
													local74 = -1;
												}
												local228 = Class150.aClass2_Sub4_Sub2_3.method4854();
												if (Static352.method6315(local228)) {
													Static177.method3502(local74, -1, 2, local220);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class69.aClass89_76) {
												local272 = Class150.aClass2_Sub4_Sub2_3.method4802();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4830();
												Static199.aClass226_1.method5786(local272, local74);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class72.aClass89_83) {
												Static357.method6380(Class150.aClass2_Sub4_Sub2_3.method4810());
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class2.aClass89_257) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local249 = Class150.aClass2_Sub4_Sub2_3.method4854();
												local497 = Class150.aClass2_Sub4_Sub2_3.method4845();
												if (Static352.method6315(local74)) {
													Static177.method3502(local228 | local249 << 16, local220, 7, local497);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub15.aClass89_94 == Class12_Sub4.aClass89_164) {
												local1371 = Class150.aClass2_Sub4_Sub2_3.method4816() == 1;
												local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
												local1381 = local452;
												if (local1371) {
													local1381 = Class150.aClass2_Sub4_Sub2_3.method4810();
												}
												local1780 = Class150.aClass2_Sub4_Sub2_3.method4799();
												local1785 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local4300 = Class150.aClass2_Sub4_Sub2_3.method4834();
												local638 = Class150.aClass2_Sub4_Sub2_3.method4816();
												@Pc(4892) int local4892 = Class150.aClass2_Sub4_Sub2_3.method4830();
												@Pc(4898) long local4898 = local4300 + (local1785 << 32);
												@Pc(4900) boolean local4900 = false;
												@Pc(4902) int local4902 = 0;
												while (true) {
													if (local4902 >= 100) {
														if (local638 <= 1 && Static98.method2210(local1381)) {
															local4900 = true;
														}
														break;
													}
													if (Class130.aLongArray11[local4902] == local4898) {
														local4900 = true;
														break;
													}
													local4902++;
												}
												if (!local4900 && Class150.anInt3781 == 0) {
													Class130.aLongArray11[Class134.anInt3551] = local4898;
													Class134.anInt3551 = (Class134.anInt3551 + 1) % 100;
													@Pc(4955) String local4955 = Static137.method2701(local4892).method5603(Class150.aClass2_Sub4_Sub2_3);
													if (local638 == 2) {
														Static205.method3875(0, Static159.method3230(local1780), local4955, local4892, 20, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static205.method3875(0, Static159.method3230(local1780), local4955, local4892, 20, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static205.method3875(0, Static159.method3230(local1780), local4955, local4892, 20, local1381, local452);
													}
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class30.aClass89_31) {
												Static307.method5657(Class24.aClass210_2);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class2_Sub3_Sub25.aClass89_185) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4807();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4853();
												if (Static352.method6315(local220)) {
													Static177.method3502(Class11_Sub3_Sub2.anInt4220, 0, 5, local74);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class250.aClass89_256 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
												local3551 = (local74 & 0x1) == 1;
												Static263.method4926(local3551, local220);
												local249 = Class150.aClass2_Sub4_Sub2_3.method4830();
												for (local497 = 0; local497 < local249; local497++) {
													local506 = Class150.aClass2_Sub4_Sub2_3.method4804();
													local512 = Class150.aClass2_Sub4_Sub2_3.method4816();
													if (local512 == 255) {
														local512 = Class150.aClass2_Sub4_Sub2_3.method4836();
													}
													Static58.method2393(local497, local512, local220, local506 - 1, local3551);
												}
												Class2_Sub3_Sub12.anIntArray135[Class15_Sub2.anInt1415++ & 0x1F] = local220;
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub3_Sub10.aClass89_234 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4804();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4816();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
												@Pc(5170) Class11_Sub5_Sub2_Sub2 local5170 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local220];
												if (local5170 != null) {
													Static284.method5257(local228, local5170, local74);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class62.aClass89_68 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4837();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
												if (Static352.method6315(local220)) {
													Static299.method5482(local228, local74);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub22.aClass89_143 == Class12_Sub4.aClass89_164) {
												if (Class61.anInt1834 == 0) {
													Static307.aString62 = Class2_Sub3_Sub9.aClass79_34.method2269(Class197.anInt5569);
												} else {
													Static307.aString62 = Class150.aClass2_Sub4_Sub2_3.method4810();
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class27.aClass89_25) {
												Static169.method3376(true);
												Class12_Sub4.aClass89_164 = null;
												return false;
											} else if (Class12_Sub4.aClass89_164 == Class173_Sub4.aClass89_244) {
												Static307.method5657(Class16.aClass210_1);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub12_Sub1.aClass89_79 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4804();
												if (Static352.method6315(local228)) {
													Static10.method239(local220, local452);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Applet_Sub1.aClass89_42) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4836();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4854();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4807();
												local249 = Class150.aClass2_Sub4_Sub2_3.method4807();
												local497 = Class150.aClass2_Sub4_Sub2_3.method4807();
												if (Static352.method6315(local74)) {
													Static254.method4681(local497, local249, local220, local228);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class141.aClass89_151 == Class12_Sub4.aClass89_164) {
												Static307.method5657(Class78_Sub1.aClass210_4);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class27.aClass89_26) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4864();
												local74 = local220 >> 2;
												local228 = local220 & 0x3;
												local249 = Class2_Sub3_Sub16.anIntArray174[local74];
												local497 = Class150.aClass2_Sub4_Sub2_3.method4836();
												local506 = local497 >> 28 & 0x3;
												local512 = local497 >> 14 & 0x3FFF;
												local536 = local497 & 0x3FFF;
												local542 = Class150.aClass2_Sub4_Sub2_3.method4854();
												@Pc(5371) int local5371 = local536 - Static139.anInt2716;
												if (local542 == 65535) {
													local542 = -1;
												}
												local512 -= Static154.anInt3136;
												Static365.method6453(local74, local542, local5371, local249, local228, local512, local506);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class97.aClass89_108 == Class12_Sub4.aClass89_164) {
												Static63.anInt1635 = Class150.aClass2_Sub4_Sub2_3.method4812();
												Static226.anInt4495 = Class150.aClass2_Sub4_Sub2_3.method4816();
												Static7.anInt7227 = Class150.aClass2_Sub4_Sub2_3.method4805();
												while (Class150.aClass2_Sub4_Sub2_3.anInt5289 < Class61.anInt1834) {
													@Pc(5421) Class210 local5421 = Static301.method5540()[Class150.aClass2_Sub4_Sub2_3.method4816()];
													Static307.method5657(local5421);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class2_Sub25.aClass89_163 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4816();
												local74 = local220 >> 5;
												local228 = local220 & 0x1F;
												if (local228 == 0) {
													Class41.aClass84Array1[local74] = null;
													Class12_Sub4.aClass89_164 = null;
													return true;
												}
												@Pc(5468) Class84 local5468 = new Class84();
												local5468.anInt2352 = local228;
												local5468.anInt2360 = Class150.aClass2_Sub4_Sub2_3.method4816();
												if (local5468.anInt2360 >= 0 && local5468.anInt2360 < Static213.aClass13Array16.length) {
													if (local5468.anInt2352 == 1 || local5468.anInt2352 == 10) {
														local5468.anInt2351 = Class150.aClass2_Sub4_Sub2_3.method4830();
														Class150.aClass2_Sub4_Sub2_3.anInt5289 += 6;
													} else if (local5468.anInt2352 >= 2 && local5468.anInt2352 <= 6) {
														if (local5468.anInt2352 == 2) {
															local5468.anInt2347 = 64;
															local5468.anInt2353 = 64;
														}
														if (local5468.anInt2352 == 3) {
															local5468.anInt2353 = 64;
															local5468.anInt2347 = 0;
														}
														if (local5468.anInt2352 == 4) {
															local5468.anInt2353 = 64;
															local5468.anInt2347 = 128;
														}
														if (local5468.anInt2352 == 5) {
															local5468.anInt2353 = 0;
															local5468.anInt2347 = 64;
														}
														if (local5468.anInt2352 == 6) {
															local5468.anInt2347 = 64;
															local5468.anInt2353 = 128;
														}
														local5468.anInt2352 = 2;
														local5468.anInt2356 = Class150.aClass2_Sub4_Sub2_3.method4816();
														local5468.anInt2349 = Class150.aClass2_Sub4_Sub2_3.method4830();
														local5468.anInt2361 = Class150.aClass2_Sub4_Sub2_3.method4830();
														local5468.anInt2359 = Class150.aClass2_Sub4_Sub2_3.method4816();
														local5468.anInt2346 = Class150.aClass2_Sub4_Sub2_3.method4830();
													}
													local5468.anInt2358 = Class150.aClass2_Sub4_Sub2_3.method4830();
													if (local5468.anInt2358 == 65535) {
														local5468.anInt2358 = -1;
													}
													Class41.aClass84Array1[local74] = local5468;
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class2_Sub3_Sub17.aClass89_129) {
												Static307.method5657(Class98.aClass210_6);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class107.aClass89_116) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local452 = Class150.aClass2_Sub4_Sub2_3.method4810();
												@Pc(5648) Object[] local5648 = new Object[local452.length() + 1];
												for (local249 = local452.length() - 1; local249 >= 0; local249--) {
													if (local452.charAt(local249) == 's') {
														local5648[local249 + 1] = Class150.aClass2_Sub4_Sub2_3.method4810();
													} else {
														local5648[local249 + 1] = Integer.valueOf(Class150.aClass2_Sub4_Sub2_3.method4837());
													}
												}
												local5648[0] = Integer.valueOf(Class150.aClass2_Sub4_Sub2_3.method4837());
												if (Static352.method6315(local220)) {
													@Pc(5704) Class2_Sub13 local5704 = new Class2_Sub13();
													local5704.anObjectArray4 = local5648;
													Static185.method3592(local5704);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class11_Sub2_Sub3.aClass89_153 == Class12_Sub4.aClass89_164) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4830();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4837();
												if (Static352.method6315(local220)) {
													@Pc(5735) Class2_Sub7 local5735 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local74);
													if (local5735 != null) {
														Static253.method4656(false, local5735, true);
													}
													if (Class133.aClass161_8 != null) {
														Static187.method3646(Class133.aClass161_8);
														Class133.aClass161_8 = null;
													}
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class2_Sub12_Sub3.aClass89_174) {
												Static307.method5657(Class2_Sub3_Sub17.aClass210_8);
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else if (Class12_Sub4.aClass89_164 == Class71.aClass89_82) {
												local220 = Class150.aClass2_Sub4_Sub2_3.method4837();
												local74 = Class150.aClass2_Sub4_Sub2_3.method4804();
												local228 = Class150.aClass2_Sub4_Sub2_3.method4817();
												if (Static352.method6315(local74)) {
													Static50.method3953(local228, local220);
												}
												Class12_Sub4.aClass89_164 = null;
												return true;
											} else {
												Static241.method6254(null, "T1 - " + (Class12_Sub4.aClass89_164 == null ? -1 : Class12_Sub4.aClass89_164.method2401()) + "," + (Static62.aClass89_57 == null ? -1 : Static62.aClass89_57.method2401()) + "," + (Static37.aClass89_35 == null ? -1 : Static37.aClass89_35.method2401()) + " - " + Class61.anInt1834);
												Static92.method2146();
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
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!nf;B)V", line = 2899)
	public static void method1824(@OriginalArg(0) Class12_Sub4 arg0) {
		arg0.aClass11_1 = null;
		@Pc(10) int local10 = arg0.aClass12_Sub2Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass12_Sub2Array1[local12].aBoolean29 = false;
		}
		@Pc(28) Class36[] local28 = Class2_Sub43.aClass36Array1;
		synchronized (Class2_Sub43.aClass36Array1) {
			if (local10 < Class2_Sub43.aClass36Array1.length && Class144.anIntArray224[local10] < 200) {
				Class2_Sub43.aClass36Array1[local10].method1420(arg0);
				@Pc(49) int local49 = Class144.anIntArray224[local10]++;
			}
		}
	}
}
