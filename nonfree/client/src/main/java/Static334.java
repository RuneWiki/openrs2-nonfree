import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt5990 = -1;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_79 = new Class208(38, -1);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg0);
		@Pc(17) int local17 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg3);
		@Pc(23) int local23 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg6);
		@Pc(29) int local29 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2);
		@Pc(37) int local37 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg5 + arg0);
		@Pc(46) int local46 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg3 - arg5);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static215.method3035(local23, local29, Static46.anIntArrayArray24[local48], arg4);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static215.method3035(local23, local29, Static46.anIntArrayArray24[local76], arg4);
		}
		@Pc(98) int local98 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg6 + arg5);
		@Pc(107) int local107 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2 - arg5);
		for (@Pc(109) int local109 = local37; local109 <= local46; local109++) {
			@Pc(115) int[] local115 = Static46.anIntArrayArray24[local109];
			Static215.method3035(local23, local98, local115, arg4);
			Static215.method3035(local98, local107, local115, arg1);
			Static215.method3035(local107, local29, local115, arg4);
		}
	}
}
