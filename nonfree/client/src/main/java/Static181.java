import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)I")
	public static int method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg2 & 0xF;
		@Pc(19) int local19 = local12 < 8 ? arg1 : arg0;
		@Pc(38) int local38 = local12 < 4 ? arg0 : local12 == 12 || local12 == 14 ? arg1 : arg3;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}
}
