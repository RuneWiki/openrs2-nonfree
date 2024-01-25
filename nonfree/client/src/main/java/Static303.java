import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!ra;")
	public static Class170 aClass170_101;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5839;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public static int anInt5835 = 0;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public static int anInt5837 = 0;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt5838 = -1;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean433 = true;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
	public static String method5143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		if (Static134.anInterface6_1 != null) {
			@Pc(12) String local12 = Static134.anInterface6_1.method2165(arg1, arg2, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}
}
