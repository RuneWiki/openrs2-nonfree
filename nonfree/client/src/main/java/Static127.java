import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	public static int anInt2675;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
	public static int anInt2674 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	public static int method2266(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
