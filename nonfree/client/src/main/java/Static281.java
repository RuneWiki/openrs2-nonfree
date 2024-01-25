import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!kv", name = "F", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
	public static int anInt5188;

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
	public static int anInt5189;

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "Lclient!em;")
	public static final Class83 aClass83_102 = new Class83(77, 2);

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
	public static void method4188() {
		Static475.aClient1.method1077();
		Static498.method710();
		Static169.aClass83_74 = null;
		Static403.aClass83_147 = null;
		Static208.anInt8063 = 0;
		Static365.aClass83_141 = null;
		Static101.anInt1769 = 0;
		Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
		Static377.method5458();
		Static99.anInt1760 = 0;
		Static33.anInt723 = 0;
		Static272.aClass254Array1 = null;
		Static71.anInt1353 = 0;
		Static84.aString15 = null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)Z")
	public static boolean method4189(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
