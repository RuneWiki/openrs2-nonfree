import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public static int anInt3141;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public static int anInt3142;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "F")
	public static float aFloat110 = 0.25F;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Z")
	public static boolean method2826(@OriginalArg(0) int arg0) {
		return arg0 == 59 || arg0 == 3 || arg0 == 1007 || arg0 == 19 || arg0 == 11;
	}
}
