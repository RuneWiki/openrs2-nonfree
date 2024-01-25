import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "Lclient!pe;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	public static int anInt776 = 1;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString70 = "Loaded sprites";

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)Lclient!ac;")
	public static Class4 method720(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static306.aFloat49 == 3.0D) {
				return Static280.aClass4_6;
			}
			if ((double) Static306.aFloat49 == 4.0D) {
				return Static211.aClass4_5;
			}
			if ((double) Static306.aFloat49 == 6.0D) {
				return Static12.aClass4_3;
			}
			if ((double) Static306.aFloat49 >= 8.0D) {
				return Static267.aClass4_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static306.aFloat49 == 3.0D) {
				return Static12.aClass4_3;
			}
			if ((double) Static306.aFloat49 == 4.0D) {
				return Static267.aClass4_8;
			}
			if ((double) Static306.aFloat49 == 6.0D) {
				return Static248.aClass4_7;
			}
			if ((double) Static306.aFloat49 >= 8.0D) {
				return Static334.aClass4_9;
			}
		} else if (arg0 == 2) {
			if ((double) Static306.aFloat49 == 3.0D) {
				return Static248.aClass4_7;
			}
			if ((double) Static306.aFloat49 == 4.0D) {
				return Static334.aClass4_9;
			}
			if ((double) Static306.aFloat49 == 6.0D) {
				return Static354.aClass4_10;
			}
			if ((double) Static306.aFloat49 >= 8.0D) {
				return Static97.aClass4_4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!oo;)Z")
	public static boolean method722(@OriginalArg(1) Class155 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean345) {
			return false;
		} else if (!arg0.method4084()) {
			return false;
		} else if (Static66.aClass10_15.method163((long) arg0.anInt4681) == null) {
			return Static153.aClass10_25.method163((long) arg0.anInt4683) == null;
		} else {
			return false;
		}
	}
}
