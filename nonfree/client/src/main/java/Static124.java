import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_24;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Lclient!qe;")
	public static Class78 aClass78_571 = Static199.method3560(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
	public static void method2236(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static2.aBoolean2) {
			Static177.method3242();
		} else if (arg0 != -1 && (Static162.anInt3745 != arg0 || !Static127.method3917()) && Static89.anInt1999 != 0 && !Static2.aBoolean2) {
			Static113.method1932(Static90.aClass72_Sub1_17, arg0, Static89.anInt1999);
		}
		Static162.anInt3745 = arg0;
	}
}
