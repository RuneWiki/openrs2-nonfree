import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
	public static boolean aBoolean414;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	public static int anInt5787;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
	public static int[] anIntArray598 = new int[50];

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
	public static int anInt5783 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method4750() {
		Static305.method4915();
		Static312.method4993();
		Static123.method2048();
		Static202.method3346();
		Static255.method4309();
		Static204.method3392();
		Static151.method2559();
		Static312.method4992();
		Static163.method2719();
		Static115.method1875();
		Static188.method3141();
		Static50.method792();
		Static23.method364();
		Static262.method4359();
		Static220.method4259();
		Static5.method102();
		Static14.method225();
		Static9.method152();
		Static181.method3042();
		Static150.method2550();
		Static150.method2553();
		Static191.aClass98_31.method2565(5);
		Static132.aClass98_17.method2565(5);
		Static256.aClass98_42.method2565(5);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)I")
	public static int method4751(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIII)V")
	public static void method4753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		@Pc(18) int local18;
		for (local7 = arg3; local7 <= arg0 + arg3; local7++) {
			for (local18 = arg2; local18 <= arg4 + arg2; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static188.aByteArrayArrayArray17[arg1][local18][local7] = 127;
				}
			}
		}
		for (local7 = arg3; local7 < arg0 + arg3; local7++) {
			for (local18 = arg2; local18 < arg4 + arg2; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static256.anIntArrayArrayArray14[arg1][local18][local7] = arg1 <= 0 ? 0 : Static256.anIntArrayArrayArray14[arg1 - 1][local18][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local7 = arg3 + 1; local7 < arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static256.anIntArrayArrayArray14[arg1][arg2][local7] = Static256.anIntArrayArrayArray14[arg1][arg2 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local7 = arg2 + 1; local7 < arg4 + arg2; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static256.anIntArrayArrayArray14[arg1][local7][arg3] = Static256.anIntArrayArrayArray14[arg1][local7][arg3 - 1];
				}
			}
		}
		if (arg2 < 0 || arg3 < 0 || arg2 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 > 0 && Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3] != 0) {
				Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3];
			} else if (arg3 > 0 && Static256.anIntArrayArrayArray14[arg1][arg2][arg3 - 1] != 0) {
				Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2][arg3 - 1];
			} else if (arg2 > 0 && arg3 > 0 && Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3 - 1] != 0) {
				Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3 - 1];
			}
		} else if (arg2 > 0 && Static256.anIntArrayArrayArray14[arg1 - 1][arg2 - 1][arg3] != Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3]) {
			Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3];
		} else if (arg3 > 0 && Static256.anIntArrayArrayArray14[arg1][arg2][arg3 - 1] != Static256.anIntArrayArrayArray14[arg1 - 1][arg2][arg3 - 1]) {
			Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2][arg3 - 1];
		} else if (arg2 > 0 && arg3 > 0 && Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3 - 1] != Static256.anIntArrayArrayArray14[arg1 - 1][arg2 - 1][arg3 - 1]) {
			Static256.anIntArrayArrayArray14[arg1][arg2][arg3] = Static256.anIntArrayArrayArray14[arg1][arg2 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	public static void method4754(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static204.anInt4020 = arg0;
		Static111.anInt2039 = arg1;
		Static245.anInt6027 = 0;
		Static175.anInt3267 = 0;
	}
}
