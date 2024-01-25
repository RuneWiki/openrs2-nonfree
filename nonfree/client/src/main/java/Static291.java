import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public static int anInt7494;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public static int anInt7491 = 1;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
	public static int anInt7496 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
	public static void method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static164.method5050(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg1;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local14;
		@Pc(29) int local29 = -local14;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(52) int local52;
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(77) int local77;
		if (Static362.anInt6654 <= arg4 && Static164.anInt6595 >= arg4) {
			@Pc(43) int[] local43 = Static60.anIntArrayArray14[arg4];
			local52 = Static337.method4744(arg3 - arg0, Static70.anInt1843, Static105.anInt2417);
			local60 = Static337.method4744(arg0 + arg3, Static70.anInt1843, Static105.anInt2417);
			local68 = Static337.method4744(arg3 - local14, Static70.anInt1843, Static105.anInt2417);
			local77 = Static337.method4744(arg3 + local14, Static70.anInt1843, Static105.anInt2417);
			Static228.method3480(local52, arg2, local43, local68);
			Static228.method3480(local68, arg5, local43, local77);
			Static228.method3480(local77, arg2, local43, local60);
		}
		while (local10 < local21) {
			local33 += 2;
			local31 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static218.anIntArray425[local26] = local10;
			}
			local10++;
			@Pc(238) int local238;
			@Pc(247) int local247;
			@Pc(258) int[] local258;
			@Pc(145) int local145;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local145 = arg4 - local21;
				local52 = arg4 + local21;
				if (Static362.anInt6654 <= local52 && local145 <= Static164.anInt6595) {
					if (local21 >= local14) {
						local60 = Static337.method4744(arg3 + local10, Static70.anInt1843, Static105.anInt2417);
						local68 = Static337.method4744(arg3 - local10, Static70.anInt1843, Static105.anInt2417);
						if (Static164.anInt6595 >= local52) {
							Static228.method3480(local68, arg2, Static60.anIntArrayArray14[local52], local60);
						}
						if (local145 >= Static362.anInt6654) {
							Static228.method3480(local68, arg2, Static60.anIntArrayArray14[local145], local60);
						}
					} else {
						local60 = Static218.anIntArray425[local21];
						local68 = Static337.method4744(local10 + arg3, Static70.anInt1843, Static105.anInt2417);
						local77 = Static337.method4744(arg3 - local10, Static70.anInt1843, Static105.anInt2417);
						local238 = Static337.method4744(arg3 + local60, Static70.anInt1843, Static105.anInt2417);
						local247 = Static337.method4744(arg3 - local60, Static70.anInt1843, Static105.anInt2417);
						if (Static164.anInt6595 >= local52) {
							local258 = Static60.anIntArrayArray14[local52];
							Static228.method3480(local77, arg2, local258, local247);
							Static228.method3480(local247, arg5, local258, local238);
							Static228.method3480(local238, arg2, local258, local68);
						}
						if (Static362.anInt6654 <= local145) {
							local258 = Static60.anIntArrayArray14[local145];
							Static228.method3480(local77, arg2, local258, local247);
							Static228.method3480(local247, arg5, local258, local238);
							Static228.method3480(local238, arg2, local258, local68);
						}
					}
				}
			}
			local145 = arg4 - local10;
			local52 = arg4 + local10;
			if (local52 >= Static362.anInt6654 && local145 <= Static164.anInt6595) {
				local60 = arg3 + local21;
				local68 = arg3 - local21;
				if (Static105.anInt2417 <= local60 && Static70.anInt1843 >= local68) {
					local60 = Static337.method4744(local60, Static70.anInt1843, Static105.anInt2417);
					local68 = Static337.method4744(local68, Static70.anInt1843, Static105.anInt2417);
					if (local10 < local14) {
						local77 = local10 > local26 ? Static218.anIntArray425[local10] : local26;
						local238 = Static337.method4744(arg3 + local77, Static70.anInt1843, Static105.anInt2417);
						local247 = Static337.method4744(arg3 - local77, Static70.anInt1843, Static105.anInt2417);
						if (Static164.anInt6595 >= local52) {
							local258 = Static60.anIntArrayArray14[local52];
							Static228.method3480(local68, arg2, local258, local247);
							Static228.method3480(local247, arg5, local258, local238);
							Static228.method3480(local238, arg2, local258, local60);
						}
						if (local145 >= Static362.anInt6654) {
							local258 = Static60.anIntArrayArray14[local145];
							Static228.method3480(local68, arg2, local258, local247);
							Static228.method3480(local247, arg5, local258, local238);
							Static228.method3480(local238, arg2, local258, local60);
						}
					} else {
						if (Static164.anInt6595 >= local52) {
							Static228.method3480(local68, arg2, Static60.anIntArrayArray14[local52], local60);
						}
						if (Static362.anInt6654 <= local145) {
							Static228.method3480(local68, arg2, Static60.anIntArrayArray14[local145], local60);
						}
					}
				}
			}
		}
	}
}
