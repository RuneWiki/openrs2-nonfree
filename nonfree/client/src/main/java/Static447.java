import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!r;IIII)V")
	public static void method5628(@OriginalArg(0) Class16_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Class151 local11 = arg0.method4757();
		@Pc(20) int local20 = arg0.anInt6063 - arg0.aClass35_7.anInt858 & 0x3FFF;
		if (arg1 == -1) {
			if (local20 != 0 || arg0.anInt6028 > 25) {
				arg0.aBoolean562 = false;
				if (arg3 < 0 && local11.anInt4663 != -1) {
					arg0.anInt6076 = local11.anInt4663;
				} else if (arg3 <= 0 || local11.anInt4689 == -1) {
					arg0.anInt6076 = local11.anInt4697;
				} else {
					arg0.anInt6076 = local11.anInt4689;
				}
			} else if (!arg0.aBoolean562 || !local11.method3642(arg0.anInt6076)) {
				arg0.anInt6076 = local11.method3637();
				arg0.aBoolean562 = arg0.anInt6076 != -1;
			}
		} else if (arg0.anInt6034 != -1 && (local20 >= 10240 || local20 <= 2048)) {
			@Pc(117) int local117 = Static379.anIntArray489[arg2] - arg0.aClass35_7.anInt858 & 0x3FFF;
			arg0.aBoolean562 = false;
			if (arg1 == 2 && local11.anInt4669 != -1) {
				if (local117 > 2048 && local117 <= 6144 && local11.anInt4665 != -1) {
					arg0.anInt6076 = local11.anInt4665;
				} else if (local117 >= 10240 && local117 < 14336 && local11.anInt4686 != -1) {
					arg0.anInt6076 = local11.anInt4686;
				} else if (local117 <= 6144 || local117 >= 10240 || local11.anInt4656 == -1) {
					arg0.anInt6076 = local11.anInt4669;
				} else {
					arg0.anInt6076 = local11.anInt4656;
				}
			} else if (arg1 == 0 && local11.anInt4667 != -1) {
				if (local117 > 2048 && local117 <= 6144 && local11.anInt4688 != -1) {
					arg0.anInt6076 = local11.anInt4688;
				} else if (local117 >= 10240 && local117 < 14336 && local11.anInt4675 != -1) {
					arg0.anInt6076 = local11.anInt4675;
				} else if (local117 <= 6144 || local117 >= 10240 || local11.anInt4681 == -1) {
					arg0.anInt6076 = local11.anInt4667;
				} else {
					arg0.anInt6076 = local11.anInt4681;
				}
			} else if (local117 > 2048 && local117 <= 6144 && local11.anInt4658 != -1) {
				arg0.anInt6076 = local11.anInt4658;
			} else if (local117 >= 10240 && local117 < 14336 && local11.anInt4680 != -1) {
				arg0.anInt6076 = local11.anInt4680;
			} else if (local117 <= 6144 || local117 >= 10240 || local11.anInt4701 == -1) {
				arg0.anInt6076 = local11.anInt4697;
			} else {
				arg0.anInt6076 = local11.anInt4701;
			}
		} else if (local20 == 0 && arg0.anInt6028 <= 25) {
			arg0.aBoolean562 = false;
			if (arg1 == 2 && local11.anInt4669 != -1) {
				arg0.anInt6076 = local11.anInt4669;
			} else if (arg1 == 0 && local11.anInt4667 != -1) {
				arg0.anInt6076 = local11.anInt4667;
			} else {
				arg0.anInt6076 = local11.anInt4697;
			}
		} else {
			arg0.aBoolean562 = false;
			if (arg1 == 2 && local11.anInt4669 != -1) {
				if (arg3 < 0 && local11.anInt4687 != -1) {
					arg0.anInt6076 = local11.anInt4687;
				} else if (arg3 <= 0 || local11.anInt4678 == -1) {
					arg0.anInt6076 = local11.anInt4669;
				} else {
					arg0.anInt6076 = local11.anInt4678;
				}
			} else if (arg1 == 0 && local11.anInt4667 != -1) {
				if (arg3 < 0 && local11.anInt4657 != -1) {
					arg0.anInt6076 = local11.anInt4657;
				} else if (arg3 <= 0 || local11.anInt4672 == -1) {
					arg0.anInt6076 = local11.anInt4667;
				} else {
					arg0.anInt6076 = local11.anInt4672;
				}
			} else if (arg3 < 0 && local11.anInt4668 != -1) {
				arg0.anInt6076 = local11.anInt4668;
			} else if (arg3 <= 0 || local11.anInt4682 == -1) {
				arg0.anInt6076 = local11.anInt4697;
			} else {
				arg0.anInt6076 = local11.anInt4682;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
	public static void method5629(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class4 local9 = Static211.aClass102_18.method2705(); local9 != null; local9 = Static211.aClass102_18.method2704()) {
			if ((long) arg0 == (local9.aLong224 >> 48 & 0xFFFFL)) {
				local9.method5684();
			}
		}
	}
}
