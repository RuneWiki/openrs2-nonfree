import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	public static int anInt1693;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public static int anInt1695;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
	public static final int anInt1694 = 1401;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)I")
	public static int method1463(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
