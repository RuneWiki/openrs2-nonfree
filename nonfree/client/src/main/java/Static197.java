import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_63 = new Class185(43, 7);

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
	public static int anInt6051 = -1;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIILclient!ac;Z[BI)Lclient!iaa;")
	public static Class2_Sub1_Sub1 method5043(@OriginalArg(1) int arg0, @OriginalArg(4) Class5_Sub1 arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg1.aBoolean30 || Static152.method3040(arg3) && Static152.method3040(arg0)) {
			return new Class2_Sub1_Sub1(arg1, 3553, 6406, arg3, arg0, false, arg2, 6406);
		} else if (arg1.aBoolean20) {
			return new Class2_Sub1_Sub1(arg1, 34037, 6406, arg3, arg0, false, arg2, 6406);
		} else {
			return new Class2_Sub1_Sub1(arg1, 6406, arg3, arg0, Static101.method2622(arg3), Static101.method2622(arg0), arg2, 6406);
		}
	}
}
