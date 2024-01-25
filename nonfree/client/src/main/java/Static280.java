import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	public static int anInt5132;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!bu;")
	public static Class32 aClass32_65;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)I")
	public static int method3939() {
		@Pc(13) Class126 local13 = Static219.aClass126_25;
		synchronized (Static219.aClass126_25) {
			return Static219.aClass126_25.method3142();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg3 + arg4;
		@Pc(17) int local17 = arg5 - arg3;
		for (@Pc(19) int local19 = arg4; local19 < local13; local19++) {
			Static412.method5293(Static262.anIntArrayArray31[local19], arg1, arg2, arg0);
		}
		@Pc(42) int local42 = arg0 - arg3;
		@Pc(47) int local47 = arg2 + arg3;
		for (@Pc(49) int local49 = arg5; local49 > local17; local49--) {
			Static412.method5293(Static262.anIntArrayArray31[local49], arg1, arg2, arg0);
		}
		for (@Pc(69) int local69 = local13; local69 <= local17; local69++) {
			@Pc(75) int[] local75 = Static262.anIntArrayArray31[local69];
			Static412.method5293(local75, arg1, arg2, local47);
			Static412.method5293(local75, arg1, local42, arg0);
		}
	}
}
