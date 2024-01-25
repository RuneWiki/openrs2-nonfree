import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)I")
	public static int method3589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(14) int local14 = local7 >= 8 ? arg1 : arg3;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg2) : arg1;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local33 : -local33);
	}
}
