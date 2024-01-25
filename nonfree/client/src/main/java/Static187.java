import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
	public static final int[] anIntArray332 = new int[4];

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
	public static int anInt3921 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3559(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static143.aClass159_163.method4311(Static69.anInt1823) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static57.aClass159_86.method4311(Static69.anInt1823) + "</col>";
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)Lclient!af;")
	public static Class6 method3561() {
		try {
			return new Class6_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(21) Throwable local21) {
				return new Class6_Sub2();
			}
		}
	}
}
