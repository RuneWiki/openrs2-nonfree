import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static533 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "J")
	public static long aLong387;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
	public static boolean aBoolean650 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I")
	public static int method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static559.anIntArray612[arg1 & 0x3] : Static83.anIntArray111[arg1 & 0x3];
	}
}
