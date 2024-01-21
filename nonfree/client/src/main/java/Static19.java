import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!fe;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!cd;")
	private static Class10 aClass10_227 = Static51.method932("Welcome to RuneScape");

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Lclient!cd;")
	private static Class10 aClass10_234 = Static51.method932("Prepared visibility map");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_228 = aClass10_234;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!cd;")
	private static Class10 aClass10_233 = Static51.method932("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!cd;")
	public static Class10 aClass10_229 = aClass10_233;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
	public static int anInt494 = 0;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_230 = Static51.method932(" <col=ffffff>");

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!cd;")
	public static Class10 aClass10_231 = Static51.method932("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!cd;")
	public static Class10 aClass10_232 = aClass10_227;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_235 = Static51.method932("(U(Y");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public static void method324() {
		if (Static142.aClass86_1 != null) {
			@Pc(14) Class86 local14 = Static142.aClass86_1;
			synchronized (Static142.aClass86_1) {
				Static142.aClass86_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lclient!ke;")
	public static Class2_Sub1_Sub9 method325(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub9 local10 = (Class2_Sub1_Sub9) Static75.aClass72_16.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static8.aClass29_6.method1030(arg0, 12);
		local10 = new Class2_Sub1_Sub9();
		if (local20 != null) {
			local10.method1362(new Class2_Sub11(local20));
		}
		local10.method1359();
		Static75.aClass72_16.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method326() {
		aClass10_227 = null;
		aClass10_234 = null;
		aClass26_1 = null;
		aClass10_231 = null;
		aClass10_229 = null;
		aClass10_230 = null;
		aClass10_228 = null;
		aClass10_232 = null;
		aClass10_233 = null;
		aClass10_235 = null;
	}
}
