import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "Lclient!bc;")
	public static Class21 aClass21_5;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_35 = new Class168(6, 7);

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString69 = "";

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[I")
	public static final int[] anIntArray666 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZII)V")
	public static void method5396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(11, arg0);
		local8.method5345();
		local8.anInt6806 = arg2;
		local8.anInt6813 = arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V")
	public static void method5397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static143.aFloat50 < Static143.aFloat49) {
			Static143.aFloat50 = (float) ((double) Static143.aFloat50 + (double) Static143.aFloat50 / 30.0D);
			if (Static143.aFloat50 > Static143.aFloat49) {
				Static143.aFloat50 = Static143.aFloat49;
			}
			Static14.method198();
			Static143.anInt2855 = (int) Static143.aFloat50 >> 1;
			Static143.aByteArrayArrayArray2 = Static335.method4518(Static143.anInt2855);
		} else if (Static143.aFloat50 > Static143.aFloat49) {
			Static143.aFloat50 = (float) ((double) Static143.aFloat50 - (double) Static143.aFloat50 / 30.0D);
			if (Static143.aFloat49 > Static143.aFloat50) {
				Static143.aFloat50 = Static143.aFloat49;
			}
			Static14.method198();
			Static143.anInt2855 = (int) Static143.aFloat50 >> 1;
			Static143.aByteArrayArrayArray2 = Static335.method4518(Static143.anInt2855);
		}
		if (Static126.anInt2600 != -1 && Static370.anInt6392 != -1) {
			@Pc(79) int local79 = Static126.anInt2600 - Static90.anInt1909;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static370.anInt6392 - Static55.anInt999;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static90.anInt1909 -= -local79;
			Static55.anInt999 += local96;
			if (local79 == 0 && local96 == 0) {
				Static370.anInt6392 = -1;
				Static126.anInt2600 = -1;
			}
			Static14.method198();
		}
		if (Static301.anInt5208 <= 0) {
			Static36.anInt599 = -1;
			Static7.anInt120 = -1;
		} else {
			Static351.anInt6021--;
			if (Static351.anInt6021 == 0) {
				Static351.anInt6021 = 100;
				Static301.anInt5208--;
			}
		}
		if (!Static73.aBoolean105 || Static339.aClass163_38 == null) {
			return;
		}
		for (@Pc(164) Class10_Sub5 local164 = (Class10_Sub5) Static339.aClass163_38.method3620(); local164 != null; local164 = (Class10_Sub5) Static339.aClass163_38.method3621()) {
			@Pc(173) Class208 local173 = Static143.aClass88_2.method2268(local164.aClass10_Sub46_1.anInt7522);
			if (local164.method474(arg1, arg0)) {
				if (local173.aStringArray41 != null) {
					if (local173.aStringArray41[4] != null) {
						Static260.method3744(local173.aStringArray41[4], 1009, (long) local164.aClass10_Sub46_1.anInt7522, local173.anInt6003, false, -1, local173.aString54, true, -1, 0);
					}
					if (local173.aStringArray41[3] != null) {
						Static260.method3744(local173.aStringArray41[3], 1006, (long) local164.aClass10_Sub46_1.anInt7522, local173.anInt6003, false, -1, local173.aString54, true, -1, 0);
					}
					if (local173.aStringArray41[2] != null) {
						Static260.method3744(local173.aStringArray41[2], 1010, (long) local164.aClass10_Sub46_1.anInt7522, local173.anInt6003, false, -1, local173.aString54, true, -1, 0);
					}
					if (local173.aStringArray41[1] != null) {
						Static260.method3744(local173.aStringArray41[1], 1011, (long) local164.aClass10_Sub46_1.anInt7522, local173.anInt6003, false, -1, local173.aString54, true, -1, 0);
					}
					if (local173.aStringArray41[0] != null) {
						Static260.method3744(local173.aStringArray41[0], 1002, (long) local164.aClass10_Sub46_1.anInt7522, local173.anInt6003, false, -1, local173.aString54, true, -1, 0);
					}
				}
				if (!local164.aClass10_Sub46_1.aBoolean496) {
					local164.aClass10_Sub46_1.aBoolean496 = true;
					Static79.method1511(Static169.aClass36_8, local164.aClass10_Sub46_1.anInt7522, local173.anInt6003);
				}
				if (local164.aClass10_Sub46_1.aBoolean496) {
					Static79.method1511(Static182.aClass36_10, local164.aClass10_Sub46_1.anInt7522, local173.anInt6003);
				}
			} else if (local164.aClass10_Sub46_1.aBoolean496) {
				local164.aClass10_Sub46_1.aBoolean496 = false;
				Static79.method1511(Static448.aClass36_13, local164.aClass10_Sub46_1.anInt7522, local173.anInt6003);
			}
		}
	}
}
