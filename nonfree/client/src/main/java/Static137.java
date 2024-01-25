import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
	public static boolean aBoolean289;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!c;")
	public static Class5 aClass5_15;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public static int anInt3036 = 0;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
	public static int[] anIntArray266 = new int[2];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method2804() {
		@Pc(13) Class87 local13 = Static204.aClass87_38;
		synchronized (Static204.aClass87_38) {
			Static204.aClass87_38.method2477();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2805() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static233.anInt5573; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static134.anInt2971; local13++) {
				if (Static168.method3368(local9, local7, local13, true, Static77.aClass194ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method2807() {
		Static190.aClass87_36.method2473(5);
	}
}
