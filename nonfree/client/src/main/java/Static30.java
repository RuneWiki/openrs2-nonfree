import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ef", name = "ob", descriptor = "Lclient!u;")
	private static Class74 aClass74_563 = Static72.method1077("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lclient!u;")
	public static Class74 aClass74_562 = aClass74_563;

	@OriginalMember(owner = "client!ef", name = "rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_564 = Static72.method1077("Duell akzeptieren");

	@OriginalMember(owner = "client!ef", name = "yb", descriptor = "Lclient!u;")
	private static Class74 aClass74_566 = Static72.method1077("Please reload this page)3");

	@OriginalMember(owner = "client!ef", name = "sb", descriptor = "Lclient!u;")
	public static Class74 aClass74_565 = aClass74_566;

	@OriginalMember(owner = "client!ef", name = "xb", descriptor = "I")
	public static int anInt720 = 0;

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lclient!u;")
	public static Class74 aClass74_567 = Static72.method1077("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ef", name = "Db", descriptor = "Lclient!u;")
	public static Class74 aClass74_568 = aClass74_563;

	@OriginalMember(owner = "client!ef", name = "Fb", descriptor = "I")
	public static int anInt724 = 0;

	@OriginalMember(owner = "client!ef", name = "Ib", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!ef", name = "Jb", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public static void method536() {
		aClass74_566 = null;
		aClass74_562 = null;
		aClass74_568 = null;
		aClass74_563 = null;
		aClass74_564 = null;
		aClass74_567 = null;
		aClass74_565 = null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BLjava/awt/Component;)V")
	public static void method537(@OriginalArg(1) Component arg0) {
		@Pc(13) Method local13 = Static22.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static39.aClass42_1);
		arg0.addFocusListener(Static39.aClass42_1);
	}
}
