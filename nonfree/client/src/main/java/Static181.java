import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "Lclient!dj;")
	public static Class51 aClass51_5;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
	public static int anInt3977;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_64 = new Class154(100);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I")
	public static int method3367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg1 <= arg2) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	public static void method3368() {
		if (Static49.anInt1089 > 0) {
			Static136.method2722();
		} else {
			Static27.aClass171_1 = Static131.aClass171_3;
			Static131.aClass171_3 = null;
			Static233.method3965(40);
		}
	}
}
