import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
	public static int anInt2134;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array8;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_28 = new Class303(45, 3);

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!nd;")
	public static final Class222 aClass222_7 = new Class222();

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
	public static int anInt2133 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!et;Z)Z")
	public static boolean method1886(@OriginalArg(0) Class41_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static68.aClass34Array1 == Static426.aClass34Array5;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7854();
		if (arg0.aShort147 < 0 || arg0.aShort144 < 0 || arg0.aShort146 >= Static155.anInt3254 || arg0.aShort145 >= Static39.anInt747) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort147; local36 <= arg0.aShort146; local36++) {
			for (local40 = arg0.aShort144; local40 <= arg0.aShort145; local40++) {
				@Pc(47) Class299 local47 = Static12.method6301(arg0.aByte117, local36, local40);
				if (local47 != null) {
					@Pc(53) Class38 local53 = Static347.method5127(arg0);
					@Pc(56) Class38 local56 = local47.aClass38_2;
					if (local56 == null) {
						local47.aClass38_2 = local53;
					} else {
						while (local56.aClass38_1 != null) {
							local56 = local56.aClass38_1;
						}
						local56.aClass38_1 = local53;
					}
					if (local6 && (Static15.anIntArrayArray6[local36][local40] & 0xFF000000) != 0) {
						local8 = Static15.anIntArrayArray6[local36][local40];
						local10 = Static450.aShortArrayArray31[local36][local40];
						local12 = Static315.aByteArrayArray14[local36][local40];
					}
					if (!arg1 && local47.aClass41_Sub2_Sub5_1 != null && local47.aClass41_Sub2_Sub5_1.aShort64 > local33) {
						local33 = local47.aClass41_Sub2_Sub5_1.aShort64;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort147; local40 <= arg0.aShort146; local40++) {
				for (@Pc(136) int local136 = arg0.aShort144; local136 <= arg0.aShort145; local136++) {
					if ((Static15.anIntArrayArray6[local40][local136] & 0xFF000000) == 0) {
						Static15.anIntArrayArray6[local40][local136] = local8;
						Static450.aShortArrayArray31[local40][local136] = local10;
						Static315.aByteArrayArray14[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static294.aClass41_Sub2_Sub1Array7[Static460.anInt6105++] = arg0;
		} else {
			local40 = Static68.aClass34Array1 == Static426.aClass34Array5 ? 1 : 0;
			if (!arg0.method7847()) {
				Static533.aClass41_Sub2ArrayArray2[local40][Static505.anIntArray524[local40]++] = arg0;
			} else if (arg0.method7851()) {
				Static548.aClass41_Sub2ArrayArray3[local40][Static462.anIntArray496[local40]++] = arg0;
			} else {
				Static417.aClass41_Sub2ArrayArray1[local40][Static279.anIntArray622[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt9443 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg6);
		@Pc(17) int local17 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg0);
		@Pc(23) int local23 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg5);
		@Pc(29) int local29 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1);
		@Pc(37) int local37 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg6 + arg3);
		@Pc(53) int local53 = Static554.method7333(Static395.anInt6904, Static561.anInt2703, arg0 - arg3);
		for (@Pc(55) int local55 = local11; local55 < local37; local55++) {
			Static583.method7816(Static158.anIntArrayArray66[local55], arg4, local23, local29);
		}
		for (@Pc(75) int local75 = local17; local75 > local53; local75--) {
			Static583.method7816(Static158.anIntArrayArray66[local75], arg4, local23, local29);
		}
		@Pc(97) int local97 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 + arg5);
		@Pc(106) int local106 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - arg3);
		for (@Pc(108) int local108 = local37; local108 <= local53; local108++) {
			@Pc(114) int[] local114 = Static158.anIntArrayArray66[local108];
			Static583.method7816(local114, arg4, local23, local97);
			Static583.method7816(local114, arg2, local97, local106);
			Static583.method7816(local114, arg4, local106, local29);
		}
	}
}
