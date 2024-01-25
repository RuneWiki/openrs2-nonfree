import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
	public static void method5363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static201.aFloat6 > Static201.aFloat5) {
			Static201.aFloat5 = (float) ((double) Static201.aFloat5 + (double) Static201.aFloat5 / 30.0D);
			if (Static201.aFloat5 > Static201.aFloat6) {
				Static201.aFloat5 = Static201.aFloat6;
			}
			Static371.method5897();
			Static201.anInt197 = (int) Static201.aFloat5 >> 1;
			Static201.aByteArrayArrayArray4 = Static525.method7622(Static201.anInt197);
		} else if (Static201.aFloat5 > Static201.aFloat6) {
			Static201.aFloat5 = (float) ((double) Static201.aFloat5 - (double) Static201.aFloat5 / 30.0D);
			if (Static201.aFloat6 > Static201.aFloat5) {
				Static201.aFloat5 = Static201.aFloat6;
			}
			Static371.method5897();
			Static201.anInt197 = (int) Static201.aFloat5 >> 1;
			Static201.aByteArrayArrayArray4 = Static525.method7622(Static201.anInt197);
		}
		if (Static467.anInt8412 != -1 && Static294.anInt5413 != -1) {
			@Pc(80) int local80 = Static467.anInt8412 - Static202.anInt3644;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(97) int local97 = Static294.anInt5413 - Static140.anInt2619;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static202.anInt3644 -= -local80;
			if (local80 == 0 && local97 == 0) {
				Static467.anInt8412 = -1;
				Static294.anInt5413 = -1;
			}
			Static140.anInt2619 += local97;
			Static371.method5897();
		}
		if (Static277.anInt5015 > 0) {
			Static533.anInt9264--;
			if (Static533.anInt9264 == 0) {
				Static277.anInt5015--;
				Static533.anInt9264 = 100;
			}
		} else {
			Static25.anInt1756 = -1;
			Static276.anInt5003 = -1;
		}
		if (!Static414.aBoolean621 || Static411.aClass249_59 == null) {
			return;
		}
		for (@Pc(165) Class2_Sub48 local165 = (Class2_Sub48) Static411.aClass249_59.method6527(); local165 != null; local165 = (Class2_Sub48) Static411.aClass249_59.method6525()) {
			@Pc(174) Class182 local174 = Static201.aClass56_2.method1680(local165.aClass2_Sub35_1.anInt6264);
			if (local165.method7656(arg0, arg1)) {
				if (local174.aStringArray29 != null) {
					if (local174.aStringArray29[4] != null) {
						Static111.method2154((long) local165.aClass2_Sub35_1.anInt6264, -1, 1007, 0, true, local174.aStringArray29[4], local174.anInt5322, local174.aString119, -1, false);
					}
					if (local174.aStringArray29[3] != null) {
						Static111.method2154((long) local165.aClass2_Sub35_1.anInt6264, -1, 1003, 0, true, local174.aStringArray29[3], local174.anInt5322, local174.aString119, -1, false);
					}
					if (local174.aStringArray29[2] != null) {
						Static111.method2154((long) local165.aClass2_Sub35_1.anInt6264, -1, 1004, 0, true, local174.aStringArray29[2], local174.anInt5322, local174.aString119, -1, false);
					}
					if (local174.aStringArray29[1] != null) {
						Static111.method2154((long) local165.aClass2_Sub35_1.anInt6264, -1, 1009, 0, true, local174.aStringArray29[1], local174.anInt5322, local174.aString119, -1, false);
					}
					if (local174.aStringArray29[0] != null) {
						Static111.method2154((long) local165.aClass2_Sub35_1.anInt6264, -1, 1008, 0, true, local174.aStringArray29[0], local174.anInt5322, local174.aString119, -1, false);
					}
				}
				if (!local165.aClass2_Sub35_1.aBoolean471) {
					local165.aClass2_Sub35_1.aBoolean471 = true;
					Static258.method4043(Static454.aClass188_9, local165.aClass2_Sub35_1.anInt6264, local174.anInt5322);
				}
				if (local165.aClass2_Sub35_1.aBoolean471) {
					Static258.method4043(Static174.aClass188_3, local165.aClass2_Sub35_1.anInt6264, local174.anInt5322);
				}
			} else if (local165.aClass2_Sub35_1.aBoolean471) {
				local165.aClass2_Sub35_1.aBoolean471 = false;
				Static258.method4043(Static71.aClass188_2, local165.aClass2_Sub35_1.anInt6264, local174.anInt5322);
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)I")
	public static int method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static54.anIntArray81[arg1 & 0x3] : 256;
	}
}
