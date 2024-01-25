import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	public static boolean method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static157.anInt3507; local1++) {
			@Pc(6) Class86 local6 = Static18.aClass86Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2431 == 1) {
				local15 = local6.anInt2413 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2412 + (local6.anInt2427 * local15 >> 8);
					local37 = local6.anInt2417 + (local6.anInt2424 * local15 >> 8);
					local47 = local6.anInt2419 + (local6.anInt2420 * local15 >> 8);
					local57 = local6.anInt2425 + (local6.anInt2414 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2431 == 2) {
				local15 = arg0 - local6.anInt2413;
				if (local15 > 0) {
					local27 = local6.anInt2412 + (local6.anInt2427 * local15 >> 8);
					local37 = local6.anInt2417 + (local6.anInt2424 * local15 >> 8);
					local47 = local6.anInt2419 + (local6.anInt2420 * local15 >> 8);
					local57 = local6.anInt2425 + (local6.anInt2414 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2431 == 3) {
				local15 = local6.anInt2412 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2413 + (local6.anInt2421 * local15 >> 8);
					local37 = local6.anInt2426 + (local6.anInt2430 * local15 >> 8);
					local47 = local6.anInt2419 + (local6.anInt2420 * local15 >> 8);
					local57 = local6.anInt2425 + (local6.anInt2414 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2431 == 4) {
				local15 = arg2 - local6.anInt2412;
				if (local15 > 0) {
					local27 = local6.anInt2413 + (local6.anInt2421 * local15 >> 8);
					local37 = local6.anInt2426 + (local6.anInt2430 * local15 >> 8);
					local47 = local6.anInt2419 + (local6.anInt2420 * local15 >> 8);
					local57 = local6.anInt2425 + (local6.anInt2414 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2431 == 5) {
				local15 = arg1 - local6.anInt2419;
				if (local15 > 0) {
					local27 = local6.anInt2413 + (local6.anInt2421 * local15 >> 8);
					local37 = local6.anInt2426 + (local6.anInt2430 * local15 >> 8);
					local47 = local6.anInt2412 + (local6.anInt2427 * local15 >> 8);
					local57 = local6.anInt2417 + (local6.anInt2424 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
	public static void method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static203.method3613(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(32) int local32 = -arg4;
		@Pc(34) int local34 = local15;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(45) int[] local45 = Static30.anIntArrayArray10[arg5];
		@Pc(50) int local50 = arg2 - local15;
		Static182.method3394(arg2 - arg4, local45, arg0, local50);
		@Pc(63) int local63 = local15 + arg2;
		Static182.method3394(local50, local45, arg3, local63);
		Static182.method3394(local63, local45, arg0, arg4 + arg2);
		while (local29 > local10) {
			local41 += 2;
			local39 += 2;
			local37 += local41;
			local32 += local39;
			if (local37 >= 0 && local34 >= 1) {
				Static110.anIntArray234[local34] = local10;
				local34--;
				local37 -= local34 << 1;
			}
			local10++;
			@Pc(123) int[] local123;
			@Pc(130) int[] local130;
			@Pc(134) int local134;
			@Pc(139) int local139;
			@Pc(143) int local143;
			@Pc(147) int local147;
			@Pc(151) int local151;
			if (local32 >= 0) {
				local29--;
				if (local15 > local29) {
					local123 = Static30.anIntArrayArray10[arg5 + local29];
					local130 = Static30.anIntArrayArray10[arg5 - local29];
					local134 = Static110.anIntArray234[local29];
					local139 = arg2 + local10;
					local143 = arg2 - local10;
					local147 = arg2 + local134;
					local151 = arg2 - local134;
					Static182.method3394(local143, local123, arg0, local151);
					Static182.method3394(local151, local123, arg3, local147);
					Static182.method3394(local147, local123, arg0, local139);
					Static182.method3394(local143, local130, arg0, local151);
					Static182.method3394(local151, local130, arg3, local147);
					Static182.method3394(local147, local130, arg0, local139);
				} else {
					local123 = Static30.anIntArrayArray10[arg5 + local29];
					local130 = Static30.anIntArrayArray10[arg5 - local29];
					local134 = local10 + arg2;
					local139 = arg2 - local10;
					Static182.method3394(local139, local123, arg0, local134);
					Static182.method3394(local139, local130, arg0, local134);
				}
				local32 -= local29 << 1;
			}
			local123 = Static30.anIntArrayArray10[local10 + arg5];
			local130 = Static30.anIntArrayArray10[arg5 - local10];
			local134 = arg2 + local29;
			local139 = arg2 - local29;
			if (local10 < local15) {
				local143 = local34 >= local10 ? local34 : Static110.anIntArray234[local10];
				local147 = arg2 + local143;
				local151 = arg2 - local143;
				Static182.method3394(local139, local123, arg0, local151);
				Static182.method3394(local151, local123, arg3, local147);
				Static182.method3394(local147, local123, arg0, local134);
				Static182.method3394(local139, local130, arg0, local151);
				Static182.method3394(local151, local130, arg3, local147);
				Static182.method3394(local147, local130, arg0, local134);
			} else {
				Static182.method3394(local139, local123, arg0, local134);
				Static182.method3394(local139, local130, arg0, local134);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1394() {
		if (Static164.aClass92_7 == null) {
			return;
		}
		Static315.aClass204_4.method5362();
		Static285.method4876();
		Static170.method3202();
		Static210.method4723();
		Static237.method4088();
		Static66.method1245();
		if (Static93.aClass155_1 != null) {
			Static93.aClass155_1.method4226();
		}
		Static87.method1559();
		Static207.method3647();
		Static164.method3150();
		Static169.method3178(false);
		Static101.method2750();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class2_Sub2_Sub1_Sub1 local43 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local37];
			if (local43 != null) {
				local43.anInterface5_3 = null;
				for (@Pc(50) int local50 = 0; local50 < local43.aClass5Array3.length; local50++) {
					local43.aClass5Array3[local50] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static101.aClass2_Sub2_Sub1_Sub2Array6.length; local73++) {
			@Pc(79) Class2_Sub2_Sub1_Sub2 local79 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass5Array3.length; local83++) {
					local79.aClass5Array3[local83] = null;
				}
			}
		}
		Static164.aClass92_7.method4478();
		Static164.aClass92_7 = null;
	}
}
