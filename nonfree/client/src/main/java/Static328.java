import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
	public static int anInt6578;

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "J")
	public static long aLong181 = 0L;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)V")
	public static void method5503(@OriginalArg(0) int arg0) {
		if (Static453.anInt8163 == 0) {
			Static623.aClass6_Sub4_Sub2_4.method4807(arg0);
		} else {
			Static619.anInt7284 = arg0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method5504(@OriginalArg(1) Class5 arg0) {
		Static429.aClass259Array1 = new Class259[Static6.anIntArray10.length];
		for (@Pc(15) int local15 = 0; local15 < Static6.anIntArray10.length; local15++) {
			@Pc(21) int local21 = Static6.anIntArray10[local15];
			@Pc(26) Class213 local26 = Static50.method1622(Static379.aClass223_80, local21);
			@Pc(34) Class34 local34 = arg0.method6167(local26, Static655.method7891(Static347.aClass223_72, local21));
			Static429.aClass259Array1[local15] = new Class259(local34, local26);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZIIIIII)V")
	public static void method5505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg2);
		@Pc(17) int local17 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg5);
		@Pc(23) int local23 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg0);
		@Pc(29) int local29 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4);
		@Pc(37) int local37 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg3 + arg2);
		@Pc(46) int local46 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg5 - arg3);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static571.method7990(arg1, Static173.anIntArrayArray15[local48], local23, local29);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static571.method7990(arg1, Static173.anIntArrayArray15[local64], local23, local29);
		}
		@Pc(86) int local86 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg3 + arg0);
		@Pc(94) int local94 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - arg3);
		for (@Pc(96) int local96 = local37; local96 <= local46; local96++) {
			@Pc(102) int[] local102 = Static173.anIntArrayArray15[local96];
			Static571.method7990(arg1, local102, local23, local86);
			Static571.method7990(arg1, local102, local94, local29);
		}
	}
}
