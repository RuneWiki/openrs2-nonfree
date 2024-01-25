import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
	public static int anInt491 = 104;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)B")
	public static byte method388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
	public static void method389(@OriginalArg(0) int arg0) {
		if (Static377.anInt6297 == 1) {
			Static464.anInt7425 = arg0;
		} else if (Static377.anInt6297 == 2 || Static377.anInt6297 == 3) {
			Static263.anInt4318 = arg0;
		}
	}
}
