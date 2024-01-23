import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[S")
	public static short[] aShortArray95 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method4637() {
		for (@Pc(14) Class4_Sub2_Sub22 local14 = (Class4_Sub2_Sub22) Static91.aClass17_12.method613(); local14 != null; local14 = (Class4_Sub2_Sub22) Static91.aClass17_12.method607()) {
			@Pc(20) Class13_Sub4 local20 = local14.aClass13_Sub4_1;
			if (Static222.anInt4467 != local20.anInt3394 || local20.aBoolean218) {
				local14.method4690();
			} else if (Static50.anInt1118 >= local20.anInt3393) {
				local20.method2687(Static309.anInt1336);
				if (local20.aBoolean218) {
					local14.method4690();
				} else {
					Static234.method3640(local20.anInt3394, local20.anInt3378, local20.anInt3391, local20.anInt3382, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}
