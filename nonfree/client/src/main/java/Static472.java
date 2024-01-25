import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	public static int anInt8271 = 0;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	public static int anInt8274 = -1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)I")
	public static int method7115(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
