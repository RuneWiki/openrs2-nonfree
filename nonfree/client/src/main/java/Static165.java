import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "[B")
	public static byte[] aByteArray43;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!ta;")
	public static Class58_Sub2 aClass58_Sub2_2 = null;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!ve;")
	public static Class175 aClass175_1 = new Class175();

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lclient!wl;")
	public static Class4_Sub2_Sub23[] aClass4_Sub2_Sub23Array3 = new Class4_Sub2_Sub23[14];

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString117 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt3317 = -1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method2630() {
		Static20.method2327(false);
		Static97.anInt4591 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static3.aByteArrayArray1.length; local14++) {
			if (Static204.anIntArray336[local14] != -1 && Static3.aByteArrayArray1[local14] == null) {
				Static3.aByteArrayArray1[local14] = Static296.aClass22_105.method665(Static204.anIntArray336[local14], 0);
				if (Static3.aByteArrayArray1[local14] == null) {
					Static97.anInt4591++;
					local12 = false;
				}
			}
			if (Static12.anIntArray8[local14] != -1 && Static121.aByteArrayArray9[local14] == null) {
				Static121.aByteArrayArray9[local14] = Static296.aClass22_105.method675(Static12.anIntArray8[local14], 0, Static55.anIntArrayArray13[local14]);
				if (Static121.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static97.anInt4591++;
				}
			}
			if (Static251.aBoolean330) {
				if (Static37.anIntArray203[local14] != -1 && Static13.aByteArrayArray2[local14] == null) {
					Static13.aByteArrayArray2[local14] = Static296.aClass22_105.method665(Static37.anIntArray203[local14], 0);
					if (Static13.aByteArrayArray2[local14] == null) {
						local12 = false;
						Static97.anInt4591++;
					}
				}
				if (Static256.anIntArray393[local14] != -1 && Static218.aByteArrayArray11[local14] == null) {
					Static218.aByteArrayArray11[local14] = Static296.aClass22_105.method665(Static256.anIntArray393[local14], 0);
					if (Static218.aByteArrayArray11[local14] == null) {
						local12 = false;
						Static97.anInt4591++;
					}
				}
			}
			if (Static212.anIntArray346 != null && Static307.aByteArrayArray17[local14] == null && Static212.anIntArray346[local14] != -1) {
				Static307.aByteArrayArray17[local14] = Static296.aClass22_105.method675(Static212.anIntArray346[local14], 0, Static55.anIntArrayArray13[local14]);
				if (Static307.aByteArrayArray17[local14] == null) {
					local12 = false;
					Static97.anInt4591++;
				}
			}
		}
		if (Static68.aClass100_2 == null) {
			if (Static240.aClass4_Sub2_Sub18_3 == null || !Static52.aClass22_25.method670(Static240.aClass4_Sub2_Sub18_3.aString150 + "_labels")) {
				Static68.aClass100_2 = new Class100(0);
			} else if (Static52.aClass22_25.method684(Static240.aClass4_Sub2_Sub18_3.aString150 + "_labels")) {
				Static68.aClass100_2 = Static138.method2222(Static52.aClass22_25, Static240.aClass4_Sub2_Sub18_3.aString150 + "_labels");
			} else {
				local12 = false;
				Static97.anInt4591++;
			}
		}
		if (!local12) {
			Static160.anInt3279 = 1;
			return;
		}
		local12 = true;
		Static276.anInt5449 = 0;
		@Pc(281) int local281;
		@Pc(292) int local292;
		for (local14 = 0; local14 < Static3.aByteArrayArray1.length; local14++) {
			@Pc(268) byte[] local268 = Static121.aByteArrayArray9[local14];
			if (local268 != null) {
				local281 = (Static162.anIntArray272[local14] >> 8) * 64 - Static269.anInt5357;
				local292 = (Static162.anIntArray272[local14] & 0xFF) * 64 - Static105.anInt2105;
				if (Static255.aBoolean339) {
					local292 = 10;
					local281 = 10;
				}
				local12 &= Static280.method4360(local292, local268, local281);
			}
			if (Static251.aBoolean330) {
				local268 = Static218.aByteArrayArray11[local14];
				if (local268 != null) {
					local281 = (Static162.anIntArray272[local14] >> 8) * 64 - Static269.anInt5357;
					local292 = (Static162.anIntArray272[local14] & 0xFF) * 64 - Static105.anInt2105;
					if (Static255.aBoolean339) {
						local281 = 10;
						local292 = 10;
					}
					local12 &= Static280.method4360(local292, local268, local281);
				}
			}
		}
		if (!local12) {
			Static160.anInt3279 = 2;
			return;
		}
		if (Static160.anInt3279 != 0) {
			Static250.method3846(Static174.aString124 + "<br>(100%)", true);
		}
		Static65.method4575();
		Static160.method2578();
		@Pc(386) boolean local386 = false;
		@Pc(393) int local393;
		if (Static251.aBoolean330 && Static304.aBoolean404) {
			for (local393 = 0; local393 < Static3.aByteArrayArray1.length; local393++) {
				if (Static218.aByteArrayArray11[local393] != null || Static13.aByteArrayArray2[local393] != null) {
					local386 = true;
					break;
				}
			}
		}
		Static213.method3346(Static251.aBoolean330 ? 28 : 25, local386);
		for (local393 = 0; local393 < 4; local393++) {
			Static223.aClass12Array1[local393].method270();
		}
		for (local393 = 0; local393 < 4; local393++) {
			for (local281 = 0; local281 < 104; local281++) {
				for (local292 = 0; local292 < 104; local292++) {
					Static27.aByteArrayArrayArray2[local393][local281][local292] = 0;
				}
			}
		}
		Static243.method3737(false);
		if (Static251.aBoolean330) {
			Static249.aClass58_Sub2_4.method3977();
			for (local393 = 0; local393 < 13; local393++) {
				for (local281 = 0; local281 < 13; local281++) {
					Static249.aClass156ArrayArray1[local393][local281].aBoolean333 = true;
				}
			}
		}
		if (Static251.aBoolean330) {
			Static142.method2273();
		}
		if (Static251.aBoolean330) {
			Static80.method1370();
		}
		Static65.method4575();
		System.gc();
		Static20.method2327(true);
		Static143.method2290(false);
		if (!Static255.aBoolean339) {
			Static88.method1491(false);
			Static20.method2327(true);
			if (Static251.aBoolean330) {
				local393 = Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] >> 3;
				local281 = Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] >> 3;
				Static125.method2041(local393, local281);
			}
			Static307.method4710(false);
			if (Static307.aByteArrayArray17 != null) {
				Static81.method1394();
			}
		}
		if (Static255.aBoolean339) {
			Static189.method4550(false);
			Static20.method2327(true);
			if (Static251.aBoolean330) {
				local393 = Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] >> 3;
				local281 = Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] >> 3;
				Static125.method2041(local393, local281);
			}
			Static295.method4583(false);
		}
		Static160.method2578();
		Static20.method2327(true);
		Static256.method3966(Static255.aBoolean339 ? Static209.anIntArrayArrayArray11 : (int[][][]) null, false, Static223.aClass12Array1);
		if (Static251.aBoolean330) {
			Static142.method2280();
		}
		Static20.method2327(true);
		local393 = Static55.anInt1243;
		if (local393 > Static222.anInt4467) {
			local393 = Static222.anInt4467;
		}
		if (local393 >= Static222.anInt4467 - 1) {
		}
		if (Static162.method2605()) {
			Static221.method3432(0);
		} else {
			Static221.method3432(Static55.anInt1243);
		}
		Static159.method2570();
		if (Static251.aBoolean330 && local386) {
			Static158.method2543(true);
			Static143.method2290(true);
			if (!Static255.aBoolean339) {
				Static88.method1491(true);
				Static20.method2327(true);
				Static307.method4710(true);
			}
			if (Static255.aBoolean339) {
				Static189.method4550(true);
				Static20.method2327(true);
				Static295.method4583(true);
			}
			Static160.method2578();
			Static20.method2327(true);
			Static256.method3966(Static255.aBoolean339 ? Static209.anIntArrayArrayArray11 : (int[][][]) null, true, Static223.aClass12Array1);
			Static20.method2327(true);
			Static159.method2570();
			Static158.method2543(false);
		}
		if (Static251.aBoolean330) {
			for (local281 = 0; local281 < 13; local281++) {
				for (local292 = 0; local292 < 13; local292++) {
					Static249.aClass156ArrayArray1[local281][local292].method3897(Static154.anIntArrayArrayArray5[0], local281 * 8, local292 * 8);
				}
			}
		}
		for (local281 = 0; local281 < 104; local281++) {
			for (local292 = 0; local292 < 104; local292++) {
				Static44.method846(local292, local281);
			}
		}
		Static141.method2264();
		Static65.method4575();
		Static27.method581();
		Static160.method2578();
		Static247.aBoolean309 = false;
		if (Static251.aBoolean330) {
			Static169.method2686(true);
		}
		if (Static32.aFrame1 != null && Static261.aClass91_3 != null && Static204.anInt4047 == 25) {
			Static175.aClass4_Sub24_Sub1_1.method3123(58);
			Static175.aClass4_Sub24_Sub1_1.method3066(1057001181);
		}
		if (!Static255.aBoolean339) {
			local281 = (Static218.anInt4196 - 6) / 8;
			local292 = (Static218.anInt4196 + 6) / 8;
			@Pc(815) int local815 = (Static50.anInt1120 - 6) / 8;
			@Pc(821) int local821 = (Static50.anInt1120 + 6) / 8;
			for (@Pc(825) int local825 = local281 - 1; local825 <= local292 + 1; local825++) {
				for (@Pc(838) int local838 = local815 - 1; local838 <= local821 + 1; local838++) {
					if (local281 > local825 || local825 > local292 || local838 < local815 || local838 > local821) {
						Static296.aClass22_105.method662("m" + local825 + "_" + local838);
						Static296.aClass22_105.method662("l" + local825 + "_" + local838);
					}
				}
			}
		}
		if (Static204.anInt4047 == 28) {
			Static123.method2035(10);
		} else {
			Static123.method2035(30);
			if (Static261.aClass91_3 != null) {
				Static175.aClass4_Sub24_Sub1_1.method3123(198);
			}
		}
		Static274.method4330();
		Static65.method4575();
		Static298.method4218();
	}
}
