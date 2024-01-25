import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!f", name = "A", descriptor = "Lclient!vq;")
	public static Class47 aClass47_3;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "J")
	public static long aLong63;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public static int anInt2141 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIZBIII)Z")
	public static boolean method2005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static42.method837(Static246.anIntArray417, arg9, arg7, arg6, arg5, arg8, arg0, Static271.anIntArray441, Static158.aClass8_Sub1_Sub2_Sub1_1.method4349(), arg1, Static16.aClass170Array1[Static12.anInt267], arg4, arg2, arg3);
		if (local24 < 1) {
			return false;
		}
		Static18.anInt369 = Static246.anIntArray417[local24 - 1];
		Static39.anInt1027 = Static271.anIntArray441[local24 - 1];
		Static10.aBoolean21 = false;
		Static342.method5467();
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZZI)Lclient!tj;")
	public static Class193 method2007(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class214 local5 = null;
		if (Static248.aClass205_2 != null) {
			local5 = new Class214(arg0, Static248.aClass205_2, Static259.aClass205Array1[arg0], 1000000);
		}
		Static28.aClass7_Sub1Array6[arg0] = Static334.aClass25_6.method715(arg0, Static327.aClass214_4, local5);
		if (arg2) {
			Static28.aClass7_Sub1Array6[arg0].method2589();
		}
		return new Class193(Static28.aClass7_Sub1Array6[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)Lclient!hl;")
	public static Class8_Sub1_Sub2 method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class128 local11 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(23) Class8_Sub1_Sub2 local23 = null;
		@Pc(25) int local25 = -1;
		for (@Pc(28) Class117 local28 = local11.aClass117_2; local28 != null; local28 = local28.aClass117_1) {
			@Pc(32) Class8_Sub1 local32 = local28.aClass8_Sub1_1;
			if (local32 instanceof Class8_Sub1_Sub2) {
				@Pc(38) Class8_Sub1_Sub2 local38 = (Class8_Sub1_Sub2) local32;
				@Pc(48) int local48 = (local38.method4349() - 1) * 64 + 60;
				@Pc(56) int local56 = local38.anInt6701 - local48 >> 7;
				@Pc(64) int local64 = local38.anInt6702 - local48 >> 7;
				@Pc(71) int local71 = local48 + local38.anInt6701 >> 7;
				@Pc(78) int local78 = local48 + local38.anInt6702 >> 7;
				if (arg1 >= local56 && local64 <= arg2 && local71 >= arg1 && local78 >= arg2) {
					@Pc(112) int local112 = (local71 + 1 - arg1) * (local78 + 1 + -arg2);
					if (local25 < local112) {
						local25 = local112;
						local23 = local38;
					}
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
	public static int method2009(@OriginalArg(1) int arg0) {
		@Pc(7) Class28 local7 = Static344.method2698(arg0);
		@Pc(15) int local15 = local7.anInt1023;
		@Pc(18) int local18 = local7.anInt1017;
		@Pc(21) int local21 = local7.anInt1022;
		@Pc(28) int local28 = Class187.anIntArray458[local21 - local18];
		return local28 & Static328.anIntArray485[local15] >> local18;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZI)I")
	public static int method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static261.aClass60Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local11 < 0 || local20 < 0 || local11 > Static350.anInt6637 - 1 || local20 > Static105.anInt2647 - 1) {
			return 0;
		}
		@Pc(38) int local38 = arg0;
		if (arg0 < 3 && (Static2.aByteArrayArrayArray1[1][local11][local20] & 0x2) != 0) {
			local38 = arg0 + 1;
		}
		return Static261.aClass60Array2[local38].method2270(arg2, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
	public static void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(22) int local22 = arg4 * arg4;
		@Pc(26) int local26 = arg1 * arg1;
		@Pc(30) int local30 = local26 << 1;
		@Pc(34) int local34 = local22 << 1;
		@Pc(38) int local38 = arg1 << 1;
		@Pc(47) int local47 = local30 + (1 - local38) * local22;
		@Pc(56) int local56 = local26 - local34 * (local38 - 1);
		@Pc(60) int local60 = local22 << 2;
		@Pc(64) int local64 = local26 << 2;
		@Pc(72) int local72 = local30 * 3;
		@Pc(80) int local80 = ((arg1 << 1) - 3) * local34;
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = local60 * (arg1 - 1);
		Static135.method2878(Static223.anIntArrayArray124[arg3], arg4 + arg0, arg2, arg0 - arg4);
		while (local18 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local56 += local86;
					local47 += local72;
					local72 += local64;
					local16++;
					local86 += local64;
				}
			}
			if (local56 < 0) {
				local47 += local72;
				local56 += local86;
				local72 += local64;
				local16++;
				local86 += local64;
			}
			local47 += -local92;
			local56 += -local80;
			local18--;
			local92 -= local60;
			local80 -= local60;
			@Pc(182) int local182 = arg3 - local18;
			@Pc(186) int local186 = arg3 + local18;
			@Pc(190) int local190 = local16 + arg0;
			@Pc(195) int local195 = arg0 - local16;
			Static135.method2878(Static223.anIntArrayArray124[local182], local190, arg2, local195);
			Static135.method2878(Static223.anIntArrayArray124[local186], local190, arg2, local195);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method2012(@OriginalArg(1) Class193 arg0) {
		Static97.aClass193_34 = arg0;
		Static123.anInt2950 = Static97.aClass193_34.method5055(16);
	}
}
