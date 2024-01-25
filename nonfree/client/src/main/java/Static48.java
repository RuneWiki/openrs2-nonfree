import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!b;")
	public static Class20 aClass20_16;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	public static final int[] anIntArray91 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_3 = new Class68(7, 5);

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt1055 = 0;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt1064 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!vo;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array2 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method905() {
		@Pc(5) Class139 local5 = Static59.aClass139_8;
		synchronized (Static59.aClass139_8) {
			Static59.aClass139_8.method3083(5);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method906() {
		@Pc(1) int local1 = Static366.anInt4870;
		@Pc(3) int[] local3 = Static3.anIntArray9;
		@Pc(11) int local11 = Static114.aBoolean164 ? local1 : local1 + Static23.anInt305;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local13 - local1]];
			}
			if (local23.anInt4349 >= 0) {
				@Pc(39) int local39 = local23.method4009();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt5774 & 0x7F) == 0 && (local23.anInt5766 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt5774 & 0x7F) == 64 && (local23.anInt5766 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class28_Sub1_Sub1_Sub2 && local23.aClass3_Sub32_3 != null && Static76.anInt1617 >= local23.aClass3_Sub32_3.anInt4602 && Static76.anInt1617 < local23.aClass3_Sub32_3.anInt4604) {
					((Class28_Sub1_Sub1_Sub2) local23).aBoolean342 = false;
				}
				local23.anInt5769 = Static55.method1005(local23.anInt5766, local23.aByte73, local23.anInt5774);
				Static202.method3149(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method909(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static366.anInt4870;
		@Pc(3) int[] local3 = Static3.anIntArray9;
		@Pc(11) int local11 = Static114.aBoolean164 ? local1 : local1 + Static23.anInt305;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local13 - local1]];
			}
			if (local23.aByte73 == arg0) {
				local23.anInt4350 = 0;
				if (local23.anInt4349 < 0) {
					local23.aBoolean339 = false;
				} else {
					@Pc(50) int local50 = local23.method4009();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt5774 & 0x7F) != 0 || (local23.anInt5766 & 0x7F) != 0) {
							local23.aBoolean339 = false;
							continue;
						}
					} else if ((local23.anInt5774 & 0x7F) != 64 || (local23.anInt5766 & 0x7F) != 64) {
						local23.aBoolean339 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt5774 >> 7;
						local97 = local23.anInt5766 >> 7;
						if (local23.anInt4349 != Static97.anIntArrayArray21[local92][local97]) {
							local23.aBoolean339 = true;
							continue;
						}
						if (Static387.anIntArrayArray59[local92][local97] > 1) {
							local122 = Static387.anIntArrayArray59[local92][local97]--;
							local23.aBoolean339 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt5774 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt5766 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt5774 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt5766 + local92 >> 7;
						if (!Static91.method2642(local158, local23.anInt4349, local151, local97, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt4349 == Static97.anIntArrayArray21[local176][local179]) {
										local122 = Static387.anIntArrayArray59[local176][local179]--;
									}
								}
							}
							local23.aBoolean339 = true;
							continue;
						}
					}
					if (local23 instanceof Class28_Sub1_Sub1_Sub2 && local23.aClass3_Sub32_3 != null && Static76.anInt1617 >= local23.aClass3_Sub32_3.anInt4602 && Static76.anInt1617 < local23.aClass3_Sub32_3.anInt4604) {
						((Class28_Sub1_Sub1_Sub2) local23).aBoolean342 = false;
					}
					local23.aBoolean339 = false;
					local23.anInt5769 = Static55.method1005(local23.anInt5766, local23.aByte73, local23.anInt5774);
					Static202.method3149(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method910() {
		for (@Pc(1) int local1 = 0; local1 < Static12.anInt161; local1++) {
			@Pc(6) int[] local6 = Static97.anIntArrayArray21[local1];
			for (@Pc(8) int local8 = 0; local8 < Static44.anInt787; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method911() {
		@Pc(1) int local1 = Static366.anInt4870;
		@Pc(3) int[] local3 = Static3.anIntArray9;
		@Pc(20) boolean local20 = Static164.aClass154_Sub1_1.anInt6056 == 1 && local1 > 200 || Static164.aClass154_Sub1_1.anInt6056 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class28_Sub1_Sub1_Sub2 local29 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local3[local22]];
			if (local29.method4028()) {
				local29.method5188();
				if (local29.aShort89 >= 0 && local29.aShort87 >= 0 && local29.aShort88 < Static12.anInt161 && local29.aShort90 < Static44.anInt787) {
					local29.aBoolean342 = local29.aBoolean340 ? local20 : false;
					if (local29 == Static226.aClass28_Sub1_Sub1_Sub2_2) {
						local29.anInt4349 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean339) {
							local75++;
						}
						if (local29.anInt4369 > Static76.anInt1617) {
							local75 += 2;
						}
						local75 += 5 - local29.method4009() << 2;
						if (Static259.anInt3007 == 0) {
							local75 += 32;
						} else {
							local75 += 128;
						}
						local75 += 256;
						local29.anInt4349 = local75 + 1;
					}
				} else {
					local29.anInt4349 = -1;
				}
			} else {
				local29.anInt4349 = -1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < Static23.anInt305; local111++) {
			@Pc(118) Class28_Sub1_Sub1_Sub1 local118 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local111]];
			if (local118.method2971() && local118.aClass61_1.method1212(Static331.aClass115_1)) {
				local118.method5188();
				if (local118.aShort89 >= 0 && local118.aShort87 >= 0 && local118.aShort88 < Static12.anInt161 && local118.aShort90 < Static44.anInt787) {
					@Pc(155) int local155 = 0;
					if (!local118.aBoolean339) {
						local155++;
					}
					if (local118.anInt4369 > Static76.anInt1617) {
						local155 += 2;
					}
					local155 += 5 - local118.method4009() << 2;
					if (Static259.anInt3007 == 0) {
						if (local118.aClass61_1.aBoolean103) {
							local155 += 64;
						} else {
							local155 += 128;
						}
					} else if (Static259.anInt3007 == 1) {
						if (local118.aClass61_1.aBoolean103) {
							local155 += 32;
						} else {
							local155 += 64;
						}
					}
					if (local118.aClass61_1.aBoolean101) {
						local155 += 1024;
					} else if (!local118.aClass61_1.aBoolean100) {
						local155 += 256;
					}
					local118.anInt4349 = local155 + 1;
				} else {
					local118.anInt4349 = -1;
				}
			} else {
				local118.anInt4349 = -1;
			}
		}
		for (local75 = 0; local75 < Static323.aClass229Array1.length; local75++) {
			@Pc(221) Class229 local221 = Static323.aClass229Array1[local75];
			if (local221 != null) {
				if (local221.anInt5877 == 1) {
					@Pc(232) Class28_Sub1_Sub1_Sub1 local232 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local221.anInt5873];
					if (local232 != null && local232.anInt4349 >= 0) {
						local232.anInt4349 += 2048;
					}
				} else if (local221.anInt5877 == 10) {
					@Pc(253) Class28_Sub1_Sub1_Sub2 local253 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local221.anInt5873];
					if (local253 != null && local253 != Static226.aClass28_Sub1_Sub1_Sub2_2 && local253.anInt4349 >= 0) {
						local253.anInt4349 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!dt;IIIIIIIII)V")
	public static void method912(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class62 local6 = arg0[local1];
			if (local6 != null && local6.anInt1506 == arg1) {
				@Pc(17) int local17 = local6.anInt1523 + arg6;
				@Pc(22) int local22 = local6.anInt1559 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt1575 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt1546;
					@Pc(45) int local45 = local22 + local6.anInt1551;
					if (local6.anInt1575 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt1575 == 0 || local6.aBoolean119 || method915(local6).anInt6291 != 0 || local6 == Static363.aClass62_19 || local6.anInt1572 == Static2.anInt67) {
					if (!method918(local6)) {
						if (local6 == Static313.aClass62_18) {
							Static51.aBoolean57 = true;
							Static311.anInt5380 = local17;
							Static316.anInt5437 = local22;
						}
						if (local6.aBoolean118 || local28 < local32 && local30 < local34) {
							if (local6.anInt1575 == 0 && local6.aBoolean125 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class3_Sub23 local151 = (Class3_Sub23) Static352.aClass138_44.method3051(); local151 != null; local151 = (Class3_Sub23) Static352.aClass138_44.method3050()) {
									if (local151.aBoolean234) {
										local151.method5700();
										local151.aClass62_11.aBoolean116 = false;
									}
								}
								if (Static352.anInt5915 == 0) {
									Static313.aClass62_18 = null;
									Static363.aClass62_19 = null;
								}
								Static43.anInt778 = 0;
								Static284.aBoolean393 = false;
								Static72.aBoolean99 = false;
								if (!Static287.aBoolean397) {
									Static213.method3315();
								}
							}
							@Pc(207) boolean local207;
							if (Static200.aClass10_1.method5242() >= local28 && Static200.aClass10_1.method5240() >= local30 && Static200.aClass10_1.method5242() < local32 && Static200.aClass10_1.method5240() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static287.aBoolean397 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static81.method1341(arg8 - local17, local6, arg9 - local22);
							}
							@Pc(235) boolean local235 = false;
							if (Static200.aClass10_1.method5243() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static46.aClass3_Sub33_1 != null && Static46.aClass3_Sub33_1.method5158() == 0 && Static46.aClass3_Sub33_1.method5156() >= local28 && Static46.aClass3_Sub33_1.method5157() >= local30 && Static46.aClass3_Sub33_1.method5156() < local32 && Static46.aClass3_Sub33_1.method5157() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray28 != null) {
								for (local278 = 0; local278 < local6.aByteArray28.length; local278++) {
									if (Static322.aClass89_25.method1847(local6.aByteArray28[local278])) {
										if (local6.anIntArray153 == null || Static76.anInt1617 >= local6.anIntArray153[local278]) {
											@Pc(310) byte local310 = local6.aByteArray29[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static322.aClass89_25.method1847(86) && !Static322.aClass89_25.method1847(82) && !Static322.aClass89_25.method1847(81)) && ((local310 & 0x2) == 0 || Static322.aClass89_25.method1847(86)) && ((local310 & 0x1) == 0 || Static322.aClass89_25.method1847(82)) && ((local310 & 0x4) == 0 || Static322.aClass89_25.method1847(81))) {
												Static274.method4277("", local278 + 1, -1, local6.anInt1500);
												local374 = local6.anIntArray148[local278];
												if (local6.anIntArray153 == null) {
													local6.anIntArray153 = new int[local6.aByteArray28.length];
												}
												if (local374 == 0) {
													local6.anIntArray153[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray153[local278] = Static76.anInt1617 + local374;
												}
											}
										}
									} else if (local6.anIntArray153 != null) {
										local6.anIntArray153[local278] = 0;
									}
								}
							}
							if (local245) {
								Static286.method5337(local6, Static46.aClass3_Sub33_1.method5157() - local22, Static46.aClass3_Sub33_1.method5156() - local17);
							}
							if (Static313.aClass62_18 != null && Static313.aClass62_18 != local6 && local207 && method915(local6).method5604()) {
								Static337.aClass62_16 = local6;
							}
							if (local6 == Static363.aClass62_19) {
								Static206.aBoolean264 = true;
								Static294.anInt5084 = local17;
								Static234.anInt4190 = local22;
							}
							if (local6.aBoolean119 || local6.anInt1572 != 0) {
								@Pc(459) Class3_Sub23 local459;
								if (local207 && Static115.anInt2219 != 0 && local6.anObjectArray22 != null) {
									local459 = new Class3_Sub23();
									local459.aBoolean234 = true;
									local459.aClass62_11 = local6;
									local459.anInt3037 = Static115.anInt2219;
									local459.anObjectArray31 = local6.anObjectArray22;
									Static352.aClass138_44.method3053(local459);
								}
								if (Static313.aClass62_18 != null || Static287.aBoolean397 || local6.anInt1572 != Static344.anInt5803 && Static43.anInt778 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt1572 != 0) {
									if (local6.anInt1572 == Static109.anInt2148 || local6.anInt1572 == Static366.anInt4868) {
										Static141.aClass62_9 = local6;
										if (Static29.aClass101_3 != null) {
											Static29.aClass101_3.method2062(Static347.aClass155_9, local6.anInt1551);
										}
										if (local6.anInt1572 == Static109.anInt2148) {
											if (!Static287.aBoolean397 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static284.method4492(arg9, arg8, Static347.aClass155_9);
												for (@Pc(542) Class12_Sub3 local542 = (Class12_Sub3) Static26.aClass22_3.method291(); local542 != null; local542 = (Class12_Sub3) Static26.aClass22_3.method292()) {
													if (arg8 >= local542.anInt2132 && arg8 < local542.anInt2136 && arg9 >= local542.anInt2134 && arg9 < local542.anInt2133) {
														Static213.method3315();
														Static358.method5346(local542.aClass28_Sub1_Sub1_1);
													}
												}
											}
											Static55.method1001(local17, local6, local22);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt1572 == Static2.anInt67) {
										if (local6.method1292(Static347.aClass155_9) == null || Static154.anInt6085 != 0 && Static154.anInt6085 != 3 || Static287.aBoolean397 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray155[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray156[local614]) {
											continue;
										}
										local278 -= local6.anInt1546 / 2;
										local614 -= local6.anInt1551 / 2;
										if (Static88.anInt1815 == 4) {
											local653 = (int) Static352.aFloat68 & 0x3FFF;
										} else {
											local653 = (int) Static352.aFloat68 + Static129.anInt2435 & 0x3FFF;
										}
										@Pc(665) int local665 = Class226.anIntArray614[local653];
										@Pc(669) int local669 = Class226.anIntArray613[local653];
										if (Static88.anInt1815 != 4) {
											local665 = local665 * (Static187.anInt3396 + 256) >> 8;
											local669 = local669 * (Static187.anInt3396 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static88.anInt1815 == 4) {
											local719 = (Static71.anInt1429 >> 7) + (local698 >> 2);
											local727 = (Static268.anInt4726 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() - 1) * 64;
											local719 = (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 - local736 >> 7) + (local698 >> 2);
											local727 = (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 - local736 >> 7) - (local708 >> 2);
										}
										if (Static68.aBoolean81 && (Static122.anInt2309 & 0x40) != 0) {
											@Pc(769) Class62 local769 = Static80.method1338(Static242.anInt4268, Static127.anInt2413);
											if (local769 == null) {
												Static203.method3169();
											} else {
												Static90.method1499(48, local6.anInt1549, local719, local727, 1L, " ->", true, Static208.aString38, false, Static158.anInt2845);
											}
											continue;
										}
										if (Static121.aClass63_2 == Static340.aClass63_3) {
											Static90.method1499(44, -1, local719, local727, 1L, "", true, Static35.aClass57_17.method1122(Static66.anInt1307), false, -1);
										}
										Static90.method1499(47, -1, local719, local727, 1L, "", true, Static32.aString10, false, -1);
										continue;
									}
									if (local6.anInt1572 == Static344.anInt5803) {
										Static16.aClass62_1 = local6;
										if (local207) {
											Static284.aBoolean393 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static46.aClass3_Sub33_1.method5156() - local17 - local6.anInt1546 / 2) * 2.0D / (double) Static42.aFloat4);
											local614 = (int) -((double) (Static46.aClass3_Sub33_1.method5157() - local22 - local6.anInt1551 / 2) * 2.0D / (double) Static42.aFloat4);
											local374 = Static325.anInt5538 + local278 + Static42.anInt542;
											local653 = Static257.anInt4618 + local614 + Static42.anInt534;
											@Pc(883) Class3_Sub7_Sub16 local883 = Static6.method92();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method5628(local888, local374, local653);
											if (local888 != null) {
												if (Static322.aClass89_25.method1847(82) && Static315.anInt5429 > 0) {
													Static203.method3172(local888[0], local888[1], local888[2]);
													continue;
												}
												Static72.aBoolean99 = true;
												Static179.anInt3178 = local888[0];
												Static238.anInt4224 = local888[1];
												Static37.anInt645 = local888[2];
											}
											Static43.anInt778 = 1;
											Static284.aBoolean392 = false;
											Static320.anInt5451 = Static200.aClass10_1.method5242();
											anInt1064 = Static200.aClass10_1.method5240();
											continue;
										}
										if (local235 && Static43.anInt778 > 0) {
											if (Static43.anInt778 == 1 && (Static320.anInt5451 != Static200.aClass10_1.method5242() || anInt1064 != Static200.aClass10_1.method5240())) {
												Static307.anInt5411 = Static325.anInt5538;
												Static205.anInt323 = Static257.anInt4618;
												Static43.anInt778 = 2;
											}
											if (Static43.anInt778 == 2) {
												Static284.aBoolean392 = true;
												Static301.method4678(Static307.anInt5411 + (int) ((double) (Static320.anInt5451 - Static200.aClass10_1.method5242()) * 2.0D / (double) Static42.aFloat5));
												Static89.method5439(Static205.anInt323 - (int) ((double) (anInt1064 - Static200.aClass10_1.method5240()) * 2.0D / (double) Static42.aFloat5));
											}
											continue;
										}
										if (Static43.anInt778 > 0 && !Static284.aBoolean392) {
											if ((Static346.anInt5849 == 1 || Static167.method2524()) && Static105.anInt2076 > 2) {
												Static130.method2061(Static320.anInt5451, anInt1064);
											} else if (Static30.method470()) {
												Static130.method2061(Static320.anInt5451, anInt1064);
											}
										}
										Static43.anInt778 = 0;
										continue;
									}
									if (local6.anInt1572 == Static142.anInt2708) {
										if (local235) {
											Static355.method5329(local6.anInt1546, Static200.aClass10_1.method5242() - local17, Static200.aClass10_1.method5240() - local22, local6.anInt1551);
										}
										continue;
									}
									if (local6.anInt1572 == Static167.anInt2909) {
										Static239.method5185(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean122 && local245) {
									local6.aBoolean122 = true;
									if (local6.anObjectArray10 != null) {
										local459 = new Class3_Sub23();
										local459.aBoolean234 = true;
										local459.aClass62_11 = local6;
										local459.anInt3034 = Static46.aClass3_Sub33_1.method5156() - local17;
										local459.anInt3037 = Static46.aClass3_Sub33_1.method5157() - local22;
										local459.anObjectArray31 = local6.anObjectArray10;
										Static352.aClass138_44.method3053(local459);
									}
								}
								if (local6.aBoolean122 && local235 && local6.anObjectArray19 != null) {
									local459 = new Class3_Sub23();
									local459.aBoolean234 = true;
									local459.aClass62_11 = local6;
									local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
									local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
									local459.anObjectArray31 = local6.anObjectArray19;
									Static352.aClass138_44.method3053(local459);
								}
								if (local6.aBoolean122 && !local235) {
									local6.aBoolean122 = false;
									if (local6.lb != null) {
										local459 = new Class3_Sub23();
										local459.aBoolean234 = true;
										local459.aClass62_11 = local6;
										local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
										local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
										local459.anObjectArray31 = local6.lb;
										Static345.aClass138_41.method3053(local459);
									}
								}
								if (local235 && local6.anObjectArray20 != null) {
									local459 = new Class3_Sub23();
									local459.aBoolean234 = true;
									local459.aClass62_11 = local6;
									local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
									local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
									local459.anObjectArray31 = local6.anObjectArray20;
									Static352.aClass138_44.method3053(local459);
								}
								if (!local6.aBoolean116 && local207) {
									local6.aBoolean116 = true;
									if (local6.anObjectArray12 != null) {
										local459 = new Class3_Sub23();
										local459.aBoolean234 = true;
										local459.aClass62_11 = local6;
										local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
										local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
										local459.anObjectArray31 = local6.anObjectArray12;
										Static352.aClass138_44.method3053(local459);
									}
								}
								if (local6.aBoolean116 && local207 && local6.anObjectArray30 != null) {
									local459 = new Class3_Sub23();
									local459.aBoolean234 = true;
									local459.aClass62_11 = local6;
									local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
									local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
									local459.anObjectArray31 = local6.anObjectArray30;
									Static352.aClass138_44.method3053(local459);
								}
								if (local6.aBoolean116 && !local207) {
									local6.aBoolean116 = false;
									if (local6.anObjectArray23 != null) {
										local459 = new Class3_Sub23();
										local459.aBoolean234 = true;
										local459.aClass62_11 = local6;
										local459.anInt3034 = Static200.aClass10_1.method5242() - local17;
										local459.anInt3037 = Static200.aClass10_1.method5240() - local22;
										local459.anObjectArray31 = local6.anObjectArray23;
										Static345.aClass138_41.method3053(local459);
									}
								}
								if (local6.anObjectArray5 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray5;
									Static255.aClass138_35.method3053(local459);
								}
								@Pc(1427) Class3_Sub23 local1427;
								if (local6.anObjectArray4 != null && Static295.anInt5095 > local6.anInt1502) {
									if (local6.anIntArray154 == null || Static295.anInt5095 - local6.anInt1502 > 32) {
										local459 = new Class3_Sub23();
										local459.aClass62_11 = local6;
										local459.anObjectArray31 = local6.anObjectArray4;
										Static352.aClass138_44.method3053(local459);
									} else {
										label659: for (local278 = local6.anInt1502; local278 < Static295.anInt5095; local278++) {
											local614 = Static38.anIntArray65[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray154.length; local374++) {
												if (local6.anIntArray154[local374] == local614) {
													local1427 = new Class3_Sub23();
													local1427.aClass62_11 = local6;
													local1427.anObjectArray31 = local6.anObjectArray4;
													Static352.aClass138_44.method3053(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt1502 = Static295.anInt5095;
								}
								if (local6.anObjectArray14 != null && Static264.anInt4696 > local6.anInt1543) {
									if (local6.anIntArray157 == null || Static264.anInt4696 - local6.anInt1543 > 32) {
										local459 = new Class3_Sub23();
										local459.aClass62_11 = local6;
										local459.anObjectArray31 = local6.anObjectArray14;
										Static352.aClass138_44.method3053(local459);
									} else {
										label635: for (local278 = local6.anInt1543; local278 < Static264.anInt4696; local278++) {
											local614 = Static328.anIntArray606[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray157.length; local374++) {
												if (local6.anIntArray157[local374] == local614) {
													local1427 = new Class3_Sub23();
													local1427.aClass62_11 = local6;
													local1427.anObjectArray31 = local6.anObjectArray14;
													Static352.aClass138_44.method3053(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt1543 = Static264.anInt4696;
								}
								if (local6.anObjectArray16 != null && Static136.anInt2615 > local6.anInt1565) {
									if (local6.anIntArray149 == null || Static136.anInt2615 - local6.anInt1565 > 32) {
										local459 = new Class3_Sub23();
										local459.aClass62_11 = local6;
										local459.anObjectArray31 = local6.anObjectArray16;
										Static352.aClass138_44.method3053(local459);
									} else {
										label611: for (local278 = local6.anInt1565; local278 < Static136.anInt2615; local278++) {
											local614 = Static322.anIntArray700[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray149.length; local374++) {
												if (local6.anIntArray149[local374] == local614) {
													local1427 = new Class3_Sub23();
													local1427.aClass62_11 = local6;
													local1427.anObjectArray31 = local6.anObjectArray16;
													Static352.aClass138_44.method3053(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt1565 = Static136.anInt2615;
								}
								if (local6.anObjectArray27 != null && Static45.anInt804 > local6.anInt1524) {
									if (local6.anIntArray150 == null || Static45.anInt804 - local6.anInt1524 > 32) {
										local459 = new Class3_Sub23();
										local459.aClass62_11 = local6;
										local459.anObjectArray31 = local6.anObjectArray27;
										Static352.aClass138_44.method3053(local459);
									} else {
										label587: for (local278 = local6.anInt1524; local278 < Static45.anInt804; local278++) {
											local614 = Static257.anIntArray511[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray150.length; local374++) {
												if (local6.anIntArray150[local374] == local614) {
													local1427 = new Class3_Sub23();
													local1427.aClass62_11 = local6;
													local1427.anObjectArray31 = local6.anObjectArray27;
													Static352.aClass138_44.method3053(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt1524 = Static45.anInt804;
								}
								if (local6.anObjectArray11 != null && Static110.anInt2156 > local6.anInt1544) {
									if (local6.anIntArray151 == null || Static110.anInt2156 - local6.anInt1544 > 32) {
										local459 = new Class3_Sub23();
										local459.aClass62_11 = local6;
										local459.anObjectArray31 = local6.anObjectArray11;
										Static352.aClass138_44.method3053(local459);
									} else {
										label563: for (local278 = local6.anInt1544; local278 < Static110.anInt2156; local278++) {
											local614 = Static47.anIntArray90[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray151.length; local374++) {
												if (local6.anIntArray151[local374] == local614) {
													local1427 = new Class3_Sub23();
													local1427.aClass62_11 = local6;
													local1427.anObjectArray31 = local6.anObjectArray11;
													Static352.aClass138_44.method3053(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt1544 = Static110.anInt2156;
								}
								if (Static65.anInt1298 > local6.anInt1525 && local6.anObjectArray18 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray18;
									Static352.aClass138_44.method3053(local459);
								}
								if (Static142.anInt2705 > local6.anInt1525 && local6.anObjectArray25 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray25;
									Static352.aClass138_44.method3053(local459);
								}
								if (Static368.anInt6172 > local6.anInt1525 && local6.anObjectArray3 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray3;
									Static352.aClass138_44.method3053(local459);
								}
								if (Static26.anInt347 > local6.anInt1525 && local6.anObjectArray28 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray28;
									Static352.aClass138_44.method3053(local459);
								}
								if (Static239.anInt5772 > local6.anInt1525 && local6.anObjectArray6 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray6;
									Static352.aClass138_44.method3053(local459);
								}
								local6.anInt1525 = Static28.anInt360;
								if (local6.anObjectArray29 != null) {
									for (local278 = 0; local278 < Static153.anInt2778; local278++) {
										@Pc(1895) Class3_Sub23 local1895 = new Class3_Sub23();
										local1895.aClass62_11 = local6;
										local1895.anInt3038 = Static251.aClass70Array1[local278].method1432();
										local1895.anInt3040 = Static251.aClass70Array1[local278].method1431();
										local1895.anObjectArray31 = local6.anObjectArray29;
										Static352.aClass138_44.method3053(local1895);
									}
								}
								if (Static188.aBoolean252 && local6.anObjectArray21 != null) {
									local459 = new Class3_Sub23();
									local459.aClass62_11 = local6;
									local459.anObjectArray31 = local6.anObjectArray21;
									Static352.aClass138_44.method3053(local459);
								}
							}
							if (local6.anInt1575 == 5 && local6.anInt1505 != -1) {
								local6.method1290(Static253.aClass218_1, Static66.aClass182_1).method2062(Static347.aClass155_9, local6.anInt1551);
							}
							Static193.method3062(local6);
							if (local6.anInt1575 == 0) {
								method912(arg0, local6.anInt1500, local28, local30, local32, local34, local17 - local6.anInt1574, local22 - local6.anInt1504, arg8, arg9);
								if (local6.aClass62Array1 != null) {
									method912(local6.aClass62Array1, local6.anInt1500, local28, local30, local32, local34, local17 - local6.anInt1574, local22 - local6.anInt1504, arg8, arg9);
								}
								@Pc(2017) Class3_Sub22 local2017 = (Class3_Sub22) Static29.aClass44_26.method942((long) local6.anInt1500);
								if (local2017 != null) {
									if (Static121.aClass63_2 == Static17.aClass63_1 && local2017.anInt3027 == 0 && !Static287.aBoolean397 && local207 && !Static75.aBoolean129) {
										Static213.method3315();
									}
									Static207.method1894(local32, arg8, local28, local22, local2017.anInt3029, local17, arg9, local34, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static193.method3062(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!dt;)Lclient!vs;")
	public static Class3_Sub42 method915(@OriginalArg(0) Class62 arg0) {
		@Pc(13) Class3_Sub42 local13 = (Class3_Sub42) Static230.aClass44_25.method942(((long) arg0.anInt1500 << 32) + (long) arg0.anInt1510);
		return local13 == null ? arg0.aClass3_Sub42_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!dt;)Z")
	public static boolean method918(@OriginalArg(0) Class62 arg0) {
		if (Static75.aBoolean129) {
			if (method915(arg0).anInt6291 != 0) {
				return false;
			}
			if (arg0.anInt1575 == 0) {
				return false;
			}
		}
		return arg0.aBoolean115;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method920() {
		Static393.anInt6481 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static23.anInt305; local3++) {
			@Pc(10) Class28_Sub1_Sub1_Sub1 local10 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local3]];
			if (local10.aBoolean339 && local10.method4013() != -1) {
				@Pc(28) int local28 = (local10.method4009() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5774 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5766 - local28 >> 7;
				@Pc(49) Class28_Sub1_Sub1 local49 = Static83.method1393(local42, local35, local10.aByte73);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt4373;
					if (local49 instanceof Class28_Sub1_Sub1_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt4350 == 0 && local49.method4013() != -1) {
						Static52.anIntArray93[Static393.anInt6481] = local54;
						Static306.anIntArray584[Static393.anInt6481] = local54;
						Static393.anInt6481++;
						local49.anInt4350++;
					}
					Static52.anIntArray93[Static393.anInt6481] = local54;
					Static306.anIntArray584[Static393.anInt6481] = local10.anInt4373 + 2048;
					Static393.anInt6481++;
					local49.anInt4350++;
				}
			}
		}
		Static173.method2676(Static393.anInt6481 - 1, Static52.anIntArray93, Static306.anIntArray584, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IJZZILjava/lang/String;IZI)V")
	public static void method921(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(33) Class3_Sub5 local33 = new Class3_Sub5(128);
		local33.method2791(10);
		local33.method2749((arg8 ? 4 : 0) | (arg4 ? 2 : 0) | (arg3 ? 1 : 0));
		local33.method2760(arg2);
		local33.method2782(local13[0]);
		local33.method2768(arg0);
		local33.method2782(local13[1]);
		local33.method2749(Static68.anInt1341);
		local33.method2791(arg5);
		local33.method2791(arg7);
		local33.method2782(local13[2]);
		local33.method2749(arg1);
		local33.method2749(arg9);
		local33.method2782(local13[3]);
		local33.method2769(Static102.aBigInteger3, Static318.aBigInteger4);
		@Pc(119) Class3_Sub5 local119 = new Class3_Sub5(350);
		local119.method2768(arg6);
		@Pc(132) int local132 = 8 - Static269.method4260(arg6) % 8;
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			local119.method2791((int) (Math.random() * 255.0D));
		}
		local119.method2770(local13);
		Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
		Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_8.anInt1930);
		Static23.aClass3_Sub5_Sub1_1.method2749(local33.anInt3121 + local119.anInt3121 + 2);
		Static23.aClass3_Sub5_Sub1_1.method2749(577);
		Static23.aClass3_Sub5_Sub1_1.method2742(local33.aByteArray42, local33.anInt3121);
		Static23.aClass3_Sub5_Sub1_1.method2742(local119.aByteArray42, local119.anInt3121);
		Static116.anInt2222 = -3;
		Static115.anInt2217 = 0;
		Static270.anInt5905 = 1;
		Static24.anInt334 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!dt;II)V")
	public static void method922(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class62 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt1575 == 0) {
					if (local13.aClass62Array1 != null) {
						method922(local13.aClass62Array1, arg1);
					}
					@Pc(37) Class3_Sub22 local37 = (Class3_Sub22) Static29.aClass44_26.method942((long) local13.anInt1500);
					if (local37 != null) {
						Static244.method3984(local37.anInt3029, arg1);
					}
				}
				@Pc(53) Class3_Sub23 local53;
				if (arg1 == 0 && local13.anObjectArray13 != null) {
					local53 = new Class3_Sub23();
					local53.anObjectArray31 = local13.anObjectArray13;
					local53.aClass62_11 = local13;
					Static124.method2006(local53);
				}
				if (arg1 == 1 && local13.anObjectArray17 != null) {
					if (local13.anInt1510 >= 0) {
						@Pc(79) Class62 local79 = Static115.method1862(local13.anInt1500);
						if (local79 == null || local79.aClass62Array1 == null || local13.anInt1510 >= local79.aClass62Array1.length || local79.aClass62Array1[local13.anInt1510] != local13) {
							continue;
						}
					}
					local53 = new Class3_Sub23();
					local53.anObjectArray31 = local13.anObjectArray17;
					local53.aClass62_11 = local13;
					Static124.method2006(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!dt;)Lclient!dt;")
	public static Class62 method923(@OriginalArg(0) Class62 arg0) {
		@Pc(4) int local4 = method915(arg0).method5607();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static115.method1862(arg0.anInt1506);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method924(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static366.anInt4870;
		@Pc(3) int[] local3 = Static3.anIntArray9;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static23.anInt305; local5++) {
			@Pc(15) Class28_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local5 - local1]];
			}
			if (local15.aByte73 == arg0 && local15.anInt4349 >= 0) {
				@Pc(35) int local35 = local15.method4009();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt5774 & 0x7F) != 0 || (local15.anInt5766 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt5774 & 0x7F) != 64 || (local15.anInt5766 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt5774 >> 7;
					local76 = local15.anInt5766 >> 7;
					if (local15.anInt4349 > Static97.anIntArrayArray21[local71][local76]) {
						Static97.anIntArrayArray21[local71][local76] = local15.anInt4349;
						Static387.anIntArrayArray59[local71][local76] = 1;
					} else if (local15.anInt4349 == Static97.anIntArrayArray21[local71][local76]) {
						local112 = Static387.anIntArrayArray59[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt5774 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt5766 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt5774 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt5766 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt4349 > Static97.anIntArrayArray21[local154][local157]) {
								Static97.anIntArrayArray21[local154][local157] = local15.anInt4349;
								Static387.anIntArrayArray59[local154][local157] = 1;
							} else if (local15.anInt4349 == Static97.anIntArrayArray21[local154][local157]) {
								local112 = Static387.anIntArrayArray59[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}
}
