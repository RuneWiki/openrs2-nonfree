import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
	public static int anInt3087;

	@OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
	public static int anInt3088;

	@OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
	public static int anInt3089;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	public static int anInt3067 = -1;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_5 = new Class328(6, 17);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)[Lclient!lh;")
	public static Class194[] method2734() {
		return new Class194[] { Static580.aClass194_7, Static561.aClass194_6, Static427.aClass194_3, Static530.aClass194_4, Static5.aClass194_1, Static7.aClass194_2 };
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!rr;III)V")
	public static void method2737(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static547.aClass292_14 != null || Static587.aBoolean734 || (arg0 == null || Static328.method5140(arg0) == null)) {
			return;
		}
		Static547.aClass292_14 = arg0;
		Static473.aClass292_10 = Static328.method5140(arg0);
		Static66.anInt1325 = arg2;
		Static315.anInt5383 = 0;
		Static226.aBoolean322 = false;
		Static565.anInt6649 = arg1;
	}
}
