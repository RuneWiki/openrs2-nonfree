import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!p;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!df;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_16;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array12;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1012 = Static2.method59("Stufe)2");

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public static int anInt2678 = 1;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1013 = Static2.method59("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1014 = Static2.method59("Cabbage");

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1015 = Static2.method59("Konfig geladen)3");

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1018 = Static2.method59("K");

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1016 = aClass80_1018;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1017 = Static2.method59("Free world");

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1019 = aClass80_1018;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1020 = aClass80_1017;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	public static int anInt2679 = 0;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "[I")
	public static int[] anIntArray352 = new int[5];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
	public static void method1664(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static64.anInt1824; local12++) {
			if (arg0 == Static64.aLongArray5[local12]) {
				Static64.anInt1824--;
				Static70.aBoolean131 = true;
				for (@Pc(36) int local36 = local12; local36 < Static64.anInt1824; local36++) {
					Static64.aLongArray5[local36] = Static64.aLongArray5[local36 + 1];
				}
				Static120.aClass2_Sub17_Sub1_3.method1799(174);
				Static120.aClass2_Sub17_Sub1_3.method1772(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1665() {
		Static100.aClass2_Sub17_Sub1_1.method1810();
		@Pc(13) int local13 = Static100.aClass2_Sub17_Sub1_1.method1801(8);
		@Pc(18) int local18;
		if (local13 < Static110.anInt2908) {
			for (local18 = local13; local18 < Static110.anInt2908; local18++) {
				Static44.anIntArray173[Static61.anInt1795++] = Static85.anIntArray277[local18];
			}
		}
		if (local13 > Static110.anInt2908) {
			throw new RuntimeException("gnpov1");
		}
		Static110.anInt2908 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(57) int local57 = Static85.anIntArray277[local18];
			@Pc(61) Class2_Sub1_Sub1_Sub4_Sub1 local61 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local57];
			@Pc(66) int local66 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			if (local66 == 0) {
				Static85.anIntArray277[Static110.anInt2908++] = local57;
				local61.anInt2342 = Static10.anInt300;
			} else {
				@Pc(89) int local89 = Static100.aClass2_Sub17_Sub1_1.method1801(2);
				if (local89 == 0) {
					Static85.anIntArray277[Static110.anInt2908++] = local57;
					local61.anInt2342 = Static10.anInt300;
					Static16.anIntArray68[Static93.anInt2410++] = local57;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static85.anIntArray277[Static110.anInt2908++] = local57;
						local61.anInt2342 = Static10.anInt300;
						local136 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local61.method1436(local136, false);
						local146 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
						if (local146 == 1) {
							Static16.anIntArray68[Static93.anInt2410++] = local57;
						}
					} else if (local89 == 2) {
						Static85.anIntArray277[Static110.anInt2908++] = local57;
						local61.anInt2342 = Static10.anInt300;
						local136 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local61.method1436(local136, true);
						local146 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local61.method1436(local146, true);
						@Pc(200) int local200 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
						if (local200 == 1) {
							Static16.anIntArray68[Static93.anInt2410++] = local57;
						}
					} else if (local89 == 3) {
						Static44.anIntArray173[Static61.anInt1795++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method1666() {
		aClass80_1014 = null;
		aClass80_1015 = null;
		aClass80_1012 = null;
		aClass80_1019 = null;
		anIntArray352 = null;
		aClass80_1018 = null;
		aClass80_1017 = null;
		aClass59_1 = null;
		aClass80_1013 = null;
		aClass80_1016 = null;
		aClass15_1 = null;
		aClass2_Sub1_Sub9_Sub1Array12 = null;
		anIntArray351 = null;
		Class66.anIntArray350 = null;
		aClass11_Sub1_16 = null;
		aClass80_1020 = null;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
	public static void method1667() {
		if (!Static8.aBoolean22) {
			return;
		}
		Static48.aClass22_10 = null;
		Static127.aClass22_20 = null;
		Static50.aClass22_11 = null;
		Static80.anIntArray273 = null;
		Static119.aClass2_Sub1_Sub9_Sub3_34 = null;
		Static25.aClass22_5 = null;
		Static18.aClass22_3 = null;
		Static60.aClass22_12 = null;
		Static19.aClass2_Sub1_Sub9_Sub3_18 = null;
		Static29.aClass2_Sub1_Sub9_Sub3Array1 = null;
		Static71.aClass2_Sub1_Sub9_Sub3_42 = null;
		Static83.aClass2_Sub1_Sub9_Sub3_52 = null;
		Static2.anIntArray9 = null;
		Static118.aClass2_Sub1_Sub9_Sub3_75 = null;
		Static102.aClass22_19 = null;
		Static100.aClass22_18 = null;
		Static35.anIntArray146 = null;
		Static8.aBoolean22 = false;
		Static6.aClass2_Sub1_Sub9_Sub3_7 = null;
		Static66.aClass2_Sub1_Sub9_Sub3_40 = null;
		Static15.aClass2_Sub1_Sub9_Sub3_13 = null;
		Static1.aClass22_1 = null;
		Static32.aClass22_6 = null;
		Static97.aClass22_17 = null;
		Static49.aClass2_Sub1_Sub9_Sub3_30 = null;
		Static18.aClass2_Sub1_Sub9_Sub3_16 = null;
		Static16.aClass22_2 = null;
		Static79.aClass22_14 = null;
		Static78.aClass2_Sub1_Sub9_Sub3_49 = null;
		Static61.aClass22_13 = null;
		Static85.aClass2_Sub1_Sub9_Sub3_53 = null;
		Static125.anIntArray358 = null;
		Static89.aClass2_Sub1_Sub9_Sub3_55 = null;
		Static86.aClass22_16 = null;
		Static82.aClass2_Sub1_Sub9_Sub3_76 = null;
		Static95.aClass2_Sub1_Sub9_Sub3_60 = null;
		Static45.aClass22_15 = null;
		Static76.aClass2_Sub1_Sub9_Sub3_45 = null;
	}
}
