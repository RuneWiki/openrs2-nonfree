import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!no", name = "x", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!qj;IIII)Lclient!ar;")
	public static Class23_Sub1_Sub1 method5436(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aBoolean597 || Static19.method380(arg2) && Static19.method380(arg1)) {
			return new Class23_Sub1_Sub1(arg0, 3553, 6408, arg2, arg1);
		} else if (arg0.aBoolean586) {
			return new Class23_Sub1_Sub1(arg0, 34037, 6408, arg2, arg1);
		} else {
			return new Class23_Sub1_Sub1(arg0, 6408, arg2, arg1, Static89.method7259(arg2), Static89.method7259(arg1));
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BIIII)V")
	public static void method5437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(28) int local28 = Static489.method6853(arg2 + arg0, Static553.anInt9074, Static249.anInt4668);
		@Pc(37) int local37 = Static489.method6853(arg2 - arg0, Static553.anInt9074, Static249.anInt4668);
		Static276.method3099(local37, Static582.anIntArrayArray69[arg1], arg3, local28);
		while (local14 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(66) int local66;
			@Pc(70) int local70;
			@Pc(89) int local89;
			@Pc(97) int local97;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local66 = arg1 - local14;
				local70 = local14 + arg1;
				if (Static326.anInt6028 <= local70 && Static80.anInt1738 >= local66) {
					local89 = Static489.method6853(arg2 + local7, Static553.anInt9074, Static249.anInt4668);
					local97 = Static489.method6853(arg2 - local7, Static553.anInt9074, Static249.anInt4668);
					if (local70 <= Static80.anInt1738) {
						Static276.method3099(local97, Static582.anIntArrayArray69[local70], arg3, local89);
					}
					if (Static326.anInt6028 <= local66) {
						Static276.method3099(local97, Static582.anIntArrayArray69[local66], arg3, local89);
					}
				}
			}
			local7++;
			local66 = arg1 - local7;
			local70 = local7 + arg1;
			if (Static326.anInt6028 <= local70 && Static80.anInt1738 >= local66) {
				local89 = Static489.method6853(local14 + arg2, Static553.anInt9074, Static249.anInt4668);
				local97 = Static489.method6853(arg2 - local14, Static553.anInt9074, Static249.anInt4668);
				if (local70 <= Static80.anInt1738) {
					Static276.method3099(local97, Static582.anIntArrayArray69[local70], arg3, local89);
				}
				if (Static326.anInt6028 <= local66) {
					Static276.method3099(local97, Static582.anIntArrayArray69[local66], arg3, local89);
				}
			}
		}
	}
}
