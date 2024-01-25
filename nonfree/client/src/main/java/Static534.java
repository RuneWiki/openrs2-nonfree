import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static534 {

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	public static final int anInt8757 = 1338;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public static int anInt8759 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(CB)Z")
	public static boolean method7372(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
