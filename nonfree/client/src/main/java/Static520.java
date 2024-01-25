import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
	public static int anInt8367;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BZ)V")
	public static void method7300(@OriginalArg(1) boolean arg0) {
		Static72.method1380();
		if (!Static409.method5810(Static406.anInt6454)) {
			return;
		}
		Static213.anInt4078++;
		if (Static213.anInt4078 < 50 && !arg0) {
			return;
		}
		Static213.anInt4078 = 0;
		if (!Static286.aBoolean362 && Static559.aClass269_1 != null) {
			@Pc(35) Class3_Sub34 local35 = Static172.method3123(Static163.aClass375_1, Static199.aClass218_53);
			Static441.method6275(local35);
			try {
				Static93.method9381();
			} catch (@Pc(42) IOException local42) {
				Static286.aBoolean362 = true;
			}
		}
		Static72.method1380();
	}
}
