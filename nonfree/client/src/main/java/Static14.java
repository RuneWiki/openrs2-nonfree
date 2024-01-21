import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
	public static int anInt382;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_130 = Static187.method3089("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_131 = Static187.method3089("Loading)3)3)3");

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!vd;")
	public static Class92 aClass92_132 = aClass92_131;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_133 = Static187.method3089("Login limit exceeded)3");

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "Lclient!vd;")
	public static Class92 aClass92_134 = aClass92_133;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
	public static boolean method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method256(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static128.aBoolean154) {
			try {
				@Pc(26) Class14 local26 = (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
				local26.method739(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static128.aBoolean154 = true;
			}
		}
		return arg0;
	}
}
