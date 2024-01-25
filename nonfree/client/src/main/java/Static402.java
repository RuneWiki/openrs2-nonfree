import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pba", name = "D", descriptor = "Lclient!mv;")
	public static Class229 aClass229_94;

	@OriginalMember(owner = "client!pba", name = "F", descriptor = "I")
	public static int anInt6620;

	@OriginalMember(owner = "client!pba", name = "t", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
	public static int anInt6615 = 0;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(F[BIIFLclient!bt;FFFIIIII)V")
	public static void method5497(@OriginalArg(0) float arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) float arg2, @OriginalArg(5) Class43 arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6, @OriginalArg(10) int arg7, @OriginalArg(12) int arg8) {
		@Pc(20) float[] local20 = new float[16384];
		@Pc(50) int local50;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
			arg3.method2107(0, arg2 / (float) 16, arg0 / (float) 128, arg7, arg6 / (float) 128, local20, arg4 * 127.0F);
			local50 = arg8;
			arg6 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg1[local50] = (byte) ((float) arg1[local50] + local20[local56]);
				local50++;
			}
			arg4 *= arg5;
			arg2 *= 2.0F;
			arg0 *= 2.0F;
		}
		local50 = arg8;
		for (local56 = 0; local56 < 16384; local56++) {
			arg1[local50] = (byte) (arg1[local50] + 127);
			local50++;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIIIII)V")
	public static void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static47.anInt876 = arg0;
		Static89.anInt1594 = arg4;
		Static170.anInt2586 = arg1;
		Static448.anInt1220 = arg5;
		Static210.anInt3051 = arg3;
		Static451.anInt8490 = arg2;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIIZI)V")
	public static void method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(18) int local18 = arg4 * arg4;
		@Pc(22) int local22 = arg3 * arg3;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg3 << 1;
		@Pc(43) int local43 = local26 + local18 * (1 - local34);
		@Pc(51) int local51 = local22 - (local34 - 1) * local30;
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = ((arg3 << 1) - 3) * local30;
		@Pc(81) int local81 = local59;
		Static437.method5735(arg1 - arg4, Static238.anIntArrayArray36[arg0], arg1 + arg4, arg2);
		@Pc(100) int local100 = local55 * (arg3 - 1);
		while (local14 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local51 += local81;
					local81 += local59;
					local12++;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local43 += local67;
				local51 += local81;
				local12++;
				local67 += local59;
				local81 += local59;
			}
			local43 += -local100;
			local51 += -local75;
			local100 -= local55;
			local14--;
			local75 -= local55;
			@Pc(174) int local174 = arg0 - local14;
			@Pc(178) int local178 = local14 + arg0;
			@Pc(182) int local182 = local12 + arg1;
			@Pc(187) int local187 = arg1 - local12;
			Static437.method5735(local187, Static238.anIntArrayArray36[local174], local182, arg2);
			Static437.method5735(local187, Static238.anIntArrayArray36[local178], local182, arg2);
		}
	}
}
