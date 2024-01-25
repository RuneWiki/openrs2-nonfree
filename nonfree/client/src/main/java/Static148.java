import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt2916;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_47 = new Class156(114, 1);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method2746(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg0.length() > 320 || !Static536.method7364()) {
			return;
		}
		Static4.aClass389_16.method9073();
		Static119.method1758();
		Static357.aString67 = arg1;
		Static514.aString92 = arg0;
		Static411.method6060(5, -3);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method2747() {
		Static11.aClass168_2.method3852(5);
	}
}
