import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method4069() {
		if (Static201.anInt3963 == 3) {
			Static121.method1780(4);
		} else if (Static201.anInt3963 == 7) {
			Static121.method1780(8);
		} else if (Static201.anInt3963 == 10) {
			Static121.method1780(11);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)B")
	public static byte method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
