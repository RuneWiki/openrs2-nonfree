import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!ni;")
	public static Class223 aClass223_102;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt8162 = -2;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt8163 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V")
	public static void method6873(@OriginalArg(1) boolean arg0) {
		Static245.method4396();
		if (!Static238.method4328(Static333.anInt6626)) {
			return;
		}
		Static360.anInt6970++;
		if (Static360.anInt6970 < 50 && !arg0) {
			return;
		}
		Static360.anInt6970 = 0;
		if (!Static450.aBoolean650 && Static226.aClass41_1 != null) {
			@Pc(42) Class6_Sub17 local42 = Static330.method7824(Static457.aClass185_92, Static569.aClass134_2);
			Static452.method6867(local42);
			try {
				Static169.method3193();
			} catch (@Pc(49) IOException local49) {
				Static450.aBoolean650 = true;
			}
		}
		Static245.method4396();
	}
}
