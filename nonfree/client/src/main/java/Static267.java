import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
	public static int anInt4663;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_126 = new Class129(91, 12);

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_81 = new Class198("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)V")
	public static void method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static98.aFloat83 > Static98.aFloat84) {
			Static98.aFloat84 = (float) ((double) Static98.aFloat84 + (double) Static98.aFloat84 / 30.0D);
			if (Static98.aFloat84 > Static98.aFloat83) {
				Static98.aFloat84 = Static98.aFloat83;
			}
			Static462.method6054();
			Static98.anInt3324 = (int) Static98.aFloat84 >> 1;
			Static98.aByteArrayArrayArray8 = Static59.method950(Static98.anInt3324);
		} else if (Static98.aFloat83 < Static98.aFloat84) {
			Static98.aFloat84 = (float) ((double) Static98.aFloat84 - (double) Static98.aFloat84 / 30.0D);
			if (Static98.aFloat84 < Static98.aFloat83) {
				Static98.aFloat84 = Static98.aFloat83;
			}
			Static462.method6054();
			Static98.anInt3324 = (int) Static98.aFloat84 >> 1;
			Static98.aByteArrayArrayArray8 = Static59.method950(Static98.anInt3324);
		}
		if (Static438.anInt7278 != -1 && Static390.anInt6394 != -1) {
			@Pc(86) int local86 = Static438.anInt7278 - Static282.anInt4369;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(103) int local103 = Static390.anInt6394 - Static110.anInt1841;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			Static282.anInt4369 -= -local86;
			Static110.anInt1841 += local103;
			if (local86 == 0 && local103 == 0) {
				Static390.anInt6394 = -1;
				Static438.anInt7278 = -1;
			}
			Static462.method6054();
		}
		if (Static320.anInt4977 > 0) {
			Static350.anInt5747--;
			if (Static350.anInt5747 == 0) {
				Static350.anInt5747 = 100;
				Static320.anInt4977--;
			}
		} else {
			Static34.anInt675 = -1;
			Static54.anInt944 = -1;
		}
		if (!Static309.aBoolean334 || Static382.aClass177_35 == null) {
			return;
		}
		for (@Pc(172) Class5_Sub29 local172 = (Class5_Sub29) Static382.aClass177_35.method3618(); local172 != null; local172 = (Class5_Sub29) Static382.aClass177_35.method3619()) {
			@Pc(181) Class6 local181 = Static98.aClass28_3.method670(local172.aClass5_Sub8_1.anInt953);
			if (local172.method3602(arg1, arg0)) {
				if (local181.aStringArray2 != null) {
					if (local181.aStringArray2[4] != null) {
						Static450.method5939((long) local172.aClass5_Sub8_1.anInt953, -1, local181.anInt129, true, 1002, local181.aStringArray2[4], -1, false, 0, local181.aString2);
					}
					if (local181.aStringArray2[3] != null) {
						Static450.method5939((long) local172.aClass5_Sub8_1.anInt953, -1, local181.anInt129, true, 1009, local181.aStringArray2[3], -1, false, 0, local181.aString2);
					}
					if (local181.aStringArray2[2] != null) {
						Static450.method5939((long) local172.aClass5_Sub8_1.anInt953, -1, local181.anInt129, true, 1001, local181.aStringArray2[2], -1, false, 0, local181.aString2);
					}
					if (local181.aStringArray2[1] != null) {
						Static450.method5939((long) local172.aClass5_Sub8_1.anInt953, -1, local181.anInt129, true, 1006, local181.aStringArray2[1], -1, false, 0, local181.aString2);
					}
					if (local181.aStringArray2[0] != null) {
						Static450.method5939((long) local172.aClass5_Sub8_1.anInt953, -1, local181.anInt129, true, 1010, local181.aStringArray2[0], -1, false, 0, local181.aString2);
					}
				}
				if (!local172.aClass5_Sub8_1.aBoolean77) {
					local172.aClass5_Sub8_1.aBoolean77 = true;
					Static181.method2469(Static213.aClass60_5, local172.aClass5_Sub8_1.anInt953, local181.anInt129);
				}
				if (local172.aClass5_Sub8_1.aBoolean77) {
					Static181.method2469(Static226.aClass60_6, local172.aClass5_Sub8_1.anInt953, local181.anInt129);
				}
			} else if (local172.aClass5_Sub8_1.aBoolean77) {
				local172.aClass5_Sub8_1.aBoolean77 = false;
				Static181.method2469(Static99.aClass60_4, local172.aClass5_Sub8_1.anInt953, local181.anInt129);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
	public static void method3706() {
		if (Static148.anInt2668 == 1 || Static148.anInt2668 == 3 || Static148.anInt2668 != Static2.anInt7507 && (Static148.anInt2668 == 0 || Static2.anInt7507 == 0)) {
			Static111.anInt1879 = 0;
			Static424.anInt7114 = 0;
			Static380.aClass252_36.method5661();
		}
		Static2.anInt7507 = Static148.anInt2668;
	}
}
