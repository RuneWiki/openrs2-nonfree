import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!om", name = "s", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "[Lclient!d;")
	public static Class4[] aClass4Array2;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public static int anInt1560 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)Z")
	public static boolean method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
