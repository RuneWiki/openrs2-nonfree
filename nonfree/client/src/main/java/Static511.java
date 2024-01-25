import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_26 = new Class177(4, 7);

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!g;")
	public static final Class122 aClass122_15 = new Class122(2);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	public static void method6668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 * Static336.aClass3_Sub41_18.aClass14_Sub9_3.method2998() >> 8;
		if (local20 == 0 || arg1 == -1) {
			return;
		}
		if (!Static501.aBoolean551 && Static189.anInt3426 != -1 && Static594.method7826() && !Static265.method3919()) {
			Static552.aClass3_Sub12_Sub3_2 = Static344.method5002();
			@Pc(47) Class3_Sub12_Sub3 local47 = Static102.method8293(Static552.aClass3_Sub12_Sub3_2);
			Static124.method1850(local47);
		}
		Static58.method7696(Static459.aClass362_101, local20, arg1);
		Static59.method1093(-1, 255);
		Static501.aBoolean551 = true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!gj;Lclient!gj;)V")
	public static void method6670(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg1.aClass3_Sub5_67 != null) {
			arg1.method9014();
		}
		arg1.aClass3_Sub5_66 = arg0.aClass3_Sub5_66;
		arg1.aClass3_Sub5_67 = arg0;
		arg1.aClass3_Sub5_67.aClass3_Sub5_66 = arg1;
		arg1.aClass3_Sub5_66.aClass3_Sub5_67 = arg1;
	}
}
