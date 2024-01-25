import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_292 = new Class12(85, 12);

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_94 = new Class96("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!qs", name = "P", descriptor = "Z")
	public static boolean aBoolean489 = true;

	@OriginalMember(owner = "client!qs", name = "Q", descriptor = "Z")
	public static volatile boolean aBoolean490 = false;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public static void method4809() {
		for (@Pc(15) Class1_Sub21 local15 = (Class1_Sub21) Static280.aClass142_29.method3199(); local15 != null; local15 = (Class1_Sub21) Static280.aClass142_29.method3198()) {
			if (local15.anInt3370 > 0) {
				local15.anInt3370--;
			}
			if (local15.anInt3370 != 0) {
				if (local15.anInt3375 > 0) {
					local15.anInt3375--;
				}
				if (local15.anInt3375 == 0 && local15.anInt3367 >= 1 && local15.anInt3366 >= 1 && local15.anInt3367 <= Static80.anInt6558 - 2 && local15.anInt3366 <= Static104.anInt2048 - 2 && (local15.anInt3376 < 0 || Static269.method3759(local15.anInt3376, local15.anInt3381))) {
					Static105.method1699(local15.anInt3368, local15.anInt3367, local15.anInt3378, local15.anInt3366, local15.anInt3376, -1, local15.anInt3374, local15.anInt3381);
					local15.anInt3375 = -1;
					if (local15.anInt3380 == local15.anInt3376 && local15.anInt3380 == -1) {
						local15.method5965();
					} else if (local15.anInt3380 == local15.anInt3376 && local15.anInt3377 == local15.anInt3368 && local15.anInt3379 == local15.anInt3381) {
						local15.method5965();
					}
				}
			} else if (local15.anInt3380 < 0 || Static269.method3759(local15.anInt3380, local15.anInt3379)) {
				Static105.method1699(local15.anInt3377, local15.anInt3367, local15.anInt3378, local15.anInt3366, local15.anInt3380, -1, local15.anInt3374, local15.anInt3379);
				local15.method5965();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V")
	public static void method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static92.aClass169_1 == Static325.aClass169_2) {
			if (Static382.method4555(arg0, arg1, 0, -2, false, 1, 0, 1)) {
				return;
			}
			Static382.method4555(arg0, arg1, 0, -3, false, 1, 0, 1);
		} else if (Static382.method4555(arg0, arg1, 0, -3, false, 1, 0, 1)) {
			return;
		} else {
			Static382.method4555(arg0, arg1, 0, -2, false, 1, 0, 1);
		}
	}
}
