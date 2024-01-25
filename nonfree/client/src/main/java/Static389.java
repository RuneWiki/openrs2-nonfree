import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nba", name = "u", descriptor = "Lclient!gga;")
	public static Class124 aClass124_82;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	public static int anInt7373 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)Z")
	public static boolean method6557() throws IOException {
		if (Static395.aClass207_2 == null) {
			return false;
		}
		@Pc(77) int local77;
		if (Static14.aClass169_207 == null) {
			if (Static415.aBoolean193) {
				if (!Static395.aClass207_2.method5439(1)) {
					return false;
				}
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
				Static599.anInt10392++;
				Static415.aBoolean193 = false;
				Static10.anInt166 = 0;
			}
			Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
			if (Static206.aClass2_Sub8_Sub2_1.method5235()) {
				if (!Static395.aClass207_2.method5439(1)) {
					return false;
				}
				Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 1);
				Static10.anInt166 = 0;
				Static599.anInt10392++;
			}
			Static415.aBoolean193 = true;
			@Pc(73) Class169[] local73 = Static127.method2287();
			local77 = Static206.aClass2_Sub8_Sub2_1.method5239();
			if (local77 < 0 || local73.length <= local77) {
				throw new IOException("invo:" + local77 + " ip:" + Static206.aClass2_Sub8_Sub2_1.anInt5725);
			}
			Static14.aClass169_207 = local73[local77];
			Static538.anInt9383 = Static14.aClass169_207.anInt4990;
		}
		if (Static538.anInt9383 == -1) {
			if (!Static395.aClass207_2.method5439(1)) {
				return false;
			}
			Static395.aClass207_2.method5438(1, Static206.aClass2_Sub8_Sub2_1.lb, 0);
			Static538.anInt9383 = Static206.aClass2_Sub8_Sub2_1.lb[0] & 0xFF;
			Static599.anInt10392++;
			Static10.anInt166 = 0;
		}
		if (Static538.anInt9383 == -2) {
			if (!Static395.aClass207_2.method5439(2)) {
				return false;
			}
			Static395.aClass207_2.method5438(2, Static206.aClass2_Sub8_Sub2_1.lb, 0);
			Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
			Static538.anInt9383 = Static206.aClass2_Sub8_Sub2_1.method5211();
			Static599.anInt10392 += 2;
			Static10.anInt166 = 0;
		}
		if (Static538.anInt9383 > 0) {
			if (!Static395.aClass207_2.method5439(Static538.anInt9383)) {
				return false;
			}
			Static206.aClass2_Sub8_Sub2_1.anInt5725 = 0;
			Static395.aClass207_2.method5438(Static538.anInt9383, Static206.aClass2_Sub8_Sub2_1.lb, 0);
			Static599.anInt10392 += Static538.anInt9383;
			Static10.anInt166 = 0;
		}
		Static446.aClass169_194 = Static275.aClass169_135;
		Static275.aClass169_135 = Static482.aClass169_210;
		Static482.aClass169_210 = Static14.aClass169_207;
		@Pc(232) String local232;
		@Pc(240) int local240;
		@Pc(264) int local264;
		@Pc(224) boolean local224;
		@Pc(228) String local228;
		@Pc(236) int local236;
		@Pc(433) int local433;
		@Pc(531) String local531;
		@Pc(495) String local495;
		@Pc(244) boolean local244;
		@Pc(242) String local242;
		if (Static197.aClass169_101 == Static14.aClass169_207) {
			@Pc(298) boolean local298;
			while (Static206.aClass2_Sub8_Sub2_1.anInt5725 < Static538.anInt9383) {
				local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
				local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
				local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
				local236 = Static206.aClass2_Sub8_Sub2_1.method5211();
				local240 = Static206.aClass2_Sub8_Sub2_1.method5203();
				local242 = "";
				local244 = false;
				if (local236 > 0) {
					local242 = Static206.aClass2_Sub8_Sub2_1.method5178();
					local244 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
				}
				for (local264 = 0; local264 < Static340.anInt6395; local264++) {
					if (local224) {
						if (local232.equals(Static438.aStringArray47[local264])) {
							Static438.aStringArray47[local264] = local228;
							Static520.aStringArray59[local264] = local232;
							local228 = null;
							break;
						}
					} else if (local228.equals(Static438.aStringArray47[local264])) {
						if (Static568.anIntArray497[local264] != local236) {
							local298 = true;
							for (@Pc(303) Class15_Sub2_Sub2 local303 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1547(); local303 != null; local303 = (Class15_Sub2_Sub2) Static138.aClass60_4.method1546()) {
								if (local303.aString12.equals(local228)) {
									if (local236 != 0 && local303.aShort19 == 0) {
										local303.method9741();
										local298 = false;
									} else if (local236 == 0 && local303.aShort19 != 0) {
										local298 = false;
										local303.method9741();
									}
								}
							}
							if (local298) {
								Static138.aClass60_4.method1551(new Class15_Sub2_Sub2(local228, local236));
							}
							Static568.anIntArray497[local264] = local236;
						}
						Static520.aStringArray59[local264] = local232;
						Static24.aStringArray2[local264] = local242;
						Static345.anIntArray316[local264] = local240;
						local228 = null;
						Static290.aBooleanArray46[local264] = local244;
						break;
					}
				}
				if (local228 != null && Static340.anInt6395 < 200) {
					Static438.aStringArray47[Static340.anInt6395] = local228;
					Static520.aStringArray59[Static340.anInt6395] = local232;
					Static568.anIntArray497[Static340.anInt6395] = local236;
					Static24.aStringArray2[Static340.anInt6395] = local242;
					Static345.anIntArray316[Static340.anInt6395] = local240;
					Static290.aBooleanArray46[Static340.anInt6395] = local244;
					Static340.anInt6395++;
				}
			}
			Static480.anInt8620 = 2;
			Static194.anInt4135 = Static397.anInt11030;
			local77 = Static340.anInt6395;
			while (local77 > 0) {
				local77--;
				local224 = true;
				for (local433 = 0; local433 < local77; local433++) {
					if (Static568.anIntArray497[local433] != Static524.aClass66_4.anInt1756 && Static524.aClass66_4.anInt1756 == Static568.anIntArray497[local433 + 1] || Static568.anIntArray497[local433] == 0 && Static568.anIntArray497[local433 + 1] != 0) {
						local236 = Static568.anIntArray497[local433];
						Static568.anIntArray497[local433] = Static568.anIntArray497[local433 + 1];
						Static568.anIntArray497[local433 + 1] = local236;
						local495 = Static24.aStringArray2[local433];
						Static24.aStringArray2[local433] = Static24.aStringArray2[local433 + 1];
						Static24.aStringArray2[local433 + 1] = local495;
						local242 = Static438.aStringArray47[local433];
						Static438.aStringArray47[local433] = Static438.aStringArray47[local433 + 1];
						Static438.aStringArray47[local433 + 1] = local242;
						local531 = Static520.aStringArray59[local433];
						Static520.aStringArray59[local433] = Static520.aStringArray59[local433 + 1];
						Static520.aStringArray59[local433 + 1] = local531;
						local264 = Static345.anIntArray316[local433];
						Static345.anIntArray316[local433] = Static345.anIntArray316[local433 + 1];
						Static345.anIntArray316[local433 + 1] = local264;
						local298 = Static290.aBooleanArray46[local433];
						Static290.aBooleanArray46[local433] = Static290.aBooleanArray46[local433 + 1];
						Static290.aBooleanArray46[local433 + 1] = local298;
						local224 = false;
					}
				}
				if (local224) {
					break;
				}
			}
			Static14.aClass169_207 = null;
			return true;
		} else if (Static117.aClass169_61 == Static14.aClass169_207) {
			Static585.method8836(Static640.aClass368_24);
			Static14.aClass169_207 = null;
			return true;
		} else {
			@Pc(619) String local619;
			if (Static123.aClass169_68 == Static14.aClass169_207) {
				local619 = Static206.aClass2_Sub8_Sub2_1.method5178();
				local77 = Static206.aClass2_Sub8_Sub2_1.method5226();
				Static449.method7282();
				Static330.method5448(local77, local619);
				Static14.aClass169_207 = null;
				return true;
			}
			@Pc(641) int local641;
			if (Static14.aClass169_207 == Static501.aClass169_222) {
				local641 = Static206.aClass2_Sub8_Sub2_1.method5186();
				local77 = Static206.aClass2_Sub8_Sub2_1.method5211();
				Static113.aClass282_1.method7369(local77, local641);
				Static14.aClass169_207 = null;
				return true;
			} else if (Static14.aClass169_207 == Static581.aClass169_246) {
				local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
				local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
				Static449.method7282();
				Static330.method5448(local641, local228);
				Static14.aClass169_207 = null;
				return true;
			} else if (Static238.aClass169_120 == Static14.aClass169_207) {
				local619 = Static206.aClass2_Sub8_Sub2_1.method5178();
				local77 = Static206.aClass2_Sub8_Sub2_1.method5211();
				local232 = Static644.aClass186_2.method4870(local77).method4332(Static206.aClass2_Sub8_Sub2_1);
				Static34.method582(local619, 19, (String) null, local232, local619, local77, local619, 0);
				Static14.aClass169_207 = null;
				return true;
			} else {
				@Pc(741) String local741;
				if (Static576.aClass169_242 == Static14.aClass169_207) {
					local641 = Static206.aClass2_Sub8_Sub2_1.method5201();
					local77 = Static206.aClass2_Sub8_Sub2_1.method5207();
					local433 = Static206.aClass2_Sub8_Sub2_1.method5226();
					if (local433 == 65535) {
						local433 = -1;
					}
					local741 = Static206.aClass2_Sub8_Sub2_1.method5178();
					if (local77 >= 1 && local77 <= 8) {
						if (local741.equalsIgnoreCase("null")) {
							local741 = null;
						}
						Static294.aStringArray33[local77 - 1] = local741;
						Static21.anIntArray34[local77 - 1] = local433;
						Static93.aBooleanArray66[local77 - 1] = local641 == 0;
					}
					Static14.aClass169_207 = null;
					return true;
				} else if (Static191.aClass169_99 == Static14.aClass169_207) {
					Static534.method8491(Static538.anInt9383, Static206.aClass2_Sub8_Sub2_1);
					Static14.aClass169_207 = null;
					return true;
				} else if (Static14.aClass169_207 == Static215.aClass169_262) {
					Static113.aClass282_1.method7366();
					Static14.aClass169_207 = null;
					Static115.anInt2100 += 32;
					return true;
				} else if (Static546.aClass169_226 == Static14.aClass169_207) {
					local641 = Static206.aClass2_Sub8_Sub2_1.method5214() << 2;
					local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
					local433 = Static206.aClass2_Sub8_Sub2_1.method5201();
					local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
					local240 = Static206.aClass2_Sub8_Sub2_1.method5201();
					Static449.method7282();
					Static81.method1406(local433, local641, local236, local240, local77);
					Static14.aClass169_207 = null;
					return true;
				} else if (Static14.aClass169_207 == Static397.aClass169_257) {
					Static567.anInt9849 = Static206.aClass2_Sub8_Sub2_1.method5203();
					Static301.anInt5476 = Static397.anInt11030;
					Static14.aClass169_207 = null;
					return true;
				} else {
					@Pc(885) Class2_Sub20 local885;
					if (Static414.aClass169_186 == Static14.aClass169_207) {
						local641 = Static206.aClass2_Sub8_Sub2_1.method5206();
						local77 = Static206.aClass2_Sub8_Sub2_1.method5167();
						local433 = Static206.aClass2_Sub8_Sub2_1.method5222();
						Static449.method7282();
						local885 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local77);
						if (local885 != null) {
							Static349.method6045(false, local885, local885.anInt1667 != local433);
						}
						Static240.method4308(local433, false, local641, local77);
						Static14.aClass169_207 = null;
						return true;
					} else if (Static14.aClass169_207 == Static423.aClass169_187) {
						Static334.method5510(Static96.aClass48_5, Static206.aClass2_Sub8_Sub2_1, Static538.anInt9383);
						Static14.aClass169_207 = null;
						return true;
					} else if (Static198.aClass169_105 == Static14.aClass169_207) {
						Static17.anInt8640 = Static206.aClass2_Sub8_Sub2_1.method5174();
						Static14.aClass169_207 = null;
						Static301.anInt5476 = Static397.anInt11030;
						return true;
					} else if (Static91.aClass169_49 == Static14.aClass169_207) {
						local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
						local77 = Static206.aClass2_Sub8_Sub2_1.method5186();
						Static449.method7282();
						Static603.method9044(local641, local77);
						Static14.aClass169_207 = null;
						return true;
					} else if (Static25.aClass169_14 == Static14.aClass169_207) {
						Static585.method8836(Static505.aClass368_20);
						Static14.aClass169_207 = null;
						return true;
					} else if (Static196.aClass169_100 == Static14.aClass169_207) {
						local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
						local77 = Static206.aClass2_Sub8_Sub2_1.method5222();
						if (local77 == 65535) {
							local77 = -1;
						}
						Static449.method7282();
						Static87.method1541(-1, local641, local77, 2);
						Static14.aClass169_207 = null;
						return true;
					} else if (Static259.aClass169_128 == Static14.aClass169_207) {
						local641 = Static206.aClass2_Sub8_Sub2_1.method5186();
						local77 = Static206.aClass2_Sub8_Sub2_1.method5167();
						local433 = Static206.aClass2_Sub8_Sub2_1.method5226();
						if (local433 == 65535) {
							local433 = -1;
						}
						Static449.method7282();
						Static672.method9818(local77, local641, local433);
						@Pc(1040) Class351 local1040 = Static372.aClass343_1.method8549(local433);
						Static568.method8644(local1040.anInt10160, local1040.anInt10174, local77, local1040.anInt10199);
						Static240.method4307(local77, local1040.anInt10190, local1040.anInt10188, local1040.anInt10173);
						Static14.aClass169_207 = null;
						return true;
					} else {
						@Pc(1096) int local1096;
						@Pc(1106) long local1106;
						@Pc(1108) boolean local1108;
						@Pc(1183) int local1183;
						@Pc(1092) long local1092;
						@Pc(1124) int local1124;
						@Pc(1177) String local1177;
						@Pc(1087) long local1087;
						if (Static297.aClass169_145 == Static14.aClass169_207) {
							local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
							local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
							local1087 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
							local1092 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
							local1096 = Static206.aClass2_Sub8_Sub2_1.method5203();
							local264 = Static206.aClass2_Sub8_Sub2_1.method5211();
							local1106 = local1092 + (local1087 << 32);
							local1108 = false;
							@Pc(1116) Class2_Sub30 local1116 = local224 ? Static366.aClass2_Sub30_1 : Static396.aClass2_Sub30_2;
							if (local1116 == null) {
								local1108 = true;
							} else {
								label2104: {
									for (local1124 = 0; local1124 < 100; local1124++) {
										if (Static186.aLongArray9[local1124] == local1106) {
											local1108 = true;
											break label2104;
										}
									}
									if (local1096 <= 1 && Static329.method5442(local228)) {
										local1108 = true;
									}
								}
							}
							if (!local1108 && Static276.anInt5122 == 0) {
								Static186.aLongArray9[Static476.anInt8578] = local1106;
								Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
								local1177 = Static644.aClass186_2.method4870(local264).method4332(Static206.aClass2_Sub8_Sub2_1);
								local1183 = local224 ? 42 : 45;
								if (local1096 == 2 || local1096 == 3) {
									Static34.method582("<img=1>" + local228, local1183, local1116.aString54, local1177, local228, local264, "<img=1>" + local228, 0);
								} else if (local1096 == 1) {
									Static34.method582("<img=0>" + local228, local1183, local1116.aString54, local1177, local228, local264, "<img=0>" + local228, 0);
								} else {
									Static34.method582(local228, local1183, local1116.aString54, local1177, local228, local264, local228, 0);
								}
							}
							Static14.aClass169_207 = null;
							return true;
						} else if (Static592.aClass169_250 == Static14.aClass169_207) {
							Static585.method8836(Static634.aClass368_23);
							Static14.aClass169_207 = null;
							return true;
						} else if (Static98.aClass169_55 == Static14.aClass169_207) {
							if (Static43.method7854(Static579.anInt10049)) {
								Static543.anInt9483 = (int) ((float) Static206.aClass2_Sub8_Sub2_1.method5211() * 2.5F);
							} else {
								Static543.anInt9483 = Static206.aClass2_Sub8_Sub2_1.method5211() * 30;
							}
							Static14.aClass169_207 = null;
							Static301.anInt5476 = Static397.anInt11030;
							return true;
						} else if (Static530.aClass169_237 == Static14.aClass169_207) {
							Static228.aByte73 = Static206.aClass2_Sub8_Sub2_1.method5175();
							if (Static228.aByte73 == 0 || Static228.aByte73 == 1) {
								Static274.aBoolean382 = true;
							}
							Static14.aClass169_207 = null;
							return true;
						} else if (Static521.aClass169_171 == Static14.aClass169_207) {
							Static14.aClass169_207 = null;
							return false;
						} else if (Static14.aClass169_207 == Static249.aClass169_121) {
							local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
							local77 = Static206.aClass2_Sub8_Sub2_1.method5222();
							Static449.method7282();
							Static640.method9477(local77, local641);
							Static14.aClass169_207 = null;
							return true;
						} else if (Static197.aClass169_102 == Static14.aClass169_207) {
							@Pc(1358) int[] local1358 = new int[4];
							for (local77 = 0; local77 < 4; local77++) {
								local1358[local77] = Static206.aClass2_Sub8_Sub2_1.method5211();
							}
							local433 = Static206.aClass2_Sub8_Sub2_1.method5206();
							local236 = Static206.aClass2_Sub8_Sub2_1.method5222();
							@Pc(1391) Class2_Sub6 local1391 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local236);
							if (local1391 != null) {
								Static658.method9647(local1358, local433, local1391.aClass15_Sub3_Sub3_Sub1_Sub2_1);
							}
							Static14.aClass169_207 = null;
							return true;
						} else if (Static649.aClass169_261 == Static14.aClass169_207) {
							local641 = Static206.aClass2_Sub8_Sub2_1.method5222();
							if (local641 == 65535) {
								local641 = -1;
							}
							local77 = Static206.aClass2_Sub8_Sub2_1.method5186();
							Static449.method7282();
							Static87.method1541(-1, local77, local641, 1);
							Static14.aClass169_207 = null;
							return true;
						} else if (Static551.aClass169_233 == Static14.aClass169_207) {
							Static585.method8836(Static108.aClass368_3);
							Static14.aClass169_207 = null;
							return true;
						} else if (Static14.aClass169_207 == Static273.aClass169_134) {
							local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
							@Pc(1464) boolean local1464 = (local641 & 0x1) == 1;
							local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
							local741 = Static206.aClass2_Sub8_Sub2_1.method5178();
							if (local741.equals("")) {
								local741 = local232;
							}
							local495 = Static206.aClass2_Sub8_Sub2_1.method5178();
							local242 = Static206.aClass2_Sub8_Sub2_1.method5178();
							if (local242.equals("")) {
								local242 = local495;
							}
							if (local1464) {
								for (local1096 = 0; local1096 < Static645.anInt10075; local1096++) {
									if (Static13.aStringArray49[local1096].equals(local242)) {
										Static587.aStringArray74[local1096] = local232;
										Static13.aStringArray49[local1096] = local741;
										Static622.aStringArray79[local1096] = local495;
										Static542.aStringArray61[local1096] = local242;
										break;
									}
								}
							} else {
								Static587.aStringArray74[Static645.anInt10075] = local232;
								Static13.aStringArray49[Static645.anInt10075] = local741;
								Static622.aStringArray79[Static645.anInt10075] = local495;
								Static542.aStringArray61[Static645.anInt10075] = local242;
								Static369.aBooleanArray67[Static645.anInt10075] = (local641 & 0x2) == 2;
								Static645.anInt10075++;
							}
							Static14.aClass169_207 = null;
							Static194.anInt4135 = Static397.anInt11030;
							return true;
						} else if (Static92.aClass169_263 == Static14.aClass169_207) {
							local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
							if (local641 == 65535) {
								local641 = -1;
							}
							local77 = Static206.aClass2_Sub8_Sub2_1.method5223();
							Static449.method7282();
							Static136.method2393(local641, local77);
							Static14.aClass169_207 = null;
							return true;
						} else {
							@Pc(1634) int local1634;
							@Pc(1622) boolean local1622;
							if (Static347.aClass169_165 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
								local1622 = (local77 & 0x1) == 1;
								while (Static538.anInt9383 > Static206.aClass2_Sub8_Sub2_1.anInt5725) {
									local236 = Static206.aClass2_Sub8_Sub2_1.method5173();
									local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
									local1634 = 0;
									if (local240 != 0) {
										local1634 = Static206.aClass2_Sub8_Sub2_1.method5203();
										if (local1634 == 255) {
											local1634 = Static206.aClass2_Sub8_Sub2_1.method5172();
										}
									}
									Static572.method8705(local1622, local236, local240 - 1, local641, local1634);
								}
								Static608.anIntArray557[Static207.anInt4309++ & 0x1F] = local641;
								Static14.aClass169_207 = null;
								return true;
							}
							@Pc(1729) long local1729;
							@Pc(1746) Class2_Sub11 local1746;
							@Pc(1737) Class2_Sub11 local1737;
							if (Static14.aClass169_207 == Static318.aClass169_152) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
								if (local641 == 65535) {
									local641 = -1;
								}
								local77 = Static206.aClass2_Sub8_Sub2_1.method5223();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local236 = Static206.aClass2_Sub8_Sub2_1.method5222();
								Static449.method7282();
								if (local236 == 65535) {
									local236 = -1;
								}
								for (local240 = local641; local240 <= local236; local240++) {
									local1729 = (long) local240 + ((long) local77 << 32);
									local1737 = (Class2_Sub11) Static375.aClass335_19.method8357(local1729);
									if (local1737 != null) {
										local1746 = new Class2_Sub11(local1737.anInt1168, local433);
										local1737.method9825();
									} else if (local240 == -1) {
										local1746 = new Class2_Sub11(Static647.method9532(local77).aClass2_Sub11_2.anInt1168, local433);
									} else {
										local1746 = new Class2_Sub11(0, local433);
									}
									Static375.aClass335_19.method8356(local1746, local1729);
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static77.aClass169_43) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5172();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5226();
								if (local77 == 65535) {
									local77 = -1;
								}
								local433 = Static206.aClass2_Sub8_Sub2_1.method5222();
								if (local433 == 65535) {
									local433 = -1;
								}
								local236 = Static206.aClass2_Sub8_Sub2_1.method5172();
								Static449.method7282();
								for (local240 = local77; local240 <= local433; local240++) {
									local1729 = (long) local240 + ((long) local236 << 32);
									local1737 = (Class2_Sub11) Static375.aClass335_19.method8357(local1729);
									if (local1737 != null) {
										local1746 = new Class2_Sub11(local641, local1737.anInt1160);
										local1737.method9825();
									} else if (local240 == -1) {
										local1746 = new Class2_Sub11(local641, Static647.method9532(local236).aClass2_Sub11_2.anInt1160);
									} else {
										local1746 = new Class2_Sub11(local641, -1);
									}
									Static375.aClass335_19.method8356(local1746, local1729);
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static263.aClass169_129 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5222();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
								Static449.method7282();
								Static569.method8688((local77 << 16) + local433, local641);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static190.aClass169_98) {
								Static585.method8836(Static53.aClass368_2);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static351.aClass169_167 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5198();
								Static449.method7282();
								Static367.method6213(local77, local641);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static198.aClass169_104) {
								Static14.aClass169_207 = null;
								Static194.anInt4135 = Static397.anInt11030;
								Static480.anInt8620 = 1;
								return true;
							} else if (Static455.aClass169_196 == Static14.aClass169_207) {
								Static425.method7012(Static436.aBoolean589);
								Static14.aClass169_207 = null;
								return false;
							} else if (Static582.aClass169_247 == Static14.aClass169_207) {
								Static476.anInt8576 = Static397.anInt11030;
								local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
								if (Static538.anInt9383 != 1) {
									if (local224) {
										Static366.aClass2_Sub30_1 = new Class2_Sub30(Static206.aClass2_Sub8_Sub2_1);
									} else {
										Static396.aClass2_Sub30_2 = new Class2_Sub30(Static206.aClass2_Sub8_Sub2_1);
									}
									Static14.aClass169_207 = null;
									return true;
								}
								if (local224) {
									Static366.aClass2_Sub30_1 = null;
								} else {
									Static396.aClass2_Sub30_2 = null;
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static201.aClass169_108 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5223();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local236 = Static206.aClass2_Sub8_Sub2_1.method5222();
								Static449.method7282();
								Static568.method8644(local641, local236, local77, local433);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static257.aClass169_124 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5207();
								if (local641 == 255) {
									local641 = -1;
									local77 = -1;
								}
								Static60.method1137(local77, local641);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static465.aClass169_201) {
								Static54.anInt1089 = Static206.aClass2_Sub8_Sub2_1.method5207();
								Static672.anInt11445 = Static206.aClass2_Sub8_Sub2_1.method5201();
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static336.aClass169_159) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
								if (Static553.anInt9674 != local641) {
									Static553.anInt9674 = local641;
									Static518.method8030(Static189.aClass340_6, -1, -1);
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static173.aClass169_88 == Static14.aClass169_207) {
								Static585.method8836(Static610.aClass368_22);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static633.aClass169_255) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
								Static449.method7282();
								if (Static111.aClass357ArrayArray1[local641] != null) {
									for (local236 = local77; local236 < local433; local236++) {
										local240 = Static206.aClass2_Sub8_Sub2_1.method5161();
										if (local236 < Static111.aClass357ArrayArray1[local641].length && Static111.aClass357ArrayArray1[local641][local236] != null) {
											Static111.aClass357ArrayArray1[local641][local236].anInt10405 = local240;
										}
									}
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static74.aClass169_220 == Static14.aClass169_207) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5222();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5207();
								Static113.aClass282_1.method7362(local641, local77);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static470.aClass169_143) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5163();
								local77 = Static206.aClass2_Sub8_Sub2_1.method5174();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5223();
								Static449.method7282();
								Static404.method6630(local641, local77, local433);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static515.aClass169_217) {
								Static449.method7282();
								Static230.method4175();
								Static14.aClass169_207 = null;
								return true;
							} else if (Static84.aClass169_46 == Static14.aClass169_207) {
								Static585.method8836(Static304.aClass368_21);
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static490.aClass169_213) {
								for (local641 = 0; local641 < Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1.length; local641++) {
									if (Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local641] != null) {
										Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local641].anIntArray184 = null;
										Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local641].anInt3985 = -1;
									}
								}
								for (local77 = 0; local77 < Static487.anInt8726; local77++) {
									Static275.aClass2_Sub6Array1[local77].aClass15_Sub3_Sub3_Sub1_Sub2_1.anIntArray184 = null;
									Static275.aClass2_Sub6Array1[local77].aClass15_Sub3_Sub3_Sub1_Sub2_1.anInt3985 = -1;
								}
								Static14.aClass169_207 = null;
								return true;
							} else if (Static14.aClass169_207 == Static388.aClass169_182) {
								local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
								if (local641 == 65535) {
									local641 = -1;
								}
								local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
								local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
								local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
								Static248.method4409(local77, local236, local641, local433, 256, true);
								Static14.aClass169_207 = null;
								return true;
							} else {
								@Pc(2412) boolean local2412;
								if (Static565.aClass169_238 == Static14.aClass169_207) {
									local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
									local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
									local232 = local228;
									if (local224) {
										local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
									}
									local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
									local2412 = false;
									if (local236 <= 1) {
										if (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716) {
											local2412 = true;
										} else if (local236 <= 1 && Static329.method5442(local232)) {
											local2412 = true;
										}
									}
									if (!local2412 && Static276.anInt5122 == 0) {
										local242 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
										if (local236 == 2) {
											Static34.method582("<img=1>" + local228, 24, (String) null, local242, local228, -1, "<img=1>" + local232, 0);
										} else if (local236 == 1) {
											Static34.method582("<img=0>" + local228, 24, (String) null, local242, local228, -1, "<img=0>" + local232, 0);
										} else {
											Static34.method582(local228, 24, (String) null, local242, local228, -1, local232, 0);
										}
									}
									Static14.aClass169_207 = null;
									return true;
								}
								@Pc(2574) int local2574;
								@Pc(2556) long local2556;
								@Pc(2631) String local2631;
								if (Static14.aClass169_207 == Static646.aClass169_259) {
									local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
									local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
									local1087 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
									local1092 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
									local1096 = Static206.aClass2_Sub8_Sub2_1.method5203();
									local2556 = local1092 + (local1087 << 32);
									@Pc(2558) boolean local2558 = false;
									@Pc(2566) Class2_Sub30 local2566 = local224 ? Static366.aClass2_Sub30_1 : Static396.aClass2_Sub30_2;
									if (local2566 == null) {
										local2558 = true;
									} else {
										label2122: {
											for (local2574 = 0; local2574 < 100; local2574++) {
												if (local2556 == Static186.aLongArray9[local2574]) {
													local2558 = true;
													break label2122;
												}
											}
											if (local1096 <= 1) {
												if (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716) {
													local2558 = true;
												} else if (Static329.method5442(local228)) {
													local2558 = true;
												}
											}
										}
									}
									if (!local2558 && Static276.anInt5122 == 0) {
										Static186.aLongArray9[Static476.anInt8578] = local2556;
										Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
										local2631 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
										local1124 = local224 ? 41 : 44;
										if (local1096 == 2 || local1096 == 3) {
											Static34.method582("<img=1>" + local228, local1124, local2566.aString54, local2631, local228, -1, "<img=1>" + local228, 0);
										} else if (local1096 == 1) {
											Static34.method582("<img=0>" + local228, local1124, local2566.aString54, local2631, local228, -1, "<img=0>" + local228, 0);
										} else {
											Static34.method582(local228, local1124, local2566.aString54, local2631, local228, -1, local228, 0);
										}
									}
									Static14.aClass169_207 = null;
									return true;
								}
								@Pc(2749) boolean local2749;
								if (Static212.aClass169_117 == Static14.aClass169_207) {
									local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
									local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
									local232 = local228;
									if (local224) {
										local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
									}
									local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
									local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
									local2749 = false;
									if (local236 <= 1 && Static329.method5442(local232)) {
										local2749 = true;
									}
									if (!local2749 && Static276.anInt5122 == 0) {
										local531 = Static644.aClass186_2.method4870(local240).method4332(Static206.aClass2_Sub8_Sub2_1);
										if (local236 == 2) {
											Static34.method582("<img=1>" + local228, 25, (String) null, local531, local228, local240, "<img=1>" + local232, 0);
										} else if (local236 == 1) {
											Static34.method582("<img=0>" + local228, 25, (String) null, local531, local228, local240, "<img=0>" + local232, 0);
										} else {
											Static34.method582(local228, 25, (String) null, local531, local228, local240, local232, 0);
										}
									}
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static362.aClass169_230) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
									local1622 = (local77 & 0x1) == 1;
									Static457.method7345(local1622, local641);
									local236 = Static206.aClass2_Sub8_Sub2_1.method5211();
									for (local240 = 0; local240 < local236; local240++) {
										local1634 = Static206.aClass2_Sub8_Sub2_1.method5226();
										local1096 = Static206.aClass2_Sub8_Sub2_1.method5207();
										if (local1096 == 255) {
											local1096 = Static206.aClass2_Sub8_Sub2_1.method5167();
										}
										Static572.method8705(local1622, local240, local1634 - 1, local641, local1096);
									}
									Static608.anIntArray557[Static207.anInt4309++ & 0x1F] = local641;
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static207.aClass169_111) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5201();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5214();
									local1622 = (local641 & 0x1) == 1;
									Static645.method8760(local1622, local77);
									Static608.anIntArray557[Static207.anInt4309++ & 0x1F] = local77;
									Static14.aClass169_207 = null;
									return true;
								} else if (Static605.aClass169_249 == Static14.aClass169_207) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
									local77 = local641 >> 5;
									local433 = local641 & 0x1F;
									if (local433 == 0) {
										Static382.aClass326Array3[local77] = null;
										Static14.aClass169_207 = null;
										return true;
									}
									@Pc(2994) Class326 local2994 = new Class326();
									local2994.anInt9321 = local433;
									local2994.anInt9319 = Static206.aClass2_Sub8_Sub2_1.method5203();
									if (local2994.anInt9319 >= 0 && local2994.anInt9319 < Static200.aClass71Array21.length) {
										if (local2994.anInt9321 == 1 || local2994.anInt9321 == 10) {
											local2994.anInt9316 = Static206.aClass2_Sub8_Sub2_1.method5211();
											Static206.aClass2_Sub8_Sub2_1.anInt5725 += 6;
										} else if (local2994.anInt9321 >= 2 && local2994.anInt9321 <= 6) {
											if (local2994.anInt9321 == 2) {
												local2994.anInt9318 = 256;
												local2994.anInt9317 = 256;
											}
											if (local2994.anInt9321 == 3) {
												local2994.anInt9317 = 256;
												local2994.anInt9318 = 0;
											}
											if (local2994.anInt9321 == 4) {
												local2994.anInt9317 = 256;
												local2994.anInt9318 = 512;
											}
											if (local2994.anInt9321 == 5) {
												local2994.anInt9318 = 256;
												local2994.anInt9317 = 0;
											}
											if (local2994.anInt9321 == 6) {
												local2994.anInt9318 = 256;
												local2994.anInt9317 = 512;
											}
											local2994.anInt9321 = 2;
											local2994.anInt9323 = Static206.aClass2_Sub8_Sub2_1.method5203();
											local2994.anInt9318 += Static206.aClass2_Sub8_Sub2_1.method5211() - Static640.anInt11085 << 9;
											local2994.anInt9317 += Static206.aClass2_Sub8_Sub2_1.method5211() - Static490.anInt8763 << 9;
											local2994.anInt9325 = Static206.aClass2_Sub8_Sub2_1.method5203() << 2;
											local2994.anInt9322 = Static206.aClass2_Sub8_Sub2_1.method5211();
										}
										local2994.anInt9320 = Static206.aClass2_Sub8_Sub2_1.method5211();
										if (local2994.anInt9320 == 65535) {
											local2994.anInt9320 = -1;
										}
										Static382.aClass326Array3[local77] = local2994;
									}
									Static14.aClass169_207 = null;
									return true;
								} else if (Static311.aClass169_150 == Static14.aClass169_207) {
									if (Static102.aFrame2 != null) {
										Static347.method6004(-1, Static230.aClass2_Sub54_15.aClass4_Sub11_2.method3216(), -1, false);
									}
									@Pc(3184) byte[] local3184 = new byte[Static538.anInt9383];
									Static206.aClass2_Sub8_Sub2_1.method5237(local3184, Static538.anInt9383);
									local228 = Static4.method88(local3184, Static538.anInt9383, 0);
									Static452.method7288(Static96.aClass48_5, true, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 1, local228);
									Static14.aClass169_207 = null;
									return true;
								} else if (Static287.aClass169_138 == Static14.aClass169_207) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5186();
									Static449.method7282();
									if (local641 == -1) {
										Static5.anInt83 = -1;
										Static533.anInt9359 = -1;
									} else {
										local77 = local641 >> 14 & 0x3FFF;
										local77 -= Static640.anInt11085;
										local433 = local641 & 0x3FFF;
										local433 -= Static490.anInt8763;
										if (local77 < 0) {
											local77 = 0;
										} else if (local77 >= Static222.anInt4533) {
											local77 = Static222.anInt4533;
										}
										Static5.anInt83 = (local77 << 9) + 256;
										if (local433 < 0) {
											local433 = 0;
										} else if (local433 >= Static668.anInt11370) {
											local433 = Static668.anInt11370;
										}
										Static533.anInt9359 = (local433 << 9) + 256;
									}
									Static14.aClass169_207 = null;
									return true;
								} else if (Static557.aClass169_234 == Static14.aClass169_207) {
									Static449.method7282();
									Static187.method3578();
									Static14.aClass169_207 = null;
									return true;
								} else if (Static469.aClass169_202 == Static14.aClass169_207) {
									Static226.anInt4603 = Static206.aClass2_Sub8_Sub2_1.method5175() << 3;
									Static152.anInt3335 = Static206.aClass2_Sub8_Sub2_1.method5175() << 3;
									Static519.anInt9182 = Static206.aClass2_Sub8_Sub2_1.method5201();
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static84.aClass169_45) {
									Static460.anInt11073 = Static206.aClass2_Sub8_Sub2_1.method5203();
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static353.aClass169_168) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5207();
									local433 = Static206.aClass2_Sub8_Sub2_1.method5186();
									local236 = Static206.aClass2_Sub8_Sub2_1.method5214();
									Static449.method7282();
									Static428.method7020(local433, local236, local641, local77);
									Static14.aClass169_207 = null;
									return true;
								} else if (Static323.aClass169_155 == Static14.aClass169_207) {
									Static249.aString59 = Static538.anInt9383 > 2 ? Static206.aClass2_Sub8_Sub2_1.method5178() : Static205.aClass134_26.method3906(Static204.anInt8130);
									Static103.anInt1838 = Static538.anInt9383 <= 0 ? -1 : Static206.aClass2_Sub8_Sub2_1.method5211();
									Static14.aClass169_207 = null;
									if (Static103.anInt1838 == 65535) {
										Static103.anInt1838 = -1;
									}
									return true;
								} else if (Static14.aClass169_207 == Static455.aClass169_197) {
									Static206.aClass2_Sub8_Sub2_1.anInt5725 += 28;
									if (Static206.aClass2_Sub8_Sub2_1.method5180()) {
										Static124.method2252(Static206.aClass2_Sub8_Sub2_1.anInt5725 - 28, Static206.aClass2_Sub8_Sub2_1);
									}
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static430.aClass169_189) {
									Static585.method8836(Static213.aClass368_10);
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static651.aClass169_252) {
									Static534.anInt9700 = Static206.aClass2_Sub8_Sub2_1.method5193();
									Static145.aBoolean199 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static360.aClass169_174) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5172();
									Static449.method7282();
									Static644.method9520(local641, local77);
									Static14.aClass169_207 = null;
									return true;
								} else if (Static343.aClass169_164 == Static14.aClass169_207) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5214();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5223();
									Static449.method7282();
									Static430.method7042(local77, local641);
									Static14.aClass169_207 = null;
									return true;
								} else if (Static14.aClass169_207 == Static482.aClass169_209) {
									local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
									local77 = Static206.aClass2_Sub8_Sub2_1.method5222();
									Static113.aClass282_1.method7362(local77, local641);
									Static14.aClass169_207 = null;
									return true;
								} else {
									@Pc(3579) long local3579;
									@Pc(3593) int local3593;
									@Pc(3597) int local3597;
									@Pc(3608) int local3608;
									if (Static27.aClass169_15 == Static14.aClass169_207) {
										local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
										local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
										local232 = local228;
										if (local224) {
											local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
										}
										local3579 = Static206.aClass2_Sub8_Sub2_1.method5213();
										local1729 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
										local2556 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
										local3593 = Static206.aClass2_Sub8_Sub2_1.method5203();
										local3597 = Static206.aClass2_Sub8_Sub2_1.method5211();
										@Pc(3604) long local3604 = (local1729 << 32) + local2556;
										@Pc(3606) boolean local3606 = false;
										local3608 = 0;
										while (true) {
											if (local3608 >= 100) {
												if (local3593 <= 1 && Static329.method5442(local232)) {
													local3606 = true;
												}
												break;
											}
											if (local3604 == Static186.aLongArray9[local3608]) {
												local3606 = true;
												break;
											}
											local3608++;
										}
										if (!local3606 && Static276.anInt5122 == 0) {
											Static186.aLongArray9[Static476.anInt8578] = local3604;
											Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
											@Pc(3662) String local3662 = Static644.aClass186_2.method4870(local3597).method4332(Static206.aClass2_Sub8_Sub2_1);
											if (local3593 == 2) {
												Static34.method582("<img=1>" + local228, 20, Static524.method8169(local3579), local3662, local228, local3597, "<img=1>" + local232, 0);
											} else if (local3593 == 1) {
												Static34.method582("<img=0>" + local228, 20, Static524.method8169(local3579), local3662, local228, local3597, "<img=0>" + local232, 0);
											} else {
												Static34.method582(local228, 20, Static524.method8169(local3579), local3662, local228, local3597, local232, 0);
											}
										}
										Static14.aClass169_207 = null;
										return true;
									} else if (Static14.aClass169_207 == Static447.aClass169_195) {
										Static226.anInt4603 = Static206.aClass2_Sub8_Sub2_1.method5175() << 3;
										Static519.anInt9182 = Static206.aClass2_Sub8_Sub2_1.method5203();
										Static152.anInt3335 = Static206.aClass2_Sub8_Sub2_1.method5175() << 3;
										while (Static538.anInt9383 > Static206.aClass2_Sub8_Sub2_1.anInt5725) {
											@Pc(3770) Class368 local3770 = Static662.method8953()[Static206.aClass2_Sub8_Sub2_1.method5203()];
											Static585.method8836(local3770);
										}
										Static14.aClass169_207 = null;
										return true;
									} else if (Static14.aClass169_207 == Static198.aClass169_103) {
										local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
										Static449.method7282();
										Static87.method1541(-1, local641, -1, 3);
										Static14.aClass169_207 = null;
										return true;
									} else if (Static14.aClass169_207 == Static520.aClass169_218) {
										local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
										local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
										Static449.method7282();
										Static261.method4518(local641, local228);
										Static14.aClass169_207 = null;
										return true;
									} else if (Static14.aClass169_207 == Static57.aClass169_38) {
										Static585.method8836(Static549.aClass368_18);
										Static14.aClass169_207 = null;
										return true;
									} else if (Static14.aClass169_207 == Static341.aClass169_161) {
										local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
										local77 = Static206.aClass2_Sub8_Sub2_1.method5226();
										local433 = Static206.aClass2_Sub8_Sub2_1.method5172();
										local236 = Static206.aClass2_Sub8_Sub2_1.method5214();
										Static449.method7282();
										Static87.method1541(local641, local433, local77 | local236 << 16, 7);
										Static14.aClass169_207 = null;
										return true;
									} else {
										@Pc(4051) int local4051;
										@Pc(4079) Class263 local4079;
										if (Static14.aClass169_207 == Static30.aClass169_18) {
											Static333.anInt6062 = Static397.anInt11030;
											if (Static538.anInt9383 == 0) {
												Static207.aString53 = null;
												Static250.anInt4884 = 0;
												Static14.aClass169_207 = null;
												Static523.aClass263Array1 = null;
												Static25.aString5 = null;
												return true;
											}
											Static207.aString53 = Static206.aClass2_Sub8_Sub2_1.method5178();
											local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
											if (local224) {
												Static206.aClass2_Sub8_Sub2_1.method5178();
											}
											@Pc(3924) long local3924 = Static206.aClass2_Sub8_Sub2_1.method5213();
											Static25.aString5 = Static538.method8270(local3924);
											Static360.aByte95 = Static206.aClass2_Sub8_Sub2_1.method5175();
											local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
											if (local236 == 255) {
												Static14.aClass169_207 = null;
												return true;
											}
											Static250.anInt4884 = local236;
											@Pc(3948) Class263[] local3948 = new Class263[100];
											for (local1634 = 0; local1634 < Static250.anInt4884; local1634++) {
												local3948[local1634] = new Class263();
												local3948[local1634].aString93 = Static206.aClass2_Sub8_Sub2_1.method5178();
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												if (local224) {
													local3948[local1634].aString91 = Static206.aClass2_Sub8_Sub2_1.method5178();
												} else {
													local3948[local1634].aString91 = local3948[local1634].aString93;
												}
												local3948[local1634].aString92 = Static426.method9517(local3948[local1634].aString91);
												local3948[local1634].anInt7899 = Static206.aClass2_Sub8_Sub2_1.method5211();
												local3948[local1634].aByte104 = Static206.aClass2_Sub8_Sub2_1.method5175();
												local3948[local1634].aString94 = Static206.aClass2_Sub8_Sub2_1.method5178();
												if (local3948[local1634].aString91.equals(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29)) {
													Static47.aByte12 = local3948[local1634].aByte104;
												}
											}
											local4051 = Static250.anInt4884;
											while (local4051 > 0) {
												local244 = true;
												local4051--;
												for (local3593 = 0; local3593 < local4051; local3593++) {
													if (local3948[local3593].aString92.compareTo(local3948[local3593 + 1].aString92) > 0) {
														local4079 = local3948[local3593];
														local3948[local3593] = local3948[local3593 + 1];
														local3948[local3593 + 1] = local4079;
														local244 = false;
													}
												}
												if (local244) {
													break;
												}
											}
											Static523.aClass263Array1 = local3948;
											Static14.aClass169_207 = null;
											return true;
										} else if (Static14.aClass169_207 == Static129.aClass169_69) {
											local641 = Static206.aClass2_Sub8_Sub2_1.method5173();
											local77 = Static206.aClass2_Sub8_Sub2_1.method5172();
											local433 = Static206.aClass2_Sub8_Sub2_1.method5203();
											local741 = "";
											local495 = local741;
											if ((local433 & 0x1) != 0) {
												local741 = Static206.aClass2_Sub8_Sub2_1.method5178();
												if ((local433 & 0x2) == 0) {
													local495 = local741;
												} else {
													local495 = Static206.aClass2_Sub8_Sub2_1.method5178();
												}
											}
											local242 = Static206.aClass2_Sub8_Sub2_1.method5178();
											if (local641 == 99) {
												Static455.method7295(local242);
											} else if (local495.equals("") || !Static329.method5442(local495)) {
												Static159.method3207(local741, local242, local641, local741, local495, local77);
											} else {
												Static14.aClass169_207 = null;
												return true;
											}
											Static14.aClass169_207 = null;
											return true;
										} else if (Static14.aClass169_207 == Static412.aClass169_185) {
											local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
											if (local641 == 65535) {
												local641 = -1;
											}
											local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
											local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
											local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
											local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
											Static28.method487(local641, local77, local236, local240, local433);
											Static14.aClass169_207 = null;
											return true;
										} else if (Static95.aClass169_51 == Static14.aClass169_207) {
											local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
											local77 = Static206.aClass2_Sub8_Sub2_1.method5186();
											Static449.method7282();
											@Pc(4260) Class2_Sub20 local4260 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local77);
											local885 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local641);
											if (local885 != null) {
												Static349.method6045(false, local885, local4260 == null || local885.anInt1667 != local4260.anInt1667);
											}
											if (local4260 != null) {
												local4260.method9825();
												Static507.aClass335_33.method8356(local4260, (long) local641);
											}
											@Pc(4300) Class357 local4300 = Static647.method9532(local77);
											if (local4300 != null) {
												Static473.method7526(local4300);
											}
											local4300 = Static647.method9532(local641);
											if (local4300 != null) {
												Static473.method7526(local4300);
												Static171.method3357(true, local4300);
											}
											if (Static567.anInt9844 != -1) {
												Static525.method8170(Static567.anInt9844, 1);
											}
											Static14.aClass169_207 = null;
											return true;
										} else {
											@Pc(4384) boolean local4384;
											if (Static542.aClass169_224 == Static14.aClass169_207) {
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
												local232 = local228;
												if (local224) {
													local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
												}
												local3579 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
												local1729 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
												local264 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local4051 = Static206.aClass2_Sub8_Sub2_1.method5211();
												@Pc(4382) long local4382 = (local3579 << 32) + local1729;
												local4384 = false;
												local1124 = 0;
												while (true) {
													if (local1124 >= 100) {
														if (local264 <= 1 && Static329.method5442(local232)) {
															local4384 = true;
														}
														break;
													}
													if (Static186.aLongArray9[local1124] == local4382) {
														local4384 = true;
														break;
													}
													local1124++;
												}
												if (!local4384 && Static276.anInt5122 == 0) {
													Static186.aLongArray9[Static476.anInt8578] = local4382;
													Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
													local1177 = Static644.aClass186_2.method4870(local4051).method4332(Static206.aClass2_Sub8_Sub2_1);
													if (local264 == 2) {
														Static34.method582("<img=1>" + local228, 18, (String) null, local1177, local228, local4051, "<img=1>" + local232, 0);
													} else if (local264 == 1) {
														Static34.method582("<img=0>" + local228, 18, (String) null, local1177, local228, local4051, "<img=0>" + local232, 0);
													} else {
														Static34.method582(local228, 18, (String) null, local1177, local228, local4051, local232, 0);
													}
												}
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static401.aClass169_184) {
												Static476.anInt8576 = Static397.anInt11030;
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												@Pc(4530) Class230 local4530 = new Class230(Static206.aClass2_Sub8_Sub2_1);
												@Pc(4534) Class2_Sub30 local4534;
												if (local224) {
													local4534 = Static366.aClass2_Sub30_1;
												} else {
													local4534 = Static396.aClass2_Sub30_2;
												}
												local4530.method6217(local4534);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static288.aClass169_139) {
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												Static449.method7282();
												Static107.aBoolean133 = local224;
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static180.aClass169_95) {
												Static340.method5714();
												Static14.aClass169_207 = null;
												return false;
											} else if (Static14.aClass169_207 == Static110.aClass169_264) {
												local619 = Static206.aClass2_Sub8_Sub2_1.method5178();
												local228 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
												Static159.method3207(local619, local228, 6, local619, local619, 0);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static203.aClass169_109 == Static14.aClass169_207) {
												Static63.aBoolean68 = Static206.aClass2_Sub8_Sub2_1.method5201() == 1;
												Static14.aClass169_207 = null;
												return true;
											} else if (Static116.aClass169_60 == Static14.aClass169_207) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
												@Pc(4631) Class15_Sub3_Sub3_Sub1_Sub1 local4631;
												if (local641 == Static659.anInt11273) {
													local4631 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2;
												} else {
													local4631 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local641];
												}
												if (local4631 == null) {
													Static14.aClass169_207 = null;
													return true;
												}
												local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
												local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local2412 = (local433 & 0x8000) != 0;
												if (local4631.aString29 != null && local4631.aClass9_1 != null) {
													local2749 = false;
													if (local236 <= 1) {
														if (!local2412 && (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716)) {
															local2749 = true;
														} else if (Static329.method5442(local4631.aString29)) {
															local2749 = true;
														}
													}
													if (!local2749 && Static276.anInt5122 == 0) {
														local264 = -1;
														if (local2412) {
															local433 &= 0x7FFF;
															@Pc(4720) Class100 local4720 = Static363.method6180(Static206.aClass2_Sub8_Sub2_1);
															local264 = local4720.anInt2789;
															local531 = local4720.aClass2_Sub1_Sub8_1.method4332(Static206.aClass2_Sub8_Sub2_1);
														} else {
															local531 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
														}
														local4631.aString45 = local531.trim();
														local4631.anInt4025 = local433 >> 8;
														local4631.anInt4011 = 150;
														local4631.anInt4002 = local433 & 0xFF;
														if (local236 == 1 || local236 == 2) {
															local4051 = local2412 ? 17 : 1;
														} else {
															local4051 = local2412 ? 17 : 2;
														}
														if (local236 == 2) {
															Static34.method582("<img=1>" + local4631.method2222(), local4051, (String) null, local531, local4631.aString30, local264, "<img=1>" + local4631.method2231(), 0);
														} else if (local236 == 1) {
															Static34.method582("<img=0>" + local4631.method2222(), local4051, (String) null, local531, local4631.aString30, local264, "<img=0>" + local4631.method2231(), 0);
														} else {
															Static34.method582(local4631.method2222(), local4051, (String) null, local531, local4631.aString30, local264, local4631.method2231(), 0);
														}
													}
												}
												Static14.aClass169_207 = null;
												return true;
											} else if (Static645.aClass169_244 == Static14.aClass169_207) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
												local77 = Static206.aClass2_Sub8_Sub2_1.method5211();
												Static449.method7282();
												Static398.method6584(local77, local641);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static429.aClass169_188 == Static14.aClass169_207) {
												if (Static567.anInt9844 != -1) {
													Static525.method8170(Static567.anInt9844, 0);
												}
												Static14.aClass169_207 = null;
												return true;
											} else if (Static210.aClass169_114 == Static14.aClass169_207) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5222();
												local77 = Static206.aClass2_Sub8_Sub2_1.method5201();
												Static449.method7282();
												if (local77 == 2) {
													Static284.method4761();
												}
												Static567.anInt9844 = local641;
												Static275.method4672(local641);
												Static94.method1626(false);
												Static518.method8028(Static567.anInt9844);
												for (local433 = 0; local433 < 100; local433++) {
													Static561.aBooleanArray58[local433] = true;
												}
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static61.aClass169_39) {
												local619 = Static206.aClass2_Sub8_Sub2_1.method5178();
												@Pc(4969) Object[] local4969 = new Object[local619.length() + 1];
												for (local433 = local619.length() - 1; local433 >= 0; local433--) {
													if (local619.charAt(local433) == 's') {
														local4969[local433 + 1] = Static206.aClass2_Sub8_Sub2_1.method5178();
													} else {
														local4969[local433 + 1] = Integer.valueOf(Static206.aClass2_Sub8_Sub2_1.method5172());
													}
												}
												local4969[0] = Integer.valueOf(Static206.aClass2_Sub8_Sub2_1.method5172());
												Static449.method7282();
												@Pc(5023) Class2_Sub45 local5023 = new Class2_Sub45();
												local5023.anObjectArray2 = local4969;
												Static518.method8031(local5023);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static283.aClass169_137) {
												Static566.aClass276_4 = Static571.method8694(Static206.aClass2_Sub8_Sub2_1.method5203());
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static12.aClass169_8) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5206();
												local77 = Static206.aClass2_Sub8_Sub2_1.method5207();
												local433 = Static206.aClass2_Sub8_Sub2_1.method5186();
												Static665.anIntArray594[local77] = local433;
												Static330.anIntArray298[local77] = local641;
												Static584.anIntArray208[local77] = 1;
												local236 = Static67.anIntArray67[local77] - 1;
												for (local240 = 0; local240 < local236; local240++) {
													if (Class2_Sub53.anIntArray576[local240] <= local433) {
														Static584.anIntArray208[local77] = local240 + 2;
													}
												}
												Static615.anIntArray561[Static592.anInt10733++ & 0x1F] = local77;
												Static14.aClass169_207 = null;
												return true;
											} else if (Static627.aClass169_254 == Static14.aClass169_207) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
												Static449.method7282();
												Static14.aClass169_207 = null;
												Static36.anInt627 = local641;
												return true;
											} else if (Static14.aClass169_207 == Static548.aClass169_231) {
												local619 = Static206.aClass2_Sub8_Sub2_1.method5178();
												local1622 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												if (local1622) {
													local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
												} else {
													local228 = local619;
												}
												local236 = Static206.aClass2_Sub8_Sub2_1.method5211();
												@Pc(5169) byte local5169 = Static206.aClass2_Sub8_Sub2_1.method5175();
												local2749 = false;
												if (local5169 == -128) {
													local2749 = true;
												}
												if (local2749) {
													if (Static250.anInt4884 == 0) {
														Static14.aClass169_207 = null;
														return true;
													}
													for (local1096 = 0; Static250.anInt4884 > local1096 && (!Static523.aClass263Array1[local1096].aString91.equals(local228) || Static523.aClass263Array1[local1096].anInt7899 != local236); local1096++) {
													}
													if (local1096 < Static250.anInt4884) {
														while (Static250.anInt4884 - 1 > local1096) {
															Static523.aClass263Array1[local1096] = Static523.aClass263Array1[local1096 + 1];
															local1096++;
														}
														Static250.anInt4884--;
														Static523.aClass263Array1[Static250.anInt4884] = null;
													}
												} else {
													local531 = Static206.aClass2_Sub8_Sub2_1.method5178();
													local4079 = new Class263();
													local4079.aString93 = local619;
													local4079.aString91 = local228;
													local4079.aString92 = Static426.method9517(local4079.aString91);
													local4079.aByte104 = local5169;
													local4079.aString94 = local531;
													local4079.anInt7899 = local236;
													for (local4051 = Static250.anInt4884 - 1; local4051 >= 0; local4051--) {
														local3593 = Static523.aClass263Array1[local4051].aString92.compareTo(local4079.aString92);
														if (local3593 == 0) {
															Static523.aClass263Array1[local4051].anInt7899 = local236;
															Static523.aClass263Array1[local4051].aByte104 = local5169;
															Static523.aClass263Array1[local4051].aString94 = local531;
															if (local228.equals(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29)) {
																Static47.aByte12 = local5169;
															}
															Static333.anInt6062 = Static397.anInt11030;
															Static14.aClass169_207 = null;
															return true;
														}
														if (local3593 < 0) {
															break;
														}
													}
													if (Static523.aClass263Array1.length <= Static250.anInt4884) {
														Static14.aClass169_207 = null;
														return true;
													}
													for (local3593 = Static250.anInt4884 - 1; local3593 > local4051; local3593--) {
														Static523.aClass263Array1[local3593 + 1] = Static523.aClass263Array1[local3593];
													}
													if (Static250.anInt4884 == 0) {
														Static523.aClass263Array1 = new Class263[100];
													}
													Static523.aClass263Array1[local4051 + 1] = local4079;
													Static250.anInt4884++;
													if (local228.equals(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29)) {
														Static47.aByte12 = local5169;
													}
												}
												Static14.aClass169_207 = null;
												Static333.anInt6062 = Static397.anInt11030;
												return true;
											} else if (Static14.aClass169_207 == Static568.aClass169_239) {
												Static585.method8836(Static471.aClass368_17);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static167.aClass169_87) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
												local77 = Static206.aClass2_Sub8_Sub2_1.method5186();
												local433 = Static206.aClass2_Sub8_Sub2_1.method5226();
												Static449.method7282();
												Static87.method1541(local641, local77, local433, 5);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static504.aClass169_214 == Static14.aClass169_207) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
												if (local641 == 65535) {
													local641 = -1;
												}
												local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
												local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
												Static248.method4409(local77, local236, local641, local433, local240, false);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static663.aClass169_265 == Static14.aClass169_207) {
												Static585.method8836(Static282.aClass368_13);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static136.aClass169_71) {
												Static226.anInt4603 = Static206.aClass2_Sub8_Sub2_1.method5190() << 3;
												Static152.anInt3335 = Static206.aClass2_Sub8_Sub2_1.method5227() << 3;
												Static519.anInt9182 = Static206.aClass2_Sub8_Sub2_1.method5203();
												for (@Pc(5509) Class2_Sub47 local5509 = (Class2_Sub47) Static18.aClass335_2.method8358(); local5509 != null; local5509 = (Class2_Sub47) Static18.aClass335_2.method8355()) {
													local77 = (int) (local5509.aLong313 >> 28 & 0x3L);
													local433 = (int) (local5509.aLong313 & 0x3FFFL);
													local236 = local433 - Static640.anInt11085;
													local240 = (int) (local5509.aLong313 >> 14 & 0x3FFFL);
													local1634 = local240 - Static490.anInt8763;
													if (local77 == Static519.anInt9182 && Static226.anInt4603 <= local236 && Static226.anInt4603 + 8 > local236 && local1634 >= Static152.anInt3335 && Static152.anInt3335 + 8 > local1634) {
														local5509.method9825();
														if (local236 >= 0 && local1634 >= 0 && Static222.anInt4533 > local236 && local1634 < Static668.anInt11370) {
															Static639.method9457(local1634, Static519.anInt9182, local236);
														}
													}
												}
												@Pc(5609) Class2_Sub49 local5609;
												for (local5609 = (Class2_Sub49) Static338.aClass271_39.method7177(); local5609 != null; local5609 = (Class2_Sub49) Static338.aClass271_39.method7175()) {
													if (Static226.anInt4603 <= local5609.anInt10499 && Static226.anInt4603 + 8 > local5609.anInt10499 && local5609.anInt10505 >= Static152.anInt3335 && local5609.anInt10505 < Static152.anInt3335 + 8 && local5609.anInt10506 == Static519.anInt9182) {
														local5609.aBoolean768 = true;
													}
												}
												for (local5609 = (Class2_Sub49) Static545.aClass271_58.method7177(); local5609 != null; local5609 = (Class2_Sub49) Static545.aClass271_58.method7175()) {
													if (Static226.anInt4603 <= local5609.anInt10499 && Static226.anInt4603 + 8 > local5609.anInt10499 && Static152.anInt3335 <= local5609.anInt10505 && local5609.anInt10505 < Static152.anInt3335 + 8 && Static519.anInt9182 == local5609.anInt10506) {
														local5609.aBoolean768 = true;
													}
												}
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static36.aClass169_23) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
												Static449.method7282();
												Static563.method8553(local641);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static82.aClass169_44 == Static14.aClass169_207) {
												Static162.anInt3511 = Static397.anInt11030;
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												if (Static538.anInt9383 != 1) {
													if (local224) {
														Static242.aClass219_1 = new Class219(Static206.aClass2_Sub8_Sub2_1);
													} else {
														Static513.aClass219_2 = new Class219(Static206.aClass2_Sub8_Sub2_1);
													}
													Static14.aClass169_207 = null;
													return true;
												}
												Static14.aClass169_207 = null;
												if (local224) {
													Static242.aClass219_1 = null;
												} else {
													Static513.aClass219_2 = null;
												}
												return true;
											} else if (Static536.aClass169_119 == Static14.aClass169_207) {
												Static604.method9050();
												Static14.aClass169_207 = null;
												return true;
											} else if (Static477.aClass169_206 == Static14.aClass169_207) {
												Static162.anInt3511 = Static397.anInt11030;
												local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
												@Pc(5818) Class329 local5818 = new Class329(Static206.aClass2_Sub8_Sub2_1);
												@Pc(5822) Class219 local5822;
												if (local224) {
													local5822 = Static242.aClass219_1;
												} else {
													local5822 = Static513.aClass219_2;
												}
												local5818.method8268(local5822);
												Static14.aClass169_207 = null;
												return true;
											} else if (Static14.aClass169_207 == Static460.aClass169_258) {
												local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local77 = Static206.aClass2_Sub8_Sub2_1.method5226() << 2;
												local433 = Static206.aClass2_Sub8_Sub2_1.method5203();
												local236 = Static206.aClass2_Sub8_Sub2_1.method5207();
												local240 = Static206.aClass2_Sub8_Sub2_1.method5203();
												Static449.method7282();
												Static41.method912(local641, local240, true, local77, local236, local433);
												Static14.aClass169_207 = null;
												return true;
											} else {
												@Pc(5929) boolean local5929;
												if (Static73.aClass169_41 == Static14.aClass169_207) {
													local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
													local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
													local232 = local228;
													if (local224) {
														local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
													}
													local3579 = Static206.aClass2_Sub8_Sub2_1.method5213();
													local1729 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
													local2556 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
													local3593 = Static206.aClass2_Sub8_Sub2_1.method5203();
													@Pc(5927) long local5927 = (local1729 << 32) + local2556;
													local5929 = false;
													local1183 = 0;
													while (true) {
														if (local1183 >= 100) {
															if (local3593 <= 1) {
																if (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716) {
																	local5929 = true;
																} else if (Static329.method5442(local232)) {
																	local5929 = true;
																}
															}
															break;
														}
														if (local5927 == Static186.aLongArray9[local1183]) {
															local5929 = true;
															break;
														}
														local1183++;
													}
													if (!local5929 && Static276.anInt5122 == 0) {
														Static186.aLongArray9[Static476.anInt8578] = local5927;
														Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
														@Pc(5992) String local5992 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
														if (local3593 == 2 || local3593 == 3) {
															Static34.method582("<img=1>" + local228, 9, Static524.method8169(local3579), local5992, local228, -1, "<img=1>" + local232, 0);
														} else if (local3593 == 1) {
															Static34.method582("<img=0>" + local228, 9, Static524.method8169(local3579), local5992, local228, -1, "<img=0>" + local232, 0);
														} else {
															Static34.method582(local228, 9, Static524.method8169(local3579), local5992, local228, -1, local232, 0);
														}
													}
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static446.aClass169_193) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5172();
													Static185.aClass268_5 = Static96.aClass48_5.method1320(local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static645.aClass169_245) {
													Static585.method8836(Static165.aClass368_9);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static579.aClass169_243 == Static14.aClass169_207) {
													Static585.method8836(Static503.aClass368_16);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static535.aClass169_223 == Static14.aClass169_207) {
													Static452.method7287();
													Static14.aClass169_207 = null;
													return false;
												} else if (Static14.aClass169_207 == Static249.aClass169_122) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local433 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local236 = Static206.aClass2_Sub8_Sub2_1.method5214();
													local240 = Static206.aClass2_Sub8_Sub2_1.method5201();
													Static449.method7282();
													Static488.aBooleanArray50[local240] = true;
													Static130.anIntArray149[local240] = local433;
													Static103.anIntArray95[local240] = local641;
													Static194.anIntArray191[local240] = local77;
													Static487.anIntArray440[local240] = local236;
													Static14.aClass169_207 = null;
													return true;
												} else if (Static488.aClass169_212 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
													if (Static206.aClass2_Sub8_Sub2_1.method5203() == 0) {
														Static664.aClass113Array1[local641] = new Class113();
													} else {
														Static206.aClass2_Sub8_Sub2_1.anInt5725--;
														Static664.aClass113Array1[local641] = new Class113(Static206.aClass2_Sub8_Sub2_1);
													}
													Static14.aClass169_207 = null;
													Static66.anInt1238 = Static397.anInt11030;
													return true;
												} else if (Static14.aClass169_207 == Static397.aClass169_256) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5186();
													local433 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local236 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
													local1634 = Static206.aClass2_Sub8_Sub2_1.method5222();
													local1096 = local236 & 0x7;
													local264 = local236 >> 3 & 0xF;
													if (local264 == 15) {
														local264 = -1;
													}
													if (local77 >> 30 == 0) {
														@Pc(6324) Class336 local6324;
														@Pc(6383) Class178 local6383;
														@Pc(6348) Class178 local6348;
														if (local77 >> 29 != 0) {
															local4051 = local77 & 0xFFFF;
															@Pc(6290) Class2_Sub6 local6290 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local4051);
															if (local6290 != null) {
																@Pc(6295) Class15_Sub3_Sub3_Sub1_Sub2 local6295 = local6290.aClass15_Sub3_Sub3_Sub1_Sub2_1;
																@Pc(6300) Class358 local6300 = local6295.aClass358Array3[local433];
																if (local1634 == 65535) {
																	local1634 = -1;
																}
																local5929 = true;
																local1183 = local6300.anInt10525;
																if (local1634 != -1 && local1183 != -1) {
																	if (local1183 == local1634) {
																		local6324 = Static391.aClass319_1.method8041(local1634);
																		if (local6324.aBoolean711 && local6324.anInt9651 != -1) {
																			local6383 = Static354.aClass40_2.method1123(local6324.anInt9651);
																			@Pc(6386) int local6386 = local6383.anInt5129;
																			if (local6386 == 0 || local6386 == 2) {
																				local5929 = false;
																			} else if (local6386 == 1) {
																				local5929 = true;
																			}
																		}
																	} else {
																		local6324 = Static391.aClass319_1.method8041(local1634);
																		@Pc(6331) Class336 local6331 = Static391.aClass319_1.method8041(local1183);
																		if (local6324.anInt9651 != -1 && local6331.anInt9651 != -1) {
																			local6348 = Static354.aClass40_2.method1123(local6324.anInt9651);
																			@Pc(6354) Class178 local6354 = Static354.aClass40_2.method1123(local6331.anInt9651);
																			if (local6348.anInt5138 < local6354.anInt5138) {
																				local5929 = false;
																			}
																		}
																	}
																}
																if (local5929) {
																	local6300.anInt10525 = local1634;
																	local6300.anInt10528 = 1;
																	local6300.anInt10521 = Static62.anInt1184 + local641;
																	local6300.anInt10530 = local264;
																	local6300.anInt10522 = 0;
																	local6300.anInt10523 = local240;
																	local6300.anInt10524 = 0;
																	local6300.anInt10529 = local1096;
																	if (local6300.anInt10521 > Static62.anInt1184) {
																		local6300.anInt10522 = -1;
																	}
																	if (local6300.anInt10525 == 65535) {
																		local6300.anInt10525 = -1;
																	}
																	if (local6300.anInt10525 != -1 && Static62.anInt1184 == local6300.anInt10521) {
																		local3608 = Static391.aClass319_1.method8041(local6300.anInt10525).anInt9651;
																		if (local3608 != -1) {
																			local6383 = Static354.aClass40_2.method1123(local3608);
																			if (local6383 != null && local6383.anIntArray259 != null && !local6295.aBoolean315) {
																				Static509.method7938(local6383, local6295, 0);
																			}
																		}
																	}
																}
															}
														} else if (local77 >> 28 != 0) {
															local4051 = local77 & 0xFFFF;
															@Pc(6511) Class15_Sub3_Sub3_Sub1_Sub1 local6511;
															if (Static659.anInt11273 == local4051) {
																local6511 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2;
															} else {
																local6511 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local4051];
															}
															if (local6511 != null) {
																if (local1634 == 65535) {
																	local1634 = -1;
																}
																@Pc(6531) Class358 local6531 = local6511.aClass358Array3[local433];
																local4384 = true;
																local1124 = local6531.anInt10525;
																@Pc(6611) Class178 local6611;
																if (local1634 != -1 && local1124 != -1) {
																	@Pc(6553) Class336 local6553;
																	if (local1124 == local1634) {
																		local6553 = Static391.aClass319_1.method8041(local1634);
																		if (local6553.aBoolean711 && local6553.anInt9651 != -1) {
																			local6611 = Static354.aClass40_2.method1123(local6553.anInt9651);
																			@Pc(6614) int local6614 = local6611.anInt5129;
																			if (local6614 == 0 || local6614 == 2) {
																				local4384 = false;
																			} else if (local6614 == 1) {
																				local4384 = true;
																			}
																		}
																	} else {
																		local6553 = Static391.aClass319_1.method8041(local1634);
																		local6324 = Static391.aClass319_1.method8041(local1124);
																		if (local6553.anInt9651 != -1 && local6324.anInt9651 != -1) {
																			local6383 = Static354.aClass40_2.method1123(local6553.anInt9651);
																			local6348 = Static354.aClass40_2.method1123(local6324.anInt9651);
																			if (local6383.anInt5138 < local6348.anInt5138) {
																				local4384 = false;
																			}
																		}
																	}
																}
																if (local4384) {
																	local6531.anInt10528 = 1;
																	local6531.anInt10521 = Static62.anInt1184 + local641;
																	local6531.anInt10529 = local1096;
																	local6531.anInt10522 = 0;
																	local6531.anInt10524 = 0;
																	local6531.anInt10530 = local264;
																	local6531.anInt10525 = local1634;
																	local6531.anInt10523 = local240;
																	if (local6531.anInt10525 == 65535) {
																		local6531.anInt10525 = -1;
																	}
																	if (local6531.anInt10521 > Static62.anInt1184) {
																		local6531.anInt10522 = -1;
																	}
																	if (local6531.anInt10525 != -1 && Static62.anInt1184 == local6531.anInt10521) {
																		local1183 = Static391.aClass319_1.method8041(local6531.anInt10525).anInt9651;
																		if (local1183 != -1) {
																			local6611 = Static354.aClass40_2.method1123(local1183);
																			if (local6611 != null && local6611.anIntArray259 != null && !local6511.aBoolean315) {
																				Static509.method7938(local6611, local6511, 0);
																			}
																		}
																	}
																}
															}
														}
													} else {
														local4051 = local77 >> 28 & 0x3;
														local3593 = (local77 >> 14 & 0x3FFF) - Static640.anInt11085;
														local3597 = (local77 & 0x3FFF) - Static490.anInt8763;
														if (local3593 >= 0 && local3597 >= 0 && Static222.anInt4533 > local3593 && local3597 < Static668.anInt11370) {
															local2574 = local3593 * 512 + 256;
															local1124 = local3597 * 512 + 256;
															local1183 = local4051;
															if (local4051 < 3 && Static45.method947(local3593, local3597)) {
																local1183 = local4051 + 1;
															}
															@Pc(6801) Class15_Sub3_Sub3_Sub5 local6801 = new Class15_Sub3_Sub3_Sub5(local1634, local641, Static62.anInt1184, local4051, local1183, local2574, Static10.method154(local1124, local2574, local4051) - local240, local1124, local3593, local3593, local3597, local3597, local1096);
															Static36.aClass271_4.method7174(new Class2_Sub1_Sub14(local6801));
														}
													}
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static70.aClass169_40) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
													Static449.method7282();
													Static87.method1541(0, local641, Static659.anInt11273, 5);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static153.aClass169_78 == Static14.aClass169_207) {
													Static41.method913(Static206.aClass2_Sub8_Sub2_1.method5178());
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static44.aClass169_34) {
													Static585.method8836(Static536.aClass368_12);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static648.aClass169_260 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5226();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5167();
													local433 = Static206.aClass2_Sub8_Sub2_1.method5222();
													local236 = Static206.aClass2_Sub8_Sub2_1.method5201();
													Static449.method7282();
													Static207.method3927(local77, local433, local236, local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static613.aClass169_251 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5172();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5211();
													Static449.method7282();
													Static434.method5204(local77, local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static311.aClass169_151) {
													Static661.method9673();
													Static14.aClass169_207 = null;
													return true;
												} else if (Static292.aClass169_141 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5222();
													Static449.method7282();
													Static274.method4661(local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static27.aClass169_16) {
													@Pc(6947) byte local6947 = Static206.aClass2_Sub8_Sub2_1.method5175();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5222();
													Static113.aClass282_1.method7369(local77, local6947);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static150.aClass169_74 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5226();
													Static449.method7282();
													Static577.method8738(true, local641, local77);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static542.aClass169_225 == Static14.aClass169_207) {
													Static585.method8836(Static42.aClass368_1);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static454.aClass169_163 == Static14.aClass169_207) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5186();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5206();
													Static449.method7282();
													Static658.method9648(local77, local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static279.aClass169_136 == Static14.aClass169_207) {
													Static425.method7012(false);
													Static14.aClass169_207 = null;
													return false;
												} else if (Static14.aClass169_207 == Static151.aClass169_76) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5201();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5201();
													local433 = Static206.aClass2_Sub8_Sub2_1.method5211();
													if (local433 == 65535) {
														local433 = -1;
													}
													Static220.method4066(local641, local433, local77);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static38.aClass169_24) {
													local641 = Static206.aClass2_Sub8_Sub2_1.method5161();
													local77 = Static206.aClass2_Sub8_Sub2_1.method5201();
													local433 = Static206.aClass2_Sub8_Sub2_1.method5214();
													if (local433 == 65535) {
														local433 = -1;
													}
													Static584.method4099(local77, local433, local641);
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static354.aClass169_169) {
													local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
													local228 = Static206.aClass2_Sub8_Sub2_1.method5178();
													local232 = local228;
													if (local224) {
														local232 = Static206.aClass2_Sub8_Sub2_1.method5178();
													}
													local3579 = (long) Static206.aClass2_Sub8_Sub2_1.method5211();
													local1729 = (long) Static206.aClass2_Sub8_Sub2_1.method5161();
													local264 = Static206.aClass2_Sub8_Sub2_1.method5203();
													local1106 = local1729 + (local3579 << 32);
													local1108 = false;
													local2574 = 0;
													while (true) {
														if (local2574 >= 100) {
															if (local264 <= 1) {
																if (Static145.aBoolean199 && !Static501.aBoolean678 || Static530.aBoolean716) {
																	local1108 = true;
																} else if (Static329.method5442(local232)) {
																	local1108 = true;
																}
															}
															break;
														}
														if (Static186.aLongArray9[local2574] == local1106) {
															local1108 = true;
															break;
														}
														local2574++;
													}
													if (!local1108 && Static276.anInt5122 == 0) {
														Static186.aLongArray9[Static476.anInt8578] = local1106;
														Static476.anInt8578 = (Static476.anInt8578 + 1) % 100;
														local2631 = Static322.method5330(Static232.method9277(Static206.aClass2_Sub8_Sub2_1));
														if (local264 == 2) {
															Static34.method582("<img=1>" + local228, 7, (String) null, local2631, local228, -1, "<img=1>" + local232, 0);
														} else if (local264 == 1) {
															Static34.method582("<img=0>" + local228, 7, (String) null, local2631, local228, -1, "<img=0>" + local232, 0);
														} else {
															Static34.method582(local228, 3, (String) null, local2631, local228, -1, local232, 0);
														}
													}
													Static14.aClass169_207 = null;
													return true;
												} else if (Static14.aClass169_207 == Static598.aClass169_248) {
													Static645.anInt10075 = Static206.aClass2_Sub8_Sub2_1.method5203();
													for (local641 = 0; local641 < Static645.anInt10075; local641++) {
														Static587.aStringArray74[local641] = Static206.aClass2_Sub8_Sub2_1.method5178();
														Static13.aStringArray49[local641] = Static206.aClass2_Sub8_Sub2_1.method5178();
														if (Static13.aStringArray49[local641].equals("")) {
															Static13.aStringArray49[local641] = Static587.aStringArray74[local641];
														}
														Static622.aStringArray79[local641] = Static206.aClass2_Sub8_Sub2_1.method5178();
														Static542.aStringArray61[local641] = Static206.aClass2_Sub8_Sub2_1.method5178();
														if (Static542.aStringArray61[local641].equals("")) {
															Static542.aStringArray61[local641] = Static622.aStringArray79[local641];
														}
														Static369.aBooleanArray67[local641] = false;
													}
													Static14.aClass169_207 = null;
													Static194.anInt4135 = Static397.anInt11030;
													return true;
												} else {
													@Pc(7354) byte local7354;
													if (Static14.aClass169_207 == Static206.aClass169_110) {
														local641 = Static206.aClass2_Sub8_Sub2_1.method5207();
														local7354 = Static206.aClass2_Sub8_Sub2_1.method5190();
														Static449.method7282();
														Static277.method9743(local7354, local641);
														Static14.aClass169_207 = null;
														return true;
													} else if (Static14.aClass169_207 == Static520.aClass169_219) {
														local641 = Static206.aClass2_Sub8_Sub2_1.method5211();
														local7354 = Static206.aClass2_Sub8_Sub2_1.method5227();
														Static449.method7282();
														Static430.method7042(local7354, local641);
														Static14.aClass169_207 = null;
														return true;
													} else if (Static155.aClass169_79 == Static14.aClass169_207) {
														local641 = Static206.aClass2_Sub8_Sub2_1.method5167();
														local77 = local641 >> 28 & 0x3;
														local433 = local641 >> 14 & 0x3FFF;
														local236 = local641 & 0x3FFF;
														local240 = Static206.aClass2_Sub8_Sub2_1.method5211();
														if (local240 == 65535) {
															local240 = -1;
														}
														local1634 = Static206.aClass2_Sub8_Sub2_1.method5203();
														local1096 = local1634 >> 2;
														local264 = local1634 & 0x3;
														local4051 = Static456.anIntArray410[local1096];
														local236 -= Static490.anInt8763;
														local433 -= Static640.anInt11085;
														Static73.method1354(local264, local240, local77, local1096, local433, local4051, local236);
														Static14.aClass169_207 = null;
														return true;
													} else if (Static402.aClass169_204 == Static14.aClass169_207) {
														local641 = Static206.aClass2_Sub8_Sub2_1.method5223();
														Static449.method7282();
														@Pc(7490) Class2_Sub20 local7490 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local641);
														if (local7490 != null) {
															Static349.method6045(false, local7490, true);
														}
														if (Static122.aClass357_40 != null) {
															Static473.method7526(Static122.aClass357_40);
															Static122.aClass357_40 = null;
														}
														Static14.aClass169_207 = null;
														return true;
													} else if (Static338.aClass169_160 == Static14.aClass169_207) {
														local224 = Static206.aClass2_Sub8_Sub2_1.method5203() == 1;
														@Pc(7529) byte[] local7529 = new byte[Static538.anInt9383 - 1];
														Static206.aClass2_Sub8_Sub2_1.method5176(local7529, 0, Static538.anInt9383 - 1);
														Static121.method2242(local224, local7529);
														Static14.aClass169_207 = null;
														return true;
													} else {
														Static165.method3319((Throwable) null, "T1 - " + (Static14.aClass169_207 == null ? -1 : Static14.aClass169_207.method4517()) + "," + (Static275.aClass169_135 == null ? -1 : Static275.aClass169_135.method4517()) + "," + (Static446.aClass169_194 == null ? -1 : Static446.aClass169_194.method4517()) + " - " + Static538.anInt9383);
														Static425.method7012(false);
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

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method6558(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static10.method153(arg0.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZII)V")
	public static void method6560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static626.method9304(Static205.aClass134_12.method3906(Static204.anInt8130), arg0, arg1);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	public static void method6561() {
		if (!Static358.aBoolean520) {
			Static358.aBoolean520 = true;
			Static584.aFloat89 += (-24.0F - Static584.aFloat89) / 2.0F;
			Static561.aBoolean715 = true;
		}
	}
}
