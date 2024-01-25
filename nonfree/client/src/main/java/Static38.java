import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
	public static final int[] anIntArray46 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method751() {
		Static101.aClass198_251.method5209();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!lf;)V")
	public static void method752(@OriginalArg(1) Class4_Sub11 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static210.anInt4363; local3++) {
			@Pc(9) int local9 = arg0.method3457();
			@Pc(13) int local13 = arg0.method3401();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static223.aClass10_Sub1Array2[local9] != null) {
				Static223.aClass10_Sub1Array2[local9].anInt264 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
	public static void method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static215.anInt4410 == 1) {
			Static55.aClass58Array28[Static247.anInt5050 / 100].method4269(Static116.anInt2759 - 8, Static107.anInt6417 - 8);
		}
		if (Static215.anInt4410 == 2) {
			Static55.aClass58Array28[Static247.anInt5050 / 100 + 4].method4269(Static116.anInt2759 - 8, Static107.anInt6417 + -8);
		}
		Static25.method405();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg0; local13 <= arg4; local13++) {
			for (@Pc(17) int local17 = arg2; local17 <= arg3; local17++) {
				if (Static293.anIntArrayArray119[local13][local17] == arg1 && Static101.anIntArrayArray185[local13][local17] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
