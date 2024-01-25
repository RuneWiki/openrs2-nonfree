import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_68 = new Class223(8);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	public static int anInt9473 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method7777(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static80.anInt1664 == 0 || Static483.anInt8145 == 0) {
			return;
		}
		arg0.m(Static425.anInt7333, Static153.anInt3365, Static80.anInt1664, Static483.anInt8145);
		arg0.ca(Static86.anInt2258, Static149.anInt3333, Static80.anInt1664, Static483.anInt8145);
		@Pc(33) Class134 local33 = arg0.method6788();
		local33.pa(Static192.anInt4179, Static414.anInt7167, Static385.anInt6803, Static534.anInt9046, Static149.anInt3331, Static231.anInt4730);
		arg0.method6823(local33);
		@Pc(53) int local53;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(92) int local92;
		@Pc(107) int[] local107;
		@Pc(139) int local139;
		@Pc(148) int local148;
		if (Static45.aClass16Array1 != null) {
			@Pc(48) int local48 = -1;
			@Pc(50) int local50 = -1;
			local53 = arg0.U();
			local62 = local53 * (arg1 - Static425.anInt7333) / Static80.anInt1664;
			local71 = (arg2 - Static153.anInt3365) * local53 / Static483.anInt8145;
			local74 = arg0.IA();
			local83 = local74 * (arg1 - Static425.anInt7333) / Static80.anInt1664;
			local92 = local74 * (arg2 - Static153.anInt3365) / Static483.anInt8145;
			local107 = new int[] { local62, local71, local53 };
			local33.O(local107);
			@Pc(125) int[] local125 = new int[] { local83, local92, local74 };
			local33.O(local125);
			@Pc(130) float local130 = 0.0F;
			local139 = local125[0] - local107[0];
			local148 = local125[1] - local107[1];
			@Pc(156) int local156 = local125[2] - local107[2];
			while (local130 < 1.0F) {
				@Pc(169) int local169 = (int) (local130 * (float) local139 + (float) local107[0]);
				@Pc(173) int local173 = local169 >> 9;
				@Pc(184) int local184 = (int) (local130 * (float) local156 + (float) local107[2]);
				@Pc(188) int local188 = local184 >> 9;
				if (local173 > 0 && local188 > 0 && Static38.anInt740 > local173 && Static38.anInt741 > local188) {
					@Pc(212) int local212 = Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101;
					if (local212 < 3 && (Static97.aByteArrayArrayArray19[1][local173][local188] & 0x2) != 0) {
						local212++;
					}
					if ((float) Static45.aClass16Array1[local212].sa(local169, local184) < (float) local148 * local130 + (float) local107[1]) {
						local48 = (Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() - 1 << 8) + local169 >> 9;
						local50 = (Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() - 1 << 8) + local184 >> 9;
						break;
					}
				}
				local130 = (float) ((double) local130 + 0.01D);
			}
			if (local48 != -1 && local50 != -1) {
				if (Static524.aBoolean617 && (Static360.anInt6361 & 0x40) != 0) {
					@Pc(339) Class115 local339 = Static279.method4432(Static539.anInt9099, Static143.anInt3245);
					if (local339 == null) {
						Static400.method5802();
					} else {
						Static100.method7901(local50, false, true, " ->", 0L, 17, local48, -1, Static178.anInt3780, Static404.aString82);
					}
				} else {
					if (Static538.aClass263_5 == Static27.aClass263_1) {
						Static100.method7901(local50, false, true, "", 0L, 2, local48, -1, -1, Static275.aClass198_26.method4407(Static56.anInt953));
					}
					Static100.method7901(local50, false, true, "", 0L, 58, local48, -1, Static528.anInt8988, Static245.aString59);
				}
			}
		}
		@Pc(359) Class8 local359 = Static350.aClass8_4;
		for (@Pc(364) Class26_Sub6 local364 = (Class26_Sub6) local359.method110(); local364 != null; local364 = (Class26_Sub6) local359.method113()) {
			if ((Static297.aBoolean412 || local364.anInt6988 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) && local364.method5822(arg2, arg0, arg1)) {
				@Pc(492) int local492;
				@Pc(504) int local504;
				if (local364.aClass10_1 instanceof Class10_Sub1_Sub2_Sub2) {
					@Pc(388) Class10_Sub1_Sub2_Sub2 local388 = (Class10_Sub1_Sub2_Sub2) local364.aClass10_1;
					local62 = local388.method7021();
					if ((local62 & 0x1) == 0 && (local388.anInt8934 & 0x1FF) == 0 && (local388.anInt8929 & 0x1FF) == 0 || (local62 & 0x1) == 1 && (local388.anInt8934 & 0x1FF) == 256 && (local388.anInt8929 & 0x1FF) == 256) {
						local71 = local388.anInt8934 - (local388.method7021() - 1 << 8);
						local74 = local388.anInt8929 - (local388.method7021() - 1 << 8);
						for (local83 = 0; local83 < Static428.anInt7363; local83++) {
							@Pc(466) Class4_Sub50 local466 = (Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local83]);
							if (local466 != null) {
								@Pc(471) Class10_Sub1_Sub2_Sub1 local471 = local466.aClass10_Sub1_Sub2_Sub1_1;
								if (local471.anInt8520 != Static237.anInt7561 && local471.aBoolean591) {
									local492 = local471.anInt8934 - (local471.aClass54_1.anInt1260 - 1 << 8);
									local504 = local471.anInt8929 - (local471.aClass54_1.anInt1260 - 1 << 8);
									if (local71 <= local492 && local471.aClass54_1.anInt1260 <= local388.method7021() - (local492 - local71 >> 9) && local74 <= local504 && local471.aClass54_1.anInt1260 <= local388.method7021() - (local504 - local74 >> 9)) {
										Static274.method4403(local471, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988);
										local471.anInt8520 = Static237.anInt7561;
									}
								}
							}
						}
						local92 = Static272.anInt5182;
						local107 = Static362.anIntArray519;
						for (local492 = 0; local492 < local92; local492++) {
							@Pc(583) Class10_Sub1_Sub2_Sub2 local583 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local107[local492]];
							if (local583 != null && local583.anInt8520 != Static237.anInt7561 && local583 != local388 && local583.aBoolean591) {
								local139 = local583.anInt8934 - (local583.method7021() - 1 << 8);
								local148 = local583.anInt8929 - (local583.method7021() - 1 << 8);
								if (local71 <= local139 && local583.method7021() <= local388.method7021() - (local139 - local71 >> 9) && local74 <= local148 && local583.method7021() <= local388.method7021() - (local148 - local74 >> 9)) {
									Static116.method2400(local364.anInt6988 != Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, local583);
									local583.anInt8520 = Static237.anInt7561;
								}
							}
						}
					}
					if (Static237.anInt7561 == local388.anInt8520) {
						continue;
					}
					Static116.method2400(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988, local388);
					local388.anInt8520 = Static237.anInt7561;
				}
				@Pc(830) int local830;
				if (local364.aClass10_1 instanceof Class10_Sub1_Sub2_Sub1) {
					@Pc(716) Class10_Sub1_Sub2_Sub1 local716 = (Class10_Sub1_Sub2_Sub1) local364.aClass10_1;
					if (local716.aClass54_1 != null) {
						if ((local716.aClass54_1.anInt1260 & 0x1) == 0 && (local716.anInt8934 & 0x1FF) == 0 && (local716.anInt8929 & 0x1FF) == 0 || (local716.aClass54_1.anInt1260 & 0x1) == 1 && (local716.anInt8934 & 0x1FF) == 256 && (local716.anInt8929 & 0x1FF) == 256) {
							local62 = local716.anInt8934 - (local716.aClass54_1.anInt1260 - 1 << 8);
							local71 = local716.anInt8929 - (local716.aClass54_1.anInt1260 - 1 << 8);
							for (local74 = 0; local74 < Static428.anInt7363; local74++) {
								@Pc(797) Class4_Sub50 local797 = (Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local74]);
								if (local797 != null) {
									@Pc(802) Class10_Sub1_Sub2_Sub1 local802 = local797.aClass10_Sub1_Sub2_Sub1_1;
									if (local802.anInt8520 != Static237.anInt7561 && local802 != local716 && local802.aBoolean591) {
										local830 = local802.anInt8934 - (local802.aClass54_1.anInt1260 - 1 << 8);
										local492 = local802.anInt8929 - (local802.aClass54_1.anInt1260 - 1 << 8);
										if (local830 >= local62 && local716.aClass54_1.anInt1260 - (local830 - local62 >> 9) >= local802.aClass54_1.anInt1260 && local492 >= local71 && local802.aClass54_1.anInt1260 <= local716.aClass54_1.anInt1260 - (local492 - local71 >> 9)) {
											Static274.method4403(local802, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988);
											local802.anInt8520 = Static237.anInt7561;
										}
									}
								}
							}
							local83 = Static272.anInt5182;
							@Pc(908) int[] local908 = Static362.anIntArray519;
							for (local830 = 0; local830 < local83; local830++) {
								@Pc(918) Class10_Sub1_Sub2_Sub2 local918 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local908[local830]];
								if (local918 != null && Static237.anInt7561 != local918.anInt8520 && local918.aBoolean591) {
									local504 = local918.anInt8934 - (local918.method7021() - 1 << 8);
									local139 = local918.anInt8929 - (local918.method7021() - 1 << 8);
									if (local504 >= local62 && local918.method7021() <= local716.aClass54_1.anInt1260 - (local504 - local62 >> 9) && local71 <= local139 && local918.method7021() <= local716.aClass54_1.anInt1260 - (local139 - local71 >> 9)) {
										Static116.method2400(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988, local918);
										local918.anInt8520 = Static237.anInt7561;
									}
								}
							}
						}
						if (local716.anInt8520 == Static237.anInt7561) {
							continue;
						}
						Static274.method4403(local716, local364.anInt6988 != Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101);
						local716.anInt8520 = Static237.anInt7561;
					}
				}
				if (local364.aClass10_1 instanceof Class10_Sub3_Sub1) {
					local53 = local364.anInt6990 + Static373.anInt6695;
					local62 = Static6.anInt97 + local364.anInt6987;
					@Pc(1070) Class4_Sub15 local1070 = (Class4_Sub15) Static486.aClass183_34.method4289((long) (local62 << 14 | local364.anInt6988 << 28 | local53));
					if (local1070 != null) {
						for (@Pc(1078) Class4_Sub38 local1078 = (Class4_Sub38) local1070.aClass124_18.method3274(); local1078 != null; local1078 = (Class4_Sub38) local1070.aClass124_18.method3266()) {
							@Pc(1086) Class222 local1086 = Static195.aClass99_1.method2798(local1078.anInt7346);
							if (Static524.aBoolean617 && local364.anInt6988 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) {
								@Pc(1108) Class59 local1108 = Static466.anInt7871 == -1 ? null : Static53.aClass152_1.method3679(Static466.anInt7871);
								if ((Static360.anInt6361 & 0x1) != 0 && (local1108 == null || local1086.method4922(Static466.anInt7871, local1108.anInt1575) != local1108.anInt1575)) {
									Static100.method7901(local364.anInt6987, false, true, Static238.aString94 + " -> <col=ff9040>" + local1086.aString72, (long) local1078.anInt7346, 25, local364.anInt6990, -1, Static178.anInt3780, Static404.aString82);
								}
							}
							if (Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 == local364.anInt6988) {
								@Pc(1168) String[] local1168 = local1086.aStringArray27;
								for (local830 = 4; local830 >= 0; local830--) {
									if (local1168 != null && local1168[local830] != null) {
										@Pc(1180) byte local1180 = 0;
										if (local830 == 0) {
											local1180 = 8;
										}
										local504 = Static349.anInt6115;
										if (local830 == 1) {
											local1180 = 20;
										}
										if (local830 == 2) {
											local1180 = 18;
										}
										if (local830 == 3) {
											local1180 = 44;
										}
										if (local830 == 4) {
											local1180 = 51;
										}
										if (local830 == local1086.anInt5790) {
											local504 = local1086.anInt5786;
										}
										if (local830 == local1086.anInt5809) {
											local504 = local1086.anInt5816;
										}
										Static100.method7901(local364.anInt6987, false, true, "<col=ff9040>" + local1086.aString72, (long) local1078.anInt7346, local1180, local364.anInt6990, -1, local504, local1168[local830]);
									}
								}
							}
							Static100.method7901(local364.anInt6987, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988, true, "<col=ff9040>" + local1086.aString72, (long) local1078.anInt7346, 1012, local364.anInt6990, -1, Static93.anInt2380, Static275.aClass198_21.method4407(Static56.anInt953));
						}
					}
				}
				if (local364.aClass10_1 instanceof Interface17) {
					@Pc(1330) Interface17 local1330 = (Interface17) local364.aClass10_1;
					@Pc(1337) Class25 local1337 = Static553.aClass288_4.method6419(local1330.method7743());
					if (local1337.anIntArray115 != null) {
						local1337 = local1337.method578(Static511.aClass335_2);
					}
					if (local1337 != null) {
						if (Static524.aBoolean617 && local364.anInt6988 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) {
							@Pc(1369) Class59 local1369 = Static466.anInt7871 == -1 ? null : Static53.aClass152_1.method3679(Static466.anInt7871);
							if ((Static360.anInt6361 & 0x4) != 0 && (local1369 == null || local1337.method560(local1369.anInt1575, Static466.anInt7871) != local1369.anInt1575)) {
								Static100.method7901(local364.anInt6987, false, true, Static238.aString94 + " -> <col=00ffff>" + local1337.aString9, Static281.method4446(local1330, local364.anInt6990, local364.anInt6987), 16, local364.anInt6990, -1, Static178.anInt3780, Static404.aString82);
							}
						}
						if (local364.anInt6988 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) {
							@Pc(1437) String[] local1437 = local1337.aStringArray2;
							if (local1437 != null) {
								for (local74 = 4; local74 >= 0; local74--) {
									if (local1437[local74] != null) {
										@Pc(1449) short local1449 = 0;
										local92 = Static349.anInt6115;
										if (local74 == 0) {
											local1449 = 3;
										}
										if (local74 == 1) {
											local1449 = 13;
										}
										if (local74 == 2) {
											local1449 = 49;
										}
										if (local74 == 3) {
											local1449 = 11;
										}
										if (local74 == 4) {
											local1449 = 1004;
										}
										if (local1337.anInt610 == local74) {
											local92 = local1337.anInt622;
										}
										if (local74 == local1337.anInt626) {
											local92 = local1337.anInt628;
										}
										Static100.method7901(local364.anInt6987, false, true, "<col=00ffff>" + local1337.aString9, Static281.method4446(local1330, local364.anInt6990, local364.anInt6987), local1449, local364.anInt6990, -1, local92, local1437[local74]);
									}
								}
							}
						}
						Static100.method7901(local364.anInt6987, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local364.anInt6988, true, "<col=00ffff>" + local1337.aString9, (long) local1337.anInt605, 1010, local364.anInt6990, -1, Static93.anInt2380, Static275.aClass198_21.method4407(Static56.anInt953));
					}
				}
			}
		}
	}
}
