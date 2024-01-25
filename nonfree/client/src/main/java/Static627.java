import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public static int anInt10422 = 503;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method8867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static275.anInt4919 && Static529.anInt9089 >= arg8 && arg2 >= Static275.anInt4919 && arg2 <= Static529.anInt9089 && Static275.anInt4919 <= arg7 && arg7 <= Static529.anInt9089 && Static275.anInt4919 <= arg3 && Static529.anInt9089 >= arg3 && arg4 >= Static554.anInt9362 && arg4 <= Static62.anInt1300 && arg0 >= Static554.anInt9362 && Static62.anInt1300 >= arg0 && Static554.anInt9362 <= arg5 && arg5 <= Static62.anInt1300 && Static554.anInt9362 <= arg6 && arg6 <= Static62.anInt1300) {
			Static630.method8910(arg4, arg2, arg0, arg7, arg8, arg3, arg6, arg5, arg1);
		} else {
			Static561.method8139(arg4, arg6, arg8, arg1, arg2, arg5, arg0, arg3, arg7);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI[F)[F")
	public static float[] method8868(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(13) float[] local13 = new float[arg0];
		Static652.method4543(arg1, 0, local13, 0, arg0);
		return local13;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZBZ)V")
	public static void method8869(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static375.anInt6234++;
			Static51.method899();
		}
		if (arg0) {
			Static441.anInt7552++;
			Static363.method5391();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method8870(@OriginalArg(1) int arg0) {
		Static194.anIntArray188 = new int[arg0];
		Static588.anIntArray559 = new int[arg0];
		Static502.anIntArray485 = new int[arg0];
		Static344.anIntArray323 = new int[arg0];
		Static406.anIntArray376 = new int[arg0];
	}
}
