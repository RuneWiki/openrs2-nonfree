import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mea", name = "H", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!mea", name = "L", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)Z")
	public static boolean method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg0; local16++) {
				if (arg4 == Static657.anIntArrayArray109[local12][local16] && Static470.anIntArrayArray79[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)Lclient!tc;")
	public static Class23_Sub2_Sub5 method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass23_Sub2_Sub5_1;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5417(@OriginalArg(1) String arg0) {
		return Static135.method2284(arg0);
	}
}
