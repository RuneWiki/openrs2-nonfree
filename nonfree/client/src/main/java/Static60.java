import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Z")
	public static boolean aBoolean91;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[200];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1081(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static179.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static78.aClass24_1);
		arg0.addFocusListener(Static78.aClass24_1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	public static int method1083(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local27 * arg0 >> 12) + 40960;
		return local35 * local21 >> 12;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	public static void method1084(@OriginalArg(0) int arg0) {
		Static8.anInt226 = arg0;
		Static11.method305(3);
		Static11.method305(4);
	}
}
