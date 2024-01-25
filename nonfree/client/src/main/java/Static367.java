import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
	public static int anInt6478 = 0;

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_73 = new Class136(260);

	@OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
	public static int anInt6493 = 0;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Lclient!rr;")
	public static Class292 method5505(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static14.aClass292ArrayArray1[local12] == null || Static14.aClass292ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static508.method7071(local12);
			if (!local30) {
				return null;
			}
		}
		return Static14.aClass292ArrayArray1[local12][local16];
	}
}
