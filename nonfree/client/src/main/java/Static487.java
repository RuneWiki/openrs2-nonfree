import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt8139 = -1;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "S")
	public static short aShort110 = 32767;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIIIII)I")
	public static int method6720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg3 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg5;
		} else if (local14 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return 7 + 1 - arg5 - arg4;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method6722() {
		if (Static29.aClass45_1 != null) {
			Static29.aClass45_1.method6492();
		}
		if (Static194.aClass45_2 != null) {
			Static194.aClass45_2.method6492();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!mc;[BII)Lclient!waa;")
	public static Class339 method6723(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static27.anIntArray38, 0);
		if (Static27.anIntArray38[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class339(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!oa;Lclient!bo;IIIII)V")
	public static void method6724(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static41.anInt687) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static80.anInt1391) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static164.anInt2881 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class9 local62 = Static208.aClass9ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static285.aClass60Array8[local17].JA(local23, local32) + Static285.aClass60Array8[local17].JA(local23 + 1, local32) + Static285.aClass60Array8[local17].JA(local23, local32 + 1) + Static285.aClass60Array8[local17].JA(local23 + 1, local32 + 1)) / 4 - (Static285.aClass60Array8[arg2].JA(arg3, arg4) + Static285.aClass60Array8[arg2].JA(arg3 + 1, arg4) + Static285.aClass60Array8[arg2].JA(arg3, arg4 + 1) + Static285.aClass60Array8[arg2].JA(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class29_Sub5 local143 = local62.aClass29_Sub5_1;
									@Pc(146) Class29_Sub5 local146 = local62.aClass29_Sub5_2;
									if (local143 != null && local143.method7540()) {
										arg1.method7543(local143, local140, arg0, (local23 - arg3) * Static57.anInt953 + (1 - arg5) * Static431.anInt7547, (local32 - arg4) * Static57.anInt953 + (1 - arg6) * Static431.anInt7547, local1);
									}
									if (local146 != null && local146.method7540()) {
										arg1.method7543(local146, local140, arg0, (local23 - arg3) * Static57.anInt953 + (1 - arg5) * Static431.anInt7547, (local32 - arg4) * Static57.anInt953 + (1 - arg6) * Static431.anInt7547, local1);
									}
									for (@Pc(219) Class66 local219 = local62.aClass66_1; local219 != null; local219 = local219.aClass66_2) {
										@Pc(223) Class29_Sub2 local223 = local219.aClass29_Sub2_1;
										if (local223 != null && local223.method7540() && (local23 == local223.aShort122 || local23 == local3) && (local32 == local223.aShort121 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort124 + 1 - local223.aShort122;
											@Pc(260) int local260 = local223.aShort123 + 1 - local223.aShort121;
											arg1.method7543(local223, local140, arg0, (local223.aShort122 - arg3) * Static57.anInt953 + (local252 - arg5) * Static431.anInt7547, (local223.aShort121 - arg4) * Static57.anInt953 + (local260 - arg6) * Static431.anInt7547, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
