import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
	public static int anInt3034 = 0;

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
	public static int anInt3043 = 0;

	@OriginalMember(owner = "client!cd", name = "Db", descriptor = "Lclient!af;")
	public static Class5 aClass5_1371 = Static45.method1937("<col=ffffff>");

	@OriginalMember(owner = "client!cd", name = "Hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1373 = Static45.method1937("M");

	@OriginalMember(owner = "client!cd", name = "hc", descriptor = "Lclient!af;")
	public static Class5 aClass5_1374 = Static45.method1937("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!cd", name = "jc", descriptor = "Lclient!af;")
	public static Class5 aClass5_1375 = Static45.method1937("VOLL");

	@OriginalMember(owner = "client!cd", name = "xc", descriptor = "[Lclient!qe;")
	public static Class64[] aClass64Array3 = new Class64[50];

	@OriginalMember(owner = "client!cd", name = "Cc", descriptor = "Lclient!gd;")
	public static Class28 aClass28_80 = new Class28(64);

	@OriginalMember(owner = "client!cd", name = "Kc", descriptor = "I")
	public static int anInt3093 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!af;Lclient!af;III)V")
	public static void method2149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static69.aBoolean48 || anInt3043 >= 500) {
			return;
		}
		Static124.aClass5Array24[anInt3043] = arg3;
		Static75.aClass5Array12[anInt3043] = arg2;
		Static124.anIntArray455[anInt3043] = arg4;
		Static115.anIntArray430[anInt3043] = arg5;
		Static42.anIntArray186[anInt3043] = arg0;
		Static99.anIntArray375[anInt3043] = arg1;
		anInt3043++;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Lclient!of;")
	public static Class1_Sub17 method2150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub17 local9 = Static36.method680(arg0);
		if (arg1 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass1_Sub17Array1 == null || local9.aClass1_Sub17Array1.length <= arg1) {
			return null;
		} else {
			return local9.aClass1_Sub17Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method2153() {
		Static104.aClass53_12 = new Class53();
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V")
	public static void method2154() {
		aClass64Array3 = null;
		aClass5_1375 = null;
		aClass28_80 = null;
		aClass5_1371 = null;
		aClass5_1373 = null;
		aClass5_1374 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method2156() {
		Static12.anIntArray461 = new int[104];
		Static50.aByteArrayArrayArray2 = new byte[4][104][104];
		Static97.anIntArrayArrayArray3 = new int[4][105][105];
		Static123.aByteArrayArrayArray7 = new byte[4][104][104];
		Static112.anIntArrayArray80 = new int[105][105];
		Static79.anIntArray304 = new int[104];
		Static109.aByteArrayArrayArray6 = new byte[4][105][105];
		Static73.anIntArray280 = new int[104];
		Static79.aByteArrayArrayArray4 = new byte[4][104][104];
		Static76.anInt1797 = 99;
		Static95.aByteArrayArrayArray5 = new byte[4][104][104];
		Static51.anIntArray204 = new int[104];
		Static78.anIntArray302 = new int[104];
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	public static void method2158(@OriginalArg(1) int arg0) {
		Static102.method1745();
		Static3.method61();
		@Pc(14) int local14 = Static124.method2202(arg0).anInt3236;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static40.anIntArray182[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static114.method2001(0.9D);
				((Class39) Static114.anInterface3_1).method1040(0.9D);
			}
			if (local24 == 2) {
				Static114.method2001(0.8D);
				((Class39) Static114.anInterface3_1).method1040(0.8D);
			}
			if (local24 == 3) {
				Static114.method2001(0.7D);
				((Class39) Static114.anInterface3_1).method1040(0.7D);
			}
			if (local24 == 4) {
				Static114.method2001(0.6D);
				((Class39) Static114.anInterface3_1).method1040(0.6D);
			}
			Static65.method1179();
		}
		if (local14 == 3) {
			@Pc(78) short local78 = 0;
			if (local24 == 0) {
				local78 = 255;
			}
			if (local24 == 1) {
				local78 = 192;
			}
			if (local24 == 2) {
				local78 = 128;
			}
			if (local24 == 3) {
				local78 = 64;
			}
			if (local24 == 4) {
				local78 = 0;
			}
			if (Static82.anInt2065 != local78) {
				if (Static82.anInt2065 == 0 && Static108.anInt2659 != -1) {
					Static21.method528(local78, 0, Static108.anInt2659, Static98.aClass41_Sub1_16);
					aBoolean117 = false;
				} else if (local78 == 0) {
					Static120.method1342();
					aBoolean117 = false;
				} else {
					Static19.method480(local78);
				}
				Static82.anInt2065 = local78;
			}
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static27.anInt844 = 127;
			}
			if (local24 == 1) {
				Static27.anInt844 = 96;
			}
			if (local24 == 2) {
				Static27.anInt844 = 64;
			}
			if (local24 == 3) {
				Static27.anInt844 = 32;
			}
			if (local24 == 4) {
				Static27.anInt844 = 0;
			}
		}
		if (local14 == 6) {
			Static91.anInt2282 = local24;
		}
		if (local14 == 5) {
			Static76.anInt1795 = local24;
		}
		if (local14 == 9) {
			Static123.anInt3132 = local24;
		}
		if (local14 != 4) {
			return;
		}
		if (local24 == 0) {
			Static69.anInt1605 = 127;
		}
		if (local24 == 1) {
			Static69.anInt1605 = 96;
		}
		if (local24 == 2) {
			Static69.anInt1605 = 64;
		}
		if (local24 == 3) {
			Static69.anInt1605 = 32;
		}
		if (local24 == 4) {
			Static69.anInt1605 = 0;
			return;
		}
	}
}
