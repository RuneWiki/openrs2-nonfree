import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cja", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!cja", name = "t", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(BII)Z")
	public static boolean method1028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static249.method4344(arg0, arg1) || Static30.method351(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static584.method8153(arg0, arg1);
		}
	}
}
