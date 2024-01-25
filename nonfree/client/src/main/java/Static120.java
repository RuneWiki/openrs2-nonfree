import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "Lclient!lt;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_37 = new Class60();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIIIIII)V")
	public static void method1771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static219.method3080(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		@Pc(95) int local95;
		if (arg4 >= Static617.anInt9501 && Static519.anInt8267 >= arg4) {
			@Pc(62) int[] local62 = Static449.anIntArrayArray48[arg4];
			local70 = Static67.method9535(Static8.anInt99, arg3 - arg5, Static14.anInt206);
			local79 = Static67.method9535(Static8.anInt99, arg3 + arg5, Static14.anInt206);
			local87 = Static67.method9535(Static8.anInt99, arg3 - local15, Static14.anInt206);
			local95 = Static67.method9535(Static8.anInt99, local15 + arg3, Static14.anInt206);
			Static494.method7075(local70, arg0, local87, local62, 18601);
			Static494.method7075(local87, arg2, local95, local62, 18601);
			Static494.method7075(local95, arg0, local79, local62, 18601);
		}
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static231.anIntArray285[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(221) int local221;
			@Pc(231) int local231;
			@Pc(238) int[] local238;
			@Pc(163) int local163;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local163 = arg4 - local21;
				local70 = local21 + arg4;
				if (local70 >= Static617.anInt9501 && Static519.anInt8267 >= local163) {
					if (local15 > local21) {
						local79 = Static231.anIntArray285[local21];
						local87 = Static67.method9535(Static8.anInt99, local10 + arg3, Static14.anInt206);
						local95 = Static67.method9535(Static8.anInt99, arg3 - local10, Static14.anInt206);
						local221 = Static67.method9535(Static8.anInt99, local79 + arg3, Static14.anInt206);
						local231 = Static67.method9535(Static8.anInt99, arg3 - local79, Static14.anInt206);
						if (local70 <= Static519.anInt8267) {
							local238 = Static449.anIntArrayArray48[local70];
							Static494.method7075(local95, arg0, local231, local238, 18601);
							Static494.method7075(local231, arg2, local221, local238, 18601);
							Static494.method7075(local221, arg0, local87, local238, 18601);
						}
						if (Static617.anInt9501 <= local163) {
							local238 = Static449.anIntArrayArray48[local163];
							Static494.method7075(local95, arg0, local231, local238, 18601);
							Static494.method7075(local231, arg2, local221, local238, 18601);
							Static494.method7075(local221, arg0, local87, local238, 18601);
						}
					} else {
						local79 = Static67.method9535(Static8.anInt99, arg3 + local10, Static14.anInt206);
						local87 = Static67.method9535(Static8.anInt99, arg3 - local10, Static14.anInt206);
						if (Static519.anInt8267 >= local70) {
							Static494.method7075(local87, arg0, local79, Static449.anIntArrayArray48[local70], 18601);
						}
						if (local163 >= Static617.anInt9501) {
							Static494.method7075(local87, arg0, local79, Static449.anIntArrayArray48[local163], 18601);
						}
					}
				}
			}
			local163 = arg4 - local10;
			local70 = arg4 + local10;
			if (local70 >= Static617.anInt9501 && local163 <= Static519.anInt8267) {
				local79 = local21 + arg3;
				local87 = arg3 - local21;
				if (Static8.anInt99 <= local79 && local87 <= Static14.anInt206) {
					local79 = Static67.method9535(Static8.anInt99, local79, Static14.anInt206);
					local87 = Static67.method9535(Static8.anInt99, local87, Static14.anInt206);
					if (local15 <= local10) {
						if (Static519.anInt8267 >= local70) {
							Static494.method7075(local87, arg0, local79, Static449.anIntArrayArray48[local70], 18601);
						}
						if (local163 >= Static617.anInt9501) {
							Static494.method7075(local87, arg0, local79, Static449.anIntArrayArray48[local163], 18601);
						}
					} else {
						local95 = local26 >= local10 ? local26 : Static231.anIntArray285[local10];
						local221 = Static67.method9535(Static8.anInt99, arg3 + local95, Static14.anInt206);
						local231 = Static67.method9535(Static8.anInt99, arg3 - local95, Static14.anInt206);
						if (local70 <= Static519.anInt8267) {
							local238 = Static449.anIntArrayArray48[local70];
							Static494.method7075(local87, arg0, local231, local238, 18601);
							Static494.method7075(local231, arg2, local221, local238, 18601);
							Static494.method7075(local221, arg0, local79, local238, 18601);
						}
						if (Static617.anInt9501 <= local163) {
							local238 = Static449.anIntArrayArray48[local163];
							Static494.method7075(local87, arg0, local231, local238, 18601);
							Static494.method7075(local231, arg2, local221, local238, 18601);
							Static494.method7075(local221, arg0, local79, local238, 18601);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Z")
	public static boolean method1773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static562.method7824(arg0, arg1) | (arg0 & 0x70000) != 0 || Static409.method6022(arg0, arg1);
	}
}
