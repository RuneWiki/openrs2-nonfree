import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static295 {

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public static int anInt5793;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!ef;")
	public static final Class77 aClass77_2 = new Class77();

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIII)V")
	public static void method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static400.anIntArrayArray31 != null) {
			Static400.anIntArrayArray31[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static464.aShortArrayArray16 != null) {
			Static464.aShortArrayArray16[arg0][arg1] = (short) arg3;
		}
		if (Static393.aByteArrayArray114 != null) {
			Static393.aByteArrayArray114[arg0][arg1] = (byte) arg4;
		}
	}
}
