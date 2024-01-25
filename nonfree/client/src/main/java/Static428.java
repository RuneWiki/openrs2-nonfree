import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
	public static int anInt7479;

	@OriginalMember(owner = "client!pea", name = "t", descriptor = "[Lclient!oj;")
	public static Class252[] aClass252Array1;

	@OriginalMember(owner = "client!pea", name = "l", descriptor = "[I")
	public static final int[] anIntArray449 = new int[32];

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "S")
	public static short aShort84 = 256;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIII)V")
	public static void method6534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static596.anInt9703 < arg3 || Static298.anInt5919 > arg1) {
			return;
		}
		@Pc(32) boolean local32;
		if (arg4 < Static474.anInt8118) {
			local32 = false;
			arg4 = Static474.anInt8118;
		} else if (arg4 > Static576.anInt9425) {
			arg4 = Static576.anInt9425;
			local32 = false;
		} else {
			local32 = true;
		}
		@Pc(59) boolean local59;
		if (Static474.anInt8118 > arg2) {
			arg2 = Static474.anInt8118;
			local59 = false;
		} else if (arg2 <= Static576.anInt9425) {
			local59 = true;
		} else {
			arg2 = Static576.anInt9425;
			local59 = false;
		}
		if (arg3 < Static298.anInt5919) {
			arg3 = Static298.anInt5919;
		} else {
			Static82.method1400(arg0, arg4, arg2, Static71.anIntArrayArray5[arg3++]);
		}
		if (Static596.anInt9703 >= arg1) {
			Static82.method1400(arg0, arg4, arg2, Static71.anIntArrayArray5[arg1--]);
		} else {
			arg1 = Static596.anInt9703;
		}
		@Pc(117) int local117;
		if (local32 && local59) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				@Pc(161) int[] local161 = Static71.anIntArrayArray5[local117];
				local161[arg4] = local161[arg2] = arg0;
			}
		} else if (local32) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				Static71.anIntArrayArray5[local117][arg4] = arg0;
			}
		} else if (local59) {
			for (local117 = arg3; local117 <= arg1; local117++) {
				Static71.anIntArrayArray5[local117][arg2] = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIILclient!uv;)V")
	public static void method6535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class344 arg2) {
		if (arg2.aByte117 == 0) {
			arg2.anInt9569 = arg2.anInt9559;
		} else if (arg2.aByte117 == 1) {
			arg2.anInt9569 = arg2.anInt9559 + (arg1 - arg2.anInt9546) / 2;
		} else if (arg2.aByte117 == 2) {
			arg2.anInt9569 = arg1 - arg2.anInt9546 - arg2.anInt9559;
		} else if (arg2.aByte117 == 3) {
			arg2.anInt9569 = arg1 * arg2.anInt9559 >> 14;
		} else if (arg2.aByte117 == 4) {
			arg2.anInt9569 = (arg2.anInt9559 * arg1 >> 14) + (arg1 - arg2.anInt9546) / 2;
		} else {
			arg2.anInt9569 = arg1 - arg2.anInt9546 - (arg2.anInt9559 * arg1 >> 14);
		}
		if (arg2.aByte114 == 0) {
			arg2.anInt9573 = arg2.anInt9596;
		} else if (arg2.aByte114 == 1) {
			arg2.anInt9573 = (arg0 - arg2.anInt9602) / 2 + arg2.anInt9596;
		} else if (arg2.aByte114 == 2) {
			arg2.anInt9573 = arg0 - arg2.anInt9596 - arg2.anInt9602;
		} else if (arg2.aByte114 == 3) {
			arg2.anInt9573 = arg0 * arg2.anInt9596 >> 14;
		} else if (arg2.aByte114 == 4) {
			arg2.anInt9573 = (arg2.anInt9596 * arg0 >> 14) + (arg0 - arg2.anInt9602) / 2;
		} else {
			arg2.anInt9573 = arg0 - arg2.anInt9602 - (arg0 * arg2.anInt9596 >> 14);
		}
		if (!Static349.aBoolean768 || Static76.method1311(arg2).anInt9447 == 0 && arg2.anInt9554 != 0) {
			return;
		}
		if (arg2.anInt9569 < 0) {
			arg2.anInt9569 = 0;
		} else if (arg2.anInt9546 + arg2.anInt9569 > arg1) {
			arg2.anInt9569 = arg1 - arg2.anInt9546;
		}
		if (arg2.anInt9573 < 0) {
			arg2.anInt9573 = 0;
		} else if (arg0 < arg2.anInt9573 + arg2.anInt9602) {
			arg2.anInt9573 = arg0 - arg2.anInt9602;
			return;
		}
	}
}
