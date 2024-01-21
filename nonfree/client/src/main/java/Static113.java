import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!dd;")
	public static Class16 aClass16_31;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!dd;")
	public static Class16 aClass16_32;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!dd;")
	public static Class16 aClass16_33;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1129 = Static8.method128("This world is full)3");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1130 = Static8.method128("mn");

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1131 = aClass18_1129;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lclient!ea;")
	public static Class18 method2976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static49.aClass18_391;
		} else if (local8 < -6) {
			return Static97.aClass18_762;
		} else if (local8 < -3) {
			return Static59.aClass18_215;
		} else if (local8 < 0) {
			return Static58.aClass18_447;
		} else if (local8 > 9) {
			return Static166.aClass18_1169;
		} else if (local8 > 6) {
			return Static51.aClass18_406;
		} else if (local8 > 3) {
			return Static87.aClass18_647;
		} else if (local8 > 0) {
			return Static51.aClass18_412;
		} else {
			return Static24.aClass18_221;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method2978() {
		aClass18_1130 = null;
		aClass18_1129 = null;
		aClass16_33 = null;
		aClass16_32 = null;
		aClass18_1131 = null;
		aClass16_31 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method2980() {
		Static6.aClass66_1.method2604();
		Static156.aClass66_19.method2604();
	}
}
