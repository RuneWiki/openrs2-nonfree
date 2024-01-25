import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt1180;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt1182 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
	public static int method897(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method898() {
		if (Static170.anInt3494 == 6) {
			Static162.method2668(false);
		} else if (Static32.anInt907 > 0) {
			Static162.method2668(Static429.aBoolean496);
		} else {
			Static389.aClass236_14 = Static388.aClass236_13;
			Static388.aClass236_13 = null;
			Static118.method2017(12);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public static int method901(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
