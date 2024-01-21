import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
	public static int anInt3970;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1376 = Static170.method3101("Welt");

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1380 = Static170.method3101("Your account has been disabled)3");

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1377 = aClass28_1380;

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1378 = Static170.method3101("ams");

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1379 = Static170.method3101("(Y");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ed;I)V")
	public static void method3014(@OriginalArg(0) Class3_Sub6 arg0) {
		Static52.method1203(arg0, 200000);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method3015() {
		aClass28_1380 = null;
		aClass28_1379 = null;
		aClass28_1378 = null;
		aClass28_1376 = null;
		aClass28_1377 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class28 method3016(@OriginalArg(1) int arg0) {
		@Pc(3) Class28 local3 = Static146.method2793(arg0);
		for (@Pc(18) int local18 = local3.method901() - 3; local18 > 0; local18 -= 3) {
			local3 = Static4.method96(new Class28[] { local3.method926(local18, 0), Static115.aClass28_959, local3.method905(local18) });
		}
		if (local3.method901() > 9) {
			return Static4.method96(new Class28[] { Static43.aClass28_385, local3.method926(local3.method901() - 8, 0), Static75.aClass28_682, Static113.aClass28_938, local3, Static165.aClass28_1396 });
		} else if (local3.method901() > 6) {
			return Static4.method96(new Class28[] { Static167.aClass28_1415, local3.method926(local3.method901() - 4, 0), Static32.aClass28_327, Static113.aClass28_938, local3, Static165.aClass28_1396 });
		} else {
			return Static4.method96(new Class28[] { Static44.aClass28_1372, local3, Static7.aClass28_85 });
		}
	}
}
