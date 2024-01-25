import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!dh;")
	public static Class1_Sub10 aClass1_Sub10_5;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_59 = new Class242(77, 7);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static133.anInt2063 = arg2;
		Static308.anInt5111 = arg3;
		Static355.anInt5734 = arg5;
		Static116.anInt2825 = arg4;
		Static413.anInt6623 = arg1;
		Static203.anInt3767 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public static void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static259.aClass216ArrayArrayArray3[0][arg1][arg2] != null && Static259.aClass216ArrayArrayArray3[0][arg1][arg2].aClass216_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static259.aClass216ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class216 local46 = Static259.aClass216ArrayArrayArray3[local22][arg1][arg2] = new Class216(local22, arg1, arg2);
				if (local20) {
					local46.aByte79++;
				}
			}
		}
	}
}
