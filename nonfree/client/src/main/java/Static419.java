import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_24 = new Class10(12, 0, 1, 0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!eq;Lclient!bp;IIIII)V")
	public static void method6150(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static295.anInt5507) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static229.anInt4189) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static61.anInt1698 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class101 local62 = Static409.aClass101ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static55.aClass86Array1[local17].method6594(local23, local32) + Static55.aClass86Array1[local17].method6594(local23 + 1, local32) + Static55.aClass86Array1[local17].method6594(local23, local32 + 1) + Static55.aClass86Array1[local17].method6594(local23 + 1, local32 + 1)) / 4 - (Static55.aClass86Array1[arg2].method6594(arg3, arg4) + Static55.aClass86Array1[arg2].method6594(arg3 + 1, arg4) + Static55.aClass86Array1[arg2].method6594(arg3, arg4 + 1) + Static55.aClass86Array1[arg2].method6594(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class3_Sub3 local143 = local62.aClass3_Sub3_2;
									@Pc(146) Class3_Sub3 local146 = local62.aClass3_Sub3_1;
									if (local143 != null && local143.method5942()) {
										arg1.method5941((local32 - arg4) * Static168.anInt3377 + (1 - arg6) * Static437.anInt7761, local140, local143, (local23 - arg3) * Static168.anInt3377 + (1 - arg5) * Static437.anInt7761, local1, arg0);
									}
									if (local146 != null && local146.method5942()) {
										arg1.method5941((local32 - arg4) * Static168.anInt3377 + (1 - arg6) * Static437.anInt7761, local140, local146, (local23 - arg3) * Static168.anInt3377 + (1 - arg5) * Static437.anInt7761, local1, arg0);
									}
									for (@Pc(219) Class145 local219 = local62.aClass145_1; local219 != null; local219 = local219.aClass145_2) {
										@Pc(223) Class3_Sub2 local223 = local219.aClass3_Sub2_2;
										if (local223 != null && local223.method5942() && (local23 == local223.aShort101 || local23 == local3) && (local32 == local223.aShort102 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort100 + 1 - local223.aShort101;
											@Pc(260) int local260 = local223.aShort99 + 1 - local223.aShort102;
											arg1.method5941((local223.aShort102 - arg4) * Static168.anInt3377 + (local260 - arg6) * Static437.anInt7761, local140, local223, (local223.aShort101 - arg3) * Static168.anInt3377 + (local252 - arg5) * Static437.anInt7761, local1, arg0);
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
