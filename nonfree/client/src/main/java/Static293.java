import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!oi;")
	public static Class185 aClass185_76;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public static int anInt4886 = 104;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_179 = new Class67(29, 6);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!nh;")
	public static final Class170 aClass170_6 = new Class170("LOCAL", 4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method3905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static452.aClass139Array3 == null) {
			return;
		}
		@Pc(8) Class11_Sub1_Sub3 local8 = null;
		@Pc(18) int local18;
		if (arg1 < 0) {
			local18 = -arg1 - 1;
			if (local18 == Static220.anInt4038) {
				local8 = Static94.aClass11_Sub1_Sub3_Sub2_1;
			} else {
				local8 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local18];
			}
		} else {
			local18 = arg1 - 1;
			@Pc(44) Class1_Sub44 local44 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local18);
			if (local44 != null) {
				local8 = local44.aClass11_Sub1_Sub3_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(59) Class87 local59 = Static86.aClass248_7.method5246(arg11);
		@Pc(70) int local70;
		@Pc(73) int local73;
		if (arg6 == 1 || arg6 == 3) {
			local70 = local59.anInt1916;
			local73 = local59.anInt1959;
		} else {
			local70 = local59.anInt1959;
			local73 = local59.anInt1916;
		}
		@Pc(87) int local87 = arg10 + (local73 >> 1);
		@Pc(95) int local95 = arg10 + (local73 + 1 >> 1);
		@Pc(101) int local101 = (local70 >> 1) + arg0;
		@Pc(109) int local109 = (local70 + 1 >> 1) + arg0;
		@Pc(113) Class139 local113 = Static452.aClass139Array3[arg7];
		@Pc(138) int local138 = local113.ua(local87, local101) + local113.ua(local95, local101) + local113.ua(local87, local109) + local113.ua(local95, local109) >> 2;
		@Pc(142) Class1_Sub24 local142 = new Class1_Sub24();
		local142.anInt3678 = arg6;
		@Pc(154) int local154;
		if (arg12 < arg4) {
			local154 = arg4;
			arg4 = arg12;
			arg12 = local154;
		}
		local142.anInt3666 = arg10;
		local142.anInt3669 = local8.aByte90;
		local142.anInt3676 = arg8;
		local142.anInt3667 = arg11;
		local142.anInt3677 = arg0;
		local142.anInt3675 = arg2 + Static98.anInt1304;
		local142.anInt3674 = Static98.anInt1304 + arg3;
		local142.anInt3670 = arg4 + arg10;
		if (arg5 > arg9) {
			local154 = arg5;
			arg5 = arg9;
			arg9 = local154;
		}
		local142.anInt3665 = arg12 + arg10;
		local142.anInt3668 = arg9 + arg0;
		local142.anInt3664 = arg0 + arg5;
		local142.anInt3673 = (local142.anInt3666 << 7) + (local73 << 6);
		local142.anInt3672 = local138;
		local142.anInt3679 = (local70 << 6) + (local142.anInt3677 << 7);
		Static231.aClass14_24.method205(local142);
		local8.aClass1_Sub24_3 = local142;
	}
}
