import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	public static int anInt8802 = 0;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!vg;")
	public static Class341 aClass341_20 = null;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)Lclient!gg;")
	public static Class45 method7215() {
		try {
			return new Class45_Sub1();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class45) Class.forName("Class45_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class45_Sub2();
			}
		}
	}
}
