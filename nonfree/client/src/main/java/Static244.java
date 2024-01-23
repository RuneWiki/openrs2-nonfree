import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array13;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public static int anInt5022;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!cd;")
	public static Class22 aClass22_18 = new Class22(512);

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method3855() {
		Static267.anInterface1Array1 = null;
		Static42.method758();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)Z")
	public static boolean method3857(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	public static void method3859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static228.method3502(arg1)) {
			Static205.method3212(arg0, Static86.aClass127ArrayArray1[arg1]);
		}
	}
}
