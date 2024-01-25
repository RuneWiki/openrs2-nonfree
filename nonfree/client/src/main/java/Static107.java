import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!ec", name = "Ib", descriptor = "[J")
	public static long[] aLongArray16;

	@OriginalMember(owner = "client!ec", name = "lc", descriptor = "I")
	public static int anInt8425;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)Z")
	public static boolean method6922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
