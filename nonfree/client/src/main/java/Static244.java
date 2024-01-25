import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!il", name = "j", descriptor = "I")
	public static int anInt4815;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!uq;IIIII)V")
	public static void method4103(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static603.anInt9778) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static573.anInt6750) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static547.anInt9143 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class351 local62 = Static567.aClass351ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static637.aClass91Array4[local17].method7724(local32, local23) + Static637.aClass91Array4[local17].method7724(local32, local23 + 1) + Static637.aClass91Array4[local17].method7724(local32 + 1, local23) + Static637.aClass91Array4[local17].method7724(local32 + 1, local23 + 1)) / 4 - (Static637.aClass91Array4[arg1].method7724(arg3, arg2) + Static637.aClass91Array4[arg1].method7724(arg3, arg2 + 1) + Static637.aClass91Array4[arg1].method7724(arg3 + 1, arg2) + Static637.aClass91Array4[arg1].method7724(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class9_Sub2_Sub3 local151 = local62.aClass9_Sub2_Sub3_2;
									@Pc(154) Class9_Sub2_Sub3 local154 = local62.aClass9_Sub2_Sub3_1;
									if (local151 != null && local151.method8610()) {
										arg0.method8609(Static568.aClass82_14, local1, local148, local151, (local32 - arg3) * Static188.anInt3555 + (1 - arg5) * Static493.anInt8365, (local23 - arg2) * Static188.anInt3555 + (1 - arg4) * Static493.anInt8365);
									}
									if (local154 != null && local154.method8610()) {
										arg0.method8609(Static568.aClass82_14, local1, local148, local154, (local32 - arg3) * Static188.anInt3555 + (1 - arg5) * Static493.anInt8365, (local23 - arg2) * Static188.anInt3555 + (1 - arg4) * Static493.anInt8365);
									}
									for (@Pc(227) Class105 local227 = local62.aClass105_3; local227 != null; local227 = local227.aClass105_1) {
										@Pc(231) Class9_Sub2_Sub1 local231 = local227.aClass9_Sub2_Sub1_1;
										if (local231 != null && local231.method8610() && (local23 == local231.aShort126 || local23 == local3) && (local32 == local231.aShort124 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort127 + 1 - local231.aShort126;
											@Pc(268) int local268 = local231.aShort125 + 1 - local231.aShort124;
											arg0.method8609(Static568.aClass82_14, local1, local148, local231, (local231.aShort124 - arg3) * Static188.anInt3555 + (local268 - arg5) * Static493.anInt8365, (local231.aShort126 - arg2) * Static188.anInt3555 + (local260 - arg4) * Static493.anInt8365);
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

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method4104() {
		Static412.method6389(false);
		if (Static94.anInt1855 >= 0 && Static94.anInt1855 != 0) {
			Static230.method3973(Static94.anInt1855, false);
			Static94.anInt1855 = -1;
		}
	}
}
