import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static49 {

	@OriginalMember(owner = "client!bha", name = "q", descriptor = "Lclient!cga;")
	public static Class60 aClass60_17 = new Class60();

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "I")
	public static int anInt646 = 0;

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLclient!pk;)I")
	public static int method633(@OriginalArg(1) Class293 arg0) {
		if (Static162.aClass293_4 == arg0) {
			return 7681;
		} else if (arg0 == Static105.aClass293_3) {
			return 8448;
		} else if (Static62.aClass293_1 == arg0) {
			return 34165;
		} else if (arg0 == Static679.aClass293_5) {
			return 260;
		} else if (Static64.aClass293_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
