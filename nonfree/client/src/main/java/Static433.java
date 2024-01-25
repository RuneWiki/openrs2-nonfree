import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!it;")
	public static Class122 aClass122_19;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Lclient!ap;")
	public static final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11 = new Class1_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_112 = new Class177(80, -1);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public static void method6152() {
		Static37.aClass91_8.method1999();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method6158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - arg0;
		if (local16 < -9) {
			return "<col=ff0000>";
		} else if (local16 < -6) {
			return "<col=ff3000>";
		} else if (local16 < -3) {
			return "<col=ff7000>";
		} else if (local16 < 0) {
			return "<col=ffb000>";
		} else if (local16 > 9) {
			return "<col=00ff00>";
		} else if (local16 > 6) {
			return "<col=40ff00>";
		} else if (local16 > 3) {
			return "<col=80ff00>";
		} else if (local16 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
