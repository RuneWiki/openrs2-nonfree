import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "B")
	public static byte aByte114;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public static int anInt7864 = 0;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
	public static boolean aBoolean528 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Z")
	public static boolean method6823(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 9 || arg0 == 11;
	}
}
