import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static529 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public static int anInt9098;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "[I")
	public static final int[] anIntArray469 = new int[32];

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_223 = new Class160(131, 11);

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString102 = null;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!ma;")
	public static Class228 method7841(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static224.aFloat10 == 3.0D) {
				return Static99.aClass228_2;
			}
			if ((double) Static224.aFloat10 == 4.0D) {
				return Static600.aClass228_8;
			}
			if ((double) Static224.aFloat10 == 6.0D) {
				return Static107.aClass228_3;
			}
			if ((double) Static224.aFloat10 >= 8.0D) {
				return Static143.aClass228_4;
			}
		} else if (arg0 == 1) {
			if ((double) Static224.aFloat10 == 3.0D) {
				return Static107.aClass228_3;
			}
			if ((double) Static224.aFloat10 == 4.0D) {
				return Static143.aClass228_4;
			}
			if ((double) Static224.aFloat10 == 6.0D) {
				return Static577.aClass228_7;
			}
			if ((double) Static224.aFloat10 >= 8.0D) {
				return Static470.aClass228_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static224.aFloat10 == 3.0D) {
				return Static577.aClass228_7;
			}
			if ((double) Static224.aFloat10 == 4.0D) {
				return Static470.aClass228_6;
			}
			if ((double) Static224.aFloat10 == 6.0D) {
				return Static43.aClass228_1;
			}
			if ((double) Static224.aFloat10 >= 8.0D) {
				return Static307.aClass228_5;
			}
		}
		return null;
	}
}
