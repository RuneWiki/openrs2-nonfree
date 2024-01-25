import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt2706;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int anInt2711;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Z")
	public static boolean aBoolean208 = true;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z")
	public static boolean method2163() {
		return Static384.anInt7556 > 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[F)[F")
	public static float[] method2167(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(13) float[] local13 = new float[arg0];
		Static599.method3058(arg1, 0, local13, 0, arg0);
		return local13;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method2169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(14) int local14;
		if (local9 == 0) {
			local14 = 0;
		} else {
			local14 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg0 + 7) / 8);
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local14;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	public static void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static173.method2881(local7.aClass21_Sub1_Sub5_1);
			if (local7.aClass21_Sub1_Sub5_1 != null) {
				local7.aClass21_Sub1_Sub5_1 = null;
			}
		}
	}
}
