import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	public static int anInt4921;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Z")
	public static boolean aBoolean308;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	public static int anInt4923;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public static int anInt4924 = -1;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)I")
	public static int method3899(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
