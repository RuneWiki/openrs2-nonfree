import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt3307;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!g;")
	public static Class3_Sub9_Sub2 aClass3_Sub9_Sub2_2;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1810 = Static122.method531("ams");

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1812 = Static122.method531("Create a free account");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1811 = aClass73_1812;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method2399() {
		aClass73_1812 = null;
		aClass73_1811 = null;
		aClass73_1810 = null;
		aClass3_Sub9_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
	public static boolean method2400(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2402(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static70.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static4.aClass56_1);
		arg0.addFocusListener(Static4.aClass56_1);
	}
}
