import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Please remove ";

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt5353 = 1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
	public static boolean method4111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static192.aBoolean414) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static86.aClass127ArrayArray1[local13] == null || Static86.aClass127ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(41) Class127 local41 = Static86.aClass127ArrayArray1[local13][local17];
		@Pc(49) int local49;
		if (arg1 == -1 && local41.anInt3570 == 0) {
			for (local49 = 0; local49 < Static29.anInt626; local49++) {
				if (Static276.aShortArray92[local49] == 50 || Static276.aShortArray92[local49] == 1004 || Static276.aShortArray92[local49] == 46 || Static276.aShortArray92[local49] == 29 || Static276.aShortArray92[local49] == 13) {
					for (@Pc(90) Class127 local90 = Static75.method1287(Static221.anIntArray522[local49]); local90 != null; local90 = Static90.method3585(local90)) {
						if (local41.anInt3574 == local90.anInt3574) {
							return true;
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < Static29.anInt626; local49++) {
				if (Static55.anIntArray140[local49] == arg1 && Static221.anIntArray522[local49] == local41.anInt3574 && (Static276.aShortArray92[local49] == 50 || Static276.aShortArray92[local49] == 1004 || Static276.aShortArray92[local49] == 46 || Static276.aShortArray92[local49] == 29 || Static276.aShortArray92[local49] == 13)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ak;B)V")
	public static void method4113(@OriginalArg(0) Class7 arg0) {
		Static279.anInt5595 = arg0.method264("titlebg");
		Static17.anInt406 = arg0.method264("logo");
	}
}
