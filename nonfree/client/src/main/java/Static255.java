import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ija", name = "P", descriptor = "Lclient!da;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IB)I")
	public static int method4294(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(31) int local31 = local16 | local16 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return local43 + 1;
	}
}
