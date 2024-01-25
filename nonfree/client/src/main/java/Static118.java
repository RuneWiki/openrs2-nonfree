import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!en", name = "r", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_39 = new Class45(67, 12);

	@OriginalMember(owner = "client!en", name = "K", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[IIII)V")
	public static void method2461(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg1 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg3) {
			@Pc(15) int local15 = arg3 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg3 = local45 + 1;
			arg0[arg3] = arg2;
		}
		while (local7 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!sg;II)V")
	public static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub46 arg2, @OriginalArg(3) int arg3) {
		@Pc(20) long local20 = (long) (arg1 << 14 | arg3 << 28 | arg0);
		@Pc(26) Class12_Sub28 local26 = (Class12_Sub28) Static295.aClass68_45.method1917(local20);
		if (local26 == null) {
			local26 = new Class12_Sub28();
			Static295.aClass68_45.method1916(local26, local20);
			local26.aClass73_42.method2012(arg2);
			return;
		}
		@Pc(51) Class56 local51 = Static150.aClass254_2.method6340(arg2.anInt8179);
		@Pc(54) int local54 = local51.anInt1669;
		if (local51.anInt1661 == 1) {
			local54 *= arg2.anInt8181 + 1;
		}
		for (@Pc(71) Class12_Sub46 local71 = (Class12_Sub46) local26.aClass73_42.method2005(); local71 != null; local71 = (Class12_Sub46) local26.aClass73_42.method2009()) {
			local51 = Static150.aClass254_2.method6340(local71.anInt8179);
			@Pc(82) int local82 = local51.anInt1669;
			if (local51.anInt1661 == 1) {
				local82 *= local71.anInt8181 + 1;
			}
			if (local82 < local54) {
				Static258.method4393(local71, arg2);
				return;
			}
		}
		local26.aClass73_42.method2012(arg2);
	}
}
