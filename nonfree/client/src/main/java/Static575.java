import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static575 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Lclient!vm;")
	public static Class130 aClass130_3;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
	public static final int[] anIntArray550 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public static void method8331() {
		Static9.aClass133_1 = null;
		Static517.anInt8885 = -1;
		Static477.anInterface16_1 = null;
		Static641.anIntArray604 = null;
		Static244.anInt4473 = -1;
		Static483.anInt8236 = -1;
		Static197.anInterface16Array5 = null;
		Static182.aClass113_3 = null;
		Static468.anInt7871 = -1;
		Static10.aClass113_1 = null;
		Static633.aClass113_9 = null;
		Static108.aClass155_1.method3773();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)B")
	public static byte method8332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
