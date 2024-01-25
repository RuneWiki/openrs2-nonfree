import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "J")
	public static long aLong110;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt3170;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public static int anInt3173;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public static int anInt3176;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method2764(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static398.aBoolean555) {
			try {
				@Pc(25) Class148 local25 = (Class148) Class.forName("oea").getDeclaredConstructor().newInstance();
				local25.method6550(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static398.aBoolean555 = true;
			}
		}
		return arg0;
	}
}
