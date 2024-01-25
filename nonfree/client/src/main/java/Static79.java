import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static int anInt5522;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	public static int anInt5531;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!qr;IILclient!tj;II)V")
	public static void method4637(@OriginalArg(0) Class170 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class154 local8 = Static296.method5021(arg0.anInt5258);
		if (local8.anInt4686 == -1) {
			return;
		}
		if (arg0.aBoolean315) {
			@Pc(26) int local26 = arg4 + arg0.anInt5239;
			arg4 = local26 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class57 local38 = local8.method3999(arg3, arg4, arg0.aBoolean309);
		if (local38 == null) {
			return;
		}
		@Pc(52) int local52 = arg0.anInt5235;
		@Pc(55) int local55 = arg0.anInt5251;
		if ((arg4 & 0x1) == 1) {
			local55 = arg0.anInt5235;
			local52 = arg0.anInt5251;
		}
		@Pc(69) int local69 = local38.method5433();
		@Pc(72) int local72 = local38.method5441();
		if (local8.aBoolean268) {
			local72 = local55 * 4;
			local69 = local52 * 4;
		}
		if (local8.anInt4688 == 0) {
			local38.method5431(arg2, arg1 - (local55 - 1) * 4, local69, local72);
		} else {
			local38.method5449(arg2, arg1 - (local55 - 1) * 4, local69, local72, 1, local8.anInt4688 | 0xFF000000, 1);
		}
	}
}
