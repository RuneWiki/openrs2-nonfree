import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "F")
	public static float aFloat167;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "S")
	public static short aShort98 = 1;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public static void method6210() {
		if (Static152.anInt1936 == -1) {
			return;
		}
		@Pc(11) int local11 = Static9.aClass29_1.method2946();
		@Pc(15) int local15 = Static9.aClass29_1.method2942();
		@Pc(20) Class6_Sub41 local20 = (Class6_Sub41) Static43.aClass298_22.method6809();
		if (local20 != null) {
			local11 = local20.method6487();
			local15 = local20.method6480();
		}
		Static93.method1390(0, 0, 0, 0, Static152.anInt1936, Static154.anInt2867, local15, Static367.anInt6719, local11);
		if (Static496.aClass97_24 != null) {
			Static327.method5036(local11, local15);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6213(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static569.anInt9840; local11++) {
			if (arg0.equalsIgnoreCase(Static326.aStringArray26[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82);
	}
}
