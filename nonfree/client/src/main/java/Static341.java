import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
	public static int anInt6214;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	public static void method5619(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static84.method1400();
		} else if (arg0 == 2) {
			Static122.method2431();
		} else if (arg0 == 3) {
			Static219.method3905();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
	public static void method5620() {
		Static242.aClass70_81.method1399();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
	public static boolean method5621(@OriginalArg(0) int arg0) {
		if (arg0 == 58 || arg0 == 47 || arg0 == 13 || arg0 == 20 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 41 || arg0 == 17 || arg0 == 1004;
		}
	}
}
