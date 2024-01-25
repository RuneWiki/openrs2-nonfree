import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static473 {

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "Lclient!lq;")
	public static Class224 aClass224_10;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	public static int anInt8013 = 0;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
	public static int anInt8017 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)Z")
	public static boolean method6907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static253.method3723(arg1, arg0) | (arg0 & 0x60000) != 0 || Static247.method3635(arg1, arg0);
	}
}
