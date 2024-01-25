import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static557 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public static int anInt9206 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
	public static int method7545(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
