import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "[Lclient!qg;")
	public static Class63[] aClass63Array1 = new Class63[6];

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "Lclient!ea;")
	public static Class18 aClass18_398 = Static8.method128("Fallen lassen");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
	public static void method1077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static94.anInt2923 != 0 && arg1 != -1) {
			Static28.method2243(Static94.anInt2923, 0, Static82.aClass16_Sub1_29, arg1);
			Static116.aBoolean143 = true;
		}
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
	public static void method1079() {
		aClass18_398 = null;
		aClass63Array1 = null;
	}
}
