import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!gp;")
	public static Class117 aClass117_228;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!gp;")
	public static Class117 aClass117_229;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public static int anInt8989;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_227 = new Class150(65, 4);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
	public static void method7269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(39) int local39 = arg1 << 1;
		@Pc(47) int local47 = local21 + local13 * (1 - local39);
		@Pc(55) int local55 = local17 - local25 * (local39 - 1);
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local21 * 3;
		@Pc(79) int local79 = local25 * ((arg1 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (Static4.anInt6709 <= arg0 && Static492.anInt8451 >= arg0) {
			local103 = Static418.method6023(Static398.anInt7144, arg3 + arg2, Static71.anInt4958);
			local112 = Static418.method6023(Static398.anInt7144, arg2 - arg3, Static71.anInt4958);
			Static321.method5153(arg4, local112, Static352.anIntArrayArray51[arg0], local103);
		}
		@Pc(128) int local128 = local59 * (arg1 - 1);
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local47 += local71;
					local55 += local85;
					local85 += local63;
					local71 += local63;
					local7++;
				}
			}
			if (local55 < 0) {
				local47 += local71;
				local55 += local85;
				local7++;
				local71 += local63;
				local85 += local63;
			}
			local55 += -local79;
			local47 += -local128;
			local128 -= local59;
			local9--;
			local79 -= local59;
			local103 = arg0 - local9;
			local112 = local9 + arg0;
			if (Static4.anInt6709 <= local112 && local103 <= Static492.anInt8451) {
				@Pc(224) int local224 = Static418.method6023(Static398.anInt7144, local7 + arg2, Static71.anInt4958);
				@Pc(232) int local232 = Static418.method6023(Static398.anInt7144, arg2 - local7, Static71.anInt4958);
				if (Static4.anInt6709 <= local103) {
					Static321.method5153(arg4, local232, Static352.anIntArrayArray51[local103], local224);
				}
				if (Static492.anInt8451 >= local112) {
					Static321.method5153(arg4, local232, Static352.anIntArrayArray51[local112], local224);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIII)V")
	public static void method7271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg1 + 1;
		Static321.method5153(arg0, arg2, Static352.anIntArrayArray51[arg1], arg3);
		@Pc(20) int local20 = arg4 - 1;
		Static321.method5153(arg0, arg2, Static352.anIntArrayArray51[arg4], arg3);
		for (@Pc(25) int local25 = local7; local25 <= local20; local25++) {
			@Pc(36) int[] local36 = Static352.anIntArrayArray51[local25];
			local36[arg2] = local36[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method7272() {
		Static339.aClass288_46.method6744();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IFFIIIIBI[FI)V")
	public static void method7273(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg6 - arg3;
		@Pc(9) int local9 = arg5 - arg0;
		@Pc(17) int local17 = arg4 - arg9;
		@Pc(38) float local38 = arg8[2] * (float) local17 + arg8[1] * (float) local9 + arg8[0] * (float) local5;
		@Pc(64) float local64 = arg8[3] * (float) local5 + (float) local9 * arg8[4] + arg8[5] * (float) local17;
		@Pc(85) float local85 = (float) local17 * arg8[8] + arg8[7] * (float) local9 + (float) local5 * arg8[6];
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local96 *= arg2;
		}
		@Pc(110) float local110 = local64 + arg1 + 0.5F;
		@Pc(135) float local135;
		if (arg7 == 1) {
			local135 = local96;
			local96 = -local110;
			local110 = local135;
		} else if (arg7 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg7 == 3) {
			local135 = local96;
			local96 = local110;
			local110 = -local135;
		}
		Static456.aFloat330 = local110;
		Static70.aFloat49 = local96;
	}
}
