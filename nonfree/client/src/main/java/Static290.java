import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public static int anInt4868;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4870;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!ip;")
	public static final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ha;IZ)Ljava/lang/String;")
	public static String method4314(@OriginalArg(0) Class6_Sub15 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3090();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt3487 += Static345.aClass183_1.method4218(arg0.anInt3487, local15, local7, 0, arg0.aByteArray51);
			return Static27.method357(local7, local15, 0);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Z")
	public static boolean method4315() throws IOException {
		if (Static103.aClass30_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static103.aClass30_1.method735();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static106.aClass186_44 == null) {
			if (Static347.aBoolean388) {
				local13--;
				Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 1);
				Static208.anInt3630++;
				Static347.aBoolean388 = false;
			}
			Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
			if (Static55.aClass6_Sub15_Sub1_1.method2609()) {
				if (local13 == 0) {
					return false;
				}
				Static103.aClass30_1.method734(1, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 1);
				local13--;
				Static208.anInt3630++;
			}
			Static347.aBoolean388 = true;
			@Pc(66) Class186[] local66 = Static446.method5947();
			local70 = Static55.aClass6_Sub15_Sub1_1.method2603();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70 + " ip:" + Static55.aClass6_Sub15_Sub1_1.anInt3487);
			}
			Static106.aClass186_44 = local66[local70];
			Static337.anInt5664 = Static106.aClass186_44.anInt4810;
		}
		if (Static337.anInt5664 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 1);
			Static337.anInt5664 = Static55.aClass6_Sub15_Sub1_1.aByteArray51[0] & 0xFF;
			local13--;
			Static208.anInt3630++;
		}
		if (Static337.anInt5664 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, 2);
			Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
			Static337.anInt5664 = Static55.aClass6_Sub15_Sub1_1.method3108();
			local13 -= 2;
			Static208.anInt3630 += 2;
		}
		if (local13 < Static337.anInt5664) {
			return false;
		}
		Static55.aClass6_Sub15_Sub1_1.anInt3487 = 0;
		Static103.aClass30_1.method734(0, Static55.aClass6_Sub15_Sub1_1.aByteArray51, Static337.anInt5664);
		Static208.anInt3630 += Static337.anInt5664;
		Static344.anInt5771 = 0;
		Static325.aClass186_94 = Static314.aClass186_127;
		Static314.aClass186_127 = Static407.aClass186_122;
		Static407.aClass186_122 = Static106.aClass186_44;
		if (Static335.aClass186_99 == Static106.aClass186_44) {
			Static206.method3219(Static178.aClass175_2);
			Static106.aClass186_44 = null;
			return true;
		} else if (Static106.aClass186_44 == Static22.aClass186_5) {
			Static392.anInt6523 = Static55.aClass6_Sub15_Sub1_1.method3111();
			Static106.aClass186_44 = null;
			return true;
		} else {
			@Pc(216) int local216;
			if (Static122.aClass186_33 == Static106.aClass186_44) {
				local216 = Static55.aClass6_Sub15_Sub1_1.method3097();
				local70 = Static55.aClass6_Sub15_Sub1_1.method3124();
				Static71.aClass126_1.method2804(local70, local216);
				Static106.aClass186_44 = null;
				return true;
			}
			@Pc(273) int local273;
			@Pc(247) String local247;
			@Pc(249) String local249;
			@Pc(243) boolean local243;
			@Pc(259) long local259;
			@Pc(269) long local269;
			@Pc(264) long local264;
			if (Static344.aClass186_105 == Static106.aClass186_44) {
				local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
				local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
				local249 = local247;
				if (local243) {
					local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
				}
				local259 = Static55.aClass6_Sub15_Sub1_1.method3119();
				local264 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local269 = Static55.aClass6_Sub15_Sub1_1.method3078();
				local273 = Static55.aClass6_Sub15_Sub1_1.method3111();
				@Pc(279) long local279 = (local264 << 32) + local269;
				@Pc(281) boolean local281 = false;
				@Pc(283) int local283 = 0;
				while (true) {
					if (local283 >= 100) {
						if (local273 <= 1) {
							if (Static311.aBoolean354 && !Static40.aBoolean73 || Static130.aBoolean175) {
								local281 = true;
							} else if (Static250.method3853(local249)) {
								local281 = true;
							}
						}
						break;
					}
					if (local279 == Static11.aLongArray1[local283]) {
						local281 = true;
						break;
					}
					local283++;
				}
				if (!local281 && Static3.anInt6324 == 0) {
					Static11.aLongArray1[Static375.anInt6235] = local279;
					Static375.anInt6235 = (Static375.anInt6235 + 1) % 100;
					@Pc(347) String local347 = Static296.method4364(Static176.method2770(Static55.aClass6_Sub15_Sub1_1));
					if (local273 == 2 || local273 == 3) {
						Static243.method3768(local347, -1, Static247.method3808(local259), "<img=1>" + local249, 0, 9, "<img=1>" + local247);
					} else if (local273 == 1) {
						Static243.method3768(local347, -1, Static247.method3808(local259), "<img=0>" + local249, 0, 9, "<img=0>" + local247);
					} else {
						Static243.method3768(local347, -1, Static247.method3808(local259), local249, 0, 9, local247);
					}
				}
				Static106.aClass186_44 = null;
				return true;
			}
			@Pc(440) int local440;
			if (Static239.aClass186_67 == Static106.aClass186_44) {
				local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
				local440 = Static55.aClass6_Sub15_Sub1_1.method3129();
				if (Static101.method1688(local216)) {
					Static205.method1174(local440, local70);
				}
				Static106.aClass186_44 = null;
				return true;
			} else if (Static136.aClass186_37 == Static106.aClass186_44) {
				Static327.method4689();
				Static106.aClass186_44 = null;
				return true;
			} else if (Static106.aClass186_44 == Static416.aClass186_80) {
				Static206.method3219(Static135.aClass175_8);
				Static106.aClass186_44 = null;
				return true;
			} else if (Static331.aClass186_98 == Static106.aClass186_44) {
				Static329.aString50 = Static337.anInt5664 > 2 ? Static55.aClass6_Sub15_Sub1_1.method3093() : Static358.aClass231_99.method5138(Static382.anInt6289);
				Static149.anInt2680 = Static337.anInt5664 > 0 ? Static55.aClass6_Sub15_Sub1_1.method3108() : -1;
				if (Static149.anInt2680 == 65535) {
					Static149.anInt2680 = -1;
				}
				Static106.aClass186_44 = null;
				return true;
			} else if (Static164.aClass186_47 == Static106.aClass186_44) {
				local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
				local70 = Static55.aClass6_Sub15_Sub1_1.method3131();
				local440 = Static55.aClass6_Sub15_Sub1_1.method3097();
				@Pc(524) Class3_Sub3_Sub6_Sub2 local524 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local216];
				if (local524 != null) {
					Static44.method824(local440, local524, local70);
				}
				Static106.aClass186_44 = null;
				return true;
			} else {
				@Pc(563) int local563;
				@Pc(599) String local599;
				if (Static289.aClass186_84 == Static106.aClass186_44) {
					local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
					local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
					local249 = local247;
					if (local243) {
						local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
					}
					local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
					@Pc(565) boolean local565 = false;
					if (local563 <= 1) {
						if (Static311.aBoolean354 && !Static40.aBoolean73 || Static130.aBoolean175) {
							local565 = true;
						} else if (local563 <= 1 && Static250.method3853(local249)) {
							local565 = true;
						}
					}
					if (!local565 && Static3.anInt6324 == 0) {
						local599 = Static296.method4364(Static176.method2770(Static55.aClass6_Sub15_Sub1_1));
						if (local563 == 2) {
							Static243.method3768(local599, -1, null, "<img=1>" + local249, 0, 24, "<img=1>" + local247);
						} else if (local563 == 1) {
							Static243.method3768(local599, -1, null, "<img=0>" + local249, 0, 24, "<img=0>" + local247);
						} else {
							Static243.method3768(local599, -1, null, local249, 0, 24, local247);
						}
					}
					Static106.aClass186_44 = null;
					return true;
				} else if (Static106.aClass186_44 == Static31.aClass186_7) {
					local216 = Static55.aClass6_Sub15_Sub1_1.method3109();
					local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
					local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
					if (local440 == 65535) {
						local440 = -1;
					}
					if (Static101.method1688(local70)) {
						Static365.method3017(local440, local216);
					}
					Static106.aClass186_44 = null;
					return true;
				} else {
					@Pc(705) String local705;
					if (Static106.aClass186_44 == Static173.aClass186_49) {
						local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
						local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
						local440 = Static55.aClass6_Sub15_Sub1_1.method3097();
						if (Static101.method1688(local440)) {
							Static106.method2515(local705, local70);
						}
						Static106.aClass186_44 = null;
						return true;
					} else if (Static356.aClass186_110 == Static106.aClass186_44) {
						Static206.method3219(Static258.aClass175_13);
						Static106.aClass186_44 = null;
						return true;
					} else {
						@Pc(758) int local758;
						@Pc(764) int local764;
						@Pc(770) int local770;
						@Pc(774) int local774;
						@Pc(778) int local778;
						if (Static204.aClass186_95 == Static106.aClass186_44) {
							local216 = Static55.aClass6_Sub15_Sub1_1.method3131();
							local70 = local216 >> 2;
							local440 = local216 & 0x3;
							local563 = Static125.anIntArray233[local70];
							local758 = Static55.aClass6_Sub15_Sub1_1.method3109();
							local764 = local758 >> 28 & 0x3;
							local770 = local758 >> 14 & 0x3FFF;
							local774 = local758 & 0x3FFF;
							local778 = Static55.aClass6_Sub15_Sub1_1.method3108();
							if (local778 == 65535) {
								local778 = -1;
							}
							local770 -= Static206.anInt3592;
							local774 -= Static99.anInt1814;
							Static87.method1530(local70, local764, local440, local563, local770, local778, local774);
							Static106.aClass186_44 = null;
							return true;
						} else if (Static106.aClass186_44 == Static432.aClass186_130) {
							Static206.method3219(Static302.aClass175_15);
							Static106.aClass186_44 = null;
							return true;
						} else if (Static106.aClass186_44 == Static64.aClass186_17) {
							local216 = Static55.aClass6_Sub15_Sub1_1.method3129();
							local70 = Static55.aClass6_Sub15_Sub1_1.method3097();
							Static71.aClass126_1.method2810(local70, local216);
							Static106.aClass186_44 = null;
							return true;
						} else if (Static106.aClass186_44 == Static436.aClass186_131) {
							Static25.method5894(false);
							Static106.aClass186_44 = null;
							return true;
						} else if (Static106.aClass186_44 == Static409.aClass186_123) {
							local216 = Static55.aClass6_Sub15_Sub1_1.method3129();
							local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
							local440 = Static55.aClass6_Sub15_Sub1_1.method3108();
							if (Static101.method1688(local70)) {
								Static125.method2033(local440, local216);
							}
							Static106.aClass186_44 = null;
							return true;
						} else if (Static106.aClass186_44 == Static279.aClass186_78) {
							local216 = Static55.aClass6_Sub15_Sub1_1.method3101();
							local70 = Static55.aClass6_Sub15_Sub1_1.method3109();
							local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
							if (Static101.method1688(local216)) {
								Static279.method4217(local70, local440);
							}
							Static106.aClass186_44 = null;
							return true;
						} else {
							@Pc(930) Class6_Sub16 local930;
							if (Static106.aClass186_44 == Static177.aClass186_53) {
								local216 = Static55.aClass6_Sub15_Sub1_1.method3126();
								local70 = Static55.aClass6_Sub15_Sub1_1.method3131();
								local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
								local563 = Static55.aClass6_Sub15_Sub1_1.method3092();
								if (Static101.method1688(local440)) {
									local930 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local563);
									if (local930 != null) {
										Static60.method1108(false, local930.anInt2715 != local216, local930);
									}
									Static128.method2087(local563, local216, local70, false);
								}
								Static106.aClass186_44 = null;
								return true;
							} else if (Static10.aClass186_117 == Static106.aClass186_44) {
								local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
								local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
								local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
								local563 = Static55.aClass6_Sub15_Sub1_1.method3108() << 0;
								local758 = Static55.aClass6_Sub15_Sub1_1.method3111();
								local764 = Static55.aClass6_Sub15_Sub1_1.method3111();
								if (Static101.method1688(local216)) {
									Static245.method3779(local758, local563, local764, local70, local440);
								}
								Static106.aClass186_44 = null;
								return true;
							} else {
								@Pc(1079) boolean local1079;
								@Pc(1243) int local1243;
								@Pc(1122) int local1122;
								@Pc(1036) boolean local1036;
								@Pc(1689) int local1689;
								if (Static323.aClass186_92 == Static106.aClass186_44) {
									local216 = Static55.aClass6_Sub15_Sub1_1.method3129();
									local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
									local440 = Static55.aClass6_Sub15_Sub1_1.method3097();
									local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
									local758 = Static55.aClass6_Sub15_Sub1_1.method3111();
									local1036 = (local758 & 0x80) != 0;
									if (local216 >> 30 == 0) {
										@Pc(1106) Class250 local1106;
										@Pc(1167) Class83 local1167;
										@Pc(1151) Class250 local1151;
										@Pc(1119) Class83 local1119;
										@Pc(1173) Class83 local1173;
										if (local216 >> 29 != 0) {
											local770 = local216 & 0xFFFF;
											@Pc(1374) Class3_Sub3_Sub6_Sub2 local1374 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local770];
											if (local1374 != null) {
												if (local563 == 65535) {
													local563 = -1;
												}
												local1079 = true;
												local273 = local1036 ? local1374.anInt6710 : local1374.anInt6712;
												if (local563 != -1 && local273 != -1) {
													if (local273 == local563) {
														local1106 = Static93.aClass70_1.method1595(local563);
														if (local1106.aBoolean474 && local1106.anInt6999 != -1) {
															local1119 = Static244.aClass174_2.method4011(local1106.anInt6999);
															local1122 = local1119.anInt1981;
															if (local1122 == 0 || local1122 == 2) {
																local1079 = false;
															} else if (local1122 == 1) {
																local1079 = true;
															}
														}
													} else {
														local1106 = Static93.aClass70_1.method1595(local563);
														local1151 = Static93.aClass70_1.method1595(local273);
														if (local1106.anInt6999 != -1 && local1151.anInt6999 != -1) {
															local1167 = Static244.aClass174_2.method4011(local1106.anInt6999);
															local1173 = Static244.aClass174_2.method4011(local1151.anInt6999);
															if (local1167.anInt1998 < local1173.anInt1998) {
																local1079 = false;
															}
														}
													}
												}
												if (local1079) {
													if (local1036) {
														local1374.anInt6710 = local563;
														local1374.anInt6715 = 0;
														local1374.anInt6709 = local440;
														local1374.anInt6703 = local758 & 0x7;
														local1374.anInt6680 = 0;
														local1374.anInt6705 = 1;
														local1374.anInt6708 = local70 + Static125.anInt2225;
														if (Static125.anInt2225 < local1374.anInt6708) {
															local1374.anInt6680 = -1;
														}
														if (local1374.anInt6710 != -1 && Static125.anInt2225 == local1374.anInt6708) {
															local1243 = Static93.aClass70_1.method1595(local1374.anInt6710).anInt6999;
															if (local1243 != -1) {
																local1119 = Static244.aClass174_2.method4011(local1243);
																if (local1119 != null && local1119.anIntArray211 != null) {
																	Static34.method731(local1119, local1374.aByte93, 0, false, local1374.anInt6675, local1374.anInt6677);
																}
															}
														}
													} else {
														local1374.anInt6747 = Static125.anInt2225 + local70;
														local1374.anInt6712 = local563;
														local1374.anInt6739 = 1;
														local1374.anInt6752 = local440;
														local1374.anInt6717 = 0;
														local1374.anInt6716 = local758 & 0x7;
														local1374.anInt6724 = 0;
														if (local1374.anInt6747 > Static125.anInt2225) {
															local1374.anInt6717 = -1;
														}
														if (local1374.anInt6712 != -1 && local1374.anInt6747 == Static125.anInt2225) {
															local1243 = Static93.aClass70_1.method1595(local1374.anInt6712).anInt6999;
															if (local1243 != -1) {
																local1119 = Static244.aClass174_2.method4011(local1243);
																if (local1119 != null && local1119.anIntArray211 != null) {
																	Static34.method731(local1119, local1374.aByte93, 0, false, local1374.anInt6675, local1374.anInt6677);
																}
															}
														}
													}
												}
											}
										} else if (local216 >> 28 != 0) {
											local770 = local216 & 0xFFFF;
											@Pc(1064) Class3_Sub3_Sub6_Sub1 local1064;
											if (local770 == Static251.anInt4268) {
												local1064 = Static134.aClass3_Sub3_Sub6_Sub1_1;
											} else {
												local1064 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local770];
											}
											if (local1064 != null) {
												if (local563 == 65535) {
													local563 = -1;
												}
												local1079 = true;
												local273 = local1036 ? local1064.anInt6710 : local1064.anInt6712;
												if (local563 != -1 && local273 != -1) {
													if (local273 == local563) {
														local1106 = Static93.aClass70_1.method1595(local563);
														if (local1106.aBoolean474 && local1106.anInt6999 != -1) {
															local1119 = Static244.aClass174_2.method4011(local1106.anInt6999);
															local1122 = local1119.anInt1981;
															if (local1122 == 0 || local1122 == 2) {
																local1079 = false;
															} else if (local1122 == 1) {
																local1079 = true;
															}
														}
													} else {
														local1106 = Static93.aClass70_1.method1595(local563);
														local1151 = Static93.aClass70_1.method1595(local273);
														if (local1106.anInt6999 != -1 && local1151.anInt6999 != -1) {
															local1167 = Static244.aClass174_2.method4011(local1106.anInt6999);
															local1173 = Static244.aClass174_2.method4011(local1151.anInt6999);
															if (local1173.anInt1998 > local1167.anInt1998) {
																local1079 = false;
															}
														}
													}
												}
												if (local1079) {
													if (local1036) {
														local1064.anInt6709 = local440;
														local1064.anInt6710 = local563;
														local1064.anInt6708 = Static125.anInt2225 + local70;
														local1064.anInt6703 = local758 & 0x7;
														local1064.anInt6715 = 0;
														local1064.anInt6680 = 0;
														local1064.anInt6705 = 1;
														if (local1064.anInt6708 > Static125.anInt2225) {
															local1064.anInt6680 = -1;
														}
														if (local1064.anInt6710 == 65535) {
															local1064.anInt6710 = -1;
														}
														if (local1064.anInt6710 != -1 && Static125.anInt2225 == local1064.anInt6708) {
															local1243 = Static93.aClass70_1.method1595(local1064.anInt6710).anInt6999;
															if (local1243 != -1) {
																local1119 = Static244.aClass174_2.method4011(local1243);
																if (local1119 != null && local1119.anIntArray211 != null) {
																	Static34.method731(local1119, local1064.aByte93, 0, local1064 == Static134.aClass3_Sub3_Sub6_Sub1_1, local1064.anInt6675, local1064.anInt6677);
																}
															}
														}
													} else {
														local1064.anInt6724 = 0;
														local1064.anInt6747 = local70 + Static125.anInt2225;
														local1064.anInt6717 = 0;
														local1064.anInt6739 = 1;
														local1064.anInt6716 = local758 & 0x7;
														local1064.anInt6752 = local440;
														local1064.anInt6712 = local563;
														if (local1064.anInt6712 == 65535) {
															local1064.anInt6712 = -1;
														}
														if (local1064.anInt6747 > Static125.anInt2225) {
															local1064.anInt6717 = -1;
														}
														if (local1064.anInt6712 != -1 && local1064.anInt6747 == Static125.anInt2225) {
															local1243 = Static93.aClass70_1.method1595(local1064.anInt6712).anInt6999;
															if (local1243 != -1) {
																local1119 = Static244.aClass174_2.method4011(local1243);
																if (local1119 != null && local1119.anIntArray211 != null) {
																	Static34.method731(local1119, local1064.aByte93, 0, Static134.aClass3_Sub3_Sub6_Sub1_1 == local1064, local1064.anInt6675, local1064.anInt6677);
																}
															}
														}
													}
												}
											}
										}
									} else {
										local770 = local216 >> 28 & 0x3;
										local774 = (local216 >> 14 & 0x3FFF) - Static206.anInt3592;
										local778 = (local216 & 0x3FFF) - Static99.anInt1814;
										if (local774 >= 0 && local778 >= 0 && Static84.anInt1632 > local774 && local778 < Static261.anInt4480) {
											local273 = local774 * 128 + 64;
											local1243 = local778 * 128 + 64;
											local1689 = local770;
											if (local770 < 3 && Static132.method2150(local774, local778)) {
												local1689 = local770 + 1;
											}
											@Pc(1724) Class3_Sub3_Sub5 local1724 = new Class3_Sub3_Sub5(local563, 0, Static125.anInt2225, local770, local1689, local273, Static165.method2689(local273, local770, local1243) - local440, local1243, local774, local774, local778, local778, local758);
											Static205.aClass88_15.method1878(new Class6_Sub1_Sub7(local1724));
										}
									}
									Static106.aClass186_44 = null;
									return true;
								} else if (Static168.aClass186_48 == Static106.aClass186_44) {
									local216 = Static55.aClass6_Sub15_Sub1_1.method3124();
									local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
									local440 = Static55.aClass6_Sub15_Sub1_1.method3109();
									local563 = Static55.aClass6_Sub15_Sub1_1.method3108();
									if (local563 == 65535) {
										local563 = -1;
									}
									if (Static101.method1688(local70)) {
										Static385.method5311(local440, local216, local563);
										@Pc(1773) Class32 local1773 = Static354.aClass170_2.method3865(local563);
										Static445.method5945(local1773.anInt849, local216, local1773.anInt875, local1773.anInt877);
										Static362.method5121(local1773.anInt867, local1773.anInt845, local1773.anInt816, local216);
									}
									Static106.aClass186_44 = null;
									return true;
								} else if (Static52.aClass186_13 == Static106.aClass186_44) {
									local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
									local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
									local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
									local563 = Static55.aClass6_Sub15_Sub1_1.method3108() << 0;
									local758 = Static55.aClass6_Sub15_Sub1_1.method3111();
									local764 = Static55.aClass6_Sub15_Sub1_1.method3111();
									if (Static101.method1688(local216)) {
										Static230.method3597(local563, local440, local758, true, local70, local764);
									}
									Static106.aClass186_44 = null;
									return true;
								} else if (Static106.aClass186_44 == Static251.aClass186_70) {
									Static289.aClass253_2 = Static425.method5789(Static55.aClass6_Sub15_Sub1_1.method3111());
									Static106.aClass186_44 = null;
									return true;
								} else if (Static176.aClass186_52 == Static106.aClass186_44) {
									Static288.method4290(Static55.aClass6_Sub15_Sub1_1.method3093());
									Static106.aClass186_44 = null;
									return true;
								} else if (Static106.aClass186_44 == Static249.aClass186_69) {
									Static376.anInt5184 = Static55.aClass6_Sub15_Sub1_1.method3111();
									Static106.aClass186_44 = null;
									Static29.anInt445 = Static323.anInt5265;
									return true;
								} else if (Static192.aClass186_55 == Static106.aClass186_44) {
									local216 = Static55.aClass6_Sub15_Sub1_1.method3086();
									local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
									if (Static101.method1688(local70)) {
										Static339.anInt5698 = local216;
									}
									Static106.aClass186_44 = null;
									return true;
								} else if (Static299.aClass186_85 == Static106.aClass186_44) {
									if (Static313.anInt5099 != -1) {
										Static277.method4189(0, Static313.anInt5099);
									}
									Static106.aClass186_44 = null;
									return true;
								} else {
									@Pc(1935) String local1935;
									@Pc(1937) String local1937;
									if (Static106.aClass186_44 == Static272.aClass186_76) {
										local216 = Static55.aClass6_Sub15_Sub1_1.method3090();
										local70 = Static55.aClass6_Sub15_Sub1_1.method3109();
										local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
										local1935 = "";
										local1937 = local1935;
										if ((local440 & 0x1) != 0) {
											local1935 = Static55.aClass6_Sub15_Sub1_1.method3093();
											if ((local440 & 0x2) == 0) {
												local1937 = local1935;
											} else {
												local1937 = Static55.aClass6_Sub15_Sub1_1.method3093();
											}
										}
										local599 = Static55.aClass6_Sub15_Sub1_1.method3093();
										if (local216 == 99) {
											Static98.method5863(local599);
										} else if (local1937.equals("") || !Static250.method3853(local1937)) {
											Static84.method1521(local599, local216, local1937, local70, local1935);
										} else {
											Static106.aClass186_44 = null;
											return true;
										}
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static120.aClass186_30) {
										Static393.method4742(Static165.aClass103_3, Static337.anInt5664, Static55.aClass6_Sub15_Sub1_1);
										Static106.aClass186_44 = null;
										return true;
									} else if (Static266.aClass186_75 == Static106.aClass186_44) {
										local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
										local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
										local440 = Static55.aClass6_Sub15_Sub1_1.method3108();
										local563 = Static55.aClass6_Sub15_Sub1_1.method3108();
										if (Static101.method1688(local216) && Static129.aClass239ArrayArray1[local70] != null) {
											for (local758 = local440; local758 < local563; local758++) {
												local764 = Static55.aClass6_Sub15_Sub1_1.method3078();
												if (Static129.aClass239ArrayArray1[local70].length > local758 && Static129.aClass239ArrayArray1[local70][local758] != null) {
													Static129.aClass239ArrayArray1[local70][local758].anInt6490 = local764;
												}
											}
										}
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static217.aClass186_59) {
										local216 = Static55.aClass6_Sub15_Sub1_1.method3111();
										local70 = local216 >> 5;
										local440 = local216 & 0x1F;
										if (local440 == 0) {
											Static190.aClass107Array1[local70] = null;
											Static106.aClass186_44 = null;
											return true;
										}
										@Pc(2107) Class107 local2107 = new Class107();
										local2107.anInt2681 = local440;
										local2107.anInt2690 = Static55.aClass6_Sub15_Sub1_1.method3111();
										if (local2107.anInt2690 >= 0 && local2107.anInt2690 < Static252.aClass12Array13.length) {
											if (local2107.anInt2681 == 1 || local2107.anInt2681 == 10) {
												local2107.anInt2683 = Static55.aClass6_Sub15_Sub1_1.method3108();
												Static55.aClass6_Sub15_Sub1_1.anInt3487 += 6;
											} else if (local2107.anInt2681 >= 2 && local2107.anInt2681 <= 6) {
												if (local2107.anInt2681 == 2) {
													local2107.anInt2684 = 64;
													local2107.anInt2688 = 64;
												}
												if (local2107.anInt2681 == 3) {
													local2107.anInt2688 = 0;
													local2107.anInt2684 = 64;
												}
												if (local2107.anInt2681 == 4) {
													local2107.anInt2688 = 128;
													local2107.anInt2684 = 64;
												}
												if (local2107.anInt2681 == 5) {
													local2107.anInt2688 = 64;
													local2107.anInt2684 = 0;
												}
												if (local2107.anInt2681 == 6) {
													local2107.anInt2684 = 128;
													local2107.anInt2688 = 64;
												}
												local2107.anInt2681 = 2;
												local2107.anInt2685 = Static55.aClass6_Sub15_Sub1_1.method3111();
												local2107.anInt2688 += Static55.aClass6_Sub15_Sub1_1.method3108() - Static206.anInt3592 << 7;
												local2107.anInt2684 += Static55.aClass6_Sub15_Sub1_1.method3108() - Static99.anInt1814 << 7;
												local2107.anInt2686 = Static55.aClass6_Sub15_Sub1_1.method3111();
												local2107.anInt2687 = Static55.aClass6_Sub15_Sub1_1.method3108();
											}
											local2107.anInt2682 = Static55.aClass6_Sub15_Sub1_1.method3108();
											if (local2107.anInt2682 == 65535) {
												local2107.anInt2682 = -1;
											}
											Static190.aClass107Array1[local70] = local2107;
										}
										Static106.aClass186_44 = null;
										return true;
									} else if (Static329.aClass186_96 == Static106.aClass186_44) {
										Static206.method3219(Static61.aClass175_4);
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static387.aClass186_116) {
										Static206.method3219(Static269.aClass175_14);
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static195.aClass186_56) {
										local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
										local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
										local249 = local247;
										if (local243) {
											local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
										}
										local259 = Static55.aClass6_Sub15_Sub1_1.method3108();
										local264 = Static55.aClass6_Sub15_Sub1_1.method3078();
										local774 = Static55.aClass6_Sub15_Sub1_1.method3111();
										local778 = Static55.aClass6_Sub15_Sub1_1.method3108();
										@Pc(2345) long local2345 = (local259 << 32) + local264;
										@Pc(2347) boolean local2347 = false;
										local1122 = 0;
										while (true) {
											if (local1122 >= 100) {
												if (local774 <= 1 && Static250.method3853(local249)) {
													local2347 = true;
												}
												break;
											}
											if (Static11.aLongArray1[local1122] == local2345) {
												local2347 = true;
												break;
											}
											local1122++;
										}
										if (!local2347 && Static3.anInt6324 == 0) {
											Static11.aLongArray1[Static375.anInt6235] = local2345;
											Static375.anInt6235 = (Static375.anInt6235 + 1) % 100;
											@Pc(2401) String local2401 = Static327.aClass129_2.method2908(local778).method1436(Static55.aClass6_Sub15_Sub1_1);
											if (local774 == 2) {
												Static243.method3768(local2401, local778, null, "<img=1>" + local249, 0, 18, "<img=1>" + local247);
											} else if (local774 == 1) {
												Static243.method3768(local2401, local778, null, "<img=0>" + local249, 0, 18, "<img=0>" + local247);
											} else {
												Static243.method3768(local2401, local778, null, local249, 0, 18, local247);
											}
										}
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static122.aClass186_34) {
										local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
										if (local216 == 65535) {
											local216 = -1;
										}
										local70 = Static55.aClass6_Sub15_Sub1_1.method3131();
										local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
										Static190.method2936(local440, local216, local70);
										Static106.aClass186_44 = null;
										return true;
									} else if (Static106.aClass186_44 == Static8.aClass186_3) {
										local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
										if (local216 == 65535) {
											local216 = -1;
										}
										local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
										local440 = Static55.aClass6_Sub15_Sub1_1.method3098();
										Static65.method1231(local440, local216, local70);
										Static106.aClass186_44 = null;
										return true;
									} else {
										@Pc(2593) Class6_Sub30 local2593;
										@Pc(2575) long local2575;
										@Pc(2581) Class6_Sub30 local2581;
										if (Static106.aClass186_44 == Static331.aClass186_97) {
											local216 = Static55.aClass6_Sub15_Sub1_1.method3124();
											local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
											if (local70 == 65535) {
												local70 = -1;
											}
											local440 = Static55.aClass6_Sub15_Sub1_1.method3101();
											local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
											local758 = Static55.aClass6_Sub15_Sub1_1.method3097();
											if (local758 == 65535) {
												local758 = -1;
											}
											if (Static101.method1688(local563)) {
												for (local764 = local70; local764 <= local758; local764++) {
													local2575 = ((long) local216 << 32) + (long) local764;
													local2581 = (Class6_Sub30) Static345.aClass137_29.method3175(local2575);
													if (local2581 != null) {
														local2593 = new Class6_Sub30(local2581.anInt5768, local440);
														local2581.method5977();
													} else if (local764 == -1) {
														local2593 = new Class6_Sub30(Static299.method4387(local216).aClass6_Sub30_2.anInt5768, local440);
													} else {
														local2593 = new Class6_Sub30(0, local440);
													}
													Static345.aClass137_29.method3179(local2575, local2593);
												}
											}
											Static106.aClass186_44 = null;
											return true;
										} else if (Static106.aClass186_44 == Static115.aClass186_29) {
											local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
											local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
											local249 = local247;
											if (local243) {
												local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
											}
											local259 = Static55.aClass6_Sub15_Sub1_1.method3108();
											local264 = Static55.aClass6_Sub15_Sub1_1.method3078();
											local774 = Static55.aClass6_Sub15_Sub1_1.method3111();
											@Pc(2680) long local2680 = (local259 << 32) + local264;
											@Pc(2682) boolean local2682 = false;
											local1689 = 0;
											while (true) {
												if (local1689 >= 100) {
													if (local774 <= 1) {
														if (Static311.aBoolean354 && !Static40.aBoolean73 || Static130.aBoolean175) {
															local2682 = true;
														} else if (Static250.method3853(local249)) {
															local2682 = true;
														}
													}
													break;
												}
												if (Static11.aLongArray1[local1689] == local2680) {
													local2682 = true;
													break;
												}
												local1689++;
											}
											if (!local2682 && Static3.anInt6324 == 0) {
												Static11.aLongArray1[Static375.anInt6235] = local2680;
												Static375.anInt6235 = (Static375.anInt6235 + 1) % 100;
												@Pc(2741) String local2741 = Static296.method4364(Static176.method2770(Static55.aClass6_Sub15_Sub1_1));
												if (local774 == 2) {
													Static243.method3768(local2741, -1, null, "<img=1>" + local249, 0, 7, "<img=1>" + local247);
												} else if (local774 == 1) {
													Static243.method3768(local2741, -1, null, "<img=0>" + local249, 0, 7, "<img=0>" + local247);
												} else {
													Static243.method3768(local2741, -1, null, local249, 0, 3, local247);
												}
											}
											Static106.aClass186_44 = null;
											return true;
										} else if (Static106.aClass186_44 == Static32.aClass186_8) {
											local216 = Static55.aClass6_Sub15_Sub1_1.method3124();
											local70 = Static55.aClass6_Sub15_Sub1_1.method3109();
											local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
											if (Static101.method1688(local440)) {
												@Pc(2836) Class6_Sub16 local2836 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local70);
												local930 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local216);
												if (local930 != null) {
													Static60.method1108(false, local2836 == null || local930.anInt2715 != local2836.anInt2715, local930);
												}
												if (local2836 != null) {
													local2836.method5977();
													Static20.aClass137_3.method3179((long) local216, local2836);
												}
												@Pc(2874) Class239 local2874 = Static299.method4387(local70);
												if (local2874 != null) {
													Static354.method4992(local2874);
												}
												local2874 = Static299.method4387(local216);
												if (local2874 != null) {
													Static354.method4992(local2874);
													Static199.method3150(local2874, true);
												}
												if (Static313.anInt5099 != -1) {
													Static277.method4189(1, Static313.anInt5099);
												}
											}
											Static106.aClass186_44 = null;
											return true;
										} else if (Static425.aClass186_128 == Static106.aClass186_44) {
											local216 = Static55.aClass6_Sub15_Sub1_1.method3124();
											local70 = Static55.aClass6_Sub15_Sub1_1.method3097();
											local440 = Static55.aClass6_Sub15_Sub1_1.method3101();
											if (Static101.method1688(local70)) {
												Static272.method4132(local216, local440);
											}
											Static106.aClass186_44 = null;
											return true;
										} else {
											@Pc(2937) byte local2937;
											if (Static106.aClass186_44 == Static390.aClass186_119) {
												local2937 = Static55.aClass6_Sub15_Sub1_1.method3077();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
												local440 = Static55.aClass6_Sub15_Sub1_1.method3108();
												if (Static101.method1688(local440)) {
													Static125.method2033(local70, local2937);
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static265.aClass186_74 == Static106.aClass186_44) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
												if (local216 == 65535) {
													local216 = -1;
												}
												local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
												local440 = Static55.aClass6_Sub15_Sub1_1.method3108();
												local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
												Static350.method4969(local216, local440, local563, local70);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static200.aClass186_57 == Static106.aClass186_44) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3101();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3097();
												local440 = Static55.aClass6_Sub15_Sub1_1.method3092();
												local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
												local758 = Static55.aClass6_Sub15_Sub1_1.method3097();
												if (Static101.method1688(local758)) {
													Static209.method3259(local70 | local216 << 16, local440, 7, local563);
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static430.aClass186_129) {
												Static206.method3219(Static361.aClass175_17);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static354.aClass186_109) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3126();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
												local440 = Static55.aClass6_Sub15_Sub1_1.method3109();
												local563 = Static55.aClass6_Sub15_Sub1_1.method3101();
												if (Static101.method1688(local563)) {
													Static356.method5006(local440, local70 + (local216 << 16));
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static243.aClass186_68 == Static106.aClass186_44) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3097();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3129();
												if (Static101.method1688(local216)) {
													Static209.method3259(Static251.anInt4268, local70, 5, 0);
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static362.aClass186_112 == Static106.aClass186_44) {
												Static25.method5894(true);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static288.aClass186_81) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
												if (Static101.method1688(local216)) {
													Static295.method4341();
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static444.aClass186_125) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3109();
												Static340.aClass249_6 = Static165.aClass103_3.method2359(local216);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static289.aClass186_83 == Static106.aClass186_44) {
												Static302.anInt4975 = 1;
												Static106.aClass186_44 = null;
												Static31.anInt507 = Static323.anInt5265;
												return true;
											} else if (Static205.aClass186_16 == Static106.aClass186_44) {
												Static311.anInt5062 = Static55.aClass6_Sub15_Sub1_1.method3103();
												Static29.anInt445 = Static323.anInt5265;
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static113.aClass186_27) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3129();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
												local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
												if (Static101.method1688(local70)) {
													Static163.method2665(local249, local216);
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static338.aClass186_102 == Static106.aClass186_44) {
												local216 = Static55.aClass6_Sub15_Sub1_1.method3103();
												local70 = Static55.aClass6_Sub15_Sub1_1.method3129();
												local440 = Static55.aClass6_Sub15_Sub1_1.method3128();
												local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
												if (Static101.method1688(local563)) {
													Static416.method4234(local216, local440, local70);
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static420.aClass186_126) {
												Static416.anInt4774 = Static55.aClass6_Sub15_Sub1_1.method3077() << 3;
												Static30.anInt501 = Static55.aClass6_Sub15_Sub1_1.method3104() << 3;
												Static412.anInt6899 = Static55.aClass6_Sub15_Sub1_1.method3086();
												for (@Pc(3254) Class6_Sub12 local3254 = (Class6_Sub12) Static23.aClass137_4.method3181(); local3254 != null; local3254 = (Class6_Sub12) Static23.aClass137_4.method3182()) {
													local70 = (int) (local3254.aLong217 & 0x3FFFL);
													local440 = (int) (local3254.aLong217 >> 14 & 0x3FFFL);
													local563 = (int) (local3254.aLong217 >> 28 & 0x3L);
													if (Static412.anInt6899 == local563 && local70 >= Static416.anInt4774 && local70 < Static416.anInt4774 + 8 && local440 >= Static30.anInt501 && Static30.anInt501 + 8 > local440) {
														local3254.method5977();
														Static316.method5796(local70, local440, Static412.anInt6899);
													}
												}
												for (@Pc(3333) Class6_Sub43 local3333 = (Class6_Sub43) Static203.aClass88_32.method1882(); local3333 != null; local3333 = (Class6_Sub43) Static203.aClass88_32.method1891()) {
													if (Static416.anInt4774 <= local3333.anInt6925 && Static416.anInt4774 + 8 > local3333.anInt6925 && local3333.anInt6918 >= Static30.anInt501 && local3333.anInt6918 < Static30.anInt501 + 8 && Static412.anInt6899 == local3333.anInt6914) {
														local3333.anInt6919 = 0;
													}
												}
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static335.aClass186_100) {
												Static206.method3219(Static56.aClass175_3);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static229.aClass186_62) {
												Static44.method825();
												Static106.aClass186_44 = null;
												return false;
											} else if (Static312.aClass186_88 == Static106.aClass186_44) {
												Static206.method3219(Static158.aClass175_11);
												Static106.aClass186_44 = null;
												return true;
											} else if (Static106.aClass186_44 == Static126.aClass186_73) {
												Static30.anInt501 = Static55.aClass6_Sub15_Sub1_1.method3077() << 3;
												Static416.anInt4774 = Static55.aClass6_Sub15_Sub1_1.method3104() << 3;
												Static412.anInt6899 = Static55.aClass6_Sub15_Sub1_1.method3086();
												while (Static337.anInt5664 > Static55.aClass6_Sub15_Sub1_1.anInt3487) {
													@Pc(3442) Class175 local3442 = Static208.method3244()[Static55.aClass6_Sub15_Sub1_1.method3111()];
													Static206.method3219(local3442);
												}
												Static106.aClass186_44 = null;
												return true;
											} else {
												@Pc(3633) boolean local3633;
												@Pc(3654) Class85 local3654;
												if (Static44.aClass186_12 == Static106.aClass186_44) {
													Static276.anInt4712 = Static323.anInt5265;
													if (Static337.anInt5664 == 0) {
														Static106.aClass186_44 = null;
														Static209.aString33 = null;
														Static88.anInt1654 = 0;
														Static41.aClass85Array1 = null;
														Static390.aString61 = null;
														return true;
													}
													Static209.aString33 = Static55.aClass6_Sub15_Sub1_1.method3093();
													local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
													if (local243) {
														Static55.aClass6_Sub15_Sub1_1.method3093();
													}
													@Pc(3504) long local3504 = Static55.aClass6_Sub15_Sub1_1.method3119();
													Static390.aString61 = Static350.method4963(local3504);
													Static256.aByte44 = Static55.aClass6_Sub15_Sub1_1.method3116();
													local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
													if (local563 == 255) {
														Static106.aClass186_44 = null;
														return true;
													}
													Static88.anInt1654 = local563;
													@Pc(3528) Class85[] local3528 = new Class85[100];
													for (local764 = 0; local764 < Static88.anInt1654; local764++) {
														local3528[local764] = new Class85();
														local3528[local764].aString15 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
														if (local243) {
															local3528[local764].aString17 = Static55.aClass6_Sub15_Sub1_1.method3093();
														} else {
															local3528[local764].aString17 = local3528[local764].aString15;
														}
														local3528[local764].aString16 = Static214.method3328(local3528[local764].aString17);
														local3528[local764].anInt2011 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local3528[local764].aByte20 = Static55.aClass6_Sub15_Sub1_1.method3116();
														local3528[local764].aString18 = Static55.aClass6_Sub15_Sub1_1.method3093();
														if (local3528[local764].aString17.equals(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48)) {
															Static351.aByte82 = local3528[local764].aByte20;
														}
													}
													local778 = Static88.anInt1654;
													while (local778 > 0) {
														local3633 = true;
														local778--;
														for (local273 = 0; local273 < local778; local273++) {
															if (local3528[local273].aString16.compareTo(local3528[local273 + 1].aString16) > 0) {
																local3654 = local3528[local273];
																local3528[local273] = local3528[local273 + 1];
																local3528[local273 + 1] = local3654;
																local3633 = false;
															}
														}
														if (local3633) {
															break;
														}
													}
													Static41.aClass85Array1 = local3528;
													Static106.aClass186_44 = null;
													return true;
												} else if (Static35.aClass186_10 == Static106.aClass186_44) {
													Static258.anInt4426 = Static55.aClass6_Sub15_Sub1_1.method3111();
													Static56.anInt1177 = Static55.aClass6_Sub15_Sub1_1.method3086();
													Static106.aClass186_44 = null;
													return true;
												} else if (Static313.aClass186_89 == Static106.aClass186_44) {
													local216 = Static55.aClass6_Sub15_Sub1_1.method3092();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
													local440 = Static55.aClass6_Sub15_Sub1_1.method3129();
													local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
													if (Static101.method1688(local70)) {
														Static209.method3259(local563, local440, 5, local216);
													}
													Static106.aClass186_44 = null;
													return true;
												} else if (Static144.aClass186_41 == Static106.aClass186_44) {
													local216 = Static55.aClass6_Sub15_Sub1_1.method3101();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3109();
													local440 = Static55.aClass6_Sub15_Sub1_1.method3101();
													if (local440 == 65535) {
														local440 = -1;
													}
													if (Static101.method1688(local216)) {
														Static209.method3259(local440, local70, 2, -1);
													}
													Static106.aClass186_44 = null;
													return true;
												} else if (Static390.aClass186_118 == Static106.aClass186_44) {
													Static96.anInt1785 = Static55.aClass6_Sub15_Sub1_1.method3108() * 30;
													Static29.anInt445 = Static323.anInt5265;
													Static106.aClass186_44 = null;
													return true;
												} else if (Static106.aClass186_44 == Static390.aClass186_120) {
													Static206.method3219(Static442.aClass175_18);
													Static106.aClass186_44 = null;
													return true;
												} else if (Static160.aClass186_45 == Static106.aClass186_44) {
													local2937 = Static55.aClass6_Sub15_Sub1_1.method3116();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
													Static71.aClass126_1.method2804(local2937, local70);
													Static106.aClass186_44 = null;
													return true;
												} else if (Static106.aClass186_44 == Static23.aClass186_6) {
													Static71.aClass126_1.method2811();
													Static106.aClass186_44 = null;
													Static383.anInt6311 += 32;
													return true;
												} else if (Static235.aClass186_64 == Static106.aClass186_44) {
													Static206.method3219(Static449.aClass175_19);
													Static106.aClass186_44 = null;
													return true;
												} else if (Static106.aClass186_44 == Static343.aClass186_104) {
													local216 = Static55.aClass6_Sub15_Sub1_1.method3086();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3086();
													if (local70 == 255) {
														local70 = -1;
														local216 = -1;
													}
													Static144.method2413(local216, local70);
													Static106.aClass186_44 = null;
													return true;
												} else if (Static353.aClass186_108 == Static106.aClass186_44) {
													local216 = Static55.aClass6_Sub15_Sub1_1.method3103();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
													local440 = Static55.aClass6_Sub15_Sub1_1.method3129();
													if (Static101.method1688(local70)) {
														Static322.method4586(local216, local440);
													}
													Static106.aClass186_44 = null;
													return true;
												} else if (Static379.aClass186_115 == Static106.aClass186_44) {
													local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
													local70 = Static55.aClass6_Sub15_Sub1_1.method3109();
													if (Static101.method1688(local216)) {
														@Pc(3918) Class6_Sub16 local3918 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local70);
														if (local3918 != null) {
															Static60.method1108(false, true, local3918);
														}
														if (Static46.aClass239_13 != null) {
															Static354.method4992(Static46.aClass239_13);
															Static46.aClass239_13 = null;
														}
													}
													Static106.aClass186_44 = null;
													return true;
												} else {
													@Pc(3952) boolean local3952;
													@Pc(4056) String local4056;
													if (Static106.aClass186_44 == Static234.aClass186_63) {
														local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local3952 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
														if (local3952) {
															local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
														} else {
															local247 = local705;
														}
														local563 = Static55.aClass6_Sub15_Sub1_1.method3108();
														@Pc(3970) byte local3970 = Static55.aClass6_Sub15_Sub1_1.method3116();
														local1036 = false;
														if (local3970 == -128) {
															local1036 = true;
														}
														if (local1036) {
															if (Static88.anInt1654 == 0) {
																Static106.aClass186_44 = null;
																return true;
															}
															for (local770 = 0; Static88.anInt1654 > local770 && (!Static41.aClass85Array1[local770].aString17.equals(local247) || Static41.aClass85Array1[local770].anInt2011 != local563); local770++) {
															}
															if (local770 < Static88.anInt1654) {
																while (local770 < Static88.anInt1654 - 1) {
																	Static41.aClass85Array1[local770] = Static41.aClass85Array1[local770 + 1];
																	local770++;
																}
																Static88.anInt1654--;
																Static41.aClass85Array1[Static88.anInt1654] = null;
															}
														} else {
															local4056 = Static55.aClass6_Sub15_Sub1_1.method3093();
															local3654 = new Class85();
															local3654.aString15 = local705;
															local3654.aString17 = local247;
															local3654.aString16 = Static214.method3328(local3654.aString17);
															local3654.aByte20 = local3970;
															local3654.anInt2011 = local563;
															local3654.aString18 = local4056;
															for (local778 = Static88.anInt1654 - 1; local778 >= 0; local778--) {
																local273 = Static41.aClass85Array1[local778].aString16.compareTo(local3654.aString16);
																if (local273 == 0) {
																	Static41.aClass85Array1[local778].anInt2011 = local563;
																	Static41.aClass85Array1[local778].aByte20 = local3970;
																	Static41.aClass85Array1[local778].aString18 = local4056;
																	if (local247.equals(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48)) {
																		Static351.aByte82 = local3970;
																	}
																	Static106.aClass186_44 = null;
																	Static276.anInt4712 = Static323.anInt5265;
																	return true;
																}
																if (local273 < 0) {
																	break;
																}
															}
															if (Static41.aClass85Array1.length <= Static88.anInt1654) {
																Static106.aClass186_44 = null;
																return true;
															}
															for (local273 = Static88.anInt1654 - 1; local273 > local778; local273--) {
																Static41.aClass85Array1[local273 + 1] = Static41.aClass85Array1[local273];
															}
															if (Static88.anInt1654 == 0) {
																Static41.aClass85Array1 = new Class85[100];
															}
															Static41.aClass85Array1[local778 + 1] = local3654;
															Static88.anInt1654++;
															if (local247.equals(Static134.aClass3_Sub3_Sub6_Sub1_1.aString48)) {
																Static351.aByte82 = local3970;
															}
														}
														Static276.anInt4712 = Static323.anInt5265;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static319.aClass186_91 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local3952 = (local70 & 0x1) == 1;
														Static181.method2827(local216, local3952);
														local563 = Static55.aClass6_Sub15_Sub1_1.method3108();
														for (local758 = 0; local758 < local563; local758++) {
															local764 = Static55.aClass6_Sub15_Sub1_1.method3097();
															local770 = Static55.aClass6_Sub15_Sub1_1.method3110();
															if (local770 == 255) {
																local770 = Static55.aClass6_Sub15_Sub1_1.method3109();
															}
															Static225.method3415(local770, local758, local764 - 1, local216, local3952);
														}
														Static286.anIntArray432[Static10.anInt6501++ & 0x1F] = local216;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static259.aClass186_72 == Static106.aClass186_44) {
														Static206.method3219(Static188.aClass175_12);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static225.aClass186_61) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														if (Static101.method1688(local216)) {
															Static207.method3241();
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static439.aClass186_133) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3101();
														if (local216 == 65535) {
															local216 = -1;
														}
														local70 = Static55.aClass6_Sub15_Sub1_1.method3124();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3097();
														local563 = Static55.aClass6_Sub15_Sub1_1.method3109();
														local758 = Static55.aClass6_Sub15_Sub1_1.method3097();
														if (local758 == 65535) {
															local758 = -1;
														}
														if (Static101.method1688(local440)) {
															for (local764 = local758; local764 <= local216; local764++) {
																local2575 = ((long) local563 << 32) + ((long) local764);
																local2581 = (Class6_Sub30) Static345.aClass137_29.method3175(local2575);
																if (local2581 != null) {
																	local2593 = new Class6_Sub30(local70, local2581.anInt5763);
																	local2581.method5977();
																} else if (local764 == -1) {
																	local2593 = new Class6_Sub30(local70, Static299.method4387(local563).aClass6_Sub30_2.anInt5763);
																} else {
																	local2593 = new Class6_Sub30(local70, -1);
																}
																Static345.aClass137_29.method3179(local2575, local2593);
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static324.aClass186_93 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local3952 = (local70 & 0x1) == 1;
														while (Static337.anInt5664 > Static55.aClass6_Sub15_Sub1_1.anInt3487) {
															local563 = Static55.aClass6_Sub15_Sub1_1.method3090();
															local758 = Static55.aClass6_Sub15_Sub1_1.method3108();
															local764 = 0;
															if (local758 != 0) {
																local764 = Static55.aClass6_Sub15_Sub1_1.method3111();
																if (local764 == 255) {
																	local764 = Static55.aClass6_Sub15_Sub1_1.method3109();
																}
															}
															Static225.method3415(local764, local563, local758 - 1, local216, local3952);
														}
														Static286.anIntArray432[Static10.anInt6501++ & 0x1F] = local216;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static175.aClass186_50) {
														Static203.anInt3584 = Static55.aClass6_Sub15_Sub1_1.method3111();
														for (local216 = 0; local216 < Static203.anInt3584; local216++) {
															Static411.aStringArray46[local216] = Static55.aClass6_Sub15_Sub1_1.method3093();
															Static115.aStringArray15[local216] = Static55.aClass6_Sub15_Sub1_1.method3093();
															if (Static115.aStringArray15[local216].equals("")) {
																Static115.aStringArray15[local216] = Static411.aStringArray46[local216];
															}
															Static371.aStringArray43[local216] = Static55.aClass6_Sub15_Sub1_1.method3093();
															Static451.aStringArray44[local216] = Static55.aClass6_Sub15_Sub1_1.method3093();
															if (Static451.aStringArray44[local216].equals("")) {
																Static451.aStringArray44[local216] = Static371.aStringArray43[local216];
															}
															Static323.aBooleanArray22[local216] = false;
														}
														Static106.aClass186_44 = null;
														Static31.anInt507 = Static323.anInt5265;
														return true;
													} else if (Static106.aClass186_44 == Static274.aClass186_77) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3097();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3131();
														Static71.aClass126_1.method2810(local216, local70);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static412.aClass186_124) {
														if (Static93.aFrame1 != null) {
															Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
														}
														@Pc(4589) byte[] local4589 = new byte[Static337.anInt5664];
														Static55.aClass6_Sub15_Sub1_1.method2606(local4589, Static337.anInt5664);
														local247 = Static27.method357(Static337.anInt5664, local4589, 0);
														Static260.method4008(Static165.aClass103_3, true, Static155.anInt2774 == 1, local247);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static191.aClass186_54) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3111();
														if (Static55.aClass6_Sub15_Sub1_1.method3111() == 0) {
															Static400.aClass180Array1[local216] = new Class180();
														} else {
															Static55.aClass6_Sub15_Sub1_1.anInt3487--;
															Static400.aClass180Array1[local216] = new Class180(Static55.aClass6_Sub15_Sub1_1);
														}
														Static106.aClass186_44 = null;
														Static349.anInt5884 = Static323.anInt5265;
														return true;
													} else if (Static235.aClass186_66 == Static106.aClass186_44) {
														Static80.method1470();
														Static106.aClass186_44 = null;
														return false;
													} else if (Static106.aClass186_44 == Static83.aClass186_22) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3124();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
														local563 = Static55.aClass6_Sub15_Sub1_1.method3097();
														local758 = Static55.aClass6_Sub15_Sub1_1.method3101();
														if (Static101.method1688(local440)) {
															Static445.method5945(local70, local216, local758, local563);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static288.aClass186_82) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3092();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3101();
														if (local440 == 65535) {
															local440 = -1;
														}
														if (Static101.method1688(local70)) {
															Static209.method3259(local440, local216, 1, -1);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static439.aClass186_132 == Static106.aClass186_44) {
														Static163.method2666(Static55.aClass6_Sub15_Sub1_1, Static337.anInt5664);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static347.aClass186_106 == Static106.aClass186_44) {
														local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3101();
														if (Static101.method1688(local440)) {
															Static106.method2515(local705, local70);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static113.aClass186_28 == Static106.aClass186_44) {
														local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
														local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local249 = local247;
														if (local243) {
															local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
														}
														local259 = Static55.aClass6_Sub15_Sub1_1.method3119();
														local264 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local269 = Static55.aClass6_Sub15_Sub1_1.method3078();
														local273 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local1243 = Static55.aClass6_Sub15_Sub1_1.method3108();
														@Pc(4828) long local4828 = local269 + (local264 << 32);
														@Pc(4830) boolean local4830 = false;
														@Pc(4832) int local4832 = 0;
														while (true) {
															if (local4832 >= 100) {
																if (local273 <= 1 && Static250.method3853(local249)) {
																	local4830 = true;
																}
																break;
															}
															if (Static11.aLongArray1[local4832] == local4828) {
																local4830 = true;
																break;
															}
															local4832++;
														}
														if (!local4830 && Static3.anInt6324 == 0) {
															Static11.aLongArray1[Static375.anInt6235] = local4828;
															Static375.anInt6235 = (Static375.anInt6235 + 1) % 100;
															@Pc(4888) String local4888 = Static327.aClass129_2.method2908(local1243).method1436(Static55.aClass6_Sub15_Sub1_1);
															if (local273 == 2) {
																Static243.method3768(local4888, local1243, Static247.method3808(local259), "<img=1>" + local249, 0, 20, "<img=1>" + local247);
															} else if (local273 == 1) {
																Static243.method3768(local4888, local1243, Static247.method3808(local259), "<img=0>" + local249, 0, 20, "<img=0>" + local247);
															} else {
																Static243.method3768(local4888, local1243, Static247.method3808(local259), local249, 0, 20, local247);
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static235.aClass186_65) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
														@Pc(4978) Object[] local4978 = new Object[local247.length() + 1];
														for (local563 = local247.length() - 1; local563 >= 0; local563--) {
															if (local247.charAt(local563) == 's') {
																local4978[local563 + 1] = Static55.aClass6_Sub15_Sub1_1.method3093();
															} else {
																local4978[local563 + 1] = Integer.valueOf(Static55.aClass6_Sub15_Sub1_1.method3109());
															}
														}
														local4978[0] = Integer.valueOf(Static55.aClass6_Sub15_Sub1_1.method3109());
														if (Static101.method1688(local216)) {
															@Pc(5031) Class6_Sub29 local5031 = new Class6_Sub29();
															local5031.anObjectArray4 = local4978;
															Static308.method4424(local5031);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static128.aClass186_36 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3126();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3097();
														if (Static101.method1688(local70)) {
															Static349.method4947(local216, local440);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static109.aClass186_25 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3092();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
														if (Static101.method1688(local70)) {
															Static266.method4086(local440, local216);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static350.aClass186_107) {
														Static400.method5450();
														Static106.aClass186_44 = null;
														return false;
													} else if (Static89.aClass186_19 == Static106.aClass186_44) {
														Static206.method3219(Static322.aClass175_16);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static111.aClass186_26) {
														local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
														local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local249 = local247;
														if (local243) {
															local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
														}
														local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local758 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local1036 = false;
														if (local563 <= 1 && Static250.method3853(local249)) {
															local1036 = true;
														}
														if (!local1036 && Static3.anInt6324 == 0) {
															local4056 = Static327.aClass129_2.method2908(local758).method1436(Static55.aClass6_Sub15_Sub1_1);
															if (local563 == 2) {
																Static243.method3768(local4056, local758, null, "<img=1>" + local249, 0, 25, "<img=1>" + local247);
															} else if (local563 == 1) {
																Static243.method3768(local4056, local758, null, "<img=0>" + local249, 0, 25, "<img=0>" + local247);
															} else {
																Static243.method3768(local4056, local758, null, local249, 0, 25, local247);
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static400.aClass186_121 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3110();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local3952 = (local216 & 0x1) == 1;
														Static47.method5147(local70, local3952);
														Static286.anIntArray432[Static10.anInt6501++ & 0x1F] = local70;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static136.aClass186_38) {
														while (Static55.aClass6_Sub15_Sub1_1.anInt3487 < Static337.anInt5664) {
															local243 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
															local247 = Static55.aClass6_Sub15_Sub1_1.method3093();
															local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
															local563 = Static55.aClass6_Sub15_Sub1_1.method3108();
															local758 = Static55.aClass6_Sub15_Sub1_1.method3111();
															local599 = "";
															local3633 = false;
															if (local563 > 0) {
																local599 = Static55.aClass6_Sub15_Sub1_1.method3093();
																local3633 = Static55.aClass6_Sub15_Sub1_1.method3111() == 1;
															}
															for (local774 = 0; local774 < Static165.anInt2940; local774++) {
																if (local243) {
																	if (local249.equals(Static208.aStringArray24[local774])) {
																		Static208.aStringArray24[local774] = local247;
																		local247 = null;
																		Static76.aStringArray8[local774] = local249;
																		break;
																	}
																} else if (local247.equals(Static208.aStringArray24[local774])) {
																	if (local563 != Static262.anIntArray399[local774]) {
																		Static262.anIntArray399[local774] = local563;
																		if (local563 > 0) {
																			Static84.method1521(local247 + Static192.aClass231_55.method5138(Static382.anInt6289), 5, "", 0, "");
																		}
																		if (local563 == 0) {
																			Static84.method1521(local247 + Static126.aClass231_81.method5138(Static382.anInt6289), 5, "", 0, "");
																		}
																	}
																	Static76.aStringArray8[local774] = local249;
																	Static315.aStringArray28[local774] = local599;
																	Static85.anIntArray168[local774] = local758;
																	local247 = null;
																	Static381.aBooleanArray26[local774] = local3633;
																	break;
																}
															}
															if (local247 != null && Static165.anInt2940 < 200) {
																Static208.aStringArray24[Static165.anInt2940] = local247;
																Static76.aStringArray8[Static165.anInt2940] = local249;
																Static262.anIntArray399[Static165.anInt2940] = local563;
																Static315.aStringArray28[Static165.anInt2940] = local599;
																Static85.anIntArray168[Static165.anInt2940] = local758;
																Static381.aBooleanArray26[Static165.anInt2940] = local3633;
																Static165.anInt2940++;
															}
														}
														Static302.anInt4975 = 2;
														Static31.anInt507 = Static323.anInt5265;
														local70 = Static165.anInt2940;
														while (local70 > 0) {
															local243 = true;
															local70--;
															for (local440 = 0; local440 < local70; local440++) {
																if (Static53.anInt1053 != Static262.anIntArray399[local440] && Static262.anIntArray399[local440 + 1] == Static53.anInt1053 || Static262.anIntArray399[local440] == 0 && Static262.anIntArray399[local440 + 1] != 0) {
																	local563 = Static262.anIntArray399[local440];
																	Static262.anIntArray399[local440] = Static262.anIntArray399[local440 + 1];
																	Static262.anIntArray399[local440 + 1] = local563;
																	local1937 = Static315.aStringArray28[local440];
																	Static315.aStringArray28[local440] = Static315.aStringArray28[local440 + 1];
																	Static315.aStringArray28[local440 + 1] = local1937;
																	local599 = Static208.aStringArray24[local440];
																	Static208.aStringArray24[local440] = Static208.aStringArray24[local440 + 1];
																	Static208.aStringArray24[local440 + 1] = local599;
																	local4056 = Static76.aStringArray8[local440];
																	Static76.aStringArray8[local440] = Static76.aStringArray8[local440 + 1];
																	Static76.aStringArray8[local440 + 1] = local4056;
																	local774 = Static85.anIntArray168[local440];
																	Static85.anIntArray168[local440] = Static85.anIntArray168[local440 + 1];
																	Static85.anIntArray168[local440 + 1] = local774;
																	local1079 = Static381.aBooleanArray26[local440];
																	Static381.aBooleanArray26[local440] = Static381.aBooleanArray26[local440 + 1];
																	local243 = false;
																	Static381.aBooleanArray26[local440 + 1] = local1079;
																}
															}
															if (local243) {
																break;
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static102.aClass186_86 == Static106.aClass186_44) {
														Static206.method3219(Static373.aClass175_7);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static341.aClass186_103 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3111();
														@Pc(5670) boolean local5670 = (local216 & 0x1) == 1;
														local249 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local1935 = Static55.aClass6_Sub15_Sub1_1.method3093();
														if (local1935.equals("")) {
															local1935 = local249;
														}
														local1937 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local599 = Static55.aClass6_Sub15_Sub1_1.method3093();
														if (local599.equals("")) {
															local599 = local1937;
														}
														if (local5670) {
															for (local770 = 0; local770 < Static203.anInt3584; local770++) {
																if (Static115.aStringArray15[local770].equals(local599)) {
																	Static411.aStringArray46[local770] = local249;
																	Static115.aStringArray15[local770] = local1935;
																	Static371.aStringArray43[local770] = local1937;
																	Static451.aStringArray44[local770] = local599;
																	break;
																}
															}
														} else {
															Static411.aStringArray46[Static203.anInt3584] = local249;
															Static115.aStringArray15[Static203.anInt3584] = local1935;
															Static371.aStringArray43[Static203.anInt3584] = local1937;
															Static451.aStringArray44[Static203.anInt3584] = local599;
															Static323.aBooleanArray22[Static203.anInt3584] = (local216 & 0x2) == 2;
															Static203.anInt3584++;
														}
														Static106.aClass186_44 = null;
														Static31.anInt507 = Static323.anInt5265;
														return true;
													} else if (Static146.aClass186_42 == Static106.aClass186_44) {
														local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local249 = Static327.aClass129_2.method2908(local70).method1436(Static55.aClass6_Sub15_Sub1_1);
														Static243.method3768(local249, local70, null, local705, 0, 19, local705);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static317.aClass186_114 == Static106.aClass186_44) {
														local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3126();
														if (local70 == 65535) {
															local70 = -1;
														}
														local440 = Static55.aClass6_Sub15_Sub1_1.method3086();
														local563 = Static55.aClass6_Sub15_Sub1_1.method3086();
														if (local563 >= 1 && local563 <= 8) {
															if (local705.equalsIgnoreCase("null")) {
																local705 = null;
															}
															Static62.aStringArray6[local563 - 1] = local705;
															Static70.anIntArray154[local563 - 1] = local70;
															Static7.aBooleanArray1[local563 - 1] = local440 == 0;
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static140.aClass186_39) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3129();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3101();
														if (Static101.method1688(local70)) {
															Static209.method3259(-1, local216, 3, -1);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static211.aClass186_58) {
														Static416.anInt4774 = Static55.aClass6_Sub15_Sub1_1.method3104() << 3;
														Static412.anInt6899 = Static55.aClass6_Sub15_Sub1_1.method3086();
														Static30.anInt501 = Static55.aClass6_Sub15_Sub1_1.method3104() << 3;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static369.aClass186_113 == Static106.aClass186_44) {
														Static206.method3219(Static78.aClass175_5);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static175.aClass186_51) {
														local705 = Static55.aClass6_Sub15_Sub1_1.method3093();
														local247 = Static296.method4364(Static176.method2770(Static55.aClass6_Sub15_Sub1_1));
														Static84.method1521(local247, 6, local705, 0, local705);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static52.aClass186_14 == Static106.aClass186_44) {
														for (local216 = 0; local216 < Static355.aClass3_Sub3_Sub6_Sub1Array1.length; local216++) {
															if (Static355.aClass3_Sub3_Sub6_Sub1Array1[local216] != null) {
																Static355.aClass3_Sub3_Sub6_Sub1Array1[local216].anInt6713 = -1;
															}
														}
														for (local70 = 0; local70 < Static450.aClass3_Sub3_Sub6_Sub2Array1.length; local70++) {
															if (Static450.aClass3_Sub3_Sub6_Sub2Array1[local70] != null) {
																Static450.aClass3_Sub3_Sub6_Sub2Array1[local70].anInt6713 = -1;
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static338.aClass186_101) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3086();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3092();
														Static327.anIntArray487[local216] = local440;
														Static422.anIntArray605[local216] = local70;
														Static393.anIntArray496[local216] = 1;
														local563 = Static84.anIntArray167[local216] - 1;
														for (local758 = 0; local758 < local563; local758++) {
															if (Class6_Sub2_Sub22.anIntArray382[local758] <= local440) {
																Static393.anIntArray496[local216] = local758 + 2;
															}
														}
														Static45.anIntArray55[Static60.anInt1237++ & 0x1F] = local216;
														Static106.aClass186_44 = null;
														return true;
													} else if (Static35.aClass186_9 == Static106.aClass186_44) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3126();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3086();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3126();
														if (Static101.method1688(local440)) {
															if (local70 == 2) {
																Static387.method5338();
															}
															Static313.anInt5099 = local216;
															Static331.method4738(local216);
															Static219.method3376(false);
															Static308.method4423(Static313.anInt5099);
															for (local563 = 0; local563 < 100; local563++) {
																Static194.aBooleanArray25[local563] = true;
															}
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static163.aClass186_46 == Static106.aClass186_44) {
														Static55.aClass6_Sub15_Sub1_1.anInt3487 += 28;
														if (Static55.aClass6_Sub15_Sub1_1.method3088()) {
															Static200.method3171(Static55.aClass6_Sub15_Sub1_1, Static55.aClass6_Sub15_Sub1_1.anInt3487 - 28);
														}
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static41.aClass186_11) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														if (local216 == 65535) {
															local216 = -1;
														}
														local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
														Static91.method1567(local216, local440, local70, local563);
														Static106.aClass186_44 = null;
														return true;
													} else if (Static106.aClass186_44 == Static255.aClass186_71) {
														local216 = Static55.aClass6_Sub15_Sub1_1.method3108();
														local70 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local440 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local563 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local758 = Static55.aClass6_Sub15_Sub1_1.method3111();
														local764 = Static55.aClass6_Sub15_Sub1_1.method3108();
														if (Static101.method1688(local216)) {
															Static186.aBooleanArray16[local70] = true;
															Static275.anIntArray412[local70] = local440;
															Static428.anIntArray615[local70] = local563;
															Static408.anIntArray589[local70] = local758;
															Static260.anIntArray398[local70] = local764;
														}
														Static106.aClass186_44 = null;
														return true;
													} else {
														Static40.method799(null, "T1 - " + (Static106.aClass186_44 == null ? -1 : Static106.aClass186_44.method4264()) + "," + (Static314.aClass186_127 == null ? -1 : Static314.aClass186_127.method4264()) + "," + (Static325.aClass186_94 == null ? -1 : Static325.aClass186_94.method4264()) + " - " + Static337.anInt5664);
														Static44.method825();
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

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	public static void method4319() {
		Static145.method2423(Static8.aClass173_Sub1_1.anInt4418);
		@Pc(17) int local17 = (Static206.anInt3592 >> 3) + (Static32.anInt521 >> 10);
		@Pc(25) int local25 = (Static99.anInt1814 >> 3) + (Static214.anInt3730 >> 10);
		Static4.anInt30 = Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 = 0;
		Static134.aClass3_Sub3_Sub6_Sub1_1.method4691(8, 8);
		Static369.anIntArray540 = new int[18];
		Static58.anIntArrayArray8 = new int[18][4];
		Static27.aByteArrayArray5 = new byte[18][];
		Static53.anIntArray94 = new int[18];
		Static439.aByteArrayArray47 = new byte[18][];
		Static183.anIntArray518 = new int[18];
		Static247.anIntArray381 = new int[18];
		Static121.aByteArrayArray17 = new byte[18][];
		Static175.anIntArray282 = new int[18];
		Static100.anIntArray40 = new int[18];
		Static325.aByteArrayArray30 = new byte[18][];
		Static37.aByteArrayArray48 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(103) int local103;
		for (@Pc(84) int local84 = (local17 - (Static84.anInt1632 >> 4)) / 8; local84 <= (local17 + (Static84.anInt1632 >> 4)) / 8; local84++) {
			for (@Pc(95) int local95 = (local25 - (Static261.anInt4480 >> 4)) / 8; local95 <= (local25 + (Static261.anInt4480 >> 4)) / 8; local95++) {
				local103 = local95 + (local84 << 8);
				Static175.anIntArray282[local76] = local103;
				Static100.anIntArray40[local76] = Static118.aClass158_26.method3677("m" + local84 + "_" + local95);
				Static183.anIntArray518[local76] = Static118.aClass158_26.method3677("l" + local84 + "_" + local95);
				Static53.anIntArray94[local76] = Static118.aClass158_26.method3677("n" + local84 + "_" + local95);
				Static369.anIntArray540[local76] = Static118.aClass158_26.method3677("um" + local84 + "_" + local95);
				Static247.anIntArray381[local76] = Static118.aClass158_26.method3677("ul" + local84 + "_" + local95);
				if (Static53.anIntArray94[local76] == -1) {
					Static100.anIntArray40[local76] = -1;
					Static183.anIntArray518[local76] = -1;
					Static369.anIntArray540[local76] = -1;
					Static247.anIntArray381[local76] = -1;
				}
				local76++;
			}
		}
		for (local103 = local76; local103 < Static53.anIntArray94.length; local103++) {
			Static53.anIntArray94[local103] = -1;
			Static100.anIntArray40[local103] = -1;
			Static183.anIntArray518[local103] = -1;
			Static369.anIntArray540[local103] = -1;
			Static247.anIntArray381[local103] = -1;
		}
		Static358.method5049(false, local25, true, local17);
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	public static void method4323() {
		Static142.method2345();
	}
}
