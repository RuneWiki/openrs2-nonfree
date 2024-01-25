import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt5867;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "F")
	public static float aFloat104 = 1024.0F;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z")
	public static boolean method4978(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
