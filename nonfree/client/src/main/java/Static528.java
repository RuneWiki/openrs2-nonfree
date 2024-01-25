import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!so", name = "i", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	public static int anInt8799 = 0;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt8800 = -1;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public static void method7562() {
		if (Static302.anInt4813 == -1) {
			return;
		}
		@Pc(11) int local11 = Static81.aClass13_1.method6355();
		@Pc(17) int local17 = Static81.aClass13_1.method6347();
		@Pc(22) Class5_Sub33 local22 = (Class5_Sub33) Static622.aClass306_65.method7313();
		if (local22 != null) {
			local11 = local22.method6099();
			local17 = local22.method6094();
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static144.aBoolean196) {
			local34 = Static577.method8147();
			local36 = Static601.method8395();
		}
		Static48.method770(local11, local17, local34, local34, local36, local36, local34 + local11, local36 + local17, Static254.anInt4283 + local34, Static438.anInt7403 + local36, Static302.anInt4813);
		if (Static157.aClass357_6 != null) {
			Static308.method4465(local17 + local36, local34 + local11);
		}
	}
}
