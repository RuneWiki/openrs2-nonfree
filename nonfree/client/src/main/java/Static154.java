import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public static int anInt3344 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V")
	public static void method2971(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static6.anInt302 != -1) {
				Static465.method7168(Static6.anInt302);
			}
			for (@Pc(20) Class6_Sub48 local20 = (Class6_Sub48) Static459.aClass305_24.method7445(); local20 != null; local20 = (Class6_Sub48) Static459.aClass305_24.method7449()) {
				if (!local20.method8152()) {
					local20 = (Class6_Sub48) Static459.aClass305_24.method7445();
					if (local20 == null) {
						break;
					}
				}
				Static551.method7862(true, false, local20);
			}
			Static6.anInt302 = -1;
			Static459.aClass305_24 = new Class305(8);
			Static380.method5987();
			Static6.anInt302 = Static557.anInt9492;
			Static171.method3490(false);
			Static101.method2148();
			Static89.method1984(Static6.anInt302);
		}
		Static390.aBoolean536 = true;
	}
}
