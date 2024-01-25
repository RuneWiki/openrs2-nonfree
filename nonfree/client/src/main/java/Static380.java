import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!fw;")
	public static Class127 aClass127_1;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_88 = new Class397(3, 8);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
	public static boolean method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static673.method9180(arg1)) {
			return true;
		} else {
			return !Static673.method9180(arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method5128(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static233.anInt3759 = arg0;
		Static374.aClass9_Sub5Array1 = new Class9_Sub5[Static280.anIntArray333[Static233.anInt3759] + 1];
		Static647.anInt9986 = 0;
		Static102.anInt2169 = 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	public static int method5130() {
		return Static314.anInt5068;
	}
}
