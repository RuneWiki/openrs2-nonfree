import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!tj;")
	public static Class316 aClass316_6;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray25 = new byte[1000][];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6231(@OriginalArg(1) String arg0) {
		Static84.method1791(4, "", "", arg0, 0, "");
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIZII)V")
	public static void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg3 - arg6;
		@Pc(18) int local18 = arg6 + arg4;
		for (@Pc(20) int local20 = arg4; local20 < local18; local20++) {
			Static238.method3886(Static442.anIntArrayArray48[local20], arg2, arg1, arg5);
		}
		for (@Pc(40) int local40 = arg3; local40 > local14; local40--) {
			Static238.method3886(Static442.anIntArrayArray48[local40], arg2, arg1, arg5);
		}
		@Pc(63) int local63 = arg2 - arg6;
		@Pc(67) int local67 = arg6 + arg5;
		for (@Pc(69) int local69 = local18; local69 <= local14; local69++) {
			@Pc(75) int[] local75 = Static442.anIntArrayArray48[local69];
			Static238.method3886(local75, local67, arg1, arg5);
			Static238.method3886(local75, local63, arg0, local67);
			Static238.method3886(local75, arg2, arg1, local63);
		}
	}
}
