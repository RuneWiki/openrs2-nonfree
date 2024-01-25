import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!ek;")
	public static Class88 aClass88_3;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method6181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
	public static void method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static574.method7983(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(22) int local22 = arg4;
		@Pc(25) int local25 = -arg4;
		@Pc(27) int local27 = local15;
		@Pc(30) int local30 = -local15;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (Static55.anInt4238 <= arg3 && Static292.anInt4921 >= arg3) {
			@Pc(48) int[] local48 = Static173.anIntArrayArray15[arg3];
			local57 = Static154.method2176(arg0 - arg4, Static153.anInt2554, Static502.anInt8456);
			local66 = Static154.method2176(arg0 + arg4, Static153.anInt2554, Static502.anInt8456);
			local75 = Static154.method2176(arg0 - local15, Static153.anInt2554, Static502.anInt8456);
			local83 = Static154.method2176(local15 + arg0, Static153.anInt2554, Static502.anInt8456);
			Static270.method3998(arg5, local57, local75, local48);
			Static270.method3998(arg2, local75, local83, local48);
			Static270.method3998(arg5, local83, local66, local48);
		}
		while (local10 < local22) {
			local34 += 2;
			local32 += 2;
			local25 += local32;
			local30 += local34;
			if (local30 >= 0 && local27 >= 1) {
				local27--;
				Static227.anIntArray100[local27] = local10;
				local30 -= local27 << 1;
			}
			local10++;
			@Pc(188) int local188;
			@Pc(197) int local197;
			@Pc(204) int[] local204;
			@Pc(146) int local146;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				local146 = arg3 - local22;
				local57 = local22 + arg3;
				if (Static55.anInt4238 <= local57 && Static292.anInt4921 >= local146) {
					if (local22 < local15) {
						local66 = Static227.anIntArray100[local22];
						local75 = Static154.method2176(arg0 + local10, Static153.anInt2554, Static502.anInt8456);
						local83 = Static154.method2176(arg0 - local10, Static153.anInt2554, Static502.anInt8456);
						local188 = Static154.method2176(arg0 + local66, Static153.anInt2554, Static502.anInt8456);
						local197 = Static154.method2176(arg0 - local66, Static153.anInt2554, Static502.anInt8456);
						if (local57 <= Static292.anInt4921) {
							local204 = Static173.anIntArrayArray15[local57];
							Static270.method3998(arg5, local83, local197, local204);
							Static270.method3998(arg2, local197, local188, local204);
							Static270.method3998(arg5, local188, local75, local204);
						}
						if (Static55.anInt4238 <= local146) {
							local204 = Static173.anIntArrayArray15[local146];
							Static270.method3998(arg5, local83, local197, local204);
							Static270.method3998(arg2, local197, local188, local204);
							Static270.method3998(arg5, local188, local75, local204);
						}
					} else {
						local66 = Static154.method2176(local10 + arg0, Static153.anInt2554, Static502.anInt8456);
						local75 = Static154.method2176(arg0 - local10, Static153.anInt2554, Static502.anInt8456);
						if (Static292.anInt4921 >= local57) {
							Static270.method3998(arg5, local75, local66, Static173.anIntArrayArray15[local57]);
						}
						if (Static55.anInt4238 <= local146) {
							Static270.method3998(arg5, local75, local66, Static173.anIntArrayArray15[local146]);
						}
					}
				}
			}
			local146 = arg3 - local10;
			local57 = local10 + arg3;
			if (local57 >= Static55.anInt4238 && local146 <= Static292.anInt4921) {
				local66 = local22 + arg0;
				local75 = arg0 - local22;
				if (Static502.anInt8456 <= local66 && Static153.anInt2554 >= local75) {
					local66 = Static154.method2176(local66, Static153.anInt2554, Static502.anInt8456);
					local75 = Static154.method2176(local75, Static153.anInt2554, Static502.anInt8456);
					if (local10 >= local15) {
						if (Static292.anInt4921 >= local57) {
							Static270.method3998(arg5, local75, local66, Static173.anIntArrayArray15[local57]);
						}
						if (Static55.anInt4238 <= local146) {
							Static270.method3998(arg5, local75, local66, Static173.anIntArrayArray15[local146]);
						}
					} else {
						local83 = local10 <= local27 ? local27 : Static227.anIntArray100[local10];
						local188 = Static154.method2176(arg0 + local83, Static153.anInt2554, Static502.anInt8456);
						local197 = Static154.method2176(arg0 - local83, Static153.anInt2554, Static502.anInt8456);
						if (local57 <= Static292.anInt4921) {
							local204 = Static173.anIntArrayArray15[local57];
							Static270.method3998(arg5, local75, local197, local204);
							Static270.method3998(arg2, local197, local188, local204);
							Static270.method3998(arg5, local188, local66, local204);
						}
						if (Static55.anInt4238 <= local146) {
							local204 = Static173.anIntArrayArray15[local146];
							Static270.method3998(arg5, local75, local197, local204);
							Static270.method3998(arg2, local197, local188, local204);
							Static270.method3998(arg5, local188, local66, local204);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	public static void method6184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg1, 13);
		local9.method7976();
		local9.anInt9466 = arg0;
	}
}
