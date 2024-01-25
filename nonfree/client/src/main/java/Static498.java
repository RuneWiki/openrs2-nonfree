import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rk", name = "Ib", descriptor = "I")
	public static int anInt8705;

	@OriginalMember(owner = "client!rk", name = "Fb", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_153 = new Class73(112, 6);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLclient!ni;ILclient!ni;)V")
	public static void method7229(@OriginalArg(1) Class223 arg0, @OriginalArg(3) Class223 arg1) {
		Static322.aClass223_67 = arg1;
		Static25.aClass223_9 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
	public static int method7232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static319.method5322(arg1 + 45365, arg0 + 91923, 4) + (Static319.method5322(arg1 + 10294, arg0 + 37821, 2) + -128 >> 1) + (Static319.method5322(arg1, arg0, 1) - 128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
