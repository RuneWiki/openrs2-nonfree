import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method4854(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub5_Sub11 local14 = Static188.method2688(arg0, 2);
		local14.method2667();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ug;B)Ljava/lang/String;")
	public static String method4855(@OriginalArg(0) Class1_Sub28 arg0) {
		return Static396.method5182(arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!jk;B)Lclient!jk;")
	public static Class124 method4856(@OriginalArg(0) Class124 arg0) {
		if (arg0.anInt3344 != -1) {
			return Static412.method5315(arg0.anInt3344);
		}
		@Pc(28) int local28 = arg0.anInt3348 >>> 16;
		@Pc(33) Class127 local33 = new Class127(Static94.aClass199_54);
		for (@Pc(38) Class1_Sub14 local38 = (Class1_Sub14) local33.method2836(); local38 != null; local38 = (Class1_Sub14) local33.method2834()) {
			if (local28 == local38.anInt1425) {
				return Static412.method5315((int) local38.aLong230);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIII)V")
	public static void method4857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static453.aClass136_Sub1_1.anInt4442 != 0 && arg0 != 0 && Static234.anInt4174 < 50 && arg4 != -1) {
			Static249.aClass266Array1[Static234.anInt4174++] = new Class266((byte) 1, arg4, arg0, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!jk;II)V")
	public static void method4858(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte46 == 0) {
			arg0.anInt3370 = arg0.anInt3397;
		} else if (arg0.aByte46 == 1) {
			arg0.anInt3370 = (arg1 - arg0.anInt3376) / 2 + arg0.anInt3397;
		} else if (arg0.aByte46 == 2) {
			arg0.anInt3370 = arg1 - arg0.anInt3376 - arg0.anInt3397;
		} else if (arg0.aByte46 == 3) {
			arg0.anInt3370 = arg0.anInt3397 * arg1 >> 14;
		} else if (arg0.aByte46 == 4) {
			arg0.anInt3370 = (arg1 - arg0.anInt3376) / 2 + (arg0.anInt3397 * arg1 >> 14);
		} else {
			arg0.anInt3370 = arg1 - arg0.anInt3376 - (arg0.anInt3397 * arg1 >> 14);
		}
		if (arg0.aByte49 == 0) {
			arg0.anInt3414 = arg0.anInt3385;
		} else if (arg0.aByte49 == 1) {
			arg0.anInt3414 = arg0.anInt3385 + (arg2 - arg0.anInt3356) / 2;
		} else if (arg0.aByte49 == 2) {
			arg0.anInt3414 = arg2 - arg0.anInt3356 - arg0.anInt3385;
		} else if (arg0.aByte49 == 3) {
			arg0.anInt3414 = arg0.anInt3385 * arg2 >> 14;
		} else if (arg0.aByte49 == 4) {
			arg0.anInt3414 = (arg0.anInt3385 * arg2 >> 14) + (arg2 - arg0.anInt3356) / 2;
		} else {
			arg0.anInt3414 = arg2 - (arg2 * arg0.anInt3385 >> 14) - arg0.anInt3356;
		}
		if (!Static239.aBoolean665) {
			return;
		}
		if (Static55.method970(arg0).anInt3464 == 0 && arg0.anInt3417 != 0) {
			return;
		}
		if (arg0.anInt3370 < 0) {
			arg0.anInt3370 = 0;
		} else if (arg1 < arg0.anInt3376 + arg0.anInt3370) {
			arg0.anInt3370 = arg1 - arg0.anInt3376;
		}
		if (arg0.anInt3414 < 0) {
			arg0.anInt3414 = 0;
			return;
		}
		if (arg0.anInt3356 + arg0.anInt3414 > arg2) {
			arg0.anInt3414 = arg2 - arg0.anInt3356;
			return;
		}
	}
}
