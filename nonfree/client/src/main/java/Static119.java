import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_1497 = Static69.method1231("runes");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1498 = Static69.method1231("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt2792 = 0;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_1499 = Static69.method1231(")4lang)4de");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method2006() {
		aClass40_1499 = null;
		aClass40_1497 = null;
		aClass40_1498 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BI)I")
	public static int method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = Class2_Sub16.anIntArray207[(local7 ^ arg2[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method2008(@OriginalArg(1) int arg0) {
		if (Static112.method1873(arg0)) {
			Static18.method373(Static45.aClass2_Sub13ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2009(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static91.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static52.aClass12_1);
		arg0.addFocusListener(Static52.aClass12_1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static112.method1873(arg6)) {
			Static55.method973(arg4, arg2, arg1, arg3, arg0, -1, arg5, Static45.aClass2_Sub13ArrayArray1[arg6]);
		}
	}
}
