import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString146;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "Lclient!la;")
	public static Class102 aClass102_3;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!sf;")
	public static Class157 aClass157_35 = new Class157(50);

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString145 = "Choose Option";

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "[I")
	public static int[] anIntArray423 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lclient!ic;")
	public static Class16 method3466() {
		try {
			return new Class16_Sub3();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class16) Class.forName("Class16_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class16_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method3467(@OriginalArg(0) Class2_Sub12 arg0) {
		Static14.method248(arg0, 200000);
	}
}
