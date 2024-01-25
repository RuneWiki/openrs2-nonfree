import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
	public static int anInt2336;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_41 = new Class57(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
	public static final int[] anIntArray236 = new int[50];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIZIIIIIIII)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static337.aClass7Array3 == null) {
			return;
		}
		@Pc(18) Class28_Sub1_Sub1 local18;
		@Pc(14) int local14;
		if (arg6 >= 0) {
			local14 = arg6 - 1;
			local18 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local14];
		} else {
			local14 = -arg6 - 1;
			if (Static376.anInt6265 == local14) {
				local18 = Static226.aClass28_Sub1_Sub1_Sub2_2;
			} else {
				local18 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(44) Class60 local44 = Static97.aClass217_4.method5007(arg4);
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg0 == 1 || arg0 == 3) {
			local57 = local44.anInt1390;
			local60 = local44.anInt1427;
		} else {
			local57 = local44.anInt1427;
			local60 = local44.anInt1390;
		}
		@Pc(79) int local79 = arg3 + (local60 >> 1);
		@Pc(87) int local87 = (local60 + 1 >> 1) + arg3;
		@Pc(94) int local94 = arg10 + (local57 >> 1);
		@Pc(102) int local102 = arg10 + (local57 + 1 >> 1);
		@Pc(106) Class7 local106 = Static337.aClass7Array3[arg8];
		@Pc(128) int local128 = local106.method5648(local79, local94) + local106.method5648(local87, local94) + local106.method5648(local79, local102) + local106.method5648(local87, local102) >> 2;
		@Pc(132) Class3_Sub32 local132 = new Class3_Sub32();
		local132.anInt4599 = arg11;
		local132.anInt4604 = Static76.anInt1617 + arg7;
		local132.anInt4608 = local18.aByte73;
		local132.anInt4615 = arg4;
		local132.anInt4607 = arg10;
		@Pc(159) int local159;
		if (arg5 < arg9) {
			local159 = arg9;
			arg9 = arg5;
			arg5 = local159;
		}
		local132.anInt4617 = arg0;
		local132.anInt4602 = Static76.anInt1617 + arg12;
		local132.anInt4609 = arg3;
		local132.anInt4610 = arg3 + arg5;
		local132.anInt4603 = arg3 + arg9;
		if (arg2 > arg1) {
			local159 = arg2;
			arg2 = arg1;
			arg1 = local159;
		}
		local132.anInt4612 = arg10 + arg2;
		local132.anInt4600 = arg10 + arg1;
		local132.anInt4614 = local128;
		local132.anInt4601 = (local57 << 6) + (local132.anInt4607 << 7);
		local132.anInt4606 = (local60 << 6) + (local132.anInt4609 << 7);
		Static35.aClass138_6.method3053(local132);
		local18.aClass3_Sub32_3 = local132;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)Z")
	public static boolean method1972(@OriginalArg(1) int arg0) {
		if (arg0 == 57 || arg0 == 17 || arg0 == 50 || arg0 == 51 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1008;
		}
	}
}
