import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	public static int anInt5461 = 0;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method4610() {
		if (Static151.anInt3239 != 2) {
			try {
				Static362.method3353("tbrefresh", Static251.aClient4);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!rk;B)V")
	public static void method4611(@OriginalArg(0) Class180 arg0) {
		Static54.aClass180_17 = arg0;
	}
}
