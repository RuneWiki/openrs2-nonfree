import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static560 {

	@OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
	public static int anInt9760;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_152 = new Class98(63, -2);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method7781(@OriginalArg(0) String arg0) {
		return Static154.method2448(lo.class, arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIII)V")
	public static void method7785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static82.anInt1373 == 1) {
			Static244.aClass71Array31[Static496.anInt9106 / 100].method7775(Static274.anInt4851 - 8, Static277.anInt4913 + -8);
		}
		if (Static82.anInt1373 == 2) {
			Static244.aClass71Array31[Static496.anInt9106 / 100 + 4].method7775(Static274.anInt4851 - 8, Static277.anInt4913 + -8);
		}
		Static189.method3216();
	}
}
