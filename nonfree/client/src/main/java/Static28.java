import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
	public static int anInt494;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!l;")
	public static Class98 aClass98_5 = new Class98(50);

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[1000];

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!l;")
	public static Class98 aClass98_6 = new Class98(64);

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString17 = "Hidden";

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIIIII)I")
	public static int method428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(7) int local7 = arg4;
			arg4 = arg2;
			arg2 = local7;
		}
		@Pc(15) int local15 = arg0 & 0x3;
		if (local15 == 0) {
			return arg1;
		} else if (local15 == 1) {
			return 1 + 7 - arg4 - arg3;
		} else if (local15 == 2) {
			return 8 - arg2 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	public static void method430() {
		if (Static137.anInt2643 > 0) {
			Static137.anInt2643--;
		}
		if (Static222.anInt4338 > 1) {
			Static222.anInt4338--;
			Static293.anInt5839 = Static201.anInt3956;
		}
		if (Static305.aBoolean427) {
			Static305.aBoolean427 = false;
			Static280.method3547();
			return;
		}
		@Pc(32) int local32;
		for (local32 = 0; local32 < 100 && Static47.method4895(); local32++) {
		}
		if (Static10.anInt190 != 30) {
			return;
		}
		Static14.method231(Static215.aClass3_Sub26_Sub1_2);
		@Pc(54) Object local54 = Static23.aClass136_1.anObject3;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(109) int local109;
		@Pc(114) int local114;
		@Pc(191) int local191;
		@Pc(198) int local198;
		synchronized (Static23.aClass136_1.anObject3) {
			if (!Static57.aBoolean83) {
				Static23.aClass136_1.anInt4153 = 0;
			} else if (Static40.anInt6052 != 0 || Static23.aClass136_1.anInt4153 >= 40) {
				Static215.aClass3_Sub26_Sub1_2.method3958(163);
				Static215.aClass3_Sub26_Sub1_2.method3907(0);
				@Pc(88) int local88 = Static215.aClass3_Sub26_Sub1_2.anInt4615;
				local90 = 0;
				for (local92 = 0; Static23.aClass136_1.anInt4153 > local92 && Static215.aClass3_Sub26_Sub1_2.anInt4615 - local88 < 240; local92++) {
					local90++;
					local109 = Static23.aClass136_1.anIntArray460[local92];
					local114 = Static23.aClass136_1.anIntArray459[local92];
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 65534) {
						local114 = 65534;
					}
					@Pc(129) boolean local129 = false;
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 65534) {
						local109 = 65534;
					}
					if (Static23.aClass136_1.anIntArray460[local92] == -1 && Static23.aClass136_1.anIntArray459[local92] == -1) {
						local109 = -1;
						local114 = -1;
						local129 = true;
					}
					if (Static255.anInt5260 != local114 || Static178.anInt3331 != local109) {
						local191 = local114 - Static255.anInt5260;
						Static255.anInt5260 = local114;
						local198 = local109 - Static178.anInt3331;
						Static178.anInt3331 = local109;
						if (Static12.anInt233 < 8 && local191 >= -32 && local191 <= 31 && local198 >= -32 && local198 <= 31) {
							local191 += 32;
							local198 += 32;
							Static215.aClass3_Sub26_Sub1_2.method3938((local191 << 6) + (Static12.anInt233 << 12) + local198);
							Static12.anInt233 = 0;
						} else if (Static12.anInt233 < 32 && local191 >= -128 && local191 <= 127 && local198 >= -128 && local198 <= 127) {
							Static215.aClass3_Sub26_Sub1_2.method3907(Static12.anInt233 + 128);
							local191 += 128;
							local198 += 128;
							Static215.aClass3_Sub26_Sub1_2.method3938(local198 + (local191 << 8));
							Static12.anInt233 = 0;
						} else if (Static12.anInt233 < 32) {
							Static215.aClass3_Sub26_Sub1_2.method3907(Static12.anInt233 + 192);
							if (local129) {
								Static215.aClass3_Sub26_Sub1_2.method3944(Integer.MIN_VALUE);
							} else {
								Static215.aClass3_Sub26_Sub1_2.method3944(local109 << 16 | local114);
							}
							Static12.anInt233 = 0;
						} else {
							Static215.aClass3_Sub26_Sub1_2.method3938(Static12.anInt233 + 57344);
							if (local129) {
								Static215.aClass3_Sub26_Sub1_2.method3944(Integer.MIN_VALUE);
							} else {
								Static215.aClass3_Sub26_Sub1_2.method3944(local109 << 16 | local114);
							}
							Static12.anInt233 = 0;
						}
					} else if (Static12.anInt233 < 2047) {
						Static12.anInt233++;
					}
				}
				Static215.aClass3_Sub26_Sub1_2.method3936(Static215.aClass3_Sub26_Sub1_2.anInt4615 - local88);
				if (Static23.aClass136_1.anInt4153 <= local90) {
					Static23.aClass136_1.anInt4153 = 0;
				} else {
					Static23.aClass136_1.anInt4153 -= local90;
					for (local92 = 0; local92 < Static23.aClass136_1.anInt4153; local92++) {
						Static23.aClass136_1.anIntArray459[local92] = Static23.aClass136_1.anIntArray459[local92 + local90];
						Static23.aClass136_1.anIntArray460[local92] = Static23.aClass136_1.anIntArray460[local90 + local92];
					}
				}
			}
		}
		if (Static40.anInt6052 != 0) {
			@Pc(421) long local421 = (Static126.aLong103 - Static125.aLong99) / 50L;
			Static125.aLong99 = Static126.aLong103;
			if (local421 > 32767L) {
				local421 = 32767L;
			}
			local90 = Static7.anInt169;
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 65535) {
				local90 = 65535;
			}
			local92 = Static293.anInt5844;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			@Pc(463) byte local463 = 0;
			if (Static40.anInt6052 == 2) {
				local463 = 1;
			}
			local114 = (int) local421;
			Static215.aClass3_Sub26_Sub1_2.method3958(244);
			Static215.aClass3_Sub26_Sub1_2.method3938(local463 << 15 | local114);
			Static215.aClass3_Sub26_Sub1_2.method3944(local90 << 16 | local92);
		}
		if (Static4.anInt4058 > 0) {
			Static4.anInt4058--;
		}
		if (Static153.aBoolean205 && Static4.anInt4058 <= 0) {
			Static153.aBoolean205 = false;
			Static4.anInt4058 = 20;
			Static215.aClass3_Sub26_Sub1_2.method3958(101);
			Static215.aClass3_Sub26_Sub1_2.method3897((int) Static179.aFloat48);
			Static215.aClass3_Sub26_Sub1_2.method3938((int) Static84.aFloat21);
		}
		if (Static224.aBoolean432 && !Static6.aBoolean10) {
			Static6.aBoolean10 = true;
			Static215.aClass3_Sub26_Sub1_2.method3958(51);
			Static215.aClass3_Sub26_Sub1_2.method3907(1);
		}
		if (!Static224.aBoolean432 && Static6.aBoolean10) {
			Static6.aBoolean10 = false;
			Static215.aClass3_Sub26_Sub1_2.method3958(51);
			Static215.aClass3_Sub26_Sub1_2.method3907(0);
		}
		if (!Static239.aBoolean340) {
			Static215.aClass3_Sub26_Sub1_2.method3958(12);
			Static215.aClass3_Sub26_Sub1_2.method3944(Static31.method472());
			Static239.aBoolean340 = true;
		}
		if (Static87.aBoolean314) {
			Static87.aBoolean314 = false;
		} else {
			Static199.aFloat53 /= 2.0F;
		}
		if (Static165.aBoolean221) {
			Static165.aBoolean221 = false;
		} else {
			Static258.aFloat65 /= 2.0F;
		}
		Static13.method197();
		if (Static10.anInt190 != 30) {
			return;
		}
		Static315.method5007();
		Static274.method4499();
		Static29.method456();
		Static144.anInt4823++;
		if (Static144.anInt4823 > 750) {
			Static280.method3547();
			return;
		}
		Static236.method3995();
		Static296.method4814();
		Static134.method3642();
		for (local32 = Static124.method2078(true); local32 != -1; local32 = Static124.method2078(false)) {
			Static15.method3529(local32);
			Static156.anIntArray336[Static88.anInt1660++ & 0x1F] = local32;
		}
		@Pc(735) int local735;
		for (@Pc(683) Class3_Sub4_Sub7 local683 = Static95.method1412(); local683 != null; local683 = Static95.method1412()) {
			local90 = local683.method968();
			local92 = local683.method972();
			if (local90 == 1) {
				Static173.anIntArray396[local92] = local683.anInt1132;
				Static158.anIntArray341[Static177.anInt3303++ & 0x1F] = local92;
			} else if (local90 == 2) {
				Static22.aStringArray4[local92] = local683.aString46;
				Static215.anIntArray465[Static173.anInt3252++ & 0x1F] = local92;
			} else {
				@Pc(729) Class151 local729;
				if (local90 == 3) {
					local729 = Static243.method4115(local92);
					if (!local683.aString46.equals(local729.aString163)) {
						local729.aString163 = local683.aString46;
						Static134.method3639(local729);
					}
				} else if (local90 == 4) {
					local729 = Static243.method4115(local92);
					local114 = local683.anInt1132;
					local735 = local683.anInt1140;
					local191 = local683.anInt1136;
					if (local729.anInt4737 != local114 || local735 != local729.anInt4806 || local729.anInt4767 != local191) {
						local729.anInt4767 = local191;
						local729.anInt4806 = local735;
						local729.anInt4737 = local114;
						Static134.method3639(local729);
					}
				} else if (local90 == 5) {
					local729 = Static243.method4115(local92);
					if (local729.anInt4805 != local683.anInt1132 || local683.anInt1132 == -1) {
						local729.anInt4768 = 1;
						local729.anInt4765 = 0;
						local729.anInt4736 = 0;
						local729.anInt4805 = local683.anInt1132;
						Static134.method3639(local729);
					}
				} else if (local90 == 6) {
					local109 = local683.anInt1132;
					local114 = local109 >> 10 & 0x1F;
					local191 = local109 & 0x1F;
					local735 = local109 >> 5 & 0x1F;
					local198 = (local114 << 19) - (-(local735 << 11) - (local191 << 3));
					@Pc(818) Class151 local818 = Static243.method4115(local92);
					if (local818.anInt4719 != local198) {
						local818.anInt4719 = local198;
						Static134.method3639(local818);
					}
				} else if (local90 == 7) {
					local729 = Static243.method4115(local92);
					@Pc(1145) boolean local1145 = local683.anInt1132 == 1;
					if (local729.aBoolean334 != local1145) {
						local729.aBoolean334 = local1145;
						Static134.method3639(local729);
					}
				} else if (local90 == 8) {
					local729 = Static243.method4115(local92);
					if (local729.anInt4729 != local683.anInt1132 || local729.anInt4801 != local683.anInt1140 || local683.anInt1136 != local729.anInt4724) {
						local729.anInt4801 = local683.anInt1140;
						local729.anInt4724 = local683.anInt1136;
						local729.anInt4729 = local683.anInt1132;
						if (local729.anInt4786 != -1) {
							if (local729.anInt4807 > 0) {
								local729.anInt4724 = local729.anInt4724 * 32 / local729.anInt4807;
							} else if (local729.anInt4761 > 0) {
								local729.anInt4724 = local729.anInt4724 * 32 / local729.anInt4761;
							}
						}
						Static134.method3639(local729);
					}
				} else if (local90 == 9) {
					local729 = Static243.method4115(local92);
					if (local729.anInt4786 != local683.anInt1132 || local729.anInt4796 != local683.anInt1140) {
						local729.anInt4796 = local683.anInt1140;
						local729.anInt4786 = local683.anInt1132;
						Static134.method3639(local729);
					}
				} else if (local90 == 10) {
					local729 = Static243.method4115(local92);
					if (local683.anInt1132 != local729.anInt4725 || local729.anInt4732 != local683.anInt1140 || local683.anInt1136 != local729.anInt4777) {
						local729.anInt4732 = local683.anInt1140;
						local729.anInt4725 = local683.anInt1132;
						local729.anInt4777 = local683.anInt1136;
						Static134.method3639(local729);
					}
				} else if (local90 == 11) {
					local729 = Static243.method4115(local92);
					local729.aByte28 = 0;
					local729.anInt4730 = local729.anInt4753 = local683.anInt1140;
					local729.anInt4756 = local729.anInt4738 = local683.anInt1132;
					local729.aByte25 = 0;
					Static134.method3639(local729);
				} else if (local90 == 12) {
					local729 = Static243.method4115(local92);
					local114 = local683.anInt1132;
					if (local729 != null && local729.anInt4721 == 0) {
						if (local729.anInt4713 - local729.anInt4751 < local114) {
							local114 = local729.anInt4713 - local729.anInt4751;
						}
						if (local114 < 0) {
							local114 = 0;
						}
						if (local114 != local729.anInt4747) {
							local729.anInt4747 = local114;
							Static134.method3639(local729);
						}
					}
				} else if (local90 == 13) {
					local729 = Static243.method4115(local92);
					local729.anInt4770 = local683.anInt1132;
				} else if (local90 == 14) {
					local729 = Static243.method4115(local92);
					local729.anInt4772 = local683.anInt1132;
				}
			}
		}
		if (Static83.anInt1554 != 0) {
			Static57.anInt1081 += 20;
			if (Static57.anInt1081 >= 400) {
				Static83.anInt1554 = 0;
			}
		}
		Static140.anInt2709++;
		if (Static204.aClass151_11 != null) {
			Static269.anInt5496++;
			if (Static269.anInt5496 >= 15) {
				Static134.method3639(Static204.aClass151_11);
				Static204.aClass151_11 = null;
			}
		}
		@Pc(1345) Class151 local1345;
		if (Static73.aClass151_1 != null) {
			Static134.method3639(Static73.aClass151_1);
			Static100.anInt1840++;
			if (Static235.anInt4700 + 5 < Static167.anInt3153 || Static167.anInt3153 < Static235.anInt4700 - 5 || Static4.anInt4060 + 5 < Static153.anInt2892 || Static153.anInt2892 < Static4.anInt4060 - 5) {
				Static256.aBoolean366 = true;
			}
			if (Static39.anInt681 == 0) {
				if (Static256.aBoolean366 && Static100.anInt1840 >= 5) {
					if (Static73.aClass151_1 == Static215.aClass151_12 && Static222.anInt4339 != Static94.anInt1708) {
						@Pc(1339) byte local1339 = 0;
						local1345 = Static73.aClass151_1;
						if (Static219.anInt4296 == 1 && local1345.anInt4797 == 206) {
							local1339 = 1;
						}
						if (local1345.anIntArray511[Static222.anInt4339] <= 0) {
							local1339 = 0;
						}
						if (Static42.method612(local1345).method4786()) {
							local109 = Static94.anInt1708;
							local114 = Static222.anInt4339;
							local1345.anIntArray511[local114] = local1345.anIntArray511[local109];
							local1345.anIntArray515[local114] = local1345.anIntArray515[local109];
							local1345.anIntArray511[local109] = -1;
							local1345.anIntArray515[local109] = 0;
						} else if (local1339 == 1) {
							local109 = Static94.anInt1708;
							local114 = Static222.anInt4339;
							while (local114 != local109) {
								if (local109 > local114) {
									local1345.method4004(local109 - 1, local109);
									local109--;
								} else if (local109 < local114) {
									local1345.method4004(local109 + 1, local109);
									local109++;
								}
							}
						} else {
							local1345.method4004(Static222.anInt4339, Static94.anInt1708);
						}
						Static215.aClass3_Sub26_Sub1_2.method3958(44);
						Static215.aClass3_Sub26_Sub1_2.method3892(Static222.anInt4339);
						Static215.aClass3_Sub26_Sub1_2.method3949(Static73.aClass151_1.anInt4800);
						Static215.aClass3_Sub26_Sub1_2.method3892(Static94.anInt1708);
						Static215.aClass3_Sub26_Sub1_2.method3919(local1339);
					}
				} else if ((Static11.anInt5182 == 1 || Static60.method598(Static152.anInt2876 - 1)) && Static152.anInt2876 > 2) {
					Static173.method2867();
				} else if (Static152.anInt2876 > 0) {
					Static138.method2355();
				}
				Static269.anInt5496 = 10;
				Static40.anInt6052 = 0;
				Static73.aClass151_1 = null;
			}
		}
		Static131.aClass151_4 = null;
		local1345 = Static166.aClass151_5;
		Static166.aClass151_5 = null;
		Static85.anInt1596 = 0;
		Static306.aBoolean429 = false;
		@Pc(1526) Class151 local1526 = Static243.aClass151_16;
		Static243.aClass151_16 = null;
		Static112.aBoolean408 = false;
		while (Static109.method2614() && Static85.anInt1596 < 128) {
			Static307.anIntArray622[Static85.anInt1596] = Static245.anInt6028;
			Static123.anIntArray281[Static85.anInt1596] = Static75.aChar4;
			Static85.anInt1596++;
		}
		Static287.aClass151_19 = null;
		if (Static66.anInt1232 != -1) {
			Static100.method1603(Static66.anInt1232, 0, 0, Static123.anInt2333, Static253.anInt5224, 0, 0);
		}
		Static201.anInt3956++;
		if (Static287.aClass151_19 != null) {
			Static246.method4159();
		}
		while (true) {
			@Pc(1595) Class151 local1595;
			@Pc(1587) Class151 local1587;
			@Pc(1581) Class3_Sub24 local1581;
			do {
				local1581 = (Class3_Sub24) Static236.aClass56_23.method1279();
				if (local1581 == null) {
					while (true) {
						do {
							local1581 = (Class3_Sub24) Static253.aClass56_24.method1279();
							if (local1581 == null) {
								while (true) {
									do {
										local1581 = (Class3_Sub24) Static5.aClass56_1.method1279();
										if (local1581 == null) {
											if (Static287.aClass151_19 == null) {
												Static129.anInt2458 = 0;
											}
											if (Static191.aClass151_10 != null) {
												Static232.method3803();
											}
											if (Static296.anInt5879 > 0 && Static95.aBooleanArray39[82] && Static95.aBooleanArray39[81] && Static235.anInt4699 != 0) {
												local109 = Static99.anInt1826 - Static235.anInt4699;
												if (local109 < 0) {
													local109 = 0;
												} else if (local109 > 3) {
													local109 = 3;
												}
												Static268.method4448(local109, Static43.anInt798 + Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] + Static101.anInt1844);
											}
											if (Static296.anInt5879 > 0 && Static95.aBooleanArray39[82] && Static95.aBooleanArray39[81]) {
												if (Static115.anInt2150 != -1) {
													Static268.method4448(Static99.anInt1826, Static76.anInt1448 + Static43.anInt798, Static115.anInt2150 + Static101.anInt1844);
												}
												Static44.anInt829 = 0;
												Static250.anInt5136 = 0;
											} else if (Static250.anInt5136 == 2) {
												if (Static115.anInt2150 != -1) {
													Static215.aClass3_Sub26_Sub1_2.method3958(7);
													Static215.aClass3_Sub26_Sub1_2.method3938(Static101.anInt1844 + Static115.anInt2150);
													Static215.aClass3_Sub26_Sub1_2.method3949(Static63.anInt1200);
													Static215.aClass3_Sub26_Sub1_2.method3897(Static43.anInt798 + Static76.anInt1448);
													Static215.aClass3_Sub26_Sub1_2.method3897(Static296.anInt5869);
													Static54.anInt1012 = Static7.anInt169;
													Static313.anInt6126 = Static293.anInt5844;
													Static83.anInt1554 = 1;
													Static57.anInt1081 = 0;
												}
												Static250.anInt5136 = 0;
											} else if (Static44.anInt829 == 2) {
												if (Static115.anInt2150 != -1) {
													Static215.aClass3_Sub26_Sub1_2.method3958(47);
													Static215.aClass3_Sub26_Sub1_2.method3897(Static101.anInt1844 + Static115.anInt2150);
													Static215.aClass3_Sub26_Sub1_2.method3940(Static76.anInt1448 + Static43.anInt798);
													Static57.anInt1081 = 0;
													Static83.anInt1554 = 1;
													Static313.anInt6126 = Static293.anInt5844;
													Static54.anInt1012 = Static7.anInt169;
												}
												Static44.anInt829 = 0;
											} else if (Static115.anInt2150 != -1 && Static250.anInt5136 == 0 && Static44.anInt829 == 0) {
												local109 = (Static115.anInt2150 << 1) + 1 - Static136.aClass10_Sub5_Sub1_1.method4186() >> 1;
												local114 = (Static76.anInt1448 << 1) - (Static136.aClass10_Sub5_Sub1_1.method4186() - 1) >> 1;
												Static130.method2207(local114, 0, local109);
												Static313.anInt6126 = Static293.anInt5844;
												Static83.anInt1554 = 1;
												Static54.anInt1012 = Static7.anInt169;
												Static57.anInt1081 = 0;
												Static79.method1663(Static136.aClass10_Sub5_Sub1_1.anIntArray537[0], 0, 0, 0, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0], local109, 0, 0, local114);
											}
											Static115.anInt2150 = -1;
											Static254.method4300();
											if (local1345 != Static166.aClass151_5) {
												if (local1345 != null) {
													Static134.method3639(local1345);
												}
												if (Static166.aClass151_5 != null) {
													Static134.method3639(Static166.aClass151_5);
												}
											}
											if (Static243.aClass151_16 != local1526 && Static39.anInt680 == Static171.anInt3222) {
												if (local1526 != null) {
													Static134.method3639(local1526);
												}
												if (Static243.aClass151_16 != null) {
													Static134.method3639(Static243.aClass151_16);
												}
											}
											if (Static243.aClass151_16 == null) {
												if (Static171.anInt3222 > 0) {
													Static171.anInt3222--;
												}
											} else if (Static39.anInt680 > Static171.anInt3222) {
												Static171.anInt3222++;
												if (Static171.anInt3222 == Static39.anInt680) {
													Static134.method3639(Static243.aClass151_16);
												}
											}
											for (local109 = 0; local109 < 5; local109++) {
												@Pc(2057) int local2057 = Static220.anIntArray544[local109]++;
											}
											local109 = Static265.method4456();
											local114 = Static150.method2551();
											if (local109 > 15000 && local114 > 15000) {
												Static137.anInt2643 = 250;
												Static190.method3181(14500);
												Static215.aClass3_Sub26_Sub1_2.method3958(160);
											}
											if (Static120.aClass178_1 != null && Static120.aClass178_1.anInt5649 == 1) {
												if (Static120.aClass178_1.anObject6 != null) {
													Static17.method291(Static85.aString63, Static306.aBoolean428);
												}
												Static85.aString63 = null;
												Static120.aClass178_1 = null;
												Static306.aBoolean428 = false;
											}
											Static102.anInt1875++;
											Static67.anInt1247++;
											Static314.anInt6133++;
											if (Static67.anInt1247 > 500) {
												local735 = (int) (Math.random() * 8.0D);
												if ((local735 & 0x1) == 1) {
													Static50.anInt961 += Static281.anInt4631;
												}
												Static67.anInt1247 = 0;
												if ((local735 & 0x4) == 4) {
													Static221.anInt4331 += Static300.anInt5930;
												}
												if ((local735 & 0x2) == 2) {
													Static26.anInt482 += Static254.anInt5234;
												}
											}
											if (Static50.anInt961 < -50) {
												Static281.anInt4631 = 2;
											}
											if (Static102.anInt1875 > 500) {
												Static102.anInt1875 = 0;
												local735 = (int) (Math.random() * 8.0D);
												if ((local735 & 0x2) == 2) {
													Static125.anInt2421 += Static232.anInt4515;
												}
												if ((local735 & 0x1) == 1) {
													Static241.anInt4889 += Static267.anInt5440;
												}
											}
											if (Static241.anInt4889 < -60) {
												Static267.anInt5440 = 2;
											}
											if (Static221.anInt4331 < -40) {
												Static300.anInt5930 = 1;
											}
											if (Static26.anInt482 < -55) {
												Static254.anInt5234 = 2;
											}
											if (Static26.anInt482 > 55) {
												Static254.anInt5234 = -2;
											}
											if (Static125.anInt2421 < -20) {
												Static232.anInt4515 = 1;
											}
											if (Static241.anInt4889 > 60) {
												Static267.anInt5440 = -2;
											}
											if (Static125.anInt2421 > 10) {
												Static232.anInt4515 = -1;
											}
											if (Static221.anInt4331 > 40) {
												Static300.anInt5930 = -1;
											}
											if (Static50.anInt961 > 50) {
												Static281.anInt4631 = -2;
											}
											if (Static314.anInt6133 > 50) {
												Static215.aClass3_Sub26_Sub1_2.method3958(5);
											}
											if (Static270.aBoolean381) {
												Static202.method3348();
												Static270.aBoolean381 = false;
											}
											try {
												if (Static150.aClass139_3 != null && Static215.aClass3_Sub26_Sub1_2.anInt4615 > 0) {
													Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
													Static314.anInt6133 = 0;
													Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
												}
											} catch (@Pc(2314) IOException local2314) {
												Static280.method3547();
											}
											return;
										}
										local1587 = local1581.aClass151_13;
										if (local1587.anInt4776 < 0) {
											break;
										}
										local1595 = Static243.method4115(local1587.anInt4727);
									} while (local1595 == null || local1595.aClass151Array2 == null || local1587.anInt4776 >= local1595.aClass151Array2.length || local1595.aClass151Array2[local1587.anInt4776] != local1587);
									Static161.method2653(local1581);
								}
							}
							local1587 = local1581.aClass151_13;
							if (local1587.anInt4776 < 0) {
								break;
							}
							local1595 = Static243.method4115(local1587.anInt4727);
						} while (local1595 == null || local1595.aClass151Array2 == null || local1587.anInt4776 >= local1595.aClass151Array2.length || local1587 != local1595.aClass151Array2[local1587.anInt4776]);
						Static161.method2653(local1581);
					}
				}
				local1587 = local1581.aClass151_13;
				if (local1587.anInt4776 < 0) {
					break;
				}
				local1595 = Static243.method4115(local1587.anInt4727);
			} while (local1595 == null || local1595.aClass151Array2 == null || local1595.aClass151Array2.length <= local1587.anInt4776 || local1587 != local1595.aClass151Array2[local1587.anInt4776]);
			Static161.method2653(local1581);
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public static void method431() {
		Static145.aClass98_19.method2571();
		Static166.aClass98_25.method2571();
		Static280.aClass98_36.method2571();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;II[B)I")
	public static int method432(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(9) int local9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(20) char local20 = arg1.charAt(local11);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[local11 + arg2] = (byte) local20;
			} else if (local20 == '€') {
				arg3[local11 + arg2] = -128;
			} else if (local20 == '‚') {
				arg3[local11 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg3[arg2 + local11] = -125;
			} else if (local20 == '„') {
				arg3[arg2 + local11] = -124;
			} else if (local20 == '…') {
				arg3[arg2 + local11] = -123;
			} else if (local20 == '†') {
				arg3[arg2 + local11] = -122;
			} else if (local20 == '‡') {
				arg3[local11 + arg2] = -121;
			} else if (local20 == 'ˆ') {
				arg3[arg2 + local11] = -120;
			} else if (local20 == '‰') {
				arg3[local11 + arg2] = -119;
			} else if (local20 == 'Š') {
				arg3[local11 + arg2] = -118;
			} else if (local20 == '‹') {
				arg3[arg2 + local11] = -117;
			} else if (local20 == 'Œ') {
				arg3[local11 + arg2] = -116;
			} else if (local20 == 'Ž') {
				arg3[arg2 + local11] = -114;
			} else if (local20 == '‘') {
				arg3[arg2 + local11] = -111;
			} else if (local20 == '’') {
				arg3[arg2 + local11] = -110;
			} else if (local20 == '“') {
				arg3[arg2 + local11] = -109;
			} else if (local20 == '”') {
				arg3[local11 + arg2] = -108;
			} else if (local20 == '•') {
				arg3[arg2 + local11] = -107;
			} else if (local20 == '–') {
				arg3[local11 + arg2] = -106;
			} else if (local20 == '—') {
				arg3[arg2 + local11] = -105;
			} else if (local20 == '˜') {
				arg3[arg2 + local11] = -104;
			} else if (local20 == '™') {
				arg3[local11 + arg2] = -103;
			} else if (local20 == 'š') {
				arg3[local11 + arg2] = -102;
			} else if (local20 == '›') {
				arg3[arg2 + local11] = -101;
			} else if (local20 == 'œ') {
				arg3[arg2 + local11] = -100;
			} else if (local20 == 'ž') {
				arg3[arg2 + local11] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[local11 + arg2] = -97;
			} else {
				arg3[local11 + arg2] = 63;
			}
		}
		return local9;
	}
}
