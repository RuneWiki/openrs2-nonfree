import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
	public static int anInt5356;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "[I")
	public static final int[] anIntArray463 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIB)Z")
	public static boolean method4413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)V")
	public static void method4414() {
		Static385.aBoolean436 = false;
		Static17.method466(Static315.anInt5432, Static270.anInt4802, Static280.anInt4913, Static389.anInt6274);
	}

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "(I)I")
	public static int method4415() {
		if ((double) Static168.aFloat5 == 3.0D) {
			return 37;
		} else if ((double) Static168.aFloat5 == 4.0D) {
			return 50;
		} else if ((double) Static168.aFloat5 == 6.0D) {
			return 75;
		} else if ((double) Static168.aFloat5 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
