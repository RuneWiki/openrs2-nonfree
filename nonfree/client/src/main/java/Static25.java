import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "[S")
	public static short[] aShortArray55 = new short[256];

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	public static int anInt3151 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
	public static void method2634(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub4_Sub18 local16 = Static565.method7924((long) arg0, 7);
		local16.method7979();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public static void method2636() {
		if (Static231.aClass64_2 != null) {
			Static231.aClass64_2.method1735();
		}
		if (Static165.aClass64_1 != null) {
			Static165.aClass64_1.method1735();
		}
	}
}
