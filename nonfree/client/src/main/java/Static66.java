import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!cd;")
	public static Class10 aClass10_697 = Static51.method932(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public static int anInt1600 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_698 = Static51.method932("(Udns");

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
	public static int[] anIntArray175 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	public static int anInt1601 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method1138() {
		anIntArray175 = null;
		aClass10_697 = null;
		aClass10_698 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class10 method1139(@OriginalArg(0) int arg0) {
		return Static3.method36(new Class10[] { Static164.method2485(arg0 >> 24 & 0xFF), Static131.aClass10_1263, Static164.method2485(arg0 >> 16 & 0xFF), Static131.aClass10_1263, Static164.method2485(arg0 >> 8 & 0xFF), Static131.aClass10_1263, Static164.method2485(arg0 & 0xFF) });
	}
}
