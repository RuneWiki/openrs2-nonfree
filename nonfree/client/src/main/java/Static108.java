import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!pk;")
	public static Class249 aClass249_2;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
	public static final int[] anIntArray154 = new int[25];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static475.anInt8361 == 1) {
			Static428.method6091(arg0, arg1, Static364.aClass6_Sub26_2);
		} else if (Static475.anInt8361 == 2) {
			Static375.method7249(arg1, arg0);
		}
		Static475.anInt8361 = 0;
		Static364.aClass6_Sub26_2 = null;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)V")
	public static void method1675() {
		Static380.aClass6_Sub26_3 = new Class6_Sub26(Static146.aClass103_5.method2355(Static188.anInt28), "", Static427.anInt7590, 1002, -1, 0L, 0, 0, true, false);
	}
}
