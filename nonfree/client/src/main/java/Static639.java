import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Lclient!ip;")
	public static Class3_Sub4_Sub13 aClass3_Sub4_Sub13_4;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_150 = new Class200(79, -2);

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	public static int anInt10179 = 0;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "[I")
	public static final int[] anIntArray664 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "Lclient!ae;")
	public static final Class7 aClass7_8 = new Class7();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!ufa;)V")
	public static void method8721(@OriginalArg(1) Class337 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(70) int local70;
		@Pc(76) int local76;
		@Pc(78) int local78;
		if (arg0 == Static146.aClass337_5) {
			local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
			local21 = Static250.anInt4602 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static364.anInt7722;
			local31 = Static30.aClass3_Sub3_Sub2_1.method4221();
			local35 = Static30.aClass3_Sub3_Sub2_1.method4225();
			local39 = Static30.aClass3_Sub3_Sub2_1.method4221();
			local43 = Static30.aClass3_Sub3_Sub2_1.method4225();
			if (local21 >= 0 && local27 >= 0 && Static634.anInt10129 > local21 && Static638.anInt10172 > local27) {
				local70 = local21 * 512 + 256;
				local76 = local27 * 512 + 256;
				local78 = Static4.anInt54;
				if (local78 < 3 && Static486.method7232(local27, local21)) {
					local78++;
				}
				@Pc(112) Class4_Sub1_Sub2_Sub5 local112 = new Class4_Sub1_Sub2_Sub5(local31, local39, Static101.anInt2262, Static4.anInt54, local78, local70, Static192.method3263(local76, local70, Static4.anInt54) - local35, local76, local21, local21, local27, local27, local43);
				Static108.aClass223_12.method5868(new Class3_Sub4_Sub19(local112));
			}
		} else if (arg0 == Static580.aClass337_14) {
			local12 = Static30.aClass3_Sub3_Sub2_1.method4236();
			if (local12 == 65535) {
				local12 = -1;
			}
			local21 = Static30.aClass3_Sub3_Sub2_1.method4243();
			local27 = local21 >> 2;
			local31 = local21 & 0x3;
			local35 = Static410.anIntArray458[local27];
			local39 = Static30.aClass3_Sub3_Sub2_1.method4259();
			local43 = Static250.anInt4602 + (local39 >> 4 & 0x7);
			local70 = (local39 & 0x7) + Static364.anInt7722;
			Static73.method1758(Static4.anInt54, local31, local43, local12, local27, local35, local70);
		} else if (arg0 == Static302.aClass337_9) {
			local12 = Static30.aClass3_Sub3_Sub2_1.method4259();
			local21 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static410.anIntArray458[local21];
			local35 = Static30.aClass3_Sub3_Sub2_1.method4225();
			local39 = Static250.anInt4602 + (local35 >> 4 & 0x7);
			local43 = Static364.anInt7722 + (local35 & 0x7);
			if (Static196.method3401(Static402.anInt7435) || local39 >= 0 && local43 >= 0 && Static634.anInt10129 > local39 && Static638.anInt10172 > local43) {
				Static118.method2412(local39, local21, -1, Static4.anInt54, local27, local31, local43);
			}
		} else if (Static67.aClass337_4 == arg0) {
			local12 = Static30.aClass3_Sub3_Sub2_1.method4243();
			local21 = Static250.anInt4602 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static364.anInt7722;
			local31 = Static30.aClass3_Sub3_Sub2_1.method4259();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static410.anIntArray458[local35];
			local70 = Static30.aClass3_Sub3_Sub2_1.method4221();
			if (Static196.method3401(Static402.anInt7435) || local21 >= 0 && local27 >= 0 && local21 < Static634.anInt10129 && Static638.anInt10172 > local27) {
				Static118.method2412(local21, local35, local70, Static4.anInt54, local39, local43, local27);
			}
		} else if (Static63.aClass337_3 == arg0) {
			local12 = Static30.aClass3_Sub3_Sub2_1.method4221();
			local21 = Static30.aClass3_Sub3_Sub2_1.method4225();
			Static105.aClass302_1.method7466(local12).method7410(local21);
		} else {
			@Pc(430) int local430;
			if (Static242.aClass337_7 == arg0) {
				local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local21 = (local12 >> 4 & 0x7) + Static250.anInt4602;
				local27 = (local12 & 0x7) + Static364.anInt7722;
				local31 = Static30.aClass3_Sub3_Sub2_1.method4221();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				local70 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local76 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local78 = Static30.aClass3_Sub3_Sub2_1.method4221();
				if (local21 >= 0 && local27 >= 0 && Static634.anInt10129 > local21 && Static638.anInt10172 > local27) {
					local430 = local39 + 1;
					if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] >= local21 - local430 && local21 + local430 >= Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] && local27 - local430 <= Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] && local430 + local27 >= Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0]) {
						Static375.method6037(local31, local76, local70, local43, (local27 << 8) + (local21 << 16) + (Static4.anInt54 << 24) + local39, local78);
					}
				}
			} else if (arg0 == Static377.aClass337_10) {
				local12 = Static30.aClass3_Sub3_Sub2_1.method4222();
				local21 = Static30.aClass3_Sub3_Sub2_1.method4263();
				local27 = Static364.anInt7722 + (local21 & 0x7);
				local31 = local27 + Static171.anInt3340;
				local35 = Static250.anInt4602 + (local21 >> 4 & 0x7);
				local39 = local35 + Static299.anInt5307;
				@Pc(538) Class3_Sub51 local538 = (Class3_Sub51) Static356.aClass280_28.method7107((long) (local39 | Static4.anInt54 << 28 | local31 << 14));
				if (local538 != null) {
					for (@Pc(548) Class3_Sub45 local548 = (Class3_Sub45) local538.aClass223_62.method5874(); local548 != null; local548 = (Class3_Sub45) local538.aClass223_62.method5870()) {
						if (local548.anInt8270 == (local12 & 0x7FFF)) {
							local548.method8769();
							break;
						}
					}
					if (local538.aClass223_62.method5864()) {
						local538.method8769();
					}
					if (local35 >= 0 && local27 >= 0 && local35 < Static634.anInt10129 && local27 < Static638.anInt10172) {
						Static264.method4347(local27, Static4.anInt54, local35);
					}
				}
			} else {
				@Pc(691) int local691;
				@Pc(695) int local695;
				@Pc(712) int local712;
				if (Static457.aClass337_13 == arg0) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local21 = Static250.anInt4602 * 2 + (local12 >> 4 & 0xF);
					local27 = Static364.anInt7722 * 2 + (local12 & 0xF);
					local31 = Static30.aClass3_Sub3_Sub2_1.method4225();
					@Pc(646) boolean local646 = (local31 & 0x1) != 0;
					@Pc(654) boolean local654 = (local31 & 0x2) != 0;
					local43 = local654 ? local31 >> 2 : -1;
					local70 = local21 + Static30.aClass3_Sub3_Sub2_1.method4254();
					local76 = Static30.aClass3_Sub3_Sub2_1.method4254() + local27;
					local78 = Static30.aClass3_Sub3_Sub2_1.method4209();
					local430 = Static30.aClass3_Sub3_Sub2_1.method4209();
					local691 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local695 = Static30.aClass3_Sub3_Sub2_1.method4225();
					if (local654) {
						local695 = (byte) local695;
					} else {
						local695 *= 4;
					}
					local712 = Static30.aClass3_Sub3_Sub2_1.method4225() * 4;
					@Pc(716) int local716 = Static30.aClass3_Sub3_Sub2_1.method4221();
					@Pc(720) int local720 = Static30.aClass3_Sub3_Sub2_1.method4221();
					@Pc(724) int local724 = Static30.aClass3_Sub3_Sub2_1.method4225();
					@Pc(728) int local728 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (local724 == 255) {
						local724 = -1;
					}
					if (local21 >= 0 && local27 >= 0 && local21 < Static634.anInt10129 * 2 && Static634.anInt10129 * 2 > local27 && local70 >= 0 && local76 >= 0 && local70 < Static638.anInt10172 * 2 && Static638.anInt10172 * 2 > local76 && local691 != 65535) {
						local695 <<= 0x2;
						local70 *= 256;
						local76 = local76 * 256;
						local728 <<= 0x2;
						local712 <<= 0x2;
						local27 = local27 * 256;
						local21 *= 256;
						if (local78 != 0 && local43 != -1) {
							@Pc(812) Class4_Sub1_Sub2_Sub1 local812 = null;
							@Pc(821) int local821;
							if (local78 >= 0) {
								local821 = local78 - 1;
								@Pc(828) Class3_Sub28 local828 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local821);
								if (local828 != null) {
									local812 = local828.aClass4_Sub1_Sub2_Sub1_Sub1_2;
								}
							} else {
								local821 = -local78 - 1;
								if (Static97.anInt2234 == local821) {
									local812 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2;
								} else {
									local812 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local821];
								}
							}
							if (local812 != null) {
								@Pc(855) Class143 local855 = local812.method5058();
								if (local855.anIntArrayArray32 != null && local855.anIntArrayArray32[local43] != null) {
									local695 -= local855.anIntArrayArray32[local43][1];
								}
								if (local855.anIntArrayArray31 != null && local855.anIntArrayArray31[local43] != null) {
									local695 -= local855.anIntArrayArray31[local43][1];
								}
							}
						}
						@Pc(913) Class4_Sub1_Sub2_Sub3 local913 = new Class4_Sub1_Sub2_Sub3(local691, Static4.anInt54, Static4.anInt54, local21, local27, local695, local716 + Static101.anInt2262, local720 - -Static101.anInt2262, local724, local728, local78, local430, local712, local646, local43);
						local913.method4601(Static101.anInt2262 + local716, local76, local70, Static192.method3263(local76, local70, Static4.anInt54) - local712);
						Static367.aClass223_42.method5868(new Class3_Sub4_Sub4(local913));
					}
				} else if (Static264.aClass337_8 == arg0) {
					Static30.aClass3_Sub3_Sub2_1.method4225();
					local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local21 = (local12 >> 4 & 0x7) + Static250.anInt4602;
					local27 = Static364.anInt7722 + (local12 & 0x7);
					local31 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local35 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local39 = Static30.aClass3_Sub3_Sub2_1.method4204();
					@Pc(983) String local983 = Static30.aClass3_Sub3_Sub2_1.method4233();
					Static459.method7007(local35, local21, local27, local983, local39, Static4.anInt54, local31);
				} else if (arg0 == Static207.aClass337_6) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4231();
					local21 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local27 = Static30.aClass3_Sub3_Sub2_1.method4259();
					local31 = Static364.anInt7722 + (local27 & 0x7);
					local35 = Static171.anInt3340 + local31;
					local39 = (local27 >> 4 & 0x7) + Static250.anInt4602;
					local43 = local39 + Static299.anInt5307;
					local70 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (Static97.anInt2234 != local21) {
						@Pc(1067) boolean local1067 = local39 >= 0 && local31 >= 0 && local39 < Static634.anInt10129 && Static638.anInt10172 > local31;
						if (local1067 || Static196.method3401(Static402.anInt7435)) {
							Static260.method7709(local43, local35, Static4.anInt54, new Class3_Sub45(local12, local70));
							if (local1067) {
								Static264.method4347(local31, Static4.anInt54, local39);
							}
						}
					}
				} else if (Static47.aClass337_1 == arg0) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local21 = Static250.anInt4602 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static364.anInt7722;
					local31 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (local31 == 65535) {
						local31 = -1;
					}
					local35 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local39 = local35 >> 4 & 0xF;
					local43 = local35 & 0x7;
					local70 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local76 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local78 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (local21 >= 0 && local27 >= 0 && local21 < Static634.anInt10129 && local27 < Static638.anInt10172) {
						local430 = local39 + 1;
						if (local21 - local430 <= Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] <= local430 + local21 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] >= local27 - local430 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] <= local430 + local27) {
							Static109.method2231(local78, (local21 << 16) + (Static4.anInt54 << 24) + (local27 << 8) + local39, local76, local70, local43, local31);
						}
					}
				} else if (Static413.aClass337_11 == arg0) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4243();
					local21 = (local12 & 0x7) + Static364.anInt7722;
					local27 = Static171.anInt3340 + local21;
					local31 = Static250.anInt4602 + (local12 >> 4 & 0x7);
					local35 = Static299.anInt5307 + local31;
					local39 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local43 = Static30.aClass3_Sub3_Sub2_1.method4231();
					@Pc(1291) boolean local1291 = local31 >= 0 && local21 >= 0 && local31 < Static634.anInt10129 && Static638.anInt10172 > local21;
					if (local1291 || Static196.method3401(Static402.anInt7435)) {
						Static260.method7709(local35, local27, Static4.anInt54, new Class3_Sub45(local43, local39));
						if (local1291) {
							Static264.method4347(local21, Static4.anInt54, local31);
						}
					}
				} else if (arg0 == Static445.aClass337_12) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
					@Pc(1332) boolean local1332 = (local12 & 0x80) != 0;
					local27 = Static250.anInt4602 + (local12 >> 3 & 0x7);
					local31 = Static364.anInt7722 + (local12 & 0x7);
					local35 = Static30.aClass3_Sub3_Sub2_1.method4254() + local27;
					local39 = Static30.aClass3_Sub3_Sub2_1.method4254() + local31;
					local43 = Static30.aClass3_Sub3_Sub2_1.method4209();
					local70 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local76 = Static30.aClass3_Sub3_Sub2_1.method4225() * 4;
					local78 = Static30.aClass3_Sub3_Sub2_1.method4225() * 4;
					local430 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local691 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local695 = Static30.aClass3_Sub3_Sub2_1.method4225();
					if (local695 == 255) {
						local695 = -1;
					}
					local712 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (local27 >= 0 && local31 >= 0 && local27 < Static634.anInt10129 && Static638.anInt10172 > local31 && local35 >= 0 && local39 >= 0 && Static634.anInt10129 > local35 && local39 < Static638.anInt10172 && local70 != 65535) {
						local39 = local39 * 512 + 256;
						local78 <<= 0x2;
						local35 = local35 * 512 + 256;
						local27 = local27 * 512 + 256;
						local76 <<= 0x2;
						local31 = local31 * 512 + 256;
						local712 <<= 0x2;
						@Pc(1492) Class4_Sub1_Sub2_Sub3 local1492 = new Class4_Sub1_Sub2_Sub3(local70, Static4.anInt54, Static4.anInt54, local27, local31, local76, Static101.anInt2262 + local430, local691 + Static101.anInt2262, local695, local712, 0, local43, local78, local1332, -1);
						local1492.method4601(Static101.anInt2262 + local430, local39, local35, Static192.method3263(local39, local35, Static4.anInt54) - local78);
						Static367.aClass223_42.method5868(new Class3_Sub4_Sub4(local1492));
					}
				} else if (arg0 == Static51.aClass337_2) {
					local12 = Static30.aClass3_Sub3_Sub2_1.method4225();
					local21 = (local12 & 0x7) + Static364.anInt7722;
					local27 = local21 + Static171.anInt3340;
					local31 = (local12 >> 4 & 0x7) + Static250.anInt4602;
					local35 = local31 + Static299.anInt5307;
					local39 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local43 = Static30.aClass3_Sub3_Sub2_1.method4221();
					local70 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if (Static356.aClass280_28 != null) {
						@Pc(1580) Class3_Sub51 local1580 = (Class3_Sub51) Static356.aClass280_28.method7107((long) (Static4.anInt54 << 28 | local27 << 14 | local35));
						if (local1580 != null) {
							for (@Pc(1590) Class3_Sub45 local1590 = (Class3_Sub45) local1580.aClass223_62.method5874(); local1590 != null; local1590 = (Class3_Sub45) local1580.aClass223_62.method5870()) {
								if (local1590.anInt8270 == (local39 & 0x7FFF) && local1590.anInt8272 == local43) {
									local1590.method8769();
									local1590.anInt8272 = local70;
									Static260.method7709(local35, local27, Static4.anInt54, local1590);
									break;
								}
							}
							if (local31 >= 0 && local21 >= 0 && local31 < Static634.anInt10129 && Static638.anInt10172 > local21) {
								Static264.method4347(local21, Static4.anInt54, local31);
							}
						}
					}
				} else {
					Static335.method5467("T3 - " + arg0, null);
					Static439.method6845(false);
				}
			}
		}
	}
}
