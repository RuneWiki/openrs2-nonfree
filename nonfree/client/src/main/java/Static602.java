import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static602 {

	@OriginalMember(owner = "client!via", name = "c", descriptor = "J")
	public static long aLong266;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "Lclient!ap;")
	public static final Class21 aClass21_4 = new Class21("LIVE", 0);

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III)Z")
	public static boolean method8257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
