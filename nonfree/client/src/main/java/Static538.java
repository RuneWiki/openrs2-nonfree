import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static538 {

	@OriginalMember(owner = "client!taa", name = "N", descriptor = "J")
	public static long aLong236;

	@OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
	public static int anInt8954 = 13156520;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
	public static boolean method7674(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
	public static void method7675(@OriginalArg(1) int arg0) {
		Static290.anInt4706 = arg0;
	}
}
