import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public static int anInt5733;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "[Lclient!mi;")
	public static Class112[] aClass112Array7 = new Class112[14];

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString202 = "shake:";

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	public static void method4521() {
		for (@Pc(1) int local1 = 0; local1 < Static273.anInt5430; local1++) {
			@Pc(8) Class170 local8 = Static315.aClass170Array3[local1];
			Static156.method2855(local8);
			Static315.aClass170Array3[local1] = null;
		}
		Static273.anInt5430 = 0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method4522() {
		Static175.aClass157_33.method4034(5);
		Static215.aClass157_36.method4034(5);
	}
}
