import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static554 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public static int anInt9455;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_131 = new Class218(47, 11);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I")
	public static int method7814(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BII)Z")
	public static boolean method7815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
