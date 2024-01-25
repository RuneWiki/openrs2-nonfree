import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread7;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	public static int anInt8157;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "[I")
	public static final int[] anIntArray627 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method6553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg0 < 1 || arg4 > Static71.anInt1410 - 2 || Static471.anInt8012 - 2 < arg0) {
			return;
		}
		@Pc(32) int local32 = arg2;
		if (arg2 < 3 && Static466.method6426(arg0, arg4)) {
			local32 = arg2 + 1;
		}
		if (!Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) && !Static53.method976(local32, arg0, Static42.anInt691, arg4)) {
			return;
		}
		if (Static292.aClass39ArrayArrayArray2 == null) {
			return;
		}
		Static343.aClass26_Sub1_3.method423(arg0, Static478.aClass59Array2[arg2], arg6, Static16.aClass134_1, arg4, arg2);
		if (arg5 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static348.aClass1_Sub30_Sub1_1.aBoolean392;
		Static348.aClass1_Sub30_Sub1_1.aBoolean392 = true;
		Static343.aClass26_Sub1_3.method425(Static478.aClass59Array2[arg2], arg7, local32, arg0, arg5, arg3, Static16.aClass134_1, arg2, arg1, arg4);
		Static348.aClass1_Sub30_Sub1_1.aBoolean392 = local76;
		return;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg0;
		@Pc(21) int local21 = arg4 - arg0;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = local45 * (local57 - 3);
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = (local61 - 3) * local53;
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg4 - 1);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = (local21 - 1) * local108;
		@Pc(152) int[] local152 = Static171.anIntArrayArray79[arg3];
		Static433.method6039(arg1, arg5 - local16, local152, arg5 - arg6);
		Static433.method6039(arg2, arg5 + local16, local152, arg5 - local16);
		Static433.method6039(arg1, arg6 + arg5, local152, local16 + arg5);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local134;
					local70 += local116;
					local116 += local104;
					local134 += local104;
					local7++;
				}
			}
			if (local202) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local126 += local112;
						local142 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local87 += local126;
					local126 += local112;
					local142 += local112;
					local11++;
				}
				local87 += -local148;
				local96 += -local132;
				local148 -= local108;
				local132 -= local108;
			}
			if (local78 < 0) {
				local70 += local116;
				local78 += local134;
				local116 += local104;
				local134 += local104;
				local7++;
			}
			local70 += -local140;
			local78 += -local122;
			local122 -= local100;
			local9--;
			local140 -= local100;
			@Pc(342) int local342 = arg3 - local9;
			@Pc(347) int local347 = arg3 + local9;
			@Pc(351) int local351 = local7 + arg5;
			@Pc(356) int local356 = arg5 - local7;
			if (local202) {
				@Pc(380) int local380 = local11 + arg5;
				@Pc(385) int local385 = arg5 - local11;
				Static433.method6039(arg1, local385, Static171.anIntArrayArray79[local342], local356);
				Static433.method6039(arg2, local380, Static171.anIntArrayArray79[local342], local385);
				Static433.method6039(arg1, local351, Static171.anIntArrayArray79[local342], local380);
				Static433.method6039(arg1, local385, Static171.anIntArrayArray79[local347], local356);
				Static433.method6039(arg2, local380, Static171.anIntArrayArray79[local347], local385);
				Static433.method6039(arg1, local351, Static171.anIntArrayArray79[local347], local380);
			} else {
				Static433.method6039(arg1, local351, Static171.anIntArrayArray79[local342], local356);
				Static433.method6039(arg1, local351, Static171.anIntArrayArray79[local347], local356);
			}
		}
	}
}
