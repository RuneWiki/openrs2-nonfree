import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public static int anInt4849 = 1;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "[S")
	public static final short[] aShortArray61 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!nj;I)Lclient!nk;")
	public static Class49_Sub3 method4203(@OriginalArg(0) Class1_Sub21 arg0) {
		return new Class49_Sub3(arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5691(), arg0.method5705(), arg0.method5720());
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public static void method4204(@OriginalArg(1) int arg0) {
		if (Static318.anIntArray641 == null || arg0 > Static318.anIntArray641.length) {
			Static318.anIntArray641 = new int[arg0];
		}
	}
}
