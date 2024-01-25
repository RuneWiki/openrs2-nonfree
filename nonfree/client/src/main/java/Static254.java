import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ga;IIIII)V")
	public static void method6950(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static462.anInt8470) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static477.anInt8929) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static562.anInt10128 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class100 local62 = Static395.aClass100ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static9.aClass65Array1[local17].method7995(local32, local23) + Static9.aClass65Array1[local17].method7995(local32, local23 + 1) + Static9.aClass65Array1[local17].method7995(local32 + 1, local23) + Static9.aClass65Array1[local17].method7995(local32 + 1, local23 + 1)) / 4 - (Static9.aClass65Array1[arg1].method7995(arg3, arg2) + Static9.aClass65Array1[arg1].method7995(arg3, arg2 + 1) + Static9.aClass65Array1[arg1].method7995(arg3 + 1, arg2) + Static9.aClass65Array1[arg1].method7995(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class3_Sub1_Sub5 local151 = local62.aClass3_Sub1_Sub5_2;
									@Pc(154) Class3_Sub1_Sub5 local154 = local62.aClass3_Sub1_Sub5_1;
									if (local151 != null && local151.method8612()) {
										arg0.method8604(Static194.aClass20_5, local148, local1, local151, (local32 - arg3) * Static582.anInt10356 + (1 - arg5) * Static361.anInt7189, (local23 - arg2) * Static582.anInt10356 + (1 - arg4) * Static361.anInt7189);
									}
									if (local154 != null && local154.method8612()) {
										arg0.method8604(Static194.aClass20_5, local148, local1, local154, (local32 - arg3) * Static582.anInt10356 + (1 - arg5) * Static361.anInt7189, (local23 - arg2) * Static582.anInt10356 + (1 - arg4) * Static361.anInt7189);
									}
									for (@Pc(227) Class243 local227 = local62.aClass243_1; local227 != null; local227 = local227.aClass243_3) {
										@Pc(231) Class3_Sub1_Sub3 local231 = local227.aClass3_Sub1_Sub3_1;
										if (local231 != null && local231.method8612() && (local23 == local231.aShort118 || local23 == local3) && (local32 == local231.aShort120 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort121 + 1 - local231.aShort118;
											@Pc(268) int local268 = local231.aShort119 + 1 - local231.aShort120;
											arg0.method8604(Static194.aClass20_5, local148, local1, local231, (local231.aShort120 - arg3) * Static582.anInt10356 + (local268 - arg5) * Static361.anInt7189, (local231.aShort118 - arg2) * Static582.anInt10356 + (local260 - arg4) * Static361.anInt7189);
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
