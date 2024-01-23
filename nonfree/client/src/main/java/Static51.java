import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString82 = "wave2:";

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
	public static void method1016(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < Static167.aBooleanArray14.length) {
			Static167.aBooleanArray14[arg0] = !Static167.aBooleanArray14[arg0];
		}
	}
}
