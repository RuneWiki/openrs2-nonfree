import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_146 = new Class286(12, 3);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!pl;B)V")
	public static void method6894(@OriginalArg(0) Class259 arg0) {
		Static497.anInt8371 = 0;
		Static538.anInt8797 = 0;
		Static508.aClass109_8 = new Class109();
		Static414.aClass6_Sub3_Sub1_Sub1Array30 = new Class6_Sub3_Sub1_Sub1[1024];
		Static78.aClass6_Sub8Array5 = new Class6_Sub8[Static180.anIntArray214[Static206.anInt3999] + 1];
		Static568.anInt9291 = 0;
		Static501.anInt8413 = 0;
		Static400.method5832(arg0);
		Static41.method699(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!r;Lclient!ae;II)V")
	public static void method6895(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class8 arg1) {
		Static36.aClass8_3.method220();
		if (Static156.aBoolean654) {
			return;
		}
		for (@Pc(20) Class2_Sub46 local20 = (Class2_Sub46) arg1.method210(); local20 != null; local20 = (Class2_Sub46) arg1.method218()) {
			@Pc(28) Class366 local28 = Static270.aClass25_2.method435(local20.anInt9117);
			if (Static563.method7643(local28)) {
				@Pc(40) boolean local40 = Static46.method788(local20, arg0, local28);
				if (local40) {
					Static575.method7785(arg0, local20, local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public static void method6896(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub3_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class67 local8 = Static569.aClass67Array8[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static357.anInt6390; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static496.anInt8369; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static134.anInt2822;
							@Pc(32) int local32 = local12 << Static134.anInt2822;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class67 local41 = Static569.aClass67Array8[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method6707(local12, local15) - local41.method6707(local12, local15);
									@Pc(71) int local71 = local8.method6707(local12, local15 + 1) - local41.method6707(local12, local15 + 1);
									@Pc(91) int local91 = local8.method6707(local12 + 1, local15 + 1) - local41.method6707(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method6707(local12 + 1, local15) - local41.method6707(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIB)V")
	public static void method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static545.anInt8879 = arg0;
		Static350.anInt6290 = arg2;
		Static222.anInt4180 = arg1;
		Static274.anInt4965 = arg3;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZI)Z")
	public static boolean method6898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static222.method3495(arg0, arg1) || Static282.method4203(arg0, arg1) || Static433.method6129(arg1, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZIIIII)V")
	public static void method6901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static525.method8003(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg5;
		@Pc(23) int local23 = -arg5;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static582.anIntArrayArray69[arg3];
		@Pc(41) int local41 = arg1 - local14;
		Static276.method3099(arg1 - arg5, local36, arg2, local41);
		@Pc(54) int local54 = arg1 + local14;
		Static276.method3099(local41, local36, arg4, local54);
		Static276.method3099(local54, local36, arg2, arg1 + arg5);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				Static53.anIntArray65[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(115) int[] local115;
			@Pc(122) int[] local122;
			@Pc(126) int local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			if (local23 >= 0) {
				local20--;
				if (local14 > local20) {
					local115 = Static582.anIntArrayArray69[arg3 + local20];
					local122 = Static582.anIntArrayArray69[arg3 - local20];
					local126 = Static53.anIntArray65[local20];
					local130 = local10 + arg1;
					local135 = arg1 - local10;
					local139 = arg1 + local126;
					local144 = arg1 - local126;
					Static276.method3099(local135, local115, arg2, local144);
					Static276.method3099(local144, local115, arg4, local139);
					Static276.method3099(local139, local115, arg2, local130);
					Static276.method3099(local135, local122, arg2, local144);
					Static276.method3099(local144, local122, arg4, local139);
					Static276.method3099(local139, local122, arg2, local130);
				} else {
					local115 = Static582.anIntArrayArray69[arg3 + local20];
					local122 = Static582.anIntArrayArray69[arg3 - local20];
					local126 = arg1 + local10;
					local130 = arg1 - local10;
					Static276.method3099(local130, local115, arg2, local126);
					Static276.method3099(local130, local122, arg2, local126);
				}
				local23 -= local20 << 1;
			}
			local115 = Static582.anIntArrayArray69[arg3 + local10];
			local122 = Static582.anIntArrayArray69[arg3 - local10];
			local126 = arg1 + local20;
			local130 = arg1 - local20;
			if (local14 <= local10) {
				Static276.method3099(local130, local115, arg2, local126);
				Static276.method3099(local130, local122, arg2, local126);
			} else {
				local135 = local10 > local25 ? Static53.anIntArray65[local10] : local25;
				local139 = local135 + arg1;
				local144 = arg1 - local135;
				Static276.method3099(local130, local115, arg2, local144);
				Static276.method3099(local144, local115, arg4, local139);
				Static276.method3099(local139, local115, arg2, local126);
				Static276.method3099(local130, local122, arg2, local144);
				Static276.method3099(local144, local122, arg4, local139);
				Static276.method3099(local139, local122, arg2, local126);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILclient!r;IIIB)Lclient!da;")
	public static Class66 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class66 local12 = (Class66) Static268.aClass313_63.method6989(local6);
		if (local12 == null) {
			@Pc(27) Class93 local27 = Static117.method1747(arg0, Static22.aClass259_16);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt2361 < 13) {
				local27.method1763();
			}
			local12 = arg2.method6191(local27, 2055, Static492.anInt8283, 64, 768);
			Static268.aClass313_63.method6980(local6, local12);
		}
		local12 = local12.method7551((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.M(arg4);
		}
		if (arg1 != 0) {
			local12.MA(arg1);
		}
		if (arg3 != 0) {
			local12.W(arg3);
		}
		if (arg5 != 0) {
			local12.oa(0, arg5, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	public static void method6904() {
		Static499.method6973();
		Static290.aClass37_4 = null;
		Static101.aClass37_2 = null;
		Static312.aClass100_7 = null;
		Static423.aClass216ArrayArray1 = null;
		Static78.aClass37_8 = null;
	}
}
