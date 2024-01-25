import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "Lclient!s;")
	public static Class57 aClass57_6;

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_207 = new Class198(32);

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
	public static int anInt5640 = -2;

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "Lclient!mi;")
	public static Class131 aClass131_1 = new Class131(8);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!vq;I)V")
	private static void method4864(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		Static1.method4521(arg1);
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0 > 1) {
			for (local21 = 0; local21 < Static350.anInt6637; local21++) {
				for (local25 = 0; local25 < Static105.anInt2647; local25++) {
					if ((Static2.aByteArrayArrayArray1[1][local21][local25] & 0x2) == 2) {
						Static310.method5112(local21, local25);
					}
				}
			}
		}
		for (local21 = 0; local21 < arg0; local21++) {
			for (local25 = 0; local25 <= Static105.anInt2647; local25++) {
				for (@Pc(59) int local59 = 0; local59 <= Static350.anInt6637; local59++) {
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(127) int local127;
					@Pc(221) int local221;
					@Pc(229) int local229;
					@Pc(249) int local249;
					@Pc(253) int local253;
					if ((Static72.aByteArrayArrayArray5[local21][local59][local25] & 0x1) != 0) {
						local73 = local25;
						local75 = local25;
						local77 = local21;
						local79 = local21;
						while (Static105.anInt2647 > local75 && (Static72.aByteArrayArrayArray5[local21][local59][local75 + 1] & 0x1) != 0) {
							local75++;
						}
						while (local73 > 0 && (Static72.aByteArrayArrayArray5[local21][local59][local73 - 1] & 0x1) != 0) {
							local73--;
						}
						label164: while (local77 > 0) {
							for (local127 = local73; local127 <= local75; local127++) {
								if ((Static72.aByteArrayArrayArray5[local77 - 1][local59][local127] & 0x1) == 0) {
									break label164;
								}
							}
							local77--;
						}
						label153: while (local79 < 3) {
							for (local127 = local73; local127 <= local75; local127++) {
								if ((Static72.aByteArrayArrayArray5[local79 + 1][local59][local127] & 0x1) == 0) {
									break label153;
								}
							}
							local79++;
						}
						local127 = (local75 + 1 - local73) * (local79 + 1 - local77);
						if (local127 >= 2) {
							local221 = Static338.anIntArrayArrayArray40[local79][local59][local73] - 240;
							local229 = Static338.anIntArrayArrayArray40[local77][local59][local73];
							Static291.method4878(1, local59 * 128, local59 * 128, local73 * 128, local75 * 128 + 128, local221, local229);
							for (local249 = local77; local249 <= local79; local249++) {
								for (local253 = local73; local253 <= local75; local253++) {
									Static72.aByteArrayArrayArray5[local249][local59][local253] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static72.aByteArrayArrayArray5[local21][local59][local25] & 0x2) != 0) {
						local73 = local59;
						local75 = local59;
						local77 = local21;
						local79 = local21;
						while (local73 > 0 && (Static72.aByteArrayArrayArray5[local21][local73 - 1][local25] & 0x2) != 0) {
							local73--;
						}
						while (local75 < Static350.anInt6637 && (Static72.aByteArrayArrayArray5[local21][local75 + 1][local25] & 0x2) != 0) {
							local75++;
						}
						label217: while (local77 > 0) {
							for (local127 = local73; local127 <= local75; local127++) {
								if ((Static72.aByteArrayArrayArray5[local77 - 1][local127][local25] & 0x2) == 0) {
									break label217;
								}
							}
							local77--;
						}
						label206: while (local79 < 3) {
							for (local127 = local73; local127 <= local75; local127++) {
								if ((Static72.aByteArrayArrayArray5[local79 + 1][local127][local25] & 0x2) == 0) {
									break label206;
								}
							}
							local79++;
						}
						local127 = (local79 + 1 - local77) * (local75 + 1 - local73);
						if (local127 >= 2) {
							local221 = Static338.anIntArrayArrayArray40[local79][local73][local25] - 240;
							local229 = Static338.anIntArrayArrayArray40[local77][local73][local25];
							Static291.method4878(2, local73 * 128, local75 * 128 + 128, local25 * 128, local25 * 128, local221, local229);
							for (local249 = local77; local249 <= local79; local249++) {
								for (local253 = local73; local253 <= local75; local253++) {
									Static72.aByteArrayArrayArray5[local249][local253][local25] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static72.aByteArrayArrayArray5[local21][local59][local25] & 0x4) != 0) {
						local73 = local59;
						local75 = local59;
						for (local77 = local25; local77 > 0 && (Static72.aByteArrayArrayArray5[local21][local59][local77 - 1] & 0x4) != 0; local77--) {
						}
						for (local79 = local25; local79 < Static105.anInt2647 && (Static72.aByteArrayArrayArray5[local21][local59][local79 + 1] & 0x4) != 0; local79++) {
						}
						label270: while (local73 > 0) {
							for (local127 = local77; local127 <= local79; local127++) {
								if ((Static72.aByteArrayArrayArray5[local21][local73 - 1][local127] & 0x4) == 0) {
									break label270;
								}
							}
							local73--;
						}
						label259: while (local75 < Static350.anInt6637) {
							for (local127 = local77; local127 <= local79; local127++) {
								if ((Static72.aByteArrayArrayArray5[local21][local75 + 1][local127] & 0x4) == 0) {
									break label259;
								}
							}
							local75++;
						}
						if ((local79 + 1 - local77) * (local75 + 1 + -local73) >= 4) {
							local127 = Static338.anIntArrayArrayArray40[local21][local73][local77];
							Static291.method4878(4, local73 * 128, local75 * 128 + 128, local77 * 128, local79 * 128 + 128, local127, local127);
							for (@Pc(675) int local675 = local73; local675 <= local75; local675++) {
								for (local221 = local77; local221 <= local79; local221++) {
									Static72.aByteArrayArrayArray5[local21][local675][local221] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!vq;Lclient!bi;II)V")
	public static void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3 local8 = Static266.method4597(arg3.anInt525);
		if (local8.anInt50 == -1) {
			return;
		}
		if (arg3.aBoolean53) {
			@Pc(26) int local26 = arg4 + arg3.anInt521;
			arg4 = local26 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class58 local38 = local8.method45(arg4, arg2, arg3.aBoolean49);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg3.anInt532;
		@Pc(47) int local47 = arg3.anInt529;
		if ((arg4 & 0x1) == 1) {
			local44 = arg3.anInt529;
			local47 = arg3.anInt532;
		}
		@Pc(61) int local61 = local38.method4282();
		@Pc(64) int local64 = local38.method4286();
		if (local8.aBoolean6) {
			local61 = local44 * 4;
			local64 = local47 * 4;
		}
		if (local8.anInt49 == 0) {
			local38.method4278(arg0, arg1 - (local47 - 1) * 4, local61, local64);
		} else {
			local38.method4272(arg0, arg1 - (local47 - 1) * 4, local61, local64, 1, local8.anInt49 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method4867() {
		Static310.method5118(false);
		Static306.anInt5906 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static65.aByteArrayArray4.length; local14++) {
			if (Static247.anIntArray418[local14] != -1 && Static65.aByteArrayArray4[local14] == null) {
				Static65.aByteArrayArray4[local14] = Static287.aClass193_77.method5047(Static247.anIntArray418[local14], 0);
				if (Static65.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static306.anInt5906++;
				}
			}
			if (Static83.anIntArray202[local14] != -1 && Static115.aByteArrayArray13[local14] == null) {
				Static115.aByteArrayArray13[local14] = Static287.aClass193_77.method5035(Static90.anIntArrayArray63[local14], Static83.anIntArray202[local14], 0);
				if (Static115.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static306.anInt5906++;
				}
			}
			if (Static332.anIntArray490[local14] != -1 && Static293.aByteArrayArray16[local14] == null) {
				Static293.aByteArrayArray16[local14] = Static287.aClass193_77.method5047(Static332.anIntArray490[local14], 0);
				if (Static293.aByteArrayArray16[local14] == null) {
					Static306.anInt5906++;
					local12 = false;
				}
			}
			if (Static184.anIntArray327[local14] != -1 && Static224.aByteArrayArray18[local14] == null) {
				Static224.aByteArrayArray18[local14] = Static287.aClass193_77.method5047(Static184.anIntArray327[local14], 0);
				if (Static224.aByteArrayArray18[local14] == null) {
					Static306.anInt5906++;
					local12 = false;
				}
			}
			if (Static189.anIntArray337 != null && Static261.aByteArrayArray20[local14] == null && Static189.anIntArray337[local14] != -1) {
				Static261.aByteArrayArray20[local14] = Static287.aClass193_77.method5035(Static90.anIntArrayArray63[local14], Static189.anIntArray337[local14], 0);
				if (Static261.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static306.anInt5906++;
				}
			}
		}
		if (Static24.aClass137_1 == null) {
			if (Static233.aClass4_Sub4_Sub11_2 == null || !Static72.aClass193_20.method5045(Static233.aClass4_Sub4_Sub11_2.aString49 + "_staticelements")) {
				Static24.aClass137_1 = new Class137(0);
			} else if (Static72.aClass193_20.method5040(Static233.aClass4_Sub4_Sub11_2.aString49 + "_staticelements")) {
				Static24.aClass137_1 = Static44.method881(Static121.aBoolean369, Static233.aClass4_Sub4_Sub11_2.aString49 + "_staticelements", Static72.aClass193_20);
			} else {
				Static306.anInt5906++;
				local12 = false;
			}
		}
		if (!local12) {
			Static295.anInt5715 = 1;
			return;
		}
		local12 = true;
		Static256.anInt5173 = 0;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static65.aByteArrayArray4.length; local250++) {
			@Pc(256) byte[] local256 = Static115.aByteArrayArray13[local250];
			if (local256 != null) {
				local269 = (Static155.anIntArray297[local250] >> 8) * 64 - Static286.anInt6699;
				local279 = (Static155.anIntArray297[local250] & 0xFF) * 64 - Static136.anInt3193;
				if (Static77.aBoolean143) {
					local269 = 10;
					local279 = 10;
				}
				local12 &= Static114.method2393(local269, local256, local279);
			}
			local256 = Static224.aByteArrayArray18[local250];
			if (local256 != null) {
				local269 = (Static155.anIntArray297[local250] >> 8) * 64 - Static286.anInt6699;
				local279 = (Static155.anIntArray297[local250] & 0xFF) * 64 - Static136.anInt3193;
				if (Static77.aBoolean143) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static114.method2393(local269, local256, local279);
			}
		}
		if (!local12) {
			Static295.anInt5715 = 2;
			return;
		}
		if (Static295.anInt5715 != 0) {
			Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835) + "<br>(100%)", Static238.aClass51_6);
		}
		Static319.method5250();
		Static33.method566();
		@Pc(368) boolean local368 = false;
		if (Static274.aClass47_9.method2672() && Static284.aBoolean418) {
			for (local269 = 0; local269 < Static65.aByteArrayArray4.length; local269++) {
				if (Static224.aByteArrayArray18[local269] != null || Static293.aByteArrayArray16[local269] != null) {
					local368 = true;
					break;
				}
			}
		}
		if (Static144.aBoolean265) {
			local269 = Static251.anIntArray419[Static90.anInt2481];
		} else {
			local269 = Static141.anIntArray278[Static90.anInt2481];
		}
		if (Static274.aClass47_9.method2736()) {
			local269++;
		}
		Static158.method3082(Static350.anInt6637, Static105.anInt2647, local269, local368, Static274.aClass47_9.method2745() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static16.aClass170Array1[local279].method4593();
		}
		Static265.method4579();
		Static97.method2231(false);
		Static136.method2905();
		Static319.method5250();
		System.gc();
		Static310.method5118(true);
		Static15.method869(4, false);
		@Pc(462) int[][] local462 = null;
		if (!Static77.aBoolean143) {
			Static196.method5561(false);
			Static10.method200(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] >> 3, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] >> 3);
			Static69.method1643();
			Static179.method3469(false, 4, Static274.aClass47_9, null);
			local462 = Static338.anIntArrayArrayArray40[0];
			Static310.method5118(true);
			Static317.method5235(false);
			if (Static261.aByteArrayArray20 != null) {
				Static152.method3022();
			}
		}
		if (Static77.aBoolean143) {
			Static118.method2491(false);
			Static10.method200(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] >> 3, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] >> 3);
			Static69.method1643();
			Static179.method3469(false, 4, Static274.aClass47_9, null);
			local462 = Static338.anIntArrayArrayArray40[0];
			Static310.method5118(true);
			Static275.method4712(false);
		}
		Static33.method566();
		Static310.method5118(true);
		Static106.method2346(4, Static274.aClass47_9, null, false, Static16.aClass170Array1);
		method4864(4, Static274.aClass47_9);
		Static310.method5118(true);
		@Pc(561) int local561 = Static253.anInt5160;
		if (local561 > Static12.anInt267) {
			local561 = Static12.anInt267;
		}
		if (local561 < Static12.anInt267 - 1) {
			local561 = Static12.anInt267 - 1;
		}
		if (Static76.method1750()) {
			Static119.method2513(0);
		} else {
			Static119.method2513(local561);
		}
		Static196.method5557();
		if (local368) {
			Static58.method1231(true);
			Static15.method869(1, true);
			if (!Static77.aBoolean143) {
				Static196.method5561(true);
				Static179.method3469(true, 1, Static274.aClass47_9, local462);
				Static310.method5118(true);
				Static317.method5235(true);
				method4864(1, Static274.aClass47_9);
			}
			if (Static77.aBoolean143) {
				Static118.method2491(true);
				Static179.method3469(true, 1, Static274.aClass47_9, local462);
				Static310.method5118(true);
				Static275.method4712(true);
			}
			Static33.method566();
			Static310.method5118(true);
			Static106.method2346(1, Static274.aClass47_9, Static304.aClass60Array3[0], true, Static16.aClass170Array1);
			method4864(1, Static274.aClass47_9);
			Static310.method5118(true);
			Static196.method5557();
			Static58.method1231(false);
		}
		@Pc(667) int local667;
		@Pc(671) int local671;
		for (@Pc(663) int local663 = 0; local663 < 4; local663++) {
			for (local667 = 0; local667 < Static350.anInt6637; local667++) {
				for (local671 = 0; local671 < Static105.anInt2647; local671++) {
					Static253.method4460(local663, local667, local671);
				}
			}
		}
		Static98.method2235();
		Static319.method5250();
		Static250.method4424();
		Static33.method566();
		Static255.aBoolean382 = false;
		Static64.method1349();
		if (Static308.aFrame2 != null && Static155.aClass114_3 != null && Static139.anInt3199 == 25) {
			Static15.aClass4_Sub11_Sub1_2.method706(194);
			Static15.aClass4_Sub11_Sub1_2.method3452(1057001181);
		}
		if (!Static77.aBoolean143) {
			local667 = (Static103.anInt2592 - (Static350.anInt6637 >> 4)) / 8;
			local671 = (Static103.anInt2592 + (Static350.anInt6637 >> 4)) / 8;
			@Pc(761) int local761 = (Static36.anInt1007 - (Static105.anInt2647 >> 4)) / 8;
			@Pc(770) int local770 = (Static36.anInt1007 + (Static105.anInt2647 >> 4)) / 8;
			for (@Pc(774) int local774 = local667 - 1; local774 <= local671 + 1; local774++) {
				for (@Pc(780) int local780 = local761 - 1; local780 <= local770 + 1; local780++) {
					if (local774 < local667 || local671 < local774 || local780 < local761 || local770 < local780) {
						Static287.aClass193_77.method5046("m" + local774 + "_" + local780);
						Static287.aClass193_77.method5046("l" + local774 + "_" + local780);
					}
				}
			}
		}
		if (Static139.anInt3199 == 28) {
			Static243.method5095(10);
		} else {
			Static243.method5095(30);
			if (Static155.aClass114_3 != null) {
				Static15.aClass4_Sub11_Sub1_2.method706(215);
			}
		}
		Static226.method4051();
		Static319.method5250();
		Static150.method3016();
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	public static void method4868() {
		Static210.aClass198_157.method5202(5);
	}
}
