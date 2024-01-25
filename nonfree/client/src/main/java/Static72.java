import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array2;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!ge;")
	public static Class1_Sub6 aClass1_Sub6_1;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_73 = new Class296(22, 5);

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_74 = new Class296(31, 6);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIILclient!uq;I)Lclient!em;")
	public static Class73_Sub1_Sub1 method1277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean575 || Static535.method7411(arg2) && Static535.method7411(arg4)) {
			return new Class73_Sub1_Sub1(arg3, 3553, arg1, arg0, arg2, arg4, true);
		} else if (arg3.aBoolean579) {
			return new Class73_Sub1_Sub1(arg3, 34037, arg1, arg0, arg2, arg4, true);
		} else {
			return new Class73_Sub1_Sub1(arg3, arg1, arg0, arg2, arg4, Static352.method5306(arg2), Static352.method5306(arg4), true);
		}
	}
}
