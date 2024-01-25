import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_29 = new Class77(64);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_46 = new Class142("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method2815() {
		Static176.method2567(false);
		Static374.anInt6022 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static172.aByteArrayArray56.length; local14++) {
			if (Static292.anIntArray369[local14] != -1 && Static172.aByteArrayArray56[local14] == null) {
				Static172.aByteArrayArray56[local14] = Static210.aClass185_119.method4002(Static292.anIntArray369[local14], 0);
				if (Static172.aByteArrayArray56[local14] == null) {
					local12 = false;
					Static374.anInt6022++;
				}
			}
			if (Static26.anIntArray60[local14] != -1 && Static161.aByteArrayArray51[local14] == null) {
				Static161.aByteArrayArray51[local14] = Static210.aClass185_119.method3999(Static438.anIntArrayArray52[local14], 0, Static26.anIntArray60[local14]);
				if (Static161.aByteArrayArray51[local14] == null) {
					local12 = false;
					Static374.anInt6022++;
				}
			}
			if (Static275.anIntArray353[local14] != -1 && Static457.aByteArrayArray148[local14] == null) {
				Static457.aByteArrayArray148[local14] = Static210.aClass185_119.method4002(Static275.anIntArray353[local14], 0);
				if (Static457.aByteArrayArray148[local14] == null) {
					Static374.anInt6022++;
					local12 = false;
				}
			}
			if (Static10.anIntArray385[local14] != -1 && Static401.aByteArrayArray128[local14] == null) {
				Static401.aByteArrayArray128[local14] = Static210.aClass185_119.method4002(Static10.anIntArray385[local14], 0);
				if (Static401.aByteArrayArray128[local14] == null) {
					Static374.anInt6022++;
					local12 = false;
				}
			}
			if (Static114.anIntArray155 != null && Static106.aByteArrayArray152[local14] == null && Static114.anIntArray155[local14] != -1) {
				Static106.aByteArrayArray152[local14] = Static210.aClass185_119.method3999(Static438.anIntArrayArray52[local14], 0, Static114.anIntArray155[local14]);
				if (Static106.aByteArrayArray152[local14] == null) {
					local12 = false;
					Static374.anInt6022++;
				}
			}
		}
		if (Static376.aClass144_3 == null) {
			if (Static279.aClass1_Sub3_Sub16_3 == null || !Static465.aClass185_117.method4015(Static279.aClass1_Sub3_Sub16_3.aString63 + "_staticelements")) {
				Static376.aClass144_3 = new Class144(0);
			} else if (Static465.aClass185_117.method4019(Static279.aClass1_Sub3_Sub16_3.aString63 + "_staticelements")) {
				Static376.aClass144_3 = Static134.method1700(Static422.aBoolean591, Static279.aClass1_Sub3_Sub16_3.aString63 + "_staticelements", Static465.aClass185_117);
			} else {
				Static374.anInt6022++;
				local12 = false;
			}
		}
		if (!local12) {
			Static95.anInt6483 = 1;
			return;
		}
		local12 = true;
		Static448.anInt7120 = 0;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(246) int local246 = 0; local246 < Static172.aByteArrayArray56.length; local246++) {
			@Pc(252) byte[] local252 = Static161.aByteArrayArray51[local246];
			if (local252 != null) {
				local265 = (Static334.anIntArray397[local246] >> 8) * 64 - Static315.anInt5207;
				local276 = (Static334.anIntArray397[local246] & 0xFF) * 64 - Static47.anInt676;
				if (Static70.anInt4903 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static105.method1305(local265, local252, Static147.anInt2300, Static293.anInt4886, local276);
			}
			local252 = Static401.aByteArrayArray128[local246];
			if (local252 != null) {
				local265 = (Static334.anIntArray397[local246] >> 8) * 64 - Static315.anInt5207;
				local276 = (Static334.anIntArray397[local246] & 0xFF) * 64 - Static47.anInt676;
				if (Static70.anInt4903 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static105.method1305(local265, local252, Static147.anInt2300, Static293.anInt4886, local276);
			}
		}
		if (!local12) {
			Static95.anInt6483 = 2;
			return;
		}
		if (Static95.anInt6483 != 0) {
			Static63.method859(true, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981) + "<br>(100%)");
		}
		Static459.method5910();
		Static167.method2199();
		@Pc(378) boolean local378 = false;
		if (Static186.aClass117_3.method5725() && Static126.aClass19_Sub1_1.aBoolean379) {
			for (local265 = 0; local265 < Static172.aByteArrayArray56.length; local265++) {
				if (Static401.aByteArrayArray128[local265] != null || Static457.aByteArrayArray148[local265] != null) {
					local378 = true;
					break;
				}
			}
		}
		if (Static126.aClass19_Sub1_1.aBoolean383) {
			local265 = Static366.anIntArray448[Static31.anInt456];
		} else {
			local265 = Static102.anIntArray137[Static31.anInt456];
		}
		if (Static186.aClass117_3.method5706()) {
			local265++;
		}
		Static299.method3985(Static147.anInt2300, Static293.anInt4886, local265, local378, Static186.aClass117_3.method5710() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static385.aClass158Array1[local276].method3624();
		}
		Static363.method4769();
		Static461.method5949(false);
		Static328.method4316();
		Static203.aClass197_1 = null;
		Static459.method5910();
		System.gc();
		Static176.method2567(true);
		Static377.method4867();
		Static438.anInt6910 = Static126.aClass19_Sub1_1.method3337(Static214.anInt3968);
		Static386.aBoolean623 = Static45.anInt669 >= 96;
		Static150.aBoolean424 = Static126.aClass19_Sub1_1.aBoolean379;
		Static373.aBoolean647 = Static126.aClass19_Sub1_1.method3339(Static214.anInt3968);
		Static141.aBoolean538 = !Static126.aClass19_Sub1_1.aBoolean392;
		Static174.anInt2866 = Static126.aClass19_Sub1_1.method3353(Static214.anInt3968) ? -1 : Static130.anInt2040;
		Static151.aBoolean244 = Static126.aClass19_Sub1_1.aBoolean376;
		Static215.aBoolean91 = Static214.anInt3968 == 1 || Static126.aClass19_Sub1_1.aBoolean384;
		Static306.aClass104_Sub1_1 = new Class104_Sub1(4, Static147.anInt2300, Static293.anInt4886, false);
		if (Static70.anInt4903 == 0) {
			Static367.method4801(Static172.aByteArrayArray56, Static306.aClass104_Sub1_1);
		} else {
			Static230.method3293(Static306.aClass104_Sub1_1, Static172.aByteArrayArray56);
		}
		Static149.method1881(Static293.anInt4886 >> 4, Static147.anInt2300 >> 4);
		Static436.method5492();
		if (local378) {
			Static56.method806(true);
			Static416.aClass104_Sub1_2 = new Class104_Sub1(1, Static147.anInt2300, Static293.anInt4886, true);
			if (Static70.anInt4903 == 0) {
				Static367.method4801(Static457.aByteArrayArray148, Static416.aClass104_Sub1_2);
				Static176.method2567(true);
			} else {
				Static230.method3293(Static416.aClass104_Sub1_2, Static457.aByteArrayArray148);
				Static176.method2567(true);
			}
			Static416.aClass104_Sub1_2.method3712(Static306.aClass104_Sub1_1.anIntArrayArrayArray5[0]);
			Static416.aClass104_Sub1_2.method3720(Static186.aClass117_3, null, null);
			Static56.method806(false);
		}
		Static306.aClass104_Sub1_1.method3720(Static186.aClass117_3, Static385.aClass158Array1, local378 ? Static416.aClass104_Sub1_2.anIntArrayArrayArray5 : null);
		if (Static70.anInt4903 == 0) {
			Static176.method2567(true);
			Static351.method4578(Static161.aByteArrayArray51, Static306.aClass104_Sub1_1);
			if (Static106.aByteArrayArray152 != null) {
				Static349.method4560();
			}
		} else {
			Static176.method2567(true);
			Static147.method1858(Static306.aClass104_Sub1_1, Static161.aByteArrayArray51);
		}
		Static167.method2199();
		Static176.method2567(true);
		Static306.aClass104_Sub1_1.method3724(Static186.aClass117_3, null, local378 ? Static397.aClass139Array2[0] : null);
		Static306.aClass104_Sub1_1.method3732(Static186.aClass117_3);
		Static176.method2567(true);
		if (local378) {
			Static56.method806(true);
			Static176.method2567(true);
			if (Static70.anInt4903 == 0) {
				Static351.method4578(Static401.aByteArrayArray128, Static416.aClass104_Sub1_2);
			} else {
				Static147.method1858(Static416.aClass104_Sub1_2, Static401.aByteArrayArray128);
			}
			Static167.method2199();
			Static176.method2567(true);
			Static416.aClass104_Sub1_2.method3724(Static186.aClass117_3, Static157.aClass139Array1[0], null);
			Static416.aClass104_Sub1_2.method3732(Static186.aClass117_3);
			Static176.method2567(true);
			Static56.method806(false);
		}
		Static66.method878();
		@Pc(716) int local716 = Static306.aClass104_Sub1_1.anInt4721;
		if (local716 > Static390.anInt6272) {
			local716 = Static390.anInt6272;
		}
		if (local716 < Static390.anInt6272 - 1) {
			local716 = Static390.anInt6272 - 1;
		}
		if (Static126.aClass19_Sub1_1.method3353(Static214.anInt3968)) {
			Static106.method5955(0);
		} else {
			Static106.method5955(local716);
		}
		@Pc(753) int local753;
		@Pc(757) int local757;
		for (@Pc(749) int local749 = 0; local749 < 4; local749++) {
			for (local753 = 0; local753 < Static147.anInt2300; local753++) {
				for (local757 = 0; local757 < Static293.anInt4886; local757++) {
					Static370.method4827(local753, local749, local757);
				}
			}
		}
		Static355.method4638();
		Static459.method5910();
		Static248.method3525();
		Static167.method2199();
		Static346.aBoolean505 = false;
		Static454.method5850();
		if (Static138.aFrame2 != null && Static337.aClass110_2 != null && Static135.anInt2114 == 10) {
			Static178.method2589(Static330.aClass242_87);
			Static426.aClass1_Sub19_Sub2_2.method2912(1057001181);
		}
		if (Static70.anInt4903 == 0) {
			local753 = (Static122.anInt1849 - (Static147.anInt2300 >> 4)) / 8;
			local757 = ((Static147.anInt2300 >> 4) + Static122.anInt1849) / 8;
			@Pc(840) int local840 = (Static1.anInt19 - (Static293.anInt4886 >> 4)) / 8;
			@Pc(849) int local849 = (Static1.anInt19 + (Static293.anInt4886 >> 4)) / 8;
			for (@Pc(853) int local853 = local753 - 1; local853 <= local757 + 1; local853++) {
				for (@Pc(859) int local859 = local840 - 1; local859 <= local849 + 1; local859++) {
					if (local753 > local853 || local757 < local853 || local840 > local859 || local849 < local859) {
						Static210.aClass185_119.method4009("m" + local853 + "_" + local859);
						Static210.aClass185_119.method4009("l" + local853 + "_" + local859);
					}
				}
			}
		}
		if (Static135.anInt2114 == 3) {
			Static154.method1923(2);
		} else if (Static135.anInt2114 == 7) {
			Static154.method1923(6);
		} else {
			Static154.method1923(9);
			if (Static337.aClass110_2 != null) {
				Static178.method2589(Static436.aClass242_116);
			}
		}
		Static195.method2810();
		Static459.method5910();
		Static105.method1301();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
	public static boolean method2817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
