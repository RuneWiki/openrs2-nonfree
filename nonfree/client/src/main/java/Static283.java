import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public static final int anInt5163 = 1406;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!it;B)V")
	public static void method4167(@OriginalArg(0) Class4_Sub2_Sub2 arg0) {
		if (arg0 instanceof Class4_Sub2_Sub2_Sub2) {
			@Pc(9) Class4_Sub2_Sub2_Sub2 local9 = (Class4_Sub2_Sub2_Sub2) arg0;
			if (local9.aClass215_1 != null) {
				Static185.method2943(local9, local9.aByte92 != Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92);
			}
		} else if (arg0 instanceof Class4_Sub2_Sub2_Sub1) {
			@Pc(31) Class4_Sub2_Sub2_Sub1 local31 = (Class4_Sub2_Sub2_Sub1) arg0;
			Static51.method1003(Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 != local31.aByte92, local31);
		}
	}
}
