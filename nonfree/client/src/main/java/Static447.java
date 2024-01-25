import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "F")
	public static float aFloat233 = 0.0F;

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
	public static void method6413() {
		Static472.method6646(false);
		Static91.anInt1973 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static420.aByteArrayArray27.length; local14++) {
			if (Static585.anIntArray683[local14] != -1 && Static420.aByteArrayArray27[local14] == null) {
				Static420.aByteArrayArray27[local14] = Static525.aClass259_170.method5985(0, Static585.anIntArray683[local14]);
				if (Static420.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static91.anInt1973++;
				}
			}
			if (Static394.anIntArray331[local14] != -1 && Static300.aByteArrayArray24[local14] == null) {
				Static300.aByteArrayArray24[local14] = Static525.aClass259_170.method5986(0, Static471.anIntArrayArray53[local14], Static394.anIntArray331[local14]);
				if (Static300.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static91.anInt1973++;
				}
			}
			if (Static296.anIntArray380[local14] != -1 && Static533.aByteArrayArray35[local14] == null) {
				Static533.aByteArrayArray35[local14] = Static525.aClass259_170.method5985(0, Static296.anIntArray380[local14]);
				if (Static533.aByteArrayArray35[local14] == null) {
					Static91.anInt1973++;
					local12 = false;
				}
			}
			if (Static263.anIntArray328[local14] != -1 && Static266.aByteArrayArray23[local14] == null) {
				Static266.aByteArrayArray23[local14] = Static525.aClass259_170.method5985(0, Static263.anIntArray328[local14]);
				if (Static266.aByteArrayArray23[local14] == null) {
					Static91.anInt1973++;
					local12 = false;
				}
			}
			if (Static135.anIntArray166 != null && Static529.aByteArrayArray38[local14] == null && Static135.anIntArray166[local14] != -1) {
				Static529.aByteArrayArray38[local14] = Static525.aClass259_170.method5986(0, Static471.anIntArrayArray53[local14], Static135.anIntArray166[local14]);
				if (Static529.aByteArrayArray38[local14] == null) {
					Static91.anInt1973++;
					local12 = false;
				}
			}
		}
		if (Static382.aClass288_3 == null) {
			if (Static342.aClass2_Sub3_Sub3_9 == null || !Static59.aClass259_29.method5993(Static342.aClass2_Sub3_Sub3_9.aString18 + "_staticelements")) {
				Static382.aClass288_3 = new Class288(0);
			} else if (Static59.aClass259_29.method5982(Static342.aClass2_Sub3_Sub3_9.aString18 + "_staticelements")) {
				Static382.aClass288_3 = Static341.method5172(Static59.aClass259_29, Static451.aBoolean23, Static342.aClass2_Sub3_Sub3_9.aString18 + "_staticelements");
			} else {
				local12 = false;
				Static91.anInt1973++;
			}
		}
		if (!local12) {
			Static125.anInt2405 = 1;
			return;
		}
		local12 = true;
		Static414.anInt9338 = 0;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(254) int local254 = 0; local254 < Static420.aByteArrayArray27.length; local254++) {
			@Pc(260) byte[] local260 = Static300.aByteArrayArray24[local254];
			if (local260 != null) {
				local272 = (Static234.anIntArray280[local254] >> 8) * 64 - Static35.anInt906;
				local283 = (Static234.anIntArray280[local254] & 0xFF) * 64 - Static130.anInt5246;
				if (Static565.anInt9249 != 0) {
					local272 = 10;
					local283 = 10;
				}
				local12 &= Static150.method2463(local260, local272, Static188.anInt3850, local283, Static49.anInt1174);
			}
			local260 = Static266.aByteArrayArray23[local254];
			if (local260 != null) {
				local272 = (Static234.anIntArray280[local254] >> 8) * 64 - Static35.anInt906;
				local283 = (Static234.anIntArray280[local254] & 0xFF) * 64 - Static130.anInt5246;
				if (Static565.anInt9249 != 0) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static150.method2463(local260, local272, Static188.anInt3850, local283, Static49.anInt1174);
			}
		}
		if (!local12) {
			Static125.anInt2405 = 2;
			return;
		}
		if (Static125.anInt2405 != 0) {
			Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264) + "<br>(100%)");
		}
		Static352.method5248();
		Static542.method7382();
		@Pc(385) boolean local385 = false;
		if (Static307.aClass100_6.method6187() && Static72.aClass2_Sub12_Sub1_1.aBoolean163) {
			for (local272 = 0; local272 < Static420.aByteArrayArray27.length; local272++) {
				if (Static266.aByteArrayArray23[local272] != null || Static533.aByteArrayArray35[local272] != null) {
					local385 = true;
					break;
				}
			}
		}
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean153) {
			local272 = Static136.anIntArray167[Static463.anInt7968];
		} else {
			local272 = Static555.anIntArray663[Static463.anInt7968];
		}
		if (Static307.aClass100_6.method6219()) {
			local272++;
		}
		Static490.method6860(Static307.aClass100_6, Static164.anInt3483, Static188.anInt3850, Static49.anInt1174, local272, local385, Static307.aClass100_6.method6185() > 0);
		if (Static295.aBoolean658) {
			Static34.method625(Static45.aClass29_3);
		} else {
			Static34.method625(null);
		}
		for (local283 = 0; local283 < 4; local283++) {
			Static495.aClass355Array1[local283].method7806();
		}
		Static589.method7957();
		Static272.method4132(false);
		Static116.method1745();
		Static59.aBoolean103 = false;
		Static459.aClass326_1 = null;
		Static352.method5248();
		System.gc();
		Static472.method6646(true);
		Static571.method7720();
		Static286.anInt5169 = Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846);
		Static422.aBoolean560 = Static72.aClass2_Sub12_Sub1_1.aBoolean163;
		Static22.aBoolean31 = Static440.anInt7756 >= 96;
		Static235.aBoolean353 = Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846);
		Static185.aBoolean708 = !Static72.aClass2_Sub12_Sub1_1.aBoolean159;
		Static393.anInt6889 = Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) ? -1 : Static426.anInt7278;
		Static92.aBoolean174 = Static558.method7614(Static391.anInt6846) || Static72.aClass2_Sub12_Sub1_1.aBoolean164;
		Static403.aBoolean547 = Static72.aClass2_Sub12_Sub1_1.aBoolean150;
		Static162.aClass49_Sub1_2 = new Class49_Sub1(4, Static188.anInt3850, Static49.anInt1174, false);
		if (Static565.anInt9249 == 0) {
			Static58.method947(Static420.aByteArrayArray27, Static162.aClass49_Sub1_2);
		} else {
			Static541.method7378(Static420.aByteArrayArray27, Static162.aClass49_Sub1_2);
		}
		Static45.method782(Static188.anInt3850 >> 4, Static49.anInt1174 >> 4);
		Static582.method7908();
		if (local385) {
			Static225.method3525(true);
			Static138.aClass49_Sub1_1 = new Class49_Sub1(1, Static188.anInt3850, Static49.anInt1174, true);
			if (Static565.anInt9249 == 0) {
				Static58.method947(Static533.aByteArrayArray35, Static138.aClass49_Sub1_1);
				Static472.method6646(true);
			} else {
				Static541.method7378(Static533.aByteArrayArray35, Static138.aClass49_Sub1_1);
				Static472.method6646(true);
			}
			Static138.aClass49_Sub1_1.method2993(Static162.aClass49_Sub1_2.anIntArrayArrayArray17[0]);
			Static138.aClass49_Sub1_1.method2997(null, null, Static307.aClass100_6);
			Static225.method3525(false);
		}
		Static162.aClass49_Sub1_2.method2997(local385 ? Static138.aClass49_Sub1_1.anIntArrayArrayArray17 : null, Static495.aClass355Array1, Static307.aClass100_6);
		if (Static565.anInt9249 == 0) {
			Static472.method6646(true);
			Static429.method6119(Static300.aByteArrayArray24, Static162.aClass49_Sub1_2);
			if (Static529.aByteArrayArray38 != null) {
				Static271.method4109();
			}
		} else {
			Static472.method6646(true);
			Static301.method4543(Static162.aClass49_Sub1_2, Static300.aByteArrayArray24);
		}
		Static542.method7382();
		if (Static440.anInt7756 < 96) {
			Static192.method3653();
		}
		Static472.method6646(true);
		Static162.aClass49_Sub1_2.method3004(local385 ? Static592.aClass67Array4[0] : null, null, Static307.aClass100_6);
		Static162.aClass49_Sub1_2.method3008(false, Static307.aClass100_6);
		Static472.method6646(true);
		if (local385) {
			Static225.method3525(true);
			Static472.method6646(true);
			if (Static565.anInt9249 == 0) {
				Static429.method6119(Static266.aByteArrayArray23, Static138.aClass49_Sub1_1);
			} else {
				Static301.method4543(Static138.aClass49_Sub1_1, Static266.aByteArrayArray23);
			}
			Static542.method7382();
			Static472.method6646(true);
			Static138.aClass49_Sub1_1.method3004(null, Static569.aClass67Array8[0], Static307.aClass100_6);
			Static138.aClass49_Sub1_1.method3008(true, Static307.aClass100_6);
			Static472.method6646(true);
			Static225.method3525(false);
		}
		Static157.method2572();
		@Pc(759) int local759 = Static162.aClass49_Sub1_2.anInt3648;
		if (Static566.anInt9278 < local759) {
			local759 = Static566.anInt9278;
		}
		if (local759 < Static566.anInt9278 - 1) {
			local759 = Static566.anInt9278 - 1;
		}
		if (Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846)) {
			Static134.method2297(0);
		} else {
			Static134.method2297(local759);
		}
		@Pc(798) int local798;
		@Pc(802) int local802;
		for (@Pc(794) int local794 = 0; local794 < 4; local794++) {
			for (local798 = 0; local798 < Static188.anInt3850; local798++) {
				for (local802 = 0; local802 < Static49.anInt1174; local802++) {
					Static46.method793(local802, local794, local798);
				}
			}
		}
		Static282.method4207();
		Static352.method5248();
		Static514.method236();
		Static542.method7382();
		Static217.method3482();
		@Pc(861) Class2_Sub42 local861;
		if (Static593.aFrame2 != null && Static57.aClass116_1 != null && Static201.anInt3963 == 11) {
			local861 = Static249.method3910(Static203.aClass286_65, Static400.aClass145_2);
			local861.aClass2_Sub15_Sub2_2.method4288(1057001181);
			Static531.method7296(local861);
		}
		if (Static565.anInt9249 == 0) {
			local798 = (Static584.anInt9529 - (Static188.anInt3850 >> 4)) / 8;
			local802 = (Static584.anInt9529 + (Static188.anInt3850 >> 4)) / 8;
			@Pc(900) int local900 = (Static274.anInt4959 - (Static49.anInt1174 >> 4)) / 8;
			@Pc(908) int local908 = ((Static49.anInt1174 >> 4) + Static274.anInt4959) / 8;
			for (@Pc(912) int local912 = local798 - 1; local912 <= local802 + 1; local912++) {
				for (@Pc(918) int local918 = local900 - 1; local918 <= local908 + 1; local918++) {
					if (local912 < local798 || local802 < local912 || local900 > local918 || local908 < local918) {
						Static525.aClass259_170.method5967("m" + local912 + "_" + local918);
						Static525.aClass259_170.method5967("l" + local912 + "_" + local918);
					}
				}
			}
		}
		if (Static201.anInt3963 == 4) {
			Static121.method1780(3);
		} else if (Static201.anInt3963 == 8) {
			Static121.method1780(7);
		} else {
			Static121.method1780(10);
			if (Static57.aClass116_1 != null) {
				local861 = Static249.method3910(Static15.aClass286_6, Static400.aClass145_2);
				Static531.method7296(local861);
			}
		}
		Static318.method4929();
		Static352.method5248();
		Static505.method7024();
		if (Static99.aBoolean182) {
			Static212.method3438("Took: " + (Static548.method7437() - Static155.aLong172) + "ms");
			Static99.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
	public static void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub3_Sub13 local12 = Static382.method5650(4, arg2);
		local12.method6098();
		local12.anInt7261 = arg3;
		local12.anInt7258 = arg0;
		local12.anInt7256 = arg1;
	}
}
