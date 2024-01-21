import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	public static int anInt632 = -1;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_354 = Static69.method1231("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
	public static void method397(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static57.aClass2_Sub9_Sub1_2.method673(45);
			Static57.aClass2_Sub9_Sub1_2.method647(arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method398() {
		aClass40_354 = null;
	}
}
