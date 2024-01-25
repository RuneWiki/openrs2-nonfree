import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static292 {

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)Z")
	public static boolean method4008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
