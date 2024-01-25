import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kja", name = "M", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!kja", name = "Q", descriptor = "I")
	public static int anInt5515;

	@OriginalMember(owner = "client!kja", name = "F", descriptor = "I")
	public static int anInt5508 = 0;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lclient!iw;B)I")
	public static int method4758(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		@Pc(8) int local8 = arg0.method3702(2);
		@Pc(20) int local20;
		if (local8 == 0) {
			local20 = 0;
		} else if (local8 == 1) {
			local20 = arg0.method3702(5);
		} else if (local8 == 2) {
			local20 = arg0.method3702(8);
		} else {
			local20 = arg0.method3702(11);
		}
		return local20;
	}
}
