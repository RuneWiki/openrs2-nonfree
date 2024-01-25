import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!dj;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "[Lclient!h;")
	public static Class86[] aClass86Array2;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!nn;")
	public static Class141 aClass141_1 = new Class141();

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
	public static void method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 < arg3 + arg0; local7++) {
			for (@Pc(11) int local11 = arg2; local11 < arg1 + arg2; local11++) {
				if (local11 >= 0 && local11 < Static92.anInt2048 && local7 >= 0 && Static290.anInt5893 > local7) {
					Static57.anIntArrayArrayArray4[arg4][local11][local7] = arg4 > 0 ? Static57.anIntArrayArrayArray4[arg4 - 1][local11][local7] - 240 : 0;
				}
			}
		}
		@Pc(102) int local102;
		if (arg2 > 0 && Static92.anInt2048 > arg2) {
			for (local102 = arg0 + 1; local102 < arg0 + arg3; local102++) {
				if (local102 >= 0 && Static290.anInt5893 > local102) {
					Static57.anIntArrayArrayArray4[arg4][arg2][local102] = Static57.anIntArrayArrayArray4[arg4][arg2 - 1][local102];
				}
			}
		}
		if (arg0 > 0 && arg0 < Static290.anInt5893) {
			for (local102 = arg2 + 1; local102 < arg2 + arg1; local102++) {
				if (local102 >= 0 && Static92.anInt2048 > local102) {
					Static57.anIntArrayArrayArray4[arg4][local102][arg0] = Static57.anIntArrayArrayArray4[arg4][local102][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || Static92.anInt2048 <= arg2 || arg0 >= Static290.anInt5893) {
			return;
		}
		if (arg4 != 0) {
			if (arg2 > 0 && Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0] != Static57.anIntArrayArrayArray4[arg4 - 1][arg2 - 1][arg0]) {
				Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static57.anIntArrayArrayArray4[arg4][arg2][arg0 - 1] != Static57.anIntArrayArrayArray4[arg4 - 1][arg2][arg0 - 1]) {
				Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && Static57.anIntArrayArrayArray4[arg4 - 1][arg2 - 1][arg0 - 1] != Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0 - 1]) {
				Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0] != 0) {
			Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static57.anIntArrayArrayArray4[arg4][arg2][arg0 - 1] != 0) {
			Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0 - 1] != 0) {
			Static57.anIntArrayArrayArray4[arg4][arg2][arg0] = Static57.anIntArrayArrayArray4[arg4][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3402(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static320.aClass4_Sub7_Sub1_3.method1237(220);
		Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0) + 1);
		Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
		Static320.aClass4_Sub7_Sub1_3.method2418(arg1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIIIII)I")
	public static int method3408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg2;
			arg2 = local14;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg3 - arg1;
		} else if (local7 == 2) {
			return 8 - arg5 - arg2;
		} else {
			return arg1;
		}
	}
}
