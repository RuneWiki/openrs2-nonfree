import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!me;")
	public static Class1_Sub5_Sub9_Sub2 aClass1_Sub5_Sub9_Sub2_2;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Z")
	public static boolean aBoolean488 = true;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public static int anInt5174 = -1;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)I")
	public static int method4304(@OriginalArg(0) int arg0) {
		if (Static97.aClass49_2 != null) {
			Static97.aClass49_2.method1307();
			Static97.aClass49_2 = null;
		}
		Static22.anInt452++;
		if (Static22.anInt452 > 4) {
			Static189.anInt3640 = 0;
			Static22.anInt452 = 0;
			return arg0;
		}
		Static189.anInt3640 = 0;
		if (Static245.anInt4509 == Static203.anInt3367) {
			Static203.anInt3367 = Static103.anInt2200;
		} else {
			Static203.anInt3367 = Static245.anInt4509;
		}
		return -1;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IZ)V")
	public static void method4305(@OriginalArg(0) int arg0) {
		Static128.aFloatArray21[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static128.aFloatArray21[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static128.aFloatArray21[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static155.method2675(3);
		Static155.method2675(4);
	}
}
