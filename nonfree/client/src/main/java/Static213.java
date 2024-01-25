import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static213 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(Z)V")
	public static void method3361() {
		Static356.method4859();
		Static112.method2026();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!ef;BI)Lclient!tq;")
	public static Class55_Sub3_Sub1 method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean132 || Static54.method895(arg2) && Static54.method895(arg4)) {
			return new Class55_Sub3_Sub1(arg3, 3553, arg1, arg0, arg2, arg4, true);
		} else if (arg3.aBoolean126) {
			return new Class55_Sub3_Sub1(arg3, 34037, arg1, arg0, arg2, arg4, true);
		} else {
			return new Class55_Sub3_Sub1(arg3, arg1, arg0, arg2, arg4, Static51.method863(arg2), Static51.method863(arg4), true);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!mg;)V")
	public static void method3365(@OriginalArg(1) Class160 arg0) {
		Static359.aClass160_72 = arg0;
	}
}
