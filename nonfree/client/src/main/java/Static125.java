import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	public static int anInt2929 = -1;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_30 = new Class269(69, 1);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method2513() {
		Static107.anIntArray193 = null;
		Static401.anIntArray496 = null;
		Static191.anIntArray403 = null;
		Static477.anIntArray556 = null;
		Static192.aBoolean353 = false;
		Static495.anIntArray581 = null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V")
	public static void method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static41.anIntArrayArray9 != null) {
			Static41.anIntArrayArray9[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static588.aShortArrayArray31 != null) {
			Static588.aShortArrayArray31[arg0][arg1] = (short) arg3;
		}
		if (Static150.aByteArrayArray6 != null) {
			Static150.aByteArrayArray6[arg0][arg1] = (byte) arg4;
		}
	}
}
