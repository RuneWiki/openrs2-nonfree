import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "[S")
	public static short[] aShortArray73;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "[I")
	public static final int[] anIntArray237 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public static int anInt2720 = 0;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z")
	public static boolean method2603() throws IOException {
		if (Static138.aClass159_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static138.aClass159_3.method4083();
		if (local13 == 0) {
			return false;
		}
		if (Static116.anInt2565 == -1) {
			Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, 1, 0);
			Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
			Static116.anInt2565 = Static30.aClass14_Sub4_Sub2_1.method2560();
			Static327.anInt6307 = Static107.anIntArray219[Static116.anInt2565];
			local13--;
		}
		if (Static327.anInt6307 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, 1, 0);
			local13--;
			Static327.anInt6307 = Static30.aClass14_Sub4_Sub2_1.aByteArray74[0] & 0xFF;
		}
		if (Static327.anInt6307 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, 2, 0);
			Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
			Static327.anInt6307 = Static30.aClass14_Sub4_Sub2_1.method2498();
			local13 -= 2;
		}
		if (Static327.anInt6307 > local13) {
			return false;
		}
		Static30.aClass14_Sub4_Sub2_1.anInt2637 = 0;
		Static138.aClass159_3.method4084(Static30.aClass14_Sub4_Sub2_1.aByteArray74, Static327.anInt6307, 0);
		Static81.anInt1990 = 0;
		Static28.anInt657 = Static1.anInt6422;
		Static1.anInt6422 = Static286.anInt5461;
		Static286.anInt5461 = Static116.anInt2565;
		@Pc(129) int local129;
		if (Static116.anInt2565 == 190) {
			local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
			if (Static265.method4529(local129)) {
				Static348.method4749();
			}
			Static116.anInt2565 = -1;
			return true;
		}
		@Pc(150) int local150;
		@Pc(154) int local154;
		if (Static116.anInt2565 == 82) {
			local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
			local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
			local154 = Static30.aClass14_Sub4_Sub2_1.method2554();
			if (Static265.method4529(local150)) {
				Static263.method4516(local129, local154);
			}
			Static116.anInt2565 = -1;
			return true;
		}
		@Pc(191) int local191;
		if (Static116.anInt2565 == 161) {
			local129 = Static30.aClass14_Sub4_Sub2_1.method2550();
			local150 = Static30.aClass14_Sub4_Sub2_1.method2550();
			local154 = Static30.aClass14_Sub4_Sub2_1.method2510();
			local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
			if (Static265.method4529(local191)) {
				Static292.method5002(local129, local150, local154);
			}
			Static116.anInt2565 = -1;
			return true;
		} else if (Static116.anInt2565 == 237) {
			Static328.method5649(false);
			Static116.anInt2565 = -1;
			return true;
		} else {
			@Pc(239) int local239;
			if (Static116.anInt2565 == 91) {
				local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
				local150 = Static30.aClass14_Sub4_Sub2_1.method2540();
				local154 = Static30.aClass14_Sub4_Sub2_1.method2514();
				local191 = Static30.aClass14_Sub4_Sub2_1.method2499();
				local239 = Static30.aClass14_Sub4_Sub2_1.method2540();
				if (Static265.method4529(local239)) {
					Static98.method2216(local154, local150, local191, local129);
				}
				Static116.anInt2565 = -1;
				return true;
			} else if (Static116.anInt2565 == 9) {
				for (local129 = 0; local129 < Static102.anIntArray211.length; local129++) {
					if (Static86.anIntArray191[local129] != Static102.anIntArray211[local129]) {
						Static102.anIntArray211[local129] = Static86.anIntArray191[local129];
						Static245.method3550(local129);
						Static300.anIntArray610[Static319.anInt6144++ & 0x1F] = local129;
					}
				}
				Static116.anInt2565 = -1;
				return true;
			} else if (Static116.anInt2565 == 143) {
				local129 = Static30.aClass14_Sub4_Sub2_1.method2514();
				local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
				local154 = Static30.aClass14_Sub4_Sub2_1.method2499();
				if (Static265.method4529(local154)) {
					Static44.method1087(local150, local129);
				}
				Static116.anInt2565 = -1;
				return true;
			} else if (Static116.anInt2565 == 211) {
				local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local154 = Static30.aClass14_Sub4_Sub2_1.method2554();
				if (Static265.method4529(local150)) {
					Static330.method5672(local154, local129);
				}
				Static116.anInt2565 = -1;
				return true;
			} else if (Static116.anInt2565 == 204) {
				Static281.anInt5357 = Static30.aClass14_Sub4_Sub2_1.method2548();
				Static257.anInt4476 = Static30.aClass14_Sub4_Sub2_1.method2548();
				Static138.anInt2948 = Static30.aClass14_Sub4_Sub2_1.method2548();
				Static116.anInt2565 = -1;
				return true;
			} else {
				@Pc(407) int local407;
				if (Static116.anInt2565 == 66) {
					local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
					local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
					local154 = Static30.aClass14_Sub4_Sub2_1.method2548();
					local191 = Static30.aClass14_Sub4_Sub2_1.method2548();
					local239 = Static30.aClass14_Sub4_Sub2_1.method2548();
					local407 = Static30.aClass14_Sub4_Sub2_1.method2498();
					if (Static265.method4529(local129)) {
						Static189.aBooleanArray24[local150] = true;
						Static282.anIntArray488[local150] = local154;
						Static325.anIntArray600[local150] = local191;
						Static271.anIntArray469[local150] = local239;
						Static102.anIntArray210[local150] = local407;
					}
					Static116.anInt2565 = -1;
					return true;
				} else if (Static116.anInt2565 == 26) {
					local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
					local150 = Static30.aClass14_Sub4_Sub2_1.method2539();
					local154 = Static30.aClass14_Sub4_Sub2_1.method2499();
					if (Static265.method4529(local129)) {
						if (local150 == 2) {
							Static202.method3735();
						}
						Static324.anInt6226 = local154;
						Static224.method4012(local154);
						Static161.method3223(false);
						Static10.method224(Static324.anInt6226);
						for (local191 = 0; local191 < 100; local191++) {
							Static338.aBooleanArray29[local191] = true;
						}
					}
					Static116.anInt2565 = -1;
					return true;
				} else {
					@Pc(541) int local541;
					@Pc(505) boolean local505;
					@Pc(509) String local509;
					@Pc(511) String local511;
					@Pc(522) long local522;
					@Pc(527) long local527;
					@Pc(531) int local531;
					if (Static116.anInt2565 == 96) {
						local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
						local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
						local511 = local509;
						if (local505) {
							local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
						}
						local522 = Static30.aClass14_Sub4_Sub2_1.method2498();
						local527 = Static30.aClass14_Sub4_Sub2_1.method2501();
						local531 = Static30.aClass14_Sub4_Sub2_1.method2548();
						@Pc(537) long local537 = local527 + (local522 << 32);
						@Pc(539) boolean local539 = false;
						local541 = 0;
						while (true) {
							if (local541 >= 100) {
								if (local531 <= 1) {
									if (Static8.aBoolean9 && !Static104.aBoolean162 || Static318.aBoolean423) {
										local539 = true;
									} else if (Static82.method2033(local511)) {
										local539 = true;
									}
								}
								break;
							}
							if (local537 == Static213.aLongArray6[local541]) {
								local539 = true;
								break;
							}
							local541++;
						}
						if (!local539 && Static223.anInt5821 == 0) {
							Static213.aLongArray6[Static191.anInt3908] = local537;
							Static191.anInt3908 = (Static191.anInt3908 + 1) % 100;
							@Pc(603) String local603 = Static131.method1810(Static323.method977(Static70.method1721(Static30.aClass14_Sub4_Sub2_1)));
							if (local531 == 2) {
								Static167.method4774(7, null, "<img=1>" + local509, 0, "<img=1>" + local511, -1, local603);
							} else if (local531 == 1) {
								Static167.method4774(7, null, "<img=0>" + local509, 0, "<img=0>" + local511, -1, local603);
							} else {
								Static167.method4774(3, null, local509, 0, local511, -1, local603);
							}
						}
						Static116.anInt2565 = -1;
						return true;
					} else if (Static116.anInt2565 == 53) {
						local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
						local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
						local154 = Static30.aClass14_Sub4_Sub2_1.method2510();
						if (Static265.method4529(local129)) {
							Static90.method2137(local154, local509);
						}
						Static116.anInt2565 = -1;
						return true;
					} else if (Static116.anInt2565 == 68) {
						Static214.method3858();
						Static279.anInt5303 = Static30.aClass14_Sub4_Sub2_1.method2548();
						Static116.anInt2565 = -1;
						Static149.anInt3221 = Static348.anInt5338;
						return true;
					} else {
						@Pc(772) int local772;
						@Pc(762) String local762;
						@Pc(758) String local758;
						@Pc(746) String local746;
						if (Static116.anInt2565 == 128) {
							local129 = Static30.aClass14_Sub4_Sub2_1.method2548();
							@Pc(738) boolean local738 = (local129 & 0x1) == 1;
							local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
							local746 = Static30.aClass14_Sub4_Sub2_1.method2496();
							if (local746.equals("")) {
								local746 = local511;
							}
							local758 = Static30.aClass14_Sub4_Sub2_1.method2496();
							local762 = Static30.aClass14_Sub4_Sub2_1.method2496();
							if (local762.equals("")) {
								local762 = local758;
							}
							if (local738) {
								for (local772 = 0; local772 < Static217.anInt4354; local772++) {
									if (Static326.aStringArray71[local772].equals(local762)) {
										Static38.aStringArray20[local772] = local511;
										Static326.aStringArray71[local772] = local746;
										Static143.aStringArray40[local772] = local758;
										Static222.aStringArray58[local772] = local762;
										break;
									}
								}
							} else {
								Static38.aStringArray20[Static217.anInt4354] = local511;
								Static326.aStringArray71[Static217.anInt4354] = local746;
								Static143.aStringArray40[Static217.anInt4354] = local758;
								Static222.aStringArray58[Static217.anInt4354] = local762;
								Static112.aBooleanArray11[Static217.anInt4354] = (local129 & 0x2) == 2;
								Static217.anInt4354++;
							}
							Static116.anInt2565 = -1;
							Static342.anInt6538 = Static348.anInt5338;
							return true;
						} else if (Static116.anInt2565 == 202) {
							Static7.anInt191 = Static30.aClass14_Sub4_Sub2_1.method2548();
							Static116.anInt2565 = -1;
							return true;
						} else if (Static116.anInt2565 == 14) {
							Static214.method3858();
							Static265.anInt5046 = Static30.aClass14_Sub4_Sub2_1.method2502();
							Static116.anInt2565 = -1;
							Static149.anInt3221 = Static348.anInt5338;
							return true;
						} else if (Static116.anInt2565 == 61) {
							local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
							Static192.method3652(local129);
							Static23.anIntArray39[Static319.anInt6141++ & 0x1F] = local129 & 0x7FFF;
							Static116.anInt2565 = -1;
							return true;
						} else if (Static116.anInt2565 == 92) {
							local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
							local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
							@Pc(922) Object[] local922 = new Object[local509.length() + 1];
							for (local191 = local509.length() - 1; local191 >= 0; local191--) {
								if (local509.charAt(local191) == 's') {
									local922[local191 + 1] = Static30.aClass14_Sub4_Sub2_1.method2496();
								} else {
									local922[local191 + 1] = Integer.valueOf(Static30.aClass14_Sub4_Sub2_1.method2510());
								}
							}
							local922[0] = Integer.valueOf(Static30.aClass14_Sub4_Sub2_1.method2510());
							if (Static265.method4529(local129)) {
								@Pc(980) Class14_Sub15 local980 = new Class14_Sub15();
								local980.anObjectArray3 = local922;
								Static10.method223(local980);
							}
							Static116.anInt2565 = -1;
							return true;
						} else if (Static116.anInt2565 == 252) {
							Static341.anInt6534 = Static30.aClass14_Sub4_Sub2_1.method2548();
							Static116.anInt2565 = -1;
							Static342.anInt6538 = Static348.anInt5338;
							return true;
						} else if (Static116.anInt2565 == 12) {
							if (Static324.anInt6226 != -1) {
								Static266.method4536(0, Static324.anInt6226);
							}
							Static116.anInt2565 = -1;
							return true;
						} else {
							@Pc(1065) int local1065;
							@Pc(1123) String local1123;
							if (Static116.anInt2565 == 194) {
								local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
								local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
								local511 = local509;
								if (local505) {
									local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
								}
								local522 = Static30.aClass14_Sub4_Sub2_1.method2498();
								local527 = Static30.aClass14_Sub4_Sub2_1.method2501();
								local531 = Static30.aClass14_Sub4_Sub2_1.method2548();
								local1065 = Static30.aClass14_Sub4_Sub2_1.method2498();
								@Pc(1071) long local1071 = local527 + (local522 << 32);
								@Pc(1073) boolean local1073 = false;
								@Pc(1075) int local1075 = 0;
								while (true) {
									if (local1075 >= 100) {
										if (local531 <= 1 && Static82.method2033(local511)) {
											local1073 = true;
										}
										break;
									}
									if (local1071 == Static213.aLongArray6[local1075]) {
										local1073 = true;
										break;
									}
									local1075++;
								}
								if (!local1073 && Static223.anInt5821 == 0) {
									Static213.aLongArray6[Static191.anInt3908] = local1071;
									Static191.anInt3908 = (Static191.anInt3908 + 1) % 100;
									local1123 = Static209.method3811(local1065).method3078(Static30.aClass14_Sub4_Sub2_1);
									if (local531 == 2) {
										Static167.method4774(18, null, "<img=1>" + local509, 0, "<img=1>" + local511, local1065, local1123);
									} else if (local531 == 1) {
										Static167.method4774(18, null, "<img=0>" + local509, 0, "<img=0>" + local511, local1065, local1123);
									} else {
										Static167.method4774(18, null, local509, 0, local511, local1065, local1123);
									}
								}
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 225) {
								local129 = Static30.aClass14_Sub4_Sub2_1.method2525();
								local150 = Static30.aClass14_Sub4_Sub2_1.method2510();
								local154 = Static30.aClass14_Sub4_Sub2_1.method2548();
								local746 = "";
								local758 = local746;
								if ((local154 & 0x1) != 0) {
									local746 = Static30.aClass14_Sub4_Sub2_1.method2496();
									if ((local154 & 0x2) == 0) {
										local758 = local746;
									} else {
										local758 = Static30.aClass14_Sub4_Sub2_1.method2496();
									}
								}
								local762 = Static30.aClass14_Sub4_Sub2_1.method2496();
								if (local129 == 99) {
									Static85.method2094(local762);
								} else if (local758.equals("") || !Static82.method2033(local758)) {
									Static352.method5922(local129, local150, local746, local762, local758);
								} else {
									Static116.anInt2565 = -1;
									return true;
								}
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 156) {
								Static33.method831();
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 206) {
								local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
								local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
								@Pc(1303) byte local1303 = Static30.aClass14_Sub4_Sub2_1.method2553();
								if (Static265.method4529(local129)) {
									Static263.method4516(local150, local1303);
								}
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 83) {
								local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
								local150 = Static30.aClass14_Sub4_Sub2_1.method2510();
								if (Static265.method4529(local129)) {
									@Pc(1339) Class14_Sub27 local1339 = (Class14_Sub27) Static198.aClass25_20.method691((long) local150);
									if (local1339 != null) {
										Static81.method2015(true, false, local1339);
									}
									if (Static278.aClass146_51 != null) {
										Static166.method3295(Static278.aClass146_51);
										Static278.aClass146_51 = null;
									}
								}
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 58) {
								local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
								local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
								local154 = Static30.aClass14_Sub4_Sub2_1.method2498();
								local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
								if (Static265.method4529(local129) && Static182.aClass146ArrayArray1[local150] != null) {
									for (local239 = local154; local239 < local191; local239++) {
										local407 = Static30.aClass14_Sub4_Sub2_1.method2501();
										if (Static182.aClass146ArrayArray1[local150].length > local239 && Static182.aClass146ArrayArray1[local150][local239] != null) {
											Static182.aClass146ArrayArray1[local150][local239].anInt4149 = local407;
										}
									}
								}
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 184) {
								local129 = Static30.aClass14_Sub4_Sub2_1.method2554();
								local150 = Static30.aClass14_Sub4_Sub2_1.method2499();
								Static307.method2747(local150, local129);
								Static116.anInt2565 = -1;
								return true;
							} else if (Static116.anInt2565 == 22 || Static116.anInt2565 == 201 || Static116.anInt2565 == 232 || Static116.anInt2565 == 125 || Static116.anInt2565 == 142 || Static116.anInt2565 == 159 || Static116.anInt2565 == 157 || Static116.anInt2565 == 38 || Static116.anInt2565 == 73 || Static116.anInt2565 == 249 || Static116.anInt2565 == 80 || Static116.anInt2565 == 119 || Static116.anInt2565 == 199 || Static116.anInt2565 == 227 || Static116.anInt2565 == 196) {
								Static353.method5969();
								Static116.anInt2565 = -1;
								return true;
							} else {
								@Pc(1554) Class14_Sub27 local1554;
								if (Static116.anInt2565 == 220) {
									local129 = Static30.aClass14_Sub4_Sub2_1.method2554();
									local150 = Static30.aClass14_Sub4_Sub2_1.method2540();
									local154 = Static30.aClass14_Sub4_Sub2_1.method2554();
									if (Static265.method4529(local150)) {
										@Pc(1545) Class14_Sub27 local1545 = (Class14_Sub27) Static198.aClass25_20.method691((long) local129);
										local1554 = (Class14_Sub27) Static198.aClass25_20.method691((long) local154);
										if (local1554 != null) {
											Static81.method2015(local1545 == null || local1554.anInt5186 != local1545.anInt5186, false, local1554);
										}
										if (local1545 != null) {
											local1545.method5986();
											Static198.aClass25_20.method687((long) local154, local1545);
										}
										@Pc(1585) Class146 local1585 = Static273.method4632(local129);
										if (local1585 != null) {
											Static166.method3295(local1585);
										}
										local1585 = Static273.method4632(local154);
										if (local1585 != null) {
											Static166.method3295(local1585);
											Static191.method3632(local1585, true);
										}
										if (Static324.anInt6226 != -1) {
											Static266.method4536(1, Static324.anInt6226);
										}
									}
									Static116.anInt2565 = -1;
									return true;
								} else if (Static116.anInt2565 == 30) {
									Static214.method3858();
									local129 = Static30.aClass14_Sub4_Sub2_1.method2552();
									local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
									local154 = Static30.aClass14_Sub4_Sub2_1.method2511();
									Static234.anIntArray413[local154] = local129;
									Static201.anIntArray352[local154] = local150;
									Static250.anIntArray436[local154] = 1;
									local191 = Static209.anIntArray376[local154] - 1;
									for (local239 = 0; local239 < local191; local239++) {
										if (local129 >= Class14_Sub3_Sub10.anIntArray181[local239]) {
											Static250.anIntArray436[local154] = local239 + 2;
										}
									}
									Static115.anIntArray224[Static169.anInt3515++ & 0x1F] = local154;
									Static116.anInt2565 = -1;
									return true;
								} else if (Static116.anInt2565 == 121) {
									if (Static267.aFrame1 != null) {
										Static288.method4959(false, -1, Static333.anInt6446, -1);
									}
									@Pc(1705) byte[] local1705 = new byte[Static327.anInt6307];
									Static30.aClass14_Sub4_Sub2_1.method2563(local1705, Static327.anInt6307);
									local509 = Static218.method3933(0, Static327.anInt6307, local1705);
									Static65.method5164(Static105.aClass15_2, Static67.anInt1615 == 1, local509, true);
									Static116.anInt2565 = -1;
									return true;
								} else if (Static116.anInt2565 == 8) {
									local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
									local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
									local154 = Static30.aClass14_Sub4_Sub2_1.method2548();
									local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
									local239 = Static30.aClass14_Sub4_Sub2_1.method2548();
									local407 = Static30.aClass14_Sub4_Sub2_1.method2548();
									if (Static265.method4529(local129)) {
										Static58.method1314(local239, local154, true, local150, local191, local407);
									}
									Static116.anInt2565 = -1;
									return true;
								} else if (Static116.anInt2565 == 215) {
									local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
									local150 = Static30.aClass14_Sub4_Sub2_1.method2499();
									local154 = Static30.aClass14_Sub4_Sub2_1.method2554();
									local191 = Static30.aClass14_Sub4_Sub2_1.method2540();
									if (Static265.method4529(local129)) {
										Static316.method3313((local191 << 16) + local150, local154);
									}
									Static116.anInt2565 = -1;
									return true;
								} else if (Static116.anInt2565 == 138) {
									local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
									local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
									local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
									if (Static265.method4529(local129)) {
										Static266.method4534(local511, local150);
									}
									Static116.anInt2565 = -1;
									return true;
								} else {
									@Pc(1887) long local1887;
									@Pc(1891) int local1891;
									@Pc(1958) String local1958;
									@Pc(1895) int local1895;
									if (Static116.anInt2565 == 146) {
										local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
										local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
										local511 = local509;
										if (local505) {
											local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
										}
										local522 = Static30.aClass14_Sub4_Sub2_1.method2516();
										local527 = Static30.aClass14_Sub4_Sub2_1.method2498();
										local1887 = Static30.aClass14_Sub4_Sub2_1.method2501();
										local1891 = Static30.aClass14_Sub4_Sub2_1.method2548();
										local1895 = Static30.aClass14_Sub4_Sub2_1.method2498();
										@Pc(1901) long local1901 = local1887 + (local527 << 32);
										@Pc(1903) boolean local1903 = false;
										@Pc(1905) int local1905 = 0;
										while (true) {
											if (local1905 >= 100) {
												if (local1891 <= 1 && Static82.method2033(local511)) {
													local1903 = true;
												}
												break;
											}
											if (local1901 == Static213.aLongArray6[local1905]) {
												local1903 = true;
												break;
											}
											local1905++;
										}
										if (!local1903 && Static223.anInt5821 == 0) {
											Static213.aLongArray6[Static191.anInt3908] = local1901;
											Static191.anInt3908 = (Static191.anInt3908 + 1) % 100;
											local1958 = Static209.method3811(local1895).method3078(Static30.aClass14_Sub4_Sub2_1);
											if (local1891 == 2) {
												Static167.method4774(20, Static258.method4433(local522), "<img=1>" + local509, 0, "<img=1>" + local511, local1895, local1958);
											} else if (local1891 == 1) {
												Static167.method4774(20, Static258.method4433(local522), "<img=0>" + local509, 0, "<img=0>" + local511, local1895, local1958);
											} else {
												Static167.method4774(20, Static258.method4433(local522), local509, 0, local511, local1895, local1958);
											}
										}
										Static116.anInt2565 = -1;
										return true;
									} else if (Static116.anInt2565 == 150) {
										Static328.method5649(true);
										Static116.anInt2565 = -1;
										return true;
									} else if (Static116.anInt2565 == 170) {
										Static217.anInt4354 = Static30.aClass14_Sub4_Sub2_1.method2548();
										for (local129 = 0; local129 < Static217.anInt4354; local129++) {
											Static38.aStringArray20[local129] = Static30.aClass14_Sub4_Sub2_1.method2496();
											Static326.aStringArray71[local129] = Static30.aClass14_Sub4_Sub2_1.method2496();
											if (Static326.aStringArray71[local129].equals("")) {
												Static326.aStringArray71[local129] = Static38.aStringArray20[local129];
											}
											Static143.aStringArray40[local129] = Static30.aClass14_Sub4_Sub2_1.method2496();
											Static222.aStringArray58[local129] = Static30.aClass14_Sub4_Sub2_1.method2496();
											if (Static222.aStringArray58[local129].equals("")) {
												Static222.aStringArray58[local129] = Static143.aStringArray40[local129];
											}
											Static112.aBooleanArray11[local129] = false;
										}
										Static342.anInt6538 = Static348.anInt5338;
										Static116.anInt2565 = -1;
										return true;
									} else if (Static116.anInt2565 == 18) {
										local129 = Static30.aClass14_Sub4_Sub2_1.method2548();
										if (Static30.aClass14_Sub4_Sub2_1.method2548() == 0) {
											Static278.aClass160Array1[local129] = new Class160();
										} else {
											Static30.aClass14_Sub4_Sub2_1.anInt2637--;
											Static278.aClass160Array1[local129] = new Class160(Static30.aClass14_Sub4_Sub2_1);
										}
										Static116.anInt2565 = -1;
										Static288.anInt5565 = Static348.anInt5338;
										return true;
									} else if (Static116.anInt2565 == 94) {
										if (Static327.anInt6307 == 0) {
											Static45.aString44 = Static104.aString86;
										} else {
											Static45.aString44 = Static30.aClass14_Sub4_Sub2_1.method2496();
										}
										Static116.anInt2565 = -1;
										return true;
									} else {
										@Pc(2315) boolean local2315;
										if (Static116.anInt2565 == 213) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2499();
											local154 = Static30.aClass14_Sub4_Sub2_1.method2499();
											local191 = Static30.aClass14_Sub4_Sub2_1.method2510();
											if (local191 >> 30 == 0) {
												@Pc(2331) Class78 local2331;
												@Pc(2358) Class79 local2358;
												@Pc(2351) Class79 local2351;
												@Pc(2390) Class79 local2390;
												@Pc(2336) Class78 local2336;
												if (local191 >> 29 != 0) {
													local239 = local191 & 0xFFFF;
													@Pc(2304) Class10_Sub3_Sub3_Sub1 local2304 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local239];
													if (local2304 != null) {
														if (local154 == 65535) {
															local154 = -1;
														}
														local2315 = true;
														if (local154 != -1 && local2304.anInt5957 != -1) {
															if (local154 == local2304.anInt5957) {
																local2331 = Static76.method1908(local154);
																if (local2331.aBoolean161 && local2331.anInt2302 != -1) {
																	local2390 = Static233.method4080(local2331.anInt2302);
																	local1891 = local2390.anInt2361;
																	if (local1891 == 0 || local1891 == 2) {
																		local2315 = false;
																	} else if (local1891 == 1) {
																		local2315 = true;
																	}
																}
															} else {
																local2331 = Static76.method1908(local154);
																local2336 = Static76.method1908(local2304.anInt5957);
																if (local2331.anInt2302 != -1 && local2336.anInt2302 != -1) {
																	local2351 = Static233.method4080(local2331.anInt2302);
																	local2358 = Static233.method4080(local2336.anInt2302);
																	if (local2358.anInt2357 > local2351.anInt2357) {
																		local2315 = false;
																	}
																}
															}
														}
														if (local2315) {
															local2304.anInt5952 = 0;
															local2304.anInt5917 = local150;
															local2304.anInt5957 = local154;
															local2304.anInt5962 = 0;
															local2304.anInt5953 = 1;
															local2304.anInt5969 = Static153.anInt3257 + local129;
															if (Static153.anInt3257 < local2304.anInt5969) {
																local2304.anInt5962 = -1;
															}
															if (local2304.anInt5957 != -1 && local2304.anInt5969 == Static153.anInt3257) {
																local531 = Static76.method1908(local2304.anInt5957).anInt2302;
																if (local531 != -1) {
																	local2390 = Static233.method4080(local531);
																	if (local2390 != null && local2390.anIntArray217 != null) {
																		Static273.method4631(local2304.anInt5908, 0, local2304.anInt5910, false, local2390);
																	}
																}
															}
														}
													}
												} else if (local191 >> 28 != 0) {
													local239 = local191 & 0xFFFF;
													@Pc(2503) Class10_Sub3_Sub3_Sub2 local2503;
													if (Static266.anInt5054 == local239) {
														local2503 = Static173.aClass10_Sub3_Sub3_Sub2_1;
													} else {
														local2503 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local239];
													}
													if (local2503 != null) {
														if (local154 == 65535) {
															local154 = -1;
														}
														local2315 = true;
														if (local154 != -1 && local2503.anInt5957 != -1) {
															if (local2503.anInt5957 == local154) {
																local2331 = Static76.method1908(local154);
																if (local2331.aBoolean161 && local2331.anInt2302 != -1) {
																	local2390 = Static233.method4080(local2331.anInt2302);
																	local1891 = local2390.anInt2361;
																	if (local1891 == 0 || local1891 == 2) {
																		local2315 = false;
																	} else if (local1891 == 1) {
																		local2315 = true;
																	}
																}
															} else {
																local2331 = Static76.method1908(local154);
																local2336 = Static76.method1908(local2503.anInt5957);
																if (local2331.anInt2302 != -1 && local2336.anInt2302 != -1) {
																	local2351 = Static233.method4080(local2331.anInt2302);
																	local2358 = Static233.method4080(local2336.anInt2302);
																	if (local2358.anInt2357 > local2351.anInt2357) {
																		local2315 = false;
																	}
																}
															}
														}
														if (local2315) {
															local2503.anInt5917 = local150;
															local2503.anInt5952 = 0;
															local2503.anInt5962 = 0;
															local2503.anInt5953 = 1;
															local2503.anInt5957 = local154;
															local2503.anInt5969 = Static153.anInt3257 + local129;
															if (local2503.anInt5957 == 65535) {
																local2503.anInt5957 = -1;
															}
															if (Static153.anInt3257 < local2503.anInt5969) {
																local2503.anInt5962 = -1;
															}
															if (local2503.anInt5957 != -1 && Static153.anInt3257 == local2503.anInt5969) {
																local531 = Static76.method1908(local2503.anInt5957).anInt2302;
																if (local531 != -1) {
																	local2390 = Static233.method4080(local531);
																	if (local2390 != null && local2390.anIntArray217 != null) {
																		Static273.method4631(local2503.anInt5908, 0, local2503.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1 == local2503, local2390);
																	}
																}
															}
														}
													}
												}
											} else {
												local239 = local191 >> 28 & 0x3;
												local407 = (local191 >> 14 & 0x3FFF) - Static151.anInt3234;
												local772 = (local191 & 0x3FFF) - Static251.anInt3170;
												if (local407 >= 0 && local772 >= 0 && Static195.anInt3965 > local407 && Static298.anInt5716 > local772) {
													local531 = local407 * 128 + 64;
													local1065 = local772 * 128 + 64;
													@Pc(2278) Class10_Sub3_Sub5 local2278 = new Class10_Sub3_Sub5(local154, 0, Static153.anInt3257, local239, local531, Static279.method4730(local239, local531, local1065) - local150, local1065, local407, local407, local772, local772);
													Static54.aClass18_4.method451(new Class14_Sub2_Sub7(local2278));
												}
											}
											Static116.anInt2565 = -1;
											return true;
										}
										@Pc(2889) Class195 local2889;
										if (Static116.anInt2565 == 197) {
											Static121.anInt2699 = Static348.anInt5338;
											if (Static327.anInt6307 == 0) {
												Static198.aClass195Array1 = null;
												Static116.anInt2565 = -1;
												Static249.anInt4819 = 0;
												Static120.aString98 = null;
												Static23.aString23 = null;
												return true;
											}
											Static120.aString98 = Static30.aClass14_Sub4_Sub2_1.method2496();
											local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
											if (local505) {
												Static30.aClass14_Sub4_Sub2_1.method2496();
											}
											@Pc(2745) long local2745 = Static30.aClass14_Sub4_Sub2_1.method2516();
											Static23.aString23 = Static305.method5317(local2745);
											Static281.aByte55 = Static30.aClass14_Sub4_Sub2_1.method2553();
											local191 = Static30.aClass14_Sub4_Sub2_1.method2548();
											if (local191 == 255) {
												Static116.anInt2565 = -1;
												return true;
											}
											Static249.anInt4819 = local191;
											@Pc(2771) Class195[] local2771 = new Class195[100];
											for (local407 = 0; local407 < Static249.anInt4819; local407++) {
												local2771[local407] = new Class195();
												local2771[local407].aString219 = Static30.aClass14_Sub4_Sub2_1.method2496();
												local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
												if (local505) {
													local2771[local407].aString221 = Static30.aClass14_Sub4_Sub2_1.method2496();
												} else {
													local2771[local407].aString221 = local2771[local407].aString219;
												}
												local2771[local407].anInt5868 = Static30.aClass14_Sub4_Sub2_1.method2498();
												local2771[local407].aByte62 = Static30.aClass14_Sub4_Sub2_1.method2553();
												local2771[local407].aString220 = Static30.aClass14_Sub4_Sub2_1.method2496();
												if (local2771[local407].aString221.equals(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224)) {
													Static112.aByte22 = local2771[local407].aByte62;
												}
											}
											local1065 = Static249.anInt4819;
											while (local1065 > 0) {
												local2315 = true;
												local1065--;
												for (local1891 = 0; local1891 < local1065; local1891++) {
													if (local2771[local1891].aString219.compareTo(local2771[local1891 + 1].aString219) > 0) {
														local2889 = local2771[local1891];
														local2771[local1891] = local2771[local1891 + 1];
														local2771[local1891 + 1] = local2889;
														local2315 = false;
													}
												}
												if (local2315) {
													break;
												}
											}
											Static116.anInt2565 = -1;
											Static198.aClass195Array1 = local2771;
											return true;
										}
										@Pc(2932) String local2932;
										if (Static116.anInt2565 == 37) {
											local2932 = Static30.aClass14_Sub4_Sub2_1.method2496();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
											local511 = Static209.method3811(local150).method3078(Static30.aClass14_Sub4_Sub2_1);
											Static167.method4774(19, null, local2932, 0, local2932, local150, local511);
											Static116.anInt2565 = -1;
											return true;
										}
										@Pc(3220) String local3220;
										if (Static116.anInt2565 == 243) {
											local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
											local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
											local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
											local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
											local239 = Static30.aClass14_Sub4_Sub2_1.method2548();
											local762 = "";
											local2315 = false;
											if (local191 > 0) {
												local762 = Static30.aClass14_Sub4_Sub2_1.method2496();
												local2315 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
											}
											for (local531 = 0; local531 < Static302.anInt5838; local531++) {
												if (local505) {
													if (local511.equals(Static120.aStringArray36[local531])) {
														Static120.aStringArray36[local531] = local509;
														Static339.aStringArray34[local531] = local511;
														local509 = null;
														break;
													}
												} else if (local509.equals(Static120.aStringArray36[local531])) {
													if (local191 != Static54.anIntArray81[local531]) {
														Static54.anIntArray81[local531] = local191;
														if (local191 > 0) {
															Static352.method5922(5, 0, "", local509 + Static134.aString102, "");
														}
														if (local191 == 0) {
															Static352.method5922(5, 0, "", local509 + Static237.aString174, "");
														}
													}
													Static339.aStringArray34[local531] = local511;
													Static156.aStringArray70[local531] = local762;
													Static202.anIntArray354[local531] = local239;
													local509 = null;
													Static181.aBooleanArray16[local531] = local2315;
													break;
												}
											}
											if (local509 != null && Static302.anInt5838 < 200) {
												Static120.aStringArray36[Static302.anInt5838] = local509;
												Static339.aStringArray34[Static302.anInt5838] = local511;
												Static54.anIntArray81[Static302.anInt5838] = local191;
												Static156.aStringArray70[Static302.anInt5838] = local762;
												Static202.anIntArray354[Static302.anInt5838] = local239;
												Static181.aBooleanArray16[Static302.anInt5838] = local2315;
												Static302.anInt5838++;
											}
											Static342.anInt6538 = Static348.anInt5338;
											local1891 = Static302.anInt5838;
											while (local1891 > 0) {
												@Pc(3149) boolean local3149 = true;
												local1891--;
												for (local1895 = 0; local1895 < local1891; local1895++) {
													if (Static54.anIntArray81[local1895] != Static296.anInt5689 && Static296.anInt5689 == Static54.anIntArray81[local1895 + 1] || Static54.anIntArray81[local1895] == 0 && Static54.anIntArray81[local1895 + 1] != 0) {
														local541 = Static54.anIntArray81[local1895];
														Static54.anIntArray81[local1895] = Static54.anIntArray81[local1895 + 1];
														Static54.anIntArray81[local1895 + 1] = local541;
														local1123 = Static156.aStringArray70[local1895];
														Static156.aStringArray70[local1895] = Static156.aStringArray70[local1895 + 1];
														Static156.aStringArray70[local1895 + 1] = local1123;
														local3220 = Static120.aStringArray36[local1895];
														Static120.aStringArray36[local1895] = Static120.aStringArray36[local1895 + 1];
														Static120.aStringArray36[local1895 + 1] = local3220;
														local1958 = Static339.aStringArray34[local1895];
														Static339.aStringArray34[local1895] = Static339.aStringArray34[local1895 + 1];
														Static339.aStringArray34[local1895 + 1] = local1958;
														@Pc(3256) int local3256 = Static202.anIntArray354[local1895];
														Static202.anIntArray354[local1895] = Static202.anIntArray354[local1895 + 1];
														Static202.anIntArray354[local1895 + 1] = local3256;
														@Pc(3274) boolean local3274 = Static181.aBooleanArray16[local1895];
														Static181.aBooleanArray16[local1895] = Static181.aBooleanArray16[local1895 + 1];
														Static181.aBooleanArray16[local1895 + 1] = local3274;
														local3149 = false;
													}
												}
												if (local3149) {
													break;
												}
											}
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 107) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2510();
											local154 = Static30.aClass14_Sub4_Sub2_1.method2506();
											if (Static265.method4529(local129)) {
												Static9.method221(local150, local154);
											}
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 85) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2552();
											if (Static265.method4529(local129)) {
												Static336.method5780(5, 2047, local150, 0);
											}
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 137) {
											local2932 = Static30.aClass14_Sub4_Sub2_1.method2496();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
											local154 = Static30.aClass14_Sub4_Sub2_1.method2540();
											if (Static265.method4529(local154)) {
												Static266.method4534(local2932, local150);
											}
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 21) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2511();
											local150 = local129 >> 2;
											local154 = local129 & 0x3;
											local191 = anIntArray237[local150];
											local239 = Static30.aClass14_Sub4_Sub2_1.method2510();
											local407 = local239 >> 28 & 0x3;
											local772 = local239 >> 14 & 0x3FFF;
											local531 = local239 & 0x3FFF;
											local1065 = Static30.aClass14_Sub4_Sub2_1.method2505();
											@Pc(3442) int local3442 = local531 - Static251.anInt3170;
											local772 -= Static151.anInt3234;
											if (local1065 == 65535) {
												local1065 = -1;
											}
											Static348.method4752(local772, local407, local150, local3442, local1065, local191, local154);
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 5) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
											if (Static265.method4529(local129)) {
												Static50.method1215();
											}
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 103) {
											Static155.anInt3312 = Static30.aClass14_Sub4_Sub2_1.method2539();
											Static167.anInt5369 = Static30.aClass14_Sub4_Sub2_1.method2511();
											Static116.anInt2565 = -1;
											return true;
										} else if (Static116.anInt2565 == 173) {
											local129 = Static30.aClass14_Sub4_Sub2_1.method2513();
											local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
											Static212.method3823(local150, local129);
											Static116.anInt2565 = -1;
											return true;
										} else {
											@Pc(3574) long local3574;
											@Pc(3597) Class14_Sub17 local3597;
											@Pc(3582) Class14_Sub17 local3582;
											if (Static116.anInt2565 == 223) {
												local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
												local150 = Static30.aClass14_Sub4_Sub2_1.method2510();
												local154 = Static30.aClass14_Sub4_Sub2_1.method2498();
												if (local154 == 65535) {
													local154 = -1;
												}
												local191 = Static30.aClass14_Sub4_Sub2_1.method2505();
												local239 = Static30.aClass14_Sub4_Sub2_1.method2505();
												if (local239 == 65535) {
													local239 = -1;
												}
												if (Static265.method4529(local129)) {
													for (local407 = local239; local407 <= local154; local407++) {
														local3574 = (long) local407 + ((long) local150 << 32);
														local3582 = (Class14_Sub17) Static235.aClass25_23.method691(local3574);
														if (local3582 != null) {
															local3597 = new Class14_Sub17(local3582.anInt2702, local191);
															local3582.method5986();
														} else if (local407 == -1) {
															local3597 = new Class14_Sub17(Static273.method4632(local150).aClass14_Sub17_2.anInt2702, local191);
														} else {
															local3597 = new Class14_Sub17(0, local191);
														}
														Static235.aClass25_23.method687(local3574, local3597);
													}
												}
												Static116.anInt2565 = -1;
												return true;
											} else if (Static116.anInt2565 == 114) {
												local129 = Static30.aClass14_Sub4_Sub2_1.method2511();
												local150 = Static30.aClass14_Sub4_Sub2_1.method2540();
												local154 = Static30.aClass14_Sub4_Sub2_1.method2505();
												@Pc(3649) Class10_Sub3_Sub3_Sub1 local3649 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local154];
												if (local3649 != null) {
													Static348.method4754(local150, local3649, local129);
												}
												Static116.anInt2565 = -1;
												return true;
											} else if (Static116.anInt2565 == 112) {
												local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
												local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
												local154 = Static30.aClass14_Sub4_Sub2_1.method2514();
												if (Static265.method4529(local129)) {
													Static239.method5608(local154, local150);
												}
												Static116.anInt2565 = -1;
												return true;
											} else if (Static116.anInt2565 == 44) {
												Static286.method4896(Static30.aClass14_Sub4_Sub2_1, Static105.aClass15_2, Static327.anInt6307);
												Static116.anInt2565 = -1;
												return true;
											} else if (Static116.anInt2565 == 123) {
												local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
												@Pc(3714) byte local3714 = Static30.aClass14_Sub4_Sub2_1.method2553();
												Static307.method2747(local129, local3714);
												Static116.anInt2565 = -1;
												return true;
											} else if (Static116.anInt2565 == 50) {
												Static118.method2477();
												Static116.anInt2565 = -1;
												return true;
											} else {
												@Pc(3755) Class146 local3755;
												if (Static116.anInt2565 == 166) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2510();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 < -70000) {
														local150 += 32768;
													}
													if (local129 < 0) {
														local3755 = null;
													} else {
														local3755 = Static273.method4632(local129);
													}
													while (Static30.aClass14_Sub4_Sub2_1.anInt2637 < Static327.anInt6307) {
														local191 = Static30.aClass14_Sub4_Sub2_1.method2525();
														local239 = Static30.aClass14_Sub4_Sub2_1.method2498();
														local407 = 0;
														if (local239 != 0) {
															local407 = Static30.aClass14_Sub4_Sub2_1.method2548();
															if (local407 == 255) {
																local407 = Static30.aClass14_Sub4_Sub2_1.method2510();
															}
														}
														if (local3755 != null && local191 >= 0 && local191 < local3755.anIntArray374.length) {
															local3755.anIntArray374[local191] = local239;
															local3755.anIntArray361[local191] = local407;
														}
														Static200.method3727(local407, local150, local191, local239 - 1);
													}
													if (local3755 != null) {
														Static166.method3295(local3755);
													}
													Static214.method3858();
													Static23.anIntArray39[Static319.anInt6141++ & 0x1F] = local150 & 0x7FFF;
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 181) {
													Static167.anInt5369 = Static30.aClass14_Sub4_Sub2_1.method2539();
													Static155.anInt3312 = Static30.aClass14_Sub4_Sub2_1.method2513();
													for (@Pc(3876) Class14_Sub39 local3876 = (Class14_Sub39) Static65.aClass25_32.method697(); local3876 != null; local3876 = (Class14_Sub39) Static65.aClass25_32.method694()) {
														local150 = (int) (local3876.aLong217 & 0x3FFFL);
														local154 = (int) (local3876.aLong217 >> 14 & 0x3FFFL);
														local191 = (int) (local3876.aLong217 >> 28 & 0x3L);
														if (local191 == Static219.anInt4400 && Static155.anInt3312 <= local150 && Static155.anInt3312 + 8 > local150 && local154 >= Static167.anInt5369 && Static167.anInt5369 + 8 > local154) {
															local3876.method5986();
															Static82.method2034(Static219.anInt4400, local154, local150);
														}
													}
													for (@Pc(3951) Class14_Sub6 local3951 = (Class14_Sub6) Static93.aClass18_8.method459(); local3951 != null; local3951 = (Class14_Sub6) Static93.aClass18_8.method453()) {
														if (Static155.anInt3312 <= local3951.anInt867 && Static155.anInt3312 + 8 > local3951.anInt867 && local3951.anInt874 >= Static167.anInt5369 && Static167.anInt5369 + 8 > local3951.anInt874 && Static219.anInt4400 == local3951.anInt865) {
															local3951.anInt877 = 0;
														}
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 203) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2510();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
													if (local150 == 65535) {
														local150 = -1;
													}
													local154 = Static30.aClass14_Sub4_Sub2_1.method2499();
													if (local154 == 65535) {
														local154 = -1;
													}
													local191 = Static30.aClass14_Sub4_Sub2_1.method2514();
													local239 = Static30.aClass14_Sub4_Sub2_1.method2499();
													if (Static265.method4529(local239)) {
														for (local407 = local150; local407 <= local154; local407++) {
															local3574 = (long) local407 + ((long) local129 << 32);
															local3582 = (Class14_Sub17) Static235.aClass25_23.method691(local3574);
															if (local3582 != null) {
																local3597 = new Class14_Sub17(local191, local3582.anInt2691);
																local3582.method5986();
															} else if (local407 == -1) {
																local3597 = new Class14_Sub17(local191, Static273.method4632(local129).aClass14_Sub17_2.anInt2691);
															} else {
																local3597 = new Class14_Sub17(local191, -1);
															}
															Static235.aClass25_23.method687(local3574, local3597);
														}
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 148) {
													for (local129 = 0; local129 < Static29.aClass10_Sub3_Sub3_Sub2Array3.length; local129++) {
														if (Static29.aClass10_Sub3_Sub3_Sub2Array3[local129] != null) {
															Static29.aClass10_Sub3_Sub3_Sub2Array3[local129].anInt5961 = -1;
														}
													}
													for (local150 = 0; local150 < Static266.aClass10_Sub3_Sub3_Sub1Array1.length; local150++) {
														if (Static266.aClass10_Sub3_Sub3_Sub1Array1[local150] != null) {
															Static266.aClass10_Sub3_Sub3_Sub1Array1[local150].anInt5961 = -1;
														}
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 102) {
													Static137.method2763();
													Static214.method3858();
													Static116.anInt2565 = -1;
													Static319.anInt6144 += 32;
													return true;
												} else if (Static116.anInt2565 == 174) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2540();
													if (local129 == 65535) {
														local129 = -1;
													}
													local150 = Static30.aClass14_Sub4_Sub2_1.method2511();
													Static192.method3659(local150, local129);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 75) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 == 65535) {
														local129 = -1;
													}
													local150 = Static30.aClass14_Sub4_Sub2_1.method2513();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2522();
													Static228.method4033(local129, local154, local150);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 178) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local239 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local407 = Static30.aClass14_Sub4_Sub2_1.method2548();
													if (Static265.method4529(local129)) {
														Static275.method4677(local150, local191, local407, local239, local154);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 54) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2514();
													if (Static265.method4529(local129)) {
														Static336.method5780(3, -1, local150, -1);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 172) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 == 65535) {
														local129 = -1;
													}
													local150 = Static30.aClass14_Sub4_Sub2_1.method2552();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (Static265.method4529(local154)) {
														Static336.method5780(2, local129, local150, -1);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 130) {
													local2932 = Static30.aClass14_Sub4_Sub2_1.method2496();
													@Pc(4361) boolean local4361 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
													if (local4361) {
														local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
													} else {
														local509 = local2932;
													}
													local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
													@Pc(4379) byte local4379 = Static30.aClass14_Sub4_Sub2_1.method2553();
													@Pc(4381) boolean local4381 = false;
													if (local4379 == -128) {
														local4381 = true;
													}
													if (local4381) {
														if (Static249.anInt4819 == 0) {
															Static116.anInt2565 = -1;
															return true;
														}
														for (local772 = 0; Static249.anInt4819 > local772 && (!Static198.aClass195Array1[local772].aString221.equals(local509) || Static198.aClass195Array1[local772].anInt5868 != local191); local772++) {
														}
														if (Static249.anInt4819 > local772) {
															while (local772 < Static249.anInt4819 - 1) {
																Static198.aClass195Array1[local772] = Static198.aClass195Array1[local772 + 1];
																local772++;
															}
															Static249.anInt4819--;
															Static198.aClass195Array1[Static249.anInt4819] = null;
														}
													} else {
														@Pc(4392) String local4392 = Static30.aClass14_Sub4_Sub2_1.method2496();
														local2889 = new Class195();
														local2889.aString221 = local509;
														local2889.anInt5868 = local191;
														local2889.aString219 = local2932;
														local2889.aString220 = local4392;
														local2889.aByte62 = local4379;
														for (local1065 = Static249.anInt4819 - 1; local1065 >= 0; local1065--) {
															local1891 = Static198.aClass195Array1[local1065].aString221.compareTo(local2889.aString221);
															if (local1891 == 0) {
																Static198.aClass195Array1[local1065].anInt5868 = local191;
																Static198.aClass195Array1[local1065].aByte62 = local4379;
																Static198.aClass195Array1[local1065].aString220 = local4392;
																if (local509.equals(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224)) {
																	Static112.aByte22 = local4379;
																}
																Static121.anInt2699 = Static348.anInt5338;
																Static116.anInt2565 = -1;
																return true;
															}
															if (local1891 < 0) {
																break;
															}
														}
														if (Static249.anInt4819 >= Static198.aClass195Array1.length) {
															Static116.anInt2565 = -1;
															return true;
														}
														for (local1891 = Static249.anInt4819 - 1; local1891 > local1065; local1891--) {
															Static198.aClass195Array1[local1891 + 1] = Static198.aClass195Array1[local1891];
														}
														if (Static249.anInt4819 == 0) {
															Static198.aClass195Array1 = new Class195[100];
														}
														Static198.aClass195Array1[local1065 + 1] = local2889;
														Static249.anInt4819++;
														if (local509.equals(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224)) {
															Static112.aByte22 = local4379;
														}
													}
													Static121.anInt2699 = Static348.anInt5338;
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 101) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2539();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (Static265.method4529(local150)) {
														Static189.anInt6153 = local129;
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 131) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2513();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2539();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2511();
													Static219.anInt4400 = local129 >> 1;
													Static173.aClass10_Sub3_Sub3_Sub2_1.method5378(local154, (local129 & 0x1) == 1, local150, Static219.anInt4400);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 60) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2510();
													Static103.aClass205_7 = Static105.aClass15_2.method288(local129);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 183) {
													Static276.method4683(Static30.aClass14_Sub4_Sub2_1.method2496());
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 40) {
													local2932 = Static30.aClass14_Sub4_Sub2_1.method2496();
													local509 = Static131.method1810(Static323.method977(Static70.method1721(Static30.aClass14_Sub4_Sub2_1)));
													Static352.method5922(6, 0, local2932, local509, local2932);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 168) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2540();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2505();
													if (Static265.method4529(local154)) {
														Static130.method2680(local150, local129);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 43) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2505();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2510();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2510();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2540();
													if (Static265.method4529(local129)) {
														Static336.method5780(5, local191, local150, local154);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 52) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2554();
													@Pc(4795) Class146 local4795 = Static273.method4632(local129);
													for (local154 = 0; local154 < local4795.anIntArray374.length; local154++) {
														local4795.anIntArray374[local154] = -1;
														local4795.anIntArray374[local154] = 0;
													}
													Static166.method3295(local4795);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 20) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local150 = local129 >> 5;
													local154 = local129 & 0x1F;
													if (local154 == 0) {
														Static27.aClass113Array1[local150] = null;
														Static116.anInt2565 = -1;
														return true;
													}
													@Pc(4851) Class113 local4851 = new Class113();
													local4851.anInt3406 = local154;
													local4851.anInt3414 = Static30.aClass14_Sub4_Sub2_1.method2548();
													if (local4851.anInt3414 >= 0 && local4851.anInt3414 < Static257.aClass2Array12.length) {
														if (local4851.anInt3406 == 1 || local4851.anInt3406 == 10) {
															local4851.anInt3403 = Static30.aClass14_Sub4_Sub2_1.method2498();
															Static30.aClass14_Sub4_Sub2_1.anInt2637 += 5;
														} else if (local4851.anInt3406 >= 2 && local4851.anInt3406 <= 6) {
															if (local4851.anInt3406 == 2) {
																local4851.anInt3417 = 64;
																local4851.anInt3404 = 64;
															}
															if (local4851.anInt3406 == 3) {
																local4851.anInt3404 = 64;
																local4851.anInt3417 = 0;
															}
															if (local4851.anInt3406 == 4) {
																local4851.anInt3404 = 64;
																local4851.anInt3417 = 128;
															}
															if (local4851.anInt3406 == 5) {
																local4851.anInt3404 = 0;
																local4851.anInt3417 = 64;
															}
															if (local4851.anInt3406 == 6) {
																local4851.anInt3404 = 128;
																local4851.anInt3417 = 64;
															}
															local4851.anInt3406 = 2;
															local4851.anInt3408 = Static30.aClass14_Sub4_Sub2_1.method2498();
															local4851.anInt3413 = Static30.aClass14_Sub4_Sub2_1.method2498();
															local4851.anInt3418 = Static30.aClass14_Sub4_Sub2_1.method2548();
															local4851.anInt3407 = Static30.aClass14_Sub4_Sub2_1.method2498();
														}
														local4851.anInt3411 = Static30.aClass14_Sub4_Sub2_1.method2498();
														if (local4851.anInt3411 == 65535) {
															local4851.anInt3411 = -1;
														}
														Static27.aClass113Array1[local150] = local4851;
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 6) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2539();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2552();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2505();
													if (Static265.method4529(local154)) {
														Static92.method2164(local150, local129);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 31) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 == 65535) {
														local129 = -1;
													}
													local150 = Static30.aClass14_Sub4_Sub2_1.method2514();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2554();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2499();
													if (Static265.method4529(local191)) {
														@Pc(5062) Class146 local5062 = Static273.method4632(local150);
														@Pc(5080) Class220 local5080;
														if (local5062.aBoolean260) {
															Static189.method5492(local150, local154, local129);
															local5080 = Static296.method5066(local129);
															Static98.method2216(local150, local5080.anInt6710, local5080.anInt6660, local5080.anInt6662);
															Static250.method4350(local5080.anInt6695, local5080.anInt6693, local5080.anInt6661, local150);
														} else if (local129 == -1) {
															Static116.anInt2565 = -1;
															local5062.anInt4169 = 0;
															return true;
														} else {
															local5080 = Static296.method5066(local129);
															local5062.anInt4165 = local5080.anInt6710;
															local5062.anInt4211 = local5080.anInt6660 * 100 / local154;
															local5062.anInt4169 = 4;
															local5062.anInt4190 = local5080.anInt6662;
															local5062.anInt4179 = local129;
															Static166.method3295(local5062);
														}
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 191) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2499();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2505();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2505();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2540();
													local239 = Static30.aClass14_Sub4_Sub2_1.method2510();
													if (Static265.method4529(local154)) {
														Static336.method5780(7, local191 | local150 << 16, local239, local129);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 124) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
													if (local129 == 255) {
														local150 = -1;
														local129 = -1;
													}
													Static80.method1965(local150, local129);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 193) {
													Static129.anInt2792 = Static30.aClass14_Sub4_Sub2_1.method2505() * 30;
													Static149.anInt3221 = Static348.anInt5338;
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 189) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2554();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2499();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2505();
													if (local154 == 65535) {
														local154 = -1;
													}
													if (Static265.method4529(local150)) {
														Static336.method5780(1, local154, local129, -1);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 169) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2540();
													if (local150 == 65535) {
														local150 = -1;
													}
													local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2548();
													if (local129 >= 1 && local129 <= 8) {
														if (local511.equalsIgnoreCase("null")) {
															local511 = null;
														}
														Static348.aStringArray64[local129 - 1] = local511;
														Static56.anIntArray92[local129 - 1] = local150;
														Static325.aBooleanArray27[local129 - 1] = local191 == 0;
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 214) {
													Static167.anInt5369 = Static30.aClass14_Sub4_Sub2_1.method2548();
													Static155.anInt3312 = Static30.aClass14_Sub4_Sub2_1.method2513();
													while (Static327.anInt6307 > Static30.aClass14_Sub4_Sub2_1.anInt2637) {
														Static116.anInt2565 = Static30.aClass14_Sub4_Sub2_1.method2548();
														Static353.method5969();
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 245) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2514();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
													Static212.method3823(local150, local129);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 186) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2514();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2499();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2499();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2511();
													if (Static265.method4529(local154)) {
														local1554 = (Class14_Sub27) Static198.aClass25_20.method691((long) local129);
														if (local1554 != null) {
															Static81.method2015(local1554.anInt5186 != local150, false, local1554);
														}
														Static80.method1962(local191, local150, local129, false);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 133) {
													Static30.aClass14_Sub4_Sub2_1.anInt2637 += 28;
													if (Static30.aClass14_Sub4_Sub2_1.method2519()) {
														Static161.method3222(Static30.aClass14_Sub4_Sub2_1.anInt2637 - 28, Static30.aClass14_Sub4_Sub2_1);
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 64) {
													Static198.method3705();
													Static116.anInt2565 = -1;
													return false;
												} else if (Static116.anInt2565 == 59) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 == 65535) {
														local129 = -1;
													}
													local150 = Static30.aClass14_Sub4_Sub2_1.method2548();
													local154 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local191 = Static30.aClass14_Sub4_Sub2_1.method2548();
													Static64.method1509(local150, local154, local191, local129);
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 155) {
													local505 = Static30.aClass14_Sub4_Sub2_1.method2548() == 1;
													local509 = Static30.aClass14_Sub4_Sub2_1.method2496();
													local511 = local509;
													if (local505) {
														local511 = Static30.aClass14_Sub4_Sub2_1.method2496();
													}
													local522 = Static30.aClass14_Sub4_Sub2_1.method2516();
													local527 = Static30.aClass14_Sub4_Sub2_1.method2498();
													local1887 = Static30.aClass14_Sub4_Sub2_1.method2501();
													local1891 = Static30.aClass14_Sub4_Sub2_1.method2548();
													@Pc(5560) long local5560 = (local527 << 32) + local1887;
													@Pc(5562) boolean local5562 = false;
													@Pc(5564) int local5564 = 0;
													while (true) {
														if (local5564 >= 100) {
															if (local1891 <= 1) {
																if (Static8.aBoolean9 && !Static104.aBoolean162 || Static318.aBoolean423) {
																	local5562 = true;
																} else if (Static82.method2033(local511)) {
																	local5562 = true;
																}
															}
															break;
														}
														if (local5560 == Static213.aLongArray6[local5564]) {
															local5562 = true;
															break;
														}
														local5564++;
													}
													if (!local5562 && Static223.anInt5821 == 0) {
														Static213.aLongArray6[Static191.anInt3908] = local5560;
														Static191.anInt3908 = (Static191.anInt3908 + 1) % 100;
														local3220 = Static131.method1810(Static323.method977(Static70.method1721(Static30.aClass14_Sub4_Sub2_1)));
														if (local1891 == 2 || local1891 == 3) {
															Static167.method4774(9, Static258.method4433(local522), "<img=1>" + local509, 0, "<img=1>" + local511, -1, local3220);
														} else if (local1891 == 1) {
															Static167.method4774(9, Static258.method4433(local522), "<img=0>" + local509, 0, "<img=0>" + local511, -1, local3220);
														} else {
															Static167.method4774(9, Static258.method4433(local522), local509, 0, local511, -1, local3220);
														}
													}
													Static116.anInt2565 = -1;
													return true;
												} else if (Static116.anInt2565 == 117) {
													local129 = Static30.aClass14_Sub4_Sub2_1.method2510();
													local150 = Static30.aClass14_Sub4_Sub2_1.method2498();
													if (local129 < -70000) {
														local150 += 32768;
													}
													if (local129 < 0) {
														local3755 = null;
													} else {
														local3755 = Static273.method4632(local129);
													}
													if (local3755 != null) {
														for (local191 = 0; local191 < local3755.anIntArray374.length; local191++) {
															local3755.anIntArray374[local191] = 0;
															local3755.anIntArray361[local191] = 0;
														}
													}
													Static57.method1297(local150);
													local191 = Static30.aClass14_Sub4_Sub2_1.method2498();
													for (local239 = 0; local239 < local191; local239++) {
														local407 = Static30.aClass14_Sub4_Sub2_1.method2499();
														local772 = Static30.aClass14_Sub4_Sub2_1.method2539();
														if (local772 == 255) {
															local772 = Static30.aClass14_Sub4_Sub2_1.method2510();
														}
														if (local3755 != null && local239 < local3755.anIntArray374.length) {
															local3755.anIntArray374[local239] = local407;
															local3755.anIntArray361[local239] = local772;
														}
														Static200.method3727(local772, local150, local239, local407 - 1);
													}
													if (local3755 != null) {
														Static166.method3295(local3755);
													}
													Static214.method3858();
													Static23.anIntArray39[Static319.anInt6141++ & 0x1F] = local150 & 0x7FFF;
													Static116.anInt2565 = -1;
													return true;
												} else {
													Static47.method1149(null, "T1 - " + Static116.anInt2565 + "," + Static1.anInt6422 + "," + Static28.anInt657 + " - " + Static327.anInt6307);
													Static198.method3705();
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
	}
}
