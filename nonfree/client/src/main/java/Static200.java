import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_21 = new Class114();

	@OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
	public static int anInt3977 = -1;

	@OriginalMember(owner = "client!haa", name = "T", descriptor = "I")
	public static int anInt3979 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V")
	public static void method3444() {
		@Pc(5) Class69 local5 = Static570.aClass69_60;
		synchronized (Static570.aClass69_60) {
			Static570.aClass69_60.method1904();
		}
		local5 = Static86.aClass69_10;
		synchronized (Static86.aClass69_10) {
			Static86.aClass69_10.method1904();
		}
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
	public static void method3445() {
		if (Static265.aClass286_3.aBoolean534) {
			Static79.anInt2093 = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Static79.anInt2093 = (int) (local34 / 1048576L) + 1;
					return;
				} catch (@Pc(44) Throwable local44) {
					return;
				}
			}
		} catch (@Pc(46) Exception local46) {
			return;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method3447(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static351.method5266(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)I")
	public static int method3448(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static518.anInt8368;
		if (local10 == 0) {
			return arg0 ? 0 : Static239.anInt4434;
		} else if (local10 == 1) {
			return Static239.anInt4434;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
