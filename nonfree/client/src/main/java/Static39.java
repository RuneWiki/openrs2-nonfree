import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "[[[Lclient!dr;")
	public static Class53[][][] aClass53ArrayArrayArray3;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array2;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	private static int anInt1894 = 0;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt1897 = 0;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)I")
	public static int method1427(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V")
	public static void method1428(@OriginalArg(0) boolean arg0) {
		Static10.method281();
		if (Static73.anInt1749 != 30 && Static73.anInt1749 != 25) {
			return;
		}
		Static132.anInt2612++;
		if (Static132.anInt2612 < 50 && !arg0) {
			return;
		}
		Static132.anInt2612 = 0;
		if (!Static174.aBoolean240 && Static223.aClass5_3 != null) {
			Static209.method2982(Static376.aClass36_121);
			try {
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
				Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
			} catch (@Pc(57) IOException local57) {
				Static174.aBoolean240 = true;
			}
		}
		Static10.method281();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method1430() {
		if (Static401.anInt6859 > 1) {
			Static401.anInt6859--;
			Static41.anInt1028 = Static190.anInt3670;
		}
		if (Static134.anInt2618 > 0) {
			Static134.anInt2618--;
		}
		if (Static174.aBoolean240) {
			Static174.aBoolean240 = false;
			Static316.method4696();
			return;
		}
		if (!Static346.aBoolean427) {
			Static158.method2336();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static57.method1159(); local33++) {
		}
		if (Static73.anInt1749 != 30) {
			return;
		}
		Static92.method1507(Static358.aClass36_115.method1136(), Static116.aClass4_Sub30_Sub1_1);
		if (Static67.aClass4_Sub6_1 == null) {
			if (Static199.method2845() >= Static252.aLong54) {
				Static67.aClass4_Sub6_1 = Static201.aClass255_2.method5499(Static436.aString70);
			}
		} else if (Static67.aClass4_Sub6_1.anInt1312 != -1) {
			Static209.method2982(Static425.aClass36_130);
			Static116.aClass4_Sub30_Sub1_1.method4846(Static67.aClass4_Sub6_1.anInt1312);
			Static67.aClass4_Sub6_1 = null;
			Static252.aLong54 = Static199.method2845() + 30000L;
		}
		@Pc(95) Class4_Sub10 local95 = (Class4_Sub10) Static157.aClass258_24.method5538();
		@Pc(113) int local113;
		@Pc(138) int local138;
		@Pc(156) int local156;
		@Pc(172) boolean local172;
		@Pc(224) int local224;
		@Pc(231) int local231;
		@Pc(242) int local242;
		if (local95 != null || Static199.method2845() - 2000L > Static454.aLong224) {
			@Pc(110) boolean local110 = false;
			local113 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
			for (@Pc(120) Class4_Sub10 local120 = (Class4_Sub10) Static124.aClass258_18.method5538(); local120 != null && Static116.aClass4_Sub30_Sub1_1.anInt6244 - local113 < 240; local120 = (Class4_Sub10) Static124.aClass258_18.method5528()) {
				local120.method5854();
				local138 = local120.method1652();
				if (local138 < 0) {
					local138 = 0;
				} else if (local138 > 65534) {
					local138 = 65534;
				}
				local156 = local120.method1648();
				if (local156 < 0) {
					local156 = 0;
				} else if (local156 > 65534) {
					local156 = 65534;
				}
				local172 = false;
				if (local120.method1652() == -1 && local120.method1648() == -1) {
					local156 = -1;
					local172 = true;
					local138 = -1;
				}
				if (Static107.anInt2258 != local156 || local138 != Static418.anInt7096) {
					if (!local110) {
						Static209.method2982(Static440.aClass36_136);
						Static116.aClass4_Sub30_Sub1_1.method4871(0);
						local110 = true;
						local113 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
					}
					local224 = local156 - Static107.anInt2258;
					Static107.anInt2258 = local156;
					local231 = local138 - Static418.anInt7096;
					Static418.anInt7096 = local138;
					local242 = (int) ((local120.method1649() - Static454.aLong224) / 20L);
					if (local242 < 8 && local224 >= -32 && local224 <= 31 && local231 >= -32 && local231 <= 31) {
						local231 += 32;
						local224 += 32;
						Static116.aClass4_Sub30_Sub1_1.method4846((local242 << 12) + (local224 << 6) + local231);
					} else if (local242 < 32 && local224 >= -128 && local224 <= 127 && local231 >= -128 && local231 <= 127) {
						Static116.aClass4_Sub30_Sub1_1.method4871(local242 + 128);
						local231 += 128;
						local224 += 128;
						Static116.aClass4_Sub30_Sub1_1.method4846((local224 << 8) + local231);
					} else if (local242 < 32) {
						Static116.aClass4_Sub30_Sub1_1.method4871(local242 + 192);
						if (local172) {
							Static116.aClass4_Sub30_Sub1_1.method4861(Integer.MIN_VALUE);
						} else {
							Static116.aClass4_Sub30_Sub1_1.method4861(local156 | local138 << 16);
						}
					} else {
						Static116.aClass4_Sub30_Sub1_1.method4846(local242 + 57344);
						if (local172) {
							Static116.aClass4_Sub30_Sub1_1.method4861(Integer.MIN_VALUE);
						} else {
							Static116.aClass4_Sub30_Sub1_1.method4861(local138 << 16 | local156);
						}
					}
					Static454.aLong224 = local120.method1649();
				}
			}
			if (local110) {
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local113);
			}
		}
		@Pc(416) int local416;
		@Pc(458) int local458;
		if (local95 != null) {
			@Pc(402) long local402 = (local95.method1649() - Static301.aLong158) / 50L;
			Static301.aLong158 = local95.method1649();
			if (local402 > 32767L) {
				local402 = 32767L;
			}
			local416 = local95.method1652();
			if (local416 < 0) {
				local416 = 0;
			} else if (local416 > 65535) {
				local416 = 65535;
			}
			local138 = local95.method1648();
			if (local138 < 0) {
				local138 = 0;
			} else if (local138 > 65535) {
				local138 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (local95.method1653() == 2) {
				local446 = 1;
			}
			local458 = (int) local402;
			Static209.method2982(Static197.aClass36_117);
			Static116.aClass4_Sub30_Sub1_1.method4846(local458 | local446 << 15);
			Static116.aClass4_Sub30_Sub1_1.method4878(local416 << 16 | local138);
		}
		@Pc(490) int local490;
		if (Static83.anInt1892 > 0) {
			local490 = 0;
			for (local113 = 0; local113 < Static83.anInt1892; local113++) {
				if (Static344.aClass150Array1[local113].method3232()) {
					local490++;
				}
			}
			if (local490 > 0) {
				Static209.method2982(Static281.aClass36_89);
				if (local490 > 75) {
					local490 = 75;
				}
				Static116.aClass4_Sub30_Sub1_1.method4871(local490 * 3);
				for (local416 = 0; local416 < Static83.anInt1892; local416++) {
					@Pc(533) Class150 local533 = Static344.aClass150Array1[local416];
					if (local533.method3232()) {
						@Pc(545) long local545 = (local533.method3233() - Static368.aLong191) / 50L;
						Static368.aLong191 = local533.method3233();
						if (local545 > 65535L) {
							local545 = 65535L;
						}
						Static116.aClass4_Sub30_Sub1_1.method4871(local533.method3231());
						Static116.aClass4_Sub30_Sub1_1.method4846((int) local545);
					}
				}
			}
		}
		if (Static257.anInt4640 > 0) {
			Static257.anInt4640--;
		}
		if (Static280.aBoolean347 && Static257.anInt4640 <= 0) {
			Static257.anInt4640 = 20;
			Static280.aBoolean347 = false;
			Static209.method2982(Static94.aClass36_48);
			Static116.aClass4_Sub30_Sub1_1.method4883((int) Static416.aFloat208 >> 3);
			Static116.aClass4_Sub30_Sub1_1.method4846((int) Static146.aFloat82 >> 3);
		}
		if (Static165.aBoolean224 && !Static189.aBoolean272) {
			Static189.aBoolean272 = true;
			Static209.method2982(Static388.aClass36_123);
			Static116.aClass4_Sub30_Sub1_1.method4871(1);
		}
		if (!Static165.aBoolean224 && Static189.aBoolean272) {
			Static189.aBoolean272 = false;
			Static209.method2982(Static388.aClass36_123);
			Static116.aClass4_Sub30_Sub1_1.method4871(0);
		}
		if (!Static120.aBoolean189) {
			Static209.method2982(Static294.aClass36_96);
			Static116.aClass4_Sub30_Sub1_1.method4871(0);
			local490 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
			@Pc(685) Class4_Sub30 local685 = Static126.aClass67_Sub1_1.method4529();
			Static116.aClass4_Sub30_Sub1_1.method4843(local685.aByteArray79, local685.anInt6244);
			Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local490);
			Static120.aBoolean189 = true;
		}
		if (Static40.aClass53ArrayArrayArray2 != null) {
			if (Static134.anInt2621 == 2) {
				Static44.method903();
			} else if (Static134.anInt2621 == 3) {
				Static393.method5277();
			}
		}
		if (Static75.aBoolean120) {
			Static75.aBoolean120 = false;
		} else {
			Static8.aFloat8 /= 2.0F;
		}
		if (Static55.aBoolean100) {
			Static55.aBoolean100 = false;
		} else {
			Static311.aFloat155 /= 2.0F;
		}
		Static136.method1966();
		if (Static73.anInt1749 != 30) {
			return;
		}
		Static153.method2272();
		Static214.method3054();
		Static150.method2232();
		Static419.method5477();
		Static54.anInt7603++;
		if (Static54.anInt7603 > 750) {
			Static316.method4696();
			return;
		}
		Static361.method3237();
		Static415.method5438();
		Static355.method4959();
		for (local490 = Static155.aClass149_1.method3221(true); local490 != -1; local490 = Static155.aClass149_1.method3221(false)) {
			Static302.method4182(local490);
			Static278.anIntArray641[Static124.anInt2537++ & 0x1F] = local490;
		}
		@Pc(857) Class126 local857;
		for (@Pc(803) Class4_Sub1_Sub8 local803 = Static363.method5029(); local803 != null; local803 = Static363.method5029()) {
			local416 = local803.method2763();
			local138 = local803.method2767();
			if (local416 == 1) {
				Static327.anIntArray505[local138] = local803.anInt3611;
				Static111.aBoolean437 |= Static291.aBooleanArray18[local138];
				Static298.anIntArray465[Static138.anInt2666++ & 0x1F] = local138;
			} else if (local416 == 2) {
				Static78.aStringArray11[local138] = local803.aString44;
				Static1.anIntArray1[Static22.anInt6851++ & 0x1F] = local138;
			} else if (local416 == 3) {
				local857 = Static53.method1056(local138);
				if (!local803.aString44.equals(local857.aString42)) {
					local857.aString42 = local803.aString44;
					Static430.method5524(local857);
				}
			} else if (local416 == 4) {
				local857 = Static53.method1056(local138);
				local458 = local803.anInt3611;
				local224 = local803.anInt3610;
				local231 = local803.anInt3607;
				if (local458 != local857.anInt3439 || local224 != local857.anInt3428 || local857.anInt3401 != local231) {
					local857.anInt3439 = local458;
					local857.anInt3401 = local231;
					local857.anInt3428 = local224;
					Static430.method5524(local857);
				}
			} else if (local416 == 5) {
				local857 = Static53.method1056(local138);
				if (local803.anInt3611 != local857.anInt3468 || local803.anInt3611 == -1) {
					local857.anInt3414 = 1;
					local857.anInt3384 = 0;
					local857.anInt3468 = local803.anInt3611;
					local857.anInt3455 = 0;
					Static430.method5524(local857);
				}
			} else if (local416 == 6) {
				local156 = local803.anInt3611;
				local458 = local156 >> 10 & 0x1F;
				local224 = local156 >> 5 & 0x1F;
				local231 = local156 & 0x1F;
				local242 = (local231 << 3) + (local458 << 19) + (local224 << 11);
				@Pc(1251) Class126 local1251 = Static53.method1056(local138);
				if (local242 != local1251.anInt3459) {
					local1251.anInt3459 = local242;
					Static430.method5524(local1251);
				}
			} else if (local416 == 7) {
				local857 = Static53.method1056(local138);
				local172 = local803.anInt3611 == 1;
				if (local857.aBoolean252 != local172) {
					local857.aBoolean252 = local172;
					Static430.method5524(local857);
				}
			} else if (local416 == 8) {
				local857 = Static53.method1056(local138);
				if (local857.anInt3393 != local803.anInt3611 || local857.anInt3408 != local803.anInt3610 || local803.anInt3607 != local857.anInt3460) {
					local857.anInt3393 = local803.anInt3611;
					local857.anInt3460 = local803.anInt3607;
					local857.anInt3408 = local803.anInt3610;
					if (local857.anInt3395 != -1) {
						if (local857.anInt3396 > 0) {
							local857.anInt3460 = local857.anInt3460 * 32 / local857.anInt3396;
						} else if (local857.anInt3402 > 0) {
							local857.anInt3460 = local857.anInt3460 * 32 / local857.anInt3402;
						}
					}
					Static430.method5524(local857);
				}
			} else if (local416 == 9) {
				local857 = Static53.method1056(local138);
				if (local857.anInt3395 != local803.anInt3611 || local803.anInt3610 != local857.anInt3383) {
					local857.anInt3395 = local803.anInt3611;
					local857.anInt3383 = local803.anInt3610;
					Static430.method5524(local857);
				}
			} else if (local416 == 10) {
				local857 = Static53.method1056(local138);
				if (local857.anInt3403 != local803.anInt3611 || local803.anInt3610 != local857.anInt3416 || local857.anInt3420 != local803.anInt3607) {
					local857.anInt3420 = local803.anInt3607;
					local857.anInt3416 = local803.anInt3610;
					local857.anInt3403 = local803.anInt3611;
					Static430.method5524(local857);
				}
			} else if (local416 == 11) {
				local857 = Static53.method1056(local138);
				local857.aByte65 = 0;
				local857.anInt3415 = local857.anInt3429 = local803.anInt3610;
				local857.aByte66 = 0;
				local857.anInt3406 = local857.anInt3412 = local803.anInt3611;
				Static430.method5524(local857);
			} else if (local416 == 12) {
				local857 = Static53.method1056(local138);
				local458 = local803.anInt3611;
				if (local857 != null && local857.anInt3426 == 0) {
					if (local857.anInt3386 - local857.anInt3442 < local458) {
						local458 = local857.anInt3386 - local857.anInt3442;
					}
					if (local458 < 0) {
						local458 = 0;
					}
					if (local857.anInt3444 != local458) {
						local857.anInt3444 = local458;
						Static430.method5524(local857);
					}
				}
			} else if (local416 == 14) {
				local857 = Static53.method1056(local138);
				local857.anInt3394 = local803.anInt3611;
			} else if (local416 == 15) {
				Static52.anInt1390 = local803.anInt3610;
				Static454.anInt7591 = local803.anInt3611;
				Static319.aBoolean380 = true;
			} else if (local416 == 16) {
				local857 = Static53.method1056(local138);
				local857.anInt3413 = local803.anInt3611;
			}
		}
		Static4.anInt161++;
		if (Static58.anInt4348 != 0) {
			Static189.anInt3636 += 20;
			if (Static189.anInt3636 >= 400) {
				Static58.anInt4348 = 0;
			}
		}
		if (Static241.aClass126_12 != null) {
			Static260.anInt7581++;
			if (Static260.anInt7581 >= 15) {
				Static430.method5524(Static241.aClass126_12);
				Static241.aClass126_12 = null;
			}
		}
		Static218.aClass126_11 = null;
		Static41.aBoolean55 = false;
		Static124.aClass126_5 = null;
		Static343.aBoolean424 = false;
		Static253.method3465(-1, -1, null);
		Static95.method1553(-1, null, -1);
		if (!Static222.aBoolean305) {
			Static52.anInt1389 = -1;
		}
		Static15.method340();
		Static190.anInt3670++;
		if (Static348.aBoolean431) {
			Static209.method2982(Static85.aClass36_43);
			Static116.aClass4_Sub30_Sub1_1.method4861(Static388.anInt6739 | Static144.anInt2719 << 28 | Static226.anInt745 << 14);
			Static348.aBoolean431 = false;
		}
		while (true) {
			@Pc(1436) Class4_Sub40 local1436;
			@Pc(1441) Class126 local1441;
			do {
				local1436 = (Class4_Sub40) Static362.aClass258_44.method5530();
				if (local1436 == null) {
					while (true) {
						do {
							local1436 = (Class4_Sub40) Static332.aClass258_40.method5530();
							if (local1436 == null) {
								while (true) {
									do {
										local1436 = (Class4_Sub40) Static447.aClass258_49.method5530();
										if (local1436 == null) {
											if (Static124.aClass126_5 == null) {
												Static200.anInt3846 = 0;
											}
											if (Static15.aClass126_1 != null) {
												Static355.method4965();
											}
											if (Static189.anInt3643 > 0 && Static23.aClass14_1.method1510(82) && Static23.aClass14_1.method1510(81) && Static430.anInt7165 != 0) {
												local416 = Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 - Static430.anInt7165;
												if (local416 < 0) {
													local416 = 0;
												} else if (local416 > 3) {
													local416 = 3;
												}
												Static215.method5518(local416, Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0] + Static285.anInt5187, Static381.anInt6688 + Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0]);
											}
											Static217.method3090();
											for (local416 = 0; local416 < 5; local416++) {
												@Pc(1640) int local1640 = Static313.anIntArray484[local416]++;
											}
											if (Static111.aBoolean437 && Static199.method2845() - 60000L > Static256.aLong156) {
												Static130.method1932();
											}
											Static286.anInt5208++;
											if (Static286.anInt5208 > 500) {
												Static286.anInt5208 = 0;
												local138 = (int) (Math.random() * 8.0D);
												if ((local138 & 0x4) == 4) {
													Static102.anInt2155 += Static271.anInt1475;
												}
												if ((local138 & 0x1) == 1) {
													Static179.anInt3325 += Static359.anInt6423;
												}
												if ((local138 & 0x2) == 2) {
													Static397.anInt6817 += Static61.anInt1591;
												}
											}
											if (Static179.anInt3325 < -50) {
												Static359.anInt6423 = 2;
											}
											if (Static397.anInt6817 < -55) {
												Static61.anInt1591 = 2;
											}
											if (Static179.anInt3325 > 50) {
												Static359.anInt6423 = -2;
											}
											if (Static102.anInt2155 < -40) {
												Static271.anInt1475 = 1;
											}
											if (Static397.anInt6817 > 55) {
												Static61.anInt1591 = -2;
											}
											if (Static102.anInt2155 > 40) {
												Static271.anInt1475 = -1;
											}
											anInt1894++;
											if (anInt1894 > 500) {
												anInt1894 = 0;
												local138 = (int) (Math.random() * 8.0D);
												if ((local138 & 0x1) == 1) {
													Static94.anInt2046 += Static386.anInt6718;
												}
												if ((local138 & 0x2) == 2) {
													Static109.anInt6939 += Static192.anInt7599;
												}
											}
											if (Static94.anInt2046 < -60) {
												Static386.anInt6718 = 2;
											}
											if (Static109.anInt6939 < -20) {
												Static192.anInt7599 = 1;
											}
											if (Static94.anInt2046 > 60) {
												Static386.anInt6718 = -2;
											}
											Static132.anInt2612++;
											if (Static109.anInt6939 > 10) {
												Static192.anInt7599 = -1;
											}
											if (Static132.anInt2612 > 50) {
												Static209.method2982(Static376.aClass36_121);
											}
											if (Static443.aBoolean491) {
												Static200.method2882();
												Static443.aBoolean491 = false;
											}
											try {
												if (Static223.aClass5_3 != null && Static116.aClass4_Sub30_Sub1_1.anInt6244 > 0) {
													Static263.anInt4701 += Static116.aClass4_Sub30_Sub1_1.anInt6244;
													Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
													Static132.anInt2612 = 0;
													Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
													return;
												}
												return;
											} catch (@Pc(1849) IOException local1849) {
												Static316.method4696();
												return;
											}
										}
										local1441 = local1436.aClass126_16;
										if (local1441.anInt3392 < 0) {
											break;
										}
										local857 = Static53.method1056(local1441.anInt3405);
									} while (local857 == null || local857.aClass126Array3 == null || local857.aClass126Array3.length <= local1441.anInt3392 || local1441 != local857.aClass126Array3[local1441.anInt3392]);
									Static172.method2513(local1436);
								}
							}
							local1441 = local1436.aClass126_16;
							if (local1441.anInt3392 < 0) {
								break;
							}
							local857 = Static53.method1056(local1441.anInt3405);
						} while (local857 == null || local857.aClass126Array3 == null || local857.aClass126Array3.length <= local1441.anInt3392 || local1441 != local857.aClass126Array3[local1441.anInt3392]);
						Static172.method2513(local1436);
					}
				}
				local1441 = local1436.aClass126_16;
				if (local1441.anInt3392 < 0) {
					break;
				}
				local857 = Static53.method1056(local1441.anInt3405);
			} while (local857 == null || local857.aClass126Array3 == null || local857.aClass126Array3.length <= local1441.anInt3392 || local1441 != local857.aClass126Array3[local1441.anInt3392]);
			Static172.method2513(local1436);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)Lclient!wk;")
	public static Class264 method1432(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static137.aFloat153 == 3.0D) {
				return Static389.aClass264_41;
			}
			if ((double) Static137.aFloat153 == 4.0D) {
				return Static196.aClass264_22;
			}
			if ((double) Static137.aFloat153 == 6.0D) {
				return Static394.aClass264_42;
			}
			if ((double) Static137.aFloat153 >= 8.0D) {
				return Static182.aClass264_21;
			}
		} else if (arg0 == 1) {
			if ((double) Static137.aFloat153 == 3.0D) {
				return Static394.aClass264_42;
			}
			if ((double) Static137.aFloat153 == 4.0D) {
				return Static182.aClass264_21;
			}
			if ((double) Static137.aFloat153 == 6.0D) {
				return Static59.aClass264_7;
			}
			if ((double) Static137.aFloat153 >= 8.0D) {
				return Static260.aClass264_50;
			}
		} else if (arg0 == 2) {
			if ((double) Static137.aFloat153 == 3.0D) {
				return Static59.aClass264_7;
			}
			if ((double) Static137.aFloat153 == 4.0D) {
				return Static260.aClass264_50;
			}
			if ((double) Static137.aFloat153 == 6.0D) {
				return Static306.aClass264_35;
			}
			if ((double) Static137.aFloat153 >= 8.0D) {
				return Static307.aClass264_49;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method1433(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(77) int local77;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local77 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(117) int local117;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local117 = 0; local117 < arg0; local117++) {
				if (local77 <= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local117 = arg0 - 1; local117 >= 0; local117--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local156 >> 1 >= local194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(239) int local239;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local194 << 1 <= local239) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(304) int local304;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local239 >> 1 >= local304) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(353) int local353;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local304 << 1 <= local353) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(397) int local397;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local353 >> 1 >= local397) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(442) int local442;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local442 = 0; local442 < arg0; local442++) {
				if (local442 >= local397 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(488) int local488;
		for (local442 = 0; local442 < arg0; local442++) {
			for (local488 = 0; local488 < arg0; local488++) {
				if (local442 >> 1 >= local488) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(529) int local529;
		for (local488 = 0; local488 < arg0; local488++) {
			for (local529 = arg0 - 1; local529 >= 0; local529--) {
				if (local488 << 1 <= local529) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(573) int local573;
		for (local529 = arg0 - 1; local529 >= 0; local529--) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local573 >= local529 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(615) int local615;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local615 = 0; local615 < arg0; local615++) {
				if (local615 <= local573 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(660) int local660;
		for (local615 = 0; local615 < arg0; local615++) {
			for (local660 = arg0 - 1; local660 >= 0; local660--) {
				if (local615 >> 1 <= local660) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(705) int local705;
		for (local660 = arg0 - 1; local660 >= 0; local660--) {
			for (local705 = arg0 - 1; local705 >= 0; local705--) {
				if (local660 << 1 >= local705) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(750) int local750;
		for (local705 = arg0 - 1; local705 >= 0; local705--) {
			for (local750 = arg0 - 1; local750 >= 0; local750--) {
				if (local705 >> 1 <= local750) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(789) int local789;
		for (local750 = arg0 - 1; local750 >= 0; local750--) {
			for (local789 = 0; local789 < arg0; local789++) {
				if (local789 <= local750 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(827) int local827;
		for (local789 = 0; local789 < arg0; local789++) {
			for (local827 = 0; local827 < arg0; local827++) {
				if (local827 >= local789 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(868) int local868;
		for (local827 = 0; local827 < arg0; local827++) {
			for (local868 = arg0 - 1; local868 >= 0; local868--) {
				if (local827 << 1 >= local868) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(910) int local910;
		for (local868 = 0; local868 < arg0; local868++) {
			for (local910 = 0; local910 < arg0; local910++) {
				if (arg0 / 2 >= local910) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(957) int local957;
		for (local910 = 0; local910 < arg0; local910++) {
			for (local957 = 0; local957 < arg0; local957++) {
				if (local910 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1000) int local1000;
		for (local957 = 0; local957 < arg0; local957++) {
			for (local1000 = 0; local1000 < arg0; local1000++) {
				if (arg0 / 2 <= local1000) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1047) int local1047;
		for (local1000 = 0; local1000 < arg0; local1000++) {
			for (local1047 = 0; local1047 < arg0; local1047++) {
				if (local1000 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1098) int local1098;
		for (local1047 = 0; local1047 < arg0; local1047++) {
			for (local1098 = 0; local1098 < arg0; local1098++) {
				if (local1098 <= local1047 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1150) int local1150;
		for (local1098 = arg0 - 1; local1098 >= 0; local1098--) {
			for (local1150 = 0; local1150 < arg0; local1150++) {
				if (local1150 <= local1098 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1198) int local1198;
		for (local1150 = arg0 - 1; local1150 >= 0; local1150--) {
			for (local1198 = arg0 - 1; local1198 >= 0; local1198--) {
				if (local1198 <= local1150 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1246) int local1246;
		for (local1198 = 0; local1198 < arg0; local1198++) {
			for (local1246 = arg0 - 1; local1246 >= 0; local1246--) {
				if (local1246 <= local1198 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1298) int local1298;
		for (local1246 = 0; local1246 < arg0; local1246++) {
			for (local1298 = 0; local1298 < arg0; local1298++) {
				if (local1298 >= local1246 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1346) int local1346;
		for (local1298 = arg0 - 1; local1298 >= 0; local1298--) {
			for (local1346 = 0; local1346 < arg0; local1346++) {
				if (local1298 - arg0 / 2 <= local1346) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1390) int local1390;
		for (local1346 = arg0 - 1; local1346 >= 0; local1346--) {
			for (local1390 = arg0 - 1; local1390 >= 0; local1390--) {
				if (local1346 - arg0 / 2 <= local1390) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1390 = 0; local1390 < arg0; local1390++) {
			for (@Pc(1436) int local1436 = arg0 - 1; local1436 >= 0; local1436--) {
				if (local1390 - arg0 / 2 <= local1436) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
