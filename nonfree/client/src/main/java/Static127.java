import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!es", name = "S", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!es", name = "Q", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_53 = new Class319(38, 7);

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIZIIII)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static468.method6610(arg2, Static126.anInt6658, Static494.anInt8295);
		@Pc(17) int local17 = Static468.method6610(arg1, Static126.anInt6658, Static494.anInt8295);
		@Pc(23) int local23 = Static468.method6610(arg6, Static487.anInt8210, Static278.anInt5111);
		@Pc(29) int local29 = Static468.method6610(arg3, Static487.anInt8210, Static278.anInt5111);
		@Pc(37) int local37 = Static468.method6610(arg5 + arg2, Static126.anInt6658, Static494.anInt8295);
		@Pc(46) int local46 = Static468.method6610(arg1 - arg5, Static126.anInt6658, Static494.anInt8295);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static250.method4000(local29, Static478.anIntArrayArray51[local48], local23, arg4);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static250.method4000(local29, Static478.anIntArrayArray51[local68], local23, arg4);
		}
		@Pc(99) int local99 = Static468.method6610(arg6 + arg5, Static487.anInt8210, Static278.anInt5111);
		@Pc(107) int local107 = Static468.method6610(arg3 - arg5, Static487.anInt8210, Static278.anInt5111);
		for (@Pc(109) int local109 = local37; local109 <= local46; local109++) {
			@Pc(115) int[] local115 = Static478.anIntArrayArray51[local109];
			Static250.method4000(local99, local115, local23, arg4);
			Static250.method4000(local107, local115, local99, arg0);
			Static250.method4000(local29, local115, local107, arg4);
		}
	}
}
