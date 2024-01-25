import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!tf;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "J")
	public static long aLong15 = 0L;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([Ljava/lang/String;IBI[S)V")
	public static void method221(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local71;
				@Pc(85) short local85 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local85;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method221(arg0, local16 - 1, arg2, arg3);
		method221(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(CLjava/lang/String;B)I")
	public static int method226(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static372.aClass106Array11 == null) {
			return;
		}
		@Pc(18) Class4_Sub2_Sub2 local18;
		@Pc(14) int local14;
		if (arg1 >= 0) {
			local14 = arg1 - 1;
			local18 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local14];
		} else {
			local14 = -arg1 - 1;
			if (Static393.anInt6881 == local14) {
				local18 = Static231.aClass4_Sub2_Sub2_Sub1_2;
			} else {
				local18 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(48) Class250 local48 = Static406.aClass150_3.method3508(arg8);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg0 == 1 || arg0 == 3) {
			local61 = local48.anInt7185;
			local64 = local48.anInt7150;
		} else {
			local61 = local48.anInt7150;
			local64 = local48.anInt7185;
		}
		@Pc(78) int local78 = (local64 >> 1) + arg2;
		@Pc(86) int local86 = (local64 + 1 >> 1) + arg2;
		@Pc(92) int local92 = (local61 >> 1) + arg9;
		@Pc(100) int local100 = arg9 + (local61 + 1 >> 1);
		@Pc(104) Class106 local104 = Static372.aClass106Array11[arg11];
		@Pc(128) int local128 = local104.I(local78, local92) + local104.I(local86, local92) + local104.I(local78, local100) + local104.I(local86, local100) >> 2;
		@Pc(132) Class2_Sub24 local132 = new Class2_Sub24();
		local132.anInt3885 = arg9;
		local132.anInt3887 = arg0;
		local132.anInt3888 = arg2;
		local132.anInt3898 = arg6 + Static164.anInt3206;
		local132.anInt3883 = arg4;
		local132.anInt3889 = local18.aByte92;
		@Pc(158) int local158;
		if (arg12 > arg5) {
			local158 = arg12;
			arg12 = arg5;
			arg5 = local158;
		}
		local132.anInt3890 = arg3 + Static164.anInt3206;
		local132.anInt3896 = arg8;
		local132.anInt3897 = arg12 + arg2;
		if (arg10 < arg7) {
			local158 = arg7;
			arg7 = arg10;
			arg10 = local158;
		}
		local132.anInt3895 = arg2 + arg5;
		local132.anInt3894 = arg7 + arg9;
		local132.anInt3886 = (local132.anInt3888 << 7) + (local64 << 6);
		local132.anInt3891 = (local132.anInt3885 << 7) + (local61 << 6);
		local132.anInt3892 = local128;
		local132.anInt3884 = arg9 + arg10;
		Static382.aClass265_46.method5999(local132);
		local18.aClass2_Sub24_3 = local132;
	}
}
