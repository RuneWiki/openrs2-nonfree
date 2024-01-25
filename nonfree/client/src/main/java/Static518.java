import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "[Lclient!s;")
	public static Class91[] aClass91Array2;

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
	public static int anInt8723 = 0;

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_65 = new Class384(5, 1);

	@OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
	public static int anInt8728 = -1;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBIIIILclient!ni;Lclient!ni;II)V")
	public static void method7520(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class9_Sub2_Sub1_Sub2 arg3, @OriginalArg(7) Class9_Sub2_Sub1_Sub2 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(11) int local11 = arg4.method8627();
		if (local11 == -1) {
			return;
		}
		@Pc(25) Class103 local25 = (Class103) Static126.aClass136_18.method3134((long) local11);
		if (local25 == null) {
			@Pc(32) Class251[] local32 = Static656.method6338(Static419.aClass343_200, local11);
			if (local32 == null) {
				return;
			}
			local25 = Static266.aClass82_8.method6106(local32[0], true);
			Static126.aClass136_18.method3135(local25, (long) local11);
		}
		Static537.method7780(arg3.anInt10158, arg1 >> 1, 0, arg3.method8619() * 256, arg3.anInt10152, arg6 >> 1, arg3.aByte127);
		@Pc(79) int local79 = arg2 + Static272.anIntArray292[0] - 18;
		@Pc(87) int local87 = local79 + arg0 / 4 * 18;
		@Pc(98) int local98 = arg5 + Static272.anIntArray292[1] - 16 - 54;
		@Pc(106) int local106 = local98 + arg0 % 4 * 18;
		local25.method7462(local87, local106);
		if (arg3 == arg4) {
			Static266.aClass82_8.method6137(18, local87 - 1, 18, local106 - 1, -256);
		}
		Static304.method7235(local87 + 18, local106 + 18, local87 - 1, local106 + -1);
		@Pc(142) Class9_Sub9 local142 = Static328.method5386();
		local142.anInt6858 = local87;
		local142.anInt6860 = local106;
		local142.anInt6862 = local106 + 16;
		local142.aClass9_Sub2_Sub1_Sub2_1 = arg4;
		local142.anInt6859 = local87 + 16;
		Static371.aClass139_9.method3203(local142);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!dc;)Lclient!uw;")
	public static Class345 method7522(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method5633();
		@Pc(14) Class293 local14 = Static76.method1319()[arg0.method5633()];
		@Pc(21) Class15 local21 = Static582.method8112()[arg0.method5633()];
		@Pc(25) int local25 = arg0.method5624();
		@Pc(29) int local29 = arg0.method5624();
		@Pc(33) int local33 = arg0.method5610();
		@Pc(37) int local37 = arg0.method5610();
		@Pc(41) int local41 = arg0.method5585();
		@Pc(45) int local45 = arg0.method5585();
		@Pc(49) int local49 = arg0.method5585();
		@Pc(58) boolean local58 = arg0.method5633() == 1;
		return new Class345(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local58);
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	public static void method7523() {
		Static365.aClass136_42.method3142();
		Static552.aClass136_63.method3142();
		Static238.aClass136_65.method3142();
		Static84.aClass136_61.method3142();
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V")
	public static void method7525() {
		for (@Pc(10) Class3_Sub7_Sub16 local10 = (Class3_Sub7_Sub16) Static109.aClass216_11.method5457(); local10 != null; local10 = (Class3_Sub7_Sub16) Static109.aClass216_11.method5458()) {
			@Pc(15) Class9_Sub2_Sub1_Sub5 local15 = local10.aClass9_Sub2_Sub1_Sub5_1;
			if (Static304.anInt8391 > local15.anInt8763) {
				local10.method8682();
				local15.method7560();
			} else if (local15.anInt8759 <= Static304.anInt8391) {
				local15.method7554();
				if (local15.anInt8747 > 0) {
					@Pc(46) Class3_Sub43 local46 = (Class3_Sub43) Static545.aClass25_40.method426((long) (local15.anInt8747 - 1));
					if (local46 != null) {
						@Pc(51) Class9_Sub2_Sub1_Sub2_Sub2 local51 = local46.aClass9_Sub2_Sub1_Sub2_Sub2_2;
						if (local51.anInt10152 >= 0 && local51.anInt10152 < Static399.anInt7121 * 512 && local51.anInt10158 >= 0 && local51.anInt10158 < Static24.anInt345 * 512) {
							local15.method7559(Static594.method8211(local51.anInt10152, local51.anInt10158, local15.aByte127) - local15.anInt8778, local51.anInt10152, Static304.anInt8391, local51.anInt10158);
						}
					}
				}
				if (local15.anInt8747 < 0) {
					@Pc(101) int local101 = -local15.anInt8747 - 1;
					@Pc(108) Class9_Sub2_Sub1_Sub2_Sub1 local108;
					if (local101 == Static54.anInt1032) {
						local108 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1;
					} else {
						local108 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local101];
					}
					if (local108 != null && local108.anInt10152 >= 0 && Static399.anInt7121 * 512 > local108.anInt10152 && local108.anInt10158 >= 0 && Static24.anInt345 * 512 > local108.anInt10158) {
						local15.method7559(Static594.method8211(local108.anInt10152, local108.anInt10158, local15.aByte127) - local15.anInt8778, local108.anInt10152, Static304.anInt8391, local108.anInt10158);
					}
				}
				local15.method7557(Static487.anInt8277);
				Static627.method8508(local15, true);
			}
		}
	}
}
