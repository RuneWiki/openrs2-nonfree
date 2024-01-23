import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_320 = Static64.method1101("headicons_prayer");

	@OriginalMember(owner = "client!dk", name = "gb", descriptor = "[I")
	public static int[] anIntArray62 = new int[100];

	@OriginalMember(owner = "client!dk", name = "qb", descriptor = "[I")
	public static int[] anIntArray63 = new int[25];

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)Z")
	public static boolean method785() throws IOException {
		if (Static192.aClass11_36 == null) {
			return false;
		}
		@Pc(13) int local13 = Static192.aClass11_36.method273();
		if (local13 == 0) {
			return false;
		}
		if (Static216.anInt4583 == -1) {
			Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, 1);
			local13--;
			Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
			Static216.anInt4583 = Static225.aClass1_Sub16_Sub1_4.method3829();
			Static142.anInt3128 = Static41.anIntArray61[Static216.anInt4583];
		}
		if (Static142.anInt3128 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, 1);
			Static142.anInt3128 = Static225.aClass1_Sub16_Sub1_4.aByteArray62[0] & 0xFF;
		}
		if (Static142.anInt3128 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, 2);
			Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
			local13 -= 2;
			Static142.anInt3128 = Static225.aClass1_Sub16_Sub1_4.method3805();
		}
		if (local13 < Static142.anInt3128) {
			return false;
		}
		Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
		Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, Static142.anInt3128);
		Static80.anInt1797 = Static105.anInt2334;
		Static105.anInt2334 = Static97.anInt2134;
		Static97.anInt2134 = Static216.anInt4583;
		Static135.anInt3042 = 0;
		@Pc(126) int local126;
		@Pc(132) int local132;
		if (Static216.anInt4583 == 20) {
			local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
			local132 = Static225.aClass1_Sub16_Sub1_4.method3784();
			Static17.method328(local126, local132);
			Static216.anInt4583 = -1;
			return true;
		} else if (Static216.anInt4583 == 136) {
			local126 = Static225.aClass1_Sub16_Sub1_4.method3769();
			Static22.aClass38_2 = Static51.aClass72_3.method2253(local126);
			Static216.anInt4583 = -1;
			return true;
		} else if (Static216.anInt4583 == 79) {
			Static216.anInt4583 = -1;
			Static79.anInt1782 = 0;
			return true;
		} else {
			@Pc(188) int local188;
			@Pc(186) Class71 local186;
			if (Static216.anInt4583 == 89) {
				local126 = Static225.aClass1_Sub16_Sub1_4.method3764();
				local186 = Static7.method102(local126);
				for (local188 = 0; local188 < local186.anIntArray177.length; local188++) {
					local186.anIntArray177[local188] = -1;
					local186.anIntArray177[local188] = 0;
				}
				Static82.method1438(local186);
				Static216.anInt4583 = -1;
				return true;
			}
			@Pc(238) Class71 local238;
			if (Static216.anInt4583 == 7) {
				local126 = Static225.aClass1_Sub16_Sub1_4.method3817();
				local132 = Static225.aClass1_Sub16_Sub1_4.method3804();
				local188 = Static225.aClass1_Sub16_Sub1_4.method3817();
				local238 = Static7.method102(local132);
				local238.anInt2804 = local238.anInt2781 = local126;
				local238.aByte9 = 0;
				local238.aByte10 = 0;
				local238.anInt2858 = local238.anInt2834 = local188;
				Static82.method1438(local238);
				Static216.anInt4583 = -1;
				return true;
			} else if (Static216.anInt4583 == 200) {
				Static46.method825();
				Static122.anInt2705 = Static225.aClass1_Sub16_Sub1_4.method3817();
				Static216.anInt4583 = -1;
				Static149.anInt3253 = Static27.anInt651;
				return true;
			} else {
				@Pc(299) Class71 local299;
				if (Static216.anInt4583 == 172) {
					local126 = Static225.aClass1_Sub16_Sub1_4.method3804();
					local132 = Static225.aClass1_Sub16_Sub1_4.method3794();
					local299 = Static7.method102(local126);
					if (local299 != null && local299.anInt2777 == 0) {
						if (local299.anInt2813 - local299.anInt2835 < local132) {
							local132 = local299.anInt2813 - local299.anInt2835;
						}
						if (local132 < 0) {
							local132 = 0;
						}
						if (local299.anInt2779 != local132) {
							local299.anInt2779 = local132;
							Static82.method1438(local299);
						}
					}
					Static216.anInt4583 = -1;
					return true;
				}
				@Pc(375) int local375;
				@Pc(485) int local485;
				@Pc(395) int local395;
				@Pc(399) int local399;
				@Pc(481) int local481;
				@Pc(441) Class1_Sub13 local441;
				@Pc(487) int local487;
				@Pc(497) long local497;
				if (Static216.anInt4583 == 44) {
					local126 = Static225.aClass1_Sub16_Sub1_4.anInt4860 + Static142.anInt3128;
					local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
					if (local132 != Static9.anInt179) {
						Static9.anInt179 = local132;
						Static207.method3440(Static9.anInt179);
						Static118.method1951();
						Static42.method3754(Static9.anInt179);
						for (local375 = 0; local375 < 100; local375++) {
							Static73.aBooleanArray10[local375] = true;
						}
					}
					while (local188-- > 0) {
						local375 = Static225.aClass1_Sub16_Sub1_4.method3784();
						local395 = Static225.aClass1_Sub16_Sub1_4.method3805();
						local399 = Static225.aClass1_Sub16_Sub1_4.method3793();
						@Pc(406) Class1_Sub13 local406 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local375);
						if (local406 != null && local406.anInt1677 != local395) {
							Static97.method1635(true, local406);
							local406 = null;
						}
						if (local406 == null) {
							local406 = Static124.method3518(local399, local375, local395);
						}
						local406.aBoolean76 = true;
					}
					for (local441 = (Class1_Sub13) Static120.aClass102_14.method3086(); local441 != null; local441 = (Class1_Sub13) Static120.aClass102_14.method3087()) {
						if (local441.aBoolean76) {
							local441.aBoolean76 = false;
						} else {
							Static97.method1635(true, local441);
						}
					}
					Static73.aClass102_9.method3090();
					while (Static225.aClass1_Sub16_Sub1_4.anInt4860 < local126) {
						local395 = Static225.aClass1_Sub16_Sub1_4.method3784();
						local399 = Static225.aClass1_Sub16_Sub1_4.method3805();
						local481 = Static225.aClass1_Sub16_Sub1_4.method3805();
						local485 = Static225.aClass1_Sub16_Sub1_4.method3784();
						for (local487 = local399; local487 <= local481; local487++) {
							local497 = (long) local487 + ((long) local395 << 32);
							Static73.aClass102_9.method3083(new Class1_Sub15(local485), local497);
						}
					}
					Static216.anInt4583 = -1;
					return true;
				}
				@Pc(528) long local528;
				if (Static216.anInt4583 == 174) {
					local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
					local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
					@Pc(541) Class51 local541 = Static84.method1464(local188).method2273(Static225.aClass1_Sub16_Sub1_4);
					Static216.method3597(local188, Static202.method3323(local528).method1437(), 19, local541, null);
					Static216.anInt4583 = -1;
					return true;
				} else if (Static216.anInt4583 == 28) {
					local126 = Static225.aClass1_Sub16_Sub1_4.method3783();
					local132 = Static225.aClass1_Sub16_Sub1_4.method3783();
					Static20.anInt552 = local126;
					Static16.anInt379 = local132;
					Static80.method1381();
					Static216.anInt4583 = -1;
					return true;
				} else if (Static216.anInt4583 == 59) {
					local126 = Static225.aClass1_Sub16_Sub1_4.method3794();
					local132 = Static225.aClass1_Sub16_Sub1_4.method3763();
					local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
					Static177.method3020(local126);
					Static61.method1077(local188, local132);
					Static216.anInt4583 = -1;
					return true;
				} else if (Static216.anInt4583 == 145) {
					Static164.anInt3638 = Static225.aClass1_Sub16_Sub1_4.method3793();
					Static85.anInt1997 = Static225.aClass1_Sub16_Sub1_4.method3793();
					Static105.anInt2332 = Static225.aClass1_Sub16_Sub1_4.method3793();
					Static216.anInt4583 = -1;
					return true;
				} else if (Static216.anInt4583 == 150) {
					local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
					local375 = Static225.aClass1_Sub16_Sub1_4.method3784();
					if (local375 >> 30 != 0) {
						local395 = local375 >> 28 & 0x3;
						local481 = (local375 & 0x3FFF) - Static118.anInt2541;
						local399 = (local375 >> 14 & 0x3FFF) - Static198.anInt4217;
						if (local399 >= 0 && local481 >= 0 && local399 < 104 && local481 < 104) {
							local399 = local399 * 128 + 64;
							local481 = local481 * 128 + 64;
							@Pc(725) Class5_Sub3 local725 = new Class5_Sub3(local132, local395, local399, local481, Static26.method2454(local395, local481, local399) - local126, local188, Static109.anInt2430);
							Static205.aClass105_21.method3119(new Class1_Sub2_Sub16(local725));
						}
					} else if (local375 >> 29 != 0) {
						local395 = local375 & 0xFFFF;
						@Pc(746) Class5_Sub1_Sub2 local746 = Static168.aClass5_Sub1_Sub2Array1[local395];
						if (local746 != null) {
							local746.anInt3605 = 0;
							local746.anInt3631 = local188 + Static109.anInt2430;
							local746.anInt3628 = 0;
							local746.anInt3611 = local126;
							local746.anInt3622 = local132;
							if (local746.anInt3631 > Static109.anInt2430) {
								local746.anInt3605 = -1;
							}
							if (local746.anInt3622 == 65535) {
								local746.anInt3622 = -1;
							}
						}
					} else if (local375 >> 28 != 0) {
						local395 = local375 & 0xFFFF;
						@Pc(800) Class5_Sub1_Sub1 local800;
						if (Static228.anInt4794 == local395) {
							local800 = Static73.aClass5_Sub1_Sub1_1;
						} else {
							local800 = Static191.aClass5_Sub1_Sub1Array1[local395];
						}
						if (local800 != null) {
							local800.anInt3631 = local188 + Static109.anInt2430;
							local800.anInt3611 = local126;
							local800.anInt3628 = 0;
							local800.anInt3622 = local132;
							if (local800.anInt3622 == 65535) {
								local800.anInt3622 = -1;
							}
							local800.anInt3605 = 0;
							if (local800.anInt3631 > Static109.anInt2430) {
								local800.anInt3605 = -1;
							}
						}
					}
					Static216.anInt4583 = -1;
					return true;
				} else {
					@Pc(870) boolean local870;
					@Pc(970) Class51 local970;
					@Pc(868) long local868;
					@Pc(864) Class51 local864;
					@Pc(850) Class51 local850;
					if (Static216.anInt4583 == 39) {
						local850 = Static225.aClass1_Sub16_Sub1_4.method3781();
						if (local850.method1405(Static219.aClass51_1565)) {
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local868 = local864.method1388();
							local870 = false;
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (Static181.aLongArray11[local399] == local868) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								Static164.method2798(4, Static93.aClass51_672, local864);
							}
						} else if (local850.method1405(Static51.aClass51_375)) {
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local868 = local864.method1388();
							local870 = false;
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (local868 == Static181.aLongArray11[local399]) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								local970 = local850.method1433(local850.method1403(Static136.aClass51_929) + 1, local850.method1399() + -9);
								Static164.method2798(8, local970, local864);
							}
						} else if (local850.method1405(Static123.aClass51_975)) {
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local868 = local864.method1388();
							local870 = false;
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (local868 == Static181.aLongArray11[local399]) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								Static164.method2798(10, Static81.aClass51_607, local864);
							}
						} else if (local850.method1405(Static176.aClass51_1317)) {
							local864 = local850.method1433(0, local850.method1403(Static176.aClass51_1317));
							Static164.method2798(11, local864, Static81.aClass51_607);
						} else if (local850.method1405(Static82.aClass51_611)) {
							local864 = local850.method1433(0, local850.method1403(Static82.aClass51_611));
							if (Static213.anInt4561 == 0) {
								Static164.method2798(12, local864, Static81.aClass51_607);
							}
						} else if (local850.method1405(Static45.aClass51_334)) {
							local864 = local850.method1433(0, local850.method1403(Static45.aClass51_334));
							if (Static213.anInt4561 == 0) {
								Static164.method2798(13, local864, Static81.aClass51_607);
							}
						} else if (local850.method1405(Static70.aClass51_542)) {
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local868 = local864.method1388();
							local870 = false;
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (Static181.aLongArray11[local399] == local868) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								Static164.method2798(14, Static81.aClass51_607, local864);
							}
						} else if (local850.method1405(Static84.aClass51_622)) {
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local870 = false;
							local868 = local864.method1388();
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (local868 == Static181.aLongArray11[local399]) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								Static164.method2798(15, Static81.aClass51_607, local864);
							}
						} else if (local850.method1405(Static226.aClass51_1626)) {
							local870 = false;
							local864 = local850.method1433(0, local850.method1403(Static136.aClass51_929));
							local868 = local864.method1388();
							for (local399 = 0; local399 < Static113.anInt2474; local399++) {
								if (local868 == Static181.aLongArray11[local399]) {
									local870 = true;
									break;
								}
							}
							if (!local870 && Static213.anInt4561 == 0) {
								Static164.method2798(16, Static81.aClass51_607, local864);
							}
						} else {
							Static164.method2798(0, local850, Static81.aClass51_607);
						}
						Static216.anInt4583 = -1;
						return true;
					} else if (Static216.anInt4583 == 167) {
						Static90.anInt4704 = Static225.aClass1_Sub16_Sub1_4.method3809() * 30;
						Static216.anInt4583 = -1;
						Static149.anInt3253 = Static27.anInt651;
						return true;
					} else if (Static216.anInt4583 == 228) {
						Static103.method3776();
						Static216.anInt4583 = -1;
						return true;
					} else {
						@Pc(1342) int local1342;
						@Pc(1326) long local1326;
						@Pc(1365) int local1365;
						if (Static216.anInt4583 == 127) {
							local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
							local868 = Static225.aClass1_Sub16_Sub1_4.method3805();
							@Pc(1321) boolean local1321 = false;
							local1326 = Static225.aClass1_Sub16_Sub1_4.method3806();
							local481 = Static225.aClass1_Sub16_Sub1_4.method3793();
							@Pc(1336) long local1336 = local1326 + (local868 << 32);
							local485 = Static225.aClass1_Sub16_Sub1_4.method3805();
							local1342 = 0;
							label1094: while (true) {
								if (local1342 >= 100) {
									if (local481 <= 1) {
										for (local1365 = 0; local1365 < Static113.anInt2474; local1365++) {
											if (Static181.aLongArray11[local1365] == local528) {
												local1321 = true;
												break label1094;
											}
										}
									}
									break;
								}
								if (Static131.aLongArray9[local1342] == local1336) {
									local1321 = true;
									break;
								}
								local1342++;
							}
							if (!local1321 && Static213.anInt4561 == 0) {
								Static131.aLongArray9[Static201.anInt4263] = local1336;
								Static201.anInt4263 = (Static201.anInt4263 + 1) % 100;
								@Pc(1415) Class51 local1415 = Static84.method1464(local485).method2273(Static225.aClass1_Sub16_Sub1_4);
								if (local481 == 2) {
									Static216.method3597(local485, Static150.method2574(new Class51[] { Static51.aClass51_377, Static202.method3323(local528).method1437() }), 18, local1415, null);
								} else if (local481 == 1) {
									Static216.method3597(local485, Static150.method2574(new Class51[] { Static228.aClass51_1649, Static202.method3323(local528).method1437() }), 18, local1415, null);
								} else {
									Static216.method3597(local485, Static202.method3323(local528).method1437(), 18, local1415, null);
								}
							}
							Static216.anInt4583 = -1;
							return true;
						} else if (Static216.anInt4583 == 104) {
							local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
							if (Static225.aClass1_Sub16_Sub1_4.method3793() == 0) {
								Static28.aClass80Array1[local126] = new Class80();
							} else {
								Static225.aClass1_Sub16_Sub1_4.anInt4860--;
								Static28.aClass80Array1[local126] = new Class80(Static225.aClass1_Sub16_Sub1_4);
							}
							Static216.anInt4583 = -1;
							Static192.anInt4164 = Static27.anInt651;
							return true;
						} else if (Static216.anInt4583 == 94) {
							local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
							local132 = Static225.aClass1_Sub16_Sub1_4.method3764();
							local188 = Static225.aClass1_Sub16_Sub1_4.method3809();
							local441 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local132);
							if (local441 != null) {
								Static97.method1635(local188 != local441.anInt1677, local441);
							}
							Static124.method3518(local126, local132, local188);
							Static216.anInt4583 = -1;
							return true;
						} else if (Static216.anInt4583 == 253) {
							Static59.method1033();
							Static216.anInt4583 = -1;
							return false;
						} else if (Static216.anInt4583 == 62) {
							@Pc(1603) byte[] local1603 = new byte[Static142.anInt3128];
							Static225.aClass1_Sub16_Sub1_4.method3822(Static142.anInt3128, local1603);
							Static111.method1880(Static191.method3197(Static142.anInt3128, 0, local1603), true);
							Static216.anInt4583 = -1;
							return true;
						} else {
							@Pc(1754) int local1754;
							@Pc(1761) int local1761;
							if (Static216.anInt4583 == 240) {
								Static90.anInt4703 = Static27.anInt651;
								local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
								if (local528 == 0L) {
									Static157.aClass51_1213 = null;
									Static111.anInt2458 = 0;
									Static107.aClass51_786 = null;
									Static176.aClass1_Sub17Array1 = null;
									Static216.anInt4583 = -1;
									return true;
								}
								local868 = Static225.aClass1_Sub16_Sub1_4.method3791();
								Static157.aClass51_1213 = Static202.method3323(local868);
								Static107.aClass51_786 = Static202.method3323(local528);
								Static126.aByte7 = Static225.aClass1_Sub16_Sub1_4.method3802();
								local395 = Static225.aClass1_Sub16_Sub1_4.method3793();
								if (local395 == 255) {
									Static216.anInt4583 = -1;
									return true;
								}
								Static111.anInt2458 = local395;
								@Pc(1682) Class1_Sub17[] local1682 = new Class1_Sub17[100];
								for (local481 = 0; local481 < Static111.anInt2458; local481++) {
									local1682[local481] = new Class1_Sub17();
									local1682[local481].aLong170 = Static225.aClass1_Sub16_Sub1_4.method3791();
									local1682[local481].aClass51_820 = Static202.method3323(local1682[local481].aLong170);
									local1682[local481].anInt2472 = Static225.aClass1_Sub16_Sub1_4.method3805();
									local1682[local481].aByte6 = Static225.aClass1_Sub16_Sub1_4.method3802();
									local1682[local481].aClass51_819 = Static225.aClass1_Sub16_Sub1_4.method3781();
									if (Static59.aLong44 == local1682[local481].aLong170) {
										Static72.aByte4 = local1682[local481].aByte6;
									}
								}
								local1754 = Static111.anInt2458;
								while (local1754 > 0) {
									local1754--;
									@Pc(1759) boolean local1759 = true;
									for (local1761 = 0; local1761 < local1754; local1761++) {
										if (local1682[local1761].aClass51_820.method1411(local1682[local1761 + 1].aClass51_820) > 0) {
											@Pc(1785) Class1_Sub17 local1785 = local1682[local1761];
											local1759 = false;
											local1682[local1761] = local1682[local1761 + 1];
											local1682[local1761 + 1] = local1785;
										}
									}
									if (local1759) {
										break;
									}
								}
								Static176.aClass1_Sub17Array1 = local1682;
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 235) {
								Static69.method1209(Static225.aClass1_Sub16_Sub1_4.method3781());
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 153) {
								local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local132 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
								local375 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local395 = Static225.aClass1_Sub16_Sub1_4.method3793();
								Static138.method2456(local126, local395, local132, local188, true, local375);
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 213) {
								Static141.anInt3047 = Static225.aClass1_Sub16_Sub1_4.method3793();
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 88) {
								local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
								if (local126 == 65535) {
									local126 = -1;
								}
								local132 = Static225.aClass1_Sub16_Sub1_4.method3804();
								local299 = Static7.method102(local132);
								if (local299.anInt2821 != 1 || local299.anInt2805 != local126) {
									local299.anInt2805 = local126;
									local299.anInt2821 = 1;
									Static82.method1438(local299);
								}
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 187) {
								Static114.method1909(false);
								Static216.anInt4583 = -1;
								return true;
							} else if (Static216.anInt4583 == 71) {
								local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local132 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
								local375 = Static225.aClass1_Sub16_Sub1_4.method3793();
								local395 = Static225.aClass1_Sub16_Sub1_4.method3793();
								Static92.method1531(local132, local126, local395, local375, local188);
								Static216.anInt4583 = -1;
								return true;
							} else {
								@Pc(2004) Class71 local2004;
								if (Static216.anInt4583 == 11) {
									local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
									local132 = Static225.aClass1_Sub16_Sub1_4.method3764();
									local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
									local375 = Static225.aClass1_Sub16_Sub1_4.method3794();
									local2004 = Static7.method102(local132);
									if (local188 != local2004.anInt2776 || local375 != local2004.anInt2825 || local126 != local2004.anInt2844) {
										local2004.anInt2825 = local375;
										local2004.anInt2844 = local126;
										local2004.anInt2776 = local188;
										Static82.method1438(local2004);
									}
									Static216.anInt4583 = -1;
									return true;
								}
								@Pc(2162) Class51 local2162;
								@Pc(2065) long local2065;
								@Pc(2118) int local2118;
								if (Static216.anInt4583 == 221) {
									local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
									Static225.aClass1_Sub16_Sub1_4.method3802();
									local868 = Static225.aClass1_Sub16_Sub1_4.method3791();
									local1326 = Static225.aClass1_Sub16_Sub1_4.method3805();
									@Pc(2060) boolean local2060 = false;
									local2065 = Static225.aClass1_Sub16_Sub1_4.method3806();
									local487 = Static225.aClass1_Sub16_Sub1_4.method3793();
									local497 = local2065 + (local1326 << 32);
									local1365 = 0;
									label1158: while (true) {
										if (local1365 >= 100) {
											if (local487 <= 1) {
												if (Static135.anInt3030 == 1 || Static97.anInt2132 == 1) {
													local2060 = true;
												} else {
													for (local2118 = 0; local2118 < Static113.anInt2474; local2118++) {
														if (Static181.aLongArray11[local2118] == local528) {
															local2060 = true;
															break label1158;
														}
													}
												}
											}
											break;
										}
										if (Static131.aLongArray9[local1365] == local497) {
											local2060 = true;
											break;
										}
										local1365++;
									}
									if (!local2060 && Static213.anInt4561 == 0) {
										Static131.aLongArray9[Static201.anInt4263] = local497;
										Static201.anInt4263 = (Static201.anInt4263 + 1) % 100;
										local2162 = Static94.method2018(Static146.method577(Static225.aClass1_Sub16_Sub1_4).method1402());
										if (local487 == 2 || local487 == 3) {
											Static78.method1352(local2162, Static150.method2574(new Class51[] { Static51.aClass51_377, Static202.method3323(local528).method1437() }), Static202.method3323(local868).method1437());
										} else if (local487 == 1) {
											Static78.method1352(local2162, Static150.method2574(new Class51[] { Static228.aClass51_1649, Static202.method3323(local528).method1437() }), Static202.method3323(local868).method1437());
										} else {
											Static78.method1352(local2162, Static202.method3323(local528).method1437(), Static202.method3323(local868).method1437());
										}
									}
									Static216.anInt4583 = -1;
									return true;
								} else if (Static216.anInt4583 == 147) {
									local126 = Static225.aClass1_Sub16_Sub1_4.method3809();
									if (local126 == 65535) {
										local126 = -1;
									}
									Static183.method3091(local126);
									Static216.anInt4583 = -1;
									return true;
								} else if (Static216.anInt4583 == 175) {
									local126 = Static225.aClass1_Sub16_Sub1_4.method3783();
									local132 = Static225.aClass1_Sub16_Sub1_4.method3762();
									if (local126 == 65535) {
										local126 = -1;
									}
									Static71.method1255(local132, local126);
									Static216.anInt4583 = -1;
									return true;
								} else if (Static216.anInt4583 == 97) {
									local126 = Static225.aClass1_Sub16_Sub1_4.method3783();
									Static129.method2244(local126);
									Static59.anIntArray87[Static185.anInt4011++ & 0x1F] = local126 & 0x7FFF;
									Static216.anInt4583 = -1;
									return true;
								} else {
									@Pc(2344) Class51 local2344;
									if (Static216.anInt4583 == 245) {
										local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
										local2344 = Static94.method2018(Static146.method577(Static225.aClass1_Sub16_Sub1_4).method1402());
										Static164.method2798(6, local2344, Static202.method3323(local528).method1437());
										Static216.anInt4583 = -1;
										return true;
									} else if (Static216.anInt4583 == 2) {
										local126 = Static225.aClass1_Sub16_Sub1_4.method3784();
										@Pc(2373) Class1_Sub13 local2373 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local126);
										if (local2373 != null) {
											Static97.method1635(true, local2373);
										}
										if (Static172.aClass71_30 != null) {
											Static82.method1438(Static172.aClass71_30);
											Static172.aClass71_30 = null;
										}
										Static216.anInt4583 = -1;
										return true;
									} else if (Static216.anInt4583 == 188) {
										for (local126 = 0; local126 < Static191.aClass5_Sub1_Sub1Array1.length; local126++) {
											if (Static191.aClass5_Sub1_Sub1Array1[local126] != null) {
												Static191.aClass5_Sub1_Sub1Array1[local126].anInt3585 = -1;
											}
										}
										for (local132 = 0; local132 < Static168.aClass5_Sub1_Sub2Array1.length; local132++) {
											if (Static168.aClass5_Sub1_Sub2Array1[local132] != null) {
												Static168.aClass5_Sub1_Sub2Array1[local132].anInt3585 = -1;
											}
										}
										Static216.anInt4583 = -1;
										return true;
									} else {
										@Pc(2546) Class51 local2546;
										if (Static216.anInt4583 == 109) {
											local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
											@Pc(2454) byte local2454 = Static225.aClass1_Sub16_Sub1_4.method3802();
											local870 = false;
											if ((Long.MIN_VALUE & local528) != 0L) {
												local870 = true;
											}
											if (local870) {
												if (Static111.anInt2458 == 0) {
													Static216.anInt4583 = -1;
													return true;
												}
												local528 &= Long.MAX_VALUE;
												for (local399 = 0; Static111.anInt2458 > local399 && (local528 != Static176.aClass1_Sub17Array1[local399].aLong170 || Static176.aClass1_Sub17Array1[local399].anInt2472 != local188); local399++) {
												}
												if (Static111.anInt2458 > local399) {
													while (Static111.anInt2458 - 1 > local399) {
														Static176.aClass1_Sub17Array1[local399] = Static176.aClass1_Sub17Array1[local399 + 1];
														local399++;
													}
													Static111.anInt2458--;
													Static176.aClass1_Sub17Array1[Static111.anInt2458] = null;
												}
											} else {
												local2546 = Static225.aClass1_Sub16_Sub1_4.method3781();
												@Pc(2550) Class1_Sub17 local2550 = new Class1_Sub17();
												local2550.aLong170 = local528;
												local2550.aClass51_820 = Static202.method3323(local2550.aLong170);
												local2550.aClass51_819 = local2546;
												local2550.anInt2472 = local188;
												local2550.aByte6 = local2454;
												for (local485 = Static111.anInt2458 - 1; local485 >= 0; local485--) {
													local487 = Static176.aClass1_Sub17Array1[local485].aClass51_820.method1411(local2550.aClass51_820);
													if (local487 == 0) {
														Static176.aClass1_Sub17Array1[local485].anInt2472 = local188;
														Static176.aClass1_Sub17Array1[local485].aByte6 = local2454;
														Static176.aClass1_Sub17Array1[local485].aClass51_819 = local2546;
														Static216.anInt4583 = -1;
														if (local528 == Static59.aLong44) {
															Static72.aByte4 = local2454;
														}
														Static90.anInt4703 = Static27.anInt651;
														return true;
													}
													if (local487 < 0) {
														break;
													}
												}
												if (Static176.aClass1_Sub17Array1.length <= Static111.anInt2458) {
													Static216.anInt4583 = -1;
													return true;
												}
												for (local487 = Static111.anInt2458 - 1; local487 > local485; local487--) {
													Static176.aClass1_Sub17Array1[local487 + 1] = Static176.aClass1_Sub17Array1[local487];
												}
												if (Static111.anInt2458 == 0) {
													Static176.aClass1_Sub17Array1 = new Class1_Sub17[100];
												}
												Static176.aClass1_Sub17Array1[local485 + 1] = local2550;
												Static111.anInt2458++;
												if (Static59.aLong44 == local528) {
													Static72.aByte4 = local2454;
												}
											}
											Static216.anInt4583 = -1;
											Static90.anInt4703 = Static27.anInt651;
											return true;
										} else if (Static216.anInt4583 == 152) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3804();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3769();
											local238 = Static7.method102(local188);
											if (local126 == 65535) {
												local126 = -1;
											}
											@Pc(2731) Class92 local2731;
											if (local238.aBoolean122) {
												local238.anInt2806 = local126;
												local238.anInt2823 = local132;
												local2731 = Static36.method637(local126);
												local238.anInt2792 = local2731.anInt3680;
												local238.anInt2825 = local2731.anInt3675;
												local238.anInt2827 = local2731.anInt3657;
												local238.anInt2844 = local2731.anInt3668;
												local238.anInt2776 = local2731.anInt3686;
												local238.anInt2822 = local2731.anInt3697;
												if (local238.anInt2839 > 0) {
													local238.anInt2844 = local238.anInt2844 * 32 / local238.anInt2839;
												} else if (local238.anInt2855 > 0) {
													local238.anInt2844 = local238.anInt2844 * 32 / local238.anInt2855;
												}
												Static82.method1438(local238);
											} else if (local126 == -1) {
												Static216.anInt4583 = -1;
												local238.anInt2821 = 0;
												return true;
											} else {
												local2731 = Static36.method637(local126);
												local238.anInt2825 = local2731.anInt3675;
												local238.anInt2844 = local2731.anInt3668 * 100 / local132;
												local238.anInt2821 = 4;
												local238.anInt2776 = local2731.anInt3686;
												local238.anInt2805 = local126;
												Static82.method1438(local238);
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 247) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3763();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3771();
											local2344 = Static225.aClass1_Sub16_Sub1_4.method3781();
											if (local126 >= 1 && local126 <= 8) {
												if (local2344.method1401(Static110.aClass51_423)) {
													local2344 = null;
												}
												Static27.aClass51Array5[local126 - 1] = local2344;
												Static69.aBooleanArray9[local126 - 1] = local132 == 0;
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 254 || Static216.anInt4583 == 29 || Static216.anInt4583 == 80 || Static216.anInt4583 == 203 || Static216.anInt4583 == 170 || Static216.anInt4583 == 36 || Static216.anInt4583 == 168 || Static216.anInt4583 == 55 || Static216.anInt4583 == 34 || Static216.anInt4583 == 21 || Static216.anInt4583 == 66 || Static216.anInt4583 == 224) {
											Static135.method2412();
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 208) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3764();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
											local188 = local132 >> 10 & 0x1F;
											local375 = local132 >> 5 & 0x1F;
											local395 = local132 & 0x1F;
											local399 = (local395 << 3) + (local188 << 19) + (local375 << 11);
											@Pc(2984) Class71 local2984 = Static7.method102(local126);
											if (local2984.anInt2854 != local399) {
												local2984.anInt2854 = local399;
												Static82.method1438(local2984);
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 112) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
											local132 = local126 >> 6;
											@Pc(3017) Class104 local3017 = new Class104();
											local3017.anInt4003 = local126 & 0x3F;
											local3017.anInt3999 = Static225.aClass1_Sub16_Sub1_4.method3793();
											if (local3017.anInt3999 >= 0 && Static5.aClass1_Sub2_Sub1Array12.length > local3017.anInt3999) {
												if (local3017.anInt4003 == 1 || local3017.anInt4003 == 10) {
													local3017.anInt4001 = Static225.aClass1_Sub16_Sub1_4.method3805();
													Static225.aClass1_Sub16_Sub1_4.anInt4860 += 3;
												} else if (local3017.anInt4003 >= 2 && local3017.anInt4003 <= 6) {
													if (local3017.anInt4003 == 2) {
														local3017.anInt4000 = 64;
														local3017.anInt4009 = 64;
													}
													if (local3017.anInt4003 == 3) {
														local3017.anInt4009 = 0;
														local3017.anInt4000 = 64;
													}
													if (local3017.anInt4003 == 4) {
														local3017.anInt4000 = 64;
														local3017.anInt4009 = 128;
													}
													if (local3017.anInt4003 == 5) {
														local3017.anInt4000 = 0;
														local3017.anInt4009 = 64;
													}
													if (local3017.anInt4003 == 6) {
														local3017.anInt4000 = 128;
														local3017.anInt4009 = 64;
													}
													local3017.anInt4003 = 2;
													local3017.anInt4002 = Static225.aClass1_Sub16_Sub1_4.method3805();
													local3017.anInt4014 = Static225.aClass1_Sub16_Sub1_4.method3805();
													local3017.anInt4012 = Static225.aClass1_Sub16_Sub1_4.method3793();
												}
												local3017.anInt4015 = Static225.aClass1_Sub16_Sub1_4.method3805();
												if (local3017.anInt4015 == 65535) {
													local3017.anInt4015 = -1;
												}
												Static36.aClass104Array1[local132] = local3017;
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 212) {
											method787();
											Static46.method825();
											Static216.anInt4583 = -1;
											Static119.anInt4278 += 32;
											return true;
										} else if (Static216.anInt4583 == 219) {
											for (local126 = 0; local126 < Static86.anIntArray125.length; local126++) {
												if (Static230.anIntArray379[local126] != Static86.anIntArray125[local126]) {
													Static86.anIntArray125[local126] = Static230.anIntArray379[local126];
													Static99.method1646(local126);
													Static123.anIntArray163[Static119.anInt4278++ & 0x1F] = local126;
												}
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 139) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3784();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3784();
											@Pc(3241) Class1_Sub13 local3241 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local126);
											local441 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local132);
											if (local441 != null) {
												Static97.method1635(local3241 == null || local441.anInt1677 != local3241.anInt1677, local441);
											}
											if (local3241 != null) {
												local3241.method3758();
												Static120.aClass102_14.method3083(local3241, (long) local132);
											}
											local2004 = Static7.method102(local126);
											if (local2004 != null) {
												Static82.method1438(local2004);
											}
											local2004 = Static7.method102(local132);
											if (local2004 != null) {
												Static82.method1438(local2004);
												Static180.method3046(true, local2004);
											}
											if (Static9.anInt179 != -1) {
												Static55.method955(Static9.anInt179, 1);
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 10) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3787();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3771();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3793();
											Static197.anInt2422 = local132 >> 1;
											Static73.aClass5_Sub1_Sub1_1.method2797(local188, (local132 & 0x1) == 1, local126);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 40) {
											Static225.method3684();
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 82) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3787();
											if (local132 == 2) {
												Static178.method3026();
											}
											Static9.anInt179 = local126;
											Static207.method3440(local126);
											Static118.method1951();
											Static42.method3754(Static9.anInt179);
											for (local188 = 0; local188 < 100; local188++) {
												Static73.aBooleanArray10[local188] = true;
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 129) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
											if (local126 == 65535) {
												local126 = -1;
											}
											local132 = Static225.aClass1_Sub16_Sub1_4.method3793();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
											Static218.method1758(local188, local132, local126);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 17) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3809();
											@Pc(3454) byte local3454 = Static225.aClass1_Sub16_Sub1_4.method3785();
											Static169.method2897(local126, local3454);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 140) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3784();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
											if (local126 < -70000) {
												local132 += 32768;
											}
											if (local126 < 0) {
												local299 = null;
											} else {
												local299 = Static7.method102(local126);
											}
											if (local299 != null) {
												for (local375 = 0; local375 < local299.anIntArray177.length; local375++) {
													local299.anIntArray177[local375] = 0;
													local299.anIntArray184[local375] = 0;
												}
											}
											Static132.method2333(local132);
											local375 = Static225.aClass1_Sub16_Sub1_4.method3805();
											for (local395 = 0; local395 < local375; local395++) {
												local399 = Static225.aClass1_Sub16_Sub1_4.method3809();
												local481 = Static225.aClass1_Sub16_Sub1_4.method3787();
												if (local481 == 255) {
													local481 = Static225.aClass1_Sub16_Sub1_4.method3769();
												}
												if (local299 != null && local395 < local299.anIntArray177.length) {
													local299.anIntArray177[local395] = local399;
													local299.anIntArray184[local395] = local481;
												}
												Static64.method1103(local132, local399 - 1, local395, local481);
											}
											if (local299 != null) {
												Static82.method1438(local299);
											}
											Static46.method825();
											Static59.anIntArray87[Static185.anInt4011++ & 0x1F] = local132 & 0x7FFF;
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 179) {
											local850 = Static225.aClass1_Sub16_Sub1_4.method3781();
											@Pc(3617) Object[] local3617 = new Object[local850.method1399() + 1];
											for (local188 = local850.method1399() - 1; local188 >= 0; local188--) {
												if (local850.method1408(local188) == 115) {
													local3617[local188 + 1] = Static225.aClass1_Sub16_Sub1_4.method3781();
												} else {
													local3617[local188 + 1] = Integer.valueOf(Static225.aClass1_Sub16_Sub1_4.method3784());
												}
											}
											local3617[0] = Integer.valueOf(Static225.aClass1_Sub16_Sub1_4.method3784());
											@Pc(3670) Class1_Sub21 local3670 = new Class1_Sub21();
											local3670.anObjectArray32 = local3617;
											Static65.method1119(local3670);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 216) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3809();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3804();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3783();
											local238 = Static7.method102(local132);
											local238.anInt2856 = local188 + (local126 << 16);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 101) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3763();
											local132 = Static225.aClass1_Sub16_Sub1_4.method3783();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3794();
											@Pc(3735) Class5_Sub1_Sub2 local3735 = Static168.aClass5_Sub1_Sub2Array1[local132];
											if (local3735 != null) {
												Static23.method473(local3735, local126, local188);
											}
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 27) {
											local126 = Static225.aClass1_Sub16_Sub1_4.method3809();
											local864 = Static225.aClass1_Sub16_Sub1_4.method3781();
											local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
											Static177.method3020(local126);
											Static97.method1638(local864, local188);
											Static216.anInt4583 = -1;
											return true;
										} else if (Static216.anInt4583 == 238) {
											Static128.anInt4776 = Static225.aClass1_Sub16_Sub1_4.method3793();
											Static99.anInt2154 = Static27.anInt651;
											Static216.anInt4583 = -1;
											return true;
										} else {
											@Pc(3896) Class51 local3896;
											if (Static216.anInt4583 == 135) {
												local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
												Static225.aClass1_Sub16_Sub1_4.method3802();
												local868 = Static225.aClass1_Sub16_Sub1_4.method3791();
												local1326 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local2065 = Static225.aClass1_Sub16_Sub1_4.method3806();
												@Pc(3816) boolean local3816 = false;
												@Pc(3822) long local3822 = local2065 + (local1326 << 32);
												local487 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local1754 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local2118 = 0;
												label1257: while (true) {
													if (local2118 >= 100) {
														if (local487 <= 1) {
															for (@Pc(3855) int local3855 = 0; local3855 < Static113.anInt2474; local3855++) {
																if (Static181.aLongArray11[local3855] == local528) {
																	local3816 = true;
																	break label1257;
																}
															}
														}
														break;
													}
													if (local3822 == Static131.aLongArray9[local2118]) {
														local3816 = true;
														break;
													}
													local2118++;
												}
												if (!local3816 && Static213.anInt4561 == 0) {
													Static131.aLongArray9[Static201.anInt4263] = local3822;
													Static201.anInt4263 = (Static201.anInt4263 + 1) % 100;
													local3896 = Static84.method1464(local1754).method2273(Static225.aClass1_Sub16_Sub1_4);
													if (local487 == 2 || local487 == 3) {
														Static216.method3597(local1754, Static150.method2574(new Class51[] { Static51.aClass51_377, Static202.method3323(local528).method1437() }), 20, local3896, Static202.method3323(local868).method1437());
													} else if (local487 == 1) {
														Static216.method3597(local1754, Static150.method2574(new Class51[] { Static228.aClass51_1649, Static202.method3323(local528).method1437() }), 20, local3896, Static202.method3323(local868).method1437());
													} else {
														Static216.method3597(local1754, Static202.method3323(local528).method1437(), 20, local3896, Static202.method3323(local868).method1437());
													}
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 229) {
												Static212.anInt4511 = Static225.aClass1_Sub16_Sub1_4.method3787();
												Static30.anInt2193 = Static225.aClass1_Sub16_Sub1_4.method3787();
												while (Static225.aClass1_Sub16_Sub1_4.anInt4860 < Static142.anInt3128) {
													Static216.anInt4583 = Static225.aClass1_Sub16_Sub1_4.method3793();
													Static135.method2412();
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 242) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local188 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local375 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local395 = Static225.aClass1_Sub16_Sub1_4.method3805();
												Static14.aBooleanArray7[local126] = true;
												Static20.anIntArray39[local126] = local132;
												Static13.anIntArray14[local126] = local188;
												Static14.anIntArray17[local126] = local375;
												Static112.anIntArray142[local126] = local395;
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 133) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3794();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3783();
												local2344 = Static225.aClass1_Sub16_Sub1_4.method3781();
												Static177.method3020(local126);
												Static97.method1638(local2344, local132);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 205) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3784();
												local186 = Static7.method102(local126);
												local186.anInt2821 = 3;
												local186.anInt2805 = Static73.aClass5_Sub1_Sub1_1.aClass111_2.method3281();
												Static82.method1438(local186);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 176) {
												Static98.method1645(Static225.aClass1_Sub16_Sub1_4);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 72) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3763();
												if (local126 == 65535) {
													local126 = -1;
												}
												local188 = local132 >> 2;
												local375 = local132 & 0x3;
												local395 = Static126.anIntArray173[local188];
												local399 = Static225.aClass1_Sub16_Sub1_4.method3784();
												local485 = local399 >> 14 & 0x3FFF;
												local487 = local399 & 0x3FFF;
												local485 -= Static198.anInt4217;
												@Pc(4187) int local4187 = local487 - Static118.anInt2541;
												local481 = local399 >> 28 & 0x3;
												Static191.method3196(local375, local395, local188, local126, local485, local481, local4187);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 102) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3764();
												local864 = Static225.aClass1_Sub16_Sub1_4.method3781();
												local299 = Static7.method102(local126);
												if (!local864.method1426(local299.aClass51_985)) {
													local299.aClass51_985 = local864;
													Static82.method1438(local299);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 206) {
												@Pc(4251) boolean local4251 = Static225.aClass1_Sub16_Sub1_4.method3793() == 1;
												local132 = Static225.aClass1_Sub16_Sub1_4.method3764();
												local299 = Static7.method102(local132);
												if (local4251 != local299.aBoolean121) {
													local299.aBoolean121 = local4251;
													Static82.method1438(local299);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 217) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3804();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3784();
												local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
												if (local188 == 65535) {
													local188 = -1;
												}
												local375 = Static225.aClass1_Sub16_Sub1_4.method3794();
												if (local375 == 65535) {
													local375 = -1;
												}
												for (local395 = local188; local395 <= local375; local395++) {
													@Pc(4322) long local4322 = (long) local395 + ((long) local126 << 32);
													@Pc(4327) Class1 local4327 = Static73.aClass102_9.method3093(local4322);
													if (local4327 != null) {
														local4327.method3758();
													}
													Static73.aClass102_9.method3083(new Class1_Sub15(local132), local4322);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 161) {
												local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
												local868 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local1326 = Static225.aClass1_Sub16_Sub1_4.method3806();
												local481 = Static225.aClass1_Sub16_Sub1_4.method3793();
												@Pc(4381) long local4381 = local1326 + (local868 << 32);
												@Pc(4383) boolean local4383 = false;
												local1761 = 0;
												label1294: while (true) {
													if (local1761 >= 100) {
														if (local481 <= 1) {
															if (Static135.anInt3030 == 1 || Static97.anInt2132 == 1) {
																local4383 = true;
															} else {
																for (local1342 = 0; local1342 < Static113.anInt2474; local1342++) {
																	if (local528 == Static181.aLongArray11[local1342]) {
																		local4383 = true;
																		break label1294;
																	}
																}
															}
														}
														break;
													}
													if (local4381 == Static131.aLongArray9[local1761]) {
														local4383 = true;
														break;
													}
													local1761++;
												}
												if (!local4383 && Static213.anInt4561 == 0) {
													Static131.aLongArray9[Static201.anInt4263] = local4381;
													Static201.anInt4263 = (Static201.anInt4263 + 1) % 100;
													@Pc(4464) Class51 local4464 = Static94.method2018(Static146.method577(Static225.aClass1_Sub16_Sub1_4).method1402());
													if (local481 == 2 || local481 == 3) {
														Static164.method2798(7, local4464, Static150.method2574(new Class51[] { Static51.aClass51_377, Static202.method3323(local528).method1437() }));
													} else if (local481 == 1) {
														Static164.method2798(7, local4464, Static150.method2574(new Class51[] { Static228.aClass51_1649, Static202.method3323(local528).method1437() }));
													} else {
														Static164.method2798(3, local4464, Static202.method3323(local528).method1437());
													}
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 51) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3771();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3783();
												Static17.method328(local132, local126);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 197) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3804();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local299 = Static7.method102(local126);
												if (local132 == 65535) {
													local132 = -1;
												}
												if (local299.anInt2821 != 2 || local132 != local299.anInt2805) {
													local299.anInt2821 = 2;
													local299.anInt2805 = local132;
													Static82.method1438(local299);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 4) {
												if (Static9.anInt179 != -1) {
													Static55.method955(Static9.anInt179, 0);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 233) {
												Static114.method1909(true);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 84) {
												Static113.anInt2474 = Static142.anInt3128 / 8;
												for (local126 = 0; local126 < Static113.anInt2474; local126++) {
													Static181.aLongArray11[local126] = Static225.aClass1_Sub16_Sub1_4.method3791();
													Static7.aClass51Array1[local126] = Static202.method3323(Static181.aLongArray11[local126]);
												}
												Static216.anInt4583 = -1;
												Static99.anInt2154 = Static27.anInt651;
												return true;
											} else if (Static216.anInt4583 == 15) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3784();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3805();
												if (local126 < 0) {
													local299 = null;
												} else {
													local299 = Static7.method102(local126);
												}
												if (local126 < -70000) {
													local132 += 32768;
												}
												while (Static225.aClass1_Sub16_Sub1_4.anInt4860 < Static142.anInt3128) {
													local375 = Static225.aClass1_Sub16_Sub1_4.method3797();
													local395 = Static225.aClass1_Sub16_Sub1_4.method3805();
													local399 = 0;
													if (local395 != 0) {
														local399 = Static225.aClass1_Sub16_Sub1_4.method3793();
														if (local399 == 255) {
															local399 = Static225.aClass1_Sub16_Sub1_4.method3784();
														}
													}
													if (local299 != null && local375 >= 0 && local299.anIntArray177.length > local375) {
														local299.anIntArray177[local375] = local395;
														local299.anIntArray184[local375] = local399;
													}
													Static64.method1103(local132, local395 - 1, local375, local399);
												}
												if (local299 != null) {
													Static82.method1438(local299);
												}
												Static46.method825();
												Static59.anIntArray87[Static185.anInt4011++ & 0x1F] = local132 & 0x7FFF;
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 146) {
												Static212.anInt4511 = Static225.aClass1_Sub16_Sub1_4.method3771();
												Static30.anInt2193 = Static225.aClass1_Sub16_Sub1_4.method3763();
												for (local126 = Static212.anInt4511; local126 < Static212.anInt4511 + 8; local126++) {
													for (local132 = Static30.anInt2193; local132 < Static30.anInt2193 + 8; local132++) {
														if (Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local126][local132] != null) {
															Static111.aClass105ArrayArrayArray1[Static197.anInt2422][local126][local132] = null;
															Static211.method3499(local132, local126);
														}
													}
												}
												for (@Pc(4850) Class1_Sub5 local4850 = (Class1_Sub5) Static51.aClass105_6.method3120(); local4850 != null; local4850 = (Class1_Sub5) Static51.aClass105_6.method3109()) {
													if (local4850.anInt666 >= Static212.anInt4511 && local4850.anInt666 < Static212.anInt4511 + 8 && Static30.anInt2193 <= local4850.anInt667 && local4850.anInt667 < Static30.anInt2193 + 8 && local4850.anInt672 == Static197.anInt2422) {
														local4850.anInt674 = 0;
													}
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 64) {
												Static24.method482();
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 222) {
												Static46.method825();
												Static186.anInt4029 = Static225.aClass1_Sub16_Sub1_4.method3793();
												Static216.anInt4583 = -1;
												Static149.anInt3253 = Static27.anInt651;
												return true;
											} else if (Static216.anInt4583 == 30) {
												Static223.method3661(Static225.aClass1_Sub16_Sub1_4, Static51.aClass72_3, Static142.anInt3128);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 209) {
												local528 = Static225.aClass1_Sub16_Sub1_4.method3791();
												local870 = true;
												local188 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local375 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local2546 = Static81.aClass51_607;
												if (local188 > 0) {
													local2546 = Static225.aClass1_Sub16_Sub1_4.method3781();
												}
												if (local528 < 0L) {
													local528 &= Long.MAX_VALUE;
													local870 = false;
												}
												local970 = Static202.method3323(local528).method1437();
												for (local485 = 0; local485 < Static201.anInt4259; local485++) {
													if (local528 == Static20.aLongArray3[local485]) {
														if (local188 != Static144.anIntArray215[local485]) {
															Static144.anIntArray215[local485] = local188;
															if (local188 > 0) {
																Static164.method2798(5, Static150.method2574(new Class51[] { local970, Static159.aClass51_1218 }), Static81.aClass51_607);
															}
															if (local188 == 0) {
																Static164.method2798(5, Static150.method2574(new Class51[] { local970, Static218.aClass51_751 }), Static81.aClass51_607);
															}
														}
														Static33.aClass51Array6[local485] = local2546;
														Static191.anIntArray312[local485] = local375;
														local970 = null;
														Static78.aBooleanArray12[local485] = local870;
														break;
													}
												}
												if (local970 != null && Static201.anInt4259 < 200) {
													Static20.aLongArray3[Static201.anInt4259] = local528;
													Static113.aClass51Array15[Static201.anInt4259] = local970;
													Static144.anIntArray215[Static201.anInt4259] = local188;
													Static33.aClass51Array6[Static201.anInt4259] = local2546;
													Static191.anIntArray312[Static201.anInt4259] = local375;
													Static78.aBooleanArray12[Static201.anInt4259] = local870;
													Static201.anInt4259++;
												}
												Static99.anInt2154 = Static27.anInt651;
												local1754 = Static201.anInt4259;
												while (local1754 > 0) {
													@Pc(5124) boolean local5124 = true;
													local1754--;
													for (local1761 = 0; local1761 < local1754; local1761++) {
														if (Static144.anIntArray215[local1761] != Static192.anInt4159 && Static192.anInt4159 == Static144.anIntArray215[local1761 + 1] || Static144.anIntArray215[local1761] == 0 && Static144.anIntArray215[local1761 + 1] != 0) {
															local1342 = Static144.anIntArray215[local1761];
															local5124 = false;
															Static144.anIntArray215[local1761] = Static144.anIntArray215[local1761 + 1];
															Static144.anIntArray215[local1761 + 1] = local1342;
															local2162 = Static33.aClass51Array6[local1761];
															Static33.aClass51Array6[local1761] = Static33.aClass51Array6[local1761 + 1];
															Static33.aClass51Array6[local1761 + 1] = local2162;
															local3896 = Static113.aClass51Array15[local1761];
															Static113.aClass51Array15[local1761] = Static113.aClass51Array15[local1761 + 1];
															Static113.aClass51Array15[local1761 + 1] = local3896;
															@Pc(5218) long local5218 = Static20.aLongArray3[local1761];
															Static20.aLongArray3[local1761] = Static20.aLongArray3[local1761 + 1];
															Static20.aLongArray3[local1761 + 1] = local5218;
															@Pc(5236) int local5236 = Static191.anIntArray312[local1761];
															Static191.anIntArray312[local1761] = Static191.anIntArray312[local1761 + 1];
															Static191.anIntArray312[local1761 + 1] = local5236;
															@Pc(5254) boolean local5254 = Static78.aBooleanArray12[local1761];
															Static78.aBooleanArray12[local1761] = Static78.aBooleanArray12[local1761 + 1];
															Static78.aBooleanArray12[local1761 + 1] = local5254;
														}
													}
													if (local5124) {
														break;
													}
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 234) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3766();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3804();
												local299 = Static7.method102(local132);
												if (local299.anInt2782 != local126 || local126 == -1) {
													local299.anInt2818 = 0;
													local299.anInt2782 = local126;
													local299.anInt2793 = 0;
													Static82.method1438(local299);
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 230) {
												Static46.method825();
												local126 = Static225.aClass1_Sub16_Sub1_4.method3793();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3787();
												local188 = Static225.aClass1_Sub16_Sub1_4.method3764();
												Static207.anIntArray330[local126] = local188;
												anIntArray63[local126] = local132;
												Static218.anIntArray139[local126] = 1;
												for (local375 = 0; local375 < 98; local375++) {
													if (local188 >= Class70.anIntArray336[local375]) {
														Static218.anIntArray139[local126] = local375 + 2;
													}
												}
												Static58.anIntArray86[Static127.anInt2811++ & 0x1F] = local126;
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 185) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3764();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3794();
												local188 = Static225.aClass1_Sub16_Sub1_4.method3794();
												Static177.method3020(local132);
												Static61.method1077(local188, local126);
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 132) {
												if (Static142.anInt3128 == 0) {
													Static155.aClass51_1210 = Static123.aClass51_973;
												} else {
													Static155.aClass51_1210 = Static225.aClass1_Sub16_Sub1_4.method3781();
												}
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 218) {
												Static212.anInt4511 = Static225.aClass1_Sub16_Sub1_4.method3787();
												Static30.anInt2193 = Static225.aClass1_Sub16_Sub1_4.method3793();
												Static216.anInt4583 = -1;
												return true;
											} else if (Static216.anInt4583 == 143) {
												local126 = Static225.aClass1_Sub16_Sub1_4.method3805();
												local132 = Static225.aClass1_Sub16_Sub1_4.method3764();
												Static169.method2897(local126, local132);
												Static216.anInt4583 = -1;
												return true;
											} else {
												Static34.method595("T1 - " + Static216.anInt4583 + "," + Static105.anInt2334 + "," + Static80.anInt1797 + " - " + Static142.anInt3128, null);
												Static59.method1033();
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

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
	public static void method786() {
		Static63.aClass41Array2 = null;
		Static201.aClass41Array9 = null;
		Static30.aClass1_Sub2_Sub1Array10 = null;
		Static57.aClass41Array1 = null;
	}

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V")
	public static void method787() {
		for (@Pc(11) int local11 = 0; local11 < Static67.anInt1520; local11++) {
			@Pc(17) Class10 local17 = Static203.method3265(local11);
			if (local17 != null && local17.anInt230 == 0) {
				Static230.anIntArray379[local11] = 0;
				Static86.anIntArray125[local11] = 0;
			}
		}
		Static22.aClass102_2 = new Class102(16);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method788(@OriginalArg(1) Class51 arg0) {
		@Pc(7) Class1_Sub22 local7 = Static208.method3443(arg0);
		if (local7 == null) {
			return;
		}
		Static41.anInt977 = Static108.anInt2405 + Static87.anInt2017 - local7.anInt3118;
		@Pc(28) int local28 = Static41.anInt977 - (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		@Pc(38) int local38 = Static41.anInt977 + (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		Static155.anInt3422 = local7.anInt3127 - Static200.anInt4248;
		@Pc(54) int local54 = Static155.anInt3422 + (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
		@Pc(63) int local63 = Static155.anInt3422 - (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
		if (local63 < 0) {
			Static155.anInt3422 = (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
		}
		if (local54 > Static3.anInt75) {
			Static155.anInt3422 = Static3.anInt75 - (int) ((double) Static218.aClass71_21.anInt2802 / Static10.aDouble1);
		}
		if (local28 < 0) {
			Static41.anInt977 = (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		}
		if (local38 > Static87.anInt2017) {
			Static41.anInt977 = Static87.anInt2017 - (int) ((double) Static218.aClass71_21.anInt2835 / Static10.aDouble1);
		}
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
	public static void method791() {
		for (@Pc(12) Class1_Sub18 local12 = (Class1_Sub18) Static23.aClass105_3.method3120(); local12 != null; local12 = (Class1_Sub18) Static23.aClass105_3.method3109()) {
			if (local12.aBoolean100) {
				local12.method1908();
			}
		}
		for (@Pc(32) Class1_Sub18 local32 = (Class1_Sub18) Static150.aClass105_16.method3120(); local32 != null; local32 = (Class1_Sub18) Static150.aClass105_16.method3109()) {
			if (local32.aBoolean100) {
				local32.method1908();
			}
		}
	}
}
