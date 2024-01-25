import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "S")
	public static short aShort34 = 205;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIIIIII)J")
	public static long method2326(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static170.aCalendar2.clear();
		Static170.aCalendar2.set(arg0, arg1, arg2, 12, 0, 0);
		return Static170.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZI)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class14_Sub3_Sub9 local16 = Static142.method2219((long) arg1, 12);
		local16.method2817();
		local16.anInt3419 = arg0;
	}
}
