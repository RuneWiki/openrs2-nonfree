import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt2311 = 0;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[I")
	public static final int[] anIntArray218 = new int[1000];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method2037(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static223.aBoolean613) {
			try {
				@Pc(20) Class43 local20 = (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
				local20.method1469(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static223.aBoolean613 = true;
			}
		}
		return arg0;
	}
}
