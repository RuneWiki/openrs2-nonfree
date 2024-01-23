import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "Lclient!nk;")
	public static Class121 aClass121_73;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "Lclient!vh;")
	public static Class187 aClass187_80 = new Class187(64);

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Connection lost.";

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
	public static int anInt2966 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2572(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)Lclient!f;")
	public static Class45 method2574() {
		try {
			return new Class45_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class45) Class.forName("Class45_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class45_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILclient!nk;)Z")
	public static boolean method2575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(9) byte[] local9 = arg2.method3115(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static266.method4190(local9);
			return true;
		}
	}
}
