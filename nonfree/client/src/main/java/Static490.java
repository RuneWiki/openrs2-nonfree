import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public static int anInt7996;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
	public static int[] anIntArray509;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	public static int anInt7997;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_60 = new Class6(50);

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_158 = new Class56(11, 8);

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Z")
	public static boolean method6636() {
		@Pc(7) Class3 local7 = Static133.aClass112_20.aClass3_111.aClass3_285;
		if (local7 == null || Static133.aClass112_20.aClass3_111 == local7) {
			return false;
		}
		@Pc(18) Class3_Sub43 local18 = (Class3_Sub43) local7;
		if (local18.anInt7753 >= 2000) {
			local18.anInt7753 -= 2000;
		}
		return local18.anInt7753 == 1007;
	}
}
