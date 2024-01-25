import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "Lclient!k;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_16 = new Class326(64);

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
	public static int anInt3713 = -1;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method3216(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static70.aBoolean135) {
			try {
				@Pc(23) Class317 local23 = (Class317) Class.forName("Class317_Sub1").getDeclaredConstructor().newInstance();
				local23.method7057(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static70.aBoolean135 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	public static void method3224() {
		Static135.anInt2684 = 0;
		Static3.aClass361_1.method7860();
		Static294.aBoolean407 = false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIII)V")
	public static void method3225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg3; local3++) {
			Static250.method4000(arg0, Static478.anIntArrayArray51[local3], arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V")
	public static void method3226() {
		Static179.aClass326_15.method7241(50);
	}
}
