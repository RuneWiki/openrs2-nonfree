import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static271 {

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	public static int anInt5145 = 1;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)Z")
	public static boolean method4359(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
	public static void method4360(@OriginalArg(0) int arg0) {
		Static461.anInt5546 = 1000 / arg0;
	}
}
