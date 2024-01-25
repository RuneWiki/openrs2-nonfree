import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public static int anInt8018;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	public static int anInt8022 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!kda;)V")
	public static void method6846(@OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
			@Pc(28) Class3_Sub1_Sub3_Sub3_Sub1 local28 = (Class3_Sub1_Sub3_Sub3_Sub1) arg0;
			if (local28.aClass27_1 != null) {
				Static130.method3021(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 != local28.aByte132, local28);
			}
		} else if (arg0 instanceof Class3_Sub1_Sub3_Sub3_Sub2) {
			@Pc(12) Class3_Sub1_Sub3_Sub3_Sub2 local12 = (Class3_Sub1_Sub3_Sub3_Sub2) arg0;
			Static614.method8975(local12.aByte132 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, local12);
		}
	}
}
