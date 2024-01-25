import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_2 = new Class370(1, 2);

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZII)V")
	public static void method2421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static254.method3575(arg0, arg1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!cm;)V")
	public static void method2424(@OriginalArg(1) Class41_Sub2 arg0) {
		arg0.aClass41_Sub1_Sub1_Sub3_1 = null;
		if (Static135.anInt2262 < 20) {
			Static381.aClass102_3.method2055(arg0);
			Static135.anInt2262++;
		}
	}
}
