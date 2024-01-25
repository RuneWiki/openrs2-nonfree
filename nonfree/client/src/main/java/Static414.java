import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public static int anInt7163;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "I")
	public static int anInt7167;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
	public static int method5935(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!qw;I)V")
	public static void method5939(@OriginalArg(0) Class284 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (arg0 == Static23.aClass284_1) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method5977();
			local16 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local22 = (local16 & 0x7) + Static81.anInt9840;
			local26 = local22 + Static6.anInt97;
			local35 = Static314.anInt9407 + (local16 >> 4 & 0x7);
			local39 = Static373.anInt6695 + local35;
			local43 = Static487.aClass4_Sub9_Sub1_2.method5977();
			@Pc(68) boolean local68 = local35 >= 0 && local22 >= 0 && local35 < Static38.anInt740 && Static38.anInt741 > local22;
			if (local68 || Static391.method5718(Static236.anInt4754)) {
				Static188.method3454(local39, local26, Static530.anInt9013, new Class4_Sub38(local43, local12));
				if (local68) {
					Static293.method4590(local35, local22, Static530.anInt9013);
				}
			}
			return;
		}
		@Pc(150) int local150;
		@Pc(166) int local166;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(170) int local170;
		@Pc(278) Class10_Sub1_Sub3 local278;
		if (Static576.aClass284_27 == arg0) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = Static314.anInt9407 * 2 + (local12 >> 4 & 0xF);
			local22 = Static81.anInt9840 * 2 + (local12 & 0xF);
			@Pc(129) boolean local129 = Static487.aClass4_Sub9_Sub1_2.method6015() != 0;
			local35 = local16 + Static487.aClass4_Sub9_Sub1_2.method6021();
			local39 = Static487.aClass4_Sub9_Sub1_2.method6021() + local22;
			local43 = Static487.aClass4_Sub9_Sub1_2.method6003();
			local150 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local156 = Static487.aClass4_Sub9_Sub1_2.method6015() * 4;
			local162 = Static487.aClass4_Sub9_Sub1_2.method6015() * 4;
			local166 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local170 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local174 = Static487.aClass4_Sub9_Sub1_2.method6015();
			if (local174 == 255) {
				local174 = -1;
			}
			local185 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (local16 >= 0 && local22 >= 0 && local16 < Static38.anInt740 * 2 && Static38.anInt740 * 2 > local22 && local35 >= 0 && local39 >= 0 && Static38.anInt741 * 2 > local35 && Static38.anInt741 * 2 > local39 && local150 != 65535) {
				local16 *= 256;
				local156 <<= 0x2;
				local22 = local22 * 256;
				local35 *= 256;
				local185 <<= 0x2;
				local39 *= 256;
				local162 <<= 0x2;
				local278 = new Class10_Sub1_Sub3(local150, Static530.anInt9013, local16, local22, local156, local166 + Static237.anInt7561, Static237.anInt7561 + local170, local174, local185, local43, local162, local129);
				local278.method5248(Static237.anInt7561 + local166, local35, local39, Static160.method3164(local35, Static530.anInt9013, local39) - local162);
				Static11.aClass124_1.method3275(new Class4_Sub7_Sub12(local278));
			}
		} else if (arg0 == Static28.aClass284_2) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method5977();
			local16 = Static487.aClass4_Sub9_Sub1_2.method6014();
			local22 = (local16 & 0x7) + Static81.anInt9840;
			local26 = Static6.anInt97 + local22;
			local35 = Static314.anInt9407 + (local16 >> 4 & 0x7);
			local39 = local35 + Static373.anInt6695;
			@Pc(350) Class4_Sub15 local350 = (Class4_Sub15) Static486.aClass183_34.method4289((long) (local39 | Static530.anInt9013 << 28 | local26 << 14));
			if (local350 != null) {
				for (@Pc(358) Class4_Sub38 local358 = (Class4_Sub38) local350.aClass124_18.method3267(); local358 != null; local358 = (Class4_Sub38) local350.aClass124_18.method3273()) {
					if (local358.anInt7346 == (local12 & 0x7FFF)) {
						local358.method8013();
						break;
					}
				}
				if (local350.aClass124_18.method3264()) {
					local350.method8013();
				}
				if (local35 >= 0 && local22 >= 0 && local35 < Static38.anInt740 && Static38.anInt741 > local22) {
					Static293.method4590(local35, local22, Static530.anInt9013);
				}
			}
		} else if (arg0 == Static56.aClass284_4) {
			Static487.aClass4_Sub9_Sub1_2.method6015();
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = (local12 >> 4 & 0x7) + Static314.anInt9407;
			local22 = (local12 & 0x7) + Static81.anInt9840;
			local26 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local35 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local39 = Static487.aClass4_Sub9_Sub1_2.method6023();
			@Pc(455) String local455 = Static487.aClass4_Sub9_Sub1_2.method6010();
			Static351.method5203(local26, local22, local39, local455, Static530.anInt9013, local35, local16);
		} else if (Static498.aClass284_24 == arg0) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = Static314.anInt9407 + (local12 >> 4 & 0x7);
			local22 = Static81.anInt9840 + (local12 & 0x7);
			local26 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local35 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local39 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local43 = Static487.aClass4_Sub9_Sub1_2.method6015();
			if (local16 >= 0 && local22 >= 0 && Static38.anInt740 > local16 && Static38.anInt741 > local22) {
				local150 = local16 * 512 + 256;
				local156 = local22 * 512 + 256;
				local162 = Static530.anInt9013;
				if (local162 < 3 && Static163.method3178(local22, local16)) {
					local162++;
				}
				@Pc(571) Class10_Sub1_Sub4 local571 = new Class10_Sub1_Sub4(local26, local39, Static237.anInt7561, Static530.anInt9013, local162, local150, Static160.method3164(local150, Static530.anInt9013, local156) - local35, local156, local16, local16, local22, local22, local43);
				Static328.aClass124_29.method3275(new Class4_Sub7_Sub9(local571));
			}
		} else if (arg0 == Static275.aClass284_14) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = (local12 >> 4 & 0x7) + Static314.anInt9407;
			local22 = Static81.anInt9840 + (local12 & 0x7);
			local26 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (local26 == 65535) {
				local26 = -1;
			}
			local35 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local39 = local35 >> 4 & 0xF;
			local43 = local35 & 0x7;
			local150 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local156 = Static487.aClass4_Sub9_Sub1_2.method6015();
			if (local16 >= 0 && local22 >= 0 && local16 < Static38.anInt740 && local22 < Static38.anInt741) {
				local162 = local39 + 1;
				if (local16 - local162 <= Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] && Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] <= local162 + local16 && Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] >= local22 - local162 && Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] <= local22 + local162) {
					Static518.method7282(local43, local39 + (local22 << 8) + (Static530.anInt9013 << 24) + (local16 << 16), local26, local150, local156);
				}
			}
		} else if (Static398.aClass284_18 == arg0) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			@Pc(719) boolean local719 = (local12 & 0x80) != 0;
			local22 = (local12 >> 3 & 0x7) + Static314.anInt9407;
			local26 = Static81.anInt9840 + (local12 & 0x7);
			local35 = local22 + Static487.aClass4_Sub9_Sub1_2.method6021();
			local39 = local26 + Static487.aClass4_Sub9_Sub1_2.method6021();
			local43 = Static487.aClass4_Sub9_Sub1_2.method6003();
			local150 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local156 = Static487.aClass4_Sub9_Sub1_2.method6015() * 4;
			local162 = Static487.aClass4_Sub9_Sub1_2.method6015() * 4;
			local166 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local170 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local174 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local185 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (local174 == 255) {
				local174 = -1;
			}
			if (local22 >= 0 && local26 >= 0 && Static38.anInt740 > local22 && local26 < Static38.anInt741 && local35 >= 0 && local39 >= 0 && Static38.anInt740 > local35 && Static38.anInt741 > local39 && local150 != 65535) {
				local185 <<= 0x2;
				local162 <<= 0x2;
				local39 = local39 * 512 + 256;
				local156 <<= 0x2;
				local26 = local26 * 512 + 256;
				local35 = local35 * 512 + 256;
				local22 = local22 * 512 + 256;
				local278 = new Class10_Sub1_Sub3(local150, Static530.anInt9013, local22, local26, local156, local166 + Static237.anInt7561, local170 + Static237.anInt7561, local174, local185, local43, local162, local719);
				local278.method5248(local166 + Static237.anInt7561, local35, local39, Static160.method3164(local35, Static530.anInt9013, local39) - local162);
				Static11.aClass124_1.method3275(new Class4_Sub7_Sub12(local278));
			}
		} else if (arg0 == Static243.aClass284_11) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local16 = Static487.aClass4_Sub9_Sub1_2.method5994();
			local22 = Static487.aClass4_Sub9_Sub1_2.method5980();
			@Pc(927) byte local927 = Static487.aClass4_Sub9_Sub1_2.method6025();
			local35 = Static487.aClass4_Sub9_Sub1_2.method5977();
			@Pc(935) byte local935 = Static487.aClass4_Sub9_Sub1_2.method6004();
			@Pc(939) byte local939 = Static487.aClass4_Sub9_Sub1_2.method6025();
			local150 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local156 = Static314.anInt9407 + (local150 >> 4 & 0x7);
			local162 = Static81.anInt9840 + (local150 & 0x7);
			local166 = Static487.aClass4_Sub9_Sub1_2.method6027();
			local170 = local166 >> 2;
			local174 = local166 & 0x3;
			@Pc(974) byte local974 = Static487.aClass4_Sub9_Sub1_2.method6021();
			if (!Static185.aClass66_14.method6834()) {
				Static554.method7654(local174, Static530.anInt9013, local162, local35, local16, local22, local12, local939, local156, local170, local974, local935, local927);
			}
		} else if (arg0 == Static270.aClass284_13) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = Static314.anInt9407 + (local12 >> 4 & 0x7);
			local22 = Static81.anInt9840 + (local12 & 0x7);
			local26 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (local26 == 65535) {
				local26 = -1;
			}
			local35 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local39 = local35 >> 4 & 0xF;
			local43 = local35 & 0x7;
			local150 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local156 = Static487.aClass4_Sub9_Sub1_2.method6015();
			if (local16 >= 0 && local22 >= 0 && local16 < Static38.anInt740 && local22 < Static38.anInt741) {
				local162 = local39 + 1;
				if (Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] >= local16 - local162 && local162 + local16 >= Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] && Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] >= local22 - local162 && Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0] <= local22 + local162) {
					Static17.method364(local26, local43, local39 + (local16 << 16) + (Static530.anInt9013 << 24) + (local22 << 8), local150, local156);
				}
			}
		} else if (arg0 == Static368.aClass284_16) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = Static314.anInt9407 * 2 + (local12 >> 4 & 0xF);
			local22 = Static81.anInt9840 * 2 + (local12 & 0xF);
			local26 = Static487.aClass4_Sub9_Sub1_2.method6015();
			@Pc(1168) boolean local1168 = (local26 & 0x1) != 0;
			local39 = local26 >> 1;
			local43 = Static487.aClass4_Sub9_Sub1_2.method6021() + local16;
			local150 = Static487.aClass4_Sub9_Sub1_2.method6021() + local22;
			local156 = Static487.aClass4_Sub9_Sub1_2.method6003();
			local162 = Static487.aClass4_Sub9_Sub1_2.method6003();
			local166 = Static487.aClass4_Sub9_Sub1_2.method5982();
			@Pc(1200) byte local1200 = Static487.aClass4_Sub9_Sub1_2.method6021();
			local174 = Static487.aClass4_Sub9_Sub1_2.method6015() * 4;
			local185 = Static487.aClass4_Sub9_Sub1_2.method5982();
			@Pc(1214) int local1214 = Static487.aClass4_Sub9_Sub1_2.method5982();
			@Pc(1218) int local1218 = Static487.aClass4_Sub9_Sub1_2.method6015();
			@Pc(1222) int local1222 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (local1218 == 255) {
				local1218 = -1;
			}
			if (local16 >= 0 && local22 >= 0 && local16 < Static38.anInt740 * 2 && local22 < Static38.anInt740 * 2 && local43 >= 0 && local150 >= 0 && local43 < Static38.anInt741 * 2 && local150 < Static38.anInt741 * 2 && local166 != 65535) {
				local1222 <<= 0x2;
				local22 *= 256;
				local16 = local16 * 256;
				local150 = local150 * 256;
				local43 = local43 * 256;
				local170 = local1200 << 2;
				local174 <<= 0x2;
				if (local156 != 0) {
					@Pc(1312) Class10_Sub1_Sub2 local1312 = null;
					@Pc(1321) int local1321;
					if (local156 >= 0) {
						local1321 = local156 - 1;
						@Pc(1328) Class4_Sub50 local1328 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local1321);
						if (local1328 != null) {
							local1312 = local1328.aClass10_Sub1_Sub2_Sub1_1;
						}
					} else {
						local1321 = -local156 - 1;
						if (Static416.anInt7186 == local1321) {
							local1312 = Static129.aClass10_Sub1_Sub2_Sub2_1;
						} else {
							local1312 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local1321];
						}
					}
					if (local1312 != null) {
						@Pc(1355) Class130 local1355 = local1312.method7026();
						if (local1355.anIntArrayArray47 != null && local1355.anIntArrayArray47[local39] != null) {
							@Pc(1370) int local1370 = local1355.anIntArrayArray47[local39][0];
							@Pc(1377) int local1377 = local1355.anIntArrayArray47[local39][2];
							@Pc(1382) int local1382 = local1312.aClass155_7.method3695();
							@Pc(1386) int local1386 = Class4_Sub11.anIntArray148[local1382];
							@Pc(1390) int local1390 = Class4_Sub11.anIntArray147[local1382];
							@Pc(1401) int local1401 = local1377 * local1386 + local1390 * local1370 >> 14;
							@Pc(1412) int local1412 = local1390 * local1377 - local1370 * local1386 >> 14;
							local22 += local1412;
							local170 -= local1355.anIntArrayArray47[local39][1];
							local16 += local1401;
						}
					}
				}
				@Pc(1451) Class10_Sub1_Sub3 local1451 = new Class10_Sub1_Sub3(local166, Static530.anInt9013, local16, local22, local170, Static237.anInt7561 + local185, Static237.anInt7561 + local1214, local1218, local1222, local162, local174, local1168);
				local1451.method5248(Static237.anInt7561 + local185, local43, local150, Static160.method3164(local43, Static530.anInt9013, local150) - local174);
				Static11.aClass124_1.method3275(new Class4_Sub7_Sub12(local1451));
			}
		} else if (Static427.aClass284_21 == arg0) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local16 = Static487.aClass4_Sub9_Sub1_2.method6015();
			Static553.aClass288_4.method6419(local12).method574(local16);
		} else if (Static498.aClass284_23 == arg0) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = Static81.anInt9840 + (local12 & 0x7);
			local22 = Static6.anInt97 + local16;
			local26 = Static314.anInt9407 + (local12 >> 4 & 0x7);
			local35 = local26 + Static373.anInt6695;
			local39 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local43 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local150 = Static487.aClass4_Sub9_Sub1_2.method5982();
			if (Static486.aClass183_34 != null) {
				@Pc(1554) Class4_Sub15 local1554 = (Class4_Sub15) Static486.aClass183_34.method4289((long) (local35 | local22 << 14 | Static530.anInt9013 << 28));
				if (local1554 != null) {
					for (@Pc(1562) Class4_Sub38 local1562 = (Class4_Sub38) local1554.aClass124_18.method3267(); local1562 != null; local1562 = (Class4_Sub38) local1554.aClass124_18.method3273()) {
						if (local1562.anInt7346 == (local39 & 0x7FFF) && local1562.anInt7347 == local43) {
							local1562.method8013();
							local1562.anInt7347 = local150;
							Static188.method3454(local35, local22, Static530.anInt9013, local1562);
							break;
						}
					}
					if (local26 >= 0 && local16 >= 0 && Static38.anInt740 > local26 && local16 < Static38.anInt741) {
						Static293.method4590(local26, local16, Static530.anInt9013);
					}
				}
			}
		} else if (arg0 == Static143.aClass284_8) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local16 = local12 >> 2;
			local22 = local12 & 0x3;
			local26 = Static528.anIntArray683[local16];
			local35 = Static487.aClass4_Sub9_Sub1_2.method6027();
			local39 = Static314.anInt9407 + (local35 >> 4 & 0x7);
			local43 = (local35 & 0x7) + Static81.anInt9840;
			if (Static391.method5718(Static236.anInt4754) || local39 >= 0 && local43 >= 0 && local39 < Static38.anInt740 && Static38.anInt741 > local43) {
				Static134.method5692(-1, local16, Static530.anInt9013, local43, local26, local22, local39);
			}
		} else if (arg0 == Static555.aClass284_26) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6027();
			local16 = local12 >> 2;
			local22 = local12 & 0x3;
			local26 = Static528.anIntArray683[local16];
			local35 = Static487.aClass4_Sub9_Sub1_2.method6015();
			local39 = Static314.anInt9407 + (local35 >> 4 & 0x7);
			local43 = (local35 & 0x7) + Static81.anInt9840;
			local150 = Static487.aClass4_Sub9_Sub1_2.method5977();
			if (local150 == 65535) {
				local150 = -1;
			}
			Static582.method7877(local16, local26, local150, local22, local43, Static530.anInt9013, local39);
		} else if (arg0 == Static178.aClass284_9) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method6014();
			local16 = (local12 >> 4 & 0x7) + Static314.anInt9407;
			local22 = (local12 & 0x7) + Static81.anInt9840;
			local26 = Static487.aClass4_Sub9_Sub1_2.method5994();
			local35 = Static487.aClass4_Sub9_Sub1_2.method6014();
			local39 = local35 >> 2;
			local43 = local35 & 0x3;
			local150 = Static528.anIntArray683[local39];
			if (Static391.method5718(Static236.anInt4754) || local16 >= 0 && local22 >= 0 && local16 < Static38.anInt740 && Static38.anInt741 > local22) {
				Static134.method5692(local26, local39, Static530.anInt9013, local22, local150, local43, local16);
			}
		} else if (arg0 == Static34.aClass284_25) {
			local12 = Static487.aClass4_Sub9_Sub1_2.method5982();
			local16 = Static487.aClass4_Sub9_Sub1_2.method6005();
			local22 = Static487.aClass4_Sub9_Sub1_2.method5994();
			local26 = Static487.aClass4_Sub9_Sub1_2.method6027();
			local35 = Static81.anInt9840 + (local26 & 0x7);
			local39 = local35 + Static6.anInt97;
			local43 = Static314.anInt9407 + (local26 >> 4 & 0x7);
			local150 = Static373.anInt6695 + local43;
			if (Static416.anInt7186 != local12) {
				@Pc(1896) boolean local1896 = local43 >= 0 && local35 >= 0 && Static38.anInt740 > local43 && Static38.anInt741 > local35;
				if (local1896 || Static391.method5718(Static236.anInt4754)) {
					Static188.method3454(local150, local39, Static530.anInt9013, new Class4_Sub38(local16, local22));
					if (local1896) {
						Static293.method4590(local43, local35, Static530.anInt9013);
					}
				}
			}
		} else {
			Static473.method6593(null, "T3 - " + arg0);
			Static362.method5445(false);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(BI)V")
	public static void method5941(@OriginalArg(1) int arg0) {
		Static96.anInt2431 = arg0;
		Static99.aClass223_12.method4932();
	}
}
