import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!rb;")
	public static Class87 aClass87_36;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!wa;")
	public static Class23 aClass23_78;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public static int anInt3982;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1488 = Static161.method2452("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1487 = aClass20_1488;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public static int anInt3977 = 0;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1489 = Static161.method2452("sl_stars");

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1490 = Static161.method2452("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public static int anInt3979 = 0;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray47 = new boolean[8];

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Z")
	public static boolean method3012() throws IOException {
		if (Static157.aClass39_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static157.aClass39_3.method1172();
		if (local13 == 0) {
			return false;
		}
		if (Static196.anInt3834 == -1) {
			local13--;
			Static157.aClass39_3.method1173(1, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
			Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
			Static196.anInt3834 = Static10.aClass5_Sub6_Sub1_1.method3092();
			Static6.anInt155 = Static106.anIntArray236[Static196.anInt3834];
		}
		if (Static6.anInt155 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static157.aClass39_3.method1173(1, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
			local13--;
			Static6.anInt155 = Static10.aClass5_Sub6_Sub1_1.aByteArray56[0] & 0xFF;
		}
		if (Static6.anInt155 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static157.aClass39_3.method1173(2, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
			Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
			Static6.anInt155 = Static10.aClass5_Sub6_Sub1_1.method3077();
		}
		if (local13 < Static6.anInt155) {
			return false;
		}
		Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
		Static157.aClass39_3.method1173(Static6.anInt155, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
		Static118.anInt3277 = 0;
		Static50.anInt1080 = Static50.anInt1085;
		Static50.anInt1085 = Static87.anInt2704;
		Static87.anInt2704 = Static196.anInt3834;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(134) Class69 local134;
		if (Static196.anInt3834 == 225) {
			local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
			local130 = Static10.aClass5_Sub6_Sub1_1.method3057();
			local134 = Static157.method2392(local126);
			if (local130 != local134.anInt2476 || local130 == -1) {
				local134.anInt2482 = 0;
				local134.anInt2476 = local130;
				local134.anInt2525 = 0;
				Static184.method2779(local134);
			}
			Static196.anInt3834 = -1;
			return true;
		} else if (Static196.anInt3834 == 205) {
			Static31.method510();
			Static166.anInt3315 = Static10.aClass5_Sub6_Sub1_1.method3062();
			Static173.anInt3462 = Static98.anInt2085;
			Static196.anInt3834 = -1;
			return true;
		} else if (Static196.anInt3834 == 139) {
			anInt3979 = Static10.aClass5_Sub6_Sub1_1.method3081() * 30;
			Static196.anInt3834 = -1;
			Static173.anInt3462 = Static98.anInt2085;
			return true;
		} else if (Static196.anInt3834 == 192) {
			@Pc(205) byte[] local205 = new byte[Static6.anInt155];
			Static10.aClass5_Sub6_Sub1_1.method3091(Static6.anInt155, local205);
			Static182.method2754(Static92.method1513(local205, Static6.anInt155, 0));
			Static196.anInt3834 = -1;
			return true;
		} else {
			@Pc(239) int local239;
			@Pc(243) int local243;
			@Pc(265) int local265;
			@Pc(384) int local384;
			@Pc(393) int local393;
			if (Static196.anInt3834 == 112) {
				local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
				local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
				local239 = Static10.aClass5_Sub6_Sub1_1.method3066();
				local243 = Static10.aClass5_Sub6_Sub1_1.method3054();
				if (local239 >> 30 != 0) {
					local265 = local239 >> 28 & 0x3;
					local384 = (local239 & 0x3FFF) - Static110.anInt2295;
					local393 = (local239 >> 14 & 0x3FFF) - Static86.anInt1895;
					if (local393 >= 0 && local384 >= 0 && local393 < 104 && local384 < 104) {
						local393 = local393 * 128 + 64;
						local384 = local384 * 128 + 64;
						@Pc(439) Class1_Sub7 local439 = new Class1_Sub7(local126, local265, local393, local384, Static128.method1999(local265, local393, local384) - local243, local130, Static177.anInt3533);
						Static166.aClass91_15.method2686(new Class5_Sub2_Sub9(local439));
					}
				} else if (local239 >> 29 != 0) {
					local265 = local239 & 0xFFFF;
					@Pc(330) Class1_Sub2_Sub1 local330 = Static61.aClass1_Sub2_Sub1Array1[local265];
					if (local330 != null) {
						local330.anInt2239 = local130 + Static177.anInt3533;
						local330.anInt2255 = 0;
						local330.anInt2266 = local126;
						if (Static177.anInt3533 < local330.anInt2239) {
							local330.anInt2255 = -1;
						}
						local330.anInt2236 = 0;
						if (local330.anInt2266 == 65535) {
							local330.anInt2266 = -1;
						}
						local330.anInt2225 = local243;
					}
				} else if (local239 >> 28 != 0) {
					local265 = local239 & 0xFFFF;
					@Pc(274) Class1_Sub2_Sub2 local274;
					if (local265 == Static65.anInt1414) {
						local274 = Static210.aClass1_Sub2_Sub2_2;
					} else {
						local274 = Static6.aClass1_Sub2_Sub2Array1[local265];
					}
					if (local274 != null) {
						local274.anInt2255 = 0;
						local274.anInt2225 = local243;
						local274.anInt2266 = local126;
						local274.anInt2236 = 0;
						local274.anInt2239 = Static177.anInt3533 + local130;
						if (Static177.anInt3533 < local274.anInt2239) {
							local274.anInt2255 = -1;
						}
						if (local274.anInt2266 == 65535) {
							local274.anInt2266 = -1;
						}
					}
				}
				Static196.anInt3834 = -1;
				return true;
			} else if (Static196.anInt3834 == 125 || Static196.anInt3834 == 238 || Static196.anInt3834 == 198 || Static196.anInt3834 == 74 || Static196.anInt3834 == 16 || Static196.anInt3834 == 214 || Static196.anInt3834 == 188 || Static196.anInt3834 == 134 || Static196.anInt3834 == 138 || Static196.anInt3834 == 60 || Static196.anInt3834 == 77 || Static196.anInt3834 == 24) {
				Static72.method1184();
				Static196.anInt3834 = -1;
				return true;
			} else if (Static196.anInt3834 == 10) {
				if (Static6.anInt155 == 0) {
					Static38.aClass20_287 = Static188.aClass20_1374;
				} else {
					Static38.aClass20_287 = Static10.aClass5_Sub6_Sub1_1.method3027();
				}
				Static196.anInt3834 = -1;
				return true;
			} else {
				@Pc(544) Class69 local544;
				if (Static196.anInt3834 == 76) {
					local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
					local130 = Static10.aClass5_Sub6_Sub1_1.method3042();
					local239 = Static10.aClass5_Sub6_Sub1_1.method3054();
					local243 = Static10.aClass5_Sub6_Sub1_1.method3054();
					local544 = Static157.method2392(local130);
					if (local126 != local544.anInt2529 || local243 != local544.anInt2531 || local239 != local544.anInt2496) {
						local544.anInt2529 = local126;
						local544.anInt2531 = local243;
						local544.anInt2496 = local239;
						Static184.method2779(local544);
					}
					Static196.anInt3834 = -1;
					return true;
				} else if (Static196.anInt3834 == 87) {
					Static136.method2113();
					Static196.anInt3834 = -1;
					return true;
				} else {
					@Pc(643) int local643;
					@Pc(655) int local655;
					if (Static196.anInt3834 == 229) {
						local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
						if (local126 == 65535) {
							local126 = -1;
						}
						local130 = Static10.aClass5_Sub6_Sub1_1.method3042();
						local393 = Static10.aClass5_Sub6_Sub1_1.method3036();
						local239 = local130 >> 28 & 0x3;
						local243 = local130 >> 14 & 0x3FFF;
						local384 = local393 >> 2;
						local265 = local130 & 0x3FFF;
						local643 = local393 & 0x3;
						local265 -= Static110.anInt2295;
						local243 -= Static86.anInt1895;
						local655 = Static148.anIntArray322[local384];
						Static116.method1861(local655, local243, local265, local126, local384, local239, local643);
						Static196.anInt3834 = -1;
						return true;
					}
					@Pc(781) Class20 local781;
					@Pc(675) long local675;
					@Pc(683) long local683;
					@Pc(688) long local688;
					@Pc(693) long local693;
					@Pc(709) int local709;
					@Pc(713) int local713;
					if (Static196.anInt3834 == 213) {
						local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
						Static10.aClass5_Sub6_Sub1_1.method3053();
						local683 = Static10.aClass5_Sub6_Sub1_1.method3069();
						local688 = Static10.aClass5_Sub6_Sub1_1.method3077();
						local693 = Static10.aClass5_Sub6_Sub1_1.method3072();
						@Pc(699) long local699 = local693 + (local688 << 32);
						local655 = Static10.aClass5_Sub6_Sub1_1.method3062();
						local709 = Static10.aClass5_Sub6_Sub1_1.method3077();
						@Pc(711) boolean local711 = false;
						local713 = 0;
						label1100: while (true) {
							if (local713 >= 100) {
								if (local655 <= 1) {
									for (@Pc(736) int local736 = 0; local736 < Static50.anInt1082; local736++) {
										if (Static168.aLongArray39[local736] == local675) {
											local711 = true;
											break label1100;
										}
									}
								}
								break;
							}
							if (local699 == Static59.aLongArray13[local713]) {
								local711 = true;
								break;
							}
							local713++;
						}
						if (!local711 && Static217.anInt4212 == 0) {
							Static59.aLongArray13[Static94.anInt2005] = local699;
							Static94.anInt2005 = (Static94.anInt2005 + 1) % 100;
							local781 = Static57.method995(local709).method1933(Static10.aClass5_Sub6_Sub1_1);
							if (local655 == 2 || local655 == 3) {
								Static177.method2680(20, local709, local781, Static160.method2438(local683).method565(), Static70.method1166(new Class20[] { Static43.aClass20_331, Static160.method2438(local675).method565() }));
							} else if (local655 == 1) {
								Static177.method2680(20, local709, local781, Static160.method2438(local683).method565(), Static70.method1166(new Class20[] { Static64.aClass20_480, Static160.method2438(local675).method565() }));
							} else {
								Static177.method2680(20, local709, local781, Static160.method2438(local683).method565(), Static160.method2438(local675).method565());
							}
						}
						Static196.anInt3834 = -1;
						return true;
					}
					@Pc(976) Class5_Sub25 local976;
					@Pc(1032) long local1032;
					if (Static196.anInt3834 == 34) {
						local126 = Static6.anInt155 + Static10.aClass5_Sub6_Sub1_1.anInt4050;
						local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
						local239 = Static10.aClass5_Sub6_Sub1_1.method3077();
						if (Static130.anInt2715 != local130) {
							Static130.anInt2715 = local130;
							Static13.method2932(Static130.anInt2715);
							Static180.method2725();
							Static68.method1119(Static130.anInt2715);
							for (local243 = 0; local243 < 100; local243++) {
								Static185.aBooleanArray43[local243] = true;
							}
						}
						while (local239-- > 0) {
							local243 = Static10.aClass5_Sub6_Sub1_1.method3073();
							local265 = Static10.aClass5_Sub6_Sub1_1.method3077();
							local393 = Static10.aClass5_Sub6_Sub1_1.method3062();
							@Pc(939) Class5_Sub25 local939 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local243);
							if (local939 != null && local939.anInt3526 != local265) {
								Static114.method500(true, local939);
								local939 = null;
							}
							if (local939 == null) {
								local939 = Static134.method2071(local393, local265, local243);
							}
							local939.aBoolean162 = true;
						}
						for (local976 = (Class5_Sub25) Static75.aClass75_7.method2067(); local976 != null; local976 = (Class5_Sub25) Static75.aClass75_7.method2066()) {
							if (local976.aBoolean162) {
								local976.aBoolean162 = false;
							} else {
								Static114.method500(true, local976);
							}
						}
						Static94.aClass75_10 = new Class75(512);
						while (Static10.aClass5_Sub6_Sub1_1.anInt4050 < local126) {
							local265 = Static10.aClass5_Sub6_Sub1_1.method3073();
							local393 = Static10.aClass5_Sub6_Sub1_1.method3077();
							local384 = Static10.aClass5_Sub6_Sub1_1.method3077();
							local643 = Static10.aClass5_Sub6_Sub1_1.method3073();
							for (local655 = local393; local655 <= local384; local655++) {
								local1032 = (long) local655 + ((long) local265 << 32);
								Static94.aClass75_10.method2069(new Class5_Sub20(local643), local1032);
							}
						}
						Static196.anInt3834 = -1;
						return true;
					} else if (Static196.anInt3834 == 47) {
						Static166.anInt3320 = 0;
						Static196.anInt3834 = -1;
						return true;
					} else {
						@Pc(1078) Class20 local1078;
						if (Static196.anInt3834 == 99) {
							local126 = Static10.aClass5_Sub6_Sub1_1.method3042();
							local1078 = Static10.aClass5_Sub6_Sub1_1.method3027();
							local134 = Static157.method2392(local126);
							if (!local1078.method594(local134.aClass20_920)) {
								local134.aClass20_920 = local1078;
								Static184.method2779(local134);
							}
							Static196.anInt3834 = -1;
							return true;
						} else if (Static196.anInt3834 == 52) {
							Static38.anInt830 = Static10.aClass5_Sub6_Sub1_1.method3062();
							Static210.anInt922 = Static10.aClass5_Sub6_Sub1_1.method3074();
							while (Static10.aClass5_Sub6_Sub1_1.anInt4050 < Static6.anInt155) {
								Static196.anInt3834 = Static10.aClass5_Sub6_Sub1_1.method3062();
								Static72.method1184();
							}
							Static196.anInt3834 = -1;
							return true;
						} else if (Static196.anInt3834 == 13) {
							Static26.aBoolean182 = true;
							Static93.anInt3208 = Static10.aClass5_Sub6_Sub1_1.method3062();
							Static133.anInt2776 = Static10.aClass5_Sub6_Sub1_1.method3062();
							Static135.anInt2827 = Static10.aClass5_Sub6_Sub1_1.method3077();
							Static98.anInt2108 = Static10.aClass5_Sub6_Sub1_1.method3062();
							Static170.anInt3425 = Static10.aClass5_Sub6_Sub1_1.method3062();
							if (Static170.anInt3425 >= 100) {
								local126 = Static93.anInt3208 * 128 + 64;
								local130 = Static133.anInt2776 * 128 + 64;
								local239 = Static128.method1999(Static111.anInt2327, local126, local130) - Static135.anInt2827;
								local243 = local126 - Static4.anInt109;
								local393 = local130 - Static104.anInt2182;
								local265 = local239 - Static146.anInt3026;
								local384 = (int) Math.sqrt((double) (local243 * local243 + local393 * local393));
								Static80.anInt1806 = (int) (Math.atan2((double) local265, (double) local384) * 325.949D) & 0x7FF;
								Static23.anInt398 = (int) (Math.atan2((double) local243, (double) local393) * -325.949D) & 0x7FF;
								if (Static80.anInt1806 < 128) {
									Static80.anInt1806 = 128;
								}
								if (Static80.anInt1806 > 383) {
									Static80.anInt1806 = 383;
								}
							}
							Static196.anInt3834 = -1;
							return true;
						} else if (Static196.anInt3834 == 248) {
							local126 = Static10.aClass5_Sub6_Sub1_1.method3042();
							local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
							local243 = local130 >> 5 & 0x1F;
							local239 = local130 >> 10 & 0x1F;
							local265 = local130 & 0x1F;
							local393 = (local265 << 3) + (local243 << 11) + (local239 << 19);
							@Pc(1290) Class69 local1290 = Static157.method2392(local126);
							if (local393 != local1290.anInt2487) {
								local1290.anInt2487 = local393;
								Static184.method2779(local1290);
							}
							Static196.anInt3834 = -1;
							return true;
						} else {
							@Pc(1353) int local1353;
							@Pc(1437) Class20 local1437;
							if (Static196.anInt3834 == 183) {
								local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
								Static10.aClass5_Sub6_Sub1_1.method3053();
								local683 = Static10.aClass5_Sub6_Sub1_1.method3069();
								local688 = Static10.aClass5_Sub6_Sub1_1.method3077();
								local693 = Static10.aClass5_Sub6_Sub1_1.method3072();
								local1032 = (local688 << 32) + local693;
								local655 = Static10.aClass5_Sub6_Sub1_1.method3062();
								@Pc(1351) boolean local1351 = false;
								local1353 = 0;
								label1164: while (true) {
									if (local1353 >= 100) {
										if (local655 <= 1) {
											if (Static127.anInt2649 == 1 || Static68.anInt1469 == 1) {
												local1351 = true;
											} else {
												for (local713 = 0; local713 < Static50.anInt1082; local713++) {
													if (Static168.aLongArray39[local713] == local675) {
														local1351 = true;
														break label1164;
													}
												}
											}
										}
										break;
									}
									if (local1032 == Static59.aLongArray13[local1353]) {
										local1351 = true;
										break;
									}
									local1353++;
								}
								if (!local1351 && Static217.anInt4212 == 0) {
									Static59.aLongArray13[Static94.anInt2005] = local1032;
									Static94.anInt2005 = (Static94.anInt2005 + 1) % 100;
									local1437 = Static81.method1358(Static157.method2387(Static10.aClass5_Sub6_Sub1_1).method560());
									if (local655 == 2 || local655 == 3) {
										Static152.method2289(Static160.method2438(local683).method565(), local1437, Static70.method1166(new Class20[] { Static43.aClass20_331, Static160.method2438(local675).method565() }));
									} else if (local655 == 1) {
										Static152.method2289(Static160.method2438(local683).method565(), local1437, Static70.method1166(new Class20[] { Static64.aClass20_480, Static160.method2438(local675).method565() }));
									} else {
										Static152.method2289(Static160.method2438(local683).method565(), local1437, Static160.method2438(local675).method565());
									}
								}
								Static196.anInt3834 = -1;
								return true;
							} else if (Static196.anInt3834 == 239) {
								Static31.method510();
								local126 = Static10.aClass5_Sub6_Sub1_1.method3084();
								local130 = Static10.aClass5_Sub6_Sub1_1.method3059();
								local239 = Static10.aClass5_Sub6_Sub1_1.method3036();
								Static101.anIntArray213[local130] = local126;
								Static41.anIntArray89[local130] = local239;
								Static218.anIntArray431[local130] = 1;
								for (local243 = 0; local243 < 98; local243++) {
									if (local126 >= Class41.anIntArray146[local243]) {
										Static218.anIntArray431[local130] = local243 + 2;
									}
								}
								Static153.anIntArray339[Static177.anInt3542++ & 0x1F] = local130;
								Static196.anInt3834 = -1;
								return true;
							} else if (Static196.anInt3834 == 246) {
								@Pc(1603) byte local1603 = Static10.aClass5_Sub6_Sub1_1.method3034();
								local130 = Static10.aClass5_Sub6_Sub1_1.method3043();
								Static134.anIntArray304[local130] = local1603;
								if (Static139.anIntArray309[local130] != local1603) {
									Static139.anIntArray309[local130] = local1603;
									Static136.method2115(local130);
								}
								Static100.anIntArray211[Static138.anInt3859++ & 0x1F] = local130;
								Static196.anInt3834 = -1;
								return true;
							} else if (Static196.anInt3834 == 228) {
								local126 = Static10.aClass5_Sub6_Sub1_1.method3043();
								local130 = Static10.aClass5_Sub6_Sub1_1.method3054();
								Static214.anInt4154 = local130;
								Static72.anInt1568 = local126;
								Static211.method3122();
								Static196.anInt3834 = -1;
								return true;
							} else if (Static196.anInt3834 == 44) {
								Static170.method2597(false);
								Static196.anInt3834 = -1;
								return true;
							} else {
								@Pc(1687) Class20 local1687;
								if (Static196.anInt3834 == 58) {
									local1687 = Static10.aClass5_Sub6_Sub1_1.method3027();
									@Pc(1696) Object[] local1696 = new Object[local1687.method582() + 1];
									for (local239 = local1687.method582() - 1; local239 >= 0; local239--) {
										if (local1687.method577(local239) == 115) {
											local1696[local239 + 1] = Static10.aClass5_Sub6_Sub1_1.method3027();
										} else {
											local1696[local239 + 1] = Integer.valueOf(Static10.aClass5_Sub6_Sub1_1.method3073());
										}
									}
									local1696[0] = Integer.valueOf(Static10.aClass5_Sub6_Sub1_1.method3073());
									@Pc(1752) Class5_Sub10 local1752 = new Class5_Sub10();
									local1752.anObjectArray3 = local1696;
									Static184.method2781(local1752);
									Static196.anInt3834 = -1;
									return true;
								}
								@Pc(1779) boolean local1779;
								@Pc(1867) Class20 local1867;
								if (Static196.anInt3834 == 114) {
									local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
									local239 = Static10.aClass5_Sub6_Sub1_1.method3077();
									@Pc(1777) byte local1777 = Static10.aClass5_Sub6_Sub1_1.method3053();
									local1779 = false;
									if ((Long.MIN_VALUE & local675) != 0L) {
										local1779 = true;
									}
									if (local1779) {
										if (Static118.anInt3271 == 0) {
											Static196.anInt3834 = -1;
											return true;
										}
										local675 &= Long.MAX_VALUE;
										for (local393 = 0; Static118.anInt3271 > local393 && (Static129.aClass5_Sub19Array1[local393].aLong253 != local675 || Static129.aClass5_Sub19Array1[local393].anInt2436 != local239); local393++) {
										}
										if (local393 < Static118.anInt3271) {
											while (local393 < Static118.anInt3271 - 1) {
												Static129.aClass5_Sub19Array1[local393] = Static129.aClass5_Sub19Array1[local393 + 1];
												local393++;
											}
											Static118.anInt3271--;
											Static129.aClass5_Sub19Array1[Static118.anInt3271] = null;
										}
									} else {
										local1867 = Static10.aClass5_Sub6_Sub1_1.method3027();
										@Pc(1871) Class5_Sub19 local1871 = new Class5_Sub19();
										local1871.aLong253 = local675;
										local1871.aClass20_903 = Static160.method2438(local1871.aLong253);
										local1871.aByte5 = local1777;
										local1871.aClass20_901 = local1867;
										local1871.anInt2436 = local239;
										for (local643 = Static118.anInt3271 - 1; local643 >= 0; local643--) {
											local655 = Static129.aClass5_Sub19Array1[local643].aClass20_903.method562(local1871.aClass20_903);
											if (local655 == 0) {
												Static129.aClass5_Sub19Array1[local643].anInt2436 = local239;
												Static129.aClass5_Sub19Array1[local643].aByte5 = local1777;
												Static129.aClass5_Sub19Array1[local643].aClass20_901 = local1867;
												Static196.anInt3834 = -1;
												Static173.anInt3465 = Static98.anInt2085;
												if (local675 == Static173.aLong203) {
													Static74.aByte3 = local1777;
												}
												return true;
											}
											if (local655 < 0) {
												break;
											}
										}
										if (Static118.anInt3271 >= Static129.aClass5_Sub19Array1.length) {
											Static196.anInt3834 = -1;
											return true;
										}
										for (local655 = Static118.anInt3271 - 1; local655 > local643; local655--) {
											Static129.aClass5_Sub19Array1[local655 + 1] = Static129.aClass5_Sub19Array1[local655];
										}
										if (Static118.anInt3271 == 0) {
											Static129.aClass5_Sub19Array1 = new Class5_Sub19[100];
										}
										Static129.aClass5_Sub19Array1[local643 + 1] = local1871;
										Static118.anInt3271++;
										if (local675 == Static173.aLong203) {
											Static74.aByte3 = local1777;
										}
									}
									Static173.anInt3465 = Static98.anInt2085;
									Static196.anInt3834 = -1;
									return true;
								} else if (Static196.anInt3834 == 203) {
									Static98.aShort23 = (short) Static10.aClass5_Sub6_Sub1_1.method3054();
									if (Static98.aShort23 <= 0) {
										Static98.aShort23 = 1;
									}
									Static200.aShort45 = (short) Static10.aClass5_Sub6_Sub1_1.method3054();
									if (Static200.aShort45 <= 0) {
										Static200.aShort45 = 32767;
									} else if (Static98.aShort22 > Static200.aShort45) {
										Static200.aShort45 = Static98.aShort22;
									}
									Static98.aShort22 = (short) Static10.aClass5_Sub6_Sub1_1.method3054();
									if (Static98.aShort22 <= 0) {
										Static98.aShort22 = 1;
									}
									Static77.aShort40 = (short) Static10.aClass5_Sub6_Sub1_1.method3043();
									Static196.anInt3834 = -1;
									if (Static77.aShort40 <= 0) {
										Static77.aShort40 = 32767;
									} else if (Static98.aShort23 > Static77.aShort40) {
										Static77.aShort40 = Static98.aShort23;
									}
									return true;
								} else if (Static196.anInt3834 == 90) {
									Static41.aClass20_307 = Static10.aClass5_Sub6_Sub1_1.method3027();
									Static2.method46(Static41.aClass20_307);
									Static196.anInt3834 = -1;
									return true;
								} else if (Static196.anInt3834 == 197) {
									local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
									local130 = Static10.aClass5_Sub6_Sub1_1.method3042();
									local134 = Static157.method2392(local130);
									if (local134 != null && local134.anInt2474 == 0) {
										if (local134.anInt2517 - local134.anInt2471 < local126) {
											local126 = local134.anInt2517 - local134.anInt2471;
										}
										if (local126 < 0) {
											local126 = 0;
										}
										if (local126 != local134.anInt2514) {
											local134.anInt2514 = local126;
											Static184.method2779(local134);
										}
									}
									Static196.anInt3834 = -1;
									return true;
								} else {
									@Pc(2306) int local2306;
									if (Static196.anInt3834 == 150) {
										Static173.anInt3465 = Static98.anInt2085;
										local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
										if (local675 == 0L) {
											Static196.anInt3834 = -1;
											Static129.aClass5_Sub19Array1 = null;
											Static29.aClass20_219 = null;
											Static38.aClass20_281 = null;
											Static118.anInt3271 = 0;
											return true;
										}
										local683 = Static10.aClass5_Sub6_Sub1_1.method3069();
										Static38.aClass20_281 = Static160.method2438(local683);
										Static29.aClass20_219 = Static160.method2438(local675);
										Static196.aByte13 = Static10.aClass5_Sub6_Sub1_1.method3053();
										local265 = Static10.aClass5_Sub6_Sub1_1.method3062();
										if (local265 == 255) {
											Static196.anInt3834 = -1;
											return true;
										}
										Static118.anInt3271 = local265;
										@Pc(2225) Class5_Sub19[] local2225 = new Class5_Sub19[100];
										for (local384 = 0; local384 < Static118.anInt3271; local384++) {
											local2225[local384] = new Class5_Sub19();
											local2225[local384].aLong253 = Static10.aClass5_Sub6_Sub1_1.method3069();
											local2225[local384].aClass20_903 = Static160.method2438(local2225[local384].aLong253);
											local2225[local384].anInt2436 = Static10.aClass5_Sub6_Sub1_1.method3077();
											local2225[local384].aByte5 = Static10.aClass5_Sub6_Sub1_1.method3053();
											local2225[local384].aClass20_901 = Static10.aClass5_Sub6_Sub1_1.method3027();
											if (Static173.aLong203 == local2225[local384].aLong253) {
												Static74.aByte3 = local2225[local384].aByte5;
											}
										}
										local709 = Static118.anInt3271;
										while (local709 > 0) {
											local709--;
											@Pc(2304) boolean local2304 = true;
											for (local2306 = 0; local2306 < local709; local2306++) {
												if (local2225[local2306].aClass20_903.method562(local2225[local2306 + 1].aClass20_903) > 0) {
													local2304 = false;
													@Pc(2330) Class5_Sub19 local2330 = local2225[local2306];
													local2225[local2306] = local2225[local2306 + 1];
													local2225[local2306 + 1] = local2330;
												}
											}
											if (local2304) {
												break;
											}
										}
										Static196.anInt3834 = -1;
										Static129.aClass5_Sub19Array1 = local2225;
										return true;
									} else if (Static196.anInt3834 == 75) {
										Static15.anInt314 = Static10.aClass5_Sub6_Sub1_1.method3062();
										Static178.anInt3563 = Static10.aClass5_Sub6_Sub1_1.method3062();
										Static57.anInt1304 = Static10.aClass5_Sub6_Sub1_1.method3062();
										Static196.anInt3834 = -1;
										return true;
									} else if (Static196.anInt3834 == 39) {
										Static26.aBoolean182 = false;
										for (local126 = 0; local126 < 5; local126++) {
											Static205.aBooleanArray48[local126] = false;
										}
										Static196.anInt3834 = -1;
										return true;
									} else if (Static196.anInt3834 == 221) {
										for (local126 = 0; local126 < Static6.aClass1_Sub2_Sub2Array1.length; local126++) {
											if (Static6.aClass1_Sub2_Sub2Array1[local126] != null) {
												Static6.aClass1_Sub2_Sub2Array1[local126].anInt2254 = -1;
											}
										}
										for (local130 = 0; local130 < Static61.aClass1_Sub2_Sub1Array1.length; local130++) {
											if (Static61.aClass1_Sub2_Sub1Array1[local130] != null) {
												Static61.aClass1_Sub2_Sub1Array1[local130].anInt2254 = -1;
											}
										}
										Static196.anInt3834 = -1;
										return true;
									} else {
										@Pc(2479) Class69 local2479;
										if (Static196.anInt3834 == 202) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3081();
											local239 = Static10.aClass5_Sub6_Sub1_1.method3084();
											local2479 = Static157.method2392(local239);
											Static196.anInt3834 = -1;
											local2479.anInt2519 = (local130 << 16) + local126;
											return true;
										} else if (Static196.anInt3834 == 6) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3066();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3059();
											local239 = Static10.aClass5_Sub6_Sub1_1.method3054();
											local976 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local126);
											if (local976 != null) {
												Static114.method500(local976.anInt3526 != local239, local976);
											}
											Static134.method2071(local130, local239, local126);
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 1) {
											Static211.anInt4102 = Static10.aClass5_Sub6_Sub1_1.method3062();
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 102) {
											for (local126 = 0; local126 < Static139.anIntArray309.length; local126++) {
												if (Static139.anIntArray309[local126] != Static134.anIntArray304[local126]) {
													Static139.anIntArray309[local126] = Static134.anIntArray304[local126];
													Static136.method2115(local126);
													Static100.anIntArray211[Static138.anInt3859++ & 0x1F] = local126;
												}
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 81) {
											Static50.anInt1082 = Static6.anInt155 / 8;
											for (local126 = 0; local126 < Static50.anInt1082; local126++) {
												Static168.aLongArray39[local126] = Static10.aClass5_Sub6_Sub1_1.method3069();
												Static114.aClass20Array4[local126] = Static160.method2438(Static168.aLongArray39[local126]);
											}
											Static196.anInt3834 = -1;
											Static148.anInt3054 = Static98.anInt2085;
											return true;
										} else if (Static196.anInt3834 == 33) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3062();
											if (Static10.aClass5_Sub6_Sub1_1.method3062() == 0) {
												Static175.aClass92Array1[local126] = new Class92();
											} else {
												Static10.aClass5_Sub6_Sub1_1.anInt4050--;
												Static175.aClass92Array1[local126] = new Class92(Static10.aClass5_Sub6_Sub1_1);
											}
											Static196.anInt3834 = -1;
											Static82.anInt1815 = Static98.anInt2085;
											return true;
										} else if (Static196.anInt3834 == 104) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
											if (local126 < -70000) {
												local130 += 32768;
											}
											if (local126 < 0) {
												local134 = null;
											} else {
												local134 = Static157.method2392(local126);
											}
											if (local134 != null) {
												for (local243 = 0; local243 < local134.anIntArray277.length; local243++) {
													local134.anIntArray277[local243] = 0;
													local134.anIntArray286[local243] = 0;
												}
											}
											Static179.method2702(local130);
											local243 = Static10.aClass5_Sub6_Sub1_1.method3077();
											for (local265 = 0; local265 < local243; local265++) {
												local393 = Static10.aClass5_Sub6_Sub1_1.method3043();
												local384 = Static10.aClass5_Sub6_Sub1_1.method3062();
												if (local384 == 255) {
													local384 = Static10.aClass5_Sub6_Sub1_1.method3073();
												}
												if (local134 != null && local134.anIntArray277.length > local265) {
													local134.anIntArray277[local265] = local393;
													local134.anIntArray286[local265] = local384;
												}
												Static8.method192(local265, local384, local393 - 1, local130);
											}
											if (local134 != null) {
												Static184.method2779(local134);
											}
											Static31.method510();
											Static159.anIntArray348[Static121.anInt2574++ & 0x1F] = local130 & 0x7FFF;
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 148) {
											if (Static130.anInt2715 != -1) {
												Static125.method1962(Static130.anInt2715, 0);
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 67) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3043();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3042();
											local134 = Static157.method2392(local130);
											if (local126 == 65535) {
												local126 = -1;
											}
											if (local134.anInt2532 != 1 || local126 != local134.anInt2520) {
												local134.anInt2520 = local126;
												local134.anInt2532 = 1;
												Static184.method2779(local134);
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 19) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3066();
											@Pc(2909) boolean local2909 = Static10.aClass5_Sub6_Sub1_1.method3062() == 1;
											local134 = Static157.method2392(local126);
											if (local134.aBoolean114 != local2909) {
												local134.aBoolean114 = local2909;
												Static184.method2779(local134);
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 92) {
											local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
											local239 = Static10.aClass5_Sub6_Sub1_1.method3077();
											@Pc(2951) Class20 local2951 = Static57.method995(local239).method1933(Static10.aClass5_Sub6_Sub1_1);
											Static177.method2680(19, local239, local2951, null, Static160.method2438(local675).method565());
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 174) {
											Static31.method510();
											Static75.anInt1622 = Static10.aClass5_Sub6_Sub1_1.method3075();
											Static173.anInt3462 = Static98.anInt2085;
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 222) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3077();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3059();
											if (local130 == 1) {
												Static4.method117();
												for (local239 = 0; local239 < 4; local239++) {
													Static9.aClass76Array1[local239].method2223();
												}
												System.gc();
											} else if (local130 == 2) {
												Static128.method1995();
												System.gc();
												Static208.method3109(25);
											}
											Static130.anInt2715 = local126;
											Static13.method2932(local126);
											Static180.method2725();
											Static68.method1119(Static130.anInt2715);
											for (local239 = 0; local239 < 100; local239++) {
												Static185.aBooleanArray43[local239] = true;
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 107) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3062();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3062();
											local239 = Static10.aClass5_Sub6_Sub1_1.method3062();
											local243 = Static10.aClass5_Sub6_Sub1_1.method3062();
											local265 = Static10.aClass5_Sub6_Sub1_1.method3077();
											Static205.aBooleanArray48[local126] = true;
											Static151.anIntArray333[local126] = local130;
											Static153.anIntArray340[local126] = local239;
											Static150.anIntArray330[local126] = local243;
											Static70.anIntArray140[local126] = local265;
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 50) {
											Static93.method2409();
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 182) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3062();
											local130 = local126 >> 6;
											@Pc(3130) Class14 local3130 = new Class14();
											local3130.anInt394 = local126 & 0x3F;
											local3130.anInt396 = Static10.aClass5_Sub6_Sub1_1.method3062();
											if (local3130.anInt396 >= 0 && local3130.anInt396 < Static10.aClass5_Sub2_Sub10Array1.length) {
												if (local3130.anInt394 == 1 || local3130.anInt394 == 10) {
													local3130.anInt399 = Static10.aClass5_Sub6_Sub1_1.method3077();
													Static10.aClass5_Sub6_Sub1_1.anInt4050 += 3;
												} else if (local3130.anInt394 >= 2 && local3130.anInt394 <= 6) {
													if (local3130.anInt394 == 2) {
														local3130.anInt400 = 64;
														local3130.anInt397 = 64;
													}
													if (local3130.anInt394 == 3) {
														local3130.anInt400 = 0;
														local3130.anInt397 = 64;
													}
													if (local3130.anInt394 == 4) {
														local3130.anInt397 = 64;
														local3130.anInt400 = 128;
													}
													if (local3130.anInt394 == 5) {
														local3130.anInt400 = 64;
														local3130.anInt397 = 0;
													}
													if (local3130.anInt394 == 6) {
														local3130.anInt400 = 64;
														local3130.anInt397 = 128;
													}
													local3130.anInt394 = 2;
													local3130.anInt401 = Static10.aClass5_Sub6_Sub1_1.method3077();
													local3130.anInt402 = Static10.aClass5_Sub6_Sub1_1.method3077();
													local3130.anInt395 = Static10.aClass5_Sub6_Sub1_1.method3062();
												}
												local3130.anInt403 = Static10.aClass5_Sub6_Sub1_1.method3077();
												if (local3130.anInt403 == 65535) {
													local3130.anInt403 = -1;
												}
												Static218.aClass14Array1[local130] = local3130;
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 161) {
											for (local126 = 0; local126 < Static98.anInt2094; local126++) {
												@Pc(3283) Class5_Sub2_Sub6 local3283 = Static72.method1177(local126);
												if (local3283 != null && local3283.anInt490 == 0) {
													Static134.anIntArray304[local126] = 0;
													Static139.anIntArray309[local126] = 0;
												}
											}
											Static31.method510();
											Static138.anInt3859 += 32;
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 168) {
											local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
											local130 = Static10.aClass5_Sub6_Sub1_1.method3042();
											if (local126 == 65535) {
												local126 = -1;
											}
											local239 = Static10.aClass5_Sub6_Sub1_1.method3073();
											local2479 = Static157.method2392(local239);
											@Pc(3359) Class5_Sub2_Sub11 local3359;
											if (local2479.aBoolean103) {
												local2479.anInt2545 = local130;
												local2479.anInt2537 = local126;
												local3359 = Static196.method2908(local126);
												local2479.anInt2529 = local3359.anInt2310;
												local2479.anInt2480 = local3359.anInt2332;
												local2479.anInt2472 = local3359.anInt2316;
												local2479.anInt2506 = local3359.anInt2317;
												local2479.anInt2496 = local3359.anInt2315;
												if (local2479.anInt2481 > 0) {
													local2479.anInt2496 = local2479.anInt2496 * 32 / local2479.anInt2481;
												} else if (local2479.anInt2533 > 0) {
													local2479.anInt2496 = local2479.anInt2496 * 32 / local2479.anInt2533;
												}
												local2479.anInt2531 = local3359.anInt2349;
												Static184.method2779(local2479);
											} else if (local126 == -1) {
												Static196.anInt3834 = -1;
												local2479.anInt2532 = 0;
												return true;
											} else {
												local3359 = Static196.method2908(local126);
												local2479.anInt2496 = local3359.anInt2315 * 100 / local130;
												local2479.anInt2531 = local3359.anInt2349;
												local2479.anInt2532 = 4;
												local2479.anInt2520 = local126;
												local2479.anInt2529 = local3359.anInt2310;
												Static184.method2779(local2479);
											}
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 11) {
											local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
											@Pc(3472) Class20 local3472 = Static81.method1358(Static157.method2387(Static10.aClass5_Sub6_Sub1_1).method560());
											Static189.method2824(6, local3472, Static160.method2438(local675).method565());
											Static196.anInt3834 = -1;
											return true;
										} else if (Static196.anInt3834 == 233) {
											Static210.anInt922 = Static10.aClass5_Sub6_Sub1_1.method3062();
											Static38.anInt830 = Static10.aClass5_Sub6_Sub1_1.method3074();
											Static196.anInt3834 = -1;
											return true;
										} else {
											@Pc(3513) Class69 local3513;
											if (Static196.anInt3834 == 96) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
												local3513 = Static157.method2392(local126);
												for (local239 = 0; local239 < local3513.anIntArray277.length; local239++) {
													local3513.anIntArray277[local239] = -1;
													local3513.anIntArray277[local239] = 0;
												}
												Static184.method2779(local3513);
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 230) {
												Static26.aBoolean182 = true;
												Static35.anInt759 = Static10.aClass5_Sub6_Sub1_1.method3062();
												Static128.anInt2673 = Static10.aClass5_Sub6_Sub1_1.method3062();
												Static56.anInt1166 = Static10.aClass5_Sub6_Sub1_1.method3077();
												Static113.anInt2372 = Static10.aClass5_Sub6_Sub1_1.method3062();
												Static86.anInt1894 = Static10.aClass5_Sub6_Sub1_1.method3062();
												if (Static86.anInt1894 >= 100) {
													Static4.anInt109 = Static35.anInt759 * 128 + 64;
													Static104.anInt2182 = Static128.anInt2673 * 128 + 64;
													Static146.anInt3026 = Static128.method1999(Static111.anInt2327, Static4.anInt109, Static104.anInt2182) - Static56.anInt1166;
												}
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 124) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3043();
												local130 = Static10.aClass5_Sub6_Sub1_1.method3084();
												local134 = Static157.method2392(local130);
												if (local126 == 65535) {
													local126 = -1;
												}
												if (local134.anInt2532 != 2 || local126 != local134.anInt2520) {
													local134.anInt2532 = 2;
													local134.anInt2520 = local126;
													Static184.method2779(local134);
												}
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 207) {
												Static74.method1215();
												Static196.anInt3834 = -1;
												return false;
											} else if (Static196.anInt3834 == 160) {
												Static152.aShort38 = (short) Static10.aClass5_Sub6_Sub1_1.method3077();
												if (Static152.aShort38 <= 0) {
													Static152.aShort38 = 320;
												}
												Static95.aShort19 = (short) Static10.aClass5_Sub6_Sub1_1.method3043();
												Static196.anInt3834 = -1;
												if (Static95.aShort19 <= 0) {
													Static95.aShort19 = 256;
												}
												return true;
											} else if (Static196.anInt3834 == 211) {
												Static136.method2110(Static10.aClass5_Sub6_Sub1_1);
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 250) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3042();
												local130 = Static10.aClass5_Sub6_Sub1_1.method3043();
												Static134.anIntArray304[local130] = local126;
												if (local126 != Static139.anIntArray309[local130]) {
													Static139.anIntArray309[local130] = local126;
													Static136.method2115(local130);
												}
												Static100.anIntArray211[Static138.anInt3859++ & 0x1F] = local130;
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 137) {
												Static69.anInt1507 = Static10.aClass5_Sub6_Sub1_1.method3062();
												Static196.anInt3834 = -1;
												Static148.anInt3054 = Static98.anInt2085;
												return true;
											} else if (Static196.anInt3834 == 212) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3077();
												local130 = Static10.aClass5_Sub6_Sub1_1.method3062();
												if (local126 == 65535) {
													local126 = -1;
												}
												local239 = Static10.aClass5_Sub6_Sub1_1.method3077();
												Static49.method882(local130, local239, local126);
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 122) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3066();
												Static111.aClass65_6 = Static8.aClass12_1.method294(local126);
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 82) {
												local126 = Static10.aClass5_Sub6_Sub1_1.method3054();
												Static82.method1415(local126);
												Static159.anIntArray348[Static121.anInt2574++ & 0x1F] = local126 & 0x7FFF;
												Static196.anInt3834 = -1;
												return true;
											} else if (Static196.anInt3834 == 177) {
												Static170.method2597(true);
												Static196.anInt3834 = -1;
												return true;
											} else {
												@Pc(4056) int local4056;
												@Pc(3888) Class20 local3888;
												if (Static196.anInt3834 == 191) {
													local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3077();
													local243 = Static10.aClass5_Sub6_Sub1_1.method3062();
													local1779 = true;
													if (local675 < 0L) {
														local1779 = false;
														local675 &= Long.MAX_VALUE;
													}
													local1867 = Static215.aClass20_1545;
													if (local239 > 0) {
														local1867 = Static10.aClass5_Sub6_Sub1_1.method3027();
													}
													local3888 = Static160.method2438(local675).method565();
													for (local643 = 0; local643 < Static91.anInt1957; local643++) {
														if (Static129.aLongArray29[local643] == local675) {
															if (local239 != Static142.anIntArray315[local643]) {
																Static142.anIntArray315[local643] = local239;
																if (local239 > 0) {
																	Static189.method2824(5, Static70.method1166(new Class20[] { local3888, Static56.aClass20_401 }), Static215.aClass20_1545);
																}
																if (local239 == 0) {
																	Static189.method2824(5, Static70.method1166(new Class20[] { local3888, Static75.aClass20_540 }), Static215.aClass20_1545);
																}
															}
															local3888 = null;
															Static178.aClass20Array27[local643] = local1867;
															Static24.anIntArray31[local643] = local243;
															Static209.aBooleanArray50[local643] = local1779;
															break;
														}
													}
													if (local3888 != null && Static91.anInt1957 < 200) {
														Static129.aLongArray29[Static91.anInt1957] = local675;
														Static70.aClass20Array7[Static91.anInt1957] = local3888;
														Static142.anIntArray315[Static91.anInt1957] = local239;
														Static178.aClass20Array27[Static91.anInt1957] = local1867;
														Static24.anIntArray31[Static91.anInt1957] = local243;
														Static209.aBooleanArray50[Static91.anInt1957] = local1779;
														Static91.anInt1957++;
													}
													Static148.anInt3054 = Static98.anInt2085;
													local709 = Static91.anInt1957;
													while (local709 > 0) {
														local709--;
														@Pc(4014) boolean local4014 = true;
														for (local2306 = 0; local2306 < local709; local2306++) {
															if (Static142.anIntArray315[local2306] != Static40.anInt844 && Static40.anInt844 == Static142.anIntArray315[local2306 + 1] || Static142.anIntArray315[local2306] == 0 && Static142.anIntArray315[local2306 + 1] != 0) {
																local4014 = false;
																local4056 = Static142.anIntArray315[local2306];
																Static142.anIntArray315[local2306] = Static142.anIntArray315[local2306 + 1];
																Static142.anIntArray315[local2306 + 1] = local4056;
																local1437 = Static178.aClass20Array27[local2306];
																Static178.aClass20Array27[local2306] = Static178.aClass20Array27[local2306 + 1];
																Static178.aClass20Array27[local2306 + 1] = local1437;
																local781 = Static70.aClass20Array7[local2306];
																Static70.aClass20Array7[local2306] = Static70.aClass20Array7[local2306 + 1];
																Static70.aClass20Array7[local2306 + 1] = local781;
																@Pc(4110) long local4110 = Static129.aLongArray29[local2306];
																Static129.aLongArray29[local2306] = Static129.aLongArray29[local2306 + 1];
																Static129.aLongArray29[local2306 + 1] = local4110;
																@Pc(4128) int local4128 = Static24.anIntArray31[local2306];
																Static24.anIntArray31[local2306] = Static24.anIntArray31[local2306 + 1];
																Static24.anIntArray31[local2306 + 1] = local4128;
																@Pc(4146) boolean local4146 = Static209.aBooleanArray50[local2306];
																Static209.aBooleanArray50[local2306] = Static209.aBooleanArray50[local2306 + 1];
																Static209.aBooleanArray50[local2306 + 1] = local4146;
															}
														}
														if (local4014) {
															break;
														}
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 247) {
													local1687 = Static10.aClass5_Sub6_Sub1_1.method3027();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3059();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3036();
													if (local130 >= 1 && local130 <= 8) {
														if (local1687.method551(Static168.aClass20_1240)) {
															local1687 = null;
														}
														Static146.aClass20Array25[local130 - 1] = local1687;
														aBooleanArray47[local130 - 1] = local239 == 0;
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 89) {
													local1687 = Static10.aClass5_Sub6_Sub1_1.method3027();
													if (local1687.method573(Static108.aClass20_824)) {
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local683 = local1078.method595();
														local1779 = false;
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (local683 == Static168.aLongArray39[local393]) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															Static189.method2824(4, Static133.aClass20_1010, local1078);
														}
													} else if (local1687.method573(Static97.aClass20_767)) {
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local683 = local1078.method595();
														local1779 = false;
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (local683 == Static168.aLongArray39[local393]) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															local3888 = local1687.method559(local1687.method582() - 9, local1687.method584(Static196.aClass20_1441) - -1);
															Static189.method2824(8, local3888, local1078);
														}
													} else if (local1687.method573(Static35.aClass20_264)) {
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local683 = local1078.method595();
														local1779 = false;
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (local683 == Static168.aLongArray39[local393]) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															Static189.method2824(10, Static215.aClass20_1545, local1078);
														}
													} else if (local1687.method573(Static143.aClass20_1120)) {
														local1078 = local1687.method559(local1687.method584(Static143.aClass20_1120), 0);
														Static189.method2824(11, local1078, Static215.aClass20_1545);
													} else if (local1687.method573(Static94.aClass20_745)) {
														local1078 = local1687.method559(local1687.method584(Static94.aClass20_745), 0);
														if (Static217.anInt4212 == 0) {
															Static189.method2824(12, local1078, Static215.aClass20_1545);
														}
													} else if (local1687.method573(Static212.aClass20_1522)) {
														local1078 = local1687.method559(local1687.method584(Static212.aClass20_1522), 0);
														if (Static217.anInt4212 == 0) {
															Static189.method2824(13, local1078, Static215.aClass20_1545);
														}
													} else if (local1687.method573(Static132.aClass20_1367)) {
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local683 = local1078.method595();
														local1779 = false;
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (Static168.aLongArray39[local393] == local683) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															Static189.method2824(14, Static215.aClass20_1545, local1078);
														}
													} else if (local1687.method573(Static2.aClass20_13)) {
														local1779 = false;
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local683 = local1078.method595();
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (local683 == Static168.aLongArray39[local393]) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															Static189.method2824(15, Static215.aClass20_1545, local1078);
														}
													} else if (local1687.method573(Static22.aClass20_1033)) {
														local1078 = local1687.method559(local1687.method584(Static196.aClass20_1441), 0);
														local1779 = false;
														local683 = local1078.method595();
														for (local393 = 0; local393 < Static50.anInt1082; local393++) {
															if (local683 == Static168.aLongArray39[local393]) {
																local1779 = true;
																break;
															}
														}
														if (!local1779 && Static217.anInt4212 == 0) {
															Static189.method2824(16, Static215.aClass20_1545, local1078);
														}
													} else {
														Static189.method2824(0, local1687, Static215.aClass20_1545);
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 232) {
													local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
													local683 = Static10.aClass5_Sub6_Sub1_1.method3077();
													local688 = Static10.aClass5_Sub6_Sub1_1.method3072();
													local384 = Static10.aClass5_Sub6_Sub1_1.method3062();
													@Pc(4683) boolean local4683 = false;
													@Pc(4689) long local4689 = local688 + (local683 << 32);
													local2306 = 0;
													label1400: while (true) {
														if (local2306 >= 100) {
															if (local384 <= 1) {
																if (Static127.anInt2649 == 1 || Static68.anInt1469 == 1) {
																	local4683 = true;
																} else {
																	for (local4056 = 0; local4056 < Static50.anInt1082; local4056++) {
																		if (Static168.aLongArray39[local4056] == local675) {
																			local4683 = true;
																			break label1400;
																		}
																	}
																}
															}
															break;
														}
														if (Static59.aLongArray13[local2306] == local4689) {
															local4683 = true;
															break;
														}
														local2306++;
													}
													if (!local4683 && Static217.anInt4212 == 0) {
														Static59.aLongArray13[Static94.anInt2005] = local4689;
														Static94.anInt2005 = (Static94.anInt2005 + 1) % 100;
														@Pc(4770) Class20 local4770 = Static81.method1358(Static157.method2387(Static10.aClass5_Sub6_Sub1_1).method560());
														if (local384 == 2 || local384 == 3) {
															Static189.method2824(7, local4770, Static70.method1166(new Class20[] { Static43.aClass20_331, Static160.method2438(local675).method565() }));
														} else if (local384 == 1) {
															Static189.method2824(7, local4770, Static70.method1166(new Class20[] { Static64.aClass20_480, Static160.method2438(local675).method565() }));
														} else {
															Static189.method2824(3, local4770, Static160.method2438(local675).method565());
														}
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 130) {
													local675 = Static10.aClass5_Sub6_Sub1_1.method3069();
													local683 = Static10.aClass5_Sub6_Sub1_1.method3077();
													local688 = Static10.aClass5_Sub6_Sub1_1.method3072();
													local384 = Static10.aClass5_Sub6_Sub1_1.method3062();
													local643 = Static10.aClass5_Sub6_Sub1_1.method3077();
													@Pc(4875) long local4875 = (local683 << 32) + local688;
													@Pc(4877) boolean local4877 = false;
													local4056 = 0;
													label1418: while (true) {
														if (local4056 >= 100) {
															if (local384 <= 1) {
																for (local1353 = 0; local1353 < Static50.anInt1082; local1353++) {
																	if (Static168.aLongArray39[local1353] == local675) {
																		local4877 = true;
																		break label1418;
																	}
																}
															}
															break;
														}
														if (local4875 == Static59.aLongArray13[local4056]) {
															local4877 = true;
															break;
														}
														local4056++;
													}
													if (!local4877 && Static217.anInt4212 == 0) {
														Static59.aLongArray13[Static94.anInt2005] = local4875;
														Static94.anInt2005 = (Static94.anInt2005 + 1) % 100;
														@Pc(4939) Class20 local4939 = Static57.method995(local643).method1933(Static10.aClass5_Sub6_Sub1_1);
														if (local384 == 2) {
															Static177.method2680(18, local643, local4939, null, Static70.method1166(new Class20[] { Static43.aClass20_331, Static160.method2438(local675).method565() }));
														} else if (local384 == 1) {
															Static177.method2680(18, local643, local4939, null, Static70.method1166(new Class20[] { Static64.aClass20_480, Static160.method2438(local675).method565() }));
														} else {
															Static177.method2680(18, local643, local4939, null, Static160.method2438(local675).method565());
														}
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 167) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
													@Pc(5024) Class5_Sub25 local5024 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local126);
													if (local5024 != null) {
														Static114.method500(true, local5024);
													}
													if (Static133.aClass69_12 != null) {
														Static184.method2779(Static133.aClass69_12);
														Static133.aClass69_12 = null;
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 103) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3036();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3081();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3054();
													@Pc(5060) Class1_Sub2_Sub1 local5060 = Static61.aClass1_Sub2_Sub1Array1[local239];
													if (local5060 != null) {
														Static108.method1730(local130, local5060, local126);
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 64) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3075();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3073();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3075();
													local2479 = Static157.method2392(local130);
													local2479.aByte9 = 0;
													local2479.anInt2536 = local2479.anInt2538 = local239;
													local2479.anInt2539 = local2479.anInt2522 = local126;
													local2479.aByte8 = 0;
													Static184.method2779(local2479);
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 147) {
													Static172.aShort44 = (short) Static10.aClass5_Sub6_Sub1_1.method3043();
													if (Static172.aShort44 <= 0) {
														Static172.aShort44 = 256;
													}
													Static122.aShort37 = (short) Static10.aClass5_Sub6_Sub1_1.method3054();
													if (Static122.aShort37 <= 0) {
														Static122.aShort37 = 205;
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 126) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3066();
													local3513 = Static157.method2392(local126);
													local3513.anInt2532 = 3;
													local3513.anInt2520 = Static210.aClass1_Sub2_Sub2_2.aClass56_1.method1700();
													Static184.method2779(local3513);
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 110) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3059();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3062();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3036();
													Static111.anInt2327 = local126 >> 1;
													Static210.aClass1_Sub2_Sub2_2.method1744(local130, (local126 & 0x1) == 1, local239);
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 159) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
													if (local126 < -70000) {
														local130 += 32768;
													}
													if (local126 >= 0) {
														local134 = Static157.method2392(local126);
													} else {
														local134 = null;
													}
													while (Static6.anInt155 > Static10.aClass5_Sub6_Sub1_1.anInt4050) {
														local243 = Static10.aClass5_Sub6_Sub1_1.method3033();
														local265 = Static10.aClass5_Sub6_Sub1_1.method3077();
														local393 = 0;
														if (local265 != 0) {
															local393 = Static10.aClass5_Sub6_Sub1_1.method3062();
															if (local393 == 255) {
																local393 = Static10.aClass5_Sub6_Sub1_1.method3073();
															}
														}
														if (local134 != null && local243 >= 0 && local134.anIntArray277.length > local243) {
															local134.anIntArray277[local243] = local265;
															local134.anIntArray286[local243] = local393;
														}
														Static8.method192(local243, local393, local265 - 1, local130);
													}
													if (local134 != null) {
														Static184.method2779(local134);
													}
													Static31.method510();
													Static159.anIntArray348[Static121.anInt2574++ & 0x1F] = local130 & 0x7FFF;
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 146) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3073();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3073();
													@Pc(5352) Class5_Sub25 local5352 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local126);
													local976 = (Class5_Sub25) Static75.aClass75_7.method2072((long) local130);
													if (local976 != null) {
														Static114.method500(local5352 == null || local5352.anInt3526 != local976.anInt3526, local976);
													}
													if (local5352 != null) {
														local5352.method3207();
														Static75.aClass75_7.method2069(local5352, (long) local130);
													}
													local544 = Static157.method2392(local126);
													if (local544 != null) {
														Static184.method2779(local544);
													}
													local544 = Static157.method2392(local130);
													if (local544 != null) {
														Static184.method2779(local544);
													}
													if (Static130.anInt2715 != -1) {
														Static125.method1962(Static130.anInt2715, 1);
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 118) {
													Static210.anInt922 = Static10.aClass5_Sub6_Sub1_1.method3036();
													Static38.anInt830 = Static10.aClass5_Sub6_Sub1_1.method3036();
													for (local126 = Static38.anInt830; local126 < Static38.anInt830 + 8; local126++) {
														for (local130 = Static210.anInt922; local130 < Static210.anInt922 + 8; local130++) {
															if (Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local126][local130] != null) {
																Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local126][local130] = null;
																Static88.method1474(local126, local130);
															}
														}
													}
													for (@Pc(5470) Class5_Sub23 local5470 = (Class5_Sub23) Static18.aClass91_3.method2684(); local5470 != null; local5470 = (Class5_Sub23) Static18.aClass91_3.method2678()) {
														if (Static38.anInt830 <= local5470.anInt3031 && local5470.anInt3031 < Static38.anInt830 + 8 && Static210.anInt922 <= local5470.anInt3033 && Static210.anInt922 + 8 > local5470.anInt3033 && Static111.anInt2327 == local5470.anInt3025) {
															local5470.anInt3037 = 0;
														}
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 7) {
													Static2.method45(Static6.anInt155, Static10.aClass5_Sub6_Sub1_1, Static8.aClass12_1);
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 178) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3066();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3073();
													local239 = Static10.aClass5_Sub6_Sub1_1.method3043();
													if (local239 == 65535) {
														local239 = -1;
													}
													local243 = Static10.aClass5_Sub6_Sub1_1.method3054();
													if (local243 == 65535) {
														local243 = -1;
													}
													for (local265 = local239; local265 <= local243; local265++) {
														@Pc(5579) long local5579 = ((long) local126 << 32) + (long) local265;
														@Pc(5584) Class5 local5584 = Static94.aClass75_10.method2072(local5579);
														if (local5584 != null) {
															local5584.method3207();
														}
														Static94.aClass75_10.method2069(new Class5_Sub20(local130), local5579);
													}
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 172) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3081();
													if (local126 == 65535) {
														local126 = -1;
													}
													Static5.method132(local126);
													Static196.anInt3834 = -1;
													return true;
												} else if (Static196.anInt3834 == 132) {
													local126 = Static10.aClass5_Sub6_Sub1_1.method3076();
													local130 = Static10.aClass5_Sub6_Sub1_1.method3077();
													if (local130 == 65535) {
														local130 = -1;
													}
													Static75.method1222(local126, local130);
													Static196.anInt3834 = -1;
													return true;
												} else {
													Static51.method890(null, "T1 - " + Static196.anInt3834 + "," + Static50.anInt1085 + "," + Static50.anInt1080 + " - " + Static6.anInt155);
													Static74.method1215();
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

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public static void method3015() {
		Static77.aClass8_31.method233();
		Static73.aClass84_12.method2335();
	}
}
