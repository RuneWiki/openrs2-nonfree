import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	public static int anInt318;

	@OriginalMember(owner = "client!be", name = "P", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_2 = new Class26(64);

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method245(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static74.method1137(arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method248(@OriginalArg(0) int arg0) {
		Static1.anInt3 = arg0;
		@Pc(12) Class26 local12 = Static222.aClass26_43;
		synchronized (Static222.aClass26_43) {
			Static222.aClass26_43.method333();
		}
		local12 = Static185.aClass26_33;
		synchronized (Static185.aClass26_33) {
			Static185.aClass26_33.method333();
		}
	}
}
