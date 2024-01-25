import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
	public static long aLong210;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ve;")
	public static Class348 aClass348_3;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)Z")
	public static boolean method6303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!r;II)V")
	public static void method6304(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2) {
		Static370.aClass217ArrayArray1 = new Class217[arg2][arg0];
		Static131.aClass43_5 = arg1;
		if (Static228.anIntArray131 != null) {
			Static312.aClass55_1 = Static433.method6087(Static228.anIntArray131[1], Static228.anIntArray131[4], Static228.anIntArray131[5], Static228.anIntArray131[3], Static228.anIntArray131[0], Static228.anIntArray131[2]);
		}
		Static100.aClass217_2 = new Class217();
		Static221.method5004();
	}
}
