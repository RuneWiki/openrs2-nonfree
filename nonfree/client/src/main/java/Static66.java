import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cha", name = "D", descriptor = "I")
	public static int anInt1396;

	@OriginalMember(owner = "client!cha", name = "F", descriptor = "I")
	public static int anInt1398;

	@OriginalMember(owner = "client!cha", name = "K", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IZ)V")
	public static void method1256(@OriginalArg(1) boolean arg0) {
		if (Static216.aString49.length() == 0) {
			return;
		}
		Static576.method8008("--> " + Static216.aString49);
		Static76.method1457(arg0, false, Static216.aString49);
		Static209.anInt4374 = 0;
		Static216.aString49 = "";
		Static50.anInt1090 = 0;
	}

	@OriginalMember(owner = "client!cha", name = "c", descriptor = "(B)Lclient!vr;")
	public static Class2_Sub50 method1257() {
		return Static305.anInt5639 == 0 ? new Class2_Sub50() : Static16.aClass2_Sub50Array1[--Static305.anInt5639];
	}
}
