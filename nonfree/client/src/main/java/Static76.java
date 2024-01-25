import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cha", name = "c", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "S")
	public static short aShort24 = 320;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IBI)Z")
	public static boolean method1319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
