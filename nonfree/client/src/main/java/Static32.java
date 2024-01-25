import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Lclient!fga;")
	public static Class6_Sub17 aClass6_Sub17_1;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_7 = new Class208(33, 18);

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_14 = new Class268(81, 8);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)J")
	public static synchronized long method595() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static395.aLong183 > local10) {
			Static88.aLong45 += Static395.aLong183 - local10;
		}
		Static395.aLong183 = local10;
		return Static88.aLong45 + local10;
	}
}
