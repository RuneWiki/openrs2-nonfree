import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static591 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[J")
	public static long[] aLongArray14;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!da;")
	public static Class37 aClass37_12;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
	public static int anInt9827;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
	public static int anInt9828;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "[I")
	public static final int[] anIntArray693 = new int[50];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
	public static boolean method8346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static479.method6801(arg1, arg0)) {
			return (arg0 & 0x9000) != 0 | Static566.method7893(arg1, arg0) | Static476.method6756(arg0, arg1) ? true : ((arg0 & 0x2000) != 0 | Static457.method7542(arg1, arg0) | Static363.method5407(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
	public static boolean method8349() {
		return Static633.anInt10265 > 0;
	}
}
