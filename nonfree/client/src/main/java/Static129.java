import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[S")
	public static short[] aShortArray26;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt2666 = 0;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public static int anInt2670 = 128;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1256 = Static187.method3089("Please remove ");

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1255 = aClass92_1256;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public static int anInt2672 = 0;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public static int anInt2678 = 0;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1257 = aClass92_1256;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBILclient!ba;)V")
	public static void method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11 arg3) {
		if (Static61.anInt1466 >= 3) {
			Static46.method3172(arg1, arg0, arg3.anIntArray27, arg3.anIntArray32);
		} else {
			Static25.aClass1_Sub3_Sub1_Sub1_1.method353(arg1, arg0, arg3.anInt312, arg3.anInt263, Static25.aClass1_Sub3_Sub1_Sub1_1.anInt452 / 2, Static25.aClass1_Sub3_Sub1_Sub1_1.anInt450 / 2, Static106.anInt2306, arg3.anIntArray27, arg3.anIntArray32);
		}
		Static143.aBooleanArray13[arg2] = true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)I")
	public static int method1877(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
