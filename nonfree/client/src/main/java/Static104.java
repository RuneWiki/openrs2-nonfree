import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!sb;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public static int anInt2569 = 0;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!jf;")
	public static Class42 aClass42_10 = new Class42(32);

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1337 = Static28.method504("<col=ff9040>");

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1338 = null;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "[I")
	public static int[] anIntArray287 = new int[500];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ic;IIIII)V")
	public static void method1854(@OriginalArg(0) Class4_Sub2_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg3 * arg3 + arg2 * arg2;
		if (local12 <= 4225 || local12 >= 90000) {
			Static33.method550(arg3, arg0, arg4, arg1, arg2);
			return;
		}
		@Pc(40) int local40 = Static54.anInt1446 + Static45.anInt1164 & 0x7FF;
		@Pc(44) int local44 = Class4_Sub2_Sub3_Sub2.anIntArray155[local40];
		@Pc(52) int local52 = local44 * 256 / (Static105.anInt2051 + 256);
		@Pc(56) int local56 = Class4_Sub2_Sub3_Sub2.anIntArray152[local40];
		@Pc(64) int local64 = local56 * 256 / (Static105.anInt2051 + 256);
		@Pc(74) int local74 = arg2 * local52 - local64 * arg3 >> 16;
		@Pc(85) int local85 = arg2 * local64 + local52 * arg3 >> 16;
		@Pc(91) double local91 = Math.atan2((double) local85, (double) local74);
		@Pc(97) int local97 = (int) (Math.sin(local91) * 63.0D);
		@Pc(103) int local103 = (int) (Math.cos(local91) * 57.0D);
		Static113.aClass4_Sub2_Sub3_Sub1_8.method857(arg1 + local97 + 98 - 10, -local103 + 83 + arg4 - 20, local91);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lclient!we;Lclient!ka;I)V")
	public static void method1856(@OriginalArg(0) Class81[] arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static131.aByteArrayArrayArray7[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static131.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg0[local26].method2221(local11, local7);
						}
					}
				}
			}
		}
		Static48.anInt1260 += (int) (Math.random() * 5.0D) - 2;
		Static44.anInt1124 += (int) (Math.random() * 5.0D) - 2;
		if (Static48.anInt1260 < -16) {
			Static48.anInt1260 = -16;
		}
		if (Static48.anInt1260 > 16) {
			Static48.anInt1260 = 16;
		}
		if (Static44.anInt1124 < -8) {
			Static44.anInt1124 = -8;
		}
		if (Static44.anInt1124 > 8) {
			Static44.anInt1124 = 8;
		}
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(184) int local184;
		@Pc(164) int local164;
		@Pc(197) int local197;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(213) int local213;
		@Pc(230) int local230;
		@Pc(280) int local280;
		@Pc(514) int local514;
		@Pc(518) int local518;
		@Pc(654) int local654;
		@Pc(664) int local664;
		@Pc(682) int local682;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(126) byte[][] local126 = Static14.aByteArrayArrayArray1[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local136 = local26 * 768 >> 8;
			for (local138 = 1; local138 < 103; local138++) {
				for (local142 = 1; local142 < 103; local142++) {
					local164 = Static6.anIntArrayArrayArray1[local7][local142][local138 + 1] - Static6.anIntArrayArrayArray1[local7][local142][local138 - 1];
					local184 = Static6.anIntArrayArrayArray1[local7][local142 + 1][local138] - Static6.anIntArrayArrayArray1[local7][local142 - 1][local138];
					local197 = (int) Math.sqrt((double) (local164 * local164 + local184 * local184 + 65536));
					local203 = (local184 << 8) / local197;
					local207 = 65536 / local197;
					local213 = (local164 << 8) / local197;
					local230 = (local207 * -10 + local203 * -50 + local213 * -50) / local136 + 96;
					local280 = (local126[local142][local138 + 1] >> 3) + (local126[local142][local138 - 1] >> 2) + (local126[local142 + -1][local138] >> 2) + (local126[local142 - -1][local138] >> 3) + (local126[local142][local138] >> 1);
					Static69.anIntArrayArray13[local142][local138] = local230 - local280;
				}
			}
			for (local142 = 0; local142 < 104; local142++) {
				Static35.anIntArray100[local142] = 0;
				Static128.anIntArray362[local142] = 0;
				Static23.anIntArray66[local142] = 0;
				Static101.anIntArray281[local142] = 0;
				Static122.anIntArray324[local142] = 0;
			}
			for (local184 = -5; local184 < 109; local184++) {
				for (local164 = 0; local164 < 104; local164++) {
					local197 = local184 + 5;
					@Pc(408) int local408;
					if (local197 >= 0 && local197 < 104) {
						local203 = Static69.aByteArrayArrayArray5[local7][local197][local164] & 0xFF;
						if (local203 > 0) {
							@Pc(372) Class4_Sub2_Sub11 local372 = Static92.method469(local203 - 1);
							Static35.anIntArray100[local164] += local372.anInt1927;
							Static128.anIntArray362[local164] += local372.anInt1933;
							Static23.anIntArray66[local164] += local372.anInt1929;
							Static101.anIntArray281[local164] += local372.anInt1926;
							local408 = Static122.anIntArray324[local164]++;
						}
					}
					local203 = local184 - 5;
					if (local203 >= 0 && local203 < 104) {
						local207 = Static69.aByteArrayArrayArray5[local7][local203][local164] & 0xFF;
						if (local207 > 0) {
							@Pc(443) Class4_Sub2_Sub11 local443 = Static92.method469(local207 - 1);
							Static35.anIntArray100[local164] -= local443.anInt1927;
							Static128.anIntArray362[local164] -= local443.anInt1933;
							Static23.anIntArray66[local164] -= local443.anInt1929;
							Static101.anIntArray281[local164] -= local443.anInt1926;
							local408 = Static122.anIntArray324[local164]--;
						}
					}
				}
				if (local184 >= 1 && local184 < 103) {
					local197 = 0;
					local203 = 0;
					local207 = 0;
					local213 = 0;
					local230 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local514 = local280 + 5;
						local518 = local280 - 5;
						if (local514 >= 0 && local514 < 104) {
							local230 += Static122.anIntArray324[local514];
							local207 += Static23.anIntArray66[local514];
							local197 += Static35.anIntArray100[local514];
							local213 += Static101.anIntArray281[local514];
							local203 += Static128.anIntArray362[local514];
						}
						if (local518 >= 0 && local518 < 104) {
							local197 -= Static35.anIntArray100[local518];
							local203 -= Static128.anIntArray362[local518];
							local207 -= Static23.anIntArray66[local518];
							local230 -= Static122.anIntArray324[local518];
							local213 -= Static101.anIntArray281[local518];
						}
						if (local280 >= 1 && local280 < 103 && (!Static123.aBoolean150 || (Static131.aByteArrayArrayArray7[0][local184][local280] & 0x2) != 0 || (Static131.aByteArrayArrayArray7[local7][local184][local280] & 0x10) == 0 && Static15.method246(local184, local280, local7) == Static47.anInt1183)) {
							if (Static73.anInt1760 > local7) {
								Static73.anInt1760 = local7;
							}
							local654 = Static69.aByteArrayArrayArray5[local7][local184][local280] & 0xFF;
							local664 = Static47.aByteArrayArrayArray3[local7][local184][local280] & 0xFF;
							if (local654 > 0 || local664 > 0) {
								local682 = Static6.anIntArrayArrayArray1[local7][local184][local280];
								@Pc(692) int local692 = Static6.anIntArrayArrayArray1[local7][local184 + 1][local280];
								@Pc(704) int local704 = Static6.anIntArrayArrayArray1[local7][local184 + 1][local280 + 1];
								@Pc(714) int local714 = Static6.anIntArrayArrayArray1[local7][local184][local280 + 1];
								@Pc(720) int local720 = Static69.anIntArrayArray13[local184][local280];
								@Pc(728) int local728 = Static69.anIntArrayArray13[local184 + 1][local280];
								@Pc(738) int local738 = Static69.anIntArrayArray13[local184 + 1][local280 + 1];
								@Pc(746) int local746 = Static69.anIntArrayArray13[local184][local280 + 1];
								@Pc(748) int local748 = -1;
								@Pc(750) int local750 = -1;
								@Pc(765) int local765;
								@Pc(759) int local759;
								if (local654 > 0) {
									local759 = local203 / local230;
									local765 = local197 * 256 / local213;
									@Pc(769) int local769 = local207 / local230;
									local748 = Static97.method1792(local759, local769, local765);
									local769 += Static48.anInt1260;
									if (local769 < 0) {
										local769 = 0;
									} else if (local769 > 255) {
										local769 = 255;
									}
									local765 = Static44.anInt1124 + local765 & 0xFF;
									local750 = Static97.method1792(local759, local769, local765);
								}
								if (local7 > 0) {
									@Pc(811) boolean local811 = true;
									if (local654 == 0 && Static65.aByteArrayArrayArray4[local7][local184][local280] != 0) {
										local811 = false;
									}
									if (local664 > 0 && !Static25.method2197(local664 - 1).aBoolean110) {
										local811 = false;
									}
									if (local811 && local692 == local682 && local682 == local704 && local682 == local714) {
										Static72.anIntArrayArrayArray4[local7][local184][local280] |= 0x924;
									}
								}
								local765 = 0;
								if (local750 != -1) {
									local765 = Static57.anIntArray157[Static83.method1497(96, local750)];
								}
								if (local664 == 0) {
									arg1.method1115(local7, local184, local280, 0, 0, -1, local682, local692, local704, local714, Static83.method1497(local720, local748), Static83.method1497(local728, local748), Static83.method1497(local738, local748), Static83.method1497(local746, local748), 0, 0, 0, 0, local765, 0);
								} else {
									local759 = Static65.aByteArrayArrayArray4[local7][local184][local280] + 1;
									@Pc(946) byte local946 = Static30.aByteArrayArrayArray2[local7][local184][local280];
									@Pc(952) Class4_Sub2_Sub12 local952 = Static25.method2197(local664 - 1);
									@Pc(955) int local955 = local952.anInt2188;
									@Pc(966) int local966;
									@Pc(968) int local968;
									@Pc(988) int local988;
									@Pc(993) int local993;
									if (local955 >= 0) {
										local966 = -1;
										local968 = Static57.anInterface1_1.method219(local955);
									} else if (local952.anInt2203 == 16711935) {
										local966 = -2;
										local968 = -2;
										local955 = -1;
									} else {
										local966 = Static97.method1792(local952.anInt2189, local952.anInt2197, local952.anInt2200);
										local988 = local952.anInt2200 + Static44.anInt1124 & 0xFF;
										local993 = local952.anInt2197 + Static48.anInt1260;
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										local968 = Static97.method1792(local952.anInt2189, local993, local988);
									}
									local988 = 0;
									if (local968 != -2) {
										local988 = Static57.anIntArray157[Static16.method256(local968, 96)];
									}
									if (local952.anInt2195 != -1) {
										local993 = Static44.anInt1124 + local952.anInt2196 & 0xFF;
										@Pc(1054) int local1054 = Static48.anInt1260 + local952.anInt2201;
										if (local1054 < 0) {
											local1054 = 0;
										} else if (local1054 > 255) {
											local1054 = 255;
										}
										local968 = Static97.method1792(local952.anInt2191, local1054, local993);
										local988 = Static57.anIntArray157[Static16.method256(local968, 96)];
									}
									arg1.method1115(local7, local184, local280, local759, local946, local955, local682, local692, local704, local714, Static83.method1497(local720, local748), Static83.method1497(local728, local748), Static83.method1497(local738, local748), Static83.method1497(local746, local748), Static16.method256(local966, local720), Static16.method256(local966, local728), Static16.method256(local966, local738), Static16.method256(local966, local746), local765, local988);
								}
							}
						}
					}
				}
			}
			for (local164 = 1; local164 < 103; local164++) {
				for (local197 = 1; local197 < 103; local197++) {
					arg1.method1116(local7, local197, local164, Static15.method246(local197, local164, local7));
				}
			}
			Static69.aByteArrayArrayArray5[local7] = null;
			Static47.aByteArrayArrayArray3[local7] = null;
			Static65.aByteArrayArrayArray4[local7] = null;
			Static30.aByteArrayArrayArray2[local7] = null;
			Static14.aByteArrayArrayArray1[local7] = null;
		}
		arg1.method1097();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static131.aByteArrayArrayArray7[1][local11][local26] & 0x2) == 2) {
					arg1.method1072(local11, local26);
				}
			}
		}
		local26 = 1;
		local136 = 2;
		local138 = 4;
		for (local142 = 0; local142 < 4; local142++) {
			if (local142 > 0) {
				local26 <<= 0x3;
				local138 <<= 0x3;
				local136 <<= 0x3;
			}
			for (local184 = 0; local184 <= local142; local184++) {
				for (local164 = 0; local164 <= 104; local164++) {
					for (local197 = 0; local197 <= 104; local197++) {
						if ((local26 & Static72.anIntArrayArrayArray4[local184][local197][local164]) != 0) {
							for (local203 = local164; local203 > 0 && (Static72.anIntArrayArrayArray4[local184][local197][local203 - 1] & local26) != 0; local203--) {
							}
							local207 = local164;
							local230 = local184;
							local213 = local184;
							while (local207 < 104 && (Static72.anIntArrayArrayArray4[local184][local197][local207 + 1] & local26) != 0) {
								local207++;
							}
							label347: while (local213 > 0) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((Static72.anIntArrayArrayArray4[local213 - 1][local197][local280] & local26) == 0) {
										break label347;
									}
								}
								local213--;
							}
							label336: while (local230 < local142) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((Static72.anIntArrayArrayArray4[local230 + 1][local197][local280] & local26) == 0) {
										break label336;
									}
								}
								local230++;
							}
							local280 = (local207 + 1 - local203) * (local230 + 1 - local213);
							if (local280 >= 8) {
								local654 = Static6.anIntArrayArrayArray1[local213][local197][local203];
								local518 = Static6.anIntArrayArrayArray1[local230][local197][local203] - 240;
								Static61.method1074(local142, 1, local197 * 128, local197 * 128, local203 * 128, local207 * 128 + 128, local518, local654);
								for (local664 = local213; local664 <= local230; local664++) {
									for (local682 = local203; local682 <= local207; local682++) {
										Static72.anIntArrayArrayArray4[local664][local197][local682] &= ~local26;
									}
								}
							}
						}
						if ((Static72.anIntArrayArrayArray4[local184][local197][local164] & local136) != 0) {
							for (local203 = local197; local203 > 0 && (local136 & Static72.anIntArrayArrayArray4[local184][local203 - 1][local164]) != 0; local203--) {
							}
							local207 = local197;
							local230 = local184;
							local213 = local184;
							while (local207 < 104 && (local136 & Static72.anIntArrayArrayArray4[local184][local207 + 1][local164]) != 0) {
								local207++;
							}
							label401: while (local213 > 0) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((local136 & Static72.anIntArrayArrayArray4[local213 - 1][local280][local164]) == 0) {
										break label401;
									}
								}
								local213--;
							}
							label390: while (local230 < local142) {
								for (local280 = local203; local280 <= local207; local280++) {
									if ((local136 & Static72.anIntArrayArrayArray4[local230 + 1][local280][local164]) == 0) {
										break label390;
									}
								}
								local230++;
							}
							local280 = (local230 + 1 - local213) * (local207 + 1 - local203);
							if (local280 >= 8) {
								local518 = Static6.anIntArrayArrayArray1[local230][local203][local164] - 240;
								local654 = Static6.anIntArrayArrayArray1[local213][local203][local164];
								Static61.method1074(local142, 2, local203 * 128, local207 * 128 + 128, local164 * 128, local164 * 128, local518, local654);
								for (local664 = local213; local664 <= local230; local664++) {
									for (local682 = local203; local682 <= local207; local682++) {
										Static72.anIntArrayArrayArray4[local664][local682][local164] &= ~local136;
									}
								}
							}
						}
						if ((local138 & Static72.anIntArrayArrayArray4[local184][local197][local164]) != 0) {
							local207 = local197;
							local230 = local164;
							local203 = local197;
							for (local213 = local164; local213 > 0 && (local138 & Static72.anIntArrayArrayArray4[local184][local197][local213 - 1]) != 0; local213--) {
							}
							while (local230 < 104 && (Static72.anIntArrayArrayArray4[local184][local197][local230 + 1] & local138) != 0) {
								local230++;
							}
							label455: while (local203 > 0) {
								for (local280 = local213; local280 <= local230; local280++) {
									if ((local138 & Static72.anIntArrayArrayArray4[local184][local203 - 1][local280]) == 0) {
										break label455;
									}
								}
								local203--;
							}
							label444: while (local207 < 104) {
								for (local280 = local213; local280 <= local230; local280++) {
									if ((Static72.anIntArrayArrayArray4[local184][local207 + 1][local280] & local138) == 0) {
										break label444;
									}
								}
								local207++;
							}
							if ((local230 + 1 - local213) * (-local203 + 1 + local207) >= 4) {
								local280 = Static6.anIntArrayArrayArray1[local184][local203][local213];
								Static61.method1074(local142, 4, local203 * 128, local207 * 128 + 128, local213 * 128, local230 * 128 + 128, local280, local280);
								for (local514 = local203; local514 <= local207; local514++) {
									for (local518 = local213; local518 <= local230; local518++) {
										Static72.anIntArrayArrayArray4[local184][local514][local518] &= ~local138;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method1857(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray27;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class4_Sub2_Sub7 local18 = Static36.method596(local14);
		if (local18 == null) {
			return;
		}
		Static11.anInt337 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray117;
		@Pc(35) int[] local35 = local18.anIntArray116;
		@Pc(47) byte local47 = -1;
		@Pc(61) int local61;
		@Pc(74) int local74;
		try {
			Static103.aClass39Array19 = new Class39[local18.anInt1056];
			Static13.anIntArray47 = new int[local18.anInt1058];
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			for (local61 = 1; local61 < local8.length; local61++) {
				if (local8[local61] instanceof Integer) {
					local74 = (Integer) local8[local61];
					if (local74 == -2147483647) {
						local74 = arg0.anInt2343;
					}
					if (local74 == -2147483646) {
						local74 = arg0.anInt2342;
					}
					if (local74 == -2147483645) {
						local74 = arg0.aClass4_Sub5_51 == null ? -1 : arg0.aClass4_Sub5_51.anInt1230;
					}
					if (local74 == -2147483644) {
						local74 = arg0.anInt2341;
					}
					if (local74 == -2147483643) {
						local74 = arg0.aClass4_Sub5_51 == null ? -1 : arg0.aClass4_Sub5_51.anInt1212;
					}
					if (local74 == -2147483642) {
						local74 = arg0.aClass4_Sub5_50 == null ? -1 : arg0.aClass4_Sub5_50.anInt1230;
					}
					if (local74 == -2147483641) {
						local74 = arg0.aClass4_Sub5_50 == null ? -1 : arg0.aClass4_Sub5_50.anInt1212;
					}
					if (local74 == -2147483640) {
						local74 = arg0.anInt2338;
					}
					if (local74 == -2147483639) {
						local74 = arg0.anInt2337;
					}
					Static13.anIntArray47[local59++] = local74;
				} else if (local8[local61] instanceof Class39) {
					@Pc(179) Class39 local179 = (Class39) local8[local61];
					if (local179.method968(Static53.aClass39_790)) {
						local179 = arg0.aClass39_1208;
					}
					Static103.aClass39Array19[local57++] = local179;
				}
			}
			local74 = 0;
			label1946: while (true) {
				local74++;
				if (local74 > 200000) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(219) int local219 = local32[local29];
				@Pc(766) int local766;
				@Pc(618) int local618;
				@Pc(638) int local638;
				@Pc(761) int local761;
				@Pc(574) Class39 local574;
				if (local219 < 100) {
					if (local219 == 0) {
						Static74.anIntArray196[local25++] = local35[local29];
						continue;
					}
					@Pc(243) int local243;
					if (local219 == 1) {
						local243 = local35[local29];
						Static74.anIntArray196[local25++] = Static22.anIntArray64[local243];
						continue;
					}
					if (local219 == 2) {
						local243 = local35[local29];
						local25--;
						Static22.anIntArray64[local243] = Static74.anIntArray196[local25];
						continue;
					}
					if (local219 == 3) {
						Static87.aClass39Array16[local27++] = local18.aClass39Array7[local29];
						continue;
					}
					if (local219 == 6) {
						local29 += local35[local29];
						continue;
					}
					if (local219 == 7) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] != Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 8) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] == Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 9) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] > Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 10) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] < Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 21) {
						if (Static11.anInt337 == 0) {
							return;
						}
						@Pc(403) Class24 local403 = Static129.aClass24Array1[--Static11.anInt337];
						Static103.aClass39Array19 = local403.aClass39Array4;
						local18 = local403.aClass4_Sub2_Sub7_1;
						Static13.anIntArray47 = local403.anIntArray92;
						local29 = local403.anInt829;
						local32 = local18.anIntArray117;
						local35 = local18.anIntArray116;
						continue;
					}
					if (local219 == 25) {
						local243 = local35[local29];
						Static74.anIntArray196[local25++] = Static3.method15(local243);
						continue;
					}
					if (local219 == 27) {
						local243 = local35[local29];
						local25--;
						Static3.method19(Static74.anIntArray196[local25], local243);
						continue;
					}
					if (local219 == 31) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] >= Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 32) {
						local25 -= 2;
						if (Static74.anIntArray196[local25 + 1] <= Static74.anIntArray196[local25]) {
							local29 += local35[local29];
						}
						continue;
					}
					if (local219 == 33) {
						Static74.anIntArray196[local25++] = Static13.anIntArray47[local35[local29]];
						continue;
					}
					@Pc(522) int local522;
					if (local219 == 34) {
						local522 = local35[local29];
						local25--;
						Static13.anIntArray47[local522] = Static74.anIntArray196[local25];
						continue;
					}
					if (local219 == 35) {
						Static87.aClass39Array16[local27++] = Static103.aClass39Array19[local35[local29]];
						continue;
					}
					if (local219 == 36) {
						local522 = local35[local29];
						local27--;
						Static103.aClass39Array19[local522] = Static87.aClass39Array16[local27];
						continue;
					}
					if (local219 == 37) {
						local243 = local35[local29];
						local27 -= local243;
						local574 = Static42.method706(local243, local27, Static87.aClass39Array16);
						Static87.aClass39Array16[local27++] = local574;
						continue;
					}
					if (local219 == 38) {
						local25--;
						continue;
					}
					if (local219 == 39) {
						local27--;
						continue;
					}
					if (local219 == 40) {
						local243 = local35[local29];
						@Pc(608) Class4_Sub2_Sub7 local608 = Static36.method596(local243);
						@Pc(612) int[] local612 = new int[local608.anInt1058];
						@Pc(616) Class39[] local616 = new Class39[local608.anInt1056];
						for (local618 = 0; local618 < local608.anInt1057; local618++) {
							local612[local618] = Static74.anIntArray196[local618 + local25 - local608.anInt1057];
						}
						for (local638 = 0; local638 < local608.anInt1063; local638++) {
							local616[local638] = Static87.aClass39Array16[local27 + local638 - local608.anInt1063];
						}
						local27 -= local608.anInt1063;
						local25 -= local608.anInt1057;
						@Pc(676) Class24 local676 = new Class24();
						local676.aClass39Array4 = Static103.aClass39Array19;
						local676.anInt829 = local29;
						local676.aClass4_Sub2_Sub7_1 = local18;
						local18 = local608;
						local676.anIntArray92 = Static13.anIntArray47;
						Static129.aClass24Array1[Static11.anInt337++] = local676;
						local32 = local608.anIntArray117;
						Static103.aClass39Array19 = local616;
						local29 = -1;
						local35 = local608.anIntArray116;
						Static13.anIntArray47 = local612;
						continue;
					}
					if (local219 == 42) {
						Static74.anIntArray196[local25++] = Static118.anIntArray317[local35[local29]];
						continue;
					}
					if (local219 == 43) {
						local522 = local35[local29];
						local25--;
						Static118.anIntArray317[local522] = Static74.anIntArray196[local25];
						continue;
					}
					if (local219 == 44) {
						local243 = local35[local29] >> 16;
						local761 = local35[local29] & 0xFFFF;
						local25--;
						local766 = Static74.anIntArray196[local25];
						if (local766 >= 0 && local766 <= 5000) {
							Static11.anIntArray37[local243] = local766;
							@Pc(784) byte local784 = -1;
							if (local761 == 105) {
								local784 = 0;
							}
							local618 = 0;
							while (true) {
								if (local618 >= local766) {
									continue label1946;
								}
								Static113.anIntArrayArray23[local243][local618] = local784;
								local618++;
							}
						}
						throw new RuntimeException();
					}
					if (local219 == 45) {
						local243 = local35[local29];
						local25--;
						local761 = Static74.anIntArray196[local25];
						if (local761 >= 0 && local761 < Static11.anIntArray37[local243]) {
							Static74.anIntArray196[local25++] = Static113.anIntArrayArray23[local243][local761];
							continue;
						}
						throw new RuntimeException();
					}
					if (local219 == 46) {
						local25 -= 2;
						local243 = local35[local29];
						local761 = Static74.anIntArray196[local25];
						if (local761 >= 0 && Static11.anIntArray37[local243] > local761) {
							Static113.anIntArrayArray23[local243][local761] = Static74.anIntArray196[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local219 == 47) {
						@Pc(893) Class39 local893 = Static71.aClass39Array13[local35[local29]];
						if (local893 == null) {
							local893 = Static115.aClass39_1510;
						}
						Static87.aClass39Array16[local27++] = local893;
						continue;
					}
					if (local219 == 48) {
						local522 = local35[local29];
						local27--;
						Static71.aClass39Array13[local522] = Static87.aClass39Array16[local27];
						continue;
					}
				}
				@Pc(927) boolean local927;
				if (local35[local29] == 1) {
					local927 = true;
				} else {
					local927 = false;
				}
				@Pc(1077) Class4_Sub5 local1077;
				@Pc(1134) Class4_Sub5 local1134;
				@Pc(964) Class4_Sub5 local964;
				@Pc(985) int local985;
				@Pc(954) int local954;
				if (local219 < 1000) {
					if (local219 == 100) {
						local25 -= 3;
						local761 = Static74.anIntArray196[local25];
						local766 = Static74.anIntArray196[local25 + 1];
						local954 = Static74.anIntArray196[local25 + 2];
						if (local766 == 0) {
							throw new RuntimeException();
						}
						local964 = Static54.method949(local761);
						if (local964.aClass4_Sub5Array1 == null) {
							local964.aClass4_Sub5Array1 = new Class4_Sub5[local954 + 1];
						}
						if (local964.aClass4_Sub5Array1.length <= local954) {
							@Pc(983) Class4_Sub5[] local983 = new Class4_Sub5[local954 + 1];
							for (local985 = 0; local985 < local964.aClass4_Sub5Array1.length; local985++) {
								local983[local985] = local964.aClass4_Sub5Array1[local985];
							}
							local964.aClass4_Sub5Array1 = local983;
						}
						if (local954 > 0 && local964.aClass4_Sub5Array1[local954 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local954 - 1));
						}
						@Pc(1032) Class4_Sub5 local1032 = new Class4_Sub5();
						local1032.anInt1225 = local766;
						local1032.anInt1212 = local954;
						local1032.aBoolean63 = true;
						local1032.anInt1199 = local1032.anInt1230 = local964.anInt1230;
						local964.aClass4_Sub5Array1[local954] = local1032;
						if (local927) {
							Static25.aClass4_Sub5_73 = local1032;
						} else {
							Static64.aClass4_Sub5_37 = local1032;
						}
						Static19.method344(local964);
						continue;
					}
					if (local219 == 101) {
						local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
						@Pc(1082) Class4_Sub5 local1082 = Static54.method949(local1077.anInt1230);
						local1082.aClass4_Sub5Array1[local1077.anInt1212] = null;
						Static19.method344(local1082);
						continue;
					}
					if (local219 == 102) {
						local25--;
						local1077 = Static54.method949(Static74.anIntArray196[local25]);
						local1077.aClass4_Sub5Array1 = null;
						Static19.method344(local1077);
						continue;
					}
					if (local219 == 200) {
						local25 -= 2;
						local761 = Static74.anIntArray196[local25];
						local766 = Static74.anIntArray196[local25 + 1];
						local1134 = Static59.method1051(local766, local761);
						if (local1134 != null && local766 != -1) {
							Static74.anIntArray196[local25++] = 1;
							if (local927) {
								Static25.aClass4_Sub5_73 = local1134;
							} else {
								Static64.aClass4_Sub5_37 = local1134;
							}
							continue;
						}
						Static74.anIntArray196[local25++] = 0;
						continue;
					}
				} else if (local219 >= 1000 && local219 < 1100 || local219 >= 2000 && local219 < 2100) {
					if (local219 < 2000) {
						local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
					} else {
						local219 -= 1000;
						local25--;
						local1077 = Static54.method949(Static74.anIntArray196[local25]);
					}
					if (local219 == 1000) {
						local25 -= 2;
						local1077.anInt1245 = Static74.anIntArray196[local25];
						local1077.anInt1201 = Static74.anIntArray196[local25 + 1];
						Static19.method344(local1077);
						continue;
					}
					if (local219 == 1001) {
						local25 -= 2;
						local1077.anInt1244 = Static74.anIntArray196[local25];
						local1077.anInt1259 = Static74.anIntArray196[local25 + 1];
						Static19.method344(local1077);
						continue;
					}
					if (local219 == 1003) {
						local25--;
						@Pc(1251) boolean local1251 = Static74.anIntArray196[local25] == 1;
						if (local1077.aBoolean56 != local1251) {
							local1077.aBoolean56 = local1251;
							Static19.method344(local1077);
						}
						continue;
					}
				} else {
					@Pc(1630) Class39 local1630;
					if (local219 >= 1100 && local219 < 1200 || !(local219 < 2100 || local219 >= 2200)) {
						if (local219 < 2000) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
						} else {
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
							local219 -= 1000;
						}
						if (local219 == 1100) {
							local25 -= 2;
							local1077.anInt1237 = Static74.anIntArray196[local25];
							if (local1077.anInt1237 > local1077.anInt1223 - local1077.anInt1244) {
								local1077.anInt1237 = local1077.anInt1223 - local1077.anInt1244;
							}
							if (local1077.anInt1237 < 0) {
								local1077.anInt1237 = 0;
							}
							local1077.anInt1214 = Static74.anIntArray196[local25 + 1];
							if (local1077.anInt1214 > local1077.anInt1251 - local1077.anInt1259) {
								local1077.anInt1214 = local1077.anInt1251 - local1077.anInt1259;
							}
							if (local1077.anInt1214 < 0) {
								local1077.anInt1214 = 0;
							}
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1101) {
							local25--;
							local1077.anInt1211 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1102) {
							local25--;
							local1077.aBoolean62 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1103) {
							local25--;
							local1077.anInt1205 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1104) {
							local25--;
							local1077.anInt1253 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1105) {
							local25--;
							local1077.anInt1247 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1106) {
							local25--;
							local1077.anInt1229 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1107) {
							local25--;
							local1077.aBoolean55 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1108) {
							local1077.anInt1200 = 1;
							local25--;
							local1077.anInt1248 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1109) {
							local25 -= 6;
							local1077.anInt1243 = Static74.anIntArray196[local25];
							local1077.anInt1213 = Static74.anIntArray196[local25 + 1];
							local1077.anInt1217 = Static74.anIntArray196[local25 + 2];
							local1077.anInt1227 = Static74.anIntArray196[local25 + 3];
							local1077.anInt1216 = Static74.anIntArray196[local25 + 4];
							local1077.anInt1242 = Static74.anIntArray196[local25 + 5];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1110) {
							local25--;
							local766 = Static74.anIntArray196[local25];
							if (local1077.anInt1206 != local766) {
								local1077.anInt1226 = 0;
								local1077.anInt1261 = 0;
								local1077.anInt1206 = local766;
								Static19.method344(local1077);
							}
							continue;
						}
						if (local219 == 1111) {
							local25--;
							local1077.aBoolean61 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1112) {
							local27--;
							local1630 = Static87.aClass39Array16[local27];
							if (!local1630.method968(local1077.aClass39_722)) {
								local1077.aClass39_722 = local1630;
								Static19.method344(local1077);
							}
							continue;
						}
						if (local219 == 1113) {
							local25--;
							local1077.anInt1202 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1114) {
							local25 -= 3;
							local1077.anInt1240 = Static74.anIntArray196[local25];
							local1077.anInt1238 = Static74.anIntArray196[local25 + 1];
							local1077.anInt1197 = Static74.anIntArray196[local25 + 2];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1115) {
							local25--;
							local1077.aBoolean57 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1116) {
							local25--;
							local1077.anInt1256 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1117) {
							local25--;
							local1077.anInt1270 = Static74.anIntArray196[local25];
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1118) {
							local25--;
							local1077.aBoolean60 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1119) {
							local25--;
							local1077.aBoolean59 = Static74.anIntArray196[local25] == 1;
							Static19.method344(local1077);
							continue;
						}
						if (local219 == 1120) {
							local25 -= 2;
							local1077.anInt1223 = Static74.anIntArray196[local25];
							local1077.anInt1251 = Static74.anIntArray196[local25 + 1];
							Static19.method344(local1077);
							continue;
						}
					} else if (local219 >= 1200 && local219 < 1300 || local219 >= 2200 && local219 < 2300) {
						if (local219 < 2000) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
						} else {
							local219 -= 1000;
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
						}
						Static19.method344(local1077);
						if (local219 == 1200) {
							local25 -= 2;
							local954 = Static74.anIntArray196[local25 + 1];
							local766 = Static74.anIntArray196[local25];
							local1077.anInt1219 = local954;
							local1077.anInt1208 = local766;
							@Pc(1858) Class4_Sub2_Sub5 local1858 = Static119.method2166(local766);
							local1077.anInt1227 = local1858.anInt604;
							local1077.anInt1242 = local1858.anInt632;
							local1077.anInt1213 = local1858.anInt630;
							if (local1077.anInt1244 > 0) {
								local1077.anInt1242 = local1077.anInt1242 * 32 / local1077.anInt1244;
							}
							local1077.anInt1243 = local1858.anInt599;
							local1077.anInt1217 = local1858.anInt610;
							local1077.anInt1216 = local1858.anInt612;
							continue;
						}
						if (local219 == 1201) {
							local1077.anInt1200 = 2;
							local25--;
							local1077.anInt1248 = Static74.anIntArray196[local25];
							continue;
						}
						if (local219 == 1202) {
							local1077.anInt1200 = 3;
							local1077.anInt1248 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2.method1696();
							continue;
						}
					} else if (local219 >= 1300 && local219 < 1400 || local219 >= 2300 && local219 < 2400) {
						if (local219 < 2000) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
						} else {
							local219 -= 1000;
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
						}
						if (local219 == 1300) {
							local25--;
							local766 = Static74.anIntArray196[local25] - 1;
							if (local766 >= 0 && local766 <= 9) {
								local27--;
								local1077.method787(Static87.aClass39Array16[local27], local766);
								continue;
							}
							local27--;
							continue;
						}
						if (local219 == 1301) {
							local25 -= 2;
							local954 = Static74.anIntArray196[local25 + 1];
							local766 = Static74.anIntArray196[local25];
							local1077.aClass4_Sub5_27 = Static59.method1051(local954, local766);
							continue;
						}
						if (local219 == 1302) {
							local25--;
							local1077.aBoolean58 = Static74.anIntArray196[local25] == 1;
							continue;
						}
						if (local219 == 1303) {
							local25--;
							local1077.anInt1215 = Static74.anIntArray196[local25];
							continue;
						}
						if (local219 == 1304) {
							local25--;
							local1077.anInt1264 = Static74.anIntArray196[local25];
							continue;
						}
						if (local219 == 1305) {
							local27--;
							local1077.aClass39_721 = Static87.aClass39Array16[local27];
							continue;
						}
						if (local219 == 1306) {
							local27--;
							local1077.aClass39_719 = Static87.aClass39Array16[local27];
							continue;
						}
						if (local219 == 1307) {
							local1077.aClass39Array9 = null;
							continue;
						}
					} else {
						if (local219 >= 1400 && local219 < 1500 || local219 >= 2400 && local219 < 2500) {
							@Pc(2118) int[] local2118 = null;
							if (local219 >= 2000) {
								local219 -= 1000;
								local25--;
								local1077 = Static54.method949(Static74.anIntArray196[local25]);
							} else {
								local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
							}
							local27--;
							local1630 = Static87.aClass39Array16[local27];
							if (local1630.method953() > 0 && local1630.method939(local1630.method953() - 1) == 89) {
								local25--;
								local618 = Static74.anIntArray196[local25];
								if (local618 > 0) {
									local2118 = new int[local618];
									while (local618-- > 0) {
										local25--;
										local2118[local618] = Static74.anIntArray196[local25];
									}
								}
								local1630 = local1630.method938(local1630.method953() - 1, 0);
							}
							@Pc(2205) Object[] local2205 = new Object[local1630.method953() + 1];
							for (local638 = local2205.length - 1; local638 >= 1; local638--) {
								if (local1630.method939(local638 - 1) == 115) {
									local27--;
									local2205[local638] = Static87.aClass39Array16[local27];
								} else {
									local25--;
									local2205[local638] = Integer.valueOf(Static74.anIntArray196[local25]);
								}
							}
							local25--;
							local985 = Static74.anIntArray196[local25];
							if (local985 == -1) {
								local2205 = null;
							} else {
								local2205[0] = Integer.valueOf(local985);
							}
							if (local219 == 1418) {
								local1077.anObjectArray19 = local2205;
							}
							if (local219 == 1423) {
								local1077.anObjectArray25 = local2205;
							}
							if (local219 == 1401) {
								local1077.anObjectArray20 = local2205;
							}
							if (local219 == 1421) {
								local1077.anObjectArray23 = local2205;
							}
							if (local219 == 1410) {
								local1077.anObjectArray9 = local2205;
							}
							if (local219 == 1414) {
								local1077.anIntArray131 = local2118;
								local1077.anObjectArray4 = local2205;
							}
							if (local219 == 1422) {
								local1077.anObjectArray3 = local2205;
							}
							if (local219 == 1403) {
								local1077.anObjectArray15 = local2205;
							}
							if (local219 == 1419) {
								local1077.anObjectArray13 = local2205;
							}
							if (local219 == 1416) {
								local1077.anObjectArray18 = local2205;
							}
							if (local219 == 1408) {
								local1077.anObjectArray8 = local2205;
							}
							local1077.aBoolean64 = true;
							if (local219 == 1405) {
								local1077.anObjectArray14 = local2205;
							}
							if (local219 == 1407) {
								local1077.anIntArray127 = local2118;
								local1077.anObjectArray6 = local2205;
							}
							if (local219 == 1404) {
								local1077.anObjectArray26 = local2205;
							}
							if (local219 == 1420) {
								local1077.anObjectArray10 = local2205;
							}
							if (local219 == 1400) {
								local1077.anObjectArray24 = local2205;
							}
							if (local219 == 1412) {
								local1077.anObjectArray16 = local2205;
							}
							if (local219 == 1406) {
								local1077.anObjectArray17 = local2205;
							}
							if (local219 == 1402) {
								local1077.anObjectArray5 = local2205;
							}
							if (local219 == 1411) {
								local1077.anObjectArray11 = local2205;
							}
							if (local219 == 1415) {
								local1077.anIntArray126 = local2118;
								local1077.anObjectArray7 = local2205;
							}
							if (local219 == 1417) {
								local1077.anObjectArray12 = local2205;
							}
							if (local219 == 1409) {
								local1077.anObjectArray21 = local2205;
							}
							continue;
						}
						if (local219 < 1600) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
							if (local219 == 1500) {
								Static74.anIntArray196[local25++] = local1077.anInt1245;
								continue;
							}
							if (local219 == 1501) {
								Static74.anIntArray196[local25++] = local1077.anInt1201;
								continue;
							}
							if (local219 == 1502) {
								Static74.anIntArray196[local25++] = local1077.anInt1244;
								continue;
							}
							if (local219 == 1503) {
								Static74.anIntArray196[local25++] = local1077.anInt1259;
								continue;
							}
							if (local219 == 1504) {
								Static74.anIntArray196[local25++] = local1077.aBoolean56 ? 1 : 0;
								continue;
							}
							if (local219 == 1505) {
								Static74.anIntArray196[local25++] = local1077.anInt1199;
								continue;
							}
						} else if (local219 < 1700) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
							if (local219 == 1600) {
								Static74.anIntArray196[local25++] = local1077.anInt1237;
								continue;
							}
							if (local219 == 1601) {
								Static74.anIntArray196[local25++] = local1077.anInt1214;
								continue;
							}
							if (local219 == 1602) {
								Static87.aClass39Array16[local27++] = local1077.aClass39_722;
								continue;
							}
							if (local219 == 1603) {
								Static74.anIntArray196[local25++] = local1077.anInt1223;
								continue;
							}
							if (local219 == 1604) {
								Static74.anIntArray196[local25++] = local1077.anInt1251;
								continue;
							}
							if (local219 == 1605) {
								Static74.anIntArray196[local25++] = local1077.anInt1242;
								continue;
							}
							if (local219 == 1606) {
								Static74.anIntArray196[local25++] = local1077.anInt1217;
								continue;
							}
							if (local219 == 1607) {
								Static74.anIntArray196[local25++] = local1077.anInt1216;
								continue;
							}
							if (local219 == 1608) {
								Static74.anIntArray196[local25++] = local1077.anInt1227;
								continue;
							}
						} else if (local219 < 1800) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
							if (local219 == 1700) {
								Static74.anIntArray196[local25++] = local1077.anInt1208;
								continue;
							}
							if (local219 == 1701) {
								if (local1077.anInt1208 == -1) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = local1077.anInt1219;
								}
								continue;
							}
							if (local219 == 1702) {
								Static74.anIntArray196[local25++] = local1077.anInt1212;
								continue;
							}
						} else if (local219 < 1900) {
							local1077 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
							if (local219 == 1800) {
								Static74.anIntArray196[local25++] = Static65.method1151(Static20.method385(local1077));
								continue;
							}
							if (local219 == 1801) {
								local25--;
								local766 = Static74.anIntArray196[local25];
								local766--;
								if (local1077.aClass39Array9 != null && local766 < local1077.aClass39Array9.length && local1077.aClass39Array9[local766] != null) {
									Static87.aClass39Array16[local27++] = local1077.aClass39Array9[local766];
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 1802) {
								if (local1077.aClass39_721 == null) {
									Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								} else {
									Static87.aClass39Array16[local27++] = local1077.aClass39_721;
								}
								continue;
							}
						} else if (local219 < 2600) {
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
							if (local219 == 2500) {
								Static74.anIntArray196[local25++] = local1077.anInt1245;
								continue;
							}
							if (local219 == 2501) {
								Static74.anIntArray196[local25++] = local1077.anInt1201;
								continue;
							}
							if (local219 == 2502) {
								Static74.anIntArray196[local25++] = local1077.anInt1244;
								continue;
							}
							if (local219 == 2503) {
								Static74.anIntArray196[local25++] = local1077.anInt1259;
								continue;
							}
							if (local219 == 2504) {
								Static74.anIntArray196[local25++] = local1077.aBoolean56 ? 1 : 0;
								continue;
							}
							if (local219 == 2505) {
								Static74.anIntArray196[local25++] = local1077.anInt1199;
								continue;
							}
						} else if (local219 < 2700) {
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
							if (local219 == 2600) {
								Static74.anIntArray196[local25++] = local1077.anInt1237;
								continue;
							}
							if (local219 == 2601) {
								Static74.anIntArray196[local25++] = local1077.anInt1214;
								continue;
							}
							if (local219 == 2602) {
								Static87.aClass39Array16[local27++] = local1077.aClass39_722;
								continue;
							}
							if (local219 == 2603) {
								Static74.anIntArray196[local25++] = local1077.anInt1223;
								continue;
							}
							if (local219 == 2604) {
								Static74.anIntArray196[local25++] = local1077.anInt1251;
								continue;
							}
							if (local219 == 2605) {
								Static74.anIntArray196[local25++] = local1077.anInt1242;
								continue;
							}
							if (local219 == 2606) {
								Static74.anIntArray196[local25++] = local1077.anInt1217;
								continue;
							}
							if (local219 == 2607) {
								Static74.anIntArray196[local25++] = local1077.anInt1216;
								continue;
							}
							if (local219 == 2608) {
								Static74.anIntArray196[local25++] = local1077.anInt1227;
								continue;
							}
						} else if (local219 < 2800) {
							if (local219 == 2700) {
								local25--;
								local1077 = Static54.method949(Static74.anIntArray196[local25]);
								Static74.anIntArray196[local25++] = local1077.anInt1208;
								continue;
							}
							if (local219 == 2701) {
								local25--;
								local1077 = Static54.method949(Static74.anIntArray196[local25]);
								if (local1077.anInt1208 == -1) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = local1077.anInt1219;
								}
								continue;
							}
							if (local219 == 2702) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								@Pc(2864) Class4_Sub10 local2864 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local761);
								if (local2864 == null) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = 1;
								}
								continue;
							}
						} else if (local219 < 2900) {
							local25--;
							local1077 = Static54.method949(Static74.anIntArray196[local25]);
							if (local219 == 2800) {
								Static74.anIntArray196[local25++] = Static65.method1151(Static20.method385(local1077));
								continue;
							}
							if (local219 == 2801) {
								local25--;
								local766 = Static74.anIntArray196[local25];
								local766--;
								if (local1077.aClass39Array9 != null && local766 < local1077.aClass39Array9.length && local1077.aClass39Array9[local766] != null) {
									Static87.aClass39Array16[local27++] = local1077.aClass39Array9[local766];
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 2802) {
								if (local1077.aClass39_721 == null) {
									Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								} else {
									Static87.aClass39Array16[local27++] = local1077.aClass39_721;
								}
								continue;
							}
						} else if (local219 < 3200) {
							if (local219 == 3100) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static40.method672(0, local574, Static128.aClass39_1767);
								continue;
							}
							if (local219 == 3101) {
								local25 -= 2;
								Static33.method554(Static74.anIntArray196[local25], Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1, Static74.anIntArray196[local25 + 1]);
								continue;
							}
							if (local219 == 3102) {
								local25--;
								continue;
							}
							if (local219 == 3103) {
								Static114.method1990();
								continue;
							}
							if (local219 == 3104) {
								local766 = 0;
								local27--;
								local574 = Static87.aClass39Array16[local27];
								if (local574.method952()) {
									local766 = local574.method932();
								}
								Static114.aClass4_Sub16_Sub1_3.method1499(178);
								Static114.aClass4_Sub16_Sub1_3.method1489(local766);
								continue;
							}
							if (local219 == 3105) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static114.aClass4_Sub16_Sub1_3.method1499(49);
								Static114.aClass4_Sub16_Sub1_3.method1457(local574.method941());
								continue;
							}
							if (local219 == 3106) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static114.aClass4_Sub16_Sub1_3.method1499(156);
								Static114.aClass4_Sub16_Sub1_3.method1459(local574.method953() + 1);
								Static114.aClass4_Sub16_Sub1_3.method1470(local574);
								continue;
							}
							if (local219 == 3107) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local27--;
								local1630 = Static87.aClass39Array16[local27];
								Static64.method1149(local761, local1630);
								continue;
							}
							if (local219 == 3108) {
								local25 -= 3;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								local954 = Static74.anIntArray196[local25 + 2];
								local964 = Static54.method949(local954);
								Static22.method424(local766, local964, local761);
								continue;
							}
							if (local219 == 3109) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local1134 = local927 ? Static25.aClass4_Sub5_73 : Static64.aClass4_Sub5_37;
								local766 = Static74.anIntArray196[local25 + 1];
								Static22.method424(local766, local1134, local761);
								continue;
							}
						} else if (local219 < 3300) {
							if (local219 == 3200) {
								local25 -= 3;
								Static119.method2167(Static74.anIntArray196[local25 + 1], Static74.anIntArray196[local25], Static74.anIntArray196[local25 + 2]);
								continue;
							}
							if (local219 == 3201) {
								local25--;
								Static26.method439(Static74.anIntArray196[local25]);
								continue;
							}
							if (local219 == 3202) {
								local25 -= 2;
								Static14.method241(Static74.anIntArray196[local25 + 1], Static74.anIntArray196[local25]);
								continue;
							}
						} else if (local219 < 3400) {
							if (local219 == 3300) {
								Static74.anIntArray196[local25++] = Static71.anInt1738;
								continue;
							}
							if (local219 == 3301) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static74.method1213(local766, local761);
								continue;
							}
							if (local219 == 3302) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = Static105.method1439(local761, local766);
								continue;
							}
							if (local219 == 3303) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static103.method1846(local766, local761);
								continue;
							}
							if (local219 == 3304) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static126.method2188(local761).anInt938;
								continue;
							}
							if (local219 == 3305) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static1.anIntArray1[local761];
								continue;
							}
							if (local219 == 3306) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static39.anIntArray105[local761];
								continue;
							}
							if (local219 == 3307) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static35.anIntArray99[local761];
								continue;
							}
							if (local219 == 3308) {
								local761 = Static131.anInt3202;
								local766 = (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7) + Static36.anInt909;
								local954 = Static24.anInt503 + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7);
								Static74.anIntArray196[local25++] = (local766 << 14) + ((local761 << 28) + local954);
								continue;
							}
							if (local219 == 3309) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 >> 14 & 0x3FFF;
								continue;
							}
							if (local219 == 3310) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 >> 28;
								continue;
							}
							if (local219 == 3311) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 & 0x3FFF;
								continue;
							}
							if (local219 == 3312) {
								Static74.anIntArray196[local25++] = Static99.aBoolean121 ? 1 : 0;
								continue;
							}
							if (local219 == 3313) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25] + 32768;
								Static74.anIntArray196[local25++] = Static74.method1213(local766, local761);
								continue;
							}
							if (local219 == 3314) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25] + 32768;
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = Static105.method1439(local761, local766);
								continue;
							}
							if (local219 == 3315) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25] + 32768;
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = Static103.method1846(local766, local761);
								continue;
							}
							if (local219 == 3316) {
								if (Static84.anInt2105 >= 2) {
									Static74.anIntArray196[local25++] = Static84.anInt2105;
								} else {
									Static74.anIntArray196[local25++] = 0;
								}
								continue;
							}
							if (local219 == 3317) {
								Static74.anIntArray196[local25++] = Static23.anInt653;
								continue;
							}
							if (local219 == 3318) {
								Static74.anIntArray196[local25++] = Static49.anInt1283;
								continue;
							}
							if (local219 == 3320) {
								Static74.anIntArray196[local25++] = 1;
								continue;
							}
							if (local219 == 3321) {
								Static74.anIntArray196[local25++] = Static2.anInt18;
								continue;
							}
							if (local219 == 3322) {
								Static74.anIntArray196[local25++] = Static122.anInt3024;
								continue;
							}
							if (local219 == 3323) {
								if (Static84.anInt2105 == 1) {
									Static74.anIntArray196[local25++] = 1;
								} else {
									Static74.anIntArray196[local25++] = 0;
								}
								continue;
							}
						} else if (local219 < 3500) {
							if (local219 == 3400) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								@Pc(3264) Class4_Sub2_Sub15 local3264 = Static38.method627(local761);
								for (local618 = 0; local618 < local3264.anInt2871; local618++) {
									if (local766 == local3264.anIntArray311[local618]) {
										Static87.aClass39Array16[local27++] = local3264.aClass39Array21[local618];
										local3264 = null;
										break;
									}
								}
								if (local3264 != null) {
									Static87.aClass39Array16[local27++] = local3264.aClass39_1511;
								}
								continue;
							}
							if (local219 == 3408) {
								local25 -= 4;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								local954 = Static74.anIntArray196[local25 + 2];
								local618 = Static74.anIntArray196[local25 + 3];
								@Pc(3338) Class4_Sub2_Sub15 local3338 = Static38.method627(local954);
								if (local3338.anInt2886 == local761 && local3338.anInt2873 == local766) {
									for (local985 = 0; local985 < local3338.anInt2871; local985++) {
										if (local618 == local3338.anIntArray311[local985]) {
											if (local766 == 115) {
												Static87.aClass39Array16[local27++] = local3338.aClass39Array21[local985];
											} else {
												Static74.anIntArray196[local25++] = local3338.anIntArray310[local985];
											}
											local3338 = null;
											break;
										}
									}
									if (local3338 != null) {
										if (local766 == 115) {
											Static87.aClass39Array16[local27++] = local3338.aClass39_1511;
										} else {
											Static74.anIntArray196[local25++] = local3338.anInt2874;
										}
									}
									continue;
								}
								if (local766 == 115) {
									Static87.aClass39Array16[local27++] = Static115.aClass39_1510;
								} else {
									Static74.anIntArray196[local25++] = 0;
								}
								continue;
							}
						} else if (local219 < 3700) {
							if (local219 == 3600) {
								if (Static6.anInt243 == 0) {
									Static74.anIntArray196[local25++] = -2;
								} else if (Static6.anInt243 == 1) {
									Static74.anIntArray196[local25++] = -1;
								} else {
									Static74.anIntArray196[local25++] = Static48.anInt1254;
								}
								continue;
							}
							if (local219 == 3601) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static6.anInt243 == 2 && Static48.anInt1254 > local761) {
									Static87.aClass39Array16[local27++] = Static131.aClass39Array23[local761];
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 3602) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static6.anInt243 == 2 && local761 < Static48.anInt1254) {
									Static74.anIntArray196[local25++] = Static114.anIntArray307[local761];
									continue;
								}
								Static74.anIntArray196[local25++] = 0;
								continue;
							}
							if (local219 == 3603) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static6.anInt243 == 2 && local761 < Static48.anInt1254) {
									Static74.anIntArray196[local25++] = Static32.anIntArray93[local761];
									continue;
								}
								Static74.anIntArray196[local25++] = 0;
								continue;
							}
							if (local219 == 3604) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local25--;
								local766 = Static74.anIntArray196[local25];
								Static128.method2179(local766, local574);
								continue;
							}
							if (local219 == 3605) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static123.method2104(local574.method941());
								continue;
							}
							if (local219 == 3606) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static117.method2038(local574.method941());
								continue;
							}
							if (local219 == 3607) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static30.method522(local574.method941());
								continue;
							}
							if (local219 == 3608) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static25.method2199(local574.method941());
								continue;
							}
							if (local219 == 3609) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								if (local574.method943(Static47.aClass39_711) || local574.method943(Static119.aClass39_1713)) {
									local574 = local574.method964(7);
								}
								Static74.anIntArray196[local25++] = Static63.method1128(local574) ? 1 : 0;
								continue;
							}
							if (local219 == 3611) {
								if (Static102.aClass39_1326 == null) {
									Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								} else {
									Static87.aClass39Array16[local27++] = Static102.aClass39_1326;
								}
								continue;
							}
							if (local219 == 3612) {
								if (Static102.aClass39_1326 == null) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = Static97.anInt2431;
								}
								continue;
							}
							if (local219 == 3613) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static102.aClass39_1326 != null && local761 < Static97.anInt2431) {
									Static87.aClass39Array16[local27++] = Static32.aClass4_Sub20Array1[local761].aClass39_1464;
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 3614) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static102.aClass39_1326 != null && Static97.anInt2431 > local761) {
									Static74.anIntArray196[local25++] = Static32.aClass4_Sub20Array1[local761].anInt2785;
									continue;
								}
								Static74.anIntArray196[local25++] = 0;
								continue;
							}
							if (local219 == 3615) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static102.aClass39_1326 != null && local761 < Static97.anInt2431) {
									Static74.anIntArray196[local25++] = Static32.aClass4_Sub20Array1[local761].aByte6;
									continue;
								}
								Static74.anIntArray196[local25++] = 0;
								continue;
							}
							if (local219 == 3616) {
								Static74.anIntArray196[local25++] = Static33.aByte2;
								continue;
							}
							if (local219 == 3617) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static8.method187(local761);
								continue;
							}
							if (local219 == 3618) {
								Static74.anIntArray196[local25++] = Static106.aByte5;
								continue;
							}
							if (local219 == 3619) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static20.method384(local574.method941());
								continue;
							}
							if (local219 == 3620) {
								Static111.method1969();
								continue;
							}
							if (local219 == 3621) {
								if (Static6.anInt243 == 0) {
									Static74.anIntArray196[local25++] = -1;
								} else {
									Static74.anIntArray196[local25++] = Static83.anInt2086;
								}
								continue;
							}
							if (local219 == 3622) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (Static6.anInt243 != 0 && local761 < Static83.anInt2086) {
									Static87.aClass39Array16[local27++] = Static94.method1699(Static42.aLongArray3[local761]).method955();
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
						} else if (local219 < 4100) {
							if (local219 == 4000) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 + local766;
								continue;
							}
							if (local219 == 4001) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 - local766;
								continue;
							}
							if (local219 == 4002) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = local766 * local761;
								continue;
							}
							if (local219 == 4003) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 / local766;
								continue;
							}
							if (local219 == 4004) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = (int) (Math.random() * (double) local761);
								continue;
							}
							if (local219 == 4005) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = (int) ((double) (local761 + 1) * Math.random());
								continue;
							}
							if (local219 == 4006) {
								local25 -= 5;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								local954 = Static74.anIntArray196[local25 + 2];
								local618 = Static74.anIntArray196[local25 + 3];
								local638 = Static74.anIntArray196[local25 + 4];
								Static74.anIntArray196[local25++] = local761 + (local638 - local954) * (local766 - local761) / (local618 - local954);
								continue;
							}
							if (local219 == 4007) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = local766 * local761 / 100 + local761;
								continue;
							}
							if (local219 == 4008) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = local761 | 0x1 << local766;
								continue;
							}
							if (local219 == 4009) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local761 & -(0x1 << local766) - 1;
								continue;
							}
							if (local219 == 4010) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = (local761 & 0x1 << local766) == 0 ? 0 : 1;
								continue;
							}
							if (local219 == 4011) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = local761 % local766;
								continue;
							}
							if (local219 == 4012) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								if (local761 == 0) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = (int) Math.pow((double) local761, (double) local766);
								}
								continue;
							}
							if (local219 == 4013) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								if (local761 == 0) {
									Static74.anIntArray196[local25++] = 0;
								} else if (local766 == 0) {
									Static74.anIntArray196[local25++] = Integer.MAX_VALUE;
								} else {
									Static74.anIntArray196[local25++] = (int) Math.pow((double) local761, 1.0D / (double) local766);
								}
								continue;
							}
							if (local219 == 4014) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								Static74.anIntArray196[local25++] = local761 & local766;
								continue;
							}
							if (local219 == 4015) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25 + 1];
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = local766 | local761;
								continue;
							}
						} else if (local219 < 4200) {
							if (local219 == 4100) {
								local25--;
								local766 = Static74.anIntArray196[local25];
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static87.aClass39Array16[local27++] = Static62.method1123(new Class39[] { local574, Static29.method510(local766) });
								continue;
							}
							if (local219 == 4101) {
								local27 -= 2;
								local574 = Static87.aClass39Array16[local27];
								local1630 = Static87.aClass39Array16[local27 + 1];
								Static87.aClass39Array16[local27++] = Static62.method1123(new Class39[] { local574, local1630 });
								continue;
							}
							if (local219 == 4102) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local25--;
								local766 = Static74.anIntArray196[local25];
								Static87.aClass39Array16[local27++] = Static62.method1123(new Class39[] { local574, Static87.method1643(local766) });
								continue;
							}
							if (local219 == 4103) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static87.aClass39Array16[local27++] = local574.method950();
								continue;
							}
							if (local219 == 4104) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								@Pc(4100) long local4100 = ((long) local761 + 11745L) * 86400000L;
								Static70.aCalendar1.setTime(new Date(local4100));
								local618 = Static70.aCalendar1.get(5);
								local638 = Static70.aCalendar1.get(2);
								local985 = Static70.aCalendar1.get(1);
								Static87.aClass39Array16[local27++] = Static62.method1123(new Class39[] { Static29.method510(local618), Static39.aClass39_514, Static38.aClass39Array5[local638], Static39.aClass39_514, Static29.method510(local985) });
								continue;
							}
							if (local219 == 4105) {
								local27 -= 2;
								local574 = Static87.aClass39Array16[local27];
								local1630 = Static87.aClass39Array16[local27 + 1];
								if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2 != null && Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2.aBoolean113) {
									Static87.aClass39Array16[local27++] = local1630;
									continue;
								}
								Static87.aClass39Array16[local27++] = local574;
								continue;
							}
							if (local219 == 4106) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static87.aClass39Array16[local27++] = Static29.method510(local761);
								continue;
							}
							if (local219 == 4107) {
								local27 -= 2;
								Static74.anIntArray196[local25++] = Static87.aClass39Array16[local27].method945(Static87.aClass39Array16[local27 + 1]);
								continue;
							}
							@Pc(4257) byte[] local4257;
							@Pc(4262) Class4_Sub2_Sub3_Sub3 local4262;
							if (local219 == 4108) {
								local25 -= 2;
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local766 = Static74.anIntArray196[local25];
								local954 = Static74.anIntArray196[local25 + 1];
								local4257 = Static51.aClass20_Sub1_15.method474(local954, 0);
								local4262 = new Class4_Sub2_Sub3_Sub3(local4257);
								Static74.anIntArray196[local25++] = local4262.method1277(local574, local766);
								continue;
							}
							if (local219 == 4109) {
								local25 -= 2;
								local954 = Static74.anIntArray196[local25 + 1];
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local766 = Static74.anIntArray196[local25];
								local4257 = Static51.aClass20_Sub1_15.method474(local954, 0);
								local4262 = new Class4_Sub2_Sub3_Sub3(local4257);
								Static74.anIntArray196[local25++] = local4262.method1271(local574, local766);
								continue;
							}
							if (local219 == 4110) {
								local27 -= 2;
								local574 = Static87.aClass39Array16[local27];
								local1630 = Static87.aClass39Array16[local27 + 1];
								local25--;
								if (Static74.anIntArray196[local25] == 1) {
									Static87.aClass39Array16[local27++] = local574;
								} else {
									Static87.aClass39Array16[local27++] = local1630;
								}
								continue;
							}
							if (local219 == 4111) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static87.aClass39Array16[local27++] = Static76.method1263(local574);
								continue;
							}
							if (local219 == 4112) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local25--;
								local766 = Static74.anIntArray196[local25];
								Static87.aClass39Array16[local27++] = local574.method933(local766);
								continue;
							}
							if (local219 == 4113) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static109.method1929(local761) ? 1 : 0;
								continue;
							}
							if (local219 == 4114) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static55.method978(local761) ? 1 : 0;
								continue;
							}
							if (local219 == 4115) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static35.method589(local761) ? 1 : 0;
								continue;
							}
							if (local219 == 4116) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static100.method1814(local761) ? 1 : 0;
								continue;
							}
							if (local219 == 4117) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								if (local574 == null) {
									Static74.anIntArray196[local25++] = 0;
								} else {
									Static74.anIntArray196[local25++] = local574.method953();
								}
								continue;
							}
							if (local219 == 4118) {
								local25 -= 2;
								local766 = Static74.anIntArray196[local25];
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local954 = Static74.anIntArray196[local25 + 1];
								Static87.aClass39Array16[local27++] = local574.method938(local954, local766);
								continue;
							}
							if (local219 == 4119) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local1630 = Static126.method2191(local574.method953());
								@Pc(4551) boolean local4551 = false;
								for (local618 = 0; local574.method953() > local618; local618++) {
									local638 = local574.method939(local618);
									if (local638 == 60) {
										local4551 = true;
									} else if (local638 == 62) {
										local4551 = false;
									} else if (!local4551) {
										local1630.method946(local638);
									}
								}
								local1630.method930();
								Static87.aClass39Array16[local27++] = local1630;
								continue;
							}
							if (local219 == 4120) {
								local25--;
								local766 = Static74.anIntArray196[local25];
								local27--;
								local574 = Static87.aClass39Array16[local27];
								Static74.anIntArray196[local25++] = local574.method934(local766);
								continue;
							}
						} else if (local219 < 4300) {
							if (local219 == 4200) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static87.aClass39Array16[local27++] = Static119.method2166(local761).aClass39_352;
								continue;
							}
							@Pc(5604) Class4_Sub2_Sub5 local5604;
							if (local219 == 4201) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								local5604 = Static119.method2166(local761);
								if (local766 >= 1 && local766 <= 5 && local5604.aClass39Array2[local766 - 1] != null) {
									Static87.aClass39Array16[local27++] = local5604.aClass39Array2[local766 - 1];
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 4202) {
								local25 -= 2;
								local761 = Static74.anIntArray196[local25];
								local766 = Static74.anIntArray196[local25 + 1];
								local5604 = Static119.method2166(local761);
								if (local766 >= 1 && local766 <= 5 && local5604.aClass39Array3[local766 - 1] != null) {
									Static87.aClass39Array16[local27++] = local5604.aClass39Array3[local766 - 1];
									continue;
								}
								Static87.aClass39Array16[local27++] = Static128.aClass39_1767;
								continue;
							}
							if (local219 == 4203) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static119.method2166(local761).anInt631;
								continue;
							}
							if (local219 == 4204) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static119.method2166(local761).anInt606 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5749) Class4_Sub2_Sub5 local5749;
							if (local219 == 4205) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local5749 = Static119.method2166(local761);
								if (local5749.anInt621 == -1 && local5749.anInt595 >= 0) {
									Static74.anIntArray196[local25++] = local5749.anInt595;
									continue;
								}
								Static74.anIntArray196[local25++] = local761;
								continue;
							}
							if (local219 == 4206) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local5749 = Static119.method2166(local761);
								if (local5749.anInt621 >= 0 && local5749.anInt595 >= 0) {
									Static74.anIntArray196[local25++] = local5749.anInt595;
									continue;
								}
								Static74.anIntArray196[local25++] = local761;
								continue;
							}
							if (local219 == 4207) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								Static74.anIntArray196[local25++] = Static119.method2166(local761).aBoolean25 ? 1 : 0;
								continue;
							}
						} else if (local219 < 5100) {
							if (local219 == 5000) {
								Static74.anIntArray196[local25++] = Static74.anInt1779;
								continue;
							}
							if (local219 == 5001) {
								local25 -= 3;
								Static74.anInt1779 = Static74.anIntArray196[local25];
								Static69.anInt1720 = Static74.anIntArray196[local25 + 1];
								Static99.anInt2486 = Static74.anIntArray196[local25 + 2];
								Static114.aClass4_Sub16_Sub1_3.method1499(38);
								Static114.aClass4_Sub16_Sub1_3.method1459(Static74.anInt1779);
								Static114.aClass4_Sub16_Sub1_3.method1459(Static69.anInt1720);
								Static114.aClass4_Sub16_Sub1_3.method1459(Static99.anInt2486);
								continue;
							}
							if (local219 == 5002) {
								local25 -= 2;
								local27--;
								local574 = Static87.aClass39Array16[local27];
								local954 = Static74.anIntArray196[local25 + 1];
								local766 = Static74.anIntArray196[local25];
								Static114.aClass4_Sub16_Sub1_3.method1499(37);
								Static114.aClass4_Sub16_Sub1_3.method1457(local574.method941());
								Static114.aClass4_Sub16_Sub1_3.method1459(local766 - 1);
								Static114.aClass4_Sub16_Sub1_3.method1459(local954);
								continue;
							}
							if (local219 == 5003) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local1630 = null;
								if (local761 < 100) {
									local1630 = Static94.aClass39Array17[local761];
								}
								if (local1630 == null) {
									local1630 = Static128.aClass39_1767;
								}
								Static87.aClass39Array16[local27++] = local1630;
								continue;
							}
							if (local219 == 5004) {
								local766 = -1;
								local25--;
								local761 = Static74.anIntArray196[local25];
								if (local761 < 100 && Static94.aClass39Array17[local761] != null) {
									local766 = Static30.anIntArray88[local761];
								}
								Static74.anIntArray196[local25++] = local766;
								continue;
							}
							if (local219 == 5005) {
								Static74.anIntArray196[local25++] = Static69.anInt1720;
								continue;
							}
							if (local219 == 5008) {
								local27--;
								local574 = Static87.aClass39Array16[local27];
								if (local574.method943(Static116.aClass39_1521)) {
									Static3.method17(local574);
								} else {
									@Pc(4830) byte local4830 = 0;
									local1630 = local574.method950();
									if (local1630.method943(Static80.aClass39_1013)) {
										local4830 = 0;
										local574 = local574.method964(Static80.aClass39_1013.method953());
									} else if (local1630.method943(Static44.aClass39_673)) {
										local574 = local574.method964(Static44.aClass39_673.method953());
										local4830 = 1;
									} else if (local1630.method943(Static62.aClass39_859)) {
										local574 = local574.method964(Static62.aClass39_859.method953());
										local4830 = 2;
									} else if (local1630.method943(Static113.aClass39_1477)) {
										local4830 = 3;
										local574 = local574.method964(Static113.aClass39_1477.method953());
									} else if (local1630.method943(Static3.aClass39_16)) {
										local574 = local574.method964(Static3.aClass39_16.method953());
										local4830 = 4;
									} else if (local1630.method943(Static80.aClass39_1018)) {
										local574 = local574.method964(Static80.aClass39_1018.method953());
										local4830 = 5;
									} else if (local1630.method943(Static109.aClass39_1434)) {
										local4830 = 6;
										local574 = local574.method964(Static109.aClass39_1434.method953());
									} else if (local1630.method943(Static85.aClass39_1086)) {
										local574 = local574.method964(Static85.aClass39_1086.method953());
										local4830 = 7;
									} else if (local1630.method943(Static28.aClass39_404)) {
										local574 = local574.method964(Static28.aClass39_404.method953());
										local4830 = 8;
									} else if (local1630.method943(Static99.aClass39_1285)) {
										local574 = local574.method964(Static99.aClass39_1285.method953());
										local4830 = 9;
									} else if (local1630.method943(Static130.aClass39_1789)) {
										local4830 = 10;
										local574 = local574.method964(Static130.aClass39_1789.method953());
									} else if (local1630.method943(Static101.aClass39_1300)) {
										local574 = local574.method964(Static101.aClass39_1300.method953());
										local4830 = 11;
									} else if (Static44.anInt1125 != 0) {
										if (local1630.method943(Static80.aClass39_1024)) {
											local4830 = 0;
											local574 = local574.method964(Static80.aClass39_1024.method953());
										} else if (local1630.method943(Static44.aClass39_674)) {
											local4830 = 1;
											local574 = local574.method964(Static44.aClass39_674.method953());
										} else if (local1630.method943(Static62.aClass39_858)) {
											local574 = local574.method964(Static62.aClass39_858.method953());
											local4830 = 2;
										} else if (local1630.method943(Static113.aClass39_1475)) {
											local574 = local574.method964(Static113.aClass39_1475.method953());
											local4830 = 3;
										} else if (local1630.method943(Static3.aClass39_15)) {
											local574 = local574.method964(Static3.aClass39_15.method953());
											local4830 = 4;
										} else if (local1630.method943(Static80.aClass39_1014)) {
											local574 = local574.method964(Static80.aClass39_1014.method953());
											local4830 = 5;
										} else if (local1630.method943(Static109.aClass39_1433)) {
											local574 = local574.method964(Static109.aClass39_1433.method953());
											local4830 = 6;
										} else if (local1630.method943(Static85.aClass39_1085)) {
											local4830 = 7;
											local574 = local574.method964(Static85.aClass39_1085.method953());
										} else if (local1630.method943(Static28.aClass39_396)) {
											local574 = local574.method964(Static28.aClass39_396.method953());
											local4830 = 8;
										} else if (local1630.method943(Static99.aClass39_1286)) {
											local574 = local574.method964(Static99.aClass39_1286.method953());
											local4830 = 9;
										} else if (local1630.method943(Static130.aClass39_1792)) {
											local4830 = 10;
											local574 = local574.method964(Static130.aClass39_1792.method953());
										} else if (local1630.method943(Static101.aClass39_1299)) {
											local574 = local574.method964(Static101.aClass39_1299.method953());
											local4830 = 11;
										}
									}
									local1630 = local574.method950();
									@Pc(5227) byte local5227 = 0;
									if (local1630.method943(Static46.aClass39_700)) {
										local5227 = 1;
										local574 = local574.method964(Static46.aClass39_700.method953());
									} else if (local1630.method943(Static100.aClass39_1293)) {
										local5227 = 2;
										local574 = local574.method964(Static100.aClass39_1293.method953());
									} else if (local1630.method943(Static78.aClass39_993)) {
										local5227 = 3;
										local574 = local574.method964(Static78.aClass39_993.method953());
									} else if (local1630.method943(Static43.aClass39_667)) {
										local574 = local574.method964(Static43.aClass39_667.method953());
										local5227 = 4;
									} else if (local1630.method943(Static111.aClass39_1461)) {
										local5227 = 5;
										local574 = local574.method964(Static111.aClass39_1461.method953());
									} else if (Static44.anInt1125 != 0) {
										if (local1630.method943(Static46.aClass39_707)) {
											local574 = local574.method964(Static46.aClass39_707.method953());
											local5227 = 1;
										} else if (local1630.method943(Static100.aClass39_1295)) {
											local5227 = 2;
											local574 = local574.method964(Static100.aClass39_1295.method953());
										} else if (local1630.method943(Static78.aClass39_996)) {
											local574 = local574.method964(Static78.aClass39_996.method953());
											local5227 = 3;
										} else if (local1630.method943(Static43.aClass39_663)) {
											local5227 = 4;
											local574 = local574.method964(Static43.aClass39_663.method953());
										} else if (local1630.method943(Static111.aClass39_1462)) {
											local5227 = 5;
											local574 = local574.method964(Static111.aClass39_1462.method953());
										}
									}
									Static114.aClass4_Sub16_Sub1_3.method1499(139);
									Static114.aClass4_Sub16_Sub1_3.method1459(0);
									local638 = Static114.aClass4_Sub16_Sub1_3.anInt2019;
									Static114.aClass4_Sub16_Sub1_3.method1459(local4830);
									Static114.aClass4_Sub16_Sub1_3.method1459(local5227);
									Static42.method708(local574, Static114.aClass4_Sub16_Sub1_3);
									Static114.aClass4_Sub16_Sub1_3.method1482(Static114.aClass4_Sub16_Sub1_3.anInt2019 - local638);
								}
								continue;
							}
							if (local219 == 5009) {
								local27 -= 2;
								local574 = Static87.aClass39Array16[local27];
								local1630 = Static87.aClass39Array16[local27 + 1];
								Static114.aClass4_Sub16_Sub1_3.method1499(190);
								Static114.aClass4_Sub16_Sub1_3.method1459(0);
								local954 = Static114.aClass4_Sub16_Sub1_3.anInt2019;
								Static114.aClass4_Sub16_Sub1_3.method1457(local574.method941());
								Static42.method708(local1630, Static114.aClass4_Sub16_Sub1_3);
								Static114.aClass4_Sub16_Sub1_3.method1482(Static114.aClass4_Sub16_Sub1_3.anInt2019 - local954);
								continue;
							}
							if (local219 == 5010) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local1630 = null;
								if (local761 < 100) {
									local1630 = Static100.aClass39Array18[local761];
								}
								if (local1630 == null) {
									local1630 = Static128.aClass39_1767;
								}
								Static87.aClass39Array16[local27++] = local1630;
								continue;
							}
							if (local219 == 5011) {
								local25--;
								local761 = Static74.anIntArray196[local25];
								local1630 = null;
								if (local761 < 100) {
									local1630 = Static103.aClass39Array20[local761];
								}
								if (local1630 == null) {
									local1630 = Static128.aClass39_1767;
								}
								Static87.aClass39Array16[local27++] = local1630;
								continue;
							}
							if (local219 == 5015) {
								if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1 == null || Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass39_1279 == null) {
									local574 = Static6.aClass39_179;
								} else {
									local574 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass39_1279;
								}
								Static87.aClass39Array16[local27++] = local574;
								continue;
							}
							if (local219 == 5016) {
								Static74.anIntArray196[local25++] = Static99.anInt2486;
								continue;
							}
						}
					}
				}
				local574 = Static126.method2191(30);
				if (local18.aClass39_604 != null) {
					local574.method944(Static11.aClass39_237).method944(local18.aClass39_604);
					for (local766 = Static11.anInt337 - 1; local766 >= 0; local766--) {
						local574.method944(Static60.aClass39_855).method944(Static129.aClass24Array1[local766].aClass4_Sub2_Sub7_1.aClass39_604);
					}
					if (Static1.anInt2 != 0) {
						Static40.method672(0, Static62.method1123(new Class39[] { Static70.aClass39_915, local18.aClass39_604 }), Static128.aClass39_1767);
					}
				}
				Static77.method1294(null, "CS2 - nosuchop:" + local219 + new String(local574.method965()));
				return;
			}
		} catch (@Pc(7050) Exception local7050) {
			@Pc(7054) Class39 local7054 = Static126.method2191(30);
			if (local18.aClass39_604 != null) {
				local7054.method944(Static11.aClass39_237).method944(local18.aClass39_604);
				for (local61 = Static11.anInt337 - 1; local61 >= 0; local61--) {
					local7054.method944(Static60.aClass39_855).method944(Static129.aClass24Array1[local61].aClass4_Sub2_Sub7_1.aClass39_604);
				}
				if (local47 == 40) {
					local74 = local35[local29];
					local7054.method944(Static116.aClass39_1514).method944(Static29.method510(local74));
				}
				if (Static1.anInt2 != 0) {
					Static40.method672(0, Static62.method1123(new Class39[] { Static70.aClass39_915, local18.aClass39_604 }), Static128.aClass39_1767);
				}
			}
			Static77.method1294(local7050, "CS2 - scr:" + local18.aLong155 + " op:" + local47 + new String(local7054.method965()));
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method1861() {
		aClass39_1338 = null;
		aClass39_1337 = null;
		anIntArray287 = null;
		aClass70_1 = null;
		aClass42_10 = null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lclient!pf;")
	public static Class55 method1862() {
		try {
			return (Class55) Class.forName("Class55_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class55_Sub1();
		}
	}
}
