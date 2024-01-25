import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public static int anInt2427;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
	public static int method2024(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(JJ)J")
	public static long method2025(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
