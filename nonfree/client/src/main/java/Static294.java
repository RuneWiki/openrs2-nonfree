import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	public static final int[] anIntArray405 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public static int anInt5334 = 0;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_31 = new Class10(4);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	public static int method4658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static520.method6922(arg1 + 91923, 4, arg0 + 45365) + (Static520.method6922(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static520.method6922(arg1, 1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
	public static void method4659() {
		Static409.aClass130_38.method3541();
		Static474.anInt7707 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I")
	public static int method4660() {
		if (Static311.aFrame2 == null) {
			return Static200.aBoolean316 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBII)Z")
	public static boolean method4661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static511.aClass109_6.method7095(arg1, arg0, arg2, Static82.anIntArray139);
		@Pc(18) int local18 = Static82.anIntArray139[2];
		if (local18 < 50) {
			return false;
		} else {
			Static82.anIntArray139[0] = Static35.anInt839 + Static217.anInt4277 * Static82.anIntArray139[0] / local18;
			Static82.anIntArray139[2] = local18;
			Static82.anIntArray139[1] = Static82.anIntArray139[1] * Static566.anInt9122 / local18 + Static449.anInt7389;
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBLclient!lk;)V")
	public static void method4662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class203 arg2) {
		if (arg2.aByte66 == 0) {
			arg2.anInt5527 = arg2.anInt5509;
		} else if (arg2.aByte66 == 1) {
			arg2.anInt5527 = (arg0 - arg2.anInt5513) / 2 + arg2.anInt5509;
		} else if (arg2.aByte66 == 2) {
			arg2.anInt5527 = arg0 - arg2.anInt5509 - arg2.anInt5513;
		} else if (arg2.aByte66 == 3) {
			arg2.anInt5527 = arg0 * arg2.anInt5509 >> 14;
		} else if (arg2.aByte66 == 4) {
			arg2.anInt5527 = (arg0 * arg2.anInt5509 >> 14) + (arg0 - arg2.anInt5513) / 2;
		} else {
			arg2.anInt5527 = arg0 - arg2.anInt5513 - (arg0 * arg2.anInt5509 >> 14);
		}
		if (arg2.aByte63 == 0) {
			arg2.anInt5440 = arg2.anInt5517;
		} else if (arg2.aByte63 == 1) {
			arg2.anInt5440 = arg2.anInt5517 + (arg1 - arg2.anInt5476) / 2;
		} else if (arg2.aByte63 == 2) {
			arg2.anInt5440 = arg1 - arg2.anInt5517 - arg2.anInt5476;
		} else if (arg2.aByte63 == 3) {
			arg2.anInt5440 = arg1 * arg2.anInt5517 >> 14;
		} else if (arg2.aByte63 == 4) {
			arg2.anInt5440 = (arg1 - arg2.anInt5476) / 2 + (arg2.anInt5517 * arg1 >> 14);
		} else {
			arg2.anInt5440 = arg1 - (arg1 * arg2.anInt5517 >> 14) - arg2.anInt5476;
		}
		if (!Static393.aBoolean543 || Static69.method1651(arg2).anInt730 == 0 && arg2.anInt5473 != 0) {
			return;
		}
		if (arg2.anInt5440 < 0) {
			arg2.anInt5440 = 0;
		} else if (arg2.anInt5440 + arg2.anInt5476 > arg1) {
			arg2.anInt5440 = arg1 - arg2.anInt5476;
		}
		if (arg2.anInt5527 < 0) {
			arg2.anInt5527 = 0;
		} else if (arg0 < arg2.anInt5527 + arg2.anInt5513) {
			arg2.anInt5527 = arg0 - arg2.anInt5513;
			return;
		}
	}
}
