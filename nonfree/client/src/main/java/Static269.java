import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
	public static int anInt4605;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "J")
	public static long aLong146 = -1L;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_14 = new Class175(7, 15);

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public static int anInt4608 = 0;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z")
	public static boolean method4104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIII)V")
	public static void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg3);
		@Pc(17) int local17 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg4);
		@Pc(23) int local23 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2);
		@Pc(29) int local29 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5);
		@Pc(37) int local37 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg0 + arg3);
		@Pc(46) int local46 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg4 - arg0);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static73.method1404(Static347.anIntArrayArray54[local48], local29, arg1, local23);
		}
		for (@Pc(66) int local66 = local17; local66 > local46; local66--) {
			Static73.method1404(Static347.anIntArrayArray54[local66], local29, arg1, local23);
		}
		@Pc(104) int local104 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg2 + arg0);
		@Pc(113) int local113 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5 - arg0);
		for (@Pc(115) int local115 = local37; local115 <= local46; local115++) {
			@Pc(121) int[] local121 = Static347.anIntArrayArray54[local115];
			Static73.method1404(local121, local104, arg1, local23);
			Static73.method1404(local121, local29, arg1, local113);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!lt;)I")
	public static int method4106(@OriginalArg(1) Class158 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3686(Static360.anInt6052)) {
			local10++;
		}
		if (arg0.method3686(Static117.anInt2047)) {
			local10++;
		}
		return local10;
	}
}
