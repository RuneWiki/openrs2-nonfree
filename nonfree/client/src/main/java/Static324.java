import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIIII)V")
	public static void method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg1 + arg0;
		@Pc(19) int local19 = arg4 - arg0;
		for (@Pc(21) int local21 = arg1; local21 < local14; local21++) {
			Static280.method5108(arg3, Static208.anIntArrayArray20[local21], arg2, arg5);
		}
		@Pc(40) int local40 = arg3 - arg0;
		for (@Pc(42) int local42 = arg4; local42 > local19; local42--) {
			Static280.method5108(arg3, Static208.anIntArrayArray20[local42], arg2, arg5);
		}
		@Pc(64) int local64 = arg0 + arg2;
		for (@Pc(66) int local66 = local14; local66 <= local19; local66++) {
			@Pc(72) int[] local72 = Static208.anIntArrayArray20[local66];
			Static280.method5108(local64, local72, arg2, arg5);
			Static280.method5108(arg3, local72, local40, arg5);
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!jb;Z)Z")
	public static boolean method5602(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static9.aClass65Array1 == Static103.aClass65Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8219();
		if (arg0.aShort118 < 0 || arg0.aShort120 < 0 || arg0.aShort121 >= Static477.anInt8929 || arg0.aShort119 >= Static562.anInt10128) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort118; local36 <= arg0.aShort121; local36++) {
			for (local40 = arg0.aShort120; local40 <= arg0.aShort119; local40++) {
				@Pc(47) Class100 local47 = Static633.method9184(arg0.aByte132, local36, local40);
				if (local47 != null) {
					@Pc(53) Class243 local53 = Static184.method3871(arg0);
					@Pc(56) Class243 local56 = local47.aClass243_1;
					if (local56 == null) {
						local47.aClass243_1 = local53;
					} else {
						while (local56.aClass243_3 != null) {
							local56 = local56.aClass243_3;
						}
						local56.aClass243_3 = local53;
					}
					if (local6 && (Static118.anIntArrayArray13[local36][local40] & 0xFF000000) != 0) {
						local8 = Static118.anIntArrayArray13[local36][local40];
						local10 = Static15.aShortArrayArray1[local36][local40];
						local12 = Static98.aByteArrayArray6[local36][local40];
					}
					if (!arg1 && local47.aClass3_Sub1_Sub1_1 != null && local47.aClass3_Sub1_Sub1_1.aShort127 > local33) {
						local33 = local47.aClass3_Sub1_Sub1_1.aShort127;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort118; local40 <= arg0.aShort121; local40++) {
				for (@Pc(136) int local136 = arg0.aShort120; local136 <= arg0.aShort119; local136++) {
					if ((Static118.anIntArrayArray13[local40][local136] & 0xFF000000) == 0) {
						Static118.anIntArrayArray13[local40][local136] = local8;
						Static15.aShortArrayArray1[local40][local136] = local10;
						Static98.aByteArrayArray6[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static20.aClass3_Sub1_Sub3Array1[Static319.anInt6492++] = arg0;
		} else {
			local40 = Static9.aClass65Array1 == Static103.aClass65Array3 ? 1 : 0;
			if (!arg0.method8600()) {
				arg0.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local40];
				Static359.aClass3_Sub1Array94[local40] = arg0;
			} else if (arg0.method8601()) {
				arg0.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local40];
				Static548.aClass3_Sub1Array129[local40] = arg0;
			} else {
				arg0.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local40];
				Static124.aClass3_Sub1Array151[local40] = arg0;
				Static240.aBoolean380 = true;
			}
		}
		if (arg1) {
			arg0.anInt10306 -= local33;
		}
		return true;
	}
}
