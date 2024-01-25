import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "Lclient!fd;")
	public static Class76 aClass76_2;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_96 = new Class209("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!bm;")
	public static Class28 method3436(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static88.aFloat67 == 3.0D) {
				return Static216.aClass28_14;
			}
			if ((double) Static88.aFloat67 == 4.0D) {
				return Static344.aClass28_13;
			}
			if ((double) Static88.aFloat67 == 6.0D) {
				return Static274.aClass28_11;
			}
			if ((double) Static88.aFloat67 >= 8.0D) {
				return Static190.aClass28_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static88.aFloat67 == 3.0D) {
				return Static274.aClass28_11;
			}
			if ((double) Static88.aFloat67 == 4.0D) {
				return Static190.aClass28_5;
			}
			if ((double) Static88.aFloat67 == 6.0D) {
				return Static103.aClass28_1;
			}
			if ((double) Static88.aFloat67 >= 8.0D) {
				return Static105.aClass28_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static88.aFloat67 == 3.0D) {
				return Static103.aClass28_1;
			}
			if ((double) Static88.aFloat67 == 4.0D) {
				return Static105.aClass28_2;
			}
			if ((double) Static88.aFloat67 == 6.0D) {
				return Static192.aClass28_6;
			}
			if ((double) Static88.aFloat67 >= 8.0D) {
				return Static260.aClass28_10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!uj;Lclient!uj;I)V")
	public static void method3438(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_262 != null) {
			arg1.method5866();
		}
		arg1.aClass2_261 = arg0;
		arg1.aClass2_262 = arg0.aClass2_262;
		arg1.aClass2_262.aClass2_261 = arg1;
		arg1.aClass2_261.aClass2_262 = arg1;
	}
}
