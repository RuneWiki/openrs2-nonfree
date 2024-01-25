import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_5 = new Class106(1, 2, 2, 0);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!tq;ZZ)V")
	public static void method3150(@OriginalArg(0) Class239 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt6429 == 0 ? arg0.anInt6435 : arg0.anInt6429;
		@Pc(24) int local24 = arg0.anInt6440 == 0 ? arg0.anInt6408 : arg0.anInt6440;
		Static311.method4453(arg1, Static129.aClass239ArrayArray1[arg0.anInt6423 >> 16], arg0.anInt6423, local24, local15);
		if (arg0.aClass239Array1 != null) {
			Static311.method4453(arg1, arg0.aClass239Array1, arg0.anInt6423, local24, local15);
		}
		@Pc(62) Class6_Sub16 local62 = (Class6_Sub16) Static20.aClass137_3.method3175((long) arg0.anInt6423);
		if (local62 != null) {
			Static65.method1235(local62.anInt2715, local15, local24, arg1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qq;Lclient!ps;IIIII)V")
	public static void method3151(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static268.anInt4600) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static401.anInt6621) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static364.anInt6134 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class189 local62 = Static30.aClass189ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static420.aClass84Array4[local17].method5322(local23, local32) + Static420.aClass84Array4[local17].method5322(local23 + 1, local32) + Static420.aClass84Array4[local17].method5322(local23, local32 + 1) + Static420.aClass84Array4[local17].method5322(local23 + 1, local32 + 1)) / 4 - (Static420.aClass84Array4[arg2].method5322(arg3, arg4) + Static420.aClass84Array4[arg2].method5322(arg3 + 1, arg4) + Static420.aClass84Array4[arg2].method5322(arg3, arg4 + 1) + Static420.aClass84Array4[arg2].method5322(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class3_Sub1 local143 = local62.aClass3_Sub1_1;
									@Pc(146) Class3_Sub1 local146 = local62.aClass3_Sub1_2;
									if (local143 != null && local143.method5791()) {
										arg1.method5794(local140, arg0, local143, local1, (local32 - arg4) * Static22.anInt397 + (1 - arg6) * Static25.anInt7191, (local23 - arg3) * Static22.anInt397 + (1 - arg5) * Static25.anInt7191);
									}
									if (local146 != null && local146.method5791()) {
										arg1.method5794(local140, arg0, local146, local1, (local32 - arg4) * Static22.anInt397 + (1 - arg6) * Static25.anInt7191, (local23 - arg3) * Static22.anInt397 + (1 - arg5) * Static25.anInt7191);
									}
									for (@Pc(219) Class242 local219 = local62.aClass242_2; local219 != null; local219 = local219.aClass242_4) {
										@Pc(223) Class3_Sub3 local223 = local219.aClass3_Sub3_2;
										if (local223 != null && local223.method5791() && (local23 == local223.aShort97 || local23 == local3) && (local32 == local223.aShort95 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort98 + 1 - local223.aShort97;
											@Pc(260) int local260 = local223.aShort96 + 1 - local223.aShort95;
											arg1.method5794(local140, arg0, local223, local1, (local223.aShort95 - arg4) * Static22.anInt397 + (local260 - arg6) * Static25.anInt7191, (local223.aShort97 - arg3) * Static22.anInt397 + (local252 - arg5) * Static25.anInt7191);
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!jk;")
	public static Class3_Sub4 method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub4_2;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V")
	public static void method3154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg2);
		@Pc(17) int local17 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg1);
		@Pc(23) int local23 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg3);
		@Pc(33) int local33 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg0);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static73.method1404(Static347.anIntArrayArray54[local35], local33, arg4, local23);
		}
	}
}
