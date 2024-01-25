import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "Lclient!ao;")
	public static Class10_Sub1_Sub2 aClass10_Sub1_Sub2_3;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
	public static int anInt3686 = 0;

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "Lclient!s;")
	public static final Class217 aClass217_81 = new Class217(92, 5);

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "Lclient!s;")
	public static final Class217 aClass217_82 = new Class217(5, 12);

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_63 = new Class27(31, -1);

	@OriginalMember(owner = "client!iq", name = "J", descriptor = "S")
	public static short aShort59 = 256;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ph;Lclient!za;I)V")
	public static void method2969(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class50 arg1) {
		if (Static379.aBoolean58) {
			return;
		}
		arg1.t(0);
		Static270.aClass80_15 = arg1.method5861(Static463.method1655(arg0, Static343.anInt5846));
		Static270.aClass80_15.method5558((Static90.anInt1891 - Static270.aClass80_15.RA()) / 2, (Static340.anInt5756 - Static270.aClass80_15.Q()) / 2);
		Static402.aClass80_23 = arg1.method5861(Static463.method1655(arg0, Static217.anInt4139));
		Static402.aClass80_23.method5558((Static90.anInt1891 - Static402.aClass80_23.RA()) / 2, 18);
		Static379.aBoolean58 = true;
	}
}
