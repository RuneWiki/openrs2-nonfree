import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Z")
	public static boolean method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static472.method6449(arg0, arg1) & Static555.method7560(arg0, arg1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
	public static int method146() {
		@Pc(16) int local16 = Static2.aClass103_1.method2088();
		if (local16 < Static423.aClass103Array1.length - 1) {
			Static2.aClass103_1 = Static423.aClass103Array1[local16 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!mw;")
	public static Class8_Sub3_Sub3 method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class111 local14 = local7.aClass111_1; local14 != null; local14 = local14.aClass111_2) {
			@Pc(18) Class8_Sub3_Sub3 local18 = local14.aClass8_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort132 == arg1 && local18.aShort131 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
	public static void method148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static367.anInt6098; local7++) {
			@Pc(13) Rectangle local13 = Class81.aRectangleArray1[local7];
			if (arg1 < local13.x + local13.width && arg3 + arg1 > local13.x && arg0 < local13.height + local13.y && local13.y < arg0 + arg2) {
				Static166.aBooleanArray5[local7] = true;
			}
		}
	}
}
