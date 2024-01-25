import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Lclient!vo;")
	public static Class389 aClass389_2;

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "S")
	public static short aShort41 = 205;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIB)Z")
	public static boolean method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
