import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!qf;")
	public static Class68 aClass68_4;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1039 = Static170.method3101("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "Lclient!ic;")
	public static Class3_Sub10 aClass3_Sub10_1 = new Class3_Sub10(0, 0);

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1040 = Static170.method3101("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static int anInt3178 = 20;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2457(@OriginalArg(0) Component arg0) {
		@Pc(9) Method local9 = Static130.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static127.aClass16_1);
		arg0.addFocusListener(Static127.aClass16_1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method2458() {
		aClass3_Sub10_1 = null;
		aClass28_1040 = null;
		aClass68_4 = null;
		aClass28_1039 = null;
	}
}
