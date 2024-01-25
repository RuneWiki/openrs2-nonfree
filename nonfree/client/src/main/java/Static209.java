import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Z")
	public static boolean aBoolean364 = true;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_42 = new Class77(26, 7);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public static void method3865() {
		Static339.anInt6471 = 0;
		@Pc(12) int local12 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7) + Static61.anInt1459;
		@Pc(20) int local20 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7) + Static203.anInt4534;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static339.anInt6471 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static339.anInt6471 = 1;
		}
		if (Static339.anInt6471 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static339.anInt6471 = 0;
		}
	}
}
