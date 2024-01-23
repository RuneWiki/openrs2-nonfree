import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Lclient!pk;")
	public static Class132 aClass132_69;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "Lclient!pk;")
	public static Class132 aClass132_70;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public static int anInt4224 = 0;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "[I")
	public static int[] anIntArray318 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "[S")
	public static short[] aShortArray34 = new short[500];

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString149 = "Connection lost.";

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public static void method3171() {
		Static229.aClass61_43.method1379();
		Static65.aClass61_52.method1379();
		Static288.aClass61_12.method1379();
		Static177.aClass61_14.method1379();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
	public static void method3181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static275.anInt5409 * arg2 >> 8;
		if (local14 != 0 && arg1 != -1) {
			Static15.method283(Static246.aClass132_84, local14, arg1);
			Static140.aBoolean230 = true;
		}
	}
}
