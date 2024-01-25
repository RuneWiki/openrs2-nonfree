import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!mr;")
	public static final Class232 aClass232_6 = new Class232();

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!db;")
	public static final Class64 aClass64_422 = new Class64(85, 0);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIBI)V")
	public static void method6710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class4_Sub41 local6 = Static212.method3682();
		local6.aClass4_Sub9_Sub1_3.method5961(-345277664, Static581.aClass118_7.anInt3562);
		local6.aClass4_Sub9_Sub1_3.method5961(-345277664, arg3);
		local6.aClass4_Sub9_Sub1_3.method5961(-345277664, arg0);
		local6.aClass4_Sub9_Sub1_3.method6012(arg1);
		local6.aClass4_Sub9_Sub1_3.method6012(arg2);
		Static551.method7603(local6);
		Static521.anInt8882 = -3;
		Static228.anInt4680 = 0;
		Static430.anInt7383 = 1;
		Static166.anInt3598 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public static void method6712() {
		if (Static4.aClass303_1 != null) {
			Static4.aClass303_1.method7980();
		}
		if (Static247.aClass303_2 != null) {
			Static247.aClass303_2.method7980();
		}
	}
}
