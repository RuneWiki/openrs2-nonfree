import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public static int anInt355;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_192 = Static75.method1216(" x");

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
	public static final boolean aBoolean25 = false;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public static int anInt362 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!rc;ILclient!ad;)Lclient!ad;")
	public static Class4 method222(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.method117(Static31.aClass4_452) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(16) int local16 = arg1.method117(Static91.aClass4_1162);
			if (local16 == -1) {
				while (true) {
					local16 = arg1.method117(Static90.aClass4_1581);
					if (local16 == -1) {
						while (true) {
							local16 = arg1.method117(Static42.aClass4_567);
							if (local16 == -1) {
								while (true) {
									local16 = arg1.method117(Static45.aClass4_587);
									if (local16 == -1) {
										while (true) {
											local16 = arg1.method117(Static75.aClass4_988);
											if (local16 == -1) {
												while (true) {
													local16 = arg1.method117(Static32.aClass4_466);
													if (local16 == -1) {
														return arg1;
													}
													@Pc(235) Class4 local235 = Static113.aClass4_1604;
													if (Static43.aClass42_5 != null) {
														local235 = Static27.method561(Static43.aClass42_5.anInt1396);
														try {
															if (Static43.aClass42_5.anObject2 != null) {
																@Pc(251) byte[] local251 = ((String) Static43.aClass42_5.anObject2).getBytes("ISO-8859-1");
																local235 = Static78.method274(0, local251.length, local251);
															}
														} catch (@Pc(260) UnsupportedEncodingException local260) {
														}
													}
													arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), local235, arg1.method137(local16 + 4) });
												}
											}
											arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), Static28.method588(Static81.method1281(4, arg0)), arg1.method137(local16 + 2) });
										}
									}
									arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), Static28.method588(Static81.method1281(3, arg0)), arg1.method137(local16 + 2) });
								}
							}
							arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), Static28.method588(Static81.method1281(2, arg0)), arg1.method137(local16 + 2) });
						}
					}
					arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), Static28.method588(Static81.method1281(1, arg0)), arg1.method137(local16 + 2) });
				}
			}
			arg1 = Static60.method1012(new Class4[] { arg1.method136(0, local16), Static28.method588(Static81.method1281(0, arg0)), arg1.method137(local16 + 2) });
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method223() {
		Static36.aBoolean70 = true;
		Static84.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method224() {
		aClass4_192 = null;
		anIntArray31 = null;
		anIntArray32 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method225() {
		for (@Pc(3) int local3 = 0; local3 < Static95.anInt2230; local3++) {
			@Pc(9) int local9 = Static12.anIntArray13[local3];
			@Pc(13) Class3_Sub1_Sub1_Sub1_Sub2 local13 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = Static32.aClass3_Sub4_Sub1_2.method446();
			if ((local17 & 0x8) != 0) {
				local17 += Static32.aClass3_Sub4_Sub1_2.method446() << 8;
			}
			Static45.method814(local9, local13, local17);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!rc;)Lclient!rc;")
	public static Class3_Sub1_Sub14 method226(@OriginalArg(1) Class3_Sub1_Sub14 arg0) {
		@Pc(11) int local11;
		if (arg0.anInt2092 < 0) {
			local11 = arg0.anInt2097 >> 16;
		} else {
			local11 = arg0.anInt2092 >> 16;
		}
		if (!Static100.method1650(local11)) {
			return null;
		} else if (arg0.anInt2099 < 0) {
			@Pc(45) Class3_Sub1_Sub14 local45 = Static104.aClass3_Sub1_Sub14ArrayArray1[local11][arg0.anInt2099 >> 15 & 0xFFFF];
			return local45.aClass3_Sub1_Sub14Array1[arg0.anInt2099 & 0x7FFF];
		} else {
			return Static104.aClass3_Sub1_Sub14ArrayArray1[local11][arg0.anInt2099 & 0xFFFF];
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lclient!jd;Lclient!qa;)V")
	public static void method227(@OriginalArg(1) Class40[] arg0, @OriginalArg(2) Class61 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static11.aByteArrayArrayArray55[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static11.aByteArrayArrayArray55[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method877(local15, local11);
						}
					}
				}
			}
		}
		Static74.anInt1767 += (int) (Math.random() * 5.0D) - 2;
		Static3.anInt2310 += (int) (Math.random() * 5.0D) - 2;
		if (Static3.anInt2310 < -16) {
			Static3.anInt2310 = -16;
		}
		if (Static3.anInt2310 > 16) {
			Static3.anInt2310 = 16;
		}
		if (Static74.anInt1767 < -8) {
			Static74.anInt1767 = -8;
		}
		if (Static74.anInt1767 > 8) {
			Static74.anInt1767 = 8;
		}
		@Pc(129) int local129;
		@Pc(131) int local131;
		@Pc(135) int local135;
		@Pc(158) int local158;
		@Pc(179) int local179;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(202) int local202;
		@Pc(208) int local208;
		@Pc(272) int local272;
		@Pc(256) int local256;
		@Pc(506) int local506;
		@Pc(545) int local545;
		@Pc(660) int local660;
		@Pc(650) int local650;
		@Pc(684) int local684;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(119) byte[][] local119 = Static18.aByteArrayArrayArray7[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local129 = local30 * 768 >> 8;
			for (local131 = 1; local131 < 103; local131++) {
				for (local135 = 1; local135 < 103; local135++) {
					local158 = Static38.anIntArrayArrayArray36[local11][local135 + 1][local131] - Static38.anIntArrayArrayArray36[local11][local135 - 1][local131];
					local179 = Static38.anIntArrayArrayArray36[local11][local135][local131 + 1] - Static38.anIntArrayArrayArray36[local11][local135][local131 - 1];
					local192 = (int) Math.sqrt((double) (local158 * local158 + local179 * local179 + 65536));
					local198 = (local158 << 8) / local192;
					local202 = 65536 / local192;
					local208 = (local179 << 8) / local192;
					local256 = (local119[local135][local131 + 1] >> 3) + (local119[local135 - 1][local131] >> 2) + (local119[local135 + 1][local131] >> 3) + (local119[local135][local131 + -1] >> 2) + (local119[local135][local131] >> 1);
					local272 = (local208 * -50 + local202 * -10 + local198 * -50) / local129 + 96;
					Static52.anIntArrayArray15[local135][local131] = local272 - local256;
				}
			}
			for (local135 = 0; local135 < 104; local135++) {
				Static30.anIntArray88[local135] = 0;
				Static51.anIntArray175[local135] = 0;
				Static36.anIntArray100[local135] = 0;
				Static21.anIntArray37[local135] = 0;
				Static100.anIntArray305[local135] = 0;
			}
			for (local158 = -5; local158 < 109; local158++) {
				for (local179 = 0; local179 < 104; local179++) {
					local192 = local158 + 5;
					@Pc(400) int local400;
					if (local192 >= 0 && local192 < 104) {
						local198 = Static92.aByteArrayArrayArray35[local11][local192][local179] & 0xFF;
						if (local198 > 0) {
							@Pc(364) Class3_Sub1_Sub11 local364 = Static30.method621(local198 - 1);
							Static30.anIntArray88[local179] += local364.anInt1865;
							Static51.anIntArray175[local179] += local364.anInt1873;
							Static36.anIntArray100[local179] += local364.anInt1871;
							Static21.anIntArray37[local179] += local364.anInt1875;
							local400 = Static100.anIntArray305[local179]++;
						}
					}
					local198 = local158 - 5;
					if (local198 >= 0 && local198 < 104) {
						local202 = Static92.aByteArrayArrayArray35[local11][local198][local179] & 0xFF;
						if (local202 > 0) {
							@Pc(433) Class3_Sub1_Sub11 local433 = Static30.method621(local202 - 1);
							Static30.anIntArray88[local179] -= local433.anInt1865;
							Static51.anIntArray175[local179] -= local433.anInt1873;
							Static36.anIntArray100[local179] -= local433.anInt1871;
							Static21.anIntArray37[local179] -= local433.anInt1875;
							local400 = Static100.anIntArray305[local179]--;
						}
					}
				}
				if (local158 >= 1 && local158 < 103) {
					local202 = 0;
					local192 = 0;
					local198 = 0;
					local272 = 0;
					local208 = 0;
					for (local256 = -5; local256 < 109; local256++) {
						local506 = local256 + 5;
						if (local506 >= 0 && local506 < 104) {
							local198 += Static51.anIntArray175[local506];
							local202 += Static36.anIntArray100[local506];
							local272 += Static100.anIntArray305[local506];
							local192 += Static30.anIntArray88[local506];
							local208 += Static21.anIntArray37[local506];
						}
						local545 = local256 - 5;
						if (local545 >= 0 && local545 < 104) {
							local198 -= Static51.anIntArray175[local545];
							local202 -= Static36.anIntArray100[local545];
							local192 -= Static30.anIntArray88[local545];
							local272 -= Static100.anIntArray305[local545];
							local208 -= Static21.anIntArray37[local545];
						}
						if (local256 >= 1 && local256 < 103 && (!Static36.aBoolean70 || (Static11.aByteArrayArrayArray55[0][local158][local256] & 0x2) != 0 || (Static11.aByteArrayArrayArray55[local11][local158][local256] & 0x10) == 0 && Static81.method1282(local158, local256, local11) == Static72.anInt1739)) {
							if (Static47.anInt1185 > local11) {
								Static47.anInt1185 = local11;
							}
							local650 = Static98.aByteArrayArrayArray42[local11][local158][local256] & 0xFF;
							local660 = Static92.aByteArrayArrayArray35[local11][local158][local256] & 0xFF;
							if (local660 > 0 || local650 > 0) {
								@Pc(676) int local676 = Static38.anIntArrayArrayArray36[local11][local158 + 1][local256 + 1];
								local684 = Static38.anIntArrayArrayArray36[local11][local158][local256];
								@Pc(690) int local690 = Static52.anIntArrayArray15[local158][local256];
								@Pc(700) int local700 = Static38.anIntArrayArrayArray36[local11][local158 + 1][local256];
								@Pc(710) int local710 = Static38.anIntArrayArrayArray36[local11][local158][local256 + 1];
								@Pc(720) int local720 = Static52.anIntArrayArray15[local158 + 1][local256 + 1];
								@Pc(728) int local728 = Static52.anIntArrayArray15[local158 + 1][local256];
								@Pc(730) int local730 = -1;
								@Pc(738) int local738 = Static52.anIntArrayArray15[local158][local256 + 1];
								@Pc(740) int local740 = -1;
								@Pc(755) int local755;
								@Pc(749) int local749;
								if (local660 > 0) {
									local749 = local198 / local272;
									local755 = local192 * 256 / local208;
									@Pc(759) int local759 = local202 / local272;
									local730 = Static91.method1407(local749, local755, local759);
									local759 += Static3.anInt2310;
									@Pc(775) int local775 = Static74.anInt1767 + local755 & 0xFF;
									if (local759 < 0) {
										local759 = 0;
									} else if (local759 > 255) {
										local759 = 255;
									}
									local740 = Static91.method1407(local749, local775, local759);
								}
								if (local11 > 0) {
									@Pc(799) boolean local799 = true;
									if (local660 == 0 && Static92.aByteArrayArrayArray36[local11][local158][local256] != 0) {
										local799 = false;
									}
									if (local650 > 0 && !Static73.method1184(local650 - 1).aBoolean157) {
										local799 = false;
									}
									if (local799 && local700 == local684 && local684 == local676 && local684 == local710) {
										Static54.anIntArrayArrayArray12[local11][local158][local256] |= 0x924;
									}
								}
								local755 = 0;
								if (local740 != -1) {
									local755 = Static99.anIntArray294[Static95.method1500(local740, 96)];
								}
								if (local650 == 0) {
									arg1.method1346(local11, local158, local256, 0, 0, -1, local684, local700, local676, local710, Static95.method1500(local730, local690), Static95.method1500(local730, local728), Static95.method1500(local730, local720), Static95.method1500(local730, local738), 0, 0, 0, 0, local755, 0);
								} else {
									local749 = Static92.aByteArrayArrayArray36[local11][local158][local256] + 1;
									@Pc(937) byte local937 = Static66.aByteArrayArrayArray25[local11][local158][local256];
									@Pc(943) Class3_Sub1_Sub13 local943 = Static73.method1184(local650 - 1);
									@Pc(946) int local946 = local943.anInt2026;
									@Pc(960) int local960;
									@Pc(958) int local958;
									@Pc(983) int local983;
									@Pc(976) int local976;
									if (local946 >= 0) {
										local958 = Static99.anInterface2_1.method960(local946);
										local960 = -1;
									} else if (local943.anInt2028 == 16711935) {
										local946 = -1;
										local958 = -2;
										local960 = -2;
									} else {
										local960 = Static91.method1407(local943.anInt2020, local943.anInt2033, local943.anInt2022);
										local976 = Static3.anInt2310 + local943.anInt2022;
										local983 = Static74.anInt1767 + local943.anInt2033 & 0xFF;
										if (local976 < 0) {
											local976 = 0;
										} else if (local976 > 255) {
											local976 = 255;
										}
										local958 = Static91.method1407(local943.anInt2020, local983, local976);
									}
									local983 = 0;
									if (local958 != -2) {
										local983 = Static99.anIntArray294[Static75.method1212(96, local958)];
									}
									if (local943.anInt2023 != -1) {
										@Pc(1034) int local1034 = local943.anInt2037 + Static3.anInt2310;
										local976 = Static74.anInt1767 + local943.anInt2030 & 0xFF;
										if (local1034 < 0) {
											local1034 = 0;
										} else if (local1034 > 255) {
											local1034 = 255;
										}
										local958 = Static91.method1407(local943.anInt2019, local976, local1034);
										local983 = Static99.anIntArray294[Static75.method1212(96, local958)];
									}
									arg1.method1346(local11, local158, local256, local749, local937, local946, local684, local700, local676, local710, Static95.method1500(local730, local690), Static95.method1500(local730, local728), Static95.method1500(local730, local720), Static95.method1500(local730, local738), Static75.method1212(local690, local960), Static75.method1212(local728, local960), Static75.method1212(local720, local960), Static75.method1212(local738, local960), local755, local983);
								}
							}
						}
					}
				}
			}
			for (local179 = 1; local179 < 103; local179++) {
				for (local192 = 1; local192 < 103; local192++) {
					arg1.method1313(local11, local192, local179, Static81.method1282(local192, local179, local11));
				}
			}
			Static92.aByteArrayArrayArray35[local11] = null;
			Static98.aByteArrayArrayArray42[local11] = null;
			Static92.aByteArrayArrayArray36[local11] = null;
			Static66.aByteArrayArrayArray25[local11] = null;
			Static18.aByteArrayArrayArray7[local11] = null;
		}
		arg1.method1321();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static11.aByteArrayArrayArray55[1][local15][local30] & 0x2) == 2) {
					arg1.method1314(local15, local30);
				}
			}
		}
		local30 = 1;
		local129 = 2;
		local131 = 4;
		for (local135 = 0; local135 < 4; local135++) {
			if (local135 > 0) {
				local30 <<= 0x3;
				local131 <<= 0x3;
				local129 <<= 0x3;
			}
			for (local158 = 0; local158 <= local135; local158++) {
				for (local179 = 0; local179 <= 104; local179++) {
					for (local192 = 0; local192 <= 104; local192++) {
						if ((local30 & Static54.anIntArrayArrayArray12[local158][local192][local179]) != 0) {
							local198 = local179;
							local202 = local179;
							while (local198 > 0 && (local30 & Static54.anIntArrayArrayArray12[local158][local192][local198 - 1]) != 0) {
								local198--;
							}
							local272 = local158;
							while (local202 < 104 && (Static54.anIntArrayArrayArray12[local158][local192][local202 + 1] & local30) != 0) {
								local202++;
							}
							label347: for (local208 = local158; local208 > 0; local208--) {
								for (local256 = local198; local256 <= local202; local256++) {
									if ((Static54.anIntArrayArrayArray12[local208 - 1][local192][local256] & local30) == 0) {
										break label347;
									}
								}
							}
							label336: while (local135 > local272) {
								for (local256 = local198; local256 <= local202; local256++) {
									if ((local30 & Static54.anIntArrayArrayArray12[local272 + 1][local192][local256]) == 0) {
										break label336;
									}
								}
								local272++;
							}
							local256 = (local272 + 1 - local208) * (local202 + 1 - local198);
							if (local256 >= 8) {
								local545 = Static38.anIntArrayArrayArray36[local272][local192][local198] - 240;
								local660 = Static38.anIntArrayArrayArray36[local208][local192][local198];
								Static84.method1334(local135, 1, local192 * 128, local192 * 128, local198 * 128, local202 * 128 + 128, local545, local660);
								for (local650 = local208; local650 <= local272; local650++) {
									for (local684 = local198; local684 <= local202; local684++) {
										Static54.anIntArrayArrayArray12[local650][local192][local684] &= ~local30;
									}
								}
							}
						}
						if ((local129 & Static54.anIntArrayArrayArray12[local158][local192][local179]) != 0) {
							for (local198 = local192; local198 > 0 && (Static54.anIntArrayArrayArray12[local158][local198 - 1][local179] & local129) != 0; local198--) {
							}
							for (local202 = local192; local202 < 104 && (local129 & Static54.anIntArrayArrayArray12[local158][local202 + 1][local179]) != 0; local202++) {
							}
							local272 = local158;
							label402: for (local208 = local158; local208 > 0; local208--) {
								for (local256 = local198; local256 <= local202; local256++) {
									if ((Static54.anIntArrayArrayArray12[local208 - 1][local256][local179] & local129) == 0) {
										break label402;
									}
								}
							}
							label391: while (local272 < local135) {
								for (local256 = local198; local256 <= local202; local256++) {
									if ((Static54.anIntArrayArrayArray12[local272 + 1][local256][local179] & local129) == 0) {
										break label391;
									}
								}
								local272++;
							}
							local256 = (local272 + 1 - local208) * ((local202 - local198) + 1);
							if (local256 >= 8) {
								local660 = Static38.anIntArrayArrayArray36[local208][local198][local179];
								local545 = Static38.anIntArrayArrayArray36[local272][local198][local179] - 240;
								Static84.method1334(local135, 2, local198 * 128, local202 * 128 + 128, local179 * 128, local179 * 128, local545, local660);
								for (local650 = local208; local650 <= local272; local650++) {
									for (local684 = local198; local684 <= local202; local684++) {
										Static54.anIntArrayArrayArray12[local650][local684][local179] &= ~local129;
									}
								}
							}
						}
						if ((Static54.anIntArrayArrayArray12[local158][local192][local179] & local131) != 0) {
							local272 = local179;
							local202 = local192;
							local198 = local192;
							while (local272 < 104 && (local131 & Static54.anIntArrayArrayArray12[local158][local192][local272 + 1]) != 0) {
								local272++;
							}
							for (local208 = local179; local208 > 0 && (local131 & Static54.anIntArrayArrayArray12[local158][local192][local208 - 1]) != 0; local208--) {
							}
							label457: while (local198 > 0) {
								for (local256 = local208; local256 <= local272; local256++) {
									if ((Static54.anIntArrayArrayArray12[local158][local198 - 1][local256] & local131) == 0) {
										break label457;
									}
								}
								local198--;
							}
							label446: while (local202 < 104) {
								for (local256 = local208; local256 <= local272; local256++) {
									if ((local131 & Static54.anIntArrayArrayArray12[local158][local202 + 1][local256]) == 0) {
										break label446;
									}
								}
								local202++;
							}
							if ((local202 + 1 - local198) * ((local272 - local208) + 1) >= 4) {
								local256 = Static38.anIntArrayArrayArray36[local158][local198][local208];
								Static84.method1334(local135, 4, local198 * 128, local202 * 128 + 128, local208 * 128, local272 * 128 + 128, local256, local256);
								for (local506 = local198; local506 <= local202; local506++) {
									for (local545 = local208; local545 <= local272; local545++) {
										Static54.anIntArrayArrayArray12[local158][local506][local545] &= ~local131;
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
