import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!wa;")
	public static Class358 aClass358_1;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "[Lclient!i;")
	public static Class151[] aClass151Array3;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
	public static void method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static561.method7329(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(83) int local83;
		if (Static275.anInt4756 <= arg3 && Static48.anInt898 >= arg3) {
			@Pc(50) int[] local50 = Static238.anIntArrayArray36[arg3];
			local58 = Static290.method4092(Static89.anInt1576, arg5 - arg2, Static130.anInt2131);
			local66 = Static290.method4092(Static89.anInt1576, arg2 + arg5, Static130.anInt2131);
			local74 = Static290.method4092(Static89.anInt1576, arg5 - local15, Static130.anInt2131);
			local83 = Static290.method4092(Static89.anInt1576, arg5 + local15, Static130.anInt2131);
			Static437.method5735(local58, local50, local74, arg4);
			Static437.method5735(local74, local50, local83, arg1);
			Static437.method5735(local83, local50, local66, arg4);
		}
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static535.anIntArray576[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(220) int[] local220;
			@Pc(150) int local150;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local150 = arg3 - local24;
				local58 = arg3 + local24;
				if (local58 >= Static275.anInt4756 && Static48.anInt898 >= local150) {
					if (local15 > local24) {
						local66 = Static535.anIntArray576[local24];
						local74 = Static290.method4092(Static89.anInt1576, local10 + arg5, Static130.anInt2131);
						local83 = Static290.method4092(Static89.anInt1576, arg5 - local10, Static130.anInt2131);
						local200 = Static290.method4092(Static89.anInt1576, local66 + arg5, Static130.anInt2131);
						local209 = Static290.method4092(Static89.anInt1576, arg5 - local66, Static130.anInt2131);
						if (Static48.anInt898 >= local58) {
							local220 = Static238.anIntArrayArray36[local58];
							Static437.method5735(local83, local220, local209, arg4);
							Static437.method5735(local209, local220, local200, arg1);
							Static437.method5735(local200, local220, local74, arg4);
						}
						if (local150 >= Static275.anInt4756) {
							local220 = Static238.anIntArrayArray36[local150];
							Static437.method5735(local83, local220, local209, arg4);
							Static437.method5735(local209, local220, local200, arg1);
							Static437.method5735(local200, local220, local74, arg4);
						}
					} else {
						local66 = Static290.method4092(Static89.anInt1576, local10 + arg5, Static130.anInt2131);
						local74 = Static290.method4092(Static89.anInt1576, arg5 - local10, Static130.anInt2131);
						if (local58 <= Static48.anInt898) {
							Static437.method5735(local74, Static238.anIntArrayArray36[local58], local66, arg4);
						}
						if (Static275.anInt4756 <= local150) {
							Static437.method5735(local74, Static238.anIntArrayArray36[local150], local66, arg4);
						}
					}
				}
			}
			local150 = arg3 - local10;
			local58 = local10 + arg3;
			if (local58 >= Static275.anInt4756 && local150 <= Static48.anInt898) {
				local66 = arg5 + local24;
				local74 = arg5 - local24;
				if (Static130.anInt2131 <= local66 && Static89.anInt1576 >= local74) {
					local66 = Static290.method4092(Static89.anInt1576, local66, Static130.anInt2131);
					local74 = Static290.method4092(Static89.anInt1576, local74, Static130.anInt2131);
					if (local10 >= local15) {
						if (local58 <= Static48.anInt898) {
							Static437.method5735(local74, Static238.anIntArrayArray36[local58], local66, arg4);
						}
						if (local150 >= Static275.anInt4756) {
							Static437.method5735(local74, Static238.anIntArrayArray36[local150], local66, arg4);
						}
					} else {
						local83 = local29 < local10 ? Static535.anIntArray576[local10] : local29;
						local200 = Static290.method4092(Static89.anInt1576, arg5 + local83, Static130.anInt2131);
						local209 = Static290.method4092(Static89.anInt1576, arg5 - local83, Static130.anInt2131);
						if (local58 <= Static48.anInt898) {
							local220 = Static238.anIntArrayArray36[local58];
							Static437.method5735(local74, local220, local209, arg4);
							Static437.method5735(local209, local220, local200, arg1);
							Static437.method5735(local200, local220, local66, arg4);
						}
						if (Static275.anInt4756 <= local150) {
							local220 = Static238.anIntArrayArray36[local150];
							Static437.method5735(local74, local220, local209, arg4);
							Static437.method5735(local209, local220, local200, arg1);
							Static437.method5735(local200, local220, local66, arg4);
						}
					}
				}
			}
		}
	}
}
