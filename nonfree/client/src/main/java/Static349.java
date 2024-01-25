import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	public static int anInt6708;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IB)I")
	public static int method5816(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local21 * local35 >> 12;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIILclient!ps;)V")
	public static void method5817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		if (arg2.aByte66 == 0) {
			arg2.anInt5012 = arg2.anInt4957;
		} else if (arg2.aByte66 == 1) {
			arg2.anInt5012 = arg2.anInt4957 + (arg0 - arg2.anInt4991) / 2;
		} else if (arg2.aByte66 == 2) {
			arg2.anInt5012 = arg0 - arg2.anInt4957 - arg2.anInt4991;
		} else if (arg2.aByte66 == 3) {
			arg2.anInt5012 = arg0 * arg2.anInt4957 >> 14;
		} else if (arg2.aByte66 == 4) {
			arg2.anInt5012 = (arg2.anInt4957 * arg0 >> 14) + (arg0 - arg2.anInt4991) / 2;
		} else {
			arg2.anInt5012 = arg0 - arg2.anInt4991 - (arg0 * arg2.anInt4957 >> 14);
		}
		if (arg2.aByte67 == 0) {
			arg2.anInt4993 = arg2.anInt4946;
		} else if (arg2.aByte67 == 1) {
			arg2.anInt4993 = (arg1 - arg2.anInt4935) / 2 + arg2.anInt4946;
		} else if (arg2.aByte67 == 2) {
			arg2.anInt4993 = arg1 - arg2.anInt4946 - arg2.anInt4935;
		} else if (arg2.aByte67 == 3) {
			arg2.anInt4993 = arg1 * arg2.anInt4946 >> 14;
		} else if (arg2.aByte67 == 4) {
			arg2.anInt4993 = (arg2.anInt4946 * arg1 >> 14) + (arg1 - arg2.anInt4935) / 2;
		} else {
			arg2.anInt4993 = arg1 - arg2.anInt4935 - (arg1 * arg2.anInt4946 >> 14);
		}
		if (!Static173.aBoolean279) {
			return;
		}
		if (Static40.method857(arg2).anInt1311 == 0 && arg2.anInt4934 != 0) {
			return;
		}
		if (arg2.anInt4993 < 0) {
			arg2.anInt4993 = 0;
		} else if (arg1 < arg2.anInt4993 + arg2.anInt4935) {
			arg2.anInt4993 = arg1 - arg2.anInt4935;
		}
		if (arg2.anInt5012 < 0) {
			arg2.anInt5012 = 0;
			return;
		}
		if (arg2.anInt5012 + arg2.anInt4991 > arg0) {
			arg2.anInt5012 = arg0 - arg2.anInt4991;
			return;
		}
	}
}
