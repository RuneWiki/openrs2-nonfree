import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!eka", name = "f", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "Lclient!hg;")
	public static Class153 aClass153_3;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIIIII)V")
	public static void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13 = Static67.method9535(Static617.anInt9501, arg1, Static519.anInt8267);
		@Pc(19) int local19 = Static67.method9535(Static617.anInt9501, arg0, Static519.anInt8267);
		@Pc(34) int local34 = Static67.method9535(Static8.anInt99, arg3, Static14.anInt206);
		@Pc(40) int local40 = Static67.method9535(Static8.anInt99, arg4, Static14.anInt206);
		for (@Pc(42) int local42 = local13; local42 <= local19; local42++) {
			Static494.method7075(local34, arg2, local40, Static449.anIntArrayArray48[local42], 18601);
		}
	}
}
