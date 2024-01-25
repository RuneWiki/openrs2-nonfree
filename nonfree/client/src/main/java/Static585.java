import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	public static int anInt10166;

	@OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
	public static int anInt10170;

	@OriginalMember(owner = "client!ts", name = "ib", descriptor = "I")
	public static int anInt10191;

	@OriginalMember(owner = "client!ts", name = "bb", descriptor = "I")
	public static int anInt10186 = 0;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public static void method8833() {
		try {
			@Pc(15) int local15;
			if (Static311.anInt5615 == 1) {
				local15 = Static300.aClass2_Sub26_Sub3_8.method6976();
				if (local15 > 0 && Static300.aClass2_Sub26_Sub3_8.method7003()) {
					local15 -= Static530.anInt9738;
					if (local15 < 0) {
						local15 = 0;
					}
					Static300.aClass2_Sub26_Sub3_8.method6979(local15);
					return;
				}
				Static300.aClass2_Sub26_Sub3_8.method7010();
				Static300.aClass2_Sub26_Sub3_8.method7000();
				if (Static337.aClass124_71 == null) {
					Static311.anInt5615 = 0;
				} else {
					Static311.anInt5615 = 2;
				}
				Static451.aClass316_1 = null;
				Static88.aClass2_Sub39_1 = null;
			}
			if (Static311.anInt5615 == 3) {
				local15 = Static300.aClass2_Sub26_Sub3_8.method6976();
				if (local15 < Static131.anInt2515 && Static300.aClass2_Sub26_Sub3_8.method7003()) {
					local15 += Static670.anInt7888;
					if (Static131.anInt2515 < local15) {
						local15 = Static131.anInt2515;
					}
					Static300.aClass2_Sub26_Sub3_8.method6979(local15);
				} else {
					Static670.anInt7888 = 0;
					Static311.anInt5615 = 0;
				}
			}
		} catch (@Pc(91) Exception local91) {
			local91.printStackTrace();
			Static300.aClass2_Sub26_Sub3_8.method7010();
			Static311.anInt5615 = 0;
			Static88.aClass2_Sub39_1 = null;
			Static151.aClass2_Sub26_Sub3_5 = null;
			Static337.aClass124_71 = null;
			Static451.aClass316_1 = null;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!vb;I)V")
	public static void method8836(@OriginalArg(0) Class368 arg0) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (arg0 == Static304.aClass368_21) {
			Static206.aClass2_Sub8_Sub2_1.method5203();
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = (local16 >> 4 & 0x7) + Static226.anInt4603;
			local30 = Static152.anInt3335 + (local16 & 0x7);
			local34 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local38 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local42 = Static206.aClass2_Sub8_Sub2_1.method5161();
			@Pc(46) String local46 = Static206.aClass2_Sub8_Sub2_1.method5178();
			Static469.method7506(local46, local42, local34, local38, local24, local30, Static519.anInt9182);
			return;
		}
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(125) int local125;
		@Pc(141) int local141;
		if (arg0 == Static165.aClass368_9) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = Static226.anInt4603 * 2 + (local16 >> 4 & 0xF);
			local30 = Static152.anInt3335 * 2 + (local16 & 0xF);
			local34 = Static206.aClass2_Sub8_Sub2_1.method5203();
			@Pc(93) boolean local93 = (local34 & 0x1) != 0;
			@Pc(104) boolean local104 = (local34 & 0x2) != 0;
			local112 = local104 ? local34 >> 2 : -1;
			local118 = Static206.aClass2_Sub8_Sub2_1.method5175() + local24;
			local125 = local30 + Static206.aClass2_Sub8_Sub2_1.method5175();
			local129 = Static206.aClass2_Sub8_Sub2_1.method5174();
			local133 = Static206.aClass2_Sub8_Sub2_1.method5174();
			local137 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local141 = Static206.aClass2_Sub8_Sub2_1.method5203();
			if (local104) {
				local141 = (byte) local141;
			} else {
				local141 *= 4;
			}
			local158 = Static206.aClass2_Sub8_Sub2_1.method5203() * 4;
			local162 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local166 = Static206.aClass2_Sub8_Sub2_1.method5211();
			@Pc(170) int local170 = Static206.aClass2_Sub8_Sub2_1.method5203();
			@Pc(174) int local174 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local170 == 255) {
				local170 = -1;
			}
			if (local24 >= 0 && local30 >= 0 && Static222.anInt4533 * 2 > local24 && local30 < Static222.anInt4533 * 2 && local118 >= 0 && local125 >= 0 && local118 < Static668.anInt11370 * 2 && Static668.anInt11370 * 2 > local125 && local137 != 65535) {
				local118 = local118 * 256;
				local174 <<= 0x2;
				local125 *= 256;
				local24 *= 256;
				local158 <<= 0x2;
				local30 *= 256;
				local141 <<= 0x2;
				if (local129 != 0 && local112 != -1) {
					@Pc(256) Class15_Sub3_Sub3_Sub1 local256 = null;
					@Pc(262) int local262;
					if (local129 >= 0) {
						local262 = local129 - 1;
						@Pc(269) Class2_Sub6 local269 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local262);
						if (local269 != null) {
							local256 = local269.aClass15_Sub3_Sub3_Sub1_Sub2_1;
						}
					} else {
						local262 = -local129 - 1;
						if (Static659.anInt11273 == local262) {
							local256 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2;
						} else {
							local256 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local262];
						}
					}
					if (local256 != null) {
						@Pc(296) Class248 local296 = local256.method3673();
						if (local296.anIntArrayArray35 != null && local296.anIntArrayArray35[local112] != null) {
							local141 -= local296.anIntArrayArray35[local112][1];
						}
						if (local296.anIntArrayArray34 != null && local296.anIntArrayArray34[local112] != null) {
							local141 -= local296.anIntArrayArray34[local112][1];
						}
					}
				}
				@Pc(353) Class15_Sub3_Sub3_Sub3 local353 = new Class15_Sub3_Sub3_Sub3(local137, Static519.anInt9182, Static519.anInt9182, local24, local30, local141, local162 + Static62.anInt1184, Static62.anInt1184 + local166, local170, local174, local129, local133, local158, local93, local112);
				local353.method4011(local125, Static10.method154(local125, local118, Static519.anInt9182) - local158, local162 - -Static62.anInt1184, local118);
				Static370.aClass271_42.method7174(new Class2_Sub1_Sub12(local353));
			}
		} else if (Static471.aClass368_17 == arg0) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = Static152.anInt3335 + (local16 & 0x7);
			local30 = local24 + Static490.anInt8763;
			local34 = Static226.anInt4603 + (local16 >> 4 & 0x7);
			local38 = local34 + Static640.anInt11085;
			local42 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local112 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local118 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (Static18.aClass335_2 != null) {
				@Pc(443) Class2_Sub47 local443 = (Class2_Sub47) Static18.aClass335_2.method8357((long) (local30 << 14 | Static519.anInt9182 << 28 | local38));
				if (local443 != null) {
					for (@Pc(451) Class2_Sub41 local451 = (Class2_Sub41) local443.aClass271_57.method7177(); local451 != null; local451 = (Class2_Sub41) local443.aClass271_57.method7175()) {
						if (local451.anInt7375 == (local42 & 0x7FFF) && local451.anInt7377 == local112) {
							local451.method9825();
							local451.anInt7377 = local118;
							Static289.method4829(local451, local30, Static519.anInt9182, local38);
							break;
						}
					}
					if (local34 >= 0 && local24 >= 0 && local34 < Static222.anInt4533 && Static668.anInt11370 > local24) {
						Static639.method9457(local24, Static519.anInt9182, local34);
					}
				}
			}
		} else if (Static536.aClass368_12 == arg0) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = Static226.anInt4603 + (local16 >> 4 & 0x7);
			local30 = (local16 & 0x7) + Static152.anInt3335;
			local34 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local38 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local42 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local112 = Static206.aClass2_Sub8_Sub2_1.method5203();
			if (local24 >= 0 && local30 >= 0 && local24 < Static222.anInt4533 && Static668.anInt11370 > local30) {
				local118 = local24 * 512 + 256;
				local125 = local30 * 512 + 256;
				local129 = Static519.anInt9182;
				if (local129 < 3 && Static45.method947(local24, local30)) {
					local129++;
				}
				@Pc(609) Class15_Sub3_Sub3_Sub5 local609 = new Class15_Sub3_Sub3_Sub5(local34, local42, Static62.anInt1184, Static519.anInt9182, local129, local118, Static10.method154(local125, local118, Static519.anInt9182) - local38, local125, local24, local24, local30, local30, local112);
				Static36.aClass271_4.method7174(new Class2_Sub1_Sub14(local609));
			}
		} else if (arg0 == Static108.aClass368_3) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local24 = Static206.aClass2_Sub8_Sub2_1.method5203();
			Static251.aClass328_1.method8261(local16).method8302(local24);
		} else if (arg0 == Static213.aClass368_10) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			@Pc(652) boolean local652 = (local16 & 0x80) != 0;
			local30 = Static226.anInt4603 + (local16 >> 3 & 0x7);
			local34 = Static152.anInt3335 + (local16 & 0x7);
			local38 = local30 + Static206.aClass2_Sub8_Sub2_1.method5175();
			local42 = local34 + Static206.aClass2_Sub8_Sub2_1.method5175();
			local112 = Static206.aClass2_Sub8_Sub2_1.method5174();
			local118 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local125 = Static206.aClass2_Sub8_Sub2_1.method5203() * 4;
			local129 = Static206.aClass2_Sub8_Sub2_1.method5203() * 4;
			local133 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local137 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local141 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local158 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local141 == 255) {
				local141 = -1;
			}
			if (local30 >= 0 && local34 >= 0 && local30 < Static222.anInt4533 && Static668.anInt11370 > local34 && local38 >= 0 && local42 >= 0 && Static222.anInt4533 > local38 && Static668.anInt11370 > local42 && local118 != 65535) {
				local158 <<= 0x2;
				local34 = local34 * 512 + 256;
				local129 <<= 0x2;
				local125 <<= 0x2;
				local30 = local30 * 512 + 256;
				local42 = local42 * 512 + 256;
				local38 = local38 * 512 + 256;
				@Pc(828) Class15_Sub3_Sub3_Sub3 local828 = new Class15_Sub3_Sub3_Sub3(local118, Static519.anInt9182, Static519.anInt9182, local30, local34, local125, Static62.anInt1184 + local133, local137 - -Static62.anInt1184, local141, local158, 0, local112, local129, local652, -1);
				local828.method4011(local42, Static10.method154(local42, local38, Static519.anInt9182) - local129, Static62.anInt1184 + local133, local38);
				Static370.aClass271_42.method7174(new Class2_Sub1_Sub12(local828));
			}
		} else if (arg0 == Static634.aClass368_23) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = (local16 & 0x7) + Static152.anInt3335;
			local30 = Static490.anInt8763 + local24;
			local34 = (local16 >> 4 & 0x7) + Static226.anInt4603;
			local38 = Static640.anInt11085 + local34;
			local42 = Static206.aClass2_Sub8_Sub2_1.method5226();
			@Pc(900) Class2_Sub47 local900 = (Class2_Sub47) Static18.aClass335_2.method8357((long) (local30 << 14 | Static519.anInt9182 << 28 | local38));
			if (local900 != null) {
				for (@Pc(908) Class2_Sub41 local908 = (Class2_Sub41) local900.aClass271_57.method7177(); local908 != null; local908 = (Class2_Sub41) local900.aClass271_57.method7175()) {
					if (local908.anInt7375 == (local42 & 0x7FFF)) {
						local908.method9825();
						break;
					}
				}
				if (local900.aClass271_57.method7169()) {
					local900.method9825();
				}
				if (local34 >= 0 && local24 >= 0 && Static222.anInt4533 > local34 && local24 < Static668.anInt11370) {
					Static639.method9457(local24, Static519.anInt9182, local34);
				}
			}
		} else if (arg0 == Static549.aClass368_18) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = Static226.anInt4603 + (local16 >> 4 & 0x7);
			local30 = Static152.anInt3335 + (local16 & 0x7);
			local34 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local34 == 65535) {
				local34 = -1;
			}
			local38 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local42 = local38 >> 4 & 0xF;
			local112 = local38 & 0x7;
			local118 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local125 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local129 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local24 >= 0 && local30 >= 0 && Static222.anInt4533 > local24 && Static668.anInt11370 > local30) {
				local133 = local42 + 1;
				if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] >= local24 - local133 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] <= local24 + local133 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] >= local30 - local133 && local30 + local133 >= Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0]) {
					Static574.method8721(local118, local42 + (local30 << 8) + (Static519.anInt9182 << 24) + (local24 << 16), local125, local34, local112, local129);
				}
			}
		} else if (arg0 == Static640.aClass368_24) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local24 = Static206.aClass2_Sub8_Sub2_1.method5207();
			local30 = local24 >> 2;
			local34 = local24 & 0x3;
			local38 = Static456.anIntArray410[local30];
			local42 = Static206.aClass2_Sub8_Sub2_1.method5206();
			local112 = Static226.anInt4603 + (local42 >> 4 & 0x7);
			local118 = (local42 & 0x7) + Static152.anInt3335;
			if (Static665.method9706(Static389.anInt7373) || local112 >= 0 && local118 >= 0 && Static222.anInt4533 > local112 && local118 < Static668.anInt11370) {
				Static356.method6104(local38, Static519.anInt9182, local112, local16, local34, local118, local30);
			}
		} else if (arg0 == Static505.aClass368_20) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local24 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local30 = Static152.anInt3335 + (local24 & 0x7);
			local34 = local30 + Static490.anInt8763;
			local38 = Static226.anInt4603 + (local24 >> 4 & 0x7);
			local42 = Static640.anInt11085 + local38;
			local112 = Static206.aClass2_Sub8_Sub2_1.method5214();
			@Pc(1233) boolean local1233 = local38 >= 0 && local30 >= 0 && local38 < Static222.anInt4533 && local30 < Static668.anInt11370;
			if (local1233 || Static665.method9706(Static389.anInt7373)) {
				Static289.method4829(new Class2_Sub41(local16, local112), local34, Static519.anInt9182, local42);
				if (local1233) {
					Static639.method9457(local30, Static519.anInt9182, local38);
				}
			}
		} else if (arg0 == Static53.aClass368_2) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5206();
			local24 = (local16 >> 4 & 0x7) + Static226.anInt4603;
			local30 = (local16 & 0x7) + Static152.anInt3335;
			local34 = Static206.aClass2_Sub8_Sub2_1.method5226();
			@Pc(1287) Class331 local1287 = Static251.aClass328_1.method8261(local34);
			local42 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local112 = local42 >> 2;
			local118 = Static456.anIntArray410[local112];
			if (local112 == 11) {
				local112 = 10;
			}
			local125 = Static206.aClass2_Sub8_Sub2_1.method5206();
			local129 = 0;
			if (local1287.aByteArray87 != null) {
				local133 = -1;
				for (local137 = 0; local137 < local1287.aByteArray87.length; local137++) {
					if (local112 == local1287.aByteArray87[local137]) {
						local133 = local137;
						break;
					}
				}
				local129 = local1287.anIntArrayArray47[local133].length;
			}
			local133 = 0;
			if (local1287.aShortArray124 != null) {
				local133 = local1287.aShortArray124.length;
			}
			local137 = 0;
			if (local1287.aShortArray121 != null) {
				local137 = local1287.aShortArray121.length;
			}
			if ((local125 & 0x1) == 1) {
				Static26.method459(local24, local30, local118, Static519.anInt9182, (Class278) null);
			} else {
				@Pc(1382) int[] local1382 = null;
				if ((local125 & 0x2) == 2) {
					local1382 = new int[local129];
					for (local158 = 0; local158 < local129; local158++) {
						local1382[local158] = Static206.aClass2_Sub8_Sub2_1.method5211();
					}
				}
				@Pc(1412) short[] local1412 = null;
				if ((local125 & 0x4) == 4) {
					local1412 = new short[local133];
					for (local162 = 0; local162 < local133; local162++) {
						local1412[local162] = (short) Static206.aClass2_Sub8_Sub2_1.method5211();
					}
				}
				@Pc(1439) short[] local1439 = null;
				if ((local125 & 0x8) == 8) {
					local1439 = new short[local137];
					for (local166 = 0; local166 < local137; local166++) {
						local1439[local166] = (short) Static206.aClass2_Sub8_Sub2_1.method5211();
					}
				}
				Static26.method459(local24, local30, local118, Static519.anInt9182, new Class278((long) Static191.aLong100++, local1382, local1412, local1439));
			}
		} else if (arg0 == Static42.aClass368_1) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5226();
			if (local16 == 65535) {
				local16 = -1;
			}
			local24 = Static206.aClass2_Sub8_Sub2_1.method5201();
			local30 = (local24 >> 4 & 0x7) + Static226.anInt4603;
			local34 = Static152.anInt3335 + (local24 & 0x7);
			local38 = Static206.aClass2_Sub8_Sub2_1.method5206();
			local42 = local38 >> 2;
			local112 = local38 & 0x3;
			local118 = Static456.anIntArray410[local42];
			Static73.method1354(local112, local16, Static519.anInt9182, local42, local30, local118, local34);
		} else if (arg0 == Static610.aClass368_22) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5201();
			local24 = local16 >> 2;
			local30 = local16 & 0x3;
			local34 = Static456.anIntArray410[local24];
			local38 = Static206.aClass2_Sub8_Sub2_1.method5206();
			local42 = Static226.anInt4603 + (local38 >> 4 & 0x7);
			local112 = (local38 & 0x7) + Static152.anInt3335;
			if (Static665.method9706(Static389.anInt7373) || local42 >= 0 && local112 >= 0 && Static222.anInt4533 > local42 && Static668.anInt11370 > local112) {
				Static356.method6104(local34, Static519.anInt9182, local42, -1, local30, local112, local24);
			}
		} else if (arg0 == Static503.aClass368_16) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5207();
			local24 = Static152.anInt3335 + (local16 & 0x7);
			local30 = local24 + Static490.anInt8763;
			local34 = Static226.anInt4603 + (local16 >> 4 & 0x7);
			local38 = local34 + Static640.anInt11085;
			local42 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local112 = Static206.aClass2_Sub8_Sub2_1.method5211();
			local118 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local42 != Static659.anInt11273) {
				@Pc(1684) boolean local1684 = local34 >= 0 && local24 >= 0 && local34 < Static222.anInt4533 && Static668.anInt11370 > local24;
				if (local1684 || Static665.method9706(Static389.anInt7373)) {
					Static289.method4829(new Class2_Sub41(local118, local112), local30, Static519.anInt9182, local38);
					if (local1684) {
						Static639.method9457(local24, Static519.anInt9182, local34);
					}
				}
			}
		} else if (Static282.aClass368_13 == arg0) {
			local16 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local24 = Static226.anInt4603 + (local16 >> 4 & 0x7);
			local30 = Static152.anInt3335 + (local16 & 0x7);
			local34 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local34 == 65535) {
				local34 = -1;
			}
			local38 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local42 = local38 >> 4 & 0xF;
			local112 = local38 & 0x7;
			local118 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local125 = Static206.aClass2_Sub8_Sub2_1.method5203();
			local129 = Static206.aClass2_Sub8_Sub2_1.method5211();
			if (local24 >= 0 && local30 >= 0 && local24 < Static222.anInt4533 && local30 < Static668.anInt11370) {
				local133 = local42 + 1;
				if (local24 - local133 <= Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0] <= local133 + local24 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0] >= local30 - local133 && local30 + local133 >= Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0]) {
					Static221.method4080(local118, local42 + (local24 << 16) + (Static519.anInt9182 << 24) + (local30 << 8), local34, local112, local129, local125);
				}
			}
		} else {
			Static165.method3319((Throwable) null, "T3 - " + arg0);
			Static425.method7012(false);
		}
	}
}
