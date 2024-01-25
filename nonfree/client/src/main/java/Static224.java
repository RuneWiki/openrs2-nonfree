import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array8;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_36 = new Class171(5);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ya;Lclient!em;I)V")
	public static void method3517(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(31) boolean local31 = Static318.aClass144_6.method3273(arg1.aBoolean150 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null, arg0, arg1.anInt2200 | 0xFF000000, arg1.anInt2208, arg1.anInt2220, arg1.anInt2202, arg1.anInt2253) == null;
		if (local31) {
			Static404.aClass14_44.method300(new Class2_Sub40(arg1.anInt2208, arg1.anInt2220, arg1.anInt2202, arg1.anInt2200 | 0xFF000000, arg1.anInt2253, arg1.aBoolean150));
			Static78.method1460(arg1);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z")
	public static boolean method3519(@OriginalArg(0) int arg0) {
		@Pc(7) Class219_Sub1 local7 = Static334.method4662(arg0);
		if (local7 == null) {
			return false;
		} else if (Static73.anInt1597 == 3) {
			@Pc(45) String local45 = "";
			if (Static23.aClass56_1 != Static53.aClass56_2) {
				local45 = ":" + (local7.anInt6547 + 7000);
			}
			@Pc(61) String local61 = "";
			if (Static92.aString37 != null) {
				local61 = "/p=" + Static92.aString37;
			}
			@Pc(110) String local110 = "http://" + local7.aString59 + local45 + "/l=" + Static388.anInt6533 + "/a=" + Static352.anInt5971 + local61 + "/j" + (Static92.aBoolean239 ? "1" : "0") + ",o" + (Static362.aBoolean434 ? "1" : "0") + ",a2";
			try {
				Static148.aClient1.getAppletContext().showDocument(new URL(local110), "_self");
				return true;
			} catch (@Pc(120) Exception local120) {
				return false;
			}
		} else {
			Static375.anInt5832 = local7.anInt6547;
			Static266.aString47 = local7.aString59;
			if (Static53.aClass56_2 != Static23.aClass56_1) {
				Static395.anInt6580 = Static375.anInt5832 + 40000;
				Static432.anInt7151 = Static375.anInt5832 + 50000;
				Static45.anInt816 = Static395.anInt6580;
			}
			return true;
		}
	}
}
