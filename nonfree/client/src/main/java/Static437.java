import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "[S")
	public static short[] aShortArray106;

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_236 = new Class88("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!rt", name = "E", descriptor = "[I")
	public static final int[] anIntArray604 = new int[32];

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public static void method6658() {
		Static493.aClass198Array2 = null;
		Static402.method6313(Static406.anInt7660, 0, Static169.anInt3893, -1, 0, 0, 0, Static127.anInt2936);
		if (Static493.aClass198Array2 != null) {
			Static198.method3762(Static486.anInt8842, -1412584499, Static169.anInt3893, Static493.aClass198Array2, Static309.aClass198_9.anInt5714, Static418.anInt7781, 0, Static127.anInt2936, 0);
			Static493.aClass198Array2 = null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(III)Z")
	public static boolean method6659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!n;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class42 method6661(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) Canvas arg1) {
		return new a(arg1, arg0);
	}
}
