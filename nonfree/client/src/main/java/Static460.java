import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static460 {

	@OriginalMember(owner = "client!pr", name = "Z", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!pr", name = "Qb", descriptor = "I")
	public static int anInt7982;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BJ)I")
	public static int method6845(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
