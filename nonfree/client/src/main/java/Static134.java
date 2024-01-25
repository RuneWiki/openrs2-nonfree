import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	public static int method1728() {
		return Static168.anInt2782;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
	public static void method1737() {
		if (Static382.aClass247_2 != null) {
			Static459.aClass204_1 = new Class204();
			Static459.aClass204_1.method4786(Static542.aLong271, Static382.aClass247_2, Static382.aClass247_2.aClass42_64.method730(Static259.anInt4113), Static382.aClass247_2.anInt6917);
			Static405.aThread6 = new Thread(Static459.aClass204_1, "");
			Static405.aThread6.start();
		}
	}
}
