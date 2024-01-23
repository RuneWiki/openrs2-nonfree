import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "Lclient!nm;")
	public static Class119 aClass119_14;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	public static int anInt844 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([I[JI)V")
	public static void method722(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static277.method4244(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I")
	public static int method723(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
