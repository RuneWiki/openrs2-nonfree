import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!pm;")
	public static Class259 aClass259_4;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public static int anInt4175;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static int anInt4176;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public static int anInt4171 = 0;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_44 = new Class361();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(CZ)Z")
	public static boolean method3560(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public static void method3561() {
		@Pc(5) Class326 local5 = Static11.aClass326_1;
		synchronized (Static11.aClass326_1) {
			Static11.aClass326_1.method7241(5);
		}
		local5 = Static282.aClass326_26;
		synchronized (Static282.aClass326_26) {
			Static282.aClass326_26.method7241(5);
		}
	}
}
