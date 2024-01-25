import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
	public static int anInt1093 = 0;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public static int anInt1094 = -1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)I")
	public static int method1009(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
