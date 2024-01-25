import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_46 = new Class218(45, 7);

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_90 = new Class338();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
	public static void method3120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static101.anIntArrayArray14 != null) {
			Static101.anIntArrayArray14[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static495.aShortArrayArray28 != null) {
			Static495.aShortArrayArray28[arg0][arg1] = (short) arg3;
		}
		if (Static62.aByteArrayArray5 != null) {
			Static62.aByteArrayArray5[arg0][arg1] = (byte) arg4;
		}
	}
}
