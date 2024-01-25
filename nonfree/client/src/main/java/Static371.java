import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!nfa", name = "E", descriptor = "I")
	public static int anInt6827 = 0;

	@OriginalMember(owner = "client!nfa", name = "I", descriptor = "[I")
	public static final int[] anIntArray418 = new int[2];

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V")
	public static void method5859() {
		Static643.method8975(false);
		Static482.anInt8364 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static510.aByteArrayArray140.length; local14++) {
			if (Static29.anIntArray36[local14] != -1 && Static510.aByteArrayArray140[local14] == null) {
				Static510.aByteArrayArray140[local14] = Static503.aClass353_102.method8404(Static29.anIntArray36[local14], 0);
				if (Static510.aByteArrayArray140[local14] == null) {
					Static482.anInt8364++;
					local12 = false;
				}
			}
			if (Static69.anIntArray100[local14] != -1 && Static117.aByteArrayArray43[local14] == null) {
				Static117.aByteArrayArray43[local14] = Static503.aClass353_102.method8411(0, Static69.anIntArray100[local14], Static495.anIntArrayArray43[local14]);
				if (Static117.aByteArrayArray43[local14] == null) {
					local12 = false;
					Static482.anInt8364++;
				}
			}
			if (Static173.anIntArray217[local14] != -1 && Static85.aByteArrayArray31[local14] == null) {
				Static85.aByteArrayArray31[local14] = Static503.aClass353_102.method8404(Static173.anIntArray217[local14], 0);
				if (Static85.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static482.anInt8364++;
				}
			}
			if (Static330.anIntArray372[local14] != -1 && Static91.aByteArrayArray23[local14] == null) {
				Static91.aByteArrayArray23[local14] = Static503.aClass353_102.method8404(Static330.anIntArray372[local14], 0);
				if (Static91.aByteArrayArray23[local14] == null) {
					local12 = false;
					Static482.anInt8364++;
				}
			}
			if (Static82.anIntArray114 != null && Static327.aByteArrayArray102[local14] == null && Static82.anIntArray114[local14] != -1) {
				Static327.aByteArrayArray102[local14] = Static503.aClass353_102.method8411(0, Static82.anIntArray114[local14], Static495.anIntArrayArray43[local14]);
				if (Static327.aByteArrayArray102[local14] == null) {
					local12 = false;
					Static482.anInt8364++;
				}
			}
		}
		if (Static273.aClass356_1 == null) {
			if (Static442.aClass6_Sub2_Sub11_3 == null || !Static446.aClass353_82.method8414(Static442.aClass6_Sub2_Sub11_3.aString57 + "_staticelements")) {
				Static273.aClass356_1 = new Class356(0);
			} else if (Static446.aClass353_82.method8397(Static442.aClass6_Sub2_Sub11_3.aString57 + "_staticelements")) {
				Static273.aClass356_1 = Static386.method4906(Static265.aBoolean260, Static446.aClass353_82, Static442.aClass6_Sub2_Sub11_3.aString57 + "_staticelements");
			} else {
				Static482.anInt8364++;
				local12 = false;
			}
		}
		if (!local12) {
			Static600.anInt10019 = 1;
			return;
		}
		local12 = true;
		Static57.anInt1236 = 0;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(252) int local252 = 0; local252 < Static510.aByteArrayArray140.length; local252++) {
			@Pc(258) byte[] local258 = Static117.aByteArrayArray43[local252];
			if (local258 != null) {
				local271 = (Static480.anIntArray523[local252] >> 8) * 64 - Static606.anInt8651;
				local282 = (Static480.anIntArray523[local252] & 0xFF) * 64 - Static195.anInt3961;
				if (Static152.anInt5122 != 0) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static274.method6868(Static442.anInt7975, local271, local282, Static284.anInt7916, local258);
			}
			local258 = Static91.aByteArrayArray23[local252];
			if (local258 != null) {
				local271 = (Static480.anIntArray523[local252] >> 8) * 64 - Static606.anInt8651;
				local282 = (Static480.anIntArray523[local252] & 0xFF) * 64 - Static195.anInt3961;
				if (Static152.anInt5122 != 0) {
					local282 = 10;
					local271 = 10;
				}
				local12 &= Static274.method6868(Static442.anInt7975, local271, local282, Static284.anInt7916, local258);
			}
		}
		if (!local12) {
			Static600.anInt10019 = 2;
			return;
		}
		if (Static600.anInt10019 != 0) {
			Static67.method1169(true, Static317.aClass192_12.method5299(Static307.anInt5931) + "<br>(100%)", Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
		}
		Static54.method911();
		Static223.method3776();
		Static480.method7199();
		@Pc(391) boolean local391 = false;
		if (Static162.aClass100_7.method8816() && Static348.aClass6_Sub22_19.aClass15_Sub6_1.method1414() == 2) {
			for (local271 = 0; local271 < Static510.aByteArrayArray140.length; local271++) {
				if (Static91.aByteArrayArray23[local271] != null || Static85.aByteArrayArray31[local271] != null) {
					local391 = true;
					break;
				}
			}
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub23_1.method8214() == 1) {
			local271 = Static518.anIntArray556[Static43.anInt862];
		} else {
			local271 = Static547.anIntArray573[Static43.anInt862];
		}
		if (Static162.aClass100_7.method8809()) {
			local271++;
		}
		Static442.method6838(Static162.aClass100_7, Static393.anInt7352, Static442.anInt7975, Static284.anInt7916, local271, local391, Static162.aClass100_7.method8780() > 0);
		Static525.method7806(Static249.anInt4972);
		if (Static249.anInt4972 == 0) {
			Static225.method3784((Class50) null);
		} else {
			Static225.method3784(Static631.aClass50_12);
		}
		for (local282 = 0; local282 < 4; local282++) {
			Static619.aClass319Array1[local282].method7929();
		}
		Static454.method6998();
		Static120.method1982(false);
		Static150.method2372();
		Static91.aBoolean90 = false;
		Static382.aClass264_1 = null;
		Static54.method911();
		System.gc();
		Static643.method8975(true);
		Static326.method5410();
		anInt6827 = Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642();
		Static435.aBoolean526 = Static396.anInt7427 >= 96;
		Static370.aBoolean452 = Static348.aClass6_Sub22_19.aClass15_Sub6_1.method1414() == 2;
		Static490.aBoolean577 = Static348.aClass6_Sub22_19.aClass15_Sub1_1.method331() == 1;
		Static72.anInt1515 = Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 1 ? -1 : Static110.anInt2165;
		Static172.aBoolean256 = Static348.aClass6_Sub22_19.aClass15_Sub14_1.method4651() == 1;
		Static576.aBoolean331 = Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8659() == 1;
		Static3.aClass96_Sub1_1 = new Class96_Sub1(4, Static442.anInt7975, Static284.anInt7916, false);
		if (Static152.anInt5122 == 0) {
			Static207.method3582(Static510.aByteArrayArray140, Static3.aClass96_Sub1_1);
		} else {
			Static49.method859(Static510.aByteArrayArray140, Static3.aClass96_Sub1_1);
		}
		Static170.method3131(Static442.anInt7975 >> 4, Static284.anInt7916 >> 4);
		Static347.method5616();
		if (local391) {
			Static134.method2182(true);
			Static326.aClass96_Sub1_2 = new Class96_Sub1(1, Static442.anInt7975, Static284.anInt7916, true);
			if (Static152.anInt5122 == 0) {
				Static207.method3582(Static85.aByteArrayArray31, Static326.aClass96_Sub1_2);
				Static643.method8975(true);
			} else {
				Static49.method859(Static85.aByteArrayArray31, Static326.aClass96_Sub1_2);
				Static643.method8975(true);
			}
			Static326.aClass96_Sub1_2.method4560(Static3.aClass96_Sub1_1.anIntArrayArrayArray3[0]);
			Static326.aClass96_Sub1_2.method4571((int[][][]) null, (Class319[]) null, Static162.aClass100_7);
			Static134.method2182(false);
		}
		Static3.aClass96_Sub1_1.method4571(local391 ? Static326.aClass96_Sub1_2.anIntArrayArrayArray3 : null, Static619.aClass319Array1, Static162.aClass100_7);
		if (Static152.anInt5122 == 0) {
			Static643.method8975(true);
			Static185.method3356(Static117.aByteArrayArray43, Static3.aClass96_Sub1_1);
			if (Static327.aByteArrayArray102 != null) {
				Static315.method5290();
			}
		} else {
			Static643.method8975(true);
			Static249.method4331(Static117.aByteArrayArray43, Static3.aClass96_Sub1_1);
		}
		Static223.method3776();
		if (Static396.anInt7427 < 96) {
			Static298.method5520();
		}
		Static643.method8975(true);
		Static3.aClass96_Sub1_1.method4566((Class199) null, Static162.aClass100_7, local391 ? Static510.aClass199Array3[0] : null);
		Static3.aClass96_Sub1_1.method4580(Static162.aClass100_7, false);
		Static643.method8975(true);
		if (local391) {
			Static134.method2182(true);
			Static643.method8975(true);
			if (Static152.anInt5122 == 0) {
				Static185.method3356(Static91.aByteArrayArray23, Static326.aClass96_Sub1_2);
			} else {
				Static249.method4331(Static91.aByteArrayArray23, Static326.aClass96_Sub1_2);
			}
			Static223.method3776();
			Static643.method8975(true);
			Static326.aClass96_Sub1_2.method4566(Static228.aClass199Array2[0], Static162.aClass100_7, (Class199) null);
			Static326.aClass96_Sub1_2.method4580(Static162.aClass100_7, true);
			Static643.method8975(true);
			Static134.method2182(false);
		}
		Static367.method5807();
		@Pc(779) int local779 = Static3.aClass96_Sub1_1.anInt5139;
		if (local779 > Static175.anInt3636) {
			local779 = Static175.anInt3636;
		}
		if (local779 < Static175.anInt3636 - 1) {
			local779 = Static175.anInt3636 - 1;
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0) {
			Static168.method3103(local779);
		} else {
			Static168.method3103(0);
		}
		@Pc(823) int local823;
		@Pc(827) int local827;
		for (@Pc(819) int local819 = 0; local819 < 4; local819++) {
			for (local823 = 0; local823 < Static442.anInt7975; local823++) {
				for (local827 = 0; local827 < Static284.anInt7916; local827++) {
					Static596.method8371(local819, local823, local827);
				}
			}
		}
		Static485.method7236();
		Static54.method911();
		Static591.method8328();
		Static223.method3776();
		Static54.method903();
		@Pc(874) Class6_Sub9 local874;
		if (Static70.aFrame3 != null && Static97.aClass29_1 != null && Static554.anInt1821 == 11) {
			local874 = Static560.method8089(Static391.aClass126_1, Static571.aClass208_90);
			local874.aClass6_Sub40_Sub2_1.method8554(1057001181);
			Static263.method4681(local874);
		}
		if (Static152.anInt5122 == 0) {
			local823 = (Static500.anInt8419 - (Static442.anInt7975 >> 4)) / 8;
			local827 = ((Static442.anInt7975 >> 4) + Static500.anInt8419) / 8;
			@Pc(912) int local912 = (Static436.anInt7900 - (Static284.anInt7916 >> 4)) / 8;
			@Pc(920) int local920 = ((Static284.anInt7916 >> 4) + Static436.anInt7900) / 8;
			for (@Pc(924) int local924 = local823 - 1; local924 <= local827 + 1; local924++) {
				for (@Pc(930) int local930 = local912 - 1; local930 <= local920 + 1; local930++) {
					if (local823 > local924 || local924 > local827 || local912 > local930 || local920 < local930) {
						Static503.aClass353_102.method8402("m" + local924 + "_" + local930);
						Static503.aClass353_102.method8402("l" + local924 + "_" + local930);
					}
				}
			}
		}
		if (Static554.anInt1821 == 4) {
			Static190.method3390(3);
		} else if (Static554.anInt1821 == 8) {
			Static190.method3390(7);
		} else {
			Static190.method3390(10);
			if (Static97.aClass29_1 != null) {
				local874 = Static560.method8089(Static391.aClass126_1, Static621.aClass208_97);
				Static263.method4681(local874);
			}
		}
		Static559.method8055();
		Static54.method911();
		Static360.method5725();
		Static133.aBoolean183 = true;
		if (Static288.aBoolean384) {
			Static97.method1576("Took: " + (Static32.method595() - Static412.aLong125) + "ms");
			Static288.aBoolean384 = false;
		}
	}
}
