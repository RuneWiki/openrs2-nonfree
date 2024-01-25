import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "[[Lclient!as;")
	public static Class14[][] aClass14ArrayArray2;

	@OriginalMember(owner = "client!fv", name = "U", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_38 = new Class175("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!fv", name = "Q", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_37 = new Class184(89, 9);

	@OriginalMember(owner = "client!fv", name = "R", descriptor = "[S")
	public static final short[] aShortArray2 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!fv", name = "S", descriptor = "[I")
	public static final int[] anIntArray63 = new int[8];

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
	public static int method777() {
		@Pc(10) Class5 local10 = Static122.aClass5_23;
		synchronized (Static122.aClass5_23) {
			return Static122.aClass5_23.method112();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public static void method781() {
		if (Static233.anInt4493 > 0) {
			Static233.anInt4493--;
		}
		if (Static176.anInt3611 > 1) {
			Static1.anInt48 = Static296.anInt5417;
			Static176.anInt3611--;
		}
		if (Static206.aBoolean328) {
			Static206.aBoolean328 = false;
			Static237.method3708();
			return;
		}
		if (!Static378.aBoolean462) {
			Static45.method996();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static287.method4203(); local33++) {
		}
		if (Static142.anInt3209 != 30) {
			return;
		}
		Static340.method4954(Static444.aClass92_251.method2663(), Static302.aClass3_Sub2_Sub2_2);
		if (Static337.aClass3_Sub43_2 == null) {
			if (Static98.aLong68 <= Static150.method2672()) {
				Static337.aClass3_Sub43_2 = Static159.aClass66_1.method1634(Static324.aString2);
			}
		} else if (Static337.aClass3_Sub43_2.anInt7106 != -1) {
			Static414.method5552(Static349.aClass92_249);
			Static302.aClass3_Sub2_Sub2_2.method6045(Static337.aClass3_Sub43_2.anInt7106);
			Static337.aClass3_Sub43_2 = null;
			Static98.aLong68 = Static150.method2672() + 30000L;
		}
		@Pc(92) Class3_Sub1 local92 = (Class3_Sub1) Static274.aClass229_31.method5328();
		@Pc(110) int local110;
		@Pc(130) int local130;
		@Pc(146) int local146;
		@Pc(160) boolean local160;
		@Pc(214) int local214;
		@Pc(220) int local220;
		@Pc(231) int local231;
		if (local92 != null || Static150.method2672() - 2000L > Static116.aLong198) {
			@Pc(107) boolean local107 = false;
			local110 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
			for (@Pc(115) Class3_Sub1 local115 = (Class3_Sub1) Static397.aClass229_45.method5328(); local115 != null && Static302.aClass3_Sub2_Sub2_2.anInt7620 - local110 < 240; local115 = (Class3_Sub1) Static397.aClass229_45.method5325()) {
				local115.method5987();
				local130 = local115.method4775();
				if (local130 < 0) {
					local130 = 0;
				} else if (local130 > 65534) {
					local130 = 65534;
				}
				local146 = local115.method4777();
				if (local146 < 0) {
					local146 = 0;
				} else if (local146 > 65534) {
					local146 = 65534;
				}
				local160 = false;
				if (local115.method4775() == -1 && local115.method4777() == -1) {
					local160 = true;
					local130 = -1;
					local146 = -1;
				}
				if (local146 != Static105.anInt2327 || local130 != Static334.anInt6159) {
					if (!local107) {
						Static414.method5552(Static51.aClass92_41);
						Static302.aClass3_Sub2_Sub2_2.method6001(0);
						local107 = true;
						local110 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
					}
					local214 = local146 - Static105.anInt2327;
					Static105.anInt2327 = local146;
					local220 = local130 - Static334.anInt6159;
					Static334.anInt6159 = local130;
					local231 = (int) ((local115.method4773() - Static116.aLong198) / 20L);
					if (local231 < 8 && local214 >= -32 && local214 <= 31 && local220 >= -32 && local220 <= 31) {
						local220 += 32;
						local214 += 32;
						Static302.aClass3_Sub2_Sub2_2.method6045((local214 << 6) + (local231 << 12) + local220);
					} else if (local231 < 32 && local214 >= -128 && local214 <= 127 && local220 >= -128 && local220 <= 127) {
						local220 += 128;
						Static302.aClass3_Sub2_Sub2_2.method6001(local231 + 128);
						local214 += 128;
						Static302.aClass3_Sub2_Sub2_2.method6045(local220 + (local214 << 8));
					} else if (local231 < 32) {
						Static302.aClass3_Sub2_Sub2_2.method6001(local231 + 192);
						if (local160) {
							Static302.aClass3_Sub2_Sub2_2.method6008(Integer.MIN_VALUE);
						} else {
							Static302.aClass3_Sub2_Sub2_2.method6008(local130 << 16 | local146);
						}
					} else {
						Static302.aClass3_Sub2_Sub2_2.method6045(local231 + 57344);
						if (local160) {
							Static302.aClass3_Sub2_Sub2_2.method6008(Integer.MIN_VALUE);
						} else {
							Static302.aClass3_Sub2_Sub2_2.method6008(local146 | local130 << 16);
						}
					}
					Static116.aLong198 = local115.method4773();
				}
			}
			if (local107) {
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local110);
			}
		}
		@Pc(398) int local398;
		@Pc(443) int local443;
		if (local92 != null) {
			@Pc(382) long local382 = (local92.method4773() - Static53.aLong50) / 50L;
			if (local382 > 32767L) {
				local382 = 32767L;
			}
			Static53.aLong50 = local92.method4773();
			local398 = local92.method4775();
			if (local398 < 0) {
				local398 = 0;
			} else if (local398 > 65535) {
				local398 = 65535;
			}
			local130 = local92.method4777();
			if (local130 < 0) {
				local130 = 0;
			} else if (local130 > 65535) {
				local130 = 65535;
			}
			@Pc(430) byte local430 = 0;
			if (local92.method4772() == 2) {
				local430 = 1;
			}
			Static414.method5552(Static79.aClass92_58);
			local443 = (int) local382;
			Static302.aClass3_Sub2_Sub2_2.method6002(local443 | local430 << 15);
			Static302.aClass3_Sub2_Sub2_2.method6008(local130 | local398 << 16);
		}
		@Pc(470) int local470;
		if (Static269.anInt5026 > 0) {
			local470 = 0;
			for (local110 = 0; local110 < Static269.anInt5026; local110++) {
				if (Static389.aClass19Array1[local110].method734()) {
					local470++;
				}
			}
			if (local470 > 0) {
				if (local470 > 75) {
					local470 = 75;
				}
				Static414.method5552(Static48.aClass92_40);
				Static302.aClass3_Sub2_Sub2_2.method6001(local470 * 3);
				for (local398 = 0; local398 < Static269.anInt5026; local398++) {
					@Pc(511) Class19 local511 = Static389.aClass19Array1[local398];
					if (local511.method734()) {
						@Pc(523) long local523 = (local511.method733() - Static179.aLong110) / 50L;
						if (local523 > 65535L) {
							local523 = 65535L;
						}
						Static179.aLong110 = local511.method733();
						Static302.aClass3_Sub2_Sub2_2.method6001(local511.method735());
						Static302.aClass3_Sub2_Sub2_2.method6045((int) local523);
					}
				}
			}
		}
		if (Static241.anInt4606 > 0) {
			Static241.anInt4606--;
		}
		if (Static189.aBoolean300 && Static241.anInt4606 <= 0) {
			Static241.anInt4606 = 20;
			Static189.aBoolean300 = false;
			Static414.method5552(Static154.aClass92_103);
			Static302.aClass3_Sub2_Sub2_2.method6002((int) Static235.aFloat60 >> 3);
			Static302.aClass3_Sub2_Sub2_2.method6045((int) Static265.aFloat64 >> 3);
		}
		if (Static108.aBoolean266 && !Static284.aBoolean385) {
			Static284.aBoolean385 = true;
			Static414.method5552(Static123.aClass92_88);
			Static302.aClass3_Sub2_Sub2_2.method6001(1);
		}
		if (!Static108.aBoolean266 && Static284.aBoolean385) {
			Static284.aBoolean385 = false;
			Static414.method5552(Static123.aClass92_88);
			Static302.aClass3_Sub2_Sub2_2.method6001(0);
		}
		if (!Static103.aBoolean182) {
			Static414.method5552(Static221.aClass92_133);
			Static302.aClass3_Sub2_Sub2_2.method6001(0);
			local470 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
			@Pc(653) Class3_Sub2 local653 = Static123.aClass21_Sub1_1.method789();
			Static302.aClass3_Sub2_Sub2_2.method6026(local653.anInt7620, local653.aByteArray95);
			Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local470);
			Static103.aBoolean182 = true;
		}
		if (Static151.aClass217ArrayArrayArray3 != null) {
			if (Static107.anInt2382 == 2) {
				Static138.method2518();
			} else if (Static107.anInt2382 == 3) {
				Static238.method3733();
			}
		}
		if (Static97.aBoolean164) {
			Static97.aBoolean164 = false;
		} else {
			Static393.aFloat92 /= 2.0F;
		}
		if (Static161.aBoolean265) {
			Static161.aBoolean265 = false;
		} else {
			Static15.aFloat3 /= 2.0F;
		}
		Static371.method5165();
		if (Static142.anInt3209 != 30) {
			return;
		}
		Static265.method3998();
		Static347.method4978();
		Static229.method3577();
		Static172.method2975();
		Static19.anInt597++;
		if (Static19.anInt597 > 750) {
			Static237.method3708();
			return;
		}
		Static269.method4036();
		Static281.method4136();
		Static120.method2157();
		for (local470 = Static369.aClass11_1.method466(true); local470 != -1; local470 = Static369.aClass11_1.method466(false)) {
			Static157.method2730(local470);
			Static402.anIntArray496[Static118.anInt2603++ & 0x1F] = local470;
		}
		@Pc(787) Class68 local787;
		for (@Pc(763) Class3_Sub3_Sub7 local763 = Static153.method2714(); local763 != null; local763 = Static153.method2714()) {
			local398 = local763.method1565();
			local130 = local763.method1569();
			if (local398 == 1) {
				Static436.anIntArray560[local130] = local763.anInt1933;
				Static184.aBoolean290 |= Static372.aBooleanArray9[local130];
				Static292.anIntArray409[Static406.anInt7057++ & 0x1F] = local130;
			} else if (local398 == 2) {
				Static306.aStringArray130[local130] = local763.aString16;
				Static401.anIntArray495[Static244.anInt4637++ & 0x1F] = local130;
			} else if (local398 == 3) {
				local787 = Static321.method4661(local130);
				if (!local763.aString16.equals(local787.aString20)) {
					local787.aString20 = local763.aString16;
					Static442.method5899(local787);
				}
			} else if (local398 == 4) {
				local787 = Static321.method4661(local130);
				local443 = local763.anInt1933;
				local214 = local763.anInt1930;
				local220 = local763.anInt1932;
				if (local443 != local787.anInt2173 || local214 != local787.anInt2146 || local220 != local787.anInt2190) {
					local787.anInt2190 = local220;
					local787.anInt2173 = local443;
					local787.anInt2146 = local214;
					Static442.method5899(local787);
				}
			} else if (local398 == 5) {
				local787 = Static321.method4661(local130);
				if (local763.anInt1933 != local787.anInt2205 || local763.anInt1933 == -1) {
					local787.anInt2152 = 0;
					local787.anInt2216 = 1;
					local787.anInt2139 = 0;
					local787.anInt2205 = local763.anInt1933;
					Static442.method5899(local787);
				}
			} else if (local398 == 6) {
				local146 = local763.anInt1933;
				local443 = local146 >> 10 & 0x1F;
				local214 = local146 >> 5 & 0x1F;
				local220 = local146 & 0x1F;
				local231 = (local220 << 3) + (local443 << 19) + (local214 << 11);
				@Pc(1198) Class68 local1198 = Static321.method4661(local130);
				if (local1198.anInt2174 != local231) {
					local1198.anInt2174 = local231;
					Static442.method5899(local1198);
				}
			} else if (local398 == 7) {
				local787 = Static321.method4661(local130);
				local160 = local763.anInt1933 == 1;
				if (local787.aBoolean167 != local160) {
					local787.aBoolean167 = local160;
					Static442.method5899(local787);
				}
			} else if (local398 == 8) {
				local787 = Static321.method4661(local130);
				if (local787.anInt2141 != local763.anInt1933 || local787.anInt2195 != local763.anInt1930 || local763.anInt1932 != local787.anInt2191) {
					local787.anInt2191 = local763.anInt1932;
					local787.anInt2195 = local763.anInt1930;
					local787.anInt2141 = local763.anInt1933;
					if (local787.anInt2192 != -1) {
						if (local787.anInt2209 > 0) {
							local787.anInt2191 = local787.anInt2191 * 32 / local787.anInt2209;
						} else if (local787.anInt2157 > 0) {
							local787.anInt2191 = local787.anInt2191 * 32 / local787.anInt2157;
						}
					}
					Static442.method5899(local787);
				}
			} else if (local398 == 9) {
				local787 = Static321.method4661(local130);
				if (local763.anInt1933 != local787.anInt2192 || local787.anInt2186 != local763.anInt1930) {
					local787.anInt2192 = local763.anInt1933;
					local787.anInt2186 = local763.anInt1930;
					Static442.method5899(local787);
				}
			} else if (local398 == 10) {
				local787 = Static321.method4661(local130);
				if (local763.anInt1933 != local787.anInt2208 || local787.anInt2142 != local763.anInt1930 || local787.anInt2198 != local763.anInt1932) {
					local787.anInt2208 = local763.anInt1933;
					local787.anInt2142 = local763.anInt1930;
					local787.anInt2198 = local763.anInt1932;
					Static442.method5899(local787);
				}
			} else if (local398 == 11) {
				local787 = Static321.method4661(local130);
				local787.aByte36 = 0;
				local787.anInt2217 = local787.anInt2188 = local763.anInt1933;
				local787.aByte37 = 0;
				local787.anInt2212 = local787.anInt2185 = local763.anInt1930;
				Static442.method5899(local787);
			} else if (local398 == 12) {
				local787 = Static321.method4661(local130);
				local443 = local763.anInt1933;
				if (local787 != null && local787.anInt2182 == 0) {
					if (local787.anInt2197 - local787.lb < local443) {
						local443 = local787.anInt2197 - local787.lb;
					}
					if (local443 < 0) {
						local443 = 0;
					}
					if (local787.anInt2151 != local443) {
						local787.anInt2151 = local443;
						Static442.method5899(local787);
					}
				}
			} else if (local398 == 14) {
				local787 = Static321.method4661(local130);
				local787.anInt2159 = local763.anInt1933;
			} else if (local398 == 15) {
				Static388.anInt6735 = local763.anInt1933;
				Static116.anInt6680 = local763.anInt1930;
				Static196.aBoolean301 = true;
			} else if (local398 == 16) {
				local787 = Static321.method4661(local130);
				local787.anInt2223 = local763.anInt1933;
			}
		}
		Static429.anInt7317++;
		if (Static338.anInt1381 != 0) {
			Static189.anInt3802 += 20;
			if (Static189.anInt3802 >= 400) {
				Static338.anInt1381 = 0;
			}
		}
		if (Static165.aClass68_6 != null) {
			Static136.anInt2297++;
			if (Static136.anInt2297 >= 15) {
				Static442.method5899(Static165.aClass68_6);
				Static165.aClass68_6 = null;
			}
		}
		Static439.aBoolean517 = false;
		Static118.aClass68_3 = null;
		Static357.aBoolean447 = false;
		Static364.aClass68_12 = null;
		Static144.method2565(null, -1, -1);
		Static394.method5316(null, -1, -1);
		if (!Static59.aBoolean111) {
			Static332.anInt6029 = -1;
		}
		Static94.method1639();
		Static296.anInt5417++;
		if (Static187.aBoolean291) {
			Static414.method5552(Static332.aClass92_201);
			Static302.aClass3_Sub2_Sub2_2.method6008(Static94.anInt2029 | Static351.anInt6324 << 28 | Static40.anInt7640 << 14);
			Static187.aBoolean291 = false;
		}
		while (true) {
			@Pc(1378) Class3_Sub20 local1378;
			@Pc(1383) Class68 local1383;
			do {
				local1378 = (Class3_Sub20) Static58.aClass229_8.method5331();
				if (local1378 == null) {
					while (true) {
						do {
							local1378 = (Class3_Sub20) Class45.lb.method5331();
							if (local1378 == null) {
								while (true) {
									do {
										local1378 = (Class3_Sub20) Static392.aClass229_44.method5331();
										if (local1378 == null) {
											if (Static118.aClass68_3 == null) {
												Static167.anInt6467 = 0;
											}
											if (Static435.aClass68_14 != null) {
												Static382.method5245();
											}
											if (Static199.anInt3933 > 0 && Static19.aClass16_1.method580(82) && Static19.aClass16_1.method580(81) && Static226.anInt4383 != 0) {
												local398 = Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 - Static226.anInt4383;
												if (local398 < 0) {
													local398 = 0;
												} else if (local398 > 3) {
													local398 = 3;
												}
												Static128.method2229(local398, Static339.anInt6223 + Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0], Static108.anInt3458 - -Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0]);
											}
											Static70.method1310();
											for (local398 = 0; local398 < 5; local398++) {
												@Pc(1568) int local1568 = Static355.anIntArray460[local398]++;
											}
											if (Static184.aBoolean290 && Static150.method2672() - 60000L > Static331.aLong170) {
												Static364.method5135();
											}
											Static419.anInt7238++;
											if (Static419.anInt7238 > 500) {
												Static419.anInt7238 = 0;
												local130 = (int) (Math.random() * 8.0D);
												if ((local130 & 0x2) == 2) {
													Static444.anInt7529 += Static299.anInt5477;
												}
												if ((local130 & 0x4) == 4) {
													Static407.anInt7062 += Static239.anInt4587;
												}
												if ((local130 & 0x1) == 1) {
													Static330.anInt6009 += Static222.anInt4313;
												}
											}
											if (Static330.anInt6009 < -50) {
												Static222.anInt4313 = 2;
											}
											if (Static444.anInt7529 < -55) {
												Static299.anInt5477 = 2;
											}
											if (Static330.anInt6009 > 50) {
												Static222.anInt4313 = -2;
											}
											if (Static444.anInt7529 > 55) {
												Static299.anInt5477 = -2;
											}
											if (Static407.anInt7062 < -40) {
												Static239.anInt4587 = 1;
											}
											if (Static407.anInt7062 > 40) {
												Static239.anInt4587 = -1;
											}
											Static102.anInt618++;
											if (Static102.anInt618 > 500) {
												Static102.anInt618 = 0;
												local130 = (int) (Math.random() * 8.0D);
												if ((local130 & 0x2) == 2) {
													Static317.anInt5759 += Static9.anInt260;
												}
												if ((local130 & 0x1) == 1) {
													Static397.anInt6876 += Static21.anInt631;
												}
											}
											if (Static397.anInt6876 < -60) {
												Static21.anInt631 = 2;
											}
											if (Static317.anInt5759 < -20) {
												Static9.anInt260 = 1;
											}
											if (Static397.anInt6876 > 60) {
												Static21.anInt631 = -2;
											}
											if (Static317.anInt5759 > 10) {
												Static9.anInt260 = -1;
											}
											Static292.anInt5353++;
											if (Static292.anInt5353 > 50) {
												Static414.method5552(Static198.aClass92_122);
											}
											if (Static264.aBoolean370) {
												Static309.method4536();
												Static264.aBoolean370 = false;
											}
											try {
												if (Static122.aClass27_1 != null && Static302.aClass3_Sub2_Sub2_2.anInt7620 > 0) {
													Static408.anInt7067 += Static302.aClass3_Sub2_Sub2_2.anInt7620;
													Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
													Static292.anInt5353 = 0;
													Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
													return;
												}
												return;
											} catch (@Pc(1783) IOException local1783) {
												Static237.method3708();
												return;
											}
										}
										local1383 = local1378.aClass68_4;
										if (local1383.anInt2187 < 0) {
											break;
										}
										local787 = Static321.method4661(local1383.anInt2225);
									} while (local787 == null || local787.aClass68Array2 == null || local787.aClass68Array2.length <= local1383.anInt2187 || local787.aClass68Array2[local1383.anInt2187] != local1383);
									Static272.method4044(local1378);
								}
							}
							local1383 = local1378.aClass68_4;
							if (local1383.anInt2187 < 0) {
								break;
							}
							local787 = Static321.method4661(local1383.anInt2225);
						} while (local787 == null || local787.aClass68Array2 == null || local787.aClass68Array2.length <= local1383.anInt2187 || local1383 != local787.aClass68Array2[local1383.anInt2187]);
						Static272.method4044(local1378);
					}
				}
				local1383 = local1378.aClass68_4;
				if (local1383.anInt2187 < 0) {
					break;
				}
				local787 = Static321.method4661(local1383.anInt2225);
			} while (local787 == null || local787.aClass68Array2 == null || local1383.anInt2187 >= local787.aClass68Array2.length || local787.aClass68Array2[local1383.anInt2187] != local1383);
			Static272.method4044(local1378);
		}
	}
}
