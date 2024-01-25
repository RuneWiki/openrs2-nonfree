import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	public static int anInt1323 = 1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Z")
	public static boolean method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!ik;Lclient!d;)V")
	public static void method1240(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Interface4 arg1) {
		Static395.anInterface4_9 = arg1;
		Static177.aClass182_47 = arg0;
	}
}
