import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_39 = new Class6(5, 3);

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_40 = new Class6(39, 4);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method2213() {
		Static13.anIntArray26 = Static384.method5809(0.4F);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static41.anInt1359 = 3;
		Static15.anInt836 = arg0;
		Static171.method3329(Static422.aClass130_8.aString26, Static422.aClass130_8.anInt4072);
		if (arg1) {
			Static54.method3635("", false, "");
		} else {
			Static133.method2882();
			Static54.method3635(Static479.aString71, false, Static511.aString85);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public static int method2215(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
