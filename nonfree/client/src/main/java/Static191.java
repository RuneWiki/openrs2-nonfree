import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!o;")
	public static Class41 aClass41_7;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
	public static final int[] anIntArray275 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	public static final int[] anIntArray276 = new int[1];

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	public static int anInt3353 = 0;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_53 = new Class208(36, -1);

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2756() {
		Static433.anInt7312 = 0;
		Static80.anInt6192 = -1;
		Static249.anInt4279 = -1;
		Static331.anInt5943 = -1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!pb;Ljava/lang/Object;I)V")
	public static void method2758(@OriginalArg(0) Class194 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static167.method6157(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method2759(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static320.aBoolean404) {
			try {
				@Pc(25) Class185 local25 = (Class185) Class.forName("Class185_Sub1").getDeclaredConstructor().newInstance();
				local25.method4068(arg0);
				return local25;
			} catch (@Pc(34) Throwable local34) {
				Static320.aBoolean404 = true;
			}
		}
		return arg0;
	}
}
