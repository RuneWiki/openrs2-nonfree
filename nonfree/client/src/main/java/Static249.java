import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public static int anInt4486;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString47 = null;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!vp;")
	public static Class262 method3618(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static143.aFloat50 == 3.0D) {
				return Static454.aClass262_10;
			}
			if ((double) Static143.aFloat50 == 4.0D) {
				return Static332.aClass262_9;
			}
			if ((double) Static143.aFloat50 == 6.0D) {
				return Static299.aClass262_7;
			}
			if ((double) Static143.aFloat50 >= 8.0D) {
				return Static226.aClass262_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static143.aFloat50 == 3.0D) {
				return Static299.aClass262_7;
			}
			if ((double) Static143.aFloat50 == 4.0D) {
				return Static226.aClass262_5;
			}
			if ((double) Static143.aFloat50 == 6.0D) {
				return Static63.aClass262_4;
			}
			if ((double) Static143.aFloat50 >= 8.0D) {
				return Static236.aClass262_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static143.aFloat50 == 3.0D) {
				return Static63.aClass262_4;
			}
			if ((double) Static143.aFloat50 == 4.0D) {
				return Static236.aClass262_6;
			}
			if ((double) Static143.aFloat50 == 6.0D) {
				return Static287.aClass262_8;
			}
			if ((double) Static143.aFloat50 >= 8.0D) {
				return Static52.aClass262_3;
			}
		}
		return null;
	}
}
