import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!et;Z)V")
	public static void method1611(@OriginalArg(1) Class91 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt2446 == 0 ? arg0.anInt2399 : arg0.anInt2446;
		@Pc(24) int local24 = arg0.anInt2444 == 0 ? arg0.anInt2378 : arg0.anInt2444;
		Static254.method4606(Static511.aClass91ArrayArray2[arg0.anInt2368 >> 16], arg0.anInt2368, arg1, local15, local24);
		if (arg0.lb != null) {
			Static254.method4606(arg0.lb, arg0.anInt2368, arg1, local15, local24);
		}
		@Pc(63) Class1_Sub35 local63 = (Class1_Sub35) Static362.aClass230_45.method6144((long) arg0.anInt2368);
		if (local63 != null) {
			Static100.method2038(local24, local15, arg1, local63.anInt5502);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1612(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
