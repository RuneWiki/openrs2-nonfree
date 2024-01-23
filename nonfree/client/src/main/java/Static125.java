import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString75 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public static int anInt2380 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1921() {
		if (Static36.anInt4790 < 0) {
			Static274.anInt5464 = -1;
			Static36.anInt4790 = 0;
			Static269.anInt5391 = -1;
		}
		if (Static93.anInt1769 < Static36.anInt4790) {
			Static269.anInt5391 = -1;
			Static274.anInt5464 = -1;
			Static36.anInt4790 = Static93.anInt1769;
		}
		if (Static33.anInt717 < 0) {
			Static274.anInt5464 = -1;
			Static33.anInt717 = 0;
			Static269.anInt5391 = -1;
		}
		if (Static77.anInt1559 < Static33.anInt717) {
			Static33.anInt717 = Static77.anInt1559;
			Static269.anInt5391 = -1;
			Static274.anInt5464 = -1;
		}
	}
}
