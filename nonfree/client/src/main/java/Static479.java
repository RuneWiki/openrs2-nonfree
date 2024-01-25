import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public static int anInt7523;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
	public static void method6495() {
		for (@Pc(12) int local12 = 0; local12 < Static385.anInt5974; local12++) {
			@Pc(18) Class398 local18 = Static149.aClass398Array1[local12];
			if (local18.aByte142 == 3) {
				if (local18.aClass3_Sub33_Sub5_3 == null) {
					local18.anInt10981 = Integer.MIN_VALUE;
				} else {
					Static391.aClass3_Sub33_Sub4_1.method8544(local18.aClass3_Sub33_Sub5_3);
				}
			}
		}
	}
}
