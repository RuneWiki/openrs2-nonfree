import java.awt.FontMetrics;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static int anInt4128;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
	public static int[] anIntArray430 = new int[5];

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_1092 = null;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array63 = new Class41[500];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method2840() {
		Static191.aByteArrayArrayArray11 = null;
		Static195.aByteArrayArrayArray12 = null;
		Static92.anIntArrayArrayArray11 = null;
		Static6.aByteArrayArrayArray1 = null;
		Static103.aByteArrayArrayArray8 = null;
		Static84.aByteArrayArrayArray4 = null;
		Static184.aByteArrayArrayArray10 = null;
		Static79.aClass80_8 = null;
		Static44.anIntArrayArrayArray6 = null;
		Static49.anIntArray133 = null;
		Static202.anInt1737 = 0;
		Static206.aClass108_19.method3328();
		Static144.aClass108_11.method3328();
		Static209.aClass39_8 = null;
		Static104.aClass39_2 = null;
		Static205.aClass39_7 = null;
		Static201.aClass39_6 = null;
		Static149.aClass39_3 = null;
		Static150.aClass39_4 = null;
		Static11.aClass39_1 = null;
		Static217.aClass2_Sub2_Sub16_4 = null;
		Static173.aClass39_5 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
	public static int method2841(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method2842() {
		if (Static92.anInt2287 > 0) {
			Static101.method1732();
		} else {
			Static116.method1955(40);
			Static78.aClass63_2 = Static30.aClass63_1;
			Static30.aClass63_1 = null;
		}
	}
}
