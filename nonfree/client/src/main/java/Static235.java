import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public static int anInt4023 = -1;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	public static int anInt4027 = 0;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "J")
	public static long aLong139 = -1L;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "Z")
	public static boolean aBoolean295 = true;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
	public static void method3434(@OriginalArg(0) int arg0) {
		Static81.anInt1468 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	public static void method3435() {
		Static126.method1992(false);
		if (Static124.anInt2275 >= 0 && Static124.anInt2275 != 0) {
			Static299.method4264(Static124.anInt2275);
			Static124.anInt2275 = -1;
		}
	}
}
