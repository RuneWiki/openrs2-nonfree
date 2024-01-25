import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!el;")
	public static final Class109 aClass109_66 = new Class109(91, 8);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method2665(@OriginalArg(1) Class57 arg0) {
		if (Static94.anInt1545 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 && (Static260.aClass174ArrayArrayArray2 != null && Static52.method791(arg0, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145))) {
			Static94.anInt1545 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2666(@OriginalArg(1) String arg0) {
		Static625.aString132 = arg0;
		if (Static492.anApplet2 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static492.anApplet2.getParameter("cookieprefix");
			@Pc(21) String local21 = Static492.anApplet2.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static576.method8278(Static515.method7499(124) + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static681.method741("document.cookie=\"" + local40 + "\"", Static492.anApplet2);
		} catch (@Pc(99) Throwable local99) {
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public static void method2667(@OriginalArg(1) int arg0) {
		if (Static107.anInt1746 == 7 && (Static566.anInt9503 == 0 && Static222.anInt3623 == 0)) {
			Static295.anInt5127 = arg0;
			Static21.method316(9);
		}
	}
}
