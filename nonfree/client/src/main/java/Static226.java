import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
	public static int anInt4488;

	@OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
	public static int anInt4495;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZII)I", line = 43)
	public static int method4239(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static349.method6276(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray488.length) {
			return local13.anIntArray488[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 63)
	public static void method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static340.aClass6Array4 == null) {
			return;
		}
		@Pc(27) Class11_Sub5_Sub2 local27;
		@Pc(18) int local18;
		if (arg8 < 0) {
			local18 = -arg8 - 1;
			if (Class11_Sub3_Sub2.anInt4220 == local18) {
				local27 = Static17.aClass11_Sub5_Sub2_Sub1_3;
			} else {
				local27 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local18];
			}
		} else {
			local18 = arg8 - 1;
			local27 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local18];
		}
		if (local27 == null) {
			return;
		}
		@Pc(51) Class41 local51 = Static334.aClass202_4.method5164(arg1);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg10 == 1 || arg10 == 3) {
			local62 = local51.anInt1326;
			local65 = local51.anInt1354;
		} else {
			local62 = local51.anInt1354;
			local65 = local51.anInt1326;
		}
		@Pc(79) int local79 = (local62 >> 1) + arg0;
		@Pc(96) int local96 = arg0 + (local62 + 1 >> 1);
		@Pc(102) int local102 = (local65 >> 1) + arg11;
		@Pc(110) int local110 = (local65 + 1 >> 1) + arg11;
		@Pc(114) Class6 local114 = Static340.aClass6Array4[arg12];
		@Pc(138) int local138 = local114.method5720(local79, local102) + local114.method5720(local96, local102) + local114.method5720(local79, local110) + local114.method5720(local96, local110) >> 2;
		@Pc(142) Class2_Sub6 local142 = new Class2_Sub6();
		local142.anInt1109 = local27.aByte78;
		local142.anInt1117 = arg3 + Class83.anInt2345;
		local142.anInt1099 = Class83.anInt2345 + arg7;
		local142.anInt1116 = arg0;
		local142.anInt1108 = arg11;
		local142.anInt1111 = arg1;
		@Pc(170) int local170;
		if (arg5 < arg4) {
			local170 = arg4;
			arg4 = arg5;
			arg5 = local170;
		}
		local142.anInt1115 = arg9;
		local142.anInt1110 = arg10;
		if (arg6 > arg2) {
			local170 = arg6;
			arg6 = arg2;
			arg2 = local170;
		}
		local142.anInt1107 = arg0 + arg4;
		local142.anInt1106 = arg5 + arg0;
		local142.anInt1103 = (local142.anInt1116 << 7) + (local62 << 6);
		local142.anInt1101 = arg6 + arg11;
		local142.anInt1100 = (local65 << 6) + (local142.anInt1108 << 7);
		local142.anInt1112 = arg11 + arg2;
		local142.anInt1113 = local138;
		Class239.aClass135_40.method3541(local142);
		local27.aClass2_Sub6_3 = local142;
	}
}
