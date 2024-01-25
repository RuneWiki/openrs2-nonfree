import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt4882;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_127 = new Class77(30, 12);

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_147 = new Class41(53, 5);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIZI)Lclient!vf;")
	public static Class2_Sub41 method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub41 local7 = new Class2_Sub41();
		local7.anInt6413 = arg1;
		local7.anInt6411 = arg3;
		Static362.aClass214_32.method5065((long) arg0, local7);
		Static202.method3376(arg3);
		@Pc(26) Class155 local26 = Static240.method3886(arg0);
		if (local26 != null) {
			Static295.method4664(local26);
		}
		if (Static307.aClass155_31 != null) {
			Static295.method4664(Static307.aClass155_31);
			Static307.aClass155_31 = null;
		}
		Static82.method1454();
		if (local26 != null) {
			Static13.method409(local26, !arg2);
		}
		if (!arg2) {
			Static157.method2606(arg3);
		}
		if (!arg2 && Static226.anInt4223 != -1) {
			Static61.method1131(Static226.anInt4223, 1);
		}
		return local7;
	}
}
