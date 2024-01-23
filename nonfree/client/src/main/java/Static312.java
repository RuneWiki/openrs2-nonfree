import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wj", name = "kb", descriptor = "I")
	public static int anInt6267;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)Lclient!rl;")
	public static Class123 method4733() {
		try {
			return (Class123) Class.forName("Class123_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BJ)V")
	public static void method4734(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static88.method1534(arg0 - 1L);
			Static88.method1534(1L);
		} else {
			Static88.method1534(arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)Z")
	public static boolean method4735() {
		@Pc(12) Class24 local12 = Static78.aClass24_1;
		synchronized (Static78.aClass24_1) {
			if (Static137.anInt2297 == Static46.anInt1109) {
				return false;
			} else {
				Static35.anInt873 = Static114.anIntArray260[Static46.anInt1109];
				Static89.aChar5 = Static204.aCharArray5[Static46.anInt1109];
				Static46.anInt1109 = Static46.anInt1109 + 1 & 0x7F;
				return true;
			}
		}
	}
}
