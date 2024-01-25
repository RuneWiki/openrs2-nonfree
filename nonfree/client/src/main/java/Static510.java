import org.openrs2.deob.annotation.OriginalMember;

public final class Static510 {

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "[I")
	public static int[] anIntArray540 = null;

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "(I)V")
	public static void method7387() {
		if (Static122.anInt2649 < 0) {
			Static433.anInt7555 = -1;
			Static122.anInt2649 = 0;
			Static108.anInt2182 = -1;
		}
		if (Static598.anInt2994 < Static122.anInt2649) {
			Static433.anInt7555 = -1;
			Static122.anInt2649 = Static598.anInt2994;
			Static108.anInt2182 = -1;
		}
		if (Static168.anInt3275 < 0) {
			Static433.anInt7555 = -1;
			Static108.anInt2182 = -1;
			Static168.anInt3275 = 0;
		}
		if (Static598.anInt2998 < Static168.anInt3275) {
			Static108.anInt2182 = -1;
			Static433.anInt7555 = -1;
			Static168.anInt3275 = Static598.anInt2998;
		}
	}
}
