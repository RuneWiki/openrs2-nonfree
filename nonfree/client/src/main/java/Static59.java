import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!br", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
	public static boolean method1119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)I")
	public static int method1125(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
