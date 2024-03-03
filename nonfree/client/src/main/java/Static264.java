import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!ui;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!pp;")
	public static Class183 aClass183_3;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I", line = 16)
	public static int method4930(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Z", line = 72)
	public static boolean method4932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class41 local15 = Static334.aClass202_4.method5164(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method1523(arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!nk;IIB)V", line = 415)
	public static void method4940(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte46 == 0) {
			arg0.anInt4248 = arg0.anInt4243;
		} else if (arg0.aByte46 == 1) {
			arg0.anInt4248 = arg0.anInt4243 + (arg2 - arg0.anInt4255) / 2;
		} else if (arg0.aByte46 == 2) {
			arg0.anInt4248 = arg2 - arg0.anInt4255 - arg0.anInt4243;
		} else if (arg0.aByte46 == 3) {
			arg0.anInt4248 = arg2 * arg0.anInt4243 >> 14;
		} else if (arg0.aByte46 == 4) {
			arg0.anInt4248 = (arg0.anInt4243 * arg2 >> 14) + (arg2 - arg0.anInt4255) / 2;
		} else {
			arg0.anInt4248 = arg2 - (arg0.anInt4243 * arg2 >> 14) - arg0.anInt4255;
		}
		if (arg0.aByte45 == 0) {
			arg0.anInt4298 = arg0.anInt4235;
		} else if (arg0.aByte45 == 1) {
			arg0.anInt4298 = (arg1 - arg0.anInt4242) / 2 + arg0.anInt4235;
		} else if (arg0.aByte45 == 2) {
			arg0.anInt4298 = arg1 - arg0.anInt4235 - arg0.anInt4242;
		} else if (arg0.aByte45 == 3) {
			arg0.anInt4298 = arg0.anInt4235 * arg1 >> 14;
		} else if (arg0.aByte45 == 4) {
			arg0.anInt4298 = (arg1 * arg0.anInt4235 >> 14) + (arg1 - arg0.anInt4242) / 2;
		} else {
			arg0.anInt4298 = arg1 - arg0.anInt4242 - (arg1 * arg0.anInt4235 >> 14);
		}
		if (!Class15_Sub1.aBoolean30) {
			return;
		}
		if (Static42.method1406(arg0).anInt1756 == 0 && arg0.anInt4265 != 0) {
			return;
		}
		if (arg0.anInt4248 < 0) {
			arg0.anInt4248 = 0;
		} else if (arg0.anInt4255 + arg0.anInt4248 > arg2) {
			arg0.anInt4248 = arg2 - arg0.anInt4255;
		}
		if (arg0.anInt4298 < 0) {
			arg0.anInt4298 = 0;
			return;
		}
		if (arg0.anInt4298 + arg0.anInt4242 > arg1) {
			arg0.anInt4298 = arg1 - arg0.anInt4242;
			return;
		}
	}
}
