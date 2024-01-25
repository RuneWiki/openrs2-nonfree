import org.openrs2.deob.annotation.OriginalMember;

public final class Static606 {

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	public static int anInt10222;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	public static int anInt10225 = 0;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
	public static void method8509() {
		if (Static330.aClass131_22 != null) {
			Static292.aClass360_1 = new Class360();
			Static292.aClass360_1.method8672(Static330.aClass131_22.aClass303_2.method7473(Static232.anInt4258), Static201.aLong111, Static330.aClass131_22.anInt3620, Static330.aClass131_22);
			Static278.aThread1 = new Thread(Static292.aClass360_1, "");
			Static278.aThread1.start();
		}
	}
}
