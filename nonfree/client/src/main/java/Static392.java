import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public static int anInt6271 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method4989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ya;IZ)V")
	public static void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static99.anInt2002 == 0 || Static238.anInt4080 == 0) {
			return;
		}
		arg1.H(Static418.anInt6636, Static163.anInt4483, Static99.anInt2002, Static238.anInt4080);
		arg1.OA(Static408.anInt6458, Static12.anInt145, Static99.anInt2002, Static238.anInt4080);
		@Pc(43) Class33 local43 = arg1.method5293();
		local43.s(Static401.anInt6374, Static438.anInt7313, Static442.anInt7338, Static123.anInt2422, Static412.anInt6545, Static112.anInt2261);
		arg1.ea(local43);
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(83) int local83;
		@Pc(92) int local92;
		@Pc(100) int local100;
		@Pc(115) int[] local115;
		@Pc(146) int local146;
		@Pc(155) int local155;
		if (Static149.aClass165Array7 != null) {
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			@Pc(63) int local63 = arg1.a();
			local71 = (arg0 - Static418.anInt6636) * local63 / Static99.anInt2002;
			local80 = local63 * (arg2 - Static163.anInt4483) / Static238.anInt4080;
			local83 = arg1.YA();
			local92 = (arg0 - Static418.anInt6636) * local83 / Static99.anInt2002;
			local100 = local83 * (arg2 - Static163.anInt4483) / Static238.anInt4080;
			local115 = new int[] { local71, local80, local63 };
			local43.m(local115);
			@Pc(133) int[] local133 = new int[] { local92, local100, local83 };
			local43.m(local133);
			@Pc(138) float local138 = 0.0F;
			local146 = local133[0] - local115[0];
			local155 = local133[1] - local115[1];
			@Pc(164) int local164 = local133[2] - local115[2];
			while (local138 < 1.0F) {
				@Pc(177) int local177 = (int) (local138 * (float) local146 + (float) local115[0]);
				@Pc(181) int local181 = local177 >> 7;
				@Pc(192) int local192 = (int) (local138 * (float) local164 + (float) local115[2]);
				@Pc(196) int local196 = local192 >> 7;
				if (local181 > 0 && local196 > 0 && local181 < Static333.anInt3375 && local196 < Static102.anInt2086) {
					@Pc(216) int local216 = Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102;
					if (local216 < 3 && (Static347.aByteArrayArrayArray16[1][local181][local196] & 0x2) != 0) {
						local216++;
					}
					if ((float) Static149.aClass165Array7[local216].a(local177, local192) < (float) local115[1] + (float) local155 * local138) {
						local58 = local177 + (Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() - 1 << 6) >> 7;
						local60 = local192 + (Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() - 1 << 6) >> 7;
						break;
					}
				}
				local138 = (float) ((double) local138 + 0.01D);
			}
			if (local58 != -1 && local60 != -1) {
				if (Static402.aBoolean412 && (Static180.anInt3240 & 0x40) != 0) {
					@Pc(342) Class95 local342 = Static407.method5110(Static228.anInt3966, Static68.anInt1325);
					if (local342 == null) {
						Static23.method249();
					} else {
						Static181.method2635(local58, Static139.aString32, Static250.anInt4255, false, -1, " ->", local60, 0L, true, 51);
					}
				} else {
					if (Static55.aClass137_1 == Static191.aClass137_3) {
						Static181.method2635(local58, Static246.aClass55_94.method1205(Static5.anInt20), -1, false, -1, "", local60, 0L, true, 58);
					}
					Static181.method2635(local58, Static261.aString49, Static149.anInt5367, false, -1, "", local60, 0L, true, 4);
				}
			}
		}
		@Pc(362) Class169 local362 = Static256.aClass169_6;
		for (@Pc(367) Class28_Sub4 local367 = (Class28_Sub4) local362.method3598(); local367 != null; local367 = (Class28_Sub4) local362.method3597()) {
			if ((Static258.aBoolean277 || local367.anInt4315 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) && local367.method3403(arg2, arg1, arg0)) {
				@Pc(495) int local495;
				if (local367.aClass26_1 instanceof Class26_Sub2_Sub4_Sub2) {
					@Pc(395) Class26_Sub2_Sub4_Sub2 local395 = (Class26_Sub2_Sub4_Sub2) local367.aClass26_1;
					local71 = local395.method5512();
					if ((local71 & 0x1) == 0 && (local395.anInt7388 & 0x7F) == 0 && (local395.anInt7383 & 0x7F) == 0 || (local71 & 0x1) == 1 && (local395.anInt7388 & 0x7F) == 64 && (local395.anInt7383 & 0x7F) == 64) {
						local80 = local395.anInt7388 - (local395.method5512() - 1 << 6);
						local83 = local395.anInt7383 - (local395.method5512() - 1 << 6);
						@Pc(507) int local507;
						for (local92 = 0; local92 < Static56.anInt943; local92++) {
							@Pc(468) Class26_Sub2_Sub4_Sub1 local468 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local92]];
							if (local468 != null && Static274.anInt4617 != local468.anInt7087 && local468.aBoolean476) {
								local495 = local468.anInt7388 - (local468.aClass249_1.anInt6507 - 1 << 6);
								local507 = local468.anInt7383 - (local468.aClass249_1.anInt6507 - 1 << 6);
								if (local80 <= local495 && local468.aClass249_1.anInt6507 <= local395.method5512() - (local495 - local80 >> 7) && local83 <= local507 && local468.aClass249_1.anInt6507 <= local395.method5512() - (local507 - local83 >> 7)) {
									Static167.method2415(local468, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 != local367.anInt4315);
									local468.anInt7087 = Static274.anInt4617;
								}
							}
						}
						local100 = Static36.anInt647;
						local115 = Static362.anIntArray533;
						for (local507 = 0; local507 < local100; local507++) {
							@Pc(578) Class26_Sub2_Sub4_Sub2 local578 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local115[local507]];
							if (local578 != null && local578.anInt7087 != Static274.anInt4617 && local578 != local395 && local578.aBoolean476) {
								local146 = local578.anInt7388 - (local578.method5512() - 1 << 6);
								local155 = local578.anInt7383 - (local578.method5512() - 1 << 6);
								if (local146 >= local80 && local578.method5512() <= local395.method5512() - (local146 - local80 >> 7) && local83 <= local155 && local578.method5512() <= local395.method5512() - (local155 - local83 >> 7)) {
									Static369.method4729(local578, local367.anInt4315 != Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102);
									local578.anInt7087 = Static274.anInt4617;
								}
							}
						}
					}
					if (Static274.anInt4617 == local395.anInt7087) {
						continue;
					}
					Static369.method4729(local395, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 != local367.anInt4315);
					local395.anInt7087 = Static274.anInt4617;
				}
				if (local367.aClass26_1 instanceof Class26_Sub2_Sub4_Sub1) {
					@Pc(706) Class26_Sub2_Sub4_Sub1 local706 = (Class26_Sub2_Sub4_Sub1) local367.aClass26_1;
					if (local706.aClass249_1 != null) {
						if ((local706.aClass249_1.anInt6507 & 0x1) == 0 && (local706.anInt7388 & 0x7F) == 0 && (local706.anInt7383 & 0x7F) == 0 || (local706.aClass249_1.anInt6507 & 0x1) == 1 && (local706.anInt7388 & 0x7F) == 64 && (local706.anInt7383 & 0x7F) == 64) {
							local71 = local706.anInt7388 - (local706.aClass249_1.anInt6507 - 1 << 6);
							local80 = local706.anInt7383 - (local706.aClass249_1.anInt6507 - 1 << 6);
							for (local83 = 0; local83 < Static56.anInt943; local83++) {
								@Pc(788) Class26_Sub2_Sub4_Sub1 local788 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local83]];
								if (local788 != null && local788.anInt7087 != Static274.anInt4617 && local788 != local706 && local788.aBoolean476) {
									local100 = local788.anInt7388 - (local788.aClass249_1.anInt6507 - 1 << 6);
									local495 = local788.anInt7383 - (local788.aClass249_1.anInt6507 - 1 << 6);
									if (local71 <= local100 && local788.aClass249_1.anInt6507 <= local706.aClass249_1.anInt6507 - (local100 - local71 >> 7) && local80 <= local495 && local706.aClass249_1.anInt6507 - (local495 - local80 >> 7) >= local788.aClass249_1.anInt6507) {
										Static167.method2415(local788, local367.anInt4315 != Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102);
										local788.anInt7087 = Static274.anInt4617;
									}
								}
							}
							local92 = Static36.anInt647;
							@Pc(883) int[] local883 = Static362.anIntArray533;
							for (local495 = 0; local495 < local92; local495++) {
								@Pc(893) Class26_Sub2_Sub4_Sub2 local893 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local883[local495]];
								if (local893 != null && Static274.anInt4617 != local893.anInt7087 && local893.aBoolean476) {
									@Pc(916) int local916 = local893.anInt7388 - (local893.method5512() - 1 << 6);
									local146 = local893.anInt7383 - (local893.method5512() - 1 << 6);
									if (local916 >= local71 && local893.method5512() <= local706.aClass249_1.anInt6507 - (local916 - local71 >> 7) && local146 >= local80 && local893.method5512() <= local706.aClass249_1.anInt6507 - (local146 - local80 >> 7)) {
										Static369.method4729(local893, local367.anInt4315 != Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102);
										local893.anInt7087 = Static274.anInt4617;
									}
								}
							}
						}
						if (local706.anInt7087 == Static274.anInt4617) {
							continue;
						}
						Static167.method2415(local706, Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 != local367.anInt4315);
						local706.anInt7087 = Static274.anInt4617;
					}
				}
				if (local367.aClass26_1 instanceof Class26_Sub5_Sub1) {
					@Pc(1036) Class7_Sub34 local1036 = (Class7_Sub34) Static345.aClass164_33.method3512((long) (local367.anInt4314 | local367.anInt4312 << 14 | local367.anInt4315 << 28));
					if (local1036 != null) {
						for (@Pc(1044) Class7_Sub24 local1044 = (Class7_Sub24) local1036.aClass85_31.method2002(); local1044 != null; local1044 = (Class7_Sub24) local1036.aClass85_31.method2012()) {
							@Pc(1052) Class45 local1052 = Static259.aClass206_2.method4320(local1044.anInt3082);
							if (!Static402.aBoolean412) {
								if (local367.anInt4315 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) {
									@Pc(1066) String[] local1066 = local1052.aStringArray4;
									for (local92 = 4; local92 >= 0; local92--) {
										if (local1066 != null && local1066[local92] != null) {
											@Pc(1078) byte local1078 = 0;
											if (local92 == 0) {
												local1078 = 8;
											}
											local495 = Static357.anInt5687;
											if (local92 == 1) {
												local1078 = 30;
											}
											if (local92 == 2) {
												local1078 = 12;
											}
											if (local92 == 3) {
												local1078 = 44;
											}
											if (local92 == 4) {
												local1078 = 50;
											}
											if (local1052.anInt944 == local92) {
												local495 = local1052.anInt972;
											}
											if (local92 == local1052.anInt990) {
												local495 = local1052.anInt968;
											}
											Static181.method2635(local367.anInt4314, local1066[local92], local495, false, -1, "<col=ff9040>" + local1052.aString6, local367.anInt4312, (long) local1044.anInt3082, true, local1078);
										}
									}
								}
								Static181.method2635(local367.anInt4314, Static286.aClass55_89.method1205(Static5.anInt20), Static296.anInt4919, local367.anInt4315 != Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, -1, "<col=ff9040>" + local1052.aString6, local367.anInt4312, (long) local1044.anInt3082, true, 1009);
							} else if (local367.anInt4315 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) {
								@Pc(1217) Class256 local1217 = Static141.anInt2697 == -1 ? null : Static443.aClass193_4.method4068(Static141.anInt2697);
								if ((Static180.anInt3240 & 0x1) != 0 && (local1217 == null || local1052.method769(Static141.anInt2697, local1217.anInt6961) != local1217.anInt6961)) {
									Static181.method2635(local367.anInt4314, Static139.aString32, Static250.anInt4255, false, -1, Static73.aString7 + " -> <col=ff9040>" + local1052.aString6, local367.anInt4312, (long) local1044.anInt3082, true, 15);
								}
							}
						}
					}
				}
				if (local367.aClass26_1 instanceof Interface5) {
					@Pc(1281) Interface5 local1281 = (Interface5) local367.aClass26_1;
					@Pc(1288) Class189 local1288 = Static411.aClass142_4.method3148(local1281.method5731());
					if (local1288.anIntArray448 != null) {
						local1288 = local1288.method4038(Static224.aClass239_7);
					}
					if (local1288 != null) {
						if (!Static402.aBoolean412) {
							if (Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 == local367.anInt4315) {
								@Pc(1308) String[] local1308 = local1288.aStringArray39;
								if (local1308 != null) {
									for (local83 = 4; local83 >= 0; local83--) {
										if (local1308[local83] != null) {
											@Pc(1320) short local1320 = 0;
											local100 = Static357.anInt5687;
											if (local83 == 0) {
												local1320 = 10;
											}
											if (local83 == 1) {
												local1320 = 60;
											}
											if (local83 == 2) {
												local1320 = 23;
											}
											if (local83 == 3) {
												local1320 = 47;
											}
											if (local83 == local1288.anInt5086) {
												local100 = local1288.anInt5078;
											}
											if (local83 == 4) {
												local1320 = 1012;
											}
											if (local83 == local1288.anInt5074) {
												local100 = local1288.anInt5100;
											}
											Static181.method2635(local367.anInt4314, local1308[local83], local100, false, -1, "<col=00ffff>" + local1288.aString50, local367.anInt4312, Static43.method591(local1281, local367.anInt4314, local367.anInt4312), true, local1320);
										}
									}
								}
							}
							Static181.method2635(local367.anInt4314, Static286.aClass55_89.method1205(Static5.anInt20), Static296.anInt4919, local367.anInt4315 != Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102, -1, "<col=00ffff>" + local1288.aString50, local367.anInt4312, (long) local1288.anInt5088, true, 1011);
						} else if (Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 == local367.anInt4315) {
							@Pc(1463) Class256 local1463 = Static141.anInt2697 == -1 ? null : Static443.aClass193_4.method4068(Static141.anInt2697);
							if ((Static180.anInt3240 & 0x4) != 0 && (local1463 == null || local1288.method4018(local1463.anInt6961, Static141.anInt2697) != local1463.anInt6961)) {
								Static181.method2635(local367.anInt4314, Static139.aString32, Static250.anInt4255, false, -1, Static73.aString7 + " -> <col=00ffff>" + local1288.aString50, local367.anInt4312, Static43.method591(local1281, local367.anInt4314, local367.anInt4312), true, 46);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public static void method4991(@OriginalArg(1) int arg0) {
		Static89.anInt1838 = arg0;
		@Pc(7) Class126 local7 = Static36.aClass126_4;
		synchronized (Static36.aClass126_4) {
			Static36.aClass126_4.method2827();
		}
		local7 = Static281.aClass126_61;
		synchronized (Static281.aClass126_61) {
			Static281.aClass126_61.method2827();
		}
	}
}
