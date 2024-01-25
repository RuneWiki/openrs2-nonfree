import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
	public static int anInt9629 = 0;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Z")
	public static boolean aBoolean713 = true;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method8034(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static4.aBoolean5) {
			try {
				@Pc(28) Class44 local28 = (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
				local28.method6732(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static4.aBoolean5 = true;
			}
		}
		return arg0;
	}
}
