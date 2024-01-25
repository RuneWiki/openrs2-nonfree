import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_83 = new Class202("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!wo;")
	public static final Class316 aClass316_1 = new Class316();

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_62 = new Class239(64, 4);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public static void method2469() {
		if (Static78.anInt1655 > 1) {
			Static78.anInt1655--;
			Static209.anInt3778 = Static507.anInt2745;
		}
		if (Static158.aBoolean237) {
			Static158.aBoolean237 = false;
			Static270.method7140();
			return;
		}
		if (!Static452.aBoolean600) {
			Static95.method1762();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static187.method3069(); local29++) {
		}
		if (Static271.anInt8654 != 9) {
			return;
		}
		Static379.method5222(Static381.aClass2_Sub29_Sub2_2, Static212.aClass243_46.method6388());
		if (Static374.aClass2_Sub51_1 == null) {
			if (Static340.aLong160 <= Static143.method2502()) {
				Static374.aClass2_Sub51_1 = Static396.aClass101_1.method2730(Static471.aClass163_5.aString104);
			}
		} else if (Static374.aClass2_Sub51_1.anInt9385 != -1) {
			Static93.method1721(Static25.aClass243_22);
			Static381.aClass2_Sub29_Sub2_2.method5217(Static374.aClass2_Sub51_1.anInt9385);
			Static374.aClass2_Sub51_1 = null;
			Static340.aLong160 = Static143.method2502() + 30000L;
		}
		@Pc(92) Class2_Sub26 local92 = (Class2_Sub26) Static431.aClass249_61.method6527();
		@Pc(106) int local106;
		@Pc(127) int local127;
		@Pc(143) int local143;
		@Pc(193) int local193;
		@Pc(200) int local200;
		@Pc(212) int local212;
		if (local92 != null || Static196.aLong100 < Static143.method2502() - 2000L) {
			@Pc(103) boolean local103 = false;
			local106 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
			for (@Pc(111) Class2_Sub26 local111 = (Class2_Sub26) Static347.aClass249_37.method6527(); local111 != null && Static381.aClass2_Sub29_Sub2_2.anInt6132 - local106 < 240; local111 = (Class2_Sub26) Static347.aClass249_37.method6525()) {
				local111.method7802();
				local127 = local111.method6660();
				if (local127 < -1) {
					local127 = -1;
				} else if (local127 > 65534) {
					local127 = 65534;
				}
				local143 = local111.method6659();
				if (local143 < -1) {
					local143 = -1;
				} else if (local143 > 65534) {
					local143 = 65534;
				}
				if (Static422.anInt7835 != local143 || local127 != Static432.anInt7922) {
					if (!local103) {
						Static93.method1721(Static520.aClass243_24);
						Static381.aClass2_Sub29_Sub2_2.method5172(0);
						local106 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
						local103 = true;
					}
					local193 = local143 - Static422.anInt7835;
					Static422.anInt7835 = local143;
					local200 = local127 - Static432.anInt7922;
					Static432.anInt7922 = local127;
					local212 = (int) ((local111.method6658() - Static196.aLong100) / 20L);
					if (local212 < 8 && local193 >= -32 && local193 <= 31 && local200 >= -32 && local200 <= 31) {
						local200 += 32;
						local193 += 32;
						Static381.aClass2_Sub29_Sub2_2.method5217(local200 + (local193 << 6) + (local212 << 12));
					} else if (local212 < 32 && local193 >= -128 && local193 <= 127 && local200 >= -128 && local200 <= 127) {
						Static381.aClass2_Sub29_Sub2_2.method5172(local212 + 128);
						local193 += 128;
						local200 += 128;
						Static381.aClass2_Sub29_Sub2_2.method5217((local193 << 8) + local200);
					} else if (local212 < 32) {
						Static381.aClass2_Sub29_Sub2_2.method5172(local212 + 192);
						if (local143 == 1 || local127 == -1) {
							Static381.aClass2_Sub29_Sub2_2.method5185(Integer.MIN_VALUE);
						} else {
							Static381.aClass2_Sub29_Sub2_2.method5185(local127 << 16 | local143);
						}
					} else {
						Static381.aClass2_Sub29_Sub2_2.method5217(local212 + 57344);
						if (local143 == 1 || local127 == -1) {
							Static381.aClass2_Sub29_Sub2_2.method5185(Integer.MIN_VALUE);
						} else {
							Static381.aClass2_Sub29_Sub2_2.method5185(local127 << 16 | local143);
						}
					}
					Static196.aLong100 = local111.method6658();
				}
			}
			if (local103) {
				Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local106);
			}
		}
		if (local92 != null) {
			@Pc(382) long local382 = (local92.method6658() - Static366.aLong37) / 50L;
			Static366.aLong37 = local92.method6658();
			if (local382 > 32767L) {
				local382 = 32767L;
			}
			@Pc(396) int local396 = local92.method6660();
			if (local396 < 0) {
				local396 = 0;
			} else if (local396 > 65535) {
				local396 = 65535;
			}
			local127 = local92.method6659();
			if (local127 < 0) {
				local127 = 0;
			} else if (local127 > 65535) {
				local127 = 65535;
			}
			@Pc(431) byte local431 = 0;
			if (local92.method6655() == 2) {
				local431 = 1;
			}
			local193 = (int) local382;
			Static93.method1721(Static372.aClass243_68);
			Static381.aClass2_Sub29_Sub2_2.method5186(local431 << 15 | local193);
			Static381.aClass2_Sub29_Sub2_2.method5204(local396 << 16 | local127);
		}
		if (Static389.anInt7417 > 0) {
			Static93.method1721(Static69.aClass243_15);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static389.anInt7417 * 3);
			for (@Pc(481) int local481 = 0; local481 < Static389.anInt7417; local481++) {
				@Pc(487) Interface13 local487 = Static251.anInterface13Array1[local481];
				@Pc(495) long local495 = (local487.method5853() - Static490.aLong191) / 50L;
				Static490.aLong191 = local487.method5853();
				if (local495 > 65535L) {
					local495 = 65535L;
				}
				Static381.aClass2_Sub29_Sub2_2.method5172(local487.method5854());
				Static381.aClass2_Sub29_Sub2_2.method5217((int) local495);
			}
		}
		if (Static191.anInt8290 > 0) {
			Static191.anInt8290--;
		}
		if (Static253.aBoolean338 && Static191.anInt8290 <= 0) {
			Static191.anInt8290 = 20;
			Static253.aBoolean338 = false;
			Static93.method1721(Static49.aClass243_11);
			Static381.aClass2_Sub29_Sub2_2.method5186((int) Static265.aFloat182 >> 3);
			Static381.aClass2_Sub29_Sub2_2.method5228((int) Static161.aFloat56 >> 3);
		}
		if (Static186.aBoolean264 && !Static120.aBoolean209) {
			Static120.aBoolean209 = true;
			Static93.method1721(Static436.aClass243_81);
			Static381.aClass2_Sub29_Sub2_2.method5172(1);
		}
		if (!Static186.aBoolean264 && Static120.aBoolean209) {
			Static120.aBoolean209 = false;
			Static93.method1721(Static436.aClass243_81);
			Static381.aClass2_Sub29_Sub2_2.method5172(0);
		}
		if (!Static210.aBoolean299) {
			Static93.method1721(Static234.aClass243_49);
			Static381.aClass2_Sub29_Sub2_2.method5172(0);
			local106 = Static381.aClass2_Sub29_Sub2_2.anInt6132;
			@Pc(642) Class2_Sub29 local642 = new Class2_Sub29(Static26.method600());
			Static281.aClass2_Sub19_Sub1_1.method2139(local642);
			Static381.aClass2_Sub29_Sub2_2.method5221(local642.anInt6132, local642.aByteArray96);
			Static381.aClass2_Sub29_Sub2_2.method5181(Static381.aClass2_Sub29_Sub2_2.anInt6132 - local106);
			Static210.aBoolean299 = true;
		}
		if (Static399.aClass262ArrayArrayArray2 != null) {
			if (Static427.anInt7875 == 2) {
				Static536.method7739();
			} else if (Static427.anInt7875 == 3) {
				Static456.method6973();
			}
		}
		if (Static221.aBoolean311) {
			Static221.aBoolean311 = false;
		} else {
			Static291.aFloat102 /= 2.0F;
		}
		if (Static155.aBoolean227) {
			Static155.aBoolean227 = false;
		} else {
			Static232.aFloat73 /= 2.0F;
		}
		Static438.method6696();
		if (Static271.anInt8654 != 9) {
			return;
		}
		Static55.method1020();
		Static354.method5546();
		Static186.method3046();
		Static414.method7238();
		Static6.anInt158++;
		if (Static6.anInt158 > 750) {
			Static270.method7140();
			return;
		}
		Static463.method7000();
		Static92.method1717();
		Static95.method1758();
		for (local106 = Static84.aClass302_1.method7519(true); local106 != -1; local106 = Static84.aClass302_1.method7519(false)) {
			Static304.method4763(local106);
			Static132.anIntArray324[Static3.anInt104++ & 0x1F] = local106;
		}
		@Pc(866) Class310 local866;
		for (@Pc(761) Class2_Sub13_Sub15 local761 = Static446.method6780(); local761 != null; local761 = Static446.method6780()) {
			local127 = local761.method6967();
			local143 = local761.method6969();
			if (local127 == 1) {
				Static399.anIntArray113[local143] = local761.anInt8318;
				Static242.aBoolean326 |= Static432.aBooleanArray35[local143];
				Static87.anIntArray134[Static170.anInt3115++ & 0x1F] = local143;
			} else if (local127 == 2) {
				Static14.aStringArray2[local143] = local761.aString172;
				Static285.anIntArray461[Static153.anInt9007++ & 0x1F] = local143;
			} else if (local127 == 3) {
				local866 = Static111.method2143(local143);
				if (!local761.aString172.equals(local866.aString204)) {
					local866.aString204 = local761.aString172;
					Static273.method4342(local866);
				}
			} else {
				@Pc(818) int local818;
				if (local127 == 4) {
					local866 = Static111.method2143(local143);
					local200 = local761.anInt8318;
					local212 = local761.anInt8320;
					local818 = local761.anInt8314;
					if (local866.anInt9158 != local200 || local866.anInt9218 != local212 || local818 != local866.anInt9200) {
						local866.anInt9158 = local200;
						local866.anInt9200 = local818;
						local866.anInt9218 = local212;
						Static273.method4342(local866);
					}
				} else if (local127 == 5) {
					local866 = Static111.method2143(local143);
					if (local761.anInt8318 != local866.anInt9203 || local761.anInt8318 == -1) {
						local866.anInt9146 = 1;
						local866.anInt9203 = local761.anInt8318;
						local866.anInt9162 = 0;
						local866.anInt9196 = 0;
						Static273.method4342(local866);
					}
				} else if (local127 == 6) {
					local193 = local761.anInt8318;
					local200 = local193 >> 10 & 0x1F;
					local212 = local193 >> 5 & 0x1F;
					local818 = local193 & 0x1F;
					@Pc(831) int local831 = (local200 << 19) + (local212 << 11) + (local818 << 3);
					@Pc(835) Class310 local835 = Static111.method2143(local143);
					if (local831 != local835.anInt9172) {
						local835.anInt9172 = local831;
						Static273.method4342(local835);
					}
				} else if (local127 == 7) {
					local866 = Static111.method2143(local143);
					@Pc(1152) boolean local1152 = local761.anInt8318 == 1;
					if (local1152 != local866.aBoolean655) {
						local866.aBoolean655 = local1152;
						Static273.method4342(local866);
					}
				} else if (local127 == 8) {
					local866 = Static111.method2143(local143);
					if (local761.anInt8318 != local866.anInt9154 || local866.anInt9183 != local761.anInt8320 || local761.anInt8314 != local866.anInt9215) {
						local866.anInt9183 = local761.anInt8320;
						local866.anInt9154 = local761.anInt8318;
						local866.anInt9215 = local761.anInt8314;
						if (local866.anInt9224 != -1) {
							if (local866.anInt9195 > 0) {
								local866.anInt9215 = local866.anInt9215 * 32 / local866.anInt9195;
							} else if (local866.anInt9165 > 0) {
								local866.anInt9215 = local866.anInt9215 * 32 / local866.anInt9165;
							}
						}
						Static273.method4342(local866);
					}
				} else if (local127 == 9) {
					local866 = Static111.method2143(local143);
					if (local761.anInt8318 != local866.anInt9224 || local866.anInt9153 != local761.anInt8320) {
						local866.anInt9224 = local761.anInt8318;
						local866.anInt9153 = local761.anInt8320;
						Static273.method4342(local866);
					}
				} else if (local127 == 10) {
					local866 = Static111.method2143(local143);
					if (local866.anInt9173 != local761.anInt8318 || local761.anInt8320 != local866.anInt9160 || local866.anInt9190 != local761.anInt8314) {
						local866.anInt9190 = local761.anInt8314;
						local866.anInt9173 = local761.anInt8318;
						local866.anInt9160 = local761.anInt8320;
						Static273.method4342(local866);
					}
				} else if (local127 == 11) {
					local866 = Static111.method2143(local143);
					local866.aByte106 = 0;
					local866.aByte107 = 0;
					local866.anInt9184 = local866.anInt9155 = local761.anInt8318;
					local866.anInt9175 = local866.anInt9229 = local761.anInt8320;
					Static273.method4342(local866);
				} else if (local127 == 12) {
					local866 = Static111.method2143(local143);
					local200 = local761.anInt8318;
					if (local866 != null && local866.anInt9220 == 0) {
						if (local866.anInt9178 - local866.anInt9198 < local200) {
							local200 = local866.anInt9178 - local866.anInt9198;
						}
						if (local200 < 0) {
							local200 = 0;
						}
						if (local866.anInt9227 != local200) {
							local866.anInt9227 = local200;
							Static273.method4342(local866);
						}
					}
				} else if (local127 == 14) {
					local866 = Static111.method2143(local143);
					local866.anInt9182 = local761.anInt8318;
				} else if (local127 == 15) {
					Static40.aBoolean609 = true;
					Static440.anInt8023 = local761.anInt8318;
					Static203.anInt3677 = local761.anInt8320;
				} else if (local127 == 16) {
					local866 = Static111.method2143(local143);
					local866.anInt9148 = local761.anInt8318;
				}
			}
		}
		if (Static142.anInt2630 != 0) {
			Static515.anInt3810 += 20;
			if (Static515.anInt3810 >= 400) {
				Static142.anInt2630 = 0;
			}
		}
		Static436.anInt7972++;
		if (Static59.aClass310_2 != null) {
			Static88.anInt1777++;
			if (Static88.anInt1777 >= 15) {
				Static273.method4342(Static59.aClass310_2);
				Static59.aClass310_2 = null;
			}
		}
		Static499.aBoolean632 = false;
		Static292.aClass310_13 = null;
		Static161.aBoolean238 = false;
		Static38.aClass310_1 = null;
		Static145.method2533(null, -1, -1);
		Static485.method7209(-1, null, -1);
		if (!Static21.aBoolean31) {
			Static94.anInt1853 = -1;
		}
		Static281.method4446();
		Static507.anInt2745++;
		if (Static158.aBoolean236) {
			Static93.method1721(Static195.aClass243_43);
			Static381.aClass2_Sub29_Sub2_2.method5185(Static283.anInt5239 | Static9.anInt223 << 28 | Static419.anInt7799 << 14);
			Static158.aBoolean236 = false;
		}
		while (true) {
			@Pc(1396) Class2_Sub28 local1396;
			@Pc(1401) Class310 local1401;
			do {
				local1396 = (Class2_Sub28) Static313.aClass249_47.method6529();
				if (local1396 == null) {
					while (true) {
						do {
							local1396 = (Class2_Sub28) Static96.aClass249_9.method6529();
							if (local1396 == null) {
								while (true) {
									do {
										local1396 = (Class2_Sub28) Static17.aClass249_4.method6529();
										if (local1396 == null) {
											if (Static292.aClass310_13 == null) {
												Static358.anInt6807 = 0;
											}
											if (Static72.aClass310_4 != null) {
												Static189.method3097();
											}
											if (Static475.anInt8486 > 0 && Static311.aClass189_1.method4710(82) && Static311.aClass189_1.method4710(81) && Static101.anInt8474 != 0) {
												local127 = Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 - Static101.anInt8474;
												if (local127 < 0) {
													local127 = 0;
												} else if (local127 > 3) {
													local127 = 3;
												}
												Static161.method2731(Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0] + Static238.anInt4280, local127, Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0] + Static371.anInt6936);
											}
											Static373.method5904();
											for (local127 = 0; local127 < 5; local127++) {
												@Pc(1603) int local1603 = Static540.anIntArray763[local127]++;
											}
											if (Static242.aBoolean326 && Static143.method2502() - 60000L > Class75_Sub1.lb) {
												Static538.method7748();
											}
											for (@Pc(1630) Class6_Sub1_Sub1 local1630 = (Class6_Sub1_Sub1) Static157.aClass107_2.method2832(); local1630 != null; local1630 = (Class6_Sub1_Sub1) Static157.aClass107_2.method2835()) {
												if (Static143.method2502() / 1000L - 5L > (long) local1630.anInt846) {
													if (local1630.aShort16 > 0) {
														Static62.method1145(local1630.aString25 + Static332.aClass202_180.method5139(Static172.anInt6352), "", 0, "", 5);
													}
													if (local1630.aShort16 == 0) {
														Static62.method1145(local1630.aString25 + Static477.aClass202_241.method5139(Static172.anInt6352), "", 0, "", 5);
													}
													local1630.method7058();
												}
											}
											Static489.anInt8652++;
											if (Static489.anInt8652 > 500) {
												Static489.anInt8652 = 0;
												local193 = (int) (Math.random() * 8.0D);
												if ((local193 & 0x4) == 4) {
													Static114.anInt2317 += Static97.anInt1924;
												}
												if ((local193 & 0x1) == 1) {
													Static530.anInt9204 += Static101.anInt8477;
												}
												if ((local193 & 0x2) == 2) {
													Static368.anInt6904 += Static64.anInt1242;
												}
											}
											if (Static530.anInt9204 < -50) {
												Static101.anInt8477 = 2;
											}
											if (Static368.anInt6904 < -55) {
												Static64.anInt1242 = 2;
											}
											if (Static530.anInt9204 > 50) {
												Static101.anInt8477 = -2;
											}
											if (Static114.anInt2317 < -40) {
												Static97.anInt1924 = 1;
											}
											if (Static368.anInt6904 > 55) {
												Static64.anInt1242 = -2;
											}
											if (Static114.anInt2317 > 40) {
												Static97.anInt1924 = -1;
											}
											Static478.anInt8552++;
											if (Static478.anInt8552 > 500) {
												Static478.anInt8552 = 0;
												local193 = (int) (Math.random() * 8.0D);
												if ((local193 & 0x2) == 2) {
													Static3.anInt111 += Static518.anInt9014;
												}
												if ((local193 & 0x1) == 1) {
													Static87.anInt1767 += Static310.anInt5644;
												}
											}
											if (Static87.anInt1767 < -60) {
												Static310.anInt5644 = 2;
											}
											if (Static87.anInt1767 > 60) {
												Static310.anInt5644 = -2;
											}
											if (Static3.anInt111 < -20) {
												Static518.anInt9014 = 1;
											}
											Static409.anInt7642++;
											if (Static3.anInt111 > 10) {
												Static518.anInt9014 = -1;
											}
											if (Static409.anInt7642 > 50) {
												Static93.method1721(Static158.aClass243_38);
											}
											if (Static249.aBoolean334) {
												Static297.method4696();
												Static249.aBoolean334 = false;
											}
											try {
												if (Static497.aClass173_2 != null && Static381.aClass2_Sub29_Sub2_2.anInt6132 > 0) {
													Static51.anInt917 += Static381.aClass2_Sub29_Sub2_2.anInt6132;
													Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, Static381.aClass2_Sub29_Sub2_2.anInt6132);
													Static409.anInt7642 = 0;
													Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
													return;
												}
												return;
											} catch (@Pc(1893) IOException local1893) {
												Static270.method7140();
												return;
											}
										}
										local1401 = local1396.aClass310_8;
										if (local1401.anInt9170 < 0) {
											break;
										}
										local866 = Static111.method2143(local1401.anInt9167);
									} while (local866 == null || local866.aClass310Array2 == null || local866.aClass310Array2.length <= local1401.anInt9170 || local866.aClass310Array2[local1401.anInt9170] != local1401);
									Static258.method4037(local1396);
								}
							}
							local1401 = local1396.aClass310_8;
							if (local1401.anInt9170 < 0) {
								break;
							}
							local866 = Static111.method2143(local1401.anInt9167);
						} while (local866 == null || local866.aClass310Array2 == null || local1401.anInt9170 >= local866.aClass310Array2.length || local1401 != local866.aClass310Array2[local1401.anInt9170]);
						Static258.method4037(local1396);
					}
				}
				local1401 = local1396.aClass310_8;
				if (local1401.anInt9170 < 0) {
					break;
				}
				local866 = Static111.method2143(local1401.anInt9167);
			} while (local866 == null || local866.aClass310Array2 == null || local1401.anInt9170 >= local866.aClass310Array2.length || local1401 != local866.aClass310Array2[local1401.anInt9170]);
			Static258.method4037(local1396);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static106.method1964(arg0)) {
			return;
		}
		if (Static196.aClass310ArrayArray1[arg0] == null) {
			Static67.method1249(Static235.aClass310ArrayArray2[arg0], -1, arg2, arg5, arg7, arg6, arg3, arg4, arg8, arg1);
		} else {
			Static67.method1249(Static196.aClass310ArrayArray1[arg0], -1, arg2, arg5, arg7, arg6, arg3, arg4, arg8, arg1);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!cd;B)V")
	public static void method2472(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class1_Sub1_Sub2_Sub2) {
			@Pc(9) Class1_Sub1_Sub2_Sub2 local9 = (Class1_Sub1_Sub2_Sub2) arg0;
			if (local9.aClass12_1 != null) {
				Static347.method5460(Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local9.aByte90, local9);
			}
		} else if (arg0 instanceof Class1_Sub1_Sub2_Sub1) {
			@Pc(31) Class1_Sub1_Sub2_Sub1 local31 = (Class1_Sub1_Sub2_Sub1) arg0;
			Static125.method2369(local31, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 != local31.aByte90);
		}
	}
}
