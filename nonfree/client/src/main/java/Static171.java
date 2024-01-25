import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt3155;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_45 = new Class84("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_87 = new Class131(54, -1);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(43) int local43 = (1 - local29) * local13 + local21;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg1 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg1 - 1) * local56;
		Static217.method3280(Static59.anIntArrayArray34[arg3], arg2 - arg0, arg4, arg0 + arg2);
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local43 += local68;
				local82 += local60;
				local7++;
				local68 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local88 -= local56;
			local9--;
			local76 -= local56;
			@Pc(174) int local174 = arg3 - local9;
			@Pc(178) int local178 = local9 + arg3;
			@Pc(182) int local182 = local7 + arg2;
			@Pc(187) int local187 = arg2 - local7;
			Static217.method3280(Static59.anIntArrayArray34[local174], local187, arg4, local182);
			Static217.method3280(Static59.anIntArrayArray34[local178], local187, arg4, local182);
		}
	}
}
