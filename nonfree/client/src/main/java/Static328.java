import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public static int anInt6274;

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!qj;")
	public static Class165 aClass165_100;

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "[I")
	public static final int[] anIntArray784 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method5502() {
		Static306.method5159();
		Static17.method424();
		Static275.method4782();
		Static270.method4722();
		Static108.method2029();
		Static111.method2068();
		Static31.method867();
		Static100.method1903();
		Static28.method821();
		Static57.method1235();
		Static21.method556();
		Static344.method5506();
		Static39.method963();
		Static61.method1287();
		Static188.method3647();
		Static344.method5507();
		Static327.method5501();
		Static314.method5308();
		Static17.method426();
		Static55.method1206();
		Static315.method5323();
		Static53.method1167();
		if (Static50.anInt1155 != 0) {
			for (@Pc(68) int local68 = 0; local68 < Static152.aByteArrayArray10.length; local68++) {
				Static152.aByteArrayArray10[local68] = null;
			}
			Static88.anInt1740 = 0;
		}
		Static161.method3069();
		Static74.method3136();
		Static68.method1386();
		Static211.method3871();
		Static244.method4322();
		Static98.aClass140_55.method3819();
		Static34.aClass2_6.method3326();
		Static91.aClass156_6.method4254();
		Static78.method1540();
		Static316.aClass165_95.method4495();
		Static334.aClass165_102.method4495();
		Static324.aClass165_98.method4495();
		Static82.aClass165_26.method4495();
		Static301.aClass165_92.method4495();
		Static316.aClass165_94.method4495();
		Static242.aClass165_74.method4495();
		Static28.aClass165_10.method4495();
		Static297.aClass165_88.method4495();
		Static348.aClass165_57.method4495();
		aClass165_100.method4495();
		Static334.aClass165_103.method4495();
		Static274.aClass165_82.method4495();
		Static236.aClass165_72.method4495();
		Static128.aClass165_47.method4495();
		Static138.aClass165_49.method4495();
		Static68.aClass165_24.method4495();
		Static285.aClass165_85.method4495();
		Static57.aClass165_22.method4495();
		Static240.aClass165_73.method4495();
		Static194.aClass165_61.method4495();
		Static34.aClass165_13.method4495();
		Static340.aClass165_60.method4495();
		Static119.aClass165_41.method4495();
		Static221.aClass165_69.method4495();
		Static117.aClass165_45.method4495();
		Static129.aClass165_48.method4495();
		Static145.aClass165_51.method4495();
		Static206.aClass165_64.method4495();
		Static122.aClass140_67.method3819();
		Static326.aClass140_166.method3819();
		Static243.aClass140_127.method3819();
		Static68.aClass140_38.method3819();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!qj;III)Lclient!ap;")
	public static Class12 method5503(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4508(0, arg1);
		return local9 == null ? null : new Class12(local9);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)Z")
	public static boolean method5504() throws IOException {
		if (Static153.aClass158_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static153.aClass158_2.method4326();
		if (local13 == 0) {
			return false;
		}
		if (Static351.anInt6505 == -1) {
			Static153.aClass158_2.method4330(1, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
			Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
			Static351.anInt6505 = Static232.aClass1_Sub7_Sub1_4.method730();
			local13--;
			Static230.anInt4529 = Static222.anIntArray560[Static351.anInt6505];
		}
		if (Static230.anInt4529 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static153.aClass158_2.method4330(1, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
			Static230.anInt4529 = Static232.aClass1_Sub7_Sub1_4.aByteArray58[0] & 0xFF;
			local13--;
		}
		if (Static230.anInt4529 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static153.aClass158_2.method4330(2, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
			Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
			Static230.anInt4529 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local13 -= 2;
		}
		if (local13 < Static230.anInt4529) {
			return false;
		}
		Static232.aClass1_Sub7_Sub1_4.anInt3368 = 0;
		Static153.aClass158_2.method4330(Static230.anInt4529, Static232.aClass1_Sub7_Sub1_4.aByteArray58, 0);
		Static176.anInt3652 = 0;
		Static322.anInt6152 = Static28.anInt732;
		Static28.anInt732 = Static187.anInt3893;
		Static187.anInt3893 = Static351.anInt6505;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(149) Class1_Sub9 local149;
		if (Static351.anInt6505 == 193) {
			local126 = Static232.aClass1_Sub7_Sub1_4.method3100();
			local130 = Static232.aClass1_Sub7_Sub1_4.method3099();
			local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
			local138 = Static232.aClass1_Sub7_Sub1_4.method3101();
			if (Static77.method1481(local138)) {
				local149 = (Class1_Sub9) Static348.aClass26_20.method870((long) local130);
				if (local149 != null) {
					Static125.method2404(local149, false, local149.anInt1104 != local134);
				}
				Static269.method4698(local130, local134, false, local126);
			}
			Static351.anInt6505 = -1;
			return true;
		} else if (Static351.anInt6505 == 70) {
			local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
			Static82.method1588(local126);
			Static40.anIntArray554[Static49.anInt1116++ & 0x1F] = local126 & 0x7FFF;
			Static351.anInt6505 = -1;
			return true;
		} else {
			@Pc(220) String local220;
			if (Static351.anInt6505 == 110) {
				local126 = Static232.aClass1_Sub7_Sub1_4.method3149();
				local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
				local134 = Static232.aClass1_Sub7_Sub1_4.method3144();
				if (Static77.method1481(local134)) {
					Static248.method4432(local220, local126);
				}
				Static351.anInt6505 = -1;
				return true;
			}
			@Pc(261) int local261;
			if (Static351.anInt6505 == 248) {
				local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
				local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local134 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local138 = Static232.aClass1_Sub7_Sub1_4.method3101();
				local261 = Static232.aClass1_Sub7_Sub1_4.method3099();
				if (Static77.method1481(local138)) {
					Static135.method2614(local134 | local130 << 16, local126, local261, 7);
				}
				Static351.anInt6505 = -1;
				return true;
			}
			@Pc(400) String local400;
			@Pc(299) String local299;
			@Pc(293) boolean local293;
			@Pc(309) long local309;
			@Pc(314) long local314;
			@Pc(319) long local319;
			@Pc(325) int local325;
			if (Static351.anInt6505 == 194) {
				local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
				local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
				local299 = local220;
				if (local293) {
					local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
				}
				local309 = Static232.aClass1_Sub7_Sub1_4.method3109();
				local314 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local319 = Static232.aClass1_Sub7_Sub1_4.method3137();
				local325 = Static232.aClass1_Sub7_Sub1_4.method3141();
				@Pc(331) long local331 = local319 + (local314 << 32);
				@Pc(333) boolean local333 = false;
				@Pc(335) int local335 = 0;
				while (true) {
					if (local335 >= 100) {
						if (local325 <= 1) {
							if (Static115.aBoolean193 && !Static300.aBoolean507 || Static206.aBoolean350) {
								local333 = true;
							} else if (Static340.method3661(local299)) {
								local333 = true;
							}
						}
						break;
					}
					if (Static151.aLongArray9[local335] == local331) {
						local333 = true;
						break;
					}
					local335++;
				}
				if (!local333 && Static155.anInt3113 == 0) {
					Static151.aLongArray9[Static293.anInt5701] = local331;
					Static293.anInt5701 = (Static293.anInt5701 + 1) % 100;
					local400 = Static149.method2394(Static77.method1484(Static262.method4604(Static232.aClass1_Sub7_Sub1_4)));
					if (local325 == 2 || local325 == 3) {
						Static345.method5616(-1, 9, Static28.method819(local309), 0, "<img=1>" + local299, local400, "<img=1>" + local220);
					} else if (local325 == 1) {
						Static345.method5616(-1, 9, Static28.method819(local309), 0, "<img=0>" + local299, local400, "<img=0>" + local220);
					} else {
						Static345.method5616(-1, 9, Static28.method819(local309), 0, local299, local400, local220);
					}
				}
				Static351.anInt6505 = -1;
				return true;
			}
			@Pc(507) int local507;
			if (Static351.anInt6505 == 94) {
				local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local130 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local138 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local261 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local507 = Static232.aClass1_Sub7_Sub1_4.method3115();
				if (Static77.method1481(local126)) {
					Static138.aBooleanArray9[local130] = true;
					Static44.anIntArray119[local130] = local134;
					Static243.anIntArray606[local130] = local138;
					Static79.anIntArray427[local130] = local261;
					Static43.anIntArray338[local130] = local507;
				}
				Static351.anInt6505 = -1;
				return true;
			} else if (Static351.anInt6505 == 83) {
				local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
				local130 = Static232.aClass1_Sub7_Sub1_4.method3127();
				local134 = Static232.aClass1_Sub7_Sub1_4.method3144();
				if (Static77.method1481(local134)) {
					Static243.method4311(local126, local130);
				}
				Static351.anInt6505 = -1;
				return true;
			} else {
				@Pc(694) boolean local694;
				@Pc(611) int local611;
				@Pc(634) int local634;
				@Pc(640) int local640;
				if (Static351.anInt6505 == 14) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
					local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
					local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
					local138 = Static232.aClass1_Sub7_Sub1_4.method3149();
					if (local138 >> 30 == 0) {
						@Pc(711) Class125 local711;
						@Pc(776) Class121 local776;
						@Pc(771) Class121 local771;
						@Pc(757) Class125 local757;
						@Pc(724) Class121 local724;
						if (local138 >> 29 != 0) {
							local261 = local138 & 0xFFFF;
							@Pc(683) Class5_Sub3_Sub3_Sub2 local683 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local261];
							if (local683 != null) {
								if (local130 == 65535) {
									local130 = -1;
								}
								local694 = true;
								if (local130 != -1 && local683.anInt4934 != -1) {
									if (local683.anInt4934 == local130) {
										local711 = Static183.method3571(local130);
										if (local711.aBoolean335 && local711.anInt3913 != -1) {
											local724 = Static133.method2520(local711.anInt3913);
											local325 = local724.anInt3780;
											if (local325 == 0 || local325 == 2) {
												local694 = false;
											} else if (local325 == 1) {
												local694 = true;
											}
										}
									} else {
										local711 = Static183.method3571(local130);
										local757 = Static183.method3571(local683.anInt4934);
										if (local711.anInt3913 != -1 && local757.anInt3913 != -1) {
											local771 = Static133.method2520(local711.anInt3913);
											local776 = Static133.method2520(local757.anInt3913);
											if (local776.anInt3772 > local771.anInt3772) {
												local694 = false;
											}
										}
									}
								}
								if (local694) {
									local683.anInt4958 = local134;
									local683.anInt4951 = local126 + Static215.anInt4246;
									local683.anInt4976 = 0;
									local683.anInt4979 = 0;
									local683.anInt4934 = local130;
									local683.anInt4972 = 1;
									if (Static215.anInt4246 < local683.anInt4951) {
										local683.anInt4979 = -1;
									}
									if (local683.anInt4934 != -1 && Static215.anInt4246 == local683.anInt4951) {
										local634 = Static183.method3571(local683.anInt4934).anInt3913;
										if (local634 != -1) {
											local724 = Static133.method2520(local634);
											if (local724 != null && local724.anIntArray446 != null) {
												Static131.method2490(false, local724, 0, local683.anInt5047, local683.anInt5050);
											}
										}
									}
								}
							}
						} else if (local138 >> 28 != 0) {
							local261 = local138 & 0xFFFF;
							@Pc(863) Class5_Sub3_Sub3_Sub1 local863;
							if (Static69.anInt1424 == local261) {
								local863 = Static130.aClass5_Sub3_Sub3_Sub1_1;
							} else {
								local863 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local261];
							}
							if (local863 != null) {
								if (local130 == 65535) {
									local130 = -1;
								}
								local694 = true;
								if (local130 != -1 && local863.anInt4934 != -1) {
									if (local130 == local863.anInt4934) {
										local711 = Static183.method3571(local130);
										if (local711.aBoolean335 && local711.anInt3913 != -1) {
											local724 = Static133.method2520(local711.anInt3913);
											local325 = local724.anInt3780;
											if (local325 == 0 || local325 == 2) {
												local694 = false;
											} else if (local325 == 1) {
												local694 = true;
											}
										}
									} else {
										local711 = Static183.method3571(local130);
										local757 = Static183.method3571(local863.anInt4934);
										if (local711.anInt3913 != -1 && local757.anInt3913 != -1) {
											local771 = Static133.method2520(local711.anInt3913);
											local776 = Static133.method2520(local757.anInt3913);
											if (local776.anInt3772 > local771.anInt3772) {
												local694 = false;
											}
										}
									}
								}
								if (local694) {
									local863.anInt4979 = 0;
									local863.anInt4958 = local134;
									local863.anInt4951 = Static215.anInt4246 + local126;
									local863.anInt4972 = 1;
									local863.anInt4934 = local130;
									local863.anInt4976 = 0;
									if (local863.anInt4951 > Static215.anInt4246) {
										local863.anInt4979 = -1;
									}
									if (local863.anInt4934 == 65535) {
										local863.anInt4934 = -1;
									}
									if (local863.anInt4934 != -1 && Static215.anInt4246 == local863.anInt4951) {
										local634 = Static183.method3571(local863.anInt4934).anInt3913;
										if (local634 != -1) {
											local724 = Static133.method2520(local634);
											if (local724 != null && local724.anIntArray446 != null) {
												Static131.method2490(local863 == Static130.aClass5_Sub3_Sub3_Sub1_1, local724, 0, local863.anInt5047, local863.anInt5050);
											}
										}
									}
								}
							}
						}
					} else {
						local261 = local138 >> 28 & 0x3;
						local507 = (local138 >> 14 & 0x3FFF) - Static182.anInt3775;
						local611 = (local138 & 0x3FFF) - Static161.anInt3315;
						if (local507 >= 0 && local611 >= 0 && local507 < Static48.anInt1107 && Static337.anInt6402 > local611) {
							local634 = local507 * 128 + 64;
							local640 = local611 * 128 + 64;
							@Pc(662) Class5_Sub3_Sub4 local662 = new Class5_Sub3_Sub4(local130, 0, Static215.anInt4246, local261, local634, Static16.method362(local634, local640, local261) - local134, local640, local507, local507, local611, local611);
							Static294.aClass195_46.method5018(new Class1_Sub1_Sub14(local662));
						}
					}
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 125) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local130 = Static232.aClass1_Sub7_Sub1_4.method3125();
					if (Static77.method1481(local126)) {
						@Pc(1084) Class1_Sub9 local1084 = (Class1_Sub9) Static348.aClass26_20.method870((long) local130);
						if (local1084 != null) {
							Static125.method2404(local1084, false, true);
						}
						if (Static297.aClass177_20 != null) {
							Static133.method2517(Static297.aClass177_20);
							Static297.aClass177_20 = null;
						}
					}
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 211) {
					Static298.anInt5959 = Static232.aClass1_Sub7_Sub1_4.method3141();
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 147) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
					local130 = Static232.aClass1_Sub7_Sub1_4.method3099();
					local134 = Static232.aClass1_Sub7_Sub1_4.method3099();
					local138 = Static232.aClass1_Sub7_Sub1_4.method3101();
					if (Static77.method1481(local126)) {
						Static135.method2614(local138, local130, local134, 5);
					}
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 131) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3099();
					local130 = local126 >> 28 & 0x3;
					local134 = local126 >> 14 & 0x3FFF;
					local138 = local126 & 0x3FFF;
					local261 = Static232.aClass1_Sub7_Sub1_4.method3115();
					if (local261 == 65535) {
						local261 = -1;
					}
					local507 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local611 = local507 >> 2;
					local634 = local507 & 0x3;
					local640 = Static6.anIntArray19[local611];
					local138 -= Static161.anInt3315;
					local134 -= Static182.anInt3775;
					Static268.method4678(local261, local134, local611, local138, local130, local640, local634);
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 234) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local134 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
					if (Static77.method1481(local126) && Static314.aClass177ArrayArray1[local130] != null) {
						for (local261 = local134; local261 < local138; local261++) {
							local507 = Static232.aClass1_Sub7_Sub1_4.method3137();
							if (Static314.aClass177ArrayArray1[local130].length > local261 && Static314.aClass177ArrayArray1[local130][local261] != null) {
								Static314.aClass177ArrayArray1[local130][local261].anInt5222 = local507;
							}
						}
					}
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 237) {
					Static348.method3535(Static232.aClass1_Sub7_Sub1_4.method3134());
					Static351.anInt6505 = -1;
					return true;
				} else if (Static351.anInt6505 == 161) {
					local126 = Static232.aClass1_Sub7_Sub1_4.method3144();
					local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
					local134 = Static232.aClass1_Sub7_Sub1_4.method3112();
					@Pc(1328) Class5_Sub3_Sub3_Sub2 local1328 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local130];
					if (local1328 != null) {
						Static264.method4808(local1328, local134, local126);
					}
					Static351.anInt6505 = -1;
					return true;
				} else {
					@Pc(1464) Class123 local1464;
					@Pc(1348) String local1348;
					if (Static351.anInt6505 == 224) {
						local1348 = Static232.aClass1_Sub7_Sub1_4.method3134();
						@Pc(1359) boolean local1359 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
						if (local1359) {
							local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
						} else {
							local220 = local1348;
						}
						local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
						@Pc(1379) byte local1379 = Static232.aClass1_Sub7_Sub1_4.method3130();
						@Pc(1381) boolean local1381 = false;
						if (local1379 == -128) {
							local1381 = true;
						}
						if (local1381) {
							if (Static229.anInt1684 == 0) {
								Static351.anInt6505 = -1;
								return true;
							}
							for (local611 = 0; Static229.anInt1684 > local611 && (!Static23.aClass123Array1[local611].aString154.equals(local220) || Static23.aClass123Array1[local611].anInt3833 != local138); local611++) {
							}
							if (Static229.anInt1684 > local611) {
								while (local611 < Static229.anInt1684 - 1) {
									Static23.aClass123Array1[local611] = Static23.aClass123Array1[local611 + 1];
									local611++;
								}
								Static229.anInt1684--;
								Static23.aClass123Array1[Static229.anInt1684] = null;
							}
						} else {
							@Pc(1460) String local1460 = Static232.aClass1_Sub7_Sub1_4.method3134();
							local1464 = new Class123();
							local1464.aString154 = local220;
							local1464.aString155 = local1348;
							local1464.aString153 = local1460;
							local1464.aByte38 = local1379;
							local1464.anInt3833 = local138;
							for (local640 = Static229.anInt1684 - 1; local640 >= 0; local640--) {
								local325 = Static23.aClass123Array1[local640].aString154.compareTo(local1464.aString154);
								if (local325 == 0) {
									Static23.aClass123Array1[local640].anInt3833 = local138;
									Static23.aClass123Array1[local640].aByte38 = local1379;
									Static23.aClass123Array1[local640].aString153 = local1460;
									if (local220.equals(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130)) {
										Static99.aByte16 = local1379;
									}
									Static351.anInt6505 = -1;
									Static80.anInt1599 = Static119.anInt2038;
									return true;
								}
								if (local325 < 0) {
									break;
								}
							}
							if (Static23.aClass123Array1.length <= Static229.anInt1684) {
								Static351.anInt6505 = -1;
								return true;
							}
							for (local325 = Static229.anInt1684 - 1; local325 > local640; local325--) {
								Static23.aClass123Array1[local325 + 1] = Static23.aClass123Array1[local325];
							}
							if (Static229.anInt1684 == 0) {
								Static23.aClass123Array1 = new Class123[100];
							}
							Static23.aClass123Array1[local640 + 1] = local1464;
							Static229.anInt1684++;
							if (local220.equals(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130)) {
								Static99.aByte16 = local1379;
							}
						}
						Static351.anInt6505 = -1;
						Static80.anInt1599 = Static119.anInt2038;
						return true;
					} else if (Static351.anInt6505 == 165) {
						Static232.aClass1_Sub7_Sub1_4.anInt3368 += 28;
						if (Static232.aClass1_Sub7_Sub1_4.method3148()) {
							Static302.method4312(Static232.aClass1_Sub7_Sub1_4, Static232.aClass1_Sub7_Sub1_4.anInt3368 - 28);
						}
						Static351.anInt6505 = -1;
						return true;
					} else if (Static351.anInt6505 == 247) {
						local126 = Static232.aClass1_Sub7_Sub1_4.method3112();
						local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
						if (Static77.method1481(local130)) {
							Static310.anInt5979 = local126;
						}
						Static351.anInt6505 = -1;
						return true;
					} else if (Static351.anInt6505 == 225) {
						local126 = Static232.aClass1_Sub7_Sub1_4.method3141();
						local130 = local126 >> 5;
						local134 = local126 & 0x1F;
						if (local134 == 0) {
							Static135.aClass136Array1[local130] = null;
							Static351.anInt6505 = -1;
							return true;
						}
						@Pc(1679) Class136 local1679 = new Class136();
						local1679.anInt4068 = local134;
						local1679.anInt4066 = Static232.aClass1_Sub7_Sub1_4.method3141();
						if (local1679.anInt4066 >= 0 && Static163.aClass90Array9.length > local1679.anInt4066) {
							if (local1679.anInt4068 == 1 || local1679.anInt4068 == 10) {
								local1679.anInt4063 = Static232.aClass1_Sub7_Sub1_4.method3115();
								Static232.aClass1_Sub7_Sub1_4.anInt3368 += 5;
							} else if (local1679.anInt4068 >= 2 && local1679.anInt4068 <= 6) {
								if (local1679.anInt4068 == 2) {
									local1679.anInt4053 = 64;
									local1679.anInt4057 = 64;
								}
								if (local1679.anInt4068 == 3) {
									local1679.anInt4053 = 64;
									local1679.anInt4057 = 0;
								}
								if (local1679.anInt4068 == 4) {
									local1679.anInt4057 = 128;
									local1679.anInt4053 = 64;
								}
								if (local1679.anInt4068 == 5) {
									local1679.anInt4053 = 0;
									local1679.anInt4057 = 64;
								}
								if (local1679.anInt4068 == 6) {
									local1679.anInt4057 = 64;
									local1679.anInt4053 = 128;
								}
								local1679.anInt4068 = 2;
								local1679.anInt4067 = Static232.aClass1_Sub7_Sub1_4.method3115();
								local1679.anInt4052 = Static232.aClass1_Sub7_Sub1_4.method3115();
								local1679.anInt4055 = Static232.aClass1_Sub7_Sub1_4.method3141();
								local1679.anInt4054 = Static232.aClass1_Sub7_Sub1_4.method3115();
							}
							local1679.anInt4065 = Static232.aClass1_Sub7_Sub1_4.method3115();
							if (local1679.anInt4065 == 65535) {
								local1679.anInt4065 = -1;
							}
							Static135.aClass136Array1[local130] = local1679;
						}
						Static351.anInt6505 = -1;
						return true;
					} else {
						@Pc(1847) byte local1847;
						if (Static351.anInt6505 == 142) {
							local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
							local1847 = Static232.aClass1_Sub7_Sub1_4.method3093();
							Static282.method4871(local1847, local126);
							Static351.anInt6505 = -1;
							return true;
						} else if (Static351.anInt6505 == 63) {
							if (Static292.aFrame2 != null) {
								Static294.method5056(-1, false, Static142.anInt3154, -1);
							}
							@Pc(1869) byte[] local1869 = new byte[Static230.anInt4529];
							Static232.aClass1_Sub7_Sub1_4.method739(Static230.anInt4529, local1869);
							local220 = Static40.method4023(0, Static230.anInt4529, local1869);
							Static140.method2695(local220, Static258.anInt5029 == 1, Static180.aClass110_6, true);
							Static351.anInt6505 = -1;
							return true;
						} else if (Static351.anInt6505 == 204) {
							Static30.anInt780 = Static232.aClass1_Sub7_Sub1_4.method3141();
							Static351.anInt6505 = -1;
							Static152.anInt3055 = Static119.anInt2038;
							return true;
						} else {
							@Pc(2028) String local2028;
							@Pc(1967) int local1967;
							if (Static351.anInt6505 == 238) {
								local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
								local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
								local299 = local220;
								if (local293) {
									local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
								}
								local309 = Static232.aClass1_Sub7_Sub1_4.method3109();
								local314 = Static232.aClass1_Sub7_Sub1_4.method3115();
								local319 = Static232.aClass1_Sub7_Sub1_4.method3137();
								local325 = Static232.aClass1_Sub7_Sub1_4.method3141();
								local1967 = Static232.aClass1_Sub7_Sub1_4.method3115();
								@Pc(1973) long local1973 = (local314 << 32) + local319;
								@Pc(1975) boolean local1975 = false;
								@Pc(1977) int local1977 = 0;
								while (true) {
									if (local1977 >= 100) {
										if (local325 <= 1 && Static340.method3661(local299)) {
											local1975 = true;
										}
										break;
									}
									if (local1973 == Static151.aLongArray9[local1977]) {
										local1975 = true;
										break;
									}
									local1977++;
								}
								if (!local1975 && Static155.anInt3113 == 0) {
									Static151.aLongArray9[Static293.anInt5701] = local1973;
									Static293.anInt5701 = (Static293.anInt5701 + 1) % 100;
									local2028 = Static122.method2174(local1967).method4715(Static232.aClass1_Sub7_Sub1_4);
									if (local325 == 2) {
										Static345.method5616(local1967, 20, Static28.method819(local309), 0, "<img=1>" + local299, local2028, "<img=1>" + local220);
									} else if (local325 == 1) {
										Static345.method5616(local1967, 20, Static28.method819(local309), 0, "<img=0>" + local299, local2028, "<img=0>" + local220);
									} else {
										Static345.method5616(local1967, 20, Static28.method819(local309), 0, local299, local2028, local220);
									}
								}
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 108) {
								Static290.method4939();
								Static198.method3737();
								Static82.anInt1643 += 32;
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 172) {
								local126 = Static232.aClass1_Sub7_Sub1_4.method3127();
								local130 = Static232.aClass1_Sub7_Sub1_4.method3127();
								local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
								if (Static77.method1481(local134)) {
									@Pc(2146) Class1_Sub9 local2146 = (Class1_Sub9) Static348.aClass26_20.method870((long) local130);
									local149 = (Class1_Sub9) Static348.aClass26_20.method870((long) local126);
									if (local149 != null) {
										Static125.method2404(local149, false, local2146 == null || local2146.anInt1104 != local149.anInt1104);
									}
									if (local2146 != null) {
										local2146.method5710();
										Static348.aClass26_20.method877((long) local126, local2146);
									}
									@Pc(2188) Class177 local2188 = Static140.method2694(local130);
									if (local2188 != null) {
										Static133.method2517(local2188);
									}
									local2188 = Static140.method2694(local126);
									if (local2188 != null) {
										Static133.method2517(local2188);
										Static217.method3973(true, local2188);
									}
									if (Static100.anInt2086 != -1) {
										Static152.method2897(1, Static100.anInt2086);
									}
								}
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 103) {
								for (local126 = 0; local126 < Static197.anIntArray793.length; local126++) {
									if (Static197.anIntArray793[local126] != Static49.anIntArray126[local126]) {
										Static197.anIntArray793[local126] = Static49.anIntArray126[local126];
										Static314.method5305(local126);
										Static161.anIntArray371[Static82.anInt1643++ & 0x1F] = local126;
									}
								}
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 206) {
								local126 = Static232.aClass1_Sub7_Sub1_4.method3099();
								local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
								if (Static77.method1481(local130)) {
									Static135.method2614(2047, 0, local126, 5);
								}
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 37) {
								local126 = Static232.aClass1_Sub7_Sub1_4.method3090();
								local130 = Static232.aClass1_Sub7_Sub1_4.method3099();
								local134 = Static232.aClass1_Sub7_Sub1_4.method3115();
								local138 = Static232.aClass1_Sub7_Sub1_4.method3090();
								if (Static77.method1481(local134)) {
									Static40.method4024(local130, local126, local138);
								}
								Static351.anInt6505 = -1;
								return true;
							} else if (Static351.anInt6505 == 58) {
								local126 = Static232.aClass1_Sub7_Sub1_4.method3099();
								local130 = Static232.aClass1_Sub7_Sub1_4.method3144();
								if (local130 == 65535) {
									local130 = -1;
								}
								local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
								if (Static77.method1481(local134)) {
									Static135.method2614(local130, -1, local126, 1);
								}
								Static351.anInt6505 = -1;
								return true;
							} else {
								@Pc(2422) long local2422;
								@Pc(2440) Class1_Sub35 local2440;
								@Pc(2428) Class1_Sub35 local2428;
								if (Static351.anInt6505 == 135) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3144();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
									if (local130 == 65535) {
										local130 = -1;
									}
									local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
									if (local134 == 65535) {
										local134 = -1;
									}
									local138 = Static232.aClass1_Sub7_Sub1_4.method3147();
									local261 = Static232.aClass1_Sub7_Sub1_4.method3149();
									if (Static77.method1481(local138)) {
										for (local507 = local130; local507 <= local134; local507++) {
											local2422 = (long) local507 + ((long) local261 << 32);
											local2428 = (Class1_Sub35) Static324.aClass26_31.method870(local2422);
											if (local2428 != null) {
												local2440 = new Class1_Sub35(local2428.anInt5507, local126);
												local2428.method5710();
											} else if (local507 == -1) {
												local2440 = new Class1_Sub35(Static140.method2694(local261).aClass1_Sub35_11.anInt5507, local126);
											} else {
												local2440 = new Class1_Sub35(0, local126);
											}
											Static324.aClass26_31.method877(local2422, local2440);
										}
									}
									Static351.anInt6505 = -1;
									return true;
								}
								@Pc(2504) Class177 local2504;
								if (Static351.anInt6505 == 209) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
									if (local126 < -70000) {
										local130 += 32768;
									}
									if (local126 < 0) {
										local2504 = null;
									} else {
										local2504 = Static140.method2694(local126);
									}
									while (Static230.anInt4529 > Static232.aClass1_Sub7_Sub1_4.anInt3368) {
										local138 = Static232.aClass1_Sub7_Sub1_4.method3145();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local507 = 0;
										if (local261 != 0) {
											local507 = Static232.aClass1_Sub7_Sub1_4.method3141();
											if (local507 == 255) {
												local507 = Static232.aClass1_Sub7_Sub1_4.method3125();
											}
										}
										if (local2504 != null && local138 >= 0 && local138 < local2504.anIntArray668.length) {
											local2504.anIntArray668[local138] = local261;
											local2504.anIntArray667[local138] = local507;
										}
										Static175.method3447(local261 - 1, local507, local138, local130);
									}
									if (local2504 != null) {
										Static133.method2517(local2504);
									}
									Static198.method3737();
									Static40.anIntArray554[Static49.anInt1116++ & 0x1F] = local130 & 0x7FFF;
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 106) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3112();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3100();
									local134 = Static232.aClass1_Sub7_Sub1_4.method3112();
									Static285.anInt5511 = local130 >> 1;
									Static130.aClass5_Sub3_Sub3_Sub1_1.method3067(local134, (local130 & 0x1) == 1, local126, Static285.anInt5511);
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 102) {
									Static194.method3679();
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 9) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3118();
									local134 = Static232.aClass1_Sub7_Sub1_4.method3149();
									if (Static77.method1481(local126)) {
										Static48.method1102(local134, local130);
									}
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 149) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
									local134 = Static232.aClass1_Sub7_Sub1_4.method3125();
									if (Static77.method1481(local126)) {
										Static216.method3970(local130, local134);
									}
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 233) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
									if (local126 < -70000) {
										local130 += 32768;
									}
									if (local126 >= 0) {
										local2504 = Static140.method2694(local126);
									} else {
										local2504 = null;
									}
									if (local2504 != null) {
										for (local138 = 0; local138 < local2504.anIntArray668.length; local138++) {
											local2504.anIntArray668[local138] = 0;
											local2504.anIntArray667[local138] = 0;
										}
									}
									Static178.method3487(local130);
									local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
									for (local261 = 0; local261 < local138; local261++) {
										local507 = Static232.aClass1_Sub7_Sub1_4.method3100();
										if (local507 == 255) {
											local507 = Static232.aClass1_Sub7_Sub1_4.method3127();
										}
										local611 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (local2504 != null && local261 < local2504.anIntArray668.length) {
											local2504.anIntArray668[local261] = local611;
											local2504.anIntArray667[local261] = local507;
										}
										Static175.method3447(local611 - 1, local507, local261, local130);
									}
									if (local2504 != null) {
										Static133.method2517(local2504);
									}
									Static198.method3737();
									Static40.anIntArray554[Static49.anInt1116++ & 0x1F] = local130 & 0x7FFF;
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 117) {
									Static291.method4962(Static232.aClass1_Sub7_Sub1_4, Static230.anInt4529, Static180.aClass110_6);
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 76) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
									if (local126 == 65535) {
										local126 = -1;
									}
									local130 = Static232.aClass1_Sub7_Sub1_4.method3141();
									local134 = Static232.aClass1_Sub7_Sub1_4.method3115();
									local138 = Static232.aClass1_Sub7_Sub1_4.method3141();
									Static12.method315(local138, local126, local130, local134);
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 235) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
									local130 = Static232.aClass1_Sub7_Sub1_4.method3125();
									Static140.method2697(local130, local126);
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 121) {
									Static324.method5451(true);
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 163) {
									Static210.anInt4174 = Static232.aClass1_Sub7_Sub1_4.method3147() * 30;
									Static332.anInt6357 = Static119.anInt2038;
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 188) {
									local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
									local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
									@Pc(2971) Object[] local2971 = new Object[local220.length() + 1];
									for (local138 = local220.length() - 1; local138 >= 0; local138--) {
										if (local220.charAt(local138) == 's') {
											local2971[local138 + 1] = Static232.aClass1_Sub7_Sub1_4.method3134();
										} else {
											local2971[local138 + 1] = Integer.valueOf(Static232.aClass1_Sub7_Sub1_4.method3125());
										}
									}
									local2971[0] = Integer.valueOf(Static232.aClass1_Sub7_Sub1_4.method3125());
									if (Static77.method1481(local126)) {
										@Pc(3027) Class1_Sub19 local3027 = new Class1_Sub19();
										local3027.anObjectArray3 = local2971;
										Static98.method1797(local3027);
									}
									Static351.anInt6505 = -1;
									return true;
								} else if (Static351.anInt6505 == 215) {
									Static55.method1208();
									Static351.anInt6505 = -1;
									return false;
								} else {
									@Pc(3070) String local3070;
									@Pc(3072) String local3072;
									@Pc(3101) String local3101;
									if (Static351.anInt6505 == 178) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3145();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local3070 = "";
										local3072 = local3070;
										if ((local134 & 0x1) != 0) {
											local3070 = Static232.aClass1_Sub7_Sub1_4.method3134();
											if ((local134 & 0x2) == 0) {
												local3072 = local3070;
											} else {
												local3072 = Static232.aClass1_Sub7_Sub1_4.method3134();
											}
										}
										local3101 = Static232.aClass1_Sub7_Sub1_4.method3134();
										if (local126 == 99) {
											Static276.method4789(local3101);
										} else if (local3072.equals("") || !Static340.method3661(local3072)) {
											Static9.method288(local130, local3070, local3072, local3101, local126);
										} else {
											Static351.anInt6505 = -1;
											return true;
										}
										Static351.anInt6505 = -1;
										return true;
									}
									@Pc(3371) int local3371;
									@Pc(3389) String local3389;
									if (Static351.anInt6505 == 119) {
										local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
										local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local3101 = "";
										local694 = false;
										if (local138 > 0) {
											local3101 = Static232.aClass1_Sub7_Sub1_4.method3134();
											local694 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
										}
										for (local634 = 0; local634 < Static290.anInt5612; local634++) {
											if (local293) {
												if (local299.equals(Static257.aStringArray33[local634])) {
													Static257.aStringArray33[local634] = local220;
													local220 = null;
													Static294.aStringArray40[local634] = local299;
													break;
												}
											} else if (local220.equals(Static257.aStringArray33[local634])) {
												if (Static205.anIntArray493[local634] != local138) {
													Static205.anIntArray493[local634] = local138;
													if (local138 > 0) {
														Static9.method288(0, "", "", local220 + Static213.aString175, 5);
													}
													if (local138 == 0) {
														Static9.method288(0, "", "", local220 + Static311.aString238, 5);
													}
												}
												Static294.aStringArray40[local634] = local299;
												Static68.aStringArray7[local634] = local3101;
												Static264.anIntArray684[local634] = local261;
												local220 = null;
												Static333.aBooleanArray26[local634] = local694;
												break;
											}
										}
										if (local220 != null && Static290.anInt5612 < 200) {
											Static257.aStringArray33[Static290.anInt5612] = local220;
											Static294.aStringArray40[Static290.anInt5612] = local299;
											Static205.anIntArray493[Static290.anInt5612] = local138;
											Static68.aStringArray7[Static290.anInt5612] = local3101;
											Static264.anIntArray684[Static290.anInt5612] = local261;
											Static333.aBooleanArray26[Static290.anInt5612] = local694;
											Static290.anInt5612++;
										}
										Static152.anInt3055 = Static119.anInt2038;
										local325 = Static290.anInt5612;
										while (local325 > 0) {
											local325--;
											@Pc(3331) boolean local3331 = true;
											for (local1967 = 0; local1967 < local325; local1967++) {
												if (Static232.anInt6331 != Static205.anIntArray493[local1967] && Static232.anInt6331 == Static205.anIntArray493[local1967 + 1] || Static205.anIntArray493[local1967] == 0 && Static205.anIntArray493[local1967 + 1] != 0) {
													local3371 = Static205.anIntArray493[local1967];
													Static205.anIntArray493[local1967] = Static205.anIntArray493[local1967 + 1];
													Static205.anIntArray493[local1967 + 1] = local3371;
													local3389 = Static68.aStringArray7[local1967];
													Static68.aStringArray7[local1967] = Static68.aStringArray7[local1967 + 1];
													Static68.aStringArray7[local1967 + 1] = local3389;
													local400 = Static257.aStringArray33[local1967];
													Static257.aStringArray33[local1967] = Static257.aStringArray33[local1967 + 1];
													Static257.aStringArray33[local1967 + 1] = local400;
													local2028 = Static294.aStringArray40[local1967];
													Static294.aStringArray40[local1967] = Static294.aStringArray40[local1967 + 1];
													Static294.aStringArray40[local1967 + 1] = local2028;
													@Pc(3443) int local3443 = Static264.anIntArray684[local1967];
													Static264.anIntArray684[local1967] = Static264.anIntArray684[local1967 + 1];
													Static264.anIntArray684[local1967 + 1] = local3443;
													@Pc(3461) boolean local3461 = Static333.aBooleanArray26[local1967];
													Static333.aBooleanArray26[local1967] = Static333.aBooleanArray26[local1967 + 1];
													Static333.aBooleanArray26[local1967 + 1] = local3461;
													local3331 = false;
												}
											}
											if (local3331) {
												break;
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 255) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3127();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3144();
										if (Static77.method1481(local126)) {
											Static175.method3446(local138 + (local130 << 16), local134);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 166) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
										if (Static77.method1481(local126)) {
											Static248.method4437(local130, local299);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 195) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3149();
										@Pc(3579) Class177 local3579 = Static140.method2694(local126);
										for (local134 = 0; local134 < local3579.anIntArray668.length; local134++) {
											local3579.anIntArray668[local134] = -1;
											local3579.anIntArray668[local134] = 0;
										}
										Static133.method2517(local3579);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 169) {
										local1348 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local299 = Static122.method2174(local130).method4715(Static232.aClass1_Sub7_Sub1_4);
										Static345.method5616(local130, 19, null, 0, local1348, local299, local1348);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 214) {
										for (local126 = 0; local126 < Static254.aClass5_Sub3_Sub3_Sub1Array1.length; local126++) {
											if (Static254.aClass5_Sub3_Sub3_Sub1Array1[local126] != null) {
												Static254.aClass5_Sub3_Sub3_Sub1Array1[local126].anInt4977 = -1;
											}
										}
										for (local130 = 0; local130 < Static169.aClass5_Sub3_Sub3_Sub2Array2.length; local130++) {
											if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local130] != null) {
												Static169.aClass5_Sub3_Sub3_Sub2Array2[local130].anInt4977 = -1;
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 21) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (Static232.aClass1_Sub7_Sub1_4.method3141() == 0) {
											Static24.aClass169Array1[local126] = new Class169();
										} else {
											Static232.aClass1_Sub7_Sub1_4.anInt3368--;
											Static24.aClass169Array1[local126] = new Class169(Static232.aClass1_Sub7_Sub1_4);
										}
										Static351.anInt6505 = -1;
										Static304.anInt5851 = Static119.anInt2038;
										return true;
									} else if (Static351.anInt6505 == 118) {
										local1348 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (Static77.method1481(local130)) {
											Static248.method4437(local134, local1348);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 123) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3144();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3099();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
										if (Static77.method1481(local126)) {
											Static108.method2027(local130, local134);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 152) {
										Static346.anInt6469 = Static232.aClass1_Sub7_Sub1_4.method3112();
										Static194.anInt3963 = Static232.aClass1_Sub7_Sub1_4.method3100();
										for (@Pc(3821) Class1_Sub39 local3821 = (Class1_Sub39) Static52.aClass26_4.method871(); local3821 != null; local3821 = (Class1_Sub39) Static52.aClass26_4.method878()) {
											local130 = (int) (local3821.aLong215 & 0x3FFFL);
											local134 = (int) (local3821.aLong215 >> 14 & 0x3FFFL);
											local138 = (int) (local3821.aLong215 >> 28 & 0x3L);
											if (local138 == Static285.anInt5511 && local130 >= Static346.anInt6469 && local130 < Static346.anInt6469 + 8 && local134 >= Static194.anInt3963 && Static194.anInt3963 + 8 > local134) {
												local3821.method5710();
												Static300.method5117(local130, Static285.anInt5511, local134);
											}
										}
										for (@Pc(3888) Class1_Sub21 local3888 = (Class1_Sub21) Static51.aClass195_44.method5029(); local3888 != null; local3888 = (Class1_Sub21) Static51.aClass195_44.method5021()) {
											if (local3888.anInt3654 >= Static346.anInt6469 && Static346.anInt6469 + 8 > local3888.anInt3654 && Static194.anInt3963 <= local3888.anInt3653 && local3888.anInt3653 < Static194.anInt3963 + 8 && local3888.anInt3651 == Static285.anInt5511) {
												local3888.anInt3645 = 0;
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 97) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local507 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (Static77.method1481(local126)) {
											Static47.method1085(local130, local138, true, local134, local507, local261);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 208) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3149();
										Static99.aClass134_2 = Static180.aClass110_6.method3364(local126);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 68) {
										local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
										local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local299 = local220;
										if (local293) {
											local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
										}
										local309 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local314 = Static232.aClass1_Sub7_Sub1_4.method3137();
										local634 = Static232.aClass1_Sub7_Sub1_4.method3141();
										@Pc(4056) long local4056 = (local309 << 32) + local314;
										@Pc(4058) boolean local4058 = false;
										local3371 = 0;
										while (true) {
											if (local3371 >= 100) {
												if (local634 <= 1) {
													if (Static115.aBoolean193 && !Static300.aBoolean507 || Static206.aBoolean350) {
														local4058 = true;
													} else if (Static340.method3661(local299)) {
														local4058 = true;
													}
												}
												break;
											}
											if (Static151.aLongArray9[local3371] == local4056) {
												local4058 = true;
												break;
											}
											local3371++;
										}
										if (!local4058 && Static155.anInt3113 == 0) {
											Static151.aLongArray9[Static293.anInt5701] = local4056;
											Static293.anInt5701 = (Static293.anInt5701 + 1) % 100;
											@Pc(4130) String local4130 = Static149.method2394(Static77.method1484(Static262.method4604(Static232.aClass1_Sub7_Sub1_4)));
											if (local634 == 2) {
												Static345.method5616(-1, 7, null, 0, "<img=1>" + local299, local4130, "<img=1>" + local220);
											} else if (local634 == 1) {
												Static345.method5616(-1, 7, null, 0, "<img=0>" + local299, local4130, "<img=0>" + local220);
											} else {
												Static345.method5616(-1, 3, null, 0, local299, local4130, local220);
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 130) {
										Static194.anInt3965 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static309.anInt5945 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static58.anInt1292 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 198 || Static351.anInt6505 == 226 || Static351.anInt6505 == 189 || Static351.anInt6505 == 6 || Static351.anInt6505 == 95 || Static351.anInt6505 == 22 || Static351.anInt6505 == 218 || Static351.anInt6505 == 82 || Static351.anInt6505 == 175 || Static351.anInt6505 == 8 || Static351.anInt6505 == 35 || Static351.anInt6505 == 176 || Static351.anInt6505 == 186 || Static351.anInt6505 == 25 || Static351.anInt6505 == 133) {
										Static47.method1080();
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 10) {
										if (Static230.anInt4529 == 0) {
											Static331.aString252 = Static219.aString177;
										} else {
											Static331.aString252 = Static232.aClass1_Sub7_Sub1_4.method3134();
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 19) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3127();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3144();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3115();
										if (Static77.method1481(local134)) {
											Static107.method2007(local130, local261, local126, local138);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 105) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3144();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (Static77.method1481(local126)) {
											Static177.method3479(local134, local130);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 253) {
										local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
										local220 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local299 = local220;
										if (local293) {
											local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
										}
										local309 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local314 = Static232.aClass1_Sub7_Sub1_4.method3137();
										local634 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local640 = Static232.aClass1_Sub7_Sub1_4.method3115();
										@Pc(4425) long local4425 = local314 + (local309 << 32);
										@Pc(4427) boolean local4427 = false;
										@Pc(4429) int local4429 = 0;
										while (true) {
											if (local4429 >= 100) {
												if (local634 <= 1 && Static340.method3661(local299)) {
													local4427 = true;
												}
												break;
											}
											if (local4425 == Static151.aLongArray9[local4429]) {
												local4427 = true;
												break;
											}
											local4429++;
										}
										if (!local4427 && Static155.anInt3113 == 0) {
											Static151.aLongArray9[Static293.anInt5701] = local4425;
											Static293.anInt5701 = (Static293.anInt5701 + 1) % 100;
											local3389 = Static122.method2174(local640).method4715(Static232.aClass1_Sub7_Sub1_4);
											if (local634 == 2) {
												Static345.method5616(local640, 18, null, 0, "<img=1>" + local299, local3389, "<img=1>" + local220);
											} else if (local634 == 1) {
												Static345.method5616(local640, 18, null, 0, "<img=0>" + local299, local3389, "<img=0>" + local220);
											} else {
												Static345.method5616(local640, 18, null, 0, local299, local3389, local220);
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 80) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3112();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
										if (Static77.method1481(local134)) {
											if (local126 == 2) {
												Static211.method3874();
											}
											Static100.anInt2086 = local130;
											Static194.method3681(local130);
											Static16.method370(false);
											Static98.method1798(Static100.anInt2086);
											for (local138 = 0; local138 < 100; local138++) {
												Static313.aBooleanArray30[local138] = true;
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 212) {
										Static194.anInt3963 = Static232.aClass1_Sub7_Sub1_4.method3112();
										Static346.anInt6469 = Static232.aClass1_Sub7_Sub1_4.method3100();
										while (Static230.anInt4529 > Static232.aClass1_Sub7_Sub1_4.anInt3368) {
											Static351.anInt6505 = Static232.aClass1_Sub7_Sub1_4.method3141();
											Static47.method1080();
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 67) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3100();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3147();
										Static140.method2697(local126, local130);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 92) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local507 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (Static77.method1481(local126)) {
											Static52.method1153(local507, local130, local138, local261, local134);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 153) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3099();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (Static77.method1481(local130)) {
											Static135.method2609(local134, local126);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 91) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
										if (Static77.method1481(local134)) {
											Static134.method2593(local130, local126);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 101) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
										if (Static77.method1481(local126)) {
											Static154.method2923();
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 164) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3125();
										Static282.method4871(local130, local126);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 45) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3141();
										@Pc(4816) boolean local4816 = (local126 & 0x1) == 1;
										local299 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local3070 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local3072 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local3101 = Static232.aClass1_Sub7_Sub1_4.method3134();
										if (local4816) {
											for (local611 = 0; local611 < Static227.anInt4474; local611++) {
												if (Static66.aStringArray6[local611].equals(local3101)) {
													Static313.aStringArray44[local611] = local299;
													if (local3070.equals("")) {
														Static66.aStringArray6[local611] = local299;
													} else {
														Static66.aStringArray6[local611] = local3070;
													}
													Static310.aStringArray43[local611] = local3072;
													if (local3101.equals("")) {
														Static94.aStringArray12[local611] = local3072;
													} else {
														Static94.aStringArray12[local611] = local3101;
													}
													break;
												}
											}
										} else {
											Static313.aStringArray44[Static227.anInt4474] = local299;
											if (local3070.equals("")) {
												Static66.aStringArray6[Static227.anInt4474] = local299;
											} else {
												Static66.aStringArray6[Static227.anInt4474] = local3070;
											}
											Static310.aStringArray43[Static227.anInt4474] = local3072;
											if (local3101.equals("")) {
												Static94.aStringArray12[Static227.anInt4474] = local3072;
											} else {
												Static94.aStringArray12[Static227.anInt4474] = local3101;
											}
											Static140.aBooleanArray10[Static227.anInt4474] = (local126 & 0x2) == 2;
											Static227.anInt4474++;
										}
										Static351.anInt6505 = -1;
										Static152.anInt3055 = Static119.anInt2038;
										return true;
									} else if (Static351.anInt6505 == 61) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3099();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3147();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3144();
										if (local138 == 65535) {
											local138 = -1;
										}
										if (Static77.method1481(local134)) {
											@Pc(4991) Class177 local4991 = Static140.method2694(local130);
											@Pc(5009) Class61 local5009;
											if (local4991.aBoolean445) {
												Static161.method3066(local138, local130, local126);
												local5009 = Static241.method4285(local138);
												Static107.method2007(local130, local5009.anInt1784, local5009.anInt1829, local5009.anInt1836);
												Static314.method5306(local5009.anInt1804, local5009.anInt1787, local130, local5009.anInt1781);
											} else if (local138 == -1) {
												Static351.anInt6505 = -1;
												local4991.anInt5192 = 0;
												return true;
											} else {
												local5009 = Static241.method4285(local138);
												local4991.anInt5260 = local5009.anInt1784;
												local4991.anInt5268 = local5009.anInt1836;
												local4991.anInt5192 = 4;
												local4991.anInt5245 = local138;
												local4991.anInt5217 = local5009.anInt1829 * 100 / local126;
												Static133.method2517(local4991);
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 245) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3141();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (local126 == 255) {
											local126 = -1;
											local130 = -1;
										}
										Static125.method2396(local126, local130);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 13) {
										if (Static100.anInt2086 != -1) {
											Static152.method2897(0, Static100.anInt2086);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 180) {
										Static324.method5451(false);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 210) {
										local1348 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local220 = Static149.method2394(Static77.method1484(Static262.method4604(Static232.aClass1_Sub7_Sub1_4)));
										Static9.method288(0, local1348, local1348, local220, 6);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 144) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (local126 == 65535) {
											local126 = -1;
										}
										local130 = Static232.aClass1_Sub7_Sub1_4.method3112();
										Static332.method5566(local126, local130);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 222) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (local126 == 65535) {
											local126 = -1;
										}
										local130 = Static232.aClass1_Sub7_Sub1_4.method3137();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3112();
										Static241.method4287(local130, local134, local126);
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 159) {
										Static80.anInt1599 = Static119.anInt2038;
										if (Static230.anInt4529 == 0) {
											Static23.aClass123Array1 = null;
											Static50.aString40 = null;
											Static229.anInt1684 = 0;
											Static317.aString245 = null;
											Static351.anInt6505 = -1;
											return true;
										}
										Static317.aString245 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
										if (local293) {
											Static232.aClass1_Sub7_Sub1_4.method3134();
										}
										@Pc(5255) long local5255 = Static232.aClass1_Sub7_Sub1_4.method3109();
										Static50.aString40 = Static43.method2806(local5255);
										Static161.aByte29 = Static232.aClass1_Sub7_Sub1_4.method3130();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3141();
										if (local138 == 255) {
											Static351.anInt6505 = -1;
											return true;
										}
										Static229.anInt1684 = local138;
										@Pc(5279) Class123[] local5279 = new Class123[100];
										for (local507 = 0; local507 < Static229.anInt1684; local507++) {
											local5279[local507] = new Class123();
											local5279[local507].aString155 = Static232.aClass1_Sub7_Sub1_4.method3134();
											local293 = Static232.aClass1_Sub7_Sub1_4.method3141() == 1;
											if (local293) {
												local5279[local507].aString154 = Static232.aClass1_Sub7_Sub1_4.method3134();
											} else {
												local5279[local507].aString154 = local5279[local507].aString155;
											}
											local5279[local507].anInt3833 = Static232.aClass1_Sub7_Sub1_4.method3115();
											local5279[local507].aByte38 = Static232.aClass1_Sub7_Sub1_4.method3130();
											local5279[local507].aString153 = Static232.aClass1_Sub7_Sub1_4.method3134();
											if (local5279[local507].aString154.equals(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130)) {
												Static99.aByte16 = local5279[local507].aByte38;
											}
										}
										local640 = Static229.anInt1684;
										while (local640 > 0) {
											local694 = true;
											local640--;
											for (local325 = 0; local325 < local640; local325++) {
												if (local5279[local325].aString155.compareTo(local5279[local325 + 1].aString155) > 0) {
													local1464 = local5279[local325];
													local5279[local325] = local5279[local325 + 1];
													local694 = false;
													local5279[local325 + 1] = local1464;
												}
											}
											if (local694) {
												break;
											}
										}
										Static23.aClass123Array1 = local5279;
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 26) {
										local1348 = Static232.aClass1_Sub7_Sub1_4.method3134();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3094();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3112();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3147();
										if (local138 == 65535) {
											local138 = -1;
										}
										if (local134 >= 1 && local134 <= 8) {
											if (local1348.equalsIgnoreCase("null")) {
												local1348 = null;
											}
											Static235.aStringArray32[local134 - 1] = local1348;
											Static192.anIntArray811[local134 - 1] = local138;
											Static306.aBooleanArray29[local134 - 1] = local130 == 0;
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 171) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (local126 == 65535) {
											local126 = -1;
										}
										local130 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3115();
										if (Static77.method1481(local134)) {
											Static135.method2614(local126, -1, local130, 2);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 40) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3144();
										if (local130 == 65535) {
											local130 = -1;
										}
										local134 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local138 = Static232.aClass1_Sub7_Sub1_4.method3115();
										local261 = Static232.aClass1_Sub7_Sub1_4.method3115();
										if (local261 == 65535) {
											local261 = -1;
										}
										if (Static77.method1481(local138)) {
											for (local507 = local130; local507 <= local261; local507++) {
												local2422 = (long) local507 + ((long) local126 << 32);
												local2428 = (Class1_Sub35) Static324.aClass26_31.method870(local2422);
												if (local2428 != null) {
													local2440 = new Class1_Sub35(local134, local2428.anInt5510);
													local2428.method5710();
												} else if (local507 == -1) {
													local2440 = new Class1_Sub35(local134, Static140.method2694(local126).aClass1_Sub35_11.anInt5510);
												} else {
													local2440 = new Class1_Sub35(local134, -1);
												}
												Static324.aClass26_31.method877(local2422, local2440);
											}
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 39) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3125();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (Static77.method1481(local130)) {
											Static135.method2614(-1, -1, local126, 3);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 79) {
										Static198.method3737();
										Static283.anInt5493 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static332.anInt6357 = Static119.anInt2038;
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 46) {
										Static346.anInt6469 = Static232.aClass1_Sub7_Sub1_4.method3112();
										Static194.anInt3963 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 192) {
										Static88.method1693();
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 145) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3144();
										local1847 = Static232.aClass1_Sub7_Sub1_4.method3120();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3101();
										if (Static77.method1481(local134)) {
											Static108.method2027(local1847, local126);
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 11) {
										Static198.method3737();
										Static186.anInt3867 = Static232.aClass1_Sub7_Sub1_4.method3090();
										Static351.anInt6505 = -1;
										Static332.anInt6357 = Static119.anInt2038;
										return true;
									} else if (Static351.anInt6505 == 185) {
										local126 = Static232.aClass1_Sub7_Sub1_4.method3115();
										if (Static77.method1481(local126)) {
											Static198.method3731();
										}
										Static351.anInt6505 = -1;
										return true;
									} else if (Static351.anInt6505 == 3) {
										Static227.anInt4474 = Static232.aClass1_Sub7_Sub1_4.method3141();
										for (local126 = 0; local126 < Static227.anInt4474; local126++) {
											Static313.aStringArray44[local126] = Static232.aClass1_Sub7_Sub1_4.method3134();
											Static66.aStringArray6[local126] = Static232.aClass1_Sub7_Sub1_4.method3134();
											if (Static66.aStringArray6[local126].equals("")) {
												Static66.aStringArray6[local126] = Static313.aStringArray44[local126];
											}
											Static310.aStringArray43[local126] = Static232.aClass1_Sub7_Sub1_4.method3134();
											Static94.aStringArray12[local126] = Static232.aClass1_Sub7_Sub1_4.method3134();
											if (Static94.aStringArray12[local126].equals("")) {
												Static94.aStringArray12[local126] = Static310.aStringArray43[local126];
											}
											Static140.aBooleanArray10[local126] = false;
										}
										Static351.anInt6505 = -1;
										Static152.anInt3055 = Static119.anInt2038;
										return true;
									} else if (Static351.anInt6505 == 115) {
										Static198.method3737();
										local126 = Static232.aClass1_Sub7_Sub1_4.method3099();
										local130 = Static232.aClass1_Sub7_Sub1_4.method3094();
										local134 = Static232.aClass1_Sub7_Sub1_4.method3141();
										Static291.anIntArray712[local130] = local126;
										Static333.anIntArray595[local130] = local134;
										Static343.anIntArray624[local130] = 1;
										local138 = Static205.anIntArray494[local130] - 1;
										for (local261 = 0; local261 < local138; local261++) {
											if (Class72.anIntArray260[local261] <= local126) {
												Static343.anIntArray624[local130] = local261 + 2;
											}
										}
										Static213.anIntArray539[Static297.anInt5772++ & 0x1F] = local130;
										Static351.anInt6505 = -1;
										return true;
									} else {
										Static152.method2899("T1 - " + Static351.anInt6505 + "," + Static28.anInt732 + "," + Static322.anInt6152 + " - " + Static230.anInt4529, null);
										Static55.method1208();
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
