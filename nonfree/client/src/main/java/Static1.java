import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Db", descriptor = "I")
	public static int anInt149;

	@OriginalMember(owner = "client!a", name = "Fb", descriptor = "Lclient!tj;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)Z")
	public static boolean method147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
