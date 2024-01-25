import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
	public static int anInt8104;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
	public static int anInt8102 = 0;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_88 = new Class240(1, -1);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6715(@OriginalArg(0) String arg0) {
		return Static128.aHashtable4.containsKey(arg0);
	}
}
