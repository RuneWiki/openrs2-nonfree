import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
	public static final int[] anIntArray146 = new int[4];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!gaa;II)V")
	public static void method2765(@OriginalArg(1) Class108 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1 local8 = arg0.method3526(Static47.aClass33_3);
		if (local8 == null) {
			return;
		}
		Static47.aClass33_3.KA(arg1, arg2, arg0.anInt4067 + arg1, arg0.anInt4037 + arg2);
		if (Static381.anInt7250 < 3) {
			Static266.aClass5_35.method7574((float) arg1 + (float) arg0.anInt4067 / 2.0F, (float) arg2 + (float) arg0.anInt4037 / 2.0F, ((int) -Static502.aFloat230 & 0x3FFF) << 2, local8, arg1, arg2);
		} else {
			Static47.aClass33_3.A(-16777216, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;BLclient!wm;)I")
	public static int method2772(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class374 arg1) {
		if (arg1.anInt10472 != -1) {
			return arg1.anInt10472;
		}
		if (arg1.anInt10478 != -1) {
			@Pc(28) Class156 local28 = arg0.anInterface5_11.method6869(arg1.anInt10478);
			if (!local28.aBoolean497) {
				return local28.aShort82;
			}
		}
		return arg1.anInt10477;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!an;B)V")
	public static void method2773(@OriginalArg(0) Class20 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (arg0 == Static373.aClass20_14) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8426();
			local16 = Static281.aClass3_Sub15_Sub1_4.method8429();
			local20 = Static281.aClass3_Sub15_Sub1_4.method8461();
			local26 = Static120.anInt3090 + (local20 & 0x7);
			local31 = Static124.anInt3150 + local26;
			local39 = (local20 >> 4 & 0x7) + Static633.anInt10415;
			local43 = Static446.anInt8090 + local39;
			@Pc(68) boolean local68 = local39 >= 0 && local26 >= 0 && local39 < Static394.anInt7540 && local26 < Static462.anInt8391;
			if (local68 || Static408.method6435(Static631.anInt10399)) {
				Static219.method4266(new Class3_Sub32(local16, local12), local43, Static591.anInt9848, local31);
				if (local68) {
					Static10.method116(Static591.anInt9848, local26, local39);
				}
			}
			return;
		}
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(150) int local150;
		@Pc(168) int local168;
		if (arg0 == Static14.aClass20_25) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = Static633.anInt10415 + (local12 >> 4 & 0x7);
			local20 = Static120.anInt3090 + (local12 & 0x7);
			local26 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local26 == 65535) {
				local26 = -1;
			}
			local31 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local39 = local31 >> 4 & 0xF;
			local43 = local31 & 0x7;
			local142 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local146 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local150 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local16 >= 0 && local20 >= 0 && Static394.anInt7540 > local16 && local20 < Static462.anInt8391) {
				local168 = local39 + 1;
				if (local16 - local168 <= Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] && local16 + local168 >= Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] >= local20 - local168 && local168 + local20 >= Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0]) {
					Static70.method1785(local39 + (Static591.anInt9848 << 24) + (local16 << 16) + (local20 << 8), local142, local146, local26, local43, local150);
				}
			}
			return;
		}
		@Pc(309) int local309;
		@Pc(315) int local315;
		@Pc(332) int local332;
		if (Static290.aClass20_9 == arg0) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = (local12 >> 4 & 0xF) + Static633.anInt10415 * 2;
			local20 = (local12 & 0xF) + Static120.anInt3090 * 2;
			local26 = Static281.aClass3_Sub15_Sub1_4.method8401();
			@Pc(268) boolean local268 = (local26 & 0x1) != 0;
			@Pc(276) boolean local276 = (local26 & 0x2) != 0;
			local43 = local276 ? local26 >> 2 : -1;
			local142 = local16 + Static281.aClass3_Sub15_Sub1_4.method8440();
			local146 = Static281.aClass3_Sub15_Sub1_4.method8440() + local20;
			local150 = Static281.aClass3_Sub15_Sub1_4.method8444();
			local168 = Static281.aClass3_Sub15_Sub1_4.method8444();
			local309 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local315 = Static281.aClass3_Sub15_Sub1_4.method8401();
			if (local276) {
				local315 = (byte) local315;
			} else {
				local315 *= 4;
			}
			local332 = Static281.aClass3_Sub15_Sub1_4.method8401() * 4;
			@Pc(336) int local336 = Static281.aClass3_Sub15_Sub1_4.method8414();
			@Pc(340) int local340 = Static281.aClass3_Sub15_Sub1_4.method8414();
			@Pc(344) int local344 = Static281.aClass3_Sub15_Sub1_4.method8401();
			if (local344 == 255) {
				local344 = -1;
			}
			@Pc(353) int local353 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local16 >= 0 && local20 >= 0 && local16 < Static394.anInt7540 * 2 && local20 < Static394.anInt7540 * 2 && local142 >= 0 && local146 >= 0 && Static462.anInt8391 * 2 > local142 && local146 < Static462.anInt8391 * 2 && local309 != 65535) {
				local146 *= 256;
				local315 <<= 0x2;
				local332 <<= 0x2;
				local353 <<= 0x2;
				local142 = local142 * 256;
				local16 = local16 * 256;
				local20 *= 256;
				if (local150 != 0 && local43 != -1) {
					@Pc(437) Class2_Sub3_Sub1_Sub2 local437 = null;
					@Pc(447) int local447;
					if (local150 < 0) {
						local447 = -local150 - 1;
						if (local447 == Static399.anInt7626) {
							local437 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2;
						} else {
							local437 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local447];
						}
					} else {
						local447 = local150 - 1;
						@Pc(469) Class3_Sub49 local469 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local447);
						if (local469 != null) {
							local437 = local469.aClass2_Sub3_Sub1_Sub2_Sub1_2;
						}
					}
					if (local437 != null) {
						@Pc(480) Class232 local480 = local437.method5304();
						if (local480.anIntArrayArray66 != null && local480.anIntArrayArray66[local43] != null) {
							local315 -= local480.anIntArrayArray66[local43][1];
						}
						if (local480.anIntArrayArray65 != null && local480.anIntArrayArray65[local43] != null) {
							local315 -= local480.anIntArrayArray65[local43][1];
						}
					}
				}
				@Pc(538) Class2_Sub3_Sub1_Sub3 local538 = new Class2_Sub3_Sub1_Sub3(local309, Static591.anInt9848, Static591.anInt9848, local16, local20, local315, Static251.anInt5580 + local336, local340 - -Static251.anInt5580, local344, local353, local150, local168, local332, local268, local43);
				local538.method3613(Static202.method3958(local146, Static591.anInt9848, local142) - local332, Static251.anInt5580 + local336, local142, local146);
				Static267.aClass276_38.method6906(new Class3_Sub1_Sub8(local538));
			}
		} else if (Static533.aClass20_22 == arg0) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local16 = Static281.aClass3_Sub15_Sub1_4.method8401();
			Static541.aClass349_4.method8123(local12).method6858(local16);
		} else if (arg0 == Static273.aClass20_8) {
			Static281.aClass3_Sub15_Sub1_4.method8401();
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = Static633.anInt10415 + (local12 >> 4 & 0x7);
			local20 = Static120.anInt3090 + (local12 & 0x7);
			local26 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local31 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local39 = Static281.aClass3_Sub15_Sub1_4.method8421();
			@Pc(627) String local627 = Static281.aClass3_Sub15_Sub1_4.method8413();
			Static630.method8537(local20, local627, local31, local16, local26, local39, Static591.anInt9848);
		} else if (Static160.aClass20_7 == arg0) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = Static633.anInt10415 + (local12 >> 4 & 0x7);
			local20 = Static120.anInt3090 + (local12 & 0x7);
			local26 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local26 == 65535) {
				local26 = -1;
			}
			local31 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local39 = local31 >> 4 & 0xF;
			local43 = local31 & 0x7;
			local142 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local146 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local150 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local16 >= 0 && local20 >= 0 && Static394.anInt7540 > local16 && local20 < Static462.anInt8391) {
				local168 = local39 + 1;
				if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] >= local16 - local168 && local16 + local168 >= Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] >= local20 - local168 && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] <= local168 + local20) {
					Static95.method2479(local26, local43, local142, local146, local39 + (Static591.anInt9848 << 24) + (local16 << 16) + (local20 << 8), local150);
				}
			}
		} else if (arg0 == Static353.aClass20_13) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8447();
			local16 = Static633.anInt10415 + (local12 >> 4 & 0x7);
			local20 = Static120.anInt3090 + (local12 & 0x7);
			local26 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local26 == 65535) {
				local26 = -1;
			}
			local31 = Static281.aClass3_Sub15_Sub1_4.method8461();
			local39 = local31 >> 2;
			local43 = local31 & 0x3;
			local142 = Static606.anIntArray609[local39];
			Static442.method6697(local43, local20, local142, local16, local26, Static591.anInt9848, local39);
		} else if (Static491.aClass20_21 == arg0) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8447();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local26 = Static606.anIntArray609[local16];
			local31 = Static281.aClass3_Sub15_Sub1_4.method8426();
			local39 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local43 = (local39 >> 4 & 0x7) + Static633.anInt10415;
			local142 = (local39 & 0x7) + Static120.anInt3090;
			if (Static408.method6435(Static631.anInt10399) || local43 >= 0 && local142 >= 0 && Static394.anInt7540 > local43 && local142 < Static462.anInt8391) {
				Static83.method5851(local43, local20, local16, local142, local31, local26, Static591.anInt9848);
			}
		} else if (arg0 == Static7.aClass20_1) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			@Pc(931) boolean local931 = (local12 & 0x80) != 0;
			local20 = Static633.anInt10415 + (local12 >> 3 & 0x7);
			local26 = Static120.anInt3090 + (local12 & 0x7);
			local31 = local20 + Static281.aClass3_Sub15_Sub1_4.method8440();
			local39 = local26 + Static281.aClass3_Sub15_Sub1_4.method8440();
			local43 = Static281.aClass3_Sub15_Sub1_4.method8444();
			local142 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local146 = Static281.aClass3_Sub15_Sub1_4.method8401() * 4;
			local150 = Static281.aClass3_Sub15_Sub1_4.method8401() * 4;
			local168 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local309 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local315 = Static281.aClass3_Sub15_Sub1_4.method8401();
			if (local315 == 255) {
				local315 = -1;
			}
			local332 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (local20 >= 0 && local26 >= 0 && local20 < Static394.anInt7540 && local26 < Static462.anInt8391 && local31 >= 0 && local39 >= 0 && Static394.anInt7540 > local31 && Static462.anInt8391 > local39 && local142 != 65535) {
				local26 = local26 * 512 + 256;
				local150 <<= 0x2;
				local332 <<= 0x2;
				local20 = local20 * 512 + 256;
				local39 = local39 * 512 + 256;
				local146 <<= 0x2;
				local31 = local31 * 512 + 256;
				@Pc(1098) Class2_Sub3_Sub1_Sub3 local1098 = new Class2_Sub3_Sub1_Sub3(local142, Static591.anInt9848, Static591.anInt9848, local20, local26, local146, local168 + Static251.anInt5580, local309 + Static251.anInt5580, local315, local332, 0, local43, local150, local931, -1);
				local1098.method3613(Static202.method3958(local39, Static591.anInt9848, local31) - local150, Static251.anInt5580 + local168, local31, local39);
				Static267.aClass276_38.method6906(new Class3_Sub1_Sub8(local1098));
			}
		} else if (arg0 == Static21.aClass20_3) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8429();
			local16 = Static281.aClass3_Sub15_Sub1_4.method8447();
			local20 = (local16 & 0x7) + Static120.anInt3090;
			local26 = Static124.anInt3150 + local20;
			local31 = Static633.anInt10415 + (local16 >> 4 & 0x7);
			local39 = local31 + Static446.anInt8090;
			@Pc(1172) Class3_Sub46 local1172 = (Class3_Sub46) Static644.aClass307_55.method7424((long) (local39 | local26 << 14 | Static591.anInt9848 << 28));
			if (local1172 != null) {
				for (@Pc(1180) Class3_Sub32 local1180 = (Class3_Sub32) local1172.aClass276_56.method6907(); local1180 != null; local1180 = (Class3_Sub32) local1172.aClass276_56.method6912()) {
					if (local1180.anInt7689 == (local12 & 0x7FFF)) {
						local1180.method8671();
						break;
					}
				}
				if (local1172.aClass276_56.method6908()) {
					local1172.method8671();
				}
				if (local31 >= 0 && local20 >= 0 && Static394.anInt7540 > local31 && local20 < Static462.anInt8391) {
					Static10.method116(Static591.anInt9848, local20, local31);
				}
			}
		} else if (Static35.aClass20_4 == arg0) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8447();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local26 = Static606.anIntArray609[local16];
			local31 = Static281.aClass3_Sub15_Sub1_4.method8447();
			local39 = (local31 >> 4 & 0x7) + Static633.anInt10415;
			local43 = Static120.anInt3090 + (local31 & 0x7);
			if (Static408.method6435(Static631.anInt10399) || local39 >= 0 && local43 >= 0 && local39 < Static394.anInt7540 && Static462.anInt8391 > local43) {
				Static83.method5851(local39, local20, local16, local43, -1, local26, Static591.anInt9848);
			}
		} else if (arg0 == Static431.aClass20_17) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = Static633.anInt10415 + (local12 >> 4 & 0x7);
			local20 = Static120.anInt3090 + (local12 & 0x7);
			local26 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local31 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local39 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local43 = Static281.aClass3_Sub15_Sub1_4.method8401();
			if (local16 >= 0 && local20 >= 0 && local16 < Static394.anInt7540 && local20 < Static462.anInt8391) {
				local142 = local16 * 512 + 256;
				local146 = local20 * 512 + 256;
				local150 = Static591.anInt9848;
				if (local150 < 3 && Static525.method7485(local20, local16)) {
					local150++;
				}
				@Pc(1420) Class2_Sub3_Sub1_Sub1 local1420 = new Class2_Sub3_Sub1_Sub1(local26, local39, Static251.anInt5580, Static591.anInt9848, local150, local142, Static202.method3958(local146, Static591.anInt9848, local142) - local31, local146, local16, local16, local20, local20, local43);
				Static239.aClass276_36.method6906(new Class3_Sub1_Sub17(local1420));
			}
		} else if (arg0 == Static467.aClass20_19) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8401();
			local16 = Static120.anInt3090 + (local12 & 0x7);
			local20 = Static124.anInt3150 + local16;
			local26 = (local12 >> 4 & 0x7) + Static633.anInt10415;
			local31 = Static446.anInt8090 + local26;
			local39 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local43 = Static281.aClass3_Sub15_Sub1_4.method8414();
			local142 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (Static644.aClass307_55 != null) {
				@Pc(1488) Class3_Sub46 local1488 = (Class3_Sub46) Static644.aClass307_55.method7424((long) (local31 | local20 << 14 | Static591.anInt9848 << 28));
				if (local1488 != null) {
					for (@Pc(1496) Class3_Sub32 local1496 = (Class3_Sub32) local1488.aClass276_56.method6907(); local1496 != null; local1496 = (Class3_Sub32) local1488.aClass276_56.method6912()) {
						if (local1496.anInt7689 == (local39 & 0x7FFF) && local43 == local1496.anInt7685) {
							local1496.method8671();
							local1496.anInt7685 = local142;
							Static219.method4266(local1496, local31, Static591.anInt9848, local20);
							break;
						}
					}
					if (local26 >= 0 && local16 >= 0 && Static394.anInt7540 > local26 && Static462.anInt8391 > local16) {
						Static10.method116(Static591.anInt9848, local16, local26);
					}
				}
			}
		} else if (arg0 == Static443.aClass20_18) {
			local12 = Static281.aClass3_Sub15_Sub1_4.method8460();
			local16 = Static281.aClass3_Sub15_Sub1_4.method8429();
			local20 = Static281.aClass3_Sub15_Sub1_4.method8424();
			local26 = (local20 & 0x7) + Static120.anInt3090;
			local31 = local26 + Static124.anInt3150;
			local39 = (local20 >> 4 & 0x7) + Static633.anInt10415;
			local43 = Static446.anInt8090 + local39;
			local142 = Static281.aClass3_Sub15_Sub1_4.method8414();
			if (Static399.anInt7626 != local142) {
				@Pc(1621) boolean local1621 = local39 >= 0 && local26 >= 0 && local39 < Static394.anInt7540 && Static462.anInt8391 > local26;
				if (local1621 || Static408.method6435(Static631.anInt10399)) {
					Static219.method4266(new Class3_Sub32(local16, local12), local43, Static591.anInt9848, local31);
					if (local1621) {
						Static10.method116(Static591.anInt9848, local26, local39);
					}
				}
			}
		} else {
			Static544.method7724("T3 - " + arg0, null);
			Static229.method4376(false);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ufa;)Z")
	public static boolean method2774(@OriginalArg(1) Class332 arg0) {
		return arg0 == null ? false : Static142.method3163(arg0.anInt9664 - arg0.anInt9666, -arg0.anInt9662 + arg0.anInt9658, arg0.anInt9665 - arg0.anInt9663, arg0.anInt9662, arg0.anInt9666, arg0.anInt9663);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZIIFI)[I")
	public static int[] method2776(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub2_Sub13 local10 = new Class3_Sub2_Sub13();
		local10.anInt4349 = 35;
		local10.anInt4340 = 4;
		local10.anInt4343 = (int) (arg0 * 4096.0F);
		local10.anInt4345 = 8;
		local10.aBoolean370 = true;
		local10.anInt4346 = 8;
		local10.method8332();
		Static262.method4869(2048, 1);
		local10.method3716(0, local6);
		return local6;
	}
}
