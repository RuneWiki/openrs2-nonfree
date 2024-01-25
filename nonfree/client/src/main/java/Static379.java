import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Lclient!ni;")
	public static Class223 aClass223_80;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	public static int anInt7162 = 0;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
	public static final int[] anIntArray341 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V")
	public static void method6000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg4);
		@Pc(17) int local17 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg0);
		@Pc(23) int local23 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1);
		@Pc(29) int local29 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg2);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static571.method7990(arg3, Static173.anIntArrayArray15[local36], local23, local29);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ab;)V")
	public static void method6001(@OriginalArg(0) Class3 arg0) {
		if (Static402.anInt7480 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub10 local6 = arg0.aClass6_Sub10_1;
		Static489.aClass3Array1[Static402.anInt7480] = arg0;
		Static632.aBooleanArray26[Static402.anInt7480] = false;
		Static402.anInt7480++;
		@Pc(21) int local21 = arg0.anInt57;
		if (arg0.aBoolean5) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt57;
		if (arg0.aBoolean6) {
			local29 = Static618.anInt10427 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5320() + Static375.anInt7139 - local6.method5316() >> Static606.anInt10280;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5320() + local6.method5316() - Static375.anInt7139 >> Static606.anInt10280;
			if (local73 >= Static142.anInt3372) {
				local73 = Static142.anInt3372 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray1[local41++];
				@Pc(105) int local105 = (local6.method5312() + Static375.anInt7139 - local6.method5316() >> Static606.anInt10280) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static623.anInt10485) {
					local113 = Static623.anInt10485 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static531.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static531.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static402.anInt7480;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static531.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static402.anInt7480 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static531.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static402.anInt7480 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static531.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static402.anInt7480 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZII)V")
	public static void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static309.anInt6227 && arg1 + arg2 <= Static7.anInt464 && Static633.anInt10644 <= arg0 - arg1 && arg0 + arg1 <= Static389.anInt7300) {
			Static19.method598(arg2, arg3, arg1, arg0);
		} else {
			Static171.method3228(arg0, arg1, arg2, arg3);
		}
	}
}
