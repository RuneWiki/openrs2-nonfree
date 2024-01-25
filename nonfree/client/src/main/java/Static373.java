import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	public static int anInt6911;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	public static int anInt6920;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "Lclient!lq;")
	public static Class5_Sub15_Sub2 aClass5_Sub15_Sub2_1;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)B")
	public static byte method5614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
