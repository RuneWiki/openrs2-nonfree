import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
	public static int anInt8659;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public static int method7121(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return arg0 & ~local44;
	}
}
