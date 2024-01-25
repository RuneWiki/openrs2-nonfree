import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_5 = new Class233(5);

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)Z")
	public static boolean method1085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
