import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
	public static final int[] anIntArray552 = new int[2500];

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	public static int anInt5669 = 0;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt5671 = -60;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "[I")
	public static final int[] anIntArray553 = new int[14];

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
	public static final int[] anIntArray554 = new int[500];

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	public static void method4948() {
		Static67.aClass1_Sub12_1 = new Class1_Sub12(Static144.aString110, "", Static10.anInt163, 1009, 0L, 0, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!lm;)V")
	public static void method4951(@OriginalArg(1) Class134 arg0) {
		Static111.aClass134_53 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4952(@OriginalArg(1) Component arg0) {
		@Pc(9) Method local9 = Static343.aMethod2;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static224.aClass3_1);
		arg0.addFocusListener(Static224.aClass3_1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method4953() {
		@Pc(1) Class37 local1 = Static265.aClass37_86;
		synchronized (Static265.aClass37_86) {
			Static265.aClass37_86.method920(5);
		}
	}
}
