import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!ia;")
	public static Class4_Sub13_Sub2 aClass4_Sub13_Sub2_2;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!ph;")
	public static Class154 aClass154_88 = new Class154(64);

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	public static int anInt5811 = 0;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public static int anInt5814 = -1;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString216 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString217 = "yellow:";

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
	public static final int[] anIntArray483 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public static void method4916() {
		Static134.aClass78_4 = null;
		Static345.aClass92_9 = null;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Lclient!nr;")
	public static Class129 method4918() {
		try {
			return new Class129_Sub3();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class129) Class.forName("Class129_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class129_Sub1();
			}
		}
	}
}
