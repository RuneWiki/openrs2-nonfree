import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
	public static void method476() {
		Static80.aClass157_13.method4033();
		Static81.aClass157_15.method4033();
		Static163.aClass157_31.method4033();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
	public static void method477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg2; local7++) {
			Static25.method486(Static275.anIntArrayArray37[local7], arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IC)Z")
	public static boolean method478(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)V")
	public static void method479() {
		Static222.aClass56Array2 = null;
		Static84.method1516(Static303.anInt5868, Static120.anInt2649, 0, -1, 0, 0, Static60.anInt1510, 0);
		if (Static222.aClass56Array2 != null) {
			Static208.method3498(0, Static159.anInt3553, Static242.anInt4827, 0, Static222.aClass56Array2, -1412584499, Static120.anInt2649, Static192.aClass56_18.anInt2090, Static60.anInt1510);
			Static222.aClass56Array2 = null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)V")
	public static void method480(@OriginalArg(0) int arg0) {
		Static232.anIntArray459 = new int[arg0];
		Static9.anIntArray301 = new int[arg0];
		Static154.anIntArray350 = new int[arg0];
		Static173.anIntArray374 = new int[arg0];
		Static108.anIntArray215 = new int[arg0];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(JI)V")
	public static void method481(@OriginalArg(0) long arg0) {
		if (!Static41.aBoolean65) {
			Static148.aFloat33 += (float) arg0 * Static231.aFloat46 / 40.0F;
			Static239.aFloat51 += (float) arg0 * Static102.aFloat11 / 40.0F;
		}
		@Pc(35) int local35 = Static253.anInt4974 + Static22.aClass15_Sub2_Sub2_1.anInt5358;
		@Pc(40) int local40 = Static63.anInt1541 + Static22.aClass15_Sub2_Sub2_1.anInt5371;
		if (Static254.anInt4978 - local35 < -500 || Static254.anInt4978 - local35 > 500 || Static101.anInt2397 - local40 < -500 || Static101.anInt2397 - local40 > 500) {
			Static254.anInt4978 = local35;
			Static101.anInt2397 = local40;
		}
		@Pc(81) int local81;
		@Pc(89) int local89;
		if (Static254.anInt4978 != local35) {
			local81 = local35 - Static254.anInt4978;
			local89 = (int) (arg0 * (long) local81 / 320L);
			if (local81 > 0) {
				if (local89 == 0) {
					local89 = 1;
				} else if (local89 > local81) {
					local89 = local81;
				}
			} else if (local89 == 0) {
				local89 = -1;
			} else if (local81 > local89) {
				local89 = local81;
			}
			Static254.anInt4978 += local89;
		}
		if (local40 != Static101.anInt2397) {
			local81 = local40 - Static101.anInt2397;
			local89 = (int) ((long) local81 * arg0 / 320L);
			if (local81 <= 0) {
				if (local89 == 0) {
					local89 = -1;
				} else if (local81 > local89) {
					local89 = local81;
				}
			} else if (local89 == 0) {
				local89 = 1;
			} else if (local81 < local89) {
				local89 = local81;
			}
			Static101.anInt2397 += local89;
		}
		Static279.method4342();
	}
}
