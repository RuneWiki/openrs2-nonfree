import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "Lclient!la;")
	public static Class196 aClass196_38;

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "Lclient!jk;")
	public static Class173 aClass173_2;

	@OriginalMember(owner = "client!gha", name = "r", descriptor = "J")
	public static long aLong92 = 0L;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIII)V")
	public static void method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg2);
		@Pc(17) int local17 = Static269.method4423(Static11.anInt9803, Static149.anInt2949, arg3);
		@Pc(27) int local27 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg0);
		@Pc(35) int local35 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4);
		for (@Pc(37) int local37 = local11; local37 <= local17; local37++) {
			Static611.method8472(local35, local27, Static460.anIntArrayArray53[local37], arg1);
		}
	}
}
