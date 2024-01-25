import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!bg;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z")
	public static boolean method1763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static246.method4413(arg0, arg1) || Static405.method6339(arg1, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBIII)V")
	public static void method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static411.method6450(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(93) int local93;
		if (Static633.anInt10644 <= arg3 && Static389.anInt7300 >= arg3) {
			@Pc(59) int[] local59 = Static173.anIntArrayArray15[arg3];
			local68 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - arg0);
			local76 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg0 + arg4);
			local85 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - local15);
			local93 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 + local15);
			Static571.method7990(arg1, local59, local68, local85);
			Static571.method7990(arg2, local59, local85, local93);
			Static571.method7990(arg1, local59, local93, local76);
		}
		while (local21 > local10) {
			local41 += 2;
			local39 += 2;
			local29 += local41;
			local24 += local39;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static569.anIntArray521[local26] = local10;
			}
			local10++;
			@Pc(251) int local251;
			@Pc(260) int local260;
			@Pc(267) int[] local267;
			@Pc(159) int local159;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local159 = arg3 - local21;
				local68 = local21 + arg3;
				if (Static633.anInt10644 <= local68 && Static389.anInt7300 >= local159) {
					if (local15 <= local21) {
						local76 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 + local10);
						local85 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - local10);
						if (local68 <= Static389.anInt7300) {
							Static571.method7990(arg1, Static173.anIntArrayArray15[local68], local85, local76);
						}
						if (local159 >= Static633.anInt10644) {
							Static571.method7990(arg1, Static173.anIntArrayArray15[local159], local85, local76);
						}
					} else {
						local76 = Static569.anIntArray521[local21];
						local85 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 + local10);
						local93 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - local10);
						local251 = Static465.method6957(Static7.anInt464, Static309.anInt6227, local76 + arg4);
						local260 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - local76);
						if (Static389.anInt7300 >= local68) {
							local267 = Static173.anIntArrayArray15[local68];
							Static571.method7990(arg1, local267, local93, local260);
							Static571.method7990(arg2, local267, local260, local251);
							Static571.method7990(arg1, local267, local251, local85);
						}
						if (local159 >= Static633.anInt10644) {
							local267 = Static173.anIntArrayArray15[local159];
							Static571.method7990(arg1, local267, local93, local260);
							Static571.method7990(arg2, local267, local260, local251);
							Static571.method7990(arg1, local267, local251, local85);
						}
					}
				}
			}
			local159 = arg3 - local10;
			local68 = local10 + arg3;
			if (local68 >= Static633.anInt10644 && Static389.anInt7300 >= local159) {
				local76 = arg4 + local21;
				local85 = arg4 - local21;
				if (Static309.anInt6227 <= local76 && local85 <= Static7.anInt464) {
					local76 = Static465.method6957(Static7.anInt464, Static309.anInt6227, local76);
					local85 = Static465.method6957(Static7.anInt464, Static309.anInt6227, local85);
					if (local10 >= local15) {
						if (local68 <= Static389.anInt7300) {
							Static571.method7990(arg1, Static173.anIntArrayArray15[local68], local85, local76);
						}
						if (Static633.anInt10644 <= local159) {
							Static571.method7990(arg1, Static173.anIntArrayArray15[local159], local85, local76);
						}
					} else {
						local93 = local10 <= local26 ? local26 : Static569.anIntArray521[local10];
						local251 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 + local93);
						local260 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg4 - local93);
						if (Static389.anInt7300 >= local68) {
							local267 = Static173.anIntArrayArray15[local68];
							Static571.method7990(arg1, local267, local85, local260);
							Static571.method7990(arg2, local267, local260, local251);
							Static571.method7990(arg1, local267, local251, local76);
						}
						if (local159 >= Static633.anInt10644) {
							local267 = Static173.anIntArrayArray15[local159];
							Static571.method7990(arg1, local267, local85, local260);
							Static571.method7990(arg2, local267, local260, local251);
							Static571.method7990(arg1, local267, local251, local76);
						}
					}
				}
			}
		}
	}
}
