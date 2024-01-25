import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "[[Lclient!sha;")
	public static Class321[][] aClass321ArrayArray2;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Lclient!of;")
	public static final Class251 aClass251_2 = new Class251(5, 1);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)Z")
	public static boolean method3040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static213.method3108(arg1, arg0) & Static360.method8251(arg1, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public static void method3042(@OriginalArg(0) int arg0) {
		Static110.anInt1996 = arg0;
		Static151.aClass10_12.method375();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3044(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(23) Class6_Sub26 local23 = Static268.method3981(Static377.aClass15_2, Static542.aClass289_130);
			local23.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0));
			local23.aClass6_Sub23_Sub1_2.method8398(arg0);
			Static670.method9077(local23);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sha;III)V")
	public static void method3045(@OriginalArg(0) Class321 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static489.aClass321_39 != null || Static277.aBoolean303 || (arg0 == null || Static165.method2361(arg0) == null)) {
			return;
		}
		Static489.aClass321_39 = arg0;
		Static398.aClass321_30 = Static165.method2361(arg0);
		Static464.anInt8031 = arg1;
		Static272.anInt4703 = 0;
		Static663.anInt9823 = arg2;
		Static266.aBoolean291 = false;
	}
}
