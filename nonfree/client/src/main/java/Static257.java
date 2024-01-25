import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Lclient!fo;")
	public static Class82 aClass82_59;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	public static int anInt4672;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray84 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	public static int anInt4671 = -1;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public static void method3678() {
		Static249.aClass266Array1 = new Class266[50];
		Static234.anInt4174 = 0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)I")
	public static int method3679(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z")
	public static boolean method3680(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
