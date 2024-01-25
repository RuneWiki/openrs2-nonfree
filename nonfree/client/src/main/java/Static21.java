import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_10 = new Class102(16, 3);

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_3 = new Class225(6, 3);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BZ)V")
	public static void method133(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static282.aClass2_Sub5_Sub15_6 != null) {
			Static396.anInt7302 = Static282.aClass2_Sub5_Sub15_6.anInt5823;
		} else {
			Static396.anInt7302 = -1;
		}
		Static282.aClass2_Sub5_Sub15_6 = null;
		Static294.aClass16_5 = null;
		Static144.aClass156_14 = null;
		Static178.anInt5442 = 0;
		Static282.method2777();
		Static282.aClass156_23.method3161();
		Static447.aClass260_9 = null;
		Static424.aClass260_7 = null;
		Static49.anInt857 = -1;
		Static266.aClass260_4 = null;
		Static435.anInt7039 = -1;
		Static282.aClass67_3 = null;
		Static221.aClass260_3 = null;
		Static132.aClass260_2 = null;
		Static64.aClass260_1 = null;
		Static434.aClass260_8 = null;
		Static307.aClass260_5 = null;
		Static299.aClass13_19 = null;
		Static282.aClass120_4.method2515();
		Static282.aClass97_3.method2133(64, 64);
		Static282.aClass120_4.method2511(64, 128);
		Static282.aClass190_3.method4221(64);
		Static291.aClass8_1.method144(64);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)Z")
	public static boolean method135(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(IB)V")
	public static void method137(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class2 local14 = Static127.aClass72_14.method1655(); local14 != null; local14 = Static127.aClass72_14.method1649()) {
			if ((long) arg0 == (local14.aLong225 >> 48 & 0xFFFFL)) {
				local14.method5703();
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZ)V")
	public static void method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static282.aFloat35 < Static282.aFloat34) {
			Static282.aFloat35 = (float) ((double) Static282.aFloat35 + (double) Static282.aFloat35 / 30.0D);
			if (Static282.aFloat35 > Static282.aFloat34) {
				Static282.aFloat35 = Static282.aFloat34;
			}
			Static108.method1681();
			Static282.anInt3465 = (int) Static282.aFloat35 >> 1;
			Static282.aByteArrayArrayArray10 = Static214.method2829(Static282.anInt3465);
		} else if (Static282.aFloat35 > Static282.aFloat34) {
			Static282.aFloat35 = (float) ((double) Static282.aFloat35 - (double) Static282.aFloat35 / 30.0D);
			if (Static282.aFloat35 < Static282.aFloat34) {
				Static282.aFloat35 = Static282.aFloat34;
			}
			Static108.method1681();
			Static282.anInt3465 = (int) Static282.aFloat35 >> 1;
			Static282.aByteArrayArrayArray10 = Static214.method2829(Static282.anInt3465);
		}
		if (Static435.anInt7039 != -1 && Static49.anInt857 != -1) {
			@Pc(86) int local86 = Static435.anInt7039 - Static379.anInt6865;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(101) int local101 = Static49.anInt857 - Static301.anInt3360;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			Static379.anInt6865 -= -local86;
			if (local86 == 0 && local101 == 0) {
				Static435.anInt7039 = -1;
				Static49.anInt857 = -1;
			}
			Static301.anInt3360 += local101;
			Static108.method1681();
		}
		if (Static162.anInt2742 <= 0) {
			Static47.anInt838 = -1;
			Static120.anInt2210 = -1;
		} else {
			Static237.anInt3819--;
			if (Static237.anInt3819 == 0) {
				Static237.anInt3819 = 100;
				Static162.anInt2742--;
			}
		}
		if (!Static77.aBoolean116 || Static144.aClass156_14 == null) {
			return;
		}
		for (@Pc(164) Class2_Sub18 local164 = (Class2_Sub18) Static144.aClass156_14.method3155(); local164 != null; local164 = (Class2_Sub18) Static144.aClass156_14.method3150()) {
			@Pc(173) Class78 local173 = Static282.aClass120_4.method2512(local164.aClass2_Sub40_1.anInt6352);
			if (local164.method1717(arg1, arg0)) {
				if (local173.aStringArray9 != null) {
					if (local173.aStringArray9[4] != null) {
						Static153.method2190(local173.anInt2163, local173.aStringArray9[4], true, -1, local173.aString65, -1, 0, 1008, false, (long) local164.aClass2_Sub40_1.anInt6352);
					}
					if (local173.aStringArray9[3] != null) {
						Static153.method2190(local173.anInt2163, local173.aStringArray9[3], true, -1, local173.aString65, -1, 0, 1010, false, (long) local164.aClass2_Sub40_1.anInt6352);
					}
					if (local173.aStringArray9[2] != null) {
						Static153.method2190(local173.anInt2163, local173.aStringArray9[2], true, -1, local173.aString65, -1, 0, 1004, false, (long) local164.aClass2_Sub40_1.anInt6352);
					}
					if (local173.aStringArray9[1] != null) {
						Static153.method2190(local173.anInt2163, local173.aStringArray9[1], true, -1, local173.aString65, -1, 0, 1003, false, (long) local164.aClass2_Sub40_1.anInt6352);
					}
					if (local173.aStringArray9[0] != null) {
						Static153.method2190(local173.anInt2163, local173.aStringArray9[0], true, -1, local173.aString65, -1, 0, 1012, false, (long) local164.aClass2_Sub40_1.anInt6352);
					}
				}
				if (!local164.aClass2_Sub40_1.aBoolean455) {
					local164.aClass2_Sub40_1.aBoolean455 = true;
					Static191.method2559(Static251.aClass240_6, local164.aClass2_Sub40_1.anInt6352, local173.anInt2163);
				}
				if (local164.aClass2_Sub40_1.aBoolean455) {
					Static191.method2559(Static183.aClass240_4, local164.aClass2_Sub40_1.anInt6352, local173.anInt2163);
				}
			} else if (local164.aClass2_Sub40_1.aBoolean455) {
				local164.aClass2_Sub40_1.aBoolean455 = false;
				Static191.method2559(Static352.aClass240_8, local164.aClass2_Sub40_1.anInt6352, local173.anInt2163);
			}
		}
	}
}
