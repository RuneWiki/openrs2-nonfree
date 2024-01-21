import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!gf", name = "Vb", descriptor = "I")
	public static int anInt1100 = 0;

	@OriginalMember(owner = "client!gf", name = "dc", descriptor = "[I")
	public static int[] anIntArray119 = new int[4000];

	@OriginalMember(owner = "client!gf", name = "gc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_662 = Static28.method504("Spieler");

	@OriginalMember(owner = "client!gf", name = "sc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_665 = Static28.method504("scroll:");

	@OriginalMember(owner = "client!gf", name = "jc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_663 = aClass39_665;

	@OriginalMember(owner = "client!gf", name = "pc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_664 = Static28.method504("Einloggen");

	@OriginalMember(owner = "client!gf", name = "tc", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!gf", name = "vc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_666 = Static28.method504(")3");

	@OriginalMember(owner = "client!gf", name = "Gc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_667 = aClass39_665;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(B)V")
	public static void method736() {
		aClass39_667 = null;
		aClass39_666 = null;
		aClass39_664 = null;
		anIntArray119 = null;
		aClass39_665 = null;
		aClass39_662 = null;
		aClass39_663 = null;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	public static void method738() {
		if (Static44.anInt1128 > 0) {
			Static26.method433();
		} else {
			Static54.method966(40);
			Static45.aClass69_2 = Static49.aClass69_3;
			Static49.aClass69_3 = null;
		}
	}
}
