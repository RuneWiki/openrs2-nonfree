import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!ic;")
	public static Class113 aClass113_131;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
	public static int anInt7238;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray186 = new int[6][];

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public static void method5463() {
		Static32.aClass250Array1 = null;
		Static359.method4649(0, 0, Static92.anInt1618, -1, 0, Static169.anInt2522, 0, Static126.anInt2202);
		if (Static32.aClass250Array1 != null) {
			Static21.method393(anInt7238, Static88.anInt1566, Static32.aClass250Array1, 0, Static126.anInt2202, -1412584499, Static6.aClass250_1.anInt6962, Static92.anInt1618, 0);
			Static32.aClass250Array1 = null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(FIFF)I")
	public static int method5467(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(31) float local31 = arg2 < (float) 0 ? -arg2 : arg2;
		if (local21 > local12 && local21 > local31) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local31 && local31 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
