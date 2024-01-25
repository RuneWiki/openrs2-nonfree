import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
	public static int anInt6832;

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
	public static int anInt6838 = -50;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!r;IIZ)Lclient!nk;")
	public static Class218 method5722(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1 == null ? null : new Class218(arg2, arg0, arg3, arg1.e(), arg1.wa(), arg1.va(), arg1.TA(), arg1.n(), arg1.Q(), arg1.U());
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
	public static boolean method5723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
