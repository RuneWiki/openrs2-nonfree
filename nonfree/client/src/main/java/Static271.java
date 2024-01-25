import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static271 {

	@OriginalMember(owner = "client!np", name = "r", descriptor = "[I")
	public static final int[] anIntArray429 = new int[50];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
	public static boolean method4648(@OriginalArg(0) int arg0) {
		Static100.anInt2246 = arg0 + 1 & 0xFFFF;
		Static264.aBoolean370 = true;
		return true;
	}
}
