import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_13;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!ob;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_7;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1179 = Static78.method1313("Please wait)3)3)3");

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1180 = aClass25_1179;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1181 = aClass25_1179;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!of;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1182 = Static78.method1313("mapfunction");

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1183 = Static78.method1313("(U4");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	public static boolean method1727(@OriginalArg(1) int arg0) {
		if (Static2.aBooleanArray1[arg0]) {
			return true;
		} else if (Static45.aClass56_42.method1268(arg0)) {
			@Pc(23) int local23 = Static45.aClass56_42.method1279(arg0);
			if (local23 == 0) {
				Static2.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static56.aClass1_Sub2_Sub14ArrayArray1[arg0] == null) {
				Static56.aClass1_Sub2_Sub14ArrayArray1[arg0] = new Class1_Sub2_Sub14[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static45.aClass56_42.method1269(arg0, local42);
					if (local56 != null) {
						Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local42] = new Class1_Sub2_Sub14();
						Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local42].anInt1937 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local42].method1439(new Class1_Sub5(local56));
						} else {
							Static56.aClass1_Sub2_Sub14ArrayArray1[arg0][local42].method1429(new Class1_Sub5(local56));
						}
					}
				}
			}
			Static2.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method1729() {
		aClass1_Sub2_Sub2_Sub1_13 = null;
		aClass25_1181 = null;
		aClass25_1182 = null;
		aClass25_1180 = null;
		aClass1_Sub2_Sub14_7 = null;
		aClass25_1183 = null;
		aClass25_1179 = null;
	}
}
