import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "Lclient!en;")
	public static Class2_Sub19_Sub1 aClass2_Sub19_Sub1_1;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "Lclient!ha;")
	public static Class35 aClass35_23;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "Lclient!lr;")
	public static Class104 aClass104_1;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
	public static int anInt5177;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BII)Z")
	public static boolean method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static311.method4813(arg1, arg0) || Static269.method4299(arg1, arg0);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V")
	public static void method4446() {
		if (Static387.anInt7341 == -1) {
			return;
		}
		@Pc(15) int local15 = Static61.aClass214_1.method7241();
		@Pc(19) int local19 = Static61.aClass214_1.method7240();
		@Pc(24) Class2_Sub26 local24 = (Class2_Sub26) Static431.aClass249_61.method6527();
		if (local24 != null) {
			local15 = local24.method6659();
			local19 = local24.method6660();
		}
		Static139.method2470(Static387.anInt7341, local19, 0, 0, 0, 0, Static223.anInt3996, Static461.anInt8348, local15);
		if (Static292.aClass310_13 != null) {
			Static341.method5363(local19, local15);
		}
	}
}
