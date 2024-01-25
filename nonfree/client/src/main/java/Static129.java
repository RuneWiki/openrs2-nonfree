import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
	public static int anInt6336;

	@OriginalMember(owner = "client!eja", name = "l", descriptor = "I")
	public static int anInt6333 = -1;

	@OriginalMember(owner = "client!eja", name = "r", descriptor = "I")
	public static final int anInt6339 = 0;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!ck;ILclient!ka;III)V")
	public static void method5613(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class180 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg0.method1167(arg1, arg2.V(), arg2.G(), arg2.EA(), arg2.RA(), arg2.na(), arg2.fa(), arg4, arg3, arg2.HA());
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZI)Z")
	public static boolean method5614(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
