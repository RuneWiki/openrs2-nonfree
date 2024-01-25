import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z")
	public static boolean method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static603.method8432(arg1, arg0) : Static9.method667(arg0, arg1);
		return Static395.method6381(arg0, arg1) | (arg1 & 0x10000) != 0 | local22;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZILclient!g;BLclient!g;I)I")
	public static int method5262(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class96_Sub1 arg3, @OriginalArg(5) Class96_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = Static534.method7803(arg2, arg4, arg0, arg3);
		if (local18 != 0) {
			return arg0 ? -local18 : local18;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static534.method7803(arg5, arg4, arg1, arg3);
			return arg1 ? -local42 : local42;
		}
	}
}
