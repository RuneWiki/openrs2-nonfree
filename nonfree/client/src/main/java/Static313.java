import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "[[[Lclient!nj;")
	public static Class206[][][] aClass206ArrayArrayArray2;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public static int anInt5978 = -1;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Lclient!uj;")
	public static Class47_Sub5 method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = aClass206ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub5_1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIBIIZ)V")
	public static void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static404.anInt9256 = arg0;
		Static4.anInt95 = arg2;
		Static413.anInt7200 = arg1;
		Static56.anInt1561 = arg4;
		Static19.anInt866 = arg3;
		if (arg5 && Static19.anInt866 >= 100) {
			Static308.anInt5918 = Static404.anInt9256 * 128 + 64;
			Static347.anInt6404 = Static413.anInt7200 * 128 + 64;
			Static520.anInt8842 = Static74.method1954(Static245.anInt4747, Static347.anInt6404, Static308.anInt5918) - Static56.anInt1561;
		}
		Static464.anInt8003 = 2;
	}
}
