import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "[C")
	public static final char[] aCharArray2 = new char[128];

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)Z")
	public static boolean method933(@OriginalArg(1) int arg0) {
		if (arg0 == 38 || arg0 == 33 || arg0 == 2 || arg0 == 19 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 28 || arg0 == 59 || arg0 == 1009;
		}
	}
}
