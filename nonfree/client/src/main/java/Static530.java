import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static530 {

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "Lclient!ec;")
	public static final Class88 aClass88_15 = new Class88(3);

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
	public static void method7282() {
		if (Static201.anInt3963 == 7) {
			Static295.method7108(false);
		} else {
			Static584.aClass116_2 = Static57.aClass116_1;
			Static57.aClass116_1 = null;
			Static121.method1780(13);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Z")
	public static boolean method7283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
