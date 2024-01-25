import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static556 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "[I")
	public static int[] anIntArray707;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Z")
	public static boolean aBoolean726 = false;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_277 = new Class235(24, -2);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
	public static boolean method7580(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)B")
	public static byte method7581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
