import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_64 = new Class160(75, -1);

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public static int anInt4719 = 0;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public static int anInt4720 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Lclient!fca;")
	public static Class97 method4068(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static375.aClass97ArrayArray1[local12] == null || Static375.aClass97ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static354.method5292(local12);
			if (!local30) {
				return null;
			}
		}
		return Static375.aClass97ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method4069(@OriginalArg(1) String arg0) {
		return Static339.method5131(16, arg0);
	}
}
