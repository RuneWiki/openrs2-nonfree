import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public static int anInt5333;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	public static int anInt5335;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	public static int anInt5336;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "Lclient!lg;")
	public static Class102 aClass102_10;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	public static int anInt5342;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray76 = new String[1000];

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt5329 = 0;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	public static int anInt5337 = 2;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!ok;")
	public static Class125 aClass125_50 = new Class125(64);

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public static int anInt5340 = 50;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "[I")
	public static int[] anIntArray464 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "[I")
	public static int[] anIntArray465 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[I")
	public static int[] anIntArray466 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "Lclient!gd;")
	public static Class61 aClass61_51 = new Class61(64);

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray77 = new String[anInt5340];

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
	public static int[] anIntArray467 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
	public static int[] anIntArray468 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "[I")
	public static int[] anIntArray469 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
	public static int anInt5341 = 0;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[I")
	public static int[] anIntArray470 = new int[anInt5340];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lclient!oh;")
	public static Class124 method4035(@OriginalArg(0) int arg0) {
		@Pc(10) Class124 local10 = (Class124) Static15.aClass61_3.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static24.aClass132_8.method3194(Static215.method3370(arg0), Static157.method4297(arg0));
		local10 = new Class124();
		if (local24 != null) {
			local10.method2931(new Class8_Sub2(local24));
		}
		Static15.aClass61_3.method1377((long) arg0, local10);
		return local10;
	}
}
