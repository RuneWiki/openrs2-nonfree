import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!gd;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!na;")
	private static Class53 aClass53_113 = Static109.method1737("Welcome to RuneScape");

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_112 = aClass53_113;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_114 = Static109.method1737("(X");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!gd;")
	public static Class27 method180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class27_Sub1");
			@Pc(15) Class27 local15 = (Class27) local11.getDeclaredConstructor().newInstance();
			local15.method1538(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class27_Sub2 local28 = new Class27_Sub2();
			local28.method1538(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method181() {
		anIntArray29 = null;
		aClass53_114 = null;
		aClass53_113 = null;
		aClass27_4 = null;
		aClass53_112 = null;
	}
}
