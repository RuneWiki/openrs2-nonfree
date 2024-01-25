import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V")
	public static void method2693() {
		Static289.aClass109_52.method2850();
		Static149.aClass109_34.method2850();
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z")
	public static boolean method2694() {
		return Static351.anInt6735 != 0 || Static262.anInt5151 >= 2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!im;)V")
	public static void method2695(@OriginalArg(1) Class5_Sub22 arg0) {
		if (Static178.aClass174ArrayArrayArray3 == null) {
			return;
		}
		@Pc(14) Interface5 local14 = null;
		if (arg0.anInt2668 == 0) {
			local14 = (Interface5) Static330.method5730(arg0.anInt2669, arg0.anInt2675, arg0.anInt2674);
		}
		if (arg0.anInt2668 == 1) {
			local14 = (Interface5) Static241.method4296(arg0.anInt2669, arg0.anInt2675, arg0.anInt2674);
		}
		if (arg0.anInt2668 == 2) {
			local14 = (Interface5) Static259.method4533(arg0.anInt2669, arg0.anInt2675, arg0.anInt2674, iq.class);
		}
		if (arg0.anInt2668 == 3) {
			local14 = (Interface5) Static101.method1810(arg0.anInt2669, arg0.anInt2675, arg0.anInt2674);
		}
		if (local14 == null) {
			arg0.anInt2665 = 0;
			arg0.anInt2676 = 0;
			arg0.anInt2671 = -1;
		} else {
			arg0.anInt2671 = local14.method5910();
			arg0.anInt2665 = local14.method5913();
			arg0.anInt2676 = local14.method5908();
		}
	}
}
