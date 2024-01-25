import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Z")
	public static final boolean aBoolean269 = false;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
	public static final int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method2120() {
		if (Static223.anInt5659 < 0) {
			Static112.anInt1711 = -1;
			Static223.anInt5659 = 0;
			Static454.anInt7226 = -1;
		}
		if (Static223.anInt5659 > Static430.anInt4144) {
			Static112.anInt1711 = -1;
			Static223.anInt5659 = Static430.anInt4144;
			Static454.anInt7226 = -1;
		}
		if (Static173.anInt2855 < 0) {
			Static173.anInt2855 = 0;
			Static112.anInt1711 = -1;
			Static454.anInt7226 = -1;
		}
		if (Static173.anInt2855 > Static430.anInt4137) {
			Static112.anInt1711 = -1;
			Static173.anInt2855 = Static430.anInt4137;
			Static454.anInt7226 = -1;
		}
	}
}
