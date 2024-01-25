import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static243 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	public static int anInt4836;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)I")
	public static int method4191(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
