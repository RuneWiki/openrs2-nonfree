import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static234 {

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	public static int anInt4263;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_136 = new Class186(90, -1);

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[I")
	public static final int[] anIntArray346 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
	public static int method3238(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
