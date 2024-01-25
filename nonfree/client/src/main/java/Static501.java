import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
	public static int anInt8413 = 0;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
	public static void method6998() {
		@Pc(1) Class313 local1 = Static30.aClass313_7;
		synchronized (Static30.aClass313_7) {
			Static30.aClass313_7.method6983();
		}
		local1 = Static6.aClass313_3;
		synchronized (Static6.aClass313_3) {
			Static6.aClass313_3.method6983();
		}
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
	public static void method6999() {
		Static402.anInt7015 = -1;
		Static253.anInt4705 = 1;
		if (Static544.aString96 == null) {
			Static139.method2346(35);
		} else {
			@Pc(29) Class2_Sub15 local29 = new Class2_Sub15(Static534.method7307(Static156.method7058(Static544.aString96)));
			@Pc(33) long local33 = local29.method4351();
			Static27.aLong23 = local29.method4351();
			Static100.method1501(true, "", Static268.method7982(local33));
		}
	}
}
