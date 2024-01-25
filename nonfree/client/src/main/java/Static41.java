import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject22;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	public static int anInt8212 = 0;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 25000, 2000 };

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
	public static final int anInt8217 = -1;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	public static void method6640() {
		Static307.anInt7603 = -1;
		Static133.anInt2648 = 1;
		if (Static213.aString42 == null) {
			Static501.method7054(35);
		} else {
			@Pc(22) Class1_Sub3 local22 = new Class1_Sub3(Static594.method7983(Static550.method7498(Static213.aString42)));
			@Pc(26) long local26 = local22.method7949();
			Static73.aLong42 = local22.method7949();
			Static181.method2849(Static56.method961(local26), true, "");
		}
	}
}
