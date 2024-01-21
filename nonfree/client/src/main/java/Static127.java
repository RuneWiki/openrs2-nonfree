import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array22 = new Class46[1000];

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public static int anInt3025 = 0;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1108 = Static177.method3050("Abbrechen");

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	public static void method2239() {
		if (Static71.aClass88_1 != null) {
			@Pc(7) Class88 local7 = Static71.aClass88_1;
			synchronized (Static71.aClass88_1) {
				Static71.aClass88_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)Lclient!jd;")
	public static Class46 method2240(@OriginalArg(0) int arg0) {
		return Static4.method2117(arg0, false);
	}
}
