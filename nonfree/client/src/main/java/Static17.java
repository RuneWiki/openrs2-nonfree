import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static17 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
	public static int anInt295;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
	public static int anInt299;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)I")
	public static int method293(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
