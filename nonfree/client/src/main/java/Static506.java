import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt8778;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
	public static int anInt8779;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!sea;")
	public static Class308 aClass308_171;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
	public static boolean aBoolean659 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
	public static void method7087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static100.anInt1767 = arg0 - Static287.anInt3862;
		Static264.anInt4867 = arg1 - Static287.anInt3859;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method7088() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static73.aBooleanArray6[local7] = true;
		}
	}
}
