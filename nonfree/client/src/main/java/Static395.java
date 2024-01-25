import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public static int anInt3530;

	@OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_40 = new Class274(106, 0);

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "[S")
	public static final short[] aShortArray40 = new short[] { 30, 23, 17, 22, 4, 18, 8, 12 };

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!gs;)V")
	public static void method2904(@OriginalArg(0) Class11_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static336.anIntArray411[local4]; local7++) {
				if (Static317.aClass11_Sub1ArrayArray2[local4][local7] == arg0) {
					Static649.method4860(Static317.aClass11_Sub1ArrayArray2[local4], local7 + 1, Static317.aClass11_Sub1ArrayArray2[local4], local7, Static336.anIntArray411[local4] - local7 - 1);
					local37 = Static336.anIntArray411[local4]--;
					Static445.aBoolean594 = true;
					return;
				}
			}
			for (@Pc(51) int local51 = 0; local51 < Static442.anIntArray535[local4]; local51++) {
				if (Static146.aClass11_Sub1ArrayArray1[local4][local51] == arg0) {
					Static649.method4860(Static146.aClass11_Sub1ArrayArray1[local4], local51 + 1, Static146.aClass11_Sub1ArrayArray1[local4], local51, Static442.anIntArray535[local4] - local51 - 1);
					local37 = Static442.anIntArray535[local4]--;
					return;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < Static429.anIntArray527[local4]; local93++) {
				if (Static483.aClass11_Sub1ArrayArray3[local4][local93] == arg0) {
					Static649.method4860(Static483.aClass11_Sub1ArrayArray3[local4], local93 + 1, Static483.aClass11_Sub1ArrayArray3[local4], local93, Static429.anIntArray527[local4] - local93 - 1);
					local37 = Static429.anIntArray527[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)Z")
	public static boolean method2905() {
		return Static158.anInt3597 != 0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg3;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(100) int local100 = local37 - local53 * (local61 - 1);
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local29 << 2;
		@Pc(112) int local112 = local33 << 2;
		@Pc(116) int local116 = local37 << 2;
		@Pc(120) int local120 = local41 * 3;
		@Pc(126) int local126 = (local57 - 3) * local45;
		@Pc(130) int local130 = local49 * 3;
		@Pc(136) int local136 = local53 * (local61 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg0 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local21 - 1);
		@Pc(156) int[] local156 = Static618.anIntArrayArray101[arg5];
		Static259.method4236(arg6 - arg4, arg6 - local16, arg2, local156);
		Static259.method4236(arg6 - local16, local16 + arg6, arg1, local156);
		Static259.method4236(arg6 + local16, arg6 - -arg4, arg2, local156);
		while (local9 > 0) {
			@Pc(197) boolean local197 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local138;
					local70 += local120;
					local138 += local108;
					local120 += local108;
					local7++;
				}
			}
			if (local197) {
				if (local88 < 0) {
					while (local88 < 0) {
						local100 += local146;
						local88 += local130;
						local130 += local116;
						local11++;
						local146 += local116;
					}
				}
				if (local100 < 0) {
					local88 += local130;
					local100 += local146;
					local11++;
					local130 += local116;
					local146 += local116;
				}
				local88 += -local152;
				local100 += -local136;
				local152 -= local112;
				local136 -= local112;
			}
			if (local79 < 0) {
				local79 += local138;
				local70 += local120;
				local138 += local108;
				local7++;
				local120 += local108;
			}
			local70 += -local144;
			local79 += -local126;
			local9--;
			local126 -= local104;
			local144 -= local104;
			@Pc(333) int local333 = arg5 - local9;
			@Pc(337) int local337 = arg5 + local9;
			@Pc(342) int local342 = arg6 + local7;
			@Pc(347) int local347 = arg6 - local7;
			if (local197) {
				@Pc(371) int local371 = local11 + arg6;
				@Pc(376) int local376 = arg6 - local11;
				Static259.method4236(local347, local376, arg2, Static618.anIntArrayArray101[local333]);
				Static259.method4236(local376, local371, arg1, Static618.anIntArrayArray101[local333]);
				Static259.method4236(local371, local342, arg2, Static618.anIntArrayArray101[local333]);
				Static259.method4236(local347, local376, arg2, Static618.anIntArrayArray101[local337]);
				Static259.method4236(local376, local371, arg1, Static618.anIntArrayArray101[local337]);
				Static259.method4236(local371, local342, arg2, Static618.anIntArrayArray101[local337]);
			} else {
				Static259.method4236(local347, local342, arg2, Static618.anIntArrayArray101[local333]);
				Static259.method4236(local347, local342, arg2, Static618.anIntArrayArray101[local337]);
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z")
	public static boolean method2908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static588.method8115(arg0, arg1) | Static571.method7845(arg1, arg0) | Static491.method7021(arg1, arg0)) & Static486.method6974(arg1, arg0);
	}
}
