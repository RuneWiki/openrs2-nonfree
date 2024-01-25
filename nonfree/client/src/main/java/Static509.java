import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!pj;")
	public static Class248 aClass248_75;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "Lclient!pj;")
	public static Class248 aClass248_76;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!xa;ILclient!fa;ILclient!faa;II)V")
	public static void method5847(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(7) int arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static60.anInt1008 == 4) {
			local16 = (int) Static562.aFloat14 & 0x3FFF;
		} else {
			local16 = Static63.anInt1086 + (int) Static562.aFloat14 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg5.anInt2690 / 2, arg5.anInt2670 / 2) + 10;
		@Pc(50) int local50 = arg4 * arg4 + arg2 * arg2;
		if (local50 > local42 * local42) {
			return;
		}
		@Pc(60) int local60 = Class22.anIntArray20[local16];
		@Pc(64) int local64 = Class22.anIntArray19[local16];
		if (Static60.anInt1008 != 4) {
			local64 = local64 * 256 / (Static213.anInt4015 + 256);
			local60 = local60 * 256 / (Static213.anInt4015 + 256);
		}
		@Pc(95) int local95 = arg2 * local64 + arg4 * local60 >> 14;
		@Pc(106) int local106 = arg4 * local64 - arg2 * local60 >> 14;
		arg1.method7769(arg0 + arg5.anInt2690 / 2 + local95 - arg1.AA() / 2, arg6 + arg5.anInt2670 / 2 + -local106 + -(arg1.a() / 2), arg3, arg0, arg6);
	}
}
