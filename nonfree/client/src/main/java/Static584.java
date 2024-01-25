import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
	public static int anInt9612;

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "Lclient!le;")
	public static Class5_Sub33 aClass5_Sub33_2;

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "Lclient!si;")
	public static final Class323 aClass323_5 = new Class323();

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_294 = new Class196(119, -1);

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "Lclient!o;")
	public static final Class252 aClass252_3 = new Class252(128);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)Lclient!mha;")
	public static Class5_Sub2_Sub12 method7986(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub12 local10 = (Class5_Sub2_Sub12) aClass252_3.method5973((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static427.aClass50_189.method916(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static72.method7644(local20);
		} catch (@Pc(36) Exception local36) {
			throw new RuntimeException(local36.getMessage() + " S: " + arg0);
		}
		aClass252_3.method5974(local10, (long) arg0);
		return local10;
	}
}
