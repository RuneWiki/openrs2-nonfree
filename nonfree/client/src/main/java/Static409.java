import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!uu;")
	public static Class250 aClass250_98;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public static void method5640(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(10, arg0);
		local8.method1006();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!ga;I)V")
	public static void method5641(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte23 == 0) {
			arg1.anInt2199 = arg1.anInt2280;
		} else if (arg1.aByte23 == 1) {
			arg1.anInt2199 = (arg2 - arg1.anInt2216) / 2 + arg1.anInt2280;
		} else if (arg1.aByte23 == 2) {
			arg1.anInt2199 = arg2 - arg1.anInt2280 - arg1.anInt2216;
		} else if (arg1.aByte23 == 3) {
			arg1.anInt2199 = arg1.anInt2280 * arg2 >> 14;
		} else if (arg1.aByte23 == 4) {
			arg1.anInt2199 = (arg2 * arg1.anInt2280 >> 14) + (arg2 - arg1.anInt2216) / 2;
		} else {
			arg1.anInt2199 = arg2 - (arg1.anInt2280 * arg2 >> 14) - arg1.anInt2216;
		}
		if (arg1.aByte20 == 0) {
			arg1.anInt2210 = arg1.anInt2264;
		} else if (arg1.aByte20 == 1) {
			arg1.anInt2210 = arg1.anInt2264 + (arg0 - arg1.anInt2192) / 2;
		} else if (arg1.aByte20 == 2) {
			arg1.anInt2210 = arg0 - arg1.anInt2192 - arg1.anInt2264;
		} else if (arg1.aByte20 == 3) {
			arg1.anInt2210 = arg0 * arg1.anInt2264 >> 14;
		} else if (arg1.aByte20 == 4) {
			arg1.anInt2210 = (arg0 - arg1.anInt2192) / 2 + (arg1.anInt2264 * arg0 >> 14);
		} else {
			arg1.anInt2210 = arg0 - arg1.anInt2192 - (arg0 * arg1.anInt2264 >> 14);
		}
		if (!Static64.aBoolean82) {
			return;
		}
		if (Static54.method1060(arg1).anInt6593 == 0 && arg1.anInt2252 != 0) {
			return;
		}
		if (arg1.anInt2199 < 0) {
			arg1.anInt2199 = 0;
		} else if (arg1.anInt2216 + arg1.anInt2199 > arg2) {
			arg1.anInt2199 = arg2 - arg1.anInt2216;
		}
		if (arg1.anInt2210 < 0) {
			arg1.anInt2210 = 0;
			return;
		}
		if (arg1.anInt2210 + arg1.anInt2192 > arg0) {
			arg1.anInt2210 = arg0 - arg1.anInt2192;
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method5642() {
		if (Static345.anInt5823 == 2) {
			Static393.method5432(3);
		} else if (Static345.anInt5823 == 6) {
			Static393.method5432(7);
		} else if (Static345.anInt5823 == 9) {
			Static393.method5432(10);
		}
	}
}
