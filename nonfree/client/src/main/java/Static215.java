import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public static int anInt4264 = 0;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
	public static final int[] anIntArray217 = new int[8];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
	public static boolean method3942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!ci;")
	public static Class57 method3943() {
		try {
			return (Class57) Class.forName("fga").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(JJ)J")
	public static long method3944(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
