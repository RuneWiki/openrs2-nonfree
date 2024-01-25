import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[Lclient!gb;")
	public static Class2_Sub14_Sub1[] aClass2_Sub14_Sub1Array2;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_80 = new Class221("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_57 = new Class77(98, -1);

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "[I")
	public static int[] anIntArray250 = new int[2];

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
	public static final boolean aBoolean166 = false;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public static void method2101() {
		Static370.method5570(false);
		Static297.anInt5974 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static371.aByteArrayArray22.length; local16++) {
			if (Static255.anIntArray231[local16] != -1 && Static371.aByteArrayArray22[local16] == null) {
				Static371.aByteArrayArray22[local16] = Static200.aClass71_48.method1555(Static255.anIntArray231[local16], 0);
				if (Static371.aByteArrayArray22[local16] == null) {
					Static297.anInt5974++;
					local14 = false;
				}
			}
			if (Static345.anIntArray727[local16] != -1 && Static135.aByteArrayArray9[local16] == null) {
				Static135.aByteArrayArray9[local16] = Static200.aClass71_48.method1569(Static345.anIntArray727[local16], 0, Static249.anIntArrayArray33[local16]);
				if (Static135.aByteArrayArray9[local16] == null) {
					local14 = false;
					Static297.anInt5974++;
				}
			}
			if (Static37.anIntArray118[local16] != -1 && Static385.aByteArrayArray24[local16] == null) {
				Static385.aByteArrayArray24[local16] = Static200.aClass71_48.method1555(Static37.anIntArray118[local16], 0);
				if (Static385.aByteArrayArray24[local16] == null) {
					local14 = false;
					Static297.anInt5974++;
				}
			}
			if (Static383.anIntArray805[local16] != -1 && Static272.aByteArrayArray17[local16] == null) {
				Static272.aByteArrayArray17[local16] = Static200.aClass71_48.method1555(Static383.anIntArray805[local16], 0);
				if (Static272.aByteArrayArray17[local16] == null) {
					local14 = false;
					Static297.anInt5974++;
				}
			}
			if (Static304.anIntArray254 != null && Static67.aByteArrayArray7[local16] == null && Static304.anIntArray254[local16] != -1) {
				Static67.aByteArrayArray7[local16] = Static200.aClass71_48.method1569(Static304.anIntArray254[local16], 0, Static249.anIntArrayArray33[local16]);
				if (Static67.aByteArrayArray7[local16] == null) {
					local14 = false;
					Static297.anInt5974++;
				}
			}
		}
		if (Static156.aClass159_3 == null) {
			if (Static133.aClass2_Sub1_Sub17_3 == null || !Static71.aClass71_18.method1582(Static133.aClass2_Sub1_Sub17_3.aString65 + "_staticelements")) {
				Static156.aClass159_3 = new Class159(0);
			} else if (Static71.aClass71_18.method1578(Static133.aClass2_Sub1_Sub17_3.aString65 + "_staticelements")) {
				Static156.aClass159_3 = Static272.method4277(Static71.aClass71_18, Static6.aBoolean4, Static133.aClass2_Sub1_Sub17_3.aString65 + "_staticelements");
			} else {
				Static297.anInt5974++;
				local14 = false;
			}
		}
		if (!local14) {
			Static235.anInt4313 = 1;
			return;
		}
		Static171.anInt3057 = 0;
		local14 = true;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(253) int local253 = 0; local253 < Static371.aByteArrayArray22.length; local253++) {
			@Pc(259) byte[] local259 = Static135.aByteArrayArray9[local253];
			if (local259 != null) {
				local272 = (Static372.anIntArray785[local253] >> 8) * 64 - Static376.anInt6607;
				local283 = (Static372.anIntArray785[local253] & 0xFF) * 64 - Static133.anInt2474;
				if (Static213.aBoolean293) {
					local283 = 10;
					local272 = 10;
				}
				local14 &= Static108.method2085(local272, Static307.anInt5484, Static392.anInt6751, local283, local259);
			}
			local259 = Static272.aByteArrayArray17[local253];
			if (local259 != null) {
				local272 = (Static372.anIntArray785[local253] >> 8) * 64 - Static376.anInt6607;
				local283 = (Static372.anIntArray785[local253] & 0xFF) * 64 - Static133.anInt2474;
				if (Static213.aBoolean293) {
					local283 = 10;
					local272 = 10;
				}
				local14 &= Static108.method2085(local272, Static307.anInt5484, Static392.anInt6751, local283, local259);
			}
		}
		if (!local14) {
			Static235.anInt4313 = 2;
			return;
		}
		if (Static235.anInt4313 != 0) {
			Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185) + "<br>(100%)", true);
		}
		Static209.method3549();
		Static382.method5683();
		@Pc(381) boolean local381 = false;
		if (Static304.aClass82_4.method4475() && Static194.aBoolean254) {
			for (local272 = 0; local272 < Static371.aByteArrayArray22.length; local272++) {
				if (Static272.aByteArrayArray17[local272] != null || Static385.aByteArrayArray24[local272] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static116.aBoolean177) {
			local272 = Static279.anIntArray612[Static74.anInt4013];
		} else {
			local272 = Static278.anIntArray206[Static74.anInt4013];
		}
		if (Static304.aClass82_4.method4498()) {
			local272++;
		}
		Static168.method2729(Static392.anInt6751, Static307.anInt5484, local272, local381, Static304.aClass82_4.method4532() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static190.aClass239Array1[local283].method5561();
		}
		Static372.method5584();
		Static141.method2445(false);
		Static71.method1291();
		Static209.method3549();
		System.gc();
		Static370.method5570(true);
		Static234.method3819();
		Static2.aBoolean280 = Static37.aBoolean52;
		Static283.aBoolean360 = !Static158.aBoolean211;
		Static46.aBoolean85 = Static194.aBoolean254;
		Static123.aBoolean184 = Static314.anInt5576 >= 96;
		Static19.anInt458 = Static193.anInt6663;
		Static234.anInt4284 = Static43.method900() ? -1 : Static303.anInt5442;
		Static369.aBoolean478 = Static123.anInt2363 == 1 || Static265.aBoolean344;
		Static314.aClass134_Sub1_3 = new Class134_Sub1(4, Static392.anInt6751, Static307.anInt5484, false);
		if (!Static213.aBoolean293) {
			Static289.method4418(Static371.aByteArrayArray22, Static314.aClass134_Sub1_3);
		}
		if (Static213.aBoolean293) {
			Static337.method5170(Static314.aClass134_Sub1_3, Static371.aByteArrayArray22);
		}
		Static197.method3303(Static392.anInt6751 >> 4, Static307.anInt5484 >> 4);
		Static94.method4860();
		if (local381) {
			Static78.method1407(true);
			Static142.aClass134_Sub1_2 = new Class134_Sub1(1, Static392.anInt6751, Static307.anInt5484, true);
			if (!Static213.aBoolean293) {
				Static289.method4418(Static385.aByteArrayArray24, Static142.aClass134_Sub1_2);
				Static370.method5570(true);
			}
			if (Static213.aBoolean293) {
				Static337.method5170(Static142.aClass134_Sub1_2, Static385.aByteArrayArray24);
				Static370.method5570(true);
			}
			Static142.aClass134_Sub1_2.method5419(Static314.aClass134_Sub1_3.anIntArrayArrayArray15[0]);
			Static142.aClass134_Sub1_2.method5417(Static304.aClass82_4, null, null);
			Static78.method1407(false);
		}
		Static314.aClass134_Sub1_3.method5417(Static304.aClass82_4, Static190.aClass239Array1, local381 ? Static142.aClass134_Sub1_2.anIntArrayArrayArray15 : null);
		if (!Static213.aBoolean293) {
			Static370.method5570(true);
			Static276.method4297(Static135.aByteArrayArray9, Static314.aClass134_Sub1_3);
			if (Static67.aByteArrayArray7 != null) {
				Static384.method5707();
			}
		}
		if (Static213.aBoolean293) {
			Static370.method5570(true);
			Static333.method5092(Static314.aClass134_Sub1_3, Static135.aByteArrayArray9);
		}
		Static382.method5683();
		Static370.method5570(true);
		Static314.aClass134_Sub1_3.method5427(Static304.aClass82_4, null, local381 ? Static345.aClass33Array3[0] : null);
		Static314.aClass134_Sub1_3.method5439(Static304.aClass82_4);
		Static370.method5570(true);
		if (local381) {
			Static78.method1407(true);
			Static370.method5570(true);
			if (!Static213.aBoolean293) {
				Static276.method4297(Static272.aByteArrayArray17, Static142.aClass134_Sub1_2);
			}
			if (Static213.aBoolean293) {
				Static333.method5092(Static142.aClass134_Sub1_2, Static272.aByteArrayArray17);
			}
			Static382.method5683();
			Static370.method5570(true);
			Static142.aClass134_Sub1_2.method5427(Static304.aClass82_4, Static39.aClass33Array2[0], null);
			Static142.aClass134_Sub1_2.method5439(Static304.aClass82_4);
			Static370.method5570(true);
			Static78.method1407(false);
		}
		Static388.method3687();
		@Pc(701) int local701 = Static314.aClass134_Sub1_3.anInt6300;
		if (Static331.anInt5804 < local701) {
			local701 = Static331.anInt5804;
		}
		if (local701 < Static331.anInt5804 - 1) {
			local701 = Static331.anInt5804 - 1;
		}
		if (Static43.method900()) {
			Static288.method4410(0);
		} else {
			Static288.method4410(local701);
		}
		@Pc(734) int local734;
		@Pc(738) int local738;
		for (@Pc(730) int local730 = 0; local730 < 4; local730++) {
			for (local734 = 0; local734 < Static392.anInt6751; local734++) {
				for (local738 = 0; local738 < Static307.anInt5484; local738++) {
					Static45.method2431(local738, local730, local734);
				}
			}
		}
		Static283.method4365();
		Static209.method3549();
		Static379.method1125();
		Static382.method5683();
		Static145.aBoolean200 = false;
		Static359.method5433();
		if (Static154.aFrame1 != null && Static169.aClass124_3 != null && Static344.anInt6327 == 25) {
			Static19.method552(Static366.aClass41_196);
			Static39.aClass2_Sub13_Sub2_4.method4218(1057001181);
		}
		if (!Static213.aBoolean293) {
			local734 = (Static226.anInt4218 - (Static392.anInt6751 >> 4)) / 8;
			local738 = ((Static392.anInt6751 >> 4) + Static226.anInt4218) / 8;
			@Pc(821) int local821 = (Static306.anInt5451 - (Static307.anInt5484 >> 4)) / 8;
			@Pc(829) int local829 = ((Static307.anInt5484 >> 4) + Static306.anInt5451) / 8;
			for (@Pc(833) int local833 = local734 - 1; local833 <= local738 + 1; local833++) {
				for (@Pc(839) int local839 = local821 - 1; local839 <= local829 + 1; local839++) {
					if (local833 < local734 || local738 < local833 || local839 < local821 || local839 > local829) {
						Static200.aClass71_48.method1574("m" + local833 + "_" + local839);
						Static200.aClass71_48.method1574("l" + local833 + "_" + local839);
					}
				}
			}
		}
		if (Static344.anInt6327 == 28) {
			Static345.method5253(10);
		} else {
			Static345.method5253(30);
			if (Static169.aClass124_3 != null) {
				Static19.method552(Static179.aClass41_94);
			}
		}
		Static147.method2517();
		Static209.method3549();
		Static384.method5704();
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public static void method2102() {
		@Pc(13) Class2_Sub1_Sub2 local13 = Static323.method4982(0, 15);
		local13.method412();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[Lclient!ms;I)V")
	public static void method2103(@OriginalArg(0) int arg0, @OriginalArg(1) Class155[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class155 local15 = arg1[local7];
			if (local15 != null && local15.anInt4144 == arg0 && !Static41.method888(local15)) {
				if (local15.anInt4164 == 0) {
					method2103(local15.anInt4166, arg1);
					if (local15.aClass155Array2 != null) {
						method2103(local15.anInt4166, local15.aClass155Array2);
					}
					@Pc(53) Class2_Sub41 local53 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local15.anInt4166);
					if (local53 != null) {
						Static216.method3641(local53.anInt6411);
					}
				}
				if (local15.anInt4164 == 6 && local15.anInt4178 != -1) {
					@Pc(73) Class189 local73 = Static351.aClass175_3.method4107(local15.anInt4178);
					if (local73 != null) {
						local15.anInt4133 += Static346.anInt6113;
						while (local73.anIntArray640[local15.anInt4203] < local15.anInt4133) {
							local15.anInt4133 -= local73.anIntArray640[local15.anInt4203];
							local15.anInt4203++;
							if (local15.anInt4203 >= local73.anIntArray639.length) {
								local15.anInt4203 -= local73.anInt5151;
								if (local15.anInt4203 < 0 || local73.anIntArray639.length <= local15.anInt4203) {
									local15.anInt4203 = 0;
								}
							}
							local15.anInt4192 = local15.anInt4203 + 1;
							if (local73.anIntArray639.length <= local15.anInt4192) {
								local15.anInt4192 -= local73.anInt5151;
								if (local15.anInt4192 < 0 || local73.anIntArray639.length <= local15.anInt4192) {
									local15.anInt4192 = -1;
								}
							}
							Static295.method4664(local15);
						}
					}
				}
			}
		}
	}
}
