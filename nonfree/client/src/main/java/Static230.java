import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	public static int anInt4044;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBI)Z")
	public static boolean method3587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
