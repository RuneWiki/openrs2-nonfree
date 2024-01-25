import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public static int anInt1690;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_31 = new Class45("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
	public static final int[] anIntArray115 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_30 = new Class252(8, -1);

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "J")
	public static long aLong41 = 0L;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
	public static void method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static316.method5451(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(31) int local31 = arg3;
		@Pc(34) int local34 = -arg3;
		@Pc(36) int local36 = local14;
		@Pc(39) int local39 = -local14;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (arg0 >= Static94.anInt2057 && Static187.anInt3872 >= arg0) {
			@Pc(57) int[] local57 = Static143.anIntArrayArray33[arg0];
			local66 = Static452.method6975(Static119.anInt2469, arg5 - arg3, Static325.anInt6148);
			local74 = Static452.method6975(Static119.anInt2469, arg3 + arg5, Static325.anInt6148);
			local83 = Static452.method6975(Static119.anInt2469, arg5 - local14, Static325.anInt6148);
			local92 = Static452.method6975(Static119.anInt2469, arg5 + local14, Static325.anInt6148);
			Static313.method5430(local83, arg1, local57, local66);
			Static313.method5430(local92, arg4, local57, local83);
			Static313.method5430(local74, arg1, local57, local92);
		}
		while (local31 > local10) {
			local41 += 2;
			local43 += 2;
			local34 += local41;
			local39 += local43;
			if (local39 >= 0 && local36 >= 1) {
				local36--;
				Static109.anIntArray179[local36] = local10;
				local39 -= local36 << 1;
			}
			local10++;
			@Pc(245) int local245;
			@Pc(254) int local254;
			@Pc(265) int[] local265;
			@Pc(156) int local156;
			if (local34 >= 0) {
				local31--;
				local34 -= local31 << 1;
				local156 = arg0 - local31;
				local66 = local31 + arg0;
				if (Static94.anInt2057 <= local66 && local156 <= Static187.anInt3872) {
					if (local14 <= local31) {
						local74 = Static452.method6975(Static119.anInt2469, arg5 + local10, Static325.anInt6148);
						local83 = Static452.method6975(Static119.anInt2469, arg5 - local10, Static325.anInt6148);
						if (local66 <= Static187.anInt3872) {
							Static313.method5430(local74, arg1, Static143.anIntArrayArray33[local66], local83);
						}
						if (local156 >= Static94.anInt2057) {
							Static313.method5430(local74, arg1, Static143.anIntArrayArray33[local156], local83);
						}
					} else {
						local74 = Static109.anIntArray179[local31];
						local83 = Static452.method6975(Static119.anInt2469, local10 + arg5, Static325.anInt6148);
						local92 = Static452.method6975(Static119.anInt2469, arg5 - local10, Static325.anInt6148);
						local245 = Static452.method6975(Static119.anInt2469, arg5 + local74, Static325.anInt6148);
						local254 = Static452.method6975(Static119.anInt2469, arg5 - local74, Static325.anInt6148);
						if (local66 <= Static187.anInt3872) {
							local265 = Static143.anIntArrayArray33[local66];
							Static313.method5430(local254, arg1, local265, local92);
							Static313.method5430(local245, arg4, local265, local254);
							Static313.method5430(local83, arg1, local265, local245);
						}
						if (Static94.anInt2057 <= local156) {
							local265 = Static143.anIntArrayArray33[local156];
							Static313.method5430(local254, arg1, local265, local92);
							Static313.method5430(local245, arg4, local265, local254);
							Static313.method5430(local83, arg1, local265, local245);
						}
					}
				}
			}
			local156 = arg0 - local10;
			local66 = local10 + arg0;
			if (local66 >= Static94.anInt2057 && local156 <= Static187.anInt3872) {
				local74 = local31 + arg5;
				local83 = arg5 - local31;
				if (Static325.anInt6148 <= local74 && local83 <= Static119.anInt2469) {
					local74 = Static452.method6975(Static119.anInt2469, local74, Static325.anInt6148);
					local83 = Static452.method6975(Static119.anInt2469, local83, Static325.anInt6148);
					if (local14 <= local10) {
						if (Static187.anInt3872 >= local66) {
							Static313.method5430(local74, arg1, Static143.anIntArrayArray33[local66], local83);
						}
						if (local156 >= Static94.anInt2057) {
							Static313.method5430(local74, arg1, Static143.anIntArrayArray33[local156], local83);
						}
					} else {
						local92 = local36 >= local10 ? local36 : Static109.anIntArray179[local10];
						local245 = Static452.method6975(Static119.anInt2469, arg5 + local92, Static325.anInt6148);
						local254 = Static452.method6975(Static119.anInt2469, arg5 - local92, Static325.anInt6148);
						if (Static187.anInt3872 >= local66) {
							local265 = Static143.anIntArrayArray33[local66];
							Static313.method5430(local254, arg1, local265, local83);
							Static313.method5430(local245, arg4, local265, local254);
							Static313.method5430(local74, arg1, local265, local245);
						}
						if (Static94.anInt2057 <= local156) {
							local265 = Static143.anIntArrayArray33[local156];
							Static313.method5430(local254, arg1, local265, local83);
							Static313.method5430(local245, arg4, local265, local254);
							Static313.method5430(local74, arg1, local265, local245);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIIII)V")
	public static void method1653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static452.method6975(Static187.anInt3872, arg3, Static94.anInt2057);
		@Pc(17) int local17 = Static452.method6975(Static187.anInt3872, arg2, Static94.anInt2057);
		@Pc(31) int local31 = Static452.method6975(Static119.anInt2469, arg0, Static325.anInt6148);
		@Pc(37) int local37 = Static452.method6975(Static119.anInt2469, arg1, Static325.anInt6148);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static313.method5430(local37, arg4, Static143.anIntArrayArray33[local39], local31);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!dn;IIIZII)V")
	public static void method1654(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static99.anInt2118 = 0;
		Static129.aBoolean226 = false;
		Static283.anInt5391 = 1;
		Static179.anInt3754 = arg3;
		Static471.aClass69_91 = arg0;
		Static382.anInt6788 = arg2;
		Static322.anInt6116 = Static518.aClass1_Sub4_Sub4_3.method7995() / arg1;
		if (Static322.anInt6116 < 1) {
			Static322.anInt6116 = 1;
		}
	}
}
