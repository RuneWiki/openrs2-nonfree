import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!kb;")
	public static Class83 aClass83_185;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString185 = "slide:";

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!ok;")
	public static Class116 aClass116_18 = null;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
	public static void method4465(@OriginalArg(0) int arg0) {
		Static111.anInt2398--;
		if (arg0 == Static111.anInt2398) {
			return;
		}
		Static302.method1379(Static165.aStringArray17, arg0 + 1, Static165.aStringArray17, arg0, Static111.anInt2398 - arg0);
		Static302.method1379(Static24.aStringArray3, arg0 + 1, Static24.aStringArray3, arg0, Static111.anInt2398 - arg0);
		Static302.method1374(Static153.anIntArray326, arg0 + 1, Static153.anIntArray326, arg0, Static111.anInt2398 - arg0);
		Static302.method1378(Static213.aShortArray71, arg0 + 1, Static213.aShortArray71, arg0, Static111.anInt2398 - arg0);
		Static302.method1377(Static34.aLongArray6, arg0 + 1, Static34.aLongArray6, arg0, Static111.anInt2398 - arg0);
		Static302.method1374(Static218.anIntArray494, arg0 + 1, Static218.anIntArray494, arg0, Static111.anInt2398 - arg0);
		Static302.method1374(Static52.anIntArray147, arg0 + 1, Static52.anIntArray147, arg0, Static111.anInt2398 - arg0);
	}
}
