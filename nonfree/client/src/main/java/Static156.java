import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_21;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[Lclient!b;")
	public static Class6[] aClass6Array2;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!b;")
	public static Class6 aClass6_84;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public static int anInt3196;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_32 = new Class85(64);

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1539 = Static193.method3027(": ");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ce;B)Lclient!eg;")
	public static Class3_Sub2 method2291(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method1278();
		@Pc(16) int local16 = arg0.method1278();
		@Pc(20) Class3_Sub2 local20 = Static191.method2998(local16);
		local20.anInt4272 = arg0.method1278();
		@Pc(29) int local29 = arg0.method1278();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(36) int local36 = arg0.method1278();
			local20.method3337(arg0, local36);
		}
		local20.method3329();
		return local20;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!m;IIIII)V")
	public static void method2293(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static76.anInt1501) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static89.anInt659) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static126.anInt2489 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class3_Sub6 local62 = Static118.aClass3_Sub6ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static210.anIntArrayArrayArray12[local17][local23][local32] + Static210.anIntArrayArrayArray12[local17][local23 + 1][local32] + Static210.anIntArrayArrayArray12[local17][local23][local32 + 1] + Static210.anIntArrayArrayArray12[local17][local23 + 1][local32 + 1]) / 4 - (Static210.anIntArrayArrayArray12[arg1][arg2][arg3] + Static210.anIntArrayArrayArray12[arg1][arg2 + 1][arg3] + Static210.anIntArrayArrayArray12[arg1][arg2][arg3 + 1] + Static210.anIntArrayArrayArray12[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class36 local151 = local62.aClass36_1;
									if (local151 != null) {
										if (local151.aClass26_4.method2994()) {
											arg0.method2996(local151.aClass26_4, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass26_5 != null && local151.aClass26_5.method2994()) {
											arg0.method2996(local151.aClass26_5, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt827; local222++) {
										@Pc(228) Class99 local228 = local62.aClass99Array1[local222];
										if (local228 != null && local228.aClass26_11.method2994() && (local23 == local228.anInt4226 || local23 == local3) && (local32 == local228.anInt4239 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt4224 + 1 - local228.anInt4226;
											@Pc(265) int local265 = local228.anInt4230 + 1 - local228.anInt4239;
											arg0.method2996(local228.aClass26_11, (local228.anInt4226 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt4239 - arg3) * 128 + (local265 - arg5) * 64, local1);
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
