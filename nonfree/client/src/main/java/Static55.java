import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array6 = new Class23[100];

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_551 = Static169.method2903("Versteckt");

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
	public static int[] anIntArray175 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_552 = Static169.method2903("Free world");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_553 = Static169.method2903("");

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_554 = aClass23_552;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method999() {
		aClass23_553 = null;
		anIntArray175 = null;
		aClass23_551 = null;
		aClass23_552 = null;
		aClass23_554 = null;
		aFontMetrics1 = null;
		aClass23Array6 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public static void method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (arg1 != Static110.anInt2825) {
			Static86.anIntArray294 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static86.anIntArray294[local21] = (local21 << 12) / arg1;
			}
			Static110.anInt2825 = arg1;
			Static99.anInt2523 = arg1 - 1;
		}
		if (Static102.anInt2580 == arg0) {
			return;
		}
		Static37.anIntArray125 = new int[arg0];
		for (local21 = 0; local21 < arg0; local21++) {
			Static37.anIntArray125[local21] = (local21 << 12) / arg0;
		}
		Static64.anInt1680 = arg0 - 1;
		Static102.anInt2580 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public static int method1001() {
		return Static20.anInt672++;
	}
}
