import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method380(@OriginalArg(1) boolean arg0) {
		Static429.anInt7505 = 0;
		Static4.anInt56 = 0;
		Static310.method4311();
		Static49.method750(arg0);
		Static75.method7433();
		@Pc(26) boolean local26 = false;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static4.anInt56; local28++) {
			local34 = Static428.anIntArray573[local28];
			@Pc(41) Class1_Sub42 local41 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local34);
			@Pc(44) Class8_Sub3_Sub3_Sub1_Sub2 local44 = local41.aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (Static554.aBoolean708 && Static251.method7511(local34)) {
				Static497.method4933();
			}
			if (local44.anInt6780 != Static301.anInt5197) {
				if (local44.aClass20_1.method277()) {
					Static428.method5939(local44);
				}
				local44.method5450(null);
				local26 = true;
				local41.method7859();
			}
		}
		if (local26) {
			Static35.anInt540 = Static84.aClass187_40.method3796();
			Static84.aClass187_40.method3802(Static466.aClass1_Sub42Array1);
		}
		if (Static585.aClass1_Sub35_Sub2_2.anInt7214 != Static445.anInt7693) {
			throw new RuntimeException("gnp1 pos:" + Static585.aClass1_Sub35_Sub2_2.anInt7214 + " psize:" + Static445.anInt7693);
		}
		for (local34 = 0; local34 < Static39.anInt609; local34++) {
			if (Static84.aClass187_40.method3797((long) Static17.anIntArray24[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static39.anInt609);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIII)I")
	public static int method383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static271.anInt4778 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static226.anInt6317;
		@Pc(26) int local26 = arg0 - Static226.anInt6318;
		for (@Pc(36) Class1_Sub32 local36 = (Class1_Sub32) Static226.aClass353_46.method7677(); local36 != null; local36 = (Class1_Sub32) Static226.aClass353_46.method7687()) {
			if (arg1 == local36.anInt5300) {
				@Pc(45) int local45 = local36.anInt5301;
				@Pc(48) int local48 = local36.anInt5298;
				@Pc(58) int local58 = Static226.anInt6318 + local48 | local45 + Static226.anInt6317 << 14;
				@Pc(77) int local77 = (local21 - local45) * (local21 - local45) + (local26 - local48) * (-local48 + local26);
				if (local14 < 0 || local77 < local16) {
					local16 = local77;
					local14 = local58;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tf;Z)V")
	public static void method384(@OriginalArg(0) Class316 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static32.aClass316_1 == arg0) {
			local12 = Static585.aClass1_Sub35_Sub2_2.method5775();
			local20 = (local12 >> 4 & 0x7) + Static295.anInt5065;
			local26 = Static590.anInt9615 + (local12 & 0x7);
			local30 = Static585.aClass1_Sub35_Sub2_2.method5775();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local42 = Static305.anIntArray413[local34];
			if (Static370.method4987(Static90.anInt1938) || local20 >= 0 && local26 >= 0 && Static71.anInt1410 > local20 && Static471.anInt8012 > local26) {
				Static119.method1869(local42, local20, -1, Static487.anInt8209, local26, local38, local34);
			}
		} else if (Static188.aClass316_5 == arg0) {
			Static585.aClass1_Sub35_Sub2_2.method5750();
			local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
			local20 = Static295.anInt5065 + (local12 >> 4 & 0x7);
			local26 = Static590.anInt9615 + (local12 & 0x7);
			local30 = Static585.aClass1_Sub35_Sub2_2.method5771();
			local34 = Static585.aClass1_Sub35_Sub2_2.method5750();
			local38 = Static585.aClass1_Sub35_Sub2_2.method5797();
			@Pc(121) String local121 = Static585.aClass1_Sub35_Sub2_2.method5760();
			Static191.method2932(local121, local20, local30, Static487.anInt8209, local38, local34, local26);
		} else if (arg0 == Static202.aClass316_7) {
			local12 = Static585.aClass1_Sub35_Sub2_2.method5793();
			local20 = Static590.anInt9615 + (local12 & 0x7);
			local26 = Static116.anInt2289 + local20;
			local30 = Static295.anInt5065 + (local12 >> 4 & 0x7);
			local34 = local30 + Static541.anInt9058;
			local38 = Static585.aClass1_Sub35_Sub2_2.method5779();
			local42 = Static585.aClass1_Sub35_Sub2_2.method5772();
			@Pc(187) boolean local187 = local30 >= 0 && local20 >= 0 && local30 < Static71.anInt1410 && local20 < Static471.anInt8012;
			if (local187 || Static370.method4987(Static90.anInt1938)) {
				Static409.method5644(new Class1_Sub40(local42, local38), local34, Static487.anInt8209, local26);
				if (local187) {
					Static38.method540(local20, Static487.anInt8209, local30);
				}
			}
		} else {
			@Pc(260) int local260;
			@Pc(272) int local272;
			@Pc(284) int local284;
			@Pc(288) int local288;
			@Pc(266) int local266;
			@Pc(276) int local276;
			@Pc(280) int local280;
			@Pc(390) Class8_Sub3_Sub3_Sub2 local390;
			if (arg0 == Static507.aClass316_13) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				@Pc(226) boolean local226 = (local12 & 0x80) != 0;
				local26 = Static295.anInt5065 + (local12 >> 3 & 0x7);
				local30 = (local12 & 0x7) + Static590.anInt9615;
				local34 = Static585.aClass1_Sub35_Sub2_2.method5751() + local26;
				local38 = Static585.aClass1_Sub35_Sub2_2.method5751() + local30;
				local42 = Static585.aClass1_Sub35_Sub2_2.method5738();
				local260 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local266 = Static585.aClass1_Sub35_Sub2_2.method5750() * 4;
				local272 = Static585.aClass1_Sub35_Sub2_2.method5750() * 4;
				local276 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local280 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local284 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local288 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (local284 == 255) {
					local284 = -1;
				}
				if (local26 >= 0 && local30 >= 0 && local26 < Static71.anInt1410 && Static471.anInt8012 > local30 && local34 >= 0 && local38 >= 0 && local34 < Static71.anInt1410 && Static471.anInt8012 > local38 && local260 != 65535) {
					local288 <<= 0x2;
					local26 = local26 * 512 + 256;
					local266 <<= 0x2;
					local34 = local34 * 512 + 256;
					local272 <<= 0x2;
					local30 = local30 * 512 + 256;
					local38 = local38 * 512 + 256;
					local390 = new Class8_Sub3_Sub3_Sub2(local260, Static487.anInt8209, Static487.anInt8209, local26, local30, local266, local276 + Static301.anInt5197, local280 - -Static301.anInt5197, local284, local288, local42, local272, local226);
					local390.method3386(Static66.method1191(local34, Static487.anInt8209, local38) - local272, Static301.anInt5197 + local276, local38, local34);
					Static87.aClass353_33.method7679(new Class1_Sub6_Sub8(local390));
				}
			} else if (Static101.aClass316_2 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = (local12 >> 4 & 0x7) + Static295.anInt5065;
				local26 = Static590.anInt9615 + (local12 & 0x7);
				local30 = Static585.aClass1_Sub35_Sub2_2.method5779();
				local34 = Static585.aClass1_Sub35_Sub2_2.method5742();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local260 = Static305.anIntArray413[local38];
				if (Static370.method4987(Static90.anInt1938) || local20 >= 0 && local26 >= 0 && Static71.anInt1410 > local20 && local26 < Static471.anInt8012) {
					Static119.method1869(local260, local20, local30, Static487.anInt8209, local26, local42, local38);
				}
			} else if (Static394.aClass316_11 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = Static295.anInt5065 * 2 + (local12 >> 4 & 0xF);
				local26 = Static590.anInt9615 * 2 + (local12 & 0xF);
				@Pc(534) boolean local534 = Static585.aClass1_Sub35_Sub2_2.method5750() != 0;
				local34 = Static585.aClass1_Sub35_Sub2_2.method5751() + local20;
				local38 = Static585.aClass1_Sub35_Sub2_2.method5751() + local26;
				local42 = Static585.aClass1_Sub35_Sub2_2.method5738();
				local260 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local266 = Static585.aClass1_Sub35_Sub2_2.method5750() * 4;
				local272 = Static585.aClass1_Sub35_Sub2_2.method5750() * 4;
				local276 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local280 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local284 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local288 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (local284 == 255) {
					local284 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && local20 < Static71.anInt1410 * 2 && Static71.anInt1410 * 2 > local26 && local34 >= 0 && local38 >= 0 && Static471.anInt8012 * 2 > local34 && local38 < Static471.anInt8012 * 2 && local260 != 65535) {
					local288 <<= 0x2;
					local272 <<= 0x2;
					local20 = local20 * 256;
					local26 *= 256;
					local38 *= 256;
					local266 <<= 0x2;
					local34 *= 256;
					local390 = new Class8_Sub3_Sub3_Sub2(local260, Static487.anInt8209, Static487.anInt8209, local20, local26, local266, Static301.anInt5197 + local276, local280 + Static301.anInt5197, local284, local288, local42, local272, local534);
					local390.method3386(Static66.method1191(local34, Static487.anInt8209, local38) - local272, Static301.anInt5197 + local276, local38, local34);
					Static87.aClass353_33.method7679(new Class1_Sub6_Sub8(local390));
				}
			} else if (arg0 == Static188.aClass316_4) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = Static590.anInt9615 + (local12 & 0x7);
				local26 = Static116.anInt2289 + local20;
				local30 = (local12 >> 4 & 0x7) + Static295.anInt5065;
				local34 = local30 + Static541.anInt9058;
				local38 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local42 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local260 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (Static19.aClass187_3 != null) {
					@Pc(774) Class1_Sub28 local774 = (Class1_Sub28) Static19.aClass187_3.method3797((long) (local26 << 14 | Static487.anInt8209 << 28 | local34));
					if (local774 != null) {
						for (@Pc(782) Class1_Sub40 local782 = (Class1_Sub40) local774.aClass353_28.method7677(); local782 != null; local782 = (Class1_Sub40) local774.aClass353_28.method7687()) {
							if (local782.anInt7304 == (local38 & 0x7FFF) && local782.anInt7305 == local42) {
								local782.method7859();
								local782.anInt7305 = local260;
								Static409.method5644(local782, local34, Static487.anInt8209, local26);
								break;
							}
						}
						if (local30 >= 0 && local20 >= 0 && Static71.anInt1410 > local30 && local20 < Static471.anInt8012) {
							Static38.method540(local20, Static487.anInt8209, local30);
						}
					}
				}
			} else if (Static195.aClass316_6 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5783();
				if (local12 == 65535) {
					local12 = -1;
				}
				local20 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local26 = local20 >> 2;
				local30 = local20 & 0x3;
				local34 = Static305.anIntArray413[local26];
				local38 = Static585.aClass1_Sub35_Sub2_2.method5775();
				local42 = (local38 >> 4 & 0x7) + Static295.anInt5065;
				local260 = (local38 & 0x7) + Static590.anInt9615;
				Static578.method7766(local26, local42, local34, Static487.anInt8209, local260, local12, local30);
			} else if (arg0 == Static292.aClass316_8) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = (local12 >> 4 & 0xF) + Static295.anInt5065 * 2;
				local26 = (local12 & 0xF) + Static590.anInt9615 * 2;
				local30 = Static585.aClass1_Sub35_Sub2_2.method5750();
				@Pc(938) boolean local938 = (local30 & 0x1) != 0;
				local38 = local30 >> 1;
				local42 = Static585.aClass1_Sub35_Sub2_2.method5751() + local20;
				local260 = local26 + Static585.aClass1_Sub35_Sub2_2.method5751();
				local266 = Static585.aClass1_Sub35_Sub2_2.method5738();
				local272 = Static585.aClass1_Sub35_Sub2_2.method5738();
				local276 = Static585.aClass1_Sub35_Sub2_2.method5771();
				@Pc(970) byte local970 = Static585.aClass1_Sub35_Sub2_2.method5751();
				local284 = Static585.aClass1_Sub35_Sub2_2.method5750() * 4;
				local288 = Static585.aClass1_Sub35_Sub2_2.method5771();
				@Pc(984) int local984 = Static585.aClass1_Sub35_Sub2_2.method5771();
				@Pc(988) int local988 = Static585.aClass1_Sub35_Sub2_2.method5750();
				if (local988 == 255) {
					local988 = -1;
				}
				@Pc(999) int local999 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (local20 >= 0 && local26 >= 0 && Static71.anInt1410 * 2 > local20 && Static71.anInt1410 * 2 > local26 && local42 >= 0 && local260 >= 0 && Static471.anInt8012 * 2 > local42 && local260 < Static471.anInt8012 * 2 && local276 != 65535) {
					local26 *= 256;
					local42 = local42 * 256;
					local20 *= 256;
					local260 *= 256;
					local284 <<= 0x2;
					local280 = local970 << 2;
					local999 <<= 0x2;
					if (local266 != 0) {
						@Pc(1073) Class8_Sub3_Sub3_Sub1 local1073 = null;
						@Pc(1079) int local1079;
						if (local266 >= 0) {
							local1079 = local266 - 1;
							@Pc(1086) Class1_Sub42 local1086 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local1079);
							if (local1086 != null) {
								local1073 = local1086.aClass8_Sub3_Sub3_Sub1_Sub2_2;
							}
						} else {
							local1079 = -local266 - 1;
							if (Static296.anInt5113 == local1079) {
								local1073 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1;
							} else {
								local1073 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local1079];
							}
						}
						if (local1073 != null) {
							@Pc(1113) Class140 local1113 = local1073.method5425();
							if (local1113.anIntArrayArray87 != null && local1113.anIntArrayArray87[local38] != null) {
								@Pc(1128) int local1128 = local1113.anIntArrayArray87[local38][0];
								@Pc(1135) int local1135 = local1113.anIntArrayArray87[local38][2];
								@Pc(1140) int local1140 = local1073.aClass108_7.method2164();
								@Pc(1144) int local1144 = Class1_Sub6_Sub2.anIntArray675[local1140];
								@Pc(1148) int local1148 = Class1_Sub6_Sub2.anIntArray676[local1140];
								@Pc(1158) int local1158 = local1128 * local1148 + local1135 * local1144 >> 14;
								@Pc(1168) int local1168 = local1148 * local1135 - local1144 * local1128 >> 14;
								local280 -= local1113.anIntArrayArray87[local38][1];
								local26 += local1168;
								local20 += local1158;
							}
						}
					}
					@Pc(1208) Class8_Sub3_Sub3_Sub2 local1208 = new Class8_Sub3_Sub3_Sub2(local276, Static487.anInt8209, Static487.anInt8209, local20, local26, local280, local288 + Static301.anInt5197, Static301.anInt5197 + local984, local988, local999, local272, local284, local938);
					local1208.method3386(Static66.method1191(local42, Static487.anInt8209, local260) - local284, Static301.anInt5197 + local288, local260, local42);
					Static87.aClass353_33.method7679(new Class1_Sub6_Sub8(local1208));
				}
			} else if (arg0 == Static299.aClass316_9) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local20 = Static585.aClass1_Sub35_Sub2_2.method5750();
				Static518.aClass96_4.method1925(local12).method1908(local20);
			} else if (arg0 == Static449.aClass316_12) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5793();
				local20 = (local12 & 0x7) + Static590.anInt9615;
				local26 = Static116.anInt2289 + local20;
				local30 = (local12 >> 4 & 0x7) + Static295.anInt5065;
				local34 = Static541.anInt9058 + local30;
				local38 = Static585.aClass1_Sub35_Sub2_2.method5779();
				@Pc(1304) Class1_Sub28 local1304 = (Class1_Sub28) Static19.aClass187_3.method3797((long) (local34 | Static487.anInt8209 << 28 | local26 << 14));
				if (local1304 != null) {
					for (@Pc(1312) Class1_Sub40 local1312 = (Class1_Sub40) local1304.aClass353_28.method7677(); local1312 != null; local1312 = (Class1_Sub40) local1304.aClass353_28.method7687()) {
						if (local1312.anInt7304 == (local38 & 0x7FFF)) {
							local1312.method7859();
							break;
						}
					}
					if (local1304.aClass353_28.method7686()) {
						local1304.method7859();
					}
					if (local30 >= 0 && local20 >= 0 && local30 < Static71.anInt1410 && Static471.anInt8012 > local20) {
						Static38.method540(local20, Static487.anInt8209, local30);
					}
				}
			} else if (Static323.aClass316_10 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local20 = Static585.aClass1_Sub35_Sub2_2.method5779();
				local26 = Static585.aClass1_Sub35_Sub2_2.method5742();
				local30 = (local26 & 0x7) + Static590.anInt9615;
				local34 = Static116.anInt2289 + local30;
				local38 = Static295.anInt5065 + (local26 >> 4 & 0x7);
				local42 = Static541.anInt9058 + local38;
				local260 = Static585.aClass1_Sub35_Sub2_2.method5772();
				if (Static296.anInt5113 != local260) {
					@Pc(1441) boolean local1441 = local38 >= 0 && local30 >= 0 && Static71.anInt1410 > local38 && Static471.anInt8012 > local30;
					if (local1441 || Static370.method4987(Static90.anInt1938)) {
						Static409.method5644(new Class1_Sub40(local20, local12), local42, Static487.anInt8209, local34);
						if (local1441) {
							Static38.method540(local30, Static487.anInt8209, local38);
						}
					}
				}
			} else if (Static116.aClass316_3 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = (local12 >> 4 & 0x7) + Static295.anInt5065;
				local26 = Static590.anInt9615 + (local12 & 0x7);
				local30 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local34 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local38 = Static585.aClass1_Sub35_Sub2_2.method5771();
				local42 = Static585.aClass1_Sub35_Sub2_2.method5750();
				if (local20 >= 0 && local26 >= 0 && Static71.anInt1410 > local20 && Static471.anInt8012 > local26) {
					local260 = local20 * 512 + 256;
					local266 = local26 * 512 + 256;
					local272 = Static487.anInt8209;
					if (local272 < 3 && Static466.method6426(local26, local20)) {
						local272++;
					}
					@Pc(1576) Class8_Sub3_Sub3_Sub3 local1576 = new Class8_Sub3_Sub3_Sub3(local30, local38, Static301.anInt5197, Static487.anInt8209, local272, local260, Static66.method1191(local260, Static487.anInt8209, local266) - local34, local266, local20, local20, local26, local26, local42);
					Static356.aClass353_42.method7679(new Class1_Sub6_Sub6(local1576));
				}
			} else if (arg0 == Static510.aClass316_14) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = (local12 >> 4 & 0x7) + Static295.anInt5065;
				local26 = Static590.anInt9615 + (local12 & 0x7);
				local30 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local260 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local266 = Static585.aClass1_Sub35_Sub2_2.method5750();
				if (local20 >= 0 && local26 >= 0 && local20 < Static71.anInt1410 && Static471.anInt8012 > local26) {
					local272 = local38 + 1;
					if (local20 - local272 <= Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] && local20 + local272 >= Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] && local26 - local272 <= Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] <= local272 + local26) {
						Static216.method3351(local30, local260, local38 + (local20 << 16) + (Static487.anInt8209 << 24) + (local26 << 8), local42, local266);
					}
				}
			} else if (Static529.aClass316_15 == arg0) {
				local12 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local20 = Static295.anInt5065 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static590.anInt9615;
				local30 = Static585.aClass1_Sub35_Sub2_2.method5771();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local38 = local34 >> 4 & 0xF;
				local42 = local34 & 0x7;
				local260 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local266 = Static585.aClass1_Sub35_Sub2_2.method5750();
				if (local20 >= 0 && local26 >= 0 && Static71.anInt1410 > local20 && Static471.anInt8012 > local26) {
					local272 = local38 + 1;
					if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] >= local20 - local272 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] <= local272 + local20 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] >= local26 - local272 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0] <= local272 + local26) {
						Static89.method1550(local38 + (local26 << 8) + (Static487.anInt8209 << 24) + (local20 << 16), local260, local42, local266, local30);
					}
				}
			} else {
				Static345.method4708(null, "T3 - " + arg0);
				Static424.method5868(false);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)Z")
	public static boolean method388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
