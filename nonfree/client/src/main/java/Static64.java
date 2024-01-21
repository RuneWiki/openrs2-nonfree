import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!ib", name = "Bb", descriptor = "[I")
	public static int[] anIntArray332 = new int[100];

	@OriginalMember(owner = "client!ib", name = "Fb", descriptor = "[I")
	public static int[] anIntArray333 = new int[5];

	@OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "(I)V")
	public static void method1555() {
		aRandom1 = null;
		anIntArray333 = null;
		anIntArray332 = null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static82.anInt2391 == 2) {
			Static9.method288(Static32.anInt979 * 2, Static170.anInt4091 + (Static145.anInt3634 - Static111.anInt2843 << 7), (-Static29.anInt907 + Static84.anInt2468 << 7) + Static44.anInt3940);
			if (Static137.anInt3510 > -1 && Static14.anInt481 % 20 < 10) {
				Static118.aClass3_Sub2_Sub2_Sub4Array4[0].method996(arg0 + Static137.anInt3510 - 12, arg1 - (-Static154.anInt3821 + 28));
			}
		}
	}
}
