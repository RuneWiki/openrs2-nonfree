import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!b", name = "K", descriptor = "Lclient!ia;")
	private static Class51 aClass51_108 = Static64.method1101("");

	@OriginalMember(owner = "client!b", name = "I", descriptor = "Lclient!ia;")
	public static Class51 aClass51_107 = aClass51_108;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	public static int anInt320 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)I")
	public static int method264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}
}
