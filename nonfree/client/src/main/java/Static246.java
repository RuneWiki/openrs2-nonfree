import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "S")
	public static short aShort60;

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "I")
	public static int anInt4581 = 1;

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
	public static int anInt4582 = 0;

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZIZ)V")
	public static void method3750(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static375.anInt6391--;
			if (Static375.anInt6391 == 0) {
				Static179.anIntArray162 = null;
			}
		}
		if (arg1) {
			Static708.anInt11077--;
			if (Static708.anInt11077 == 0) {
				Static305.anIntArray309 = null;
			}
		}
	}
}
