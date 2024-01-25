import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "Lclient!bi;")
	public static Class31 aClass31_12;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "Lclient!kca;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString12 = "";

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "[Lclient!wo;")
	public static final Class4_Sub7_Sub19[] aClass4_Sub7_Sub19Array1 = new Class4_Sub7_Sub19[14];

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	public static int anInt789 = 0;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lclient!fda;")
	public static Class103 method692() {
		try {
			return new Class103_Sub3();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class103) Class.forName("Class103_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class103_Sub1();
			}
		}
	}
}
