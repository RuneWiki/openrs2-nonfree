import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	public static int anInt7904;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas33;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_211 = new Class158("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
	public static int method6126(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)Z")
	public static boolean method6128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method6130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg1 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg1 - 1);
		Static228.method3480(arg3 - arg0, arg2, Static60.anIntArrayArray14[arg4], arg3 + arg0);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local63 += local55;
					local7++;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local38 += -local83;
			local47 += -local71;
			local71 -= local51;
			local83 -= local51;
			local9--;
			@Pc(166) int local166 = arg4 - local9;
			@Pc(170) int local170 = local9 + arg4;
			@Pc(174) int local174 = local7 + arg3;
			@Pc(178) int local178 = arg3 - local7;
			Static228.method3480(local178, arg2, Static60.anIntArrayArray14[local166], local174);
			Static228.method3480(local178, arg2, Static60.anIntArrayArray14[local170], local174);
		}
	}
}
