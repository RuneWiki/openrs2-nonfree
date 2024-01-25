import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static730 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!tl;IIIII)V")
	public static void method8701(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static97.anInt1761) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static372.anInt5930) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static545.anInt8590 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class311 local62 = Static632.aClass311ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static158.aClass133Array4[local17].method8217(local23, local32) + Static158.aClass133Array4[local17].method8217(local23 + 1, local32) + Static158.aClass133Array4[local17].method8217(local23, local32 + 1) + Static158.aClass133Array4[local17].method8217(local23 + 1, local32 + 1)) / 4 - (Static158.aClass133Array4[arg1].method8217(arg2, arg3) + Static158.aClass133Array4[arg1].method8217(arg2 + 1, arg3) + Static158.aClass133Array4[arg1].method8217(arg2, arg3 + 1) + Static158.aClass133Array4[arg1].method8217(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class4_Sub2_Sub3 local151 = local62.aClass4_Sub2_Sub3_2;
									@Pc(154) Class4_Sub2_Sub3 local154 = local62.aClass4_Sub2_Sub3_1;
									if (local151 != null && local151.method8968()) {
										arg0.method8967(local151, (local23 - arg2) * Static60.anInt1042 + (1 - arg4) * Static328.anInt5032, Static689.aClass145_16, (local32 - arg3) * Static60.anInt1042 + (1 - arg5) * Static328.anInt5032, local1, local148, (byte) 89);
									}
									if (local154 != null && local154.method8968()) {
										arg0.method8967(local154, (local23 - arg2) * Static60.anInt1042 + (1 - arg4) * Static328.anInt5032, Static689.aClass145_16, (local32 - arg3) * Static60.anInt1042 + (1 - arg5) * Static328.anInt5032, local1, local148, (byte) 89);
									}
									for (@Pc(227) Class142 local227 = local62.aClass142_2; local227 != null; local227 = local227.aClass142_1) {
										@Pc(231) Class4_Sub2_Sub1 local231 = local227.aClass4_Sub2_Sub1_1;
										if (local231 != null && local231.method8968() && (local23 == local231.aShort130 || local23 == local3) && (local32 == local231.aShort127 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort128 + 1 - local231.aShort130;
											@Pc(268) int local268 = local231.aShort129 + 1 - local231.aShort127;
											arg0.method8967(local231, (local231.aShort130 - arg2) * Static60.anInt1042 + (local260 - arg4) * Static328.anInt5032, Static689.aClass145_16, (local231.aShort127 - arg3) * Static60.anInt1042 + (local268 - arg5) * Static328.anInt5032, local1, local148, (byte) 89);
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
