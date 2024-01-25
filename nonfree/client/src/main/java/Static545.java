import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!hia;")
	public static Class133 aClass133_42;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([J[IIII)V")
	public static void method7953(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) long local29 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local29;
		@Pc(43) int local43 = arg1[local23];
		arg1[local23] = arg1[arg2];
		arg1[arg2] = local43;
		@Pc(61) int local61 = local29 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg2; local63++) {
			if (local29 + (long) (local63 & local61) > arg0[local63]) {
				@Pc(81) long local81 = arg0[local63];
				arg0[local63] = arg0[local25];
				arg0[local25] = local81;
				@Pc(95) int local95 = arg1[local63];
				arg1[local63] = arg1[local25];
				arg1[local25++] = local95;
			}
		}
		arg0[arg2] = arg0[local25];
		arg0[local25] = local29;
		arg1[arg2] = arg1[local25];
		arg1[local25] = local43;
		method7953(arg0, arg1, local25 - 1, arg3);
		method7953(arg0, arg1, arg2, local25 + 1);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method7955() {
		if (Static572.anInt9602 == 5) {
			Static572.anInt9602 = 6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
	public static void method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static101.method1629(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg5;
		@Pc(26) int local26 = -arg5;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (arg2 >= Static100.anInt10042 && Static567.anInt9578 >= arg2) {
			@Pc(45) int[] local45 = Static484.anIntArrayArray41[arg2];
			local54 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - arg5);
			local64 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg5 + arg4);
			local73 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - local14);
			local81 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local14 + arg4);
			Static312.method5228(arg1, local45, local73, local54);
			Static312.method5228(arg3, local45, local81, local73);
			Static312.method5228(arg1, local45, local64, local81);
		}
		while (local23 > local10) {
			local33 += 2;
			local35 += 2;
			local26 += local33;
			local31 += local35;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				Static399.anIntArray446[local28] = local10;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(203) int local203;
			@Pc(211) int local211;
			@Pc(222) int[] local222;
			@Pc(147) int local147;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local147 = arg2 - local23;
				local54 = local23 + arg2;
				if (Static100.anInt10042 <= local54 && local147 <= Static567.anInt9578) {
					if (local14 > local23) {
						local64 = Static399.anIntArray446[local23];
						local73 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 + local10);
						local81 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - local10);
						local203 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 + local64);
						local211 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - local64);
						if (Static567.anInt9578 >= local54) {
							local222 = Static484.anIntArrayArray41[local54];
							Static312.method5228(arg1, local222, local211, local81);
							Static312.method5228(arg3, local222, local203, local211);
							Static312.method5228(arg1, local222, local73, local203);
						}
						if (Static100.anInt10042 <= local147) {
							local222 = Static484.anIntArrayArray41[local147];
							Static312.method5228(arg1, local222, local211, local81);
							Static312.method5228(arg3, local222, local203, local211);
							Static312.method5228(arg1, local222, local73, local203);
						}
					} else {
						local64 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local10 + arg4);
						local73 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - local10);
						if (local54 <= Static567.anInt9578) {
							Static312.method5228(arg1, Static484.anIntArrayArray41[local54], local64, local73);
						}
						if (local147 >= Static100.anInt10042) {
							Static312.method5228(arg1, Static484.anIntArrayArray41[local147], local64, local73);
						}
					}
				}
			}
			local147 = arg2 - local10;
			local54 = local10 + arg2;
			if (local54 >= Static100.anInt10042 && Static567.anInt9578 >= local147) {
				local64 = arg4 + local23;
				local73 = arg4 - local23;
				if (local64 >= Static347.anInt6542 && Static553.anInt9425 >= local73) {
					local64 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local64);
					local73 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, local73);
					if (local14 > local10) {
						local81 = local28 >= local10 ? local28 : Static399.anIntArray446[local10];
						local203 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 + local81);
						local211 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4 - local81);
						if (local54 <= Static567.anInt9578) {
							local222 = Static484.anIntArrayArray41[local54];
							Static312.method5228(arg1, local222, local211, local73);
							Static312.method5228(arg3, local222, local203, local211);
							Static312.method5228(arg1, local222, local64, local203);
						}
						if (local147 >= Static100.anInt10042) {
							local222 = Static484.anIntArrayArray41[local147];
							Static312.method5228(arg1, local222, local211, local73);
							Static312.method5228(arg3, local222, local203, local211);
							Static312.method5228(arg1, local222, local64, local203);
						}
					} else {
						if (Static567.anInt9578 >= local54) {
							Static312.method5228(arg1, Static484.anIntArrayArray41[local54], local64, local73);
						}
						if (Static100.anInt10042 <= local147) {
							Static312.method5228(arg1, Static484.anIntArrayArray41[local147], local64, local73);
						}
					}
				}
			}
		}
	}
}
