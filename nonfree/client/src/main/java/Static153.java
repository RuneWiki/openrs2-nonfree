import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	public static int anInt3558;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Lclient!kf;")
	public static Class167 aClass167_1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_34 = new Class185(14, 11);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method3055() {
		Static135.aClass94_14.method2952();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ac;III)Lclient!iaa;")
	public static Class2_Sub1_Sub1 method3056(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean30 || Static152.method3040(arg2) && Static152.method3040(arg0)) {
			return new Class2_Sub1_Sub1(arg1, 3553, arg3, arg2, arg0);
		} else if (arg1.aBoolean20) {
			return new Class2_Sub1_Sub1(arg1, 34037, arg3, arg2, arg0);
		} else {
			return new Class2_Sub1_Sub1(arg1, arg3, arg2, arg0, Static101.method2622(arg2), Static101.method2622(arg0));
		}
	}
}
