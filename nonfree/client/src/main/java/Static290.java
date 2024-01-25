import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	public static int anInt5659 = 0;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	public static final int anInt5660 = 1401;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	public static int anInt5662 = -1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIILclient!ih;Lclient!ha;)V")
	public static void method4673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) Class65 arg4) {
		@Pc(9) Class63 local9 = Static367.aClass365_4.method8484(arg3.anInt4659);
		if (local9.anInt1113 == -1) {
			return;
		}
		if (arg3.aBoolean375) {
			@Pc(22) int local22 = arg0 + arg3.anInt4674;
			arg0 = local22 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class50 local38 = local9.method1017(arg4, arg0, arg3.aBoolean382);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg3.anInt4634;
		@Pc(47) int local47 = arg3.anInt4645;
		if ((arg0 & 0x1) == 1) {
			local44 = arg3.anInt4645;
			local47 = arg3.anInt4634;
		}
		@Pc(61) int local61 = local38.method6003();
		@Pc(64) int local64 = local38.method6010();
		if (local9.aBoolean85) {
			local61 = local44 * 4;
			local64 = local47 * 4;
		}
		if (local9.anInt1120 == 0) {
			local38.method6008(arg1, arg2 + 4 - local47 * 4, local61, local64);
		} else {
			local38.method5991(arg1, arg2 + 4 - local47 * 4, local61, local64, 0, local9.anInt1120 | 0xFF000000, 1);
		}
	}
}
