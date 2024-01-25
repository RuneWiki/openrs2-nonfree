import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static528 {

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt9392;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "F")
	public static float aFloat219;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!uh;")
	public static Class329 aClass329_3;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
	public static int anInt9395 = 0;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!pe;")
	public static final Class258 aClass258_11 = new Class258();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)Z")
	public static boolean method7656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
