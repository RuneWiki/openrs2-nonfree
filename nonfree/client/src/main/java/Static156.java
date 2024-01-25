import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
	public static int anInt2887;

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)Z")
	public static boolean method2698(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2700(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 - 64;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 - 96;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)I")
	public static int method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static111.anInt2224 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg2 - Static201.anInt205;
		@Pc(29) int local29 = arg0 - Static201.anInt198;
		for (@Pc(34) Class2_Sub35 local34 = (Class2_Sub35) Static201.aClass249_3.method6527(); local34 != null; local34 = (Class2_Sub35) Static201.aClass249_3.method6525()) {
			if (arg1 == local34.anInt6264) {
				@Pc(43) int local43 = local34.anInt6261;
				@Pc(46) int local46 = local34.anInt6260;
				@Pc(58) int local58 = local46 + Static201.anInt198 | local43 - -Static201.anInt205 << 14;
				@Pc(78) int local78 = (local29 - local46) * (-local46 + local29) + (local24 - local43) * (-local43 + local24);
				if (local17 < 0 || local78 < local19) {
					local19 = local78;
					local17 = local58;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILclient!waa;)V")
	public static void method2702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4 arg3) {
		@Pc(4) Class262 local4 = Static519.method7540(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub4_1 = arg3;
		}
	}
}
