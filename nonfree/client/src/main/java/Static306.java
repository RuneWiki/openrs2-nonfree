import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!os", name = "U", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array15;

	@OriginalMember(owner = "client!os", name = "M", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_128 = new Class163(18, 11);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
	public static void method4339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 + 1;
		Static201.method3084(Static296.anIntArrayArray42[arg3], arg0, arg1, arg2);
		@Pc(17) int local17 = arg4 - 1;
		Static201.method3084(Static296.anIntArrayArray42[arg4], arg0, arg1, arg2);
		for (@Pc(25) int local25 = local4; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static296.anIntArrayArray42[local25];
			local31[arg0] = local31[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static431.method5861(arg4);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg4 - arg2;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(32) int local32 = -arg4;
		@Pc(34) int local34 = local20;
		@Pc(37) int local37 = -local20;
		@Pc(39) int local39 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (Static316.anInt5349 <= arg5 && arg5 <= Static418.anInt7030) {
			@Pc(53) int[] local53 = Static296.anIntArrayArray42[arg5];
			local62 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - arg4);
			local70 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg4 + arg3);
			local79 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - local20);
			local87 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local20 + arg3);
			Static201.method3084(local53, local62, local79, arg1);
			Static201.method3084(local53, local79, local87, arg0);
			Static201.method3084(local53, local87, local70, arg1);
		}
		@Pc(107) int local107 = -1;
		while (local15 < local29) {
			local107 += 2;
			local39 += 2;
			local32 += local39;
			local37 += local107;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static123.anIntArray102[local34] = local15;
			}
			local15++;
			@Pc(205) int local205;
			@Pc(213) int local213;
			@Pc(220) int[] local220;
			@Pc(154) int local154;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local154 = arg5 - local29;
				local62 = arg5 + local29;
				if (local62 >= Static316.anInt5349 && Static418.anInt7030 >= local154) {
					if (local29 < local20) {
						local70 = Static123.anIntArray102[local29];
						local79 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 + local15);
						local87 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - local15);
						local205 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local70 + arg3);
						local213 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - local70);
						if (local62 <= Static418.anInt7030) {
							local220 = Static296.anIntArrayArray42[local62];
							Static201.method3084(local220, local87, local213, arg1);
							Static201.method3084(local220, local213, local205, arg0);
							Static201.method3084(local220, local205, local79, arg1);
						}
						if (local154 >= Static316.anInt5349) {
							local220 = Static296.anIntArrayArray42[local154];
							Static201.method3084(local220, local87, local213, arg1);
							Static201.method3084(local220, local213, local205, arg0);
							Static201.method3084(local220, local205, local79, arg1);
						}
					} else {
						local70 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 + local15);
						local79 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - local15);
						if (Static418.anInt7030 >= local62) {
							Static201.method3084(Static296.anIntArrayArray42[local62], local79, local70, arg1);
						}
						if (local154 >= Static316.anInt5349) {
							Static201.method3084(Static296.anIntArrayArray42[local154], local79, local70, arg1);
						}
					}
				}
			}
			local154 = arg5 - local15;
			local62 = local15 + arg5;
			if (Static316.anInt5349 <= local62 && Static418.anInt7030 >= local154) {
				local70 = local29 + arg3;
				local79 = arg3 - local29;
				if (Static399.anInt2866 <= local70 && local79 <= Static372.anInt6316) {
					local70 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local70);
					local79 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local79);
					if (local15 < local20) {
						local87 = local34 < local15 ? Static123.anIntArray102[local15] : local34;
						local205 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, local87 + arg3);
						local213 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3 - local87);
						if (local62 <= Static418.anInt7030) {
							local220 = Static296.anIntArrayArray42[local62];
							Static201.method3084(local220, local79, local213, arg1);
							Static201.method3084(local220, local213, local205, arg0);
							Static201.method3084(local220, local205, local70, arg1);
						}
						if (Static316.anInt5349 <= local154) {
							local220 = Static296.anIntArrayArray42[local154];
							Static201.method3084(local220, local79, local213, arg1);
							Static201.method3084(local220, local213, local205, arg0);
							Static201.method3084(local220, local205, local70, arg1);
						}
					} else {
						if (Static418.anInt7030 >= local62) {
							Static201.method3084(Static296.anIntArrayArray42[local62], local79, local70, arg1);
						}
						if (Static316.anInt5349 <= local154) {
							Static201.method3084(Static296.anIntArrayArray42[local154], local79, local70, arg1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V")
	public static void method4342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(4, arg3);
		local8.method1003();
		local8.anInt972 = arg1;
		local8.anInt974 = arg0;
		local8.anInt970 = arg2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ub;IBI)V")
	public static void method4345(@OriginalArg(0) Class1_Sub2_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt7612 && arg2 != -1) {
			@Pc(27) Class261 local27 = Static444.aClass59_3.method1552(arg2);
			@Pc(30) int local30 = local27.anInt7421;
			if (local30 == 1) {
				arg0.anInt7624 = arg1;
				arg0.anInt7620 = 0;
				arg0.anInt7617 = 1;
				arg0.anInt7597 = 0;
				arg0.anInt7588 = 0;
				Static192.method3007(local27, arg0.aByte101, arg0.anInt7588, arg0.anInt7560, arg0.anInt7557, false);
			}
			if (local30 == 2) {
				arg0.anInt7597 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt7612 == -1 || Static444.aClass59_3.method1552(arg2).anInt7419 >= Static444.aClass59_3.method1552(arg0.anInt7612).anInt7419) {
			arg0.anInt7597 = 0;
			arg0.anInt7612 = arg2;
			arg0.anInt7588 = 0;
			arg0.anInt7617 = 1;
			arg0.anInt7624 = arg1;
			arg0.anInt7620 = 0;
			arg0.anInt7641 = arg0.anInt7644;
			if (arg0.anInt7612 == -1) {
				return;
			}
			Static192.method3007(Static444.aClass59_3.method1552(arg0.anInt7612), arg0.aByte101, arg0.anInt7588, arg0.anInt7560, arg0.anInt7557, false);
		}
	}
}
